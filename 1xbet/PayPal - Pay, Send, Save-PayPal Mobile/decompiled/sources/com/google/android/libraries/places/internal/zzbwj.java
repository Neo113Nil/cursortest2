package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbwj extends java.io.OutputStream {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbwl zza;

    /* synthetic */ zzbwj(com.google.android.libraries.places.internal.zzbwl zzbwlVar, byte[] bArr) {
        java.util.Objects.requireNonNull(zzbwlVar);
        this.zza = zzbwlVar;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.zza.zzg(new byte[]{(byte) i}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.zza.zzg(bArr, i, i2);
    }
}
