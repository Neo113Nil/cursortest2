package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes4.dex */
final class MessageLiteToString {
    private static final java.lang.String BUILDER_LIST_SUFFIX = "OrBuilderList";
    private static final java.lang.String BYTES_SUFFIX = "Bytes";
    private static final char[] INDENT_BUFFER;
    private static final java.lang.String LIST_SUFFIX = "List";
    private static final java.lang.String MAP_SUFFIX = "Map";

    static {
        char[] cArr = new char[80];
        INDENT_BUFFER = cArr;
        java.util.Arrays.fill(cArr, ' ');
    }

    private MessageLiteToString() {
    }

    static java.lang.String toString(com.google.crypto.tink.shaded.protobuf.MessageLite messageLite, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("# ");
        sb.append(str);
        reflectivePrintWithIndent(messageLite, sb, 0);
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x015f, code lost:
    
        if (r5.containsKey(r13.toString()) == false) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void reflectivePrintWithIndent(com.google.crypto.tink.shaded.protobuf.MessageLite messageLite, java.lang.StringBuilder sb, int i) {
        int i2;
        int i3;
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.TreeMap treeMap = new java.util.TreeMap();
        java.lang.reflect.Method[] declaredMethods = messageLite.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i4 = 0;
        while (true) {
            i2 = 3;
            if (i4 >= length) {
                break;
            }
            java.lang.reflect.Method method3 = declaredMethods[i4];
            if (!java.lang.reflect.Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (java.lang.reflect.Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i4++;
        }
        for (java.util.Map.Entry entry : treeMap.entrySet()) {
            java.lang.String substring = ((java.lang.String) entry.getKey()).substring(i2);
            if (substring.endsWith(LIST_SUFFIX) && !substring.endsWith(BUILDER_LIST_SUFFIX) && !substring.equals(LIST_SUFFIX) && (method2 = (java.lang.reflect.Method) entry.getValue()) != null && method2.getReturnType().equals(java.util.List.class)) {
                printField(sb, i, substring.substring(0, substring.length() - 4), com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.invokeOrDie(method2, messageLite, new java.lang.Object[0]));
                i2 = 3;
            } else {
                if (substring.endsWith(MAP_SUFFIX) && !substring.equals(MAP_SUFFIX) && (method = (java.lang.reflect.Method) entry.getValue()) != null && method.getReturnType().equals(java.util.Map.class) && !method.isAnnotationPresent(java.lang.Deprecated.class) && java.lang.reflect.Modifier.isPublic(method.getModifiers())) {
                    i3 = 3;
                    printField(sb, i, substring.substring(0, substring.length() - 3), com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.invokeOrDie(method, messageLite, new java.lang.Object[0]));
                } else {
                    i3 = 3;
                    if (hashSet.contains("set".concat(java.lang.String.valueOf(substring)))) {
                        if (substring.endsWith(BYTES_SUFFIX)) {
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("get");
                            sb2.append(substring.substring(0, substring.length() - 5));
                        }
                        java.lang.reflect.Method method4 = (java.lang.reflect.Method) entry.getValue();
                        java.lang.reflect.Method method5 = (java.lang.reflect.Method) hashMap.get("has".concat(java.lang.String.valueOf(substring)));
                        if (method4 != null) {
                            java.lang.Object invokeOrDie = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.invokeOrDie(method4, messageLite, new java.lang.Object[0]);
                            if (method5 != null ? ((java.lang.Boolean) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.invokeOrDie(method5, messageLite, new java.lang.Object[0])).booleanValue() : !isDefaultValue(invokeOrDie)) {
                                printField(sb, i, substring, invokeOrDie);
                            }
                        }
                    }
                }
                i2 = i3;
            }
        }
        if (messageLite instanceof com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage) {
            java.util.Iterator<java.util.Map.Entry<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtensionDescriptor, java.lang.Object>> it = ((com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage) messageLite).extensions.iterator();
            while (it.hasNext()) {
                java.util.Map.Entry<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtensionDescriptor, java.lang.Object> next = it.next();
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("[");
                sb3.append(next.getKey().getNumber());
                sb3.append("]");
                printField(sb, i, sb3.toString(), next.getValue());
            }
        }
        com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite generatedMessageLite = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite) messageLite;
        if (generatedMessageLite.unknownFields != null) {
            generatedMessageLite.unknownFields.printWithIndent(sb, i);
        }
    }

    private static boolean isDefaultValue(java.lang.Object obj) {
        if (obj instanceof java.lang.Boolean) {
            return !((java.lang.Boolean) obj).booleanValue();
        }
        if (obj instanceof java.lang.Integer) {
            return ((java.lang.Integer) obj).intValue() == 0;
        }
        if (obj instanceof java.lang.Float) {
            return java.lang.Float.floatToRawIntBits(((java.lang.Float) obj).floatValue()) == 0;
        }
        if (obj instanceof java.lang.Double) {
            return java.lang.Double.doubleToRawLongBits(((java.lang.Double) obj).doubleValue()) == 0;
        }
        if (obj instanceof java.lang.String) {
            return obj.equals("");
        }
        if (obj instanceof com.google.crypto.tink.shaded.protobuf.ByteString) {
            return obj.equals(com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY);
        }
        return obj instanceof com.google.crypto.tink.shaded.protobuf.MessageLite ? obj == ((com.google.crypto.tink.shaded.protobuf.MessageLite) obj).getDefaultInstanceForType() : (obj instanceof java.lang.Enum) && ((java.lang.Enum) obj).ordinal() == 0;
    }

    static void printField(java.lang.StringBuilder sb, int i, java.lang.String str, java.lang.Object obj) {
        if (obj instanceof java.util.List) {
            java.util.Iterator it = ((java.util.List) obj).iterator();
            while (it.hasNext()) {
                printField(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof java.util.Map) {
            java.util.Iterator it2 = ((java.util.Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                printField(sb, i, str, (java.util.Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        indent(i, sb);
        sb.append(pascalCaseToSnakeCase(str));
        if (obj instanceof java.lang.String) {
            sb.append(": \"");
            sb.append(com.google.crypto.tink.shaded.protobuf.TextFormatEscaper.escapeText((java.lang.String) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof com.google.crypto.tink.shaded.protobuf.ByteString) {
            sb.append(": \"");
            sb.append(com.google.crypto.tink.shaded.protobuf.TextFormatEscaper.escapeBytes((com.google.crypto.tink.shaded.protobuf.ByteString) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite) {
            sb.append(" {");
            reflectivePrintWithIndent((com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite) obj, sb, i + 2);
            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
            indent(i, sb);
            sb.append("}");
            return;
        }
        if (obj instanceof java.util.Map.Entry) {
            sb.append(" {");
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            int i2 = i + 2;
            printField(sb, i2, "key", entry.getKey());
            printField(sb, i2, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, entry.getValue());
            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
            indent(i, sb);
            sb.append("}");
            return;
        }
        sb.append(": ");
        sb.append(obj);
    }

    private static void indent(int i, java.lang.StringBuilder sb) {
        while (i > 0) {
            char[] cArr = INDENT_BUFFER;
            int length = i > cArr.length ? cArr.length : i;
            sb.append(cArr, 0, length);
            i -= length;
        }
    }

    private static java.lang.String pascalCaseToSnakeCase(java.lang.String str) {
        if (str.isEmpty()) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(java.lang.Character.toLowerCase(str.charAt(0)));
        for (int i = 1; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (java.lang.Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(java.lang.Character.toLowerCase(charAt));
        }
        return sb.toString();
    }
}
