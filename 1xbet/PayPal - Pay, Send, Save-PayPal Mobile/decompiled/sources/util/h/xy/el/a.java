package util.h.xy.el;

/* loaded from: classes5.dex */
public final class a extends util.h.xy.ef.rf {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI = -1231763930;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes;
    private byte[] getInputFormats;
    private util.h.xy.ef.me getOutputFormats;

    /* renamed from: ˎ, reason: contains not printable characters */
    public final util.h.xy.ef.mb m26610(int i) {
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 61) % 128;
        util.h.xy.ef.mb m26611 = m26611(i);
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 19) % 128;
        return m26611;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final util.h.xy.ef.mb m26611(int i) {
        int i2 = i / 8;
        util.h.xy.ep.mc mcVar = new util.h.xy.ep.mc(getHighResolutionOutputSizeshNQ4ISI(i2), 0, i2);
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 59) % 128;
        return mcVar;
    }

    private byte[] getHighResolutionOutputSizeshNQ4ISI(int i) {
        int mo26547 = this.getOutputFormats.mo26547();
        int i2 = ((i + mo26547) - 1) / mo26547;
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[i2 * mo26547];
        this.getOutputFormats.mo26546(new util.h.xy.ep.mc(this.f2154));
        int i3 = 0;
        for (int i4 = 1; i4 <= i2; i4++) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 53) % 128;
            int i5 = 3;
            while (true) {
                byte b = (byte) (bArr[i5] + 1);
                bArr[i5] = b;
                if (b != 0) {
                    break;
                }
                i5--;
                getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            }
            byte[] bArr3 = this.f2153;
            int i6 = this.f2152;
            if (i6 == 0) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                int i7 = 35 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                int i8 = (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23;
                int combineMeasuredStates = 268 - android.view.View.combineMeasuredStates(0, 0);
                char[] charArray = "\u0019\u0012\u0018ￄ\u0011\u0019\u0017\u0018ￄ\u0006\tￄ\u0005\u0018ￄ\u0010\t\u0005\u0017\u0018ￄￕￒ\r\u0018\t\u0016\u0005\u0018\r\u0013\u0012ￄ\u0007\u0013".toCharArray();
                util.h.xz.b.ra raVar = new util.h.xz.b.ra();
                char[] cArr = new char[i7];
                raVar.f2649 = 0;
                while (raVar.f2649 < i7) {
                    Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 1) % 128;
                    raVar.f2650 = charArray[raVar.f2649];
                    cArr[raVar.f2649] = (char) (raVar.f2650 + combineMeasuredStates);
                    int i9 = raVar.f2649;
                    cArr[i9] = (char) (cArr[i9] - ((int) (getHighResolutionOutputSizeshNQ4ISI ^ (-4839292868003314026L))));
                    raVar.f2649++;
                }
                if (i8 > 0) {
                    raVar.f2648 = i8;
                    char[] cArr2 = new char[i7];
                    java.lang.System.arraycopy(cArr, 0, cArr2, 0, i7);
                    java.lang.System.arraycopy(cArr2, 0, cArr, i7 - raVar.f2648, raVar.f2648);
                    java.lang.System.arraycopy(cArr2, raVar.f2648, cArr, 0, i7 - raVar.f2648);
                }
                objArr[0] = new java.lang.String(cArr);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
            }
            if (bArr3 != null) {
                int i10 = getHighSpeedVideoFpsRangesFor + 77;
                getHighSpeedVideoSizes = i10 % 128;
                if (i10 % 2 != 0) {
                    this.getOutputFormats.mo26550(bArr3, 1, bArr3.length);
                } else {
                    this.getOutputFormats.mo26550(bArr3, 0, bArr3.length);
                }
            }
            this.getOutputFormats.mo26550(bArr, 0, 4);
            this.getOutputFormats.mo26548(this.getInputFormats, 0);
            byte[] bArr4 = this.getInputFormats;
            java.lang.System.arraycopy(bArr4, 0, bArr2, i3, bArr4.length);
            for (int i11 = 1; i11 < i6; i11++) {
                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 101) % 128;
                util.h.xy.ef.me meVar = this.getOutputFormats;
                byte[] bArr5 = this.getInputFormats;
                meVar.mo26550(bArr5, 0, bArr5.length);
                this.getOutputFormats.mo26548(this.getInputFormats, 0);
                int i12 = 0;
                while (true) {
                    byte[] bArr6 = this.getInputFormats;
                    if (i12 != bArr6.length) {
                        int i13 = getHighSpeedVideoFpsRangesFor + 91;
                        getHighSpeedVideoSizes = i13 % 128;
                        if (i13 % 2 != 0) {
                            int i14 = i3 >> i12;
                            bArr2[i14] = (byte) (bArr6[i12] ^ bArr2[i14]);
                        } else {
                            int i15 = i3 + i12;
                            bArr2[i15] = (byte) (bArr6[i12] ^ bArr2[i15]);
                            i12++;
                        }
                    }
                }
            }
            i3 += mo26547;
        }
        return bArr2;
    }

    public a(util.h.xy.ef.rd rdVar) {
        util.h.xy.ek.ra raVar = new util.h.xy.ek.ra(rdVar);
        this.getOutputFormats = raVar;
        this.getInputFormats = new byte[raVar.mo26547()];
    }

    public a() {
        this(util.h.xy.eq.mb.m26699());
    }
}
