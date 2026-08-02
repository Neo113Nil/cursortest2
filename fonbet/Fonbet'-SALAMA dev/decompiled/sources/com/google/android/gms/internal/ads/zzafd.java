package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
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
            int zzp = zzedVar.zzp();
            ArrayList arrayList = new ArrayList(zzp);
            for (int i8 = 0; i8 < zzp; i8++) {
                Object zzh = zzh(zzedVar, zzedVar.zzm());
                if (zzh != null) {
                    arrayList.add(zzh);
                }
            }
            return arrayList;
        }
        HashMap hashMap = new HashMap();
        while (true) {
            String zzi = zzi(zzedVar);
            int zzm = zzedVar.zzm();
            if (zzm == 9) {
                return hashMap;
            }
            Object zzh2 = zzh(zzedVar, zzm);
            if (zzh2 != null) {
                hashMap.put(zzi, zzh2);
            }
        }
    }

    private static String zzi(zzed zzedVar) {
        int zzq = zzedVar.zzq();
        int zzd = zzedVar.zzd();
        zzedVar.zzM(zzq);
        return new String(zzedVar.zzN(), zzd, zzq);
    }

    private static HashMap zzj(zzed zzedVar) {
        int zzp = zzedVar.zzp();
        HashMap hashMap = new HashMap(zzp);
        for (int i7 = 0; i7 < zzp; i7++) {
            String zzi = zzi(zzedVar);
            Object zzh = zzh(zzedVar, zzedVar.zzm());
            if (zzh != null) {
                hashMap.put(zzi, zzh);
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzaff
    public final boolean zza(zzed zzedVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaff
    public final boolean zzb(zzed zzedVar, long j) {
        if (zzedVar.zzm() == 2 && "onMetaData".equals(zzi(zzedVar)) && zzedVar.zzb() != 0 && zzedVar.zzm() == 8) {
            HashMap zzj = zzj(zzedVar);
            Object obj = zzj.get("duration");
            if (obj instanceof Double) {
                double doubleValue = ((Double) obj).doubleValue();
                if (doubleValue > 0.0d) {
                    this.zzb = (long) (doubleValue * 1000000.0d);
                }
            }
            Object obj2 = zzj.get("keyframes");
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
