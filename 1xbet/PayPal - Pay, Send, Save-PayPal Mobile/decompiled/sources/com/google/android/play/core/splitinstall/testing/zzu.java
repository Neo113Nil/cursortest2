package com.google.android.play.core.splitinstall.testing;

/* loaded from: classes9.dex */
abstract class zzu {
    abstract com.google.android.play.core.splitinstall.testing.zzu zza(int i);

    abstract com.google.android.play.core.splitinstall.testing.zzu zzb(java.util.Map map);

    abstract com.google.android.play.core.splitinstall.testing.zzv zzc();

    abstract java.util.Map zzd();

    final com.google.android.play.core.splitinstall.testing.zzv zze() {
        zzb(java.util.Collections.unmodifiableMap(zzd()));
        return zzc();
    }

    zzu() {
    }
}
