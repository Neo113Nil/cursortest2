package Fm0;

import android.database.DataSetObserver;
import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;

/* loaded from: classes4.dex */
final class e extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ScrollingPagerIndicator f9520a;

    e(ScrollingPagerIndicator scrollingPagerIndicator) {
        this.f9520a = scrollingPagerIndicator;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.f9520a.i();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        onChanged();
    }
}
