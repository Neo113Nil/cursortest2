package com.ingo.sdk.android.ux.feature.sdk_authorization;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationViewModelImpl$authorize$1", f = "SdkAuthorizationViewModelImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class SdkAuthorizationViewModelImpl$authorize$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationViewModelImpl getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.ingo.sdk.kotlin.common.features.sdk_authorization.SdkAuthorizationParameters getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.ingo.sdk.kotlin.common.features.configuration.GetConfigurationUseCase configurationUseCase = this.getHighSpeedVideoFpsRangesFor.getConfigurationUseCase();
        com.ingo.sdk.kotlin.common.core.interactor.UseCase.None none = new com.ingo.sdk.kotlin.common.core.interactor.UseCase.None();
        final com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationViewModelImpl sdkAuthorizationViewModelImpl = this.getHighSpeedVideoFpsRangesFor;
        final com.ingo.sdk.kotlin.common.features.sdk_authorization.SdkAuthorizationParameters sdkAuthorizationParameters = this.getHighSpeedVideoSizes;
        configurationUseCase.invoke(none, new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationViewModelImpl$authorize$1$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationViewModelImpl$authorize$1.getHighResolutionOutputSizeshNQ4ISI(com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationViewModelImpl.this, sdkAuthorizationParameters, (com.ingo.sdk.kotlin.common.core.functional.Either) obj2);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationViewModelImpl sdkAuthorizationViewModelImpl, com.ingo.sdk.kotlin.common.features.sdk_authorization.SdkAuthorizationParameters sdkAuthorizationParameters, com.ingo.sdk.kotlin.common.features.configuration.model.ConfigurationResponse configurationResponse) {
        sdkAuthorizationViewModelImpl.getConfigurationResponseData().postValue(configurationResponse);
        sdkAuthorizationViewModelImpl.setCallsCompleted(sdkAuthorizationViewModelImpl.getCallsCompleted() + 1);
        com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationViewModelImpl.access$checkCompletion(sdkAuthorizationViewModelImpl, sdkAuthorizationParameters);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationViewModelImpl sdkAuthorizationViewModelImpl, com.ingo.sdk.kotlin.common.core.exception.Failure failure) {
        sdkAuthorizationViewModelImpl.getFailure().postValue(failure);
        com.ingo.sdk.kotlin.common.core.interactor.UseCase.cancel$default(sdkAuthorizationViewModelImpl.getCustomerUseCase(), null, 1, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(final com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationViewModelImpl sdkAuthorizationViewModelImpl, final com.ingo.sdk.kotlin.common.features.sdk_authorization.SdkAuthorizationParameters sdkAuthorizationParameters, com.ingo.sdk.kotlin.common.core.functional.Either either) {
        either.fold(new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationViewModelImpl$authorize$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationViewModelImpl$authorize$1.getHighSpeedVideoSizes(com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationViewModelImpl.this, (com.ingo.sdk.kotlin.common.core.exception.Failure) obj);
            }
        }, new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationViewModelImpl$authorize$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationViewModelImpl$authorize$1.getHighResolutionOutputSizeshNQ4ISI(com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationViewModelImpl.this, sdkAuthorizationParameters, (com.ingo.sdk.kotlin.common.features.configuration.model.ConfigurationResponse) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationViewModelImpl$authorize$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationViewModelImpl$authorize$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SdkAuthorizationViewModelImpl$authorize$1(com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationViewModelImpl sdkAuthorizationViewModelImpl, com.ingo.sdk.kotlin.common.features.sdk_authorization.SdkAuthorizationParameters sdkAuthorizationParameters, kotlin.coroutines.Continuation<? super com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationViewModelImpl$authorize$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = sdkAuthorizationViewModelImpl;
        this.getHighSpeedVideoSizes = sdkAuthorizationParameters;
    }
}
