package W1;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f1829a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(y1.a.f8486a);
        kotlin.jvm.internal.i.d(bytes, "this as java.lang.String).getBytes(charset)");
        f1829a = bytes;
    }

    public static final java.lang.String a(V1.g gVar, long j2) {
        kotlin.jvm.internal.i.e(gVar, "<this>");
        if (j2 > 0) {
            long j3 = j2 - 1;
            if (gVar.b(j3) == 13) {
                java.lang.String n2 = gVar.n(j3, y1.a.f8486a);
                gVar.o(2L);
                return n2;
            }
        }
        java.lang.String n3 = gVar.n(j2, y1.a.f8486a);
        gVar.o(1L);
        return n3;
    }
}
