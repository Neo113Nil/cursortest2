package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import t.e;

/* loaded from: classes.dex */
final class zzalh {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String zza(zzalc zzalcVar, String str) {
        StringBuilder d7 = e.d("# ", str);
        zza(zzalcVar, d7, 0);
        return d7.toString();
    }

    private static void zza(int i7, StringBuilder sb) {
        while (i7 > 0) {
            char[] cArr = zza;
            int length = i7 > cArr.length ? cArr.length : i7;
            sb.append(cArr, 0, length);
            i7 -= length;
        }
    }

    public static void zza(StringBuilder sb, int i7, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zza(sb, i7, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zza(sb, i7, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        zza(i7, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i8 = 1; i8 < str.length(); i8++) {
                char charAt = str.charAt(i8);
                if (Character.isUpperCase(charAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(charAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(zzamh.zza(zzaip.zza((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzaip) {
            sb.append(": \"");
            sb.append(zzamh.zza((zzaip) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzajy) {
            sb.append(" {");
            zza((zzajy) obj, sb, i7 + 2);
            sb.append("\n");
            zza(i7, sb);
            sb.append("}");
            return;
        }
        if (obj instanceof Map.Entry) {
            sb.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            int i9 = i7 + 2;
            zza(sb, i9, "key", entry.getKey());
            zza(sb, i9, "value", entry.getValue());
            sb.append("\n");
            zza(i7, sb);
            sb.append("}");
            return;
        }
        sb.append(": ");
        sb.append(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x015c, code lost:
    
        if (r5.containsKey("get" + r9.substring(0, r9.length() - 5)) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0184, code lost:
    
        if (((java.lang.Boolean) r7).booleanValue() == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0186, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0197, code lost:
    
        if (((java.lang.Integer) r7).intValue() == 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a9, code lost:
    
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01bf, code lost:
    
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zza(zzalc zzalcVar, StringBuilder sb, int i7) {
        int i8;
        int i9;
        boolean booleanValue;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzalcVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i10 = 0;
        while (true) {
            i8 = 3;
            if (i10 >= length) {
                break;
            }
            Method method3 = declaredMethods[i10];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i10++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i8);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                zza(sb, i7, substring.substring(0, substring.length() - 4), zzajy.zza(method2, zzalcVar, new Object[0]));
                i8 = 3;
            } else {
                if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                    i9 = 3;
                    zza(sb, i7, substring.substring(0, substring.length() - 3), zzajy.zza(method, zzalcVar, new Object[0]));
                } else {
                    i9 = 3;
                    if (hashSet.contains("set".concat(substring))) {
                        if (substring.endsWith("Bytes")) {
                        }
                        Method method4 = (Method) entry.getValue();
                        Method method5 = (Method) hashMap.get("has".concat(substring));
                        if (method4 != null) {
                            Object zza2 = zzajy.zza(method4, zzalcVar, new Object[0]);
                            if (method5 == null) {
                                booleanValue = true;
                                if (!(zza2 instanceof Boolean)) {
                                    if (!(zza2 instanceof Integer)) {
                                        if (!(zza2 instanceof Float)) {
                                            if (!(zza2 instanceof Double)) {
                                                if (zza2 instanceof String) {
                                                    equals = zza2.equals("");
                                                } else if (zza2 instanceof zzaip) {
                                                    equals = zza2.equals(zzaip.zza);
                                                } else {
                                                    equals = !(zza2 instanceof zzalc) ? false : false;
                                                }
                                            }
                                        }
                                    }
                                }
                                if (equals) {
                                    booleanValue = false;
                                }
                            } else {
                                booleanValue = ((Boolean) zzajy.zza(method5, zzalcVar, new Object[0])).booleanValue();
                            }
                            if (booleanValue) {
                                zza(sb, i7, substring, zza2);
                            }
                        }
                    }
                }
                i8 = i9;
            }
        }
        if (zzalcVar instanceof zzajy.zzb) {
            Iterator<Map.Entry<zzajy.zze, Object>> zzd = ((zzajy.zzb) zzalcVar).zzc.zzd();
            if (zzd.hasNext()) {
                zzd.next().getKey();
                throw new NoSuchMethodError();
            }
        }
        zzamn zzamnVar = ((zzajy) zzalcVar).zzb;
        if (zzamnVar != null) {
            zzamnVar.zza(sb, i7);
        }
    }
}
