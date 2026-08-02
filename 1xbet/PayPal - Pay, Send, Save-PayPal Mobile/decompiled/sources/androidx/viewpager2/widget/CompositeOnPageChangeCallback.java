package androidx.viewpager2.widget;

/* loaded from: classes7.dex */
final class CompositeOnPageChangeCallback extends androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback {
    final java.util.List<androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback> getHighSpeedVideoSizes = new java.util.ArrayList(3);

    CompositeOnPageChangeCallback() {
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageScrolled(int i, float f, int i2) {
        try {
            java.util.Iterator<androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback> it = this.getHighSpeedVideoSizes.iterator();
            while (it.hasNext()) {
                it.next().onPageScrolled(i, f, i2);
            }
        } catch (java.util.ConcurrentModificationException e) {
            throw new java.lang.IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i) {
        try {
            java.util.Iterator<androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback> it = this.getHighSpeedVideoSizes.iterator();
            while (it.hasNext()) {
                it.next().onPageSelected(i);
            }
        } catch (java.util.ConcurrentModificationException e) {
            throw new java.lang.IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageScrollStateChanged(int i) {
        try {
            java.util.Iterator<androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback> it = this.getHighSpeedVideoSizes.iterator();
            while (it.hasNext()) {
                it.next().onPageScrollStateChanged(i);
            }
        } catch (java.util.ConcurrentModificationException e) {
            throw new java.lang.IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }
}
