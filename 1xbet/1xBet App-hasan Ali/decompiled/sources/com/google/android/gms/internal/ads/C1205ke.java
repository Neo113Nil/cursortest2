package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.ke, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1205ke implements AutoCloseable, Closeable {

    /* renamed from: k, reason: collision with root package name */
    public final ByteBuffer f14251k;

    public C1205ke(ByteBuffer byteBuffer) {
        this.f14251k = byteBuffer.duplicate();
    }

    public final int b(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = this.f14251k;
        if (byteBuffer2.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), byteBuffer2.remaining());
        byte[] bArr = new byte[min];
        byteBuffer2.get(bArr);
        byteBuffer.put(bArr);
        return min;
    }

    @Override // java.lang.AutoCloseable, java.io.Closeable
    public final void close() {
    }

    public final long d() {
        return this.f14251k.position();
    }
}
