package androidx.core.widget;

import android.widget.ListView;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public final class h extends a {

    /* renamed from: r, reason: collision with root package name */
    private final ListView f42429r;

    public h(@NonNull ListView listView) {
        super(listView);
        this.f42429r = listView;
    }

    @Override // androidx.core.widget.a
    public final boolean a(int i11) {
        ListView listView = this.f42429r;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i12 = firstVisiblePosition + childCount;
        if (i11 > 0) {
            if (i12 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i11 >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.core.widget.a
    public final void e(int i11) {
        this.f42429r.scrollListBy(i11);
    }
}
