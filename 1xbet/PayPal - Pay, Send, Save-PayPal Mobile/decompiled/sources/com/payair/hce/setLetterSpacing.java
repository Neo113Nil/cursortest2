package com.payair.hce;

/* loaded from: classes4.dex */
public final class setLetterSpacing extends com.payair.hce.setTextSelectHandleLeft {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char AlternateContactlessPaymentDataJson;
    private static char DigitizedCardProfile;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static char valueOf;
    private static int values;
    private static char writeReplace;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Type inference failed for: r7v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, byte b, byte b2, java.lang.Object[] objArr) {
        int i2;
        int i3;
        byte[] bArr = $$a;
        ?? r7 = (b2 * 4) + 4;
        int i4 = (b * 3) + 110;
        int i5 = i * 2;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            byte b3 = r7;
            i2 = 0;
            int i6 = r7;
            i4 += -b3;
            i3 = i6 + 1;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            b3 = bArr[i3];
            i2++;
            i6 = i3;
            i4 += -b3;
            i3 = i6 + 1;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            i3 = r7;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
            }
        }
    }

    @Override // com.payair.hce.setTextMetricsParams
    public final void AlternateContactlessPaymentDataJson(java.lang.Object obj) {
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 89;
        values = i % 128;
        if (i % 2 != 0) {
            com.payair.hce.setSelection DigitizedCardProfile2 = DigitizedCardProfile();
            java.lang.Object[] objArr = new java.lang.Object[1];
            a("拃盉\ue369\uf14c", 4 << android.view.View.MeasureSpec.makeMeasureSpec(1, 0), objArr);
            com.payair.hce.setSelection.DigitizedCardProfile(new java.lang.Object[]{DigitizedCardProfile2, ((java.lang.String) objArr[0]).intern()}, 300113520, -300113519, java.lang.System.identityHashCode(DigitizedCardProfile2));
            return;
        }
        com.payair.hce.setSelection DigitizedCardProfile3 = DigitizedCardProfile();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a("拃盉\ue369\uf14c", 4 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr2);
        com.payair.hce.setSelection.DigitizedCardProfile(new java.lang.Object[]{DigitizedCardProfile3, ((java.lang.String) objArr2[0]).intern()}, 300113520, -300113519, java.lang.System.identityHashCode(DigitizedCardProfile3));
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getProductType getproducttype = new com.payair.hce.getProductType();
        char[] cArr = new char[charArray.length];
        getproducttype.AlternateContactlessPaymentDataJson = 0;
        char[] cArr2 = new char[2];
        while (getproducttype.AlternateContactlessPaymentDataJson < charArray.length) {
            cArr2[0] = charArray[getproducttype.AlternateContactlessPaymentDataJson];
            cArr2[1] = charArray[getproducttype.AlternateContactlessPaymentDataJson + 1];
            $11 = ($10 + 1) % 128;
            int i2 = 58224;
            for (int i3 = 0; i3 < 16; i3++) {
                $11 = ($10 + 115) % 128;
                char c = cArr2[1];
                char c2 = cArr2[0];
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf(((c2 << 4) + ((char) (DigitizedCardProfile ^ 2144259807102049818L))) ^ r14), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson)};
                    int i4 = c2 + i2;
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(62 - android.view.View.MeasureSpec.getSize(0), 1335 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) android.text.TextUtils.getOffsetBefore("", 0));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b(0, (byte) 0, (byte) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj);
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    cArr2[1] = charValue;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr2[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (valueOf ^ 2144259807102049818L))) ^ r13), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(writeReplace)};
                    int i5 = charValue + i2;
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(62 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1335 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) (1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b(0, (byte) 0, (byte) 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj2);
                    }
                    cArr2[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    i2 -= 40503;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr[getproducttype.AlternateContactlessPaymentDataJson] = cArr2[0];
            cArr[getproducttype.AlternateContactlessPaymentDataJson + 1] = cArr2[1];
            java.lang.Object[] objArr6 = {getproducttype, getproducttype};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1765331150);
            if (obj3 == null) {
                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getSize(0) + 53, android.view.View.resolveSize(0, 0) + 3543, (char) (android.view.ViewConfiguration.getTouchSlop() >> 8))).getMethod("r", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1765331150, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
        }
        java.lang.String str2 = new java.lang.String(cArr, 0, i);
        int i6 = $11 + 73;
        $10 = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
        objArr[0] = str2;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        values = 0;
        SdkCoreAlternateContactlessPaymentDataImpl = 1;
        valueOf = (char) 56354;
        writeReplace = (char) 13444;
        DigitizedCardProfile = (char) 36375;
        AlternateContactlessPaymentDataJson = (char) 16514;
    }

    static void init$0() {
        $$a = new byte[]{70, 56, kotlin.io.encoding.Base64.padSymbol, 63};
        $$b = 155;
    }
}
