package X2;

import C.D;
import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    protected int f34007a;

    /* renamed from: b, reason: collision with root package name */
    protected ByteBuffer f34008b;

    /* renamed from: c, reason: collision with root package name */
    private int f34009c;

    /* renamed from: d, reason: collision with root package name */
    private int f34010d;

    public c() {
        D.b();
    }

    protected final int a(int i11) {
        if (i11 < this.f34010d) {
            return this.f34008b.getShort(this.f34009c + i11);
        }
        return 0;
    }

    protected final void b(int i11, ByteBuffer byteBuffer) {
        this.f34008b = byteBuffer;
        if (byteBuffer == null) {
            this.f34007a = 0;
            this.f34009c = 0;
            this.f34010d = 0;
        } else {
            this.f34007a = i11;
            int i12 = i11 - byteBuffer.getInt(i11);
            this.f34009c = i12;
            this.f34010d = this.f34008b.getShort(i12);
        }
    }
}
