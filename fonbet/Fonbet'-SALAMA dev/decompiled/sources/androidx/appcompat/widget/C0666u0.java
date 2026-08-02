package androidx.appcompat.widget;

import android.os.Handler;
import android.widget.AbsListView;

/* renamed from: androidx.appcompat.widget.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0666u0 implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ListPopupWindow f8749a;

    public C0666u0(ListPopupWindow listPopupWindow) {
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
            RunnableC0664t0 runnableC0664t0 = listPopupWindow.f8389H;
            handler.removeCallbacks(runnableC0664t0);
            runnableC0664t0.run();
        }
    }
}
