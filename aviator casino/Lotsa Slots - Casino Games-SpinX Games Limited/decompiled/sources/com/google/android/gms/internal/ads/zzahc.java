package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzahc {
    public static final com.google.android.gms.internal.ads.zzahc zza = new com.google.android.gms.internal.ads.zzahc(0, 0);
    public final long zzb;
    public final long zzc;

    public zzahc(long j, long j2) {
        this.zzb = j;
        this.zzc = j2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzahc zzahcVar = (com.google.android.gms.internal.ads.zzahc) obj;
            if (this.zzb == zzahcVar.zzb && this.zzc == zzahcVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzb) * 31) + ((int) this.zzc);
    }

    public final java.lang.String toString() {
        long j = this.zzb;
        int length = java.lang.String.valueOf(j).length();
        long j2 = this.zzc;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 19 + java.lang.String.valueOf(j2).length() + 1);
        sb.append("[timeUs=");
        sb.append(j);
        sb.append(", position=");
        sb.append(j2);
        sb.append(com.ironsource.X3.j.e);
        return sb.toString();
    }
}
