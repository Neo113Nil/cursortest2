package androidx.viewpager2.widget;

/* loaded from: classes7.dex */
final class ScrollEventAdapter extends androidx.recyclerview.widget.RecyclerView.OnScrollListener {
    int Camera2StreamConfigurationMap;
    androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback getHighResolutionOutputSizeshNQ4ISI;
    boolean getHighSpeedVideoFpsRanges;
    boolean getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    private final androidx.recyclerview.widget.RecyclerView getHighSpeedVideoSizesFor;
    androidx.viewpager2.widget.ScrollEventAdapter.ScrollEventValues getInputFormats;
    int getInputSizeshNQ4ISI;
    private boolean getOutputFormats;
    private final androidx.recyclerview.widget.LinearLayoutManager getOutputMinFrameDuration;
    private int getOutputMinFrameDurationlomOqCM;
    private final androidx.viewpager2.widget.ViewPager2 getOutputSizes;
    private boolean getOutputStallDuration;

    ScrollEventAdapter(androidx.viewpager2.widget.ViewPager2 viewPager2) {
        this.getOutputSizes = viewPager2;
        androidx.recyclerview.widget.RecyclerView recyclerView = viewPager2.getOutputFormats;
        this.getHighSpeedVideoSizesFor = recyclerView;
        this.getOutputMinFrameDuration = (androidx.recyclerview.widget.LinearLayoutManager) recyclerView.getLayoutManager();
        this.getInputFormats = new androidx.viewpager2.widget.ScrollEventAdapter.ScrollEventValues();
        Camera2StreamConfigurationMap();
    }

