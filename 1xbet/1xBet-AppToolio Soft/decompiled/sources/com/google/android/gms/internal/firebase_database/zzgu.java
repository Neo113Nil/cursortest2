package com.google.android.gms.internal.firebase_database;

/* loaded from: classes.dex */
public final class zzgu {
    private final zzit zzol;
    private final boolean zzom;
    private final boolean zzon;

    public zzgu(zzit zzitVar, boolean z, boolean z2) {
        this.zzol = zzitVar;
        this.zzom = z;
        this.zzon = z2;
    }

    public final boolean zzak(zzch zzchVar) {
        return zzchVar.isEmpty() ? this.zzom && !this.zzon : zzf(zzchVar.zzbw());
    }

    public final zzja zzd() {
        return this.zzol.zzd();
    }

    public final boolean zzdo() {
        return this.zzom;
    }

    public final boolean zzdp() {
        return this.zzon;
    }

    public final zzit zzdq() {
        return this.zzol;
    }

    public final boolean zzf(zzid zzidVar) {
        return (this.zzom && !this.zzon) || this.zzol.zzd().zzk(zzidVar);
    }
}
