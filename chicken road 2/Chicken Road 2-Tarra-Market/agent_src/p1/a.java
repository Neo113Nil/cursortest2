package p1;

import a.AbstractC0009a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* loaded from: classes.dex */
public final class a extends AbstractC0009a {

    /* renamed from: j, reason: collision with root package name */
    public final Object f6422j;

    /* renamed from: k, reason: collision with root package name */
    public final Method f6423k;

    public a(Object obj, Method method) {
        super(21);
        this.f6422j = obj;
        this.f6423k = method;
    }

    @Override // a.AbstractC0009a
    public final List d(String str, List list) {
        try {
            return (List) this.f6423k.invoke(this.f6422j, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str);
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        } catch (InvocationTargetException e3) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e3.getMessage());
            sSLPeerUnverifiedException.initCause(e3);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(Object obj) {
        return obj instanceof a;
    }

    public final int hashCode() {
        return 0;
    }
}
