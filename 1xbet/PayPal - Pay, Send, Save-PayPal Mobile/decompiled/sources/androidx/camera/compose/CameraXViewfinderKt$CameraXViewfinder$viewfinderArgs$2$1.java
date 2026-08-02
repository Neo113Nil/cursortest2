package androidx.camera.compose;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/ProduceStateScope;", "Landroidx/camera/compose/ViewfinderArgs;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$viewfinderArgs$2$1", f = "CameraXViewfinder.kt", i = {}, l = {149}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class CameraXViewfinderKt$CameraXViewfinder$viewfinderArgs$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.runtime.ProduceStateScope<androidx.camera.compose.ViewfinderArgs>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.camera.core.SurfaceRequest getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.State<androidx.camera.viewfinder.core.ImplementationMode> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final androidx.compose.runtime.ProduceStateScope produceStateScope = (androidx.compose.runtime.ProduceStateScope) this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRanges.addRequestCancellationListener(new androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$viewfinderArgs$2$1$$ExternalSyntheticLambda0(), new java.lang.Runnable() { // from class: androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$viewfinderArgs$2$1$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    kotlinx.coroutines.CoroutineScopeKt.cancel$default(androidx.compose.runtime.ProduceStateScope.this, null, 1, null);
                }
            });
            final kotlinx.coroutines.flow.MutableStateFlow MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
            this.getHighSpeedVideoFpsRanges.setTransformationInfoListener(new androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$viewfinderArgs$2$1$$ExternalSyntheticLambda0(), new androidx.camera.core.SurfaceRequest.TransformationInfoListener() { // from class: androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$viewfinderArgs$2$1$$ExternalSyntheticLambda2
                @Override // androidx.camera.core.SurfaceRequest.TransformationInfoListener
                public final void onTransformationInfoUpdate(androidx.camera.core.SurfaceRequest.TransformationInfo transformationInfo) {
                    kotlinx.coroutines.flow.MutableStateFlow.this.setValue(transformationInfo);
                }
            });
            kotlinx.coroutines.flow.StateFlow asStateFlow = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
            kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
            final androidx.compose.runtime.State<androidx.camera.viewfinder.core.ImplementationMode> state = this.getHighSpeedVideoSizes;
            kotlinx.coroutines.flow.Flow takeWhile = kotlinx.coroutines.flow.FlowKt.takeWhile(kotlinx.coroutines.flow.FlowKt.flowCombine(androidx.compose.runtime.SnapshotStateKt.snapshotFlow(new kotlin.jvm.functions.Function0() { // from class: androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$viewfinderArgs$2$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    androidx.camera.viewfinder.core.ImplementationMode access$CameraXViewfinder$lambda$0;
                    access$CameraXViewfinder$lambda$0 = androidx.camera.compose.CameraXViewfinderKt.access$CameraXViewfinder$lambda$0(androidx.compose.runtime.State.this);
                    return access$CameraXViewfinder$lambda$0;
                }
            }), kotlinx.coroutines.flow.FlowKt.filterNotNull(asStateFlow), new androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$viewfinderArgs$2$1.AnonymousClass4(null)), new androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$viewfinderArgs$2$1.AnonymousClass5(objectRef, this.getHighSpeedVideoFpsRanges, null));
            final androidx.camera.core.SurfaceRequest surfaceRequest = this.getHighSpeedVideoFpsRanges;
            this.Camera2StreamConfigurationMap = 1;
            if (takeWhile.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$viewfinderArgs$2$1.6
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    kotlin.Pair pair = (kotlin.Pair) obj2;
                    androidx.camera.viewfinder.core.ImplementationMode implementationMode = (androidx.camera.viewfinder.core.ImplementationMode) pair.component1();
                    androidx.camera.core.SurfaceRequest.TransformationInfo transformationInfo = (androidx.camera.core.SurfaceRequest.TransformationInfo) pair.component2();
                    produceStateScope.setValue(new androidx.camera.compose.ViewfinderArgs(surfaceRequest, implementationMode, new androidx.camera.viewfinder.core.TransformationInfo(transformationInfo.getRotationDegrees(), transformationInfo.isMirroring(), false, transformationInfo.getCropRect().left, transformationInfo.getCropRect().top, transformationInfo.getCropRect().right, transformationInfo.getCropRect().bottom)));
                    return kotlin.Unit.INSTANCE;
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

    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Landroidx/camera/viewfinder/core/ImplementationMode;", "Landroidx/camera/core/SurfaceRequest$TransformationInfo;", "implMode", "transformInfo"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$viewfinderArgs$2$1$4", f = "CameraXViewfinder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$viewfinderArgs$2$1$4, reason: invalid class name */
    static final class AnonymousClass4 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<androidx.camera.viewfinder.core.ImplementationMode, androidx.camera.core.SurfaceRequest.TransformationInfo, kotlin.coroutines.Continuation<? super kotlin.Pair<? extends androidx.camera.viewfinder.core.ImplementationMode, ? extends androidx.camera.core.SurfaceRequest.TransformationInfo>>, java.lang.Object> {
        /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return new kotlin.Pair((androidx.camera.viewfinder.core.ImplementationMode) this.Camera2StreamConfigurationMap, (androidx.camera.core.SurfaceRequest.TransformationInfo) this.getHighSpeedVideoFpsRanges);
        }

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ java.lang.Object invoke(androidx.camera.viewfinder.core.ImplementationMode implementationMode, androidx.camera.core.SurfaceRequest.TransformationInfo transformationInfo, kotlin.coroutines.Continuation<? super kotlin.Pair<? extends androidx.camera.viewfinder.core.ImplementationMode, ? extends androidx.camera.core.SurfaceRequest.TransformationInfo>> continuation) {
            androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$viewfinderArgs$2$1.AnonymousClass4 anonymousClass4 = new androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$viewfinderArgs$2$1.AnonymousClass4(continuation);
            anonymousClass4.Camera2StreamConfigurationMap = implementationMode;
            anonymousClass4.getHighSpeedVideoFpsRanges = transformationInfo;
            return anonymousClass4.invokeSuspend(kotlin.Unit.INSTANCE);
        }

        AnonymousClass4(kotlin.coroutines.Continuation<? super androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$viewfinderArgs$2$1.AnonymousClass4> continuation) {
            super(3, continuation);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Landroidx/camera/viewfinder/core/ImplementationMode;", "Landroidx/camera/core/SurfaceRequest$TransformationInfo;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$viewfinderArgs$2$1$5", f = "CameraXViewfinder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$viewfinderArgs$2$1$5, reason: invalid class name */
    static final class AnonymousClass5 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlin.Pair<? extends androidx.camera.viewfinder.core.ImplementationMode, ? extends androidx.camera.core.SurfaceRequest.TransformationInfo>, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
        /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<androidx.camera.viewfinder.core.ImplementationMode> getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ androidx.camera.core.SurfaceRequest getHighSpeedVideoSizes;

        /* JADX WARN: Type inference failed for: r4v5, types: [T, androidx.camera.viewfinder.core.ImplementationMode] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoFpsRangesFor != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            ?? r4 = (androidx.camera.viewfinder.core.ImplementationMode) ((kotlin.Pair) this.getHighResolutionOutputSizeshNQ4ISI).component1();
            boolean z = (this.getHighSpeedVideoFpsRanges.element == null || r4 == this.getHighSpeedVideoFpsRanges.element) ? false : true;
            if (z) {
                kotlin.coroutines.jvm.internal.Boxing.boxBoolean(this.getHighSpeedVideoSizes.invalidate());
            } else {
                this.getHighSpeedVideoFpsRanges.element = r4;
            }
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(!z);
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlin.Pair<? extends androidx.camera.viewfinder.core.ImplementationMode, ? extends androidx.camera.core.SurfaceRequest.TransformationInfo> pair, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
            return ((androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$viewfinderArgs$2$1.AnonymousClass5) create(pair, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$viewfinderArgs$2$1.AnonymousClass5 anonymousClass5 = new androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$viewfinderArgs$2$1.AnonymousClass5(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
            anonymousClass5.getHighResolutionOutputSizeshNQ4ISI = obj;
            return anonymousClass5;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(kotlin.jvm.internal.Ref.ObjectRef<androidx.camera.viewfinder.core.ImplementationMode> objectRef, androidx.camera.core.SurfaceRequest surfaceRequest, kotlin.coroutines.Continuation<? super androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$viewfinderArgs$2$1.AnonymousClass5> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRanges = objectRef;
            this.getHighSpeedVideoSizes = surfaceRequest;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(androidx.compose.runtime.ProduceStateScope<androidx.camera.compose.ViewfinderArgs> produceStateScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$viewfinderArgs$2$1) create(produceStateScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$viewfinderArgs$2$1 cameraXViewfinderKt$CameraXViewfinder$viewfinderArgs$2$1 = new androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$viewfinderArgs$2$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
        cameraXViewfinderKt$CameraXViewfinder$viewfinderArgs$2$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return cameraXViewfinderKt$CameraXViewfinder$viewfinderArgs$2$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CameraXViewfinderKt$CameraXViewfinder$viewfinderArgs$2$1(androidx.camera.core.SurfaceRequest surfaceRequest, androidx.compose.runtime.State<? extends androidx.camera.viewfinder.core.ImplementationMode> state, kotlin.coroutines.Continuation<? super androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$viewfinderArgs$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = surfaceRequest;
        this.getHighSpeedVideoSizes = state;
    }
}
