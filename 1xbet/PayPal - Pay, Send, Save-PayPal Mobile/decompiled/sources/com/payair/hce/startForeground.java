package com.payair.hce;

/* loaded from: classes4.dex */
public class startForeground implements com.payair.hce.ResponseCompleteTokenizeDto {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static long valueOf;
    private static int writeReplace;
    private final com.payair.hce.getErrorName AlternateContactlessPaymentDataJson;
    private final byte[] DigitizedCardProfile;
    private com.payair.hce.checkPermission values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, byte b, java.lang.Object[] objArr) {
        int i3;
        int i4;
        int i5;
        int i6 = 1 - (i2 * 2);
        int i7 = (b * 4) + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i8 = i6;
            i4 = i7;
            i5 = 0;
            i7 += -i8;
            i4++;
            i3 = i5;
            i5 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i5 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i8 = bArr[i4];
            i7 += -i8;
            i4++;
            i3 = i5;
            i5 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i5 == i6) {
            }
        } else {
            i3 = 0;
            i7 = i + 112;
            i4 = i7;
            i5 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i5 == i6) {
            }
        }
    }

    public startForeground(com.payair.hce.getErrorName geterrorname, byte[] bArr) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("樂柳便\uf8ef\uf814\uf829", (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 97, objArr);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(((java.lang.String) objArr[0]).intern());
        sb.append(com.payair.hce.startForeground.class.getName());
        this.values = com.payair.hce.checkPermission.DigitizedCardProfile(sb.toString());
        this.AlternateContactlessPaymentDataJson = geterrorname;
        this.DigitizedCardProfile = bArr;
    }

    @Override // com.payair.hce.ResponseCompleteTokenizeDto
    public final byte[] valueOf(java.lang.String str, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8, int i, byte[] bArr9) {
        com.payair.hce.stopService.AlternateContactlessPaymentDataJson(bArr);
        com.payair.hce.stopService.AlternateContactlessPaymentDataJson(bArr2);
        com.payair.hce.stopService.AlternateContactlessPaymentDataJson(bArr3);
        com.payair.hce.stopService.AlternateContactlessPaymentDataJson(bArr4);
        com.payair.hce.stopService.AlternateContactlessPaymentDataJson(bArr5);
        com.payair.hce.stopService.AlternateContactlessPaymentDataJson(bArr6);
        com.payair.hce.stopService.AlternateContactlessPaymentDataJson(bArr7);
        com.payair.hce.stopService.AlternateContactlessPaymentDataJson(bArr8);
        com.payair.hce.stopService.AlternateContactlessPaymentDataJson(bArr9);
        byte[] bArr10 = (byte[]) com.payair.hce.getAssets.DigitizedCardProfile(new java.lang.Object[]{new com.payair.hce.getAssets(str, bArr, bArr2, bArr3, bArr4, bArr5, bArr6, bArr7, bArr8, i, bArr9)}, 145909445, -145909443, (int) java.lang.System.currentTimeMillis());
        com.payair.hce.stopService.AlternateContactlessPaymentDataJson(bArr10);
        writeReplace = (SdkCoreAlternateContactlessPaymentDataImpl + 125) % 128;
        return bArr10;
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        int i2 = $10 + 99;
        $11 = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        if (str != null) {
            cArr = str.toCharArray();
            $11 = ($10 + 61) % 128;
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.getDsrpData getdsrpdata = new com.payair.hce.getDsrpData();
        getdsrpdata.values = i;
        int length = cArr2.length;
        long[] jArr = new long[length];
        getdsrpdata.valueOf = 0;
        while (getdsrpdata.valueOf < cArr2.length) {
            $10 = ($11 + 35) % 128;
            int i3 = getdsrpdata.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[getdsrpdata.valueOf]), getdsrpdata, getdsrpdata};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2053068265);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(32 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1889, (char) (3600 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)));
                    byte b = (byte) ($$b & 1);
                    byte b2 = (byte) (b - 1);
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b(b, b2, b2, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2053068265, obj);
                }
                jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue() ^ (valueOf ^ (-4761752123935132024L));
                java.lang.Object[] objArr4 = {getdsrpdata, getdsrpdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson('p' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 1443 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 29683));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b(0, 0, (byte) 0, objArr5);
                    obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj2);
                }
                ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
                $10 = ($11 + 53) % 128;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr3 = new char[length];
        getdsrpdata.valueOf = 0;
        while (getdsrpdata.valueOf < cArr2.length) {
            cArr3[getdsrpdata.valueOf] = (char) jArr[getdsrpdata.valueOf];
            java.lang.Object[] objArr6 = {getdsrpdata, getdsrpdata};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
            if (obj3 == null) {
                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 64, 1444 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (29682 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                b(0, 0, (byte) 0, objArr7);
                obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    @Override // com.payair.hce.ResponseCompleteTokenizeDto
    public final byte[] DigitizedCardProfile(java.lang.String str, byte[] bArr, long j, long j2, int i, byte b, byte[] bArr2) {
        com.payair.hce.stopService.AlternateContactlessPaymentDataJson(bArr);
        com.payair.hce.stopService.AlternateContactlessPaymentDataJson(new byte[]{b});
        com.payair.hce.stopService.AlternateContactlessPaymentDataJson(bArr2);
        byte[] writeReplace2 = com.payair.hce.onStartCommand.writeReplace(new com.payair.hce.onStartCommand(str, bArr, j, j2, i, b, bArr2));
        com.payair.hce.stopService.AlternateContactlessPaymentDataJson(writeReplace2);
        int i2 = SdkCoreAlternateContactlessPaymentDataImpl + 89;
        writeReplace = i2 % 128;
        if (i2 % 2 == 0) {
            return writeReplace2;
        }
        throw null;
    }

    @Override // com.payair.hce.ResponseCompleteTokenizeDto
    public final com.payair.hce.getErrorName values() {
        int i = writeReplace + 111;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 != 0) {
            return this.AlternateContactlessPaymentDataJson;
        }
        throw null;
    }

    @Override // com.payair.hce.ResponseCompleteTokenizeDto
    public final byte[] writeReplace() {
        int i = writeReplace + 101;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        byte[] bArr = this.DigitizedCardProfile;
        if (i % 2 != 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        writeReplace = 0;
        SdkCoreAlternateContactlessPaymentDataImpl = 1;
        valueOf = -820613648221892764L;
    }

    static void init$0() {
        $$a = new byte[]{107, 115, 84, 3};
        $$b = 135;
    }
}
