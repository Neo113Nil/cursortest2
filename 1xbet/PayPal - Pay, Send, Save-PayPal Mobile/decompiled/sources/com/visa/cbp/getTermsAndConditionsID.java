package com.visa.cbp;

/* loaded from: classes5.dex */
public final class getTermsAndConditionsID implements com.visa.cbp.setShortDescription {
    private byte[] getHighResolutionOutputSizeshNQ4ISI = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 113, 114, 115, 116, 117, 118, com.visa.cbp.getEncExpo.IResultReceiver, 120, 121, 122, 48, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 56, 57, 43, 47};
    private byte Camera2StreamConfigurationMap = kotlin.io.encoding.Base64.padSymbol;
    private byte[] getHighSpeedVideoSizes = new byte[128];

    public getTermsAndConditionsID() {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.getHighSpeedVideoSizes;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = -1;
            i2++;
        }
        while (true) {
            byte[] bArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i >= bArr2.length) {
                return;
            }
            this.getHighSpeedVideoSizes[bArr2[i]] = (byte) i;
            i++;
        }
    }

    @Override // com.visa.cbp.setShortDescription
    public final int ConfirmReplenishRequest(byte[] bArr, int i, int i2, java.io.OutputStream outputStream) throws java.io.IOException {
        int i3 = i2 % 3;
        int i4 = i2 - i3;
        for (int i5 = 0; i5 < i4; i5 += 3) {
            int i6 = bArr[i5] & 255;
            int i7 = bArr[i5 + 1] & 255;
            byte b = bArr[i5 + 2];
            outputStream.write(this.getHighResolutionOutputSizeshNQ4ISI[(i6 >>> 2) & 63]);
            outputStream.write(this.getHighResolutionOutputSizeshNQ4ISI[((i6 << 4) | (i7 >>> 4)) & 63]);
            outputStream.write(this.getHighResolutionOutputSizeshNQ4ISI[((i7 << 2) | ((b & 255) >>> 6)) & 63]);
            outputStream.write(this.getHighResolutionOutputSizeshNQ4ISI[b & 63]);
        }
        if (i3 == 1) {
            int i8 = bArr[i4] & 255;
            outputStream.write(this.getHighResolutionOutputSizeshNQ4ISI[(i8 >>> 2) & 63]);
            outputStream.write(this.getHighResolutionOutputSizeshNQ4ISI[(i8 << 4) & 63]);
            outputStream.write(this.Camera2StreamConfigurationMap);
            outputStream.write(this.Camera2StreamConfigurationMap);
        } else if (i3 == 2) {
            int i9 = bArr[i4] & 255;
            int i10 = bArr[i4 + 1] & 255;
            outputStream.write(this.getHighResolutionOutputSizeshNQ4ISI[(i9 >>> 2) & 63]);
            outputStream.write(this.getHighResolutionOutputSizeshNQ4ISI[((i9 << 4) | (i10 >>> 4)) & 63]);
            outputStream.write(this.getHighResolutionOutputSizeshNQ4ISI[(i10 << 2) & 63]);
            outputStream.write(this.Camera2StreamConfigurationMap);
        }
        return ((i4 / 3) << 2) + (i3 != 0 ? 4 : 0);
    }
}
