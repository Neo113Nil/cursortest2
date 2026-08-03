package kotlinx.coroutines.flow;

/* compiled from: Lint.kt */
@kotlin.Metadata(d1 = {"\u0000\u0096\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0007\u001a&\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u001a\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\bH\u0007\u001a\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\bH\u0007\u001a'\u0010\u0010\u001a\u00020\u0011*\u0006\u0012\u0002\b\u00030\f2\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014H\u0007¢\u0006\u0002\u0010\u0015\u001aj\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032D\b\b\u0010\u001b\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\f\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110 \u0012\u0006\u0012\u0004\u0018\u00010!0\u001c¢\u0006\u0002\b\"H\u0087\b¢\u0006\u0002\u0010#\u001ac\u0010$\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\b\b\u0002\u0010%\u001a\u00020&23\b\n\u0010'\u001a-\b\u0001\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0 \u0012\u0006\u0012\u0004\u0018\u00010!0(H\u0087\b¢\u0006\u0002\u0010)\u001a\u007f\u0010*\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032Y\b\b\u0010'\u001aS\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\f\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110&¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(,\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0 \u0012\u0006\u0012\u0004\u0018\u00010!0+¢\u0006\u0002\b\"H\u0087\b¢\u0006\u0002\u0010-\u001a$\u0010.\u001a\b\u0012\u0004\u0012\u0002H\u00020/\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0087H¢\u0006\u0002\u00100\u001a,\u0010.\u001a\u000201\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\f\u00102\u001a\b\u0012\u0004\u0012\u0002H\u000203H\u0087H¢\u0006\u0002\u00104\u001a$\u00105\u001a\b\u0012\u0004\u0012\u0002H\u000206\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0087H¢\u0006\u0002\u00100\u001a,\u00105\u001a\u000201\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\f\u00102\u001a\b\u0012\u0004\u0012\u0002H\u000207H\u0087H¢\u0006\u0002\u00108\u001a\u001e\u00109\u001a\u00020:\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0087H¢\u0006\u0002\u00100\"\"\u0010\n\u001a\u00020\u000b*\u0006\u0012\u0002\b\u00030\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\n\u0010\u000f\"\"\u0010\u0016\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u000e\u001a\u0004\b\u0018\u0010\u0019¨\u0006;"}, d2 = {"cancellable", "Lkotlinx/coroutines/flow/Flow;", "T", "Lkotlinx/coroutines/flow/SharedFlow;", "flowOn", "context", "Lkotlin/coroutines/CoroutineContext;", "conflate", "Lkotlinx/coroutines/flow/StateFlow;", "distinctUntilChanged", "isActive", "", "Lkotlinx/coroutines/flow/FlowCollector;", "isActive$annotations", "(Lkotlinx/coroutines/flow/FlowCollector;)V", "(Lkotlinx/coroutines/flow/FlowCollector;)Z", "cancel", "", "cause", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "(Lkotlinx/coroutines/flow/FlowCollector;Ljava/util/concurrent/CancellationException;)V", "coroutineContext", "getCoroutineContext$annotations", "getCoroutineContext", "(Lkotlinx/coroutines/flow/FlowCollector;)Lkotlin/coroutines/CoroutineContext;", "catch", "action", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/flow/SharedFlow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "retry", "retries", "", "predicate", "Lkotlin/Function2;", "(Lkotlinx/coroutines/flow/SharedFlow;JLkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "retryWhen", "Lkotlin/Function4;", "attempt", "(Lkotlinx/coroutines/flow/SharedFlow;Lkotlin/jvm/functions/Function4;)Lkotlinx/coroutines/flow/Flow;", "toList", "", "(Lkotlinx/coroutines/flow/SharedFlow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "destination", "", "(Lkotlinx/coroutines/flow/SharedFlow;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toSet", "", "", "(Lkotlinx/coroutines/flow/SharedFlow;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.helpshift.HelpshiftEvent.DATA_MESSAGE_COUNT, "", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LintKt {
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "coroutineContext is resolved into the property of outer CoroutineScope which is likely to be an error. Use currentCoroutineContext() instead or specify the receiver of coroutineContext explicitly", replaceWith = @kotlin.ReplaceWith(expression = "currentCoroutineContext()", imports = {}))
    public static /* synthetic */ void getCoroutineContext$annotations(kotlinx.coroutines.flow.FlowCollector flowCollector) {
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "isActive is resolved into the extension of outer CoroutineScope which is likely to be an error. Use currentCoroutineContext().isActive or cancellable() operator instead or specify the receiver of isActive explicitly. Additionally, flow {} builder emissions are cancellable by default.", replaceWith = @kotlin.ReplaceWith(expression = "currentCoroutineContext().isActive", imports = {}))
    public static /* synthetic */ void isActive$annotations(kotlinx.coroutines.flow.FlowCollector flowCollector) {
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Applying 'cancellable' to a SharedFlow has no effect. See the SharedFlow documentation on Operator Fusion.", replaceWith = @kotlin.ReplaceWith(expression = "this", imports = {}))
    public static final <T> kotlinx.coroutines.flow.Flow<T> cancellable(kotlinx.coroutines.flow.SharedFlow<? extends T> sharedFlow) {
        kotlinx.coroutines.flow.FlowKt.noImpl();
        throw new kotlin.KotlinNothingValueException();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Applying 'flowOn' to SharedFlow has no effect. See the SharedFlow documentation on Operator Fusion.", replaceWith = @kotlin.ReplaceWith(expression = "this", imports = {}))
    public static final <T> kotlinx.coroutines.flow.Flow<T> flowOn(kotlinx.coroutines.flow.SharedFlow<? extends T> sharedFlow, kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlinx.coroutines.flow.FlowKt.noImpl();
        throw new kotlin.KotlinNothingValueException();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Applying 'conflate' to StateFlow has no effect. See the StateFlow documentation on Operator Fusion.", replaceWith = @kotlin.ReplaceWith(expression = "this", imports = {}))
    public static final <T> kotlinx.coroutines.flow.Flow<T> conflate(kotlinx.coroutines.flow.StateFlow<? extends T> stateFlow) {
        kotlinx.coroutines.flow.FlowKt.noImpl();
        throw new kotlin.KotlinNothingValueException();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Applying 'distinctUntilChanged' to StateFlow has no effect. See the StateFlow documentation on Operator Fusion.", replaceWith = @kotlin.ReplaceWith(expression = "this", imports = {}))
    public static final <T> kotlinx.coroutines.flow.Flow<T> distinctUntilChanged(kotlinx.coroutines.flow.StateFlow<? extends T> stateFlow) {
        kotlinx.coroutines.flow.FlowKt.noImpl();
        throw new kotlin.KotlinNothingValueException();
    }

    public static final boolean isActive(kotlinx.coroutines.flow.FlowCollector<?> flowCollector) {
        kotlinx.coroutines.flow.FlowKt.noImpl();
        throw new kotlin.KotlinNothingValueException();
    }

    public static /* synthetic */ void cancel$default(kotlinx.coroutines.flow.FlowCollector flowCollector, java.util.concurrent.CancellationException cancellationException, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        cancel(flowCollector, cancellationException);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "cancel() is resolved into the extension of outer CoroutineScope which is likely to be an error. Use currentCoroutineContext().cancel() instead or specify the receiver of cancel() explicitly", replaceWith = @kotlin.ReplaceWith(expression = "currentCoroutineContext().cancel(cause)", imports = {}))
    public static final void cancel(kotlinx.coroutines.flow.FlowCollector<?> flowCollector, java.util.concurrent.CancellationException cancellationException) {
        kotlinx.coroutines.flow.FlowKt.noImpl();
        throw new kotlin.KotlinNothingValueException();
    }

    public static final kotlin.coroutines.CoroutineContext getCoroutineContext(kotlinx.coroutines.flow.FlowCollector<?> flowCollector) {
        kotlinx.coroutines.flow.FlowKt.noImpl();
        throw new kotlin.KotlinNothingValueException();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "SharedFlow never completes, so this operator typically has not effect, it can only catch exceptions from 'onSubscribe' operator", replaceWith = @kotlin.ReplaceWith(expression = "this", imports = {}))
    /* renamed from: catch, reason: not valid java name */
    private static final <T> kotlinx.coroutines.flow.Flow<T> m12354catch(kotlinx.coroutines.flow.SharedFlow<? extends T> sharedFlow, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super T>, ? super java.lang.Throwable, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(sharedFlow, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.catch>");
        return kotlinx.coroutines.flow.FlowKt.m12340catch(sharedFlow, function3);
    }

    static /* synthetic */ kotlinx.coroutines.flow.Flow retry$default(kotlinx.coroutines.flow.SharedFlow sharedFlow, long j, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = Long.MAX_VALUE;
        }
        if ((i & 2) != 0) {
            function2 = new kotlinx.coroutines.flow.LintKt$retry$1(null);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(sharedFlow, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.retry>");
        return kotlinx.coroutines.flow.FlowKt.retry(sharedFlow, j, function2);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "SharedFlow never completes, so this operator has no effect.", replaceWith = @kotlin.ReplaceWith(expression = "this", imports = {}))
    private static final <T> kotlinx.coroutines.flow.Flow<T> retry(kotlinx.coroutines.flow.SharedFlow<? extends T> sharedFlow, long j, kotlin.jvm.functions.Function2<? super java.lang.Throwable, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(sharedFlow, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.retry>");
        return kotlinx.coroutines.flow.FlowKt.retry(sharedFlow, j, function2);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "SharedFlow never completes, so this operator has no effect.", replaceWith = @kotlin.ReplaceWith(expression = "this", imports = {}))
    private static final <T> kotlinx.coroutines.flow.Flow<T> retryWhen(kotlinx.coroutines.flow.SharedFlow<? extends T> sharedFlow, kotlin.jvm.functions.Function4<? super kotlinx.coroutines.flow.FlowCollector<? super T>, ? super java.lang.Throwable, ? super java.lang.Long, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> function4) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(sharedFlow, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.retryWhen>");
        return kotlinx.coroutines.flow.FlowKt.retryWhen(sharedFlow, function4);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "SharedFlow never completes, so this terminal operation never completes.")
    private static final <T> java.lang.Object toList(kotlinx.coroutines.flow.SharedFlow<? extends T> sharedFlow, kotlin.coroutines.Continuation<? super java.util.List<? extends T>> continuation) {
        java.lang.Object list$default;
        kotlin.jvm.internal.Intrinsics.checkNotNull(sharedFlow, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.toList>");
        kotlin.jvm.internal.InlineMarker.mark(0);
        list$default = kotlinx.coroutines.flow.FlowKt__CollectionKt.toList$default(sharedFlow, null, continuation, 1, null);
        kotlin.jvm.internal.InlineMarker.mark(1);
        return list$default;
    }

    private static final <T> java.lang.Object toList(kotlinx.coroutines.flow.SharedFlow<? extends T> sharedFlow, java.util.List<T> list, kotlin.coroutines.Continuation<?> continuation) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(sharedFlow, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.toList>");
        kotlin.jvm.internal.InlineMarker.mark(0);
        kotlinx.coroutines.flow.FlowKt.toList(sharedFlow, list, continuation);
        kotlin.jvm.internal.InlineMarker.mark(1);
        throw new java.lang.IllegalStateException("this code is supposed to be unreachable");
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "SharedFlow never completes, so this terminal operation never completes.")
    private static final <T> java.lang.Object toSet(kotlinx.coroutines.flow.SharedFlow<? extends T> sharedFlow, kotlin.coroutines.Continuation<? super java.util.Set<? extends T>> continuation) {
        java.lang.Object set$default;
        kotlin.jvm.internal.Intrinsics.checkNotNull(sharedFlow, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.toSet>");
        kotlin.jvm.internal.InlineMarker.mark(0);
        set$default = kotlinx.coroutines.flow.FlowKt__CollectionKt.toSet$default(sharedFlow, null, continuation, 1, null);
        kotlin.jvm.internal.InlineMarker.mark(1);
        return set$default;
    }

    private static final <T> java.lang.Object toSet(kotlinx.coroutines.flow.SharedFlow<? extends T> sharedFlow, java.util.Set<T> set, kotlin.coroutines.Continuation<?> continuation) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(sharedFlow, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.toSet>");
        kotlin.jvm.internal.InlineMarker.mark(0);
        kotlinx.coroutines.flow.FlowKt.toSet(sharedFlow, set, continuation);
        kotlin.jvm.internal.InlineMarker.mark(1);
        throw new java.lang.IllegalStateException("this code is supposed to be unreachable");
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "SharedFlow never completes, so this terminal operation never completes.")
    private static final <T> java.lang.Object count(kotlinx.coroutines.flow.SharedFlow<? extends T> sharedFlow, kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(sharedFlow, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.count>");
        kotlin.jvm.internal.InlineMarker.mark(0);
        java.lang.Object count = kotlinx.coroutines.flow.FlowKt.count(sharedFlow, continuation);
        kotlin.jvm.internal.InlineMarker.mark(1);
        return count;
    }
}
