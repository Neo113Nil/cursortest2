package L6;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes8.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    protected ByteBuffer f16576a;

    public final int a() {
        return this.f16576a.position();
    }

    public final void b(byte b11) {
        this.f16576a.put(b11);
    }

    public final void c(byte[] bArr) {
        this.f16576a.put(bArr);
    }

    public void d(int i11) {
        ByteBuffer byteBuffer = this.f16576a;
        if (byteBuffer == null || i11 > byteBuffer.capacity()) {
            ByteBuffer allocate = ByteBuffer.allocate(i11);
            this.f16576a = allocate;
            allocate.order(ByteOrder.LITTLE_ENDIAN);
        }
        this.f16576a.clear();
    }

    public final void e(int i11) {
        ByteBuffer byteBuffer = this.f16576a;
        byteBuffer.position(byteBuffer.position() + i11);
    }

    public final byte[] f() {
        return this.f16576a.array();
    }
}
