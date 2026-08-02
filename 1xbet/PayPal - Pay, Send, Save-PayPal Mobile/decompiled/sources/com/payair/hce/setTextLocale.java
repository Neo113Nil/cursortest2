package com.payair.hce;

/* loaded from: classes4.dex */
public final class setTextLocale extends com.payair.hce.setTextSelectHandleLeft {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char AlternateContactlessPaymentDataJson;
    private static char DigitizedCardProfile;
    private static int RecordsJson;
    private static char valueOf;
    private static int values;
    private static char writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, int i, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4 = 110 - (i * 4);
        byte[] bArr = $$a;
        int i5 = b * 3;
        int i6 = i2 + 4;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i7 = i4;
            i3 = 0;
            i4 = i5;
            i4 += i7;
            bArr2[i3] = (byte) i4;
            i6++;
            if (i3 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i3++;
            i7 = bArr[i6];
            i4 += i7;
            bArr2[i3] = (byte) i4;
            i6++;
            if (i3 == i5) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i4;
            i6++;
            if (i3 == i5) {
            }
        }
    }

    @Override // com.payair.hce.setTextMetricsParams
    public final void AlternateContactlessPaymentDataJson(java.lang.Object obj) {
        int i = values + 35;
        RecordsJson = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        if (obj == null) {
            com.payair.hce.setSelection DigitizedCardProfile2 = DigitizedCardProfile();
            java.lang.Object[] objArr = new java.lang.Object[1];
            a("ᓎ딻⣖\uf34d", (android.view.ViewConfiguration.getTapTimeout() >> 16) + 4, objArr);
            com.payair.hce.setSelection.DigitizedCardProfile(new java.lang.Object[]{DigitizedCardProfile2, ((java.lang.String) objArr[0]).intern()}, 300113520, -300113519, java.lang.System.identityHashCode(DigitizedCardProfile2));
            int i2 = RecordsJson + 5;
            values = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            return;
        }
        com.payair.hce.setSelection DigitizedCardProfile3 = DigitizedCardProfile();
        com.payair.hce.setSelection.DigitizedCardProfile(new java.lang.Object[]{DigitizedCardProfile3, java.lang.String.valueOf(((java.util.Calendar) obj).getTimeInMillis())}, 300113520, -300113519, java.lang.System.identityHashCode(DigitizedCardProfile3));
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        int i2 = $11;
        int i3 = i2 + 37;
        $10 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (str != null) {
            int i4 = i2 + 3;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
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
            int i5 = 58224;
            int i6 = 0;
            while (i6 < 16) {
                char c = cArr4[1];
                char c2 = cArr4[0];
                com.payair.hce.getProductType getproducttype2 = getproducttype;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf((c2 + i5) ^ ((c2 << 4) + ((char) (AlternateContactlessPaymentDataJson ^ 2144259807102049818L)))), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(DigitizedCardProfile)};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 62, 1335 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b((byte) 0, 0, -1, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj);
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    cArr4[1] = charValue;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr4[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (writeReplace ^ 2144259807102049818L))) ^ r14), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(valueOf)};
                    int i7 = charValue + i5;
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 62, ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1336, (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b((byte) 0, 0, -1, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj2);
                    }
                    cArr4[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    i5 -= 40503;
                    i6++;
                    $10 = ($11 + 79) % 128;
                    getproducttype = getproducttype2;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            com.payair.hce.getProductType getproducttype3 = getproducttype;
            cArr3[getproducttype3.AlternateContactlessPaymentDataJson] = cArr4[0];
            cArr3[getproducttype3.AlternateContactlessPaymentDataJson + 1] = cArr4[1];
            java.lang.Object[] objArr6 = {getproducttype3, getproducttype3};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1765331150);
            if (obj3 == null) {
                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 53, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 3543, (char) ((-1) - android.view.MotionEvent.axisFromString("")))).getMethod("r", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1765331150, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
            getproducttype = getproducttype3;
        }
        objArr[0] = new java.lang.String(cArr3, 0, i);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        values = 0;
        RecordsJson = 1;
        writeReplace = (char) 13703;
        valueOf = (char) 31642;
        AlternateContactlessPaymentDataJson = (char) 48636;
        DigitizedCardProfile = (char) 22321;
    }

    static void init$0() {
        $$a = new byte[]{63, kotlin.io.encoding.Base64.padSymbol, -101, com.google.common.base.Ascii.SI};
        $$b = 25;
    }
}
