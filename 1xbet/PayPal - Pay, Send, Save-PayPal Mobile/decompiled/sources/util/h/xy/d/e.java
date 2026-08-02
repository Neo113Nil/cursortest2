package util.h.xy.d;

/* loaded from: classes5.dex */
public class e implements com.gemalto.mfs.mwsdk.dcm.DigitalizedCardDetails {
    private static long Camera2StreamConfigurationMap = 0;
    private static long getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static char[] getHighSpeedVideoFpsRangesFor = null;
    private static int getHighSpeedVideoSizes = 0;
    private static int getHighSpeedVideoSizesFor = 1;
    private static int getInputSizeshNQ4ISI;
    private static final java.lang.String getOutputFormats;
    private final java.lang.String getInputFormats;
    private final java.lang.String getOutputMinFrameDuration;
    private final java.lang.String getOutputMinFrameDurationlomOqCM;
    private final java.lang.String getOutputSizes;
    private final java.lang.String getOutputSizeshNQ4ISI;
    private final java.lang.String getOutputStallDuration;
    private final java.lang.String getOutputStallDurationlomOqCM;
    private final java.lang.String getValidOutputFormatsForInputhNQ4ISI;
    private final java.lang.String isOutputSupportedForhNQ4ISI;
    private final util.h.xy.d.d toString;

