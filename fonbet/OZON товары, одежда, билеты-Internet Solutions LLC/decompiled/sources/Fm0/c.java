package Fm0;

import androidx.viewpager2.widget.ViewPager2;
import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;

/* loaded from: classes4.dex */
final class c extends ViewPager2.g {

    /* renamed from: a, reason: collision with root package name */
    boolean f9513a = true;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ScrollingPagerIndicator f9514b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ d f9515c;

    c(d dVar, ScrollingPagerIndicator scrollingPagerIndicator) {
        this.f9515c = dVar;
        this.f9514b = scrollingPagerIndicator;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void onPageScrollStateChanged(int i11) {
        this.f9513a = i11 == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0010, code lost:
    
        if (r3 > 1.0f) goto L4;
     */
    @Override // androidx.viewpager2.widget.ViewPager2.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onPageScrolled(int i11, float f7, int i12) {
        this.f9515c.getClass();
        float f11 = f7 >= 0.0f ? 1.0f : 0.0f;
        f7 = f11;
        this.f9514b.h(i11, f7);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void onPageSelected(int i11) {
        if (this.f9513a) {
            d.a(this.f9515c, this.f9514b);
        }
    }
}
