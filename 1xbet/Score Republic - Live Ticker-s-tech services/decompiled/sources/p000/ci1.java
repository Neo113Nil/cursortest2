package p000;

import android.view.View;
import android.widget.ScrollView;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ci1 {

    /* JADX INFO: renamed from: a */
    public View f1262a;

    /* JADX INFO: renamed from: b */
    public boolean f1263b;

    /* JADX INFO: renamed from: c */
    public int f1264c;

    /* JADX INFO: renamed from: a */
    public final int m947a() {
        View view = this.f1262a;
        if (view.getVisibility() == 8) {
            return 0;
        }
        if (!(view instanceof ScrollView)) {
            return view.getMeasuredHeight();
        }
        ScrollView scrollView = (ScrollView) view;
        return scrollView.getChildAt(0).getMeasuredHeight() + scrollView.getPaddingTop() + scrollView.getPaddingBottom();
    }
}
