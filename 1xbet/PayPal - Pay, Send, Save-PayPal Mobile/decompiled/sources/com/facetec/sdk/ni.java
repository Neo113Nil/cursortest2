package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class ni implements com.facetec.sdk.mu {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static char[] e;
    private com.facetec.sdk.no d;

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x001e -> B:4:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String $$c(short s, int i, byte b) {
        int i2;
        byte[] bArr = $$a;
        int i3 = i + 4;
        int i4 = s * 4;
        int i5 = b + 98;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i6 = i4;
            i2 = 0;
            i5 += i6;
            bArr2[i2] = (byte) i5;
            if (i2 == i4) {
                return new java.lang.String(bArr2, 0);
            }
            i2++;
            i3++;
            i6 = bArr[i3];
            i5 += i6;
            bArr2[i2] = (byte) i5;
            if (i2 == i4) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            if (i2 == i4) {
            }
        }
    }

    static void init$0() {
        $$a = new byte[]{Byte.MAX_VALUE, 2, -117, -41};
        $$b = 151;
    }

    public ni(com.facetec.sdk.no noVar) {
        this.d = noVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:181:0x011d, code lost:
    
        if (r5 > 0) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0265 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0270 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02f9  */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v23, types: [com.facetec.sdk.mw, com.facetec.sdk.mx] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v49 */
    @Override // com.facetec.sdk.mu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.facetec.sdk.mw e(com.facetec.sdk.mu.e eVar) throws java.io.IOException {
        com.facetec.sdk.mw mwVar;
        java.lang.String str;
        ?? r1;
        com.facetec.sdk.nj njVar;
        java.lang.String obj;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        java.lang.String str2;
        java.lang.String str3;
        com.facetec.sdk.nj njVar2;
        com.facetec.sdk.mx mxVar;
        com.facetec.sdk.qa e2;
        com.facetec.sdk.no noVar = this.d;
        if (noVar != null) {
            eVar.a();
            mwVar = noVar.c();
        } else {
            mwVar = null;
        }
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a("\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000", new int[]{0, 16, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, 16}, false, objArr);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr[0]);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a("\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000", new int[]{16, 17, 0, 0}, true, objArr2);
            com.facetec.sdk.nj.b bVar = new com.facetec.sdk.nj.b(((java.lang.Long) cls.getMethod((java.lang.String) objArr2[0], null).invoke(null, null)).longValue(), eVar.a(), mwVar);
            if (bVar.c == null) {
                njVar = new com.facetec.sdk.nj(bVar.d, null);
            } else if (bVar.d.g() && bVar.c.c == null) {
                njVar = new com.facetec.sdk.nj(bVar.d, null);
            } else if (!com.facetec.sdk.nj.d(bVar.c, bVar.d)) {
                njVar = new com.facetec.sdk.nj(bVar.d, null);
            } else {
                com.facetec.sdk.mf i = bVar.d.i();
                if (!i.a()) {
                    com.facetec.sdk.mx mxVar2 = bVar.d;
                    if (mxVar2.d("If-Modified-Since") == null && mxVar2.d("If-None-Match") == null) {
                        com.facetec.sdk.mf j7 = bVar.c.j();
                        long max = bVar.f3682a != null ? java.lang.Math.max(0L, bVar.g - bVar.f3682a.getTime()) : 0L;
                        if (bVar.l != -1) {
                            max = java.lang.Math.max(max, java.util.concurrent.TimeUnit.SECONDS.toMillis(bVar.l));
                        }
                        long j8 = max + (bVar.g - bVar.h) + (bVar.e - bVar.g);
                        if (bVar.c.j().c() != -1) {
                            j3 = java.util.concurrent.TimeUnit.SECONDS.toMillis(r5.c());
                        } else if (bVar.j != null) {
                            if (bVar.f3682a != null) {
                                j4 = bVar.f3682a.getTime();
                            } else {
                                j4 = bVar.g;
                            }
                            j3 = bVar.j.getTime() - j4;
                        } else {
                            if (bVar.i != null) {
                                com.facetec.sdk.mv c = bVar.c.d().c();
                                if (c.e == null) {
                                    obj = null;
                                } else {
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                    com.facetec.sdk.mv.e(sb, c.e);
                                    obj = sb.toString();
                                }
                                if (obj == null) {
                                    if (bVar.f3682a != null) {
                                        j = bVar.f3682a.getTime();
                                    } else {
                                        j = bVar.h;
                                    }
                                    long time = j - bVar.i.getTime();
                                    j2 = 0;
                                    if (time > 0) {
                                        j3 = time / 10;
                                    }
                                    j3 = j2;
                                }
                            }
                            j2 = 0;
                            j3 = j2;
                        }
                        if (i.c() != -1) {
                            str = "\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000";
                            j3 = java.lang.Math.min(j3, java.util.concurrent.TimeUnit.SECONDS.toMillis(i.c()));
                        } else {
                            str = "\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000";
                        }
                        long millis = i.e() != -1 ? java.util.concurrent.TimeUnit.SECONDS.toMillis(i.e()) : 0L;
                        if (j7.f3642a || i.b() == -1) {
                            j5 = j3;
                            j6 = 0;
                        } else {
                            j5 = j3;
                            j6 = java.util.concurrent.TimeUnit.SECONDS.toMillis(i.b());
                        }
                        if (!j7.a()) {
                            long j9 = millis + j8;
                            if (j9 < j5 + j6) {
                                com.facetec.sdk.mw.c g = bVar.c.g();
                                if (j9 >= j5) {
                                    g.c(com.google.common.net.HttpHeaders.WARNING, "110 HttpURLConnection \"Response is stale\"");
                                }
                                if (j8 > 86400000 && bVar.c.j().c() == -1 && bVar.j == null) {
                                    g.c(com.google.common.net.HttpHeaders.WARNING, "113 HttpURLConnection \"Heuristic expiration\"");
                                }
                                njVar2 = new com.facetec.sdk.nj(null, g.b());
                                njVar = njVar2;
                                r1 = 0;
                                if (njVar.e != null && bVar.d.i().b) {
                                    njVar = new com.facetec.sdk.nj(r1, r1);
                                }
                                mxVar = njVar.e;
                                com.facetec.sdk.mw mwVar2 = njVar.d;
                                if (mwVar != null && mwVar2 == null) {
                                    com.facetec.sdk.nh.c(mwVar.b());
                                }
                                if (mxVar != null && mwVar2 == null) {
                                    com.facetec.sdk.mw.c d = new com.facetec.sdk.mw.c().c(eVar.a()).c(com.facetec.sdk.na.HTTP_1_1).d(504).d("Unsatisfiable Request (only-if-cached)").d(com.facetec.sdk.nh.c).d(-1L);
                                    try {
                                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                                        a("\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000", new int[]{0, 16, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, 16}, false, objArr3);
                                        java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr3[0]);
                                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                                        a(str, new int[]{16, 17, 0, 0}, true, objArr4);
                                        return d.e(((java.lang.Long) cls2.getMethod((java.lang.String) objArr4[0], null).invoke(null, null)).longValue()).b();
                                    } catch (java.lang.Throwable th) {
                                        th = th;
                                        java.lang.Throwable cause = th.getCause();
                                        if (cause != null) {
                                            throw cause;
                                        }
                                        throw th;
                                    }
                                }
                                if (mxVar == null) {
                                    return mwVar2.g().c(c(mwVar2)).b();
                                }
                                try {
                                    com.facetec.sdk.mw e3 = eVar.e(mxVar);
                                    if (e3 == null && mwVar != null) {
                                        com.facetec.sdk.nh.c(mwVar.b());
                                    }
                                    if (mwVar2 != null) {
                                        if (e3.e() == 304) {
                                            com.facetec.sdk.mw.c g2 = mwVar2.g();
                                            com.facetec.sdk.mm c2 = mwVar2.c();
                                            com.facetec.sdk.mm c3 = e3.c();
                                            com.facetec.sdk.mm.b bVar2 = new com.facetec.sdk.mm.b();
                                            int e4 = c2.e();
                                            for (int i2 = 0; i2 < e4; i2++) {
                                                java.lang.String a2 = c2.a(i2);
                                                java.lang.String e5 = c2.e(i2);
                                                if ((!com.google.common.net.HttpHeaders.WARNING.equalsIgnoreCase(a2) || !e5.startsWith("1")) && (e(a2) || !d(a2) || c3.c(a2) == null)) {
                                                    com.facetec.sdk.nd.d.c(bVar2, a2, e5);
                                                }
                                            }
                                            int e6 = c3.e();
                                            for (int i3 = 0; i3 < e6; i3++) {
                                                java.lang.String a3 = c3.a(i3);
                                                if (!e(a3) && d(a3)) {
                                                    com.facetec.sdk.nd.d.c(bVar2, a3, c3.e(i3));
                                                }
                                            }
                                            com.facetec.sdk.mw b = g2.a(bVar2.b()).d(e3.h()).e(e3.f()).c(c(mwVar2)).e(c(e3)).b();
                                            e3.b().close();
                                            return b;
                                        }
                                        com.facetec.sdk.nh.c(mwVar2.b());
                                    }
                                    com.facetec.sdk.mw b2 = e3.g().c(c(mwVar2)).e(c(e3)).b();
                                    if (this.d != null) {
                                        if (com.facetec.sdk.nz.a(b2) && com.facetec.sdk.nj.d(b2, mxVar)) {
                                            final com.facetec.sdk.nk e7 = this.d.e();
                                            if (e7 != null && (e2 = e7.e()) != null) {
                                                final com.facetec.sdk.pr b3 = b2.b().b();
                                                final com.facetec.sdk.pj e8 = com.facetec.sdk.pt.e(e2);
                                                return b2.g().d(new com.facetec.sdk.ob(b2.b("Content-Type"), b2.b().d(), com.facetec.sdk.pt.d(new com.facetec.sdk.pz() { // from class: com.facetec.sdk.ni.2
                                                    private boolean e;

                                                    @Override // com.facetec.sdk.pz
                                                    public final long b(com.facetec.sdk.pk pkVar, long j10) throws java.io.IOException {
                                                        try {
                                                            long b4 = b3.b(pkVar, j10);
                                                            if (b4 == -1) {
                                                                if (!this.e) {
                                                                    this.e = true;
                                                                    e8.close();
                                                                }
                                                                return -1L;
                                                            }
                                                            pkVar.b(e8.c(), pkVar.e() - b4, b4);
                                                            e8.t();
                                                            return b4;
                                                        } catch (java.io.IOException e9) {
                                                            if (!this.e) {
                                                                this.e = true;
                                                            }
                                                            throw e9;
                                                        }
                                                    }

                                                    @Override // com.facetec.sdk.pz
                                                    public final com.facetec.sdk.qe d() {
                                                        return b3.d();
                                                    }

                                                    @Override // com.facetec.sdk.pz, java.io.Closeable, java.lang.AutoCloseable
                                                    public final void close() throws java.io.IOException {
                                                        if (!this.e && !com.facetec.sdk.nh.b(this, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                                                            this.e = true;
                                                        }
                                                        b3.close();
                                                    }
                                                }))).b();
                                            }
                                        } else {
                                            java.lang.String a4 = mxVar.a();
                                            if (!a4.equals("POST") && !a4.equals("PATCH") && !a4.equals(com.datadog.android.internal.network.HttpSpec.Method.PUT) && !a4.equals(com.datadog.android.internal.network.HttpSpec.Method.DELETE)) {
                                                a4.equals("MOVE");
                                            }
                                        }
                                    }
                                    return b2;
                                } finally {
                                }
                            }
                        }
                        if (bVar.k != null) {
                            str2 = bVar.k;
                            str3 = "If-None-Match";
                        } else {
                            if (bVar.i != null) {
                                str2 = bVar.f;
                            } else if (bVar.f3682a != null) {
                                str2 = bVar.b;
                            } else {
                                r1 = 0;
                                njVar = new com.facetec.sdk.nj(bVar.d, null);
                                if (njVar.e != null) {
                                    njVar = new com.facetec.sdk.nj(r1, r1);
                                }
                                mxVar = njVar.e;
                                com.facetec.sdk.mw mwVar22 = njVar.d;
                                if (mwVar != null) {
                                    com.facetec.sdk.nh.c(mwVar.b());
                                }
                                if (mxVar != null) {
                                }
                                if (mxVar == null) {
                                }
                            }
                            str3 = "If-Modified-Since";
                        }
                        com.facetec.sdk.mm.b c4 = bVar.d.d().c();
                        com.facetec.sdk.nd.d.c(c4, str3, str2);
                        com.facetec.sdk.mx.a e9 = bVar.d.e();
                        e9.e = c4.b().c();
                        njVar2 = new com.facetec.sdk.nj(e9.c(), bVar.c);
                        njVar = njVar2;
                        r1 = 0;
                        if (njVar.e != null) {
                        }
                        mxVar = njVar.e;
                        com.facetec.sdk.mw mwVar222 = njVar.d;
                        if (mwVar != null) {
                        }
                        if (mxVar != null) {
                        }
                        if (mxVar == null) {
                        }
                    }
                }
                str = "\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000";
                r1 = 0;
                njVar = new com.facetec.sdk.nj(bVar.d, null);
                if (njVar.e != null) {
                }
                mxVar = njVar.e;
                com.facetec.sdk.mw mwVar2222 = njVar.d;
                if (mwVar != null) {
                }
                if (mxVar != null) {
                }
                if (mxVar == null) {
                }
            }
            str = "\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000";
            r1 = 0;
            if (njVar.e != null) {
            }
            mxVar = njVar.e;
            com.facetec.sdk.mw mwVar22222 = njVar.d;
            if (mwVar != null) {
            }
            if (mxVar != null) {
            }
            if (mxVar == null) {
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    private static com.facetec.sdk.mw c(com.facetec.sdk.mw mwVar) {
        return (mwVar == null || mwVar.b() == null) ? mwVar : mwVar.g().d((com.facetec.sdk.nf) null).b();
    }

    private static void a(java.lang.String str, int[] iArr, boolean z, java.lang.Object[] objArr) {
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
        int i4 = 1;
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr = e;
        char c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[i4];
                    objArr2[i2] = java.lang.Integer.valueOf(cArr[i8]);
                    java.lang.Object d = com.facetec.sdk.al.d(-1287922392);
                    if (d == null) {
                        d = com.facetec.sdk.al.c((char) android.view.View.MeasureSpec.getSize(i2), android.text.TextUtils.indexOf("", c, i2) + 2461, 23 - android.graphics.ImageFormat.getBitsPerPixel(i2), 349480912, false, "c", new java.lang.Class[]{java.lang.Integer.TYPE});
                    }
                    cArr2[i8] = ((java.lang.Character) ((java.lang.reflect.Method) d).invoke(null, objArr2)).charValue();
                    i8++;
                    i2 = 0;
                    i4 = 1;
                    c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
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
        char[] cArr3 = new char[i5];
        java.lang.System.arraycopy(cArr, i3, cArr3, 0, i5);
        if (bArr3 != null) {
            char[] cArr4 = new char[i5];
            hjVar.c = 0;
            char c2 = 0;
            while (hjVar.c < i5) {
                if (bArr3[hjVar.c] == 1) {
                    int i9 = hjVar.c;
                    java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(cArr3[hjVar.c]), java.lang.Integer.valueOf(c2)};
                    java.lang.Object d2 = com.facetec.sdk.al.d(966199657);
                    if (d2 == null) {
                        byte b = (byte) 0;
                        byte b2 = (byte) (b - 1);
                        bArr = bArr3;
                        d2 = com.facetec.sdk.al.c((char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), 2055 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), android.graphics.Color.alpha(0) + 24, -1636273263, false, $$c(b, b2, (byte) (b2 + 1)), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                    } else {
                        bArr = bArr3;
                    }
                    cArr4[i9] = ((java.lang.Character) ((java.lang.reflect.Method) d2).invoke(null, objArr3)).charValue();
                } else {
                    bArr = bArr3;
                    int i10 = hjVar.c;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr3[hjVar.c]), java.lang.Integer.valueOf(c2)};
                    java.lang.Object d3 = com.facetec.sdk.al.d(-1755423365);
                    if (d3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 - 1);
                        d3 = com.facetec.sdk.al.c((char) android.text.TextUtils.getOffsetAfter("", 0), 964 - android.graphics.Color.blue(0), 23 - android.view.MotionEvent.axisFromString(""), 816916355, false, $$c(b3, b4, (byte) (b4 & 6)), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                    }
                    cArr4[i10] = ((java.lang.Character) ((java.lang.reflect.Method) d3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[hjVar.c];
                java.lang.Object[] objArr5 = {hjVar, hjVar};
                java.lang.Object d4 = com.facetec.sdk.al.d(-1890346561);
                if (d4 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = (byte) (b5 - 1);
                    d4 = com.facetec.sdk.al.c((char) (58393 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), android.text.TextUtils.indexOf("", "") + 1763, (android.os.Process.myTid() >> 22) + 24, 683467591, false, $$c(b5, b6, (byte) (b6 & 5)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d4).invoke(null, objArr5);
                bArr3 = bArr;
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            i = 0;
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i11 = i5 - i7;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i11, i7);
            java.lang.System.arraycopy(cArr5, i7, cArr3, 0, i11);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr6 = new char[i5];
            while (true) {
                hjVar.c = i;
                if (hjVar.c >= i5) {
                    break;
                }
                cArr6[hjVar.c] = cArr3[(i5 - hjVar.c) - 1];
                i = hjVar.c + 1;
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            int i12 = 0;
            while (true) {
                hjVar.c = i12;
                if (hjVar.c >= i5) {
                    break;
                }
                cArr3[hjVar.c] = (char) (cArr3[hjVar.c] - iArr[2]);
                i12 = hjVar.c + 1;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    private static boolean d(java.lang.String str) {
        return (com.google.common.net.HttpHeaders.CONNECTION.equalsIgnoreCase(str) || com.google.common.net.HttpHeaders.KEEP_ALIVE.equalsIgnoreCase(str) || com.google.common.net.HttpHeaders.PROXY_AUTHENTICATE.equalsIgnoreCase(str) || com.google.common.net.HttpHeaders.PROXY_AUTHORIZATION.equalsIgnoreCase(str) || com.google.common.net.HttpHeaders.TE.equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || com.google.common.net.HttpHeaders.TRANSFER_ENCODING.equalsIgnoreCase(str) || com.google.common.net.HttpHeaders.UPGRADE.equalsIgnoreCase(str)) ? false : true;
    }

    private static boolean e(java.lang.String str) {
        return "Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str);
    }

    static {
        init$0();
        e = new char[]{47120, 47527, 47533, 47533, 47489, 47503, 47520, 47521, 47532, 47500, 47226, 47520, 47536, 47541, 47534, 47523, 47293, 47338, 47342, 47336, 47342, 47327, 47325, 47341, 47343, 47322, 47328, 47349, 47341, 47343, 47350, 47351, 47336};
    }
}
