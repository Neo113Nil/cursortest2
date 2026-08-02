package com.paypal.oslo.feature.identity.passkey.management.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListScreenKt$PasskeyListContent$3$1", f = "PasskeyListScreen.kt", i = {}, l = {225}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class PasskeyListScreenKt$PasskeyListContent$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiEffect> getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.MutableState<com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyDeletionState> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.String> getHighSpeedVideoSizes;

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListScreenKt$PasskeyListContent$3$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.String> getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoFpsRanges;
        final /* synthetic */ androidx.compose.runtime.MutableState<com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyDeletionState> getHighSpeedVideoSizes;

        /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object emit(com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiEffect passkeyListUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListScreenKt$PasskeyListContent$3$1$1$emit$1 passkeyListScreenKt$PasskeyListContent$3$1$1$emit$1;
            int i;
            if (continuation instanceof com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListScreenKt$PasskeyListContent$3$1$1$emit$1) {
                passkeyListScreenKt$PasskeyListContent$3$1$1$emit$1 = (com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListScreenKt$PasskeyListContent$3$1$1$emit$1) continuation;
                if ((passkeyListScreenKt$PasskeyListContent$3$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    passkeyListScreenKt$PasskeyListContent$3$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                    java.lang.Object obj = passkeyListScreenKt$PasskeyListContent$3$1$1$emit$1.getHighSpeedVideoFpsRanges;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = passkeyListScreenKt$PasskeyListContent$3$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (!(passkeyListUiEffect instanceof com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiEffect.ShowDeleteSuccess)) {
                            if (!(passkeyListUiEffect instanceof com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiEffect.ShowDeleteError)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            this.getHighResolutionOutputSizeshNQ4ISI.setValue(null);
                            this.getHighSpeedVideoSizes.setValue(com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyDeletionState.IDLE);
                            this.getHighSpeedVideoFpsRanges.setValue(java.lang.Boolean.valueOf(true));
                            return kotlin.Unit.INSTANCE;
                        }
                        this.getHighSpeedVideoSizes.setValue(com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyDeletionState.SUCCESS);
                        passkeyListScreenKt$PasskeyListContent$3$1$1$emit$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(passkeyListUiEffect);
                        passkeyListScreenKt$PasskeyListContent$3$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                        if (kotlinx.coroutines.DelayKt.delay(1000L, passkeyListScreenKt$PasskeyListContent$3$1$1$emit$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    this.getHighResolutionOutputSizeshNQ4ISI.setValue(null);
                    this.getHighSpeedVideoSizes.setValue(com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyDeletionState.IDLE);
                    return kotlin.Unit.INSTANCE;
                }
            }
            passkeyListScreenKt$PasskeyListContent$3$1$1$emit$1 = new com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListScreenKt$PasskeyListContent$3$1$1$emit$1(this, continuation);
            java.lang.Object obj2 = passkeyListScreenKt$PasskeyListContent$3$1$1$emit$1.getHighSpeedVideoFpsRanges;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = passkeyListScreenKt$PasskeyListContent$3$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
            if (i != 0) {
            }
            this.getHighResolutionOutputSizeshNQ4ISI.setValue(null);
            this.getHighSpeedVideoSizes.setValue(com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyDeletionState.IDLE);
            return kotlin.Unit.INSTANCE;
        }

        AnonymousClass1(androidx.compose.runtime.MutableState<com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyDeletionState> mutableState, androidx.compose.runtime.MutableState<java.lang.String> mutableState2, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState3) {
            this.getHighSpeedVideoSizes = mutableState;
            this.getHighResolutionOutputSizeshNQ4ISI = mutableState2;
            this.getHighSpeedVideoFpsRanges = mutableState3;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.Camera2StreamConfigurationMap = 1;
            if (this.getHighSpeedVideoFpsRanges.collect(new com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListScreenKt$PasskeyListContent$3$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListScreenKt$PasskeyListContent$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListScreenKt$PasskeyListContent$3$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PasskeyListScreenKt$PasskeyListContent$3$1(kotlinx.coroutines.flow.Flow<? extends com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiEffect> flow, androidx.compose.runtime.MutableState<com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyDeletionState> mutableState, androidx.compose.runtime.MutableState<java.lang.String> mutableState2, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState3, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListScreenKt$PasskeyListContent$3$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = flow;
        this.getHighSpeedVideoFpsRangesFor = mutableState;
        this.getHighSpeedVideoSizes = mutableState2;
        this.getHighResolutionOutputSizeshNQ4ISI = mutableState3;
    }
}
