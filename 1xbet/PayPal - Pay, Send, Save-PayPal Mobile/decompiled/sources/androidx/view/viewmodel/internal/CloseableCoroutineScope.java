package androidx.view.viewmodel.internal;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Landroidx/lifecycle/viewmodel/internal/CloseableCoroutineScope;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "coroutineScope", "(Lkotlinx/coroutines/CoroutineScope;)V", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "close", "", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CloseableCoroutineScope implements java.lang.AutoCloseable, kotlinx.coroutines.CoroutineScope {
    private final kotlin.coroutines.CoroutineContext getHighSpeedVideoFpsRanges;

    public CloseableCoroutineScope(kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "");
        this.getHighSpeedVideoFpsRanges = coroutineContext;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* renamed from: getCoroutineContext, reason: from getter */
    public final kotlin.coroutines.CoroutineContext getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CloseableCoroutineScope(kotlinx.coroutines.CoroutineScope coroutineScope) {
        this(coroutineScope.getGetHighSpeedVideoFpsRanges());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        kotlinx.coroutines.JobKt__JobKt.cancel$default(getGetHighSpeedVideoFpsRanges(), (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
    }
}
