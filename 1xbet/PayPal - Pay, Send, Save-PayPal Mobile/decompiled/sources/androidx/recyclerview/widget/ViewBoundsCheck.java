package androidx.recyclerview.widget;

/* loaded from: classes7.dex */
class ViewBoundsCheck {
    androidx.recyclerview.widget.ViewBoundsCheck.BoundFlags Camera2StreamConfigurationMap = new androidx.recyclerview.widget.ViewBoundsCheck.BoundFlags();
    final androidx.recyclerview.widget.ViewBoundsCheck.Callback getHighSpeedVideoFpsRangesFor;

    interface Callback {
        int Camera2StreamConfigurationMap();

        int getHighSpeedVideoFpsRangesFor(android.view.View view);

        int getHighSpeedVideoSizes();

        int getHighSpeedVideoSizes(android.view.View view);

        android.view.View getHighSpeedVideoSizes(int i);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface ViewBounds {
    }

    ViewBoundsCheck(androidx.recyclerview.widget.ViewBoundsCheck.Callback callback) {
        this.getHighSpeedVideoFpsRangesFor = callback;
    }

    static class BoundFlags {
        int Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor = 0;
        int getHighSpeedVideoSizes;

        private static int getHighSpeedVideoSizes(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        BoundFlags() {
        }

        final void getHighResolutionOutputSizeshNQ4ISI(int i, int i2, int i3, int i4) {
            this.getHighSpeedVideoFpsRanges = i;
            this.getHighSpeedVideoSizes = i2;
            this.Camera2StreamConfigurationMap = i3;
            this.getHighResolutionOutputSizeshNQ4ISI = i4;
        }

        final void getHighSpeedVideoSizes(int i) {
            this.getHighSpeedVideoFpsRangesFor = i | this.getHighSpeedVideoFpsRangesFor;
        }

        final void getHighSpeedVideoSizes() {
            this.getHighSpeedVideoFpsRangesFor = 0;
        }

        final boolean getHighSpeedVideoFpsRanges() {
            int i = this.getHighSpeedVideoFpsRangesFor;
            if ((i & 7) != 0 && (i & getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges)) == 0) {
                return false;
            }
            int i2 = this.getHighSpeedVideoFpsRangesFor;
            if ((i2 & 112) != 0 && (i2 & (getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes) << 4)) == 0) {
                return false;
            }
            int i3 = this.getHighSpeedVideoFpsRangesFor;
            if ((i3 & 1792) != 0 && (i3 & (getHighSpeedVideoSizes(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges) << 8)) == 0) {
                return false;
            }
            int i4 = this.getHighSpeedVideoFpsRangesFor;
            return (i4 & 28672) == 0 || (i4 & (getHighSpeedVideoSizes(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes) << 12)) != 0;
        }
    }

    final android.view.View getHighSpeedVideoFpsRangesFor(int i, int i2, int i3, int i4) {
        int highSpeedVideoSizes = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes();
        int Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap();
        int i5 = i2 > i ? 1 : -1;
        android.view.View view = null;
        while (i != i2) {
            android.view.View highSpeedVideoSizes2 = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(i);
            this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes, Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(highSpeedVideoSizes2), this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes2));
            if (i3 != 0) {
                this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes();
                this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes(i3);
                if (this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges()) {
                    return highSpeedVideoSizes2;
                }
            }
            if (i4 != 0) {
                this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes();
                this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes(i4);
                if (this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges()) {
                    view = highSpeedVideoSizes2;
                }
            }
            i += i5;
        }
        return view;
    }

    final boolean getHighSpeedVideoSizes(android.view.View view) {
        this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(), this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap(), this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(view), this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor(view));
        this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes();
        this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes(24579);
        return this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges();
    }
}
