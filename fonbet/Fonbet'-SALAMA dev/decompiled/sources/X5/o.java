package X5;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* loaded from: classes2.dex */
public final class o extends p {

    /* renamed from: d, reason: collision with root package name */
    public static final android.support.v4.media.session.t f7607d;

    /* renamed from: e, reason: collision with root package name */
    public static final android.support.v4.media.session.t f7608e;

    /* renamed from: f, reason: collision with root package name */
    public static final android.support.v4.media.session.t f7609f;

    /* renamed from: g, reason: collision with root package name */
    public static final android.support.v4.media.session.t f7610g;

    /* renamed from: h, reason: collision with root package name */
    public static final android.support.v4.media.session.t f7611h;

    /* renamed from: i, reason: collision with root package name */
    public static final android.support.v4.media.session.t f7612i;
    public static final Method j;

    /* renamed from: k, reason: collision with root package name */
    public static final Method f7613k;

    /* renamed from: l, reason: collision with root package name */
    public static final Method f7614l;

    /* renamed from: m, reason: collision with root package name */
    public static final Method f7615m;

    /* renamed from: n, reason: collision with root package name */
    public static final Method f7616n;

    /* renamed from: o, reason: collision with root package name */
    public static final Method f7617o;

    /* renamed from: p, reason: collision with root package name */
    public static final Constructor f7618p;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Method method6;
        Class<?> cls;
        Logger logger = p.f7619b;
        Class cls2 = Boolean.TYPE;
        Constructor<?> constructor = null;
        int i7 = 15;
        f7607d = new android.support.v4.media.session.t(constructor, "setUseSessionTickets", new Class[]{cls2}, i7);
        f7608e = new android.support.v4.media.session.t(constructor, "setHostname", new Class[]{String.class}, i7);
        Class<byte[]> cls3 = byte[].class;
        f7609f = new android.support.v4.media.session.t(cls3, "getAlpnSelectedProtocol", new Class[0], i7);
        f7610g = new android.support.v4.media.session.t(constructor, "setAlpnProtocols", new Class[]{byte[].class}, i7);
        f7611h = new android.support.v4.media.session.t(cls3, "getNpnSelectedProtocol", new Class[0], i7);
        f7612i = new android.support.v4.media.session.t(constructor, "setNpnProtocols", new Class[]{byte[].class}, i7);
        try {
            method = SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
            try {
                method2 = SSLParameters.class.getMethod("getApplicationProtocols", null);
                try {
                    method3 = SSLSocket.class.getMethod("getApplicationProtocol", null);
                    try {
                        cls = Class.forName("android.net.ssl.SSLSockets");
                        method4 = cls.getMethod("isSupportedSocket", SSLSocket.class);
                    } catch (ClassNotFoundException e7) {
                        e = e7;
                        method4 = null;
                    } catch (NoSuchMethodException e8) {
                        e = e8;
                        method4 = null;
                    }
                } catch (ClassNotFoundException e9) {
                    e = e9;
                    method3 = null;
                    method4 = method3;
                    logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                    method5 = null;
                    f7614l = method;
                    f7615m = method2;
                    f7616n = method3;
                    j = method4;
                    f7613k = method5;
                    method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                    try {
                        constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                    } catch (ClassNotFoundException e10) {
                        e = e10;
                        logger.log(Level.FINER, "Failed to find Android 7.0+ APIs", (Throwable) e);
                        f7617o = method6;
                        f7618p = constructor;
                    } catch (NoSuchMethodException e11) {
                        e = e11;
                        logger.log(Level.FINER, "Failed to find Android 7.0+ APIs", (Throwable) e);
                        f7617o = method6;
                        f7618p = constructor;
                    }
                    f7617o = method6;
                    f7618p = constructor;
                } catch (NoSuchMethodException e12) {
                    e = e12;
                    method3 = null;
                    method4 = method3;
                    logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                    method5 = null;
                    f7614l = method;
                    f7615m = method2;
                    f7616n = method3;
                    j = method4;
                    f7613k = method5;
                    method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                    f7617o = method6;
                    f7618p = constructor;
                }
            } catch (ClassNotFoundException e13) {
                e = e13;
                method2 = null;
                method3 = method2;
                method4 = method3;
                logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                method5 = null;
                f7614l = method;
                f7615m = method2;
                f7616n = method3;
                j = method4;
                f7613k = method5;
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                f7617o = method6;
                f7618p = constructor;
            } catch (NoSuchMethodException e14) {
                e = e14;
                method2 = null;
                method3 = method2;
                method4 = method3;
                logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                method5 = null;
                f7614l = method;
                f7615m = method2;
                f7616n = method3;
                j = method4;
                f7613k = method5;
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                f7617o = method6;
                f7618p = constructor;
            }
        } catch (ClassNotFoundException e15) {
            e = e15;
            method = null;
            method2 = null;
        } catch (NoSuchMethodException e16) {
            e = e16;
            method = null;
            method2 = null;
        }
        try {
            method5 = cls.getMethod("setUseSessionTickets", SSLSocket.class, cls2);
        } catch (ClassNotFoundException e17) {
            e = e17;
            logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
            method5 = null;
            f7614l = method;
            f7615m = method2;
            f7616n = method3;
            j = method4;
            f7613k = method5;
            method6 = SSLParameters.class.getMethod("setServerNames", List.class);
            constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
            f7617o = method6;
            f7618p = constructor;
        } catch (NoSuchMethodException e18) {
            e = e18;
            logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
            method5 = null;
            f7614l = method;
            f7615m = method2;
            f7616n = method3;
            j = method4;
            f7613k = method5;
            method6 = SSLParameters.class.getMethod("setServerNames", List.class);
            constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
            f7617o = method6;
            f7618p = constructor;
        }
        f7614l = method;
        f7615m = method2;
        f7616n = method3;
        j = method4;
        f7613k = method5;
        try {
            method6 = SSLParameters.class.getMethod("setServerNames", List.class);
            constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
        } catch (ClassNotFoundException e19) {
            e = e19;
            method6 = null;
        } catch (NoSuchMethodException e20) {
            e = e20;
            method6 = null;
        }
        f7617o = method6;
        f7618p = constructor;
    }

    @Override // X5.p
    public final void a(SSLSocket sSLSocket, String str, List list) {
        Constructor constructor;
        Method method;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Y5.k) it.next()).f7810a);
        }
        boolean z4 = false;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        if (str != null) {
            try {
                try {
                    if (p.c(str)) {
                        Method method2 = j;
                        if (method2 == null || !((Boolean) method2.invoke(null, sSLSocket)).booleanValue()) {
                            f7607d.n0(sSLSocket, Boolean.TRUE);
                        } else {
                            f7613k.invoke(null, sSLSocket, Boolean.TRUE);
                        }
                        Method method3 = f7617o;
                        if (method3 == null || (constructor = f7618p) == null) {
                            f7608e.n0(sSLSocket, str);
                        } else {
                            method3.invoke(sSLParameters, Collections.singletonList(constructor.newInstance(str)));
                        }
                    }
                } catch (InvocationTargetException e7) {
                    throw new RuntimeException(e7);
                }
            } catch (IllegalAccessException e8) {
                throw new RuntimeException(e8);
            } catch (InstantiationException e9) {
                throw new RuntimeException(e9);
            }
        }
        Method method4 = f7616n;
        if (method4 != null) {
            try {
                method4.invoke(sSLSocket, null);
                f7614l.invoke(sSLParameters, strArr);
                z4 = true;
            } catch (InvocationTargetException e10) {
                if (!(e10.getTargetException() instanceof UnsupportedOperationException)) {
                    throw e10;
                }
                p.f7619b.log(Level.FINER, "setApplicationProtocol unsupported, will try old methods");
            }
        }
        sSLSocket.setSSLParameters(sSLParameters);
        if (z4 && (method = f7615m) != null && Arrays.equals(strArr, (String[]) method.invoke(sSLSocket.getSSLParameters(), null))) {
            return;
        }
        Object[] objArr = {Y5.j.b(list)};
        Y5.j jVar = this.f7621a;
        if (jVar.e() == 1) {
            f7610g.o0(sSLSocket, objArr);
        }
        if (jVar.e() == 3) {
            throw new RuntimeException("We can not do TLS handshake on this Android version, please install the Google Play Services Dynamic Security Provider to use TLS");
        }
        f7612i.o0(sSLSocket, objArr);
    }

    @Override // X5.p
    public final String b(SSLSocket sSLSocket) {
        Logger logger = p.f7619b;
        Method method = f7616n;
        if (method != null) {
            try {
                return (String) method.invoke(sSLSocket, null);
            } catch (IllegalAccessException e7) {
                throw new RuntimeException(e7);
            } catch (InvocationTargetException e8) {
                if (!(e8.getTargetException() instanceof UnsupportedOperationException)) {
                    throw new RuntimeException(e8);
                }
                logger.log(Level.FINER, "Socket unsupported for getApplicationProtocol, will try old methods");
            }
        }
        Y5.j jVar = this.f7621a;
        if (jVar.e() == 1) {
            try {
                byte[] bArr = (byte[]) f7609f.o0(sSLSocket, new Object[0]);
                if (bArr != null) {
                    return new String(bArr, Y5.m.f7819b);
                }
            } catch (Exception e9) {
                logger.log(Level.FINE, "Failed calling getAlpnSelectedProtocol()", (Throwable) e9);
            }
        }
        if (jVar.e() != 3) {
            try {
                byte[] bArr2 = (byte[]) f7611h.o0(sSLSocket, new Object[0]);
                if (bArr2 != null) {
                    return new String(bArr2, Y5.m.f7819b);
                }
            } catch (Exception e10) {
                logger.log(Level.FINE, "Failed calling getNpnSelectedProtocol()", (Throwable) e10);
            }
        }
        return null;
    }

    @Override // X5.p
    public final String d(SSLSocket sSLSocket, String str, List list) {
        String b7 = b(sSLSocket);
        return b7 == null ? super.d(sSLSocket, str, list) : b7;
    }
}
