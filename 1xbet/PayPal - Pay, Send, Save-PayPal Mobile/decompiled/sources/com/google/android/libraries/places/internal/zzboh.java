package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public abstract class zzboh implements com.google.android.libraries.places.internal.zzbxo {
    @Override // com.google.android.libraries.places.internal.zzbxo, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // com.google.android.libraries.places.internal.zzbxo
    public boolean zza() {
        return false;
    }

    @Override // com.google.android.libraries.places.internal.zzbxo
    public void zzb() {
    }

    @Override // com.google.android.libraries.places.internal.zzbxo
    public void zzc() {
        throw new java.lang.UnsupportedOperationException();
    }

    protected final void zzd(int i) {
        if (zzf() < i) {
            throw new java.lang.IndexOutOfBoundsException();
        }
    }
}
