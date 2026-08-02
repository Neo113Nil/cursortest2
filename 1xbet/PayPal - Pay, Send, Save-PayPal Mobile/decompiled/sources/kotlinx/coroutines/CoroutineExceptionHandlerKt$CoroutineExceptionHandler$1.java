package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V"}, k = 1, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes3.dex */
public final class CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1 extends kotlin.coroutines.AbstractCoroutineContextElement implements kotlinx.coroutines.CoroutineExceptionHandler {
    final /* synthetic */ kotlin.jvm.functions.Function2<kotlin.coroutines.CoroutineContext, java.lang.Throwable, kotlin.Unit> getHighSpeedVideoSizes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1(kotlin.jvm.functions.Function2<? super kotlin.coroutines.CoroutineContext, ? super java.lang.Throwable, kotlin.Unit> function2, kotlinx.coroutines.CoroutineExceptionHandler.Companion companion) {
        super(companion);
        this.getHighSpeedVideoSizes = function2;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(kotlin.coroutines.CoroutineContext context, java.lang.Throwable exception) {
        this.getHighSpeedVideoSizes.invoke(context, exception);
    }
}
