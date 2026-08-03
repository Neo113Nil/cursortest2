package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
final class zzee {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        java.util.Arrays.fill(cArr, ' ');
    }

    static java.lang.String zza(com.google.android.gms.internal.play_billing.zzec zzecVar, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("# ");
        sb.append(str);
        zzd(zzecVar, sb, 0);
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
            sb.append(com.google.android.gms.internal.play_billing.zzfd.zza(new com.google.android.gms.internal.play_billing.zzbn(((java.lang.String) obj).getBytes(com.google.android.gms.internal.play_billing.zzda.zzb))));
            sb.append('\"');
            return;
        }
        if (obj instanceof com.google.android.gms.internal.play_billing.zzbq) {
            sb.append(": \"");
            sb.append(com.google.android.gms.internal.play_billing.zzfd.zza((com.google.android.gms.internal.play_billing.zzbq) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof com.google.android.gms.internal.play_billing.zzcs) {
            sb.append(" {");
            zzd((com.google.android.gms.internal.play_billing.zzcs) obj, sb, i + 2);
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
        int i3 = i + 2;
        sb.append(" {");
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
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

    private static void zzd(com.google.android.gms.internal.play_billing.zzec zzecVar, java.lang.StringBuilder sb, int i) {
        int i2;
        boolean equals;
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.TreeMap treeMap = new java.util.TreeMap();
        java.lang.reflect.Method[] declaredMethods = zzecVar.getClass().getDeclaredMethods();
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
                zzb(sb, i, substring.substring(0, substring.length() - 4), com.google.android.gms.internal.play_billing.zzcs.zzp(method2, zzecVar, new java.lang.Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (java.lang.reflect.Method) entry.getValue()) != null && method.getReturnType().equals(java.util.Map.class) && !method.isAnnotationPresent(java.lang.Deprecated.class) && java.lang.reflect.Modifier.isPublic(method.getModifiers())) {
                zzb(sb, i, substring.substring(0, substring.length() - 3), com.google.android.gms.internal.play_billing.zzcs.zzp(method, zzecVar, new java.lang.Object[0]));
            } else if (hashSet.contains("set".concat(java.lang.String.valueOf(substring))) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(java.lang.String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                java.lang.reflect.Method method4 = (java.lang.reflect.Method) entry.getValue();
                java.lang.reflect.Method method5 = (java.lang.reflect.Method) hashMap.get("has".concat(java.lang.String.valueOf(substring)));
                if (method4 != null) {
                    java.lang.Object zzp = com.google.android.gms.internal.play_billing.zzcs.zzp(method4, zzecVar, new java.lang.Object[0]);
                    if (method5 != null) {
                        if (!((java.lang.Boolean) com.google.android.gms.internal.play_billing.zzcs.zzp(method5, zzecVar, new java.lang.Object[0])).booleanValue()) {
                        }
                        zzb(sb, i, substring, zzp);
                    } else if (zzp instanceof java.lang.Boolean) {
                        if (!((java.lang.Boolean) zzp).booleanValue()) {
                        }
                        zzb(sb, i, substring, zzp);
                    } else if (zzp instanceof java.lang.Integer) {
                        if (((java.lang.Integer) zzp).intValue() == 0) {
                        }
                        zzb(sb, i, substring, zzp);
                    } else if (zzp instanceof java.lang.Float) {
                        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) zzp).floatValue()) == 0) {
                        }
                        zzb(sb, i, substring, zzp);
                    } else if (zzp instanceof java.lang.Double) {
                        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) zzp).doubleValue()) == 0) {
                        }
                        zzb(sb, i, substring, zzp);
                    } else {
                        if (zzp instanceof java.lang.String) {
                            equals = zzp.equals("");
                        } else if (zzp instanceof com.google.android.gms.internal.play_billing.zzbq) {
                            equals = zzp.equals(com.google.android.gms.internal.play_billing.zzbq.zzb);
                        } else if (zzp instanceof com.google.android.gms.internal.play_billing.zzec) {
                            if (zzp == ((com.google.android.gms.internal.play_billing.zzec) zzp).zzh()) {
                            }
                            zzb(sb, i, substring, zzp);
                        } else {
                            if ((zzp instanceof java.lang.Enum) && ((java.lang.Enum) zzp).ordinal() == 0) {
                            }
                            zzb(sb, i, substring, zzp);
                        }
                        if (equals) {
                        }
                        zzb(sb, i, substring, zzp);
                    }
                }
            }
            i2 = 3;
        }
        if (zzecVar instanceof com.google.android.gms.internal.play_billing.zzco) {
            java.util.Iterator zzf = ((com.google.android.gms.internal.play_billing.zzco) zzecVar).zzb.zzf();
            if (zzf.hasNext()) {
                throw null;
            }
        }
        com.google.android.gms.internal.play_billing.zzfg zzfgVar = ((com.google.android.gms.internal.play_billing.zzcs) zzecVar).zzc;
        if (zzfgVar != null) {
            zzfgVar.zzi(sb, i);
        }
    }
}
