package com.facetec.sdk;

/* loaded from: classes8.dex */
final class pl {
    private static final byte[] $$a = null;
    private static final int $$b = 0;

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f3745a;
    private static char b;
    private static char c;
    private static char d;
    private static char e;

    private static java.lang.String $$c(byte b2, short s, int i) {
        byte[] bArr = $$a;
        int i2 = (i * 3) + 4;
        int i3 = s * 4;
        int i4 = 112 - (b2 * 3);
        byte[] bArr2 = new byte[i3 + 1];
        int i5 = -1;
        if (bArr == null) {
            i2++;
            i4 = i3 + i4;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i4;
            if (i5 == i3) {
                return new java.lang.String(bArr2, 0);
            }
            int i6 = bArr[i2];
            i2++;
            i4 += i6;
        }
    }

    static void init$0() {
        $$a = new byte[]{14, -110, -105, 88};
        $$b = 14;
    }

    public static byte[] c(java.lang.String str) {
        int i;
        char charAt;
        int length = str.length();
        while (length > 0 && ((charAt = str.charAt(length - 1)) == '=' || charAt == '\n' || charAt == '\r' || charAt == ' ' || charAt == '\t')) {
            length--;
        }
        int i2 = (int) ((length * 6) / 8);
        byte[] bArr = new byte[i2];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            char charAt2 = str.charAt(i6);
            if (charAt2 >= 'A' && charAt2 <= 'Z') {
                i = charAt2 - 'A';
            } else if (charAt2 >= 'a' && charAt2 <= 'z') {
                i = charAt2 - 'G';
            } else if (charAt2 >= '0' && charAt2 <= '9') {
                i = charAt2 + 4;
            } else if (charAt2 == '+' || charAt2 == '-') {
                i = 62;
            } else if (charAt2 == '/' || charAt2 == '_') {
                i = 63;
            } else {
                if (charAt2 != '\n' && charAt2 != '\r' && charAt2 != ' ' && charAt2 != '\t') {
                    return null;
                }
            }
            i5 = (i5 << 6) | ((byte) i);
            i3++;
            if (i3 % 4 == 0) {
                bArr[i4] = (byte) (i5 >> 16);
                bArr[i4 + 1] = (byte) (i5 >> 8);
                bArr[i4 + 2] = (byte) i5;
                i4 += 3;
            }
        }
        int i7 = i3 % 4;
        if (i7 == 1) {
            return null;
        }
        if (i7 == 2) {
            bArr[i4] = (byte) ((i5 << 12) >> 16);
            i4++;
        } else if (i7 == 3) {
            int i8 = i5 << 6;
            bArr[i4] = (byte) (i8 >> 16);
            bArr[i4 + 1] = (byte) (i8 >> 8);
            i4 += 2;
        }
        if (i4 == i2) {
            return bArr;
        }
        byte[] bArr2 = new byte[i4];
        try {
            java.lang.Object[] objArr = {bArr, 0, bArr2, 0, java.lang.Integer.valueOf(i4)};
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            f("㖠\uf47b⭖챁に恲人鲔ꪞ\udf47钥\u1977\ud974ȼꪗ熦", 16 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr2);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr2[0]);
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            f("爖㮔宀쯂έꪣ䰬쐑閶狥", 9 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr3);
            cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr);
            return bArr2;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static void f(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str != null ? str.toCharArray() : str;
        com.facetec.sdk.ho hoVar = new com.facetec.sdk.ho();
        char[] cArr = new char[charArray.length];
        hoVar.b = 0;
        char[] cArr2 = new char[2];
        while (hoVar.b < charArray.length) {
            cArr2[0] = charArray[hoVar.b];
            cArr2[1] = charArray[hoVar.b + 1];
            int i2 = 58224;
            for (int i3 = 0; i3 < 16; i3++) {
                char c2 = cArr2[1];
                char c3 = cArr2[0];
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c2), java.lang.Integer.valueOf(((c3 << 4) + ((char) (b ^ 2174069992062419062L))) ^ r14), java.lang.Integer.valueOf(c3 >>> 5), java.lang.Integer.valueOf(c)};
                    int i4 = c3 + i2;
                    java.lang.Object d2 = com.facetec.sdk.al.d(1497828241);
                    if (d2 == null) {
                        d2 = com.facetec.sdk.al.c((char) (android.os.Process.myPid() >> 22), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, 23 - android.view.View.resolveSizeAndState(0, 0, 0), -22515351, false, lib.android.paypal.com.magnessdk.g.n2, new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).charValue();
                    cArr2[1] = charValue;
                    java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(cArr2[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (e ^ 2174069992062419062L))) ^ r13), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(d)};
                    int i5 = charValue + i2;
                    java.lang.Object d3 = com.facetec.sdk.al.d(1497828241);
                    if (d3 == null) {
                        d3 = com.facetec.sdk.al.c((char) android.view.View.MeasureSpec.getSize(0), 211 - android.view.View.resolveSize(0, 0), 23 - android.graphics.Color.blue(0), -22515351, false, lib.android.paypal.com.magnessdk.g.n2, new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                    }
                    cArr2[0] = ((java.lang.Character) ((java.lang.reflect.Method) d3).invoke(null, objArr3)).charValue();
                    i2 -= 40503;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr[hoVar.b] = cArr2[0];
            cArr[hoVar.b + 1] = cArr2[1];
            java.lang.Object[] objArr4 = {hoVar, hoVar};
            java.lang.Object d4 = com.facetec.sdk.al.d(-2113314280);
            if (d4 == null) {
                byte b2 = (byte) 0;
                d4 = com.facetec.sdk.al.c((char) (31540 - android.os.Process.getGidForName("")), 1912 - android.widget.ExpandableListView.getPackedPositionChild(0L), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 22, 635836640, false, $$c(b2, b2, b2), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
            }
            ((java.lang.reflect.Method) d4).invoke(null, objArr4);
        }
        objArr[0] = new java.lang.String(cArr, 0, i);
    }

    static {
        init$0();
        b();
        f3745a = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 113, 114, 115, 116, 117, 118, com.visa.cbp.getEncExpo.IResultReceiver, 120, 121, 122, 48, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 56, 57, 43, 47};
    }

    public static java.lang.String c(byte[] bArr) {
        return d(bArr, f3745a);
    }

    private static java.lang.String d(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) << 2];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            bArr3[i2] = bArr2[(bArr[i] & 255) >> 2];
            int i3 = i + 1;
            bArr3[i2 + 1] = bArr2[((bArr[i] & 3) << 4) | ((bArr[i3] & 255) >> 4)];
            byte b2 = bArr[i3];
            int i4 = i + 2;
            bArr3[i2 + 2] = bArr2[((b2 & com.google.common.base.Ascii.SI) << 2) | ((bArr[i4] & 255) >> 6)];
            bArr3[i2 + 3] = bArr2[bArr[i4] & 63];
            i += 3;
            i2 += 4;
        }
        int length2 = bArr.length % 3;
        if (length2 == 1) {
            bArr3[i2] = bArr2[(bArr[length] & 255) >> 2];
            bArr3[i2 + 1] = bArr2[(bArr[length] & 3) << 4];
            bArr3[i2 + 2] = kotlin.io.encoding.Base64.padSymbol;
            bArr3[i2 + 3] = kotlin.io.encoding.Base64.padSymbol;
        } else if (length2 == 2) {
            bArr3[i2] = bArr2[(bArr[length] & 255) >> 2];
            byte b3 = bArr[length];
            int i5 = length + 1;
            bArr3[i2 + 1] = bArr2[((b3 & 3) << 4) | ((bArr[i5] & 255) >> 4)];
            bArr3[i2 + 2] = bArr2[(bArr[i5] & com.google.common.base.Ascii.SI) << 2];
            bArr3[i2 + 3] = kotlin.io.encoding.Base64.padSymbol;
        }
        try {
            return new java.lang.String(bArr3, "US-ASCII");
        } catch (java.io.UnsupportedEncodingException e2) {
            throw new java.lang.AssertionError(e2);
        }
    }

    static void b() {
        e = (char) 22019;
        d = (char) 26035;
        b = (char) 29286;
        c = (char) 59062;
    }
}
