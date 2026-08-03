package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzqz {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;
    private int zzd = 0;

    public final com.google.android.gms.internal.ads.zzqz zza(boolean z) {
        this.zza = z;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzqz zzb(boolean z) {
        this.zzb = z;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzqz zzc(boolean z) {
        this.zzc = z;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzqz zzd(int i) {
        this.zzd = i;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzra zze() {
        if (this.zza || !(this.zzb || this.zzc)) {
            return new com.google.android.gms.internal.ads.zzra(this, null);
        }
        throw new java.lang.IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
    }

    final /* synthetic */ boolean zzf() {
        return this.zza;
    }

    final /* synthetic */ boolean zzg() {
        return this.zzb;
    }

    final /* synthetic */ boolean zzh() {
        return this.zzc;
    }

    final /* synthetic */ int zzi() {
        return this.zzd;
    }
}
