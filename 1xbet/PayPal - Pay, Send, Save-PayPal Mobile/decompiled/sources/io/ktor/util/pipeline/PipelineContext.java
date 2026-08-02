package io.ktor.util.pipeline;

@io.ktor.utils.io.KtorDsl
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000e\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0004B\u000f\u0012\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H¦@¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00028\u0000H¦@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u0000H @¢\u0006\u0004\b\u0011\u0010\rR\u0017\u0010\u0005\u001a\u00028\u00018\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u000b\u001a\u00028\u00008'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0014\"\u0004\b\u0016\u0010\u0007"}, d2 = {"Lio/ktor/util/pipeline/PipelineContext;", "", "TSubject", "TContext", "Lkotlinx/coroutines/CoroutineScope;", "context", "<init>", "(Ljava/lang/Object;)V", "", "finish", "()V", "subject", "proceedWith", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "proceed", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initial", "execute$ktor_utils", "Ljava/lang/Object;", "getContext", "()Ljava/lang/Object;", "getSubject", "setSubject"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class PipelineContext<TSubject, TContext> implements kotlinx.coroutines.CoroutineScope {
    private final TContext context;

    public abstract java.lang.Object execute$ktor_utils(TSubject tsubject, kotlin.coroutines.Continuation<? super TSubject> continuation);

    public abstract void finish();

    public abstract TSubject getSubject();

    public abstract java.lang.Object proceed(kotlin.coroutines.Continuation<? super TSubject> continuation);

    public abstract java.lang.Object proceedWith(TSubject tsubject, kotlin.coroutines.Continuation<? super TSubject> continuation);

    public abstract void setSubject(TSubject tsubject);

    public PipelineContext(TContext tcontext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tcontext, "");
        this.context = tcontext;
    }

    public final TContext getContext() {
        return this.context;
    }
}
