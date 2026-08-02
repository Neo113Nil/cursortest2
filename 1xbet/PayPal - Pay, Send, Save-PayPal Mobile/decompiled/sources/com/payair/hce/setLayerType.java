package com.payair.hce;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0003\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\u0006\"\u0004\b\t\u0010\nR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\f\u0010\bR\"\u0010\u0013\u001a\u00020\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u0011\"\u0004\b\f\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\bR$\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\b\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\nR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\r\u0010\bR$\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\b\u001a\u0004\b\f\u0010\u0006\"\u0004\b\u000b\u0010\nR0\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00178\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019\"\u0004\b\t\u0010\u001a"}, d2 = {"Lcom/payair/hce/setLayerType;", "", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "IccPrivateKeyCrtComponentsJson", "Ljava/lang/String;", "AlternateContactlessPaymentDataJson", "(Ljava/lang/String;)V", "writeReplace", "valueOf", "DigitizedCardProfile", "", "SdkCoreAlternateContactlessPaymentDataImpl", "Z", "()Z", "(Z)V", "values", "RecordsJson", "getProfileVersion", "getAid", "", "Ljava/util/Map;", "()Ljava/util/Map;", "(Ljava/util/Map;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class setLayerType {
    private static int getCiacDecline = 1;
    private static int getCvrMaskAnd;

    /* renamed from: writeReplace, reason: from kotlin metadata */
    public static final com.payair.hce.setLayerType.Companion INSTANCE = new com.payair.hce.setLayerType.Companion(null);

    /* renamed from: AlternateContactlessPaymentDataJson, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "deviceName")
    public java.lang.String valueOf;

    /* renamed from: DigitizedCardProfile, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "rgk")
    public java.lang.String RecordsJson;

    /* renamed from: IccPrivateKeyCrtComponentsJson, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "deviceFingerprint")
    private java.lang.String writeReplace;

    /* renamed from: RecordsJson, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "pushToken")
    private java.lang.String getProfileVersion;

    /* renamed from: SdkCoreAlternateContactlessPaymentDataImpl, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "nfcCapable")
    private boolean values;

    /* renamed from: getAid, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "tokenStorage")
    private java.lang.String SdkCoreAlternateContactlessPaymentDataImpl;

    /* renamed from: getProfileVersion, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "walletExtraData")
    private java.util.Map<java.lang.String, java.lang.String> IccPrivateKeyCrtComponentsJson;

    /* renamed from: valueOf, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "deviceType")
    public java.lang.String DigitizedCardProfile;

    /* renamed from: values, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "mobilePin")
    public java.lang.String AlternateContactlessPaymentDataJson;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ~i3;
        int i6 = ~i;
        int i7 = ~(i | i2);
        switch ((i * 371) + (i2 * 371) + (((~(i4 | i5)) | (~(i6 | i3))) * (-370)) + (((~(i3 | i4)) | (~(i5 | i6)) | i7) * (-370)) + (i7 * com.knotapi.knot.utilities.Constants.ID_KROGER)) {
            case 1:
                return writeReplace(objArr);
            case 2:
                return valueOf(objArr);
            case 3:
                com.payair.hce.setLayerType setlayertype = (com.payair.hce.setLayerType) objArr[0];
                int i8 = getCiacDecline;
                int i9 = (i8 & (-8)) | ((~i8) & 7);
                int i10 = (i8 & 7) << 1;
                getCvrMaskAnd = (((i9 | i10) << 1) - (i9 ^ i10)) % 128;
                java.util.Map<java.lang.String, java.lang.String> map = setlayertype.IccPrivateKeyCrtComponentsJson;
                int i11 = i8 & 43;
                getCvrMaskAnd = (((((i8 ^ 43) | i11) << 1) - (~(-((i8 | 43) & (~i11))))) - 1) % 128;
                return map;
            case 4:
                com.payair.hce.setLayerType setlayertype2 = (com.payair.hce.setLayerType) objArr[0];
                java.lang.String str = (java.lang.String) objArr[1];
                int i12 = getCiacDecline;
                int i13 = (i12 & (-48)) | ((~i12) & 47);
                int i14 = -(-((i12 & 47) << 1));
                int i15 = ((i13 & i14) + (i14 | i13)) % 128;
                getCvrMaskAnd = i15;
                setlayertype2.writeReplace = str;
                getCiacDecline = (((i15 & (-94)) | ((~i15) & 93)) + ((i15 & 93) << 1)) % 128;
                return null;
            case 5:
                com.payair.hce.setLayerType setlayertype3 = (com.payair.hce.setLayerType) objArr[0];
                int i16 = getCiacDecline;
                int i17 = i16 & 89;
                getCvrMaskAnd = (i17 + ((i16 ^ 89) | i17)) % 128;
                return setlayertype3.getProfileVersion;
            case 6:
                return values(objArr);
            case 7:
                return AlternateContactlessPaymentDataJson(objArr);
            case 8:
                com.payair.hce.setLayerType setlayertype4 = (com.payair.hce.setLayerType) objArr[0];
                java.util.Map<java.lang.String, java.lang.String> map2 = (java.util.Map) objArr[1];
                int i18 = getCiacDecline;
                int i19 = ((i18 | 118) << 1) - (i18 ^ 118);
                getCvrMaskAnd = ((~i19) + (i19 << 1)) % 128;
                setlayertype4.IccPrivateKeyCrtComponentsJson = map2;
                getCvrMaskAnd = ((((i18 | 56) << 1) - (i18 ^ 56)) - 1) % 128;
                return null;
            case 9:
                com.payair.hce.setLayerType setlayertype5 = (com.payair.hce.setLayerType) objArr[0];
                int i20 = getCvrMaskAnd;
                int i21 = ((i20 ^ 111) | (i20 & 111)) << 1;
                int i22 = -((i20 & (-112)) | ((~i20) & 111));
                getCiacDecline = ((i21 & i22) + (i21 | i22)) % 128;
                boolean z = setlayertype5.values;
                int i23 = i20 & 107;
                getCiacDecline = ((i23 - (~(-(-((i20 ^ 107) | i23))))) - 1) % 128;
                return java.lang.Boolean.valueOf(z);
            case 10:
                return IccPrivateKeyCrtComponentsJson(objArr);
            default:
                return DigitizedCardProfile(objArr);
        }
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setLayerType setlayertype = (com.payair.hce.setLayerType) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = getCiacDecline;
        int i2 = i & 65;
        int i3 = i2 + ((i ^ 65) | i2);
        getCvrMaskAnd = i3 % 128;
        setlayertype.SdkCoreAlternateContactlessPaymentDataImpl = str;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = i & 27;
        int i5 = ((i ^ 27) | i4) << 1;
        int i6 = -((~i4) & (i | 27));
        getCvrMaskAnd = (((i5 | i6) << 1) - (i6 ^ i5)) % 128;
        return null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setLayerType setlayertype = (com.payair.hce.setLayerType) objArr[0];
        int i = getCiacDecline + 41;
        int i2 = i % 128;
        getCvrMaskAnd = i2;
        java.lang.String str = setlayertype.SdkCoreAlternateContactlessPaymentDataImpl;
        if (i % 2 != 0) {
            throw null;
        }
        getCiacDecline = (i2 + 67) % 128;
        return str;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setLayerType setlayertype = (com.payair.hce.setLayerType) objArr[0];
        int i = getCvrMaskAnd;
        int i2 = i & 75;
        int i3 = (i2 - (~(-(-((i ^ 75) | i2))))) - 1;
        int i4 = i3 % 128;
        getCiacDecline = i4;
        java.lang.String str = setlayertype.writeReplace;
        if (i3 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        int i5 = i4 & 63;
        int i6 = i5 + ((i4 ^ 63) | i5);
        getCvrMaskAnd = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setLayerType setlayertype = (com.payair.hce.setLayerType) objArr[0];
        boolean booleanValue = ((java.lang.Boolean) objArr[1]).booleanValue();
        int i = getCvrMaskAnd;
        int i2 = (i & (-38)) | ((~i) & 37);
        int i3 = -(-((i & 37) << 1));
        int i4 = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        getCiacDecline = i4;
        setlayertype.values = booleanValue;
        int i5 = (-2) - (~(((i4 | 64) << 1) - (i4 ^ 64)));
        getCvrMaskAnd = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object IccPrivateKeyCrtComponentsJson(java.lang.Object[] objArr) {
        com.payair.hce.setLayerType setlayertype = (com.payair.hce.setLayerType) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = getCiacDecline;
        int i2 = ((i & 39) + (i | 39)) % 128;
        getCvrMaskAnd = i2;
        setlayertype.getProfileVersion = str;
        int i3 = (i2 | 13) << 1;
        int i4 = -((i2 & (-14)) | ((~i2) & 13));
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        getCiacDecline = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setLayerType setlayertype = (com.payair.hce.setLayerType) objArr[0];
        int i = getCvrMaskAnd;
        getCiacDecline = ((i & 7) + (i | 7)) % 128;
        java.lang.String str = setlayertype.DigitizedCardProfile;
        java.lang.String str2 = setlayertype.SdkCoreAlternateContactlessPaymentDataImpl;
        java.lang.String str3 = setlayertype.writeReplace;
        java.lang.String str4 = setlayertype.valueOf;
        boolean z = setlayertype.values;
        java.lang.String str5 = setlayertype.getProfileVersion;
        java.lang.String str6 = setlayertype.AlternateContactlessPaymentDataJson;
        java.lang.String str7 = setlayertype.RecordsJson;
        java.util.Map<java.lang.String, java.lang.String> map = setlayertype.IccPrivateKeyCrtComponentsJson;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RequestAccount{deviceType='");
        sb.append(str);
        sb.append("', tokenStorageType='");
        sb.append(str2);
        sb.append("', deviceFingerprint='");
        sb.append(str3);
        sb.append("', deviceName='");
        sb.append(str4);
        sb.append("', nfcCapable=");
        sb.append(z);
        sb.append(", pushToken='");
        sb.append(str5);
        sb.append("', mobilePin='");
        sb.append(str6);
        sb.append("', rgk='");
        sb.append(str7);
        sb.append("', walletExtraData=");
        sb.append(map);
        sb.append("}");
        java.lang.String obj = sb.toString();
        int i2 = getCiacDecline;
        int i3 = i2 ^ 37;
        int i4 = -(-((i2 & 37) << 1));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        getCvrMaskAnd = i5 % 128;
        if (i5 % 2 == 0) {
            return obj;
        }
        throw new java.lang.ArithmeticException();
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/payair/hce/setLayerType$writeReplace;", "", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.payair.hce.setLayerType$writeReplace, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        kotlin.collections.CollectionsKt.mutableListOf("PHONE", "TABLET", "TABLET_OR_EREADER", "WATCH", "WATCH_OR_WRISTBAND", "CARD", "STICKER", "PC", "DEVICE_PERIPHERAL", "TAG", "JEWELRY", "FASHION_ACCESSORY", "GARMENT", "DOMESTIC_APPLIANCE", "VEHICLE", "MEDIA_OR_GAMING_DEVICE");
        kotlin.collections.CollectionsKt.mutableListOf("DEVICE_MEMORY", "DEVICE_MEMORY_PROTECTED_TPM", "TEE", "SE", "SERVER", "VEE");
        int i = getCvrMaskAnd;
        int i2 = i & 9;
        int i3 = i | 9;
        int i4 = (i2 & i3) + (i3 | i2);
        getCiacDecline = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final java.lang.String toString() {
        return (java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -1907599017, 1907599019, java.lang.System.identityHashCode(this));
    }

    public final void AlternateContactlessPaymentDataJson(java.util.Map<java.lang.String, java.lang.String> map) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, map}, -2013417007, 2013417015, java.lang.System.identityHashCode(this));
    }

    public final java.util.Map<java.lang.String, java.lang.String> values() {
        return (java.util.Map) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -2023654524, 2023654527, java.lang.System.identityHashCode(this));
    }

    public final void valueOf(java.lang.String str) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, str}, 965784527, -965784517, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String writeReplace() {
        return (java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 327640343, -327640338, java.lang.System.identityHashCode(this));
    }

    public final void valueOf(boolean z) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, java.lang.Boolean.valueOf(z)}, 1170091761, -1170091754, java.lang.System.identityHashCode(this));
    }

    public final boolean DigitizedCardProfile() {
        return ((java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 310938849, -310938840, java.lang.System.identityHashCode(this))).booleanValue();
    }

    public final void AlternateContactlessPaymentDataJson(java.lang.String str) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, str}, 257900021, -257900017, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String AlternateContactlessPaymentDataJson() {
        return (java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1738500281, -1738500275, java.lang.System.identityHashCode(this));
    }

    public final void writeReplace(java.lang.String str) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, str}, -302737359, 302737359, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String valueOf() {
        return (java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -671867095, 671867096, java.lang.System.identityHashCode(this));
    }
}
