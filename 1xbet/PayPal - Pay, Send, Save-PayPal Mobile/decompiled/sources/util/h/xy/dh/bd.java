package util.h.xy.dh;

/* loaded from: classes5.dex */
final class bd extends util.h.xy.dh.l {
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoSizes = 0;
    private static char[] getHighSpeedVideoSizesFor = {41907, 41970, 41871, 41919, 41912, 41917, 41885, 41904, 41914, 41979, 41913, 41980, 41906, 41902, 41896, 41031, 41915, 41897, 41958, 41905, 41918, 41965, 41916, 41874, 41030};
    private static char getInputFormats = 38467;
    private static int getInputSizeshNQ4ISI = 1;
    private byte[] getOutputFormats;

    private static void getHighResolutionOutputSizeshNQ4ISI(byte b, java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2;
        char[] charArray = str.toCharArray();
        util.h.xz.b.mc mcVar = new util.h.xz.b.mc();
        char[] cArr = getHighSpeedVideoSizesFor;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 103) % 128;
                cArr2[i3] = (char) (cArr[i3] ^ 4042185467053315654L);
            }
            cArr = cArr2;
        }
        char c = (char) (4042185467053315654L ^ getInputFormats);
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 109) % 128;
            i2 = i - 1;
            cArr3[i2] = (char) (charArray[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
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
                        int i4 = mcVar.f2639;
                        int i5 = mcVar.f2640;
                        int i6 = mcVar.f2637;
                        int i7 = mcVar.f2635;
                        cArr3[mcVar.f2638] = cArr[(i4 * c) + i5];
                        cArr3[mcVar.f2638 + 1] = cArr[(i6 * c) + i7];
                    } else if (mcVar.f2639 == mcVar.f2637) {
                        mcVar.f2640 = ((mcVar.f2640 + c) - 1) % c;
                        mcVar.f2635 = ((mcVar.f2635 + c) - 1) % c;
                        int i8 = mcVar.f2639;
                        int i9 = mcVar.f2640;
                        int i10 = mcVar.f2637;
                        int i11 = mcVar.f2635;
                        cArr3[mcVar.f2638] = cArr[(i8 * c) + i9];
                        cArr3[mcVar.f2638 + 1] = cArr[(i10 * c) + i11];
                    } else {
                        int i12 = mcVar.f2639;
                        int i13 = mcVar.f2635;
                        int i14 = mcVar.f2637;
                        int i15 = mcVar.f2640;
                        cArr3[mcVar.f2638] = cArr[(i12 * c) + i13];
                        cArr3[mcVar.f2638 + 1] = cArr[(i14 * c) + i15];
                    }
                }
                mcVar.f2638 += 2;
            }
        }
        for (int i16 = 0; i16 < i; i16++) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 57) % 128;
            cArr3[i16] = (char) (cArr3[i16] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    private byte[] getOutputStallDurationlomOqCM() {
        byte[] bArr;
        synchronized (this) {
            int i = getHighSpeedVideoSizes + 85;
            getInputSizeshNQ4ISI = i % 128;
            if (i % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            bArr = this.getOutputFormats;
        }
        return bArr;
    }

    private void getOutputMinFrameDurationlomOqCM() {
        synchronized (this) {
            getInputSizeshNQ4ISI = (getHighSpeedVideoSizes + 91) % 128;
            if (this.getOutputFormats != null) {
                util.h.xy.dh.mf mfVar = new util.h.xy.dh.mf(this.getOutputFormats, true);
                try {
                    util.h.xy.dh.d Camera2StreamConfigurationMap = mfVar.Camera2StreamConfigurationMap();
                    mfVar.close();
                    this.getHighSpeedVideoFpsRangesFor = Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor();
                    this.getOutputFormats = null;
                } catch (java.io.IOException e) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI((byte) (48 - android.text.TextUtils.getTrimmedLength("")), "\u000f\t\b\t\u0003\n\u000f\u000e\u0001\u000e\u0007\u0001\u0015\u0003\u0017\u0010㗪", 17 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr);
                    sb.append(((java.lang.String) objArr[0]).intern());
                    sb.append(e);
                    throw new util.h.xy.dh.ri(sb.toString(), e);
                }
            }
            int i = getHighSpeedVideoSizes + 121;
            getInputSizeshNQ4ISI = i % 128;
            if (i % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
        }
    }

    @Override // util.h.xy.dh.l, util.h.xy.dh.mi
    final util.h.xy.dh.mi getHighSpeedVideoFpsRangesFor() {
        int i = getInputSizeshNQ4ISI + 23;
        getHighSpeedVideoSizes = i % 128;
        getOutputMinFrameDurationlomOqCM();
        if (i % 2 != 0) {
            super.getHighSpeedVideoFpsRangesFor();
            throw new java.lang.ArithmeticException();
        }
        util.h.xy.dh.mi highSpeedVideoFpsRangesFor = super.getHighSpeedVideoFpsRangesFor();
        int i2 = getInputSizeshNQ4ISI + 43;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            return highSpeedVideoFpsRangesFor;
        }
        throw null;
    }

    @Override // util.h.xy.dh.l, util.h.xy.dh.mi
    final util.h.xy.dh.mi Camera2StreamConfigurationMap() {
        int i = getInputSizeshNQ4ISI + 7;
        getHighSpeedVideoSizes = i % 128;
        getOutputMinFrameDurationlomOqCM();
        if (i % 2 == 0) {
            return super.Camera2StreamConfigurationMap();
        }
        super.Camera2StreamConfigurationMap();
        throw null;
    }

    @Override // util.h.xy.dh.l
    final util.h.xy.dh.rk getHighSpeedVideoSizes() {
        getInputSizeshNQ4ISI = (getHighSpeedVideoSizes + 85) % 128;
        util.h.xy.dh.rk highSpeedVideoSizes = ((util.h.xy.dh.l) getHighSpeedVideoFpsRangesFor()).getHighSpeedVideoSizes();
        int i = getInputSizeshNQ4ISI + 57;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
            return highSpeedVideoSizes;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.dh.l
    final util.h.xy.dh.rh getOutputFormats() {
        int i = getHighSpeedVideoSizes + 81;
        getInputSizeshNQ4ISI = i % 128;
        util.h.xy.dh.l lVar = (util.h.xy.dh.l) getHighSpeedVideoFpsRangesFor();
        if (i % 2 != 0) {
            return lVar.getOutputFormats();
        }
        lVar.getOutputFormats();
        throw null;
    }

    @Override // util.h.xy.dh.l
    final util.h.xy.dh.rd getInputSizeshNQ4ISI() {
        int i = getInputSizeshNQ4ISI + 75;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 != 0) {
            ((util.h.xy.dh.l) getHighSpeedVideoFpsRangesFor()).getInputSizeshNQ4ISI();
            throw new java.lang.ArithmeticException();
        }
        util.h.xy.dh.rd inputSizeshNQ4ISI = ((util.h.xy.dh.l) getHighSpeedVideoFpsRangesFor()).getInputSizeshNQ4ISI();
        int i2 = getHighSpeedVideoSizes + 117;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            return inputSizeshNQ4ISI;
        }
        throw null;
    }

    @Override // util.h.xy.dh.l
    final util.h.xy.dh.ma getHighSpeedVideoFpsRanges() {
        getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 75) % 128;
        util.h.xy.dh.ma highSpeedVideoFpsRanges = ((util.h.xy.dh.l) getHighSpeedVideoFpsRangesFor()).getHighSpeedVideoFpsRanges();
        getInputSizeshNQ4ISI = (getHighSpeedVideoSizes + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        return highSpeedVideoFpsRanges;
    }

    @Override // util.h.xy.dh.mi
    final void getHighResolutionOutputSizeshNQ4ISI(util.h.xy.dh.rj rjVar, boolean z) throws java.io.IOException {
        int i = getHighSpeedVideoSizes + 3;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            getOutputStallDurationlomOqCM();
            throw null;
        }
        byte[] outputStallDurationlomOqCM = getOutputStallDurationlomOqCM();
        if (outputStallDurationlomOqCM != null) {
            rjVar.getHighSpeedVideoSizes(z, 48, outputStallDurationlomOqCM);
        } else {
            super.getHighSpeedVideoFpsRangesFor().getHighResolutionOutputSizeshNQ4ISI(rjVar, z);
            getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 55) % 128;
        }
    }

    @Override // util.h.xy.dh.mi
    final int getHighSpeedVideoFpsRanges(boolean z) throws java.io.IOException {
        getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 77) % 128;
        byte[] outputStallDurationlomOqCM = getOutputStallDurationlomOqCM();
        if (outputStallDurationlomOqCM == null) {
            return super.getHighSpeedVideoFpsRangesFor().getHighSpeedVideoFpsRanges(z);
        }
        int highSpeedVideoFpsRangesFor = util.h.xy.dh.rj.getHighSpeedVideoFpsRangesFor(z, outputStallDurationlomOqCM.length);
        getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 23) % 128;
        return highSpeedVideoFpsRangesFor;
    }

    @Override // util.h.xy.dh.l
    final util.h.xy.dh.c[] getInputFormats() {
        getInputSizeshNQ4ISI = (getHighSpeedVideoSizes + 121) % 128;
        getOutputMinFrameDurationlomOqCM();
        util.h.xy.dh.c[] inputFormats = super.getInputFormats();
        int i = getInputSizeshNQ4ISI + 85;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
            return inputFormats;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.dh.l
    /* renamed from: ʽ, reason: contains not printable characters */
    public final int mo26286() {
        int i = getInputSizeshNQ4ISI + 7;
        getHighSpeedVideoSizes = i % 128;
        getOutputMinFrameDurationlomOqCM();
        if (i % 2 != 0) {
            super.mo26286();
            throw null;
        }
        int mo26286 = super.mo26286();
        int i2 = getInputSizeshNQ4ISI + 89;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            return mo26286;
        }
        throw null;
    }

    @Override // util.h.xy.dh.l, java.lang.Iterable
    public final java.util.Iterator<util.h.xy.dh.c> iterator() {
        int i = getInputSizeshNQ4ISI + 79;
        getHighSpeedVideoSizes = i % 128;
        getOutputMinFrameDurationlomOqCM();
        if (i % 2 != 0) {
            super.iterator();
            throw new java.lang.ArithmeticException();
        }
        java.util.Iterator<util.h.xy.dh.c> it = super.iterator();
        getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 15) % 128;
        return it;
    }

    @Override // util.h.xy.dh.l, util.h.xy.dh.mi, util.h.xy.dh.mh
    public final int hashCode() {
        int i = getInputSizeshNQ4ISI + 9;
        getHighSpeedVideoSizes = i % 128;
        getOutputMinFrameDurationlomOqCM();
        if (i % 2 != 0) {
            super.hashCode();
            throw new java.lang.ArithmeticException();
        }
        int hashCode = super.hashCode();
        getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 45) % 128;
        return hashCode;
    }

    @Override // util.h.xy.dh.l
    /* renamed from: ʼ, reason: contains not printable characters */
    public final java.util.Enumeration mo26285() {
        int i = getHighSpeedVideoSizes + 27;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            getOutputStallDurationlomOqCM();
            throw null;
        }
        byte[] outputStallDurationlomOqCM = getOutputStallDurationlomOqCM();
        if (outputStallDurationlomOqCM == null) {
            return super.mo26285();
        }
        util.h.xy.dh.ax axVar = new util.h.xy.dh.ax(outputStallDurationlomOqCM);
        getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 21) % 128;
        return axVar;
    }

    @Override // util.h.xy.dh.l
    /* renamed from: ˊ, reason: contains not printable characters */
    public final util.h.xy.dh.c mo26287(int i) {
        int i2 = getInputSizeshNQ4ISI + 27;
        getHighSpeedVideoSizes = i2 % 128;
        getOutputMinFrameDurationlomOqCM();
        if (i2 % 2 == 0) {
            return super.mo26287(i);
        }
        super.mo26287(i);
        throw null;
    }

    bd(byte[] bArr) throws java.io.IOException {
        if (bArr != null) {
            this.getOutputFormats = bArr;
        } else {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI((byte) (android.view.Gravity.getAbsoluteGravity(0, 0) + 4), "\u0005\u000e\r\u0002\u0001\u0000\u000e\u0000\u0006\u000e\u0000\b㗸㗸\u0004\n\n\u0015\u000b\f\u0011\u0016㗺㗺", 24 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
            throw new java.lang.NullPointerException(((java.lang.String) objArr[0]).intern());
        }
    }
}
