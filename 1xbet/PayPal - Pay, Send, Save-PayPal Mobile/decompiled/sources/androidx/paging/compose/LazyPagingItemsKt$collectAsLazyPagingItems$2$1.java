package androidx.paging.compose;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$2$1", f = "LazyPagingItems.kt", i = {}, l = {202, 204}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes7.dex */
final class LazyPagingItemsKt$collectAsLazyPagingItems$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.paging.compose.LazyPagingItems<T> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.coroutines.CoroutineContext getHighSpeedVideoFpsRanges;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        if (r5.getHighResolutionOutputSizeshNQ4ISI.collectLoadState$paging_compose(r5) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r5.getHighSpeedVideoFpsRanges, new androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$2$1.AnonymousClass1(r5.getHighResolutionOutputSizeshNQ4ISI, null), r5) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, kotlin.coroutines.EmptyCoroutineContext.INSTANCE)) {
                this.Camera2StreamConfigurationMap = 1;
            } else {
                this.Camera2StreamConfigurationMap = 2;
            }
        } else {
            if (i != 1 && i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$2$1$1", f = "LazyPagingItems.kt", i = {}, l = {204}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ androidx.paging.compose.LazyPagingItems<T> getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoFpsRanges;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighSpeedVideoFpsRanges = 1;
                if (this.getHighResolutionOutputSizeshNQ4ISI.collectLoadState$paging_compose(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$2$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$2$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(androidx.paging.compose.LazyPagingItems<T> lazyPagingItems, kotlin.coroutines.Continuation<? super androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$2$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighResolutionOutputSizeshNQ4ISI = lazyPagingItems;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$2$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyPagingItemsKt$collectAsLazyPagingItems$2$1(kotlin.coroutines.CoroutineContext coroutineContext, androidx.paging.compose.LazyPagingItems<T> lazyPagingItems, kotlin.coroutines.Continuation<? super androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = coroutineContext;
        this.getHighResolutionOutputSizeshNQ4ISI = lazyPagingItems;
    }
}
