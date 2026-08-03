package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzga implements com.google.android.gms.internal.ads.zzao {
    public final float zza;
    public final float zzb;

    public zzga(float f, float f2) {
        boolean z = false;
        if (f >= -90.0f && f <= 90.0f && f2 >= -180.0f && f2 <= 180.0f) {
            z = true;
        }
        com.google.android.gms.internal.ads.zzgtj.zzb(z, "Invalid latitude or longitude");
        this.zza = f;
        this.zzb = f2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzga zzgaVar = (com.google.android.gms.internal.ads.zzga) obj;
            if (this.zza == zzgaVar.zza && this.zzb == zzgaVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((java.lang.Float.floatToIntBits(this.zza) + com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + java.lang.Float.floatToIntBits(this.zzb);
    }

    public final java.lang.String toString() {
        float f = this.zza;
        int length = java.lang.String.valueOf(f).length();
        float f2 = this.zzb;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 26 + java.lang.String.valueOf(f2).length());
        sb.append("xyz: latitude=");
        sb.append(f);
        sb.append(", longitude=");
        sb.append(f2);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public /* synthetic */ void zza(com.google.android.gms.internal.ads.zzam zzamVar) {
        com.google.android.gms.internal.ads.zzao.CC.$default$zza(this, zzamVar);
    }
}
