package io.ktor.util.pipeline;

@io.ktor.utils.io.KtorDsl
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004Br\u0012\u0006\u0010\u0005\u001a\u00028\u0001\u0012Q\u0010\f\u001aM\u0012I\u0012G\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007j\u0010\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\n¢\u0006\u0002\b\u000b0\u0006\u0012\u0006\u0010\r\u001a\u00028\u0000\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u0000H\u0090@¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b\u001a\u0010\u0017R_\u0010\u001c\u001aM\u0012I\u0012G\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007j\u0010\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\n¢\u0006\u0002\b\u000b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u000f\u001a\u00020\u000e8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\r\u001a\u00028\u00008\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b\r\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b&\u0010'"}, d2 = {"Lio/ktor/util/pipeline/DebugPipelineContext;", "", "TSubject", "TContext", "Lio/ktor/util/pipeline/PipelineContext;", "context", "", "Lkotlin/Function3;", "Lkotlin/coroutines/Continuation;", "", "Lio/ktor/util/pipeline/PipelineInterceptor;", "Lkotlin/ExtensionFunctionType;", "interceptors", "subject", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "(Ljava/lang/Object;Ljava/util/List;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", "finish", "()V", "proceedWith", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "proceed", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initial", "execute$ktor_utils", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/List;", "getHighSpeedVideoSizes", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "Ljava/lang/Object;", "getSubject", "()Ljava/lang/Object;", "setSubject", "(Ljava/lang/Object;)V", "", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DebugPipelineContext<TSubject, TContext> extends io.ktor.util.pipeline.PipelineContext<TSubject, TContext> {
    private int Camera2StreamConfigurationMap;
    private final kotlin.coroutines.CoroutineContext coroutineContext;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.List<kotlin.jvm.functions.Function3<io.ktor.util.pipeline.PipelineContext<TSubject, TContext>, TSubject, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>> getHighSpeedVideoSizes;
    private TSubject subject;

    @Override // kotlinx.coroutines.CoroutineScope
    public final kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DebugPipelineContext(TContext tcontext, java.util.List<? extends kotlin.jvm.functions.Function3<? super io.ktor.util.pipeline.PipelineContext<TSubject, TContext>, ? super TSubject, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>> list, TSubject tsubject, kotlin.coroutines.CoroutineContext coroutineContext) {
        super(tcontext);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tcontext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tsubject, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "");
        this.getHighSpeedVideoSizes = list;
        this.coroutineContext = coroutineContext;
        this.subject = tsubject;
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
        this.Camera2StreamConfigurationMap = -1;
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    public final java.lang.Object proceedWith(TSubject tsubject, kotlin.coroutines.Continuation<? super TSubject> continuation) {
        setSubject(tsubject);
        return proceed(continuation);
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    public final java.lang.Object proceed(kotlin.coroutines.Continuation<? super TSubject> continuation) {
        int i = this.Camera2StreamConfigurationMap;
        if (i < 0) {
            return getSubject();
        }
        if (i >= this.getHighSpeedVideoSizes.size()) {
            finish();
            return getSubject();
        }
        return getHighResolutionOutputSizeshNQ4ISI(continuation);
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    public final java.lang.Object execute$ktor_utils(TSubject tsubject, kotlin.coroutines.Continuation<? super TSubject> continuation) {
        this.Camera2StreamConfigurationMap = 0;
        setSubject(tsubject);
        return proceed(continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(kotlin.coroutines.Continuation<? super TSubject> continuation) {
        io.ktor.util.pipeline.DebugPipelineContext$proceedLoop$1 debugPipelineContext$proceedLoop$1;
        java.lang.Object coroutine_suspended;
        int i;
        int i2;
        kotlin.jvm.functions.Function3<io.ktor.util.pipeline.PipelineContext<TSubject, TContext>, TSubject, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function3;
        TSubject subject;
        if (continuation instanceof io.ktor.util.pipeline.DebugPipelineContext$proceedLoop$1) {
            debugPipelineContext$proceedLoop$1 = (io.ktor.util.pipeline.DebugPipelineContext$proceedLoop$1) continuation;
            if ((debugPipelineContext$proceedLoop$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                debugPipelineContext$proceedLoop$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = debugPipelineContext$proceedLoop$1.getHighSpeedVideoSizes;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = debugPipelineContext$proceedLoop$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i == 0 && i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                do {
                    i2 = this.Camera2StreamConfigurationMap;
                    if (i2 == -1) {
                        java.util.List<kotlin.jvm.functions.Function3<io.ktor.util.pipeline.PipelineContext<TSubject, TContext>, TSubject, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>> list = this.getHighSpeedVideoSizes;
                        if (i2 >= list.size()) {
                            finish();
                        } else {
                            function3 = list.get(i2);
                            this.Camera2StreamConfigurationMap = i2 + 1;
                            subject = getSubject();
                            debugPipelineContext$proceedLoop$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                        }
                    }
                    return getSubject();
                } while (function3.invoke(this, subject, debugPipelineContext$proceedLoop$1) != coroutine_suspended);
                return coroutine_suspended;
            }
        }
        debugPipelineContext$proceedLoop$1 = new io.ktor.util.pipeline.DebugPipelineContext$proceedLoop$1(this, continuation);
        java.lang.Object obj2 = debugPipelineContext$proceedLoop$1.getHighSpeedVideoSizes;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = debugPipelineContext$proceedLoop$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
        }
        kotlin.ResultKt.throwOnFailure(obj2);
        do {
            i2 = this.Camera2StreamConfigurationMap;
            if (i2 == -1) {
            }
            return getSubject();
        } while (function3.invoke(this, subject, debugPipelineContext$proceedLoop$1) != coroutine_suspended);
        return coroutine_suspended;
    }
}
