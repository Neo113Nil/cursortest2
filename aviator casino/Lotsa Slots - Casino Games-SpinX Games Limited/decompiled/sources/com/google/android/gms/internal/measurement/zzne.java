package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzne {
    private final com.google.android.gms.internal.measurement.zznd zza;

    private zzne(com.google.android.gms.internal.measurement.zzos zzosVar, java.lang.Object obj, com.google.android.gms.internal.measurement.zzos zzosVar2, java.lang.Object obj2) {
        this.zza = new com.google.android.gms.internal.measurement.zznd(zzosVar, "", zzosVar2, "");
    }

    public static com.google.android.gms.internal.measurement.zzne zza(com.google.android.gms.internal.measurement.zzos zzosVar, java.lang.Object obj, com.google.android.gms.internal.measurement.zzos zzosVar2, java.lang.Object obj2) {
        return new com.google.android.gms.internal.measurement.zzne(zzosVar, "", zzosVar2, "");
    }

    static void zzb(com.google.android.gms.internal.measurement.zzll zzllVar, com.google.android.gms.internal.measurement.zznd zzndVar, java.lang.Object obj, java.lang.Object obj2) throws java.io.IOException {
        com.google.android.gms.internal.measurement.zzlv.zzf(zzllVar, zzndVar.zza, 1, obj);
        com.google.android.gms.internal.measurement.zzlv.zzf(zzllVar, zzndVar.zzc, 2, obj2);
    }

    static int zzc(com.google.android.gms.internal.measurement.zznd zzndVar, java.lang.Object obj, java.lang.Object obj2) {
        return com.google.android.gms.internal.measurement.zzlv.zzh(zzndVar.zza, 1, obj) + com.google.android.gms.internal.measurement.zzlv.zzh(zzndVar.zzc, 2, obj2);
    }

    public final int zzd(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.measurement.zznd zzndVar = this.zza;
        int zzz = com.google.android.gms.internal.measurement.zzll.zzz(i << 3);
        int zzc = zzc(zzndVar, obj, obj2);
        return zzz + com.google.android.gms.internal.measurement.zzll.zzz(zzc) + zzc;
    }

    final com.google.android.gms.internal.measurement.zznd zze() {
        return this.zza;
    }
}
