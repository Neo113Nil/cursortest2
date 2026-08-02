package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzsd {
    private final com.google.android.libraries.places.internal.zzrv zza;

    public static com.google.android.libraries.places.internal.zzsd zza() {
        return new com.google.android.libraries.places.internal.zzsd(com.google.android.libraries.places.internal.zzrh.zzb(false));
    }

    public static java.lang.Runnable zzb(com.google.android.libraries.places.internal.zzsd zzsdVar, java.lang.Runnable runnable) {
        com.google.android.libraries.places.internal.zzrv zzrvVar = zzsdVar.zza;
        com.google.common.base.Preconditions.checkNotNull(zzrvVar, "Trying to propagate null trace");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzrvVar, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "");
        return new com.google.android.libraries.places.internal.zzsa(zzrvVar, runnable);
    }

    public final java.lang.String toString() {
        return this.zza.toString();
    }

    private zzsd(com.google.android.libraries.places.internal.zzrv zzrvVar) {
        this.zza = zzrvVar;
    }
}
