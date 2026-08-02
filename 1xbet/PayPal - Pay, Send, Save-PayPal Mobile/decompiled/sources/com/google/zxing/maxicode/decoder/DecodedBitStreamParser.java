package com.google.zxing.maxicode.decoder;

/* loaded from: classes9.dex */
final class DecodedBitStreamParser {
    private static final char ECI = 65530;
    private static final char FS = 28;
    private static final char GS = 29;
    private static final char LATCHA = 65527;
    private static final char LATCHB = 65528;
    private static final char LOCK = 65529;
    private static final char NS = 65531;
    private static final char PAD = 65532;
    private static final char RS = 30;
    private static final char SHIFTA = 65520;
    private static final char SHIFTB = 65521;
    private static final char SHIFTC = 65522;
    private static final char SHIFTD = 65523;
    private static final char SHIFTE = 65524;
    private static final char THREESHIFTA = 65526;
    private static final char TWOSHIFTA = 65525;
    private static final byte[] COUNTRY_BYTES = {org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 43, 44, 45, 46, 47, 48, 37, 38};
    private static final byte[] SERVICE_CLASS_BYTES = {org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 56, 57, 58, 59, 60, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE};
    private static final byte[] POSTCODE_2_LENGTH_BYTES = {39, 40, 41, 42, com.google.common.base.Ascii.US, 32};
    private static final byte[] POSTCODE_2_BYTES = {33, 34, 35, 36, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.RS, 19, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.CAN, 13, 14, com.google.common.base.Ascii.SI, 16, 17, 18, 7, 8, 9, 10, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.FF, 1, 2};
    private static final byte[][] POSTCODE_3_BYTES = {new byte[]{39, 40, 41, 42, com.google.common.base.Ascii.US, 32}, new byte[]{33, 34, 35, 36, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.SUB}, new byte[]{com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.RS, 19, com.google.common.base.Ascii.DC4}, new byte[]{com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.CAN, 13, 14}, new byte[]{com.google.common.base.Ascii.SI, 16, 17, 18, 7, 8}, new byte[]{9, 10, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.FF, 1, 2}};
    private static final java.lang.String[] SETS = {"\rABCDEFGHIJKLMNOPQRSTUVWXYZ\ufffa\u001c\u001d\u001e\ufffb ￼\"#$%&'()*+,-./0123456789:\ufff1\ufff2\ufff3\ufff4\ufff8", "`abcdefghijklmnopqrstuvwxyz\ufffa\u001c\u001d\u001e\ufffb{￼}~\u007f;<=>?[\\]^_ ,./:@!|￼\ufff5\ufff6￼\ufff0\ufff2\ufff3\ufff4\ufff7", "ÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚ\ufffa\u001c\u001d\u001e\ufffbÛÜÝÞßª¬±²³µ¹º¼½¾\u0080\u0081\u0082\u0083\u0084\u0085\u0086\u0087\u0088\u0089\ufff7 \ufff9\ufff3\ufff4\ufff8", "àáâãäåæçèéêëìíîïðñòóôõö÷øùú\ufffa\u001c\u001d\u001e\ufffbûüýþÿ¡¨«¯°´·¸»¿\u008a\u008b\u008c\u008d\u008e\u008f\u0090\u0091\u0092\u0093\u0094\ufff7 \ufff2\ufff9\ufff4\ufff8", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\ufffa￼￼\u001b\ufffb\u001c\u001d\u001e\u001f\u009f ¢£¤¥¦§©\u00ad®¶\u0095\u0096\u0097\u0098\u0099\u009a\u009b\u009c\u009d\u009e\ufff7 \ufff2\ufff3\ufff9\ufff8"};

    private DecodedBitStreamParser() {
    }

    static com.google.zxing.common.DecoderResult decode(byte[] bArr, int i) throws com.google.zxing.FormatException {
        java.lang.String postCode3;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(144);
        if (i == 2 || i == 3) {
            if (i == 2) {
                int postCode2 = getPostCode2(bArr);
                int postCode2Length = getPostCode2Length(bArr);
                if (postCode2Length > 10) {
                    throw com.google.zxing.FormatException.getFormatInstance();
                }
                postCode3 = new java.text.DecimalFormat("0000000000".substring(0, postCode2Length)).format(postCode2);
            } else {
                postCode3 = getPostCode3(bArr);
            }
            java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat("000");
            java.lang.String format = decimalFormat.format(getCountry(bArr));
            java.lang.String format2 = decimalFormat.format(getServiceClass(bArr));
            sb.append(getMessage(bArr, 10, 84));
            if (sb.toString().startsWith("[)>\u001e01\u001d")) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(postCode3);
                sb2.append(GS);
                sb2.append(format);
                sb2.append(GS);
                sb2.append(format2);
                sb2.append(GS);
                sb.insert(9, sb2.toString());
            } else {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                sb3.append(postCode3);
                sb3.append(GS);
                sb3.append(format);
                sb3.append(GS);
                sb3.append(format2);
                sb3.append(GS);
                sb.insert(0, sb3.toString());
            }
        } else if (i == 4) {
            sb.append(getMessage(bArr, 1, 93));
        } else if (i == 5) {
            sb.append(getMessage(bArr, 1, 77));
        }
        return new com.google.zxing.common.DecoderResult(bArr, sb.toString(), null, java.lang.String.valueOf(i));
    }

