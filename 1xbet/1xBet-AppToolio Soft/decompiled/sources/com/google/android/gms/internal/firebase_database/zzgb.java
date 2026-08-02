package com.google.android.gms.internal.firebase_database;

/* loaded from: classes.dex */
public final class zzgb {
    public final long id;
    public final zzhh zznp;
    public final long zznq;
    public final boolean zznr;
    public final boolean zzns;

    public zzgb(long j, zzhh zzhhVar, long j2, boolean z, boolean z2) {
        this.id = j;
        if (zzhhVar.zzek() && !zzhhVar.isDefault()) {
            throw new IllegalArgumentException("Can't create TrackedQuery for a non-default query that loads all data");
        }
        this.zznp = zzhhVar;
        this.zznq = j2;
        this.zznr = z;
        this.zzns = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            zzgb zzgbVar = (zzgb) obj;
            if (this.id == zzgbVar.id && this.zznp.equals(zzgbVar.zznp) && this.zznq == zzgbVar.zznq && this.zznr == zzgbVar.zznr && this.zzns == zzgbVar.zzns) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((Long.valueOf(this.id).hashCode() * 31) + this.zznp.hashCode()) * 31) + Long.valueOf(this.zznq).hashCode()) * 31) + Boolean.valueOf(this.zznr).hashCode()) * 31) + Boolean.valueOf(this.zzns).hashCode();
    }

    public final String toString() {
        long j = this.id;
        String valueOf = String.valueOf(this.zznp);
        long j2 = this.zznq;
        boolean z = this.zznr;
        boolean z2 = this.zzns;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 109);
        sb.append("TrackedQuery{id=");
        sb.append(j);
        sb.append(", querySpec=");
        sb.append(valueOf);
        sb.append(", lastUse=");
        sb.append(j2);
        sb.append(", complete=");
        sb.append(z);
        sb.append(", active=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }

    public final zzgb zzdi() {
        return new zzgb(this.id, this.zznp, this.zznq, true, this.zzns);
    }
}
