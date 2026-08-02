package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbez {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        java.util.Arrays.fill(cArr, ' ');
    }

    static java.lang.String zza(com.google.android.libraries.places.internal.zzbex zzbexVar, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("# ");
        sb.append(str);
        zzc(zzbexVar, sb, 0);
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
            sb.append(com.google.android.libraries.places.internal.zzbfu.zza(new com.google.android.libraries.places.internal.zzbck(((java.lang.String) obj).getBytes(com.google.android.libraries.places.internal.zzbeb.zza))));
            sb.append('\"');
            return;
        }
        if (obj instanceof com.google.android.libraries.places.internal.zzbcl) {
            sb.append(": \"");
            sb.append(com.google.android.libraries.places.internal.zzbfu.zza((com.google.android.libraries.places.internal.zzbcl) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof com.google.android.libraries.places.internal.zzbdq) {
            sb.append(" {");
            zzc((com.google.android.libraries.places.internal.zzbdq) obj, sb, i + 2);
            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
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
        zzb(sb, i3, "key", entry.getKey());
        zzb(sb, i3, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, entry.getValue());
        sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        zzd(i, sb);
        sb.append("}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0201, code lost:
    
        if (((java.lang.Boolean) com.google.android.libraries.places.internal.zzbdq.zzbC(r13, r19, new java.lang.Object[0])).booleanValue() != false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0186, code lost:
    
        if (((java.lang.Boolean) r7).booleanValue() != false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0195, code lost:
    
        if (((java.lang.Integer) r7).intValue() != 0) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01a8, code lost:
    
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) != 0) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01be, code lost:
    
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) != 0) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d6, code lost:
    
        if (r13 == false) goto L100;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zzc(com.google.android.libraries.places.internal.zzbex zzbexVar, java.lang.StringBuilder sb, int i) {
        int i2;
        int i3;
        boolean equals;
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.TreeMap treeMap = new java.util.TreeMap();
        java.lang.reflect.Method[] declaredMethods = zzbexVar.getClass().getDeclaredMethods();
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
            if (!substring.endsWith("List") || substring.endsWith("OrBuilderList") || substring.equals("List") || (method2 = (java.lang.reflect.Method) entry.getValue()) == null || !method2.getReturnType().equals(java.util.List.class)) {
                if (!substring.endsWith("Map") || substring.equals("Map") || (method = (java.lang.reflect.Method) entry.getValue()) == null || !method.getReturnType().equals(java.util.Map.class) || method.isAnnotationPresent(java.lang.Deprecated.class) || !java.lang.reflect.Modifier.isPublic(method.getModifiers())) {
                    i3 = 3;
                    if (hashSet.contains("set".concat(java.lang.String.valueOf(substring))) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(java.lang.String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                        java.lang.reflect.Method method4 = (java.lang.reflect.Method) entry.getValue();
                        java.lang.reflect.Method method5 = (java.lang.reflect.Method) hashMap.get("has".concat(java.lang.String.valueOf(substring)));
                        if (method4 != null) {
                            java.lang.Object zzbC = com.google.android.libraries.places.internal.zzbdq.zzbC(method4, zzbexVar, new java.lang.Object[0]);
                            if (method5 == null) {
                                if (!(zzbC instanceof java.lang.Boolean)) {
                                    if (!(zzbC instanceof java.lang.Integer)) {
                                        if (!(zzbC instanceof java.lang.Float)) {
                                            if (!(zzbC instanceof java.lang.Double)) {
                                                if (zzbC instanceof java.lang.String) {
                                                    equals = zzbC.equals("");
                                                } else if (zzbC instanceof com.google.android.libraries.places.internal.zzbcl) {
                                                    equals = zzbC.equals(com.google.android.libraries.places.internal.zzbcl.zza);
                                                } else if (zzbC instanceof com.google.android.libraries.places.internal.zzbex) {
                                                    zzb(sb, i, substring, zzbC);
                                                } else {
                                                    zzb(sb, i, substring, zzbC);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    i3 = 3;
                    zzb(sb, i, substring.substring(0, substring.length() - 3), com.google.android.libraries.places.internal.zzbdq.zzbC(method, zzbexVar, new java.lang.Object[0]));
                }
                i2 = i3;
            } else {
                zzb(sb, i, substring.substring(0, substring.length() - 4), com.google.android.libraries.places.internal.zzbdq.zzbC(method2, zzbexVar, new java.lang.Object[0]));
                i2 = 3;
            }
        }
        if (zzbexVar instanceof com.google.android.libraries.places.internal.zzbdn) {
            java.util.Iterator zzd = ((com.google.android.libraries.places.internal.zzbdn) zzbexVar).zzb.zzd();
            while (zzd.hasNext()) {
                java.util.Map.Entry entry2 = (java.util.Map.Entry) zzd.next();
                zzb(sb, i, "[525004180]", entry2.getValue());
            }
        }
        com.google.android.libraries.places.internal.zzbfz zzbfzVar = ((com.google.android.libraries.places.internal.zzbdq) zzbexVar).zzc;
        if (zzbfzVar != null) {
            zzbfzVar.zzj(sb, i);
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
