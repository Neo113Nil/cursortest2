package util.h.xy.dh;

/* loaded from: classes5.dex */
public abstract class rf extends util.h.xy.dh.mi implements util.h.xy.dh.m {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRangesFor;
    static final util.h.xy.dh.p getHighSpeedVideoSizes;
    private static int getHighSpeedVideoSizesFor;
    private static byte[] getInputFormats;
    private static int getInputSizeshNQ4ISI;
    private static int getOutputFormats;
    private static short[] getOutputMinFrameDuration;
    private static int getOutputSizes;
    final byte[] getHighSpeedVideoFpsRanges;

    static {
        getHighSpeedVideoSizes();
        getHighSpeedVideoSizes = new util.h.xy.dh.p(util.h.xy.dh.rf.class) { // from class: util.h.xy.dh.rf.2
            private static int getHighResolutionOutputSizeshNQ4ISI = 0;
            private static int getHighSpeedVideoSizes = 1;

            @Override // util.h.xy.dh.p
            final util.h.xy.dh.mi getHighSpeedVideoFpsRangesFor(util.h.xy.dh.mz mzVar) {
                int i = getHighResolutionOutputSizeshNQ4ISI;
                getHighSpeedVideoSizes = (((i | 65) << 1) - (i ^ 65)) % 128;
                util.h.xy.dh.rf highSpeedVideoSizes = util.h.xy.dh.rf.getHighSpeedVideoSizes(mzVar.m26337());
                getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 105) % 128;
                return highSpeedVideoSizes;
            }
        };
        int i = getHighResolutionOutputSizeshNQ4ISI + 115;
        getOutputSizes = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    static util.h.xy.dh.rf getHighSpeedVideoSizes(byte[] bArr) {
        util.h.xy.dh.my myVar = new util.h.xy.dh.my(bArr);
        int i = getOutputSizes + 93;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            return myVar;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.dh.m
    /* renamed from: ˋ */
    public final java.lang.String mo26276() {
        getHighResolutionOutputSizeshNQ4ISI = (getOutputSizes + 3) % 128;
        java.lang.String m26855 = util.h.xy.fb.rd.m26855(this.getHighSpeedVideoFpsRanges);
        getOutputSizes = (getHighResolutionOutputSizeshNQ4ISI + 27) % 128;
        return m26855;
    }

    @Override // util.h.xy.dh.mi, util.h.xy.dh.mh
    public final int hashCode() {
        int i = getOutputSizes + 45;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            util.h.xy.fb.a.m26817(this.getHighSpeedVideoFpsRanges);
            throw null;
        }
        int m26817 = util.h.xy.fb.a.m26817(this.getHighSpeedVideoFpsRanges);
        getOutputSizes = (getHighResolutionOutputSizeshNQ4ISI + 15) % 128;
        return m26817;
    }

