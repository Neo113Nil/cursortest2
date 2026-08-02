package androidx.core.widget;

/* loaded from: classes3.dex */
public class ListViewAutoScrollHelper extends androidx.core.widget.AutoScrollHelper {
    private final android.widget.ListView getHighSpeedVideoSizesFor;

    @Override // androidx.core.widget.AutoScrollHelper
    public boolean canTargetScrollHorizontally(int i) {
        return false;
    }

    public ListViewAutoScrollHelper(android.widget.ListView listView) {
        super(listView);
        this.getHighSpeedVideoSizesFor = listView;
    }

    @Override // androidx.core.widget.AutoScrollHelper
    public void scrollTargetBy(int i, int i2) {
        this.getHighSpeedVideoSizesFor.scrollListBy(i2);
    }

    @Override // androidx.core.widget.AutoScrollHelper
    public boolean canTargetScrollVertically(int i) {
        android.widget.ListView listView = this.getHighSpeedVideoSizesFor;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        if (i > 0) {
            if (firstVisiblePosition + childCount >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
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
}
