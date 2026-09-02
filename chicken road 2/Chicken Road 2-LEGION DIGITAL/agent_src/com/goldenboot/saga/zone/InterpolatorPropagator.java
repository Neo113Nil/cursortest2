package com.goldenboot.saga.zone;

import android.widget.ListView;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public class InterpolatorPropagator extends ThemeExporter {
    public final ListView filterPayload;

    public InterpolatorPropagator(ListView listView) {
        super(listView);
        this.filterPayload = listView;
    }

    @Override // com.goldenboot.saga.zone.ThemeExporter
    public boolean evictLayout(int i) {
        return false;
    }

    @Override // com.goldenboot.saga.zone.ThemeExporter
    public boolean growPayload(int i) {
        ListView listView = this.filterPayload;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (i > 0) {
            if (i2 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // com.goldenboot.saga.zone.ThemeExporter
    public void popBlueprint(int i, int i2) {
        this.filterPayload.scrollListBy(i2);
    }
}
