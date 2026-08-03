package io.ktor.util.pipeline;

/* compiled from: SuspendFunctionGun.kt */
@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004Bh\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00028\u0001\u0012O\u0010\r\u001aK\u0012G\u0012E\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u000b¢\u0006\u0002\b\f0\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0090@¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001f\u001a\u00020\n2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\nH\u0002¢\u0006\u0004\b!\u0010\u0011J\u001d\u0010%\u001a\u00020\n2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0000¢\u0006\u0004\b#\u0010$R]\u0010\r\u001aK\u0012G\u0012E\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u000b¢\u0006\u0002\b\f0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010&R\u0014\u0010*\u001a\u00020'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R \u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010+\u001a\u0004\b,\u0010-R\"\u0010\u0014\u001a\u00028\u00008\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u0010 R\"\u00103\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00106\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00107¨\u00069"}, d2 = {"Lio/ktor/util/pipeline/SuspendFunctionGun;", "", "TSubject", "TContext", "Lio/ktor/util/pipeline/PipelineContext;", "initial", "context", "", "Lkotlin/Function3;", "Lkotlin/coroutines/Continuation;", "", "Lio/ktor/util/pipeline/PipelineInterceptor;", "Lkotlin/ExtensionFunctionType;", "blocks", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/List;)V", "finish", "()V", "proceed", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "subject", "proceedWith", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "execute$ktor_utils", "execute", "", com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef.DIRECT, "loop", "(Z)Z", "Lkotlin/Result;", "result", "resumeRootWith", "(Ljava/lang/Object;)V", "discardLastRootContinuation", "continuation", "addContinuation$ktor_utils", "(Lkotlin/coroutines/Continuation;)V", "addContinuation", "Ljava/util/List;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lkotlin/coroutines/Continuation;", "getContinuation$ktor_utils", "()Lkotlin/coroutines/Continuation;", "Ljava/lang/Object;", "getSubject", "()Ljava/lang/Object;", "setSubject", "", "suspensions", "[Lkotlin/coroutines/Continuation;", "", "lastSuspensionIndex", "I", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SuspendFunctionGun<TSubject, TContext> extends io.ktor.util.pipeline.PipelineContext<TSubject, TContext> {
    private final java.util.List<kotlin.jvm.functions.Function3<io.ktor.util.pipeline.PipelineContext<TSubject, TContext>, TSubject, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>> blocks;
    private final kotlin.coroutines.Continuation<kotlin.Unit> continuation;
    private int index;
    private int lastSuspensionIndex;
    private TSubject subject;
    private final kotlin.coroutines.Continuation<TSubject>[] suspensions;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SuspendFunctionGun(TSubject initial, TContext context, java.util.List<? extends kotlin.jvm.functions.Function3<? super io.ktor.util.pipeline.PipelineContext<TSubject, TContext>, ? super TSubject, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>> blocks) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initial, "initial");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blocks, "blocks");
        this.blocks = blocks;
        this.continuation = new io.ktor.util.pipeline.SuspendFunctionGun$continuation$1(this);
        this.subject = initial;
        this.suspensions = new kotlin.coroutines.Continuation[blocks.size()];
        this.lastSuspensionIndex = -1;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return this.continuation.get$context();
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> getContinuation$ktor_utils() {
        return this.continuation;
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    public TSubject getSubject() {
        return this.subject;
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    public void setSubject(TSubject tsubject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tsubject, "<set-?>");
        this.subject = tsubject;
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    public void finish() {
        this.index = this.blocks.size();
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    public java.lang.Object proceed(kotlin.coroutines.Continuation<? super TSubject> continuation) {
        java.lang.Object coroutine_suspended;
        if (this.index == this.blocks.size()) {
            coroutine_suspended = getSubject();
        } else {
            addContinuation$ktor_utils(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation));
            if (loop(true)) {
                discardLastRootContinuation();
                coroutine_suspended = getSubject();
            } else {
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            }
        }
        if (coroutine_suspended == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return coroutine_suspended;
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    public java.lang.Object proceedWith(TSubject tsubject, kotlin.coroutines.Continuation<? super TSubject> continuation) {
        setSubject(tsubject);
        return proceed(continuation);
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    public java.lang.Object execute$ktor_utils(TSubject tsubject, kotlin.coroutines.Continuation<? super TSubject> continuation) {
        this.index = 0;
        if (this.blocks.size() == 0) {
            return tsubject;
        }
        setSubject(tsubject);
        if (this.lastSuspensionIndex >= 0) {
            throw new java.lang.IllegalStateException("Already started");
        }
        return proceed(continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean loop(boolean direct) {
        int i;
        do {
            i = this.index;
            if (i == this.blocks.size()) {
                if (direct) {
                    return true;
                }
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                resumeRootWith(kotlin.Result.m10798constructorimpl(getSubject()));
                return false;
            }
            this.index = i + 1;
            try {
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                resumeRootWith(kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th)));
                return false;
            }
        } while (io.ktor.util.pipeline.PipelineJvmKt.pipelineStartCoroutineUninterceptedOrReturn(this.blocks.get(i), this, getSubject(), this.continuation) != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED());
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resumeRootWith(java.lang.Object result) {
        int i = this.lastSuspensionIndex;
        if (i < 0) {
            throw new java.lang.IllegalStateException("No more continuations to resume".toString());
        }
        kotlin.coroutines.Continuation<TSubject> continuation = this.suspensions[i];
        kotlin.jvm.internal.Intrinsics.checkNotNull(continuation);
        kotlin.coroutines.Continuation<TSubject>[] continuationArr = this.suspensions;
        int i2 = this.lastSuspensionIndex;
        this.lastSuspensionIndex = i2 - 1;
        continuationArr[i2] = null;
        if (!kotlin.Result.m10804isFailureimpl(result)) {
            continuation.resumeWith(result);
            return;
        }
        java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(result);
        kotlin.jvm.internal.Intrinsics.checkNotNull(m10801exceptionOrNullimpl);
        java.lang.Throwable recoverStackTraceBridge = io.ktor.util.pipeline.StackTraceRecoverKt.recoverStackTraceBridge(m10801exceptionOrNullimpl, continuation);
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        continuation.resumeWith(kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(recoverStackTraceBridge)));
    }

    private final void discardLastRootContinuation() {
        int i = this.lastSuspensionIndex;
        if (i < 0) {
            throw new java.lang.IllegalStateException("No more continuations to resume");
        }
        kotlin.coroutines.Continuation<TSubject>[] continuationArr = this.suspensions;
        this.lastSuspensionIndex = i - 1;
        continuationArr[i] = null;
    }

    public final void addContinuation$ktor_utils(kotlin.coroutines.Continuation<? super TSubject> continuation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(continuation, "continuation");
        kotlin.coroutines.Continuation<TSubject>[] continuationArr = this.suspensions;
        int i = this.lastSuspensionIndex + 1;
        this.lastSuspensionIndex = i;
        continuationArr[i] = continuation;
    }
}
