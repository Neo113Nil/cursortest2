package androidx.camera.camera2.impl;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.impl.FeatureCombinationQueryImpl$isSupported$1", f = "FeatureCombinationQueryImpl.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class FeatureCombinationQueryImpl$isSupported$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
    final /* synthetic */ androidx.camera.camera2.impl.CameraGraphConfigProvider.CameraGraphCreationResult Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.camera.camera2.impl.FeatureCombinationQueryImpl getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.camera.camera2.pipe.CameraPipe cameraPipe;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            cameraPipe = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoSizes = 1;
            obj = cameraPipe.mo417isConfigSupportedNpXggIU(this.Camera2StreamConfigurationMap.getConfig(), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        androidx.camera.camera2.impl.CameraGraphConfigProvider.CameraGraphCreationResult cameraGraphCreationResult = this.Camera2StreamConfigurationMap;
        androidx.camera.camera2.pipe.ConfigQueryResult configQueryResult = (androidx.camera.camera2.pipe.ConfigQueryResult) obj;
        int getHighSpeedVideoFpsRanges = configQueryResult.getGetHighSpeedVideoFpsRanges();
        androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
            java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
            java.util.List<androidx.camera.camera2.pipe.CameraStream.Config> streams = cameraGraphCreationResult.getConfig().getStreams();
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(streams, 10));
            java.util.Iterator<T> it = streams.iterator();
            while (it.hasNext()) {
                java.util.List<androidx.camera.camera2.pipe.OutputStream.Config> outputs = ((androidx.camera.camera2.pipe.CameraStream.Config) it.next()).getOutputs();
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(outputs, 10));
                for (androidx.camera.camera2.pipe.OutputStream.Config config : outputs) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("size=");
                    sb.append(config.getSize());
                    sb.append(", format=");
                    sb.append((java.lang.Object) androidx.camera.camera2.pipe.StreamFormat.m716toStringimpl(config.getFormat()));
                    sb.append(", dynamicRangeProfile");
                    sb.append(config.getDynamicRangeProfile());
                    arrayList2.add(sb.toString());
                }
                arrayList.add(arrayList2);
            }
            java.util.Objects.toString(androidx.camera.camera2.pipe.ConfigQueryResult.m440toStringimpl(getHighSpeedVideoFpsRanges));
            java.util.Objects.toString(cameraGraphCreationResult.getConfig().getSessionParameters());
            arrayList.toString();
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(androidx.camera.camera2.pipe.ConfigQueryResult.m438equalsimpl0(configQueryResult.getGetHighSpeedVideoFpsRanges(), androidx.camera.camera2.pipe.ConfigQueryResult.INSTANCE.m442getSUPPORTEDXp6DSB4()));
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return ((androidx.camera.camera2.impl.FeatureCombinationQueryImpl$isSupported$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.impl.FeatureCombinationQueryImpl$isSupported$1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FeatureCombinationQueryImpl$isSupported$1(androidx.camera.camera2.impl.FeatureCombinationQueryImpl featureCombinationQueryImpl, androidx.camera.camera2.impl.CameraGraphConfigProvider.CameraGraphCreationResult cameraGraphCreationResult, kotlin.coroutines.Continuation<? super androidx.camera.camera2.impl.FeatureCombinationQueryImpl$isSupported$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = featureCombinationQueryImpl;
        this.Camera2StreamConfigurationMap = cameraGraphCreationResult;
    }
}
