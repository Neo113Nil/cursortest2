package com.google.android.play.core.splitinstall.internal;

/* loaded from: classes9.dex */
final class zza implements com.google.android.play.core.splitinstall.internal.zzb {
    private final java.nio.ByteBuffer zza;

    public zza(java.nio.ByteBuffer byteBuffer) {
        this.zza = byteBuffer.slice();
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzb
    public final long zza() {
        return this.zza.capacity();
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzb
    public final void zzb(java.security.MessageDigest[] messageDigestArr, long j, int i) throws java.io.IOException {
        java.nio.ByteBuffer slice;
        synchronized (this.zza) {
            int i2 = (int) j;
            this.zza.position(i2);
            this.zza.limit(i2 + i);
            slice = this.zza.slice();
        }
        for (java.security.MessageDigest messageDigest : messageDigestArr) {
            slice.position(0);
            messageDigest.update(slice);
        }
    }
}
