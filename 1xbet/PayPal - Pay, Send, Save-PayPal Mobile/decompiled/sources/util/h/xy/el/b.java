package util.h.xy.el;

/* loaded from: classes5.dex */
public final class b {
    private static int Camera2StreamConfigurationMap = 0;
    private static long getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static char getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private static int getHighSpeedVideoSizesFor = 1;
    private static final java.math.BigInteger getInputFormats;
    private static final java.math.BigInteger getOutputFormats;
    private static int getOutputMinFrameDuration;
    private int getInputSizeshNQ4ISI;
    private byte[] getOutputMinFrameDurationlomOqCM;
    private boolean getOutputSizes;
    private final int getOutputSizeshNQ4ISI;
    private byte[] getOutputStallDuration;
    private byte[] getOutputStallDurationlomOqCM;
    private final util.h.xy.ef.me getValidOutputFormatsForInputhNQ4ISI;
    private byte[] toString;
    private int unwrapAs;

    private static void Camera2StreamConfigurationMap(java.lang.String str, char c, int i, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr) {
        Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 61) % 128;
        char[] charArray = str3.toCharArray();
        Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 75) % 128;
        char[] charArray2 = str2.toCharArray();
        int i2 = getHighSpeedVideoSizes + 111;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        char[] charArray3 = str.toCharArray();
        util.h.xz.b.rc rcVar = new util.h.xz.b.rc();
        int length = charArray2.length;
        char[] cArr = new char[length];
        int length2 = charArray.length;
        char[] cArr2 = new char[length2];
        java.lang.System.arraycopy(charArray2, 0, cArr, 0, length);
        java.lang.System.arraycopy(charArray, 0, cArr2, 0, length2);
        cArr[0] = (char) (cArr[0] ^ c);
        cArr2[2] = (char) (cArr2[2] + ((char) i));
        int length3 = charArray3.length;
        char[] cArr3 = new char[length3];
        rcVar.f2652 = 0;
        while (rcVar.f2652 < length3) {
            getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 7) % 128;
            int i3 = (rcVar.f2652 + 2) % 4;
            int i4 = (rcVar.f2652 + 3) % 4;
            rcVar.f2653 = (char) (((cArr[rcVar.f2652 % 4] * 32718) + cArr2[i3]) % 65535);
            cArr2[i4] = (char) (((cArr[i4] * 32718) + cArr2[i3]) / 65535);
            cArr[i4] = rcVar.f2653;
            cArr3[rcVar.f2652] = (char) ((((cArr[i4] ^ charArray3[rcVar.f2652]) ^ (getHighResolutionOutputSizeshNQ4ISI ^ 2457411417541981002L)) ^ ((int) (getOutputMinFrameDuration ^ 2457411417541981002L))) ^ ((char) (getHighSpeedVideoFpsRangesFor ^ 2457411417541981002L)));
            rcVar.f2652++;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static {
        getHighSpeedVideoSizes();
        getOutputFormats = java.math.BigInteger.valueOf(androidx.collection.SieveCacheKt.NodeLinkMask);
        getInputFormats = java.math.BigInteger.valueOf(2L);
        getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRanges + 105) % 128;
    }

    private void getHighResolutionOutputSizeshNQ4ISI() {
        if (this.getInputSizeshNQ4ISI == 0) {
            util.h.xy.ef.me meVar = this.getValidOutputFormatsForInputhNQ4ISI;
            byte[] bArr = this.getOutputStallDuration;
            meVar.mo26550(bArr, 0, bArr.length);
        } else {
            util.h.xy.ef.me meVar2 = this.getValidOutputFormatsForInputhNQ4ISI;
            byte[] bArr2 = this.getOutputMinFrameDurationlomOqCM;
            meVar2.mo26550(bArr2, 0, bArr2.length);
        }
        if (this.getOutputSizes) {
            int i = (this.getInputSizeshNQ4ISI / this.getOutputSizeshNQ4ISI) + 1;
            byte[] bArr3 = this.toString;
            int length = bArr3.length;
            if (length != 1) {
                if (length != 2) {
                    if (length != 3) {
                        if (length != 4) {
                            try {
                                java.lang.Object[] objArr = new java.lang.Object[1];
                                Camera2StreamConfigurationMap("艝鲷帡黧荒䙾䂊킨⾣毿\uec2b⍓㵲骳ﰔ湚\uf4d4ᎇᛨꑗ\udb79揋\ue634\uef49卍蓨佪욣ጋ", (char) (33952 - android.text.TextUtils.getOffsetBefore("", 0)), (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 722807673, "穥ᔫꀫ뢄", "墐ᑸ牧롮", objArr);
                                throw new java.lang.IllegalStateException(((java.lang.String) objArr[0]).intern());
                            } catch (java.lang.Throwable th) {
                                java.lang.Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        bArr3[0] = (byte) (i >>> 24);
                    }
                    bArr3[bArr3.length - 3] = (byte) (i >>> 16);
                }
                bArr3[bArr3.length - 2] = (byte) (i >>> 8);
            }
            bArr3[bArr3.length - 1] = (byte) i;
            this.getValidOutputFormatsForInputhNQ4ISI.mo26550(bArr3, 0, bArr3.length);
        }
        util.h.xy.ef.me meVar3 = this.getValidOutputFormatsForInputhNQ4ISI;
        byte[] bArr4 = this.getOutputStallDurationlomOqCM;
        meVar3.mo26550(bArr4, 0, bArr4.length);
        this.getValidOutputFormatsForInputhNQ4ISI.mo26548(this.getOutputMinFrameDurationlomOqCM, 0);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final int m26612(byte[] bArr, int i, int i2) throws util.h.xy.ef.mc, java.lang.IllegalArgumentException {
        int i3;
        int i4 = getHighSpeedVideoSizesFor + 85;
        int i5 = i4 % 128;
        getHighSpeedVideoFpsRanges = i5;
        if (i4 % 2 == 0 ? (i3 = this.getInputSizeshNQ4ISI + i2) >= 0 : (i3 = this.getInputSizeshNQ4ISI + i2) >= 0) {
            if (i3 < this.unwrapAs) {
                if (this.getInputSizeshNQ4ISI % this.getOutputSizeshNQ4ISI == 0) {
                    int i6 = i5 + 21;
                    getHighSpeedVideoSizesFor = i6 % 128;
                    getHighResolutionOutputSizeshNQ4ISI();
                    if (i6 % 2 == 0) {
                        throw null;
                    }
                }
                int i7 = this.getInputSizeshNQ4ISI;
                int i8 = this.getOutputSizeshNQ4ISI;
                int i9 = i7 % i8;
                int min = java.lang.Math.min(i8 - i9, i2);
                java.lang.System.arraycopy(this.getOutputMinFrameDurationlomOqCM, i9, bArr, i, min);
                this.getInputSizeshNQ4ISI += min;
                int i10 = i2 - min;
                int i11 = i + min;
                int i12 = getHighSpeedVideoFpsRanges + 115;
                getHighSpeedVideoSizesFor = i12 % 128;
                int i13 = i12 % 2;
                while (i10 > 0) {
                    getHighResolutionOutputSizeshNQ4ISI();
                    int min2 = java.lang.Math.min(this.getOutputSizeshNQ4ISI, i10);
                    java.lang.System.arraycopy(this.getOutputMinFrameDurationlomOqCM, 0, bArr, i11, min2);
                    this.getInputSizeshNQ4ISI += min2;
                    i10 -= min2;
                    i11 += min2;
                }
                return i2;
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap("\u2fed饸Ↄ㪠ὺᯑ㠷뻔\uebb1눍췑⟧턦偙萨理䵶얮է鱽㿪㵦៕ᣗ\ue432릹晲\uf0ac휪捙㻈襫鋀\udbe4儫䇂", (char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), android.text.TextUtils.getOffsetAfter("", 0), "ﵐ\ue204潋\ueb79", "墐ᑸ牧롮", objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(this.unwrapAs);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        Camera2StreamConfigurationMap("䚣쨑蜦唎枵Ⴒ", (char) (33148 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), android.view.KeyEvent.getMaxKeyCode() >> 16, "\ue02d붂䲟澁", "墐ᑸ牧롮", objArr2);
        sb.append(((java.lang.String) objArr2[0]).intern());
        throw new util.h.xy.ef.mc(sb.toString());
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m26613(util.h.xy.ef.rc rcVar) {
        if (!(rcVar instanceof util.h.xy.ep.rb)) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap("䵒桿Ⓕ\uf053ॵ嬸ꉔ⎾ﶉ\uf78d\uf0e8姅ᝈ鷟䈒끜୷Ⰰ㥚냮Ī鼶耕誀衩懧\ue7b7䵩թ", (char) (56943 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16)), (-89504616) - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), "頑ꩄ濺㧞", "墐ᑸ牧롮", objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        util.h.xy.ep.rb rbVar = (util.h.xy.ep.rb) rcVar;
        this.getValidOutputFormatsForInputhNQ4ISI.mo26546(new util.h.xy.ep.mc(rbVar.m26673()));
        this.getOutputStallDurationlomOqCM = rbVar.m26675();
        int m26676 = rbVar.m26676();
        this.toString = new byte[m26676 / 8];
        int i = Integer.MAX_VALUE;
        if (rbVar.m26677()) {
            java.math.BigInteger multiply = getInputFormats.pow(m26676).multiply(java.math.BigInteger.valueOf(this.getOutputSizeshNQ4ISI));
            if (multiply.compareTo(getOutputFormats) == 1) {
                getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizesFor + 91) % 128;
            } else {
                i = multiply.intValue();
                getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRanges + 89) % 128;
            }
        }
        this.unwrapAs = i;
        this.getOutputStallDuration = rbVar.m26674();
        this.getOutputSizes = rbVar.m26677();
        this.getInputSizeshNQ4ISI = 0;
    }

    public b(util.h.xy.ef.me meVar) {
        this.getValidOutputFormatsForInputhNQ4ISI = meVar;
        int mo26547 = meVar.mo26547();
        this.getOutputSizeshNQ4ISI = mo26547;
        this.getOutputMinFrameDurationlomOqCM = new byte[mo26547];
    }

    static void getHighSpeedVideoSizes() {
        getHighResolutionOutputSizeshNQ4ISI = -7317213817909515302L;
        getOutputMinFrameDuration = 294925130;
        getHighSpeedVideoFpsRangesFor = (char) 13130;
    }
}
