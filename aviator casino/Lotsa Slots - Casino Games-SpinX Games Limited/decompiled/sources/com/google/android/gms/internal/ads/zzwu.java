package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzwu implements com.google.android.gms.internal.ads.zzze {
    private final com.google.android.gms.internal.ads.zzgwm zza;
    private long zzb;

    public zzwu(java.util.List list, java.util.List list2) {
        int i = com.google.android.gms.internal.ads.zzgwm.zzd;
        com.google.android.gms.internal.ads.zzgwj zzgwjVar = new com.google.android.gms.internal.ads.zzgwj();
        com.google.android.gms.internal.ads.zzgtj.zza(list.size() == list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzgwjVar.zzf(new com.google.android.gms.internal.ads.zzwt((com.google.android.gms.internal.ads.zzze) list.get(i2), (java.util.List) list2.get(i2)));
        }
        this.zza = zzgwjVar.zzi();
        this.zzb = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzze
    public final void zzg(long j) {
        int i = 0;
        while (true) {
            com.google.android.gms.internal.ads.zzgwm zzgwmVar = this.zza;
            if (i >= zzgwmVar.size()) {
                return;
            }
            ((com.google.android.gms.internal.ads.zzwt) zzgwmVar.get(i)).zzg(j);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzze
    public final long zzi() {
        int i = 0;
        long j = Long.MAX_VALUE;
        long j2 = Long.MAX_VALUE;
        while (true) {
            com.google.android.gms.internal.ads.zzgwm zzgwmVar = this.zza;
            if (i >= zzgwmVar.size()) {
                break;
            }
            com.google.android.gms.internal.ads.zzwt zzwtVar = (com.google.android.gms.internal.ads.zzwt) zzgwmVar.get(i);
            long zzi = zzwtVar.zzi();
            if ((zzwtVar.zza().contains(1) || zzwtVar.zza().contains(2) || zzwtVar.zza().contains(4)) && zzi != Long.MIN_VALUE) {
                j = java.lang.Math.min(j, zzi);
            }
            if (zzi != Long.MIN_VALUE) {
                j2 = java.lang.Math.min(j2, zzi);
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

    @Override // com.google.android.gms.internal.ads.zzze
    public final long zzl() {
        int i = 0;
        long j = Long.MAX_VALUE;
        while (true) {
            com.google.android.gms.internal.ads.zzgwm zzgwmVar = this.zza;
            if (i >= zzgwmVar.size()) {
                break;
            }
            long zzl = ((com.google.android.gms.internal.ads.zzwt) zzgwmVar.get(i)).zzl();
            if (zzl != Long.MIN_VALUE) {
                j = java.lang.Math.min(j, zzl);
            }
            i++;
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzze
    public final boolean zzm(com.google.android.gms.internal.ads.zzma zzmaVar) {
        boolean z;
        boolean z2 = false;
        do {
            long zzl = zzl();
            if (zzl == Long.MIN_VALUE) {
                break;
            }
            int i = 0;
            z = false;
            while (true) {
                com.google.android.gms.internal.ads.zzgwm zzgwmVar = this.zza;
                if (i >= zzgwmVar.size()) {
                    break;
                }
                long zzl2 = ((com.google.android.gms.internal.ads.zzwt) zzgwmVar.get(i)).zzl();
                boolean z3 = zzl2 != Long.MIN_VALUE && zzl2 <= zzmaVar.zza;
                if (zzl2 == zzl || z3) {
                    z |= ((com.google.android.gms.internal.ads.zzwt) zzgwmVar.get(i)).zzm(zzmaVar);
                }
                i++;
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    @Override // com.google.android.gms.internal.ads.zzze
    public final boolean zzn() {
        int i = 0;
        while (true) {
            com.google.android.gms.internal.ads.zzgwm zzgwmVar = this.zza;
            if (i >= zzgwmVar.size()) {
                return false;
            }
            if (((com.google.android.gms.internal.ads.zzwt) zzgwmVar.get(i)).zzn()) {
                return true;
            }
            i++;
        }
    }
}
