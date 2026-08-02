package com.payair.hce;

/* loaded from: classes4.dex */
public final class onUploadUnlockKeys implements com.payair.hce.useDemoMode {
    private static int valueOf = 1;
    private static int writeReplace;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        return values(objArr);
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.getDefaultCardForContactlessPayments getdefaultcardforcontactlesspayments = (com.payair.hce.getDefaultCardForContactlessPayments) objArr[1];
        int i = writeReplace + 91;
        valueOf = i % 128;
        if (i % 2 == 0) {
            getdefaultcardforcontactlesspayments.valueOf();
            throw null;
        }
        com.payair.hce.reInitialize valueOf2 = getdefaultcardforcontactlesspayments.valueOf();
        int i2 = valueOf;
        writeReplace = ((i2 & 3) + (i2 | 3)) % 128;
        return valueOf2;
    }

    @Override // com.payair.hce.useDemoMode
    public final com.payair.hce.reInitialize values(com.payair.hce.getDefaultCardForContactlessPayments getdefaultcardforcontactlesspayments, com.payair.hce.removeCard removecard) {
        return (com.payair.hce.reInitialize) DigitizedCardProfile(new java.lang.Object[]{this, getdefaultcardforcontactlesspayments, removecard}, 1943541331, -1943541331, java.lang.System.identityHashCode(this));
    }
}
