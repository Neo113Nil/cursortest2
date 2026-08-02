package kotlinx.coroutines.flow.internal;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\"\u0010\b\u001a\u0004\u0018\u00010\u0006*\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0080\u0010¢\u0006\u0004\b\b\u0010\t\u001aM\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\n2/\b\u0004\u0010\u0010\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u000b¢\u0006\u0002\b\u000fH\u0080\b¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Lkotlinx/coroutines/flow/internal/SafeCollector;", "Lkotlin/coroutines/CoroutineContext;", "currentContext", "", "checkContext", "(Lkotlinx/coroutines/flow/internal/SafeCollector;Lkotlin/coroutines/CoroutineContext;)V", "Lkotlinx/coroutines/Job;", "collectJob", "transitiveCoroutineParent", "(Lkotlinx/coroutines/Job;Lkotlinx/coroutines/Job;)Lkotlinx/coroutines/Job;", "T", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "Lkotlinx/coroutines/flow/Flow;", "unsafeFlow", "(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SafeCollector_commonKt {
    public static final void checkContext(final kotlinx.coroutines.flow.internal.SafeCollector<?> safeCollector, kotlin.coroutines.CoroutineContext coroutineContext) {
        if (((java.lang.Number) coroutineContext.fold(0, new kotlin.jvm.functions.Function2() { // from class: kotlinx.coroutines.flow.internal.SafeCollector_commonKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Integer.valueOf(kotlinx.coroutines.flow.internal.SafeCollector_commonKt.m24107$r8$lambda$0mv1vIMKs5GqhpegvxZ5k4J09Y(kotlinx.coroutines.flow.internal.SafeCollector.this, ((java.lang.Integer) obj).intValue(), (kotlin.coroutines.CoroutineContext.Element) obj2));
            }
        })).intValue() == safeCollector.collectContextSize) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Flow invariant is violated:\n\t\tFlow was collected in ");
        sb.append(safeCollector.collectContext);
        sb.append(",\n\t\tbut emission happened in ");
        sb.append(coroutineContext);
        sb.append(".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead");
        throw new java.lang.IllegalStateException(sb.toString().toString());
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

    /* renamed from: $r8$lambda$0mv-1vIMKs5GqhpegvxZ5k4J09Y, reason: not valid java name */
    public static /* synthetic */ int m24107$r8$lambda$0mv1vIMKs5GqhpegvxZ5k4J09Y(kotlinx.coroutines.flow.internal.SafeCollector safeCollector, int i, kotlin.coroutines.CoroutineContext.Element element) {
        kotlin.coroutines.CoroutineContext.Key<?> key = element.getKey();
        kotlin.coroutines.CoroutineContext.Element element2 = safeCollector.collectContext.get(key);
        if (key != kotlinx.coroutines.Job.INSTANCE) {
            if (element != element2) {
                return Integer.MIN_VALUE;
            }
            return i + 1;
        }
        kotlinx.coroutines.Job job = (kotlinx.coroutines.Job) element2;
        kotlin.jvm.internal.Intrinsics.checkNotNull(element, "");
        kotlinx.coroutines.Job transitiveCoroutineParent = transitiveCoroutineParent((kotlinx.coroutines.Job) element, job);
        if (transitiveCoroutineParent == job) {
            return job == null ? i : i + 1;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of ");
        sb.append(transitiveCoroutineParent);
        sb.append(", expected child of ");
        sb.append(job);
        sb.append(".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'");
        throw new java.lang.IllegalStateException(sb.toString().toString());
    }
}
