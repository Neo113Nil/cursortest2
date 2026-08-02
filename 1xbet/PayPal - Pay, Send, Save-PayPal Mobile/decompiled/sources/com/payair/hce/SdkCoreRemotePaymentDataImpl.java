package com.payair.hce;

/* loaded from: classes4.dex */
public class SdkCoreRemotePaymentDataImpl implements com.payair.hce.stopSelfResultHook {
    private static int[] valueOf = {0, 1, 2, 3, 5, 6, 7, 4, 10, 11, 8, 9, 15, 12, 13, 14};
    private static int[] AlternateContactlessPaymentDataJson = {0, 1, 2, 3, 7, 4, 5, 6, 10, 11, 8, 9, 13, 14, 15, 12};
    private com.payair.hce.getPanSequenceNumber[][] writeReplace = (com.payair.hce.getPanSequenceNumber[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) com.payair.hce.getPanSequenceNumber.class, 2, 16);
    private com.payair.hce.getSfi[] values = new com.payair.hce.getSfi[2];
    private com.payair.hce.getContactlessPaymentData[][] DigitizedCardProfile = (com.payair.hce.getContactlessPaymentData[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) com.payair.hce.getContactlessPaymentData.class, 10, 16);
    private com.payair.hce.getContactlessPaymentData[][] getProfileVersion = (com.payair.hce.getContactlessPaymentData[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) com.payair.hce.getContactlessPaymentData.class, 10, 16);
    private com.payair.hce.SdkCoreRecordsImpl[][] getAid = (com.payair.hce.SdkCoreRecordsImpl[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) com.payair.hce.SdkCoreRecordsImpl.class, 10, 8);
    private boolean RecordsJson = true;

    public final com.payair.hce.getRecordNumber valueOf(com.payair.hce.getRecordNumber getrecordnumber, int i, int i2) {
        long j;
        int i3 = 16;
        com.payair.hce.getCardRiskManagementData[] getcardriskmanagementdataArr = new com.payair.hce.getCardRiskManagementData[16];
        com.payair.hce.getRecordNumber[] getrecordnumberArr = new com.payair.hce.getRecordNumber[16];
        for (int i4 = 0; i4 < 16; i4++) {
            getcardriskmanagementdataArr[i4] = new com.payair.hce.getCardRiskManagementData();
            getrecordnumberArr[i4] = new com.payair.hce.getRecordNumber();
        }
        for (int i5 = 0; i5 < 16; i5++) {
            java.lang.System.arraycopy(this.writeReplace[0][i5].writeReplace[getrecordnumber.DigitizedCardProfile[i5] & 255].DigitizedCardProfile, 0, getrecordnumberArr[i5].DigitizedCardProfile, 0, 16);
        }
        this.values[0].valueOf(getrecordnumberArr);
        java.lang.System.arraycopy(getrecordnumberArr[0].DigitizedCardProfile, 0, getrecordnumber.DigitizedCardProfile, 0, 16);
        int i6 = 0;
        while (i6 < 9) {
            int i7 = 0;
            while (i7 < i3) {
                boolean z = this.RecordsJson;
                boolean z2 = !z && i6 == i && i7 == i2;
                com.payair.hce.getCardRiskManagementData getcardriskmanagementdata = getcardriskmanagementdataArr[i7];
                com.payair.hce.getContactlessPaymentData getcontactlesspaymentdata = this.DigitizedCardProfile[i6][i7];
                byte b = getrecordnumber.DigitizedCardProfile[(z ? valueOf : AlternateContactlessPaymentDataJson)[i7]];
                if (z2) {
                    j = getcontactlesspaymentdata.values[255 - (b & 255)];
                } else {
                    j = getcontactlesspaymentdata.values[b & 255];
                }
                getcardriskmanagementdata.AlternateContactlessPaymentDataJson(j);
                i7++;
            }
            for (int i8 = 0; i8 < 4; i8++) {
                com.payair.hce.getCardRiskManagementData getcardriskmanagementdata2 = getcardriskmanagementdataArr[i8];
                int i9 = i8 * 2;
                int i10 = i8 + 4;
                int i11 = i8 + 8;
                int i12 = i8 + 12;
                getcardriskmanagementdata2.AlternateContactlessPaymentDataJson(this.getAid[i6][i9].writeReplace(getcardriskmanagementdata2.AlternateContactlessPaymentDataJson(), getcardriskmanagementdataArr[i10].AlternateContactlessPaymentDataJson(), getcardriskmanagementdataArr[i11].AlternateContactlessPaymentDataJson(), getcardriskmanagementdataArr[i12].AlternateContactlessPaymentDataJson()));
                byte[] bArr = getcardriskmanagementdataArr[i8].writeReplace;
                getcardriskmanagementdataArr[i12].AlternateContactlessPaymentDataJson(this.getProfileVersion[i6][i12].values[bArr[3] & 255]);
                getcardriskmanagementdataArr[i11].AlternateContactlessPaymentDataJson(this.getProfileVersion[i6][i11].values[bArr[2] & 255]);
                getcardriskmanagementdataArr[i10].AlternateContactlessPaymentDataJson(this.getProfileVersion[i6][i10].values[bArr[1] & 255]);
                getcardriskmanagementdataArr[i8].AlternateContactlessPaymentDataJson(this.getProfileVersion[i6][i8].values[bArr[0] & 255]);
                com.payair.hce.getCardRiskManagementData getcardriskmanagementdata3 = getcardriskmanagementdataArr[i8];
                getcardriskmanagementdata3.AlternateContactlessPaymentDataJson(this.getAid[i6][i9 + 1].writeReplace(getcardriskmanagementdata3.AlternateContactlessPaymentDataJson(), getcardriskmanagementdataArr[i10].AlternateContactlessPaymentDataJson(), getcardriskmanagementdataArr[i11].AlternateContactlessPaymentDataJson(), getcardriskmanagementdataArr[i12].AlternateContactlessPaymentDataJson()));
                byte[] bArr2 = getcardriskmanagementdataArr[i8].writeReplace;
                getrecordnumber.DigitizedCardProfile[i8] = bArr2[0];
                getrecordnumber.DigitizedCardProfile[i10] = bArr2[1];
                getrecordnumber.DigitizedCardProfile[i11] = bArr2[2];
                getrecordnumber.DigitizedCardProfile[i12] = bArr2[3];
            }
            i6++;
            i3 = 16;
        }
        int i13 = i3;
        int i14 = 0;
        while (i14 < i13) {
            java.lang.System.arraycopy(this.writeReplace[1][i14].writeReplace[getrecordnumber.DigitizedCardProfile[(this.RecordsJson ? valueOf : AlternateContactlessPaymentDataJson)[i14]] & 255].DigitizedCardProfile, 0, getrecordnumberArr[i14].DigitizedCardProfile, 0, 16);
            i14++;
            i13 = 16;
        }
        this.values[1].valueOf(getrecordnumberArr);
        java.lang.System.arraycopy(getrecordnumberArr[0].DigitizedCardProfile, 0, getrecordnumber.DigitizedCardProfile, 0, i13);
        return getrecordnumber;
    }

