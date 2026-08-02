package androidx.recyclerview.widget;

/* loaded from: classes7.dex */
class ItemTouchUIUtilImpl implements androidx.recyclerview.widget.ItemTouchUIUtil {
    static final androidx.recyclerview.widget.ItemTouchUIUtil getHighSpeedVideoSizes = new androidx.recyclerview.widget.ItemTouchUIUtilImpl();

    @Override // androidx.recyclerview.widget.ItemTouchUIUtil
    public void onDrawOver(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, android.view.View view, float f, float f2, int i, boolean z) {
    }

    @Override // androidx.recyclerview.widget.ItemTouchUIUtil
    public void onSelected(android.view.View view) {
    }

    ItemTouchUIUtilImpl() {
    }

    @Override // androidx.recyclerview.widget.ItemTouchUIUtil
    public void onDraw(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, android.view.View view, float f, float f2, int i, boolean z) {
        if (z && view.getTag(androidx.recyclerview.R.id.item_touch_helper_previous_elevation) == null) {
            float elevation = androidx.core.view.ViewCompat.getElevation(view);
            int childCount = recyclerView.getChildCount();
            float f3 = 0.0f;
            for (int i2 = 0; i2 < childCount; i2++) {
                android.view.View childAt = recyclerView.getChildAt(i2);
                if (childAt != view) {
                    float elevation2 = androidx.core.view.ViewCompat.getElevation(childAt);
                    if (elevation2 > f3) {
                        f3 = elevation2;
                    }
                }
            }
            androidx.core.view.ViewCompat.setElevation(view, f3 + 1.0f);
            view.setTag(androidx.recyclerview.R.id.item_touch_helper_previous_elevation, java.lang.Float.valueOf(elevation));
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }

    @Override // androidx.recyclerview.widget.ItemTouchUIUtil
    public void clearView(android.view.View view) {
        java.lang.Object tag = view.getTag(androidx.recyclerview.R.id.item_touch_helper_previous_elevation);
        if (tag instanceof java.lang.Float) {
            androidx.core.view.ViewCompat.setElevation(view, ((java.lang.Float) tag).floatValue());
        }
        view.setTag(androidx.recyclerview.R.id.item_touch_helper_previous_elevation, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }
}
