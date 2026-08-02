package com.payair.hce;

/* loaded from: classes4.dex */
public final class removeStickyBroadcast {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    public static java.lang.String AlternateContactlessPaymentDataJson;
    public static java.lang.String DigitizedCardProfile;
    public static java.lang.String IccPrivateKeyCrtComponentsJson;
    public static java.lang.String RecordsJson;
    public static java.lang.String SdkCoreAlternateContactlessPaymentDataImpl;
    public static java.lang.String getAid;
    private static long getCiacDecline;
    private static int getCvrMaskAnd;
    private static int getGpoResponse;
    private static char[] getProfileVersion;
    public static java.lang.String valueOf;
    public static java.lang.String values;
    public static java.lang.String writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, byte b2, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = (b * 4) + 1;
        int i5 = 99 - (i * 2);
        byte[] bArr = $$a;
        int i6 = (b2 * 2) + 4;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i7 = i4;
            int i8 = i6;
            i3 = 0;
            int i9 = (-i6) + i7;
            int i10 = i8 + 1;
            i2 = i3;
            i5 = i9;
            i6 = i10;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i11 = i5;
            i8 = i6;
            i6 = bArr[i6];
            i7 = i11;
            int i92 = (-i6) + i7;
            int i102 = i8 + 1;
            i2 = i3;
            i5 = i92;
            i6 = i102;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
            }
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getCvrMaskAnd = 0;
        getGpoResponse = 1;
        values();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(android.text.TextUtils.getTrimmedLength(""), (char) android.view.View.MeasureSpec.getMode(0), android.text.TextUtils.indexOf("", "", 0, 0) + 9, objArr);
        AlternateContactlessPaymentDataJson = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 9, (char) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 19967), 24 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), objArr2);
        DigitizedCardProfile = ((java.lang.String) objArr2[0]).intern();
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1, (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), 9 - android.graphics.Color.red(0), objArr3);
        valueOf = ((java.lang.String) objArr3[0]).intern();
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a(33 - android.graphics.Color.green(0), (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 27483), 14 - android.view.View.combineMeasuredStates(0, 0), objArr4);
        writeReplace = ((java.lang.String) objArr4[0]).intern();
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        a(android.graphics.Color.green(0) + 47, (char) ((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 20674), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 9, objArr5);
        values = ((java.lang.String) objArr5[0]).intern();
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        a(android.text.TextUtils.getOffsetBefore("", 0) + 56, (char) (android.text.TextUtils.indexOf("", "", 0, 0) + 33475), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 15, objArr6);
        getAid = ((java.lang.String) objArr6[0]).intern();
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        a(android.os.Process.getGidForName("") + 72, (char) (android.os.Process.myPid() >> 22), android.widget.ExpandableListView.getPackedPositionChild(0L) + 7, objArr7);
        RecordsJson = ((java.lang.String) objArr7[0]).intern();
        java.lang.Object[] objArr8 = new java.lang.Object[1];
        a((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 76, (char) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 53102), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 12, objArr8);
        SdkCoreAlternateContactlessPaymentDataImpl = ((java.lang.String) objArr8[0]).intern();
        java.lang.Object[] objArr9 = new java.lang.Object[1];
        a(90 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 39075), android.view.View.resolveSize(0, 0) + 6, objArr9);
        IccPrivateKeyCrtComponentsJson = ((java.lang.String) objArr9[0]).intern();
        int i = getCvrMaskAnd + 69;
        getGpoResponse = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static void a(int i, char c, int i2, java.lang.Object[] objArr) {
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i2];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i2) {
            int i3 = $11 + 19;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = getcvmmodel.valueOf;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(getProfileVersion[i << getcvmmodel.valueOf])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - android.view.MotionEvent.axisFromString(""), 381 - android.view.KeyEvent.keyCodeFromString(""), (char) (62388 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b((byte) 0, (byte) 0, 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                    }
                    java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(getCiacDecline), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                    if (obj2 == null) {
                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getMode(0) + 35, 3966 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) ((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 40223))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                    }
                    jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                    java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.green(0) + 34, 212 - android.view.KeyEvent.getDeadChar(0, 0), (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj3);
                    }
                    ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = getcvmmodel.valueOf;
                java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(getProfileVersion[i + getcvmmodel.valueOf])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                if (obj4 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 48, 381 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (android.text.TextUtils.getOffsetBefore("", 0) + 62388));
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    b((byte) 0, (byte) 0, 0, objArr7);
                    obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj4);
                }
                java.lang.Object[] objArr8 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr6)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(getCiacDecline), java.lang.Integer.valueOf(c)};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj5 == null) {
                    obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - android.view.KeyEvent.keyCodeFromString(""), 3965 - android.view.MotionEvent.axisFromString(""), (char) (40224 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj5);
                }
                jArr[i5] = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr8)).longValue();
                java.lang.Object[] objArr9 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj6 == null) {
                    obj6 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), 212 - android.graphics.Color.argb(0, 0, 0, 0), (char) android.widget.ExpandableListView.getPackedPositionType(0L))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj6);
                }
                ((java.lang.reflect.Method) obj6).invoke(null, objArr9);
            }
        }
        char[] cArr = new char[i2];
        getcvmmodel.valueOf = 0;
        $10 = ($11 + 61) % 128;
        while (getcvmmodel.valueOf < i2) {
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr10 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj7 == null) {
                obj7 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - android.graphics.Color.argb(0, 0, 0, 0), android.view.View.resolveSize(0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) android.graphics.Color.alpha(0))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj7);
            }
            ((java.lang.reflect.Method) obj7).invoke(null, objArr10);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    static void init$0() {
        $$a = new byte[]{68, 10, 35, com.visa.cbp.getEncExpo.addOnTrimMemoryListener};
        $$b = 197;
    }

    static void values() {
        getProfileVersion = new char[]{24287, 26724, 13234, 64242, 33826, 20289, 5776, 8655, 60169, 4926, 9606, 32342, 46866, 51666, 692, 23382, 27693, 42743, 65447, 12291, 19152, 33685, 54362, 60704, 10222, 30894, 45438, 51712, 7310, 21847, 28168, 41178, 63931, 13697, 815, 22768, 37293, 61298, 9245, 32209, 19119, 32862, 55553, 5818, 27753, 42288, 62200, 3615, 14513, 25455, 43562, 54508, 8094, 18002, 28945, 48077, 56335, 60093, 45439, 30761, 1775, 52628, 38007, 41740, 27078, 12420, 65338, 34298, 19600, 7008, 8732, 24267, 26739, 13233, 64225, 33855, 20311, 37286, 42781, 64711, 13758, 19268, 32815, 55804, 61085, 9341, 32033, 45711, 51271, 286, 50788, 61648, 43807, 25163, 7324, 55289};
        getCiacDecline = -9167322245188392938L;
    }
}
