package com.paypal.oslo.feature.onboarding.postonboarding.addnfc.ui;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/postonboarding/addnfc/ui/NfcResultHandler;", "", "Lcom/paypal/oslo/feature/onboarding/postonboarding/addnfc/navigation/AddNfcDestination;", "destination", "Lkotlin/Function0;", "", "onNext", "onSkip", "onClose", "<init>", "(Lcom/paypal/oslo/feature/onboarding/postonboarding/addnfc/navigation/AddNfcDestination;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Lcom/paypal/oslo/feature/taptopay/api/navigation/result/onboarding/OnboardingTapToPayNavResult;", "result", "handleResult", "(Lcom/paypal/oslo/feature/taptopay/api/navigation/result/onboarding/OnboardingTapToPayNavResult;)V", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/onboarding/postonboarding/addnfc/navigation/AddNfcDestination;", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function0;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NfcResultHandler {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.onboarding.postonboarding.addnfc.navigation.AddNfcDestination getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;

    public NfcResultHandler(com.paypal.oslo.feature.onboarding.postonboarding.addnfc.navigation.AddNfcDestination addNfcDestination, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function0<kotlin.Unit> function03) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addNfcDestination, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        this.getHighSpeedVideoFpsRangesFor = addNfcDestination;
        this.getHighSpeedVideoSizes = function0;
        java.util.Set<com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Transition> supportedTransitions = addNfcDestination.getStep().getSupportedTransitions();
        if (!(supportedTransitions instanceof java.util.Collection) || !supportedTransitions.isEmpty()) {
            java.util.Iterator<T> it = supportedTransitions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Transition) it.next()) instanceof com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Close) {
                    function02 = function03;
                    break;
                }
            }
        }
        this.getHighResolutionOutputSizeshNQ4ISI = function02;
    }

    public final void handleResult(com.paypal.oslo.feature.taptopay.api.navigation.result.onboarding.OnboardingTapToPayNavResult result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        com.paypal.oslo.feature.taptopay.api.navigation.result.onboarding.OnboardingTapToPayNavResult.Status status = result.getStatus();
        if (status instanceof com.paypal.oslo.feature.taptopay.api.navigation.result.onboarding.OnboardingTapToPayNavResult.Status.Success) {
            this.getHighSpeedVideoSizes.invoke();
            return;
        }
        if (status instanceof com.paypal.oslo.feature.taptopay.api.navigation.result.onboarding.OnboardingTapToPayNavResult.Status.Cancelled) {
            this.getHighResolutionOutputSizeshNQ4ISI.invoke();
        } else {
            if (!(status instanceof com.paypal.oslo.feature.taptopay.api.navigation.result.onboarding.OnboardingTapToPayNavResult.Status.Error)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.onboarding.LoggerKt.log, "NFC provisioning error", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureTelemetry.Attributes.FLOW_ID, this.getHighSpeedVideoFpsRangesFor.mo15903getFlowId8NcbBzM()), kotlin.TuplesKt.to("step_id", this.getHighSpeedVideoFpsRangesFor.getStep().m16524getStepIdeVUBM90())), null, null, 12, null);
            this.getHighResolutionOutputSizeshNQ4ISI.invoke();
        }
    }
}
