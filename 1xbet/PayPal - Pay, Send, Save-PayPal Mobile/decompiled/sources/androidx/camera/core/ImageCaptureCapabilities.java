package androidx.camera.core;

/* loaded from: classes6.dex */
public interface ImageCaptureCapabilities {
    java.util.Set<java.lang.Integer> getSupportedOutputFormats();

    boolean isCaptureProcessProgressSupported();

    boolean isPostviewSupported();
}
