package com.payair.hce;

/* loaded from: classes4.dex */
public class getIccKek {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int SdkCoreBusinessLogicModuleImpl;
    private static char[] getCiacDecline;
    private static int getCvrMaskAnd;
    private static char[] getGpoResponse;
    private static char getPaymentFci;

    @com.payair.hce.setSelectionFromTop(AlternateContactlessPaymentDataJson = false)
    private java.lang.String AlternateContactlessPaymentDataJson;

    @com.payair.hce.setSelectionFromTop(valueOf = "contactlessMdSessionKey")
    private java.lang.String DigitizedCardProfile;

    @com.payair.hce.setSelectionFromTop(valueOf = "dsrpMdSessionKey")
    private java.lang.String IccPrivateKeyCrtComponentsJson;

    @com.payair.hce.setSelectionFromTop(valueOf = "dsrpUmdSingleUseKey")
    private java.lang.String RecordsJson;

    @com.payair.hce.setSelectionFromTop(valueOf = "idn")
    private java.lang.String SdkCoreAlternateContactlessPaymentDataImpl;

    @com.payair.hce.setSelectionFromTop(AlternateContactlessPaymentDataJson = false)
    private java.lang.String getAid;

    @com.payair.hce.setSelectionFromTop(valueOf = "info")
    private java.lang.String getProfileVersion;

    @com.payair.hce.setSelectionFromTop(valueOf = com.visa.cbp.getTicketMetaData$6672$values.values.valueOf)
    private java.lang.String valueOf;

    @com.payair.hce.setSelectionFromTop(valueOf = "hash")
    private java.lang.String values;

