package io.ktor.util.pipeline;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a¤\u0001\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0003\u001a\u00028\u00012Q\u0010\u000b\u001aM\u0012I\u0012G\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0005j\u0010\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\t¢\u0006\u0002\b\n0\u00042\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"", "TSubject", "TContext", "context", "", "Lkotlin/Function3;", "Lio/ktor/util/pipeline/PipelineContext;", "Lkotlin/coroutines/Continuation;", "", "Lio/ktor/util/pipeline/PipelineInterceptor;", "Lkotlin/ExtensionFunctionType;", "interceptors", "subject", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "", "debugMode", "pipelineContextFor", "(Ljava/lang/Object;Ljava/util/List;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;Z)Lio/ktor/util/pipeline/PipelineContext;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class PipelineContextKt {
    public static /* synthetic */ io.ktor.util.pipeline.PipelineContext pipelineContextFor$default(java.lang.Object obj, java.util.List list, java.lang.Object obj2, kotlin.coroutines.CoroutineContext coroutineContext, boolean z, int i, java.lang.Object obj3) {
        if ((i & 16) != 0) {
            z = false;
        }
        return pipelineContextFor(obj, list, obj2, coroutineContext, z);
    }

    public static final <TSubject, TContext> io.ktor.util.pipeline.PipelineContext<TSubject, TContext> pipelineContextFor(TContext tcontext, java.util.List<? extends kotlin.jvm.functions.Function3<? super io.ktor.util.pipeline.PipelineContext<TSubject, TContext>, ? super TSubject, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>> list, TSubject tsubject, kotlin.coroutines.CoroutineContext coroutineContext, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tcontext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tsubject, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "");
        if (io.ktor.util.pipeline.PipelineContext_jvmKt.getDISABLE_SFG() || z) {
            return new io.ktor.util.pipeline.DebugPipelineContext(tcontext, list, tsubject, coroutineContext);
        }
        return new io.ktor.util.pipeline.SuspendFunctionGun(tsubject, tcontext, list);
    }
}
