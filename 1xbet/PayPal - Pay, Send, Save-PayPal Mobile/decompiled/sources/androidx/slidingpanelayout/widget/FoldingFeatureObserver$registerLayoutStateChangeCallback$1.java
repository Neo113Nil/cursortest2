package androidx.slidingpanelayout.widget;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1", f = "FoldingFeatureObserver.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class FoldingFeatureObserver$registerLayoutStateChangeCallback$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ android.app.Activity getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.slidingpanelayout.widget.FoldingFeatureObserver getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.window.layout.WindowInfoTracker windowInfoTracker;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            windowInfoTracker = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges;
            final kotlinx.coroutines.flow.Flow<androidx.window.layout.WindowLayoutInfo> windowLayoutInfo = windowInfoTracker.windowLayoutInfo(this.getHighResolutionOutputSizeshNQ4ISI);
            final androidx.slidingpanelayout.widget.FoldingFeatureObserver foldingFeatureObserver = this.getHighSpeedVideoFpsRanges;
            kotlinx.coroutines.flow.Flow distinctUntilChanged = kotlinx.coroutines.flow.FlowKt.distinctUntilChanged(new kotlinx.coroutines.flow.Flow<androidx.window.layout.FoldingFeature>() { // from class: androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1

                @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¸\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/flow/FlowKt__CollectKt$collect$3;", "Lkotlinx/coroutines/flow/FlowCollector;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 6, 0}, xi = 48)
                /* renamed from: androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                public static final class AnonymousClass2 implements kotlinx.coroutines.flow.FlowCollector<androidx.window.layout.WindowLayoutInfo> {
                    final /* synthetic */ kotlinx.coroutines.flow.FlowCollector Camera2StreamConfigurationMap;
                    final /* synthetic */ androidx.slidingpanelayout.widget.FoldingFeatureObserver getHighResolutionOutputSizeshNQ4ISI;

                    public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, androidx.slidingpanelayout.widget.FoldingFeatureObserver foldingFeatureObserver) {
                        this.Camera2StreamConfigurationMap = flowCollector;
                        this.getHighResolutionOutputSizeshNQ4ISI = foldingFeatureObserver;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final java.lang.Object emit(androidx.window.layout.WindowLayoutInfo windowLayoutInfo, kotlin.coroutines.Continuation continuation) {
                        androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                        int i;
                        if (continuation instanceof androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1) {
                            anonymousClass1 = (androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1) continuation;
                            if ((anonymousClass1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.getHighSpeedVideoFpsRanges -= 2147483648;
                                java.lang.Object obj = anonymousClass1.Camera2StreamConfigurationMap;
                                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                i = anonymousClass1.getHighSpeedVideoFpsRanges;
                                if (i != 0) {
                                    kotlin.ResultKt.throwOnFailure(obj);
                                    kotlinx.coroutines.flow.FlowCollector flowCollector = this.Camera2StreamConfigurationMap;
                                    androidx.window.layout.FoldingFeature access$getFoldingFeature = androidx.slidingpanelayout.widget.FoldingFeatureObserver.access$getFoldingFeature(this.getHighResolutionOutputSizeshNQ4ISI, windowLayoutInfo);
                                    if (access$getFoldingFeature != null) {
                                        anonymousClass1.getHighSpeedVideoFpsRanges = 1;
                                        if (flowCollector.emit(access$getFoldingFeature, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    kotlin.ResultKt.throwOnFailure(obj);
                                }
                                return kotlin.Unit.INSTANCE;
                            }
                        }
                        anonymousClass1 = new androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1(continuation);
                        java.lang.Object obj2 = anonymousClass1.Camera2StreamConfigurationMap;
                        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = anonymousClass1.getHighSpeedVideoFpsRanges;
                        if (i != 0) {
                        }
                        return kotlin.Unit.INSTANCE;
                    }

                    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2", f = "FoldingFeatureObserver.kt", i = {}, l = {138}, m = "emit", n = {}, s = {})
                    /* renamed from: androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                        /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
                        int getHighSpeedVideoFpsRanges;

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                            this.Camera2StreamConfigurationMap = obj;
                            this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
                            return androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1.AnonymousClass2.this.emit(null, this);
                        }

                        public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                            super(continuation);
                        }
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super androidx.window.layout.FoldingFeature> flowCollector, kotlin.coroutines.Continuation continuation) {
                    java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1.AnonymousClass2(flowCollector, foldingFeatureObserver), continuation);
                    return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
                }
            });
            final androidx.slidingpanelayout.widget.FoldingFeatureObserver foldingFeatureObserver2 = this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoSizes = 1;
            if (distinctUntilChanged.collect(new kotlinx.coroutines.flow.FlowCollector<androidx.window.layout.FoldingFeature>() { // from class: androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$collect$1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final java.lang.Object emit(androidx.window.layout.FoldingFeature foldingFeature, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    androidx.slidingpanelayout.widget.FoldingFeatureObserver.OnFoldingFeatureChangeListener onFoldingFeatureChangeListener;
                    kotlin.Unit unit;
                    androidx.window.layout.FoldingFeature foldingFeature2 = foldingFeature;
                    onFoldingFeatureChangeListener = androidx.slidingpanelayout.widget.FoldingFeatureObserver.this.getHighSpeedVideoSizes;
                    if (onFoldingFeatureChangeListener == null) {
                        unit = null;
                    } else {
                        onFoldingFeatureChangeListener.onFoldingFeatureChange(foldingFeature2);
                        unit = kotlin.Unit.INSTANCE;
                    }
                    return unit == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? unit : kotlin.Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
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
        return ((androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FoldingFeatureObserver$registerLayoutStateChangeCallback$1(androidx.slidingpanelayout.widget.FoldingFeatureObserver foldingFeatureObserver, android.app.Activity activity, kotlin.coroutines.Continuation<? super androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = foldingFeatureObserver;
        this.getHighResolutionOutputSizeshNQ4ISI = activity;
    }
}
