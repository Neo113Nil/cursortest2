package androidx.view.compose;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.activity.compose.ComposePredictiveBackHandler$launchNewGesture$1", f = "PredictiveBackHandler.kt", i = {0}, l = {231}, m = "invokeSuspend", n = {com.paypal.oslo.feature.bankingbundle.api.analytics.BankingBundleAnalytics.FlowOutcome.COMPLETED}, s = {"L$0"}, v = 1)
/* loaded from: classes5.dex */
final class ComposePredictiveBackHandler$launchNewGesture$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.view.compose.ComposePredictiveBackHandler getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.Channel channel;
        kotlin.jvm.internal.Ref.BooleanRef booleanRef;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (this.getHighSpeedVideoFpsRanges.isBackEnabled()) {
                kotlin.jvm.internal.Ref.BooleanRef booleanRef2 = new kotlin.jvm.internal.Ref.BooleanRef();
                kotlin.jvm.functions.Function2<? super kotlinx.coroutines.flow.Flow<androidx.view.BackEventCompat>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2 = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap;
                channel = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges;
                kotlin.jvm.internal.Intrinsics.checkNotNull(channel);
                kotlinx.coroutines.flow.Flow onCompletion = kotlinx.coroutines.flow.FlowKt.onCompletion(kotlinx.coroutines.flow.FlowKt.consumeAsFlow(channel), new androidx.view.compose.ComposePredictiveBackHandler$launchNewGesture$1.AnonymousClass1(booleanRef2, null));
                this.getHighSpeedVideoFpsRangesFor = booleanRef2;
                this.getHighSpeedVideoSizes = 1;
                if (function2.invoke(onCompletion, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                booleanRef = booleanRef2;
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        booleanRef = (kotlin.jvm.internal.Ref.BooleanRef) this.getHighSpeedVideoFpsRangesFor;
        kotlin.ResultKt.throwOnFailure(obj);
        if (!booleanRef.element) {
            throw new java.lang.IllegalStateException("You must collect the progress flow".toString());
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Landroidx/activity/BackEventCompat;", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.activity.compose.ComposePredictiveBackHandler$launchNewGesture$1$1", f = "PredictiveBackHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.activity.compose.ComposePredictiveBackHandler$launchNewGesture$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super androidx.view.BackEventCompat>, java.lang.Throwable, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.internal.Ref.BooleanRef getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoFpsRangesFor != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRanges.element = true;
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super androidx.view.BackEventCompat> flowCollector, java.lang.Throwable th, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return new androidx.view.compose.ComposePredictiveBackHandler$launchNewGesture$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(kotlin.jvm.internal.Ref.BooleanRef booleanRef, kotlin.coroutines.Continuation<? super androidx.view.compose.ComposePredictiveBackHandler$launchNewGesture$1.AnonymousClass1> continuation) {
            super(3, continuation);
            this.getHighSpeedVideoFpsRanges = booleanRef;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.view.compose.ComposePredictiveBackHandler$launchNewGesture$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.view.compose.ComposePredictiveBackHandler$launchNewGesture$1(this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComposePredictiveBackHandler$launchNewGesture$1(androidx.view.compose.ComposePredictiveBackHandler composePredictiveBackHandler, kotlin.coroutines.Continuation<? super androidx.view.compose.ComposePredictiveBackHandler$launchNewGesture$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = composePredictiveBackHandler;
    }
}
