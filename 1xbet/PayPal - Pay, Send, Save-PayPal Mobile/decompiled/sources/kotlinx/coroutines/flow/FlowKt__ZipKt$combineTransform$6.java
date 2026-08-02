package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [R] */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {2, 1, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6", f = "Zip.kt", i = {}, l = {247}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
public final class FlowKt__ZipKt$combineTransform$6<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super R>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T[], kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlinx.coroutines.flow.Flow<T>[] getHighSpeedVideoFpsRangesFor;

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6$1, reason: invalid class name */
    public static final class AnonymousClass1<T> implements kotlin.jvm.functions.Function0<T[]> {
        final /* synthetic */ kotlinx.coroutines.flow.Flow<T>[] getHighSpeedVideoFpsRanges;

        @Override // kotlin.jvm.functions.Function0
        public final T[] invoke() {
            int length = this.getHighSpeedVideoFpsRanges.length;
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(0, "T?");
            return (T[]) new java.lang.Object[length];
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(kotlinx.coroutines.flow.Flow<? extends T>[] flowArr) {
            this.getHighSpeedVideoFpsRanges = flowArr;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0006\b\u0001\u0010\u0003\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006H\n"}, d2 = {"<anonymous>", "", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "T", "Lkotlinx/coroutines/flow/FlowCollector;", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 176)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6$2", f = "Zip.kt", i = {}, l = {247}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6$2, reason: invalid class name */
    public static final class AnonymousClass2<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T[], kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges;
        /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T[], kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoFpsRanges;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object[] objArr = (java.lang.Object[]) this.getHighSpeedVideoFpsRangesFor;
                kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T[], kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function3 = this.getHighSpeedVideoSizes;
                this.getHighResolutionOutputSizeshNQ4ISI = null;
                this.getHighSpeedVideoFpsRanges = 1;
                if (function3.invoke(flowCollector, objArr, this) == coroutine_suspended) {
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

        public final java.lang.Object invokeSuspend$$forInline(java.lang.Object obj) {
            this.getHighSpeedVideoSizes.invoke((kotlinx.coroutines.flow.FlowCollector) this.getHighResolutionOutputSizeshNQ4ISI, (java.lang.Object[]) this.getHighSpeedVideoFpsRangesFor, this);
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super R> flowCollector, T[] tArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            kotlin.jvm.internal.Intrinsics.needClassReification();
            kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6.AnonymousClass2 anonymousClass2 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6.AnonymousClass2(this.getHighSpeedVideoSizes, continuation);
            anonymousClass2.getHighResolutionOutputSizeshNQ4ISI = flowCollector;
            anonymousClass2.getHighSpeedVideoFpsRangesFor = tArr;
            return anonymousClass2.invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T[], ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6.AnonymousClass2> continuation) {
            super(3, continuation);
            this.getHighSpeedVideoSizes = function3;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getHighResolutionOutputSizeshNQ4ISI;
            kotlinx.coroutines.flow.Flow<T>[] flowArr = this.getHighSpeedVideoFpsRangesFor;
            kotlin.jvm.internal.Intrinsics.needClassReification();
            kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6.AnonymousClass1 anonymousClass1 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor);
            kotlin.jvm.internal.Intrinsics.needClassReification();
            this.Camera2StreamConfigurationMap = 1;
            if (kotlinx.coroutines.flow.internal.CombineKt.combineInternal(flowCollector, flowArr, anonymousClass1, new kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6.AnonymousClass2(this.getHighSpeedVideoFpsRanges, null), this) == coroutine_suspended) {
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

    public final java.lang.Object invokeSuspend$$forInline(java.lang.Object obj) {
        kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getHighResolutionOutputSizeshNQ4ISI;
        kotlinx.coroutines.flow.Flow<T>[] flowArr = this.getHighSpeedVideoFpsRangesFor;
        kotlin.jvm.internal.Intrinsics.needClassReification();
        kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6.AnonymousClass1 anonymousClass1 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor);
        kotlin.jvm.internal.Intrinsics.needClassReification();
        kotlinx.coroutines.flow.internal.CombineKt.combineInternal(flowCollector, flowArr, anonymousClass1, new kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6.AnonymousClass2(this.getHighSpeedVideoFpsRanges, null), this);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super R> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6 flowKt__ZipKt$combineTransform$6 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
        flowKt__ZipKt$combineTransform$6.getHighResolutionOutputSizeshNQ4ISI = obj;
        return flowKt__ZipKt$combineTransform$6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ZipKt$combineTransform$6(kotlinx.coroutines.flow.Flow<? extends T>[] flowArr, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T[], ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = flowArr;
        this.getHighSpeedVideoFpsRanges = function3;
    }
}
