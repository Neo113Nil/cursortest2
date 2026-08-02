package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroidx/camera/camera2/pipe/CameraExtensionMetadata;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.compat.Camera2MetadataCache$getCameraExtensionMetadata$3", f = "Camera2MetadataCache.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class Camera2MetadataCache$getCameraExtensionMetadata$3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.CameraExtensionMetadata>, java.lang.Object> {
    final /* synthetic */ androidx.camera.camera2.pipe.compat.Camera2MetadataCache getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        return this.getHighResolutionOutputSizeshNQ4ISI.mo795awaitCameraExtensionMetadata0r8Bogc(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.CameraExtensionMetadata> continuation) {
        return ((androidx.camera.camera2.pipe.compat.Camera2MetadataCache$getCameraExtensionMetadata$3) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.pipe.compat.Camera2MetadataCache$getCameraExtensionMetadata$3(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Camera2MetadataCache$getCameraExtensionMetadata$3(androidx.camera.camera2.pipe.compat.Camera2MetadataCache camera2MetadataCache, java.lang.String str, int i, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.compat.Camera2MetadataCache$getCameraExtensionMetadata$3> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = camera2MetadataCache;
        this.getHighSpeedVideoSizes = str;
        this.getHighSpeedVideoFpsRanges = i;
    }
}
