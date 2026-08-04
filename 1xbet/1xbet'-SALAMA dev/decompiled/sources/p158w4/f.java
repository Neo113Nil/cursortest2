package p158w4;

import androidx.appcompat.widget.b1;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedBlockingQueue f18074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Random f18075b = new Random();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f18076c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f18077d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f18078e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WritableByteChannel f18079f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Thread f18080g;

    public f(c cVar, int i7) {
        Thread threadNewThread = c.f18056n.newThread(new b1(this, 17));
        this.f18080g = threadNewThread;
        c.f18057o.getClass();
        threadNewThread.setName("TubeSockWriter-" + i7);
        this.f18078e = cVar;
        this.f18074a = new LinkedBlockingQueue();
    }

    public final ByteBuffer a(byte b7, byte[] bArr) {
        int length = bArr.length;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + (length < 126 ? 6 : length <= 65535 ? 8 : 14));
        byteBufferAllocate.put((byte) (b7 | (-128)));
        if (length < 126) {
            byteBufferAllocate.put((byte) (length | 128));
        } else if (length <= 65535) {
            byteBufferAllocate.put((byte) 254);
            byteBufferAllocate.putShort((short) length);
        } else {
            byteBufferAllocate.put((byte) 255);
            byteBufferAllocate.putInt(0);
            byteBufferAllocate.putInt(length);
        }
        byte[] bArr2 = new byte[4];
        this.f18075b.nextBytes(bArr2);
        byteBufferAllocate.put(bArr2);
        for (int i7 = 0; i7 < bArr.length; i7++) {
            byteBufferAllocate.put((byte) (bArr[i7] ^ bArr2[i7 % 4]));
        }
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    public final synchronized void b(byte b7, byte[] bArr) {
        try {
            ByteBuffer byteBufferA = a(b7, bArr);
            if (this.f18076c && (this.f18077d || b7 != 8)) {
                throw new d("Shouldn't be sending");
            }
            if (b7 == 8) {
                this.f18077d = true;
            }
            this.f18074a.add(byteBufferA);
        } catch (Throwable th) {
            throw th;
        }
    }
}
