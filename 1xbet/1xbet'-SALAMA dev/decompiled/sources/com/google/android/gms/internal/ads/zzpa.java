package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzpa {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;

    public final zzpa zza(boolean z4) {
        this.zza = true;
        return this;
    }

    public final zzpa zzb(boolean z4) {
        this.zzb = z4;
        return this;
    }

    public final zzpa zzc(boolean z4) {
        this.zzc = z4;
        return this;
    }

    public final zzpc zzd() {
        if (this.zza || !(this.zzb || this.zzc)) {
            return new zzpc(this, null);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }
}
