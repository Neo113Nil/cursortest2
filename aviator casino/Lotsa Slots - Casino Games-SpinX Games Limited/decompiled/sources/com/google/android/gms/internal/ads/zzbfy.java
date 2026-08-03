package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbfy {
    final long zza;
    final java.lang.String zzb;
    final int zzc;

    zzbfy(long j, java.lang.String str, int i) {
        this.zza = j;
        this.zzb = str;
        this.zzc = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.ads.zzbfy)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzbfy zzbfyVar = (com.google.android.gms.internal.ads.zzbfy) obj;
        return zzbfyVar.zza == this.zza && zzbfyVar.zzc == this.zzc;
    }

    public final int hashCode() {
        return (int) this.zza;
    }
}