    @com.payair.hce.setSelectionFromTop(valueOf = "contactlessUmdSingleUseKey")
    private java.lang.String writeReplace;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ~i;
        int i6 = ~i3;
        int i7 = (i * (-1965)) + (i2 * 984) + ((i | i4) * 983) + (((~(i4 | i6)) | i5) * (-983)) + (((~(i5 | i2)) | (~(i6 | i5))) * 983);
        if (i7 == 1) {
            return values(objArr);
        }
        if (i7 != 2) {
            return i7 != 3 ? valueOf(objArr) : writeReplace(objArr);
        }
        com.payair.hce.getIccKek geticckek = (com.payair.hce.getIccKek) objArr[0];
        int i8 = SdkCoreBusinessLogicModuleImpl;
        getCvrMaskAnd = (i8 + 65) % 128;
        java.lang.String str = geticckek.getAid;
        getCvrMaskAnd = (i8 + 113) % 128;
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, int i, byte b, java.lang.Object[] objArr) {
        int i2;
        int i3 = 4 - (i * 2);
        int i4 = (b * 2) + 65;
        byte[] bArr = $$a;
        int i5 = s * 2;
        byte[] bArr2 = new byte[i5 + 35];
        int i6 = i5 + 34;
        if (bArr == null) {
            int i7 = i4;
            int i8 = 0;
            i4 = i6;
            i4 = (i4 + (-i7)) - 2;
            i3++;
            i2 = i8;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
            if (i2 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = bArr[i3];
            i4 = (i4 + (-i7)) - 2;
            i3++;
            i2 = i8;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(int i, byte b, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4 = 3 - (b * 4);
        int i5 = (i2 * 2) + 65;
        int i6 = i * 2;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[1 - i6];
        int i7 = 0 - i6;
        if (bArr == null) {
            int i8 = i7;
            int i9 = i4;
            int i10 = 0;
            int i11 = i4 + i8;
            i3 = i10;
            int i12 = i9;
            i5 = i11;
            i4 = i12;
            int i13 = i4 + 1;
            bArr2[i3] = (byte) i5;
            if (i3 == i7) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i14 = i5;
            i9 = i13;
            i4 = bArr[i13];
            i10 = i3 + 1;
            i8 = i14;
            int i112 = i4 + i8;
            i3 = i10;
            int i122 = i9;
            i5 = i112;
            i4 = i122;
            int i132 = i4 + 1;
            bArr2[i3] = (byte) i5;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            int i1322 = i4 + 1;
            bArr2[i3] = (byte) i5;
            if (i3 == i7) {
            }
        }
    }

    public final java.lang.String AlternateContactlessPaymentDataJson() {
        int i = (SdkCoreBusinessLogicModuleImpl + 39) % 128;
        getCvrMaskAnd = i;
        java.lang.String str = this.values;
        int i2 = i + 27;
        SdkCoreBusinessLogicModuleImpl = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    public final void valueOf(java.lang.String str) {
        SdkCoreBusinessLogicModuleImpl = (getCvrMaskAnd + 17) % 128;
        this.values = str.toUpperCase();
        SdkCoreBusinessLogicModuleImpl = (getCvrMaskAnd + 51) % 128;
    }

    public final java.lang.String values() {
        int i = getCvrMaskAnd + 115;
        int i2 = i % 128;
        SdkCoreBusinessLogicModuleImpl = i2;
        if (i % 2 == 0) {
            throw null;
        }
        java.lang.String str = this.valueOf;
        int i3 = i2 + 115;
        getCvrMaskAnd = i3 % 128;
        if (i3 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final void writeReplace(java.lang.String str) {
        getCvrMaskAnd = (SdkCoreBusinessLogicModuleImpl + 103) % 128;
        this.valueOf = str.toUpperCase();
        int i = getCvrMaskAnd + 73;
        SdkCoreBusinessLogicModuleImpl = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    public final java.lang.String valueOf() {
        int i = SdkCoreBusinessLogicModuleImpl;
        getCvrMaskAnd = (i + 83) % 128;
        java.lang.String str = this.writeReplace;
        int i2 = i + 47;
        getCvrMaskAnd = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final void DigitizedCardProfile(java.lang.String str) {
        int i = SdkCoreBusinessLogicModuleImpl + 109;
        getCvrMaskAnd = i % 128;
        if (i % 2 == 0) {
            this.writeReplace = str.toUpperCase();
            int i2 = SdkCoreBusinessLogicModuleImpl + 47;
            getCvrMaskAnd = i2 % 128;
            if (i2 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            return;
        }
        this.writeReplace = str.toUpperCase();
        throw null;
    }

    public final java.lang.String DigitizedCardProfile() {
        int i = (SdkCoreBusinessLogicModuleImpl + 73) % 128;
        getCvrMaskAnd = i;
        java.lang.String str = this.DigitizedCardProfile;
        SdkCoreBusinessLogicModuleImpl = (i + 3) % 128;
        return str;
    }

    public final void values(java.lang.String str) {
        getCvrMaskAnd = (SdkCoreBusinessLogicModuleImpl + 81) % 128;
        this.DigitizedCardProfile = str.toUpperCase();
        getCvrMaskAnd = (SdkCoreBusinessLogicModuleImpl + 3) % 128;
    }

    public final java.lang.String writeReplace() {
        int i = SdkCoreBusinessLogicModuleImpl;
        getCvrMaskAnd = (i + 61) % 128;
        java.lang.String str = this.RecordsJson;
        getCvrMaskAnd = (i + 87) % 128;
        return str;
    }

    public final void AlternateContactlessPaymentDataJson(java.lang.String str) {
        getCvrMaskAnd = (SdkCoreBusinessLogicModuleImpl + 11) % 128;
        this.RecordsJson = str.toUpperCase();
        SdkCoreBusinessLogicModuleImpl = (getCvrMaskAnd + 85) % 128;
    }

    public final java.lang.String getProfileVersion() {
        int i = (SdkCoreBusinessLogicModuleImpl + 21) % 128;
        getCvrMaskAnd = i;
        java.lang.String str = this.IccPrivateKeyCrtComponentsJson;
        SdkCoreBusinessLogicModuleImpl = (i + 35) % 128;
        return str;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.getIccKek geticckek = (com.payair.hce.getIccKek) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = getCvrMaskAnd + 57;
        SdkCoreBusinessLogicModuleImpl = i % 128;
        if (i % 2 != 0) {
            geticckek.IccPrivateKeyCrtComponentsJson = str.toUpperCase();
            return null;
        }
        geticckek.IccPrivateKeyCrtComponentsJson = str.toUpperCase();
        throw null;
    }

    public final java.lang.String RecordsJson() {
        int i = getCvrMaskAnd + 31;
        int i2 = i % 128;
        SdkCoreBusinessLogicModuleImpl = i2;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        java.lang.String str = this.SdkCoreAlternateContactlessPaymentDataImpl;
        int i3 = i2 + 63;
        getCvrMaskAnd = i3 % 128;
        if (i3 % 2 == 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    public final void RecordsJson(java.lang.String str) {
        int i = getCvrMaskAnd + 13;
        SdkCoreBusinessLogicModuleImpl = i % 128;
        if (i % 2 != 0) {
            this.SdkCoreAlternateContactlessPaymentDataImpl = str.toUpperCase();
        } else {
            this.SdkCoreAlternateContactlessPaymentDataImpl = str.toUpperCase();
            throw new java.lang.ArithmeticException();
        }
    }

    private static void b(int[] iArr, java.lang.String str, boolean z, java.lang.Object[] objArr) {
        int i;
        char[] cArr;
        int i2;
        java.lang.String str2 = str;
        byte[] bArr = str2;
        if (str2 != null) {
            $11 = ($10 + 91) % 128;
            byte[] bytes = str2.getBytes("ISO-8859-1");
            $11 = ($10 + 91) % 128;
            bArr = bytes;
        }
        byte[] bArr2 = bArr;
        com.payair.hce.getAccountType getaccounttype = new com.payair.hce.getAccountType();
        int i3 = 0;
        int i4 = iArr[0];
        int i5 = 1;
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr2 = getGpoResponse;
        char c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[i5];
                    objArr2[i3] = java.lang.Integer.valueOf(cArr2[i9]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - android.text.TextUtils.lastIndexOf("", c, i3), 2807 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1));
                        byte b = (byte) $$e;
                        byte b2 = b;
                        cArr = cArr2;
                        i2 = length;
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        d(b, b2, (byte) (b2 | com.google.common.base.Ascii.SYN), objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj);
                    } else {
                        cArr = cArr2;
                        i2 = length;
                    }
                    cArr3[i9] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i9++;
                    cArr2 = cArr;
                    length = i2;
                    i3 = 0;
                    i5 = 1;
                    c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i6];
        java.lang.System.arraycopy(cArr2, i4, cArr4, 0, i6);
        if (bArr2 != null) {
            $11 = ($10 + 51) % 128;
            char[] cArr5 = new char[i6];
            getaccounttype.writeReplace = 0;
            char c2 = 0;
            while (getaccounttype.writeReplace < i6) {
                if (bArr2[getaccounttype.writeReplace] == 1) {
                    int i10 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr4[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c2)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 44, 2836 - android.view.View.combineMeasuredStates(0, 0), (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                        byte b3 = (byte) $$e;
                        byte b4 = b3;
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        d(b3, b4, (byte) (b4 | com.google.common.base.Ascii.NAK), objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj2);
                    }
                    cArr5[i10] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                } else {
                    int i11 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr4[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c2)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2110984860);
                    if (obj3 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(42 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), android.graphics.Color.blue(0) + 2880, (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
                        byte b5 = (byte) $$e;
                        byte b6 = b5;
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        d(b5, b6, (byte) (b6 | com.google.common.base.Ascii.ETB), objArr7);
                        obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2110984860, obj3);
                    }
                    cArr5[i11] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
                }
                c2 = cArr5[getaccounttype.writeReplace];
                java.lang.Object[] objArr8 = {getaccounttype, getaccounttype};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1714689752);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16))).getMethod("l", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1714689752, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr8);
            }
            cArr4 = cArr5;
        }
        if (i8 > 0) {
            char[] cArr6 = new char[i6];
            i = 0;
            java.lang.System.arraycopy(cArr4, 0, cArr6, 0, i6);
            int i12 = i6 - i8;
            java.lang.System.arraycopy(cArr6, 0, cArr4, i12, i8);
            java.lang.System.arraycopy(cArr6, i8, cArr4, 0, i12);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr7 = new char[i6];
            while (true) {
                getaccounttype.writeReplace = i;
                if (getaccounttype.writeReplace >= i6) {
                    break;
                }
                cArr7[getaccounttype.writeReplace] = cArr4[(i6 - getaccounttype.writeReplace) - 1];
                i = getaccounttype.writeReplace + 1;
            }
            cArr4 = cArr7;
        }
        if (i7 > 0) {
            int i13 = 0;
            while (true) {
                getaccounttype.writeReplace = i13;
                if (getaccounttype.writeReplace >= i6) {
                    break;
                }
                cArr4[getaccounttype.writeReplace] = (char) (cArr4[getaccounttype.writeReplace] - iArr[2]);
                i13 = getaccounttype.writeReplace + 1;
            }
        }
        objArr[0] = new java.lang.String(cArr4);
    }

    public final java.lang.String getAid() {
        int i = SdkCoreBusinessLogicModuleImpl;
        getCvrMaskAnd = (i + 89) % 128;
        java.lang.String str = this.getProfileVersion;
        int i2 = i + 7;
        getCvrMaskAnd = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    public final void getAid(java.lang.String str) {
        int i = SdkCoreBusinessLogicModuleImpl + 63;
        getCvrMaskAnd = i % 128;
        if (i % 2 == 0) {
            this.getProfileVersion = str.toUpperCase();
            int i2 = SdkCoreBusinessLogicModuleImpl + 37;
            getCvrMaskAnd = i2 % 128;
            if (i2 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            return;
        }
        this.getProfileVersion = str.toUpperCase();
        throw null;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.getIccKek geticckek = (com.payair.hce.getIccKek) objArr[0];
        int i = getCvrMaskAnd;
        int i2 = i + 89;
        SdkCoreBusinessLogicModuleImpl = i2 % 128;
        java.lang.String str = geticckek.AlternateContactlessPaymentDataJson;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = i + 103;
        SdkCoreBusinessLogicModuleImpl = i3 % 128;
        if (i3 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.getIccKek geticckek = (com.payair.hce.getIccKek) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = SdkCoreBusinessLogicModuleImpl + 79;
        int i2 = i % 128;
        getCvrMaskAnd = i2;
        if (i % 2 == 0) {
            geticckek.AlternateContactlessPaymentDataJson = str;
            SdkCoreBusinessLogicModuleImpl = (i2 + 59) % 128;
            return null;
        }
        geticckek.AlternateContactlessPaymentDataJson = str;
        throw new java.lang.ArithmeticException();
    }

    public final void IccPrivateKeyCrtComponentsJson(java.lang.String str) {
        int i = (getCvrMaskAnd + 53) % 128;
        SdkCoreBusinessLogicModuleImpl = i;
        this.getAid = str;
        int i2 = i + 111;
        getCvrMaskAnd = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static void c(java.lang.String str, int i, byte b, java.lang.Object[] objArr) {
        char[] cArr;
        int i2;
        java.lang.Object obj;
        int length;
        char[] cArr2;
        int i3;
        int i4 = ($11 + 35) % 128;
        $10 = i4;
        if (str != null) {
            $11 = (i4 + 67) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr3 = cArr;
        com.payair.hce.DigitizedCardJson12 digitizedCardJson12 = new com.payair.hce.DigitizedCardJson12();
        char[] cArr4 = getCiacDecline;
        java.lang.Object obj2 = null;
        int i5 = 8;
        if (cArr4 != null) {
            int i6 = $10 + 97;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                length = cArr4.length;
                cArr2 = new char[length];
                i3 = 1;
            } else {
                length = cArr4.length;
                cArr2 = new char[length];
                i3 = 0;
            }
            while (i3 < length) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr4[i3])};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
                    if (obj3 == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.KeyEvent.getMaxKeyCode() >> 16) + 49, 2508 - (android.view.ViewConfiguration.getScrollBarSize() >> i5), (char) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 6802));
                        byte b2 = (byte) $$e;
                        byte b3 = b2;
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        d(b2, b3, b3, objArr3);
                        obj3 = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj3);
                    }
                    cArr2[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr2)).charValue();
                    i3++;
                    i5 = 8;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            $10 = ($11 + 39) % 128;
            cArr4 = cArr2;
        }
        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(getPaymentFci)};
        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
        char c = 6;
        if (obj4 == null) {
            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((android.os.Process.getThreadPriority(0) + 20) >> 6) + 49, android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 2508, (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 6801));
            byte b4 = (byte) $$e;
            byte b5 = b4;
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            d(b4, b5, b5, objArr5);
            obj4 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj4);
        }
        char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr4)).charValue();
        char[] cArr5 = new char[i];
        if (i % 2 != 0) {
            int i7 = $10 + 109;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                i2 = i + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                cArr5[i2] = (char) (cArr3[i2] >> b);
            } else {
                i2 = i - 1;
                cArr5[i2] = (char) (cArr3[i2] - b);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            digitizedCardJson12.values = 0;
            while (digitizedCardJson12.values < i2) {
                digitizedCardJson12.valueOf = cArr3[digitizedCardJson12.values];
                digitizedCardJson12.writeReplace = cArr3[digitizedCardJson12.values + 1];
                if (digitizedCardJson12.valueOf == digitizedCardJson12.writeReplace) {
                    cArr5[digitizedCardJson12.values] = (char) (digitizedCardJson12.valueOf - b);
                    cArr5[digitizedCardJson12.values + 1] = (char) (digitizedCardJson12.writeReplace - b);
                    obj = obj2;
                } else {
                    java.lang.Object[] objArr6 = new java.lang.Object[13];
                    objArr6[12] = digitizedCardJson12;
                    objArr6[11] = java.lang.Integer.valueOf(charValue);
                    objArr6[10] = digitizedCardJson12;
                    objArr6[9] = digitizedCardJson12;
                    objArr6[8] = java.lang.Integer.valueOf(charValue);
                    objArr6[7] = digitizedCardJson12;
                    objArr6[c] = digitizedCardJson12;
                    objArr6[5] = java.lang.Integer.valueOf(charValue);
                    objArr6[4] = digitizedCardJson12;
                    objArr6[3] = digitizedCardJson12;
                    objArr6[2] = java.lang.Integer.valueOf(charValue);
                    objArr6[1] = digitizedCardJson12;
                    objArr6[0] = digitizedCardJson12;
                    java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1553139325);
                    if (obj5 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSize(0, 0) + 29, 3595 - android.os.Process.getGidForName(""), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                        java.lang.Class<?>[] clsArr = new java.lang.Class[13];
                        clsArr[0] = java.lang.Object.class;
                        clsArr[1] = java.lang.Object.class;
                        clsArr[2] = java.lang.Integer.TYPE;
                        clsArr[3] = java.lang.Object.class;
                        clsArr[4] = java.lang.Object.class;
                        clsArr[5] = java.lang.Integer.TYPE;
                        clsArr[c] = java.lang.Object.class;
                        clsArr[7] = java.lang.Object.class;
                        clsArr[8] = java.lang.Integer.TYPE;
                        clsArr[9] = java.lang.Object.class;
                        clsArr[10] = java.lang.Object.class;
                        clsArr[11] = java.lang.Integer.TYPE;
                        clsArr[12] = java.lang.Object.class;
                        obj5 = cls3.getMethod(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, clsArr);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1553139325, obj5);
                    }
                    if (((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr6)).intValue() == digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl) {
                        java.lang.Object[] objArr7 = new java.lang.Object[11];
                        objArr7[10] = digitizedCardJson12;
                        objArr7[9] = java.lang.Integer.valueOf(charValue);
                        objArr7[8] = digitizedCardJson12;
                        objArr7[7] = java.lang.Integer.valueOf(charValue);
                        objArr7[c] = java.lang.Integer.valueOf(charValue);
                        objArr7[5] = digitizedCardJson12;
                        objArr7[4] = digitizedCardJson12;
                        objArr7[3] = java.lang.Integer.valueOf(charValue);
                        objArr7[2] = java.lang.Integer.valueOf(charValue);
                        objArr7[1] = digitizedCardJson12;
                        objArr7[0] = digitizedCardJson12;
                        java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(737480198);
                        if (obj6 == null) {
                            java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 48, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2665, (char) (18889 - android.view.Gravity.getAbsoluteGravity(0, 0)));
                            byte b6 = (byte) $$e;
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            d(b6, b6, (byte) $$d.length, objArr8);
                            java.lang.String str2 = (java.lang.String) objArr8[0];
                            java.lang.Class<?>[] clsArr2 = new java.lang.Class[11];
                            clsArr2[0] = java.lang.Object.class;
                            clsArr2[1] = java.lang.Object.class;
                            clsArr2[2] = java.lang.Integer.TYPE;
                            clsArr2[3] = java.lang.Integer.TYPE;
                            clsArr2[4] = java.lang.Object.class;
                            clsArr2[5] = java.lang.Object.class;
                            clsArr2[c] = java.lang.Integer.TYPE;
                            clsArr2[7] = java.lang.Integer.TYPE;
                            clsArr2[8] = java.lang.Object.class;
                            clsArr2[9] = java.lang.Integer.TYPE;
                            clsArr2[10] = java.lang.Object.class;
                            obj6 = cls4.getMethod(str2, clsArr2);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(737480198, obj6);
                        }
                        obj = null;
                        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(null, objArr7)).intValue();
                        int i8 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i9 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        cArr5[digitizedCardJson12.values] = cArr4[intValue];
                        cArr5[digitizedCardJson12.values + 1] = cArr4[(i8 * charValue) + i9];
                    } else {
                        obj = null;
                        if (digitizedCardJson12.DigitizedCardProfile == digitizedCardJson12.AlternateContactlessPaymentDataJson) {
                            $11 = ($10 + 85) % 128;
                            digitizedCardJson12.RecordsJson = ((digitizedCardJson12.RecordsJson + charValue) - 1) % charValue;
                            digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl = ((digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl + charValue) - 1) % charValue;
                            int i10 = digitizedCardJson12.DigitizedCardProfile;
                            int i11 = digitizedCardJson12.RecordsJson;
                            int i12 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                            int i13 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                            cArr5[digitizedCardJson12.values] = cArr4[(i10 * charValue) + i11];
                            cArr5[digitizedCardJson12.values + 1] = cArr4[(i12 * charValue) + i13];
                        } else {
                            int i14 = digitizedCardJson12.DigitizedCardProfile;
                            int i15 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                            int i16 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                            int i17 = digitizedCardJson12.RecordsJson;
                            cArr5[digitizedCardJson12.values] = cArr4[(i14 * charValue) + i15];
                            cArr5[digitizedCardJson12.values + 1] = cArr4[(i16 * charValue) + i17];
                        }
                    }
                }
                digitizedCardJson12.values += 2;
                $11 = ($10 + 53) % 128;
                obj2 = obj;
                c = 6;
            }
        }
        for (int i18 = 0; i18 < i; i18++) {
            cArr5[i18] = (char) (cArr5[i18] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr5);
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        getCvrMaskAnd = 0;
        SdkCoreBusinessLogicModuleImpl = 1;
        getGpoResponse = new char[]{16811, 16675, 16583, 16591, 16583, 16606, 16580, 16581, 16605, 16702, 16682, 16582, 16607, 16581, 16678, 16702, 16701, 16641, 16643, 16642, 16686, 16685, 16641, 16643, 16659, 16688, 16580, 16582, 16587, 16589, 16583, 16587, 16589, 16582, 16588, 16582, 16582, 16583, 16879, 16774, 16779, 16881, 16793, 16807, 16805, 16830, 16802, 16808, 16780, 16892, 16794, 16813, 16805, 16800, 16775, 16883, 16776, 16881, 16793, 16807, 16805, 16830, 16802, 16808, 16774, 16889, 16782, 16775, 16794, 16773, 16723, 16724, 16732, 16717, 16815, 16831, 16731, 16725, 16721, 16724, 16726, 16712, 16800, 16826, 16825, 16808, 16825, 16731, 16725, 16721, 16724, 16726, 16712, 16800, 16827, 16802, 16800, 16717, 16822, 16801, 16894, 16790, 16812, 16802, 16808, 16802, 16805, 16808, 16810, 16809, 16809, 16793, 16791, 16808, 16810, 16808, 16809, 16874, 16789, 16804, 16804, 16805, 16808, 16802, 16812, 16790, 16812, 16809, 16808, 16810, 16808, 16683, 16678, 16681, 16666, 16687, 16660, 16658, 16680, 16680, 16662, 16892, 16810, 16802, 16829, 16803, 16800, 16824, 16797, 16774, 16810, 16805, 16829, 16799, 16886, 16794, 16805, 16829, 16800, 16809, 16809, 16808, 16812, 16804, 16802, 16795, 16797, 16812, 16805, 16831, 16830, 16827, 16831, 16811, 16805, 16805, 16777, 16798, 16894, 16809, 16807, 16805, 16830, 16802, 16808, 16775, 16774, 16807, 16800, 16831, 16802, 16807, 16831, 16799, 16769, 16800, 16771, 16782, 16784, 16806, 16804, 16809, 16804, 16826, 16829, 16805, 16882, 16803, 16807, 16828, 16791, 16797, 16802, 16824, 16787, 16790, 16831, 16830, 16686, 16685, 16685, 16683, 16685, 16682, 16680, 16640, 16640, 16683, 16675, 16678, 16687, 16687, 16686, 16658, 16682, 16680, 16775, 16726, 16750, 16725, 16730, 16730, 16733, 16705, 16729, 16727, 16730, 16732, 16726, 16726, 16826, 16819, 16727, 16735, 16727, 16750, 16724, 16725, 16749, 16718, 16827, 16735, 16726, 16750, 16816, 16830, 16829, 16785, 16815, 16805};
        getCiacDecline = new char[]{12314, 12315, 12291, 12331, 12327, 12403, 12325, 12321, 12344, 12297, 12415, 12334, 12329, 12410, 12295, 12292, 12388, 12346, 12319, 12320, 12350, 12351, 12313, 12323, 12332, 12335, 12345, 12316, 12328, 12306, 12338, 12318, 12326, 12333, 12317, 12324};
        getPaymentFci = (char) 1494;
    }

    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v18 */
    public static java.lang.Object[] writeReplace(android.content.Context context, int i, int i2) {
        int i3;
        int i4 = 0;
        int i5 = 1;
        try {
            if (context == null) {
                java.lang.Object[] objArr = {new int[]{i}, new int[]{i}, null, new int[1]};
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((((~(i | (-623655688))) | (-935198680)) * (-502)) - 1873162820) + ((~((~i) | (-553925383))) * (-502)) + (((~(i | (-381273298))) | (-623655688)) * 502))};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 50, 2712 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) android.graphics.Color.blue(0));
                    byte b = (byte) ($$a[14] + 1);
                    byte b2 = b;
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    a(b, b2, b2, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj);
                }
                ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                return objArr;
            }
            try {
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                b(new int[]{0, 38, 157, 33}, "\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001", false, objArr4);
                java.lang.Object[] objArr5 = (java.lang.Object[]) java.lang.reflect.Array.newInstance(java.lang.Class.forName(((java.lang.String) objArr4[0]).intern()), 2);
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                b(new int[]{38, 31, 0, 0}, "\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000", false, objArr6);
                try {
                    java.lang.Object[] objArr7 = {((java.lang.String) objArr6[0]).intern()};
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    b(new int[]{0, 38, 157, 33}, "\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001", false, objArr8);
                    objArr5[0] = java.lang.Class.forName(((java.lang.String) objArr8[0]).intern()).getDeclaredConstructor(java.lang.String.class).newInstance(objArr7);
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    b(new int[]{69, 31, 47, 0}, "\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000", true, objArr9);
                    try {
                        java.lang.Object[] objArr10 = {((java.lang.String) objArr9[0]).intern()};
                        java.lang.Object[] objArr11 = new java.lang.Object[1];
                        b(new int[]{0, 38, 157, 33}, "\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001", false, objArr11);
                        objArr5[1] = java.lang.Class.forName(((java.lang.String) objArr11[0]).intern()).getDeclaredConstructor(java.lang.String.class).newInstance(objArr10);
                        char c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                        try {
                            java.lang.Object[] objArr12 = new java.lang.Object[1];
                            c("\u0005!\u0006\t\u000b\u0012\n\u0011\u0012\f \u0017\u001d\u001f\u0016\u000e\n\u0007 \u0017\u0018\u001f㙆", android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 24, (byte) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 89), objArr12);
                            java.lang.Class<?> cls2 = java.lang.Class.forName(((java.lang.String) objArr12[0]).intern());
                            java.lang.Object[] objArr13 = new java.lang.Object[1];
                            b(new int[]{100, 17, 0, 5}, "\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000", true, objArr13);
                            java.lang.Object invoke = cls2.getMethod(((java.lang.String) objArr13[0]).intern(), null).invoke(context, null);
                            try {
                                java.lang.Object[] objArr14 = new java.lang.Object[1];
                                c("\u0005!\u0006\t\u000b\u0012\n\u0011\u0012\f \u0017\u001d\u001f\u0016\u000e\n\u0007 \u0017\u0018\u001f㙆", (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 23, (byte) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 87), objArr14);
                                java.lang.Class<?> cls3 = java.lang.Class.forName(((java.lang.String) objArr14[0]).intern());
                                java.lang.Object[] objArr15 = new java.lang.Object[1];
                                c("\u001f\u001b\u0012\u0002\u0000\u000f\t\u0001\u001f\u001b\u0015\t\u0001\u001c", 14 - android.text.TextUtils.getCapsMode("", 0, 0), (byte) ((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 119), objArr15);
                                try {
                                    java.lang.Object[] objArr16 = {cls3.getMethod(((java.lang.String) objArr15[0]).intern(), null).invoke(context, null), 64};
                                    int i6 = 8;
                                    java.lang.Object[] objArr17 = new java.lang.Object[1];
                                    c("\u0005!\u0006\t\u000b\u0012\n\u0011\u0012\f \u0017\u001d\u001f\u0016\u000e\u0010\u0005\f\u0004\u0000\u000f\t\u0001\u001f\u001b\u000f\u0002!\u0005\u001f\u001b㙛", android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 34, (byte) (115 - (android.view.ViewConfiguration.getScrollBarSize() >> 8)), objArr17);
                                    java.lang.Class<?> cls4 = java.lang.Class.forName(((java.lang.String) objArr17[0]).intern());
                                    java.lang.Object[] objArr18 = new java.lang.Object[1];
                                    b(new int[]{117, 14, 0, 4}, "\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000", false, objArr18);
                                    java.lang.Object invoke2 = cls4.getMethod(((java.lang.String) objArr18[0]).intern(), java.lang.String.class, java.lang.Integer.TYPE).invoke(invoke, objArr16);
                                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                                    c("\u0005!\u0006\t\u000b\u0012\n\u0011\u0012\f \u0017\u001d\u001f\u0016\u000e\u0010\u0005\f\u0004\u0000\u000f\t\u0001\u001f\u001b\u0005 \u001e\f", (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 30, (byte) (122 - android.view.KeyEvent.normalizeMetaState(0)), objArr19);
                                    java.lang.Class<?> cls5 = java.lang.Class.forName(((java.lang.String) objArr19[0]).intern());
                                    java.lang.Object[] objArr20 = new java.lang.Object[1];
                                    b(new int[]{131, 10, 115, 8}, null, true, objArr20);
                                    java.lang.Object[] objArr21 = (java.lang.Object[]) cls5.getField(((java.lang.String) objArr20[0]).intern()).get(invoke2);
                                    int length = objArr21.length;
                                    int i7 = 0;
                                    while (i7 < length) {
                                        java.lang.Object obj2 = objArr21[i7];
                                        java.lang.Object[] objArr22 = new java.lang.Object[i5];
                                        c("\u001c\u0011\u0007\u0010㘈", android.text.TextUtils.indexOf("", c, i4, i4) + 6, (byte) (101 - android.text.TextUtils.indexOf("", "", i4)), objArr22);
                                        try {
                                            java.lang.Object[] objArr23 = {((java.lang.String) objArr22[i4]).intern()};
                                            java.lang.Object[] objArr24 = new java.lang.Object[i5];
                                            b(new int[]{141, 37, i4, 31}, "\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001", i4, objArr24);
                                            java.lang.Class<?> cls6 = java.lang.Class.forName(((java.lang.String) objArr24[i4]).intern());
                                            int green = android.graphics.Color.green(i4);
                                            byte touchSlop = (byte) ((android.view.ViewConfiguration.getTouchSlop() >> i6) + 83);
                                            java.lang.Object[] objArr25 = new java.lang.Object[i5];
                                            c("\u001f\u001b\u001a\b \u001d\u0015\u0002\u001e\u0011㙒", green + 11, touchSlop, objArr25);
                                            java.lang.String intern = ((java.lang.String) objArr25[i4]).intern();
                                            java.lang.Class<?>[] clsArr = new java.lang.Class[1];
                                            clsArr[i4] = java.lang.String.class;
                                            java.lang.Object invoke3 = cls6.getMethod(intern, clsArr).invoke(null, objArr23);
                                            try {
                                                java.lang.Object[] objArr26 = new java.lang.Object[1];
                                                b(new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE, 28, i4, i4}, "\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001", i4, objArr26);
                                                java.lang.Class<?> cls7 = java.lang.Class.forName(((java.lang.String) objArr26[i4]).intern());
                                                java.lang.Object[] objArr27 = new java.lang.Object[1];
                                                b(new int[]{206, 11, i4, i4}, "\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001", true, objArr27);
                                                try {
                                                    java.lang.Object[] objArr28 = {new java.io.ByteArrayInputStream((byte[]) cls7.getMethod(((java.lang.String) objArr27[0]).intern(), null).invoke(obj2, null))};
                                                    java.lang.Object[] objArr29 = new java.lang.Object[1];
                                                    b(new int[]{141, 37, 0, 31}, "\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001", false, objArr29);
                                                    java.lang.Class<?> cls8 = java.lang.Class.forName(((java.lang.String) objArr29[0]).intern());
                                                    java.lang.Object[] objArr30 = new java.lang.Object[1];
                                                    b(new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE, 19, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, 0}, "\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001", false, objArr30);
                                                    java.lang.Object invoke4 = cls8.getMethod(((java.lang.String) objArr30[0]).intern(), java.io.InputStream.class).invoke(invoke3, objArr28);
                                                    int length2 = objArr5.length;
                                                    int i8 = 0;
                                                    for (int i9 = 2; i8 < i9; i9 = 2) {
                                                        java.lang.Object obj3 = objArr5[i8];
                                                        try {
                                                            java.lang.Object[] objArr31 = new java.lang.Object[1];
                                                            b(new int[]{236, 34, 45, 10}, "\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000", false, objArr31);
                                                            java.lang.Class<?> cls9 = java.lang.Class.forName(((java.lang.String) objArr31[0]).intern());
                                                            java.lang.Object[] objArr32 = new java.lang.Object[1];
                                                            c("\u001f\u001b\u0015\u0017\u0016\u001b\u0019\u001f\u000e\u0012\u001c\u000b㖱㖱\u0002\u0006\u001d\u0005\u0011\u0012\u000f\u0005㗽", android.view.View.resolveSize(0, 0) + 23, (byte) (android.graphics.ImageFormat.getBitsPerPixel(0) + 8), objArr32);
                                                            if (obj3.equals(cls9.getMethod(((java.lang.String) objArr32[0]).intern(), null).invoke(invoke4, null))) {
                                                                java.lang.Object[] objArr33 = {new int[]{i}, new int[]{i ^ 1}, null, new int[1]};
                                                                try {
                                                                    java.lang.Object[] objArr34 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf(((((-17854723) | i) * (-627)) - 264790560) + (((~((-984583854) | i)) | 20345131) * (-627)) + (((~((~i) | 984583853)) | (~(20345131 | i))) * 627))};
                                                                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                    if (obj4 == null) {
                                                                        java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTapTimeout() >> 16) + 50, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2713, (char) android.view.View.MeasureSpec.getMode(0));
                                                                        byte b3 = (byte) ($$a[14] + 1);
                                                                        byte b4 = b3;
                                                                        java.lang.Object[] objArr35 = new java.lang.Object[1];
                                                                        a(b3, b4, b4, objArr35);
                                                                        obj4 = cls10.getMethod((java.lang.String) objArr35[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj4);
                                                                    }
                                                                    ((int[]) objArr33[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr34)).intValue();
                                                                    return objArr33;
                                                                } catch (java.lang.Throwable th) {
                                                                    java.lang.Throwable cause = th.getCause();
                                                                    if (cause != null) {
                                                                        throw cause;
                                                                    }
                                                                    throw th;
                                                                }
                                                            }
                                                            i8++;
                                                        } catch (java.lang.Throwable th2) {
                                                            java.lang.Throwable cause2 = th2.getCause();
                                                            if (cause2 != null) {
                                                                throw cause2;
                                                            }
                                                            throw th2;
                                                        }
                                                    }
                                                    i7++;
                                                    i6 = 8;
                                                    c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                                                    i4 = 0;
                                                    i5 = 1;
                                                } catch (java.lang.Throwable th3) {
                                                    java.lang.Throwable cause3 = th3.getCause();
                                                    if (cause3 != null) {
                                                        throw cause3;
                                                    }
                                                    throw th3;
                                                }
                                            } catch (java.lang.Throwable th4) {
                                                java.lang.Throwable cause4 = th4.getCause();
                                                if (cause4 != null) {
                                                    throw cause4;
                                                }
                                                throw th4;
                                            }
                                        } catch (java.lang.Throwable th5) {
                                            java.lang.Throwable cause5 = th5.getCause();
                                            if (cause5 != null) {
                                                throw cause5;
                                            }
                                            throw th5;
                                        }
                                    }
                                    i3 = i5;
                                } catch (java.lang.Throwable th6) {
                                    java.lang.Throwable cause6 = th6.getCause();
                                    if (cause6 != null) {
                                        throw cause6;
                                    }
                                    throw th6;
                                }
                            } catch (java.lang.Throwable th7) {
                                java.lang.Throwable cause7 = th7.getCause();
                                if (cause7 != null) {
                                    throw cause7;
                                }
                                throw th7;
                            }
                        } catch (java.lang.Throwable th8) {
                            java.lang.Throwable cause8 = th8.getCause();
                            if (cause8 != null) {
                                throw cause8;
                            }
                            throw th8;
                        }
                    } catch (java.lang.Throwable th9) {
                        java.lang.Throwable cause9 = th9.getCause();
                        if (cause9 != null) {
                            throw cause9;
                        }
                        throw th9;
                    }
                } catch (java.lang.Throwable th10) {
                    java.lang.Throwable cause10 = th10.getCause();
                    if (cause10 != null) {
                        throw cause10;
                    }
                    throw th10;
                }
            } catch (java.lang.Throwable unused) {
                i3 = 1;
            }
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            iArr[0] = i;
            iArr2[0] = i;
            java.lang.Object[] objArr36 = {iArr, iArr2, null, new int[i3]};
            java.lang.Object[] objArr37 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((-46248579) | i) * (-381)) + 1595042402 + (((~((~i) | (-49132203))) | 1010696233) * 381) + 440839034)};
            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
            if (obj5 == null) {
                java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.green(0) + 50, 2713 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1));
                byte b5 = (byte) ($$a[14] + 1);
                byte b6 = b5;
                java.lang.Object[] objArr38 = new java.lang.Object[1];
                a(b5, b6, b6, objArr38);
                obj5 = cls11.getMethod((java.lang.String) objArr38[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj5);
            }
            ((int[]) objArr36[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr37)).intValue();
            return objArr36;
        } catch (java.lang.Throwable th11) {
            java.lang.Throwable cause11 = th11.getCause();
            if (cause11 != null) {
                throw cause11;
            }
            throw th11;
        }
    }

    @com.payair.hce.setSelectionFromTop(AlternateContactlessPaymentDataJson = false)
    public final java.lang.String SdkCoreAlternateContactlessPaymentDataImpl() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, 653749449, -653749447, java.lang.System.identityHashCode(this));
    }

    public final void SdkCoreAlternateContactlessPaymentDataImpl(java.lang.String str) {
        DigitizedCardProfile(new java.lang.Object[]{this, str}, -1394939859, 1394939859, java.lang.System.identityHashCode(this));
    }

    static void init$1() {
        $$d = new byte[]{82, -59, -67, 97};
        $$e = 0;
    }

    @com.payair.hce.setSelectionFromTop(AlternateContactlessPaymentDataJson = false)
    public final java.lang.String IccPrivateKeyCrtComponentsJson() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, -1760992470, 1760992471, java.lang.System.identityHashCode(this));
    }

    static void init$0() {
        $$a = new byte[]{com.visa.cbp.getEncExpo.IResultReceiver2, 75, 70, 2, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1};
        $$b = 247;
    }

    public final void getProfileVersion(java.lang.String str) {
        DigitizedCardProfile(new java.lang.Object[]{this, str}, 448933053, -448933050, java.lang.System.identityHashCode(this));
    }
}
