package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzvw {
    public final java.lang.String zza;
    public final boolean zzb;
    public final boolean zzc;

    public zzvw(java.lang.String str, boolean z, boolean z2) {
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == com.google.android.gms.internal.ads.zzvw.class) {
            com.google.android.gms.internal.ads.zzvw zzvwVar = (com.google.android.gms.internal.ads.zzvw) obj;
            if (android.text.TextUtils.equals(this.zza, zzvwVar.zza) && this.zzb == zzvwVar.zzb && this.zzc == zzvwVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() + 31) * 31) + (true != this.zzb ? 1237 : 1231)) * 31) + (true == this.zzc ? 1231 : 1237);
    }
}