    private static int getBit(int i, byte[] bArr) {
        int i2 = i - 1;
        return (bArr[i2 / 6] & (1 << (5 - (i2 % 6)))) == 0 ? 0 : 1;
    }

    private static int getInt(byte[] bArr, byte[] bArr2) {
        int i = 0;
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            i += getBit(bArr2[i2], bArr) << ((bArr2.length - i2) - 1);
        }
        return i;
    }

    private static int getCountry(byte[] bArr) {
        return getInt(bArr, COUNTRY_BYTES);
    }

    private static int getServiceClass(byte[] bArr) {
        return getInt(bArr, SERVICE_CLASS_BYTES);
    }

    private static int getPostCode2Length(byte[] bArr) {
        return getInt(bArr, POSTCODE_2_LENGTH_BYTES);
    }

    private static int getPostCode2(byte[] bArr) {
        return getInt(bArr, POSTCODE_2_BYTES);
    }

    private static java.lang.String getPostCode3(byte[] bArr) {
        byte[][] bArr2 = POSTCODE_3_BYTES;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(bArr2.length);
        for (byte[] bArr3 : bArr2) {
            sb.append(SETS[0].charAt(getInt(bArr, bArr3)));
        }
        return sb.toString();
    }

    private static java.lang.String getMessage(byte[] bArr, int i, int i2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i3 = i;
        int i4 = -1;
        int i5 = 0;
        int i6 = 0;
        while (i3 < i + i2) {
            char charAt = SETS[i5].charAt(bArr[i3]);
            switch (charAt) {
                case 65520:
                case 65521:
                case 65522:
                case 65523:
                case 65524:
                    i6 = i5;
                    i5 = charAt - SHIFTA;
                    i4 = 1;
                    break;
                case 65525:
                    i4 = 2;
                    i6 = i5;
                    i5 = 0;
                    break;
                case 65526:
                    i4 = 3;
                    i6 = i5;
                    i5 = 0;
                    break;
                case 65527:
                    i4 = -1;
                    i5 = i6;
                    i6 = i5;
                    i5 = 0;
                    break;
                case 65528:
                    i4 = -1;
                    i5 = 1;
                    break;
                case 65529:
                    i4 = -1;
                    break;
                case 65530:
                default:
                    sb.append(charAt);
                    break;
                case 65531:
                    byte b = bArr[i3 + 1];
                    byte b2 = bArr[i3 + 2];
                    byte b3 = bArr[i3 + 3];
                    byte b4 = bArr[i3 + 4];
                    i3 += 5;
                    sb.append(new java.text.DecimalFormat("000000000").format((b << com.google.common.base.Ascii.CAN) + (b2 << 18) + (b3 << com.google.common.base.Ascii.FF) + (b4 << 6) + bArr[i3]));
                    break;
            }
            if (i4 == 0) {
                i5 = i6;
            }
            i3++;
            i4--;
        }
        while (sb.length() > 0 && sb.charAt(sb.length() - 1) == 65532) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }
}