    @Override // util.h.xy.dh.mi
    final boolean getHighSpeedVideoFpsRanges(util.h.xy.dh.mi miVar) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getOutputSizes = (i + 63) % 128;
        if (miVar instanceof util.h.xy.dh.rf) {
            return util.h.xy.fb.a.m26820(this.getHighSpeedVideoFpsRanges, ((util.h.xy.dh.rf) miVar).getHighSpeedVideoFpsRanges);
        }
        int i2 = i + 41;
        getOutputSizes = i2 % 128;
        return i2 % 2 != 0;
    }

    @Override // util.h.xy.dh.mi
    final void getHighResolutionOutputSizeshNQ4ISI(util.h.xy.dh.rj rjVar, boolean z) throws java.io.IOException {
        getHighResolutionOutputSizeshNQ4ISI = (getOutputSizes + 89) % 128;
        rjVar.getHighSpeedVideoSizes(z, 25, this.getHighSpeedVideoFpsRanges);
        int i = getOutputSizes + 113;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // util.h.xy.dh.mi
    final int getHighSpeedVideoFpsRanges(boolean z) {
        int i = getOutputSizes + 43;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        byte[] bArr = this.getHighSpeedVideoFpsRanges;
        if (i % 2 != 0) {
            return util.h.xy.dh.rj.getHighSpeedVideoFpsRangesFor(z, bArr.length);
        }
        util.h.xy.dh.rj.getHighSpeedVideoFpsRangesFor(z, bArr.length);
        throw null;
    }

    @Override // util.h.xy.dh.mi
    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getOutputSizes = (i + 29) % 128;
        int i2 = i + 73;
        getOutputSizes = i2 % 128;
        if (i2 % 2 == 0) {
            return false;
        }
        throw null;
    }

    rf(byte[] bArr, boolean z) {
        boolean z2;
        char c;
        int i;
        if (bArr != null) {
            this.getHighSpeedVideoFpsRanges = bArr;
            return;
        }
        int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        short maximumFlingVelocity = (short) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
        byte b = (byte) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
        int i2 = (-1432075310) - lastIndexOf;
        int size = (-70) - android.view.View.MeasureSpec.getSize(0);
        int windowTouchSlop = (-861186369) - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8);
        util.h.xz.b.me meVar = new util.h.xz.b.me();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i3 = size + ((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L)));
        int i4 = i3 == -1 ? 1 : 0;
        if (i4 != 0) {
            byte[] bArr2 = getInputFormats;
            if (bArr2 != null) {
                int length = bArr2.length;
                byte[] bArr3 = new byte[length];
                int i5 = 0;
                while (i5 < length) {
                    bArr3[i5] = (byte) (bArr2[i5] ^ (-2689713159175858216L));
                    i5++;
                    bArr2 = bArr2;
                }
                bArr2 = bArr3;
            }
            i3 = bArr2 != null ? (byte) (((byte) (getInputFormats[((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L))) + i2] ^ (-2689713159175858216L))) + ((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L)))) : (short) (((short) (getOutputMinFrameDuration[((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L))) + i2] ^ (-2689713159175858216L))) + ((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L))));
        }
        if (i3 > 0) {
            meVar.f2647 = ((i2 + i3) - 2) + ((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L))) + i4;
            meVar.f2644 = (char) (windowTouchSlop + ((int) (getOutputFormats ^ (-2689713159175858216L))));
            sb.append(meVar.f2644);
            meVar.f2646 = meVar.f2644;
            byte[] bArr4 = getInputFormats;
            if (bArr4 != null) {
                int length2 = bArr4.length;
                byte[] bArr5 = new byte[length2];
                for (int i6 = 0; i6 < length2; i6++) {
                    bArr5[i6] = (byte) (bArr4[i6] ^ (-2689713159175858216L));
                }
                getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 57) % 128;
                bArr4 = bArr5;
            }
            if (bArr4 != null) {
                getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 67) % 128;
                z2 = true;
            } else {
                z2 = false;
            }
            meVar.f2645 = 1;
            while (meVar.f2645 < i3) {
                int i7 = getHighSpeedVideoFpsRangesFor + 27;
                Camera2StreamConfigurationMap = i7 % 128;
                if (i7 % 2 == 0) {
                    throw null;
                }
                if (z2) {
                    byte[] bArr6 = getInputFormats;
                    meVar.f2647 = meVar.f2647 - 1;
                    byte b2 = (byte) (bArr6[r6] ^ (-2689713159175858216L));
                    c = meVar.f2646;
                    i = (byte) (b2 + maximumFlingVelocity);
                } else {
                    short[] sArr = getOutputMinFrameDuration;
                    meVar.f2647 = meVar.f2647 - 1;
                    short s = (short) (sArr[r6] ^ (-2689713159175858216L));
                    c = meVar.f2646;
                    i = (short) (s + maximumFlingVelocity);
                }
                meVar.f2644 = (char) (c + (i ^ b));
                sb.append(meVar.f2644);
                meVar.f2646 = meVar.f2644;
                meVar.f2645++;
            }
        }
        throw new java.lang.NullPointerException(sb.toString().intern());
    }

    static void getHighSpeedVideoSizes() {
        getHighSpeedVideoSizesFor = -1292194827;
        getInputSizeshNQ4ISI = -408873081;
        getOutputFormats = -722092368;
        getInputFormats = new byte[]{-40, 47, -33, -106, 99, -37, -102, 116, -35, -39, -40, -43, 38, -101, 33, 108, 39, -34, -47, 41, -34, 39, -44, -28, -40};
    }
}
