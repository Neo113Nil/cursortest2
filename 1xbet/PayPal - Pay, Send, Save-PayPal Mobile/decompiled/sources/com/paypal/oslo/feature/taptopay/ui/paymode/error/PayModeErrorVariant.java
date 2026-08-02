package com.paypal.oslo.feature.taptopay.ui.paymode.error;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/paymode/error/PayModeErrorVariant;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "SCREEN_LOCK", "FULL_SCREEN", "OFFLINE_LIMIT", "SCREEN_LOCK_OFF"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class PayModeErrorVariant {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.taptopay.ui.paymode.error.PayModeErrorVariant[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.taptopay.ui.paymode.error.PayModeErrorVariant.Companion INSTANCE;
    public static final com.paypal.oslo.feature.taptopay.ui.paymode.error.PayModeErrorVariant FULL_SCREEN;
    public static final com.paypal.oslo.feature.taptopay.ui.paymode.error.PayModeErrorVariant OFFLINE_LIMIT;
    public static final com.paypal.oslo.feature.taptopay.ui.paymode.error.PayModeErrorVariant SCREEN_LOCK;
    public static final com.paypal.oslo.feature.taptopay.ui.paymode.error.PayModeErrorVariant SCREEN_LOCK_OFF;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/paymode/error/PayModeErrorVariant$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/error/PayModeErrorVariant;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.taptopay.ui.paymode.error.PayModeErrorVariant> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.taptopay.ui.paymode.error.PayModeErrorVariant.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private PayModeErrorVariant(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.taptopay.ui.paymode.error.PayModeErrorVariant payModeErrorVariant = new com.paypal.oslo.feature.taptopay.ui.paymode.error.PayModeErrorVariant("SCREEN_LOCK", 0);
        SCREEN_LOCK = payModeErrorVariant;
        com.paypal.oslo.feature.taptopay.ui.paymode.error.PayModeErrorVariant payModeErrorVariant2 = new com.paypal.oslo.feature.taptopay.ui.paymode.error.PayModeErrorVariant("FULL_SCREEN", 1);
        FULL_SCREEN = payModeErrorVariant2;
        com.paypal.oslo.feature.taptopay.ui.paymode.error.PayModeErrorVariant payModeErrorVariant3 = new com.paypal.oslo.feature.taptopay.ui.paymode.error.PayModeErrorVariant("OFFLINE_LIMIT", 2);
        OFFLINE_LIMIT = payModeErrorVariant3;
        com.paypal.oslo.feature.taptopay.ui.paymode.error.PayModeErrorVariant payModeErrorVariant4 = new com.paypal.oslo.feature.taptopay.ui.paymode.error.PayModeErrorVariant("SCREEN_LOCK_OFF", 3);
        SCREEN_LOCK_OFF = payModeErrorVariant4;
        com.paypal.oslo.feature.taptopay.ui.paymode.error.PayModeErrorVariant[] payModeErrorVariantArr = {payModeErrorVariant, payModeErrorVariant2, payModeErrorVariant3, payModeErrorVariant4};
        $VALUES = payModeErrorVariantArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(payModeErrorVariantArr);
        INSTANCE = new com.paypal.oslo.feature.taptopay.ui.paymode.error.PayModeErrorVariant.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.error.PayModeErrorVariant$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.taptopay.ui.paymode.error.PayModeErrorVariant", com.paypal.oslo.feature.taptopay.ui.paymode.error.PayModeErrorVariant.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.taptopay.ui.paymode.error.PayModeErrorVariant[] values() {
        return (com.paypal.oslo.feature.taptopay.ui.paymode.error.PayModeErrorVariant[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.taptopay.ui.paymode.error.PayModeErrorVariant valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.taptopay.ui.paymode.error.PayModeErrorVariant) java.lang.Enum.valueOf(com.paypal.oslo.feature.taptopay.ui.paymode.error.PayModeErrorVariant.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.taptopay.ui.paymode.error.PayModeErrorVariant> getEntries() {
        return $ENTRIES;
    }
}
