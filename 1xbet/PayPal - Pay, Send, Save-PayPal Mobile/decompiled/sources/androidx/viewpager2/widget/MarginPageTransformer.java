package androidx.viewpager2.widget;

/* loaded from: classes7.dex */
public final class MarginPageTransformer implements androidx.viewpager2.widget.ViewPager2.PageTransformer {
    private final int getHighResolutionOutputSizeshNQ4ISI;

    public MarginPageTransformer(int i) {
        androidx.core.util.Preconditions.checkArgumentNonnegative(i, "Margin must be non-negative");
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
    public final void transformPage(android.view.View view, float f) {
        android.view.ViewParent parent = view.getParent();
        android.view.ViewParent parent2 = parent.getParent();
        if ((parent instanceof androidx.recyclerview.widget.RecyclerView) && (parent2 instanceof androidx.viewpager2.widget.ViewPager2)) {
            androidx.viewpager2.widget.ViewPager2 viewPager2 = (androidx.viewpager2.widget.ViewPager2) parent2;
            float f2 = this.getHighResolutionOutputSizeshNQ4ISI * f;
            if (viewPager2.getOrientation() != 0) {
                view.setTranslationY(f2);
                return;
            }
            if (viewPager2.Camera2StreamConfigurationMap.getLayoutDirection() == 1) {
                f2 = -f2;
            }
            view.setTranslationX(f2);
            return;
        }
        throw new java.lang.IllegalStateException("Expected the page view to be managed by a ViewPager2 instance.");
    }
}
