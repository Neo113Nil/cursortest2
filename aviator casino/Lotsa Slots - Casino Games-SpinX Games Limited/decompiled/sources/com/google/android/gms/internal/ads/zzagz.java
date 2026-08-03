package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzagz {
    public final com.google.android.gms.internal.ads.zzahc zza;
    public final com.google.android.gms.internal.ads.zzahc zzb;

    public zzagz(com.google.android.gms.internal.ads.zzahc zzahcVar, com.google.android.gms.internal.ads.zzahc zzahcVar2) {
        this.zza = zzahcVar;
        this.zzb = zzahcVar2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzagz zzagzVar = (com.google.android.gms.internal.ads.zzagz) obj;
            if (this.zza.equals(zzagzVar.zza) && this.zzb.equals(zzagzVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza.hashCode() * 31) + this.zzb.hashCode();
    }

    public final java.lang.String toString() {
        com.google.android.gms.internal.ads.zzahc zzahcVar = this.zza;
        com.google.android.gms.internal.ads.zzahc zzahcVar2 = this.zzb;
        java.lang.String obj = zzahcVar.toString();
        java.lang.String concat = zzahcVar.equals(zzahcVar2) ? "" : ", ".concat(zzahcVar2.toString());
        java.lang.StringBuilder sb = new java.lang.StringBuilder(obj.length() + 1 + concat.length() + 1);
        sb.append(com.ironsource.X3.j.d);
        sb.append(obj);
        sb.append(concat);
        sb.append(com.ironsource.X3.j.e);
        return sb.toString();
    }
}
