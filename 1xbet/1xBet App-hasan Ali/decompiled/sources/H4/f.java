package H4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import o4.AbstractC2223a;

/* loaded from: classes.dex */
public class f implements n {
    public static final e f = new e();

    /* renamed from: a, reason: collision with root package name */
    public final Class f2370a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f2371b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f2372c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f2373d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f2374e;

    public f(Class cls) {
        this.f2370a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        kotlin.jvm.internal.l.e("sslSocketClass.getDeclar…:class.javaPrimitiveType)", declaredMethod);
        this.f2371b = declaredMethod;
        this.f2372c = cls.getMethod("setHostname", String.class);
        this.f2373d = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f2374e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // H4.n
    public final boolean a(SSLSocket sSLSocket) {
        return this.f2370a.isInstance(sSLSocket);
    }

    @Override // H4.n
    public final String b(SSLSocket sSLSocket) {
        if (this.f2370a.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.f2373d.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, AbstractC2223a.f18653a);
                }
            } catch (IllegalAccessException e3) {
                throw new AssertionError(e3);
            } catch (InvocationTargetException e5) {
                Throwable cause = e5.getCause();
                if (!(cause instanceof NullPointerException) || !kotlin.jvm.internal.l.a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    throw new AssertionError(e5);
                }
            }
        }
        return null;
    }

    @Override // H4.n
    public final boolean c() {
        boolean z3 = G4.c.f1988e;
        return G4.c.f1988e;
    }

    @Override // H4.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        kotlin.jvm.internal.l.f("protocols", list);
        if (this.f2370a.isInstance(sSLSocket)) {
            try {
                this.f2371b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f2372c.invoke(sSLSocket, str);
                }
                Method method = this.f2374e;
                G4.n nVar = G4.n.f2016a;
                method.invoke(sSLSocket, j3.i.j(list));
            } catch (IllegalAccessException e3) {
                throw new AssertionError(e3);
            } catch (InvocationTargetException e5) {
                throw new AssertionError(e5);
            }
        }
    }
}
