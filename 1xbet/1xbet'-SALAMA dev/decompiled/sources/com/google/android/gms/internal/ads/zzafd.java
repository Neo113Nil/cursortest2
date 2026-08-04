package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzafd extends zzaff {
    private long zzb;
    private long[] zzc;
    private long[] zzd;

    public zzafd() {
        super(new zzacq());
        this.zzb = -9223372036854775807L;
        this.zzc = new long[0];
        this.zzd = new long[0];
    }

    private static Double zzg(zzed zzedVar) {
        return Double.valueOf(Double.longBitsToDouble(zzedVar.zzt()));
    }

    private static Object zzh(zzed zzedVar, int i7) {
        if (i7 == 0) {
            return zzg(zzedVar);
        }
        if (i7 == 1) {
            return Boolean.valueOf(zzedVar.zzm() == 1);
        }
        if (i7 == 2) {
            return zzi(zzedVar);
        }
        if (i7 != 3) {
            if (i7 == 8) {
                return zzj(zzedVar);
            }
            if (i7 != 10) {
                if (i7 != 11) {
                    return null;
                }
                Date date = new Date((long) zzg(zzedVar).doubleValue());
                zzedVar.zzM(2);
                return date;
            }
            int iZzp = zzedVar.zzp();
            ArrayList arrayList = new ArrayList(iZzp);
            for (int i8 = 0; i8 < iZzp; i8++) {
                Object objZzh = zzh(zzedVar, zzedVar.zzm());
                if (objZzh != null) {
                    arrayList.add(objZzh);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strZzi = zzi(zzedVar);
            int iZzm = zzedVar.zzm();
            if (iZzm == 9) {
                return map;
            }
            Object objZzh2 = zzh(zzedVar, iZzm);
            if (objZzh2 != null) {
                map.put(strZzi, objZzh2);
            }
        }
    }

    private static String zzi(zzed zzedVar) {
        int iZzq = zzedVar.zzq();
        int iZzd = zzedVar.zzd();
        zzedVar.zzM(iZzq);
        return new String(zzedVar.zzN(), iZzd, iZzq);
    }

    private static HashMap zzj(zzed zzedVar) {
        int iZzp = zzedVar.zzp();
        HashMap map = new HashMap(iZzp);
        for (int i7 = 0; i7 < iZzp; i7++) {
            String strZzi = zzi(zzedVar);
            Object objZzh = zzh(zzedVar, zzedVar.zzm());
            if (objZzh != null) {
                map.put(strZzi, objZzh);
            }
        }
        return map;
    }

    @Override // com.google.android.gms.internal.ads.zzaff
    public final boolean zza(zzed zzedVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaff
    public final boolean zzb(zzed zzedVar, long j) {
        if (zzedVar.zzm() == 2 && "onMetaData".equals(zzi(zzedVar)) && zzedVar.zzb() != 0 && zzedVar.zzm() == 8) {
            HashMap mapZzj = zzj(zzedVar);
            Object obj = mapZzj.get("duration");
            if (obj instanceof Double) {
                double dDoubleValue = ((Double) obj).doubleValue();
                if (dDoubleValue > 0.0d) {
                    this.zzb = (long) (dDoubleValue * 1000000.0d);
                }
            }
            Object obj2 = mapZzj.get("keyframes");
            if (obj2 instanceof Map) {
                Map map = (Map) obj2;
                Object obj3 = map.get("filepositions");
                Object obj4 = map.get("times");
                if ((obj3 instanceof List) && (obj4 instanceof List)) {
                    List list = (List) obj3;
                    List list2 = (List) obj4;
                    int size = list2.size();
                    this.zzc = new long[size];
                    this.zzd = new long[size];
                    for (int i7 = 0; i7 < size; i7++) {
                        Object obj5 = list.get(i7);
                        Object obj6 = list2.get(i7);
                        if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                            this.zzc = new long[0];
                            this.zzd = new long[0];
                            break;
                        }
                        this.zzc[i7] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.zzd[i7] = ((Double) obj5).longValue();
                    }
                }
            }
        }
        return false;
    }

    public final long zzc() {
        return this.zzb;
    }

    public final long[] zzd() {
        return this.zzd;
    }

    public final long[] zze() {
        return this.zzc;
    }
}
