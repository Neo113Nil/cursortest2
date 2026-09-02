package p1;

import a.AbstractC0009a;
import android.os.Build;
import android.util.Log;
import i1.s;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class c extends g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6426c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final Object f6427d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f6428e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f6429f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f6430g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f6431h;

    public c(C0.b bVar, C0.b bVar2, C0.b bVar3, C0.b bVar4) {
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls.getMethod("get", null);
            method2 = cls.getMethod("open", String.class);
            method = cls.getMethod("warnIfOpen", null);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.f6431h = new O0.e(method3, method2, method);
        this.f6427d = bVar;
        this.f6428e = bVar2;
        this.f6429f = bVar3;
        this.f6430g = bVar4;
    }

    public static boolean n(String str, Class cls, Object obj) {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", String.class).invoke(obj, str)).booleanValue();
        } catch (NoSuchMethodException unused) {
            try {
                return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", null).invoke(obj, null)).booleanValue();
            } catch (NoSuchMethodException unused2) {
                return true;
            }
        }
    }

    @Override // p1.g
    public void a(SSLSocket sSLSocket) {
        switch (this.f6426c) {
            case 1:
                try {
                    ((Method) this.f6429f).invoke(null, sSLSocket);
                    return;
                } catch (IllegalAccessException | InvocationTargetException e2) {
                    throw j1.d.a("unable to remove alpn", e2);
                }
            default:
                return;
        }
    }

    @Override // p1.g
    public AbstractC0009a c(X509TrustManager x509TrustManager) {
        switch (this.f6426c) {
            case 0:
                try {
                    Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
                    break;
                } catch (Exception unused) {
                    return super.c(x509TrustManager);
                }
        }
        return super.c(x509TrustManager);
    }

    @Override // p1.g
    public r1.d d(X509TrustManager x509TrustManager) {
        switch (this.f6426c) {
            case 0:
                try {
                    Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
                    declaredMethod.setAccessible(true);
                    break;
                } catch (NoSuchMethodException unused) {
                    return super.d(x509TrustManager);
                }
        }
        return super.d(x509TrustManager);
    }

    @Override // p1.g
    public final void f(SSLSocket sSLSocket, String str, List list) {
        switch (this.f6426c) {
            case 0:
                if (str != null) {
                    ((C0.b) this.f6427d).k(sSLSocket, Boolean.TRUE);
                    ((C0.b) this.f6428e).k(sSLSocket, str);
                }
                C0.b bVar = (C0.b) this.f6430g;
                if (bVar == null || bVar.g(sSLSocket.getClass()) == null) {
                    return;
                }
                s1.e eVar = new s1.e();
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    s sVar = (s) list.get(i2);
                    if (sVar != s.HTTP_1_0) {
                        eVar.t(sVar.f1416a.length());
                        String str2 = sVar.f1416a;
                        eVar.v(str2, 0, str2.length());
                    }
                }
                try {
                    bVar.j(sSLSocket, eVar.f());
                    return;
                } catch (InvocationTargetException e2) {
                    Throwable targetException = e2.getTargetException();
                    if (targetException instanceof RuntimeException) {
                        throw ((RuntimeException) targetException);
                    }
                    AssertionError assertionError = new AssertionError("Unexpected exception");
                    assertionError.initCause(targetException);
                    throw assertionError;
                }
            default:
                try {
                    ((Method) this.f6427d).invoke(null, sSLSocket, Proxy.newProxyInstance(g.class.getClassLoader(), new Class[]{(Class) this.f6430g, (Class) this.f6431h}, new f(g.b(list))));
                    return;
                } catch (IllegalAccessException | InvocationTargetException e3) {
                    throw j1.d.a("unable to set alpn", e3);
                }
        }
    }

    @Override // p1.g
    public void g(Socket socket, InetSocketAddress inetSocketAddress, int i2) {
        switch (this.f6426c) {
            case 0:
                try {
                    socket.connect(inetSocketAddress, i2);
                    return;
                } catch (AssertionError e2) {
                    if (!j1.d.m(e2)) {
                        throw e2;
                    }
                    throw new IOException(e2);
                } catch (ClassCastException e3) {
                    if (Build.VERSION.SDK_INT != 26) {
                        throw e3;
                    }
                    IOException iOException = new IOException("Exception in connect");
                    iOException.initCause(e3);
                    throw iOException;
                } catch (SecurityException e4) {
                    IOException iOException2 = new IOException("Exception in connect");
                    iOException2.initCause(e4);
                    throw iOException2;
                }
            default:
                super.g(socket, inetSocketAddress, i2);
                return;
        }
    }

    @Override // p1.g
    public SSLContext h() {
        switch (this.f6426c) {
            case 0:
                try {
                    return SSLContext.getInstance("TLS");
                } catch (NoSuchAlgorithmException e2) {
                    throw new IllegalStateException("No TLS provider", e2);
                }
            default:
                return super.h();
        }
    }

    @Override // p1.g
    public final String i(SSLSocket sSLSocket) {
        switch (this.f6426c) {
            case 0:
                C0.b bVar = (C0.b) this.f6429f;
                if (bVar == null || bVar.g(sSLSocket.getClass()) == null) {
                    return null;
                }
                try {
                    byte[] bArr = (byte[]) bVar.j(sSLSocket, new Object[0]);
                    if (bArr != null) {
                        return new String(bArr, j1.d.f6056d);
                    }
                    return null;
                } catch (InvocationTargetException e2) {
                    Throwable targetException = e2.getTargetException();
                    if (targetException instanceof RuntimeException) {
                        throw ((RuntimeException) targetException);
                    }
                    AssertionError assertionError = new AssertionError("Unexpected exception");
                    assertionError.initCause(targetException);
                    throw assertionError;
                }
            default:
                try {
                    f fVar = (f) Proxy.getInvocationHandler(((Method) this.f6428e).invoke(null, sSLSocket));
                    boolean z2 = fVar.f6435b;
                    if (!z2 && fVar.f6436c == null) {
                        g.f6437a.l(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
                        return null;
                    }
                    if (z2) {
                        return null;
                    }
                    return fVar.f6436c;
                } catch (IllegalAccessException e3) {
                    e = e3;
                    throw j1.d.a("unable to get selected protocol", e);
                } catch (InvocationTargetException e4) {
                    e = e4;
                    throw j1.d.a("unable to get selected protocol", e);
                }
        }
    }

    @Override // p1.g
    public Object j() {
        switch (this.f6426c) {
            case 0:
                O0.e eVar = (O0.e) this.f6431h;
                Method method = eVar.f279a;
                if (method == null) {
                    return null;
                }
                try {
                    Object invoke = method.invoke(null, null);
                    eVar.f280b.invoke(invoke, "response.body().close()");
                    return invoke;
                } catch (Exception unused) {
                    return null;
                }
            default:
                return super.j();
        }
    }

    @Override // p1.g
    public boolean k(String str) {
        switch (this.f6426c) {
            case 0:
                try {
                    Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
                    return n(str, cls, cls.getMethod("getInstance", null).invoke(null, null));
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    return true;
                } catch (IllegalAccessException e2) {
                    e = e2;
                    throw j1.d.a("unable to determine cleartext support", e);
                } catch (IllegalArgumentException e3) {
                    e = e3;
                    throw j1.d.a("unable to determine cleartext support", e);
                } catch (InvocationTargetException e4) {
                    e = e4;
                    throw j1.d.a("unable to determine cleartext support", e);
                }
            default:
                return super.k(str);
        }
    }

    @Override // p1.g
    public void l(int i2, String str, Throwable th) {
        int min;
        switch (this.f6426c) {
            case 0:
                int i3 = i2 != 5 ? 3 : 5;
                if (th != null) {
                    str = str + '\n' + Log.getStackTraceString(th);
                }
                int length = str.length();
                int i4 = 0;
                while (i4 < length) {
                    int indexOf = str.indexOf(10, i4);
                    if (indexOf == -1) {
                        indexOf = length;
                    }
                    while (true) {
                        min = Math.min(indexOf, i4 + 4000);
                        Log.println(i3, "OkHttp", str.substring(i4, min));
                        if (min >= indexOf) {
                            break;
                        } else {
                            i4 = min;
                        }
                    }
                    i4 = min + 1;
                }
                break;
            default:
                super.l(i2, str, th);
                break;
        }
    }

    @Override // p1.g
    public void m(String str, Object obj) {
        switch (this.f6426c) {
            case 0:
                O0.e eVar = (O0.e) this.f6431h;
                eVar.getClass();
                if (obj != null) {
                    try {
                        eVar.f281c.invoke(obj, null);
                        break;
                    } catch (Exception unused) {
                    }
                }
                l(5, str, null);
                break;
            default:
                super.m(str, obj);
                break;
        }
    }

    public c(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.f6427d = method;
        this.f6428e = method2;
        this.f6429f = method3;
        this.f6430g = cls;
        this.f6431h = cls2;
    }
}
