package org.apache.commons.codec.language;

/* loaded from: classes17.dex */
public class Metaphone implements org.apache.commons.codec.StringEncoder {
    private int getHighSpeedVideoFpsRangesFor = 4;

    @Override // org.apache.commons.codec.Encoder
    public java.lang.Object encode(java.lang.Object obj) throws org.apache.commons.codec.EncoderException {
        if (!(obj instanceof java.lang.String)) {
            throw new org.apache.commons.codec.EncoderException("Parameter supplied to Metaphone encode is not of type java.lang.String");
        }
        return metaphone((java.lang.String) obj);
    }

    @Override // org.apache.commons.codec.StringEncoder
    public java.lang.String encode(java.lang.String str) {
        return metaphone(str);
    }

    public int getMaxCodeLen() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public boolean isMetaphoneEqual(java.lang.String str, java.lang.String str2) {
        return metaphone(str).equals(metaphone(str2));
    }

    public java.lang.String metaphone(java.lang.String str) {
        int length;
        int i;
        if (str == null || (length = str.length()) == 0) {
            return "";
        }
        if (length == 1) {
            return str.toUpperCase(java.util.Locale.ENGLISH);
        }
        char[] charArray = str.toUpperCase(java.util.Locale.ENGLISH).toCharArray();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(40);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(10);
        char c = charArray[0];
        if (c != 'A') {
            if (c == 'G' || c == 'K' || c == 'P') {
                if (charArray[1] == 'N') {
                    sb.append(charArray, 1, charArray.length - 1);
                } else {
                    sb.append(charArray);
                }
            } else if (c == 'W') {
                char c2 = charArray[1];
                if (c2 == 'R') {
                    sb.append(charArray, 1, charArray.length - 1);
                } else if (c2 == 'H') {
                    sb.append(charArray, 1, charArray.length - 1);
                    sb.setCharAt(0, 'W');
                } else {
                    sb.append(charArray);
                }
            } else if (c == 'X') {
                charArray[0] = 'S';
                sb.append(charArray);
            } else {
                sb.append(charArray);
            }
        } else if (charArray[1] == 'E') {
            sb.append(charArray, 1, charArray.length - 1);
        } else {
            sb.append(charArray);
        }
        int length2 = sb.length();
        int i2 = 0;
        while (sb2.length() < getMaxCodeLen() && i2 < length2) {
            char charAt = sb.charAt(i2);
            if (charAt == 'C' || i2 <= 0 || i2 >= sb.length() || sb.charAt(i2 - 1) != charAt) {
                switch (charAt) {
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                        if (i2 == 0) {
                            sb2.append(charAt);
                            break;
                        }
                        break;
                    case 'B':
                        if (i2 <= 0 || i2 >= sb.length() || sb.charAt(i2 - 1) != 'M' || i2 + 1 != length2) {
                            sb2.append(charAt);
                            break;
                        }
                        break;
                    case 'C':
                        if (i2 <= 0 || i2 >= sb.length() || sb.charAt(i2 - 1) != 'S' || (i = i2 + 1) == length2 || "EIY".indexOf(sb.charAt(i)) < 0) {
                            if (!getHighSpeedVideoFpsRanges(sb, i2, "CIA")) {
                                int i3 = i2 + 1;
                                if (i3 != length2 && "EIY".indexOf(sb.charAt(i3)) >= 0) {
                                    sb2.append('S');
                                    break;
                                } else if (i2 > 0 && i2 < sb.length() && sb.charAt(i2 - 1) == 'S' && i2 >= 0 && i2 < sb.length() - 1 && sb.charAt(i3) == 'H') {
                                    sb2.append('K');
                                    break;
                                } else if (i2 < 0 || i2 >= sb.length() - 1 || sb.charAt(i3) != 'H') {
                                    sb2.append('K');
                                    break;
                                } else if (i2 == 0 && length2 >= 3 && "AEIOU".indexOf(sb.charAt(2)) >= 0) {
                                    sb2.append('K');
                                    break;
                                } else {
                                    sb2.append('X');
                                    break;
                                }
                            } else {
                                sb2.append('X');
                                break;
                            }
                        }
                        break;
                    case 'D':
                        int i4 = i2 + 1;
                        if (i2 + 2 != length2 && i2 >= 0 && i2 < sb.length() - 1 && sb.charAt(i4) == 'G') {
                            int i5 = i2 + 2;
                            if ("EIY".indexOf(sb.charAt(i5)) >= 0) {
                                sb2.append('J');
                                i2 = i5;
                                break;
                            }
                        }
                        sb2.append('T');
                        break;
                    case 'F':
                    case 'J':
                    case 'L':
                    case 'M':
                    case 'N':
                    case 'R':
                        sb2.append(charAt);
                        break;
                    case 'G':
                        int i6 = i2 + 1;
                        int i7 = i2 + 2;
                        if ((i7 != length2 || i2 < 0 || i2 >= sb.length() - 1 || sb.charAt(i6) != 'H') && ((i7 == length2 || i2 < 0 || i2 >= sb.length() - 1 || sb.charAt(i6) != 'H' || "AEIOU".indexOf(sb.charAt(i2 + 2)) >= 0) && (i2 <= 0 || (!getHighSpeedVideoFpsRanges(sb, i2, "GN") && !getHighSpeedVideoFpsRanges(sb, i2, "GNED"))))) {
                            boolean z = i2 > 0 && i2 < sb.length() && sb.charAt(i2 + (-1)) == 'G';
                            if (i6 != length2 && "EIY".indexOf(sb.charAt(i6)) >= 0 && !z) {
                                sb2.append('J');
                                break;
                            } else {
                                sb2.append('K');
                                break;
                            }
                        }
                        break;
                    case 'H':
                        int i8 = i2 + 1;
                        if (i8 != length2 && ((i2 <= 0 || "CSPTG".indexOf(sb.charAt(i2 - 1)) < 0) && "AEIOU".indexOf(sb.charAt(i8)) >= 0)) {
                            sb2.append('H');
                            break;
                        }
                        break;
                    case 'K':
                        if (i2 <= 0) {
                            sb2.append(charAt);
                            break;
                        } else if (i2 <= 0 || i2 >= sb.length() || sb.charAt(i2 - 1) != 'C') {
                            sb2.append(charAt);
                            break;
                        }
                        break;
                    case 'P':
                        if (i2 >= 0 && i2 < sb.length() - 1 && sb.charAt(i2 + 1) == 'H') {
                            sb2.append('F');
                            break;
                        } else {
                            sb2.append(charAt);
                            break;
                        }
                        break;
                    case 'Q':
                        sb2.append('K');
                        break;
                    case 'S':
                        if (getHighSpeedVideoFpsRanges(sb, i2, "SH") || getHighSpeedVideoFpsRanges(sb, i2, "SIO") || getHighSpeedVideoFpsRanges(sb, i2, "SIA")) {
                            sb2.append('X');
                            break;
                        } else {
                            sb2.append('S');
                            break;
                        }
                        break;
                    case 'T':
                        if (getHighSpeedVideoFpsRanges(sb, i2, "TIA") || getHighSpeedVideoFpsRanges(sb, i2, "TIO")) {
                            sb2.append('X');
                            break;
                        } else if (!getHighSpeedVideoFpsRanges(sb, i2, "TCH")) {
                            if (getHighSpeedVideoFpsRanges(sb, i2, "TH")) {
                                sb2.append(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                break;
                            } else {
                                sb2.append('T');
                                break;
                            }
                        }
                        break;
                    case 'V':
                        sb2.append('F');
                        break;
                    case 'W':
                    case 'Y':
                        int i9 = i2 + 1;
                        if (i9 != length2 && "AEIOU".indexOf(sb.charAt(i9)) >= 0) {
                            sb2.append(charAt);
                            break;
                        }
                        break;
                    case 'X':
                        sb2.append('K');
                        sb2.append('S');
                        break;
                    case 'Z':
                        sb2.append('S');
                        break;
                }
                i2++;
            } else {
                i2++;
            }
            if (sb2.length() > getMaxCodeLen()) {
                sb2.setLength(getMaxCodeLen());
            }
        }
        return sb2.toString();
    }

    private static boolean getHighSpeedVideoFpsRanges(java.lang.StringBuilder sb, int i, java.lang.String str) {
        if (i < 0 || (str.length() + i) - 1 >= sb.length()) {
            return false;
        }
        return sb.substring(i, str.length() + i).equals(str);
    }

    public void setMaxCodeLen(int i) {
        this.getHighSpeedVideoFpsRangesFor = i;
    }
}
