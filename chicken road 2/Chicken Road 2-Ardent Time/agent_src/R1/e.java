package R1;

/* loaded from: classes.dex */
public final class e implements R1.l {
    @Override // R1.l
    public final boolean a(javax.net.ssl.SSLSocket sSLSocket) {
        return y1.o.K(sSLSocket.getClass().getName(), kotlin.jvm.internal.i.h(".", "com.google.android.gms.org.conscrypt"), false);
    }

    @Override // R1.l
    public final R1.n b(javax.net.ssl.SSLSocket sSLSocket) {
        java.lang.Class<?> cls = sSLSocket.getClass();
        java.lang.Class<?> cls2 = cls;
        while (!cls2.getSimpleName().equals("OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new java.lang.AssertionError(kotlin.jvm.internal.i.h(cls, "No OpenSSLSocketImpl superclass of socket of type "));
            }
        }
        return new R1.f(cls2);
    }
}
