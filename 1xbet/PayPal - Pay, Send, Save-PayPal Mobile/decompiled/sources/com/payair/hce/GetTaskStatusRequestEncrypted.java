package com.payair.hce;

/* loaded from: classes10.dex */
public final class GetTaskStatusRequestEncrypted {
    private static int DigitizedCardProfile = 0;
    private static int values = 1;

    @com.payair.hce.setSelectionFromTop(valueOf = "cardRiskManagementData")
    private com.payair.hce.getTransactionCredentialsStatus AlternateContactlessPaymentDataJson;

    @com.payair.hce.setSelectionFromTop(valueOf = "remotePaymentData")
    private com.payair.hce.NotifyProvisionResponseEncrypted valueOf;

    @com.payair.hce.setSelectionFromTop(valueOf = "contactlessPaymentData")
    private com.payair.hce.setTransactionCredentialsStatus writeReplace;

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i2;
        int i6 = i2 | i4;
        int i7 = (i * (-751)) + (i2 * (-751)) + (((~(i4 | i5)) | (~(i4 | i3))) * 1504) + ((~(i3 | i6)) * (-1504)) + (((~(i | i5)) | (~i6)) * 752);
        if (i7 == 1) {
            return DigitizedCardProfile(objArr);
        }
        if (i7 == 2) {
            return AlternateContactlessPaymentDataJson(objArr);
        }
        if (i7 == 3) {
            return values(objArr);
        }
        if (i7 == 4) {
            com.payair.hce.GetTaskStatusRequestEncrypted getTaskStatusRequestEncrypted = (com.payair.hce.GetTaskStatusRequestEncrypted) objArr[0];
            com.payair.hce.NotifyProvisionResponseEncrypted notifyProvisionResponseEncrypted = (com.payair.hce.NotifyProvisionResponseEncrypted) objArr[1];
            int i8 = (values + 83) % 128;
            DigitizedCardProfile = i8;
            getTaskStatusRequestEncrypted.valueOf = notifyProvisionResponseEncrypted;
            values = ((((i8 | 38) << 1) - (i8 ^ 38)) - 1) % 128;
            return null;
        }
        if (i7 != 5) {
            return writeReplace(objArr);
        }
        com.payair.hce.GetTaskStatusRequestEncrypted getTaskStatusRequestEncrypted2 = (com.payair.hce.GetTaskStatusRequestEncrypted) objArr[0];
        int i9 = DigitizedCardProfile;
        values = (i9 + 43) % 128;
        com.payair.hce.setTransactionCredentialsStatus settransactioncredentialsstatus = getTaskStatusRequestEncrypted2.writeReplace;
        values = ((i9 & 113) + (i9 | 113)) % 128;
        return settransactioncredentialsstatus;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.GetTaskStatusRequestEncrypted getTaskStatusRequestEncrypted = (com.payair.hce.GetTaskStatusRequestEncrypted) objArr[0];
        com.payair.hce.setTransactionCredentialsStatus settransactioncredentialsstatus = (com.payair.hce.setTransactionCredentialsStatus) objArr[1];
        int i = (values + 9) % 128;
        DigitizedCardProfile = i;
        getTaskStatusRequestEncrypted.writeReplace = settransactioncredentialsstatus;
        int i2 = ((i ^ 99) | (i & 99)) << 1;
        int i3 = -((i & (-100)) | ((~i) & 99));
        int i4 = (i2 & i3) + (i2 | i3);
        values = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.GetTaskStatusRequestEncrypted getTaskStatusRequestEncrypted = (com.payair.hce.GetTaskStatusRequestEncrypted) objArr[0];
        int i = values;
        int i2 = i & 85;
        int i3 = ((i ^ 85) | i2) << 1;
        int i4 = -((i | 85) & (~i2));
        int i5 = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
        DigitizedCardProfile = i5;
        com.payair.hce.NotifyProvisionResponseEncrypted notifyProvisionResponseEncrypted = getTaskStatusRequestEncrypted.valueOf;
        int i6 = i5 & 89;
        int i7 = (((i5 | 89) & (~i6)) - (~(-(-(i6 << 1))))) - 1;
        values = i7 % 128;
        if (i7 % 2 != 0) {
            return notifyProvisionResponseEncrypted;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.GetTaskStatusRequestEncrypted getTaskStatusRequestEncrypted = (com.payair.hce.GetTaskStatusRequestEncrypted) objArr[0];
        int i = values;
        int i2 = (i ^ 125) + ((i & 125) << 1);
        int i3 = i2 % 128;
        DigitizedCardProfile = i3;
        com.payair.hce.getTransactionCredentialsStatus gettransactioncredentialsstatus = getTaskStatusRequestEncrypted.AlternateContactlessPaymentDataJson;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = ((i3 ^ 38) + ((i3 & 38) << 1)) - 1;
        values = i4 % 128;
        if (i4 % 2 != 0) {
            return gettransactioncredentialsstatus;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.GetTaskStatusRequestEncrypted getTaskStatusRequestEncrypted = (com.payair.hce.GetTaskStatusRequestEncrypted) objArr[0];
        com.payair.hce.getTransactionCredentialsStatus gettransactioncredentialsstatus = (com.payair.hce.getTransactionCredentialsStatus) objArr[1];
        int i = DigitizedCardProfile;
        values = ((i ^ 95) + ((i & 95) << 1)) % 128;
        getTaskStatusRequestEncrypted.AlternateContactlessPaymentDataJson = gettransactioncredentialsstatus;
        int i2 = (-2) - (~((i ^ 62) + ((i & 62) << 1)));
        values = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public final void values(com.payair.hce.getTransactionCredentialsStatus gettransactioncredentialsstatus) {
        writeReplace(new java.lang.Object[]{this, gettransactioncredentialsstatus}, 1215698523, -1215698521, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.getTransactionCredentialsStatus DigitizedCardProfile() {
        return (com.payair.hce.getTransactionCredentialsStatus) writeReplace(new java.lang.Object[]{this}, 1973004519, -1973004516, java.lang.System.identityHashCode(this));
    }

    public final void DigitizedCardProfile(com.payair.hce.NotifyProvisionResponseEncrypted notifyProvisionResponseEncrypted) {
        writeReplace(new java.lang.Object[]{this, notifyProvisionResponseEncrypted}, -422828516, 422828520, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.NotifyProvisionResponseEncrypted writeReplace() {
        return (com.payair.hce.NotifyProvisionResponseEncrypted) writeReplace(new java.lang.Object[]{this}, 1109463870, -1109463869, java.lang.System.identityHashCode(this));
    }

    public final void valueOf(com.payair.hce.setTransactionCredentialsStatus settransactioncredentialsstatus) {
        writeReplace(new java.lang.Object[]{this, settransactioncredentialsstatus}, -1871813025, 1871813025, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.setTransactionCredentialsStatus AlternateContactlessPaymentDataJson() {
        return (com.payair.hce.setTransactionCredentialsStatus) writeReplace(new java.lang.Object[]{this}, 1726673286, -1726673281, java.lang.System.identityHashCode(this));
    }
}
