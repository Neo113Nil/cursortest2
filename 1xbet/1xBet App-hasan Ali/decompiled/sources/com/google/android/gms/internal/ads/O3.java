package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class O3 extends AbstractC1690vD {
    static {
        AbstractC1400ot.y(O3.class);
    }

    public O3(C1205ke c1205ke, C1250le c1250le) {
        ByteBuffer byteBuffer = c1205ke.f14251k;
        long limit = byteBuffer.limit();
        this.f15982l = c1205ke;
        this.f15984n = c1205ke.d();
        byteBuffer.position((int) (c1205ke.d() + limit));
        this.f15985o = c1205ke.d();
        this.f15981k = c1250le;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1690vD, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1690vD
    public final String toString() {
        String obj = this.f15982l.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 7);
        sb.append("model(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
