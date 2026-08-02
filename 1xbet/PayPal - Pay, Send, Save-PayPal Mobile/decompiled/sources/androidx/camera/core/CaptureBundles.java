package androidx.camera.core;

/* loaded from: classes6.dex */
public final class CaptureBundles {
    public static androidx.camera.core.impl.CaptureBundle singleDefaultCaptureBundle() {
        return new androidx.camera.core.CaptureBundles.CaptureBundleImpl(java.util.Arrays.asList(new androidx.camera.core.impl.CaptureStage.DefaultCaptureStage()));
    }

    static final class CaptureBundleImpl implements androidx.camera.core.impl.CaptureBundle {
        final java.util.List<androidx.camera.core.impl.CaptureStage> getHighResolutionOutputSizeshNQ4ISI;

        CaptureBundleImpl(java.util.List<androidx.camera.core.impl.CaptureStage> list) {
            if (list != null && !list.isEmpty()) {
                this.getHighResolutionOutputSizeshNQ4ISI = java.util.Collections.unmodifiableList(new java.util.ArrayList(list));
                return;
            }
            throw new java.lang.IllegalArgumentException("Cannot set an empty CaptureStage list.");
        }

        @Override // androidx.camera.core.impl.CaptureBundle
        public final java.util.List<androidx.camera.core.impl.CaptureStage> getCaptureStages() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }
    }

    private CaptureBundles() {
    }
}
