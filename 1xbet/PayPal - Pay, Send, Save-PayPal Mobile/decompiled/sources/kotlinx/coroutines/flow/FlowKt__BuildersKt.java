package kotlinx.coroutines.flow;

@kotlin.Metadata(d1 = {"\u0000t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aH\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002-\u0010\u0007\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\f\u0010\r\u001a3\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000e¢\u0006\u0004\b\f\u0010\u000f\u001a#\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0004\b\f\u0010\u0011\u001a#\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b\f\u0010\u0013\u001a#\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\u0004\b\f\u0010\u0015\u001a-\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0016\"\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0019\u001a\u0019\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a#\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0016¢\u0006\u0004\b\f\u0010\u0018\u001a\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u001d0\b*\u00020\u001c¢\u0006\u0004\b\f\u0010\u001e\u001a\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020 0\b*\u00020\u001f¢\u0006\u0004\b\f\u0010!\u001a\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u001d0\b*\u00020\"¢\u0006\u0004\b\f\u0010#\u001a\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020 0\b*\u00020$¢\u0006\u0004\b\f\u0010%\u001aH\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002-\u0010\u0007\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006¢\u0006\u0004\b'\u0010\n\u001aH\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002-\u0010\u0007\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006¢\u0006\u0004\b(\u0010\n"}, d2 = {"T", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "p0", "Lkotlinx/coroutines/flow/Flow;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, "(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Function0;", "asFlow", "(Lkotlin/jvm/functions/Function0;)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/Flow;", "", "(Ljava/lang/Iterable;)Lkotlinx/coroutines/flow/Flow;", "", "(Ljava/util/Iterator;)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/sequences/Sequence;", "(Lkotlin/sequences/Sequence;)Lkotlinx/coroutines/flow/Flow;", "", "flowOf", "([Ljava/lang/Object;)Lkotlinx/coroutines/flow/Flow;", "(Ljava/lang/Object;)Lkotlinx/coroutines/flow/Flow;", "emptyFlow", "()Lkotlinx/coroutines/flow/Flow;", "", "", "([I)Lkotlinx/coroutines/flow/Flow;", "", "", "([J)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/ranges/IntRange;", "(Lkotlin/ranges/IntRange;)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/ranges/LongRange;", "(Lkotlin/ranges/LongRange;)Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/channels/ProducerScope;", "channelFlow", "callbackFlow"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes3.dex */
final /* synthetic */ class FlowKt__BuildersKt {
    public static final <T> kotlinx.coroutines.flow.Flow<T> flow(kotlin.jvm.functions.Function2<? super kotlinx.coroutines.flow.FlowCollector<? super T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
        return new kotlinx.coroutines.flow.SafeFlow(function2);
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> emptyFlow() {
        return kotlinx.coroutines.flow.EmptyFlow.INSTANCE;
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> channelFlow(kotlin.jvm.functions.Function2<? super kotlinx.coroutines.channels.ProducerScope<? super T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
        return new kotlinx.coroutines.flow.ChannelFlowBuilder(function2, null, 0, null, 14, null);
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> callbackFlow(kotlin.jvm.functions.Function2<? super kotlinx.coroutines.channels.ProducerScope<? super T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
        return new kotlinx.coroutines.flow.CallbackFlowBuilder(function2, null, 0, null, 14, null);
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> asFlow(final kotlin.jvm.functions.Function0<? extends T> function0) {
        return new kotlinx.coroutines.flow.Flow<T>() { // from class: kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$1
            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                java.lang.Object emit = flowCollector.emit((java.lang.Object) kotlin.jvm.functions.Function0.this.invoke(), continuation);
                return emit == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : kotlin.Unit.INSTANCE;
            }
        };
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> asFlow(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function1) {
        return new kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2(function1);
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> asFlow(java.lang.Iterable<? extends T> iterable) {
        return new kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3(iterable);
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> asFlow(java.util.Iterator<? extends T> it) {
        return new kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$4(it);
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> asFlow(kotlin.sequences.Sequence<? extends T> sequence) {
        return new kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5(sequence);
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> flowOf(T... tArr) {
        return new kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1(tArr);
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> flowOf(final T t) {
        return new kotlinx.coroutines.flow.Flow<T>() { // from class: kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2
            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                java.lang.Object emit = flowCollector.emit((java.lang.Object) t, continuation);
                return emit == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : kotlin.Unit.INSTANCE;
            }
        };
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> asFlow(T[] tArr) {
        return new kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6(tArr);
    }

    public static final kotlinx.coroutines.flow.Flow<java.lang.Integer> asFlow(int[] iArr) {
        return new kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7(iArr);
    }

    public static final kotlinx.coroutines.flow.Flow<java.lang.Long> asFlow(long[] jArr) {
        return new kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8(jArr);
    }

    public static final kotlinx.coroutines.flow.Flow<java.lang.Integer> asFlow(kotlin.ranges.IntRange intRange) {
        return new kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$9(intRange);
    }

    public static final kotlinx.coroutines.flow.Flow<java.lang.Long> asFlow(kotlin.ranges.LongRange longRange) {
        return new kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10(longRange);
    }
}
