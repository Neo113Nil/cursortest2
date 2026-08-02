package v1;

import java.nio.ByteBuffer;
import w1.C2542a;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f20380d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final int f20381a;

    /* renamed from: b, reason: collision with root package name */
    public final m2.g f20382b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f20383c = 0;

    public v(m2.g gVar, int i) {
        this.f20382b = gVar;
        this.f20381a = i;
    }

    public final int a(int i) {
        C2542a b3 = b();
        int a5 = b3.a(16);
        if (a5 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) b3.f6158n;
        int i5 = a5 + b3.f6155k;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i5) + i5 + 4);
    }

    public final C2542a b() {
        ThreadLocal threadLocal = f20380d;
        C2542a c2542a = (C2542a) threadLocal.get();
        if (c2542a == null) {
            c2542a = new C2542a();
            threadLocal.set(c2542a);
        }
        w1.b bVar = (w1.b) this.f20382b.f17994l;
        int a5 = bVar.a(6);
        if (a5 != 0) {
            int i = a5 + bVar.f6155k;
            int i5 = (this.f20381a * 4) + ((ByteBuffer) bVar.f6158n).getInt(i) + i + 4;
            int i6 = ((ByteBuffer) bVar.f6158n).getInt(i5) + i5;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.f6158n;
            c2542a.f6158n = byteBuffer;
            if (byteBuffer != null) {
                c2542a.f6155k = i6;
                int i7 = i6 - byteBuffer.getInt(i6);
                c2542a.f6156l = i7;
                c2542a.f6157m = ((ByteBuffer) c2542a.f6158n).getShort(i7);
                return c2542a;
            }
            c2542a.f6155k = 0;
            c2542a.f6156l = 0;
            c2542a.f6157m = 0;
        }
        return c2542a;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        C2542a b3 = b();
        int a5 = b3.a(4);
        sb.append(Integer.toHexString(a5 != 0 ? ((ByteBuffer) b3.f6158n).getInt(a5 + b3.f6155k) : 0));
        sb.append(", codepoints:");
        C2542a b5 = b();
        int a6 = b5.a(16);
        if (a6 != 0) {
            int i5 = a6 + b5.f6155k;
            i = ((ByteBuffer) b5.f6158n).getInt(((ByteBuffer) b5.f6158n).getInt(i5) + i5);
        } else {
            i = 0;
        }
        for (int i6 = 0; i6 < i; i6++) {
            sb.append(Integer.toHexString(a(i6)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
