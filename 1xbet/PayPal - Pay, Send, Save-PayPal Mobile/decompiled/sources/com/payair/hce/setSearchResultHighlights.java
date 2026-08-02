package com.payair.hce;

/* loaded from: classes4.dex */
public final class setSearchResultHighlights extends com.payair.hce.setHighlightColor {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char DigitizedCardProfile;
    private static char RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static char getAid;
    private static int getProfileVersion;
    private static char writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, short s, byte b, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = i + 4;
        byte[] bArr = $$a;
        int i5 = b * 3;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        if (bArr == null) {
            i3 = i4;
            int i7 = i6;
            int i8 = 0;
            i4 += -i7;
            i2 = i8;
            bArr2[i2] = (byte) i4;
            i3++;
            i8 = i2 + 1;
            if (i2 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = bArr[i3];
            i4 += -i7;
            i2 = i8;
            bArr2[i2] = (byte) i4;
            i3++;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        } else {
            int i9 = (s * 2) + 110;
            i2 = 0;
            i3 = i4;
            i4 = i9;
            bArr2[i2] = (byte) i4;
            i3++;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        }
    }

    public setSearchResultHighlights(int i, com.payair.hce.setHintTextColor sethinttextcolor) {
        super(true, i, AlternateContactlessPaymentDataJson(sethinttextcolor));
    }

    private static byte[] AlternateContactlessPaymentDataJson(com.payair.hce.setHintTextColor sethinttextcolor) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        for (int i = 0; i != ((java.lang.Integer) com.payair.hce.setHintTextColor.AlternateContactlessPaymentDataJson(new java.lang.Object[]{sethinttextcolor}, -1832970438, 1832970438, java.lang.System.identityHashCode(sethinttextcolor))).intValue(); i++) {
            int i2 = getProfileVersion + 13;
            SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
            if (i2 % 2 == 0) {
                try {
                    com.payair.hce.setGravity setgravity = (com.payair.hce.setGravity) ((com.payair.hce.setShadowLayer) com.payair.hce.setHintTextColor.AlternateContactlessPaymentDataJson(new java.lang.Object[]{sethinttextcolor, java.lang.Integer.valueOf(i)}, 1016755526, -1016755525, i));
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    a("㦏㪄⪎楀", 2 / (android.view.ViewConfiguration.getDoubleTapTimeout() % 19), objArr);
                    byteArrayOutputStream.write(setgravity.values(((java.lang.String) objArr[0]).intern()));
                } catch (java.io.IOException e) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    a("╷\uf742桘婦伙\ue896ဣ속蘍\uede0뢂䘗䉋宏㪆埤該눰", (-16777198) - android.graphics.Color.rgb(0, 0, 0), objArr2);
                    sb.append(((java.lang.String) objArr2[0]).intern());
                    sb.append(e);
                    throw new com.payair.hce.setLines(sb.toString(), e);
                }
            } else {
                com.payair.hce.setGravity setgravity2 = (com.payair.hce.setGravity) ((com.payair.hce.setShadowLayer) com.payair.hce.setHintTextColor.AlternateContactlessPaymentDataJson(new java.lang.Object[]{sethinttextcolor, java.lang.Integer.valueOf(i)}, 1016755526, -1016755525, i));
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                a("㦏㪄⪎楀", (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 3, objArr3);
                byteArrayOutputStream.write(setgravity2.values(((java.lang.String) objArr3[0]).intern()));
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        getProfileVersion = (SdkCoreAlternateContactlessPaymentDataImpl + 39) % 128;
        return byteArray;
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        if (str != null) {
            $11 = ($10 + 41) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.getProductType getproducttype = new com.payair.hce.getProductType();
        char[] cArr3 = new char[cArr2.length];
        getproducttype.AlternateContactlessPaymentDataJson = 0;
        char[] cArr4 = new char[2];
        int i2 = $11 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        $10 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 3 / 5;
        }
        while (getproducttype.AlternateContactlessPaymentDataJson < cArr2.length) {
            cArr4[0] = cArr2[getproducttype.AlternateContactlessPaymentDataJson];
            cArr4[1] = cArr2[getproducttype.AlternateContactlessPaymentDataJson + 1];
            int i4 = 58224;
            for (int i5 = 0; i5 < 16; i5++) {
                char c = cArr4[1];
                char c2 = cArr4[0];
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf((c2 + i4) ^ ((c2 << 4) + ((char) (RecordsJson ^ 2144259807102049818L)))), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(getAid)};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(62 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), 1335 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) android.text.TextUtils.getCapsMode("", 0, 0));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b(-1, (short) 0, (byte) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj);
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    cArr4[1] = charValue;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr4[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (writeReplace ^ 2144259807102049818L))) ^ r13), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(DigitizedCardProfile)};
                    int i6 = charValue + i4;
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(62 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), android.view.View.resolveSize(0, 0) + 1335, (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b(-1, (short) 0, (byte) 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj2);
                    }
                    cArr4[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    i4 -= 40503;
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
                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 3543 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1))).getMethod("r", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1765331150, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr3, 0, i);
    }

    @Override // com.payair.hce.setHighlightColor, com.payair.hce.setEms
    final void values(com.payair.hce.setMaxLines setmaxlines) throws java.io.IOException {
        int i;
        int i2 = getProfileVersion + 107;
        SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
        if (i2 % 2 == 0) {
            if (!this.AlternateContactlessPaymentDataJson) {
                i = 9;
            }
            int i3 = (SdkCoreAlternateContactlessPaymentDataImpl + 21) % 128;
            getProfileVersion = i3;
            SdkCoreAlternateContactlessPaymentDataImpl = (i3 + 89) % 128;
            i = 96;
        } else {
            if (!this.AlternateContactlessPaymentDataJson) {
                i = 64;
            }
            int i32 = (SdkCoreAlternateContactlessPaymentDataImpl + 21) % 128;
            getProfileVersion = i32;
            SdkCoreAlternateContactlessPaymentDataImpl = (i32 + 89) % 128;
            i = 96;
        }
        com.payair.hce.setMaxLines.DigitizedCardProfile(new java.lang.Object[]{setmaxlines, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(this.values)}, -584468000, 584468000, i);
        setmaxlines.DigitizedCardProfile(128);
        setmaxlines.valueOf(this.valueOf);
        setmaxlines.DigitizedCardProfile(0);
        setmaxlines.DigitizedCardProfile(0);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getProfileVersion = 0;
        SdkCoreAlternateContactlessPaymentDataImpl = 1;
        writeReplace = (char) 7335;
        DigitizedCardProfile = (char) 34366;
        RecordsJson = (char) 45991;
        getAid = (char) 49262;
    }

    static void init$0() {
        $$a = new byte[]{85, 6, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -50};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE;
    }
}
