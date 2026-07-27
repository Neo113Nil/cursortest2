package com.google.android.gms.internal.consent_sdk;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes9.dex */
final class zzrs {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    static String zza(zzrq zzrqVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        zzd(zzrqVar, sb, 0);
        return sb.toString();
    }

    static void zzb(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzb(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzb(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        zzc(i, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char charAt = str.charAt(i2);
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
            zzpm zzpmVar = zzpm.zzb;
            sb.append(zzsk.zza(new zzpk(((String) obj).getBytes(zzqs.zza))));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzpm) {
            sb.append(": \"");
            sb.append(zzsk.zza((zzpm) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzqm) {
            sb.append(" {");
            zzd((zzqm) obj, sb, i + 2);
            sb.append("\n");
            zzc(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i3 = i + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        zzb(sb, i3, "key", entry.getKey());
        zzb(sb, i3, "value", entry.getValue());
        sb.append("\n");
        zzc(i, sb);
        sb.append("}");
    }

    private static void zzc(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(zza, 0, i2);
            i -= i2;
        }
    }

    private static void zzd(zzrq zzrqVar, StringBuilder sb, int i) {
        int i2;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzrqVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i3 = 0;
        while (true) {
            i2 = 3;
            if (i3 >= length) {
                break;
            }
            Method method3 = declaredMethods[i3];
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
            i3++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i2);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                zzb(sb, i, substring.substring(0, substring.length() - 4), zzqm.zzv(method2, zzrqVar, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb, i, substring.substring(0, substring.length() - 3), zzqm.zzv(method, zzrqVar, new Object[0]));
            } else if (hashSet.contains("set".concat(String.valueOf(substring))) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(String.valueOf(substring)));
                if (method4 != null) {
                    Object zzv = zzqm.zzv(method4, zzrqVar, new Object[0]);
                    if (method5 != null) {
                        if (!((Boolean) zzqm.zzv(method5, zzrqVar, new Object[0])).booleanValue()) {
                        }
                        zzb(sb, i, substring, zzv);
                    } else if (zzv instanceof Boolean) {
                        if (!((Boolean) zzv).booleanValue()) {
                        }
                        zzb(sb, i, substring, zzv);
                    } else if (zzv instanceof Integer) {
                        if (((Integer) zzv).intValue() == 0) {
                        }
                        zzb(sb, i, substring, zzv);
                    } else if (zzv instanceof Float) {
                        if (Float.floatToRawIntBits(((Float) zzv).floatValue()) == 0) {
                        }
                        zzb(sb, i, substring, zzv);
                    } else if (zzv instanceof Double) {
                        if (Double.doubleToRawLongBits(((Double) zzv).doubleValue()) == 0) {
                        }
                        zzb(sb, i, substring, zzv);
                    } else {
                        if (zzv instanceof String) {
                            equals = zzv.equals("");
                        } else if (zzv instanceof zzpm) {
                            equals = zzv.equals(zzpm.zzb);
                        } else if (zzv instanceof zzrq) {
                            if (zzv == ((zzrq) zzv).zzl()) {
                            }
                            zzb(sb, i, substring, zzv);
                        } else {
                            if ((zzv instanceof Enum) && ((Enum) zzv).ordinal() == 0) {
                            }
                            zzb(sb, i, substring, zzv);
                        }
                        if (equals) {
                        }
                        zzb(sb, i, substring, zzv);
                    }
                }
            }
            i2 = 3;
        }
        if (zzrqVar instanceof zzqk) {
            Iterator zzf = ((zzqk) zzrqVar).zzb.zzf();
            if (zzf.hasNext()) {
                throw null;
            }
        }
        zzsq zzsqVar = ((zzqm) zzrqVar).zzc;
        if (zzsqVar != null) {
            zzsqVar.zzg(sb, i);
        }
    }
}
