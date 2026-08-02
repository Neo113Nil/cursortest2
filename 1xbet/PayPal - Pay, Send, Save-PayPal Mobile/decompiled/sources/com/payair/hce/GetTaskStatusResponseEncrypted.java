package com.payair.hce;

/* loaded from: classes10.dex */
public final class GetTaskStatusResponseEncrypted {
    private static int IccPrivateKeyCrtComponentsJson = 0;
    private static int SdkCoreAlternateContactlessPaymentDataImpl = 1;

    @com.payair.hce.setSelectionFromTop(valueOf = "u")
    private java.lang.String AlternateContactlessPaymentDataJson;

    @com.payair.hce.setSelectionFromTop(valueOf = "q")
    private java.lang.String DigitizedCardProfile;

    @com.payair.hce.setSelectionFromTop(valueOf = "p")
    private java.lang.String valueOf;

    @com.payair.hce.setSelectionFromTop(valueOf = "dp")
    private java.lang.String values;

    @com.payair.hce.setSelectionFromTop(valueOf = "dq")
    private java.lang.String writeReplace;

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        switch ((i * 303) + (i2 * (-301)) + (((~((~i3) | i4 | i2)) | (~(i | i2 | i3))) * (-302)) + ((~(i4 | i2 | i3)) * (-604)) + (((~(i | (~i2))) | (~(i2 | i3))) * 302)) {
            case 1:
                return values(objArr);
            case 2:
                com.payair.hce.GetTaskStatusResponseEncrypted getTaskStatusResponseEncrypted = (com.payair.hce.GetTaskStatusResponseEncrypted) objArr[0];
                int i5 = SdkCoreAlternateContactlessPaymentDataImpl;
                int i6 = i5 & 33;
                int i7 = i5 | 33;
                IccPrivateKeyCrtComponentsJson = ((i6 & i7) + (i6 | i7)) % 128;
                java.lang.String str = getTaskStatusResponseEncrypted.values;
                IccPrivateKeyCrtComponentsJson = ((i5 & 69) + (i5 | 69)) % 128;
                return str;
            case 3:
                return AlternateContactlessPaymentDataJson(objArr);
            case 4:
                return DigitizedCardProfile(objArr);
            case 5:
                return writeReplace(objArr);
            case 6:
                return SdkCoreAlternateContactlessPaymentDataImpl(objArr);
            case 7:
                return getProfileVersion(objArr);
            case 8:
                com.payair.hce.GetTaskStatusResponseEncrypted getTaskStatusResponseEncrypted2 = (com.payair.hce.GetTaskStatusResponseEncrypted) objArr[0];
                java.lang.String str2 = (java.lang.String) objArr[1];
                int i8 = SdkCoreAlternateContactlessPaymentDataImpl;
                int i9 = i8 ^ 57;
                IccPrivateKeyCrtComponentsJson = ((((i8 & 57) | i9) << 1) - i9) % 128;
                getTaskStatusResponseEncrypted2.valueOf = str2.toUpperCase();
                int i10 = SdkCoreAlternateContactlessPaymentDataImpl;
                IccPrivateKeyCrtComponentsJson = ((i10 ^ 109) + ((i10 & 109) << 1)) % 128;
                return null;
            case 9:
                com.payair.hce.GetTaskStatusResponseEncrypted getTaskStatusResponseEncrypted3 = (com.payair.hce.GetTaskStatusResponseEncrypted) objArr[0];
                int i11 = SdkCoreAlternateContactlessPaymentDataImpl;
                int i12 = i11 & 117;
                int i13 = (~i12) & (i11 | 117);
                int i14 = i12 << 1;
                IccPrivateKeyCrtComponentsJson = ((i13 ^ i14) + ((i14 & i13) << 1)) % 128;
                java.lang.String str3 = getTaskStatusResponseEncrypted3.DigitizedCardProfile;
                IccPrivateKeyCrtComponentsJson = (i11 + 33) % 128;
                return str3;
            default:
                return valueOf(objArr);
        }
    }

    private static /* synthetic */ java.lang.Object SdkCoreAlternateContactlessPaymentDataImpl(java.lang.Object[] objArr) {
        com.payair.hce.GetTaskStatusResponseEncrypted getTaskStatusResponseEncrypted = (com.payair.hce.GetTaskStatusResponseEncrypted) objArr[0];
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = i & 27;
        int i3 = i2 + ((i ^ 27) | i2);
        SdkCoreAlternateContactlessPaymentDataImpl = i3 % 128;
        java.lang.String str = getTaskStatusResponseEncrypted.valueOf;
        if (i3 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        int i4 = i & 3;
        int i5 = (i ^ 3) | i4;
        int i6 = (i4 & i5) + (i5 | i4);
        SdkCoreAlternateContactlessPaymentDataImpl = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.GetTaskStatusResponseEncrypted getTaskStatusResponseEncrypted = (com.payair.hce.GetTaskStatusResponseEncrypted) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = i & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        SdkCoreAlternateContactlessPaymentDataImpl = ((((i | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) & (~i2)) - (~(-(-(i2 << 1))))) - 1) % 128;
        getTaskStatusResponseEncrypted.DigitizedCardProfile = str.toUpperCase();
        int i3 = SdkCoreAlternateContactlessPaymentDataImpl;
        int i4 = i3 & 87;
        int i5 = -(-((i3 ^ 87) | i4));
        int i6 = (i4 & i5) + (i5 | i4);
        IccPrivateKeyCrtComponentsJson = i6 % 128;
        if (i6 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object getProfileVersion(java.lang.Object[] objArr) {
        com.payair.hce.GetTaskStatusResponseEncrypted getTaskStatusResponseEncrypted = (com.payair.hce.GetTaskStatusResponseEncrypted) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = SdkCoreAlternateContactlessPaymentDataImpl;
        int i2 = (i ^ 102) + ((i & 102) << 1);
        int i3 = (~i2) + (i2 << 1);
        IccPrivateKeyCrtComponentsJson = i3 % 128;
        if (i3 % 2 == 0) {
            getTaskStatusResponseEncrypted.values = str.toUpperCase();
            int i4 = SdkCoreAlternateContactlessPaymentDataImpl;
            int i5 = i4 ^ 23;
            int i6 = ((i4 & 23) | i5) << 1;
            int i7 = -i5;
            int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
            IccPrivateKeyCrtComponentsJson = i8 % 128;
            if (i8 % 2 == 0) {
                return null;
            }
            throw null;
        }
        getTaskStatusResponseEncrypted.values = str.toUpperCase();
        throw null;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.GetTaskStatusResponseEncrypted getTaskStatusResponseEncrypted = (com.payair.hce.GetTaskStatusResponseEncrypted) objArr[0];
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = (i & (-26)) | ((~i) & 25);
        int i3 = -(-((i & 25) << 1));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        int i5 = i4 % 128;
        SdkCoreAlternateContactlessPaymentDataImpl = i5;
        java.lang.String str = getTaskStatusResponseEncrypted.writeReplace;
        if (i4 % 2 == 0) {
            throw null;
        }
        int i6 = i5 + 121;
        IccPrivateKeyCrtComponentsJson = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.GetTaskStatusResponseEncrypted getTaskStatusResponseEncrypted = (com.payair.hce.GetTaskStatusResponseEncrypted) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = IccPrivateKeyCrtComponentsJson + 33;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 != 0) {
            getTaskStatusResponseEncrypted.writeReplace = str.toUpperCase();
            return null;
        }
        getTaskStatusResponseEncrypted.writeReplace = str.toUpperCase();
        throw null;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.GetTaskStatusResponseEncrypted getTaskStatusResponseEncrypted = (com.payair.hce.GetTaskStatusResponseEncrypted) objArr[0];
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 23;
        IccPrivateKeyCrtComponentsJson = i % 128;
        java.lang.String str = getTaskStatusResponseEncrypted.AlternateContactlessPaymentDataJson;
        if (i % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.GetTaskStatusResponseEncrypted getTaskStatusResponseEncrypted = (com.payair.hce.GetTaskStatusResponseEncrypted) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = IccPrivateKeyCrtComponentsJson + 98;
        int i2 = (~i) + (i << 1);
        SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
        if (i2 % 2 != 0) {
            getTaskStatusResponseEncrypted.AlternateContactlessPaymentDataJson = str.toUpperCase();
            int i3 = SdkCoreAlternateContactlessPaymentDataImpl;
            int i4 = ((i3 | 69) << 1) - (i3 ^ 69);
            IccPrivateKeyCrtComponentsJson = i4 % 128;
            if (i4 % 2 == 0) {
                return null;
            }
            throw null;
        }
        getTaskStatusResponseEncrypted.AlternateContactlessPaymentDataJson = str.toUpperCase();
        throw new java.lang.ArithmeticException();
    }

    public final void writeReplace(java.lang.String str) {
        values(new java.lang.Object[]{this, str}, -1860520839, 1860520842, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String AlternateContactlessPaymentDataJson() {
        return (java.lang.String) values(new java.lang.Object[]{this}, -1712050221, 1712050222, java.lang.System.identityHashCode(this));
    }

    public final void AlternateContactlessPaymentDataJson(java.lang.String str) {
        values(new java.lang.Object[]{this, str}, 617468933, -617468929, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String valueOf() {
        return (java.lang.String) values(new java.lang.Object[]{this}, -1126059056, 1126059056, java.lang.System.identityHashCode(this));
    }

    public final void values(java.lang.String str) {
        values(new java.lang.Object[]{this, str}, 686313489, -686313482, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String writeReplace() {
        return (java.lang.String) values(new java.lang.Object[]{this}, 1784820981, -1784820979, java.lang.System.identityHashCode(this));
    }

    public final void valueOf(java.lang.String str) {
        values(new java.lang.Object[]{this, str}, -1235788348, 1235788353, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String values() {
        return (java.lang.String) values(new java.lang.Object[]{this}, 1058599604, -1058599595, java.lang.System.identityHashCode(this));
    }

    public final void DigitizedCardProfile(java.lang.String str) {
        values(new java.lang.Object[]{this, str}, 517941145, -517941137, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String DigitizedCardProfile() {
        return (java.lang.String) values(new java.lang.Object[]{this}, -1469688320, 1469688326, java.lang.System.identityHashCode(this));
    }
}
