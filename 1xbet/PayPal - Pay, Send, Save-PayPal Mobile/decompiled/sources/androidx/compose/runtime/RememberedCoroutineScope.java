package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\nR\u0014\u0010\u0010\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0018\u0010\u0016\u001a\u00060\u0013j\u0002`\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u000fR\u0014\u0010\u0019\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/compose/runtime/RememberedCoroutineScope;", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/runtime/RememberObserver;", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "overlayContext", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;)V", "", "cancelIfCreated", "()V", "onRemembered", "onForgotten", "onAbandoned", "getHighSpeedVideoSizes", "Lkotlin/coroutines/CoroutineContext;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "", "Landroidx/compose/runtime/platform/SynchronizedObject;", "Ljava/lang/Object;", "Camera2StreamConfigurationMap", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RememberedCoroutineScope implements kotlinx.coroutines.CoroutineScope, androidx.compose.runtime.RememberObserver {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private volatile kotlin.coroutines.CoroutineContext getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.coroutines.CoroutineContext getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.lang.Object Camera2StreamConfigurationMap = this;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.coroutines.CoroutineContext getHighSpeedVideoFpsRangesFor;
    public static final int $stable = 8;
    public static final kotlin.coroutines.CoroutineContext CancelledCoroutineContext = new androidx.compose.runtime.CancelledCoroutineContext();

    @Override // androidx.compose.runtime.RememberObserver
    public final void onRemembered() {
    }

    public RememberedCoroutineScope(kotlin.coroutines.CoroutineContext coroutineContext, kotlin.coroutines.CoroutineContext coroutineContext2) {
        this.getHighSpeedVideoFpsRangesFor = coroutineContext;
        this.getHighSpeedVideoFpsRanges = coroutineContext2;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final kotlin.coroutines.CoroutineContext getCoroutineContext() {
        kotlin.coroutines.EmptyCoroutineContext emptyCoroutineContext;
        kotlin.coroutines.CoroutineContext coroutineContext;
        kotlin.coroutines.CoroutineContext coroutineContext2 = this.getHighSpeedVideoSizes;
        if (coroutineContext2 == null || coroutineContext2 == CancelledCoroutineContext) {
            androidx.compose.runtime.tooling.CompositionErrorContextImpl compositionErrorContextImpl = (androidx.compose.runtime.tooling.CompositionErrorContextImpl) this.getHighSpeedVideoFpsRangesFor.get(androidx.compose.runtime.tooling.CompositionErrorContextImpl.INSTANCE);
            if (compositionErrorContextImpl == null) {
                emptyCoroutineContext = kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
            } else {
                emptyCoroutineContext = new androidx.compose.runtime.RememberedCoroutineScope$special$$inlined$CoroutineExceptionHandler$1(kotlinx.coroutines.CoroutineExceptionHandler.INSTANCE, compositionErrorContextImpl, this);
            }
            synchronized (this.Camera2StreamConfigurationMap) {
                kotlin.coroutines.CoroutineContext coroutineContext3 = this.getHighSpeedVideoSizes;
                if (coroutineContext3 == null) {
                    kotlin.coroutines.CoroutineContext coroutineContext4 = this.getHighSpeedVideoFpsRangesFor;
                    coroutineContext = coroutineContext4.plus(kotlinx.coroutines.JobKt.Job((kotlinx.coroutines.Job) coroutineContext4.get(kotlinx.coroutines.Job.INSTANCE))).plus(this.getHighSpeedVideoFpsRanges).plus(emptyCoroutineContext);
                } else if (coroutineContext3 == CancelledCoroutineContext) {
                    kotlin.coroutines.CoroutineContext coroutineContext5 = this.getHighSpeedVideoFpsRangesFor;
                    kotlinx.coroutines.CompletableJob Job = kotlinx.coroutines.JobKt.Job((kotlinx.coroutines.Job) coroutineContext5.get(kotlinx.coroutines.Job.INSTANCE));
                    Job.cancel((java.util.concurrent.CancellationException) new androidx.compose.runtime.ForgottenCoroutineScopeException());
                    coroutineContext = coroutineContext5.plus(Job).plus(this.getHighSpeedVideoFpsRanges).plus(emptyCoroutineContext);
                } else {
                    coroutineContext = coroutineContext3;
                }
                this.getHighSpeedVideoSizes = coroutineContext;
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            coroutineContext2 = coroutineContext;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(coroutineContext2);
        return coroutineContext2;
    }

    public final void cancelIfCreated() {
        synchronized (this.Camera2StreamConfigurationMap) {
            kotlin.coroutines.CoroutineContext coroutineContext = this.getHighSpeedVideoSizes;
            if (coroutineContext == null) {
                this.getHighSpeedVideoSizes = CancelledCoroutineContext;
            } else {
                kotlinx.coroutines.JobKt.cancel(coroutineContext, (java.util.concurrent.CancellationException) new androidx.compose.runtime.ForgottenCoroutineScopeException());
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onForgotten() {
        cancelIfCreated();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onAbandoned() {
        cancelIfCreated();
    }
}
