package com.paypal.oslo.feature.pools.shared.ui.error;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0081\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/pools/shared/ui/error/ErrorAction;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "RETRY", "DISMISS"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class ErrorAction {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.pools.shared.ui.error.ErrorAction[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.pools.shared.ui.error.ErrorAction.Companion INSTANCE;
    public static final com.paypal.oslo.feature.pools.shared.ui.error.ErrorAction DISMISS;
    public static final com.paypal.oslo.feature.pools.shared.ui.error.ErrorAction RETRY;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/pools/shared/ui/error/ErrorAction$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/pools/shared/ui/error/ErrorAction;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.pools.shared.ui.error.ErrorAction> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.pools.shared.ui.error.ErrorAction.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private ErrorAction(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.pools.shared.ui.error.ErrorAction errorAction = new com.paypal.oslo.feature.pools.shared.ui.error.ErrorAction("RETRY", 0);
        RETRY = errorAction;
        com.paypal.oslo.feature.pools.shared.ui.error.ErrorAction errorAction2 = new com.paypal.oslo.feature.pools.shared.ui.error.ErrorAction("DISMISS", 1);
        DISMISS = errorAction2;
        com.paypal.oslo.feature.pools.shared.ui.error.ErrorAction[] errorActionArr = {errorAction, errorAction2};
        $VALUES = errorActionArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(errorActionArr);
        INSTANCE = new com.paypal.oslo.feature.pools.shared.ui.error.ErrorAction.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.pools.shared.ui.error.ErrorAction$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.pools.shared.ui.error.ErrorAction", com.paypal.oslo.feature.pools.shared.ui.error.ErrorAction.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.pools.shared.ui.error.ErrorAction[] values() {
        return (com.paypal.oslo.feature.pools.shared.ui.error.ErrorAction[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.pools.shared.ui.error.ErrorAction valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.pools.shared.ui.error.ErrorAction) java.lang.Enum.valueOf(com.paypal.oslo.feature.pools.shared.ui.error.ErrorAction.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.pools.shared.ui.error.ErrorAction> getEntries() {
        return $ENTRIES;
    }
}
