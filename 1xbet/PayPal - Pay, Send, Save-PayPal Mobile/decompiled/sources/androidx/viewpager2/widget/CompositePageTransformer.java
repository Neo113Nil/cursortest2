package androidx.viewpager2.widget;

/* loaded from: classes7.dex */
public final class CompositePageTransformer implements androidx.viewpager2.widget.ViewPager2.PageTransformer {
    private final java.util.List<androidx.viewpager2.widget.ViewPager2.PageTransformer> Camera2StreamConfigurationMap = new java.util.ArrayList();

    public final void addTransformer(androidx.viewpager2.widget.ViewPager2.PageTransformer pageTransformer) {
        this.Camera2StreamConfigurationMap.add(pageTransformer);
    }

    public final void removeTransformer(androidx.viewpager2.widget.ViewPager2.PageTransformer pageTransformer) {
        this.Camera2StreamConfigurationMap.remove(pageTransformer);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
    public final void transformPage(android.view.View view, float f) {
        java.util.Iterator<androidx.viewpager2.widget.ViewPager2.PageTransformer> it = this.Camera2StreamConfigurationMap.iterator();
        while (it.hasNext()) {
            it.next().transformPage(view, f);
        }
    }
}
