package androidx.paging;

/* JADX INFO: Add missing generic type declarations: [R] */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Landroidx/paging/PageEvent;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$map$1$1", f = "PagingDataTransforms.jvm.kt", i = {}, l = {38}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes7.dex */
final class PagingDataTransforms__PagingDataTransforms_jvmKt$map$1$1<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super androidx.paging.PageEvent<R>>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function1<T, R> Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.paging.PageEvent<T> getHighSpeedVideoSizes;

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002\"\b\b\u0001\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u0002H\u0003H\n"}, d2 = {"<anonymous>", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "", "T", "it"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$map$1$1$1", f = "PagingDataTransforms.jvm.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$map$1$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> {
        int getHighResolutionOutputSizeshNQ4ISI;
        /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ kotlin.jvm.functions.Function1<T, R> getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return this.getHighSpeedVideoSizes.invoke(this.getHighSpeedVideoFpsRangesFor);
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return ((androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$map$1$1.AnonymousClass1) create(obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$map$1$1.AnonymousClass1 anonymousClass1 = new androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$map$1$1.AnonymousClass1(this.getHighSpeedVideoSizes, continuation);
            anonymousClass1.getHighSpeedVideoFpsRangesFor = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlin.jvm.functions.Function1<? super T, ? extends R> function1, kotlin.coroutines.Continuation<? super androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$map$1$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoSizes = function1;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighResolutionOutputSizeshNQ4ISI = 1;
        java.lang.Object map = this.getHighSpeedVideoSizes.map(new androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$map$1$1.AnonymousClass1(this.Camera2StreamConfigurationMap, null), this);
        return map == coroutine_suspended ? coroutine_suspended : map;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, java.lang.Object obj) {
        return ((androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$map$1$1) create(coroutineScope, (kotlin.coroutines.Continuation) obj)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$map$1$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PagingDataTransforms__PagingDataTransforms_jvmKt$map$1$1(androidx.paging.PageEvent<T> pageEvent, kotlin.jvm.functions.Function1<? super T, ? extends R> function1, kotlin.coroutines.Continuation<? super androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$map$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = pageEvent;
        this.Camera2StreamConfigurationMap = function1;
    }
}
