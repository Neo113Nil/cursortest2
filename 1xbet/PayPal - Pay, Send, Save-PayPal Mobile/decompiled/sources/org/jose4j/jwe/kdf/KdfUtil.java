package org.jose4j.jwe.kdf;

/* loaded from: classes18.dex */
public class KdfUtil {
    private org.jose4j.jwe.kdf.ConcatenationKeyDerivationFunctionWithSha256 Camera2StreamConfigurationMap;
    private org.jose4j.base64url.Base64Url getHighSpeedVideoFpsRanges;

    public KdfUtil() {
        this(null);
    }

    public KdfUtil(java.lang.String str) {
        this.getHighSpeedVideoFpsRanges = new org.jose4j.base64url.Base64Url();
        this.Camera2StreamConfigurationMap = org.jose4j.jwe.kdf.ConcatKeyDerivationFunctionFactory.getHighResolutionOutputSizeshNQ4ISI(str);
    }

    public byte[] kdf(byte[] bArr, int i, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return this.Camera2StreamConfigurationMap.kdf(bArr, i, org.jose4j.lang.ByteUtil.concat(getHighResolutionOutputSizeshNQ4ISI(org.jose4j.lang.StringUtil.getBytesUtf8(str)), getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges.base64UrlDecode(str2)), getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges.base64UrlDecode(str3)), org.jose4j.lang.ByteUtil.getBytes(i), org.jose4j.lang.ByteUtil.EMPTY_BYTES));
    }

    private static byte[] getHighResolutionOutputSizeshNQ4ISI(byte[] bArr) {
        if (bArr == null) {
            bArr = org.jose4j.lang.ByteUtil.EMPTY_BYTES;
        }
        return org.jose4j.lang.ByteUtil.concat(org.jose4j.lang.ByteUtil.getBytes(bArr.length), bArr);
    }
}
