package com.mastercard.mpsdk.card.profile;

/* loaded from: classes9.dex */
public class SdkCoreBusinessLogicModuleImpl implements com.payair.hce.checkUriPermission, java.io.Serializable {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 0;
    private static short[] AlternateContactlessPaymentDataJson = null;
    private static byte[] DigitizedCardProfile = null;
    private static int RecordsJson = 0;
    private static int getAid = 0;
    private static final long serialVersionUID = -7744717035825104054L;
    private static int valueOf;
    private static int values;
    private static int writeReplace;
    private byte[] applicationLifeCycleData;
    private byte[] cardLayoutDescription;
    private java.lang.String[] cardholderValidators;
    private int cvmResetTimeout;
    private int dualTapResetTimeout;
    private com.payair.hce.enforceCallingUriPermission magstripeCvmIssuerOptions;
    private com.payair.hce.createPackageContext mchipCvmIssuerOptions;
    private byte[] securityWord;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(byte b, short s, short s2, java.lang.Object[] objArr) {
        int i;
        int i2 = s + 65;
        byte[] bArr = $$a;
        int i3 = b + 4;
        char[] cArr = new char[35 - s2];
        int i4 = 34 - s2;
        if (bArr == null) {
            int i5 = i3;
            int i6 = i4;
            int i7 = 0;
            int i8 = (i3 + (-i6)) - 2;
            i = i7;
            int i9 = i5;
            i2 = i8;
            i3 = i9;
            cArr[i] = (char) i2;
            i7 = i + 1;
            int i10 = i3 + 1;
            if (i == i4) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            i6 = bArr[i10];
            int i11 = i2;
            i5 = i10;
            i3 = i11;
            int i82 = (i3 + (-i6)) - 2;
            i = i7;
            int i92 = i5;
            i2 = i82;
            i3 = i92;
            cArr[i] = (char) i2;
            i7 = i + 1;
            int i102 = i3 + 1;
            if (i == i4) {
            }
        } else {
            i = 0;
            cArr[i] = (char) i2;
            i7 = i + 1;
            int i1022 = i3 + 1;
            if (i == i4) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(byte b, short s, short s2, java.lang.Object[] objArr) {
        int i;
        int i2 = s2 + 4;
        byte[] bArr = $$d;
        int i3 = (s * 3) + 104;
        int i4 = b * 4;
        byte[] bArr2 = new byte[1 - i4];
        if (bArr == null) {
            int i5 = i2;
            int i6 = 0;
            i3 = (-i3) + i2;
            i2 = i5;
            i = i6;
            int i7 = i2 + 1;
            bArr2[i] = (byte) i3;
            if (i == 0 - i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            byte b2 = bArr[i7];
            i2 = i3;
            i3 = b2;
            i6 = i + 1;
            i5 = i7;
            i3 = (-i3) + i2;
            i2 = i5;
            i = i6;
            int i72 = i2 + 1;
            bArr2[i] = (byte) i3;
            if (i == 0 - i4) {
            }
        } else {
            i = 0;
            int i722 = i2 + 1;
            bArr2[i] = (byte) i3;
            if (i == 0 - i4) {
            }
        }
    }

    public SdkCoreBusinessLogicModuleImpl(com.payair.hce.checkUriPermission checkuripermission) {
        this.cvmResetTimeout = checkuripermission.getCvmResetTimeout();
        this.dualTapResetTimeout = checkuripermission.getDualTapResetTimeout();
        byte[] applicationLifeCycleData = checkuripermission.getApplicationLifeCycleData();
        if (applicationLifeCycleData != null) {
            this.applicationLifeCycleData = applicationLifeCycleData;
        }
        this.cardLayoutDescription = checkuripermission.getCardLayoutDescription();
        this.securityWord = checkuripermission.getSecurityWord();
        this.cardholderValidators = checkuripermission.getCardholderValidators();
        this.mchipCvmIssuerOptions = new com.mastercard.mpsdk.card.profile.SdkCoreMChipCvmIssuerOptionsImpl(checkuripermission.getMchipCvmIssuerOptions());
        this.magstripeCvmIssuerOptions = new com.mastercard.mpsdk.card.profile.SdkCoreMagstripeCvmIssuerOptionsImpl(checkuripermission.getMagstripeCvmIssuerOptions());
    }

    @Override // com.payair.hce.checkUriPermission
    public int getCvmResetTimeout() {
        int i = (getAid + 53) % 128;
        RecordsJson = i;
        int i2 = this.cvmResetTimeout;
        int i3 = i + 57;
        getAid = i3 % 128;
        if (i3 % 2 == 0) {
            return i2;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.checkUriPermission
    public int getDualTapResetTimeout() {
        int i = getAid + 57;
        RecordsJson = i % 128;
        if (i % 2 != 0) {
            return this.dualTapResetTimeout;
        }
        throw null;
    }

    @Override // com.payair.hce.checkUriPermission
    public byte[] getApplicationLifeCycleData() {
        int i = getAid + 119;
        RecordsJson = i % 128;
        if (i % 2 != 0) {
            return this.applicationLifeCycleData;
        }
        throw null;
    }

    @Override // com.payair.hce.checkUriPermission
    public byte[] getCardLayoutDescription() {
        int i = RecordsJson + 89;
        getAid = i % 128;
        byte[] bArr = this.cardLayoutDescription;
        if (i % 2 == 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.checkUriPermission
    public byte[] getSecurityWord() {
        int i = RecordsJson;
        int i2 = i + 121;
        getAid = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        byte[] bArr = this.securityWord;
        int i3 = i + 75;
        getAid = i3 % 128;
        if (i3 % 2 == 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.checkUriPermission
    public java.lang.String[] getCardholderValidators() {
        int i = getAid + 7;
        RecordsJson = i % 128;
        if (i % 2 != 0) {
            return this.cardholderValidators;
        }
        throw null;
    }

    @Override // com.payair.hce.checkUriPermission
    public com.payair.hce.createPackageContext getMchipCvmIssuerOptions() {
        int i = getAid + 53;
        RecordsJson = i % 128;
        com.payair.hce.createPackageContext createpackagecontext = this.mchipCvmIssuerOptions;
        if (i % 2 != 0) {
            return createpackagecontext;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.checkUriPermission
    public com.payair.hce.enforceCallingUriPermission getMagstripeCvmIssuerOptions() {
        int i = (getAid + 11) % 128;
        RecordsJson = i;
        com.payair.hce.enforceCallingUriPermission enforcecallinguripermission = this.magstripeCvmIssuerOptions;
        int i2 = i + 73;
        getAid = i2 % 128;
        if (i2 % 2 == 0) {
            return enforcecallinguripermission;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0202, code lost:
    
        if (r12 != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x021e, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0216, code lost:
    
        com.mastercard.mpsdk.card.profile.SdkCoreBusinessLogicModuleImpl.$11 = (r3 + 115) % 128;
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0214, code lost:
    
        if (r12 != false) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, int i3, byte b, short s, java.lang.Object[] objArr) {
        int i4;
        int i5;
        int i6;
        com.payair.hce.getTrack2ConstructionData gettrack2constructiondata = new com.payair.hce.getTrack2ConstructionData();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i7 = 2;
        try {
            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(writeReplace)};
            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
            if (obj == null) {
                obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 21, 29 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) android.text.TextUtils.indexOf("", "", 0, 0))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj);
            }
            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
            boolean z = intValue == -1;
            if (z) {
                $11 = ($10 + 61) % 128;
                byte[] bArr = DigitizedCardProfile;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i8 = 0;
                    while (i8 < length) {
                        int i9 = $11 + 75;
                        $10 = i9 % 128;
                        if (i9 % i7 != 0) {
                            java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(bArr[i8])};
                            java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609478628);
                            if (obj2 == null) {
                                obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "") + 31, 5088 - android.view.View.resolveSizeAndState(0, 0, 0), (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16))).getMethod("e", java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609478628, obj2);
                            }
                            bArr2[i8] = ((java.lang.Byte) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).byteValue();
                        } else {
                            java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(bArr[i8])};
                            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609478628);
                            if (obj3 == null) {
                                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getCapsMode("", 0, 0) + 31, 5087 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.view.ViewConfiguration.getTouchSlop() >> 8))).getMethod("e", java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609478628, obj3);
                            }
                            bArr2[i8] = ((java.lang.Byte) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).byteValue();
                            i8++;
                        }
                        i7 = 2;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = DigitizedCardProfile;
                    java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(values)};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                    if (obj4 == null) {
                        obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 27, (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 28, (char) android.view.View.getDefaultSize(0, 0))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj4);
                    }
                    intValue = (byte) (((byte) (bArr3[((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr5)).intValue()] ^ (-4897270311952305750L))) + ((int) (writeReplace ^ (-4897270311952305750L))));
                } else {
                    intValue = (short) (((short) (AlternateContactlessPaymentDataJson[i2 + ((int) (values ^ (-4897270311952305750L)))] ^ (-4897270311952305750L))) + ((int) (writeReplace ^ (-4897270311952305750L))));
                }
            }
            if (intValue > 0) {
                int i10 = $10;
                int i11 = i10 + 119;
                $11 = i11 % 128;
                if (i11 % 2 == 0) {
                    i4 = ((i2 * intValue) - 4) >> ((int) (values / (-4897270311952305750L)));
                } else {
                    i4 = ((i2 + intValue) - 2) + ((int) (values ^ (-4897270311952305750L)));
                }
                gettrack2constructiondata.writeReplace = i4 + i5;
                java.lang.Object[] objArr6 = {gettrack2constructiondata, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(valueOf), sb};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-500696024);
                if (obj5 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.os.Process.myPid() >> 22), 2364 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    c((byte) 0, (short) 0, (short) -1, objArr7);
                    obj5 = cls.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-500696024, obj5);
                }
                ((java.lang.StringBuilder) ((java.lang.reflect.Method) obj5).invoke(null, objArr6)).append(gettrack2constructiondata.values);
                gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                byte[] bArr4 = DigitizedCardProfile;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i12 = 0; i12 < length2; i12++) {
                        bArr5[i12] = (byte) (bArr4[i12] ^ (-4897270311952305750L));
                    }
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                gettrack2constructiondata.DigitizedCardProfile = 1;
                while (gettrack2constructiondata.DigitizedCardProfile < intValue) {
                    if (z2) {
                        int i13 = $10 + 51;
                        $11 = i13 % 128;
                        if (i13 % 2 == 0) {
                            byte[] bArr6 = DigitizedCardProfile;
                            gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace;
                            i6 = gettrack2constructiondata.AlternateContactlessPaymentDataJson - (((byte) (((byte) (bArr6[r7] ^ (-4897270311952305750L))) / s)) ^ b);
                        } else {
                            byte[] bArr7 = DigitizedCardProfile;
                            gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                            i6 = gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((byte) (((byte) (bArr7[r7] ^ (-4897270311952305750L))) + s)) ^ b);
                        }
                        gettrack2constructiondata.values = (char) i6;
                    } else {
                        short[] sArr = AlternateContactlessPaymentDataJson;
                        gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                        gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((short) (((short) (sArr[r7] ^ (-4897270311952305750L))) + s)) ^ b));
                    }
                    sb.append(gettrack2constructiondata.values);
                    gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                    gettrack2constructiondata.DigitizedCardProfile++;
                }
            }
            java.lang.String obj6 = sb.toString();
            int i14 = $10 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
            $11 = i14 % 128;
            if (i14 % 2 == 0) {
                throw null;
            }
            objArr[0] = obj6;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        getAid = 0;
        RecordsJson = 1;
        values = 167984989;
        writeReplace = 520368630;
        valueOf = 1278447699;
        DigitizedCardProfile = new byte[]{10, -21, 9, -100, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -6, -19, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, -100, -127, 9, -100, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -102, -51, com.visa.cbp.getEncExpo.startTransaction, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, 48, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -124, com.google.common.base.Ascii.FF, -123, -33, -20, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -119, -107, -46, -29, -63, -22, -18, -21, -24, -44, 37, -101, -59, -22, -85, 122, -113, 5, 97, -88, Byte.MAX_VALUE, 93, com.visa.cbp.getEncExpo.IResultReceiver2, 100, 103, 102, -94, -79, 93, 99, 103, -20, 36, -88, -85, 115, -88, 97, 86, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, com.google.common.base.Ascii.DC4, 101, 100, 103, 80, 120, 87, -50, -60, -79, -60, Byte.MIN_VALUE, 63, -72, -120, 101, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, -75, 115, -115, 98, -76, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 78, -72, -120, -74, 115, 116, -54, 122, -118, 124, 117, -89, -122, 102, 73, -36, -83, 84, -35, 87, -59, -70, -48, 84, com.visa.cbp.getEncExpo.registerForActivityResult, com.google.common.base.Ascii.SYN, -48, -86, -86, -86, -86, -86, -86, -86};
    }

    static void init$1() {
        $$d = new byte[]{94, 87, -25, Byte.MAX_VALUE};
        $$e = 115;
    }

    static void init$0() {
        $$a = new byte[]{39, 89, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 10, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1, 19, -13, -11, 14, com.visa.cbp.getEncExpo.onUnminimized};
        $$b = 109;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0448, code lost:
    
        if (r0.contains(r6.getField((java.lang.String) r13[0]).get(null)) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0686, code lost:
    
        if (((r0 & ((((((~((-67385383) | r5)) | r6) * 1150) - 334238508) + (((~((-1369841029) | r28)) | (~(1369841028 | r5))) * (-575))) + (((~((-67385383) | r28)) | (~(67385382 | r5))) * 575))) | (((int) r3) & ((((((~((-405445057) | r5)) | (-1031781354)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) - 479805231) + (((~(r5 | (-1013627842))) | (-423598569)) * (-440))) + (((-405445057) | r28) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE)))) == 1) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x077e, code lost:
    
        com.mastercard.mpsdk.card.profile.SdkCoreBusinessLogicModuleImpl.getAid = (com.mastercard.mpsdk.card.profile.SdkCoreBusinessLogicModuleImpl.RecordsJson + 79) % 128;
        r0 = new java.lang.Object[]{new int[]{r28}, new int[]{r28 ^ 10}, null, new int[1]};
        r3 = ~r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x07a0, code lost:
    
        r5 = new java.lang.Object[]{java.lang.Integer.valueOf(r29), 16, java.lang.Integer.valueOf((((((~(r3 | (-328669866))) | 328276608) * 98) + 1931979045) + ((((~(r3 | (-676259120))) | (-328669866)) | (~(676259119 | r28))) * (-49))) + (((~(r28 | (-328669866))) | (-1004535728)) * 49))};
        r1 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x07e6, code lost:
    
        if (r1 != null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x07e8, code lost:
    
        r1 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1)) + 49, 2713 - android.widget.ExpandableListView.getPackedPositionGroup(0), (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0));
        r3 = r9[14];
        r4 = (short) (r3 + 1);
        r7 = new java.lang.Object[1];
        a(r3, r4, (byte) r4, r7);
        r1 = r1.getMethod((java.lang.String) r7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x083d, code lost:
    
        ((int[]) r0[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) r1).invoke(null, r5)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0845, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x077c, code lost:
    
        if (r0.equals(((java.lang.String) r11[0]).intern()) != false) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v3, types: [int] */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v9 */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r5v27, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] writeReplace(android.content.Context context, int i, int i2) {
        ?? indexOf;
        java.lang.Object[] objArr;
        try {
            if (context == null) {
                java.lang.Object[] objArr2 = {new int[]{i}, new int[]{i}, null, new int[1]};
                int i3 = ~i;
                java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((~(i | (-920600828))) | (~((-84328158) | i3)) | (~(i3 | 920600827))) * 959) + 694736560 + (((~(i | (-84328158))) | (~(i3 | (-920600828))) | (~(920600827 | i))) * 959))};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 50, (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 2713, (char) (android.view.MotionEvent.axisFromString("") + 1));
                    byte b = $$a[14];
                    short s = (short) (b + 1);
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    a(b, s, (byte) s, objArr4);
                    obj = cls.getMethod((java.lang.String) objArr4[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj);
                }
                ((int[]) objArr2[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr3)).intValue();
                return objArr2;
            }
            try {
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                b(android.view.View.resolveSizeAndState(0, 0, 0) - 1396154776, (android.view.ViewConfiguration.getTapTimeout() >> 16) - 352784119, android.os.Process.getGidForName("") - 68, (byte) (android.view.Gravity.getAbsoluteGravity(0, 0) - 53), (short) ((-105) - (android.view.ViewConfiguration.getLongPressTimeout() >> 16)), objArr5);
                java.lang.Class<?> cls2 = java.lang.Class.forName(((java.lang.String) objArr5[0]).intern());
                int bitsPerPixel = android.graphics.ImageFormat.getBitsPerPixel(0);
                int green = android.graphics.Color.green(0);
                int resolveOpacity = android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                indexOf = android.text.TextUtils.indexOf("", "", 0, 0);
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                b((-1396154771) - bitsPerPixel, green - 352784097, (-74) - resolveOpacity, (byte) (android.widget.ExpandableListView.getPackedPositionChild(0L) - 96), (short) (33 - indexOf), objArr6);
                java.lang.Object invoke = cls2.getMethod(((java.lang.String) objArr6[0]).intern(), null).invoke(context, null);
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                b(24216 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (-352784081) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (-58) - android.text.TextUtils.getOffsetBefore("", 0), (byte) (30 - android.view.View.combineMeasuredStates(0, 0)), (short) (23 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr7);
                java.lang.Class<?> cls3 = java.lang.Class.forName(((java.lang.String) objArr7[0]).intern());
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                b((android.os.Process.myTid() >> 22) - 1396154771, (-352784046) - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (-87) - android.text.TextUtils.indexOf("", ""), (byte) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 45), (short) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 68), objArr8);
                if ((cls3.getField(((java.lang.String) objArr8[0]).intern()).getInt(invoke) & 2) != 0) {
                    RecordsJson = (getAid + 89) % 128;
                    objArr = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 1}, null, new int[1]};
                    java.lang.Object[] objArr9 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((~((-67764267) | i)) | (~(937164718 | i))) * 69) + 1641773932 + (((~((-102480943) | i)) | 34716676 | (~(902448042 | i))) * (-69)) + 1758605696)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj2 == null) {
                        java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSize(0, 0) + 50, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2713, (char) android.text.TextUtils.getTrimmedLength(""));
                        byte b2 = $$a[14];
                        short s2 = (short) (b2 + 1);
                        java.lang.Object[] objArr10 = new java.lang.Object[1];
                        a(b2, s2, (byte) s2, objArr10);
                        obj2 = cls4.getMethod((java.lang.String) objArr10[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj2);
                    }
                    ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr9)).intValue();
                } else {
                    objArr = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, new int[1]};
                    java.lang.Object[] objArr11 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((((~((-32505858) | (~i))) | (~(972423127 | i))) * (-272)) - 1045641608) + (((~((-569751506) | i)) | 537245648) * (-272)) + (((~(569751505 | i)) | 435177479) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE))};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj3 == null) {
                        java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson('b' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 2713 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) android.view.View.MeasureSpec.getMode(0));
                        byte b3 = $$a[14];
                        short s3 = (short) (b3 + 1);
                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                        a(b3, s3, (byte) s3, objArr12);
                        obj3 = cls5.getMethod((java.lang.String) objArr12[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj3);
                    }
                    ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr11)).intValue();
                }
                if (((int[]) objArr[1])[0] != i) {
                    return objArr;
                }
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2058003131);
                if (obj4 == null) {
                    java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - android.text.TextUtils.indexOf("", "", 0, 0), 1738 - android.graphics.Color.argb(0, 0, 0, 0), (char) (5825 - android.graphics.ImageFormat.getBitsPerPixel(0)));
                    byte b4 = $$a[14];
                    short s4 = (short) (b4 + 1);
                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                    a(b4, s4, (byte) s4, objArr13);
                    obj4 = cls6.getMethod((java.lang.String) objArr13[0], null);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2058003131, obj4);
                }
                java.util.Set set = (java.util.Set) ((java.lang.reflect.Method) obj4).invoke(null, null);
                java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 1739 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (5826 - android.graphics.Color.green(0)));
                byte[] bArr = $$a;
                byte b5 = bArr[14];
                short s5 = (short) (b5 + 1);
                java.lang.Object[] objArr14 = new java.lang.Object[1];
                a(b5, s5, (byte) s5, objArr14);
                if (!set.contains(cls7.getField((java.lang.String) objArr14[0]).get(null))) {
                    int i4 = RecordsJson + 21;
                    getAid = i4 % 128;
                    if (i4 % 2 != 0) {
                        java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionType(0L) + 33, (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1737, (char) (5826 - android.text.TextUtils.indexOf("", "")));
                        byte b6 = bArr[23];
                        java.lang.Object[] objArr15 = new java.lang.Object[1];
                        a(b6, (short) (b6 | com.google.common.base.Ascii.DC4), (short) 29, objArr15);
                        set.contains(cls8.getField((java.lang.String) objArr15[0]).get(null));
                        throw null;
                    }
                    java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), android.text.TextUtils.getOffsetAfter("", 0) + 1738, (char) (android.view.MotionEvent.axisFromString("") + 5827));
                    byte b7 = bArr[23];
                    java.lang.Object[] objArr16 = new java.lang.Object[1];
                    a(b7, (short) (b7 | com.google.common.base.Ascii.DC4), (short) 29, objArr16);
                }
                if (android.os.Build.VERSION.SDK_INT == 30) {
                    java.lang.Object[] objArr17 = {new int[]{i}, new int[]{i}, null, new int[1]};
                    int i5 = ~i;
                    java.lang.Object[] objArr18 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((~((-591705601) | i5)) | (~(1004928887 | i))) * 988) + 1247548572 + (((~(i | (-591705698))) | 97 | (~(i5 | 1004928887))) * 988))};
                    java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj5 == null) {
                        java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.widget.ExpandableListView.getPackedPositionType(0L), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2713, (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                        byte b8 = bArr[14];
                        short s6 = (short) (b8 + 1);
                        java.lang.Object[] objArr19 = new java.lang.Object[1];
                        a(b8, s6, (byte) s6, objArr19);
                        obj5 = cls10.getMethod((java.lang.String) objArr19[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj5);
                    }
                    ((int[]) objArr17[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr18)).intValue();
                    return objArr17;
                }
                try {
                    try {
                        if (android.os.Build.VERSION.SDK_INT > 33) {
                            java.lang.Object[] objArr20 = new java.lang.Object[1];
                            b((android.os.Process.myPid() >> 22) - 1396154826, (-352784043) - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (android.view.ViewConfiguration.getTouchSlop() >> 8) - 64, (byte) (93 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), (short) ((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) - 123), objArr20);
                            try {
                                java.lang.Object[] objArr21 = {((java.lang.String) objArr20[0]).intern()};
                                java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                                if (obj6 == null) {
                                    java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), android.graphics.Color.green(0) + 3161, (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 33098));
                                    java.lang.Object[] objArr22 = new java.lang.Object[1];
                                    a((byte) (bArr[0] - 1), (short) 653, (byte) (bArr[23] + 1), objArr22);
                                    obj6 = cls11.getMethod((java.lang.String) objArr22[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj6);
                                }
                                long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr21)).longValue();
                                long j = i;
                                long j2 = ~j;
                                long j3 = ~longValue;
                                long j4 = j2 | (-402041533);
                                indexOf = 0;
                                long j5 = ((((((-903) * longValue) - 363847587365L) + (((~(j | 402041532)) | (~(j2 | longValue))) * (-1808))) + (((~((j3 | 402041532) | j)) | (~(j4 | longValue))) * 904)) + (((j4 ^ (-1)) | ((~(longValue | 402041532)) | (~(j | j3)))) * 904)) - 935626575;
                                int i6 = (int) (j5 >> 32);
                                int i7 = ~i;
                            } catch (java.lang.Throwable th) {
                                java.lang.Throwable cause = th.getCause();
                                if (cause != null) {
                                    throw cause;
                                }
                                throw th;
                            }
                        } else {
                            indexOf = 0;
                            java.lang.Object[] objArr23 = new java.lang.Object[1];
                            b((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) - 1396154759, (-352784016) - (android.view.KeyEvent.getMaxKeyCode() >> 16), (-79) - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) ((-64) - (android.view.ViewConfiguration.getTapTimeout() >> 16)), (short) ((-61) - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16)), objArr23);
                            try {
                                java.lang.Object[] objArr24 = {((java.lang.String) objArr23[0]).intern()};
                                java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                if (obj7 == null) {
                                    java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getTrimmedLength("") + 40, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1922, (char) android.widget.ExpandableListView.getPackedPositionGroup(0L));
                                    java.lang.Object[] objArr25 = new java.lang.Object[1];
                                    a((byte) (bArr[0] - 1), (short) 653, (byte) (bArr[23] + 1), objArr25);
                                    obj7 = cls12.getMethod((java.lang.String) objArr25[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj7);
                                }
                                java.lang.Object invoke2 = ((java.lang.reflect.Method) obj7).invoke(null, objArr24);
                                java.lang.Object[] objArr26 = new java.lang.Object[1];
                                b(android.text.TextUtils.indexOf("", "", 0, 0) - 1396154824, (-352784003) - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (-91) - android.text.TextUtils.indexOf("", "", 0, 0), (byte) ((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) - 97), (short) ((-72) - android.view.View.MeasureSpec.getMode(0)), objArr26);
                            } catch (java.lang.Throwable th2) {
                                java.lang.Throwable cause2 = th2.getCause();
                                if (cause2 != null) {
                                    throw cause2;
                                }
                                throw th2;
                            }
                        }
                    } catch (java.lang.Exception unused) {
                    }
                } catch (java.lang.Exception unused2) {
                    indexOf = 0;
                }
            } catch (java.lang.Throwable th3) {
                java.lang.Throwable cause3 = th3.getCause();
                if (cause3 != null) {
                    throw cause3;
                }
                throw th3;
            }
            java.lang.Object[] objArr27 = {new int[]{i}, new int[]{i}, null, new int[1]};
            int i8 = ~i;
            ?? r5 = {java.lang.Integer.valueOf(i2), indexOf, java.lang.Integer.valueOf((((~((-986030827) | i8)) | (~((-18898159) | i8))) * (-867)) + 399997024 + (((~((-986030827) | i)) | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE | (~((-18898159) | i))) * (-1734)) + (((~(i | (-986030593))) | (~(i8 | (-235))) | (~((-18897925) | i))) * 867))};
            java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
            if (obj8 == null) {
                java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 49, 2713 - android.graphics.Color.argb(0, 0, 0, 0), (char) android.view.KeyEvent.normalizeMetaState(0));
                byte b9 = $$a[14];
                short s7 = (short) (b9 + 1);
                java.lang.Object[] objArr28 = new java.lang.Object[1];
                a(b9, s7, (byte) s7, objArr28);
                obj8 = cls13.getMethod((java.lang.String) objArr28[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj8);
            }
            ((int[]) objArr27[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, r5)).intValue();
            int i9 = RecordsJson + 69;
            getAid = i9 % 128;
            if (i9 % 2 == 0) {
                return objArr27;
            }
            throw null;
        } catch (java.lang.Throwable th4) {
            java.lang.Throwable cause4 = th4.getCause();
            if (cause4 != null) {
                throw cause4;
            }
            throw th4;
        }
    }
}
