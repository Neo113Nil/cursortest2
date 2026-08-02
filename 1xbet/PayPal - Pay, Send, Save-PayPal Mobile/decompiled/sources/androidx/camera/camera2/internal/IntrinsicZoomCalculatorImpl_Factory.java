package androidx.camera.camera2.internal;

/* loaded from: classes6.dex */
public final class IntrinsicZoomCalculatorImpl_Factory implements dagger.internal.Factory<androidx.camera.camera2.internal.IntrinsicZoomCalculatorImpl> {
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.CameraDevices> getHighResolutionOutputSizeshNQ4ISI;

    private IntrinsicZoomCalculatorImpl_Factory(dagger.internal.Provider<androidx.camera.camera2.pipe.CameraDevices> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.internal.IntrinsicZoomCalculatorImpl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static androidx.camera.camera2.internal.IntrinsicZoomCalculatorImpl_Factory create(dagger.internal.Provider<androidx.camera.camera2.pipe.CameraDevices> provider) {
        return new androidx.camera.camera2.internal.IntrinsicZoomCalculatorImpl_Factory(provider);
    }

    public static androidx.camera.camera2.internal.IntrinsicZoomCalculatorImpl newInstance(androidx.camera.camera2.pipe.CameraDevices cameraDevices) {
        return new androidx.camera.camera2.internal.IntrinsicZoomCalculatorImpl(cameraDevices);
    }
}
