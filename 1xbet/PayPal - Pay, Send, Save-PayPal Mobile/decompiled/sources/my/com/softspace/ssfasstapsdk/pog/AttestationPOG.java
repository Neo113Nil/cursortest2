package my.com.softspace.ssfasstapsdk.pog;

/* loaded from: classes17.dex */
public interface AttestationPOG {

    public interface AttestationEvent {
        void onAttestationFinished(int i, java.util.List<my.com.softspace.ssfasstapsdk.pog.RecoverableAction> list);
    }

    @java.lang.Deprecated
    public interface POGLibraryEvent {
        void setRandomSeed(byte[] bArr);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface POGStatusCodes {
        public static final int RST_BUFFER_OVERFLOW = 6;
        public static final int RST_BUFFER_UNDERFLOW = 5;
        public static final int RST_GENERAL_BUSINESS_ERROR = 2;
        public static final int RST_GENERAL_ERROR = 1;
        public static final int RST_GOOGLE_PLAY_SERVICE_ERROR = 11;
        public static final int RST_INVALID_ARGUMENT = 3;
        public static final int RST_INVALID_STATE = 4;
        public static final int RST_LIB_INVALID_KEY = 256;
        public static final int RST_NOT_INIT = -1;
        public static final int RST_NOT_PERMIT = 8;
        public static final int RST_NO_PERMISSION = -2;
        public static final int RST_NULL_POINTER = 7;
        public static final int RST_OK = 0;
        public static final int RST_OUT_OF_MEMORY = 9;
        public static final int RST_POG_ACTIVATION_SCRP_FAIL = 522;
        public static final int RST_POG_ATTEST_COTS_FAIL = 520;
        public static final int RST_POG_ATTEST_SCRP_FAIL = 521;
        public static final int RST_POG_CERTIFICATE_NOT_FOUND = 518;
        public static final int RST_POG_CRYPTO_ERROR = 516;
        public static final int RST_POG_DIFF_SCRP_ID = 770;
        public static final int RST_POG_DIFF_USER_ID = 769;
        public static final int RST_POG_DUKPT_KEY_INVALID = 515;
        public static final int RST_POG_INVALID_CA_CERTIFICATE = 519;
        public static final int RST_POG_INVALID_CERTIFICATE = 517;
        public static final int RST_POG_INVALID_RESPONSE = 259;
        public static final int RST_POG_KEY_EXCHANGE_FAIL = 524;
        public static final int RST_POG_KEY_INVALID = 514;
        public static final int RST_POG_NETWORK_ERROR = 258;
        public static final int RST_POG_NO_ENTRY = 257;
        public static final int RST_POG_NO_KEY = 513;
        public static final int RST_POG_PROVISION_FAIL = 523;
        public static final int RST_SAFETYNET_ERROR = 12;
        public static final int RST_TODO = 10;
    }

    void attest(android.content.Context context, java.util.HashMap<java.lang.String, java.lang.String> hashMap, my.com.softspace.ssfasstapsdk.pog.AttestationPOG.AttestationEvent attestationEvent);

    void attest(android.content.Context context, java.util.HashMap<java.lang.String, java.lang.String> hashMap, my.com.softspace.ssfasstapsdk.pog.AttestationPOG.AttestationEvent attestationEvent, boolean z, boolean z2);

    void attest(android.content.Context context, my.com.softspace.ssfasstapsdk.pog.AttestationPOG.AttestationEvent attestationEvent);

    void attest(android.content.Context context, my.com.softspace.ssfasstapsdk.pog.AttestationPOG.AttestationEvent attestationEvent, boolean z, boolean z2);

    void cancelPin();

    java.lang.Object[] cmac(android.content.Context context, byte[] bArr);

    int confirmResetProvision(android.content.Context context, java.lang.String str);

    java.lang.Object[] cryptoOperation(android.content.Context context, boolean z, byte[] bArr, boolean z2);

    java.lang.String getCurrentTOTP(android.content.Context context);

    my.com.softspace.ssfasstapsdk.pog.AttestationInstanceInfo getInstanceInfo();

    my.com.softspace.ssfasstapsdk.pog.POGServiceStatus getLastServiceStatus();

    long getLatestAttestationTimeTaken();

    java.lang.String getServiceAppName();

    java.lang.String getServiceAppVersion();

    java.lang.String getVerifyTOTPURL();

    java.lang.Object[] hmacSHA256(android.content.Context context, byte[] bArr);

    int login(android.content.Context context, java.lang.String str);

    void loginWithResetProvision(android.content.Context context, java.lang.String str, my.com.softspace.ssfasstapsdk.pog.AttestationPOG.AttestationEvent attestationEvent);

    void logout(android.content.Context context);

    int resetAttestationCache();

    void setPOGLibraryEvent(my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGLibraryEvent pOGLibraryEvent);
}
