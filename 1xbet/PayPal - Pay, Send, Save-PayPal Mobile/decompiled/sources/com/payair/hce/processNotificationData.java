package com.payair.hce;

/* loaded from: classes4.dex */
public final class processNotificationData {
    private static com.payair.hce.cancelPendingRequests DigitizedCardProfile = null;
    private static boolean IccPrivateKeyCrtComponentsJson = false;
    private static long RecordsJson = 0;
    private static int SdkCoreAlternateContactlessPaymentDataImpl = 0;
    private static boolean getAid = false;
    private static int getCiacDecline = 0;
    private static int getPaymentFci = 1;
    private static char[] getProfileVersion;
    private com.payair.hce.initContext AlternateContactlessPaymentDataJson;
    private com.payair.hce.setPinIvCvc3Track2 valueOf = com.payair.hce.setMaximumPinTry.valueOf();
    private boolean values;
    private com.payair.hce.onSystemHealthFailure writeReplace;

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        boolean z = false;
        long DigitizedCardProfile2 = ((com.payair.hce.processNotificationData) objArr[0]).AlternateContactlessPaymentDataJson.DigitizedCardProfile();
        if (DigitizedCardProfile2 >= 0 && DigitizedCardProfile2 > RecordsJson) {
            int i4 = getCiacDecline + 49;
            getPaymentFci = i4 % 128;
            if (i4 % 2 != 0) {
                z = true;
            }
        }
        RecordsJson = DigitizedCardProfile2;
        if (!z) {
            return null;
        }
        DigitizedCardProfile.writeReplace();
        int i5 = getPaymentFci + 73;
        getCiacDecline = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        int i6 = 3 / 5;
        return null;
    }

    static {
        valueOf();
        RecordsJson = -1L;
        getCiacDecline = (getPaymentFci + 35) % 128;
    }

    public processNotificationData(com.payair.hce.initContext initcontext) {
        this.AlternateContactlessPaymentDataJson = initcontext;
        com.payair.hce.onTaskStatusFailed ontaskstatusfailed = new com.payair.hce.onTaskStatusFailed();
        this.writeReplace = (com.payair.hce.onSystemHealthFailure) com.payair.hce.onTaskStatusFailed.valueOf(new java.lang.Object[]{ontaskstatusfailed}, 98491756, -98491756, java.lang.System.identityHashCode(ontaskstatusfailed));
        if (DigitizedCardProfile == null) {
            DigitizedCardProfile = new com.payair.hce.cancelPendingRequests();
        }
    }

    public final void writeReplace() {
        int i = getCiacDecline + 83;
        getPaymentFci = i % 128;
        if (i % 2 != 0) {
            this.values = this.AlternateContactlessPaymentDataJson.valueOf();
        } else {
            this.values = this.AlternateContactlessPaymentDataJson.valueOf();
            throw null;
        }
    }

    public final void AlternateContactlessPaymentDataJson() {
        int i = getCiacDecline + 83;
        getPaymentFci = i % 128;
        if (i % 2 == 0) {
            DigitizedCardProfile.DigitizedCardProfile();
            android.view.KeyEvent.getMaxKeyCode();
            new java.lang.Object[0][0] = java.lang.Integer.valueOf(DigitizedCardProfile.AlternateContactlessPaymentDataJson());
        } else {
            DigitizedCardProfile.DigitizedCardProfile();
            android.view.KeyEvent.getMaxKeyCode();
            new java.lang.Object[]{java.lang.Integer.valueOf(DigitizedCardProfile.AlternateContactlessPaymentDataJson())};
        }
    }

    public final boolean DigitizedCardProfile() {
        int i = getCiacDecline;
        int i2 = i + 115;
        getPaymentFci = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        boolean z = this.values;
        int i3 = i + 9;
        getPaymentFci = i3 % 128;
        if (i3 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final boolean valueOf(com.payair.hce.setNewDefaultCardForContactlessPayments setnewdefaultcardforcontactlesspayments) {
        boolean z;
        com.payair.hce.onSystemHealthFailure onsystemhealthfailure = this.writeReplace;
        long longValue = ((java.lang.Long) com.payair.hce.onSystemHealthFailure.valueOf(new java.lang.Object[]{onsystemhealthfailure, setnewdefaultcardforcontactlesspayments}, -99293849, 99293850, java.lang.System.identityHashCode(onsystemhealthfailure))).longValue();
        int AlternateContactlessPaymentDataJson = DigitizedCardProfile.AlternateContactlessPaymentDataJson();
        com.payair.hce.onSystemHealthFailure onsystemhealthfailure2 = this.writeReplace;
        if (AlternateContactlessPaymentDataJson < ((java.lang.Integer) com.payair.hce.onSystemHealthFailure.valueOf(new java.lang.Object[]{onsystemhealthfailure2, setnewdefaultcardforcontactlesspayments}, -697877363, 697877363, java.lang.System.identityHashCode(onsystemhealthfailure2))).intValue()) {
            getPaymentFci = (getCiacDecline + 41) % 128;
            z = true;
        } else {
            z = false;
        }
        if (setnewdefaultcardforcontactlesspayments == com.payair.hce.setNewDefaultCardForContactlessPayments.values) {
            return z;
        }
        if (z) {
            long j = RecordsJson;
            if (j >= longValue) {
                int i = getPaymentFci + 53;
                getCiacDecline = i % 128;
                if (i % 2 == 0 ? j >= 0 : j >= 0) {
                    return true;
                }
            }
        }
        int i2 = getPaymentFci + 83;
        getCiacDecline = i2 % 128;
        if (i2 % 2 == 0) {
            return false;
        }
        throw null;
    }

    static void valueOf() {
        getProfileVersion = new char[]{11072, 11085, 11121, 11132, 11073, 11124, 11083, 11122, 10941, 11105, 11087, 11086, 11134, 11082, 10910, 11120, 10889, 11074, 11075, 11081, 10928};
        SdkCoreAlternateContactlessPaymentDataImpl = -143185187;
        IccPrivateKeyCrtComponentsJson = true;
        getAid = true;
    }

    public final void values() {
        writeReplace(new java.lang.Object[]{this}, -1366931947, 1366931947, java.lang.System.identityHashCode(this));
    }
}
