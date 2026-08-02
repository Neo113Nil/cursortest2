package androidx.camera.camera2.impl;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u0001*\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "Landroid/view/Surface;", "kotlin.jvm.PlatformType", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.impl.UseCaseSurfaceManager$getSurfaces$2", f = "UseCaseSurfaceManager.kt", i = {}, l = {258}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class UseCaseSurfaceManager$getSurfaces$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.util.List<android.view.Surface>>, java.lang.Object> {
    final /* synthetic */ java.util.List<androidx.camera.core.impl.DeferrableSurface> getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.List<androidx.camera.core.impl.DeferrableSurface> list = this.getHighResolutionOutputSizeshNQ4ISI;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(((androidx.camera.core.impl.DeferrableSurface) it.next()).getSurface()));
        }
        com.google.common.util.concurrent.ListenableFuture successfulAsList = androidx.camera.core.impl.utils.futures.Futures.successfulAsList(arrayList);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(successfulAsList, "");
        this.getHighSpeedVideoFpsRangesFor = 1;
        java.lang.Object await = androidx.concurrent.futures.ListenableFutureKt.await(successfulAsList, this);
        return await == coroutine_suspended ? coroutine_suspended : await;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.util.List<android.view.Surface>> continuation) {
        return ((androidx.camera.camera2.impl.UseCaseSurfaceManager$getSurfaces$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.impl.UseCaseSurfaceManager$getSurfaces$2(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    UseCaseSurfaceManager$getSurfaces$2(java.util.List<? extends androidx.camera.core.impl.DeferrableSurface> list, kotlin.coroutines.Continuation<? super androidx.camera.camera2.impl.UseCaseSurfaceManager$getSurfaces$2> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = list;
    }
}
