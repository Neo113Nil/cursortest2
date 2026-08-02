package org.bouncycastle.crypto.generators;

/* loaded from: classes17.dex */
public class OpenBSDBCrypt {
    private static final byte[] getHighResolutionOutputSizeshNQ4ISI = {46, 47, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 113, 114, 115, 116, 117, 118, com.visa.cbp.getEncExpo.IResultReceiver, 120, 121, 122, 48, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 56, 57};
    private static final byte[] getHighSpeedVideoFpsRangesFor = new byte[128];
    private static final java.util.Set<java.lang.String> getHighSpeedVideoSizes;

    private static boolean Camera2StreamConfigurationMap(java.lang.String str, byte[] bArr) {
        java.lang.String substring;
        if (str == null) {
            throw new java.lang.IllegalArgumentException("Missing bcryptString.");
        }
        if (str.charAt(1) != '2') {
            throw new java.lang.IllegalArgumentException("not a Bcrypt string");
        }
        int length = str.length();
        if (length != 60 && (length != 59 || str.charAt(2) != '$')) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Bcrypt String length: ");
            sb.append(length);
            sb.append(", 60 required.");
            throw new org.bouncycastle.crypto.DataLengthException(sb.toString());
        }
        int i = 3;
        if (str.charAt(2) == '$') {
            if (str.charAt(0) != '$' || str.charAt(5) != '$') {
                throw new java.lang.IllegalArgumentException("Invalid Bcrypt String format.");
            }
        } else if (str.charAt(0) != '$' || str.charAt(3) != '$' || str.charAt(6) != '$') {
            throw new java.lang.IllegalArgumentException("Invalid Bcrypt String format.");
        }
        if (str.charAt(2) == '$') {
            substring = str.substring(1, 2);
        } else {
            substring = str.substring(1, 3);
            i = 4;
        }
        if (!getHighSpeedVideoSizes.contains(substring)) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Bcrypt version '");
            sb2.append(substring);
            sb2.append("' is not supported by this implementation");
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
        java.lang.String substring2 = str.substring(i, i + 2);
        try {
            int parseInt = java.lang.Integer.parseInt(substring2);
            if (parseInt < 4 || parseInt > 31) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Invalid cost factor: ");
                sb3.append(parseInt);
                sb3.append(", 4 < cost < 31 expected.");
                throw new java.lang.IllegalArgumentException(sb3.toString());
            }
            char[] charArray = str.substring(str.lastIndexOf(36) + 1, length - 31).toCharArray();
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(16);
            if (charArray.length != 22) {
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Invalid base64 salt length: ");
                sb4.append(charArray.length);
                sb4.append(" , 22 required.");
                throw new org.bouncycastle.crypto.DataLengthException(sb4.toString());
            }
            for (char c : charArray) {
                if (c > 'z' || c < '.' || (c > '9' && c < 'A')) {
                    throw new java.lang.IllegalArgumentException("Salt string contains invalid character: ".concat(java.lang.String.valueOf((int) c)));
                }
            }
            char[] cArr = new char[24];
            java.lang.System.arraycopy(charArray, 0, cArr, 0, charArray.length);
            for (int i2 = 0; i2 < 24; i2 += 4) {
                byte[] bArr2 = getHighSpeedVideoFpsRangesFor;
                byte b = bArr2[cArr[i2]];
                byte b2 = bArr2[cArr[i2 + 1]];
                byte b3 = bArr2[cArr[i2 + 2]];
                byte b4 = bArr2[cArr[i2 + 3]];
                byteArrayOutputStream.write((b << 2) | (b2 >> 4));
                byteArrayOutputStream.write((b2 << 4) | (b3 >> 2));
                byteArrayOutputStream.write(b4 | (b3 << 6));
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byte[] bArr3 = new byte[16];
            java.lang.System.arraycopy(byteArray, 0, bArr3, 0, 16);
            return org.bouncycastle.util.Strings.constantTimeAreEqual(str, getHighSpeedVideoFpsRanges(substring, bArr, bArr3, parseInt));
        } catch (java.lang.NumberFormatException unused) {
            throw new java.lang.IllegalArgumentException("Invalid cost factor: ".concat(java.lang.String.valueOf(substring2)));
        }
    }

    public static java.lang.String generate(char[] cArr, byte[] bArr, int i) {
        return generate("2y", cArr, bArr, i);
    }

    public static java.lang.String generate(byte[] bArr, byte[] bArr2, int i) {
        return generate("2y", bArr, bArr2, i);
    }

    public static java.lang.String generate(java.lang.String str, char[] cArr, byte[] bArr, int i) {
        if (cArr != null) {
            return getHighSpeedVideoFpsRanges(str, org.bouncycastle.util.Strings.toUTF8ByteArray(cArr), bArr, i);
        }
        throw new java.lang.IllegalArgumentException("Password required.");
    }

    public static java.lang.String generate(java.lang.String str, byte[] bArr, byte[] bArr2, int i) {
        if (bArr != null) {
            return getHighSpeedVideoFpsRanges(str, org.bouncycastle.util.Arrays.clone(bArr), bArr2, i);
        }
        throw new java.lang.IllegalArgumentException("Password required.");
    }

    private static void getHighSpeedVideoSizes(java.lang.StringBuilder sb, byte[] bArr) {
        boolean z;
        if (bArr.length != 24 && bArr.length != 16) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Invalid length: ");
            sb2.append(bArr.length);
            sb2.append(", 24 for key or 16 for salt expected");
            throw new org.bouncycastle.crypto.DataLengthException(sb2.toString());
        }
        if (bArr.length == 16) {
            byte[] bArr2 = new byte[18];
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            bArr = bArr2;
            z = true;
        } else {
            bArr[bArr.length - 1] = 0;
            z = false;
        }
        int length = bArr.length;
        for (int i = 0; i < length; i += 3) {
            int i2 = bArr[i] & 255;
            int i3 = bArr[i + 1] & 255;
            byte b = bArr[i + 2];
            byte[] bArr3 = getHighResolutionOutputSizeshNQ4ISI;
            sb.append((char) bArr3[(i2 >>> 2) & 63]);
            sb.append((char) bArr3[((i2 << 4) | (i3 >>> 4)) & 63]);
            sb.append((char) bArr3[((i3 << 2) | ((b & 255) >>> 6)) & 63]);
            sb.append((char) bArr3[b & 63]);
        }
        int length2 = sb.length();
        sb.setLength(z ? length2 - 2 : length2 - 1);
    }

    private static java.lang.String getHighSpeedVideoFpsRanges(java.lang.String str, byte[] bArr, byte[] bArr2, int i) {
        if (!getHighSpeedVideoSizes.contains(str)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Version ");
            sb.append(str);
            sb.append(" is not accepted by this implementation.");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (bArr2 == null) {
            throw new java.lang.IllegalArgumentException("Salt required.");
        }
        if (bArr2.length != 16) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("16 byte salt required: ");
            sb2.append(bArr2.length);
            throw new org.bouncycastle.crypto.DataLengthException(sb2.toString());
        }
        if (i < 4 || i > 31) {
            throw new java.lang.IllegalArgumentException("Invalid cost factor.");
        }
        int length = bArr.length < 72 ? bArr.length + 1 : 72;
        byte[] bArr3 = new byte[length];
        if (length > bArr.length) {
            length = bArr.length;
        }
        java.lang.System.arraycopy(bArr, 0, bArr3, 0, length);
        org.bouncycastle.util.Arrays.fill(bArr, (byte) 0);
        java.lang.String highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(str, bArr3, bArr2, i);
        org.bouncycastle.util.Arrays.fill(bArr3, (byte) 0);
        return highSpeedVideoFpsRangesFor;
    }

    private static java.lang.String getHighSpeedVideoFpsRangesFor(java.lang.String str, byte[] bArr, byte[] bArr2, int i) {
        if (!getHighSpeedVideoSizes.contains(str)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Version ");
            sb.append(str);
            sb.append(" is not accepted by this implementation.");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(60);
        sb2.append(kotlin.text.Typography.dollar);
        sb2.append(str);
        sb2.append(kotlin.text.Typography.dollar);
        sb2.append(i < 10 ? "0".concat(java.lang.String.valueOf(i)) : java.lang.Integer.toString(i));
        sb2.append(kotlin.text.Typography.dollar);
        getHighSpeedVideoSizes(sb2, bArr2);
        getHighSpeedVideoSizes(sb2, org.bouncycastle.crypto.generators.BCrypt.generate(bArr, bArr2, i));
        return sb2.toString();
    }

    public static boolean checkPassword(java.lang.String str, char[] cArr) {
        if (cArr != null) {
            return Camera2StreamConfigurationMap(str, org.bouncycastle.util.Strings.toUTF8ByteArray(cArr));
        }
        throw new java.lang.IllegalArgumentException("Missing password.");
    }

    public static boolean checkPassword(java.lang.String str, byte[] bArr) {
        if (bArr != null) {
            return Camera2StreamConfigurationMap(str, org.bouncycastle.util.Arrays.clone(bArr));
        }
        throw new java.lang.IllegalArgumentException("Missing password.");
    }

    private OpenBSDBCrypt() {
    }

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        getHighSpeedVideoSizes = hashSet;
        hashSet.add(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D);
        hashSet.add("2x");
        hashSet.add("2a");
        hashSet.add("2y");
        hashSet.add("2b");
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = getHighSpeedVideoFpsRangesFor;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = -1;
            i2++;
        }
        while (true) {
            byte[] bArr2 = getHighResolutionOutputSizeshNQ4ISI;
            if (i >= bArr2.length) {
                return;
            }
            getHighSpeedVideoFpsRangesFor[bArr2[i]] = (byte) i;
            i++;
        }
    }
}
