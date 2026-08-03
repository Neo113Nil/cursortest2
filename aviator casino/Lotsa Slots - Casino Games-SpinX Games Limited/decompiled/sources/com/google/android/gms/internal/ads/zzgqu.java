package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgqu extends com.google.android.gms.internal.ads.zzgrv {
    private final int zza;
    private final java.lang.String zzb;
    private final int zzc;

    /* synthetic */ zzgqu(int i, java.lang.String str, int i2, byte[] bArr) {
        this.zza = i;
        this.zzb = str;
        this.zzc = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        java.lang.String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.ads.zzgrv) {
            com.google.android.gms.internal.ads.zzgrv zzgrvVar = (com.google.android.gms.internal.ads.zzgrv) obj;
            if (this.zza == zzgrvVar.zza() && ((str = this.zzb) != null ? str.equals(zzgrvVar.zzb()) : zzgrvVar.zzb() == null) && this.zzc == zzgrvVar.zzc()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.zzb;
        return (((str == null ? 0 : str.hashCode()) ^ ((this.zza ^ 1000003) * 1000003)) * 1000003) ^ this.zzc;
    }

    public final java.lang.String toString() {
        int i = this.zza;
        int length = java.lang.String.valueOf(i).length();
        java.lang.String str = this.zzb;
        int length2 = java.lang.String.valueOf(str).length();
        int i2 = this.zzc;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 46 + length2 + 9 + java.lang.String.valueOf(i2).length() + 1);
        sb.append("OverlayDisplayState{statusCode=");
        sb.append(i);
        sb.append(", sessionToken=");
        sb.append(str);
        sb.append(", uiMode=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgrv
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgrv
    public final java.lang.String zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgrv
    public final int zzc() {
        return this.zzc;
    }
}
