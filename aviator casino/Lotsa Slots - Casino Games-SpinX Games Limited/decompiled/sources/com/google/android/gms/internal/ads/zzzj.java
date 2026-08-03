package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzzj implements com.google.android.gms.internal.ads.zzzc {
    private final com.google.android.gms.internal.ads.zzzc zza;
    private final long zzb;

    public zzzj(com.google.android.gms.internal.ads.zzzc zzzcVar, long j) {
        this.zza = zzzcVar;
        this.zzb = j;
    }

    public final com.google.android.gms.internal.ads.zzzc zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    public final boolean zzb() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    public final void zzc() throws java.io.IOException {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    public final int zzd(com.google.android.gms.internal.ads.zzlw zzlwVar, com.google.android.gms.internal.ads.zziv zzivVar, int i) {
        int zzd = this.zza.zzd(zzlwVar, zzivVar, i);
        if (zzd != -4) {
            return zzd;
        }
        zzivVar.zze += this.zzb;
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    public final int zze(long j) {
        return this.zza.zze(j - this.zzb);
    }
}
