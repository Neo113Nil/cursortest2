package com.google.android.recaptcha.internal;

import W5.AbstractC0486a1;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import p136t.e;

/* JADX INFO: loaded from: classes.dex */
final class zzlz {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String zza(zzlx zzlxVar, String str) {
        StringBuilder sbD = e.d("# ", str);
        zzd(zzlxVar, sbD, 0);
        return sbD.toString();
    }

    public static void zzb(StringBuilder sb, int i7, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzb(sb, i7, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzb(sb, i7, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        zzc(i7, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i8 = 1; i8 < str.length(); i8++) {
                char cCharAt = str.charAt(i8);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(zzmw.zza(new zziu(((String) obj).getBytes(zzla.zza))));
            sb.append('\"');
            return;
        }
        if (obj instanceof zziv) {
            sb.append(": \"");
            sb.append(zzmw.zza((zziv) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzks) {
            sb.append(" {");
            zzd((zzks) obj, sb, i7 + 2);
            sb.append("\n");
            zzc(i7, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i9 = i7 + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        zzb(sb, i9, "key", entry.getKey());
        zzb(sb, i9, "value", entry.getValue());
        sb.append("\n");
        zzc(i7, sb);
        sb.append("}");
    }

    private static void zzc(int i7, StringBuilder sb) {
        while (i7 > 0) {
            int i8 = 80;
            if (i7 <= 80) {
                i8 = i7;
            }
            sb.append(zza, 0, i8);
            i7 -= i8;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01fa  */
    private static void zzd(zzlx zzlxVar, StringBuilder sb, int i7) {
        int i8;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzlxVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i9 = 0;
        while (true) {
            i8 = 3;
            if (i9 >= length) {
                break;
            }
            Method method3 = declaredMethods[i9];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i9++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i8);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                zzb(sb, i7, strSubstring.substring(0, strSubstring.length() - 4), zzks.zzB(method2, zzlxVar, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb, i7, strSubstring.substring(0, strSubstring.length() - 3), zzks.zzB(method, zzlxVar, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objZzB = zzks.zzB(method4, zzlxVar, new Object[0]);
                    if (method5 == null) {
                        if (objZzB instanceof Boolean) {
                            if (((Boolean) objZzB).booleanValue()) {
                                zzb(sb, i7, strSubstring, objZzB);
                            }
                        } else if (objZzB instanceof Integer) {
                            if (((Integer) objZzB).intValue() != 0) {
                                zzb(sb, i7, strSubstring, objZzB);
                            }
                        } else if (objZzB instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objZzB).floatValue()) != 0) {
                                zzb(sb, i7, strSubstring, objZzB);
                            }
                        } else if (!(objZzB instanceof Double)) {
                            if (objZzB instanceof String) {
                                zEquals = objZzB.equals("");
                            } else if (objZzB instanceof zziv) {
                                zEquals = objZzB.equals(zziv.zzb);
                            } else if (objZzB instanceof zzlx) {
                                if (objZzB != ((zzlx) objZzB).zzac()) {
                                    zzb(sb, i7, strSubstring, objZzB);
                                }
                            } else if (!(objZzB instanceof Enum) || ((Enum) objZzB).ordinal() != 0) {
                                zzb(sb, i7, strSubstring, objZzB);
                            }
                            if (!zEquals) {
                                zzb(sb, i7, strSubstring, objZzB);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objZzB).doubleValue()) != 0) {
                            zzb(sb, i7, strSubstring, objZzB);
                        }
                    } else if (((Boolean) zzks.zzB(method5, zzlxVar, new Object[0])).booleanValue()) {
                        zzb(sb, i7, strSubstring, objZzB);
                    }
                }
            }
            i8 = 3;
        }
        if (zzlxVar instanceof zzko) {
            Iterator itZzf = ((zzko) zzlxVar).zzb.zzf();
            while (itZzf.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itZzf.next();
                zzb(sb, i7, AbstractC0486a1.f(((zzkp) entry2.getKey()).zza, "[", "]"), entry2.getValue());
            }
        }
        zznc zzncVar = ((zzks) zzlxVar).zzc;
        if (zzncVar != null) {
            zzncVar.zzi(sb, i7);
        }
    }
}
