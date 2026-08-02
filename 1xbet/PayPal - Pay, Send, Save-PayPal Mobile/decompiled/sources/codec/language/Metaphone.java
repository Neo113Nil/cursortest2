package codec.language;

/* loaded from: classes7.dex */
public class Metaphone implements codec.StringEncoder {

    /* renamed from: a, reason: collision with root package name */
    public int f2785a = 4;

    public static boolean a(int i, int i2) {
        return i2 + 1 == i;
    }

    public static boolean a(java.lang.StringBuilder sb, int i, char c) {
        return i >= 0 && i < sb.length() - 1 && sb.charAt(i + 1) == c;
    }

    public static boolean b(java.lang.StringBuilder sb, int i, char c) {
        return i > 0 && i < sb.length() && sb.charAt(i - 1) == c;
    }

    @Override // codec.Encoder
    public java.lang.Object encode(java.lang.Object obj) throws codec.EncoderException {
        if (obj instanceof java.lang.String) {
            return metaphone((java.lang.String) obj);
        }
        throw new codec.EncoderException("Parameter supplied to Metaphone encode is not of type java.lang.String");
    }

    public int getMaxCodeLen() {
        return this.f2785a;
    }

    public boolean isMetaphoneEqual(java.lang.String str, java.lang.String str2) {
        return metaphone(str).equals(metaphone(str2));
    }

    public java.lang.String metaphone(java.lang.String str) {
        int length;
        if (str == null || (length = str.length()) == 0) {
            return "";
        }
        if (length == 1) {
            return str.toUpperCase(java.util.Locale.ENGLISH);
        }
        char[] charArray = str.toUpperCase(java.util.Locale.ENGLISH).toCharArray();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(40);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(10);
        int i = 0;
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
            } else if (c != 'X') {
                sb.append(charArray);
            } else {
                charArray[0] = 'S';
                sb.append(charArray);
            }
        } else if (charArray[1] == 'E') {
            sb.append(charArray, 1, charArray.length - 1);
        } else {
            sb.append(charArray);
        }
        int length2 = sb.length();
        while (sb2.length() < getMaxCodeLen() && i < length2) {
            char charAt = sb.charAt(i);
            if (charAt == 'C' || !b(sb, i, charAt)) {
                switch (charAt) {
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                        if (i == 0) {
                            sb2.append(charAt);
                            break;
                        }
                        break;
                    case 'B':
                        if (!b(sb, i, io.ktor.util.date.GMTDateParser.MONTH) || !a(length2, i)) {
                            sb2.append(charAt);
                            break;
                        }
                        break;
                    case 'C':
                        if (!b(sb, i, 'S') || a(length2, i) || "EIY".indexOf(sb.charAt(i + 1)) < 0) {
                            if (!a(sb, i, "CIA")) {
                                if (!a(length2, i) && "EIY".indexOf(sb.charAt(i + 1)) >= 0) {
                                    sb2.append('S');
                                    break;
                                } else if (!b(sb, i, 'S') || !a(sb, i, 'H')) {
                                    if (!a(sb, i, 'H')) {
                                        sb2.append('K');
                                        break;
                                    } else if (i == 0 && length2 >= 3 && "AEIOU".indexOf(sb.charAt(2)) >= 0) {
                                        sb2.append('K');
                                        break;
                                    } else {
                                        sb2.append('X');
                                        break;
                                    }
                                } else {
                                    sb2.append('K');
                                    break;
                                }
                            } else {
                                sb2.append('X');
                                break;
                            }
                        }
                        break;
                    case 'D':
                        if (!a(length2, i + 1) && a(sb, i, 'G')) {
                            int i2 = i + 2;
                            if ("EIY".indexOf(sb.charAt(i2)) >= 0) {
                                sb2.append('J');
                                i = i2;
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
                        int i3 = i + 1;
                        if ((!a(length2, i3) || !a(sb, i, 'H')) && ((a(length2, i3) || !a(sb, i, 'H') || "AEIOU".indexOf(sb.charAt(i + 2)) >= 0) && (i <= 0 || (!a(sb, i, "GN") && !a(sb, i, "GNED"))))) {
                            boolean b = b(sb, i, 'G');
                            if (!a(length2, i) && "EIY".indexOf(sb.charAt(i3)) >= 0 && !b) {
                                sb2.append('J');
                                break;
                            } else {
                                sb2.append('K');
                                break;
                            }
                        }
                        break;
                    case 'H':
                        if (!a(length2, i) && ((i <= 0 || "CSPTG".indexOf(sb.charAt(i - 1)) < 0) && "AEIOU".indexOf(sb.charAt(i + 1)) >= 0)) {
                            sb2.append('H');
                            break;
                        }
                        break;
                    case 'K':
                        if (i <= 0) {
                            sb2.append(charAt);
                            break;
                        } else if (!b(sb, i, 'C')) {
                            sb2.append(charAt);
                            break;
                        }
                        break;
                    case 'P':
                        if (!a(sb, i, 'H')) {
                            sb2.append(charAt);
                            break;
                        } else {
                            sb2.append('F');
                            break;
                        }
                    case 'Q':
                        sb2.append('K');
                        break;
                    case 'S':
                        if (!a(sb, i, "SH") && !a(sb, i, "SIO") && !a(sb, i, "SIA")) {
                            sb2.append('S');
                            break;
                        } else {
                            sb2.append('X');
                            break;
                        }
                        break;
                    case 'T':
                        if (!a(sb, i, "TIA") && !a(sb, i, "TIO")) {
                            if (!a(sb, i, "TCH")) {
                                if (!a(sb, i, "TH")) {
                                    sb2.append('T');
                                    break;
                                } else {
                                    sb2.append(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                    break;
                                }
                            }
                        } else {
                            sb2.append('X');
                            break;
                        }
                        break;
                    case 'V':
                        sb2.append('F');
                        break;
                    case 'W':
                    case 'Y':
                        if (!a(length2, i) && "AEIOU".indexOf(sb.charAt(i + 1)) >= 0) {
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
            }
            i++;
            if (sb2.length() > getMaxCodeLen()) {
                sb2.setLength(getMaxCodeLen());
            }
        }
        return sb2.toString();
    }

    public void setMaxCodeLen(int i) {
        this.f2785a = i;
    }

    public static boolean a(java.lang.StringBuilder sb, int i, java.lang.String str) {
        if (i < 0 || (str.length() + i) - 1 >= sb.length()) {
            return false;
        }
        return sb.substring(i, str.length() + i).equals(str);
    }

    @Override // codec.StringEncoder
    public java.lang.String encode(java.lang.String str) {
        return metaphone(str);
    }
}
