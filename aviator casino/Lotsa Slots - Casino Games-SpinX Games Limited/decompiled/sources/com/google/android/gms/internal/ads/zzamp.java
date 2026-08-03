package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzamp implements com.google.android.gms.internal.ads.zzamv {
    private final com.google.android.gms.internal.ads.zzagl zza;
    private final com.google.android.gms.internal.ads.zzagk zzb;
    private long zzc = -1;
    private long zzd = -1;

    public zzamp(com.google.android.gms.internal.ads.zzagl zzaglVar, com.google.android.gms.internal.ads.zzagk zzagkVar) {
        this.zza = zzaglVar;
        this.zzb = zzagkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final long zza(com.google.android.gms.internal.ads.zzafz zzafzVar) {
        long j = this.zzd;
        if (j < 0) {
            return -1L;
        }
        this.zzd = -1L;
        return -(j + 2);
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void zzb(long j) {
        long[] jArr = this.zzb.zza;
        this.zzd = jArr[com.google.android.gms.internal.ads.zzfl.zzo(jArr, j, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final com.google.android.gms.internal.ads.zzahb zzc() {
        com.google.android.gms.internal.ads.zzgtj.zzi(this.zzc != -1);
        return new com.google.android.gms.internal.ads.zzagj(this.zza, this.zzc);
    }

    public final void zzd(long j) {
        this.zzc = j;
    }
}
