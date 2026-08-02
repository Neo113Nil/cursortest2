package com.paypal.oslo.feature.taptopay.domain.model.personalization;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/personalization/StretchOfferState;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel.DECISION_ELIGIBLE, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, com.payair.model.TokenStatusKt.TOKEN_ACTIVE, "EXPIRED"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class StretchOfferState {
    public static final com.paypal.oslo.feature.taptopay.domain.model.personalization.StretchOfferState ACTIVE;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.taptopay.domain.model.personalization.StretchOfferState.Companion INSTANCE;
    public static final com.paypal.oslo.feature.taptopay.domain.model.personalization.StretchOfferState ELIGIBLE;
    public static final com.paypal.oslo.feature.taptopay.domain.model.personalization.StretchOfferState EXPIRED;
    public static final com.paypal.oslo.feature.taptopay.domain.model.personalization.StretchOfferState PENDING;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.personalization.StretchOfferState[] getHighSpeedVideoFpsRanges;

    private StretchOfferState(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.taptopay.domain.model.personalization.StretchOfferState stretchOfferState = new com.paypal.oslo.feature.taptopay.domain.model.personalization.StretchOfferState(com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel.DECISION_ELIGIBLE, 0);
        ELIGIBLE = stretchOfferState;
        com.paypal.oslo.feature.taptopay.domain.model.personalization.StretchOfferState stretchOfferState2 = new com.paypal.oslo.feature.taptopay.domain.model.personalization.StretchOfferState(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, 1);
        PENDING = stretchOfferState2;
        com.paypal.oslo.feature.taptopay.domain.model.personalization.StretchOfferState stretchOfferState3 = new com.paypal.oslo.feature.taptopay.domain.model.personalization.StretchOfferState(com.payair.model.TokenStatusKt.TOKEN_ACTIVE, 2);
        ACTIVE = stretchOfferState3;
        com.paypal.oslo.feature.taptopay.domain.model.personalization.StretchOfferState stretchOfferState4 = new com.paypal.oslo.feature.taptopay.domain.model.personalization.StretchOfferState("EXPIRED", 3);
        EXPIRED = stretchOfferState4;
        com.paypal.oslo.feature.taptopay.domain.model.personalization.StretchOfferState[] stretchOfferStateArr = {stretchOfferState, stretchOfferState2, stretchOfferState3, stretchOfferState4};
        getHighSpeedVideoFpsRanges = stretchOfferStateArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(stretchOfferStateArr);
        INSTANCE = new com.paypal.oslo.feature.taptopay.domain.model.personalization.StretchOfferState.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/personalization/StretchOfferState$Companion;", "", "<init>", "()V", "", "name", "Lcom/paypal/oslo/feature/taptopay/domain/model/personalization/StretchOfferState;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT, "fromName", "(Ljava/lang/String;Lcom/paypal/oslo/feature/taptopay/domain/model/personalization/StretchOfferState;)Lcom/paypal/oslo/feature/taptopay/domain/model/personalization/StretchOfferState;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.personalization.StretchOfferState fromName$default(com.paypal.oslo.feature.taptopay.domain.model.personalization.StretchOfferState.Companion companion, java.lang.String str, com.paypal.oslo.feature.taptopay.domain.model.personalization.StretchOfferState stretchOfferState, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                stretchOfferState = com.paypal.oslo.feature.taptopay.domain.model.personalization.StretchOfferState.ELIGIBLE;
            }
            return companion.fromName(str, stretchOfferState);
        }

        public final com.paypal.oslo.feature.taptopay.domain.model.personalization.StretchOfferState fromName(java.lang.String name2, com.paypal.oslo.feature.taptopay.domain.model.personalization.StretchOfferState r6) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, "");
            java.util.Iterator<E> it = com.paypal.oslo.feature.taptopay.domain.model.personalization.StretchOfferState.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.text.StringsKt.equals(((com.paypal.oslo.feature.taptopay.domain.model.personalization.StretchOfferState) obj).name(), name2, true)) {
                    break;
                }
            }
            com.paypal.oslo.feature.taptopay.domain.model.personalization.StretchOfferState stretchOfferState = (com.paypal.oslo.feature.taptopay.domain.model.personalization.StretchOfferState) obj;
            return stretchOfferState == null ? r6 : stretchOfferState;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.taptopay.domain.model.personalization.StretchOfferState[] values() {
        return (com.paypal.oslo.feature.taptopay.domain.model.personalization.StretchOfferState[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.taptopay.domain.model.personalization.StretchOfferState valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.taptopay.domain.model.personalization.StretchOfferState) java.lang.Enum.valueOf(com.paypal.oslo.feature.taptopay.domain.model.personalization.StretchOfferState.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.taptopay.domain.model.personalization.StretchOfferState> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
