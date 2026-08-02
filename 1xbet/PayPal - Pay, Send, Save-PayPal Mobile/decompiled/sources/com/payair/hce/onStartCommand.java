package com.payair.hce;

/* loaded from: classes4.dex */
public class onStartCommand implements com.payair.hce.RequestCompleteTokenizeDtoPresentationType {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int RecordsJson;
    private static int[] SdkCoreAlternateContactlessPaymentDataImpl;
    private static int getAid;
    private final java.lang.String AlternateContactlessPaymentDataJson;
    private final byte[] DigitizedCardProfile;
    private final long IccPrivateKeyCrtComponentsJson;
    private final int getProfileVersion;
    private final byte[] valueOf;
    private final long values;
    private final byte writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, int i, byte b2, java.lang.Object[] objArr) {
        int i2;
        byte[] bArr = $$a;
        int i3 = 66 - (i * 3);
        int i4 = b2 * 3;
        int i5 = b + 4;
        byte[] bArr2 = new byte[1 - i4];
        if (bArr == null) {
            int i6 = i3;
            i2 = 0;
            int i7 = i5;
            int i8 = i7;
            i3 = i5 + (-i6);
            i5 = i8;
            bArr2[i2] = (byte) i3;
            int i9 = i5 + 1;
            if (i2 == 0 - i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i2++;
            i6 = bArr[i9];
            int i10 = i3;
            i7 = i9;
            i5 = i10;
            int i82 = i7;
            i3 = i5 + (-i6);
            i5 = i82;
            bArr2[i2] = (byte) i3;
            int i92 = i5 + 1;
            if (i2 == 0 - i4) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            int i922 = i5 + 1;
            if (i2 == 0 - i4) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i3;
        int i5 = (~i) | i4;
        return ((((i * com.knotapi.knot.utilities.Constants.ID_KROGER) + (i2 * com.knotapi.knot.utilities.Constants.ID_KROGER)) + ((i4 | (i | i2)) * (-369))) + (((~i5) | i2) * (-369))) + ((((~(i | (~i2))) | (~(i3 | i))) | (~(i2 | i5))) * 369) != 1 ? values(objArr) : writeReplace(objArr);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        RecordsJson = 0;
        getAid = 1;
        RecordsJson();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(new int[]{-257491463, 1549315727, -1939694406, 1513458014}, 5 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(((java.lang.String) objArr[0]).intern());
        sb.append(com.payair.hce.onStartCommand.class.getName());
        com.payair.hce.checkPermission.DigitizedCardProfile(sb.toString());
        RecordsJson = (getAid + 99) % 128;
    }

    private static void a(int[] iArr, int i, java.lang.Object[] objArr) {
        int[] iArr2;
        int i2;
        com.payair.hce.isTransitSupported istransitsupported = new com.payair.hce.isTransitSupported();
        char[] cArr = new char[4];
        int i3 = 2;
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = SdkCoreAlternateContactlessPaymentDataImpl;
        int i4 = 1;
        int i5 = 0;
        if (iArr3 != null) {
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $11 + 95;
                $10 = i7 % 128;
                if (i7 % i3 != 0) {
                    try {
                        java.lang.Object[] objArr2 = new java.lang.Object[i4];
                        objArr2[0] = java.lang.Integer.valueOf(iArr3[i6]);
                        java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                        if (obj == null) {
                            obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 27, android.text.TextUtils.indexOf("", "") + 29, (char) android.view.KeyEvent.normalizeMetaState(0))).getMethod("z", java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj);
                        }
                        iArr4[i6] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(iArr3[i6])};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                    if (obj2 == null) {
                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson('K' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 29 - android.text.TextUtils.getTrimmedLength(""), (char) android.graphics.Color.green(0))).getMethod("z", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj2);
                    }
                    iArr4[i6] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
                    i6++;
                }
                i3 = 2;
                i4 = 1;
            }
            iArr3 = iArr4;
        }
        int length2 = iArr3.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = SdkCoreAlternateContactlessPaymentDataImpl;
        if (iArr6 != null) {
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i8 = 0;
            while (i8 < length3) {
                int i9 = $10 + 111;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    objArr4[i5] = java.lang.Integer.valueOf(iArr6[i8]);
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                    if (obj3 == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "") + 27, (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 28, (char) android.view.KeyEvent.normalizeMetaState(i5));
                        java.lang.Class<?>[] clsArr = new java.lang.Class[1];
                        clsArr[i5] = java.lang.Integer.TYPE;
                        obj3 = cls.getMethod("z", clsArr);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj3);
                    }
                    iArr7[i8] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue();
                    throw new java.lang.ArithmeticException();
                }
                java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(iArr6[i8])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                if (obj4 == null) {
                    iArr2 = iArr6;
                    i2 = length3;
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.green(0) + 27, 29 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))))).getMethod("z", java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj4);
                } else {
                    iArr2 = iArr6;
                    i2 = length3;
                }
                iArr7[i8] = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr5)).intValue();
                i8++;
                iArr6 = iArr2;
                length3 = i2;
                i5 = 0;
            }
            iArr6 = iArr7;
        }
        int i10 = i5;
        java.lang.System.arraycopy(iArr6, i10, iArr5, i10, length2);
        istransitsupported.valueOf = i10;
        while (istransitsupported.valueOf < iArr.length) {
            $10 = ($11 + 41) % 128;
            cArr[0] = (char) (iArr[istransitsupported.valueOf] >> 16);
            cArr[1] = (char) iArr[istransitsupported.valueOf];
            cArr[2] = (char) (iArr[istransitsupported.valueOf + 1] >> 16);
            cArr[3] = (char) iArr[istransitsupported.valueOf + 1];
            istransitsupported.DigitizedCardProfile = (cArr[0] << 16) + cArr[1];
            istransitsupported.values = (cArr[2] << 16) + cArr[3];
            com.payair.hce.isTransitSupported.values(iArr5);
            int i11 = 0;
            for (int i12 = 16; i11 < i12; i12 = 16) {
                istransitsupported.DigitizedCardProfile ^= iArr5[i11];
                java.lang.Object[] objArr6 = {istransitsupported, java.lang.Integer.valueOf(com.payair.hce.isTransitSupported.writeReplace(istransitsupported.DigitizedCardProfile)), istransitsupported, istransitsupported};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
                if (obj5 == null) {
                    obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), 5087 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1131271445, obj5);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr6)).intValue();
                istransitsupported.DigitizedCardProfile = istransitsupported.values;
                istransitsupported.values = intValue;
                i11++;
            }
            int i13 = istransitsupported.DigitizedCardProfile;
            istransitsupported.DigitizedCardProfile = istransitsupported.values;
            istransitsupported.values = i13;
            istransitsupported.values ^= iArr5[16];
            istransitsupported.DigitizedCardProfile ^= iArr5[17];
            int i14 = istransitsupported.DigitizedCardProfile;
            int i15 = istransitsupported.values;
            cArr[0] = (char) (istransitsupported.DigitizedCardProfile >>> 16);
            cArr[1] = (char) istransitsupported.DigitizedCardProfile;
            cArr[2] = (char) (istransitsupported.values >>> 16);
            cArr[3] = (char) istransitsupported.values;
            com.payair.hce.isTransitSupported.values(iArr5);
            cArr2[istransitsupported.valueOf * 2] = cArr[0];
            cArr2[(istransitsupported.valueOf * 2) + 1] = cArr[1];
            cArr2[(istransitsupported.valueOf * 2) + 2] = cArr[2];
            cArr2[(istransitsupported.valueOf * 2) + 3] = cArr[3];
            java.lang.Object[] objArr7 = {istransitsupported, istransitsupported};
            java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-825681165);
            if (obj6 == null) {
                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetBefore("", 0) + 49, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 2924, (char) (3038 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))));
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                b((byte) -1, 0, (byte) 0, objArr8);
                obj6 = cls2.getMethod((java.lang.String) objArr8[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-825681165, obj6);
            }
            ((java.lang.reflect.Method) obj6).invoke(null, objArr7);
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    public onStartCommand(java.lang.String str, com.payair.hce.setSelectedCard setselectedcard) {
        this.AlternateContactlessPaymentDataJson = str;
        this.DigitizedCardProfile = null;
        this.values = java.lang.System.currentTimeMillis();
        this.IccPrivateKeyCrtComponentsJson = java.lang.Long.valueOf(com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(setselectedcard.AlternateContactlessPaymentDataJson().AlternateContactlessPaymentDataJson()).writeReplace()).longValue();
        this.getProfileVersion = java.lang.Integer.valueOf(com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(setselectedcard.AlternateContactlessPaymentDataJson().values()).writeReplace(), 10).intValue();
        this.writeReplace = DigitizedCardProfile(setselectedcard);
        this.valueOf = setselectedcard.DigitizedCardProfile();
    }

    public onStartCommand(java.lang.String str, byte[] bArr, long j, long j2, int i, byte b, byte[] bArr2) {
        this.AlternateContactlessPaymentDataJson = str;
        this.DigitizedCardProfile = bArr;
        this.values = j;
        this.IccPrivateKeyCrtComponentsJson = j2;
        this.getProfileVersion = i;
        this.writeReplace = b;
        this.valueOf = bArr2;
    }

    /* renamed from: com.payair.hce.onStartCommand$2, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass2 {
        private static /* synthetic */ int[] AlternateContactlessPaymentDataJson = null;
        private static int DigitizedCardProfile = 0;
        static final /* synthetic */ int[] valueOf;
        private static int values = 1;
        static final /* synthetic */ int[] writeReplace;

        static {
            int[] iArr = new int[com.payair.hce.getMDESCardsUniqueTokenReferences.values().length];
            valueOf = iArr;
            try {
                iArr[com.payair.hce.getMDESCardsUniqueTokenReferences.valueOf.ordinal()] = 1;
                int i = values;
                int i2 = i & 101;
                int i3 = -(-((i ^ 101) | i2));
                DigitizedCardProfile = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                valueOf[com.payair.hce.getMDESCardsUniqueTokenReferences.AlternateContactlessPaymentDataJson.ordinal()] = 2;
                int i4 = values;
                DigitizedCardProfile = (((i4 & 60) + (i4 | 60)) - 1) % 128;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                valueOf[com.payair.hce.getMDESCardsUniqueTokenReferences.writeReplace.ordinal()] = 3;
                int i5 = DigitizedCardProfile;
                values = (((i5 & 104) + (i5 | 104)) - 1) % 128;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                valueOf[com.payair.hce.getMDESCardsUniqueTokenReferences.DigitizedCardProfile.ordinal()] = 4;
                int i6 = DigitizedCardProfile;
                int i7 = (i6 & (-88)) | ((~i6) & 87);
                int i8 = -(-((i6 & 87) << 1));
                values = (((i7 | i8) << 1) - (i8 ^ i7)) % 128;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                valueOf[com.payair.hce.getMDESCardsUniqueTokenReferences.values.ordinal()] = 5;
                int i9 = values + 31;
                DigitizedCardProfile = i9 % 128;
                int i10 = i9 % 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[com.payair.hce.createMCBP.values().length];
            writeReplace = iArr2;
            try {
                iArr2[com.payair.hce.createMCBP.AlternateContactlessPaymentDataJson.ordinal()] = 1;
                int i11 = values;
                int i12 = i11 & 29;
                int i13 = (i11 | 29) & (~i12);
                int i14 = i12 << 1;
                DigitizedCardProfile = ((i13 & i14) + (i13 | i14)) % 128;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                writeReplace[com.payair.hce.createMCBP.values.ordinal()] = 2;
                int i15 = DigitizedCardProfile;
                values = (((i15 | 25) << 1) - (i15 ^ 25)) % 128;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[com.payair.hce.getTokenPan.values().length];
            AlternateContactlessPaymentDataJson = iArr3;
            try {
                iArr3[com.payair.hce.getTokenPan.values.ordinal()] = 1;
                int i16 = values;
                int i17 = i16 & 17;
                int i18 = -(-((i16 ^ 17) | i17));
                int i19 = (i17 & i18) + (i18 | i17);
                DigitizedCardProfile = i19 % 128;
                if (i19 % 2 != 0) {
                    int i20 = 5 / 3;
                }
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                AlternateContactlessPaymentDataJson[com.payair.hce.getTokenPan.AlternateContactlessPaymentDataJson.ordinal()] = 2;
                int i21 = values + 101;
                DigitizedCardProfile = i21 % 128;
                if (i21 % 2 != 0) {
                    throw null;
                }
            } catch (java.lang.NoSuchFieldError unused9) {
            }
        }
    }

    private static byte DigitizedCardProfile(com.payair.hce.setSelectedCard setselectedcard) {
        getAid = (RecordsJson + 115) % 128;
        if (setselectedcard == null) {
            return (byte) 0;
        }
        com.payair.hce.getNumberOfAvailableCredentialsForToken values = setselectedcard.values();
        if (values == null) {
            RecordsJson = (getAid + 45) % 128;
        } else {
            com.payair.hce.createMCBP valueOf = values.valueOf();
            com.payair.hce.getMDESCardsUniqueTokenReferences valueOf2 = setselectedcard.valueOf();
            if (valueOf != null) {
                getAid = (RecordsJson + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                if (valueOf2 != null) {
                    int i = com.payair.hce.onStartCommand.AnonymousClass2.valueOf[valueOf2.ordinal()];
                    if (i != 1) {
                        return (i == 2 || i == 3 || i == 4 || i == 5) ? (byte) 6 : (byte) 0;
                    }
                    int i2 = com.payair.hce.onStartCommand.AnonymousClass2.writeReplace[valueOf.ordinal()];
                    if (i2 != 1) {
                        return i2 != 2 ? (byte) 0 : (byte) 2;
                    }
                    return (byte) 1;
                }
            }
            getAid = (RecordsJson + 35) % 128;
        }
        return (byte) 0;
    }

    @Override // com.payair.hce.RequestCompleteTokenizeDtoPresentationType
    public final byte valueOf() {
        getAid = (RecordsJson + 115) % 128;
        com.payair.hce.stopService.AlternateContactlessPaymentDataJson(new byte[]{this.writeReplace});
        byte b = this.writeReplace;
        getAid = (RecordsJson + 33) % 128;
        return b;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.onStartCommand onstartcommand = (com.payair.hce.onStartCommand) objArr[0];
        int i = RecordsJson + 41;
        getAid = i % 128;
        if (i % 2 != 0) {
            return java.lang.Long.valueOf(onstartcommand.values);
        }
        long j = onstartcommand.values;
        throw null;
    }

    @Override // com.payair.hce.RequestCompleteTokenizeDtoPresentationType
    public final long SdkCoreAlternateContactlessPaymentDataImpl() {
        int i = RecordsJson;
        int i2 = i + 83;
        getAid = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        long j = this.IccPrivateKeyCrtComponentsJson;
        getAid = (i + 85) % 128;
        return j;
    }

    @Override // com.payair.hce.RequestCompleteTokenizeDtoPresentationType
    public final int getProfileVersion() {
        int i = RecordsJson;
        getAid = (i + 39) % 128;
        int i2 = this.getProfileVersion;
        int i3 = i + 115;
        getAid = i3 % 128;
        if (i3 % 2 != 0) {
            return i2;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.onStartCommand onstartcommand = (com.payair.hce.onStartCommand) objArr[0];
        int i = (getAid + 111) % 128;
        RecordsJson = i;
        java.lang.String str = onstartcommand.AlternateContactlessPaymentDataJson;
        int i2 = i + 69;
        getAid = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override // com.payair.hce.RequestCompleteTokenizeDtoPresentationType
    public final byte[] values() {
        int i = getAid;
        int i2 = i + 101;
        RecordsJson = i2 % 128;
        if (i2 % 2 == 0) {
            byte[] bArr = this.DigitizedCardProfile;
            if (bArr == null) {
                int i3 = i + 27;
                RecordsJson = i3 % 128;
                if (i3 % 2 != 0) {
                    throw new java.lang.ArithmeticException();
                }
                bArr = null;
            }
            com.payair.hce.stopService.AlternateContactlessPaymentDataJson(bArr);
            int i4 = getAid + 77;
            RecordsJson = i4 % 128;
            if (i4 % 2 == 0) {
                return bArr;
            }
            throw null;
        }
        throw null;
    }

    @Override // com.payair.hce.RequestCompleteTokenizeDtoPresentationType
    public final byte[] AlternateContactlessPaymentDataJson() {
        byte[] bArr = this.valueOf;
        if (bArr == null) {
            RecordsJson = (getAid + 113) % 128;
            bArr = null;
        }
        com.payair.hce.stopService.AlternateContactlessPaymentDataJson(bArr);
        int i = getAid + 99;
        RecordsJson = i % 128;
        if (i % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    public static com.payair.hce.RequestCompleteTokenizeDtoPresentationType writeReplace(byte[] bArr) {
        java.lang.String str = new java.lang.String(bArr);
        com.payair.hce.setOnItemSelectedListener setonitemselectedlistener = new com.payair.hce.setOnItemSelectedListener();
        com.mastercard.mpsdk.implementation.TransactionLogJson transactionLogJson = (com.mastercard.mpsdk.implementation.TransactionLogJson) com.payair.hce.setOnItemSelectedListener.values(new java.lang.Object[]{setonitemselectedlistener, str, com.mastercard.mpsdk.implementation.TransactionLogJson.class}, -982165709, 982165716, java.lang.System.identityHashCode(setonitemselectedlistener));
        return new com.payair.hce.onStartCommand(transactionLogJson.getTokenUniqueReference(), transactionLogJson.getUnpredictableNumber() == null ? new byte[0] : com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(transactionLogJson.getUnpredictableNumber()).DigitizedCardProfile(), transactionLogJson.getDate(), transactionLogJson.getAmount(), transactionLogJson.getCurrencyCode(), transactionLogJson.getCryptogramFormat(), com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(transactionLogJson.getTransactionId()).DigitizedCardProfile());
    }

    public static byte[] writeReplace(com.payair.hce.RequestCompleteTokenizeDtoPresentationType requestCompleteTokenizeDtoPresentationType) {
        com.mastercard.mpsdk.implementation.TransactionLogJson transactionLogJson = new com.mastercard.mpsdk.implementation.TransactionLogJson(requestCompleteTokenizeDtoPresentationType.writeReplace(), requestCompleteTokenizeDtoPresentationType.values(), requestCompleteTokenizeDtoPresentationType.DigitizedCardProfile(), requestCompleteTokenizeDtoPresentationType.SdkCoreAlternateContactlessPaymentDataImpl(), requestCompleteTokenizeDtoPresentationType.getProfileVersion(), requestCompleteTokenizeDtoPresentationType.valueOf(), requestCompleteTokenizeDtoPresentationType.AlternateContactlessPaymentDataJson());
        new com.payair.hce.unbindService(com.mastercard.mpsdk.implementation.TransactionLogJson.class);
        byte[] bytes = com.payair.hce.unbindService.writeReplace(transactionLogJson).getBytes();
        int i = RecordsJson + 59;
        getAid = i % 128;
        if (i % 2 != 0) {
            return bytes;
        }
        throw new java.lang.ArithmeticException();
    }

    static void RecordsJson() {
        SdkCoreAlternateContactlessPaymentDataImpl = new int[]{-1217443861, 1463695092, 2123483913, 923846533, -54355921, -914840774, -623017598, 1355573029, -1021590420, 486946058, 835216987, -1169939110, 1374117312, 437277906, -1487982656, -1564824178, 1233585450, 1415973177};
    }

    @Override // com.payair.hce.RequestCompleteTokenizeDtoPresentationType
    public final java.lang.String writeReplace() {
        return (java.lang.String) values(new java.lang.Object[]{this}, -21691265, 21691266, java.lang.System.identityHashCode(this));
    }

    static void init$0() {
        $$a = new byte[]{com.google.common.base.Ascii.EM, -31, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, com.google.common.base.Ascii.DC4};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE;
    }

    @Override // com.payair.hce.RequestCompleteTokenizeDtoPresentationType
    public final long DigitizedCardProfile() {
        return ((java.lang.Long) values(new java.lang.Object[]{this}, -169299828, 169299828, java.lang.System.identityHashCode(this))).longValue();
    }
}
