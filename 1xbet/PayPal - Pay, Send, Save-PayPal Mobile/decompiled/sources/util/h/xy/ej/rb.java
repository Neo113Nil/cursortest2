package util.h.xy.ej;

/* loaded from: classes18.dex */
public final class rb implements util.h.xy.ef.ma {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges;
    private static char[] getHighSpeedVideoFpsRangesFor;
    private static int getHighSpeedVideoSizes;
    private static char getHighSpeedVideoSizesFor;
    private static final java.math.BigInteger getInputFormats;
    private util.h.xy.ep.md getInputSizeshNQ4ISI;
    private java.security.SecureRandom getOutputFormats;
    private util.h.xy.ej.mc getOutputMinFrameDuration = new util.h.xy.ej.mc();

    private static void getHighSpeedVideoFpsRangesFor(byte b, java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2;
        int i3 = getHighResolutionOutputSizeshNQ4ISI + 59;
        getHighSpeedVideoSizes = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        char[] charArray = str.toCharArray();
        util.h.xz.b.mc mcVar = new util.h.xz.b.mc();
        char[] cArr = getHighSpeedVideoFpsRangesFor;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 111) % 128;
                cArr2[i4] = (char) (cArr[i4] ^ 4042185467053315654L);
            }
            cArr = cArr2;
        }
        char c = (char) (4042185467053315654L ^ getHighSpeedVideoSizesFor);
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr3[i2] = (char) (charArray[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 5) % 128;
            mcVar.f2638 = 0;
            while (mcVar.f2638 < i2) {
                mcVar.f2641 = charArray[mcVar.f2638];
                mcVar.f2636 = charArray[mcVar.f2638 + 1];
                if (mcVar.f2641 == mcVar.f2636) {
                    cArr3[mcVar.f2638] = (char) (mcVar.f2641 - b);
                    cArr3[mcVar.f2638 + 1] = (char) (mcVar.f2636 - b);
                } else {
                    mcVar.f2639 = mcVar.f2641 / c;
                    mcVar.f2640 = mcVar.f2641 % c;
                    mcVar.f2637 = mcVar.f2636 / c;
                    mcVar.f2635 = mcVar.f2636 % c;
                    if (mcVar.f2640 == mcVar.f2635) {
                        mcVar.f2639 = ((mcVar.f2639 + c) - 1) % c;
                        mcVar.f2637 = ((mcVar.f2637 + c) - 1) % c;
                        int i5 = mcVar.f2639;
                        int i6 = mcVar.f2640;
                        int i7 = mcVar.f2637;
                        int i8 = mcVar.f2635;
                        cArr3[mcVar.f2638] = cArr[(i5 * c) + i6];
                        cArr3[mcVar.f2638 + 1] = cArr[(i7 * c) + i8];
                        getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 119) % 128;
                    } else if (mcVar.f2639 == mcVar.f2637) {
                        getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 105) % 128;
                        mcVar.f2640 = ((mcVar.f2640 + c) - 1) % c;
                        mcVar.f2635 = ((mcVar.f2635 + c) - 1) % c;
                        int i9 = mcVar.f2639;
                        int i10 = mcVar.f2640;
                        int i11 = mcVar.f2637;
                        int i12 = mcVar.f2635;
                        cArr3[mcVar.f2638] = cArr[(i9 * c) + i10];
                        cArr3[mcVar.f2638 + 1] = cArr[(i11 * c) + i12];
                    } else {
                        int i13 = mcVar.f2639;
                        int i14 = mcVar.f2635;
                        int i15 = mcVar.f2637;
                        int i16 = mcVar.f2640;
                        cArr3[mcVar.f2638] = cArr[(i13 * c) + i14];
                        cArr3[mcVar.f2638 + 1] = cArr[(i15 * c) + i16];
                    }
                }
                mcVar.f2638 += 2;
            }
        }
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 17) % 128;
        for (int i17 = 0; i17 < i; i17++) {
            cArr3[i17] = (char) (cArr3[i17] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static {
        getHighSpeedVideoSizes();
        getInputFormats = java.math.BigInteger.valueOf(1L);
        int i = Camera2StreamConfigurationMap + 111;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    @Override // util.h.xy.ef.ma
    /* renamed from: ᐝ */
    public final byte[] mo26545(byte[] bArr, int i, int i2) {
        java.math.BigInteger highResolutionOutputSizeshNQ4ISI;
        byte[] bArr2;
        util.h.xy.ep.re reVar;
        java.math.BigInteger m26681;
        if (this.getInputSizeshNQ4ISI == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((byte) (77 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)), "\u0006\u0003\n\u000e\u0000\u0017\u0013\u0011\u0017\u0000\n\u0017\u0007\u0014\u000b\u0012\u0015\u000f\u0015\u0011\u0001\f\u0011\u000f\u0000\u0012", 26 - android.graphics.Color.alpha(0), objArr);
            throw new java.lang.IllegalStateException(((java.lang.String) objArr[0]).intern());
        }
        java.math.BigInteger highResolutionOutputSizeshNQ4ISI2 = this.getOutputMinFrameDuration.getHighResolutionOutputSizeshNQ4ISI(bArr, i, i2);
        util.h.xy.ep.md mdVar = this.getInputSizeshNQ4ISI;
        if (!(mdVar instanceof util.h.xy.ep.re) || (m26681 = (reVar = (util.h.xy.ep.re) mdVar).m26681()) == null) {
            highResolutionOutputSizeshNQ4ISI = this.getOutputMinFrameDuration.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI2);
        } else {
            java.math.BigInteger m26664 = reVar.m26664();
            java.math.BigInteger bigInteger = getInputFormats;
            java.math.BigInteger m26835 = util.h.xy.fb.mb.m26835(bigInteger, m26664.subtract(bigInteger), this.getOutputFormats);
            highResolutionOutputSizeshNQ4ISI = this.getOutputMinFrameDuration.getHighResolutionOutputSizeshNQ4ISI(m26835.modPow(m26681, m26664).multiply(highResolutionOutputSizeshNQ4ISI2).mod(m26664)).multiply(util.h.xy.fb.mb.m26834(m26664, m26835)).mod(m26664);
            if (!highResolutionOutputSizeshNQ4ISI2.equals(highResolutionOutputSizeshNQ4ISI.modPow(m26681, m26664))) {
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor((byte) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 83), "\u0006\u0003\n\u000e\u0000\u0017\u0013\u0011\u0017\u0000\u000b\b\u0004\u0007\f\u0015\u0003\u0012\u0012\u0000\t\u0016\u0018\u0003\u0015\u0011\n\u0000\u000e\u000f\u0011\u0013\u0015\u000f\u0017\u000f\n\u0012\u0002\u0017\u0002\b\u0017\u0002㙑", (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) + 45, objArr2);
                    throw new java.lang.IllegalStateException(((java.lang.String) objArr2[0]).intern());
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
        }
        util.h.xy.ej.mc mcVar = this.getOutputMinFrameDuration;
        byte[] byteArray = highResolutionOutputSizeshNQ4ISI.toByteArray();
        if (mcVar.getHighSpeedVideoFpsRanges) {
            if (byteArray[0] == 0 && byteArray.length > mcVar.getHighResolutionOutputSizeshNQ4ISI()) {
                util.h.xy.ej.mc.getHighSpeedVideoSizes = (util.h.xy.ej.mc.getHighSpeedVideoFpsRangesFor + 7) % 128;
                int length = byteArray.length - 1;
                byte[] bArr3 = new byte[length];
                java.lang.System.arraycopy(byteArray, 1, bArr3, 0, length);
                return bArr3;
            }
            if (byteArray.length >= mcVar.getHighResolutionOutputSizeshNQ4ISI()) {
                return byteArray;
            }
            util.h.xy.ej.mc.getHighSpeedVideoFpsRangesFor = (util.h.xy.ej.mc.getHighSpeedVideoSizes + 45) % 128;
            int highResolutionOutputSizeshNQ4ISI3 = mcVar.getHighResolutionOutputSizeshNQ4ISI();
            byte[] bArr4 = new byte[highResolutionOutputSizeshNQ4ISI3];
            java.lang.System.arraycopy(byteArray, 0, bArr4, highResolutionOutputSizeshNQ4ISI3 - byteArray.length, byteArray.length);
            return bArr4;
        }
        if (byteArray[0] == 0) {
            int i3 = util.h.xy.ej.mc.getHighSpeedVideoFpsRangesFor + 83;
            util.h.xy.ej.mc.getHighSpeedVideoSizes = i3 % 128;
            int length2 = byteArray.length;
            if (i3 % 2 != 0) {
                int i4 = length2 >>> 1;
                bArr2 = new byte[i4];
                java.lang.System.arraycopy(byteArray, 0, bArr2, 0, i4);
            } else {
                int i5 = length2 - 1;
                byte[] bArr5 = new byte[i5];
                java.lang.System.arraycopy(byteArray, 1, bArr5, 0, i5);
                bArr2 = bArr5;
            }
        } else {
            int length3 = byteArray.length;
            bArr2 = new byte[length3];
            java.lang.System.arraycopy(byteArray, 0, bArr2, 0, length3);
        }
        util.h.xy.fb.a.m26826(byteArray, (byte) 0);
        return bArr2;
    }

    @Override // util.h.xy.ef.ma
    /* renamed from: ᐝ */
    public final int mo26544() {
        int i = getHighSpeedVideoFpsRanges + 35;
        Camera2StreamConfigurationMap = i % 128;
        util.h.xy.ej.mc mcVar = this.getOutputMinFrameDuration;
        if (i % 2 != 0) {
            return mcVar.getHighResolutionOutputSizeshNQ4ISI();
        }
        mcVar.getHighResolutionOutputSizeshNQ4ISI();
        throw null;
    }

    @Override // util.h.xy.ef.ma
    /* renamed from: ˊ */
    public final int mo26542() {
        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 111) % 128;
        int highSpeedVideoFpsRanges = this.getOutputMinFrameDuration.getHighSpeedVideoFpsRanges();
        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 27) % 128;
        return highSpeedVideoFpsRanges;
    }

    @Override // util.h.xy.ef.ma
    /* renamed from: ˊ */
    public final void mo26543(boolean z, util.h.xy.ef.mb mbVar) {
        util.h.xy.ej.mc mcVar = this.getOutputMinFrameDuration;
        boolean z2 = mbVar instanceof util.h.xy.ep.me;
        if (z2) {
            int i = util.h.xy.ej.mc.getHighSpeedVideoFpsRangesFor + 87;
            util.h.xy.ej.mc.getHighSpeedVideoSizes = i % 128;
            util.h.xy.ep.me meVar = (util.h.xy.ep.me) mbVar;
            if (i % 2 != 0) {
                mcVar.Camera2StreamConfigurationMap = (util.h.xy.ep.md) meVar.m26666();
                throw null;
            }
            mcVar.Camera2StreamConfigurationMap = (util.h.xy.ep.md) meVar.m26666();
        } else {
            mcVar.Camera2StreamConfigurationMap = (util.h.xy.ep.md) mbVar;
            util.h.xy.ej.mc.getHighSpeedVideoSizes = (util.h.xy.ej.mc.getHighSpeedVideoFpsRangesFor + 41) % 128;
        }
        mcVar.getHighSpeedVideoFpsRanges = z;
        if (!z2) {
            util.h.xy.ep.md mdVar = (util.h.xy.ep.md) mbVar;
            this.getInputSizeshNQ4ISI = mdVar;
            if (!(mdVar instanceof util.h.xy.ep.re)) {
                this.getOutputFormats = null;
                return;
            } else {
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 53) % 128;
                this.getOutputFormats = util.h.xy.ef.rb.m26558();
                return;
            }
        }
        int i2 = getHighSpeedVideoFpsRanges + 1;
        Camera2StreamConfigurationMap = i2 % 128;
        util.h.xy.ep.me meVar2 = (util.h.xy.ep.me) mbVar;
        if (i2 % 2 == 0) {
            this.getInputSizeshNQ4ISI = (util.h.xy.ep.md) meVar2.m26666();
            throw new java.lang.ArithmeticException();
        }
        util.h.xy.ep.md mdVar2 = (util.h.xy.ep.md) meVar2.m26666();
        this.getInputSizeshNQ4ISI = mdVar2;
        if (mdVar2 instanceof util.h.xy.ep.re) {
            this.getOutputFormats = meVar2.m26667();
        } else {
            this.getOutputFormats = null;
        }
        int i3 = getHighSpeedVideoFpsRanges + 55;
        Camera2StreamConfigurationMap = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 3 / 3;
        }
    }

    static void getHighSpeedVideoSizes() {
        getHighSpeedVideoFpsRangesFor = new char[]{38471, 41871, 41917, 41913, 41900, 41907, 41914, 41919, 41870, 41897, 41971, 41904, 38466, 41980, 41885, 41912, 41909, 38468, 41915, 41903, 41906, 38469, 41896, 41893, 41902};
        getHighSpeedVideoSizesFor = (char) 38467;
    }
}
