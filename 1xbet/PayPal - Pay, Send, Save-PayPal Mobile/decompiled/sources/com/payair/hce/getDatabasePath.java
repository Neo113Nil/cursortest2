package com.payair.hce;

/* loaded from: classes4.dex */
public class getDatabasePath {
    private static int getProfileVersion = 1;
    private static int values;
    private java.lang.Exception AlternateContactlessPaymentDataJson;
    private com.payair.hce.fileList DigitizedCardProfile;
    private int valueOf;
    private final com.payair.hce.checkPermission writeReplace = com.payair.hce.checkPermission.DigitizedCardProfile(com.payair.hce.registerReceiver.values);

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i3;
        int i5 = ~i2;
        int i6 = (i * 758) + (i2 * (-756)) + ((i | i4) * (-757)) + ((~(i5 | i | i3)) * 1514) + (((~((~i) | i5)) | (~(i4 | i5)) | (~(i2 | i | i3))) * 757);
        if (i6 == 1) {
            return values(objArr);
        }
        if (i6 == 2) {
            return valueOf(objArr);
        }
        if (i6 != 3) {
            return AlternateContactlessPaymentDataJson(objArr);
        }
        com.payair.hce.getDatabasePath getdatabasepath = (com.payair.hce.getDatabasePath) objArr[0];
        int i7 = (getProfileVersion + 41) % 128;
        values = i7;
        int i8 = getdatabasepath.valueOf;
        int i9 = i7 & 41;
        int i10 = (i7 | 41) & (~i9);
        int i11 = -(-(i9 << 1));
        getProfileVersion = ((i10 ^ i11) + ((i10 & i11) << 1)) % 128;
        return java.lang.Integer.valueOf(i8);
    }

    public getDatabasePath(int i, com.payair.hce.fileList filelist) {
        this.valueOf = i;
        this.DigitizedCardProfile = filelist;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.getDatabasePath getdatabasepath = (com.payair.hce.getDatabasePath) objArr[0];
        int i = values;
        int i2 = ((i | 99) << 1) - (i ^ 99);
        getProfileVersion = i2 % 128;
        com.payair.hce.fileList filelist = getdatabasepath.DigitizedCardProfile;
        if (i2 % 2 != 0) {
            return filelist;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.getDatabasePath getdatabasepath = (com.payair.hce.getDatabasePath) objArr[0];
        int i = getProfileVersion;
        int i2 = i & 65;
        int i3 = ((i ^ 65) | i2) << 1;
        int i4 = -((i | 65) & (~i2));
        int i5 = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
        values = i5;
        java.lang.Exception exc = getdatabasepath.AlternateContactlessPaymentDataJson;
        int i6 = (i5 & (-126)) | ((~i5) & 125);
        int i7 = -(-((i5 & 125) << 1));
        int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
        getProfileVersion = i8 % 128;
        if (i8 % 2 != 0) {
            return exc;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.getDatabasePath getdatabasepath = (com.payair.hce.getDatabasePath) objArr[0];
        java.lang.Exception exc = (java.lang.Exception) objArr[1];
        int i = getProfileVersion;
        int i2 = i ^ 29;
        int i3 = ((i & 29) | i2) << 1;
        int i4 = -i2;
        int i5 = ((i3 ^ i4) + ((i3 & i4) << 1)) % 128;
        values = i5;
        getdatabasepath.AlternateContactlessPaymentDataJson = exc;
        int i6 = (((i5 | 30) << 1) - (i5 ^ 30)) - 1;
        getProfileVersion = i6 % 128;
        if (i6 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public java.lang.String toString() {
        int i = getProfileVersion;
        int i2 = i | 81;
        int i3 = (i2 << 1) - (i2 & (~(i & 81)));
        values = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        values = (i + 113) % 128;
        return "getDatabasePath";
    }

    public final void valueOf(java.lang.Exception exc) {
        DigitizedCardProfile(new java.lang.Object[]{this, exc}, -1478206329, 1478206329, java.lang.System.identityHashCode(this));
    }

    public final java.lang.Exception writeReplace() {
        return (java.lang.Exception) DigitizedCardProfile(new java.lang.Object[]{this}, 1534705211, -1534705209, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.fileList AlternateContactlessPaymentDataJson() {
        return (com.payair.hce.fileList) DigitizedCardProfile(new java.lang.Object[]{this}, 281012404, -281012403, java.lang.System.identityHashCode(this));
    }

    public final int DigitizedCardProfile() {
        return ((java.lang.Integer) DigitizedCardProfile(new java.lang.Object[]{this}, 2063970108, -2063970105, java.lang.System.identityHashCode(this))).intValue();
    }
}
