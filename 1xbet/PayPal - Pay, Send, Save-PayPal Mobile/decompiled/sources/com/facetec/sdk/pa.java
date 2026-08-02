package com.facetec.sdk;

/* loaded from: classes8.dex */
public class pa {
    private static final byte[] $$a = null;
    private static final int $$b = 0;

    /* renamed from: a, reason: collision with root package name */
    private static final com.facetec.sdk.pa f3739a;
    private static final java.util.logging.Logger c;
    private static char[] d;

    private static java.lang.String $$c(byte b, byte b2, int i) {
        byte[] bArr = $$a;
        int i2 = i * 3;
        int i3 = (b * 3) + 4;
        int i4 = b2 + 98;
        byte[] bArr2 = new byte[i2 + 1];
        int i5 = -1;
        if (bArr == null) {
            i3++;
            i4 += i2;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i4;
            if (i5 == i2) {
                return new java.lang.String(bArr2, 0);
            }
            int i6 = bArr[i3];
            i3++;
            i4 += i6;
        }
    }

    static void init$0() {
        $$a = new byte[]{121, 74, -2, com.google.common.base.Ascii.EM};
        $$b = 11;
    }

    @javax.annotation.Nullable
    public java.lang.String b(javax.net.ssl.SSLSocket sSLSocket) {
        return null;
    }

    public void b(javax.net.ssl.SSLSocket sSLSocket, @javax.annotation.Nullable java.lang.String str, java.util.List<com.facetec.sdk.na> list) throws java.io.IOException {
    }

    public boolean b(java.lang.String str) {
        return true;
    }

    public void d(javax.net.ssl.SSLSocket sSLSocket) {
    }

    public void e(javax.net.ssl.SSLSocketFactory sSLSocketFactory) {
    }

    public static com.facetec.sdk.pa d() {
        return f3739a;
    }

    public void c(java.net.Socket socket, java.net.InetSocketAddress inetSocketAddress, int i) throws java.io.IOException {
        socket.connect(inetSocketAddress, i);
    }

    public void d(int i, java.lang.String str, @javax.annotation.Nullable java.lang.Throwable th) {
        c.log(i == 5 ? java.util.logging.Level.WARNING : java.util.logging.Level.INFO, str, th);
    }

    public java.lang.Object d(java.lang.String str) {
        if (c.isLoggable(java.util.logging.Level.FINE)) {
            return new java.lang.Throwable(str);
        }
        return null;
    }

    public void a(java.lang.String str, java.lang.Object obj) {
        if (obj == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
            str = sb.toString();
        }
        d(5, str, (java.lang.Throwable) obj);
    }

