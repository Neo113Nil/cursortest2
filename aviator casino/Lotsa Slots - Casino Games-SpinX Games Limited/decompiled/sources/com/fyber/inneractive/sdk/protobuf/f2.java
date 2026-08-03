package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes3.dex */
public abstract class f2 {
    public static void a(com.fyber.inneractive.sdk.protobuf.d2 d2Var, java.lang.StringBuilder sb, int i) {
        boolean z;
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        java.util.TreeSet treeSet = new java.util.TreeSet();
        for (java.lang.reflect.Method method : d2Var.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        java.util.Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            java.lang.String substring = str.startsWith("get") ? str.substring(3) : str;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                java.lang.String str2 = substring.substring(0, 1).toLowerCase() + substring.substring(1, substring.length() - 4);
                java.lang.reflect.Method method2 = (java.lang.reflect.Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(java.util.List.class)) {
                    a(sb, i, a(str2), com.fyber.inneractive.sdk.protobuf.z0.invokeOrDie(method2, d2Var, new java.lang.Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                java.lang.String str3 = substring.substring(0, 1).toLowerCase() + substring.substring(1, substring.length() - 3);
                java.lang.reflect.Method method3 = (java.lang.reflect.Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(java.util.Map.class) && !method3.isAnnotationPresent(java.lang.Deprecated.class) && java.lang.reflect.Modifier.isPublic(method3.getModifiers())) {
                    a(sb, i, a(str3), com.fyber.inneractive.sdk.protobuf.z0.invokeOrDie(method3, d2Var, new java.lang.Object[0]));
                }
            }
            if (((java.lang.reflect.Method) hashMap2.get("set".concat(substring))) != null) {
                if (substring.endsWith("Bytes")) {
                    if (hashMap.containsKey("get" + substring.substring(0, substring.length() - 5))) {
                    }
                }
                java.lang.String str4 = substring.substring(0, 1).toLowerCase() + substring.substring(1);
                java.lang.reflect.Method method4 = (java.lang.reflect.Method) hashMap.get("get".concat(substring));
                java.lang.reflect.Method method5 = (java.lang.reflect.Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    java.lang.Object invokeOrDie = com.fyber.inneractive.sdk.protobuf.z0.invokeOrDie(method4, d2Var, new java.lang.Object[0]);
                    if (method5 == null) {
                        if (invokeOrDie instanceof java.lang.Boolean) {
                            z = !((java.lang.Boolean) invokeOrDie).booleanValue();
                        } else if (invokeOrDie instanceof java.lang.Integer) {
                            if (((java.lang.Integer) invokeOrDie).intValue() != 0) {
                                a(sb, i, a(str4), invokeOrDie);
                            }
                        } else if (invokeOrDie instanceof java.lang.Float) {
                            if (((java.lang.Float) invokeOrDie).floatValue() != 0.0f) {
                                a(sb, i, a(str4), invokeOrDie);
                            }
                        } else if (invokeOrDie instanceof java.lang.Double) {
                            if (((java.lang.Double) invokeOrDie).doubleValue() != 0.0d) {
                                a(sb, i, a(str4), invokeOrDie);
                            }
                        } else if (invokeOrDie instanceof java.lang.String) {
                            z = invokeOrDie.equals("");
                        } else if (invokeOrDie instanceof com.fyber.inneractive.sdk.protobuf.s) {
                            z = invokeOrDie.equals(com.fyber.inneractive.sdk.protobuf.s.b);
                        } else if (!(invokeOrDie instanceof com.fyber.inneractive.sdk.protobuf.d2)) {
                            if ((invokeOrDie instanceof java.lang.Enum) && ((java.lang.Enum) invokeOrDie).ordinal() == 0) {
                            }
                            a(sb, i, a(str4), invokeOrDie);
                        } else if (invokeOrDie != ((com.fyber.inneractive.sdk.protobuf.d2) invokeOrDie).getDefaultInstanceForType()) {
                            a(sb, i, a(str4), invokeOrDie);
                        }
                        if (!z) {
                            a(sb, i, a(str4), invokeOrDie);
                        }
                    } else if (((java.lang.Boolean) com.fyber.inneractive.sdk.protobuf.z0.invokeOrDie(method5, d2Var, new java.lang.Object[0])).booleanValue()) {
                        a(sb, i, a(str4), invokeOrDie);
                    }
                }
            }
        }
        if (d2Var instanceof com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$ExtendableMessage) {
            java.util.Iterator d = ((com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$ExtendableMessage) d2Var).extensions.d();
            while (d.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) d.next();
                a(sb, i, com.ironsource.X3.j.d + ((com.fyber.inneractive.sdk.protobuf.w0) entry.getKey()).b + com.ironsource.X3.j.e, entry.getValue());
            }
        }
        com.fyber.inneractive.sdk.protobuf.n3 n3Var = ((com.fyber.inneractive.sdk.protobuf.z0) d2Var).unknownFields;
        if (n3Var != null) {
            for (int i2 = 0; i2 < n3Var.f4208a; i2++) {
                a(sb, i, java.lang.String.valueOf(n3Var.b[i2] >>> 3), n3Var.c[i2]);
            }
        }
    }

    public static final void a(java.lang.StringBuilder sb, int i, java.lang.String str, java.lang.Object obj) {
        if (obj instanceof java.util.List) {
            java.util.Iterator it = ((java.util.List) obj).iterator();
            while (it.hasNext()) {
                a(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof java.util.Map) {
            java.util.Iterator it2 = ((java.util.Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                a(sb, i, str, (java.util.Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof java.lang.String) {
            sb.append(": \"");
            sb.append(com.fyber.inneractive.sdk.protobuf.h3.a(com.fyber.inneractive.sdk.protobuf.s.a((java.lang.String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof com.fyber.inneractive.sdk.protobuf.s) {
            sb.append(": \"");
            sb.append(com.fyber.inneractive.sdk.protobuf.h3.a((com.fyber.inneractive.sdk.protobuf.s) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof com.fyber.inneractive.sdk.protobuf.z0) {
            sb.append(" {");
            a((com.fyber.inneractive.sdk.protobuf.z0) obj, sb, i + 2);
            sb.append("\n");
            while (i2 < i) {
                sb.append(' ');
                i2++;
            }
            sb.append("}");
            return;
        }
        if (obj instanceof java.util.Map.Entry) {
            sb.append(" {");
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            int i4 = i + 2;
            a(sb, i4, com.ironsource.X3.i.W, entry.getKey());
            a(sb, i4, "value", entry.getValue());
            sb.append("\n");
            while (i2 < i) {
                sb.append(' ');
                i2++;
            }
            sb.append("}");
            return;
        }
        sb.append(": ");
        sb.append(obj.toString());
    }

    public static final java.lang.String a(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (java.lang.Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(java.lang.Character.toLowerCase(charAt));
        }
        return sb.toString();
    }
}
