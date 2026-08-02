package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class he implements com.facetec.sdk.gy {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final java.lang.String[] b;
    private static char[] c;
    private static int d;
    private static long e;

    private static java.lang.String $$c(short s, short s2, short s3) {
        int i = 3 - (s3 * 3);
        int i2 = s2 * 4;
        byte[] bArr = $$a;
        int i3 = 113 - s;
        byte[] bArr2 = new byte[1 - i2];
        int i4 = 0 - i2;
        int i5 = -1;
        if (bArr == null) {
            i3 = (-i3) + i4;
            i = i;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i3;
            if (i6 == i4) {
                return new java.lang.String(bArr2, 0);
            }
            int i7 = i + 1;
            i3 = (-bArr[i7]) + i3;
            i = i7;
            i5 = i6;
        }
    }

    static void init$0() {
        $$a = new byte[]{123, -87, -25, -80};
        $$b = 42;
    }

    @Override // com.facetec.sdk.gy
    public final void e(com.facetec.sdk.gu guVar, int i) throws java.io.IOException {
        guVar.c(b[i]);
    }

    @Override // com.facetec.sdk.gy
    public final void b(com.facetec.sdk.gu guVar, int i) throws java.io.IOException {
        guVar.d(b[i]);
    }

    private static void f(int i, int i2, char c2, java.lang.Object[] objArr) {
        com.facetec.sdk.hh hhVar = new com.facetec.sdk.hh();
        long[] jArr = new long[i2];
        hhVar.e = 0;
        while (hhVar.e < i2) {
            int i3 = hhVar.e;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c[i + i3])};
                java.lang.Object d2 = com.facetec.sdk.al.d(-719238807);
                if (d2 == null) {
                    byte b2 = (byte) 0;
                    d2 = com.facetec.sdk.al.c((char) (45149 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), 2150 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 24, 1926116241, false, $$c((byte) ($$b & 28), b2, b2), new java.lang.Class[]{java.lang.Integer.TYPE});
                }
                java.lang.Object[] objArr3 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(i3), java.lang.Long.valueOf(e), java.lang.Integer.valueOf(c2)};
                java.lang.Object d3 = com.facetec.sdk.al.d(671690243);
                if (d3 == null) {
                    byte b3 = (byte) 0;
                    d3 = com.facetec.sdk.al.c((char) (android.graphics.Color.rgb(0, 0, 0) + 16777216), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1834, (android.view.ViewConfiguration.getTouchSlop() >> 8) + 24, -1880730373, false, $$c((byte) 7, b3, b3), new java.lang.Class[]{java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE});
                }
                jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) d3).invoke(null, objArr3)).longValue();
                java.lang.Object[] objArr4 = {hhVar, hhVar};
                java.lang.Object d4 = com.facetec.sdk.al.d(898558648);
                if (d4 == null) {
                    byte b4 = (byte) 0;
                    d4 = com.facetec.sdk.al.c((char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2341, android.view.View.getDefaultSize(0, 0) + 24, -1839099840, false, $$c((byte) 11, b4, b4), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d4).invoke(null, objArr4);
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
            java.lang.Object d5 = com.facetec.sdk.al.d(898558648);
            if (d5 == null) {
                byte b5 = (byte) 0;
                d5 = com.facetec.sdk.al.c((char) android.view.View.getDefaultSize(0, 0), 2341 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), 24 - android.view.View.combineMeasuredStates(0, 0), -1839099840, false, $$c((byte) 11, b5, b5), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
            }
            ((java.lang.reflect.Method) d5).invoke(null, objArr5);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    private static void a(int i, boolean z, int i2, int i3, java.lang.String str, java.lang.Object[] objArr) {
        char[] charArray = str != null ? str.toCharArray() : str;
        com.facetec.sdk.hp hpVar = new com.facetec.sdk.hp();
        char[] cArr = new char[i];
        hpVar.d = 0;
        while (hpVar.d < i) {
            hpVar.b = charArray[hpVar.d];
            cArr[hpVar.d] = (char) (i2 + hpVar.b);
            int i4 = hpVar.d;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i4]), java.lang.Integer.valueOf(d)};
                java.lang.Object d2 = com.facetec.sdk.al.d(-1738479149);
                if (d2 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    d2 = com.facetec.sdk.al.c((char) (19485 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 730 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 24, 1066373931, false, $$c(b2, b3, b3), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                }
                cArr[i4] = ((java.lang.Character) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr3 = {hpVar, hpVar};
                java.lang.Object d3 = com.facetec.sdk.al.d(1965925374);
                if (d3 == null) {
                    d3 = com.facetec.sdk.al.c((char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 24339), android.view.Gravity.getAbsoluteGravity(0, 0) + 1621, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 24, -758982394, false, "v", new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d3).invoke(null, objArr3);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i3 > 0) {
            hpVar.f3630a = i3;
            char[] cArr2 = new char[i];
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, i);
            java.lang.System.arraycopy(cArr2, 0, cArr, i - hpVar.f3630a, hpVar.f3630a);
            java.lang.System.arraycopy(cArr2, hpVar.f3630a, cArr, 0, i - hpVar.f3630a);
        }
        if (z) {
            char[] cArr3 = new char[i];
            hpVar.d = 0;
            while (hpVar.d < i) {
                cArr3[hpVar.d] = cArr[(i - hpVar.d) - 1];
                java.lang.Object[] objArr4 = {hpVar, hpVar};
                java.lang.Object d4 = com.facetec.sdk.al.d(1965925374);
                if (d4 == null) {
                    d4 = com.facetec.sdk.al.c((char) (24339 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 1621 - android.text.TextUtils.indexOf("", "", 0, 0), 24 - android.text.TextUtils.getCapsMode("", 0, 0), -758982394, false, "v", new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d4).invoke(null, objArr4);
            }
            cArr = cArr3;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    static {
        init$0();
        c();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(4 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), false, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 111, -(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), "\u0000￼\u0006", objArr);
        java.lang.String str = (java.lang.String) objArr[0];
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '-', false, (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 113, 2 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), "\ufffb\u0005\u0001", objArr2);
        java.lang.String str2 = (java.lang.String) objArr2[0];
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 12, false, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 108, 4 - android.graphics.Color.alpha(0), "\n\ufff8\ufffe￼￼\t\t\u0006\t￤￼\n", objArr3);
        java.lang.String str3 = (java.lang.String) objArr3[0];
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 18, true, 108 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), 16 - android.widget.ExpandableListView.getPackedPositionChild(0L), "\u0005\u0006\u0000\n\n￼￪\u000b\u0005￼\u0004\u0003\u0003\u0006\t\u0005￼\ufffb￠", objArr4);
        java.lang.String str4 = (java.lang.String) objArr4[0];
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        f(android.view.ViewConfiguration.getEdgeSlop() >> 16, 21 - android.view.KeyEvent.keyCodeFromString(""), (char) (android.view.View.MeasureSpec.getSize(0) + 30526), objArr5);
        java.lang.String str5 = (java.lang.String) objArr5[0];
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        f(android.view.View.resolveSize(0, 0) + 21, 2 - android.graphics.Color.blue(0), (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), objArr6);
        java.lang.String str6 = (java.lang.String) objArr6[0];
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        a((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 4, false, 110 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), "\b\t\ufff6￼", objArr7);
        java.lang.String str7 = (java.lang.String) objArr7[0];
        java.lang.Object[] objArr8 = new java.lang.Object[1];
        a(14 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), true, 108 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 12, "\u0010￫\ufffa\u0000\u000b\n\u0006\u0005\ufffe\ufff8\u0000\ufffb￼\u0007", objArr8);
        java.lang.String str8 = (java.lang.String) objArr8[0];
        java.lang.Object[] objArr9 = new java.lang.Object[1];
        f(android.view.View.resolveSize(0, 0) + 23, android.view.Gravity.getAbsoluteGravity(0, 0) + 18, (char) (3661 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), objArr9);
        java.lang.String str9 = (java.lang.String) objArr9[0];
        java.lang.Object[] objArr10 = new java.lang.Object[1];
        f(40 - android.os.Process.getGidForName(""), android.text.TextUtils.getCapsMode("", 0, 0) + 26, (char) (24244 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr10);
        java.lang.String str10 = (java.lang.String) objArr10[0];
        java.lang.Object[] objArr11 = new java.lang.Object[1];
        f(android.view.View.resolveSize(0, 0) + 67, (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 19, (char) (35026 - android.widget.ExpandableListView.getPackedPositionGroup(0L)), objArr11);
        java.lang.String str11 = (java.lang.String) objArr11[0];
        java.lang.Object[] objArr12 = new java.lang.Object[1];
        f(86 - android.graphics.Color.blue(0), 12 - android.view.View.resolveSize(0, 0), (char) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 18240), objArr12);
        java.lang.String str12 = (java.lang.String) objArr12[0];
        java.lang.Object[] objArr13 = new java.lang.Object[1];
        a(4 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), true, 113 - android.text.TextUtils.getOffsetBefore("", 0), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 3, "\u0001\u0005￼\u0000", objArr13);
        b = new java.lang.String[]{str2, str5, str12, str7, str8, str, str4, str11, str9, str3, (java.lang.String) objArr13[0], str6, str10};
    }

    static void c() {
        d = 780577530;
        c = new char[]{6989, 28651, 61973, 17790, 51645, 23804, 42789, 10849, 48808, 497, 37944, 8035, 25495, 63177, 30978, 52341, 20628, 56116, 11891, 45745, 1520, 27772, 6357, 25150, 5775, 35708, 15360, 45254, 9621, 56955, 21274, 51158, 30892, 60769, 26156, 6900, 36783, 'v', 46384, 10718, 41551, 13003, 18042, 56246, 27900, 57393, 30060, 36532, 1023, 38694, 10320, 48546, 14027, 18963, 57164, 20614, 58831, 31037, 62134, 2019, 39721, 11366, 41344, 15080, 20030, 50017, 21639, 58540, 36893, 3537, 47771, 13910, 41739, 22739, 54680, 16705, 65079, 27587, 57529, 40043, 2359, 34537, 13219, 44902, 9469, 53652, 11070, 24463, 49731, 29961, 63940, 27801, 38721, 6666, 36563, 12709, 42059, 12074};
        e = 8066861009446246566L;
    }
}
