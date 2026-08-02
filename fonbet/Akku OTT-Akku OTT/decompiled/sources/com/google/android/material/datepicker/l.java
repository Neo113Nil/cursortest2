package com.google.android.material.datepicker;

import android.graphics.Canvas;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.util.Pair;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;

/* loaded from: classes4.dex */
public final class l extends RecyclerView.ItemDecoration {
    public final Calendar a = E.e(null);
    public final Calendar b = E.e(null);
    public final /* synthetic */ j c;

    public l(j jVar) {
        this.c = jVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        if ((recyclerView.getAdapter() instanceof G) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            G g = (G) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            j jVar = this.c;
            for (Pair<Long, Long> pair : jVar.c.g()) {
                Long l = pair.first;
                if (l != null && pair.second != null) {
                    long longValue = l.longValue();
                    Calendar calendar = this.a;
                    calendar.setTimeInMillis(longValue);
                    long longValue2 = pair.second.longValue();
                    Calendar calendar2 = this.b;
                    calendar2.setTimeInMillis(longValue2);
                    int i = calendar.get(1) - g.a.d.a.c;
                    int i2 = calendar2.get(1) - g.a.d.a.c;
                    View findViewByPosition = gridLayoutManager.findViewByPosition(i);
                    View findViewByPosition2 = gridLayoutManager.findViewByPosition(i2);
                    int spanCount = i / gridLayoutManager.getSpanCount();
                    int spanCount2 = i2 / gridLayoutManager.getSpanCount();
                    for (int i3 = spanCount; i3 <= spanCount2; i3++) {
                        View findViewByPosition3 = gridLayoutManager.findViewByPosition(gridLayoutManager.getSpanCount() * i3);
                        if (findViewByPosition3 != null) {
                            int top = findViewByPosition3.getTop() + jVar.j.d.a.top;
                            int bottom = findViewByPosition3.getBottom() - jVar.j.d.a.bottom;
                            canvas.drawRect((i3 != spanCount || findViewByPosition == null) ? 0 : (findViewByPosition.getWidth() / 2) + findViewByPosition.getLeft(), top, (i3 != spanCount2 || findViewByPosition2 == null) ? recyclerView.getWidth() : (findViewByPosition2.getWidth() / 2) + findViewByPosition2.getLeft(), bottom, jVar.j.h);
                        }
                    }
                }
            }
        }
    }
}