    public static java.util.List<java.lang.String> e(java.util.List<com.facetec.sdk.na> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            com.facetec.sdk.na naVar = list.get(i);
            if (naVar != com.facetec.sdk.na.HTTP_1_0) {
                arrayList.add(naVar.toString());
            }
        }
        return arrayList;
    }

    private static void h(java.lang.String str, int[] iArr, boolean z, java.lang.Object[] objArr) {
        int i;
        byte[] bArr;
        java.lang.String str2 = str;
        byte[] bArr2 = str2;
        if (str2 != null) {
            bArr2 = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr3 = bArr2;
        com.facetec.sdk.hj hjVar = new com.facetec.sdk.hj();
        int i2 = 0;
        int i3 = iArr[0];
        byte b = 1;
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = d;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    objArr2[i2] = java.lang.Integer.valueOf(cArr[i7]);
                    java.lang.Object d2 = com.facetec.sdk.al.d(-1287922392);
                    if (d2 == null) {
                        d2 = com.facetec.sdk.al.c((char) android.view.KeyEvent.normalizeMetaState(i2), android.view.KeyEvent.keyCodeFromString("") + 2460, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 24, 349480912, false, "c", new java.lang.Class[]{java.lang.Integer.TYPE});
                    }
                    cArr2[i7] = ((java.lang.Character) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).charValue();
                    i7++;
                    i2 = 0;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        java.lang.System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr3 != null) {
            char[] cArr4 = new char[i4];
            hjVar.c = 0;
            char c2 = 0;
            while (hjVar.c < i4) {
                if (bArr3[hjVar.c] == b) {
                    int i8 = hjVar.c;
                    char c3 = cArr3[hjVar.c];
                    java.lang.Object[] objArr3 = new java.lang.Object[2];
                    objArr3[b] = java.lang.Integer.valueOf(c2);
                    objArr3[0] = java.lang.Integer.valueOf(c3);
                    java.lang.Object d3 = com.facetec.sdk.al.d(966199657);
                    if (d3 == null) {
                        char maximumFlingVelocity = (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        int scrollDefaultDelay = android.view.ViewConfiguration.getScrollDefaultDelay();
                        long uptimeMillis = android.os.SystemClock.uptimeMillis();
                        byte b2 = (byte) 0;
                        java.lang.String $$c = $$c(b2, b2, b2);
                        java.lang.Class[] clsArr = new java.lang.Class[2];
                        clsArr[0] = java.lang.Integer.TYPE;
                        clsArr[b] = java.lang.Integer.TYPE;
                        d3 = com.facetec.sdk.al.c(maximumFlingVelocity, (scrollDefaultDelay >> 16) + 2054, 25 - (uptimeMillis > 0L ? 1 : (uptimeMillis == 0L ? 0 : -1)), -1636273263, false, $$c, clsArr);
                    }
                    cArr4[i8] = ((java.lang.Character) ((java.lang.reflect.Method) d3).invoke(null, objArr3)).charValue();
                } else {
                    int i9 = hjVar.c;
                    char c4 = cArr3[hjVar.c];
                    java.lang.Object[] objArr4 = new java.lang.Object[2];
                    objArr4[b] = java.lang.Integer.valueOf(c2);
                    objArr4[0] = java.lang.Integer.valueOf(c4);
                    java.lang.Object d4 = com.facetec.sdk.al.d(-1755423365);
                    if (d4 == null) {
                        byte b3 = (byte) 0;
                        d4 = com.facetec.sdk.al.c((char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - b), 963 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), android.view.View.MeasureSpec.getSize(0) + 24, 816916355, false, $$c(b3, (byte) (b3 | 6), b3), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                    }
                    cArr4[i9] = ((java.lang.Character) ((java.lang.reflect.Method) d4).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[hjVar.c];
                java.lang.Object[] objArr5 = {hjVar, hjVar};
                java.lang.Object d5 = com.facetec.sdk.al.d(-1890346561);
                if (d5 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 5);
                    bArr = bArr3;
                    d5 = com.facetec.sdk.al.c((char) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 58394), 1763 - (android.view.ViewConfiguration.getTapTimeout() >> 16), 25 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), 683467591, false, $$c(b4, b5, (byte) (b5 - 5)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                } else {
                    bArr = bArr3;
                }
                ((java.lang.reflect.Method) d5).invoke(null, objArr5);
                bArr3 = bArr;
                b = 1;
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            i = 0;
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i10 = i4 - i6;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i10, i6);
            java.lang.System.arraycopy(cArr5, i6, cArr3, 0, i10);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr6 = new char[i4];
            while (true) {
                hjVar.c = i;
                if (hjVar.c >= i4) {
                    break;
                }
                cArr6[hjVar.c] = cArr3[(i4 - hjVar.c) - 1];
                i = hjVar.c + 1;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            int i11 = 0;
            while (true) {
                hjVar.c = i11;
                if (hjVar.c >= i4) {
                    break;
                }
                cArr3[hjVar.c] = (char) (cArr3[hjVar.c] - iArr[2]);
                i11 = hjVar.c + 1;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    public com.facetec.sdk.pg a(javax.net.ssl.X509TrustManager x509TrustManager) {
        return new com.facetec.sdk.pi(e(x509TrustManager));
    }

    public static boolean g() {
        try {
            java.lang.Object[] objArr = {"java.vm.name"};
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            h("\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000", new int[]{0, 16, 0, 10}, true, objArr2);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr2[0]);
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            h("\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000", new int[]{16, 11, 0, 0}, true, objArr3);
            return "Dalvik".equals(cls.getMethod((java.lang.String) objArr3[0], java.lang.String.class).invoke(null, objArr));
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public javax.net.ssl.SSLContext b() {
        try {
            java.lang.Object[] objArr = {"java.specification.version"};
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            h("\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000", new int[]{0, 16, 0, 10}, true, objArr2);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr2[0]);
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            h("\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000", new int[]{16, 11, 0, 0}, true, objArr3);
            if ("1.7".equals(cls.getMethod((java.lang.String) objArr3[0], java.lang.String.class).invoke(null, objArr))) {
                try {
                    return javax.net.ssl.SSLContext.getInstance("TLSv1.2");
                } catch (java.security.NoSuchAlgorithmException unused) {
                }
            }
            try {
                return javax.net.ssl.SSLContext.getInstance("TLS");
            } catch (java.security.NoSuchAlgorithmException e) {
                throw new java.lang.IllegalStateException("No TLS provider", e);
            }
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public com.facetec.sdk.pm e(javax.net.ssl.X509TrustManager x509TrustManager) {
        return new com.facetec.sdk.ph(x509TrustManager.getAcceptedIssuers());
    }

    public java.lang.String toString() {
        return getClass().getSimpleName();
    }

    static {
        com.facetec.sdk.pa c2;
        init$0();
        j();
        if (g()) {
            c2 = com.facetec.sdk.ov.c();
            if (c2 == null && (c2 = com.facetec.sdk.oy.a()) == null) {
                throw new java.lang.NullPointerException("No platform found on Android");
            }
        } else {
            try {
                java.lang.Object[] objArr = {"okhttp.platform"};
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                h("\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000", new int[]{0, 16, 0, 10}, true, objArr2);
                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr2[0]);
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                h("\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000", new int[]{16, 11, 0, 0}, true, objArr3);
                if (((!"conscrypt".equals(cls.getMethod((java.lang.String) objArr3[0], java.lang.String.class).invoke(null, objArr)) && !"Conscrypt".equals(java.security.Security.getProviders()[0].getName())) || (c2 = com.facetec.sdk.ox.c()) == null) && (c2 = com.facetec.sdk.pb.a()) == null && (c2 = com.facetec.sdk.pd.c()) == null) {
                    c2 = new com.facetec.sdk.pa();
                }
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        f3739a = c2;
        c = java.util.logging.Logger.getLogger(com.facetec.sdk.ms.class.getName());
    }

    static void j() {
        d = new char[]{47251, 47310, 47342, 47331, 47330, 47305, 47299, 47343, 47343, 47329, 47343, 47341, 47336, 47351, 47346, 47330, 47288, 47346, 47351, 47343, 47342, 47339, 47348, 47333, 47334, 47336, 47330};
    }
}
