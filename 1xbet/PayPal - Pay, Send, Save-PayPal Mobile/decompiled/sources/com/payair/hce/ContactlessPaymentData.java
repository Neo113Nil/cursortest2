package com.payair.hce;

/* loaded from: classes4.dex */
public final class ContactlessPaymentData implements com.payair.hce.onShowAuthenticateScreen {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char SdkCoreBusinessLogicModuleImpl;
    private static long getAid;
    private static int getCvrMaskAnd;
    private static int getGpoResponse;
    private static int getPaymentFci;
    private static com.payair.hce.ignoreFailedTransaction values;
    private com.payair.hce.ContactlessPaymentData.AlternateContactlessPaymentDataJson AlternateContactlessPaymentDataJson;
    private com.payair.hce.onCardProvisionFailure DigitizedCardProfile;
    private boolean IccPrivateKeyCrtComponentsJson;
    private boolean RecordsJson;
    private boolean SdkCoreAlternateContactlessPaymentDataImpl;
    private com.payair.hce.setPinIvCvc3Track2 getProfileVersion;
    private com.payair.hce.onTransactionStopped valueOf;
    private com.payair.hce.postInitializationCleanup writeReplace;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        return AlternateContactlessPaymentDataJson(objArr);
    }

    private static void b(byte b, byte b2, short s, java.lang.Object[] objArr) {
        int i = 3 - (s * 3);
        int i2 = b2 * 2;
        byte[] bArr = $$a;
        int i3 = 106 - b;
        byte[] bArr2 = new byte[1 - i2];
        int i4 = 0 - i2;
        int i5 = -1;
        if (bArr == null) {
            i3 = i4 + i3;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i3;
            i++;
            if (i5 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i3 += bArr[i];
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'AlternateContactlessPaymentDataJson' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class AlternateContactlessPaymentDataJson {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10;
        private static int $11;
        public static final com.payair.hce.ContactlessPaymentData.AlternateContactlessPaymentDataJson AlternateContactlessPaymentDataJson;
        private static com.payair.hce.ContactlessPaymentData.AlternateContactlessPaymentDataJson DigitizedCardProfile;
        private static int IccPrivateKeyCrtComponentsJson;
        private static long RecordsJson;
        private static char[] SdkCoreAlternateContactlessPaymentDataImpl;
        private static int getProfileVersion;
        public static final com.payair.hce.ContactlessPaymentData.AlternateContactlessPaymentDataJson valueOf;
        private static com.payair.hce.ContactlessPaymentData.AlternateContactlessPaymentDataJson values;
        private static final /* synthetic */ com.payair.hce.ContactlessPaymentData.AlternateContactlessPaymentDataJson[] writeReplace;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002e). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void b(int i, byte b, byte b2, java.lang.Object[] objArr) {
            int i2;
            int i3;
            int i4 = 3 - (b2 * 4);
            int i5 = 99 - (b * 2);
            byte[] bArr = $$a;
            int i6 = (i * 2) + 1;
            byte[] bArr2 = new byte[i6];
            if (bArr == null) {
                i5 = i6;
                int i7 = i4;
                i3 = 0;
                i5 += -i4;
                i4 = i7;
                i2 = i3;
                int i8 = i4 + 1;
                i3 = i2 + 1;
                bArr2[i2] = (byte) i5;
                if (i3 == i6) {
                    objArr[0] = new java.lang.String(bArr2, 0);
                    return;
                }
                i7 = i8;
                i4 = bArr[i8];
                i5 += -i4;
                i4 = i7;
                i2 = i3;
                int i82 = i4 + 1;
                i3 = i2 + 1;
                bArr2[i2] = (byte) i5;
                if (i3 == i6) {
                }
            } else {
                i2 = 0;
                int i822 = i4 + 1;
                i3 = i2 + 1;
                bArr2[i2] = (byte) i5;
                if (i3 == i6) {
                }
            }
        }

        private static void a(int i, int i2, char c, java.lang.Object[] objArr) {
            com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
            long[] jArr = new long[i];
            getcvmmodel.valueOf = 0;
            while (getcvmmodel.valueOf < i) {
                int i3 = $10 + 95;
                $11 = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = getcvmmodel.valueOf;
                    try {
                        java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(SdkCoreAlternateContactlessPaymentDataImpl[i2 >>> getcvmmodel.valueOf])};
                        java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                        if (obj == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 48, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 381, (char) (android.view.View.resolveSize(0, 0) + 62388));
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            b(0, (byte) 0, (byte) 0, objArr3);
                            obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                        }
                        java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(RecordsJson), java.lang.Integer.valueOf(c)};
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                        if (obj2 == null) {
                            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 3966, (char) (40223 - android.graphics.Color.red(0)))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                        }
                        jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                        java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                        if (obj3 == null) {
                            obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 34, android.graphics.Color.red(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) android.view.View.getDefaultSize(0, 0))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
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
                } else {
                    int i5 = getcvmmodel.valueOf;
                    java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(SdkCoreAlternateContactlessPaymentDataImpl[i2 + getcvmmodel.valueOf])};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                    if (obj4 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), android.text.TextUtils.getOffsetAfter("", 0) + 381, (char) (62387 - ((byte) android.view.KeyEvent.getModifierMetaStateMask())));
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        b(0, (byte) 0, (byte) 0, objArr7);
                        obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj4);
                    }
                    java.lang.Object[] objArr8 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr6)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(RecordsJson), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                    if (obj5 == null) {
                        obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myPid() >> 22) + 35, 3966 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (40223 - android.view.Gravity.getAbsoluteGravity(0, 0)))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj5);
                    }
                    jArr[i5] = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr8)).longValue();
                    java.lang.Object[] objArr9 = {getcvmmodel, getcvmmodel};
                    java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                    if (obj6 == null) {
                        obj6 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), android.graphics.Color.green(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj6);
                    }
                    ((java.lang.reflect.Method) obj6).invoke(null, objArr9);
                }
            }
            char[] cArr = new char[i];
            getcvmmodel.valueOf = 0;
            while (getcvmmodel.valueOf < i) {
                int i6 = $10 + 23;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
                    java.lang.Object[] objArr10 = {getcvmmodel, getcvmmodel};
                    java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                    if (obj7 == null) {
                        obj7 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 35, 212 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) android.view.View.MeasureSpec.getSize(0))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj7);
                    }
                    ((java.lang.reflect.Method) obj7).invoke(null, objArr10);
                    throw null;
                }
                cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
                java.lang.Object[] objArr11 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj8 == null) {
                    obj8 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetBefore("", 0) + 34, 212 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj8);
                }
                ((java.lang.reflect.Method) obj8).invoke(null, objArr11);
            }
            objArr[0] = new java.lang.String(cArr);
        }

        private AlternateContactlessPaymentDataJson(java.lang.String str, int i) {
        }

        public static com.payair.hce.ContactlessPaymentData.AlternateContactlessPaymentDataJson valueOf(java.lang.String str) {
            int i = IccPrivateKeyCrtComponentsJson + 121;
            getProfileVersion = i % 128;
            com.payair.hce.ContactlessPaymentData.AlternateContactlessPaymentDataJson alternateContactlessPaymentDataJson = (com.payair.hce.ContactlessPaymentData.AlternateContactlessPaymentDataJson) java.lang.Enum.valueOf(com.payair.hce.ContactlessPaymentData.AlternateContactlessPaymentDataJson.class, str);
            if (i % 2 != 0) {
                return alternateContactlessPaymentDataJson;
            }
            throw new java.lang.ArithmeticException();
        }

        public static com.payair.hce.ContactlessPaymentData.AlternateContactlessPaymentDataJson[] values() {
            int i = getProfileVersion + 113;
            IccPrivateKeyCrtComponentsJson = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
            com.payair.hce.ContactlessPaymentData.AlternateContactlessPaymentDataJson[] alternateContactlessPaymentDataJsonArr = (com.payair.hce.ContactlessPaymentData.AlternateContactlessPaymentDataJson[]) writeReplace.clone();
            getProfileVersion = (IccPrivateKeyCrtComponentsJson + 35) % 128;
            return alternateContactlessPaymentDataJsonArr;
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            IccPrivateKeyCrtComponentsJson = 0;
            getProfileVersion = 1;
            AlternateContactlessPaymentDataJson();
            int indexOf = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(indexOf + 5, android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16, (char) (android.text.TextUtils.getOffsetAfter("", 0) + 46715), objArr);
            com.payair.hce.ContactlessPaymentData.AlternateContactlessPaymentDataJson alternateContactlessPaymentDataJson = new com.payair.hce.ContactlessPaymentData.AlternateContactlessPaymentDataJson(((java.lang.String) objArr[0]).intern(), 0);
            AlternateContactlessPaymentDataJson = alternateContactlessPaymentDataJson;
            int windowTouchSlop = android.view.ViewConfiguration.getWindowTouchSlop();
            int alpha = android.graphics.Color.alpha(0);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a((windowTouchSlop >> 8) + 34, alpha + 4, (char) (33598 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), objArr2);
            com.payair.hce.ContactlessPaymentData.AlternateContactlessPaymentDataJson alternateContactlessPaymentDataJson2 = new com.payair.hce.ContactlessPaymentData.AlternateContactlessPaymentDataJson(((java.lang.String) objArr2[0]).intern(), 1);
            valueOf = alternateContactlessPaymentDataJson2;
            float minVolume = android.media.AudioTrack.getMinVolume();
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            a((minVolume > 0.0f ? 1 : (minVolume == 0.0f ? 0 : -1)) + 27, android.view.View.resolveSize(0, 0) + 38, (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr3);
            values = new com.payair.hce.ContactlessPaymentData.AlternateContactlessPaymentDataJson(((java.lang.String) objArr3[0]).intern(), 2);
            int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a(25 - lastIndexOf, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 65, (char) android.view.View.getDefaultSize(0, 0), objArr4);
            com.payair.hce.ContactlessPaymentData.AlternateContactlessPaymentDataJson alternateContactlessPaymentDataJson3 = new com.payair.hce.ContactlessPaymentData.AlternateContactlessPaymentDataJson(((java.lang.String) objArr4[0]).intern(), 3);
            DigitizedCardProfile = alternateContactlessPaymentDataJson3;
            writeReplace = new com.payair.hce.ContactlessPaymentData.AlternateContactlessPaymentDataJson[]{alternateContactlessPaymentDataJson, alternateContactlessPaymentDataJson2, values, alternateContactlessPaymentDataJson3};
            getProfileVersion = (IccPrivateKeyCrtComponentsJson + 29) % 128;
        }

        static void AlternateContactlessPaymentDataJson() {
            SdkCoreAlternateContactlessPaymentDataImpl = new char[]{59549, 25948, 62208, 16885, 56770, 20507, 50776, 29872, 60141, 6460, 36631, 15695, 46012, 8697, 21557, 51733, 30797, 61056, 7406, 37671, 273, 46922, 9606, 23539, 52785, 31869, 62021, 24722, 38624, 1343, 47972, 10565, 24451, 52685, 16430, 63087, 25693, 39568, 24319, 54054, 17765, 63373, 27088, 39425, 3114, 48754, 12417, 41668, 55048, 18735, 64364, 28065, 40919, 4100, 33339, 13425, 42678, 55493, 19724, 65362, 29028, 58287, 5574, 34316, 14425, 24319, 54054, 17765, 63373, 27088, 39425, 3114, 48754, 12417, 41668, 55048, 18746, 64365, 28080, 40920, 4111, 33341, 13410, 42681, 55512, 19742, 65360, 29043, 58290, 5568, 34317};
            RecordsJson = 3749837234157704035L;
        }

        static void init$0() {
            $$a = new byte[]{com.google.common.base.Ascii.RS, 5, -83, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE};
            $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE;
        }
    }

    static /* synthetic */ com.payair.hce.postInitializationCleanup AlternateContactlessPaymentDataJson(com.payair.hce.ContactlessPaymentData contactlessPaymentData) {
        int i = getGpoResponse + 87;
        getCvrMaskAnd = i % 128;
        com.payair.hce.postInitializationCleanup postinitializationcleanup = contactlessPaymentData.writeReplace;
        if (i % 2 == 0) {
            return postinitializationcleanup;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.ContactlessPaymentData contactlessPaymentData = (com.payair.hce.ContactlessPaymentData) objArr[0];
        int i = getCvrMaskAnd + 81;
        getGpoResponse = i % 128;
        contactlessPaymentData.valueOf();
        if (i % 2 != 0) {
            return null;
        }
        throw new java.lang.ArithmeticException();
    }

    static /* synthetic */ com.payair.hce.setPinIvCvc3Track2 values(com.payair.hce.ContactlessPaymentData contactlessPaymentData) {
        int i = getGpoResponse + 103;
        getCvrMaskAnd = i % 128;
        com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track2 = contactlessPaymentData.getProfileVersion;
        if (i % 2 == 0) {
            return setpinivcvc3track2;
        }
        throw new java.lang.ArithmeticException();
    }

    public ContactlessPaymentData(com.payair.hce.hasVersionCheckFailed hasversioncheckfailed, com.payair.hce.onSdkUnregistered onsdkunregistered, com.payair.hce.smallInitialization smallinitialization, com.payair.hce.setUpMCBP setupmcbp, com.payair.hce.initContext initcontext, com.payair.hce.postInitializationCleanup postinitializationcleanup, com.payair.hce.useDemoMode usedemomode, java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> list, java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> list2, com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track2) throws com.payair.hce.removeCardManagerListener {
        com.payair.hce.useDemoMode onuploadunlockkeys;
        this.AlternateContactlessPaymentDataJson = com.payair.hce.ContactlessPaymentData.AlternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson;
        com.payair.hce.setMaximumPinTry.writeReplace(setpinivcvc3track2);
        this.getProfileVersion = com.payair.hce.setMaximumPinTry.valueOf();
        this.writeReplace = postinitializationcleanup;
        if (usedemomode == null) {
            try {
                onuploadunlockkeys = new com.payair.hce.onUploadUnlockKeys();
            } catch (com.payair.hce.getAtcCount e) {
                android.view.ViewConfiguration.getJumpTapTimeout();
                android.view.Gravity.getAbsoluteGravity(0, 0);
                new java.lang.Object[]{e.getMessage()};
                e.DigitizedCardProfile();
                return;
            }
        } else {
            onuploadunlockkeys = usedemomode;
        }
        if (this.writeReplace == null) {
            this.writeReplace = new com.payair.hce.sdkTooOldNeedReset();
        }
        if (setupmcbp == null) {
            throw new com.payair.hce.updateAtcCount(com.payair.hce.requestTaskStatusUpdate.DigitizedCardProfile);
        }
        com.payair.hce.getCodeCacheDir getcodecachedir = new com.payair.hce.getCodeCacheDir(hasversioncheckfailed, list, list2);
        com.payair.hce.createConfigurationContext createconfigurationcontext = (com.payair.hce.createConfigurationContext) com.payair.hce.getCodeCacheDir.valueOf(new java.lang.Object[]{getcodecachedir}, -775162360, 775162363, java.lang.System.identityHashCode(getcodecachedir));
        this.SdkCoreAlternateContactlessPaymentDataImpl = ((java.lang.Boolean) com.payair.hce.createConfigurationContext.valueOf(new java.lang.Object[]{createconfigurationcontext}, -1089688552, 1089688552, java.lang.System.identityHashCode(createconfigurationcontext))).booleanValue();
        this.IccPrivateKeyCrtComponentsJson = ((com.payair.hce.createConfigurationContext) com.payair.hce.getCodeCacheDir.valueOf(new java.lang.Object[]{getcodecachedir}, -775162360, 775162363, java.lang.System.identityHashCode(getcodecachedir))).writeReplace();
        com.payair.hce.createConfigurationContext createconfigurationcontext2 = (com.payair.hce.createConfigurationContext) com.payair.hce.getCodeCacheDir.valueOf(new java.lang.Object[]{getcodecachedir}, -775162360, 775162363, java.lang.System.identityHashCode(getcodecachedir));
        this.RecordsJson = ((java.lang.Boolean) com.payair.hce.createConfigurationContext.valueOf(new java.lang.Object[]{createconfigurationcontext2}, 727813202, -727813200, java.lang.System.identityHashCode(createconfigurationcontext2))).booleanValue();
        com.payair.hce.onSystemHealthCompleted onsystemhealthcompleted = new com.payair.hce.onSystemHealthCompleted(onuploadunlockkeys, initcontext, setupmcbp, smallinitialization);
        this.AlternateContactlessPaymentDataJson = com.payair.hce.ContactlessPaymentData.AlternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson;
        this.DigitizedCardProfile = new com.payair.hce.onCardProvisionFailure(onsdkunregistered, onsystemhealthcompleted, getcodecachedir, this);
        DigitizedCardProfile();
        if (values == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "\ue3b4阿혁䏌縎鋱裤ᐁ遊㩫野Գ䟎긒揳繘ℭᆐ쾲", "ꘚ엻ꆀ⌡", (-2134508634) - android.view.View.resolveSizeAndState(0, 0, 0), (char) (8610 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr);
            values = new com.payair.hce.ignoreFailedTransaction(((java.lang.String) objArr[0]).intern(), 300000, 1000L, new com.payair.hce.ignoreFailedTransaction.values() { // from class: com.payair.hce.ContactlessPaymentData.5
                private static final byte[] $$a = null;
                private static final int $$b = 0;
                private static final byte[] $$d = null;
                private static final int $$e = 0;
                private static int $10;
                private static int $11;
                private static int AlternateContactlessPaymentDataJson;
                private static char[] DigitizedCardProfile;
                private static int valueOf;
                private static long values;

                /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002c). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private static void b(short s, int i, short s2, java.lang.Object[] objArr2) {
                    int i2;
                    int i3;
                    int i4 = 37 - (s2 * 34);
                    int i5 = (i * 2) + 1;
                    int i6 = s + 65;
                    byte[] bArr = $$a;
                    char[] cArr = new char[i5];
                    if (bArr == null) {
                        i6 = i5;
                        int i7 = i4;
                        i3 = 0;
                        i6 = (i6 + (-i4)) - 2;
                        i4 = i7;
                        i2 = i3;
                        i3 = i2 + 1;
                        cArr[i2] = (char) i6;
                        if (i3 == i5) {
                            objArr2[0] = new java.lang.String(cArr);
                            return;
                        }
                        int i8 = i4 + 1;
                        i7 = i8;
                        i4 = bArr[i8];
                        i6 = (i6 + (-i4)) - 2;
                        i4 = i7;
                        i2 = i3;
                        i3 = i2 + 1;
                        cArr[i2] = (char) i6;
                        if (i3 == i5) {
                        }
                    } else {
                        i2 = 0;
                        i3 = i2 + 1;
                        cArr[i2] = (char) i6;
                        if (i3 == i5) {
                        }
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002d). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private static void c(int i, int i2, byte b, java.lang.Object[] objArr2) {
                    int i3;
                    int i4;
                    byte[] bArr = $$d;
                    int i5 = (i * 4) + 99;
                    int i6 = 3 - (b * 3);
                    int i7 = 1 - (i2 * 4);
                    byte[] bArr2 = new byte[i7];
                    if (bArr == null) {
                        int i8 = i6;
                        i4 = 0;
                        i5 += i6;
                        i6 = i8;
                        i3 = i4;
                        i4 = i3 + 1;
                        bArr2[i3] = (byte) i5;
                        int i9 = i6 + 1;
                        if (i4 == i7) {
                            objArr2[0] = new java.lang.String(bArr2, 0);
                            return;
                        }
                        i8 = i9;
                        i6 = bArr[i9];
                        i5 += i6;
                        i6 = i8;
                        i3 = i4;
                        i4 = i3 + 1;
                        bArr2[i3] = (byte) i5;
                        int i92 = i6 + 1;
                        if (i4 == i7) {
                        }
                    } else {
                        i3 = 0;
                        i4 = i3 + 1;
                        bArr2[i3] = (byte) i5;
                        int i922 = i6 + 1;
                        if (i4 == i7) {
                        }
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:25:0x022f  */
                /* JADX WARN: Removed duplicated region for block: B:27:0x0230  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private static void a(int i, char c, int i2, java.lang.Object[] objArr2) {
                    double d;
                    java.lang.Throwable cause;
                    com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
                    long[] jArr = new long[i2];
                    getcvmmodel.valueOf = 0;
                    while (true) {
                        d = 0.0d;
                        if (getcvmmodel.valueOf >= i2) {
                            break;
                        }
                        $10 = ($11 + 57) % 128;
                        int i3 = getcvmmodel.valueOf;
                        try {
                            java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(DigitizedCardProfile[i + getcvmmodel.valueOf])};
                            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                            if (obj == null) {
                                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.view.KeyEvent.keyCodeFromString(""), android.view.MotionEvent.axisFromString("") + 382, (char) (62388 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))));
                                java.lang.Object[] objArr4 = new java.lang.Object[1];
                                c(0, 0, (byte) 0, objArr4);
                                obj = cls.getMethod((java.lang.String) objArr4[0], java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                            }
                            java.lang.Object[] objArr5 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr3)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(values), java.lang.Integer.valueOf(c)};
                            java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                            if (obj2 == null) {
                                obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 35, android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 3918, (char) (40223 - android.text.TextUtils.getTrimmedLength("")))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                            }
                            jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr5)).longValue();
                            java.lang.Object[] objArr6 = {getcvmmodel, getcvmmodel};
                            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                            if (obj3 == null) {
                                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 34, (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 211, (char) (android.view.KeyEvent.getMaxKeyCode() >> 16))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj3);
                            }
                            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
                        } catch (java.lang.Throwable th) {
                            cause = th.getCause();
                            if (cause != null) {
                            }
                        }
                        cause = th.getCause();
                        if (cause != null) {
                            throw th;
                        }
                        throw cause;
                    }
                    char[] cArr = new char[i2];
                    getcvmmodel.valueOf = 0;
                    while (getcvmmodel.valueOf < i2) {
                        int i4 = $10 + 109;
                        $11 = i4 % 128;
                        if (i4 % 2 == 0) {
                            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
                            java.lang.Object[] objArr7 = {getcvmmodel, getcvmmodel};
                            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                            if (obj4 == null) {
                                obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - android.view.KeyEvent.keyCodeFromString(""), 212 - android.view.View.MeasureSpec.getMode(0), (char) android.graphics.Color.alpha(0))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj4);
                            }
                            ((java.lang.reflect.Method) obj4).invoke(null, objArr7);
                            throw new java.lang.ArithmeticException();
                        }
                        cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
                        java.lang.Object[] objArr8 = {getcvmmodel, getcvmmodel};
                        java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                        if (obj5 == null) {
                            obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.getDeadChar(0, 0) + 34, 212 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == d ? 0 : -1)), (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj5);
                        }
                        ((java.lang.reflect.Method) obj5).invoke(null, objArr8);
                        d = 0.0d;
                    }
                    objArr2[0] = new java.lang.String(cArr);
                }

                @Override // com.payair.hce.ignoreFailedTransaction.values
                public final void writeReplace() {
                    int i = valueOf + 75;
                    AlternateContactlessPaymentDataJson = i % 128;
                    if (i % 2 != 0) {
                        com.payair.hce.ContactlessPaymentData.DigitizedCardProfile(new java.lang.Object[]{com.payair.hce.ContactlessPaymentData.this}, 765601174, -765601174, (int) java.lang.System.currentTimeMillis());
                        valueOf = (AlternateContactlessPaymentDataJson + 57) % 128;
                    } else {
                        com.payair.hce.ContactlessPaymentData.DigitizedCardProfile(new java.lang.Object[]{com.payair.hce.ContactlessPaymentData.this}, 765601174, -765601174, (int) java.lang.System.currentTimeMillis());
                        throw new java.lang.ArithmeticException();
                    }
                }

                static {
                    init$1();
                    $10 = 0;
                    $11 = 1;
                    init$0();
                    valueOf = 0;
                    AlternateContactlessPaymentDataJson = 1;
                    char[] cArr = new char[1707];
                    java.nio.ByteBuffer.wrap("^\u0080è434z$\u0085|Ì3\u0017:^:é30>{0\u0082)Í3\u0014\u0003_<æ:1;x2\u0083$Ê1\u00150\\\u001bç6.6y&\u0080+Ë,^\u0080è434z$\u0085|Ì3\u0017:^:é30>{0\u0082)Í3\u0014\u0003_-æ71/x%\u0083\u001eÊ&\u00153\\6ç&.2y#^\u0080è434z$\u0085|Ì3\u0017:^:é30>{0\u0082)Í3\u0014\u0003_.æ'11x#^\u0080è#3(z!\u0085|Ì9\u0017:^2é\"04{<\u0082uÍ<\u00143_1æ:19x)\u00832Ê*\u0015\u001c\\&ç$.2y3\u0080-Ë;\u00123\u000b\u0096½#f3/'Ðj\u0099&B$\u000bn¼1e<. ×<^\u0080è53%z1\u0085|Ì'\u0017<^;éy0({+\u00825Í+^\u0080è#35z1\u00852Ì&\u00171^yé\u00050\u001e{\u0014\u00825Í-\u00149_\u0019æ?1+x!6\n\u0080©[¢\u0012«í\u00ad¤»\u007f²6ó\u0081±X»\u0013±êÿ¥½|¿7µ\u008eºY·\u0010äë¸¢§\u008fÂ96â9«3T3\u001d#^óè\u0011^\u0080è#3(z!\u0085'Ì1\u00178^yé501{7\u0082uÍ5\u00149_0æ+1\tx\r\u0083lÊ,\u0015&\\)ç0.ky$\u0080'Ë'\u0012>]9ä#/!\u0011\u0085§&|-5$Ê\"\u00834X=\u0011|¦0\u007f442Íp\u00820[<\u00105©.~\f7\bÌi\u00857Z4\u0013.¨0ÃÛux®sçz\u0018|Qj\u008acÃ\"t`\u00adjæ`\u001f.Pl\u0089nÂd{k¬aåv\u001eoWO\u0088UÁozl³räl\u001d=Va\u008f~\u008b\u0017=£æ£¯³Pë\u0019\u00adÂ§\u008b¬<µå¨®»W¨\u0018¿Á¿^Ýè?3\u007fz0\u0085&Ì=\u00179^2éy00{6\u0082)Í/ûzM\u008e\u0096\u008bß\u009a \u008diÁ²\u0080û\u0088L\u0098^\u0080è 3#z=\u00850Ì{\u00173^?é;0={*\u0082#Í(\u0014(_8æ31,^Áè53<z'\u0085 Ì2\nd¼\u0086gÆ.\u009bÑ\u0098\u0098\u0082C\u0088\n\u009a½\u008dd\u0095/ÎÖ\u008e\u0099\u0083@\u008b\u000b\u0091²\u0081e\u0087,\u009a×\u008c\u009e\u008eA\u0088\b\u0098³\u008e^Èè53?z+^Ùè23>z*\u0085 Ì2^\u0080è 3#z=\u00850Ì{\u00178^9é30-{5\u0082?Í(^Ùè23>z*\u00854Ì!\u00170^%é#^èè53?z+\u0085>Ì;\u0017!^?é806^Úè>3:z<\u0085<Ì#\u0017;^Ìè83#z=\u0085>Ì=\u0017 ^;OJù¨\"èkµ\u0094¶Ý¬\u0006¦O´ø£!»jà\u0093©Ü©\u0005½N£÷ª \u00ad^Ùè23>z*\u0085kÌb\u0017%^Èè53?z7\u0085!Ì=\u00176^Èè53?z7\u0085!Ì=\u00176^\té/0`{o^Èè53?z7\u0085!Ì=\u00176^\té/0`{o\u0082\u0005Ím\u0014h¡\u0014\u0017öÌ¶\u0085ëzè3òèø¡ê\u0016ýÏå\u0084¾}þ2ýëñ ñ\u0019ûcãÕ\u000b\u000e\u0005¥J\u0013½È¤\u0081¾~²7 ìº¥¤²Æ\u0004\bß\t\u0096Zi) \tû\u0013²\n\u0005\u0016Ü\u001d\u0097\u0014nR!\u0015ø\u001b³\u0007\nVÝ4\u0094\u0000o\u001b&\u0005ù\u0006°\t¥_\u0013\u008fÈ\u0084\u0081\u0091~\u008d7\u008cì\u0080¥Ç\u0012µË\u00ad\u0080£yË6\u0088ï\u0098¤\u0085\u001d\u0083Ê\u009a\u0083Ñx\u00961\u009cî\u0080§Õ\u001c\u008cÕÏ\u0082À\u000e±¸acj*\u007fÕc\u009cbGn\u000e)¹[`C+MÒ%\u009dfDv\u000fk¶mat(?Óx\u009arEn\f;·b~!).ÐH\u009b B!h\u0017Þõ\u0005µLð³øúì!ûhëßü\u0006àMö\"à\u0094\u0017O\u0015\u0006\u001eù\u001d°\u0015k\u000e\"\u0016\bf¾\u008de\u0081,\u0095ÓÔ\u009aÝ^Ýè13?z1\u0085;Ì!^Ýè?3\u007fz\"\u0085!Ì;\u00171^#é40,{w\u00828Í)\u0014=_3æ:^Ýè?3\u007fz9\u00856Ì&\u0017;^3é;0v{(\u0082?Í6\u0014)Ì'^Ýè?3\u007fz!\u00856Ì7\u0017 ^$é2^\u009f^Ýè?3\u007fz0\u0085&Ì=\u00179^2éy0({+\u00825Í?\u0014)_>æ*^Éè%3=z>\u0085\fÌ,\u0017m^`^Ýè?3\u007fz0\u0085&Ì=\u00179^2éy0>{0\u00824Í<\u00149_/æ.1-x)\u0083/Ê6±o\u0007\u0092Ü\u0098\u0095\u0090j\u0086#\u009aø\u0091±Þ\u0006\u0083ß\u009b\u0094\u0095mÒ\"\u009bû\u009e°\u0094\t\u009cÞ\u008a\u0097\u008el\u0085\u0098þ.\u0003õ\t¼\u0001C\u0017\n\u000bÑ\u0000\u0098?/\u0019öV½YDC\u000b\u001eÒ\u000e\u0099\u0000 7÷\u0011¾NEA\f[Ó\u0012\u009a\u0017!\u001dè\u0015¿\u0003F\u0017\r\u001cÔ#\u009b\u0005\"BéMQ\u0007çú<ðuø\u008aîÃò\u0018ùQ¶æÿ?øtù\u008dòÂø\u001böPÍéâ>ôwä\u008c¡Åê\u001aéSåèï!ûvá\u008fä§}\u0011\u0080Ê\u008a\u0083\u0082|\u00945\u0088î\u0083§Ì\u0010\u0094É\u008f\u0082\u0083{\u00974Öíß¦\u0098\u001fÄÈ\u009c\u0081\u0097z\u009b3\u008fìÎ¥Ç\u001e\u0080^Èè?3>z5\u0085?Ì1\u0017z^%é303{\u0006\u0082=Í+\u00144_2æ01:x\u001f\u00839Êz\u0015u\\kç\".#y)\u0080-Ë;\u0012#](ä\u0013/5vv\u0081y^Ýè?3\u007fz0\u0085<Ì;\u0017!^:é809{=\u0082?Í)^Ýè?3\u007fz0\u0085<Ì;\u0017!^?é:09{>\u0082?Íu\u0014>_(æ713x$\u0083oÊ$\u0015*\\*ç\".#y5\u00808Ë;\u0012#]%ä8^îè>35z \u0085<Ì=\u00171^{é/0`{o\u0080|6\u009eíÞ¤\u0091[\u0087\u0012\u009cÉ\u0098\u0080\u00937Øî\u009d¥\u0091\\\u0088\u0013\u008aÊ\u0091\u0081\u009d8\u0086ïÐ¦\u0088]\u0084vTÀº\u001b\u00adR©\u00adñP%æÝ=ÛtÅ\u008b\u009eÂÄ\u0019ÀPÖç\u009a>Êuß\u008cÔÃÍ\u001a\u0092QÎèÏ?ÓvÓ\u008dÑ\u0016D ¯{¦2½Íç\u0084¦_¸\u0016â¡ x£3ªÊ®\u0085ª\\£\u0017¾®·^Þè53<z'\u0085}Ì'\u00173^xé109{2\u0082?Í\u0004\u0014?_<æ31:x2\u0083 hPÞ»\u0005²L©³óú©!½hößµ\u0006µM³´\u008bû±\"·i½Ð£\u0007¸Nºµ¶^Ýè?3\u007fz9\u00856Ì&\u0017;^3é;0v{8\u00824Í?\u0014._2æ71;xn\u00830Ê'\u0015.\\1ç!õ\u0099C{\u0098;Ñt.xg\u007f¼eõ<Bb\u009byÐp)kf1¿yôoM~\u009aDÓj(dak¾b4f\u0082\u0084YÄ\u0010\u0086ï\u008c¦\u0082}À4\u008f\u0083\u0099Z\u008a\u0011\u008eè\u0085§Î~\u00815\u008f\u008c\u008b[\u0083\u0012\u009eé\u0088 \u0089\u007f\u008a6\u0096\u008d\u0090D\u0089nåØ\u0007\u0003GJ\u001aµ\u0019ü\u0003'\tn\u001bÙ\f\u0000\u0014KO²\u0000ý\u0016$\ro\tÖ\u0002\u0001IH\u001e³\u0010ú\u0014%\u001cl\u0019×\u000f\u001e\u000eI\r°\u0019û\u001f\"\u0006^dè\u00863Æz\u0098\u0085\u0093Ì\u009e\u0017\u0098^\u008aé\u00830Ï{\u0082\u0082\u0096Í\u008b\u0014\u0089_\u0080æÉ1\u0080x\u0090\u0083\u0096Ê\u009c\u0015\u009f\\\u008fç\u008c.\u008dy\u0097\u0080\u009fË\u0084åµSW\u0088\u0017ÁI>BwO¬Iå[RR\u008boÀT9JvG¯\u001aäW]C\u008a^ÃD8Mq\u0004®MçE\\C\u0095IÂJ;RpQ©PæJ_J\u0094Q^Ýè?3\u007fz$\u00856Ì:\u00171^9é%0v{;\u0082/Í2\u00140_9æp19x)\u0083/Ê%\u0015&\\6ç5.4y.\u0080&Ë=^Ýè?3\u007fz$\u00856Ì:\u00171^9é%0\u0007{=\u00826Í0\u00141_sæ<1*x)\u0083-Ê&\u0015m\\\"ç,.(y \u0080-Ë;\u0012:]9ä%/#v:^\u0095ÔùbM¹Mð]\u000f\u0005F\\\u009dIÔBc[º~ñP\bJGR\u009e@^\u0080è434z$\u0085|Ì'\u0017:^5é<0={-\u0082uÍ9\u0014=_.æ;1=x!\u0083/Ê&\u0015\u001c\\#ç .(y>\u0080,_¸é\f2\f{\u001c\u0084DÍ\u001f\u0016\u0002_\rè\u00041\u0005z\u0015\u0083MÌ\u0004\u0015\u0001^\u000bç\u001f0\u0003\u008e¢8\u0016ã\u0016ª\u0006U^\u001c\u0005Ç\u0018\u008e\u00179\u001eà\u001f«\u000fRW\u001d\bÄ\u001b\u008f\u00126\tá\u0019^\u0080è#3(z!\u0085|Ì%\u00170^;é\"0\u0007{-\u0082(Í:\u0014?_8\u0001G·älï%æÚà\u0093öHÿ\u0001¾¶üoö$üÝ²\u0092ðKò\u0000ø¹únÇ'êÜç\u0095éJè\u0003ì¸áqÞ&äßê\u0094ìMø\u0002ë»Ôpû)ìÞå\u0097ÂL\u0098\u0005ÆºÛm¯Û\u001b\u0000\u001bI\u000b¶Sÿ\u0019$\tm\rÚ'\u0003\u0010H\u0006±\u0006\u0089Ê?~ä~\u00adnR6\u001b|Àl\u0089h>Bçf¬zU}\u001at^\u0080è434z$\u0085|Ì'\u0017:^5é<0={-\u0082uÍ9\u0014/_)æ810x,\u0083%Ê'\u00151\\ M\u009bû8 3i:\u0096<ß*\u0004#Mbú #*h \u0091nÞ,\u0007.L$õ'\"7k/\u0090<Ù6\u00064O;ô;=/j\u0003\u00939Ø<\u00018N~÷$<9^\u0080è434z$\u0085|Ì6\u0017&^\"é60;{:\u0082?qÕÇa\u001caUqª)ãc8sqwÆe\u001ftT~\u00ad`Ø4n\u0080µ\u0080ü\u0090\u0003ÈJ\u0082\u0091\u0092Ø\u0096o\u008e¶\u0089ý\u008a\u0004\u0080\u0099\u0001/µôµ½¥Bý\u000b·Ð§\u0099£.¹÷«¼±E¾\\óêG1GxW\u0087\u000fÎE\u0015U\\QëR2FyY\u0080N^\u0080è434z$\u0085|Ì6\u0017&^\"é'0?{8\u00823Í+\u0014?û°M\u0004\u0096\u0004ß\u0014 Li\u0006²\u0016û\u0012L8\u0095\u0001Þ\u0004'\u000f²/\u0004\u009bß\u009f\u0096\u0089i\u009d Ôû\u009e²\u0096\u0005\u008fÜ\u0099\u0097\u009an\u009a!\u0095ø\u0097³\u0081\nÞÝÞ\u0094\u0097o\u008c&Âù\u008e°\u0098\u000b\u009eÂ\u0082^\u0080è=3?z&\u0085|Ì#\u0017<^8é307{.\u0082)Ít\u0014\u001e_.æ*1\fx(\u0083 Ê0\u0015&\\ ç\u0003.)y+\u0080,Ë,\u00128^\u0080è 3#z=\u00850Ì{\u0017<^9é'07{+\u0082.Í(Ñ\u000fg¦¼§õâ\nù^\u0080è 3#z=\u00850Ì{\u0017&^3é;0>{v\u00827Í:\u0014,_.^Èè\"30z>\u0085?Ì;\u00176^xé007{5\u0082>Í=\u00145_.æ61qx3\u0083.^Ãè933z\u0015\u0085\u001fÌ\u0011\u0017\u0006^\té50+{-\u0082tÍ(\u00143^\u0080è53%z1\u0085|Ì9\u00170^2é>09{\u0006\u00829Í4\u00148_8æ=1,xn\u00839Ê/\u0015/^Íè<3$z7\u0085 Ì \u00174^5é<0+Nëø^#NjZ\u0095\u0017ÜR\u0007QNHùR GkATåâQ9UpC\u008fWÆ\u001e\u001dTT\\ãE:SqP\u0088PÇ_\u001e]UKì\u0014;\u0014rA\u0089TÀ\b\u001fGVQíP$Ps\f\u008aUÁA\u0018CÏ«y\u000b¢\bë\u0016\u0014\u001b]P\u0086\u001dÏ\rx\t¡\u001aê\u001c\u0013\u0017\\\u001f^èè?3=z6\u00855Ì=\u0017&^>¯¾\u0019\nÂ\u000e\u008b\u0018t\f=Eæ\u0006¯\u0001\u0018\u001aÁ\u0005\u008aHs\u0014<\u0017å\r®\u0005\u0017\tÀ\r\u0089\u001br\f;Sä\u001e\u00ad\u000f\u0016\tßW\u0088IqY:\u0014ã\u001b¬\u0018\u0015\\Þ\u001e\u0087\u0019p\u00129<â «:\u0014$Ý8\u0086?Of8$á#ª*\u00131Ü,\u0085/N&".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1707);
                    DigitizedCardProfile = cArr;
                    values = 2836897680198920272L;
                }

                static void init$1() {
                    $$d = new byte[]{92, -126, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -5};
                    $$e = 171;
                }

                /* JADX WARN: Removed duplicated region for block: B:113:0x0b92  */
                /* JADX WARN: Removed duplicated region for block: B:121:0x0c57  */
                /* JADX WARN: Removed duplicated region for block: B:168:0x11cf  */
                /* JADX WARN: Removed duplicated region for block: B:176:0x128d A[Catch: all -> 0x01ed, TRY_ENTER, TryCatch #4 {all -> 0x01ed, blocks: (B:6:0x00d9, B:8:0x00ec, B:9:0x0138, B:18:0x0216, B:20:0x025e, B:21:0x02ac, B:28:0x033a, B:30:0x034d, B:31:0x039a, B:39:0x0466, B:42:0x0506, B:45:0x04b3, B:46:0x051b, B:48:0x052c, B:49:0x056f, B:55:0x0633, B:57:0x067d, B:58:0x06d1, B:74:0x07b6, B:76:0x07ee, B:77:0x0849, B:84:0x0905, B:86:0x0918, B:87:0x0965, B:95:0x0a20, B:97:0x0a53, B:98:0x0aa9, B:102:0x0ae7, B:104:0x0afa, B:105:0x0b42, B:114:0x0baa, B:117:0x0c41, B:120:0x0bf2, B:122:0x0c9a, B:124:0x0cad, B:125:0x0cf9, B:131:0x0daf, B:134:0x0e37, B:137:0x0de8, B:139:0x0e73, B:141:0x0e86, B:142:0x0ecb, B:148:0x0f22, B:150:0x0f6c, B:151:0x0fc1, B:169:0x11ec, B:172:0x1277, B:175:0x1224, B:176:0x128d, B:178:0x129c, B:179:0x12e2, B:183:0x1389, B:185:0x13b9, B:186:0x140e, B:190:0x1425, B:192:0x143d, B:193:0x1481, B:199:0x1528, B:202:0x15c7, B:205:0x1574, B:207:0x1605, B:209:0x1618, B:210:0x1669, B:212:0x1672, B:214:0x1690, B:215:0x16da, B:220:0x2477, B:222:0x248a, B:223:0x24d0, B:238:0x2907, B:240:0x291a, B:241:0x2965, B:247:0x2b29, B:249:0x2b3c, B:250:0x2b8b, B:259:0x2c52, B:262:0x2ce5, B:265:0x2c90, B:271:0x2a08, B:273:0x2a1b, B:274:0x2a67, B:288:0x2ece, B:290:0x2ee1, B:291:0x2f39, B:299:0x3002, B:302:0x3098, B:305:0x3041, B:318:0x3223, B:320:0x3268, B:321:0x32c1, B:325:0x32fd, B:327:0x3310, B:328:0x335c, B:332:0x3426, B:335:0x34b6, B:338:0x3463, B:340:0x34e9, B:343:0x3587, B:346:0x3533, B:362:0x24e5, B:364:0x2502, B:365:0x2551, B:370:0x1ff1, B:372:0x2004, B:373:0x204d, B:380:0x2069, B:382:0x207c, B:383:0x20cc, B:398:0x21f8, B:400:0x2235, B:401:0x228f, B:406:0x2397, B:408:0x23e1, B:409:0x2434, B:414:0x22c5, B:416:0x230a, B:417:0x235e, B:427:0x10d5, B:429:0x10e8, B:430:0x1134), top: B:5:0x00d9 }] */
                /* JADX WARN: Removed duplicated region for block: B:222:0x248a A[Catch: all -> 0x01ed, TryCatch #4 {all -> 0x01ed, blocks: (B:6:0x00d9, B:8:0x00ec, B:9:0x0138, B:18:0x0216, B:20:0x025e, B:21:0x02ac, B:28:0x033a, B:30:0x034d, B:31:0x039a, B:39:0x0466, B:42:0x0506, B:45:0x04b3, B:46:0x051b, B:48:0x052c, B:49:0x056f, B:55:0x0633, B:57:0x067d, B:58:0x06d1, B:74:0x07b6, B:76:0x07ee, B:77:0x0849, B:84:0x0905, B:86:0x0918, B:87:0x0965, B:95:0x0a20, B:97:0x0a53, B:98:0x0aa9, B:102:0x0ae7, B:104:0x0afa, B:105:0x0b42, B:114:0x0baa, B:117:0x0c41, B:120:0x0bf2, B:122:0x0c9a, B:124:0x0cad, B:125:0x0cf9, B:131:0x0daf, B:134:0x0e37, B:137:0x0de8, B:139:0x0e73, B:141:0x0e86, B:142:0x0ecb, B:148:0x0f22, B:150:0x0f6c, B:151:0x0fc1, B:169:0x11ec, B:172:0x1277, B:175:0x1224, B:176:0x128d, B:178:0x129c, B:179:0x12e2, B:183:0x1389, B:185:0x13b9, B:186:0x140e, B:190:0x1425, B:192:0x143d, B:193:0x1481, B:199:0x1528, B:202:0x15c7, B:205:0x1574, B:207:0x1605, B:209:0x1618, B:210:0x1669, B:212:0x1672, B:214:0x1690, B:215:0x16da, B:220:0x2477, B:222:0x248a, B:223:0x24d0, B:238:0x2907, B:240:0x291a, B:241:0x2965, B:247:0x2b29, B:249:0x2b3c, B:250:0x2b8b, B:259:0x2c52, B:262:0x2ce5, B:265:0x2c90, B:271:0x2a08, B:273:0x2a1b, B:274:0x2a67, B:288:0x2ece, B:290:0x2ee1, B:291:0x2f39, B:299:0x3002, B:302:0x3098, B:305:0x3041, B:318:0x3223, B:320:0x3268, B:321:0x32c1, B:325:0x32fd, B:327:0x3310, B:328:0x335c, B:332:0x3426, B:335:0x34b6, B:338:0x3463, B:340:0x34e9, B:343:0x3587, B:346:0x3533, B:362:0x24e5, B:364:0x2502, B:365:0x2551, B:370:0x1ff1, B:372:0x2004, B:373:0x204d, B:380:0x2069, B:382:0x207c, B:383:0x20cc, B:398:0x21f8, B:400:0x2235, B:401:0x228f, B:406:0x2397, B:408:0x23e1, B:409:0x2434, B:414:0x22c5, B:416:0x230a, B:417:0x235e, B:427:0x10d5, B:429:0x10e8, B:430:0x1134), top: B:5:0x00d9 }] */
                /* JADX WARN: Removed duplicated region for block: B:225:0x24d9  */
                /* JADX WARN: Removed duplicated region for block: B:228:0x25fa  */
                /* JADX WARN: Removed duplicated region for block: B:247:0x2b29 A[Catch: all -> 0x01ed, TRY_ENTER, TryCatch #4 {all -> 0x01ed, blocks: (B:6:0x00d9, B:8:0x00ec, B:9:0x0138, B:18:0x0216, B:20:0x025e, B:21:0x02ac, B:28:0x033a, B:30:0x034d, B:31:0x039a, B:39:0x0466, B:42:0x0506, B:45:0x04b3, B:46:0x051b, B:48:0x052c, B:49:0x056f, B:55:0x0633, B:57:0x067d, B:58:0x06d1, B:74:0x07b6, B:76:0x07ee, B:77:0x0849, B:84:0x0905, B:86:0x0918, B:87:0x0965, B:95:0x0a20, B:97:0x0a53, B:98:0x0aa9, B:102:0x0ae7, B:104:0x0afa, B:105:0x0b42, B:114:0x0baa, B:117:0x0c41, B:120:0x0bf2, B:122:0x0c9a, B:124:0x0cad, B:125:0x0cf9, B:131:0x0daf, B:134:0x0e37, B:137:0x0de8, B:139:0x0e73, B:141:0x0e86, B:142:0x0ecb, B:148:0x0f22, B:150:0x0f6c, B:151:0x0fc1, B:169:0x11ec, B:172:0x1277, B:175:0x1224, B:176:0x128d, B:178:0x129c, B:179:0x12e2, B:183:0x1389, B:185:0x13b9, B:186:0x140e, B:190:0x1425, B:192:0x143d, B:193:0x1481, B:199:0x1528, B:202:0x15c7, B:205:0x1574, B:207:0x1605, B:209:0x1618, B:210:0x1669, B:212:0x1672, B:214:0x1690, B:215:0x16da, B:220:0x2477, B:222:0x248a, B:223:0x24d0, B:238:0x2907, B:240:0x291a, B:241:0x2965, B:247:0x2b29, B:249:0x2b3c, B:250:0x2b8b, B:259:0x2c52, B:262:0x2ce5, B:265:0x2c90, B:271:0x2a08, B:273:0x2a1b, B:274:0x2a67, B:288:0x2ece, B:290:0x2ee1, B:291:0x2f39, B:299:0x3002, B:302:0x3098, B:305:0x3041, B:318:0x3223, B:320:0x3268, B:321:0x32c1, B:325:0x32fd, B:327:0x3310, B:328:0x335c, B:332:0x3426, B:335:0x34b6, B:338:0x3463, B:340:0x34e9, B:343:0x3587, B:346:0x3533, B:362:0x24e5, B:364:0x2502, B:365:0x2551, B:370:0x1ff1, B:372:0x2004, B:373:0x204d, B:380:0x2069, B:382:0x207c, B:383:0x20cc, B:398:0x21f8, B:400:0x2235, B:401:0x228f, B:406:0x2397, B:408:0x23e1, B:409:0x2434, B:414:0x22c5, B:416:0x230a, B:417:0x235e, B:427:0x10d5, B:429:0x10e8, B:430:0x1134), top: B:5:0x00d9 }] */
                /* JADX WARN: Removed duplicated region for block: B:268:0x2c2a A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:285:0x2ebc  */
                /* JADX WARN: Removed duplicated region for block: B:298:0x2fea  */
                /* JADX WARN: Removed duplicated region for block: B:306:0x30ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:359:0x2fe7 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:361:0x24e4  */
                /* JADX WARN: Removed duplicated region for block: B:73:0x0796  */
                /* JADX WARN: Removed duplicated region for block: B:80:0x085f  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static java.lang.Object[] AlternateContactlessPaymentDataJson(android.content.Context context, int i, int i2, int i3) {
                    java.lang.Integer num;
                    int i4;
                    java.lang.String str;
                    int i5;
                    int i6;
                    long j;
                    int i7;
                    int i8;
                    int i9;
                    int i10;
                    long j2;
                    java.lang.String str2;
                    int i11;
                    int i12;
                    java.lang.String[][] strArr;
                    java.lang.String str3;
                    java.lang.String str4;
                    java.lang.Object obj;
                    java.lang.Object invoke;
                    int i13;
                    char c;
                    java.lang.String[][] strArr2;
                    int i14;
                    int i15;
                    int i16;
                    java.lang.String intern;
                    java.lang.Object[] objArr2;
                    java.lang.String[][] strArr3;
                    int i17;
                    int i18;
                    int i19;
                    java.lang.String str5;
                    java.lang.Object[] objArr3;
                    java.lang.String next;
                    java.lang.String next2;
                    int i20 = 0;
                    java.lang.Integer num2 = 0;
                    long j3 = 0;
                    int i21 = 1;
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    a(464 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) (64383 - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), android.widget.ExpandableListView.getPackedPositionType(0L) + 8, objArr4);
                    java.lang.String intern2 = ((java.lang.String) objArr4[0]).intern();
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    a((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 26, objArr5);
                    java.lang.String intern3 = ((java.lang.String) objArr5[0]).intern();
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    a(27 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6), 26 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr6);
                    java.lang.String intern4 = ((java.lang.String) objArr6[0]).intern();
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    a(51 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) android.text.TextUtils.indexOf("", "", 0, 0), android.text.TextUtils.getOffsetAfter("", 0) + 18, objArr7);
                    java.lang.String intern5 = ((java.lang.String) objArr7[0]).intern();
                    float f = 0.0f;
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    a((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 70, (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 28, objArr8);
                    java.lang.String[] strArr4 = {intern3, intern4, intern5, ((java.lang.String) objArr8[0]).intern()};
                    int i22 = 0;
                    while (true) {
                        if (i22 >= 4) {
                            num = num2;
                            i4 = i;
                            break;
                        }
                        try {
                            java.lang.Object[] objArr9 = {strArr4[i22]};
                            java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                            if (obj2 == null) {
                                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(37 - (android.media.AudioTrack.getMaxVolume() > f ? 1 : (android.media.AudioTrack.getMaxVolume() == f ? 0 : -1)), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 3161, (char) (33098 - (android.widget.ExpandableListView.getPackedPositionForChild(i20, i20) > j3 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(i20, i20) == j3 ? 0 : -1))));
                                byte b = $$a[14];
                                java.lang.Object[] objArr10 = new java.lang.Object[i21];
                                b((short) 35, (byte) (b + 1), (byte) (-b), objArr10);
                                java.lang.String str6 = (java.lang.String) objArr10[i20];
                                java.lang.Class<?>[] clsArr = new java.lang.Class[i21];
                                clsArr[i20] = java.lang.String.class;
                                obj2 = cls.getMethod(str6, clsArr);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, obj2);
                            }
                            long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr9)).longValue();
                            long j4 = i;
                            long j5 = ~j4;
                            num = num2;
                            long j6 = ~((~longValue) | j4);
                            long j7 = ((-574) * longValue) + 657452306182L + (((~(j5 | 1145387292)) | j6) * 1150) + ((j6 | (~(longValue | j5))) * (-575)) + (((~(j4 | 1145387292)) | (~((-1145387293) | j5))) * 575) + 2052858031;
                            int i23 = (int) (j7 >> 32);
                            int i24 = ~i;
                            if (((((int) j7) & ((((~((-1310779183) | i24)) | 33563656) * 98) + 1742112048 + (((~((-1546961704) | i24)) | (-1310779183) | (~(1546961703 | i))) * (-49)) + (((~((-1310779183) | i)) | (-1580525360)) * 49))) | ((((270283958 | i) * (-859)) + 6726048 + (((~(270283958 | i24)) | (~((-794805) | i))) * 859) + (((~(i24 | (-1166942453))) | 1166147648) * 859)) & i23)) != 0) {
                                i4 = (i22 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE) ^ i;
                                break;
                            }
                            i22++;
                            num2 = num;
                            i20 = 0;
                            j3 = 0;
                            i21 = 1;
                            f = 0.0f;
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    }
                    int i25 = 3;
                    if (i4 != i) {
                        java.lang.Object[] objArr11 = {new int[]{i}, new int[]{i4}, null, null, new int[1]};
                        int i26 = ~(177145202 | i);
                        java.lang.Object[] objArr12 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((1696622605 | i26) * (-814)) + 1975625310 + ((i26 | (~((~i) | (-1873700896))) | 66912) * 407) + (((~(i | (-177145203))) | 66912 | (~(1873700895 | i))) * 407))};
                        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                        if (obj3 == null) {
                            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.resolveSize(0, 0), android.view.View.resolveSizeAndState(0, 0, 0) + 2713, (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6));
                            byte b2 = $$a[14];
                            java.lang.Object[] objArr13 = new java.lang.Object[1];
                            b((short) (b2 + 1), r4[16], (byte) (-b2), objArr13);
                            obj3 = cls2.getMethod((java.lang.String) objArr13[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj3);
                        }
                        ((int[]) objArr11[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr12)).intValue();
                        return objArr11;
                    }
                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                    a(android.text.TextUtils.indexOf("", "", 0) + 98, (char) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 21782), 12 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr14);
                    java.lang.String intern6 = ((java.lang.String) objArr14[0]).intern();
                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                    a(109 - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), android.view.View.resolveSizeAndState(0, 0, 0) + 13, objArr15);
                    java.lang.String intern7 = ((java.lang.String) objArr15[0]).intern();
                    java.lang.Object[] objArr16 = new java.lang.Object[1];
                    a(122 - android.view.MotionEvent.axisFromString(""), (char) (android.view.MotionEvent.axisFromString("") + 1), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 18, objArr16);
                    java.lang.String[] strArr5 = {intern6, intern7, ((java.lang.String) objArr16[0]).intern()};
                    int i27 = 0;
                    while (true) {
                        if (i27 >= i25) {
                            str = intern2;
                            i5 = i;
                            break;
                        }
                        java.lang.Object[] objArr17 = {strArr5[i27]};
                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                        if (obj4 == null) {
                            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSize(0, 0) + 36, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3161, (char) (33099 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)));
                            byte b3 = $$a[14];
                            java.lang.Object[] objArr18 = new java.lang.Object[1];
                            b((short) 35, (byte) (b3 + 1), (byte) (-b3), objArr18);
                            obj4 = cls3.getMethod((java.lang.String) objArr18[0], java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, obj4);
                        }
                        long longValue2 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr17)).longValue();
                        long j8 = ~(530621772 | longValue2);
                        long j9 = ~longValue2;
                        java.lang.String[] strArr6 = strArr5;
                        long j10 = ~(j9 | (-530621773));
                        str = intern2;
                        long j11 = i;
                        long j12 = ((399 * longValue2) - 211718087427L) + ((j8 | j10 | (~(j9 | j11))) * 398) + (((-530621773) | longValue2) * (-1194)) + (((~((~j11) | j9)) | j8 | j10) * 398) + 1438092511;
                        int i28 = (int) (j12 >> 32);
                        int i29 = ~i;
                        if (((((int) j12) & (((((~r4) | 1079522304) * (-828)) - 1754753727) + ((1778218581 | i29) * (-828)) + 808796632)) | (((((~((-176697511) | i)) * (-301)) - 566676462) + (((~(i29 | (-512326063))) | (~((-1949552474) | i))) * (-301)) + (((~(512326062 | i)) | (-1949552474)) * 301)) & i28)) != 0) {
                            AlternateContactlessPaymentDataJson = (valueOf + 79) % 128;
                            i5 = i ^ (i27 + 270);
                            break;
                        }
                        i27++;
                        intern2 = str;
                        strArr5 = strArr6;
                        i25 = 3;
                    }
                    if (i5 != i) {
                        java.lang.Object[] objArr19 = {new int[]{i}, new int[]{i5}, null, null, new int[1]};
                        int i30 = ~i;
                        java.lang.Object[] objArr20 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((805569036 | i30) * (-192)) + 676305489 + (((~((-1203287540) | i30)) | 41989522) * (-384)) + (((~(i | (-41989523))) | (~(i30 | (-1161298018))) | (~(2008856575 | i))) * 192))};
                        java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                        if (obj5 == null) {
                            java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 2713 - android.view.KeyEvent.normalizeMetaState(0), (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16));
                            byte b4 = $$a[14];
                            java.lang.Object[] objArr21 = new java.lang.Object[1];
                            b((short) (b4 + 1), r2[16], (byte) (-b4), objArr21);
                            obj5 = cls4.getMethod((java.lang.String) objArr21[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj5);
                        }
                        ((int[]) objArr19[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr20)).intValue();
                        return objArr19;
                    }
                    java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1781008036);
                    if (obj6 == null) {
                        java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 1865 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (41775 - android.view.KeyEvent.getDeadChar(0, 0)));
                        byte b5 = (byte) ($$a[14] + 1);
                        java.lang.Object[] objArr22 = new java.lang.Object[1];
                        b((short) 653, b5, b5, objArr22);
                        obj6 = cls5.getMethod((java.lang.String) objArr22[0], null);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1781008036, obj6);
                    }
                    long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, null)).longValue();
                    long j13 = i;
                    long j14 = ~j13;
                    long j15 = 330029495 | j14;
                    long j16 = ((((((-518) * longValue3) + 170955278928L) + (((~j15) | longValue3) * 519)) + (((~(j15 | longValue3)) | (~(((-330029496) | longValue3) | j13))) * (-519))) + (((~(longValue3 | j13)) | (-330029496)) * 519)) - 1599183366;
                    int i31 = ~i;
                    int i32 = (((int) j16) & ((((293617668 | r4) * (-814)) - 1385466773) + (((~((-327861847) | i)) | (~(1109364563 | i31)) | 1075120385) * 407) + (((~(327861846 | i)) | 1075120385 | (~((-1109364564) | i))) * 407))) | (((int) (j16 >> 32)) & (((((~((-2428929) | i31)) | (~((-1090535461) | i31))) * (-184)) - 1019427974) + (((~(884817176 | i31)) | (~(i31 | 1972923708)) | (-1975352637)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + 849319432));
                    int i33 = i32 != 0 ? (i32 + 199) ^ i : i;
                    if (i33 != i) {
                        java.lang.Object[] objArr23 = {new int[]{i}, new int[]{i33}, null, null, new int[1]};
                        java.lang.Object[] objArr24 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((2012965777 | i31) * (-369)) - 1396155502) + (((~((-326847362) | i31)) | 1723998736) * (-369)) + (((~(i | 326847361)) | 1686118416 | (~((-288967042) | i31))) * 369))};
                        java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                        if (obj7 == null) {
                            java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.widget.ExpandableListView.getPackedPositionType(0L), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 2713, (char) android.view.View.MeasureSpec.getMode(0));
                            byte b6 = $$a[14];
                            java.lang.Object[] objArr25 = new java.lang.Object[1];
                            b((short) (b6 + 1), r5[16], (byte) (-b6), objArr25);
                            obj7 = cls6.getMethod((java.lang.String) objArr25[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj7);
                        }
                        ((int[]) objArr23[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj7).invoke(null, objArr24)).intValue();
                        return objArr23;
                    }
                    java.lang.Object[] objArr26 = new java.lang.Object[1];
                    a(141 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 26763), android.os.Process.getGidForName("") + 21, objArr26);
                    java.lang.String intern8 = ((java.lang.String) objArr26[0]).intern();
                    java.lang.Object[] objArr27 = new java.lang.Object[1];
                    a(android.view.View.MeasureSpec.getMode(0) + 161, (char) (android.view.View.resolveSizeAndState(0, 0, 0) + 53519), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 6, objArr27);
                    java.lang.String intern9 = ((java.lang.String) objArr27[0]).intern();
                    java.io.File file = new java.io.File(intern8);
                    if (file.exists() && file.isFile()) {
                        try {
                            java.util.Scanner scanner = new java.util.Scanner(new java.io.FileInputStream(file));
                            java.lang.Object[] objArr28 = new java.lang.Object[1];
                            a(167 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16), (android.os.Process.myTid() >> 22) + 2, objArr28);
                            java.util.Scanner useDelimiter = scanner.useDelimiter(((java.lang.String) objArr28[0]).intern());
                            next2 = useDelimiter.hasNext() ? useDelimiter.next() : "";
                            useDelimiter.close();
                        } catch (java.io.IOException unused) {
                        }
                        if (next2.contains(intern9)) {
                            i6 = i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE;
                            if (i6 == i) {
                                AlternateContactlessPaymentDataJson = (valueOf + 101) % 128;
                                java.lang.Object[] objArr29 = {new int[]{i}, new int[]{i6}, null, null, new int[1]};
                                java.lang.Object[] objArr30 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((~(i | 1073573071)) | 977273026) * (-756)) - 2032511187) + ((1073573071 | i31) * 756))};
                                java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj8 == null) {
                                    java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 49, 2713 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                    byte b7 = $$a[14];
                                    java.lang.Object[] objArr31 = new java.lang.Object[1];
                                    b((short) (b7 + 1), r2[16], (byte) (-b7), objArr31);
                                    obj8 = cls7.getMethod((java.lang.String) objArr31[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj8);
                                }
                                ((int[]) objArr29[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, objArr30)).intValue();
                                return objArr29;
                            }
                            java.lang.Object[] objArr32 = new java.lang.Object[1];
                            a(169 - android.text.TextUtils.indexOf("", "", 0), (char) (android.view.ViewConfiguration.getTouchSlop() >> 8), 31 - android.text.TextUtils.getTrimmedLength(""), objArr32);
                            java.lang.String intern10 = ((java.lang.String) objArr32[0]).intern();
                            java.lang.Object[] objArr33 = new java.lang.Object[1];
                            a(android.os.Process.getGidForName("") + 201, (char) (android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 20229), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 24, objArr33);
                            java.lang.String intern11 = ((java.lang.String) objArr33[0]).intern();
                            java.lang.Object[] objArr34 = new java.lang.Object[1];
                            a(224 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (40283 - android.view.View.resolveSize(0, 0)), 27 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr34);
                            java.lang.String intern12 = ((java.lang.String) objArr34[0]).intern();
                            java.lang.Object[] objArr35 = new java.lang.Object[1];
                            a(android.graphics.Color.rgb(0, 0, 0) + 16777467, (char) (54679 - (android.os.Process.myTid() >> 22)), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 14, objArr35);
                            java.lang.String[] strArr7 = {intern10, intern11, intern12, ((java.lang.String) objArr35[0]).intern()};
                            int i34 = 0;
                            while (true) {
                                if (i34 >= 4) {
                                    j = j13;
                                    i7 = i;
                                    break;
                                }
                                java.lang.Object[] objArr36 = {strArr7[i34]};
                                java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                                if (obj9 == null) {
                                    java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.text.TextUtils.indexOf("", "", 0), 3162 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (android.graphics.Color.red(0) + 33099));
                                    byte b8 = $$a[14];
                                    java.lang.Object[] objArr37 = new java.lang.Object[1];
                                    b((short) 35, (byte) (b8 + 1), (byte) (-b8), objArr37);
                                    obj9 = cls8.getMethod((java.lang.String) objArr37[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, obj9);
                                }
                                long longValue4 = ((java.lang.Long) ((java.lang.reflect.Method) obj9).invoke(null, objArr36)).longValue();
                                long j17 = ~longValue4;
                                j = j13;
                                long j18 = ((-932) * longValue4) + 606259832442L + (((~(j14 | (-649100464))) | j17) * (-933)) + (((~(j17 | j14)) | (~(j17 | 649100463))) * 933) + ((~(longValue4 | 649100463)) * 933) + 258370275;
                                if (((((int) (j18 >> 32)) & ((((~(2049179105 | i31)) | (-808561780)) * (-602)) + 1686719016 + (((~(2049179105 | i)) | (-2050227700) | (~((-807513186) | i31))) * (-301)) + ((~((-808561780) | i31)) * 301))) | (((int) j18) & (((((~(1631723607 | i)) | (-194497198)) * (-964)) - 977492035) + (((~(1631723607 | i31)) | (-1809312512)) * (-964))))) != 0) {
                                    i7 = i ^ (i34 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                                    break;
                                }
                                i34++;
                                j13 = j;
                            }
                            if (i7 != i) {
                                java.lang.Object[] objArr38 = {new int[]{i}, new int[]{i7}, null, null, new int[1]};
                                int i35 = ~(1849534108 | i31);
                                java.lang.Object[] objArr39 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((1677729800 | i35) * (-970)) - 1785274599) + ((i35 | 171804308) * 970))};
                                java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj10 == null) {
                                    java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 49, 2713 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (android.view.KeyEvent.getMaxKeyCode() >> 16));
                                    byte b9 = $$a[14];
                                    java.lang.Object[] objArr40 = new java.lang.Object[1];
                                    b((short) (b9 + 1), r5[16], (byte) (-b9), objArr40);
                                    obj10 = cls9.getMethod((java.lang.String) objArr40[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj10);
                                }
                                ((int[]) objArr38[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj10).invoke(null, objArr39)).intValue();
                                return objArr38;
                            }
                            java.lang.Object[] objArr41 = new java.lang.Object[1];
                            a(android.view.KeyEvent.normalizeMetaState(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_SHIELD_VALUE, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 12, objArr41);
                            java.lang.Object[] objArr42 = {((java.lang.String) objArr41[0]).intern()};
                            java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                            if (obj11 == null) {
                                java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 41, (-16775295) - android.graphics.Color.rgb(0, 0, 0), (char) ((-1) - android.view.MotionEvent.axisFromString("")));
                                byte b10 = (byte) ($$a[14] + 1);
                                java.lang.Object[] objArr43 = new java.lang.Object[1];
                                b((short) 653, b10, b10, objArr43);
                                obj11 = cls10.getMethod((java.lang.String) objArr43[0], java.lang.String.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj11);
                            }
                            java.lang.String str7 = (java.lang.String) ((java.lang.reflect.Method) obj11).invoke(null, objArr42);
                            if (str7 != null) {
                                java.lang.Object[] objArr44 = new java.lang.Object[1];
                                a(android.view.View.combineMeasuredStates(0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE, (char) (42427 - (android.view.ViewConfiguration.getTouchSlop() >> 8)), 10 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr44);
                                if (str7.contains(((java.lang.String) objArr44[0]).intern())) {
                                    int i36 = AlternateContactlessPaymentDataJson + 111;
                                    valueOf = i36 % 128;
                                    i8 = i36 % 2 != 0 ? i ^ 20956 : i ^ 250;
                                    if (i8 == i) {
                                        java.lang.Object[] objArr45 = {new int[]{i}, new int[]{i8}, null, null, new int[1]};
                                        java.lang.Object[] objArr46 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((~((-86119014) | i31)) | (~(1606139903 | i))) * (-302)) - 333506745) + ((~((-86119014) | i)) * (-604)) + (((~(i | 1520020890)) | 1075314696) * 302))};
                                        java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj12 == null) {
                                            java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.blue(0) + 50, 2713 - android.text.TextUtils.getCapsMode("", 0, 0), (char) android.text.TextUtils.getOffsetBefore("", 0));
                                            byte b11 = $$a[14];
                                            java.lang.Object[] objArr47 = new java.lang.Object[1];
                                            b((short) (b11 + 1), r2[16], (byte) (-b11), objArr47);
                                            obj12 = cls11.getMethod((java.lang.String) objArr47[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj12);
                                        }
                                        ((int[]) objArr45[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj12).invoke(null, objArr46)).intValue();
                                        return objArr45;
                                    }
                                    java.lang.Object[] objArr48 = new java.lang.Object[1];
                                    a(286 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.view.KeyEvent.keyCodeFromString(""), android.graphics.Color.alpha(0) + 17, objArr48);
                                    java.lang.String intern13 = ((java.lang.String) objArr48[0]).intern();
                                    java.lang.Object[] objArr49 = new java.lang.Object[1];
                                    a(android.view.KeyEvent.getDeadChar(0, 0) + 304, (char) android.view.KeyEvent.getDeadChar(0, 0), android.graphics.Color.rgb(0, 0, 0) + 16777222, objArr49);
                                    java.lang.Object[] objArr50 = {intern13, ((java.lang.String) objArr49[0]).intern()};
                                    java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1881343749);
                                    if (obj13 == null) {
                                        java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 39, 2213 - android.view.View.MeasureSpec.getMode(0), (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16));
                                        byte b12 = (byte) ($$a[14] + 1);
                                        java.lang.Object[] objArr51 = new java.lang.Object[1];
                                        b((short) 653, b12, b12, objArr51);
                                        obj13 = cls12.getMethod((java.lang.String) objArr51[0], java.lang.String.class, java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1881343749, obj13);
                                    }
                                    long longValue5 = ((java.lang.Long) ((java.lang.reflect.Method) obj13).invoke(null, objArr50)).longValue();
                                    long j19 = ~longValue5;
                                    long j20 = ~(longValue5 | j);
                                    long j21 = ((((((-195) * longValue5) + 128885753844L) + (((~(j19 | (-329631084))) | j20) * (-196))) + ((longValue5 | (-329631084)) * 392)) + (((~(329631083 | j19)) | j20) * 196)) - 405743518;
                                    if (((((int) (j21 >> 32)) & ((((570426626 | r4) * (-712)) - 1444230918) + (((~((-570426627) | i31)) | (~((-1142952550) | i))) * (-712)) + (((~((-1713379176) | i31)) | 1144361709) * 712))) | (((int) j21) & ((((1743354386 | i31) * (-757)) - 2049905808) + ((~((-262210) | i)) * 1514) + (((~((-1114386500) | i31)) | 1114124290 | (~(1743616595 | i))) * 757)))) != 0) {
                                        valueOf = (AlternateContactlessPaymentDataJson + 101) % 128;
                                        i9 = i ^ 251;
                                    } else {
                                        i9 = i;
                                    }
                                    if (i9 != i) {
                                        java.lang.Object[] objArr52 = {new int[]{i}, new int[]{i9}, null, null, new int[1]};
                                        java.lang.Object[] objArr53 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((((~r1) | 5144722) * (-828)) - 655634803) + ((2045701375 | i31) * (-828))) - 1623624704)};
                                        java.lang.Object obj14 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj14 == null) {
                                            java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetBefore("", 0) + 50, 2713 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) android.text.TextUtils.indexOf("", "", 0, 0));
                                            byte b13 = $$a[14];
                                            java.lang.Object[] objArr54 = new java.lang.Object[1];
                                            b((short) (b13 + 1), r2[16], (byte) (-b13), objArr54);
                                            obj14 = cls13.getMethod((java.lang.String) objArr54[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj14);
                                        }
                                        ((int[]) objArr52[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj14).invoke(null, objArr53)).intValue();
                                        return objArr52;
                                    }
                                    java.lang.Object[] objArr55 = new java.lang.Object[1];
                                    a(android.view.View.resolveSizeAndState(0, 0, 0) + 310, (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + androidx.media3.muxer.WebmConstants.MkvEbmlElement.DISPLAY_HEIGHT), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 23, objArr55);
                                    java.lang.Object[] objArr56 = {((java.lang.String) objArr55[0]).intern()};
                                    java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                    if (obj15 == null) {
                                        java.lang.Class cls14 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 40, 1920 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                                        byte b14 = (byte) ($$a[14] + 1);
                                        java.lang.Object[] objArr57 = new java.lang.Object[1];
                                        b((short) 653, b14, b14, objArr57);
                                        obj15 = cls14.getMethod((java.lang.String) objArr57[0], java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj15);
                                    }
                                    java.lang.String lowerCase = ((java.lang.String) ((java.lang.reflect.Method) obj15).invoke(null, objArr56)).toLowerCase();
                                    java.lang.Object[] objArr58 = new java.lang.Object[1];
                                    a(333 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (char) android.text.TextUtils.indexOf("", "", 0, 0), (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 3, objArr58);
                                    int i37 = lowerCase.contains(((java.lang.String) objArr58[0]).intern()) ? i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE : i;
                                    if (i37 != i) {
                                        java.lang.Object[] objArr59 = {new int[]{i}, new int[]{i37}, null, null, new int[1]};
                                        java.lang.Object[] objArr60 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-1497743151) | i31)) | 1493176588 | (~(553102947 | i31))) * 464) + 1824456097 + (((-4566563) | i) * (-464)) + (((~(i | 553102947)) | 1493176588) * 464))};
                                        java.lang.Object obj16 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj16 == null) {
                                            java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.widget.ExpandableListView.getPackedPositionGroup(0L), 2713 - android.graphics.Color.green(0), (char) ((-16777216) - android.graphics.Color.rgb(0, 0, 0)));
                                            byte b15 = $$a[14];
                                            java.lang.Object[] objArr61 = new java.lang.Object[1];
                                            b((short) (b15 + 1), r4[16], (byte) (-b15), objArr61);
                                            obj16 = cls15.getMethod((java.lang.String) objArr61[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj16);
                                        }
                                        ((int[]) objArr59[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj16).invoke(null, objArr60)).intValue();
                                        return objArr59;
                                    }
                                    java.lang.Object[] objArr62 = new java.lang.Object[1];
                                    a((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE, (char) android.view.KeyEvent.getDeadChar(0, 0), android.view.View.resolveSizeAndState(0, 0, 0) + 17, objArr62);
                                    java.lang.String intern14 = ((java.lang.String) objArr62[0]).intern();
                                    java.lang.Object[] objArr63 = new java.lang.Object[1];
                                    a(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 338, (char) android.view.View.resolveSize(0, 0), 6 - android.view.View.resolveSizeAndState(0, 0, 0), objArr63);
                                    java.lang.String intern15 = ((java.lang.String) objArr63[0]).intern();
                                    java.io.File file2 = new java.io.File(intern14);
                                    if (file2.exists()) {
                                        int i38 = valueOf + 73;
                                        AlternateContactlessPaymentDataJson = i38 % 128;
                                        if (i38 % 2 == 0) {
                                            file2.isFile();
                                            throw null;
                                        }
                                        if (file2.isFile()) {
                                            try {
                                                java.util.Scanner scanner2 = new java.util.Scanner(new java.io.FileInputStream(file2));
                                                java.lang.Object[] objArr64 = new java.lang.Object[1];
                                                a(android.view.MotionEvent.axisFromString("") + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, (char) android.graphics.Color.red(0), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1, objArr64);
                                                java.util.Scanner useDelimiter2 = scanner2.useDelimiter(((java.lang.String) objArr64[0]).intern());
                                                next = useDelimiter2.hasNext() ? useDelimiter2.next() : "";
                                                useDelimiter2.close();
                                            } catch (java.io.IOException unused2) {
                                            }
                                            if (next.contains(intern15)) {
                                                AlternateContactlessPaymentDataJson = (valueOf + 71) % 128;
                                                i10 = i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE;
                                                if (i10 == i) {
                                                    java.lang.Object[] objArr65 = {new int[]{i}, new int[]{i10}, null, null, new int[1]};
                                                    int i39 = ~(i | (-1101619202));
                                                    java.lang.Object[] objArr66 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((538182032 | i39) * (-476)) + 142726005 + (i39 * 952) + ((~((-1101619202) | i31)) * 476))};
                                                    java.lang.Object obj17 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                    if (obj17 == null) {
                                                        java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 51, 2713 - android.view.KeyEvent.keyCodeFromString(""), (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                                                        byte b16 = $$a[14];
                                                        java.lang.Object[] objArr67 = new java.lang.Object[1];
                                                        b((short) (b16 + 1), r2[16], (byte) (-b16), objArr67);
                                                        obj17 = cls16.getMethod((java.lang.String) objArr67[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj17);
                                                    }
                                                    ((int[]) objArr65[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj17).invoke(null, objArr66)).intValue();
                                                    return objArr65;
                                                }
                                                java.lang.Object obj18 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1102036426);
                                                if (obj18 == null) {
                                                    java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 2762 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1));
                                                    byte b17 = (byte) ($$a[14] + 1);
                                                    java.lang.Object[] objArr68 = new java.lang.Object[1];
                                                    b((short) 653, b17, b17, objArr68);
                                                    obj18 = cls17.getMethod((java.lang.String) objArr68[0], null);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1102036426, obj18);
                                                }
                                                long longValue6 = ((java.lang.Long) ((java.lang.reflect.Method) obj18).invoke(null, null)).longValue();
                                                long j22 = ~longValue6;
                                                long j23 = ~(j | (-1564670995));
                                                java.lang.String str8 = "";
                                                long j24 = (521 * longValue6) + 812064246405L + (((~(j22 | 1564670994 | j14)) | (~(longValue6 | j))) * 520) + (((~(j22 | j14)) | j23) * (-1040)) + (((~((-1564670995) | j22)) | (~(1564670994 | j14)) | j23) * 520) + 1689707758;
                                                if (((((int) (j24 >> 32)) & ((((~((-135266597) | i31)) * 130) - 1668974494) + (((~((-135266597) | i)) | 1078002816) * 130))) | (((int) j24) & ((((((~((-700121105) | i31)) | 690028560) | r4) * (-713)) - 1251697480) + ((~(2147440058 | i)) * 1426) + ((~(2137347514 | i31)) * 713)))) == 1) {
                                                    java.lang.Object[] objArr69 = {new int[]{i}, new int[]{i}, null, null, new int[1]};
                                                    java.lang.Object[] objArr70 = {java.lang.Integer.valueOf(i3), num, java.lang.Integer.valueOf(((r1 * 495) - 1174305486) + (((~(639840475 | i31)) | 67252370) * 495))};
                                                    java.lang.Object obj19 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                    if (obj19 == null) {
                                                        java.lang.Class cls18 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myTid() >> 22) + 50, (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 2713, (char) android.graphics.Color.argb(0, 0, 0, 0));
                                                        byte b18 = $$a[14];
                                                        java.lang.Object[] objArr71 = new java.lang.Object[1];
                                                        b((short) (b18 + 1), r5[16], (byte) (-b18), objArr71);
                                                        obj19 = cls18.getMethod((java.lang.String) objArr71[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj19);
                                                    }
                                                    ((int[]) objArr69[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj19).invoke(null, objArr70)).intValue();
                                                    return objArr69;
                                                }
                                                java.lang.Object[] objArr72 = {1};
                                                java.lang.Object obj20 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(104106647);
                                                if (obj20 == null) {
                                                    java.lang.Class cls19 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - android.graphics.ImageFormat.getBitsPerPixel(0), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2364, (char) android.view.KeyEvent.normalizeMetaState(0));
                                                    byte b19 = (byte) ($$a[14] + 1);
                                                    java.lang.Object[] objArr73 = new java.lang.Object[1];
                                                    b((short) 653, b19, b19, objArr73);
                                                    obj20 = cls19.getMethod((java.lang.String) objArr73[0], java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(104106647, obj20);
                                                }
                                                long longValue7 = ((java.lang.Long) ((java.lang.reflect.Method) obj20).invoke(null, objArr72)).longValue();
                                                long j25 = 1181329108 | j14;
                                                long j26 = (((-494) * longValue7) - 583576579352L) + ((~(1181329108 | longValue7)) * (-495)) + (495 * j25) + (((~((~longValue7) | (-1181329109))) | (~j25)) * 495) + 226581091;
                                                int i40 = ((((int) (j26 >> 32)) & ((((((~((-621098831) | i31)) | 537204300) * 446) + 384374654) + (((~((-83894531) | i)) | 278923280) * 446)) - 925050776)) | (((int) j26) & ((((((~((-1117962241) | i)) | (~(1739778645 | i31))) * (-318)) + 274382191) + (((~(1135796225 | i)) | 603982420) * (-318))) + (((~((-1135796226) | i)) | (-1721944661)) * 318)))) != 0 ? i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE : i;
                                                if (i40 != i) {
                                                    java.lang.Object[] objArr74 = {new int[]{i}, new int[]{i40}, null, null, new int[1]};
                                                    java.lang.Object[] objArr75 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-71434901) | i)) | (~(i31 | 1979411197))) * (-318)) + 1445822083 + (((~(877806293 | i)) | 1101604904) * (-318)) + (((~(i | (-877806294))) | (-1173039805)) * 318))};
                                                    java.lang.Object obj21 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                    if (obj21 == null) {
                                                        java.lang.Class cls20 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.graphics.Color.argb(0, 0, 0, 0), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2712, (char) android.text.TextUtils.getTrimmedLength(str8));
                                                        byte b20 = $$a[14];
                                                        java.lang.Object[] objArr76 = new java.lang.Object[1];
                                                        b((short) (b20 + 1), r2[16], (byte) (-b20), objArr76);
                                                        obj21 = cls20.getMethod((java.lang.String) objArr76[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj21);
                                                    }
                                                    ((int[]) objArr74[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj21).invoke(null, objArr75)).intValue();
                                                    return objArr74;
                                                }
                                                java.lang.Object[] objArr77 = new java.lang.Object[1];
                                                a((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 309, (char) (android.view.View.MeasureSpec.getMode(0) + 21689), android.os.Process.getGidForName(str8) + 24, objArr77);
                                                java.lang.Object[] objArr78 = {((java.lang.String) objArr77[0]).intern()};
                                                java.lang.Object obj22 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                if (obj22 == null) {
                                                    java.lang.Class cls21 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1921, (char) (1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))));
                                                    byte b21 = (byte) ($$a[14] + 1);
                                                    java.lang.Object[] objArr79 = new java.lang.Object[1];
                                                    b((short) 653, b21, b21, objArr79);
                                                    obj22 = cls21.getMethod((java.lang.String) objArr79[0], java.lang.String.class);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj22);
                                                }
                                                java.lang.Object invoke2 = ((java.lang.reflect.Method) obj22).invoke(null, objArr78);
                                                if (invoke2 != null) {
                                                    java.lang.Object[] objArr80 = {invoke2, 42};
                                                    java.lang.Object obj23 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                                    if (obj23 == null) {
                                                        java.lang.Class cls22 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.blue(0) + 28, 2594 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) android.graphics.Color.alpha(0));
                                                        byte b22 = (byte) ($$a[14] + 1);
                                                        java.lang.Object[] objArr81 = new java.lang.Object[1];
                                                        b((short) 653, b22, b22, objArr81);
                                                        obj23 = cls22.getMethod((java.lang.String) objArr81[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj23);
                                                    }
                                                    long longValue8 = ((java.lang.Long) ((java.lang.reflect.Method) obj23).invoke(null, objArr80)).longValue();
                                                    long j27 = ~longValue8;
                                                    long j28 = j27 | j14;
                                                    long j29 = longValue8 | (-396728683);
                                                    long j30 = ~(j29 | j);
                                                    long j31 = ((longValue8 * 253) - 100372356799L) + (((~j28) | (~(j27 | 396728682)) | j30) * (-252)) + (j29 * (-252)) + ((j30 | (~((-396728683) | j28))) * 252) + 1653829207;
                                                    if (((((int) (j31 >> 32)) & ((((-2075639808) | i) * 988) + 1020237286 + (((~((-319207253) | i31)) | 1108) * (-1976)) + (((~((-1756433664) | i)) | (-2075639808) | (~(1756433663 | i31))) * 988))) | (((int) j31) & ((((((~(892191384 | i31)) | (-897438618)) * 446) - 384374209) + (((~((-5247234) | i)) | 352403592) * 446)) - 825665100))) == 1986687685) {
                                                        str2 = str8;
                                                        j2 = j14;
                                                        i12 = 0;
                                                        java.lang.Object[] objArr82 = new java.lang.Object[1];
                                                        a(446 - (android.widget.ExpandableListView.getPackedPositionForGroup(i12) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(i12) == 0L ? 0 : -1)), (char) (org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF9_MARKER - (android.view.ViewConfiguration.getTouchSlop() >> 8)), 17 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr82);
                                                        java.lang.Object[] objArr83 = {((java.lang.String) objArr82[0]).intern()};
                                                        obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                        if (obj == null) {
                                                            java.lang.Class cls23 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.ImageFormat.getBitsPerPixel(0) + 41, 1921 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) android.view.View.getDefaultSize(0, 0));
                                                            byte b23 = (byte) ($$a[14] + 1);
                                                            java.lang.Object[] objArr84 = new java.lang.Object[1];
                                                            b((short) 653, b23, b23, objArr84);
                                                            obj = cls23.getMethod((java.lang.String) objArr84[0], java.lang.String.class);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj);
                                                        }
                                                        invoke = ((java.lang.reflect.Method) obj).invoke(null, objArr83);
                                                        if (invoke != null) {
                                                            AlternateContactlessPaymentDataJson = (valueOf + 35) % 128;
                                                            i13 = 0;
                                                        } else {
                                                            java.lang.Object[] objArr85 = {invoke, 42};
                                                            java.lang.Object obj24 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                                            if (obj24 == null) {
                                                                java.lang.Class cls24 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str2, str2) + 28, 2594 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1));
                                                                byte b24 = (byte) ($$a[14] + 1);
                                                                java.lang.Object[] objArr86 = new java.lang.Object[1];
                                                                b((short) 653, b24, b24, objArr86);
                                                                obj24 = cls24.getMethod((java.lang.String) objArr86[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj24);
                                                            }
                                                            long longValue9 = ((java.lang.Long) ((java.lang.reflect.Method) obj24).invoke(null, objArr85)).longValue();
                                                            long j32 = ~longValue9;
                                                            long j33 = ~(j2 | longValue9);
                                                            long j34 = ((517 * longValue9) - 513142210630L) + (((~(j32 | j)) | (~(j2 | 996392642)) | j33) * (-516)) + (((~((-996392643) | j32 | j)) | (~(j2 | (-996392643) | longValue9))) * 516) + (((~(longValue9 | (-996392643))) | j33) * 516) + 260707882;
                                                            i13 = (((int) (j34 >> 32)) & (((704782628 | i) * 988) + 86211894 + (((~(2144483175 | i31)) | (-2146957312)) * (-1976)) + (((~(707256764 | i)) | 704782628 | (~((-707256765) | i31))) * 988))) | (((int) j34) & ((((~((-805454471) | i)) | (~(2052286415 | i))) * 69) + 1646349944 + (((~((-1918059471) | i)) | 1112605000 | (~(939681415 | i))) * (-69)) + 671724613));
                                                        }
                                                        if (i13 != 1986687685) {
                                                            int i41 = AlternateContactlessPaymentDataJson;
                                                            int i42 = i41 + 53;
                                                            valueOf = i42 % 128;
                                                            if (i42 % 2 != 0) {
                                                                throw new java.lang.ArithmeticException();
                                                            }
                                                            if (i13 != -1514516938) {
                                                                valueOf = (i41 + 61) % 128;
                                                                java.lang.Object[] objArr87 = new java.lang.Object[1];
                                                                a(1161 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) (((android.os.Process.getThreadPriority(0) + 20) >> 6) + 35449), 14 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr87);
                                                                java.lang.String intern16 = ((java.lang.String) objArr87[0]).intern();
                                                                java.lang.Object[] objArr88 = new java.lang.Object[1];
                                                                a(android.graphics.Color.rgb(0, 0, 0) + 16778391, (char) (android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1), 26 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr88);
                                                                java.lang.String intern17 = ((java.lang.String) objArr88[0]).intern();
                                                                java.lang.Object[] objArr89 = new java.lang.Object[1];
                                                                a(1202 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) ((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 312), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 17, objArr89);
                                                                java.lang.String intern18 = ((java.lang.String) objArr89[0]).intern();
                                                                java.lang.Object[] objArr90 = new java.lang.Object[1];
                                                                a(1217 - android.view.MotionEvent.axisFromString(str2), (char) (53282 - android.view.View.resolveSize(0, 0)), 17 - android.view.View.getDefaultSize(0, 0), objArr90);
                                                                java.lang.String intern19 = ((java.lang.String) objArr90[0]).intern();
                                                                java.lang.Object[] objArr91 = new java.lang.Object[1];
                                                                a(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1187, (char) android.view.KeyEvent.keyCodeFromString(str2), 14 - android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr91);
                                                                java.lang.String intern20 = ((java.lang.String) objArr91[0]).intern();
                                                                java.lang.Object[] objArr92 = new java.lang.Object[1];
                                                                a(1250 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (24519 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16)), android.text.TextUtils.indexOf(str2, str2, 0, 0) + 37, objArr92);
                                                                java.lang.String intern21 = ((java.lang.String) objArr92[0]).intern();
                                                                java.lang.Object[] objArr93 = new java.lang.Object[1];
                                                                a((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1286, (char) (13102 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 12 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr93);
                                                                java.lang.String intern22 = ((java.lang.String) objArr93[0]).intern();
                                                                java.lang.Object[] objArr94 = new java.lang.Object[1];
                                                                a(android.view.View.resolveSizeAndState(0, 0, 0) + 1299, (char) (55114 - android.view.View.resolveSizeAndState(0, 0, 0)), 13 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr94);
                                                                java.lang.String intern23 = ((java.lang.String) objArr94[0]).intern();
                                                                java.lang.Object[] objArr95 = new java.lang.Object[1];
                                                                a(1312 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) android.widget.ExpandableListView.getPackedPositionType(0L), 21 - android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr95);
                                                                java.lang.String intern24 = ((java.lang.String) objArr95[0]).intern();
                                                                java.lang.Object[] objArr96 = new java.lang.Object[1];
                                                                a(1335 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (4892 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 30, objArr96);
                                                                java.lang.String intern25 = ((java.lang.String) objArr96[0]).intern();
                                                                java.lang.Object[] objArr97 = new java.lang.Object[1];
                                                                a(1365 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) android.view.View.getDefaultSize(0, 0), 11 - android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr97);
                                                                java.lang.String intern26 = ((java.lang.String) objArr97[0]).intern();
                                                                java.lang.Object[] objArr98 = new java.lang.Object[1];
                                                                a(1377 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (12117 - ((android.os.Process.getThreadPriority(0) + 20) >> 6)), android.text.TextUtils.getTrimmedLength(str2) + 12, objArr98);
                                                                java.lang.String intern27 = ((java.lang.String) objArr98[0]).intern();
                                                                java.lang.Object[] objArr99 = new java.lang.Object[1];
                                                                a(android.text.TextUtils.getTrimmedLength(str2) + 1389, (char) (android.text.TextUtils.indexOf(str2, str2) + 34484), 12 - android.text.TextUtils.getCapsMode(str2, 0, 0), objArr99);
                                                                java.lang.String intern28 = ((java.lang.String) objArr99[0]).intern();
                                                                java.lang.Object[] objArr100 = new java.lang.Object[1];
                                                                a(1401 - android.view.View.combineMeasuredStates(0, 0), (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 51074), '<' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr100);
                                                                java.lang.String intern29 = ((java.lang.String) objArr100[0]).intern();
                                                                java.lang.Object[] objArr101 = new java.lang.Object[1];
                                                                a(1413 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) (627 - (android.os.Process.myPid() >> 22)), android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 13, objArr101);
                                                                java.lang.String intern30 = ((java.lang.String) objArr101[0]).intern();
                                                                java.lang.Object[] objArr102 = new java.lang.Object[1];
                                                                a(1425 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 13, objArr102);
                                                                java.lang.String intern31 = ((java.lang.String) objArr102[0]).intern();
                                                                java.lang.Object[] objArr103 = new java.lang.Object[1];
                                                                a(1439 - android.graphics.Color.argb(0, 0, 0, 0), (char) (42288 - (android.view.ViewConfiguration.getEdgeSlop() >> 16)), android.text.TextUtils.getOffsetBefore(str2, 0) + 12, objArr103);
                                                                java.lang.String intern32 = ((java.lang.String) objArr103[0]).intern();
                                                                java.lang.Object[] objArr104 = new java.lang.Object[1];
                                                                a(1451 - (android.os.Process.myPid() >> 22), (char) ((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 60591), 24 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr104);
                                                                java.lang.String intern33 = ((java.lang.String) objArr104[0]).intern();
                                                                java.lang.Object[] objArr105 = new java.lang.Object[1];
                                                                a((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 1475, (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 29 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr105);
                                                                java.lang.String[] strArr8 = {intern16, intern17, intern18, intern19, intern20, intern21, intern22, intern23, intern24, intern25, intern26, intern27, intern28, intern29, intern30, intern31, intern32, intern33, ((java.lang.String) objArr105[0]).intern()};
                                                                int i43 = 0;
                                                                while (i43 < 19) {
                                                                    int i44 = AlternateContactlessPaymentDataJson + 35;
                                                                    valueOf = i44 % 128;
                                                                    if (i44 % 2 != 0) {
                                                                        java.lang.String str9 = strArr8[i43];
                                                                        java.lang.Object[] objArr106 = {str9};
                                                                        java.lang.Object obj25 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                                                        if (obj25 == null) {
                                                                            java.lang.Class cls25 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 37, 3161 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) (33099 - android.text.TextUtils.getOffsetAfter(str2, 0)));
                                                                            byte b25 = (byte) (-$$a[14]);
                                                                            java.lang.Object[] objArr107 = new java.lang.Object[1];
                                                                            b((short) 41, b25, (byte) (b25 - 1), objArr107);
                                                                            obj25 = cls25.getMethod((java.lang.String) objArr107[0], java.lang.String.class);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj25);
                                                                        }
                                                                        long longValue10 = ((java.lang.Long) ((java.lang.reflect.Method) obj25).invoke(null, objArr106)).longValue();
                                                                        long j35 = ~(132749225 | longValue10);
                                                                        long j36 = ~longValue10;
                                                                        i19 = i43;
                                                                        long j37 = (989 * longValue10) + 262179721350L + ((j | j35) * 988) + (((~(j36 | (-132749226))) | (~(j2 | (-132749226)))) * (-1976)) + (((~(j36 | j)) | j35 | (~(longValue10 | j2))) * 988) + 1128184129;
                                                                        if (((((int) j37) & (((~((-1708139973) | i)) * (-301)) + 1868041416 + (((~((-271437883) | i)) | (~((-1708664293) | i31))) * (-301)) + (((~(1708664292 | i)) | (-271437883)) * 301))) | (((int) (j37 >> 22)) & ((((~(1131149341 | i31)) * (-560)) - 1041745238) + ((~((-269747585) | i)) * (-560)) + (((~(306077069 | i31)) | 1094819856) * 560)))) != 0) {
                                                                            i17 = i19;
                                                                            break;
                                                                        }
                                                                        str5 = str9;
                                                                        objArr3 = new java.lang.Object[1];
                                                                        a(android.graphics.Color.alpha(0) + 1425, (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 14 - android.text.TextUtils.getTrimmedLength(str2), objArr3);
                                                                        if (!str5.equals(((java.lang.String) objArr3[0]).intern())) {
                                                                            java.lang.Object[] objArr108 = {str5};
                                                                            java.lang.Object obj26 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                                                            if (obj26 == null) {
                                                                                java.lang.Class cls26 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '\f', (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 3161, (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 33098));
                                                                                byte b26 = (byte) (-$$a[14]);
                                                                                java.lang.Object[] objArr109 = new java.lang.Object[1];
                                                                                b((short) 41, b26, (byte) (b26 - 1), objArr109);
                                                                                obj26 = cls26.getMethod((java.lang.String) objArr109[0], java.lang.String.class);
                                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj26);
                                                                            }
                                                                            long longValue11 = ((java.lang.Long) ((java.lang.reflect.Method) obj26).invoke(null, objArr108)).longValue();
                                                                            long j38 = ~longValue11;
                                                                            long j39 = (-75267813) | j38;
                                                                            long j40 = (((-496) * longValue11) - 37332834752L) + ((~j39) * 497) + (((~(j39 | j)) | (~(j38 | j2 | 75267812))) * 497) + (((~(longValue11 | (-75267813))) | (~(j2 | (-75267813))) | (~(j38 | 75267812 | j))) * 497) + 920167091;
                                                                            int i45 = ~((-1381176937) | i31);
                                                                            if (((((int) (j40 >> 32)) & (((((1853546459 | i) * (-381)) - 1231576170) + (((~(1678942083 | i31)) | 1786435163) * 381)) - 1826564716)) | (((int) j40) & ((((~((-56049474) | i31)) | 17049857) * (-1188)) + 644692219 + (((~(56049473 | i)) | 17049857 | i45) * 594) + ((i45 | (~(56049473 | i31)) | 1342177320) * 594)))) != 0) {
                                                                                i17 = i19;
                                                                                break;
                                                                            }
                                                                        }
                                                                        i43 = i19 + 1;
                                                                    } else {
                                                                        i19 = i43;
                                                                        str5 = strArr8[i19];
                                                                        java.lang.Object[] objArr110 = {str5};
                                                                        java.lang.Object obj27 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                                                        if (obj27 == null) {
                                                                            java.lang.Class cls27 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.view.View.MeasureSpec.getSize(0), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 3161, (char) (android.widget.ExpandableListView.getPackedPositionGroup(0L) + 33099));
                                                                            byte b27 = (byte) (-$$a[14]);
                                                                            java.lang.Object[] objArr111 = new java.lang.Object[1];
                                                                            b((short) 41, b27, (byte) (b27 - 1), objArr111);
                                                                            obj27 = cls27.getMethod((java.lang.String) objArr111[0], java.lang.String.class);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj27);
                                                                        }
                                                                        long longValue12 = ((java.lang.Long) ((java.lang.reflect.Method) obj27).invoke(null, objArr110)).longValue();
                                                                        long j41 = ~(1075051209 | longValue12);
                                                                        long j42 = (((-69) * longValue12) - 76328635910L) + (((~(longValue12 | j)) | j41) * (-140)) + ((~((-1075051210) | longValue12 | j)) * 70) + (((~((~longValue12) | (-1075051210))) | j41 | (~(j | (-1075051210)))) * 70) + 2070486113;
                                                                        if (((((int) (j42 >> 32)) & ((((~(1256284385 | i)) | (-180942026)) * (-668)) + 1763312374 + (((~((-180942026) | i)) | 1256284385) * 1336) + (((-562185) | i) * 668))) | (((int) j42) & ((((~(552753887 | i31)) | (-884472523)) * 226) + 2055568080 + (((~(884472522 | i)) | 4194325 | (~((-335912961) | i31))) * (-113)) + ((~(552753887 | i)) * 113)))) != 0) {
                                                                            i17 = i19;
                                                                            break;
                                                                        }
                                                                        objArr3 = new java.lang.Object[1];
                                                                        a(android.graphics.Color.alpha(0) + 1425, (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 14 - android.text.TextUtils.getTrimmedLength(str2), objArr3);
                                                                        if (!str5.equals(((java.lang.String) objArr3[0]).intern())) {
                                                                        }
                                                                        i43 = i19 + 1;
                                                                    }
                                                                }
                                                                i17 = -1;
                                                                if (i17 >= 0 && (i18 = (i17 + 130) ^ i) != i) {
                                                                    java.lang.Object[] objArr112 = {new int[]{i}, new int[]{i18}, null, null, new int[1]};
                                                                    java.lang.Object[] objArr113 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((~((-1104269632) | i)) | 946576466) * (-366)) - 671520947) + (((~(i | (-1099972910))) | 942279744) * 366))};
                                                                    java.lang.Object obj28 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                    if (obj28 == null) {
                                                                        java.lang.Class cls28 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getTouchSlop() >> 8), android.text.TextUtils.getTrimmedLength(str2) + 2713, (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1));
                                                                        byte b28 = $$a[14];
                                                                        java.lang.Object[] objArr114 = new java.lang.Object[1];
                                                                        b((short) (b28 + 1), r2[16], (byte) (-b28), objArr114);
                                                                        obj28 = cls28.getMethod((java.lang.String) objArr114[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj28);
                                                                    }
                                                                    ((int[]) objArr112[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj28).invoke(null, objArr113)).intValue();
                                                                    return objArr112;
                                                                }
                                                            }
                                                        }
                                                        java.lang.Object[] objArr115 = new java.lang.Object[1];
                                                        a(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1504, (char) android.view.View.getDefaultSize(0, 0), 13 - android.graphics.Color.red(0), objArr115);
                                                        java.lang.String intern34 = ((java.lang.String) objArr115[0]).intern();
                                                        java.lang.Object[] objArr116 = new java.lang.Object[1];
                                                        a(1515 - android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (36752 - android.view.View.MeasureSpec.getMode(0)), 5 - (android.os.Process.myTid() >> 22), objArr116);
                                                        java.lang.String[] strArr9 = {intern34, ((java.lang.String) objArr116[0]).intern()};
                                                        java.lang.Object[] objArr117 = new java.lang.Object[1];
                                                        a((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 1521, (char) android.view.View.MeasureSpec.getSize(0), 15 - android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr117);
                                                        java.lang.String intern35 = ((java.lang.String) objArr117[0]).intern();
                                                        java.lang.Object[] objArr118 = new java.lang.Object[1];
                                                        a(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1488, (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 20, objArr118);
                                                        java.lang.String intern36 = ((java.lang.String) objArr118[0]).intern();
                                                        java.lang.Object[] objArr119 = new java.lang.Object[1];
                                                        a(1554 - android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.graphics.Color.red(0), 14 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr119);
                                                        java.lang.String[] strArr10 = {intern35, intern36, ((java.lang.String) objArr119[0]).intern()};
                                                        java.lang.Object[] objArr120 = new java.lang.Object[1];
                                                        a(1569 - android.text.TextUtils.getOffsetAfter(str2, 0), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 21, objArr120);
                                                        java.lang.String intern37 = ((java.lang.String) objArr120[0]).intern();
                                                        java.lang.Object[] objArr121 = new java.lang.Object[1];
                                                        a((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1589, (char) (android.os.Process.myTid() >> 22), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 9, objArr121);
                                                        java.lang.String[] strArr11 = {intern37, ((java.lang.String) objArr121[0]).intern()};
                                                        java.lang.Object[] objArr122 = new java.lang.Object[1];
                                                        a((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1600, (char) ((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 4203), android.view.View.MeasureSpec.getMode(0) + 11, objArr122);
                                                        java.lang.String intern38 = ((java.lang.String) objArr122[0]).intern();
                                                        java.lang.Object[] objArr123 = new java.lang.Object[1];
                                                        a(336 - android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 6, objArr123);
                                                        java.lang.String[] strArr12 = {intern38, ((java.lang.String) objArr123[0]).intern()};
                                                        java.lang.Object[] objArr124 = new java.lang.Object[1];
                                                        a(android.view.View.MeasureSpec.getMode(0) + 1611, (char) (2661 - android.text.TextUtils.getCapsMode(str2, 0, 0)), 28 - android.view.Gravity.getAbsoluteGravity(0, 0), objArr124);
                                                        java.lang.String intern39 = ((java.lang.String) objArr124[0]).intern();
                                                        java.lang.Object[] objArr125 = new java.lang.Object[1];
                                                        a(1591 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 9, objArr125);
                                                        c = 0;
                                                        strArr2 = new java.lang.String[][]{strArr9, strArr10, strArr11, strArr12, new java.lang.String[]{intern39, ((java.lang.String) objArr125[0]).intern()}};
                                                        int i46 = -1;
                                                        i14 = 0;
                                                        loop4: while (true) {
                                                            if (i14 < 5) {
                                                                i15 = i;
                                                                break;
                                                            }
                                                            java.lang.String[] strArr13 = strArr2[i14];
                                                            java.lang.String str10 = strArr13[c];
                                                            java.lang.String[] strArr14 = (java.lang.String[]) java.util.Arrays.copyOfRange(strArr13, 1, strArr13.length);
                                                            int length = strArr14.length;
                                                            int i47 = 0;
                                                            while (i47 < length) {
                                                                java.lang.Object[] objArr126 = {str10, strArr14[i47]};
                                                                java.lang.Object obj29 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1881343749);
                                                                if (obj29 == null) {
                                                                    java.lang.Class cls29 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 38, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 2213, (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                                                    byte b29 = (byte) ($$a[14] + 1);
                                                                    strArr3 = strArr2;
                                                                    java.lang.Object[] objArr127 = new java.lang.Object[1];
                                                                    b((short) 653, b29, b29, objArr127);
                                                                    obj29 = cls29.getMethod((java.lang.String) objArr127[0], java.lang.String.class, java.lang.String.class);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1881343749, obj29);
                                                                } else {
                                                                    strArr3 = strArr2;
                                                                }
                                                                long longValue13 = ((java.lang.Long) ((java.lang.reflect.Method) obj29).invoke(null, objArr126)).longValue();
                                                                int i48 = i46;
                                                                long j43 = ~((~longValue13) | 1189597851);
                                                                java.lang.String str11 = str10;
                                                                int i49 = length;
                                                                long j44 = ~(j | 1189597851);
                                                                long j45 = ((((((-657) * longValue13) + 783944983809L) + ((((~(longValue13 | (-1189597852))) | j43) | j44) * (-658))) + (658 * j43)) + ((j43 | j44) * 658)) - 1924972453;
                                                                if (((((int) j45) & ((((((~(1160046790 | i)) | (-1436937448)) * 1504) + 1320243365) + ((~((-276890658) | i)) * (-1504))) - 1972097872)) | (((int) (j45 >> 32)) & (((((~((-1892487680) | i31)) | (~((-186821633) | i))) * (-831)) - 1793517482) + ((~((-268439637) | i)) * (-1662)) + (((~(455261268 | i31)) | (~((-455261269) | i)) | (~(1892487679 | i))) * 831)))) != 0) {
                                                                    i15 = i ^ (i48 + 171);
                                                                    break loop4;
                                                                }
                                                                i47++;
                                                                i46 = i48 + 1;
                                                                str10 = str11;
                                                                length = i49;
                                                                strArr2 = strArr3;
                                                            }
                                                            i14++;
                                                            strArr2 = strArr2;
                                                            c = 0;
                                                        }
                                                        if (i15 == i) {
                                                            java.lang.Object[] objArr128 = {new int[]{i}, new int[]{i15}, null, null, new int[1]};
                                                            java.lang.Object[] objArr129 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-706342055) | i31)) | 706243588 | (~(1344504043 | i31))) * (-397)) + 897776732 + ((i | 2050649165) * 397))};
                                                            java.lang.Object obj30 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                            if (obj30 == null) {
                                                                java.lang.Class cls30 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 50, 2712 - android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (android.view.ViewConfiguration.getTouchSlop() >> 8));
                                                                byte b30 = $$a[14];
                                                                java.lang.Object[] objArr130 = new java.lang.Object[1];
                                                                b((short) (b30 + 1), r2[16], (byte) (-b30), objArr130);
                                                                obj30 = cls30.getMethod((java.lang.String) objArr130[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj30);
                                                            }
                                                            ((int[]) objArr128[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj30).invoke(null, objArr129)).intValue();
                                                            return objArr128;
                                                        }
                                                        try {
                                                            java.lang.Object[] objArr131 = new java.lang.Object[1];
                                                            a(1639 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 37164), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 13, objArr131);
                                                            intern = ((java.lang.String) objArr131[0]).intern();
                                                            objArr2 = new java.lang.Object[1];
                                                            a(1652 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) android.text.TextUtils.getOffsetBefore(str2, 0), 8 - android.widget.ExpandableListView.getPackedPositionType(0L), objArr2);
                                                        } catch (java.lang.Exception unused3) {
                                                            i16 = i ^ 151;
                                                        }
                                                        try {
                                                            java.lang.Object[] objArr132 = {intern, ((java.lang.String) objArr2[0]).intern()};
                                                            java.lang.Object obj31 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1881343749);
                                                            if (obj31 == null) {
                                                                java.lang.Class cls31 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.combineMeasuredStates(0, 0) + 39, (android.view.ViewConfiguration.getTapTimeout() >> 16) + 2213, (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                                                byte b31 = (byte) ($$a[14] + 1);
                                                                java.lang.Object[] objArr133 = new java.lang.Object[1];
                                                                b((short) 653, b31, b31, objArr133);
                                                                obj31 = cls31.getMethod((java.lang.String) objArr133[0], java.lang.String.class, java.lang.String.class);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1881343749, obj31);
                                                            }
                                                            long longValue14 = ((java.lang.Long) ((java.lang.reflect.Method) obj31).invoke(null, objArr132)).longValue();
                                                            long j46 = ~longValue14;
                                                            long j47 = (((((367 * longValue14) - 29633625658L) + (((-80745574) | longValue14) * (-366))) + (((~(j46 | j)) | (-80745574)) * (-366))) + (((~(longValue14 | 80745573)) | (~((j46 | (-80745574)) | j))) * 366)) - 654629028;
                                                            int i50 = (int) (j47 >> 32);
                                                            int i51 = ~((-1295856373) | i31);
                                                            i16 = ((i50 & (((((4194306 | i51) | (~(1295856372 | i))) * (-338)) - 1440065458) + ((i51 | (~(1300050678 | i))) * 338))) | (((int) j47) & ((((((~((-1247990334) | i31)) | (~((-1609750553) | i31))) * (-867)) + (-1972008908)) + ((((~((-1247990334) | i)) | 1247989784) | (~((-1609750553) | i))) * (-1734))) + ((((~((-1247989785) | i31)) | (~(i | (-550)))) | (~((-361760769) | i))) * 867)))) != 0 ? i ^ 150 : i;
                                                            if (i16 != i) {
                                                                java.lang.Object[] objArr134 = {new int[]{i}, new int[]{i16}, null, null, new int[1]};
                                                                java.lang.Object[] objArr135 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-1075841042) | i31)) | (~(2008902865 | i))) * 988) + 2007720301 + (((~(i | (-1117784274))) | 41943232 | (~(2008902865 | i31))) * 988))};
                                                                java.lang.Object obj32 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                if (obj32 == null) {
                                                                    java.lang.Class cls32 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 50, 2713 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (android.graphics.Color.rgb(0, 0, 0) + 16777216));
                                                                    byte b32 = $$a[14];
                                                                    java.lang.Object[] objArr136 = new java.lang.Object[1];
                                                                    b((short) (b32 + 1), r2[16], (byte) (-b32), objArr136);
                                                                    obj32 = cls32.getMethod((java.lang.String) objArr136[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj32);
                                                                }
                                                                ((int[]) objArr134[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj32).invoke(null, objArr135)).intValue();
                                                                return objArr134;
                                                            }
                                                            java.lang.Object[] objArr137 = new java.lang.Object[1];
                                                            a(1660 - android.view.View.getDefaultSize(0, 0), (char) (61758 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16)), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 47, objArr137);
                                                            java.lang.Object[] objArr138 = {((java.lang.String) objArr137[0]).intern()};
                                                            java.lang.Object obj33 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                                            if (obj33 == null) {
                                                                java.lang.Class cls33 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - android.view.MotionEvent.axisFromString(str2), android.widget.ExpandableListView.getPackedPositionType(0L) + 3161, (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 33100));
                                                                byte b33 = (byte) (-$$a[14]);
                                                                java.lang.Object[] objArr139 = new java.lang.Object[1];
                                                                b((short) 41, b33, (byte) (b33 - 1), objArr139);
                                                                obj33 = cls33.getMethod((java.lang.String) objArr139[0], java.lang.String.class);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj33);
                                                            }
                                                            long longValue15 = ((java.lang.Long) ((java.lang.reflect.Method) obj33).invoke(null, objArr138)).longValue();
                                                            long j48 = j2 | (-671638077);
                                                            long j49 = (370 * longValue15) + 248506088120L + ((671638076 | longValue15 | j2) * (-369)) + (((~j48) | longValue15) * (-369)) + (((~((~longValue15) | 671638076)) | (~(j | 671638076)) | (~(j48 | longValue15))) * 369) + 323796827;
                                                            int i52 = (((((int) (j49 >> 32)) & ((((((~((-1715628209) | i)) | (~(2010841013 | i31))) * 920) + 2038856378) + (((~((-1732439217) | i31)) | 1715628208) * 920)) + ((((~((-1715628209) | i31)) | (~((-16811009) | i))) | (~(2010841013 | i))) * 920))) | (((int) j49) & ((((((~((-715174537) | i)) | (~((-84164614) | i31))) * 920) - 2038855459) + (((~((-2058401737) | i31)) | 715174536) * 920)) + ((((~((-715174537) | i31)) | (~((-1343227201) | i))) | (~((-84164614) | i))) * 920)))) * 263) ^ i;
                                                            if (i52 != i) {
                                                                java.lang.Object[] objArr140 = {new int[]{i}, new int[]{i52}, null, null, new int[1]};
                                                                java.lang.Object[] objArr141 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((((-37847081) | i31) * (-490)) + 362484775) + (((~(i | (-2004470058))) | 1966622977) * 490)) - 1249423610)};
                                                                java.lang.Object obj34 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                if (obj34 == null) {
                                                                    java.lang.Class cls34 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.getCapsMode(str2, 0, 0), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2712, (char) android.text.TextUtils.getCapsMode(str2, 0, 0));
                                                                    byte b34 = $$a[14];
                                                                    java.lang.Object[] objArr142 = new java.lang.Object[1];
                                                                    b((short) (b34 + 1), r2[16], (byte) (-b34), objArr142);
                                                                    obj34 = cls34.getMethod((java.lang.String) objArr142[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj34);
                                                                }
                                                                ((int[]) objArr140[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj34).invoke(null, objArr141)).intValue();
                                                                return objArr140;
                                                            }
                                                            java.lang.Object[] objArr143 = {new int[]{i}, new int[]{i}, null, null, new int[1]};
                                                            int i53 = ~(237850559 | i);
                                                            java.lang.Object[] objArr144 = {java.lang.Integer.valueOf(i3), num, java.lang.Integer.valueOf((((~(i | 1812995538)) | (~((-201330067) | i31))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL) + 787481641 + (((~((-1812995539) | i31)) | i53) * (-1040)) + ((i53 | (~((-237850560) | i31)) | 1611665472) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL))};
                                                            java.lang.Object obj35 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                            if (obj35 == null) {
                                                                java.lang.Class cls35 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTouchSlop() >> 8) + 50, 2713 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) android.text.TextUtils.getTrimmedLength(str2));
                                                                byte b35 = $$a[14];
                                                                java.lang.Object[] objArr145 = new java.lang.Object[1];
                                                                b((short) (b35 + 1), r2[16], (byte) (-b35), objArr145);
                                                                obj35 = cls35.getMethod((java.lang.String) objArr145[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj35);
                                                            }
                                                            ((int[]) objArr143[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj35).invoke(null, objArr144)).intValue();
                                                            return objArr143;
                                                        } catch (java.lang.Throwable th2) {
                                                            java.lang.Throwable cause2 = th2.getCause();
                                                            if (cause2 != null) {
                                                                throw cause2;
                                                            }
                                                            throw th2;
                                                        }
                                                    }
                                                }
                                                java.lang.Object[] objArr146 = new java.lang.Object[1];
                                                a(309 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) (21689 - (android.os.Process.myTid() >> 22)), android.view.Gravity.getAbsoluteGravity(0, 0) + 23, objArr146);
                                                java.lang.String intern40 = ((java.lang.String) objArr146[0]).intern();
                                                java.lang.Object[] objArr147 = new java.lang.Object[1];
                                                a(365 - android.graphics.Color.blue(0), (char) android.text.TextUtils.getTrimmedLength(str8), android.graphics.Color.blue(0) + 10, objArr147);
                                                java.lang.String intern41 = ((java.lang.String) objArr147[0]).intern();
                                                java.lang.Object[] objArr148 = new java.lang.Object[1];
                                                a(376 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) android.graphics.Color.blue(0), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 7, objArr148);
                                                java.lang.String intern42 = ((java.lang.String) objArr148[0]).intern();
                                                java.lang.Object[] objArr149 = new java.lang.Object[1];
                                                a(android.view.Gravity.getAbsoluteGravity(0, 0) + 382, (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 8 - android.graphics.Color.alpha(0), objArr149);
                                                java.lang.String[] strArr15 = {intern40, intern41, intern42, ((java.lang.String) objArr149[0]).intern()};
                                                java.lang.Object[] objArr150 = new java.lang.Object[1];
                                                a(391 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (4503 - (android.view.ViewConfiguration.getTapTimeout() >> 16)), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 17, objArr150);
                                                java.lang.String intern43 = ((java.lang.String) objArr150[0]).intern();
                                                java.lang.Object[] objArr151 = new java.lang.Object[1];
                                                a(407 - android.graphics.Color.green(0), (char) android.view.KeyEvent.getDeadChar(0, 0), 6 - android.widget.ExpandableListView.getPackedPositionChild(0L), objArr151);
                                                java.lang.String intern44 = ((java.lang.String) objArr151[0]).intern();
                                                java.lang.Object[] objArr152 = new java.lang.Object[1];
                                                a(414 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 7 - android.view.View.MeasureSpec.getMode(0), objArr152);
                                                java.lang.String intern45 = ((java.lang.String) objArr152[0]).intern();
                                                java.lang.Object[] objArr153 = new java.lang.Object[1];
                                                a(android.graphics.ImageFormat.getBitsPerPixel(0) + 422, (char) android.graphics.Color.argb(0, 0, 0, 0), 10 - android.text.TextUtils.lastIndexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr153);
                                                java.lang.String intern46 = ((java.lang.String) objArr153[0]).intern();
                                                java.lang.Object[] objArr154 = new java.lang.Object[1];
                                                a(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 384, (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 13 - android.view.MotionEvent.axisFromString(str8), objArr154);
                                                java.lang.String[] strArr16 = {intern43, intern44, intern45, intern46, ((java.lang.String) objArr154[0]).intern()};
                                                java.lang.Object[] objArr155 = new java.lang.Object[1];
                                                a((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 445, (char) (org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF8_MARKER - android.text.TextUtils.lastIndexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), 17 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr155);
                                                java.lang.String intern47 = ((java.lang.String) objArr155[0]).intern();
                                                java.lang.Object[] objArr156 = new java.lang.Object[1];
                                                a(463 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (15678 - android.text.TextUtils.indexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), 3 - android.text.TextUtils.getCapsMode(str8, 0, 0), objArr156);
                                                java.lang.String intern48 = ((java.lang.String) objArr156[0]).intern();
                                                java.lang.Object[] objArr157 = new java.lang.Object[1];
                                                a((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 472, (char) (60456 - android.graphics.Color.argb(0, 0, 0, 0)), 22 - android.text.TextUtils.getTrimmedLength(str8), objArr157);
                                                java.lang.String intern49 = ((java.lang.String) objArr157[0]).intern();
                                                java.lang.Object[] objArr158 = new java.lang.Object[1];
                                                a(495 - android.graphics.Color.red(0), (char) (64433 - android.view.View.resolveSizeAndState(0, 0, 0)), 25 - (android.os.Process.myTid() >> 22), objArr158);
                                                java.lang.String intern50 = ((java.lang.String) objArr158[0]).intern();
                                                java.lang.Object[] objArr159 = new java.lang.Object[1];
                                                a(520 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) (android.widget.ExpandableListView.getPackedPositionType(0L) + 20575), 28 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr159);
                                                j2 = j14;
                                                java.lang.String[] strArr17 = {intern47, intern48, str, intern49, intern50, ((java.lang.String) objArr159[0]).intern()};
                                                java.lang.Object[] objArr160 = new java.lang.Object[1];
                                                a(547 - android.text.TextUtils.lastIndexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (14027 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), android.text.TextUtils.indexOf(str8, str8, 0, 0) + 11, objArr160);
                                                java.lang.String intern51 = ((java.lang.String) objArr160[0]).intern();
                                                java.lang.Object[] objArr161 = new java.lang.Object[1];
                                                a((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 559, (char) (31784 - (android.os.Process.myTid() >> 22)), 8 - android.view.KeyEvent.keyCodeFromString(str8), objArr161);
                                                java.lang.String intern52 = ((java.lang.String) objArr161[0]).intern();
                                                java.lang.Object[] objArr162 = new java.lang.Object[1];
                                                a(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 568, (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 22206), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 6, objArr162);
                                                java.lang.String intern53 = ((java.lang.String) objArr162[0]).intern();
                                                java.lang.Object[] objArr163 = new java.lang.Object[1];
                                                a((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 573, (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), android.text.TextUtils.lastIndexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 7, objArr163);
                                                java.lang.String[] strArr18 = {intern51, intern52, intern53, ((java.lang.String) objArr163[0]).intern()};
                                                java.lang.Object[] objArr164 = new java.lang.Object[1];
                                                a((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 579, (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 16, objArr164);
                                                java.lang.String intern54 = ((java.lang.String) objArr164[0]).intern();
                                                java.lang.Object[] objArr165 = new java.lang.Object[1];
                                                a(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 366, (char) (android.view.ViewConfiguration.getTouchSlop() >> 8), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 7, objArr165);
                                                java.lang.String intern55 = ((java.lang.String) objArr165[0]).intern();
                                                java.lang.Object[] objArr166 = new java.lang.Object[1];
                                                a(android.graphics.Color.blue(0) + 382, (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1), 8 - android.view.View.resolveSizeAndState(0, 0, 0), objArr166);
                                                java.lang.String[] strArr19 = {intern54, intern55, ((java.lang.String) objArr166[0]).intern()};
                                                java.lang.Object[] objArr167 = new java.lang.Object[1];
                                                a(595 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 14 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr167);
                                                java.lang.String intern56 = ((java.lang.String) objArr167[0]).intern();
                                                java.lang.Object[] objArr168 = new java.lang.Object[1];
                                                a(609 - android.view.View.resolveSize(0, 0), (char) (37561 - android.text.TextUtils.getOffsetAfter(str8, 0)), 1 - android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr168);
                                                java.lang.String[] strArr20 = {intern56, ((java.lang.String) objArr168[0]).intern()};
                                                java.lang.Object[] objArr169 = new java.lang.Object[1];
                                                a(610 - android.graphics.Color.alpha(0), (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (android.os.Process.myPid() >> 22) + 9, objArr169);
                                                java.lang.String intern57 = ((java.lang.String) objArr169[0]).intern();
                                                java.lang.Object[] objArr170 = new java.lang.Object[1];
                                                a((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 619, (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), -android.os.Process.getGidForName(str8), objArr170);
                                                java.lang.String[] strArr21 = {intern57, ((java.lang.String) objArr170[0]).intern()};
                                                java.lang.Object[] objArr171 = new java.lang.Object[1];
                                                a(620 - android.view.View.resolveSize(0, 0), (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0), 16 - android.graphics.Color.argb(0, 0, 0, 0), objArr171);
                                                java.lang.String intern58 = ((java.lang.String) objArr171[0]).intern();
                                                java.lang.Object[] objArr172 = new java.lang.Object[1];
                                                a(462 - android.view.KeyEvent.normalizeMetaState(0), (char) ((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 15679), 3 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr172);
                                                java.lang.String intern59 = ((java.lang.String) objArr172[0]).intern();
                                                java.lang.Object[] objArr173 = new java.lang.Object[1];
                                                a(408 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) ((-16777216) - android.graphics.Color.rgb(0, 0, 0)), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 7, objArr173);
                                                java.lang.String intern60 = ((java.lang.String) objArr173[0]).intern();
                                                java.lang.Object[] objArr174 = new java.lang.Object[1];
                                                a(637 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16), 9 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr174);
                                                java.lang.String intern61 = ((java.lang.String) objArr174[0]).intern();
                                                java.lang.Object[] objArr175 = new java.lang.Object[1];
                                                a(android.graphics.Color.red(0) + 421, (char) android.widget.ExpandableListView.getPackedPositionGroup(0L), 11 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr175);
                                                java.lang.String intern62 = ((java.lang.String) objArr175[0]).intern();
                                                java.lang.Object[] objArr176 = new java.lang.Object[1];
                                                a(432 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), android.view.View.MeasureSpec.getMode(0) + 14, objArr176);
                                                java.lang.String[] strArr22 = {intern58, intern59, intern60, intern61, intern62, ((java.lang.String) objArr176[0]).intern()};
                                                java.lang.Object[] objArr177 = new java.lang.Object[1];
                                                a(android.text.TextUtils.indexOf(str8, str8) + 644, (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 21 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr177);
                                                java.lang.String intern63 = ((java.lang.String) objArr177[0]).intern();
                                                java.lang.Object[] objArr178 = new java.lang.Object[1];
                                                a((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 664, (char) (61351 - android.view.KeyEvent.normalizeMetaState(0)), android.text.TextUtils.indexOf(str8, str8, 0) + 19, objArr178);
                                                java.lang.String intern64 = ((java.lang.String) objArr178[0]).intern();
                                                java.lang.Object[] objArr179 = new java.lang.Object[1];
                                                a((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 682, (char) (android.text.TextUtils.indexOf(str8, str8, 0, 0) + 50742), 31 - android.text.TextUtils.getOffsetAfter(str8, 0), objArr179);
                                                java.lang.String intern65 = ((java.lang.String) objArr179[0]).intern();
                                                java.lang.Object[] objArr180 = new java.lang.Object[1];
                                                a(714 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) ((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 4047), 26 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr180);
                                                java.lang.String intern66 = ((java.lang.String) objArr180[0]).intern();
                                                java.lang.Object[] objArr181 = new java.lang.Object[1];
                                                a(740 - android.text.TextUtils.indexOf(str8, str8, 0), (char) (63925 - android.view.Gravity.getAbsoluteGravity(0, 0)), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 23, objArr181);
                                                java.lang.String intern67 = ((java.lang.String) objArr181[0]).intern();
                                                java.lang.Object[] objArr182 = new java.lang.Object[1];
                                                a((android.view.KeyEvent.getMaxKeyCode() >> 16) + 763, (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 33 - android.graphics.Color.alpha(0), objArr182);
                                                java.lang.String[] strArr23 = {intern63, intern64, intern65, intern66, intern67, ((java.lang.String) objArr182[0]).intern(), str};
                                                java.lang.Object[] objArr183 = new java.lang.Object[1];
                                                a(796 - android.text.TextUtils.getOffsetBefore(str8, 0), (char) android.text.TextUtils.indexOf(str8, str8, 0), 13 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), objArr183);
                                                java.lang.String intern68 = ((java.lang.String) objArr183[0]).intern();
                                                java.lang.Object[] objArr184 = new java.lang.Object[1];
                                                a(375 - android.view.View.MeasureSpec.getSize(0), (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 6 - android.text.TextUtils.indexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr184);
                                                java.lang.String[] strArr24 = {intern68, ((java.lang.String) objArr184[0]).intern()};
                                                java.lang.Object[] objArr185 = new java.lang.Object[1];
                                                a(809 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (android.view.ViewConfiguration.getTouchSlop() >> 8), 30 - android.view.View.resolveSize(0, 0), objArr185);
                                                java.lang.String intern69 = ((java.lang.String) objArr185[0]).intern();
                                                java.lang.Object[] objArr186 = new java.lang.Object[1];
                                                a(839 - android.view.View.getDefaultSize(0, 0), (char) (android.text.TextUtils.lastIndexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1), 11 - android.text.TextUtils.getTrimmedLength(str8), objArr186);
                                                java.lang.String[] strArr25 = {intern69, ((java.lang.String) objArr186[0]).intern()};
                                                java.lang.Object[] objArr187 = new java.lang.Object[1];
                                                a((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 850, (char) ((android.os.Process.myTid() >> 22) + 56993), 18 - android.widget.ExpandableListView.getPackedPositionChild(0L), objArr187);
                                                java.lang.String intern70 = ((java.lang.String) objArr187[0]).intern();
                                                java.lang.Object[] objArr188 = new java.lang.Object[1];
                                                a(868 - android.text.TextUtils.indexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (10383 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)), 5 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr188);
                                                java.lang.String[] strArr26 = {intern70, ((java.lang.String) objArr188[0]).intern()};
                                                java.lang.Object[] objArr189 = new java.lang.Object[1];
                                                a(android.view.View.resolveSizeAndState(0, 0, 0) + 874, (char) (3811 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)), android.view.KeyEvent.normalizeMetaState(0) + 19, objArr189);
                                                java.lang.String[] strArr27 = {((java.lang.String) objArr189[0]).intern()};
                                                java.lang.Object[] objArr190 = new java.lang.Object[1];
                                                a(893 - android.graphics.Color.alpha(0), (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 18585), 16 - android.view.KeyEvent.getDeadChar(0, 0), objArr190);
                                                java.lang.String[] strArr28 = {((java.lang.String) objArr190[0]).intern()};
                                                java.lang.Object[] objArr191 = new java.lang.Object[1];
                                                a(android.graphics.Color.rgb(0, 0, 0) + 16778125, (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16), android.graphics.ImageFormat.getBitsPerPixel(0) + 20, objArr191);
                                                java.lang.String[] strArr29 = {((java.lang.String) objArr191[0]).intern()};
                                                java.lang.Object[] objArr192 = new java.lang.Object[1];
                                                a(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 929, (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 13967), 19 - android.text.TextUtils.getOffsetAfter(str8, 0), objArr192);
                                                java.lang.String[] strArr30 = {((java.lang.String) objArr192[0]).intern()};
                                                java.lang.Object[] objArr193 = new java.lang.Object[1];
                                                a((-16776269) - android.graphics.Color.rgb(0, 0, 0), (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 23 - android.text.TextUtils.indexOf(str8, str8, 0), objArr193);
                                                java.lang.String[] strArr31 = {((java.lang.String) objArr193[0]).intern()};
                                                java.lang.Object[] objArr194 = new java.lang.Object[1];
                                                a((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 970, (char) ((android.os.Process.myTid() >> 22) + 43844), android.text.TextUtils.indexOf(str8, str8, 0, 0) + 21, objArr194);
                                                java.lang.String[] strArr32 = {((java.lang.String) objArr194[0]).intern()};
                                                java.lang.Object[] objArr195 = new java.lang.Object[1];
                                                a(991 - android.view.View.MeasureSpec.getSize(0), (char) ((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 27323), (-16777192) - android.graphics.Color.rgb(0, 0, 0), objArr195);
                                                java.lang.String str12 = str;
                                                java.lang.String[] strArr33 = {((java.lang.String) objArr195[0]).intern(), str12};
                                                java.lang.Object[] objArr196 = new java.lang.Object[1];
                                                a(android.view.View.resolveSize(0, 0) + 1015, (char) (12344 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 29, objArr196);
                                                java.lang.String[] strArr34 = {((java.lang.String) objArr196[0]).intern(), str12};
                                                java.lang.Object[] objArr197 = new java.lang.Object[1];
                                                a((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_SPOT_HALFTONE, (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE), 27 - android.view.KeyEvent.keyCodeFromString(str8), objArr197);
                                                java.lang.String[] strArr35 = {((java.lang.String) objArr197[0]).intern(), str12};
                                                java.lang.Object[] objArr198 = new java.lang.Object[1];
                                                a(1070 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (android.text.TextUtils.indexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 47977), android.text.TextUtils.indexOf(str8, str8) + 31, objArr198);
                                                char c2 = 0;
                                                java.lang.String[] strArr36 = {((java.lang.String) objArr198[0]).intern(), str12};
                                                java.lang.Object[] objArr199 = new java.lang.Object[1];
                                                a(android.text.TextUtils.getOffsetBefore(str8, 0) + 1101, (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), android.text.TextUtils.lastIndexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 28, objArr199);
                                                java.lang.String[] strArr37 = {((java.lang.String) objArr199[0]).intern(), str12};
                                                java.lang.Object[] objArr200 = new java.lang.Object[1];
                                                a(android.text.TextUtils.indexOf(str8, str8, 0) + 1128, (char) (android.text.TextUtils.indexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), 32 - android.view.View.getDefaultSize(0, 0), objArr200);
                                                java.lang.String[][] strArr38 = {strArr15, strArr16, strArr17, strArr18, strArr19, strArr20, strArr21, strArr22, strArr23, strArr24, strArr25, strArr26, strArr27, strArr28, strArr29, strArr30, strArr31, strArr32, strArr33, strArr34, strArr35, strArr36, strArr37, new java.lang.String[]{((java.lang.String) objArr200[0]).intern(), str12}};
                                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                                int i54 = i;
                                                int i55 = 0;
                                                int i56 = 0;
                                                for (int i57 = 24; i55 < i57; i57 = 24) {
                                                    java.lang.String[] strArr39 = strArr38[i55];
                                                    java.lang.Object[] objArr201 = {strArr39[c2]};
                                                    java.lang.Object obj36 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                    if (obj36 == null) {
                                                        java.lang.Class cls36 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - android.os.Process.getGidForName(str8), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 1921, (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                                                        byte b36 = (byte) ($$a[14] + 1);
                                                        java.lang.Object[] objArr202 = new java.lang.Object[1];
                                                        b((short) 653, b36, b36, objArr202);
                                                        obj36 = cls36.getMethod((java.lang.String) objArr202[0], java.lang.String.class);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj36);
                                                    }
                                                    java.lang.String str13 = (java.lang.String) ((java.lang.reflect.Method) obj36).invoke(null, objArr201);
                                                    java.lang.String[] strArr40 = (java.lang.String[]) java.util.Arrays.copyOfRange(strArr39, 1, strArr39.length);
                                                    if (str13 == null || str13.length() == 0) {
                                                        strArr = strArr38;
                                                        str3 = str8;
                                                    } else {
                                                        if (strArr39.length != 1) {
                                                            java.lang.Object[] objArr203 = {str13, strArr40};
                                                            java.lang.Object obj37 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1831766780);
                                                            if (obj37 == null) {
                                                                java.lang.Class cls37 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 43, 2881 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) android.graphics.Color.blue(0));
                                                                byte b37 = (byte) ($$a[14] + 1);
                                                                java.lang.Object[] objArr204 = new java.lang.Object[1];
                                                                b((short) 653, b37, b37, objArr204);
                                                                obj37 = cls37.getMethod((java.lang.String) objArr204[0], java.lang.String.class, java.lang.String[].class);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1831766780, obj37);
                                                            }
                                                            long longValue16 = ((java.lang.Long) ((java.lang.reflect.Method) obj37).invoke(null, objArr203)).longValue();
                                                            long j50 = j2 | 3563264;
                                                            strArr = strArr38;
                                                            str4 = str8;
                                                            long j51 = (((((370 * longValue16) - 1318408050) + (((longValue16 | (-3563265)) | j2) * (-369))) + (((~j50) | longValue16) * (-369))) + ((((~((~longValue16) | (-3563265))) | (~(j | (-3563265)))) | (~(j50 | longValue16))) * 369)) - 2025148514;
                                                            int i58 = ~((-973469513) | i31);
                                                            if (((((int) j51) & (((((((~(463756897 | i31)) | (-1000734570)) | (~(973469512 | i31))) | (~((-436491841) | i))) * (-84)) - 1905160647) + (((~(973469512 | i)) | (-463756898) | i58) * (-84)) + ((i58 | 436491840) * 84))) | (((int) (j51 >> 32)) & ((((((~((-1599319543) | i31)) | 162093131) | (~(1599319542 | i))) * (-564)) - 1558438126) + ((~(1610350079 | i)) * 1128) + (((~(162093131 | i31)) | 11030537) * 564)))) == 0) {
                                                                str3 = str4;
                                                            }
                                                        } else {
                                                            strArr = strArr38;
                                                            str4 = str8;
                                                        }
                                                        i56++;
                                                        i54 = i ^ (i55 + 10);
                                                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                        sb.append(str13);
                                                        str3 = str4;
                                                        java.lang.Object[] objArr205 = new java.lang.Object[1];
                                                        a(1160 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) android.graphics.Color.argb(0, 0, 0, 0), android.text.TextUtils.getOffsetAfter(str3, 0) + 1, objArr205);
                                                        sb.append(((java.lang.String) objArr205[0]).intern());
                                                        sb.append(str13);
                                                        arrayList.add(sb.toString());
                                                    }
                                                    i55++;
                                                    str8 = str3;
                                                    strArr38 = strArr;
                                                    c2 = 0;
                                                }
                                                str2 = str8;
                                                java.lang.Object[] objArr206 = new java.lang.Object[5];
                                                int[] iArr = new int[1];
                                                if (i56 > 2) {
                                                    objArr206[0] = iArr;
                                                    objArr206[1] = new int[]{i54};
                                                    objArr206[4] = new int[1];
                                                    iArr[0] = i;
                                                    objArr206[2] = arrayList;
                                                    objArr206[3] = null;
                                                    java.lang.Object[] objArr207 = {num, num, java.lang.Integer.valueOf((((~((-1188623356) | i31)) | (~((-862222743) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) + 213300835 + (((~((-824444933) | i31)) | (~((-1150845546) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE))};
                                                    java.lang.Object obj38 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                    if (obj38 == null) {
                                                        java.lang.Class cls38 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 51, (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2712, (char) (1 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))));
                                                        byte b38 = $$a[14];
                                                        java.lang.Object[] objArr208 = new java.lang.Object[1];
                                                        b((short) (b38 + 1), r6[16], (byte) (-b38), objArr208);
                                                        obj38 = cls38.getMethod((java.lang.String) objArr208[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj38);
                                                    }
                                                    int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj38).invoke(null, objArr207)).intValue();
                                                    i11 = 0;
                                                    ((int[]) objArr206[4])[0] = intValue;
                                                } else {
                                                    objArr206[0] = iArr;
                                                    objArr206[1] = new int[]{i};
                                                    objArr206[4] = new int[1];
                                                    iArr[0] = i;
                                                    objArr206[2] = null;
                                                    objArr206[3] = null;
                                                    int i59 = ~(1145718730 | i31);
                                                    java.lang.Object[] objArr209 = {num, num, java.lang.Integer.valueOf((((~((-1145718731) | i)) | (~(905127367 | i31)) | i59) * (-516)) + 1641937821 + (((~((-71435715) | i)) | (~((-833691654) | i31))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR) + ((i59 | 833691653) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR))};
                                                    java.lang.Object obj39 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                    if (obj39 == null) {
                                                        java.lang.Class cls39 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), android.view.KeyEvent.getDeadChar(0, 0) + 2713, (char) (android.view.ViewConfiguration.getTapTimeout() >> 16));
                                                        byte b39 = $$a[14];
                                                        java.lang.Object[] objArr210 = new java.lang.Object[1];
                                                        b((short) (b39 + 1), r5[16], (byte) (-b39), objArr210);
                                                        obj39 = cls39.getMethod((java.lang.String) objArr210[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj39);
                                                    }
                                                    i11 = 0;
                                                    ((int[]) objArr206[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj39).invoke(null, objArr209)).intValue();
                                                }
                                                int i60 = ((int[]) objArr206[1])[i11];
                                                if (i60 != i) {
                                                    int[] iArr2 = new int[1];
                                                    int[] iArr3 = new int[1];
                                                    java.util.List list3 = (java.util.List) objArr206[2];
                                                    iArr2[i11] = i;
                                                    iArr3[i11] = i60;
                                                    java.lang.Object[] objArr211 = {iArr2, iArr3, list3, null, new int[1]};
                                                    java.lang.Object[] objArr212 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((1878780783 | i31) * (-369)) - 1396155502) + (((~((-183100263) | i31)) | 1867745835) * (-369)) + (((~(i | 183100262)) | 1695680521 | (~((-11034949) | i31))) * 369))};
                                                    java.lang.Object obj40 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                    if (obj40 == null) {
                                                        java.lang.Class cls40 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.getDefaultSize(0, 0) + 50, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 2713, (char) (android.view.ViewConfiguration.getTouchSlop() >> 8));
                                                        byte b40 = $$a[14];
                                                        java.lang.Object[] objArr213 = new java.lang.Object[1];
                                                        b((short) (b40 + 1), r4[16], (byte) (-b40), objArr213);
                                                        obj40 = cls40.getMethod((java.lang.String) objArr213[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj40);
                                                    }
                                                    ((int[]) objArr211[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj40).invoke(null, objArr212)).intValue();
                                                    return objArr211;
                                                }
                                                i12 = i11;
                                                java.lang.Object[] objArr822 = new java.lang.Object[1];
                                                a(446 - (android.widget.ExpandableListView.getPackedPositionForGroup(i12) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(i12) == 0L ? 0 : -1)), (char) (org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF9_MARKER - (android.view.ViewConfiguration.getTouchSlop() >> 8)), 17 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr822);
                                                java.lang.Object[] objArr832 = {((java.lang.String) objArr822[0]).intern()};
                                                obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                if (obj == null) {
                                                }
                                                invoke = ((java.lang.reflect.Method) obj).invoke(null, objArr832);
                                                if (invoke != null) {
                                                }
                                                if (i13 != 1986687685) {
                                                }
                                                java.lang.Object[] objArr1152 = new java.lang.Object[1];
                                                a(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1504, (char) android.view.View.getDefaultSize(0, 0), 13 - android.graphics.Color.red(0), objArr1152);
                                                java.lang.String intern342 = ((java.lang.String) objArr1152[0]).intern();
                                                java.lang.Object[] objArr1162 = new java.lang.Object[1];
                                                a(1515 - android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (36752 - android.view.View.MeasureSpec.getMode(0)), 5 - (android.os.Process.myTid() >> 22), objArr1162);
                                                java.lang.String[] strArr92 = {intern342, ((java.lang.String) objArr1162[0]).intern()};
                                                java.lang.Object[] objArr1172 = new java.lang.Object[1];
                                                a((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 1521, (char) android.view.View.MeasureSpec.getSize(0), 15 - android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr1172);
                                                java.lang.String intern352 = ((java.lang.String) objArr1172[0]).intern();
                                                java.lang.Object[] objArr1182 = new java.lang.Object[1];
                                                a(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1488, (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 20, objArr1182);
                                                java.lang.String intern362 = ((java.lang.String) objArr1182[0]).intern();
                                                java.lang.Object[] objArr1192 = new java.lang.Object[1];
                                                a(1554 - android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.graphics.Color.red(0), 14 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr1192);
                                                java.lang.String[] strArr102 = {intern352, intern362, ((java.lang.String) objArr1192[0]).intern()};
                                                java.lang.Object[] objArr1202 = new java.lang.Object[1];
                                                a(1569 - android.text.TextUtils.getOffsetAfter(str2, 0), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 21, objArr1202);
                                                java.lang.String intern372 = ((java.lang.String) objArr1202[0]).intern();
                                                java.lang.Object[] objArr1212 = new java.lang.Object[1];
                                                a((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1589, (char) (android.os.Process.myTid() >> 22), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 9, objArr1212);
                                                java.lang.String[] strArr112 = {intern372, ((java.lang.String) objArr1212[0]).intern()};
                                                java.lang.Object[] objArr1222 = new java.lang.Object[1];
                                                a((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1600, (char) ((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 4203), android.view.View.MeasureSpec.getMode(0) + 11, objArr1222);
                                                java.lang.String intern382 = ((java.lang.String) objArr1222[0]).intern();
                                                java.lang.Object[] objArr1232 = new java.lang.Object[1];
                                                a(336 - android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 6, objArr1232);
                                                java.lang.String[] strArr122 = {intern382, ((java.lang.String) objArr1232[0]).intern()};
                                                java.lang.Object[] objArr1242 = new java.lang.Object[1];
                                                a(android.view.View.MeasureSpec.getMode(0) + 1611, (char) (2661 - android.text.TextUtils.getCapsMode(str2, 0, 0)), 28 - android.view.Gravity.getAbsoluteGravity(0, 0), objArr1242);
                                                java.lang.String intern392 = ((java.lang.String) objArr1242[0]).intern();
                                                java.lang.Object[] objArr1252 = new java.lang.Object[1];
                                                a(1591 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 9, objArr1252);
                                                c = 0;
                                                strArr2 = new java.lang.String[][]{strArr92, strArr102, strArr112, strArr122, new java.lang.String[]{intern392, ((java.lang.String) objArr1252[0]).intern()}};
                                                int i462 = -1;
                                                i14 = 0;
                                                loop4: while (true) {
                                                    if (i14 < 5) {
                                                    }
                                                    i14++;
                                                    strArr2 = strArr2;
                                                    c = 0;
                                                }
                                                if (i15 == i) {
                                                }
                                            }
                                        }
                                    }
                                    java.lang.Object[] objArr214 = new java.lang.Object[1];
                                    a(android.view.View.getDefaultSize(0, 0) + 343, (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 13, objArr214);
                                    java.lang.String intern71 = ((java.lang.String) objArr214[0]).intern();
                                    java.lang.Object[] objArr215 = new java.lang.Object[1];
                                    a((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 356, (char) android.view.View.resolveSizeAndState(0, 0, 0), android.view.View.MeasureSpec.getMode(0) + 9, objArr215);
                                    java.lang.Object[] objArr216 = {intern71, ((java.lang.String) objArr215[0]).intern()};
                                    java.lang.Object obj41 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1881343749);
                                    if (obj41 == null) {
                                        java.lang.Class cls41 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 38, android.text.TextUtils.getOffsetBefore("", 0) + 2213, (char) android.graphics.Color.blue(0));
                                        byte b41 = (byte) ($$a[14] + 1);
                                        java.lang.Object[] objArr217 = new java.lang.Object[1];
                                        b((short) 653, b41, b41, objArr217);
                                        obj41 = cls41.getMethod((java.lang.String) objArr217[0], java.lang.String.class, java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1881343749, obj41);
                                    }
                                    long longValue17 = ((java.lang.Long) ((java.lang.reflect.Method) obj41).invoke(null, objArr216)).longValue();
                                    long j52 = (-1026559283) | longValue17;
                                    long j53 = ((((((-753) * longValue17) + 775052257910L) + ((((~(j | (-1026559283))) | (~j52)) | (~(longValue17 | j))) * (-754))) + (((~(j52 | j)) | (~((1026559282 | j14) | longValue17))) * (-754))) + (((-1026559283) | j14) * 754)) - 1761933884;
                                    int i61 = ~((-907815942) | i);
                                    i10 = ((((int) (j53 >> 32)) & ((((((~(1063135193 | i31)) | (~(1794605691 | i))) * (-370)) + 635053406) + ((((~(1063135193 | i)) | (~(1794605691 | i31))) | 710279769) * (-370))) + 810509474)) | (((int) j53) & ((((((~((-907815942) | i31)) | 33816581) * (-245)) + 944105614) + (i61 * (-245))) + ((i61 | 1949924944) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE)))) != 0 ? i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE : i;
                                    if (i10 == i) {
                                    }
                                }
                            }
                            i8 = i;
                            if (i8 == i) {
                            }
                        }
                    }
                    i6 = i;
                    if (i6 == i) {
                    }
                }

                static void init$0() {
                    $$a = new byte[]{76, 48, 60, 63, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1, -15, 10};
                    $$b = 207;
                }
            });
        }
    }

    private static void a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, char c, java.lang.Object[] objArr) {
        char[] cArr;
        char c2;
        char[] charArray = str3 != null ? str3.toCharArray() : str3;
        char[] charArray2 = str2 != null ? str2.toCharArray() : str2;
        if (str != null) {
            cArr = str.toCharArray();
            int i2 = $11 + 23;
            $10 = i2 % 128;
            int i3 = i2 % 2;
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.getWalletData getwalletdata = new com.payair.hce.getWalletData();
        int length = charArray.length;
        char[] cArr3 = new char[length];
        int length2 = cArr2.length;
        char[] cArr4 = new char[length2];
        java.lang.System.arraycopy(charArray, 0, cArr3, 0, length);
        java.lang.System.arraycopy(cArr2, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c);
        cArr4[2] = (char) (cArr4[2] + ((char) i));
        int length3 = charArray2.length;
        char[] cArr5 = new char[length3];
        getwalletdata.writeReplace = 0;
        while (getwalletdata.writeReplace < length3) {
            $11 = ($10 + 115) % 128;
            try {
                java.lang.Object[] objArr2 = {getwalletdata};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-800817016);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.rgb(0, 0, 0) + 16777287, 1179 - android.view.View.combineMeasuredStates(0, 0), (char) (android.view.MotionEvent.axisFromString("") + 1));
                    byte length4 = (byte) $$a.length;
                    byte b = (byte) (length4 - 4);
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b(length4, b, b, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-800817016, obj);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                java.lang.Object[] objArr4 = {getwalletdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(811305766);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 30, 3443 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) (3831 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))))).getMethod("g", java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(811305766, obj2);
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).intValue();
                java.lang.Object[] objArr5 = {getwalletdata, java.lang.Integer.valueOf(cArr3[getwalletdata.writeReplace % 4] * 32718), java.lang.Integer.valueOf(cArr4[intValue])};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2107355451);
                if (obj3 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(25 - android.os.Process.getGidForName(""), android.view.View.resolveSize(0, 0) + 1864, (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 41774));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    b((byte) 1, (byte) 0, (short) 0, objArr6);
                    obj3 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2107355451, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                java.lang.Object[] objArr7 = {java.lang.Integer.valueOf(cArr3[intValue2] * 32718), java.lang.Integer.valueOf(cArr4[intValue])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(140076502);
                if (obj4 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSizeAndState(0, 0, 0) + 28, 3133 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))));
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    b((byte) 0, (byte) 0, (short) 0, objArr8);
                    c2 = 2;
                    obj4 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(140076502, obj4);
                } else {
                    c2 = 2;
                }
                cArr4[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).charValue();
                cArr3[intValue2] = getwalletdata.values;
                cArr5[getwalletdata.writeReplace] = (char) ((((cArr3[intValue2] ^ charArray2[getwalletdata.writeReplace]) ^ (getAid ^ 1263759066225628708L)) ^ ((int) (getPaymentFci ^ 1263759066225628708L))) ^ ((char) (SdkCoreBusinessLogicModuleImpl ^ 1263759066225628708L)));
                getwalletdata.writeReplace++;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new java.lang.String(cArr5);
    }

    public final byte[] DigitizedCardProfile(byte[] bArr) {
        synchronized (this) {
            int i = getCvrMaskAnd + 15;
            getGpoResponse = i % 128;
            try {
                try {
                    if (i % 2 == 0) {
                        throw new java.lang.ArithmeticException();
                    }
                    if (!this.SdkCoreAlternateContactlessPaymentDataImpl) {
                        android.text.TextUtils.indexOf("", "");
                        android.graphics.Color.rgb(0, 0, 0);
                        throw new com.payair.hce.getCurrentRequestId(com.payair.hce.requestTaskStatusUpdate.SdkCoreAlternateContactlessPaymentDataImpl);
                    }
                    com.payair.hce.ignoreFailedTransaction ignorefailedtransaction = values;
                    com.payair.hce.ignoreFailedTransaction.AlternateContactlessPaymentDataJson(new java.lang.Object[]{ignorefailedtransaction}, 1658163184, -1658163183, java.lang.System.identityHashCode(ignorefailedtransaction));
                    if (this.AlternateContactlessPaymentDataJson != com.payair.hce.ContactlessPaymentData.AlternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson) {
                        if (this.AlternateContactlessPaymentDataJson != com.payair.hce.ContactlessPaymentData.AlternateContactlessPaymentDataJson.valueOf) {
                            throw new com.payair.hce.getSukFileName(com.payair.hce.requestTaskStatusUpdate.getAip);
                        }
                        byte[] writeReplace = ((com.payair.hce.onDeleteCardCompleted) this.valueOf).writeReplace(bArr);
                        getGpoResponse = (getCvrMaskAnd + 77) % 128;
                        return writeReplace;
                    }
                    int i2 = getGpoResponse + 85;
                    getCvrMaskAnd = i2 % 128;
                    if (i2 % 2 == 0) {
                        com.payair.hce.onCardProvisionFailure oncardprovisionfailure = this.DigitizedCardProfile;
                        int i3 = com.payair.hce.onCardProvisionFailure.values.valueOf;
                        com.payair.hce.onTransactionStopped ontransactionstopped = (com.payair.hce.onTransactionStopped) com.payair.hce.onCardProvisionFailure.DigitizedCardProfile(new java.lang.Object[]{oncardprovisionfailure, java.lang.Integer.valueOf(i3)}, -2119412281, 2119412281, i3);
                        this.valueOf = ontransactionstopped;
                        ontransactionstopped.DigitizedCardProfile();
                        this.AlternateContactlessPaymentDataJson = com.payair.hce.ContactlessPaymentData.AlternateContactlessPaymentDataJson.valueOf;
                        return ((com.payair.hce.onDeleteCardCompleted) this.valueOf).writeReplace(bArr);
                    }
                    com.payair.hce.onCardProvisionFailure oncardprovisionfailure2 = this.DigitizedCardProfile;
                    int i4 = com.payair.hce.onCardProvisionFailure.values.valueOf;
                    com.payair.hce.onTransactionStopped ontransactionstopped2 = (com.payair.hce.onTransactionStopped) com.payair.hce.onCardProvisionFailure.DigitizedCardProfile(new java.lang.Object[]{oncardprovisionfailure2, java.lang.Integer.valueOf(i4)}, -2119412281, 2119412281, i4);
                    this.valueOf = ontransactionstopped2;
                    ontransactionstopped2.DigitizedCardProfile();
                    this.AlternateContactlessPaymentDataJson = com.payair.hce.ContactlessPaymentData.AlternateContactlessPaymentDataJson.valueOf;
                    ((com.payair.hce.onDeleteCardCompleted) this.valueOf).writeReplace(bArr);
                    throw null;
                } catch (com.payair.hce.getCurrentRequestId e) {
                    com.payair.hce.access000.SdkCoreCardRiskManagementDataImpl();
                    valueOf(null);
                    valueOf((com.payair.hce.replenishToken) com.payair.hce.getAtcCount.writeReplace(new java.lang.Object[]{e}, 763524424, -763524423, java.lang.System.identityHashCode(e)), e);
                    android.text.TextUtils.getOffsetBefore("", 0);
                    android.view.View.getDefaultSize(0, 0);
                    new java.lang.Object[]{e.getMessage()};
                    android.view.MotionEvent.axisFromString("");
                    android.os.Process.getElapsedCpuTime();
                    new java.lang.Object[]{(com.payair.hce.requestTaskStatusUpdate) com.payair.hce.getAtcCount.writeReplace(new java.lang.Object[]{e}, -58351927, 58351927, java.lang.System.identityHashCode(e))};
                    return ((com.payair.hce.getContactlessSupported) com.payair.hce.setContactlessSupported.writeReplace(new java.lang.Object[]{(com.payair.hce.requestTaskStatusUpdate) com.payair.hce.getAtcCount.writeReplace(new java.lang.Object[]{e}, -58351927, 58351927, java.lang.System.identityHashCode(e))}, -57886224, 57886224, (int) java.lang.System.currentTimeMillis())).DigitizedCardProfile();
                } catch (com.payair.hce.getSukFileName e2) {
                    valueOf((com.payair.hce.replenishToken) com.payair.hce.getAtcCount.writeReplace(new java.lang.Object[]{e2}, 763524424, -763524423, java.lang.System.identityHashCode(e2)), e2);
                    android.widget.ExpandableListView.getPackedPositionGroup(0L);
                    android.text.TextUtils.indexOf("", "", 0);
                    new java.lang.Object[]{e2.getMessage()};
                    android.text.TextUtils.getTrimmedLength("");
                    android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                    new java.lang.Object[]{(com.payair.hce.requestTaskStatusUpdate) com.payair.hce.getAtcCount.writeReplace(new java.lang.Object[]{e2}, -58351927, 58351927, java.lang.System.identityHashCode(e2))};
                    return ((com.payair.hce.getContactlessSupported) com.payair.hce.setContactlessSupported.writeReplace(new java.lang.Object[]{(com.payair.hce.requestTaskStatusUpdate) com.payair.hce.getAtcCount.writeReplace(new java.lang.Object[]{e2}, -58351927, 58351927, java.lang.System.identityHashCode(e2))}, -57886224, 57886224, (int) java.lang.System.currentTimeMillis())).DigitizedCardProfile();
                }
            } catch (com.payair.hce.digitize e3) {
                writeReplace(e3);
                android.text.TextUtils.getOffsetBefore("", 0);
                android.os.SystemClock.uptimeMillis();
                new java.lang.Object[]{e3.getMessage()};
                android.view.View.MeasureSpec.getMode(0);
                android.text.TextUtils.getTrimmedLength("");
                new java.lang.Object[]{(com.payair.hce.requestTaskStatusUpdate) com.payair.hce.getAtcCount.writeReplace(new java.lang.Object[]{e3}, -58351927, 58351927, java.lang.System.identityHashCode(e3))};
                return ((com.payair.hce.getContactlessSupported) com.payair.hce.setContactlessSupported.writeReplace(new java.lang.Object[]{(com.payair.hce.requestTaskStatusUpdate) com.payair.hce.getAtcCount.writeReplace(new java.lang.Object[]{e3}, -58351927, 58351927, java.lang.System.identityHashCode(e3))}, -57886224, 57886224, (int) java.lang.System.currentTimeMillis())).DigitizedCardProfile();
            } catch (com.payair.hce.getAtcCount e4) {
                com.payair.hce.access000.SdkCoreCardRiskManagementDataImpl();
                valueOf(null);
                valueOf((com.payair.hce.replenishToken) com.payair.hce.getAtcCount.writeReplace(new java.lang.Object[]{e4}, 763524424, -763524423, java.lang.System.identityHashCode(e4)), e4);
                android.view.ViewConfiguration.getGlobalActionKeyTimeout();
                android.view.MotionEvent.axisFromString("");
                new java.lang.Object[]{e4.getMessage()};
                android.view.View.MeasureSpec.getMode(0);
                android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                new java.lang.Object[]{(com.payair.hce.requestTaskStatusUpdate) com.payair.hce.getAtcCount.writeReplace(new java.lang.Object[]{e4}, -58351927, 58351927, java.lang.System.identityHashCode(e4))};
                return ((com.payair.hce.getContactlessSupported) com.payair.hce.setContactlessSupported.writeReplace(new java.lang.Object[]{(com.payair.hce.requestTaskStatusUpdate) com.payair.hce.getAtcCount.writeReplace(new java.lang.Object[]{e4}, -58351927, 58351927, java.lang.System.identityHashCode(e4))}, -57886224, 57886224, (int) java.lang.System.currentTimeMillis())).DigitizedCardProfile();
            }
        }
    }

    public final void AlternateContactlessPaymentDataJson() {
        synchronized (this) {
            android.view.ViewConfiguration.getMaximumDrawingCacheSize();
            android.view.ViewConfiguration.getWindowTouchSlop();
            if (this.AlternateContactlessPaymentDataJson == com.payair.hce.ContactlessPaymentData.AlternateContactlessPaymentDataJson.valueOf) {
                valueOf(null);
                valueOf(com.payair.hce.replenishToken.writeReplace, new com.payair.hce.getCurrentRequestId(com.payair.hce.requestTaskStatusUpdate.values));
                com.payair.hce.ignoreFailedTransaction ignorefailedtransaction = values;
                com.payair.hce.ignoreFailedTransaction.AlternateContactlessPaymentDataJson(new java.lang.Object[]{ignorefailedtransaction}, 1658163184, -1658163183, java.lang.System.identityHashCode(ignorefailedtransaction));
                getGpoResponse = (getCvrMaskAnd + 109) % 128;
                return;
            }
            if (this.AlternateContactlessPaymentDataJson == com.payair.hce.ContactlessPaymentData.AlternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson) {
                int i = getGpoResponse + 75;
                getCvrMaskAnd = i % 128;
                if (i % 2 != 0) {
                    com.payair.hce.access000.SdkCoreCardRiskManagementDataImpl();
                    valueOf(null);
                    com.payair.hce.ignoreFailedTransaction ignorefailedtransaction2 = values;
                    com.payair.hce.ignoreFailedTransaction.AlternateContactlessPaymentDataJson(new java.lang.Object[]{ignorefailedtransaction2}, 1658163184, -1658163183, java.lang.System.identityHashCode(ignorefailedtransaction2));
                    throw null;
                }
                com.payair.hce.access000.SdkCoreCardRiskManagementDataImpl();
                valueOf(null);
                com.payair.hce.ignoreFailedTransaction ignorefailedtransaction3 = values;
                com.payair.hce.ignoreFailedTransaction.AlternateContactlessPaymentDataJson(new java.lang.Object[]{ignorefailedtransaction3}, 1658163184, -1658163183, java.lang.System.identityHashCode(ignorefailedtransaction3));
                getGpoResponse = (getCvrMaskAnd + 125) % 128;
            }
            int i2 = getGpoResponse + 11;
            getCvrMaskAnd = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }
    }

    private void valueOf(com.payair.hce.onReplenishCompleted onreplenishcompleted) {
        getGpoResponse = (getCvrMaskAnd + 5) % 128;
        this.AlternateContactlessPaymentDataJson = com.payair.hce.ContactlessPaymentData.AlternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson;
        com.payair.hce.onTransactionStopped ontransactionstopped = this.valueOf;
        if (ontransactionstopped != null) {
            ontransactionstopped.values();
        }
        this.valueOf = null;
        if (onreplenishcompleted != null) {
            getCvrMaskAnd = (getGpoResponse + 105) % 128;
            AlternateContactlessPaymentDataJson(onreplenishcompleted);
        }
    }

    private void valueOf() {
        synchronized (this) {
            android.graphics.Color.alpha(0);
            android.view.ViewConfiguration.getGlobalActionKeyTimeout();
            valueOf(null);
            valueOf(com.payair.hce.replenishToken.DigitizedCardProfile, new com.payair.hce.getCurrentRequestId(com.payair.hce.requestTaskStatusUpdate.values));
            getGpoResponse = (getCvrMaskAnd + 31) % 128;
        }
    }

    @Override // com.payair.hce.onShowAuthenticateScreen
    public final void writeReplace() {
        synchronized (this) {
            android.graphics.Color.rgb(0, 0, 0);
            android.os.SystemClock.uptimeMillis();
            valueOf(null);
            valueOf(com.payair.hce.replenishToken.valueOf, new com.payair.hce.getCurrentRequestId(com.payair.hce.requestTaskStatusUpdate.wipe));
            getGpoResponse = (getCvrMaskAnd + 125) % 128;
        }
    }

    @Override // com.payair.hce.onShowAuthenticateScreen
    public final void DigitizedCardProfile(com.payair.hce.onReplenishCompleted onreplenishcompleted) {
        int i = getGpoResponse + 69;
        getCvrMaskAnd = i % 128;
        if (i % 2 == 0) {
            if (onreplenishcompleted.valueOf() == com.payair.hce.getMDESCardsUniqueTokenReferences.values) {
                com.payair.hce.ignoreFailedTransaction ignorefailedtransaction = values;
                com.payair.hce.ignoreFailedTransaction.AlternateContactlessPaymentDataJson(new java.lang.Object[]{ignorefailedtransaction}, 1024361596, -1024361596, java.lang.System.identityHashCode(ignorefailedtransaction));
            } else {
                com.payair.hce.ignoreFailedTransaction ignorefailedtransaction2 = values;
                com.payair.hce.ignoreFailedTransaction.AlternateContactlessPaymentDataJson(new java.lang.Object[]{ignorefailedtransaction2}, 1658163184, -1658163183, java.lang.System.identityHashCode(ignorefailedtransaction2));
            }
            valueOf(onreplenishcompleted);
            getCvrMaskAnd = (getGpoResponse + 35) % 128;
            return;
        }
        onreplenishcompleted.valueOf();
        com.payair.hce.getMDESCardsUniqueTokenReferences getmdescardsuniquetokenreferences = com.payair.hce.getMDESCardsUniqueTokenReferences.values;
        throw new java.lang.ArithmeticException();
    }

    private static void DigitizedCardProfile() {
        new com.payair.hce.setAckAutomaticallyResetByApplication();
        new com.payair.hce.setAckAlwaysRequiredIfCurrencyNotProvided();
        new com.payair.hce.setPinPreEntryAllowed();
        new com.payair.hce.setAckPreEntryAllowed();
        new com.payair.hce.setIccPrivateKeyCrtComponents();
        int i = getCvrMaskAnd + 93;
        getGpoResponse = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private void writeReplace(final java.lang.Exception exc) {
        new java.lang.Thread(new java.lang.Runnable() { // from class: com.payair.hce.ContactlessPaymentData.3
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static final byte[] $$d = null;
            private static final int $$e = 0;
            private static int $10;
            private static int $11;
            private static int DigitizedCardProfile;
            private static int IccPrivateKeyCrtComponentsJson;
            private static int RecordsJson;
            private static byte[] SdkCoreAlternateContactlessPaymentDataImpl;
            private static int getAid;
            private static short[] getProfileVersion;
            private static int valueOf;
            private static int values;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002e). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void a(short s, int i, int i2, java.lang.Object[] objArr) {
                int i3;
                int i4 = (i2 * 653) + 65;
                byte[] bArr = $$a;
                int i5 = 38 - (s * 34);
                int i6 = i * 34;
                char[] cArr = new char[35 - i6];
                if (bArr == null) {
                    int i7 = i4;
                    i3 = 0;
                    int i8 = i5;
                    int i9 = i8 + 1;
                    i4 = (i5 + (-i7)) - 2;
                    i5 = i9;
                    cArr[i3] = (char) i4;
                    if (i3 == 34 - i6) {
                        objArr[0] = new java.lang.String(cArr);
                        return;
                    }
                    i7 = bArr[i5];
                    i3++;
                    int i10 = i4;
                    i8 = i5;
                    i5 = i10;
                    int i92 = i8 + 1;
                    i4 = (i5 + (-i7)) - 2;
                    i5 = i92;
                    cArr[i3] = (char) i4;
                    if (i3 == 34 - i6) {
                    }
                } else {
                    i3 = 0;
                    cArr[i3] = (char) i4;
                    if (i3 == 34 - i6) {
                    }
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002b). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void d(int i, byte b, int i2, java.lang.Object[] objArr) {
                int i3;
                int i4 = (i * 11) + 104;
                int i5 = i2 * 3;
                int i6 = 3 - (b * 3);
                byte[] bArr = $$d;
                byte[] bArr2 = new byte[i5 + 1];
                if (bArr == null) {
                    int i7 = i4;
                    i4 = i5;
                    i3 = 0;
                    i4 += i7;
                    i6++;
                    bArr2[i3] = (byte) i4;
                    if (i3 == i5) {
                        objArr[0] = new java.lang.String(bArr2, 0);
                        return;
                    }
                    i3++;
                    i7 = bArr[i6];
                    i4 += i7;
                    i6++;
                    bArr2[i3] = (byte) i4;
                    if (i3 == i5) {
                    }
                } else {
                    i3 = 0;
                    i6++;
                    bArr2[i3] = (byte) i4;
                    if (i3 == i5) {
                    }
                }
            }

            private static void b(boolean z, java.lang.String str, int i, int i2, int i3, java.lang.Object[] objArr) {
                int i4 = $11 + 33;
                $10 = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
                char[] charArray = str != null ? str.toCharArray() : str;
                com.payair.hce.DigitizedCardJson11 digitizedCardJson11 = new com.payair.hce.DigitizedCardJson11();
                char[] cArr = new char[i3];
                digitizedCardJson11.DigitizedCardProfile = 0;
                while (digitizedCardJson11.DigitizedCardProfile < i3) {
                    digitizedCardJson11.values = charArray[digitizedCardJson11.DigitizedCardProfile];
                    cArr[digitizedCardJson11.DigitizedCardProfile] = (char) (i + digitizedCardJson11.values);
                    int i5 = digitizedCardJson11.DigitizedCardProfile;
                    try {
                        java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i5]), java.lang.Integer.valueOf(DigitizedCardProfile)};
                        java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(414841307);
                        if (obj == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.os.Process.getGidForName("") + 2074, (char) (60037 - android.graphics.Color.red(0)));
                            byte b = (byte) ($$e & 5);
                            byte b2 = (byte) (b - 1);
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            d(b, b2, b2, objArr3);
                            obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(414841307, obj);
                        }
                        cArr[i5] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                        java.lang.Object[] objArr4 = {digitizedCardJson11, digitizedCardJson11};
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                        if (obj2 == null) {
                            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - android.view.View.combineMeasuredStates(0, 0), android.view.View.MeasureSpec.getSize(0) + 3543, (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
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
                    $10 = ($11 + 47) % 128;
                    digitizedCardJson11.AlternateContactlessPaymentDataJson = i2;
                    char[] cArr2 = new char[i3];
                    java.lang.System.arraycopy(cArr, 0, cArr2, 0, i3);
                    java.lang.System.arraycopy(cArr2, 0, cArr, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson, digitizedCardJson11.AlternateContactlessPaymentDataJson);
                    java.lang.System.arraycopy(cArr2, digitizedCardJson11.AlternateContactlessPaymentDataJson, cArr, 0, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson);
                }
                if (z) {
                    char[] cArr3 = new char[i3];
                    digitizedCardJson11.DigitizedCardProfile = 0;
                    while (digitizedCardJson11.DigitizedCardProfile < i3) {
                        cArr3[digitizedCardJson11.DigitizedCardProfile] = cArr[(i3 - digitizedCardJson11.DigitizedCardProfile) - 1];
                        java.lang.Object[] objArr5 = {digitizedCardJson11, digitizedCardJson11};
                        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                        if (obj3 == null) {
                            obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), 3544 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj3);
                        }
                        ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                    }
                    cArr = cArr3;
                }
                objArr[0] = new java.lang.String(cArr);
            }

            /* JADX WARN: Code restructure failed: missing block: B:48:0x0200, code lost:
            
                if (r4 != false) goto L50;
             */
            /* JADX WARN: Code restructure failed: missing block: B:49:0x021b, code lost:
            
                r4 = 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:76:0x0213, code lost:
            
                com.payair.hce.ContactlessPaymentData.AnonymousClass3.$11 = (r7 + 19) % 128;
                r4 = 1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:78:0x0211, code lost:
            
                if (r4 != false) goto L50;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void c(int i, int i2, byte b, int i3, short s, java.lang.Object[] objArr) {
                boolean z;
                int i4;
                int i5;
                boolean z2;
                com.payair.hce.getTrack2ConstructionData gettrack2constructiondata = new com.payair.hce.getTrack2ConstructionData();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                int i6 = 2;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(values)};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                    long j = 0;
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.os.Process.myPid() >> 22), android.view.KeyEvent.getDeadChar(0, 0) + 29, (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj);
                    }
                    int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                    if (intValue == -1) {
                        $11 = ($10 + 25) % 128;
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        byte[] bArr = SdkCoreAlternateContactlessPaymentDataImpl;
                        if (bArr != null) {
                            int length = bArr.length;
                            byte[] bArr2 = new byte[length];
                            int i7 = 0;
                            while (i7 < length) {
                                int i8 = $10 + 3;
                                $11 = i8 % 128;
                                if (i8 % i6 == 0) {
                                    java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(bArr[i7])};
                                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609478628);
                                    if (obj2 == null) {
                                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 31, 5089 - (android.os.SystemClock.elapsedRealtime() > j ? 1 : (android.os.SystemClock.elapsedRealtime() == j ? 0 : -1)), (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16))).getMethod("e", java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609478628, obj2);
                                    }
                                    bArr2[i7] = ((java.lang.Byte) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).byteValue();
                                } else {
                                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(bArr[i7])};
                                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609478628);
                                    if (obj3 == null) {
                                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 31, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 5088, (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).getMethod("e", java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609478628, obj3);
                                    }
                                    bArr2[i7] = ((java.lang.Byte) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).byteValue();
                                    i7++;
                                }
                                i6 = 2;
                                j = 0;
                            }
                            bArr = bArr2;
                        }
                        if (bArr != null) {
                            byte[] bArr3 = SdkCoreAlternateContactlessPaymentDataImpl;
                            java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(valueOf)};
                            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                            if (obj4 == null) {
                                obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.getDefaultSize(0, 0) + 27, android.view.View.MeasureSpec.getMode(0) + 29, (char) android.text.TextUtils.getCapsMode("", 0, 0))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj4);
                            }
                            intValue = (byte) (((byte) (bArr3[((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr5)).intValue()] ^ (-4897270311952305750L))) + ((int) (values ^ (-4897270311952305750L))));
                        } else {
                            intValue = (short) (((short) (getProfileVersion[i + ((int) (valueOf ^ (-4897270311952305750L)))] ^ (-4897270311952305750L))) + ((int) (values ^ (-4897270311952305750L))));
                        }
                    }
                    if (intValue > 0) {
                        int i9 = $11 + 5;
                        int i10 = i9 % 128;
                        $10 = i10;
                        if (i9 % 2 != 0) {
                            i4 = ((i + intValue) >> 2) << ((int) (valueOf - 4897270311952305750L));
                        } else {
                            i4 = ((i + intValue) - 2) + ((int) (valueOf ^ (-4897270311952305750L)));
                        }
                        gettrack2constructiondata.writeReplace = i4 + i5;
                        java.lang.Object[] objArr6 = {gettrack2constructiondata, java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(getAid), sb};
                        java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-500696024);
                        if (obj5 == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2364, (char) android.view.KeyEvent.normalizeMetaState(0));
                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                            d(0, (byte) 0, 0, objArr7);
                            obj5 = cls.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-500696024, obj5);
                        }
                        ((java.lang.StringBuilder) ((java.lang.reflect.Method) obj5).invoke(null, objArr6)).append(gettrack2constructiondata.values);
                        gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                        byte[] bArr4 = SdkCoreAlternateContactlessPaymentDataImpl;
                        if (bArr4 != null) {
                            int length2 = bArr4.length;
                            byte[] bArr5 = new byte[length2];
                            for (int i11 = 0; i11 < length2; i11++) {
                                bArr5[i11] = (byte) (bArr4[i11] ^ (-4897270311952305750L));
                            }
                            bArr4 = bArr5;
                        }
                        if (bArr4 != null) {
                            $10 = ($11 + 67) % 128;
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        gettrack2constructiondata.DigitizedCardProfile = 1;
                        while (gettrack2constructiondata.DigitizedCardProfile < intValue) {
                            if (z2) {
                                byte[] bArr6 = SdkCoreAlternateContactlessPaymentDataImpl;
                                gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((byte) (((byte) (bArr6[r7] ^ (-4897270311952305750L))) + s)) ^ b));
                            } else {
                                short[] sArr = getProfileVersion;
                                gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((short) (((short) (sArr[r7] ^ (-4897270311952305750L))) + s)) ^ b));
                            }
                            sb.append(gettrack2constructiondata.values);
                            gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                            gettrack2constructiondata.DigitizedCardProfile++;
                            $11 = ($10 + 25) % 128;
                        }
                    }
                    objArr[0] = sb.toString();
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                RecordsJson = (IccPrivateKeyCrtComponentsJson + 49) % 128;
                com.payair.hce.ContactlessPaymentData.values(com.payair.hce.ContactlessPaymentData.this);
                android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                android.os.SystemClock.elapsedRealtime();
                android.text.TextUtils.indexOf("", "");
                com.payair.hce.ContactlessPaymentData.AlternateContactlessPaymentDataJson(com.payair.hce.ContactlessPaymentData.this).DigitizedCardProfile(exc);
                IccPrivateKeyCrtComponentsJson = (RecordsJson + 23) % 128;
            }

            static {
                init$1();
                $10 = 0;
                $11 = 1;
                init$0();
                IccPrivateKeyCrtComponentsJson = 0;
                RecordsJson = 1;
                DigitizedCardProfile = 1889207075;
                valueOf = 1839775687;
                values = 520368608;
                getAid = -1126822310;
                SdkCoreAlternateContactlessPaymentDataImpl = new byte[]{81, -91, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 70, -85, -93, 83, -95, -81, -66, 117, -72, -85, 70, 68, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, 125, 78, 74, 86, -88, com.visa.cbp.getEncExpo.kernelVersion, -2, 43, -22, com.visa.cbp.getEncExpo.onUnminimized, -56, -8, -50, -12, -57, -44, -73, -13, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -56, com.visa.cbp.getEncExpo.kernelVersion, -25, -56, -15, -62, 59, -116, -3, -4, -13, com.visa.cbp.getEncExpo.startTransaction, -8, -61, -83, 70, 92, 80, -90, 70, -86, 93, 69, 92, -87, 89, 89, -80, 126, 89, 81, 73, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -87, -89, -66, 0, 80, -86, 70, 88, -83, 89, 77, -112, 104, 74, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, 70, 33, -44, 60, -36, 32, 36, 4, -12, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, 45, 42, 39, -41, -41, 46, -86, -86, -86, -86, -86, -86, -86, -86};
            }

            static void init$1() {
                $$d = new byte[]{123, 115, -118, 86};
                $$e = 91;
            }

            static void init$0() {
                $$a = new byte[]{com.google.common.base.Ascii.ESC, -102, com.google.common.base.Ascii.SI, 46, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1};
                $$b = 148;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v12, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r1v37, types: [java.lang.reflect.Method] */
            /* JADX WARN: Type inference failed for: r1v53, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r2v37, types: [java.lang.Class] */
            /* JADX WARN: Type inference failed for: r6v16, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r6v198 */
            /* JADX WARN: Type inference failed for: r6v199 */
            /* JADX WARN: Type inference failed for: r6v2 */
            /* JADX WARN: Type inference failed for: r6v20, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r6v21 */
            /* JADX WARN: Type inference failed for: r6v29, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r6v41, types: [java.lang.Class<java.lang.String>] */
            /* JADX WARN: Type inference failed for: r6v50 */
            /* JADX WARN: Type inference failed for: r6v6 */
            /* JADX WARN: Type inference failed for: r6v60, types: [java.lang.Class] */
            /* JADX WARN: Type inference failed for: r6v7 */
            /* JADX WARN: Type inference failed for: r6v73 */
            /* JADX WARN: Type inference failed for: r7v63, types: [java.lang.Class[]] */
            public static java.lang.Object[] writeReplace(android.content.Context context, java.lang.String[] strArr, int i, int i2, int i3) {
                ?? r6;
                int i4;
                int i5;
                java.lang.Object obj;
                byte[][] bArr;
                java.lang.Integer num;
                int i6;
                java.lang.String[] strArr2 = strArr;
                java.lang.Integer num2 = 16;
                int i7 = 0;
                java.lang.Integer num3 = 0;
                int i8 = 1;
                try {
                    if (context == null) {
                        IccPrivateKeyCrtComponentsJson = (RecordsJson + 99) % 128;
                        java.lang.Object[] objArr = {new int[1], new int[1], new int[1]};
                        ((int[]) objArr[0])[0] = i;
                        ((int[]) objArr[1])[0] = i;
                        java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i3), num3, java.lang.Integer.valueOf(((((~((-1044729979) | r2)) | (~((-851762183) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) - 222606044) + (((~((~i) | (-8424453))) | (~(i | (-201392249)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE))};
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                        java.lang.Object obj3 = obj2;
                        if (obj2 == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 50, 2713 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) android.graphics.Color.blue(0));
                            byte b = (byte) (-$$a[14]);
                            byte b2 = (byte) (b - 1);
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            a(b, b2, b2, objArr3);
                            java.lang.reflect.Method method = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method);
                            obj3 = method;
                        }
                        ((int[]) objArr[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr2)).intValue();
                        return objArr;
                    }
                    if (strArr2.length == 0) {
                        java.lang.Object[] objArr4 = {new int[1], new int[1], new int[1]};
                        ((int[]) objArr4[0])[0] = i;
                        ((int[]) objArr4[1])[0] = i ^ 4;
                        int i9 = ~i;
                        java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf((((~(i9 | (-1665857055))) | 1648410652) * 98) + 267476422 + (((~(i9 | (-230635107))) | (-1665857055) | (~(i | 230635106))) * (-49)) + (((~(i | (-1665857055))) | (-1879045759)) * 49))};
                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                        java.lang.Object obj5 = obj4;
                        if (obj4 == null) {
                            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 2713 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16));
                            byte b3 = (byte) (-$$a[14]);
                            byte b4 = (byte) (b3 - 1);
                            java.lang.Object[] objArr6 = new java.lang.Object[1];
                            a(b3, b4, b4, objArr6);
                            java.lang.reflect.Method method2 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method2);
                            obj5 = method2;
                        }
                        ((int[]) objArr4[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr5)).intValue();
                        return objArr4;
                    }
                    int length = strArr2.length;
                    java.nio.LongBuffer[] longBufferArr = new java.nio.LongBuffer[length];
                    int i10 = 0;
                    while (i10 < strArr2.length) {
                        java.lang.String lowerCase = strArr2[i10].toLowerCase();
                        java.lang.Object[] objArr7 = new java.lang.Object[i8];
                        b(false, "\u0000", (android.util.TypedValue.complexToFloat(i7) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(i7) == 0.0f ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, android.view.Gravity.getAbsoluteGravity(i7, i7) + 1, (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr7);
                        java.lang.String replaceAll = lowerCase.replaceAll(((java.lang.String) objArr7[i7]).intern(), "");
                        java.lang.Integer num4 = num3;
                        long longValue = new java.math.BigInteger(replaceAll.substring(16, 32), 16).longValue();
                        long longValue2 = new java.math.BigInteger(replaceAll.substring(0, 16), 16).longValue();
                        int length2 = replaceAll.length();
                        if (length2 == 32) {
                            num = num2;
                            i6 = length;
                            longBufferArr[i10] = java.nio.LongBuffer.allocate(2).put(longValue2).put(longValue);
                        } else {
                            if (length2 != 64) {
                                java.lang.Object[] objArr8 = {new int[1], new int[1], new int[1]};
                                ((int[]) objArr8[0])[0] = i;
                                ((int[]) objArr8[1])[0] = i ^ 3;
                                java.lang.Object[] objArr9 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf((((~((-285880578) | (~i))) | (~(1610611583 | i))) * (-272)) + 344423904 + (((~((-369046300) | i)) | 83165722) * (-272)) + (((~(i | 369046299)) | 1527445861) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE))};
                                java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                java.lang.Object obj7 = obj6;
                                if (obj6 == null) {
                                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.getOffsetBefore("", 0), android.widget.ExpandableListView.getPackedPositionChild(0L) + 2714, (char) android.widget.ExpandableListView.getPackedPositionGroup(0L));
                                    byte b5 = (byte) (-$$a[14]);
                                    byte b6 = (byte) (b5 - 1);
                                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                                    a(b5, b6, b6, objArr10);
                                    java.lang.reflect.Method method3 = cls3.getMethod((java.lang.String) objArr10[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method3);
                                    obj7 = method3;
                                }
                                ((int[]) objArr8[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj7).invoke(null, objArr9)).intValue();
                                return objArr8;
                            }
                            num = num2;
                            i6 = length;
                            longBufferArr[i10] = java.nio.LongBuffer.allocate(4).put(longValue2).put(longValue).put(new java.math.BigInteger(replaceAll.substring(32, 48), 16).longValue()).put(new java.math.BigInteger(replaceAll.substring(48), 16).longValue());
                        }
                        i10++;
                        strArr2 = strArr;
                        length = i6;
                        num3 = num4;
                        num2 = num;
                        i7 = 0;
                        i8 = 1;
                    }
                    java.lang.Integer num5 = num2;
                    java.lang.Integer num6 = num3;
                    int i11 = length;
                    try {
                        if (context == null) {
                            java.lang.Object[] objArr11 = {new int[1], new int[1], new int[1]};
                            ((int[]) objArr11[0])[0] = i;
                            ((int[]) objArr11[1])[0] = i;
                            int i12 = ~i;
                            try {
                                java.lang.Object[] objArr12 = {java.lang.Integer.valueOf(i3), num6, java.lang.Integer.valueOf((((1390553792 | r5) * 764) - 1166001280) + (((~(i12 | 1390553792)) | 201851136) * (-1528)) + ((1288317696 | (~(505938368 | i12))) * 764))};
                                java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                java.lang.Object obj9 = obj8;
                                if (obj8 == null) {
                                    java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), 2713 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())));
                                    byte b7 = (byte) (-$$a[14]);
                                    byte b8 = (byte) (b7 - 1);
                                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                                    a(b7, b8, b8, objArr13);
                                    java.lang.reflect.Method method4 = cls4.getMethod((java.lang.String) objArr13[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method4);
                                    obj9 = method4;
                                }
                                ((int[]) objArr11[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj9).invoke(null, objArr12)).intValue();
                                return objArr11;
                            } catch (java.lang.Throwable th) {
                                java.lang.Throwable cause = th.getCause();
                                if (cause != null) {
                                    throw cause;
                                }
                                throw th;
                            }
                        }
                        int i13 = i11;
                        byte[][] bArr2 = new byte[i13][];
                        int i14 = 0;
                        int i15 = 0;
                        while (i14 < i13) {
                            java.nio.LongBuffer longBuffer = longBufferArr[i14];
                            if (longBuffer.capacity() == 4) {
                                RecordsJson = (IccPrivateKeyCrtComponentsJson + 57) % 128;
                                java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(32);
                                java.nio.LongBuffer asLongBuffer = allocate.asLongBuffer();
                                long[] array = longBuffer.array();
                                int length3 = array.length;
                                int i16 = 0;
                                while (i16 < length3) {
                                    asLongBuffer.put(array[i16]);
                                    i16++;
                                    bArr2 = bArr2;
                                }
                                bArr = bArr2;
                                int i17 = i15 + 1;
                                bArr[i15] = allocate.array();
                                i15 = i17;
                            } else {
                                bArr = bArr2;
                            }
                            i14++;
                            bArr2 = bArr;
                        }
                        byte[][] bArr3 = bArr2;
                        if (i15 > 0) {
                            RecordsJson = (IccPrivateKeyCrtComponentsJson + 75) % 128;
                            int currentTimeMillis = ((int) java.lang.System.currentTimeMillis()) ^ 343337308;
                            try {
                                java.lang.Object[] objArr14 = {java.lang.Integer.valueOf(i ^ currentTimeMillis), bArr3, java.lang.Integer.valueOf(i15)};
                                java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(336776035);
                                java.lang.Object obj11 = obj10;
                                if (obj10 == null) {
                                    java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.text.TextUtils.indexOf("", ""), 429 - android.view.KeyEvent.getDeadChar(0, 0), (char) ((android.view.ViewConfiguration.getTapTimeout() >> 16) + 31610));
                                    byte b9 = $$a[14];
                                    byte b10 = (byte) (b9 + 1);
                                    byte b11 = (byte) (-b9);
                                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                                    a(b10, b11, b11, objArr15);
                                    java.lang.reflect.Method method5 = cls5.getMethod((java.lang.String) objArr15[0], java.lang.Integer.TYPE, byte[][].class, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(336776035, method5);
                                    obj11 = method5;
                                }
                                long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) obj11).invoke(null, objArr14)).longValue();
                                long j = ~longValue3;
                                long j2 = ~(i | longValue3);
                                long j3 = ((-195) * longValue3) + 227548582053L + (((~(j | (-581965683))) | j2) * (-196)) + (((-581965683) | longValue3) * 392) + (((~(581965682 | j)) | j2) * 196) + 1515866390;
                                int i18 = ~i;
                                int i19 = ((((int) j3) & (((((-1342210081) | i18) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + 778093437) + (((~((-1389550309) | i18)) | (-1342545954)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE))) | (((int) (j3 >> 32)) & (((((((~((-1290562250) | i18)) | (-146664162)) | (~(1290562249 | i))) * (-564)) - 1944313654) + ((~((-1146913) | i)) * 1128)) + (((~((-146664162) | i18)) | (-1291709162)) * 564)))) ^ currentTimeMillis;
                                if ((i2 & 1) == 1) {
                                    int i20 = (RecordsJson + 11) % 128;
                                    IccPrivateKeyCrtComponentsJson = i20;
                                    if ((i19 ^ i) == 15) {
                                        RecordsJson = (i20 + 89) % 128;
                                        java.lang.Object[] objArr16 = {new int[1], new int[1], new int[1]};
                                        ((int[]) objArr16[0])[0] = i;
                                        ((int[]) objArr16[1])[0] = i19;
                                        try {
                                            java.lang.Object[] objArr17 = {java.lang.Integer.valueOf(i3), num5, java.lang.Integer.valueOf(((((-241730057) | i) * (-381)) - 8498372) + (((~(1368479094 | i18)) | (-1323926141)) * 381) + 1904838120)};
                                            java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            java.lang.Object obj13 = obj12;
                                            if (obj12 == null) {
                                                java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionChild(0L) + 51, ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 2714, (char) android.view.View.combineMeasuredStates(0, 0));
                                                byte b12 = (byte) (-$$a[14]);
                                                byte b13 = (byte) (b12 - 1);
                                                java.lang.Object[] objArr18 = new java.lang.Object[1];
                                                a(b12, b13, b13, objArr18);
                                                java.lang.reflect.Method method6 = cls6.getMethod((java.lang.String) objArr18[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method6);
                                                obj13 = method6;
                                            }
                                            ((int[]) objArr16[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj13).invoke(null, objArr17)).intValue();
                                            return objArr16;
                                        } catch (java.lang.Throwable th2) {
                                            java.lang.Throwable cause2 = th2.getCause();
                                            if (cause2 != null) {
                                                throw cause2;
                                            }
                                            throw th2;
                                        }
                                    }
                                }
                                int i21 = i19 ^ i;
                                if (i21 == 0) {
                                    IccPrivateKeyCrtComponentsJson = (RecordsJson + 57) % 128;
                                    java.lang.Object[] objArr19 = {new int[1], new int[1], new int[1]};
                                    ((int[]) objArr19[0])[0] = i;
                                    ((int[]) objArr19[1])[0] = i19;
                                    try {
                                        java.lang.Object[] objArr20 = {java.lang.Integer.valueOf(i3), num6, java.lang.Integer.valueOf((((~(1895426942 | i)) * (-301)) - 1339754284) + (((~((-1349536595) | i)) | (~(546955566 | i18))) * (-301)) + (((~((-546955567) | i)) | (-1349536595)) * 301))};
                                        java.lang.Object obj14 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        java.lang.Object obj15 = obj14;
                                        if (obj14 == null) {
                                            java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), android.text.TextUtils.indexOf("", "", 0) + 2713, (char) android.view.View.resolveSizeAndState(0, 0, 0));
                                            byte b14 = (byte) (-$$a[14]);
                                            byte b15 = (byte) (b14 - 1);
                                            java.lang.Object[] objArr21 = new java.lang.Object[1];
                                            a(b14, b15, b15, objArr21);
                                            java.lang.reflect.Method method7 = cls7.getMethod((java.lang.String) objArr21[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method7);
                                            obj15 = method7;
                                        }
                                        ((int[]) objArr19[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj15).invoke(null, objArr20)).intValue();
                                        return objArr19;
                                    } catch (java.lang.Throwable th3) {
                                        java.lang.Throwable cause3 = th3.getCause();
                                        if (cause3 != null) {
                                            throw cause3;
                                        }
                                        throw th3;
                                    }
                                }
                                if (i21 == 11) {
                                    java.lang.Object[] objArr22 = {new int[1], new int[1], new int[1]};
                                    ((int[]) objArr22[0])[0] = i;
                                    ((int[]) objArr22[1])[0] = i19;
                                    int i22 = ~((-937498140) | i18);
                                    try {
                                        java.lang.Object[] objArr23 = {java.lang.Integer.valueOf(i3), num5, java.lang.Integer.valueOf(((134742116 | i22 | (~(937498139 | i))) * (-338)) + 194687112 + ((i22 | (~(1072240255 | i))) * 338))};
                                        java.lang.Object obj16 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        java.lang.Object obj17 = obj16;
                                        if (obj16 == null) {
                                            java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), 2713 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) (android.os.Process.getGidForName("") + 1));
                                            byte b16 = (byte) (-$$a[14]);
                                            byte b17 = (byte) (b16 - 1);
                                            java.lang.Object[] objArr24 = new java.lang.Object[1];
                                            a(b16, b17, b17, objArr24);
                                            java.lang.reflect.Method method8 = cls8.getMethod((java.lang.String) objArr24[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method8);
                                            obj17 = method8;
                                        }
                                        ((int[]) objArr22[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj17).invoke(null, objArr23)).intValue();
                                        return objArr22;
                                    } catch (java.lang.Throwable th4) {
                                        java.lang.Throwable cause4 = th4.getCause();
                                        if (cause4 != null) {
                                            throw cause4;
                                        }
                                        throw th4;
                                    }
                                }
                            } catch (java.lang.Throwable th5) {
                                java.lang.Throwable cause5 = th5.getCause();
                                if (cause5 != null) {
                                    throw cause5;
                                }
                                throw th5;
                            }
                        }
                        r6 = 0;
                        try {
                            try {
                                java.lang.Object[] objArr25 = new java.lang.Object[1];
                                b(false, "\uffff\uffc9\ufffe\n\t\u000f\u0000\t\u000f\uffc9\uffde\n\t\u000f\u0000\u0013\u000f￼\t\uffff\r\n\u0004", android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, 17 - (android.os.Process.myPid() >> 22), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 22, objArr25);
                                java.lang.Class<?> cls9 = java.lang.Class.forName(((java.lang.String) objArr25[0]).intern());
                                java.lang.Object[] objArr26 = new java.lang.Object[1];
                                b(true, "\u0007\uffff�￬\u0010\u0001\u0003\u000e\u0001\u0003�\n�￩\u0001\u0003�", 166 - android.view.View.MeasureSpec.getSize(0), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 7, (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 16, objArr26);
                                r6 = cls9.getMethod(((java.lang.String) objArr26[0]).intern(), null).invoke(context, null);
                                try {
                                    java.lang.Object[] objArr27 = new java.lang.Object[1];
                                    b(false, "\uffff\uffc9\ufffe\n\t\u000f\u0000\t\u000f\uffc9\uffde\n\t\u000f\u0000\u0013\u000f￼\t\uffff\r\n\u0004", 167 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), 17 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 24, objArr27);
                                    java.lang.Class<?> cls10 = java.lang.Class.forName(((java.lang.String) objArr27[0]).intern());
                                    try {
                                        java.lang.Object[] objArr28 = new java.lang.Object[1];
                                        c((-1923911278) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 60, (byte) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), android.view.View.resolveSizeAndState(0, 0, 0) + 1546502263, (short) ((-3) - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)), objArr28);
                                        java.lang.Object invoke = cls10.getMethod(((java.lang.String) objArr28[0]).intern(), null).invoke(context, null);
                                        IccPrivateKeyCrtComponentsJson = (RecordsJson + 5) % 128;
                                        try {
                                            java.lang.Object[] objArr29 = new java.lang.Object[1];
                                            b(true, "￫\u0003\u0005\uffff\t\u0001\uffff￮ￌ\u000b\u000eￌ\u0012\f\u0003\u0012\f\r\u0001ￌ\u0002\u0007\r\u0010\u0002\f\uffff\u0010\u0003\u0005\uffff\f\uffff", 163 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 27, (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 33, objArr29);
                                            java.lang.Class<?> cls11 = java.lang.Class.forName(((java.lang.String) objArr29[0]).intern());
                                            java.lang.Object[] objArr30 = new java.lang.Object[1];
                                            b(true, "�\u0007\uffff�￬\u0010\u0001\u0003\u000b\u0002\n￥\u0001\u0003", android.view.View.getDefaultSize(0, 0) + 166, (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 8, 14 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr30);
                                            java.lang.Object invoke2 = cls11.getMethod(((java.lang.String) objArr30[0]).intern(), java.lang.String.class, java.lang.Integer.TYPE).invoke(r6, invoke, 64);
                                            int i23 = 0;
                                            while (i23 < i13) {
                                                try {
                                                    java.nio.LongBuffer longBuffer2 = longBufferArr[i23];
                                                    if (longBuffer2.capacity() == 4) {
                                                        i4 = i13;
                                                        java.lang.Object[] objArr31 = new java.lang.Object[1];
                                                        c((-1923911263) - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), android.widget.ExpandableListView.getPackedPositionGroup(0L) - 67, (byte) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1546502243, (short) (android.view.KeyEvent.keyCodeFromString("") + 21), objArr31);
                                                        obj = objArr31[0];
                                                        i5 = 0;
                                                    } else {
                                                        i4 = i13;
                                                        java.lang.Object[] objArr32 = new java.lang.Object[1];
                                                        c((-1923911259) - android.view.MotionEvent.axisFromString(""), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) - 71, (byte) android.view.View.MeasureSpec.getMode(0), 1546502237 - android.graphics.Color.argb(0, 0, 0, 0), (short) ((-11) - (android.view.ViewConfiguration.getScrollBarSize() >> 8)), objArr32);
                                                        i5 = 0;
                                                        obj = objArr32[0];
                                                    }
                                                    java.lang.String intern = ((java.lang.String) obj).intern();
                                                    java.lang.Object[] objArr33 = new java.lang.Object[1];
                                                    c((-1923911256) - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) - 44, (byte) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i5) + 1), 1546502257 - android.widget.ExpandableListView.getPackedPositionType(0L), (short) ((-92) - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)), objArr33);
                                                    java.lang.Class<?> cls12 = java.lang.Class.forName(((java.lang.String) objArr33[0]).intern());
                                                    java.lang.Object[] objArr34 = new java.lang.Object[1];
                                                    c(android.graphics.Color.green(0) - 1923911227, (-65) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (byte) android.view.KeyEvent.normalizeMetaState(0), 1546502275 - android.view.KeyEvent.keyCodeFromString(""), (short) (android.text.TextUtils.getOffsetBefore("", 0) + 7), objArr34);
                                                    java.lang.Object[] objArr35 = (java.lang.Object[]) cls12.getField(((java.lang.String) objArr34[0]).intern()).get(invoke2);
                                                    int length4 = objArr35.length;
                                                    int i24 = 0;
                                                    r6 = intern;
                                                    while (i24 < length4) {
                                                        java.lang.Object obj18 = objArr35[i24];
                                                        try {
                                                            java.lang.Object[] objArr36 = {r6};
                                                            java.lang.Object obj19 = invoke2;
                                                            java.lang.Object[] objArr37 = objArr35;
                                                            java.lang.Object obj20 = r6;
                                                            int i25 = length4;
                                                            java.lang.Object[] objArr38 = new java.lang.Object[1];
                                                            c((-1923911217) - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), android.view.View.MeasureSpec.getMode(0) - 47, (byte) android.graphics.drawable.Drawable.resolveOpacity(0, 0), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 1546502266, (short) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 10), objArr38);
                                                            ?? cls13 = java.lang.Class.forName(((java.lang.String) objArr38[0]).intern());
                                                            long packedPositionForGroup = android.widget.ExpandableListView.getPackedPositionForGroup(0);
                                                            int touchSlop = android.view.ViewConfiguration.getTouchSlop();
                                                            int i26 = i23;
                                                            java.nio.LongBuffer[] longBufferArr2 = longBufferArr;
                                                            java.lang.Object[] objArr39 = new java.lang.Object[1];
                                                            c((packedPositionForGroup > 0L ? 1 : (packedPositionForGroup == 0L ? 0 : -1)) - 1923911192, (touchSlop >> 8) - 63, (byte) android.text.TextUtils.getCapsMode("", 0, 0), 1546502263 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (short) (119 - android.graphics.Color.argb(0, 0, 0, 0)), objArr39);
                                                            r6 = java.lang.String.class;
                                                            java.lang.Object invoke3 = cls13.getMethod(((java.lang.String) objArr39[0]).intern(), new java.lang.Class[]{r6}).invoke(null, objArr36);
                                                            IccPrivateKeyCrtComponentsJson = (RecordsJson + 61) % 128;
                                                            try {
                                                                java.lang.Object[] objArr40 = new java.lang.Object[1];
                                                                b(true, "\u000b\u000e\u0000\n�\u0001\u000e\u0011\u0010�\n\u0003\u0005\uffefￊ\t\fￊ\u0010\n\u0001\u0010\n\u000b\uffffￊ\u0000\u0005", (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 166, 5 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), android.view.View.combineMeasuredStates(0, 0) + 28, objArr40);
                                                                java.lang.Class<?> cls14 = java.lang.Class.forName(((java.lang.String) objArr40[0]).intern());
                                                                java.lang.Object[] objArr41 = new java.lang.Object[1];
                                                                b(false, "ￚ\u000b\u000b\ufffa\u0012\r\bￛ\u0012\r\ufffe", 168 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 6 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 11 - android.view.Gravity.getAbsoluteGravity(0, 0), objArr41);
                                                                r6 = 0;
                                                                r6 = 0;
                                                                java.lang.Object invoke4 = cls14.getMethod(((java.lang.String) objArr41[0]).intern(), null).invoke(obj18, null);
                                                                RecordsJson = (IccPrivateKeyCrtComponentsJson + 119) % 128;
                                                                try {
                                                                    java.lang.Object[] objArr42 = new java.lang.Object[1];
                                                                    c(((android.os.Process.getThreadPriority(0) + 20) >> 6) - 1923911218, (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) - 47, (byte) android.view.View.MeasureSpec.getMode(0), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1546502265, (short) ((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 11), objArr42);
                                                                    r6 = java.lang.Class.forName(((java.lang.String) objArr42[0]).intern());
                                                                    java.lang.Object[] objArr43 = new java.lang.Object[1];
                                                                    c(android.view.View.resolveSize(0, 0) - 1923911182, (-68) - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (byte) android.text.TextUtils.getTrimmedLength(""), android.text.TextUtils.indexOf("", "", 0) + 1546502260, (short) ((-126) - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), objArr43);
                                                                    if (java.nio.ByteBuffer.wrap((byte[]) r6.getMethod(((java.lang.String) objArr43[0]).intern(), byte[].class).invoke(invoke3, invoke4)).asLongBuffer().equals(longBuffer2.rewind())) {
                                                                        IccPrivateKeyCrtComponentsJson = (RecordsJson + 85) % 128;
                                                                        java.lang.Object[] objArr44 = {new int[1], new int[1], new int[1]};
                                                                        ((int[]) objArr44[0])[0] = i;
                                                                        ((int[]) objArr44[1])[0] = i;
                                                                        int i27 = ~i;
                                                                        try {
                                                                            java.lang.Object[] objArr45 = {java.lang.Integer.valueOf(i3), num6, java.lang.Integer.valueOf(((972417476 | i) * (-50)) + 18664464 + (((~((-823410821) | i)) | (~((-100663865) | i27))) * 50) + (((~(i27 | (-924074685))) | 100663864 | (~(972417476 | i27))) * 50))};
                                                                            try {
                                                                                java.lang.Object obj21 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                                java.lang.Object obj22 = obj21;
                                                                                if (obj21 == null) {
                                                                                    java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.getDefaultSize(0, 0), (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2712, (char) android.view.View.resolveSizeAndState(0, 0, 0));
                                                                                    byte b18 = (byte) (-$$a[14]);
                                                                                    byte b19 = (byte) (b18 - 1);
                                                                                    java.lang.Object[] objArr46 = new java.lang.Object[1];
                                                                                    a(b18, b19, b19, objArr46);
                                                                                    java.lang.reflect.Method method9 = cls15.getMethod((java.lang.String) objArr46[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method9);
                                                                                    obj22 = method9;
                                                                                }
                                                                                ((int[]) objArr44[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj22).invoke(null, objArr45)).intValue();
                                                                                return objArr44;
                                                                            } catch (java.lang.Throwable th6) {
                                                                                th = th6;
                                                                                java.lang.Throwable th7 = th;
                                                                                java.lang.Throwable cause6 = th7.getCause();
                                                                                if (cause6 != null) {
                                                                                    throw cause6;
                                                                                }
                                                                                throw th7;
                                                                            }
                                                                        } catch (java.lang.Throwable th8) {
                                                                            th = th8;
                                                                        }
                                                                    } else {
                                                                        i24++;
                                                                        invoke2 = obj19;
                                                                        objArr35 = objArr37;
                                                                        longBufferArr = longBufferArr2;
                                                                        r6 = obj20;
                                                                        length4 = i25;
                                                                        i23 = i26;
                                                                    }
                                                                } catch (java.lang.Throwable th9) {
                                                                    java.lang.Throwable cause7 = th9.getCause();
                                                                    if (cause7 != null) {
                                                                        throw cause7;
                                                                    }
                                                                    throw th9;
                                                                }
                                                            } catch (java.lang.Throwable th10) {
                                                                java.lang.Throwable cause8 = th10.getCause();
                                                                if (cause8 != null) {
                                                                    throw cause8;
                                                                }
                                                                throw th10;
                                                            }
                                                        } catch (java.lang.Throwable th11) {
                                                            java.lang.Throwable cause9 = th11.getCause();
                                                            if (cause9 != null) {
                                                                throw cause9;
                                                            }
                                                            throw th11;
                                                        }
                                                    }
                                                    i23++;
                                                    i13 = i4;
                                                } catch (java.lang.Throwable unused) {
                                                    r6 = -1347122530;
                                                }
                                            }
                                            r6 = -1347122530;
                                            java.lang.Object[] objArr47 = {new int[1], new int[1], new int[1]};
                                            ((int[]) objArr47[0])[0] = i;
                                            ((int[]) objArr47[1])[0] = i ^ 1;
                                            try {
                                                java.lang.Object[] objArr48 = {java.lang.Integer.valueOf(i3), num5, java.lang.Integer.valueOf((((-1860242047) | i) * 376) + 1780011136 + (((~((~i) | 695507263)) | (-1878367104)) * (-376)) + (((~((-695507264) | i)) | 1200984897) * 376))};
                                                java.lang.Object obj23 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                java.lang.Object obj24 = obj23;
                                                if (obj23 == null) {
                                                    java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), 2712 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1));
                                                    byte b20 = (byte) (-$$a[14]);
                                                    byte b21 = (byte) (b20 - 1);
                                                    java.lang.Object[] objArr49 = new java.lang.Object[1];
                                                    a(b20, b21, b21, objArr49);
                                                    java.lang.reflect.Method method10 = cls16.getMethod((java.lang.String) objArr49[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method10);
                                                    obj24 = method10;
                                                }
                                                ((int[]) objArr47[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj24).invoke(null, objArr48)).intValue();
                                                return objArr47;
                                            } catch (java.lang.Throwable th12) {
                                                java.lang.Throwable cause10 = th12.getCause();
                                                if (cause10 != null) {
                                                    throw cause10;
                                                }
                                                throw th12;
                                            }
                                        } catch (java.lang.Throwable th13) {
                                            java.lang.Throwable cause11 = th13.getCause();
                                            if (cause11 != null) {
                                                throw cause11;
                                            }
                                            throw th13;
                                        }
                                    } catch (java.lang.Throwable th14) {
                                        th = th14;
                                        java.lang.Throwable th15 = th;
                                        java.lang.Throwable cause12 = th15.getCause();
                                        if (cause12 != null) {
                                            throw cause12;
                                        }
                                        throw th15;
                                    }
                                } catch (java.lang.Throwable th16) {
                                    th = th16;
                                }
                            } catch (java.lang.Throwable th17) {
                                java.lang.Throwable cause13 = th17.getCause();
                                if (cause13 != null) {
                                    throw cause13;
                                }
                                throw th17;
                            }
                        } catch (java.lang.Throwable unused2) {
                        }
                    } catch (java.lang.Throwable unused3) {
                        r6 = -1347122530;
                    }
                    r6 = -1347122530;
                    java.lang.Object[] objArr50 = {new int[1], new int[1], new int[1]};
                    ((int[]) objArr50[0])[0] = i;
                    ((int[]) objArr50[1])[0] = i ^ 2;
                    java.lang.Object[] objArr51 = {java.lang.Integer.valueOf(i3), num5, java.lang.Integer.valueOf(((((-67668601) | r1) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) - 1578733440) + (((~((~i) | 987844999)) | (-214535039)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE))};
                    java.lang.Object obj25 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r6);
                    java.lang.Object obj26 = obj25;
                    if (obj25 == null) {
                        java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 49, (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2712, (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16));
                        byte b22 = (byte) (-$$a[14]);
                        byte b23 = (byte) (b22 - 1);
                        java.lang.Object[] objArr52 = new java.lang.Object[1];
                        a(b22, b23, b23, objArr52);
                        java.lang.reflect.Method method11 = cls17.getMethod((java.lang.String) objArr52[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(r6, method11);
                        obj26 = method11;
                    }
                    ((int[]) objArr50[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj26).invoke(null, objArr51)).intValue();
                    return objArr50;
                } catch (java.lang.Throwable th18) {
                    java.lang.Throwable cause14 = th18.getCause();
                    if (cause14 != null) {
                        throw cause14;
                    }
                    throw th18;
                }
            }
        }).start();
        int i = getCvrMaskAnd + 17;
        getGpoResponse = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private void valueOf(final com.payair.hce.replenishToken replenishtoken, final java.lang.Exception exc) {
        new java.lang.Thread(new java.lang.Runnable() { // from class: com.payair.hce.ContactlessPaymentData.2
            private static int DigitizedCardProfile = 0;
            private static int IccPrivateKeyCrtComponentsJson = 1;
            private static char[] values = {16722, 16632, 16608, 16636, 16636, 16585, 16585, 16615, 16639, 16630, 16635, 16611, 16616, 16587, 16576, 16630, 16639, 16611, 16635, 16638, 16617, 16609, 16632, 16637, 16608, 16584, 16585, 16615, 16639, 16637, 16612, 16592};

            @Override // java.lang.Runnable
            public final void run() {
                DigitizedCardProfile = (IccPrivateKeyCrtComponentsJson + 111) % 128;
                com.payair.hce.ContactlessPaymentData.values(com.payair.hce.ContactlessPaymentData.this);
                com.payair.hce.ContactlessPaymentData.AlternateContactlessPaymentDataJson(com.payair.hce.ContactlessPaymentData.this).writeReplace(replenishtoken, exc);
                int i = DigitizedCardProfile + 23;
                IccPrivateKeyCrtComponentsJson = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
            }
        }).start();
        int i = getGpoResponse + 59;
        getCvrMaskAnd = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    private void AlternateContactlessPaymentDataJson(final com.payair.hce.onReplenishCompleted onreplenishcompleted) {
        new java.lang.Thread(new java.lang.Runnable() { // from class: com.payair.hce.ContactlessPaymentData.1
            private static int IccPrivateKeyCrtComponentsJson = 1;
            private static int valueOf;
            private static char[] DigitizedCardProfile = {12326, 12324, 12350, 12394, 12346, 12325, 12323, 12328, 12329, 12312, 12345, 12348, 12335, 12327, 12331, 12334};
            private static char values = 1492;

            @Override // java.lang.Runnable
            public final void run() {
                int i;
                int i2 = IccPrivateKeyCrtComponentsJson + 119;
                valueOf = i2 % 128;
                if (i2 % 2 != 0) {
                    com.payair.hce.ContactlessPaymentData.values(com.payair.hce.ContactlessPaymentData.this);
                    android.view.ViewConfiguration.getWindowTouchSlop();
                    i = 1;
                } else {
                    com.payair.hce.ContactlessPaymentData.values(com.payair.hce.ContactlessPaymentData.this);
                    android.view.ViewConfiguration.getWindowTouchSlop();
                    i = 0;
                }
                android.graphics.ImageFormat.getBitsPerPixel(i);
                com.payair.hce.ContactlessPaymentData.AlternateContactlessPaymentDataJson(com.payair.hce.ContactlessPaymentData.this).DigitizedCardProfile(onreplenishcompleted);
                valueOf = (IccPrivateKeyCrtComponentsJson + 77) % 128;
            }
        }).start();
        int i = getGpoResponse + 95;
        getCvrMaskAnd = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getCvrMaskAnd = 0;
        getGpoResponse = 1;
        getAid = 1263759066225628708L;
        getPaymentFci = -804334044;
        SdkCoreBusinessLogicModuleImpl = (char) 2357;
    }

    static void init$0() {
        $$a = new byte[]{41, 86, 91, 57};
        $$b = 140;
    }
}
