package com.payair.hce;

/* loaded from: classes4.dex */
public final class getAllCmsDFormattedTransactionCredentials extends com.payair.hce.getReasonCode<java.lang.String> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int DigitizedCardProfile;
    private static int valueOf;
    private static long values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, short s, java.lang.Object[] objArr) {
        int i3;
        int i4 = i2 * 3;
        byte[] bArr = $$a;
        int i5 = s + 112;
        int i6 = i + 4;
        byte[] bArr2 = new byte[1 - i4];
        int i7 = 0 - i4;
        if (bArr == null) {
            int i8 = i6;
            int i9 = i7;
            i3 = 0;
            int i10 = i8;
            i5 = i6 + i9;
            i6 = i10;
            int i11 = i6 + 1;
            bArr2[i3] = (byte) i5;
            if (i3 == i7) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i3++;
            i9 = bArr[i11];
            int i12 = i5;
            i8 = i11;
            i6 = i12;
            int i102 = i8;
            i5 = i6 + i9;
            i6 = i102;
            int i112 = i6 + 1;
            bArr2[i3] = (byte) i5;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            int i1122 = i6 + 1;
            bArr2[i3] = (byte) i5;
            if (i3 == i7) {
            }
        }
    }

    /* synthetic */ getAllCmsDFormattedTransactionCredentials(byte b) {
        this();
    }

    @Override // com.payair.hce.getReasonCode
    public final com.payair.hce.transactionCanBeResumed valueOf() {
        DigitizedCardProfile = (valueOf + 79) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("䬊\ua7d4鉗贉", android.graphics.Color.argb(0, 0, 0, 0) + 60589, objArr);
        com.payair.hce.transactionCanBeResumed values2 = com.payair.hce.transactionCanBeResumed.values(((java.lang.String) objArr[0]).intern());
        int i = DigitizedCardProfile + 39;
        valueOf = i % 128;
        if (i % 2 == 0) {
            return values2;
        }
        throw new java.lang.ArithmeticException();
    }

    private getAllCmsDFormattedTransactionCredentials() {
    }

    @Override // com.payair.hce.getReasonCode
    public final void valueOf(com.payair.hce.transactionCanBeResumed transactioncanberesumed) throws com.payair.hce.postToastMessageOnUi {
        valueOf = (DigitizedCardProfile + 21) % 128;
        super.valueOf(transactioncanberesumed);
        super.AlternateContactlessPaymentDataJson(transactioncanberesumed.writeReplace());
        int i = DigitizedCardProfile + 113;
        valueOf = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        if (str != null) {
            $10 = ($11 + 79) % 128;
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
            int i2 = getdsrpdata.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[getdsrpdata.valueOf]), getdsrpdata, getdsrpdata};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2053068265);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 31, 1889 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 3599));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b(-1, 0, (short) 1, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2053068265, obj);
                }
                jArr[i2] = ((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue() ^ (values ^ (-4761752123935132024L));
                java.lang.Object[] objArr4 = {getdsrpdata, getdsrpdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(64 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 1443, (char) (29682 - android.graphics.Color.green(0)));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b(-1, 0, (short) 0, objArr5);
                    obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj2);
                }
                ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
                $11 = ($10 + 87) % 128;
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
            $10 = ($11 + 103) % 128;
            cArr3[getdsrpdata.valueOf] = (char) jArr[getdsrpdata.valueOf];
            java.lang.Object[] objArr6 = {getdsrpdata, getdsrpdata};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
            if (obj3 == null) {
                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 64, 1443 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (android.text.TextUtils.getOffsetAfter("", 0) + 29682));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                b(-1, 0, (short) 0, objArr7);
                obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        valueOf = 0;
        DigitizedCardProfile = 1;
        values = -2611608358956024393L;
    }

    static void init$0() {
        $$a = new byte[]{120, 91, -87, 14};
        $$b = 59;
    }
}
