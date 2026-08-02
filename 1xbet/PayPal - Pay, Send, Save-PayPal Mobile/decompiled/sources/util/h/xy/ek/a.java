package util.h.xy.ek;

/* loaded from: classes18.dex */
public final class a implements util.h.xy.ef.me {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getOutputMinFrameDuration = 1;
    private byte[] getHighSpeedVideoSizesFor;
    private int getInputFormats;
    private byte[] getInputSizeshNQ4ISI;
    private int getOutputFormats;
    private util.h.xy.et.ra getOutputSizeshNQ4ISI;
    private util.h.xy.ef.ra getOutputStallDurationlomOqCM;
    private static char[] getHighSpeedVideoSizes = {38471, 41898, 41894, 41906, 41907, 41914, 41956, 41887, 41980, 41903, 41905, 41979, 41896, 41915, 41885, 41918, 41913, 41900, 41908, 41909, 41873, 41904, 41917, 41981, 41897};
    private static char getHighSpeedVideoFpsRanges = 38467;

    private static void getHighSpeedVideoSizes(byte b, java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2;
        char[] charArray = str.toCharArray();
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 19) % 128;
        char[] cArr = charArray;
        util.h.xz.b.mc mcVar = new util.h.xz.b.mc();
        char[] cArr2 = getHighSpeedVideoSizes;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                cArr3[i3] = (char) (cArr2[i3] ^ 4042185467053315654L);
            }
            cArr2 = cArr3;
        }
        char c = (char) (4042185467053315654L ^ getHighSpeedVideoFpsRanges);
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 99) % 128;
            mcVar.f2638 = 0;
            while (mcVar.f2638 < i2) {
                mcVar.f2641 = cArr[mcVar.f2638];
                mcVar.f2636 = cArr[mcVar.f2638 + 1];
                if (mcVar.f2641 == mcVar.f2636) {
                    cArr4[mcVar.f2638] = (char) (mcVar.f2641 - b);
                    cArr4[mcVar.f2638 + 1] = (char) (mcVar.f2636 - b);
                    Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
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
                        cArr4[mcVar.f2638] = cArr2[(i4 * c) + i5];
                        cArr4[mcVar.f2638 + 1] = cArr2[(i6 * c) + i7];
                    } else if (mcVar.f2639 == mcVar.f2637) {
                        mcVar.f2640 = ((mcVar.f2640 + c) - 1) % c;
                        mcVar.f2635 = ((mcVar.f2635 + c) - 1) % c;
                        int i8 = mcVar.f2639;
                        int i9 = mcVar.f2640;
                        int i10 = mcVar.f2637;
                        int i11 = mcVar.f2635;
                        cArr4[mcVar.f2638] = cArr2[(i8 * c) + i9];
                        cArr4[mcVar.f2638 + 1] = cArr2[(i10 * c) + i11];
                    } else {
                        int i12 = mcVar.f2639;
                        int i13 = mcVar.f2635;
                        int i14 = mcVar.f2637;
                        int i15 = mcVar.f2640;
                        cArr4[mcVar.f2638] = cArr2[(i12 * c) + i13];
                        cArr4[mcVar.f2638 + 1] = cArr2[(i14 * c) + i15];
                    }
                }
                mcVar.f2638 += 2;
                Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 109) % 128;
            }
        }
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 103) % 128;
        for (int i16 = 0; i16 < i; i16++) {
            cArr4[i16] = (char) (cArr4[i16] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr4);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m26609() {
        getHighSpeedVideoFpsRangesFor = (getOutputMinFrameDuration + 49) % 128;
        int i = 0;
        while (true) {
            byte[] bArr = this.getInputSizeshNQ4ISI;
            if (i >= bArr.length) {
                this.getOutputFormats = 0;
                this.getOutputStallDurationlomOqCM.mo26557();
                getHighSpeedVideoFpsRangesFor = (getOutputMinFrameDuration + 117) % 128;
                return;
            } else {
                bArr[i] = 0;
                i++;
                int i2 = getOutputMinFrameDuration + 15;
                getHighSpeedVideoFpsRangesFor = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 5 / 3;
                }
            }
        }
    }

    @Override // util.h.xy.ef.me
    /* renamed from: ᐝ */
    public final int mo26548(byte[] bArr, int i) {
        int i2 = getHighSpeedVideoFpsRangesFor + 7;
        getOutputMinFrameDuration = i2 % 128;
        if (i2 % 2 == 0) {
            this.getOutputStallDurationlomOqCM.mo26554();
            throw null;
        }
        int mo26554 = this.getOutputStallDurationlomOqCM.mo26554();
        if (this.getOutputSizeshNQ4ISI == null) {
            while (true) {
                int i3 = this.getOutputFormats;
                if (i3 >= mo26554) {
                    break;
                }
                int i4 = getHighSpeedVideoFpsRangesFor + 63;
                getOutputMinFrameDuration = i4 % 128;
                if (i4 % 2 == 0) {
                    this.getInputSizeshNQ4ISI[i3] = 1;
                } else {
                    this.getInputSizeshNQ4ISI[i3] = 0;
                    i3++;
                }
                this.getOutputFormats = i3;
            }
        } else {
            if (this.getOutputFormats == mo26554) {
                getOutputMinFrameDuration = (getHighSpeedVideoFpsRangesFor + 83) % 128;
                this.getOutputStallDurationlomOqCM.mo26555(this.getInputSizeshNQ4ISI, 0, this.getHighSpeedVideoSizesFor, 0);
                this.getOutputFormats = 0;
            }
            this.getOutputSizeshNQ4ISI.mo26710(this.getInputSizeshNQ4ISI, this.getOutputFormats);
        }
        this.getOutputStallDurationlomOqCM.mo26555(this.getInputSizeshNQ4ISI, 0, this.getHighSpeedVideoSizesFor, 0);
        java.lang.System.arraycopy(this.getHighSpeedVideoSizesFor, 0, bArr, i, this.getInputFormats);
        m26609();
        return this.getInputFormats;
    }

    @Override // util.h.xy.ef.me
    /* renamed from: ᐝ */
    public final void mo26550(byte[] bArr, int i, int i2) {
        int i3 = getOutputMinFrameDuration + 109;
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (i2 < 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes((byte) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 96), "\f\u0002\u0001\r\r\u0007\u0011\u0017\u0006\u0015\u0007\u0017\r\b\u0012\u000b\u0002\u0011\u0010\u0004\u0012\u0006\u0012\u0004\u0013\u0016\r\u0007\u0001\u0015\b\u0012\r\u0011㘜", (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 35, objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        int mo26554 = this.getOutputStallDurationlomOqCM.mo26554();
        int i4 = this.getOutputFormats;
        int i5 = mo26554 - i4;
        if (i2 > i5) {
            java.lang.System.arraycopy(bArr, i, this.getInputSizeshNQ4ISI, i4, i5);
            this.getOutputStallDurationlomOqCM.mo26555(this.getInputSizeshNQ4ISI, 0, this.getHighSpeedVideoSizesFor, 0);
            this.getOutputFormats = 0;
            i2 -= i5;
            i += i5;
            while (i2 > mo26554) {
                getOutputMinFrameDuration = (getHighSpeedVideoFpsRangesFor + 23) % 128;
                this.getOutputStallDurationlomOqCM.mo26555(bArr, i, this.getHighSpeedVideoSizesFor, 0);
                i2 -= mo26554;
                i += mo26554;
            }
        }
        java.lang.System.arraycopy(bArr, i, this.getInputSizeshNQ4ISI, this.getOutputFormats, i2);
        this.getOutputFormats += i2;
    }

    @Override // util.h.xy.ef.me
    /* renamed from: ᐝ */
    public final void mo26549(byte b) {
        int i = this.getOutputFormats;
        byte[] bArr = this.getInputSizeshNQ4ISI;
        if (i == bArr.length) {
            getHighSpeedVideoFpsRangesFor = (getOutputMinFrameDuration + 15) % 128;
            this.getOutputStallDurationlomOqCM.mo26555(bArr, 0, this.getHighSpeedVideoSizesFor, 0);
            this.getOutputFormats = 0;
        }
        byte[] bArr2 = this.getInputSizeshNQ4ISI;
        int i2 = this.getOutputFormats;
        this.getOutputFormats = i2 + 1;
        bArr2[i2] = b;
        getHighSpeedVideoFpsRangesFor = (getOutputMinFrameDuration + 111) % 128;
    }

    @Override // util.h.xy.ef.me
    /* renamed from: ᐝ */
    public final int mo26547() {
        int i = getOutputMinFrameDuration + 73;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            return this.getInputFormats;
        }
        throw null;
    }

    @Override // util.h.xy.ef.me
    /* renamed from: ˊ */
    public final void mo26546(util.h.xy.ef.mb mbVar) {
        util.h.xy.ef.ra raVar;
        boolean z;
        int i = getOutputMinFrameDuration + 117;
        getHighSpeedVideoFpsRangesFor = i % 128;
        m26609();
        if (i % 2 != 0) {
            raVar = this.getOutputStallDurationlomOqCM;
            z = false;
        } else {
            raVar = this.getOutputStallDurationlomOqCM;
            z = true;
        }
        raVar.mo26556(z, mbVar);
        int i2 = getOutputMinFrameDuration + 5;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    public a(util.h.xy.ef.ra raVar, int i, util.h.xy.et.ra raVar2) {
        if (i % 8 == 0) {
            this.getOutputStallDurationlomOqCM = new util.h.xy.eo.a(raVar);
            this.getOutputSizeshNQ4ISI = raVar2;
            this.getInputFormats = i / 8;
            this.getHighSpeedVideoSizesFor = new byte[raVar.mo26554()];
            this.getInputSizeshNQ4ISI = new byte[raVar.mo26554()];
            this.getOutputFormats = 0;
            return;
        }
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes((byte) (123 - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue()), "\u0018\n\b\t\u000e\u0018\u0001\u0011\u0005\r\u0004\u000e\r\u0007\u0010\u0011\u0005\r\u0014\u0016\u000e\u0011\u0010\u0016\u0012\u0006\u0000\t\t\u0007", 31 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public a(util.h.xy.ef.ra raVar, int i) {
        this(raVar, i, null);
    }
}
