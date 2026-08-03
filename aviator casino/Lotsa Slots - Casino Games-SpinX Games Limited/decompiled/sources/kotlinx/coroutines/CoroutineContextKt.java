package kotlinx.coroutines;

/* compiled from: CoroutineContext.kt */
@kotlin.Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0007\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0001H\u0002\u001a \u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0006H\u0002\u001a4\u0010\u000b\u001a\u0002H\f\"\u0004\b\u0000\u0010\f2\u0006\u0010\u0003\u001a\u00020\u00012\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\f0\u0010H\u0080\b¢\u0006\u0002\u0010\u0011\u001a8\u0010\u0012\u001a\u0002H\f\"\u0004\b\u0000\u0010\f2\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\f0\u0010H\u0080\b¢\u0006\u0002\u0010\u0015\u001a(\u0010\u0016\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0017*\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u0003\u001a\u00020\u00012\b\u0010\u0018\u001a\u0004\u0018\u00010\u000eH\u0000\u001a\u0013\u0010\u0019\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0017*\u00020\u001aH\u0080\u0010\"\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u001c*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\"\u000e\u0010\u001f\u001a\u00020\u001cX\u0082T¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"newCoroutineContext", "Lkotlin/coroutines/CoroutineContext;", "Lkotlinx/coroutines/CoroutineScope;", "context", "addedContext", "hasCopyableElements", "", "foldCopies", "originalContext", "appendContext", "isNewCoroutine", "withCoroutineContext", "T", "countOrElement", "", "block", "Lkotlin/Function0;", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "withContinuationContext", "continuation", "Lkotlin/coroutines/Continuation;", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "updateUndispatchedCompletion", "Lkotlinx/coroutines/UndispatchedCoroutine;", "oldValue", "undispatchedCompletion", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "coroutineName", "", "getCoroutineName", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/String;", "DEBUG_THREAD_NAME_SEPARATOR", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CoroutineContextKt {
    private static final java.lang.String DEBUG_THREAD_NAME_SEPARATOR = " @";

    public static final kotlin.coroutines.CoroutineContext newCoroutineContext(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlin.coroutines.CoroutineContext foldCopies = foldCopies(coroutineScope.getCoroutineContext(), coroutineContext, true);
        kotlin.coroutines.CoroutineContext plus = kotlinx.coroutines.DebugKt.getDEBUG() ? foldCopies.plus(new kotlinx.coroutines.CoroutineId(kotlinx.coroutines.DebugKt.getCOROUTINE_ID().incrementAndGet())) : foldCopies;
        return (foldCopies == kotlinx.coroutines.Dispatchers.getDefault() || foldCopies.get(kotlin.coroutines.ContinuationInterceptor.INSTANCE) != null) ? plus : plus.plus(kotlinx.coroutines.Dispatchers.getDefault());
    }

    public static final kotlin.coroutines.CoroutineContext newCoroutineContext(kotlin.coroutines.CoroutineContext coroutineContext, kotlin.coroutines.CoroutineContext coroutineContext2) {
        return !hasCopyableElements(coroutineContext2) ? coroutineContext.plus(coroutineContext2) : foldCopies(coroutineContext, coroutineContext2, false);
    }

    private static final boolean hasCopyableElements(kotlin.coroutines.CoroutineContext coroutineContext) {
        return ((java.lang.Boolean) coroutineContext.fold(false, new kotlin.jvm.functions.Function2() { // from class: kotlinx.coroutines.CoroutineContextKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                boolean hasCopyableElements$lambda$0;
                hasCopyableElements$lambda$0 = kotlinx.coroutines.CoroutineContextKt.hasCopyableElements$lambda$0(((java.lang.Boolean) obj).booleanValue(), (kotlin.coroutines.CoroutineContext.Element) obj2);
                return java.lang.Boolean.valueOf(hasCopyableElements$lambda$0);
            }
        })).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasCopyableElements$lambda$0(boolean z, kotlin.coroutines.CoroutineContext.Element element) {
        return z || (element instanceof kotlinx.coroutines.CopyableThreadContextElement);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [T, java.lang.Object] */
    private static final kotlin.coroutines.CoroutineContext foldCopies(kotlin.coroutines.CoroutineContext coroutineContext, kotlin.coroutines.CoroutineContext coroutineContext2, final boolean z) {
        boolean hasCopyableElements = hasCopyableElements(coroutineContext);
        boolean hasCopyableElements2 = hasCopyableElements(coroutineContext2);
        if (!hasCopyableElements && !hasCopyableElements2) {
            return coroutineContext.plus(coroutineContext2);
        }
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        objectRef.element = coroutineContext2;
        kotlin.coroutines.CoroutineContext coroutineContext3 = (kotlin.coroutines.CoroutineContext) coroutineContext.fold(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, new kotlin.jvm.functions.Function2() { // from class: kotlinx.coroutines.CoroutineContextKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                kotlin.coroutines.CoroutineContext foldCopies$lambda$1;
                foldCopies$lambda$1 = kotlinx.coroutines.CoroutineContextKt.foldCopies$lambda$1(kotlin.jvm.internal.Ref.ObjectRef.this, z, (kotlin.coroutines.CoroutineContext) obj, (kotlin.coroutines.CoroutineContext.Element) obj2);
                return foldCopies$lambda$1;
            }
        });
        if (hasCopyableElements2) {
            objectRef.element = ((kotlin.coroutines.CoroutineContext) objectRef.element).fold(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, new kotlin.jvm.functions.Function2() { // from class: kotlinx.coroutines.CoroutineContextKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    kotlin.coroutines.CoroutineContext foldCopies$lambda$2;
                    foldCopies$lambda$2 = kotlinx.coroutines.CoroutineContextKt.foldCopies$lambda$2((kotlin.coroutines.CoroutineContext) obj, (kotlin.coroutines.CoroutineContext.Element) obj2);
                    return foldCopies$lambda$2;
                }
            });
        }
        return coroutineContext3.plus((kotlin.coroutines.CoroutineContext) objectRef.element);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, kotlin.coroutines.CoroutineContext] */
    public static final kotlin.coroutines.CoroutineContext foldCopies$lambda$1(kotlin.jvm.internal.Ref.ObjectRef objectRef, boolean z, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.coroutines.CoroutineContext.Element element) {
        if (!(element instanceof kotlinx.coroutines.CopyableThreadContextElement)) {
            return coroutineContext.plus(element);
        }
        kotlin.coroutines.CoroutineContext.Element element2 = ((kotlin.coroutines.CoroutineContext) objectRef.element).get(element.getKey());
        if (element2 == null) {
            return coroutineContext.plus(z ? ((kotlinx.coroutines.CopyableThreadContextElement) element).copyForChild() : (kotlinx.coroutines.CopyableThreadContextElement) element);
        }
        objectRef.element = ((kotlin.coroutines.CoroutineContext) objectRef.element).minusKey(element.getKey());
        return coroutineContext.plus(((kotlinx.coroutines.CopyableThreadContextElement) element).mergeForChild(element2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.coroutines.CoroutineContext foldCopies$lambda$2(kotlin.coroutines.CoroutineContext coroutineContext, kotlin.coroutines.CoroutineContext.Element element) {
        if (element instanceof kotlinx.coroutines.CopyableThreadContextElement) {
            return coroutineContext.plus(((kotlinx.coroutines.CopyableThreadContextElement) element).copyForChild());
        }
        return coroutineContext.plus(element);
    }

    public static final <T> T withCoroutineContext(kotlin.coroutines.CoroutineContext coroutineContext, java.lang.Object obj, kotlin.jvm.functions.Function0<? extends T> function0) {
        java.lang.Object updateThreadContext = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(coroutineContext, obj);
        try {
            return function0.invoke();
        } finally {
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(coroutineContext, updateThreadContext);
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        }
    }

    public static final <T> T withContinuationContext(kotlin.coroutines.Continuation<?> continuation, java.lang.Object obj, kotlin.jvm.functions.Function0<? extends T> function0) {
        kotlin.coroutines.CoroutineContext context = continuation.getContext();
        java.lang.Object updateThreadContext = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(context, obj);
        kotlinx.coroutines.UndispatchedCoroutine<?> updateUndispatchedCompletion = updateThreadContext != kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS ? updateUndispatchedCompletion(continuation, context, updateThreadContext) : null;
        try {
            return function0.invoke();
        } finally {
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            if (updateUndispatchedCompletion == null || updateUndispatchedCompletion.clearThreadContext()) {
                kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(context, updateThreadContext);
            }
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        }
    }

    public static final kotlinx.coroutines.UndispatchedCoroutine<?> updateUndispatchedCompletion(kotlin.coroutines.Continuation<?> continuation, kotlin.coroutines.CoroutineContext coroutineContext, java.lang.Object obj) {
        if (!(continuation instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame) || coroutineContext.get(kotlinx.coroutines.UndispatchedMarker.INSTANCE) == null) {
            return null;
        }
        kotlinx.coroutines.UndispatchedCoroutine<?> undispatchedCompletion = undispatchedCompletion((kotlin.coroutines.jvm.internal.CoroutineStackFrame) continuation);
        if (undispatchedCompletion != null) {
            undispatchedCompletion.saveThreadContext(coroutineContext, obj);
        }
        return undispatchedCompletion;
    }

    public static final kotlinx.coroutines.UndispatchedCoroutine<?> undispatchedCompletion(kotlin.coroutines.jvm.internal.CoroutineStackFrame coroutineStackFrame) {
        while (!(coroutineStackFrame instanceof kotlinx.coroutines.DispatchedCoroutine) && (coroutineStackFrame = coroutineStackFrame.getCallerFrame()) != null) {
            if (coroutineStackFrame instanceof kotlinx.coroutines.UndispatchedCoroutine) {
                return (kotlinx.coroutines.UndispatchedCoroutine) coroutineStackFrame;
            }
        }
        return null;
    }

    public static final java.lang.String getCoroutineName(kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlinx.coroutines.CoroutineId coroutineId;
        java.lang.String str;
        if (!kotlinx.coroutines.DebugKt.getDEBUG() || (coroutineId = (kotlinx.coroutines.CoroutineId) coroutineContext.get(kotlinx.coroutines.CoroutineId.INSTANCE)) == null) {
            return null;
        }
        kotlinx.coroutines.CoroutineName coroutineName = (kotlinx.coroutines.CoroutineName) coroutineContext.get(kotlinx.coroutines.CoroutineName.INSTANCE);
        if (coroutineName == null || (str = coroutineName.getName()) == null) {
            str = "coroutine";
        }
        return str + '#' + coroutineId.getId();
    }
}
