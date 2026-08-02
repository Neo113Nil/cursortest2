package com.paypal.oslo.feature.revolvingcreditacquisition.utils;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditacquisition.utils.ComposeUtilsKt$CollectOnLifecycle$1$1", f = "ComposeUtils.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, nl = {47}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class ComposeUtilsKt$CollectOnLifecycle$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.flow.Flow<T> Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.lifecycle.Lifecycle.State getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function1<T, kotlin.Unit> getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.view.LifecycleOwner getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditacquisition.utils.ComposeUtilsKt$CollectOnLifecycle$1$1$1", f = "ComposeUtils.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, nl = {46}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.revolvingcreditacquisition.utils.ComposeUtilsKt$CollectOnLifecycle$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.flow.Flow<T> getHighSpeedVideoFpsRanges;
        final /* synthetic */ kotlin.jvm.functions.Function1<T, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.paypal.oslo.feature.revolvingcreditacquisition.utils.ComposeUtilsKt$CollectOnLifecycle$1$1$1$1, reason: invalid class name and collision with other inner class name */
        static final /* synthetic */ class C01331 implements kotlinx.coroutines.flow.FlowCollector, kotlin.jvm.internal.FunctionAdapter {
            final /* synthetic */ kotlin.jvm.functions.Function1<T, kotlin.Unit> getHighSpeedVideoFpsRanges;

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                java.lang.Object highSpeedVideoFpsRangesFor = com.paypal.oslo.feature.revolvingcreditacquisition.utils.ComposeUtilsKt$CollectOnLifecycle$1$1.AnonymousClass1.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges, t);
                return highSpeedVideoFpsRangesFor == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoFpsRangesFor : kotlin.Unit.INSTANCE;
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final kotlin.Function<?> getFunctionDelegate() {
                return new kotlin.jvm.internal.FunctionReferenceImpl(2, this.getHighSpeedVideoFpsRanges, kotlin.jvm.internal.Intrinsics.Kotlin.class, "suspendConversion0", "invokeSuspend$suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            public final boolean equals(java.lang.Object obj) {
                if ((obj instanceof kotlinx.coroutines.flow.FlowCollector) && (obj instanceof kotlin.jvm.internal.FunctionAdapter)) {
                    return kotlin.jvm.internal.Intrinsics.areEqual(getFunctionDelegate(), ((kotlin.jvm.internal.FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            C01331(kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
                this.getHighSpeedVideoFpsRanges = function1;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoSizes;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighSpeedVideoSizes = 1;
                if (this.getHighSpeedVideoFpsRanges.collect(new com.paypal.oslo.feature.revolvingcreditacquisition.utils.ComposeUtilsKt$CollectOnLifecycle$1$1.AnonymousClass1.C01331(this.getHighSpeedVideoFpsRangesFor), this) == coroutine_suspended) {
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

        public static final /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor(kotlin.jvm.functions.Function1 function1, java.lang.Object obj) {
            function1.invoke(obj);
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.revolvingcreditacquisition.utils.ComposeUtilsKt$CollectOnLifecycle$1$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.paypal.oslo.feature.revolvingcreditacquisition.utils.ComposeUtilsKt$CollectOnLifecycle$1$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditacquisition.utils.ComposeUtilsKt$CollectOnLifecycle$1$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRanges = flow;
            this.getHighSpeedVideoFpsRangesFor = function1;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizes = 1;
            if (androidx.view.RepeatOnLifecycleKt.repeatOnLifecycle(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, new com.paypal.oslo.feature.revolvingcreditacquisition.utils.ComposeUtilsKt$CollectOnLifecycle$1$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.revolvingcreditacquisition.utils.ComposeUtilsKt$CollectOnLifecycle$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.revolvingcreditacquisition.utils.ComposeUtilsKt$CollectOnLifecycle$1$1(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ComposeUtilsKt$CollectOnLifecycle$1$1(androidx.view.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.State state, kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditacquisition.utils.ComposeUtilsKt$CollectOnLifecycle$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = lifecycleOwner;
        this.getHighResolutionOutputSizeshNQ4ISI = state;
        this.Camera2StreamConfigurationMap = flow;
        this.getHighSpeedVideoFpsRanges = function1;
    }
}
