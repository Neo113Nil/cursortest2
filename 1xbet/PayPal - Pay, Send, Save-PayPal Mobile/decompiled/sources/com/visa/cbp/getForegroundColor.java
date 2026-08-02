package com.visa.cbp;

/* loaded from: classes5.dex */
public abstract class getForegroundColor implements com.visa.cbp.getContentType {
    private long getHighResolutionOutputSizeshNQ4ISI;
    private final byte[] getHighSpeedVideoSizes = new byte[4];
    private int Camera2StreamConfigurationMap = 0;

    protected abstract void BuildConfig(long j);

    protected abstract void ConfirmReplenishRequest();

    protected abstract void ConfirmReplenishRequest(byte[] bArr, int i);

    protected getForegroundColor() {
    }

    private void getHighResolutionOutputSizeshNQ4ISI(byte b) {
        byte[] bArr = this.getHighSpeedVideoSizes;
        int i = this.Camera2StreamConfigurationMap;
        int i2 = i + 1;
        this.Camera2StreamConfigurationMap = i2;
        bArr[i] = b;
        if (i2 == bArr.length) {
            ConfirmReplenishRequest(bArr, 0);
            this.Camera2StreamConfigurationMap = 0;
        }
        this.getHighResolutionOutputSizeshNQ4ISI++;
    }

    @Override // com.visa.cbp.getAdditionalProperties
    public final void valueOf(byte[] bArr, int i) {
        int i2 = 0;
        int max = java.lang.Math.max(0, i);
        if (this.Camera2StreamConfigurationMap != 0) {
            int i3 = 0;
            while (true) {
                if (i3 >= max) {
                    i2 = i3;
                    break;
                }
                byte[] bArr2 = this.getHighSpeedVideoSizes;
                int i4 = this.Camera2StreamConfigurationMap;
                int i5 = i4 + 1;
                this.Camera2StreamConfigurationMap = i5;
                int i6 = i3 + 1;
                bArr2[i4] = bArr[i3];
                if (i5 == 4) {
                    ConfirmReplenishRequest(bArr2, 0);
                    this.Camera2StreamConfigurationMap = 0;
                    i2 = i6;
                    break;
                }
                i3 = i6;
            }
        }
        int i7 = i2;
        while (i7 < ((max - i2) & (-4)) + i2) {
            ConfirmReplenishRequest(bArr, i7);
            i7 += 4;
        }
        while (i7 < max) {
            byte[] bArr3 = this.getHighSpeedVideoSizes;
            int i8 = this.Camera2StreamConfigurationMap;
            this.Camera2StreamConfigurationMap = i8 + 1;
            bArr3[i8] = bArr[i7];
            i7++;
        }
        this.getHighResolutionOutputSizeshNQ4ISI += max;
    }

    public final void valueOf() {
        long j = this.getHighResolutionOutputSizeshNQ4ISI;
        getHighResolutionOutputSizeshNQ4ISI(Byte.MIN_VALUE);
        while (this.Camera2StreamConfigurationMap != 0) {
            getHighResolutionOutputSizeshNQ4ISI((byte) 0);
        }
        BuildConfig(j << 3);
        ConfirmReplenishRequest();
    }

    @Override // com.visa.cbp.getAdditionalProperties
    public void ReplenishAckRequest() {
        this.getHighResolutionOutputSizeshNQ4ISI = 0L;
        this.Camera2StreamConfigurationMap = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.getHighSpeedVideoSizes;
            if (i >= bArr.length) {
                return;
            }
            bArr[i] = 0;
            i++;
        }
    }
}
