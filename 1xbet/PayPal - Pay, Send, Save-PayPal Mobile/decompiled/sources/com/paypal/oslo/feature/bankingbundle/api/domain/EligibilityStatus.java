package com.paypal.oslo.feature.bankingbundle.api.domain;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0005\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bankingbundle/api/domain/EligibilityStatus;", "", "<init>", "(Ljava/lang/String;I)V", "", "isTerminal", "()Z", "Companion", com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel.DECISION_ELIGIBLE, com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel.DECISION_INELIGIBLE, "ELIGIBLE_WITH_CONDITION", "BUNDLE_PROVISIONED"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class EligibilityStatus {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;
    public static final com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus BUNDLE_PROVISIONED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus.Companion INSTANCE;
    public static final com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus ELIGIBLE;
    public static final com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus ELIGIBLE_WITH_CONDITION;
    public static final com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus INELIGIBLE;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bankingbundle/api/domain/EligibilityStatus$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/bankingbundle/api/domain/EligibilityStatus;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private EligibilityStatus(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus eligibilityStatus = new com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus(com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel.DECISION_ELIGIBLE, 0);
        ELIGIBLE = eligibilityStatus;
        com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus eligibilityStatus2 = new com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus(com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel.DECISION_INELIGIBLE, 1);
        INELIGIBLE = eligibilityStatus2;
        com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus eligibilityStatus3 = new com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus("ELIGIBLE_WITH_CONDITION", 2);
        ELIGIBLE_WITH_CONDITION = eligibilityStatus3;
        com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus eligibilityStatus4 = new com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus("BUNDLE_PROVISIONED", 3);
        BUNDLE_PROVISIONED = eligibilityStatus4;
        com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus[] eligibilityStatusArr = {eligibilityStatus, eligibilityStatus2, eligibilityStatus3, eligibilityStatus4};
        $VALUES = eligibilityStatusArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(eligibilityStatusArr);
        INSTANCE = new com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus", com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public final boolean isTerminal() {
        return this == BUNDLE_PROVISIONED || this == INELIGIBLE;
    }

    public static com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus[] values() {
        return (com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus> getEntries() {
        return $ENTRIES;
    }
}
