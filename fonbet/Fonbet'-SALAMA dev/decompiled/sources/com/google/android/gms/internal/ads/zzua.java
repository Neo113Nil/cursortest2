package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
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
        long j = Long.MAX_VALUE;
        long j3 = Long.MAX_VALUE;
        for (int i7 = 0; i7 < this.zza.size(); i7++) {
            zztz zztzVar = (zztz) this.zza.get(i7);
            long zzb = zztzVar.zzb();
            if ((zztzVar.zza().contains(1) || zztzVar.zza().contains(2) || zztzVar.zza().contains(4)) && zzb != Long.MIN_VALUE) {
                j = Math.min(j, zzb);
            }
            if (zzb != Long.MIN_VALUE) {
                j3 = Math.min(j3, zzb);
            }
        }
        if (j != Long.MAX_VALUE) {
            this.zzb = j;
            return j;
        }
        if (j3 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j7 = this.zzb;
        return j7 != -9223372036854775807L ? j7 : j3;
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final long zzc() {
        long j = Long.MAX_VALUE;
        for (int i7 = 0; i7 < this.zza.size(); i7++) {
            long zzc = ((zztz) this.zza.get(i7)).zzc();
            if (zzc != Long.MIN_VALUE) {
                j = Math.min(j, zzc);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final void zzm(long j) {
        for (int i7 = 0; i7 < this.zza.size(); i7++) {
            ((zztz) this.zza.get(i7)).zzm(j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final boolean zzo(zzkm zzkmVar) {
        boolean z4;
        boolean z7 = false;
        do {
            long zzc = zzc();
            if (zzc == Long.MIN_VALUE) {
                break;
            }
            z4 = false;
            for (int i7 = 0; i7 < this.zza.size(); i7++) {
                long zzc2 = ((zztz) this.zza.get(i7)).zzc();
                boolean z8 = zzc2 != Long.MIN_VALUE && zzc2 <= zzkmVar.zza;
                if (zzc2 == zzc || z8) {
                    z4 |= ((zztz) this.zza.get(i7)).zzo(zzkmVar);
                }
            }
            z7 |= z4;
        } while (z4);
        return z7;
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
