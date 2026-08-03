package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzx {
    public final java.lang.String zza;
    public final java.lang.String zzb;

    static {
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        java.lang.Integer.toString(0, 36);
        java.lang.Integer.toString(1, 36);
    }

    public zzx(java.lang.String str, java.lang.String str2) {
        this.zza = com.google.android.gms.internal.ads.zzfl.zzi(str);
        this.zzb = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzx zzxVar = (com.google.android.gms.internal.ads.zzx) obj;
            if (java.util.Objects.equals(this.zza, zzxVar.zza) && java.util.Objects.equals(this.zzb, zzxVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zzb.hashCode() * 31;
        java.lang.String str = this.zza;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
