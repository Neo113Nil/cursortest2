package kotlinx.coroutines.flow;

@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\u001a#\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001aG\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\u0007\u001a\u001e\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0005\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\u0002\u0010\b\u001a=\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\t*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n¢\u0006\u0004\b\u000b\u0010\f\u001ac\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\r0\n2&\u0010\u000e\u001a\"\u0012\u000b\u0012\t\u0018\u00010\r¢\u0006\u0002\b\u0005\u0012\u000b\u0012\t\u0018\u00010\r¢\u0006\u0002\b\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\"$\u0010\u0012\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\r0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011\"*\u0010\u0015\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"T", "Lkotlinx/coroutines/flow/Flow;", "distinctUntilChanged", "(Lkotlinx/coroutines/flow/Flow;)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "", "p0", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "K", "Lkotlin/Function1;", "distinctUntilChangedBy", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/Flow;", "", "p1", "getHighResolutionOutputSizeshNQ4ISI", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function2;", "getHighSpeedVideoSizes"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes3.dex */
final /* synthetic */ class FlowKt__DistinctKt {
    private static final kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Object> getHighResolutionOutputSizeshNQ4ISI = new kotlin.jvm.functions.Function1() { // from class: kotlinx.coroutines.flow.FlowKt__DistinctKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return kotlinx.coroutines.flow.FlowKt__DistinctKt.Camera2StreamConfigurationMap(obj);
        }
    };
    private static final kotlin.jvm.functions.Function2<java.lang.Object, java.lang.Object, java.lang.Boolean> getHighSpeedVideoFpsRanges = new kotlin.jvm.functions.Function2() { // from class: kotlinx.coroutines.flow.FlowKt__DistinctKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            boolean areEqual;
            areEqual = kotlin.jvm.internal.Intrinsics.areEqual(obj, obj2);
            return java.lang.Boolean.valueOf(areEqual);
        }
    };

    public static /* synthetic */ java.lang.Object Camera2StreamConfigurationMap(java.lang.Object obj) {
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> kotlinx.coroutines.flow.Flow<T> distinctUntilChanged(kotlinx.coroutines.flow.Flow<? extends T> flow) {
        return flow instanceof kotlinx.coroutines.flow.StateFlow ? flow : getHighResolutionOutputSizeshNQ4ISI(flow, getHighResolutionOutputSizeshNQ4ISI, getHighSpeedVideoFpsRanges);
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> distinctUntilChanged(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.jvm.functions.Function2<? super T, ? super T, java.lang.Boolean> function2) {
        kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Object> function1 = getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(function2, "");
        return getHighResolutionOutputSizeshNQ4ISI(flow, function1, (kotlin.jvm.functions.Function2) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2));
    }

    public static final <T, K> kotlinx.coroutines.flow.Flow<T> distinctUntilChangedBy(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.jvm.functions.Function1<? super T, ? extends K> function1) {
        return getHighResolutionOutputSizeshNQ4ISI(flow, function1, getHighSpeedVideoFpsRanges);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> kotlinx.coroutines.flow.Flow<T> getHighResolutionOutputSizeshNQ4ISI(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Object> function1, kotlin.jvm.functions.Function2<java.lang.Object, java.lang.Object, java.lang.Boolean> function2) {
        if (flow instanceof kotlinx.coroutines.flow.DistinctFlowImpl) {
            kotlinx.coroutines.flow.DistinctFlowImpl distinctFlowImpl = (kotlinx.coroutines.flow.DistinctFlowImpl) flow;
            if (distinctFlowImpl.getHighSpeedVideoFpsRanges == function1 && distinctFlowImpl.getHighSpeedVideoSizes == function2) {
                return flow;
            }
        }
        return new kotlinx.coroutines.flow.DistinctFlowImpl(flow, function1, function2);
    }
}
