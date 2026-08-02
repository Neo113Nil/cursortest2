package com.mastercard.mpsdk.card.profile;

/* loaded from: classes4.dex */
public class SdkCoreRecordsImpl implements com.payair.hce.checkCallingOrSelfUriPermissions, java.io.Serializable {
    private static int AlternateContactlessPaymentDataJson = 1;
    private static final long serialVersionUID = -5828579143231914995L;
    private static int writeReplace;
    private byte recordNumber;
    private byte[] recordValue;
    private byte sfi;

    public SdkCoreRecordsImpl(com.payair.hce.checkCallingOrSelfUriPermissions checkcallingorselfuripermissions) {
        this.recordNumber = checkcallingorselfuripermissions.getRecordNumber();
        this.sfi = checkcallingorselfuripermissions.getSfi();
        this.recordValue = checkcallingorselfuripermissions.getRecordValue();
    }

    @Override // com.payair.hce.checkCallingOrSelfUriPermissions
    public byte getRecordNumber() {
        int i = writeReplace;
        int i2 = ((i | 53) << 1) - (i ^ 53);
        AlternateContactlessPaymentDataJson = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        byte b = this.recordNumber;
        int i3 = i ^ 99;
        int i4 = ((i & 99) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        AlternateContactlessPaymentDataJson = i6 % 128;
        if (i6 % 2 != 0) {
            return b;
        }
        throw null;
    }

    @Override // com.payair.hce.checkCallingOrSelfUriPermissions
    public byte getSfi() {
        writeReplace = (AlternateContactlessPaymentDataJson + 109) % 128;
        byte b = this.sfi;
        int identityHashCode = java.lang.System.identityHashCode(this);
        int i = ~identityHashCode;
        int i2 = (i | identityHashCode) & i;
        int i3 = ~((i2 & (-277735660)) | (i2 ^ (-277735660)));
        int i4 = i & 1311557939;
        int i5 = (i ^ 1311557939) | i4;
        int i6 = ~i5;
        int i7 = (i5 | i6) & i6;
        int i8 = i3 ^ i7;
        int i9 = i3 & i7;
        int i10 = ((i9 ^ i8) | (i9 & i8)) * (-867);
        int i11 = i10 & 290424956;
        int i12 = -(-(i10 | 290424956));
        int i13 = (i11 & i12) + (i12 | i11);
        int i14 = identityHashCode & (-277735660);
        int i15 = ((-277735660) | identityHashCode) & (~i14);
        int i16 = ~((i15 ^ i14) | (i14 & i15));
        int i17 = i16 ^ 276897992;
        int i18 = i16 & 276897992;
        int i19 = (i18 ^ i17) | (i18 & i17);
        int i20 = ((-1311557940) & identityHashCode) | i4;
        int i21 = 1311557939 & identityHashCode;
        int i22 = ~((i20 ^ i21) | (i20 & i21));
        int i23 = ((~i22) & i19) | ((~i19) & i22);
        int i24 = i19 & i22;
        int i25 = ((i24 ^ i23) | (i24 & i23)) * (-1734);
        int i26 = ((i13 | i25) << 1) - (i25 ^ i13);
        int i27 = i2 & (-276897993);
        int i28 = (i2 | (-276897993)) & (~i27);
        int i29 = ~((i28 ^ i27) | (i28 & i27));
        int i30 = ~((i & (-837668)) | (837667 & identityHashCode) | ((-837668) & identityHashCode));
        int i31 = ((~i30) & i29) | ((~i29) & i30);
        int i32 = i30 & i29;
        int i33 = (i32 ^ i31) | (i32 & i31);
        int i34 = identityHashCode ^ 1588455931;
        int i35 = identityHashCode & 1588455931;
        int i36 = ~((i35 ^ i34) | (i35 & i34));
        int i37 = -(-(((i36 ^ i33) | (i36 & i33)) * 867));
        int identityHashCode2 = java.lang.System.identityHashCode(this);
        int i38 = identityHashCode2 & 1123362743;
        int i39 = (~i38) & (identityHashCode2 | 1123362743);
        int i40 = ~identityHashCode2;
        int i41 = ~((i38 ^ i39) | (i38 & i39));
        int i42 = i41 ^ (-184902941);
        int i43 = i41 & (-184902941);
        int i44 = ((i43 ^ i42) | (i43 & i42)) * 56;
        int i45 = i44 & (-75681558);
        int i46 = (i44 | (-75681558)) & (~i45);
        int i47 = -(-(i45 << 1));
        int i48 = (i46 & i47) + (i46 | i47) + 133299776;
        int i49 = i40 & (-184902941);
        int i50 = ((i40 | (-184902941)) & (~i49)) | i49;
        int i51 = ~i50;
        int i52 = (i50 | i51) & i51;
        int i53 = -(-(((i52 ^ 1123362743) | (i52 & 1123362743)) * 56));
        if ((i26 ^ i37) + ((i37 & i26) << 1) <= (((~i53) & i48) | ((~i48) & i53)) + ((i53 & i48) << 1)) {
            return b;
        }
        throw null;
    }

    @Override // com.payair.hce.checkCallingOrSelfUriPermissions
    public byte[] getRecordValue() {
        int i = writeReplace;
        int i2 = i + 77;
        AlternateContactlessPaymentDataJson = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        byte[] bArr = this.recordValue;
        int i3 = i & 59;
        int i4 = -(-((i ^ 59) | i3));
        AlternateContactlessPaymentDataJson = ((i3 ^ i4) + ((i4 & i3) << 1)) % 128;
        return bArr;
    }
}
