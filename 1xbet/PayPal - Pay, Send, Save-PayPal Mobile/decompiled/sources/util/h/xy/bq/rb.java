package util.h.xy.bq;

/* loaded from: classes5.dex */
public final class rb implements com.gemalto.mfs.mwsdk.payment.engine.MasterCardTerminalInfo, util.h.xy.bq.e {
    private static final byte[][] Camera2StreamConfigurationMap = {f1016, f1017, f1025, f1026, f1023, f1022};
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges;
    private final byte[] getHighSpeedVideoFpsRangesFor;
    private final byte[] getHighSpeedVideoSizes;
    private final byte[] getInputFormats;
    private final byte[] getInputSizeshNQ4ISI;
    private final byte[] getOutputFormats;
    private final byte[] getOutputMinFrameDuration;

    static {
        int i = getHighSpeedVideoFpsRanges + 25;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public rb(byte[] bArr) {
        java.util.Map<java.nio.ByteBuffer, util.h.xy.ar.mb> m25056 = util.h.xy.ar.a.m25056(bArr, Camera2StreamConfigurationMap);
        this.getHighSpeedVideoFpsRangesFor = m25056.get(java.nio.ByteBuffer.wrap(f1016)).m25110();
        this.getInputSizeshNQ4ISI = m25056.get(java.nio.ByteBuffer.wrap(f1017)).m25110();
        this.getOutputFormats = m25056.get(java.nio.ByteBuffer.wrap(f1025)).m25110();
        this.getHighSpeedVideoSizes = m25056.get(java.nio.ByteBuffer.wrap(f1026)).m25110();
        this.getInputFormats = m25056.get(java.nio.ByteBuffer.wrap(f1023)).m25110();
        this.getOutputMinFrameDuration = m25056.get(java.nio.ByteBuffer.wrap(f1022)).m25110();
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.MasterCardTerminalInfo
    public final byte[] getpdol() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRanges = (((i | 15) << 1) - (i ^ 15)) % 128;
        byte[] bArr = this.getInputFormats;
        int i2 = i + 21;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.MasterCardTerminalInfo
    public final byte[] getCdol() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = ((i | 25) << 1) - (i ^ 25);
        getHighSpeedVideoFpsRanges = i2 % 128;
        byte[] bArr = this.getOutputMinFrameDuration;
        if (i2 % 2 == 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.MasterCardTerminalInfo
    public final com.gemalto.mfs.mwsdk.payment.engine.CdcvmSupported getcdcvmSupported() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i ^ 117) + ((i & 117) << 1);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        byte[] bArr = this.getHighSpeedVideoSizes;
        return com.gemalto.mfs.mwsdk.payment.engine.CdcvmSupported.get(i2 % 2 == 0 ? bArr[0] : bArr[0]);
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.MasterCardTerminalInfo
    public final com.gemalto.mfs.mwsdk.payment.engine.TwoTapSupported get2TapSupported() {
        int i = getHighSpeedVideoFpsRanges + 5;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        byte[] bArr = this.getOutputFormats;
        return com.gemalto.mfs.mwsdk.payment.engine.TwoTapSupported.get(i % 2 == 0 ? bArr[1] : bArr[0]);
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.MasterCardTerminalInfo
    public final com.gemalto.mfs.mwsdk.payment.engine.TerminalTechnology getTerminalTechnology() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRanges = (((i | 101) << 1) - (i ^ 101)) % 128;
        com.gemalto.mfs.mwsdk.payment.engine.TerminalTechnology terminalTechnology = com.gemalto.mfs.mwsdk.payment.engine.TerminalTechnology.get(this.getInputSizeshNQ4ISI[0]);
        int identityHashCode = java.lang.System.identityHashCode(this);
        int i2 = ~((identityHashCode ^ (-265361795)) | (identityHashCode & (-265361795)));
        int identityHashCode2 = java.lang.System.identityHashCode(this);
        int i3 = ((identityHashCode2 ^ 1969753898) | (identityHashCode2 & 1969753898)) * (-50);
        int i4 = (i3 ^ 943211310) + ((i3 & 943211310) << 1);
        int i5 = ~((-1413482785) | identityHashCode2);
        int i6 = ~identityHashCode2;
        int i7 = i6 | 598669007;
        int i8 = ~((i7 ^ 1969753898) | (i7 & 1969753898));
        int i9 = -(-(((i5 ^ i8) | (i5 & i8)) * 50));
        int i10 = ((i4 | i9) << 1) - (i9 ^ i4);
        int i11 = ~((i6 ^ 598669007) | (598669007 & i6));
        int i12 = (i11 ^ (-2012151792)) | (i11 & (-2012151792));
        int i13 = ~((i6 ^ 1969753898) | (i6 & 1969753898));
        int i14 = ((i13 ^ i12) | (i13 & i12)) * 50;
        if ((768276027 - (~(-(-((685655362 | i2) * (-658)))))) + (((i2 ^ 147849474) | (i2 & 147849474)) * 658) <= ((i10 | i14) << 1) - (i14 ^ i10)) {
            return terminalTechnology;
        }
        throw null;
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.MasterCardTerminalInfo
    public final com.gemalto.mfs.mwsdk.payment.engine.TerminalType getTerminalType() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = ((i | 107) << 1) - (i ^ 107);
        getHighSpeedVideoFpsRanges = i2 % 128;
        int i3 = i2 % 2;
        byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
        com.gemalto.mfs.mwsdk.payment.engine.TerminalType terminalType = com.gemalto.mfs.mwsdk.payment.engine.TerminalType.get(i3 != 0 ? bArr[1] : bArr[0]);
        int i4 = getHighResolutionOutputSizeshNQ4ISI;
        int i5 = (i4 & 21) + (i4 | 21);
        getHighSpeedVideoFpsRanges = i5 % 128;
        if (i5 % 2 == 0) {
            return terminalType;
        }
        throw new java.lang.ArithmeticException();
    }
}
