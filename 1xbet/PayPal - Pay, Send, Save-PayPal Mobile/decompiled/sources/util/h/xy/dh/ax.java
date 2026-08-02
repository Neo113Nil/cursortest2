package util.h.xy.dh;

/* loaded from: classes5.dex */
final class ax implements java.util.Enumeration {
    private static int Camera2StreamConfigurationMap = 1;
    private static short[] getHighResolutionOutputSizeshNQ4ISI = null;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private static int getHighSpeedVideoSizesFor = -408872979;
    private static int getInputFormats = 462846780;
    private static int getOutputFormats = -1709028772;
    private static byte[] getOutputMinFrameDuration = {4, -39, -4, -58, 35, -50, -11, -28, com.google.common.base.Ascii.SI, -62, -53, -50, -58, -4, -51, -2, -41};
    private util.h.xy.dh.mf getInputSizeshNQ4ISI;
    private java.lang.Object getOutputStallDuration = getHighResolutionOutputSizeshNQ4ISI();

    private static void getHighSpeedVideoSizes(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr) {
        boolean z;
        int i4;
        boolean z2;
        int length;
        byte[] bArr;
        int i5;
        util.h.xz.b.me meVar = new util.h.xz.b.me();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i6 = i2 + ((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L)));
        if (i6 == -1) {
            getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 75) % 128;
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i7 = getHighSpeedVideoFpsRangesFor + 121;
            Camera2StreamConfigurationMap = i7 % 128;
            if (i7 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            byte[] bArr2 = getOutputMinFrameDuration;
            if (bArr2 != null) {
                int length2 = bArr2.length;
                byte[] bArr3 = new byte[length2];
                for (int i8 = 0; i8 < length2; i8++) {
                    int i9 = getHighSpeedVideoFpsRangesFor + 3;
                    Camera2StreamConfigurationMap = i9 % 128;
                    if (i9 % 2 == 0) {
                        bArr3[i8] = (byte) (bArr2[i8] + 2689713159175858216L);
                    } else {
                        bArr3[i8] = (byte) (bArr2[i8] ^ (-2689713159175858216L));
                    }
                }
                bArr2 = bArr3;
            }
            i6 = bArr2 != null ? (byte) (((byte) (getOutputMinFrameDuration[((int) (getInputFormats ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L)))) : (short) (((short) (getHighResolutionOutputSizeshNQ4ISI[((int) (getInputFormats ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L))));
        }
        if (i6 > 0) {
            int i10 = (Camera2StreamConfigurationMap + 119) % 128;
            getHighSpeedVideoFpsRangesFor = i10;
            int i11 = (int) (getInputFormats ^ (-2689713159175858216L));
            if (z) {
                Camera2StreamConfigurationMap = (i10 + 95) % 128;
                i4 = 1;
            } else {
                i4 = 0;
            }
            meVar.f2647 = ((i + i6) - 2) + i11 + i4;
            meVar.f2644 = (char) (i3 + ((int) (getOutputFormats ^ (-2689713159175858216L))));
            sb.append(meVar.f2644);
            meVar.f2646 = meVar.f2644;
            byte[] bArr4 = getOutputMinFrameDuration;
            if (bArr4 != null) {
                int i12 = getHighSpeedVideoFpsRangesFor + 49;
                Camera2StreamConfigurationMap = i12 % 128;
                if (i12 % 2 == 0) {
                    length = bArr4.length;
                    bArr = new byte[length];
                    i5 = 1;
                } else {
                    length = bArr4.length;
                    bArr = new byte[length];
                    i5 = 0;
                }
                while (i5 < length) {
                    bArr[i5] = (byte) (bArr4[i5] ^ (-2689713159175858216L));
                    i5++;
                }
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 63) % 128;
                bArr4 = bArr;
            }
            if (bArr4 != null) {
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 77) % 128;
                z2 = true;
            } else {
                z2 = false;
            }
            meVar.f2645 = 1;
            while (meVar.f2645 < i6) {
                if (z2) {
                    byte[] bArr5 = getOutputMinFrameDuration;
                    meVar.f2647 = meVar.f2647 - 1;
                    meVar.f2644 = (char) (meVar.f2646 + (((byte) (((byte) (bArr5[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                } else {
                    short[] sArr = getHighResolutionOutputSizeshNQ4ISI;
                    meVar.f2647 = meVar.f2647 - 1;
                    meVar.f2644 = (char) (meVar.f2646 + (((short) (((short) (sArr[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                }
                sb.append(meVar.f2644);
                meVar.f2646 = meVar.f2644;
                meVar.f2645++;
            }
        }
        objArr[0] = sb.toString();
    }

    private java.lang.Object getHighResolutionOutputSizeshNQ4ISI() {
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 61) % 128;
        try {
            util.h.xy.dh.mi m26317 = this.getInputSizeshNQ4ISI.m26317();
            int i = getHighSpeedVideoSizes + 59;
            getHighSpeedVideoFpsRanges = i % 128;
            if (i % 2 == 0) {
                return m26317;
            }
            throw null;
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes((android.view.ViewConfiguration.getTapTimeout() >> 16) + 63476508, (short) ((-27) - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)), (byte) android.view.View.getDefaultSize(0, 0), android.graphics.drawable.Drawable.resolveOpacity(0, 0) - 54, (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) - 2105761047, objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(e);
            throw new util.h.xy.dh.ri(sb.toString(), e);
        }
    }

    @Override // java.util.Enumeration
    public final java.lang.Object nextElement() {
        int i = (getHighSpeedVideoFpsRanges + 115) % 128;
        getHighSpeedVideoSizes = i;
        java.lang.Object obj = this.getOutputStallDuration;
        if (obj == null) {
            throw new java.util.NoSuchElementException();
        }
        getHighSpeedVideoFpsRanges = (i + 103) % 128;
        this.getOutputStallDuration = getHighResolutionOutputSizeshNQ4ISI();
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 41) % 128;
        return obj;
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        int i = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRanges = (i + 115) % 128;
        if (this.getOutputStallDuration == null) {
            return false;
        }
        getHighSpeedVideoFpsRanges = (i + 11) % 128;
        return true;
    }

    public ax(byte[] bArr) {
        this.getInputSizeshNQ4ISI = new util.h.xy.dh.mf(bArr, true);
    }
}
