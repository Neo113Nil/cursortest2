package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbrp implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbrs zza;

    zzbrp(com.google.android.libraries.places.internal.zzbrs zzbrsVar) {
        java.util.Objects.requireNonNull(zzbrsVar);
        this.zza = zzbrsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzf().zzd();
    }
}
