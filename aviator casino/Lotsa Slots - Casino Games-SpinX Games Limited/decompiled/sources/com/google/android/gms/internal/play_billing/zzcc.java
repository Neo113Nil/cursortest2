package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
final class zzcc {
    private final java.lang.Object zza;
    private final int zzb;

    zzcc(java.lang.Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.play_billing.zzcc)) {
            return false;
        }
        com.google.android.gms.internal.play_billing.zzcc zzccVar = (com.google.android.gms.internal.play_billing.zzcc) obj;
        return this.zza == zzccVar.zza && this.zzb == zzccVar.zzb;
    }

    public final int hashCode() {
        return (java.lang.System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
