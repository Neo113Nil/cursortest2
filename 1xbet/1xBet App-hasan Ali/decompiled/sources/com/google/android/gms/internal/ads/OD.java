package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class OD extends AbstractC1665up {

    /* renamed from: c, reason: collision with root package name */
    public C1407p f10936c;

    /* renamed from: d, reason: collision with root package name */
    public final C1645uD f10937d = new C1645uD();

    /* renamed from: e, reason: collision with root package name */
    public ByteBuffer f10938e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public long f10939g;

    /* renamed from: h, reason: collision with root package name */
    public ByteBuffer f10940h;
    public final int i;

    static {
        AbstractC0830c4.a("media3.decoder");
    }

    public OD(int i) {
        this.i = i;
    }

    public void d() {
        this.f15911b = 0;
        ByteBuffer byteBuffer = this.f10938e;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f10940h;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f = false;
    }

    public final void e(int i) {
        ByteBuffer byteBuffer = this.f10938e;
        if (byteBuffer == null) {
            this.f10938e = h(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i5 = i + position;
        if (capacity >= i5) {
            this.f10938e = byteBuffer;
            return;
        }
        ByteBuffer h3 = h(i5);
        h3.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            h3.put(byteBuffer);
        }
        this.f10938e = h3;
    }

    public final void f() {
        ByteBuffer byteBuffer = this.f10938e;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f10940h;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean g() {
        return a(1073741824);
    }

    public final ByteBuffer h(int i) {
        int i5 = this.i;
        if (i5 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i5 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f10938e;
        throw new ND("Buffer too small (" + (byteBuffer == null ? 0 : byteBuffer.capacity()) + " < " + i + ")");
    }
}
