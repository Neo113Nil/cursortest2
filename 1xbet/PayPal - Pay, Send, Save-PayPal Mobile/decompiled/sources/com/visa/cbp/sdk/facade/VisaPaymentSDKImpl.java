package com.visa.cbp.sdk.facade;

/* loaded from: classes5.dex */
public final class VisaPaymentSDKImpl extends com.visa.cbp.getEmail {
    public static final byte[] $$v = null;
    public static final int $$w = 0;
    private static int $10;
    private static int $11;
    private static long ConfirmReplenishRequest;
    private static int ReplenishAckRequest;
    private static final java.lang.String TAG;
    private static int getTvls;
    private static volatile com.visa.cbp.sdk.facade.VisaPaymentSDKImpl instance;
    private static boolean preprocess;
    private static boolean replenish;
    private static int setTokenInfo;
    private static char valueOf;

    private static void o(byte b, byte b2, short s, java.lang.Object[] objArr) {
        int i = b + 4;
        byte[] bArr = $$v;
        int i2 = b2 * 2;
        int i3 = (s * 2) + 67;
        byte[] bArr2 = new byte[i2 + 1];
        int i4 = -1;
        if (bArr == null) {
            i4 = -1;
            i3 = (-i) + i3;
            i = i;
        }
        while (true) {
            int i5 = i + 1;
            int i6 = i4 + 1;
            bArr2[i6] = (byte) i3;
            if (i6 == i2) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i4 = i6;
            i3 = (-bArr[i5]) + i3;
            i = i5;
        }
    }

    static /* synthetic */ void access$200(android.content.Context context, boolean z) {
        int i = getTvls + 83;
        setTokenInfo = i % 128;
        initialize(context, z);
        if (i % 2 != 0) {
            throw null;
        }
    }

    static /* synthetic */ void access$300(android.content.Context context, boolean z, com.visa.cbp.sdk.facade.DASService.LoginCallback loginCallback) {
        int i = getTvls + 73;
        setTokenInfo = i % 128;
        initialize(context, z, loginCallback);
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        setTokenInfo = 0;
        getTvls = 1;
        getTvls();
        TAG = "VisaPaymentSDKImpl";
        setTokenInfo = (getTvls + 51) % 128;
    }

    private VisaPaymentSDKImpl() {
        preprocess = true;
        replenish = true;
    }

    public VisaPaymentSDKImpl(com.visa.cbp.sdk.facade.VisaPaymentSDKImpl.SDKBuilder sDKBuilder) {
        preprocess = sDKBuilder.preprocess;
        replenish = sDKBuilder.replenish;
    }

    public static void initialize(android.content.Context context) {
        boolean z;
        int i = setTokenInfo + 13;
        getTvls = i % 128;
        if (i % 2 == 0) {
            com.visa.cbp.setVtsCerts.getTvls(TAG, "initialize environment: Flow-2");
            z = true;
        } else {
            com.visa.cbp.setVtsCerts.getTvls(TAG, "initialize environment: Flow-2");
            z = false;
        }
        com.visa.cbp.setEmail.initialize(context, z);
    }

    public static void initialize(final android.content.Context context, final com.visa.cbp.sdk.facade.DASService.VerifyAppsCallback verifyAppsCallback) {
        getTvls = (setTokenInfo + 79) % 128;
        com.visa.cbp.setVtsCerts.getTvls(TAG, "initialize environment: Flow-2");
        if (verifyAppsCallback == null) {
            com.visa.cbp.setEmail.initialize(context, true);
        } else {
            verifyAppsInit(context, new com.visa.cbp.sdk.facade.DASService.VerifyAppsCallback() { // from class: com.visa.cbp.sdk.facade.VisaPaymentSDKImpl.1
                @Override // com.visa.cbp.sdk.facade.DASService.VerifyAppsCallback
                public void onResult(int i) {
                    com.visa.cbp.sdk.facade.VisaPaymentSDKImpl.access$200(context, true);
                    verifyAppsCallback.onResult(i);
                }

                @Override // com.visa.cbp.sdk.facade.DASService.VerifyAppsCallback
                public void onError(int i, java.lang.Exception exc) {
                    verifyAppsCallback.onError(i, exc);
                }
            });
            getTvls = (setTokenInfo + 13) % 128;
        }
    }

