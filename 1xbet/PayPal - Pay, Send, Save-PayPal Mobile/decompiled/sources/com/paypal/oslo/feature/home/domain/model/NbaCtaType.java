package com.paypal.oslo.feature.home.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0081\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/home/domain/model/NbaCtaType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "SECURE_WEBVIEW", "NATIVE", "IAB"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class NbaCtaType {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.home.domain.model.NbaCtaType[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.home.domain.model.NbaCtaType.Companion INSTANCE;

    @kotlinx.serialization.SerialName("IAB")
    public static final com.paypal.oslo.feature.home.domain.model.NbaCtaType IAB;

    @kotlinx.serialization.SerialName("NATIVE")
    public static final com.paypal.oslo.feature.home.domain.model.NbaCtaType NATIVE;

    @kotlinx.serialization.SerialName("SECURE_WEBVIEW")
    public static final com.paypal.oslo.feature.home.domain.model.NbaCtaType SECURE_WEBVIEW;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/home/domain/model/NbaCtaType$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/home/domain/model/NbaCtaType;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.home.domain.model.NbaCtaType> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.home.domain.model.NbaCtaType.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private NbaCtaType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.home.domain.model.NbaCtaType nbaCtaType = new com.paypal.oslo.feature.home.domain.model.NbaCtaType("SECURE_WEBVIEW", 0);
        SECURE_WEBVIEW = nbaCtaType;
        com.paypal.oslo.feature.home.domain.model.NbaCtaType nbaCtaType2 = new com.paypal.oslo.feature.home.domain.model.NbaCtaType("NATIVE", 1);
        NATIVE = nbaCtaType2;
        com.paypal.oslo.feature.home.domain.model.NbaCtaType nbaCtaType3 = new com.paypal.oslo.feature.home.domain.model.NbaCtaType("IAB", 2);
        IAB = nbaCtaType3;
        com.paypal.oslo.feature.home.domain.model.NbaCtaType[] nbaCtaTypeArr = {nbaCtaType, nbaCtaType2, nbaCtaType3};
        $VALUES = nbaCtaTypeArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(nbaCtaTypeArr);
        INSTANCE = new com.paypal.oslo.feature.home.domain.model.NbaCtaType.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.home.domain.model.NbaCtaType$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createAnnotatedEnumSerializer;
                createAnnotatedEnumSerializer = kotlinx.serialization.internal.EnumsKt.createAnnotatedEnumSerializer("com.paypal.oslo.feature.home.domain.model.NbaCtaType", com.paypal.oslo.feature.home.domain.model.NbaCtaType.values(), new java.lang.String[]{"SECURE_WEBVIEW", "NATIVE", "IAB"}, new java.lang.annotation.Annotation[][]{null, null, null}, null);
                return createAnnotatedEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.home.domain.model.NbaCtaType[] values() {
        return (com.paypal.oslo.feature.home.domain.model.NbaCtaType[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.home.domain.model.NbaCtaType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.home.domain.model.NbaCtaType) java.lang.Enum.valueOf(com.paypal.oslo.feature.home.domain.model.NbaCtaType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.home.domain.model.NbaCtaType> getEntries() {
        return $ENTRIES;
    }
}
