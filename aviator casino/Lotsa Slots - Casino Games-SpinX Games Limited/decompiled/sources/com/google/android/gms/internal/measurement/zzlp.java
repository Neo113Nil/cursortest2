package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* loaded from: classes4.dex */
final class zzlp {
    private final java.lang.Object zza;
    private final int zzb;

    zzlp(java.lang.Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.measurement.zzlp)) {
            return false;
        }
        com.google.android.gms.internal.measurement.zzlp zzlpVar = (com.google.android.gms.internal.measurement.zzlp) obj;
        return this.zza == zzlpVar.zza && this.zzb == zzlpVar.zzb;
    }

    public final int hashCode() {
        return (java.lang.System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
