package e5;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public class e implements n {

    /* renamed from: e, reason: collision with root package name */
    public static final W1.e f5533e = new W1.e();

    /* renamed from: a, reason: collision with root package name */
    public final Class f5534a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f5535b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f5536c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f5537d;

    public e(Class cls) {
        this.f5534a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        kotlin.jvm.internal.i.d(declaredMethod, "getDeclaredMethod(...)");
        this.f5535b = declaredMethod;
        cls.getMethod("setHostname", String.class);
        this.f5536c = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f5537d = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // e5.n
    public final String a(SSLSocket sSLSocket) {
        if (!this.f5534a.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f5536c.invoke(sSLSocket, null);
            if (bArr != null) {
                return new String(bArr, B4.a.f287a);
            }
            return null;
        } catch (IllegalAccessException e3) {
            throw new AssertionError(e3);
        } catch (InvocationTargetException e6) {
            Throwable cause = e6.getCause();
            if ((cause instanceof NullPointerException) && kotlin.jvm.internal.i.a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e6);
        }
    }

    @Override // e5.n
    public final boolean b(SSLSocket sSLSocket) {
        return this.f5534a.isInstance(sSLSocket);
    }

    @Override // e5.n
    public final boolean c() {
        boolean z = d5.c.f5489e;
        return d5.c.f5489e;
    }

    @Override // e5.n
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        kotlin.jvm.internal.i.e(protocols, "protocols");
        if (this.f5534a.isInstance(sSLSocket)) {
            try {
                this.f5535b.invoke(sSLSocket, Boolean.TRUE);
                Method method = this.f5537d;
                d5.e eVar = d5.e.f5492a;
                method.invoke(sSLSocket, W1.e.n(protocols));
            } catch (IllegalAccessException e3) {
                throw new AssertionError(e3);
            } catch (InvocationTargetException e6) {
                throw new AssertionError(e6);
            }
        }
    }
}
