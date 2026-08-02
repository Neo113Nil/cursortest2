package kotlin.io.encoding;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u0014\u0010\u0006\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u0014\u0010\f\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007\"\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000b"}, d2 = {"", "symbol", "", "isInMimeAlphabet", "(I)Z", "", "getHighSpeedVideoSizes", "[B", "getHighSpeedVideoFpsRanges", "", "getHighResolutionOutputSizeshNQ4ISI", "[I", "Camera2StreamConfigurationMap"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class Base64Kt {
    private static final int[] Camera2StreamConfigurationMap;
    private static final int[] getHighResolutionOutputSizeshNQ4ISI;
    private static final byte[] getHighSpeedVideoFpsRanges;
    private static final byte[] getHighSpeedVideoSizes;

    static {
        byte[] bArr = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 113, 114, 115, 116, 117, 118, com.visa.cbp.getEncExpo.IResultReceiver, 120, 121, 122, 48, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 56, 57, 43, 47};
        getHighSpeedVideoSizes = bArr;
        int[] iArr = new int[256];
        kotlin.collections.ArraysKt.fill$default(iArr, -1, 0, 0, 6, (java.lang.Object) null);
        iArr[61] = -2;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < 64) {
            iArr[bArr[i2]] = i3;
            i2++;
            i3++;
        }
        getHighResolutionOutputSizeshNQ4ISI = iArr;
        byte[] bArr2 = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 113, 114, 115, 116, 117, 118, com.visa.cbp.getEncExpo.IResultReceiver, 120, 121, 122, 48, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 56, 57, 45, com.visa.cbp.getEncExpo.addOnTrimMemoryListener};
        getHighSpeedVideoFpsRanges = bArr2;
        int[] iArr2 = new int[256];
        kotlin.collections.ArraysKt.fill$default(iArr2, -1, 0, 0, 6, (java.lang.Object) null);
        iArr2[61] = -2;
        int i4 = 0;
        while (i < 64) {
            iArr2[bArr2[i]] = i4;
            i++;
            i4++;
        }
        Camera2StreamConfigurationMap = iArr2;
    }

    public static final boolean isInMimeAlphabet(int i) {
        if (i < 0) {
            return false;
        }
        int[] iArr = getHighResolutionOutputSizeshNQ4ISI;
        return i < iArr.length && iArr[i] != -1;
    }
}
