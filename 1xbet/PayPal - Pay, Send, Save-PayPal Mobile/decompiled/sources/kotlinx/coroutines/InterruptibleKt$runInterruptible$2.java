package kotlinx.coroutines;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", f = "Interruptible.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class InterruptibleKt$runInterruptible$2<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super T>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function0<T> getHighResolutionOutputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            highSpeedVideoFpsRanges = kotlinx.coroutines.InterruptibleKt.getHighSpeedVideoFpsRanges(((kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoSizes).getCoroutineContext(), this.getHighResolutionOutputSizeshNQ4ISI);
            return highSpeedVideoFpsRanges;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, java.lang.Object obj) {
        return ((kotlinx.coroutines.InterruptibleKt$runInterruptible$2) create(coroutineScope, (kotlin.coroutines.Continuation) obj)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlinx.coroutines.InterruptibleKt$runInterruptible$2 interruptibleKt$runInterruptible$2 = new kotlinx.coroutines.InterruptibleKt$runInterruptible$2(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        interruptibleKt$runInterruptible$2.getHighSpeedVideoSizes = obj;
        return interruptibleKt$runInterruptible$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    InterruptibleKt$runInterruptible$2(kotlin.jvm.functions.Function0<? extends T> function0, kotlin.coroutines.Continuation<? super kotlinx.coroutines.InterruptibleKt$runInterruptible$2> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = function0;
    }
}
