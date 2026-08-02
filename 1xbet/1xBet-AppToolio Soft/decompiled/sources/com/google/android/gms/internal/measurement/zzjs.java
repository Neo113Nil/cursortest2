package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
abstract class zzjs extends zzjr {
    private boolean zzvn;

    zzjs(zzjt zzjtVar) {
        super(zzjtVar);
        this.zzalo.zzb(this);
    }

    final boolean isInitialized() {
        return this.zzvn;
    }

    protected final void zzch() {
        if (!isInitialized()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    protected abstract boolean zzgn();

    public final void zzm() {
        if (this.zzvn) {
            throw new IllegalStateException("Can't initialize twice");
        }
        zzgn();
        this.zzalo.zzll();
        this.zzvn = true;
    }
}
