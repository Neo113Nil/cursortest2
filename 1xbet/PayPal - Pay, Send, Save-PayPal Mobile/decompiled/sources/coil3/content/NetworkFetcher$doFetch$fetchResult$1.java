package coil3.content;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcoil3/fetch/SourceFetchResult;", "networkResponse", "Lcoil3/network/NetworkResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "coil3.network.NetworkFetcher$doFetch$fetchResult$1", f = "NetworkFetcher.kt", i = {0, 1}, l = {107, 121}, m = "invokeSuspend", n = {"networkResponse", "networkResponse"}, s = {"L$0", "L$0"}, v = 1)
/* loaded from: classes.dex */
final class NetworkFetcher$doFetch$fetchResult$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<coil3.content.NetworkResponse, kotlin.coroutines.Continuation<? super coil3.fetch.SourceFetchResult>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<coil3.content.NetworkResponse> getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ coil3.content.NetworkRequest getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<coil3.disk.DiskCache.Snapshot> getHighSpeedVideoSizes;
    final /* synthetic */ coil3.content.NetworkFetcher getInputFormats;
    int getInputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00ec A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00cc  */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, coil3.network.NetworkResponse] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.internal.Ref.ObjectRef<coil3.disk.DiskCache.Snapshot> objectRef;
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        coil3.content.NetworkResponse networkResponse;
        T t;
        coil3.content.NetworkResponse networkResponse2;
        ?? highSpeedVideoFpsRangesFor;
        coil3.graphics.ImageSource highSpeedVideoSizes;
        java.lang.String str;
        coil3.content.NetworkHeaders headers;
        java.lang.Object obj2;
        okio.Buffer buffer;
        coil3.graphics.ImageSource ImageSource$default;
        java.lang.String str2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputSizeshNQ4ISI;
        java.lang.String str3 = null;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            coil3.content.NetworkResponse networkResponse3 = (coil3.content.NetworkResponse) this.Camera2StreamConfigurationMap;
            objectRef = this.getHighSpeedVideoSizes;
            this.Camera2StreamConfigurationMap = networkResponse3;
            this.getHighSpeedVideoFpsRanges = objectRef;
            this.getInputSizeshNQ4ISI = 1;
            highResolutionOutputSizeshNQ4ISI = this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI(objectRef.element, this.getHighResolutionOutputSizeshNQ4ISI.element, this.getHighSpeedVideoFpsRangesFor, networkResponse3, this);
            if (highResolutionOutputSizeshNQ4ISI != coroutine_suspended) {
                networkResponse = networkResponse3;
                t = highResolutionOutputSizeshNQ4ISI;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            networkResponse2 = (coil3.content.NetworkResponse) this.Camera2StreamConfigurationMap;
            kotlin.ResultKt.throwOnFailure(obj);
            obj2 = obj;
            buffer = (okio.Buffer) obj2;
            if (buffer.size() > 0) {
                return null;
            }
            ImageSource$default = coil3.graphics.ImageSourceKt.ImageSource$default(buffer, this.getInputFormats.Camera2StreamConfigurationMap(), null, 4, null);
            coil3.content.NetworkFetcher networkFetcher = this.getInputFormats;
            str2 = networkFetcher.getHighSpeedVideoFpsRangesFor;
            return new coil3.fetch.SourceFetchResult(ImageSource$default, networkFetcher.getMimeType(str2, networkResponse2.getHeaders().get("Content-Type")), coil3.graphics.DataSource.NETWORK);
        }
        objectRef = (kotlin.jvm.internal.Ref.ObjectRef) this.getHighSpeedVideoFpsRanges;
        networkResponse = (coil3.content.NetworkResponse) this.Camera2StreamConfigurationMap;
        kotlin.ResultKt.throwOnFailure(obj);
        t = obj;
        objectRef.element = t;
        coil3.content.NetworkFetcher networkFetcher2 = this.getInputFormats;
        coil3.content.NetworkFetcher.getHighSpeedVideoFpsRangesFor(networkResponse);
        if (this.getHighSpeedVideoSizes.element != null) {
            kotlin.jvm.internal.Ref.ObjectRef<coil3.content.NetworkResponse> objectRef2 = this.getHighResolutionOutputSizeshNQ4ISI;
            coil3.content.NetworkFetcher networkFetcher3 = this.getInputFormats;
            coil3.disk.DiskCache.Snapshot snapshot = this.getHighSpeedVideoSizes.element;
            kotlin.jvm.internal.Intrinsics.checkNotNull(snapshot);
            highSpeedVideoFpsRangesFor = networkFetcher3.getHighSpeedVideoFpsRangesFor(snapshot);
            objectRef2.element = highSpeedVideoFpsRangesFor;
            coil3.content.NetworkFetcher networkFetcher4 = this.getInputFormats;
            coil3.disk.DiskCache.Snapshot snapshot2 = this.getHighSpeedVideoSizes.element;
            kotlin.jvm.internal.Intrinsics.checkNotNull(snapshot2);
            highSpeedVideoSizes = networkFetcher4.getHighSpeedVideoSizes(snapshot2);
            coil3.content.NetworkFetcher networkFetcher5 = this.getInputFormats;
            str = networkFetcher5.getHighSpeedVideoFpsRangesFor;
            coil3.content.NetworkResponse networkResponse4 = this.getHighResolutionOutputSizeshNQ4ISI.element;
            if (networkResponse4 != null && (headers = networkResponse4.getHeaders()) != null) {
                str3 = headers.get("Content-Type");
            }
            return new coil3.fetch.SourceFetchResult(highSpeedVideoSizes, networkFetcher5.getMimeType(str, str3), coil3.graphics.DataSource.NETWORK);
        }
        this.Camera2StreamConfigurationMap = networkResponse;
        this.getHighSpeedVideoFpsRanges = null;
        this.getInputSizeshNQ4ISI = 2;
        java.lang.Object readBuffer = coil3.content.internal.UtilsKt.readBuffer(coil3.content.internal.UtilsKt.requireBody(networkResponse), this);
        if (readBuffer != coroutine_suspended) {
            networkResponse2 = networkResponse;
            obj2 = readBuffer;
            buffer = (okio.Buffer) obj2;
            if (buffer.size() > 0) {
            }
        }
        return coroutine_suspended;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(coil3.content.NetworkResponse networkResponse, kotlin.coroutines.Continuation<? super coil3.fetch.SourceFetchResult> continuation) {
        return ((coil3.content.NetworkFetcher$doFetch$fetchResult$1) create(networkResponse, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        coil3.content.NetworkFetcher$doFetch$fetchResult$1 networkFetcher$doFetch$fetchResult$1 = new coil3.content.NetworkFetcher$doFetch$fetchResult$1(this.getHighSpeedVideoSizes, this.getInputFormats, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
        networkFetcher$doFetch$fetchResult$1.Camera2StreamConfigurationMap = obj;
        return networkFetcher$doFetch$fetchResult$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NetworkFetcher$doFetch$fetchResult$1(kotlin.jvm.internal.Ref.ObjectRef<coil3.disk.DiskCache.Snapshot> objectRef, coil3.content.NetworkFetcher networkFetcher, kotlin.jvm.internal.Ref.ObjectRef<coil3.content.NetworkResponse> objectRef2, coil3.content.NetworkRequest networkRequest, kotlin.coroutines.Continuation<? super coil3.content.NetworkFetcher$doFetch$fetchResult$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = objectRef;
        this.getInputFormats = networkFetcher;
        this.getHighResolutionOutputSizeshNQ4ISI = objectRef2;
        this.getHighSpeedVideoFpsRangesFor = networkRequest;
    }
}
