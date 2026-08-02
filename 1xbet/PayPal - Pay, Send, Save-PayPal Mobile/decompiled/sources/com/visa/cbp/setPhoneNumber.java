package com.visa.cbp;

/* loaded from: classes16.dex */
class setPhoneNumber {
    byte getHighSpeedVideoSizes = 0;
    byte getHighSpeedVideoFpsRanges = 1;

    short getHighSpeedVideoFpsRanges(short s) {
        return s < 144 ? (short) (s + 154) : s;
    }

    setPhoneNumber() {
    }

    boolean getHighSpeedVideoSizes(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        if (bArr == null) {
            return true;
        }
        if (bArr2 == null) {
            return false;
        }
        int i4 = i;
        while (i4 < i + i3) {
            if (bArr2[i2] != bArr[i4]) {
                return false;
            }
            i4++;
            i2++;
        }
        return true;
    }

    java.lang.String getHighSpeedVideoSizes(byte[] bArr, int i, int i2, java.lang.String str) {
        if (bArr != null) {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(i2);
            for (int i3 = 0; i3 < i2; i3++) {
                java.lang.String hexString = java.lang.Integer.toHexString(bArr[i3 + i] & 255);
                if (hexString.length() == 1) {
                    hexString = "0".concat(java.lang.String.valueOf(hexString));
                }
                java.lang.String upperCase = hexString.toUpperCase(java.util.Locale.US);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(upperCase);
                sb.append(str);
                stringBuffer.append(sb.toString());
            }
            return stringBuffer.toString();
        }
        return "";
    }

    java.lang.String getHighSpeedVideoFpsRangesFor(byte[] bArr) {
        if (bArr != null) {
            return getHighSpeedVideoSizes(bArr, 0, bArr.length, " ");
        }
        return "";
    }

    short getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, short s, short[] sArr) {
        short s2;
        short s3;
        try {
            if ((bArr[s] & com.google.common.base.Ascii.US) == 31) {
                s3 = s;
                do {
                    s3 = (short) (s3 + 1);
                    try {
                    } catch (java.lang.Exception unused) {
                        s2 = s3;
                    }
                } while ((bArr[s3] & 128) == 128);
            } else {
                s3 = s;
            }
            short s4 = (short) (s3 + 1);
            short s5 = (short) (s4 - s);
            if (s5 == 1) {
                sArr[this.getHighSpeedVideoSizes] = (short) (bArr[s] & 255);
            } else if (s5 == 2) {
                sArr[this.getHighSpeedVideoSizes] = (short) ((((short) (bArr[s] & 255)) << 8) + ((short) (bArr[(short) (s + 1)] & 255)));
            }
            byte b = this.getHighSpeedVideoFpsRanges;
            sArr[b] = 0;
            byte b2 = bArr[s4];
            if ((b2 & Byte.MIN_VALUE) != 0) {
                int i = b2 & Byte.MAX_VALUE;
                while (true) {
                    short s6 = (short) i;
                    if (s6 <= 0) {
                        break;
                    }
                    s4 = (short) (s4 + 1);
                    short s7 = bArr[s4];
                    byte b3 = this.getHighSpeedVideoFpsRanges;
                    short s8 = sArr[b3];
                    if (s7 < 0) {
                        s7 = (short) (s7 + com.visa.cbp.getEncExpo.initializeViewTreeOwners);
                    }
                    short s9 = (short) (s8 + s7);
                    sArr[b3] = s9;
                    if (s6 > 1) {
                        sArr[b3] = (short) (s9 << 8);
                    }
                    i = s6 - 1;
                }
            } else {
                sArr[b] = b2;
            }
            s2 = (short) (s4 + 1);
        } catch (java.lang.Exception unused2) {
            s2 = s;
        }
        return (short) (s2 - s);
    }

    byte[] Camera2StreamConfigurationMap(java.lang.String str) {
        try {
            int length = str.length();
            if (length % 2 != 0) {
                str = "0".concat(java.lang.String.valueOf(str));
                length = str.length();
            }
            byte[] bArr = new byte[length / 2];
            for (int i = 0; i < length; i += 2) {
                bArr[i / 2] = (byte) ((java.lang.Character.digit(str.charAt(i), 16) << 4) | java.lang.Character.digit(str.charAt(i + 1), 16));
            }
            return bArr;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    short getHighSpeedVideoFpsRanges(java.lang.String str, byte[] bArr, short s, int i) {
        short length = (short) ((str.length() + (str.length() % 2)) / 2);
        int i2 = 0;
        if (length < i) {
            int i3 = 0;
            while (i3 < i - length) {
                bArr[s] = 0;
                i3++;
                s = (short) (s + 1);
            }
        }
        if (str.length() % 2 != 0) {
            bArr[s] = (byte) (str.charAt(0) - '0');
            i2 = 1;
            s = (short) (s + 1);
        }
        while (i2 < str.length()) {
            bArr[s] = (byte) (((str.charAt(i2) - '0') << 4) | (str.charAt(i2 + 1) - '0'));
            s = (short) (s + 1);
            i2 += 2;
        }
        return s;
    }

    void Camera2StreamConfigurationMap(byte[] bArr, short s, byte[] bArr2, short s2, short s3) {
        for (int i = 0; i < s3; i++) {
            bArr2[s2 + i] = bArr[s + i];
        }
    }
}
