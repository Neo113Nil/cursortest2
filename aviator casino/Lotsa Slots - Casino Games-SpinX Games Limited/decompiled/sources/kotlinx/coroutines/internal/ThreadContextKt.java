package kotlinx.coroutines.internal;

/* compiled from: ThreadContext.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0000\u001a\u001c\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u0000\u001a\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0000\"\u0010\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"$\u0010\u0002\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\",\u0010\u0006\u001a \u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00070\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\" \u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"NO_THREAD_ELEMENTS", "Lkotlinx/coroutines/internal/Symbol;", "countAll", "Lkotlin/Function2;", "", "Lkotlin/coroutines/CoroutineContext$Element;", "findOne", "Lkotlinx/coroutines/ThreadContextElement;", "updateState", "Lkotlinx/coroutines/internal/ThreadState;", "threadContextElements", "context", "Lkotlin/coroutines/CoroutineContext;", "updateThreadContext", "countOrElement", "restoreThreadContext", "", "oldState", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ThreadContextKt {
    public static final kotlinx.coroutines.internal.Symbol NO_THREAD_ELEMENTS = new kotlinx.coroutines.internal.Symbol("NO_THREAD_ELEMENTS");
    private static final kotlin.jvm.functions.Function2<java.lang.Object, kotlin.coroutines.CoroutineContext.Element, java.lang.Object> countAll = new kotlin.jvm.functions.Function2() { // from class: kotlinx.coroutines.internal.ThreadContextKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            java.lang.Object countAll$lambda$0;
            countAll$lambda$0 = kotlinx.coroutines.internal.ThreadContextKt.countAll$lambda$0(obj, (kotlin.coroutines.CoroutineContext.Element) obj2);
            return countAll$lambda$0;
        }
    };
    private static final kotlin.jvm.functions.Function2<kotlinx.coroutines.ThreadContextElement<?>, kotlin.coroutines.CoroutineContext.Element, kotlinx.coroutines.ThreadContextElement<?>> findOne = new kotlin.jvm.functions.Function2() { // from class: kotlinx.coroutines.internal.ThreadContextKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            kotlinx.coroutines.ThreadContextElement findOne$lambda$1;
            findOne$lambda$1 = kotlinx.coroutines.internal.ThreadContextKt.findOne$lambda$1((kotlinx.coroutines.ThreadContextElement) obj, (kotlin.coroutines.CoroutineContext.Element) obj2);
            return findOne$lambda$1;
        }
    };
    private static final kotlin.jvm.functions.Function2<kotlinx.coroutines.internal.ThreadState, kotlin.coroutines.CoroutineContext.Element, kotlinx.coroutines.internal.ThreadState> updateState = new kotlin.jvm.functions.Function2() { // from class: kotlinx.coroutines.internal.ThreadContextKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            kotlinx.coroutines.internal.ThreadState updateState$lambda$2;
            updateState$lambda$2 = kotlinx.coroutines.internal.ThreadContextKt.updateState$lambda$2((kotlinx.coroutines.internal.ThreadState) obj, (kotlin.coroutines.CoroutineContext.Element) obj2);
            return updateState$lambda$2;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object countAll$lambda$0(java.lang.Object obj, kotlin.coroutines.CoroutineContext.Element element) {
        if (!(element instanceof kotlinx.coroutines.ThreadContextElement)) {
            return obj;
        }
        java.lang.Integer num = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
        int intValue = num != null ? num.intValue() : 1;
        return intValue == 0 ? element : java.lang.Integer.valueOf(intValue + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlinx.coroutines.ThreadContextElement<?> findOne$lambda$1(kotlinx.coroutines.ThreadContextElement<?> threadContextElement, kotlin.coroutines.CoroutineContext.Element element) {
        if (threadContextElement != null) {
            return threadContextElement;
        }
        if (element instanceof kotlinx.coroutines.ThreadContextElement) {
            return (kotlinx.coroutines.ThreadContextElement) element;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlinx.coroutines.internal.ThreadState updateState$lambda$2(kotlinx.coroutines.internal.ThreadState threadState, kotlin.coroutines.CoroutineContext.Element element) {
        if (element instanceof kotlinx.coroutines.ThreadContextElement) {
            kotlinx.coroutines.ThreadContextElement<?> threadContextElement = (kotlinx.coroutines.ThreadContextElement) element;
            threadState.append(threadContextElement, threadContextElement.updateThreadContext(threadState.context));
        }
        return threadState;
    }

    public static final java.lang.Object threadContextElements(kotlin.coroutines.CoroutineContext coroutineContext) {
        java.lang.Object fold = coroutineContext.fold(0, countAll);
        kotlin.jvm.internal.Intrinsics.checkNotNull(fold);
        return fold;
    }

    public static final java.lang.Object updateThreadContext(kotlin.coroutines.CoroutineContext coroutineContext, java.lang.Object obj) {
        if (obj == null) {
            obj = threadContextElements(coroutineContext);
        }
        if (obj == 0) {
            return NO_THREAD_ELEMENTS;
        }
        if (obj instanceof java.lang.Integer) {
            return coroutineContext.fold(new kotlinx.coroutines.internal.ThreadState(coroutineContext, ((java.lang.Number) obj).intValue()), updateState);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((kotlinx.coroutines.ThreadContextElement) obj).updateThreadContext(coroutineContext);
    }

    public static final void restoreThreadContext(kotlin.coroutines.CoroutineContext coroutineContext, java.lang.Object obj) {
        if (obj == NO_THREAD_ELEMENTS) {
            return;
        }
        if (obj instanceof kotlinx.coroutines.internal.ThreadState) {
            ((kotlinx.coroutines.internal.ThreadState) obj).restore(coroutineContext);
            return;
        }
        java.lang.Object fold = coroutineContext.fold(null, findOne);
        kotlin.jvm.internal.Intrinsics.checkNotNull(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((kotlinx.coroutines.ThreadContextElement) fold).restoreThreadContext(coroutineContext, obj);
    }
}
