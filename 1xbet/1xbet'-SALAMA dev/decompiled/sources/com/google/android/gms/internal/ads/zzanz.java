package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
final class zzanz implements zzaoa {
    private final ByteBuffer zza;

    public zzanz(ByteBuffer byteBuffer) {
        this.zza = byteBuffer.slice();
    }

    @Override // com.google.android.gms.internal.ads.zzaoa
    public final long zza() {
        return this.zza.capacity();
    }

    @Override // com.google.android.gms.internal.ads.zzaoa
    public final void zzb(MessageDigest[] messageDigestArr, long j, int i7) {
        ByteBuffer byteBufferSlice;
        synchronized (this.zza) {
            int i8 = (int) j;
            this.zza.position(i8);
            this.zza.limit(i8 + i7);
            byteBufferSlice = this.zza.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            byteBufferSlice.position(0);
            messageDigest.update(byteBufferSlice);
        }
    }
}
