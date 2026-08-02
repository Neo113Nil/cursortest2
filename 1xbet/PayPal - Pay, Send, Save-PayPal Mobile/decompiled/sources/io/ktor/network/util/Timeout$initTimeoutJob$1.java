package io.ktor.network.util;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.network.util.Timeout$initTimeoutJob$1", f = "Utils.kt", i = {}, l = {55, 57, 58}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class Timeout$initTimeoutJob$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ io.ktor.network.util.Timeout getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        long j;
        kotlin.jvm.functions.Function0 function0;
        kotlin.jvm.functions.Function0 function02;
        kotlin.jvm.functions.Function1 function1;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                function1 = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes;
                this.getHighSpeedVideoFpsRangesFor = 3;
                if (function1.invoke(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        while (true) {
            if (this.getHighSpeedVideoFpsRanges.isStarted == 0) {
                io.ktor.network.util.Timeout timeout = this.getHighSpeedVideoFpsRanges;
                function02 = timeout.getHighSpeedVideoFpsRanges;
                timeout.lastActivityTime = ((java.lang.Number) function02.invoke()).longValue();
            }
            long j2 = this.getHighSpeedVideoFpsRanges.lastActivityTime;
            j = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap;
            function0 = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges;
            long longValue = (j2 + j) - ((java.lang.Number) function0.invoke()).longValue();
            if (longValue > 0 || this.getHighSpeedVideoFpsRanges.isStarted == 0) {
                this.getHighSpeedVideoFpsRangesFor = 1;
                if (kotlinx.coroutines.DelayKt.delay(longValue, this) == coroutine_suspended) {
                    break;
                }
            } else {
                this.getHighSpeedVideoFpsRangesFor = 2;
                if (kotlinx.coroutines.YieldKt.yield(this) == coroutine_suspended) {
                }
            }
        }
        return coroutine_suspended;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.network.util.Timeout$initTimeoutJob$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new io.ktor.network.util.Timeout$initTimeoutJob$1(this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Timeout$initTimeoutJob$1(io.ktor.network.util.Timeout timeout, kotlin.coroutines.Continuation<? super io.ktor.network.util.Timeout$initTimeoutJob$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = timeout;
    }
}
