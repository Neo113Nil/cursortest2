package Fm0;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;

/* loaded from: classes4.dex */
public final class d extends ru.tinkoff.scrollingpagerindicator.a<ViewPager2> {

    /* renamed from: a, reason: collision with root package name */
    private RecyclerView.i f9516a;

    /* renamed from: b, reason: collision with root package name */
    private RecyclerView.g f9517b;

    /* renamed from: c, reason: collision with root package name */
    private ViewPager2.g f9518c;

    /* renamed from: d, reason: collision with root package name */
    private ViewPager2 f9519d;

    static void a(d dVar, ScrollingPagerIndicator scrollingPagerIndicator) {
        scrollingPagerIndicator.m(dVar.f9517b.getItemCount());
        scrollingPagerIndicator.k(dVar.f9519d.f());
    }

    @Override // ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator.b
    public final void attachToPager(@NonNull ScrollingPagerIndicator scrollingPagerIndicator, @NonNull Object obj) {
        ViewPager2 viewPager2 = (ViewPager2) obj;
        RecyclerView.g e11 = viewPager2.e();
        this.f9517b = e11;
        if (e11 == null) {
            throw new IllegalStateException("Set adapter before call attachToPager() method");
        }
        this.f9519d = viewPager2;
        scrollingPagerIndicator.m(e11.getItemCount());
        scrollingPagerIndicator.k(this.f9519d.f());
        b bVar = new b(scrollingPagerIndicator);
        this.f9516a = bVar;
        this.f9517b.registerAdapterDataObserver(bVar);
        c cVar = new c(this, scrollingPagerIndicator);
        this.f9518c = cVar;
        viewPager2.p(cVar);
    }

    @Override // ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator.b
    public final void detachFromPager() {
        this.f9517b.unregisterAdapterDataObserver(this.f9516a);
        this.f9519d.A(this.f9518c);
    }
}
