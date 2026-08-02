package coil3.compose.internal;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcoil3/compose/internal/DeferredDispatchCoroutineContext;", "Lcoil3/compose/internal/ForwardingCoroutineContext;", "Lkotlin/coroutines/CoroutineContext;", "p0", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "p1", "newContext", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;)Lcoil3/compose/internal/ForwardingCoroutineContext;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final class DeferredDispatchCoroutineContext extends coil3.compose.internal.ForwardingCoroutineContext {
    public DeferredDispatchCoroutineContext(kotlin.coroutines.CoroutineContext coroutineContext) {
        super(coroutineContext);
    }

    @Override // coil3.compose.internal.ForwardingCoroutineContext
    public final coil3.compose.internal.ForwardingCoroutineContext newContext(kotlin.coroutines.CoroutineContext p0, kotlin.coroutines.CoroutineContext p1) {
        kotlinx.coroutines.CoroutineDispatcher dispatcher = coil3.compose.internal.UtilsKt.getDispatcher(p0);
        kotlinx.coroutines.CoroutineDispatcher dispatcher2 = coil3.compose.internal.UtilsKt.getDispatcher(p1);
        if ((dispatcher instanceof coil3.compose.internal.DeferredDispatchCoroutineDispatcher) && !kotlin.jvm.internal.Intrinsics.areEqual(dispatcher, dispatcher2)) {
            ((coil3.compose.internal.DeferredDispatchCoroutineDispatcher) dispatcher).getHighSpeedVideoFpsRanges();
        }
        return new coil3.compose.internal.DeferredDispatchCoroutineContext(p1);
    }
}
