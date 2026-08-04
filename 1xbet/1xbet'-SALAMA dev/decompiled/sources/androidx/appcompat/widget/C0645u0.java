package androidx.appcompat.widget;

import android.os.Handler;
import android.widget.AbsListView;

/* JADX INFO: renamed from: androidx.appcompat.widget.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0645u0 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ListPopupWindow f8749a;

    public C0645u0(ListPopupWindow listPopupWindow) {
        this.f8749a = listPopupWindow;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i7, int i8, int i9) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i7) {
        if (i7 == 1) {
            ListPopupWindow listPopupWindow = this.f8749a;
            if (listPopupWindow.f8397P.getInputMethodMode() == 2 || listPopupWindow.f8397P.getContentView() == null) {
                return;
            }
            Handler handler = listPopupWindow.f8393L;
            RunnableC0643t0 runnableC0643t0 = listPopupWindow.f8389H;
            handler.removeCallbacks(runnableC0643t0);
            runnableC0643t0.run();
        }
    }
}
