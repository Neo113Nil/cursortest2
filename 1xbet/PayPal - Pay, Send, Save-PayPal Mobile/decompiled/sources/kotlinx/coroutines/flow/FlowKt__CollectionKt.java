package kotlinx.coroutines.flow;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0003\u001a6\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006\u001a6\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0086@¢\u0006\u0004\b\t\u0010\n\u001a:\u0010\r\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u0010\f*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00028\u0001H\u0086@¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"T", "Lkotlinx/coroutines/flow/Flow;", "", "p0", "", "toList", "(Lkotlinx/coroutines/flow/Flow;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", "toSet", "(Lkotlinx/coroutines/flow/Flow;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "toCollection", "(Lkotlinx/coroutines/flow/Flow;Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes3.dex */
public final /* synthetic */ class FlowKt__CollectionKt {
    public static final <T> java.lang.Object toList(kotlinx.coroutines.flow.Flow<? extends T> flow, java.util.List<T> list, kotlin.coroutines.Continuation<? super java.util.List<? extends T>> continuation) {
        return kotlinx.coroutines.flow.FlowKt.toCollection(flow, list, continuation);
    }

    public static /* synthetic */ java.lang.Object toList$default(kotlinx.coroutines.flow.Flow flow, java.util.List list, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = new java.util.ArrayList();
        }
        return kotlinx.coroutines.flow.FlowKt.toList(flow, list, continuation);
    }

    public static final <T> java.lang.Object toSet(kotlinx.coroutines.flow.Flow<? extends T> flow, java.util.Set<T> set, kotlin.coroutines.Continuation<? super java.util.Set<? extends T>> continuation) {
        return kotlinx.coroutines.flow.FlowKt.toCollection(flow, set, continuation);
    }

    public static /* synthetic */ java.lang.Object toSet$default(kotlinx.coroutines.flow.Flow flow, java.util.Set set, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            set = new java.util.LinkedHashSet();
        }
        return kotlinx.coroutines.flow.FlowKt.toSet(flow, set, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T, C extends java.util.Collection<? super T>> java.lang.Object toCollection(kotlinx.coroutines.flow.Flow<? extends T> flow, final C c, kotlin.coroutines.Continuation<? super C> continuation) {
        kotlinx.coroutines.flow.FlowKt__CollectionKt$toCollection$1 flowKt__CollectionKt$toCollection$1;
        int i;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__CollectionKt$toCollection$1) {
            flowKt__CollectionKt$toCollection$1 = (kotlinx.coroutines.flow.FlowKt__CollectionKt$toCollection$1) continuation;
            if ((flowKt__CollectionKt$toCollection$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                flowKt__CollectionKt$toCollection$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = flowKt__CollectionKt$toCollection$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = flowKt__CollectionKt$toCollection$1.getHighSpeedVideoFpsRangesFor;
                if (i == 0) {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.util.Collection collection = (java.util.Collection) flowKt__CollectionKt$toCollection$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    return collection;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.flow.FlowCollector<? super java.lang.Object> flowCollector = new kotlinx.coroutines.flow.FlowCollector() { // from class: kotlinx.coroutines.flow.FlowKt__CollectionKt$toCollection$2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation2) {
                        c.add(t);
                        return kotlin.Unit.INSTANCE;
                    }
                };
                flowKt__CollectionKt$toCollection$1.Camera2StreamConfigurationMap = c;
                flowKt__CollectionKt$toCollection$1.getHighSpeedVideoFpsRangesFor = 1;
                return flow.collect(flowCollector, flowKt__CollectionKt$toCollection$1) == coroutine_suspended ? coroutine_suspended : c;
            }
        }
        flowKt__CollectionKt$toCollection$1 = new kotlinx.coroutines.flow.FlowKt__CollectionKt$toCollection$1(continuation);
        java.lang.Object obj2 = flowKt__CollectionKt$toCollection$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flowKt__CollectionKt$toCollection$1.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
        }
    }
}
