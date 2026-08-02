package androidx.camera.core.impl;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\r\u0010\u000eR(\u0010\u0010\u001a\u00020\u000f8\u0007@\u0007X\u0087.¢\u0006\u0018\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0016\u0010\u0003\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/camera/core/impl/UseCaseAdditionSimulator;", "", "<init>", "()V", "Landroidx/camera/core/impl/CameraInfoInternal;", "cameraInfoInternal", "Landroidx/camera/core/SessionConfig;", "sessionConfig", "", "findMaxSupportedFrameRate", "Landroidx/camera/core/featuregroup/impl/ResolvedFeatureGroup;", "resolvedFeatureGroup", "Landroidx/camera/core/internal/CalculatedUseCaseInfo;", "simulateAddUseCases", "(Landroidx/camera/core/impl/CameraInfoInternal;Landroidx/camera/core/SessionConfig;ZLandroidx/camera/core/featuregroup/impl/ResolvedFeatureGroup;)Landroidx/camera/core/internal/CalculatedUseCaseInfo;", "Landroidx/camera/core/CameraUseCaseAdapterProvider;", "cameraUseCaseAdapterProvider", "Landroidx/camera/core/CameraUseCaseAdapterProvider;", "getCameraUseCaseAdapterProvider", "()Landroidx/camera/core/CameraUseCaseAdapterProvider;", "setCameraUseCaseAdapterProvider", "(Landroidx/camera/core/CameraUseCaseAdapterProvider;)V", "getCameraUseCaseAdapterProvider$annotations"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UseCaseAdditionSimulator {
    public static final androidx.camera.core.impl.UseCaseAdditionSimulator INSTANCE = new androidx.camera.core.impl.UseCaseAdditionSimulator();
    public static androidx.camera.core.CameraUseCaseAdapterProvider cameraUseCaseAdapterProvider;

    @kotlin.jvm.JvmStatic
    public static /* synthetic */ void getCameraUseCaseAdapterProvider$annotations() {
    }

    private UseCaseAdditionSimulator() {
    }

    public static final androidx.camera.core.CameraUseCaseAdapterProvider getCameraUseCaseAdapterProvider() {
        androidx.camera.core.CameraUseCaseAdapterProvider cameraUseCaseAdapterProvider2 = cameraUseCaseAdapterProvider;
        if (cameraUseCaseAdapterProvider2 != null) {
            return cameraUseCaseAdapterProvider2;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public static final void setCameraUseCaseAdapterProvider(androidx.camera.core.CameraUseCaseAdapterProvider cameraUseCaseAdapterProvider2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraUseCaseAdapterProvider2, "");
        cameraUseCaseAdapterProvider = cameraUseCaseAdapterProvider2;
    }

    public static /* synthetic */ androidx.camera.core.internal.CalculatedUseCaseInfo simulateAddUseCases$default(androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal, androidx.camera.core.SessionConfig sessionConfig, boolean z, androidx.camera.core.featuregroup.impl.ResolvedFeatureGroup resolvedFeatureGroup, int i, java.lang.Object obj) throws java.lang.IllegalStateException, androidx.camera.core.internal.CameraUseCaseAdapter.CameraException {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            resolvedFeatureGroup = null;
        }
        return simulateAddUseCases(cameraInfoInternal, sessionConfig, z, resolvedFeatureGroup);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.camera.core.internal.CalculatedUseCaseInfo simulateAddUseCases(androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal, androidx.camera.core.SessionConfig sessionConfig, boolean findMaxSupportedFrameRate, androidx.camera.core.featuregroup.impl.ResolvedFeatureGroup resolvedFeatureGroup) throws java.lang.IllegalStateException, androidx.camera.core.internal.CameraUseCaseAdapter.CameraException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraInfoInternal, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionConfig, "");
        if (cameraUseCaseAdapterProvider == null) {
            throw new java.lang.IllegalStateException("mCameraUseCaseAdapterProvider must be initialized first!".toString());
        }
        androidx.camera.core.CameraUseCaseAdapterProvider cameraUseCaseAdapterProvider2 = getCameraUseCaseAdapterProvider();
        java.lang.String cameraId = cameraInfoInternal.getCameraId();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cameraId, "");
        androidx.camera.core.internal.CameraUseCaseAdapter provide = cameraUseCaseAdapterProvider2.provide(cameraId);
        provide.setViewPort(sessionConfig.getViewPort());
        provide.setEffects(sessionConfig.getEffects());
        provide.setSessionType(sessionConfig.getSessionType());
        provide.setFrameRate(sessionConfig.getFrameRateRange());
        java.util.List<androidx.camera.core.UseCase> useCases = sessionConfig.getUseCases();
        if (resolvedFeatureGroup == null) {
            resolvedFeatureGroup = androidx.camera.core.featuregroup.impl.ResolvedFeatureGroup.Companion.resolveFeatureGroup$default(androidx.camera.core.featuregroup.impl.ResolvedFeatureGroup.INSTANCE, sessionConfig, cameraInfoInternal, null, 2, null);
        }
        androidx.camera.core.internal.CalculatedUseCaseInfo simulateAddUseCases = provide.simulateAddUseCases(useCases, resolvedFeatureGroup, findMaxSupportedFrameRate);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(simulateAddUseCases, "");
        return simulateAddUseCases;
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.camera.core.internal.CalculatedUseCaseInfo simulateAddUseCases(androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal, androidx.camera.core.SessionConfig sessionConfig, boolean z) throws java.lang.IllegalStateException, androidx.camera.core.internal.CameraUseCaseAdapter.CameraException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraInfoInternal, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionConfig, "");
        return simulateAddUseCases$default(cameraInfoInternal, sessionConfig, z, null, 8, null);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.camera.core.internal.CalculatedUseCaseInfo simulateAddUseCases(androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal, androidx.camera.core.SessionConfig sessionConfig) throws java.lang.IllegalStateException, androidx.camera.core.internal.CameraUseCaseAdapter.CameraException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraInfoInternal, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionConfig, "");
        return simulateAddUseCases$default(cameraInfoInternal, sessionConfig, false, null, 12, null);
    }
}
