package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class wq0 {

    /* JADX INFO: renamed from: a */
    public final ByteBuffer f8633a = ByteBuffer.allocate(23).order(ByteOrder.LITTLE_ENDIAN);

    /* JADX INFO: renamed from: b */
    public final int f8634b = 16;

    /* JADX INFO: renamed from: c */
    public final int f8635c = 16;

    /* JADX INFO: renamed from: d */
    public long f8636d = 0;

    /* JADX INFO: renamed from: e */
    public long f8637e = 0;

    /* JADX INFO: renamed from: f */
    public int f8638f = 0;

    /* JADX INFO: renamed from: a */
    public final void m5412a() {
        ByteBuffer byteBuffer = this.f8633a;
        byteBuffer.flip();
        while (byteBuffer.remaining() >= this.f8635c) {
            m5413b(byteBuffer);
        }
        byteBuffer.compact();
    }

    /* JADX INFO: renamed from: b */
    public final void m5413b(ByteBuffer byteBuffer) {
        long j = byteBuffer.getLong();
        long j2 = byteBuffer.getLong();
        long jRotateLeft = (Long.rotateLeft(j * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.f8636d;
        this.f8636d = jRotateLeft;
        long jRotateLeft2 = Long.rotateLeft(jRotateLeft, 27);
        long j3 = this.f8637e;
        this.f8636d = ((jRotateLeft2 + j3) * 5) + 1390208809;
        long jRotateLeft3 = (Long.rotateLeft(j2 * 5545529020109919103L, 33) * (-8663945395140668459L)) ^ j3;
        this.f8637e = jRotateLeft3;
        this.f8637e = ((Long.rotateLeft(jRotateLeft3, 31) + this.f8636d) * 5) + 944331445;
        this.f8638f += 16;
    }

    /* JADX INFO: renamed from: c */
    public final wq0 m5414c(byte[] bArr) {
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr, 0, bArr.length).order(ByteOrder.LITTLE_ENDIAN);
        int iRemaining = byteBufferOrder.remaining();
        ByteBuffer byteBuffer = this.f8633a;
        if (iRemaining <= byteBuffer.remaining()) {
            byteBuffer.put(byteBufferOrder);
            if (byteBuffer.remaining() < 8) {
                m5412a();
            }
            return this;
        }
        int iPosition = this.f8634b - byteBuffer.position();
        for (int i = 0; i < iPosition; i++) {
            byteBuffer.put(byteBufferOrder.get());
        }
        m5412a();
        while (byteBufferOrder.remaining() >= this.f8635c) {
            m5413b(byteBufferOrder);
        }
        byteBuffer.put(byteBufferOrder);
        return this;
    }
}
