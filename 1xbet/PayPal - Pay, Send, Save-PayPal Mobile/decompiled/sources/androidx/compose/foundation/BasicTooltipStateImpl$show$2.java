package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.BasicTooltipStateImpl$show$2", f = "BasicTooltip.kt", i = {}, l = {310, 312}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class BasicTooltipStateImpl$show$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.foundation.BasicTooltipStateImpl getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        if (kotlinx.coroutines.TimeoutKt.withTimeout(1500, new androidx.compose.foundation.BasicTooltipStateImpl$show$2.AnonymousClass1(r5.getHighSpeedVideoFpsRangesFor, null), r5) == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        try {
        } catch (java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes(false);
            throw th;
        }
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (this.getHighSpeedVideoFpsRanges.getGetHighSpeedVideoSizes()) {
                kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function1 = this.getHighSpeedVideoFpsRangesFor;
                this.Camera2StreamConfigurationMap = 1;
                if (function1.invoke(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                this.Camera2StreamConfigurationMap = 2;
            }
            this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes(false);
            throw th;
        }
        if (i != 1 && i != 2) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes(false);
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.BasicTooltipStateImpl$show$2$1", f = "BasicTooltip.kt", i = {}, l = {312}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.compose.foundation.BasicTooltipStateImpl$show$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function1 = this.getHighSpeedVideoSizes;
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                if (function1.invoke(this) == coroutine_suspended) {
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
            return ((androidx.compose.foundation.BasicTooltipStateImpl$show$2.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.compose.foundation.BasicTooltipStateImpl$show$2.AnonymousClass1(this.getHighSpeedVideoSizes, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super androidx.compose.foundation.BasicTooltipStateImpl$show$2.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoSizes = function1;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.BasicTooltipStateImpl$show$2) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.foundation.BasicTooltipStateImpl$show$2(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BasicTooltipStateImpl$show$2(androidx.compose.foundation.BasicTooltipStateImpl basicTooltipStateImpl, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super androidx.compose.foundation.BasicTooltipStateImpl$show$2> continuation) {
        super(1, continuation);
        this.getHighSpeedVideoFpsRanges = basicTooltipStateImpl;
        this.getHighSpeedVideoFpsRangesFor = function1;
    }
}
