package com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0011\u001a\u001a\u0012\u0004\u0012\u00020\u000f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00100\u000e2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/intro/mvi/DebitCardAcquisitionIntroReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/intro/mvi/DebitCardAcquisitionIntroState;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/intro/mvi/DebitCardAcquisitionIntroEvent;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/intro/mvi/DebitCardAcquisitionIntroEffect;", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "<init>", "(Lcom/paypal/oslo/core/userstore/UserStore;)V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/intro/mvi/DebitCardAcquisitionIntroState;Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/intro/mvi/DebitCardAcquisitionIntroEvent;)Larrow/core/Either;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/userstore/UserStore;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitCardAcquisitionIntroReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroState, com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroEvent, com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroEffect> {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.userstore.UserStore getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public DebitCardAcquisitionIntroReducer(com.paypal.oslo.core.userstore.UserStore userStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        this.getHighSpeedVideoFpsRanges = userStore;
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "DebitCardAcquisitionIntroReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroState, com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroEffect>> reduce(com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroState state, com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (event instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroEvent.CheckEligibility) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroState.Loading(0, 1, null), null, 2, null);
        }
        if (!(event instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroEvent.EligibilityLoaded)) {
            if (event instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroEvent.EligibilityCheckFailed) {
                com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroState.Loading loading = state instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroState.Loading ? (com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroState.Loading) state : null;
                com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroEvent.EligibilityCheckFailed eligibilityCheckFailed = (com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroEvent.EligibilityCheckFailed) event;
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroState.Error(eligibilityCheckFailed.getErrorInfo(), eligibilityCheckFailed.getErrorType(), loading != null ? loading.getRetryCount() : 0), null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroEvent.ErrorActionCtaClicked) {
                if (state instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroState.Error) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroState.Loading(((com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroState.Error) state).getRetryCount() + 1), null, 2, null);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(state, event);
            }
            if (event instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroEvent.ErrorDismissCtaClicked) {
                if ((state instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroState.Error) || (state instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroState.Ineligible) || (state instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroState.EligibleWithCondition)) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(state, com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroEffect.NavigateBack.INSTANCE);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(state, event);
            }
            if (!(event instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroEvent.GetDebitCardButtonClicked)) {
                if (!(event instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroEvent.CrossButtonClicked)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(state, com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroEffect.NavigateBack.INSTANCE);
            }
            com.paypal.oslo.core.userstore.model.UserState value = this.getHighSpeedVideoFpsRanges.getUserState().getValue();
            if (value instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) {
                if (com.paypal.oslo.feature.debitcard.shared.util.UserStoreExtensionsKt.isUSUser((com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) value)) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(state, com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroEffect.ShowTermsBottomSheet.INSTANCE);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(state, com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroEffect.NavigateToAcquisitionWebView.INSTANCE);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(state, event);
        }
        com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityResponse response = ((com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroEvent.EligibilityLoaded) event).getResponse();
        int i = com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroReducer.WhenMappings.$EnumSwitchMapping$0[response.getEligibilityStatus().ordinal()];
        if (i == 1) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroState.Eligible(response), null, 2, null);
        }
        if (i == 2) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroState.EligibleWithCondition(response), null, 2, null);
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        if (com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityResponseKt.hasSimilarProductExists(response)) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroState.Ineligible(response), com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroEffect.NavigateToCardManagement.INSTANCE);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroState.Ineligible(response), null, 2, null);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.debitcard.shared.domain.model.eligibility.EligibilityStatus.values().length];
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.domain.model.eligibility.EligibilityStatus.ELIGIBLE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.domain.model.eligibility.EligibilityStatus.ELIGIBLE_WITH_CONDITION.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.domain.model.eligibility.EligibilityStatus.INELIGIBLE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
