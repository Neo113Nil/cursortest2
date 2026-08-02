package androidx.compose.ui;

/* JADX INFO: Add missing generic type declarations: [R] */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.ui.SessionMutex$withSessionCancellingPrevious$2", f = "SessionMutex.kt", i = {0, 1}, l = {61, 63}, m = "invokeSuspend", n = {"newSession", "newSession"}, s = {"L$0", "L$0"}, v = 1)
/* loaded from: classes.dex */
final class SessionMutex$withSessionCancellingPrevious$2<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super R>, java.lang.Object> {
    private /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.SessionMutex.Session<T>> getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function1<kotlinx.coroutines.CoroutineScope, T> getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005e, code lost:
    
        if (kotlinx.coroutines.JobKt.cancelAndJoin(r8, r7) != r0) goto L32;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.ui.SessionMutex.Session session;
        androidx.compose.ui.SessionMutex.Session session2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.Camera2StreamConfigurationMap;
                session = new androidx.compose.ui.SessionMutex.Session(kotlinx.coroutines.JobKt.getJob(coroutineScope.getCoroutineContext()), this.getHighSpeedVideoFpsRangesFor.invoke(coroutineScope));
                androidx.compose.ui.SessionMutex.Session session3 = (androidx.compose.ui.SessionMutex.Session) this.getHighSpeedVideoFpsRanges.getAndSet(session);
                if (session3 != null && (r8 = session3.getGetHighSpeedVideoFpsRangesFor()) != null) {
                    this.Camera2StreamConfigurationMap = session;
                    this.getHighSpeedVideoSizes = 1;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    session2 = (androidx.compose.ui.SessionMutex.Session) this.Camera2StreamConfigurationMap;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoFpsRanges, session2, null);
                        return obj;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoFpsRanges, session2, null);
                        throw th;
                    }
                }
                session = (androidx.compose.ui.SessionMutex.Session) this.Camera2StreamConfigurationMap;
                kotlin.ResultKt.throwOnFailure(obj);
            }
            kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> function2 = this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.Object highSpeedVideoFpsRanges = session.getHighSpeedVideoFpsRanges();
            this.Camera2StreamConfigurationMap = session;
            this.getHighSpeedVideoSizes = 2;
            obj = function2.invoke(highSpeedVideoFpsRanges, this);
            if (obj != coroutine_suspended) {
                session2 = session;
                androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoFpsRanges, session2, null);
                return obj;
            }
            return coroutine_suspended;
        } catch (java.lang.Throwable th2) {
            th = th2;
            session2 = session;
            androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoFpsRanges, session2, null);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, java.lang.Object obj) {
        return ((androidx.compose.ui.SessionMutex$withSessionCancellingPrevious$2) create(coroutineScope, (kotlin.coroutines.Continuation) obj)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.ui.SessionMutex$withSessionCancellingPrevious$2 sessionMutex$withSessionCancellingPrevious$2 = new androidx.compose.ui.SessionMutex$withSessionCancellingPrevious$2(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        sessionMutex$withSessionCancellingPrevious$2.Camera2StreamConfigurationMap = obj;
        return sessionMutex$withSessionCancellingPrevious$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SessionMutex$withSessionCancellingPrevious$2(kotlin.jvm.functions.Function1<? super kotlinx.coroutines.CoroutineScope, ? extends T> function1, java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.SessionMutex.Session<T>> atomicReference, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super androidx.compose.ui.SessionMutex$withSessionCancellingPrevious$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = function1;
        this.getHighSpeedVideoFpsRanges = atomicReference;
        this.getHighResolutionOutputSizeshNQ4ISI = function2;
    }
}
