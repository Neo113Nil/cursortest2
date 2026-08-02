package androidx.viewpager2.widget;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* loaded from: classes8.dex */
final class e extends ViewPager2.g {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayoutManager f45213a;

    /* renamed from: b, reason: collision with root package name */
    private ViewPager2.i f45214b;

    e(LinearLayoutManager linearLayoutManager) {
        this.f45213a = linearLayoutManager;
    }

    final ViewPager2.i a() {
        return this.f45214b;
    }

    final void b(ViewPager2.i iVar) {
        this.f45214b = iVar;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void onPageScrollStateChanged(int i11) {
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void onPageScrolled(int i11, float f7, int i12) {
        if (this.f45214b == null) {
            return;
        }
        float f11 = -f7;
        int i13 = 0;
        while (true) {
            LinearLayoutManager linearLayoutManager = this.f45213a;
            if (i13 >= linearLayoutManager.getChildCount()) {
                return;
            }
            View childAt = linearLayoutManager.getChildAt(i13);
            if (childAt == null) {
                Locale locale = Locale.US;
                throw new IllegalStateException(Cm.e.c("LayoutManager returned a null child at pos ", i13, "/", " while transforming pages", linearLayoutManager.getChildCount()));
            }
            this.f45214b.transformPage(childAt, (linearLayoutManager.getPosition(childAt) - i11) + f11);
            i13++;
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void onPageSelected(int i11) {
    }
}
