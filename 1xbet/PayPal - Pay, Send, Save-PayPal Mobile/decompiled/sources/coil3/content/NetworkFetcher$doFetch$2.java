package coil3.content;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcoil3/fetch/SourceFetchResult;", "response", "Lcoil3/network/NetworkResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "coil3.network.NetworkFetcher$doFetch$2", f = "NetworkFetcher.kt", i = {0}, l = {138}, m = "invokeSuspend", n = {"response"}, s = {"L$0"}, v = 1)
/* loaded from: classes.dex */
final class NetworkFetcher$doFetch$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<coil3.content.NetworkResponse, kotlin.coroutines.Continuation<? super coil3.fetch.SourceFetchResult>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ coil3.content.NetworkFetcher getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        coil3.content.NetworkResponse networkResponse;
        java.lang.String str;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            coil3.content.NetworkResponse networkResponse2 = (coil3.content.NetworkResponse) this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = networkResponse2;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            java.lang.Object access$toImageSource = coil3.content.NetworkFetcher.access$toImageSource(this.getHighSpeedVideoFpsRanges, coil3.content.internal.UtilsKt.requireBody(networkResponse2), this);
            if (access$toImageSource == coroutine_suspended) {
                return coroutine_suspended;
            }
            networkResponse = networkResponse2;
            obj = access$toImageSource;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            networkResponse = (coil3.content.NetworkResponse) this.getHighSpeedVideoSizes;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        coil3.content.NetworkFetcher networkFetcher = this.getHighSpeedVideoFpsRanges;
        str = networkFetcher.getHighSpeedVideoFpsRangesFor;
        return new coil3.fetch.SourceFetchResult((coil3.graphics.ImageSource) obj, networkFetcher.getMimeType(str, networkResponse.getHeaders().get("Content-Type")), coil3.graphics.DataSource.NETWORK);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(coil3.content.NetworkResponse networkResponse, kotlin.coroutines.Continuation<? super coil3.fetch.SourceFetchResult> continuation) {
        return ((coil3.content.NetworkFetcher$doFetch$2) create(networkResponse, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        coil3.content.NetworkFetcher$doFetch$2 networkFetcher$doFetch$2 = new coil3.content.NetworkFetcher$doFetch$2(this.getHighSpeedVideoFpsRanges, continuation);
        networkFetcher$doFetch$2.getHighSpeedVideoSizes = obj;
        return networkFetcher$doFetch$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NetworkFetcher$doFetch$2(coil3.content.NetworkFetcher networkFetcher, kotlin.coroutines.Continuation<? super coil3.content.NetworkFetcher$doFetch$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = networkFetcher;
    }
}
