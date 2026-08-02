package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001ag\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u000122\u0010\b\u001a.\b\u0001\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b\u0005\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004H\u0000¢\u0006\u0004\b\t\u0010\n\u001aY\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000222\u0010\b\u001a.\b\u0001\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0005\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001ae\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u000228\u0010\u0010\u001a4\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0002\b\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\f\u001a`\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022/\b\u0004\u0010\u0010\u001a)\b\u0001\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0005\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0012H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001aZ\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022)\b\u0004\u0010\u0010\u001a#\b\u0001\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0012H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0014\u001aw\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0002\"\u0004\b\u0000\u0010\u0016\"\u0004\b\u0001\u0010\u0017\"\u0004\b\u0002\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u000225\b\u0004\u0010\u0010\u001a/\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\t\u0012\u00070\u001a¢\u0006\u0002\b\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0019H\u0080H¢\u0006\u0004\b\u001b\u0010\u001c\"\u0014\u0010\u001f\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"T", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlinx/coroutines/flow/Flow;", "initial", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "Lkotlin/coroutines/Continuation;", "", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "simpleScan", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "simpleRunningReduce", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lkotlin/ExtensionFunctionType;", "transform", "simpleTransformLatest", "Lkotlin/Function2;", "simpleFlatMapLatest", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "simpleMapLatest", "T1", "T2", "otherFlow", "Lkotlin/Function4;", "Landroidx/paging/CombineSource;", "combineWithoutBatching", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/Object;", "getHighSpeedVideoSizes"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FlowExtKt {
    private static final java.lang.Object getHighSpeedVideoFpsRangesFor = new java.lang.Object();

    public static final <T, R> kotlinx.coroutines.flow.Flow<R> simpleScan(kotlinx.coroutines.flow.Flow<? extends T> flow, R r, kotlin.jvm.functions.Function3<? super R, ? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function3, "");
        return kotlinx.coroutines.flow.FlowKt.flow(new androidx.paging.FlowExtKt$simpleScan$1(r, flow, function3, null));
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> simpleRunningReduce(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.jvm.functions.Function3<? super T, ? super T, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function3, "");
        return kotlinx.coroutines.flow.FlowKt.flow(new androidx.paging.FlowExtKt$simpleRunningReduce$1(flow, function3, null));
    }

    public static final <T, R> kotlinx.coroutines.flow.Flow<R> simpleTransformLatest(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function3, "");
        return androidx.paging.SimpleChannelFlowKt.simpleChannelFlow(new androidx.paging.FlowExtKt$simpleTransformLatest$1(flow, function3, null));
    }

    public static final <T, R> kotlinx.coroutines.flow.Flow<R> simpleFlatMapLatest(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends R>>, ? extends java.lang.Object> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        return simpleTransformLatest(flow, new androidx.paging.FlowExtKt$simpleFlatMapLatest$1(function2, null));
    }

    public static final <T, R> kotlinx.coroutines.flow.Flow<R> simpleMapLatest(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        return simpleTransformLatest(flow, new androidx.paging.FlowExtKt$simpleMapLatest$1(function2, null));
    }

    public static final <T1, T2, R> java.lang.Object combineWithoutBatching(kotlinx.coroutines.flow.Flow<? extends T1> flow, kotlinx.coroutines.flow.Flow<? extends T2> flow2, kotlin.jvm.functions.Function4<? super T1, ? super T2, ? super androidx.paging.CombineSource, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function4, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends R>> continuation) {
        return androidx.paging.SimpleChannelFlowKt.simpleChannelFlow(new androidx.paging.FlowExtKt$combineWithoutBatching$2(flow, flow2, function4, null));
    }
}
