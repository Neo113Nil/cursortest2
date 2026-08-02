package com.paypal.oslo.feature.debitcard.api.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardPostEnrollmentAction;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "SEE_DIGITAL_WALLET", "LINK_ACCOUNT", "SHOW_CARD_DETAILS", "NONE"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class DebitCardPostEnrollmentAction {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.debitcard.api.model.DebitCardPostEnrollmentAction[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.debitcard.api.model.DebitCardPostEnrollmentAction.Companion INSTANCE;
    public static final com.paypal.oslo.feature.debitcard.api.model.DebitCardPostEnrollmentAction LINK_ACCOUNT;
    public static final com.paypal.oslo.feature.debitcard.api.model.DebitCardPostEnrollmentAction NONE;
    public static final com.paypal.oslo.feature.debitcard.api.model.DebitCardPostEnrollmentAction SEE_DIGITAL_WALLET;
    public static final com.paypal.oslo.feature.debitcard.api.model.DebitCardPostEnrollmentAction SHOW_CARD_DETAILS;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardPostEnrollmentAction$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardPostEnrollmentAction;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.debitcard.api.model.DebitCardPostEnrollmentAction> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.debitcard.api.model.DebitCardPostEnrollmentAction.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private DebitCardPostEnrollmentAction(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.debitcard.api.model.DebitCardPostEnrollmentAction debitCardPostEnrollmentAction = new com.paypal.oslo.feature.debitcard.api.model.DebitCardPostEnrollmentAction("SEE_DIGITAL_WALLET", 0);
        SEE_DIGITAL_WALLET = debitCardPostEnrollmentAction;
        com.paypal.oslo.feature.debitcard.api.model.DebitCardPostEnrollmentAction debitCardPostEnrollmentAction2 = new com.paypal.oslo.feature.debitcard.api.model.DebitCardPostEnrollmentAction("LINK_ACCOUNT", 1);
        LINK_ACCOUNT = debitCardPostEnrollmentAction2;
        com.paypal.oslo.feature.debitcard.api.model.DebitCardPostEnrollmentAction debitCardPostEnrollmentAction3 = new com.paypal.oslo.feature.debitcard.api.model.DebitCardPostEnrollmentAction("SHOW_CARD_DETAILS", 2);
        SHOW_CARD_DETAILS = debitCardPostEnrollmentAction3;
        com.paypal.oslo.feature.debitcard.api.model.DebitCardPostEnrollmentAction debitCardPostEnrollmentAction4 = new com.paypal.oslo.feature.debitcard.api.model.DebitCardPostEnrollmentAction("NONE", 3);
        NONE = debitCardPostEnrollmentAction4;
        com.paypal.oslo.feature.debitcard.api.model.DebitCardPostEnrollmentAction[] debitCardPostEnrollmentActionArr = {debitCardPostEnrollmentAction, debitCardPostEnrollmentAction2, debitCardPostEnrollmentAction3, debitCardPostEnrollmentAction4};
        $VALUES = debitCardPostEnrollmentActionArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(debitCardPostEnrollmentActionArr);
        INSTANCE = new com.paypal.oslo.feature.debitcard.api.model.DebitCardPostEnrollmentAction.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.api.model.DebitCardPostEnrollmentAction$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.debitcard.api.model.DebitCardPostEnrollmentAction", com.paypal.oslo.feature.debitcard.api.model.DebitCardPostEnrollmentAction.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.debitcard.api.model.DebitCardPostEnrollmentAction[] values() {
        return (com.paypal.oslo.feature.debitcard.api.model.DebitCardPostEnrollmentAction[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.debitcard.api.model.DebitCardPostEnrollmentAction valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.debitcard.api.model.DebitCardPostEnrollmentAction) java.lang.Enum.valueOf(com.paypal.oslo.feature.debitcard.api.model.DebitCardPostEnrollmentAction.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.debitcard.api.model.DebitCardPostEnrollmentAction> getEntries() {
        return $ENTRIES;
    }
}
