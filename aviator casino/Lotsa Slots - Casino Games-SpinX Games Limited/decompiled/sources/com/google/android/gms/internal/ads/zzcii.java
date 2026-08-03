package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzcii implements com.google.android.gms.internal.ads.zzimg {
    private final java.nio.ByteBuffer zza;

    zzcii(java.nio.ByteBuffer byteBuffer) {
        this.zza = byteBuffer.duplicate();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
    }

    @Override // com.google.android.gms.internal.ads.zzimg
    public final int zza(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        java.nio.ByteBuffer byteBuffer2 = this.zza;
        if (byteBuffer2.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int min = java.lang.Math.min(byteBuffer.remaining(), byteBuffer2.remaining());
        byte[] bArr = new byte[min];
        byteBuffer2.get(bArr);
        byteBuffer.put(bArr);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzimg
    public final long zzb() throws java.io.IOException {
        return this.zza.limit();
    }

    @Override // com.google.android.gms.internal.ads.zzimg
    public final long zzc() throws java.io.IOException {
        return this.zza.position();
    }

    @Override // com.google.android.gms.internal.ads.zzimg
    public final void zzd(long j) throws java.io.IOException {
        this.zza.position((int) j);
    }

    @Override // com.google.android.gms.internal.ads.zzimg
    public final java.nio.ByteBuffer zze(long j, long j2) throws java.io.IOException {
        java.nio.ByteBuffer byteBuffer = this.zza;
        int i = (int) j;
        int position = byteBuffer.position();
        byteBuffer.position(i);
        java.nio.ByteBuffer slice = byteBuffer.slice();
        slice.limit((int) j2);
        byteBuffer.position(position);
        return slice;
    }
}
