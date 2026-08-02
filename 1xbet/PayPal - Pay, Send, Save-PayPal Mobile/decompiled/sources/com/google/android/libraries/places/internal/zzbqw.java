package com.google.android.libraries.places.internal;

/* loaded from: classes.dex */
final class zzbqw implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbwc zza;

    zzbqw(com.google.android.libraries.places.internal.zzbrb zzbrbVar, com.google.android.libraries.places.internal.zzbwc zzbwcVar) {
        this.zza = zzbwcVar;
        java.util.Objects.requireNonNull(zzbrbVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzc(false);
    }
}
