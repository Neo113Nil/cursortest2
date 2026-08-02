package com.payair.hce.visa.dao;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001:\u0003'()B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001c\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0018\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010 \u001a\u0004\b\u0018\u0010!R\u001a\u0010$\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\"\u001a\u0004\b\u001c\u0010#R\u001a\u0010\u001e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&"}, d2 = {"Lcom/payair/hce/visa/dao/RequestCompleteTokenizeDto;", "", "", "p0", "Lcom/payair/hce/visa/dao/RequestCompleteTokenizeDto$ProtectionType;", "p1", "", "Lcom/payair/hce/visa/dao/RequestCompleteTokenizeDto$PresentationType;", "p2", "Lcom/payair/hce/visa/dao/RequestCompleteTokenizeDto$Platform;", "p3", "Lcom/payair/hce/setWebViewRenderProcessClient;", "p4", "<init>", "(JLcom/payair/hce/visa/dao/RequestCompleteTokenizeDto$ProtectionType;Ljava/util/List;Lcom/payair/hce/visa/dao/RequestCompleteTokenizeDto$Platform;Lcom/payair/hce/setWebViewRenderProcessClient;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "values", "Lcom/payair/hce/setWebViewRenderProcessClient;", "writeReplace", "()Lcom/payair/hce/setWebViewRenderProcessClient;", "AlternateContactlessPaymentDataJson", "Lcom/payair/hce/visa/dao/RequestCompleteTokenizeDto$Platform;", "DigitizedCardProfile", "()Lcom/payair/hce/visa/dao/RequestCompleteTokenizeDto$Platform;", "Ljava/util/List;", "()Ljava/util/List;", "Lcom/payair/hce/visa/dao/RequestCompleteTokenizeDto$ProtectionType;", "()Lcom/payair/hce/visa/dao/RequestCompleteTokenizeDto$ProtectionType;", "valueOf", "J", "()J", "Platform", "PresentationType", "ProtectionType"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class RequestCompleteTokenizeDto {
    private static int SdkCoreAlternateContactlessPaymentDataImpl = 1;
    private static int getAid;

    /* renamed from: AlternateContactlessPaymentDataJson, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "presentationType")
    private final java.util.List<com.payair.hce.visa.dao.RequestCompleteTokenizeDto.PresentationType> writeReplace;

    /* renamed from: DigitizedCardProfile, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "protectionType")
    private final com.payair.hce.visa.dao.RequestCompleteTokenizeDto.ProtectionType valueOf;

    /* renamed from: valueOf, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "termsAndConditionsAcceptedAt")
    private final long DigitizedCardProfile;

    /* renamed from: values, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "deviceKeys")
    private final com.payair.hce.setWebViewRenderProcessClient AlternateContactlessPaymentDataJson;

    /* renamed from: writeReplace, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_AUTHENTICATOR_ATTACHMENT)
    private final com.payair.hce.visa.dao.RequestCompleteTokenizeDto.Platform values;

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ~(i | i3);
        int i6 = ~i;
        int i7 = ~(i6 | i2);
        switch ((i * (-813)) + (i2 * 408) + (((~(i | i4)) | i5) * (-814)) + (((~((~i3) | i4)) | i7 | i5) * 407) + (((~(i6 | i3)) | i7 | (~(i2 | i3))) * 407)) {
            case 1:
                return DigitizedCardProfile(objArr);
            case 2:
                return AlternateContactlessPaymentDataJson(objArr);
            case 3:
                return values(objArr);
            case 4:
                com.payair.hce.visa.dao.RequestCompleteTokenizeDto requestCompleteTokenizeDto = (com.payair.hce.visa.dao.RequestCompleteTokenizeDto) objArr[0];
                int i8 = getAid;
                SdkCoreAlternateContactlessPaymentDataImpl = ((i8 ^ 103) + ((i8 & 103) << 1)) % 128;
                com.payair.hce.setWebViewRenderProcessClient setwebviewrenderprocessclient = requestCompleteTokenizeDto.AlternateContactlessPaymentDataJson;
                SdkCoreAlternateContactlessPaymentDataImpl = (i8 + 21) % 128;
                return setwebviewrenderprocessclient;
            case 5:
                return writeReplace(objArr);
            case 6:
                return getProfileVersion(objArr);
            default:
                return valueOf(objArr);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RequestCompleteTokenizeDto(long j, com.payair.hce.visa.dao.RequestCompleteTokenizeDto.ProtectionType protectionType, java.util.List<? extends com.payair.hce.visa.dao.RequestCompleteTokenizeDto.PresentationType> list, com.payair.hce.visa.dao.RequestCompleteTokenizeDto.Platform platform, com.payair.hce.setWebViewRenderProcessClient setwebviewrenderprocessclient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protectionType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(platform, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setwebviewrenderprocessclient, "");
        this.DigitizedCardProfile = j;
        this.valueOf = protectionType;
        this.writeReplace = list;
        this.values = platform;
        this.AlternateContactlessPaymentDataJson = setwebviewrenderprocessclient;
    }

    private static /* synthetic */ java.lang.Object getProfileVersion(java.lang.Object[] objArr) {
        com.payair.hce.visa.dao.RequestCompleteTokenizeDto requestCompleteTokenizeDto = (com.payair.hce.visa.dao.RequestCompleteTokenizeDto) objArr[0];
        int i = SdkCoreAlternateContactlessPaymentDataImpl;
        int i2 = i & 73;
        int i3 = ((i ^ 73) | i2) << 1;
        int i4 = -((~i2) & (i | 73));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        getAid = i5 % 128;
        if (i5 % 2 != 0) {
            long j = requestCompleteTokenizeDto.DigitizedCardProfile;
            throw null;
        }
        long j2 = requestCompleteTokenizeDto.DigitizedCardProfile;
        int i6 = ((i | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1) - (i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
        getAid = i6 % 128;
        if (i6 % 2 == 0) {
            return java.lang.Long.valueOf(j2);
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.visa.dao.RequestCompleteTokenizeDto requestCompleteTokenizeDto = (com.payair.hce.visa.dao.RequestCompleteTokenizeDto) objArr[0];
        int i = SdkCoreAlternateContactlessPaymentDataImpl;
        int i2 = (i ^ 23) + ((i & 23) << 1);
        getAid = i2 % 128;
        com.payair.hce.visa.dao.RequestCompleteTokenizeDto.ProtectionType protectionType = requestCompleteTokenizeDto.valueOf;
        if (i2 % 2 == 0) {
            return protectionType;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.visa.dao.RequestCompleteTokenizeDto requestCompleteTokenizeDto = (com.payair.hce.visa.dao.RequestCompleteTokenizeDto) objArr[0];
        int i = getAid;
        int i2 = i & 93;
        int i3 = i2 + ((i ^ 93) | i2);
        int i4 = i3 % 128;
        SdkCoreAlternateContactlessPaymentDataImpl = i4;
        java.util.List<com.payair.hce.visa.dao.RequestCompleteTokenizeDto.PresentationType> list = requestCompleteTokenizeDto.writeReplace;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i5 = i4 + 125;
        getAid = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.visa.dao.RequestCompleteTokenizeDto requestCompleteTokenizeDto = (com.payair.hce.visa.dao.RequestCompleteTokenizeDto) objArr[0];
        int i = getAid + 36;
        int i2 = (~i) + (i << 1);
        int i3 = i2 % 128;
        SdkCoreAlternateContactlessPaymentDataImpl = i3;
        com.payair.hce.visa.dao.RequestCompleteTokenizeDto.Platform platform = requestCompleteTokenizeDto.values;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = (i3 & (-58)) | ((~i3) & 57);
        int i5 = -(-((i3 & 57) << 1));
        getAid = (((i4 | i5) << 1) - (i5 ^ i4)) % 128;
        return platform;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/payair/hce/visa/dao/RequestCompleteTokenizeDto$ProtectionType;", "", "<init>", "(Ljava/lang/String;I)V", "SOFTWARE", "TEE", "SE", "CLOUD"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ProtectionType {
        private static int AlternateContactlessPaymentDataJson = 0;
        private static int DigitizedCardProfile = 1;
        public static final com.payair.hce.visa.dao.RequestCompleteTokenizeDto.ProtectionType SOFTWARE = new com.payair.hce.visa.dao.RequestCompleteTokenizeDto.ProtectionType("SOFTWARE", 0);
        public static final com.payair.hce.visa.dao.RequestCompleteTokenizeDto.ProtectionType TEE = new com.payair.hce.visa.dao.RequestCompleteTokenizeDto.ProtectionType("TEE", 1);
        public static final com.payair.hce.visa.dao.RequestCompleteTokenizeDto.ProtectionType SE = new com.payair.hce.visa.dao.RequestCompleteTokenizeDto.ProtectionType("SE", 2);
        public static final com.payair.hce.visa.dao.RequestCompleteTokenizeDto.ProtectionType CLOUD = new com.payair.hce.visa.dao.RequestCompleteTokenizeDto.ProtectionType("CLOUD", 3);
        private static final /* synthetic */ com.payair.hce.visa.dao.RequestCompleteTokenizeDto.ProtectionType[] $VALUES = $values();

        private ProtectionType(java.lang.String str, int i) {
        }

        static {
            int i = DigitizedCardProfile;
            int i2 = i & 93;
            int i3 = i2 + ((i ^ 93) | i2);
            AlternateContactlessPaymentDataJson = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
        }

        private static final /* synthetic */ com.payair.hce.visa.dao.RequestCompleteTokenizeDto.ProtectionType[] $values() {
            com.payair.hce.visa.dao.RequestCompleteTokenizeDto.ProtectionType[] protectionTypeArr;
            int i = AlternateContactlessPaymentDataJson;
            int i2 = (i ^ 80) + ((i & 80) << 1);
            int i3 = (~i2) + (i2 << 1);
            int i4 = i3 % 128;
            DigitizedCardProfile = i4;
            if (i3 % 2 == 0) {
                protectionTypeArr = new com.payair.hce.visa.dao.RequestCompleteTokenizeDto.ProtectionType[5];
                protectionTypeArr[0] = SOFTWARE;
                protectionTypeArr[1] = TEE;
                protectionTypeArr[2] = SE;
                protectionTypeArr[3] = CLOUD;
            } else {
                protectionTypeArr = new com.payair.hce.visa.dao.RequestCompleteTokenizeDto.ProtectionType[]{SOFTWARE, TEE, SE, CLOUD};
            }
            int i5 = ((i4 | 9) << 1) - (i4 ^ 9);
            AlternateContactlessPaymentDataJson = i5 % 128;
            if (i5 % 2 == 0) {
                return protectionTypeArr;
            }
            throw new java.lang.ArithmeticException();
        }

        public static com.payair.hce.visa.dao.RequestCompleteTokenizeDto.ProtectionType valueOf(java.lang.String str) {
            int i = AlternateContactlessPaymentDataJson;
            int i2 = (i & (-42)) | ((~i) & 41);
            int i3 = -(-((i & 41) << 1));
            int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
            DigitizedCardProfile = i4 % 128;
            com.payair.hce.visa.dao.RequestCompleteTokenizeDto.ProtectionType protectionType = (com.payair.hce.visa.dao.RequestCompleteTokenizeDto.ProtectionType) java.lang.Enum.valueOf(com.payair.hce.visa.dao.RequestCompleteTokenizeDto.ProtectionType.class, str);
            if (i4 % 2 == 0) {
                throw null;
            }
            int i5 = AlternateContactlessPaymentDataJson;
            int i6 = (i5 & 44) + (i5 | 44);
            int i7 = (~i6) + (i6 << 1);
            DigitizedCardProfile = i7 % 128;
            if (i7 % 2 != 0) {
                return protectionType;
            }
            throw new java.lang.ArithmeticException();
        }

        public static com.payair.hce.visa.dao.RequestCompleteTokenizeDto.ProtectionType[] values() {
            int i = AlternateContactlessPaymentDataJson;
            int i2 = i & 99;
            int i3 = -(-((i ^ 99) | i2));
            DigitizedCardProfile = ((i2 & i3) + (i3 | i2)) % 128;
            com.payair.hce.visa.dao.RequestCompleteTokenizeDto.ProtectionType[] protectionTypeArr = (com.payair.hce.visa.dao.RequestCompleteTokenizeDto.ProtectionType[]) $VALUES.clone();
            int i4 = DigitizedCardProfile;
            int i5 = i4 & 41;
            int i6 = (i4 ^ 41) | i5;
            int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
            AlternateContactlessPaymentDataJson = i7 % 128;
            if (i7 % 2 == 0) {
                return protectionTypeArr;
            }
            throw null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r"}, d2 = {"Lcom/payair/hce/visa/dao/RequestCompleteTokenizeDto$PresentationType;", "", "<init>", "(Ljava/lang/String;I)V", "NFC_HCE", "NFC_SE", "ECOM", "INAPP", "MSR", "MERCHANT_PRESENTED_QR", "QR_CONSUMER_CLOUD", "RECEIVE_ONLY", "QR_CONSUMER_DEVICE_HCE", "AUTO_FILL"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PresentationType {
        private static int valueOf = 0;
        private static int writeReplace = 1;

        @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "NFC-HCE")
        public static final com.payair.hce.visa.dao.RequestCompleteTokenizeDto.PresentationType NFC_HCE = new com.payair.hce.visa.dao.RequestCompleteTokenizeDto.PresentationType("NFC_HCE", 0);

        @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "NFC-SE")
        public static final com.payair.hce.visa.dao.RequestCompleteTokenizeDto.PresentationType NFC_SE = new com.payair.hce.visa.dao.RequestCompleteTokenizeDto.PresentationType("NFC_SE", 1);
        public static final com.payair.hce.visa.dao.RequestCompleteTokenizeDto.PresentationType ECOM = new com.payair.hce.visa.dao.RequestCompleteTokenizeDto.PresentationType("ECOM", 2);
        public static final com.payair.hce.visa.dao.RequestCompleteTokenizeDto.PresentationType INAPP = new com.payair.hce.visa.dao.RequestCompleteTokenizeDto.PresentationType("INAPP", 3);
        public static final com.payair.hce.visa.dao.RequestCompleteTokenizeDto.PresentationType MSR = new com.payair.hce.visa.dao.RequestCompleteTokenizeDto.PresentationType("MSR", 4);
        public static final com.payair.hce.visa.dao.RequestCompleteTokenizeDto.PresentationType MERCHANT_PRESENTED_QR = new com.payair.hce.visa.dao.RequestCompleteTokenizeDto.PresentationType("MERCHANT_PRESENTED_QR", 5);
        public static final com.payair.hce.visa.dao.RequestCompleteTokenizeDto.PresentationType QR_CONSUMER_CLOUD = new com.payair.hce.visa.dao.RequestCompleteTokenizeDto.PresentationType("QR_CONSUMER_CLOUD", 6);
        public static final com.payair.hce.visa.dao.RequestCompleteTokenizeDto.PresentationType RECEIVE_ONLY = new com.payair.hce.visa.dao.RequestCompleteTokenizeDto.PresentationType("RECEIVE_ONLY", 7);
        public static final com.payair.hce.visa.dao.RequestCompleteTokenizeDto.PresentationType QR_CONSUMER_DEVICE_HCE = new com.payair.hce.visa.dao.RequestCompleteTokenizeDto.PresentationType("QR_CONSUMER_DEVICE_HCE", 8);
        public static final com.payair.hce.visa.dao.RequestCompleteTokenizeDto.PresentationType AUTO_FILL = new com.payair.hce.visa.dao.RequestCompleteTokenizeDto.PresentationType("AUTO_FILL", 9);
        private static final /* synthetic */ com.payair.hce.visa.dao.RequestCompleteTokenizeDto.PresentationType[] $VALUES = $values();

        private PresentationType(java.lang.String str, int i) {
        }

        static {
            int i = valueOf;
            int i2 = i & 61;
            int i3 = (i | 61) & (~i2);
            int i4 = i2 << 1;
            writeReplace = ((i3 & i4) + (i3 | i4)) % 128;
        }

        private static final /* synthetic */ com.payair.hce.visa.dao.RequestCompleteTokenizeDto.PresentationType[] $values() {
            writeReplace = (valueOf + 41) % 128;
            com.payair.hce.visa.dao.RequestCompleteTokenizeDto.PresentationType[] presentationTypeArr = {NFC_HCE, NFC_SE, ECOM, INAPP, MSR, MERCHANT_PRESENTED_QR, QR_CONSUMER_CLOUD, RECEIVE_ONLY, QR_CONSUMER_DEVICE_HCE, AUTO_FILL};
            writeReplace = ((((r0 | 30) << 1) - (r0 ^ 30)) - 1) % 128;
            return presentationTypeArr;
        }

        public static com.payair.hce.visa.dao.RequestCompleteTokenizeDto.PresentationType valueOf(java.lang.String str) {
            int i = valueOf;
            int i2 = ((i & 82) + (i | 82)) - 1;
            writeReplace = i2 % 128;
            com.payair.hce.visa.dao.RequestCompleteTokenizeDto.PresentationType presentationType = (com.payair.hce.visa.dao.RequestCompleteTokenizeDto.PresentationType) java.lang.Enum.valueOf(com.payair.hce.visa.dao.RequestCompleteTokenizeDto.PresentationType.class, str);
            if (i2 % 2 != 0) {
                return presentationType;
            }
            throw null;
        }

        public static com.payair.hce.visa.dao.RequestCompleteTokenizeDto.PresentationType[] values() {
            int i = valueOf;
            int i2 = i & 23;
            int i3 = (i2 - (~(-(-((i ^ 23) | i2))))) - 1;
            writeReplace = i3 % 128;
            int i4 = i3 % 2;
            com.payair.hce.visa.dao.RequestCompleteTokenizeDto.PresentationType[] presentationTypeArr = (com.payair.hce.visa.dao.RequestCompleteTokenizeDto.PresentationType[]) $VALUES.clone();
            if (i4 != 0) {
                return presentationTypeArr;
            }
            throw null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/payair/hce/visa/dao/RequestCompleteTokenizeDto$Platform;", "", "<init>", "(Ljava/lang/String;I)V", "iOS", "ANDROID", "WINDOWS", "WEB"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Platform {
        public static final com.payair.hce.visa.dao.RequestCompleteTokenizeDto.Platform iOS = new com.payair.hce.visa.dao.RequestCompleteTokenizeDto.Platform("iOS", 0);
        public static final com.payair.hce.visa.dao.RequestCompleteTokenizeDto.Platform ANDROID = new com.payair.hce.visa.dao.RequestCompleteTokenizeDto.Platform("ANDROID", 1);
        public static final com.payair.hce.visa.dao.RequestCompleteTokenizeDto.Platform WINDOWS = new com.payair.hce.visa.dao.RequestCompleteTokenizeDto.Platform("WINDOWS", 2);
        public static final com.payair.hce.visa.dao.RequestCompleteTokenizeDto.Platform WEB = new com.payair.hce.visa.dao.RequestCompleteTokenizeDto.Platform("WEB", 3);
        private static final /* synthetic */ com.payair.hce.visa.dao.RequestCompleteTokenizeDto.Platform[] $VALUES = $values();
        private static int DigitizedCardProfile = 1;
        private static int writeReplace = (DigitizedCardProfile + 19) % 128;

        private Platform(java.lang.String str, int i) {
        }

        private static final /* synthetic */ com.payair.hce.visa.dao.RequestCompleteTokenizeDto.Platform[] $values() {
            int i = writeReplace;
            int i2 = i & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
            int i3 = (i | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) & (~i2);
            int i4 = i2 << 1;
            int i5 = (((i3 | i4) << 1) - (i3 ^ i4)) % 128;
            DigitizedCardProfile = i5;
            com.payair.hce.visa.dao.RequestCompleteTokenizeDto.Platform[] platformArr = {iOS, ANDROID, WINDOWS, WEB};
            int i6 = i5 & 69;
            writeReplace = ((((i5 | 69) & (~i6)) - (~(-(-(i6 << 1))))) - 1) % 128;
            return platformArr;
        }

        public static com.payair.hce.visa.dao.RequestCompleteTokenizeDto.Platform valueOf(java.lang.String str) {
            int i = DigitizedCardProfile;
            int i2 = i & 1;
            int i3 = -(-((i ^ 1) | i2));
            int i4 = (i2 & i3) + (i3 | i2);
            writeReplace = i4 % 128;
            com.payair.hce.visa.dao.RequestCompleteTokenizeDto.Platform platform = (com.payair.hce.visa.dao.RequestCompleteTokenizeDto.Platform) java.lang.Enum.valueOf(com.payair.hce.visa.dao.RequestCompleteTokenizeDto.Platform.class, str);
            if (i4 % 2 == 0) {
                return platform;
            }
            throw null;
        }

        public static com.payair.hce.visa.dao.RequestCompleteTokenizeDto.Platform[] values() {
            int i = writeReplace;
            int i2 = ((i ^ 61) | (i & 61)) << 1;
            int i3 = -((i & (-62)) | ((~i) & 61));
            DigitizedCardProfile = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
            com.payair.hce.visa.dao.RequestCompleteTokenizeDto.Platform[] platformArr = (com.payair.hce.visa.dao.RequestCompleteTokenizeDto.Platform[]) $VALUES.clone();
            int i4 = DigitizedCardProfile;
            int i5 = i4 & 105;
            int i6 = (i4 ^ 105) | i5;
            int i7 = (i5 & i6) + (i6 | i5);
            writeReplace = i7 % 128;
            if (i7 % 2 == 0) {
                return platformArr;
            }
            throw null;
        }
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.payair.hce.visa.dao.RequestCompleteTokenizeDto requestCompleteTokenizeDto = (com.payair.hce.visa.dao.RequestCompleteTokenizeDto) objArr[0];
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        java.lang.Object obj = objArr[1];
        int i = getAid;
        int i2 = (i + 7) % 128;
        SdkCoreAlternateContactlessPaymentDataImpl = i2;
        if (requestCompleteTokenizeDto == obj) {
            int i3 = i2 & 1;
            int i4 = ((i2 ^ 1) | i3) << 1;
            int i5 = -((~i3) & (i2 | 1));
            getAid = ((i4 & i5) + (i5 | i4)) % 128;
            int i6 = ((i2 | 57) << 1) - (i2 ^ 57);
            getAid = i6 % 128;
            if (i6 % 2 == 0) {
                return bool2;
            }
            throw null;
        }
        if (!(obj instanceof com.payair.hce.visa.dao.RequestCompleteTokenizeDto)) {
            int i7 = i & 11;
            int i8 = (i7 + ((i ^ 11) | i7)) % 128;
            SdkCoreAlternateContactlessPaymentDataImpl = i8;
            int i9 = i8 & 29;
            getAid = (((i8 | 29) & (~i9)) + (i9 << 1)) % 128;
            return bool;
        }
        com.payair.hce.visa.dao.RequestCompleteTokenizeDto requestCompleteTokenizeDto2 = (com.payair.hce.visa.dao.RequestCompleteTokenizeDto) obj;
        if (requestCompleteTokenizeDto.DigitizedCardProfile != requestCompleteTokenizeDto2.DigitizedCardProfile) {
            int i10 = i2 & 39;
            int i11 = (i10 - (~((i2 ^ 39) | i10))) - 1;
            int i12 = i11 % 128;
            getAid = i12;
            boolean z = i11 % 2 != 0;
            int i13 = i12 & 73;
            int i14 = -(-((i12 ^ 73) | i13));
            SdkCoreAlternateContactlessPaymentDataImpl = ((i13 & i14) + (i13 | i14)) % 128;
            return java.lang.Boolean.valueOf(z);
        }
        if (requestCompleteTokenizeDto.valueOf != requestCompleteTokenizeDto2.valueOf) {
            int i15 = i & 1;
            int i16 = ((i ^ 1) | i15) << 1;
            int i17 = -((~i15) & (i | 1));
            int i18 = (((i16 | i17) << 1) - (i17 ^ i16)) % 128;
            SdkCoreAlternateContactlessPaymentDataImpl = i18;
            getAid = (i18 + 7) % 128;
            return bool;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(requestCompleteTokenizeDto.writeReplace, requestCompleteTokenizeDto2.writeReplace)) {
            int i19 = getAid;
            int i20 = (i19 & (-28)) | ((~i19) & 27);
            int i21 = (i19 & 27) << 1;
            SdkCoreAlternateContactlessPaymentDataImpl = ((i20 ^ i21) + ((i20 & i21) << 1)) % 128;
            int i22 = i19 & 125;
            SdkCoreAlternateContactlessPaymentDataImpl = (i22 + ((i19 ^ 125) | i22)) % 128;
            return bool;
        }
        if (requestCompleteTokenizeDto.values != requestCompleteTokenizeDto2.values) {
            int i23 = getAid;
            int i24 = i23 ^ 11;
            int i25 = ((((i23 & 11) | i24) << 1) - i24) % 128;
            SdkCoreAlternateContactlessPaymentDataImpl = i25;
            int i26 = (i25 & (-46)) | ((~i25) & 45);
            int i27 = -(-((i25 & 45) << 1));
            getAid = ((i26 & i27) + (i27 | i26)) % 128;
            return bool;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(requestCompleteTokenizeDto.AlternateContactlessPaymentDataJson, requestCompleteTokenizeDto2.AlternateContactlessPaymentDataJson)) {
            int i28 = getAid;
            SdkCoreAlternateContactlessPaymentDataImpl = ((i28 & 27) + (i28 | 27)) % 128;
            return bool2;
        }
        int i29 = SdkCoreAlternateContactlessPaymentDataImpl;
        int i30 = (i29 & 12) + (i29 | 12);
        int i31 = (~i30) + (i30 << 1);
        getAid = i31 % 128;
        return java.lang.Boolean.valueOf(i31 % 2 != 0);
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.visa.dao.RequestCompleteTokenizeDto requestCompleteTokenizeDto = (com.payair.hce.visa.dao.RequestCompleteTokenizeDto) objArr[0];
        int i = getAid;
        int i2 = (i | 17) << 1;
        int i3 = -((i & (-18)) | ((~i) & 17));
        SdkCoreAlternateContactlessPaymentDataImpl = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        int hashCode = java.lang.Long.hashCode(requestCompleteTokenizeDto.DigitizedCardProfile);
        int i4 = hashCode * 31;
        int hashCode2 = requestCompleteTokenizeDto.valueOf.hashCode();
        int identityHashCode = java.lang.System.identityHashCode(requestCompleteTokenizeDto);
        int i5 = hashCode2 * 71;
        int i6 = hashCode * (-2139);
        int i7 = ((i5 ^ i6) | (i5 & i6)) << 1;
        int i8 = -(((~i6) & i5) | ((~i5) & i6));
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        int i10 = ~hashCode2;
        int i11 = ~i4;
        int i12 = (i10 & i11) | ((~i10) & i4);
        int i13 = i10 & i4;
        int i14 = ~((i12 ^ i13) | (i12 & i13));
        int i15 = (i4 ^ identityHashCode) | (i4 & identityHashCode);
        int i16 = ~i15;
        int i17 = (i15 | i16) & i16;
        int i18 = -(~(((i14 ^ i17) | (i14 & i17)) * (-140)));
        int i19 = ((i9 & i18) + (i9 | i18)) - 1;
        int i20 = hashCode2 & i4;
        int i21 = i20 | ((~i20) & (hashCode2 | i4));
        int i22 = i21 ^ identityHashCode;
        int i23 = i21 & identityHashCode;
        int i24 = (i23 ^ i22) | (i23 & i22);
        int i25 = ~i24;
        int i26 = -(~(((i24 | i25) & i25) * 70));
        int i27 = ((i19 & i26) + (i26 | i19)) - 1;
        int i28 = i10 & (i10 | hashCode2);
        int i29 = i28 & i4;
        int i30 = ~(((i28 | i4) & (~i29)) | i29);
        int i31 = (i4 | i11) & i11;
        int i32 = ~((i31 ^ hashCode2) | (i31 & hashCode2));
        int i33 = i30 & i32;
        int i34 = ((i30 | i32) & (~i33)) | i33;
        int i35 = hashCode2 | identityHashCode;
        int i36 = ~i35;
        int i37 = (i35 | i36) & i36;
        int i38 = i34 & i37;
        int i39 = (i34 | i37) & (~i38);
        int i40 = -(-(((i39 ^ i38) | (i39 & i38)) * 70));
        int i41 = i27 & i40;
        int i42 = -(-(i40 | i27));
        int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
        int i44 = i43 * 31;
        int hashCode3 = requestCompleteTokenizeDto.writeReplace.hashCode();
        int identityHashCode2 = java.lang.System.identityHashCode(requestCompleteTokenizeDto);
        int i45 = hashCode3 * 829;
        int i46 = i43 * 25699;
        int i47 = ~hashCode3;
        int i48 = (i47 | hashCode3) & i47;
        int i49 = ~i44;
        int i50 = ((~i48) & i49) | ((~i49) & i48) | (i48 & i49);
        int i51 = ~i50;
        int i52 = (i50 | i51) & i51;
        int i53 = ~identityHashCode2;
        int i54 = (i53 & hashCode3) | (i53 & i47) | ((~i53) & hashCode3);
        int i55 = i54 & i44;
        int i56 = (i54 | i44) & (~i55);
        int i57 = (i56 ^ i55) | (i56 & i55);
        int i58 = ~i57;
        int i59 = (i57 | i58) & i58;
        int i60 = ((~i59) & i52) | ((~i52) & i59);
        int i61 = i52 & i59;
        int i62 = (((i45 & i46) + (i46 | i45)) - (~(-(~(((i61 & i60) | (i60 ^ i61)) * (-828)))))) - 2;
        int i63 = hashCode3 & i44;
        int i64 = (hashCode3 & i49) | (i47 & i44) | i63;
        int i65 = i64 & i53;
        int i66 = (i53 | i64) & (~i65);
        int i67 = -(-(((i66 ^ i65) | (i66 & i65)) * (-828)));
        int i68 = ((i62 ^ i67) | (i62 & i67)) << 1;
        int i69 = -(((~i67) & i62) | ((~i62) & i67));
        int i70 = (i68 ^ i69) + ((i69 & i68) << 1);
        int i71 = (~((i44 ^ hashCode3) | i63)) * 828;
        int i72 = ((((~i71) & i70) | ((~i70) & i71)) + ((i71 & i70) << 1)) * 31;
        int i73 = -(-requestCompleteTokenizeDto.values.hashCode());
        int i74 = i72 & i73;
        int i75 = ((((i72 ^ i73) | i74) << 1) - (~(-((i73 | i72) & (~i74))))) - 1;
        int i76 = i75 * 31;
        int hashCode4 = requestCompleteTokenizeDto.AlternateContactlessPaymentDataJson.hashCode();
        int identityHashCode3 = java.lang.System.identityHashCode(requestCompleteTokenizeDto);
        int i77 = hashCode4 * 615;
        int i78 = -(-(i75 * (-19003)));
        int i79 = ((~i78) & i77) | ((~i77) & i78);
        int i80 = (i77 & i78) << 1;
        int i81 = (i79 ^ i80) + ((i80 & i79) << 1);
        int i82 = ~hashCode4;
        int i83 = i82 ^ i76;
        int i84 = i82 & i76;
        int i85 = (i83 ^ i84) | (i83 & i84);
        int i86 = ~i85;
        int i87 = (i85 | i86) & i86;
        int i88 = identityHashCode3 & i87;
        int i89 = (i87 | identityHashCode3) & (~i88);
        int i90 = (i89 ^ i88) | (i89 & i88);
        int i91 = ~i76;
        int i92 = i91 & i82;
        int i93 = ~i91;
        int i94 = (i93 & hashCode4) | i92;
        int i95 = i91 & hashCode4;
        int i96 = ~((i94 ^ i95) | (i95 & i94));
        int i97 = ((i90 ^ i96) | (i90 & i96)) * 614;
        int i98 = ~identityHashCode3;
        int i99 = ~((i82 & i98) | (i82 ^ i98));
        int i100 = (~i84) & (i82 | i76);
        int i101 = ~((i84 ^ i100) | (i84 & i100));
        int i102 = (i101 ^ i99) | (i99 & i101);
        int i103 = ~((i98 & i91) | ((~i98) & i76) | (i98 & i76));
        int i104 = i102 & i103;
        int i105 = (i102 | i103) & (~i104);
        int i106 = ((~i82) & i91) | (i93 & i82);
        int i107 = (i106 ^ i92) | (i106 & i92);
        int i108 = (i107 ^ i98) | (i107 & i98);
        int i109 = ~i108;
        int i110 = (i108 | i109) & i109;
        int i111 = (identityHashCode3 | i98) & i98;
        int i112 = i111 ^ hashCode4;
        int i113 = i111 & hashCode4;
        int i114 = (i113 ^ i112) | (i113 & i112);
        int i115 = i114 & i76;
        int i116 = (i114 | i76) & (~i115);
        int i117 = ~((i116 ^ i115) | (i116 & i115));
        int i118 = i110 & i117;
        int i119 = (i117 | i110) & (~i118);
        int i120 = (((~i97) & i81) | ((~i81) & i97)) + ((i81 & i97) << 1) + (((i105 & i104) | (i105 ^ i104)) * (-1228)) + (((i119 ^ i118) | (i119 & i118)) * 614);
        int i121 = getAid;
        int i122 = (i121 ^ 43) + ((i121 & 43) << 1);
        SdkCoreAlternateContactlessPaymentDataImpl = i122 % 128;
        if (i122 % 2 != 0) {
            return java.lang.Integer.valueOf(i120);
        }
        throw new java.lang.ArithmeticException();
    }

    public final boolean equals(java.lang.Object p0) {
        return ((java.lang.Boolean) writeReplace(new java.lang.Object[]{this, p0}, 991467312, -991467310, java.lang.System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((java.lang.Integer) writeReplace(new java.lang.Object[]{this}, 1263783537, -1263783536, java.lang.System.identityHashCode(this))).intValue();
    }

    public final java.lang.String toString() {
        int i = getAid + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        long j = this.DigitizedCardProfile;
        if (i % 2 == 0) {
            com.payair.hce.visa.dao.RequestCompleteTokenizeDto.ProtectionType protectionType = this.valueOf;
            java.util.List<com.payair.hce.visa.dao.RequestCompleteTokenizeDto.PresentationType> list = this.writeReplace;
            com.payair.hce.visa.dao.RequestCompleteTokenizeDto.Platform platform = this.values;
            com.payair.hce.setWebViewRenderProcessClient setwebviewrenderprocessclient = this.AlternateContactlessPaymentDataJson;
            java.util.Objects.toString(protectionType);
            java.util.Objects.toString(list);
            java.util.Objects.toString(platform);
            java.util.Objects.toString(setwebviewrenderprocessclient);
            throw null;
        }
        com.payair.hce.visa.dao.RequestCompleteTokenizeDto.ProtectionType protectionType2 = this.valueOf;
        java.util.List<com.payair.hce.visa.dao.RequestCompleteTokenizeDto.PresentationType> list2 = this.writeReplace;
        com.payair.hce.visa.dao.RequestCompleteTokenizeDto.Platform platform2 = this.values;
        com.payair.hce.setWebViewRenderProcessClient setwebviewrenderprocessclient2 = this.AlternateContactlessPaymentDataJson;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RequestCompleteTokenizeDto(termsAndConditionsAcceptedAt=");
        sb.append(j);
        sb.append(", protectionType=");
        sb.append(protectionType2);
        sb.append(", presentationType=");
        sb.append(list2);
        sb.append(", platform=");
        sb.append(platform2);
        sb.append(", deviceKeys=");
        sb.append(setwebviewrenderprocessclient2);
        sb.append(")");
        return sb.toString();
    }

    public final com.payair.hce.setWebViewRenderProcessClient writeReplace() {
        return (com.payair.hce.setWebViewRenderProcessClient) writeReplace(new java.lang.Object[]{this}, -1669279283, 1669279287, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.visa.dao.RequestCompleteTokenizeDto.Platform DigitizedCardProfile() {
        return (com.payair.hce.visa.dao.RequestCompleteTokenizeDto.Platform) writeReplace(new java.lang.Object[]{this}, 2083699138, -2083699135, java.lang.System.identityHashCode(this));
    }

    public final java.util.List<com.payair.hce.visa.dao.RequestCompleteTokenizeDto.PresentationType> values() {
        return (java.util.List) writeReplace(new java.lang.Object[]{this}, -693879882, 693879887, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.visa.dao.RequestCompleteTokenizeDto.ProtectionType AlternateContactlessPaymentDataJson() {
        return (com.payair.hce.visa.dao.RequestCompleteTokenizeDto.ProtectionType) writeReplace(new java.lang.Object[]{this}, -1985371648, 1985371648, java.lang.System.identityHashCode(this));
    }

    public final long valueOf() {
        return ((java.lang.Long) writeReplace(new java.lang.Object[]{this}, 1266354983, -1266354977, java.lang.System.identityHashCode(this))).longValue();
    }
}
