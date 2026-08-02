package androidx.paging;

/* JADX INFO: Add missing generic type declarations: [R, T] */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002\"\b\b\u0001\u0010\u0003*\u0002H\u00012\b\u0010\u0004\u001a\u0004\u0018\u0001H\u00032\b\u0010\u0005\u001a\u0004\u0018\u0001H\u0003H\n"}, d2 = {"<anonymous>", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "", "T", "before", "after"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$insertSeparators$1", f = "PagingDataTransforms.jvm.kt", i = {}, l = {176}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes7.dex */
final class PagingDataTransforms__PagingDataTransforms_jvmKt$insertSeparators$1<R, T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<T, T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function2<T, T, R> getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.util.concurrent.Executor getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u0003H\n"}, d2 = {"<anonymous>", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$insertSeparators$1$1", f = "PagingDataTransforms.jvm.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$insertSeparators$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super R>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function2<T, T, R> getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges;
        final /* synthetic */ T getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ T getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoFpsRanges != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return this.getHighResolutionOutputSizeshNQ4ISI.invoke(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes);
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, java.lang.Object obj) {
            return ((androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$insertSeparators$1.AnonymousClass1) create(coroutineScope, (kotlin.coroutines.Continuation) obj)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$insertSeparators$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlin.jvm.functions.Function2<? super T, ? super T, ? extends R> function2, T t, T t2, kotlin.coroutines.Continuation<? super androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$insertSeparators$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighResolutionOutputSizeshNQ4ISI = function2;
            this.getHighSpeedVideoFpsRangesFor = t;
            this.getHighSpeedVideoSizes = t2;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.Object obj2 = this.Camera2StreamConfigurationMap;
        java.lang.Object obj3 = this.getHighSpeedVideoFpsRangesFor;
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoFpsRanges = 1;
        java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.ExecutorsKt.from(this.getHighSpeedVideoSizes), new androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$insertSeparators$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, obj2, obj3, null), this);
        return withContext == coroutine_suspended ? coroutine_suspended : withContext;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$insertSeparators$1 pagingDataTransforms__PagingDataTransforms_jvmKt$insertSeparators$1 = new androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$insertSeparators$1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, (kotlin.coroutines.Continuation) obj3);
        pagingDataTransforms__PagingDataTransforms_jvmKt$insertSeparators$1.Camera2StreamConfigurationMap = obj;
        pagingDataTransforms__PagingDataTransforms_jvmKt$insertSeparators$1.getHighSpeedVideoFpsRangesFor = obj2;
        return pagingDataTransforms__PagingDataTransforms_jvmKt$insertSeparators$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PagingDataTransforms__PagingDataTransforms_jvmKt$insertSeparators$1(java.util.concurrent.Executor executor, kotlin.jvm.functions.Function2<? super T, ? super T, ? extends R> function2, kotlin.coroutines.Continuation<? super androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$insertSeparators$1> continuation) {
        super(3, continuation);
        this.getHighSpeedVideoSizes = executor;
        this.getHighResolutionOutputSizeshNQ4ISI = function2;
    }
}
