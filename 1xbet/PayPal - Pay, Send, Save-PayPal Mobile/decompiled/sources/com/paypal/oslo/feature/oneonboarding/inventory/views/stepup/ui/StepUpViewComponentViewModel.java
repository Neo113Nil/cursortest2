package com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.ui;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00148\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/stepup/ui/StepUpViewComponentViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/core/identity/stepup/StepupChallengeHandler;", "stepupChallengeHandler", "<init>", "(Lcom/paypal/oslo/core/identity/stepup/StepupChallengeHandler;)V", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "intentId", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/stepup/domain/StepUpViewComponentConfig;", "config", "", "triggerStepupChallenge", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Lcom/paypal/oslo/feature/oneonboarding/inventory/views/stepup/domain/StepUpViewComponentConfig;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/identity/stepup/StepupChallengeHandler;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/channels/Channel;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/stepup/ui/StepUpViewComponentAction;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/channels/Channel;", "Lkotlinx/coroutines/flow/Flow;", "action", "Lkotlinx/coroutines/flow/Flow;", "getAction", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class StepUpViewComponentViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.ui.StepUpViewComponentAction> action;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.identity.stepup.StepupChallengeHandler getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.channels.Channel<com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.ui.StepUpViewComponentAction> getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public StepUpViewComponentViewModel(com.paypal.oslo.core.identity.stepup.StepupChallengeHandler stepupChallengeHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepupChallengeHandler, "");
        this.getHighSpeedVideoFpsRanges = stepupChallengeHandler;
        kotlinx.coroutines.channels.Channel<com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.ui.StepUpViewComponentAction> Channel$default = kotlinx.coroutines.channels.ChannelKt.Channel$default(0, null, null, 7, null);
        this.getHighSpeedVideoFpsRangesFor = Channel$default;
        this.action = kotlinx.coroutines.flow.FlowKt.receiveAsFlow(Channel$default);
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.ui.StepUpViewComponentAction> getAction() {
        return this.action;
    }

    public final void triggerStepupChallenge(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.domain.StepUpViewComponentConfig config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.ui.StepUpViewComponentViewModel$triggerStepupChallenge$1(config, intentId, this, null), 3, null);
    }
}
