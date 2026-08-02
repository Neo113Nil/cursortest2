package util.h.xy.cq;

/* loaded from: classes18.dex */
final class mb {
    static int getHighSpeedVideoFpsRanges = 0;
    static int getHighSpeedVideoFpsRangesFor = 1;
    final byte[] Camera2StreamConfigurationMap;
    final byte[] getHighResolutionOutputSizeshNQ4ISI;
    final byte[] getHighSpeedVideoSizes;
    final byte[] getInputSizeshNQ4ISI;
    final byte[] getOutputMinFrameDuration;

    static {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges = ((i ^ 53) + ((i & 53) << 1)) % 128;
    }

    public mb(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.getHighResolutionOutputSizeshNQ4ISI = util.h.xy.fb.a.m26823(bArr, bArr.length);
        this.getInputSizeshNQ4ISI = util.h.xy.fb.a.m26823(bArr2, bArr2.length);
        this.Camera2StreamConfigurationMap = util.h.xy.fb.a.m26823(bArr3, bArr3.length);
        this.getOutputMinFrameDuration = util.h.xy.fb.a.m26823(bArr4, bArr4.length);
        this.getHighSpeedVideoSizes = util.h.xy.fb.a.m26823(bArr5, bArr5.length);
    }
}
