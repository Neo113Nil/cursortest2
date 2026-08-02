package com.datatheorem.android.trustkit.pinning;

/* loaded from: classes8.dex */
final class OkHostnameVerifier implements javax.net.ssl.HostnameVerifier {
    public static final com.datatheorem.android.trustkit.pinning.OkHostnameVerifier getHighSpeedVideoFpsRanges = new com.datatheorem.android.trustkit.pinning.OkHostnameVerifier();

    private OkHostnameVerifier() {
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(java.lang.String str, javax.net.ssl.SSLSession sSLSession) {
        try {
            return Camera2StreamConfigurationMap(str, (java.security.cert.X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (javax.net.ssl.SSLException unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0219  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Camera2StreamConfigurationMap(java.lang.String str, java.security.cert.X509Certificate x509Certificate) {
        java.lang.String str2;
        java.lang.String str3;
        char[] cArr;
        char c;
        int i;
        int i2;
        char c2;
        if (com.datatheorem.android.trustkit.pinning.Utils.getHighSpeedVideoSizes(str)) {
            java.util.List<java.lang.String> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(x509Certificate, 7);
            int size = highResolutionOutputSizeshNQ4ISI.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (str.equalsIgnoreCase(highResolutionOutputSizeshNQ4ISI.get(i3))) {
                    return true;
                }
            }
            return false;
        }
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.US);
        java.util.List<java.lang.String> highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(x509Certificate, 2);
        int size2 = highResolutionOutputSizeshNQ4ISI2.size();
        int i4 = 0;
        boolean z = false;
        while (i4 < size2) {
            if (getHighSpeedVideoFpsRangesFor(lowerCase, highResolutionOutputSizeshNQ4ISI2.get(i4))) {
                return true;
            }
            i4++;
            z = true;
        }
        if (!z) {
            com.datatheorem.android.trustkit.pinning.DistinguishedNameParser distinguishedNameParser = new com.datatheorem.android.trustkit.pinning.DistinguishedNameParser(x509Certificate.getSubjectX500Principal());
            distinguishedNameParser.getInputSizeshNQ4ISI = 0;
            distinguishedNameParser.getHighSpeedVideoFpsRanges = 0;
            distinguishedNameParser.getHighSpeedVideoSizes = 0;
            distinguishedNameParser.getHighSpeedVideoFpsRangesFor = 0;
            distinguishedNameParser.Camera2StreamConfigurationMap = distinguishedNameParser.getHighResolutionOutputSizeshNQ4ISI.toCharArray();
            java.lang.String highSpeedVideoFpsRangesFor = distinguishedNameParser.getHighSpeedVideoFpsRangesFor();
            if (highSpeedVideoFpsRangesFor != null) {
                do {
                    int i5 = distinguishedNameParser.getInputSizeshNQ4ISI;
                    if (i5 != distinguishedNameParser.getOutputMinFrameDuration) {
                        char c3 = distinguishedNameParser.Camera2StreamConfigurationMap[i5];
                        if (c3 == '\"') {
                            int i6 = distinguishedNameParser.getInputSizeshNQ4ISI + 1;
                            distinguishedNameParser.getInputSizeshNQ4ISI = i6;
                            distinguishedNameParser.getHighSpeedVideoFpsRanges = i6;
                            distinguishedNameParser.getHighSpeedVideoSizes = i6;
                            while (true) {
                                int i7 = distinguishedNameParser.getInputSizeshNQ4ISI;
                                if (i7 == distinguishedNameParser.getOutputMinFrameDuration) {
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected end of DN: ");
                                    sb.append(distinguishedNameParser.getHighResolutionOutputSizeshNQ4ISI);
                                    throw new java.lang.IllegalStateException(sb.toString());
                                }
                                char[] cArr2 = distinguishedNameParser.Camera2StreamConfigurationMap;
                                char c4 = cArr2[i7];
                                if (c4 == '\"') {
                                    distinguishedNameParser.getInputSizeshNQ4ISI = i7 + 1;
                                    while (true) {
                                        int i8 = distinguishedNameParser.getInputSizeshNQ4ISI;
                                        if (i8 >= distinguishedNameParser.getOutputMinFrameDuration || distinguishedNameParser.Camera2StreamConfigurationMap[i8] != ' ') {
                                            break;
                                        }
                                        distinguishedNameParser.getInputSizeshNQ4ISI = i8 + 1;
                                    }
                                    char[] cArr3 = distinguishedNameParser.Camera2StreamConfigurationMap;
                                    int i9 = distinguishedNameParser.getHighSpeedVideoFpsRanges;
                                    str2 = new java.lang.String(cArr3, i9, distinguishedNameParser.getHighSpeedVideoSizes - i9);
                                } else {
                                    if (c4 == '\\') {
                                        cArr2[distinguishedNameParser.getHighSpeedVideoSizes] = distinguishedNameParser.getHighSpeedVideoFpsRanges();
                                    } else {
                                        cArr2[distinguishedNameParser.getHighSpeedVideoSizes] = c4;
                                    }
                                    distinguishedNameParser.getInputSizeshNQ4ISI++;
                                    distinguishedNameParser.getHighSpeedVideoSizes++;
                                }
                            }
                        } else if (c3 == '#') {
                            int i10 = distinguishedNameParser.getInputSizeshNQ4ISI;
                            if (i10 + 4 >= distinguishedNameParser.getOutputMinFrameDuration) {
                                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unexpected end of DN: ");
                                sb2.append(distinguishedNameParser.getHighResolutionOutputSizeshNQ4ISI);
                                throw new java.lang.IllegalStateException(sb2.toString());
                            }
                            distinguishedNameParser.getHighSpeedVideoFpsRanges = i10;
                            distinguishedNameParser.getInputSizeshNQ4ISI = i10 + 1;
                            while (true) {
                                int i11 = distinguishedNameParser.getInputSizeshNQ4ISI;
                                if (i11 == distinguishedNameParser.getOutputMinFrameDuration || (c = (cArr = distinguishedNameParser.Camera2StreamConfigurationMap)[i11]) == '+' || c == ',' || c == ';') {
                                    break;
                                }
                                if (c == ' ') {
                                    distinguishedNameParser.getHighSpeedVideoSizes = i11;
                                    distinguishedNameParser.getInputSizeshNQ4ISI = i11 + 1;
                                    while (true) {
                                        int i12 = distinguishedNameParser.getInputSizeshNQ4ISI;
                                        if (i12 >= distinguishedNameParser.getOutputMinFrameDuration || distinguishedNameParser.Camera2StreamConfigurationMap[i12] != ' ') {
                                            break;
                                        }
                                        distinguishedNameParser.getInputSizeshNQ4ISI = i12 + 1;
                                    }
                                } else {
                                    if (c >= 'A' && c <= 'F') {
                                        cArr[i11] = (char) (c + ' ');
                                    }
                                    distinguishedNameParser.getInputSizeshNQ4ISI = i11 + 1;
                                }
                            }
                            int i13 = distinguishedNameParser.getHighSpeedVideoSizes;
                            int i14 = distinguishedNameParser.getHighSpeedVideoFpsRanges;
                            int i15 = i13 - i14;
                            if (i15 < 5 || (i15 & 1) == 0) {
                                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Unexpected end of DN: ");
                                sb3.append(distinguishedNameParser.getHighResolutionOutputSizeshNQ4ISI);
                                throw new java.lang.IllegalStateException(sb3.toString());
                            }
                            int i16 = i15 / 2;
                            byte[] bArr = new byte[i16];
                            int i17 = i14 + 1;
                            for (int i18 = 0; i18 < i16; i18++) {
                                bArr[i18] = (byte) distinguishedNameParser.getHighSpeedVideoSizes(i17);
                                i17 += 2;
                            }
                            str2 = new java.lang.String(distinguishedNameParser.Camera2StreamConfigurationMap, distinguishedNameParser.getHighSpeedVideoFpsRanges, i15);
                        } else if (c3 == '+' || c3 == ',' || c3 == ';') {
                            str2 = "";
                        } else {
                            int i19 = distinguishedNameParser.getInputSizeshNQ4ISI;
                            distinguishedNameParser.getHighSpeedVideoFpsRanges = i19;
                            distinguishedNameParser.getHighSpeedVideoSizes = i19;
                            while (true) {
                                int i20 = distinguishedNameParser.getInputSizeshNQ4ISI;
                                if (i20 >= distinguishedNameParser.getOutputMinFrameDuration) {
                                    char[] cArr4 = distinguishedNameParser.Camera2StreamConfigurationMap;
                                    int i21 = distinguishedNameParser.getHighSpeedVideoFpsRanges;
                                    str2 = new java.lang.String(cArr4, i21, distinguishedNameParser.getHighSpeedVideoSizes - i21);
                                    break;
                                }
                                char[] cArr5 = distinguishedNameParser.Camera2StreamConfigurationMap;
                                char c5 = cArr5[i20];
                                if (c5 == ' ') {
                                    int i22 = distinguishedNameParser.getHighSpeedVideoSizes;
                                    distinguishedNameParser.getHighSpeedVideoFpsRangesFor = i22;
                                    distinguishedNameParser.getInputSizeshNQ4ISI = i20 + 1;
                                    distinguishedNameParser.getHighSpeedVideoSizes = i22 + 1;
                                    cArr5[i22] = ' ';
                                    while (true) {
                                        i = distinguishedNameParser.getInputSizeshNQ4ISI;
                                        i2 = distinguishedNameParser.getOutputMinFrameDuration;
                                        if (i >= i2) {
                                            break;
                                        }
                                        char[] cArr6 = distinguishedNameParser.Camera2StreamConfigurationMap;
                                        if (cArr6[i] != ' ') {
                                            break;
                                        }
                                        int i23 = distinguishedNameParser.getHighSpeedVideoSizes;
                                        distinguishedNameParser.getHighSpeedVideoSizes = i23 + 1;
                                        cArr6[i23] = ' ';
                                        distinguishedNameParser.getInputSizeshNQ4ISI = i + 1;
                                    }
                                    if (i == i2 || (c2 = distinguishedNameParser.Camera2StreamConfigurationMap[i]) == ',' || c2 == '+' || c2 == ';') {
                                        break;
                                    }
                                } else {
                                    if (c5 == ';') {
                                        break;
                                    }
                                    if (c5 == '\\') {
                                        int i24 = distinguishedNameParser.getHighSpeedVideoSizes;
                                        distinguishedNameParser.getHighSpeedVideoSizes = i24 + 1;
                                        cArr5[i24] = distinguishedNameParser.getHighSpeedVideoFpsRanges();
                                        distinguishedNameParser.getInputSizeshNQ4ISI++;
                                    } else {
                                        if (c5 == '+' || c5 == ',') {
                                            break;
                                        }
                                        int i25 = distinguishedNameParser.getHighSpeedVideoSizes;
                                        distinguishedNameParser.getHighSpeedVideoSizes = i25 + 1;
                                        cArr5[i25] = c5;
                                        distinguishedNameParser.getInputSizeshNQ4ISI = i20 + 1;
                                    }
                                }
                            }
                            char[] cArr7 = distinguishedNameParser.Camera2StreamConfigurationMap;
                            int i26 = distinguishedNameParser.getHighSpeedVideoFpsRanges;
                            str2 = new java.lang.String(cArr7, i26, distinguishedNameParser.getHighSpeedVideoSizes - i26);
                        }
                        if ("cn".equalsIgnoreCase(highSpeedVideoFpsRangesFor)) {
                            str3 = str2;
                            if (str3 != null) {
                                return getHighSpeedVideoFpsRangesFor(lowerCase, str3);
                            }
                        } else {
                            int i27 = distinguishedNameParser.getInputSizeshNQ4ISI;
                            if (i27 < distinguishedNameParser.getOutputMinFrameDuration) {
                                char c6 = distinguishedNameParser.Camera2StreamConfigurationMap[i27];
                                if (c6 != ',' && c6 != ';' && c6 != '+') {
                                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Malformed DN: ");
                                    sb4.append(distinguishedNameParser.getHighResolutionOutputSizeshNQ4ISI);
                                    throw new java.lang.IllegalStateException(sb4.toString());
                                }
                                distinguishedNameParser.getInputSizeshNQ4ISI = i27 + 1;
                                highSpeedVideoFpsRangesFor = distinguishedNameParser.getHighSpeedVideoFpsRangesFor();
                            }
                        }
                    }
                } while (highSpeedVideoFpsRangesFor != null);
                java.lang.StringBuilder sb5 = new java.lang.StringBuilder("Malformed DN: ");
                sb5.append(distinguishedNameParser.getHighResolutionOutputSizeshNQ4ISI);
                throw new java.lang.IllegalStateException(sb5.toString());
            }
            str3 = null;
            if (str3 != null) {
            }
        }
        return false;
    }

    private static java.util.List<java.lang.String> getHighResolutionOutputSizeshNQ4ISI(java.security.cert.X509Certificate x509Certificate, int i) {
        java.lang.Integer num;
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            java.util.Collection<java.util.List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return java.util.Collections.emptyList();
            }
            for (java.util.List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (java.lang.Integer) list.get(0)) != null && num.intValue() == i && (str = (java.lang.String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (java.security.cert.CertificateParsingException unused) {
            return java.util.Collections.emptyList();
        }
    }

    private static boolean getHighSpeedVideoFpsRangesFor(java.lang.String str, java.lang.String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
            if (!str.endsWith(".")) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                str = sb.toString();
            }
            if (!str2.endsWith(".")) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(str2);
                sb2.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                str2 = sb2.toString();
            }
            java.lang.String lowerCase = str2.toLowerCase(java.util.Locale.US);
            if (!lowerCase.contains("*")) {
                return str.equals(lowerCase);
            }
            if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                return false;
            }
            java.lang.String substring = lowerCase.substring(1);
            if (!str.endsWith(substring)) {
                return false;
            }
            int length = str.length() - substring.length();
            return length <= 0 || str.lastIndexOf(46, length - 1) == -1;
        }
        return false;
    }
}
