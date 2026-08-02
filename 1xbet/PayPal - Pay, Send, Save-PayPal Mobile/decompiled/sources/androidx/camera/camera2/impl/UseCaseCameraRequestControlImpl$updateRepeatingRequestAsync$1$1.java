package androidx.camera.camera2.impl;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/Deferred;", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$updateRepeatingRequestAsync$1$1", f = "UseCaseCameraRequestControl.kt", i = {}, l = {428}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class UseCaseCameraRequestControlImpl$updateRepeatingRequestAsync$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlinx.coroutines.Deferred<? extends kotlin.Unit>>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ boolean getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.util.Collection<androidx.camera.core.UseCase> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.Map map;
        androidx.camera.camera2.impl.UseCaseThreads useCaseThreads;
        androidx.camera.camera2.config.UseCaseGraphContext useCaseGraphContext;
        java.util.Map map2;
        androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.InfoBundle Camera2StreamConfigurationMap;
        java.lang.Object Camera2StreamConfigurationMap2;
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
        androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
            java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
        }
        androidx.camera.core.impl.SessionConfig validSessionConfigOrNull = new androidx.camera.camera2.adapter.SessionConfigAdapter(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges).getValidSessionConfigOrNull();
        if (validSessionConfigOrNull == null) {
            androidx.camera.camera2.impl.Camera2Logger camera2Logger2 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
            if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                java.lang.String unused2 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
            }
            androidx.camera.core.impl.SessionConfig.Builder builder = new androidx.camera.core.impl.SessionConfig.Builder();
            builder.setTemplateType(1);
            validSessionConfigOrNull = builder.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(validSessionConfigOrNull, "");
        }
        androidx.camera.camera2.impl.Camera2Logger camera2Logger3 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
            java.lang.String unused3 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
        }
        map = this.getHighSpeedVideoFpsRangesFor.getOutputFormats;
        androidx.camera.camera2.impl.UseCaseCameraRequestControl.Type type = androidx.camera.camera2.impl.UseCaseCameraRequestControl.Type.SESSION_CONFIG;
        androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.Companion companion = androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.INSTANCE;
        useCaseThreads = this.getHighSpeedVideoFpsRangesFor.getOutputMinFrameDuration;
        map.put(type, androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.Companion.access$toInfoBundle(companion, validSessionConfigOrNull, useCaseThreads.getSequentialExecutor()));
        useCaseGraphContext = this.getHighSpeedVideoFpsRangesFor.getOutputMinFrameDurationlomOqCM;
        java.util.List<androidx.camera.core.impl.DeferrableSurface> surfaces = validSessionConfigOrNull.getRepeatingCaptureConfig().getSurfaces();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(surfaces, "");
        java.util.Set<androidx.camera.camera2.pipe.StreamId> streamIdsFromSurfaces = useCaseGraphContext.getStreamIdsFromSurfaces(surfaces);
        androidx.camera.camera2.impl.Camera2Logger camera2Logger4 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
            java.lang.String unused4 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
        }
        androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.getHighSpeedVideoFpsRangesFor;
        map2 = useCaseCameraRequestControlImpl.getOutputFormats;
        Camera2StreamConfigurationMap = androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.Camera2StreamConfigurationMap(map2);
        this.getHighResolutionOutputSizeshNQ4ISI = 1;
        Camera2StreamConfigurationMap2 = useCaseCameraRequestControlImpl.Camera2StreamConfigurationMap(Camera2StreamConfigurationMap, streamIdsFromSurfaces, this);
        return Camera2StreamConfigurationMap2 == coroutine_suspended ? coroutine_suspended : Camera2StreamConfigurationMap2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlinx.coroutines.Deferred<? extends kotlin.Unit>> continuation) {
        return ((androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$updateRepeatingRequestAsync$1$1) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$updateRepeatingRequestAsync$1$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    UseCaseCameraRequestControlImpl$updateRepeatingRequestAsync$1$1(java.util.Collection<? extends androidx.camera.core.UseCase> collection, boolean z, androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl, kotlin.coroutines.Continuation<? super androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$updateRepeatingRequestAsync$1$1> continuation) {
        super(1, continuation);
        this.getHighSpeedVideoSizes = collection;
        this.getHighSpeedVideoFpsRanges = z;
        this.getHighSpeedVideoFpsRangesFor = useCaseCameraRequestControlImpl;
    }
}
