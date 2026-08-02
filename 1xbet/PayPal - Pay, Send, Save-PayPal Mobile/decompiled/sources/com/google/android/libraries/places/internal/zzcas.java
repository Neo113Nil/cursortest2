package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
abstract class zzcas implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzcat zzb;

    /* synthetic */ zzcas(com.google.android.libraries.places.internal.zzcat zzcatVar, byte[] bArr) {
        java.util.Objects.requireNonNull(zzcatVar);
        this.zzb = zzcatVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.zzb.zzi() == null) {
                throw new java.io.IOException("Unable to perform write due to unavailable sink.");
            }
            zza();
        } catch (java.lang.Exception e) {
            this.zzb.zzf().zzg(e);
        }
    }

    public abstract void zza() throws java.io.IOException;
}
