package Fm0;

import androidx.viewpager.widget.ViewPager;
import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;

/* loaded from: classes4.dex */
final class f implements ViewPager.j {

    /* renamed from: a, reason: collision with root package name */
    boolean f9521a = true;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ScrollingPagerIndicator f9522b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ g f9523c;

    f(g gVar, ScrollingPagerIndicator scrollingPagerIndicator) {
        this.f9523c = gVar;
        this.f9522b = scrollingPagerIndicator;
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageScrollStateChanged(int i11) {
        this.f9521a = i11 == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0010, code lost:
    
        if (r3 > 1.0f) goto L4;
     */
    @Override // androidx.viewpager.widget.ViewPager.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onPageScrolled(int i11, float f7, int i12) {
        this.f9523c.getClass();
        float f11 = f7 >= 0.0f ? 1.0f : 0.0f;
        f7 = f11;
        this.f9522b.h(i11, f7);
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageSelected(int i11) {
        if (this.f9521a) {
            g.a(this.f9523c, this.f9522b);
        }
    }
}
