package Fm0;

import androidx.recyclerview.widget.RecyclerView;
import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;

/* loaded from: classes4.dex */
final class b extends RecyclerView.i {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ScrollingPagerIndicator f9512a;

    b(ScrollingPagerIndicator scrollingPagerIndicator) {
        this.f9512a = scrollingPagerIndicator;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void onChanged() {
        this.f9512a.i();
    }
}
