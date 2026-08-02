package com.google.android.gms.internal.firebase_database;

/* loaded from: classes.dex */
public final class zzfx {
    private static final zzgn<Boolean> zznk = new zzfy();
    private static final zzgn<Boolean> zznl = new zzfz();
    private static final zzgj<Boolean> zznm = new zzgj<>(true);
    private static final zzgj<Boolean> zznn = new zzgj<>(false);
    private final zzgj<Boolean> zznj;

    public zzfx() {
        this.zznj = zzgj.zzdl();
    }

    private zzfx(zzgj<Boolean> zzgjVar) {
        this.zznj = zzgjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzfx) && this.zznj.equals(((zzfx) obj).zznj);
    }

    public final int hashCode() {
        return this.zznj.hashCode();
    }

    public final String toString() {
        String zzgjVar = this.zznj.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(zzgjVar).length() + 14);
        sb.append("{PruneForest:");
        sb.append(zzgjVar);
        sb.append("}");
        return sb.toString();
    }

    public final <T> T zza(T t, zzgm<Void, T> zzgmVar) {
        return (T) this.zznj.zzb((zzgj<Boolean>) t, (zzgm<? super Boolean, zzgj<Boolean>>) new zzga(this, zzgmVar));
    }

    public final zzfx zzd(zzid zzidVar) {
        zzgj<Boolean> zze = this.zznj.zze(zzidVar);
        if (zze == null) {
            zze = new zzgj<>(this.zznj.getValue());
        } else if (zze.getValue() == null && this.zznj.getValue() != null) {
            zze = zze.zzb(zzch.zzbt(), (zzch) this.zznj.getValue());
        }
        return new zzfx(zze);
    }

    public final boolean zzdh() {
        return this.zznj.zzb(zznl);
    }

    public final boolean zzv(zzch zzchVar) {
        Boolean zzaf = this.zznj.zzaf(zzchVar);
        return zzaf != null && zzaf.booleanValue();
    }

    public final boolean zzw(zzch zzchVar) {
        Boolean zzaf = this.zznj.zzaf(zzchVar);
        return (zzaf == null || zzaf.booleanValue()) ? false : true;
    }

    public final zzfx zzx(zzch zzchVar) {
        if (this.zznj.zzb(zzchVar, zznk) == null) {
            return this.zznj.zzb(zzchVar, zznl) != null ? this : new zzfx(this.zznj.zza(zzchVar, zznm));
        }
        throw new IllegalArgumentException("Can't prune path that was kept previously!");
    }

    public final zzfx zzy(zzch zzchVar) {
        return this.zznj.zzb(zzchVar, zznk) != null ? this : new zzfx(this.zznj.zza(zzchVar, zznn));
    }
}
