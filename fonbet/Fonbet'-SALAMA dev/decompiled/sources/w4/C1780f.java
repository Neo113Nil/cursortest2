package w4;

import androidx.appcompat.widget.b1;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: w4.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1780f {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedBlockingQueue f18068a;

    /* renamed from: b, reason: collision with root package name */
    public final Random f18069b = new Random();

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f18070c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18071d = false;

    /* renamed from: e, reason: collision with root package name */
    public final C1777c f18072e;

    /* renamed from: f, reason: collision with root package name */
    public WritableByteChannel f18073f;

    /* renamed from: g, reason: collision with root package name */
    public final Thread f18074g;

    public C1780f(C1777c c1777c, int i7) {
        Thread newThread = C1777c.f18050n.newThread(new b1(this, 17));
        this.f18074g = newThread;
        C1777c.f18051o.getClass();
        newThread.setName("TubeSockWriter-" + i7);
        this.f18072e = c1777c;
        this.f18068a = new LinkedBlockingQueue();
    }

    public final ByteBuffer a(byte b7, byte[] bArr) {
        int length = bArr.length;
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + (length < 126 ? 6 : length <= 65535 ? 8 : 14));
        allocate.put((byte) (b7 | Byte.MIN_VALUE));
        if (length < 126) {
            allocate.put((byte) (length | 128));
        } else if (length <= 65535) {
            allocate.put((byte) 254);
            allocate.putShort((short) length);
        } else {
            allocate.put((byte) 255);
            allocate.putInt(0);
            allocate.putInt(length);
        }
        byte[] bArr2 = new byte[4];
        this.f18069b.nextBytes(bArr2);
        allocate.put(bArr2);
        for (int i7 = 0; i7 < bArr.length; i7++) {
            allocate.put((byte) (bArr[i7] ^ bArr2[i7 % 4]));
        }
        allocate.flip();
        return allocate;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001e, code lost:
    
        r2.f18071d = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void b(byte b7, byte[] bArr) {
        try {
            ByteBuffer a2 = a(b7, bArr);
            if (this.f18070c && (this.f18071d || b7 != 8)) {
                throw new C1778d("Shouldn't be sending");
            }
            this.f18068a.add(a2);
        } catch (Throwable th) {
            throw th;
        }
    }
}
