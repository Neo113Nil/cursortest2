package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0006\u001a'\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a6\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\r2\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0080\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a:\u0010\u0016\u001a\u00028\u0000\"\u0004\b\u0000\u0010\r2\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00142\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0080\b¢\u0006\u0004\b\u0016\u0010\u0017\u001a/\u0010\u001a\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0019*\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0018\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001a\u0010\u001d\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0019*\u00020\u001cH\u0080\u0010¢\u0006\u0004\b\u001d\u0010\u001e\"\u001a\u0010\"\u001a\u0004\u0018\u00010\u001f*\u00020\u00018AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b \u0010!"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/CoroutineContext;", "context", "newCoroutineContext", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;", "addedContext", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;", "p0", "p1", "", "p2", "getHighResolutionOutputSizeshNQ4ISI", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Z)Lkotlin/coroutines/CoroutineContext;", "T", "", "countOrElement", "Lkotlin/Function0;", "block", "withCoroutineContext", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lkotlin/coroutines/Continuation;", "continuation", "withContinuationContext", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "oldValue", "Lkotlinx/coroutines/UndispatchedCoroutine;", "updateUndispatchedCompletion", "(Lkotlin/coroutines/Continuation;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)Lkotlinx/coroutines/UndispatchedCoroutine;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "undispatchedCompletion", "(Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)Lkotlinx/coroutines/UndispatchedCoroutine;", "", "getCoroutineName", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/String;", "coroutineName"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CoroutineContextKt {
    public static final kotlin.coroutines.CoroutineContext newCoroutineContext(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlin.coroutines.CoroutineContext highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(coroutineScope.getCoroutineContext(), coroutineContext, true);
        kotlin.coroutines.CoroutineContext plus = kotlinx.coroutines.DebugKt.getDEBUG() ? highResolutionOutputSizeshNQ4ISI.plus(new kotlinx.coroutines.CoroutineId(kotlinx.coroutines.DebugKt.getCOROUTINE_ID().incrementAndGet())) : highResolutionOutputSizeshNQ4ISI;
        return (highResolutionOutputSizeshNQ4ISI == kotlinx.coroutines.Dispatchers.getDefault() || highResolutionOutputSizeshNQ4ISI.get(kotlin.coroutines.ContinuationInterceptor.INSTANCE) != null) ? plus : plus.plus(kotlinx.coroutines.Dispatchers.getDefault());
    }

    public static final <T> T withCoroutineContext(kotlin.coroutines.CoroutineContext coroutineContext, java.lang.Object obj, kotlin.jvm.functions.Function0<? extends T> function0) {
        java.lang.Object updateThreadContext = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(coroutineContext, obj);
        try {
            return function0.invoke();
        } finally {
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(coroutineContext, updateThreadContext);
        }
    }

    public static final <T> T withContinuationContext(kotlin.coroutines.Continuation<?> continuation, java.lang.Object obj, kotlin.jvm.functions.Function0<? extends T> function0) {
        kotlin.coroutines.CoroutineContext getInputFormats = continuation.getGetInputFormats();
        java.lang.Object updateThreadContext = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(getInputFormats, obj);
        kotlinx.coroutines.UndispatchedCoroutine<?> updateUndispatchedCompletion = updateThreadContext != kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS ? updateUndispatchedCompletion(continuation, getInputFormats, updateThreadContext) : null;
        try {
            return function0.invoke();
        } finally {
            if (updateUndispatchedCompletion == null || updateUndispatchedCompletion.clearThreadContext()) {
                kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(getInputFormats, updateThreadContext);
            }
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
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append('#');
        sb.append(coroutineId.getId());
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [T, kotlin.coroutines.CoroutineContext] */
    /* renamed from: $r8$lambda$H_vM-Ng3l1XQVJCai28JttKzHMg, reason: not valid java name */
    public static /* synthetic */ kotlin.coroutines.CoroutineContext m24056$r8$lambda$H_vMNg3l1XQVJCai28JttKzHMg(kotlin.jvm.internal.Ref.ObjectRef objectRef, boolean z, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.coroutines.CoroutineContext.Element element) {
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

    public static /* synthetic */ kotlin.coroutines.CoroutineContext $r8$lambda$JOIvfEplVIjrzg0nyXEojA2DYTc(kotlin.coroutines.CoroutineContext coroutineContext, kotlin.coroutines.CoroutineContext.Element element) {
        if (element instanceof kotlinx.coroutines.CopyableThreadContextElement) {
            return coroutineContext.plus(((kotlinx.coroutines.CopyableThreadContextElement) element).copyForChild());
        }
        return coroutineContext.plus(element);
    }

    public static /* synthetic */ boolean $r8$lambda$as3AdS3orsv2Ts0OahuRhLd1z7g(boolean z, kotlin.coroutines.CoroutineContext.Element element) {
        return z || (element instanceof kotlinx.coroutines.CopyableThreadContextElement);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [T, java.lang.Object] */
    private static final kotlin.coroutines.CoroutineContext getHighResolutionOutputSizeshNQ4ISI(kotlin.coroutines.CoroutineContext coroutineContext, kotlin.coroutines.CoroutineContext coroutineContext2, final boolean z) {
        boolean booleanValue = ((java.lang.Boolean) coroutineContext.fold(java.lang.Boolean.FALSE, new kotlinx.coroutines.CoroutineContextKt$$ExternalSyntheticLambda0())).booleanValue();
        boolean booleanValue2 = ((java.lang.Boolean) coroutineContext2.fold(java.lang.Boolean.FALSE, new kotlinx.coroutines.CoroutineContextKt$$ExternalSyntheticLambda0())).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return coroutineContext.plus(coroutineContext2);
        }
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        objectRef.element = coroutineContext2;
        kotlin.coroutines.CoroutineContext coroutineContext3 = (kotlin.coroutines.CoroutineContext) coroutineContext.fold(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, new kotlin.jvm.functions.Function2() { // from class: kotlinx.coroutines.CoroutineContextKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return kotlinx.coroutines.CoroutineContextKt.m24056$r8$lambda$H_vMNg3l1XQVJCai28JttKzHMg(kotlin.jvm.internal.Ref.ObjectRef.this, z, (kotlin.coroutines.CoroutineContext) obj, (kotlin.coroutines.CoroutineContext.Element) obj2);
            }
        });
        if (booleanValue2) {
            objectRef.element = ((kotlin.coroutines.CoroutineContext) objectRef.element).fold(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, new kotlin.jvm.functions.Function2() { // from class: kotlinx.coroutines.CoroutineContextKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return kotlinx.coroutines.CoroutineContextKt.$r8$lambda$JOIvfEplVIjrzg0nyXEojA2DYTc((kotlin.coroutines.CoroutineContext) obj, (kotlin.coroutines.CoroutineContext.Element) obj2);
                }
            });
        }
        return coroutineContext3.plus((kotlin.coroutines.CoroutineContext) objectRef.element);
    }

    public static final kotlin.coroutines.CoroutineContext newCoroutineContext(kotlin.coroutines.CoroutineContext coroutineContext, kotlin.coroutines.CoroutineContext coroutineContext2) {
        if (!((java.lang.Boolean) coroutineContext2.fold(java.lang.Boolean.FALSE, new kotlinx.coroutines.CoroutineContextKt$$ExternalSyntheticLambda0())).booleanValue()) {
            return coroutineContext.plus(coroutineContext2);
        }
        return getHighResolutionOutputSizeshNQ4ISI(coroutineContext, coroutineContext2, false);
    }
}
