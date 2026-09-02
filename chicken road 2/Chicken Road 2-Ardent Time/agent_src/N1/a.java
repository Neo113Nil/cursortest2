package N1;

/* loaded from: classes.dex */
public final class a implements I1.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1146a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f1147b;

    public a(I1.C0027b cookieJar) {
        kotlin.jvm.internal.i.e(cookieJar, "cookieJar");
        this.f1147b = cookieJar;
    }

    public static int d(I1.y yVar, int i2) {
        java.lang.String a2 = I1.y.a(yVar, "Retry-After");
        if (a2 == null) {
            return i2;
        }
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("\\d+");
        kotlin.jvm.internal.i.d(compile, "compile(...)");
        if (!compile.matcher(a2).matches()) {
            return Integer.MAX_VALUE;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(a2);
        kotlin.jvm.internal.i.d(valueOf, "valueOf(header)");
        return valueOf.intValue();
    }

    @Override // I1.p
    public final I1.y a(N1.g gVar) {
        I1.z zVar;
        java.util.List list;
        int i2;
        javax.net.ssl.SSLSocketFactory sSLSocketFactory;
        U1.c cVar;
        I1.e eVar;
        switch (this.f1146a) {
            case 0:
                I1.v vVar = gVar.f1154e;
                I1.u a2 = vVar.a();
                I1.w wVar = vVar.f837d;
                if (wVar != null) {
                    if (wVar.f840a != null) {
                        a2.b("Content-Type", "application/x-protobuf");
                    }
                    long j2 = wVar.f841b;
                    if (j2 != -1) {
                        a2.b("Content-Length", java.lang.String.valueOf(j2));
                        ((I1.l) a2.f831d).d("Transfer-Encoding");
                    } else {
                        a2.b("Transfer-Encoding", "chunked");
                        ((I1.l) a2.f831d).d("Content-Length");
                    }
                }
                I1.m mVar = vVar.f836c;
                java.lang.String a3 = mVar.a("Host");
                boolean z2 = false;
                I1.o url = vVar.f834a;
                if (a3 == null) {
                    a2.b("Host", J1.b.v(url, false));
                }
                if (mVar.a("Connection") == null) {
                    a2.b("Connection", "Keep-Alive");
                }
                if (mVar.a("Accept-Encoding") == null && mVar.a("Range") == null) {
                    a2.b("Accept-Encoding", "gzip");
                    z2 = true;
                }
                I1.C0027b c0027b = (I1.C0027b) this.f1147b;
                c0027b.getClass();
                kotlin.jvm.internal.i.e(url, "url");
                if (mVar.a("User-Agent") == null) {
                    a2.b("User-Agent", "okhttp/4.11.0");
                }
                I1.y b2 = gVar.b(a2.a());
                I1.m mVar2 = b2.f862f;
                N1.f.b(c0027b, url, mVar2);
                I1.x b3 = b2.b();
                b3.f844a = vVar;
                if (z2 && "gzip".equalsIgnoreCase(I1.y.a(b2, "Content-Encoding")) && N1.f.a(b2) && (zVar = b2.f863g) != null) {
                    V1.l lVar = new V1.l(zVar.g());
                    I1.l c2 = mVar2.c();
                    c2.d("Content-Encoding");
                    c2.d("Content-Length");
                    b3.f849f = c2.b().c();
                    I1.y.a(b2, "Content-Type");
                    b3.f850g = new I1.z(-1L, new V1.q(lVar), 1);
                }
                return b3.a();
            default:
                I1.v vVar2 = gVar.f1154e;
                M1.i iVar = gVar.f1150a;
                java.util.List list2 = i1.C0199r.f3325a;
                I1.y yVar = null;
                int i3 = 0;
                I1.v request = vVar2;
                while (true) {
                    boolean z3 = true;
                    while (true) {
                        iVar.getClass();
                        kotlin.jvm.internal.i.e(request, "request");
                        if (iVar.f1061i != null) {
                            throw new java.lang.IllegalStateException("Check failed.");
                        }
                        synchronized (iVar) {
                            try {
                                if (iVar.f1063k) {
                                    throw new java.lang.IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                }
                                if (iVar.f1062j) {
                                    throw new java.lang.IllegalStateException("Check failed.");
                                }
                            } catch (java.lang.Throwable th) {
                                throw th;
                            }
                        }
                        if (z3) {
                            M1.l lVar2 = iVar.f1055c;
                            I1.o oVar = request.f834a;
                            boolean z4 = oVar.f769i;
                            I1.s sVar = iVar.f1053a;
                            if (z4) {
                                javax.net.ssl.SSLSocketFactory sSLSocketFactory2 = sVar.f810o;
                                if (sSLSocketFactory2 == null) {
                                    throw new java.lang.IllegalStateException("CLEARTEXT-only client");
                                }
                                U1.c cVar2 = sVar.f814s;
                                eVar = sVar.t;
                                sSLSocketFactory = sSLSocketFactory2;
                                cVar = cVar2;
                            } else {
                                sSLSocketFactory = null;
                                cVar = null;
                                eVar = null;
                            }
                            list = list2;
                            i2 = i3;
                            iVar.f1059g = new M1.f(lVar2, new I1.C0026a(oVar.f764d, oVar.f765e, sVar.f806k, sVar.f809n, sSLSocketFactory, cVar, eVar, sVar.f808m, sVar.f813r, sVar.f812q, sVar.f807l), iVar);
                        } else {
                            list = list2;
                            i2 = i3;
                        }
                        try {
                            if (iVar.f1065m) {
                                throw new java.io.IOException("Canceled");
                            }
                            try {
                                I1.y b4 = gVar.b(request);
                                if (yVar != null) {
                                    I1.x b5 = b4.b();
                                    I1.x b6 = yVar.b();
                                    b6.f850g = null;
                                    I1.y a4 = b6.a();
                                    if (a4.f863g != null) {
                                        throw new java.lang.IllegalArgumentException("priorResponse.body != null");
                                    }
                                    b5.f853j = a4;
                                    b4 = b5.a();
                                }
                                yVar = b4;
                                request = b(yVar, iVar.f1061i);
                                if (request == null) {
                                    iVar.d(false);
                                    return yVar;
                                }
                                I1.z zVar2 = yVar.f863g;
                                if (zVar2 != null) {
                                    J1.b.d(zVar2);
                                }
                                i3 = i2 + 1;
                                if (i3 > 20) {
                                    throw new java.net.ProtocolException(kotlin.jvm.internal.i.h(java.lang.Integer.valueOf(i3), "Too many follow-up requests: "));
                                }
                                iVar.d(true);
                                list2 = list;
                            } catch (M1.m e2) {
                                java.util.List list3 = list;
                                if (!c(e2.f1092b, iVar, request, false)) {
                                    java.io.IOException iOException = e2.f1091a;
                                    J1.b.z(iOException, list3);
                                    throw iOException;
                                }
                                list2 = i1.AbstractC0190i.S(list3, e2.f1091a);
                                iVar.d(true);
                                z3 = false;
                                i3 = i2;
                            } catch (java.io.IOException e3) {
                                if (!c(e3, iVar, request, !(e3 instanceof P1.C0053a))) {
                                    J1.b.z(e3, list);
                                    throw e3;
                                }
                                list2 = i1.AbstractC0190i.S(list, e3);
                                iVar.d(true);
                                i3 = i2;
                                z3 = false;
                            }
                        } catch (java.lang.Throwable th2) {
                            iVar.d(true);
                            throw th2;
                        }
                    }
                }
        }
    }

    public I1.v b(I1.y yVar, M1.e eVar) {
        M1.k kVar;
        java.lang.String a2;
        I1.n nVar;
        I1.A a3 = (eVar == null || (kVar = (M1.k) eVar.f1041e) == null) ? null : kVar.f1069b;
        int i2 = yVar.f860d;
        java.lang.String str = yVar.f857a.f835b;
        if (i2 != 307 && i2 != 308) {
            if (i2 == 401) {
                ((I1.s) this.f1147b).f802g.getClass();
                return null;
            }
            if (i2 == 421) {
                if (eVar == null || kotlin.jvm.internal.i.a(((M1.f) eVar.f1039c).f1043b.f677h.f764d, ((M1.k) eVar.f1041e).f1069b.f660a.f677h.f764d)) {
                    return null;
                }
                M1.k kVar2 = (M1.k) eVar.f1041e;
                synchronized (kVar2) {
                    kVar2.f1078k = true;
                }
                return yVar.f857a;
            }
            if (i2 == 503) {
                I1.y yVar2 = yVar.f866j;
                if ((yVar2 == null || yVar2.f860d != 503) && d(yVar, Integer.MAX_VALUE) == 0) {
                    return yVar.f857a;
                }
                return null;
            }
            if (i2 == 407) {
                kotlin.jvm.internal.i.b(a3);
                if (a3.f661b.type() != java.net.Proxy.Type.HTTP) {
                    throw new java.net.ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                ((I1.s) this.f1147b).f808m.getClass();
                return null;
            }
            if (i2 == 408) {
                if (!((I1.s) this.f1147b).f801f) {
                    return null;
                }
                I1.y yVar3 = yVar.f866j;
                if ((yVar3 == null || yVar3.f860d != 408) && d(yVar, 0) <= 0) {
                    return yVar.f857a;
                }
                return null;
            }
            switch (i2) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        I1.s sVar = (I1.s) this.f1147b;
        if (!sVar.f803h || (a2 = I1.y.a(yVar, "Location")) == null) {
            return null;
        }
        I1.v vVar = yVar.f857a;
        I1.o oVar = vVar.f834a;
        oVar.getClass();
        try {
            nVar = new I1.n();
            nVar.c(oVar, a2);
        } catch (java.lang.IllegalArgumentException unused) {
            nVar = null;
        }
        I1.o a4 = nVar == null ? null : nVar.a();
        if (a4 == null) {
            return null;
        }
        if (!kotlin.jvm.internal.i.a(a4.f761a, vVar.f834a.f761a) && !sVar.f804i) {
            return null;
        }
        I1.u a5 = vVar.a();
        if (Q1.l.r(str)) {
            boolean equals = str.equals("PROPFIND");
            int i3 = yVar.f860d;
            boolean z2 = equals || i3 == 308 || i3 == 307;
            if (str.equals("PROPFIND") || i3 == 308 || i3 == 307) {
                a5.c(str, z2 ? vVar.f837d : null);
            } else {
                a5.c("GET", null);
            }
            if (!z2) {
                ((I1.l) a5.f831d).d("Transfer-Encoding");
                ((I1.l) a5.f831d).d("Content-Length");
                ((I1.l) a5.f831d).d("Content-Type");
            }
        }
        if (!J1.b.a(vVar.f834a, a4)) {
            ((I1.l) a5.f831d).d("Authorization");
        }
        a5.f830c = a4;
        return a5.a();
    }

    public boolean c(java.io.IOException iOException, M1.i iVar, I1.v vVar, boolean z2) {
        M1.o oVar;
        boolean i2;
        M1.k kVar;
        if (!((I1.s) this.f1147b).f801f) {
            return false;
        }
        if ((z2 && (iOException instanceof java.io.FileNotFoundException)) || (iOException instanceof java.net.ProtocolException) || (!(iOException instanceof java.io.InterruptedIOException) ? !(((iOException instanceof javax.net.ssl.SSLHandshakeException) && (iOException.getCause() instanceof java.security.cert.CertificateException)) || (iOException instanceof javax.net.ssl.SSLPeerUnverifiedException)) : (iOException instanceof java.net.SocketTimeoutException) && !z2)) {
            return false;
        }
        M1.f fVar = iVar.f1059g;
        kotlin.jvm.internal.i.b(fVar);
        int i3 = fVar.f1047f;
        if (i3 == 0 && fVar.f1048g == 0 && fVar.f1049h == 0) {
            i2 = false;
        } else {
            if (fVar.f1050i == null) {
                I1.A a2 = null;
                if (i3 <= 1 && fVar.f1048g <= 1 && fVar.f1049h <= 0 && (kVar = fVar.f1044c.f1060h) != null) {
                    synchronized (kVar) {
                        if (kVar.f1079l == 0) {
                            if (J1.b.a(kVar.f1069b.f660a.f677h, fVar.f1043b.f677h)) {
                                a2 = kVar.f1069b;
                            }
                        }
                    }
                }
                if (a2 != null) {
                    fVar.f1050i = a2;
                } else {
                    M1.n nVar = fVar.f1045d;
                    if ((nVar == null || !nVar.a()) && (oVar = fVar.f1046e) != null) {
                        i2 = oVar.i();
                    }
                }
            }
            i2 = true;
        }
        return i2;
    }

    public a(I1.s client) {
        kotlin.jvm.internal.i.e(client, "client");
        this.f1147b = client;
    }
}
