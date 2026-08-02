package androidx.paging;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u0001H\u00012\b\u0010\u0004\u001a\u0004\u0018\u0001H\u0001H\n"}, d2 = {"<anonymous>", "T", "", "before", "<unused var>"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.PagingDataTransforms__PagingDataTransformsKt$insertHeaderItem$1", f = "PagingDataTransforms.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes7.dex */
final class PagingDataTransforms__PagingDataTransformsKt$insertHeaderItem$1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<T, T, kotlin.coroutines.Continuation<? super T>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ T getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (this.Camera2StreamConfigurationMap == null) {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }
        return null;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        androidx.paging.PagingDataTransforms__PagingDataTransformsKt$insertHeaderItem$1 pagingDataTransforms__PagingDataTransformsKt$insertHeaderItem$1 = new androidx.paging.PagingDataTransforms__PagingDataTransformsKt$insertHeaderItem$1(this.getHighResolutionOutputSizeshNQ4ISI, (kotlin.coroutines.Continuation) obj3);
        pagingDataTransforms__PagingDataTransformsKt$insertHeaderItem$1.Camera2StreamConfigurationMap = obj;
        return pagingDataTransforms__PagingDataTransformsKt$insertHeaderItem$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PagingDataTransforms__PagingDataTransformsKt$insertHeaderItem$1(T t, kotlin.coroutines.Continuation<? super androidx.paging.PagingDataTransforms__PagingDataTransformsKt$insertHeaderItem$1> continuation) {
        super(3, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = t;
    }
}
