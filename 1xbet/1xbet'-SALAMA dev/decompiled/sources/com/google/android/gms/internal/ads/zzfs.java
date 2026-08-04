package com.google.android.gms.internal.ads;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class zzfs extends zzfq {
    private Uri zza;
    private byte[] zzb;
    private int zzc;
    private int zzd;
    private boolean zze;
    private final zzfr zzf;

    public zzfs(byte[] bArr) {
        zzfr zzfrVar = new zzfr(bArr);
        super(false);
        this.zzf = zzfrVar;
        zzcv.zzd(bArr.length > 0);
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        int i9 = this.zzd;
        if (i9 == 0) {
            return -1;
        }
        int iMin = Math.min(i8, i9);
        byte[] bArr2 = this.zzb;
        zzcv.zzb(bArr2);
        System.arraycopy(bArr2, this.zzc, bArr, i7, iMin);
        this.zzc += iMin;
        this.zzd -= iMin;
        zzg(iMin);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final long zzb(zzgc zzgcVar) throws zzfy {
        zzi(zzgcVar);
        this.zza = zzgcVar.zza;
        byte[] bArr = this.zzf.zza;
        this.zzb = bArr;
        long j = zzgcVar.zze;
        int length = bArr.length;
        if (j > length) {
            throw new zzfy(2008);
        }
        int i7 = (int) j;
        this.zzc = i7;
        int i8 = length - i7;
        this.zzd = i8;
        long j3 = zzgcVar.zzf;
        if (j3 != -1) {
            this.zzd = (int) Math.min(i8, j3);
        }
        this.zze = true;
        zzj(zzgcVar);
        long j7 = zzgcVar.zzf;
        return j7 != -1 ? j7 : this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final Uri zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final void zzd() {
        if (this.zze) {
            this.zze = false;
            zzh();
        }
        this.zza = null;
        this.zzb = null;
    }
}
