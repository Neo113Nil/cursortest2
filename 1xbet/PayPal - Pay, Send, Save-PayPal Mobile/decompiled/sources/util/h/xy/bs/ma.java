package util.h.xy.bs;

/* loaded from: classes5.dex */
public final class ma {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges;
    static final /* synthetic */ boolean getHighSpeedVideoFpsRangesFor;
    private static int getHighSpeedVideoSizes;
    private static int getHighSpeedVideoSizesFor;
    private static final java.lang.String getOutputMinFrameDuration;

    static {
        getHighSpeedVideoFpsRangesFor();
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 71) % 128;
        getHighSpeedVideoFpsRangesFor = true;
        getOutputMinFrameDuration = util.h.xy.bs.ma.class.getName();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* renamed from: util.h.xy.bs.ma$ma, reason: collision with other inner class name */
    static final class EnumC0262ma {
        public static final util.h.xy.bs.ma.EnumC0262ma Camera2StreamConfigurationMap;
        private static int getHighResolutionOutputSizeshNQ4ISI = 0;
        public static final util.h.xy.bs.ma.EnumC0262ma getHighSpeedVideoFpsRanges;
        private static int getHighSpeedVideoFpsRangesFor = 1;
        public static final util.h.xy.bs.ma.EnumC0262ma getHighSpeedVideoSizes;
        private static final /* synthetic */ util.h.xy.bs.ma.EnumC0262ma[] getHighSpeedVideoSizesFor;
        private static int getInputFormats = 1;
        private static int getInputSizeshNQ4ISI;
        private static char[] getOutputFormats;
        private static long getOutputMinFrameDuration;

        private EnumC0262ma(java.lang.String str, int i) {
        }

        public static util.h.xy.bs.ma.EnumC0262ma valueOf(java.lang.String str) {
            getInputSizeshNQ4ISI = (getInputFormats + 81) % 128;
            util.h.xy.bs.ma.EnumC0262ma enumC0262ma = (util.h.xy.bs.ma.EnumC0262ma) java.lang.Enum.valueOf(util.h.xy.bs.ma.EnumC0262ma.class, str);
            int i = getInputFormats + 41;
            getInputSizeshNQ4ISI = i % 128;
            if (i % 2 == 0) {
                return enumC0262ma;
            }
            throw new java.lang.ArithmeticException();
        }

        public static util.h.xy.bs.ma.EnumC0262ma[] values() {
            getInputSizeshNQ4ISI = (getInputFormats + 125) % 128;
            util.h.xy.bs.ma.EnumC0262ma[] enumC0262maArr = (util.h.xy.bs.ma.EnumC0262ma[]) getHighSpeedVideoSizesFor.clone();
            int i = getInputSizeshNQ4ISI + 101;
            getInputFormats = i % 128;
            if (i % 2 != 0) {
                return enumC0262maArr;
            }
            throw null;
        }

