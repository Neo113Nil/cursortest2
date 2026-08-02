package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public abstract class BERGenerator extends org.bouncycastle.asn1.ASN1Generator {
    private int Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRangesFor;

    protected void writeBERHeader(int i) throws java.io.IOException {
        if (!this.getHighResolutionOutputSizeshNQ4ISI) {
            this._out.write(i);
            this._out.write(128);
            return;
        }
        int i2 = this.Camera2StreamConfigurationMap;
        if (this.getHighSpeedVideoFpsRangesFor) {
            this._out.write(i2 | 160);
            this._out.write(128);
        } else {
            if ((i & 32) == 0) {
                this._out.write(i2 | 128);
                this._out.write(128);
                return;
            }
            i = i2 | 160;
        }
        this._out.write(i);
        this._out.write(128);
    }

    protected void writeBEREnd() throws java.io.IOException {
        this._out.write(0);
        this._out.write(0);
        if (this.getHighResolutionOutputSizeshNQ4ISI && this.getHighSpeedVideoFpsRangesFor) {
            this._out.write(0);
            this._out.write(0);
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Generator
    public java.io.OutputStream getRawOutputStream() {
        return this._out;
    }

    protected BERGenerator(java.io.OutputStream outputStream, int i, boolean z) {
        super(outputStream);
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        this.getHighSpeedVideoFpsRangesFor = z;
        this.Camera2StreamConfigurationMap = i;
    }

    protected BERGenerator(java.io.OutputStream outputStream) {
        super(outputStream);
        this.getHighResolutionOutputSizeshNQ4ISI = false;
    }
}
