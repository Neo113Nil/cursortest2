package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbrl implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbrt zza;

    zzbrl(com.google.android.libraries.places.internal.zzbrt zzbrtVar) {
        java.util.Objects.requireNonNull(zzbrtVar);
        this.zza = zzbrtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzq().zzu();
    }
}
