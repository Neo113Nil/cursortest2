package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzua implements zzwm {
    private final zzfwh zza;
    private long zzb;

    public zzua(List list, List list2) {
        int i7 = zzfwh.zzd;
        zzfwe zzfweVar = new zzfwe();
        zzcv.zzd(list.size() == list2.size());
        for (int i8 = 0; i8 < list.size(); i8++) {
            zzfweVar.zzf(new zztz((zzwm) list.get(i8), (List) list2.get(i8)));
        }
        this.zza = zzfweVar.zzi();
        this.zzb = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final long zzb() {
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        for (int i7 = 0; i7 < this.zza.size(); i7++) {
            zztz zztzVar = (zztz) this.zza.get(i7);
            long jZzb = zztzVar.zzb();
            if ((zztzVar.zza().contains(1) || zztzVar.zza().contains(2) || zztzVar.zza().contains(4)) && jZzb != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzb);
            }
            if (jZzb != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jZzb);
            }
        }
        if (jMin != Long.MAX_VALUE) {
            this.zzb = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j = this.zzb;
        return j != -9223372036854775807L ? j : jMin2;
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final long zzc() {
        long jMin = Long.MAX_VALUE;
        for (int i7 = 0; i7 < this.zza.size(); i7++) {
            long jZzc = ((zztz) this.zza.get(i7)).zzc();
            if (jZzc != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzc);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final void zzm(long j) {
        for (int i7 = 0; i7 < this.zza.size(); i7++) {
            ((zztz) this.zza.get(i7)).zzm(j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final boolean zzo(zzkm zzkmVar) {
        boolean zZzo;
        boolean z4 = false;
        do {
            long jZzc = zzc();
            if (jZzc == Long.MIN_VALUE) {
                break;
            }
            zZzo = false;
            for (int i7 = 0; i7 < this.zza.size(); i7++) {
                long jZzc2 = ((zztz) this.zza.get(i7)).zzc();
                boolean z7 = jZzc2 != Long.MIN_VALUE && jZzc2 <= zzkmVar.zza;
                if (jZzc2 == jZzc || z7) {
                    zZzo |= ((zztz) this.zza.get(i7)).zzo(zzkmVar);
                }
            }
            z4 |= zZzo;
        } while (zZzo);
        return z4;
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final boolean zzp() {
        for (int i7 = 0; i7 < this.zza.size(); i7++) {
            if (((zztz) this.zza.get(i7)).zzp()) {
                return true;
            }
        }
        return false;
    }
}
