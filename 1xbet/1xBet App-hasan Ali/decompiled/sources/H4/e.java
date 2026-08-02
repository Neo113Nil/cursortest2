package H4;

import javax.net.ssl.SSLSocket;
import o4.AbstractC2234l;

/* loaded from: classes.dex */
public final class e implements l {
    @Override // H4.l
    public final boolean a(SSLSocket sSLSocket) {
        return AbstractC2234l.x0(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // H4.l
    public final n b(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> cls2 = cls;
        while (!cls2.getSimpleName().equals("OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new f(cls2);
    }
}
