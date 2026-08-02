package com.paypal.oslo.feature.identity.passkey.management.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListViewModel$loadPasskeys$1", f = "PasskeyListViewModel.kt", i = {1, 1, 1, 1, 1}, l = {129, 146}, m = "invokeSuspend", n = {"this_$iv", "passkeyListSuccess", "$i$f$fold", "$i$a$-fold-PasskeyListViewModel$loadPasskeys$1$3", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT}, nl = {414, 147}, s = {"L$0", "L$3", "I$0", "I$1", "I$2"}, v = 2)
/* loaded from: classes12.dex */
final class PasskeyListViewModel$loadPasskeys$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    boolean getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListViewModel getOutputSizes;
    int getOutputStallDuration;

    /* JADX WARN: Code restructure failed: missing block: B:40:0x006b, code lost:
    
        if (r2 != r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object value;
        com.paypal.oslo.feature.identity.passkey.management.list.domain.usecase.PasskeyListUseCase passkeyListUseCase;
        java.lang.Object invoke;
        java.lang.String str;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object value2;
        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage;
        com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted unencrypted;
        boolean z;
        com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListSuccess passkeyListSuccess;
        com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListViewModel passkeyListViewModel;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        java.lang.Object value3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputStallDuration;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getOutputSizes.getOutputMinFrameDuration;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiState.Loading.INSTANCE));
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Loading passkey list", null, null, 6, null);
            passkeyListUseCase = this.getOutputSizes.getHighSpeedVideoFpsRangesFor;
            this.getOutputStallDuration = 1;
            invoke = passkeyListUseCase.invoke(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = this.getInputSizeshNQ4ISI;
                com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListSuccess passkeyListSuccess2 = (com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListSuccess) this.getInputFormats;
                java.lang.String str2 = (java.lang.String) this.getOutputFormats;
                passkeyListViewModel = (com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListViewModel) this.getHighSpeedVideoSizesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                passkeyListSuccess = passkeyListSuccess2;
                str = str2;
                mutableStateFlow3 = passkeyListViewModel.getOutputMinFrameDuration;
                do {
                    value3 = mutableStateFlow3.getValue();
                } while (!mutableStateFlow3.compareAndSet(value3, new com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiState.Content(passkeyListSuccess.getPasskeys(), z, null, false, null, str, 28, null)));
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            invoke = obj;
        }
        arrow.core.Either either = (arrow.core.Either) invoke;
        com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListViewModel passkeyListViewModel2 = this.getOutputSizes;
        boolean z2 = this.getHighResolutionOutputSizeshNQ4ISI;
        str = this.getHighSpeedVideoSizes;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListSuccess passkeyListSuccess3 = (com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListSuccess) ((arrow.core.Either.Right) either).getValue();
            int size = passkeyListSuccess3.getPasskeys().size();
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Passkeys loaded successfully", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, java.lang.String.valueOf(size))), null, 4, null);
            appStorage = passkeyListViewModel2.getHighResolutionOutputSizeshNQ4ISI;
            unencrypted = passkeyListViewModel2.Camera2StreamConfigurationMap;
            this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
            this.getHighSpeedVideoSizesFor = passkeyListViewModel2;
            this.getOutputFormats = str;
            this.getInputFormats = passkeyListSuccess3;
            this.getInputSizeshNQ4ISI = z2;
            this.Camera2StreamConfigurationMap = 0;
            this.getHighSpeedVideoFpsRangesFor = 0;
            this.getHighSpeedVideoFpsRanges = size;
            this.getOutputStallDuration = 2;
            if (appStorage.setInt(unencrypted, size, this) != coroutine_suspended) {
                z = z2;
                passkeyListSuccess = passkeyListSuccess3;
                passkeyListViewModel = passkeyListViewModel2;
                mutableStateFlow3 = passkeyListViewModel.getOutputMinFrameDuration;
                do {
                    value3 = mutableStateFlow3.getValue();
                } while (!mutableStateFlow3.compareAndSet(value3, new com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiState.Content(passkeyListSuccess.getPasskeys(), z, null, false, null, str, 28, null)));
                return kotlin.Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
        if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError passkeyListError = (com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError) ((arrow.core.Either.Left) either).getValue();
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.identity.LoggerKt.log;
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(passkeyListError.getClass()).getSimpleName();
            if (simpleName == null) {
                simpleName = "";
            }
            pairArr[0] = kotlin.TuplesKt.to("errorType", simpleName);
            pairArr[1] = kotlin.TuplesKt.to("error", passkeyListError.toString());
            com.paypal.android.logger.Logger.w$default(logger, "Failed to load passkeys", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
            mutableStateFlow2 = passkeyListViewModel2.getOutputMinFrameDuration;
            do {
                value2 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value2, new com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiState.LoadError(passkeyListError)));
            return kotlin.Unit.INSTANCE;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListViewModel$loadPasskeys$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListViewModel$loadPasskeys$1(this.getOutputSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PasskeyListViewModel$loadPasskeys$1(com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListViewModel passkeyListViewModel, boolean z, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListViewModel$loadPasskeys$1> continuation) {
        super(2, continuation);
        this.getOutputSizes = passkeyListViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.getHighSpeedVideoSizes = str;
    }
}
