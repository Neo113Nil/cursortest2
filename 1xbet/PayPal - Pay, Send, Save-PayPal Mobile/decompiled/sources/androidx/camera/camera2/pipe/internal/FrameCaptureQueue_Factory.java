package androidx.camera.camera2.pipe.internal;

/* loaded from: classes6.dex */
public final class FrameCaptureQueue_Factory implements dagger.internal.Factory<androidx.camera.camera2.pipe.internal.FrameCaptureQueue> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.internal.FrameCaptureQueue get() {
        return newInstance();
    }

    public static androidx.camera.camera2.pipe.internal.FrameCaptureQueue_Factory create() {
        return androidx.camera.camera2.pipe.internal.FrameCaptureQueue_Factory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static androidx.camera.camera2.pipe.internal.FrameCaptureQueue newInstance() {
        return new androidx.camera.camera2.pipe.internal.FrameCaptureQueue();
    }

    static final class InstanceHolder {
        static final androidx.camera.camera2.pipe.internal.FrameCaptureQueue_Factory getHighResolutionOutputSizeshNQ4ISI = new androidx.camera.camera2.pipe.internal.FrameCaptureQueue_Factory();

        private InstanceHolder() {
        }
    }
}
