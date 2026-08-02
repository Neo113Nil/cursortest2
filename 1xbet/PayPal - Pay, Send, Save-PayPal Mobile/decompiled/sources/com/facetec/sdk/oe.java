package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class oe implements com.facetec.sdk.mu {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f3702a;
    public volatile boolean b;
    public volatile com.facetec.sdk.nu c;
    private final com.facetec.sdk.ms d;
    public java.lang.Object e;

    public oe(com.facetec.sdk.ms msVar, boolean z) {
        this.d = msVar;
        this.f3702a = z;
    }

    public final boolean a() {
        return this.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x0114, code lost:
    
        if (r7.equals(com.datadog.android.internal.network.HttpSpec.Method.HEAD) == false) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0132 A[Catch: IOException -> 0x0242, TryCatch #3 {IOException -> 0x0242, blocks: (B:17:0x0060, B:19:0x0064, B:33:0x0116, B:35:0x011c, B:37:0x0124, B:39:0x0132, B:41:0x013a, B:43:0x0150, B:45:0x0156, B:47:0x0164, B:49:0x016e, B:51:0x0183, B:53:0x0174, B:54:0x017e, B:56:0x0192, B:58:0x0198, B:59:0x019d, B:88:0x008f, B:90:0x0097, B:92:0x00a3, B:94:0x00a9, B:96:0x00b3, B:98:0x00b9, B:99:0x00bf, B:101:0x00cb, B:103:0x00d7, B:104:0x00de, B:105:0x00df, B:107:0x00e5, B:109:0x00ef, B:111:0x00f8, B:112:0x00fe, B:113:0x0108, B:115:0x010e, B:118:0x023c, B:119:0x0241), top: B:16:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0164 A[Catch: IOException -> 0x0242, TryCatch #3 {IOException -> 0x0242, blocks: (B:17:0x0060, B:19:0x0064, B:33:0x0116, B:35:0x011c, B:37:0x0124, B:39:0x0132, B:41:0x013a, B:43:0x0150, B:45:0x0156, B:47:0x0164, B:49:0x016e, B:51:0x0183, B:53:0x0174, B:54:0x017e, B:56:0x0192, B:58:0x0198, B:59:0x019d, B:88:0x008f, B:90:0x0097, B:92:0x00a3, B:94:0x00a9, B:96:0x00b3, B:98:0x00b9, B:99:0x00bf, B:101:0x00cb, B:103:0x00d7, B:104:0x00de, B:105:0x00df, B:107:0x00e5, B:109:0x00ef, B:111:0x00f8, B:112:0x00fe, B:113:0x0108, B:115:0x010e, B:118:0x023c, B:119:0x0241), top: B:16:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0198 A[Catch: IOException -> 0x0242, TryCatch #3 {IOException -> 0x0242, blocks: (B:17:0x0060, B:19:0x0064, B:33:0x0116, B:35:0x011c, B:37:0x0124, B:39:0x0132, B:41:0x013a, B:43:0x0150, B:45:0x0156, B:47:0x0164, B:49:0x016e, B:51:0x0183, B:53:0x0174, B:54:0x017e, B:56:0x0192, B:58:0x0198, B:59:0x019d, B:88:0x008f, B:90:0x0097, B:92:0x00a3, B:94:0x00a9, B:96:0x00b3, B:98:0x00b9, B:99:0x00bf, B:101:0x00cb, B:103:0x00d7, B:104:0x00de, B:105:0x00df, B:107:0x00e5, B:109:0x00ef, B:111:0x00f8, B:112:0x00fe, B:113:0x0108, B:115:0x010e, B:118:0x023c, B:119:0x0241), top: B:16:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0137  */
    @Override // com.facetec.sdk.mu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.facetec.sdk.mw e(com.facetec.sdk.mu.e eVar) throws java.io.IOException {
        com.facetec.sdk.mw c;
        com.facetec.sdk.nc ncVar;
        com.facetec.sdk.mx mxVar;
        int i;
        com.facetec.sdk.mx mxVar2;
        java.lang.String b;
        com.facetec.sdk.mv a2;
        com.facetec.sdk.mx a3 = eVar.a();
        com.facetec.sdk.oc ocVar = (com.facetec.sdk.oc) eVar;
        com.facetec.sdk.md i2 = ocVar.i();
        com.facetec.sdk.mo j = ocVar.j();
        com.facetec.sdk.nu nuVar = new com.facetec.sdk.nu(this.d.j(), b(a3.c()), i2, j, this.e);
        this.c = nuVar;
        com.facetec.sdk.mx mxVar3 = a3;
        int i3 = 0;
        com.facetec.sdk.mw mwVar = null;
        while (!this.b) {
            try {
                try {
                    c = ocVar.c(mxVar3, nuVar, null, null);
                    if (mwVar != null) {
                        com.facetec.sdk.mw.c g = c.g();
                        com.facetec.sdk.mw b2 = mwVar.g().d((com.facetec.sdk.nf) null).b();
                        if (b2.i == null) {
                            g.g = b2;
                            c = g.b();
                        } else {
                            throw new java.lang.IllegalArgumentException("priorResponse.body != null");
                        }
                    }
                    try {
                        ncVar = nuVar.d;
                    } catch (java.io.IOException e) {
                        nuVar.d();
                        throw e;
                    }
                } catch (java.lang.Throwable th) {
                    nuVar.a(null);
                    nuVar.d();
                    throw th;
                }
            } catch (com.facetec.sdk.ns e2) {
                if (!c(e2.f3691a, nuVar, false, mxVar3)) {
                    throw e2.d;
                }
            } catch (java.io.IOException e3) {
                if (!c(e3, nuVar, !(e3 instanceof com.facetec.sdk.oj), mxVar3)) {
                    throw e3;
                }
            }
            if (c == null) {
                throw new java.lang.IllegalStateException();
            }
            int e4 = c.e();
            java.lang.String a4 = c.d().a();
            if (e4 == 307 || e4 == 308) {
                if (!a4.equals("GET")) {
                }
                if (this.d.j && (b = c.b("Location")) != null) {
                    com.facetec.sdk.mv.d b3 = c.d().c().b(b);
                    a2 = b3 == null ? b3.a() : null;
                    if (a2 != null && (a2.c().equals(c.d().c().c()) || this.d.i)) {
                        com.facetec.sdk.mx.a e5 = c.d().e();
                        if (com.facetec.sdk.nv.e(a4)) {
                            boolean equals = a4.equals("PROPFIND");
                            if (!a4.equals("PROPFIND")) {
                                e5.d("GET", null);
                            } else {
                                e5.d(a4, equals ? c.d().b() : null);
                            }
                            if (!equals) {
                                e5.d(com.google.common.net.HttpHeaders.TRANSFER_ENCODING);
                                e5.d("Content-Length");
                                e5.d("Content-Type");
                            }
                        }
                        if (!e(c, a2)) {
                            e5.d("Authorization");
                        }
                        mxVar2 = e5.b(a2).c();
                        mxVar = mxVar2;
                        if (mxVar != null) {
                            nuVar.d();
                            return c;
                        }
                        com.facetec.sdk.nh.c(c.b());
                        int i4 = i3 + 1;
                        if (i4 > 20) {
                            nuVar.d();
                            throw new java.net.ProtocolException("Too many follow-up requests: ".concat(java.lang.String.valueOf(i4)));
                        }
                        if (mxVar.b() instanceof com.facetec.sdk.oi) {
                            nuVar.d();
                            throw new java.net.HttpRetryException("Cannot retry streamed HTTP body", c.e());
                        }
                        if (!e(c, mxVar.c())) {
                            nuVar.d();
                            i = i4;
                            nuVar = new com.facetec.sdk.nu(this.d.j(), b(mxVar.c()), i2, j, this.e);
                            this.c = nuVar;
                        } else {
                            i = i4;
                            if (nuVar.e() != null) {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder("Closing the body of ");
                                sb.append(c);
                                sb.append(" didn't close its backing stream. Bad interceptor?");
                                throw new java.lang.IllegalStateException(sb.toString());
                            }
                        }
                        mwVar = c;
                        mxVar3 = mxVar;
                        i3 = i;
                    }
                }
                mxVar = null;
                if (mxVar != null) {
                }
            } else {
                if (e4 != 401) {
                    if (e4 == 503) {
                        if ((c.i() == null || c.i().e() != 503) && d(c, Integer.MAX_VALUE) == 0) {
                            mxVar2 = c.d();
                        }
                        mxVar = null;
                    } else if (e4 != 407) {
                        if (e4 == 408) {
                            if (this.d.l() && !(c.d().b() instanceof com.facetec.sdk.oi) && ((c.i() == null || c.i().e() != 408) && d(c, 0) <= 0)) {
                                mxVar2 = c.d();
                            }
                        } else {
                            switch (e4) {
                                case 300:
                                case 301:
                                case 302:
                                case 303:
                                    if (this.d.j) {
                                        com.facetec.sdk.mv.d b32 = c.d().c().b(b);
                                        if (b32 == null) {
                                        }
                                        if (a2 != null) {
                                            com.facetec.sdk.mx.a e52 = c.d().e();
                                            if (com.facetec.sdk.nv.e(a4)) {
                                            }
                                            if (!e(c, a2)) {
                                            }
                                            mxVar2 = e52.b(a2).c();
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                default:
                                    mxVar = null;
                                    break;
                            }
                        }
                        mxVar = null;
                    } else {
                        if (ncVar.e().type() != java.net.Proxy.Type.HTTP) {
                            throw new java.net.ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                        mxVar2 = this.d.g().a();
                    }
                    if (mxVar != null) {
                    }
                } else {
                    mxVar2 = this.d.g.a();
                }
                mxVar = mxVar2;
                if (mxVar != null) {
                }
            }
        }
        nuVar.d();
        throw new java.io.IOException("Canceled");
    }

    private com.facetec.sdk.lz b(com.facetec.sdk.mv mvVar) {
        javax.net.ssl.SSLSocketFactory sSLSocketFactory;
        javax.net.ssl.HostnameVerifier hostnameVerifier;
        com.facetec.sdk.me meVar;
        if (mvVar.a()) {
            sSLSocketFactory = this.d.i();
            hostnameVerifier = this.d.f();
            meVar = this.d.h();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            meVar = null;
        }
        return new com.facetec.sdk.lz(mvVar.g(), mvVar.h(), this.d.d(), this.d.a(), sSLSocketFactory, hostnameVerifier, meVar, this.d.g(), this.d.e(), this.d.k(), this.d.o(), this.d.b());
    }

    private boolean c(java.io.IOException iOException, com.facetec.sdk.nu nuVar, boolean z, com.facetec.sdk.mx mxVar) {
        nuVar.a(iOException);
        if (this.d.l()) {
            return !(z && d(iOException, mxVar)) && d(iOException, z) && nuVar.c();
        }
        return false;
    }

    private static boolean d(java.io.IOException iOException, com.facetec.sdk.mx mxVar) {
        return (mxVar.b() instanceof com.facetec.sdk.oi) || (iOException instanceof java.io.FileNotFoundException);
    }

    private static boolean d(java.io.IOException iOException, boolean z) {
        if (iOException instanceof java.net.ProtocolException) {
            return false;
        }
        return iOException instanceof java.io.InterruptedIOException ? (iOException instanceof java.net.SocketTimeoutException) && !z : (((iOException instanceof javax.net.ssl.SSLHandshakeException) && (iOException.getCause() instanceof java.security.cert.CertificateException)) || (iOException instanceof javax.net.ssl.SSLPeerUnverifiedException)) ? false : true;
    }

    private static int d(com.facetec.sdk.mw mwVar, int i) {
        java.lang.String b = mwVar.b("Retry-After");
        if (b == null) {
            return i;
        }
        if (b.matches("\\d+")) {
            return java.lang.Integer.valueOf(b).intValue();
        }
        return Integer.MAX_VALUE;
    }

    private static boolean e(com.facetec.sdk.mw mwVar, com.facetec.sdk.mv mvVar) {
        com.facetec.sdk.mv c = mwVar.d().c();
        return c.g().equals(mvVar.g()) && c.h() == mvVar.h() && c.c().equals(mvVar.c());
    }
}
