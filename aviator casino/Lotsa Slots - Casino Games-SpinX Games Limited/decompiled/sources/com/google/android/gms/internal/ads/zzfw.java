package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfw implements com.google.android.gms.internal.ads.zzao {
    public final int zza;

    public zzfw(int i) {
        this.zza = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.google.android.gms.internal.ads.zzfw) && this.zza == ((com.google.android.gms.internal.ads.zzfw) obj).zza;
    }

    public final int hashCode() {
        return this.zza;
    }

    public final java.lang.String toString() {
        int i = this.zza;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 19);
        sb.append("Mp4AlternateGroup: ");
        sb.append(i);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public /* synthetic */ void zza(com.google.android.gms.internal.ads.zzam zzamVar) {
        com.google.android.gms.internal.ads.zzao.CC.$default$zza(this, zzamVar);
    }
}
