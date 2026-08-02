package com.facetec.sdk;

/* loaded from: classes8.dex */
final class qc {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int f;
    private static int g;
    private static int h;
    private static byte[] l;

    /* renamed from: o, reason: collision with root package name */
    private static short[] f3760o;

    /* renamed from: a, reason: collision with root package name */
    int f3761a;
    boolean b;
    boolean c;
    final byte[] d;
    int e;
    com.facetec.sdk.qc i;
    com.facetec.sdk.qc j;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String $$c(byte b, byte b2, byte b3) {
        int i;
        int i2 = 71 - (b * 3);
        byte[] bArr = $$a;
        int i3 = b3 * 2;
        int i4 = (b2 * 2) + 4;
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            int i5 = i4;
            i2 = i3;
            int i6 = 0;
            i2 += i4;
            i4 = i5 + 1;
            i = i6;
            bArr2[i] = (byte) i2;
            if (i == i3) {
                return new java.lang.String(bArr2, 0);
            }
            int i7 = i + 1;
            i5 = i4;
            i4 = bArr[i4];
            i6 = i7;
            i2 += i4;
            i4 = i5 + 1;
            i = i6;
            bArr2[i] = (byte) i2;
            if (i == i3) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i2;
            if (i == i3) {
            }
        }
    }

    static void init$0() {
        $$a = new byte[]{com.google.common.base.Ascii.NAK, -86, -34, -94};
        $$b = 106;
    }

    qc() {
        this.d = new byte[8192];
        this.b = true;
        this.c = false;
    }

    qc(byte[] bArr, int i, int i2) {
        this.d = bArr;
        this.e = i;
        this.f3761a = i2;
        this.c = true;
        this.b = false;
    }

    final com.facetec.sdk.qc b() {
        this.c = true;
        return new com.facetec.sdk.qc(this.d, this.e, this.f3761a);
    }

    @javax.annotation.Nullable
    public final com.facetec.sdk.qc e() {
        com.facetec.sdk.qc qcVar = this.j;
        com.facetec.sdk.qc qcVar2 = qcVar != this ? qcVar : null;
        com.facetec.sdk.qc qcVar3 = this.i;
        qcVar3.j = qcVar;
        this.j.i = qcVar3;
        this.j = null;
        this.i = null;
        return qcVar2;
    }

    public final com.facetec.sdk.qc b(com.facetec.sdk.qc qcVar) {
        qcVar.i = this;
        qcVar.j = this.j;
        this.j.i = qcVar;
        this.j = qcVar;
        return qcVar;
    }

    public final void d(com.facetec.sdk.qc qcVar, int i) {
        if (!qcVar.b) {
            throw new java.lang.IllegalArgumentException();
        }
        int i2 = qcVar.f3761a;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (qcVar.c) {
                throw new java.lang.IllegalArgumentException();
            }
            int i4 = qcVar.e;
            if (i3 - i4 > 8192) {
                throw new java.lang.IllegalArgumentException();
            }
            byte[] bArr = qcVar.d;
            try {
                java.lang.Object[] objArr = {bArr, java.lang.Integer.valueOf(i4), bArr, 0, java.lang.Integer.valueOf(i2 - i4)};
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                k((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 8050903, (short) (1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (-1212774629) - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) - 54, (byte) (1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr2);
                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr2[0]);
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                k((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 8050913, (short) android.view.KeyEvent.normalizeMetaState(0), (-1212774612) - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (-55) - android.widget.ExpandableListView.getPackedPositionGroup(0L), (byte) (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr3);
                cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr);
                qcVar.f3761a -= qcVar.e;
                qcVar.e = 0;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        java.lang.Object[] objArr4 = {this.d, java.lang.Integer.valueOf(this.e), qcVar.d, java.lang.Integer.valueOf(qcVar.f3761a), java.lang.Integer.valueOf(i)};
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        k((-8050903) - android.graphics.Color.argb(0, 0, 0, 0), (short) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1), android.graphics.Color.green(0) - 1212774629, android.graphics.drawable.Drawable.resolveOpacity(0, 0) - 55, (byte) android.text.TextUtils.indexOf("", ""), objArr5);
        java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr5[0]);
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        k((-8050912) - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (short) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), android.text.TextUtils.getOffsetAfter("", 0) - 1212774613, android.text.TextUtils.getCapsMode("", 0, 0) - 55, (byte) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr6);
        cls2.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr4);
        qcVar.f3761a += i;
        this.e += i;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void k(int i, short s, int i2, int i3, byte b, java.lang.Object[] objArr) {
        long j;
        com.facetec.sdk.hm hmVar = new com.facetec.sdk.hm();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(g)};
            java.lang.Object d = com.facetec.sdk.al.d(-852176267);
            if (d == null) {
                byte b2 = (byte) 1;
                byte b3 = (byte) (b2 - 1);
                d = com.facetec.sdk.al.c((char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)), android.view.Gravity.getAbsoluteGravity(0, 0) + 2222, 24 - android.view.KeyEvent.keyCodeFromString(""), 1792780429, false, $$c(b2, b3, b3), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
            }
            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) d).invoke(null, objArr2)).intValue();
            int i4 = intValue == -1 ? 1 : 0;
            if (i4 != 0) {
                byte[] bArr = l;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i5 = 0; i5 < length; i5++) {
                        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(bArr[i5])};
                        java.lang.Object d2 = com.facetec.sdk.al.d(-1856077218);
                        if (d2 == null) {
                            d2 = com.facetec.sdk.al.c((char) (android.os.Process.myTid() >> 22), android.text.TextUtils.getOffsetBefore("", 0) + 94, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 23, 917633190, false, "E", new java.lang.Class[]{java.lang.Integer.TYPE});
                        }
                        bArr2[i5] = ((java.lang.Byte) ((java.lang.reflect.Method) d2).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = l;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(h)};
                    java.lang.Object d3 = com.facetec.sdk.al.d(-852176267);
                    if (d3 == null) {
                        byte b4 = (byte) 1;
                        byte b5 = (byte) (b4 - 1);
                        d3 = com.facetec.sdk.al.c((char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), 2221 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), android.text.TextUtils.indexOf("", "", 0, 0) + 24, 1792780429, false, $$c(b4, b5, b5), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                    }
                    intValue = (byte) (((byte) (bArr3[((java.lang.Integer) ((java.lang.reflect.Method) d3).invoke(null, objArr4)).intValue()] ^ 1009991189275744878L)) + ((int) (g ^ 1009991189275744878L)));
                } else {
                    j = 1009991189275744878L;
                    intValue = (short) (((short) (f3760o[i2 + ((int) (h ^ 1009991189275744878L))] ^ 1009991189275744878L)) + ((int) (g ^ 1009991189275744878L)));
                    if (intValue > 0) {
                        hmVar.b = ((i2 + intValue) - 2) + ((int) (h ^ j)) + i4;
                        java.lang.Object[] objArr5 = {hmVar, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(f), sb};
                        java.lang.Object d4 = com.facetec.sdk.al.d(-1371371196);
                        if (d4 == null) {
                            byte b6 = (byte) 0;
                            d4 = com.facetec.sdk.al.c((char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 886, 31 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 162395068, false, $$c(b6, b6, b6), new java.lang.Class[]{java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class});
                        }
                        ((java.lang.StringBuilder) ((java.lang.reflect.Method) d4).invoke(null, objArr5)).append(hmVar.c);
                        hmVar.d = hmVar.c;
                        byte[] bArr4 = l;
                        if (bArr4 != null) {
                            int length2 = bArr4.length;
                            byte[] bArr5 = new byte[length2];
                            for (int i6 = 0; i6 < length2; i6++) {
                                bArr5[i6] = (byte) (bArr4[i6] ^ 1009991189275744878L);
                            }
                            bArr4 = bArr5;
                        }
                        boolean z = bArr4 != null;
                        hmVar.e = 1;
                        while (hmVar.e < intValue) {
                            if (z) {
                                byte[] bArr6 = l;
                                hmVar.b = hmVar.b - 1;
                                hmVar.c = (char) (hmVar.d + (((byte) (((byte) (bArr6[r7] ^ 1009991189275744878L)) + s)) ^ b));
                            } else {
                                short[] sArr = f3760o;
                                hmVar.b = hmVar.b - 1;
                                hmVar.c = (char) (hmVar.d + (((short) (((short) (sArr[r7] ^ 1009991189275744878L)) + s)) ^ b));
                            }
                            sb.append(hmVar.c);
                            hmVar.d = hmVar.c;
                            hmVar.e++;
                        }
                    }
                    objArr[0] = sb.toString();
                }
            }
            j = 1009991189275744878L;
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

    static {
        init$0();
        h = -414752117;
        g = -1358030248;
        f = -1351302353;
        l = new byte[]{-76, 102, -97, 111, -108, 72, 75, -87, -105, 99, -101, 80, -93, -123, 123, com.visa.cbp.getEncExpo.registerForActivityResult, -67, 103, 111, 98, -124, 118, -127, 110, Byte.MAX_VALUE};
    }
}
