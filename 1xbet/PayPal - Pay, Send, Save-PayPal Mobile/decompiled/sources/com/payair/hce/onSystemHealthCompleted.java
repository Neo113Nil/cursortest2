package com.payair.hce;

/* loaded from: classes4.dex */
public final class onSystemHealthCompleted {
    private static int getProfileVersion = 1;
    private static int values;
    private com.payair.hce.useDemoMode AlternateContactlessPaymentDataJson;
    private com.payair.hce.initContext DigitizedCardProfile;
    private com.payair.hce.smallInitialization valueOf;
    private com.payair.hce.setUpMCBP writeReplace;

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ~(i3 | i2);
        int i6 = (i * (-391)) + (i2 * (-195)) + (((~(i4 | i)) | i5) * (-196)) + ((i2 | i) * my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY) + (((~((~i) | i4)) | i5) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE);
        if (i6 == 1) {
            return writeReplace(objArr);
        }
        if (i6 != 2) {
            return i6 != 3 ? valueOf(objArr) : AlternateContactlessPaymentDataJson(objArr);
        }
        com.payair.hce.onSystemHealthCompleted onsystemhealthcompleted = (com.payair.hce.onSystemHealthCompleted) objArr[0];
        int i7 = getProfileVersion;
        values = (((i7 & (-32)) | ((~i7) & 31)) + ((i7 & 31) << 1)) % 128;
        com.payair.hce.setUpMCBP setupmcbp = onsystemhealthcompleted.writeReplace;
        values = (i7 + 13) % 128;
        return setupmcbp;
    }

    public onSystemHealthCompleted(com.payair.hce.useDemoMode usedemomode, com.payair.hce.initContext initcontext, com.payair.hce.setUpMCBP setupmcbp, com.payair.hce.smallInitialization smallinitialization) {
        this.AlternateContactlessPaymentDataJson = usedemomode;
        this.DigitizedCardProfile = initcontext;
        this.writeReplace = setupmcbp;
        this.valueOf = smallinitialization;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.onSystemHealthCompleted onsystemhealthcompleted = (com.payair.hce.onSystemHealthCompleted) objArr[0];
        int i = values;
        getProfileVersion = (i + 91) % 128;
        com.payair.hce.useDemoMode usedemomode = onsystemhealthcompleted.AlternateContactlessPaymentDataJson;
        int i2 = i & 77;
        int i3 = (i2 - (~(-(-((i ^ 77) | i2))))) - 1;
        getProfileVersion = i3 % 128;
        if (i3 % 2 != 0) {
            return usedemomode;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.onSystemHealthCompleted onsystemhealthcompleted = (com.payair.hce.onSystemHealthCompleted) objArr[0];
        int i = getProfileVersion + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        int i2 = i % 128;
        values = i2;
        com.payair.hce.initContext initcontext = onsystemhealthcompleted.DigitizedCardProfile;
        if (i % 2 != 0) {
            throw null;
        }
        int i3 = ((i2 ^ 47) | (i2 & 47)) << 1;
        int i4 = -((i2 & (-48)) | ((~i2) & 47));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        getProfileVersion = i5 % 128;
        if (i5 % 2 != 0) {
            return initcontext;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.onSystemHealthCompleted onsystemhealthcompleted = (com.payair.hce.onSystemHealthCompleted) objArr[0];
        int i = getProfileVersion;
        int i2 = i & 13;
        int i3 = (i | 13) & (~i2);
        int i4 = -(-(i2 << 1));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        int i6 = i5 % 128;
        values = i6;
        com.payair.hce.smallInitialization smallinitialization = onsystemhealthcompleted.valueOf;
        if (i5 % 2 != 0) {
            throw null;
        }
        int i7 = (-2) - (~((i6 & 72) + (i6 | 72)));
        getProfileVersion = i7 % 128;
        if (i7 % 2 != 0) {
            return smallinitialization;
        }
        throw null;
    }

    public final com.payair.hce.smallInitialization AlternateContactlessPaymentDataJson() {
        return (com.payair.hce.smallInitialization) valueOf(new java.lang.Object[]{this}, 862517323, -862517320, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.setUpMCBP DigitizedCardProfile() {
        return (com.payair.hce.setUpMCBP) valueOf(new java.lang.Object[]{this}, -1376714403, 1376714405, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.initContext writeReplace() {
        return (com.payair.hce.initContext) valueOf(new java.lang.Object[]{this}, 1927097451, -1927097451, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.useDemoMode valueOf() {
        return (com.payair.hce.useDemoMode) valueOf(new java.lang.Object[]{this}, -790387121, 790387122, java.lang.System.identityHashCode(this));
    }
}
