package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B8\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012'\u0010\u000b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0005¢\u0006\u0002\b\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R5\u0010\u001c\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0005¢\u0006\u0002\b\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001dR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010$\u001a\u0006\u0012\u0002\b\u00030!8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#"}, d2 = {"Landroidx/compose/runtime/LaunchedEffectImpl;", "Landroidx/compose/runtime/RememberObserver;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/CoroutineContext;", "parentCoroutineContext", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "task", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)V", "onRemembered", "()V", "onForgotten", "onAbandoned", "context", "", "exception", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/coroutines/CoroutineContext;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function2;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/Job;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/Job;", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "key"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LaunchedEffectImpl implements androidx.compose.runtime.RememberObserver, kotlinx.coroutines.CoroutineExceptionHandler {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private kotlinx.coroutines.Job getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.coroutines.CoroutineContext getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    public LaunchedEffectImpl(kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
        this.getHighSpeedVideoFpsRanges = coroutineContext;
        this.getHighSpeedVideoFpsRangesFor = function2;
        this.getHighResolutionOutputSizeshNQ4ISI = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(coroutineContext.plus(this));
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final /* bridge */ <R> R fold(R r, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> function2) {
        return (R) kotlinx.coroutines.CoroutineExceptionHandler.DefaultImpls.fold(this, r, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final /* bridge */ <E extends kotlin.coroutines.CoroutineContext.Element> E get(kotlin.coroutines.CoroutineContext.Key<E> key) {
        return (E) kotlinx.coroutines.CoroutineExceptionHandler.DefaultImpls.get(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final /* bridge */ kotlin.coroutines.CoroutineContext minusKey(kotlin.coroutines.CoroutineContext.Key<?> key) {
        return kotlinx.coroutines.CoroutineExceptionHandler.DefaultImpls.minusKey(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final /* bridge */ kotlin.coroutines.CoroutineContext plus(kotlin.coroutines.CoroutineContext coroutineContext) {
        return kotlinx.coroutines.CoroutineExceptionHandler.DefaultImpls.plus(this, coroutineContext);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onRemembered() {
        kotlinx.coroutines.Job launch$default;
        kotlinx.coroutines.Job job = this.getHighSpeedVideoSizes;
        if (job != null) {
            kotlinx.coroutines.JobKt__JobKt.cancel$default(job, "Old job was still running!", null, 2, null);
        }
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighResolutionOutputSizeshNQ4ISI, null, null, this.getHighSpeedVideoFpsRangesFor, 3, null);
        this.getHighSpeedVideoSizes = launch$default;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onForgotten() {
        kotlinx.coroutines.Job job = this.getHighSpeedVideoSizes;
        if (job != null) {
            job.cancel((java.util.concurrent.CancellationException) new androidx.compose.runtime.LeftCompositionCancellationException());
        }
        this.getHighSpeedVideoSizes = null;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onAbandoned() {
        kotlinx.coroutines.Job job = this.getHighSpeedVideoSizes;
        if (job != null) {
            job.cancel((java.util.concurrent.CancellationException) new androidx.compose.runtime.LeftCompositionCancellationException());
        }
        this.getHighSpeedVideoSizes = null;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final kotlin.coroutines.CoroutineContext.Key<?> getKey() {
        return kotlinx.coroutines.CoroutineExceptionHandler.INSTANCE;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(kotlin.coroutines.CoroutineContext context, java.lang.Throwable exception) {
        androidx.compose.runtime.tooling.CompositionErrorContextImpl compositionErrorContextImpl = (androidx.compose.runtime.tooling.CompositionErrorContextImpl) context.get(androidx.compose.runtime.tooling.CompositionErrorContextImpl.INSTANCE);
        if (compositionErrorContextImpl != null) {
            compositionErrorContextImpl.attachComposeStackTrace(exception, this);
        }
        kotlinx.coroutines.CoroutineExceptionHandler coroutineExceptionHandler = (kotlinx.coroutines.CoroutineExceptionHandler) this.getHighSpeedVideoFpsRanges.get(kotlinx.coroutines.CoroutineExceptionHandler.INSTANCE);
        if (coroutineExceptionHandler == null) {
            throw exception;
        }
        coroutineExceptionHandler.handleException(context, exception);
    }
}
