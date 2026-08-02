package coil3.content;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class NetworkFetcher$fetch$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super coil3.fetch.FetchResult>, java.lang.Object>, kotlin.coroutines.jvm.internal.SuspendFunction {
    @Override // kotlin.jvm.functions.Function1
    /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super coil3.fetch.FetchResult> continuation) {
        java.lang.Object Camera2StreamConfigurationMap;
        Camera2StreamConfigurationMap = ((coil3.content.NetworkFetcher) this.receiver).Camera2StreamConfigurationMap(continuation);
        return Camera2StreamConfigurationMap;
    }

    NetworkFetcher$fetch$2(java.lang.Object obj) {
        super(1, obj, coil3.content.NetworkFetcher.class, "Camera2StreamConfigurationMap", "Camera2StreamConfigurationMap(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }
}
