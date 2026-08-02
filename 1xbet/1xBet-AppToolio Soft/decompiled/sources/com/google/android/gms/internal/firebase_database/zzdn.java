package com.google.android.gms.internal.firebase_database;

/* loaded from: classes.dex */
public final class zzdn {
    public String zzct;
    public String zzcu;
    public boolean zzcv;
    public String zzka;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzdn zzdnVar = (zzdn) obj;
        if (this.zzcv == zzdnVar.zzcv && this.zzct.equals(zzdnVar.zzct)) {
            return this.zzcu.equals(zzdnVar.zzcu);
        }
        return false;
    }

    public final int hashCode() {
        return (((this.zzct.hashCode() * 31) + (this.zzcv ? 1 : 0)) * 31) + this.zzcu.hashCode();
    }

    public final String toString() {
        String str = this.zzcv ? "s" : "";
        String str2 = this.zzct;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7 + String.valueOf(str2).length());
        sb.append("http");
        sb.append(str);
        sb.append("://");
        sb.append(str2);
        return sb.toString();
    }
}