    public static void initialize(android.content.Context context, com.visa.cbp.sdk.facade.DASService.VerifyAppsCallback verifyAppsCallback, com.visa.cbp.sdk.facade.DASService.LoginCallback loginCallback) {
        getTvls = (setTokenInfo + 87) % 128;
        com.visa.cbp.setVtsCerts.getTvls(TAG, "initialize environment: Flow-2c");
        initialize(context, true, verifyAppsCallback, loginCallback);
        int i = setTokenInfo + 89;
        getTvls = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static void initialize(final android.content.Context context, final boolean z, final com.visa.cbp.sdk.facade.DASService.VerifyAppsCallback verifyAppsCallback, final com.visa.cbp.sdk.facade.DASService.LoginCallback loginCallback) {
        setTokenInfo = (getTvls + 111) % 128;
        com.visa.cbp.setVtsCerts.getTvls(TAG, "initialize environment: Flow-2c");
        if (verifyAppsCallback == null) {
            com.visa.cbp.setEmail.initialize(context, true, loginCallback);
        } else {
            verifyAppsInit(context, new com.visa.cbp.sdk.facade.DASService.VerifyAppsCallback() { // from class: com.visa.cbp.sdk.facade.VisaPaymentSDKImpl.2
                @Override // com.visa.cbp.sdk.facade.DASService.VerifyAppsCallback
                public void onResult(int i) {
                    com.visa.cbp.sdk.facade.VisaPaymentSDKImpl.access$300(context, z, loginCallback);
                    verifyAppsCallback.onResult(i);
                }

                @Override // com.visa.cbp.sdk.facade.DASService.VerifyAppsCallback
                public void onError(int i, java.lang.Exception exc) {
                    verifyAppsCallback.onError(i, exc);
                }
            });
            setTokenInfo = (getTvls + 107) % 128;
        }
    }

    public static com.visa.cbp.sdk.facade.VisaPaymentSDK getInstance(android.content.Context context) {
        com.visa.cbp.sdk.facade.VisaPaymentSDK visaPaymentSDKImpl;
        synchronized (com.visa.cbp.sdk.facade.VisaPaymentSDKImpl.class) {
            int i = getTvls + 69;
            setTokenInfo = i % 128;
            if (i % 2 != 0) {
                getInstance(context, "", (com.visa.cbp.sdk.facade.activeaccountmanagement.ReplenishCallbackInterface) null);
                throw new java.lang.NullPointerException();
            }
            visaPaymentSDKImpl = getInstance(context, "", (com.visa.cbp.sdk.facade.activeaccountmanagement.ReplenishCallbackInterface) null);
            int i2 = getTvls + 43;
            setTokenInfo = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }
        return visaPaymentSDKImpl;
    }

    public static com.visa.cbp.sdk.facade.VisaPaymentSDK getInstance(android.content.Context context, com.visa.cbp.sdk.facade.activeaccountmanagement.ReplenishCallbackInterface replenishCallbackInterface) {
        com.visa.cbp.sdk.facade.VisaPaymentSDK visaPaymentSDKImpl;
        synchronized (com.visa.cbp.sdk.facade.VisaPaymentSDKImpl.class) {
            setTokenInfo = (getTvls + 89) % 128;
            visaPaymentSDKImpl = getInstance(context, "", replenishCallbackInterface);
            getTvls = (setTokenInfo + 115) % 128;
        }
        return visaPaymentSDKImpl;
    }

    public static com.visa.cbp.sdk.facade.VisaPaymentSDK getInstance(android.content.Context context, java.lang.String str) {
        com.visa.cbp.sdk.facade.VisaPaymentSDK visaPaymentSDKImpl;
        synchronized (com.visa.cbp.sdk.facade.VisaPaymentSDKImpl.class) {
            int i = setTokenInfo + 103;
            getTvls = i % 128;
            if (i % 2 == 0) {
                getInstance(context, str, (com.visa.cbp.sdk.facade.activeaccountmanagement.ReplenishCallbackInterface) null);
                throw new java.lang.ArithmeticException();
            }
            visaPaymentSDKImpl = getInstance(context, str, (com.visa.cbp.sdk.facade.activeaccountmanagement.ReplenishCallbackInterface) null);
            int i2 = setTokenInfo + 71;
            getTvls = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }
        return visaPaymentSDKImpl;
    }

    public static com.visa.cbp.sdk.facade.VisaPaymentSDK getInstance(android.content.Context context, java.lang.String str, com.visa.cbp.sdk.facade.activeaccountmanagement.ReplenishCallbackInterface replenishCallbackInterface) {
        com.visa.cbp.sdk.facade.VisaPaymentSDKImpl visaPaymentSDKImpl;
        synchronized (com.visa.cbp.sdk.facade.VisaPaymentSDKImpl.class) {
            int i = getTvls + 25;
            setTokenInfo = i % 128;
            if (i % 2 == 0) {
                if (instance == null) {
                    com.visa.cbp.sdk.facade.util.ContextHelper.getInstance(context);
                    com.visa.cbp.sdk.facade.VisaPaymentSDKImpl visaPaymentSDKImpl2 = new com.visa.cbp.sdk.facade.VisaPaymentSDKImpl();
                    visaPaymentSDKImpl2.init(context, str, replenishCallbackInterface);
                    instance = visaPaymentSDKImpl2;
                    int i2 = setTokenInfo + 73;
                    getTvls = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i3 = 4 / 2;
                    }
                }
                visaPaymentSDKImpl = instance;
            } else {
                throw new java.lang.NullPointerException();
            }
        }
        return visaPaymentSDKImpl;
    }

