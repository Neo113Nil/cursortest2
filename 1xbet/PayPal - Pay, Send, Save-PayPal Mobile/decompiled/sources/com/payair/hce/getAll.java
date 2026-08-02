package com.payair.hce;

/* loaded from: classes4.dex */
public final class getAll implements com.payair.hce.accessgetCoroutineScopep, com.payair.hce.insert {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int getApplicationLifeCycleData;
    private static char[] getCardLayoutDescription;
    private static int getCiacDecline;
    private static long getCvmResetTimeout;
    private static int getDualTapResetTimeout;
    private static long getGpoResponse;
    private static char[] getPaymentFci;
    private static int getSecurityWord;
    private com.payair.hce.ResponseCompleteTokenizeDto AlternateContactlessPaymentDataJson;
    private com.payair.hce.getStatusMessage DigitizedCardProfile;
    private com.payair.hce.getKeyCreationTimestamp IccPrivateKeyCrtComponentsJson;
    private com.payair.hce.isVisaOfflinePaymentsSupported RecordsJson;
    private com.payair.hce.disableScreenShotProtection SdkCoreAlternateContactlessPaymentDataImpl;
    private int SdkCoreBusinessLogicModuleImpl;
    private com.payair.hce.setUserValidationRequestListener getAid;
    private com.payair.hce.setAuthenticationAquirer getCvrMaskAnd;
    private com.payair.hce.checkSdkState getProfileVersion;
    private com.payair.hce.getDetailedMessage valueOf;
    private final com.payair.hce.checkPermission values;
    private android.content.Context writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, int i, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4;
        int i5 = 1 - (i * 2);
        int i6 = 99 - (s * 4);
        int i7 = (i2 * 3) + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i8 = i7;
            i4 = 0;
            i6 = (-i6) + i7;
            i7 = i8 + 1;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            byte b = bArr[i7];
            int i9 = i7;
            i7 = i6;
            i6 = b;
            i8 = i9;
            i6 = (-i6) + i7;
            i7 = i8 + 1;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i5) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i5) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        com.payair.hce.getAll getall = (com.payair.hce.getAll) objArr[0];
        com.payair.hce.getStatusMessage getstatusmessage = (com.payair.hce.getStatusMessage) objArr[1];
        int i4 = getDualTapResetTimeout;
        getSecurityWord = (i4 + 25) % 128;
        int i5 = getApplicationLifeCycleData + 27;
        int i6 = i5 % 128;
        getCiacDecline = i6;
        if (i5 % 2 != 0) {
            getSecurityWord = (i4 + 61) % 128;
        }
        getall.DigitizedCardProfile = getstatusmessage;
        getApplicationLifeCycleData = (i6 + 15) % 128;
        return getall;
    }

    public getAll() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1, (char) (51600 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)), android.text.TextUtils.getCapsMode("", 0, 0) + 8, objArr);
        this.values = com.payair.hce.checkPermission.DigitizedCardProfile(((java.lang.String) objArr[0]).intern());
    }

    private static void a(int i, char c, int i2, java.lang.Object[] objArr) {
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i2];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i2) {
            int i3 = getcvmmodel.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(getCardLayoutDescription[i + getcvmmodel.valueOf])};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - android.os.Process.getGidForName(""), 380 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 62388));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b((short) 0, 0, 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                }
                java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(getCvmResetTimeout), java.lang.Integer.valueOf(c)};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 3966 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 40224))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                }
                jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.rgb(0, 0, 0) + 16777250, 212 - (android.os.Process.myPid() >> 22), (char) android.view.View.resolveSizeAndState(0, 0, 0))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i2) {
            $10 = ($11 + 109) % 128;
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr6 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj4 == null) {
                obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - android.text.TextUtils.getCapsMode("", 0, 0), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 211, (char) android.view.View.combineMeasuredStates(0, 0))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
        }
        java.lang.String str = new java.lang.String(cArr);
        int i4 = $11 + 21;
        $10 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }

    @Override // com.payair.hce.accessgetCoroutineScopep
    public final com.payair.hce.accessgetCoroutineScopep writeReplace(int i) {
        int i2 = (getSecurityWord + 67) % 128;
        getDualTapResetTimeout = i2;
        int i3 = getCiacDecline;
        getApplicationLifeCycleData = (i3 + 99) % 128;
        this.SdkCoreBusinessLogicModuleImpl = i;
        getSecurityWord = (i2 + 49) % 128;
        getApplicationLifeCycleData = (i3 + 65) % 128;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0024, code lost:
    
        if ((r0 % 2) == 0) goto L10;
     */
    @Override // com.payair.hce.insert
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h_(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        synchronized (this) {
            int i = getDualTapResetTimeout + 33;
            int i2 = i % 128;
            getSecurityWord = i2;
            if (i % 2 != 0) {
                int i3 = getCiacDecline;
                getApplicationLifeCycleData = i3 + 1190;
                if ((i3 - 59) / 2 == 0) {
                    int i4 = i2 + 83;
                    getDualTapResetTimeout = i4 % 128;
                    int i5 = i4 % 2;
                }
                sQLiteDatabase.execSQL(valueOf(149, 0, (char) 41262).intern());
                sQLiteDatabase.execSQL(valueOf(74, 149, (char) 0).intern());
                sQLiteDatabase.execSQL(valueOf(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, (char) 0).intern());
                sQLiteDatabase.execSQL(valueOf(269, 401, (char) 0).intern());
                sQLiteDatabase.execSQL(valueOf(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, 670, (char) 0).intern());
                sQLiteDatabase.execSQL(valueOf(176, androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_STRING, (char) 27877).intern());
                getDualTapResetTimeout = (getSecurityWord + 97) % 128;
                getCiacDecline = (getApplicationLifeCycleData + 103) % 128;
            } else {
                int i6 = getCiacDecline + 77;
                getApplicationLifeCycleData = i6 % 128;
            }
        }
    }

    @Override // com.payair.hce.insert
    public final void i_(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i) {
        if (this.AlternateContactlessPaymentDataJson != null) {
            com.payair.hce.setNextFocusLeftId setnextfocusleftid = new com.payair.hce.setNextFocusLeftId();
            setnextfocusleftid.t_(sQLiteDatabase, this.writeReplace, this.valueOf, this.AlternateContactlessPaymentDataJson);
            setnextfocusleftid.AlternateContactlessPaymentDataJson(i);
            int i2 = getApplicationLifeCycleData + 95;
            getCiacDecline = i2 % 128;
            if (i2 % 2 != 0) {
                getSecurityWord = (getDualTapResetTimeout + 13) % 128;
                throw new java.lang.ArithmeticException();
            }
            int i3 = getSecurityWord + 33;
            getDualTapResetTimeout = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        getSecurityWord = (getDualTapResetTimeout + 59) % 128;
        getCiacDecline = (getApplicationLifeCycleData + 3) % 128;
    }

    @Override // com.payair.hce.accessgetCoroutineScopep
    public final void DigitizedCardProfile(java.lang.String str, byte[] bArr, java.lang.String str2) throws java.security.GeneralSecurityException {
        synchronized (this) {
            int i = (getDualTapResetTimeout + 109) % 128;
            getSecurityWord = i;
            int i2 = (i + 107) % 128;
            getDualTapResetTimeout = i2;
            int i3 = getCiacDecline + 33;
            getApplicationLifeCycleData = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = i2 + 125;
                getSecurityWord = i4 % 128;
                int i5 = i4 % 2;
            }
            this.RecordsJson.values(str, bArr, str2);
            int i6 = getApplicationLifeCycleData + 85;
            getCiacDecline = i6 % 128;
            if (i6 % 2 != 0) {
                getSecurityWord = (getDualTapResetTimeout + 119) % 128;
                throw new java.lang.ArithmeticException();
            }
            getDualTapResetTimeout = (getSecurityWord + 49) % 128;
        }
    }

    @Override // com.payair.hce.accessgetCoroutineScopep
    public final void AlternateContactlessPaymentDataJson(java.lang.String str, byte[] bArr, java.lang.String str2) {
        synchronized (this) {
            int i = getCiacDecline + 27;
            getApplicationLifeCycleData = i % 128;
            if (i % 2 == 0) {
                getDualTapResetTimeout = (getSecurityWord + 27) % 128;
                this.RecordsJson.valueOf(str, bArr, str2);
                throw new java.lang.NullPointerException();
            }
            this.RecordsJson.valueOf(str, bArr, str2);
            int i2 = getDualTapResetTimeout;
            int i3 = i2 + 33;
            getSecurityWord = i3 % 128;
            int i4 = i3 % 2;
            int i5 = getCiacDecline + 29;
            getApplicationLifeCycleData = i5 % 128;
            if (i5 % 2 == 0) {
                getSecurityWord = (i2 + 43) % 128;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0045 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.payair.hce.accessgetCoroutineScopep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void valueOf(java.lang.String str) {
        int i;
        synchronized (this) {
            int i2 = getDualTapResetTimeout;
            getSecurityWord = (i2 + 101) % 128;
            int i3 = i2 + 41;
            int i4 = i3 % 128;
            getSecurityWord = i4;
            if (i3 % 2 != 0) {
                int i5 = getApplicationLifeCycleData;
                getCiacDecline = (i5 << 18) >> 13627;
                if ((i5 << 22) != 0) {
                    this.RecordsJson.writeReplace(str);
                    i = getApplicationLifeCycleData + 107;
                    getCiacDecline = i % 128;
                    if (i % 2 == 0) {
                        throw new java.lang.ArithmeticException();
                    }
                }
                getDualTapResetTimeout = (i4 + 29) % 128;
                this.RecordsJson.writeReplace(str);
                i = getApplicationLifeCycleData + 107;
                getCiacDecline = i % 128;
                if (i % 2 == 0) {
                }
            } else {
                int i6 = getApplicationLifeCycleData + 11;
                getCiacDecline = i6 % 128;
                if (i6 % 2 != 0) {
                    this.RecordsJson.writeReplace(str);
                    i = getApplicationLifeCycleData + 107;
                    getCiacDecline = i % 128;
                    if (i % 2 == 0) {
                    }
                }
                getDualTapResetTimeout = (i4 + 29) % 128;
                this.RecordsJson.writeReplace(str);
                i = getApplicationLifeCycleData + 107;
                getCiacDecline = i % 128;
                if (i % 2 == 0) {
                }
            }
        }
    }

    @Override // com.payair.hce.accessgetCoroutineScopep
    public final void AlternateContactlessPaymentDataJson(java.lang.String str, com.payair.hce.getNetworkTokenReference getnetworktokenreference) {
        synchronized (this) {
            int i = getSecurityWord + 45;
            getDualTapResetTimeout = i % 128;
            int i2 = i % 2;
            getApplicationLifeCycleData = (getCiacDecline + 95) % 128;
            this.getAid.values(str, getnetworktokenreference);
            int i3 = getDualTapResetTimeout;
            getSecurityWord = (i3 + 61) % 128;
            int i4 = getApplicationLifeCycleData + 3;
            getCiacDecline = i4 % 128;
            if (i4 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            getSecurityWord = (i3 + 93) % 128;
        }
    }

    @Override // com.payair.hce.accessgetCoroutineScopep
    public final com.payair.hce.getNetworkTokenReference writeReplace(java.lang.String str) {
        com.payair.hce.getNetworkTokenReference AlternateContactlessPaymentDataJson;
        synchronized (this) {
            int i = getCiacDecline + 81;
            getApplicationLifeCycleData = i % 128;
            if (i % 2 != 0) {
                int i2 = getDualTapResetTimeout + 97;
                getSecurityWord = i2 % 128;
                if (i2 % 2 == 0) {
                    AlternateContactlessPaymentDataJson = this.getAid.AlternateContactlessPaymentDataJson(str);
                    int i3 = getDualTapResetTimeout;
                    getSecurityWord = (i3 + 25) % 128;
                    int i4 = getCiacDecline + 41;
                    getApplicationLifeCycleData = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = i3 + 21;
                        getSecurityWord = i5 % 128;
                        if (i5 % 2 == 0) {
                            throw new java.lang.NullPointerException();
                        }
                    }
                }
            }
            this.getAid.AlternateContactlessPaymentDataJson(str);
            throw new java.lang.ArithmeticException();
        }
        return AlternateContactlessPaymentDataJson;
    }

    public final void values(com.payair.hce.getNetworkTokenReference getnetworktokenreference) {
        java.lang.String valueOf;
        synchronized (this) {
            int i = getDualTapResetTimeout;
            getSecurityWord = (i + 51) % 128;
            int i2 = getCiacDecline + 55;
            getApplicationLifeCycleData = i2 % 128;
            if (i2 % 2 == 0) {
                getSecurityWord = (i + 81) % 128;
                valueOf = valueOf(100, 652, (char) 0);
            } else {
                valueOf = valueOf(14, 1079, (char) 0);
            }
            AlternateContactlessPaymentDataJson(valueOf.intern(), getnetworktokenreference);
            int i3 = getCiacDecline + 15;
            getApplicationLifeCycleData = i3 % 128;
            if (i3 % 2 == 0) {
                throw new java.lang.NullPointerException();
            }
        }
    }

    public final com.payair.hce.getNetworkTokenReference values() {
        com.payair.hce.getNetworkTokenReference writeReplace;
        synchronized (this) {
            int i = (getSecurityWord + 99) % 128;
            getDualTapResetTimeout = i;
            int i2 = getApplicationLifeCycleData + 79;
            getCiacDecline = i2 % 128;
            if (i2 % 2 != 0) {
                getSecurityWord = (i + 3) % 128;
            }
            writeReplace = writeReplace(valueOf(14, 1079, (char) 0).intern());
            int i3 = getApplicationLifeCycleData + 77;
            getCiacDecline = i3 % 128;
            if (i3 % 2 != 0) {
                throw new java.lang.NullPointerException();
            }
            int i4 = getDualTapResetTimeout;
            getSecurityWord = (i4 + 81) % 128;
            getSecurityWord = (i4 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        }
        return writeReplace;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0024, code lost:
    
        if ((r0 % 2) == 0) goto L10;
     */
    @Override // com.payair.hce.accessgetCoroutineScopep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] DigitizedCardProfile(java.lang.String str) {
        byte[] AlternateContactlessPaymentDataJson;
        synchronized (this) {
            int i = getDualTapResetTimeout + 7;
            int i2 = i % 128;
            getSecurityWord = i2;
            if (i % 2 != 0) {
                int i3 = getApplicationLifeCycleData * 78;
                getCiacDecline = i3 - 26642;
                if ((i3 >> 4) == 0) {
                    AlternateContactlessPaymentDataJson = this.RecordsJson.AlternateContactlessPaymentDataJson(str);
                }
                int i4 = i2 + 63;
                getDualTapResetTimeout = i4 % 128;
                int i5 = i4 % 2;
                this.RecordsJson.AlternateContactlessPaymentDataJson(str);
                throw new java.lang.ArithmeticException();
            }
            int i6 = getApplicationLifeCycleData + 63;
            getCiacDecline = i6 % 128;
        }
        return AlternateContactlessPaymentDataJson;
    }

    @Override // com.payair.hce.accessgetCoroutineScopep
    public final java.lang.String AlternateContactlessPaymentDataJson(java.lang.String str) {
        java.lang.String valueOf;
        synchronized (this) {
            int i = getSecurityWord + 71;
            int i2 = i % 128;
            getDualTapResetTimeout = i2;
            int i3 = i % 2;
            int i4 = getApplicationLifeCycleData + 1;
            getCiacDecline = i4 % 128;
            if (i4 % 2 != 0) {
                this.RecordsJson.valueOf(str);
                throw new java.lang.NullPointerException();
            }
            getSecurityWord = (i2 + 13) % 128;
            valueOf = this.RecordsJson.valueOf(str);
            int i5 = getCiacDecline + 125;
            getApplicationLifeCycleData = i5 % 128;
            if (i5 % 2 == 0) {
                getDualTapResetTimeout = (getSecurityWord + 77) % 128;
                throw new java.lang.NullPointerException();
            }
            int i6 = getDualTapResetTimeout + 3;
            getSecurityWord = i6 % 128;
            int i7 = i6 % 2;
        }
        return valueOf;
    }

    @Override // com.payair.hce.accessgetCoroutineScopep
    public final java.util.List<java.lang.String> DigitizedCardProfile() {
        java.util.List<java.lang.String> IccPrivateKeyCrtComponentsJson;
        synchronized (this) {
            getDualTapResetTimeout = (getSecurityWord + 97) % 128;
            getApplicationLifeCycleData = (getCiacDecline + 67) % 128;
            IccPrivateKeyCrtComponentsJson = this.RecordsJson.IccPrivateKeyCrtComponentsJson();
            getDualTapResetTimeout = (getSecurityWord + 119) % 128;
            getCiacDecline = (getApplicationLifeCycleData + 69) % 128;
        }
        return IccPrivateKeyCrtComponentsJson;
    }

    @Override // com.payair.hce.accessgetCoroutineScopep
    public final void valueOf(java.lang.String str, int i) {
        synchronized (this) {
            int i2 = (getSecurityWord + 59) % 128;
            getDualTapResetTimeout = i2;
            int i3 = (i2 + 63) % 128;
            getSecurityWord = i3;
            int i4 = getCiacDecline + 19;
            getApplicationLifeCycleData = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = i3 + 111;
                getDualTapResetTimeout = i5 % 128;
                if (i5 % 2 != 0) {
                    this.RecordsJson.DigitizedCardProfile(str, i);
                    throw new java.lang.NullPointerException();
                }
            } else {
                int i6 = i2 + 55;
                getSecurityWord = i6 % 128;
                int i7 = i6 % 2;
            }
            this.RecordsJson.DigitizedCardProfile(str, i);
        }
    }

    @Override // com.payair.hce.accessgetCoroutineScopep
    public final int values(java.lang.String str) {
        int values;
        synchronized (this) {
            int i = getSecurityWord + 21;
            getDualTapResetTimeout = i % 128;
            if (i % 2 == 0) {
                int i2 = getApplicationLifeCycleData >>> 120;
                getCiacDecline = i2 * 7123;
                int i3 = i2 / 5;
            } else {
                getCiacDecline = (getApplicationLifeCycleData + 77) % 128;
            }
            values = this.RecordsJson.values(str);
            int i4 = getSecurityWord;
            int i5 = i4 + 71;
            getDualTapResetTimeout = i5 % 128;
            int i6 = i5 % 2;
            int i7 = getApplicationLifeCycleData + 31;
            getCiacDecline = i7 % 128;
            if (i7 % 2 != 0) {
                getDualTapResetTimeout = (i4 + 93) % 128;
                throw new java.lang.NullPointerException();
            }
            int i8 = (i4 + 5) % 128;
            getDualTapResetTimeout = i8;
            int i9 = i8 + 9;
            getSecurityWord = i9 % 128;
            if (i9 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
        }
        return values;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0024, code lost:
    
        if ((r1 % 2) != 0) goto L10;
     */
    @Override // com.payair.hce.accessgetCoroutineScopep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AlternateContactlessPaymentDataJson(java.lang.String str, int i, int i2, java.lang.String str2) {
        synchronized (this) {
            int i3 = getDualTapResetTimeout;
            int i4 = i3 + 109;
            int i5 = i4 % 128;
            getSecurityWord = i5;
            if (i4 % 2 != 0) {
                int i6 = getCiacDecline >>> 71;
                getApplicationLifeCycleData = i6 - 7546;
                if (i6 * 3 != 0) {
                    getSecurityWord = (i3 + 81) % 128;
                    getSecurityWord = (i3 + 15) % 128;
                    this.IccPrivateKeyCrtComponentsJson.valueOf(str, i, i2, str2);
                }
                getDualTapResetTimeout = (i5 + 33) % 128;
                this.IccPrivateKeyCrtComponentsJson.valueOf(str, i, i2, str2);
                throw new java.lang.NullPointerException();
            }
            int i7 = getCiacDecline + 33;
            getApplicationLifeCycleData = i7 % 128;
        }
    }

    @Override // com.payair.hce.accessgetCoroutineScopep
    public final java.util.List<java.lang.String> RecordsJson(java.lang.String str) {
        java.util.List<java.lang.String> values;
        synchronized (this) {
            int i = getCiacDecline + 55;
            getApplicationLifeCycleData = i % 128;
            if (i % 2 != 0) {
                int i2 = getDualTapResetTimeout + 107;
                getSecurityWord = i2 % 128;
                if (i2 % 2 == 0) {
                    values = this.IccPrivateKeyCrtComponentsJson.values(str);
                    getDualTapResetTimeout = (getSecurityWord + 47) % 128;
                }
            } else {
                getSecurityWord = (getDualTapResetTimeout + 93) % 128;
            }
            this.IccPrivateKeyCrtComponentsJson.values(str);
            throw new java.lang.NullPointerException();
        }
        return values;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0024, code lost:
    
        if ((r0 % 2) == 0) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0056 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.payair.hce.accessgetCoroutineScopep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String writeReplace(java.lang.String str, int i) {
        java.lang.String valueOf;
        int i2;
        synchronized (this) {
            int i3 = getDualTapResetTimeout + 101;
            int i4 = i3 % 128;
            getSecurityWord = i4;
            if (i3 % 2 != 0) {
                int i5 = getCiacDecline / 117;
                getApplicationLifeCycleData = i5 + 7623;
                if (i5 * 2 == 0) {
                    int i6 = i4 + 49;
                    getDualTapResetTimeout = i6 % 128;
                    if (i6 % 2 == 0) {
                        valueOf = this.IccPrivateKeyCrtComponentsJson.valueOf(str, i);
                        i2 = getDualTapResetTimeout + 19;
                        getSecurityWord = i2 % 128;
                        if (i2 % 2 == 0) {
                            throw new java.lang.ArithmeticException();
                        }
                    } else {
                        this.IccPrivateKeyCrtComponentsJson.valueOf(str, i);
                        throw new java.lang.ArithmeticException();
                    }
                }
                getDualTapResetTimeout = (i4 + 81) % 128;
                valueOf = this.IccPrivateKeyCrtComponentsJson.valueOf(str, i);
                i2 = getDualTapResetTimeout + 19;
                getSecurityWord = i2 % 128;
                if (i2 % 2 == 0) {
                }
            } else {
                int i7 = getCiacDecline + 25;
                getApplicationLifeCycleData = i7 % 128;
            }
        }
        return valueOf;
    }

    @Override // com.payair.hce.accessgetCoroutineScopep
    public final byte[] DigitizedCardProfile(java.lang.String str, java.lang.String str2) {
        byte[] valueOf;
        synchronized (this) {
            getCiacDecline = (getApplicationLifeCycleData + 35) % 128;
            valueOf = this.IccPrivateKeyCrtComponentsJson.valueOf(str, str2);
            int i = getSecurityWord;
            getDualTapResetTimeout = (i + 93) % 128;
            int i2 = getCiacDecline + 107;
            getApplicationLifeCycleData = i2 % 128;
            if (i2 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            getDualTapResetTimeout = (i + 25) % 128;
            getDualTapResetTimeout = (i + 39) % 128;
        }
        return valueOf;
    }

    @Override // com.payair.hce.accessgetCoroutineScopep
    public final int values(java.lang.String str, java.lang.String str2) {
        int writeReplace;
        synchronized (this) {
            int i = getSecurityWord;
            getDualTapResetTimeout = (i + 33) % 128;
            int i2 = i + 83;
            getDualTapResetTimeout = i2 % 128;
            if (i2 % 2 == 0) {
                getApplicationLifeCycleData = (getCiacDecline % 121) + 5282;
            } else {
                getApplicationLifeCycleData = (getCiacDecline + 47) % 128;
            }
            writeReplace = this.IccPrivateKeyCrtComponentsJson.writeReplace(str, str2);
            int i3 = getApplicationLifeCycleData + 29;
            getCiacDecline = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = getSecurityWord + 59;
                int i5 = i4 % 128;
                getDualTapResetTimeout = i5;
                char c = i4 % 2 == 0 ? '*' : com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR;
                getSecurityWord = (i5 + 21) % 128;
                if (c != 'b') {
                }
            }
            throw new java.lang.NullPointerException();
        }
        return writeReplace;
    }

    @Override // com.payair.hce.accessgetCoroutineScopep
    public final java.lang.String AlternateContactlessPaymentDataJson(java.lang.String str, java.lang.String str2) {
        int i = getCiacDecline + 71;
        getApplicationLifeCycleData = i % 128;
        if (i % 2 != 0) {
            java.lang.String values = this.IccPrivateKeyCrtComponentsJson.values(str, str2);
            int i2 = (getDualTapResetTimeout + 91) % 128;
            getSecurityWord = i2;
            int i3 = getCiacDecline + 47;
            getApplicationLifeCycleData = i3 % 128;
            if (i3 % 2 == 0) {
                getDualTapResetTimeout = (i2 + 89) % 128;
                throw null;
            }
            int i4 = (i2 + 97) % 128;
            getDualTapResetTimeout = i4;
            getSecurityWord = (i4 + 29) % 128;
            return values;
        }
        this.IccPrivateKeyCrtComponentsJson.values(str, str2);
        throw null;
    }

    @Override // com.payair.hce.accessgetCoroutineScopep
    public final void values(java.lang.String str, java.util.List<java.lang.String> list, java.lang.String str2, java.util.List<com.payair.hce.RequestCompleteTokenizeDtoPlatform> list2) {
        synchronized (this) {
            getSecurityWord = (getDualTapResetTimeout + 31) % 128;
            getApplicationLifeCycleData = (getCiacDecline + 105) % 128;
            this.IccPrivateKeyCrtComponentsJson.values(str, list, str2, list2);
            int i = getSecurityWord + 79;
            getDualTapResetTimeout = i % 128;
            int i2 = i % 2;
            getCiacDecline = (getApplicationLifeCycleData + 59) % 128;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002a, code lost:
    
        if ((r1 % 2) == 0) goto L10;
     */
    @Override // com.payair.hce.accessgetCoroutineScopep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void IccPrivateKeyCrtComponentsJson(java.lang.String str) {
        synchronized (this) {
            int i = getSecurityWord;
            getDualTapResetTimeout = (i + 11) % 128;
            int i2 = i + 29;
            int i3 = i2 % 128;
            getDualTapResetTimeout = i3;
            if (i2 % 2 == 0) {
                int i4 = getApplicationLifeCycleData >> 11;
                getCiacDecline = i4 * 28717;
                if ((i4 >>> 4) == 0) {
                    getSecurityWord = (i3 + 43) % 128;
                    this.IccPrivateKeyCrtComponentsJson.valueOf(str);
                    getCiacDecline = (getApplicationLifeCycleData + 19) % 128;
                }
                getDualTapResetTimeout = (i + 9) % 128;
                this.IccPrivateKeyCrtComponentsJson.valueOf(str);
                throw new java.lang.NullPointerException();
            }
            int i5 = getApplicationLifeCycleData + 53;
            getCiacDecline = i5 % 128;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0026, code lost:
    
        if ((r0 % 2) != 0) goto L10;
     */
    @Override // com.payair.hce.accessgetCoroutineScopep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AlternateContactlessPaymentDataJson(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, byte[] bArr) {
        synchronized (this) {
            int i = getDualTapResetTimeout + 49;
            getSecurityWord = i % 128;
            if (i % 2 != 0) {
                int i2 = getCiacDecline / 76;
                getApplicationLifeCycleData = i2 >>> 9100;
                if (i2 * 3 != 0) {
                    this.SdkCoreAlternateContactlessPaymentDataImpl.writeReplace(str, str2, str3, str4, bArr);
                    int i3 = getDualTapResetTimeout;
                    int i4 = (i3 + 5) % 128;
                    getSecurityWord = i4;
                    int i5 = getCiacDecline + 85;
                    getApplicationLifeCycleData = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = i3 + 69;
                        getSecurityWord = i6 % 128;
                        int i7 = i6 % 2;
                        throw new java.lang.NullPointerException();
                    }
                    getDualTapResetTimeout = (i4 + 21) % 128;
                }
                this.SdkCoreAlternateContactlessPaymentDataImpl.writeReplace(str, str2, str3, str4, bArr);
                throw new java.lang.ArithmeticException();
            }
            int i8 = getCiacDecline + 79;
            getApplicationLifeCycleData = i8 % 128;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x002e, code lost:
    
        if ((r0 % 2) != 0) goto L13;
     */
    @Override // com.payair.hce.accessgetCoroutineScopep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.List<java.lang.Integer> SdkCoreAlternateContactlessPaymentDataImpl(java.lang.String str) {
        java.util.List<java.lang.Integer> AlternateContactlessPaymentDataJson;
        synchronized (this) {
            int i = getDualTapResetTimeout;
            int i2 = i + 29;
            getSecurityWord = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 / 5;
            }
            int i4 = i + 125;
            int i5 = i4 % 128;
            getSecurityWord = i5;
            if (i4 % 2 != 0) {
                int i6 = getCiacDecline;
                getApplicationLifeCycleData = (i6 - 99) * 3145;
                if (i6 - 103 != 0) {
                    int i7 = i5 + 7;
                    getDualTapResetTimeout = i7 % 128;
                    if (i7 % 2 != 0) {
                        AlternateContactlessPaymentDataJson = this.SdkCoreAlternateContactlessPaymentDataImpl.AlternateContactlessPaymentDataJson(str);
                        int i8 = (getDualTapResetTimeout + 99) % 128;
                        getSecurityWord = i8;
                        int i9 = getCiacDecline + 1;
                        getApplicationLifeCycleData = i9 % 128;
                        if (i9 % 2 != 0) {
                            int i10 = i8 + 109;
                            getDualTapResetTimeout = i10 % 128;
                            if (i10 % 2 != 0) {
                            }
                        }
                        throw new java.lang.NullPointerException();
                    }
                }
                this.SdkCoreAlternateContactlessPaymentDataImpl.AlternateContactlessPaymentDataJson(str);
                throw new java.lang.NullPointerException();
            }
            int i11 = getCiacDecline + 115;
            getApplicationLifeCycleData = i11 % 128;
        }
        return AlternateContactlessPaymentDataJson;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x002c, code lost:
    
        if ((r0 % 2) == 0) goto L10;
     */
    @Override // com.payair.hce.accessgetCoroutineScopep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] DigitizedCardProfile(java.lang.String str, int i) {
        byte[] bArr;
        synchronized (this) {
            int i2 = getSecurityWord + 85;
            int i3 = i2 % 128;
            getDualTapResetTimeout = i3;
            if (i2 % 2 == 0) {
                int i4 = getApplicationLifeCycleData + 2;
                getCiacDecline = i4 >> 28987;
                if (i4 / 2 == 0) {
                    int i5 = i3 + 53;
                    getSecurityWord = i5 % 128;
                    if (i5 % 2 == 0) {
                        bArr = (byte[]) com.payair.hce.disableScreenShotProtection.AlternateContactlessPaymentDataJson(new java.lang.Object[]{this.SdkCoreAlternateContactlessPaymentDataImpl, str, java.lang.Integer.valueOf(i)}, 1073821533, -1073821533, i);
                        int i6 = getApplicationLifeCycleData + 61;
                        getCiacDecline = i6 % 128;
                        if (i6 % 2 != 0) {
                            int i7 = getSecurityWord + 59;
                            getDualTapResetTimeout = i7 % 128;
                            if (i7 % 2 != 0) {
                                throw new java.lang.NullPointerException();
                            }
                        }
                    }
                }
                throw new java.lang.NullPointerException();
            }
            int i8 = getApplicationLifeCycleData + 45;
            getCiacDecline = i8 % 128;
        }
        return bArr;
    }

    public final void writeReplace(java.lang.String str, java.lang.String str2) {
        synchronized (this) {
            int i = getSecurityWord + 63;
            getDualTapResetTimeout = i % 128;
            int i2 = i % 2;
            int i3 = getApplicationLifeCycleData + 29;
            getCiacDecline = i3 % 128;
            int i4 = i3 % 2;
            this.SdkCoreAlternateContactlessPaymentDataImpl.DigitizedCardProfile(str, str2);
            int i5 = getCiacDecline + 93;
            getApplicationLifeCycleData = i5 % 128;
            if (i5 % 2 == 0) {
                getSecurityWord = (getDualTapResetTimeout + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                throw new java.lang.NullPointerException();
            }
        }
    }

    @Override // com.payair.hce.accessgetCoroutineScopep
    public final void getProfileVersion(java.lang.String str) {
        synchronized (this) {
            int i = getSecurityWord + 55;
            getDualTapResetTimeout = i % 128;
            if (i % 2 == 0) {
                int i2 = 4 / 3;
            }
            int i3 = getApplicationLifeCycleData + 75;
            getCiacDecline = i3 % 128;
            int i4 = i3 % 2;
            this.SdkCoreAlternateContactlessPaymentDataImpl.writeReplace(str);
            int i5 = getSecurityWord;
            int i6 = i5 + 29;
            getDualTapResetTimeout = i6 % 128;
            int i7 = i6 % 2;
            int i8 = getApplicationLifeCycleData + 109;
            getCiacDecline = i8 % 128;
            if (i8 % 2 != 0) {
                getDualTapResetTimeout = (i5 + 107) % 128;
            }
        }
    }

    @Override // com.payair.hce.accessgetCoroutineScopep
    public final void AlternateContactlessPaymentDataJson() {
        synchronized (this) {
            int i = getCiacDecline + 37;
            getApplicationLifeCycleData = i % 128;
            int i2 = i % 2;
            this.getProfileVersion.SdkCoreAlternateContactlessPaymentDataImpl();
            this.RecordsJson.getProfileVersion();
            this.IccPrivateKeyCrtComponentsJson.IccPrivateKeyCrtComponentsJson();
            com.payair.hce.disableScreenShotProtection disablescreenshotprotection = this.SdkCoreAlternateContactlessPaymentDataImpl;
            com.payair.hce.disableScreenShotProtection.AlternateContactlessPaymentDataJson(new java.lang.Object[]{disablescreenshotprotection}, -1545492321, 1545492322, java.lang.System.identityHashCode(disablescreenshotprotection));
            this.getAid.RecordsJson();
            this.getCvrMaskAnd.getAid();
            int i3 = getApplicationLifeCycleData + 81;
            getCiacDecline = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = getDualTapResetTimeout;
                int i5 = i4 + 115;
                getSecurityWord = i5 % 128;
                char c = i5 % 2 != 0 ? (char) 4 : 'F';
                int i6 = i4 + 53;
                getSecurityWord = i6 % 128;
                int i7 = i6 % 2;
                if (c != '@') {
                }
            }
            throw new java.lang.NullPointerException();
        }
    }

    @Override // com.payair.hce.accessgetCoroutineScopep
    public final void getAid(java.lang.String str) {
        synchronized (this) {
            int i = getCiacDecline + 47;
            getApplicationLifeCycleData = i % 128;
            if (i % 2 == 0) {
                int i2 = (getSecurityWord + 67) % 128;
                getDualTapResetTimeout = i2;
                int i3 = i2 + 45;
                getSecurityWord = i3 % 128;
                if (i3 % 2 == 0) {
                    this.getCvrMaskAnd.values(str);
                    throw new java.lang.NullPointerException();
                }
            } else {
                getDualTapResetTimeout = (getSecurityWord + 9) % 128;
            }
            this.getCvrMaskAnd.values(str);
        }
    }

    @Override // com.payair.hce.accessgetCoroutineScopep
    public final java.lang.String writeReplace() {
        java.lang.String IccPrivateKeyCrtComponentsJson;
        synchronized (this) {
            int i = getSecurityWord;
            int i2 = i + 25;
            getDualTapResetTimeout = i2 % 128;
            int i3 = i2 % 2;
            int i4 = getApplicationLifeCycleData + 13;
            getCiacDecline = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = i + 9;
                getDualTapResetTimeout = i5 % 128;
                char c = i5 % 2 == 0 ? kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ : '\\';
                int i6 = i + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                getDualTapResetTimeout = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 3 / 5;
                }
                if (c == '\\') {
                    this.getCvrMaskAnd.IccPrivateKeyCrtComponentsJson();
                    throw new java.lang.NullPointerException();
                }
            }
            IccPrivateKeyCrtComponentsJson = this.getCvrMaskAnd.IccPrivateKeyCrtComponentsJson();
            int i8 = getApplicationLifeCycleData + 17;
            getCiacDecline = i8 % 128;
            if (i8 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            getDualTapResetTimeout = (getSecurityWord + 3) % 128;
        }
        return IccPrivateKeyCrtComponentsJson;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        if ((r5 % 2) == 0) goto L12;
     */
    @Override // com.payair.hce.accessgetCoroutineScopep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void DigitizedCardProfile(java.lang.String str, java.lang.String str2, com.payair.hce.isSessionAvailable issessionavailable) {
        synchronized (this) {
            int i = getSecurityWord + 125;
            int i2 = i % 128;
            getDualTapResetTimeout = i2;
            int i3 = i % 2;
            int i4 = getApplicationLifeCycleData + 107;
            getCiacDecline = i4 % 128;
            if (i4 % 2 != 0) {
                this.getProfileVersion.DigitizedCardProfile(str, str2, issessionavailable);
                throw new java.lang.NullPointerException();
            }
            getSecurityWord = (i2 + 89) % 128;
            this.getProfileVersion.DigitizedCardProfile(str, str2, issessionavailable);
            int i5 = getSecurityWord;
            int i6 = i5 + 49;
            getDualTapResetTimeout = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = getApplicationLifeCycleData >> 11;
                getCiacDecline = i7 << 28228;
                if (i7 - 3 == 0) {
                    getDualTapResetTimeout = (i5 + 93) % 128;
                }
                throw new java.lang.ArithmeticException();
            }
            int i8 = getApplicationLifeCycleData + 121;
            getCiacDecline = i8 % 128;
        }
    }

    public final void AlternateContactlessPaymentDataJson(java.lang.String str, java.util.HashMap<java.lang.String, com.payair.hce.isSessionAvailable> hashMap) throws java.security.GeneralSecurityException {
        synchronized (this) {
            int i = (getSecurityWord + 75) % 128;
            getDualTapResetTimeout = i;
            int i2 = getCiacDecline + 1;
            getApplicationLifeCycleData = i2 % 128;
            if (i2 % 2 == 0) {
                this.getProfileVersion.values(str, hashMap);
                throw new java.lang.ArithmeticException();
            }
            getSecurityWord = (i + 67) % 128;
            this.getProfileVersion.values(str, hashMap);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x002a, code lost:
    
        if ((r1 % 2) != 0) goto L10;
     */
    @Override // com.payair.hce.accessgetCoroutineScopep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.payair.hce.isSessionAvailable valueOf(java.lang.String str, java.lang.String str2) {
        com.payair.hce.isSessionAvailable valueOf;
        synchronized (this) {
            int i = (getDualTapResetTimeout + 93) % 128;
            getSecurityWord = i;
            int i2 = i + 103;
            getDualTapResetTimeout = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = getApplicationLifeCycleData << 72;
                getCiacDecline = i3 + 14166;
                if (i3 / 2 != 0) {
                    int i4 = i + 11;
                    getDualTapResetTimeout = i4 % 128;
                    int i5 = i4 % 2;
                }
                valueOf = this.getProfileVersion.valueOf(str, str2);
                int i6 = getApplicationLifeCycleData + 119;
                getCiacDecline = i6 % 128;
                if (i6 % 2 != 0) {
                    getSecurityWord = (getDualTapResetTimeout + 17) % 128;
                    throw new java.lang.NullPointerException();
                }
            } else {
                int i7 = getApplicationLifeCycleData + 119;
                getCiacDecline = i7 % 128;
            }
        }
        return valueOf;
    }

    @Override // com.payair.hce.accessgetCoroutineScopep
    public final java.lang.String valueOf() {
        java.lang.String aid;
        synchronized (this) {
            int i = getSecurityWord;
            getDualTapResetTimeout = (i + 83) % 128;
            int i2 = (i + 75) % 128;
            getDualTapResetTimeout = i2;
            int i3 = i2 + 85;
            int i4 = i3 % 128;
            getSecurityWord = i4;
            int i5 = i3 % 2;
            getDualTapResetTimeout = (i4 + 101) % 128;
            int i6 = getCiacDecline + 41;
            getApplicationLifeCycleData = i6 % 128;
            if (i6 % 2 == 0) {
                getDualTapResetTimeout = (i4 + 47) % 128;
            }
            aid = this.getProfileVersion.getAid();
            getSecurityWord = (getDualTapResetTimeout + 65) % 128;
            getCiacDecline = (getApplicationLifeCycleData + 13) % 128;
        }
        return aid;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0042, code lost:
    
        if ((r0 % 2) != 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.List<java.lang.String> getGpoResponse(java.lang.String str) {
        synchronized (this) {
            int i = getDualTapResetTimeout + 107;
            getSecurityWord = i % 128;
            int i2 = i % 2;
            int i3 = getCiacDecline + 53;
            getApplicationLifeCycleData = i3 % 128;
            if (i3 % 2 == 0) {
                this.getProfileVersion.valueOf(str);
                throw new java.lang.NullPointerException();
            }
            java.util.List<java.lang.String> valueOf = this.getProfileVersion.valueOf(str);
            int i4 = getSecurityWord + 67;
            int i5 = i4 % 128;
            getDualTapResetTimeout = i5;
            if (i4 % 2 == 0) {
                int i6 = getApplicationLifeCycleData % 3;
                getCiacDecline = i6 >>> 21306;
                if ((i6 >> 2) != 0) {
                    return valueOf;
                }
                int i7 = i5 + 17;
                getSecurityWord = i7 % 128;
                if (i7 % 2 == 0) {
                    return valueOf;
                }
                throw new java.lang.ArithmeticException();
            }
            int i8 = getApplicationLifeCycleData + 17;
            getCiacDecline = i8 % 128;
        }
    }

    public final void getCiacDecline(java.lang.String str) {
        synchronized (this) {
            getDualTapResetTimeout = (getSecurityWord + 15) % 128;
            int i = getApplicationLifeCycleData + 99;
            getCiacDecline = i % 128;
            int i2 = i % 2;
            this.getProfileVersion.AlternateContactlessPaymentDataJson(str);
            int i3 = (getSecurityWord + 5) % 128;
            getDualTapResetTimeout = i3;
            int i4 = getCiacDecline + 51;
            getApplicationLifeCycleData = i4 % 128;
            if (i4 % 2 == 0) {
                getSecurityWord = (i3 + 69) % 128;
                throw new java.lang.ArithmeticException();
            }
        }
    }

    public final void valueOf(com.payair.hce.MDESInstanceIDListenerService mDESInstanceIDListenerService, com.payair.hce.MDESInstanceIDListenerService mDESInstanceIDListenerService2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws java.security.GeneralSecurityException {
        synchronized (this) {
            getDualTapResetTimeout = (getSecurityWord + 21) % 128;
            com.payair.hce.sign signVar = new com.payair.hce.sign(mDESInstanceIDListenerService, mDESInstanceIDListenerService2, bArr, bArr2, bArr3, bArr4);
            this.RecordsJson.valueOf(signVar);
            this.IccPrivateKeyCrtComponentsJson.AlternateContactlessPaymentDataJson(signVar);
            this.getProfileVersion.valueOf(signVar);
            this.getAid.DigitizedCardProfile(signVar);
            com.payair.hce.setAuthenticationAquirer setauthenticationaquirer = this.getCvrMaskAnd;
            com.payair.hce.setAuthenticationAquirer.AlternateContactlessPaymentDataJson(new java.lang.Object[]{setauthenticationaquirer, signVar}, 2050070223, -2050070222, java.lang.System.identityHashCode(setauthenticationaquirer));
            this.SdkCoreAlternateContactlessPaymentDataImpl.valueOf(signVar);
            int i = getSecurityWord;
            getDualTapResetTimeout = (i + 55) % 128;
            getDualTapResetTimeout = (i + 71) % 128;
            getApplicationLifeCycleData = (getCiacDecline + 71) % 128;
        }
    }

    public final void writeReplace(java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, byte[]>> hashMap, java.util.HashMap<java.lang.String, byte[]> hashMap2) {
        synchronized (this) {
            getCiacDecline = (getApplicationLifeCycleData + 15) % 128;
            this.RecordsJson.AlternateContactlessPaymentDataJson(hashMap2);
            this.IccPrivateKeyCrtComponentsJson.DigitizedCardProfile(hashMap);
            int i = getSecurityWord + 113;
            int i2 = i % 128;
            getDualTapResetTimeout = i2;
            if (i % 2 == 0) {
                int i3 = 2 / 2;
            }
            int i4 = getApplicationLifeCycleData + 85;
            getCiacDecline = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            int i5 = i2 + 91;
            getSecurityWord = i5 % 128;
            if (i5 % 2 == 0) {
            } else {
                throw null;
            }
        }
    }

    @Override // com.payair.hce.accessgetCoroutineScopep
    public final /* synthetic */ com.payair.hce.accessgetCoroutineScopep valueOf(com.payair.hce.ResponseCompleteTokenizeDto responseCompleteTokenizeDto) {
        int i = (getSecurityWord + 53) % 128;
        getDualTapResetTimeout = i;
        int i2 = getCiacDecline;
        int i3 = i2 + 11;
        getApplicationLifeCycleData = i3 % 128;
        if (i3 % 2 == 0) {
            getSecurityWord = (i + 105) % 128;
        }
        this.AlternateContactlessPaymentDataJson = responseCompleteTokenizeDto;
        int i4 = i2 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        getApplicationLifeCycleData = i4 % 128;
        if (i4 % 2 != 0) {
            return this;
        }
        getSecurityWord = (i + 81) % 128;
        throw null;
    }

    @Override // com.payair.hce.accessgetCoroutineScopep
    public final /* synthetic */ com.payair.hce.accessgetCoroutineScopep writeReplace(com.payair.hce.getDetailedMessage getdetailedmessage) {
        int i = getDualTapResetTimeout + 43;
        int i2 = i % 128;
        getSecurityWord = i2;
        getApplicationLifeCycleData = i % 2 != 0 ? (getCiacDecline * 99) / 1529 : (getCiacDecline + 111) % 128;
        this.valueOf = getdetailedmessage;
        int i3 = getCiacDecline + 95;
        getApplicationLifeCycleData = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = i2 + 105;
            getDualTapResetTimeout = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 4 / 5;
            }
            throw new java.lang.ArithmeticException();
        }
        int i6 = i2 + 59;
        getDualTapResetTimeout = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 2 / 3;
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0076, code lost:
    
        if ((r5 % 2) == 0) goto L7;
     */
    @Override // com.payair.hce.accessgetCoroutineScopep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ com.payair.hce.accessgetCoroutineScopep AlternateContactlessPaymentDataJson(android.content.Context context) {
        this.writeReplace = context;
        com.payair.hce.setLvtAllowed setlvtallowed = (com.payair.hce.setLvtAllowed) com.payair.hce.setLvtAllowed.AlternateContactlessPaymentDataJson(new java.lang.Object[]{context}, -33691970, 33691970, (int) java.lang.System.currentTimeMillis());
        com.payair.hce.setLvtAllowed.AlternateContactlessPaymentDataJson(new java.lang.Object[]{setlvtallowed, this}, 1365343633, -1365343631, java.lang.System.identityHashCode(setlvtallowed));
        com.payair.hce.onGetCertOperationUnsuccessful ongetcertoperationunsuccessful = new com.payair.hce.onGetCertOperationUnsuccessful(this.writeReplace, this.valueOf, setlvtallowed, this.DigitizedCardProfile);
        this.RecordsJson = new com.payair.hce.isVisaOfflinePaymentsSupported(ongetcertoperationunsuccessful);
        this.IccPrivateKeyCrtComponentsJson = new com.payair.hce.getKeyCreationTimestamp(ongetcertoperationunsuccessful);
        this.getProfileVersion = new com.payair.hce.checkSdkState(ongetcertoperationunsuccessful);
        this.getAid = new com.payair.hce.setUserValidationRequestListener(ongetcertoperationunsuccessful);
        this.SdkCoreAlternateContactlessPaymentDataImpl = new com.payair.hce.disableScreenShotProtection(ongetcertoperationunsuccessful, this.SdkCoreBusinessLogicModuleImpl);
        this.getCvrMaskAnd = new com.payair.hce.setAuthenticationAquirer(ongetcertoperationunsuccessful);
        if (this.DigitizedCardProfile == null) {
            getSecurityWord = (getDualTapResetTimeout + 93) % 128;
        } else {
            int i = getSecurityWord + 75;
            getDualTapResetTimeout = i % 128;
        }
        int i2 = getApplicationLifeCycleData + 107;
        getCiacDecline = i2 % 128;
        if (i2 % 2 != 0) {
            android.widget.ExpandableListView.getPackedPositionType(0L);
            android.view.KeyEvent.getMaxKeyCode();
            android.text.TextUtils.getTrimmedLength("");
        } else {
            getSecurityWord = (getDualTapResetTimeout + 25) % 128;
            android.text.TextUtils.getOffsetBefore("", 0);
            android.graphics.Color.argb(0, 0, 0, 0);
            android.view.MotionEvent.axisFromString("");
        }
        getCiacDecline = (getApplicationLifeCycleData + 91) % 128;
        return this;
    }

    private static java.lang.String valueOf(int i, int i2, char c) {
        int i3 = getDualTapResetTimeout;
        getSecurityWord = (i3 + 11) % 128;
        getSecurityWord = (i3 + 115) % 128;
        getCiacDecline = (getApplicationLifeCycleData + 71) % 128;
        char[] cArr = new char[i];
        int i4 = 0;
        while (true) {
            if (i4 < i) {
                getDualTapResetTimeout = (getSecurityWord + 29) % 128;
            } else {
                int i5 = getDualTapResetTimeout + 69;
                getSecurityWord = i5 % 128;
                if (i5 % 2 == 0) {
                    return new java.lang.String(cArr);
                }
            }
            int i6 = getCiacDecline + 33;
            getApplicationLifeCycleData = i6 % 128;
            if (i6 % 2 == 0) {
                getDualTapResetTimeout = (getSecurityWord + 49) % 128;
                cArr[i4] = (char) ((getPaymentFci[i2 + i4] % (i4 + getGpoResponse)) + c);
                i4 += 13;
            } else {
                int i7 = getDualTapResetTimeout + 31;
                getSecurityWord = i7 % 128;
                if (i7 % 2 != 0) {
                    cArr[i4] = (char) ((getPaymentFci[i2 % i4] / (i4 + getGpoResponse)) ^ c);
                    i4 += 91;
                } else {
                    cArr[i4] = (char) ((getPaymentFci[i2 + i4] ^ (i4 * getGpoResponse)) ^ c);
                    i4++;
                }
            }
        }
    }

    static void getProfileVersion() {
        char[] cArr = new char[2268];
        java.nio.ByteBuffer.wrap("\u0097{\u0092á\u009cU\u0087£\u0081\u0001\u008be¶Ö°#)~,Î\"e9\u0090?,5M\bá\u000e$\u0005¦\u001bÛ\u0011`\u0014\u0089j\u0006`Ogï}\u001ep\u008bvÑLeC\u0093Y1_URæ¨\u0013¯÷¥Ä»9¾©´>\u008a_\u0081è\u0087\f\u009a¶\u00904\u0096Xí¢ã\næªüÆòoÉ\u0083Ï-ÅGØþÞKÕ¿+È!|$\u0099:90R7÷\rS\u0000½\u0006Æ\u001c6\u0013\u0093i1oJbûx\u0019\u007f°uØKzX6]eSLHÙNÃD9yB\u007fltÝjÆ`Xe\u0082\u001bß\u0011\u0010\u0016f\f5\u0001á\u0007\u000f=t2Q(ë.¨#jÙðÞåÔ*Ê\u0090Ï(Å\u0097ûÉð\u009eö\u0095ë\u0098áZç»\u009c¾\u0092²\u0097ø\u008d±\u0083b¸\u008c¾\u0006´\u0087©ö¯\u008e¤´Z\u0095P\u0090U\u0090KáA\u0083F |zq{wùmËbt\u0018\u008e\u001eÿ\u0013n\tf\u000e1\u0004ì:\u0007?k5c** \u0099&-ÛüÑ ×%Ì?Â\u0011Ç6ýÆó9èbîÄä¥\u0099C\u009fñ\u0094Ò\u008a\u001a\u0080U\u0085 »È±µ¶G¬¾¡Î§z]pRÐHóN\rCzyv~Ùt+j\\oþe×\u001a\u0094\u0010®\u0016O\u000b¥\u0001ö\u0007¨<22«7H-²#þØ¡Þ¨Ô¤ÉqÏ\u009fÄ\u001cú\u0096ðºõ\u009cëaá\u0083æ·\u009c\u0082\u0091Ý\u0097\u008d\u008dF\u0082\b¸\u0005½\u000f³é©\u0006®¡¤\u0001Z\u009e_\u0014U«J\u001b@PF\u001a{Vq%wïl0b¿g7\u001dH\u0013.\b\u0010\u000e(\u0004>9+?@4Ò*\u008c Q%ØÛÜÐ\u0082ÖgÌzÁþÇ\u0013ýuò\u000bèðíGãC\u0099¥\u009eÊ\u0094ó\u008aI\u008fX\u0085Ôº\u0011°O¶í«Æ¡ô§¼\\±R»WÿMºC\u0017x½~Lt i\u0089o¯d\u0088\u001aV\u0010d\u0015é\u000bÈ\u0000d\u0006m<ã1|7r-²\"õØ\u009cÝxÓMÉ\u0007ÎBÄ\u001eú\u0093ÿ\u0010õsê\u0013à´æ\n\u009bÆ\u0091\t\u0097\u0013\u008c\f\u0082-\u00877½í³>¨É®\u0005£_Y\u0018_\u008dT\u001bJé@\u0012E#{ápWvdlâaïg\u009d\u001dv\u0012Q\bì\rá\u0003c9T>â4K*]/\u0095%ØÚ»Ð_Ö\u0018ËÆÁ\u0007ÇAüóò´÷GíKã°\u0098Ê\u009e\u0081\u0093E\u00892\u008fÐ\u0084$ºW°ØµÞ«\u0084 X¦\u00ad\\ûQøWrM\u0017Bñx@}lsçiçnÿdn\u001aj\u001f\u0015\u00155\n\u0010\u0000ù\u0006#;\u00191:6%,9\"\u0086'4ÝÂÓ\u0081ÈaÎ\u0087ÃÙù\u008cÿ=ô\u0089êtà\u008aåÒ\u009b\u0083\u0090\u0092\u0096\u0080\u008c\u0004\u0081½\u0087-½¶²\u000b¨¿\u00adQ£¤Y¬^¡TÈIRO\u001eE+z\np(vòk%a·f/\u001c\u009b\u00120\u0017é\r=\u0003'8:>\u000b3\u001b)Û/\u001c$¢Ú\u0011ÐzÕ\u000eËÝÀ\u0007Æ%ü\bñg÷õí±âr\u0098é\u009dÃ\u0093¯\u0089D\u008e`\u0084Ù¹\u000f¿Wµ>ªÜ l¦a[\u009fQâV¹LkB|Gè}\bsmhÒnæcv\u0019\u009f\u001fù\u0014\u0094\n\u0082\u0000\u0099\u0005\u0001;\u009a0%6\u0083,À!ð'±ÜuÒ{ÈÏÍÙÃHù>þÍôgéRïÉåÓ\u009a\u0084\u0090\\\u0096%\u008b9\u0081\u0014\u0086>¼+²7·{\u00ad0£\u008bX%^¶S*I\u0003O+D\u0013z\u0014\u007f\u0015u!kË`'f|\u001c<\u0011§\u00179\fÂ\u0002:8\u0017=Ã3&)@.\u0098$ÍÙ·ßVÕ\u008aÊÏÀØÆDû&ñÁö\u0010ìrâ±çû\u009dó\u0093\u0095\u0088u\u008e\u0093\u0083õ¹`¿\u0011´åª@¯~¥æ[÷P®V|L8AÁG\u0019|Br?hËm}cH\u0019\u0080\u001eÍ\u0014Ü\tF\u000f\n\u0005?:\u0010046á+9!§&;Ü\u0082Ò$×¨Í\u0011ÂÔø\u0016þcó/é-ï(äÝ\u009a-\u009f\u0081\u00952\u008b±\u00803\u0086ë¼<±\u001c·Ù¬c¢^Xå]×S³IPNPDÅy\u0004\u007fKu6jÈ`6fu\u001bï\u0011\u008e\u0016\u0097\f\u0087\u0002@\u0007\u009c= 2\u0099(ï.\u009a#gÙcß\u0084ÔàÊúÏmÅ\u007fûöð8öoìüáäç\u0092\u009ca\u0092G\u0088Ó\u008d\u0080\u0083T¹%¾Ù´T©F¯\u001e¥ÿZÉPpU°K\rApF\n|Âr\u000bwhm\fbv\u0018\u0011\u001e«\u0013\u001e\t\u0096\u000f\u0007\u0004<:8?'55+õ 3&WÜ Ñð×%ÌëÂ.ø#ý×ó+è¬îØä¡\u0099í\u009f¢\u0095Ò\u008a»\u0080È\u0085¸»9±½¶\u007f¬\u0086¢Ú§\u008f] R\u0094H\u007fN\u0089C-y\u008b\u007f\u000bt\u0084jGoqe¥\u001bö\u0010µ\u0016\u007f\fo\u0001ø\u0007y<]20(Ò-\u0014#SØEÞìÔ¾ÉiÏúÅîú=ðwõ\u0000ëðáàæe\u009c¨\u0092\u001b\u0097é\u008d\u0018\u0082Ô¸\u0015¾6³\u001e©|¯\u0007¤ÉZ\f_úU\tK'@JFÄ{Ãq\u0013w@l}bÝ\u0018\u00ad\u001dV\u0013\u0091\bß\u000eA\u0004¤9;?¡5À*³ H%´Û\u0098Ñ©ÖþÌ¦Â2Ç¯ý@ò\u0090è÷î\u009dã\u008a\u0099\u009a\u009eX\u0094»\u008a\u0086\u008f¼\u0085\u0091»±°,¶N«\u0014¡Ç§Ü\\HRÝHÕM`CSxÚ~Àt\u0010iEoeeþ\u001aÖ\u0010w\u0015ã\u000bü\u0001`\u0006a<\u00172â7Ù-k\"AØèÞ½ÓmÉíÎæÄWú\u007fÿ4õôëüàyæ¬\u009bû\u0091\u008a\u0097D\u008cÞ\u0082Ñ¸\u0013½V³o¨Ï®Ï¤HY\u0081_ÍUsJ²@<E³{\tq¼v\u0019l\u0099a\u0004g\u009e\u001dÅ\u0012\u0097\b\u0087\u000e\u0090\u0003c9¥><4«*}/¨%@ÛµÐ Ö®ËèÁ§Ç)ü\\ò\u0014èÙíöãZ\u0098¼\u009eÃ\u0094\u0089\u0089@\u008fº\u0085Íºg°6µ\u0017«\u000f¡É¦\u0004\\·Q\u0001WhM\u0013BÓx\u0014~\u001es\u0019iknæd²\u001a\u007f\u001fÌ\u0015ð\u000b{\u0000m\u0006\u0006;ê1Ü7k,b\"ìØÜÝQÓ½ÈÞÎ÷Ä\u0089ùiÿ\u008fôÑê\u0084à5å\u0081\u009bl\u0091\u0092\u0096Ê\u008c\u009b\u0081\u008a\u0087\u0098½\u001c²¥¨%®¾£\u0003Y·^YT¬J¤O©Eð{ªp&vSk#aÐgÖ\u001c]\u0012¨\u0017'\r\u0094\u000388à>54!)2/\u001e$\u0003ÚÚÐ\u0004Õ¶Ë\tÁcÆ\u0016üÏñ\u000f÷-í\u0000âh\u0098ý\u009eª\u0093z\u0089\u0080\u008eû\u0084Rº|¿\"µá«ú o¦-[ÔQcWiL\u0082BêG¼}cs~hðn!du\u0019Ã\u001fþ\u0014u\n\u0087\u0000¢\u0005\u009c;Ö1\u00916[,\u0092!`'\u008bÝöÒ\u0088È\u0087Î\u008dÃEù·þàô°ê6ïÅås\u009aZ\u0090×\u0096Û\u008bÀ\u0081T\u0087I¼!²\u000b·&\u00ad'£/Xx^(TáI-OÜD\"zdp#u,k\u001ca¥f\u0019\u001c\u0098\u0011\u001f\u0017²\r\u0004\u0002ø8\u0001=õ32)F.Ë$cÚHßÓÕÅÊ\u009fÀNÆ»û×ñë÷\\ì\u0019âÙç_\u009dz\u0093ö\u0088ó\u008e²\u0084p¹I¿í´\u0019ªg \u0019¥è[~Q\u0095V\u0080L\u0092A©Gc}nräh\u0016mycØ\u0019ö\u001ei\u0014\u007f\nÎ\u000fÀ\u0005Ñ:M0\u00036Ê+5!K'\u0092ÜÌÒ\u0085×AÍMÃ?øéþ4ô:é9ï+ä:\u009aô\u0090#\u0095ú\u008b\u0010\u0080¸\u0086\u0015¼F±.·ô\u00ad'¢(X,]PS1I\u009bN2Dµz;\u007fpuØj\u000e`]fä\u001b×\u0011{\u0017P\f¡\u0002Å\u0007Ç=J3\u0003(Ë.1$tÙÚß\u0081ÔúÊ\u0086ÀºÅ\u009fûîð\u0098ö\tì\u009dáKçb\u009dø\u0092ã\u0088©\u008dl\u0083S¹é¾r´oª%¯ä¥wZaP\u0091VÒK¶A[Gi|Ør!wEm5cþ\u0018æ\u001ew\u0013/\t\f\u000fÐ\u0004\t:Ì0\n5j+\u0013 ,&\u0010Ü\u009cÑ\u001d×¸Í\u0007Â\u008cø8ýÏó5é-î2är\u009a#\u009fÃ\u0095$\u008a\u0085\u0080)\u0086\b»Ö±i¶¯¬\u000e¢ §z]½S\u00adHºN\u0098C»yq\u007f¼t,j\u0081`øe\u008f\u001b@\u0010\u0094\u0016\u009f\f\u0089\u0001û\u0007\u008a=x2\u0083(1-p#óÙõÞ\u009fÔ~Ê@ÏçÅùú\\ðÄöÑë,áRæ\u0004\u009cë\u0092\u00ad\u0097h\u008d°\u0083í¸z¾w³Ð©ð¯\u001d¤eZ\u000eP\u001aUÛK\u001b@«F\u0014|gq\u0001w\u0003m\u0006bÓ\u0018\u000f\u001da\u0013\b\t\u0087\u000eM\u0004î9Â?Z5C*\u0001 Ü&ñÛYÑîÖßÌ½Â¤Çàý¡ó\u000eè²îPã«\u0099\u008b\u009f¨\u0094¶\u008a¥\u0080J\u0085®»\u0002°\u0097¶G¬\u009c¡z§\u0099\\lRºH¦M³C\u008fy°~\u001ctMiMoÇe=\u001aH\u0010}\u0016Õ\u000b\u0099\u0001R\u0006Õ<Ã2g7D-5#ùØÜÞvÓ\u009cÉÿÏ§Ä`úûðíõ;ëjàmæë\u009cÛ\u0091l\u0097§\u008cá\u0082a¸\u007f½â³ô©\u0018®y¤zYú_¾UCJ\u0092@ÐF[{Uq$vÎlöbGg\u0005\u001dÌ\u0013¢\b±\u000eÂ\u0003²9\f?»4M*\u0098/f%\u009dÛ\u0083Ð\u0097ÖsÌ\u0090Á¥Ç¥üÛòªè\fí«ã7\u0099´\u009eâ\u0094¡\u0089\u0097\u008f¦\u0085Vº_°¨¶Ø«\u0017¡]¦j\\ÂR¸WCM\u0086CÌx\u0005~\tszi\u000fo#d\u0004\u001ar\u001f\u0001\u0015\u0094\u000b\u0012\u0000Ã\u0006\u001b<~1\u00187>,å\"ØØ~ÝòÓ÷É ÎlÄýùéÿ\u001cõjê6àÓæ\u008f\u009bP\u0091\u0097\u0096Ý\u008c\u0098\u0082f\u0087X½ø²ç¨u®/£òYD_\u0083TúJ\u0084OãE\u0089{]p\u0096v\u0005l\u008fa!g\u0080\u001c2\u0012½\bÁ\rº\u0003\u008e9»>&4Ó)7/Q%\u000bÚÞÐSÕ§Ë\u0086Á¸Æ¤üµò`÷²ízâ\u0083\u0098ß\u009e\u0084\u0093}\u0089\u0089\u008f£\u0084\u0096ºÂ¿\u008fµ\u001a«\u0080 H¦}\\ÉQúW°L{Brxý}Êsfi:nïd\u0007\u0019T\u001f4\u0015é\nô\u0000j\u0005\u009c;ã1E6p,õ\"õ'\u0013Ý~Ò]È\u0007Î\u0091Ã\u001cù¨ÿ\u0011ôkê\u0012ïMå\u000b\u009b\u009a\u0090\t\u0096w\u008c\u000e\u0081¦\u00877¼Ø²0¨X\u00adE£\u0014XÚ^ñT[I¦OÔE\u008ez¡pÂu¦k3a¯fo\u001c¨\u0012ñ\u0017\u00ad\r\u0093\u0002¢8g>£3:)\u009d/=$\u0096ÚZß\u009fÕ Ë\u0084ÀÉÆ\u0081û\u008fñ²÷yìKâ4\u0098È\u009d\u0010\u0093E\u0088M\u008eÎ\u0084¾¹W¿þµÜª1 Y¥\u000e[úQýVsL±BñG\u0080}nrÓhçn1ch\u0019m\u001f\u0015\u0014¹\n\u0012\u000f\u009d\u0005ã;B0d6é+ù!E'vÜ[ÒÿÈ\u009eÍ@Ã¨øÍþnôJé\u0007ïËåÑ\u009aM\u0090k\u0095Æ\u008b¯\u0081¿\u0086Ç¼´²\u001e·¹\u00ad!¢ºXÇ^£SòI\u0090N;D\u0095zà\u007f®uÁk§`\u0003f¬\u001b6\u0011±\u0017é\f²\u0002®8»=M3Y(û.Þ$9ÙWß@ÕÐÊ\u0082ÀEÅãûÊñ]öKì7âôç\"\u009d\u0001\u0092b\u0088\u0006\u008e\u0097\u0083\u001f¹À¾\u0018´hª\u001d¯K¥â[ÒPcV\u008eKíAºGv|\u009frïh\u0006mdcH\u0018á\u001eî\u0014R\t¿\u000fÛ\u0005(:X0\u00895Å+ò!~&\u0005Ü÷ÑA×\u008cÍûÂ\u0089ø¹þ\u008aóZé\u0093î\u000fä\u0091\u009a%\u009f\u009e\u0095w\u008b\u0087\u0080\u0080\u0086¸»Ö±µ·R¬²¢;X£]ÇS¤HÔN©D\u008dyV\u007fÓt/j\u001f` e$\u001b=\u0011\u0089\u0016:\fú\u0001;\u0007h==2Ý(\u0006.\u0013#\u000fÙjÞ\u0014Ô\u0080Ê\tÏ\u0081Å\nûYð\u0003öbëðáÇçu\u009ca\u0092þ\u0088\u0091\u008dg\u0083²¸Ü¾÷´Q©N¯Ò¤:ZkPþUéK;AnF\u0082|÷qäwpm2bå\u0018\u0003\u001e\u009a\u0013´\t\u009b\u000eÍ\u0004\u0094:^?\u00815ì+\u0086 3&\u008fÛfÑ\u0088×ÀÌÍÂ\u0082ÇBýbóÃè6î]ä\u0013\u0099Ö\u009fD\u0094_\u008a²\u0080$\u0085¡»!±z¶2¬:¡+§Ð](R\u0089H%NÂC.yý~\u0017t\u000bj\u001co=e\u0019\u001af\u0010:\u0016ù\u000b3\u0001µ\u00071<\u00992Î7Æ-G#WØÈÞ\fÔUÉòÏÒÄ¶úCðJõÄë\u001báyæ&\u009cö\u0091a\u0097\u007f\u008d\u0096\u0082à¸Ù¾m³9©ê®\u0014¤kZË_íU\u007fJf@§Fÿ{¶qtwklùb\bgz\u001dÓ\u0013Ã\b¯\u000eP\u0004q9Õ?Û4N*\u001c Ç%aÛLÑ§Ö1Ì\u008dÁ2Çfý;òHè\u0019íÈã\u001e\u0099$\u009e\u0017\u0094T\u008a\u0010\u008f\u009e\u0085%ºº°*¶,«+¡3§4\\òR!W@M&C\u009axß~\u008dtXi<oÝd\f\u001aB\u0010À\u0015Ã\u000bÙ\u0001M\u0006¸<¶1ò7\u008f-\u001c\"\u0084ØIÝ\u0081Ó\u009aÉ\u0092ÎÂÄ\u009bú'ÿIõ`êOà@æ\\\u009b$\u0091Y\u0097õ\u008cB\u0082Ó\u0087K½\u001b³@¨\r®}¤¬Y~_\nTwJ(@TEÕ{Qp\u0089vZl_a£gK\u001d(\u0012º\b¥\râ\u0003'9Ú>¸4®*-/t%ªÚ{Ð\u0013Ö\u009cË\u0094ÁëÇ\u0011ü$ò\u008e÷\u009bí\u000fã\u001b\u0098\u0080\u009eR\u0093\u0005\u0089Ä\u008f\u0082\u0084óº\u000b°-µ\u008c«_ \u0019¦\u0089\\\u0097Q5W\u0014MÜB©x\u0099}2s$i»nmd \u001a\u0094\u001f¥\u0015Û\n&\u0000ù\u0006_;\u00871\\7B,Q\"n'jÝ\u0019ÓsÈ¸ÎxÃÚù}ÿ\u001eôOê¡àHå\f\u009bE\u0090s\u0096Z\u008c\u008f\u0081C\u0087Þ½L²&¨±\u00ad~£6YB^·T\u0018J0O×E\u00adz°p\"v?kÛapfä\u001c£\u0012é\u0017Û\rï\u0003ï8ü>µ3ù)U/ò$CÚ\u000bÐ\u0086Õ\u0090ËäÀ\u001dÆ,ü\u009eñ\u0093÷\u0007í>â\u0084\u0098#\u009d\u0001\u0093÷\u0089º\u008eß\u00843¹\u008a¿\u0088µ\u0017ª\u0015 Y¦\u0097[sQ\u0018V*LmB¹Gj}àsch\u001endcm\u0019a\u001f³\u0014n\n\r\u0000o\u0005Û;P0«6U,B!R'CÝKÒ\u009eÈLÍÃÃ¹ù6þÇôªéÄïnåÉ\u009a\u001a\u0090Â\u0096Ð\u008bÛ\u0081õ\u0086Ð¼c²Õ·p\u00adö£MXÿ^\u001bSüIåOáDÞzêp\u0003uãkW`\u0018f¿\u001c\u009d\u0011ê\u0017/\f7\u0002¨8ù=53\u0093)º.J$3Ù\u0019ß\u008cÕÀÊ\u0001ÀðÆ\u0086ûÊñ\u0007ö\u0094ì\u0080âgç\r\u009d<\u0093r\u0088\u009d\u008e{\u0083È¹t¿%´iª; o¥X[\u001cP\u0005V\u0099LóA\"G\u00ad|«rzh m%c½\u0019 \u001e>\u0014ñ\t·\u000fÛ\u0005Ô:¬0Ñ6u+Ú!U&ÃÜ\u0087ÒÈ×\u008dÍÅÃ3øÇþ\u008eóøé³ïÍä9\u009aÊ\u009fd\u0095Ó\u008b\u0092\u0080Ô\u0086É¼Ñ±7·.¬i¢¯X_] S'I¥NÎD\"yÏ\u007f«u\u0012j,`wf\u0099\u001b®\u0011\u0017\u0016\r\f\u0094\u0002Ï\u0007\t=¥2r(@.{#xÙ\u0080ßãÔ\u0005ÊÛÏ\u0086Å\nû\u001fð²ö\u009cìjá\u0011ç\u001e\u009c\u008a\u0092¤\u00883\u008dË\u0083¸¹\f¾=´[©¯¯t¥(Z\u0007P¥VßKÚAóFã|Érìw\tmñb6\u0018ö\u001eï\u0013÷\tN\u000fð\u0004\u0080:Å?15C+\u0016 Ð&hÜUÑ½×ÎÌ\u0087ÂGøOýÌó7éqîùäò\u0099O\u009f{\u0095»\u008a\u0098\u0080Ý\u0085\u009d»\u0016±\u0096¶3¬o¢ç^æ[cUÞN_HëB\u008c\u007f yÏrzl\t".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2268);
        getCardLayoutDescription = cArr;
        getCvmResetTimeout = 587104310621068080L;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSecurityWord = 0;
        getDualTapResetTimeout = 1;
        getProfileVersion();
        getCiacDecline = 0;
        getApplicationLifeCycleData = 1;
        char[] cArr = new char[1093];
        java.lang.Object[] objArr = new java.lang.Object[1];
        a((-16777144) - android.graphics.Color.rgb(0, 0, 0), (char) (1592 - (android.os.Process.myPid() >> 22)), android.widget.ExpandableListView.getPackedPositionChild(0L) + 2187, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(2259 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), android.view.KeyEvent.normalizeMetaState(0) + 10, objArr2);
        java.nio.ByteBuffer.wrap(intern.getBytes(((java.lang.String) objArr2[0]).intern())).asCharBuffer().get(cArr, 0, 1093);
        getPaymentFci = cArr;
        getGpoResponse = -7936090383817030417L;
        int i = getDualTapResetTimeout + 5;
        getSecurityWord = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    static void init$0() {
        $$a = new byte[]{58, -44, -87, com.visa.cbp.getEncExpo.IResultReceiver2};
        $$b = 136;
    }

    @Override // com.payair.hce.accessgetCoroutineScopep
    public final /* synthetic */ com.payair.hce.accessgetCoroutineScopep writeReplace(com.payair.hce.getStatusMessage getstatusmessage) {
        return (com.payair.hce.accessgetCoroutineScopep) writeReplace(new java.lang.Object[]{this, getstatusmessage}, 151638422, -151638422, java.lang.System.identityHashCode(this));
    }
}
