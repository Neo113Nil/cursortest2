package com.google.android.gms.internal.measurement;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.support.annotation.WorkerThread;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.AppMeasurement;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* loaded from: classes.dex */
final class zzed extends zzjs {
    zzed(zzjt zzjtVar) {
        super(zzjtVar);
    }

    private final Boolean zza(double d, zzkj zzkjVar) {
        try {
            return zza(new BigDecimal(d), zzkjVar, Math.ulp(d));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private final Boolean zza(long j, zzkj zzkjVar) {
        try {
            return zza(new BigDecimal(j), zzkjVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Boolean zza(zzkh zzkhVar, String str, zzks[] zzksVarArr, long j) {
        Boolean zza;
        String str2;
        Object obj;
        if (zzkhVar.zzato != null) {
            Boolean zza2 = zza(j, zzkhVar.zzato);
            if (zza2 == null) {
                return null;
            }
            if (!zza2.booleanValue()) {
                return false;
            }
        }
        HashSet hashSet = new HashSet();
        for (zzki zzkiVar : zzkhVar.zzatm) {
            if (TextUtils.isEmpty(zzkiVar.zzatt)) {
                zzgi().zziy().zzg("null or empty param name in filter. event", zzgf().zzbm(str));
                return null;
            }
            hashSet.add(zzkiVar.zzatt);
        }
        ArrayMap arrayMap = new ArrayMap();
        for (zzks zzksVar : zzksVarArr) {
            if (hashSet.contains(zzksVar.name)) {
                if (zzksVar.zzave != null) {
                    str2 = zzksVar.name;
                    obj = zzksVar.zzave;
                } else if (zzksVar.zzasw != null) {
                    str2 = zzksVar.name;
                    obj = zzksVar.zzasw;
                } else {
                    if (zzksVar.zzale == null) {
                        zzgi().zziy().zze("Unknown value for param. event, param", zzgf().zzbm(str), zzgf().zzbn(zzksVar.name));
                        return null;
                    }
                    str2 = zzksVar.name;
                    obj = zzksVar.zzale;
                }
                arrayMap.put(str2, obj);
            }
        }
        for (zzki zzkiVar2 : zzkhVar.zzatm) {
            boolean equals = Boolean.TRUE.equals(zzkiVar2.zzats);
            String str3 = zzkiVar2.zzatt;
            if (TextUtils.isEmpty(str3)) {
                zzgi().zziy().zzg("Event has empty param name. event", zzgf().zzbm(str));
                return null;
            }
            V v = arrayMap.get(str3);
            if (v instanceof Long) {
                if (zzkiVar2.zzatr == null) {
                    zzgi().zziy().zze("No number filter for long param. event, param", zzgf().zzbm(str), zzgf().zzbn(str3));
                    return null;
                }
                Boolean zza3 = zza(((Long) v).longValue(), zzkiVar2.zzatr);
                if (zza3 == null) {
                    return null;
                }
                if ((true ^ zza3.booleanValue()) ^ equals) {
                    return false;
                }
            } else if (v instanceof Double) {
                if (zzkiVar2.zzatr == null) {
                    zzgi().zziy().zze("No number filter for double param. event, param", zzgf().zzbm(str), zzgf().zzbn(str3));
                    return null;
                }
                Boolean zza4 = zza(((Double) v).doubleValue(), zzkiVar2.zzatr);
                if (zza4 == null) {
                    return null;
                }
                if ((true ^ zza4.booleanValue()) ^ equals) {
                    return false;
                }
            } else {
                if (!(v instanceof String)) {
                    if (v == 0) {
                        zzgi().zzjc().zze("Missing param for filter. event, param", zzgf().zzbm(str), zzgf().zzbn(str3));
                        return false;
                    }
                    zzgi().zziy().zze("Unknown param type. event, param", zzgf().zzbm(str), zzgf().zzbn(str3));
                    return null;
                }
                if (zzkiVar2.zzatq != null) {
                    zza = zza((String) v, zzkiVar2.zzatq);
                } else {
                    if (zzkiVar2.zzatr == null) {
                        zzgi().zziy().zze("No filter for String param. event, param", zzgf().zzbm(str), zzgf().zzbn(str3));
                        return null;
                    }
                    String str4 = (String) v;
                    if (!zzjz.zzcf(str4)) {
                        zzgi().zziy().zze("Invalid param value for number filter. event, param", zzgf().zzbm(str), zzgf().zzbn(str3));
                        return null;
                    }
                    zza = zza(str4, zzkiVar2.zzatr);
                }
                if (zza == null) {
                    return null;
                }
                if ((true ^ zza.booleanValue()) ^ equals) {
                    return false;
                }
            }
        }
        return true;
    }

    private final Boolean zza(zzkk zzkkVar, zzkx zzkxVar) {
        zzfk zziy;
        String str;
        Boolean zza;
        zzki zzkiVar = zzkkVar.zzaud;
        if (zzkiVar == null) {
            zziy = zzgi().zziy();
            str = "Missing property filter. property";
        } else {
            boolean equals = Boolean.TRUE.equals(zzkiVar.zzats);
            if (zzkxVar.zzave != null) {
                if (zzkiVar.zzatr != null) {
                    zza = zza(zzkxVar.zzave.longValue(), zzkiVar.zzatr);
                    return zza(zza, equals);
                }
                zziy = zzgi().zziy();
                str = "No number filter for long property. property";
            } else if (zzkxVar.zzasw != null) {
                if (zzkiVar.zzatr != null) {
                    zza = zza(zzkxVar.zzasw.doubleValue(), zzkiVar.zzatr);
                    return zza(zza, equals);
                }
                zziy = zzgi().zziy();
                str = "No number filter for double property. property";
            } else {
                if (zzkxVar.zzale != null) {
                    if (zzkiVar.zzatq == null) {
                        if (zzkiVar.zzatr == null) {
                            zzgi().zziy().zzg("No string or number filter defined. property", zzgf().zzbo(zzkxVar.name));
                        } else if (zzjz.zzcf(zzkxVar.zzale)) {
                            zza = zza(zzkxVar.zzale, zzkiVar.zzatr);
                        } else {
                            zzgi().zziy().zze("Invalid user property value for Numeric number filter. property, value", zzgf().zzbo(zzkxVar.name), zzkxVar.zzale);
                        }
                        return null;
                    }
                    zza = zza(zzkxVar.zzale, zzkiVar.zzatq);
                    return zza(zza, equals);
                }
                zziy = zzgi().zziy();
                str = "User property has no value, property";
            }
        }
        zziy.zzg(str, zzgf().zzbo(zzkxVar.name));
        return null;
    }

    @VisibleForTesting
    private static Boolean zza(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() ^ z);
    }

    private final Boolean zza(String str, int i, boolean z, String str2, List<String> list, String str3) {
        boolean startsWith;
        if (str == null) {
            return null;
        }
        if (i == 6) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && i != 1) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (i) {
            case 1:
                try {
                    return Boolean.valueOf(Pattern.compile(str3, z ? 0 : 66).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    zzgi().zziy().zzg("Invalid regular expression in REGEXP audience filter. expression", str3);
                    return null;
                }
            case 2:
                startsWith = str.startsWith(str2);
                break;
            case 3:
                startsWith = str.endsWith(str2);
                break;
            case 4:
                startsWith = str.contains(str2);
                break;
            case 5:
                startsWith = str.equals(str2);
                break;
            case 6:
                startsWith = list.contains(str);
                break;
            default:
                return null;
        }
        return Boolean.valueOf(startsWith);
    }

    private final Boolean zza(String str, zzkj zzkjVar) {
        if (!zzjz.zzcf(str)) {
            return null;
        }
        try {
            return zza(new BigDecimal(str), zzkjVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @VisibleForTesting
    private final Boolean zza(String str, zzkl zzklVar) {
        List<String> list;
        Preconditions.checkNotNull(zzklVar);
        if (str == null || zzklVar.zzaue == null || zzklVar.zzaue.intValue() == 0) {
            return null;
        }
        if (zzklVar.zzaue.intValue() == 6) {
            if (zzklVar.zzauh == null || zzklVar.zzauh.length == 0) {
                return null;
            }
        } else if (zzklVar.zzauf == null) {
            return null;
        }
        int intValue = zzklVar.zzaue.intValue();
        boolean z = zzklVar.zzaug != null && zzklVar.zzaug.booleanValue();
        String upperCase = (z || intValue == 1 || intValue == 6) ? zzklVar.zzauf : zzklVar.zzauf.toUpperCase(Locale.ENGLISH);
        if (zzklVar.zzauh == null) {
            list = null;
        } else {
            String[] strArr = zzklVar.zzauh;
            if (z) {
                list = Arrays.asList(strArr);
            } else {
                ArrayList arrayList = new ArrayList();
                for (String str2 : strArr) {
                    arrayList.add(str2.toUpperCase(Locale.ENGLISH));
                }
                list = arrayList;
            }
        }
        return zza(str, intValue, z, upperCase, list, intValue == 1 ? upperCase : null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0071, code lost:
    
        if (r3 != null) goto L36;
     */
    @VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Boolean zza(BigDecimal bigDecimal, zzkj zzkjVar, double d) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        Preconditions.checkNotNull(zzkjVar);
        if (zzkjVar.zzatw != null && zzkjVar.zzatw.intValue() != 0) {
            if (zzkjVar.zzatw.intValue() == 4) {
                if (zzkjVar.zzatz == null || zzkjVar.zzaua == null) {
                    return null;
                }
            } else if (zzkjVar.zzaty == null) {
                return null;
            }
            int intValue = zzkjVar.zzatw.intValue();
            if (zzkjVar.zzatw.intValue() == 4) {
                if (zzjz.zzcf(zzkjVar.zzatz) && zzjz.zzcf(zzkjVar.zzaua)) {
                    try {
                        BigDecimal bigDecimal5 = new BigDecimal(zzkjVar.zzatz);
                        bigDecimal4 = new BigDecimal(zzkjVar.zzaua);
                        bigDecimal3 = bigDecimal5;
                        bigDecimal2 = null;
                    } catch (NumberFormatException unused) {
                    }
                }
                return null;
            }
            if (!zzjz.zzcf(zzkjVar.zzaty)) {
                return null;
            }
            try {
                bigDecimal2 = new BigDecimal(zzkjVar.zzaty);
                bigDecimal3 = null;
                bigDecimal4 = null;
            } catch (NumberFormatException unused2) {
            }
            if (intValue == 4) {
                if (bigDecimal3 == null) {
                    return null;
                }
            }
            switch (intValue) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    if (d == 0.0d) {
                        break;
                    } else {
                        if (bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) == 1 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) == -1) {
                            r5 = true;
                        }
                        break;
                    }
                case 4:
                    if (bigDecimal.compareTo(bigDecimal3) != -1 && bigDecimal.compareTo(bigDecimal4) != 1) {
                        r5 = true;
                    }
                    break;
            }
            return null;
        }
        return null;
    }

    private final void zza(Integer num, Integer num2, zzki zzkiVar, Boolean bool, Boolean bool2) {
        if (zzkiVar == null) {
            zzgi().zziy().zze("The leaf filter of event or user property filter is null. audience ID, filter ID", num, num2);
        } else {
            zzkiVar.zzatu = Boolean.valueOf((bool != null && bool.booleanValue()) || (bool2 != null && bool2.booleanValue()));
            zzkiVar.zzatv = Boolean.valueOf(bool2 != null && bool2.booleanValue());
        }
    }

    private static void zza(Map<Integer, Long> map, int i, long j) {
        Long l = map.get(Integer.valueOf(i));
        long j2 = j / 1000;
        if (l == null || j2 > l.longValue()) {
            map.put(Integer.valueOf(i), Long.valueOf(j2));
        }
    }

    private static zzkq[] zzd(Map<Integer, Long> map) {
        if (map == null) {
            return null;
        }
        int i = 0;
        zzkq[] zzkqVarArr = new zzkq[map.size()];
        for (Integer num : map.keySet()) {
            zzkq zzkqVar = new zzkq();
            zzkqVar.zzaux = num;
            zzkqVar.zzauy = map.get(num);
            zzkqVarArr[i] = zzkqVar;
            i++;
        }
        return zzkqVarArr;
    }

    @WorkerThread
    final void zza(String str, zzkg[] zzkgVarArr) {
        Preconditions.checkNotNull(zzkgVarArr);
        for (zzkg zzkgVar : zzkgVarArr) {
            for (zzkh zzkhVar : zzkgVar.zzatg) {
                String zzal = AppMeasurement.Event.zzal(zzkhVar.zzatl);
                if (zzal != null) {
                    zzkhVar.zzatl = zzal;
                }
                for (zzki zzkiVar : zzkhVar.zzatm) {
                    String zzal2 = AppMeasurement.Param.zzal(zzkiVar.zzatt);
                    if (zzal2 != null) {
                        zzkiVar.zzatt = zzal2;
                    }
                    zza(zzkgVar.zzate, zzkhVar.zzatk, zzkiVar, zzkgVar.zzath, zzkgVar.zzati);
                }
            }
            for (zzkk zzkkVar : zzkgVar.zzatf) {
                String zzal3 = AppMeasurement.UserProperty.zzal(zzkkVar.zzauc);
                if (zzal3 != null) {
                    zzkkVar.zzauc = zzal3;
                }
                zza(zzkgVar.zzate, zzkkVar.zzatk, zzkkVar.zzaud, zzkgVar.zzath, zzkgVar.zzati);
            }
        }
        zzjh().zzb(str, zzkgVarArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x029c  */
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final zzkp[] zza(String str, zzkr[] zzkrVarArr, zzkx[] zzkxVarArr) {
        ArrayMap arrayMap;
        zzfk zziv;
        String str2;
        ArrayMap arrayMap2;
        ArrayMap arrayMap3;
        Map map;
        ArrayMap arrayMap4;
        Iterator<zzkk> it;
        ArrayMap arrayMap5;
        int i;
        zzkr zzkrVar;
        int i2;
        boolean z;
        zzks[] zzksVarArr;
        long j;
        zzkr zzkrVar2;
        Long l;
        String str3;
        zzet zzf;
        ArrayMap arrayMap6;
        HashSet hashSet;
        ArrayMap arrayMap7;
        zzkr zzkrVar3;
        String str4;
        ArrayMap arrayMap8;
        ArrayMap arrayMap9;
        ArrayMap arrayMap10;
        zzet zzim;
        Map<Integer, List<zzkh>> map2;
        Iterator<Integer> it2;
        ArrayMap arrayMap11;
        ArrayMap arrayMap12;
        HashSet hashSet2;
        BitSet bitSet;
        Iterator<Integer> it3;
        ArrayMap arrayMap13;
        Map map3;
        Map map4;
        BitSet bitSet2;
        Map map5;
        ArrayMap arrayMap14;
        ArrayMap arrayMap15;
        ArrayMap arrayMap16;
        ArrayMap arrayMap17;
        zzkr zzkrVar4;
        Map map6;
        BitSet bitSet3;
        ArrayMap arrayMap18;
        BitSet bitSet4;
        zzfk zziy;
        String str5;
        Object zzbp;
        Object valueOf;
        boolean z2;
        Boolean zza;
        boolean z3;
        Long l2;
        long longValue;
        Long l3;
        zzkr zzkrVar5;
        zzkr zzkrVar6;
        int length;
        int i3;
        int i4;
        zzkr zzkrVar7;
        SQLiteDatabase writableDatabase;
        String[] strArr;
        Map<Integer, zzkv> map7;
        Iterator<Integer> it4;
        BitSet bitSet5;
        ArrayMap arrayMap19;
        BitSet bitSet6;
        ArrayMap arrayMap20;
        ArrayMap arrayMap21;
        ArrayMap arrayMap22;
        boolean z4;
        String str6 = str;
        zzkr[] zzkrVarArr2 = zzkrVarArr;
        zzkx[] zzkxVarArr2 = zzkxVarArr;
        Preconditions.checkNotEmpty(str);
        HashSet hashSet3 = new HashSet();
        ArrayMap arrayMap23 = new ArrayMap();
        ArrayMap arrayMap24 = new ArrayMap();
        ArrayMap arrayMap25 = new ArrayMap();
        ArrayMap arrayMap26 = new ArrayMap();
        boolean zzd = zzgk().zzd(str6, zzez.zzajx);
        Map<Integer, zzkv> zzbi = zzjh().zzbi(str6);
        if (zzbi != null) {
            Iterator<Integer> it5 = zzbi.keySet().iterator();
            while (it5.hasNext()) {
                int intValue = it5.next().intValue();
                zzkv zzkvVar = zzbi.get(Integer.valueOf(intValue));
                BitSet bitSet7 = (BitSet) arrayMap24.get(Integer.valueOf(intValue));
                BitSet bitSet8 = (BitSet) arrayMap25.get(Integer.valueOf(intValue));
                if (zzd) {
                    arrayMap19 = new ArrayMap();
                    if (zzkvVar != null) {
                        map7 = zzbi;
                        if (zzkvVar.zzawn != null) {
                            zzkq[] zzkqVarArr = zzkvVar.zzawn;
                            it4 = it5;
                            int length2 = zzkqVarArr.length;
                            bitSet5 = bitSet8;
                            int i5 = 0;
                            while (i5 < length2) {
                                int i6 = length2;
                                zzkq zzkqVar = zzkqVarArr[i5];
                                zzkq[] zzkqVarArr2 = zzkqVarArr;
                                if (zzkqVar.zzaux != null) {
                                    arrayMap19.put(zzkqVar.zzaux, zzkqVar.zzauy);
                                }
                                i5++;
                                length2 = i6;
                                zzkqVarArr = zzkqVarArr2;
                            }
                            arrayMap26.put(Integer.valueOf(intValue), arrayMap19);
                        }
                    } else {
                        map7 = zzbi;
                    }
                    it4 = it5;
                    bitSet5 = bitSet8;
                    arrayMap26.put(Integer.valueOf(intValue), arrayMap19);
                } else {
                    map7 = zzbi;
                    it4 = it5;
                    bitSet5 = bitSet8;
                    arrayMap19 = null;
                }
                if (bitSet7 == null) {
                    bitSet7 = new BitSet();
                    arrayMap24.put(Integer.valueOf(intValue), bitSet7);
                    bitSet6 = new BitSet();
                    arrayMap25.put(Integer.valueOf(intValue), bitSet6);
                } else {
                    bitSet6 = bitSet5;
                }
                int i7 = 0;
                while (i7 < (zzkvVar.zzawl.length << 6)) {
                    if (zzjz.zza(zzkvVar.zzawl, i7)) {
                        arrayMap20 = arrayMap26;
                        arrayMap21 = arrayMap25;
                        arrayMap22 = arrayMap24;
                        zzgi().zzjc().zze("Filter already evaluated. audience ID, filter ID", Integer.valueOf(intValue), Integer.valueOf(i7));
                        bitSet6.set(i7);
                        if (zzjz.zza(zzkvVar.zzawm, i7)) {
                            bitSet7.set(i7);
                            z4 = true;
                            if (arrayMap19 != null && !z4) {
                                arrayMap19.remove(Integer.valueOf(i7));
                            }
                            i7++;
                            arrayMap26 = arrayMap20;
                            arrayMap25 = arrayMap21;
                            arrayMap24 = arrayMap22;
                        }
                    } else {
                        arrayMap20 = arrayMap26;
                        arrayMap21 = arrayMap25;
                        arrayMap22 = arrayMap24;
                    }
                    z4 = false;
                    if (arrayMap19 != null) {
                        arrayMap19.remove(Integer.valueOf(i7));
                    }
                    i7++;
                    arrayMap26 = arrayMap20;
                    arrayMap25 = arrayMap21;
                    arrayMap24 = arrayMap22;
                }
                ArrayMap arrayMap27 = arrayMap26;
                ArrayMap arrayMap28 = arrayMap25;
                ArrayMap arrayMap29 = arrayMap24;
                zzkp zzkpVar = new zzkp();
                arrayMap23.put(Integer.valueOf(intValue), zzkpVar);
                zzkpVar.zzauv = false;
                zzkpVar.zzauu = zzkvVar;
                zzkpVar.zzaut = new zzkv();
                zzkpVar.zzaut.zzawm = zzjz.zza(bitSet7);
                zzkpVar.zzaut.zzawl = zzjz.zza(bitSet6);
                if (zzd) {
                    zzkpVar.zzaut.zzawn = zzd(arrayMap19);
                }
                zzbi = map7;
                it5 = it4;
                arrayMap26 = arrayMap27;
                arrayMap25 = arrayMap28;
                arrayMap24 = arrayMap29;
            }
        }
        ArrayMap arrayMap30 = arrayMap26;
        ArrayMap arrayMap31 = arrayMap25;
        ArrayMap arrayMap32 = arrayMap24;
        if (zzkrVarArr2 != null) {
            ArrayMap arrayMap33 = new ArrayMap();
            int length3 = zzkrVarArr2.length;
            long j2 = 0;
            zzkr zzkrVar8 = null;
            Long l4 = null;
            int i8 = 0;
            while (i8 < length3) {
                zzkr zzkrVar9 = zzkrVarArr2[i8];
                String str7 = zzkrVar9.name;
                zzks[] zzksVarArr2 = zzkrVar9.zzava;
                long j3 = j2;
                if (zzgk().zzd(str6, zzez.zzajr)) {
                    zzjf();
                    Long l5 = (Long) zzjz.zzb(zzkrVar9, "_eid");
                    boolean z5 = l5 != null;
                    if (z5) {
                        i = i8;
                        if (str7.equals("_ep")) {
                            z3 = true;
                            if (z3) {
                                zzkrVar = zzkrVar9;
                                i2 = length3;
                                z = true;
                                if (z5) {
                                    zzjf();
                                    Object zzb = zzjz.zzb(zzkrVar, "_epc");
                                    if (zzb == null) {
                                        zzb = 0L;
                                    }
                                    long longValue2 = ((Long) zzb).longValue();
                                    if (longValue2 <= 0) {
                                        zzgi().zziy().zzg("Complex event with zero extra param count. eventName", str7);
                                        l2 = l5;
                                    } else {
                                        l2 = l5;
                                        zzjh().zza(str, l5, longValue2, zzkrVar);
                                    }
                                    l = l2;
                                    str3 = str7;
                                    zzksVarArr = zzksVarArr2;
                                    zzkrVar2 = zzkrVar;
                                    j = longValue2;
                                }
                            } else {
                                zzjf();
                                String str8 = (String) zzjz.zzb(zzkrVar9, "_en");
                                if (TextUtils.isEmpty(str8)) {
                                    zzgi().zziv().zzg("Extra parameter without an event name. eventId", l5);
                                    i2 = length3;
                                } else {
                                    if (zzkrVar8 == null || l4 == null || l5.longValue() != l4.longValue()) {
                                        Pair<zzkr, Long> zza2 = zzjh().zza(str6, l5);
                                        if (zza2 == null || zza2.first == null) {
                                            i2 = length3;
                                            zzgi().zziv().zze("Extra parameter without existing main event. eventName, eventId", str8, l5);
                                        } else {
                                            zzkr zzkrVar10 = (zzkr) zza2.first;
                                            longValue = ((Long) zza2.second).longValue();
                                            zzjf();
                                            l3 = (Long) zzjz.zzb(zzkrVar10, "_eid");
                                            zzkrVar5 = zzkrVar10;
                                        }
                                    } else {
                                        zzkrVar5 = zzkrVar8;
                                        l3 = l4;
                                        longValue = j3;
                                    }
                                    j = longValue - 1;
                                    if (j <= 0) {
                                        zzek zzjh = zzjh();
                                        zzjh.zzab();
                                        zzjh.zzgi().zzjc().zzg("Clearing complex main event info. appId", str6);
                                        try {
                                            writableDatabase = zzjh.getWritableDatabase();
                                            zzkrVar7 = zzkrVar5;
                                            try {
                                                strArr = new String[1];
                                            } catch (SQLiteException e) {
                                                e = e;
                                                zzjh.zzgi().zziv().zzg("Error clearing complex main event", e);
                                                zzkrVar = zzkrVar9;
                                                i2 = length3;
                                                zzkrVar6 = zzkrVar7;
                                                z = true;
                                                zzks[] zzksVarArr3 = new zzks[zzkrVar6.zzava.length + zzksVarArr2.length];
                                                zzks[] zzksVarArr4 = zzkrVar6.zzava;
                                                length = zzksVarArr4.length;
                                                i3 = 0;
                                                i4 = 0;
                                                while (i3 < length) {
                                                }
                                                zzkr zzkrVar11 = zzkrVar6;
                                                if (i4 > 0) {
                                                }
                                                l = l3;
                                                zzkrVar2 = zzkrVar11;
                                                zzf = zzjh().zzf(str6, zzkrVar.name);
                                                if (zzf == null) {
                                                }
                                                zzjh().zza(zzim);
                                                long j4 = zzim.zzahh;
                                                ArrayMap arrayMap34 = arrayMap6;
                                                map2 = (Map) arrayMap34.get(str3);
                                                if (map2 == null) {
                                                }
                                                Map<Integer, List<zzkh>> map8 = map2;
                                                it2 = map8.keySet().iterator();
                                                while (it2.hasNext()) {
                                                }
                                                arrayMap11 = arrayMap34;
                                                arrayMap12 = arrayMap10;
                                                hashSet2 = hashSet;
                                                zzkrVar8 = zzkrVar2;
                                                l4 = l;
                                                j2 = j;
                                                i8 = i + 1;
                                                zzkrVarArr2 = zzkrVarArr;
                                                hashSet3 = hashSet2;
                                                length3 = i2;
                                                arrayMap33 = arrayMap11;
                                                arrayMap31 = arrayMap9;
                                                arrayMap30 = arrayMap8;
                                                arrayMap23 = arrayMap7;
                                                arrayMap32 = arrayMap12;
                                                zzkxVarArr2 = zzkxVarArr;
                                                str6 = str;
                                            }
                                        } catch (SQLiteException e2) {
                                            e = e2;
                                            zzkrVar7 = zzkrVar5;
                                        }
                                        try {
                                            strArr[0] = str6;
                                            writableDatabase.execSQL("delete from main_event_params where app_id=?", strArr);
                                        } catch (SQLiteException e3) {
                                            e = e3;
                                            zzjh.zzgi().zziv().zzg("Error clearing complex main event", e);
                                            zzkrVar = zzkrVar9;
                                            i2 = length3;
                                            zzkrVar6 = zzkrVar7;
                                            z = true;
                                            zzks[] zzksVarArr32 = new zzks[zzkrVar6.zzava.length + zzksVarArr2.length];
                                            zzks[] zzksVarArr42 = zzkrVar6.zzava;
                                            length = zzksVarArr42.length;
                                            i3 = 0;
                                            i4 = 0;
                                            while (i3 < length) {
                                            }
                                            zzkr zzkrVar112 = zzkrVar6;
                                            if (i4 > 0) {
                                            }
                                            l = l3;
                                            zzkrVar2 = zzkrVar112;
                                            zzf = zzjh().zzf(str6, zzkrVar.name);
                                            if (zzf == null) {
                                            }
                                            zzjh().zza(zzim);
                                            long j42 = zzim.zzahh;
                                            ArrayMap arrayMap342 = arrayMap6;
                                            map2 = (Map) arrayMap342.get(str3);
                                            if (map2 == null) {
                                            }
                                            Map<Integer, List<zzkh>> map82 = map2;
                                            it2 = map82.keySet().iterator();
                                            while (it2.hasNext()) {
                                            }
                                            arrayMap11 = arrayMap342;
                                            arrayMap12 = arrayMap10;
                                            hashSet2 = hashSet;
                                            zzkrVar8 = zzkrVar2;
                                            l4 = l;
                                            j2 = j;
                                            i8 = i + 1;
                                            zzkrVarArr2 = zzkrVarArr;
                                            hashSet3 = hashSet2;
                                            length3 = i2;
                                            arrayMap33 = arrayMap11;
                                            arrayMap31 = arrayMap9;
                                            arrayMap30 = arrayMap8;
                                            arrayMap23 = arrayMap7;
                                            arrayMap32 = arrayMap12;
                                            zzkxVarArr2 = zzkxVarArr;
                                            str6 = str;
                                        }
                                        zzkrVar = zzkrVar9;
                                        i2 = length3;
                                        zzkrVar6 = zzkrVar7;
                                        z = true;
                                    } else {
                                        zzkr zzkrVar12 = zzkrVar5;
                                        zzkrVar = zzkrVar9;
                                        z = true;
                                        i2 = length3;
                                        zzjh().zza(str, l5, j, zzkrVar12);
                                        zzkrVar6 = zzkrVar12;
                                    }
                                    zzks[] zzksVarArr322 = new zzks[zzkrVar6.zzava.length + zzksVarArr2.length];
                                    zzks[] zzksVarArr422 = zzkrVar6.zzava;
                                    length = zzksVarArr422.length;
                                    i3 = 0;
                                    i4 = 0;
                                    while (i3 < length) {
                                        zzks zzksVar = zzksVarArr422[i3];
                                        zzjf();
                                        zzkr zzkrVar13 = zzkrVar6;
                                        if (zzjz.zza(zzkrVar, zzksVar.name) == null) {
                                            zzksVarArr322[i4] = zzksVar;
                                            i4++;
                                        }
                                        i3++;
                                        zzkrVar6 = zzkrVar13;
                                    }
                                    zzkr zzkrVar1122 = zzkrVar6;
                                    if (i4 > 0) {
                                        int length4 = zzksVarArr2.length;
                                        int i9 = 0;
                                        while (i9 < length4) {
                                            zzksVarArr322[i4] = zzksVarArr2[i9];
                                            i9++;
                                            i4++;
                                        }
                                        if (i4 != zzksVarArr322.length) {
                                            zzksVarArr322 = (zzks[]) Arrays.copyOf(zzksVarArr322, i4);
                                        }
                                        zzksVarArr = zzksVarArr322;
                                        str3 = str8;
                                    } else {
                                        zzgi().zziy().zzg("No unique parameters in main event. eventName", str8);
                                        str3 = str8;
                                        zzksVarArr = zzksVarArr2;
                                    }
                                    l = l3;
                                    zzkrVar2 = zzkrVar1122;
                                }
                                arrayMap11 = arrayMap33;
                                hashSet2 = hashSet3;
                                arrayMap7 = arrayMap23;
                                arrayMap8 = arrayMap30;
                                arrayMap9 = arrayMap31;
                                arrayMap12 = arrayMap32;
                                j2 = j3;
                                i8 = i + 1;
                                zzkrVarArr2 = zzkrVarArr;
                                hashSet3 = hashSet2;
                                length3 = i2;
                                arrayMap33 = arrayMap11;
                                arrayMap31 = arrayMap9;
                                arrayMap30 = arrayMap8;
                                arrayMap23 = arrayMap7;
                                arrayMap32 = arrayMap12;
                                zzkxVarArr2 = zzkxVarArr;
                                str6 = str;
                            }
                            zzf = zzjh().zzf(str6, zzkrVar.name);
                            if (zzf == null) {
                                zzgi().zziy().zze("Event aggregate wasn't created during raw event logging. appId, event", zzfi.zzbp(str), zzgf().zzbm(str3));
                                arrayMap6 = arrayMap33;
                                arrayMap8 = arrayMap30;
                                arrayMap9 = arrayMap31;
                                arrayMap10 = arrayMap32;
                                hashSet = hashSet3;
                                arrayMap7 = arrayMap23;
                                zzkrVar3 = zzkrVar;
                                str4 = str6;
                                zzim = new zzet(str, zzkrVar.name, 1L, 1L, zzkrVar.zzavb.longValue(), 0L, null, null, null);
                            } else {
                                arrayMap6 = arrayMap33;
                                hashSet = hashSet3;
                                arrayMap7 = arrayMap23;
                                zzkrVar3 = zzkrVar;
                                str4 = str6;
                                arrayMap8 = arrayMap30;
                                arrayMap9 = arrayMap31;
                                arrayMap10 = arrayMap32;
                                zzim = zzf.zzim();
                            }
                            zzjh().zza(zzim);
                            long j422 = zzim.zzahh;
                            ArrayMap arrayMap3422 = arrayMap6;
                            map2 = (Map) arrayMap3422.get(str3);
                            if (map2 == null) {
                                map2 = zzjh().zzk(str4, str3);
                                if (map2 == null) {
                                    map2 = new ArrayMap<>();
                                }
                                arrayMap3422.put(str3, map2);
                            }
                            Map<Integer, List<zzkh>> map822 = map2;
                            it2 = map822.keySet().iterator();
                            while (it2.hasNext()) {
                                int intValue2 = it2.next().intValue();
                                HashSet hashSet4 = hashSet;
                                if (hashSet4.contains(Integer.valueOf(intValue2))) {
                                    zzgi().zzjc().zzg("Skipping failed audience ID", Integer.valueOf(intValue2));
                                    hashSet = hashSet4;
                                } else {
                                    ArrayMap arrayMap35 = arrayMap7;
                                    zzkp zzkpVar2 = (zzkp) arrayMap35.get(Integer.valueOf(intValue2));
                                    ArrayMap arrayMap36 = arrayMap10;
                                    BitSet bitSet9 = (BitSet) arrayMap36.get(Integer.valueOf(intValue2));
                                    zzkr zzkrVar14 = zzkrVar3;
                                    ArrayMap arrayMap37 = arrayMap3422;
                                    ArrayMap arrayMap38 = arrayMap9;
                                    BitSet bitSet10 = (BitSet) arrayMap38.get(Integer.valueOf(intValue2));
                                    if (zzd) {
                                        bitSet = bitSet10;
                                        it3 = it2;
                                        arrayMap13 = arrayMap8;
                                        map3 = (Map) arrayMap13.get(Integer.valueOf(intValue2));
                                    } else {
                                        bitSet = bitSet10;
                                        it3 = it2;
                                        arrayMap13 = arrayMap8;
                                        map3 = null;
                                    }
                                    if (zzkpVar2 == null) {
                                        zzkp zzkpVar3 = new zzkp();
                                        arrayMap35.put(Integer.valueOf(intValue2), zzkpVar3);
                                        zzkpVar3.zzauv = Boolean.valueOf(z);
                                        bitSet9 = new BitSet();
                                        arrayMap36.put(Integer.valueOf(intValue2), bitSet9);
                                        BitSet bitSet11 = new BitSet();
                                        map4 = map3;
                                        arrayMap38.put(Integer.valueOf(intValue2), bitSet11);
                                        if (zzd) {
                                            ArrayMap arrayMap39 = new ArrayMap();
                                            arrayMap13.put(Integer.valueOf(intValue2), arrayMap39);
                                            map5 = arrayMap39;
                                            bitSet2 = bitSet11;
                                            for (zzkh zzkhVar : map822.get(Integer.valueOf(intValue2))) {
                                                BitSet bitSet12 = bitSet2;
                                                Map<Integer, List<zzkh>> map9 = map822;
                                                if (zzgi().isLoggable(2)) {
                                                    arrayMap14 = arrayMap36;
                                                    zzgi().zzjc().zzd("Evaluating filter. audience, filter, event", Integer.valueOf(intValue2), zzkhVar.zzatk, zzgf().zzbm(zzkhVar.zzatl));
                                                    zzgi().zzjc().zzg("Filter definition", zzjf().zza(zzkhVar));
                                                } else {
                                                    arrayMap14 = arrayMap36;
                                                }
                                                if (zzkhVar.zzatk == null || zzkhVar.zzatk.intValue() > 256) {
                                                    arrayMap15 = arrayMap38;
                                                    arrayMap16 = arrayMap13;
                                                    arrayMap17 = arrayMap35;
                                                    zzkrVar4 = zzkrVar14;
                                                    map6 = map5;
                                                    bitSet3 = bitSet12;
                                                    arrayMap18 = arrayMap14;
                                                    bitSet4 = bitSet9;
                                                    zziy = zzgi().zziy();
                                                    str5 = "Invalid event filter ID. appId, id";
                                                    zzbp = zzfi.zzbp(str);
                                                    valueOf = String.valueOf(zzkhVar.zzatk);
                                                } else if (zzd) {
                                                    if (zzkhVar != null && zzkhVar.zzatm != null && zzkhVar.zzatm.length > 0) {
                                                        if (zzkhVar.zzatm[0].zzatu != null && zzkhVar.zzatm[0].zzatu.booleanValue()) {
                                                            z2 = true;
                                                            if (bitSet9.get(zzkhVar.zzatk.intValue()) || z2) {
                                                                bitSet3 = bitSet12;
                                                                arrayMap16 = arrayMap13;
                                                                zzkrVar4 = zzkrVar14;
                                                                arrayMap15 = arrayMap38;
                                                                bitSet4 = bitSet9;
                                                                map6 = map5;
                                                                arrayMap17 = arrayMap35;
                                                                arrayMap18 = arrayMap14;
                                                                zza = zza(zzkhVar, str3, zzksVarArr, j422);
                                                                zzgi().zzjc().zzg("Event filter result", zza != null ? "null" : zza);
                                                                if (zza != null) {
                                                                    bitSet3.set(zzkhVar.zzatk.intValue());
                                                                    if (zza.booleanValue()) {
                                                                        bitSet4.set(zzkhVar.zzatk.intValue());
                                                                        if (z2 && zzkrVar4.zzavb != null) {
                                                                            zza((Map<Integer, Long>) map6, zzkhVar.zzatk.intValue(), zzkrVar4.zzavb.longValue());
                                                                        }
                                                                    }
                                                                    map5 = map6;
                                                                    bitSet9 = bitSet4;
                                                                    bitSet2 = bitSet3;
                                                                    zzkrVar14 = zzkrVar4;
                                                                    map822 = map9;
                                                                    arrayMap38 = arrayMap15;
                                                                    arrayMap13 = arrayMap16;
                                                                    arrayMap35 = arrayMap17;
                                                                    arrayMap36 = arrayMap18;
                                                                }
                                                                hashSet4.add(Integer.valueOf(intValue2));
                                                                map5 = map6;
                                                                bitSet9 = bitSet4;
                                                                bitSet2 = bitSet3;
                                                                zzkrVar14 = zzkrVar4;
                                                                map822 = map9;
                                                                arrayMap38 = arrayMap15;
                                                                arrayMap13 = arrayMap16;
                                                                arrayMap35 = arrayMap17;
                                                                arrayMap36 = arrayMap18;
                                                            } else {
                                                                zzgi().zzjc().zze("Event filter already evaluated true and it is not associated with a dynamic audience. audience ID, filter ID", Integer.valueOf(intValue2), zzkhVar.zzatk);
                                                                bitSet2 = bitSet12;
                                                                map822 = map9;
                                                                arrayMap36 = arrayMap14;
                                                            }
                                                        }
                                                    }
                                                    z2 = false;
                                                    if (bitSet9.get(zzkhVar.zzatk.intValue())) {
                                                    }
                                                    bitSet3 = bitSet12;
                                                    arrayMap16 = arrayMap13;
                                                    zzkrVar4 = zzkrVar14;
                                                    arrayMap15 = arrayMap38;
                                                    bitSet4 = bitSet9;
                                                    map6 = map5;
                                                    arrayMap17 = arrayMap35;
                                                    arrayMap18 = arrayMap14;
                                                    zza = zza(zzkhVar, str3, zzksVarArr, j422);
                                                    zzgi().zzjc().zzg("Event filter result", zza != null ? "null" : zza);
                                                    if (zza != null) {
                                                    }
                                                    hashSet4.add(Integer.valueOf(intValue2));
                                                    map5 = map6;
                                                    bitSet9 = bitSet4;
                                                    bitSet2 = bitSet3;
                                                    zzkrVar14 = zzkrVar4;
                                                    map822 = map9;
                                                    arrayMap38 = arrayMap15;
                                                    arrayMap13 = arrayMap16;
                                                    arrayMap35 = arrayMap17;
                                                    arrayMap36 = arrayMap18;
                                                } else {
                                                    arrayMap15 = arrayMap38;
                                                    arrayMap16 = arrayMap13;
                                                    arrayMap17 = arrayMap35;
                                                    zzkrVar4 = zzkrVar14;
                                                    map6 = map5;
                                                    bitSet3 = bitSet12;
                                                    arrayMap18 = arrayMap14;
                                                    bitSet4 = bitSet9;
                                                    if (bitSet4.get(zzkhVar.zzatk.intValue())) {
                                                        zziy = zzgi().zzjc();
                                                        str5 = "Event filter already evaluated true. audience ID, filter ID";
                                                        zzbp = Integer.valueOf(intValue2);
                                                        valueOf = zzkhVar.zzatk;
                                                    } else {
                                                        Boolean zza3 = zza(zzkhVar, str3, zzksVarArr, j422);
                                                        zzgi().zzjc().zzg("Event filter result", zza3 == null ? "null" : zza3);
                                                        if (zza3 != null) {
                                                            bitSet3.set(zzkhVar.zzatk.intValue());
                                                            if (zza3.booleanValue()) {
                                                                bitSet4.set(zzkhVar.zzatk.intValue());
                                                            }
                                                            map5 = map6;
                                                            bitSet9 = bitSet4;
                                                            bitSet2 = bitSet3;
                                                            zzkrVar14 = zzkrVar4;
                                                            map822 = map9;
                                                            arrayMap38 = arrayMap15;
                                                            arrayMap13 = arrayMap16;
                                                            arrayMap35 = arrayMap17;
                                                            arrayMap36 = arrayMap18;
                                                        }
                                                        hashSet4.add(Integer.valueOf(intValue2));
                                                        map5 = map6;
                                                        bitSet9 = bitSet4;
                                                        bitSet2 = bitSet3;
                                                        zzkrVar14 = zzkrVar4;
                                                        map822 = map9;
                                                        arrayMap38 = arrayMap15;
                                                        arrayMap13 = arrayMap16;
                                                        arrayMap35 = arrayMap17;
                                                        arrayMap36 = arrayMap18;
                                                    }
                                                }
                                                zziy.zze(str5, zzbp, valueOf);
                                                map5 = map6;
                                                bitSet9 = bitSet4;
                                                bitSet2 = bitSet3;
                                                zzkrVar14 = zzkrVar4;
                                                map822 = map9;
                                                arrayMap38 = arrayMap15;
                                                arrayMap13 = arrayMap16;
                                                arrayMap35 = arrayMap17;
                                                arrayMap36 = arrayMap18;
                                            }
                                            arrayMap10 = arrayMap36;
                                            arrayMap9 = arrayMap38;
                                            arrayMap8 = arrayMap13;
                                            hashSet = hashSet4;
                                            arrayMap7 = arrayMap35;
                                            zzkrVar3 = zzkrVar14;
                                            it2 = it3;
                                            arrayMap3422 = arrayMap37;
                                        } else {
                                            bitSet = bitSet11;
                                        }
                                    } else {
                                        map4 = map3;
                                    }
                                    bitSet2 = bitSet;
                                    map5 = map4;
                                    while (r19.hasNext()) {
                                    }
                                    arrayMap10 = arrayMap36;
                                    arrayMap9 = arrayMap38;
                                    arrayMap8 = arrayMap13;
                                    hashSet = hashSet4;
                                    arrayMap7 = arrayMap35;
                                    zzkrVar3 = zzkrVar14;
                                    it2 = it3;
                                    arrayMap3422 = arrayMap37;
                                }
                            }
                            arrayMap11 = arrayMap3422;
                            arrayMap12 = arrayMap10;
                            hashSet2 = hashSet;
                            zzkrVar8 = zzkrVar2;
                            l4 = l;
                            j2 = j;
                            i8 = i + 1;
                            zzkrVarArr2 = zzkrVarArr;
                            hashSet3 = hashSet2;
                            length3 = i2;
                            arrayMap33 = arrayMap11;
                            arrayMap31 = arrayMap9;
                            arrayMap30 = arrayMap8;
                            arrayMap23 = arrayMap7;
                            arrayMap32 = arrayMap12;
                            zzkxVarArr2 = zzkxVarArr;
                            str6 = str;
                        }
                    } else {
                        i = i8;
                    }
                    z3 = false;
                    if (z3) {
                    }
                    zzf = zzjh().zzf(str6, zzkrVar.name);
                    if (zzf == null) {
                    }
                    zzjh().zza(zzim);
                    long j4222 = zzim.zzahh;
                    ArrayMap arrayMap34222 = arrayMap6;
                    map2 = (Map) arrayMap34222.get(str3);
                    if (map2 == null) {
                    }
                    Map<Integer, List<zzkh>> map8222 = map2;
                    it2 = map8222.keySet().iterator();
                    while (it2.hasNext()) {
                    }
                    arrayMap11 = arrayMap34222;
                    arrayMap12 = arrayMap10;
                    hashSet2 = hashSet;
                    zzkrVar8 = zzkrVar2;
                    l4 = l;
                    j2 = j;
                    i8 = i + 1;
                    zzkrVarArr2 = zzkrVarArr;
                    hashSet3 = hashSet2;
                    length3 = i2;
                    arrayMap33 = arrayMap11;
                    arrayMap31 = arrayMap9;
                    arrayMap30 = arrayMap8;
                    arrayMap23 = arrayMap7;
                    arrayMap32 = arrayMap12;
                    zzkxVarArr2 = zzkxVarArr;
                    str6 = str;
                } else {
                    i = i8;
                    zzkrVar = zzkrVar9;
                    i2 = length3;
                    z = true;
                }
                zzksVarArr = zzksVarArr2;
                j = j3;
                zzkrVar2 = zzkrVar8;
                l = l4;
                str3 = str7;
                zzf = zzjh().zzf(str6, zzkrVar.name);
                if (zzf == null) {
                }
                zzjh().zza(zzim);
                long j42222 = zzim.zzahh;
                ArrayMap arrayMap342222 = arrayMap6;
                map2 = (Map) arrayMap342222.get(str3);
                if (map2 == null) {
                }
                Map<Integer, List<zzkh>> map82222 = map2;
                it2 = map82222.keySet().iterator();
                while (it2.hasNext()) {
                }
                arrayMap11 = arrayMap342222;
                arrayMap12 = arrayMap10;
                hashSet2 = hashSet;
                zzkrVar8 = zzkrVar2;
                l4 = l;
                j2 = j;
                i8 = i + 1;
                zzkrVarArr2 = zzkrVarArr;
                hashSet3 = hashSet2;
                length3 = i2;
                arrayMap33 = arrayMap11;
                arrayMap31 = arrayMap9;
                arrayMap30 = arrayMap8;
                arrayMap23 = arrayMap7;
                arrayMap32 = arrayMap12;
                zzkxVarArr2 = zzkxVarArr;
                str6 = str;
            }
        }
        HashSet hashSet5 = hashSet3;
        ArrayMap arrayMap40 = arrayMap23;
        ArrayMap arrayMap41 = arrayMap30;
        ArrayMap arrayMap42 = arrayMap31;
        ArrayMap arrayMap43 = arrayMap32;
        zzkx[] zzkxVarArr3 = zzkxVarArr;
        if (zzkxVarArr3 != null) {
            ArrayMap arrayMap44 = new ArrayMap();
            int length5 = zzkxVarArr3.length;
            int i10 = 0;
            while (i10 < length5) {
                zzkx zzkxVar = zzkxVarArr3[i10];
                Map<Integer, List<zzkk>> map10 = (Map) arrayMap44.get(zzkxVar.name);
                if (map10 == null) {
                    map10 = zzjh().zzl(str, zzkxVar.name);
                    if (map10 == null) {
                        map10 = new ArrayMap<>();
                    }
                    arrayMap44.put(zzkxVar.name, map10);
                }
                Iterator<Integer> it6 = map10.keySet().iterator();
                while (it6.hasNext()) {
                    int intValue3 = it6.next().intValue();
                    if (hashSet5.contains(Integer.valueOf(intValue3))) {
                        zzgi().zzjc().zzg("Skipping failed audience ID", Integer.valueOf(intValue3));
                    } else {
                        ArrayMap arrayMap45 = arrayMap40;
                        zzkp zzkpVar4 = (zzkp) arrayMap45.get(Integer.valueOf(intValue3));
                        ArrayMap arrayMap46 = arrayMap43;
                        BitSet bitSet13 = (BitSet) arrayMap46.get(Integer.valueOf(intValue3));
                        ArrayMap arrayMap47 = arrayMap42;
                        BitSet bitSet14 = (BitSet) arrayMap47.get(Integer.valueOf(intValue3));
                        if (zzd) {
                            arrayMap2 = arrayMap44;
                            arrayMap3 = arrayMap41;
                            map = (Map) arrayMap3.get(Integer.valueOf(intValue3));
                        } else {
                            arrayMap2 = arrayMap44;
                            arrayMap3 = arrayMap41;
                            map = null;
                        }
                        if (zzkpVar4 == null) {
                            zzkp zzkpVar5 = new zzkp();
                            arrayMap45.put(Integer.valueOf(intValue3), zzkpVar5);
                            zzkpVar5.zzauv = true;
                            bitSet13 = new BitSet();
                            arrayMap46.put(Integer.valueOf(intValue3), bitSet13);
                            bitSet14 = new BitSet();
                            arrayMap47.put(Integer.valueOf(intValue3), bitSet14);
                            if (zzd) {
                                map = new ArrayMap();
                                arrayMap3.put(Integer.valueOf(intValue3), map);
                            }
                        }
                        Iterator<zzkk> it7 = map10.get(Integer.valueOf(intValue3)).iterator();
                        while (it7.hasNext()) {
                            int i11 = length5;
                            zzkk next = it7.next();
                            Map<Integer, List<zzkk>> map11 = map10;
                            Iterator<Integer> it8 = it6;
                            if (zzgi().isLoggable(2)) {
                                it = it7;
                                arrayMap4 = arrayMap3;
                                arrayMap42 = arrayMap47;
                                zzgi().zzjc().zzd("Evaluating filter. audience, filter, property", Integer.valueOf(intValue3), next.zzatk, zzgf().zzbo(next.zzauc));
                                zzgi().zzjc().zzg("Filter definition", zzjf().zza(next));
                            } else {
                                arrayMap4 = arrayMap3;
                                it = it7;
                                arrayMap42 = arrayMap47;
                            }
                            if (next.zzatk == null || next.zzatk.intValue() > 256) {
                                arrayMap40 = arrayMap45;
                                zzgi().zziy().zze("Invalid property filter ID. appId, id", zzfi.zzbp(str), String.valueOf(next.zzatk));
                                hashSet5.add(Integer.valueOf(intValue3));
                                arrayMap44 = arrayMap2;
                                arrayMap43 = arrayMap46;
                                map10 = map11;
                                length5 = i11;
                                it6 = it8;
                                arrayMap41 = arrayMap4;
                                break;
                            }
                            if (zzd) {
                                boolean z6 = (next == null || next.zzaud == null || next.zzaud.zzatu == null || !next.zzaud.zzatu.booleanValue()) ? false : true;
                                if (!bitSet13.get(next.zzatk.intValue()) || z6) {
                                    Boolean zza4 = zza(next, zzkxVar);
                                    zzgi().zzjc().zzg("Property filter result", zza4 == null ? "null" : zza4);
                                    if (zza4 == null) {
                                        hashSet5.add(Integer.valueOf(intValue3));
                                    } else {
                                        bitSet14.set(next.zzatk.intValue());
                                        bitSet13.set(next.zzatk.intValue(), zza4.booleanValue());
                                        if (zza4.booleanValue() && z6 && zzkxVar.zzaws != null) {
                                            arrayMap5 = arrayMap45;
                                            zza((Map<Integer, Long>) map, next.zzatk.intValue(), zzkxVar.zzaws.longValue());
                                        }
                                    }
                                } else {
                                    zzgi().zzjc().zze("Property filter already evaluated true and it is not associated with a dynamic audience. audience ID, filter ID", Integer.valueOf(intValue3), next.zzatk);
                                }
                                map10 = map11;
                                length5 = i11;
                                it6 = it8;
                                it7 = it;
                                arrayMap3 = arrayMap4;
                                arrayMap47 = arrayMap42;
                            } else {
                                arrayMap5 = arrayMap45;
                                if (bitSet13.get(next.zzatk.intValue())) {
                                    zzgi().zzjc().zze("Property filter already evaluated true. audience ID, filter ID", Integer.valueOf(intValue3), next.zzatk);
                                } else {
                                    Boolean zza5 = zza(next, zzkxVar);
                                    zzgi().zzjc().zzg("Property filter result", zza5 == null ? "null" : zza5);
                                    if (zza5 == null) {
                                        hashSet5.add(Integer.valueOf(intValue3));
                                    } else {
                                        bitSet14.set(next.zzatk.intValue());
                                        if (zza5.booleanValue()) {
                                            bitSet13.set(next.zzatk.intValue());
                                        }
                                    }
                                }
                            }
                            map10 = map11;
                            length5 = i11;
                            it6 = it8;
                            it7 = it;
                            arrayMap3 = arrayMap4;
                            arrayMap47 = arrayMap42;
                            arrayMap45 = arrayMap5;
                        }
                        arrayMap44 = arrayMap2;
                        arrayMap41 = arrayMap3;
                        arrayMap40 = arrayMap45;
                        arrayMap43 = arrayMap46;
                        arrayMap42 = arrayMap47;
                        it6 = it6;
                    }
                }
                i10++;
                zzkxVarArr3 = zzkxVarArr;
            }
        }
        ArrayMap arrayMap48 = arrayMap41;
        ArrayMap arrayMap49 = arrayMap43;
        zzkp[] zzkpVarArr = new zzkp[arrayMap49.size()];
        Iterator it9 = arrayMap49.keySet().iterator();
        int i12 = 0;
        while (it9.hasNext()) {
            int intValue4 = ((Integer) it9.next()).intValue();
            if (!hashSet5.contains(Integer.valueOf(intValue4))) {
                ArrayMap arrayMap50 = arrayMap40;
                zzkp zzkpVar6 = (zzkp) arrayMap50.get(Integer.valueOf(intValue4));
                if (zzkpVar6 == null) {
                    zzkpVar6 = new zzkp();
                }
                int i13 = i12 + 1;
                zzkpVarArr[i12] = zzkpVar6;
                zzkpVar6.zzate = Integer.valueOf(intValue4);
                zzkpVar6.zzaut = new zzkv();
                zzkpVar6.zzaut.zzawm = zzjz.zza((BitSet) arrayMap49.get(Integer.valueOf(intValue4)));
                ArrayMap arrayMap51 = arrayMap42;
                zzkpVar6.zzaut.zzawl = zzjz.zza((BitSet) arrayMap51.get(Integer.valueOf(intValue4)));
                if (zzd) {
                    arrayMap = arrayMap48;
                    zzkpVar6.zzaut.zzawn = zzd((Map) arrayMap.get(Integer.valueOf(intValue4)));
                } else {
                    arrayMap = arrayMap48;
                }
                zzek zzjh2 = zzjh();
                zzkv zzkvVar2 = zzkpVar6.zzaut;
                zzjh2.zzch();
                zzjh2.zzab();
                Preconditions.checkNotEmpty(str);
                Preconditions.checkNotNull(zzkvVar2);
                try {
                    byte[] bArr = new byte[zzkvVar2.zzwb()];
                    zzacb zzb2 = zzacb.zzb(bArr, 0, bArr.length);
                    zzkvVar2.zza(zzb2);
                    zzb2.zzvt();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("audience_id", Integer.valueOf(intValue4));
                    contentValues.put("current_results", bArr);
                    try {
                    } catch (SQLiteException e4) {
                        e = e4;
                    }
                    try {
                        if (zzjh2.getWritableDatabase().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                            zzjh2.zzgi().zziv().zzg("Failed to insert filter results (got -1). appId", zzfi.zzbp(str));
                        }
                    } catch (SQLiteException e5) {
                        e = e5;
                        zziv = zzjh2.zzgi().zziv();
                        str2 = "Error storing filter results. appId";
                        zziv.zze(str2, zzfi.zzbp(str), e);
                        arrayMap40 = arrayMap50;
                        i12 = i13;
                        arrayMap42 = arrayMap51;
                        arrayMap48 = arrayMap;
                    }
                } catch (IOException e6) {
                    e = e6;
                    zziv = zzjh2.zzgi().zziv();
                    str2 = "Configuration loss. Failed to serialize filter results. appId";
                }
                arrayMap40 = arrayMap50;
                i12 = i13;
                arrayMap42 = arrayMap51;
                arrayMap48 = arrayMap;
            }
        }
        return (zzkp[]) Arrays.copyOf(zzkpVarArr, i12);
    }

    @Override // com.google.android.gms.internal.measurement.zzjs
    protected final boolean zzgn() {
        return false;
    }
}
