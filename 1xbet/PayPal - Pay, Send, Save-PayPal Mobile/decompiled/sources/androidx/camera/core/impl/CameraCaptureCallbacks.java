package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public final class CameraCaptureCallbacks {
    private CameraCaptureCallbacks() {
    }

    public static androidx.camera.core.impl.CameraCaptureCallback createNoOpCallback() {
        return new androidx.camera.core.impl.CameraCaptureCallbacks.NoOpCameraCaptureCallback();
    }

    public static androidx.camera.core.impl.CameraCaptureCallback createComboCallback(androidx.camera.core.impl.CameraCaptureCallback... cameraCaptureCallbackArr) {
        java.util.List asList = java.util.Arrays.asList(cameraCaptureCallbackArr);
        if (asList.isEmpty()) {
            return createNoOpCallback();
        }
        if (asList.size() == 1) {
            return (androidx.camera.core.impl.CameraCaptureCallback) asList.get(0);
        }
        return new androidx.camera.core.impl.CameraCaptureCallbacks.ComboCameraCaptureCallback(asList);
    }

    static final class NoOpCameraCaptureCallback extends androidx.camera.core.impl.CameraCaptureCallback {
        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public final void onCaptureCompleted(int i, androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult) {
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public final void onCaptureFailed(int i, androidx.camera.core.impl.CameraCaptureFailure cameraCaptureFailure) {
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public final void onCaptureStarted(int i) {
        }

        NoOpCameraCaptureCallback() {
        }
    }

    public static final class ComboCameraCaptureCallback extends androidx.camera.core.impl.CameraCaptureCallback {
        private final java.util.List<androidx.camera.core.impl.CameraCaptureCallback> getHighSpeedVideoSizes = new java.util.ArrayList();

        ComboCameraCaptureCallback(java.util.List<androidx.camera.core.impl.CameraCaptureCallback> list) {
            for (androidx.camera.core.impl.CameraCaptureCallback cameraCaptureCallback : list) {
                if (!(cameraCaptureCallback instanceof androidx.camera.core.impl.CameraCaptureCallbacks.NoOpCameraCaptureCallback)) {
                    this.getHighSpeedVideoSizes.add(cameraCaptureCallback);
                }
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public final void onCaptureStarted(int i) {
            java.util.Iterator<androidx.camera.core.impl.CameraCaptureCallback> it = this.getHighSpeedVideoSizes.iterator();
            while (it.hasNext()) {
                it.next().onCaptureStarted(i);
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public final void onCaptureCompleted(int i, androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult) {
            java.util.Iterator<androidx.camera.core.impl.CameraCaptureCallback> it = this.getHighSpeedVideoSizes.iterator();
            while (it.hasNext()) {
                it.next().onCaptureCompleted(i, cameraCaptureResult);
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public final void onCaptureFailed(int i, androidx.camera.core.impl.CameraCaptureFailure cameraCaptureFailure) {
            java.util.Iterator<androidx.camera.core.impl.CameraCaptureCallback> it = this.getHighSpeedVideoSizes.iterator();
            while (it.hasNext()) {
                it.next().onCaptureFailed(i, cameraCaptureFailure);
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public final void onCaptureCancelled(int i) {
            java.util.Iterator<androidx.camera.core.impl.CameraCaptureCallback> it = this.getHighSpeedVideoSizes.iterator();
            while (it.hasNext()) {
                it.next().onCaptureCancelled(i);
            }
        }

        public final java.util.List<androidx.camera.core.impl.CameraCaptureCallback> getCallbacks() {
            return this.getHighSpeedVideoSizes;
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public final void onCaptureProcessProgressed(int i, int i2) {
            java.util.Iterator<androidx.camera.core.impl.CameraCaptureCallback> it = this.getHighSpeedVideoSizes.iterator();
            while (it.hasNext()) {
                it.next().onCaptureProcessProgressed(i, i2);
            }
        }
    }
}
