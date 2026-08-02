package com.paypal.oslo.feature.identity.passkey.management.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementViewModel$loadPasskeys$1", f = "PasskeyManagementViewModel.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, nl = {147}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class PasskeyManagementViewModel$loadPasskeys$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementViewModel getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object value;
        com.paypal.oslo.feature.identity.passkey.management.list.domain.usecase.PasskeyListUseCase passkeyListUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object value2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        java.lang.Object value3;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        java.lang.Object value4;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementUiState.Loading.INSTANCE));
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Loading passkeys to determine routing", null, null, 6, null);
            passkeyListUseCase = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = 1;
            obj = passkeyListUseCase.invoke(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either = (arrow.core.Either) obj;
        com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementViewModel passkeyManagementViewModel = this.getHighSpeedVideoFpsRanges;
        if (either instanceof arrow.core.Either.Right) {
            boolean isEmpty = ((com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListSuccess) ((arrow.core.Either.Right) either).getValue()).getPasskeys().isEmpty();
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Routing determination complete", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("destination", isEmpty ? "enrollment" : "list")), null, 4, null);
            if (isEmpty) {
                mutableStateFlow4 = passkeyManagementViewModel.getHighSpeedVideoFpsRangesFor;
                do {
                    value4 = mutableStateFlow4.getValue();
                } while (!mutableStateFlow4.compareAndSet(value4, com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementUiState.EmptyState.INSTANCE));
            } else {
                mutableStateFlow3 = passkeyManagementViewModel.getHighSpeedVideoFpsRangesFor;
                do {
                    value3 = mutableStateFlow3.getValue();
                } while (!mutableStateFlow3.compareAndSet(value3, com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementUiState.HasPasskeys.INSTANCE));
            }
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError passkeyListError = (com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError) ((arrow.core.Either.Left) either).getValue();
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.identity.LoggerKt.log;
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(passkeyListError.getClass()).getSimpleName();
            if (simpleName == null) {
                simpleName = "";
            }
            pairArr[0] = kotlin.TuplesKt.to("errorType", simpleName);
            pairArr[1] = kotlin.TuplesKt.to("error", passkeyListError.toString());
            com.paypal.android.logger.Logger.w$default(logger, "Failed to load passkeys for routing", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
            mutableStateFlow2 = passkeyManagementViewModel.getHighSpeedVideoFpsRangesFor;
            do {
                value2 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value2, new com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementUiState.LoadError(passkeyListError)));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementViewModel$loadPasskeys$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementViewModel$loadPasskeys$1(this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PasskeyManagementViewModel$loadPasskeys$1(com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementViewModel passkeyManagementViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementViewModel$loadPasskeys$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = passkeyManagementViewModel;
    }
}
