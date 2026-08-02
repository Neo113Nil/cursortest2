package com.payair.hce;

/* loaded from: classes4.dex */
public class onUnbind implements com.payair.hce.copydefault {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static int getProfileVersion;
    private static long valueOf;
    private com.payair.hce.checkPermission values;
    private final int DigitizedCardProfile = 3;
    private final int[] writeReplace = {2, 3, 5};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, byte b, java.lang.Object[] objArr) {
        int i3;
        byte[] bArr = $$a;
        int i4 = i * 4;
        int i5 = 3 - (b * 4);
        int i6 = i2 + 112;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i7 = i6;
            i3 = 0;
            i6 = i4;
            i6 += i7;
            bArr2[i3] = (byte) i6;
            if (i3 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i5++;
            i3++;
            i7 = bArr[i5];
            i6 += i7;
            bArr2[i3] = (byte) i6;
            if (i3 == i4) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i6;
            if (i3 == i4) {
            }
        }
    }

    public onUnbind() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("뱫ᎁ\ue389돯ΰ폩", 45053 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(((java.lang.String) objArr[0]).intern());
        sb.append(com.payair.hce.onUnbind.class.getName());
        this.values = com.payair.hce.checkPermission.DigitizedCardProfile(sb.toString());
    }

    @Override // com.payair.hce.copydefault
    public final int writeReplace() {
        int i = getProfileVersion;
        AlternateContactlessPaymentDataJson = (i + 45) % 128;
        int i2 = i + 13;
        AlternateContactlessPaymentDataJson = i2 % 128;
        if (i2 % 2 == 0) {
            return 3;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.copydefault
    public final int[] DigitizedCardProfile() {
        int i = getProfileVersion;
        int i2 = i + 9;
        AlternateContactlessPaymentDataJson = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        int[] iArr = this.writeReplace;
        int i3 = i + 107;
        AlternateContactlessPaymentDataJson = i3 % 128;
        if (i3 % 2 == 0) {
            return iArr;
        }
        throw new java.lang.ArithmeticException();
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = $11 + 21;
        $10 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getDsrpData getdsrpdata = new com.payair.hce.getDsrpData();
        getdsrpdata.values = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        getdsrpdata.valueOf = 0;
        while (getdsrpdata.valueOf < charArray.length) {
            int i3 = getdsrpdata.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(charArray[getdsrpdata.valueOf]), getdsrpdata, getdsrpdata};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2053068265);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - android.view.View.MeasureSpec.getSize(0), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1889, (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 3601));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b(0, 1, (byte) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2053068265, obj);
                }
                jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue() ^ (valueOf ^ (-4761752123935132024L));
                java.lang.Object[] objArr4 = {getdsrpdata, getdsrpdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 65, android.text.TextUtils.getCapsMode("", 0, 0) + 1443, (char) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 29682));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b(0, 0, (byte) 0, objArr5);
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
        char[] cArr = new char[length];
        getdsrpdata.valueOf = 0;
        while (getdsrpdata.valueOf < charArray.length) {
            cArr[getdsrpdata.valueOf] = (char) jArr[getdsrpdata.valueOf];
            java.lang.Object[] objArr6 = {getdsrpdata, getdsrpdata};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
            if (obj3 == null) {
                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(64 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1443 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 29683));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                b(0, 0, (byte) 0, objArr7);
                obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
        }
        java.lang.String str2 = new java.lang.String(cArr);
        $11 = ($10 + 43) % 128;
        objArr[0] = str2;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        AlternateContactlessPaymentDataJson = 0;
        getProfileVersion = 1;
        valueOf = -8173062910286378320L;
    }

    static void init$0() {
        $$a = new byte[]{org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -79, -89, 69};
        $$b = 199;
    }
}
