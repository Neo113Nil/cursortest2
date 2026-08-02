package com.google.android.gms.internal.firebase_database;

import com.google.firebase.database.DatabaseError;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class zzce {
    private zzcf zzhp;
    private AtomicBoolean zzho = new AtomicBoolean(false);
    private boolean zzhq = false;

    public abstract zzce zza(zzhh zzhhVar);

    public abstract zzgx zza(zzgw zzgwVar, zzhh zzhhVar);

    public final void zza(zzcf zzcfVar) {
        this.zzhp = zzcfVar;
    }

    public abstract void zza(zzgx zzgxVar);

    public abstract void zza(DatabaseError databaseError);

    public abstract boolean zza(zzgz zzgzVar);

    public abstract zzhh zzbe();

    public final void zzbr() {
        zzcf zzcfVar;
        if (!this.zzho.compareAndSet(false, true) || (zzcfVar = this.zzhp) == null) {
            return;
        }
        zzcfVar.zzd(this);
        this.zzhp = null;
    }

    public final boolean zzbs() {
        return this.zzho.get();
    }

    public abstract boolean zzc(zzce zzceVar);

    public final void zze(boolean z) {
        this.zzhq = true;
    }
}
