package util.h.xy.al;

/* loaded from: classes5.dex */
public final class rb {
    private static int Camera2StreamConfigurationMap = 1;
    private static final char[] getHighSpeedVideoFpsRanges = {com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static int getHighSpeedVideoFpsRangesFor = 4;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static byte[] m25017(java.lang.String str) {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRangesFor = (((i | 125) << 1) - (i ^ 125)) % 128;
        int length = str.length();
        if (length % 2 != 0) {
            throw new java.lang.IllegalArgumentException(util.h.xy.al.ra.f859);
        }
        int i2 = length / 2;
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int i4 = getHighSpeedVideoFpsRangesFor;
            Camera2StreamConfigurationMap = ((i4 ^ 93) + ((i4 & 93) << 1)) % 128;
            int i5 = i3 * 2;
            bArr[i3] = (byte) java.lang.Integer.parseInt(str.substring(i5, i5 + 2), 16);
            i3 = ((i3 & 72) + (i3 | 72)) - 71;
            getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 67) % 128;
        }
        return bArr;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static java.lang.String m25016(byte[] bArr) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 103) % 128;
        int i = 0;
        while (i < bArr.length) {
            int i2 = getHighSpeedVideoFpsRangesFor + 15;
            Camera2StreamConfigurationMap = i2 % 128;
            if (i2 % 2 == 0) {
                char[] cArr = getHighSpeedVideoFpsRanges;
                byte b = bArr[i];
                char c = cArr[(b & 1106) >> 4];
                char c2 = cArr[b & 67];
                stringBuffer.append(c);
                stringBuffer.append(c2);
                i += 17;
            } else {
                char[] cArr2 = getHighSpeedVideoFpsRanges;
                byte b2 = bArr[i];
                char c3 = cArr2[(b2 & com.visa.cbp.getEncExpo.onUnminimized) >> 4];
                char c4 = cArr2[b2 & com.google.common.base.Ascii.SI];
                stringBuffer.append(c3);
                stringBuffer.append(c4);
                int i3 = (i ^ 5) + ((i & 5) << 1);
                i = ((i3 | (-4)) << 1) - (i3 ^ (-4));
            }
            int i4 = Camera2StreamConfigurationMap;
            getHighSpeedVideoFpsRangesFor = (((i4 | 37) << 1) - (i4 ^ 37)) % 128;
        }
        return stringBuffer.toString();
    }

    static {
        int i = 4 % 2;
    }
}
