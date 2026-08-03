package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
abstract class zzg extends com.google.android.gms.measurement.internal.zzf {
    private boolean zza;

    zzg(com.google.android.gms.measurement.internal.zzib zzibVar) {
        super(zzibVar);
        this.zzu.zzF();
    }

    final boolean zza() {
        return this.zza;
    }

    protected final void zzb() {
        if (!zza()) {
            throw new java.lang.IllegalStateException("Not initialized");
        }
    }

    public final void zzc() {
        if (this.zza) {
            throw new java.lang.IllegalStateException("Can't initialize twice");
        }
        if (zze()) {
            return;
        }
        this.zzu.zzG();
        this.zza = true;
    }

    public final void zzd() {
        if (this.zza) {
            throw new java.lang.IllegalStateException("Can't initialize twice");
        }
        zzf();
        this.zzu.zzG();
        this.zza = true;
    }

    protected abstract boolean zze();

    protected void zzf() {
    }
}
