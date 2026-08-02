package com.google.android.gms.internal.firebase_database;

/* loaded from: classes.dex */
public abstract class zzfl {
    protected final zzch zzap;
    private final zzfm zzmn;
    protected final zzfn zzmo;

    protected zzfl(zzfm zzfmVar, zzfn zzfnVar, zzch zzchVar) {
        this.zzmn = zzfmVar;
        this.zzmo = zzfnVar;
        this.zzap = zzchVar;
    }

    public abstract zzfl zzc(zzid zzidVar);

    public final zzfn zzcy() {
        return this.zzmo;
    }

    public final zzfm zzcz() {
        return this.zzmn;
    }

    public final zzch zzg() {
        return this.zzap;
    }
}
