package com.google.android.gms.internal.firebase_database;

/* loaded from: classes.dex */
public final class zzfi extends zzfl {
    private final boolean zzmk;
    private final zzgj<Boolean> zzml;

    public zzfi(zzch zzchVar, zzgj<Boolean> zzgjVar, boolean z) {
        super(zzfm.AckUserWrite, zzfn.zzmu, zzchVar);
        this.zzml = zzgjVar;
        this.zzmk = z;
    }

    public final String toString() {
        return String.format("AckUserWrite { path=%s, revert=%s, affectedTree=%s }", this.zzap, Boolean.valueOf(this.zzmk), this.zzml);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzfl
    public final zzfl zzc(zzid zzidVar) {
        if (!this.zzap.isEmpty()) {
            zzkq.zza(this.zzap.zzbw().equals(zzidVar), "operationForChild called for unrelated child.");
            return new zzfi(this.zzap.zzbx(), this.zzml, this.zzmk);
        }
        if (this.zzml.getValue() == null) {
            return new zzfi(zzch.zzbt(), this.zzml.zzag(new zzch(zzidVar)), this.zzmk);
        }
        zzkq.zza(this.zzml.zzdm().isEmpty(), "affectedTree should not have overlapping affected paths.");
        return this;
    }

    public final zzgj<Boolean> zzcv() {
        return this.zzml;
    }

    public final boolean zzcw() {
        return this.zzmk;
    }
}
