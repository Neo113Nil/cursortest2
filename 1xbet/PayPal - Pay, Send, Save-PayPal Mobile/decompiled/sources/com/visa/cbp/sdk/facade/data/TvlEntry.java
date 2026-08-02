package com.visa.cbp.sdk.facade.data;

/* loaded from: classes5.dex */
public class TvlEntry {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int ConfirmReplenishRequest;
    private static int[] ReplenishAckRequest;
    private static int valueOf;
    private int atc;
    private java.lang.String cryptogram;
    private long timeStamp;
    private java.lang.String transactionType;
    private java.lang.String unpredictableNumber;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, short s, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4 = i * 4;
        int i5 = 4 - (i2 * 4);
        int i6 = 103 - s;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i7 = i5;
            int i8 = 0;
            i6 += i5;
            i5 = i7 + 1;
            i3 = i8;
            bArr2[i3] = (byte) i6;
            if (i3 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i9 = i3 + 1;
            i7 = i5;
            i5 = bArr[i5];
            i8 = i9;
            i6 += i5;
            i5 = i7 + 1;
            i3 = i8;
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

    public long getTimeStamp() {
        int i = (ConfirmReplenishRequest + 7) % 128;
        valueOf = i;
        long j = this.timeStamp;
        ConfirmReplenishRequest = (i + 43) % 128;
        return j;
    }

    public void setTimeStamp(long j) {
        int i = ConfirmReplenishRequest;
        valueOf = (i + 91) % 128;
        this.timeStamp = j;
        int i2 = i + 35;
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    public java.lang.String getUnpredictableNumber() {
        int i = ConfirmReplenishRequest;
        int i2 = i + 83;
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        java.lang.String str = this.unpredictableNumber;
        valueOf = (i + 89) % 128;
        return str;
    }

    public void setUnpredictableNumber(java.lang.String str) {
        int i = valueOf;
        ConfirmReplenishRequest = (i + 43) % 128;
        this.unpredictableNumber = str;
        ConfirmReplenishRequest = (i + 71) % 128;
    }

    public int getAtc() {
        int i = ConfirmReplenishRequest;
        int i2 = i + 99;
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = this.atc;
        valueOf = (i + 11) % 128;
        return i3;
    }

    public void setAtc(int i) {
        int i2 = valueOf;
        ConfirmReplenishRequest = (i2 + 19) % 128;
        this.atc = i;
        ConfirmReplenishRequest = (i2 + 97) % 128;
    }

    public java.lang.String getTransactionType() {
        int i = valueOf + 115;
        int i2 = i % 128;
        ConfirmReplenishRequest = i2;
        if (i % 2 != 0) {
            throw null;
        }
        java.lang.String str = this.transactionType;
        int i3 = i2 + 111;
        valueOf = i3 % 128;
        if (i3 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public void setTransactionType(java.lang.String str) {
        int i = ConfirmReplenishRequest;
        valueOf = (i + 63) % 128;
        this.transactionType = str;
        valueOf = (i + 97) % 128;
    }

    public java.lang.String getCryptogram() {
        int i = ConfirmReplenishRequest;
        valueOf = (i + 79) % 128;
        java.lang.String str = this.cryptogram;
        int i2 = i + 83;
        valueOf = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public void setCryptogram(java.lang.String str) {
        int i = valueOf + 65;
        int i2 = i % 128;
        ConfirmReplenishRequest = i2;
        this.cryptogram = str;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        valueOf = (i2 + 21) % 128;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(new int[]{-121057149, -647173214, -871862467, 1662842164, 994365772, 1289723540}, 10 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(this.timeStamp);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(new int[]{1890656198, -2069839064, -1424073517, -1886989484, -1258355480, -177676093, 1096379060, -681668874, -247347986, 1158658397, 620330730, 1116012378}, 23 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr2);
        sb.append(((java.lang.String) objArr2[0]).intern());
        sb.append(this.unpredictableNumber);
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a(new int[]{893210843, 1199310179, -523644158, -146724378}, (-16777208) - android.graphics.Color.rgb(0, 0, 0), objArr3);
        sb.append(((java.lang.String) objArr3[0]).intern());
        sb.append(this.atc);
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a(new int[]{1829334303, -1084632726, 1139107977, -196297245, -682395209, -511462246, -1031561090, -358275888, 1324046212, 293309293}, android.view.Gravity.getAbsoluteGravity(0, 0) + 20, objArr4);
        sb.append(((java.lang.String) objArr4[0]).intern());
        sb.append(this.transactionType);
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        a(new int[]{987151082, 903331499, 539387112, 873277553, -720677242, -386752759, -2022174943, -1034338152}, 15 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), objArr5);
        sb.append(((java.lang.String) objArr5[0]).intern());
        sb.append(this.cryptogram);
        java.lang.String obj = sb.toString();
        valueOf = (ConfirmReplenishRequest + 87) % 128;
        return obj;
    }

    public java.lang.String getTvlLogString() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(new int[]{-1876974370, 619684095}, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.timeStamp);
        sb.append(intern);
        sb.append(this.unpredictableNumber);
        sb.append(intern);
        sb.append(this.atc);
        sb.append(intern);
        sb.append(this.transactionType);
        java.lang.String obj = sb.toString();
        valueOf = (ConfirmReplenishRequest + 5) % 128;
        return obj;
    }

    private static void a(int[] iArr, int i, java.lang.Object[] objArr) {
        int[] iArr2;
        com.visa.cbp.getTokenInfo gettokeninfo = new com.visa.cbp.getTokenInfo();
        char[] cArr = new char[4];
        short s = 2;
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = ReplenishAckRequest;
        int i2 = 16;
        int i3 = 1;
        int i4 = 0;
        if (iArr3 != null) {
            $10 = ($11 + 47) % 128;
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int i5 = 0;
            while (i5 < length) {
                int i6 = $10 + 117;
                $11 = i6 % 128;
                if (i6 % s == 0) {
                    try {
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        objArr2[i4] = java.lang.Integer.valueOf(iArr3[i5]);
                        java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(785952856);
                        if (obj == null) {
                            java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ((android.view.ViewConfiguration.getJumpTapTimeout() >> i2) + 59818), android.view.View.MeasureSpec.makeMeasureSpec(i4, i4) + 999, android.graphics.Color.blue(i4) + 35);
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            b(0, s, 0, objArr3);
                            obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                            com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(785952856, obj);
                        }
                        iArr4[i5] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(iArr3[i5])};
                        java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(785952856);
                        if (obj2 == null) {
                            java.lang.Class cls2 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (59817 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1000, (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 35);
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            b(0, (short) 2, 0, objArr5);
                            obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
                            com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(785952856, obj2);
                        }
                        iArr4[i5] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).intValue();
                        i5++;
                    } catch (java.lang.Throwable th2) {
                        java.lang.Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i4 = 0;
                s = 2;
                i2 = 16;
            }
            iArr3 = iArr4;
        }
        int length2 = iArr3.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = ReplenishAckRequest;
        if (iArr6 != null) {
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i7 = 0;
            while (i7 < length3) {
                try {
                    java.lang.Object[] objArr6 = new java.lang.Object[i3];
                    objArr6[0] = java.lang.Integer.valueOf(iArr6[i7]);
                    java.lang.Object obj3 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(785952856);
                    if (obj3 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (59817 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), 1000 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), android.text.TextUtils.getOffsetAfter("", 0) + 35);
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        iArr2 = iArr6;
                        b(0, (short) 2, 0, objArr7);
                        obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(785952856, obj3);
                    } else {
                        iArr2 = iArr6;
                    }
                    iArr7[i7] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).intValue();
                    i7++;
                    $10 = ($11 + 99) % 128;
                    iArr6 = iArr2;
                    i3 = 1;
                } catch (java.lang.Throwable th3) {
                    java.lang.Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            iArr6 = iArr7;
        }
        char c = 0;
        java.lang.System.arraycopy(iArr6, 0, iArr5, 0, length2);
        gettokeninfo.valueOf = 0;
        while (gettokeninfo.valueOf < iArr.length) {
            cArr[c] = (char) (iArr[gettokeninfo.valueOf] >> 16);
            cArr[1] = (char) iArr[gettokeninfo.valueOf];
            cArr[2] = (char) (iArr[gettokeninfo.valueOf + 1] >> 16);
            cArr[3] = (char) iArr[gettokeninfo.valueOf + 1];
            gettokeninfo.BuildConfig = (cArr[0] << 16) + cArr[1];
            gettokeninfo.ReplenishAckRequest = (cArr[2] << 16) + cArr[3];
            com.visa.cbp.getTokenInfo.BuildConfig(iArr5);
            int i8 = 0;
            for (int i9 = 16; i8 < i9; i9 = 16) {
                $10 = ($11 + 15) % 128;
                gettokeninfo.BuildConfig ^= iArr5[i8];
                try {
                    java.lang.Object[] objArr8 = {gettokeninfo, java.lang.Integer.valueOf(com.visa.cbp.getTokenInfo.ReplenishAckRequest(gettokeninfo.BuildConfig)), gettokeninfo, gettokeninfo};
                    java.lang.Object obj4 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-206949328);
                    if (obj4 == null) {
                        java.lang.Class cls4 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 680, android.graphics.Color.blue(0) + 35);
                        java.lang.Object[] objArr9 = new java.lang.Object[1];
                        b(0, (short) 1, 0, objArr9);
                        obj4 = cls4.getMethod((java.lang.String) objArr9[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-206949328, obj4);
                    }
                    int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr8)).intValue();
                    gettokeninfo.BuildConfig = gettokeninfo.ReplenishAckRequest;
                    gettokeninfo.ReplenishAckRequest = intValue;
                    i8++;
                } catch (java.lang.Throwable th4) {
                    java.lang.Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
            int i10 = gettokeninfo.BuildConfig;
            gettokeninfo.BuildConfig = gettokeninfo.ReplenishAckRequest;
            gettokeninfo.ReplenishAckRequest = i10;
            gettokeninfo.ReplenishAckRequest ^= iArr5[16];
            gettokeninfo.BuildConfig ^= iArr5[17];
            int i11 = gettokeninfo.BuildConfig;
            int i12 = gettokeninfo.ReplenishAckRequest;
            cArr[0] = (char) (gettokeninfo.BuildConfig >>> 16);
            cArr[1] = (char) gettokeninfo.BuildConfig;
            cArr[2] = (char) (gettokeninfo.ReplenishAckRequest >>> 16);
            cArr[3] = (char) gettokeninfo.ReplenishAckRequest;
            com.visa.cbp.getTokenInfo.BuildConfig(iArr5);
            cArr2[gettokeninfo.valueOf * 2] = cArr[0];
            cArr2[(gettokeninfo.valueOf * 2) + 1] = cArr[1];
            cArr2[(gettokeninfo.valueOf * 2) + 2] = cArr[2];
            cArr2[(gettokeninfo.valueOf * 2) + 3] = cArr[3];
            try {
                java.lang.Object[] objArr10 = {gettokeninfo, gettokeninfo};
                java.lang.Object obj5 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-1626240057);
                if (obj5 == null) {
                    java.lang.Class cls5 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 567 - android.view.KeyEvent.normalizeMetaState(0), 32 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    b(0, (short) 0, 0, objArr11);
                    obj5 = cls5.getMethod((java.lang.String) objArr11[0], java.lang.Object.class, java.lang.Object.class);
                    com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-1626240057, obj5);
                }
                ((java.lang.reflect.Method) obj5).invoke(null, objArr10);
                c = 0;
            } catch (java.lang.Throwable th5) {
                java.lang.Throwable cause5 = th5.getCause();
                if (cause5 == null) {
                    throw th5;
                }
                throw cause5;
            }
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    static void init$0() {
        $$a = new byte[]{4, Byte.MAX_VALUE, -21, 81};
        $$b = 149;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ConfirmReplenishRequest = 0;
        valueOf = 1;
        ReplenishAckRequest = new int[]{1994159704, -651002022, -1387398854, -893816663, 144348606, 1811602870, 13225334, -91663760, 429747659, -1015221551, 1550149696, -1998661716, -740266565, -1389889671, 434437128, 1011912949, 1045262104, -14625540};
    }
}
