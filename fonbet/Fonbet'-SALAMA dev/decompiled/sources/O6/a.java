package O6;

import N6.d;
import t6.h;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f5015a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(C6.a.f1581a);
        h.d(bytes, "this as java.lang.String).getBytes(charset)");
        f5015a = bytes;
    }

    public static final String a(d dVar, long j) {
        if (j > 0) {
            long j3 = j - 1;
            if (dVar.b(j3) == 13) {
                String f7 = dVar.f(j3, C6.a.f1581a);
                dVar.g(2L);
                return f7;
            }
        }
        String f8 = dVar.f(j, C6.a.f1581a);
        dVar.g(1L);
        return f8;
    }
}
