package com.google.android.gms.internal.drive;

/* loaded from: classes4.dex */
final class zzlt {
    static java.lang.String zza(com.google.android.gms.internal.drive.zzlq zzlqVar, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("# ");
        sb.append(str);
        zza(zzlqVar, sb, 0);
        return sb.toString();
    }

    private static void zza(com.google.android.gms.internal.drive.zzlq zzlqVar, java.lang.StringBuilder sb, int i) {
        boolean equals;
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        java.util.TreeSet<java.lang.String> treeSet = new java.util.TreeSet();
        for (java.lang.reflect.Method method : zzlqVar.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (java.lang.String str : treeSet) {
            java.lang.String replaceFirst = str.replaceFirst("get", "");
            if (replaceFirst.endsWith("List") && !replaceFirst.endsWith("OrBuilderList") && !replaceFirst.equals("List")) {
                java.lang.String valueOf = java.lang.String.valueOf(replaceFirst.substring(0, 1).toLowerCase());
                java.lang.String valueOf2 = java.lang.String.valueOf(replaceFirst.substring(1, replaceFirst.length() - 4));
                java.lang.String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new java.lang.String(valueOf);
                java.lang.reflect.Method method2 = (java.lang.reflect.Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(java.util.List.class)) {
                    zza(sb, i, zzo(concat), com.google.android.gms.internal.drive.zzkk.zza(method2, zzlqVar, new java.lang.Object[0]));
                }
            }
            if (replaceFirst.endsWith("Map") && !replaceFirst.equals("Map")) {
                java.lang.String valueOf3 = java.lang.String.valueOf(replaceFirst.substring(0, 1).toLowerCase());
                java.lang.String valueOf4 = java.lang.String.valueOf(replaceFirst.substring(1, replaceFirst.length() - 3));
                java.lang.String concat2 = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new java.lang.String(valueOf3);
                java.lang.reflect.Method method3 = (java.lang.reflect.Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(java.util.Map.class) && !method3.isAnnotationPresent(java.lang.Deprecated.class) && java.lang.reflect.Modifier.isPublic(method3.getModifiers())) {
                    zza(sb, i, zzo(concat2), com.google.android.gms.internal.drive.zzkk.zza(method3, zzlqVar, new java.lang.Object[0]));
                }
            }
            java.lang.String valueOf5 = java.lang.String.valueOf(replaceFirst);
            if (((java.lang.reflect.Method) hashMap2.get(valueOf5.length() != 0 ? "set".concat(valueOf5) : new java.lang.String("set"))) != null) {
                if (replaceFirst.endsWith("Bytes")) {
                    java.lang.String valueOf6 = java.lang.String.valueOf(replaceFirst.substring(0, replaceFirst.length() - 5));
                    if (!hashMap.containsKey(valueOf6.length() != 0 ? "get".concat(valueOf6) : new java.lang.String("get"))) {
                    }
                }
                java.lang.String valueOf7 = java.lang.String.valueOf(replaceFirst.substring(0, 1).toLowerCase());
                java.lang.String valueOf8 = java.lang.String.valueOf(replaceFirst.substring(1));
                java.lang.String concat3 = valueOf8.length() != 0 ? valueOf7.concat(valueOf8) : new java.lang.String(valueOf7);
                java.lang.String valueOf9 = java.lang.String.valueOf(replaceFirst);
                java.lang.reflect.Method method4 = (java.lang.reflect.Method) hashMap.get(valueOf9.length() != 0 ? "get".concat(valueOf9) : new java.lang.String("get"));
                java.lang.String valueOf10 = java.lang.String.valueOf(replaceFirst);
                java.lang.reflect.Method method5 = (java.lang.reflect.Method) hashMap.get(valueOf10.length() != 0 ? "has".concat(valueOf10) : new java.lang.String("has"));
                if (method4 != null) {
                    java.lang.Object zza = com.google.android.gms.internal.drive.zzkk.zza(method4, zzlqVar, new java.lang.Object[0]);
                    if (method5 == null) {
                        if (zza instanceof java.lang.Boolean) {
                            if (((java.lang.Boolean) zza).booleanValue()) {
                                zza(sb, i, zzo(concat3), zza);
                            }
                        } else if (zza instanceof java.lang.Integer) {
                            if (((java.lang.Integer) zza).intValue() != 0) {
                                zza(sb, i, zzo(concat3), zza);
                            }
                        } else if (zza instanceof java.lang.Float) {
                            if (((java.lang.Float) zza).floatValue() != 0.0f) {
                                zza(sb, i, zzo(concat3), zza);
                            }
                        } else if (!(zza instanceof java.lang.Double)) {
                            if (zza instanceof java.lang.String) {
                                equals = zza.equals("");
                            } else if (zza instanceof com.google.android.gms.internal.drive.zzjc) {
                                equals = zza.equals(com.google.android.gms.internal.drive.zzjc.zznq);
                            } else if (zza instanceof com.google.android.gms.internal.drive.zzlq) {
                                if (zza != ((com.google.android.gms.internal.drive.zzlq) zza).zzda()) {
                                    zza(sb, i, zzo(concat3), zza);
                                }
                            } else {
                                if ((zza instanceof java.lang.Enum) && ((java.lang.Enum) zza).ordinal() == 0) {
                                }
                                zza(sb, i, zzo(concat3), zza);
                            }
                            if (!equals) {
                                zza(sb, i, zzo(concat3), zza);
                            }
                        } else if (((java.lang.Double) zza).doubleValue() != 0.0d) {
                            zza(sb, i, zzo(concat3), zza);
                        }
                    } else if (((java.lang.Boolean) com.google.android.gms.internal.drive.zzkk.zza(method5, zzlqVar, new java.lang.Object[0])).booleanValue()) {
                        zza(sb, i, zzo(concat3), zza);
                    }
                }
            }
        }
        if (zzlqVar instanceof com.google.android.gms.internal.drive.zzkk.zzc) {
            java.util.Iterator<java.util.Map.Entry<java.lang.Object, java.lang.Object>> it = ((com.google.android.gms.internal.drive.zzkk.zzc) zzlqVar).zzrw.iterator();
            if (it.hasNext()) {
                it.next().getKey();
                throw new java.lang.NoSuchMethodError();
            }
        }
        com.google.android.gms.internal.drive.zzkk zzkkVar = (com.google.android.gms.internal.drive.zzkk) zzlqVar;
        if (zzkkVar.zzrq != null) {
            zzkkVar.zzrq.zza(sb, i);
        }
    }

    static final void zza(java.lang.StringBuilder sb, int i, java.lang.String str, java.lang.Object obj) {
        if (obj instanceof java.util.List) {
            java.util.Iterator it = ((java.util.List) obj).iterator();
            while (it.hasNext()) {
                zza(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof java.util.Map) {
            java.util.Iterator it2 = ((java.util.Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zza(sb, i, str, (java.util.Map.Entry) it2.next());
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
            sb.append(com.google.android.gms.internal.drive.zzmt.zzc(com.google.android.gms.internal.drive.zzjc.zzk((java.lang.String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof com.google.android.gms.internal.drive.zzjc) {
            sb.append(": \"");
            sb.append(com.google.android.gms.internal.drive.zzmt.zzc((com.google.android.gms.internal.drive.zzjc) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof com.google.android.gms.internal.drive.zzkk) {
            sb.append(" {");
            zza((com.google.android.gms.internal.drive.zzkk) obj, sb, i + 2);
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
            zza(sb, i4, com.ironsource.X3.i.W, entry.getKey());
            zza(sb, i4, "value", entry.getValue());
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

    private static final java.lang.String zzo(java.lang.String str) {
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
