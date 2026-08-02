package androidx.camera.core;

/* loaded from: classes6.dex */
public interface CameraFilter {
    public static final androidx.camera.core.impl.Identifier DEFAULT_ID = androidx.camera.core.impl.Identifier.create(new java.lang.Object());

    java.util.List<androidx.camera.core.CameraInfo> filter(java.util.List<androidx.camera.core.CameraInfo> list);

    default androidx.camera.core.impl.Identifier getIdentifier() {
        return DEFAULT_ID;
    }
}
