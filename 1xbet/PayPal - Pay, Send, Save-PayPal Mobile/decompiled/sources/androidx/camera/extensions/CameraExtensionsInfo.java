package androidx.camera.extensions;

/* loaded from: classes6.dex */
public interface CameraExtensionsInfo {
    default androidx.view.LiveData<java.lang.Integer> getCurrentExtensionMode() {
        return null;
    }

    default androidx.view.LiveData<java.lang.Integer> getExtensionStrength() {
        return null;
    }

    default boolean isCurrentExtensionModeAvailable() {
        return false;
    }

    default boolean isExtensionStrengthAvailable() {
        return false;
    }
}
