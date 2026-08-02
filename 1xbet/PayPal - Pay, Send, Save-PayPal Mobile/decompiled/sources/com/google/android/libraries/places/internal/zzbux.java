package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbux implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbvr zza;

    /* synthetic */ zzbux(com.google.android.libraries.places.internal.zzbvr zzbvrVar, byte[] bArr) {
        java.util.Objects.requireNonNull(zzbvrVar);
        this.zza = zzbvrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.libraries.places.internal.zzbvr zzbvrVar = this.zza;
        if (zzbvrVar.zzF() == null) {
            return;
        }
        zzbvrVar.zzk();
    }
}
