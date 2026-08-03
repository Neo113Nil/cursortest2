package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzhnu {
    private final java.lang.Class zza;
    private final com.google.android.gms.internal.ads.zziaz zzb;

    /* synthetic */ zzhnu(java.lang.Class cls, com.google.android.gms.internal.ads.zziaz zziazVar, byte[] bArr) {
        this.zza = cls;
        this.zzb = zziazVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.ads.zzhnu)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzhnu zzhnuVar = (com.google.android.gms.internal.ads.zzhnu) obj;
        return zzhnuVar.zza.equals(this.zza) && zzhnuVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.zza, this.zzb);
    }

    public final java.lang.String toString() {
        com.google.android.gms.internal.ads.zziaz zziazVar = this.zzb;
        java.lang.String simpleName = this.zza.getSimpleName();
        java.lang.String valueOf = java.lang.String.valueOf(zziazVar);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(simpleName).length() + 21 + java.lang.String.valueOf(valueOf).length());
        sb.append(simpleName);
        sb.append(", object identifier: ");
        sb.append(valueOf);
        return sb.toString();
    }
}
