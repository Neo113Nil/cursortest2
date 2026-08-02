package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbqm implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbqu zza;

    zzbqm(com.google.android.libraries.places.internal.zzbqu zzbquVar) {
        java.util.Objects.requireNonNull(zzbquVar);
        this.zza = zzbquVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzk().zzd();
    }
}
