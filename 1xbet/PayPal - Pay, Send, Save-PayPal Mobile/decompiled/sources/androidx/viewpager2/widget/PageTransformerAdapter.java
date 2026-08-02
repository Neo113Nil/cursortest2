package androidx.viewpager2.widget;

/* loaded from: classes7.dex */
final class PageTransformerAdapter extends androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback {
    private final androidx.recyclerview.widget.LinearLayoutManager getHighResolutionOutputSizeshNQ4ISI;
    androidx.viewpager2.widget.ViewPager2.PageTransformer getHighSpeedVideoSizes;

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i) {
    }

    PageTransformerAdapter(androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager) {
        this.getHighResolutionOutputSizeshNQ4ISI = linearLayoutManager;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageScrolled(int i, float f, int i2) {
        if (this.getHighSpeedVideoSizes != null) {
            float f2 = -f;
            for (int i3 = 0; i3 < this.getHighResolutionOutputSizeshNQ4ISI.getChildCount(); i3++) {
                android.view.View childAt = this.getHighResolutionOutputSizeshNQ4ISI.getChildAt(i3);
                if (childAt == null) {
                    throw new java.lang.IllegalStateException(java.lang.String.format(java.util.Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(this.getHighResolutionOutputSizeshNQ4ISI.getChildCount())));
                }
                this.getHighSpeedVideoSizes.transformPage(childAt, (this.getHighResolutionOutputSizeshNQ4ISI.getPosition(childAt) - i) + f2);
            }
        }
    }
}
