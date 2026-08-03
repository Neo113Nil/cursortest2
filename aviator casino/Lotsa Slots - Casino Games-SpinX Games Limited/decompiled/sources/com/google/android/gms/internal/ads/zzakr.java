package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzakr implements com.google.android.gms.internal.ads.zzao {
    public final float zza;
    public final com.google.android.gms.internal.ads.zzakq zzb;
    public final com.google.android.gms.internal.ads.zzakq zzc;

    private zzakr(float f, com.google.android.gms.internal.ads.zzakq zzakqVar, com.google.android.gms.internal.ads.zzakq zzakqVar2) {
        this.zza = f;
        this.zzb = zzakqVar;
        this.zzc = zzakqVar2;
    }

    public static com.google.android.gms.internal.ads.zzakr zzb(float f, int i, int i2) {
        com.google.android.gms.internal.ads.zzakq zza = com.google.android.gms.internal.ads.zzakq.zza(i);
        com.google.android.gms.internal.ads.zzakq zza2 = com.google.android.gms.internal.ads.zzakq.zza(i2);
        if (f <= 0.0f && zza == null && zza2 == null) {
            return null;
        }
        return new com.google.android.gms.internal.ads.zzakr(f, zza, zza2);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.ads.zzakr)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzakr zzakrVar = (com.google.android.gms.internal.ads.zzakr) obj;
        return java.lang.Float.compare(this.zza, zzakrVar.zza) == 0 && java.util.Objects.equals(this.zzb, zzakrVar.zzb) && java.util.Objects.equals(this.zzc, zzakrVar.zzc);
    }

    public final int hashCode() {
        int floatToIntBits = java.lang.Float.floatToIntBits(this.zza) * 31;
        com.google.android.gms.internal.ads.zzakq zzakqVar = this.zzb;
        int hashCode = (floatToIntBits + (zzakqVar != null ? zzakqVar.hashCode() : 0)) * 31;
        com.google.android.gms.internal.ads.zzakq zzakqVar2 = this.zzc;
        return hashCode + (zzakqVar2 != null ? zzakqVar2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.zzb);
        java.lang.String valueOf2 = java.lang.String.valueOf(this.zzc);
        float f = this.zza;
        int length = java.lang.String.valueOf(f).length();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 37 + java.lang.String.valueOf(valueOf).length() + 10 + java.lang.String.valueOf(valueOf2).length());
        sb.append("ReplayGain Xing/Info: peak=");
        sb.append(f);
        sb.append(", field 1=");
        sb.append(valueOf);
        sb.append(", field 2=");
        sb.append(valueOf2);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public /* synthetic */ void zza(com.google.android.gms.internal.ads.zzam zzamVar) {
        com.google.android.gms.internal.ads.zzao.CC.$default$zza(this, zzamVar);
    }
}
