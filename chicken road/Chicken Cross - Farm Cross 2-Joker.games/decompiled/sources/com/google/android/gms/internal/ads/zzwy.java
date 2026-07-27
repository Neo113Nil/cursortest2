package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzwy implements zzzi {
    private final zzgxm zza;
    private long zzb;

    public zzwy(List list, List list2) {
        int i = zzgxm.zzd;
        zzgxj zzgxjVar = new zzgxj();
        zzguk.zza(list.size() == list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzgxjVar.zzf(new zzwx((zzzi) list.get(i2), (List) list2.get(i2)));
        }
        this.zza = zzgxjVar.zzi();
        this.zzb = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final long zzb() {
        int i = 0;
        long j = Long.MAX_VALUE;
        long j2 = Long.MAX_VALUE;
        while (true) {
            zzgxm zzgxmVar = this.zza;
            if (i >= zzgxmVar.size()) {
                break;
            }
            zzwx zzwxVar = (zzwx) zzgxmVar.get(i);
            long zzb = zzwxVar.zzb();
            if ((zzwxVar.zza().contains(1) || zzwxVar.zza().contains(2) || zzwxVar.zza().contains(4)) && zzb != Long.MIN_VALUE) {
                j = Math.min(j, zzb);
            }
            if (zzb != Long.MIN_VALUE) {
                j2 = Math.min(j2, zzb);
            }
            i++;
        }
        if (j != Long.MAX_VALUE) {
            this.zzb = j;
            return j;
        }
        if (j2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j3 = this.zzb;
        return j3 != -9223372036854775807L ? j3 : j2;
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final long zzc() {
        int i = 0;
        long j = Long.MAX_VALUE;
        while (true) {
            zzgxm zzgxmVar = this.zza;
            if (i >= zzgxmVar.size()) {
                break;
            }
            long zzc = ((zzwx) zzgxmVar.get(i)).zzc();
            if (zzc != Long.MIN_VALUE) {
                j = Math.min(j, zzc);
            }
            i++;
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final boolean zzd(zzme zzmeVar) {
        boolean z;
        boolean z2 = false;
        do {
            long zzc = zzc();
            if (zzc == Long.MIN_VALUE) {
                break;
            }
            int i = 0;
            z = false;
            while (true) {
                zzgxm zzgxmVar = this.zza;
                if (i >= zzgxmVar.size()) {
                    break;
                }
                long zzc2 = ((zzwx) zzgxmVar.get(i)).zzc();
                boolean z3 = zzc2 != Long.MIN_VALUE && zzc2 <= zzmeVar.zza;
                if (zzc2 == zzc || z3) {
                    z |= ((zzwx) zzgxmVar.get(i)).zzd(zzmeVar);
                }
                i++;
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final boolean zze() {
        int i = 0;
        while (true) {
            zzgxm zzgxmVar = this.zza;
            if (i >= zzgxmVar.size()) {
                return false;
            }
            if (((zzwx) zzgxmVar.get(i)).zze()) {
                return true;
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final void zzf(long j) {
        int i = 0;
        while (true) {
            zzgxm zzgxmVar = this.zza;
            if (i >= zzgxmVar.size()) {
                return;
            }
            ((zzwx) zzgxmVar.get(i)).zzf(j);
            i++;
        }
    }
}
