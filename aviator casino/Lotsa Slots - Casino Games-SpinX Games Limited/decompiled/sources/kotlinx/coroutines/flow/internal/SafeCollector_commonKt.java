package kotlinx.coroutines.flow.internal;

/* compiled from: SafeCollector.common.kt */
@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0001\u001a\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0080\u0010\u001aK\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n2/\b\u0005\u0010\u000b\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f¢\u0006\u0002\b\u0010H\u0081\b¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"checkContext", "", "Lkotlinx/coroutines/flow/internal/SafeCollector;", "currentContext", "Lkotlin/coroutines/CoroutineContext;", "transitiveCoroutineParent", "Lkotlinx/coroutines/Job;", "collectJob", "unsafeFlow", "Lkotlinx/coroutines/flow/Flow;", "T", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SafeCollector_commonKt {
    public static final void checkContext(final kotlinx.coroutines.flow.internal.SafeCollector<?> safeCollector, kotlin.coroutines.CoroutineContext coroutineContext) {
        if (((java.lang.Number) coroutineContext.fold(0, new kotlin.jvm.functions.Function2() { // from class: kotlinx.coroutines.flow.internal.SafeCollector_commonKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                int checkContext$lambda$0;
                checkContext$lambda$0 = kotlinx.coroutines.flow.internal.SafeCollector_commonKt.checkContext$lambda$0(kotlinx.coroutines.flow.internal.SafeCollector.this, ((java.lang.Integer) obj).intValue(), (kotlin.coroutines.CoroutineContext.Element) obj2);
                return java.lang.Integer.valueOf(checkContext$lambda$0);
            }
        })).intValue() == safeCollector.collectContextSize) {
            return;
        }
        throw new java.lang.IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + safeCollector.collectContext + ",\n\t\tbut emission happened in " + coroutineContext + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int checkContext$lambda$0(kotlinx.coroutines.flow.internal.SafeCollector safeCollector, int i, kotlin.coroutines.CoroutineContext.Element element) {
        kotlin.coroutines.CoroutineContext.Key<?> key = element.getKey();
        kotlin.coroutines.CoroutineContext.Element element2 = safeCollector.collectContext.get(key);
        if (key != kotlinx.coroutines.Job.INSTANCE) {
            if (element != element2) {
                return Integer.MIN_VALUE;
            }
            return i + 1;
        }
        kotlinx.coroutines.Job job = (kotlinx.coroutines.Job) element2;
        kotlin.jvm.internal.Intrinsics.checkNotNull(element, "null cannot be cast to non-null type kotlinx.coroutines.Job");
        kotlinx.coroutines.Job transitiveCoroutineParent = transitiveCoroutineParent((kotlinx.coroutines.Job) element, job);
        if (transitiveCoroutineParent == job) {
            return job == null ? i : i + 1;
        }
        throw new java.lang.IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + transitiveCoroutineParent + ", expected child of " + job + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }

    public static final kotlinx.coroutines.Job transitiveCoroutineParent(kotlinx.coroutines.Job job, kotlinx.coroutines.Job job2) {
        while (job != null) {
            if (job == job2 || !(job instanceof kotlinx.coroutines.internal.ScopeCoroutine)) {
                return job;
            }
            job = ((kotlinx.coroutines.internal.ScopeCoroutine) job).getParent();
        }
        return null;
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> unsafeFlow(kotlin.jvm.functions.Function2<? super kotlinx.coroutines.flow.FlowCollector<? super T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
        return new kotlinx.coroutines.flow.internal.SafeCollector_commonKt$unsafeFlow$1(function2);
    }
}
