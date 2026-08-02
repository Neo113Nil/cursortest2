package Fm0;

import android.database.DataSetObserver;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;
import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;

/* loaded from: classes4.dex */
public final class g extends ru.tinkoff.scrollingpagerindicator.a<ViewPager> {

    /* renamed from: a, reason: collision with root package name */
    private DataSetObserver f9524a;

    /* renamed from: b, reason: collision with root package name */
    private ViewPager.j f9525b;

    /* renamed from: c, reason: collision with root package name */
    private ViewPager f9526c;

    /* renamed from: d, reason: collision with root package name */
    private androidx.viewpager.widget.a f9527d;

    static void a(g gVar, ScrollingPagerIndicator scrollingPagerIndicator) {
        scrollingPagerIndicator.m(gVar.f9527d.getCount());
        scrollingPagerIndicator.k(gVar.f9526c.getCurrentItem());
    }

    @Override // ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator.b
    public final void attachToPager(@NonNull ScrollingPagerIndicator scrollingPagerIndicator, @NonNull Object obj) {
        ViewPager viewPager = (ViewPager) obj;
        androidx.viewpager.widget.a adapter = viewPager.getAdapter();
        this.f9527d = adapter;
        if (adapter == null) {
            throw new IllegalStateException("Set adapter before call attachToPager() method");
        }
        this.f9526c = viewPager;
        scrollingPagerIndicator.m(adapter.getCount());
        scrollingPagerIndicator.k(this.f9526c.getCurrentItem());
        e eVar = new e(scrollingPagerIndicator);
        this.f9524a = eVar;
        this.f9527d.registerDataSetObserver(eVar);
        f fVar = new f(this, scrollingPagerIndicator);
        this.f9525b = fVar;
        viewPager.addOnPageChangeListener(fVar);
    }

    @Override // ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator.b
    public final void detachFromPager() {
        this.f9527d.unregisterDataSetObserver(this.f9524a);
        this.f9526c.removeOnPageChangeListener(this.f9525b);
    }
}
