package com.paypal.oslo.feature.inappcheckout.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0086B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/SaveCheckoutExperienceUseCase;", "", "Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;", "appSwitchSession", "Lcom/paypal/oslo/feature/inappcheckout/domain/repository/SaveCheckoutExperienceRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;Lcom/paypal/oslo/feature/inappcheckout/domain/repository/SaveCheckoutExperienceRepository;)V", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UrlLoadingInterceptingAction$RunIntent;", "action", "", "invoke", "(Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UrlLoadingInterceptingAction$RunIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/inappcheckout/domain/repository/SaveCheckoutExperienceRepository;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SaveCheckoutExperienceUseCase {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.domain.repository.SaveCheckoutExperienceRepository getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession getHighSpeedVideoSizes;

    @javax.inject.Inject
    public SaveCheckoutExperienceUseCase(com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession appSwitchSession, com.paypal.oslo.feature.inappcheckout.domain.repository.SaveCheckoutExperienceRepository saveCheckoutExperienceRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appSwitchSession, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(saveCheckoutExperienceRepository, "");
        this.getHighSpeedVideoSizes = appSwitchSession;
        this.getHighSpeedVideoFpsRanges = saveCheckoutExperienceRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UrlLoadingInterceptingAction.RunIntent runIntent, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.inappcheckout.domain.usecase.SaveCheckoutExperienceUseCase$invoke$1 saveCheckoutExperienceUseCase$invoke$1;
        int i;
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutToken checkoutToken;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.inappcheckout.domain.usecase.SaveCheckoutExperienceUseCase$invoke$1) {
            saveCheckoutExperienceUseCase$invoke$1 = (com.paypal.oslo.feature.inappcheckout.domain.usecase.SaveCheckoutExperienceUseCase$invoke$1) continuation;
            if ((saveCheckoutExperienceUseCase$invoke$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                saveCheckoutExperienceUseCase$invoke$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = saveCheckoutExperienceUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = saveCheckoutExperienceUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutToken checkoutToken2 = this.getHighSpeedVideoSizes.getCheckoutToken();
                    if (!runIntent.isCancelFlow() || checkoutToken2 == null) {
                        return kotlin.Unit.INSTANCE;
                    }
                    if (this.getHighSpeedVideoSizes.getMerchantIntegrationChannel().isApiIntegration() || kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes.getMerchantIntegrationChannel(), com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.SdkIntegration.WebApp.INSTANCE)) {
                        com.paypal.oslo.feature.inappcheckout.domain.repository.SaveCheckoutExperienceRepository saveCheckoutExperienceRepository = this.getHighSpeedVideoFpsRanges;
                        saveCheckoutExperienceUseCase$invoke$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(runIntent);
                        saveCheckoutExperienceUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = checkoutToken2;
                        saveCheckoutExperienceUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 1;
                        java.lang.Object saveCheckoutAsCancelled = saveCheckoutExperienceRepository.saveCheckoutAsCancelled(checkoutToken2, saveCheckoutExperienceUseCase$invoke$1);
                        if (saveCheckoutAsCancelled == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj = saveCheckoutAsCancelled;
                        checkoutToken = checkoutToken2;
                    }
                    return kotlin.Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                checkoutToken = (com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutToken) saveCheckoutExperienceUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                either = (arrow.core.Either) obj;
                if (either.isLeft()) {
                    com.paypal.android.logger.standardized.LoggerExtensionsKt.e$default(com.paypal.oslo.feature.inappcheckout.LoggerKt.log, com.paypal.android.logger.categories.Presentation.Error.INSTANCE, "Failed to save checkout as cancelled", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("integration", this.getHighSpeedVideoSizes.getMerchantIntegrationChannel().toString()), kotlin.TuplesKt.to("networkError", ((com.paypal.oslo.feature.inappcheckout.features.checkoutExperience.SaveCheckoutExperienceError) ((arrow.core.Either.Left) either).getValue()).toString())), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, checkoutToken.toString())), null, 16, null);
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        saveCheckoutExperienceUseCase$invoke$1 = new com.paypal.oslo.feature.inappcheckout.domain.usecase.SaveCheckoutExperienceUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = saveCheckoutExperienceUseCase$invoke$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = saveCheckoutExperienceUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (either.isLeft()) {
        }
        return kotlin.Unit.INSTANCE;
    }
}
