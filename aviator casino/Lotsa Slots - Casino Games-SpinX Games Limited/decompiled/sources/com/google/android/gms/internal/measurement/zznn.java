package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* loaded from: classes4.dex */
final class zznn {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        java.util.Arrays.fill(cArr, ' ');
    }

    static java.lang.String zza(com.google.android.gms.internal.measurement.zznl zznlVar, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("# ");
        sb.append(str);
        zzc(zznlVar, sb, 0);
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
        if (obj instanceof java.lang.String) {
            sb.append(": \"");
            com.google.android.gms.internal.measurement.zzlg zzlgVar = com.google.android.gms.internal.measurement.zzlg.zzb;
            sb.append(com.google.android.gms.internal.measurement.zzof.zza(new com.google.android.gms.internal.measurement.zzlf(((java.lang.String) obj).getBytes(com.google.android.gms.internal.measurement.zzmo.zza))));
            sb.append('\"');
            return;
        }
        if (obj instanceof com.google.android.gms.internal.measurement.zzlg) {
            sb.append(": \"");
            sb.append(com.google.android.gms.internal.measurement.zzof.zza((com.google.android.gms.internal.measurement.zzlg) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof com.google.android.gms.internal.measurement.zzme) {
            sb.append(" {");
            zzc((com.google.android.gms.internal.measurement.zzme) obj, sb, i + 2);
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
    }

    private static void zzc(com.google.android.gms.internal.measurement.zznl zznlVar, java.lang.StringBuilder sb, int i) {
        int i2;
        boolean equals;
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.TreeMap treeMap = new java.util.TreeMap();
        java.lang.reflect.Method[] declaredMethods = zznlVar.getClass().getDeclaredMethods();
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
                zzb(sb, i, substring.substring(0, substring.length() - 4), com.google.android.gms.internal.measurement.zzme.zzcr(method2, zznlVar, new java.lang.Object[0]));
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
                        java.lang.Object zzcr = com.google.android.gms.internal.measurement.zzme.zzcr(method4, zznlVar, new java.lang.Object[0]);
                        if (method5 != null) {
                            if (!((java.lang.Boolean) com.google.android.gms.internal.measurement.zzme.zzcr(method5, zznlVar, new java.lang.Object[0])).booleanValue()) {
                            }
                            zzb(sb, i, substring, zzcr);
                        } else if (zzcr instanceof java.lang.Boolean) {
                            if (!((java.lang.Boolean) zzcr).booleanValue()) {
                            }
                            zzb(sb, i, substring, zzcr);
                        } else if (zzcr instanceof java.lang.Integer) {
                            if (((java.lang.Integer) zzcr).intValue() == 0) {
                            }
                            zzb(sb, i, substring, zzcr);
                        } else if (zzcr instanceof java.lang.Float) {
                            if (java.lang.Float.floatToRawIntBits(((java.lang.Float) zzcr).floatValue()) == 0) {
                            }
                            zzb(sb, i, substring, zzcr);
                        } else if (zzcr instanceof java.lang.Double) {
                            if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) zzcr).doubleValue()) == 0) {
                            }
                            zzb(sb, i, substring, zzcr);
                        } else {
                            if (zzcr instanceof java.lang.String) {
                                equals = zzcr.equals("");
                            } else if (zzcr instanceof com.google.android.gms.internal.measurement.zzlg) {
                                equals = zzcr.equals(com.google.android.gms.internal.measurement.zzlg.zzb);
                            } else if (zzcr instanceof com.google.android.gms.internal.measurement.zznl) {
                                if (zzcr == ((com.google.android.gms.internal.measurement.zznl) zzcr).zzcE()) {
                                }
                                zzb(sb, i, substring, zzcr);
                            } else {
                                if ((zzcr instanceof java.lang.Enum) && ((java.lang.Enum) zzcr).ordinal() == 0) {
                                }
                                zzb(sb, i, substring, zzcr);
                            }
                            if (equals) {
                            }
                            zzb(sb, i, substring, zzcr);
                        }
                    }
                }
            } else {
                zzb(sb, i, substring.substring(0, substring.length() - 3), com.google.android.gms.internal.measurement.zzme.zzcr(method, zznlVar, new java.lang.Object[0]));
            }
            i2 = 3;
        }
        if (zznlVar instanceof com.google.android.gms.internal.measurement.zzmb) {
            java.util.Iterator zzc = ((com.google.android.gms.internal.measurement.zzmb) zznlVar).zzb.zzc();
            if (zzc.hasNext()) {
                throw null;
            }
        }
        com.google.android.gms.internal.measurement.zzoi zzoiVar = ((com.google.android.gms.internal.measurement.zzme) zznlVar).zzc;
        if (zzoiVar != null) {
            zzoiVar.zzj(sb, i);
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