        static {
            getHighSpeedVideoSizes();
            int absoluteGravity = android.view.Gravity.getAbsoluteGravity(0, 0);
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(9 - absoluteGravity, (-1) - android.graphics.ImageFormat.getBitsPerPixel(0), (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1), objArr);
            util.h.xy.bs.ma.EnumC0262ma enumC0262ma = new util.h.xy.bs.ma.EnumC0262ma(((java.lang.String) objArr[0]).intern(), 0);
            getHighSpeedVideoSizes = enumC0262ma;
            int mode = android.view.View.MeasureSpec.getMode(0);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(12 - mode, 10 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr2);
            util.h.xy.bs.ma.EnumC0262ma enumC0262ma2 = new util.h.xy.bs.ma.EnumC0262ma(((java.lang.String) objArr2[0]).intern(), 1);
            Camera2StreamConfigurationMap = enumC0262ma2;
            try {
                long longValue = ((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue();
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(7 - (longValue > 0L ? 1 : (longValue == 0L ? 0 : -1)), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 22, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 14208), objArr3);
                util.h.xy.bs.ma.EnumC0262ma enumC0262ma3 = new util.h.xy.bs.ma.EnumC0262ma(((java.lang.String) objArr3[0]).intern(), 2);
                getHighSpeedVideoFpsRanges = enumC0262ma3;
                int i = (getInputFormats + 21) % 128;
                getInputSizeshNQ4ISI = i;
                util.h.xy.bs.ma.EnumC0262ma[] enumC0262maArr = {enumC0262ma, enumC0262ma2, enumC0262ma3};
                int i2 = i + 93;
                getInputFormats = i2 % 128;
                if (i2 % 2 != 0) {
                    getHighSpeedVideoSizesFor = enumC0262maArr;
                    return;
                }
                throw new java.lang.ArithmeticException();
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        private static void getHighSpeedVideoFpsRangesFor(int i, int i2, char c, java.lang.Object[] objArr) {
            util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
            long[] jArr = new long[i];
            rbVar.f2651 = 0;
            while (rbVar.f2651 < i) {
                getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 117) % 128;
                jArr[rbVar.f2651] = (((char) (getOutputFormats[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getOutputMinFrameDuration))) ^ c;
                rbVar.f2651++;
            }
            char[] cArr = new char[i];
            rbVar.f2651 = 0;
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 31) % 128;
            while (rbVar.f2651 < i) {
                cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
                rbVar.f2651++;
            }
            objArr[0] = new java.lang.String(cArr);
        }

        static void getHighSpeedVideoSizes() {
            getOutputFormats = new char[]{40018, 17486, 11382, 5132, 64556, 42182, 36057, 29938, 23701, 40019, 17502, 11361, 5149, 64560, 42204, 36051, 29938, 23700, 1199, 60736, 54619, 43832, 29477, 6915, 9084, 52051, 37816};
            getOutputMinFrameDuration = -8581469644630440933L;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static util.h.xy.bv.rb m25617(byte[] bArr, byte[] bArr2) throws util.h.xy.ck.rc {
        util.h.xy.cj.mb mo25942;
        util.h.xy.bs.ma.EnumC0262ma Camera2StreamConfigurationMap2;
        int i = getHighSpeedVideoFpsRanges + 121;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            util.h.xy.ar.b.m25074(bArr);
            util.h.xy.ar.b.m25074(bArr2);
        } else {
            new java.lang.Object[]{util.h.xy.ar.b.m25074(bArr), util.h.xy.ar.b.m25074(bArr2)};
        }
        util.h.xy.bs.ma.EnumC0262ma enumC0262ma = util.h.xy.bs.ma.EnumC0262ma.getHighSpeedVideoFpsRanges;
        int i2 = 0;
        byte[] bArr3 = null;
        byte[] bArr4 = null;
        do {
            getHighResolutionOutputSizeshNQ4ISI();
            try {
                bArr3 = util.h.xy.fb.a.m26821(bArr);
                bArr4 = util.h.xy.fb.a.m26821(bArr2);
                mo25942 = util.h.xy.ck.ra.f1116.m25955().mo25942(bArr3, bArr4);
                util.h.xy.ar.b.m25100(bArr3, bArr4);
                i2++;
                Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(i2, mo25942);
            } catch (java.lang.Throwable th) {
                util.h.xy.ar.b.m25100(bArr3, bArr4);
                throw th;
            }
        } while (Camera2StreamConfigurationMap2 == util.h.xy.bs.ma.EnumC0262ma.Camera2StreamConfigurationMap);
        util.h.xy.bv.rb Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap2 == util.h.xy.bs.ma.EnumC0262ma.getHighSpeedVideoSizes, mo25942);
        int i3 = getHighSpeedVideoFpsRanges + 71;
        getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 != 0) {
            return Camera2StreamConfigurationMap3;
        }
        throw null;
    }

