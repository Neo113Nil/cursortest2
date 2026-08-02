package com.paypal.oslo.feature.verificationcapture.api.models;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/api/models/SupportedLocale;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "bcp47Tag", "Ljava/lang/String;", "getBcp47Tag", "()Ljava/lang/String;", "Companion", "EN_US", "ES_US", "FR_US", "ZH_US"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class SupportedLocale {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale.Companion INSTANCE;
    public static final com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale EN_US;
    public static final com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale ES_US;
    public static final com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale FR_US;
    public static final com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale ZH_US;
    private final java.lang.String bcp47Tag;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/api/models/SupportedLocale$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/verificationcapture/api/models/SupportedLocale;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private SupportedLocale(java.lang.String str, int i, java.lang.String str2) {
        this.bcp47Tag = str2;
    }

    public final java.lang.String getBcp47Tag() {
        return this.bcp47Tag;
    }

    static {
        com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale supportedLocale = new com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale("EN_US", 0, "en-US");
        EN_US = supportedLocale;
        com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale supportedLocale2 = new com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale("ES_US", 1, "es-US");
        ES_US = supportedLocale2;
        com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale supportedLocale3 = new com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale("FR_US", 2, "fr-US");
        FR_US = supportedLocale3;
        com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale supportedLocale4 = new com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale("ZH_US", 3, "zh-US");
        ZH_US = supportedLocale4;
        com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale[] supportedLocaleArr = {supportedLocale, supportedLocale2, supportedLocale3, supportedLocale4};
        $VALUES = supportedLocaleArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(supportedLocaleArr);
        INSTANCE = new com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale", com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale[] values() {
        return (com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale) java.lang.Enum.valueOf(com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale> getEntries() {
        return $ENTRIES;
    }
}
