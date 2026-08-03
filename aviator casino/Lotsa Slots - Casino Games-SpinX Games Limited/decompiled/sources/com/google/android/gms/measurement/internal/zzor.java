package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
abstract class zzor extends com.google.android.gms.measurement.internal.zzok {
    private boolean zza;

    zzor(com.google.android.gms.measurement.internal.zzpf zzpfVar) {
        super(zzpfVar);
        this.zzg.zzad();
    }

    final boolean zzax() {
        return this.zza;
    }

    protected final void zzay() {
        if (!zzax()) {
            throw new java.lang.IllegalStateException("Not initialized");
        }
    }

    public final void zzaz() {
        if (this.zza) {
            throw new java.lang.IllegalStateException("Can't initialize twice");
        }
        zzbb();
        this.zzg.zzae();
        this.zza = true;
    }

    protected abstract boolean zzbb();
}
