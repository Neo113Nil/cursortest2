package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aJ\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002-\u0010\u0007\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006H\u0000¢\u0006\u0004\b\t\u0010\n"}, d2 = {"T", "Lkotlin/Function2;", "Landroidx/paging/SimpleProducerScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "Lkotlinx/coroutines/flow/Flow;", "simpleChannelFlow", "(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SimpleChannelFlowKt {
    public static final <T> kotlinx.coroutines.flow.Flow<T> simpleChannelFlow(kotlin.jvm.functions.Function2<? super androidx.paging.SimpleProducerScope<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        return kotlinx.coroutines.flow.FlowKt__ContextKt.buffer$default(kotlinx.coroutines.flow.FlowKt.flow(new androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1(function2, null)), -2, null, 2, null);
    }
}
