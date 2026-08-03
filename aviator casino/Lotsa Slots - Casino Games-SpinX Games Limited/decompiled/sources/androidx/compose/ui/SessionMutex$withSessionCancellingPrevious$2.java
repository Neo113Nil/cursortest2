package androidx.compose.ui;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: SessionMutex.kt */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "R", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.ui.SessionMutex$withSessionCancellingPrevious$2", f = "SessionMutex.kt", i = {0, 1}, l = {66, 68}, m = "invokeSuspend", n = {"newSession", "newSession"}, s = {"L$0", "L$0"})
/* loaded from: classes.dex */
final class SessionMutex$withSessionCancellingPrevious$2<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super R>, java.lang.Object> {
    final /* synthetic */ java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.SessionMutex.Session<T>> $arg0;
    final /* synthetic */ kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> $session;
    final /* synthetic */ kotlin.jvm.functions.Function1<kotlinx.coroutines.CoroutineScope, T> $sessionInitializer;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SessionMutex$withSessionCancellingPrevious$2(kotlin.jvm.functions.Function1<? super kotlinx.coroutines.CoroutineScope, ? extends T> function1, java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.SessionMutex.Session<T>> atomicReference, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super androidx.compose.ui.SessionMutex$withSessionCancellingPrevious$2> continuation) {
        super(2, continuation);
        this.$sessionInitializer = function1;
        this.$arg0 = atomicReference;
        this.$session = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.ui.SessionMutex$withSessionCancellingPrevious$2 sessionMutex$withSessionCancellingPrevious$2 = new androidx.compose.ui.SessionMutex$withSessionCancellingPrevious$2(this.$sessionInitializer, this.$arg0, this.$session, continuation);
        sessionMutex$withSessionCancellingPrevious$2.L$0 = obj;
        return sessionMutex$withSessionCancellingPrevious$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super R> continuation) {
        return ((androidx.compose.ui.SessionMutex$withSessionCancellingPrevious$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.ui.SessionMutex.Session session;
        kotlinx.coroutines.Job job;
        androidx.compose.ui.SessionMutex.Session session2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
                session = new androidx.compose.ui.SessionMutex.Session(kotlinx.coroutines.JobKt.getJob(coroutineScope.getCoroutineContext()), this.$sessionInitializer.invoke(coroutineScope));
                androidx.compose.ui.SessionMutex.Session session3 = (androidx.compose.ui.SessionMutex.Session) this.$arg0.getAndSet(session);
                if (session3 != null && (job = session3.getJob()) != null) {
                    this.L$0 = session;
                    this.label = 1;
                    if (kotlinx.coroutines.JobKt.cancelAndJoin(job, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    session2 = (androidx.compose.ui.SessionMutex.Session) this.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        androidx.compose.animation.core.ComplexDouble$$ExternalSyntheticBackport0.m(this.$arg0, session2, null);
                        return obj;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        androidx.compose.animation.core.ComplexDouble$$ExternalSyntheticBackport0.m(this.$arg0, session2, null);
                        throw th;
                    }
                }
                session = (androidx.compose.ui.SessionMutex.Session) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
            }
            kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> function2 = this.$session;
            java.lang.Object value = session.getValue();
            this.L$0 = session;
            this.label = 2;
            obj = function2.invoke(value, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            session2 = session;
            androidx.compose.animation.core.ComplexDouble$$ExternalSyntheticBackport0.m(this.$arg0, session2, null);
            return obj;
        } catch (java.lang.Throwable th2) {
            th = th2;
            session2 = session;
            androidx.compose.animation.core.ComplexDouble$$ExternalSyntheticBackport0.m(this.$arg0, session2, null);
            throw th;
        }
    }
}
