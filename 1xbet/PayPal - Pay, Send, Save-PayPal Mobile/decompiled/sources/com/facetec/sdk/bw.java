package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class bw extends com.facetec.sdk.au {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final int ad = 0;
    private static int ae;
    private static int af;
    private static long ag;
    private static final byte[] ah = null;
    private android.widget.LinearLayout A;
    private android.widget.ImageView B;
    private android.widget.RelativeLayout C;
    private android.widget.RelativeLayout D;
    private android.widget.RelativeLayout E;
    private android.widget.LinearLayout F;
    private android.widget.ImageView G;
    private android.widget.RelativeLayout H;
    private android.widget.RelativeLayout I;
    private android.widget.RelativeLayout J;
    private android.widget.LinearLayout K;
    private android.widget.ImageView L;
    private android.widget.RelativeLayout M;
    private android.widget.RelativeLayout N;
    private android.widget.RelativeLayout R;
    private java.util.Timer T;
    private android.widget.FrameLayout U;
    private com.facetec.sdk.aj V;
    private android.os.Handler W;
    private boolean Y;

    /* renamed from: a, reason: collision with root package name */
    com.facetec.sdk.e f3441a;
    private boolean ab;
    private com.facetec.sdk.dh ac;
    com.facetec.sdk.e b;
    android.widget.ImageView c;
    android.widget.TextView d;
    android.widget.RelativeLayout e;
    com.facetec.sdk.cb f;
    com.facetec.sdk.e g;
    android.view.View h;
    com.facetec.sdk.e i;
    com.facetec.sdk.bl l;
    private com.facetec.sdk.bv p;
    private android.widget.RelativeLayout q;
    private android.widget.RelativeLayout r;
    private com.facetec.sdk.bi s;
    private android.widget.RelativeLayout t;
    private android.widget.ImageView u;
    private android.widget.TextView v;
    private android.widget.TextView w;
    private android.widget.TextView x;
    private android.widget.RelativeLayout y;
    private android.widget.LinearLayout z;
    com.facetec.sdk.bw.c j = com.facetec.sdk.bw.c.FRONT;
    private boolean P = false;
    boolean m = false;
    private boolean S = false;
    private boolean O = false;

    /* renamed from: o, reason: collision with root package name */
    boolean f3442o = false;
    boolean k = false;
    private boolean Q = false;
    private boolean X = false;
    private java.util.TimerTask aa = new com.facetec.sdk.dg(new java.lang.Runnable() { // from class: com.facetec.sdk.bw$$ExternalSyntheticLambda17
        @Override // java.lang.Runnable
        public final void run() {
            com.facetec.sdk.bw.this.M();
        }
    });
    private android.view.ViewTreeObserver.OnGlobalLayoutListener Z = new android.view.ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.facetec.sdk.bw.5
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            if (com.facetec.sdk.bw.this.m) {
                return;
            }
            com.facetec.sdk.bw.this.m = true;
            com.facetec.sdk.bw.this.f();
            float a2 = com.facetec.sdk.dm.a();
            float b = com.facetec.sdk.dm.b();
            int d = (int) (com.facetec.sdk.ay.d(35) * a2 * b);
            int d2 = (int) (com.facetec.sdk.ay.d(50) * a2 * b);
            int d3 = com.facetec.sdk.dm.d();
            float f = d3;
            float f2 = f / 2.0f;
            int round = java.lang.Math.round(f2);
            int round2 = java.lang.Math.round(f2);
            int i = (int) (20.0f * a2 * b);
            int intValue = ((java.lang.Integer) com.facetec.sdk.dm.b(com.facetec.sdk.gj.AnonymousClass19.a(), 2144492993, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -2144492975)).intValue();
            int i2 = (int) (a2 * 16.0f * b);
            int round3 = java.lang.Math.round(f2);
            com.facetec.sdk.bw.this.g();
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) com.facetec.sdk.bw.this.K.getLayoutParams();
            layoutParams.setMargins(d3, 0, d3, d3);
            com.facetec.sdk.bw.this.K.setLayoutParams(layoutParams);
            com.facetec.sdk.bw.this.K.requestLayout();
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) com.facetec.sdk.bw.this.M.getLayoutParams();
            layoutParams2.setMargins(d3, 0, d3, d3);
            ((android.view.ViewGroup.LayoutParams) layoutParams2).height = d2;
            com.facetec.sdk.bw.this.M.setLayoutParams(layoutParams2);
            com.facetec.sdk.bw.this.M.requestLayout();
            com.facetec.sdk.bw.this.g.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, d2));
            com.facetec.sdk.bw.this.g.requestLayout();
            new android.widget.LinearLayout.LayoutParams(-1, d2).setMargins(0, 0, 0, d3);
            float b2 = (com.facetec.sdk.dp.b().width * com.facetec.sdk.dm.b()) - (d3 << 1);
            int i3 = (int) b2;
            com.facetec.sdk.bw.this.K.getLayoutParams().width = i3;
            com.facetec.sdk.bw.this.K.requestLayout();
            com.facetec.sdk.bw.this.f3441a.getLayoutParams().width = i3;
            com.facetec.sdk.bw.this.f3441a.requestLayout();
            float min = java.lang.Math.min(java.lang.Math.max(d2, b2 / 2.0f), (b2 - f) / 2.0f);
            com.facetec.sdk.bw.this.h.getLayoutParams().width = (int) ((com.facetec.sdk.bw.this.e.getWidth() - (min * 2.0f)) / 3.0f);
            int i4 = (int) min;
            com.facetec.sdk.bw.this.i.getLayoutParams().width = i4;
            com.facetec.sdk.bw.this.b.getLayoutParams().width = i4;
            ((android.widget.LinearLayout.LayoutParams) com.facetec.sdk.bw.this.i.getLayoutParams()).weight = 0.0f;
            ((android.widget.LinearLayout.LayoutParams) com.facetec.sdk.bw.this.b.getLayoutParams()).weight = 0.0f;
            com.facetec.sdk.bw.this.i.requestLayout();
            com.facetec.sdk.bw.this.b.requestLayout();
            android.widget.RelativeLayout.LayoutParams layoutParams3 = (android.widget.RelativeLayout.LayoutParams) com.facetec.sdk.bw.this.c.getLayoutParams();
            layoutParams3.setMargins(round, round, 0, round);
            layoutParams3.setMarginStart(round);
            layoutParams3.setMarginEnd(round);
            com.facetec.sdk.bw.this.c.setLayoutParams(layoutParams3);
            com.facetec.sdk.bw.this.c.setPadding(round, round, round, round);
            com.facetec.sdk.bw.this.c.getLayoutParams().height = d;
            com.facetec.sdk.bw.this.c.getLayoutParams().width = d;
            com.facetec.sdk.bw.this.c.requestLayout();
            android.widget.RelativeLayout.LayoutParams layoutParams4 = (android.widget.RelativeLayout.LayoutParams) com.facetec.sdk.bw.this.G.getLayoutParams();
            ((android.view.ViewGroup.LayoutParams) layoutParams4).width = -2;
            ((android.view.ViewGroup.LayoutParams) layoutParams4).height = -2;
            layoutParams4.setMargins(0, round, round, round);
            layoutParams4.setMarginStart(round);
            layoutParams4.setMarginEnd(round);
            com.facetec.sdk.bw.this.G.setLayoutParams(layoutParams4);
            com.facetec.sdk.bw.this.G.setPadding(round2, round2, round2, round2);
            com.facetec.sdk.bw.this.G.getLayoutParams().height = d;
            com.facetec.sdk.bw.this.G.getLayoutParams().width = d;
            com.facetec.sdk.bw.this.G.requestLayout();
            if (com.facetec.sdk.FaceTecSDK.f3366a.f3361o.d == com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.TOP_RIGHT) {
                ((android.widget.RelativeLayout.LayoutParams) com.facetec.sdk.bw.this.G.getLayoutParams()).addRule(20);
            } else {
                ((android.widget.RelativeLayout.LayoutParams) com.facetec.sdk.bw.this.G.getLayoutParams()).addRule(21);
            }
            float f3 = i;
            com.facetec.sdk.bw.this.g.setTextSize(2, f3);
            com.facetec.sdk.bw.this.i.setTextSize(2, f3);
            com.facetec.sdk.bw.this.b.setTextSize(2, f3);
            com.facetec.sdk.bw.this.f3441a.setTextSize(2, f3);
            com.facetec.sdk.bw.this.v.setTextSize(2, intValue);
            com.facetec.sdk.bw.this.w.setTextSize(2, f3);
            com.facetec.sdk.bw.this.x.setTextSize(2, f3);
            com.facetec.sdk.bw.this.w.setPadding(round3, round3, round3, round3);
            com.facetec.sdk.bw.this.x.setPadding(round3, round3, round3, round3);
            com.facetec.sdk.bw.this.d.setTextSize(2, i2);
            int d4 = com.facetec.sdk.dm.d();
            android.widget.LinearLayout.LayoutParams layoutParams5 = (android.widget.LinearLayout.LayoutParams) com.facetec.sdk.bw.this.v.getLayoutParams();
            layoutParams5.setMarginStart(d4);
            layoutParams5.setMarginEnd(d4);
            com.facetec.sdk.bw.this.v.setLayoutParams(layoutParams5);
            com.facetec.sdk.bw.this.v.requestLayout();
        }
    };
    final com.facetec.sdk.cn.c n = new com.facetec.sdk.cn.c() { // from class: com.facetec.sdk.bw$$ExternalSyntheticLambda18
        @Override // com.facetec.sdk.cn.c
        public final void onIDScanProgress(com.facetec.sdk.co coVar, com.facetec.sdk.cp cpVar) {
            com.facetec.sdk.bw.this.b(coVar, cpVar);
        }
    };

    enum c {
        FRONT,
        BACK
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String $$c(short s, int i, short s2) {
        int i2;
        int i3 = s * 2;
        int i4 = 120 - i;
        byte[] bArr = $$a;
        int i5 = 3 - (s2 * 4);
        byte[] bArr2 = new byte[1 - i3];
        int i6 = 0 - i3;
        if (bArr == null) {
            int i7 = i5;
            int i8 = 0;
            int i9 = i6;
            i4 = (-i4) + i9;
            i5 = i7;
            i2 = i8;
            int i10 = i5 + 1;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
                return new java.lang.String(bArr2, 0);
            }
            int i11 = bArr[i10];
            i9 = i4;
            i4 = i11;
            i8 = i2 + 1;
            i7 = i10;
            i4 = (-i4) + i9;
            i5 = i7;
            i2 = i8;
            int i102 = i5 + 1;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            int i1022 = i5 + 1;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
            }
        }
    }

    static void init$0() {
        $$a = new byte[]{6, -112, -90, 92};
        $$b = 150;
    }

    private static void aj(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str != null ? str.toCharArray() : str;
        com.facetec.sdk.hv hvVar = new com.facetec.sdk.hv();
        hvVar.d = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        hvVar.c = 0;
        while (hvVar.c < charArray.length) {
            int i2 = hvVar.c;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(charArray[hvVar.c]), hvVar, hvVar};
                java.lang.Object d = com.facetec.sdk.al.d(-1009843105);
                if (d == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    d = com.facetec.sdk.al.c((char) (33463 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16)), 480 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 23 - android.widget.ExpandableListView.getPackedPositionChild(0L), 1679851175, false, $$c(b, b2, b2), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class});
                }
                jArr[i2] = ((java.lang.Long) ((java.lang.reflect.Method) d).invoke(null, objArr2)).longValue() ^ (ag ^ 2966223176042272838L);
                java.lang.Object[] objArr3 = {hvVar, hvVar};
                java.lang.Object d2 = com.facetec.sdk.al.d(95517984);
                if (d2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 + 1);
                    d2 = com.facetec.sdk.al.c((char) (android.os.Process.myPid() >> 22), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 590, 24 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), -1570895912, false, $$c(b3, b4, (byte) (b4 - 1)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d2).invoke(null, objArr3);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[length];
        hvVar.c = 0;
        while (hvVar.c < charArray.length) {
            cArr[hvVar.c] = (char) jArr[hvVar.c];
            java.lang.Object[] objArr4 = {hvVar, hvVar};
            java.lang.Object d3 = com.facetec.sdk.al.d(95517984);
            if (d3 == null) {
                byte b5 = (byte) 0;
                byte b6 = (byte) (b5 + 1);
                d3 = com.facetec.sdk.al.c((char) android.view.KeyEvent.normalizeMetaState(0), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 591, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 24, -1570895912, false, $$c(b5, b6, (byte) (b6 - 1)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
            }
            ((java.lang.reflect.Method) d3).invoke(null, objArr4);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    /* renamed from: com.facetec.sdk.bw$4, reason: invalid class name */
    final class AnonymousClass4 implements android.hardware.Camera.PictureCallback {
        private static final byte[] $$a = null;
        private static final int $$b = 0;

        /* renamed from: a, reason: collision with root package name */
        private static long f3443a;
        private static int b;
        private static int f;
        private static char g;
        private static int h;
        private static final byte[] i = null;
        private static final int j = 0;
        private /* synthetic */ long c;
        private /* synthetic */ boolean d;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002e). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static java.lang.String $$c(byte b2, short s, int i2) {
            int i3;
            int i4;
            int i5 = 3 - (i2 * 3);
            int i6 = 116 - b2;
            byte[] bArr = $$a;
            int i7 = 1 - (s * 3);
            byte[] bArr2 = new byte[i7];
            if (bArr == null) {
                int i8 = i5;
                int i9 = 0;
                i6 = (-i6) + i8;
                i3 = i9;
                int i10 = i5;
                int i11 = i6;
                bArr2[i3] = (byte) i11;
                i4 = i3 + 1;
                if (i4 == i7) {
                    return new java.lang.String(bArr2, 0);
                }
                int i12 = i10 + 1;
                i5 = i12;
                i6 = bArr[i12];
                i9 = i4;
                i8 = i11;
                i6 = (-i6) + i8;
                i3 = i9;
                int i102 = i5;
                int i112 = i6;
                bArr2[i3] = (byte) i112;
                i4 = i3 + 1;
                if (i4 == i7) {
                }
            } else {
                i3 = 0;
                int i1022 = i5;
                int i1122 = i6;
                bArr2[i3] = (byte) i1122;
                i4 = i3 + 1;
                if (i4 == i7) {
                }
            }
        }

        static void init$0() {
            $$a = new byte[]{115, -94, com.google.common.base.Ascii.DC4, -88};
            $$b = 134;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static void l(java.lang.String str, char c, java.lang.String str2, java.lang.String str3, int i2, java.lang.Object[] objArr) {
            char c2;
            char[] charArray = str3 != null ? str3.toCharArray() : str3;
            char[] charArray2 = str2 != 0 ? str2.toCharArray() : str2;
            char[] charArray3 = str != null ? str.toCharArray() : str;
            com.facetec.sdk.hs hsVar = new com.facetec.sdk.hs();
            int length = charArray.length;
            char[] cArr = new char[length];
            int length2 = charArray3.length;
            char[] cArr2 = new char[length2];
            int i3 = 0;
            java.lang.System.arraycopy(charArray, 0, cArr, 0, length);
            java.lang.System.arraycopy(charArray3, 0, cArr2, 0, length2);
            cArr[0] = (char) (cArr[0] ^ c);
            cArr2[2] = (char) (cArr2[2] + ((char) i2));
            int length3 = charArray2.length;
            char[] cArr3 = new char[length3];
            hsVar.d = 0;
            while (hsVar.d < length3) {
                try {
                    java.lang.Object[] objArr2 = {hsVar};
                    java.lang.Object d = com.facetec.sdk.al.d(-1265265027);
                    if (d == null) {
                        char c3 = (char) (android.widget.ExpandableListView.getPackedPositionForGroup(i3) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(i3) == 0L ? 0 : -1));
                        char mirror = android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                        int normalizeMetaState = android.view.KeyEvent.normalizeMetaState(i3);
                        byte b2 = (byte) 5;
                        byte b3 = (byte) (b2 - 5);
                        java.lang.String $$c = $$c(b2, b3, b3);
                        java.lang.Class[] clsArr = new java.lang.Class[1];
                        clsArr[i3] = java.lang.Object.class;
                        d = com.facetec.sdk.al.c(c3, mirror + 940, 24 - normalizeMetaState, 326823045, false, $$c, clsArr);
                    }
                    int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) d).invoke(null, objArr2)).intValue();
                    java.lang.Object[] objArr3 = {hsVar};
                    java.lang.Object d2 = com.facetec.sdk.al.d(1957241543);
                    if (d2 == null) {
                        char resolveSize = (char) android.view.View.resolveSize(i3, i3);
                        int absoluteGravity = android.view.Gravity.getAbsoluteGravity(i3, i3);
                        int offsetBefore = android.text.TextUtils.getOffsetBefore("", i3);
                        byte b4 = (byte) i3;
                        java.lang.String $$c2 = $$c((byte) 8, b4, b4);
                        java.lang.Class[] clsArr2 = new java.lang.Class[1];
                        clsArr2[i3] = java.lang.Object.class;
                        d2 = com.facetec.sdk.al.c(resolveSize, absoluteGravity + 1505, 24 - offsetBefore, -750364609, false, $$c2, clsArr2);
                    }
                    int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) d2).invoke(null, objArr3)).intValue();
                    char c4 = cArr[hsVar.d % 4];
                    java.lang.Object[] objArr4 = new java.lang.Object[3];
                    objArr4[2] = java.lang.Integer.valueOf(cArr2[intValue]);
                    objArr4[1] = java.lang.Integer.valueOf(c4 * 32718);
                    objArr4[i3] = hsVar;
                    java.lang.Object d3 = com.facetec.sdk.al.d(-1182647832);
                    if (d3 == null) {
                        char myPid = (char) ((android.os.Process.myPid() >> 22) + 26699);
                        double convertQuartSecToDecDegrees = android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(i3);
                        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(i3, i3);
                        byte b5 = (byte) ($$b & 11);
                        byte b6 = (byte) (b5 - 2);
                        d3 = com.facetec.sdk.al.c(myPid, (convertQuartSecToDecDegrees > 0.0d ? 1 : (convertQuartSecToDecDegrees == 0.0d ? 0 : -1)) + 639, 23 - makeMeasureSpec, 510477072, false, $$c(b5, b6, b6), new java.lang.Class[]{java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                    }
                    ((java.lang.reflect.Method) d3).invoke(null, objArr4);
                    java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(cArr[intValue2] * 32718), java.lang.Integer.valueOf(cArr2[intValue])};
                    java.lang.Object d4 = com.facetec.sdk.al.d(1279455729);
                    if (d4 == null) {
                        byte b7 = (byte) 0;
                        c2 = 2;
                        d4 = com.facetec.sdk.al.c((char) (android.view.KeyEvent.normalizeMetaState(0) + 409), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2198, 24 - (android.view.ViewConfiguration.getTapTimeout() >> 16), -340948215, false, $$c(b7, b7, b7), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                    } else {
                        c2 = 2;
                    }
                    cArr2[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) d4).invoke(null, objArr5)).charValue();
                    cArr[intValue2] = hsVar.b;
                    cArr3[hsVar.d] = (char) ((((cArr[intValue2] ^ charArray2[hsVar.d]) ^ (f3443a ^ 9010024738234916139L)) ^ ((int) (b ^ 9010024738234916139L))) ^ ((char) (g ^ 9010024738234916139L)));
                    hsVar.d++;
                    i3 = 0;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new java.lang.String(cArr3);
        }

        AnonymousClass4(long j2, boolean z) {
            this.c = j2;
            this.d = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(boolean z) {
            com.facetec.sdk.bw.this.g(z);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:4:0x0027). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void k(int i2, short s, short s2, java.lang.Object[] objArr) {
            int i3;
            int i4 = 676 - s;
            int i5 = s2 + 44;
            byte[] bArr = i;
            byte[] bArr2 = new byte[376 - i2];
            int i6 = 375 - i2;
            if (bArr == null) {
                int i7 = i5;
                i3 = 0;
                i5 = i6;
                i5 += i7;
                bArr2[i3] = (byte) i5;
                if (i3 == i6) {
                    objArr[0] = new java.lang.String(bArr2, 0);
                    return;
                }
                i4++;
                i7 = bArr[i4];
                i3++;
                i5 += i7;
                bArr2[i3] = (byte) i5;
                if (i3 == i6) {
                }
            } else {
                i3 = 0;
                bArr2[i3] = (byte) i5;
                if (i3 == i6) {
                }
            }
        }

        static void b() {
            byte[] bArr = new byte[684];
            java.lang.System.arraycopy("\u0005k3j\u0004û\u0006ú\u0001\u0005ú\u0001\u0006ù\u0001\u0005ú\u0001\u0007ø\u000bõ\u0001\b÷\u0001\tö\fô\u0001\nõ\u0001\u000bô\ró\u0001\fó\ró\u0001\u0004ÿü\u0001\u0004\u0000û\u0001\u0004\u0001ú\u0005\u0000û\u0005\u0001ú\u0001\u0004\u0002ù\u0005\u0001ú\u0001\u0004\u0002ù\u0001\u0004\u0003ø\u0005\u0003ø\u0001\u0004\u0004÷\u0005\u0004÷\u0005\u0005ö\u0005\u0006õ\u0001\u0004\u0005ö\u0001\u0004\u0006õ\u0005\u0007ô\u0001\u0004\u0007ô\u0005\u0005ö\u0001\u0004\bó\u0001\u0005þü\u0001\u0004\u0003ø\u0001\u0005ÿû\u000bõ\u000bõ\u0001\u0005\u0000ú\u0005\bó\u0001\u0005\u0001ù\u0001\u0005\u0002ø\u0001\u0005\u0003÷\u0001\u0005\u0004ö\u0006þü\u0005\u0005ö\u0001\u0004\bó\u0006ÿû\u0001\u0005\u0005õ\u0006\u0000ú\u0001\u0005\u0006ô\u0001\u0005\u0007ó\u0001\u0006ýü\u0006\u0002ø\u0001\u0006þû\u0006\u0003÷\u0006\u0002ø\u0001\u0006ÿú\u0001\u0006\u0000ù\u0001\u0006\u0001ø\u0006\u0005õ\u0001\u0006\u0002÷\u0006ÿû\u0001\u0006\u0003ö\u0006\u0002ø\u0001\u0006ÿú\u0006\u0006ô\u0001\u0006\u0004õ\u0001\u0006\u0005ô\u0001\u0006\u0006ó\u0001\u0007üü\u0006\u0007ó\u0007ýü\u0005\u0001ú\u0001\u0007ýû\u0007þû\u0001\u0007þú\u0006\u0007ó\u0007ýü\u0005\u0001ú\u0001\u0007ÿù\u0001\u0007\u0000ø\u0007ÿú\u0007\u0000ù\u0001\u0007\u0001÷\u0007ýü\u0001\u0007\u0002ö\u0001\u0007\u0003õ\u0001\u0007\u0004ô\u0001\u0004\u0002ù\u0007þû\u0007\u0002÷\u0001\u0007þú\u0001\u0007\u0005ó\u0007\u0003ö\u0007\u0004õ\u0007\u0005ô\u0001\bûü\u0007ýü\u0001\büû\u0001\býú\u0001\bþù\u0001\bþù\u0001\bÿø\býû\u0001\b\u0000÷\bþú\u0001\b\u0000÷\u0015ëÍ>õ\rùÇ%!þ÷\u0005ùýüý\u000b÷\u0015ëÍ>õ\rùÇ\u001b%\u0006ñ\u0002þ\rë\u000b\tðê\u0017\u0005\u0006â\u000b\u000b\tð÷\u0015ëÍ>õ\rùÇ&\u0014\ný\bê\u0001\nùþ\u000fÏ\u001e\u0014þò\rö\u000eýúûÊHóü\u0012·(\u0013ü\u0012Ì,ÿø\u0003þ\u000eýï\u0013õ\u0006ÿþ\u000f×\u001a\u0014Ù\u0013\u000bõü\u0013Ð!\u0007õ\u0018\rö\u000eýúûÊ9\u000bï\u000fø\u0001ú\u0010»\u001b$ô\u0006þá)\u0003ûô\u0013þ\u000fÎ'\u000bÿÝ\u0015\rÞ\u0019\u000fí\u0007\rö\u000eýúûÊ9\u000bï\u000fø\u0001ú\u0010»6\u000eï\u0016ê\u0001\nùÉ\u0016.ï\u0016ê\u0001\nùó\u000eüý\nïê!ñ\u0002\u0006\u000b\u0005þ\u000fà\u001b\u0006î\u0005ë\u0019\u0003\u0001÷\u0015ëÍ>õ\rùÇDó\u0001\u0006ùþ\u0011º\u001f\u0018\u000fô\u0007õ\u0005\bùüú÷\u0015ëÍ>õ\rùÇ!\u0013\bûþ\u0011ñ\u001e÷\u0015ëÍ>õ\rùÇ!\u0013\bûþ\u0011Ç÷\u0015ëÍ>õ\rùÇ\u001e#ÿù\u0003ÿùï\u000b\u000b\tðûä!þ÷\u0005ù".getBytes("ISO-8859-1"), 0, bArr, 0, 684);
            i = bArr;
            j = 102;
        }

        static {
            init$0();
            b();
            h = 0;
            f = 1;
            f3443a = 9010024738234916139L;
            b = 603544875;
            g = (char) 44739;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0838  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0844  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0854 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:83:0x0677 A[Catch: all -> 0x06d7, TryCatch #16 {all -> 0x06d7, blocks: (B:81:0x0671, B:83:0x0677, B:84:0x0678, B:19:0x0689, B:320:0x06bb), top: B:18:0x0689 }] */
        /* JADX WARN: Removed duplicated region for block: B:84:0x0678 A[Catch: all -> 0x06d7, TryCatch #16 {all -> 0x06d7, blocks: (B:81:0x0671, B:83:0x0677, B:84:0x0678, B:19:0x0689, B:320:0x06bb), top: B:18:0x0689 }] */
        /* JADX WARN: Type inference failed for: r3v36, types: [boolean] */
        /* JADX WARN: Type inference failed for: r7v10 */
        /* JADX WARN: Type inference failed for: r7v78 */
        /* JADX WARN: Type inference failed for: r7v93 */
        @Override // android.hardware.Camera.PictureCallback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onPictureTaken(byte[] bArr, android.hardware.Camera camera) {
            java.lang.Throwable th;
            int i2;
            int i3;
            ?? r7;
            java.lang.Object obj;
            int i4;
            int i5;
            java.lang.Object obj2;
            long j2;
            java.lang.Object obj3;
            int intValue;
            java.lang.Throwable cause;
            java.lang.Object[] objArr;
            com.facetec.sdk.dw dwVar = new com.facetec.sdk.dw(this, bArr, camera);
            short s = i[49];
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            k(s, (short) (s | 673), r3[8], objArr2);
            char c = 0;
            java.lang.String str = (java.lang.String) objArr2[0];
            short s2 = (short) (j | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE);
            short s3 = (short) com.plaid.internal.EnumC0527g.SDK_ASSET_BANK_ICON_CIRCLE_VALUE;
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            k(s2, s3, r3[49], objArr3);
            try {
                java.lang.Object[] objArr4 = {(java.lang.String) objArr3[0]};
                short s4 = (short) 360;
                char c2 = 383;
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                k(s4, s3, r3[383], objArr5);
                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr5[0]);
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                k((short) 371, (short) 283, (byte) (r3[459] - 1), objArr6);
                java.lang.String str2 = (java.lang.String) objArr6[0];
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                k(s4, s3, r3[383], objArr7);
                java.lang.Object[] objArr8 = (java.lang.Object[]) cls.getMethod(str2, java.lang.Class.forName((java.lang.String) objArr7[0])).invoke(str, objArr4);
                int[] iArr = new int[objArr8.length];
                int i6 = 0;
                while (i6 < objArr8.length) {
                    java.lang.Object[] objArr9 = {objArr8[i6]};
                    short s5 = (short) (j | 257);
                    short s6 = (short) com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE;
                    byte[] bArr2 = i;
                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                    k(s5, s6, bArr2[c2], objArr10);
                    java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr10[c]);
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    k((short) 369, (short) 263, (byte) 74, objArr11);
                    java.lang.String str3 = (java.lang.String) objArr11[0];
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    k(s4, s3, bArr2[383], objArr12);
                    java.lang.Object invoke = cls2.getMethod(str3, java.lang.Class.forName((java.lang.String) objArr12[0])).invoke(null, objArr9);
                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                    k(s5, s6, bArr2[383], objArr13);
                    java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr13[0]);
                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                    k((short) 368, (short) 257, (byte) (bArr2[383] - 1), objArr14);
                    iArr[i6] = ((java.lang.Integer) cls3.getMethod((java.lang.String) objArr14[0], null).invoke(invoke, null)).intValue();
                    i6++;
                    c = 0;
                    c2 = 383;
                }
                int i7 = 0;
                while (true) {
                    int i8 = i7 + 1;
                    try {
                        r7 = 6;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                    }
                    switch (dwVar.c(iArr[i7])) {
                        case -55:
                            i7 = 105;
                        case -54:
                            dwVar.c(40);
                            i8 = dwVar.c != 85 ? 77 : 92;
                            i7 = i8;
                        case -53:
                            i7 = 23;
                        case -52:
                            i7 = 104;
                        case -51:
                            dwVar.c(39);
                            if (dwVar.c == 0) {
                                i8 = 103;
                            }
                            i7 = i8;
                        case -50:
                            dwVar.d = 1;
                            dwVar.c(3);
                            dwVar.c(6);
                            h = dwVar.c;
                            i7 = i8;
                        case -49:
                            i4 = f;
                            dwVar.d = i4;
                            dwVar.c(5);
                            i7 = i8;
                        case -48:
                            i7 = 106;
                        case -47:
                            i7 = 108;
                        case -46:
                            dwVar.c(34);
                            if (dwVar.c == 0) {
                                i8 = 90;
                            }
                            i7 = i8;
                        case -45:
                            dwVar.d = 1;
                            dwVar.c(3);
                            dwVar.c(6);
                            f = dwVar.c;
                            i7 = i8;
                        case -44:
                            i4 = h;
                            dwVar.d = i4;
                            dwVar.c(5);
                            i7 = i8;
                        case -43:
                            i7 = 95;
                        case -42:
                            return;
                        case -41:
                            i7 = 1;
                        case -40:
                            i7 = 83;
                        case -39:
                            dwVar.d = 2;
                            dwVar.c(3);
                            dwVar.c(4);
                            com.facetec.sdk.bw bwVar = (com.facetec.sdk.bw) dwVar.g;
                            dwVar.c(4);
                            bwVar.e((java.lang.Runnable) dwVar.g);
                            i7 = i8;
                        case -38:
                            try {
                                dwVar.d = 2;
                                dwVar.c(3);
                                dwVar.c(4);
                                final com.facetec.sdk.bw.AnonymousClass4 anonymousClass4 = (com.facetec.sdk.bw.AnonymousClass4) dwVar.g;
                                dwVar.c(6);
                                final boolean z = dwVar.c != 0;
                                obj = new java.lang.Runnable() { // from class: com.facetec.sdk.bw$4$$ExternalSyntheticLambda0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        com.facetec.sdk.bw.AnonymousClass4.this.d(z);
                                    }
                                };
                                dwVar.j = obj;
                                dwVar.c(1);
                                i7 = i8;
                            } catch (java.lang.Throwable th3) {
                                th = th3;
                                th = th;
                                i2 = 23;
                                if (i7 < i2 && i7 < 55) {
                                    i3 = 12;
                                } else {
                                    if (i7 >= 93) {
                                        throw th;
                                    }
                                    if (i7 >= 95) {
                                        throw th;
                                    }
                                    i3 = 91;
                                }
                                i7 = i3;
                                dwVar.j = th;
                                dwVar.c(43);
                            }
                            break;
                        case -37:
                            dwVar.d = 1;
                            dwVar.c(3);
                            dwVar.c(4);
                            i4 = ((com.facetec.sdk.bw.AnonymousClass4) dwVar.g).d;
                            dwVar.d = i4;
                            dwVar.c(5);
                            i7 = i8;
                        case -36:
                            try {
                                dwVar.d = 4;
                                dwVar.c(3);
                                dwVar.c(4);
                                android.content.Context context = (android.content.Context) dwVar.g;
                                dwVar.c(4);
                                com.facetec.sdk.c cVar = (com.facetec.sdk.c) dwVar.g;
                                dwVar.c(4);
                                java.lang.String str4 = (java.lang.String) dwVar.g;
                                dwVar.c(4);
                                com.facetec.sdk.t.c(context, cVar, str4, (java.lang.Throwable) dwVar.g);
                                i7 = i8;
                            } catch (java.lang.Throwable th4) {
                                th = th4;
                                i2 = 23;
                                if (i7 < i2) {
                                    break;
                                }
                                if (i7 >= 93) {
                                }
                            }
                            break;
                        case -35:
                            try {
                                dwVar.d = 1;
                                dwVar.c(3);
                                dwVar.c(26);
                                try {
                                    objArr = new java.lang.Object[1];
                                } catch (java.lang.Throwable th5) {
                                    th = th5;
                                }
                            } catch (java.lang.Throwable th6) {
                                r7 = 0;
                                th = th6;
                                i2 = 23;
                                if (i7 < i2) {
                                }
                                if (i7 >= 93) {
                                }
                            }
                            try {
                                objArr[0] = java.lang.Long.valueOf(dwVar.e);
                                short s7 = (short) 362;
                                byte[] bArr3 = i;
                                try {
                                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                                    k(s7, bArr3[380], bArr3[383], objArr15);
                                    try {
                                        java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr15[0]);
                                        try {
                                            try {
                                                java.lang.Object[] objArr16 = new java.lang.Object[1];
                                                k((short) 368, bArr3[49], bArr3[459], objArr16);
                                                try {
                                                    try {
                                                        obj = cls4.getMethod((java.lang.String) objArr16[0], java.lang.Long.TYPE).invoke(null, objArr);
                                                        dwVar.j = obj;
                                                        dwVar.c(1);
                                                        i7 = i8;
                                                    } catch (java.lang.Throwable th7) {
                                                        th = th7;
                                                        java.lang.Throwable th8 = th;
                                                        cause = th8.getCause();
                                                        if (cause != null) {
                                                            throw th8;
                                                        }
                                                        throw cause;
                                                    }
                                                } catch (java.lang.Throwable th9) {
                                                    th = th9;
                                                }
                                            } catch (java.lang.Throwable th10) {
                                                th = th10;
                                            }
                                        } catch (java.lang.Throwable th11) {
                                            th = th11;
                                            java.lang.Throwable th82 = th;
                                            cause = th82.getCause();
                                            if (cause != null) {
                                            }
                                        }
                                    } catch (java.lang.Throwable th12) {
                                        th = th12;
                                    }
                                } catch (java.lang.Throwable th13) {
                                    th = th13;
                                    java.lang.Throwable th822 = th;
                                    cause = th822.getCause();
                                    if (cause != null) {
                                    }
                                }
                            } catch (java.lang.Throwable th14) {
                                th = th14;
                                java.lang.Throwable th8222 = th;
                                cause = th8222.getCause();
                                if (cause != null) {
                                }
                            }
                            break;
                        case -34:
                            obj2 = com.facetec.sdk.c.ID_SCAN_BACK_CAMERA_TAKEPHOTO_API_ELAPSED_TIME;
                            dwVar.j = obj2;
                            dwVar.c(1);
                            i7 = i8;
                        case -33:
                            dwVar.d = 1;
                            dwVar.c(3);
                            dwVar.c(4);
                            obj2 = ((com.facetec.sdk.bw) dwVar.g).l;
                            dwVar.j = obj2;
                            dwVar.c(1);
                            i7 = i8;
                        case -32:
                            dwVar.d = 1;
                            dwVar.c(3);
                            dwVar.c(4);
                            obj2 = com.facetec.sdk.bw.this;
                            dwVar.j = obj2;
                            dwVar.c(1);
                            i7 = i8;
                        case -31:
                            dwVar.d = 1;
                            dwVar.c(3);
                            dwVar.c(4);
                            j2 = ((com.facetec.sdk.bw.AnonymousClass4) dwVar.g).c;
                            dwVar.b = j2;
                            dwVar.c(23);
                            i7 = i8;
                        case -30:
                            dwVar.d = 1;
                            dwVar.c(3);
                            dwVar.c(4);
                            java.lang.Object obj4 = dwVar.g;
                            short s8 = (short) 362;
                            try {
                                byte[] bArr4 = i;
                                java.lang.Object[] objArr17 = new java.lang.Object[1];
                                k(s8, bArr4[380], bArr4[383], objArr17);
                                java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr17[0]);
                                int i9 = j;
                                java.lang.Object[] objArr18 = new java.lang.Object[1];
                                k((short) (i9 | com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_SHIELD_VALUE), bArr4[23], (byte) (i9 & 464), objArr18);
                                j2 = ((java.lang.Long) cls5.getMethod((java.lang.String) objArr18[0], null).invoke(obj4, null)).longValue();
                                dwVar.b = j2;
                                dwVar.c(23);
                                i7 = i8;
                            } catch (java.lang.Throwable th15) {
                                java.lang.Throwable cause2 = th15.getCause();
                                if (cause2 == null) {
                                    throw th15;
                                }
                                throw cause2;
                            }
                        case -29:
                            dwVar.d = 1;
                            dwVar.c(3);
                            dwVar.c(4);
                            obj3 = dwVar.g;
                            dwVar.j = obj3;
                            dwVar.c(1);
                            i7 = i8;
                        case -28:
                            dwVar.d = 3;
                            dwVar.c(3);
                            dwVar.c(4);
                            java.lang.Object obj5 = dwVar.g;
                            dwVar.c(4);
                            java.lang.Object obj6 = dwVar.g;
                            dwVar.c(4);
                            try {
                                java.lang.Object[] objArr19 = {obj6, dwVar.g};
                                byte[] bArr5 = i;
                                java.lang.Object[] objArr20 = new java.lang.Object[1];
                                k((short) 352, (short) 82, bArr5[383], objArr20);
                                java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr20[0]);
                                short s9 = (short) 59;
                                java.lang.Object[] objArr21 = new java.lang.Object[1];
                                k((short) com.knotapi.knot.utilities.Constants.ID_KROGER, s9, (byte) (s9 + 2), objArr21);
                                java.lang.String str5 = (java.lang.String) objArr21[0];
                                java.lang.Object[] objArr22 = new java.lang.Object[1];
                                k(s4, bArr5[554], bArr5[383], objArr22);
                                short s10 = bArr5[527];
                                java.lang.Object[] objArr23 = new java.lang.Object[1];
                                k((short) 357, s10, (byte) (s10 | 8), objArr23);
                                obj3 = cls6.getMethod(str5, java.lang.Class.forName((java.lang.String) objArr22[0]), java.lang.Class.forName((java.lang.String) objArr23[0])).invoke(obj5, objArr19);
                                dwVar.j = obj3;
                                dwVar.c(1);
                                i7 = i8;
                            } catch (java.lang.Throwable th16) {
                                java.lang.Throwable cause3 = th16.getCause();
                                if (cause3 == null) {
                                    throw th16;
                                }
                                throw cause3;
                            }
                        case -27:
                            dwVar.d = 3;
                            dwVar.c(3);
                            dwVar.c(4);
                            java.lang.Class cls7 = (java.lang.Class) dwVar.g;
                            dwVar.c(4);
                            java.lang.String str6 = (java.lang.String) dwVar.g;
                            dwVar.c(4);
                            obj3 = cls7.getMethod(str6, (java.lang.Class[]) dwVar.g);
                            dwVar.j = obj3;
                            dwVar.c(1);
                            i7 = i8;
                        case -26:
                            try {
                                java.lang.Object[] objArr24 = new java.lang.Object[1];
                                k((short) 346, (short) 225, (byte) (i[554] - 1), objArr24);
                                java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr24[0]);
                                java.lang.Object[] objArr25 = new java.lang.Object[1];
                                k((short) 364, (short) 93, (byte) 59, objArr25);
                                intValue = ((java.lang.Integer) cls8.getMethod((java.lang.String) objArr25[0], null).invoke(null, null)).intValue();
                                dwVar.d = intValue;
                                dwVar.c(5);
                                i7 = i8;
                            } catch (java.lang.Throwable th17) {
                                java.lang.Throwable cause4 = th17.getCause();
                                if (cause4 == null) {
                                    throw th17;
                                }
                                throw cause4;
                            }
                        case -25:
                            dwVar.d = -1721765254;
                            dwVar.c(5);
                            i7 = i8;
                        case -24:
                            obj3 = "窬忲\u0d99\ue3f1";
                            dwVar.j = obj3;
                            dwVar.c(1);
                            i7 = i8;
                        case -23:
                            obj3 = "脵៲휇\uf389ꢪ坣᷂Ɩ渠\ue5a3貉迤쌈䳗矡꽣䳍";
                            dwVar.j = obj3;
                            dwVar.c(1);
                            i7 = i8;
                        case -22:
                            dwVar.d = 2;
                            dwVar.c(3);
                            dwVar.c(6);
                            int i10 = dwVar.c;
                            dwVar.c(6);
                            try {
                                java.lang.Object[] objArr26 = {java.lang.Integer.valueOf(i10), java.lang.Integer.valueOf(dwVar.c)};
                                short s11 = (short) com.visa.cbp.getCertUsage.isReperso;
                                short s12 = (short) com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE;
                                byte[] bArr6 = i;
                                java.lang.Object[] objArr27 = new java.lang.Object[1];
                                k(s11, s12, (byte) (bArr6[554] - 1), objArr27);
                                java.lang.Class<?> cls9 = java.lang.Class.forName((java.lang.String) objArr27[0]);
                                short s13 = bArr6[3];
                                byte b2 = (byte) (-bArr6[611]);
                                java.lang.Object[] objArr28 = new java.lang.Object[1];
                                k((short) 362, s13, b2, objArr28);
                                intValue = ((java.lang.Integer) cls9.getMethod((java.lang.String) objArr28[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr26)).intValue();
                                dwVar.d = intValue;
                                dwVar.c(5);
                                i7 = i8;
                            } catch (java.lang.Throwable th18) {
                                java.lang.Throwable cause5 = th18.getCause();
                                if (cause5 == null) {
                                    throw th18;
                                }
                                throw cause5;
                            }
                        case -21:
                            dwVar.d = 61709;
                            dwVar.c(5);
                            i7 = i8;
                        case -20:
                            dwVar.d = 1;
                            dwVar.c(3);
                            dwVar.c(4);
                            obj3 = java.lang.Class.forName((java.lang.String) dwVar.g);
                            dwVar.j = obj3;
                            dwVar.c(1);
                            i7 = i8;
                        case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                            dwVar.d = 5;
                            dwVar.c(3);
                            dwVar.c(4);
                            java.lang.String str7 = (java.lang.String) dwVar.g;
                            dwVar.c(6);
                            char c3 = (char) dwVar.c;
                            dwVar.c(4);
                            java.lang.String str8 = (java.lang.String) dwVar.g;
                            dwVar.c(4);
                            java.lang.String str9 = (java.lang.String) dwVar.g;
                            dwVar.c(6);
                            java.lang.Object[] objArr29 = new java.lang.Object[1];
                            l(str7, c3, str8, str9, dwVar.c, objArr29);
                            dwVar.j = (java.lang.String) objArr29[0];
                            dwVar.c(1);
                            i7 = i8;
                        case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                            dwVar.d = 1;
                            dwVar.c(3);
                            dwVar.c(6);
                            try {
                                java.lang.Object[] objArr30 = {java.lang.Integer.valueOf(dwVar.c)};
                                java.lang.Object[] objArr31 = new java.lang.Object[1];
                                k((short) 348, (short) com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE, (byte) (i[554] - 1), objArr31);
                                java.lang.Class<?> cls10 = java.lang.Class.forName((java.lang.String) objArr31[0]);
                                java.lang.Object[] objArr32 = new java.lang.Object[1];
                                k((short) 361, (short) 153, (byte) 59, objArr32);
                                intValue = ((java.lang.Integer) cls10.getMethod((java.lang.String) objArr32[0], java.lang.Integer.TYPE).invoke(null, objArr30)).intValue();
                                dwVar.d = intValue;
                                dwVar.c(5);
                                i7 = i8;
                            } catch (java.lang.Throwable th19) {
                                java.lang.Throwable cause6 = th19.getCause();
                                if (cause6 == null) {
                                    throw th19;
                                }
                                throw cause6;
                            }
                        case -17:
                            obj3 = "֑▎\ue95a伆";
                            dwVar.j = obj3;
                            dwVar.c(1);
                            i7 = i8;
                        case -16:
                            obj3 = "Ꟊ\u17ffᄸ떧둄ꕔ᎒滰\uaa4f붉䭜\ue6a0姝ᡣ綗鰠";
                            dwVar.j = obj3;
                            dwVar.c(1);
                            i7 = i8;
                        case -15:
                            try {
                                java.lang.Object[] objArr33 = new java.lang.Object[1];
                                k((short) 346, (short) 225, (byte) (i[554] - 1), objArr33);
                                java.lang.Class<?> cls11 = java.lang.Class.forName((java.lang.String) objArr33[0]);
                                try {
                                    java.lang.Object[] objArr34 = new java.lang.Object[1];
                                    k((short) (j | 257), (short) com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE, (byte) 59, objArr34);
                                    intValue = ((java.lang.Integer) cls11.getMethod((java.lang.String) objArr34[0], null).invoke(null, null)).intValue();
                                    dwVar.d = intValue;
                                    dwVar.c(5);
                                    i7 = i8;
                                } catch (java.lang.Throwable th20) {
                                    th = th20;
                                    java.lang.Throwable th21 = th;
                                    java.lang.Throwable cause7 = th21.getCause();
                                    if (cause7 == null) {
                                        throw th21;
                                    }
                                    throw cause7;
                                }
                            } catch (java.lang.Throwable th22) {
                                th = th22;
                            }
                        case -14:
                            obj3 = "\u0000\u0000\u0000\u0000";
                            dwVar.j = obj3;
                            dwVar.c(1);
                            i7 = i8;
                        case -13:
                            dwVar.c(13);
                            throw ((java.lang.Throwable) dwVar.g);
                        case -12:
                            i8 = 21;
                            i7 = i8;
                        case -11:
                            i8 = 18;
                            i7 = i8;
                        case -10:
                            dwVar.c(10);
                            if (dwVar.c == 0) {
                                i8 = 17;
                            }
                            i7 = i8;
                        case -9:
                            dwVar.d = 1;
                            dwVar.c(3);
                            dwVar.c(4);
                            java.lang.Object obj7 = dwVar.g;
                            try {
                                java.lang.Object[] objArr35 = new java.lang.Object[1];
                                k((short) 357, (short) 250, i[383], objArr35);
                                java.lang.Class<?> cls12 = java.lang.Class.forName((java.lang.String) objArr35[0]);
                                java.lang.Object[] objArr36 = new java.lang.Object[1];
                                k((short) 368, (short) com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, (byte) 59, objArr36);
                                obj3 = cls12.getMethod((java.lang.String) objArr36[0], null).invoke(obj7, null);
                                dwVar.j = obj3;
                                dwVar.c(1);
                                i7 = i8;
                            } catch (java.lang.Throwable th23) {
                                java.lang.Throwable cause8 = th23.getCause();
                                if (cause8 == null) {
                                    throw th23;
                                }
                                throw cause8;
                            }
                        case -8:
                            i8 = 79;
                            i7 = i8;
                        case -7:
                            dwVar.d = 3;
                            dwVar.c(3);
                            dwVar.c(4);
                            java.lang.Object obj8 = dwVar.g;
                            dwVar.c(6);
                            int i11 = dwVar.c;
                            dwVar.c(6);
                            com.facetec.sdk.cq.k(obj8, i11, dwVar.c != 0);
                            i7 = i8;
                        case -6:
                            intValue = com.facetec.sdk.ai.j;
                            dwVar.d = intValue;
                            dwVar.c(5);
                            i7 = i8;
                        case -5:
                            dwVar.d = 4;
                            dwVar.c(3);
                            dwVar.c(4);
                            byte[] bArr7 = (byte[]) dwVar.g;
                            dwVar.c(6);
                            int i12 = dwVar.c;
                            dwVar.c(6);
                            int i13 = dwVar.c;
                            dwVar.c(6);
                            try {
                                java.lang.Object[] objArr37 = {bArr7, java.lang.Integer.valueOf(i12), java.lang.Integer.valueOf(i13), java.lang.Boolean.valueOf(dwVar.c != 0)};
                                java.lang.Object d = com.facetec.sdk.al.d(-524626503);
                                if (d == null) {
                                    d = com.facetec.sdk.al.c((char) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 5486), android.view.KeyEvent.getDeadChar(0, 0), (android.view.ViewConfiguration.getTapTimeout() >> 16) + 24, 1196797761, false, null, new java.lang.Class[]{byte[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Boolean.TYPE});
                                }
                                obj3 = ((java.lang.reflect.Constructor) d).newInstance(objArr37);
                                dwVar.j = obj3;
                                dwVar.c(1);
                                i7 = i8;
                            } catch (java.lang.Throwable th24) {
                                java.lang.Throwable cause9 = th24.getCause();
                                if (cause9 == null) {
                                    throw th24;
                                }
                                throw cause9;
                            }
                        case -4:
                            dwVar.d = 1;
                            dwVar.c(3);
                            dwVar.c(4);
                            i5 = ((com.facetec.sdk.ao) dwVar.g).c;
                            dwVar.d = i5;
                            dwVar.c(5);
                            i7 = i8;
                        case -3:
                            dwVar.d = 1;
                            dwVar.c(3);
                            dwVar.c(4);
                            i5 = ((com.facetec.sdk.ao) dwVar.g).b;
                            dwVar.d = i5;
                            dwVar.c(5);
                            i7 = i8;
                        case -2:
                            try {
                                dwVar.j = com.facetec.sdk.ai.l;
                                dwVar.c(1);
                                i7 = i8;
                            } catch (java.lang.Throwable th25) {
                                th = th25;
                                i2 = 23;
                                if (i7 < i2) {
                                }
                                if (i7 >= 93) {
                                }
                            }
                            break;
                        case -1:
                            i7 = 73;
                        default:
                            i7 = i8;
                    }
                }
            } catch (java.lang.Throwable th26) {
                java.lang.Throwable cause10 = th26.getCause();
                if (cause10 == null) {
                    throw th26;
                }
                throw cause10;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void M() {
        com.facetec.sdk.aj ajVar = this.V;
        if (ajVar != null) {
            ajVar.d(false, (android.view.ViewGroup) this.E);
        }
    }

    static com.facetec.sdk.bw a(boolean z, boolean z2) {
        com.facetec.sdk.bw bwVar = new com.facetec.sdk.bw();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("overzoomedDocument", z);
        bundle.putBoolean("isStandaloneIDScan", z2);
        bwVar.setArguments(bundle);
        return bwVar;
    }

    @Override // android.app.Fragment
    public final void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        this.l = (com.facetec.sdk.bl) activity;
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        j();
        r();
        f();
    }

    @Override // android.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        return layoutInflater.inflate(com.facetec.sdk.R.layout.facetec_idscan_fragment, viewGroup, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x049c, code lost:
    
        if (r14 != 4) goto L48;
     */
    @Override // android.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        int i5;
        super.onViewCreated(view, bundle);
        this.W = new android.os.Handler();
        this.t = (android.widget.RelativeLayout) view.findViewById(com.facetec.sdk.R.id.idTypeLayout);
        this.r = (android.widget.RelativeLayout) view.findViewById(com.facetec.sdk.R.id.cameraLayout);
        this.p = (com.facetec.sdk.bv) view.findViewById(com.facetec.sdk.R.id.idCaptureFrameView);
        this.x = (android.widget.TextView) view.findViewById(com.facetec.sdk.R.id.reviewInstructionsText);
        this.w = (android.widget.TextView) view.findViewById(com.facetec.sdk.R.id.captureInstructionsText);
        this.d = (android.widget.TextView) view.findViewById(com.facetec.sdk.R.id.tapToFocusMessageText);
        this.u = (android.widget.ImageView) view.findViewById(com.facetec.sdk.R.id.reviewImageView);
        this.f3441a = (com.facetec.sdk.e) view.findViewById(com.facetec.sdk.R.id.takePictureButton);
        this.b = (com.facetec.sdk.e) view.findViewById(com.facetec.sdk.R.id.retakePictureButton);
        this.i = (com.facetec.sdk.e) view.findViewById(com.facetec.sdk.R.id.acceptPictureButton);
        this.D = (android.widget.RelativeLayout) view.findViewById(com.facetec.sdk.R.id.shutterEffectContainer);
        this.A = (android.widget.LinearLayout) view.findViewById(com.facetec.sdk.R.id.reviewButtonsContainer);
        this.G = (android.widget.ImageView) view.findViewById(com.facetec.sdk.R.id.flashButton);
        this.e = (android.widget.RelativeLayout) view.findViewById(com.facetec.sdk.R.id.parentLayout);
        this.E = (android.widget.RelativeLayout) view.findViewById(com.facetec.sdk.R.id.cameraContainer);
        this.q = (android.widget.RelativeLayout) view.findViewById(com.facetec.sdk.R.id.parentInterfaceLayout);
        this.c = (android.widget.ImageView) view.findViewById(com.facetec.sdk.R.id.cancelButton);
        this.g = (com.facetec.sdk.e) view.findViewById(com.facetec.sdk.R.id.continueButton);
        this.v = (android.widget.TextView) view.findViewById(com.facetec.sdk.R.id.selectionHeader);
        this.K = (android.widget.LinearLayout) view.findViewById(com.facetec.sdk.R.id.selectionButtonLayout);
        this.M = (android.widget.RelativeLayout) view.findViewById(com.facetec.sdk.R.id.interfaceButtonLayout);
        this.N = (android.widget.RelativeLayout) view.findViewById(com.facetec.sdk.R.id.idTypeLayoutBackground);
        this.J = (android.widget.RelativeLayout) view.findViewById(com.facetec.sdk.R.id.idTypeLayoutContent);
        this.y = (android.widget.RelativeLayout) view.findViewById(com.facetec.sdk.R.id.cameraTransitionView);
        this.z = (android.widget.LinearLayout) view.findViewById(com.facetec.sdk.R.id.selectionDocumentImageLayout);
        this.B = (android.widget.ImageView) view.findViewById(com.facetec.sdk.R.id.selectionDocumentImage);
        this.C = (android.widget.RelativeLayout) view.findViewById(com.facetec.sdk.R.id.instructionsContainer);
        this.F = (android.widget.LinearLayout) view.findViewById(com.facetec.sdk.R.id.selectionMainLayout);
        this.s = (com.facetec.sdk.bi) view.findViewById(com.facetec.sdk.R.id.focusAnimationView);
        this.h = view.findViewById(com.facetec.sdk.R.id.reviewButtonSeparator);
        this.H = (android.widget.RelativeLayout) view.findViewById(com.facetec.sdk.R.id.focusMessageContainer);
        this.I = (android.widget.RelativeLayout) view.findViewById(com.facetec.sdk.R.id.croppedFrame);
        this.U = (android.widget.FrameLayout) view.findViewById(com.facetec.sdk.R.id.securingCameraFragmentContainer);
        this.L = (android.widget.ImageView) view.findViewById(com.facetec.sdk.R.id.mainBrandingImageView);
        this.R = (android.widget.RelativeLayout) view.findViewById(com.facetec.sdk.R.id.mainTransitionView);
        if (com.facetec.sdk.FaceTecSDK.f3366a.i.selectionScreenDocumentImage != 0) {
            i = com.facetec.sdk.FaceTecSDK.f3366a.i.selectionScreenDocumentImage;
        } else {
            i = com.facetec.sdk.R.drawable.facetec_document;
        }
        if (com.facetec.sdk.FaceTecSDK.f3366a.i.activeTorchButtonImage != 0) {
            i2 = com.facetec.sdk.FaceTecSDK.f3366a.i.activeTorchButtonImage;
        } else {
            i2 = com.facetec.sdk.R.drawable.facetec_active_torch;
        }
        if (com.facetec.sdk.FaceTecSDK.f3366a.i.inactiveTorchButtonImage != 0) {
            i3 = com.facetec.sdk.FaceTecSDK.f3366a.i.inactiveTorchButtonImage;
        } else {
            i3 = com.facetec.sdk.R.drawable.facetec_inactive_torch;
        }
        com.facetec.sdk.FaceTecSDK.f3366a.i.selectionScreenDocumentImage = i;
        com.facetec.sdk.FaceTecSDK.f3366a.i.activeTorchButtonImage = i2;
        com.facetec.sdk.FaceTecSDK.f3366a.i.inactiveTorchButtonImage = i3;
        boolean z2 = getArguments().getBoolean("overzoomedDocument");
        this.Q = getArguments().getBoolean("isStandaloneIDScan");
        com.facetec.sdk.dm.i(this.e);
        com.facetec.sdk.dm.i(this.R);
        this.v.setTypeface(com.facetec.sdk.FaceTecSDK.f3366a.i.headerFont);
        this.x.setTypeface(com.facetec.sdk.FaceTecSDK.f3366a.i.subtextFont);
        this.w.setTypeface(com.facetec.sdk.FaceTecSDK.f3366a.i.subtextFont);
        this.d.setTypeface(com.facetec.sdk.FaceTecSDK.f3366a.i.captureScreenFocusMessageFont);
        this.v.setLineSpacing(0.0f, 1.1f);
        com.facetec.sdk.dl.d(this.v, com.facetec.sdk.R.string.FaceTec_idscan_type_selection_header);
        com.facetec.sdk.dl.d(this.g, com.facetec.sdk.R.string.FaceTec_action_continue);
        float a2 = com.facetec.sdk.dm.a() * com.facetec.sdk.dm.b();
        this.L.getLayoutParams().height = java.lang.Math.round(com.facetec.sdk.ay.d(18) * a2);
        ((android.view.ViewGroup.MarginLayoutParams) ((android.widget.RelativeLayout.LayoutParams) this.L.getLayoutParams())).topMargin = com.facetec.sdk.dm.d();
        android.graphics.drawable.Drawable drawable = androidx.core.content.ContextCompat.getDrawable(this.l, com.facetec.sdk.dm.b(getActivity()));
        android.graphics.drawable.Drawable drawable2 = androidx.core.content.ContextCompat.getDrawable(this.l, com.facetec.sdk.dm.a(getActivity()));
        if (this.Q) {
            int argb = android.graphics.Color.argb(255, 187, 187, 187);
            this.L.setImageDrawable(drawable);
            this.L.setVisibility(0);
            if (!com.facetec.sdk.FaceTecSDK.f3366a.b) {
                com.facetec.sdk.bl blVar = this.l;
                if (com.facetec.sdk.dm.d(blVar, new java.util.ArrayList(java.util.Arrays.asList(java.lang.Integer.valueOf(com.facetec.sdk.dm.d(blVar)), java.lang.Integer.valueOf(argb))))) {
                    this.L.setColorFilter(android.graphics.Color.argb(255, 68, 68, 68), android.graphics.PorterDuff.Mode.SRC_IN);
                    com.facetec.sdk.at.a(java.lang.String.format(java.util.Locale.getDefault(), "FaceTec SDK Customization Alert: Your ID Scan Capture Screen background color has been detected as too similar to ID Scan watermark image tint. The ID Scan watermark image tint color will be adjusted for visibility.", new java.lang.Object[0]));
                } else {
                    this.L.setColorFilter(argb, android.graphics.PorterDuff.Mode.SRC_IN);
                }
            }
        } else if (com.facetec.sdk.FaceTecSDK.f3366a.i.showFaceMatchToIDBrandingImage) {
            this.L.setImageDrawable(drawable2);
            this.L.setVisibility(0);
        } else {
            this.L.setVisibility(8);
        }
        int aK = com.facetec.sdk.dm.aK();
        if (com.facetec.sdk.FaceTecSDK.f3366a.i.showSelectionScreenDocumentImage && aK != 0) {
            i4 = java.lang.Math.round(com.facetec.sdk.ay.d(78) * a2);
            i5 = java.lang.Math.round(com.facetec.sdk.dm.d());
            this.B.setImageDrawable(androidx.core.content.ContextCompat.getDrawable(this.l, aK));
            this.B.setVisibility(0);
            z = true;
        } else {
            this.B.setVisibility(8);
            i4 = 0;
            z = false;
            i5 = 0;
        }
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.z.getLayoutParams();
        ((android.view.ViewGroup.LayoutParams) layoutParams).height = i4;
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin = z ? i5 : 0;
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i5;
        this.z.setLayoutParams(layoutParams);
        android.graphics.drawable.Drawable drawable3 = androidx.core.content.ContextCompat.getDrawable(this.l, com.facetec.sdk.R.drawable.facetec_idscan_capture_instructions_background);
        com.facetec.sdk.dp.e(this.l, this.w, drawable3, com.facetec.sdk.dm.aE());
        com.facetec.sdk.dp.c(this.l, this.w, drawable3, com.facetec.sdk.dp.e(this.l, com.facetec.sdk.dm.aJ()), (int) (com.facetec.sdk.ay.d(com.facetec.sdk.dm.w()) * com.facetec.sdk.dm.b()), (int) (com.facetec.sdk.ay.d(com.facetec.sdk.dm.H()) * com.facetec.sdk.dm.b()));
        this.w.setBackground(drawable3);
        android.graphics.drawable.Drawable drawable4 = androidx.core.content.ContextCompat.getDrawable(this.l, com.facetec.sdk.R.drawable.facetec_idscan_review_instructions_background);
        com.facetec.sdk.dp.e(this.l, this.x, drawable4, ((java.lang.Integer) com.facetec.sdk.dm.b(com.facetec.sdk.gj.AnonymousClass19.a(), -1950723692, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), 1950723694)).intValue());
        com.facetec.sdk.dp.c(this.l, this.x, drawable4, com.facetec.sdk.dp.e(this.l, com.facetec.sdk.dm.aG()), (int) (com.facetec.sdk.ay.d(com.facetec.sdk.dm.u()) * com.facetec.sdk.dm.b()), (int) (com.facetec.sdk.ay.d(com.facetec.sdk.dm.F()) * com.facetec.sdk.dm.b()));
        this.x.setBackground(drawable4);
        com.facetec.sdk.dm.e(this.v);
        com.facetec.sdk.dm.g(this.w);
        com.facetec.sdk.dm.b(com.facetec.sdk.gj.AnonymousClass19.a(), 1682670321, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[]{this.x}, com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -1682670317);
        com.facetec.sdk.dm.i(this.d);
        com.facetec.sdk.dl.d(this.d, com.facetec.sdk.R.string.FaceTec_idscan_capture_tap_to_focus_message);
        com.facetec.sdk.dm.h(this.N);
        this.y.setBackgroundColor(com.facetec.sdk.dm.d(this.l));
        this.f3441a.c();
        this.b.c();
        this.i.c();
        this.g.c();
        com.facetec.sdk.dl.d(this.f3441a, com.facetec.sdk.R.string.FaceTec_action_take_photo);
        com.facetec.sdk.dl.d(this.b, com.facetec.sdk.R.string.FaceTec_action_retake_photo);
        com.facetec.sdk.dl.d(this.i, com.facetec.sdk.R.string.FaceTec_action_accept_photo);
        if (com.facetec.sdk.dm.bm()) {
            this.c.setImageDrawable(androidx.core.content.ContextCompat.getDrawable(this.l, ((java.lang.Integer) com.facetec.sdk.dm.b(com.facetec.sdk.gj.AnonymousClass19.a(), 958631300, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -958631287)).intValue()));
            this.c.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.facetec.sdk.bw$$ExternalSyntheticLambda11
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    com.facetec.sdk.bw.this.b(view2);
                }
            });
            this.c.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.facetec.sdk.bw$$ExternalSyntheticLambda22
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(android.view.View view2, android.view.MotionEvent motionEvent) {
                    boolean d;
                    d = com.facetec.sdk.bw.this.d(view2, motionEvent);
                    return d;
                }
            });
        }
        int i6 = com.facetec.sdk.bw.AnonymousClass1.b[com.facetec.sdk.FaceTecSDK.f3366a.f3361o.d.ordinal()];
        if (i6 == 2) {
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) this.c.getLayoutParams();
            layoutParams2.removeRule(20);
            layoutParams2.addRule(21);
            this.c.setLayoutParams(layoutParams2);
        } else {
            if (i6 == 3) {
                this.l.x.setVisibility(0);
            }
            this.c.setVisibility(8);
        }
        this.c.getViewTreeObserver().addOnGlobalLayoutListener(this.Z);
        g();
        if (!this.Y) {
            J();
            this.R.setAlpha(1.0f);
            this.R.setVisibility(0);
        }
        if (z2) {
            com.facetec.sdk.bv bvVar = this.p;
            bvVar.e = com.facetec.sdk.bv.d.SMALL_FOR_OVERZOOMED;
            bvVar.e();
            bvVar.f3439a.setStrokeWidth(java.lang.Math.round(bvVar.b));
            bvVar.c = java.lang.Math.round(com.facetec.sdk.ay.d(com.facetec.sdk.dm.M()) * com.facetec.sdk.dm.b());
            bvVar.i = bvVar.d;
            bvVar.d(true);
            bvVar.b();
        }
        e(new java.lang.Runnable() { // from class: com.facetec.sdk.bw$$ExternalSyntheticLambda26
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.bw.this.K();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(int i) {
        a(new java.lang.Runnable() { // from class: com.facetec.sdk.bw$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.bw.this.J();
            }
        }, i);
        com.facetec.sdk.dh dhVar = this.ac;
        if (dhVar.c != null) {
            dhVar.c.removeCallbacks(dhVar.b);
        }
        dhVar.c = new android.os.Handler();
        dhVar.c.postDelayed(dhVar.b, i + 1000);
    }

    private void m() {
        final boolean z = this.l.C == com.facetec.sdk.FaceTecIDScanNextStep.SELECTION_SCREEN && this.j != com.facetec.sdk.bw.c.BACK && this.f == null;
        if (getActivity() != null) {
            getActivity().runOnUiThread(new java.lang.Runnable() { // from class: com.facetec.sdk.bw$$ExternalSyntheticLambda30
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.bw.this.j(z);
                }
            });
        }
        com.facetec.sdk.t.c(com.facetec.sdk.de.ID_SCAN_START);
    }

    final void b(boolean z) {
        this.Y = z;
    }

    final void e(boolean z) {
        this.X = z;
    }

    final void a() {
        if (c()) {
            com.facetec.sdk.dh dhVar = this.ac;
            if (dhVar != null) {
                dhVar.f3509a = true;
                dhVar.a();
            }
            this.E.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.facetec.sdk.bw$$ExternalSyntheticLambda0
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                    boolean b;
                    b = com.facetec.sdk.bw.this.b(view, motionEvent);
                    return b;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean b(android.view.View view, android.view.MotionEvent motionEvent) {
        if (this.O && motionEvent.getAction() == 0 && this.p.d().contains(motionEvent.getX(), motionEvent.getY())) {
            try {
                if (this.V != null) {
                    r();
                    this.ab = true;
                    this.V.d(this.E);
                    this.s.c(motionEvent.getX(), motionEvent.getY());
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return true;
    }

    final void e() {
        if (c()) {
            this.U.animate().alpha(0.0f).setDuration(500L).withEndAction(new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.bw$$ExternalSyntheticLambda20
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.bw.this.I();
                }
            })).start();
        }
    }

    final com.facetec.sdk.ai d() {
        return this.V;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void J() {
        try {
            this.V = (com.facetec.sdk.aj) com.facetec.sdk.ai.b(this.E, this.l, true, true);
        } catch (com.facetec.sdk.ak e) {
            com.facetec.sdk.n.b(e);
            com.facetec.sdk.bl blVar = this.l;
            com.facetec.sdk.c cVar = com.facetec.sdk.c.CAMERA_ERROR;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("IDScanCameraSetupError with message: ");
            sb.append(e.getMessage());
            com.facetec.sdk.t.a(blVar, e, cVar, sb.toString(), false, com.facetec.sdk.FaceTecIDScanStatus.CAMERA_ERROR.ordinal());
            com.facetec.sdk.bl blVar2 = this.l;
            blVar2.a(blVar2.B.getStatus(), com.facetec.sdk.FaceTecIDScanStatus.CAMERA_ERROR);
        }
        this.V.d(new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.bw$$ExternalSyntheticLambda31
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.bw.this.a();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(boolean z) {
        c(false);
        int i = this.Y ? 0 : 500;
        this.t.setVisibility(0);
        float d = com.facetec.sdk.ay.d(20) * com.facetec.sdk.dm.a() * com.facetec.sdk.dm.b();
        if (z) {
            this.F.setTranslationY(-d);
            this.K.setTranslationY(d);
            long j = i;
            this.F.animate().alpha(1.0f).translationY(0.0f).setDuration(500L).setStartDelay(j).setInterpolator(new android.view.animation.DecelerateInterpolator()).setListener(null).start();
            this.K.animate().alpha(1.0f).translationY(0.0f).setDuration(500L).setStartDelay(j).setInterpolator(new android.view.animation.DecelerateInterpolator()).setListener(null).start();
        }
        n();
        if (com.facetec.sdk.FaceTecSDK.f3366a.f3361o.d == com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM) {
            this.l.c(i);
        } else if (com.facetec.sdk.FaceTecSDK.f3366a.f3361o.d != com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.DISABLED) {
            this.c.animate().alpha(1.0f).setDuration(500L).setStartDelay(i).setInterpolator(new android.view.animation.DecelerateInterpolator()).setListener(null).start();
        }
        this.R.animate().alpha(0.0f).setDuration(500L).setStartDelay(i).setInterpolator(new android.view.animation.DecelerateInterpolator()).setListener(null).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G() {
        d(false);
    }

    private void n() {
        this.f3441a.b(new java.lang.Runnable() { // from class: com.facetec.sdk.bw$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.bw.this.G();
            }
        });
        this.b.b(new java.lang.Runnable() { // from class: com.facetec.sdk.bw$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.bw.this.i();
            }
        });
        this.i.b(new java.lang.Runnable() { // from class: com.facetec.sdk.bw$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.bw.this.s();
            }
        });
        this.g.b(new java.lang.Runnable() { // from class: com.facetec.sdk.bw$$ExternalSyntheticLambda15
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.bw.this.p();
            }
        });
        this.G.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.facetec.sdk.bw$$ExternalSyntheticLambda16
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.facetec.sdk.bw.this.d(view);
            }
        });
    }

    final void h() {
        if (c()) {
            com.facetec.sdk.e eVar = this.f3441a;
            if (eVar != null) {
                eVar.setEnabled(false);
            }
            d(new java.lang.Runnable() { // from class: com.facetec.sdk.bw$$ExternalSyntheticLambda32
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.bw.this.B();
                }
            }, 100L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B() {
        if (this.f == com.facetec.sdk.cb.BACK) {
            this.j = com.facetec.sdk.bw.c.BACK;
            com.facetec.sdk.dl.d(this.w, com.facetec.sdk.R.string.FaceTec_idscan_capture_id_back_instruction_message);
        } else {
            this.j = com.facetec.sdk.bw.c.FRONT;
            com.facetec.sdk.dl.d(this.w, com.facetec.sdk.R.string.FaceTec_idscan_capture_id_front_instruction_message);
        }
        this.y.setAlpha(1.0f);
        this.J.setVisibility(8);
        this.t.setVisibility(4);
        this.q.setVisibility(0);
        c(false);
        com.facetec.sdk.aj ajVar = this.V;
        if (ajVar == null) {
            c(3);
            return;
        }
        ajVar.c();
        q();
        com.facetec.sdk.cq.o(this.k, false);
        this.W.postDelayed(new java.lang.Runnable() { // from class: com.facetec.sdk.bw$$ExternalSyntheticLambda27
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.bw.this.E();
            }
        }, 800L);
        k();
        n();
        this.R.animate().alpha(0.0f).setDuration(500L).setStartDelay(0L).setInterpolator(new android.view.animation.DecelerateInterpolator()).setListener(null).withEndAction(new java.lang.Runnable() { // from class: com.facetec.sdk.bw$$ExternalSyntheticLambda28
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.bw.this.F();
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E() {
        this.f3441a.a(true, true);
        this.G.setEnabled(true);
        this.c.setEnabled(true);
        this.f3442o = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F() {
        com.facetec.sdk.aj ajVar = this.V;
        if (ajVar == null) {
            return;
        }
        ajVar.d(new java.lang.Runnable() { // from class: com.facetec.sdk.bw$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.bw.this.H();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H() {
        android.widget.RelativeLayout relativeLayout = this.y;
        if (relativeLayout == null) {
            return;
        }
        relativeLayout.animate().alpha(0.0f).setDuration(500L).setInterpolator(new android.view.animation.DecelerateInterpolator()).setListener(null).start();
    }

    private void k() {
        if (getActivity() == null) {
            return;
        }
        getActivity().runOnUiThread(new java.lang.Runnable() { // from class: com.facetec.sdk.bw$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.bw.this.z();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z() {
        this.G.setImageResource(com.facetec.sdk.dm.aL());
        this.q.setVisibility(0);
        this.w.setVisibility(0);
        int d = com.facetec.sdk.dm.d();
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.C.getLayoutParams();
        float f = d;
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin = (int) ((this.p.d().top - this.C.getHeight()) - f);
        this.C.setLayoutParams(layoutParams);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) this.H.getLayoutParams();
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) (this.p.d().bottom + f);
        this.H.setLayoutParams(layoutParams2);
        android.widget.RelativeLayout.LayoutParams layoutParams3 = (android.widget.RelativeLayout.LayoutParams) this.I.getLayoutParams();
        ((android.view.ViewGroup.LayoutParams) layoutParams3).height = (int) (this.I.getWidth() / 1.59d);
        this.I.setLayoutParams(layoutParams3);
    }

    private void c(final boolean z) {
        this.O = !z;
        com.facetec.sdk.dl.d(this.x, com.facetec.sdk.R.string.FaceTec_idscan_review_id_front_instruction_message);
        if (getActivity() == null) {
            return;
        }
        getActivity().runOnUiThread(new java.lang.Runnable() { // from class: com.facetec.sdk.bw$$ExternalSyntheticLambda21
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.bw.this.h(z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(boolean z) {
        int i;
        int i2 = 0;
        if (z) {
            i = 4;
        } else {
            this.d.animate().alpha(1.0f).setDuration(100L);
            this.L.animate().alpha(1.0f).setDuration(100L);
            i = 0;
            i2 = 4;
        }
        this.A.setVisibility(i2);
        this.u.setVisibility(i2);
        this.x.setVisibility(i2);
        this.G.setVisibility(i);
        if (this.k) {
            this.f3441a.setVisibility(i);
        } else {
            this.f3441a.setVisibility(4);
        }
        this.w.setVisibility(i);
    }

    private void q() {
        r();
        this.aa = new com.facetec.sdk.dg(new java.lang.Runnable() { // from class: com.facetec.sdk.bw$$ExternalSyntheticLambda25
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.bw.this.C();
            }
        });
        java.util.Timer timer = new java.util.Timer();
        this.T = timer;
        timer.scheduleAtFixedRate(this.aa, androidx.camera.core.RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS, androidx.camera.core.RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS);
    }

    private void r() {
        java.util.Timer timer = this.T;
        if (timer != null) {
            timer.cancel();
            this.T = null;
        }
        java.util.TimerTask timerTask = this.aa;
        if (timerTask != null) {
            timerTask.cancel();
            this.aa = null;
        }
    }

    final void i() {
        if (c()) {
            if (this.V == null) {
                c(7);
                return;
            }
            com.facetec.sdk.cq.o(true, true);
            this.f3442o = true;
            q();
            this.V.c();
            if (this.P) {
                this.V.d(true);
            }
            c(false);
            this.b.a(false, true);
            this.i.a(false, true);
            this.f3441a.a(true, true);
            this.f3441a.setVisibility(0);
            if (this.j == com.facetec.sdk.bw.c.FRONT) {
                com.facetec.sdk.dl.d(this.w, com.facetec.sdk.R.string.FaceTec_idscan_capture_id_front_instruction_message);
            } else if (this.j == com.facetec.sdk.bw.c.BACK) {
                com.facetec.sdk.dl.d(this.w, com.facetec.sdk.R.string.FaceTec_idscan_capture_id_back_instruction_message);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        if (this.V == null) {
            c(8);
            return;
        }
        this.i.a(false, true);
        this.b.a(false, true);
        this.c.setEnabled(false);
        this.P = false;
        this.G.setImageResource(com.facetec.sdk.dm.aL());
        this.G.setEnabled(false);
        this.b.a(false, true);
        this.i.a(false, true);
        this.f3441a.a(false, true);
        if (getActivity() != null) {
            getActivity().runOnUiThread(new java.lang.Runnable() { // from class: com.facetec.sdk.bw$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.bw.this.v();
                }
            });
        }
        this.p.e(new java.lang.Runnable() { // from class: com.facetec.sdk.bw$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.bw.this.A();
            }
        });
        com.facetec.sdk.dk.b(new java.lang.Runnable() { // from class: com.facetec.sdk.bw$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.bw.this.D();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A() {
        this.l.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D() {
        java.lang.String str;
        if (this.l.g) {
            str = this.l.D;
        } else {
            str = com.facetec.sdk.cn.b;
        }
        com.facetec.sdk.t.b(getActivity(), this.V.n, false, this.j, str);
    }

    final void j() {
        com.facetec.sdk.aj ajVar = this.V;
        if (ajVar != null) {
            ajVar.d(false);
            android.widget.ImageView imageView = this.G;
            if (imageView != null) {
                imageView.setImageResource(com.facetec.sdk.dm.aL());
            }
        }
        this.P = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v() {
        float d = com.facetec.sdk.ay.d(20) * com.facetec.sdk.dm.a() * com.facetec.sdk.dm.b();
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(android.animation.ObjectAnimator.ofFloat(this.M, (android.util.Property<android.widget.RelativeLayout, java.lang.Float>) android.view.View.TRANSLATION_Y, d), android.animation.ObjectAnimator.ofFloat(this.C, (android.util.Property<android.widget.RelativeLayout, java.lang.Float>) android.view.View.TRANSLATION_Y, -d));
        animatorSet.setDuration(500L);
        animatorSet.start();
        android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
        animatorSet2.playTogether(android.animation.ObjectAnimator.ofFloat(this.M, (android.util.Property<android.widget.RelativeLayout, java.lang.Float>) android.view.View.ALPHA, 0.0f), android.animation.ObjectAnimator.ofFloat(this.C, (android.util.Property<android.widget.RelativeLayout, java.lang.Float>) android.view.View.ALPHA, 0.0f), android.animation.ObjectAnimator.ofFloat(this.d, (android.util.Property<android.widget.TextView, java.lang.Float>) android.view.View.ALPHA, 0.0f), android.animation.ObjectAnimator.ofFloat(this.G, (android.util.Property<android.widget.ImageView, java.lang.Float>) android.view.View.ALPHA, 0.0f), android.animation.ObjectAnimator.ofFloat(this.c, (android.util.Property<android.widget.ImageView, java.lang.Float>) android.view.View.ALPHA, 0.0f), android.animation.ObjectAnimator.ofFloat(this.L, (android.util.Property<android.widget.ImageView, java.lang.Float>) android.view.View.ALPHA, 0.0f), android.animation.ObjectAnimator.ofFloat(this.R, (android.util.Property<android.widget.RelativeLayout, java.lang.Float>) android.view.View.ALPHA, 0.0f));
        animatorSet2.setDuration(500L);
        animatorSet2.start();
        if (this.l.x != null) {
            this.l.x.animate().alpha(0.0f).setDuration(500L).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(android.view.View view) {
        this.c.setEnabled(false);
        this.i.a(false, true);
        this.b.a(false, true);
        this.f3441a.a(false, true);
        this.l.b(com.facetec.sdk.FaceTecIDScanStatus.USER_CANCELED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean d(android.view.View view, android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.c.setAlpha(0.4f);
        } else if (motionEvent.getAction() == 3 || motionEvent.getX() < 0.0f || motionEvent.getX() > this.c.getWidth() + this.c.getLeft() + 10 || motionEvent.getY() < 0.0f || motionEvent.getY() > this.c.getHeight() + this.c.getTop() + 10) {
            this.c.setAlpha(1.0f);
        } else if (motionEvent.getAction() == 1) {
            this.c.performClick();
        }
        return true;
    }

    final void g() {
        int round = java.lang.Math.round((com.facetec.sdk.ay.d(com.facetec.sdk.dm.B()) * com.facetec.sdk.dm.b()) / 2.0f);
        this.r.setPadding(round, round, round, round);
        this.u.setPadding(round, round, round, round);
    }

    final void f() {
        android.widget.ImageView imageView = this.c;
        if (imageView != null) {
            imageView.getViewTreeObserver().removeOnGlobalLayoutListener(this.Z);
        }
        this.Z = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        com.facetec.sdk.cn cnVar = this.l.f3415a;
        if (cnVar == null) {
            return;
        }
        this.g.a(false, true);
        com.facetec.sdk.dl.d(this.w, com.facetec.sdk.R.string.FaceTec_idscan_capture_id_front_instruction_message);
        k();
        q();
        this.f3442o = true;
        boolean e = com.facetec.sdk.ea.e(this.l);
        com.facetec.sdk.bf bfVar = (com.facetec.sdk.bf) getActivity();
        try {
            cnVar.d(bfVar, e, ((com.facetec.sdk.bl) getActivity()).h);
            getActivity().runOnUiThread(new java.lang.Runnable() { // from class: com.facetec.sdk.bw$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.bw.this.y();
                }
            });
        } catch (java.lang.NullPointerException unused) {
            com.facetec.sdk.t.c(bfVar, com.facetec.sdk.c.PHOENIX_HANDLER_UNEXPECTED_NULL, "phoenixHandler is null unexpectedly. Check Activity State Info to see if session has finished", (java.lang.Throwable) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u() {
        this.t.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y() {
        this.t.animate().alpha(0.0f).setDuration(500L).setListener(null).withEndAction(new java.lang.Runnable() { // from class: com.facetec.sdk.bw$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.bw.this.u();
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final android.view.View view) {
        if (this.V == null) {
            c(6);
            return;
        }
        view.setEnabled(false);
        this.f3441a.a(false, true);
        view.postDelayed(new java.lang.Runnable() { // from class: com.facetec.sdk.bw$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.bw.this.c(view);
            }
        }, 1000L);
        boolean z = this.P;
        this.P = !z;
        if (!z) {
            this.G.setImageResource(com.facetec.sdk.dm.aH());
        } else {
            this.G.setImageResource(com.facetec.sdk.dm.aL());
        }
        this.V.d(this.P);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(android.view.View view) {
        view.setEnabled(true);
        this.f3441a.a(true, true);
    }

    private void d(final boolean z) {
        if ((!com.facetec.sdk.bd.g || this.V.f3385o) && this.V.m) {
            r();
            this.f3442o = false;
            if (getActivity() == null) {
                return;
            }
            getActivity().runOnUiThread(new java.lang.Runnable() { // from class: com.facetec.sdk.bw$$ExternalSyntheticLambda24
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.bw.this.f(z);
                }
            });
            com.facetec.sdk.aj ajVar = this.V;
            if (ajVar == null) {
                c(9);
                return;
            }
            if (this.P) {
                ajVar.d(false);
            }
            if (com.facetec.sdk.bd.g) {
                a(z);
            } else {
                g(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(final boolean z) {
        this.i.a(false, true);
        this.b.a(false, true);
        this.f3441a.a(false, true);
        this.f3441a.setVisibility(4);
        this.D.setVisibility(0);
        this.W.postDelayed(new java.lang.Runnable() { // from class: com.facetec.sdk.bw$$ExternalSyntheticLambda23
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.bw.this.i(z);
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(boolean z) {
        this.D.setVisibility(4);
        if (z) {
            return;
        }
        this.d.animate().alpha(0.0f).setDuration(100L);
        this.L.animate().alpha(0.0f).setDuration(100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(boolean z) {
        if (!z) {
            this.V.a(true);
            com.facetec.sdk.cq.n();
        }
        this.O = false;
        if (z) {
            s();
        } else {
            t();
        }
    }

    private void t() {
        c(true);
        if (getActivity() == null) {
            return;
        }
        getActivity().runOnUiThread(new java.lang.Runnable() { // from class: com.facetec.sdk.bw$$ExternalSyntheticLambda29
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.bw.this.x();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x() {
        this.i.a(true, true);
        this.b.a(true, true);
    }

    /* renamed from: com.facetec.sdk.bw$1, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] b;
        static final /* synthetic */ int[] d;
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[com.facetec.sdk.co.values().length];
            e = iArr;
            try {
                iArr[com.facetec.sdk.co.KEEP_SCANNING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                e[com.facetec.sdk.co.END_SCAN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                e[com.facetec.sdk.co.PRESENT_MANUAL_CAPTURE_BUTTON.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[com.facetec.sdk.cp.values().length];
            d = iArr2;
            try {
                iArr2[com.facetec.sdk.cp.ID_IMAGE_HOLD_STEADY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                d[com.facetec.sdk.cp.ID_IMAGE_FACE_NOT_FOUND.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                d[com.facetec.sdk.cp.ID_IMAGE_BLURRY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.values().length];
            b = iArr3;
            try {
                iArr3[com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.TOP_LEFT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                b[com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.TOP_RIGHT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                b[com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                b[com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.DISABLED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.facetec.sdk.co coVar, com.facetec.sdk.cp cpVar) {
        int i = com.facetec.sdk.bw.AnonymousClass1.e[coVar.ordinal()];
        if (i == 1) {
            this.S = false;
            if (com.facetec.sdk.bw.AnonymousClass1.d[cpVar.ordinal()] == 3 && this.ab) {
                this.V.d(true, (android.view.ViewGroup) this.E);
                return;
            }
            return;
        }
        if (i == 2) {
            if (this.S) {
                return;
            }
            this.S = true;
            d(true);
            return;
        }
        if (i == 3 && this.f3442o && this.f3441a.getVisibility() != 0) {
            this.k = true;
            e(new java.lang.Runnable() { // from class: com.facetec.sdk.bw$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.bw.this.w();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w() {
        this.f3441a.setAlpha(0.0f);
        this.f3441a.setVisibility(0);
        this.f3441a.animate().alpha(1.0f).setDuration(200L).setListener(null).start();
    }

    private void c(int i) {
        com.facetec.sdk.n.b(new java.lang.Throwable("FaceTec SDK has experienced an unexpected camera error."));
        com.facetec.sdk.bl blVar = this.l;
        if (blVar == null) {
            return;
        }
        if (blVar.B != null) {
            com.facetec.sdk.bl blVar2 = this.l;
            blVar2.a(blVar2.B.getStatus(), com.facetec.sdk.FaceTecIDScanStatus.CAMERA_ERROR);
            com.facetec.sdk.t.c(this.l, com.facetec.sdk.c.CAMERA_ERROR, "IDScan: FaceTecSDK Camera is null unexpectedly ".concat(java.lang.String.valueOf(i)), (java.lang.Throwable) null);
        } else {
            this.l.a(com.facetec.sdk.FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR, com.facetec.sdk.FaceTecIDScanStatus.CAMERA_ERROR);
            com.facetec.sdk.t.c(this.l, com.facetec.sdk.c.SESSION_RESULT_UNEXPECTED_NULL, "latestSessionResult is null unexpectedly. Check Activity State Info to see if session has finished", (java.lang.Throwable) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I() {
        this.U.setVisibility(8);
        getFragmentManager().beginTransaction().remove(this.ac).commitAllowingStateLoss();
        this.ac = null;
        m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K() {
        com.facetec.sdk.bl blVar = this.l;
        if (blVar != null) {
            blVar.v();
        }
        if (this.Y) {
            boolean z = this.X;
            com.facetec.sdk.dh dhVar = new com.facetec.sdk.dh();
            this.ac = dhVar;
            dhVar.d = (com.facetec.sdk.dh.c) getActivity();
            getChildFragmentManager().beginTransaction().replace(com.facetec.sdk.R.id.securingCameraFragmentContainer, this.ac).addToBackStack(null).commitAllowingStateLoss();
            final int i = 0;
            this.U.setVisibility(0);
            int i2 = 500;
            if (!z) {
                i = 500;
                i2 = 1;
            }
            this.U.animate().alpha(1.0f).setDuration(i2).setStartDelay(0L).setListener(null).withEndAction(new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.bw$$ExternalSyntheticLambda19
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.bw.this.d(i);
                }
            }));
            return;
        }
        m();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void ai(int i, short s, short s2, java.lang.Object[] objArr) {
        int i2;
        byte[] bArr = ah;
        int i3 = s + 4;
        int i4 = s2 + 44;
        byte[] bArr2 = new byte[i + 1];
        if (bArr == null) {
            int i5 = i4;
            int i6 = 0;
            int i7 = i3;
            int i8 = (-i3) + i5;
            i2 = i6;
            int i9 = i7;
            i4 = i8;
            i3 = i9;
            bArr2[i2] = (byte) i4;
            int i10 = i3 + 1;
            if (i2 == i) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i11 = i4;
            i7 = i10;
            i3 = bArr[i10];
            i6 = i2 + 1;
            i5 = i11;
            int i82 = (-i3) + i5;
            i2 = i6;
            int i92 = i7;
            i4 = i82;
            i3 = i92;
            bArr2[i2] = (byte) i4;
            int i102 = i3 + 1;
            if (i2 == i) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            int i1022 = i3 + 1;
            if (i2 == i) {
            }
        }
    }

    static void l() {
        ah = new byte[]{13, -62, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, 97, -4, 5, -1, -5, 6, -8, 8, -1, -6, 7, -8, 8, -1, -7, 8, -1, -8, 9, -1, -9, 10, -10, 10, -1, -10, com.google.common.base.Ascii.VT, -12, com.google.common.base.Ascii.FF, -1, -10, com.google.common.base.Ascii.VT, -1, -11, com.google.common.base.Ascii.FF, -1, -12, 13, -5, 1, 4, -1, -4, 1, 4, -5, -2, 7, -5, -3, 8, -1, -4, 0, 5, -1, -4, -1, 6, -1, -4, -2, 7, -1, -4, -3, 8, -5, 1, 4, -5, 1, 4, -1, -4, -4, 9, -5, -4, 9, -1, -4, 0, 5, -5, -5, 10, -1, -4, -5, 10, -5, -6, com.google.common.base.Ascii.VT, -1, -4, -6, com.google.common.base.Ascii.VT, -1, -4, -7, com.google.common.base.Ascii.FF, -1, -4, -8, 13, -5, -7, com.google.common.base.Ascii.FF, -5, -8, 13, -6, 1, 5, -1, -5, 2, 4, -6, 0, 6, -5, -8, 13, -1, -5, 1, 5, -6, -1, 7, -1, -5, 0, 6, -1, -5, -1, 7, -6, -2, 8, -12, com.google.common.base.Ascii.FF, -1, -5, -2, 8, -6, -3, 9, -6, -4, 10, -12, com.google.common.base.Ascii.FF, -1, -5, -3, 9, -1, -5, -4, 10, -6, -5, com.google.common.base.Ascii.VT, -6, -6, com.google.common.base.Ascii.FF, -6, -7, 13, -1, -5, -5, com.google.common.base.Ascii.VT, -6, -3, 9, -6, -7, 13, -1, -5, -6, com.google.common.base.Ascii.FF, -1, -5, -7, 13, -1, -6, 3, 4, -7, 2, 5, -7, 2, 5, -7, 1, 6, -1, -5, -3, 9, -1, -6, 2, 5, -7, -1, 8, -1, -6, 1, 6, -7, -2, 9, -1, -6, 1, 9, -21, com.google.common.base.Ascii.NAK, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -62, com.google.common.base.Ascii.VT, -13, 7, 57, -37, -33, 2, 9, -5, 7, 3, 4, 3, -11, 9, -21, com.google.common.base.Ascii.NAK, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -62, com.google.common.base.Ascii.VT, -13, 7, 57, -27, -37, -6, com.google.common.base.Ascii.SI, -2, 2, -13, com.google.common.base.Ascii.NAK, -11, -9, 16, com.google.common.base.Ascii.SYN, -23, -5, -6, com.google.common.base.Ascii.RS, -11, -11, -9, 16, 9, -21, com.google.common.base.Ascii.NAK, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -62, com.google.common.base.Ascii.VT, -13, 7, 57, -38, -20, -10, 3, -8, com.google.common.base.Ascii.SYN, -1, -10, 7, 2, -15, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -30, -20, 2, 14, -13, 10, -14, 3, 6, 5, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -73, 14, 5, -3, 2, -15, 70, -23, -51, 8, com.google.common.base.Ascii.SI, -13, 10, 3, -1, -10, 7, com.google.common.base.Ascii.EM, -29, -10, -1, com.google.common.base.Ascii.RS, -19, 4, -18, 2, -15, 36, -17, -2, -8, 6, 1, com.google.common.base.Ascii.DC4, -31, -4, 10, -11, com.google.common.base.Ascii.VT, -6, 1, 40, -41, -3, 43, -43, 3, -6, 5, -13, 10, -14, 3, 6, 5, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -72, 13, 4, -18, 73, -40, -19, 4, -18, 2, -15, 48, -33, -1, 5, -20, 9, -8, 33, -22, -17, com.google.common.base.Ascii.NAK, 9, -21, com.google.common.base.Ascii.NAK, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -62, com.google.common.base.Ascii.VT, -13, 7, 57, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 13, -1, -6, 7, 2, -17, 70, -31, -24, -15, com.google.common.base.Ascii.FF, -7, com.google.common.base.Ascii.VT, -5, -8, 7, 4, 6, 9, -21, com.google.common.base.Ascii.NAK, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -62, com.google.common.base.Ascii.VT, -13, 7, 57, -33, -19, -8, 5, 2, -17, com.google.common.base.Ascii.SI, -30, 9, -21, com.google.common.base.Ascii.NAK, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -62, com.google.common.base.Ascii.VT, -13, 7, 57, -33, -19, -8, 5, 2, -17, 57, 9, -21, com.google.common.base.Ascii.NAK, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -62, com.google.common.base.Ascii.VT, -13, 7, 57, -30, -35, 1, 7, -3, 1, 7, 17, -11, -11, -9, 16};
        ad = 192;
    }

    static {
        init$0();
        l();
        af = 0;
        ae = 1;
        ag = -7463236880700439079L;
    }

    @Override // com.facetec.sdk.au, android.app.Fragment
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:184:0x042f A[Catch: all -> 0x0431, TryCatch #10 {all -> 0x0431, blocks: (B:176:0x0419, B:182:0x0429, B:184:0x042f, B:185:0x0430), top: B:175:0x0419 }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0430 A[Catch: all -> 0x0431, TRY_LEAVE, TryCatch #10 {all -> 0x0431, blocks: (B:176:0x0419, B:182:0x0429, B:184:0x042f, B:185:0x0430), top: B:175:0x0419 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x052b A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(boolean z) {
        boolean z2;
        int i;
        java.lang.Class<?>[] clsArr;
        int i2;
        java.lang.Class<?>[] clsArr2;
        java.lang.Object obj;
        java.lang.Throwable cause;
        java.lang.Class<?> cls;
        java.lang.String str;
        int i3;
        java.lang.Object obj2;
        java.lang.Object invoke;
        int i4;
        java.lang.Object obj3;
        java.lang.Object obj4;
        int i5;
        java.lang.Object[] objArr;
        java.lang.Class<?> cls2;
        com.facetec.sdk.dx dxVar = new com.facetec.sdk.dx(this, z ? 1 : 0);
        int i6 = ad;
        byte[] bArr = ah;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        ai((short) (i6 | 33), bArr[6], bArr[42], objArr2);
        ?? r3 = 0;
        java.lang.String str2 = (java.lang.String) objArr2[0];
        byte b = bArr[56];
        short s = b;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        ai(s, (short) (s | 224), b, objArr3);
        try {
            java.lang.Object[] objArr4 = {(java.lang.String) objArr3[0]};
            char c2 = 260;
            short s2 = (short) (i6 | 32);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            ai(bArr[260], s2, (byte) (-bArr[1]), objArr5);
            java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr5[0]);
            short s3 = bArr[43];
            short s4 = (short) (s3 | 235);
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            ai(s3, s4, (byte) (s4 & 343), objArr6);
            java.lang.String str3 = (java.lang.String) objArr6[0];
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            ai(bArr[260], s2, (byte) (-bArr[1]), objArr7);
            java.lang.Object[] objArr8 = (java.lang.Object[]) cls3.getMethod(str3, java.lang.Class.forName((java.lang.String) objArr7[0])).invoke(str2, objArr4);
            int[] iArr = new int[objArr8.length];
            int i7 = 0;
            while (i7 < objArr8.length) {
                java.lang.Object[] objArr9 = {objArr8[i7]};
                byte[] bArr2 = ah;
                short s5 = bArr2[267];
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                ai(s5, (short) (s5 | 227), (byte) (-bArr2[1]), objArr10);
                java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr10[0]);
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                ai(bArr2[8], (short) 259, (byte) (bArr2[369] + 1), objArr11);
                java.lang.String str4 = (java.lang.String) objArr11[0];
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                ai(bArr2[c2], (short) (ad | 32), (byte) (-bArr2[1]), objArr12);
                java.lang.Object invoke2 = cls4.getMethod(str4, java.lang.Class.forName((java.lang.String) objArr12[0])).invoke(null, objArr9);
                short s6 = bArr2[267];
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                ai(s6, (short) (s6 | 227), (byte) (-bArr2[1]), objArr13);
                java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr13[0]);
                java.lang.Object[] objArr14 = new java.lang.Object[1];
                ai(bArr2[13], (short) com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_SHIELD_VALUE, (byte) 61, objArr14);
                iArr[i7] = ((java.lang.Integer) cls5.getMethod((java.lang.String) objArr14[0], null).invoke(invoke2, null)).intValue();
                i7++;
                c2 = 260;
            }
            int i8 = 0;
            java.lang.Class<?>[] clsArr3 = null;
            while (true) {
                int i9 = i8 + 1;
                try {
                } catch (java.lang.Throwable th) {
                    th = th;
                    z2 = r3;
                    i = 2;
                }
                switch (dxVar.e(iArr[i8])) {
                    case -32:
                        z2 = r3;
                        i4 = 64;
                        i8 = i4;
                        r3 = z2;
                    case -31:
                        z2 = r3;
                        dxVar.e(33);
                        i9 = dxVar.d != 76 ? 60 : 46;
                        clsArr = clsArr3;
                        i8 = i9;
                        clsArr3 = clsArr;
                        r3 = z2;
                    case -30:
                        z2 = r3;
                        i4 = 65;
                        i8 = i4;
                        r3 = z2;
                    case -29:
                        z2 = r3;
                        i4 = 67;
                        i8 = i4;
                        r3 = z2;
                    case -28:
                        z2 = r3;
                        dxVar.e(30);
                        if (dxVar.d == 0) {
                            i8 = 59;
                            r3 = z2;
                        }
                        clsArr = clsArr3;
                        i8 = i9;
                        clsArr3 = clsArr;
                        r3 = z2;
                    case -27:
                        z2 = r3;
                        dxVar.c = 1;
                        dxVar.e(1);
                        dxVar.e(11);
                        ae = dxVar.d;
                        clsArr = clsArr3;
                        i8 = i9;
                        clsArr3 = clsArr;
                        r3 = z2;
                    case -26:
                        z2 = r3;
                        dxVar.c = af;
                        dxVar.e(9);
                        clsArr = clsArr3;
                        i8 = i9;
                        clsArr3 = clsArr;
                        r3 = z2;
                    case -25:
                        z2 = r3;
                        i8 = 12;
                        r3 = z2;
                    case -24:
                        z2 = r3;
                        i8 = 1;
                        r3 = z2;
                    case -23:
                        return;
                    case -22:
                        z2 = r3;
                        i = 2;
                        try {
                            dxVar.c = 2;
                            dxVar.e(1);
                            dxVar.e(2);
                            com.facetec.sdk.aj ajVar = (com.facetec.sdk.aj) dxVar.g;
                            dxVar.e(2);
                            ajVar.c((android.hardware.Camera.PictureCallback) dxVar.g);
                            clsArr = clsArr3;
                            i8 = i9;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            clsArr = clsArr3;
                            i2 = 12;
                            if (i8 < i2) {
                            }
                            throw th;
                        }
                        clsArr3 = clsArr;
                        r3 = z2;
                        break;
                    case -21:
                        z2 = r3;
                        i3 = 3;
                        dxVar.c = 1;
                        dxVar.e(1);
                        dxVar.e(2);
                        obj3 = ((com.facetec.sdk.bw) dxVar.g).V;
                        dxVar.h = obj3;
                        clsArr = clsArr3;
                        try {
                            dxVar.e(i3);
                            i8 = i9;
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            i = 2;
                            i2 = 12;
                            if (i8 < i2) {
                            }
                            throw th;
                        }
                        clsArr3 = clsArr;
                        r3 = z2;
                        break;
                    case -20:
                        z2 = r3;
                        try {
                            i3 = 3;
                            dxVar.c = 3;
                            dxVar.e(1);
                            dxVar.e(2);
                            com.facetec.sdk.bw bwVar = (com.facetec.sdk.bw) dxVar.g;
                            dxVar.e(20);
                            long j = dxVar.e;
                            dxVar.e(11);
                            obj3 = bwVar.new AnonymousClass4(j, dxVar.d != 0 ? true : z2);
                            dxVar.h = obj3;
                            clsArr = clsArr3;
                            dxVar.e(i3);
                            i8 = i9;
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            clsArr = clsArr3;
                            i = 2;
                            i2 = 12;
                            if (i8 < i2) {
                            }
                            throw th;
                        }
                        clsArr3 = clsArr;
                        r3 = z2;
                        break;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                        try {
                            dxVar.c = 1;
                            dxVar.e(1);
                            dxVar.e(2);
                            obj = dxVar.g;
                            try {
                                byte[] bArr3 = ah;
                                try {
                                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                                    ai(bArr3[0], (short) 443, (byte) (-bArr3[1]), objArr15);
                                    cls = java.lang.Class.forName((java.lang.String) objArr15[0]);
                                    short s7 = bArr3[10];
                                    short s8 = (short) (s7 | 448);
                                    java.lang.Object[] objArr16 = new java.lang.Object[1];
                                    ai(s7, s8, (byte) (s8 & 112), objArr16);
                                    z2 = false;
                                    try {
                                        str = (java.lang.String) objArr16[0];
                                        clsArr2 = null;
                                    } catch (java.lang.Throwable th5) {
                                        th = th5;
                                        cause = th.getCause();
                                        if (cause != null) {
                                            throw th;
                                        }
                                        throw cause;
                                    }
                                } catch (java.lang.Throwable th6) {
                                    th = th6;
                                }
                            } catch (java.lang.Throwable th7) {
                                th = th7;
                            }
                        } catch (java.lang.Throwable th8) {
                            th = th8;
                            z2 = false;
                            clsArr2 = null;
                        }
                        try {
                            try {
                                dxVar.b = ((java.lang.Long) cls.getMethod(str, null).invoke(obj, null)).longValue();
                                clsArr = null;
                                i3 = 12;
                                dxVar.e(i3);
                                i8 = i9;
                            } catch (java.lang.Throwable th9) {
                                th = th9;
                                clsArr = clsArr2;
                                i = 2;
                                i2 = 12;
                                if (i8 < i2) {
                                }
                                throw th;
                            }
                            clsArr3 = clsArr;
                            r3 = z2;
                        } catch (java.lang.Throwable th10) {
                            th = th10;
                            cause = th.getCause();
                            if (cause != null) {
                            }
                        }
                        break;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        dxVar.c = 1;
                        dxVar.e(1);
                        dxVar.e(2);
                        obj4 = dxVar.g;
                        dxVar.h = obj4;
                        dxVar.e(3);
                        clsArr = null;
                        z2 = false;
                        i8 = i9;
                        clsArr3 = clsArr;
                        r3 = z2;
                    case -17:
                        try {
                            dxVar.c = 3;
                            dxVar.e(1);
                            dxVar.e(2);
                            java.lang.Object obj5 = dxVar.g;
                            dxVar.e(2);
                            java.lang.Object obj6 = dxVar.g;
                            dxVar.e(2);
                            try {
                                java.lang.Object[] objArr17 = {obj6, dxVar.g};
                                byte[] bArr4 = ah;
                                java.lang.Object[] objArr18 = new java.lang.Object[1];
                                ai((short) (-bArr4[269]), (short) 382, (byte) (-bArr4[1]), objArr18);
                                java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr18[r3]);
                                short s9 = bArr4[5];
                                java.lang.Object[] objArr19 = new java.lang.Object[1];
                                ai(s9, (short) (s9 | 400), (byte) 61, objArr19);
                                java.lang.String str5 = (java.lang.String) objArr19[r3];
                                java.lang.Object[] objArr20 = new java.lang.Object[1];
                                ai(bArr4[260], (short) 410, (byte) (-bArr4[1]), objArr20);
                                java.lang.Object[] objArr21 = new java.lang.Object[1];
                                ai((short) (-bArr4[333]), (short) androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_PHASE, (byte) (bArr4[376] - 1), objArr21);
                                obj4 = cls6.getMethod(str5, java.lang.Class.forName((java.lang.String) objArr20[0]), java.lang.Class.forName((java.lang.String) objArr21[0])).invoke(obj5, objArr17);
                                dxVar.h = obj4;
                                dxVar.e(3);
                                clsArr = null;
                                z2 = false;
                                i8 = i9;
                            } catch (java.lang.Throwable th11) {
                                java.lang.Throwable cause2 = th11.getCause();
                                if (cause2 == null) {
                                    throw th11;
                                }
                                throw cause2;
                            }
                        } catch (java.lang.Throwable th12) {
                            th = th12;
                            i = 2;
                            i2 = 12;
                            clsArr = null;
                            z2 = false;
                            if (i8 < i2 || i8 >= 33) {
                                throw th;
                            }
                            dxVar.h = th;
                            dxVar.e(36);
                            i8 = i;
                            clsArr3 = clsArr;
                            r3 = z2;
                        }
                        clsArr3 = clsArr;
                        r3 = z2;
                        break;
                    case -16:
                        dxVar.c = 3;
                        dxVar.e(1);
                        dxVar.e(2);
                        java.lang.Class cls7 = (java.lang.Class) dxVar.g;
                        dxVar.e(2);
                        java.lang.String str6 = (java.lang.String) dxVar.g;
                        dxVar.e(2);
                        dxVar.h = cls7.getMethod(str6, (java.lang.Class[]) dxVar.g);
                        i5 = 3;
                        dxVar.e(i5);
                        z2 = r3;
                        clsArr = clsArr3;
                        i8 = i9;
                        clsArr3 = clsArr;
                        r3 = z2;
                    case -15:
                        dxVar.c = 2;
                        dxVar.e(1);
                        dxVar.e(11);
                        int i10 = dxVar.d;
                        dxVar.e(11);
                        try {
                            objArr = new java.lang.Object[2];
                            objArr[1] = java.lang.Integer.valueOf(dxVar.d);
                            objArr[r3] = java.lang.Integer.valueOf(i10);
                            java.lang.Object[] objArr22 = new java.lang.Object[1];
                            ai(r8[267], (short) 353, (byte) (ah[308] - 1), objArr22);
                            cls2 = java.lang.Class.forName((java.lang.String) objArr22[r3]);
                        } catch (java.lang.Throwable th13) {
                            th = th13;
                        }
                        try {
                            java.lang.Object[] objArr23 = new java.lang.Object[1];
                            ai(r8[r3], (short) 369, (byte) 59, objArr23);
                            java.lang.String str7 = (java.lang.String) objArr23[r3];
                            java.lang.Class<?>[] clsArr4 = new java.lang.Class[2];
                            clsArr4[r3] = java.lang.Integer.TYPE;
                            clsArr4[1] = java.lang.Integer.TYPE;
                            try {
                                dxVar.c = ((java.lang.Integer) cls2.getMethod(str7, clsArr4).invoke(clsArr3, objArr)).intValue();
                                i5 = 9;
                                dxVar.e(i5);
                                z2 = r3;
                                clsArr = clsArr3;
                                i8 = i9;
                            } catch (java.lang.Throwable th14) {
                                th = th14;
                                z2 = r3;
                                clsArr = clsArr3;
                                i = 2;
                                i2 = 12;
                                if (i8 < i2) {
                                }
                                throw th;
                            }
                            clsArr3 = clsArr;
                            r3 = z2;
                        } catch (java.lang.Throwable th15) {
                            th = th15;
                            java.lang.Throwable cause3 = th.getCause();
                            if (cause3 == null) {
                                throw th;
                            }
                            throw cause3;
                        }
                        break;
                    case -14:
                        dxVar.c = 62851;
                        i5 = 9;
                        dxVar.e(i5);
                        z2 = r3;
                        clsArr = clsArr3;
                        i8 = i9;
                        clsArr3 = clsArr;
                        r3 = z2;
                    case -13:
                        invoke = "巼ꡩ뛫뵤诶陾鳹\ueb5e\uf1eeﱩ쫤텳\udfd2⩔ベ㽛ל";
                        dxVar.h = invoke;
                        i5 = 3;
                        dxVar.e(i5);
                        z2 = r3;
                        clsArr = clsArr3;
                        i8 = i9;
                        clsArr3 = clsArr;
                        r3 = z2;
                    case -12:
                        dxVar.c = 1;
                        dxVar.e(1);
                        dxVar.e(2);
                        invoke = java.lang.Class.forName((java.lang.String) dxVar.g);
                        dxVar.h = invoke;
                        i5 = 3;
                        dxVar.e(i5);
                        z2 = r3;
                        clsArr = clsArr3;
                        i8 = i9;
                        clsArr3 = clsArr;
                        r3 = z2;
                    case -11:
                        dxVar.c = 2;
                        dxVar.e(1);
                        dxVar.e(2);
                        java.lang.String str8 = (java.lang.String) dxVar.g;
                        dxVar.e(11);
                        java.lang.Object[] objArr24 = new java.lang.Object[1];
                        aj(str8, dxVar.d, objArr24);
                        invoke = (java.lang.String) objArr24[r3];
                        dxVar.h = invoke;
                        i5 = 3;
                        dxVar.e(i5);
                        z2 = r3;
                        clsArr = clsArr3;
                        i8 = i9;
                        clsArr3 = clsArr;
                        r3 = z2;
                    case -10:
                        dxVar.c = 1;
                        dxVar.e(1);
                        dxVar.e(11);
                        try {
                            java.lang.Object[] objArr25 = new java.lang.Object[1];
                            objArr25[r3] = java.lang.Integer.valueOf(dxVar.d);
                            byte[] bArr5 = ah;
                            short s10 = (short) (bArr5[383] - 1);
                            java.lang.Object[] objArr26 = new java.lang.Object[1];
                            ai(s10, (short) (s10 | 265), (byte) (bArr5[308] - 1), objArr26);
                            java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr26[r3]);
                            java.lang.Object[] objArr27 = new java.lang.Object[1];
                            ai((short) (-bArr5[405]), (short) 329, (byte) 59, objArr27);
                            java.lang.String str9 = (java.lang.String) objArr27[r3];
                            java.lang.Class<?>[] clsArr5 = new java.lang.Class[1];
                            clsArr5[r3] = java.lang.Integer.TYPE;
                            dxVar.b = ((java.lang.Long) cls8.getMethod(str9, clsArr5).invoke(clsArr3, objArr25)).longValue();
                            dxVar.e(12);
                            z2 = r3;
                            clsArr = clsArr3;
                            i8 = i9;
                            clsArr3 = clsArr;
                            r3 = z2;
                        } catch (java.lang.Throwable th16) {
                            java.lang.Throwable cause4 = th16.getCause();
                            if (cause4 == null) {
                                throw th16;
                            }
                            throw cause4;
                        }
                    case -9:
                        dxVar.c = 54193;
                        i5 = 9;
                        dxVar.e(i5);
                        z2 = r3;
                        clsArr = clsArr3;
                        i8 = i9;
                        clsArr3 = clsArr;
                        r3 = z2;
                    case -8:
                        invoke = "巵蹏懲⛭፵羆ꯘ鐦쁰Ⲉᤦ䕽놠\ue216칔㪭";
                        dxVar.h = invoke;
                        i5 = 3;
                        dxVar.e(i5);
                        z2 = r3;
                        clsArr = clsArr3;
                        i8 = i9;
                        clsArr3 = clsArr;
                        r3 = z2;
                    case -7:
                        dxVar.e(7);
                        throw ((java.lang.Throwable) dxVar.g);
                    case -6:
                        z2 = r3;
                        i8 = 10;
                        r3 = z2;
                    case -5:
                        z2 = r3;
                        i8 = 8;
                        r3 = z2;
                    case -4:
                        dxVar.e(5);
                        if (dxVar.d == 0) {
                            z2 = r3;
                            i8 = 7;
                            r3 = z2;
                        }
                        i8 = i9;
                        z2 = r3;
                        r3 = z2;
                    case -3:
                        try {
                            dxVar.c = 1;
                            dxVar.e(1);
                            dxVar.e(2);
                            obj2 = dxVar.g;
                        } catch (java.lang.Throwable th17) {
                            th = th17;
                            z2 = r3;
                            clsArr = clsArr3;
                            i = 2;
                            i2 = 12;
                            if (i8 < i2) {
                                break;
                            }
                            throw th;
                        }
                        try {
                            byte[] bArr6 = ah;
                            java.lang.Object[] objArr28 = new java.lang.Object[1];
                            ai((short) (-bArr6[333]), (short) com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE, (byte) (-bArr6[1]), objArr28);
                            java.lang.Class<?> cls9 = java.lang.Class.forName((java.lang.String) objArr28[r3]);
                            java.lang.Object[] objArr29 = new java.lang.Object[1];
                            ai(bArr6[13], (short) com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_NOTE_VALUE, (byte) 59, objArr29);
                            invoke = cls9.getMethod((java.lang.String) objArr29[r3], clsArr3).invoke(obj2, clsArr3);
                            dxVar.h = invoke;
                            i5 = 3;
                            dxVar.e(i5);
                            z2 = r3;
                            clsArr = clsArr3;
                            i8 = i9;
                            clsArr3 = clsArr;
                            r3 = z2;
                        } catch (java.lang.Throwable th18) {
                            java.lang.Throwable cause5 = th18.getCause();
                            if (cause5 == null) {
                                throw th18;
                            }
                            throw cause5;
                        }
                    case -2:
                        i9 = 50;
                        i8 = i9;
                        z2 = r3;
                        r3 = z2;
                    case -1:
                        z2 = r3;
                        i8 = 43;
                        r3 = z2;
                    default:
                        z2 = r3;
                        clsArr = clsArr3;
                        i8 = i9;
                        clsArr3 = clsArr;
                        r3 = z2;
                }
            }
        } catch (java.lang.Throwable th19) {
            java.lang.Throwable cause6 = th19.getCause();
            if (cause6 == null) {
                throw th19;
            }
            throw cause6;
        }
    }
}
