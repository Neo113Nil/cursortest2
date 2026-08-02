package com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/FetchedPurchaseState;", "", "<init>", "(Ljava/lang/String;I)V", "", "canRefund", "()Z", "Companion", "DRAFT", "SENT", "PAID", "PENDING_CONFIRMATION", "REFUNDED", "PENDING_REFUND_CONFIRMATION", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.REFUND}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FetchedPurchaseState {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseState.Companion INSTANCE;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseState DRAFT;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseState PAID;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseState PENDING_CONFIRMATION;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseState PENDING_REFUND_CONFIRMATION;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseState REFUND;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseState REFUNDED;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseState SENT;
    private static final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseState[] getHighSpeedVideoFpsRangesFor;

    private FetchedPurchaseState(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseState fetchedPurchaseState = new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseState("DRAFT", 0);
        DRAFT = fetchedPurchaseState;
        com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseState fetchedPurchaseState2 = new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseState("SENT", 1);
        SENT = fetchedPurchaseState2;
        com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseState fetchedPurchaseState3 = new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseState("PAID", 2);
        PAID = fetchedPurchaseState3;
        com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseState fetchedPurchaseState4 = new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseState("PENDING_CONFIRMATION", 3);
        PENDING_CONFIRMATION = fetchedPurchaseState4;
        com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseState fetchedPurchaseState5 = new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseState("REFUNDED", 4);
        REFUNDED = fetchedPurchaseState5;
        com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseState fetchedPurchaseState6 = new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseState("PENDING_REFUND_CONFIRMATION", 5);
        PENDING_REFUND_CONFIRMATION = fetchedPurchaseState6;
        com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseState fetchedPurchaseState7 = new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseState(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.REFUND, 6);
        REFUND = fetchedPurchaseState7;
        com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseState[] fetchedPurchaseStateArr = {fetchedPurchaseState, fetchedPurchaseState2, fetchedPurchaseState3, fetchedPurchaseState4, fetchedPurchaseState5, fetchedPurchaseState6, fetchedPurchaseState7};
        getHighSpeedVideoFpsRangesFor = fetchedPurchaseStateArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(fetchedPurchaseStateArr);
        INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseState.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/FetchedPurchaseState$Companion;", "", "<init>", "()V", "", "state", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/FetchedPurchaseState;", "fromString", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/FetchedPurchaseState;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseState fromString(java.lang.String state) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
            java.lang.String upperCase = state.toUpperCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
            switch (upperCase.hashCode()) {
                case -1881484424:
                    if (upperCase.equals(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.REFUND)) {
                        return com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseState.REFUND;
                    }
                    break;
                case -238047532:
                    if (upperCase.equals("PENDING_REFUND_CONFIRMATION")) {
                        return com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseState.PENDING_REFUND_CONFIRMATION;
                    }
                    break;
                case 2448076:
                    if (upperCase.equals("PAID")) {
                        return com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseState.PAID;
                    }
                    break;
                case 2541464:
                    if (upperCase.equals("SENT")) {
                        return com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseState.SENT;
                    }
                    break;
                case 65307009:
                    if (upperCase.equals("DRAFT")) {
                        return com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseState.DRAFT;
                    }
                    break;
                case 74702359:
                    if (upperCase.equals("REFUNDED")) {
                        return com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseState.REFUNDED;
                    }
                    break;
                case 82027005:
                    if (upperCase.equals("PENDING_CONFIRMATION")) {
                        return com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseState.PENDING_CONFIRMATION;
                    }
                    break;
            }
            return com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseState.DRAFT;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final boolean canRefund() {
        return this == PAID || this == PENDING_CONFIRMATION;
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseState[] values() {
        return (com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseState[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseState valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseState) java.lang.Enum.valueOf(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseState.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseState> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