    final void Camera2StreamConfigurationMap() {
        this.getHighSpeedVideoSizes = 0;
        this.getInputSizeshNQ4ISI = 0;
        androidx.viewpager2.widget.ScrollEventAdapter.ScrollEventValues scrollEventValues = this.getInputFormats;
        scrollEventValues.Camera2StreamConfigurationMap = -1;
        scrollEventValues.getHighSpeedVideoFpsRangesFor = 0.0f;
        scrollEventValues.getHighSpeedVideoSizes = 0;
        this.Camera2StreamConfigurationMap = -1;
        this.getOutputMinFrameDurationlomOqCM = -1;
        this.getOutputFormats = false;
        this.getOutputStallDuration = false;
        this.getHighSpeedVideoFpsRanges = false;
        this.getHighSpeedVideoFpsRangesFor = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i) {
        int i2 = this.getHighSpeedVideoSizes;
        if (!(i2 == 1 && this.getInputSizeshNQ4ISI == 1) && i == 1) {
            getHighSpeedVideoSizes(false);
            return;
        }
        if ((i2 == 1 || i2 == 4) && i == 2) {
            if (this.getOutputStallDuration) {
                getHighSpeedVideoFpsRanges(2);
                this.getOutputFormats = true;
                return;
            }
            return;
        }
        if ((i2 == 1 || i2 == 4) && i == 0) {
            getHighResolutionOutputSizeshNQ4ISI();
            if (!this.getOutputStallDuration) {
                if (this.getInputFormats.Camera2StreamConfigurationMap != -1) {
                    int i3 = this.getInputFormats.Camera2StreamConfigurationMap;
                    androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback onPageChangeCallback = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (onPageChangeCallback != null) {
                        onPageChangeCallback.onPageScrolled(i3, 0.0f, 0);
                    }
                }
            } else if (this.getInputFormats.getHighSpeedVideoSizes == 0) {
                if (this.Camera2StreamConfigurationMap != this.getInputFormats.Camera2StreamConfigurationMap) {
                    int i4 = this.getInputFormats.Camera2StreamConfigurationMap;
                    androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback onPageChangeCallback2 = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (onPageChangeCallback2 != null) {
                        onPageChangeCallback2.onPageSelected(i4);
                    }
                }
            }
            getHighSpeedVideoFpsRanges(0);
            Camera2StreamConfigurationMap();
        }
        if (this.getHighSpeedVideoSizes == 2 && i == 0 && this.getHighSpeedVideoFpsRangesFor) {
            getHighResolutionOutputSizeshNQ4ISI();
            if (this.getInputFormats.getHighSpeedVideoSizes == 0) {
                if (this.getOutputMinFrameDurationlomOqCM != this.getInputFormats.Camera2StreamConfigurationMap) {
                    int i5 = this.getInputFormats.Camera2StreamConfigurationMap == -1 ? 0 : this.getInputFormats.Camera2StreamConfigurationMap;
                    androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback onPageChangeCallback3 = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (onPageChangeCallback3 != null) {
                        onPageChangeCallback3.onPageSelected(i5);
                    }
                }
                getHighSpeedVideoFpsRanges(0);
                Camera2StreamConfigurationMap();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if ((r6 < 0) == (r4.getOutputSizes.Camera2StreamConfigurationMap.getLayoutDirection() == 1)) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i, int i2) {
        int i3;
        androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback onPageChangeCallback;
        this.getOutputStallDuration = true;
        getHighResolutionOutputSizeshNQ4ISI();
        if (this.getOutputFormats) {
            this.getOutputFormats = false;
            if (i2 <= 0) {
                if (i2 == 0) {
                }
                i3 = this.getInputFormats.Camera2StreamConfigurationMap;
                this.getOutputMinFrameDurationlomOqCM = i3;
                if (this.Camera2StreamConfigurationMap != i3 && (onPageChangeCallback = this.getHighResolutionOutputSizeshNQ4ISI) != null) {
                    onPageChangeCallback.onPageSelected(i3);
                }
            }
            if (this.getInputFormats.getHighSpeedVideoSizes != 0) {
                i3 = this.getInputFormats.Camera2StreamConfigurationMap + 1;
                this.getOutputMinFrameDurationlomOqCM = i3;
                if (this.Camera2StreamConfigurationMap != i3) {
                    onPageChangeCallback.onPageSelected(i3);
                }
            }
            i3 = this.getInputFormats.Camera2StreamConfigurationMap;
            this.getOutputMinFrameDurationlomOqCM = i3;
            if (this.Camera2StreamConfigurationMap != i3) {
            }
        } else if (this.getHighSpeedVideoSizes == 0) {
            int i4 = this.getInputFormats.Camera2StreamConfigurationMap;
            if (i4 == -1) {
                i4 = 0;
            }
            androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback onPageChangeCallback2 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (onPageChangeCallback2 != null) {
                onPageChangeCallback2.onPageSelected(i4);
            }
        }
        int i5 = this.getInputFormats.Camera2StreamConfigurationMap == -1 ? 0 : this.getInputFormats.Camera2StreamConfigurationMap;
        float f = this.getInputFormats.getHighSpeedVideoFpsRangesFor;
        int i6 = this.getInputFormats.getHighSpeedVideoSizes;
        androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback onPageChangeCallback3 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (onPageChangeCallback3 != null) {
            onPageChangeCallback3.onPageScrolled(i5, f, i6);
        }
        int i7 = this.getInputFormats.Camera2StreamConfigurationMap;
        int i8 = this.getOutputMinFrameDurationlomOqCM;
        if ((i7 == i8 || i8 == -1) && this.getInputFormats.getHighSpeedVideoSizes == 0 && this.getInputSizeshNQ4ISI != 1) {
            getHighSpeedVideoFpsRanges(0);
            Camera2StreamConfigurationMap();
        }
    }

    final void getHighResolutionOutputSizeshNQ4ISI() {
        int top;
        androidx.viewpager2.widget.ScrollEventAdapter.ScrollEventValues scrollEventValues = this.getInputFormats;
        scrollEventValues.Camera2StreamConfigurationMap = this.getOutputMinFrameDuration.findFirstVisibleItemPosition();
        if (scrollEventValues.Camera2StreamConfigurationMap != -1) {
            android.view.View findViewByPosition = this.getOutputMinFrameDuration.findViewByPosition(scrollEventValues.Camera2StreamConfigurationMap);
            if (findViewByPosition != null) {
                int leftDecorationWidth = this.getOutputMinFrameDuration.getLeftDecorationWidth(findViewByPosition);
                int rightDecorationWidth = this.getOutputMinFrameDuration.getRightDecorationWidth(findViewByPosition);
                int topDecorationHeight = this.getOutputMinFrameDuration.getTopDecorationHeight(findViewByPosition);
                int bottomDecorationHeight = this.getOutputMinFrameDuration.getBottomDecorationHeight(findViewByPosition);
                android.view.ViewGroup.LayoutParams layoutParams = findViewByPosition.getLayoutParams();
                if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
                    leftDecorationWidth += marginLayoutParams.leftMargin;
                    rightDecorationWidth += marginLayoutParams.rightMargin;
                    topDecorationHeight += marginLayoutParams.topMargin;
                    bottomDecorationHeight += marginLayoutParams.bottomMargin;
                }
                int height = findViewByPosition.getHeight() + topDecorationHeight + bottomDecorationHeight;
                int width = findViewByPosition.getWidth();
                if (this.getOutputMinFrameDuration.getOrientation() == 0) {
                    top = (findViewByPosition.getLeft() - leftDecorationWidth) - this.getHighSpeedVideoSizesFor.getPaddingLeft();
                    if (this.getOutputSizes.Camera2StreamConfigurationMap.getLayoutDirection() == 1) {
                        top = -top;
                    }
                    height = width + leftDecorationWidth + rightDecorationWidth;
                } else {
                    top = (findViewByPosition.getTop() - topDecorationHeight) - this.getHighSpeedVideoSizesFor.getPaddingTop();
                }
                scrollEventValues.getHighSpeedVideoSizes = -top;
                if (scrollEventValues.getHighSpeedVideoSizes < 0) {
                    if (new androidx.viewpager2.widget.AnimateLayoutChangeDetector(this.getOutputMinFrameDuration).getHighSpeedVideoFpsRangesFor()) {
                        throw new java.lang.IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
                    }
                    throw new java.lang.IllegalStateException(java.lang.String.format(java.util.Locale.US, "Page can only be offset by a positive amount, not by %d", java.lang.Integer.valueOf(scrollEventValues.getHighSpeedVideoSizes)));
                }
                scrollEventValues.getHighSpeedVideoFpsRangesFor = height != 0 ? scrollEventValues.getHighSpeedVideoSizes / height : 0.0f;
                return;
            }
            scrollEventValues.Camera2StreamConfigurationMap = -1;
            scrollEventValues.getHighSpeedVideoFpsRangesFor = 0.0f;
            scrollEventValues.getHighSpeedVideoSizes = 0;
            return;
        }
        scrollEventValues.Camera2StreamConfigurationMap = -1;
        scrollEventValues.getHighSpeedVideoFpsRangesFor = 0.0f;
        scrollEventValues.getHighSpeedVideoSizes = 0;
    }

    final void getHighSpeedVideoSizes(boolean z) {
        this.getHighSpeedVideoFpsRanges = z;
        this.getHighSpeedVideoSizes = z ? 4 : 1;
        int i = this.getOutputMinFrameDurationlomOqCM;
        if (i != -1) {
            this.Camera2StreamConfigurationMap = i;
            this.getOutputMinFrameDurationlomOqCM = -1;
        } else if (this.Camera2StreamConfigurationMap == -1) {
            this.Camera2StreamConfigurationMap = this.getOutputMinFrameDuration.findFirstVisibleItemPosition();
        }
        getHighSpeedVideoFpsRanges(1);
    }

    final void Camera2StreamConfigurationMap(int i, boolean z) {
        androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback onPageChangeCallback;
        this.getHighSpeedVideoSizes = z ? 2 : 3;
        this.getHighSpeedVideoFpsRanges = false;
        boolean z2 = this.getOutputMinFrameDurationlomOqCM != i;
        this.getOutputMinFrameDurationlomOqCM = i;
        getHighSpeedVideoFpsRanges(2);
        if (!z2 || (onPageChangeCallback = this.getHighResolutionOutputSizeshNQ4ISI) == null) {
            return;
        }
        onPageChangeCallback.onPageSelected(i);
    }

    final void getHighSpeedVideoFpsRanges(int i) {
        if ((this.getHighSpeedVideoSizes == 3 && this.getInputSizeshNQ4ISI == 0) || this.getInputSizeshNQ4ISI == i) {
            return;
        }
        this.getInputSizeshNQ4ISI = i;
        androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback onPageChangeCallback = this.getHighResolutionOutputSizeshNQ4ISI;
        if (onPageChangeCallback != null) {
            onPageChangeCallback.onPageScrollStateChanged(i);
        }
    }

    static final class ScrollEventValues {
        int Camera2StreamConfigurationMap;
        float getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;

        ScrollEventValues() {
        }
    }
}
