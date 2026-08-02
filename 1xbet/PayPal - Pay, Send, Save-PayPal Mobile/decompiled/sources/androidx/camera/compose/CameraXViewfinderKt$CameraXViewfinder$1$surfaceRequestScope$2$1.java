package androidx.camera.compose;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/ProduceStateScope;", "Landroidx/camera/compose/SurfaceRequestScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$1$surfaceRequestScope$2$1", f = "CameraXViewfinder.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class CameraXViewfinderKt$CameraXViewfinder$1$surfaceRequestScope$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.runtime.ProduceStateScope<androidx.camera.compose.SurfaceRequestScope>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.runtime.State<androidx.camera.compose.ViewfinderArgs> Camera2StreamConfigurationMap;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.compose.runtime.ProduceStateScope produceStateScope = (androidx.compose.runtime.ProduceStateScope) this.getHighSpeedVideoFpsRanges;
            final androidx.compose.runtime.State<androidx.camera.compose.ViewfinderArgs> state = this.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoSizes = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(androidx.compose.runtime.SnapshotStateKt.snapshotFlow(new kotlin.jvm.functions.Function0() { // from class: androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$1$surfaceRequestScope$2$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$1$surfaceRequestScope$2$1.getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.State.this);
                }
            }), new androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$1$surfaceRequestScope$2$1.AnonymousClass2(produceStateScope, null), this) == coroutine_suspended) {
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

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Landroidx/camera/core/SurfaceRequest;", "Landroidx/camera/viewfinder/core/ImplementationMode;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$1$surfaceRequestScope$2$1$2", f = "CameraXViewfinder.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$1$surfaceRequestScope$2$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlin.Pair<? extends androidx.camera.core.SurfaceRequest, ? extends androidx.camera.viewfinder.core.ImplementationMode>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
        int getHighSpeedVideoFpsRanges;
        final /* synthetic */ androidx.compose.runtime.ProduceStateScope<androidx.camera.compose.SurfaceRequestScope> getHighSpeedVideoFpsRangesFor;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoFpsRanges;
            try {
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.Pair pair = (kotlin.Pair) this.Camera2StreamConfigurationMap;
                    androidx.camera.core.SurfaceRequest surfaceRequest = (androidx.camera.core.SurfaceRequest) pair.component1();
                    androidx.camera.viewfinder.core.ImplementationMode implementationMode = (androidx.camera.viewfinder.core.ImplementationMode) pair.component2();
                    if (!androidx.camera.compose.CameraXViewfinderKt.access$canSupport(this.getHighSpeedVideoFpsRangesFor.getValue(), surfaceRequest, implementationMode)) {
                        this.getHighSpeedVideoFpsRangesFor.setValue(androidx.camera.compose.SurfaceRequestScope.INSTANCE.createFrom(surfaceRequest, implementationMode));
                    }
                    androidx.camera.compose.SurfaceRequestScope value = this.getHighSpeedVideoFpsRangesFor.getValue();
                    kotlinx.coroutines.channels.Channel<androidx.camera.core.SurfaceRequest> highSpeedVideoSizes = value != null ? value.getHighSpeedVideoSizes() : null;
                    if (highSpeedVideoSizes == null) {
                        throw new java.lang.IllegalStateException("Surface request channel should not be null".toString());
                    }
                    this.getHighSpeedVideoFpsRanges = 1;
                    if (highSpeedVideoSizes.send(surfaceRequest, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
            } catch (kotlinx.coroutines.channels.ClosedSendChannelException unused) {
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlin.Pair<? extends androidx.camera.core.SurfaceRequest, ? extends androidx.camera.viewfinder.core.ImplementationMode> pair, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$1$surfaceRequestScope$2$1.AnonymousClass2) create(pair, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$1$surfaceRequestScope$2$1.AnonymousClass2 anonymousClass2 = new androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$1$surfaceRequestScope$2$1.AnonymousClass2(this.getHighSpeedVideoFpsRangesFor, continuation);
            anonymousClass2.Camera2StreamConfigurationMap = obj;
            return anonymousClass2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(androidx.compose.runtime.ProduceStateScope<androidx.camera.compose.SurfaceRequestScope> produceStateScope, kotlin.coroutines.Continuation<? super androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$1$surfaceRequestScope$2$1.AnonymousClass2> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRangesFor = produceStateScope;
        }
    }

    public static /* synthetic */ kotlin.Pair getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.State state) {
        return new kotlin.Pair(androidx.camera.compose.CameraXViewfinderKt.access$CameraXViewfinder$lambda$3$0(state).getCamera2StreamConfigurationMap(), androidx.camera.compose.CameraXViewfinderKt.access$CameraXViewfinder$lambda$3$0(state).getGetHighSpeedVideoSizes());
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(androidx.compose.runtime.ProduceStateScope<androidx.camera.compose.SurfaceRequestScope> produceStateScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$1$surfaceRequestScope$2$1) create(produceStateScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$1$surfaceRequestScope$2$1 cameraXViewfinderKt$CameraXViewfinder$1$surfaceRequestScope$2$1 = new androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$1$surfaceRequestScope$2$1(this.Camera2StreamConfigurationMap, continuation);
        cameraXViewfinderKt$CameraXViewfinder$1$surfaceRequestScope$2$1.getHighSpeedVideoFpsRanges = obj;
        return cameraXViewfinderKt$CameraXViewfinder$1$surfaceRequestScope$2$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CameraXViewfinderKt$CameraXViewfinder$1$surfaceRequestScope$2$1(androidx.compose.runtime.State<androidx.camera.compose.ViewfinderArgs> state, kotlin.coroutines.Continuation<? super androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$1$surfaceRequestScope$2$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = state;
    }
}
