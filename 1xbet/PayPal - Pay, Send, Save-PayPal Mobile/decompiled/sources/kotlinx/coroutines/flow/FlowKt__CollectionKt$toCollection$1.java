package kotlinx.coroutines.flow;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__CollectionKt", f = "Collection.kt", i = {0}, l = {22}, m = "toCollection", n = {"destination"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class FlowKt__CollectionKt$toCollection$1<T, C extends java.util.Collection<? super T>> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return kotlinx.coroutines.flow.FlowKt.toCollection(null, null, this);
    }

    FlowKt__CollectionKt$toCollection$1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__CollectionKt$toCollection$1> continuation) {
        super(continuation);
    }
}
