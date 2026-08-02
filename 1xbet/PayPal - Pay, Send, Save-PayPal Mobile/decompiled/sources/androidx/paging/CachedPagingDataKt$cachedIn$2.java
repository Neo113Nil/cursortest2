package androidx.paging;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001H\n"}, d2 = {"<anonymous>", "Landroidx/paging/MulticastedPagingData;", "T", "", "prev", io.ktor.http.LinkHeader.Rel.Next}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.CachedPagingDataKt$cachedIn$2", f = "CachedPagingData.kt", i = {0}, l = {99}, m = "invokeSuspend", n = {io.ktor.http.LinkHeader.Rel.Next}, s = {"L$0"}, v = 1)
/* loaded from: classes7.dex */
final class CachedPagingDataKt$cachedIn$2<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<androidx.paging.MulticastedPagingData<T>, androidx.paging.MulticastedPagingData<T>, kotlin.coroutines.Continuation<? super androidx.paging.MulticastedPagingData<T>>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.paging.MulticastedPagingData multicastedPagingData = (androidx.paging.MulticastedPagingData) this.getHighSpeedVideoFpsRangesFor;
            kotlin.ResultKt.throwOnFailure(obj);
            return multicastedPagingData;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        androidx.paging.MulticastedPagingData multicastedPagingData2 = (androidx.paging.MulticastedPagingData) this.getHighSpeedVideoFpsRangesFor;
        androidx.paging.MulticastedPagingData multicastedPagingData3 = (androidx.paging.MulticastedPagingData) this.getHighSpeedVideoSizes;
        this.getHighSpeedVideoFpsRangesFor = multicastedPagingData3;
        this.Camera2StreamConfigurationMap = 1;
        multicastedPagingData2.getHighSpeedVideoFpsRanges.close();
        return kotlin.Unit.INSTANCE == coroutine_suspended ? coroutine_suspended : multicastedPagingData3;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        androidx.paging.CachedPagingDataKt$cachedIn$2 cachedPagingDataKt$cachedIn$2 = new androidx.paging.CachedPagingDataKt$cachedIn$2((kotlin.coroutines.Continuation) obj3);
        cachedPagingDataKt$cachedIn$2.getHighSpeedVideoFpsRangesFor = (androidx.paging.MulticastedPagingData) obj;
        cachedPagingDataKt$cachedIn$2.getHighSpeedVideoSizes = (androidx.paging.MulticastedPagingData) obj2;
        return cachedPagingDataKt$cachedIn$2.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    CachedPagingDataKt$cachedIn$2(kotlin.coroutines.Continuation<? super androidx.paging.CachedPagingDataKt$cachedIn$2> continuation) {
        super(3, continuation);
    }
}
