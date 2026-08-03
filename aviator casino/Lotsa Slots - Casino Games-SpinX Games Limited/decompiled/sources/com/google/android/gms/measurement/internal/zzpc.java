package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
final class zzpc {
    final java.lang.String zza;
    long zzb;

    private zzpc(com.google.android.gms.measurement.internal.zzpf zzpfVar, java.lang.String str) {
        java.util.Objects.requireNonNull(zzpfVar);
        this.zza = str;
        this.zzb = zzpfVar.zzaZ().elapsedRealtime();
    }

    /* synthetic */ zzpc(com.google.android.gms.measurement.internal.zzpf zzpfVar, java.lang.String str, byte[] bArr) {
        this(zzpfVar, str);
    }

    /* synthetic */ zzpc(com.google.android.gms.measurement.internal.zzpf zzpfVar, byte[] bArr) {
        this(zzpfVar, zzpfVar.zzt().zzaw());
    }
}
