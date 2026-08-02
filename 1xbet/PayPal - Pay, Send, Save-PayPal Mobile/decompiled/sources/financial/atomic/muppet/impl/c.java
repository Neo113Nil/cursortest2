package financial.atomic.muppet.impl;

/* loaded from: classes17.dex */
public final class c extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public kotlinx.coroutines.sync.Mutex f6880a;
    public financial.atomic.muppet.impl.Page b;
    public int c;
    public final /* synthetic */ financial.atomic.muppet.impl.Page d;

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new financial.atomic.muppet.impl.c(this.d, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b7, code lost:
    
        if (r10.emit((java.lang.Enum) r1, (financial.atomic.muppet.impl.Page.Event) r3, (kotlin.coroutines.Continuation<? super financial.atomic.muppet.Emitter.Event<financial.atomic.muppet.impl.Page.Event>>) r9) == r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00cb, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0095, code lost:
    
        if (r10._close(r9) == r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008b, code lost:
    
        if (financial.atomic.muppet.inter.Page.DefaultImpls.hide$default(r10, false, r9, 1, null) != r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0074, code lost:
    
        if (r10.await(r9) != r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x004e, code lost:
    
        if (r8.lock(null, r9) != r0) goto L41;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.sync.Mutex mutex;
        financial.atomic.muppet.impl.Page page;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.c;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                mutex = this.d.getInputSizeshNQ4ISI;
                page = this.d;
                this.f6880a = mutex;
                this.b = page;
                this.c = 1;
            } else if (i == 1) {
                page = this.b;
                mutex = this.f6880a;
                kotlin.ResultKt.throwOnFailure(obj);
            } else if (i == 2) {
                kotlin.ResultKt.throwOnFailure(obj);
                if (this.d.getGetOutputStallDuration().a()) {
                    financial.atomic.muppet.impl.Page page2 = this.d;
                    this.c = 3;
                }
                financial.atomic.muppet.impl.Page page3 = this.d;
                this.c = 4;
            } else if (i == 3) {
                kotlin.ResultKt.throwOnFailure(obj);
                financial.atomic.muppet.impl.Page page32 = this.d;
                this.c = 4;
            } else {
                if (i != 4) {
                    if (i != 5) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.CoroutineScopeKt.cancel$default(this.d.getGetHighSpeedVideoSizesFor(), null, 1, null);
                    return kotlin.Unit.INSTANCE;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                this.d.getGetHighSpeedVideoSizes().close();
                this.d.getGetHighSpeedVideoFpsRangesFor().close();
                financial.atomic.muppet.impl.Page page4 = this.d;
                financial.atomic.muppet.impl.Page.Event event = financial.atomic.muppet.impl.Page.Event.closed;
                java.lang.String handle = page4.handle();
                this.c = 5;
            }
            if (page.getGetHighSpeedVideoFpsRanges()) {
                return kotlin.Unit.INSTANCE;
            }
            page.set_closed(true);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            mutex.unlock(null);
            kotlinx.coroutines.CompletableDeferred completableDeferred = this.d.get_initialized();
            this.f6880a = null;
            this.b = null;
            this.c = 2;
        } finally {
            mutex.unlock(null);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new financial.atomic.muppet.impl.c(this.d, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(financial.atomic.muppet.impl.Page page, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.d = page;
    }
}
