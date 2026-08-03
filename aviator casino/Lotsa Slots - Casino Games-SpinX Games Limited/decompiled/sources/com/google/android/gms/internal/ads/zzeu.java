package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzeu {
    public static final com.google.android.gms.internal.ads.zzeu zza = new com.google.android.gms.internal.ads.zzeu(-1, -1);
    private final int zzb;
    private final int zzc;

    static {
        new com.google.android.gms.internal.ads.zzeu(0, 0);
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        java.lang.Integer.toString(0, 36);
        java.lang.Integer.toString(1, 36);
    }

    public zzeu(int i, int i2) {
        boolean z = false;
        if ((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0)) {
            z = true;
        }
        com.google.android.gms.internal.ads.zzgtj.zza(z);
        this.zzb = i;
        this.zzc = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.ads.zzeu) {
            com.google.android.gms.internal.ads.zzeu zzeuVar = (com.google.android.gms.internal.ads.zzeu) obj;
            if (this.zzb == zzeuVar.zzb && this.zzc == zzeuVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        return ((i >>> 16) | (i << 16)) ^ this.zzc;
    }

    public final java.lang.String toString() {
        int i = this.zzb;
        int length = java.lang.String.valueOf(i).length();
        int i2 = this.zzc;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 1 + java.lang.String.valueOf(i2).length());
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        return sb.toString();
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzc;
    }
}
