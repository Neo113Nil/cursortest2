package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbzi implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbzk zza;

    zzbzi(com.google.android.libraries.places.internal.zzbzk zzbzkVar) {
        java.util.Objects.requireNonNull(zzbzkVar);
        this.zza = zzbzkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzd();
    }
}
