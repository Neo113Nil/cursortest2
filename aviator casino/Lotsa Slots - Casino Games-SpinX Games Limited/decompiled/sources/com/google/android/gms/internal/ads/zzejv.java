package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzejv extends com.google.android.gms.internal.ads.zzejy {
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final android.graphics.drawable.Drawable zzc;

    zzejv(java.lang.String str, java.lang.String str2, android.graphics.drawable.Drawable drawable) {
        this.zza = str;
        if (str2 == null) {
            throw new java.lang.NullPointerException("Null imageUrl");
        }
        this.zzb = str2;
        this.zzc = drawable;
    }

    public final boolean equals(java.lang.Object obj) {
        android.graphics.drawable.Drawable drawable;
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.ads.zzejy) {
            com.google.android.gms.internal.ads.zzejy zzejyVar = (com.google.android.gms.internal.ads.zzejy) obj;
            java.lang.String str = this.zza;
            if (str != null ? str.equals(zzejyVar.zza()) : zzejyVar.zza() == null) {
                if (this.zzb.equals(zzejyVar.zzb()) && ((drawable = this.zzc) != null ? drawable.equals(zzejyVar.zzc()) : zzejyVar.zzc() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.zzc);
        java.lang.String str = this.zza;
        int length = java.lang.String.valueOf(str).length();
        int length2 = java.lang.String.valueOf(valueOf).length();
        java.lang.String str2 = this.zzb;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 42 + str2.length() + 7 + length2 + 1);
        sb.append("OfflineAdAssets{advertiserName=");
        sb.append(str);
        sb.append(", imageUrl=");
        sb.append(str2);
        sb.append(", icon=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzejy
    final java.lang.String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzejy
    final java.lang.String zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzejy
    final android.graphics.drawable.Drawable zzc() {
        return this.zzc;
    }

    public final int hashCode() {
        java.lang.String str = this.zza;
        int hashCode = (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.zzb.hashCode();
        android.graphics.drawable.Drawable drawable = this.zzc;
        return (hashCode * 1000003) ^ (drawable != null ? drawable.hashCode() : 0);
    }
}
