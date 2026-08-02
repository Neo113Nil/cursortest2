package androidx.paging;

/* JADX INFO: Add missing generic type declarations: [R] */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Landroidx/paging/PageEvent;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$1$1", f = "PagingDataTransforms.jvm.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes7.dex */
final class PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$1$1<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super androidx.paging.PageEvent<R>>, java.lang.Object> {
    final /* synthetic */ androidx.paging.PageEvent<T> Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function1<T, java.lang.Iterable<R>> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00032\u0006\u0010\u0005\u001a\u0002H\u0004H\n"}, d2 = {"<anonymous>", "", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "", "T", "it"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$1$1$1", f = "PagingDataTransforms.jvm.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$1$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super java.lang.Iterable<? extends R>>, java.lang.Object> {
        /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ kotlin.jvm.functions.Function1<T, java.lang.Iterable<R>> getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoSizes != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return this.getHighSpeedVideoFpsRangesFor.invoke(this.getHighResolutionOutputSizeshNQ4ISI);
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return ((androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$1$1.AnonymousClass1) create(obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$1$1.AnonymousClass1 anonymousClass1 = new androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$1$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, continuation);
            anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Iterable<? extends R>> function1, kotlin.coroutines.Continuation<? super androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$1$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRangesFor = function1;
        }
    }

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
        this.getHighSpeedVideoFpsRangesFor = 1;
        java.lang.Object flatMap = this.Camera2StreamConfigurationMap.flatMap(new androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$1$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, null), this);
        return flatMap == coroutine_suspended ? coroutine_suspended : flatMap;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, java.lang.Object obj) {
        return ((androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$1$1) create(coroutineScope, (kotlin.coroutines.Continuation) obj)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$1$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$1$1(androidx.paging.PageEvent<T> pageEvent, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Iterable<? extends R>> function1, kotlin.coroutines.Continuation<? super androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$1$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = pageEvent;
        this.getHighSpeedVideoFpsRanges = function1;
    }
}
