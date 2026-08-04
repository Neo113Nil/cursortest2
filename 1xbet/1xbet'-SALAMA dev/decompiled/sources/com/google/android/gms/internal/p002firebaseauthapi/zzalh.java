package com.google.android.gms.internal.p002firebaseauthapi;

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
final class zzalh {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String zza(zzalc zzalcVar, String str) {
        StringBuilder sbD = e.d("# ", str);
        zza(zzalcVar, sbD, 0);
        return sbD.toString();
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

    /* JADX WARN: Code duplicated, block: B:100:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:101:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:103:0x0207  */
    /* JADX WARN: Code duplicated, block: B:57:0x015e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0170  */
    /* JADX WARN: Code duplicated, block: B:61:0x0178  */
    /* JADX WARN: Code duplicated, block: B:63:0x017d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0186  */
    /* JADX WARN: Code duplicated, block: B:66:0x0189  */
    /* JADX WARN: Code duplicated, block: B:67:0x018c  */
    /* JADX WARN: Code duplicated, block: B:69:0x0190  */
    /* JADX WARN: Code duplicated, block: B:72:0x019a  */
    /* JADX WARN: Code duplicated, block: B:74:0x019e  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:79:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:84:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:85:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:87:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:88:0x01d8  */
    private static void zza(zzalc zzalcVar, StringBuilder sb, int i7) {
        int i8;
        int i9;
        Method method;
        Method method2;
        Object objZza;
        boolean zBooleanValue;
        boolean zEquals;
        Method method3;
        Method method4;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzalcVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i10 = 0;
        while (true) {
            i8 = 3;
            if (i10 >= length) {
                break;
            }
            Method method5 = declaredMethods[i10];
            if (!Modifier.isStatic(method5.getModifiers()) && method5.getName().length() >= 3) {
                if (method5.getName().startsWith("set")) {
                    hashSet.add(method5.getName());
                } else if (Modifier.isPublic(method5.getModifiers()) && method5.getParameterTypes().length == 0) {
                    if (method5.getName().startsWith("has")) {
                        map.put(method5.getName(), method5);
                    } else if (method5.getName().startsWith("get")) {
                        treeMap.put(method5.getName(), method5);
                    }
                }
            }
            i10++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i8);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method4 = (Method) entry.getValue()) != null && method4.getReturnType().equals(List.class)) {
                zza(sb, i7, strSubstring.substring(0, strSubstring.length() - 4), zzajy.zza(method4, zzalcVar, new Object[0]));
                i8 = 3;
            } else {
                if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method3 = (Method) entry.getValue()) != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    i9 = 3;
                    zza(sb, i7, strSubstring.substring(0, strSubstring.length() - 3), zzajy.zza(method3, zzalcVar, new Object[0]));
                } else {
                    i9 = 3;
                    if (hashSet.contains("set".concat(strSubstring))) {
                        if (strSubstring.endsWith("Bytes")) {
                            if (!treeMap.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5))) {
                                method = (Method) entry.getValue();
                                method2 = (Method) map.get("has".concat(strSubstring));
                                if (method != null) {
                                    objZza = zzajy.zza(method, zzalcVar, new Object[0]);
                                    if (method2 == null) {
                                        zBooleanValue = true;
                                        if (objZza instanceof Boolean) {
                                            if (((Boolean) objZza).booleanValue()) {
                                                zEquals = false;
                                            } else {
                                                zEquals = true;
                                            }
                                        } else if (objZza instanceof Integer) {
                                            if (((Integer) objZza).intValue() == 0) {
                                                zEquals = true;
                                            } else {
                                                zEquals = false;
                                            }
                                        } else if (objZza instanceof Float) {
                                            if (Float.floatToRawIntBits(((Float) objZza).floatValue()) == 0) {
                                                zEquals = true;
                                            } else {
                                                zEquals = false;
                                            }
                                        } else if (objZza instanceof Double) {
                                            if (Double.doubleToRawLongBits(((Double) objZza).doubleValue()) == 0) {
                                                zEquals = true;
                                            } else {
                                                zEquals = false;
                                            }
                                        } else if (objZza instanceof String) {
                                            zEquals = objZza.equals("");
                                        } else if (objZza instanceof zzaip) {
                                            zEquals = objZza.equals(zzaip.zza);
                                        } else if ((objZza instanceof zzalc) ? !((objZza instanceof Enum) && ((Enum) objZza).ordinal() == 0) : objZza != ((zzalc) objZza).zzg()) {
                                            zEquals = false;
                                        } else {
                                            zEquals = true;
                                        }
                                        if (zEquals) {
                                            zBooleanValue = false;
                                        }
                                    } else {
                                        zBooleanValue = ((Boolean) zzajy.zza(method2, zzalcVar, new Object[0])).booleanValue();
                                    }
                                    if (zBooleanValue) {
                                        zza(sb, i7, strSubstring, objZza);
                                    }
                                }
                            }
                        } else {
                            method = (Method) entry.getValue();
                            method2 = (Method) map.get("has".concat(strSubstring));
                            if (method != null) {
                                objZza = zzajy.zza(method, zzalcVar, new Object[0]);
                                if (method2 == null) {
                                    zBooleanValue = true;
                                    if (objZza instanceof Boolean) {
                                        if (((Boolean) objZza).booleanValue()) {
                                            zEquals = true;
                                        } else {
                                            zEquals = false;
                                        }
                                    } else if (objZza instanceof Integer) {
                                        if (((Integer) objZza).intValue() == 0) {
                                            zEquals = true;
                                        } else {
                                            zEquals = false;
                                        }
                                    } else if (objZza instanceof Float) {
                                        if (Float.floatToRawIntBits(((Float) objZza).floatValue()) == 0) {
                                            zEquals = true;
                                        } else {
                                            zEquals = false;
                                        }
                                    } else if (objZza instanceof Double) {
                                        if (Double.doubleToRawLongBits(((Double) objZza).doubleValue()) == 0) {
                                            zEquals = true;
                                        } else {
                                            zEquals = false;
                                        }
                                    } else if (objZza instanceof String) {
                                        zEquals = objZza.equals("");
                                    } else if (objZza instanceof zzaip) {
                                        zEquals = objZza.equals(zzaip.zza);
                                    } else if (objZza instanceof zzalc) {
                                        zEquals = false;
                                    } else {
                                        zEquals = false;
                                    }
                                    if (zEquals) {
                                        zBooleanValue = false;
                                    }
                                } else {
                                    zBooleanValue = ((Boolean) zzajy.zza(method2, zzalcVar, new Object[0])).booleanValue();
                                }
                                if (zBooleanValue) {
                                    zza(sb, i7, strSubstring, objZza);
                                }
                            }
                        }
                    }
                }
                i8 = i9;
            }
        }
        if (zzalcVar instanceof zzajy.zzb) {
            Iterator<Map.Entry<T, Object>> itZzd = ((zzajy.zzb) zzalcVar).zzc.zzd();
            if (itZzd.hasNext()) {
                throw new NoSuchMethodError();
            }
        }
        zzamn zzamnVar = ((zzajy) zzalcVar).zzb;
        if (zzamnVar != null) {
            zzamnVar.zza(sb, i7);
        }
    }
}
