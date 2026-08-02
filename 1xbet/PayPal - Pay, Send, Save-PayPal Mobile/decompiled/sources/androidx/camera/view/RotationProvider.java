package androidx.camera.view;

/* loaded from: classes6.dex */
public final class RotationProvider {
    final java.lang.Object Camera2StreamConfigurationMap = new java.lang.Object();
    final java.util.Map<androidx.camera.view.RotationProvider.Listener, androidx.camera.view.RotationProvider.ListenerWrapper> getHighSpeedVideoFpsRanges = new java.util.HashMap();
    boolean getHighSpeedVideoFpsRangesFor = false;
    final android.view.OrientationEventListener getHighSpeedVideoSizes;

    public interface Listener {
        void onRotationChanged(int i);
    }

    static int getHighSpeedVideoFpsRanges(int i) {
        if (i >= 315 || i < 45) {
            return 0;
        }
        if (i >= 225) {
            return 1;
        }
        return i >= 135 ? 2 : 3;
    }

    public RotationProvider(android.content.Context context) {
        this.getHighSpeedVideoSizes = new android.view.OrientationEventListener(context) { // from class: androidx.camera.view.RotationProvider.1
            private int Camera2StreamConfigurationMap = -1;

            @Override // android.view.OrientationEventListener
            public void onOrientationChanged(int i) {
                final int highSpeedVideoFpsRanges;
                java.util.ArrayList<androidx.camera.view.RotationProvider.ListenerWrapper> arrayList;
                if (i == -1 || this.Camera2StreamConfigurationMap == (highSpeedVideoFpsRanges = androidx.camera.view.RotationProvider.getHighSpeedVideoFpsRanges(i))) {
                    return;
                }
                this.Camera2StreamConfigurationMap = highSpeedVideoFpsRanges;
                synchronized (androidx.camera.view.RotationProvider.this.Camera2StreamConfigurationMap) {
                    arrayList = new java.util.ArrayList(androidx.camera.view.RotationProvider.this.getHighSpeedVideoFpsRanges.values());
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                for (final androidx.camera.view.RotationProvider.ListenerWrapper listenerWrapper : arrayList) {
                    listenerWrapper.getHighSpeedVideoFpsRangesFor.execute(new java.lang.Runnable() { // from class: androidx.camera.view.RotationProvider$ListenerWrapper$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.camera.view.RotationProvider.ListenerWrapper listenerWrapper2 = androidx.camera.view.RotationProvider.ListenerWrapper.this;
                            int i2 = highSpeedVideoFpsRanges;
                            if (listenerWrapper2.getHighSpeedVideoFpsRanges.get()) {
                                listenerWrapper2.getHighResolutionOutputSizeshNQ4ISI.onRotationChanged(i2);
                            }
                        }
                    });
                }
            }
        };
    }

    public final boolean addListener(java.util.concurrent.Executor executor, androidx.camera.view.RotationProvider.Listener listener) {
        synchronized (this.Camera2StreamConfigurationMap) {
            if (!this.getHighSpeedVideoSizes.canDetectOrientation() && !this.getHighSpeedVideoFpsRangesFor) {
                return false;
            }
            this.getHighSpeedVideoFpsRanges.put(listener, new androidx.camera.view.RotationProvider.ListenerWrapper(listener, executor));
            this.getHighSpeedVideoSizes.enable();
            return true;
        }
    }

    public final void removeListener(androidx.camera.view.RotationProvider.Listener listener) {
        synchronized (this.Camera2StreamConfigurationMap) {
            androidx.camera.view.RotationProvider.ListenerWrapper listenerWrapper = this.getHighSpeedVideoFpsRanges.get(listener);
            if (listenerWrapper != null) {
                listenerWrapper.getHighSpeedVideoFpsRanges.set(false);
                this.getHighSpeedVideoFpsRanges.remove(listener);
            }
            if (this.getHighSpeedVideoFpsRanges.isEmpty()) {
                this.getHighSpeedVideoSizes.disable();
            }
        }
    }

    static class ListenerWrapper {
        final androidx.camera.view.RotationProvider.Listener getHighResolutionOutputSizeshNQ4ISI;
        final java.util.concurrent.atomic.AtomicBoolean getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicBoolean(true);
        final java.util.concurrent.Executor getHighSpeedVideoFpsRangesFor;

        ListenerWrapper(androidx.camera.view.RotationProvider.Listener listener, java.util.concurrent.Executor executor) {
            this.getHighResolutionOutputSizeshNQ4ISI = listener;
            this.getHighSpeedVideoFpsRangesFor = executor;
        }
    }
}