    public static com.visa.cbp.sdk.facade.VisaPaymentSDK getInstance(android.content.Context context, com.visa.cbp.sdk.facade.VisaPaymentSDKImpl.SDKBuilder sDKBuilder) {
        com.visa.cbp.sdk.facade.VisaPaymentSDK visaPaymentSDKImpl;
        synchronized (com.visa.cbp.sdk.facade.VisaPaymentSDKImpl.class) {
            int i = getTvls + 5;
            setTokenInfo = i % 128;
            if (i % 2 != 0) {
                getInstance(context, sDKBuilder, "", null);
                throw null;
            }
            visaPaymentSDKImpl = getInstance(context, sDKBuilder, "", null);
        }
        return visaPaymentSDKImpl;
    }

    public static com.visa.cbp.sdk.facade.VisaPaymentSDK getInstance(android.content.Context context, com.visa.cbp.sdk.facade.VisaPaymentSDKImpl.SDKBuilder sDKBuilder, com.visa.cbp.sdk.facade.activeaccountmanagement.ReplenishCallbackInterface replenishCallbackInterface) {
        com.visa.cbp.sdk.facade.VisaPaymentSDK visaPaymentSDKImpl;
        synchronized (com.visa.cbp.sdk.facade.VisaPaymentSDKImpl.class) {
            setTokenInfo = (getTvls + 21) % 128;
            visaPaymentSDKImpl = getInstance(context, sDKBuilder, "", replenishCallbackInterface);
            int i = getTvls + 15;
            setTokenInfo = i % 128;
            if (i % 2 != 0) {
                throw new java.lang.NullPointerException();
            }
        }
        return visaPaymentSDKImpl;
    }

    public static com.visa.cbp.sdk.facade.VisaPaymentSDK getInstance(android.content.Context context, com.visa.cbp.sdk.facade.VisaPaymentSDKImpl.SDKBuilder sDKBuilder, java.lang.String str) {
        com.visa.cbp.sdk.facade.VisaPaymentSDK visaPaymentSDKImpl;
        synchronized (com.visa.cbp.sdk.facade.VisaPaymentSDKImpl.class) {
            int i = setTokenInfo + 79;
            getTvls = i % 128;
            if (i % 2 == 0) {
                getInstance(context, sDKBuilder, str, null);
                throw new java.lang.NullPointerException();
            }
            visaPaymentSDKImpl = getInstance(context, sDKBuilder, str, null);
            setTokenInfo = (getTvls + 69) % 128;
        }
        return visaPaymentSDKImpl;
    }

