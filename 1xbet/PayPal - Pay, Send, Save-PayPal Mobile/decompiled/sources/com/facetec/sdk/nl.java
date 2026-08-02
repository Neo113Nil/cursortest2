package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class nl extends com.facetec.sdk.ol.e {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static long r;

    /* renamed from: a, reason: collision with root package name */
    java.net.Socket f3683a;
    java.net.Socket b;
    final com.facetec.sdk.nc c;
    com.facetec.sdk.mn d;
    final com.facetec.sdk.mk e;
    com.facetec.sdk.pr f;
    public boolean g;
    com.facetec.sdk.ol h;
    com.facetec.sdk.na i;
    com.facetec.sdk.pj j;
    public int n;
    public int k = 1;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List<java.lang.ref.Reference<com.facetec.sdk.nu>> f3684o = new java.util.ArrayList();
    public long m = Long.MAX_VALUE;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:4:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String $$c(byte b, short s, byte b2) {
        int i;
        int i2;
        int i3 = s + 4;
        int i4 = (b * 4) + 1;
        byte[] bArr = $$a;
        int i5 = 110 - b2;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i6 = i4;
            i2 = 0;
            i5 += i6;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            i3++;
            if (i2 == i4) {
                return new java.lang.String(bArr2, 0);
            }
            i6 = bArr[i3];
            i5 += i6;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            i3++;
            if (i2 == i4) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            i3++;
            if (i2 == i4) {
            }
        }
    }

    static void init$0() {
        $$a = new byte[]{com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 116, 56, -106};
        $$b = 110;
    }

    private static void p(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str != null ? str.toCharArray() : str;
        com.facetec.sdk.hu huVar = new com.facetec.sdk.hu();
        char[] b = com.facetec.sdk.hu.b(r ^ 4732878740741522786L, charArray, i);
        int i2 = 4;
        huVar.b = 4;
        while (huVar.b < b.length) {
            huVar.e = huVar.b - i2;
            int i3 = huVar.b;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(b[huVar.b] ^ b[huVar.b % i2]), java.lang.Long.valueOf(huVar.e), java.lang.Long.valueOf(r)};
                java.lang.Object d = com.facetec.sdk.al.d(-474326228);
                if (d == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 - 1);
                    d = com.facetec.sdk.al.c((char) (6934 - android.graphics.ImageFormat.getBitsPerPixel(0)), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2388, android.text.TextUtils.indexOf("", "", 0) + 23, 1146429908, false, $$c(b2, b3, (byte) (-b3)), new java.lang.Class[]{java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE});
                }
                b[i3] = ((java.lang.Character) ((java.lang.reflect.Method) d).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr3 = {huVar, huVar};
                java.lang.Object d2 = com.facetec.sdk.al.d(-57140341);
                if (d2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 - 1);
                    d2 = com.facetec.sdk.al.c((char) android.view.View.MeasureSpec.getMode(0), android.os.Process.getGidForName("") + 886, (android.view.ViewConfiguration.getTouchSlop() >> 8) + 32, 1534550387, false, $$c(b4, b5, (byte) (b5 + 1)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d2).invoke(null, objArr3);
                i2 = 4;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new java.lang.String(b, 4, b.length - 4);
    }

    public nl(com.facetec.sdk.mk mkVar, com.facetec.sdk.nc ncVar) {
        this.e = mkVar;
        this.c = ncVar;
    }

    final void c(int i, int i2) throws java.io.IOException {
        java.net.Socket createSocket;
        java.net.Proxy e = this.c.e();
        com.facetec.sdk.lz d = this.c.d();
        if (e.type() == java.net.Proxy.Type.DIRECT || e.type() == java.net.Proxy.Type.HTTP) {
            createSocket = d.c.createSocket();
        } else {
            createSocket = new java.net.Socket(e);
        }
        this.f3683a = createSocket;
        this.c.b();
        this.f3683a.setSoTimeout(i2);
        try {
            com.facetec.sdk.pa.d().c(this.f3683a, this.c.b(), i);
            try {
                this.f = com.facetec.sdk.pt.d(com.facetec.sdk.pt.d(this.f3683a));
                this.j = com.facetec.sdk.pt.e(com.facetec.sdk.pt.a(this.f3683a));
            } catch (java.lang.NullPointerException e2) {
                if ("throw with null exception".equals(e2.getMessage())) {
                    throw new java.io.IOException(e2);
                }
            }
        } catch (java.net.ConnectException e3) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to connect to ");
            sb.append(this.c.b());
            java.net.ConnectException connectException = new java.net.ConnectException(sb.toString());
            connectException.initCause(e3);
            throw connectException;
        }
    }

    final void c(int i) throws java.io.IOException {
        this.b.setSoTimeout(0);
        com.facetec.sdk.ol.b bVar = new com.facetec.sdk.ol.b();
        java.net.Socket socket = this.b;
        java.lang.String g = this.c.d().b().g();
        com.facetec.sdk.pr prVar = this.f;
        com.facetec.sdk.pj pjVar = this.j;
        bVar.b = socket;
        bVar.c = g;
        bVar.f3720a = prVar;
        bVar.e = pjVar;
        bVar.d = this;
        bVar.i = i;
        com.facetec.sdk.ol olVar = new com.facetec.sdk.ol(bVar);
        this.h = olVar;
        olVar.n.d();
        olVar.n.c(olVar.l);
        if (olVar.l.e() != 65535) {
            olVar.n.c(0, r0 - 65535);
        }
        new java.lang.Thread(olVar.r).start();
    }

    public final boolean a(com.facetec.sdk.lz lzVar, @javax.annotation.Nullable com.facetec.sdk.nc ncVar) {
        if (this.f3684o.size() >= this.k || this.g || !com.facetec.sdk.nd.d.e(this.c.d(), lzVar)) {
            return false;
        }
        if (lzVar.b().g().equals(e().d().b().g())) {
            return true;
        }
        if (this.h == null || ncVar == null || ncVar.e().type() != java.net.Proxy.Type.DIRECT || this.c.e().type() != java.net.Proxy.Type.DIRECT || !this.c.b().equals(ncVar.b()) || ncVar.d().j() != com.facetec.sdk.pf.d || !b(lzVar.b())) {
            return false;
        }
        try {
            lzVar.f().e(lzVar.b().g(), c().a());
            return true;
        } catch (javax.net.ssl.SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public final boolean b(com.facetec.sdk.mv mvVar) {
        if (mvVar.h() != this.c.d().b().h()) {
            return false;
        }
        if (mvVar.g().equals(this.c.d().b().g())) {
            return true;
        }
        return this.d != null && com.facetec.sdk.pf.d.a(mvVar.g(), (java.security.cert.X509Certificate) this.d.a().get(0));
    }

    public final com.facetec.sdk.nc e() {
        return this.c;
    }

    public final void d() {
        com.facetec.sdk.nh.c(this.f3683a);
    }

    public final java.net.Socket a() {
        return this.b;
    }

    public final boolean a(boolean z) {
        if (this.b.isClosed() || this.b.isInputShutdown() || this.b.isOutputShutdown()) {
            return false;
        }
        com.facetec.sdk.ol olVar = this.h;
        if (olVar == null) {
            if (z) {
                try {
                    int soTimeout = this.b.getSoTimeout();
                    try {
                        this.b.setSoTimeout(1);
                        return !this.f.b();
                    } finally {
                        this.b.setSoTimeout(soTimeout);
                    }
                } catch (java.net.SocketTimeoutException unused) {
                } catch (java.io.IOException unused2) {
                    return false;
                }
            }
            return true;
        }
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            p("诰ҡ\ueef5뜛讚䁏枝竗駢分痎梜꿯消䌰䕇봷羖兂댗", -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr[0]);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            p("㪙伌\udff8\udf9f㫷\u0be2嚈ቝ⣱\u19ae䓏\u0013", -(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr2);
            return olVar.e(((java.lang.Long) cls.getMethod((java.lang.String) objArr2[0], null).invoke(null, null)).longValue());
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    @Override // com.facetec.sdk.ol.e
    public final void d(com.facetec.sdk.os osVar) throws java.io.IOException {
        osVar.c(com.facetec.sdk.og.REFUSED_STREAM);
    }

    @Override // com.facetec.sdk.ol.e
    public final void e(com.facetec.sdk.ol olVar) {
        synchronized (this.e) {
            this.k = olVar.d();
        }
    }

    public final com.facetec.sdk.mn c() {
        return this.d;
    }

    public final boolean b() {
        return this.h != null;
    }

    public final java.lang.String toString() {
        java.lang.Object obj;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Connection{");
        sb.append(this.c.d().b().g());
        sb.append(io.ktor.sse.ServerSentEventKt.COLON);
        sb.append(this.c.d().b().h());
        sb.append(", proxy=");
        sb.append(this.c.e());
        sb.append(" hostAddress=");
        sb.append(this.c.b());
        sb.append(" cipherSuite=");
        com.facetec.sdk.mn mnVar = this.d;
        if (mnVar == null) {
            obj = "none";
        } else {
            obj = mnVar.e;
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.i);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    static {
        init$0();
        r = 8624109254224888301L;
    }
}
