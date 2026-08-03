package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final class zzifr {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        java.util.Arrays.fill(cArr, ' ');
    }

    static java.lang.String zza(com.google.android.gms.internal.ads.zzifp zzifpVar, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("# ");
        sb.append(str);
        zzc(zzifpVar, sb, 0);
        return sb.toString();
    }

    static void zzb(java.lang.StringBuilder sb, int i, java.lang.String str, java.lang.Object obj) {
        java.lang.String replace;
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
        zzd(i, sb);
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
        if (!(obj instanceof java.lang.String)) {
            if (obj instanceof com.google.android.gms.internal.ads.zzida) {
                sb.append(": \"");
                sb.append(com.google.android.gms.internal.ads.zzigp.zza(((com.google.android.gms.internal.ads.zzida) obj).zzA()));
                sb.append('\"');
                return;
            }
            if (obj instanceof com.google.android.gms.internal.ads.zziee) {
                sb.append(" {");
                zzc((com.google.android.gms.internal.ads.zziee) obj, sb, i + 2);
                sb.append("\n");
                zzd(i, sb);
                sb.append("}");
                return;
            }
            if (!(obj instanceof java.util.Map.Entry)) {
                sb.append(": ");
                sb.append(obj);
                return;
            }
            int i3 = i + 2;
            sb.append(" {");
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            zzb(sb, i3, com.ironsource.X3.i.W, entry.getKey());
            zzb(sb, i3, "value", entry.getValue());
            sb.append("\n");
            zzd(i, sb);
            sb.append("}");
            return;
        }
        sb.append(": \"");
        java.lang.String str2 = (java.lang.String) obj;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (int i4 = 0; i4 < str2.length(); i4++) {
            char charAt2 = str2.charAt(i4);
            if (charAt2 < ' ' || charAt2 > '~') {
                replace = com.google.android.gms.internal.ads.zzigp.zza(str2.getBytes(java.nio.charset.StandardCharsets.UTF_8));
                break;
            }
            if (charAt2 == '\"') {
                z3 = true;
            } else if (charAt2 == '\'') {
                z2 = true;
            } else if (charAt2 == '\\') {
                z = true;
            }
        }
        if (z) {
            str2 = str2.replace("\\", "\\\\");
        }
        replace = z2 ? str2.replace("'", "\\'") : str2;
        if (z3) {
            replace = replace.replace("\"", "\\\"");
        }
        sb.append(replace);
        sb.append('\"');
    }

    private static void zzc(com.google.android.gms.internal.ads.zzifp zzifpVar, java.lang.StringBuilder sb, int i) {
        int i2;
        boolean equals;
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.TreeMap treeMap = new java.util.TreeMap();
        java.lang.reflect.Method[] declaredMethods = zzifpVar.getClass().getDeclaredMethods();
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
                zzb(sb, i, substring.substring(0, substring.length() - 4), com.google.android.gms.internal.ads.zziee.zzbB(method2, zzifpVar, new java.lang.Object[0]));
            } else if (!substring.endsWith("Map") || substring.equals("Map") || (method = (java.lang.reflect.Method) entry.getValue()) == null || !method.getReturnType().equals(java.util.Map.class) || method.isAnnotationPresent(java.lang.Deprecated.class) || !java.lang.reflect.Modifier.isPublic(method.getModifiers())) {
                java.lang.String.valueOf(substring);
                if (hashSet.contains("set".concat(java.lang.String.valueOf(substring)))) {
                    if (substring.endsWith("Bytes")) {
                        java.lang.String substring2 = substring.substring(0, substring.length() - 5);
                        java.lang.String.valueOf(substring2);
                        if (treeMap.containsKey("get".concat(java.lang.String.valueOf(substring2)))) {
                        }
                    }
                    java.lang.reflect.Method method4 = (java.lang.reflect.Method) entry.getValue();
                    java.lang.String.valueOf(substring);
                    java.lang.reflect.Method method5 = (java.lang.reflect.Method) hashMap.get("has".concat(java.lang.String.valueOf(substring)));
                    if (method4 != null) {
                        java.lang.Object zzbB = com.google.android.gms.internal.ads.zziee.zzbB(method4, zzifpVar, new java.lang.Object[0]);
                        if (method5 != null) {
                            if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zziee.zzbB(method5, zzifpVar, new java.lang.Object[0])).booleanValue()) {
                            }
                            zzb(sb, i, substring, zzbB);
                        } else if (zzbB instanceof java.lang.Boolean) {
                            if (!((java.lang.Boolean) zzbB).booleanValue()) {
                            }
                            zzb(sb, i, substring, zzbB);
                        } else if (zzbB instanceof java.lang.Integer) {
                            if (((java.lang.Integer) zzbB).intValue() == 0) {
                            }
                            zzb(sb, i, substring, zzbB);
                        } else if (zzbB instanceof java.lang.Float) {
                            if (java.lang.Float.floatToRawIntBits(((java.lang.Float) zzbB).floatValue()) == 0) {
                            }
                            zzb(sb, i, substring, zzbB);
                        } else if (zzbB instanceof java.lang.Double) {
                            if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) zzbB).doubleValue()) == 0) {
                            }
                            zzb(sb, i, substring, zzbB);
                        } else {
                            if (zzbB instanceof java.lang.String) {
                                equals = zzbB.equals("");
                            } else if (zzbB instanceof com.google.android.gms.internal.ads.zzida) {
                                equals = zzbB.equals(com.google.android.gms.internal.ads.zzida.zza);
                            } else if (zzbB instanceof com.google.android.gms.internal.ads.zzifp) {
                                if (zzbB == ((com.google.android.gms.internal.ads.zzifp) zzbB).zzbw()) {
                                }
                                zzb(sb, i, substring, zzbB);
                            } else {
                                if ((zzbB instanceof java.lang.Enum) && ((java.lang.Enum) zzbB).ordinal() == 0) {
                                }
                                zzb(sb, i, substring, zzbB);
                            }
                            if (equals) {
                            }
                            zzb(sb, i, substring, zzbB);
                        }
                    }
                }
            } else {
                zzb(sb, i, substring.substring(0, substring.length() - 3), com.google.android.gms.internal.ads.zziee.zzbB(method, zzifpVar, new java.lang.Object[0]));
            }
            i2 = 3;
        }
        if (zzifpVar instanceof com.google.android.gms.internal.ads.zziea) {
            java.util.Iterator zzc = ((com.google.android.gms.internal.ads.zziea) zzifpVar).zza.zzc();
            while (zzc.hasNext()) {
                java.util.Map.Entry entry2 = (java.util.Map.Entry) zzc.next();
                int i4 = ((com.google.android.gms.internal.ads.zzieb) entry2.getKey()).zza;
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(i4).length() + 2);
                sb2.append(com.ironsource.X3.j.d);
                sb2.append(i4);
                sb2.append(com.ironsource.X3.j.e);
                zzb(sb, i, sb2.toString(), entry2.getValue());
            }
        }
        com.google.android.gms.internal.ads.zzigu zziguVar = ((com.google.android.gms.internal.ads.zziee) zzifpVar).zzt;
        if (zziguVar != null) {
            zziguVar.zzj(sb, i);
        }
    }

    private static void zzd(int i, java.lang.StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(zza, 0, i2);
            i -= i2;
        }
    }
}