    public static com.visa.cbp.sdk.facade.VisaPaymentSDK getInstance(android.content.Context context, com.visa.cbp.sdk.facade.VisaPaymentSDKImpl.SDKBuilder sDKBuilder, java.lang.String str, com.visa.cbp.sdk.facade.activeaccountmanagement.ReplenishCallbackInterface replenishCallbackInterface) {
        com.visa.cbp.sdk.facade.VisaPaymentSDKImpl visaPaymentSDKImpl;
        synchronized (com.visa.cbp.sdk.facade.VisaPaymentSDKImpl.class) {
            int i = setTokenInfo + 79;
            getTvls = i % 128;
            if (i % 2 != 0) {
                if (instance == null) {
                    com.visa.cbp.sdk.facade.util.ContextHelper.getInstance(context);
                    com.visa.cbp.sdk.facade.VisaPaymentSDKImpl build = sDKBuilder.build();
                    build.init(context, str, replenishCallbackInterface);
                    instance = build;
                    getTvls = (setTokenInfo + 45) % 128;
                }
                visaPaymentSDKImpl = instance;
            } else {
                throw new java.lang.NullPointerException();
            }
        }
        return visaPaymentSDKImpl;
    }

    protected final void init(android.content.Context context, java.lang.String str) {
        int i = getTvls + 89;
        setTokenInfo = i % 128;
        init(context, str, null);
        if (i % 2 != 0) {
            throw null;
        }
        getTvls = (setTokenInfo + 1) % 128;
    }

    protected final void init(android.content.Context context, java.lang.String str, com.visa.cbp.sdk.facade.activeaccountmanagement.ReplenishCallbackInterface replenishCallbackInterface) {
        if (context == null) {
            throw new com.visa.cbp.sdk.facade.exception.InitializationException(com.visa.cbp.setDeviceCerts.AidInfo);
        }
        try {
            super.init(context, preprocess, replenish, str, replenishCallbackInterface);
            java.lang.Object[] objArr = new java.lang.Object[1];
            n("祀\uebe4惺\u1bf4", "\u0000\u0000\u0000\u0000", (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 62559), android.view.ViewConfiguration.getPressedStateDuration() >> 16, "ﴒ㨜촥熤ڳⒿ", objArr);
            settingsDao.values(context, ((java.lang.String) objArr[0]).intern());
            int i = getTvls;
            setTokenInfo = (i + 43) % 128;
            if (replenish) {
                int i2 = i + 55;
                setTokenInfo = i2 % 128;
                if (i2 % 2 == 0) {
                    com.visa.cbp.getPhone.valueOf(com.visa.cbp.getPhone.ReplenishAckRequest.DAY, replenishCallbackInterface);
                } else {
                    com.visa.cbp.getPhone.valueOf(com.visa.cbp.getPhone.ReplenishAckRequest.DAY, replenishCallbackInterface);
                    throw null;
                }
            }
        } catch (com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException e) {
            e.getMessage();
            throw e;
        }
    }

    @Override // com.visa.cbp.sdk.facade.VisaPaymentSDK
    public final void reset(android.content.Context context) {
        synchronized (this) {
            if (context == null) {
                throw new com.visa.cbp.sdk.facade.exception.InterruptedResetException(com.visa.cbp.setDeviceCerts.AidInfo, com.visa.cbp.sdk.facade.error.ReasonCode.RESET_ERROR);
            }
            int i = setTokenInfo + 27;
            getTvls = i % 128;
            if (i % 2 == 0) {
                throw new java.lang.NullPointerException();
            }
            if (instance != null) {
                instance.resetCommons(context);
                com.visa.cbp.CardMetadataUpdateResponse.valueOf(context);
                instance = null;
                int i2 = setTokenInfo + 29;
                getTvls = i2 % 128;
                if (i2 % 2 != 0) {
                    return;
                } else {
                    throw new java.lang.ArithmeticException();
                }
            }
            return;
        }
    }

    /* loaded from: classes16.dex */
    public static class SDKBuilder {
        private boolean preprocess = false;
        private boolean replenish;

        public com.visa.cbp.sdk.facade.VisaPaymentSDKImpl.SDKBuilder withPreprocess(boolean z) {
            this.preprocess = z;
            return this;
        }

