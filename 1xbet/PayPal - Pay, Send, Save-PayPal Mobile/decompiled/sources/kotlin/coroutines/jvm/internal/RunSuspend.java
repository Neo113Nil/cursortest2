package kotlin.coroutines.jvm.internal;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\u0007\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lkotlin/coroutines/jvm/internal/RunSuspend;", "Lkotlin/coroutines/Continuation;", "", "<init>", "()V", "Lkotlin/Result;", "p0", "resumeWith", "(Ljava/lang/Object;)V", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "Camera2StreamConfigurationMap", "Lkotlin/Result;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
final class RunSuspend implements kotlin.coroutines.Continuation<kotlin.Unit> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    public kotlin.Result<kotlin.Unit> getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.Continuation
    public final kotlin.coroutines.CoroutineContext getContext() {
        return kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(java.lang.Object p0) {
        synchronized (this) {
            this.getHighSpeedVideoFpsRanges = kotlin.Result.m23435boximpl(p0);
            kotlin.jvm.internal.Intrinsics.checkNotNull(this, "");
            notifyAll();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }
}
