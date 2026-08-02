package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public interface CameraDeviceSurfaceManager extends androidx.camera.core.impl.InternalCameraPresenceListener {

    public interface Provider {
        androidx.camera.core.impl.CameraDeviceSurfaceManager newInstance(android.content.Context context, java.lang.Object obj, java.util.Set<java.lang.String> set) throws androidx.camera.core.InitializationException;
    }

    androidx.camera.core.impl.SurfaceStreamSpecQueryResult getSuggestedStreamSpecs(int i, java.lang.String str, java.util.List<androidx.camera.core.impl.AttachedSurfaceInfo> list, java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, java.util.List<android.util.Size>> map, androidx.camera.core.impl.stabilization.VideoStabilization videoStabilization, boolean z, boolean z2, boolean z3);

    androidx.camera.core.impl.SurfaceConfig transformSurfaceConfig(int i, java.lang.String str, int i2, android.util.Size size, androidx.camera.core.impl.StreamUseCase streamUseCase);
}
