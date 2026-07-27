package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzrd {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;
    private int zzd = 0;

    public final zzrd zza(boolean z) {
        this.zza = z;
        return this;
    }

    public final zzrd zzb(boolean z) {
        this.zzb = z;
        return this;
    }

    public final zzrd zzc(boolean z) {
        this.zzc = z;
        return this;
    }

    public final zzrd zzd(int i) {
        this.zzd = i;
        return this;
    }

    public final zzre zze() {
        if (this.zza || !(this.zzb || this.zzc)) {
            return new zzre(this, null);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
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
