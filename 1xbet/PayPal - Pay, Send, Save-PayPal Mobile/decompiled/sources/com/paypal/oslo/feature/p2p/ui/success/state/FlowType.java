package com.paypal.oslo.feature.p2p.ui.success.state;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/success/state/FlowType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.SEND_MONEY, "REQUEST_MONEY", "PAYPAL_LINK"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class FlowType {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.p2p.ui.success.state.FlowType[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.p2p.ui.success.state.FlowType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.p2p.ui.success.state.FlowType PAYPAL_LINK;
    public static final com.paypal.oslo.feature.p2p.ui.success.state.FlowType REQUEST_MONEY;
    public static final com.paypal.oslo.feature.p2p.ui.success.state.FlowType SEND_MONEY;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/success/state/FlowType$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/p2p/ui/success/state/FlowType;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.p2p.ui.success.state.FlowType> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.p2p.ui.success.state.FlowType.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private FlowType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.p2p.ui.success.state.FlowType flowType = new com.paypal.oslo.feature.p2p.ui.success.state.FlowType(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.SEND_MONEY, 0);
        SEND_MONEY = flowType;
        com.paypal.oslo.feature.p2p.ui.success.state.FlowType flowType2 = new com.paypal.oslo.feature.p2p.ui.success.state.FlowType("REQUEST_MONEY", 1);
        REQUEST_MONEY = flowType2;
        com.paypal.oslo.feature.p2p.ui.success.state.FlowType flowType3 = new com.paypal.oslo.feature.p2p.ui.success.state.FlowType("PAYPAL_LINK", 2);
        PAYPAL_LINK = flowType3;
        com.paypal.oslo.feature.p2p.ui.success.state.FlowType[] flowTypeArr = {flowType, flowType2, flowType3};
        $VALUES = flowTypeArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(flowTypeArr);
        INSTANCE = new com.paypal.oslo.feature.p2p.ui.success.state.FlowType.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.success.state.FlowType$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.p2p.ui.success.state.FlowType", com.paypal.oslo.feature.p2p.ui.success.state.FlowType.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.p2p.ui.success.state.FlowType[] values() {
        return (com.paypal.oslo.feature.p2p.ui.success.state.FlowType[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.p2p.ui.success.state.FlowType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.p2p.ui.success.state.FlowType) java.lang.Enum.valueOf(com.paypal.oslo.feature.p2p.ui.success.state.FlowType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.p2p.ui.success.state.FlowType> getEntries() {
        return $ENTRIES;
    }
}
