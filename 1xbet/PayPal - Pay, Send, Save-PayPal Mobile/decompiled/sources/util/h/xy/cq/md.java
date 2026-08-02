package util.h.xy.cq;

/* loaded from: classes5.dex */
public final class md implements util.h.xy.ck.mc {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighSpeedVideoSizes = 1;
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoFpsRanges;
    private byte[] getHighSpeedVideoFpsRangesFor;
    private final util.h.xy.cq.me getInputFormats;
    private byte[] getInputSizeshNQ4ISI;
    private byte[] getOutputMinFrameDuration;

    static {
        int i = Camera2StreamConfigurationMap + 11;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    public md(util.h.xy.cq.me meVar) {
        this.getInputFormats = meVar;
    }

    final void Camera2StreamConfigurationMap() throws util.h.xy.ck.rc {
        int i = Camera2StreamConfigurationMap;
        int i2 = (i ^ 59) + ((i & 59) << 1);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        byte[] bArr = this.getHighSpeedVideoFpsRanges;
        if (bArr != null) {
            util.h.xy.cv.ra.m26066(bArr);
            getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 55) % 128;
        }
        byte[] bArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (bArr2 != null) {
            int i3 = getHighSpeedVideoSizes + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
            Camera2StreamConfigurationMap = i3 % 128;
            if (i3 % 2 != 0) {
                util.h.xy.cv.ra.m26066(bArr2);
                throw null;
            }
            util.h.xy.cv.ra.m26066(bArr2);
        }
        byte[] bArr3 = this.getInputSizeshNQ4ISI;
        if (bArr3 != null) {
            util.h.xy.cv.ra.m26066(bArr3);
        }
        byte[] bArr4 = this.getOutputMinFrameDuration;
        if (bArr4 != null) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 35) % 128;
            util.h.xy.cv.ra.m26066(bArr4);
            int i4 = getHighSpeedVideoSizes;
            Camera2StreamConfigurationMap = (((i4 | 75) << 1) - (i4 ^ 75)) % 128;
        }
        byte[] bArr5 = this.getHighSpeedVideoFpsRangesFor;
        if (bArr5 != null) {
            getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 89) % 128;
            util.h.xy.cv.ra.m26066(bArr5);
        }
        util.h.xy.cq.me meVar = this.getInputFormats;
        if (meVar != null) {
            int i5 = Camera2StreamConfigurationMap;
            int i6 = (i5 ^ 81) + ((i5 & 81) << 1);
            getHighSpeedVideoSizes = i6 % 128;
            if (i6 % 2 != 0) {
                meVar.m26015();
            } else {
                meVar.m26015();
                throw null;
            }
        }
    }
}
