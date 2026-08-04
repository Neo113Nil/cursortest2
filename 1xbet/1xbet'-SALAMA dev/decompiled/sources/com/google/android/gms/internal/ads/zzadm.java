package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzadm implements zzadu {
    private final zzdr zza;
    private final zzdr zzb;
    private long zzc;

    public zzadm(long[] jArr, long[] jArr2, long j) {
        int length = jArr.length;
        int length2 = jArr2.length;
        zzcv.zzd(length == length2);
        if (length2 <= 0 || jArr2[0] <= 0) {
            this.zza = new zzdr(length2);
            this.zzb = new zzdr(length2);
        } else {
            int i7 = length2 + 1;
            zzdr zzdrVar = new zzdr(i7);
            this.zza = zzdrVar;
            zzdr zzdrVar2 = new zzdr(i7);
            this.zzb = zzdrVar2;
            zzdrVar.zzc(0L);
            zzdrVar2.zzc(0L);
        }
        this.zza.zzd(jArr);
        this.zzb.zzd(jArr2);
        this.zzc = j;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final zzads zzg(long j) {
        zzdr zzdrVar = this.zzb;
        if (zzdrVar.zza() == 0) {
            zzadv zzadvVar = zzadv.zza;
            return new zzads(zzadvVar, zzadvVar);
        }
        int iZzb = zzen.zzb(zzdrVar, j, true, true);
        zzadv zzadvVar2 = new zzadv(this.zzb.zzb(iZzb), this.zza.zzb(iZzb));
        if (zzadvVar2.zzb != j) {
            zzdr zzdrVar2 = this.zzb;
            if (iZzb != zzdrVar2.zza() - 1) {
                int i7 = iZzb + 1;
                return new zzads(zzadvVar2, new zzadv(zzdrVar2.zzb(i7), this.zza.zzb(i7)));
            }
        }
        return new zzads(zzadvVar2, zzadvVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final boolean zzh() {
        return this.zzb.zza() > 0;
    }
}
