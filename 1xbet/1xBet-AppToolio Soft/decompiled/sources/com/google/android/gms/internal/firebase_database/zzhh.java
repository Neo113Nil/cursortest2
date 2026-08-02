package com.google.android.gms.internal.firebase_database;

/* loaded from: classes.dex */
public final class zzhh {
    private final zzch zzap;
    private final zzhe zzat;

    public zzhh(zzch zzchVar, zzhe zzheVar) {
        this.zzap = zzchVar;
        this.zzat = zzheVar;
    }

    public static zzhh zzal(zzch zzchVar) {
        return new zzhh(zzchVar, zzhe.zzph);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzhh zzhhVar = (zzhh) obj;
        return this.zzap.equals(zzhhVar.zzap) && this.zzat.equals(zzhhVar.zzat);
    }

    public final int hashCode() {
        return (this.zzap.hashCode() * 31) + this.zzat.hashCode();
    }

    public final boolean isDefault() {
        return this.zzat.isDefault();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzap);
        String valueOf2 = String.valueOf(this.zzat);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append(":");
        sb.append(valueOf2);
        return sb.toString();
    }

    public final zzis zzeg() {
        return this.zzat.zzeg();
    }

    public final boolean zzek() {
        return this.zzat.zzek();
    }

    public final zzhe zzen() {
        return this.zzat;
    }

    public final zzch zzg() {
        return this.zzap;
    }
}
