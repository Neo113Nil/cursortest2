package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final class zzidn {
    private final java.lang.Object zza;
    private final int zzb;

    zzidn(java.lang.Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.ads.zzidn)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzidn zzidnVar = (com.google.android.gms.internal.ads.zzidn) obj;
        return this.zza == zzidnVar.zza && this.zzb == zzidnVar.zzb;
    }

    public final int hashCode() {
        return (java.lang.System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
