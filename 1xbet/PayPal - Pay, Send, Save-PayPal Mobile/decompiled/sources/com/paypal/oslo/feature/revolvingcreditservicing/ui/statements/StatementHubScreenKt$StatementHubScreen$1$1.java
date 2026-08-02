package com.paypal.oslo.feature.revolvingcreditservicing.ui.statements;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.StatementHubScreenKt$StatementHubScreen$1$1", f = "StatementHubScreen.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, nl = {63}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class StatementHubScreenKt$StatementHubScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.view.LifecycleOwner Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function1<androidx.navigation3.runtime.NavKey, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubViewModel getHighSpeedVideoFpsRangesFor;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.StatementHubScreenKt$StatementHubScreen$1$1$1", f = "StatementHubScreen.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, nl = {62}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.StatementHubScreenKt$StatementHubScreen$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubViewModel getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges;
        final /* synthetic */ kotlin.jvm.functions.Function1<androidx.navigation3.runtime.NavKey, kotlin.Unit> getHighSpeedVideoFpsRangesFor;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoFpsRanges;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubUiEffect> uiEffect = this.getHighResolutionOutputSizeshNQ4ISI.getUiEffect();
                final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.NavKey, kotlin.Unit> function1 = this.getHighSpeedVideoFpsRangesFor;
                this.getHighSpeedVideoFpsRanges = 1;
                if (uiEffect.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.StatementHubScreenKt.StatementHubScreen.1.1.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubUiEffect statementHubUiEffect = (com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubUiEffect) obj2;
                        if (!(statementHubUiEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubUiEffect.GoToDetails)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        function1.invoke(((com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubUiEffect.GoToDetails) statementHubUiEffect).getDestination());
                        return kotlin.Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
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
            return ((com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.StatementHubScreenKt$StatementHubScreen$1$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.StatementHubScreenKt$StatementHubScreen$1$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubViewModel statementHubViewModel, kotlin.jvm.functions.Function1<? super androidx.navigation3.runtime.NavKey, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.StatementHubScreenKt$StatementHubScreen$1$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighResolutionOutputSizeshNQ4ISI = statementHubViewModel;
            this.getHighSpeedVideoFpsRangesFor = function1;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRanges = 1;
            if (androidx.view.RepeatOnLifecycleKt.repeatOnLifecycle(this.Camera2StreamConfigurationMap, androidx.lifecycle.Lifecycle.State.STARTED, new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.StatementHubScreenKt$StatementHubScreen$1$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.StatementHubScreenKt$StatementHubScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.StatementHubScreenKt$StatementHubScreen$1$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    StatementHubScreenKt$StatementHubScreen$1$1(androidx.view.LifecycleOwner lifecycleOwner, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubViewModel statementHubViewModel, kotlin.jvm.functions.Function1<? super androidx.navigation3.runtime.NavKey, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.StatementHubScreenKt$StatementHubScreen$1$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = lifecycleOwner;
        this.getHighSpeedVideoFpsRangesFor = statementHubViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
    }
}
