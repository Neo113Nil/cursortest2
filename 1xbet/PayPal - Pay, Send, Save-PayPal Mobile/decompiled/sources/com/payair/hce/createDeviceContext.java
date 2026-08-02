package com.payair.hce;

/* loaded from: classes4.dex */
public final class createDeviceContext {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static final byte[] DigitizedCardProfile = null;
    private static int valueOf;
    private static final int values = 0;
    private static int writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(byte b, byte b2, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = b2 + 4;
        int i5 = (b * 27) + 7;
        int i6 = (i * 19) + 99;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i5;
            int i8 = i4;
            i3 = 0;
            int i9 = (-i4) + i7;
            i2 = i3;
            int i10 = i8;
            i6 = i9;
            i4 = i10;
            int i11 = i4 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i12 = i6;
            i8 = i11;
            i4 = bArr[i11];
            i7 = i12;
            int i92 = (-i4) + i7;
            i2 = i3;
            int i102 = i8;
            i6 = i92;
            i4 = i102;
            int i112 = i4 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            int i1122 = i4 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(int i, short s, int i2, java.lang.Object[] objArr) {
        int i3;
        byte[] bArr = $$d;
        int i4 = 115 - (i * 3);
        int i5 = s * 4;
        int i6 = 4 - (i2 * 3);
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            i4 = i5;
            int i7 = i6;
            int i8 = 0;
            i4 += i6;
            i6 = i7 + 1;
            i3 = i8;
            bArr2[i3] = (byte) i4;
            if (i3 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i9 = i3 + 1;
            i7 = i6;
            i6 = bArr[i6];
            i8 = i9;
            i4 += i6;
            i6 = i7 + 1;
            i3 = i8;
            bArr2[i3] = (byte) i4;
            if (i3 == i5) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i4;
            if (i3 == i5) {
            }
        }
    }

    public static com.payair.hce.createContextForSplit values(final com.mastercard.upgrade.profile.DigitizedCardProfile digitizedCardProfile) {
        com.payair.hce.createContextForSplit createcontextforsplit = new com.payair.hce.createContextForSplit() { // from class: com.payair.hce.createDeviceContext.5
            private static int DigitizedCardProfile = 1;
            private static int writeReplace;

            public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
                int i4 = ~i2;
                int i5 = ~(i4 | i | i3);
                int i6 = (i * 477) + (i2 * (-475)) + (((~(i2 | (~i))) | i5) * (-476)) + (i5 * 952) + ((~(i | (~i3) | i4)) * 476);
                return i6 != 1 ? i6 != 2 ? i6 != 3 ? values(objArr) : DigitizedCardProfile(objArr) : writeReplace(objArr) : AlternateContactlessPaymentDataJson(objArr);
            }

            private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
                com.payair.hce.createDeviceContext.AnonymousClass5 anonymousClass5 = (com.payair.hce.createDeviceContext.AnonymousClass5) objArr[0];
                int i = writeReplace;
                int i2 = i ^ 33;
                int i3 = (i & 33) << 1;
                int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
                DigitizedCardProfile = i4 % 128;
                com.payair.hce.isUiContext digitizedCardId = com.mastercard.upgrade.profile.DigitizedCardProfile.this.getDigitizedCardId();
                int i5 = i4 % 2;
                java.lang.String str = (java.lang.String) com.payair.hce.isUiContext.DigitizedCardProfile(new java.lang.Object[]{digitizedCardId}, -669572456, 669572456, java.lang.System.identityHashCode(digitizedCardId));
                if (i5 != 0) {
                    return str;
                }
                throw null;
            }

            private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
                com.payair.hce.createDeviceContext.AnonymousClass5 anonymousClass5 = (com.payair.hce.createDeviceContext.AnonymousClass5) objArr[0];
                int i = writeReplace;
                DigitizedCardProfile = ((i ^ 117) + ((i & 117) << 1)) % 128;
                int maximumPinTry = com.mastercard.upgrade.profile.DigitizedCardProfile.this.getMaximumPinTry();
                int i2 = writeReplace;
                int i3 = (i2 ^ 23) + ((i2 & 23) << 1);
                DigitizedCardProfile = i3 % 128;
                if (i3 % 2 != 0) {
                    return java.lang.Integer.valueOf(maximumPinTry);
                }
                throw new java.lang.ArithmeticException();
            }

