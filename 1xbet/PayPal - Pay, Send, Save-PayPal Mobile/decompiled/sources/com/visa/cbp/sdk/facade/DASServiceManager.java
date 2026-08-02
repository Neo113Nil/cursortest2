package com.visa.cbp.sdk.facade;

/* loaded from: classes5.dex */
public class DASServiceManager {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char BuildConfig;
    private static char[] ConfirmReplenishRequest;
    private static long ETWRTU;
    private static int ReplenishAckRequest;
    private static final java.lang.String TAG;
    private static com.visa.cbp.sdk.facade.DASServiceManager dasServiceImpl;
    private static com.visa.cbp.getCertFormat dasServiceProcessor;
    private static java.lang.String endPoint;
    private static com.visa.cbp.sdk.facade.LoginState loginState;
    private static com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException sdkException;
    private static long serverTimeStamp;
    private static int values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, short s, short s2, java.lang.Object[] objArr) {
        int i;
        byte[] bArr = $$a;
        int i2 = b * 4;
        int i3 = 3 - (s * 4);
        int i4 = 110 - (s2 * 2);
        byte[] bArr2 = new byte[i2 + 1];
        if (bArr == null) {
            int i5 = i2;
            i = 0;
            i4 += i5;
            i3++;
            bArr2[i] = (byte) i4;
            if (i == i2) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i++;
            i5 = bArr[i3];
            i4 += i5;
            i3++;
            bArr2[i] = (byte) i4;
            if (i == i2) {
            }
        } else {
            i = 0;
            i3++;
            bArr2[i] = (byte) i4;
            if (i == i2) {
            }
        }
    }

    static /* synthetic */ java.lang.String access$000() {
        int i = (ReplenishAckRequest + 41) % 128;
        values = i;
        java.lang.String str = TAG;
        ReplenishAckRequest = (i + 31) % 128;
        return str;
    }

    static /* synthetic */ com.visa.cbp.sdk.facade.DASServiceManager access$100() {
        int i = ReplenishAckRequest + 95;
        values = i % 128;
        if (i % 2 != 0) {
            return dasServiceImpl;
        }
        throw null;
    }

    static /* synthetic */ com.visa.cbp.sdk.facade.LoginState access$302(com.visa.cbp.sdk.facade.LoginState loginState2) {
        int i = (ReplenishAckRequest + 23) % 128;
        values = i;
        loginState = loginState2;
        ReplenishAckRequest = (i + 33) % 128;
        return loginState2;
    }

    static /* synthetic */ com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException access$402(com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException visaPaymentSDKException) {
        int i = values;
        ReplenishAckRequest = (i + 125) % 128;
        sdkException = visaPaymentSDKException;
        int i2 = i + 87;
        ReplenishAckRequest = i2 % 128;
        if (i2 % 2 == 0) {
            return visaPaymentSDKException;
        }
        throw new java.lang.ArithmeticException();
    }

    static /* synthetic */ boolean access$500(com.visa.cbp.sdk.facade.DASServiceManager dASServiceManager, okhttp3.Headers headers, byte[] bArr) {
        int i = ReplenishAckRequest + 47;
        values = i % 128;
        boolean verifyPopToken = dASServiceManager.verifyPopToken(headers, bArr);
        if (i % 2 != 0) {
            return verifyPopToken;
        }
        throw new java.lang.ArithmeticException();
    }

    static /* synthetic */ com.visa.cbp.getCertFormat access$600() {
        int i = values + 29;
        int i2 = i % 128;
        ReplenishAckRequest = i2;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        com.visa.cbp.getCertFormat getcertformat = dasServiceProcessor;
        int i3 = i2 + 3;
        values = i3 % 128;
        if (i3 % 2 != 0) {
            return getcertformat;
        }
        throw null;
    }

    static /* synthetic */ com.visa.cbp.sdk.facade.JwsAttestationResult access$700(java.lang.String str) {
        int i = ReplenishAckRequest + 97;
        values = i % 128;
        if (i % 2 == 0) {
            decodeJWS(str);
            throw null;
        }
        com.visa.cbp.sdk.facade.JwsAttestationResult decodeJWS = decodeJWS(str);
        int i2 = values + 113;
        ReplenishAckRequest = i2 % 128;
        if (i2 % 2 == 0) {
            return decodeJWS;
        }
        throw new java.lang.ArithmeticException();
    }

    static /* synthetic */ long access$800() {
        int i = ReplenishAckRequest;
        int i2 = i + 101;
        values = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        long j = serverTimeStamp;
        int i3 = i + 29;
        values = i3 % 128;
        if (i3 % 2 != 0) {
            return j;
        }
        throw null;
    }

    static /* synthetic */ long access$802(long j) {
        int i = values + 97;
        int i2 = i % 128;
        ReplenishAckRequest = i2;
        serverTimeStamp = j;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        int i3 = i2 + 29;
        values = i3 % 128;
        if (i3 % 2 != 0) {
            return j;
        }
        throw null;
    }

    static /* synthetic */ long access$900() {
        int i = ReplenishAckRequest;
        int i2 = i + 87;
        values = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        long j = ETWRTU;
        values = (i + 121) % 128;
        return j;
    }

    static /* synthetic */ long access$902(long j) {
        int i = (ReplenishAckRequest + 53) % 128;
        values = i;
        ETWRTU = j;
        ReplenishAckRequest = (i + 73) % 128;
        return j;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ReplenishAckRequest = 0;
        values = 1;
        BuildConfig();
        TAG = "DASServiceManager";
        dasServiceImpl = null;
        dasServiceProcessor = null;
        endPoint = null;
        loginState = com.visa.cbp.sdk.facade.LoginState.NOT_CONNECTED;
        sdkException = null;
        int i = values + 29;
        ReplenishAckRequest = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    public static com.visa.cbp.sdk.facade.LoginState getLoginState() {
        int i = values;
        int i2 = i + 115;
        ReplenishAckRequest = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        com.visa.cbp.sdk.facade.LoginState loginState2 = loginState;
        ReplenishAckRequest = (i + 21) % 128;
        return loginState2;
    }

    public static void setLoginState(com.visa.cbp.sdk.facade.LoginState loginState2) {
        int i = (values + 11) % 128;
        ReplenishAckRequest = i;
        loginState = loginState2;
        values = (i + 5) % 128;
    }

    public static com.visa.cbp.getCertFormat getDasServiceProcessor() {
        int i = (values + 7) % 128;
        ReplenishAckRequest = i;
        com.visa.cbp.getCertFormat getcertformat = dasServiceProcessor;
        int i2 = i + 43;
        values = i2 % 128;
        if (i2 % 2 != 0) {
            return getcertformat;
        }
        throw null;
    }

    public void reset() {
        int i = ReplenishAckRequest + 95;
        values = i % 128;
        if (i % 2 != 0) {
            com.visa.cbp.getCertFormat getcertformat = dasServiceProcessor;
            if (getcertformat != null) {
                getcertformat.ReplenishRequest();
                ReplenishAckRequest = (values + 115) % 128;
            }
            dasServiceImpl = null;
            dasServiceProcessor = null;
            endPoint = null;
            loginState = com.visa.cbp.sdk.facade.LoginState.NOT_CONNECTED;
            return;
        }
        throw null;
    }

    static class IamConnection {
        private java.lang.String[] correlationId = {""};

        IamConnection() {
        }

        void execute(final android.content.Context context, final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.lang.String str4, final com.visa.cbp.sdk.facade.DASService.LoginCallback loginCallback) {
            com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException visaPaymentSDKException;
            try {
                try {
                    java.util.concurrent.Executors.newSingleThreadExecutor().submit(new java.lang.Runnable() { // from class: com.visa.cbp.sdk.facade.DASServiceManager.IamConnection.1
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                java.lang.String access$000 = com.visa.cbp.sdk.facade.DASServiceManager.access$000();
                                java.lang.StringBuilder sb = new java.lang.StringBuilder("Inside doInBackground before login: ");
                                sb.append(loginCallback);
                                com.visa.cbp.setVtsCerts.getTvls(access$000, sb.toString());
                                com.visa.cbp.sdk.facade.DASServiceManager.access$100().login(context, str, str2, str3, str4, loginCallback);
                                com.visa.cbp.setVtsCerts.getTvls(com.visa.cbp.sdk.facade.DASServiceManager.access$000(), "Inside doInBackground after login");
                            } catch (java.lang.Exception e) {
                                if (e instanceof com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException) {
                                    com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException visaPaymentSDKException2 = (com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException) e;
                                    com.visa.cbp.sdk.facade.DASServiceManager.IamConnection.this.correlationId[0] = visaPaymentSDKException2.getCbpError().getCorrelationId();
                                    java.lang.String access$0002 = com.visa.cbp.sdk.facade.DASServiceManager.access$000();
                                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Error: ");
                                    sb2.append(com.visa.cbp.sdk.facade.DASServiceManager.IamConnection.this.correlationId[0]);
                                    com.visa.cbp.setVtsCerts.getTvls(access$0002, sb2.toString());
                                    throw visaPaymentSDKException2;
                                }
                                if (e instanceof java.net.SocketTimeoutException) {
                                    java.lang.String access$0003 = com.visa.cbp.sdk.facade.DASServiceManager.access$000();
                                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Error: ");
                                    sb3.append(e.getMessage());
                                    com.visa.cbp.setVtsCerts.getTvls(access$0003, sb3.toString());
                                    throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.setCertFormat);
                                }
                                if (e instanceof java.net.UnknownHostException) {
                                    java.lang.String access$0004 = com.visa.cbp.sdk.facade.DASServiceManager.access$000();
                                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Error: ");
                                    sb4.append(e.getMessage());
                                    com.visa.cbp.setVtsCerts.getTvls(access$0004, sb4.toString());
                                    throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.DeviceInfo);
                                }
                                com.visa.cbp.sdk.facade.DASServiceManager.setLoginState(com.visa.cbp.sdk.facade.LoginState.NOT_CONNECTED);
                                java.lang.String access$0005 = com.visa.cbp.sdk.facade.DASServiceManager.access$000();
                                java.lang.StringBuilder sb5 = new java.lang.StringBuilder("Error: ");
                                sb5.append(e.getMessage());
                                com.visa.cbp.setVtsCerts.getTvls(access$0005, sb5.toString());
                                com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException visaPaymentSDKException3 = (com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException) e;
                                com.visa.cbp.sdk.facade.DASServiceManager.IamConnection.this.correlationId[0] = visaPaymentSDKException3.getCbpError().getCorrelationId();
                                java.lang.String access$0006 = com.visa.cbp.sdk.facade.DASServiceManager.access$000();
                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("correlationId: ");
                                sb6.append(com.visa.cbp.sdk.facade.DASServiceManager.IamConnection.this.correlationId[0]);
                                com.visa.cbp.setVtsCerts.getTvls(access$0006, sb6.toString());
                                throw visaPaymentSDKException3;
                            }
                        }
                    }).get();
                } catch (java.lang.InterruptedException e) {
                    if (loginCallback != null) {
                        loginCallback.onError(new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.ConsumerInfo));
                    }
                    throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(e.getCause());
                }
            } catch (java.util.concurrent.ExecutionException e2) {
                java.lang.String access$000 = com.visa.cbp.sdk.facade.DASServiceManager.access$000();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ExecutionException: ");
                sb.append(e2.getMessage());
                com.visa.cbp.setVtsCerts.getTvls(access$000, sb.toString());
                if (e2.getMessage().contains(com.visa.cbp.setDeviceCerts.getvProvisionedTokenID.valueOf())) {
                    visaPaymentSDKException = new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.getvProvisionedTokenID, "", this.correlationId[0]);
                } else if (e2.getMessage().contains(com.visa.cbp.setDeviceCerts.getDate.valueOf())) {
                    visaPaymentSDKException = new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.getDate, "", this.correlationId[0]);
                } else if (e2.getMessage().contains(com.visa.cbp.setDeviceCerts.getCardMetaData.valueOf())) {
                    visaPaymentSDKException = new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.getCardMetaData, "", this.correlationId[0]);
                } else if (e2.getMessage().contains(com.visa.cbp.setDeviceCerts.setDate.valueOf())) {
                    visaPaymentSDKException = new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.setDate, "", this.correlationId[0]);
                } else if (e2.getMessage().contains(com.visa.cbp.setDeviceCerts.setvProvisionedTokenID.valueOf())) {
                    visaPaymentSDKException = new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.setvProvisionedTokenID, "", this.correlationId[0]);
                } else {
                    visaPaymentSDKException = new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(e2.getCause());
                }
                if (loginCallback != null) {
                    loginCallback.onError(visaPaymentSDKException);
                }
            }
        }
    }

    public static com.visa.cbp.sdk.facade.DASServiceManager getInstance(android.content.Context context) {
        int i = ReplenishAckRequest;
        values = (i + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        com.visa.cbp.sdk.facade.DASServiceManager dASServiceManager = dasServiceImpl;
        int i2 = i + 115;
        values = i2 % 128;
        if (i2 % 2 != 0) {
            return dASServiceManager;
        }
        throw null;
    }

    public static com.visa.cbp.sdk.facade.DASServiceManager getInstance(android.content.Context context, com.visa.cbp.setMaxPmts setmaxpmts) {
        int i = values + 125;
        ReplenishAckRequest = i % 128;
        if (i % 2 == 0) {
            return getInstance(context, setmaxpmts, com.visa.cbp.getOsType.valueOf().BuildConfig(), null);
        }
        getInstance(context, setmaxpmts, com.visa.cbp.getOsType.valueOf().BuildConfig(), null);
        throw null;
    }

    public static com.visa.cbp.sdk.facade.DASServiceManager getInstance(android.content.Context context, com.visa.cbp.setMaxPmts setmaxpmts, java.lang.String str) {
        values = (ReplenishAckRequest + 55) % 128;
        com.visa.cbp.sdk.facade.DASServiceManager dASServiceManager = getInstance(context, setmaxpmts, str, null);
        ReplenishAckRequest = (values + 111) % 128;
        return dASServiceManager;
    }

    public static com.visa.cbp.sdk.facade.DASServiceManager getInstance(android.content.Context context, com.visa.cbp.setMaxPmts setmaxpmts, com.visa.cbp.sdk.facade.DASService.LoginCallback loginCallback) {
        java.lang.String str = TAG;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DASServiceManager getEndpoint: ");
        sb.append(com.visa.cbp.getOsType.valueOf().BuildConfig());
        com.visa.cbp.setVtsCerts.getTvls(str, sb.toString());
        com.visa.cbp.sdk.facade.DASServiceManager dASServiceManager = getInstance(context, setmaxpmts, com.visa.cbp.getOsType.valueOf().BuildConfig(), loginCallback);
        values = (ReplenishAckRequest + 65) % 128;
        return dASServiceManager;
    }

    public static com.visa.cbp.sdk.facade.DASServiceManager getInstance(android.content.Context context, com.visa.cbp.setMaxPmts setmaxpmts, java.lang.String str, com.visa.cbp.sdk.facade.DASService.LoginCallback loginCallback) {
        com.visa.cbp.getCertFormat getcertformat;
        int i = values + 27;
        ReplenishAckRequest = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        if (dasServiceImpl == null) {
            endPoint = com.visa.cbp.getOsType.ConfirmReplenishRequest(str).BuildConfig();
            java.lang.String str2 = TAG;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DASServiceManager getInstance endPoint: ");
            sb.append(endPoint);
            com.visa.cbp.setVtsCerts.getTvls(str2, sb.toString());
            dasServiceImpl = new com.visa.cbp.sdk.facade.DASServiceManager();
            try {
                dasServiceProcessor = new com.visa.cbp.getCertFormat(context);
            } catch (java.lang.Exception e) {
                java.lang.String str3 = TAG;
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Error DASServiceProcessor: ");
                sb2.append(e.getMessage());
                com.visa.cbp.setVtsCerts.getTvls(str3, sb2.toString());
                throw e;
            }
        }
        java.lang.String str4 = TAG;
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Test 1: ");
        sb3.append(setmaxpmts != null);
        com.visa.cbp.setVtsCerts.getTvls(str4, sb3.toString());
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Test 2: ");
        sb4.append(dasServiceProcessor != null);
        com.visa.cbp.setVtsCerts.getTvls(str4, sb4.toString());
        java.lang.StringBuilder sb5 = new java.lang.StringBuilder("Test 3: ");
        sb5.append(dasServiceProcessor.getTokenInfo());
        com.visa.cbp.setVtsCerts.getTvls(str4, sb5.toString());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Test 4: ");
        sb6.append(com.visa.cbp.getCertFormat.getTvls());
        com.visa.cbp.setVtsCerts.getTvls(str4, sb6.toString());
        if (setmaxpmts != null && (getcertformat = dasServiceProcessor) != null) {
            values = (ReplenishAckRequest + 19) % 128;
            boolean tokenInfo = getcertformat.getTokenInfo();
            boolean tvls = com.visa.cbp.getCertFormat.getTvls();
            if (tokenInfo && !tvls) {
                java.lang.String tokenInfo2 = getDasServiceProcessor().setTokenInfo();
                java.lang.String encryptionMetaData = setmaxpmts.setEncryptionMetaData();
                java.lang.String signature = setmaxpmts.getSignature();
                java.lang.String AidInfo = setmaxpmts.AidInfo();
                try {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    a((byte) (82 - (android.os.Process.myTid() >> 22)), "7,㘔", 3 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr);
                    if (!((java.lang.String) objArr[0]).intern().equalsIgnoreCase("TEST") && loginState == com.visa.cbp.sdk.facade.LoginState.NOT_CONNECTED) {
                        new com.visa.cbp.sdk.facade.DASServiceManager.IamConnection().execute(context, tokenInfo2, encryptionMetaData, signature, AidInfo, loginCallback);
                    }
                } catch (java.lang.Exception e2) {
                    java.lang.String str5 = TAG;
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("Error getInstance: ");
                    sb7.append(e2.getMessage());
                    com.visa.cbp.setVtsCerts.getTvls(str5, sb7.toString());
                    throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(e2);
                }
            } else if (tokenInfo && tvls) {
                if (loginCallback == null) {
                    throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.getMimeType);
                }
                loginCallback.onError(new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.getMimeType));
            } else if (!tokenInfo) {
                int i2 = (ReplenishAckRequest + 25) % 128;
                values = i2;
                if (!tvls) {
                    ReplenishAckRequest = (i2 + 83) % 128;
                    if (loginCallback == null) {
                        throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.getWidth);
                    }
                    loginCallback.onError(new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.getWidth));
                }
            }
        }
        return dasServiceImpl;
    }

    public com.visa.cbp.getDeviceType login(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, final com.visa.cbp.sdk.facade.DASService.LoginCallback loginCallback) throws java.lang.Exception {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(endPoint);
        sb.append("/apn/dpe/oauth2/token/");
        java.lang.String obj = sb.toString();
        java.lang.String values2 = dasServiceProcessor.values();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("Content-Type", "application/x-www-form-urlencoded; charset=utf-8");
        hashMap.put("Cache-Control", "no-cache");
        if (values2 != null) {
            ReplenishAckRequest = (values + 47) % 128;
            if (values2.length() > 0) {
                hashMap.put(com.visa.cbp.ConsumerInfo.setEncryptionMetaData, values2);
            }
        }
        com.visa.cbp.getDeviceType getdevicetype = null;
        if (loginState == com.visa.cbp.sdk.facade.LoginState.NOT_CONNECTED) {
            values = (ReplenishAckRequest + 107) % 128;
            try {
                com.visa.cbp.sdk.facade.LoginRequest ConfirmReplenishRequest2 = dasServiceProcessor.ConfirmReplenishRequest(str, str2, str3, str4);
                com.visa.cbp.getDeviceCerts getdevicecerts = (com.visa.cbp.getDeviceCerts) getRetrofitClient(obj).create(com.visa.cbp.getDeviceCerts.class);
                java.lang.String ConfirmReplenishRequest3 = com.visa.cbp.getOsType.valueOf().ConfirmReplenishRequest();
                java.lang.String str5 = com.visa.cbp.getDeviceCerts.valueOf;
                if (ConfirmReplenishRequest3 == "CERT") {
                    str5 = com.visa.cbp.getDeviceCerts.valueOf.replace("/vts-sdk-kicdevint", "/vts-sdk-kiccert2");
                }
                loginState = com.visa.cbp.sdk.facade.LoginState.CONNECTING;
                final retrofit2.Response<com.visa.cbp.sdk.facade.LoginResponse> execute = getdevicecerts.values(str5, hashMap, ConfirmReplenishRequest2.getGrant_type(), ConfirmReplenishRequest2.getAssertion()).execute();
                if (execute.isSuccessful()) {
                    java.lang.String str6 = TAG;
                    com.visa.cbp.setVtsCerts.getTvls(str6, "Successful LoginResponse");
                    loginState = com.visa.cbp.sdk.facade.LoginState.CONNECTED;
                    java.security.KeyFactory keyFactory = java.security.KeyFactory.getInstance("EC");
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    a((byte) (101 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), "㘜㘜㘜㘜7.\u0004\f:#\u0006)\u001f7+:1\u0007\u00149\u000e7㘜㘜㘜㘜\u0007%\u001b\u000b\f8\t\b1\u0012\u0018?\u0003#\n\u00020/'\r9\u0013\u0018?\u0003#\n\u0002\u0018)-%\u001d!.)>\u0004<\u000f\u001c\u0007\r?$+,3>\t>(+.\u0004?)\u000f>\u0003.#2#\r=2+/:0%\u0019(\n\u0018\u0005\u0015683\t+&5\u0011\u0002(\u00122\u000f)\u0010%8! \u000e%6!\u001e6\u0018(\u000f;5\u0010\f㙡㙡8\"3\u00143\u00051(,>\u001d/㘌㘌\u00065㘜㘜㘜㘜:$!\t/\u0016(+?3\t\u0019?\f㘜㘜㘜㘜㘜", (-16777039) - android.graphics.Color.rgb(0, 0, 0), objArr);
                    if (!verifyPopToken(execute.headers(), (java.security.interfaces.ECPublicKey) keyFactory.generatePublic(new java.security.spec.X509EncodedKeySpec(android.util.Base64.decode(((java.lang.String) objArr[0]).intern().replace("-----BEGIN PUBLIC KEY-----", "").replace("-----END PUBLIC KEY-----", "").replace(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, ""), 0))))) {
                        sdkException = new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.setContactNumber);
                    }
                    com.visa.cbp.getDeviceType ReplenishAckRequest2 = dasServiceProcessor.ReplenishAckRequest(execute.body(), str, str2);
                    com.visa.cbp.setVtsCerts.getTvls(str6, "GetServerNonce Call");
                    getServerData(context, str, str2, str3, new com.visa.cbp.sdk.facade.DASService.GetServerDataCallback() { // from class: com.visa.cbp.sdk.facade.DASServiceManager.1
                        @Override // com.visa.cbp.sdk.facade.DASService.GetServerDataCallback
                        public void onResult(retrofit2.Response<com.visa.cbp.sdk.facade.GetServerNonceResponse> response) {
                            com.visa.cbp.setVtsCerts.getTvls(com.visa.cbp.sdk.facade.DASServiceManager.access$000(), "Successful GetServerNonce!!!!");
                            com.visa.cbp.sdk.facade.DASService.LoginCallback loginCallback2 = loginCallback;
                            if (loginCallback2 != null) {
                                loginCallback2.onResult(execute);
                            }
                        }

                        @Override // com.visa.cbp.sdk.facade.DASService.GetServerDataCallback
                        public void onError(com.visa.cbp.setDeviceCerts setdevicecerts) {
                            java.lang.String access$000 = com.visa.cbp.sdk.facade.DASServiceManager.access$000();
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Error: ");
                            sb2.append(setdevicecerts.valueOf());
                            com.visa.cbp.setVtsCerts.getTvls(access$000, sb2.toString());
                            com.visa.cbp.sdk.facade.DASServiceManager.access$302(com.visa.cbp.sdk.facade.LoginState.NOT_CONNECTED);
                            com.visa.cbp.sdk.facade.DASServiceManager.access$402(new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(setdevicecerts));
                            com.visa.cbp.sdk.facade.DASService.LoginCallback loginCallback2 = loginCallback;
                            if (loginCallback2 != null) {
                                loginCallback2.onError(new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(setdevicecerts));
                            }
                        }

                        @Override // com.visa.cbp.sdk.facade.DASService.GetServerDataCallback
                        public void onError(com.visa.cbp.setDeviceCerts setdevicecerts, java.lang.String str7) {
                            java.lang.String access$000 = com.visa.cbp.sdk.facade.DASServiceManager.access$000();
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Error: ");
                            sb2.append(setdevicecerts.valueOf());
                            com.visa.cbp.setVtsCerts.getTvls(access$000, sb2.toString());
                            com.visa.cbp.setVtsCerts.getTvls(com.visa.cbp.sdk.facade.DASServiceManager.access$000(), "correlationId: ".concat(java.lang.String.valueOf(str7)));
                            com.visa.cbp.sdk.facade.DASServiceManager.access$302(com.visa.cbp.sdk.facade.LoginState.NOT_CONNECTED);
                            com.visa.cbp.sdk.facade.DASServiceManager.access$402(new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(setdevicecerts, "", str7));
                            com.visa.cbp.sdk.facade.DASService.LoginCallback loginCallback2 = loginCallback;
                            if (loginCallback2 != null) {
                                loginCallback2.onError(new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(setdevicecerts, "", str7));
                            }
                        }

                        @Override // com.visa.cbp.sdk.facade.DASService.GetServerDataCallback
                        public void onError(com.visa.cbp.setDeviceCerts setdevicecerts, java.lang.String str7, java.lang.String str8) {
                            java.lang.String access$000 = com.visa.cbp.sdk.facade.DASServiceManager.access$000();
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Error: ");
                            sb2.append(setdevicecerts.valueOf());
                            com.visa.cbp.setVtsCerts.getTvls(access$000, sb2.toString());
                            com.visa.cbp.setVtsCerts.getTvls(com.visa.cbp.sdk.facade.DASServiceManager.access$000(), "correlationId: ".concat(java.lang.String.valueOf(str7)));
                            com.visa.cbp.sdk.facade.DASServiceManager.access$302(com.visa.cbp.sdk.facade.LoginState.NOT_CONNECTED);
                            com.visa.cbp.sdk.facade.DASServiceManager.access$402(new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(setdevicecerts, "", str7));
                            com.visa.cbp.sdk.facade.DASService.LoginCallback loginCallback2 = loginCallback;
                            if (loginCallback2 != null) {
                                loginCallback2.onError(new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(setdevicecerts, str8));
                            }
                        }
                    });
                    ReplenishAckRequest = (values + 89) % 128;
                    getdevicetype = ReplenishAckRequest2;
                } else {
                    java.lang.String str7 = TAG;
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("DAS Login Failed: ");
                    sb2.append(execute.headers().get(com.visa.cbp.sdk.facade.data.Constants.HEADER_CORRELATION_ID));
                    com.visa.cbp.setVtsCerts.getTvls(str7, sb2.toString());
                    loginState = com.visa.cbp.sdk.facade.LoginState.NOT_CONNECTED;
                    sdkException = new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.getvProvisionedTokenID, "", execute.headers().get(com.visa.cbp.sdk.facade.data.Constants.HEADER_CORRELATION_ID));
                    if (loginCallback != null) {
                        loginCallback.onError(new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.getvProvisionedTokenID, "", execute.headers().get(com.visa.cbp.sdk.facade.data.Constants.HEADER_CORRELATION_ID)));
                    }
                }
                com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException visaPaymentSDKException = sdkException;
                if (visaPaymentSDKException != null) {
                    int i = ReplenishAckRequest + 39;
                    values = i % 128;
                    if (i % 2 == 0) {
                        throw new java.lang.NullPointerException();
                    }
                    throw visaPaymentSDKException;
                }
            } catch (java.net.SocketTimeoutException e) {
                e = e;
                loginState = com.visa.cbp.sdk.facade.LoginState.NOT_CONNECTED;
                throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.getvProvisionedTokenID, e.getMessage());
            } catch (java.io.IOException e2) {
                e = e2;
                loginState = com.visa.cbp.sdk.facade.LoginState.NOT_CONNECTED;
                throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.getvProvisionedTokenID, e.getMessage());
            } catch (java.lang.NoClassDefFoundError e3) {
                e = e3;
                loginState = com.visa.cbp.sdk.facade.LoginState.NOT_CONNECTED;
                throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.getvProvisionedTokenID, e.getMessage());
            } catch (java.net.UnknownHostException e4) {
                e = e4;
                loginState = com.visa.cbp.sdk.facade.LoginState.NOT_CONNECTED;
                throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.getvProvisionedTokenID, e.getMessage());
            } catch (java.security.NoSuchAlgorithmException e5) {
                e = e5;
                loginState = com.visa.cbp.sdk.facade.LoginState.NOT_CONNECTED;
                throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.getvProvisionedTokenID, e.getMessage());
            } catch (java.security.spec.InvalidKeySpecException e6) {
                e = e6;
                loginState = com.visa.cbp.sdk.facade.LoginState.NOT_CONNECTED;
                throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.getvProvisionedTokenID, e.getMessage());
            }
        }
        values = (ReplenishAckRequest + 17) % 128;
        return getdevicetype;
    }

    public void getServerData(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, com.visa.cbp.sdk.facade.DASService.GetServerDataCallback getServerDataCallback) {
        java.lang.String str4 = com.visa.cbp.getDeviceCerts.ReplenishAckRequest;
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(endPoint);
            sb.append("/vas/dpe/devices/{serverDeviceID}/servernonce/");
            java.lang.String obj = sb.toString();
            java.lang.String constructPopToken = constructPopToken("GET", com.visa.cbp.getDeviceCerts.ReplenishAckRequest, str3, str, str2);
            com.visa.cbp.getDeviceCerts getdevicecerts = (com.visa.cbp.getDeviceCerts) getRetrofitClient(obj).create(com.visa.cbp.getDeviceCerts.class);
            if (com.visa.cbp.getOsType.valueOf().ConfirmReplenishRequest() == "CERT") {
                int i = values + 125;
                ReplenishAckRequest = i % 128;
                if (i % 2 != 0) {
                    com.visa.cbp.getDeviceCerts.ReplenishAckRequest.replace("/vts-sdk-kicdevint", "/vts-sdk-kiccert2");
                    throw null;
                }
                str4 = com.visa.cbp.getDeviceCerts.ReplenishAckRequest.replace("/vts-sdk-kicdevint", "/vts-sdk-kiccert2");
                ReplenishAckRequest = (values + 23) % 128;
            }
            java.lang.String replace = str4.replace("{serverDeviceID}", str3);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("Authorization", constructPopToken);
            hashMap.put("Accept", "application/json");
            hashMap.put("Content-Type", "application/json");
            hashMap.put("Cache-Control", "no-cache");
            java.lang.Object[] objArr = new java.lang.Object[1];
            a((byte) (15 - android.text.TextUtils.indexOf("", "", 0)), "&\b\u001b\u0005\r.\u0012&\u000f>㘎", 11 - android.view.View.resolveSize(0, 0), objArr);
            hashMap.put(((java.lang.String) objArr[0]).intern(), getAppPackageName(context));
            getdevicecerts.values(replace, hashMap).enqueue(new com.visa.cbp.sdk.facade.DASServiceManager.AnonymousClass2(getServerDataCallback, context, str, str2, str3));
        } catch (java.lang.Exception unused) {
            getServerDataCallback.onError(com.visa.cbp.setDeviceCerts.getDate);
        }
    }

    /* renamed from: com.visa.cbp.sdk.facade.DASServiceManager$2, reason: invalid class name */
    class AnonymousClass2 implements retrofit2.Callback<com.visa.cbp.sdk.facade.GetServerNonceResponse> {
        final /* synthetic */ com.visa.cbp.sdk.facade.DASService.GetServerDataCallback val$callback;
        final /* synthetic */ android.content.Context val$context;
        final /* synthetic */ java.lang.String val$kid;
        final /* synthetic */ java.lang.String val$nonce;
        final /* synthetic */ java.lang.String val$serverDeviceID;

        AnonymousClass2(com.visa.cbp.sdk.facade.DASService.GetServerDataCallback getServerDataCallback, android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
            this.val$callback = getServerDataCallback;
            this.val$context = context;
            this.val$nonce = str;
            this.val$kid = str2;
            this.val$serverDeviceID = str3;
        }

        @Override // retrofit2.Callback
        public void onResponse(retrofit2.Call<com.visa.cbp.sdk.facade.GetServerNonceResponse> call, final retrofit2.Response<com.visa.cbp.sdk.facade.GetServerNonceResponse> response) {
            try {
                if (response.code() == 200) {
                    com.visa.cbp.setVtsCerts.getTvls(com.visa.cbp.sdk.facade.DASServiceManager.access$000(), "GetServerNonce 200 Received");
                    if (!com.visa.cbp.sdk.facade.DASServiceManager.access$500(com.visa.cbp.sdk.facade.DASServiceManager.this, response.headers(), com.visa.cbp.getCertFormat.ConfirmReplenishRequest().ReplenishAckRequest())) {
                        this.val$callback.onError(com.visa.cbp.setDeviceCerts.setContactNumber);
                    }
                    final java.lang.String values = com.visa.cbp.sdk.facade.DASServiceManager.access$600().values(response.body());
                    if (values == null) {
                        com.visa.cbp.setVtsCerts.getTvls(com.visa.cbp.sdk.facade.DASServiceManager.access$000(), "GetServerNonce Error");
                        this.val$callback.onError(com.visa.cbp.setDeviceCerts.getDate);
                        return;
                    }
                    com.visa.cbp.sdk.facade.JwsAttestationResult access$700 = com.visa.cbp.sdk.facade.DASServiceManager.access$700(values);
                    com.visa.cbp.sdk.facade.DASServiceManager.access$802(access$700.getTimestampMs());
                    java.lang.String access$000 = com.visa.cbp.sdk.facade.DASServiceManager.access$000();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("SeverTimeStamp: ");
                    sb.append(java.lang.Long.toString(com.visa.cbp.sdk.facade.DASServiceManager.access$800()));
                    com.visa.cbp.setVtsCerts.getTvls(access$000, sb.toString());
                    com.visa.cbp.sdk.facade.DASServiceManager.access$902(android.os.SystemClock.elapsedRealtime());
                    java.lang.String access$0002 = com.visa.cbp.sdk.facade.DASServiceManager.access$000();
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("ETWRTU: ");
                    sb2.append(java.lang.Long.toString(com.visa.cbp.sdk.facade.DASServiceManager.access$900()));
                    com.visa.cbp.setVtsCerts.getTvls(access$0002, sb2.toString());
                    if (access$700 == null) {
                        com.visa.cbp.setVtsCerts.getTvls(com.visa.cbp.sdk.facade.DASServiceManager.access$000(), "GetServerNonce Error");
                        this.val$callback.onError(com.visa.cbp.setDeviceCerts.getDate);
                        return;
                    } else {
                        com.visa.cbp.sdk.facade.DASServiceManager.access$600().ConfirmReplenishRequest(this.val$context, access$700.getNonce(), new com.visa.cbp.sdk.facade.DASService.DeviceAttestationCallback() { // from class: com.visa.cbp.sdk.facade.DASServiceManager.2.1
                            @Override // com.visa.cbp.sdk.facade.DASService.DeviceAttestationCallback
                            public void onResult(int i, java.lang.String str) {
                                try {
                                    com.visa.cbp.setVtsCerts.getTvls(com.visa.cbp.sdk.facade.DASServiceManager.access$000(), "performDeviceAttestation OK");
                                    com.visa.cbp.sdk.facade.DASServiceManager.this.validateAndGetKram(com.visa.cbp.sdk.facade.DASServiceManager.AnonymousClass2.this.val$context, com.visa.cbp.sdk.facade.DASServiceManager.AnonymousClass2.this.val$nonce, com.visa.cbp.sdk.facade.DASServiceManager.AnonymousClass2.this.val$kid, com.visa.cbp.sdk.facade.DASServiceManager.AnonymousClass2.this.val$serverDeviceID, com.visa.cbp.sdk.facade.DASServiceManager.access$600().valueOf(values, str), "", new com.visa.cbp.sdk.facade.DASService.ValidateKeyCallback() { // from class: com.visa.cbp.sdk.facade.DASServiceManager.2.1.1
                                        @Override // com.visa.cbp.sdk.facade.DASService.ValidateKeyCallback
                                        public void onResult(retrofit2.Response<com.visa.cbp.sdk.facade.ValidateDeviceAndGetKramResponse> response2) {
                                            response2.body().getEncKeyRam();
                                            com.visa.cbp.sdk.facade.DASServiceManager.AnonymousClass2.this.val$callback.onResult(response);
                                        }

                                        @Override // com.visa.cbp.sdk.facade.DASService.ValidateKeyCallback
                                        public void onError(com.visa.cbp.setDeviceCerts setdevicecerts) {
                                            com.visa.cbp.setVtsCerts.getTvls(com.visa.cbp.sdk.facade.DASServiceManager.access$000(), "validateAndGetKey ERROR");
                                            com.visa.cbp.sdk.facade.DASServiceManager.AnonymousClass2.this.val$callback.onError(setdevicecerts);
                                        }

                                        @Override // com.visa.cbp.sdk.facade.DASService.ValidateKeyCallback
                                        public void onError(com.visa.cbp.setDeviceCerts setdevicecerts, java.lang.String str2) {
                                            com.visa.cbp.setVtsCerts.getTvls(com.visa.cbp.sdk.facade.DASServiceManager.access$000(), "validateAndGetKey ERROR: ".concat(java.lang.String.valueOf(str2)));
                                            com.visa.cbp.sdk.facade.DASServiceManager.AnonymousClass2.this.val$callback.onError(setdevicecerts, str2);
                                        }

                                        @Override // com.visa.cbp.sdk.facade.DASService.ValidateKeyCallback
                                        public void onError(com.visa.cbp.setDeviceCerts setdevicecerts, java.lang.String str2, java.lang.String str3) {
                                            com.visa.cbp.setVtsCerts.getTvls(com.visa.cbp.sdk.facade.DASServiceManager.access$000(), "validateAndGetKey ERROR: ".concat(java.lang.String.valueOf(str2)));
                                            com.visa.cbp.setVtsCerts.getTvls(com.visa.cbp.sdk.facade.DASServiceManager.access$000(), "validateAndGetKey message: ".concat(java.lang.String.valueOf(str3)));
                                            com.visa.cbp.sdk.facade.DASServiceManager.AnonymousClass2.this.val$callback.onError(setdevicecerts, str2, str3);
                                        }
                                    });
                                } catch (java.lang.Exception unused) {
                                    com.visa.cbp.sdk.facade.DASServiceManager.AnonymousClass2.this.val$callback.onError(com.visa.cbp.setDeviceCerts.getCardData);
                                }
                            }

                            @Override // com.visa.cbp.sdk.facade.DASService.DeviceAttestationCallback
                            public void onError(int i, java.lang.Exception exc) {
                                com.visa.cbp.setVtsCerts.getTvls(com.visa.cbp.sdk.facade.DASServiceManager.access$000(), "performDeviceAttestation ERROR");
                                com.visa.cbp.sdk.facade.DASServiceManager.AnonymousClass2.this.val$callback.onError(com.visa.cbp.setDeviceCerts.getCardData);
                            }
                        });
                        return;
                    }
                }
                java.lang.String access$0003 = com.visa.cbp.sdk.facade.DASServiceManager.access$000();
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("GetServerNonce Error: ");
                sb3.append(response.code());
                com.visa.cbp.setVtsCerts.getTvls(access$0003, sb3.toString());
                this.val$callback.onError(com.visa.cbp.setDeviceCerts.getDate);
            } catch (java.lang.Exception e) {
                java.lang.String access$0004 = com.visa.cbp.sdk.facade.DASServiceManager.access$000();
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder("GetSeverNonce Error: ");
                sb4.append(e.getMessage());
                com.visa.cbp.setVtsCerts.getTvls(access$0004, sb4.toString());
                this.val$callback.onError(com.visa.cbp.setDeviceCerts.getDate);
            }
        }

        @Override // retrofit2.Callback
        public void onFailure(retrofit2.Call<com.visa.cbp.sdk.facade.GetServerNonceResponse> call, java.lang.Throwable th) {
            java.lang.String access$000 = com.visa.cbp.sdk.facade.DASServiceManager.access$000();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("GetSeverNonce onFailure: ");
            sb.append(th.getMessage());
            com.visa.cbp.setVtsCerts.getTvls(access$000, sb.toString());
            this.val$callback.onError(com.visa.cbp.setDeviceCerts.getDate);
        }
    }

    public void validateAndGetKram(final android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, com.visa.cbp.sdk.facade.ValidateDeviceRequest validateDeviceRequest, java.lang.String str4, final com.visa.cbp.sdk.facade.DASService.ValidateKeyCallback validateKeyCallback) {
        java.lang.String str5 = com.visa.cbp.getDeviceCerts.BuildConfig;
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(endPoint);
            sb.append("/vas/dpe/devices/{serverDeviceID}/validateandgetkey/");
            java.lang.String obj = sb.toString();
            java.lang.String constructPopToken = constructPopToken("POST", com.visa.cbp.getDeviceCerts.BuildConfig, str3, str, str2, new com.google.gson.Gson().toJson(validateDeviceRequest));
            com.visa.cbp.getDeviceCerts getdevicecerts = (com.visa.cbp.getDeviceCerts) getRetrofitClient(obj).create(com.visa.cbp.getDeviceCerts.class);
            if (com.visa.cbp.getOsType.valueOf().ConfirmReplenishRequest() == "CERT") {
                values = (ReplenishAckRequest + 13) % 128;
                str5 = com.visa.cbp.getDeviceCerts.BuildConfig.replace("/vts-sdk-kicdevint", "/vts-sdk-kiccert2");
                int i = ReplenishAckRequest + 47;
                values = i % 128;
                if (i % 2 == 0) {
                    int i2 = 2 / 3;
                }
            }
            java.lang.String replace = str5.replace("{serverDeviceID}", str3);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("Content-Type", "application/json");
            hashMap.put("Authorization", constructPopToken);
            hashMap.put("Accept", "application/json");
            hashMap.put("Cache-Control", "no-cache");
            java.lang.Object[] objArr = new java.lang.Object[1];
            a((byte) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 16), "&\b\u001b\u0005\r.\u0012&\u000f>㘎", (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 11, objArr);
            hashMap.put(((java.lang.String) objArr[0]).intern(), getAppPackageName(context));
            com.visa.cbp.setVtsCerts.getTvls(TAG, "Validate Getkey Call");
            getdevicecerts.values(replace, hashMap, validateDeviceRequest).enqueue(new retrofit2.Callback<com.visa.cbp.sdk.facade.ValidateDeviceAndGetKramResponse>() { // from class: com.visa.cbp.sdk.facade.DASServiceManager.3
                @Override // retrofit2.Callback
                public void onResponse(retrofit2.Call<com.visa.cbp.sdk.facade.ValidateDeviceAndGetKramResponse> call, retrofit2.Response<com.visa.cbp.sdk.facade.ValidateDeviceAndGetKramResponse> response) {
                    try {
                        int code = response.code();
                        if (code == 200) {
                            if (com.visa.cbp.sdk.facade.DASServiceManager.access$500(com.visa.cbp.sdk.facade.DASServiceManager.this, response.headers(), com.visa.cbp.getCertFormat.ConfirmReplenishRequest().ReplenishAckRequest())) {
                                com.visa.cbp.sdk.facade.DASServiceManager.access$600().BuildConfig(response.body());
                                com.visa.cbp.setVtsCerts.getTvls(com.visa.cbp.sdk.facade.DASServiceManager.access$000(), "ValidateAndGetkey Success");
                                validateKeyCallback.onResult(response);
                                return;
                            } else {
                                com.visa.cbp.setVtsCerts.getTvls(com.visa.cbp.sdk.facade.DASServiceManager.access$000(), "ValidateAndGetkey Error 1");
                                validateKeyCallback.onError(com.visa.cbp.setDeviceCerts.setContactNumber);
                                return;
                            }
                        }
                        if (code == 403) {
                            java.lang.String access$000 = com.visa.cbp.sdk.facade.DASServiceManager.access$000();
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("ValidateAndGetkey Root Detected: ");
                            sb2.append(response.headers().get(com.visa.cbp.sdk.facade.data.Constants.HEADER_CORRELATION_ID));
                            com.visa.cbp.setVtsCerts.getTvls(access$000, sb2.toString());
                            com.visa.cbp.CardMetadataUpdateResponse.valueOf(context);
                            com.visa.cbp.DigitalTicket.BuildConfig(context, null).values();
                            validateKeyCallback.onError(com.visa.cbp.setDeviceCerts.ReplenishRequest, response.headers().get(com.visa.cbp.sdk.facade.data.Constants.HEADER_CORRELATION_ID));
                            return;
                        }
                        if (code == 400) {
                            com.visa.cbp.setVtsCerts.getTvls(com.visa.cbp.sdk.facade.DASServiceManager.access$000(), "ValidateAndGetkey Error 2");
                            validateKeyCallback.onError(com.visa.cbp.setDeviceCerts.setDate, response.headers().get(com.visa.cbp.sdk.facade.data.Constants.HEADER_CORRELATION_ID));
                        } else {
                            if (code == 401) {
                                com.visa.cbp.setVtsCerts.getTvls(com.visa.cbp.sdk.facade.DASServiceManager.access$000(), "ValidateAndGetkey Error 3");
                                validateKeyCallback.onError(com.visa.cbp.setDeviceCerts.setVPanEnrollmentID, response.headers().get(com.visa.cbp.sdk.facade.data.Constants.HEADER_CORRELATION_ID));
                                return;
                            }
                            java.lang.String access$0002 = com.visa.cbp.sdk.facade.DASServiceManager.access$000();
                            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("ValidateAndGetkey Error 4: ");
                            sb3.append(response.code());
                            com.visa.cbp.setVtsCerts.getTvls(access$0002, sb3.toString());
                            validateKeyCallback.onError(com.visa.cbp.setDeviceCerts.getCardMetaData, response.headers().get(com.visa.cbp.sdk.facade.data.Constants.HEADER_CORRELATION_ID));
                        }
                    } catch (java.lang.Exception e) {
                        java.lang.String access$0003 = com.visa.cbp.sdk.facade.DASServiceManager.access$000();
                        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("ValidateAndGetkey Error 5: ");
                        sb4.append(e.getMessage());
                        com.visa.cbp.setVtsCerts.getTvls(access$0003, sb4.toString());
                        validateKeyCallback.onError(com.visa.cbp.setDeviceCerts.getCardMetaData, "", e.getMessage());
                    }
                }

                @Override // retrofit2.Callback
                public void onFailure(retrofit2.Call<com.visa.cbp.sdk.facade.ValidateDeviceAndGetKramResponse> call, java.lang.Throwable th) {
                    java.lang.String access$000 = com.visa.cbp.sdk.facade.DASServiceManager.access$000();
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("ValidateAndGetkey Error 6: ");
                    sb2.append(th.getMessage());
                    com.visa.cbp.setVtsCerts.getTvls(access$000, sb2.toString());
                    validateKeyCallback.onError(com.visa.cbp.setDeviceCerts.getCardMetaData, "", th.getMessage());
                }
            });
        } catch (java.lang.Exception e) {
            java.lang.String str6 = TAG;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("ValidateAndGetkey Error 7: ");
            sb2.append(e.getMessage());
            com.visa.cbp.setVtsCerts.getTvls(str6, sb2.toString());
            validateKeyCallback.onError(com.visa.cbp.setDeviceCerts.getCardMetaData, "", e.getMessage());
        }
    }

    private java.lang.String getAppPackageName(android.content.Context context) {
        java.lang.String str;
        try {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            try {
                java.lang.Object[] objArr = {context.getPackageName(), 0};
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a((byte) (92 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)), "\u0016&\u000e;\u001c\u000f\b\u0013\u001e\u0018\u001c&\u001e& \u0014'8\u0016(\r\u001e\u0006\u000b.\u0015&\u000f&\u0016.\u0015㙄", android.view.KeyEvent.normalizeMetaState(0) + 33, objArr2);
                java.lang.Class<?> cls = java.lang.Class.forName(((java.lang.String) objArr2[0]).intern());
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                a((byte) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 80), ".\u0015&,\r\u001e\u0006\u000b.\u0015>\u001b7\u001b", 14 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr3);
                java.lang.Object invoke = cls.getMethod(((java.lang.String) objArr3[0]).intern(), java.lang.String.class, java.lang.Integer.TYPE).invoke(packageManager, objArr);
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                a((byte) (117 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), "\u0016&\u000e;\u001c\u000f\b\u0013\u001e\u0018\u001c&\u001e& \u0014'8\u0016(\r\u001e\u0006\u000b.\u0015>\u001b7\u001b", (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 30, objArr4);
                java.lang.Class<?> cls2 = java.lang.Class.forName(((java.lang.String) objArr4[0]).intern());
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                a((byte) (15 - (android.view.ViewConfiguration.getScrollBarSize() >> 8)), "&\b\u001b\u0005\r.\u0012&\u000f>㘎", (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 11, objArr5);
                str = (java.lang.String) cls2.getField(((java.lang.String) objArr5[0]).intern()).get(invoke);
                ReplenishAckRequest = (values + 111) % 128;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            str = "";
        }
        ReplenishAckRequest = (values + 87) % 128;
        return str;
    }

    private static com.visa.cbp.sdk.facade.JwsAttestationResult decodeJWS(java.lang.String str) {
        com.visa.cbp.sdk.facade.JwsAttestationResult jwsAttestationResult = (com.visa.cbp.sdk.facade.JwsAttestationResult) new com.google.gson.Gson().fromJson(new java.lang.String(android.util.Base64.decode(str.split("[.]")[1], 8)), com.visa.cbp.sdk.facade.JwsAttestationResult.class);
        values = (ReplenishAckRequest + 61) % 128;
        return jwsAttestationResult;
    }

    private retrofit2.Retrofit getRetrofitClient(java.lang.String str) {
        okhttp3.OkHttpClient.Builder unsafeOkHttpClient = new com.visa.cbp.sdk.facade.DASServiceManager.UnsafeOkHttpClient().getUnsafeOkHttpClient();
        okhttp3.logging.HttpLoggingInterceptor httpLoggingInterceptor = new okhttp3.logging.HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(okhttp3.logging.HttpLoggingInterceptor.Level.BODY);
        unsafeOkHttpClient.addInterceptor(httpLoggingInterceptor);
        unsafeOkHttpClient.connectTimeout(120L, java.util.concurrent.TimeUnit.SECONDS);
        unsafeOkHttpClient.readTimeout(120L, java.util.concurrent.TimeUnit.SECONDS);
        unsafeOkHttpClient.writeTimeout(120L, java.util.concurrent.TimeUnit.SECONDS);
        retrofit2.Retrofit build = new retrofit2.Retrofit.Builder().baseUrl(str).client(unsafeOkHttpClient.build()).addConverterFactory(retrofit2.converter.gson.GsonConverterFactory.create()).build();
        ReplenishAckRequest = (values + 83) % 128;
        return build;
    }

    class UnsafeOkHttpClient {
        private UnsafeOkHttpClient() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public okhttp3.OkHttpClient.Builder getUnsafeOkHttpClient() {
            try {
                javax.net.ssl.TrustManager[] trustManagerArr = {new javax.net.ssl.X509TrustManager() { // from class: com.visa.cbp.sdk.facade.DASServiceManager.UnsafeOkHttpClient.1
                    @Override // javax.net.ssl.X509TrustManager
                    public void checkClientTrusted(java.security.cert.X509Certificate[] x509CertificateArr, java.lang.String str) throws java.security.cert.CertificateException {
                    }

                    @Override // javax.net.ssl.X509TrustManager
                    public void checkServerTrusted(java.security.cert.X509Certificate[] x509CertificateArr, java.lang.String str) throws java.security.cert.CertificateException {
                    }

                    @Override // javax.net.ssl.X509TrustManager
                    public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                        return new java.security.cert.X509Certificate[0];
                    }
                }};
                javax.net.ssl.SSLContext sSLContext = javax.net.ssl.SSLContext.getInstance("SSL");
                sSLContext.init(null, trustManagerArr, new java.security.SecureRandom());
                javax.net.ssl.SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
                okhttp3.OkHttpClient.Builder builder = new okhttp3.OkHttpClient.Builder();
                builder.sslSocketFactory(socketFactory, (javax.net.ssl.X509TrustManager) trustManagerArr[0]);
                builder.hostnameVerifier(new javax.net.ssl.HostnameVerifier() { // from class: com.visa.cbp.sdk.facade.DASServiceManager.UnsafeOkHttpClient.2
                    @Override // javax.net.ssl.HostnameVerifier
                    public boolean verify(java.lang.String str, javax.net.ssl.SSLSession sSLSession) {
                        return true;
                    }
                });
                return builder;
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException(e);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
    
        if (r8.getHeader().getAlgorithm().equals(com.nimbusds.jose.JWSAlgorithm.ES256) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean verifyPopToken(okhttp3.Headers headers, java.security.interfaces.ECPublicKey eCPublicKey) {
        com.nimbusds.jose.JWSObject parse;
        int i = values + 19;
        ReplenishAckRequest = i % 128;
        com.nimbusds.jose.crypto.ECDSAVerifier eCDSAVerifier = null;
        try {
            if (i % 2 != 0) {
                parse = com.nimbusds.jose.JWSObject.parse(headers.get(com.visa.cbp.ConsumerInfo.getEncryptionMetaData).split(";")[1].split(" ")[0]);
                if (parse.getHeader().getAlgorithm().equals(com.nimbusds.jose.JWSAlgorithm.ES256)) {
                    eCDSAVerifier = new com.nimbusds.jose.crypto.ECDSAVerifier(eCPublicKey);
                }
                boolean verify = parse.verify(eCDSAVerifier);
                int i2 = values + 101;
                ReplenishAckRequest = i2 % 128;
                if (i2 % 2 == 0) {
                    return verify;
                }
                throw new java.lang.ArithmeticException();
            }
            parse = com.nimbusds.jose.JWSObject.parse(headers.get(com.visa.cbp.ConsumerInfo.getEncryptionMetaData).split(";")[0].split(" ")[1]);
        } catch (java.lang.Exception unused) {
            return false;
        }
        return false;
    }

    private boolean verifyPopToken(okhttp3.Headers headers, byte[] bArr) {
        ReplenishAckRequest = (values + 117) % 128;
        try {
            com.nimbusds.jose.JWSObject parse = com.nimbusds.jose.JWSObject.parse(headers.get(com.visa.cbp.ConsumerInfo.getEncryptionMetaData).split(";")[0].split(" ")[1]);
            boolean verify = parse.verify(parse.getHeader().getAlgorithm().equals(com.nimbusds.jose.JWSAlgorithm.HS256) ? new com.nimbusds.jose.crypto.MACVerifier(bArr) : null);
            int i = values + 43;
            ReplenishAckRequest = i % 128;
            if (i % 2 == 0) {
                return verify;
            }
            throw new java.lang.ArithmeticException();
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    private java.lang.String constructPopToken(java.lang.String str, java.lang.String str2, java.lang.String... strArr) {
        try {
            com.visa.cbp.sdk.facade.POPTokenPayload pOPTokenPayload = new com.visa.cbp.sdk.facade.POPTokenPayload(str, strArr[0], strArr[1], str2.replace("{serverDeviceID}", dasServiceProcessor.valueOf()).replace("/vts-sdk-kicdevint", ""), com.visa.cbp.getCertFormat.BuildConfig());
            pOPTokenPayload.setHeaders(getHeaderHash());
            pOPTokenPayload.setAuth(getAuthHash());
            if (strArr.length == 4) {
                int i = ReplenishAckRequest + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                values = i % 128;
                pOPTokenPayload.setBody_hash(encodeSHA256(i % 2 == 0 ? strArr[4] : strArr[3]));
            }
            java.lang.String createJws = createJws(new com.google.gson.GsonBuilder().serializeNulls().create().toJson(pOPTokenPayload));
            if (createJws == null) {
                int i2 = values + 75;
                ReplenishAckRequest = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
                if (createJws.length() == 0) {
                    throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.setContactNumber);
                }
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("POP ");
            sb.append(createJws);
            sb.append("; ct=\"AUTHENTICATED_MESSAGE\"");
            return sb.toString();
        } catch (java.security.NoSuchAlgorithmException unused) {
            throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.getForegroundColor);
        }
    }

    private com.visa.cbp.sdk.facade.Headers getHeaderHash() throws java.security.NoSuchAlgorithmException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("");
        sb.append("Accept".toLowerCase());
        sb.append(io.ktor.sse.ServerSentEventKt.COLON);
        sb.append("application/json".toLowerCase());
        sb.append(com.visa.cbp.ConsumerInfo.setIssuerApplicationDiscretionaryData);
        java.lang.String obj = sb.toString();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(obj);
        sb2.append("Content-Type".toLowerCase());
        sb2.append(io.ktor.sse.ServerSentEventKt.COLON);
        sb2.append("application/json".toLowerCase());
        sb2.append(com.visa.cbp.ConsumerInfo.setIssuerApplicationDiscretionaryData);
        java.lang.String substring = sb2.toString().substring(0, r0.length() - 1);
        com.visa.cbp.sdk.facade.Headers headers = new com.visa.cbp.sdk.facade.Headers();
        headers.setHash(encodeSHA256(substring));
        ReplenishAckRequest = (values + 81) % 128;
        return headers;
    }

    private com.visa.cbp.sdk.facade.Auth getAuthHash() throws java.security.NoSuchAlgorithmException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("ct");
        java.lang.StringBuilder sb = new java.lang.StringBuilder(com.visa.cbp.ConsumerInfo.Signature);
        sb.append(com.visa.cbp.ConsumerInfo.setIssuerApplicationDiscretionaryData);
        java.lang.String substring = sb.toString().substring(0, r1.length() - 1);
        com.visa.cbp.sdk.facade.Auth auth = new com.visa.cbp.sdk.facade.Auth();
        auth.getParams().setNames(arrayList);
        auth.getParams().setHash(encodeSHA256(substring));
        ReplenishAckRequest = (values + 35) % 128;
        return auth;
    }

    private java.lang.String encodeSHA256(java.lang.String str) throws java.security.NoSuchAlgorithmException {
        values = (ReplenishAckRequest + 111) % 128;
        java.lang.String obj = com.nimbusds.jose.util.Base64URL.encode(java.security.MessageDigest.getInstance("SHA-256").digest(str.getBytes(java.nio.charset.StandardCharsets.UTF_8))).toString();
        ReplenishAckRequest = (values + 7) % 128;
        return obj;
    }

    private java.lang.String createJws(java.lang.String str) {
        com.nimbusds.jose.JWSObject jWSObject = new com.nimbusds.jose.JWSObject(new com.nimbusds.jose.JWSHeader.Builder(com.nimbusds.jose.JWSAlgorithm.HS256).type(new com.nimbusds.jose.JOSEObjectType("JOSE+ext.authenticated_message")).build(), new com.nimbusds.jose.Payload(str));
        try {
            jWSObject.sign(new com.nimbusds.jose.crypto.MACSigner(com.visa.cbp.getCertFormat.ConfirmReplenishRequest().ReplenishAckRequest()));
            java.lang.String serialize = jWSObject.serialize();
            int i = ReplenishAckRequest + 121;
            values = i % 128;
            if (i % 2 != 0) {
                return serialize;
            }
            throw new java.lang.ArithmeticException();
        } catch (java.lang.Exception e) {
            java.lang.String str2 = TAG;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("createJws error: ");
            sb.append(e.getMessage());
            com.visa.cbp.setVtsCerts.getTvls(str2, sb.toString());
            return null;
        }
    }

    public static java.lang.Long getServerTimeStamp() {
        int i = ReplenishAckRequest;
        values = (i + 59) % 128;
        long j = serverTimeStamp;
        values = (i + 73) % 128;
        return java.lang.Long.valueOf(j);
    }

    public static void setServerTimeStamp(java.lang.Long l) {
        int i = ReplenishAckRequest + 81;
        values = i % 128;
        if (i % 2 == 0) {
            serverTimeStamp = l.longValue();
            throw new java.lang.ArithmeticException();
        }
        serverTimeStamp = l.longValue();
        values = (ReplenishAckRequest + 51) % 128;
    }

    public static java.lang.Long getETWRTU() {
        int i = ReplenishAckRequest;
        values = (i + 101) % 128;
        long j = ETWRTU;
        int i2 = i + 39;
        values = i2 % 128;
        if (i2 % 2 != 0) {
            return java.lang.Long.valueOf(j);
        }
        throw null;
    }

    public static void setETWRTU(java.lang.Long l) {
        ReplenishAckRequest = (values + 103) % 128;
        ETWRTU = l.longValue();
        values = (ReplenishAckRequest + 15) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x013d, code lost:
    
        if (r2.valueOf == r2.ReplenishAckRequest) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x016d, code lost:
    
        r9 = new java.lang.Object[]{r2, r2, java.lang.Integer.valueOf(r4), r2, r2, java.lang.Integer.valueOf(r4), r2, r2, java.lang.Integer.valueOf(r4), r2, r2, java.lang.Integer.valueOf(r4), r2};
        r10 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-1991430142);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01bb, code lost:
    
        if (r10 != null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01bd, code lost:
    
        r10 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ((android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1)) - 1), 206 - (android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1)), 19 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
        r11 = new java.lang.Object[1];
        b((byte) 0, 0, 1, r11);
        r10 = r10.getMethod((java.lang.String) r11[0], java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-1991430142, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0244, code lost:
    
        if (((java.lang.Integer) ((java.lang.reflect.Method) r10).invoke(null, r9)).intValue() != r2.getTvls) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0246, code lost:
    
        com.visa.cbp.sdk.facade.DASServiceManager.$11 = (com.visa.cbp.sdk.facade.DASServiceManager.$10 + 27) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0250, code lost:
    
        r9 = new java.lang.Object[]{r2, r2, java.lang.Integer.valueOf(r4), java.lang.Integer.valueOf(r4), r2, r2, java.lang.Integer.valueOf(r4), java.lang.Integer.valueOf(r4), r2, java.lang.Integer.valueOf(r4), r2};
        r10 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-693002299);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x028d, code lost:
    
        if (r10 != null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x028f, code lost:
    
        r10 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (39552 - ((android.os.Process.getThreadPriority(0) + 20) >> 6)), 653 - android.view.View.MeasureSpec.getSize(0), android.graphics.Color.blue(0) + 20);
        r11 = new java.lang.Object[1];
        b((byte) 0, 0, 0, r11);
        r10 = r10.getMethod((java.lang.String) r11[0], java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-693002299, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x02fb, code lost:
    
        r8 = ((java.lang.Integer) ((java.lang.reflect.Method) r10).invoke(null, r9)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0308, code lost:
    
        r9 = r2.values;
        r10 = r2.getTvls;
        r5[r2.BuildConfig] = r3[r8];
        r5[r2.BuildConfig + 1] = r3[(r9 * r4) + r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x031c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x031d, code lost:
    
        r1 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0321, code lost:
    
        if (r1 != null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0323, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0324, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x032a, code lost:
    
        if (r2.ConfirmReplenishRequest != r2.values) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x032c, code lost:
    
        com.visa.cbp.sdk.facade.DASServiceManager.$11 = (com.visa.cbp.sdk.facade.DASServiceManager.$10 + 103) % 128;
        r2.getTokenInfo = ((r2.getTokenInfo + r4) - 1) % r4;
        r2.getTvls = ((r2.getTvls + r4) - 1) % r4;
        r8 = r2.ConfirmReplenishRequest;
        r9 = r2.getTokenInfo;
        r10 = r2.values;
        r11 = r2.getTvls;
        r5[r2.BuildConfig] = r3[(r8 * r4) + r9];
        r5[r2.BuildConfig + 1] = r3[(r10 * r4) + r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x035c, code lost:
    
        r8 = r2.ConfirmReplenishRequest;
        r9 = r2.getTvls;
        r10 = r2.values;
        r11 = r2.getTokenInfo;
        r5[r2.BuildConfig] = r3[(r8 * r4) + r9];
        r5[r2.BuildConfig + 1] = r3[(r10 * r4) + r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x037d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x037e, code lost:
    
        r1 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0382, code lost:
    
        if (r1 != null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0384, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0385, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0153, code lost:
    
        r5[r2.BuildConfig] = (char) (r2.valueOf - r29);
        r5[r2.BuildConfig + 1] = (char) (r2.ReplenishAckRequest - r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0151, code lost:
    
        if (r2.valueOf == r2.ReplenishAckRequest) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(byte b, java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2;
        int length;
        char[] cArr;
        int i3;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.visa.cbp.Signature signature = new com.visa.cbp.Signature();
        char[] cArr2 = ConfirmReplenishRequest;
        long j = 0;
        char c = 0;
        if (cArr2 != null) {
            int i4 = $10 + 99;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
                i3 = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i3 = 0;
            }
            while (i3 < length) {
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    objArr2[c] = java.lang.Integer.valueOf(cArr2[i3]);
                    java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(314573188);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (21400 - android.os.Process.getGidForName("")), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 1781, android.widget.ExpandableListView.getPackedPositionType(j) + 25)).getMethod("k", java.lang.Integer.TYPE);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(314573188, obj);
                    }
                    cArr[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i3++;
                    j = 0;
                    c = 0;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        try {
            java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(BuildConfig)};
            java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(314573188);
            if (obj2 == null) {
                obj2 = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 21402), 1780 - android.os.Process.getGidForName(""), 25 - android.graphics.Color.green(0))).getMethod("k", java.lang.Integer.TYPE);
                com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(314573188, obj2);
            }
            char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).charValue();
            char[] cArr3 = new char[i];
            if (i % 2 != 0) {
                int i5 = $11 + 119;
                $10 = i5 % 128;
                if (i5 % 2 != 0) {
                    i2 = i + 76;
                    cArr3[i2] = (char) (charArray[i2] >> b);
                } else {
                    i2 = i - 1;
                    cArr3[i2] = (char) (charArray[i2] - b);
                }
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                signature.BuildConfig = 0;
                while (signature.BuildConfig < i2) {
                    int i6 = $10 + 5;
                    $11 = i6 % 128;
                    if (i6 % 2 == 0) {
                        signature.valueOf = charArray[signature.BuildConfig];
                        signature.ReplenishAckRequest = charArray[signature.BuildConfig >>> 1];
                    } else {
                        signature.valueOf = charArray[signature.BuildConfig];
                        signature.ReplenishAckRequest = charArray[signature.BuildConfig + 1];
                    }
                    signature.BuildConfig += 2;
                }
            }
            for (int i7 = 0; i7 < i; i7++) {
                $10 = ($11 + 31) % 128;
                cArr3[i7] = (char) (cArr3[i7] ^ 13722);
            }
            objArr[0] = new java.lang.String(cArr3);
        } catch (java.lang.Throwable th2) {
            java.lang.Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    static void init$0() {
        $$a = new byte[]{com.google.common.base.Ascii.ESC, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -92, -58};
        $$b = 134;
    }

    static void BuildConfig() {
        ConfirmReplenishRequest = new char[]{34850, 34871, 34941, 34940, 34896, 34845, 34913, 34872, 34912, 34933, 34895, 34931, 34942, 34880, 34934, 34894, 34873, 34908, 34858, 34897, 34852, 34885, 34930, 34882, 34849, 34899, 34926, 34925, 34877, 34932, 34937, 34936, 34919, 34879, 34905, 34853, 34915, 34886, 34939, 34906, 34902, 34876, 34907, 34918, 34848, 34928, 34887, 34901, 34862, 34883, 34911, 34929, 34884, 34943, 34874, 34900, 34893, 34863, 34855, 34910, 34898, 34904, 34917, 34938};
        BuildConfig = (char) 48517;
    }
}
