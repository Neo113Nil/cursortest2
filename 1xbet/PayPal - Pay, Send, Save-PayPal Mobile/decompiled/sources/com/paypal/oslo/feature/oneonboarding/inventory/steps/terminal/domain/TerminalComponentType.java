package com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.domain;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0081\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/terminal/domain/TerminalComponentType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "REVIEW_PENDING", "ADDITIONAL_INFO_NEEDED", "REGION_NOT_SUPPORTED", "PRODUCT_NOT_SETUP"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class TerminalComponentType {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.domain.TerminalComponentType[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;
    public static final com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.domain.TerminalComponentType ADDITIONAL_INFO_NEEDED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.domain.TerminalComponentType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.domain.TerminalComponentType PRODUCT_NOT_SETUP;
    public static final com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.domain.TerminalComponentType REGION_NOT_SUPPORTED;
    public static final com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.domain.TerminalComponentType REVIEW_PENDING;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/terminal/domain/TerminalComponentType$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/terminal/domain/TerminalComponentType;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.domain.TerminalComponentType> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.domain.TerminalComponentType.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private TerminalComponentType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.domain.TerminalComponentType terminalComponentType = new com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.domain.TerminalComponentType("REVIEW_PENDING", 0);
        REVIEW_PENDING = terminalComponentType;
        com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.domain.TerminalComponentType terminalComponentType2 = new com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.domain.TerminalComponentType("ADDITIONAL_INFO_NEEDED", 1);
        ADDITIONAL_INFO_NEEDED = terminalComponentType2;
        com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.domain.TerminalComponentType terminalComponentType3 = new com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.domain.TerminalComponentType("REGION_NOT_SUPPORTED", 2);
        REGION_NOT_SUPPORTED = terminalComponentType3;
        com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.domain.TerminalComponentType terminalComponentType4 = new com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.domain.TerminalComponentType("PRODUCT_NOT_SETUP", 3);
        PRODUCT_NOT_SETUP = terminalComponentType4;
        com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.domain.TerminalComponentType[] terminalComponentTypeArr = {terminalComponentType, terminalComponentType2, terminalComponentType3, terminalComponentType4};
        $VALUES = terminalComponentTypeArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(terminalComponentTypeArr);
        INSTANCE = new com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.domain.TerminalComponentType.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.domain.TerminalComponentType$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.domain.TerminalComponentType", com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.domain.TerminalComponentType.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.domain.TerminalComponentType[] values() {
        return (com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.domain.TerminalComponentType[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.domain.TerminalComponentType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.domain.TerminalComponentType) java.lang.Enum.valueOf(com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.domain.TerminalComponentType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.domain.TerminalComponentType> getEntries() {
        return $ENTRIES;
    }
}
