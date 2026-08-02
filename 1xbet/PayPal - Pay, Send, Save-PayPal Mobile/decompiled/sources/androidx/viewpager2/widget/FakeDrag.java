package androidx.viewpager2.widget;

/* loaded from: classes7.dex */
final class FakeDrag {
    int Camera2StreamConfigurationMap;
    float getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final androidx.recyclerview.widget.RecyclerView getHighSpeedVideoFpsRangesFor;
    long getHighSpeedVideoSizes;
    final androidx.viewpager2.widget.ViewPager2 getHighSpeedVideoSizesFor;
    android.view.VelocityTracker getInputSizeshNQ4ISI;
    final androidx.viewpager2.widget.ScrollEventAdapter getOutputFormats;

    FakeDrag(androidx.viewpager2.widget.ViewPager2 viewPager2, androidx.viewpager2.widget.ScrollEventAdapter scrollEventAdapter, androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.getHighSpeedVideoSizesFor = viewPager2;
        this.getOutputFormats = scrollEventAdapter;
        this.getHighSpeedVideoFpsRangesFor = recyclerView;
    }
}
