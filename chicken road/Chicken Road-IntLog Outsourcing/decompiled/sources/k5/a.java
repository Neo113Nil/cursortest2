package k5;

import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f10723a;

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f10724b;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(B4.a.f287a);
        i.d(bytes, "getBytes(...)");
        f10723a = bytes;
        f10724b = new long[]{-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};
    }

    public static final String a(j5.f fVar, long j2) {
        i.e(fVar, "<this>");
        if (j2 > 0) {
            long j6 = j2 - 1;
            if (fVar.b(j6) == 13) {
                String A5 = fVar.A(j6, B4.a.f287a);
                fVar.D(2L);
                return A5;
            }
        }
        String A6 = fVar.A(j2, B4.a.f287a);
        fVar.D(1L);
        return A6;
    }
}