        public com.visa.cbp.sdk.facade.VisaPaymentSDKImpl.SDKBuilder withReplenish(boolean z) {
            this.replenish = z;
            return this;
        }

        com.visa.cbp.sdk.facade.VisaPaymentSDKImpl build() {
            return new com.visa.cbp.sdk.facade.VisaPaymentSDKImpl(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void n(java.lang.String str, java.lang.String str2, char c, int i, java.lang.String str3, java.lang.Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        if (str3 != 0) {
            $10 = ($11 + 57) % 128;
            cArr = str3.toCharArray();
        } else {
            cArr = str3;
        }
        char[] cArr3 = cArr;
        if (str2 != null) {
            $11 = ($10 + 111) % 128;
            cArr2 = str2.toCharArray();
            $11 = ($10 + 63) % 128;
        } else {
            cArr2 = str2;
        }
        char[] cArr4 = cArr2;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.visa.cbp.AidInfo aidInfo = new com.visa.cbp.AidInfo();
        int length = charArray.length;
        char[] cArr5 = new char[length];
        int length2 = cArr4.length;
        char[] cArr6 = new char[length2];
        java.lang.System.arraycopy(charArray, 0, cArr5, 0, length);
        java.lang.System.arraycopy(cArr4, 0, cArr6, 0, length2);
        cArr5[0] = (char) (cArr5[0] ^ c);
        cArr6[2] = (char) (cArr6[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr7 = new char[length3];
        aidInfo.valueOf = 0;
        while (aidInfo.valueOf < length3) {
            try {
                java.lang.Object[] objArr2 = {aidInfo};
                java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-1983273232);
                if (obj == null) {
                    obj = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), 2001 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29)).getMethod("D", java.lang.Object.class);
                    com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-1983273232, obj);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                try {
                    java.lang.Object[] objArr3 = {aidInfo};
                    java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-1725818816);
                    if (obj2 == null) {
                        java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) android.graphics.Color.alpha(0), android.os.Process.getGidForName("") + 179, 27 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16));
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        o((byte) -1, (byte) 0, (short) 0, objArr4);
                        obj2 = cls.getMethod((java.lang.String) objArr4[0], java.lang.Object.class);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-1725818816, obj2);
                    }
                    int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
                    try {
                        java.lang.Object[] objArr5 = {aidInfo, java.lang.Integer.valueOf(cArr5[aidInfo.valueOf % 4] * 32718), java.lang.Integer.valueOf(cArr6[intValue])};
                        java.lang.Object obj3 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-1422457014);
                        if (obj3 == null) {
                            obj3 = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) android.widget.ExpandableListView.getPackedPositionType(0L), android.widget.ExpandableListView.getPackedPositionType(0L) + 99, 26 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))).getMethod("A", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-1422457014, obj3);
                        }
                        ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                        try {
                            java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr5[intValue2] * 32718), java.lang.Integer.valueOf(cArr6[intValue])};
                            java.lang.Object obj4 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(894413753);
                            if (obj4 == null) {
                                obj4 = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 30832), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1971, 30 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))).getMethod(com.visa.cbp.getEncExpo.warmup, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(894413753, obj4);
                            }
                            cArr6[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr6)).charValue();
                            cArr5[intValue2] = aidInfo.BuildConfig;
                            cArr7[aidInfo.valueOf] = (char) ((((cArr5[intValue2] ^ cArr3[aidInfo.valueOf]) ^ (ConfirmReplenishRequest ^ 1527987341865046008L)) ^ ((int) (ReplenishAckRequest ^ 1527987341865046008L))) ^ ((char) (valueOf ^ 1527987341865046008L)));
                            aidInfo.valueOf++;
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (java.lang.Throwable th2) {
                        java.lang.Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (java.lang.Throwable th3) {
                    java.lang.Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } catch (java.lang.Throwable th4) {
                java.lang.Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new java.lang.String(cArr7);
    }

    static void init$0() {
        $$v = new byte[]{57, 122, -104, -28};
        $$w = 82;
    }

    static void getTvls() {
        ReplenishAckRequest = -732855144;
        valueOf = (char) 53240;
        ConfirmReplenishRequest = 1527987341865046008L;
    }
}
