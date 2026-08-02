package com.paypal.oslo.core.navigation.scene;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.navigation.scene.TabReselectionHandlerKt$TabReselectionHandler$3$1", f = "TabReselectionHandler.kt", i = {}, l = {144}, m = "invokeSuspend", n = {}, nl = {155}, s = {}, v = 2)
/* loaded from: classes10.dex */
final class TabReselectionHandlerKt$TabReselectionHandler$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.State<kotlin.jvm.functions.Function0<kotlin.Unit>> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.foundation.ScrollState getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.core.navigation.scene.L1TabReselectionHolder getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.core.navigation.scene.L1TabReselectionHolder l1TabReselectionHolder = this.getHighSpeedVideoFpsRangesFor;
            if (l1TabReselectionHolder == null) {
                return kotlin.Unit.INSTANCE;
            }
            this.Camera2StreamConfigurationMap = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(l1TabReselectionHolder.getEvents(), new com.paypal.oslo.core.navigation.scene.TabReselectionHandlerKt$TabReselectionHandler$3$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, null), this) == coroutine_suspended) {
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

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.navigation.scene.TabReselectionHandlerKt$TabReselectionHandler$3$1$1", f = "TabReselectionHandler.kt", i = {0}, l = {152}, m = "invokeSuspend", n = {"isAtTop"}, nl = {154}, s = {"I$0"}, v = 2)
    /* renamed from: com.paypal.oslo.core.navigation.scene.TabReselectionHandlerKt$TabReselectionHandler$3$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlin.Unit, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ androidx.compose.foundation.ScrollState Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ androidx.compose.runtime.State<kotlin.jvm.functions.Function0<kotlin.Unit>> getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                if (this.Camera2StreamConfigurationMap.getValue() == 0) {
                    kotlin.jvm.functions.Function0<kotlin.Unit> value = this.getHighSpeedVideoFpsRangesFor.getValue();
                    if (value != null) {
                        value.invoke();
                    }
                } else {
                    this.getHighSpeedVideoSizes = 0;
                    this.getHighResolutionOutputSizeshNQ4ISI = 1;
                    if (androidx.compose.foundation.ScrollState.animateScrollTo$default(this.Camera2StreamConfigurationMap, 0, null, this, 2, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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
        public final /* synthetic */ java.lang.Object invoke(kotlin.Unit unit, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.core.navigation.scene.TabReselectionHandlerKt$TabReselectionHandler$3$1.AnonymousClass1) create(unit, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.paypal.oslo.core.navigation.scene.TabReselectionHandlerKt$TabReselectionHandler$3$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(androidx.compose.foundation.ScrollState scrollState, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function0<kotlin.Unit>> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.navigation.scene.TabReselectionHandlerKt$TabReselectionHandler$3$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.Camera2StreamConfigurationMap = scrollState;
            this.getHighSpeedVideoFpsRangesFor = state;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.core.navigation.scene.TabReselectionHandlerKt$TabReselectionHandler$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.core.navigation.scene.TabReselectionHandlerKt$TabReselectionHandler$3$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TabReselectionHandlerKt$TabReselectionHandler$3$1(com.paypal.oslo.core.navigation.scene.L1TabReselectionHolder l1TabReselectionHolder, androidx.compose.foundation.ScrollState scrollState, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function0<kotlin.Unit>> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.navigation.scene.TabReselectionHandlerKt$TabReselectionHandler$3$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = l1TabReselectionHolder;
        this.getHighSpeedVideoFpsRanges = scrollState;
        this.getHighResolutionOutputSizeshNQ4ISI = state;
    }
}
