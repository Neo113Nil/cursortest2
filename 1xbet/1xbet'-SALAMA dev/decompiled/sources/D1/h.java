package D1;

import A1.V;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class h extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f1696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ByteBuffer f1697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1698e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f1699f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ByteBuffer f1700x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f1701y;

    static {
        V.a("goog.exo.decoder");
    }

    public h(int i7) {
        super(0, (byte) 0);
        this.f1696c = new c();
        this.f1701y = i7;
    }

    public final void A() {
        ByteBuffer byteBuffer = this.f1697d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f1700x;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public void t() {
        this.f1675b = 0;
        ByteBuffer byteBuffer = this.f1697d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f1700x;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f1698e = false;
    }

    public final ByteBuffer y(int i7) {
        int i8 = this.f1701y;
        if (i8 == 1) {
            return ByteBuffer.allocate(i7);
        }
        if (i8 == 2) {
            return ByteBuffer.allocateDirect(i7);
        }
        ByteBuffer byteBuffer = this.f1697d;
        throw new g("Buffer too small (" + (byteBuffer == null ? 0 : byteBuffer.capacity()) + " < " + i7 + ")");
    }

    public final void z(int i7) {
        ByteBuffer byteBuffer = this.f1697d;
        if (byteBuffer == null) {
            this.f1697d = y(i7);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i8 = i7 + iPosition;
        if (iCapacity >= i8) {
            this.f1697d = byteBuffer;
            return;
        }
        ByteBuffer byteBufferY = y(i8);
        byteBufferY.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferY.put(byteBuffer);
        }
        this.f1697d = byteBufferY;
    }
}
