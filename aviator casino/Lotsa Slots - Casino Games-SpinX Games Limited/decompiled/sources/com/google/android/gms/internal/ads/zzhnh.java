package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzhnh {
    private final java.lang.Class zza;
    private final java.lang.Class zzb;

    /* synthetic */ zzhnh(java.lang.Class cls, java.lang.Class cls2, byte[] bArr) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.ads.zzhnh)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzhnh zzhnhVar = (com.google.android.gms.internal.ads.zzhnh) obj;
        return zzhnhVar.zza.equals(this.zza) && zzhnhVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.zza, this.zzb);
    }

    public final java.lang.String toString() {
        java.lang.Class cls = this.zzb;
        java.lang.String simpleName = this.zza.getSimpleName();
        java.lang.String simpleName2 = cls.getSimpleName();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(simpleName).length() + 22 + java.lang.String.valueOf(simpleName2).length());
        sb.append(simpleName);
        sb.append(" with primitive type: ");
        sb.append(simpleName2);
        return sb.toString();
    }
}
