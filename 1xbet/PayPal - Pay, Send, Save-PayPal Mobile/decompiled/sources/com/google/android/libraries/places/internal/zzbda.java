package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbda {
    private final java.lang.Object zza;
    private final int zzb;

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.libraries.places.internal.zzbda)) {
            return false;
        }
        com.google.android.libraries.places.internal.zzbda zzbdaVar = (com.google.android.libraries.places.internal.zzbda) obj;
        return this.zza == zzbdaVar.zza && this.zzb == zzbdaVar.zzb;
    }

    public final int hashCode() {
        return (java.lang.System.identityHashCode(this.zza) * 65535) + this.zzb;
    }

    zzbda(java.lang.Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }
}