    public int hashCode() {
        int deepHashCode = java.util.Arrays.deepHashCode(this.writeReplace);
        int deepHashCode2 = java.util.Arrays.deepHashCode(this.values);
        int deepHashCode3 = java.util.Arrays.deepHashCode(this.DigitizedCardProfile);
        return ((((((((((deepHashCode + 623) * 89) + deepHashCode2) * 89) + deepHashCode3) * 89) + java.util.Arrays.deepHashCode(this.getProfileVersion)) * 89) + java.util.Arrays.deepHashCode(this.getAid)) * 89) + (this.RecordsJson ? 1 : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.payair.hce.SdkCoreRemotePaymentDataImpl sdkCoreRemotePaymentDataImpl = (com.payair.hce.SdkCoreRemotePaymentDataImpl) obj;
        return java.util.Arrays.deepEquals(this.writeReplace, sdkCoreRemotePaymentDataImpl.writeReplace) && java.util.Arrays.deepEquals(this.values, sdkCoreRemotePaymentDataImpl.values) && java.util.Arrays.deepEquals(this.DigitizedCardProfile, sdkCoreRemotePaymentDataImpl.DigitizedCardProfile) && java.util.Arrays.deepEquals(this.getProfileVersion, sdkCoreRemotePaymentDataImpl.getProfileVersion) && java.util.Arrays.deepEquals(this.getAid, sdkCoreRemotePaymentDataImpl.getAid) && this.RecordsJson == sdkCoreRemotePaymentDataImpl.RecordsJson;
    }

    @Override // com.payair.hce.stopSelfResultHook
    public void values(com.payair.hce.getStartCommandIntent getstartcommandintent) {
        this.writeReplace = (com.payair.hce.getPanSequenceNumber[][]) getstartcommandintent.DigitizedCardProfile(com.payair.hce.getPanSequenceNumber[][].class);
        this.values = (com.payair.hce.getSfi[]) getstartcommandintent.DigitizedCardProfile(com.payair.hce.getSfi[].class);
        this.DigitizedCardProfile = (com.payair.hce.getContactlessPaymentData[][]) getstartcommandintent.DigitizedCardProfile(com.payair.hce.getContactlessPaymentData[][].class);
        this.getProfileVersion = (com.payair.hce.getContactlessPaymentData[][]) getstartcommandintent.DigitizedCardProfile(com.payair.hce.getContactlessPaymentData[][].class);
        this.getAid = (com.payair.hce.SdkCoreRecordsImpl[][]) getstartcommandintent.DigitizedCardProfile(com.payair.hce.SdkCoreRecordsImpl[][].class);
        this.RecordsJson = getstartcommandintent.AlternateContactlessPaymentDataJson();
    }
}
