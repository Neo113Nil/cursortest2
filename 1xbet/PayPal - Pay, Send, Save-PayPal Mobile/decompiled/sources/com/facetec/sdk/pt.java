package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class pt {
    static final java.util.logging.Logger e = java.util.logging.Logger.getLogger(com.facetec.sdk.pt.class.getName());

    private pt() {
    }

    public static com.facetec.sdk.pr d(com.facetec.sdk.pz pzVar) {
        return new com.facetec.sdk.pw(pzVar);
    }

    public static com.facetec.sdk.pj e(com.facetec.sdk.qa qaVar) {
        return new com.facetec.sdk.px(qaVar);
    }

    public static com.facetec.sdk.qa a(java.net.Socket socket) throws java.io.IOException {
        if (socket == null) {
            throw new java.lang.IllegalArgumentException("socket == null");
        }
        if (socket.getOutputStream() == null) {
            throw new java.io.IOException("socket's output stream == null");
        }
        final com.facetec.sdk.pn b = b(socket);
        final java.io.OutputStream outputStream = socket.getOutputStream();
        if (outputStream == null) {
            throw new java.lang.IllegalArgumentException("out == null");
        }
        final com.facetec.sdk.qa qaVar = new com.facetec.sdk.qa() { // from class: com.facetec.sdk.pt.4
            @Override // com.facetec.sdk.qa
            public final void c(com.facetec.sdk.pk pkVar, long j) throws java.io.IOException {
                com.facetec.sdk.qd.b(pkVar.b, 0L, j);
                while (j > 0) {
                    com.facetec.sdk.qe.this.j();
                    com.facetec.sdk.qc qcVar = pkVar.c;
                    int min = (int) java.lang.Math.min(j, qcVar.f3761a - qcVar.e);
                    outputStream.write(qcVar.d, qcVar.e, min);
                    qcVar.e += min;
                    long j2 = min;
                    j -= j2;
                    pkVar.b -= j2;
                    if (qcVar.e == qcVar.f3761a) {
                        pkVar.c = qcVar.e();
                        com.facetec.sdk.py.b(qcVar);
                    }
                }
            }

            @Override // com.facetec.sdk.qa, java.io.Flushable
            public final void flush() throws java.io.IOException {
                outputStream.flush();
            }

            @Override // com.facetec.sdk.qa, java.io.Closeable, java.lang.AutoCloseable
            public final void close() throws java.io.IOException {
                outputStream.close();
            }

            @Override // com.facetec.sdk.qa
            public final com.facetec.sdk.qe d() {
                return com.facetec.sdk.qe.this;
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("sink(");
                sb.append(outputStream);
                sb.append(")");
                return sb.toString();
            }
        };
        return new com.facetec.sdk.qa() { // from class: com.facetec.sdk.pn.3
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static final byte[] $$c = null;
            private static final int $$d = 0;
            private static int $10;
            private static int $11;

            /* renamed from: a, reason: collision with root package name */
            private static char f3747a;
            private static char d;
            private static char e;
            private static int f;
            private static char g;
            private static int h;
            private static byte[] i;
            private static int j;
            private static short[] k;
            private static int l;

            /* renamed from: o, reason: collision with root package name */
            private static int f3748o;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x0025). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static java.lang.String $$e(byte b2, int i2, byte b3) {
                int i3;
                int i4 = (i2 * 4) + 1;
                int i5 = b3 + 68;
                int i6 = (b2 * 2) + 4;
                byte[] bArr = $$c;
                byte[] bArr2 = new byte[i4];
                if (bArr == null) {
                    i5 = i6;
                    int i7 = i4;
                    i3 = 0;
                    i6++;
                    i5 += -i7;
                    bArr2[i3] = (byte) i5;
                    i3++;
                    if (i3 == i4) {
                        return new java.lang.String(bArr2, 0);
                    }
                    i7 = bArr[i6];
                    i6++;
                    i5 += -i7;
                    bArr2[i3] = (byte) i5;
                    i3++;
                    if (i3 == i4) {
                    }
                } else {
                    i3 = 0;
                    bArr2[i3] = (byte) i5;
                    i3++;
                    if (i3 == i4) {
                    }
                }
            }

            static void init$0() {
                $$a = new byte[]{org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, kotlin.io.encoding.Base64.padSymbol, -78, -87};
                $$b = 98;
            }

            static void init$1() {
                $$c = new byte[]{87, -7, 5, -116};
                $$d = 4;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002e). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void p(short s, short s2, short s3, java.lang.Object[] objArr) {
                int i2;
                int i3 = 101 - s2;
                int i4 = s3 * 2;
                byte[] bArr = $$a;
                int i5 = 4 - (s * 4);
                byte[] bArr2 = new byte[1 - i4];
                if (bArr == null) {
                    int i6 = i3;
                    int i7 = 0;
                    int i8 = i5;
                    int i9 = (-i5) + i6;
                    int i10 = i8 + 1;
                    i2 = i7;
                    i3 = i9;
                    i5 = i10;
                    bArr2[i2] = (byte) i3;
                    if (i2 == 0 - i4) {
                        objArr[0] = new java.lang.String(bArr2, 0);
                        return;
                    }
                    int i11 = i3;
                    i8 = i5;
                    i5 = bArr[i5];
                    i7 = i2 + 1;
                    i6 = i11;
                    int i92 = (-i5) + i6;
                    int i102 = i8 + 1;
                    i2 = i7;
                    i3 = i92;
                    i5 = i102;
                    bArr2[i2] = (byte) i3;
                    if (i2 == 0 - i4) {
                    }
                } else {
                    i2 = 0;
                    bArr2[i2] = (byte) i3;
                    if (i2 == 0 - i4) {
                    }
                }
            }

            private static void m(java.lang.String str, int i2, java.lang.Object[] objArr) {
                char[] charArray = str != null ? str.toCharArray() : str;
                com.facetec.sdk.ho hoVar = new com.facetec.sdk.ho();
                char[] cArr = new char[charArray.length];
                hoVar.b = 0;
                char[] cArr2 = new char[2];
                while (hoVar.b < charArray.length) {
                    cArr2[0] = charArray[hoVar.b];
                    cArr2[1] = charArray[hoVar.b + 1];
                    $11 = ($10 + 117) % 128;
                    int i3 = 58224;
                    for (int i4 = 0; i4 < 16; i4++) {
                        $10 = ($11 + 83) % 128;
                        char c = cArr2[1];
                        char c2 = cArr2[0];
                        try {
                            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf(((c2 << 4) + ((char) (d ^ 2174069992062419062L))) ^ r15), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(g)};
                            int i5 = c2 + i3;
                            java.lang.Object d2 = com.facetec.sdk.al.d(1497828241);
                            if (d2 == null) {
                                d2 = com.facetec.sdk.al.c((char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 1), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 22, -22515351, false, lib.android.paypal.com.magnessdk.g.n2, new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                            }
                            char charValue = ((java.lang.Character) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).charValue();
                            cArr2[1] = charValue;
                            java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(cArr2[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (e ^ 2174069992062419062L))) ^ r15), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(f3747a)};
                            int i6 = charValue + i3;
                            java.lang.Object d3 = com.facetec.sdk.al.d(1497828241);
                            if (d3 == null) {
                                d3 = com.facetec.sdk.al.c((char) ('0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 211, 23 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), -22515351, false, lib.android.paypal.com.magnessdk.g.n2, new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                            }
                            cArr2[0] = ((java.lang.Character) ((java.lang.reflect.Method) d3).invoke(null, objArr3)).charValue();
                            i3 -= 40503;
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr[hoVar.b] = cArr2[0];
                    cArr[hoVar.b + 1] = cArr2[1];
                    java.lang.Object[] objArr4 = {hoVar, hoVar};
                    java.lang.Object d4 = com.facetec.sdk.al.d(-2113314280);
                    if (d4 == null) {
                        char edgeSlop = (char) (31541 - (android.view.ViewConfiguration.getEdgeSlop() >> 16));
                        int resolveOpacity = android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                        int combineMeasuredStates = android.view.View.combineMeasuredStates(0, 0);
                        byte b2 = (byte) ($$d - 4);
                        d4 = com.facetec.sdk.al.c(edgeSlop, 1913 - resolveOpacity, combineMeasuredStates + 23, 635836640, false, $$e(b2, b2, (byte) (b2 | 44)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                    }
                    ((java.lang.reflect.Method) d4).invoke(null, objArr4);
                }
                objArr[0] = new java.lang.String(cArr, 0, i2);
            }

            @Override // com.facetec.sdk.qa
            public final void c(com.facetec.sdk.pk pkVar, long j2) throws java.io.IOException {
                com.facetec.sdk.qc qcVar;
                com.facetec.sdk.qd.b(pkVar.b, 0L, j2);
                while (true) {
                    long j3 = 0;
                    if (j2 <= 0) {
                        return;
                    }
                    int i2 = f3748o + 53;
                    l = i2 % 128;
                    if (i2 % 2 != 0) {
                        qcVar = pkVar.c;
                        j3 = 1;
                    } else {
                        qcVar = pkVar.c;
                    }
                    while (true) {
                        if (j3 >= 65536) {
                            break;
                        }
                        l = (f3748o + 75) % 128;
                        j3 += qcVar.f3761a - qcVar.e;
                        if (j3 < j2) {
                            qcVar = qcVar.j;
                        } else {
                            int i3 = l + 95;
                            f3748o = i3 % 128;
                            if (i3 % 2 == 0) {
                                int i4 = 77 / 0;
                            }
                            j3 = j2;
                        }
                    }
                    com.facetec.sdk.pn.this.b();
                    try {
                        try {
                            qaVar.c(pkVar, j3);
                            j2 -= j3;
                            com.facetec.sdk.pn.this.e(true);
                        } catch (java.io.IOException e2) {
                            throw com.facetec.sdk.pn.this.d(e2);
                        }
                    } catch (java.lang.Throwable th) {
                        com.facetec.sdk.pn.this.e(false);
                        throw th;
                    }
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:32:0x0175  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void n(int i2, short s, int i3, int i4, byte b2, java.lang.Object[] objArr) {
                int i5;
                long j2;
                char c;
                com.facetec.sdk.hm hmVar = new com.facetec.sdk.hm();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i4), java.lang.Integer.valueOf(j)};
                    java.lang.Object d2 = com.facetec.sdk.al.d(-852176267);
                    if (d2 == null) {
                        char threadPriority = (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6);
                        int green = android.graphics.Color.green(0);
                        int blue = android.graphics.Color.blue(0);
                        byte b3 = (byte) ($$d - 4);
                        d2 = com.facetec.sdk.al.c(threadPriority, 2222 - green, 24 - blue, 1792780429, false, $$e(b3, b3, b3), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                    }
                    int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).intValue();
                    if (intValue == -1) {
                        i5 = 1;
                    } else {
                        $10 = ($11 + 13) % 128;
                        i5 = 0;
                    }
                    if (i5 != 0) {
                        byte[] bArr = i;
                        if (bArr != null) {
                            int length = bArr.length;
                            byte[] bArr2 = new byte[length];
                            for (int i6 = 0; i6 < length; i6++) {
                                $10 = ($11 + 101) % 128;
                                java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(bArr[i6])};
                                java.lang.Object d3 = com.facetec.sdk.al.d(-1856077218);
                                if (d3 == null) {
                                    d3 = com.facetec.sdk.al.c((char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), 94 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), android.os.Process.getGidForName("") + 24, 917633190, false, "E", new java.lang.Class[]{java.lang.Integer.TYPE});
                                }
                                bArr2[i6] = ((java.lang.Byte) ((java.lang.reflect.Method) d3).invoke(null, objArr3)).byteValue();
                            }
                            bArr = bArr2;
                        }
                        if (bArr == null) {
                            j2 = 1009991189275744878L;
                            intValue = (short) (((short) (k[i3 + ((int) (h ^ 1009991189275744878L))] ^ 1009991189275744878L)) + ((int) (j ^ 1009991189275744878L)));
                            if (intValue > 0) {
                                hmVar.b = ((i3 + intValue) - 2) + ((int) (h ^ j2)) + i5;
                                java.lang.Object[] objArr4 = {hmVar, java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(f), sb};
                                java.lang.Object d4 = com.facetec.sdk.al.d(-1371371196);
                                if (d4 == null) {
                                    char packedPositionChild = (char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L));
                                    int bitsPerPixel = android.graphics.ImageFormat.getBitsPerPixel(0);
                                    int packedPositionType = android.widget.ExpandableListView.getPackedPositionType(0L);
                                    byte b4 = (byte) ($$d - 4);
                                    d4 = com.facetec.sdk.al.c(packedPositionChild, 884 - bitsPerPixel, 32 - packedPositionType, 162395068, false, $$e(b4, b4, (byte) (b4 + 3)), new java.lang.Class[]{java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class});
                                }
                                ((java.lang.StringBuilder) ((java.lang.reflect.Method) d4).invoke(null, objArr4)).append(hmVar.c);
                                hmVar.d = hmVar.c;
                                byte[] bArr3 = i;
                                if (bArr3 != null) {
                                    int length2 = bArr3.length;
                                    byte[] bArr4 = new byte[length2];
                                    loop1: while (true) {
                                        int i7 = 0;
                                        while (i7 < length2) {
                                            int i8 = $11 + 1;
                                            $10 = i8 % 128;
                                            if (i8 % 2 != 0) {
                                                break;
                                            }
                                            bArr4[i7] = (byte) (bArr3[i7] ^ 1009991189275744878L);
                                            i7++;
                                        }
                                        bArr4[i7] = (byte) (bArr3[i7] | 1009991189275744878L);
                                    }
                                    bArr3 = bArr4;
                                }
                                boolean z = bArr3 != null;
                                hmVar.e = 1;
                                while (hmVar.e < intValue) {
                                    if (z) {
                                        int i9 = $10 + 101;
                                        $11 = i9 % 128;
                                        if (i9 % 2 == 0) {
                                            byte[] bArr5 = i;
                                            hmVar.b = hmVar.b;
                                            c = (char) (hmVar.d << (((byte) (((byte) (bArr5[r8] & 1009991189275744878L)) / s)) ^ b2));
                                        } else {
                                            byte[] bArr6 = i;
                                            hmVar.b = hmVar.b - 1;
                                            c = (char) (hmVar.d + (((byte) (((byte) (bArr6[r8] ^ 1009991189275744878L)) + s)) ^ b2));
                                        }
                                        hmVar.c = c;
                                    } else {
                                        short[] sArr = k;
                                        hmVar.b = hmVar.b - 1;
                                        hmVar.c = (char) (hmVar.d + (((short) (((short) (sArr[r8] ^ 1009991189275744878L)) + s)) ^ b2));
                                    }
                                    sb.append(hmVar.c);
                                    hmVar.d = hmVar.c;
                                    hmVar.e++;
                                }
                            }
                            objArr[0] = sb.toString();
                        }
                        byte[] bArr7 = i;
                        java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(h)};
                        java.lang.Object d5 = com.facetec.sdk.al.d(-852176267);
                        if (d5 == null) {
                            char normalizeMetaState = (char) android.view.KeyEvent.normalizeMetaState(0);
                            long zoomControlsTimeout = android.view.ViewConfiguration.getZoomControlsTimeout();
                            int gidForName = android.os.Process.getGidForName("");
                            byte b5 = (byte) ($$d - 4);
                            d5 = com.facetec.sdk.al.c(normalizeMetaState, 2223 - (zoomControlsTimeout > 0L ? 1 : (zoomControlsTimeout == 0L ? 0 : -1)), 23 - gidForName, 1792780429, false, $$e(b5, b5, b5), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                        }
                        intValue = (byte) (((byte) (bArr7[((java.lang.Integer) ((java.lang.reflect.Method) d5).invoke(null, objArr5)).intValue()] ^ 1009991189275744878L)) + ((int) (j ^ 1009991189275744878L)));
                        $11 = ($10 + 53) % 128;
                    }
                    j2 = 1009991189275744878L;
                    if (intValue > 0) {
                    }
                    objArr[0] = sb.toString();
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }

            @Override // com.facetec.sdk.qa, java.io.Flushable
            public void flush() throws java.io.IOException {
                l = (f3748o + 77) % 128;
                com.facetec.sdk.pn.this.b();
                try {
                    try {
                        qaVar.flush();
                        com.facetec.sdk.pn.this.e(true);
                        f3748o = (l + 67) % 128;
                    } catch (java.io.IOException e2) {
                        throw com.facetec.sdk.pn.this.d(e2);
                    }
                } catch (java.lang.Throwable th) {
                    com.facetec.sdk.pn.this.e(false);
                    throw th;
                }
            }

            @Override // com.facetec.sdk.qa, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws java.io.IOException {
                com.facetec.sdk.pn pnVar;
                int i2 = f3748o + 65;
                l = i2 % 128;
                boolean z = false;
                try {
                    try {
                        if (i2 % 2 != 0) {
                            com.facetec.sdk.pn.this.b();
                            qaVar.close();
                            pnVar = com.facetec.sdk.pn.this;
                        } else {
                            com.facetec.sdk.pn.this.b();
                            qaVar.close();
                            pnVar = com.facetec.sdk.pn.this;
                            z = true;
                        }
                        pnVar.e(z);
                        f3748o = (l + 115) % 128;
                    } catch (java.io.IOException e2) {
                        throw com.facetec.sdk.pn.this.d(e2);
                    }
                } catch (java.lang.Throwable th) {
                    com.facetec.sdk.pn.this.e(z);
                    throw th;
                }
            }

            @Override // com.facetec.sdk.qa
            public final com.facetec.sdk.qe d() {
                int i2 = f3748o + 61;
                l = i2 % 128;
                if (i2 % 2 == 0) {
                    return com.facetec.sdk.pn.this;
                }
                java.lang.Object obj = null;
                obj.hashCode();
                throw null;
            }

            public java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("AsyncTimeout.sink(");
                sb.append(qaVar);
                sb.append(")");
                java.lang.String obj = sb.toString();
                l = (f3748o + 11) % 128;
                return obj;
            }

            static {
                init$1();
                $10 = 0;
                $11 = 1;
                init$0();
                l = 0;
                f3748o = 1;
                e = (char) 26150;
                f3747a = (char) 31504;
                d = (char) 57934;
                g = (char) 22271;
                h = -484998804;
                j = -1358030269;
                f = 646606696;
                i = new byte[]{-119, 82, 82, 69, 89, 32, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 87, 47, 92, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, -17, -110, 44, 69, 85, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, 46, 16, com.visa.cbp.getEncExpo.registerForActivityResult, 102, 64, 118, 78, 105, 70, 101, com.google.common.base.Ascii.FF, -120, 120, 123, 118, 71, Byte.MAX_VALUE, 70, 32, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 74, 70, 120, 58, -78, com.visa.cbp.getEncExpo.IResultReceiver, 73, 33, -121, 102, 64, 118, 62, -121, 102, 64, 118, 62, -117, -123, 85, -40, 109, -115, 111, -123, 82, -34, 111, -97, -107, 94, -84, -117, 107, 66, -124, -57, -82, com.visa.cbp.getEncExpo.onUnminimized, -35, -62, -73, -84, 9, -35, -40, com.visa.cbp.getEncExpo.onUnminimized, -35, -62, -41, -116, com.google.common.base.Ascii.EM, -58, -55, -60, -43, -51, -44, -76, 106, 78, -80, -122, com.visa.cbp.getEncExpo.IResultReceiver2, -106, -72, 64, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -115, -113, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, -73, -89, -75, -69, -86, 77, 17, -70, -77, -66, 113, -24, -66, -69, 105, -115, 109, -110, -99, 100, 122, 72, -87, -105, 99, -101, 80, -93, -123, 123, com.visa.cbp.getEncExpo.registerForActivityResult, -74, 9, -78, -84, -118, -71, -88, -43, -88, Byte.MIN_VALUE, 44, -23, -5, -25, com.google.common.base.Ascii.NAK, -22, -25, -71, 40, -90, 44, com.google.common.base.Ascii.SYN, -12, -19, com.google.common.base.Ascii.DC4, -8, -92, 86, -20, -75, 45, -24, -18, -28, -31, -52, -119, -78, 99, 98, 97, 78, 102, 113, 43, -67, 126, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 85, -119, 126, 118, 102, 116, 122, 109, -75, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, com.google.common.base.Ascii.FF, 60, 10, 48, 35, -114, 124, -104, -105, -105, -107, 99, -104, -112, -104, -127, 99, -109, -98, -41, -93, -70, -11, -87, -92, -42, -82, -82, -86, -47, -125, -72, com.google.common.base.Ascii.NAK, -87, -92, -36, -87, -82, -93, -104, -27, -46, -43, -48, -95, -39, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy};
            }

            /* JADX WARN: Code restructure failed: missing block: B:257:0x1545, code lost:
            
                r10.close();
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:273:0x1721 A[Catch: Exception -> 0x1703, IOException -> 0x1a2f, all -> 0x1b48, TRY_ENTER, TRY_LEAVE, TryCatch #12 {IOException -> 0x1a2f, blocks: (B:250:0x145d, B:267:0x16b4, B:309:0x16c5, B:273:0x1721), top: B:249:0x145d }] */
            /* JADX WARN: Removed duplicated region for block: B:277:0x178d A[Catch: IOException -> 0x19ac, all -> 0x1b48, TryCatch #17 {IOException -> 0x19ac, blocks: (B:269:0x16b7, B:271:0x1709, B:274:0x1761, B:275:0x1772, B:277:0x178d, B:279:0x17a8), top: B:268:0x16b7 }] */
            /* JADX WARN: Removed duplicated region for block: B:308:0x16c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:406:0x1a98 A[Catch: Exception -> 0x1ab3, all -> 0x1b48, IOException -> 0x1b55, TryCatch #15 {Exception -> 0x1ab3, blocks: (B:347:0x1a2e, B:387:0x1a50, B:389:0x1a61, B:390:0x1a62, B:392:0x1a64, B:394:0x1a75, B:395:0x1a76, B:404:0x1a92, B:406:0x1a98, B:407:0x1a99, B:418:0x1a9b, B:420:0x1aab, B:421:0x1aac), top: B:225:0x1262 }] */
            /* JADX WARN: Removed duplicated region for block: B:407:0x1a99 A[Catch: Exception -> 0x1ab3, all -> 0x1b48, IOException -> 0x1b55, TryCatch #15 {Exception -> 0x1ab3, blocks: (B:347:0x1a2e, B:387:0x1a50, B:389:0x1a61, B:390:0x1a62, B:392:0x1a64, B:394:0x1a75, B:395:0x1a76, B:404:0x1a92, B:406:0x1a98, B:407:0x1a99, B:418:0x1a9b, B:420:0x1aab, B:421:0x1aac), top: B:225:0x1262 }] */
            /* JADX WARN: Removed duplicated region for block: B:87:0x1be5 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:88:0x1be6  */
            /* JADX WARN: Type inference failed for: r16v27 */
            /* JADX WARN: Type inference failed for: r16v28 */
            /* JADX WARN: Type inference failed for: r16v29 */
            /* JADX WARN: Type inference failed for: r16v30 */
            /* JADX WARN: Type inference failed for: r16v31 */
            /* JADX WARN: Type inference failed for: r16v32 */
            /* JADX WARN: Type inference failed for: r16v42 */
            /* JADX WARN: Type inference failed for: r16v52 */
            /* JADX WARN: Type inference failed for: r16v54 */
            /* JADX WARN: Type inference failed for: r16v55 */
            /* JADX WARN: Type inference failed for: r22v10 */
            /* JADX WARN: Type inference failed for: r22v16, types: [int] */
            /* JADX WARN: Type inference failed for: r22v26 */
            /* JADX WARN: Type inference failed for: r22v38 */
            /* JADX WARN: Type inference failed for: r22v6 */
            /* JADX WARN: Type inference failed for: r22v7 */
            /* JADX WARN: Type inference failed for: r22v8 */
            /* JADX WARN: Type inference failed for: r22v9 */
            /* JADX WARN: Type inference failed for: r2v433, types: [java.lang.reflect.Method] */
            /* JADX WARN: Type inference failed for: r5v451, types: [long] */
            /* JADX WARN: Type inference failed for: r5v452 */
            /* JADX WARN: Type inference failed for: r5v453 */
            /* JADX WARN: Type inference failed for: r5v455, types: [java.lang.Object[]] */
            /* JADX WARN: Type inference failed for: r7v174 */
            /* JADX WARN: Type inference failed for: r7v175 */
            /* JADX WARN: Type inference failed for: r7v176 */
            /* JADX WARN: Type inference failed for: r7v192, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r7v501 */
            /* JADX WARN: Type inference failed for: r7v502 */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public static java.lang.Object[] a(android.content.Context context, int i2, int i3, int i4) {
                int i5;
                int i6;
                int i7;
                java.lang.Object[] objArr;
                char c;
                int i8;
                char c2;
                java.lang.Object[] objArr2;
                long j2;
                java.lang.Object[] objArr3;
                int i9;
                int i10;
                java.lang.Object[] objArr4;
                char c3;
                java.lang.Object[] objArr5;
                java.lang.Object[] objArr6;
                char c4;
                int length;
                java.lang.Object obj;
                java.util.Iterator it;
                java.lang.Object obj2;
                java.lang.String str;
                int i11;
                java.lang.String str2;
                java.lang.String[] split;
                int length2;
                int i12;
                ?? r16;
                int i13;
                int i14;
                int i15;
                ?? r22;
                int i16;
                int i17;
                java.lang.String str3;
                java.lang.Process exec;
                java.lang.Object newInstance;
                java.lang.Throwable th;
                java.lang.Throwable cause;
                java.lang.Object newInstance2;
                java.lang.Object obj3;
                java.lang.String str4;
                java.lang.String str5;
                java.lang.String str6;
                java.lang.InterruptedException interruptedException;
                java.lang.Throwable th2;
                ?? nanoTime;
                ?? r7;
                java.lang.Object obj4;
                java.lang.Object d2;
                java.lang.Object d3;
                int length3;
                int i18;
                java.lang.String[] strArr;
                java.lang.Object obj5;
                java.lang.String str7;
                java.lang.String str8;
                int i19;
                java.lang.String str9;
                int i20;
                java.lang.String str10;
                java.lang.String str11;
                int i21;
                java.lang.Object[] objArr7;
                int i22;
                long j3;
                java.lang.Object[] objArr8;
                int i23;
                int i24;
                int i25;
                java.lang.Object[] objArr9;
                int i26;
                java.lang.Object[] objArr10;
                int i27;
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                m("年ꄥ\uf5ba﮽ﾔ胻\uf5ef橝쾥姭\uec5b㠱仵塬\ue6bc᳀չꄧ\ue827笗鐉嵶\u2069ǔ\ue05e룮眄萯\udef2卮\uea5d\uf831댨犈", 33 - (~(-(-android.graphics.Color.red(0)))), objArr11);
                java.lang.String str12 = (java.lang.String) objArr11[0];
                float complexToFraction = android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f);
                int doubleTapTimeout = android.view.ViewConfiguration.getDoubleTapTimeout() >> 16;
                short s = (short) (((doubleTapTimeout | 5) << 1) - (doubleTapTimeout ^ 5));
                int i28 = -(-(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                int packedPositionChild = android.widget.ExpandableListView.getPackedPositionChild(0L);
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                byte maxKeyCode = (byte) (android.view.KeyEvent.getMaxKeyCode() >> 16);
                n(1987808094 + (complexToFraction > 0.0f ? 1 : (complexToFraction == 0.0f ? 0 : -1)), s, ((-1276746400) ^ i28) + ((i28 & (-1276746400)) << 1), packedPositionChild - 45, maxKeyCode, objArr12);
                java.lang.String str13 = (java.lang.String) objArr12[0];
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                n(1987808099 - (~(-(-android.view.View.MeasureSpec.makeMeasureSpec(0, 0)))), (short) (android.view.ViewConfiguration.getEdgeSlop() >> 16), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) - 1276746373, (-46) - android.widget.ExpandableListView.getPackedPositionType(0L), (byte) android.graphics.Color.red(0), objArr13);
                java.lang.String str14 = (java.lang.String) objArr13[0];
                try {
                    if (context == null) {
                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                        m("籗ﻐ㽱ﮙ硧佉ꐷ⇴\uea5d\uf831댨犈", android.text.TextUtils.indexOf("", "", 0, 0) + 12, objArr14);
                        java.lang.Object[] objArr15 = {(java.lang.String) objArr14[0]};
                        java.lang.Object d4 = com.facetec.sdk.al.d(2084539986);
                        if (d4 == null) {
                            char resolveSizeAndState = (char) (6935 - android.view.View.resolveSizeAndState(0, 0, 0));
                            int pressedStateDuration = android.view.ViewConfiguration.getPressedStateDuration();
                            long globalActionKeyTimeout = android.view.ViewConfiguration.getGlobalActionKeyTimeout();
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            java.lang.Object[] objArr16 = new java.lang.Object[1];
                            p(b2, b3, b3, objArr16);
                            d4 = com.facetec.sdk.al.c(resolveSizeAndState, 2389 - (pressedStateDuration >> 16), 24 - (globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1)), -607062870, false, (java.lang.String) objArr16[0], new java.lang.Class[]{java.lang.String.class});
                        }
                        long longValue = ((java.lang.Long) ((java.lang.reflect.Method) d4).invoke(null, objArr15)).longValue();
                        long j4 = 154158595;
                        long j5 = 988;
                        long maxMemory = (int) java.lang.Runtime.getRuntime().maxMemory();
                        long j6 = -1;
                        long j7 = ((j4 ^ j6) | longValue) ^ j6;
                        long j8 = longValue ^ j6;
                        long j9 = maxMemory ^ j6;
                        long j10 = ((-1975) * j4) + (com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.TransferFrameEnd * longValue) + ((maxMemory | j7) * j5) + ((-1976) * (((j8 | j4) ^ j6) | ((j9 | j4) ^ j6))) + (j5 * (((j9 | longValue) ^ j6) | j7 | ((j8 | maxMemory) ^ j6))) + 817990747;
                        int i29 = (int) java.lang.Runtime.getRuntime().totalMemory();
                        int i30 = ((int) (j10 >> 32)) & ((((((~((~i29) | (-115161937))) | 114104912) * 446) + 384374654) + (((~(i29 | (-1057025))) | 1207959562) * 446)) - 648816800);
                        int i31 = ~i2;
                        int i32 = ((int) j10) & ((((((~((-554728405) | i31)) | 537940308) | (~((-1991954815) | i31))) * 464) - 1982233627) + (((-16788097) | i2) * (-464)) + (((~((-1991954815) | i2)) | 537940308) * 464));
                        if (((i32 ^ i30) | (i32 & i30)) != 0) {
                            objArr7 = new java.lang.Object[]{null, new int[]{(i2 & (-51)) | (i31 & 50)}, new int[]{i2}, new int[1], null};
                            int i33 = ((((~((-45914876) | i31)) | 2097906) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) - 2044848283) + ((~((-2097907) | i2)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + (((~((-274950131) | i31)) | 272852224 | (~((-43816970) | i2))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE);
                            int d5 = com.facetec.sdk.gj.a.d();
                            int i34 = i33 * 971;
                            int i35 = ((i34 | (-31024)) << 1) - (i34 ^ (-31024));
                            int i36 = ~i33;
                            int i37 = ~((i36 ^ 16) | (i36 & 16));
                            int i38 = ~((~d5) | i33);
                            int i39 = ((i37 & i38) | (i37 ^ i38)) * (-970);
                            int i40 = (i35 ^ i39) + ((i35 & i39) << 1) + ((~((i33 ^ (-17)) | (i33 & (-17)))) * 1940);
                            int i41 = -(-(((~(i36 | (-17))) | i38) * 970));
                            int i42 = i4 + (i40 & i41) + (i41 | i40);
                            int i43 = i42 << 13;
                            int i44 = (i42 & (~i43)) | ((~i42) & i43);
                            int i45 = i44 ^ (i44 >>> 17);
                            int i46 = i45 << 5;
                            int[] iArr = (int[]) objArr7[3];
                            int i47 = (~(i45 & i46)) & (i45 | i46);
                            i22 = 0;
                            iArr[0] = i47;
                        } else {
                            objArr7 = new java.lang.Object[]{null, new int[]{i2}, new int[]{i2}, new int[1], null};
                            int nextInt = new java.util.Random().nextInt(1887944876);
                            int i48 = ~nextInt;
                            int i49 = ~(339806339 | i48);
                            int i50 = (((~((-18941334) | i48)) | 65665) * (-1188)) + 1329835771 + (((~(nextInt | 18941333)) | 65665 | i49) * 594) + (((~(18941333 | i48)) | (-358682008) | i49) * 594);
                            int i51 = -(-((i50 << 1) - i50));
                            int i52 = (i4 & i51) + (i51 | i4);
                            int i53 = i52 << 13;
                            int i54 = ((~i53) & i52) | ((~i52) & i53);
                            int i55 = i54 ^ (i54 >>> 17);
                            int i56 = i55 << 5;
                            int[] iArr2 = (int[]) objArr7[3];
                            int i57 = (i55 & (~i56)) | ((~i55) & i56);
                            i22 = 0;
                            iArr2[0] = i57;
                        }
                        if (((int[]) objArr7[1])[i22] != i2) {
                            return objArr7;
                        }
                        char mirror = android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                        int i58 = -android.text.TextUtils.getOffsetAfter("", i22);
                        int i59 = -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i22);
                        int i60 = -(android.view.ViewConfiguration.getPressedStateDuration() >> 16);
                        java.lang.Object[] objArr17 = new java.lang.Object[1];
                        n(mirror + 35577, (short) ((i58 & (-58)) + (i58 | (-58))), ((-1276746499) & i59) + (i59 | (-1276746499)), (i60 ^ (-46)) + ((i60 & (-46)) << 1), (byte) android.graphics.Color.blue(i22), objArr17);
                        java.lang.Object[] objArr18 = {(java.lang.String) objArr17[0]};
                        java.lang.Object d6 = com.facetec.sdk.al.d(2084539986);
                        if (d6 == null) {
                            char green = (char) (android.graphics.Color.green(0) + 6935);
                            int defaultSize = android.view.View.getDefaultSize(0, 0);
                            int touchSlop = android.view.ViewConfiguration.getTouchSlop();
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            java.lang.Object[] objArr19 = new java.lang.Object[1];
                            p(b4, b5, b5, objArr19);
                            d6 = com.facetec.sdk.al.c(green, 2389 - defaultSize, 23 - (touchSlop >> 8), -607062870, false, (java.lang.String) objArr19[0], new java.lang.Class[]{java.lang.String.class});
                        }
                        long longValue2 = ((java.lang.Long) ((java.lang.reflect.Method) d6).invoke(null, objArr18)).longValue();
                        long j11 = 225608643;
                        long j12 = ((longValue2 ^ j6) | j11) ^ j6;
                        long j13 = i2;
                        long j14 = (j11 | j13) ^ j6;
                        long j15 = 658;
                        long j16 = (659 * j11) + ((-657) * longValue2) + ((((longValue2 | (j11 ^ j6)) ^ j6) | j12 | j14) * (-658)) + (j15 * j12) + (j15 * (j12 | j14)) + 746540699;
                        int elapsedRealtime = (int) android.os.SystemClock.elapsedRealtime();
                        int i61 = ~elapsedRealtime;
                        int i62 = ((int) (j16 >> 32)) & ((((((~(1750916058 | elapsedRealtime)) | (~((-1106824827) | i61))) | r8) * (-516)) - 201367510) + (((~(elapsedRealtime | 1778180090)) | (~(i61 | (-671355265)))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR) + ((671355264 | (~((-1750916059) | i61))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR));
                        int i63 = ((int) j16) & ((((((~((-553717921) | i31)) | (~((-134743298) | i31))) * (-184)) + 1019428157) + ((((~((-1638357755) | i31)) | 1084639834) | (~((-1219383132) | i31))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE)) - 166921112);
                        if (((i62 ^ i63) | (i62 & i63)) != 0) {
                            objArr8 = new java.lang.Object[]{null, new int[]{(~(i2 & 60)) & (i2 | 60)}, new int[]{i2}, new int[]{(r4 & (~r9)) | r10}, null};
                            int i64 = (((~((-1053776661) | i31)) | (-732911655)) * (-602)) + 848874939 + (((~((-1053776661) | i2)) | 339739408 | (~((-18874403) | i31))) * (-301)) + ((~((-732911655) | i31)) * 301) + 16;
                            j3 = j13;
                            int i65 = (i4 ^ i64) + ((i64 & i4) << 1);
                            int i66 = i65 << 13;
                            int i67 = ((~i66) & i65) | ((~i65) & i66);
                            int i68 = i67 >>> 17;
                            int i69 = (i67 & (~i68)) | ((~i67) & i68);
                            int i70 = i69 << 5;
                            int i71 = (~i69) & i70;
                            i23 = 0;
                        } else {
                            j3 = j13;
                            objArr8 = new java.lang.Object[]{null, new int[]{i2}, new int[]{i2}, new int[1], null};
                            int nextInt2 = new java.util.Random().nextInt();
                            int i72 = ~nextInt2;
                            int i73 = (((~(680656570 | i72)) | (-1001652155)) * 98) + 135649195 + (((~(i72 | (-1001521577))) | 680656570 | (~(1001521576 | nextInt2))) * (-49)) + (((~(nextInt2 | 680656570)) | 130578) * 49);
                            int i74 = (i4 ^ i73) + ((i4 & i73) << 1);
                            int i75 = i74 << 13;
                            int i76 = (i74 & (~i75)) | ((~i74) & i75);
                            int i77 = i76 >>> 17;
                            int i78 = (i76 & (~i77)) | ((~i76) & i77);
                            i23 = 0;
                            ((int[]) objArr8[3])[0] = i78 ^ (i78 << 5);
                        }
                        if (((int[]) objArr8[1])[i23] != i2) {
                            return objArr8;
                        }
                        int indexOf = android.text.TextUtils.indexOf("", "", i23);
                        int i79 = indexOf * lib.android.paypal.com.magnessdk.g.e;
                        int i80 = ((1584021039 | i79) << 1) - (i79 ^ 1584021039);
                        int i81 = ~(i2 | (-1987808042));
                        int i82 = (i31 ^ indexOf) | (i31 & indexOf);
                        int i83 = ~((i82 & 1987808041) | (1987808041 ^ i82));
                        int i84 = -(-(((i81 & i83) | (i81 ^ i83)) * (-406)));
                        int i85 = (i80 & i84) + (i84 | i80);
                        int i86 = ((-1987808042) & i31) | (i31 ^ (-1987808042));
                        int i87 = -(-((~((i86 & indexOf) | (i86 ^ indexOf))) * (-406)));
                        int i88 = ~((~indexOf) | i2);
                        int i89 = ~((1987808041 & i31) | (1987808041 ^ i31));
                        int i90 = -(-(((i88 ^ i89) | (i88 & i89)) * 406));
                        int i91 = -(android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        int indexOf2 = android.text.TextUtils.indexOf("", "", 0);
                        int i92 = -(android.view.ViewConfiguration.getDoubleTapTimeout() >> 16);
                        java.lang.Object[] objArr20 = new java.lang.Object[1];
                        n((((i85 ^ i87) + ((i87 & i85) << 1)) - (~i90)) - 1, (short) ((i91 & (-26)) + (i91 | (-26))), (((-1276746478) | indexOf2) << 1) - ((-1276746478) ^ indexOf2), ((i92 | (-46)) << 1) - (i92 ^ (-46)), (byte) android.view.KeyEvent.normalizeMetaState(0), objArr20);
                        java.lang.Object[] objArr21 = {(java.lang.String) objArr20[0]};
                        java.lang.Object d7 = com.facetec.sdk.al.d(1873189073);
                        if (d7 == null) {
                            char touchSlop2 = (char) (6935 - (android.view.ViewConfiguration.getTouchSlop() >> 8));
                            int resolveOpacity = android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                            int myPid = android.os.Process.myPid();
                            byte b6 = (byte) 0;
                            byte b7 = (byte) (b6 + 1);
                            java.lang.Object[] objArr22 = new java.lang.Object[1];
                            p(b6, b7, (byte) (b7 - 1), objArr22);
                            d7 = com.facetec.sdk.al.c(touchSlop2, resolveOpacity + 2389, 23 - (myPid >> 22), -934682071, false, (java.lang.String) objArr22[0], new java.lang.Class[]{java.lang.String.class});
                        }
                        long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) d7).invoke(null, objArr21)).longValue();
                        long j17 = 904211076;
                        long j18 = j3;
                        long j19 = j17 ^ j6;
                        long j20 = longValue3 ^ j6;
                        long elapsedCpuTime = (int) android.os.Process.getElapsedCpuTime();
                        long j21 = 490;
                        long j22 = (491 * j17) + ((-489) * longValue3) + ((j19 | j20 | (elapsedCpuTime ^ j6)) * (-490)) + ((((j20 | j17) ^ j6) | ((j20 | elapsedCpuTime) ^ j6)) * j21) + (j21 * j19) + 32868567;
                        int uptimeMillis = (int) android.os.SystemClock.uptimeMillis();
                        int i93 = ~uptimeMillis;
                        int elapsedRealtime2 = (int) android.os.SystemClock.elapsedRealtime();
                        if (((((int) (j22 >> 32)) & ((((~(uptimeMillis | (-264603224))) | (~((-1613387777) | i93)) | 176161365) * (-68)) + 2010674578 + ((~((-88441859) | i93)) * (-68)) + (((~(i93 | 264603223)) | (-1701829635)) * 68))) | ((((~((-33554443) | elapsedRealtime2)) * (-301)) + 1067749924 + (((~(1377960351 | elapsedRealtime2)) | (~((~elapsedRealtime2) | (-59266059)))) * (-301)) + (((~(59266058 | elapsedRealtime2)) | 1377960351) * 301)) & ((int) j22))) != 0) {
                            i24 = i2;
                            objArr9 = new java.lang.Object[]{null, new int[]{(~(i24 & 80)) & (i24 | 80)}, new int[]{i24}, new int[1], null};
                            int myUid = android.os.Process.myUid();
                            int i94 = ~((-224503333) | myUid);
                            int i95 = (((~((~myUid) | (-224503333))) | 138519076) * (-245)) + 1650800388 + (i94 * (-245)) + ((i94 | 96361673) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE);
                            int i96 = -(-((i95 & 16) + (i95 | 16)));
                            i25 = i4;
                            int i97 = ((i25 | i96) << 1) - (i96 ^ i25);
                            int i98 = (i97 << 13) ^ i97;
                            int i99 = i98 >>> 17;
                            int i100 = (i98 & (~i99)) | ((~i98) & i99);
                            i26 = 0;
                            ((int[]) objArr9[3])[0] = i100 ^ (i100 << 5);
                        } else {
                            i24 = i2;
                            i25 = i4;
                            objArr9 = new java.lang.Object[]{null, new int[]{i24}, new int[]{i24}, new int[1], null};
                            int elapsedRealtime3 = (int) android.os.SystemClock.elapsedRealtime();
                            int i101 = ((((~((-264880330) | r5)) | 54542336) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) - 2044848283) + ((~((-54542337) | elapsedRealtime3)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + (((~(elapsedRealtime3 | (-210337994))) | (~((~elapsedRealtime3) | (-55984677))) | 1442340) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE);
                            int i102 = -(-((i101 << 1) - i101));
                            int i103 = (i25 & i102) + (i102 | i25);
                            int i104 = i103 << 13;
                            int i105 = ((~i104) & i103) | ((~i103) & i104);
                            int i106 = i105 >>> 17;
                            int i107 = (~(i105 & i106)) & (i105 | i106);
                            i26 = 0;
                            ((int[]) objArr9[3])[0] = i107 ^ (i107 << 5);
                        }
                        if (((int[]) objArr9[1])[i26] != i24) {
                            return objArr9;
                        }
                        int offsetAfter = android.text.TextUtils.getOffsetAfter("", i26);
                        java.lang.Object[] objArr23 = new java.lang.Object[1];
                        m("攝\ue17b㇗顠ꉾ춨≆ૻ㟾笭讙྄栴쟗㮳뎿ꇣ䤁\ude0dﺂ웗鎋ߪ虑ĕ谁楹\uf54e⼠\ue924눁\u2fee倅\uf670⮪咚\u139f䜍ꐵ∡鈫⑄", (offsetAfter & 42) + (offsetAfter | 42), objArr23);
                        java.lang.Object[] objArr24 = {(java.lang.String) objArr23[i26]};
                        java.lang.Object d8 = com.facetec.sdk.al.d(1873189073);
                        if (d8 == null) {
                            char threadPriority = (char) (((android.os.Process.getThreadPriority(i26) + 20) >> 6) + 6935);
                            int indexOf3 = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                            int bitsPerPixel = android.graphics.ImageFormat.getBitsPerPixel(0);
                            byte b8 = (byte) 0;
                            byte b9 = (byte) (b8 + 1);
                            java.lang.Object[] objArr25 = new java.lang.Object[1];
                            p(b8, b9, (byte) (b9 - 1), objArr25);
                            d8 = com.facetec.sdk.al.c(threadPriority, indexOf3 + 2390, 22 - bitsPerPixel, -934682071, false, (java.lang.String) objArr25[0], new java.lang.Class[]{java.lang.String.class});
                        }
                        long longValue4 = ((java.lang.Long) ((java.lang.reflect.Method) d8).invoke(null, objArr24)).longValue();
                        long j23 = -172957620;
                        long j24 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE;
                        long j25 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE;
                        long j26 = j18 ^ j6;
                        long j27 = (j24 * j23) + ((-219) * longValue4) + (((((j23 ^ j6) | (longValue4 ^ j6)) ^ j6) | (((j26 | j23) | longValue4) ^ j6)) * j25) + ((-440) * (j23 | ((j26 | longValue4) ^ j6))) + (j25 * (j23 | longValue4 | j18)) + 1110037263;
                        int i108 = (int) (j27 >> 32);
                        int freeMemory = (int) java.lang.Runtime.getRuntime().freeMemory();
                        int i109 = ~freeMemory;
                        if (((i108 & ((((-1850790342) | freeMemory) * 140) + 728323962 + (((~((-1850790342) | i109)) | 1112539456) * (-280)) + (((~(freeMemory | (-1112539457))) | (~(i109 | (-1006950544))) | 268699658) * 140))) | (((int) j27) & (((((~((-1644321299) | i24)) | 207094888) * (-756)) - 1925927535) + ((i31 | (-1644321299)) * 756)))) != 0) {
                            objArr10 = new java.lang.Object[]{null, new int[]{i24 ^ 90}, new int[]{i24}, new int[1], null};
                            int uptimeMillis2 = (int) android.os.SystemClock.uptimeMillis();
                            int i110 = (((((~((-101246750) | r5)) | (-219618257)) | (~(101246749 | uptimeMillis2))) * (-564)) - 2016155503) + ((~(uptimeMillis2 | (-152508609))) * 1128) + (((~((-219618257) | (~uptimeMillis2))) | (-253755358)) * 564);
                            int i111 = (i110 ^ 16) + ((i110 & 16) << 1);
                            int i112 = ~i111;
                            int i113 = ~i25;
                            int i114 = (i112 ^ i113) | (i112 & i113);
                            int i115 = ~((i111 & i113) | (i113 ^ i111));
                            int i116 = ~((i113 ^ i24) | (i113 & i24));
                            int i117 = (((((((i111 * 491) - (~(i25 * (-489)))) - 1) + (((i114 ^ i31) | (i114 & i31)) * (-490))) - (~(-(-(((i116 ^ i115) | (i115 & i116)) * 490))))) - 1) - (~(i112 * 490))) - 1;
                            int i118 = i117 << 13;
                            int i119 = (~(i117 & i118)) & (i118 | i117);
                            int i120 = i119 ^ (i119 >>> 17);
                            int i121 = i120 << 5;
                            int[] iArr3 = (int[]) objArr10[3];
                            int i122 = (i120 & (~i121)) | ((~i120) & i121);
                            i27 = 0;
                            iArr3[0] = i122;
                        } else {
                            objArr10 = new java.lang.Object[]{null, new int[]{i24}, new int[]{i24}, new int[]{r3}, null};
                            int i123 = (((((~(i31 | (-402653955))) | 81788948) | (~((-620181525) | i24))) * (-68)) - 889809655) + ((~(i31 | (-538392577))) * (-68)) + (((~(i31 | 620181524)) | (-941046531)) * 68) + i25;
                            int i124 = i123 ^ (i123 << 13);
                            int i125 = i124 >>> 17;
                            int i126 = (i124 & (~i125)) | ((~i124) & i125);
                            int i127 = i126 << 5;
                            int i128 = (i126 & (~i127)) | ((~i126) & i127);
                            i27 = 0;
                        }
                        if (((int[]) objArr10[1])[i27] != i24) {
                            return objArr10;
                        }
                        int resolveOpacity2 = android.graphics.drawable.Drawable.resolveOpacity(i27, i27);
                        int scrollBarFadeDuration = android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16;
                        int keyRepeatTimeout = android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16;
                        int i129 = -(-(android.view.KeyEvent.getMaxKeyCode() >> 16));
                        int i130 = -(android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        java.lang.Object[] objArr26 = new java.lang.Object[1];
                        n(1987808040 - (~resolveOpacity2), (short) (((scrollBarFadeDuration | 10) << 1) - (scrollBarFadeDuration ^ 10)), ((-1276746442) ^ keyRepeatTimeout) + ((keyRepeatTimeout & (-1276746442)) << 1), (i129 ^ (-46)) + ((i129 & (-46)) << 1), (byte) ((i130 & 1) + (i130 | 1)), objArr26);
                        java.lang.Object[] objArr27 = {(java.lang.String) objArr26[0]};
                        java.lang.Object d9 = com.facetec.sdk.al.d(1873189073);
                        if (d9 == null) {
                            char capsMode = (char) (android.text.TextUtils.getCapsMode("", 0, 0) + 6935);
                            int indexOf4 = android.text.TextUtils.indexOf("", "");
                            int scrollBarFadeDuration2 = android.view.ViewConfiguration.getScrollBarFadeDuration();
                            byte b10 = (byte) 0;
                            byte b11 = (byte) (b10 + 1);
                            java.lang.Object[] objArr28 = new java.lang.Object[1];
                            p(b10, b11, (byte) (b11 - 1), objArr28);
                            d9 = com.facetec.sdk.al.c(capsMode, indexOf4 + 2389, 23 - (scrollBarFadeDuration2 >> 16), -934682071, false, (java.lang.String) objArr28[0], new java.lang.Class[]{java.lang.String.class});
                        }
                        long longValue5 = ((java.lang.Long) ((java.lang.reflect.Method) d9).invoke(null, objArr27)).longValue();
                        long j28 = -712941210;
                        long j29 = 367;
                        long j30 = -366;
                        long j31 = longValue5 ^ j6;
                        long myUid2 = android.os.Process.myUid();
                        long j32 = (j29 * j28) + (j29 * longValue5) + ((j28 | longValue5) * j30) + ((((j31 | myUid2) ^ j6) | j28) * j30) + (366 * ((((j28 ^ j6) | longValue5) ^ j6) | (((j31 | j28) | myUid2) ^ j6))) + 1650020853;
                        int myPid2 = android.os.Process.myPid();
                        int i131 = ~myPid2;
                        int i132 = ((int) (j32 >> 32)) & ((((~(myPid2 | (-2106772387))) | 1477609984 | (~((-40383574) | i131))) * 886) + 2123170398 + (((~(2106772386 | i131)) | (-669545976)) * (-1772)) + ((~(i131 | (-669545976))) * 886));
                        int nextInt3 = new java.util.Random().nextInt();
                        int i133 = ((int) j32) & (((((~(1602095588 | nextInt3)) | (-1610595839)) * (-283)) - 1969315472) + ((~(nextInt3 | (-8500251))) * 283));
                        if (((i133 ^ i132) | (i132 & i133)) != 0) {
                            java.lang.Object[] objArr29 = {null, new int[]{(i24 & (-101)) | (i31 & 100)}, new int[]{i24}, new int[1], null};
                            int i134 = ((((~((~r2) | 866734350)) | 3616) * 529) - 1740238132) + (((~(((int) java.lang.Runtime.getRuntime().freeMemory()) | 866734350)) | 545869344) * 529);
                            int i135 = (i25 - (~(((i134 | 16) << 1) - (i134 ^ 16)))) - 1;
                            int i136 = i135 << 13;
                            int i137 = (i135 & (~i136)) | ((~i135) & i136);
                            int i138 = i137 >>> 17;
                            int i139 = (i137 & (~i138)) | ((~i137) & i138);
                            ((int[]) objArr29[3])[0] = i139 ^ (i139 << 5);
                            return objArr29;
                        }
                        java.lang.Object[] objArr30 = {null, new int[]{i24}, new int[]{i24}, new int[]{(~(r2 & r3)) & r4}, null};
                        int i140 = ((((~(i31 | 99882609)) | 134998028) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) - 486659323) + ((13898241 | i24) * (-184)) + ((~(i31 | (-220982397))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE);
                        int i141 = -(-((i140 << 1) - i140));
                        int i142 = (i25 ^ i141) + ((i141 & i25) << 1);
                        int i143 = i142 << 13;
                        int i144 = ((~i143) & i142) | ((~i142) & i143);
                        int i145 = i144 >>> 17;
                        int i146 = (i144 & (~i145)) | ((~i144) & i145);
                        int i147 = i146 << 5;
                        int i148 = i146 | i147;
                        return objArr30;
                    }
                    int i149 = i2;
                    i5 = i4;
                    try {
                        byte modifierMetaStateMask = (byte) android.view.KeyEvent.getModifierMetaStateMask();
                        int i150 = -android.view.View.MeasureSpec.getSize(0);
                        int i151 = -(-android.text.TextUtils.getOffsetBefore("", 0));
                        java.lang.Object[] objArr31 = new java.lang.Object[1];
                        n((modifierMetaStateMask & 1987808092) + (modifierMetaStateMask | 1987808092), (short) (((i150 | 83) << 1) - (i150 ^ 83)), ((-1276746424) & i151) + (i151 | (-1276746424)), android.view.MotionEvent.axisFromString("") - 45, (byte) android.view.KeyEvent.keyCodeFromString(""), objArr31);
                        java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr31[0]);
                        int i152 = -(-(android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                        java.lang.Object[] objArr32 = new java.lang.Object[1];
                        m("雧퍻䩁됎\u139f䜍냸캖雧퍻㈛ꀎ쬮蠧", (i152 & 14) + (i152 | 14), objArr32);
                        java.lang.String str15 = (java.lang.String) cls.getMethod((java.lang.String) objArr32[0], null).invoke(context, null);
                        int edgeSlop = android.view.ViewConfiguration.getEdgeSlop();
                        short s2 = (short) ((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 83);
                        int i153 = -(-android.text.TextUtils.getTrimmedLength(""));
                        java.lang.Object[] objArr33 = new java.lang.Object[1];
                        n((edgeSlop >> 16) + 1987808091, s2, ((-1276746424) & i153) + (i153 | (-1276746424)), (-47) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (byte) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr33);
                        java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr33[0]);
                        int i154 = -(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        java.lang.Object[] objArr34 = new java.lang.Object[1];
                        m("雧퍻녱ꯁ鐉嵶\u2069ǔ\ue05e룮眄萯\udef2卮\uea5d\uf831댨犈", (i154 ^ 19) + ((i154 & 19) << 1), objArr34);
                        java.lang.Object invoke = cls2.getMethod((java.lang.String) objArr34[0], null).invoke(context, null);
                        int indexOf5 = ((java.lang.String) java.lang.Class.forName(str12).getField(str13).get(invoke)).indexOf(str15);
                        int i155 = 2;
                        if (indexOf5 > 0) {
                            java.lang.String str16 = (java.lang.String) java.lang.Class.forName(str12).getField(str13).get(invoke);
                            int length4 = str16.length();
                            int i156 = ((length4 | (-16)) << 1) - (length4 ^ (-16));
                            if (i156 >= 0) {
                                int i157 = 0;
                                while (i157 <= i156) {
                                    java.lang.String substring = str16.substring(i157, i157 + 16);
                                    java.lang.Object[] objArr35 = new java.lang.Object[i155];
                                    objArr35[1] = 931995;
                                    objArr35[0] = substring;
                                    java.lang.Object d10 = com.facetec.sdk.al.d(-582857820);
                                    if (d10 == null) {
                                        char pressedStateDuration2 = (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16);
                                        int packedPositionType = android.widget.ExpandableListView.getPackedPositionType(0L);
                                        int offsetAfter2 = android.text.TextUtils.getOffsetAfter("", 0);
                                        str11 = str16;
                                        byte b12 = (byte) 0;
                                        byte b13 = (byte) (b12 + 1);
                                        i21 = i156;
                                        str10 = str14;
                                        java.lang.Object[] objArr36 = new java.lang.Object[1];
                                        p(b12, b13, (byte) (b13 - 1), objArr36);
                                        d10 = com.facetec.sdk.al.c(pressedStateDuration2, packedPositionType + 2365, 24 - offsetAfter2, 2058170716, false, (java.lang.String) objArr36[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                                    } else {
                                        str10 = str14;
                                        str11 = str16;
                                        i21 = i156;
                                    }
                                    long longValue6 = ((java.lang.Long) ((java.lang.reflect.Method) d10).invoke(null, objArr35)).longValue();
                                    long j33 = -279925415;
                                    long j34 = -755;
                                    int i158 = indexOf5;
                                    int i159 = i157;
                                    java.lang.Object obj6 = invoke;
                                    long j35 = -1;
                                    long j36 = ((j33 ^ j35) | (longValue6 ^ j35)) ^ j35;
                                    java.lang.String str17 = str12;
                                    long j37 = j33 | longValue6;
                                    java.lang.String str18 = str13;
                                    long myTid = android.os.Process.myTid();
                                    long j38 = (j33 * j34) + (j34 * longValue6) + (1512 * j36) + ((-756) * (j36 | ((j37 | myTid) ^ j35))) + (756 * (j37 | (j35 ^ myTid))) + 1439122813;
                                    i11 = i2;
                                    int i160 = ~i11;
                                    int i161 = ((int) (j38 >> 32)) & (((~((-1058049) | i160)) * 433) + 731627690 + (((~((-896342102) | i11)) | (-540884310)) * (-433)) + (((~((-540884310) | i11)) | (-897400150)) * 433));
                                    int i162 = ((int) j38) & ((((((~((-815307152) | i160)) | 815272070) * 446) - 384374209) + (((~((-35082) | i11)) | 1227161664) * 446)) - 1460876940);
                                    if (((i161 ^ i162) | (i162 & i161)) == -725904754) {
                                        java.lang.String str19 = (java.lang.String) java.lang.Class.forName(str17).getField(str18).get(obj6);
                                        ((int[]) objArr[2])[0] = i11;
                                        ((int[]) objArr[1])[0] = (~(i11 & 20)) & (i11 | 20);
                                        objArr = new java.lang.Object[]{str19, new int[1], new int[1], new int[1], null};
                                        int i163 = (((((~(648085177 | i11)) | (~(968950183 | i160))) | r4) * (-516)) - 845725847) + (((~(i160 | (-545259682))) | (~((-423690503) | i11))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR) + ((545259681 | (~((-648085178) | i160))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR);
                                        i20 = i4;
                                        int i164 = (i163 ^ 16) + ((i163 & 16) << 1) + i20;
                                        int i165 = i164 << 13;
                                        int i166 = (~(i164 & i165)) & (i164 | i165);
                                        int i167 = i166 ^ (i166 >>> 17);
                                        ((int[]) objArr[3])[0] = i167 ^ (i167 << 5);
                                        break;
                                    }
                                    i5 = i4;
                                    str13 = str18;
                                    i157 = i159 + 1;
                                    i149 = i11;
                                    invoke = obj6;
                                    str14 = str10;
                                    str16 = str11;
                                    indexOf5 = i158;
                                    str12 = str17;
                                    i156 = i21;
                                    i155 = 2;
                                }
                            }
                            int i168 = indexOf5;
                            obj2 = invoke;
                            str = str12;
                            i11 = i149;
                            str2 = str14;
                            java.lang.String str20 = (java.lang.String) java.lang.Class.forName(str).getField(str13).get(obj2);
                            int length5 = str20.length() - 6;
                            if (length5 >= 0) {
                                int i169 = 0;
                                while (i169 <= length5) {
                                    java.lang.Object[] objArr37 = {str20.substring(i169, (i169 & 6) + (i169 | 6)), 931995};
                                    java.lang.Object d11 = com.facetec.sdk.al.d(-582857820);
                                    if (d11 == null) {
                                        char c5 = (char) (1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                                        int resolveSize = android.view.View.resolveSize(0, 0);
                                        int red = android.graphics.Color.red(0);
                                        byte b14 = (byte) 0;
                                        byte b15 = (byte) (b14 + 1);
                                        str9 = str20;
                                        java.lang.Object[] objArr38 = new java.lang.Object[1];
                                        p(b14, b15, (byte) (b15 - 1), objArr38);
                                        d11 = com.facetec.sdk.al.c(c5, resolveSize + 2365, red + 24, 2058170716, false, (java.lang.String) objArr38[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                                    } else {
                                        str9 = str20;
                                    }
                                    long longValue7 = ((java.lang.Long) ((java.lang.reflect.Method) d11).invoke(null, objArr37)).longValue();
                                    long j39 = -526192985;
                                    java.lang.Object obj7 = obj2;
                                    int i170 = length5;
                                    long j40 = -1;
                                    long j41 = j39 ^ j40;
                                    int i171 = i169;
                                    long j42 = i11;
                                    java.lang.String str21 = str13;
                                    long j43 = com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST;
                                    long j44 = longValue7 ^ j40;
                                    long j45 = (567 * j39) + ((-565) * longValue7) + ((((j41 | longValue7) ^ j40) | ((j41 | j42) ^ j40)) * (-566)) + (((j44 | j39) ^ j40) * j43) + (j43 * (j40 ^ (j42 | (j41 | j44)))) + 1685390383;
                                    int myUid3 = android.os.Process.myUid();
                                    int i172 = ~myUid3;
                                    int i173 = ((int) (j45 >> 32)) & (((981683521 | myUid3) * 140) + 795242494 + (((~(981683521 | i172)) | 19136552) * (-280)) + (((~(myUid3 | (-19136553))) | (~(i172 | 455542889)) | 545277184) * 140));
                                    int i174 = (int) java.lang.Runtime.getRuntime().totalMemory();
                                    int i175 = ((int) j45) & ((((25755712 | r6) * (-476)) - 989650503) + ((~(1879046126 | i174)) * 952) + ((~((~i174) | 1879046126)) * 476));
                                    if (((i173 ^ i175) | (i173 & i175)) == -2096167706) {
                                        int i176 = ~i11;
                                        java.lang.String str22 = (java.lang.String) java.lang.Class.forName(str).getField(str21).get(obj7);
                                        ((int[]) objArr[2])[0] = i11;
                                        ((int[]) objArr[1])[0] = (i11 & (-21)) | (i176 & 20);
                                        objArr = new java.lang.Object[]{str22, new int[1], new int[1], new int[1], null};
                                        int i177 = (((~(738621441 | i176)) * 979) - 268103024) + ((1059486447 | i11) * (-979)) + (((~(i176 | 1059486447)) | (~(738621441 | i11))) * 979);
                                        int d12 = com.facetec.sdk.gj.a.d();
                                        int i178 = i177 * 530;
                                        int i179 = (((i178 | 9538) << 1) - (i178 ^ 9538)) + (((~((~d12) | 16)) | (~((i177 ^ 16) | (i177 & 16)))) * 529);
                                        int i180 = -(-(((~i177) | (~((d12 ^ 16) | (d12 & 16)))) * 529));
                                        i20 = i4;
                                        int i181 = (i20 - (~(-(-((i179 ^ i180) + ((i180 & i179) << 1)))))) - 1;
                                        int i182 = i181 << 13;
                                        int i183 = (i181 & (~i182)) | ((~i181) & i182);
                                        int i184 = i183 ^ (i183 >>> 17);
                                        ((int[]) objArr[3])[0] = i184 ^ (i184 << 5);
                                        i7 = i11;
                                        i19 = i20;
                                    } else {
                                        i5 = i4;
                                        obj2 = obj7;
                                        str13 = str21;
                                        i169 = (i171 & 1) + (i171 | 1);
                                        str20 = str9;
                                        length5 = i170;
                                    }
                                }
                            }
                            java.lang.String substring2 = ((java.lang.String) java.lang.Class.forName(str).getField(str13).get(obj2)).substring(0, i168);
                            java.lang.Object[] objArr39 = new java.lang.Object[1];
                            m("冧\ueb6e", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr39);
                            split = substring2.split((java.lang.String) objArr39[0]);
                            length2 = split.length;
                            i12 = 0;
                            r16 = maxKeyCode;
                            loop4: while (i12 < length2) {
                                java.lang.String str23 = split[i12];
                                int keyRepeatTimeout2 = android.view.ViewConfiguration.getKeyRepeatTimeout();
                                int i185 = -(-android.widget.ExpandableListView.getPackedPositionType(0L));
                                int scrollBarSize = android.view.ViewConfiguration.getScrollBarSize();
                                int i186 = -android.view.KeyEvent.getDeadChar(0, 0);
                                int d13 = com.facetec.sdk.gj.a.d();
                                int i187 = (i186 * 71) + 3174;
                                int i188 = ~i186;
                                int i189 = ~((i188 ^ (-46)) | (i188 & (-46)));
                                java.lang.String[] strArr2 = split;
                                int i190 = ~((d13 ^ (-46)) | (d13 & (-46)));
                                int i191 = -(-(((i189 ^ i190) | (i190 & i189)) * (-140)));
                                int i192 = i186 | (-46);
                                int i193 = (i187 ^ i191) + ((i191 & i187) << 1) + ((~((i192 ^ d13) | (i192 & d13))) * 70);
                                int i194 = ~((i186 ^ 45) | (i186 & 45));
                                int i195 = (i189 ^ i194) | (i194 & i189);
                                int i196 = ~((i186 ^ d13) | (i186 & d13));
                                int i197 = -(-(((i195 ^ i196) | (i195 & i196)) * 70));
                                java.lang.Object[] objArr40 = new java.lang.Object[1];
                                n(1987808085 - (keyRepeatTimeout2 >> 16), (short) ((i185 & 1) + (i185 | 1)), (scrollBarSize >> 8) - 1276746394, (i193 ^ i197) + ((i193 & i197) << 1), (byte) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr40);
                                if (str23.split((java.lang.String) objArr40[0]).length > 1) {
                                    synchronized (((java.lang.Class) com.facetec.sdk.al.b((char) ((android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1)) - 1), android.view.View.resolveSize(0, 0) + 1436, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 23))) {
                                        try {
                                            int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                            int i198 = -(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                            short s3 = (short) ((i198 & 45) + (i198 | 45));
                                            int packedPositionType2 = android.widget.ExpandableListView.getPackedPositionType(0L);
                                            int i199 = (packedPositionType2 * (-244)) - 546999578;
                                            i16 = ~i11;
                                            int i200 = ~((i16 ^ 1276746390) | (i16 & 1276746390));
                                            int i201 = ~((packedPositionType2 ^ 1276746390) | (packedPositionType2 & 1276746390));
                                            int i202 = -(-(((i200 ^ i201) | (i200 & i201)) * (-245)));
                                            int i203 = (i199 ^ i202) + ((i202 & i199) << 1);
                                            int i204 = ~(1276746390 | i11);
                                            r22 = (i203 - (~(-(-(i204 * (-245)))))) - 1;
                                            int i205 = -(-(((i204 ^ packedPositionType2) | (i204 & packedPositionType2)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE));
                                            int i206 = (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                            int d14 = com.facetec.sdk.gj.a.d();
                                            int i207 = i206 * 881;
                                            int i208 = (i207 ^ (-40526)) + ((i207 & (-40526)) << 1);
                                            int i209 = ~i206;
                                            i13 = length2;
                                            int i210 = ~(i209 | 45);
                                            i15 = i12;
                                            int i211 = ~((i209 ^ d14) | (i209 & d14));
                                            int i212 = (i210 ^ i211) | (i210 & i211);
                                            int i213 = ~((d14 ^ 45) | (d14 & 45));
                                            int i214 = ((i212 ^ i213) | (i212 & i213)) * (-880);
                                            int i215 = (i208 & i214) + (i208 | i214);
                                            int i216 = ~d14;
                                            i17 = i209 ^ i216;
                                            int i217 = ~(i17 | (i216 & i209));
                                            int i218 = (i217 ^ (-46)) | (i217 & (-46));
                                            int i219 = ~((i206 ^ d14) | (d14 & i206));
                                            int i220 = -(-(((i218 ^ i219) | (i218 & i219)) * (-880)));
                                            i7 = (i215 ^ i220) + ((i220 & i215) << 1);
                                            i14 = -(-(i219 * 880));
                                            try {
                                                try {
                                                    java.lang.Object[] objArr41 = new java.lang.Object[1];
                                                    n((lastIndexOf ^ 1987808107) + ((lastIndexOf & 1987808107) << 1), s3, (r22 & i205) + (i205 | r22), (i7 ^ i14) + ((i14 & i7) << 1), (byte) android.graphics.Color.blue(0), objArr41);
                                                    str3 = (java.lang.String) objArr41[0];
                                                    try {
                                                        try {
                                                            java.lang.Runtime runtime = java.lang.Runtime.getRuntime();
                                                            float complexToFraction2 = android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f);
                                                            float length6 = android.graphics.PointF.length(0.0f, 0.0f);
                                                            int indexOf6 = android.text.TextUtils.indexOf("", "", 0, 0);
                                                            int axisFromString = android.view.MotionEvent.axisFromString("");
                                                            java.lang.Object[] objArr42 = new java.lang.Object[1];
                                                            n(1987808109 - (complexToFraction2 > 0.0f ? 1 : (complexToFraction2 == 0.0f ? 0 : -1)), (short) (android.text.TextUtils.getCapsMode("", 0, 0) - 18), (-1276746375) - (length6 > 0.0f ? 1 : (length6 == 0.0f ? 0 : -1)), ((indexOf6 | (-46)) << 1) - (indexOf6 ^ (-46)), (byte) ((axisFromString ^ 1) + ((axisFromString & 1) << 1)), objArr42);
                                                            exec = runtime.exec((java.lang.String) objArr42[0], (java.lang.String[]) null, (java.io.File) null);
                                                        } catch (java.lang.Exception unused) {
                                                            i7 = i11;
                                                        }
                                                    } catch (java.lang.Exception unused2) {
                                                    }
                                                } catch (java.io.IOException unused3) {
                                                    i7 = i11;
                                                    i14 = i5;
                                                }
                                            } catch (java.io.IOException unused4) {
                                            }
                                        } catch (java.io.IOException unused5) {
                                            i7 = i11;
                                            i13 = length2;
                                            i14 = i5;
                                            i15 = i12;
                                        }
                                        try {
                                            java.lang.Object[] objArr43 = {exec.getInputStream()};
                                            java.lang.Object d15 = com.facetec.sdk.al.d(1647730903);
                                            if (d15 == null) {
                                                d15 = com.facetec.sdk.al.c((char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), 1340 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 24 - android.graphics.Color.alpha(0), -975627729, false, null, new java.lang.Class[]{java.io.InputStream.class});
                                            }
                                            newInstance = ((java.lang.reflect.Constructor) d15).newInstance(objArr43);
                                            try {
                                                java.lang.Object[] objArr44 = {exec.getErrorStream()};
                                                java.lang.Object d16 = com.facetec.sdk.al.d(1647730903);
                                                if (d16 == null) {
                                                    try {
                                                        d16 = com.facetec.sdk.al.c((char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), 1339 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), 23 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), -975627729, false, null, new java.lang.Class[]{java.io.InputStream.class});
                                                    } catch (java.lang.Throwable th3) {
                                                        th = th3;
                                                        cause = th.getCause();
                                                        if (cause == null) {
                                                        }
                                                    }
                                                }
                                                try {
                                                    newInstance2 = ((java.lang.reflect.Constructor) d16).newInstance(objArr44);
                                                    try {
                                                        java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(exec.getOutputStream());
                                                        try {
                                                            java.lang.Class<?> cls3 = java.lang.Class.forName(str2);
                                                            java.lang.Object[] objArr45 = new java.lang.Object[1];
                                                            m("硧佉휍禮꜀﵆", 5 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr45);
                                                            cls3.getMethod((java.lang.String) objArr45[0], null).invoke(newInstance, null);
                                                            try {
                                                                java.lang.Class<?> cls4 = java.lang.Class.forName(str2);
                                                                java.lang.Object[] objArr46 = new java.lang.Object[1];
                                                                m("硧佉휍禮꜀﵆", android.widget.ExpandableListView.getPackedPositionGroup(0L) + 5, objArr46);
                                                                cls4.getMethod((java.lang.String) objArr46[0], null).invoke(newInstance2, null);
                                                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                                sb.append(str3);
                                                                int i221 = -(-(android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                                                                java.lang.Object[] objArr47 = new java.lang.Object[1];
                                                                m("\ua7ed㾜", (i221 ^ 1) + ((i221 & 1) << 1), objArr47);
                                                                sb.append((java.lang.String) objArr47[0]);
                                                                java.lang.String obj8 = sb.toString();
                                                                int i222 = -(-(android.os.Process.myTid() >> 22));
                                                                java.lang.Object[] objArr48 = new java.lang.Object[1];
                                                                m("谆\uf736鈹ﱣ\uee4d鈝", ((i222 | 5) << 1) - (i222 ^ 5), objArr48);
                                                                dataOutputStream.write(obj8.getBytes((java.lang.String) objArr48[0]));
                                                                dataOutputStream.flush();
                                                                int i223 = -android.graphics.Color.green(0);
                                                                short pressedStateDuration3 = (short) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 47);
                                                                int i224 = -android.view.View.getDefaultSize(0, 0);
                                                                int i225 = -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                                                int i226 = -(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                                                int d17 = com.facetec.sdk.gj.a.d();
                                                                obj3 = obj2;
                                                                int i227 = (i226 * (-575)) + 575;
                                                                str4 = str13;
                                                                int i228 = ~i226;
                                                                str5 = str23;
                                                                int i229 = ~i228;
                                                                int i230 = ~d17;
                                                                int i231 = ((i229 ^ i230) | (i230 & i229)) * 576;
                                                                int i232 = (i227 & i231) + (i231 | i227);
                                                                int i233 = ~(i229 | i228);
                                                                int i234 = ~((i230 ^ i226) | (i226 & i230));
                                                                int i235 = ((i233 ^ i234) | (i234 & i233)) * 576;
                                                                int i236 = (i232 & i235) + (i235 | i232);
                                                                int i237 = i229 * 576;
                                                                byte b16 = (byte) (((i236 | i237) << 1) - (i237 ^ i236));
                                                                try {
                                                                    try {
                                                                        java.lang.Object[] objArr49 = new java.lang.Object[1];
                                                                        n((1987808095 & i223) + (i223 | 1987808095), pressedStateDuration3, (-1276746358) - (~i224), (i225 ^ (-47)) + ((i225 & (-47)) << 1), b16, objArr49);
                                                                        java.lang.String str24 = (java.lang.String) objArr49[0];
                                                                        int i238 = -(-(android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                                                        java.lang.Object[] objArr50 = new java.lang.Object[1];
                                                                        m("谆\uf736鈹ﱣ\uee4d鈝", (i238 & 5) + (i238 | 5), objArr50);
                                                                        str6 = (java.lang.String) objArr50[0];
                                                                        dataOutputStream.write(str24.getBytes(str6));
                                                                        dataOutputStream.flush();
                                                                        try {
                                                                            nanoTime = java.lang.System.nanoTime();
                                                                            long j46 = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(2000L);
                                                                            while (true) {
                                                                                try {
                                                                                    try {
                                                                                        exec.exitValue();
                                                                                        r7 = j46;
                                                                                    } catch (java.lang.IllegalThreadStateException unused6) {
                                                                                        if (j46 > 0) {
                                                                                            try {
                                                                                                java.lang.Object[] objArr51 = {java.lang.Long.valueOf(java.lang.Math.min(java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(j46) + 1, 3L))};
                                                                                                java.lang.Class<?> cls5 = java.lang.Class.forName(str2);
                                                                                                int i239 = -(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16);
                                                                                                java.lang.Object[] objArr52 = new java.lang.Object[1];
                                                                                                m("\uee3e朏玵ၱ꾼䫝", (i239 ^ 5) + ((i239 & 5) << 1), objArr52);
                                                                                                cls5.getMethod((java.lang.String) objArr52[0], java.lang.Long.TYPE).invoke(null, objArr51);
                                                                                            } catch (java.lang.Throwable th4) {
                                                                                                java.lang.Throwable cause2 = th4.getCause();
                                                                                                if (cause2 != null) {
                                                                                                    throw cause2;
                                                                                                }
                                                                                                throw th4;
                                                                                            }
                                                                                        }
                                                                                        long nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(2000L) - (java.lang.System.nanoTime() - nanoTime);
                                                                                        r7 = nanos;
                                                                                        if (nanos > 0) {
                                                                                            newInstance = newInstance;
                                                                                            j46 = nanos;
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        break;
                                                                                    } catch (java.io.IOException unused7) {
                                                                                    }
                                                                                } catch (java.lang.InterruptedException e2) {
                                                                                    interruptedException = e2;
                                                                                    try {
                                                                                        throw interruptedException;
                                                                                    } catch (java.lang.Throwable th5) {
                                                                                        th = th5;
                                                                                        th2 = th;
                                                                                        try {
                                                                                            exec.destroy();
                                                                                            throw th2;
                                                                                        } catch (java.lang.Exception unused8) {
                                                                                            throw th2;
                                                                                        }
                                                                                    }
                                                                                } catch (java.lang.Throwable th6) {
                                                                                    th2 = th6;
                                                                                    exec.destroy();
                                                                                    throw th2;
                                                                                }
                                                                            }
                                                                        } catch (java.lang.InterruptedException e3) {
                                                                            interruptedException = e3;
                                                                            throw interruptedException;
                                                                        } catch (java.lang.Throwable th7) {
                                                                            th = th7;
                                                                            th2 = th;
                                                                            exec.destroy();
                                                                            throw th2;
                                                                        }
                                                                    } catch (java.lang.Exception unused9) {
                                                                        i7 = i2;
                                                                        i17 = i16;
                                                                    }
                                                                } catch (java.io.IOException unused10) {
                                                                    i7 = i2;
                                                                    i14 = i4;
                                                                    r22 = obj3;
                                                                    r16 = str4;
                                                                    int i240 = (i15 ^ 116) + ((i15 & 116) << 1);
                                                                    i12 = ((i240 & (-115)) << 1) + (i240 ^ (-115));
                                                                    i5 = i14;
                                                                    i11 = i7;
                                                                    str13 = r16;
                                                                    obj2 = r22;
                                                                    split = strArr2;
                                                                    length2 = i13;
                                                                    r16 = r16;
                                                                }
                                                            } catch (java.lang.Throwable th8) {
                                                                java.lang.Throwable cause3 = th8.getCause();
                                                                if (cause3 != null) {
                                                                    throw cause3;
                                                                }
                                                                throw th8;
                                                            }
                                                        } catch (java.lang.Throwable th9) {
                                                            java.lang.Throwable cause4 = th9.getCause();
                                                            if (cause4 != null) {
                                                                throw cause4;
                                                            }
                                                            throw th9;
                                                        }
                                                    } catch (java.io.IOException unused11) {
                                                        i14 = i4;
                                                        i7 = i11;
                                                        r22 = obj2;
                                                        r16 = str13;
                                                        int i2402 = (i15 ^ 116) + ((i15 & 116) << 1);
                                                        i12 = ((i2402 & (-115)) << 1) + (i2402 ^ (-115));
                                                        i5 = i14;
                                                        i11 = i7;
                                                        str13 = r16;
                                                        obj2 = r22;
                                                        split = strArr2;
                                                        length2 = i13;
                                                        r16 = r16;
                                                    } catch (java.lang.Exception unused12) {
                                                        i7 = i11;
                                                        i17 = i16;
                                                        int i241 = (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                        int i242 = i241 * (-419);
                                                        int i243 = ((-651427776) ^ i242) + ((i242 & (-651427776)) << 1) + ((~(1987808064 | i7)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING);
                                                        int i244 = ~i241;
                                                        int i245 = ((1987808064 ^ i244) | (1987808064 & i244)) * (-420);
                                                        int i246 = (i243 ^ i245) + ((i245 & i243) << 1);
                                                        int i247 = ~((i244 ^ (-1987808065)) | ((-1987808065) & i244));
                                                        int i248 = ~(i17 | 1987808064);
                                                        int i249 = -(-(((i247 ^ i248) | (i247 & i248)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING));
                                                        int i250 = -(-(android.view.ViewConfiguration.getPressedStateDuration() >> 16));
                                                        int i251 = -android.text.TextUtils.getCapsMode("", 0, 0);
                                                        java.lang.Object[] objArr53 = new java.lang.Object[1];
                                                        n(((i249 & i246) << 1) + (i246 ^ i249), (short) ((i250 ^ 121) + ((i250 & 121) << 1)), ((-1276746348) & i251) + (i251 | (-1276746348)), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 46, (byte) android.graphics.Color.alpha(0), objArr53);
                                                        throw new java.io.IOException((java.lang.String) objArr53[0]);
                                                    }
                                                } catch (java.lang.Throwable th10) {
                                                    th = th10;
                                                    th = th;
                                                    cause = th.getCause();
                                                    if (cause == null) {
                                                        throw cause;
                                                    }
                                                    throw th;
                                                }
                                            } catch (java.lang.Throwable th11) {
                                                th = th11;
                                            }
                                        } catch (java.lang.Throwable th12) {
                                            java.lang.Throwable cause5 = th12.getCause();
                                            if (cause5 != null) {
                                                throw cause5;
                                            }
                                            throw th12;
                                        }
                                    }
                                    java.lang.String str25 = (java.lang.String) java.lang.Class.forName(str).getField(str4).get(obj3);
                                    ((int[]) objArr[2])[0] = i7;
                                    ((int[]) objArr[1])[0] = (i7 & (-21)) | (i17 & 20);
                                    objArr = new java.lang.Object[]{str25, new int[1], new int[1], new int[1], null};
                                    int i252 = ((((~((-60330331) | i7)) | 203415753) * 398) - 286881803) + (((~(i17 | (-60330331))) | 203415753) * 398) + 16;
                                    i19 = i4;
                                    int i253 = ((i19 | i252) << 1) - (i252 ^ i19);
                                    int i254 = (i253 << 13) ^ i253;
                                    int i255 = i254 ^ (i254 >>> 17);
                                    int i256 = i255 << 5;
                                    ((int[]) objArr[3])[0] = (~(i255 & i256)) & (i255 | i256);
                                    i6 = i19;
                                    i8 = 1;
                                    c = 0;
                                } else {
                                    i7 = i11;
                                    i13 = length2;
                                    i14 = i5;
                                    i15 = i12;
                                    r22 = obj2;
                                    r16 = str13;
                                }
                                int i24022 = (i15 ^ 116) + ((i15 & 116) << 1);
                                i12 = ((i24022 & (-115)) << 1) + (i24022 ^ (-115));
                                i5 = i14;
                                i11 = i7;
                                str13 = r16;
                                obj2 = r22;
                                split = strArr2;
                                length2 = i13;
                                r16 = r16;
                            }
                            i7 = i11;
                            i6 = i5;
                        } else {
                            i6 = i5;
                            i7 = i149;
                        }
                        objArr = new java.lang.Object[]{null, new int[]{i7}, new int[]{i7}, new int[1], null};
                        int i257 = i6 + ((((((~((-787564329) | r2)) | 466699322) * (-933)) - 1977220420) + (((~((~((int) android.os.Process.getElapsedCpuTime())) | 466699322)) | (-1072777019)) * 933)) - 184532582);
                        int i258 = i257 << 13;
                        int i259 = (~(i257 & i258)) & (i257 | i258);
                        int i260 = i259 >>> 17;
                        int i261 = (~(i259 & i260)) & (i259 | i260);
                        int i262 = i261 << 5;
                        int[] iArr4 = (int[]) objArr[3];
                        int i263 = (~(i261 & i262)) & (i261 | i262);
                        c = 0;
                        iArr4[0] = i263;
                        i8 = 1;
                        if (((int[]) objArr[i8])[c] == i7) {
                            return objArr;
                        }
                        int[] iArr5 = new int[i8];
                        int[] iArr6 = new int[i8];
                        int[] iArr7 = new int[i8];
                        iArr6[c] = i7;
                        int[] iArr8 = iArr5;
                        iArr8[c] = i7;
                        java.lang.Object[] objArr54 = {null, iArr5, iArr6, iArr7, null};
                        int i264 = ~i7;
                        int i265 = (((~(721857418 | i7)) | 350224404 | (~((-400992413) | i7))) * (-744)) + 2115469861 + ((671089410 | i264) * 744) + (((-350224405) | i7) * 744) + i6;
                        int i266 = i265 << 13;
                        int i267 = (i265 & (~i266)) | ((~i265) & i266);
                        int i268 = i267 >>> 17;
                        int i269 = (i267 & (~i268)) | ((~i267) & i268);
                        int i270 = i269 << 5;
                        iArr7[0] = (i269 & (~i270)) | ((~i269) & i270);
                        if (iArr8[0] != i7) {
                            return objArr54;
                        }
                        if ((i3 & 1) == 0) {
                            int red2 = android.graphics.Color.red(0);
                            short normalizeMetaState = (short) (android.view.KeyEvent.normalizeMetaState(0) + 4);
                            int i271 = -(-android.text.TextUtils.getOffsetAfter("", 0));
                            java.lang.Object[] objArr55 = new java.lang.Object[1];
                            n(red2 + 1987808094, normalizeMetaState, (((-1276746293) | i271) << 1) - (i271 ^ (-1276746293)), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 45, (byte) android.text.TextUtils.indexOf("", "", 0, 0), objArr55);
                            try {
                                java.lang.Object[] objArr56 = {(java.lang.String) objArr55[0]};
                                int scrollBarFadeDuration3 = android.view.ViewConfiguration.getScrollBarFadeDuration();
                                short s4 = (short) (82 - (~(-android.widget.ExpandableListView.getPackedPositionType(0L))));
                                int rgb = android.graphics.Color.rgb(0, 0, 0);
                                int lastIndexOf2 = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                int d18 = com.facetec.sdk.gj.a.d();
                                int i272 = (lastIndexOf2 ^ d18) | (lastIndexOf2 & d18);
                                int i273 = ~i272;
                                int i274 = ~((d18 ^ 44) | (d18 & 44));
                                int i275 = (((((lastIndexOf2 * (-1335)) + 30015) - (~(((i273 ^ 44) | (i273 & 44)) * (-668)))) - 1) - (~(((i274 ^ lastIndexOf2) | (lastIndexOf2 & i274)) * 1336))) - 1;
                                int i276 = -(-((i272 | 44) * 668));
                                java.lang.Object[] objArr57 = new java.lang.Object[1];
                                n((scrollBarFadeDuration3 >> 16) + 1987808091, s4, (-1293523640) - rgb, ((i275 | i276) << 1) - (i276 ^ i275), (byte) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr57);
                                java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr57[0]);
                                java.lang.Object[] objArr58 = new java.lang.Object[1];
                                m("雧퍻抂ᦌ䚄꾸\uf11aꪇℏ䜺㥯\ue601櫣䛥\ua7de谰", 15 - (~android.view.Gravity.getAbsoluteGravity(0, 0)), objArr58);
                                java.lang.Object invoke2 = cls6.getMethod((java.lang.String) objArr58[0], java.lang.String.class).invoke(context, objArr56);
                                if (invoke2 != null) {
                                    java.lang.Object[] objArr59 = new java.lang.Object[1];
                                    m("年ꄥ\uf5ba﮽ﾔ胻\uf5ef橝띜\ue56b弽퀳ச\udca1坊\uec5f涐搸蜼\ue1c1櫣䛥\ua7de谰\ufaed៩\u2069ǔﳚ熚匦쥢\udf91☲雧퍻ⴖ\u0ace", 36 - (~(-(-(android.view.ViewConfiguration.getScrollBarSize() >> 8)))), objArr59);
                                    java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr59[0]);
                                    java.lang.Object[] objArr60 = new java.lang.Object[1];
                                    m("雧퍻녱ꯁ臗ꈜ谦뚈霾㏕ᧈ㻑䙙懢⇪欶", 16 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr60);
                                    java.util.List list = (java.util.List) cls7.getMethod((java.lang.String) objArr60[0], null).invoke(invoke2, null);
                                    if (list != null) {
                                        java.util.Iterator it2 = list.iterator();
                                        loop1: while (it2.hasNext()) {
                                            java.lang.Object next = it2.next();
                                            int i277 = -android.widget.ExpandableListView.getPackedPositionGroup(0L);
                                            int i278 = -(android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                            float scrollFriction = android.view.ViewConfiguration.getScrollFriction();
                                            int i279 = -android.view.Gravity.getAbsoluteGravity(0, 0);
                                            java.lang.Object[] objArr61 = new java.lang.Object[1];
                                            n(((1987808091 | i277) << 1) - (i277 ^ 1987808091), (short) ((i278 & 64) + (i278 | 64)), (scrollFriction > 0.0f ? 1 : (scrollFriction == 0.0f ? 0 : -1)) - 1276746281, (i279 ^ (-46)) + ((i279 & (-46)) << 1), (byte) android.view.View.resolveSize(0, 0), objArr61);
                                            java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr61[0]);
                                            int i280 = -(android.view.ViewConfiguration.getDoubleTapTimeout() >> 16);
                                            java.lang.Object[] objArr62 = new java.lang.Object[1];
                                            m("雧퍻䩁됎\u139f䜍냸캖雧퍻㈛ꀎ쬮蠧", ((i280 | 14) << 1) - (i280 ^ 14), objArr62);
                                            java.lang.String str26 = (java.lang.String) cls8.getMethod((java.lang.String) objArr62[0], null).invoke(next, null);
                                            int i281 = -android.graphics.Color.alpha(0);
                                            java.lang.Object[] objArr63 = new java.lang.Object[1];
                                            m("年ꄥ\uf5ba﮽ﾔ胻\uf5ef橝띜\ue56b弽퀳ச\udca1坊\uec5f涐搸蜼\ue1c1櫣䛥\ua7de谰\ufaed៩\u2069ǔﳚ熚匦쥢\udf91☲雧퍻ⴖ\u0ace", (i281 ^ 37) + ((i281 & 37) << 1), objArr63);
                                            java.lang.Class<?> cls9 = java.lang.Class.forName((java.lang.String) objArr63[0]);
                                            int i282 = -android.view.View.getDefaultSize(0, 0);
                                            java.lang.Object[] objArr64 = new java.lang.Object[1];
                                            m("擅䓟嵥綠뷑訮硠溓㸚\udc8b閡㙣㥯\ue601彀ိ꾼䫝", ((i282 | 17) << 1) - (i282 ^ 17), objArr64);
                                            if (((java.lang.Boolean) cls9.getMethod((java.lang.String) objArr64[0], java.lang.String.class).invoke(invoke2, str26)).booleanValue() && str26.length() - 20 >= 0) {
                                                int i283 = 0;
                                                while (i283 <= length) {
                                                    java.lang.Object[] objArr65 = {str26.substring(i283, i283 + 20), 931995};
                                                    java.lang.Object d19 = com.facetec.sdk.al.d(-582857820);
                                                    if (d19 == null) {
                                                        char lastIndexOf3 = (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1);
                                                        float complexToFraction3 = android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f);
                                                        int tapTimeout = android.view.ViewConfiguration.getTapTimeout();
                                                        byte b17 = (byte) 0;
                                                        byte b18 = (byte) (b17 + 1);
                                                        obj = invoke2;
                                                        it = it2;
                                                        java.lang.Object[] objArr66 = new java.lang.Object[1];
                                                        p(b17, b18, (byte) (b18 - 1), objArr66);
                                                        d19 = com.facetec.sdk.al.c(lastIndexOf3, 2365 - (complexToFraction3 > 0.0f ? 1 : (complexToFraction3 == 0.0f ? 0 : -1)), 24 - (tapTimeout >> 16), 2058170716, false, (java.lang.String) objArr66[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                                                    } else {
                                                        obj = invoke2;
                                                        it = it2;
                                                    }
                                                    long longValue8 = ((java.lang.Long) ((java.lang.reflect.Method) d19).invoke(null, objArr65)).longValue();
                                                    long j47 = -77309377;
                                                    long j48 = 46;
                                                    java.lang.String str27 = str26;
                                                    int i284 = length;
                                                    long j49 = -1;
                                                    long j50 = longValue8 ^ j49;
                                                    long j51 = i7;
                                                    long j52 = j51 ^ j49;
                                                    long j53 = (j48 * j47) + (j48 * longValue8) + ((((j50 | j52) ^ j49) | j47) * (-90)) + ((-45) * (((j50 | j51) ^ j49) | ((longValue8 | j47) ^ j49))) + (45 * (j50 | ((j51 | (j47 ^ j49)) ^ j49) | (j49 ^ (j52 | j47)))) + 1236506775;
                                                    int i285 = (int) java.lang.Runtime.getRuntime().totalMemory();
                                                    int i286 = ~i285;
                                                    int i287 = ((int) (j53 >> 32)) & ((((~(196298299 | i286)) | (~((-1633524711) | i285))) * 1900) + 1871737038 + (((~((-196298300) | i285)) | (~(1633524710 | i286))) * (-950)) + (((~(i285 | 1633524710)) | (~(i286 | (-196298300)))) * 950));
                                                    int i288 = ((int) j53) & (((((~((-1695023634) | i264)) | (~((-1162717253) | i264))) * (-867)) - 1972008908) + (((~((-1695023634) | i7)) | 1158152192 | (~((-1162717253) | i7))) * (-1734)) + (((~((-1158152193) | i264)) | (~((-536871442) | i7)) | (~((-4565061) | i7))) * 867));
                                                    if (((i288 ^ i287) | (i288 & i287)) == 1245577864) {
                                                        objArr6 = new java.lang.Object[]{null, new int[]{i7 ^ 70}, new int[]{i7}, new int[1], null};
                                                        int uptimeMillis3 = (int) android.os.SystemClock.uptimeMillis();
                                                        int i289 = ~uptimeMillis3;
                                                        int i290 = (i4 - (~((((((~((-1330313) | i289)) | (~(301989821 | uptimeMillis3))) * 988) - 449095147) + ((((~(uptimeMillis3 | (-20205497))) | 18875184) | (~(i289 | 301989821))) * 988)) + 16))) - 1;
                                                        int i291 = i290 ^ (i290 << 13);
                                                        int i292 = i291 >>> 17;
                                                        int i293 = (~(i291 & i292)) & (i291 | i292);
                                                        c4 = 0;
                                                        ((int[]) objArr6[3])[0] = i293 ^ (i293 << 5);
                                                        break loop1;
                                                    }
                                                    i6 = i4;
                                                    i283 = (i283 | 1) + (i283 & 1);
                                                    invoke2 = obj;
                                                    str26 = str27;
                                                    it2 = it;
                                                    length = i284;
                                                }
                                            }
                                        }
                                    }
                                }
                                objArr6 = new java.lang.Object[]{null, new int[]{i7}, new int[]{i7}, new int[1], null};
                                int i294 = (i6 - (~(((((~(88803153 | r1)) | 409668159) * (-366)) - 1863600975) + (((~(android.os.Process.myTid() | 493555583)) | 4915729) * 366)))) - 1;
                                int i295 = i294 << 13;
                                int i296 = (i294 & (~i295)) | ((~i294) & i295);
                                int i297 = i296 ^ (i296 >>> 17);
                                int i298 = i297 << 5;
                                int[] iArr9 = (int[]) objArr6[3];
                                int i299 = (i297 & (~i298)) | ((~i297) & i298);
                                c4 = 0;
                                iArr9[0] = i299;
                                if (((int[]) objArr6[1])[c4] != i7) {
                                    return objArr6;
                                }
                            } catch (java.lang.Throwable th13) {
                                java.lang.Throwable cause6 = th13.getCause();
                                if (cause6 != null) {
                                    throw cause6;
                                }
                                throw th13;
                            }
                        }
                        java.lang.Object[] objArr67 = new java.lang.Object[1];
                        m("籗ﻐ㽱ﮙ硧佉ꐷ⇴\uea5d\uf831댨犈", 12 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr67);
                        java.lang.Object[] objArr68 = {(java.lang.String) objArr67[0]};
                        java.lang.Object d20 = com.facetec.sdk.al.d(2084539986);
                        if (d20 == null) {
                            char mode = (char) (6935 - android.view.View.MeasureSpec.getMode(0));
                            int absoluteGravity = android.view.Gravity.getAbsoluteGravity(0, 0);
                            double convertQuartSecToDecDegrees = android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0);
                            byte b19 = (byte) 0;
                            byte b20 = b19;
                            java.lang.Object[] objArr69 = new java.lang.Object[1];
                            p(b19, b20, b20, objArr69);
                            d20 = com.facetec.sdk.al.c(mode, absoluteGravity + 2389, 23 - (convertQuartSecToDecDegrees > 0.0d ? 1 : (convertQuartSecToDecDegrees == 0.0d ? 0 : -1)), -607062870, false, (java.lang.String) objArr69[0], new java.lang.Class[]{java.lang.String.class});
                        }
                        long longValue9 = ((java.lang.Long) ((java.lang.reflect.Method) d20).invoke(null, objArr68)).longValue();
                        long j54 = -1084710824;
                        int nextInt4 = new java.util.Random().nextInt();
                        long j55 = com.knotapi.knot.utilities.Constants.ID_KROGER;
                        long j56 = -369;
                        long j57 = nextInt4;
                        long j58 = -1;
                        long j59 = j57 ^ j58;
                        long j60 = (j54 ^ j58) | j59;
                        long j61 = (j55 * j54) + (j55 * longValue9) + ((j54 | longValue9 | j59) * j56) + (j56 * ((j60 ^ j58) | longValue9)) + (369 * ((((longValue9 ^ j58) | j54) ^ j58) | ((j54 | j57) ^ j58) | ((j60 | longValue9) ^ j58))) + 2056860166;
                        int i300 = ~((-78007082) | i264);
                        int i301 = ((int) (j61 >> 32)) & ((((~((-1515300053) | i7)) | 1515233492 | i300) * (-470)) + 632396514 + ((i300 | (~((-66561) | i7))) * 470));
                        int nextInt5 = new java.util.Random().nextInt(676671807);
                        int i302 = ((int) j61) & ((((~((-2130273033) | nextInt5)) | 710427400) * 576) + 1771465493 + (((~((~nextInt5) | (-1419845633))) | android.R.string.global_action_screenshot) * 576) + 1184289280);
                        if (((i302 ^ i301) | (i302 & i301)) != 0) {
                            objArr2 = new java.lang.Object[]{null, new int[]{(~(i7 & 50)) & (i7 | 50)}, new int[]{i7}, new int[1], null};
                            int elapsedCpuTime2 = (int) android.os.Process.getElapsedCpuTime();
                            int i303 = ~elapsedCpuTime2;
                            int i304 = ((((~(1069135867 | i303)) | (~((-33554723) | elapsedCpuTime2))) * 988) - 1001519483) + (((~(elapsedCpuTime2 | 714716139)) | 354419728 | (~(i303 | (-33554723)))) * 988) + 16;
                            int i305 = (i4 ^ i304) + ((i304 & i4) << 1);
                            int i306 = i305 << 13;
                            int i307 = (~(i305 & i306)) & (i305 | i306);
                            int i308 = i307 ^ (i307 >>> 17);
                            c2 = 0;
                            ((int[]) objArr2[3])[0] = i308 ^ (i308 << 5);
                        } else {
                            java.lang.Object[] objArr70 = {null, new int[]{i7}, new int[]{i7}, new int[]{r2}, null};
                            int i309 = (((~(121030388 | i7)) | (-199834618)) * (-465)) + 997937468 + (((~((-199834618) | i7)) | 121030388) * 930) + (((-147405066) | i7) * 465);
                            int i310 = (i4 ^ i309) + ((i309 & i4) << 1);
                            int i311 = (i310 << 13) ^ i310;
                            int i312 = i311 >>> 17;
                            int i313 = (~(i311 & i312)) & (i311 | i312);
                            int i314 = i313 ^ (i313 << 5);
                            c2 = 0;
                            objArr2 = objArr70;
                        }
                        if (((int[]) objArr2[1])[c2] != i7) {
                            return objArr2;
                        }
                        int keyCodeFromString = android.view.KeyEvent.keyCodeFromString("");
                        int d21 = com.facetec.sdk.gj.a.d();
                        int i315 = ~d21;
                        int i316 = (keyCodeFromString * 46) + 1244856670 + (((~((i315 ^ (-1987808042)) | (i315 & (-1987808042)))) | keyCodeFromString) * (-90));
                        int i317 = ~((d21 ^ (-1987808042)) | (d21 & (-1987808042)));
                        int i318 = ~((1987808041 ^ keyCodeFromString) | (1987808041 & keyCodeFromString));
                        int i319 = ((i317 & i318) | (i317 ^ i318)) * (-45);
                        int i320 = ((i316 | i319) << 1) - (i316 ^ i319);
                        int i321 = ~(d21 | (~keyCodeFromString));
                        int i322 = (i321 ^ (-1987808042)) | (i321 & (-1987808042));
                        int i323 = ~(keyCodeFromString | i315);
                        int i324 = -(-(((i323 ^ i322) | (i323 & i322)) * 45));
                        short s5 = (short) ((-59) - (~(-android.widget.ExpandableListView.getPackedPositionType(0L))));
                        int indexOf7 = android.text.TextUtils.indexOf("", "", 0);
                        int i325 = -(-android.view.View.MeasureSpec.getSize(0));
                        java.lang.Object[] objArr71 = new java.lang.Object[1];
                        n((i320 ^ i324) + ((i324 & i320) << 1), s5, (-1276746498) - indexOf7, (i325 ^ (-46)) + ((i325 & (-46)) << 1), (byte) (android.os.Process.myTid() >> 22), objArr71);
                        java.lang.Object[] objArr72 = {(java.lang.String) objArr71[0]};
                        java.lang.Object d22 = com.facetec.sdk.al.d(2084539986);
                        if (d22 == null) {
                            char c6 = (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 6934);
                            int packedPositionGroup = android.widget.ExpandableListView.getPackedPositionGroup(0L);
                            int minimumFlingVelocity = android.view.ViewConfiguration.getMinimumFlingVelocity();
                            byte b21 = (byte) 0;
                            byte b22 = b21;
                            java.lang.Object[] objArr73 = new java.lang.Object[1];
                            p(b21, b22, b22, objArr73);
                            d22 = com.facetec.sdk.al.c(c6, 2389 - packedPositionGroup, 23 - (minimumFlingVelocity >> 16), -607062870, false, (java.lang.String) objArr73[0], new java.lang.Class[]{java.lang.String.class});
                        }
                        long longValue10 = ((java.lang.Long) ((java.lang.reflect.Method) d22).invoke(null, objArr72)).longValue();
                        long j62 = 315941653;
                        long j63 = -743;
                        long j64 = j62 | longValue10;
                        long j65 = i7;
                        long j66 = 744;
                        long j67 = j65 ^ j58;
                        long j68 = (j63 * j62) + (j63 * longValue10) + ((-744) * ((j64 ^ j58) | ((j62 | j65) ^ j58) | ((longValue10 | j65) ^ j58))) + ((j67 | (((longValue10 ^ j58) | (j62 ^ j58)) ^ j58)) * j66) + (j66 * (j64 | j65)) + 656207689;
                        int elapsedRealtime4 = (int) android.os.SystemClock.elapsedRealtime();
                        int i326 = ~elapsedRealtime4;
                        int i327 = ((int) (j68 >> 32)) & ((((~((-1515227201) | elapsedRealtime4)) | (~((-553731369) | i326))) * 497) + 1548913376 + (((~(elapsedRealtime4 | (-553731369))) | (~(i326 | 631732157)) | (-2146959358)) * 497));
                        int i328 = ((int) j68) & (((i264 | 1408906623) * (-490)) + 93923827 + (((~(1408246894 | i7)) | 659729) * 490) + 1315060462);
                        if (((i328 ^ i327) | (i328 & i327)) != 0) {
                            objArr3 = new java.lang.Object[]{null, new int[]{(i7 & (-61)) | (i264 & 60)}, new int[]{i7}, new int[1], null};
                            int uptimeMillis4 = (int) android.os.SystemClock.uptimeMillis();
                            int i329 = ~uptimeMillis4;
                            int i330 = (((~((-541484694) | i329)) | 1556 | (~((-320866563) | uptimeMillis4))) * 717) + 489190142 + (((~(uptimeMillis4 | (-541484694))) | (~(i329 | (-320866563))) | 1556) * 717);
                            j2 = j65;
                            int i331 = (i330 & 16) + (i330 | 16) + i4;
                            int i332 = i331 << 13;
                            int i333 = ((~i332) & i331) | ((~i331) & i332);
                            int i334 = i333 >>> 17;
                            int i335 = (~(i333 & i334)) & (i333 | i334);
                            int i336 = i335 << 5;
                            int[] iArr10 = (int[]) objArr3[3];
                            int i337 = (i335 & (~i336)) | ((~i335) & i336);
                            i9 = 0;
                            iArr10[0] = i337;
                        } else {
                            j2 = j65;
                            objArr3 = new java.lang.Object[]{null, new int[]{i7}, new int[]{i7}, new int[]{r2}, null};
                            int i338 = (((~((-664537496) | i7)) | (-985402502)) * (-465)) + 1214783368 + (((~((-985402502) | i7)) | (-664537496)) * 930) + (((-580651142) | i7) * 465);
                            int i339 = -(-(i338 * 367));
                            int i340 = -(-(i338 * (-366)));
                            int i341 = ~i338;
                            int i342 = ~(i338 | (i338 ^ (-1)));
                            int i343 = ~((i341 ^ i7) | (i341 & i7));
                            int i344 = ((((((i339 | i340) << 1) - (i339 ^ i340)) - (~(i343 * (-366)))) - 1) - (~(((i342 ^ i343) | (i343 & i342)) * 366))) - 1;
                            int i345 = ((i4 | i344) << 1) - (i4 ^ i344);
                            int i346 = i345 << 13;
                            int i347 = (i345 & (~i346)) | ((~i345) & i346);
                            int i348 = i347 >>> 17;
                            int i349 = (~(i347 & i348)) & (i347 | i348);
                            int i350 = i349 ^ (i349 << 5);
                            i9 = 0;
                        }
                        if (((int[]) objArr3[1])[i9] != i7) {
                            return objArr3;
                        }
                        int i351 = (android.util.TypedValue.complexToFloat(i9) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(i9) == 0.0f ? 0 : -1));
                        int i352 = i351 * 677;
                        int i353 = ((-1740631323) & i352) + (i352 | (-1740631323));
                        int i354 = (i351 ^ i7) | (i351 & i7);
                        int i355 = -(-(((i354 ^ (-1987808042)) | (i354 & (-1987808042))) * (-676)));
                        int i356 = ~i351;
                        int i357 = ~((i356 ^ (-1987808042)) | (i356 & (-1987808042)));
                        int i358 = ~(i264 | (-1987808042));
                        int i359 = (i358 ^ i357) | (i357 & i358);
                        int i360 = (1987808041 & i351) | (1987808041 ^ i351);
                        int i361 = ~((i360 ^ i7) | (i360 & i7));
                        int edgeSlop2 = android.view.ViewConfiguration.getEdgeSlop() >> 16;
                        int i362 = (edgeSlop2 * (-375)) + 10125;
                        int i363 = ~edgeSlop2;
                        int i364 = ~((i363 ^ 26) | (i363 & 26));
                        int i365 = (i364 & i7) | (i364 ^ i7);
                        int i366 = ~((edgeSlop2 ^ (-27)) | (edgeSlop2 & (-27)));
                        int i367 = ((i365 ^ i366) | (i365 & i366)) * 376;
                        int i368 = ~((i363 ^ i7) | (i363 & i7));
                        short s6 = (short) ((((((i362 | i367) << 1) - (i362 ^ i367)) + ((i366 | (~((i264 ^ edgeSlop2) | (edgeSlop2 & i264)))) * (-376))) - (~(((i368 & (-27)) | (i368 ^ (-27))) * 376))) - 1);
                        int i369 = -(-(android.view.ViewConfiguration.getPressedStateDuration() >> 16));
                        int i370 = -android.text.TextUtils.getOffsetAfter("", 0);
                        java.lang.Object[] objArr74 = new java.lang.Object[1];
                        n((((((i353 | i355) << 1) - (i355 ^ i353)) - (~(((~(i264 | i351)) | (~(((-1987808042) & i351) | (i351 ^ (-1987808042))))) * 676))) - 1) + (((i361 & i359) | (i359 ^ i361)) * 676), s6, (((-1276746478) | i369) << 1) - ((-1276746478) ^ i369), (i370 & (-46)) + (i370 | (-46)), (byte) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr74);
                        java.lang.Object[] objArr75 = {(java.lang.String) objArr74[0]};
                        java.lang.Object d23 = com.facetec.sdk.al.d(1873189073);
                        if (d23 == null) {
                            char c7 = (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 6934);
                            long zoomControlsTimeout = android.view.ViewConfiguration.getZoomControlsTimeout();
                            int packedPositionChild2 = android.widget.ExpandableListView.getPackedPositionChild(0L);
                            byte b23 = (byte) 0;
                            byte b24 = (byte) (b23 + 1);
                            java.lang.Object[] objArr76 = new java.lang.Object[1];
                            p(b23, b24, (byte) (b24 - 1), objArr76);
                            d23 = com.facetec.sdk.al.c(c7, (zoomControlsTimeout > 0L ? 1 : (zoomControlsTimeout == 0L ? 0 : -1)) + 2388, 22 - packedPositionChild2, -934682071, false, (java.lang.String) objArr76[0], new java.lang.Class[]{java.lang.String.class});
                        }
                        long longValue11 = ((java.lang.Long) ((java.lang.reflect.Method) d23).invoke(null, objArr75)).longValue();
                        long j69 = -1170711762;
                        long j70 = j69 ^ j58;
                        long j71 = (303 * j69) + ((-301) * longValue11) + ((-302) * ((((j70 | j67) | longValue11) ^ j58) | (((j69 | longValue11) | j2) ^ j58))) + ((-604) * (((j70 | longValue11) | j2) ^ j58)) + (302 * ((((longValue11 ^ j58) | j69) ^ j58) | ((longValue11 | j2) ^ j58))) + 2107791405;
                        int maxMemory2 = (int) java.lang.Runtime.getRuntime().maxMemory();
                        int i371 = ~maxMemory2;
                        int i372 = ((int) (j71 >> 32)) & (((((~((-1360540057) | i371)) | r6) * 1150) - 334238508) + (((~((-76686355) | maxMemory2)) | (~(76686354 | i371))) * (-575)) + (((~(maxMemory2 | (-1360540057))) | (~(i371 | 1360540056))) * 575));
                        int i373 = ((int) j71) & ((((~(i264 | (-17432609))) * 130) - 1708175477) + (((~((-17432609) | i2)) | 612377605) * 130));
                        if (((i372 ^ i373) | (i372 & i373)) != 0) {
                            objArr4 = new java.lang.Object[]{null, new int[]{i2 ^ 80}, new int[]{i2}, new int[]{r5 ^ (r5 << 5)}, null};
                            int i374 = (((~((-83872981) | i2)) | 14665924) * (-283)) + 176354201 + ((~((-69207057) | i2)) * 283);
                            int i375 = (i374 & 16) + (i374 | 16);
                            int i376 = (i4 ^ i375) + ((i375 & i4) << 1);
                            int i377 = i376 << 13;
                            int i378 = (~(i377 & i376)) & (i376 | i377);
                            int i379 = i378 >>> 17;
                            int i380 = (i378 & (~i379)) | ((~i378) & i379);
                            i10 = 0;
                        } else {
                            java.lang.Object[] objArr77 = {null, new int[]{i2}, new int[]{i2}, new int[1], null};
                            int i381 = (int) java.lang.Runtime.getRuntime().totalMemory();
                            int i382 = ~i381;
                            int i383 = -(-((((19407796 | i381) * (-50)) - 896703757) + (((~(i381 | (-18875185))) | (~((-282582026) | i382))) * 50) + (((~(19407796 | i382)) | (~(i382 | (-301457210))) | 282582025) * 50)));
                            int i384 = (i4 & i383) + (i383 | i4);
                            int i385 = i384 << 13;
                            int i386 = ((~i385) & i384) | ((~i384) & i385);
                            int i387 = i386 >>> 17;
                            int i388 = (i386 & (~i387)) | ((~i386) & i387);
                            int i389 = i388 << 5;
                            int[] iArr11 = (int[]) objArr77[3];
                            int i390 = (~(i388 & i389)) & (i388 | i389);
                            i10 = 0;
                            iArr11[0] = i390;
                            objArr4 = objArr77;
                        }
                        if (((int[]) objArr4[1])[i10] != i2) {
                            return objArr4;
                        }
                        int red3 = android.graphics.Color.red(i10);
                        java.lang.Object[] objArr78 = new java.lang.Object[1];
                        m("攝\ue17b㇗顠ꉾ춨≆ૻ㟾笭讙྄栴쟗㮳뎿ꇣ䤁\ude0dﺂ웗鎋ߪ虑ĕ谁楹\uf54e⼠\ue924눁\u2fee倅\uf670⮪咚\u139f䜍ꐵ∡鈫⑄", (red3 & 42) + (red3 | 42), objArr78);
                        java.lang.Object[] objArr79 = {(java.lang.String) objArr78[i10]};
                        java.lang.Object d24 = com.facetec.sdk.al.d(1873189073);
                        if (d24 == null) {
                            char maximumDrawingCacheSize = (char) (6935 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                            int indexOf8 = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                            int pressedStateDuration4 = android.view.ViewConfiguration.getPressedStateDuration();
                            byte b25 = (byte) 0;
                            byte b26 = (byte) (b25 + 1);
                            java.lang.Object[] objArr80 = new java.lang.Object[1];
                            p(b25, b26, (byte) (b26 - 1), objArr80);
                            d24 = com.facetec.sdk.al.c(maximumDrawingCacheSize, 2388 - indexOf8, (pressedStateDuration4 >> 16) + 23, -934682071, false, (java.lang.String) objArr80[0], new java.lang.Class[]{java.lang.String.class});
                        }
                        long longValue12 = ((java.lang.Long) ((java.lang.reflect.Method) d24).invoke(null, objArr79)).longValue();
                        long j72 = -421234263;
                        long j73 = 623;
                        long j74 = longValue12 ^ j58;
                        long j75 = j74 | j72;
                        long j76 = (624 * j72) + ((-622) * longValue12) + (((j75 | j2) ^ j58) * j73) + ((-623) * (j67 | ((longValue12 | (j72 ^ j58)) ^ j58))) + (j73 * ((j75 ^ j58) | ((j74 | j2) ^ j58) | ((j72 | j2) ^ j58))) + 1358313906;
                        int nextInt6 = new java.util.Random().nextInt(577050256);
                        int i391 = ~nextInt6;
                        int i392 = ((int) (j76 >> 32)) & ((((-1726198157) | nextInt6) * (-859)) + 1729321982 + (((~(nextInt6 | 1744042444)) | (~((-1726198157) | i391))) * 859) + (((~(1131542728 | i391)) | 612499716) * 859));
                        int nextInt7 = new java.util.Random().nextInt();
                        int i393 = ((int) j76) & (((((-304162) | nextInt7) * (-627)) - 635053948) + (((~(1622604833 | nextInt7)) | 185378423) * (-627)) + (((~((~nextInt7) | (-1622604834))) | (~(185378423 | nextInt7))) * 627));
                        if (((i392 ^ i393) | (i392 & i393)) != 0) {
                            objArr5 = new java.lang.Object[]{null, new int[]{i2 ^ 90}, new int[]{i2}, new int[]{(r5 & (~r10)) | r12}, null};
                            int i394 = (((i264 | (-83886361)) * (-369)) - 1539032438) + (((~(i264 | (-452062439))) | (-131197433)) * (-369)) + (((~(452062438 | i2)) | (-535948799) | (~(i264 | (-47311073)))) * 369);
                            int i395 = (i394 & 16) + (i394 | 16);
                            int i396 = (i4 & i395) + (i395 | i4);
                            int i397 = (i396 << 13) ^ i396;
                            int i398 = i397 >>> 17;
                            int i399 = (i397 & (~i398)) | ((~i397) & i398);
                            int i400 = i399 << 5;
                            int i401 = (~i399) & i400;
                            c3 = 0;
                        } else {
                            java.lang.Object[] objArr81 = {null, new int[]{i2}, new int[]{i2}, new int[1], null};
                            int i402 = ~android.os.Process.myTid();
                            int i403 = (((~(491814066 | i402)) | 35651908) * (-160)) + 349363757 + (((~(i402 | 170949060)) | 491814066) * 160);
                            int i404 = (i403 << 1) - i403;
                            int d25 = com.facetec.sdk.gj.a.d();
                            int i405 = i404 * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE;
                            int i406 = -(-(i4 * (-282)));
                            int i407 = (i405 & i406) + (i405 | i406);
                            int i408 = ~i404;
                            int i409 = ~((i408 ^ i4) | (i408 & i4));
                            int i410 = ~(i408 | d25);
                            int i411 = -(-(((i410 & i409) | (i409 ^ i410)) * (-283)));
                            int i412 = ((i407 | i411) << 1) - (i411 ^ i407);
                            int i413 = ~i4;
                            int i414 = -(-((~((i404 ^ i413) | (i413 & i404))) * 283));
                            int i415 = (i412 & i414) + (i414 | i412) + ((~((i408 & i413) | (i408 ^ i413) | d25)) * 283);
                            int i416 = i415 << 13;
                            int i417 = ((~i416) & i415) | ((~i415) & i416);
                            int i418 = i417 >>> 17;
                            int i419 = (i417 & (~i418)) | ((~i417) & i418);
                            c3 = 0;
                            ((int[]) objArr81[3])[0] = i419 ^ (i419 << 5);
                            objArr5 = objArr81;
                        }
                        if (((int[]) objArr5[1])[c3] != i2) {
                            return objArr5;
                        }
                        int i420 = -(-android.widget.ExpandableListView.getPackedPositionChild(0L));
                        int i421 = -(-(android.view.ViewConfiguration.getTapTimeout() >> 16));
                        int i422 = -android.text.TextUtils.indexOf("", "");
                        int i423 = -android.text.TextUtils.getOffsetBefore("", 0);
                        java.lang.Object[] objArr82 = new java.lang.Object[1];
                        n(((1987808042 | i420) << 1) - (i420 ^ 1987808042), (short) ((i421 ^ 10) + ((i421 & 10) << 1)), (-1276746443) - (~i422), (i423 & (-46)) + (i423 | (-46)), (byte) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), objArr82);
                        java.lang.Object[] objArr83 = {(java.lang.String) objArr82[0]};
                        java.lang.Object d26 = com.facetec.sdk.al.d(1873189073);
                        if (d26 == null) {
                            char makeMeasureSpec = (char) (android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 6935);
                            int edgeSlop3 = android.view.ViewConfiguration.getEdgeSlop();
                            float scrollFriction2 = android.view.ViewConfiguration.getScrollFriction();
                            byte b27 = (byte) 0;
                            byte b28 = (byte) (b27 + 1);
                            java.lang.Object[] objArr84 = new java.lang.Object[1];
                            p(b27, b28, (byte) (b28 - 1), objArr84);
                            d26 = com.facetec.sdk.al.c(makeMeasureSpec, 2389 - (edgeSlop3 >> 16), (scrollFriction2 > 0.0f ? 1 : (scrollFriction2 == 0.0f ? 0 : -1)) + 22, -934682071, false, (java.lang.String) objArr84[0], new java.lang.Class[]{java.lang.String.class});
                        }
                        long longValue13 = ((java.lang.Long) ((java.lang.reflect.Method) d26).invoke(null, objArr83)).longValue();
                        long j77 = 767714108;
                        long j78 = 69;
                        long j79 = j77 ^ j58;
                        long j80 = longValue13 ^ j58;
                        long j81 = (70 * j77) + ((-68) * longValue13) + (((((j79 | j80) | j2) ^ j58) | (((j77 | longValue13) | j2) ^ j58)) * j78) + ((-69) * (((longValue13 | j2) ^ j58) | ((j79 | longValue13) ^ j58) | ((j79 | j2) ^ j58))) + (j78 * (j58 ^ (j80 | j77))) + 169365535;
                        int freeMemory2 = (int) java.lang.Runtime.getRuntime().freeMemory();
                        int i424 = ((int) (j81 >> 32)) & ((((-546374801) | freeMemory2) * (-381)) + 1336827470 + (((~((~freeMemory2) | (-1660096241))) | (-630298005)) * 381) + 2010368592);
                        int i425 = i264 | (-234385220);
                        int i426 = ((int) j81) & ((i425 * 495) + 1318819420 + (((~i425) | (-1341779816)) * 495));
                        if (((i424 ^ i426) | (i424 & i426)) != 0) {
                            java.lang.Object[] objArr85 = {null, new int[]{i2 ^ 100}, new int[]{i2}, new int[]{r2 ^ (r2 << 5)}, null};
                            int i427 = ~(140165247 | i2);
                            int i428 = (((~(i264 | (-461030254))) | i427) * 1150) + 507080858 + ((i427 | (~(i264 | (-140165248)))) * (-575)) + (((~((-461030254) | i2)) | (~(i264 | 461030253))) * 575);
                            int i429 = (i428 ^ 16) + ((i428 & 16) << 1);
                            int i430 = ((i4 | i429) << 1) - (i429 ^ i4);
                            int i431 = i430 << 13;
                            int i432 = ((~i431) & i430) | ((~i430) & i431);
                            int i433 = i432 >>> 17;
                            int i434 = (i432 & (~i433)) | ((~i432) & i433);
                            return objArr85;
                        }
                        java.lang.Object[] objArr86 = {null, new int[]{i2}, new int[]{i2}, new int[1], null};
                        int nextInt8 = new java.util.Random().nextInt(1579535388);
                        int i435 = (((943086497 | r3) * (-757)) - 151961018) + ((~(1026972595 | nextInt8)) * 1514) + (((~(nextInt8 | (-83886099))) | (~((~nextInt8) | 622221491)) | 404751104) * 757);
                        int i436 = (i435 << 1) - i435;
                        int i437 = (i4 ^ i436) + ((i436 & i4) << 1);
                        int i438 = i437 << 13;
                        int i439 = (~(i438 & i437)) & (i438 | i437);
                        int i440 = i439 ^ (i439 >>> 17);
                        ((int[]) objArr86[3])[0] = i440 ^ (i440 << 5);
                        return objArr86;
                    } catch (java.lang.Throwable th14) {
                        java.lang.Throwable cause7 = th14.getCause();
                        if (cause7 != null) {
                            throw cause7;
                        }
                        throw th14;
                    }
                    try {
                        try {
                            nanoTime = new java.lang.Object[]{100L};
                            java.lang.Class<?> cls10 = java.lang.Class.forName(str2);
                            int i441 = -(-android.view.KeyEvent.keyCodeFromString(""));
                            int i442 = (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            int d27 = com.facetec.sdk.gj.a.d();
                            int i443 = (i442 * (-716)) + 90405;
                            int i444 = ~i442;
                            int i445 = -(-((i444 | 63) * (-1434)));
                            int i446 = ~d27;
                            int i447 = ~((i446 & 63) | (i446 ^ 63));
                            int i448 = ~((i442 ^ 63) | (i442 & 63));
                            int i449 = (i447 ^ i448) | (i447 & i448);
                            int i450 = (i444 & (-64)) | (i444 ^ (-64));
                            int i451 = ~(i450 | d27);
                            int i452 = ((((i443 | i445) << 1) - (i443 ^ i445)) - (~(-(-(((i449 ^ i451) | (i449 & i451)) * 717))))) - 1;
                            int i453 = ~((i450 & i446) | (i446 ^ i450));
                            int i454 = (i448 ^ i453) | (i453 & i448);
                            int i455 = ~((d27 ^ 63) | (d27 & 63));
                            int i456 = ((i454 ^ i455) | (i454 & i455)) * 717;
                            int argb = android.graphics.Color.argb(0, 0, 0, 0);
                            int i457 = -(-(android.view.ViewConfiguration.getTapTimeout() >> 16));
                            java.lang.Object[] objArr87 = new java.lang.Object[1];
                            n((i441 & 1987808100) + (i441 | 1987808100), (short) ((i452 ^ i456) + ((i456 & i452) << 1)), argb - 1276746352, (i457 ^ (-46)) + ((i457 & (-46)) << 1), (byte) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr87);
                            str6 = null;
                            r7 = (java.lang.String) objArr87[0];
                            cls10.getMethod(r7, java.lang.Long.TYPE).invoke(newInstance, nanoTime);
                            try {
                                java.lang.Object[] objArr88 = {10L};
                                java.lang.Class<?> cls11 = java.lang.Class.forName(str2);
                                int i458 = -android.text.TextUtils.getTrimmedLength("");
                                int packedPositionType3 = android.widget.ExpandableListView.getPackedPositionType(0L);
                                short s7 = (short) (((packedPositionType3 | 63) << 1) - (packedPositionType3 ^ 63));
                                int i459 = (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                int i460 = -(-android.graphics.Color.red(0));
                                int i461 = (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                int d28 = com.facetec.sdk.gj.a.d();
                                int i462 = ((i461 * (-1965)) - 984) + (i461 * 983);
                                int i463 = ~i461;
                                int i464 = ~d28;
                                int i465 = ~i464;
                                int i466 = -(-(((i463 ^ i465) | (i465 & i463)) * (-983)));
                                int i467 = ~(i464 | i463);
                                i17 = i16;
                                int i468 = ~(i463 | (~i463));
                                obj4 = newInstance;
                                byte b29 = (byte) ((((i462 | i466) << 1) - (i462 ^ i466)) + (((i468 & i467) | (i468 ^ i467)) * 983));
                                try {
                                    java.lang.Object[] objArr89 = new java.lang.Object[1];
                                    n((1987808100 & i458) + (i458 | 1987808100), s7, ((-1276746353) ^ i459) + ((i459 & (-1276746353)) << 1), ((i460 | (-46)) << 1) - (i460 ^ (-46)), b29, objArr89);
                                    cls11.getMethod((java.lang.String) objArr89[0], java.lang.Long.TYPE).invoke(newInstance2, objArr88);
                                    try {
                                        exec.destroy();
                                    } catch (java.lang.Exception unused13) {
                                    }
                                    try {
                                        try {
                                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                            d2 = com.facetec.sdk.al.d(785456562);
                                            if (d2 == null) {
                                                try {
                                                    char c8 = (char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                                                    int packedPositionChild3 = android.widget.ExpandableListView.getPackedPositionChild(0L);
                                                    int windowTouchSlop = android.view.ViewConfiguration.getWindowTouchSlop();
                                                    byte length7 = (byte) $$a.length;
                                                    java.lang.Object[] objArr90 = new java.lang.Object[1];
                                                    p((byte) 0, length7, (byte) (length7 - 4), objArr90);
                                                    d2 = com.facetec.sdk.al.c(c8, packedPositionChild3 + 1341, (windowTouchSlop >> 8) + 24, -1992399030, false, (java.lang.String) objArr90[0], null);
                                                } catch (java.lang.Exception unused14) {
                                                    i7 = i2;
                                                    int i2412 = (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                    int i2422 = i2412 * (-419);
                                                    int i2432 = ((-651427776) ^ i2422) + ((i2422 & (-651427776)) << 1) + ((~(1987808064 | i7)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING);
                                                    int i2442 = ~i2412;
                                                    int i2452 = ((1987808064 ^ i2442) | (1987808064 & i2442)) * (-420);
                                                    int i2462 = (i2432 ^ i2452) + ((i2452 & i2432) << 1);
                                                    int i2472 = ~((i2442 ^ (-1987808065)) | ((-1987808065) & i2442));
                                                    int i2482 = ~(i17 | 1987808064);
                                                    int i2492 = -(-(((i2472 ^ i2482) | (i2472 & i2482)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING));
                                                    int i2502 = -(-(android.view.ViewConfiguration.getPressedStateDuration() >> 16));
                                                    int i2512 = -android.text.TextUtils.getCapsMode("", 0, 0);
                                                    java.lang.Object[] objArr532 = new java.lang.Object[1];
                                                    n(((i2492 & i2462) << 1) + (i2462 ^ i2492), (short) ((i2502 ^ 121) + ((i2502 & 121) << 1)), ((-1276746348) & i2512) + (i2512 | (-1276746348)), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 46, (byte) android.graphics.Color.alpha(0), objArr532);
                                                    throw new java.io.IOException((java.lang.String) objArr532[0]);
                                                }
                                            }
                                            sb2.append(((java.lang.reflect.Field) d2).get(obj4).toString());
                                            d3 = com.facetec.sdk.al.d(785456562);
                                            if (d3 == null) {
                                                char c9 = (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1);
                                                int myPid3 = android.os.Process.myPid();
                                                int lastIndexOf4 = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                                byte length8 = (byte) $$a.length;
                                                java.lang.Object[] objArr91 = new java.lang.Object[1];
                                                p((byte) 0, length8, (byte) (length8 - 4), objArr91);
                                                d3 = com.facetec.sdk.al.c(c9, (myPid3 >> 22) + 1340, 23 - lastIndexOf4, -1992399030, false, (java.lang.String) objArr91[0], null);
                                            }
                                            sb2.append(((java.lang.reflect.Field) d3).get(newInstance2).toString());
                                            java.lang.String obj9 = sb2.toString();
                                            java.lang.Object[] objArr92 = new java.lang.Object[1];
                                            m("\ua7ed㾜", (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr92);
                                            java.lang.String[] split2 = obj9.split((java.lang.String) objArr92[0]);
                                            length3 = split2.length;
                                            i18 = 0;
                                            while (i18 < length3) {
                                                java.lang.String str28 = split2[i18];
                                                java.lang.Object[] objArr93 = new java.lang.Object[1];
                                                m("\ue398絁嬥䠤\ue7b8㜈烀抄쾥姭迱卙\uaafb\uf185‸눨ᦀ\uf14c\uf2de楍", 19 - android.graphics.Color.blue(0), objArr93);
                                                if (str28.startsWith((java.lang.String) objArr93[0])) {
                                                    strArr = split2;
                                                } else {
                                                    int indexOf9 = android.text.TextUtils.indexOf("", "", 0, 0);
                                                    short s8 = (short) ((-19) - (~(-(-android.view.View.combineMeasuredStates(0, 0)))));
                                                    int capsMode2 = android.text.TextUtils.getCapsMode("", 0, 0);
                                                    int i469 = -android.graphics.ImageFormat.getBitsPerPixel(0);
                                                    int i470 = (i469 * (-432)) - 20398;
                                                    int i471 = ~i469;
                                                    int i472 = -(-((~((i471 ^ i17) | (i17 & i471) | (-47))) * 433));
                                                    int i473 = ((i470 | i472) << 1) - (i470 ^ i472);
                                                    i7 = i2;
                                                    int i474 = ~((i7 ^ 46) | (i7 & 46));
                                                    int i475 = -(-(((i471 ^ i474) | (i474 & i471)) * (-433)));
                                                    try {
                                                        strArr = split2;
                                                        java.lang.Object[] objArr94 = new java.lang.Object[1];
                                                        n((indexOf9 ^ 1987808106) + ((indexOf9 & 1987808106) << 1), s8, (((-1276746321) | capsMode2) << 1) - (capsMode2 ^ (-1276746321)), (((i473 | i475) << 1) - (i473 ^ i475)) + (((~((i469 & (-47)) | (i469 ^ (-47)))) | (~((i471 ^ i7) | (i471 & i7)))) * 433), (byte) android.widget.ExpandableListView.getPackedPositionType(0L), objArr94);
                                                        if (!str28.startsWith((java.lang.String) objArr94[0])) {
                                                            int i476 = -(android.view.ViewConfiguration.getEdgeSlop() >> 16);
                                                            int d29 = com.facetec.sdk.gj.a.d();
                                                            int i477 = ~((-1987808107) | d29);
                                                            int i478 = ~d29;
                                                            int i479 = ~((i478 ^ i476) | (i478 & i476));
                                                            int i480 = (i477 & i479) | (i477 ^ i479);
                                                            int i481 = ~((i478 ^ 1987808106) | (i478 & 1987808106));
                                                            int i482 = (((i476 * (-515)) + 1199607058) - (~(-(-(((i480 & i481) | (i480 ^ i481)) * (-516)))))) - 1;
                                                            int i483 = ~i476;
                                                            int i484 = ~(d29 | ((-1987808107) ^ i483) | ((-1987808107) & i483));
                                                            int i485 = (i483 ^ i478) | (i478 & i483);
                                                            int i486 = ~((i485 & 1987808106) | (i485 ^ 1987808106));
                                                            int i487 = ((i484 & i486) | (i484 ^ i486)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR;
                                                            int i488 = -(-(android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                                                            int trimmedLength = android.text.TextUtils.getTrimmedLength("");
                                                            java.lang.Object[] objArr95 = new java.lang.Object[1];
                                                            n((i482 & i487) + (i487 | i482) + (((~((i483 ^ 1987808106) | (i483 & 1987808106))) | (~(i478 | 1987808106))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR), (short) (android.widget.ExpandableListView.getPackedPositionChild(0L) - 91), (((-1276746301) | i488) << 1) - ((-1276746301) ^ i488), (trimmedLength ^ (-46)) + ((trimmedLength & (-46)) << 1), (byte) android.graphics.Color.red(0), objArr95);
                                                            if (str28.startsWith((java.lang.String) objArr95[0])) {
                                                                java.lang.Object[] objArr96 = new java.lang.Object[1];
                                                                m("\ue31c㯩", 0 - (~(-(android.view.ViewConfiguration.getScrollBarSize() >> 8))), objArr96);
                                                                java.lang.String[] split3 = str28.split((java.lang.String) objArr96[0]);
                                                                if (split3.length > 1) {
                                                                    str8 = str5;
                                                                    if (split3[1].equalsIgnoreCase(str8)) {
                                                                        java.lang.String str252 = (java.lang.String) java.lang.Class.forName(str).getField(str4).get(obj3);
                                                                        ((int[]) objArr[2])[0] = i7;
                                                                        ((int[]) objArr[1])[0] = (i7 & (-21)) | (i17 & 20);
                                                                        objArr = new java.lang.Object[]{str252, new int[1], new int[1], new int[1], null};
                                                                        int i2522 = ((((~((-60330331) | i7)) | 203415753) * 398) - 286881803) + (((~(i17 | (-60330331))) | 203415753) * 398) + 16;
                                                                        i19 = i4;
                                                                        int i2532 = ((i19 | i2522) << 1) - (i2522 ^ i19);
                                                                        int i2542 = (i2532 << 13) ^ i2532;
                                                                        int i2552 = i2542 ^ (i2542 >>> 17);
                                                                        int i2562 = i2552 << 5;
                                                                        ((int[]) objArr[3])[0] = (~(i2552 & i2562)) & (i2552 | i2562);
                                                                        i6 = i19;
                                                                        i8 = 1;
                                                                        c = 0;
                                                                        if (((int[]) objArr[i8])[c] == i7) {
                                                                        }
                                                                    } else {
                                                                        obj5 = obj3;
                                                                        str7 = str4;
                                                                        i18 = (i18 & 1) + (i18 | 1);
                                                                        str4 = str7;
                                                                        obj3 = obj5;
                                                                        str5 = str8;
                                                                        split2 = strArr;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } catch (java.io.IOException unused15) {
                                                        i14 = i4;
                                                        r22 = obj3;
                                                        r16 = str4;
                                                        int i240222 = (i15 ^ 116) + ((i15 & 116) << 1);
                                                        i12 = ((i240222 & (-115)) << 1) + (i240222 ^ (-115));
                                                        i5 = i14;
                                                        i11 = i7;
                                                        str13 = r16;
                                                        obj2 = r22;
                                                        split = strArr2;
                                                        length2 = i13;
                                                        r16 = r16;
                                                    }
                                                }
                                                obj5 = obj3;
                                                str7 = str4;
                                                str8 = str5;
                                                i18 = (i18 & 1) + (i18 | 1);
                                                str4 = str7;
                                                obj3 = obj5;
                                                str5 = str8;
                                                split2 = strArr;
                                            }
                                        } catch (java.lang.Exception unused16) {
                                            i7 = i2;
                                            int i24122 = (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                            int i24222 = i24122 * (-419);
                                            int i24322 = ((-651427776) ^ i24222) + ((i24222 & (-651427776)) << 1) + ((~(1987808064 | i7)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING);
                                            int i24422 = ~i24122;
                                            int i24522 = ((1987808064 ^ i24422) | (1987808064 & i24422)) * (-420);
                                            int i24622 = (i24322 ^ i24522) + ((i24522 & i24322) << 1);
                                            int i24722 = ~((i24422 ^ (-1987808065)) | ((-1987808065) & i24422));
                                            int i24822 = ~(i17 | 1987808064);
                                            int i24922 = -(-(((i24722 ^ i24822) | (i24722 & i24822)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING));
                                            int i25022 = -(-(android.view.ViewConfiguration.getPressedStateDuration() >> 16));
                                            int i25122 = -android.text.TextUtils.getCapsMode("", 0, 0);
                                            java.lang.Object[] objArr5322 = new java.lang.Object[1];
                                            n(((i24922 & i24622) << 1) + (i24622 ^ i24922), (short) ((i25022 ^ 121) + ((i25022 & 121) << 1)), ((-1276746348) & i25122) + (i25122 | (-1276746348)), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 46, (byte) android.graphics.Color.alpha(0), objArr5322);
                                            throw new java.io.IOException((java.lang.String) objArr5322[0]);
                                        }
                                    } catch (java.io.IOException unused17) {
                                    }
                                    i7 = i2;
                                    i14 = i4;
                                    r22 = obj3;
                                    r16 = str4;
                                    int i2402222 = (i15 ^ 116) + ((i15 & 116) << 1);
                                    i12 = ((i2402222 & (-115)) << 1) + (i2402222 ^ (-115));
                                    i5 = i14;
                                    i11 = i7;
                                    str13 = r16;
                                    obj2 = r22;
                                    split = strArr2;
                                    length2 = i13;
                                    r16 = r16;
                                } catch (java.lang.Throwable th15) {
                                    th = th15;
                                    java.lang.Throwable th16 = th;
                                    java.lang.Throwable cause8 = th16.getCause();
                                    if (cause8 != null) {
                                        throw cause8;
                                    }
                                    throw th16;
                                }
                            } catch (java.lang.Throwable th17) {
                                th = th17;
                            }
                        } catch (java.lang.Throwable th18) {
                            java.lang.Throwable cause9 = th18.getCause();
                            if (cause9 != null) {
                                throw cause9;
                            }
                            throw th18;
                        }
                    } catch (java.lang.InterruptedException e4) {
                        interruptedException = e4;
                        throw interruptedException;
                    } catch (java.lang.Throwable th19) {
                        th2 = th19;
                        exec.destroy();
                        throw th2;
                    }
                    i7 = i2;
                    i14 = i4;
                    r22 = obj3;
                    r16 = str4;
                    int i24022222 = (i15 ^ 116) + ((i15 & 116) << 1);
                    i12 = ((i24022222 & (-115)) << 1) + (i24022222 ^ (-115));
                    i5 = i14;
                    i11 = i7;
                    str13 = r16;
                    obj2 = r22;
                    split = strArr2;
                    length2 = i13;
                    r16 = r16;
                    java.lang.StringBuilder sb22 = new java.lang.StringBuilder();
                    d2 = com.facetec.sdk.al.d(785456562);
                    if (d2 == null) {
                    }
                    sb22.append(((java.lang.reflect.Field) d2).get(obj4).toString());
                    d3 = com.facetec.sdk.al.d(785456562);
                    if (d3 == null) {
                    }
                    sb22.append(((java.lang.reflect.Field) d3).get(newInstance2).toString());
                    java.lang.String obj92 = sb22.toString();
                    java.lang.Object[] objArr922 = new java.lang.Object[1];
                    m("\ua7ed㾜", (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr922);
                    java.lang.String[] split22 = obj92.split((java.lang.String) objArr922[0]);
                    length3 = split22.length;
                    i18 = 0;
                    while (i18 < length3) {
                    }
                    i7 = i2;
                    i14 = i4;
                    r22 = obj3;
                    r16 = str4;
                    int i240222222 = (i15 ^ 116) + ((i15 & 116) << 1);
                    i12 = ((i240222222 & (-115)) << 1) + (i240222222 ^ (-115));
                    i5 = i14;
                    i11 = i7;
                    str13 = r16;
                    obj2 = r22;
                    split = strArr2;
                    length2 = i13;
                    r16 = r16;
                } catch (java.lang.Throwable th20) {
                    java.lang.Throwable cause10 = th20.getCause();
                    if (cause10 != null) {
                        throw cause10;
                    }
                    throw th20;
                }
            }
        };
    }

    public static com.facetec.sdk.pz e(java.io.InputStream inputStream) {
        return d(inputStream, new com.facetec.sdk.qe());
    }

    private static com.facetec.sdk.pz d(final java.io.InputStream inputStream, final com.facetec.sdk.qe qeVar) {
        if (inputStream == null) {
            throw new java.lang.IllegalArgumentException("in == null");
        }
        if (qeVar == null) {
            throw new java.lang.IllegalArgumentException("timeout == null");
        }
        return new com.facetec.sdk.pz() { // from class: com.facetec.sdk.pt.2
            @Override // com.facetec.sdk.pz
            public final long b(com.facetec.sdk.pk pkVar, long j) throws java.io.IOException {
                if (j < 0) {
                    throw new java.lang.IllegalArgumentException("byteCount < 0: ".concat(java.lang.String.valueOf(j)));
                }
                if (j == 0) {
                    return 0L;
                }
                try {
                    com.facetec.sdk.qe.this.j();
                    com.facetec.sdk.qc c = pkVar.c(1);
                    int read = inputStream.read(c.d, c.f3761a, (int) java.lang.Math.min(j, 8192 - c.f3761a));
                    if (read == -1) {
                        return -1L;
                    }
                    c.f3761a += read;
                    long j2 = read;
                    pkVar.b += j2;
                    return j2;
                } catch (java.lang.AssertionError e2) {
                    if (com.facetec.sdk.pt.b(e2)) {
                        throw new java.io.IOException(e2);
                    }
                    throw e2;
                }
            }

            @Override // com.facetec.sdk.pz, java.io.Closeable, java.lang.AutoCloseable
            public final void close() throws java.io.IOException {
                inputStream.close();
            }

            @Override // com.facetec.sdk.pz
            public final com.facetec.sdk.qe d() {
                return com.facetec.sdk.qe.this;
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("source(");
                sb.append(inputStream);
                sb.append(")");
                return sb.toString();
            }
        };
    }

    public static com.facetec.sdk.pz d(java.net.Socket socket) throws java.io.IOException {
        if (socket == null) {
            throw new java.lang.IllegalArgumentException("socket == null");
        }
        if (socket.getInputStream() == null) {
            throw new java.io.IOException("socket's input stream == null");
        }
        final com.facetec.sdk.pn b = b(socket);
        final com.facetec.sdk.pz d = d(socket.getInputStream(), b);
        return new com.facetec.sdk.pz() { // from class: com.facetec.sdk.pn.5
            @Override // com.facetec.sdk.pz
            public final long b(com.facetec.sdk.pk pkVar, long j) throws java.io.IOException {
                com.facetec.sdk.pn.this.b();
                try {
                    try {
                        long b2 = d.b(pkVar, j);
                        com.facetec.sdk.pn.this.e(true);
                        return b2;
                    } catch (java.io.IOException e2) {
                        throw com.facetec.sdk.pn.this.d(e2);
                    }
                } catch (java.lang.Throwable th) {
                    com.facetec.sdk.pn.this.e(false);
                    throw th;
                }
            }

            @Override // com.facetec.sdk.pz, java.io.Closeable, java.lang.AutoCloseable
            public final void close() throws java.io.IOException {
                try {
                    try {
                        d.close();
                        com.facetec.sdk.pn.this.e(true);
                    } catch (java.io.IOException e2) {
                        throw com.facetec.sdk.pn.this.d(e2);
                    }
                } catch (java.lang.Throwable th) {
                    com.facetec.sdk.pn.this.e(false);
                    throw th;
                }
            }

            @Override // com.facetec.sdk.pz
            public final com.facetec.sdk.qe d() {
                return com.facetec.sdk.pn.this;
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("AsyncTimeout.source(");
                sb.append(d);
                sb.append(")");
                return sb.toString();
            }
        };
    }

    private static com.facetec.sdk.pn b(final java.net.Socket socket) {
        return new com.facetec.sdk.pn() { // from class: com.facetec.sdk.pt.1
            @Override // com.facetec.sdk.pn
            protected final java.io.IOException b(@javax.annotation.Nullable java.io.IOException iOException) {
                java.net.SocketTimeoutException socketTimeoutException = new java.net.SocketTimeoutException(com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT);
                if (iOException != null) {
                    socketTimeoutException.initCause(iOException);
                }
                return socketTimeoutException;
            }

            @Override // com.facetec.sdk.pn
            protected final void a() {
                try {
                    socket.close();
                } catch (java.lang.AssertionError e2) {
                    if (com.facetec.sdk.pt.b(e2)) {
                        java.util.logging.Logger logger = com.facetec.sdk.pt.e;
                        java.util.logging.Level level = java.util.logging.Level.WARNING;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to close timed out socket ");
                        sb.append(socket);
                        logger.log(level, sb.toString(), (java.lang.Throwable) e2);
                        return;
                    }
                    throw e2;
                } catch (java.lang.Exception e3) {
                    java.util.logging.Logger logger2 = com.facetec.sdk.pt.e;
                    java.util.logging.Level level2 = java.util.logging.Level.WARNING;
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Failed to close timed out socket ");
                    sb2.append(socket);
                    logger2.log(level2, sb2.toString(), (java.lang.Throwable) e3);
                }
            }
        };
    }

    static boolean b(java.lang.AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }
}
