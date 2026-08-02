package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class nu {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    public static final /* synthetic */ boolean g;
    private static char[] q;
    private static long r;

    /* renamed from: a, reason: collision with root package name */
    public com.facetec.sdk.nl f3692a;
    public final com.facetec.sdk.md b;
    public final com.facetec.sdk.mo c;
    public com.facetec.sdk.nc d;
    public final com.facetec.sdk.mk e;
    private com.facetec.sdk.lz f;
    public boolean h;
    private com.facetec.sdk.nq.d i;
    public com.facetec.sdk.nx j;
    private int k;
    private boolean l;
    private final java.lang.Object m;
    private boolean n;

    /* renamed from: o, reason: collision with root package name */
    private final com.facetec.sdk.nq f3693o;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String $$c(int i, int i2, int i3) {
        int i4;
        int i5;
        byte[] bArr = $$a;
        int i6 = (i2 * 3) + 4;
        int i7 = 106 - i;
        int i8 = i3 * 3;
        byte[] bArr2 = new byte[1 - i8];
        int i9 = -1;
        if (bArr == null) {
            int i10 = -1;
            int i11 = i6;
            i6 += i7;
            i4 = i11 + 1;
            i9 = i10;
            i5 = i9 + 1;
            bArr2[i5] = (byte) i6;
            if (i5 == 0 - i8) {
                return new java.lang.String(bArr2, 0);
            }
            i11 = i4;
            i7 = bArr[i4];
            i10 = i5;
            i6 += i7;
            i4 = i11 + 1;
            i9 = i10;
            i5 = i9 + 1;
            bArr2[i5] = (byte) i6;
            if (i5 == 0 - i8) {
            }
        } else {
            i6 = i7;
            i4 = i6;
            i5 = i9 + 1;
            bArr2[i5] = (byte) i6;
            if (i5 == 0 - i8) {
            }
        }
    }

    static void init$0() {
        $$a = new byte[]{14, -110, -105, 88};
        $$b = 239;
    }

    private static void p(char c, int i, int i2, java.lang.Object[] objArr) {
        com.facetec.sdk.hh hhVar = new com.facetec.sdk.hh();
        long[] jArr = new long[i2];
        hhVar.e = 0;
        while (hhVar.e < i2) {
            int i3 = hhVar.e;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(q[i + i3])};
                java.lang.Object d = com.facetec.sdk.al.d(-719238807);
                if (d == null) {
                    char c2 = (char) ((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 45150);
                    int minimumFlingVelocity = android.view.ViewConfiguration.getMinimumFlingVelocity();
                    int myTid = android.os.Process.myTid();
                    byte b2 = (byte) ($$b & 1);
                    byte b3 = (byte) (b2 - 1);
                    d = com.facetec.sdk.al.c(c2, (minimumFlingVelocity >> 16) + 2150, (myTid >> 22) + 24, 1926116241, false, $$c(b2, b3, b3), new java.lang.Class[]{java.lang.Integer.TYPE});
                }
                java.lang.Object[] objArr3 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) d).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(i3), java.lang.Long.valueOf(r), java.lang.Integer.valueOf(c)};
                java.lang.Object d2 = com.facetec.sdk.al.d(671690243);
                if (d2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    d2 = com.facetec.sdk.al.c((char) android.graphics.Color.green(0), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 1834, android.view.KeyEvent.getDeadChar(0, 0) + 24, -1880730373, false, $$c(b4, b5, b5), new java.lang.Class[]{java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE});
                }
                jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) d2).invoke(null, objArr3)).longValue();
                java.lang.Object[] objArr4 = {hhVar, hhVar};
                java.lang.Object d3 = com.facetec.sdk.al.d(898558648);
                if (d3 == null) {
                    char capsMode = (char) android.text.TextUtils.getCapsMode("", 0, 0);
                    int indexOf = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                    int green = android.graphics.Color.green(0);
                    byte length = (byte) $$a.length;
                    byte b6 = (byte) (length - 4);
                    d3 = com.facetec.sdk.al.c(capsMode, 2340 - indexOf, green + 24, -1839099840, false, $$c(length, b6, b6), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d3).invoke(null, objArr4);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        hhVar.e = 0;
        while (hhVar.e < i2) {
            cArr[hhVar.e] = (char) jArr[hhVar.e];
            java.lang.Object[] objArr5 = {hhVar, hhVar};
            java.lang.Object d4 = com.facetec.sdk.al.d(898558648);
            if (d4 == null) {
                char red = (char) android.graphics.Color.red(0);
                int tapTimeout = android.view.ViewConfiguration.getTapTimeout();
                int maxKeyCode = android.view.KeyEvent.getMaxKeyCode();
                byte length2 = (byte) $$a.length;
                byte b7 = (byte) (length2 - 4);
                d4 = com.facetec.sdk.al.c(red, 2341 - (tapTimeout >> 16), 24 - (maxKeyCode >> 16), -1839099840, false, $$c(length2, b7, b7), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
            }
            ((java.lang.reflect.Method) d4).invoke(null, objArr5);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    static {
        init$0();
        i();
        g = true;
    }

    public nu(com.facetec.sdk.mk mkVar, com.facetec.sdk.lz lzVar, com.facetec.sdk.md mdVar, com.facetec.sdk.mo moVar, java.lang.Object obj) {
        this.e = mkVar;
        this.f = lzVar;
        this.b = mdVar;
        this.c = moVar;
        this.f3693o = new com.facetec.sdk.nq(lzVar, f(), mdVar, moVar);
        this.m = obj;
    }

    public final com.facetec.sdk.nx a(com.facetec.sdk.ms msVar, com.facetec.sdk.mu.e eVar, boolean z) {
        com.facetec.sdk.nx ohVar;
        try {
            com.facetec.sdk.nl e = e(eVar.e(), eVar.c(), eVar.b(), msVar.f3658o, msVar.l(), z);
            if (e.h != null) {
                ohVar = new com.facetec.sdk.ok(msVar, eVar, this, e.h);
            } else {
                e.b.setSoTimeout(eVar.c());
                e.f.d().a(eVar.c(), java.util.concurrent.TimeUnit.MILLISECONDS);
                e.j.d().a(eVar.b(), java.util.concurrent.TimeUnit.MILLISECONDS);
                ohVar = new com.facetec.sdk.oh(msVar, this, e.f, e.j);
            }
            synchronized (this.e) {
                this.j = ohVar;
            }
            return ohVar;
        } catch (java.io.IOException e2) {
            throw new com.facetec.sdk.ns(e2);
        }
    }

    private com.facetec.sdk.nl e(int i, int i2, int i3, int i4, boolean z, boolean z2) throws java.io.IOException {
        while (true) {
            com.facetec.sdk.nl a2 = a(i, i2, i3, i4, z);
            synchronized (this.e) {
                if (a2.n == 0 && !a2.b()) {
                    return a2;
                }
                if (a2.a(z2)) {
                    return a2;
                }
                b();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:297:0x0457, code lost:
    
        throw new java.io.IOException("TLS tunnel buffered too many bytes!");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0703  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0712  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x073d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0709  */
    /* JADX WARN: Type inference failed for: r0v69, types: [com.facetec.sdk.pa] */
    /* JADX WARN: Type inference failed for: r0v71, types: [com.facetec.sdk.pa] */
    /* JADX WARN: Type inference failed for: r10v29, types: [com.facetec.sdk.mj] */
    /* JADX WARN: Type inference failed for: r11v13, types: [com.facetec.sdk.mj] */
    /* JADX WARN: Type inference failed for: r12v17, types: [com.facetec.sdk.nd] */
    /* JADX WARN: Type inference failed for: r7v17, types: [com.facetec.sdk.nd] */
    /* JADX WARN: Type inference failed for: r7v33, types: [com.facetec.sdk.pa] */
    /* JADX WARN: Type inference failed for: r7v4, types: [com.facetec.sdk.pa] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.net.Socket, javax.net.ssl.SSLSocket] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v18, types: [java.net.Socket, javax.net.ssl.SSLSocket] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v35, types: [int] */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v38, types: [com.facetec.sdk.nc] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v52 */
    /* JADX WARN: Type inference failed for: r8v53 */
    /* JADX WARN: Type inference failed for: r8v54 */
    /* JADX WARN: Type inference failed for: r8v55 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private com.facetec.sdk.nl a(int i, int i2, int i3, int i4, boolean z) throws java.io.IOException {
        int i5;
        ?? r8;
        java.net.Socket d;
        com.facetec.sdk.nl nlVar;
        boolean z2;
        boolean z3;
        com.facetec.sdk.nc ncVar;
        boolean z4;
        java.net.Socket socket;
        ?? r82;
        com.facetec.sdk.mj mjVar;
        boolean z5;
        com.facetec.sdk.na naVar;
        com.facetec.sdk.nq.d dVar;
        com.facetec.sdk.nc ncVar2;
        java.lang.String g2;
        int h;
        synchronized (this.e) {
            if (this.n) {
                throw new java.lang.IllegalStateException("released");
            }
            if (this.j != null) {
                throw new java.lang.IllegalStateException("codec != null");
            }
            if (this.h) {
                throw new java.io.IOException("Canceled");
            }
            if (!g && !java.lang.Thread.holdsLock(this.e)) {
                throw new java.lang.AssertionError();
            }
            com.facetec.sdk.nl nlVar2 = this.f3692a;
            i5 = 0;
            r8 = 0;
            ncVar2 = null;
            d = (nlVar2 == null || !nlVar2.g) ? null : d(false, false, true);
            nlVar = this.f3692a;
            if (nlVar == null) {
                nlVar = null;
            }
            if (nlVar == null) {
                com.facetec.sdk.nd.d.a(this.e, this.f, this, null);
                com.facetec.sdk.nl nlVar3 = this.f3692a;
                if (nlVar3 != null) {
                    nlVar = nlVar3;
                    z2 = true;
                } else {
                    ncVar = this.d;
                    z3 = false;
                }
            } else {
                z2 = false;
            }
            z3 = z2;
            ncVar = null;
        }
        com.facetec.sdk.nh.c(d);
        if (nlVar != null) {
            this.d = this.f3692a.e();
            return nlVar;
        }
        if (ncVar != null || ((dVar = this.i) != null && dVar.c())) {
            z4 = false;
        } else {
            com.facetec.sdk.nq nqVar = this.f3693o;
            if (!nqVar.b()) {
                throw new java.util.NoSuchElementException();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (nqVar.d()) {
                if (!nqVar.d()) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("No route to ");
                    sb.append(nqVar.b.b().g());
                    sb.append("; exhausted proxy configurations: ");
                    sb.append(nqVar.f3689a);
                    throw new java.net.SocketException(sb.toString());
                }
                java.util.List<java.net.Proxy> list = nqVar.f3689a;
                int i6 = nqVar.j;
                nqVar.j = i6 + 1;
                java.net.Proxy proxy = list.get(i6);
                nqVar.h = new java.util.ArrayList();
                if (proxy.type() == java.net.Proxy.Type.DIRECT || proxy.type() == java.net.Proxy.Type.SOCKS) {
                    g2 = nqVar.b.b().g();
                    h = nqVar.b.b().h();
                } else {
                    java.net.SocketAddress address = proxy.address();
                    if (!(address instanceof java.net.InetSocketAddress)) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Proxy.address() is not an InetSocketAddress: ");
                        sb2.append(address.getClass());
                        throw new java.lang.IllegalArgumentException(sb2.toString());
                    }
                    java.net.InetSocketAddress inetSocketAddress = (java.net.InetSocketAddress) address;
                    java.net.InetAddress address2 = inetSocketAddress.getAddress();
                    if (address2 == null) {
                        g2 = inetSocketAddress.getHostName();
                    } else {
                        g2 = address2.getHostAddress();
                    }
                    h = inetSocketAddress.getPort();
                }
                if (h <= 0 || h > 65535) {
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder("No route to ");
                    sb3.append(g2);
                    sb3.append(io.ktor.sse.ServerSentEventKt.COLON);
                    sb3.append(h);
                    sb3.append("; port is out of range");
                    throw new java.net.SocketException(sb3.toString());
                }
                if (proxy.type() == java.net.Proxy.Type.SOCKS) {
                    nqVar.h.add(java.net.InetSocketAddress.createUnresolved(g2, h));
                } else {
                    com.facetec.sdk.mo moVar = nqVar.c;
                    com.facetec.sdk.md mdVar = nqVar.e;
                    java.util.List<java.net.InetAddress> c = nqVar.b.d().c(g2);
                    if (c.isEmpty()) {
                        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                        sb4.append(nqVar.b.d());
                        sb4.append(" returned no addresses for ");
                        sb4.append(g2);
                        throw new java.net.UnknownHostException(sb4.toString());
                    }
                    com.facetec.sdk.mo moVar2 = nqVar.c;
                    com.facetec.sdk.md mdVar2 = nqVar.e;
                    int size = c.size();
                    int i7 = i5;
                    ncVar2 = ncVar2;
                    while (i7 < size) {
                        nqVar.h.add(new java.net.InetSocketAddress(c.get(i7), h));
                        i7++;
                        c = c;
                        ncVar2 = null;
                    }
                }
                int size2 = nqVar.h.size();
                int i8 = 0;
                ncVar2 = ncVar2;
                while (i8 < size2) {
                    com.facetec.sdk.nc ncVar3 = new com.facetec.sdk.nc(nqVar.b, proxy, nqVar.h.get(i8));
                    if (nqVar.d.e(ncVar3)) {
                        nqVar.f.add(ncVar3);
                    } else {
                        arrayList.add(ncVar3);
                    }
                    i8++;
                    ncVar2 = ncVar3;
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
                i5 = 0;
                ncVar2 = null;
            }
            if (arrayList.isEmpty()) {
                arrayList.addAll(nqVar.f);
                nqVar.f.clear();
            }
            this.i = new com.facetec.sdk.nq.d(arrayList);
            z4 = true;
            r8 = ncVar2;
        }
        synchronized (this.e) {
            if (this.h) {
                throw new java.io.IOException("Canceled");
            }
            if (z4) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList(this.i.e);
                int size3 = arrayList2.size();
                int i9 = 0;
                r8 = r8;
                while (true) {
                    if (i9 >= size3) {
                        break;
                    }
                    r8 = (com.facetec.sdk.nc) arrayList2.get(i9);
                    com.facetec.sdk.nd.d.a(this.e, this.f, this, r8);
                    com.facetec.sdk.nl nlVar4 = this.f3692a;
                    if (nlVar4 != null) {
                        this.d = r8;
                        nlVar = nlVar4;
                        z3 = true;
                        break;
                    }
                    i9++;
                    r8 = r8;
                }
            }
            if (!z3) {
                if (ncVar == null) {
                    com.facetec.sdk.nq.d dVar2 = this.i;
                    if (!dVar2.c()) {
                        throw new java.util.NoSuchElementException();
                    }
                    java.util.List<com.facetec.sdk.nc> list2 = dVar2.e;
                    int i10 = dVar2.d;
                    r8 = i10 + 1;
                    dVar2.d = r8;
                    ncVar = list2.get(i10);
                }
                this.d = ncVar;
                this.k = 0;
                nlVar = new com.facetec.sdk.nl(this.e, ncVar);
                e(nlVar, false);
            }
        }
        if (z3) {
            return nlVar;
        }
        if (nlVar.i != null) {
            throw new java.lang.IllegalStateException("already connected");
        }
        java.util.List<com.facetec.sdk.mj> list3 = nlVar.c.d().d;
        com.facetec.sdk.nm nmVar = new com.facetec.sdk.nm(list3);
        if (nlVar.c.d().i() == null) {
            if (!list3.contains(com.facetec.sdk.mj.e)) {
                throw new com.facetec.sdk.ns(new java.net.UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            java.lang.String g3 = nlVar.c.d().b().g();
            if (!com.facetec.sdk.pa.d().b(g3)) {
                java.lang.StringBuilder sb5 = new java.lang.StringBuilder("CLEARTEXT communication to ");
                sb5.append(g3);
                sb5.append(" not permitted by network security policy");
                throw new com.facetec.sdk.ns(new java.net.UnknownServiceException(sb5.toString()));
            }
        } else if (nlVar.c.d().e().contains(com.facetec.sdk.na.H2_PRIOR_KNOWLEDGE)) {
            throw new com.facetec.sdk.ns(new java.net.UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        com.facetec.sdk.ns nsVar = null;
        while (true) {
            try {
            } catch (java.io.IOException e) {
                e = e;
            }
            try {
                if (!nlVar.c.a()) {
                    nlVar.c(i, i2);
                    r82 = r8;
                } else {
                    com.facetec.sdk.mx c2 = new com.facetec.sdk.mx.a().b(nlVar.c.d().b()).d(com.datadog.android.internal.network.HttpSpec.Method.CONNECT, null).b(com.google.common.net.HttpHeaders.HOST, com.facetec.sdk.nh.e(nlVar.c.d().b(), true)).b("Proxy-Connection", com.google.common.net.HttpHeaders.KEEP_ALIVE).b("User-Agent", com.facetec.sdk.ng.a()).c();
                    com.facetec.sdk.mw.c e2 = new com.facetec.sdk.mw.c().c(c2).c(com.facetec.sdk.na.HTTP_1_1).d(407).d("Preemptive Authenticate").d(com.facetec.sdk.nh.c).d(-1L).e(-1L);
                    e2.f.c(com.google.common.net.HttpHeaders.PROXY_AUTHENTICATE, "OkHttp-Preemptive");
                    e2.b();
                    nlVar.c.d().a();
                    com.facetec.sdk.nc ncVar4 = nlVar.c;
                    com.facetec.sdk.mv c3 = c2.c();
                    nlVar.c(i, i2);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CONNECT ");
                    sb6.append(com.facetec.sdk.nh.e(c3, true));
                    sb6.append(" HTTP/1.1");
                    java.lang.String obj = sb6.toString();
                    com.facetec.sdk.oh ohVar = new com.facetec.sdk.oh(null, null, nlVar.f, nlVar.j);
                    nlVar.f.d().a(i2, java.util.concurrent.TimeUnit.MILLISECONDS);
                    nlVar.j.d().a(i3, java.util.concurrent.TimeUnit.MILLISECONDS);
                    ohVar.e(c2.d(), obj);
                    ohVar.a();
                    com.facetec.sdk.mw b2 = ohVar.d(false).c(c2).b();
                    long e3 = com.facetec.sdk.nz.e(b2);
                    if (e3 == -1) {
                        e3 = 0;
                    }
                    com.facetec.sdk.pz b3 = ohVar.b(e3);
                    com.facetec.sdk.nh.b(b3, Integer.MAX_VALUE, java.util.concurrent.TimeUnit.MILLISECONDS);
                    b3.close();
                    int e4 = b2.e();
                    r82 = 200;
                    if (e4 == 200) {
                        if (!nlVar.f.c().b() || !nlVar.j.c().b()) {
                            break;
                        }
                        if (nlVar.f3683a == null) {
                            break;
                        }
                    } else {
                        if (e4 == 407) {
                            nlVar.c.d().a();
                            com.facetec.sdk.nc ncVar5 = nlVar.c;
                            throw new java.io.IOException("Failed to authenticate with proxy");
                        }
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("Unexpected response code for CONNECT: ");
                        sb7.append(b2.e());
                        throw new java.io.IOException(sb7.toString());
                    }
                }
            } catch (java.io.IOException e5) {
                e = e5;
                com.facetec.sdk.nh.c(nlVar.b);
                com.facetec.sdk.nh.c(nlVar.f3683a);
                nlVar.b = null;
                nlVar.f3683a = null;
                nlVar.f = null;
                nlVar.j = null;
                nlVar.d = null;
                nlVar.i = null;
                nlVar.h = null;
                nlVar.c.b();
                nlVar.c.e();
                if (nsVar != null) {
                    nsVar = new com.facetec.sdk.ns(e);
                } else {
                    com.facetec.sdk.nh.b(nsVar.d, e);
                    nsVar.f3691a = e;
                }
                if (z) {
                    throw nsVar;
                }
                r8 = 1;
                nmVar.f3685a = true;
                if (!nmVar.e) {
                    throw nsVar;
                }
                if (e instanceof java.net.ProtocolException) {
                    throw nsVar;
                }
                if (e instanceof java.io.InterruptedIOException) {
                    throw nsVar;
                }
                boolean z6 = e instanceof javax.net.ssl.SSLHandshakeException;
                if (z6 && (e.getCause() instanceof java.security.cert.CertificateException)) {
                    throw nsVar;
                }
                if (e instanceof javax.net.ssl.SSLPeerUnverifiedException) {
                    throw nsVar;
                }
                if (!z6) {
                    if (e instanceof javax.net.ssl.SSLProtocolException) {
                        continue;
                    } else if (!(e instanceof javax.net.ssl.SSLException)) {
                        throw nsVar;
                    }
                }
            }
            try {
                if (nlVar.c.d().i() == null) {
                    if (nlVar.c.d().e().contains(com.facetec.sdk.na.H2_PRIOR_KNOWLEDGE)) {
                        nlVar.b = nlVar.f3683a;
                        nlVar.i = com.facetec.sdk.na.H2_PRIOR_KNOWLEDGE;
                        nlVar.c(i4);
                    } else {
                        nlVar.b = nlVar.f3683a;
                        nlVar.i = com.facetec.sdk.na.HTTP_1_1;
                    }
                } else {
                    try {
                        com.facetec.sdk.lz d2 = nlVar.c.d();
                        try {
                            r82 = (javax.net.ssl.SSLSocket) d2.i().createSocket(nlVar.f3683a, d2.b().g(), d2.b().h(), true);
                            try {
                                int i11 = nmVar.c;
                                int size4 = nmVar.b.size();
                                while (true) {
                                    if (i11 >= size4) {
                                        mjVar = null;
                                        break;
                                    }
                                    com.facetec.sdk.mj mjVar2 = nmVar.b.get(i11);
                                    if (mjVar2.e(r82)) {
                                        nmVar.c = i11 + 1;
                                        mjVar = mjVar2;
                                        break;
                                    }
                                    i11++;
                                }
                                try {
                                    if (mjVar == null) {
                                        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("Unable to find acceptable protocols. isFallback=");
                                        sb8.append(nmVar.f3685a);
                                        sb8.append(", modes=");
                                        sb8.append(nmVar.b);
                                        sb8.append(", supported protocols=");
                                        sb8.append(java.util.Arrays.toString(r82.getEnabledProtocols()));
                                        throw new java.net.UnknownServiceException(sb8.toString());
                                    }
                                    int i12 = nmVar.c;
                                    while (true) {
                                        if (i12 >= nmVar.b.size()) {
                                            z5 = false;
                                            break;
                                        }
                                        if (nmVar.b.get(i12).e(r82)) {
                                            z5 = true;
                                            break;
                                        }
                                        i12++;
                                    }
                                    nmVar.e = z5;
                                    com.facetec.sdk.nd.d.b(mjVar, r82, nmVar.f3685a);
                                    if (mjVar.c()) {
                                        com.facetec.sdk.pa.d().b(r82, d2.b().g(), d2.e());
                                    }
                                    r82.startHandshake();
                                    javax.net.ssl.SSLSession session = r82.getSession();
                                    com.facetec.sdk.mn e6 = com.facetec.sdk.mn.e(session);
                                    if (!d2.j().verify(d2.b().g(), session)) {
                                        java.util.List<java.security.cert.Certificate> a2 = e6.a();
                                        if (!a2.isEmpty()) {
                                            java.security.cert.X509Certificate x509Certificate = (java.security.cert.X509Certificate) a2.get(0);
                                            java.lang.StringBuilder sb9 = new java.lang.StringBuilder("Hostname ");
                                            sb9.append(d2.b().g());
                                            sb9.append(" not verified:\n    certificate: ");
                                            sb9.append(com.facetec.sdk.me.e((java.security.cert.Certificate) x509Certificate));
                                            sb9.append("\n    DN: ");
                                            sb9.append(x509Certificate.getSubjectDN().getName());
                                            sb9.append("\n    subjectAltNames: ");
                                            sb9.append(com.facetec.sdk.pf.a(x509Certificate));
                                            throw new javax.net.ssl.SSLPeerUnverifiedException(sb9.toString());
                                        }
                                        java.lang.StringBuilder sb10 = new java.lang.StringBuilder("Hostname ");
                                        sb10.append(d2.b().g());
                                        sb10.append(" not verified (no certificates)");
                                        throw new javax.net.ssl.SSLPeerUnverifiedException(sb10.toString());
                                    }
                                    d2.f().e(d2.b().g(), e6.a());
                                    java.lang.String b4 = mjVar.c() ? com.facetec.sdk.pa.d().b(r82) : null;
                                    nlVar.b = r82;
                                    nlVar.f = com.facetec.sdk.pt.d(com.facetec.sdk.pt.d(nlVar.b));
                                    nlVar.j = com.facetec.sdk.pt.e(com.facetec.sdk.pt.a(nlVar.b));
                                    nlVar.d = e6;
                                    if (b4 != null) {
                                        naVar = com.facetec.sdk.na.b(b4);
                                    } else {
                                        naVar = com.facetec.sdk.na.HTTP_1_1;
                                    }
                                    nlVar.i = naVar;
                                    if (r82 != 0) {
                                        com.facetec.sdk.pa.d().d(r82);
                                    }
                                    com.facetec.sdk.mn mnVar = nlVar.d;
                                    if (nlVar.i == com.facetec.sdk.na.HTTP_2) {
                                        nlVar.c(i4);
                                    }
                                } catch (java.lang.AssertionError e7) {
                                    e = e7;
                                    if (com.facetec.sdk.nh.b(e)) {
                                        throw new java.io.IOException(e);
                                    }
                                    throw e;
                                }
                            } catch (java.lang.AssertionError e8) {
                                e = e8;
                            } catch (java.lang.Throwable th) {
                                th = th;
                                if (r82 != 0) {
                                    com.facetec.sdk.pa.d().d(r82);
                                }
                                com.facetec.sdk.nh.c((java.net.Socket) r82);
                                throw th;
                            }
                        } catch (java.lang.AssertionError e9) {
                            e = e9;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            r82 = 0;
                        }
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                    }
                }
                nlVar.c.b();
                nlVar.c.e();
                com.facetec.sdk.na naVar2 = nlVar.i;
            } catch (java.io.IOException e10) {
                e = e10;
                com.facetec.sdk.nh.c(nlVar.b);
                com.facetec.sdk.nh.c(nlVar.f3683a);
                nlVar.b = null;
                nlVar.f3683a = null;
                nlVar.f = null;
                nlVar.j = null;
                nlVar.d = null;
                nlVar.i = null;
                nlVar.h = null;
                nlVar.c.b();
                nlVar.c.e();
                if (nsVar != null) {
                }
                if (z) {
                }
            }
        }
        if (nlVar.c.a() && nlVar.f3683a == null) {
            throw new com.facetec.sdk.ns(new java.net.ProtocolException("Too many tunnel connections attempted: 21"));
        }
        if (nlVar.h != null) {
            synchronized (nlVar.e) {
                nlVar.k = nlVar.h.d();
            }
        }
        f().d(nlVar.e());
        synchronized (this.e) {
            this.l = true;
            com.facetec.sdk.nd.d.d(this.e, nlVar);
            if (nlVar.b()) {
                socket = com.facetec.sdk.nd.d.e(this.e, this.f, this);
                nlVar = this.f3692a;
            } else {
                socket = null;
            }
        }
        com.facetec.sdk.nh.c(socket);
        return nlVar;
    }

    public final void d(boolean z, com.facetec.sdk.nx nxVar, java.io.IOException iOException) {
        java.net.Socket d;
        boolean z2;
        synchronized (this.e) {
            if (nxVar != null) {
                if (nxVar == this.j) {
                    if (!z) {
                        this.f3692a.n++;
                    }
                    d = d(z, false, true);
                    z2 = this.n;
                }
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("expected ");
            sb.append(this.j);
            sb.append(" but was ");
            sb.append(nxVar);
            throw new java.lang.IllegalStateException(sb.toString());
        }
        com.facetec.sdk.nh.c(d);
        if (iOException != null) {
            com.facetec.sdk.nd.d.a(this.b, iOException);
        } else if (z2) {
            com.facetec.sdk.nd.d.a(this.b, null);
        }
    }

    public final com.facetec.sdk.nx e() {
        com.facetec.sdk.nx nxVar;
        synchronized (this.e) {
            nxVar = this.j;
        }
        return nxVar;
    }

    private com.facetec.sdk.nr f() {
        return com.facetec.sdk.nd.d.c(this.e);
    }

    public final com.facetec.sdk.nl a() {
        com.facetec.sdk.nl nlVar;
        synchronized (this) {
            nlVar = this.f3692a;
        }
        return nlVar;
    }

    public final void d() {
        com.facetec.sdk.nl nlVar;
        java.net.Socket d;
        synchronized (this.e) {
            nlVar = this.f3692a;
            d = d(false, true, false);
            if (this.f3692a != null) {
                nlVar = null;
            }
        }
        com.facetec.sdk.nh.c(d);
        if (nlVar != null) {
            com.facetec.sdk.nd.d.a(this.b, null);
        }
    }

    public final void b() {
        java.net.Socket d;
        synchronized (this.e) {
            d = d(true, false, false);
        }
        com.facetec.sdk.nh.c(d);
    }

    public final java.net.Socket d(boolean z, boolean z2, boolean z3) {
        java.net.Socket socket;
        if (!g && !java.lang.Thread.holdsLock(this.e)) {
            throw new java.lang.AssertionError();
        }
        if (z3) {
            this.j = null;
        }
        if (z2) {
            this.n = true;
        }
        com.facetec.sdk.nl nlVar = this.f3692a;
        if (nlVar != null) {
            if (z) {
                nlVar.g = true;
            }
            if (this.j == null && (this.n || this.f3692a.g)) {
                b(this.f3692a);
                if (this.f3692a.f3684o.isEmpty()) {
                    com.facetec.sdk.nl nlVar2 = this.f3692a;
                    try {
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        p((char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 23167), android.os.Process.getGidForName("") + 1, '@' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr);
                        java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr[0]);
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        p((char) android.graphics.drawable.Drawable.resolveOpacity(0, 0), 16 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 8 - android.graphics.Color.argb(0, 0, 0, 0), objArr2);
                        nlVar2.m = ((java.lang.Long) cls.getMethod((java.lang.String) objArr2[0], null).invoke(null, null)).longValue();
                        if (com.facetec.sdk.nd.d.c(this.e, this.f3692a)) {
                            socket = this.f3692a.a();
                            this.f3692a = null;
                            return socket;
                        }
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                socket = null;
                this.f3692a = null;
                return socket;
            }
        }
        return null;
    }

    public final void a(java.io.IOException iOException) {
        boolean z;
        java.net.Socket d;
        synchronized (this.e) {
            if (iOException instanceof com.facetec.sdk.ou) {
                com.facetec.sdk.og ogVar = ((com.facetec.sdk.ou) iOException).b;
                if (ogVar == com.facetec.sdk.og.REFUSED_STREAM) {
                    int i = this.k + 1;
                    this.k = i;
                    if (i > 1) {
                        this.d = null;
                        z = true;
                    }
                } else if (ogVar != com.facetec.sdk.og.CANCEL) {
                    this.d = null;
                    z = true;
                }
                z = false;
            } else {
                com.facetec.sdk.nl nlVar = this.f3692a;
                if (nlVar != null && (!nlVar.b() || (iOException instanceof com.facetec.sdk.oj))) {
                    if (this.f3692a.n == 0) {
                        com.facetec.sdk.nc ncVar = this.d;
                        if (ncVar != null && iOException != null) {
                            com.facetec.sdk.nq nqVar = this.f3693o;
                            if (ncVar.e().type() != java.net.Proxy.Type.DIRECT && nqVar.b.c() != null) {
                                nqVar.b.c().connectFailed(nqVar.b.b().d(), ncVar.e().address(), iOException);
                            }
                            nqVar.d.b(ncVar);
                        }
                        this.d = null;
                    }
                    z = true;
                }
                z = false;
            }
            d = d(z, false, true);
        }
        com.facetec.sdk.nh.c(d);
    }

    public final void e(com.facetec.sdk.nl nlVar, boolean z) {
        if (!g && !java.lang.Thread.holdsLock(this.e)) {
            throw new java.lang.AssertionError();
        }
        if (this.f3692a != null) {
            throw new java.lang.IllegalStateException();
        }
        this.f3692a = nlVar;
        this.l = z;
        nlVar.f3684o.add(new com.facetec.sdk.nu.b(this, this.m));
    }

    private void b(com.facetec.sdk.nl nlVar) {
        int size = nlVar.f3684o.size();
        for (int i = 0; i < size; i++) {
            if (nlVar.f3684o.get(i).get() == this) {
                nlVar.f3684o.remove(i);
                return;
            }
        }
        throw new java.lang.IllegalStateException();
    }

    public final boolean c() {
        if (this.d != null) {
            return true;
        }
        com.facetec.sdk.nq.d dVar = this.i;
        return (dVar != null && dVar.c()) || this.f3693o.b();
    }

    public final java.lang.String toString() {
        com.facetec.sdk.nl a2 = a();
        return a2 != null ? a2.toString() : this.f.toString();
    }

    public static final class b extends java.lang.ref.WeakReference<com.facetec.sdk.nu> {
        public final java.lang.Object d;

        b(com.facetec.sdk.nu nuVar, java.lang.Object obj) {
            super(nuVar);
            this.d = obj;
        }
    }

    static void i() {
        q = new char[]{14064, 1518, 20678, 44996, 64224, 51615, 1157, 21351, 44629, 64777, 51227, 1796, 21013, 44799, 64985, 51404, 27764, 24430, 2654, 62794, 40986, 37658, 24073, 2540};
        r = 2979712820565925647L;
    }
}
