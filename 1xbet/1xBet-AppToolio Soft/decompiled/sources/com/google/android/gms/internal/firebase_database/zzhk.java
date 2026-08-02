package com.google.android.gms.internal.firebase_database;

/* loaded from: classes.dex */
public final class zzhk {
    private final zzgu zzpz;
    private final zzgu zzqa;

    public zzhk(zzgu zzguVar, zzgu zzguVar2) {
        this.zzpz = zzguVar;
        this.zzqa = zzguVar2;
    }

    public final zzhk zza(zzit zzitVar, boolean z, boolean z2) {
        return new zzhk(new zzgu(zzitVar, z, z2), this.zzqa);
    }

    public final zzhk zzb(zzit zzitVar, boolean z, boolean z2) {
        return new zzhk(this.zzpz, new zzgu(zzitVar, z, z2));
    }

    public final zzgu zzer() {
        return this.zzpz;
    }

    public final zzja zzes() {
        if (this.zzpz.zzdo()) {
            return this.zzpz.zzd();
        }
        return null;
    }

    public final zzgu zzet() {
        return this.zzqa;
    }

    public final zzja zzeu() {
        if (this.zzqa.zzdo()) {
            return this.zzqa.zzd();
        }
        return null;
    }
}
