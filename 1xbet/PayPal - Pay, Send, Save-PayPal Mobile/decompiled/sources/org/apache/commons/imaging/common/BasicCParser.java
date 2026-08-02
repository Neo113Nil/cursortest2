package org.apache.commons.imaging.common;

/* loaded from: classes17.dex */
public class BasicCParser {
    private final java.io.PushbackInputStream is;

    public BasicCParser(java.io.ByteArrayInputStream byteArrayInputStream) {
        this.is = new java.io.PushbackInputStream(byteArrayInputStream);
    }

    public java.lang.String nextToken() throws java.io.IOException, org.apache.commons.imaging.ImageReadException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int read = this.is.read();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (read != -1) {
            if (z2) {
                if (read == 92) {
                    sb.append('\\');
                    z3 = !z3;
                } else {
                    if (read == 34) {
                        sb.append('\"');
                        if (!z3) {
                            return sb.toString();
                        }
                    } else {
                        if (read == 13 || read == 10) {
                            throw new org.apache.commons.imaging.ImageReadException("Unterminated string in XPM file");
                        }
                        sb.append((char) read);
                    }
                    z3 = false;
                }
            } else if (z) {
                if (java.lang.Character.isLetterOrDigit(read) || read == 95) {
                    sb.append((char) read);
                } else {
                    this.is.unread(read);
                    return sb.toString();
                }
            } else if (read == 34) {
                sb.append('\"');
                z2 = true;
            } else if (java.lang.Character.isLetterOrDigit(read) || read == 95) {
                sb.append((char) read);
                z = true;
            } else {
                if (read == 123 || read == 125 || read == 91 || read == 93 || read == 42 || read == 59 || read == 61 || read == 44) {
                    sb.append((char) read);
                    return sb.toString();
                }
                if (read != 32 && read != 9 && read != 13 && read != 10) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unhandled/invalid character '");
                    sb2.append((char) read);
                    sb2.append("' found in XPM file");
                    throw new org.apache.commons.imaging.ImageReadException(sb2.toString());
                }
            }
            read = this.is.read();
        }
        if (z) {
            return sb.toString();
        }
        if (z2) {
            throw new org.apache.commons.imaging.ImageReadException("Unterminated string ends XMP file");
        }
        return null;
    }

    public static java.io.ByteArrayOutputStream preprocess(java.io.InputStream inputStream, java.lang.StringBuilder sb, java.util.Map<java.lang.String, java.lang.String> map) throws java.io.IOException, org.apache.commons.imaging.ImageReadException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        boolean z = sb == null;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        int read = inputStream.read();
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        while (read != -1) {
            if (z3) {
                if (read == 42) {
                    if (z4 && !z) {
                        sb.append('*');
                    }
                    z4 = true;
                } else {
                    if (read != 47) {
                        if (z4 && !z) {
                            sb.append('*');
                        }
                        if (!z) {
                            sb.append((char) read);
                        }
                    } else if (z4) {
                        z = true;
                        z3 = false;
                    } else if (!z) {
                        sb.append((char) read);
                    }
                    z4 = false;
                }
            } else if (z5) {
                if (read == 92) {
                    if (z8) {
                        byteArrayOutputStream.write(92);
                        byteArrayOutputStream.write(92);
                        z8 = false;
                    }
                    z8 = true;
                } else if (read == 39) {
                    if (z8) {
                        byteArrayOutputStream.write(92);
                        z8 = false;
                    } else {
                        z5 = false;
                    }
                    byteArrayOutputStream.write(39);
                } else {
                    if (read == 13 || read == 10) {
                        throw new org.apache.commons.imaging.ImageReadException("Unterminated single quote in file");
                    }
                    if (z8) {
                        byteArrayOutputStream.write(92);
                        z8 = false;
                    }
                    byteArrayOutputStream.write(read);
                }
            } else if (!z6) {
                if (z7) {
                    if (read == 13 || read == 10) {
                        java.lang.String[] strArr = tokenizeRow(sb2.toString());
                        if (strArr.length < 2 || strArr.length > 3) {
                            throw new org.apache.commons.imaging.ImageReadException("Bad preprocessor directive");
                        }
                        if (!strArr[0].equals("define")) {
                            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Invalid/unsupported preprocessor directive '");
                            sb3.append(strArr[0]);
                            sb3.append("'");
                            throw new org.apache.commons.imaging.ImageReadException(sb3.toString());
                        }
                        map.put(strArr[1], strArr.length == 3 ? strArr[2] : null);
                        sb2.setLength(0);
                        z7 = false;
                    } else {
                        sb2.append((char) read);
                    }
                } else if (read == 47) {
                    if (z2) {
                        byteArrayOutputStream.write(47);
                    }
                    z2 = true;
                } else if (read != 42) {
                    if (read == 39) {
                        if (z2) {
                            byteArrayOutputStream.write(47);
                        }
                        byteArrayOutputStream.write(read);
                        z5 = true;
                    } else if (read == 34) {
                        if (z2) {
                            byteArrayOutputStream.write(47);
                        }
                        byteArrayOutputStream.write(read);
                        z6 = true;
                    } else if (read != 35) {
                        if (z2) {
                            byteArrayOutputStream.write(47);
                        }
                        byteArrayOutputStream.write(read);
                        if (read != 32 && read != 9 && read != 13 && read != 10) {
                            z = true;
                        }
                    } else {
                        if (map == null) {
                            throw new org.apache.commons.imaging.ImageReadException("Unexpected preprocessor directive");
                        }
                        z7 = true;
                    }
                    z2 = false;
                } else if (z2) {
                    z3 = true;
                    z2 = false;
                } else {
                    byteArrayOutputStream.write(read);
                }
                read = inputStream.read();
            } else if (read == 92) {
                if (z8) {
                    byteArrayOutputStream.write(92);
                    byteArrayOutputStream.write(92);
                    z8 = false;
                }
                z8 = true;
            } else if (read == 34) {
                if (z8) {
                    byteArrayOutputStream.write(92);
                    z8 = false;
                } else {
                    z6 = false;
                }
                byteArrayOutputStream.write(34);
            } else {
                if (read == 13 || read == 10) {
                    throw new org.apache.commons.imaging.ImageReadException("Unterminated string in file");
                }
                if (z8) {
                    byteArrayOutputStream.write(92);
                    z8 = false;
                }
                byteArrayOutputStream.write(read);
            }
            read = inputStream.read();
        }
        if (z2) {
            byteArrayOutputStream.write(47);
        }
        if (z4) {
            byteArrayOutputStream.write(42);
        }
        if (z6) {
            throw new org.apache.commons.imaging.ImageReadException("Unterminated string at the end of file");
        }
        if (z3) {
            throw new org.apache.commons.imaging.ImageReadException("Unterminated comment at the end of file");
        }
        return byteArrayOutputStream;
    }

    public static java.lang.String[] tokenizeRow(java.lang.String str) {
        java.lang.String[] split = str.split("[ \t]");
        int i = 0;
        for (java.lang.String str2 : split) {
            if (str2 != null && str2.length() > 0) {
                i++;
            }
        }
        java.lang.String[] strArr = new java.lang.String[i];
        int i2 = 0;
        for (java.lang.String str3 : split) {
            if (str3 != null && str3.length() > 0) {
                strArr[i2] = str3;
                i2++;
            }
        }
        return strArr;
    }

    public static void unescapeString(java.lang.StringBuilder sb, java.lang.String str) throws org.apache.commons.imaging.ImageReadException {
        if (str.length() < 2) {
            throw new org.apache.commons.imaging.ImageReadException("Parsing XPM file failed, string is too short");
        }
        if (str.charAt(0) != '\"' || str.charAt(str.length() - 1) != '\"') {
            throw new org.apache.commons.imaging.ImageReadException("Parsing XPM file failed, string not surrounded by '\"'");
        }
        boolean z = false;
        int i = 1;
        while (i < str.length() - 1) {
            char charAt = str.charAt(i);
            if (z) {
                if (charAt == '\\') {
                    sb.append('\\');
                } else if (charAt == '\"') {
                    sb.append('\"');
                } else if (charAt == '\'') {
                    sb.append('\'');
                } else if (charAt == 'x') {
                    int i2 = i + 2;
                    if (i2 >= str.length()) {
                        throw new org.apache.commons.imaging.ImageReadException("Parsing XPM file failed, hex constant in string too short");
                    }
                    char charAt2 = str.charAt(i + 1);
                    char charAt3 = str.charAt(i2);
                    try {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        sb2.append(charAt2);
                        sb2.append(java.lang.Character.toString(charAt3));
                        sb.append((char) java.lang.Integer.parseInt(sb2.toString(), 16));
                        i = i2;
                    } catch (java.lang.NumberFormatException e) {
                        throw new org.apache.commons.imaging.ImageReadException("Parsing XPM file failed, hex constant invalid", e);
                    }
                } else if (charAt == '0' || charAt == '1' || charAt == '2' || charAt == '3' || charAt == '4' || charAt == '5' || charAt == '6' || charAt == '7') {
                    int i3 = i + 1;
                    int i4 = (i3 >= str.length() || '0' > str.charAt(i3) || str.charAt(i3) > '7') ? 1 : 2;
                    int i5 = i + 2;
                    if (i5 < str.length() && '0' <= str.charAt(i5) && str.charAt(i5) <= '7') {
                        i4++;
                    }
                    int i6 = 0;
                    for (int i7 = 0; i7 < i4; i7++) {
                        i6 = (i6 * 8) + (str.charAt(i + i7) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                    }
                    i += i4 - 1;
                    sb.append((char) i6);
                } else if (charAt == 'a') {
                    sb.append((char) 7);
                } else if (charAt == 'b') {
                    sb.append('\b');
                } else if (charAt == 'f') {
                    sb.append('\f');
                } else if (charAt == 'n') {
                    sb.append('\n');
                } else if (charAt == 'r') {
                    sb.append('\r');
                } else if (charAt == 't') {
                    sb.append('\t');
                } else if (charAt == 'v') {
                    sb.append((char) 11);
                } else {
                    throw new org.apache.commons.imaging.ImageReadException("Parsing XPM file failed, invalid escape sequence");
                }
                z = false;
            } else if (charAt == '\\') {
                z = true;
            } else {
                if (charAt == '\"') {
                    throw new org.apache.commons.imaging.ImageReadException("Parsing XPM file failed, extra '\"' found in string");
                }
                sb.append(charAt);
            }
            i++;
        }
        if (z) {
            throw new org.apache.commons.imaging.ImageReadException("Parsing XPM file failed, unterminated escape sequence found in string");
        }
    }
}
