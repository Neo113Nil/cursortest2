package com.payair.hce;

/* loaded from: classes4.dex */
final class getMonth extends javax.net.ssl.SSLSocketFactory {
    private static int DigitizedCardProfile = 0;
    private static int values = 1;
    private final java.lang.String[] valueOf;
    private final javax.net.ssl.SSLSocketFactory writeReplace;

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i3;
        switch ((i * 784) + (i2 * (-782)) + ((~i2) * (-783)) + ((~(i4 | i5 | i2)) * (-783)) + (((~(i2 | i5)) | i4) * 783)) {
            case 1:
                return AlternateContactlessPaymentDataJson(objArr);
            case 2:
                return DigitizedCardProfile(objArr);
            case 3:
                return writeReplace(objArr);
            case 4:
                return valueOf(objArr);
            case 5:
                return values(objArr);
            case 6:
                return getAid(objArr);
            case 7:
                com.payair.hce.getMonth getmonth = (com.payair.hce.getMonth) objArr[0];
                java.lang.String str = (java.lang.String) objArr[1];
                int intValue = ((java.lang.Number) objArr[2]).intValue();
                java.net.InetAddress inetAddress = (java.net.InetAddress) objArr[3];
                int intValue2 = ((java.lang.Number) objArr[4]).intValue();
                int i6 = DigitizedCardProfile;
                values = (((i6 & (-40)) | ((~i6) & 39)) + ((i6 & 39) << 1)) % 128;
                java.net.Socket socket = (java.net.Socket) valueOf(new java.lang.Object[]{getmonth, getmonth.writeReplace.createSocket(str, intValue, inetAddress, intValue2)}, -1159434875, 1159434879, java.lang.System.identityHashCode(getmonth));
                DigitizedCardProfile = (values + 113) % 128;
                return socket;
            default:
                com.payair.hce.getMonth getmonth2 = (com.payair.hce.getMonth) objArr[0];
                java.net.Socket socket2 = (java.net.Socket) objArr[1];
                java.lang.String str2 = (java.lang.String) objArr[2];
                int intValue3 = ((java.lang.Number) objArr[3]).intValue();
                boolean booleanValue = ((java.lang.Boolean) objArr[4]).booleanValue();
                int i7 = DigitizedCardProfile;
                values = ((((i7 | 110) << 1) - (i7 ^ 110)) - 1) % 128;
                java.net.Socket socket3 = (java.net.Socket) valueOf(new java.lang.Object[]{getmonth2, getmonth2.writeReplace.createSocket(socket2, str2, intValue3, booleanValue)}, -1159434875, 1159434879, java.lang.System.identityHashCode(getmonth2));
                int i8 = DigitizedCardProfile;
                values = (((i8 ^ 18) + ((i8 & 18) << 1)) - 1) % 128;
                return socket3;
        }
    }

    public getMonth(javax.net.ssl.SSLSocketFactory sSLSocketFactory, java.lang.String[] strArr) {
        this.writeReplace = sSLSocketFactory;
        this.valueOf = strArr;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.getMonth getmonth = (com.payair.hce.getMonth) objArr[0];
        int i = values;
        int i2 = (i ^ 79) + ((i & 79) << 1);
        DigitizedCardProfile = i2 % 128;
        javax.net.ssl.SSLSocketFactory sSLSocketFactory = getmonth.writeReplace;
        if (i2 % 2 == 0) {
            return sSLSocketFactory.getDefaultCipherSuites();
        }
        sSLSocketFactory.getDefaultCipherSuites();
        throw null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.getMonth getmonth = (com.payair.hce.getMonth) objArr[0];
        int i = DigitizedCardProfile;
        int i2 = (i & 69) + (i | 69);
        values = i2 % 128;
        javax.net.ssl.SSLSocketFactory sSLSocketFactory = getmonth.writeReplace;
        if (i2 % 2 == 0) {
            sSLSocketFactory.getSupportedCipherSuites();
            throw null;
        }
        java.lang.String[] supportedCipherSuites = sSLSocketFactory.getSupportedCipherSuites();
        int i3 = values;
        int i4 = i3 & 11;
        int i5 = (i3 ^ 11) | i4;
        DigitizedCardProfile = ((i4 & i5) + (i5 | i4)) % 128;
        return supportedCipherSuites;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.getMonth getmonth = (com.payair.hce.getMonth) objArr[0];
        java.net.Socket socket = (java.net.Socket) objArr[1];
        int i = values + 44;
        DigitizedCardProfile = ((~i) + (i << 1)) % 128;
        if (socket instanceof javax.net.ssl.SSLSocket) {
            com.payair.hce.getMonth.valueOf valueof = getmonth.new valueOf((javax.net.ssl.SSLSocket) socket);
            java.lang.String[] strArr = getmonth.valueOf;
            if (strArr != null) {
                int i2 = DigitizedCardProfile;
                int i3 = (((i2 ^ 45) | (i2 & 45)) << 1) - ((i2 & (-46)) | ((~i2) & 45));
                values = i3 % 128;
                if (i3 % 2 == 0) {
                    int length = strArr.length;
                    throw null;
                }
                if (strArr.length > 0) {
                    valueof.setEnabledProtocols(strArr);
                    int i4 = values;
                    DigitizedCardProfile = ((-2) - (~((i4 & 114) + (i4 | 114)))) % 128;
                }
            }
            socket = valueof;
        }
        int i5 = DigitizedCardProfile;
        int i6 = i5 & 45;
        int i7 = (i5 | 45) & (~i6);
        int i8 = -(-(i6 << 1));
        values = ((i7 ^ i8) + ((i7 & i8) << 1)) % 128;
        return socket;
    }

    private static /* synthetic */ java.lang.Object getAid(java.lang.Object[] objArr) {
        com.payair.hce.getMonth getmonth = (com.payair.hce.getMonth) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int intValue = ((java.lang.Number) objArr[2]).intValue();
        int i = DigitizedCardProfile;
        int i2 = i ^ 35;
        int i3 = (i & 35) << 1;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        values = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        java.net.Socket socket = (java.net.Socket) valueOf(new java.lang.Object[]{getmonth, getmonth.writeReplace.createSocket(str, intValue)}, -1159434875, 1159434879, java.lang.System.identityHashCode(getmonth));
        int i5 = values;
        int i6 = i5 & 47;
        int i7 = (i6 - (~((i5 ^ 47) | i6))) - 1;
        DigitizedCardProfile = i7 % 128;
        if (i7 % 2 == 0) {
            return socket;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.getMonth getmonth = (com.payair.hce.getMonth) objArr[0];
        java.net.InetAddress inetAddress = (java.net.InetAddress) objArr[1];
        int intValue = ((java.lang.Number) objArr[2]).intValue();
        int i = DigitizedCardProfile;
        int i2 = i & 69;
        int i3 = (i2 - (~((i ^ 69) | i2))) - 1;
        values = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        java.net.Socket socket = (java.net.Socket) valueOf(new java.lang.Object[]{getmonth, getmonth.writeReplace.createSocket(inetAddress, intValue)}, -1159434875, 1159434879, java.lang.System.identityHashCode(getmonth));
        int i4 = DigitizedCardProfile;
        int i5 = (i4 & 87) + (i4 | 87);
        values = i5 % 128;
        if (i5 % 2 != 0) {
            return socket;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.getMonth getmonth = (com.payair.hce.getMonth) objArr[0];
        java.net.InetAddress inetAddress = (java.net.InetAddress) objArr[1];
        int intValue = ((java.lang.Number) objArr[2]).intValue();
        java.net.InetAddress inetAddress2 = (java.net.InetAddress) objArr[3];
        int intValue2 = ((java.lang.Number) objArr[4]).intValue();
        int i = DigitizedCardProfile;
        int i2 = i & 125;
        int i3 = -(-(i | 125));
        int i4 = (i2 & i3) + (i3 | i2);
        values = i4 % 128;
        int i5 = i4 % 2;
        javax.net.ssl.SSLSocketFactory sSLSocketFactory = getmonth.writeReplace;
        if (i5 != 0) {
            java.net.Socket socket = (java.net.Socket) valueOf(new java.lang.Object[]{getmonth, sSLSocketFactory.createSocket(inetAddress, intValue, inetAddress2, intValue2)}, -1159434875, 1159434879, java.lang.System.identityHashCode(getmonth));
            values = (DigitizedCardProfile + 109) % 128;
            return socket;
        }
        throw null;
    }

    public final class valueOf extends javax.net.ssl.SSLSocket {
        private static int valueOf = 1;
        private static int writeReplace;
        private javax.net.ssl.SSLSocket DigitizedCardProfile;

        public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
            int i4 = ~i2;
            int i5 = ~i3;
            int i6 = ~i;
            int i7 = ~(i | i2);
            switch ((i * 371) + (i2 * 371) + (((~(i4 | i5)) | (~(i6 | i3))) * (-370)) + (((~(i3 | i4)) | (~(i5 | i6)) | i7) * (-370)) + (i7 * com.knotapi.knot.utilities.Constants.ID_KROGER)) {
                case 1:
                    return AlternateContactlessPaymentDataJson(objArr);
                case 2:
                    return DigitizedCardProfile(objArr);
                case 3:
                    return valueOf(objArr);
                case 4:
                    return writeReplace(objArr);
                case 5:
                    com.payair.hce.getMonth.valueOf valueof = (com.payair.hce.getMonth.valueOf) objArr[0];
                    boolean booleanValue = ((java.lang.Boolean) objArr[1]).booleanValue();
                    int i8 = writeReplace;
                    valueOf = (((i8 | 119) << 1) - (i8 ^ 119)) % 128;
                    valueof.DigitizedCardProfile.setNeedClientAuth(booleanValue);
                    int i9 = valueOf;
                    int i10 = i9 & 31;
                    int i11 = (i9 | 31) & (~i10);
                    int i12 = i10 << 1;
                    writeReplace = ((i11 & i12) + (i11 | i12)) % 128;
                    return null;
                case 6:
                    return RecordsJson(objArr);
                case 7:
                    com.payair.hce.getMonth.valueOf valueof2 = (com.payair.hce.getMonth.valueOf) objArr[0];
                    java.lang.Object obj = objArr[1];
                    writeReplace = (valueOf + 101) % 128;
                    boolean equals = valueof2.DigitizedCardProfile.equals(obj);
                    int i13 = writeReplace;
                    int i14 = i13 & 41;
                    int i15 = (i13 | 41) & (~i14);
                    int i16 = -(-(i14 << 1));
                    valueOf = ((i15 & i16) + (i15 | i16)) % 128;
                    return java.lang.Boolean.valueOf(equals);
                case 8:
                    return SdkCoreAlternateContactlessPaymentDataImpl(objArr);
                case 9:
                    com.payair.hce.getMonth.valueOf valueof3 = (com.payair.hce.getMonth.valueOf) objArr[0];
                    java.net.SocketAddress socketAddress = (java.net.SocketAddress) objArr[1];
                    int i17 = writeReplace;
                    valueOf = ((-2) - (~(((i17 | 48) << 1) - (i17 ^ 48)))) % 128;
                    valueof3.DigitizedCardProfile.connect(socketAddress);
                    int i18 = valueOf;
                    int i19 = i18 & 73;
                    int i20 = (i18 | 73) & (~i19);
                    int i21 = i19 << 1;
                    writeReplace = (((i20 | i21) << 1) - (i20 ^ i21)) % 128;
                    return null;
                case 10:
                    com.payair.hce.getMonth.valueOf valueof4 = (com.payair.hce.getMonth.valueOf) objArr[0];
                    valueOf = ((-2) - (~(writeReplace + 18))) % 128;
                    boolean reuseAddress = valueof4.DigitizedCardProfile.getReuseAddress();
                    int i22 = valueOf;
                    writeReplace = (((i22 & 18) + (i22 | 18)) - 1) % 128;
                    return java.lang.Boolean.valueOf(reuseAddress);
                case 11:
                    return getAid(objArr);
                case 12:
                    return getProfileVersion(objArr);
                case 13:
                    return IccPrivateKeyCrtComponentsJson(objArr);
                case 14:
                    return getPaymentFci(objArr);
                case 15:
                    com.payair.hce.getMonth.valueOf valueof5 = (com.payair.hce.getMonth.valueOf) objArr[0];
                    java.lang.String[] strArr = (java.lang.String[]) objArr[1];
                    valueOf = (writeReplace + 29) % 128;
                    valueof5.DigitizedCardProfile.setEnabledCipherSuites(strArr);
                    int i23 = writeReplace;
                    int i24 = (i23 | 117) << 1;
                    int i25 = -((i23 & (-118)) | ((~i23) & 117));
                    valueOf = (((i24 | i25) << 1) - (i25 ^ i24)) % 128;
                    return null;
                case 16:
                    return getGpoResponse(objArr);
                case 17:
                    return getCiacDecline(objArr);
                case 18:
                    return getCvrMaskAnd(objArr);
                case 19:
                    com.payair.hce.getMonth.valueOf valueof6 = (com.payair.hce.getMonth.valueOf) objArr[0];
                    int i26 = valueOf;
                    int i27 = i26 & 23;
                    writeReplace = ((i27 - (~((i26 ^ 23) | i27))) - 1) % 128;
                    java.lang.String[] enabledCipherSuites = valueof6.DigitizedCardProfile.getEnabledCipherSuites();
                    int i28 = valueOf;
                    int i29 = i28 & 111;
                    int i30 = (i28 ^ 111) | i29;
                    writeReplace = ((i29 & i30) + (i30 | i29)) % 128;
                    return enabledCipherSuites;
                case 20:
                    return SdkCoreBusinessLogicModuleImpl(objArr);
                case 21:
                    return getApplicationLifeCycleData(objArr);
                case 22:
                    com.payair.hce.getMonth.valueOf valueof7 = (com.payair.hce.getMonth.valueOf) objArr[0];
                    int i31 = writeReplace;
                    int i32 = i31 & 27;
                    int i33 = (i31 ^ 27) | i32;
                    valueOf = ((i32 & i33) + (i33 | i32)) % 128;
                    boolean isConnected = valueof7.DigitizedCardProfile.isConnected();
                    int i34 = valueOf;
                    int i35 = i34 ^ 15;
                    writeReplace = ((((i34 & 15) | i35) << 1) - i35) % 128;
                    return java.lang.Boolean.valueOf(isConnected);
                case 23:
                    com.payair.hce.getMonth.valueOf valueof8 = (com.payair.hce.getMonth.valueOf) objArr[0];
                    javax.net.ssl.HandshakeCompletedListener handshakeCompletedListener = (javax.net.ssl.HandshakeCompletedListener) objArr[1];
                    int i36 = writeReplace;
                    valueOf = ((i36 ^ 85) + ((i36 & 85) << 1)) % 128;
                    valueof8.DigitizedCardProfile.removeHandshakeCompletedListener(handshakeCompletedListener);
                    int i37 = writeReplace;
                    int i38 = i37 & 99;
                    valueOf = (i38 + ((i37 ^ 99) | i38)) % 128;
                    return null;
                case 24:
                    return getSecurityWord(objArr);
                case 25:
                    return getCardLayoutDescription(objArr);
                case 26:
                    return getCvmResetTimeout(objArr);
                case 27:
                    return getDualTapResetTimeout(objArr);
                case 28:
                    return getAdditionalCheckTable(objArr);
                case 29:
                    return getCardholderValidators(objArr);
                case 30:
                    return getMchipCvmIssuerOptions(objArr);
                case 31:
                    return SdkCoreCardRiskManagementDataImpl(objArr);
                case 32:
                    return getMagstripeCvmIssuerOptions(objArr);
                case 33:
                    return buildRecords(objArr);
                case 34:
                    com.payair.hce.getMonth.valueOf valueof9 = (com.payair.hce.getMonth.valueOf) objArr[0];
                    java.net.SocketAddress socketAddress2 = (java.net.SocketAddress) objArr[1];
                    int i39 = valueOf;
                    int i40 = (i39 ^ 92) + ((i39 & 92) << 1);
                    writeReplace = ((~i40) + (i40 << 1)) % 128;
                    valueof9.DigitizedCardProfile.bind(socketAddress2);
                    int i41 = writeReplace;
                    int i42 = i41 & 55;
                    int i43 = -(-((i41 ^ 55) | i42));
                    valueOf = ((i42 ^ i43) + ((i43 & i42) << 1)) % 128;
                    return null;
                case 35:
                    com.payair.hce.getMonth.valueOf valueof10 = (com.payair.hce.getMonth.valueOf) objArr[0];
                    valueOf = (writeReplace + 25) % 128;
                    valueof10.DigitizedCardProfile.shutdownInput();
                    int i44 = writeReplace;
                    int i45 = (i44 | 41) << 1;
                    int i46 = -((i44 & (-42)) | ((~i44) & 41));
                    valueOf = (((i45 | i46) << 1) - (i46 ^ i45)) % 128;
                    return null;
                case 36:
                    com.payair.hce.getMonth.valueOf valueof11 = (com.payair.hce.getMonth.valueOf) objArr[0];
                    int intValue = ((java.lang.Number) objArr[1]).intValue();
                    int intValue2 = ((java.lang.Number) objArr[2]).intValue();
                    int intValue3 = ((java.lang.Number) objArr[3]).intValue();
                    writeReplace = (valueOf + 13) % 128;
                    valueof11.DigitizedCardProfile.setPerformancePreferences(intValue, intValue2, intValue3);
                    int i47 = valueOf;
                    int i48 = i47 & 121;
                    int i49 = i47 | 121;
                    writeReplace = (((i48 | i49) << 1) - (i49 ^ i48)) % 128;
                    return null;
                case 37:
                    return getCdol1RelatedDataLength(objArr);
                case 38:
                    return SdkCoreContactlessPaymentDataImpl(objArr);
                case 39:
                    return getPpseFci(objArr);
                case 40:
                    com.payair.hce.getMonth.valueOf valueof12 = (com.payair.hce.getMonth.valueOf) objArr[0];
                    int intValue4 = ((java.lang.Number) objArr[1]).intValue();
                    int i50 = valueOf;
                    int i51 = i50 ^ 59;
                    int i52 = ((i50 & 59) | i51) << 1;
                    int i53 = -i51;
                    writeReplace = (((i52 | i53) << 1) - (i52 ^ i53)) % 128;
                    valueof12.DigitizedCardProfile.setTrafficClass(intValue4);
                    int i54 = valueOf;
                    int i55 = i54 & 23;
                    int i56 = (i54 ^ 23) | i55;
                    writeReplace = ((i55 ^ i56) + ((i56 & i55) << 1)) % 128;
                    return null;
                case 41:
                    return getCrmCountryCode(objArr);
                case 42:
                    return getIccPrivateKeyCrtComponents(objArr);
                case 43:
                    com.payair.hce.getMonth.valueOf valueof13 = (com.payair.hce.getMonth.valueOf) objArr[0];
                    int intValue5 = ((java.lang.Number) objArr[1]).intValue();
                    int i57 = valueOf;
                    writeReplace = (((i57 & 120) + (i57 | 120)) - 1) % 128;
                    valueof13.DigitizedCardProfile.sendUrgentData(intValue5);
                    writeReplace = (valueOf + 25) % 128;
                    return null;
                case 44:
                    com.payair.hce.getMonth.valueOf valueof14 = (com.payair.hce.getMonth.valueOf) objArr[0];
                    int i58 = writeReplace;
                    valueOf = ((i58 ^ 5) + ((i58 & 5) << 1)) % 128;
                    java.net.InetAddress localAddress = valueof14.DigitizedCardProfile.getLocalAddress();
                    int i59 = writeReplace;
                    int i60 = ((i59 | 36) << 1) - (i59 ^ 36);
                    valueOf = ((~i60) + (i60 << 1)) % 128;
                    return localAddress;
                case 45:
                    return getIssuerApplicationData(objArr);
                case 46:
                    return getPinIvCvc3Track2(objArr);
                case 47:
                    return getAlternateContactlessPaymentData(objArr);
                case 48:
                    return getCiacDeclineOnPpms(objArr);
                case 49:
                    return SdkCoreDigitizedCardProfileImpl(objArr);
                case 50:
                    return getDigitizedCardId(objArr);
                case 51:
                    return getMaximumPinTry(objArr);
                case 52:
                    return build(objArr);
                default:
                    return values(objArr);
            }
        }

        valueOf(javax.net.ssl.SSLSocket sSLSocket) {
            this.DigitizedCardProfile = sSLSocket;
        }

        private static /* synthetic */ java.lang.Object getDigitizedCardId(java.lang.Object[] objArr) {
            com.payair.hce.getMonth.valueOf valueof = (com.payair.hce.getMonth.valueOf) objArr[0];
            int i = valueOf;
            int i2 = i & 71;
            int i3 = ((((i ^ 71) | i2) << 1) - (~(-((i | 71) & (~i2))))) - 1;
            writeReplace = i3 % 128;
            java.lang.String[] supportedCipherSuites = valueof.DigitizedCardProfile.getSupportedCipherSuites();
            if (i3 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            int i4 = valueOf + 75;
            writeReplace = i4 % 128;
            if (i4 % 2 == 0) {
                return supportedCipherSuites;
            }
            throw null;
        }

        private static /* synthetic */ java.lang.Object getApplicationLifeCycleData(java.lang.Object[] objArr) {
            com.payair.hce.getMonth.valueOf valueof = (com.payair.hce.getMonth.valueOf) objArr[0];
            int i = valueOf;
            int i2 = ((i | 95) << 1) - (i ^ 95);
            writeReplace = i2 % 128;
            javax.net.ssl.SSLSocket sSLSocket = valueof.DigitizedCardProfile;
            if (i2 % 2 == 0) {
                return sSLSocket.getSupportedProtocols();
            }
            sSLSocket.getSupportedProtocols();
            throw null;
        }

        private static /* synthetic */ java.lang.Object getMaximumPinTry(java.lang.Object[] objArr) {
            com.payair.hce.getMonth.valueOf valueof = (com.payair.hce.getMonth.valueOf) objArr[0];
            int i = valueOf;
            int i2 = (i & (-46)) | ((~i) & 45);
            int i3 = -(-((i & 45) << 1));
            int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
            writeReplace = i4 % 128;
            javax.net.ssl.SSLSocket sSLSocket = valueof.DigitizedCardProfile;
            if (i4 % 2 != 0) {
                sSLSocket.getEnabledProtocols();
                throw null;
            }
            java.lang.String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            int i5 = valueOf;
            int i6 = (i5 & (-72)) | ((~i5) & 71);
            int i7 = -(-((i5 & 71) << 1));
            writeReplace = (((i6 | i7) << 1) - (i7 ^ i6)) % 128;
            return enabledProtocols;
        }

        private static /* synthetic */ java.lang.Object getPinIvCvc3Track2(java.lang.Object[] objArr) {
            com.payair.hce.getMonth.valueOf valueof = (com.payair.hce.getMonth.valueOf) objArr[0];
            java.lang.String[] strArr = (java.lang.String[]) objArr[1];
            int i = valueOf;
            int i2 = i & 13;
            int i3 = (((i | 13) & (~i2)) - (~(i2 << 1))) - 1;
            writeReplace = i3 % 128;
            if (i3 % 2 == 0) {
                valueof.DigitizedCardProfile.setEnabledProtocols(strArr);
                int i4 = valueOf;
                int i5 = i4 ^ 27;
                int i6 = (i4 & 27) << 1;
                writeReplace = ((i5 ^ i6) + ((i6 & i5) << 1)) % 128;
                return null;
            }
            valueof.DigitizedCardProfile.setEnabledProtocols(strArr);
            throw null;
        }

        private static /* synthetic */ java.lang.Object getCrmCountryCode(java.lang.Object[] objArr) {
            com.payair.hce.getMonth.valueOf valueof = (com.payair.hce.getMonth.valueOf) objArr[0];
            int i = valueOf;
            int i2 = i & 115;
            int i3 = (i ^ 115) | i2;
            int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
            writeReplace = i4 % 128;
            javax.net.ssl.SSLSocket sSLSocket = valueof.DigitizedCardProfile;
            if (i4 % 2 == 0) {
                return sSLSocket.getSession();
            }
            sSLSocket.getSession();
            throw null;
        }

        private static /* synthetic */ java.lang.Object getAdditionalCheckTable(java.lang.Object[] objArr) {
            com.payair.hce.getMonth.valueOf valueof = (com.payair.hce.getMonth.valueOf) objArr[0];
            javax.net.ssl.HandshakeCompletedListener handshakeCompletedListener = (javax.net.ssl.HandshakeCompletedListener) objArr[1];
            int i = writeReplace;
            int i2 = i ^ 33;
            int i3 = ((i & 33) | i2) << 1;
            int i4 = -i2;
            valueOf = ((i3 & i4) + (i3 | i4)) % 128;
            valueof.DigitizedCardProfile.addHandshakeCompletedListener(handshakeCompletedListener);
            int i5 = valueOf;
            int i6 = ((i5 & 89) - (~(-(-(i5 | 89))))) - 1;
            writeReplace = i6 % 128;
            if (i6 % 2 == 0) {
                return null;
            }
            throw new java.lang.ArithmeticException();
        }

        private static /* synthetic */ java.lang.Object getMagstripeCvmIssuerOptions(java.lang.Object[] objArr) {
            com.payair.hce.getMonth.valueOf valueof = (com.payair.hce.getMonth.valueOf) objArr[0];
            int i = writeReplace + 115;
            valueOf = i % 128;
            if (i % 2 != 0) {
                valueof.DigitizedCardProfile.startHandshake();
                int i2 = valueOf;
                int i3 = i2 & 23;
                writeReplace = (i3 + ((i2 ^ 23) | i3)) % 128;
                return null;
            }
            valueof.DigitizedCardProfile.startHandshake();
            throw null;
        }

        private static /* synthetic */ java.lang.Object SdkCoreDigitizedCardProfileImpl(java.lang.Object[] objArr) {
            com.payair.hce.getMonth.valueOf valueof = (com.payair.hce.getMonth.valueOf) objArr[0];
            boolean booleanValue = ((java.lang.Boolean) objArr[1]).booleanValue();
            int i = valueOf;
            int i2 = (((i ^ 47) | (i & 47)) << 1) - ((i & (-48)) | ((~i) & 47));
            writeReplace = i2 % 128;
            if (i2 % 2 == 0) {
                valueof.DigitizedCardProfile.setUseClientMode(booleanValue);
                int i3 = writeReplace;
                int i4 = i3 & 63;
                int i5 = (i3 ^ 63) | i4;
                int i6 = (i4 & i5) + (i5 | i4);
                valueOf = i6 % 128;
                if (i6 % 2 != 0) {
                    return null;
                }
                throw null;
            }
            valueof.DigitizedCardProfile.setUseClientMode(booleanValue);
            throw null;
        }

        private static /* synthetic */ java.lang.Object getCardLayoutDescription(java.lang.Object[] objArr) {
            com.payair.hce.getMonth.valueOf valueof = (com.payair.hce.getMonth.valueOf) objArr[0];
            int i = writeReplace;
            int i2 = (((i & (-104)) | ((~i) & 103)) - (~((i & 103) << 1))) - 1;
            valueOf = i2 % 128;
            javax.net.ssl.SSLSocket sSLSocket = valueof.DigitizedCardProfile;
            if (i2 % 2 == 0) {
                sSLSocket.getUseClientMode();
                throw null;
            }
            boolean useClientMode = sSLSocket.getUseClientMode();
            int i3 = writeReplace;
            valueOf = (((i3 | 73) << 1) - (i3 ^ 73)) % 128;
            return java.lang.Boolean.valueOf(useClientMode);
        }

        private static /* synthetic */ java.lang.Object getCiacDecline(java.lang.Object[] objArr) {
            com.payair.hce.getMonth.valueOf valueof = (com.payair.hce.getMonth.valueOf) objArr[0];
            boolean booleanValue = ((java.lang.Boolean) objArr[1]).booleanValue();
            int i = valueOf;
            int i2 = i ^ 39;
            int i3 = -(-((i & 39) << 1));
            writeReplace = ((i2 & i3) + (i3 | i2)) % 128;
            valueof.DigitizedCardProfile.setWantClientAuth(booleanValue);
            int i4 = valueOf;
            int i5 = ((i4 & 1) - (~(-(-(i4 | 1))))) - 1;
            writeReplace = i5 % 128;
            if (i5 % 2 == 0) {
                return null;
            }
            throw null;
        }

        private static /* synthetic */ java.lang.Object SdkCoreBusinessLogicModuleImpl(java.lang.Object[] objArr) {
            com.payair.hce.getMonth.valueOf valueof = (com.payair.hce.getMonth.valueOf) objArr[0];
            int i = writeReplace;
            valueOf = ((i & 93) + (i | 93)) % 128;
            boolean needClientAuth = valueof.DigitizedCardProfile.getNeedClientAuth();
            int i2 = valueOf + 89;
            writeReplace = i2 % 128;
            if (i2 % 2 == 0) {
                return java.lang.Boolean.valueOf(needClientAuth);
            }
            throw null;
        }

        private static /* synthetic */ java.lang.Object build(java.lang.Object[] objArr) {
            com.payair.hce.getMonth.valueOf valueof = (com.payair.hce.getMonth.valueOf) objArr[0];
            int i = valueOf;
            int i2 = ((i & (-62)) | ((~i) & 61)) + ((i & 61) << 1);
            writeReplace = i2 % 128;
            javax.net.ssl.SSLSocket sSLSocket = valueof.DigitizedCardProfile;
            if (i2 % 2 == 0) {
                return java.lang.Boolean.valueOf(sSLSocket.getWantClientAuth());
            }
            sSLSocket.getWantClientAuth();
            throw null;
        }

        private static /* synthetic */ java.lang.Object getGpoResponse(java.lang.Object[] objArr) {
            com.payair.hce.getMonth.valueOf valueof = (com.payair.hce.getMonth.valueOf) objArr[0];
            boolean booleanValue = ((java.lang.Boolean) objArr[1]).booleanValue();
            int i = writeReplace;
            int i2 = (i & (-30)) | ((~i) & 29);
            int i3 = -(-((i & 29) << 1));
            int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
            valueOf = i4 % 128;
            if (i4 % 2 != 0) {
                valueof.DigitizedCardProfile.setEnableSessionCreation(booleanValue);
                return null;
            }
            valueof.DigitizedCardProfile.setEnableSessionCreation(booleanValue);
            throw null;
        }

        private static /* synthetic */ java.lang.Object SdkCoreContactlessPaymentDataImpl(java.lang.Object[] objArr) {
            com.payair.hce.getMonth.valueOf valueof = (com.payair.hce.getMonth.valueOf) objArr[0];
            int i = valueOf;
            int i2 = ((i ^ 60) + ((i & 60) << 1)) - 1;
            writeReplace = i2 % 128;
            javax.net.ssl.SSLSocket sSLSocket = valueof.DigitizedCardProfile;
            if (i2 % 2 != 0) {
                sSLSocket.getEnableSessionCreation();
                throw null;
            }
            boolean enableSessionCreation = sSLSocket.getEnableSessionCreation();
            int i3 = valueOf;
            int i4 = i3 & 29;
            int i5 = (i3 | 29) & (~i4);
            int i6 = -(-(i4 << 1));
            writeReplace = ((i5 ^ i6) + ((i5 & i6) << 1)) % 128;
            return java.lang.Boolean.valueOf(enableSessionCreation);
        }

        @Override // java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws java.io.IOException {
            synchronized (this) {
                int i = writeReplace;
                int i2 = (i & (-30)) | ((~i) & 29);
                int i3 = (i & 29) << 1;
                valueOf = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
                this.DigitizedCardProfile.close();
                int i4 = valueOf;
                writeReplace = (((i4 | 9) << 1) - (i4 ^ 9)) % 128;
            }
        }

        private static /* synthetic */ java.lang.Object getAlternateContactlessPaymentData(java.lang.Object[] objArr) {
            com.payair.hce.getMonth.valueOf valueof = (com.payair.hce.getMonth.valueOf) objArr[0];
            java.net.SocketAddress socketAddress = (java.net.SocketAddress) objArr[1];
            int intValue = ((java.lang.Number) objArr[2]).intValue();
            int i = valueOf + 89;
            writeReplace = i % 128;
            if (i % 2 == 0) {
                valueof.DigitizedCardProfile.connect(socketAddress, intValue);
                return null;
            }
            valueof.DigitizedCardProfile.connect(socketAddress, intValue);
            throw new java.lang.ArithmeticException();
        }

        private static /* synthetic */ java.lang.Object getCvmResetTimeout(java.lang.Object[] objArr) {
            com.payair.hce.getMonth.valueOf valueof = (com.payair.hce.getMonth.valueOf) objArr[0];
            int i = writeReplace;
            int i2 = i & 71;
            int i3 = ((i | 71) & (~i2)) + (i2 << 1);
            valueOf = i3 % 128;
            javax.net.ssl.SSLSocket sSLSocket = valueof.DigitizedCardProfile;
            if (i3 % 2 == 0) {
                sSLSocket.getChannel();
                throw null;
            }
            java.nio.channels.SocketChannel channel = sSLSocket.getChannel();
            int i4 = writeReplace;
            int i5 = ((i4 | 119) << 1) - (i4 ^ 119);
            valueOf = i5 % 128;
            if (i5 % 2 != 0) {
                return channel;
            }
            throw new java.lang.ArithmeticException();
        }

        private static /* synthetic */ java.lang.Object getDualTapResetTimeout(java.lang.Object[] objArr) {
            com.payair.hce.getMonth.valueOf valueof = (com.payair.hce.getMonth.valueOf) objArr[0];
            int i = writeReplace;
            int i2 = i & 107;
            int i3 = ((i ^ 107) | i2) << 1;
            int i4 = -((i | 107) & (~i2));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            valueOf = i5 % 128;
            javax.net.ssl.SSLSocket sSLSocket = valueof.DigitizedCardProfile;
            if (i5 % 2 == 0) {
                sSLSocket.getInetAddress();
                throw null;
            }
            java.net.InetAddress inetAddress = sSLSocket.getInetAddress();
            writeReplace = (valueOf + 67) % 128;
            return inetAddress;
        }

        private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
            com.payair.hce.getMonth.valueOf valueof = (com.payair.hce.getMonth.valueOf) objArr[0];
            int i = writeReplace + 39;
            valueOf = i % 128;
            javax.net.ssl.SSLSocket sSLSocket = valueof.DigitizedCardProfile;
            if (i % 2 == 0) {
                sSLSocket.getInputStream();
                throw null;
            }
            java.io.InputStream inputStream = sSLSocket.getInputStream();
            int i2 = writeReplace;
            int i3 = i2 & 119;
            int i4 = (i3 - (~((i2 ^ 119) | i3))) - 1;
            valueOf = i4 % 128;
            if (i4 % 2 != 0) {
                return inputStream;
            }
            throw null;
        }

        private static /* synthetic */ java.lang.Object IccPrivateKeyCrtComponentsJson(java.lang.Object[] objArr) {
            com.payair.hce.getMonth.valueOf valueof = (com.payair.hce.getMonth.valueOf) objArr[0];
            int i = writeReplace;
            int i2 = ((i ^ 51) | (i & 51)) << 1;
            int i3 = -((i & (-52)) | ((~i) & 51));
            int i4 = (i2 & i3) + (i3 | i2);
            valueOf = i4 % 128;
            javax.net.ssl.SSLSocket sSLSocket = valueof.DigitizedCardProfile;
            if (i4 % 2 != 0) {
                return java.lang.Boolean.valueOf(sSLSocket.getKeepAlive());
            }
            sSLSocket.getKeepAlive();
            throw null;
        }

        private static /* synthetic */ java.lang.Object getAid(java.lang.Object[] objArr) {
            com.payair.hce.getMonth.valueOf valueof = (com.payair.hce.getMonth.valueOf) objArr[0];
            valueOf = (writeReplace + 61) % 128;
            int localPort = valueof.DigitizedCardProfile.getLocalPort();
            int i = writeReplace + 93;
            valueOf = i % 128;
            if (i % 2 != 0) {
                return java.lang.Integer.valueOf(localPort);
            }
            throw null;
        }

        private static /* synthetic */ java.lang.Object buildRecords(java.lang.Object[] objArr) {
            com.payair.hce.getMonth.valueOf valueof = (com.payair.hce.getMonth.valueOf) objArr[0];
            writeReplace = (valueOf + 89) % 128;
            java.net.SocketAddress localSocketAddress = valueof.DigitizedCardProfile.getLocalSocketAddress();
            int i = valueOf;
            int i2 = i & 77;
            int i3 = ((i ^ 77) | i2) << 1;
            int i4 = -((i | 77) & (~i2));
            int i5 = (i3 & i4) + (i4 | i3);
            writeReplace = i5 % 128;
            if (i5 % 2 == 0) {
                return localSocketAddress;
            }
            throw new java.lang.ArithmeticException();
        }

        private static /* synthetic */ java.lang.Object getIccPrivateKeyCrtComponents(java.lang.Object[] objArr) {
            com.payair.hce.getMonth.valueOf valueof = (com.payair.hce.getMonth.valueOf) objArr[0];
            int i = valueOf;
            int i2 = i & 29;
            int i3 = ((i ^ 29) | i2) << 1;
            int i4 = -((i | 29) & (~i2));
            int i5 = (i3 & i4) + (i4 | i3);
            writeReplace = i5 % 128;
            boolean oOBInline = valueof.DigitizedCardProfile.getOOBInline();
            if (i5 % 2 == 0) {
                return java.lang.Boolean.valueOf(oOBInline);
            }
            throw new java.lang.ArithmeticException();
        }

        private static /* synthetic */ java.lang.Object getCvrMaskAnd(java.lang.Object[] objArr) {
            com.payair.hce.getMonth.valueOf valueof = (com.payair.hce.getMonth.valueOf) objArr[0];
            int i = valueOf & 101;
            writeReplace = ((((r0 | 101) & (~i)) - (~(-(-(i << 1))))) - 1) % 128;
            java.io.OutputStream outputStream = valueof.DigitizedCardProfile.getOutputStream();
            int i2 = valueOf;
            int i3 = ((i2 | 113) << 1) - (i2 ^ 113);
            writeReplace = i3 % 128;
            if (i3 % 2 == 0) {
                return outputStream;
            }
            throw null;
        }

        private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
            com.payair.hce.getMonth.valueOf valueof = (com.payair.hce.getMonth.valueOf) objArr[0];
            int i = writeReplace + 99;
            valueOf = i % 128;
            int port = valueof.DigitizedCardProfile.getPort();
            if (i % 2 != 0) {
                return java.lang.Integer.valueOf(port);
            }
            throw new java.lang.ArithmeticException();
        }

        @Override // java.net.Socket
        public final int getReceiveBufferSize() throws java.net.SocketException {
            int receiveBufferSize;
            synchronized (this) {
                int i = valueOf;
                int i2 = ((i ^ 91) | (i & 91)) << 1;
                int i3 = -((i & (-92)) | ((~i) & 91));
                int i4 = (i2 & i3) + (i3 | i2);
                writeReplace = i4 % 128;
                if (i4 % 2 != 0) {
                    this.DigitizedCardProfile.getReceiveBufferSize();
                    throw null;
                }
                receiveBufferSize = this.DigitizedCardProfile.getReceiveBufferSize();
            }
            return receiveBufferSize;
        }

        private static /* synthetic */ java.lang.Object getCdol1RelatedDataLength(java.lang.Object[] objArr) {
            com.payair.hce.getMonth.valueOf valueof = (com.payair.hce.getMonth.valueOf) objArr[0];
            int i = writeReplace;
            valueOf = ((i ^ 83) + ((i & 83) << 1)) % 128;
            java.net.SocketAddress remoteSocketAddress = valueof.DigitizedCardProfile.getRemoteSocketAddress();
            int i2 = writeReplace;
            int i3 = (((i2 ^ 11) | (i2 & 11)) << 1) - ((i2 & (-12)) | ((~i2) & 11));
            valueOf = i3 % 128;
            if (i3 % 2 != 0) {
                return remoteSocketAddress;
            }
            throw new java.lang.ArithmeticException();
        }

        @Override // java.net.Socket
        public final int getSendBufferSize() throws java.net.SocketException {
            int sendBufferSize;
            synchronized (this) {
                int i = writeReplace;
                int i2 = (i & (-96)) | ((~i) & 95);
                int i3 = (i & 95) << 1;
                int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
                valueOf = i4 % 128;
                if (i4 % 2 == 0) {
                    this.DigitizedCardProfile.getSendBufferSize();
                    throw new java.lang.ArithmeticException();
                }
                sendBufferSize = this.DigitizedCardProfile.getSendBufferSize();
                writeReplace = (valueOf + 15) % 128;
            }
            return sendBufferSize;
        }

        private static /* synthetic */ java.lang.Object getCiacDeclineOnPpms(java.lang.Object[] objArr) {
            com.payair.hce.getMonth.valueOf valueof = (com.payair.hce.getMonth.valueOf) objArr[0];
            int i = valueOf;
            writeReplace = (((i & 116) + (i | 116)) - 1) % 128;
            int soLinger = valueof.DigitizedCardProfile.getSoLinger();
            int i2 = writeReplace;
            int i3 = i2 & 63;
            int i4 = i3 + ((i2 ^ 63) | i3);
            valueOf = i4 % 128;
            if (i4 % 2 != 0) {
                return java.lang.Integer.valueOf(soLinger);
            }
            throw new java.lang.ArithmeticException();
        }

        @Override // java.net.Socket
        public final int getSoTimeout() throws java.net.SocketException {
            int soTimeout;
            synchronized (this) {
                int i = writeReplace;
                valueOf = ((i ^ 77) + ((i & 77) << 1)) % 128;
                soTimeout = this.DigitizedCardProfile.getSoTimeout();
                int i2 = writeReplace;
                int i3 = i2 ^ 11;
                int i4 = -(-((i2 & 11) << 1));
                valueOf = ((i3 & i4) + (i4 | i3)) % 128;
            }
            return soTimeout;
        }

        private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
            com.payair.hce.getMonth.valueOf valueof = (com.payair.hce.getMonth.valueOf) objArr[0];
            int i = writeReplace + 99;
            valueOf = i % 128;
            boolean tcpNoDelay = valueof.DigitizedCardProfile.getTcpNoDelay();
            if (i % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            int i2 = valueOf;
            int i3 = (i2 & androidx.media3.common.PlaybackException.ERROR_CODE_CONTENT_ALREADY_PLAYING) | ((~i2) & 109);
            int i4 = -(-((i2 & 109) << 1));
            writeReplace = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
            return java.lang.Boolean.valueOf(tcpNoDelay);
        }

        private static /* synthetic */ java.lang.Object getPaymentFci(java.lang.Object[] objArr) {
            com.payair.hce.getMonth.valueOf valueof = (com.payair.hce.getMonth.valueOf) objArr[0];
            int i = writeReplace;
            int i2 = i | 5;
            int i3 = i2 << 1;
            int i4 = -((~(i & 5)) & i2);
            int i5 = (i3 & i4) + (i4 | i3);
            valueOf = i5 % 128;
            javax.net.ssl.SSLSocket sSLSocket = valueof.DigitizedCardProfile;
            if (i5 % 2 == 0) {
                sSLSocket.getTrafficClass();
                throw null;
            }
            int trafficClass = sSLSocket.getTrafficClass();
            int i6 = valueOf;
            int i7 = i6 ^ 19;
            int i8 = (i6 & 19) << 1;
            writeReplace = ((i7 & i8) + (i8 | i7)) % 128;
            return java.lang.Integer.valueOf(trafficClass);
        }

        private static /* synthetic */ java.lang.Object RecordsJson(java.lang.Object[] objArr) {
            com.payair.hce.getMonth.valueOf valueof = (com.payair.hce.getMonth.valueOf) objArr[0];
            int i = valueOf;
            int i2 = ((((i ^ 49) | (i & 49)) << 1) - (~(-((i & (-50)) | ((~i) & 49))))) - 1;
            writeReplace = i2 % 128;
            boolean isBound = valueof.DigitizedCardProfile.isBound();
            if (i2 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            int i3 = writeReplace;
            int i4 = ((i3 ^ 49) | (i3 & 49)) << 1;
            int i5 = -((i3 & (-50)) | ((~i3) & 49));
            int i6 = (i4 & i5) + (i5 | i4);
            valueOf = i6 % 128;
            if (i6 % 2 != 0) {
                return java.lang.Boolean.valueOf(isBound);
            }
            throw null;
        }

        private static /* synthetic */ java.lang.Object getCardholderValidators(java.lang.Object[] objArr) {
            com.payair.hce.getMonth.valueOf valueof = (com.payair.hce.getMonth.valueOf) objArr[0];
            int i = writeReplace;
            int i2 = i & 97;
            valueOf = (i2 + ((i ^ 97) | i2)) % 128;
            boolean isClosed = valueof.DigitizedCardProfile.isClosed();
            int i3 = writeReplace;
            int i4 = i3 & 59;
            int i5 = i4 + ((i3 ^ 59) | i4);
            valueOf = i5 % 128;
            if (i5 % 2 != 0) {
                return java.lang.Boolean.valueOf(isClosed);
            }
            throw new java.lang.ArithmeticException();
        }

        private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
            com.payair.hce.getMonth.valueOf valueof = (com.payair.hce.getMonth.valueOf) objArr[0];
            int i = valueOf;
            int i2 = ((i ^ 4) + ((i & 4) << 1)) - 1;
            writeReplace = i2 % 128;
            javax.net.ssl.SSLSocket sSLSocket = valueof.DigitizedCardProfile;
            if (i2 % 2 != 0) {
                sSLSocket.isInputShutdown();
                throw null;
            }
            boolean isInputShutdown = sSLSocket.isInputShutdown();
            int i3 = valueOf;
            int i4 = i3 & 51;
            writeReplace = (((i3 | 51) & (~i4)) + (i4 << 1)) % 128;
            return java.lang.Boolean.valueOf(isInputShutdown);
        }

        private static /* synthetic */ java.lang.Object getIssuerApplicationData(java.lang.Object[] objArr) {
            com.payair.hce.getMonth.valueOf valueof = (com.payair.hce.getMonth.valueOf) objArr[0];
            valueOf = (writeReplace + 53) % 128;
            boolean isOutputShutdown = valueof.DigitizedCardProfile.isOutputShutdown();
            int i = valueOf;
            int i2 = ((i & (-104)) | ((~i) & 103)) + ((i & 103) << 1);
            writeReplace = i2 % 128;
            if (i2 % 2 == 0) {
                return java.lang.Boolean.valueOf(isOutputShutdown);
            }
            throw null;
        }

        private static /* synthetic */ java.lang.Object getPpseFci(java.lang.Object[] objArr) {
            com.payair.hce.getMonth.valueOf valueof = (com.payair.hce.getMonth.valueOf) objArr[0];
            boolean booleanValue = ((java.lang.Boolean) objArr[1]).booleanValue();
            int i = writeReplace;
            int i2 = ((i ^ 1) | (i & 1)) << 1;
            int i3 = -((i & (-2)) | ((~i) & 1));
            int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
            valueOf = i4 % 128;
            if (i4 % 2 != 0) {
                valueof.DigitizedCardProfile.setKeepAlive(booleanValue);
                return null;
            }
            valueof.DigitizedCardProfile.setKeepAlive(booleanValue);
            throw null;
        }

        private static /* synthetic */ java.lang.Object SdkCoreAlternateContactlessPaymentDataImpl(java.lang.Object[] objArr) {
            com.payair.hce.getMonth.valueOf valueof = (com.payair.hce.getMonth.valueOf) objArr[0];
            boolean booleanValue = ((java.lang.Boolean) objArr[1]).booleanValue();
            int i = (-2) - (~(valueOf + 54));
            writeReplace = i % 128;
            if (i % 2 == 0) {
                valueof.DigitizedCardProfile.setOOBInline(booleanValue);
                int i2 = valueOf + 27;
                writeReplace = i2 % 128;
                if (i2 % 2 == 0) {
                    return null;
                }
                throw null;
            }
            valueof.DigitizedCardProfile.setOOBInline(booleanValue);
            throw null;
        }

        @Override // java.net.Socket
        public final void setReceiveBufferSize(int i) throws java.net.SocketException {
            synchronized (this) {
                int i2 = valueOf;
                int i3 = i2 & 49;
                writeReplace = (i3 + ((i2 ^ 49) | i3)) % 128;
                this.DigitizedCardProfile.setReceiveBufferSize(i);
                valueOf = (writeReplace + 69) % 128;
            }
        }

        private static /* synthetic */ java.lang.Object getMchipCvmIssuerOptions(java.lang.Object[] objArr) {
            com.payair.hce.getMonth.valueOf valueof = (com.payair.hce.getMonth.valueOf) objArr[0];
            boolean booleanValue = ((java.lang.Boolean) objArr[1]).booleanValue();
            int i = writeReplace;
            int i2 = ((i | 39) << 1) - (i ^ 39);
            valueOf = i2 % 128;
            if (i2 % 2 != 0) {
                valueof.DigitizedCardProfile.setReuseAddress(booleanValue);
                return null;
            }
            valueof.DigitizedCardProfile.setReuseAddress(booleanValue);
            throw null;
        }

        @Override // java.net.Socket
        public final void setSendBufferSize(int i) throws java.net.SocketException {
            synchronized (this) {
                int i2 = writeReplace & 61;
                valueOf = ((i2 - (~(-(-((r0 ^ 61) | i2))))) - 1) % 128;
                this.DigitizedCardProfile.setSendBufferSize(i);
                int i3 = writeReplace;
                int i4 = i3 | 65;
                int i5 = (i4 << 1) - ((~(i3 & 65)) & i4);
                valueOf = i5 % 128;
                if (i5 % 2 == 0) {
                    throw new java.lang.NullPointerException();
                }
            }
        }

        private static /* synthetic */ java.lang.Object SdkCoreCardRiskManagementDataImpl(java.lang.Object[] objArr) {
            com.payair.hce.getMonth.valueOf valueof = (com.payair.hce.getMonth.valueOf) objArr[0];
            boolean booleanValue = ((java.lang.Boolean) objArr[1]).booleanValue();
            int intValue = ((java.lang.Number) objArr[2]).intValue();
            int i = valueOf;
            int i2 = ((i ^ 97) | (i & 97)) << 1;
            int i3 = -((i & (-98)) | ((~i) & 97));
            int i4 = (i2 & i3) + (i3 | i2);
            writeReplace = i4 % 128;
            if (i4 % 2 == 0) {
                valueof.DigitizedCardProfile.setSoLinger(booleanValue, intValue);
                int i5 = valueOf;
                int i6 = i5 & 11;
                int i7 = (i5 | 11) & (~i6);
                int i8 = -(-(i6 << 1));
                int i9 = (i7 & i8) + (i7 | i8);
                writeReplace = i9 % 128;
                if (i9 % 2 == 0) {
                    return null;
                }
                throw new java.lang.ArithmeticException();
            }
            valueof.DigitizedCardProfile.setSoLinger(booleanValue, intValue);
            throw null;
        }

        @Override // java.net.Socket
        public final void setSoTimeout(int i) throws java.net.SocketException {
            synchronized (this) {
                int i2 = writeReplace;
                int i3 = (i2 | 75) << 1;
                int i4 = -((i2 & (-76)) | ((~i2) & 75));
                valueOf = ((i3 ^ i4) + ((i4 & i3) << 1)) % 128;
                this.DigitizedCardProfile.setSoTimeout(i);
                int i5 = writeReplace;
                int i6 = i5 & 125;
                valueOf = (i6 + ((i5 ^ 125) | i6)) % 128;
            }
        }

        private static /* synthetic */ java.lang.Object getSecurityWord(java.lang.Object[] objArr) {
            com.payair.hce.getMonth.valueOf valueof = (com.payair.hce.getMonth.valueOf) objArr[0];
            boolean booleanValue = ((java.lang.Boolean) objArr[1]).booleanValue();
            int i = valueOf;
            int i2 = i & 29;
            int i3 = ((i ^ 29) | i2) << 1;
            int i4 = -((i | 29) & (~i2));
            int i5 = (i3 & i4) + (i3 | i4);
            writeReplace = i5 % 128;
            if (i5 % 2 == 0) {
                valueof.DigitizedCardProfile.setTcpNoDelay(booleanValue);
                int i6 = writeReplace;
                valueOf = ((i6 & 105) + (i6 | 105)) % 128;
                return null;
            }
            valueof.DigitizedCardProfile.setTcpNoDelay(booleanValue);
            throw null;
        }

        private static /* synthetic */ java.lang.Object getProfileVersion(java.lang.Object[] objArr) {
            com.payair.hce.getMonth.valueOf valueof = (com.payair.hce.getMonth.valueOf) objArr[0];
            int i = valueOf;
            int i2 = i & 3;
            int i3 = (i | 3) & (~i2);
            int i4 = i2 << 1;
            int i5 = (i3 & i4) + (i3 | i4);
            writeReplace = i5 % 128;
            if (i5 % 2 == 0) {
                valueof.DigitizedCardProfile.shutdownOutput();
                int i6 = valueOf;
                int i7 = ((i6 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE) + ((i6 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE) << 1)) - 1;
                writeReplace = i7 % 128;
                if (i7 % 2 == 0) {
                    return null;
                }
                throw new java.lang.ArithmeticException();
            }
            valueof.DigitizedCardProfile.shutdownOutput();
            throw null;
        }

        private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
            com.payair.hce.getMonth.valueOf valueof = (com.payair.hce.getMonth.valueOf) objArr[0];
            int i = valueOf;
            int i2 = ((i & (-90)) | ((~i) & 89)) + ((i & 89) << 1);
            writeReplace = i2 % 128;
            javax.net.ssl.SSLSocket sSLSocket = valueof.DigitizedCardProfile;
            if (i2 % 2 == 0) {
                return sSLSocket.toString();
            }
            throw null;
        }

        public final boolean equals(java.lang.Object obj) {
            return ((java.lang.Boolean) valueOf(new java.lang.Object[]{this, obj}, -1550033089, 1550033096, java.lang.System.identityHashCode(this))).booleanValue();
        }

        @Override // javax.net.ssl.SSLSocket, java.net.Socket
        public final java.lang.String toString() {
            return (java.lang.String) valueOf(new java.lang.Object[]{this}, 394791928, -394791926, java.lang.System.identityHashCode(this));
        }

        @Override // java.net.Socket
        public final void shutdownOutput() throws java.io.IOException {
            valueOf(new java.lang.Object[]{this}, 1827288237, -1827288225, java.lang.System.identityHashCode(this));
        }

        @Override // java.net.Socket
        public final void shutdownInput() throws java.io.IOException {
            valueOf(new java.lang.Object[]{this}, 100838882, -100838847, java.lang.System.identityHashCode(this));
        }

        @Override // java.net.Socket
        public final void setTrafficClass(int i) throws java.net.SocketException {
            valueOf(new java.lang.Object[]{this, java.lang.Integer.valueOf(i)}, 1868188778, -1868188738, i);
        }

        @Override // java.net.Socket
        public final void setTcpNoDelay(boolean z) throws java.net.SocketException {
            valueOf(new java.lang.Object[]{this, java.lang.Boolean.valueOf(z)}, 521370400, -521370376, java.lang.System.identityHashCode(this));
        }

        @Override // java.net.Socket
        public final void setSoLinger(boolean z, int i) throws java.net.SocketException {
            valueOf(new java.lang.Object[]{this, java.lang.Boolean.valueOf(z), java.lang.Integer.valueOf(i)}, 2052366602, -2052366571, i);
        }

        @Override // java.net.Socket
        public final void setReuseAddress(boolean z) throws java.net.SocketException {
            valueOf(new java.lang.Object[]{this, java.lang.Boolean.valueOf(z)}, 245462504, -245462474, java.lang.System.identityHashCode(this));
        }

        @Override // java.net.Socket
        public final void setPerformancePreferences(int i, int i2, int i3) {
            valueOf(new java.lang.Object[]{this, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3)}, 1287132348, -1287132312, i);
        }

        @Override // java.net.Socket
        public final void setOOBInline(boolean z) throws java.net.SocketException {
            valueOf(new java.lang.Object[]{this, java.lang.Boolean.valueOf(z)}, -148391144, 148391152, java.lang.System.identityHashCode(this));
        }

        @Override // java.net.Socket
        public final void setKeepAlive(boolean z) throws java.net.SocketException {
            valueOf(new java.lang.Object[]{this, java.lang.Boolean.valueOf(z)}, -521644684, 521644723, java.lang.System.identityHashCode(this));
        }

        @Override // java.net.Socket
        public final void sendUrgentData(int i) throws java.io.IOException {
            valueOf(new java.lang.Object[]{this, java.lang.Integer.valueOf(i)}, -1496034745, 1496034788, i);
        }

        @Override // java.net.Socket
        public final boolean isOutputShutdown() {
            return ((java.lang.Boolean) valueOf(new java.lang.Object[]{this}, -603824990, 603825035, java.lang.System.identityHashCode(this))).booleanValue();
        }

        @Override // java.net.Socket
        public final boolean isInputShutdown() {
            return ((java.lang.Boolean) valueOf(new java.lang.Object[]{this}, 2068295226, -2068295223, java.lang.System.identityHashCode(this))).booleanValue();
        }

        @Override // java.net.Socket
        public final boolean isConnected() {
            return ((java.lang.Boolean) valueOf(new java.lang.Object[]{this}, -1764735431, 1764735453, java.lang.System.identityHashCode(this))).booleanValue();
        }

        @Override // java.net.Socket
        public final boolean isClosed() {
            return ((java.lang.Boolean) valueOf(new java.lang.Object[]{this}, -1035486770, 1035486799, java.lang.System.identityHashCode(this))).booleanValue();
        }

        @Override // java.net.Socket
        public final boolean isBound() {
            return ((java.lang.Boolean) valueOf(new java.lang.Object[]{this}, 1174112313, -1174112307, java.lang.System.identityHashCode(this))).booleanValue();
        }

        @Override // java.net.Socket
        public final int getTrafficClass() throws java.net.SocketException {
            return ((java.lang.Integer) valueOf(new java.lang.Object[]{this}, 870533270, -870533256, java.lang.System.identityHashCode(this))).intValue();
        }

        @Override // java.net.Socket
        public final boolean getTcpNoDelay() throws java.net.SocketException {
            return ((java.lang.Boolean) valueOf(new java.lang.Object[]{this}, -244985779, 244985779, java.lang.System.identityHashCode(this))).booleanValue();
        }

        @Override // java.net.Socket
        public final int getSoLinger() throws java.net.SocketException {
            return ((java.lang.Integer) valueOf(new java.lang.Object[]{this}, 1034106366, -1034106318, java.lang.System.identityHashCode(this))).intValue();
        }

        @Override // java.net.Socket
        public final boolean getReuseAddress() throws java.net.SocketException {
            return ((java.lang.Boolean) valueOf(new java.lang.Object[]{this}, -236569646, 236569656, java.lang.System.identityHashCode(this))).booleanValue();
        }

        @Override // java.net.Socket
        public final java.net.SocketAddress getRemoteSocketAddress() {
            return (java.net.SocketAddress) valueOf(new java.lang.Object[]{this}, 614851568, -614851531, java.lang.System.identityHashCode(this));
        }

        @Override // java.net.Socket
        public final int getPort() {
            return ((java.lang.Integer) valueOf(new java.lang.Object[]{this}, 845557084, -845557080, java.lang.System.identityHashCode(this))).intValue();
        }

        @Override // java.net.Socket
        public final java.io.OutputStream getOutputStream() throws java.io.IOException {
            return (java.io.OutputStream) valueOf(new java.lang.Object[]{this}, -1182963028, 1182963046, java.lang.System.identityHashCode(this));
        }

        @Override // java.net.Socket
        public final boolean getOOBInline() throws java.net.SocketException {
            return ((java.lang.Boolean) valueOf(new java.lang.Object[]{this}, 1324694741, -1324694699, java.lang.System.identityHashCode(this))).booleanValue();
        }

        @Override // java.net.Socket
        public final java.net.SocketAddress getLocalSocketAddress() {
            return (java.net.SocketAddress) valueOf(new java.lang.Object[]{this}, 546425606, -546425573, java.lang.System.identityHashCode(this));
        }

        @Override // java.net.Socket
        public final int getLocalPort() {
            return ((java.lang.Integer) valueOf(new java.lang.Object[]{this}, 1145793326, -1145793315, java.lang.System.identityHashCode(this))).intValue();
        }

        @Override // java.net.Socket
        public final java.net.InetAddress getLocalAddress() {
            return (java.net.InetAddress) valueOf(new java.lang.Object[]{this}, -1080473093, 1080473137, java.lang.System.identityHashCode(this));
        }

        @Override // java.net.Socket
        public final boolean getKeepAlive() throws java.net.SocketException {
            return ((java.lang.Boolean) valueOf(new java.lang.Object[]{this}, -231449269, 231449282, java.lang.System.identityHashCode(this))).booleanValue();
        }

        @Override // java.net.Socket
        public final java.io.InputStream getInputStream() throws java.io.IOException {
            return (java.io.InputStream) valueOf(new java.lang.Object[]{this}, -1712467687, 1712467688, java.lang.System.identityHashCode(this));
        }

        @Override // java.net.Socket
        public final java.net.InetAddress getInetAddress() {
            return (java.net.InetAddress) valueOf(new java.lang.Object[]{this}, -1568412962, 1568412989, java.lang.System.identityHashCode(this));
        }

        @Override // java.net.Socket
        public final java.nio.channels.SocketChannel getChannel() {
            return (java.nio.channels.SocketChannel) valueOf(new java.lang.Object[]{this}, 1960485312, -1960485286, java.lang.System.identityHashCode(this));
        }

        @Override // java.net.Socket
        public final void connect(java.net.SocketAddress socketAddress, int i) throws java.io.IOException {
            valueOf(new java.lang.Object[]{this, socketAddress, java.lang.Integer.valueOf(i)}, -712147287, 712147334, i);
        }

        @Override // java.net.Socket
        public final void connect(java.net.SocketAddress socketAddress) throws java.io.IOException {
            valueOf(new java.lang.Object[]{this, socketAddress}, -1669460287, 1669460296, java.lang.System.identityHashCode(this));
        }

        @Override // java.net.Socket
        public final void bind(java.net.SocketAddress socketAddress) throws java.io.IOException {
            valueOf(new java.lang.Object[]{this, socketAddress}, 1178014464, -1178014430, java.lang.System.identityHashCode(this));
        }

        @Override // javax.net.ssl.SSLSocket
        public final boolean getEnableSessionCreation() {
            return ((java.lang.Boolean) valueOf(new java.lang.Object[]{this}, -682208255, 682208293, java.lang.System.identityHashCode(this))).booleanValue();
        }

        @Override // javax.net.ssl.SSLSocket
        public final void setEnableSessionCreation(boolean z) {
            valueOf(new java.lang.Object[]{this, java.lang.Boolean.valueOf(z)}, -1785490018, 1785490034, java.lang.System.identityHashCode(this));
        }

        @Override // javax.net.ssl.SSLSocket
        public final boolean getWantClientAuth() {
            return ((java.lang.Boolean) valueOf(new java.lang.Object[]{this}, -1765082894, 1765082946, java.lang.System.identityHashCode(this))).booleanValue();
        }

        @Override // javax.net.ssl.SSLSocket
        public final boolean getNeedClientAuth() {
            return ((java.lang.Boolean) valueOf(new java.lang.Object[]{this}, -1243490284, 1243490304, java.lang.System.identityHashCode(this))).booleanValue();
        }

        @Override // javax.net.ssl.SSLSocket
        public final void setWantClientAuth(boolean z) {
            valueOf(new java.lang.Object[]{this, java.lang.Boolean.valueOf(z)}, -1141282121, 1141282138, java.lang.System.identityHashCode(this));
        }

        @Override // javax.net.ssl.SSLSocket
        public final void setNeedClientAuth(boolean z) {
            valueOf(new java.lang.Object[]{this, java.lang.Boolean.valueOf(z)}, 118177219, -118177214, java.lang.System.identityHashCode(this));
        }

        @Override // javax.net.ssl.SSLSocket
        public final boolean getUseClientMode() {
            return ((java.lang.Boolean) valueOf(new java.lang.Object[]{this}, 1531344386, -1531344361, java.lang.System.identityHashCode(this))).booleanValue();
        }

        @Override // javax.net.ssl.SSLSocket
        public final void setUseClientMode(boolean z) {
            valueOf(new java.lang.Object[]{this, java.lang.Boolean.valueOf(z)}, 221352264, -221352215, java.lang.System.identityHashCode(this));
        }

        @Override // javax.net.ssl.SSLSocket
        public final void startHandshake() throws java.io.IOException {
            valueOf(new java.lang.Object[]{this}, 73008864, -73008832, java.lang.System.identityHashCode(this));
        }

        @Override // javax.net.ssl.SSLSocket
        public final void removeHandshakeCompletedListener(javax.net.ssl.HandshakeCompletedListener handshakeCompletedListener) {
            valueOf(new java.lang.Object[]{this, handshakeCompletedListener}, 13795452, -13795429, java.lang.System.identityHashCode(this));
        }

        @Override // javax.net.ssl.SSLSocket
        public final void addHandshakeCompletedListener(javax.net.ssl.HandshakeCompletedListener handshakeCompletedListener) {
            valueOf(new java.lang.Object[]{this, handshakeCompletedListener}, 1435161965, -1435161937, java.lang.System.identityHashCode(this));
        }

        @Override // javax.net.ssl.SSLSocket
        public final javax.net.ssl.SSLSession getSession() {
            return (javax.net.ssl.SSLSession) valueOf(new java.lang.Object[]{this}, -1278953315, 1278953356, java.lang.System.identityHashCode(this));
        }

        @Override // javax.net.ssl.SSLSocket
        public final void setEnabledProtocols(java.lang.String[] strArr) {
            valueOf(new java.lang.Object[]{this, strArr}, 1566419010, -1566418964, java.lang.System.identityHashCode(this));
        }

        @Override // javax.net.ssl.SSLSocket
        public final java.lang.String[] getEnabledProtocols() {
            return (java.lang.String[]) valueOf(new java.lang.Object[]{this}, 13656615, -13656564, java.lang.System.identityHashCode(this));
        }

        @Override // javax.net.ssl.SSLSocket
        public final java.lang.String[] getSupportedProtocols() {
            return (java.lang.String[]) valueOf(new java.lang.Object[]{this}, -556181595, 556181616, java.lang.System.identityHashCode(this));
        }

        @Override // javax.net.ssl.SSLSocket
        public final void setEnabledCipherSuites(java.lang.String[] strArr) {
            valueOf(new java.lang.Object[]{this, strArr}, 2137282007, -2137281992, java.lang.System.identityHashCode(this));
        }

        @Override // javax.net.ssl.SSLSocket
        public final java.lang.String[] getEnabledCipherSuites() {
            return (java.lang.String[]) valueOf(new java.lang.Object[]{this}, -862529315, 862529334, java.lang.System.identityHashCode(this));
        }

        @Override // javax.net.ssl.SSLSocket
        public final java.lang.String[] getSupportedCipherSuites() {
            return (java.lang.String[]) valueOf(new java.lang.Object[]{this}, 330367955, -330367905, java.lang.System.identityHashCode(this));
        }
    }

    @Override // javax.net.SocketFactory
    public final java.net.Socket createSocket(java.net.InetAddress inetAddress, int i, java.net.InetAddress inetAddress2, int i2) throws java.io.IOException {
        return (java.net.Socket) valueOf(new java.lang.Object[]{this, inetAddress, java.lang.Integer.valueOf(i), inetAddress2, java.lang.Integer.valueOf(i2)}, -832137637, 832137642, i);
    }

    @Override // javax.net.SocketFactory
    public final java.net.Socket createSocket(java.net.InetAddress inetAddress, int i) throws java.io.IOException {
        return (java.net.Socket) valueOf(new java.lang.Object[]{this, inetAddress, java.lang.Integer.valueOf(i)}, 669140864, -669140861, i);
    }

    @Override // javax.net.SocketFactory
    public final java.net.Socket createSocket(java.lang.String str, int i, java.net.InetAddress inetAddress, int i2) throws java.io.IOException {
        return (java.net.Socket) valueOf(new java.lang.Object[]{this, str, java.lang.Integer.valueOf(i), inetAddress, java.lang.Integer.valueOf(i2)}, 553600428, -553600421, i);
    }

    @Override // javax.net.SocketFactory
    public final java.net.Socket createSocket(java.lang.String str, int i) throws java.io.IOException {
        return (java.net.Socket) valueOf(new java.lang.Object[]{this, str, java.lang.Integer.valueOf(i)}, -1499842024, 1499842030, i);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final java.net.Socket createSocket(java.net.Socket socket, java.lang.String str, int i, boolean z) throws java.io.IOException {
        return (java.net.Socket) valueOf(new java.lang.Object[]{this, socket, str, java.lang.Integer.valueOf(i), java.lang.Boolean.valueOf(z)}, 1365011895, -1365011895, i);
    }

    private java.net.Socket DigitizedCardProfile(java.net.Socket socket) {
        return (java.net.Socket) valueOf(new java.lang.Object[]{this, socket}, -1159434875, 1159434879, java.lang.System.identityHashCode(this));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final java.lang.String[] getSupportedCipherSuites() {
        return (java.lang.String[]) valueOf(new java.lang.Object[]{this}, 1988374131, -1988374130, java.lang.System.identityHashCode(this));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final java.lang.String[] getDefaultCipherSuites() {
        return (java.lang.String[]) valueOf(new java.lang.Object[]{this}, -355011155, 355011157, java.lang.System.identityHashCode(this));
    }
}
