package io.appmetrica.analytics.protobuf.nano;

/* loaded from: classes.dex */
public final class MessageNanoPrinter {
    private static final java.lang.String INDENT = "  ";
    private static final int MAX_STRING_LEN = 200;

    private MessageNanoPrinter() {
    }

    private static void appendQuotedBytes(byte[] bArr, java.lang.StringBuffer stringBuffer) {
        if (bArr == null) {
            stringBuffer.append("\"\"");
            return;
        }
        stringBuffer.append('\"');
        for (byte b2 : bArr) {
            int i2 = b2 & 255;
            if (i2 == 92 || i2 == 34) {
                stringBuffer.append('\\');
                stringBuffer.append((char) i2);
            } else if (i2 < 32 || i2 >= 127) {
                stringBuffer.append(java.lang.String.format("\\%03o", java.lang.Integer.valueOf(i2)));
            } else {
                stringBuffer.append((char) i2);
            }
        }
        stringBuffer.append('\"');
    }

    private static java.lang.String deCamelCaseify(java.lang.String str) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (i2 == 0) {
                stringBuffer.append(java.lang.Character.toLowerCase(charAt));
            } else if (java.lang.Character.isUpperCase(charAt)) {
                stringBuffer.append('_');
                stringBuffer.append(java.lang.Character.toLowerCase(charAt));
            } else {
                stringBuffer.append(charAt);
            }
        }
        return stringBuffer.toString();
    }

    private static java.lang.String escapeString(java.lang.String str) {
        int length = str.length();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length);
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt < ' ' || charAt > '~' || charAt == '\"' || charAt == '\'') {
                sb.append(java.lang.String.format("\\u%04x", java.lang.Integer.valueOf(charAt)));
            } else {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    public static <T extends io.appmetrica.analytics.protobuf.nano.MessageNano> java.lang.String print(T t) {
        if (t == null) {
            return "";
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        try {
            print(null, t, new java.lang.StringBuffer(), stringBuffer);
            return stringBuffer.toString();
        } catch (java.lang.IllegalAccessException e2) {
            return "Error printing proto: " + e2.getMessage();
        } catch (java.lang.reflect.InvocationTargetException e3) {
            return "Error printing proto: " + e3.getMessage();
        }
    }

    private static java.lang.String sanitizeString(java.lang.String str) {
        if (!str.startsWith("http") && str.length() > MAX_STRING_LEN) {
            str = str.substring(0, MAX_STRING_LEN) + "[...]";
        }
        return escapeString(str);
    }

    private static void print(java.lang.String str, java.lang.Object obj, java.lang.StringBuffer stringBuffer, java.lang.StringBuffer stringBuffer2) {
        if (obj == null) {
            return;
        }
        if (obj instanceof io.appmetrica.analytics.protobuf.nano.MessageNano) {
            int length = stringBuffer.length();
            if (str != null) {
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(deCamelCaseify(str));
                stringBuffer2.append(" <\n");
                stringBuffer.append(INDENT);
            }
            java.lang.Class<?> cls = obj.getClass();
            for (java.lang.reflect.Field field : cls.getFields()) {
                int modifiers = field.getModifiers();
                java.lang.String name = field.getName();
                if (!"cachedSize".equals(name) && (modifiers & 1) == 1 && (modifiers & 8) != 8 && !name.startsWith("_") && !name.endsWith("_")) {
                    java.lang.Class<?> type = field.getType();
                    java.lang.Object obj2 = field.get(obj);
                    if (type.isArray()) {
                        if (type.getComponentType() == java.lang.Byte.TYPE) {
                            print(name, obj2, stringBuffer, stringBuffer2);
                        } else {
                            int length2 = obj2 == null ? 0 : java.lang.reflect.Array.getLength(obj2);
                            for (int i2 = 0; i2 < length2; i2++) {
                                print(name, java.lang.reflect.Array.get(obj2, i2), stringBuffer, stringBuffer2);
                            }
                        }
                    } else {
                        print(name, obj2, stringBuffer, stringBuffer2);
                    }
                }
            }
            for (java.lang.reflect.Method method : cls.getMethods()) {
                java.lang.String name2 = method.getName();
                if (name2.startsWith("set")) {
                    java.lang.String substring = name2.substring(3);
                    try {
                        if (((java.lang.Boolean) cls.getMethod("has" + substring, null).invoke(obj, null)).booleanValue()) {
                            print(substring, cls.getMethod("get" + substring, null).invoke(obj, null), stringBuffer, stringBuffer2);
                        }
                    } catch (java.lang.NoSuchMethodException unused) {
                    }
                }
            }
            if (str != null) {
                stringBuffer.setLength(length);
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(">\n");
                return;
            }
            return;
        }
        if (obj instanceof java.util.Map) {
            java.lang.String deCamelCaseify = deCamelCaseify(str);
            for (java.util.Map.Entry entry : ((java.util.Map) obj).entrySet()) {
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(deCamelCaseify);
                stringBuffer2.append(" <\n");
                int length3 = stringBuffer.length();
                stringBuffer.append(INDENT);
                print("key", entry.getKey(), stringBuffer, stringBuffer2);
                print("value", entry.getValue(), stringBuffer, stringBuffer2);
                stringBuffer.setLength(length3);
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(">\n");
            }
            return;
        }
        java.lang.String deCamelCaseify2 = deCamelCaseify(str);
        stringBuffer2.append(stringBuffer);
        stringBuffer2.append(deCamelCaseify2);
        stringBuffer2.append(": ");
        if (obj instanceof java.lang.String) {
            java.lang.String sanitizeString = sanitizeString((java.lang.String) obj);
            stringBuffer2.append("\"");
            stringBuffer2.append(sanitizeString);
            stringBuffer2.append("\"");
        } else if (obj instanceof byte[]) {
            appendQuotedBytes((byte[]) obj, stringBuffer2);
        } else {
            stringBuffer2.append(obj);
        }
        stringBuffer2.append("\n");
    }
}
