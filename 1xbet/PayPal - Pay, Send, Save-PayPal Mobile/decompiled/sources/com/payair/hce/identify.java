package com.payair.hce;

/* loaded from: classes4.dex */
public final class identify {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static char[] AlternateContactlessPaymentDataJson;
    private static boolean IccPrivateKeyCrtComponentsJson;
    private static int RecordsJson;
    private static boolean SdkCoreAlternateContactlessPaymentDataImpl;
    private static int getAid;
    private static final int getCvrMaskAnd = 0;
    private static final byte[] getGpoResponse = null;
    private static int getProfileVersion;
    private java.lang.String DigitizedCardProfile;
    private java.lang.String valueOf;
    private byte[] values;
    private byte[] writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(short s, int i, int i2, java.lang.Object[] objArr) {
        int i3;
        byte[] bArr = $$a;
        int i4 = 37 - (i2 * 33);
        int i5 = 118 - (s * 19);
        int i6 = i * 27;
        byte[] bArr2 = new byte[i6 + 7];
        if (bArr == null) {
            int i7 = i4;
            int i8 = 0;
            i5 += -i4;
            i4 = i7 + 1;
            i3 = i8;
            bArr2[i3] = (byte) i5;
            i8 = i3 + 1;
            if (i3 == i6 + 6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = i4;
            i4 = bArr[i4];
            i5 += -i4;
            i4 = i7 + 1;
            i3 = i8;
            bArr2[i3] = (byte) i5;
            i8 = i3 + 1;
            if (i3 == i6 + 6) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i5;
            i8 = i3 + 1;
            if (i3 == i6 + 6) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Type inference failed for: r8v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(byte b, byte b2, byte b3, java.lang.Object[] objArr) {
        int i;
        int i2;
        byte[] bArr = $$d;
        ?? r8 = 118 - (b3 * 2);
        int i3 = (b * 4) + 4;
        int i4 = 1 - (b2 * 4);
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            byte b4 = r8;
            i = 0;
            int i5 = i3;
            int i6 = i5 + 1;
            i2 = i3 + b4;
            i3 = i6;
            bArr2[i] = (byte) i2;
            i++;
            if (i == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            b4 = bArr[i3];
            int i7 = i2;
            i5 = i3;
            i3 = i7;
            int i62 = i5 + 1;
            i2 = i3 + b4;
            i3 = i62;
            bArr2[i] = (byte) i2;
            i++;
            if (i == i4) {
            }
        } else {
            i = 0;
            i2 = r8;
            bArr2[i] = (byte) i2;
            i++;
            if (i == i4) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        return writeReplace(objArr);
    }

    public final java.lang.String AlternateContactlessPaymentDataJson() {
        int i = getAid;
        RecordsJson = (i + 65) % 128;
        java.lang.String str = this.DigitizedCardProfile;
        RecordsJson = (i + 113) % 128;
        return str;
    }

    public final void AlternateContactlessPaymentDataJson(java.lang.String str) {
        int i = RecordsJson + 93;
        getAid = i % 128;
        if (i % 2 == 0) {
            this.DigitizedCardProfile = str;
        } else {
            this.DigitizedCardProfile = str;
            throw new java.lang.ArithmeticException();
        }
    }

    public final byte[] values() {
        int i = getAid;
        RecordsJson = (i + 99) % 128;
        byte[] bArr = this.writeReplace;
        RecordsJson = (i + 107) % 128;
        return bArr;
    }

    public final void valueOf(byte[] bArr) {
        int i = getAid;
        RecordsJson = (i + 13) % 128;
        this.writeReplace = bArr;
        int i2 = i + 115;
        RecordsJson = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public final java.lang.String valueOf() {
        int i = (getAid + 33) % 128;
        RecordsJson = i;
        java.lang.String str = this.valueOf;
        int i2 = i + 79;
        getAid = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final void writeReplace(java.lang.String str) {
        int i = getAid + 9;
        RecordsJson = i % 128;
        if (i % 2 != 0) {
            this.valueOf = str;
        } else {
            this.valueOf = str;
            throw new java.lang.ArithmeticException();
        }
    }

    public final byte[] DigitizedCardProfile() {
        int i = RecordsJson;
        int i2 = i + 125;
        getAid = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        byte[] bArr = this.values;
        int i3 = i + 119;
        getAid = i3 % 128;
        if (i3 % 2 == 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.identify identifyVar = (com.payair.hce.identify) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int i = getAid + 57;
        RecordsJson = i % 128;
        if (i % 2 != 0) {
            identifyVar.values = bArr;
            return null;
        }
        identifyVar.values = bArr;
        throw new java.lang.ArithmeticException();
    }

    private static void b(int i, int[] iArr, java.lang.String str, java.lang.String str2, java.lang.Object[] objArr) {
        java.lang.String str3 = str2;
        int i2 = $10 + 111;
        $11 = i2 % 128;
        byte[] bArr = str3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (str3 != null) {
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getUmdGeneration getumdgeneration = new com.payair.hce.getUmdGeneration();
        char[] cArr = AlternateContactlessPaymentDataJson;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                $10 = ($11 + 69) % 128;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i3])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 46, 286 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) ((-16730879) - android.graphics.Color.rgb(0, 0, 0)))).getMethod("y", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj);
                    }
                    cArr2[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(getProfileVersion)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54214860);
        if (obj2 == null) {
            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(45 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE, (char) (android.graphics.Color.argb(0, 0, 0, 0) + 46337))).getMethod("x", java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54214860, obj2);
        }
        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
        if (IccPrivateKeyCrtComponentsJson) {
            getumdgeneration.values = bArr2.length;
            char[] cArr3 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr3[getumdgeneration.valueOf] = (char) (cArr[bArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] + i] - intValue);
                java.lang.Object[] objArr4 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj3 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), 1628 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    d((byte) 0, (byte) 0, (byte) 0, objArr5);
                    obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr4);
            }
            objArr[0] = new java.lang.String(cArr3);
            return;
        }
        if (!SdkCoreAlternateContactlessPaymentDataImpl) {
            getumdgeneration.values = iArr.length;
            char[] cArr4 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr4[getumdgeneration.valueOf] = (char) (cArr[iArr[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
                getumdgeneration.valueOf++;
            }
            objArr[0] = new java.lang.String(cArr4);
            return;
        }
        getumdgeneration.values = charArray.length;
        char[] cArr5 = new char[getumdgeneration.values];
        getumdgeneration.valueOf = 0;
        while (getumdgeneration.valueOf < getumdgeneration.values) {
            cArr5[getumdgeneration.valueOf] = (char) (cArr[charArray[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
            java.lang.Object[] objArr6 = {getumdgeneration, getumdgeneration};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
            if (obj4 == null) {
                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.KeyEvent.getMaxKeyCode() >> 16) + 43, 1629 - (android.os.Process.myTid() >> 22), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                d((byte) 0, (byte) 0, (byte) 0, objArr7);
                obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr5);
    }

    /* JADX WARN: Removed duplicated region for block: B:180:0x040a A[Catch: all -> 0x04ac, TryCatch #8 {all -> 0x04ac, blocks: (B:19:0x03f1, B:20:0x0477, B:178:0x0404, B:180:0x040a, B:181:0x040b, B:18:0x0413, B:195:0x0428, B:197:0x043d, B:199:0x0453, B:205:0x048b, B:207:0x049b), top: B:17:0x0413 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x040b A[Catch: all -> 0x04ac, TryCatch #8 {all -> 0x04ac, blocks: (B:19:0x03f1, B:20:0x0477, B:178:0x0404, B:180:0x040a, B:181:0x040b, B:18:0x0413, B:195:0x0428, B:197:0x043d, B:199:0x0453, B:205:0x048b, B:207:0x049b), top: B:17:0x0413 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0521 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0540 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void writeReplace(long j, long j2) {
        java.lang.Class<?>[] clsArr;
        char c;
        java.lang.Object method;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Throwable cause;
        java.lang.Object cls;
        java.lang.String str;
        java.lang.Object obj3;
        java.lang.Class<?> cls2;
        java.lang.Object[] objArr;
        com.payair.hce.onRegistrationCompleted onregistrationcompleted = new com.payair.hce.onRegistrationCompleted(j, j2);
        byte[] bArr = getGpoResponse;
        char c2 = kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA;
        short s = bArr[44];
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a((short) 73, s, (short) (s | 461), objArr2);
        java.lang.String str2 = (java.lang.String) objArr2[0];
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        int i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE;
        a((short) 74, 283, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE, objArr3);
        try {
            java.lang.Object[] objArr4 = {(java.lang.String) objArr3[0]};
            char c3 = 28;
            byte b = bArr[28];
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            a(b, (short) (b | 256), com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE, objArr5);
            java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr5[0]);
            byte b2 = bArr[71];
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            a(b2, (short) (b2 | com.google.common.base.Ascii.DC4), 163, objArr6);
            java.lang.String str3 = (java.lang.String) objArr6[0];
            byte b3 = bArr[28];
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            a(b3, (short) (b3 | 256), com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE, objArr7);
            java.lang.Object[] objArr8 = (java.lang.Object[]) cls3.getMethod(str3, java.lang.Class.forName((java.lang.String) objArr7[0])).invoke(str2, objArr4);
            int[] iArr = new int[objArr8.length];
            int i2 = 0;
            while (true) {
                clsArr = null;
                if (i2 >= objArr8.length) {
                    break;
                }
                java.lang.Object[] objArr9 = {objArr8[i2]};
                byte[] bArr2 = getGpoResponse;
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                a(bArr2[c3], com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE, 159, objArr10);
                java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr10[0]);
                byte b4 = bArr2[c2];
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                a(b4, (short) (b4 | com.google.common.base.Ascii.NAK), 143, objArr11);
                java.lang.String str4 = (java.lang.String) objArr11[0];
                byte b5 = bArr2[c3];
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                a(b5, (short) (b5 | 256), com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE, objArr12);
                java.lang.Object invoke = cls4.getMethod(str4, java.lang.Class.forName((java.lang.String) objArr12[0])).invoke(null, objArr9);
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                a(bArr2[28], com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE, 159, objArr13);
                java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr13[0]);
                java.lang.Object[] objArr14 = new java.lang.Object[1];
                a(bArr2[293], com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE, 137, objArr14);
                iArr[i2] = ((java.lang.Integer) cls5.getMethod((java.lang.String) objArr14[0], null).invoke(invoke, null)).intValue();
                i2++;
                c2 = kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA;
                c3 = 28;
            }
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                try {
                } catch (java.lang.Throwable th) {
                    th = th;
                    if (i4 < 20) {
                    }
                    if (i4 >= 77) {
                    }
                    throw th;
                }
                switch (onregistrationcompleted.valueOf(iArr[i3])) {
                    case -36:
                        i3 = 80;
                    case -35:
                        onregistrationcompleted.valueOf(32);
                        int i5 = onregistrationcompleted.DigitizedCardProfile;
                        i3 = (i5 == 0 || i5 != 1) ? 76 : 53;
                        i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE;
                        clsArr = null;
                    case -34:
                        i3 = 81;
                        i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE;
                        clsArr = null;
                    case -33:
                        i3 = 83;
                        i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE;
                        clsArr = null;
                    case -32:
                        onregistrationcompleted.valueOf(26);
                        if (onregistrationcompleted.DigitizedCardProfile == 0) {
                            i3 = 74;
                            i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE;
                            clsArr = null;
                        }
                        i3 = i4;
                        i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE;
                        clsArr = null;
                    case -31:
                        i3 = 1;
                    case -30:
                        i3 = 65;
                        i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE;
                        clsArr = null;
                    case -29:
                        try {
                            onregistrationcompleted.valueOf(26);
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            if (i4 < 20) {
                            }
                            if (i4 >= 77) {
                                break;
                            }
                            throw th;
                        }
                        if (onregistrationcompleted.DigitizedCardProfile == 0) {
                            i3 = 64;
                            i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE;
                            clsArr = null;
                        }
                        i3 = i4;
                        i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE;
                        clsArr = null;
                        break;
                    case -28:
                        onregistrationcompleted.AlternateContactlessPaymentDataJson = 1;
                        onregistrationcompleted.valueOf(3);
                        onregistrationcompleted.valueOf(7);
                        RecordsJson = onregistrationcompleted.DigitizedCardProfile;
                        i3 = i4;
                        i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE;
                        clsArr = null;
                    case -27:
                        onregistrationcompleted.AlternateContactlessPaymentDataJson = getAid;
                        onregistrationcompleted.valueOf(5);
                        i3 = i4;
                        i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE;
                        clsArr = null;
                    case -26:
                        return;
                    case -25:
                        i3 = 55;
                        i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE;
                        clsArr = null;
                    case -24:
                        i3 = 66;
                        i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE;
                        clsArr = null;
                    case -23:
                        onregistrationcompleted.AlternateContactlessPaymentDataJson = 3;
                        onregistrationcompleted.valueOf(3);
                        onregistrationcompleted.valueOf(4);
                        java.lang.Class cls6 = (java.lang.Class) onregistrationcompleted.getProfileVersion;
                        onregistrationcompleted.valueOf(4);
                        java.lang.String str5 = (java.lang.String) onregistrationcompleted.getProfileVersion;
                        onregistrationcompleted.valueOf(4);
                        method = cls6.getMethod(str5, (java.lang.Class[]) onregistrationcompleted.getProfileVersion);
                        onregistrationcompleted.IccPrivateKeyCrtComponentsJson = method;
                        onregistrationcompleted.valueOf(2);
                        i3 = i4;
                        i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE;
                        clsArr = null;
                    case -22:
                        byte b6 = (byte) ($$a[23] - 1);
                        byte b7 = b6;
                        java.lang.Object[] objArr15 = new java.lang.Object[1];
                        c(b6, b7, b7, objArr15);
                        method = (java.lang.String) objArr15[0];
                        onregistrationcompleted.IccPrivateKeyCrtComponentsJson = method;
                        onregistrationcompleted.valueOf(2);
                        i3 = i4;
                        i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE;
                        clsArr = null;
                    case -21:
                        onregistrationcompleted.AlternateContactlessPaymentDataJson = 1;
                        onregistrationcompleted.valueOf(3);
                        onregistrationcompleted.valueOf(4);
                        method = java.lang.Class.forName((java.lang.String) onregistrationcompleted.getProfileVersion);
                        onregistrationcompleted.IccPrivateKeyCrtComponentsJson = method;
                        onregistrationcompleted.valueOf(2);
                        i3 = i4;
                        i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE;
                        clsArr = null;
                    case -20:
                        try {
                            byte b8 = $$a[23];
                            byte b9 = b8;
                            java.lang.Object[] objArr16 = new java.lang.Object[1];
                            c(b8, b9, b9, objArr16);
                            method = (java.lang.String) objArr16[0];
                            onregistrationcompleted.IccPrivateKeyCrtComponentsJson = method;
                            onregistrationcompleted.valueOf(2);
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            if (i4 < 20) {
                            }
                            if (i4 >= 77) {
                            }
                            throw th;
                        }
                        i3 = i4;
                        i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE;
                        clsArr = null;
                        break;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                        try {
                            onregistrationcompleted.AlternateContactlessPaymentDataJson = 3;
                            onregistrationcompleted.valueOf(3);
                            onregistrationcompleted.valueOf(4);
                            obj = onregistrationcompleted.getProfileVersion;
                            onregistrationcompleted.valueOf(4);
                            obj2 = onregistrationcompleted.getProfileVersion;
                            onregistrationcompleted.valueOf(4);
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            if (i4 < 20) {
                            }
                            if (i4 >= 77) {
                            }
                            throw th;
                        }
                        try {
                            java.lang.Object[] objArr17 = {obj2, onregistrationcompleted.getProfileVersion};
                            byte[] bArr3 = getGpoResponse;
                            try {
                                java.lang.Object[] objArr18 = new java.lang.Object[1];
                                a(bArr3[28], com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE, (short) (bArr3[315] + 1), objArr18);
                                java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr18[0]);
                                java.lang.Object[] objArr19 = new java.lang.Object[1];
                                a(bArr3[293], com.plaid.internal.EnumC0527g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE, bArr3[6], objArr19);
                                java.lang.String str6 = (java.lang.String) objArr19[0];
                                java.lang.Class<?>[] clsArr2 = new java.lang.Class[2];
                                try {
                                    byte b10 = bArr3[28];
                                    java.lang.Object[] objArr20 = new java.lang.Object[1];
                                    a(b10, (short) (b10 | 256), 43, objArr20);
                                    clsArr2[0] = java.lang.Class.forName((java.lang.String) objArr20[0]);
                                    try {
                                        java.lang.Object[] objArr21 = new java.lang.Object[1];
                                        a(bArr3[315], com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_SHIELD_VALUE, bArr3[44], objArr21);
                                        clsArr2[1] = java.lang.Class.forName((java.lang.String) objArr21[0]);
                                        method = cls7.getMethod(str6, clsArr2).invoke(obj, objArr17);
                                        onregistrationcompleted.IccPrivateKeyCrtComponentsJson = method;
                                        onregistrationcompleted.valueOf(2);
                                        i3 = i4;
                                        i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE;
                                        clsArr = null;
                                    } catch (java.lang.Throwable th5) {
                                        th = th5;
                                        cause = th.getCause();
                                        if (cause != null) {
                                            throw th;
                                        }
                                        throw cause;
                                    }
                                } catch (java.lang.Throwable th6) {
                                    th = th6;
                                    cause = th.getCause();
                                    if (cause != null) {
                                    }
                                }
                            } catch (java.lang.Throwable th7) {
                                th = th7;
                            }
                        } catch (java.lang.Throwable th8) {
                            th = th8;
                        }
                        break;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        c = 'I';
                        onregistrationcompleted.AlternateContactlessPaymentDataJson = 3;
                        onregistrationcompleted.valueOf(3);
                        onregistrationcompleted.valueOf(4);
                        java.lang.Class cls8 = (java.lang.Class) onregistrationcompleted.getProfileVersion;
                        onregistrationcompleted.valueOf(4);
                        java.lang.String str7 = (java.lang.String) onregistrationcompleted.getProfileVersion;
                        onregistrationcompleted.valueOf(4);
                        onregistrationcompleted.IccPrivateKeyCrtComponentsJson = cls8.getDeclaredMethod(str7, (java.lang.Class[]) onregistrationcompleted.getProfileVersion);
                        onregistrationcompleted.valueOf(2);
                        i3 = i4;
                        i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE;
                        clsArr = null;
                    case -17:
                        c = 'I';
                        byte b11 = getGpoResponse[28];
                        java.lang.Object[] objArr22 = new java.lang.Object[1];
                        a(b11, (short) (b11 | 256), i, objArr22);
                        cls = java.lang.Class.forName((java.lang.String) objArr22[0]);
                        onregistrationcompleted.IccPrivateKeyCrtComponentsJson = cls;
                        onregistrationcompleted.valueOf(2);
                        i3 = i4;
                        i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE;
                        clsArr = null;
                    case -16:
                        c = 'I';
                        onregistrationcompleted.AlternateContactlessPaymentDataJson = 1;
                        onregistrationcompleted.valueOf(3);
                        onregistrationcompleted.valueOf(7);
                        onregistrationcompleted.IccPrivateKeyCrtComponentsJson = new java.lang.Class[onregistrationcompleted.DigitizedCardProfile];
                        onregistrationcompleted.valueOf(2);
                        i3 = i4;
                        i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE;
                        clsArr = null;
                    case -15:
                        c = 'I';
                        cls = "AlternateContactlessPaymentDataJson";
                        onregistrationcompleted.IccPrivateKeyCrtComponentsJson = cls;
                        onregistrationcompleted.valueOf(2);
                        i3 = i4;
                        i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE;
                        clsArr = null;
                    case -14:
                        c = 'I';
                        cls = com.payair.hce.setLongClickable.class;
                        onregistrationcompleted.IccPrivateKeyCrtComponentsJson = cls;
                        onregistrationcompleted.valueOf(2);
                        i3 = i4;
                        i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE;
                        clsArr = null;
                    case -13:
                        c = 'I';
                        onregistrationcompleted.AlternateContactlessPaymentDataJson = 1;
                        onregistrationcompleted.valueOf(3);
                        onregistrationcompleted.valueOf(7);
                        int i6 = onregistrationcompleted.DigitizedCardProfile;
                        byte b12 = getGpoResponse[28];
                        java.lang.Object[] objArr23 = new java.lang.Object[1];
                        a(b12, (short) (b12 | 256), 43, objArr23);
                        cls = java.lang.reflect.Array.newInstance(java.lang.Class.forName((java.lang.String) objArr23[0]), i6);
                        onregistrationcompleted.IccPrivateKeyCrtComponentsJson = cls;
                        onregistrationcompleted.valueOf(2);
                        i3 = i4;
                        i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE;
                        clsArr = null;
                    case -12:
                        onregistrationcompleted.valueOf(11);
                        throw ((java.lang.Throwable) onregistrationcompleted.getProfileVersion);
                    case -11:
                        i3 = 18;
                    case -10:
                        i3 = 15;
                    case -9:
                        c = 'I';
                        onregistrationcompleted.valueOf(9);
                        if (onregistrationcompleted.DigitizedCardProfile == 0) {
                            i3 = 14;
                        } else {
                            i3 = i4;
                            i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE;
                            clsArr = null;
                        }
                    case -8:
                        c = 'I';
                        try {
                            onregistrationcompleted.AlternateContactlessPaymentDataJson = 1;
                            onregistrationcompleted.valueOf(3);
                            onregistrationcompleted.valueOf(4);
                            java.lang.Object obj4 = onregistrationcompleted.getProfileVersion;
                            try {
                                byte[] bArr4 = getGpoResponse;
                                java.lang.Object[] objArr24 = new java.lang.Object[1];
                                a(bArr4[28], com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_SHIELD_VALUE, bArr4[446], objArr24);
                                java.lang.Class<?> cls9 = java.lang.Class.forName((java.lang.String) objArr24[0]);
                                java.lang.Object[] objArr25 = new java.lang.Object[1];
                                try {
                                    a(bArr4[357], com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE, (short) (-bArr4[1]), objArr25);
                                    try {
                                        onregistrationcompleted.IccPrivateKeyCrtComponentsJson = cls9.getMethod((java.lang.String) objArr25[0], clsArr).invoke(obj4, clsArr);
                                        onregistrationcompleted.valueOf(2);
                                    } catch (java.lang.Throwable th9) {
                                        th = th9;
                                        if ((i4 < 20 && i4 <= 38) || (i4 >= 38 && i4 <= 48)) {
                                            i4 = 9;
                                        } else {
                                            if (i4 >= 77 || i4 > 80) {
                                                throw th;
                                            }
                                            i4 = 75;
                                        }
                                        onregistrationcompleted.IccPrivateKeyCrtComponentsJson = th;
                                        onregistrationcompleted.valueOf(33);
                                        i3 = i4;
                                        i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE;
                                        clsArr = null;
                                    }
                                } catch (java.lang.Throwable th10) {
                                    th = th10;
                                    java.lang.Throwable cause2 = th.getCause();
                                    if (cause2 == null) {
                                        throw th;
                                    }
                                    throw cause2;
                                }
                            } catch (java.lang.Throwable th11) {
                                th = th11;
                            }
                        } catch (java.lang.Throwable th12) {
                            th = th12;
                        }
                        i3 = i4;
                        i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE;
                        clsArr = null;
                        break;
                    case -7:
                        i3 = 20;
                    case -6:
                        try {
                            onregistrationcompleted.AlternateContactlessPaymentDataJson = 1;
                            onregistrationcompleted.valueOf(3);
                            onregistrationcompleted.valueOf(4);
                            obj3 = onregistrationcompleted.getProfileVersion;
                            try {
                                byte b13 = getGpoResponse[28];
                                java.lang.Object[] objArr26 = new java.lang.Object[1];
                                a(b13, (short) (b13 | 256), i, objArr26);
                                cls2 = java.lang.Class.forName((java.lang.String) objArr26[0]);
                                objArr = new java.lang.Object[1];
                                c = 'I';
                                try {
                                    a(r6[293], com.plaid.internal.EnumC0527g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE, 73, objArr);
                                } catch (java.lang.Throwable th13) {
                                    th = th13;
                                    java.lang.Throwable cause3 = th.getCause();
                                    if (cause3 == null) {
                                        throw th;
                                    }
                                    throw cause3;
                                }
                            } catch (java.lang.Throwable th14) {
                                th = th14;
                            }
                        } catch (java.lang.Throwable th15) {
                            th = th15;
                            c = 'I';
                        }
                        try {
                            onregistrationcompleted.IccPrivateKeyCrtComponentsJson = cls2.getMethod((java.lang.String) objArr[0], clsArr).invoke(obj3, clsArr);
                            onregistrationcompleted.valueOf(2);
                        } catch (java.lang.Throwable th16) {
                            th = th16;
                            if (i4 < 20) {
                            }
                            if (i4 >= 77) {
                            }
                            throw th;
                        }
                        i3 = i4;
                        i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE;
                        clsArr = null;
                        break;
                    case -5:
                        onregistrationcompleted.AlternateContactlessPaymentDataJson = 4;
                        onregistrationcompleted.valueOf(3);
                        onregistrationcompleted.valueOf(7);
                        int i7 = onregistrationcompleted.DigitizedCardProfile;
                        onregistrationcompleted.valueOf(4);
                        int[] iArr2 = (int[]) onregistrationcompleted.getProfileVersion;
                        onregistrationcompleted.valueOf(4);
                        java.lang.String str8 = (java.lang.String) onregistrationcompleted.getProfileVersion;
                        onregistrationcompleted.valueOf(4);
                        java.lang.Object[] objArr27 = new java.lang.Object[1];
                        b(i7, iArr2, str8, (java.lang.String) onregistrationcompleted.getProfileVersion, objArr27);
                        str = (java.lang.String) objArr27[0];
                        onregistrationcompleted.IccPrivateKeyCrtComponentsJson = str;
                        onregistrationcompleted.valueOf(2);
                        i3 = i4;
                        i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE;
                        clsArr = null;
                    case -4:
                        str = "\u0083\u0082\u0081";
                        onregistrationcompleted.IccPrivateKeyCrtComponentsJson = str;
                        onregistrationcompleted.valueOf(2);
                        i3 = i4;
                        i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE;
                        clsArr = null;
                    case -3:
                        onregistrationcompleted.AlternateContactlessPaymentDataJson = 1;
                        onregistrationcompleted.valueOf(3);
                        onregistrationcompleted.valueOf(4);
                        try {
                            java.lang.Object[] objArr28 = {onregistrationcompleted.getProfileVersion};
                            byte[] bArr5 = getGpoResponse;
                            java.lang.Object[] objArr29 = new java.lang.Object[1];
                            a(bArr5[288], com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE, 130, objArr29);
                            java.lang.Class<?> cls10 = java.lang.Class.forName((java.lang.String) objArr29[0]);
                            java.lang.Object[] objArr30 = new java.lang.Object[1];
                            a(bArr5[357], com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE, (short) (getCvrMaskAnd | 8), objArr30);
                            java.lang.String str9 = (java.lang.String) objArr30[0];
                            java.lang.Object[] objArr31 = new java.lang.Object[1];
                            a(bArr5[28], com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE, 94, objArr31);
                            onregistrationcompleted.AlternateContactlessPaymentDataJson = ((java.lang.Integer) cls10.getMethod(str9, java.lang.Class.forName((java.lang.String) objArr31[0])).invoke(clsArr, objArr28)).intValue();
                            onregistrationcompleted.valueOf(5);
                            i3 = i4;
                            i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE;
                            clsArr = null;
                        } catch (java.lang.Throwable th17) {
                            java.lang.Throwable cause4 = th17.getCause();
                            if (cause4 == null) {
                                throw th17;
                            }
                            throw cause4;
                        }
                    case -2:
                        str = "";
                        onregistrationcompleted.IccPrivateKeyCrtComponentsJson = str;
                        onregistrationcompleted.valueOf(2);
                        i3 = i4;
                        i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE;
                        clsArr = null;
                    case -1:
                        i3 = 48;
                    default:
                        i3 = i4;
                        i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE;
                        clsArr = null;
                }
            }
            throw th;
        } catch (java.lang.Throwable th18) {
            java.lang.Throwable cause5 = th18.getCause();
            if (cause5 == null) {
                throw th18;
            }
            throw cause5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, int i, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4 = 464 - i2;
        byte[] bArr = getGpoResponse;
        int i5 = 118 - s;
        byte[] bArr2 = new byte[284 - i];
        if (bArr == null) {
            int i6 = i4;
            int i7 = 0;
            i5 += i4;
            i4 = i6;
            i3 = i7;
            bArr2[i3] = (byte) i5;
            int i8 = i4 + 1;
            if (i3 == 283 - i) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i9 = i3 + 1;
            i6 = i8;
            i4 = bArr[i8];
            i7 = i9;
            i5 += i4;
            i4 = i6;
            i3 = i7;
            bArr2[i3] = (byte) i5;
            int i82 = i4 + 1;
            if (i3 == 283 - i) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i5;
            int i822 = i4 + 1;
            if (i3 == 283 - i) {
            }
        }
    }

    static void writeReplace() {
        getGpoResponse = new byte[]{com.visa.cbp.getEncExpo.IResultReceiver, -50, -127, 91, 4, -5, 5, -5, 1, 5, -6, 1, 6, -7, 10, -10, 1, 7, -8, 1, 8, -9, 1, 9, -10, 1, 10, -11, com.google.common.base.Ascii.FF, -12, 1, com.google.common.base.Ascii.VT, -12, com.google.common.base.Ascii.FF, -12, 1, com.google.common.base.Ascii.FF, -13, 1, 4, -1, -4, 1, 4, 0, -5, 5, -1, -4, 5, 1, -6, 1, 4, 1, -6, 5, 1, -6, 1, 4, 1, -6, 5, 2, -7, 1, 4, 2, -7, 5, 3, -8, 5, 4, -9, 5, 5, -10, 1, 4, 3, -8, 1, 4, 4, -9, 5, 2, -7, 1, 4, 5, -10, com.google.common.base.Ascii.FF, -12, 5, 6, -11, 1, 4, 6, -11, 5, 5, -10, 1, 4, 7, -12, 5, -1, -4, 5, 7, -12, 1, 4, 8, -13, 5, 1, -6, 1, 5, -2, -4, 1, 5, -1, -5, 1, 5, 0, -6, 5, 8, -13, 1, 5, 1, -7, 5, 8, -13, 5, 8, -13, 1, 4, 8, -13, 5, 1, -6, 1, 5, 2, -8, 6, -2, -4, 6, -2, -4, 6, -1, -5, 5, 1, -6, 1, 5, 3, -9, 6, 0, -6, 1, 5, 4, -10, 1, 5, 5, -11, 6, 1, -7, 6, 2, -8, 6, 3, -9, 1, 5, 6, -12, 6, -2, -4, 6, -1, -5, 1, 5, 7, -13, 1, 6, -3, -4, 1, 6, -2, -5, 1, 6, -2, -5, 1, 5, 5, -11, 6, 5, -11, 6, 6, -12, 6, 7, -13, 1, 5, 6, -12, 7, -3, -4, 1, 6, -1, -6, 1, 6, 0, -7, 1, 6, 1, -8, 1, 4, 1, -6, 6, 0, -6, 7, -2, -5, 5, 1, -6, 1, 5, 4, -10, 1, 6, 2, -9, 5, 2, -7, 1, 6, 3, -10, 5, 6, -11, 1, 6, 3, -9, com.google.common.base.Ascii.NAK, -21, -51, 62, -11, 13, -7, -57, 37, 33, -2, -9, 5, -7, -3, -4, -3, com.google.common.base.Ascii.VT, -9, com.google.common.base.Ascii.NAK, -21, -51, 62, -11, 13, -7, -57, com.google.common.base.Ascii.ESC, 37, 6, -15, 2, -2, 13, -21, com.google.common.base.Ascii.VT, 9, com.visa.cbp.getEncExpo.onUnminimized, -22, com.google.common.base.Ascii.ETB, 5, 6, -30, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.VT, 9, com.visa.cbp.getEncExpo.onUnminimized, 13, -10, 14, -3, -6, -5, -54, 70, -15, 19, -4, -70, 38, 17, 19, -4, -31, com.google.common.base.Ascii.US, -11, 3, 7, -2, com.google.common.base.Ascii.SI, -32, com.google.common.base.Ascii.RS, -9, 4, 0, -8, -1, -24, com.google.common.base.Ascii.EM, 9, -7, 13, -12, -9, com.google.common.base.Ascii.NAK, -21, -51, 62, -11, 13, -7, -57, com.google.common.base.Ascii.NAK, 37, -7, 17, -31, 18, com.google.common.base.Ascii.FF, 4, com.visa.cbp.getEncExpo.onUnminimized, 9, -11, 2, 5, 6, -15, 13, -4, -9, com.google.common.base.Ascii.NAK, -21, -51, 62, -11, 13, -7, -57, 38, com.google.common.base.Ascii.DC4, 10, -3, 8, -22, 1, 10, -7, -2, com.google.common.base.Ascii.SI, com.visa.cbp.getEncExpo.kernelVersion, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.DC4, -2, -14, -9, com.google.common.base.Ascii.NAK, -21, -51, 62, -11, 13, -7, -57, 33, 19, 8, -5, -2, 17, -9, com.google.common.base.Ascii.NAK, -21, -51, 62, -11, 13, -7, -57, 68, -13, 1, 6, -7, -2, 17, -70, com.google.common.base.Ascii.US, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.SI, -12, 7, -11, 5, 8, -7, -4, -6, -15, com.google.common.base.Ascii.RS, -9, com.google.common.base.Ascii.NAK, -21, -51, 62, -11, 13, -7, -57, 33, 19, 8, -5, -2, 17, -57};
        getCvrMaskAnd = 101;
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        writeReplace();
        getAid = 0;
        RecordsJson = 1;
        AlternateContactlessPaymentDataJson = new char[]{10989, 10775, 10987};
        getProfileVersion = -143185372;
        SdkCoreAlternateContactlessPaymentDataImpl = true;
        IccPrivateKeyCrtComponentsJson = true;
    }

    static void init$1() {
        $$d = new byte[]{115, 113, -43, -44};
        $$e = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE;
    }

    static void init$0() {
        $$a = new byte[]{org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -43, -26, -116, -12, 2, 63, -66, com.google.common.base.Ascii.SI, -24, com.google.common.base.Ascii.CAN, -8, -9, 68, -58, 5, -2, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -69, 14, -15, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -44, 1, -6, com.google.common.base.Ascii.SI, -19, 4, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -41, 3, 6, -8, 10, -1, -10, 7, com.google.common.base.Ascii.NAK, -11, -9, 16, com.google.common.base.Ascii.SYN, -23};
        $$b = 132;
    }

    public final void AlternateContactlessPaymentDataJson(byte[] bArr) {
        values(new java.lang.Object[]{this, bArr}, 315281711, -315281711, java.lang.System.identityHashCode(this));
    }
}
