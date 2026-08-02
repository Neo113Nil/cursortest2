package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
abstract class zzfp extends com.google.android.gms.internal.fido.zzfr {
    private final java.nio.ByteBuffer zza = java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.LITTLE_ENDIAN);

    zzfp() {
    }

    @Override // com.google.android.gms.internal.fido.zzfr, com.google.android.gms.internal.fido.zzfv
    public final com.google.android.gms.internal.fido.zzfv zza(byte[] bArr) {
        bArr.getClass();
        zzb(bArr, 0, bArr.length);
        return this;
    }

    protected void zzb(byte[] bArr, int i, int i2) {
        throw null;
    }
}
