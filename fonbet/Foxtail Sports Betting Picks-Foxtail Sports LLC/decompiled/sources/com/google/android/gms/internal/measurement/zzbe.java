package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
public final class zzbe {
    private static zzaf zza(zzaf zzafVar, zzh zzhVar, zzal zzalVar, Boolean bool, Boolean bool2) {
        zzaf zzafVar2 = new zzaf();
        Iterator<Integer> zzg = zzafVar.zzg();
        while (zzg.hasNext()) {
            int intValue = zzg.next().intValue();
            if (zzafVar.zzc(intValue)) {
                zzaq zza = zzalVar.zza(zzhVar, Arrays.asList(zzafVar.zza(intValue), new zzai(Double.valueOf(intValue)), zzafVar));
                if (zza.zzd().equals(bool)) {
                    break;
                }
                if (bool2 == null || zza.zzd().equals(bool2)) {
                    zzafVar2.zzb(intValue, zza);
                }
            }
        }
        return zzafVar2;
    }

    private static zzaf zza(zzaf zzafVar, zzh zzhVar, zzal zzalVar) {
        return zza(zzafVar, zzhVar, zzalVar, null, null);
    }

    public static zzaq zza(String str, zzaf zzafVar, zzh zzhVar, List<zzaq> list) {
        Boolean bool;
        char c;
        double zza;
        String str2;
        zzaf zzafVar2;
        zzal zzalVar;
        double min;
        zzh zzhVar2;
        str.hashCode();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1776922004:
                bool = true;
                if (str.equals("toString")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1354795244:
                bool = true;
                if (str.equals("concat")) {
                    c2 = 1;
                    break;
                }
                break;
            case -1274492040:
                bool = true;
                if (str.equals("filter")) {
                    c2 = 2;
                    break;
                }
                break;
            case -934873754:
                bool = true;
                if (str.equals("reduce")) {
                    c2 = 3;
                    break;
                }
                break;
            case -895859076:
                bool = true;
                if (str.equals("splice")) {
                    c = 4;
                    c2 = c;
                    break;
                }
                break;
            case -678635926:
                bool = true;
                if (str.equals("forEach")) {
                    c = 5;
                    c2 = c;
                    break;
                }
                break;
            case -467511597:
                bool = true;
                if (str.equals("lastIndexOf")) {
                    c = 6;
                    c2 = c;
                    break;
                }
                break;
            case -277637751:
                bool = true;
                if (str.equals("unshift")) {
                    c = 7;
                    c2 = c;
                    break;
                }
                break;
            case 107868:
                bool = true;
                if (str.equals("map")) {
                    c = '\b';
                    c2 = c;
                    break;
                }
                break;
            case 111185:
                bool = true;
                if (str.equals("pop")) {
                    c = '\t';
                    c2 = c;
                    break;
                }
                break;
            case 3267882:
                bool = true;
                if (str.equals("join")) {
                    c = '\n';
                    c2 = c;
                    break;
                }
                break;
            case 3452698:
                bool = true;
                if (str.equals("push")) {
                    c = 11;
                    c2 = c;
                    break;
                }
                break;
            case 3536116:
                bool = true;
                if (str.equals("some")) {
                    c = '\f';
                    c2 = c;
                    break;
                }
                break;
            case 3536286:
                bool = true;
                if (str.equals("sort")) {
                    c = '\r';
                    c2 = c;
                    break;
                }
                break;
            case 96891675:
                bool = true;
                if (str.equals("every")) {
                    c = 14;
                    c2 = c;
                    break;
                }
                break;
            case 109407362:
                bool = true;
                if (str.equals("shift")) {
                    c = 15;
                    c2 = c;
                    break;
                }
                break;
            case 109526418:
                bool = true;
                if (str.equals("slice")) {
                    c = 16;
                    c2 = c;
                    break;
                }
                break;
            case 965561430:
                bool = true;
                if (str.equals("reduceRight")) {
                    c = 17;
                    c2 = c;
                    break;
                }
                break;
            case 1099846370:
                bool = true;
                if (str.equals("reverse")) {
                    c = 18;
                    c2 = c;
                    break;
                }
                break;
            case 1943291465:
                bool = true;
                if (str.equals("indexOf")) {
                    c = 19;
                    c2 = c;
                    break;
                }
                break;
            default:
                bool = true;
                break;
        }
        double d = 0.0d;
        switch (c2) {
            case 0:
                zzg.zza("toString", 0, list);
                return new zzas(zzafVar.toString());
            case 1:
                zzaf zzafVar3 = (zzaf) zzafVar.zzc();
                if (!list.isEmpty()) {
                    Iterator<zzaq> it = list.iterator();
                    while (it.hasNext()) {
                        zzaq zza2 = zzhVar.zza(it.next());
                        if (zza2 instanceof zzaj) {
                            throw new IllegalStateException("Failed evaluation of arguments");
                        }
                        int zzb = zzafVar3.zzb();
                        if (zza2 instanceof zzaf) {
                            zzaf zzafVar4 = (zzaf) zza2;
                            Iterator<Integer> zzg = zzafVar4.zzg();
                            while (zzg.hasNext()) {
                                Integer next = zzg.next();
                                zzafVar3.zzb(next.intValue() + zzb, zzafVar4.zza(next.intValue()));
                            }
                        } else {
                            zzafVar3.zzb(zzb, zza2);
                        }
                    }
                }
                return zzafVar3;
            case 2:
                Boolean bool2 = bool;
                zzg.zza("filter", 1, list);
                zzaq zza3 = zzhVar.zza(list.get(0));
                if (!(zza3 instanceof zzar)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (zzafVar.zza() == 0) {
                    return new zzaf();
                }
                zzaf zzafVar5 = (zzaf) zzafVar.zzc();
                zzaf zza4 = zza(zzafVar, zzhVar, (zzar) zza3, null, bool2);
                zzaf zzafVar6 = new zzaf();
                Iterator<Integer> zzg2 = zza4.zzg();
                while (zzg2.hasNext()) {
                    zzafVar6.zza(zzafVar5.zza(zzg2.next().intValue()));
                }
                return zzafVar6;
            case 3:
                return zza(zzafVar, zzhVar, list, true);
            case 4:
                if (list.isEmpty()) {
                    return new zzaf();
                }
                int zza5 = (int) zzg.zza(zzhVar.zza(list.get(0)).zze().doubleValue());
                if (zza5 < 0) {
                    zza5 = Math.max(0, zza5 + zzafVar.zzb());
                } else if (zza5 > zzafVar.zzb()) {
                    zza5 = zzafVar.zzb();
                }
                int zzb2 = zzafVar.zzb();
                zzaf zzafVar7 = new zzaf();
                if (list.size() > 1) {
                    int max = Math.max(0, (int) zzg.zza(zzhVar.zza(list.get(1)).zze().doubleValue()));
                    if (max > 0) {
                        for (int i = zza5; i < Math.min(zzb2, zza5 + max); i++) {
                            zzafVar7.zza(zzafVar.zza(zza5));
                            zzafVar.zzb(zza5);
                        }
                    }
                    if (list.size() > 2) {
                        for (int i2 = 2; i2 < list.size(); i2++) {
                            zzaq zza6 = zzhVar.zza(list.get(i2));
                            if (zza6 instanceof zzaj) {
                                throw new IllegalArgumentException("Failed to parse elements to add");
                            }
                            zzafVar.zza((zza5 + i2) - 2, zza6);
                        }
                    }
                } else {
                    while (zza5 < zzb2) {
                        zzafVar7.zza(zzafVar.zza(zza5));
                        zzafVar.zzb(zza5, null);
                        zza5++;
                    }
                }
                return zzafVar7;
            case 5:
                zzg.zza("forEach", 1, list);
                zzaq zza7 = zzhVar.zza(list.get(0));
                if (!(zza7 instanceof zzar)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (zzafVar.zza() == 0) {
                    return zzaq.zzc;
                }
                zza(zzafVar, zzhVar, (zzar) zza7);
                return zzaq.zzc;
            case 6:
                zzg.zzc("lastIndexOf", 2, list);
                zzaq zzaqVar = zzaq.zzc;
                if (!list.isEmpty()) {
                    zzaqVar = zzhVar.zza(list.get(0));
                }
                double zzb3 = zzafVar.zzb() - 1;
                if (list.size() > 1) {
                    zzaq zza8 = zzhVar.zza(list.get(1));
                    if (Double.isNaN(zza8.zze().doubleValue())) {
                        zza = zzafVar.zzb() - 1;
                    } else {
                        zza = zzg.zza(zza8.zze().doubleValue());
                    }
                    zzb3 = zza;
                    if (zzb3 < 0.0d) {
                        zzb3 += zzafVar.zzb();
                    }
                }
                if (zzb3 < 0.0d) {
                    return new zzai(Double.valueOf(-1.0d));
                }
                for (int min2 = (int) Math.min(zzafVar.zzb(), zzb3); min2 >= 0; min2--) {
                    if (zzafVar.zzc(min2) && zzg.zza(zzafVar.zza(min2), zzaqVar)) {
                        return new zzai(Double.valueOf(min2));
                    }
                }
                return new zzai(Double.valueOf(-1.0d));
            case 7:
                if (!list.isEmpty()) {
                    zzaf zzafVar8 = new zzaf();
                    Iterator<zzaq> it2 = list.iterator();
                    while (it2.hasNext()) {
                        zzaq zza9 = zzhVar.zza(it2.next());
                        if (zza9 instanceof zzaj) {
                            throw new IllegalStateException("Argument evaluation failed");
                        }
                        zzafVar8.zza(zza9);
                    }
                    int zzb4 = zzafVar8.zzb();
                    Iterator<Integer> zzg3 = zzafVar.zzg();
                    while (zzg3.hasNext()) {
                        Integer next2 = zzg3.next();
                        zzafVar8.zzb(next2.intValue() + zzb4, zzafVar.zza(next2.intValue()));
                    }
                    zzafVar.zzj();
                    Iterator<Integer> zzg4 = zzafVar8.zzg();
                    while (zzg4.hasNext()) {
                        Integer next3 = zzg4.next();
                        zzafVar.zzb(next3.intValue(), zzafVar8.zza(next3.intValue()));
                    }
                }
                return new zzai(Double.valueOf(zzafVar.zzb()));
            case '\b':
                zzg.zza("map", 1, list);
                zzaq zza10 = zzhVar.zza(list.get(0));
                if (!(zza10 instanceof zzar)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (zzafVar.zzb() == 0) {
                    return new zzaf();
                }
                return zza(zzafVar, zzhVar, (zzar) zza10);
            case '\t':
                zzg.zza("pop", 0, list);
                int zzb5 = zzafVar.zzb();
                if (zzb5 == 0) {
                    return zzaq.zzc;
                }
                int i3 = zzb5 - 1;
                zzaq zza11 = zzafVar.zza(i3);
                zzafVar.zzb(i3);
                return zza11;
            case '\n':
                zzg.zzc("join", 1, list);
                if (zzafVar.zzb() == 0) {
                    return zzaq.zzj;
                }
                if (list.isEmpty()) {
                    str2 = ",";
                } else {
                    zzaq zza12 = zzhVar.zza(list.get(0));
                    if ((zza12 instanceof zzao) || (zza12 instanceof zzax)) {
                        str2 = "";
                    } else {
                        str2 = zza12.zzf();
                    }
                }
                return new zzas(zzafVar.zzb(str2));
            case 11:
                if (!list.isEmpty()) {
                    Iterator<zzaq> it3 = list.iterator();
                    while (it3.hasNext()) {
                        zzafVar.zza(zzhVar.zza(it3.next()));
                    }
                }
                return new zzai(Double.valueOf(zzafVar.zzb()));
            case '\f':
                zzg.zza("some", 1, list);
                zzaq zza13 = zzhVar.zza(list.get(0));
                if (!(zza13 instanceof zzal)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (zzafVar.zzb() != 0) {
                    zzal zzalVar2 = (zzal) zza13;
                    Iterator<Integer> zzg5 = zzafVar.zzg();
                    while (zzg5.hasNext()) {
                        int intValue = zzg5.next().intValue();
                        if (zzafVar.zzc(intValue) && zzalVar2.zza(zzhVar, Arrays.asList(zzafVar.zza(intValue), new zzai(Double.valueOf(intValue)), zzafVar)).zzd().booleanValue()) {
                            return zzaq.zzh;
                        }
                    }
                }
                return zzaq.zzi;
            case '\r':
                zzafVar2 = zzafVar;
                zzg.zzc("sort", 1, list);
                if (zzafVar2.zzb() >= 2) {
                    List<zzaq> zzi = zzafVar2.zzi();
                    if (list.isEmpty()) {
                        zzalVar = null;
                    } else {
                        zzaq zza14 = zzhVar.zza(list.get(0));
                        if (!(zza14 instanceof zzal)) {
                            throw new IllegalArgumentException("Comparator should be a method");
                        }
                        zzalVar = (zzal) zza14;
                    }
                    Collections.sort(zzi, new zzbh(zzalVar, zzhVar));
                    zzafVar2.zzj();
                    Iterator<zzaq> it4 = zzi.iterator();
                    int i4 = 0;
                    while (it4.hasNext()) {
                        zzafVar2.zzb(i4, it4.next());
                        i4++;
                    }
                }
                return zzafVar2;
            case 14:
                zzg.zza("every", 1, list);
                zzaq zza15 = zzhVar.zza(list.get(0));
                if (!(zza15 instanceof zzar)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (zzafVar.zzb() != 0 && zza(zzafVar, zzhVar, (zzar) zza15, false, bool).zzb() != zzafVar.zzb()) {
                    return zzaq.zzi;
                }
                return zzaq.zzh;
            case 15:
                zzg.zza("shift", 0, list);
                if (zzafVar.zzb() == 0) {
                    return zzaq.zzc;
                }
                zzaq zza16 = zzafVar.zza(0);
                zzafVar.zzb(0);
                return zza16;
            case 16:
                zzg.zzc("slice", 2, list);
                if (list.isEmpty()) {
                    return zzafVar.zzc();
                }
                double zzb6 = zzafVar.zzb();
                double zza17 = zzg.zza(zzhVar.zza(list.get(0)).zze().doubleValue());
                if (zza17 < 0.0d) {
                    min = Math.max(zza17 + zzb6, 0.0d);
                } else {
                    min = Math.min(zza17, zzb6);
                }
                if (list.size() == 2) {
                    double zza18 = zzg.zza(zzhVar.zza(list.get(1)).zze().doubleValue());
                    if (zza18 < 0.0d) {
                        zzb6 = Math.max(zzb6 + zza18, 0.0d);
                    } else {
                        zzb6 = Math.min(zzb6, zza18);
                    }
                }
                zzaf zzafVar9 = new zzaf();
                for (int i5 = (int) min; i5 < zzb6; i5++) {
                    zzafVar9.zza(zzafVar.zza(i5));
                }
                return zzafVar9;
            case 17:
                return zza(zzafVar, zzhVar, list, false);
            case 18:
                zzafVar2 = zzafVar;
                zzg.zza("reverse", 0, list);
                int zzb7 = zzafVar2.zzb();
                if (zzb7 != 0) {
                    for (int i6 = 0; i6 < zzb7 / 2; i6++) {
                        if (zzafVar2.zzc(i6)) {
                            zzaq zza19 = zzafVar2.zza(i6);
                            zzafVar2.zzb(i6, null);
                            int i7 = (zzb7 - 1) - i6;
                            if (zzafVar2.zzc(i7)) {
                                zzafVar2.zzb(i6, zzafVar2.zza(i7));
                            }
                            zzafVar2.zzb(i7, zza19);
                        }
                    }
                }
                return zzafVar2;
            case 19:
                zzg.zzc("indexOf", 2, list);
                zzaq zzaqVar2 = zzaq.zzc;
                if (list.isEmpty()) {
                    zzhVar2 = zzhVar;
                } else {
                    zzhVar2 = zzhVar;
                    zzaqVar2 = zzhVar2.zza(list.get(0));
                }
                if (list.size() > 1) {
                    double zza20 = zzg.zza(zzhVar2.zza(list.get(1)).zze().doubleValue());
                    if (zza20 >= zzafVar.zzb()) {
                        return new zzai(Double.valueOf(-1.0d));
                    }
                    d = zza20 < 0.0d ? zzafVar.zzb() + zza20 : zza20;
                }
                Iterator<Integer> zzg6 = zzafVar.zzg();
                while (zzg6.hasNext()) {
                    int intValue2 = zzg6.next().intValue();
                    double d2 = intValue2;
                    if (d2 >= d && zzg.zza(zzafVar.zza(intValue2), zzaqVar2)) {
                        return new zzai(Double.valueOf(d2));
                    }
                }
                return new zzai(Double.valueOf(-1.0d));
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    private static zzaq zza(zzaf zzafVar, zzh zzhVar, List<zzaq> list, boolean z) {
        zzaq zzaqVar;
        zzg.zzb("reduce", 1, list);
        zzg.zzc("reduce", 2, list);
        zzaq zza = zzhVar.zza(list.get(0));
        if (!(zza instanceof zzal)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (list.size() == 2) {
            zzaqVar = zzhVar.zza(list.get(1));
            if (zzaqVar instanceof zzaj) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (zzafVar.zzb() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            zzaqVar = null;
        }
        zzal zzalVar = (zzal) zza;
        int zzb = zzafVar.zzb();
        int i = z ? 0 : zzb - 1;
        int i2 = z ? zzb - 1 : 0;
        int i3 = z ? 1 : -1;
        if (zzaqVar == null) {
            zzaqVar = zzafVar.zza(i);
            i += i3;
        }
        while ((i2 - i) * i3 >= 0) {
            if (zzafVar.zzc(i)) {
                zzaqVar = zzalVar.zza(zzhVar, Arrays.asList(zzaqVar, zzafVar.zza(i), new zzai(Double.valueOf(i)), zzafVar));
                if (zzaqVar instanceof zzaj) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i += i3;
            } else {
                i += i3;
            }
        }
        return zzaqVar;
    }
}
