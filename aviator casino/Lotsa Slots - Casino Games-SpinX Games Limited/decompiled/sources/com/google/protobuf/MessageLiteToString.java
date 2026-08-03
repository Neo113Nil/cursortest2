package com.google.protobuf;

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

    static java.lang.String toString(com.google.protobuf.MessageLite messageLite, java.lang.String commentString) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("# ");
        sb.append(commentString);
        reflectivePrintWithIndent(messageLite, sb, 0);
        return sb.toString();
    }

    private static void reflectivePrintWithIndent(com.google.protobuf.MessageLite messageLite, java.lang.StringBuilder buffer, int indent) {
        int i;
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.TreeMap treeMap = new java.util.TreeMap();
        java.lang.reflect.Method[] declaredMethods = messageLite.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i2 = 0;
        while (true) {
            i = 3;
            if (i2 >= length) {
                break;
            }
            java.lang.reflect.Method method3 = declaredMethods[i2];
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
            i2++;
        }
        for (java.util.Map.Entry entry : treeMap.entrySet()) {
            java.lang.String substring = ((java.lang.String) entry.getKey()).substring(i);
            if (substring.endsWith(LIST_SUFFIX) && !substring.endsWith(BUILDER_LIST_SUFFIX) && !substring.equals(LIST_SUFFIX) && (method2 = (java.lang.reflect.Method) entry.getValue()) != null && method2.getReturnType().equals(java.util.List.class)) {
                printField(buffer, indent, substring.substring(0, substring.length() - 4), com.google.protobuf.GeneratedMessageLite.invokeOrDie(method2, messageLite, new java.lang.Object[0]));
            } else if (substring.endsWith(MAP_SUFFIX) && !substring.equals(MAP_SUFFIX) && (method = (java.lang.reflect.Method) entry.getValue()) != null && method.getReturnType().equals(java.util.Map.class) && !method.isAnnotationPresent(java.lang.Deprecated.class) && java.lang.reflect.Modifier.isPublic(method.getModifiers())) {
                printField(buffer, indent, substring.substring(0, substring.length() - 3), com.google.protobuf.GeneratedMessageLite.invokeOrDie(method, messageLite, new java.lang.Object[0]));
            } else {
                if (hashSet.contains("set" + substring)) {
                    if (substring.endsWith(BYTES_SUFFIX)) {
                        if (treeMap.containsKey("get" + substring.substring(0, substring.length() - 5))) {
                        }
                    }
                    java.lang.reflect.Method method4 = (java.lang.reflect.Method) entry.getValue();
                    java.lang.reflect.Method method5 = (java.lang.reflect.Method) hashMap.get("has" + substring);
                    if (method4 != null) {
                        java.lang.Object invokeOrDie = com.google.protobuf.GeneratedMessageLite.invokeOrDie(method4, messageLite, new java.lang.Object[0]);
                        if (method5 == null) {
                            if (isDefaultValue(invokeOrDie)) {
                            }
                            printField(buffer, indent, substring, invokeOrDie);
                        } else {
                            if (!((java.lang.Boolean) com.google.protobuf.GeneratedMessageLite.invokeOrDie(method5, messageLite, new java.lang.Object[0])).booleanValue()) {
                            }
                            printField(buffer, indent, substring, invokeOrDie);
                        }
                    }
                }
            }
            i = 3;
        }
        if (messageLite instanceof com.google.protobuf.GeneratedMessageLite.ExtendableMessage) {
            java.util.Iterator<java.util.Map.Entry<com.google.protobuf.GeneratedMessageLite.ExtensionDescriptor, java.lang.Object>> it = ((com.google.protobuf.GeneratedMessageLite.ExtendableMessage) messageLite).extensions.iterator();
            while (it.hasNext()) {
                java.util.Map.Entry<com.google.protobuf.GeneratedMessageLite.ExtensionDescriptor, java.lang.Object> next = it.next();
                printField(buffer, indent, com.ironsource.X3.j.d + next.getKey().getNumber() + com.ironsource.X3.j.e, next.getValue());
            }
        }
        com.google.protobuf.GeneratedMessageLite generatedMessageLite = (com.google.protobuf.GeneratedMessageLite) messageLite;
        if (generatedMessageLite.unknownFields != null) {
            generatedMessageLite.unknownFields.printWithIndent(buffer, indent);
        }
    }

    private static boolean isDefaultValue(java.lang.Object o) {
        if (o instanceof java.lang.Boolean) {
            return !((java.lang.Boolean) o).booleanValue();
        }
        if (o instanceof java.lang.Integer) {
            return ((java.lang.Integer) o).intValue() == 0;
        }
        if (o instanceof java.lang.Float) {
            return java.lang.Float.floatToRawIntBits(((java.lang.Float) o).floatValue()) == 0;
        }
        if (o instanceof java.lang.Double) {
            return java.lang.Double.doubleToRawLongBits(((java.lang.Double) o).doubleValue()) == 0;
        }
        if (o instanceof java.lang.String) {
            return o.equals("");
        }
        if (o instanceof com.google.protobuf.ByteString) {
            return o.equals(com.google.protobuf.ByteString.EMPTY);
        }
        return o instanceof com.google.protobuf.MessageLite ? o == ((com.google.protobuf.MessageLite) o).getDefaultInstanceForType() : (o instanceof java.lang.Enum) && ((java.lang.Enum) o).ordinal() == 0;
    }

    static void printField(java.lang.StringBuilder buffer, int indent, java.lang.String name, java.lang.Object object) {
        if (object instanceof java.util.List) {
            java.util.Iterator it = ((java.util.List) object).iterator();
            while (it.hasNext()) {
                printField(buffer, indent, name, it.next());
            }
            return;
        }
        if (object instanceof java.util.Map) {
            java.util.Iterator it2 = ((java.util.Map) object).entrySet().iterator();
            while (it2.hasNext()) {
                printField(buffer, indent, name, (java.util.Map.Entry) it2.next());
            }
            return;
        }
        buffer.append('\n');
        indent(indent, buffer);
        buffer.append(pascalCaseToSnakeCase(name));
        if (object instanceof java.lang.String) {
            buffer.append(": \"");
            buffer.append(com.google.protobuf.TextFormatEscaper.escapeText((java.lang.String) object));
            buffer.append('\"');
            return;
        }
        if (object instanceof com.google.protobuf.ByteString) {
            buffer.append(": \"");
            buffer.append(com.google.protobuf.TextFormatEscaper.escapeBytes((com.google.protobuf.ByteString) object));
            buffer.append('\"');
            return;
        }
        if (object instanceof com.google.protobuf.GeneratedMessageLite) {
            buffer.append(" {");
            reflectivePrintWithIndent((com.google.protobuf.GeneratedMessageLite) object, buffer, indent + 2);
            buffer.append("\n");
            indent(indent, buffer);
            buffer.append("}");
            return;
        }
        if (object instanceof java.util.Map.Entry) {
            buffer.append(" {");
            java.util.Map.Entry entry = (java.util.Map.Entry) object;
            int i = indent + 2;
            printField(buffer, i, com.ironsource.X3.i.W, entry.getKey());
            printField(buffer, i, "value", entry.getValue());
            buffer.append("\n");
            indent(indent, buffer);
            buffer.append("}");
            return;
        }
        buffer.append(": ");
        buffer.append(object);
    }

    private static void indent(int indent, java.lang.StringBuilder buffer) {
        while (indent > 0) {
            char[] cArr = INDENT_BUFFER;
            int length = indent > cArr.length ? cArr.length : indent;
            buffer.append(cArr, 0, length);
            indent -= length;
        }
    }

    private static java.lang.String pascalCaseToSnakeCase(java.lang.String pascalCase) {
        if (pascalCase.isEmpty()) {
            return pascalCase;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(java.lang.Character.toLowerCase(pascalCase.charAt(0)));
        for (int i = 1; i < pascalCase.length(); i++) {
            char charAt = pascalCase.charAt(i);
            if (java.lang.Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(java.lang.Character.toLowerCase(charAt));
        }
        return sb.toString();
    }
}
