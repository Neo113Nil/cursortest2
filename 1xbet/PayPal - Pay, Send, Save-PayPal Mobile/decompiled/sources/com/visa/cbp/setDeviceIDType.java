package com.visa.cbp;

/* loaded from: classes16.dex */
public class setDeviceIDType {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static long getHighSpeedVideoSizes = -7913771781840578192L;
    private byte getHighSpeedVideoSizesFor;
    private byte[] getInputFormats;
    private byte getInputSizeshNQ4ISI;
    private byte getOutputFormats;
    private short getOutputMinFrameDuration;
    private short getOutputMinFrameDurationlomOqCM;
    private int getOutputSizeshNQ4ISI;
    private byte getOutputStallDuration;

    public int BuildConfig() {
        int i = Camera2StreamConfigurationMap + 97;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            return this.getOutputSizeshNQ4ISI;
        }
        throw null;
    }

    public void ReplenishAckRequest(int i) {
        int i2 = Camera2StreamConfigurationMap + 41;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        this.getOutputSizeshNQ4ISI = i;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public byte ConfirmReplenishRequest() {
        int i = Camera2StreamConfigurationMap + 105;
        getHighSpeedVideoFpsRangesFor = i % 128;
        byte b = this.getHighSpeedVideoSizesFor;
        if (i % 2 == 0) {
            return b;
        }
        throw new java.lang.ArithmeticException();
    }

    public void ConfirmReplenishRequest(byte b) {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = i + 73;
        Camera2StreamConfigurationMap = i2 % 128;
        this.getHighSpeedVideoSizesFor = b;
        if (i2 % 2 == 0) {
            throw null;
        }
        Camera2StreamConfigurationMap = (i + 47) % 128;
    }

    public byte ReplenishAckRequest() {
        int i = Camera2StreamConfigurationMap;
        int i2 = i + 23;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        byte b = this.getOutputStallDuration;
        int i3 = i + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        if (i3 % 2 == 0) {
            return b;
        }
        throw new java.lang.ArithmeticException();
    }

    public void values(byte b) {
        int i = getHighSpeedVideoFpsRangesFor + 107;
        Camera2StreamConfigurationMap = i % 128;
        this.getOutputStallDuration = b;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    public byte valueOf() {
        int i = (Camera2StreamConfigurationMap + 13) % 128;
        getHighSpeedVideoFpsRangesFor = i;
        byte b = this.getInputSizeshNQ4ISI;
        Camera2StreamConfigurationMap = (i + 95) % 128;
        return b;
    }

    public void ReplenishAckRequest(byte b) {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = i + 13;
        Camera2StreamConfigurationMap = i2 % 128;
        this.getInputSizeshNQ4ISI = b;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = i + 39;
        Camera2StreamConfigurationMap = i3 % 128;
        if (i3 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    public short values() {
        int i = Camera2StreamConfigurationMap;
        int i2 = i + 23;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        short s = this.getOutputMinFrameDuration;
        int i3 = i + 21;
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        if (i3 % 2 == 0) {
            return s;
        }
        throw null;
    }

    public void values(short s) {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRangesFor = (i + 75) % 128;
        this.getOutputMinFrameDuration = s;
        int i2 = i + 1;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public byte setTvls() {
        int i = getHighSpeedVideoFpsRangesFor + 53;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            return this.getOutputFormats;
        }
        throw null;
    }

    public void BuildConfig(byte b) {
        int i = Camera2StreamConfigurationMap + 13;
        getHighSpeedVideoFpsRangesFor = i % 128;
        this.getOutputFormats = b;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    public short getTvls() {
        int i = (getHighSpeedVideoFpsRangesFor + 13) % 128;
        Camera2StreamConfigurationMap = i;
        short s = this.getOutputMinFrameDurationlomOqCM;
        getHighSpeedVideoFpsRangesFor = (i + 95) % 128;
        return s;
    }

    public void valueOf(short s) {
        int i = getHighSpeedVideoFpsRangesFor;
        Camera2StreamConfigurationMap = (i + 21) % 128;
        this.getOutputMinFrameDurationlomOqCM = s;
        Camera2StreamConfigurationMap = (i + 37) % 128;
    }

    public byte[] getTokenInfo() {
        int i = getHighSpeedVideoFpsRangesFor + 89;
        Camera2StreamConfigurationMap = i % 128;
        byte[] bArr = this.getInputFormats;
        if (i % 2 != 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    public void valueOf(byte[] bArr) {
        int i = getHighSpeedVideoFpsRangesFor;
        Camera2StreamConfigurationMap = (i + 111) % 128;
        this.getInputFormats = bArr;
        Camera2StreamConfigurationMap = (i + 99) % 128;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes("ፘ媌胳칵㑚", android.widget.ExpandableListView.getPackedPositionType(0L) + 18899, objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(this.getOutputSizeshNQ4ISI);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoSizes("ፊ\u1759ᯄᾴɩۜઘൺㄝ㖵㡡㰗\u20cd⭓⼂古垣婽庂䋋", ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 1103, objArr2);
        sb.append(((java.lang.String) objArr2[0]).intern());
        sb.append((int) this.getHighSpeedVideoSizesFor);
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoSizes("ፊӿ㲗哩䳳擟鰓됏갗쐽ﰌ", android.view.KeyEvent.getDeadChar(0, 0) + 6121, objArr3);
        sb.append(((java.lang.String) objArr3[0]).intern());
        sb.append((int) this.getOutputStallDuration);
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighSpeedVideoSizes("ፊ㴗佇饑ꭓ\uf557ݢ兔捝贅\udf1c", 11777 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr4);
        sb.append(((java.lang.String) objArr4[0]).intern());
        sb.append((int) this.getInputSizeshNQ4ISI);
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        getHighSpeedVideoSizes("ፊ穙쇛⢿뙫ᷙ撣\uf279夨ꂂๅ锧ﲸ䨕", 26960 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr5);
        sb.append(((java.lang.String) objArr5[0]).intern());
        sb.append((int) this.getOutputMinFrameDuration);
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        getHighSpeedVideoSizes("ፊ삑둋槇嵋㋱\ue650\udbe2轠糮倄֓菱껍", 54150 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr6);
        sb.append(((java.lang.String) objArr6[0]).intern());
        sb.append((int) this.getOutputFormats);
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        getHighSpeedVideoSizes("ፊᗡẻ\u07b2࢘ㆡ㪝⎃⓯ⷖ囶忍䃑䧘狀筵籦", (android.os.Process.myTid() >> 22) + 1783, objArr7);
        sb.append(((java.lang.String) objArr7[0]).intern());
        sb.append((int) this.getOutputMinFrameDurationlomOqCM);
        java.lang.Object[] objArr8 = new java.lang.Object[1];
        getHighSpeedVideoSizes("ፊ浑\uefdc榆\uea49搼\ue6f1悦\ue162挠ﶊ繞\uf806竮\uf4a6畦\uf736燵\uf3a7䰷컛䢑쥍䭭얾", 32327 - (android.os.Process.myTid() >> 22), objArr8);
        sb.append(((java.lang.String) objArr8[0]).intern());
        sb.append(this.getInputFormats);
        java.lang.String obj = sb.toString();
        int i = Camera2StreamConfigurationMap + 49;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            return obj;
        }
        throw null;
    }

    private static void getHighSpeedVideoSizes(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 91;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        char[] charArray = str.toCharArray();
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 115) % 128;
        char[] cArr = charArray;
        com.visa.cbp.getMac getmac = new com.visa.cbp.getMac();
        getmac.valueOf = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getmac.ReplenishAckRequest = 0;
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 87) % 128;
        while (getmac.ReplenishAckRequest < cArr.length) {
            getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 83) % 128;
            int i3 = getmac.ReplenishAckRequest;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[getmac.ReplenishAckRequest]), getmac, getmac};
                java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1810087414);
                if (obj == null) {
                    obj = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (59971 - android.view.View.resolveSizeAndState(0, 0, 0)), 1741 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 40)).getMethod("x", java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1810087414, obj);
                }
                jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue() ^ (getHighSpeedVideoSizes ^ 7797973607618693702L);
                try {
                    java.lang.Object[] objArr3 = {getmac, getmac};
                    java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(2107890674);
                    if (obj2 == null) {
                        obj2 = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), 1837 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 25 - ((android.os.Process.getThreadPriority(0) + 20) >> 6))).getMethod("w", java.lang.Object.class, java.lang.Object.class);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(2107890674, obj2);
                    }
                    ((java.lang.reflect.Method) obj2).invoke(null, objArr3);
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
        char[] cArr2 = new char[length];
        getmac.ReplenishAckRequest = 0;
        int i4 = getHighResolutionOutputSizeshNQ4ISI + 125;
        getHighSpeedVideoFpsRanges = i4 % 128;
        int i5 = i4 % 2;
        while (getmac.ReplenishAckRequest < cArr.length) {
            cArr2[getmac.ReplenishAckRequest] = (char) jArr[getmac.ReplenishAckRequest];
            try {
                java.lang.Object[] objArr4 = {getmac, getmac};
                java.lang.Object obj3 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(2107890674);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1), android.text.TextUtils.getCapsMode("", 0, 0) + 1837, 24 - android.graphics.ImageFormat.getBitsPerPixel(0))).getMethod("w", java.lang.Object.class, java.lang.Object.class);
                    com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(2107890674, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr4);
            } catch (java.lang.Throwable th3) {
                java.lang.Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        objArr[0] = new java.lang.String(cArr2);
    }
}
