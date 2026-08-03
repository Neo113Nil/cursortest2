package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes4.dex */
final class zzfz {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        java.util.Arrays.fill(cArr, ' ');
    }

    static java.lang.String zza(com.google.android.gms.internal.auth.zzfx zzfxVar, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("# ");
        sb.append(str);
        zzd(zzfxVar, sb, 0);
        return sb.toString();
    }

    static void zzb(java.lang.StringBuilder sb, int i, java.lang.String str, java.lang.Object obj) {
        if (obj instanceof java.util.List) {
            java.util.Iterator it = ((java.util.List) obj).iterator();
            while (it.hasNext()) {
                zzb(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof java.util.Map) {
            java.util.Iterator it2 = ((java.util.Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzb(sb, i, str, (java.util.Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        zzc(i, sb);
        if (!str.isEmpty()) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(java.lang.Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char charAt = str.charAt(i2);
                if (java.lang.Character.isUpperCase(charAt)) {
                    sb2.append("_");
                }
                sb2.append(java.lang.Character.toLowerCase(charAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof java.lang.String) {
            sb.append(": \"");
            sb.append(com.google.android.gms.internal.auth.zzgx.zza(new com.google.android.gms.internal.auth.zzec(((java.lang.String) obj).getBytes(com.google.android.gms.internal.auth.zzfa.zzb))));
            sb.append('\"');
            return;
        }
        if (obj instanceof com.google.android.gms.internal.auth.zzef) {
            sb.append(": \"");
            sb.append(com.google.android.gms.internal.auth.zzgx.zza((com.google.android.gms.internal.auth.zzef) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof com.google.android.gms.internal.auth.zzev) {
            sb.append(" {");
            zzd((com.google.android.gms.internal.auth.zzev) obj, sb, i + 2);
            sb.append("\n");
            zzc(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof java.util.Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        int i3 = i + 2;
        zzb(sb, i3, com.ironsource.X3.i.W, entry.getKey());
        zzb(sb, i3, "value", entry.getValue());
        sb.append("\n");
        zzc(i, sb);
        sb.append("}");
    }

    private static void zzc(int i, java.lang.StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(zza, 0, i2);
            i -= i2;
        }
    }

    private static void zzd(com.google.android.gms.internal.auth.zzfx zzfxVar, java.lang.StringBuilder sb, int i) {
        int i2;
        boolean equals;
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.TreeMap treeMap = new java.util.TreeMap();
        java.lang.reflect.Method[] declaredMethods = zzfxVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i3 = 0;
        while (true) {
            i2 = 3;
            if (i3 >= length) {
                break;
            }
            java.lang.reflect.Method method3 = declaredMethods[i3];
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
            i3++;
        }
        for (java.util.Map.Entry entry : treeMap.entrySet()) {
            java.lang.String substring = ((java.lang.String) entry.getKey()).substring(i2);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (java.lang.reflect.Method) entry.getValue()) != null && method2.getReturnType().equals(java.util.List.class)) {
                zzb(sb, i, substring.substring(0, substring.length() - 4), com.google.android.gms.internal.auth.zzev.zzg(method2, zzfxVar, new java.lang.Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (java.lang.reflect.Method) entry.getValue()) != null && method.getReturnType().equals(java.util.Map.class) && !method.isAnnotationPresent(java.lang.Deprecated.class) && java.lang.reflect.Modifier.isPublic(method.getModifiers())) {
                zzb(sb, i, substring.substring(0, substring.length() - 3), com.google.android.gms.internal.auth.zzev.zzg(method, zzfxVar, new java.lang.Object[0]));
            } else if (hashSet.contains("set".concat(java.lang.String.valueOf(substring))) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(java.lang.String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                java.lang.reflect.Method method4 = (java.lang.reflect.Method) entry.getValue();
                java.lang.reflect.Method method5 = (java.lang.reflect.Method) hashMap.get("has".concat(java.lang.String.valueOf(substring)));
                if (method4 != null) {
                    java.lang.Object zzg = com.google.android.gms.internal.auth.zzev.zzg(method4, zzfxVar, new java.lang.Object[0]);
                    if (method5 != null) {
                        if (!((java.lang.Boolean) com.google.android.gms.internal.auth.zzev.zzg(method5, zzfxVar, new java.lang.Object[0])).booleanValue()) {
                        }
                        zzb(sb, i, substring, zzg);
                    } else if (zzg instanceof java.lang.Boolean) {
                        if (!((java.lang.Boolean) zzg).booleanValue()) {
                        }
                        zzb(sb, i, substring, zzg);
                    } else if (zzg instanceof java.lang.Integer) {
                        if (((java.lang.Integer) zzg).intValue() == 0) {
                        }
                        zzb(sb, i, substring, zzg);
                    } else if (zzg instanceof java.lang.Float) {
                        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) zzg).floatValue()) == 0) {
                        }
                        zzb(sb, i, substring, zzg);
                    } else if (zzg instanceof java.lang.Double) {
                        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) zzg).doubleValue()) == 0) {
                        }
                        zzb(sb, i, substring, zzg);
                    } else {
                        if (zzg instanceof java.lang.String) {
                            equals = zzg.equals("");
                        } else if (zzg instanceof com.google.android.gms.internal.auth.zzef) {
                            equals = zzg.equals(com.google.android.gms.internal.auth.zzef.zzb);
                        } else if (zzg instanceof com.google.android.gms.internal.auth.zzfx) {
                            if (zzg == ((com.google.android.gms.internal.auth.zzfx) zzg).zze()) {
                            }
                            zzb(sb, i, substring, zzg);
                        } else {
                            if ((zzg instanceof java.lang.Enum) && ((java.lang.Enum) zzg).ordinal() == 0) {
                            }
                            zzb(sb, i, substring, zzg);
                        }
                        if (equals) {
                        }
                        zzb(sb, i, substring, zzg);
                    }
                }
            }
            i2 = 3;
        }
        if (zzfxVar instanceof com.google.android.gms.internal.auth.zzeu) {
            com.google.android.gms.internal.auth.zzeq zzeqVar = ((com.google.android.gms.internal.auth.zzeu) zzfxVar).zzb;
            throw null;
        }
        com.google.android.gms.internal.auth.zzha zzhaVar = ((com.google.android.gms.internal.auth.zzev) zzfxVar).zzc;
        if (zzhaVar != null) {
            zzhaVar.zzg(sb, i);
        }
    }
}
