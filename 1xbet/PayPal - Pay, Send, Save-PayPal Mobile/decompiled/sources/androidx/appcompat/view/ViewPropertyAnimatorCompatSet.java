package androidx.appcompat.view;

/* loaded from: classes3.dex */
public class ViewPropertyAnimatorCompatSet {
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    androidx.core.view.ViewPropertyAnimatorListener getHighSpeedVideoFpsRanges;
    private android.view.animation.Interpolator getHighSpeedVideoSizes;
    private long getHighSpeedVideoFpsRangesFor = -1;
    private final androidx.core.view.ViewPropertyAnimatorListenerAdapter getOutputMinFrameDuration = new androidx.core.view.ViewPropertyAnimatorListenerAdapter() { // from class: androidx.appcompat.view.ViewPropertyAnimatorCompatSet.1
        private boolean getHighSpeedVideoSizes = false;
        private int Camera2StreamConfigurationMap = 0;

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public void onAnimationStart(android.view.View view) {
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            this.getHighSpeedVideoSizes = true;
            if (androidx.appcompat.view.ViewPropertyAnimatorCompatSet.this.getHighSpeedVideoFpsRanges != null) {
                androidx.appcompat.view.ViewPropertyAnimatorCompatSet.this.getHighSpeedVideoFpsRanges.onAnimationStart(null);
            }
        }

        void getHighSpeedVideoFpsRangesFor() {
            this.Camera2StreamConfigurationMap = 0;
            this.getHighSpeedVideoSizes = false;
            androidx.appcompat.view.ViewPropertyAnimatorCompatSet.this.Camera2StreamConfigurationMap();
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public void onAnimationEnd(android.view.View view) {
            int i = this.Camera2StreamConfigurationMap + 1;
            this.Camera2StreamConfigurationMap = i;
            if (i == androidx.appcompat.view.ViewPropertyAnimatorCompatSet.this.Camera2StreamConfigurationMap.size()) {
                if (androidx.appcompat.view.ViewPropertyAnimatorCompatSet.this.getHighSpeedVideoFpsRanges != null) {
                    androidx.appcompat.view.ViewPropertyAnimatorCompatSet.this.getHighSpeedVideoFpsRanges.onAnimationEnd(null);
                }
                getHighSpeedVideoFpsRangesFor();
            }
        }
    };
    final java.util.ArrayList<androidx.core.view.ViewPropertyAnimatorCompat> Camera2StreamConfigurationMap = new java.util.ArrayList<>();

    public androidx.appcompat.view.ViewPropertyAnimatorCompatSet play(androidx.core.view.ViewPropertyAnimatorCompat viewPropertyAnimatorCompat) {
        if (!this.getHighResolutionOutputSizeshNQ4ISI) {
            this.Camera2StreamConfigurationMap.add(viewPropertyAnimatorCompat);
        }
        return this;
    }

    public androidx.appcompat.view.ViewPropertyAnimatorCompatSet playSequentially(androidx.core.view.ViewPropertyAnimatorCompat viewPropertyAnimatorCompat, androidx.core.view.ViewPropertyAnimatorCompat viewPropertyAnimatorCompat2) {
        this.Camera2StreamConfigurationMap.add(viewPropertyAnimatorCompat);
        viewPropertyAnimatorCompat2.setStartDelay(viewPropertyAnimatorCompat.getDuration());
        this.Camera2StreamConfigurationMap.add(viewPropertyAnimatorCompat2);
        return this;
    }

    public void start() {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            return;
        }
        java.util.Iterator<androidx.core.view.ViewPropertyAnimatorCompat> it = this.Camera2StreamConfigurationMap.iterator();
        while (it.hasNext()) {
            androidx.core.view.ViewPropertyAnimatorCompat next = it.next();
            long j = this.getHighSpeedVideoFpsRangesFor;
            if (j >= 0) {
                next.setDuration(j);
            }
            android.view.animation.Interpolator interpolator = this.getHighSpeedVideoSizes;
            if (interpolator != null) {
                next.setInterpolator(interpolator);
            }
            if (this.getHighSpeedVideoFpsRanges != null) {
                next.setListener(this.getOutputMinFrameDuration);
            }
            next.start();
        }
        this.getHighResolutionOutputSizeshNQ4ISI = true;
    }

    void Camera2StreamConfigurationMap() {
        this.getHighResolutionOutputSizeshNQ4ISI = false;
    }

    public void cancel() {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            java.util.Iterator<androidx.core.view.ViewPropertyAnimatorCompat> it = this.Camera2StreamConfigurationMap.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
            this.getHighResolutionOutputSizeshNQ4ISI = false;
        }
    }

    public androidx.appcompat.view.ViewPropertyAnimatorCompatSet setDuration(long j) {
        if (!this.getHighResolutionOutputSizeshNQ4ISI) {
            this.getHighSpeedVideoFpsRangesFor = j;
        }
        return this;
    }

    public androidx.appcompat.view.ViewPropertyAnimatorCompatSet setInterpolator(android.view.animation.Interpolator interpolator) {
        if (!this.getHighResolutionOutputSizeshNQ4ISI) {
            this.getHighSpeedVideoSizes = interpolator;
        }
        return this;
    }

    public androidx.appcompat.view.ViewPropertyAnimatorCompatSet setListener(androidx.core.view.ViewPropertyAnimatorListener viewPropertyAnimatorListener) {
        if (!this.getHighResolutionOutputSizeshNQ4ISI) {
            this.getHighSpeedVideoFpsRanges = viewPropertyAnimatorListener;
        }
        return this;
    }
}
