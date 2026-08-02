package androidx.compose.material.pullrefresh;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1", f = "PullRefreshState.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class PullRefreshState$animateIndicatorTo$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ float Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.material.pullrefresh.PullRefreshState getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;

    @kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1$1", f = "PullRefreshState.kt", i = {}, l = {197}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int Camera2StreamConfigurationMap;
        final /* synthetic */ float getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ androidx.compose.material.pullrefresh.PullRefreshState getHighSpeedVideoFpsRangesFor;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            float Camera2StreamConfigurationMap;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.Camera2StreamConfigurationMap;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap();
                float f = this.getHighResolutionOutputSizeshNQ4ISI;
                final androidx.compose.material.pullrefresh.PullRefreshState pullRefreshState = this.getHighSpeedVideoFpsRangesFor;
                this.Camera2StreamConfigurationMap = 1;
                if (androidx.compose.animation.core.SuspendAnimationKt.animate$default(Camera2StreamConfigurationMap, f, 0.0f, null, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1.AnonymousClass1.Camera2StreamConfigurationMap(androidx.compose.material.pullrefresh.PullRefreshState.this, ((java.lang.Float) obj2).floatValue());
                    }
                }, this, 12, null) == coroutine_suspended) {
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

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.material.pullrefresh.PullRefreshState pullRefreshState, float f) {
            pullRefreshState.Camera2StreamConfigurationMap(f);
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1.AnonymousClass1) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(androidx.compose.material.pullrefresh.PullRefreshState pullRefreshState, float f, kotlin.coroutines.Continuation<? super androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1.AnonymousClass1> continuation) {
            super(1, continuation);
            this.getHighSpeedVideoFpsRangesFor = pullRefreshState;
            this.getHighResolutionOutputSizeshNQ4ISI = f;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.foundation.MutatorMutex mutatorMutex;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutatorMutex = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizesFor;
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (androidx.compose.foundation.MutatorMutex.mutate$default(mutatorMutex, null, new androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, null), this, 1, null) == coroutine_suspended) {
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
        return ((androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PullRefreshState$animateIndicatorTo$1(androidx.compose.material.pullrefresh.PullRefreshState pullRefreshState, float f, kotlin.coroutines.Continuation<? super androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = pullRefreshState;
        this.Camera2StreamConfigurationMap = f;
    }
}
