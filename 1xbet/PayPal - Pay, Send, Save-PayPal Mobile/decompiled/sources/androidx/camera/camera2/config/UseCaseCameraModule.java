package androidx.camera.camera2.config;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b'\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/camera/camera2/config/UseCaseCameraModule;", "", "<init>", "()V", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
@dagger.Module(includes = {androidx.camera.camera2.impl.UseCaseCameraImpl.Bindings.class, androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.Bindings.class})
/* loaded from: classes6.dex */
public abstract class UseCaseCameraModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.config.UseCaseCameraModule.Companion INSTANCE = new androidx.camera.camera2.config.UseCaseCameraModule.Companion(null);

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/camera/camera2/config/UseCaseCameraModule$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Landroidx/camera/camera2/impl/CapturePipelineImpl;", "capturePipelineImplProvider", "Landroidx/camera/camera2/compat/workaround/CapturePipelineTorchCorrection;", "capturePipelineTorchCorrectionProvider", "Landroidx/camera/camera2/impl/CapturePipeline;", "provideCapturePipeline", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)Landroidx/camera/camera2/impl/CapturePipeline;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @dagger.Provides
        @androidx.camera.camera2.config.UseCaseCameraScope
        public final androidx.camera.camera2.impl.CapturePipeline provideCapturePipeline(javax.inject.Provider<androidx.camera.camera2.impl.CapturePipelineImpl> capturePipelineImplProvider, javax.inject.Provider<androidx.camera.camera2.compat.workaround.CapturePipelineTorchCorrection> capturePipelineTorchCorrectionProvider) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(capturePipelineImplProvider, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(capturePipelineTorchCorrectionProvider, "");
            if (androidx.camera.camera2.compat.workaround.CapturePipelineTorchCorrection.INSTANCE.isEnabled()) {
                androidx.camera.camera2.compat.workaround.CapturePipelineTorchCorrection capturePipelineTorchCorrection = capturePipelineTorchCorrectionProvider.get();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(capturePipelineTorchCorrection, "");
                return capturePipelineTorchCorrection;
            }
            androidx.camera.camera2.impl.CapturePipelineImpl capturePipelineImpl = capturePipelineImplProvider.get();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(capturePipelineImpl, "");
            return capturePipelineImpl;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
