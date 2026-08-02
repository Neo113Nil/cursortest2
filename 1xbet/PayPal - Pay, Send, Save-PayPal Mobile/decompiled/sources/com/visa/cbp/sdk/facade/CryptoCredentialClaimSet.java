package com.visa.cbp.sdk.facade;

/* loaded from: classes5.dex */
public class CryptoCredentialClaimSet {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char BuildConfig;
    private static char ConfirmReplenishRequest;
    private static char valueOf;
    private static char values;
    java.lang.String[] aud;
    long exp;
    long iat;
    java.lang.String iss;
    java.lang.String iss_knd;
    java.lang.String jti;
    com.visa.cbp.sdk.facade.KeyAgr key_agr;
    com.visa.cbp.sdk.facade.KeyDm key_dm;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, short s, short s2, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3;
        int i4 = 1 - (s2 * 4);
        int i5 = 4 - (s * 4);
        byte[] bArr = $$a;
        int i6 = b + 117;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i7 = i5;
            int i8 = 0;
            i5 += -i6;
            i2 = i7 + 1;
            i = i8;
            bArr2[i] = (byte) i5;
            i3 = i + 1;
            if (i3 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = i2;
            i6 = bArr[i2];
            i8 = i3;
            i5 += -i6;
            i2 = i7 + 1;
            i = i8;
            bArr2[i] = (byte) i5;
            i3 = i + 1;
            if (i3 == i4) {
            }
        } else {
            i = 0;
            i5 = i6;
            i2 = i5;
            bArr2[i] = (byte) i5;
            i3 = i + 1;
            if (i3 == i4) {
            }
        }
    }

    public CryptoCredentialClaimSet(java.lang.String str, java.lang.String str2, long j, long j2, java.lang.String str3, com.visa.cbp.sdk.facade.KeyAgr keyAgr, com.visa.cbp.sdk.facade.KeyDm keyDm) {
        this.iss = str;
        this.iss_knd = str2;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("ྙ\u1a8a鵬\u0bba淉⮮绑駭橿츴믃讬좃㺈\uf7eb뾜䉟誮⁞\u137d", android.text.TextUtils.indexOf("", "", 0, 0) + 20, objArr);
        this.aud = new java.lang.String[]{((java.lang.String) objArr[0]).intern()};
        this.iat = j;
        this.exp = j2;
        this.jti = str3;
        this.key_agr = keyAgr;
        this.key_dm = keyDm;
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        int i2 = $10 + 51;
        int i3 = i2 % 128;
        $11 = i3;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        if (str != null) {
            $10 = (i3 + 17) % 128;
            cArr = str.toCharArray();
            $10 = ($11 + 99) % 128;
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.visa.cbp.setSignature setsignature = new com.visa.cbp.setSignature();
        char[] cArr3 = new char[cArr2.length];
        setsignature.ConfirmReplenishRequest = 0;
        char[] cArr4 = new char[2];
        while (setsignature.ConfirmReplenishRequest < cArr2.length) {
            cArr4[0] = cArr2[setsignature.ConfirmReplenishRequest];
            cArr4[1] = cArr2[setsignature.ConfirmReplenishRequest + 1];
            int i4 = 58224;
            int i5 = 0;
            while (i5 < 16) {
                char c = cArr4[1];
                char c2 = cArr4[0];
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf((c2 + i4) ^ ((c2 << 4) + ((char) (ConfirmReplenishRequest ^ 7012782929194310790L)))), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(valueOf)};
                    java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-1957494866);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (3291 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 430, 43 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                        byte b = (byte) ($$b & 1);
                        byte b2 = (byte) (b - 1);
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b(b, b2, b2, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-1957494866, obj);
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    cArr4[1] = charValue;
                    try {
                        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr4[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (values ^ 7012782929194310790L))) ^ r12), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(BuildConfig)};
                        int i6 = charValue + i4;
                        java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-1957494866);
                        if (obj2 == null) {
                            java.lang.Class cls2 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (3290 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 431, 43 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
                            byte b3 = (byte) ($$b & 1);
                            byte b4 = (byte) (b3 - 1);
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            b(b3, b4, b4, objArr5);
                            obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-1957494866, obj2);
                        }
                        cArr4[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                        i4 -= 40503;
                        i5++;
                        $11 = ($10 + 33) % 128;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (java.lang.Throwable th2) {
                    java.lang.Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr3[setsignature.ConfirmReplenishRequest] = cArr4[0];
            cArr3[setsignature.ConfirmReplenishRequest + 1] = cArr4[1];
            try {
                java.lang.Object[] objArr6 = {setsignature, setsignature};
                java.lang.Object obj3 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1837204720);
                if (obj3 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 58032), 1676 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), 26 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    b((byte) 0, (short) 0, (short) 0, objArr7);
                    obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                    com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1837204720, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
            } catch (java.lang.Throwable th3) {
                java.lang.Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        objArr[0] = new java.lang.String(cArr3, 0, i);
    }

    public /* synthetic */ CryptoCredentialClaimSet() {
    }

    static void init$0() {
        $$a = new byte[]{76, 19, -66, kotlin.io.encoding.Base64.padSymbol};
        $$b = 159;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        BuildConfig = (char) 18579;
        valueOf = (char) 7330;
        values = (char) 59627;
        ConfirmReplenishRequest = (char) 13896;
    }
}
