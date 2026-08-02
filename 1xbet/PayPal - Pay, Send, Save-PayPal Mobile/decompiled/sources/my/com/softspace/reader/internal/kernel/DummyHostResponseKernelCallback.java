package my.com.softspace.reader.internal.kernel;

/* loaded from: classes17.dex */
class DummyHostResponseKernelCallback implements my.com.softspace.reader.internal.kernel.Kernel.Callback {
    private final byte[] Camera2StreamConfigurationMap;
    private final byte[] getHighSpeedVideoFpsRanges;
    private final my.com.softspace.reader.internal.kernel.Kernel.Callback getHighSpeedVideoFpsRangesFor;
    private boolean getHighSpeedVideoSizes;

    public DummyHostResponseKernelCallback(my.com.softspace.reader.internal.kernel.Kernel.Callback callback, byte[] bArr, byte[] bArr2) {
        java.util.Objects.requireNonNull(callback);
        this.getHighSpeedVideoFpsRangesFor = callback;
        this.Camera2StreamConfigurationMap = bArr;
        this.getHighSpeedVideoSizes = false;
        this.getHighSpeedVideoFpsRanges = bArr2;
    }

    @Override // my.com.softspace.reader.internal.kernel.Kernel.Callback
    public byte[] exchangeAPDU(byte[] bArr) throws java.io.IOException {
        try {
            return this.getHighSpeedVideoFpsRangesFor.exchangeAPDU(bArr);
        } catch (java.io.IOException e) {
            this.getHighSpeedVideoSizes = true;
            throw e;
        }
    }

    @Override // my.com.softspace.reader.internal.kernel.Kernel.Callback
    public int updateUI(int i) {
        return this.getHighSpeedVideoFpsRangesFor.updateUI(i);
    }

    @Override // my.com.softspace.reader.internal.kernel.Kernel.Callback
    public byte[] sendOnlineAuthentication(byte[] bArr, byte[] bArr2) throws java.lang.Exception {
        this.getHighSpeedVideoFpsRangesFor.sendOnlineAuthentication(bArr, bArr2);
        byte[] bArr3 = {0, 0, -118, 0, 2, 0, 0};
        byte[] bArr4 = this.Camera2StreamConfigurationMap;
        bArr3[5] = bArr4[0];
        byte b = bArr4[1];
        bArr3[6] = b;
        if (b == 50) {
            throw new java.io.IOException();
        }
        my.com.softspace.reader.ILogger logger = my.com.softspace.reader.TEEReaderEngine.getInstance().getLogger();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[sendOnlineAuthentication] response: ");
        sb.append(my.com.softspace.reader.internal.kernelconfig.HexUtil.byteArrayToHexString(bArr3));
        logger.i("sskernel-config", sb.toString());
        if (this.getHighSpeedVideoFpsRanges == null) {
            return bArr3;
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(this.getHighSpeedVideoFpsRanges.length + 11);
        try {
            byteArrayOutputStream.write(bArr3);
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(145);
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(this.getHighSpeedVideoFpsRanges.length);
            byteArrayOutputStream.write(this.getHighSpeedVideoFpsRanges);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (java.lang.Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // my.com.softspace.reader.internal.kernel.Kernel.Callback
    public boolean isReadCardError() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // my.com.softspace.reader.internal.kernel.Kernel.Callback
    public void setReadCardError(boolean z) {
        this.getHighSpeedVideoSizes = z;
    }
}
