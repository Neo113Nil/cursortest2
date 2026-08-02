package com.payair.hce;

/* loaded from: classes4.dex */
abstract class setVerticalScrollBarEnabled implements com.payair.hce.getApplicationInfo, com.payair.hce.getPackageName {
    private static int DigitizedCardProfile = 0;
    private static int values = 1;
    com.payair.hce.suspendCardForToken AlternateContactlessPaymentDataJson;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = (i * (-432)) + (i2 * 434) + ((~((~i3) | i4 | i2)) * 433) + (((~((~i2) | i3)) | i4) * (-433)) + (((~(i | i2)) | (~(i3 | i4))) * 433);
        if (i5 == 1) {
            return values(objArr);
        }
        if (i5 == 2) {
            return DigitizedCardProfile(objArr);
        }
        if (i5 != 3) {
            return AlternateContactlessPaymentDataJson(objArr);
        }
        int i6 = values;
        int i7 = ((i6 | 58) << 1) - (i6 ^ 58);
        DigitizedCardProfile = ((~i7) + (i7 << 1)) % 128;
        return null;
    }

    abstract void AlternateContactlessPaymentDataJson(com.payair.hce.getMDESCardsUniqueTokenReferences getmdescardsuniquetokenreferences);

    setVerticalScrollBarEnabled() {
    }

    void valueOf(com.payair.hce.suspendCardForToken suspendcardfortoken) {
        int i = values;
        DigitizedCardProfile = ((i ^ 125) + ((i & 125) << 1)) % 128;
        this.AlternateContactlessPaymentDataJson = suspendcardfortoken;
        int i2 = i | 77;
        int i3 = i2 << 1;
        int i4 = -(i2 & (~(i & 77)));
        DigitizedCardProfile = ((i3 ^ i4) + ((i4 & i3) << 1)) % 128;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setVerticalScrollBarEnabled setverticalscrollbarenabled = (com.payair.hce.setVerticalScrollBarEnabled) objArr[0];
        int i = (values + 79) % 128;
        DigitizedCardProfile = i;
        com.payair.hce.suspendCardForToken suspendcardfortoken = setverticalscrollbarenabled.AlternateContactlessPaymentDataJson;
        int i2 = (-2) - (~(i + 80));
        values = i2 % 128;
        if (i2 % 2 != 0) {
            return suspendcardfortoken;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        int i = DigitizedCardProfile;
        int i2 = i & 57;
        int i3 = (i ^ 57) | i2;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        values = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        int i = DigitizedCardProfile;
        int i2 = i & 101;
        int i3 = ((i | 101) & (~i2)) + (i2 << 1);
        values = i3 % 128;
        if (i3 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // com.payair.hce.getApplicationInfo
    public final void writeReplace(com.payair.hce.sendRequest sendrequest, com.payair.hce.replenishToken replenishtoken, java.lang.Exception exc) {
        DigitizedCardProfile(new java.lang.Object[]{this, sendrequest, replenishtoken, exc}, -823238588, 823238591, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.getApplicationInfo
    public final void AlternateContactlessPaymentDataJson(com.payair.hce.sendRequest sendrequest, java.lang.Exception exc) {
        DigitizedCardProfile(new java.lang.Object[]{this, sendrequest, exc}, -943928709, 943928709, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.getApplicationInfo
    public final void valueOf(com.payair.hce.sendRequest sendrequest, com.payair.hce.setSelectedCard setselectedcard) {
        DigitizedCardProfile(new java.lang.Object[]{this, sendrequest, setselectedcard}, -910863184, 910863186, java.lang.System.identityHashCode(this));
    }

    final com.payair.hce.suspendCardForToken getProfileVersion() {
        return (com.payair.hce.suspendCardForToken) DigitizedCardProfile(new java.lang.Object[]{this}, 650030923, -650030922, java.lang.System.identityHashCode(this));
    }
}
