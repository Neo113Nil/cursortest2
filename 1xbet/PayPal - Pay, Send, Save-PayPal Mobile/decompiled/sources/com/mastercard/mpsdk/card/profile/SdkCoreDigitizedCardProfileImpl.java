package com.mastercard.mpsdk.card.profile;

/* loaded from: classes4.dex */
public class SdkCoreDigitizedCardProfileImpl implements com.payair.hce.createContextForSplit, java.io.Serializable {
    private static int DigitizedCardProfile = 0;
    private static final long serialVersionUID = -7948722561201330235L;
    private static int values = 1;
    private com.payair.hce.checkUriPermission businessLogicModule;
    private java.lang.String digitizedCardId;
    private int maximumPinTry;
    private com.payair.hce.enforceUriPermission mppLiteModule;

    public SdkCoreDigitizedCardProfileImpl(com.payair.hce.createContextForSplit createcontextforsplit) {
        this.digitizedCardId = createcontextforsplit.getDigitizedCardId();
        this.maximumPinTry = createcontextforsplit.getMaximumPinTry();
        this.mppLiteModule = new com.mastercard.mpsdk.card.profile.SdkCoreMppLiteModuleImpl(createcontextforsplit.getMppLiteModule());
        this.businessLogicModule = new com.mastercard.mpsdk.card.profile.SdkCoreBusinessLogicModuleImpl(createcontextforsplit.getBusinessLogicModule());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00cc: MOVE (r4 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:67:0x00cc */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.InputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.mastercard.mpsdk.card.profile.SdkCoreDigitizedCardProfileImpl build(byte[] bArr) {
        ?? r1;
        java.lang.Throwable e;
        com.payair.hce.getRequiredConverters getrequiredconverters;
        java.io.ByteArrayInputStream byteArrayInputStream;
        java.io.ByteArrayInputStream byteArrayInputStream2;
        java.io.ByteArrayInputStream byteArrayInputStream3;
        byte[] bArr2;
        java.io.ByteArrayInputStream byteArrayInputStream4 = null;
        try {
            try {
                byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
            } catch (java.lang.Throwable th) {
                byteArrayInputStream3 = byteArrayInputStream2;
                bArr2 = bArr;
                th = th;
            }
        } catch (java.io.IOException e2) {
            e = e2;
            e = e;
            getrequiredconverters = null;
            byteArrayInputStream = null;
            e.printStackTrace();
            if (byteArrayInputStream != null) {
            }
            if (getrequiredconverters != null) {
            }
            int i = DigitizedCardProfile;
            int i2 = ((i ^ 59) | (i & 59)) << 1;
            int i3 = -((i & (-60)) | ((~i) & 59));
            values = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
            return null;
        } catch (java.lang.ClassNotFoundException e3) {
            e = e3;
            e = e;
            getrequiredconverters = null;
            byteArrayInputStream = null;
            e.printStackTrace();
            if (byteArrayInputStream != null) {
            }
            if (getrequiredconverters != null) {
            }
            int i4 = DigitizedCardProfile;
            int i22 = ((i4 ^ 59) | (i4 & 59)) << 1;
            int i32 = -((i4 & (-60)) | ((~i4) & 59));
            values = ((i22 ^ i32) + ((i32 & i22) << 1)) % 128;
            return null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            r1 = 0;
            if (byteArrayInputStream4 != null) {
                try {
                    byteArrayInputStream4.close();
                    int i5 = DigitizedCardProfile;
                    values = ((((i5 | 4) << 1) - (i5 ^ 4)) - 1) % 128;
                } catch (java.io.IOException unused) {
                }
            }
            if (r1 != 0) {
                throw th;
            }
            int i6 = values;
            int i7 = i6 & 13;
            DigitizedCardProfile = (((i6 | 13) & (~i7)) + (i7 << 1)) % 128;
            try {
                r1.close();
                int i8 = DigitizedCardProfile;
                values = (((i8 & (-126)) | ((~i8) & 125)) + ((i8 & 125) << 1)) % 128;
                throw th;
            } catch (java.io.IOException unused2) {
                throw th;
            }
        }
        try {
            getrequiredconverters = new com.payair.hce.getRequiredConverters(byteArrayInputStream);
            try {
                com.mastercard.mpsdk.card.profile.SdkCoreDigitizedCardProfileImpl sdkCoreDigitizedCardProfileImpl = (com.mastercard.mpsdk.card.profile.SdkCoreDigitizedCardProfileImpl) getrequiredconverters.readObject();
                try {
                    byteArrayInputStream.close();
                    int i9 = values;
                    DigitizedCardProfile = (((i9 | 93) << 1) - (i9 ^ 93)) % 128;
                } catch (java.io.IOException unused3) {
                }
                try {
                    getrequiredconverters.close();
                    int i10 = values;
                    int i11 = (i10 | 109) << 1;
                    int i12 = -(i10 ^ 109);
                    DigitizedCardProfile = (((i11 | i12) << 1) - (i12 ^ i11)) % 128;
                } catch (java.io.IOException unused4) {
                }
                int i13 = DigitizedCardProfile;
                int i14 = (((i13 ^ 67) | (i13 & 67)) << 1) - ((i13 & (-68)) | ((~i13) & 67));
                values = i14 % 128;
                if (i14 % 2 != 0) {
                    return sdkCoreDigitizedCardProfileImpl;
                }
                throw null;
            } catch (java.io.IOException e4) {
                e = e4;
                e.printStackTrace();
                if (byteArrayInputStream != null) {
                    try {
                        byteArrayInputStream.close();
                        int i15 = values;
                        DigitizedCardProfile = (((i15 & 69) - (~(i15 | 69))) - 1) % 128;
                    } catch (java.io.IOException unused5) {
                    }
                }
                if (getrequiredconverters != null) {
                    int i16 = DigitizedCardProfile;
                    int i17 = i16 ^ 103;
                    int i18 = -(-((i16 & 103) << 1));
                    values = ((i17 & i18) + (i18 | i17)) % 128;
                    try {
                        getrequiredconverters.close();
                        int i19 = values;
                        int i20 = i19 & 89;
                        int i21 = ((i19 ^ 89) | i20) << 1;
                        int i23 = -((i19 | 89) & (~i20));
                        DigitizedCardProfile = ((i21 ^ i23) + ((i23 & i21) << 1)) % 128;
                    } catch (java.io.IOException unused6) {
                    }
                }
                int i42 = DigitizedCardProfile;
                int i222 = ((i42 ^ 59) | (i42 & 59)) << 1;
                int i322 = -((i42 & (-60)) | ((~i42) & 59));
                values = ((i222 ^ i322) + ((i322 & i222) << 1)) % 128;
                return null;
            } catch (java.lang.ClassNotFoundException e5) {
                e = e5;
                e.printStackTrace();
                if (byteArrayInputStream != null) {
                }
                if (getrequiredconverters != null) {
                }
                int i422 = DigitizedCardProfile;
                int i2222 = ((i422 ^ 59) | (i422 & 59)) << 1;
                int i3222 = -((i422 & (-60)) | ((~i422) & 59));
                values = ((i2222 ^ i3222) + ((i3222 & i2222) << 1)) % 128;
                return null;
            }
        } catch (java.io.IOException e6) {
            e = e6;
            e = e;
            getrequiredconverters = null;
            e.printStackTrace();
            if (byteArrayInputStream != null) {
            }
            if (getrequiredconverters != null) {
            }
            int i4222 = DigitizedCardProfile;
            int i22222 = ((i4222 ^ 59) | (i4222 & 59)) << 1;
            int i32222 = -((i4222 & (-60)) | ((~i4222) & 59));
            values = ((i22222 ^ i32222) + ((i32222 & i22222) << 1)) % 128;
            return null;
        } catch (java.lang.ClassNotFoundException e7) {
            e = e7;
            e = e;
            getrequiredconverters = null;
            e.printStackTrace();
            if (byteArrayInputStream != null) {
            }
            if (getrequiredconverters != null) {
            }
            int i42222 = DigitizedCardProfile;
            int i222222 = ((i42222 ^ 59) | (i42222 & 59)) << 1;
            int i322222 = -((i42222 & (-60)) | ((~i42222) & 59));
            values = ((i222222 ^ i322222) + ((i322222 & i222222) << 1)) % 128;
            return null;
        } catch (java.lang.Throwable th3) {
            th = th3;
            byteArrayInputStream3 = byteArrayInputStream;
            bArr2 = null;
            byteArrayInputStream4 = byteArrayInputStream3;
            r1 = bArr2;
            if (byteArrayInputStream4 != null) {
            }
            if (r1 != 0) {
            }
        }
    }

    @Override // com.payair.hce.createContextForSplit
    public java.lang.String getDigitizedCardId() {
        int i = DigitizedCardProfile;
        int i2 = i & 13;
        int i3 = (((i ^ 13) | i2) << 1) - ((i | 13) & (~i2));
        values = i3 % 128;
        if (i3 % 2 != 0) {
            return this.digitizedCardId;
        }
        throw null;
    }

    @Override // com.payair.hce.createContextForSplit
    public int getMaximumPinTry() {
        int i = values;
        int i2 = i & 43;
        int i3 = i | 43;
        DigitizedCardProfile = ((i2 & i3) + (i2 | i3)) % 128;
        int i4 = this.maximumPinTry;
        DigitizedCardProfile = ((-2) - (~(i + 2))) % 128;
        return i4;
    }

    @Override // com.payair.hce.createContextForSplit
    public com.payair.hce.checkUriPermission getBusinessLogicModule() {
        int i = DigitizedCardProfile;
        values = (((((i ^ 125) | (i & 125)) << 1) - (~(-((i & (-126)) | ((~i) & 125))))) - 1) % 128;
        com.payair.hce.checkUriPermission checkuripermission = this.businessLogicModule;
        values = (((i ^ 107) - (~(-(-((i & 107) << 1))))) - 1) % 128;
        return checkuripermission;
    }

    @Override // com.payair.hce.createContextForSplit
    public com.payair.hce.enforceUriPermission getMppLiteModule() {
        int i = values;
        int i2 = i & 93;
        DigitizedCardProfile = (((i | 93) & (~i2)) + (i2 << 1)) % 128;
        com.payair.hce.enforceUriPermission enforceuripermission = this.mppLiteModule;
        values = ((((r0 | 112) << 1) - (r0 ^ 112)) - 1) % 128;
        return enforceuripermission;
    }

    public void wipe() {
        int i = values;
        int i2 = i & 21;
        int i3 = -(-((i ^ 21) | i2));
        DigitizedCardProfile = ((i2 & i3) + (i3 | i2)) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte[] getContent() {
        java.io.ByteArrayOutputStream byteArrayOutputStream;
        java.lang.Throwable th;
        java.io.ObjectOutputStream objectOutputStream;
        java.io.IOException e;
        try {
            byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            try {
                objectOutputStream = new java.io.ObjectOutputStream(byteArrayOutputStream);
                try {
                    try {
                        objectOutputStream.writeObject(this);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        try {
                            byteArrayOutputStream.close();
                            int i = DigitizedCardProfile + 46;
                            values = ((~i) + (i << 1)) % 128;
                        } catch (java.io.IOException unused) {
                        }
                        try {
                            objectOutputStream.close();
                            int i2 = DigitizedCardProfile;
                            int i3 = i2 ^ 11;
                            int i4 = -(-((i2 & 11) << 1));
                            int i5 = (i3 & i4) + (i4 | i3);
                            values = i5 % 128;
                            int i6 = i5 % 2;
                        } catch (java.io.IOException unused2) {
                        }
                        int i7 = DigitizedCardProfile;
                        int i8 = i7 & 13;
                        int i9 = (i7 | 13) & (~i8);
                        int i10 = i8 << 1;
                        int i11 = (i9 & i10) + (i9 | i10);
                        values = i11 % 128;
                        if (i11 % 2 != 0) {
                            return byteArray;
                        }
                        throw null;
                    } catch (java.io.IOException e2) {
                        e = e2;
                        e.printStackTrace();
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                                int i12 = DigitizedCardProfile & 55;
                                values = ((((r1 | 55) & (~i12)) - (~(i12 << 1))) - 1) % 128;
                            } catch (java.io.IOException unused3) {
                            }
                        }
                        if (objectOutputStream != null) {
                            int i13 = values;
                            int i14 = (i13 ^ 97) + ((i13 & 97) << 1);
                            DigitizedCardProfile = i14 % 128;
                            try {
                                if (i14 % 2 != 0) {
                                    objectOutputStream.close();
                                    throw new java.lang.ArithmeticException();
                                }
                                objectOutputStream.close();
                            } catch (java.io.IOException unused4) {
                            }
                        }
                        int i15 = values;
                        int i16 = ((i15 & (-94)) | ((~i15) & 93)) + ((i15 & 93) << 1);
                        DigitizedCardProfile = i16 % 128;
                        if (i16 % 2 == 0) {
                            return null;
                        }
                        throw null;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                            int i17 = DigitizedCardProfile & 57;
                            values = ((i17 - (~((r1 ^ 57) | i17))) - 1) % 128;
                        } catch (java.io.IOException unused5) {
                        }
                    }
                    if (objectOutputStream != null) {
                        throw th;
                    }
                    int i18 = DigitizedCardProfile;
                    int i19 = (i18 | 43) << 1;
                    int i20 = -((i18 & (-44)) | ((~i18) & 43));
                    int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
                    values = i21 % 128;
                    try {
                        if (i21 % 2 == 0) {
                            objectOutputStream.close();
                            throw null;
                        }
                        objectOutputStream.close();
                        throw th;
                    } catch (java.io.IOException unused6) {
                        throw th;
                    }
                }
            } catch (java.io.IOException e3) {
                e = e3;
                objectOutputStream = null;
            } catch (java.lang.Throwable th3) {
                th = th3;
                objectOutputStream = null;
                if (byteArrayOutputStream != null) {
                }
                if (objectOutputStream != null) {
                }
            }
        } catch (java.io.IOException e4) {
            e = e4;
            byteArrayOutputStream = null;
            objectOutputStream = null;
        } catch (java.lang.Throwable th4) {
            byteArrayOutputStream = null;
            th = th4;
            objectOutputStream = null;
        }
    }

    public byte[] getCardMetadata() {
        int i = (values + 3) % 128;
        DigitizedCardProfile = i;
        int i2 = i & 31;
        int i3 = (i | 31) & (~i2);
        int i4 = i2 << 1;
        values = (((i3 | i4) << 1) - (i3 ^ i4)) % 128;
        return null;
    }
}
