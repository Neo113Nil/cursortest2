package androidx.camera.extensions;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001!BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006¢\u0006\u0004\b\r\u0010\u000eB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u0004\u0018\u00010\u001a8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"Landroidx/camera/extensions/ExtensionSessionConfig;", "Landroidx/camera/core/SessionConfig;", "", "mode", "Landroidx/camera/extensions/ExtensionsManager;", "extensionsManager", "", "Landroidx/camera/core/UseCase;", "useCases", "Landroidx/camera/core/ViewPort;", "viewPort", "Landroidx/camera/core/CameraEffect;", "effects", "<init>", "(ILandroidx/camera/extensions/ExtensionsManager;Ljava/util/List;Landroidx/camera/core/ViewPort;Ljava/util/List;)V", "(ILandroidx/camera/extensions/ExtensionsManager;[Landroidx/camera/core/UseCase;)V", com.visa.cbp.getEncExpo.warmup, "getMode", "()I", "Landroidx/camera/extensions/ExtensionsManager;", "getExtensionsManager", "()Landroidx/camera/extensions/ExtensionsManager;", "", "getRequireNonEmptyUseCases", "()Z", "requireNonEmptyUseCases", "Landroidx/camera/core/CameraFilter;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/camera/core/CameraFilter;", "getHighSpeedVideoSizes", "getCameraFilter", "()Landroidx/camera/core/CameraFilter;", "cameraFilter", "Builder"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ExtensionSessionConfig extends androidx.camera.core.SessionConfig {
    private final androidx.camera.extensions.ExtensionsManager extensionsManager;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.camera.core.CameraFilter getHighSpeedVideoSizes;
    private final int mode;

    @Override // androidx.camera.core.SessionConfig
    public final boolean getRequireNonEmptyUseCases() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExtensionSessionConfig(int i, androidx.camera.extensions.ExtensionsManager extensionsManager, java.util.List<? extends androidx.camera.core.UseCase> list, androidx.camera.core.ViewPort viewPort, java.util.List<? extends androidx.camera.core.CameraEffect> list2) {
        super(list, viewPort, list2, null, null, null, 56, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extensionsManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        this.mode = i;
        this.extensionsManager = extensionsManager;
        this.getHighSpeedVideoSizes = extensionsManager.getExtensionCameraFilterAndInjectCameraConfig$camera_extensions(i);
    }

    public final int getMode() {
        return this.mode;
    }

    public final androidx.camera.extensions.ExtensionsManager getExtensionsManager() {
        return this.extensionsManager;
    }

    public /* synthetic */ ExtensionSessionConfig(int i, androidx.camera.extensions.ExtensionsManager extensionsManager, java.util.List list, androidx.camera.core.ViewPort viewPort, java.util.List list2, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, extensionsManager, (i2 & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i2 & 8) != 0 ? null : viewPort, (i2 & 16) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2);
    }

    @Override // androidx.camera.core.SessionConfig
    /* renamed from: getCameraFilter, reason: from getter */
    public final androidx.camera.core.CameraFilter getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExtensionSessionConfig(int i, androidx.camera.extensions.ExtensionsManager extensionsManager, androidx.camera.core.UseCase... useCaseArr) {
        this(i, extensionsManager, kotlin.collections.ArraysKt.toList(useCaseArr), null, null, 24, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extensionsManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCaseArr, "");
    }

    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001fR\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001e"}, d2 = {"Landroidx/camera/extensions/ExtensionSessionConfig$Builder;", "", "", "mode", "Landroidx/camera/extensions/ExtensionsManager;", "extensionsManager", "<init>", "(ILandroidx/camera/extensions/ExtensionsManager;)V", "Landroidx/camera/core/UseCase;", "useCase", "addUseCase", "(Landroidx/camera/core/UseCase;)Landroidx/camera/extensions/ExtensionSessionConfig$Builder;", "Landroidx/camera/core/ViewPort;", "viewPort", "setViewPort", "(Landroidx/camera/core/ViewPort;)Landroidx/camera/extensions/ExtensionSessionConfig$Builder;", "Landroidx/camera/core/CameraEffect;", "effect", "addEffect", "(Landroidx/camera/core/CameraEffect;)Landroidx/camera/extensions/ExtensionSessionConfig$Builder;", "Landroidx/camera/extensions/ExtensionSessionConfig;", "build", "()Landroidx/camera/extensions/ExtensionSessionConfig;", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "Landroidx/camera/extensions/ExtensionsManager;", "", "getHighSpeedVideoFpsRangesFor", "Ljava/util/List;", "Landroidx/camera/core/ViewPort;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final androidx.camera.extensions.ExtensionsManager getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final int getHighSpeedVideoSizes;
        private java.util.List<androidx.camera.core.CameraEffect> getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final java.util.List<androidx.camera.core.UseCase> Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private androidx.camera.core.ViewPort getHighSpeedVideoFpsRangesFor;

        public Builder(int i, androidx.camera.extensions.ExtensionsManager extensionsManager) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extensionsManager, "");
            this.getHighSpeedVideoSizes = i;
            this.getHighResolutionOutputSizeshNQ4ISI = extensionsManager;
            this.Camera2StreamConfigurationMap = new java.util.ArrayList();
            this.getHighSpeedVideoFpsRanges = new java.util.ArrayList();
        }

        public final androidx.camera.extensions.ExtensionSessionConfig.Builder addUseCase(androidx.camera.core.UseCase useCase) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCase, "");
            this.Camera2StreamConfigurationMap.add(useCase);
            return this;
        }

        public final androidx.camera.extensions.ExtensionSessionConfig.Builder setViewPort(androidx.camera.core.ViewPort viewPort) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewPort, "");
            this.getHighSpeedVideoFpsRangesFor = viewPort;
            return this;
        }

        public final androidx.camera.extensions.ExtensionSessionConfig.Builder addEffect(androidx.camera.core.CameraEffect effect) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(effect, "");
            this.getHighSpeedVideoFpsRanges.add(effect);
            return this;
        }

        public final androidx.camera.extensions.ExtensionSessionConfig build() {
            return new androidx.camera.extensions.ExtensionSessionConfig(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, kotlin.collections.CollectionsKt.toList(this.Camera2StreamConfigurationMap), this.getHighSpeedVideoFpsRangesFor, kotlin.collections.CollectionsKt.toList(this.getHighSpeedVideoFpsRanges));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExtensionSessionConfig(int i, androidx.camera.extensions.ExtensionsManager extensionsManager, java.util.List<? extends androidx.camera.core.UseCase> list, androidx.camera.core.ViewPort viewPort) {
        this(i, extensionsManager, list, viewPort, null, 16, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extensionsManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExtensionSessionConfig(int i, androidx.camera.extensions.ExtensionsManager extensionsManager, java.util.List<? extends androidx.camera.core.UseCase> list) {
        this(i, extensionsManager, list, null, null, 24, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extensionsManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExtensionSessionConfig(int i, androidx.camera.extensions.ExtensionsManager extensionsManager) {
        this(i, extensionsManager, null, null, null, 28, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extensionsManager, "");
    }
}
