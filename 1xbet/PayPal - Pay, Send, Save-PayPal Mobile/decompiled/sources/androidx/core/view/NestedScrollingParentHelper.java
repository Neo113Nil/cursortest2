package androidx.core.view;

/* loaded from: classes3.dex */
public class NestedScrollingParentHelper {
    private int Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;

    public NestedScrollingParentHelper(android.view.ViewGroup viewGroup) {
    }

    public void onNestedScrollAccepted(android.view.View view, android.view.View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    public void onNestedScrollAccepted(android.view.View view, android.view.View view2, int i, int i2) {
        if (i2 == 1) {
            this.getHighResolutionOutputSizeshNQ4ISI = i;
        } else {
            this.Camera2StreamConfigurationMap = i;
        }
    }

    public int getNestedScrollAxes() {
        return this.Camera2StreamConfigurationMap | this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void onStopNestedScroll(android.view.View view) {
        onStopNestedScroll(view, 0);
    }

    public void onStopNestedScroll(android.view.View view, int i) {
        if (i == 1) {
            this.getHighResolutionOutputSizeshNQ4ISI = 0;
        } else {
            this.Camera2StreamConfigurationMap = 0;
        }
    }
}