    private static void getHighSpeedVideoFpsRangesFor(java.lang.String str, int i, int i2, int i3, boolean z, java.lang.Object[] objArr) {
        getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 75) % 128;
        char[] charArray = str.toCharArray();
        util.h.xz.b.ra raVar = new util.h.xz.b.ra();
        char[] cArr = new char[i];
        raVar.f2649 = 0;
        while (raVar.f2649 < i) {
            raVar.f2650 = charArray[raVar.f2649];
            cArr[raVar.f2649] = (char) (raVar.f2650 + i3);
            int i4 = raVar.f2649;
            cArr[i4] = (char) (cArr[i4] - ((int) (getHighSpeedVideoSizesFor ^ (-4839292868003314026L))));
            raVar.f2649++;
        }
        if (i2 > 0) {
            getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 39) % 128;
            raVar.f2648 = i2;
            char[] cArr2 = new char[i];
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, i);
            java.lang.System.arraycopy(cArr2, 0, cArr, i - raVar.f2648, raVar.f2648);
            java.lang.System.arraycopy(cArr2, raVar.f2648, cArr, 0, i - raVar.f2648);
        }
        if (z) {
            char[] cArr3 = new char[i];
            raVar.f2649 = 0;
            Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 41) % 128;
            while (raVar.f2649 < i) {
                cArr3[raVar.f2649] = cArr[(i - raVar.f2649) - 1];
                raVar.f2649++;
            }
            cArr = cArr3;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static util.h.xy.bv.rb m25618(boolean z) throws util.h.xy.ck.rc, util.h.xy.ci.ma {
        util.h.xy.cj.mb mo25940;
        util.h.xy.bs.ma.EnumC0262ma Camera2StreamConfigurationMap2;
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 99) % 128;
        util.h.xy.bs.ma.EnumC0262ma enumC0262ma = util.h.xy.bs.ma.EnumC0262ma.getHighSpeedVideoFpsRanges;
        boolean z2 = false;
        int i = 0;
        do {
            util.h.xy.bs.ra.f1036.m25620();
            getHighResolutionOutputSizeshNQ4ISI();
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 111) % 128;
            util.h.xy.ck.b m25949 = util.h.xy.ck.ra.f1116.m25949();
            if (z || !m25949.mo25939()) {
                mo25940 = m25949.mo25940();
                getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 7) % 128;
            } else {
                mo25940 = null;
            }
            if (mo25940 == null) {
                Camera2StreamConfigurationMap2 = util.h.xy.bs.ma.EnumC0262ma.getHighSpeedVideoSizes;
                getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 99) % 128;
            } else {
                i++;
                Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(i, mo25940);
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 61) % 128;
            }
        } while (Camera2StreamConfigurationMap2 == util.h.xy.bs.ma.EnumC0262ma.Camera2StreamConfigurationMap);
        int i2 = getHighSpeedVideoFpsRanges + 37;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            util.h.xy.bs.ma.EnumC0262ma enumC0262ma2 = util.h.xy.bs.ma.EnumC0262ma.getHighSpeedVideoSizes;
            throw null;
        }
        if (Camera2StreamConfigurationMap2 == util.h.xy.bs.ma.EnumC0262ma.getHighSpeedVideoSizes) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 15) % 128;
            z2 = true;
        }
        return Camera2StreamConfigurationMap(z2, mo25940);
    }

    private static void getHighResolutionOutputSizeshNQ4ISI() {
        try {
            byte[] bytes = util.h.xy.bh.mb.m25474(util.h.xy.ag.a.m24556().m24558()).getBytes();
            if (bytes != null && bytes.length > 0) {
                java.lang.String str = new java.lang.String(bytes, java.nio.charset.StandardCharsets.UTF_8);
                util.h.xy.ck.ra raVar = util.h.xy.ck.ra.f1116;
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("\uffd0\u0017\b\u000f\u000f\u0004\u001a\uffd0\ufffb\u0007\f", 11 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), android.text.TextUtils.getCapsMode("", 0, 0) + 9, (android.view.ViewConfiguration.getTapTimeout() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, true, objArr);
                raVar.m25953(((java.lang.String) objArr[0]).intern(), str);
                getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            }
            getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 41) % 128;
        } catch (java.lang.Exception e) {
            e.getMessage();
        }
        try {
            byte[] m25469 = util.h.xy.bh.mb.m25469();
            if (m25469 != null) {
                int i = getHighResolutionOutputSizeshNQ4ISI + 97;
                getHighSpeedVideoFpsRanges = i % 128;
                if (i % 2 == 0) {
                    if (m25469.length > 0) {
                        java.lang.String str2 = new java.lang.String(m25469, java.nio.charset.StandardCharsets.UTF_8);
                        util.h.xy.ck.ra raVar2 = util.h.xy.ck.ra.f1116;
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor("\u0012\u0003\n\n\uffff\u0015ￋ\ufff6\u0002\u0007ￋ\u0010\u0003\u0002\u0007\u0014\r\u0010￮", android.view.View.resolveSize(0, 0) + 19, android.text.TextUtils.getOffsetAfter("", 0) + 8, 251 - android.text.TextUtils.indexOf("", "", 0), true, objArr2);
                        raVar2.m25953(((java.lang.String) objArr2[0]).intern(), str2);
                    }
                } else {
                    int length = m25469.length;
                    throw null;
                }
            }
        } catch (java.lang.Exception e2) {
            e2.getMessage();
        }
        try {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("\"\u0010\u0014\u001b\u0014\u0001ￗￏ\uffd8\u0014", android.text.TextUtils.getOffsetAfter("", 0) + 10, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 8, 234 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), true, objArr3);
            java.lang.String intern = ((java.lang.String) objArr3[0]).intern();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("\ufffe\u0006\u0000\ufffe\u0002\u0001", (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 6, (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1, 202 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), true, objArr4);
            sb.append(((java.lang.String) objArr4[0]).intern());
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("￩\u001c+\uffe7￪", 5 - android.text.TextUtils.getOffsetAfter("", 0), 3 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 225, true, objArr5);
            sb.append(((java.lang.String) objArr5[0]).intern().substring(1));
            sb.append(intern);
            java.lang.String obj = sb.toString();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            try {
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("\u000e\b\uffff\u0001\ufffb\uffc8\n\u000e\u000e\u0002", 11 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 11 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 254 - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue(), true, objArr6);
                sb2.append(java.lang.System.getProperty(((java.lang.String) objArr6[0]).intern()));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("\b\u0007￼\u0004\u0015-\u0007\ufff8\uffff￣ￔ", android.text.TextUtils.getTrimmedLength("") + 11, (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 10, 229 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), false, objArr7);
                sb2.append(((java.lang.String) objArr7[0]).intern());
                sb2.append(obj);
                java.lang.String obj2 = sb2.toString();
                util.h.xy.ck.ra raVar3 = util.h.xy.ck.ra.f1116;
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("\ufff6\u0015\u000f\u0006\b￢ￎ\u0013\u0006\u0014", android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 11, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, android.view.View.MeasureSpec.getMode(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, true, objArr8);
                raVar3.m25953(((java.lang.String) objArr8[0]).intern(), obj2);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        } catch (java.lang.Exception e3) {
            e3.getMessage();
        }
    }

    private static util.h.xy.bs.ma.EnumC0262ma Camera2StreamConfigurationMap(int i, util.h.xy.cj.mb mbVar) {
        util.h.xy.bs.ma.EnumC0262ma enumC0262ma;
        int i2 = getHighResolutionOutputSizeshNQ4ISI;
        int i3 = i2 + 75;
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (!getHighSpeedVideoFpsRangesFor && mbVar == null) {
            throw new java.lang.AssertionError();
        }
        getHighSpeedVideoFpsRanges = (i2 + 35) % 128;
        int m25938 = mbVar.m25938();
        new java.lang.Object[]{java.lang.Integer.valueOf(mbVar.m25938()), mbVar.m25937()};
        util.h.xy.bs.ma.EnumC0262ma enumC0262ma2 = util.h.xy.bs.ma.EnumC0262ma.getHighSpeedVideoFpsRanges;
        if (m25938 / 100 == 2) {
            int i4 = getHighResolutionOutputSizeshNQ4ISI + 15;
            getHighSpeedVideoFpsRanges = i4 % 128;
            if (i4 % 2 != 0) {
                util.h.xy.bs.ma.EnumC0262ma enumC0262ma3 = util.h.xy.bs.ma.EnumC0262ma.getHighSpeedVideoSizes;
                throw null;
            }
            enumC0262ma = util.h.xy.bs.ma.EnumC0262ma.getHighSpeedVideoSizes;
        } else if (m25938 == 500) {
            int i5 = getHighSpeedVideoFpsRanges + 113;
            getHighResolutionOutputSizeshNQ4ISI = i5 % 128;
            if (i5 % 2 == 0) {
                util.h.xy.bs.ma.EnumC0262ma enumC0262ma4 = util.h.xy.bs.ma.EnumC0262ma.Camera2StreamConfigurationMap;
                throw new java.lang.ArithmeticException();
            }
            enumC0262ma = util.h.xy.bs.ma.EnumC0262ma.Camera2StreamConfigurationMap;
        } else {
            enumC0262ma = util.h.xy.bs.ma.EnumC0262ma.getHighSpeedVideoFpsRanges;
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 55) % 128;
        }
        if (enumC0262ma == util.h.xy.bs.ma.EnumC0262ma.Camera2StreamConfigurationMap) {
            if (i >= util.h.xy.cb.a.m25846()) {
                return util.h.xy.bs.ma.EnumC0262ma.getHighSpeedVideoFpsRanges;
            }
            int i6 = getHighSpeedVideoFpsRanges + 101;
            getHighResolutionOutputSizeshNQ4ISI = i6 % 128;
            try {
                if (i6 % 2 == 0) {
                    java.lang.Thread.sleep(util.h.xy.cb.a.m25845());
                    throw new java.lang.NullPointerException();
                }
                java.lang.Thread.sleep(util.h.xy.cb.a.m25845());
            } catch (java.lang.InterruptedException unused) {
            }
        }
        return enumC0262ma;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static util.h.xy.bv.rb Camera2StreamConfigurationMap(boolean z, util.h.xy.cj.mb mbVar) {
        util.h.xy.bv.rb rbVar;
        util.h.xy.bv.rb.ra raVar;
        int i = getHighSpeedVideoFpsRanges;
        getHighResolutionOutputSizeshNQ4ISI = (i + 87) % 128;
        if (z) {
            getHighResolutionOutputSizeshNQ4ISI = (i + 63) % 128;
            if (mbVar == null) {
                rbVar = new util.h.xy.bv.rb(-1, util.h.xy.bv.rb.b.f1060);
                if (!z) {
                    raVar = util.h.xy.bv.rb.ra.f1062;
                    getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 77) % 128;
                } else {
                    raVar = util.h.xy.bv.rb.ra.f1061;
                }
                rbVar.m25744(raVar);
                return rbVar;
            }
        }
        util.h.xy.bv.rb rbVar2 = new util.h.xy.bv.rb(mbVar.m25938(), util.h.xy.bv.rb.b.f1060);
        rbVar2.m25748(mbVar.m25937());
        rbVar = rbVar2;
        if (!z) {
        }
        rbVar.m25744(raVar);
        return rbVar;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static byte[] m25619(byte[] bArr) throws util.h.xy.ck.rc {
        int i = getHighSpeedVideoFpsRanges + 89;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            util.h.xy.ar.b.m25074(bArr);
            return util.h.xy.ck.ra.f1116.m25949().mo25941(bArr);
        }
        util.h.xy.ar.b.m25074(bArr);
        util.h.xy.ck.ra.f1116.m25949().mo25941(bArr);
        throw new java.lang.ArithmeticException();
    }

    static void getHighSpeedVideoFpsRangesFor() {
        getHighSpeedVideoSizesFor = -1231763953;
    }
}
