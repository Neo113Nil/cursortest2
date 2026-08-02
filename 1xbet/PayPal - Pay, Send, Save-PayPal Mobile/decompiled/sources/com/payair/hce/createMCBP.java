package com.payair.hce;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'AlternateContactlessPaymentDataJson' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes4.dex */
public final class createMCBP {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    public static final com.payair.hce.createMCBP AlternateContactlessPaymentDataJson;
    public static final com.payair.hce.createMCBP DigitizedCardProfile;
    private static int IccPrivateKeyCrtComponentsJson;
    private static final /* synthetic */ com.payair.hce.createMCBP[] RecordsJson;
    private static char[] SdkCoreAlternateContactlessPaymentDataImpl;
    private static int getAid;
    private static long getProfileVersion;
    public static final com.payair.hce.createMCBP valueOf;
    public static final com.payair.hce.createMCBP values;
    public static final com.payair.hce.createMCBP writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, byte b, short s2, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3 = b + 4;
        int i4 = 1 - (s2 * 3);
        byte[] bArr = $$a;
        int i5 = (s * 2) + 99;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i6 = i3;
            int i7 = i4;
            int i8 = 0;
            i5 = (-i5) + i7;
            i3 = i6;
            i = i8;
            bArr2[i] = (byte) i5;
            i2 = i + 1;
            int i9 = i3 + 1;
            if (i2 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            byte b2 = bArr[i9];
            i7 = i5;
            i5 = b2;
            i8 = i2;
            i6 = i9;
            i5 = (-i5) + i7;
            i3 = i6;
            i = i8;
            bArr2[i] = (byte) i5;
            i2 = i + 1;
            int i92 = i3 + 1;
            if (i2 == i4) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i5;
            i2 = i + 1;
            int i922 = i3 + 1;
            if (i2 == i4) {
            }
        }
    }

    private createMCBP(java.lang.String str, int i) {
    }

    public static com.payair.hce.createMCBP valueOf(java.lang.String str) {
        IccPrivateKeyCrtComponentsJson = (getAid + 1) % 128;
        com.payair.hce.createMCBP createmcbp = (com.payair.hce.createMCBP) java.lang.Enum.valueOf(com.payair.hce.createMCBP.class, str);
        IccPrivateKeyCrtComponentsJson = (getAid + 5) % 128;
        return createmcbp;
    }

    public static com.payair.hce.createMCBP[] values() {
        int i = IccPrivateKeyCrtComponentsJson + 41;
        getAid = i % 128;
        com.payair.hce.createMCBP[] createmcbpArr = RecordsJson;
        if (i % 2 != 0) {
            return (com.payair.hce.createMCBP[]) createmcbpArr.clone();
        }
        throw new java.lang.ArithmeticException();
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        IccPrivateKeyCrtComponentsJson = 0;
        getAid = 1;
        DigitizedCardProfile();
        int maxKeyCode = android.view.KeyEvent.getMaxKeyCode();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a((maxKeyCode >> 16) + 15, (-1) - android.os.Process.getGidForName(""), (char) android.view.KeyEvent.normalizeMetaState(0), objArr);
        com.payair.hce.createMCBP createmcbp = new com.payair.hce.createMCBP(((java.lang.String) objArr[0]).intern(), 0);
        AlternateContactlessPaymentDataJson = createmcbp;
        int threadPriority = android.os.Process.getThreadPriority(0);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(21 - ((threadPriority + 20) >> 6), android.widget.ExpandableListView.getPackedPositionChild(0L) + 16, (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), objArr2);
        com.payair.hce.createMCBP createmcbp2 = new com.payair.hce.createMCBP(((java.lang.String) objArr2[0]).intern(), 1);
        values = createmcbp2;
        int indexOf = android.text.TextUtils.indexOf("", "", 0);
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a(indexOf + 8, 36 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) ((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 57700), objArr3);
        com.payair.hce.createMCBP createmcbp3 = new com.payair.hce.createMCBP(((java.lang.String) objArr3[0]).intern(), 2);
        valueOf = createmcbp3;
        int defaultSize = android.view.View.getDefaultSize(0, 0);
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a(defaultSize + 9, android.graphics.Color.rgb(0, 0, 0) + 16777260, (char) (android.view.KeyEvent.keyCodeFromString("") + 55753), objArr4);
        com.payair.hce.createMCBP createmcbp4 = new com.payair.hce.createMCBP(((java.lang.String) objArr4[0]).intern(), 3);
        writeReplace = createmcbp4;
        int jumpTapTimeout = android.view.ViewConfiguration.getJumpTapTimeout();
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        a((jumpTapTimeout >> 16) + 3, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 53, (char) (58487 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), objArr5);
        com.payair.hce.createMCBP createmcbp5 = new com.payair.hce.createMCBP(((java.lang.String) objArr5[0]).intern(), 4);
        DigitizedCardProfile = createmcbp5;
        RecordsJson = new com.payair.hce.createMCBP[]{createmcbp, createmcbp2, createmcbp3, createmcbp4, createmcbp5};
        int i = getAid + 51;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static void a(int i, int i2, char c, java.lang.Object[] objArr) {
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i];
        getcvmmodel.valueOf = 0;
        $11 = ($10 + 103) % 128;
        while (getcvmmodel.valueOf < i) {
            int i3 = $11 + 31;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = getcvmmodel.valueOf;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(SdkCoreAlternateContactlessPaymentDataImpl[i2 + getcvmmodel.valueOf])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.graphics.Color.red(0), 381 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) (62388 - android.text.TextUtils.getTrimmedLength("")));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b((short) 0, (byte) -1, (short) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                    }
                    java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(getProfileVersion), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                    if (obj2 == null) {
                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSizeAndState(0, 0, 0) + 35, (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 3966, (char) (android.view.KeyEvent.getDeadChar(0, 0) + 40223))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                    }
                    jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                    java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 212 - android.view.KeyEvent.normalizeMetaState(0), (char) (android.graphics.Color.rgb(0, 0, 0) + 16777216))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
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
                java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(SdkCoreAlternateContactlessPaymentDataImpl[i2 + getcvmmodel.valueOf])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                if (obj4 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.getDeadChar(0, 0) + 48, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 381, (char) (android.graphics.Color.red(0) + 62388));
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    b((short) 0, (byte) -1, (short) 0, objArr7);
                    obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj4);
                }
                java.lang.Object[] objArr8 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr6)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(getProfileVersion), java.lang.Integer.valueOf(c)};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj5 == null) {
                    obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 3967, (char) (40223 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj5);
                }
                jArr[i5] = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr8)).longValue();
                java.lang.Object[] objArr9 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj6 == null) {
                    obj6 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), android.graphics.Color.rgb(0, 0, 0) + 16777428, (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj6);
                }
                ((java.lang.reflect.Method) obj6).invoke(null, objArr9);
            }
        }
        char[] cArr = new char[i];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i) {
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr10 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj7 == null) {
                obj7 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 35, 213 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 1))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj7);
            }
            ((java.lang.reflect.Method) obj7).invoke(null, objArr10);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    static void DigitizedCardProfile() {
        SdkCoreAlternateContactlessPaymentDataImpl = new char[]{24300, 20488, 17201, 29251, 25934, 5220, 1931, 14011, 10666, 55508, 52204, 64776, 60426, 40746, 36425, 24300, 20488, 17201, 29251, 25934, 5220, 1931, 14011, 10666, 55508, 52204, 64776, 60418, 40742, 36440, 33124, 45179, 41877, 21174, 17863, 29898, 49039, 45424, 41545, 37667, 33844, 62726, 59126, 55237, 34594, 35293, 39652, 43918, 48281, 52667, 56917, 61311, 61536, 47753, 46178, 42827};
        getProfileVersion = -3425907225565179833L;
    }

    static void init$0() {
        $$a = new byte[]{74, 86, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -59};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE;
    }
}
