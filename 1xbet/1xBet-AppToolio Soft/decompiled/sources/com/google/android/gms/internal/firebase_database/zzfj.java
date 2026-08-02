package com.google.android.gms.internal.firebase_database;

/* loaded from: classes.dex */
public final class zzfj extends zzfl {
    public zzfj(zzfn zzfnVar, zzch zzchVar) {
        super(zzfm.ListenComplete, zzfnVar, zzchVar);
    }

    public final String toString() {
        return String.format("ListenComplete { path=%s, source=%s }", this.zzap, this.zzmo);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzfl
    public final zzfl zzc(zzid zzidVar) {
        return this.zzap.isEmpty() ? new zzfj(this.zzmo, zzch.zzbt()) : new zzfj(this.zzmo, this.zzap.zzbx());
    }
}