    static {
        getHighResolutionOutputSizeshNQ4ISI();
        getOutputFormats = util.h.xy.d.e.class.getName();
        getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 65) % 128;
    }

    public e(util.h.xy.d.d dVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.toString = dVar;
        this.getOutputSizes = str;
        this.getValidOutputFormatsForInputhNQ4ISI = str2;
        long packedPositionForChild = android.widget.ExpandableListView.getPackedPositionForChild(0, 0);
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(13 - (packedPositionForChild > 0L ? 1 : (packedPositionForChild == 0L ? 0 : -1)), android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) ((((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) - 1), objArr);
            this.getOutputStallDuration = util.h.xy.u.d.m27506(str, ((java.lang.String) objArr[0]).intern());
            this.isOutputSupportedForhNQ4ISI = str3;
            this.getInputFormats = str4;
            this.getOutputMinFrameDurationlomOqCM = null;
            this.getOutputSizeshNQ4ISI = null;
            this.getOutputMinFrameDuration = null;
            this.getOutputStallDurationlomOqCM = null;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = getHighSpeedVideoFpsRanges + 69;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        char[] charArray = str.toCharArray();
        util.h.xz.b.a aVar = new util.h.xz.b.a();
        char[] m27721 = util.h.xz.b.a.m27721(getHighResolutionOutputSizeshNQ4ISI ^ 7817488252581312552L, charArray, i);
        aVar.f2623 = 4;
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 85) % 128;
        while (aVar.f2623 < m27721.length) {
            aVar.f2624 = aVar.f2623 - 4;
            m27721[aVar.f2623] = (char) ((m27721[aVar.f2623] ^ m27721[aVar.f2623 % 4]) ^ (aVar.f2624 * (getHighResolutionOutputSizeshNQ4ISI ^ 7817488252581312552L)));
            aVar.f2623++;
        }
        objArr[0] = new java.lang.String(m27721, 4, m27721.length - 4);
    }

    public e(util.h.xy.d.d dVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8) {
        this.toString = dVar;
        this.getOutputSizes = str;
        this.getValidOutputFormatsForInputhNQ4ISI = str2;
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(android.text.TextUtils.getOffsetAfter("", 0) + 14, android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, (char) (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 1), objArr);
            this.getOutputStallDuration = util.h.xy.u.d.m27506(str, ((java.lang.String) objArr[0]).intern());
            this.isOutputSupportedForhNQ4ISI = str3;
            this.getInputFormats = str4;
            this.getOutputMinFrameDurationlomOqCM = str5;
            this.getOutputSizeshNQ4ISI = str6;
            this.getOutputMinFrameDuration = str7;
            this.getOutputStallDurationlomOqCM = str8;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(int i, int i2, char c, java.lang.Object[] objArr) {
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 55) % 128;
            jArr[rbVar.f2651] = (((char) (getHighSpeedVideoFpsRangesFor[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ Camera2StreamConfigurationMap))) ^ c;
            rbVar.f2651++;
        }
        char[] cArr = new char[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
            rbVar.f2651++;
        }
        java.lang.String str = new java.lang.String(cArr);
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 125) % 128;
        objArr[0] = str;
    }

    @Override // com.gemalto.mfs.mwsdk.dcm.DigitalizedCardDetails
    public boolean isPaymentTypeSupported(com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType) {
        int resolveOpacity;
        int lastIndexOf;
        int i;
        int i2 = getInputSizeshNQ4ISI + 53;
        getHighSpeedVideoSizesFor = i2 % 128;
        if (i2 % 2 == 0) {
            resolveOpacity = 5 - android.graphics.drawable.Drawable.resolveOpacity(0, 1);
            lastIndexOf = 90 >> android.text.TextUtils.lastIndexOf("", '\'');
            i = 19762;
        } else {
            resolveOpacity = 4 - android.graphics.drawable.Drawable.resolveOpacity(0, 0);
            lastIndexOf = 13 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
            i = 23253;
        }
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(resolveOpacity, lastIndexOf, (char) (i - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22)), objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("\ue571\ue535\ue0e7戞蕳◺\uf027\ue8e6･픠䢂냦쿒", (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1, objArr2);
            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
            boolean highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(paymentType);
            int i3 = getInputSizeshNQ4ISI + 21;
            getHighSpeedVideoSizesFor = i3 % 128;
            if (i3 % 2 != 0) {
                return highSpeedVideoFpsRangesFor;
            }
            throw new java.lang.ArithmeticException();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private boolean getHighSpeedVideoFpsRangesFor(com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType) {
        com.gemalto.mfs.mwsdk.dcm.PaymentType[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
        int length = highSpeedVideoFpsRanges.length;
        int i = 0;
        boolean z = false;
        while (i < length) {
            if (paymentType == highSpeedVideoFpsRanges[i]) {
                getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 83) % 128;
                z = true;
            }
            i++;
            getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 77) % 128;
        }
        return z;
    }

    @Override // com.gemalto.mfs.mwsdk.dcm.DigitalizedCardDetails
    public java.lang.String getTokenizedCardID() {
        getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 33) % 128;
        int resolveSizeAndState = android.view.View.resolveSizeAndState(0, 0, 0);
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(4 - resolveSizeAndState, 14 - android.text.TextUtils.indexOf("", ""), (char) (23254 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("ꜮꝪ㜖┋倇\uf20b뉸꿳⢚Tྒྷ斅趗ȁ", android.graphics.Color.alpha(0), objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        java.lang.String m26180 = this.toString.m26180();
        getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 53) % 128;
        return m26180;
    }

    @Override // com.gemalto.mfs.mwsdk.dcm.DigitalizedCardDetails
    public java.lang.String getProductID() {
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(android.graphics.Color.alpha(0) + 4, (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 14, (char) (23252 - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue()), objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(9 - android.graphics.Color.blue(0), 17 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (android.view.View.resolveSize(0, 0) + 4795), objArr2);
            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
            java.lang.String str = this.getOutputStallDuration;
            int defaultSize = android.view.View.getDefaultSize(0, 0);
            int packedPositionGroup = android.widget.ExpandableListView.getPackedPositionGroup(0L);
            getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 21) % 128;
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(defaultSize + 9, 27 - packedPositionGroup, (char) (58449 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6)), objArr3);
            java.lang.String m27506 = util.h.xy.u.d.m27506(str, ((java.lang.String) objArr3[0]).intern());
            if (m27506 != null) {
                getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 27) % 128;
                if (m27506.length() > 0) {
                    return m27506;
                }
            }
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("\u09c9জȍ皻㟙윝\u1cfeﱌᶜ枍尶", android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1, objArr4);
            return ((java.lang.String) objArr4[0]).intern();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    @Override // com.gemalto.mfs.mwsdk.dcm.DigitalizedCardDetails
    public java.lang.String getLastFourDigits() {
        getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 71) % 128;
        float complexToFraction = android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f);
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(4 - (complexToFraction > 0.0f ? 1 : (complexToFraction == 0.0f ? 0 : -1)), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 15, (char) (23253 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        char mirror = android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI('9' - mirror, android.text.TextUtils.indexOf("", "", 0) + 36, (char) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 54875), objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        java.lang.String str = this.getOutputStallDuration;
        if (str != null) {
            int i = getInputSizeshNQ4ISI + 49;
            getHighSpeedVideoSizesFor = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
            if (!str.isEmpty()) {
                java.lang.String str2 = this.getOutputStallDuration;
                int capsMode = android.text.TextUtils.getCapsMode("", 0, 0);
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(capsMode + 14, (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 44, (char) ((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 63855), objArr3);
                java.lang.String m27506 = util.h.xy.u.d.m27506(str2, ((java.lang.String) objArr3[0]).intern());
                int i2 = getHighSpeedVideoSizesFor + 51;
                getInputSizeshNQ4ISI = i2 % 128;
                if (i2 % 2 == 0) {
                    return m27506;
                }
                throw new java.lang.ArithmeticException();
            }
        }
        return null;
    }

    @Override // com.gemalto.mfs.mwsdk.dcm.DigitalizedCardDetails
    public java.lang.String getPanExpiry() {
        getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 11) % 128;
        int scrollBarFadeDuration = android.view.ViewConfiguration.getScrollBarFadeDuration();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI((scrollBarFadeDuration >> 16) + 4, (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 13, (char) (23253 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("꿪꾮ᇞ\uf5e9겺퓃몼缑๒ﳩ\udf75餾", android.graphics.Color.blue(0), objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        java.lang.String str = this.getOutputStallDuration;
        int size = android.view.View.MeasureSpec.getSize(0);
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(size + 9, 59 - android.graphics.Color.alpha(0), (char) (android.graphics.Color.green(0) + 9340), objArr3);
        java.lang.String m27506 = util.h.xy.u.d.m27506(str, ((java.lang.String) objArr3[0]).intern());
        getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 119) % 128;
        return m27506;
    }

    @Override // com.gemalto.mfs.mwsdk.dcm.DigitalizedCardDetails
    public java.lang.String getLastFourDigitsOfDPAN() {
        int combineMeasuredStates = android.view.View.combineMeasuredStates(0, 0);
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(combineMeasuredStates + 4, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 14, (char) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 23253), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        int indexOf = android.text.TextUtils.indexOf("", "", 0, 0);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(11 - indexOf, android.view.View.MeasureSpec.getSize(0) + 68, (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        java.lang.String m27520 = util.h.xy.u.d.m27520(getScheme(), this.getValidOutputFormatsForInputhNQ4ISI, this.getInputFormats, this.isOutputSupportedForhNQ4ISI);
        if (m27520 != null) {
            getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 41) % 128;
            if (!m27520.isEmpty()) {
                if (m27520.length() <= 4) {
                    return m27520;
                }
                java.lang.String substring = m27520.substring(m27520.length() - 4, m27520.length());
                int i = getHighSpeedVideoSizesFor + 81;
                getInputSizeshNQ4ISI = i % 128;
                if (i % 2 == 0) {
                    return substring;
                }
                throw null;
            }
        }
        int i2 = getHighSpeedVideoSizesFor + 11;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            return "";
        }
        throw null;
    }

    @Override // com.gemalto.mfs.mwsdk.dcm.DigitalizedCardDetails
    public java.lang.String getScheme() {
        java.lang.String intern;
        int i;
        int i2 = getHighSpeedVideoSizesFor + 49;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(2 << (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(1) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(1) == 0.0d ? 0 : -1)), 73 >>> android.view.View.MeasureSpec.makeMeasureSpec(0, 1), (char) ((android.view.ViewConfiguration.getScrollBarFadeDuration() << 102) + 19475), objArr);
            intern = ((java.lang.String) objArr[0]).intern();
            i = 109;
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(4 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 14 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) ((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 23253), objArr2);
            intern = ((java.lang.String) objArr2[0]).intern();
            i = 7;
        }
        getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 11) % 128;
        try {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(i + ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), android.text.TextUtils.getOffsetAfter("", 0) + 79, (char) ((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 46877), objArr3);
            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr3[0]).intern());
            java.lang.String str = this.getOutputSizes;
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("凃冰\ue98f鰇꣯Ⲳ䓖ᛓ\uf601\uf890", android.view.ViewConfiguration.getKeyRepeatDelay() >> 16, objArr4);
            java.lang.String m27506 = util.h.xy.u.d.m27506(str, ((java.lang.String) objArr4[0]).intern());
            int i3 = getInputSizeshNQ4ISI + 37;
            getHighSpeedVideoSizesFor = i3 % 128;
            if (i3 % 2 != 0) {
                return m27506;
            }
            throw null;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    @Override // com.gemalto.mfs.mwsdk.dcm.DigitalizedCardDetails
    public java.lang.String getAuxiliaryScheme() {
        getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 41) % 128;
        int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(lastIndexOf + 5, 13 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 23254), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("䉔䈐䰩\ue4ec䯎褴圂渔厥ᮝ칡繜", 1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        if (this.toString.m26179() == null) {
            return null;
        }
        java.lang.String str = this.getOutputMinFrameDurationlomOqCM;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("凃冰\ue98f鰇꣯Ⲳ䓖ᛓ\uf601\uf890", android.view.KeyEvent.getDeadChar(0, 0), objArr3);
        java.lang.String m27506 = util.h.xy.u.d.m27506(str, ((java.lang.String) objArr3[0]).intern());
        int i = getInputSizeshNQ4ISI + 113;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 != 0) {
            return m27506;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.gemalto.mfs.mwsdk.dcm.DigitalizedCardDetails
    public java.lang.String getAuxiliaryLastFourDigitsOfDPAN() {
        int green = android.graphics.Color.green(0);
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(4 - green, (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 14, (char) (23253 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16)), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        int axisFromString = android.view.MotionEvent.axisFromString("");
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(11 - axisFromString, 87 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (1703 - (android.view.ViewConfiguration.getTapTimeout() >> 16)), objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        if (this.toString.m26179() != null && !this.toString.m26179().isEmpty()) {
            getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 27) % 128;
            java.lang.String m27520 = util.h.xy.u.d.m27520(getAuxiliaryScheme(), this.getOutputSizeshNQ4ISI, this.getOutputStallDurationlomOqCM, this.getOutputMinFrameDuration);
            if (m27520 != null && !m27520.isEmpty()) {
                int i = getHighSpeedVideoSizesFor + 65;
                getInputSizeshNQ4ISI = i % 128;
                if (i % 2 != 0) {
                    if (m27520.length() <= 3) {
                        return m27520;
                    }
                } else if (m27520.length() <= 4) {
                    return m27520;
                }
                return m27520.substring(m27520.length() - 4, m27520.length());
            }
        }
        return "";
    }

    @Override // com.gemalto.mfs.mwsdk.dcm.DigitalizedCardDetails
    public int getCVMResetTimeout() {
        getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 45) % 128;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(5 - (elapsedRealtime > 0L ? 1 : (elapsedRealtime == 0L ? 0 : -1)), 14 - android.view.View.getDefaultSize(0, 0), (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 23254), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("⡦⠢ᴴ缆展\ud829㴰\uf5feʸఆ喉槂˛⠵䀆", android.graphics.Color.rgb(0, 0, 0) + 16777216, objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        int Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(this.getOutputSizes);
        int i = getHighSpeedVideoSizesFor + 121;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            return Camera2StreamConfigurationMap2;
        }
        throw null;
    }

    @Override // com.gemalto.mfs.mwsdk.dcm.DigitalizedCardDetails
    public int getDualTapResetTimeout() {
        int capsMode = android.text.TextUtils.getCapsMode("", 0, 0);
        int deadChar = android.view.KeyEvent.getDeadChar(0, 0);
        int i = getInputSizeshNQ4ISI;
        getHighSpeedVideoSizesFor = (i + 109) % 128;
        getHighSpeedVideoSizesFor = (i + 55) % 128;
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(4 - capsMode, deadChar + 14, (char) (((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 23253), objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 10, 97 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), objArr2);
            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
            return getHighSpeedVideoFpsRanges(this.getOutputSizes);
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    @Override // com.gemalto.mfs.mwsdk.dcm.DigitalizedCardDetails
    public java.lang.String getValue(java.lang.String str) {
        int i = getInputSizeshNQ4ISI;
        getHighSpeedVideoSizesFor = (i + 61) % 128;
        getHighSpeedVideoSizesFor = (i + 93) % 128;
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(3 - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue(), (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22) + 14, (char) (23253 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16)), objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(8 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), android.text.TextUtils.indexOf("", "", 0) + 108, (char) (1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr2);
            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
            return util.h.xy.u.d.m27506(this.getOutputSizes, str);
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    @Override // com.gemalto.mfs.mwsdk.dcm.DigitalizedCardDetails
    public com.gemalto.mfs.mwsdk.dcm.PaymentType[] paymentTypeSupported() {
        getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 71) % 128;
        int rgb = android.graphics.Color.rgb(0, 0, 0);
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(rgb + 16777220, 14 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) (23253 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("觡覥ꔮ닣쑔怳鲷㠛몵鐇须\uf1c6", (-16777216) - android.graphics.Color.rgb(0, 0, 0), objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        com.gemalto.mfs.mwsdk.dcm.PaymentType[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
        int i = getInputSizeshNQ4ISI + 69;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 != 0) {
            return highSpeedVideoFpsRanges;
        }
        throw null;
    }

    @Override // com.gemalto.mfs.mwsdk.dcm.DigitalizedCardDetails
    public java.util.List<java.lang.String> getQrAIDs() {
        getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 3) % 128;
        byte modifierMetaStateMask = (byte) android.view.KeyEvent.getModifierMetaStateMask();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(3 - modifierMetaStateMask, 14 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 23253), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        int minimumFlingVelocity = android.view.ViewConfiguration.getMinimumFlingVelocity();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(8 - (minimumFlingVelocity >> 16), 115 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        java.util.List<java.lang.String> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
        getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 45) % 128;
        return highSpeedVideoFpsRangesFor;
    }

    @Override // com.gemalto.mfs.mwsdk.dcm.DigitalizedCardDetails
    public boolean isVisaODASupported() {
        int i = getInputSizeshNQ4ISI;
        getHighSpeedVideoSizesFor = (i + 103) % 128;
        getHighSpeedVideoSizesFor = (i + 39) % 128;
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 4, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 14, (char) (23253 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)), objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("\uf5b4\uf5f0\ud8d8证报᷅\ue0e2Ĺ읚㋶ꅛ圫\udf17", (-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr2);
            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
            return Camera2StreamConfigurationMap();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    @Override // com.gemalto.mfs.mwsdk.dcm.DigitalizedCardDetails
    public boolean isVisaODACertificateExpired() {
        getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 35) % 128;
        int offsetAfter = android.text.TextUtils.getOffsetAfter("", 0);
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(offsetAfter + 4, 14 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (23252 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("诰讴ᗒ粺洼탏麦\uf642\u0a50㵯嘠墲ꅃ\u20c4", (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1, objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        boolean highSpeedVideoSizes = getHighSpeedVideoSizes();
        getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 39) % 128;
        return highSpeedVideoSizes;
    }

    private boolean getHighSpeedVideoSizes() {
        try {
            if (!Camera2StreamConfigurationMap()) {
                getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 121) % 128;
                return false;
            }
            java.lang.String str = this.getOutputStallDuration;
            if (str != null && !"".equalsIgnoreCase(str)) {
                getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 107) % 128;
                java.lang.String m27506 = util.h.xy.u.d.m27506(this.getOutputStallDuration, util.h.xy.s.rh.f2416);
                if (m27506 != null && !"".equalsIgnoreCase(m27506)) {
                    getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 75) % 128;
                    if (util.h.xy.ar.b.m25085(m27506) - util.h.xy.ar.b.m25085(util.h.xy.ar.b.m25092()) <= com.visa.cbp.getVdtContainer.setTvls) {
                        getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 85) % 128;
                        return true;
                    }
                }
            }
            return false;
        } catch (java.text.ParseException e) {
            e.getMessage();
            return false;
        }
    }

    private boolean Camera2StreamConfigurationMap() {
        java.lang.String str;
        boolean z;
        getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 109) % 128;
        java.lang.String str2 = this.getOutputSizes;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("凃冰\ue98f鰇꣯Ⲳ䓖ᛓ\uf601\uf890", (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
        java.lang.String m27506 = util.h.xy.u.d.m27506(str2, ((java.lang.String) objArr[0]).intern());
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(4 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), android.graphics.Color.blue(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, (char) android.graphics.Color.green(0), objArr2);
        if (!((java.lang.String) objArr2[0]).intern().equalsIgnoreCase(m27506)) {
            return false;
        }
        java.lang.String m275062 = util.h.xy.u.d.m27506(this.getValidOutputFormatsForInputhNQ4ISI, util.h.xy.s.ma.f2350);
        java.lang.String m275063 = util.h.xy.u.d.m27506(this.getValidOutputFormatsForInputhNQ4ISI, util.h.xy.s.ma.f2349);
        java.lang.String m275064 = util.h.xy.u.d.m27506(m275062, util.h.xy.s.rh.f2414);
        if (m275063 == null || "".equalsIgnoreCase(m275063)) {
            str = null;
        } else {
            getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 33) % 128;
            str = util.h.xy.u.d.m27506(m275063, util.h.xy.s.rh.f2414);
        }
        boolean z2 = m275064 != null && util.h.xy.ar.b.m25083(util.h.xy.ar.b.m25076(m275064)[1], 5) == 0;
        if (str != null) {
            int i = getInputSizeshNQ4ISI + 105;
            getHighSpeedVideoSizesFor = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
            if (!"".equalsIgnoreCase(str) && util.h.xy.ar.b.m25083(util.h.xy.ar.b.m25076(str)[1], 5) == 0) {
                getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 121) % 128;
                z = true;
                return !z2 || z;
            }
        }
        z = false;
        if (z2) {
        }
    }

    private java.util.List<java.lang.String> getHighSpeedVideoFpsRangesFor() {
        java.lang.String optString;
        java.lang.String optString2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (getHighSpeedVideoFpsRangesFor(com.gemalto.mfs.mwsdk.dcm.PaymentType.QR)) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(this.isOutputSupportedForhNQ4ISI);
                java.lang.String optString3 = jSONObject.optString(util.h.xy.s.ma.f2350, null);
                if (optString3 != null) {
                    int i = getHighSpeedVideoSizesFor + 27;
                    getInputSizeshNQ4ISI = i % 128;
                    if (i % 2 != 0) {
                        throw null;
                    }
                    if (!"".equalsIgnoreCase(optString3) && (optString2 = new org.json.JSONObject(optString3).optString(util.h.xy.s.ma.f2360, null)) != null) {
                        getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 111) % 128;
                        if (!"".equalsIgnoreCase(optString2)) {
                            getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 93) % 128;
                            arrayList.add(optString2);
                        }
                    }
                }
                java.lang.String optString4 = jSONObject.optString(util.h.xy.s.ma.f2349, null);
                if (optString4 != null) {
                    int i2 = getHighSpeedVideoSizesFor + 55;
                    getInputSizeshNQ4ISI = i2 % 128;
                    if (i2 % 2 != 0) {
                        throw null;
                    }
                    if (!"".equalsIgnoreCase(optString4) && (optString = new org.json.JSONObject(optString4).optString(util.h.xy.s.ma.f2360, null)) != null) {
                        int i3 = getHighSpeedVideoSizesFor + 101;
                        getInputSizeshNQ4ISI = i3 % 128;
                        if (i3 % 2 != 0) {
                            throw new java.lang.ArithmeticException();
                        }
                        if (!"".equalsIgnoreCase(optString)) {
                            getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 23) % 128;
                            arrayList.add(optString);
                        }
                    }
                }
                getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 95) % 128;
                return arrayList;
            } catch (org.json.JSONException e) {
                e.getMessage();
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int Camera2StreamConfigurationMap(java.lang.String str) {
        int i;
        com.gemalto.mfs.mwsdk.payment.CHVerificationMethod m26900 = util.h.xy.j.ma.f2241.m26900();
        int m25005 = util.h.xy.al.d.m25005();
        int i2 = 30;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            int scrollBarFadeDuration = android.view.ViewConfiguration.getScrollBarFadeDuration();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI((scrollBarFadeDuration >> 16) + 15, 127 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr);
            if (jSONObject.has(((java.lang.String) objArr[0]).intern())) {
                getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 21) % 128;
                int indexOf = android.text.TextUtils.indexOf("", "", 0);
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(indexOf + 15, 127 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) android.text.TextUtils.getOffsetAfter("", 0), objArr2);
                java.lang.String string = jSONObject.getString(((java.lang.String) objArr2[0]).intern());
                if (!android.text.TextUtils.isEmpty(string)) {
                    int parseInt = java.lang.Integer.parseInt(string);
                    int i3 = getInputSizeshNQ4ISI + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                    getHighSpeedVideoSizesFor = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = 4 / 4;
                    }
                    i2 = parseInt;
                }
            }
        } catch (java.lang.Exception unused) {
        }
        if (m26900 != com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.WALLET_PIN && m25005 != 0) {
            int i5 = getInputSizeshNQ4ISI + 19;
            getHighSpeedVideoSizesFor = i5 % 128;
            if (i5 % 2 == 0) {
                try {
                    throw new java.lang.NullPointerException();
                } catch (java.lang.Exception unused2) {
                }
            }
            i = getInputSizeshNQ4ISI + 91;
            getHighSpeedVideoSizesFor = i % 128;
            if (i % 2 == 0) {
                return m25005;
            }
            throw null;
        }
        m25005 = i2;
        i = getInputSizeshNQ4ISI + 91;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 == 0) {
        }
    }

    private int getHighSpeedVideoFpsRanges(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String m27074 = util.h.xy.s.b.m27074(str);
            java.lang.String scheme = getScheme();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("㢘㣕瘉齡\ud848댖ⶥᖎ榒蠆뗹\uedd5ሺ䌜", (-16777216) - android.graphics.Color.rgb(0, 0, 0), objArr);
            if (scheme.equalsIgnoreCase(((java.lang.String) objArr[0]).intern())) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 3, (android.view.ViewConfiguration.getTouchSlop() >> 8) + 142, (char) (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr2);
                if (m27074.equalsIgnoreCase(((java.lang.String) objArr2[0]).intern())) {
                    int i = getHighSpeedVideoSizesFor + 81;
                    getInputSizeshNQ4ISI = i % 128;
                    return i % 2 != 0 ? 99 : 30;
                }
            }
            getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 13) % 128;
            try {
                int intValue = ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue();
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI((intValue >> 22) + 19, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 146, (char) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), objArr3);
                if (!jSONObject.has(((java.lang.String) objArr3[0]).intern())) {
                    return 0;
                }
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 19, 144 - android.view.MotionEvent.axisFromString(""), (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr4);
                java.lang.String string = jSONObject.getString(((java.lang.String) objArr4[0]).intern());
                if (android.text.TextUtils.isEmpty(string)) {
                    return 0;
                }
                return java.lang.Integer.parseInt(string);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }

    private com.gemalto.mfs.mwsdk.dcm.PaymentType[] getHighSpeedVideoFpsRanges() {
        try {
            com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel m27287 = util.h.xy.s.rb.m27287(this.getOutputSizes);
            if (m27287 != com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS) {
                if (m27287 != com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.QR) {
                    if (m27287 == com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.DSRP) {
                        return new com.gemalto.mfs.mwsdk.dcm.PaymentType[]{com.gemalto.mfs.mwsdk.dcm.PaymentType.DSRP};
                    }
                    if (m27287 == com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS_AND_QR) {
                        getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 103) % 128;
                        return new com.gemalto.mfs.mwsdk.dcm.PaymentType[]{com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS, com.gemalto.mfs.mwsdk.dcm.PaymentType.QR};
                    }
                    if (m27287 == com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS_AND_DSRP) {
                        com.gemalto.mfs.mwsdk.dcm.PaymentType[] paymentTypeArr = {com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS, com.gemalto.mfs.mwsdk.dcm.PaymentType.DSRP};
                        getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 45) % 128;
                        return paymentTypeArr;
                    }
                    if (m27287 == com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS_AND_DSRP_AND_QR) {
                        return new com.gemalto.mfs.mwsdk.dcm.PaymentType[]{com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS, com.gemalto.mfs.mwsdk.dcm.PaymentType.DSRP, com.gemalto.mfs.mwsdk.dcm.PaymentType.QR};
                    }
                    com.gemalto.mfs.mwsdk.dcm.PaymentType[] paymentTypeArr2 = new com.gemalto.mfs.mwsdk.dcm.PaymentType[0];
                    int i = getInputSizeshNQ4ISI + 89;
                    getHighSpeedVideoSizesFor = i % 128;
                    if (i % 2 == 0) {
                        int i2 = 2 / 3;
                    }
                    return paymentTypeArr2;
                }
                int i3 = getInputSizeshNQ4ISI + 3;
                getHighSpeedVideoSizesFor = i3 % 128;
                return i3 % 2 == 0 ? new com.gemalto.mfs.mwsdk.dcm.PaymentType[]{com.gemalto.mfs.mwsdk.dcm.PaymentType.QR} : new com.gemalto.mfs.mwsdk.dcm.PaymentType[]{com.gemalto.mfs.mwsdk.dcm.PaymentType.QR};
            }
            int i4 = getInputSizeshNQ4ISI + 19;
            getHighSpeedVideoSizesFor = i4 % 128;
            if (i4 % 2 != 0) {
                return new com.gemalto.mfs.mwsdk.dcm.PaymentType[]{com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS};
            }
            com.gemalto.mfs.mwsdk.dcm.PaymentType[] paymentTypeArr3 = new com.gemalto.mfs.mwsdk.dcm.PaymentType[1];
            paymentTypeArr3[1] = com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS;
            return paymentTypeArr3;
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
            e.printStackTrace();
            return new com.gemalto.mfs.mwsdk.dcm.PaymentType[0];
        } catch (org.json.JSONException unused) {
            return new com.gemalto.mfs.mwsdk.dcm.PaymentType[0];
        }
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        getHighSpeedVideoFpsRangesFor = new char[]{40032, 4276, 34247, 14875, 44849, 23677, 53384, 17880, 64232, 28468, 7279, 37019, 1465, 47869, 50840, 19029, 57151, 24820, 36606, 552, 38748, 10368, 48592, 20200, 49676, 22340, 59510, 30752, 62707, 24989, 56903, 19297, 47142, 13506, 41358, 7868, 18974, 50888, 21436, 60512, 31024, 35336, 1776, 37803, 11414, 25886, 59870, 31906, 50033, 22091, 42248, 10748, 48365, 898, 38494, 58659, 27132, 64726, 17280, 47117, 13517, 41393, 7755, 35649, 30744, 62706, 25016, 56972, 40005, 4243, 34279, 14907, 44907, 23635, 53419, 17904, 64205, 28439, 7291, 11096, 42894, 13050, 36134, 6262, 60238, 26537, 39650, 5684, 33600, 15516, 43468, 23284, 54785, 17245, 64616, 27067, 6851, 38413, 40005, 4243, 34279, 14907, 44907, 23635, 53411, 17890, 64219, 28428, 40005, 4243, 34279, 14907, 44907, 23635, 53425, 40005, 4243, 34279, 14907, 44907, 23635, 53430, 17911, 40023, 4281, 34256, 14867, 40034, 4262, 34254, 14880, 44832, 23655, 53378, 17858, 64221, 28465, 7238, 37023, 1442, 47849, 12059, 39987, 4350, 34195, 40037, 4261, 34242, 14878, 44817, 23669, 53399, 17892, 64236, 28459, 7246, 37006, 1433, 47861, 12034, 56411, 20862, 50581, 31431};
        Camera2StreamConfigurationMap = -6345289531345268528L;
        getHighResolutionOutputSizeshNQ4ISI = 2143159949676461430L;
    }
}
