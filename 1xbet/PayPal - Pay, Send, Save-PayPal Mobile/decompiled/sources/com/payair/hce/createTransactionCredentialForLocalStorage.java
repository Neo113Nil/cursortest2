package com.payair.hce;

/* loaded from: classes4.dex */
public enum createTransactionCredentialForLocalStorage {
    ;

    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int valueOf;
    private static java.util.HashMap<java.lang.Class<?>, com.payair.hce.setMobilePin> values;
    private static int writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, short s2, byte b, java.lang.Object[] objArr) {
        int i;
        byte[] bArr = $$a;
        int i2 = 57 - s2;
        int i3 = 99 - (s * 3);
        byte[] bArr2 = new byte[b + 24];
        int i4 = b + com.google.common.base.Ascii.ETB;
        if (bArr == null) {
            int i5 = i2;
            int i6 = i4;
            int i7 = 0;
            i3 = (-i3) + i6;
            i2 = i5 + 1;
            i = i7;
            bArr2[i] = (byte) i3;
            if (i == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            byte b2 = bArr[i2];
            int i8 = i2;
            i6 = i3;
            i3 = b2;
            i7 = i + 1;
            i5 = i8;
            i3 = (-i3) + i6;
            i2 = i5 + 1;
            i = i7;
            bArr2[i] = (byte) i3;
            if (i == i4) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i3;
            if (i == i4) {
            }
        }
    }

    static {
        init$0();
        writeReplace = 0;
        valueOf = 1;
        java.util.HashMap<java.lang.Class<?>, com.payair.hce.setMobilePin> hashMap = new java.util.HashMap<>();
        values = hashMap;
        hashMap.put(com.payair.hce.provisionFromLocalStorage.class, com.payair.hce.provisionFromLocalStorage.values());
        values.put(com.payair.hce.readIccEncryptionKey.class, com.payair.hce.readIccEncryptionKey.AlternateContactlessPaymentDataJson());
        values.put(com.payair.hce.getAllCmsDFormattedTransactionCredentials.class, new com.payair.hce.setMobilePin<java.lang.String>() { // from class: com.payair.hce.getAllCmsDFormattedTransactionCredentials.1
            private static int AlternateContactlessPaymentDataJson = 1;
            private static int DigitizedCardProfile;

            public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
                com.payair.hce.getAllCmsDFormattedTransactionCredentials getallcmsdformattedtransactioncredentials = new com.payair.hce.getAllCmsDFormattedTransactionCredentials((byte) 0);
                int i4 = AlternateContactlessPaymentDataJson;
                DigitizedCardProfile = (((i4 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1) - (i4 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE)) % 128;
                return getallcmsdformattedtransactioncredentials;
            }

            AnonymousClass1() {
            }

            @Override // com.payair.hce.setMobilePin
            public final com.payair.hce.getReasonCode<java.lang.String> valueOf() {
                return (com.payair.hce.getReasonCode) valueOf(new java.lang.Object[]{this}, 3393560, -3393560, java.lang.System.identityHashCode(this));
            }
        });
        java.util.HashMap<java.lang.Class<?>, com.payair.hce.setMobilePin> hashMap2 = values;
        byte[] bArr = $$a;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a((short) 0, (byte) (-bArr[18]), bArr[91], objArr);
        hashMap2.put(java.lang.Class.forName((java.lang.String) objArr[0]), (com.payair.hce.setMobilePin) com.payair.hce.createOpenHelper.DigitizedCardProfile(new java.lang.Object[0], -470279881, 470279881, (int) java.lang.System.currentTimeMillis()));
        values.put(com.payair.hce.readDsrpImk.class, com.payair.hce.readDsrpImk.writeReplace());
        values.put(com.payair.hce.getDigitizedCardProfile.class, com.payair.hce.getDigitizedCardProfile.writeReplace());
        values.put(com.payair.hce.readJsonFromLocalStorage.class, com.payair.hce.readJsonFromLocalStorage.DigitizedCardProfile());
        values.put(com.payair.hce.getDescription.class, com.payair.hce.getDescription.writeReplace());
        values.put(com.payair.hce.readContactlessImk.class, com.payair.hce.readContactlessImk.DigitizedCardProfile());
        values.put(com.payair.hce.readIdnImk.class, com.payair.hce.readIdnImk.AlternateContactlessPaymentDataJson());
        java.util.HashMap<java.lang.Class<?>, com.payair.hce.setMobilePin> hashMap3 = values;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a((short) 0, (short) 23, (byte) 0, objArr2);
        hashMap3.put(java.lang.Class.forName((java.lang.String) objArr2[0]), com.payair.hce.readValue.values());
        values.put(com.payair.hce.deviceAuthenticationCompleted.class, com.payair.hce.deviceAuthenticationCompleted.writeReplace());
        values.put(com.payair.hce.getAllCmsCFormattedTransactionCredentials.class, com.payair.hce.getAllCmsCFormattedTransactionCredentials.values());
        values.put(com.payair.hce.getCmsDFormattedDigitizedCardProfile.class, com.payair.hce.getCmsDFormattedDigitizedCardProfile.writeReplace());
        java.util.HashMap<java.lang.Class<?>, com.payair.hce.setMobilePin> hashMap4 = values;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a((short) 0, (short) 0, (byte) (-bArr[4]), objArr3);
        hashMap4.put(java.lang.Class.forName((java.lang.String) objArr3[0]), new com.payair.hce.setMobilePin<com.payair.hce.transactionCanBeResumed>() { // from class: com.payair.hce.createDemoCardProfile.1
            private static int valueOf = 1;
            private static int writeReplace;

            public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr4, int i, int i2, int i3) {
                com.payair.hce.createDemoCardProfile createdemocardprofile = new com.payair.hce.createDemoCardProfile((byte) 0);
                int i4 = writeReplace;
                valueOf = (((i4 | 79) << 1) - (i4 ^ 79)) % 128;
                return createdemocardprofile;
            }

            AnonymousClass1() {
            }

            @Override // com.payair.hce.setMobilePin
            public final com.payair.hce.getReasonCode<com.payair.hce.transactionCanBeResumed> valueOf() {
                return (com.payair.hce.getReasonCode) DigitizedCardProfile(new java.lang.Object[]{this}, -1707708003, 1707708003, java.lang.System.identityHashCode(this));
            }
        });
        values.put(com.payair.hce.restoreDemoCardsFromDatabase.class, new com.payair.hce.setMobilePin<com.payair.hce.transactionCanBeResumed>() { // from class: com.payair.hce.restoreDemoCardsFromDatabase.5
            private static int values = 0;
            private static int writeReplace = 1;

            public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr4, int i, int i2, int i3) {
                return valueOf(objArr4);
            }

            AnonymousClass5() {
            }

            private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr4) {
                com.payair.hce.restoreDemoCardsFromDatabase restoredemocardsfromdatabase = new com.payair.hce.restoreDemoCardsFromDatabase((byte) 0);
                int i = values;
                int i2 = (i | 17) << 1;
                int i3 = -(i ^ 17);
                int i4 = (i2 & i3) + (i3 | i2);
                writeReplace = i4 % 128;
                if (i4 % 2 != 0) {
                    return restoredemocardsfromdatabase;
                }
                throw new java.lang.ArithmeticException();
            }

            @Override // com.payair.hce.setMobilePin
            public final com.payair.hce.getReasonCode<com.payair.hce.transactionCanBeResumed> valueOf() {
                return (com.payair.hce.getReasonCode) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -1602501317, 1602501317, java.lang.System.identityHashCode(this));
            }
        });
        values.put(com.payair.hce.getCmsCFormattedDigitizedCardProfile.class, com.payair.hce.getCmsCFormattedDigitizedCardProfile.DigitizedCardProfile());
        values.put(com.payair.hce.getTransactionCredentialData.class, com.payair.hce.getTransactionCredentialData.values());
        values.put(com.payair.hce.getMobilePin.class, com.payair.hce.getMobilePin.DigitizedCardProfile());
        int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
        int i = ~currentTimeMillis;
        int i2 = (i | currentTimeMillis) & i;
        int i3 = i2 ^ (-1707681624);
        int i4 = i2 & (-1707681624);
        int i5 = ~((i4 ^ i3) | (i4 & i3));
        int i6 = ((i5 ^ 1942193459) | (i5 & 1942193459)) * (-865);
        int i7 = ((i6 | 106472398) << 1) - (i6 ^ 106472398);
        int i8 = (~((currentTimeMillis ^ 1707681623) | (currentTimeMillis & 1707681623))) * 865;
        int i9 = i7 & i8;
        int i10 = (i8 | i7) & (~i9);
        int i11 = -(-(i9 << 1));
        int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
        int i13 = ~i;
        int i14 = (i13 & 1942193459) | ((-1942193460) & i);
        int i15 = 1942193459 & i;
        int i16 = ~((i15 ^ i14) | (i15 & i14));
        int i17 = (i13 & 1707681623) | ((-1707681624) & i);
        int i18 = i & 1707681623;
        int i19 = ~((i17 ^ i18) | (i17 & i18));
        int i20 = i16 ^ i19;
        int i21 = i19 & i16;
        int i22 = ((i21 ^ i20) | (i21 & i20)) * 865;
        int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
        int i23 = ~currentTimeMillis2;
        int i24 = ((~i23) & (-402751491)) | (402751490 & i23);
        int i25 = (-402751491) & i23;
        int i26 = -(-(((i24 ^ i25) | (i24 & i25)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE));
        int i27 = i26 | (-450598426);
        int i28 = i27 << 1;
        int i29 = -((~(i26 & (-450598426))) & i27);
        int i30 = (currentTimeMillis2 | i23) & i23;
        int i31 = ((-1123960669) & i30) | ((~i30) & 1123960668);
        int i32 = i30 & 1123960668;
        int i33 = ~((i32 ^ i31) | (i32 & i31));
        int i34 = i33 ^ 43794760;
        int i35 = i33 & 43794760;
        int i36 = (i35 ^ i34) | (i35 & i34);
        int i37 = i36 ^ (-1526712159);
        int i38 = i36 & (-1526712159);
        if (((i12 | i22) << 1) - (((~i22) & i12) | ((~i12) & i22)) > (((i28 ^ i29) + ((i29 & i28) << 1)) - (~(-(-(((i38 ^ i37) | (i38 & i37)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE))))) - 1) {
            throw new java.lang.ArithmeticException();
        }
    }

    public static com.payair.hce.createTransactionCredentialForLocalStorage valueOf(java.lang.String str) {
        int i = valueOf;
        writeReplace = ((i & 111) + (i | 111)) % 128;
        com.payair.hce.createTransactionCredentialForLocalStorage createtransactioncredentialforlocalstorage = (com.payair.hce.createTransactionCredentialForLocalStorage) java.lang.Enum.valueOf(com.payair.hce.createTransactionCredentialForLocalStorage.class, str);
        int i2 = writeReplace;
        int i3 = (((i2 | 94) << 1) - (i2 ^ 94)) - 1;
        valueOf = i3 % 128;
        if (i3 % 2 != 0) {
            return createtransactioncredentialforlocalstorage;
        }
        throw null;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static com.payair.hce.createTransactionCredentialForLocalStorage[] valuesCustom() {
        int i = writeReplace;
        int i2 = i ^ 109;
        valueOf = ((((i & 109) | i2) << 1) - i2) % 128;
        com.payair.hce.createTransactionCredentialForLocalStorage[] createtransactioncredentialforlocalstorageArr = (com.payair.hce.createTransactionCredentialForLocalStorage[]) values().clone();
        int i3 = valueOf;
        int i4 = i3 ^ 3;
        int i5 = -(-((i3 & 3) << 1));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        writeReplace = i6 % 128;
        if (i6 % 2 == 0) {
            return createtransactioncredentialforlocalstorageArr;
        }
        throw null;
    }

    public static com.payair.hce.transactionCanBeResumed valueOf(java.lang.Class<?> cls) {
        int i = writeReplace;
        int i2 = (i & 42) + (i | 42);
        valueOf = ((~i2) + (i2 << 1)) % 128;
        com.payair.hce.setMobilePin setmobilepin = values.get(cls);
        if (setmobilepin != null) {
            com.payair.hce.transactionCanBeResumed valueOf2 = setmobilepin.valueOf().valueOf();
            int i3 = valueOf;
            int i4 = i3 & 23;
            int i5 = i3 | 23;
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            writeReplace = i6 % 128;
            if (i6 % 2 == 0) {
                return valueOf2;
            }
            throw null;
        }
        int i7 = writeReplace;
        int i8 = (i7 & (-78)) | ((~i7) & 77);
        int i9 = (i7 & 77) << 1;
        int i10 = ((i8 ^ i9) + ((i9 & i8) << 1)) % 128;
        valueOf = i10;
        int i11 = i10 + 19;
        writeReplace = i11 % 128;
        if (i11 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static com.payair.hce.setMobilePin DigitizedCardProfile(java.lang.Class<?> cls) {
        int i = valueOf;
        writeReplace = ((i ^ 43) + ((i & 43) << 1)) % 128;
        com.payair.hce.setMobilePin setmobilepin = values.get(cls);
        int i2 = writeReplace;
        int i3 = (i2 & 60) + (i2 | 60);
        valueOf = ((~i3) + (i3 << 1)) % 128;
        return setmobilepin;
    }

    public static com.payair.hce.setMobilePin DigitizedCardProfile(com.payair.hce.transactionCanBeResumed transactioncanberesumed) {
        writeReplace = (valueOf + 109) % 128;
        java.util.Iterator<java.util.Map.Entry<java.lang.Class<?>, com.payair.hce.setMobilePin>> it = values.entrySet().iterator();
        int i = valueOf;
        int i2 = i & 77;
        int i3 = -(-((i ^ 77) | i2));
        writeReplace = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        while (it.hasNext()) {
            int i4 = valueOf;
            int i5 = (i4 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + (i4 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
            writeReplace = i5 % 128;
            if (i5 % 2 != 0) {
                it.next().getValue().valueOf().valueOf().equals(transactioncanberesumed);
                throw null;
            }
            java.util.Map.Entry<java.lang.Class<?>, com.payair.hce.setMobilePin> next = it.next();
            if (next.getValue().valueOf().valueOf().equals(transactioncanberesumed)) {
                int i6 = valueOf;
                int i7 = ((i6 ^ 53) | (i6 & 53)) << 1;
                int i8 = -((i6 & (-54)) | ((~i6) & 53));
                writeReplace = ((i7 ^ i8) + ((i8 & i7) << 1)) % 128;
                com.payair.hce.setMobilePin value = next.getValue();
                int i9 = writeReplace;
                int i10 = i9 & 49;
                int i11 = (i9 | 49) & (~i10);
                int i12 = -(-(i10 << 1));
                int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
                valueOf = i13 % 128;
                if (i13 % 2 != 0) {
                    return value;
                }
                throw null;
            }
            int i14 = writeReplace;
            valueOf = ((i14 & 101) + (i14 | 101)) % 128;
        }
        int i15 = writeReplace + 51;
        valueOf = i15 % 128;
        if (i15 % 2 != 0) {
            return null;
        }
        throw null;
    }

    static void init$0() {
        $$a = new byte[]{63, kotlin.io.encoding.Base64.padSymbol, -101, com.google.common.base.Ascii.SI, -12, 2, 63, -66, com.google.common.base.Ascii.SI, -24, com.google.common.base.Ascii.CAN, -8, -9, 68, -58, 5, -2, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -53, -15, 13, 4, -19, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.SYN, -33, com.google.common.base.Ascii.VT, -9, 38, -29, -7, -4, com.google.common.base.Ascii.VT, -13, -12, 2, 63, -66, com.google.common.base.Ascii.SI, -24, com.google.common.base.Ascii.CAN, -8, -9, 68, -58, 5, -2, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 13, 4, -3, 14, -11, -11, -9, 16, -12, 2, 63, -66, com.google.common.base.Ascii.SI, -24, com.google.common.base.Ascii.CAN, -8, -9, 68, -58, 5, -2, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -53, -15, 13, 4, -19, com.google.common.base.Ascii.SI, 33, -33, -8, -2, 44, -30, -17, 14, com.google.common.base.Ascii.DC4, -34, 3, 9, -3, -3, 7};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE;
    }
}
