package com.google.android.gms.internal.firebase_database;

/* loaded from: classes.dex */
public final class zzfp extends zzfl {
    private final zzja zznc;

    public zzfp(zzfn zzfnVar, zzch zzchVar, zzja zzjaVar) {
        super(zzfm.Overwrite, zzfnVar, zzchVar);
        this.zznc = zzjaVar;
    }

    public final String toString() {
        return String.format("Overwrite { path=%s, source=%s, snapshot=%s }", this.zzap, this.zzmo, this.zznc);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzfl
    public final zzfl zzc(zzid zzidVar) {
        return this.zzap.isEmpty() ? new zzfp(this.zzmo, zzch.zzbt(), this.zznc.zzm(zzidVar)) : new zzfp(this.zzmo, this.zzap.zzbx(), this.zznc);
    }

    public final zzja zzdd() {
        return this.zznc;
    }
}
