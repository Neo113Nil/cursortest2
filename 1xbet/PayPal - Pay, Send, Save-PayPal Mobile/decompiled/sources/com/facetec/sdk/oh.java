package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class oh implements com.facetec.sdk.nx {

    /* renamed from: a, reason: collision with root package name */
    final com.facetec.sdk.ms f3706a;
    final com.facetec.sdk.pr b;
    final com.facetec.sdk.nu c;
    final com.facetec.sdk.pj d;
    int e = 0;
    private long f = 262144;

    public oh(com.facetec.sdk.ms msVar, com.facetec.sdk.nu nuVar, com.facetec.sdk.pr prVar, com.facetec.sdk.pj pjVar) {
        this.f3706a = msVar;
        this.c = nuVar;
        this.b = prVar;
        this.d = pjVar;
    }

    @Override // com.facetec.sdk.nx
    public final com.facetec.sdk.qa e(com.facetec.sdk.mx mxVar, long j) {
        if ("chunked".equalsIgnoreCase(mxVar.d(com.google.common.net.HttpHeaders.TRANSFER_ENCODING))) {
            if (this.e != 1) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("state: ");
                sb.append(this.e);
                throw new java.lang.IllegalStateException(sb.toString());
            }
            this.e = 2;
            return new com.facetec.sdk.oh.a();
        }
        if (j == -1) {
            throw new java.lang.IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.e != 1) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("state: ");
            sb2.append(this.e);
            throw new java.lang.IllegalStateException(sb2.toString());
        }
        this.e = 2;
        return new com.facetec.sdk.oh.e(j);
    }

    @Override // com.facetec.sdk.nx
    public final void b() {
        com.facetec.sdk.nl a2 = this.c.a();
        if (a2 != null) {
            a2.d();
        }
    }

    @Override // com.facetec.sdk.nx
    public final void b(com.facetec.sdk.mx mxVar) throws java.io.IOException {
        java.net.Proxy.Type type = this.c.a().e().e().type();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(mxVar.a());
        sb.append(' ');
        if (!mxVar.g() && type == java.net.Proxy.Type.HTTP) {
            sb.append(mxVar.c());
        } else {
            sb.append(com.facetec.sdk.oa.b(mxVar.c()));
        }
        sb.append(" HTTP/1.1");
        e(mxVar.d(), sb.toString());
    }

    @Override // com.facetec.sdk.nx
    public final com.facetec.sdk.nf c(com.facetec.sdk.mw mwVar) throws java.io.IOException {
        com.facetec.sdk.mo moVar = this.c.c;
        com.facetec.sdk.md mdVar = this.c.b;
        java.lang.String b2 = mwVar.b("Content-Type");
        if (!com.facetec.sdk.nz.a(mwVar)) {
            return new com.facetec.sdk.ob(b2, 0L, com.facetec.sdk.pt.d(b(0L)));
        }
        if ("chunked".equalsIgnoreCase(mwVar.b(com.google.common.net.HttpHeaders.TRANSFER_ENCODING))) {
            com.facetec.sdk.mv c2 = mwVar.d().c();
            if (this.e != 4) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("state: ");
                sb.append(this.e);
                throw new java.lang.IllegalStateException(sb.toString());
            }
            this.e = 5;
            return new com.facetec.sdk.ob(b2, -1L, com.facetec.sdk.pt.d(new com.facetec.sdk.oh.c(c2)));
        }
        long e2 = com.facetec.sdk.nz.e(mwVar);
        if (e2 != -1) {
            return new com.facetec.sdk.ob(b2, e2, com.facetec.sdk.pt.d(b(e2)));
        }
        if (this.e != 4) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("state: ");
            sb2.append(this.e);
            throw new java.lang.IllegalStateException(sb2.toString());
        }
        com.facetec.sdk.nu nuVar = this.c;
        if (nuVar == null) {
            throw new java.lang.IllegalStateException("streamAllocation == null");
        }
        this.e = 5;
        nuVar.b();
        return new com.facetec.sdk.ob(b2, -1L, com.facetec.sdk.pt.d(new com.facetec.sdk.oh.i()));
    }

    @Override // com.facetec.sdk.nx
    public final void e() throws java.io.IOException {
        this.d.flush();
    }

    @Override // com.facetec.sdk.nx
    public final void a() throws java.io.IOException {
        this.d.flush();
    }

    public final void e(com.facetec.sdk.mm mmVar, java.lang.String str) throws java.io.IOException {
        if (this.e != 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("state: ");
            sb.append(this.e);
            throw new java.lang.IllegalStateException(sb.toString());
        }
        this.d.c(str).c(io.ktor.sse.ServerSentEventKt.END_OF_LINE);
        int e2 = mmVar.e();
        for (int i2 = 0; i2 < e2; i2++) {
            this.d.c(mmVar.a(i2)).c(": ").c(mmVar.e(i2)).c(io.ktor.sse.ServerSentEventKt.END_OF_LINE);
        }
        this.d.c(io.ktor.sse.ServerSentEventKt.END_OF_LINE);
        this.e = 1;
    }

    @Override // com.facetec.sdk.nx
    public final com.facetec.sdk.mw.c d(boolean z) throws java.io.IOException {
        int i2 = this.e;
        if (i2 != 1 && i2 != 3) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("state: ");
            sb.append(this.e);
            throw new java.lang.IllegalStateException(sb.toString());
        }
        try {
            com.facetec.sdk.od b2 = com.facetec.sdk.od.b(d());
            com.facetec.sdk.mw.c a2 = new com.facetec.sdk.mw.c().c(b2.f3701a).d(b2.d).d(b2.e).a(c());
            if (z && b2.d == 100) {
                return null;
            }
            if (b2.d == 100) {
                this.e = 3;
                return a2;
            }
            this.e = 4;
            return a2;
        } catch (java.io.EOFException e2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("unexpected end of stream on ");
            sb2.append(this.c);
            java.io.IOException iOException = new java.io.IOException(sb2.toString());
            iOException.initCause(e2);
            throw iOException;
        }
    }

    public abstract class d implements com.facetec.sdk.pz {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10;
        private static int $11;
        private static char[] d;
        private static int f;
        private static char h;
        private static int i;

        /* renamed from: a, reason: collision with root package name */
        protected boolean f3708a;
        private long b;
        private com.facetec.sdk.pp c;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static java.lang.String $$e(int i2, int i3, short s) {
            int i4;
            int i5 = (i3 * 4) + 121;
            int i6 = s * 2;
            int i7 = (i2 * 4) + 4;
            byte[] bArr = $$c;
            byte[] bArr2 = new byte[1 - i6];
            int i8 = 0 - i6;
            if (bArr == null) {
                int i9 = i8;
                int i10 = 0;
                i5 = (-i5) + i9;
                i7++;
                i4 = i10;
                bArr2[i4] = (byte) i5;
                i10 = i4 + 1;
                if (i4 == i8) {
                    return new java.lang.String(bArr2, 0);
                }
                i9 = i5;
                i5 = bArr[i7];
                i5 = (-i5) + i9;
                i7++;
                i4 = i10;
                bArr2[i4] = (byte) i5;
                i10 = i4 + 1;
                if (i4 == i8) {
                }
            } else {
                i4 = 0;
                bArr2[i4] = (byte) i5;
                i10 = i4 + 1;
                if (i4 == i8) {
                }
            }
        }

        static void init$0() {
            $$a = new byte[]{60, -113, -47, com.google.common.base.Ascii.EM};
            $$b = 206;
        }

        static void init$1() {
            $$c = new byte[]{41, -22, -104, -77};
            $$d = 53;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0028). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void j(byte b, int i2, byte b2, java.lang.Object[] objArr) {
            int i3;
            int i4;
            int i5 = (b * 3) + 99;
            int i6 = 1 - (b2 * 2);
            int i7 = 4 - (i2 * 2);
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[i6];
            if (bArr == null) {
                int i8 = i6;
                i4 = 0;
                i7++;
                i5 += -i8;
                i3 = i4;
                i4 = i3 + 1;
                bArr2[i3] = (byte) i5;
                if (i4 == i6) {
                    objArr[0] = new java.lang.String(bArr2, 0);
                    return;
                }
                i8 = bArr[i7];
                i7++;
                i5 += -i8;
                i3 = i4;
                i4 = i3 + 1;
                bArr2[i3] = (byte) i5;
                if (i4 == i6) {
                }
            } else {
                i3 = 0;
                i4 = i3 + 1;
                bArr2[i3] = (byte) i5;
                if (i4 == i6) {
                }
            }
        }

        private static void g(int i2, java.lang.String str, byte b, java.lang.Object[] objArr) {
            int i3;
            long j;
            char[] charArray = str != null ? str.toCharArray() : str;
            com.facetec.sdk.hr hrVar = new com.facetec.sdk.hr();
            char[] cArr = d;
            int i4 = -1887519861;
            long j2 = 0;
            if (cArr != null) {
                $10 = ($11 + 13) % 128;
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i5 = 0;
                while (i5 < length) {
                    try {
                        java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i5])};
                        java.lang.Object d2 = com.facetec.sdk.al.d(i4);
                        if (d2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            d2 = com.facetec.sdk.al.c((char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)), 1859 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), 33 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), 680640883, false, $$e(b2, b3, b3), new java.lang.Class[]{java.lang.Integer.TYPE});
                        }
                        cArr2[i5] = ((java.lang.Character) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).charValue();
                        i5++;
                        i4 = -1887519861;
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
            java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(h)};
            java.lang.Object d3 = com.facetec.sdk.al.d(-1887519861);
            char c = '\b';
            if (d3 == null) {
                byte b4 = (byte) 0;
                byte b5 = b4;
                d3 = com.facetec.sdk.al.c((char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), 1858 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), 32 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), 680640883, false, $$e(b4, b5, b5), new java.lang.Class[]{java.lang.Integer.TYPE});
            }
            char charValue = ((java.lang.Character) ((java.lang.reflect.Method) d3).invoke(null, objArr3)).charValue();
            char[] cArr3 = new char[i2];
            if (i2 % 2 != 0) {
                $10 = ($11 + 71) % 128;
                i3 = i2 - 1;
                cArr3[i3] = (char) (charArray[i3] - b);
            } else {
                i3 = i2;
            }
            if (i3 > 1) {
                hrVar.c = 0;
                while (hrVar.c < i3) {
                    $10 = ($11 + 73) % 128;
                    hrVar.f3631a = charArray[hrVar.c];
                    hrVar.d = charArray[hrVar.c + 1];
                    if (hrVar.f3631a == hrVar.d) {
                        $10 = ($11 + 75) % 128;
                        cArr3[hrVar.c] = (char) (hrVar.f3631a - b);
                        cArr3[hrVar.c + 1] = (char) (hrVar.d - b);
                        j = j2;
                    } else {
                        java.lang.Object[] objArr4 = new java.lang.Object[13];
                        objArr4[12] = hrVar;
                        objArr4[11] = java.lang.Integer.valueOf(charValue);
                        objArr4[10] = hrVar;
                        objArr4[9] = hrVar;
                        objArr4[c] = java.lang.Integer.valueOf(charValue);
                        objArr4[7] = hrVar;
                        objArr4[6] = hrVar;
                        objArr4[5] = java.lang.Integer.valueOf(charValue);
                        objArr4[4] = hrVar;
                        objArr4[3] = hrVar;
                        objArr4[2] = java.lang.Integer.valueOf(charValue);
                        objArr4[1] = hrVar;
                        objArr4[0] = hrVar;
                        java.lang.Object d4 = com.facetec.sdk.al.d(1053249030);
                        if (d4 == null) {
                            char doubleTapTimeout = (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16);
                            long globalActionKeyTimeout = android.view.ViewConfiguration.getGlobalActionKeyTimeout();
                            int scrollBarSize = android.view.ViewConfiguration.getScrollBarSize();
                            java.lang.Class[] clsArr = new java.lang.Class[13];
                            clsArr[0] = java.lang.Object.class;
                            clsArr[1] = java.lang.Object.class;
                            clsArr[2] = java.lang.Integer.TYPE;
                            clsArr[3] = java.lang.Object.class;
                            clsArr[4] = java.lang.Object.class;
                            clsArr[5] = java.lang.Integer.TYPE;
                            clsArr[6] = java.lang.Object.class;
                            clsArr[7] = java.lang.Object.class;
                            clsArr[c] = java.lang.Integer.TYPE;
                            clsArr[9] = java.lang.Object.class;
                            clsArr[10] = java.lang.Object.class;
                            clsArr[11] = java.lang.Integer.TYPE;
                            clsArr[12] = java.lang.Object.class;
                            d4 = com.facetec.sdk.al.c(doubleTapTimeout, 235 - (globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1)), (scrollBarSize >> 8) + 24, -1725418242, false, "u", clsArr);
                        }
                        if (((java.lang.Integer) ((java.lang.reflect.Method) d4).invoke(null, objArr4)).intValue() == hrVar.i) {
                            java.lang.Object[] objArr5 = new java.lang.Object[11];
                            objArr5[10] = hrVar;
                            objArr5[9] = java.lang.Integer.valueOf(charValue);
                            objArr5[c] = hrVar;
                            objArr5[7] = java.lang.Integer.valueOf(charValue);
                            objArr5[6] = java.lang.Integer.valueOf(charValue);
                            objArr5[5] = hrVar;
                            objArr5[4] = hrVar;
                            objArr5[3] = java.lang.Integer.valueOf(charValue);
                            objArr5[2] = java.lang.Integer.valueOf(charValue);
                            objArr5[1] = hrVar;
                            objArr5[0] = hrVar;
                            java.lang.Object d5 = com.facetec.sdk.al.d(764455884);
                            if (d5 == null) {
                                j = 0;
                                char c2 = (char) (1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                                int deadChar = android.view.KeyEvent.getDeadChar(0, 0);
                                int packedPositionChild = android.widget.ExpandableListView.getPackedPositionChild(0L);
                                java.lang.Class[] clsArr2 = new java.lang.Class[11];
                                clsArr2[0] = java.lang.Object.class;
                                clsArr2[1] = java.lang.Object.class;
                                clsArr2[2] = java.lang.Integer.TYPE;
                                clsArr2[3] = java.lang.Integer.TYPE;
                                clsArr2[4] = java.lang.Object.class;
                                clsArr2[5] = java.lang.Object.class;
                                clsArr2[6] = java.lang.Integer.TYPE;
                                clsArr2[7] = java.lang.Integer.TYPE;
                                clsArr2[c] = java.lang.Object.class;
                                clsArr2[9] = java.lang.Integer.TYPE;
                                clsArr2[10] = java.lang.Object.class;
                                d5 = com.facetec.sdk.al.c(c2, deadChar + 141, 23 - packedPositionChild, -1971334860, false, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, clsArr2);
                            } else {
                                j = 0;
                            }
                            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) d5).invoke(null, objArr5)).intValue();
                            int i6 = hrVar.e;
                            int i7 = hrVar.i;
                            cArr3[hrVar.c] = cArr[intValue];
                            cArr3[hrVar.c + 1] = cArr[(i6 * charValue) + i7];
                        } else {
                            j = 0;
                            if (hrVar.b == hrVar.e) {
                                hrVar.j = ((hrVar.j + charValue) - 1) % charValue;
                                hrVar.i = ((hrVar.i + charValue) - 1) % charValue;
                                int i8 = hrVar.b;
                                int i9 = hrVar.j;
                                int i10 = hrVar.e;
                                int i11 = hrVar.i;
                                cArr3[hrVar.c] = cArr[(i8 * charValue) + i9];
                                cArr3[hrVar.c + 1] = cArr[(i10 * charValue) + i11];
                            } else {
                                int i12 = hrVar.b;
                                int i13 = hrVar.i;
                                int i14 = hrVar.e;
                                int i15 = hrVar.j;
                                cArr3[hrVar.c] = cArr[(i12 * charValue) + i13];
                                cArr3[hrVar.c + 1] = cArr[(i14 * charValue) + i15];
                            }
                        }
                    }
                    hrVar.c += 2;
                    j2 = j;
                    c = '\b';
                }
            }
            int i16 = 0;
            while (i16 < i2) {
                int i17 = $10 + 35;
                $11 = i17 % 128;
                if (i17 % 2 == 0) {
                    cArr3[i16] = (char) (cArr3[i16] ^ 5788);
                    i16 += 12;
                } else {
                    cArr3[i16] = (char) (cArr3[i16] ^ 13722);
                    i16++;
                }
            }
            objArr[0] = new java.lang.String(cArr3);
        }

        private d() {
            this.c = new com.facetec.sdk.pp(com.facetec.sdk.oh.this.b.d());
            this.b = 0L;
        }

        /* synthetic */ d(com.facetec.sdk.oh ohVar, byte b) {
            this();
        }

        @Override // com.facetec.sdk.pz
        public final com.facetec.sdk.qe d() {
            int i2 = i;
            f = (i2 + 17) % 128;
            com.facetec.sdk.pp ppVar = this.c;
            f = (i2 + 21) % 128;
            return ppVar;
        }

        @Override // com.facetec.sdk.pz
        public long b(com.facetec.sdk.pk pkVar, long j) throws java.io.IOException {
            try {
                long b = com.facetec.sdk.oh.this.b.b(pkVar, j);
                if (b > 0) {
                    int i2 = f + 113;
                    i = i2 % 128;
                    if (i2 % 2 != 0) {
                        this.b ^= b;
                    } else {
                        this.b += b;
                    }
                }
                f = (i + 99) % 128;
                return b;
            } catch (java.io.IOException e) {
                e(false, e);
                throw e;
            }
        }

        protected final void e(boolean z, java.io.IOException iOException) throws java.io.IOException {
            if (com.facetec.sdk.oh.this.e == 6) {
                return;
            }
            if (com.facetec.sdk.oh.this.e != 5) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("state: ");
                sb.append(com.facetec.sdk.oh.this.e);
                throw new java.lang.IllegalStateException(sb.toString());
            }
            com.facetec.sdk.oh.a(this.c);
            com.facetec.sdk.oh.this.e = 6;
            java.lang.Object obj = null;
            if (com.facetec.sdk.oh.this.c != null) {
                int i2 = f + 17;
                i = i2 % 128;
                if (i2 % 2 != 0) {
                    com.facetec.sdk.nu nuVar = com.facetec.sdk.oh.this.c;
                    obj.hashCode();
                    throw null;
                }
                com.facetec.sdk.oh.this.c.d(!z, com.facetec.sdk.oh.this, iOException);
            }
            int i3 = f + 9;
            i = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            i = 0;
            f = 1;
            d = new char[]{9391, 4422, 9386, 4435, 4376, 4418, 4466, 4437, 4419, 4359, 4440, 9380, 4445, 9382, 4417, 4377, 4420, 4469, 4431, 9390, 4421, 4432, 9381, 4447, 4442, 4464, 4436, 4457, 9385, 9389, 4434, 4441, 9387, 9384, 4439, 4433};
            h = (char) 9386;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(10:(2:29|30)|(1:32)(4:67|68|69|(9:71|(2:73|74)(1:75)|34|35|(1:37)(4:57|58|59|60)|41|(1:43)(6:44|45|46|47|48|(2:51|52))|39|40)(1:76))|33|34|35|(0)(0)|41|(0)(0)|39|40) */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0704, code lost:
        
            if ((r4 % 2) == 0) goto L55;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x0785, code lost:
        
            if (r7.equals((java.lang.String) r10[0]) != false) goto L55;
         */
        /* JADX WARN: Removed duplicated region for block: B:37:0x06f5  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x07f1  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0809 A[Catch: Exception -> 0x096a, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x096a, blocks: (B:35:0x06c4, B:41:0x0787, B:44:0x0809, B:47:0x0838, B:55:0x095b, B:56:0x0961, B:57:0x0708, B:60:0x077f, B:64:0x0963, B:65:0x0969, B:59:0x0712, B:46:0x0813), top: B:34:0x06c4, inners: #1, #4 }] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0708 A[Catch: Exception -> 0x096a, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x096a, blocks: (B:35:0x06c4, B:41:0x0787, B:44:0x0809, B:47:0x0838, B:55:0x095b, B:56:0x0961, B:57:0x0708, B:60:0x077f, B:64:0x0963, B:65:0x0969, B:59:0x0712, B:46:0x0813), top: B:34:0x06c4, inners: #1, #4 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static java.lang.Object[] e(int i2, int i3) {
            java.lang.Object[] objArr;
            int i4;
            java.lang.Object[] objArr2;
            int i5;
            java.lang.String str;
            java.io.File file;
            java.io.File file2;
            java.io.File file3;
            int i6 = 2;
            try {
                int i7 = -(-(android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                int size = android.view.View.MeasureSpec.getSize(0);
                int i8 = size * 714;
                int i9 = ~size;
                int i10 = ~i2;
                int i11 = ~((i9 ^ i10) | (i9 & i10));
                int i12 = ~((i9 ^ 33) | (i9 & 33));
                int i13 = (i11 ^ i12) | (i12 & i11);
                int i14 = size | (-34);
                int i15 = ~((i14 ^ i2) | (i14 & i2));
                int i16 = (i8 & (-23496)) + (i8 | (-23496)) + (((i13 ^ i15) | (i13 & i15)) * (-713));
                int i17 = (size ^ (-34)) | (size & (-34));
                int i18 = -(-((~((i17 ^ i2) | (i17 & i2))) * 1426));
                int i19 = (i16 ^ i18) + ((i16 & i18) << 1);
                int i20 = (~((i10 ^ (-34)) | (i10 & (-34)))) * 713;
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                g((i7 ^ 19) + ((i7 & 19) << 1), "\u0012\u0015\t\u0000 \u000e㘞㘞\u0004\u000f\r#㘕㘕\u0001\t\u0000\u0004㘟", (byte) ((i19 & i20) + (i20 | i19)), objArr3);
                int alpha = android.graphics.Color.alpha(0);
                int i21 = -(-(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                g((alpha & 18) + (alpha | 18), "\u0010 \u001d\u000b\u0016\u000b\u001f\u001d\"\r\t\u0000 \u000e㙑㙑\u0004\u000f", (byte) (((i21 | 83) << 1) - (i21 ^ 83)), objArr4);
                java.lang.String[] strArr = {(java.lang.String) objArr3[0], (java.lang.String) objArr4[0]};
                int i22 = 0;
                while (true) {
                    if (i22 >= i6) {
                        objArr = new java.lang.Object[]{null, new int[]{i2}, new int[]{i2}, new int[]{(r3 & (~r4)) | r6}};
                        int i23 = ((813843523 | i10) * (-192)) + 253038883 + (((~((-5607837) | i10)) | 5247236) * (-384)) + (((~((-5247237) | i2)) | (~((-360601) | i10)) | (~(819451359 | i2))) * 192);
                        int i24 = i23 * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL;
                        int i25 = ~((i10 ^ (-1)) | i10);
                        int i26 = ~((i23 ^ i2) | (i23 & i2));
                        int i27 = -(-(((i26 ^ i25) | (i25 & i26)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL));
                        int i28 = (i24 ^ i27) + ((i24 & i27) << 1);
                        int i29 = ~i23;
                        int i30 = ~((i29 & i10) | (i29 ^ i10));
                        int i31 = -(-(((i30 ^ i10) | (i30 & i10)) * (-1040)));
                        int i32 = ((i28 | i31) << 1) - (i31 ^ i28);
                        int i33 = ~i29;
                        int i34 = ((i33 ^ i25) | (i25 & i33) | i10) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL;
                        int i35 = (i32 ^ i34) + ((i34 & i32) << 1);
                        int i36 = (i3 & i35) + (i35 | i3);
                        int i37 = i36 << 13;
                        int i38 = (i36 & (~i37)) | ((~i36) & i37);
                        int i39 = i38 >>> 17;
                        int i40 = (~(i38 & i39)) & (i38 | i39);
                        int i41 = i40 << 5;
                        int i42 = (~i40) & i41;
                        int i43 = f;
                        i = ((i43 ^ 15) + ((i43 & 15) << 1)) % 128;
                        break;
                    }
                    java.lang.String str2 = strArr[i22];
                    int maxKeyCode = android.view.KeyEvent.getMaxKeyCode() >> 16;
                    int i44 = (maxKeyCode * 960) - 30672;
                    int i45 = -(-(((~(maxKeyCode | i2)) | (~((i10 ^ (-17)) | (i10 & (-17))))) * 959));
                    int i46 = (i44 ^ i45) + ((i44 & i45) << 1);
                    int i47 = ~(i2 | (-17));
                    int i48 = ~((maxKeyCode ^ i10) | (maxKeyCode & i10));
                    int i49 = -android.widget.ExpandableListView.getPackedPositionChild(0L);
                    int i50 = i49 * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ACTIVATION_SCRP_FAIL;
                    int i51 = ~((i10 ^ 10) | (i10 & 10));
                    int i52 = (((i50 & (-5200)) + (i50 | (-5200))) - (~(-(-(((i49 ^ i51) | (i51 & i49)) * (-1042)))))) - 1;
                    int i53 = (i2 | 10) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL;
                    int i54 = ~i49;
                    int i55 = (~(i54 | i2)) | (~(i54 | (-11)));
                    int i56 = (i49 & i10) | (i49 ^ i10);
                    int i57 = ~((i56 ^ 10) | (i56 & 10));
                    byte b = (byte) ((((i52 & i53) + (i52 | i53)) - (~(-(-(((i55 & i57) | (i55 ^ i57)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL))))) - 1);
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    g((((i46 | 16303) << 1) - (i46 ^ 16303)) + (((i48 & i47) | (i48 ^ i47)) * 959), "\u0004\u0010\"\f#\u0013\"\u0000 \u0013\u0000\n\u0002\u001b\u000b ", b, objArr5);
                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr5[0]);
                    if (((java.lang.Boolean) cls.getMethod(str2, new java.lang.Class[0]).invoke(cls, null)).booleanValue()) {
                        objArr = new java.lang.Object[]{null, new int[]{i2}, new int[]{(i2 & (-2)) | (i10 & 1)}, new int[1]};
                        int i58 = ~new java.util.Random().nextInt(1372090394);
                        int i59 = -(-((((((~((-46079369) | i58)) | (-778619228)) * (-933)) + 264810212) + (((~(i58 | (-778619228))) | 742441043) * 933)) - 1250136764));
                        int i60 = ((i3 | i59) << 1) - (i59 ^ i3);
                        int i61 = i60 << 13;
                        int i62 = ((~i61) & i60) | ((~i60) & i61);
                        int i63 = i62 >>> 17;
                        int i64 = (~(i62 & i63)) & (i62 | i63);
                        int i65 = i64 << 5;
                        ((int[]) objArr[3])[0] = (~(i64 & i65)) & (i64 | i65);
                        i = (f + 85) % 128;
                        break;
                    }
                    int i66 = (i22 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE) + (i22 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE);
                    i22 = (i66 & (-121)) + (i66 | (-121));
                    int i67 = i;
                    f = ((i67 ^ 31) + ((i67 & 31) << 1)) % 128;
                    i6 = 2;
                }
            } catch (java.lang.Exception unused) {
                objArr = new java.lang.Object[]{null, new int[]{i2}, new int[]{(~(i2 & 2)) & (i2 | 2)}, new int[1]};
                int i68 = (~new java.util.Random().nextInt(363251440)) | 959315410;
                int i69 = (i68 * 495) + 555631330 + (((~i68) | 824830224) * 495);
                int i70 = (i69 ^ 16) + ((i69 & 16) << 1) + i3;
                int i71 = i70 ^ (i70 << 13);
                int i72 = i71 >>> 17;
                int i73 = (i71 & (~i72)) | ((~i71) & i72);
                int i74 = i73 << 5;
                ((int[]) objArr[3])[0] = (~(i73 & i74)) & (i73 | i74);
            }
            if (i2 != ((int[]) objArr[2])[0]) {
                return objArr;
            }
            try {
                java.lang.Object d2 = com.facetec.sdk.al.d(-1447165611);
                if (d2 == null) {
                    char blue = (char) (android.graphics.Color.blue(0) + 18951);
                    long uptimeMillis = android.os.SystemClock.uptimeMillis();
                    int keyCodeFromString = android.view.KeyEvent.keyCodeFromString("");
                    byte b2 = (byte) 0;
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    j(b2, b2, b2, objArr6);
                    d2 = com.facetec.sdk.al.c(blue, (uptimeMillis > 0L ? 1 : (uptimeMillis == 0L ? 0 : -1)) + 2101, 24 - keyCodeFromString, 240221101, false, (java.lang.String) objArr6[0], new java.lang.Class[0]);
                }
                long longValue = ((java.lang.Long) ((java.lang.reflect.Method) d2).invoke(null, null)).longValue();
                long j = -1626327920;
                long j2 = -1;
                long j3 = j ^ j2;
                long j4 = longValue ^ j2;
                long j5 = j3 | (i2 ^ j2);
                long j6 = (((((483 * j) + (com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE * longValue)) + ((((j3 | j4) ^ j2) | (j5 ^ j2)) * (-241))) + ((-482) * (j | longValue))) + (241 * (((j5 | longValue) ^ j2) | ((j4 | j) ^ j2)))) - 139716400;
                int i75 = ~((int) android.os.Process.getElapsedCpuTime());
                int i76 = ~i2;
                int i77 = ~(1098892540 | i76);
                if (((((int) (j6 >> 32)) & (((((~(r2 | (-1034141225))) | ((~(2108948012 | i75)) | 748792872)) * (-68)) - 706339686) + ((~((-285348353) | i75)) * (-68)) + (((~(i75 | 1034141224)) | 1823599660) * 68))) | (((((~((-1098892541) | i2)) | (~(1758848345 | i76)) | i77) * (-516)) + 1622961889 + (((~((-1079362649) | i2)) | (~((-679485698) | i76))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR) + ((679485697 | i77) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR)) & ((int) j6))) == 1) {
                    int i78 = i;
                    f = ((i78 ^ 7) + ((i78 & 7) << 1)) % 128;
                    objArr2 = new java.lang.Object[]{null, new int[]{i2}, new int[]{(~(i2 & 10)) & (i2 | 10)}, new int[1]};
                    int maxMemory = (int) java.lang.Runtime.getRuntime().maxMemory();
                    int i79 = ((~(687334371 | maxMemory)) * (-301)) + 523372348 + (((~((-682959649) | maxMemory)) | (~((~maxMemory) | 141738947))) * (-301)) + (((~(maxMemory | (-141738948))) | (-682959649)) * 301);
                    int i80 = i79 * 503;
                    int i81 = (i80 ^ (-8016)) + ((i80 & (-8016)) << 1);
                    int i82 = ~i79;
                    int i83 = ((~((i79 ^ 16) | (i79 & 16))) | (~(i82 | i2))) * (-502);
                    int i84 = (i76 & i82) | (i82 ^ i76);
                    int i85 = -(-((~((i84 ^ 16) | (i84 & 16))) * (-502)));
                    int i86 = ~((i2 ^ (-17)) | (i2 & (-17)));
                    int i87 = (((((i81 | i83) << 1) - (i83 ^ i81)) - (~i85)) - 1) + (((i82 ^ i86) | (i82 & i86)) * 502);
                    int i88 = i87 * (-375);
                    i4 = i3;
                    int i89 = -(-(i4 * (-375)));
                    int i90 = ~i87;
                    int i91 = ~i4;
                    int i92 = (~((i91 ^ i90) | (i91 & i90))) | i2;
                    int i93 = ~((i87 ^ i4) | (i87 & i4));
                    int i94 = ~((i76 ^ i87) | (i76 & i87));
                    int i95 = ~(i87 | i4);
                    int i96 = ~(i90 | i2);
                    int i97 = (((((i88 & i89) + (i88 | i89)) + (((i92 & i93) | (i92 ^ i93)) * 376)) + (((i94 & i95) | (i94 ^ i95)) * (-376))) - (~(((i96 & i4) | (i4 ^ i96)) * 376))) - 1;
                    int i98 = (i97 << 13) ^ i97;
                    int i99 = i98 ^ (i98 >>> 17);
                    int i100 = i99 << 5;
                    int[] iArr = (int[]) objArr2[3];
                    int i101 = (i99 & (~i100)) | ((~i99) & i100);
                    i5 = 0;
                    iArr[0] = i101;
                } else {
                    i4 = i3;
                    objArr2 = new java.lang.Object[]{null, new int[]{i2}, new int[]{i2}, new int[1]};
                    int myPid = ((((~((-25227525) | (~r2))) | (-799471072)) * (-591)) - 1486704306) + ((android.os.Process.myPid() | (-25227525)) * 591);
                    int i102 = ~myPid;
                    int i103 = ~((i102 ^ i76) | (i102 & i76));
                    int i104 = ~(myPid | i2);
                    int i105 = ~i76;
                    int i106 = (myPid * 713) + (((~i102) | i105) * (-712)) + (((i103 ^ i104) | (i104 & i103)) * (-712)) + (((i102 ^ i105) | (i102 & i105)) * 712);
                    int d3 = com.facetec.sdk.gh.b.d();
                    int i107 = i106 * (-1529);
                    int i108 = i4 * (-764);
                    int i109 = (i107 ^ i108) + ((i107 & i108) << 1);
                    int i110 = ~i106;
                    int i111 = ~i4;
                    int i112 = ~d3;
                    int i113 = ~((i110 ^ i111) | (i110 & i111) | i112);
                    int i114 = (i110 ^ i4) | (i110 & i4);
                    int i115 = ~((i114 ^ d3) | (i114 & d3));
                    int i116 = (i113 ^ i115) | (i113 & i115);
                    int i117 = (i111 & i106) | (i111 ^ i106);
                    int i118 = ~((i117 ^ d3) | (i117 & d3));
                    int i119 = -(-(((i116 ^ i118) | (i118 & i116)) * 765));
                    int i120 = (i109 ^ i119) + ((i109 & i119) << 1);
                    int i121 = ~(i110 | i111);
                    int i122 = ~((i110 & i112) | (i110 ^ i112));
                    int i123 = -(-(((i121 ^ i122) | (i122 & i121)) * 1530));
                    int i124 = ~((d3 ^ i110) | (d3 & i110));
                    int i125 = ~(i106 | (i111 ^ i112) | (i111 & i112));
                    int i126 = (i120 & i123) + (i123 | i120) + (((i124 ^ i125) | (i125 & i124)) * 765);
                    int i127 = i126 << 13;
                    int i128 = ((~i127) & i126) | ((~i126) & i127);
                    int i129 = i128 >>> 17;
                    int i130 = (~(i128 & i129)) & (i128 | i129);
                    i5 = 0;
                    ((int[]) objArr2[3])[0] = i130 ^ (i130 << 5);
                    i = (f + 121) % 128;
                }
                if (i2 != ((int[]) objArr2[2])[i5]) {
                    return objArr2;
                }
                try {
                    int i131 = -android.view.View.MeasureSpec.getSize(i5);
                    int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                    int i132 = ~((lastIndexOf ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE) | (lastIndexOf & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE));
                    int i133 = ~((lastIndexOf ^ i2) | (lastIndexOf & i2));
                    byte b3 = (byte) ((lastIndexOf * 306) + 38554 + (((i132 ^ i133) | (i132 & i133)) * 305) + (((~((lastIndexOf ^ i76) | (lastIndexOf & i76))) | (-125)) * 305));
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    g(39 - (~i131), "\u000e\u0015\u0013\u0015\u0010\r\u0004\u000f\t\u0004\u001b\f!\u0000 \u000e!\u0011\u0004\u0011\u001f\n\u0016\u000b!\u0011\b\t㙣㙣\u0004\t\u0003\u001d\u0004\u0011\u001f\n\u0004\u000f", b3, objArr7);
                    file3 = new java.io.File((java.lang.String) objArr7[0]);
                } catch (java.lang.Exception unused2) {
                }
                if (file3.canRead()) {
                    java.io.FileReader fileReader = new java.io.FileReader(file3);
                    java.io.BufferedReader bufferedReader = new java.io.BufferedReader(fileReader);
                    try {
                        str = bufferedReader.readLine();
                        int maximumDrawingCacheSize = android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                        int i134 = maximumDrawingCacheSize * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_DIMENSION;
                        int i135 = ~maximumDrawingCacheSize;
                        int i136 = ~((i135 ^ i2) | (i135 & i2));
                        int i137 = ~((i76 ^ 3) | (i76 & 3));
                        int i138 = (maximumDrawingCacheSize & i76) | (i76 ^ maximumDrawingCacheSize);
                        int i139 = (((((i134 ^ (-2709)) + ((i134 & (-2709)) << 1)) - (~(((i136 & i137) | (i136 ^ i137)) * (-1808)))) - 1) - (~(-(-(((~(((i135 ^ (-4)) | (i135 & (-4))) | i2)) | (~((i138 & 3) | (i138 ^ 3)))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN))))) - 1;
                        int i140 = (~((i135 & 3) | (i135 ^ 3))) | (~((i2 & (-4)) | (i2 ^ (-4))));
                        int i141 = ~i138;
                        int i142 = ((i141 ^ i140) | (i141 & i140)) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN;
                        int i143 = -(-android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0));
                        java.lang.Object[] objArr8 = new java.lang.Object[1];
                        g((i139 ^ i142) + ((i142 & i139) << 1), "\u0007\"㙟", (byte) ((i143 & 118) + (i143 | 118)), objArr8);
                        if (!str.equals((java.lang.String) objArr8[0])) {
                            int i144 = i;
                            int i145 = (i144 & 71) + (i144 | 71);
                            f = i145 % 128;
                            if (i145 % 2 == 0) {
                                fileReader.close();
                                bufferedReader.close();
                                int i146 = 54 / 0;
                            } else {
                                fileReader.close();
                                bufferedReader.close();
                            }
                            int i147 = -(android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            java.lang.Object[] objArr9 = new java.lang.Object[1];
                            g((i147 & 31) + (i147 | 31), "\r\u0003\r\"\t\r\u0015\u0013\u0015\u000e\u000f\u0000\u0016\u0010\u0000\u001b\u0015\u001b\u0004\u0011\u001f\n\t!\u0004\t \u001c\u001b\u0000㙍", (byte) (78 - (~(-(android.view.ViewConfiguration.getFadingEdgeLength() >> 16)))), objArr9);
                            file = new java.io.File((java.lang.String) objArr9[0]);
                            if (file.canRead()) {
                                int i148 = i;
                                int i149 = ((i148 | 113) << 1) - (i148 ^ 113);
                                f = i149 % 128;
                            } else {
                                try {
                                    java.lang.String readLine = new java.io.BufferedReader(new java.io.FileReader(file)).readLine();
                                    int i150 = -android.graphics.ImageFormat.getBitsPerPixel(0);
                                    int i151 = -(android.view.ViewConfiguration.getPressedStateDuration() >> 16);
                                    int i152 = ~i151;
                                    int i153 = (i152 & (-118)) | (i152 ^ (-118));
                                    int i154 = ~((i153 ^ i76) | (i153 & i76));
                                    int i155 = ~(i2 | 117);
                                    int i156 = (i151 * (-519)) + 60957 + (((i154 & i155) | (i154 ^ i155)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL);
                                    int i157 = ~((i76 & (-118)) | (i76 ^ (-118)));
                                    int i158 = ~((i151 ^ i2) | (i151 & i2));
                                    int i159 = ((i157 & i158) | (i157 ^ i158)) * (-1040);
                                    int i160 = (~((i76 & i152) | (i76 ^ i152))) | (~((i151 ^ (-118)) | (i151 & (-118))));
                                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                                    g(i150, "㘠", (byte) ((((i156 | i159) << 1) - (i159 ^ i156)) + (((i160 ^ i158) | (i160 & i158)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL)), objArr10);
                                } finally {
                                }
                            }
                            int i161 = (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                            int d4 = com.facetec.sdk.gh.b.d();
                            int i162 = i161 * 980;
                            int i163 = (((-35208) | i162) << 1) - (i162 ^ (-35208));
                            int i164 = ~d4;
                            int i165 = -(-((~((i164 ^ (-37)) | (i164 & (-37)))) * 979));
                            int i166 = (i163 & i165) + (i163 | i165);
                            int i167 = ((i161 ^ d4) | (i161 & d4)) * (-979);
                            int i168 = (i166 & i167) + (i167 | i166);
                            int i169 = -(-(((~((i161 ^ i164) | (i161 & i164))) | (~(d4 | (-37)))) * 979));
                            int i170 = -(-android.text.TextUtils.getOffsetBefore("", 0));
                            java.lang.Object[] objArr11 = new java.lang.Object[1];
                            g((i168 & i169) + (i169 | i168), "\u000e\u0015\u0013\u0015\u0010\r\u0004\u000f\t\u0004\u001b\f!\u0000 \u000e!\u0011\u0004\u0011\u001f\n\u0016\u000b!\u0011\u0004\u0011\u001f\n\u0016\u000b!\u001d\"\u0007", (byte) ((i170 & 103) + (i170 | 103)), objArr11);
                            file2 = new java.io.File((java.lang.String) objArr11[0]);
                            if (file2.canRead()) {
                                int i171 = i;
                                f = ((i171 & 65) + (i171 | 65)) % 128;
                                f = (((i171 | 57) << 1) - (i171 ^ 57)) % 128;
                            } else {
                                try {
                                    java.lang.String readLine2 = new java.io.BufferedReader(new java.io.FileReader(file2)).readLine();
                                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                                    g((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), "㘠", (byte) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 117), objArr12);
                                    boolean equals = readLine2.equals((java.lang.String) objArr12[0]);
                                    int i172 = i;
                                    int i173 = ((i172 ^ 15) + ((i172 & 15) << 1)) % 128;
                                    f = i173;
                                    if (equals && str != null) {
                                        i = ((i173 ^ 19) + ((i173 & 19) << 1)) % 128;
                                        java.lang.Object[] objArr13 = {str, new int[]{i2}, new int[]{r1 & (~(i2 & 20))}, new int[1]};
                                        int i174 = i2 | 20;
                                        int i175 = (int) java.lang.Runtime.getRuntime().totalMemory();
                                        int i176 = (((~((-546460313) | i175)) | 805816019) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) + 1305249487 + (((~((~i175) | (-546460313))) | 805816019) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE);
                                        int d5 = com.facetec.sdk.gh.b.d();
                                        int i177 = (i176 * (-301)) + 4848;
                                        int i178 = ~d5;
                                        int i179 = (i176 ^ 16) | (i176 & 16);
                                        int i180 = -(-(((~((i178 ^ (-17)) | (i178 & (-17)) | i176)) | (~((i179 ^ d5) | (i179 & d5)))) * (-302)));
                                        int i181 = (i177 & i180) + (i177 | i180);
                                        int i182 = (i176 ^ (-17)) | (i176 & (-17));
                                        int i183 = -(-((~((i182 ^ d5) | (i182 & d5))) * (-604)));
                                        int i184 = (i181 & i183) + (i183 | i181);
                                        int i185 = -(-(((~((d5 ^ i176) | (d5 & i176))) | (~((~i176) | 16))) * 302));
                                        int i186 = ((i184 | i185) << 1) - (i185 ^ i184);
                                        int d6 = com.facetec.sdk.gh.b.d();
                                        int i187 = i186 * 371;
                                        int i188 = i4 * 371;
                                        int i189 = ~i4;
                                        int i190 = ~d6;
                                        int i191 = ~((i189 & i190) | (i189 ^ i190));
                                        int i192 = ~i186;
                                        int i193 = ~((i192 ^ d6) | (i192 & d6));
                                        int i194 = (((i187 & i188) + (i187 | i188)) - (~(-(-(((i191 & i193) | (i191 ^ i193)) * (-370)))))) - 1;
                                        int i195 = ~((i192 ^ i190) | (i190 & i192));
                                        int i196 = ~(d6 | i189);
                                        int i197 = (i196 ^ i195) | (i196 & i195);
                                        int i198 = ~((i186 ^ i4) | (i186 & i4));
                                        int i199 = ((i197 ^ i198) | (i197 & i198)) * (-370);
                                        int i200 = (i194 & i199) + (i199 | i194);
                                        int i201 = i198 * com.knotapi.knot.utilities.Constants.ID_KROGER;
                                        int i202 = (i200 ^ i201) + ((i201 & i200) << 1);
                                        int i203 = i202 << 13;
                                        int i204 = (~(i202 & i203)) & (i203 | i202);
                                        int i205 = i204 >>> 17;
                                        int i206 = (i204 & (~i205)) | ((~i204) & i205);
                                        int i207 = i206 << 5;
                                        ((int[]) objArr13[3])[0] = (i206 & (~i207)) | ((~i206) & i207);
                                        f = (i + 29) % 128;
                                        return objArr13;
                                    }
                                } finally {
                                }
                            }
                            java.lang.Object[] objArr14 = {null, new int[]{i2}, new int[]{i2}, new int[1]};
                            int maxMemory2 = (int) java.lang.Runtime.getRuntime().maxMemory();
                            int i208 = ~maxMemory2;
                            int i209 = (((~(i208 | (-80467060))) | 8635395 | (~(744231536 | i208))) * (-397)) + 169921763 + ((maxMemory2 | 681035267) * 397);
                            int d7 = com.facetec.sdk.gh.b.d();
                            int i210 = ~i209;
                            int i211 = ~d7;
                            int i212 = ~i211;
                            int i213 = ((-1) - (~(-(-(i209 * 713))))) + (((~i210) | i212) * (-712));
                            int i214 = ~(i211 | i210);
                            int i215 = ~((d7 ^ i209) | (d7 & i209));
                            int i216 = -(-(((i215 ^ i214) | (i215 & i214)) * (-712)));
                            int i217 = (i213 & i216) + (i216 | i213) + (((i210 ^ i212) | (i210 & i212)) * 712);
                            int i218 = ((i4 | i217) << 1) - (i217 ^ i4);
                            int i219 = i218 << 13;
                            int i220 = (i218 & (~i219)) | ((~i218) & i219);
                            int i221 = i220 >>> 17;
                            int i222 = (~(i220 & i221)) & (i220 | i221);
                            int i223 = i222 << 5;
                            ((int[]) objArr14[3])[0] = (i222 & (~i223)) | ((~i222) & i223);
                            return objArr14;
                        }
                        fileReader.close();
                        bufferedReader.close();
                    } finally {
                    }
                } else {
                    int i224 = i;
                    int i225 = ((i224 & 51) + (i224 | 51)) % 128;
                    f = i225;
                    i = ((i225 & 3) + (i225 | 3)) % 128;
                }
                str = null;
                int i1472 = -(android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                java.lang.Object[] objArr92 = new java.lang.Object[1];
                g((i1472 & 31) + (i1472 | 31), "\r\u0003\r\"\t\r\u0015\u0013\u0015\u000e\u000f\u0000\u0016\u0010\u0000\u001b\u0015\u001b\u0004\u0011\u001f\n\t!\u0004\t \u001c\u001b\u0000㙍", (byte) (78 - (~(-(android.view.ViewConfiguration.getFadingEdgeLength() >> 16)))), objArr92);
                file = new java.io.File((java.lang.String) objArr92[0]);
                if (file.canRead()) {
                }
                int i1612 = (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                int d42 = com.facetec.sdk.gh.b.d();
                int i1622 = i1612 * 980;
                int i1632 = (((-35208) | i1622) << 1) - (i1622 ^ (-35208));
                int i1642 = ~d42;
                int i1652 = -(-((~((i1642 ^ (-37)) | (i1642 & (-37)))) * 979));
                int i1662 = (i1632 & i1652) + (i1632 | i1652);
                int i1672 = ((i1612 ^ d42) | (i1612 & d42)) * (-979);
                int i1682 = (i1662 & i1672) + (i1672 | i1662);
                int i1692 = -(-(((~((i1612 ^ i1642) | (i1612 & i1642))) | (~(d42 | (-37)))) * 979));
                int i1702 = -(-android.text.TextUtils.getOffsetBefore("", 0));
                java.lang.Object[] objArr112 = new java.lang.Object[1];
                g((i1682 & i1692) + (i1692 | i1682), "\u000e\u0015\u0013\u0015\u0010\r\u0004\u000f\t\u0004\u001b\f!\u0000 \u000e!\u0011\u0004\u0011\u001f\n\u0016\u000b!\u0011\u0004\u0011\u001f\n\u0016\u000b!\u001d\"\u0007", (byte) ((i1702 & 103) + (i1702 | 103)), objArr112);
                file2 = new java.io.File((java.lang.String) objArr112[0]);
                if (file2.canRead()) {
                }
                java.lang.Object[] objArr142 = {null, new int[]{i2}, new int[]{i2}, new int[1]};
                int maxMemory22 = (int) java.lang.Runtime.getRuntime().maxMemory();
                int i2082 = ~maxMemory22;
                int i2092 = (((~(i2082 | (-80467060))) | 8635395 | (~(744231536 | i2082))) * (-397)) + 169921763 + ((maxMemory22 | 681035267) * 397);
                int d72 = com.facetec.sdk.gh.b.d();
                int i2102 = ~i2092;
                int i2112 = ~d72;
                int i2122 = ~i2112;
                int i2132 = ((-1) - (~(-(-(i2092 * 713))))) + (((~i2102) | i2122) * (-712));
                int i2142 = ~(i2112 | i2102);
                int i2152 = ~((d72 ^ i2092) | (d72 & i2092));
                int i2162 = -(-(((i2152 ^ i2142) | (i2152 & i2142)) * (-712)));
                int i2172 = (i2132 & i2162) + (i2162 | i2132) + (((i2102 ^ i2122) | (i2102 & i2122)) * 712);
                int i2182 = ((i4 | i2172) << 1) - (i2172 ^ i4);
                int i2192 = i2182 << 13;
                int i2202 = (i2182 & (~i2192)) | ((~i2182) & i2192);
                int i2212 = i2202 >>> 17;
                int i2222 = (~(i2202 & i2212)) & (i2202 | i2212);
                int i2232 = i2222 << 5;
                ((int[]) objArr142[3])[0] = (i2222 & (~i2232)) | ((~i2222) & i2232);
                return objArr142;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
    }

    private java.lang.String d() throws java.io.IOException {
        java.lang.String e2 = this.b.e(this.f);
        this.f -= e2.length();
        return e2;
    }

    public final com.facetec.sdk.mm c() throws java.io.IOException {
        com.facetec.sdk.mm.b bVar = new com.facetec.sdk.mm.b();
        while (true) {
            java.lang.String d2 = d();
            if (d2.length() != 0) {
                com.facetec.sdk.nd.d.c(bVar, d2);
            } else {
                return bVar.b();
            }
        }
    }

    public final com.facetec.sdk.pz b(long j) throws java.io.IOException {
        if (this.e != 4) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("state: ");
            sb.append(this.e);
            throw new java.lang.IllegalStateException(sb.toString());
        }
        this.e = 5;
        return new com.facetec.sdk.oh.b(j);
    }

    final class e implements com.facetec.sdk.qa {

        /* renamed from: a, reason: collision with root package name */
        private final com.facetec.sdk.pp f3709a;
        private boolean b;
        private long e;

        e(long j) {
            this.f3709a = new com.facetec.sdk.pp(com.facetec.sdk.oh.this.d.d());
            this.e = j;
        }

        @Override // com.facetec.sdk.qa
        public final com.facetec.sdk.qe d() {
            return this.f3709a;
        }

        @Override // com.facetec.sdk.qa
        public final void c(com.facetec.sdk.pk pkVar, long j) throws java.io.IOException {
            if (this.b) {
                throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
            }
            com.facetec.sdk.nh.d(pkVar.e(), 0L, j);
            if (j > this.e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("expected ");
                sb.append(this.e);
                sb.append(" bytes but received ");
                sb.append(j);
                throw new java.net.ProtocolException(sb.toString());
            }
            com.facetec.sdk.oh.this.d.c(pkVar, j);
            this.e -= j;
        }

        @Override // com.facetec.sdk.qa, java.io.Flushable
        public final void flush() throws java.io.IOException {
            if (this.b) {
                return;
            }
            com.facetec.sdk.oh.this.d.flush();
        }

        @Override // com.facetec.sdk.qa, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws java.io.IOException {
            if (this.b) {
                return;
            }
            this.b = true;
            if (this.e > 0) {
                throw new java.net.ProtocolException("unexpected end of stream");
            }
            com.facetec.sdk.oh.a(this.f3709a);
            com.facetec.sdk.oh.this.e = 3;
        }
    }

    final class a implements com.facetec.sdk.qa {
        public static int b;
        public static int d;

        /* renamed from: a, reason: collision with root package name */
        private final com.facetec.sdk.pp f3707a;
        private boolean e;

        a() {
            this.f3707a = new com.facetec.sdk.pp(com.facetec.sdk.oh.this.d.d());
        }

        @Override // com.facetec.sdk.qa
        public final com.facetec.sdk.qe d() {
            return this.f3707a;
        }

        @Override // com.facetec.sdk.qa
        public final void c(com.facetec.sdk.pk pkVar, long j) throws java.io.IOException {
            if (this.e) {
                throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
            }
            if (j == 0) {
                return;
            }
            com.facetec.sdk.oh.this.d.h(j);
            com.facetec.sdk.oh.this.d.c(io.ktor.sse.ServerSentEventKt.END_OF_LINE);
            com.facetec.sdk.oh.this.d.c(pkVar, j);
            com.facetec.sdk.oh.this.d.c(io.ktor.sse.ServerSentEventKt.END_OF_LINE);
        }

        @Override // com.facetec.sdk.qa, java.io.Flushable
        public final void flush() throws java.io.IOException {
            synchronized (this) {
                if (this.e) {
                    return;
                }
                com.facetec.sdk.oh.this.d.flush();
            }
        }

        @Override // com.facetec.sdk.qa, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws java.io.IOException {
            synchronized (this) {
                if (this.e) {
                    return;
                }
                this.e = true;
                com.facetec.sdk.oh.this.d.c("0\r\n\r\n");
                com.facetec.sdk.oh.a(this.f3707a);
                com.facetec.sdk.oh.this.e = 3;
            }
        }

        public static int c() {
            int i = b;
            b = i + 1;
            if (i % 9387697 != 0) {
                return d;
            }
            int myPid = android.os.Process.myPid();
            d = myPid;
            return myPid;
        }
    }

    final class b extends com.facetec.sdk.oh.d {
        private long e;

        b(long j) throws java.io.IOException {
            super(com.facetec.sdk.oh.this, (byte) 0);
            this.e = j;
            if (j == 0) {
                e(true, (java.io.IOException) null);
            }
        }

        @Override // com.facetec.sdk.oh.d, com.facetec.sdk.pz
        public final long b(com.facetec.sdk.pk pkVar, long j) throws java.io.IOException {
            if (j < 0) {
                throw new java.lang.IllegalArgumentException("byteCount < 0: ".concat(java.lang.String.valueOf(j)));
            }
            if (this.f3708a) {
                throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
            }
            long j2 = this.e;
            if (j2 == 0) {
                return -1L;
            }
            long b = super.b(pkVar, java.lang.Math.min(j2, j));
            if (b == -1) {
                java.net.ProtocolException protocolException = new java.net.ProtocolException("unexpected end of stream");
                e(false, (java.io.IOException) protocolException);
                throw protocolException;
            }
            long j3 = this.e - b;
            this.e = j3;
            if (j3 == 0) {
                e(true, (java.io.IOException) null);
            }
            return b;
        }

        @Override // com.facetec.sdk.pz, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws java.io.IOException {
            if (this.f3708a) {
                return;
            }
            if (this.e != 0 && !com.facetec.sdk.nh.b(this, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                e(false, (java.io.IOException) null);
            }
            this.f3708a = true;
        }
    }

    final class c extends com.facetec.sdk.oh.d {
        private final com.facetec.sdk.mv c;
        private boolean d;
        private long e;

        c(com.facetec.sdk.mv mvVar) {
            super(com.facetec.sdk.oh.this, (byte) 0);
            this.e = -1L;
            this.d = true;
            this.c = mvVar;
        }

        @Override // com.facetec.sdk.oh.d, com.facetec.sdk.pz
        public final long b(com.facetec.sdk.pk pkVar, long j) throws java.io.IOException {
            if (j < 0) {
                throw new java.lang.IllegalArgumentException("byteCount < 0: ".concat(java.lang.String.valueOf(j)));
            }
            if (this.f3708a) {
                throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
            }
            if (!this.d) {
                return -1L;
            }
            long j2 = this.e;
            if (j2 == 0 || j2 == -1) {
                if (j2 != -1) {
                    com.facetec.sdk.oh.this.b.m();
                }
                try {
                    this.e = com.facetec.sdk.oh.this.b.l();
                    java.lang.String trim = com.facetec.sdk.oh.this.b.m().trim();
                    if (this.e >= 0 && (trim.isEmpty() || trim.startsWith(";"))) {
                        if (this.e == 0) {
                            this.d = false;
                            com.facetec.sdk.nz.a(com.facetec.sdk.oh.this.f3706a.c(), this.c, com.facetec.sdk.oh.this.c());
                            e(true, (java.io.IOException) null);
                        }
                        if (!this.d) {
                            return -1L;
                        }
                    } else {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("expected chunk size and optional extensions but was \"");
                        sb.append(this.e);
                        sb.append(trim);
                        sb.append("\"");
                        throw new java.net.ProtocolException(sb.toString());
                    }
                } catch (java.lang.NumberFormatException e) {
                    throw new java.net.ProtocolException(e.getMessage());
                }
            }
            long b = super.b(pkVar, java.lang.Math.min(j, this.e));
            if (b == -1) {
                java.net.ProtocolException protocolException = new java.net.ProtocolException("unexpected end of stream");
                e(false, (java.io.IOException) protocolException);
                throw protocolException;
            }
            this.e -= b;
            return b;
        }

        @Override // com.facetec.sdk.pz, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws java.io.IOException {
            if (this.f3708a) {
                return;
            }
            if (this.d && !com.facetec.sdk.nh.b(this, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                e(false, (java.io.IOException) null);
            }
            this.f3708a = true;
        }
    }

    final class i extends com.facetec.sdk.oh.d {
        private boolean e;

        i() {
            super(com.facetec.sdk.oh.this, (byte) 0);
        }

        @Override // com.facetec.sdk.oh.d, com.facetec.sdk.pz
        public final long b(com.facetec.sdk.pk pkVar, long j) throws java.io.IOException {
            if (j < 0) {
                throw new java.lang.IllegalArgumentException("byteCount < 0: ".concat(java.lang.String.valueOf(j)));
            }
            if (this.f3708a) {
                throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
            }
            if (this.e) {
                return -1L;
            }
            long b = super.b(pkVar, j);
            if (b != -1) {
                return b;
            }
            this.e = true;
            e(true, (java.io.IOException) null);
            return -1L;
        }

        @Override // com.facetec.sdk.pz, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws java.io.IOException {
            if (this.f3708a) {
                return;
            }
            if (!this.e) {
                e(false, (java.io.IOException) null);
            }
            this.f3708a = true;
        }
    }

    static void a(com.facetec.sdk.pp ppVar) {
        com.facetec.sdk.qe qeVar = ppVar.b;
        com.facetec.sdk.qe qeVar2 = com.facetec.sdk.qe.c;
        if (qeVar2 == null) {
            throw new java.lang.IllegalArgumentException("delegate == null");
        }
        ppVar.b = qeVar2;
        qeVar.d_();
        qeVar.c_();
    }
}