            private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
                final com.mastercard.upgrade.profile.BusinessLogicModule businessLogicModule = com.mastercard.upgrade.profile.DigitizedCardProfile.this.getBusinessLogicModule();
                com.payair.hce.checkUriPermission checkuripermission = new com.payair.hce.checkUriPermission() { // from class: com.payair.hce.createDeviceContext.8
                    private static int valueOf = 0;
                    private static int writeReplace = 1;

                    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr2, int i, int i2, int i3) {
                        int i4 = ~i;
                        int i5 = ~i3;
                        int i6 = ~(i4 | i2);
                        switch ((i * 398) + (i2 * (-396)) + (((~(i4 | i5)) | i6 | (~(i5 | i2))) * (-397)) + (i6 * (-397)) + (((~(i | (~i2))) | i3 | i6) * 397)) {
                            case 1:
                                return AlternateContactlessPaymentDataJson(objArr2);
                            case 2:
                                return valueOf(objArr2);
                            case 3:
                                com.payair.hce.createDeviceContext.AnonymousClass8 anonymousClass8 = (com.payair.hce.createDeviceContext.AnonymousClass8) objArr2[0];
                                int i7 = valueOf + 109;
                                writeReplace = i7 % 128;
                                if (i7 % 2 != 0) {
                                    return new java.lang.String[]{com.mastercard.upgrade.profile.BusinessLogicModule.this.getCardholderValidators().getCardholderValidators()};
                                }
                                java.lang.String[] strArr = new java.lang.String[0];
                                strArr[0] = com.mastercard.upgrade.profile.BusinessLogicModule.this.getCardholderValidators().getCardholderValidators();
                                return strArr;
                            case 4:
                                return writeReplace(objArr2);
                            case 5:
                                return values(objArr2);
                            case 6:
                                com.payair.hce.enforceCallingUriPermission enforcecallinguripermission = new com.payair.hce.enforceCallingUriPermission() { // from class: com.payair.hce.createDeviceContext.8.3
                                    private static int values = 1;
                                    private static int writeReplace;

                                    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr3, int i8, int i9, int i10) {
                                        int i11 = ~i9;
                                        int i12 = ~i10;
                                        switch ((i8 * 677) + (i9 * (-675)) + ((i8 | i10 | i11) * (-676)) + (((~(i11 | i8)) | (~(i12 | i8))) * 676) + (((~((~i8) | i11)) | (~(i11 | i12)) | (~(i9 | i8 | i10))) * 676)) {
                                            case 1:
                                                return writeReplace(objArr3);
                                            case 2:
                                                return DigitizedCardProfile(objArr3);
                                            case 3:
                                                return values(objArr3);
                                            case 4:
                                                com.payair.hce.createDeviceContext.AnonymousClass8.AnonymousClass3 anonymousClass3 = (com.payair.hce.createDeviceContext.AnonymousClass8.AnonymousClass3) objArr3[0];
                                                int i13 = values;
                                                writeReplace = (((i13 | 1) << 1) - (i13 ^ 1)) % 128;
                                                boolean pinAutomaticallyResetByApplication = com.mastercard.upgrade.profile.BusinessLogicModule.this.getMagstripeCvmIssuerOptions().getPinAutomaticallyResetByApplication();
                                                int i14 = values;
                                                writeReplace = (((i14 & 88) + (i14 | 88)) - 1) % 128;
                                                return java.lang.Boolean.valueOf(pinAutomaticallyResetByApplication);
                                            case 5:
                                                com.payair.hce.createDeviceContext.AnonymousClass8.AnonymousClass3 anonymousClass32 = (com.payair.hce.createDeviceContext.AnonymousClass8.AnonymousClass3) objArr3[0];
                                                int i15 = values;
                                                int i16 = i15 | 7;
                                                int i17 = i16 << 1;
                                                int i18 = -((~(i15 & 7)) & i16);
                                                writeReplace = (((i17 | i18) << 1) - (i18 ^ i17)) % 128;
                                                boolean pinAlwaysRequiredIfCurrencyProvided = com.mastercard.upgrade.profile.BusinessLogicModule.this.getMagstripeCvmIssuerOptions().getPinAlwaysRequiredIfCurrencyProvided();
                                                values = (writeReplace + 15) % 128;
                                                return java.lang.Boolean.valueOf(pinAlwaysRequiredIfCurrencyProvided);
                                            case 6:
                                                return AlternateContactlessPaymentDataJson(objArr3);
                                            case 7:
                                                return IccPrivateKeyCrtComponentsJson(objArr3);
                                            default:
                                                return valueOf(objArr3);
                                        }
                                    }

                                    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr3) {
                                        com.payair.hce.createDeviceContext.AnonymousClass8.AnonymousClass3 anonymousClass3 = (com.payair.hce.createDeviceContext.AnonymousClass8.AnonymousClass3) objArr3[0];
                                        int i8 = values;
                                        int i9 = (i8 ^ 19) + ((i8 & 19) << 1);
                                        writeReplace = i9 % 128;
                                        com.mastercard.upgrade.profile.CvmIssuerOptions magstripeCvmIssuerOptions = com.mastercard.upgrade.profile.BusinessLogicModule.this.getMagstripeCvmIssuerOptions();
                                        if (i9 % 2 == 0) {
                                            return java.lang.Boolean.valueOf(magstripeCvmIssuerOptions.getAckAlwaysRequiredIfCurrencyProvided());
                                        }
                                        magstripeCvmIssuerOptions.getAckAlwaysRequiredIfCurrencyProvided();
                                        throw new java.lang.ArithmeticException();
                                    }

                                    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr3) {
                                        com.payair.hce.createDeviceContext.AnonymousClass8.AnonymousClass3 anonymousClass3 = (com.payair.hce.createDeviceContext.AnonymousClass8.AnonymousClass3) objArr3[0];
                                        int i8 = writeReplace;
                                        int i9 = (i8 ^ 8) + ((i8 & 8) << 1);
                                        int i10 = (~i9) + (i9 << 1);
                                        values = i10 % 128;
                                        com.mastercard.upgrade.profile.CvmIssuerOptions magstripeCvmIssuerOptions = com.mastercard.upgrade.profile.BusinessLogicModule.this.getMagstripeCvmIssuerOptions();
                                        if (i10 % 2 != 0) {
                                            boolean ackAlwaysRequiredIfCurrencyNotProvided = magstripeCvmIssuerOptions.getAckAlwaysRequiredIfCurrencyNotProvided();
                                            values = (writeReplace + 55) % 128;
                                            return java.lang.Boolean.valueOf(ackAlwaysRequiredIfCurrencyNotProvided);
                                        }
                                        magstripeCvmIssuerOptions.getAckAlwaysRequiredIfCurrencyNotProvided();
                                        throw null;
                                    }

                                    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr3) {
                                        com.payair.hce.createDeviceContext.AnonymousClass8.AnonymousClass3 anonymousClass3 = (com.payair.hce.createDeviceContext.AnonymousClass8.AnonymousClass3) objArr3[0];
                                        int i8 = values;
                                        writeReplace = ((i8 & 31) + (i8 | 31)) % 128;
                                        boolean ackAutomaticallyResetByApplication = com.mastercard.upgrade.profile.BusinessLogicModule.this.getMagstripeCvmIssuerOptions().getAckAutomaticallyResetByApplication();
                                        int i9 = writeReplace;
                                        int i10 = i9 & 95;
                                        int i11 = (i9 | 95) & (~i10);
                                        int i12 = -(-(i10 << 1));
                                        int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
                                        values = i13 % 128;
                                        if (i13 % 2 != 0) {
                                            return java.lang.Boolean.valueOf(ackAutomaticallyResetByApplication);
                                        }
                                        throw new java.lang.ArithmeticException();
                                    }

                                    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr3) {
                                        com.payair.hce.createDeviceContext.AnonymousClass8.AnonymousClass3 anonymousClass3 = (com.payair.hce.createDeviceContext.AnonymousClass8.AnonymousClass3) objArr3[0];
                                        int i8 = writeReplace;
                                        int i9 = i8 & 91;
                                        int i10 = (((i8 | 91) & (~i9)) - (~(-(-(i9 << 1))))) - 1;
                                        values = i10 % 128;
                                        com.mastercard.upgrade.profile.CvmIssuerOptions magstripeCvmIssuerOptions = com.mastercard.upgrade.profile.BusinessLogicModule.this.getMagstripeCvmIssuerOptions();
                                        if (i10 % 2 != 0) {
                                            boolean ackPreEntryAllowed = magstripeCvmIssuerOptions.getAckPreEntryAllowed();
                                            int i11 = writeReplace;
                                            int i12 = (i11 & (-114)) | ((~i11) & 113);
                                            int i13 = -(-((i11 & 113) << 1));
                                            values = (((i12 | i13) << 1) - (i13 ^ i12)) % 128;
                                            return java.lang.Boolean.valueOf(ackPreEntryAllowed);
                                        }
                                        magstripeCvmIssuerOptions.getAckPreEntryAllowed();
                                        throw new java.lang.ArithmeticException();
                                    }

                                    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr3) {
                                        com.payair.hce.createDeviceContext.AnonymousClass8.AnonymousClass3 anonymousClass3 = (com.payair.hce.createDeviceContext.AnonymousClass8.AnonymousClass3) objArr3[0];
                                        int i8 = writeReplace;
                                        int i9 = i8 & 35;
                                        int i10 = -(-(i8 | 35));
                                        int i11 = (i9 & i10) + (i10 | i9);
                                        values = i11 % 128;
                                        com.mastercard.upgrade.profile.CvmIssuerOptions magstripeCvmIssuerOptions = com.mastercard.upgrade.profile.BusinessLogicModule.this.getMagstripeCvmIssuerOptions();
                                        if (i11 % 2 != 0) {
                                            boolean pinAlwaysRequiredIfCurrencyNotProvided = magstripeCvmIssuerOptions.getPinAlwaysRequiredIfCurrencyNotProvided();
                                            int i12 = values + 77;
                                            writeReplace = i12 % 128;
                                            if (i12 % 2 == 0) {
                                                return java.lang.Boolean.valueOf(pinAlwaysRequiredIfCurrencyNotProvided);
                                            }
                                            throw null;
                                        }
                                        magstripeCvmIssuerOptions.getPinAlwaysRequiredIfCurrencyNotProvided();
                                        throw new java.lang.ArithmeticException();
                                    }

                                    private static /* synthetic */ java.lang.Object IccPrivateKeyCrtComponentsJson(java.lang.Object[] objArr3) {
                                        com.payair.hce.createDeviceContext.AnonymousClass8.AnonymousClass3 anonymousClass3 = (com.payair.hce.createDeviceContext.AnonymousClass8.AnonymousClass3) objArr3[0];
                                        values = (writeReplace + 49) % 128;
                                        boolean pinPreEntryAllowed = com.mastercard.upgrade.profile.BusinessLogicModule.this.getMagstripeCvmIssuerOptions().getPinPreEntryAllowed();
                                        int i8 = writeReplace;
                                        int i9 = ((((i8 ^ 9) | (i8 & 9)) << 1) - (~(-((i8 & (-10)) | ((~i8) & 9))))) - 1;
                                        values = i9 % 128;
                                        if (i9 % 2 != 0) {
                                            return java.lang.Boolean.valueOf(pinPreEntryAllowed);
                                        }
                                        throw null;
                                    }

                                    @Override // com.payair.hce.enforceCallingUriPermission
                                    public final boolean getPinPreEntryAllowed() {
                                        return ((java.lang.Boolean) values(new java.lang.Object[]{this}, 892833078, -892833071, java.lang.System.identityHashCode(this))).booleanValue();
                                    }

                                    @Override // com.payair.hce.enforceCallingUriPermission
                                    public final boolean getPinAutomaticallyResetByApplication() {
                                        return ((java.lang.Boolean) values(new java.lang.Object[]{this}, -1345431138, 1345431142, java.lang.System.identityHashCode(this))).booleanValue();
                                    }

                                    @Override // com.payair.hce.enforceCallingUriPermission
                                    public final boolean getPinAlwaysRequiredIfCurrencyProvided() {
                                        return ((java.lang.Boolean) values(new java.lang.Object[]{this}, -1190964199, 1190964204, java.lang.System.identityHashCode(this))).booleanValue();
                                    }

                                    @Override // com.payair.hce.enforceCallingUriPermission
                                    public final boolean getPinAlwaysRequiredIfCurrencyNotProvided() {
                                        return ((java.lang.Boolean) values(new java.lang.Object[]{this}, 261409673, -261409667, java.lang.System.identityHashCode(this))).booleanValue();
                                    }

                                    @Override // com.payair.hce.enforceCallingUriPermission
                                    public final boolean getAckPreEntryAllowed() {
                                        return ((java.lang.Boolean) values(new java.lang.Object[]{this}, -1862955107, 1862955107, java.lang.System.identityHashCode(this))).booleanValue();
                                    }

                                    @Override // com.payair.hce.enforceCallingUriPermission
                                    public final boolean getAckAutomaticallyResetByApplication() {
                                        return ((java.lang.Boolean) values(new java.lang.Object[]{this}, -538859814, 538859816, java.lang.System.identityHashCode(this))).booleanValue();
                                    }

                                    @Override // com.payair.hce.enforceCallingUriPermission
                                    public final boolean getAckAlwaysRequiredIfCurrencyNotProvided() {
                                        return ((java.lang.Boolean) values(new java.lang.Object[]{this}, 1146465487, -1146465484, java.lang.System.identityHashCode(this))).booleanValue();
                                    }

                                    @Override // com.payair.hce.enforceCallingUriPermission
                                    public final boolean getAckAlwaysRequiredIfCurrencyProvided() {
                                        return ((java.lang.Boolean) values(new java.lang.Object[]{this}, -1753823140, 1753823141, java.lang.System.identityHashCode(this))).booleanValue();
                                    }
                                };
                                writeReplace = (valueOf + 61) % 128;
                                return enforcecallinguripermission;
                            case 7:
                                com.payair.hce.createDeviceContext.AnonymousClass8 anonymousClass82 = (com.payair.hce.createDeviceContext.AnonymousClass8) objArr2[0];
                                int i8 = valueOf;
                                writeReplace = (((i8 ^ 54) + ((i8 & 54) << 1)) - 1) % 128;
                                com.payair.hce.isUiContext cardLayoutDescription = com.mastercard.upgrade.profile.BusinessLogicModule.this.getCardLayoutDescription();
                                byte[] bArr = (byte[]) com.payair.hce.isUiContext.DigitizedCardProfile(new java.lang.Object[]{cardLayoutDescription}, 942400464, -942400461, java.lang.System.identityHashCode(cardLayoutDescription));
                                int i9 = writeReplace;
                                valueOf = (((i9 & 54) + (i9 | 54)) - 1) % 128;
                                return bArr;
                            default:
                                return DigitizedCardProfile(objArr2);
                        }
                    }

                    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr2) {
                        com.payair.hce.createDeviceContext.AnonymousClass8 anonymousClass8 = (com.payair.hce.createDeviceContext.AnonymousClass8) objArr2[0];
                        int i = writeReplace;
                        int i2 = i ^ 53;
                        int i3 = -(-((i & 53) << 1));
                        int i4 = (i2 & i3) + (i3 | i2);
                        valueOf = i4 % 128;
                        com.mastercard.upgrade.profile.BusinessLogicModule businessLogicModule2 = com.mastercard.upgrade.profile.BusinessLogicModule.this;
                        if (i4 % 2 != 0) {
                            businessLogicModule2.getCvmResetTimeout();
                            throw null;
                        }
                        int cvmResetTimeout = businessLogicModule2.getCvmResetTimeout();
                        int i5 = valueOf;
                        int i6 = (i5 ^ 105) + ((i5 & 105) << 1);
                        writeReplace = i6 % 128;
                        if (i6 % 2 != 0) {
                            return java.lang.Integer.valueOf(cvmResetTimeout);
                        }
                        throw new java.lang.ArithmeticException();
                    }

                    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr2) {
                        com.payair.hce.createDeviceContext.AnonymousClass8 anonymousClass8 = (com.payair.hce.createDeviceContext.AnonymousClass8) objArr2[0];
                        int i = writeReplace;
                        int i2 = (i | 59) << 1;
                        int i3 = -(i ^ 59);
                        int i4 = (i2 & i3) + (i3 | i2);
                        valueOf = i4 % 128;
                        com.mastercard.upgrade.profile.BusinessLogicModule businessLogicModule2 = com.mastercard.upgrade.profile.BusinessLogicModule.this;
                        if (i4 % 2 == 0) {
                            return java.lang.Integer.valueOf(businessLogicModule2.getDualTapResetTimeout());
                        }
                        businessLogicModule2.getDualTapResetTimeout();
                        throw null;
                    }

                    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr2) {
                        com.payair.hce.createDeviceContext.AnonymousClass8 anonymousClass8 = (com.payair.hce.createDeviceContext.AnonymousClass8) objArr2[0];
                        int i = valueOf;
                        writeReplace = (((i ^ 16) + ((i & 16) << 1)) - 1) % 128;
                        com.payair.hce.isUiContext applicationLifeCycleData = com.mastercard.upgrade.profile.BusinessLogicModule.this.getApplicationLifeCycleData();
                        if (applicationLifeCycleData != null) {
                            int i2 = writeReplace;
                            int i3 = ((i2 ^ 14) + ((i2 & 14) << 1)) - 1;
                            valueOf = i3 % 128;
                            if (i3 % 2 == 0) {
                                return ((java.lang.String) com.payair.hce.isUiContext.DigitizedCardProfile(new java.lang.Object[]{applicationLifeCycleData}, -669572456, 669572456, java.lang.System.identityHashCode(applicationLifeCycleData))).getBytes();
                            }
                            throw null;
                        }
                        int i4 = valueOf;
                        int i5 = i4 & 45;
                        int i6 = (i4 | 45) & (~i5);
                        int i7 = i5 << 1;
                        int i8 = (i6 & i7) + (i6 | i7);
                        writeReplace = i8 % 128;
                        if (i8 % 2 != 0) {
                            return null;
                        }
                        throw null;
                    }

                    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr2) {
                        com.payair.hce.createDeviceContext.AnonymousClass8 anonymousClass8 = (com.payair.hce.createDeviceContext.AnonymousClass8) objArr2[0];
                        int i = writeReplace;
                        int i2 = (i & 29) + (i | 29);
                        valueOf = i2 % 128;
                        com.payair.hce.isUiContext securityWord = com.mastercard.upgrade.profile.BusinessLogicModule.this.getSecurityWord();
                        if (i2 % 2 == 0) {
                            return (byte[]) com.payair.hce.isUiContext.DigitizedCardProfile(new java.lang.Object[]{securityWord}, 942400464, -942400461, java.lang.System.identityHashCode(securityWord));
                        }
                        throw null;
                    }

                    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr2) {
                        com.payair.hce.createPackageContext createpackagecontext = new com.payair.hce.createPackageContext() { // from class: com.payair.hce.createDeviceContext.8.1
                            private static int AlternateContactlessPaymentDataJson = 0;
                            private static int DigitizedCardProfile = 1;

                            public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr3, int i, int i2, int i3) {
                                int i4 = ~i;
                                int i5 = ~i2;
                                switch ((i * (-947)) + (i2 * 949) + (((~(i5 | i3)) | i4) * (-948)) + ((~((~i3) | i4 | i5)) * (-948)) + ((i | i5) * 948)) {
                                    case 1:
                                        return writeReplace(objArr3);
                                    case 2:
                                        com.payair.hce.createDeviceContext.AnonymousClass8.AnonymousClass1 anonymousClass1 = (com.payair.hce.createDeviceContext.AnonymousClass8.AnonymousClass1) objArr3[0];
                                        int i6 = DigitizedCardProfile ^ 21;
                                        AlternateContactlessPaymentDataJson = (((((r4 & 21) | i6) << 1) - (~(-i6))) - 1) % 128;
                                        boolean pinPreEntryAllowed = com.mastercard.upgrade.profile.BusinessLogicModule.this.getMChipCvmIssuerOptions().getPinPreEntryAllowed();
                                        int i7 = AlternateContactlessPaymentDataJson;
                                        int i8 = (i7 ^ 98) + ((i7 & 98) << 1);
                                        DigitizedCardProfile = ((~i8) + (i8 << 1)) % 128;
                                        return java.lang.Boolean.valueOf(pinPreEntryAllowed);
                                    case 3:
                                        return values(objArr3);
                                    case 4:
                                        com.payair.hce.createDeviceContext.AnonymousClass8.AnonymousClass1 anonymousClass12 = (com.payair.hce.createDeviceContext.AnonymousClass8.AnonymousClass1) objArr3[0];
                                        int i9 = AlternateContactlessPaymentDataJson;
                                        int i10 = i9 & 115;
                                        int i11 = -(-(i9 | 115));
                                        DigitizedCardProfile = (((i10 | i11) << 1) - (i11 ^ i10)) % 128;
                                        boolean ackAlwaysRequiredIfCurrencyProvided = com.mastercard.upgrade.profile.BusinessLogicModule.this.getMChipCvmIssuerOptions().getAckAlwaysRequiredIfCurrencyProvided();
                                        int i12 = DigitizedCardProfile;
                                        int i13 = i12 & 5;
                                        AlternateContactlessPaymentDataJson = (((i12 | 5) & (~i13)) + (i13 << 1)) % 128;
                                        return java.lang.Boolean.valueOf(ackAlwaysRequiredIfCurrencyProvided);
                                    case 5:
                                        return AlternateContactlessPaymentDataJson(objArr3);
                                    case 6:
                                        com.payair.hce.createDeviceContext.AnonymousClass8.AnonymousClass1 anonymousClass13 = (com.payair.hce.createDeviceContext.AnonymousClass8.AnonymousClass1) objArr3[0];
                                        int i14 = DigitizedCardProfile;
                                        int i15 = i14 ^ 63;
                                        int i16 = ((i14 & 63) | i15) << 1;
                                        int i17 = -i15;
                                        AlternateContactlessPaymentDataJson = (((i16 | i17) << 1) - (i16 ^ i17)) % 128;
                                        boolean pinAlwaysRequiredIfCurrencyProvided = com.mastercard.upgrade.profile.BusinessLogicModule.this.getMChipCvmIssuerOptions().getPinAlwaysRequiredIfCurrencyProvided();
                                        int i18 = AlternateContactlessPaymentDataJson;
                                        DigitizedCardProfile = (((i18 & 62) + (i18 | 62)) - 1) % 128;
                                        return java.lang.Boolean.valueOf(pinAlwaysRequiredIfCurrencyProvided);
                                    case 7:
                                        return DigitizedCardProfile(objArr3);
                                    default:
                                        com.payair.hce.createDeviceContext.AnonymousClass8.AnonymousClass1 anonymousClass14 = (com.payair.hce.createDeviceContext.AnonymousClass8.AnonymousClass1) objArr3[0];
                                        int i19 = AlternateContactlessPaymentDataJson;
                                        int i20 = i19 ^ 93;
                                        int i21 = ((i19 & 93) | i20) << 1;
                                        int i22 = -i20;
                                        DigitizedCardProfile = ((i21 & i22) + (i21 | i22)) % 128;
                                        boolean pinAutomaticallyResetByApplication = com.mastercard.upgrade.profile.BusinessLogicModule.this.getMChipCvmIssuerOptions().getPinAutomaticallyResetByApplication();
                                        int i23 = DigitizedCardProfile;
                                        int i24 = i23 & 7;
                                        int i25 = -(-((i23 ^ 7) | i24));
                                        AlternateContactlessPaymentDataJson = (((i24 | i25) << 1) - (i25 ^ i24)) % 128;
                                        return java.lang.Boolean.valueOf(pinAutomaticallyResetByApplication);
                                }
                            }

                            private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr3) {
                                com.payair.hce.createDeviceContext.AnonymousClass8.AnonymousClass1 anonymousClass1 = (com.payair.hce.createDeviceContext.AnonymousClass8.AnonymousClass1) objArr3[0];
                                int i = AlternateContactlessPaymentDataJson + 105;
                                DigitizedCardProfile = i % 128;
                                com.mastercard.upgrade.profile.CvmIssuerOptions mChipCvmIssuerOptions = com.mastercard.upgrade.profile.BusinessLogicModule.this.getMChipCvmIssuerOptions();
                                if (i % 2 != 0) {
                                    return java.lang.Boolean.valueOf(mChipCvmIssuerOptions.getPinAlwaysRequiredIfCurrencyNotProvided());
                                }
                                mChipCvmIssuerOptions.getPinAlwaysRequiredIfCurrencyNotProvided();
                                throw null;
                            }

                            private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr3) {
                                com.payair.hce.createDeviceContext.AnonymousClass8.AnonymousClass1 anonymousClass1 = (com.payair.hce.createDeviceContext.AnonymousClass8.AnonymousClass1) objArr3[0];
                                int i = AlternateContactlessPaymentDataJson;
                                int i2 = i & 19;
                                int i3 = i2 + ((i ^ 19) | i2);
                                DigitizedCardProfile = i3 % 128;
                                com.mastercard.upgrade.profile.CvmIssuerOptions mChipCvmIssuerOptions = com.mastercard.upgrade.profile.BusinessLogicModule.this.getMChipCvmIssuerOptions();
                                if (i3 % 2 != 0) {
                                    return java.lang.Boolean.valueOf(mChipCvmIssuerOptions.getAckAlwaysRequiredIfCurrencyNotProvided());
                                }
                                mChipCvmIssuerOptions.getAckAlwaysRequiredIfCurrencyNotProvided();
                                throw null;
                            }

                            private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr3) {
                                com.payair.hce.createDeviceContext.AnonymousClass8.AnonymousClass1 anonymousClass1 = (com.payair.hce.createDeviceContext.AnonymousClass8.AnonymousClass1) objArr3[0];
                                int i = DigitizedCardProfile;
                                int i2 = (i & (-72)) | ((~i) & 71);
                                int i3 = (i & 71) << 1;
                                int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
                                AlternateContactlessPaymentDataJson = i4 % 128;
                                com.mastercard.upgrade.profile.CvmIssuerOptions mChipCvmIssuerOptions = com.mastercard.upgrade.profile.BusinessLogicModule.this.getMChipCvmIssuerOptions();
                                if (i4 % 2 == 0) {
                                    return java.lang.Boolean.valueOf(mChipCvmIssuerOptions.getAckPreEntryAllowed());
                                }
                                mChipCvmIssuerOptions.getAckPreEntryAllowed();
                                throw null;
                            }

                            private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr3) {
                                com.payair.hce.createDeviceContext.AnonymousClass8.AnonymousClass1 anonymousClass1 = (com.payair.hce.createDeviceContext.AnonymousClass8.AnonymousClass1) objArr3[0];
                                int i = DigitizedCardProfile & 83;
                                AlternateContactlessPaymentDataJson = ((((r0 | 83) & (~i)) - (~(i << 1))) - 1) % 128;
                                boolean ackAutomaticallyResetByApplication = com.mastercard.upgrade.profile.BusinessLogicModule.this.getMChipCvmIssuerOptions().getAckAutomaticallyResetByApplication();
                                int i2 = AlternateContactlessPaymentDataJson;
                                int i3 = i2 ^ 93;
                                int i4 = -(-((i2 & 93) << 1));
                                int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
                                DigitizedCardProfile = i5 % 128;
                                if (i5 % 2 != 0) {
                                    return java.lang.Boolean.valueOf(ackAutomaticallyResetByApplication);
                                }
                                throw new java.lang.ArithmeticException();
                            }

                            @Override // com.payair.hce.createPackageContext
                            public final boolean getPinAlwaysRequiredIfCurrencyProvided() {
                                return ((java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -796091395, 796091401, java.lang.System.identityHashCode(this))).booleanValue();
                            }

                            @Override // com.payair.hce.createPackageContext
                            public final boolean getPinAutomaticallyResetByApplication() {
                                return ((java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 9678179, -9678179, java.lang.System.identityHashCode(this))).booleanValue();
                            }

                            @Override // com.payair.hce.createPackageContext
                            public final boolean getAckAutomaticallyResetByApplication() {
                                return ((java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1931156643, -1931156640, java.lang.System.identityHashCode(this))).booleanValue();
                            }

                            @Override // com.payair.hce.createPackageContext
                            public final boolean getAckPreEntryAllowed() {
                                return ((java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -968257360, 968257365, java.lang.System.identityHashCode(this))).booleanValue();
                            }

                            @Override // com.payair.hce.createPackageContext
                            public final boolean getAckAlwaysRequiredIfCurrencyNotProvided() {
                                return ((java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 426206105, -426206104, java.lang.System.identityHashCode(this))).booleanValue();
                            }

                            @Override // com.payair.hce.createPackageContext
                            public final boolean getPinAlwaysRequiredIfCurrencyNotProvided() {
                                return ((java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -642220568, 642220575, java.lang.System.identityHashCode(this))).booleanValue();
                            }

                            @Override // com.payair.hce.createPackageContext
                            public final boolean getPinPreEntryAllowed() {
                                return ((java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -908521847, 908521849, java.lang.System.identityHashCode(this))).booleanValue();
                            }

                            @Override // com.payair.hce.createPackageContext
                            public final boolean getAckAlwaysRequiredIfCurrencyProvided() {
                                return ((java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -25306735, 25306739, java.lang.System.identityHashCode(this))).booleanValue();
                            }
                        };
                        int i = valueOf;
                        int i2 = (((i | 8) << 1) - (i ^ 8)) - 1;
                        writeReplace = i2 % 128;
                        if (i2 % 2 != 0) {
                            return createpackagecontext;
                        }
                        throw null;
                    }

                    @Override // com.payair.hce.checkUriPermission
                    public final com.payair.hce.enforceCallingUriPermission getMagstripeCvmIssuerOptions() {
                        return (com.payair.hce.enforceCallingUriPermission) writeReplace(new java.lang.Object[]{this}, -688561499, 688561505, java.lang.System.identityHashCode(this));
                    }

                    @Override // com.payair.hce.checkUriPermission
                    public final com.payair.hce.createPackageContext getMchipCvmIssuerOptions() {
                        return (com.payair.hce.createPackageContext) writeReplace(new java.lang.Object[]{this}, -1765480367, 1765480368, java.lang.System.identityHashCode(this));
                    }

                    @Override // com.payair.hce.checkUriPermission
                    public final java.lang.String[] getCardholderValidators() {
                        return (java.lang.String[]) writeReplace(new java.lang.Object[]{this}, 2119531269, -2119531266, java.lang.System.identityHashCode(this));
                    }

                    @Override // com.payair.hce.checkUriPermission
                    public final byte[] getSecurityWord() {
                        return (byte[]) writeReplace(new java.lang.Object[]{this}, 422569068, -422569064, java.lang.System.identityHashCode(this));
                    }

                    @Override // com.payair.hce.checkUriPermission
                    public final byte[] getCardLayoutDescription() {
                        return (byte[]) writeReplace(new java.lang.Object[]{this}, 1168655888, -1168655881, java.lang.System.identityHashCode(this));
                    }

                    @Override // com.payair.hce.checkUriPermission
                    public final byte[] getApplicationLifeCycleData() {
                        return (byte[]) writeReplace(new java.lang.Object[]{this}, -1580777220, 1580777222, java.lang.System.identityHashCode(this));
                    }

                    @Override // com.payair.hce.checkUriPermission
                    public final int getDualTapResetTimeout() {
                        return ((java.lang.Integer) writeReplace(new java.lang.Object[]{this}, -1809012102, 1809012102, java.lang.System.identityHashCode(this))).intValue();
                    }

                    @Override // com.payair.hce.checkUriPermission
                    public final int getCvmResetTimeout() {
                        return ((java.lang.Integer) writeReplace(new java.lang.Object[]{this}, 772277070, -772277065, java.lang.System.identityHashCode(this))).intValue();
                    }
                };
                int i = writeReplace;
                int i2 = i & 103;
                int i3 = i2 + ((i ^ 103) | i2);
                DigitizedCardProfile = i3 % 128;
                if (i3 % 2 != 0) {
                    return checkuripermission;
                }
                throw null;
            }

            private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
                final com.mastercard.upgrade.profile.MppLiteModule mppLiteModule = com.mastercard.upgrade.profile.DigitizedCardProfile.this.getMppLiteModule();
                com.payair.hce.enforceUriPermission enforceuripermission = new com.payair.hce.enforceUriPermission() { // from class: com.payair.hce.createDeviceContext.1
                    private static int AlternateContactlessPaymentDataJson = 1;
                    private static int writeReplace;

                    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr2, int i, int i2, int i3) {
                        int i4 = ~i;
                        int i5 = ~i2;
                        int i6 = i4 | i5;
                        int i7 = ~i3;
                        int i8 = (i * (-167)) + (i2 * (-167)) + (((~i6) | (~(i5 | i7))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + ((~(i6 | i3)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + (((~(i | i5 | i3)) | (~(i2 | i4)) | (~(i4 | i7))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE);
                        if (i8 == 1) {
                            return values(objArr2);
                        }
                        if (i8 == 2) {
                            final com.mastercard.upgrade.profile.ContactlessPaymentData contactlessPaymentData = com.mastercard.upgrade.profile.MppLiteModule.this.getContactlessPaymentData();
                            com.payair.hce.checkCallingUriPermission checkcallinguripermission = new com.payair.hce.checkCallingUriPermission() { // from class: com.payair.hce.createDeviceContext.3
                                private static int valueOf = 0;
                                private static int values = 1;

                                public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr3, int i9, int i10, int i11) {
                                    int i12 = ~i10;
                                    int i13 = ~i11;
                                    int i14 = (i9 * 319) + (i10 * (-317)) + (((~((~i9) | i11)) | i12) * (-318)) + (((~(i12 | i11)) | (~(i13 | i9 | i10))) * 318);
                                    int i15 = ~(i10 | i9 | i11);
                                    int i16 = 0;
                                    switch (i14 + (((~(i9 | i12 | i13)) | i15) * 318)) {
                                        case 1:
                                            return AlternateContactlessPaymentDataJson(objArr3);
                                        case 2:
                                            return valueOf(objArr3);
                                        case 3:
                                            return DigitizedCardProfile(objArr3);
                                        case 4:
                                            com.payair.hce.createDeviceContext.AnonymousClass3 anonymousClass3 = (com.payair.hce.createDeviceContext.AnonymousClass3) objArr3[0];
                                            int i17 = valueOf;
                                            int i18 = i17 ^ 41;
                                            int i19 = (i17 & 41) << 1;
                                            values = (((i18 | i19) << 1) - (i19 ^ i18)) % 128;
                                            com.payair.hce.isUiContext ppseFci = com.mastercard.upgrade.profile.ContactlessPaymentData.this.getPpseFci();
                                            byte[] bArr = (byte[]) com.payair.hce.isUiContext.DigitizedCardProfile(new java.lang.Object[]{ppseFci}, 942400464, -942400461, java.lang.System.identityHashCode(ppseFci));
                                            int i20 = valueOf;
                                            int i21 = i20 & 69;
                                            int i22 = (i20 | 69) & (~i21);
                                            int i23 = i21 << 1;
                                            values = (((i22 | i23) << 1) - (i22 ^ i23)) % 128;
                                            return bArr;
                                        case 5:
                                            return values(objArr3);
                                        case 6:
                                            return writeReplace(objArr3);
                                        case 7:
                                            return RecordsJson(objArr3);
                                        case 8:
                                            return getAid(objArr3);
                                        case 9:
                                            com.payair.hce.createDeviceContext.AnonymousClass3 anonymousClass32 = (com.payair.hce.createDeviceContext.AnonymousClass3) objArr3[0];
                                            int i24 = valueOf;
                                            int i25 = (i24 & 57) + (i24 | 57);
                                            values = i25 % 128;
                                            com.mastercard.upgrade.profile.Record[] records = com.mastercard.upgrade.profile.ContactlessPaymentData.this.getRecords();
                                            int i26 = i25 % 2;
                                            com.payair.hce.checkCallingOrSelfUriPermissions[] checkcallingorselfuripermissionsArr = new com.payair.hce.checkCallingOrSelfUriPermissions[records.length];
                                            int length = records.length;
                                            int i27 = values;
                                            valueOf = ((((i27 | 106) << 1) - (i27 ^ 106)) - 1) % 128;
                                            int i28 = 0;
                                            while (i16 < length) {
                                                final com.mastercard.upgrade.profile.Record record = records[i16];
                                                checkcallingorselfuripermissionsArr[i28] = new com.payair.hce.checkCallingOrSelfUriPermissions() { // from class: com.payair.hce.createDeviceContext.9
                                                    private static int valueOf = 1;
                                                    private static int writeReplace;

                                                    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr4, int i29, int i30, int i31) {
                                                        int i32 = ~i30;
                                                        int i33 = i29 | i31;
                                                        int i34 = (i29 * (-1335)) + (i30 * (-667)) + (((~i33) | i32) * (-668)) + ((i29 | (~(i31 | i32))) * 1336) + ((i33 | i32) * 668);
                                                        if (i34 != 1) {
                                                            return i34 != 2 ? values(objArr4) : DigitizedCardProfile(objArr4);
                                                        }
                                                        com.payair.hce.createDeviceContext.AnonymousClass9 anonymousClass9 = (com.payair.hce.createDeviceContext.AnonymousClass9) objArr4[0];
                                                        int i35 = writeReplace;
                                                        valueOf = (((i35 ^ 47) - (~((i35 & 47) << 1))) - 1) % 128;
                                                        byte sfi = com.mastercard.upgrade.profile.Record.this.getSfi();
                                                        int i36 = valueOf;
                                                        writeReplace = (((i36 ^ 13) - (~(-(-((i36 & 13) << 1))))) - 1) % 128;
                                                        return java.lang.Byte.valueOf(sfi);
                                                    }

                                                    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr4) {
                                                        com.payair.hce.createDeviceContext.AnonymousClass9 anonymousClass9 = (com.payair.hce.createDeviceContext.AnonymousClass9) objArr4[0];
                                                        int i29 = valueOf;
                                                        int i30 = (-2) - (~((i29 ^ 4) + ((i29 & 4) << 1)));
                                                        writeReplace = i30 % 128;
                                                        com.mastercard.upgrade.profile.Record record2 = com.mastercard.upgrade.profile.Record.this;
                                                        if (i30 % 2 == 0) {
                                                            return java.lang.Byte.valueOf(record2.getRecordNumber());
                                                        }
                                                        record2.getRecordNumber();
                                                        throw null;
                                                    }

                                                    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr4) {
                                                        com.payair.hce.createDeviceContext.AnonymousClass9 anonymousClass9 = (com.payair.hce.createDeviceContext.AnonymousClass9) objArr4[0];
                                                        int i29 = valueOf;
                                                        int i30 = i29 & 21;
                                                        int i31 = -(-((i29 ^ 21) | i30));
                                                        writeReplace = (((i30 | i31) << 1) - (i31 ^ i30)) % 128;
                                                        com.payair.hce.isUiContext recordValue = com.mastercard.upgrade.profile.Record.this.getRecordValue();
                                                        byte[] bArr2 = (byte[]) com.payair.hce.isUiContext.DigitizedCardProfile(new java.lang.Object[]{recordValue}, 942400464, -942400461, java.lang.System.identityHashCode(recordValue));
                                                        int i32 = valueOf;
                                                        int i33 = i32 & 35;
                                                        int i34 = i32 | 35;
                                                        int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
                                                        writeReplace = i35 % 128;
                                                        if (i35 % 2 == 0) {
                                                            return bArr2;
                                                        }
                                                        throw null;
                                                    }

                                                    @Override // com.payair.hce.checkCallingOrSelfUriPermissions
                                                    public final byte[] getRecordValue() {
                                                        return (byte[]) writeReplace(new java.lang.Object[]{this}, -481065890, 481065892, java.lang.System.identityHashCode(this));
                                                    }

                                                    @Override // com.payair.hce.checkCallingOrSelfUriPermissions
                                                    public final byte getSfi() {
                                                        return ((java.lang.Byte) writeReplace(new java.lang.Object[]{this}, 1481200750, -1481200749, java.lang.System.identityHashCode(this))).byteValue();
                                                    }

                                                    @Override // com.payair.hce.checkCallingOrSelfUriPermissions
                                                    public final byte getRecordNumber() {
                                                        return ((java.lang.Byte) writeReplace(new java.lang.Object[]{this}, -1377107220, 1377107220, java.lang.System.identityHashCode(this))).byteValue();
                                                    }
                                                };
                                                i28 = ((i28 & 25) + (i28 | 25)) - 24;
                                                i16++;
                                                int i29 = valueOf;
                                                values = (((i29 | 55) << 1) - (i29 ^ 55)) % 128;
                                            }
                                            int i30 = valueOf & 71;
                                            values = ((i30 - (~((r5 ^ 71) | i30))) - 1) % 128;
                                            return checkcallingorselfuripermissionsArr;
                                        case 10:
                                            return getProfileVersion(objArr3);
                                        case 11:
                                            com.payair.hce.createDeviceContext.AnonymousClass3 anonymousClass33 = (com.payair.hce.createDeviceContext.AnonymousClass3) objArr3[0];
                                            values = ((-2) - (~(valueOf + 28))) % 128;
                                            com.payair.hce.isUiContext gpoResponse = com.mastercard.upgrade.profile.ContactlessPaymentData.this.getGpoResponse();
                                            byte[] bArr2 = (byte[]) com.payair.hce.isUiContext.DigitizedCardProfile(new java.lang.Object[]{gpoResponse}, 942400464, -942400461, java.lang.System.identityHashCode(gpoResponse));
                                            int i31 = valueOf;
                                            int i32 = i31 & 13;
                                            int i33 = (i31 | 13) & (~i32);
                                            int i34 = -(-(i32 << 1));
                                            values = (((i33 | i34) << 1) - (i33 ^ i34)) % 128;
                                            return bArr2;
                                        case 12:
                                            return IccPrivateKeyCrtComponentsJson(objArr3);
                                        default:
                                            final com.mastercard.upgrade.profile.IccPrivateKeyCrtComponents iccPrivateKeyCrtComponents = com.mastercard.upgrade.profile.ContactlessPaymentData.this.getIccPrivateKeyCrtComponents();
                                            com.payair.hce.createDisplayContext createdisplaycontext = new com.payair.hce.createDisplayContext() { // from class: com.payair.hce.createDeviceContext.7
                                                private static int IccPrivateKeyCrtComponentsJson = 0;
                                                private static int SdkCoreAlternateContactlessPaymentDataImpl = 1;
                                                private byte[] AlternateContactlessPaymentDataJson;
                                                private byte[] DigitizedCardProfile;
                                                private byte[] valueOf;
                                                private byte[] values;
                                                private byte[] writeReplace;

                                                public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr4, int i35, int i36, int i37) {
                                                    int i38 = ~i35;
                                                    int i39 = (i35 * (-380)) + (i36 * 382) + ((i36 | i37 | i38) * (-381)) + (((~(i35 | i36)) | (~((~i37) | i36)) | (~((~i36) | i38))) * 381) + ((~(i38 | i36)) * 381);
                                                    return i39 != 1 ? i39 != 2 ? i39 != 3 ? i39 != 4 ? i39 != 5 ? valueOf(objArr4) : getProfileVersion(objArr4) : values(objArr4) : writeReplace(objArr4) : AlternateContactlessPaymentDataJson(objArr4) : DigitizedCardProfile(objArr4);
                                                }

                                                {
                                                    com.payair.hce.isUiContext u = com.mastercard.upgrade.profile.IccPrivateKeyCrtComponents.this.getU();
                                                    this.writeReplace = (byte[]) com.payair.hce.isUiContext.DigitizedCardProfile(new java.lang.Object[]{u}, 942400464, -942400461, java.lang.System.identityHashCode(u));
                                                    com.payair.hce.isUiContext p = com.mastercard.upgrade.profile.IccPrivateKeyCrtComponents.this.getP();
                                                    this.DigitizedCardProfile = (byte[]) com.payair.hce.isUiContext.DigitizedCardProfile(new java.lang.Object[]{p}, 942400464, -942400461, java.lang.System.identityHashCode(p));
                                                    com.payair.hce.isUiContext q = com.mastercard.upgrade.profile.IccPrivateKeyCrtComponents.this.getQ();
                                                    this.values = (byte[]) com.payair.hce.isUiContext.DigitizedCardProfile(new java.lang.Object[]{q}, 942400464, -942400461, java.lang.System.identityHashCode(q));
                                                    com.payair.hce.isUiContext dp = com.mastercard.upgrade.profile.IccPrivateKeyCrtComponents.this.getDp();
                                                    this.valueOf = (byte[]) com.payair.hce.isUiContext.DigitizedCardProfile(new java.lang.Object[]{dp}, 942400464, -942400461, java.lang.System.identityHashCode(dp));
                                                    com.payair.hce.isUiContext dq = com.mastercard.upgrade.profile.IccPrivateKeyCrtComponents.this.getDq();
                                                    this.AlternateContactlessPaymentDataJson = (byte[]) com.payair.hce.isUiContext.DigitizedCardProfile(new java.lang.Object[]{dq}, 942400464, -942400461, java.lang.System.identityHashCode(dq));
                                                }

                                                private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr4) {
                                                    com.payair.hce.createDeviceContext.AnonymousClass7 anonymousClass7 = (com.payair.hce.createDeviceContext.AnonymousClass7) objArr4[0];
                                                    int i35 = SdkCoreAlternateContactlessPaymentDataImpl + 100;
                                                    int i36 = (~i35) + (i35 << 1);
                                                    IccPrivateKeyCrtComponentsJson = i36 % 128;
                                                    if (i36 % 2 != 0) {
                                                        throw null;
                                                    }
                                                    if (!((java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{anonymousClass7}, 1524143318, -1524143318, java.lang.System.identityHashCode(anonymousClass7))).booleanValue()) {
                                                        int i37 = IccPrivateKeyCrtComponentsJson;
                                                        int i38 = i37 & 35;
                                                        int i39 = (i37 ^ 35) | i38;
                                                        int i40 = ((i38 | i39) << 1) - (i39 ^ i38);
                                                        SdkCoreAlternateContactlessPaymentDataImpl = i40 % 128;
                                                        if (i40 % 2 != 0) {
                                                            return null;
                                                        }
                                                        throw null;
                                                    }
                                                    int i41 = IccPrivateKeyCrtComponentsJson;
                                                    int i42 = i41 & 97;
                                                    int i43 = (((i41 | 97) & (~i42)) - (~(-(-(i42 << 1))))) - 1;
                                                    SdkCoreAlternateContactlessPaymentDataImpl = i43 % 128;
                                                    if (i43 % 2 != 0) {
                                                        return anonymousClass7.DigitizedCardProfile;
                                                    }
                                                    byte[] bArr3 = anonymousClass7.DigitizedCardProfile;
                                                    throw null;
                                                }

                                                private static /* synthetic */ java.lang.Object getProfileVersion(java.lang.Object[] objArr4) {
                                                    com.payair.hce.createDeviceContext.AnonymousClass7 anonymousClass7 = (com.payair.hce.createDeviceContext.AnonymousClass7) objArr4[0];
                                                    int i35 = SdkCoreAlternateContactlessPaymentDataImpl;
                                                    int i36 = i35 & 7;
                                                    int i37 = (i35 ^ 7) | i36;
                                                    int i38 = (i36 & i37) + (i37 | i36);
                                                    IccPrivateKeyCrtComponentsJson = i38 % 128;
                                                    if (i38 % 2 != 0) {
                                                        throw null;
                                                    }
                                                    if (!((java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{anonymousClass7}, 1524143318, -1524143318, java.lang.System.identityHashCode(anonymousClass7))).booleanValue()) {
                                                        int i39 = IccPrivateKeyCrtComponentsJson;
                                                        SdkCoreAlternateContactlessPaymentDataImpl = (((i39 & 110) + (i39 | 110)) - 1) % 128;
                                                        return null;
                                                    }
                                                    int i40 = IccPrivateKeyCrtComponentsJson;
                                                    int i41 = i40 & 67;
                                                    int i42 = (i40 | 67) & (~i41);
                                                    int i43 = i41 << 1;
                                                    int i44 = (((i42 | i43) << 1) - (i42 ^ i43)) % 128;
                                                    SdkCoreAlternateContactlessPaymentDataImpl = i44;
                                                    byte[] bArr3 = anonymousClass7.values;
                                                    IccPrivateKeyCrtComponentsJson = (((i44 & (-112)) | ((~i44) & 111)) + ((i44 & 111) << 1)) % 128;
                                                    return bArr3;
                                                }

                                                private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr4) {
                                                    com.payair.hce.createDeviceContext.AnonymousClass7 anonymousClass7 = (com.payair.hce.createDeviceContext.AnonymousClass7) objArr4[0];
                                                    int i35 = IccPrivateKeyCrtComponentsJson;
                                                    int i36 = i35 & 89;
                                                    int i37 = (i36 - (~(-(-((i35 ^ 89) | i36))))) - 1;
                                                    SdkCoreAlternateContactlessPaymentDataImpl = i37 % 128;
                                                    if (i37 % 2 != 0) {
                                                        if (!((java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{anonymousClass7}, 1524143318, -1524143318, java.lang.System.identityHashCode(anonymousClass7))).booleanValue()) {
                                                            int i38 = SdkCoreAlternateContactlessPaymentDataImpl | 35;
                                                            IccPrivateKeyCrtComponentsJson = (((i38 << 1) - (~(-((~(r5 & 35)) & i38)))) - 1) % 128;
                                                            return null;
                                                        }
                                                        int i39 = SdkCoreAlternateContactlessPaymentDataImpl;
                                                        int i40 = i39 & 41;
                                                        int i41 = (i39 ^ 41) | i40;
                                                        int i42 = (((i40 | i41) << 1) - (i41 ^ i40)) % 128;
                                                        IccPrivateKeyCrtComponentsJson = i42;
                                                        byte[] bArr3 = anonymousClass7.valueOf;
                                                        int i43 = ((i42 & androidx.media3.common.PlaybackException.ERROR_CODE_CONTENT_ALREADY_PLAYING) | ((~i42) & 109)) + ((i42 & 109) << 1);
                                                        SdkCoreAlternateContactlessPaymentDataImpl = i43 % 128;
                                                        if (i43 % 2 != 0) {
                                                            return bArr3;
                                                        }
                                                        throw null;
                                                    }
                                                    throw null;
                                                }

                                                private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr4) {
                                                    com.payair.hce.createDeviceContext.AnonymousClass7 anonymousClass7 = (com.payair.hce.createDeviceContext.AnonymousClass7) objArr4[0];
                                                    int i35 = SdkCoreAlternateContactlessPaymentDataImpl;
                                                    int i36 = ((i35 | 63) << 1) - (i35 ^ 63);
                                                    IccPrivateKeyCrtComponentsJson = i36 % 128;
                                                    if (i36 % 2 == 0) {
                                                        if (!((java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{anonymousClass7}, 1524143318, -1524143318, java.lang.System.identityHashCode(anonymousClass7))).booleanValue()) {
                                                            int i37 = SdkCoreAlternateContactlessPaymentDataImpl;
                                                            int i38 = ((i37 ^ 67) | (i37 & 67)) << 1;
                                                            int i39 = -((i37 & (-68)) | ((~i37) & 67));
                                                            IccPrivateKeyCrtComponentsJson = ((i38 ^ i39) + ((i39 & i38) << 1)) % 128;
                                                            return null;
                                                        }
                                                        int i40 = SdkCoreAlternateContactlessPaymentDataImpl;
                                                        int i41 = (i40 | 25) << 1;
                                                        int i42 = -(i40 ^ 25);
                                                        int i43 = ((i41 & i42) + (i42 | i41)) % 128;
                                                        IccPrivateKeyCrtComponentsJson = i43;
                                                        byte[] bArr3 = anonymousClass7.AlternateContactlessPaymentDataJson;
                                                        int i44 = (i43 ^ 121) + ((i43 & 121) << 1);
                                                        SdkCoreAlternateContactlessPaymentDataImpl = i44 % 128;
                                                        if (i44 % 2 != 0) {
                                                            return bArr3;
                                                        }
                                                        throw null;
                                                    }
                                                    throw null;
                                                }

                                                private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr4) {
                                                    com.payair.hce.createDeviceContext.AnonymousClass7 anonymousClass7 = (com.payair.hce.createDeviceContext.AnonymousClass7) objArr4[0];
                                                    int i35 = IccPrivateKeyCrtComponentsJson;
                                                    int i36 = ((i35 ^ 111) | (i35 & 111)) << 1;
                                                    int i37 = -((i35 & (-112)) | ((~i35) & 111));
                                                    SdkCoreAlternateContactlessPaymentDataImpl = (((i36 | i37) << 1) - (i37 ^ i36)) % 128;
                                                    if (((java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{anonymousClass7}, 1524143318, -1524143318, java.lang.System.identityHashCode(anonymousClass7))).booleanValue()) {
                                                        int i38 = (SdkCoreAlternateContactlessPaymentDataImpl + 19) % 128;
                                                        IccPrivateKeyCrtComponentsJson = i38;
                                                        byte[] bArr3 = anonymousClass7.writeReplace;
                                                        int i39 = i38 & 47;
                                                        int i40 = -(-(i38 | 47));
                                                        SdkCoreAlternateContactlessPaymentDataImpl = ((i39 & i40) + (i40 | i39)) % 128;
                                                        return bArr3;
                                                    }
                                                    int i41 = SdkCoreAlternateContactlessPaymentDataImpl;
                                                    int i42 = i41 & 95;
                                                    int i43 = -(-(i41 | 95));
                                                    int i44 = (i42 & i43) + (i43 | i42);
                                                    IccPrivateKeyCrtComponentsJson = i44 % 128;
                                                    if (i44 % 2 == 0) {
                                                        return null;
                                                    }
                                                    throw null;
                                                }

                                                private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr4) {
                                                    com.payair.hce.createDeviceContext.AnonymousClass7 anonymousClass7 = (com.payair.hce.createDeviceContext.AnonymousClass7) objArr4[0];
                                                    int i35 = IccPrivateKeyCrtComponentsJson;
                                                    int i36 = (((i35 & (-6)) | ((~i35) & 5)) - (~((i35 & 5) << 1))) - 1;
                                                    int i37 = i36 % 128;
                                                    SdkCoreAlternateContactlessPaymentDataImpl = i37;
                                                    if (i36 % 2 == 0) {
                                                        byte[] bArr3 = anonymousClass7.writeReplace;
                                                        throw null;
                                                    }
                                                    if (anonymousClass7.writeReplace != null && anonymousClass7.DigitizedCardProfile != null) {
                                                        int i38 = ((i37 & 95) + (i37 | 95)) % 128;
                                                        IccPrivateKeyCrtComponentsJson = i38;
                                                        if (anonymousClass7.values != null) {
                                                            int i39 = i38 & 71;
                                                            int i40 = ((((i38 ^ 71) | i39) << 1) - (~(-((~i39) & (i38 | 71))))) - 1;
                                                            int i41 = i40 % 128;
                                                            SdkCoreAlternateContactlessPaymentDataImpl = i41;
                                                            if (i40 % 2 == 0) {
                                                                byte[] bArr4 = anonymousClass7.valueOf;
                                                                throw null;
                                                            }
                                                            if (anonymousClass7.valueOf != null) {
                                                                int i42 = (i41 + 85) % 128;
                                                                IccPrivateKeyCrtComponentsJson = i42;
                                                                if (anonymousClass7.AlternateContactlessPaymentDataJson != null) {
                                                                    int i43 = i42 & 53;
                                                                    int i44 = (~i43) & (i42 | 53);
                                                                    int i45 = -(-(i43 << 1));
                                                                    SdkCoreAlternateContactlessPaymentDataImpl = (((i44 | i45) << 1) - (i45 ^ i44)) % 128;
                                                                    int i46 = i42 ^ 97;
                                                                    int i47 = ((i42 & 97) | i46) << 1;
                                                                    int i48 = -i46;
                                                                    int i49 = ((i47 | i48) << 1) - (i48 ^ i47);
                                                                    SdkCoreAlternateContactlessPaymentDataImpl = i49 % 128;
                                                                    if (i49 % 2 != 0) {
                                                                        return java.lang.Boolean.TRUE;
                                                                    }
                                                                    throw null;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    int i50 = SdkCoreAlternateContactlessPaymentDataImpl + 66;
                                                    IccPrivateKeyCrtComponentsJson = ((~i50) + (i50 << 1)) % 128;
                                                    return java.lang.Boolean.FALSE;
                                                }

                                                private boolean AlternateContactlessPaymentDataJson() {
                                                    return ((java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1524143318, -1524143318, java.lang.System.identityHashCode(this))).booleanValue();
                                                }

                                                @Override // com.payair.hce.createDisplayContext
                                                public final byte[] getU() {
                                                    return (byte[]) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1374630400, -1374630396, java.lang.System.identityHashCode(this));
                                                }

                                                @Override // com.payair.hce.createDisplayContext
                                                public final byte[] getDq() {
                                                    return (byte[]) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 948745759, -948745756, java.lang.System.identityHashCode(this));
                                                }

                                                @Override // com.payair.hce.createDisplayContext
                                                public final byte[] getDp() {
                                                    return (byte[]) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1103599652, -1103599651, java.lang.System.identityHashCode(this));
                                                }

                                                @Override // com.payair.hce.createDisplayContext
                                                public final byte[] getQ() {
                                                    return (byte[]) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -229710297, 229710302, java.lang.System.identityHashCode(this));
                                                }

                                                @Override // com.payair.hce.createDisplayContext
                                                public final byte[] getP() {
                                                    return (byte[]) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -1242599248, 1242599250, java.lang.System.identityHashCode(this));
                                                }
                                            };
                                            valueOf = (values + 27) % 128;
                                            return createdisplaycontext;
                                    }
                                }

                                private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr3) {
                                    com.payair.hce.createDeviceContext.AnonymousClass3 anonymousClass3 = (com.payair.hce.createDeviceContext.AnonymousClass3) objArr3[0];
                                    int i9 = valueOf;
                                    int i10 = (i9 ^ 33) + ((i9 & 33) << 1);
                                    values = i10 % 128;
                                    com.payair.hce.isUiContext aid = com.mastercard.upgrade.profile.ContactlessPaymentData.this.getAid();
                                    if (i10 % 2 == 0) {
                                        throw null;
                                    }
                                    byte[] bArr = (byte[]) com.payair.hce.isUiContext.DigitizedCardProfile(new java.lang.Object[]{aid}, 942400464, -942400461, java.lang.System.identityHashCode(aid));
                                    int i11 = valueOf & 29;
                                    values = ((i11 - (~((r0 ^ 29) | i11))) - 1) % 128;
                                    return bArr;
                                }

                                private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr3) {
                                    com.payair.hce.createDeviceContext.AnonymousClass3 anonymousClass3 = (com.payair.hce.createDeviceContext.AnonymousClass3) objArr3[0];
                                    int i9 = valueOf;
                                    int i10 = i9 & 13;
                                    int i11 = (i9 ^ 13) | i10;
                                    int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
                                    values = i12 % 128;
                                    com.payair.hce.isUiContext paymentFci = com.mastercard.upgrade.profile.ContactlessPaymentData.this.getPaymentFci();
                                    if (i12 % 2 == 0) {
                                        throw null;
                                    }
                                    byte[] bArr = (byte[]) com.payair.hce.isUiContext.DigitizedCardProfile(new java.lang.Object[]{paymentFci}, 942400464, -942400461, java.lang.System.identityHashCode(paymentFci));
                                    int i13 = valueOf;
                                    int i14 = ((i13 ^ 121) | (i13 & 121)) << 1;
                                    int i15 = -((i13 & (-122)) | ((~i13) & 121));
                                    values = (((i14 | i15) << 1) - (i15 ^ i14)) % 128;
                                    return bArr;
                                }

                                private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr3) {
                                    com.payair.hce.createDeviceContext.AnonymousClass3 anonymousClass3 = (com.payair.hce.createDeviceContext.AnonymousClass3) objArr3[0];
                                    int i9 = valueOf;
                                    int i10 = (i9 & 27) + (i9 | 27);
                                    values = i10 % 128;
                                    if (i10 % 2 == 0) {
                                        com.payair.hce.setVerticalScrollbarThumbDrawable.writeReplace(java.lang.Integer.toHexString(com.mastercard.upgrade.profile.ContactlessPaymentData.this.getCdol1RelatedDataLength()));
                                        throw new java.lang.ArithmeticException();
                                    }
                                    byte[] writeReplace2 = com.payair.hce.setVerticalScrollbarThumbDrawable.writeReplace(java.lang.Integer.toHexString(com.mastercard.upgrade.profile.ContactlessPaymentData.this.getCdol1RelatedDataLength()));
                                    values = (valueOf + 121) % 128;
                                    return writeReplace2;
                                }

                                private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr3) {
                                    com.payair.hce.createDeviceContext.AnonymousClass3 anonymousClass3 = (com.payair.hce.createDeviceContext.AnonymousClass3) objArr3[0];
                                    int i9 = valueOf;
                                    values = (((i9 & 6) + (i9 | 6)) - 1) % 128;
                                    com.payair.hce.isUiContext ciacDecline = com.mastercard.upgrade.profile.ContactlessPaymentData.this.getCiacDecline();
                                    byte[] bArr = (byte[]) com.payair.hce.isUiContext.DigitizedCardProfile(new java.lang.Object[]{ciacDecline}, 942400464, -942400461, java.lang.System.identityHashCode(ciacDecline));
                                    int i10 = valueOf;
                                    int i11 = i10 & 57;
                                    int i12 = ((i10 ^ 57) | i11) << 1;
                                    int i13 = -((i10 | 57) & (~i11));
                                    int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
                                    values = i14 % 128;
                                    if (i14 % 2 != 0) {
                                        return bArr;
                                    }
                                    throw null;
                                }

                                private static /* synthetic */ java.lang.Object IccPrivateKeyCrtComponentsJson(java.lang.Object[] objArr3) {
                                    com.payair.hce.createDeviceContext.AnonymousClass3 anonymousClass3 = (com.payair.hce.createDeviceContext.AnonymousClass3) objArr3[0];
                                    int i9 = valueOf + 43;
                                    values = i9 % 128;
                                    com.payair.hce.isUiContext cvrMaskAnd = com.mastercard.upgrade.profile.ContactlessPaymentData.this.getCvrMaskAnd();
                                    if (i9 % 2 != 0) {
                                        return (byte[]) com.payair.hce.isUiContext.DigitizedCardProfile(new java.lang.Object[]{cvrMaskAnd}, 942400464, -942400461, java.lang.System.identityHashCode(cvrMaskAnd));
                                    }
                                    throw null;
                                }

                                private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr3) {
                                    com.payair.hce.createDeviceContext.AnonymousClass3 anonymousClass3 = (com.payair.hce.createDeviceContext.AnonymousClass3) objArr3[0];
                                    int i9 = values;
                                    valueOf = ((i9 ^ 29) + ((i9 & 29) << 1)) % 128;
                                    com.payair.hce.isUiContext issuerApplicationData = com.mastercard.upgrade.profile.ContactlessPaymentData.this.getIssuerApplicationData();
                                    byte[] bArr = (byte[]) com.payair.hce.isUiContext.DigitizedCardProfile(new java.lang.Object[]{issuerApplicationData}, 942400464, -942400461, java.lang.System.identityHashCode(issuerApplicationData));
                                    int i10 = values;
                                    int i11 = i10 ^ 85;
                                    int i12 = -(-((i10 & 85) << 1));
                                    int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
                                    valueOf = i13 % 128;
                                    if (i13 % 2 == 0) {
                                        return bArr;
                                    }
                                    throw null;
                                }

                                private static /* synthetic */ java.lang.Object getProfileVersion(java.lang.Object[] objArr3) {
                                    com.payair.hce.createDeviceContext.AnonymousClass3 anonymousClass3 = (com.payair.hce.createDeviceContext.AnonymousClass3) objArr3[0];
                                    int i9 = values;
                                    int i10 = i9 & 15;
                                    int i11 = (((i9 | 15) & (~i10)) - (~(-(-(i10 << 1))))) - 1;
                                    valueOf = i11 % 128;
                                    com.payair.hce.isUiContext pinIvCvc3Track2 = com.mastercard.upgrade.profile.ContactlessPaymentData.this.getPinIvCvc3Track2();
                                    if (i11 % 2 != 0) {
                                        throw new java.lang.ArithmeticException();
                                    }
                                    byte[] bArr = (byte[]) com.payair.hce.isUiContext.DigitizedCardProfile(new java.lang.Object[]{pinIvCvc3Track2}, 942400464, -942400461, java.lang.System.identityHashCode(pinIvCvc3Track2));
                                    int i12 = valueOf;
                                    int i13 = i12 & 89;
                                    int i14 = (i12 ^ 89) | i13;
                                    values = (((i13 | i14) << 1) - (i14 ^ i13)) % 128;
                                    return bArr;
                                }

                                private static /* synthetic */ java.lang.Object RecordsJson(java.lang.Object[] objArr3) {
                                    com.payair.hce.createDeviceContext.AnonymousClass3 anonymousClass3 = (com.payair.hce.createDeviceContext.AnonymousClass3) objArr3[0];
                                    int i9 = valueOf;
                                    values = ((((i9 | 120) << 1) - (i9 ^ 120)) - 1) % 128;
                                    com.payair.hce.isUiContext ciacDeclineOnPpms = com.mastercard.upgrade.profile.ContactlessPaymentData.this.getCiacDeclineOnPpms();
                                    byte[] bArr = (byte[]) com.payair.hce.isUiContext.DigitizedCardProfile(new java.lang.Object[]{ciacDeclineOnPpms}, 942400464, -942400461, java.lang.System.identityHashCode(ciacDeclineOnPpms));
                                    int i10 = valueOf;
                                    int i11 = i10 & 71;
                                    int i12 = -(-(i10 | 71));
                                    int i13 = (i11 & i12) + (i12 | i11);
                                    values = i13 % 128;
                                    if (i13 % 2 != 0) {
                                        return bArr;
                                    }
                                    throw new java.lang.ArithmeticException();
                                }

                                private static /* synthetic */ java.lang.Object getAid(java.lang.Object[] objArr3) {
                                    com.payair.hce.createDeviceContext.AnonymousClass3 anonymousClass3 = (com.payair.hce.createDeviceContext.AnonymousClass3) objArr3[0];
                                    int i9 = values & 71;
                                    valueOf = (((((r0 ^ 71) | i9) << 1) - (~(-((r0 | 71) & (~i9))))) - 1) % 128;
                                    final com.mastercard.upgrade.profile.AlternateContactlessPaymentData alternateContactlessPaymentData = com.mastercard.upgrade.profile.ContactlessPaymentData.this.getAlternateContactlessPaymentData();
                                    if (alternateContactlessPaymentData == null) {
                                        int i10 = valueOf;
                                        int i11 = i10 ^ 17;
                                        int i12 = ((i10 & 17) | i11) << 1;
                                        int i13 = -i11;
                                        int i14 = (i12 & i13) + (i12 | i13);
                                        values = i14 % 128;
                                        if (i14 % 2 != 0) {
                                            return null;
                                        }
                                        throw new java.lang.ArithmeticException();
                                    }
                                    com.payair.hce.enforceCallingOrSelfUriPermission enforcecallingorselfuripermission = new com.payair.hce.enforceCallingOrSelfUriPermission() { // from class: com.payair.hce.createDeviceContext.4
                                        private static int AlternateContactlessPaymentDataJson = 0;
                                        private static int values = 1;

                                        public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr4, int i15, int i16, int i17) {
                                            int i18 = ~i17;
                                            int i19 = (i15 * (-159)) + (i16 * (-159)) + (((~i15) | i16) * 160) + (((~(i18 | i15)) | (~(i15 | i16))) * (-160)) + ((i15 | (~((~i16) | i18))) * 160);
                                            if (i19 != 1) {
                                                return i19 != 2 ? i19 != 3 ? i19 != 4 ? writeReplace(objArr4) : AlternateContactlessPaymentDataJson(objArr4) : values(objArr4) : DigitizedCardProfile(objArr4);
                                            }
                                            com.payair.hce.createDeviceContext.AnonymousClass4 anonymousClass4 = (com.payair.hce.createDeviceContext.AnonymousClass4) objArr4[0];
                                            values = (AlternateContactlessPaymentDataJson + 93) % 128;
                                            com.payair.hce.isUiContext cvrMaskAnd = com.mastercard.upgrade.profile.AlternateContactlessPaymentData.this.getCvrMaskAnd();
                                            byte[] bArr = (byte[]) com.payair.hce.isUiContext.DigitizedCardProfile(new java.lang.Object[]{cvrMaskAnd}, 942400464, -942400461, java.lang.System.identityHashCode(cvrMaskAnd));
                                            int i20 = AlternateContactlessPaymentDataJson;
                                            int i21 = ((i20 ^ 45) | (i20 & 45)) << 1;
                                            int i22 = -((i20 & (-46)) | ((~i20) & 45));
                                            values = ((i21 & i22) + (i21 | i22)) % 128;
                                            return bArr;
                                        }

                                        private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr4) {
                                            com.payair.hce.createDeviceContext.AnonymousClass4 anonymousClass4 = (com.payair.hce.createDeviceContext.AnonymousClass4) objArr4[0];
                                            int i15 = values;
                                            int i16 = (((i15 | 109) << 1) - (~(-(i15 ^ 109)))) - 1;
                                            AlternateContactlessPaymentDataJson = i16 % 128;
                                            com.payair.hce.isUiContext aid = com.mastercard.upgrade.profile.AlternateContactlessPaymentData.this.getAid();
                                            if (i16 % 2 == 0) {
                                                return (byte[]) com.payair.hce.isUiContext.DigitizedCardProfile(new java.lang.Object[]{aid}, 942400464, -942400461, java.lang.System.identityHashCode(aid));
                                            }
                                            throw null;
                                        }

                                        private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr4) {
                                            com.payair.hce.createDeviceContext.AnonymousClass4 anonymousClass4 = (com.payair.hce.createDeviceContext.AnonymousClass4) objArr4[0];
                                            int i15 = AlternateContactlessPaymentDataJson;
                                            int i16 = ((i15 ^ 51) | (i15 & 51)) << 1;
                                            int i17 = -((i15 & (-52)) | ((~i15) & 51));
                                            values = ((i16 & i17) + (i17 | i16)) % 128;
                                            com.payair.hce.isUiContext paymentFci = com.mastercard.upgrade.profile.AlternateContactlessPaymentData.this.getPaymentFci();
                                            byte[] bArr = (byte[]) com.payair.hce.isUiContext.DigitizedCardProfile(new java.lang.Object[]{paymentFci}, 942400464, -942400461, java.lang.System.identityHashCode(paymentFci));
                                            int i18 = values;
                                            int i19 = ((i18 | 5) << 1) - (i18 ^ 5);
                                            AlternateContactlessPaymentDataJson = i19 % 128;
                                            if (i19 % 2 == 0) {
                                                return bArr;
                                            }
                                            throw null;
                                        }

                                        private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr4) {
                                            com.payair.hce.createDeviceContext.AnonymousClass4 anonymousClass4 = (com.payair.hce.createDeviceContext.AnonymousClass4) objArr4[0];
                                            int i15 = values;
                                            int i16 = i15 ^ 33;
                                            int i17 = (i15 & 33) << 1;
                                            AlternateContactlessPaymentDataJson = ((i16 & i17) + (i17 | i16)) % 128;
                                            com.payair.hce.isUiContext gpoResponse = com.mastercard.upgrade.profile.AlternateContactlessPaymentData.this.getGpoResponse();
                                            byte[] bArr = (byte[]) com.payair.hce.isUiContext.DigitizedCardProfile(new java.lang.Object[]{gpoResponse}, 942400464, -942400461, java.lang.System.identityHashCode(gpoResponse));
                                            int i18 = values;
                                            int i19 = (i18 ^ 77) + ((i18 & 77) << 1);
                                            AlternateContactlessPaymentDataJson = i19 % 128;
                                            if (i19 % 2 == 0) {
                                                return bArr;
                                            }
                                            throw null;
                                        }

                                        private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr4) {
                                            com.payair.hce.createDeviceContext.AnonymousClass4 anonymousClass4 = (com.payair.hce.createDeviceContext.AnonymousClass4) objArr4[0];
                                            int i15 = AlternateContactlessPaymentDataJson;
                                            int i16 = i15 ^ 115;
                                            int i17 = ((i15 & 115) | i16) << 1;
                                            int i18 = -i16;
                                            values = (((i17 | i18) << 1) - (i17 ^ i18)) % 128;
                                            com.payair.hce.isUiContext ciacDecline = com.mastercard.upgrade.profile.AlternateContactlessPaymentData.this.getCiacDecline();
                                            byte[] bArr = (byte[]) com.payair.hce.isUiContext.DigitizedCardProfile(new java.lang.Object[]{ciacDecline}, 942400464, -942400461, java.lang.System.identityHashCode(ciacDecline));
                                            int i19 = AlternateContactlessPaymentDataJson;
                                            int i20 = i19 & 45;
                                            int i21 = ((i19 ^ 45) | i20) << 1;
                                            int i22 = -((i19 | 45) & (~i20));
                                            int i23 = (i21 & i22) + (i22 | i21);
                                            values = i23 % 128;
                                            if (i23 % 2 != 0) {
                                                return bArr;
                                            }
                                            throw null;
                                        }

                                        @Override // com.payair.hce.enforceCallingOrSelfUriPermission
                                        public final byte[] getCvrMaskAnd() {
                                            return (byte[]) values(new java.lang.Object[]{this}, 410698207, -410698206, java.lang.System.identityHashCode(this));
                                        }

                                        @Override // com.payair.hce.enforceCallingOrSelfUriPermission
                                        public final byte[] getCiacDecline() {
                                            return (byte[]) values(new java.lang.Object[]{this}, 98056896, -98056892, java.lang.System.identityHashCode(this));
                                        }

                                        @Override // com.payair.hce.enforceCallingOrSelfUriPermission
                                        public final byte[] getGpoResponse() {
                                            return (byte[]) values(new java.lang.Object[]{this}, 27802432, -27802430, java.lang.System.identityHashCode(this));
                                        }

                                        @Override // com.payair.hce.enforceCallingOrSelfUriPermission
                                        public final byte[] getPaymentFci() {
                                            return (byte[]) values(new java.lang.Object[]{this}, -572457689, 572457692, java.lang.System.identityHashCode(this));
                                        }

                                        @Override // com.payair.hce.enforceCallingOrSelfUriPermission
                                        public final byte[] getAid() {
                                            return (byte[]) values(new java.lang.Object[]{this}, -1152109346, 1152109346, java.lang.System.identityHashCode(this));
                                        }
                                    };
                                    int identityHashCode = java.lang.System.identityHashCode(anonymousClass3);
                                    int i15 = identityHashCode & 1127118247;
                                    int i16 = ~((identityHashCode ^ 1127118247) | i15);
                                    int i17 = i16 ^ 742393880;
                                    int i18 = i16 & 742393880;
                                    int i19 = (i18 ^ i17) | (i18 & i17);
                                    int i20 = identityHashCode & (-742677531);
                                    int i21 = ((-742677531) | identityHashCode) & (~i20);
                                    int i22 = (i21 ^ i20) | (i21 & i20);
                                    int i23 = ~i22;
                                    int i24 = (i22 | i23) & i23;
                                    int i25 = (((~i19) & i24) | ((~i24) & i19) | (i19 & i24)) * (-880);
                                    int i26 = i25 | 610143826;
                                    int i27 = ((i26 << 1) - (~(-((~(i25 & 610143826)) & i26)))) - 1;
                                    int i28 = ~identityHashCode;
                                    int i29 = i28 & (-1127118248);
                                    int i30 = ((~i28) & 1127118247) | i29;
                                    int i31 = 1127118247 & i28;
                                    int i32 = (i31 ^ i30) | (i31 & i30);
                                    int i33 = ~i32;
                                    int i34 = ((i32 | i33) & i33) | 742677530;
                                    int i35 = identityHashCode & (-1127118248);
                                    int i36 = ~(i15 | i29 | i35);
                                    int i37 = ((i34 ^ i36) | (i36 & i34)) * (-880);
                                    int i38 = (identityHashCode | (-1127118248)) & (~i35);
                                    int identityHashCode2 = java.lang.System.identityHashCode(anonymousClass3);
                                    int i39 = identityHashCode2 | 319375243;
                                    int i40 = ~i39;
                                    int i41 = (i39 | i40) & i40;
                                    int i42 = ((~i41) & 1822732324) | ((-1822732325) & i41);
                                    int i43 = i41 & 1822732324;
                                    int i44 = (i43 ^ i42) | (i43 & i42);
                                    int i45 = identityHashCode2 & (-1822799535);
                                    int i46 = ((-1822799535) | identityHashCode2) & (~i45);
                                    int i47 = ~identityHashCode2;
                                    int i48 = ~((i46 ^ i45) | (i46 & i45));
                                    int i49 = i44 & i48;
                                    int i50 = ((((i44 | i48) & (~i49)) | i49) * (-880)) + 1666872322;
                                    int i51 = i47 & 319375243;
                                    int i52 = (~i51) & (i47 | 319375243);
                                    int i53 = ~((i51 ^ i52) | (i51 & i52));
                                    int i54 = (i53 ^ 1822799534) | (i53 & 1822799534);
                                    int i55 = (319375243 & identityHashCode2) | (i47 & (-319375244));
                                    int i56 = identityHashCode2 & (-319375244);
                                    int i57 = (i55 ^ i56) | (i55 & i56);
                                    int i58 = ~i57;
                                    int i59 = (i57 | i58) & i58;
                                    int i60 = i54 & i59;
                                    int i61 = (i59 | i54) & (~i60);
                                    int i62 = -(-(((i61 ^ i60) | (i61 & i60)) * (-880)));
                                    int i63 = i50 & i62;
                                    int i64 = ((i50 ^ i62) | i63) << 1;
                                    int i65 = -((i62 | i50) & (~i63));
                                    int i66 = (i64 ^ i65) + ((i65 & i64) << 1);
                                    int i67 = identityHashCode2 ^ (-319375244);
                                    int i68 = (~((i67 ^ i56) | (i67 & i56))) * 880;
                                    if ((((~i37) & i27) | ((~i27) & i37)) + ((i37 & i27) << 1) + ((~((i38 ^ i35) | (i38 & i35))) * 880) <= (i66 ^ i68) + ((i68 & i66) << 1)) {
                                        return enforcecallingorselfuripermission;
                                    }
                                    throw null;
                                }

                                @Override // com.payair.hce.checkCallingUriPermission
                                public final com.payair.hce.checkCallingOrSelfUriPermissions[] getRecords() {
                                    return (com.payair.hce.checkCallingOrSelfUriPermissions[]) values(new java.lang.Object[]{this}, -1699227897, 1699227906, java.lang.System.identityHashCode(this));
                                }

                                @Override // com.payair.hce.checkCallingUriPermission
                                public final com.payair.hce.enforceCallingOrSelfUriPermission getAlternateContactlessPaymentData() {
                                    return (com.payair.hce.enforceCallingOrSelfUriPermission) values(new java.lang.Object[]{this}, 1788095088, -1788095080, java.lang.System.identityHashCode(this));
                                }

                                @Override // com.payair.hce.checkCallingUriPermission
                                public final byte[] getCiacDeclineOnPpms() {
                                    return (byte[]) values(new java.lang.Object[]{this}, -1239175094, 1239175101, java.lang.System.identityHashCode(this));
                                }

                                @Override // com.payair.hce.checkCallingUriPermission
                                public final byte[] getPinIvCvc3Track2() {
                                    return (byte[]) values(new java.lang.Object[]{this}, -893475020, 893475030, java.lang.System.identityHashCode(this));
                                }

                                @Override // com.payair.hce.checkCallingUriPermission
                                public final com.payair.hce.createDisplayContext getIccPrivateKeyCrtComponents() {
                                    return (com.payair.hce.createDisplayContext) values(new java.lang.Object[]{this}, 714729878, -714729878, java.lang.System.identityHashCode(this));
                                }

                                @Override // com.payair.hce.checkCallingUriPermission
                                public final byte[] getIssuerApplicationData() {
                                    return (byte[]) values(new java.lang.Object[]{this}, -1839146972, 1839146974, java.lang.System.identityHashCode(this));
                                }

                                @Override // com.payair.hce.checkCallingUriPermission
                                public final byte[] getCvrMaskAnd() {
                                    return (byte[]) values(new java.lang.Object[]{this}, 523577164, -523577152, java.lang.System.identityHashCode(this));
                                }

                                @Override // com.payair.hce.checkCallingUriPermission
                                public final byte[] getCiacDecline() {
                                    return (byte[]) values(new java.lang.Object[]{this}, -1517067242, 1517067248, java.lang.System.identityHashCode(this));
                                }

                                @Override // com.payair.hce.checkCallingUriPermission
                                public final byte[] getCdol1RelatedDataLength() {
                                    return (byte[]) values(new java.lang.Object[]{this}, -1945058421, 1945058422, java.lang.System.identityHashCode(this));
                                }

                                @Override // com.payair.hce.checkCallingUriPermission
                                public final byte[] getGpoResponse() {
                                    return (byte[]) values(new java.lang.Object[]{this}, -1456085742, 1456085753, java.lang.System.identityHashCode(this));
                                }

                                @Override // com.payair.hce.checkCallingUriPermission
                                public final byte[] getPaymentFci() {
                                    return (byte[]) values(new java.lang.Object[]{this}, 1649873565, -1649873562, java.lang.System.identityHashCode(this));
                                }

                                @Override // com.payair.hce.checkCallingUriPermission
                                public final byte[] getPpseFci() {
                                    return (byte[]) values(new java.lang.Object[]{this}, -1978792249, 1978792253, java.lang.System.identityHashCode(this));
                                }

                                @Override // com.payair.hce.checkCallingUriPermission
                                public final byte[] getAid() {
                                    return (byte[]) values(new java.lang.Object[]{this}, 1866522229, -1866522224, java.lang.System.identityHashCode(this));
                                }
                            };
                            int i9 = writeReplace;
                            int i10 = i9 & 51;
                            int i11 = -(-(i9 | 51));
                            AlternateContactlessPaymentDataJson = (((i10 | i11) << 1) - (i11 ^ i10)) % 128;
                            return checkcallinguripermission;
                        }
                        com.payair.hce.createDeviceContext.AnonymousClass1 anonymousClass1 = (com.payair.hce.createDeviceContext.AnonymousClass1) objArr2[0];
                        int i12 = writeReplace;
                        AlternateContactlessPaymentDataJson = ((((i12 | 59) << 1) - (~(-((i12 & (-60)) | ((~i12) & 59))))) - 1) % 128;
                        final com.mastercard.upgrade.profile.RemotePaymentData remotePaymentData = com.mastercard.upgrade.profile.MppLiteModule.this.getRemotePaymentData();
                        if (remotePaymentData != null) {
                            com.payair.hce.revokeSelfPermissionOnKill revokeselfpermissiononkill = new com.payair.hce.revokeSelfPermissionOnKill() { // from class: com.payair.hce.createDeviceContext.6
                                private static int DigitizedCardProfile = 1;
                                private static int valueOf;

                                public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr3, int i13, int i14, int i15) {
                                    int i16 = ~((~i13) | i14);
                                    int i17 = ~i14;
                                    int i18 = ~i15;
                                    switch ((i13 * (-1975)) + (i14 * com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.TransferFrameEnd) + ((i15 | i16) * 988) + (((~(i13 | i17)) | (~(i13 | i18))) * (-1976)) + (((~(i17 | i15)) | i16 | (~(i14 | i18))) * 988)) {
                                        case 1:
                                            com.payair.hce.createDeviceContext.AnonymousClass6 anonymousClass6 = (com.payair.hce.createDeviceContext.AnonymousClass6) objArr3[0];
                                            DigitizedCardProfile = (valueOf + 101) % 128;
                                            com.payair.hce.isUiContext pan = com.mastercard.upgrade.profile.RemotePaymentData.this.getPan();
                                            byte[] bArr = (byte[]) com.payair.hce.isUiContext.DigitizedCardProfile(new java.lang.Object[]{pan}, 942400464, -942400461, java.lang.System.identityHashCode(pan));
                                            int i19 = valueOf;
                                            DigitizedCardProfile = ((i19 & 81) + (i19 | 81)) % 128;
                                            return bArr;
                                        case 2:
                                            com.payair.hce.createDeviceContext.AnonymousClass6 anonymousClass62 = (com.payair.hce.createDeviceContext.AnonymousClass6) objArr3[0];
                                            int i20 = valueOf + 20;
                                            DigitizedCardProfile = ((~i20) + (i20 << 1)) % 128;
                                            com.payair.hce.isUiContext issuerApplicationData = com.mastercard.upgrade.profile.RemotePaymentData.this.getIssuerApplicationData();
                                            byte[] bArr2 = (byte[]) com.payair.hce.isUiContext.DigitizedCardProfile(new java.lang.Object[]{issuerApplicationData}, 942400464, -942400461, java.lang.System.identityHashCode(issuerApplicationData));
                                            int i21 = valueOf;
                                            DigitizedCardProfile = (((i21 ^ 2) + ((i21 & 2) << 1)) - 1) % 128;
                                            return bArr2;
                                        case 3:
                                            com.payair.hce.createDeviceContext.AnonymousClass6 anonymousClass63 = (com.payair.hce.createDeviceContext.AnonymousClass6) objArr3[0];
                                            int i22 = DigitizedCardProfile;
                                            valueOf = (((i22 | 111) << 1) - (i22 ^ 111)) % 128;
                                            com.payair.hce.isUiContext aip = com.mastercard.upgrade.profile.RemotePaymentData.this.getAip();
                                            byte[] bArr3 = (byte[]) com.payair.hce.isUiContext.DigitizedCardProfile(new java.lang.Object[]{aip}, 942400464, -942400461, java.lang.System.identityHashCode(aip));
                                            int i23 = valueOf;
                                            int i24 = i23 & 101;
                                            int i25 = (i23 ^ 101) | i24;
                                            DigitizedCardProfile = ((i24 & i25) + (i25 | i24)) % 128;
                                            return bArr3;
                                        case 4:
                                            return DigitizedCardProfile(objArr3);
                                        case 5:
                                            return AlternateContactlessPaymentDataJson(objArr3);
                                        case 6:
                                            com.payair.hce.createDeviceContext.AnonymousClass6 anonymousClass64 = (com.payair.hce.createDeviceContext.AnonymousClass6) objArr3[0];
                                            int i26 = DigitizedCardProfile;
                                            valueOf = (((i26 & 119) - (~(i26 | 119))) - 1) % 128;
                                            com.payair.hce.isUiContext panSequenceNumber = com.mastercard.upgrade.profile.RemotePaymentData.this.getPanSequenceNumber();
                                            byte[] bArr4 = (byte[]) com.payair.hce.isUiContext.DigitizedCardProfile(new java.lang.Object[]{panSequenceNumber}, 942400464, -942400461, java.lang.System.identityHashCode(panSequenceNumber));
                                            int i27 = DigitizedCardProfile;
                                            int i28 = i27 ^ 105;
                                            valueOf = ((((i27 & 105) | i28) << 1) - i28) % 128;
                                            return bArr4;
                                        case 7:
                                            return valueOf(objArr3);
                                        default:
                                            return writeReplace(objArr3);
                                    }
                                }

                                private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr3) {
                                    com.payair.hce.createDeviceContext.AnonymousClass6 anonymousClass6 = (com.payair.hce.createDeviceContext.AnonymousClass6) objArr3[0];
                                    int i13 = valueOf;
                                    int i14 = i13 & 91;
                                    int i15 = (i13 ^ 91) | i14;
                                    int i16 = (i14 & i15) + (i15 | i14);
                                    DigitizedCardProfile = i16 % 128;
                                    com.payair.hce.isUiContext applicationExpiryDate = com.mastercard.upgrade.profile.RemotePaymentData.this.getApplicationExpiryDate();
                                    if (i16 % 2 != 0) {
                                        return (byte[]) com.payair.hce.isUiContext.DigitizedCardProfile(new java.lang.Object[]{applicationExpiryDate}, 942400464, -942400461, java.lang.System.identityHashCode(applicationExpiryDate));
                                    }
                                    throw new java.lang.ArithmeticException();
                                }

                                private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr3) {
                                    com.payair.hce.createDeviceContext.AnonymousClass6 anonymousClass6 = (com.payair.hce.createDeviceContext.AnonymousClass6) objArr3[0];
                                    int i13 = valueOf;
                                    int i14 = i13 & 111;
                                    int i15 = ((i13 ^ 111) | i14) << 1;
                                    int i16 = -((i13 | 111) & (~i14));
                                    int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
                                    DigitizedCardProfile = i17 % 128;
                                    com.payair.hce.isUiContext ciacDecline = com.mastercard.upgrade.profile.RemotePaymentData.this.getCiacDecline();
                                    if (i17 % 2 == 0) {
                                        throw null;
                                    }
                                    byte[] bArr = (byte[]) com.payair.hce.isUiContext.DigitizedCardProfile(new java.lang.Object[]{ciacDecline}, 942400464, -942400461, java.lang.System.identityHashCode(ciacDecline));
                                    int i18 = DigitizedCardProfile;
                                    int i19 = (i18 & 17) + (i18 | 17);
                                    valueOf = i19 % 128;
                                    if (i19 % 2 == 0) {
                                        return bArr;
                                    }
                                    throw null;
                                }

                                private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr3) {
                                    com.payair.hce.createDeviceContext.AnonymousClass6 anonymousClass6 = (com.payair.hce.createDeviceContext.AnonymousClass6) objArr3[0];
                                    DigitizedCardProfile = (valueOf + 63) % 128;
                                    com.payair.hce.isUiContext cvrMaskAnd = com.mastercard.upgrade.profile.RemotePaymentData.this.getCvrMaskAnd();
                                    byte[] bArr = (byte[]) com.payair.hce.isUiContext.DigitizedCardProfile(new java.lang.Object[]{cvrMaskAnd}, 942400464, -942400461, java.lang.System.identityHashCode(cvrMaskAnd));
                                    int i13 = valueOf;
                                    int i14 = i13 & 109;
                                    int i15 = (i13 ^ 109) | i14;
                                    int i16 = (i14 & i15) + (i15 | i14);
                                    DigitizedCardProfile = i16 % 128;
                                    if (i16 % 2 != 0) {
                                        return bArr;
                                    }
                                    throw null;
                                }

                                private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr3) {
                                    com.payair.hce.createDeviceContext.AnonymousClass6 anonymousClass6 = (com.payair.hce.createDeviceContext.AnonymousClass6) objArr3[0];
                                    int i13 = DigitizedCardProfile;
                                    valueOf = (((i13 | 85) << 1) - (i13 ^ 85)) % 128;
                                    com.payair.hce.isUiContext track2EquivalentData = com.mastercard.upgrade.profile.RemotePaymentData.this.getTrack2EquivalentData();
                                    byte[] bArr = (byte[]) com.payair.hce.isUiContext.DigitizedCardProfile(new java.lang.Object[]{track2EquivalentData}, 942400464, -942400461, java.lang.System.identityHashCode(track2EquivalentData));
                                    int i14 = valueOf;
                                    int i15 = i14 & 45;
                                    int i16 = (i14 | 45) & (~i15);
                                    int i17 = i15 << 1;
                                    int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
                                    DigitizedCardProfile = i18 % 128;
                                    if (i18 % 2 != 0) {
                                        return bArr;
                                    }
                                    throw null;
                                }

                                @Override // com.payair.hce.revokeSelfPermissionOnKill
                                public final byte[] getTrack2Equivalent() {
                                    return (byte[]) writeReplace(new java.lang.Object[]{this}, 802062116, -802062111, java.lang.System.identityHashCode(this));
                                }

                                @Override // com.payair.hce.revokeSelfPermissionOnKill
                                public final byte[] getIssuerApplicationData() {
                                    return (byte[]) writeReplace(new java.lang.Object[]{this}, 1520665546, -1520665544, java.lang.System.identityHashCode(this));
                                }

                                @Override // com.payair.hce.revokeSelfPermissionOnKill
                                public final byte[] getCvrMaskAnd() {
                                    return (byte[]) writeReplace(new java.lang.Object[]{this}, 2035628454, -2035628450, java.lang.System.identityHashCode(this));
                                }

                                @Override // com.payair.hce.revokeSelfPermissionOnKill
                                public final byte[] getCiacDecline() {
                                    return (byte[]) writeReplace(new java.lang.Object[]{this}, 1367029307, -1367029307, java.lang.System.identityHashCode(this));
                                }

                                @Override // com.payair.hce.revokeSelfPermissionOnKill
                                public final byte[] getAip() {
                                    return (byte[]) writeReplace(new java.lang.Object[]{this}, 762477675, -762477672, java.lang.System.identityHashCode(this));
                                }

                                @Override // com.payair.hce.revokeSelfPermissionOnKill
                                public final byte[] getApplicationExpiryDate() {
                                    return (byte[]) writeReplace(new java.lang.Object[]{this}, -977876893, 977876900, java.lang.System.identityHashCode(this));
                                }

                                @Override // com.payair.hce.revokeSelfPermissionOnKill
                                public final byte[] getPanSequenceNumber() {
                                    return (byte[]) writeReplace(new java.lang.Object[]{this}, 276956839, -276956833, java.lang.System.identityHashCode(this));
                                }

                                @Override // com.payair.hce.revokeSelfPermissionOnKill
                                public final byte[] getPan() {
                                    return (byte[]) writeReplace(new java.lang.Object[]{this}, 826671627, -826671626, java.lang.System.identityHashCode(this));
                                }
                            };
                            int i13 = AlternateContactlessPaymentDataJson;
                            writeReplace = (((i13 | 39) << 1) - (i13 ^ 39)) % 128;
                            return revokeselfpermissiononkill;
                        }
                        int i14 = writeReplace;
                        int i15 = i14 & 31;
                        int i16 = ((((i14 | 31) & (~i15)) - (~(-(-(i15 << 1))))) - 1) % 128;
                        AlternateContactlessPaymentDataJson = i16;
                        writeReplace = ((i16 ^ 83) + ((i16 & 83) << 1)) % 128;
                        return null;
                    }

                    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr2) {
                        final com.mastercard.upgrade.profile.CardRiskManagementData cardRiskManagementData = com.mastercard.upgrade.profile.MppLiteModule.this.getCardRiskManagementData();
                        com.payair.hce.checkCallingUriPermissions checkcallinguripermissions = new com.payair.hce.checkCallingUriPermissions() { // from class: com.payair.hce.createDeviceContext.2
                            private static int DigitizedCardProfile = 0;
                            private static int valueOf = 1;

                            public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr3, int i, int i2, int i3) {
                                int i4 = ~i;
                                int i5 = ~i2;
                                int i6 = ~(i | i2);
                                if ((i * (-721)) + (i2 * (-721)) + (((~i3) | (~(i4 | i5)) | i6) * 1444) + (((~(i3 | i)) | i6 | (~(i3 | i2))) * (-1444)) + (((~(i | i5)) | (~(i2 | i4))) * 722) == 1) {
                                    return AlternateContactlessPaymentDataJson(objArr3);
                                }
                                com.payair.hce.createDeviceContext.AnonymousClass2 anonymousClass2 = (com.payair.hce.createDeviceContext.AnonymousClass2) objArr3[0];
                                int i7 = valueOf;
                                int i8 = i7 ^ 99;
                                int i9 = -(-((i7 & 99) << 1));
                                DigitizedCardProfile = ((i8 ^ i9) + ((i9 & i8) << 1)) % 128;
                                com.payair.hce.isUiContext crmCountryCode = com.mastercard.upgrade.profile.CardRiskManagementData.this.getCrmCountryCode();
                                byte[] bArr = (byte[]) com.payair.hce.isUiContext.DigitizedCardProfile(new java.lang.Object[]{crmCountryCode}, 942400464, -942400461, java.lang.System.identityHashCode(crmCountryCode));
                                int i10 = DigitizedCardProfile;
                                valueOf = (((i10 | 77) << 1) - (i10 ^ 77)) % 128;
                                return bArr;
                            }

                            private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr3) {
                                com.payair.hce.createDeviceContext.AnonymousClass2 anonymousClass2 = (com.payair.hce.createDeviceContext.AnonymousClass2) objArr3[0];
                                int i = valueOf;
                                DigitizedCardProfile = ((((i | 72) << 1) - (i ^ 72)) - 1) % 128;
                                com.payair.hce.isUiContext additionalCheckTable = com.mastercard.upgrade.profile.CardRiskManagementData.this.getAdditionalCheckTable();
                                byte[] bArr = (byte[]) com.payair.hce.isUiContext.DigitizedCardProfile(new java.lang.Object[]{additionalCheckTable}, 942400464, -942400461, java.lang.System.identityHashCode(additionalCheckTable));
                                int i2 = DigitizedCardProfile;
                                int i3 = i2 & 37;
                                int i4 = (i2 ^ 37) | i3;
                                int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
                                valueOf = i5 % 128;
                                if (i5 % 2 != 0) {
                                    return bArr;
                                }
                                throw null;
                            }

                            @Override // com.payair.hce.checkCallingUriPermissions
                            public final byte[] getCrmCountryCode() {
                                return (byte[]) valueOf(new java.lang.Object[]{this}, -1137686213, 1137686213, java.lang.System.identityHashCode(this));
                            }

                            @Override // com.payair.hce.checkCallingUriPermissions
                            public final byte[] getAdditionalCheckTable() {
                                return (byte[]) valueOf(new java.lang.Object[]{this}, -1473956463, 1473956464, java.lang.System.identityHashCode(this));
                            }
                        };
                        int i = AlternateContactlessPaymentDataJson;
                        int i2 = i ^ 5;
                        int i3 = ((i & 5) | i2) << 1;
                        int i4 = -i2;
                        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
                        writeReplace = i5 % 128;
                        if (i5 % 2 == 0) {
                            return checkcallinguripermissions;
                        }
                        throw null;
                    }

                    @Override // com.payair.hce.enforceUriPermission
                    public final com.payair.hce.revokeSelfPermissionOnKill getRemotePaymentData() {
                        return (com.payair.hce.revokeSelfPermissionOnKill) values(new java.lang.Object[]{this}, -1986363180, 1986363180, java.lang.System.identityHashCode(this));
                    }

                    @Override // com.payair.hce.enforceUriPermission
                    public final com.payair.hce.checkCallingUriPermission getContactlessPaymentData() {
                        return (com.payair.hce.checkCallingUriPermission) values(new java.lang.Object[]{this}, 2023403663, -2023403661, java.lang.System.identityHashCode(this));
                    }

                    @Override // com.payair.hce.enforceUriPermission
                    public final com.payair.hce.checkCallingUriPermissions getCardRiskManagementData() {
                        return (com.payair.hce.checkCallingUriPermissions) values(new java.lang.Object[]{this}, -44041176, 44041177, java.lang.System.identityHashCode(this));
                    }
                };
                int i = writeReplace;
                int i2 = i ^ 17;
                int i3 = ((((i & 17) | i2) << 1) - (~(-i2))) - 1;
                DigitizedCardProfile = i3 % 128;
                if (i3 % 2 != 0) {
                    return enforceuripermission;
                }
                throw null;
            }

            @Override // com.payair.hce.createContextForSplit
            public final com.payair.hce.enforceUriPermission getMppLiteModule() {
                return (com.payair.hce.enforceUriPermission) DigitizedCardProfile(new java.lang.Object[]{this}, 7230967, -7230965, java.lang.System.identityHashCode(this));
            }

            @Override // com.payair.hce.createContextForSplit
            public final com.payair.hce.checkUriPermission getBusinessLogicModule() {
                return (com.payair.hce.checkUriPermission) DigitizedCardProfile(new java.lang.Object[]{this}, 1285509979, -1285509976, java.lang.System.identityHashCode(this));
            }

            @Override // com.payair.hce.createContextForSplit
            public final int getMaximumPinTry() {
                return ((java.lang.Integer) DigitizedCardProfile(new java.lang.Object[]{this}, 1215450294, -1215450294, java.lang.System.identityHashCode(this))).intValue();
            }

            @Override // com.payair.hce.createContextForSplit
            public final java.lang.String getDigitizedCardId() {
                return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, 1239503064, -1239503063, java.lang.System.identityHashCode(this));
            }
        };
        AlternateContactlessPaymentDataJson = (writeReplace + 61) % 128;
        return createcontextforsplit;
    }

    private static void b(boolean z, java.lang.String str, int i, int i2, int i3, java.lang.Object[] objArr) {
        int i4 = $11 + 11;
        $10 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.DigitizedCardJson11 digitizedCardJson11 = new com.payair.hce.DigitizedCardJson11();
        char[] cArr = new char[i3];
        digitizedCardJson11.DigitizedCardProfile = 0;
        int i5 = $10 + 15;
        $11 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 4 / 5;
        }
        while (digitizedCardJson11.DigitizedCardProfile < i3) {
            digitizedCardJson11.values = charArray[digitizedCardJson11.DigitizedCardProfile];
            cArr[digitizedCardJson11.DigitizedCardProfile] = (char) (i + digitizedCardJson11.values);
            int i7 = digitizedCardJson11.DigitizedCardProfile;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i7]), java.lang.Integer.valueOf(valueOf)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(414841307);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 43, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2073, (char) ((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 60037));
                    byte b = $$d[2];
                    byte b2 = b;
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    d(b, b2, b2, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(414841307, obj);
                }
                cArr[i7] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - android.view.View.MeasureSpec.getSize(0), 3543 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj2);
                }
                ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i2 > 0) {
            digitizedCardJson11.AlternateContactlessPaymentDataJson = i2;
            char[] cArr2 = new char[i3];
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, i3);
            java.lang.System.arraycopy(cArr2, 0, cArr, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson, digitizedCardJson11.AlternateContactlessPaymentDataJson);
            java.lang.System.arraycopy(cArr2, digitizedCardJson11.AlternateContactlessPaymentDataJson, cArr, 0, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson);
        }
        if (z) {
            $11 = ($10 + 107) % 128;
            char[] cArr3 = new char[i3];
            digitizedCardJson11.DigitizedCardProfile = 0;
            while (digitizedCardJson11.DigitizedCardProfile < i3) {
                cArr3[digitizedCardJson11.DigitizedCardProfile] = cArr[(i3 - digitizedCardJson11.DigitizedCardProfile) - 1];
                java.lang.Object[] objArr5 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myPid() >> 22) + 53, android.view.View.getDefaultSize(0, 0) + 3543, (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
            }
            cArr = cArr3;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x054b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x056a A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void writeReplace(long j, long j2) {
        int i;
        java.lang.Object obj;
        java.lang.Object method;
        java.lang.Object obj2;
        com.payair.hce.createContext createcontext = new com.payair.hce.createContext(j, j2);
        char c = 5;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(r0[5], r0[38], (byte) (-DigitizedCardProfile[531]), objArr);
        java.lang.String str = (java.lang.String) objArr[0];
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        char c2 = 330;
        a((short) 331, (short) 330, (byte) 74, objArr2);
        try {
            java.lang.Object[] objArr3 = {(java.lang.String) objArr2[0]};
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a((short) 316, (short) 330, r0[392], objArr4);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            a((short) 327, (short) 345, r0[15], objArr5);
            java.lang.String str2 = (java.lang.String) objArr5[0];
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            a((short) 316, (short) 330, r0[392], objArr6);
            java.lang.Object[] objArr7 = (java.lang.Object[]) cls.getMethod(str2, java.lang.Class.forName((java.lang.String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i2 = 0;
            while (i2 < objArr7.length) {
                java.lang.Object[] objArr8 = {objArr7[i2]};
                byte[] bArr = DigitizedCardProfile;
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                a((short) 315, (short) 349, bArr[392], objArr9);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                a((short) 325, (short) 365, bArr[c], objArr10);
                java.lang.String str3 = (java.lang.String) objArr10[0];
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                a((short) 316, (short) 330, bArr[392], objArr11);
                java.lang.Object invoke = cls2.getMethod(str3, java.lang.Class.forName((java.lang.String) objArr11[0])).invoke(null, objArr8);
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                a((short) 315, (short) 349, bArr[392], objArr12);
                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr12[0]);
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                a((short) 324, (short) 371, bArr[459], objArr13);
                iArr[i2] = ((java.lang.Integer) cls3.getMethod((java.lang.String) objArr13[0], null).invoke(invoke, null)).intValue();
                i2++;
                c = 5;
            }
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                try {
                } catch (java.lang.Throwable th) {
                    th = th;
                    if (i4 < 27) {
                    }
                    if (i4 >= 92) {
                    }
                    throw th;
                }
                switch (createcontext.DigitizedCardProfile(iArr[i3])) {
                    case -41:
                        i3 = 94;
                    case -40:
                        createcontext.DigitizedCardProfile(36);
                        int i5 = createcontext.values;
                        i3 = (i5 == 0 || i5 != 1) ? 91 : 57;
                        c2 = 330;
                    case -39:
                        i3 = 95;
                        c2 = 330;
                    case -38:
                        i3 = 97;
                        c2 = 330;
                    case -37:
                        createcontext.DigitizedCardProfile(28);
                        if (createcontext.values == 0) {
                            i3 = 89;
                            c2 = 330;
                        }
                        i3 = i4;
                        c2 = 330;
                    case -36:
                        i3 = 27;
                    case -35:
                        i3 = 79;
                        c2 = 330;
                    case -34:
                        createcontext.DigitizedCardProfile(28);
                        if (createcontext.values == 0) {
                            i3 = 78;
                            c2 = 330;
                        }
                        i3 = i4;
                        c2 = 330;
                    case -33:
                        i3 = 1;
                    case -32:
                        i3 = 68;
                        c2 = 330;
                    case -31:
                        createcontext.DigitizedCardProfile(28);
                        if (createcontext.values == 0) {
                            i3 = 67;
                            c2 = 330;
                        }
                        i3 = i4;
                        c2 = 330;
                    case -30:
                        createcontext.DigitizedCardProfile = 1;
                        try {
                            createcontext.DigitizedCardProfile(5);
                            createcontext.DigitizedCardProfile(6);
                            AlternateContactlessPaymentDataJson = createcontext.values;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            if ((i4 < 27 && i4 <= 43) || (i4 >= 43 && i4 <= 52)) {
                                i4 = 17;
                            } else {
                                if (i4 >= 92 || i4 > 94) {
                                    throw th;
                                }
                                i4 = 90;
                            }
                            createcontext.IccPrivateKeyCrtComponentsJson = th;
                            createcontext.DigitizedCardProfile(37);
                            i3 = i4;
                            c2 = 330;
                        }
                        i3 = i4;
                        c2 = 330;
                        break;
                    case -29:
                        i = writeReplace;
                        createcontext.DigitizedCardProfile = i;
                        createcontext.DigitizedCardProfile(3);
                        i3 = i4;
                        c2 = 330;
                    case -28:
                        return;
                    case -27:
                        i3 = 59;
                        c2 = 330;
                    case -26:
                        i3 = 80;
                        c2 = 330;
                    case -25:
                        byte b = $$a[23];
                        byte b2 = (byte) (b - 1);
                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                        c(b2, (byte) (b2 | 32), b, objArr14);
                        obj = (java.lang.String) objArr14[0];
                        createcontext.IccPrivateKeyCrtComponentsJson = obj;
                        createcontext.DigitizedCardProfile(1);
                        i3 = i4;
                        c2 = 330;
                    case -24:
                        createcontext.DigitizedCardProfile = 1;
                        createcontext.DigitizedCardProfile(5);
                        createcontext.DigitizedCardProfile(8);
                        obj = java.lang.Class.forName((java.lang.String) createcontext.RecordsJson);
                        createcontext.IccPrivateKeyCrtComponentsJson = obj;
                        createcontext.DigitizedCardProfile(1);
                        i3 = i4;
                        c2 = 330;
                    case -23:
                        byte[] bArr2 = $$a;
                        byte b3 = bArr2[23];
                        byte b4 = bArr2[34];
                        java.lang.Object[] objArr15 = new java.lang.Object[1];
                        c(b3, b4, (byte) (b4 + 1), objArr15);
                        obj = (java.lang.String) objArr15[0];
                        createcontext.IccPrivateKeyCrtComponentsJson = obj;
                        createcontext.DigitizedCardProfile(1);
                        i3 = i4;
                        c2 = 330;
                    case -22:
                        createcontext.DigitizedCardProfile = 3;
                        createcontext.DigitizedCardProfile(5);
                        createcontext.DigitizedCardProfile(8);
                        java.lang.Object obj3 = createcontext.RecordsJson;
                        createcontext.DigitizedCardProfile(8);
                        java.lang.Object obj4 = createcontext.RecordsJson;
                        createcontext.DigitizedCardProfile(8);
                        try {
                            java.lang.Object[] objArr16 = {obj4, createcontext.RecordsJson};
                            byte[] bArr3 = DigitizedCardProfile;
                            java.lang.Object[] objArr17 = new java.lang.Object[1];
                            a((short) 308, (short) 517, bArr3[392], objArr17);
                            java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr17[0]);
                            java.lang.Object[] objArr18 = new java.lang.Object[1];
                            a((short) 326, (short) 540, bArr3[459], objArr18);
                            java.lang.String str4 = (java.lang.String) objArr18[0];
                            java.lang.Object[] objArr19 = new java.lang.Object[1];
                            a((short) 316, (short) 502, bArr3[392], objArr19);
                            java.lang.Object[] objArr20 = new java.lang.Object[1];
                            a((short) 313, (short) 545, com.google.common.base.Ascii.ESC, objArr20);
                            obj = cls4.getMethod(str4, java.lang.Class.forName((java.lang.String) objArr19[0]), java.lang.Class.forName((java.lang.String) objArr20[0])).invoke(obj3, objArr16);
                            createcontext.IccPrivateKeyCrtComponentsJson = obj;
                            createcontext.DigitizedCardProfile(1);
                            i3 = i4;
                            c2 = 330;
                        } catch (java.lang.Throwable th3) {
                            java.lang.Throwable cause = th3.getCause();
                            if (cause == null) {
                                throw th3;
                            }
                            throw cause;
                        }
                    case -21:
                        createcontext.DigitizedCardProfile = 3;
                        createcontext.DigitizedCardProfile(5);
                        createcontext.DigitizedCardProfile(8);
                        java.lang.Class cls5 = (java.lang.Class) createcontext.RecordsJson;
                        createcontext.DigitizedCardProfile(8);
                        java.lang.String str5 = (java.lang.String) createcontext.RecordsJson;
                        createcontext.DigitizedCardProfile(8);
                        method = cls5.getMethod(str5, (java.lang.Class[]) createcontext.RecordsJson);
                        createcontext.IccPrivateKeyCrtComponentsJson = method;
                        createcontext.DigitizedCardProfile(1);
                        i3 = i4;
                        c2 = 330;
                    case -20:
                        java.lang.Object[] objArr21 = new java.lang.Object[1];
                        a((short) 316, (short) 330, DigitizedCardProfile[392], objArr21);
                        method = java.lang.Class.forName((java.lang.String) objArr21[0]);
                        createcontext.IccPrivateKeyCrtComponentsJson = method;
                        createcontext.DigitizedCardProfile(1);
                        i3 = i4;
                        c2 = 330;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                        createcontext.DigitizedCardProfile = 1;
                        createcontext.DigitizedCardProfile(5);
                        createcontext.DigitizedCardProfile(6);
                        createcontext.IccPrivateKeyCrtComponentsJson = new java.lang.Class[createcontext.values];
                        createcontext.DigitizedCardProfile(1);
                        i3 = i4;
                        c2 = 330;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        obj2 = "writeReplace";
                        createcontext.IccPrivateKeyCrtComponentsJson = obj2;
                        createcontext.DigitizedCardProfile(1);
                        i3 = i4;
                        c2 = 330;
                    case -17:
                        obj2 = com.payair.hce.setLongClickable.class;
                        createcontext.IccPrivateKeyCrtComponentsJson = obj2;
                        createcontext.DigitizedCardProfile(1);
                        i3 = i4;
                        c2 = 330;
                    case -16:
                        createcontext.DigitizedCardProfile = 1;
                        createcontext.DigitizedCardProfile(5);
                        createcontext.DigitizedCardProfile(6);
                        int i6 = createcontext.values;
                        java.lang.Object[] objArr22 = new java.lang.Object[1];
                        a((short) 316, (short) 502, DigitizedCardProfile[392], objArr22);
                        obj2 = java.lang.reflect.Array.newInstance(java.lang.Class.forName((java.lang.String) objArr22[0]), i6);
                        createcontext.IccPrivateKeyCrtComponentsJson = obj2;
                        createcontext.DigitizedCardProfile(1);
                        i3 = i4;
                        c2 = 330;
                    case -15:
                        createcontext.DigitizedCardProfile(13);
                        throw ((java.lang.Throwable) createcontext.RecordsJson);
                    case -14:
                        i3 = 25;
                        c2 = 330;
                    case -13:
                        i3 = 23;
                        c2 = 330;
                    case -12:
                        try {
                            createcontext.DigitizedCardProfile(12);
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            if (i4 < 27) {
                            }
                            if (i4 >= 92) {
                            }
                            throw th;
                        }
                        if (createcontext.values == 0) {
                            i3 = 22;
                            c2 = 330;
                        }
                        i3 = i4;
                        c2 = 330;
                        break;
                    case -11:
                        try {
                            createcontext.DigitizedCardProfile = 1;
                            createcontext.DigitizedCardProfile(5);
                            createcontext.DigitizedCardProfile(8);
                            java.lang.Object obj5 = createcontext.RecordsJson;
                            try {
                                byte[] bArr4 = DigitizedCardProfile;
                                java.lang.Object[] objArr23 = new java.lang.Object[1];
                                a((short) 313, (short) 477, bArr4[392], objArr23);
                                java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr23[0]);
                                java.lang.Object[] objArr24 = new java.lang.Object[1];
                                a((short) 324, (short) 495, (byte) (-bArr4[34]), objArr24);
                                try {
                                    obj2 = cls6.getMethod((java.lang.String) objArr24[0], null).invoke(obj5, null);
                                    createcontext.IccPrivateKeyCrtComponentsJson = obj2;
                                    createcontext.DigitizedCardProfile(1);
                                } catch (java.lang.Throwable th5) {
                                    th = th5;
                                    java.lang.Throwable cause2 = th.getCause();
                                    if (cause2 == null) {
                                        throw th;
                                    }
                                    throw cause2;
                                }
                            } catch (java.lang.Throwable th6) {
                                th = th6;
                            }
                        } catch (java.lang.Throwable th7) {
                            th = th7;
                            if (i4 < 27) {
                            }
                            if (i4 >= 92) {
                            }
                            throw th;
                        }
                        i3 = i4;
                        c2 = 330;
                        break;
                    case -10:
                        i3 = 69;
                        c2 = 330;
                    case -9:
                        createcontext.DigitizedCardProfile = 1;
                        createcontext.DigitizedCardProfile(5);
                        createcontext.DigitizedCardProfile(8);
                        java.lang.Object obj6 = createcontext.RecordsJson;
                        try {
                            byte[] bArr5 = DigitizedCardProfile;
                            java.lang.Object[] objArr25 = new java.lang.Object[1];
                            a((short) 316, (short) 330, bArr5[392], objArr25);
                            java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr25[0]);
                            java.lang.Object[] objArr26 = new java.lang.Object[1];
                            a((short) 326, (short) 472, bArr5[459], objArr26);
                            obj = cls7.getMethod((java.lang.String) objArr26[0], null).invoke(obj6, null);
                            createcontext.IccPrivateKeyCrtComponentsJson = obj;
                            createcontext.DigitizedCardProfile(1);
                            i3 = i4;
                            c2 = 330;
                        } catch (java.lang.Throwable th8) {
                            java.lang.Throwable cause3 = th8.getCause();
                            if (cause3 == null) {
                                throw th8;
                            }
                            throw cause3;
                        }
                    case -8:
                        createcontext.DigitizedCardProfile = 5;
                        createcontext.DigitizedCardProfile(5);
                        createcontext.DigitizedCardProfile(6);
                        boolean z = createcontext.values != 0;
                        createcontext.DigitizedCardProfile(8);
                        java.lang.String str6 = (java.lang.String) createcontext.RecordsJson;
                        createcontext.DigitizedCardProfile(6);
                        int i7 = createcontext.values;
                        createcontext.DigitizedCardProfile(6);
                        int i8 = createcontext.values;
                        createcontext.DigitizedCardProfile(6);
                        java.lang.Object[] objArr27 = new java.lang.Object[1];
                        b(z, str6, i7, i8, createcontext.values, objArr27);
                        obj = (java.lang.String) objArr27[0];
                        createcontext.IccPrivateKeyCrtComponentsJson = obj;
                        createcontext.DigitizedCardProfile(1);
                        i3 = i4;
                        c2 = 330;
                    case -7:
                        createcontext.DigitizedCardProfile = 2;
                        createcontext.DigitizedCardProfile(5);
                        createcontext.DigitizedCardProfile(6);
                        int i9 = createcontext.values;
                        createcontext.DigitizedCardProfile(6);
                        try {
                            java.lang.Object[] objArr28 = {java.lang.Integer.valueOf(i9), java.lang.Integer.valueOf(createcontext.values)};
                            int i10 = values;
                            java.lang.Object[] objArr29 = new java.lang.Object[1];
                            a((short) (i10 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE), (short) 430, (byte) (-DigitizedCardProfile[397]), objArr29);
                            java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr29[0]);
                            java.lang.Object[] objArr30 = new java.lang.Object[1];
                            a((short) (i10 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE), (short) 458, r12[506], objArr30);
                            i = ((java.lang.Integer) cls8.getMethod((java.lang.String) objArr30[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr28)).intValue();
                            createcontext.DigitizedCardProfile = i;
                            createcontext.DigitizedCardProfile(3);
                            i3 = i4;
                            c2 = 330;
                        } catch (java.lang.Throwable th9) {
                            java.lang.Throwable cause4 = th9.getCause();
                            if (cause4 == null) {
                                throw th9;
                            }
                            throw cause4;
                        }
                    case -6:
                        createcontext.DigitizedCardProfile = 1;
                        createcontext.DigitizedCardProfile(5);
                        createcontext.DigitizedCardProfile(8);
                        try {
                            java.lang.Object[] objArr31 = {createcontext.RecordsJson};
                            byte[] bArr6 = DigitizedCardProfile;
                            java.lang.Object[] objArr32 = new java.lang.Object[1];
                            a((short) 314, (short) 401, (byte) (-bArr6[397]), objArr32);
                            java.lang.Class<?> cls9 = java.lang.Class.forName((java.lang.String) objArr32[0]);
                            java.lang.Object[] objArr33 = new java.lang.Object[1];
                            a((short) (values | 282), (short) 418, (byte) (-bArr6[34]), objArr33);
                            java.lang.String str7 = (java.lang.String) objArr33[0];
                            java.lang.Object[] objArr34 = new java.lang.Object[1];
                            a((short) 316, (short) 330, bArr6[392], objArr34);
                            i = ((java.lang.Integer) cls9.getMethod(str7, java.lang.Class.forName((java.lang.String) objArr34[0])).invoke(null, objArr31)).intValue();
                            createcontext.DigitizedCardProfile = i;
                            createcontext.DigitizedCardProfile(3);
                            i3 = i4;
                            c2 = 330;
                        } catch (java.lang.Throwable th10) {
                            java.lang.Throwable cause5 = th10.getCause();
                            if (cause5 == null) {
                                throw th10;
                            }
                            throw cause5;
                        }
                    case -5:
                        obj = "";
                        createcontext.IccPrivateKeyCrtComponentsJson = obj;
                        createcontext.DigitizedCardProfile(1);
                        i3 = i4;
                        c2 = 330;
                    case -4:
                        createcontext.DigitizedCardProfile = 3;
                        createcontext.DigitizedCardProfile(5);
                        createcontext.DigitizedCardProfile(6);
                        int i11 = createcontext.values;
                        createcontext.DigitizedCardProfile(6);
                        int i12 = createcontext.values;
                        createcontext.DigitizedCardProfile(6);
                        try {
                            java.lang.Object[] objArr35 = {java.lang.Integer.valueOf(i11), java.lang.Integer.valueOf(i12), java.lang.Integer.valueOf(createcontext.values)};
                            java.lang.Object[] objArr36 = new java.lang.Object[1];
                            a((short) 310, (short) 378, (byte) (-DigitizedCardProfile[397]), objArr36);
                            java.lang.Class<?> cls10 = java.lang.Class.forName((java.lang.String) objArr36[0]);
                            java.lang.Object[] objArr37 = new java.lang.Object[1];
                            a((short) 329, (short) 399, r0[25], objArr37);
                            i = ((java.lang.Integer) cls10.getMethod((java.lang.String) objArr37[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr35)).intValue();
                            createcontext.DigitizedCardProfile = i;
                            createcontext.DigitizedCardProfile(3);
                            i3 = i4;
                            c2 = 330;
                        } catch (java.lang.Throwable th11) {
                            java.lang.Throwable cause6 = th11.getCause();
                            if (cause6 == null) {
                                throw th11;
                            }
                            throw cause6;
                        }
                    case -3:
                        createcontext.DigitizedCardProfile = -16777084;
                        createcontext.DigitizedCardProfile(3);
                        i3 = i4;
                        c2 = 330;
                    case -2:
                        createcontext.IccPrivateKeyCrtComponentsJson = "�\u0000\u0003";
                        createcontext.DigitizedCardProfile(1);
                        i3 = i4;
                        c2 = 330;
                    case -1:
                        i3 = 52;
                    default:
                        i3 = i4;
                        c2 = 330;
                }
            }
            throw th;
        } catch (java.lang.Throwable th12) {
            java.lang.Throwable cause7 = th12.getCause();
            if (cause7 == null) {
                throw th12;
            }
            throw cause7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, short s2, byte b, java.lang.Object[] objArr) {
        int i;
        int i2 = 118 - b;
        int i3 = s2 + 4;
        byte[] bArr = DigitizedCardProfile;
        byte[] bArr2 = new byte[332 - s];
        int i4 = 331 - s;
        if (bArr == null) {
            int i5 = i4;
            int i6 = i3;
            int i7 = 0;
            int i8 = (i5 + (-i3)) - 5;
            i = i7;
            int i9 = i6;
            i2 = i8;
            i3 = i9;
            bArr2[i] = (byte) i2;
            int i10 = i3 + 1;
            i7 = i + 1;
            if (i == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i11 = i2;
            i6 = i10;
            i3 = bArr[i10];
            i5 = i11;
            int i82 = (i5 + (-i3)) - 5;
            i = i7;
            int i92 = i6;
            i2 = i82;
            i3 = i92;
            bArr2[i] = (byte) i2;
            int i102 = i3 + 1;
            i7 = i + 1;
            if (i == i4) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i2;
            int i1022 = i3 + 1;
            i7 = i + 1;
            if (i == i4) {
            }
        }
    }

    static void AlternateContactlessPaymentDataJson() {
        byte[] bArr = new byte[com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION];
        java.lang.System.arraycopy("'lþ]÷\u0000õ\u0001úö\u0001úõ\u0002ó\u0003õ\u0001úô\u0003ð\u0006úó\u0004úò\u0005î\bõ\u0001úñ\u0006öüÿúð\u0007úï\bú÷üÿöû\u0000ú÷û\u0000öû\u0000ú÷ú\u0001ú÷ù\u0002ú÷ø\u0003öø\u0003ú÷÷\u0004ö÷\u0004ú÷÷\u0004öö\u0005ú÷ö\u0005öõ\u0006öô\u0007ú÷õ\u0006ú÷ô\u0007öö\u0005ú÷ó\böû\u0000õ\u0001úöýÿöó\búöü\u0000õýÿúöû\u0001ö÷\u0004úöú\u0002úöù\u0003úöø\u0004õü\u0000úöü\u0000õû\u0001úöû\u0001ö÷\u0004úö÷\u0005õú\u0002õú\u0002õù\u0003ö÷\u0004úöö\u0006õø\u0004úöõ\u0007úöô\bõ÷\u0005õö\u0006úõþÿõú\u0002õù\u0003úõý\u0000úõü\u0001úõû\u0002úõû\u0002úöô\bõô\bôþÿôý\u0000õù\u0003úõþÿôü\u0001úõú\u0003úõù\u0004úõø\u0005úõø\u0005úöô\bôû\u0002ôú\u0003ôý\u0000õù\u0003úõþÿôü\u0001úõ÷\u0006úõö\u0007úõõ\bú÷÷\u0004õø\u0004ôù\u0004úöõ\u0007úôÿÿöö\u0005úôþ\u0000õ\u0001úôþ\u0004æ\u0010.½\u0006î\u00024ÖÚý\u0004ö\u0002þÿþð\u0004æ\u0010.½\u0006î\u00024àÖõ\nùýî\u0010ðò\u000b\u0011äöõ\u0019ððò\u000bî\u0005íþ\u0001\u00001Âð\fì\u0003ú\u0001ë@æÏþøø\u0006\u0000î\u0005íþ\u0001\u00001º÷@ÙÙþ\u0007ùíûýì(Ù\u0000\u0019Òø\u001fèï\u0003î\u0005íþ\u0001\u00001³\bÿéDÓèÿéNÒãÿéùþ\b\rÞ\u0006ý\u0007ñ\u0001\u0013ãÿéùþ\b\rÞ\u0006ýöõ\nîÿ\u0004æ\u0010.½\u0006î\u00024Õçñþó\u0011úñ\u0002ýì,Ýçý\t\u0004æ\u0010.½\u0006î\u00024Úèó\u0000ýê\u0004æ\u0010.½\u0006î\u00024·\búõ\u0002ýêAÜãì\u0007ô\u0006öó\u0002ÿ\u0001\nÝ\u0004æ\u0010.½\u0006î\u00024Úèó\u0000ýê4".getBytes("ISO-8859-1"), 0, bArr, 0, com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION);
        DigitizedCardProfile = bArr;
        values = 37;
    }

    static void init$1() {
        $$d = new byte[]{com.google.common.base.Ascii.SYN, -105, 0, 34};
        $$e = 192;
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        AlternateContactlessPaymentDataJson();
        AlternateContactlessPaymentDataJson = 0;
        writeReplace = 1;
        valueOf = 1889207086;
    }

    static void init$0() {
        $$a = new byte[]{88, -59, 41, 44, -12, 2, 63, -66, com.google.common.base.Ascii.SI, -24, com.google.common.base.Ascii.CAN, -8, -9, 68, -58, 5, -2, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -69, 14, -15, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -44, 1, -6, com.google.common.base.Ascii.SI, -19, 4, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -41, 3, 6, -8, 10, -1, -10, 7, com.google.common.base.Ascii.NAK, -11, -9, 16, com.google.common.base.Ascii.SYN, -23};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE;
    }
}
