package io.ktor.util.pipeline;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004Bj\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00028\u0001\u0012Q\u0010\r\u001aM\u0012I\u0012G\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bj\u0010\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u000b¢\u0006\u0002\b\f0\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0090@¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001d\u001a\u00020\n2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010 \u001a\u00020\n2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0000¢\u0006\u0004\b \u0010!R_\u0010\u001a\u001aM\u0012I\u0012G\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bj\u0010\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u000b¢\u0006\u0002\b\f0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020$8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001f\u0010(\u001a\u0004\b)\u0010*R\"\u0010\u0014\u001a\u00028\u00008\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010\u001eR\"\u0010\u001d\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t0/8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00100\u001a\u0002028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u00104"}, d2 = {"Lio/ktor/util/pipeline/SuspendFunctionGun;", "", "TSubject", "TContext", "Lio/ktor/util/pipeline/PipelineContext;", "initial", "context", "", "Lkotlin/Function3;", "Lkotlin/coroutines/Continuation;", "", "Lio/ktor/util/pipeline/PipelineInterceptor;", "Lkotlin/ExtensionFunctionType;", "blocks", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/List;)V", "finish", "()V", "proceed", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "subject", "proceedWith", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "execute$ktor_utils", "", "p0", "getHighSpeedVideoFpsRanges", "(Z)Z", "Lkotlin/Result;", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/Object;)V", "continuation", "addContinuation$ktor_utils", "(Lkotlin/coroutines/Continuation;)V", "getHighSpeedVideoFpsRangesFor", "Ljava/util/List;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lkotlin/coroutines/Continuation;", "getContinuation$ktor_utils", "()Lkotlin/coroutines/Continuation;", "Ljava/lang/Object;", "getSubject", "()Ljava/lang/Object;", "setSubject", "", "getHighSpeedVideoSizes", "[Lkotlin/coroutines/Continuation;", "", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SuspendFunctionGun<TSubject, TContext> extends io.ktor.util.pipeline.PipelineContext<TSubject, TContext> {
    private int Camera2StreamConfigurationMap;
    private final kotlin.coroutines.Continuation<kotlin.Unit> continuation;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private int getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.List<kotlin.jvm.functions.Function3<io.ktor.util.pipeline.PipelineContext<TSubject, TContext>, TSubject, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.coroutines.Continuation<TSubject>[] getHighResolutionOutputSizeshNQ4ISI;
    private TSubject subject;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SuspendFunctionGun(TSubject tsubject, TContext tcontext, java.util.List<? extends kotlin.jvm.functions.Function3<? super io.ktor.util.pipeline.PipelineContext<TSubject, TContext>, ? super TSubject, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>> list) {
        super(tcontext);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tsubject, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tcontext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.getHighSpeedVideoFpsRanges = list;
        this.continuation = new io.ktor.util.pipeline.SuspendFunctionGun$continuation$1(this);
        this.subject = tsubject;
        this.getHighResolutionOutputSizeshNQ4ISI = new kotlin.coroutines.Continuation[list.size()];
        this.Camera2StreamConfigurationMap = -1;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return this.continuation.getContext();
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> getContinuation$ktor_utils() {
        return this.continuation;
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    public final TSubject getSubject() {
        return this.subject;
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    public final void setSubject(TSubject tsubject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tsubject, "");
        this.subject = tsubject;
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    public final void finish() {
        this.getHighSpeedVideoSizes = this.getHighSpeedVideoFpsRanges.size();
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    public final java.lang.Object proceed(kotlin.coroutines.Continuation<? super TSubject> continuation) {
        java.lang.Object coroutine_suspended;
        if (this.getHighSpeedVideoSizes == this.getHighSpeedVideoFpsRanges.size()) {
            coroutine_suspended = getSubject();
        } else {
            addContinuation$ktor_utils(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation));
            if (!getHighSpeedVideoFpsRanges(true)) {
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            } else {
                int i = this.Camera2StreamConfigurationMap;
                if (i < 0) {
                    throw new java.lang.IllegalStateException("No more continuations to resume");
                }
                kotlin.coroutines.Continuation<TSubject>[] continuationArr = this.getHighResolutionOutputSizeshNQ4ISI;
                this.Camera2StreamConfigurationMap = i - 1;
                continuationArr[i] = null;
                coroutine_suspended = getSubject();
            }
        }
        if (coroutine_suspended == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return coroutine_suspended;
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    public final java.lang.Object proceedWith(TSubject tsubject, kotlin.coroutines.Continuation<? super TSubject> continuation) {
        setSubject(tsubject);
        return proceed(continuation);
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    public final java.lang.Object execute$ktor_utils(TSubject tsubject, kotlin.coroutines.Continuation<? super TSubject> continuation) {
        this.getHighSpeedVideoSizes = 0;
        if (this.getHighSpeedVideoFpsRanges.size() == 0) {
            return tsubject;
        }
        setSubject(tsubject);
        if (this.Camera2StreamConfigurationMap >= 0) {
            throw new java.lang.IllegalStateException("Already started");
        }
        return proceed(continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHighSpeedVideoFpsRanges(boolean p0) {
        int i;
        do {
            i = this.getHighSpeedVideoSizes;
            if (i == this.getHighSpeedVideoFpsRanges.size()) {
                if (p0) {
                    return true;
                }
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                getHighResolutionOutputSizeshNQ4ISI(kotlin.Result.m23436constructorimpl(getSubject()));
                return false;
            }
            this.getHighSpeedVideoSizes = i + 1;
            try {
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                getHighResolutionOutputSizeshNQ4ISI(kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th)));
                return false;
            }
        } while (io.ktor.util.pipeline.PipelineJvmKt.pipelineStartCoroutineUninterceptedOrReturn(this.getHighSpeedVideoFpsRanges.get(i), this, getSubject(), this.continuation) != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED());
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighResolutionOutputSizeshNQ4ISI(java.lang.Object p0) {
        int i = this.Camera2StreamConfigurationMap;
        if (i < 0) {
            throw new java.lang.IllegalStateException("No more continuations to resume".toString());
        }
        kotlin.coroutines.Continuation<TSubject> continuation = this.getHighResolutionOutputSizeshNQ4ISI[i];
        kotlin.jvm.internal.Intrinsics.checkNotNull(continuation);
        kotlin.coroutines.Continuation<TSubject>[] continuationArr = this.getHighResolutionOutputSizeshNQ4ISI;
        int i2 = this.Camera2StreamConfigurationMap;
        this.Camera2StreamConfigurationMap = i2 - 1;
        continuationArr[i2] = null;
        if (!kotlin.Result.m23441isFailureimpl(p0)) {
            continuation.resumeWith(p0);
            return;
        }
        java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(p0);
        kotlin.jvm.internal.Intrinsics.checkNotNull(m23439exceptionOrNullimpl);
        java.lang.Throwable recoverStackTraceBridge = io.ktor.util.pipeline.StackTraceRecoverKt.recoverStackTraceBridge(m23439exceptionOrNullimpl, continuation);
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        continuation.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(recoverStackTraceBridge)));
    }

    public final void addContinuation$ktor_utils(kotlin.coroutines.Continuation<? super TSubject> continuation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(continuation, "");
        kotlin.coroutines.Continuation<TSubject>[] continuationArr = this.getHighResolutionOutputSizeshNQ4ISI;
        int i = this.Camera2StreamConfigurationMap + 1;
        this.Camera2StreamConfigurationMap = i;
        continuationArr[i] = continuation;
    }
}
