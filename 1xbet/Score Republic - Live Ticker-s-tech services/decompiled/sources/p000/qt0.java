package p000;

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

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class qt0 extends rt0 {

    /* JADX INFO: renamed from: d */
    public static final oq0 f6591d;

    /* JADX INFO: renamed from: e */
    public static final oq0 f6592e;

    /* JADX INFO: renamed from: f */
    public static final oq0 f6593f;

    /* JADX INFO: renamed from: g */
    public static final oq0 f6594g;

    /* JADX INFO: renamed from: h */
    public static final oq0 f6595h;

    /* JADX INFO: renamed from: i */
    public static final oq0 f6596i;

    /* JADX INFO: renamed from: j */
    public static final Method f6597j;

    /* JADX INFO: renamed from: k */
    public static final Method f6598k;

    /* JADX INFO: renamed from: l */
    public static final Method f6599l;

    /* JADX INFO: renamed from: m */
    public static final Method f6600m;

    /* JADX INFO: renamed from: n */
    public static final Method f6601n;

    /* JADX INFO: renamed from: o */
    public static final Method f6602o;

    /* JADX INFO: renamed from: p */
    public static final Constructor f6603p;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Method method6;
        Logger logger = rt0.f6958b;
        Class cls = Boolean.TYPE;
        Constructor<?> constructor = null;
        int i = 1;
        f6591d = new oq0((Object) constructor, "setUseSessionTickets", (Object) new Class[]{cls}, i);
        f6592e = new oq0((Object) constructor, "setHostname", (Object) new Class[]{String.class}, i);
        Class<byte[]> cls2 = byte[].class;
        f6593f = new oq0((Object) cls2, "getAlpnSelectedProtocol", (Object) new Class[0], i);
        f6594g = new oq0((Object) constructor, "setAlpnProtocols", (Object) new Class[]{byte[].class}, i);
        f6595h = new oq0((Object) cls2, "getNpnSelectedProtocol", (Object) new Class[0], i);
        f6596i = new oq0((Object) constructor, "setNpnProtocols", (Object) new Class[]{byte[].class}, i);
        try {
            method = SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
            try {
                method2 = SSLParameters.class.getMethod("getApplicationProtocols", null);
                try {
                    method3 = SSLSocket.class.getMethod("getApplicationProtocol", null);
                    try {
                        Class<?> cls3 = Class.forName("android.net.ssl.SSLSockets");
                        method4 = cls3.getMethod("isSupportedSocket", SSLSocket.class);
                        try {
                            method5 = cls3.getMethod("setUseSessionTickets", SSLSocket.class, cls);
                        } catch (ClassNotFoundException e) {
                            e = e;
                            logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                            method5 = null;
                        } catch (NoSuchMethodException e2) {
                            e = e2;
                            logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                            method5 = null;
                        }
                    } catch (ClassNotFoundException e3) {
                        e = e3;
                        method4 = null;
                    } catch (NoSuchMethodException e4) {
                        e = e4;
                        method4 = null;
                    }
                } catch (ClassNotFoundException e5) {
                    e = e5;
                    method3 = null;
                    method4 = method3;
                    logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                    method5 = null;
                    f6599l = method;
                    f6600m = method2;
                    f6601n = method3;
                    f6597j = method4;
                    f6598k = method5;
                    method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                    f6602o = method6;
                    f6603p = constructor;
                } catch (NoSuchMethodException e6) {
                    e = e6;
                    method3 = null;
                    method4 = method3;
                    logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                    method5 = null;
                    f6599l = method;
                    f6600m = method2;
                    f6601n = method3;
                    f6597j = method4;
                    f6598k = method5;
                    method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                    f6602o = method6;
                    f6603p = constructor;
                }
            } catch (ClassNotFoundException e7) {
                e = e7;
                method2 = null;
                method3 = method2;
                method4 = method3;
                logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                method5 = null;
                f6599l = method;
                f6600m = method2;
                f6601n = method3;
                f6597j = method4;
                f6598k = method5;
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                f6602o = method6;
                f6603p = constructor;
            } catch (NoSuchMethodException e8) {
                e = e8;
                method2 = null;
                method3 = method2;
                method4 = method3;
                logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                method5 = null;
                f6599l = method;
                f6600m = method2;
                f6601n = method3;
                f6597j = method4;
                f6598k = method5;
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                f6602o = method6;
                f6603p = constructor;
            }
        } catch (ClassNotFoundException e9) {
            e = e9;
            method = null;
            method2 = null;
        } catch (NoSuchMethodException e10) {
            e = e10;
            method = null;
            method2 = null;
        }
        f6599l = method;
        f6600m = method2;
        f6601n = method3;
        f6597j = method4;
        f6598k = method5;
        try {
            method6 = SSLParameters.class.getMethod("setServerNames", List.class);
            try {
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
            } catch (ClassNotFoundException e11) {
                e = e11;
                logger.log(Level.FINER, "Failed to find Android 7.0+ APIs", (Throwable) e);
            } catch (NoSuchMethodException e12) {
                e = e12;
                logger.log(Level.FINER, "Failed to find Android 7.0+ APIs", (Throwable) e);
            }
        } catch (ClassNotFoundException e13) {
            e = e13;
            method6 = null;
        } catch (NoSuchMethodException e14) {
            e = e14;
            method6 = null;
        }
        f6602o = method6;
        f6603p = constructor;
    }

    @Override // p000.rt0
    /* JADX INFO: renamed from: a */
    public final void mo4139a(SSLSocket sSLSocket, String str, List list) {
        Constructor constructor;
        Method method;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ky0) it.next()).f4596j);
        }
        boolean z = false;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        if (str != null) {
            try {
                try {
                    if (rt0.m4402c(str)) {
                        Method method2 = f6597j;
                        if (method2 == null || !((Boolean) method2.invoke(null, sSLSocket)).booleanValue()) {
                            f6591d.m3740l(sSLSocket, Boolean.TRUE);
                        } else {
                            f6598k.invoke(null, sSLSocket, Boolean.TRUE);
                        }
                        Method method3 = f6602o;
                        if (method3 == null || (constructor = f6603p) == null) {
                            f6592e.m3740l(sSLSocket, str);
                        } else {
                            method3.invoke(sSLParameters, Collections.singletonList(constructor.newInstance(str)));
                        }
                    }
                } catch (InvocationTargetException e) {
                    dd0.m1163h(e);
                    return;
                }
            } catch (IllegalAccessException e2) {
                dd0.m1163h(e2);
                return;
            } catch (InstantiationException e3) {
                dd0.m1163h(e3);
                return;
            }
        }
        Method method4 = f6601n;
        if (method4 != null) {
            try {
                method4.invoke(sSLSocket, null);
                f6599l.invoke(sSLParameters, strArr);
                z = true;
            } catch (InvocationTargetException e4) {
                if (!(e4.getTargetException() instanceof UnsupportedOperationException)) {
                    throw e4;
                }
                rt0.f6958b.log(Level.FINER, "setApplicationProtocol unsupported, will try old methods");
            }
        }
        sSLSocket.setSSLParameters(sSLParameters);
        if (z && (method = f6600m) != null && Arrays.equals(strArr, (String[]) method.invoke(sSLSocket.getSSLParameters(), null))) {
            return;
        }
        Object[] objArr = {fw0.m1895b(list)};
        fw0 fw0Var = this.f6960a;
        if (fw0Var.mo789e() == 1) {
            f6594g.m3741m(sSLSocket, objArr);
        }
        if (fw0Var.mo789e() == 3) {
            throw new RuntimeException("We can not do TLS handshake on this Android version, please install the Google Play Services Dynamic Security Provider to use TLS");
        }
        f6596i.m3741m(sSLSocket, objArr);
    }

    @Override // p000.rt0
    /* JADX INFO: renamed from: b */
    public final String mo4140b(SSLSocket sSLSocket) {
        Logger logger = rt0.f6958b;
        Method method = f6601n;
        if (method != null) {
            try {
                return (String) method.invoke(sSLSocket, null);
            } catch (IllegalAccessException e) {
                dd0.m1163h(e);
                return null;
            } catch (InvocationTargetException e2) {
                if (!(e2.getTargetException() instanceof UnsupportedOperationException)) {
                    dd0.m1163h(e2);
                    return null;
                }
                logger.log(Level.FINER, "Socket unsupported for getApplicationProtocol, will try old methods");
            }
        }
        fw0 fw0Var = this.f6960a;
        if (fw0Var.mo789e() == 1) {
            try {
                byte[] bArr = (byte[]) f6593f.m3741m(sSLSocket, new Object[0]);
                if (bArr != null) {
                    return new String(bArr, ah1.f184b);
                }
            } catch (Exception e3) {
                logger.log(Level.FINE, "Failed calling getAlpnSelectedProtocol()", (Throwable) e3);
            }
        }
        if (fw0Var.mo789e() != 3) {
            try {
                byte[] bArr2 = (byte[]) f6595h.m3741m(sSLSocket, new Object[0]);
                if (bArr2 != null) {
                    return new String(bArr2, ah1.f184b);
                }
            } catch (Exception e4) {
                logger.log(Level.FINE, "Failed calling getNpnSelectedProtocol()", (Throwable) e4);
            }
        }
        return null;
    }

    @Override // p000.rt0
    /* JADX INFO: renamed from: d */
    public final String mo4141d(SSLSocket sSLSocket, String str, List list) {
        String strMo4140b = mo4140b(sSLSocket);
        return strMo4140b == null ? super.mo4141d(sSLSocket, str, list) : strMo4140b;
    }
}
