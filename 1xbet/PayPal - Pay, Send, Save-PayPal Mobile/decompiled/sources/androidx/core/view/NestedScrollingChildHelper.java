package androidx.core.view;

/* loaded from: classes3.dex */
public class NestedScrollingChildHelper {
    private final android.view.View Camera2StreamConfigurationMap;
    private int[] getHighResolutionOutputSizeshNQ4ISI;
    private android.view.ViewParent getHighSpeedVideoFpsRanges;
    private boolean getHighSpeedVideoFpsRangesFor;
    private android.view.ViewParent getHighSpeedVideoSizes;

    public NestedScrollingChildHelper(android.view.View view) {
        this.Camera2StreamConfigurationMap = view;
    }

    public void setNestedScrollingEnabled(boolean z) {
        if (this.getHighSpeedVideoFpsRangesFor) {
            androidx.core.view.ViewCompat.stopNestedScroll(this.Camera2StreamConfigurationMap);
        }
        this.getHighSpeedVideoFpsRangesFor = z;
    }

    public boolean isNestedScrollingEnabled() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public boolean hasNestedScrollingParent() {
        return hasNestedScrollingParent(0);
    }

    public boolean startNestedScroll(int i) {
        return startNestedScroll(i, 0);
    }

    public boolean startNestedScroll(int i, int i2) {
        if (hasNestedScrollingParent(i2)) {
            return true;
        }
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        android.view.View view = this.Camera2StreamConfigurationMap;
        for (android.view.ViewParent parent = this.Camera2StreamConfigurationMap.getParent(); parent != null; parent = parent.getParent()) {
            if (androidx.core.view.ViewParentCompat.onStartNestedScroll(parent, view, this.Camera2StreamConfigurationMap, i, i2)) {
                if (i2 == 0) {
                    this.getHighSpeedVideoFpsRanges = parent;
                } else if (i2 == 1) {
                    this.getHighSpeedVideoSizes = parent;
                }
                androidx.core.view.ViewParentCompat.onNestedScrollAccepted(parent, view, this.Camera2StreamConfigurationMap, i, i2);
                return true;
            }
            if (parent instanceof android.view.View) {
                view = (android.view.View) parent;
            }
        }
        return false;
    }

    public void stopNestedScroll() {
        stopNestedScroll(0);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getHighSpeedVideoSizes(i, i2, i3, i4, iArr, 0, null);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return getHighSpeedVideoSizes(i, i2, i3, i4, iArr, i5, null);
    }

    public void dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getHighSpeedVideoSizes(i, i2, i3, i4, iArr, i5, iArr2);
    }

    private boolean getHighSpeedVideoSizes(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        android.view.ViewParent viewParent;
        int i6;
        int i7;
        int[] iArr3;
        if (isNestedScrollingEnabled()) {
            if (i5 == 0) {
                viewParent = this.getHighSpeedVideoFpsRanges;
            } else {
                viewParent = i5 != 1 ? null : this.getHighSpeedVideoSizes;
            }
            if (viewParent == null) {
                return false;
            }
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                if (iArr != null) {
                    this.Camera2StreamConfigurationMap.getLocationInWindow(iArr);
                    i6 = iArr[0];
                    i7 = iArr[1];
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                if (iArr2 == null) {
                    if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                        this.getHighResolutionOutputSizeshNQ4ISI = new int[2];
                    }
                    int[] iArr4 = this.getHighResolutionOutputSizeshNQ4ISI;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                androidx.core.view.ViewParentCompat.onNestedScroll(viewParent, this.Camera2StreamConfigurationMap, i, i2, i3, i4, i5, iArr3);
                if (iArr != null) {
                    this.Camera2StreamConfigurationMap.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i6;
                    iArr[1] = iArr[1] - i7;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
        }
        return false;
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return dispatchNestedPreScroll(i, i2, iArr, iArr2, 0);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        android.view.ViewParent viewParent;
        int i4;
        int i5;
        if (isNestedScrollingEnabled()) {
            if (i3 == 0) {
                viewParent = this.getHighSpeedVideoFpsRanges;
            } else {
                viewParent = i3 != 1 ? null : this.getHighSpeedVideoSizes;
            }
            android.view.ViewParent viewParent2 = viewParent;
            if (viewParent2 == null) {
                return false;
            }
            if (i != 0 || i2 != 0) {
                if (iArr2 != null) {
                    this.Camera2StreamConfigurationMap.getLocationInWindow(iArr2);
                    i4 = iArr2[0];
                    i5 = iArr2[1];
                } else {
                    i4 = 0;
                    i5 = 0;
                }
                if (iArr == null) {
                    if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                        this.getHighResolutionOutputSizeshNQ4ISI = new int[2];
                    }
                    iArr = this.getHighResolutionOutputSizeshNQ4ISI;
                }
                iArr[0] = 0;
                iArr[1] = 0;
                androidx.core.view.ViewParentCompat.onNestedPreScroll(viewParent2, this.Camera2StreamConfigurationMap, i, i2, iArr, i3);
                if (iArr2 != null) {
                    this.Camera2StreamConfigurationMap.getLocationInWindow(iArr2);
                    iArr2[0] = iArr2[0] - i4;
                    iArr2[1] = iArr2[1] - i5;
                }
                return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
            }
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
        }
        return false;
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        android.view.ViewParent viewParent;
        if (!isNestedScrollingEnabled() || (viewParent = this.getHighSpeedVideoFpsRanges) == null) {
            return false;
        }
        return androidx.core.view.ViewParentCompat.onNestedFling(viewParent, this.Camera2StreamConfigurationMap, f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        android.view.ViewParent viewParent;
        if (!isNestedScrollingEnabled() || (viewParent = this.getHighSpeedVideoFpsRanges) == null) {
            return false;
        }
        return androidx.core.view.ViewParentCompat.onNestedPreFling(viewParent, this.Camera2StreamConfigurationMap, f, f2);
    }

    public void onDetachedFromWindow() {
        androidx.core.view.ViewCompat.stopNestedScroll(this.Camera2StreamConfigurationMap);
    }

    public void onStopNestedScroll(android.view.View view) {
        androidx.core.view.ViewCompat.stopNestedScroll(this.Camera2StreamConfigurationMap);
    }

    public boolean hasNestedScrollingParent(int i) {
        android.view.ViewParent viewParent;
        if (i == 0) {
            viewParent = this.getHighSpeedVideoFpsRanges;
        } else {
            viewParent = i != 1 ? null : this.getHighSpeedVideoSizes;
        }
        return viewParent != null;
    }

    public void stopNestedScroll(int i) {
        android.view.ViewParent viewParent;
        if (i == 0) {
            viewParent = this.getHighSpeedVideoFpsRanges;
        } else {
            viewParent = i != 1 ? null : this.getHighSpeedVideoSizes;
        }
        if (viewParent != null) {
            androidx.core.view.ViewParentCompat.onStopNestedScroll(viewParent, this.Camera2StreamConfigurationMap, i);
            if (i == 0) {
                this.getHighSpeedVideoFpsRanges = null;
            } else if (i == 1) {
                this.getHighSpeedVideoSizes = null;
            }
        }
    }
}
