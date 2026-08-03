package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzqr {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;

    public final com.google.android.gms.internal.ads.zzqr zza(boolean z) {
        this.zza = z;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzqr zzb(boolean z) {
        this.zzb = z;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzqr zzc(boolean z) {
        this.zzc = z;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzqs zzd() {
        if (this.zza || !(this.zzb || this.zzc)) {
            return new com.google.android.gms.internal.ads.zzqs(this, null);
        }
        throw new java.lang.IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }

    final /* synthetic */ boolean zze() {
        return this.zza;
    }

    final /* synthetic */ boolean zzf() {
        return this.zzb;
    }

    final /* synthetic */ boolean zzg() {
        return this.zzc;
    }
}
