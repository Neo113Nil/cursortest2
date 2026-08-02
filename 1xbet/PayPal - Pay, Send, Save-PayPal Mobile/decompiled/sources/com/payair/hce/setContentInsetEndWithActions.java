package com.payair.hce;

/* loaded from: classes4.dex */
public final class setContentInsetEndWithActions extends com.payair.hce.setGravity {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int IccPrivateKeyCrtComponentsJson;
    private static char SdkCoreAlternateContactlessPaymentDataImpl;
    private static int getProfileVersion;
    private static char valueOf;
    private static char values;
    private static char writeReplace;
    private java.math.BigInteger AlternateContactlessPaymentDataJson;
    private java.math.BigInteger DigitizedCardProfile;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, short s, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4 = s + 4;
        int i5 = (i2 * 4) + 110;
        int i6 = i * 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i6 + 1];
        if (bArr == null) {
            int i7 = i6;
            i3 = 0;
            i5 += i7;
            bArr2[i3] = (byte) i5;
            if (i3 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i3++;
            i4++;
            i7 = bArr[i4];
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

    public static com.payair.hce.setContentInsetEndWithActions AlternateContactlessPaymentDataJson(java.lang.Object obj) {
        if (obj == null) {
            getProfileVersion = (IccPrivateKeyCrtComponentsJson + 63) % 128;
            return null;
        }
        com.payair.hce.setContentInsetEndWithActions setcontentinsetendwithactions = new com.payair.hce.setContentInsetEndWithActions(com.payair.hce.setMaxEms.DigitizedCardProfile(obj));
        IccPrivateKeyCrtComponentsJson = (getProfileVersion + 39) % 128;
        return setcontentinsetendwithactions;
    }

    private setContentInsetEndWithActions(com.payair.hce.setMaxEms setmaxems) {
        if (setmaxems.valueOf() != 2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr = new java.lang.Object[1];
            a("⸑둌겵ℊ䤃ꏎ벥栛㍨ṵ츊ઙ\u171d뱩⭏仈펦긯ҭ皋", android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 19, objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(setmaxems.valueOf());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        java.util.Enumeration values2 = setmaxems.values();
        com.payair.hce.setHorizontallyScrolling valueOf2 = com.payair.hce.setHorizontallyScrolling.valueOf(values2.nextElement());
        this.AlternateContactlessPaymentDataJson = (java.math.BigInteger) com.payair.hce.setHorizontallyScrolling.values(new java.lang.Object[]{valueOf2}, -758782782, 758782783, java.lang.System.identityHashCode(valueOf2));
        com.payair.hce.setHorizontallyScrolling valueOf3 = com.payair.hce.setHorizontallyScrolling.valueOf(values2.nextElement());
        this.DigitizedCardProfile = (java.math.BigInteger) com.payair.hce.setHorizontallyScrolling.values(new java.lang.Object[]{valueOf3}, -758782782, 758782783, java.lang.System.identityHashCode(valueOf3));
    }

    public final java.math.BigInteger AlternateContactlessPaymentDataJson() {
        int i = (getProfileVersion + 37) % 128;
        IccPrivateKeyCrtComponentsJson = i;
        java.math.BigInteger bigInteger = this.AlternateContactlessPaymentDataJson;
        int i2 = i + 7;
        getProfileVersion = i2 % 128;
        if (i2 % 2 != 0) {
            return bigInteger;
        }
        throw null;
    }

    public final java.math.BigInteger writeReplace() {
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = i + 1;
        getProfileVersion = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        java.math.BigInteger bigInteger = this.DigitizedCardProfile;
        int i3 = i + 111;
        getProfileVersion = i3 % 128;
        if (i3 % 2 != 0) {
            return bigInteger;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.setGravity, com.payair.hce.setShadowLayer
    public final com.payair.hce.setEms getAid() {
        com.payair.hce.setHintTextColor sethinttextcolor = new com.payair.hce.setHintTextColor();
        com.payair.hce.setHintTextColor.AlternateContactlessPaymentDataJson(new java.lang.Object[]{sethinttextcolor, new com.payair.hce.setHorizontallyScrolling(AlternateContactlessPaymentDataJson())}, 649338035, -649338033, java.lang.System.identityHashCode(sethinttextcolor));
        com.payair.hce.setHintTextColor.AlternateContactlessPaymentDataJson(new java.lang.Object[]{sethinttextcolor, new com.payair.hce.setHorizontallyScrolling(writeReplace())}, 649338035, -649338033, java.lang.System.identityHashCode(sethinttextcolor));
        com.payair.hce.setCustomInsertionActionModeCallback setcustominsertionactionmodecallback = new com.payair.hce.setCustomInsertionActionModeCallback(sethinttextcolor);
        getProfileVersion = (IccPrivateKeyCrtComponentsJson + 119) % 128;
        return setcustominsertionactionmodecallback;
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        if (str != null) {
            $11 = ($10 + 11) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.getProductType getproducttype = new com.payair.hce.getProductType();
        char[] cArr3 = new char[cArr2.length];
        getproducttype.AlternateContactlessPaymentDataJson = 0;
        char[] cArr4 = new char[2];
        while (getproducttype.AlternateContactlessPaymentDataJson < cArr2.length) {
            cArr4[0] = cArr2[getproducttype.AlternateContactlessPaymentDataJson];
            cArr4[1] = cArr2[getproducttype.AlternateContactlessPaymentDataJson + 1];
            $11 = ($10 + 25) % 128;
            int i2 = 58224;
            for (int i3 = 0; i3 < 16; i3++) {
                char c = cArr4[1];
                char c2 = cArr4[0];
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf((c2 + i2) ^ ((c2 << 4) + ((char) (values ^ 2144259807102049818L)))), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(SdkCoreAlternateContactlessPaymentDataImpl)};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(63 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 1335 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b(0, (short) -1, 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj);
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    cArr4[1] = charValue;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr4[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (valueOf ^ 2144259807102049818L))) ^ r14), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(writeReplace)};
                    int i4 = charValue + i2;
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 61, android.text.TextUtils.indexOf("", "", 0) + 1335, (char) android.widget.ExpandableListView.getPackedPositionType(0L));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b(0, (short) -1, 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj2);
                    }
                    cArr4[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    i2 -= 40503;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3[getproducttype.AlternateContactlessPaymentDataJson] = cArr4[0];
            cArr3[getproducttype.AlternateContactlessPaymentDataJson + 1] = cArr4[1];
            java.lang.Object[] objArr6 = {getproducttype, getproducttype};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1765331150);
            if (obj3 == null) {
                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 53, 3543 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1))).getMethod("r", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1765331150, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr3, 0, i);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        IccPrivateKeyCrtComponentsJson = 0;
        getProfileVersion = 1;
        valueOf = (char) 48798;
        writeReplace = (char) 10171;
        values = (char) 42526;
        SdkCoreAlternateContactlessPaymentDataImpl = (char) 20650;
    }

    static void init$0() {
        $$a = new byte[]{com.visa.cbp.getEncExpo.IResultReceiver2, 75, 70, 2};
        $$b = 44;
    }
}
