package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aR\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012-\u0010\t\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\bH\u0000¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"T", "Lkotlinx/coroutines/Job;", "controller", "Lkotlin/Function2;", "Landroidx/paging/SimpleProducerScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "Lkotlinx/coroutines/flow/Flow;", "cancelableChannelFlow", "(Lkotlinx/coroutines/Job;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CancelableChannelFlowKt {
    public static final <T> kotlinx.coroutines.flow.Flow<T> cancelableChannelFlow(kotlinx.coroutines.Job job, kotlin.jvm.functions.Function2<? super androidx.paging.SimpleProducerScope<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(job, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        return androidx.paging.SimpleChannelFlowKt.simpleChannelFlow(new androidx.paging.CancelableChannelFlowKt$cancelableChannelFlow$1(job, function2, null));
    }
}
