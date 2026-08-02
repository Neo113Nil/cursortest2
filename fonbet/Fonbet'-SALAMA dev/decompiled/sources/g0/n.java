package g0;

import h0.C1175a;
import h0.C1176b;
import java.nio.ByteBuffer;
import w1.F0;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f13036d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final int f13037a;

    /* renamed from: b, reason: collision with root package name */
    public final F0 f13038b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f13039c = 0;

    public n(F0 f02, int i7) {
        this.f13038b = f02;
        this.f13037a = i7;
    }

    public final int a(int i7) {
        C1175a c3 = c();
        int a2 = c3.a(16);
        if (a2 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) c3.f5028d;
        int i8 = a2 + c3.f5025a;
        return byteBuffer.getInt((i7 * 4) + byteBuffer.getInt(i8) + i8 + 4);
    }

    public final int b() {
        C1175a c3 = c();
        int a2 = c3.a(16);
        if (a2 == 0) {
            return 0;
        }
        int i7 = a2 + c3.f5025a;
        return ((ByteBuffer) c3.f5028d).getInt(((ByteBuffer) c3.f5028d).getInt(i7) + i7);
    }

    public final C1175a c() {
        ThreadLocal threadLocal = f13036d;
        C1175a c1175a = (C1175a) threadLocal.get();
        if (c1175a == null) {
            c1175a = new C1175a();
            threadLocal.set(c1175a);
        }
        C1176b c1176b = (C1176b) this.f13038b.f17373b;
        int a2 = c1176b.a(6);
        if (a2 != 0) {
            int i7 = a2 + c1176b.f5025a;
            int i8 = (this.f13037a * 4) + ((ByteBuffer) c1176b.f5028d).getInt(i7) + i7 + 4;
            int i9 = ((ByteBuffer) c1176b.f5028d).getInt(i8) + i8;
            ByteBuffer byteBuffer = (ByteBuffer) c1176b.f5028d;
            c1175a.f5028d = byteBuffer;
            if (byteBuffer != null) {
                c1175a.f5025a = i9;
                int i10 = i9 - byteBuffer.getInt(i9);
                c1175a.f5026b = i10;
                c1175a.f5027c = ((ByteBuffer) c1175a.f5028d).getShort(i10);
            } else {
                c1175a.f5025a = 0;
                c1175a.f5026b = 0;
                c1175a.f5027c = 0;
            }
        }
        return c1175a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        C1175a c3 = c();
        int a2 = c3.a(4);
        sb.append(Integer.toHexString(a2 != 0 ? ((ByteBuffer) c3.f5028d).getInt(a2 + c3.f5025a) : 0));
        sb.append(", codepoints:");
        int b7 = b();
        for (int i7 = 0; i7 < b7; i7++) {
            sb.append(Integer.toHexString(a(i7)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
