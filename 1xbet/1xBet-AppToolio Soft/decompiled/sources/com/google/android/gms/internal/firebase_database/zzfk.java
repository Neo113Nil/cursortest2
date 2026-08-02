package com.google.android.gms.internal.firebase_database;

/* loaded from: classes.dex */
public final class zzfk extends zzfl {
    private final zzbv zzmm;

    public zzfk(zzfn zzfnVar, zzch zzchVar, zzbv zzbvVar) {
        super(zzfm.Merge, zzfnVar, zzchVar);
        this.zzmm = zzbvVar;
    }

    public final String toString() {
        return String.format("Merge { path=%s, source=%s, children=%s }", this.zzap, this.zzmo, this.zzmm);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzfl
    public final zzfl zzc(zzid zzidVar) {
        if (!this.zzap.isEmpty()) {
            if (this.zzap.zzbw().equals(zzidVar)) {
                return new zzfk(this.zzmo, this.zzap.zzbx(), this.zzmm);
            }
            return null;
        }
        zzbv zzg = this.zzmm.zzg(new zzch(zzidVar));
        if (zzg.isEmpty()) {
            return null;
        }
        return zzg.zzbg() != null ? new zzfp(this.zzmo, zzch.zzbt(), zzg.zzbg()) : new zzfk(this.zzmo, zzch.zzbt(), zzg);
    }

    public final zzbv zzcx() {
        return this.zzmm;
    }
}
