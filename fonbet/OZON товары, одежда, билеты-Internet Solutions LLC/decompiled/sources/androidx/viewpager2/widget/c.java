package androidx.viewpager2.widget;

import androidx.annotation.NonNull;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* loaded from: classes8.dex */
final class c extends ViewPager2.g {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final ArrayList f45204a = new ArrayList(3);

    c() {
    }

    final void a(ViewPager2.g gVar) {
        this.f45204a.add(gVar);
    }

    final void b(ViewPager2.g gVar) {
        this.f45204a.remove(gVar);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void onPageScrollStateChanged(int i11) {
        try {
            Iterator it = this.f45204a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.g) it.next()).onPageScrollStateChanged(i11);
            }
        } catch (ConcurrentModificationException e11) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e11);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void onPageScrolled(int i11, float f7, int i12) {
        try {
            Iterator it = this.f45204a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.g) it.next()).onPageScrolled(i11, f7, i12);
            }
        } catch (ConcurrentModificationException e11) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e11);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void onPageSelected(int i11) {
        try {
            Iterator it = this.f45204a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.g) it.next()).onPageSelected(i11);
            }
        } catch (ConcurrentModificationException e11) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e11);
        }
    }
}
