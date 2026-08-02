package com.payair.hce;

/* loaded from: classes4.dex */
public class setImportantForAutofill implements com.payair.hce.createContextForSplit, java.io.Serializable {
    private static int DigitizedCardProfile = 0;
    private static int getAid = 1;
    private com.payair.hce.enforceUriPermission AlternateContactlessPaymentDataJson;
    private java.lang.String valueOf;
    private int values;
    private com.payair.hce.checkUriPermission writeReplace;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i2;
        int i6 = ~i3;
        return ((((i * (-209)) + (i2 * (-209))) + ((~(i4 | i5)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE)) + (((~(i5 | i6)) | (~(i4 | i3))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE)) + (((~((i | i5) | i3)) | (~(i2 | (i4 | i6)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) != 1 ? AlternateContactlessPaymentDataJson(objArr) : valueOf(objArr);
    }

    public setImportantForAutofill(com.payair.hce.createContextForSplit createcontextforsplit) {
        this.valueOf = createcontextforsplit.getDigitizedCardId();
        this.values = createcontextforsplit.getMaximumPinTry();
        this.AlternateContactlessPaymentDataJson = new com.payair.hce.setStateDescription(createcontextforsplit.getMppLiteModule());
        this.writeReplace = new com.payair.hce.setAccessibilityPaneTitle(createcontextforsplit.getBusinessLogicModule());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00be: MOVE (r5 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:69:0x00be */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.InputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        ?? r1;
        java.lang.Throwable e;
        com.payair.hce.setAccessibilityDelegate setaccessibilitydelegate;
        java.io.ByteArrayInputStream byteArrayInputStream;
        java.io.ByteArrayInputStream byteArrayInputStream2;
        java.io.ByteArrayInputStream byteArrayInputStream3;
        byte[] bArr;
        int i;
        byte[] bArr2 = (byte[]) objArr[0];
        java.io.ByteArrayInputStream byteArrayInputStream4 = null;
        try {
            try {
                byteArrayInputStream = new java.io.ByteArrayInputStream(bArr2);
            } catch (java.lang.Throwable th) {
                byteArrayInputStream3 = byteArrayInputStream2;
                bArr = bArr2;
                th = th;
            }
            try {
                setaccessibilitydelegate = new com.payair.hce.setAccessibilityDelegate(byteArrayInputStream);
                try {
                    com.payair.hce.setImportantForAutofill setimportantforautofill = (com.payair.hce.setImportantForAutofill) setaccessibilitydelegate.readObject();
                    try {
                        byteArrayInputStream.close();
                        int i2 = getAid;
                        int i3 = ((i2 ^ 115) | (i2 & 115)) << 1;
                        int i4 = -((i2 & (-116)) | ((~i2) & 115));
                        DigitizedCardProfile = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
                    } catch (java.io.IOException unused) {
                    }
                    try {
                        setaccessibilitydelegate.close();
                        getAid = (DigitizedCardProfile + 73) % 128;
                    } catch (java.io.IOException unused2) {
                    }
                    int i5 = DigitizedCardProfile;
                    int i6 = i5 & 23;
                    int i7 = ((i5 ^ 23) | i6) << 1;
                    int i8 = -((i5 | 23) & (~i6));
                    int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
                    getAid = i9 % 128;
                    if (i9 % 2 != 0) {
                        return setimportantforautofill;
                    }
                    throw null;
                } catch (java.io.IOException e2) {
                    e = e2;
                    e.printStackTrace();
                    if (byteArrayInputStream != null) {
                        try {
                            byteArrayInputStream.close();
                            getAid = (DigitizedCardProfile + 1) % 128;
                        } catch (java.io.IOException unused3) {
                        }
                    }
                    if (setaccessibilitydelegate != null) {
                        getAid = (DigitizedCardProfile + 65) % 128;
                        try {
                            setaccessibilitydelegate.close();
                            int i10 = getAid;
                            int i11 = i10 & 107;
                            int i12 = (i10 ^ 107) | i11;
                            DigitizedCardProfile = ((i11 & i12) + (i12 | i11)) % 128;
                        } catch (java.io.IOException unused4) {
                        }
                    }
                    int i13 = getAid;
                    int i14 = (i13 | 57) << 1;
                    int i15 = -((i13 & (-58)) | ((~i13) & 57));
                    i = (i14 ^ i15) + ((i15 & i14) << 1);
                    DigitizedCardProfile = i % 128;
                    if (i % 2 != 0) {
                        return null;
                    }
                    throw null;
                } catch (java.lang.ClassNotFoundException e3) {
                    e = e3;
                    e.printStackTrace();
                    if (byteArrayInputStream != null) {
                    }
                    if (setaccessibilitydelegate != null) {
                    }
                    int i132 = getAid;
                    int i142 = (i132 | 57) << 1;
                    int i152 = -((i132 & (-58)) | ((~i132) & 57));
                    i = (i142 ^ i152) + ((i152 & i142) << 1);
                    DigitizedCardProfile = i % 128;
                    if (i % 2 != 0) {
                    }
                }
            } catch (java.io.IOException e4) {
                e = e4;
                e = e;
                setaccessibilitydelegate = null;
                e.printStackTrace();
                if (byteArrayInputStream != null) {
                }
                if (setaccessibilitydelegate != null) {
                }
                int i1322 = getAid;
                int i1422 = (i1322 | 57) << 1;
                int i1522 = -((i1322 & (-58)) | ((~i1322) & 57));
                i = (i1422 ^ i1522) + ((i1522 & i1422) << 1);
                DigitizedCardProfile = i % 128;
                if (i % 2 != 0) {
                }
            } catch (java.lang.ClassNotFoundException e5) {
                e = e5;
                e = e;
                setaccessibilitydelegate = null;
                e.printStackTrace();
                if (byteArrayInputStream != null) {
                }
                if (setaccessibilitydelegate != null) {
                }
                int i13222 = getAid;
                int i14222 = (i13222 | 57) << 1;
                int i15222 = -((i13222 & (-58)) | ((~i13222) & 57));
                i = (i14222 ^ i15222) + ((i15222 & i14222) << 1);
                DigitizedCardProfile = i % 128;
                if (i % 2 != 0) {
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                byteArrayInputStream3 = byteArrayInputStream;
                bArr = null;
                byteArrayInputStream4 = byteArrayInputStream3;
                r1 = bArr;
                if (byteArrayInputStream4 != null) {
                    try {
                        byteArrayInputStream4.close();
                        int i16 = getAid;
                        int i17 = i16 | 111;
                        int i18 = i17 << 1;
                        int i19 = -((~(i16 & 111)) & i17);
                        DigitizedCardProfile = (((i18 | i19) << 1) - (i19 ^ i18)) % 128;
                    } catch (java.io.IOException unused5) {
                    }
                }
                if (r1 != 0) {
                    throw th;
                }
                int i20 = DigitizedCardProfile;
                int i21 = i20 & 75;
                int i22 = -(-((i20 ^ 75) | i21));
                getAid = (((i21 | i22) << 1) - (i22 ^ i21)) % 128;
                try {
                    r1.close();
                    int i23 = getAid;
                    int i24 = (i23 & (-10)) | ((~i23) & 9);
                    int i25 = (i23 & 9) << 1;
                    DigitizedCardProfile = ((i24 & i25) + (i25 | i24)) % 128;
                    throw th;
                } catch (java.io.IOException unused6) {
                    throw th;
                }
            }
        } catch (java.io.IOException e6) {
            e = e6;
            e = e;
            setaccessibilitydelegate = null;
            byteArrayInputStream = null;
            e.printStackTrace();
            if (byteArrayInputStream != null) {
            }
            if (setaccessibilitydelegate != null) {
            }
            int i132222 = getAid;
            int i142222 = (i132222 | 57) << 1;
            int i152222 = -((i132222 & (-58)) | ((~i132222) & 57));
            i = (i142222 ^ i152222) + ((i152222 & i142222) << 1);
            DigitizedCardProfile = i % 128;
            if (i % 2 != 0) {
            }
        } catch (java.lang.ClassNotFoundException e7) {
            e = e7;
            e = e;
            setaccessibilitydelegate = null;
            byteArrayInputStream = null;
            e.printStackTrace();
            if (byteArrayInputStream != null) {
            }
            if (setaccessibilitydelegate != null) {
            }
            int i1322222 = getAid;
            int i1422222 = (i1322222 | 57) << 1;
            int i1522222 = -((i1322222 & (-58)) | ((~i1322222) & 57));
            i = (i1422222 ^ i1522222) + ((i1522222 & i1422222) << 1);
            DigitizedCardProfile = i % 128;
            if (i % 2 != 0) {
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            r1 = 0;
            if (byteArrayInputStream4 != null) {
            }
            if (r1 != 0) {
            }
        }
    }

    @Override // com.payair.hce.createContextForSplit
    public java.lang.String getDigitizedCardId() {
        int i = DigitizedCardProfile & 107;
        int i2 = ((((r0 | 107) & (~i)) - (~(i << 1))) - 1) % 128;
        getAid = i2;
        java.lang.String str = this.valueOf;
        DigitizedCardProfile = ((i2 ^ 93) + ((i2 & 93) << 1)) % 128;
        return str;
    }

    @Override // com.payair.hce.createContextForSplit
    public int getMaximumPinTry() {
        int i = DigitizedCardProfile;
        int i2 = (-2) - (~((i & 72) + (i | 72)));
        getAid = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = this.values;
        int i4 = (i & (-84)) | ((~i) & 83);
        int i5 = -(-((i & 83) << 1));
        int i6 = (i4 & i5) + (i5 | i4);
        getAid = i6 % 128;
        if (i6 % 2 != 0) {
            return i3;
        }
        throw null;
    }

    @Override // com.payair.hce.createContextForSplit
    public com.payair.hce.checkUriPermission getBusinessLogicModule() {
        int i = getAid;
        int i2 = i & 63;
        int i3 = (i ^ 63) | i2;
        DigitizedCardProfile = (((i2 | i3) << 1) - (i2 ^ i3)) % 128;
        com.payair.hce.checkUriPermission checkuripermission = this.writeReplace;
        int i4 = i & 109;
        int i5 = (i4 - (~(-(-((i ^ 109) | i4))))) - 1;
        DigitizedCardProfile = i5 % 128;
        if (i5 % 2 == 0) {
            return checkuripermission;
        }
        throw null;
    }

    @Override // com.payair.hce.createContextForSplit
    public com.payair.hce.enforceUriPermission getMppLiteModule() {
        int i = getAid;
        int i2 = i & 111;
        int i3 = (i ^ 111) | i2;
        int i4 = (i2 & i3) + (i3 | i2);
        int i5 = i4 % 128;
        DigitizedCardProfile = i5;
        com.payair.hce.enforceUriPermission enforceuripermission = this.AlternateContactlessPaymentDataJson;
        if (i4 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        int i6 = ((i5 ^ 73) | (i5 & 73)) << 1;
        int i7 = -((i5 & (-74)) | ((~i5) & 73));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        getAid = i8 % 128;
        if (i8 % 2 != 0) {
            return enforceuripermission;
        }
        throw new java.lang.ArithmeticException();
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0099 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        java.io.OutputStream outputStream;
        java.io.ByteArrayOutputStream byteArrayOutputStream;
        java.io.ObjectOutputStream objectOutputStream;
        com.payair.hce.setImportantForAutofill setimportantforautofill = (com.payair.hce.setImportantForAutofill) objArr[0];
        java.io.ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            try {
                byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            } catch (java.lang.Throwable th) {
                th = th;
            }
        } catch (java.io.IOException e) {
            e = e;
            byteArrayOutputStream = null;
            objectOutputStream = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            outputStream = null;
            if (byteArrayOutputStream2 != null) {
                try {
                    byteArrayOutputStream2.close();
                    int i = DigitizedCardProfile;
                    int i2 = (i & (-94)) | ((~i) & 93);
                    int i3 = (i & 93) << 1;
                    getAid = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
                } catch (java.io.IOException unused) {
                }
            }
            if (outputStream != null) {
                throw th;
            }
            int i4 = getAid;
            DigitizedCardProfile = (((i4 & (-12)) | ((~i4) & 11)) + ((i4 & 11) << 1)) % 128;
            try {
                outputStream.close();
                int i5 = getAid;
                int i6 = i5 | 87;
                int i7 = ((i6 << 1) - (~(-((~(i5 & 87)) & i6)))) - 1;
                DigitizedCardProfile = i7 % 128;
                if (i7 % 2 == 0) {
                    throw th;
                }
                int i8 = 3 / 5;
                throw th;
            } catch (java.io.IOException unused2) {
                throw th;
            }
        }
        try {
            objectOutputStream = new java.io.ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeObject(setimportantforautofill);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                try {
                    byteArrayOutputStream.close();
                    int i9 = getAid;
                    int i10 = (i9 | 13) << 1;
                    int i11 = -(i9 ^ 13);
                    DigitizedCardProfile = ((i10 ^ i11) + ((i11 & i10) << 1)) % 128;
                } catch (java.io.IOException unused3) {
                }
                try {
                    objectOutputStream.close();
                    getAid = (DigitizedCardProfile + 69) % 128;
                } catch (java.io.IOException unused4) {
                }
                int i12 = DigitizedCardProfile;
                int i13 = ((i12 & 38) + (i12 | 38)) - 1;
                getAid = i13 % 128;
                if (i13 % 2 != 0) {
                    return byteArray;
                }
                throw null;
            } catch (java.io.IOException e2) {
                e = e2;
                e.printStackTrace();
                if (byteArrayOutputStream != null) {
                    try {
                        byteArrayOutputStream.close();
                        DigitizedCardProfile = (getAid + 117) % 128;
                    } catch (java.io.IOException unused5) {
                    }
                }
                if (objectOutputStream != null) {
                    int i14 = DigitizedCardProfile;
                    getAid = ((i14 & 125) + (i14 | 125)) % 128;
                    try {
                        objectOutputStream.close();
                        getAid = (DigitizedCardProfile + 73) % 128;
                    } catch (java.io.IOException unused6) {
                    }
                }
                int i15 = getAid + 105;
                DigitizedCardProfile = i15 % 128;
                if (i15 % 2 == 0) {
                    return null;
                }
                throw new java.lang.ArithmeticException();
            }
        } catch (java.io.IOException e3) {
            e = e3;
            objectOutputStream = null;
        } catch (java.lang.Throwable th3) {
            th = th3;
            outputStream = null;
            byteArrayOutputStream2 = byteArrayOutputStream;
            if (byteArrayOutputStream2 != null) {
            }
            if (outputStream != null) {
            }
        }
    }

    public final byte[] values() {
        return (byte[]) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -542880274, 542880275, java.lang.System.identityHashCode(this));
    }

    public static com.payair.hce.setImportantForAutofill values(byte[] bArr) {
        return (com.payair.hce.setImportantForAutofill) AlternateContactlessPaymentDataJson(new java.lang.Object[]{bArr}, 749555504, -749555504, (int) java.lang.System.currentTimeMillis());
    }
}
