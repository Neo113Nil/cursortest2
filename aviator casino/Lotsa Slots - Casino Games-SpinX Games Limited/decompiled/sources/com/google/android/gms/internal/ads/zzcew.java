package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzcew {
    final /* synthetic */ com.google.android.gms.internal.ads.zzcex zza;
    private long zzb;
    private long zzc;

    public zzcew(com.google.android.gms.internal.ads.zzcex zzcexVar) {
        java.util.Objects.requireNonNull(zzcexVar);
        this.zza = zzcexVar;
        this.zzb = -1L;
        this.zzc = -1L;
    }

    public final long zza() {
        return this.zzc;
    }

    public final void zzb() {
        this.zzc = this.zza.zzk().elapsedRealtime();
    }

    public final void zzc() {
        this.zzb = this.zza.zzk().elapsedRealtime();
    }

    public final android.os.Bundle zzd() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putLong("topen", this.zzb);
        bundle.putLong("tclose", this.zzc);
        return bundle;
    }
}
