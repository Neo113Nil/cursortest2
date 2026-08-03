package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhk extends com.google.android.gms.internal.ads.zzhh {
    private final com.google.android.gms.internal.ads.zzhj zza;
    private android.net.Uri zzb;
    private byte[] zzc;
    private int zzd;
    private int zze;
    private boolean zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhk(final byte[] bArr) {
        super(false);
        com.google.android.gms.internal.ads.zzhj zzhjVar = new com.google.android.gms.internal.ads.zzhj() { // from class: com.google.android.gms.internal.ads.zzhi
            @Override // com.google.android.gms.internal.ads.zzhj
            public final /* synthetic */ byte[] zza(android.net.Uri uri) {
                return bArr;
            }
        };
        this.zza = zzhjVar;
        com.google.android.gms.internal.ads.zzgtj.zza(bArr.length > 0);
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.zze;
        if (i3 == 0) {
            return -1;
        }
        int min = java.lang.Math.min(i2, i3);
        byte[] bArr2 = this.zzc;
        bArr2.getClass();
        java.lang.System.arraycopy(bArr2, this.zzd, bArr, i, min);
        this.zzd += min;
        this.zze -= min;
        zzh(min);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final long zzb(com.google.android.gms.internal.ads.zzht zzhtVar) throws java.io.IOException {
        zzf(zzhtVar);
        android.net.Uri uri = zzhtVar.zza;
        this.zzb = uri;
        this.zzc = this.zza.zza(uri);
        long j = zzhtVar.zze;
        int length = this.zzc.length;
        if (j > length) {
            throw new com.google.android.gms.internal.ads.zzhq(2008);
        }
        int i = (int) j;
        this.zzd = i;
        int i2 = length - i;
        this.zze = i2;
        long j2 = zzhtVar.zzf;
        if (j2 != -1) {
            this.zze = (int) java.lang.Math.min(i2, j2);
        }
        this.zzf = true;
        zzg(zzhtVar);
        return j2 != -1 ? j2 : this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final android.net.Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final void zzd() {
        if (this.zzf) {
            this.zzf = false;
            zzi();
        }
        this.zzb = null;
        this.zzc = null;
    }
}
