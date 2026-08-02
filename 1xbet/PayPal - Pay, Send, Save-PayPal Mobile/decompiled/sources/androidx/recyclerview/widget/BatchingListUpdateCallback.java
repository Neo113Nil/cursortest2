package androidx.recyclerview.widget;

/* loaded from: classes7.dex */
public class BatchingListUpdateCallback implements androidx.recyclerview.widget.ListUpdateCallback {
    final androidx.recyclerview.widget.ListUpdateCallback getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges = 0;
    int getHighSpeedVideoFpsRangesFor = -1;
    int getHighSpeedVideoSizes = -1;
    java.lang.Object Camera2StreamConfigurationMap = null;

    public BatchingListUpdateCallback(androidx.recyclerview.widget.ListUpdateCallback listUpdateCallback) {
        this.getHighResolutionOutputSizeshNQ4ISI = listUpdateCallback;
    }

    public void dispatchLastEvent() {
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            return;
        }
        if (i == 1) {
            this.getHighResolutionOutputSizeshNQ4ISI.onInserted(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes);
        } else if (i == 2) {
            this.getHighResolutionOutputSizeshNQ4ISI.onRemoved(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes);
        } else if (i == 3) {
            this.getHighResolutionOutputSizeshNQ4ISI.onChanged(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap);
        }
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoFpsRanges = 0;
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onInserted(int i, int i2) {
        int i3;
        if (this.getHighSpeedVideoFpsRanges == 1 && i >= (i3 = this.getHighSpeedVideoFpsRangesFor)) {
            int i4 = this.getHighSpeedVideoSizes;
            if (i <= i3 + i4) {
                this.getHighSpeedVideoSizes = i4 + i2;
                this.getHighSpeedVideoFpsRangesFor = java.lang.Math.min(i, i3);
                return;
            }
        }
        dispatchLastEvent();
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getHighSpeedVideoSizes = i2;
        this.getHighSpeedVideoFpsRanges = 1;
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onRemoved(int i, int i2) {
        int i3;
        if (this.getHighSpeedVideoFpsRanges == 2 && (i3 = this.getHighSpeedVideoFpsRangesFor) >= i && i3 <= i + i2) {
            this.getHighSpeedVideoSizes += i2;
            this.getHighSpeedVideoFpsRangesFor = i;
        } else {
            dispatchLastEvent();
            this.getHighSpeedVideoFpsRangesFor = i;
            this.getHighSpeedVideoSizes = i2;
            this.getHighSpeedVideoFpsRanges = 2;
        }
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onMoved(int i, int i2) {
        dispatchLastEvent();
        this.getHighResolutionOutputSizeshNQ4ISI.onMoved(i, i2);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onChanged(int i, int i2, java.lang.Object obj) {
        int i3;
        int i4;
        int i5;
        if (this.getHighSpeedVideoFpsRanges == 3 && i <= (i4 = this.getHighSpeedVideoSizes + (i3 = this.getHighSpeedVideoFpsRangesFor)) && (i5 = i + i2) >= i3 && this.Camera2StreamConfigurationMap == obj) {
            this.getHighSpeedVideoFpsRangesFor = java.lang.Math.min(i, i3);
            this.getHighSpeedVideoSizes = java.lang.Math.max(i4, i5) - this.getHighSpeedVideoFpsRangesFor;
            return;
        }
        dispatchLastEvent();
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getHighSpeedVideoSizes = i2;
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRanges = 3;
    }
}
