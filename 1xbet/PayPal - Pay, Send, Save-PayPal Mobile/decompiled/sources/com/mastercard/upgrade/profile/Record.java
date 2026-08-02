package com.mastercard.upgrade.profile;

/* loaded from: classes4.dex */
public class Record {
    private static int values = 1;
    private static int writeReplace;

    @com.payair.hce.setSelectionFromTop(valueOf = "recordNumber")
    private byte mRecordNumber;

    @com.payair.hce.setSelectionFromTop(valueOf = "recordValue")
    private com.payair.hce.isUiContext mRecordValue;

    @com.payair.hce.setSelectionFromTop(valueOf = "sfi")
    private byte mSfi;

    public static com.mastercard.upgrade.profile.Record valueOf(byte[] bArr) {
        com.mastercard.upgrade.profile.Record record = (com.mastercard.upgrade.profile.Record) new com.payair.hce.unregisterDeviceIdChangeListener(com.mastercard.upgrade.profile.Record.class).valueOf(bArr);
        int i = values;
        int i2 = i & 113;
        int i3 = ((i ^ 113) | i2) << 1;
        int i4 = -((i | 113) & (~i2));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        writeReplace = i5 % 128;
        if (i5 % 2 == 0) {
            return record;
        }
        throw new java.lang.ArithmeticException();
    }

    public byte getRecordNumber() {
        int i = writeReplace;
        int i2 = i & 35;
        int i3 = -(-((i ^ 35) | i2));
        int i4 = (i2 & i3) + (i2 | i3);
        values = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        byte b = this.mRecordNumber;
        int i5 = i & 17;
        int i6 = (i | 17) & (~i5);
        int i7 = -(-(i5 << 1));
        values = (((i6 | i7) << 1) - (i6 ^ i7)) % 128;
        return b;
    }

    public void setRecordNumber(byte b) {
        this.mRecordNumber = b;
        int i = values;
        int i2 = (i & 10) + (i | 10);
        int i3 = (~i2) + (i2 << 1);
        writeReplace = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public byte getSfi() {
        int i = writeReplace;
        int i2 = ((i ^ 101) | (i & 101)) << 1;
        int i3 = -((i & (-102)) | ((~i) & 101));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        int i5 = i4 % 128;
        values = i5;
        if (i4 % 2 == 0) {
            throw null;
        }
        byte b = this.mSfi;
        int i6 = (i5 & (-88)) | ((~i5) & 87);
        int i7 = -(-((i5 & 87) << 1));
        writeReplace = (((i6 | i7) << 1) - (i7 ^ i6)) % 128;
        return b;
    }

    public void setSfi(byte b) {
        int i = values;
        int i2 = i ^ 93;
        int i3 = ((i & 93) | i2) << 1;
        int i4 = -i2;
        writeReplace = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
        this.mSfi = b;
        writeReplace = ((-2) - (~(((i | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE) << 1) - (i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE)))) % 128;
    }

    public com.payair.hce.isUiContext getRecordValue() {
        int i = writeReplace;
        int i2 = (((i ^ 114) + ((i & 114) << 1)) - 1) % 128;
        values = i2;
        com.payair.hce.isUiContext isuicontext = this.mRecordValue;
        int i3 = ((i2 | 7) << 1) - (i2 ^ 7);
        writeReplace = i3 % 128;
        if (i3 % 2 == 0) {
            return isuicontext;
        }
        throw null;
    }

    public void setRecordValue(com.payair.hce.isUiContext isuicontext) {
        int i = writeReplace;
        int i2 = i & 93;
        int i3 = -(-((i ^ 93) | i2));
        int i4 = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        values = i4;
        this.mRecordValue = isuicontext;
        int i5 = i4 & 121;
        int i6 = i4 | 121;
        int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
        writeReplace = i7 % 128;
        if (i7 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    public java.lang.String toJsonString() {
        new com.payair.hce.unregisterDeviceIdChangeListener(com.mastercard.upgrade.profile.Record.class);
        java.lang.String DigitizedCardProfile = com.payair.hce.unregisterDeviceIdChangeListener.DigitizedCardProfile(this);
        writeReplace = ((-2) - (~(values + 120))) % 128;
        return DigitizedCardProfile;
    }
}
