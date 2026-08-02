package com.payair.hce;

/* loaded from: classes4.dex */
public class getColorStateList implements com.payair.hce.getAttributionSource, com.payair.hce.smallInitialization {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int IccPrivateKeyCrtComponentsJson;
    private static char SdkCoreAlternateContactlessPaymentDataImpl;
    private static long getAid;
    private static int getGpoResponse;
    private static int getProfileVersion;
    private com.payair.hce.obtainStyledAttributes AlternateContactlessPaymentDataJson;
    private final com.payair.hce.sendUpdateRNSInformation DigitizedCardProfile;
    private com.payair.hce.checkPermission RecordsJson;
    private com.payair.hce.getErrors valueOf;
    private com.payair.hce.getApplicationContext values;
    private com.payair.hce.isNetworkError writeReplace = null;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, int i, byte b, java.lang.Object[] objArr) {
        int i2;
        int i3 = b * 2;
        int i4 = s + 102;
        byte[] bArr = $$a;
        int i5 = 4 - (i * 4);
        byte[] bArr2 = new byte[1 - i3];
        if (bArr == null) {
            int i6 = i5;
            int i7 = 0;
            i4 += -i5;
            i5 = i6 + 1;
            i2 = i7;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == 0 - i3) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = i5;
            i5 = bArr[i5];
            i4 += -i5;
            i5 = i6 + 1;
            i2 = i7;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == 0 - i3) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == 0 - i3) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        return writeReplace(objArr);
    }

    public getColorStateList(com.payair.hce.getApplicationContext getapplicationcontext, com.payair.hce.sendUpdateRNSInformation sendupdaternsinformation, com.payair.hce.getErrors geterrors, com.payair.hce.obtainStyledAttributes obtainstyledattributes) {
        int maximumDrawingCacheSize = android.view.ViewConfiguration.getMaximumDrawingCacheSize();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("㨗\uf41f홚㛪", "엫簾硗받쒕N", "⇠\uedc4㩗耲", maximumDrawingCacheSize >> 24, (char) ((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 12858), objArr);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(((java.lang.String) objArr[0]).intern());
        sb.append(com.payair.hce.getColorStateList.class.getName());
        this.RecordsJson = com.payair.hce.checkPermission.DigitizedCardProfile(sb.toString());
        this.DigitizedCardProfile = sendupdaternsinformation;
        this.values = getapplicationcontext;
        this.valueOf = geterrors;
        this.AlternateContactlessPaymentDataJson = obtainstyledattributes;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (r8 != 3) goto L26;
     */
    @Override // com.payair.hce.smallInitialization
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean writeReplace(com.payair.hce.activateCardForToken activatecardfortoken) {
        byte[] values;
        byte[] RecordsJson;
        com.payair.hce.isNetworkError SdkCoreBusinessLogicModuleImpl = this.values.SdkCoreBusinessLogicModuleImpl();
        this.writeReplace = SdkCoreBusinessLogicModuleImpl;
        if (SdkCoreBusinessLogicModuleImpl == null) {
            getGpoResponse = (getProfileVersion + 19) % 128;
            return false;
        }
        int i = com.payair.hce.getColorStateList.AnonymousClass4.writeReplace[activatecardfortoken.ordinal()];
        if (i == 1 || i == 2) {
            if (this.values.DigitizedCardProfile(com.payair.hce.setStatusCode.writeReplace) == com.payair.hce.gotDeleteData.DigitizedCardProfile) {
                byte[] DigitizedCardProfile = this.writeReplace.DigitizedCardProfile();
                return (DigitizedCardProfile == null || DigitizedCardProfile.length == 0) ? false : true;
            }
            int i2 = com.payair.hce.getColorStateList.AnonymousClass4.AlternateContactlessPaymentDataJson[this.values.getPaymentFci().ordinal()];
            if (i2 == 1) {
                byte[] DigitizedCardProfile2 = this.writeReplace.DigitizedCardProfile();
                if (DigitizedCardProfile2 != null) {
                    getProfileVersion = (getGpoResponse + 29) % 128;
                    if (DigitizedCardProfile2.length != 0 && (values = this.writeReplace.values()) != null) {
                        getGpoResponse = (getProfileVersion + 101) % 128;
                        if (values.length != 0) {
                            return true;
                        }
                    }
                }
                return false;
            }
            if (i2 == 2) {
                byte[] DigitizedCardProfile3 = this.writeReplace.DigitizedCardProfile();
                if (DigitizedCardProfile3 == null || DigitizedCardProfile3.length == 0 || (RecordsJson = this.writeReplace.RecordsJson()) == null || RecordsJson.length == 0) {
                    return false;
                }
                getProfileVersion = (getGpoResponse + 81) % 128;
                return true;
            }
        }
        int i3 = com.payair.hce.getColorStateList.AnonymousClass4.AlternateContactlessPaymentDataJson[this.values.getPaymentFci().ordinal()];
        if (i3 == 1) {
            byte[] aid = this.writeReplace.getAid();
            if (aid == null || aid.length == 0) {
                getGpoResponse = (getProfileVersion + 35) % 128;
            } else {
                byte[] AlternateContactlessPaymentDataJson = this.writeReplace.AlternateContactlessPaymentDataJson();
                if (AlternateContactlessPaymentDataJson != null) {
                    int i4 = getProfileVersion;
                    int i5 = i4 + 15;
                    getGpoResponse = i5 % 128;
                    if (i5 % 2 == 0) {
                        int length = AlternateContactlessPaymentDataJson.length;
                        throw null;
                    }
                    if (AlternateContactlessPaymentDataJson.length != 0) {
                        int i6 = i4 + 115;
                        getGpoResponse = i6 % 128;
                        return i6 % 2 != 0;
                    }
                }
            }
            return false;
        }
        if (i3 == 2) {
            byte[] aid2 = this.writeReplace.getAid();
            if (aid2 == null || aid2.length == 0) {
                getProfileVersion = (getGpoResponse + 65) % 128;
            } else {
                int i7 = getProfileVersion + 91;
                getGpoResponse = i7 % 128;
                if (i7 % 2 == 0) {
                    this.writeReplace.SdkCoreAlternateContactlessPaymentDataImpl();
                    throw null;
                }
                byte[] SdkCoreAlternateContactlessPaymentDataImpl2 = this.writeReplace.SdkCoreAlternateContactlessPaymentDataImpl();
                if (SdkCoreAlternateContactlessPaymentDataImpl2 != null && SdkCoreAlternateContactlessPaymentDataImpl2.length != 0) {
                    int i8 = getProfileVersion + 87;
                    getGpoResponse = i8 % 128;
                    if (i8 % 2 != 0) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: com.payair.hce.getColorStateList$4, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] AlternateContactlessPaymentDataJson;
        private static int valueOf = 1;
        private static int values;
        static final /* synthetic */ int[] writeReplace;

        static {
            int[] iArr = new int[com.payair.hce.activateCardForToken.values().length];
            writeReplace = iArr;
            try {
                iArr[com.payair.hce.activateCardForToken.valueOf.ordinal()] = 1;
                int i = valueOf;
                int i2 = (((i & (-30)) | ((~i) & 29)) - (~((i & 29) << 1))) - 1;
                values = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 5 / 5;
                }
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                writeReplace[com.payair.hce.activateCardForToken.writeReplace.ordinal()] = 2;
                valueOf = (values + 87) % 128;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                writeReplace[com.payair.hce.activateCardForToken.values.ordinal()] = 3;
                int i4 = values;
                int i5 = (i4 & 55) + (i4 | 55);
                valueOf = i5 % 128;
                int i6 = i5 % 2;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[com.payair.hce.setOrderRef.values().length];
            AlternateContactlessPaymentDataJson = iArr2;
            try {
                iArr2[com.payair.hce.setOrderRef.AlternateContactlessPaymentDataJson.ordinal()] = 1;
                int i7 = valueOf;
                int i8 = i7 & 29;
                int i9 = (i7 | 29) & (~i8);
                int i10 = -(-(i8 << 1));
                values = ((i9 & i10) + (i9 | i10)) % 128;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                AlternateContactlessPaymentDataJson[com.payair.hce.setOrderRef.writeReplace.ordinal()] = 2;
                int i11 = values;
                int i12 = (i11 & 64) + (i11 | 64);
                valueOf = ((~i12) + (i12 << 1)) % 128;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    private static void a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, char c, java.lang.Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        char c2;
        if (str3 != null) {
            cArr = str3.toCharArray();
            $10 = ($11 + 83) % 128;
        } else {
            cArr = str3;
        }
        char[] cArr3 = cArr;
        char[] charArray = str2 != null ? str2.toCharArray() : str2;
        if (str != null) {
            int i2 = $10 + 75;
            $11 = i2 % 128;
            if (i2 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            cArr2 = str.toCharArray();
        } else {
            cArr2 = str;
        }
        char[] cArr4 = cArr2;
        com.payair.hce.getWalletData getwalletdata = new com.payair.hce.getWalletData();
        int length = cArr3.length;
        char[] cArr5 = new char[length];
        int length2 = cArr4.length;
        char[] cArr6 = new char[length2];
        java.lang.System.arraycopy(cArr3, 0, cArr5, 0, length);
        java.lang.System.arraycopy(cArr4, 0, cArr6, 0, length2);
        cArr5[0] = (char) (cArr5[0] ^ c);
        cArr6[2] = (char) (cArr6[2] + ((char) i));
        int length3 = charArray.length;
        char[] cArr7 = new char[length3];
        getwalletdata.writeReplace = 0;
        while (getwalletdata.writeReplace < length3) {
            $10 = ($11 + 61) % 128;
            try {
                java.lang.Object[] objArr2 = {getwalletdata};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-800817016);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(71 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), android.text.TextUtils.getOffsetBefore("", 0) + 1179, (char) ((-1) - android.view.MotionEvent.axisFromString("")));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b((short) 0, 0, (byte) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-800817016, obj);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                java.lang.Object[] objArr4 = {getwalletdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(811305766);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 3444, (char) (3830 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))))).getMethod("g", java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(811305766, obj2);
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).intValue();
                java.lang.Object[] objArr5 = {getwalletdata, java.lang.Integer.valueOf(cArr5[getwalletdata.writeReplace % 4] * 32718), java.lang.Integer.valueOf(cArr6[intValue])};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2107355451);
                if (obj3 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(25 - android.os.Process.getGidForName(""), android.graphics.Color.rgb(0, 0, 0) + 16779080, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 41776));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    b((short) 3, 0, (byte) 0, objArr6);
                    obj3 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2107355451, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                java.lang.Object[] objArr7 = {java.lang.Integer.valueOf(cArr5[intValue2] * 32718), java.lang.Integer.valueOf(cArr6[intValue])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(140076502);
                if (obj4 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 3133, (char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))));
                    byte length4 = (byte) $$a.length;
                    byte b = (byte) (length4 - 4);
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    b(length4, b, b, objArr8);
                    c2 = 2;
                    obj4 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(140076502, obj4);
                } else {
                    c2 = 2;
                }
                cArr6[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).charValue();
                cArr5[intValue2] = getwalletdata.values;
                cArr7[getwalletdata.writeReplace] = (char) ((((cArr5[intValue2] ^ charArray[getwalletdata.writeReplace]) ^ (getAid ^ 1263759066225628708L)) ^ ((int) (IccPrivateKeyCrtComponentsJson ^ 1263759066225628708L))) ^ ((char) (SdkCoreAlternateContactlessPaymentDataImpl ^ 1263759066225628708L)));
                getwalletdata.writeReplace++;
                $11 = ($10 + 57) % 128;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new java.lang.String(cArr7);
    }

    @Override // com.payair.hce.smallInitialization
    public final boolean values() {
        getProfileVersion = (getGpoResponse + 5) % 128;
        this.AlternateContactlessPaymentDataJson.writeReplace();
        int i = getProfileVersion + 63;
        getGpoResponse = i % 128;
        if (i % 2 != 0) {
            return false;
        }
        throw null;
    }

    @Override // com.payair.hce.getAttributionSource
    public final com.payair.hce.getMainExecutor values(com.payair.hce.activateCardForToken activatecardfortoken) {
        com.payair.hce.initializeVisaPaymentSdk values;
        if (this.writeReplace == null) {
            return null;
        }
        if (activatecardfortoken != com.payair.hce.activateCardForToken.writeReplace) {
            int i = getProfileVersion + 89;
            getGpoResponse = i % 128;
            if (i % 2 == 0) {
                com.payair.hce.activateCardForToken activatecardfortoken2 = com.payair.hce.activateCardForToken.valueOf;
                throw null;
            }
            if (activatecardfortoken != com.payair.hce.activateCardForToken.valueOf) {
                int i2 = com.payair.hce.getColorStateList.AnonymousClass4.AlternateContactlessPaymentDataJson[this.values.getPaymentFci().ordinal()];
                com.payair.hce.initializeVisaPaymentSdk initializevisapaymentsdk = i2 != 1 ? i2 != 2 ? null : new com.payair.hce.initializeVisaPaymentSdk(this.writeReplace.SdkCoreAlternateContactlessPaymentDataImpl()) : values(new com.payair.hce.initializeVisaPaymentSdk(this.writeReplace.AlternateContactlessPaymentDataJson()));
                com.payair.hce.getColorStateList.valueOf valueof = new com.payair.hce.getColorStateList.valueOf(this.values, this.writeReplace.getProfileVersion());
                com.payair.hce.getColorStateList.valueOf.writeReplace(new java.lang.Object[]{valueof, com.payair.hce.activateCardForToken.values}, 539956771, -539956771, java.lang.System.identityHashCode(valueof));
                if (initializevisapaymentsdk != null) {
                    return writeReplace(new com.payair.hce.initializeVisaPaymentSdk(this.writeReplace.getAid()), initializevisapaymentsdk);
                }
                return null;
            }
        }
        int i3 = com.payair.hce.getColorStateList.AnonymousClass4.AlternateContactlessPaymentDataJson[this.values.getPaymentFci().ordinal()];
        if (i3 != 1) {
            values = i3 != 2 ? null : new com.payair.hce.initializeVisaPaymentSdk(this.writeReplace.RecordsJson());
        } else {
            com.payair.hce.initializeVisaPaymentSdk initializevisapaymentsdk2 = new com.payair.hce.initializeVisaPaymentSdk(this.writeReplace.values());
            if (this.values.DigitizedCardProfile(com.payair.hce.setStatusCode.writeReplace) != com.payair.hce.gotDeleteData.DigitizedCardProfile) {
                values = values(initializevisapaymentsdk2);
            } else {
                byte[] RecordsJson = this.writeReplace.RecordsJson();
                if (RecordsJson != null) {
                    int i4 = getGpoResponse;
                    int i5 = i4 + 21;
                    getProfileVersion = i5 % 128;
                    if (i5 % 2 != 0) {
                        int length = RecordsJson.length;
                        throw null;
                    }
                    if (RecordsJson.length != 0) {
                        getProfileVersion = (i4 + 33) % 128;
                        values = new com.payair.hce.initializeVisaPaymentSdk(this.writeReplace.RecordsJson());
                    }
                }
                values = this.DigitizedCardProfile.values(com.payair.hce.startService.DigitizedCardProfile(16));
            }
        }
        com.payair.hce.getColorStateList.valueOf valueof2 = new com.payair.hce.getColorStateList.valueOf(this.values, this.writeReplace.getProfileVersion());
        com.payair.hce.getColorStateList.valueOf.writeReplace(new java.lang.Object[]{valueof2, activatecardfortoken}, 539956771, -539956771, java.lang.System.identityHashCode(valueof2));
        if (values != null) {
            return writeReplace(new com.payair.hce.initializeVisaPaymentSdk(this.writeReplace.DigitizedCardProfile()), values);
        }
        return null;
    }

    @Override // com.payair.hce.getAttributionSource
    public final com.payair.hce.getMainExecutor DigitizedCardProfile() {
        com.payair.hce.initializeVisaPaymentSdk values = this.DigitizedCardProfile.values(com.payair.hce.startService.DigitizedCardProfile(16));
        com.payair.hce.initializeVisaPaymentSdk values2 = this.DigitizedCardProfile.values(com.payair.hce.startService.DigitizedCardProfile(16));
        com.payair.hce.initializeVisaPaymentSdk values3 = this.DigitizedCardProfile.values(com.payair.hce.startService.DigitizedCardProfile(8));
        com.payair.hce.getMainExecutor getmainexecutor = new com.payair.hce.getMainExecutor(new byte[]{0, 1}, (byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{values3}, -1877837077, 1877837077, java.lang.System.identityHashCode(values3)), (byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{values}, -1877837077, 1877837077, java.lang.System.identityHashCode(values)), (byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{values2}, -1877837077, 1877837077, java.lang.System.identityHashCode(values2)));
        int i = getProfileVersion + 53;
        getGpoResponse = i % 128;
        if (i % 2 != 0) {
            return getmainexecutor;
        }
        throw null;
    }

    private com.payair.hce.initializeVisaPaymentSdk values(com.payair.hce.initializeVisaPaymentSdk initializevisapaymentsdk) {
        com.payair.hce.stopService.AlternateContactlessPaymentDataJson((byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{initializevisapaymentsdk}, -1877837077, 1877837077, java.lang.System.identityHashCode(initializevisapaymentsdk)));
        com.payair.hce.getErrors geterrors = this.valueOf;
        if (geterrors != null) {
            int i = getProfileVersion + 41;
            getGpoResponse = i % 128;
            if (i % 2 == 0) {
                geterrors.AlternateContactlessPaymentDataJson();
                throw null;
            }
            if (geterrors.AlternateContactlessPaymentDataJson() != null) {
                try {
                    com.payair.hce.initializeVisaPaymentSdk valueOf2 = this.DigitizedCardProfile.valueOf(this.valueOf, initializevisapaymentsdk);
                    com.payair.hce.stopService.AlternateContactlessPaymentDataJson((byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{valueOf2}, -1877837077, 1877837077, java.lang.System.identityHashCode(valueOf2)));
                    return valueOf2;
                } catch (java.security.GeneralSecurityException unused) {
                    return null;
                }
            }
        }
        int i2 = (getGpoResponse + 103) % 128;
        getProfileVersion = i2;
        getGpoResponse = (i2 + 93) % 128;
        return initializevisapaymentsdk;
    }

    private com.payair.hce.getMainExecutor writeReplace(com.payair.hce.initializeVisaPaymentSdk initializevisapaymentsdk, com.payair.hce.initializeVisaPaymentSdk initializevisapaymentsdk2) {
        int i = getGpoResponse + 61;
        getProfileVersion = i % 128;
        if (i % 2 == 0) {
            com.payair.hce.stopService.AlternateContactlessPaymentDataJson((byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{initializevisapaymentsdk2}, -1877837077, 1877837077, java.lang.System.identityHashCode(initializevisapaymentsdk2)));
            com.payair.hce.stopService.AlternateContactlessPaymentDataJson((byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{initializevisapaymentsdk2}, -1877837077, 1877837077, java.lang.System.identityHashCode(initializevisapaymentsdk2)));
            com.payair.hce.isNetworkError isnetworkerror = this.writeReplace;
            if (isnetworkerror != null) {
                int profileVersion = isnetworkerror.getProfileVersion();
                com.payair.hce.getMainExecutor getmainexecutor = new com.payair.hce.getMainExecutor((byte[]) writeReplace(new java.lang.Object[]{java.lang.Integer.valueOf(profileVersion)}, 1870204542, -1870204542, profileVersion), this.writeReplace.IccPrivateKeyCrtComponentsJson(), (byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{initializevisapaymentsdk}, -1877837077, 1877837077, java.lang.System.identityHashCode(initializevisapaymentsdk)), (byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{initializevisapaymentsdk2}, -1877837077, 1877837077, java.lang.System.identityHashCode(initializevisapaymentsdk2)));
                this.writeReplace.getGpoResponse();
                this.writeReplace = null;
                this.values.getGpoResponse();
                return getmainexecutor;
            }
            int i2 = getGpoResponse + 7;
            getProfileVersion = i2 % 128;
            if (i2 % 2 == 0) {
                return DigitizedCardProfile();
            }
            DigitizedCardProfile();
            throw null;
        }
        com.payair.hce.stopService.AlternateContactlessPaymentDataJson((byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{initializevisapaymentsdk2}, -1877837077, 1877837077, java.lang.System.identityHashCode(initializevisapaymentsdk2)));
        com.payair.hce.stopService.AlternateContactlessPaymentDataJson((byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{initializevisapaymentsdk2}, -1877837077, 1877837077, java.lang.System.identityHashCode(initializevisapaymentsdk2)));
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        java.lang.String hexString = java.lang.Integer.toHexString(((java.lang.Number) objArr[0]).intValue());
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a("㨗\uf41f홚㛪", "\ue05a௰䑿挦", "ꕢチ⸼㹻", android.view.View.resolveSizeAndState(0, 0, 0), (char) (((android.os.Process.getThreadPriority(0) + 20) >> 6) + 31534), objArr2);
        sb.append(((java.lang.String) objArr2[0]).intern().substring(hexString.length()));
        sb.append(hexString);
        byte[] DigitizedCardProfile = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(sb.toString()).DigitizedCardProfile();
        int i = getProfileVersion + 113;
        getGpoResponse = i % 128;
        if (i % 2 != 0) {
            return DigitizedCardProfile;
        }
        throw null;
    }

    class valueOf extends android.os.HandlerThread {
        private static int SdkCoreAlternateContactlessPaymentDataImpl = 1;
        private static int values;
        private int AlternateContactlessPaymentDataJson;
        private com.payair.hce.getApplicationContext DigitizedCardProfile;
        private com.payair.hce.activateCardForToken writeReplace;

        public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
            return writeReplace(objArr);
        }

        valueOf(com.payair.hce.getApplicationContext getapplicationcontext, int i) {
            super(com.payair.hce.getColorStateList.valueOf.class.getSimpleName(), 10);
            this.DigitizedCardProfile = getapplicationcontext;
            this.AlternateContactlessPaymentDataJson = i;
        }

        private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
            com.payair.hce.getColorStateList.valueOf valueof = (com.payair.hce.getColorStateList.valueOf) objArr[0];
            com.payair.hce.activateCardForToken activatecardfortoken = (com.payair.hce.activateCardForToken) objArr[1];
            int i = values;
            int i2 = i ^ 31;
            int i3 = ((i & 31) | i2) << 1;
            int i4 = -i2;
            int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
            SdkCoreAlternateContactlessPaymentDataImpl = i5 % 128;
            if (i5 % 2 != 0) {
                valueof.writeReplace = activatecardfortoken;
                valueof.start();
                return null;
            }
            valueof.writeReplace = activatecardfortoken;
            valueof.start();
            throw null;
        }

        @Override // android.os.HandlerThread
        public void onLooperPrepared() {
            com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus.writeReplace writereplace;
            int i = SdkCoreAlternateContactlessPaymentDataImpl;
            int i2 = i & 35;
            int i3 = (i | 35) & (~i2);
            int i4 = i2 << 1;
            int i5 = (i3 & i4) + (i3 | i4);
            values = i5 % 128;
            if (i5 % 2 != 0) {
                java.lang.Thread.yield();
                com.payair.hce.activateCardForToken activatecardfortoken = com.payair.hce.activateCardForToken.writeReplace;
                throw null;
            }
            java.lang.Thread.yield();
            com.payair.hce.getApplicationContext getapplicationcontext = this.DigitizedCardProfile;
            int i6 = this.AlternateContactlessPaymentDataJson;
            if (this.writeReplace != com.payair.hce.activateCardForToken.writeReplace) {
                int i7 = SdkCoreAlternateContactlessPaymentDataImpl;
                int i8 = i7 & 23;
                values = (i8 + ((i7 ^ 23) | i8)) % 128;
                if (this.writeReplace != com.payair.hce.activateCardForToken.valueOf) {
                    writereplace = com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus.writeReplace.writeReplace;
                    SdkCoreAlternateContactlessPaymentDataImpl = (values + 107) % 128;
                    getapplicationcontext.writeReplace(i6, writereplace);
                    this.DigitizedCardProfile = null;
                    this.AlternateContactlessPaymentDataJson = 0;
                    quitSafely();
                    int i9 = SdkCoreAlternateContactlessPaymentDataImpl;
                    values = (((i9 & (-12)) | ((~i9) & 11)) + ((i9 & 11) << 1)) % 128;
                }
            }
            writereplace = com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus.writeReplace.AlternateContactlessPaymentDataJson;
            int i10 = values & 29;
            SdkCoreAlternateContactlessPaymentDataImpl = (((((r4 ^ 29) | i10) << 1) - (~(-((r4 | 29) & (~i10))))) - 1) % 128;
            getapplicationcontext.writeReplace(i6, writereplace);
            this.DigitizedCardProfile = null;
            this.AlternateContactlessPaymentDataJson = 0;
            quitSafely();
            int i92 = SdkCoreAlternateContactlessPaymentDataImpl;
            values = (((i92 & (-12)) | ((~i92) & 11)) + ((i92 & 11) << 1)) % 128;
        }

        final void valueOf(com.payair.hce.activateCardForToken activatecardfortoken) {
            writeReplace(new java.lang.Object[]{this, activatecardfortoken}, 539956771, -539956771, java.lang.System.identityHashCode(this));
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getProfileVersion = 0;
        getGpoResponse = 1;
        getAid = 2838130289770884147L;
        IccPrivateKeyCrtComponentsJson = -804334044;
        SdkCoreAlternateContactlessPaymentDataImpl = (char) 54820;
    }

    static void init$0() {
        $$a = new byte[]{com.google.common.base.Ascii.DC4, -107, -36, -117};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE;
    }

    private static byte[] values(int i) {
        return (byte[]) writeReplace(new java.lang.Object[]{java.lang.Integer.valueOf(i)}, 1870204542, -1870204542, i);
    }
}
