package com.payair.hce;

/* loaded from: classes4.dex */
public class VisaTokenizationInitializer implements com.payair.hce.getColor {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static long DigitizedCardProfile;
    private static int writeReplace;
    private com.payair.hce.checkPermission valueOf;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, short s, byte b, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4;
        int i5 = 1 - (i * 3);
        int i6 = b + 112;
        int i7 = (s * 2) + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            i6 = i5;
            int i8 = i7;
            i4 = 0;
            int i9 = i7;
            i6 += i8;
            i2 = i4;
            i3 = i9 + 1;
            i4 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i4 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i8 = bArr[i3];
            i9 = i3;
            i6 += i8;
            i2 = i4;
            i3 = i9 + 1;
            i4 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i4 == i5) {
            }
        } else {
            i2 = 0;
            i3 = i7;
            i4 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i4 == i5) {
            }
        }
    }

    public VisaTokenizationInitializer() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("譄\ue61c凂쳚㹗ꦼ", 27984 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(((java.lang.String) objArr[0]).intern());
        sb.append(com.payair.hce.VisaTokenizationInitializer.class.getName());
        this.valueOf = com.payair.hce.checkPermission.DigitizedCardProfile(sb.toString());
    }

    @Override // com.payair.hce.getColor
    public byte[] values(byte[] bArr, byte[] bArr2) {
        writeReplace = (AlternateContactlessPaymentDataJson + 73) % 128;
        com.payair.hce.stopService.AlternateContactlessPaymentDataJson(bArr2);
        com.payair.hce.stopService.AlternateContactlessPaymentDataJson(bArr);
        AlternateContactlessPaymentDataJson = (writeReplace + 1) % 128;
        return bArr;
    }

    @Override // com.payair.hce.getColor
    public final byte[] valueOf(byte b, byte b2, byte[] bArr) {
        AlternateContactlessPaymentDataJson = (writeReplace + 3) % 128;
        com.payair.hce.stopService.AlternateContactlessPaymentDataJson(new byte[]{b});
        com.payair.hce.stopService.AlternateContactlessPaymentDataJson(new byte[]{b2});
        com.payair.hce.stopService.AlternateContactlessPaymentDataJson(bArr);
        int i = writeReplace + 89;
        AlternateContactlessPaymentDataJson = i % 128;
        if (i % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        int i2 = $11;
        $10 = (i2 + 11) % 128;
        if (str != null) {
            $10 = (i2 + 97) % 128;
            cArr = str.toCharArray();
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
            int i3 = getdsrpdata.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[getdsrpdata.valueOf]), getdsrpdata, getdsrpdata};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2053068265);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 31, 1890 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 3601));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b(0, (short) 0, (byte) 1, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2053068265, obj);
                }
                jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue() ^ (DigitizedCardProfile ^ (-4761752123935132024L));
                java.lang.Object[] objArr4 = {getdsrpdata, getdsrpdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 63, 1443 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (29682 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16)));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b(0, (short) 0, (byte) 0, objArr5);
                    obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj2);
                }
                ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
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
                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(64 - android.graphics.Color.green(0), android.view.KeyEvent.normalizeMetaState(0) + 1443, (char) (29682 - android.text.TextUtils.indexOf("", "")));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                b(0, (short) 0, (byte) 0, objArr7);
                obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    @Override // com.payair.hce.getColor
    public void DigitizedCardProfile() {
        int i = writeReplace + 49;
        AlternateContactlessPaymentDataJson = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        AlternateContactlessPaymentDataJson = 0;
        writeReplace = 1;
        DigitizedCardProfile = -1094309724687499873L;
    }

    static void init$0() {
        $$a = new byte[]{73, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -116, -114};
        $$b = 68;
    }
}
