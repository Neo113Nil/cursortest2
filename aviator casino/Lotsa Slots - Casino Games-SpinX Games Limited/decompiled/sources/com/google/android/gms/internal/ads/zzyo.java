package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzyo {
    public final int zza;
    public final boolean zzb;

    public zzyo(int i, boolean z) {
        this.zza = i;
        this.zzb = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzyo zzyoVar = (com.google.android.gms.internal.ads.zzyo) obj;
            if (this.zza == zzyoVar.zza && this.zzb == zzyoVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza * 31) + (this.zzb ? 1 : 0);
    }
}
