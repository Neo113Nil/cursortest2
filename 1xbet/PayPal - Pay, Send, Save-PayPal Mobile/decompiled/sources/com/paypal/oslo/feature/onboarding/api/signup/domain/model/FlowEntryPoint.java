package com.paypal.oslo.feature.onboarding.api.signup.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/FlowEntryPoint;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "SHARED_AUTH", "META_P2P", "PAYMENT_LINK", "ORGANIC"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class FlowEntryPoint {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint.Companion INSTANCE;
    public static final com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint META_P2P;
    public static final com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint ORGANIC;
    public static final com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint PAYMENT_LINK;
    public static final com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint SHARED_AUTH;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/FlowEntryPoint$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/FlowEntryPoint;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private FlowEntryPoint(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint flowEntryPoint = new com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint("SHARED_AUTH", 0);
        SHARED_AUTH = flowEntryPoint;
        com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint flowEntryPoint2 = new com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint("META_P2P", 1);
        META_P2P = flowEntryPoint2;
        com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint flowEntryPoint3 = new com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint("PAYMENT_LINK", 2);
        PAYMENT_LINK = flowEntryPoint3;
        com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint flowEntryPoint4 = new com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint("ORGANIC", 3);
        ORGANIC = flowEntryPoint4;
        com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint[] flowEntryPointArr = {flowEntryPoint, flowEntryPoint2, flowEntryPoint3, flowEntryPoint4};
        $VALUES = flowEntryPointArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(flowEntryPointArr);
        INSTANCE = new com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint", com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint[] values() {
        return (com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint) java.lang.Enum.valueOf(com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint> getEntries() {
        return $ENTRIES;
    }
}
