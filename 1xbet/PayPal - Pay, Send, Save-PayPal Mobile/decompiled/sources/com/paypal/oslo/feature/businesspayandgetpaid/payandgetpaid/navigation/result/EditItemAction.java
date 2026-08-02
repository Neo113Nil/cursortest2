package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.result;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0081\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/navigation/result/EditItemAction;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "EDIT", "REMOVE"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class EditItemAction {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.result.EditItemAction[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.result.EditItemAction.Companion INSTANCE;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.result.EditItemAction EDIT;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.result.EditItemAction REMOVE;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/navigation/result/EditItemAction$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/navigation/result/EditItemAction;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.result.EditItemAction> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.result.EditItemAction.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private EditItemAction(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.result.EditItemAction editItemAction = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.result.EditItemAction("EDIT", 0);
        EDIT = editItemAction;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.result.EditItemAction editItemAction2 = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.result.EditItemAction("REMOVE", 1);
        REMOVE = editItemAction2;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.result.EditItemAction[] editItemActionArr = {editItemAction, editItemAction2};
        $VALUES = editItemActionArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(editItemActionArr);
        INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.result.EditItemAction.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.result.EditItemAction$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.result.EditItemAction", com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.result.EditItemAction.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.result.EditItemAction[] values() {
        return (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.result.EditItemAction[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.result.EditItemAction valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.result.EditItemAction) java.lang.Enum.valueOf(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.result.EditItemAction.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.result.EditItemAction> getEntries() {
        return $ENTRIES;
    }
}
