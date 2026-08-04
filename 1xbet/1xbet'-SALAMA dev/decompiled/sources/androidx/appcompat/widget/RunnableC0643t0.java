package androidx.appcompat.widget;

import java.util.WeakHashMap;

/* JADX INFO: renamed from: androidx.appcompat.widget.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0643t0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ListPopupWindow f8745b;

    public /* synthetic */ RunnableC0643t0(ListPopupWindow listPopupWindow, int i7) {
        this.f8744a = i7;
        this.f8745b = listPopupWindow;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListPopupWindow listPopupWindow = this.f8745b;
        switch (this.f8744a) {
            case 0:
                C0628l0 c0628l0 = listPopupWindow.f8400c;
                if (c0628l0 != null) {
                    c0628l0.setListSelectionHidden(true);
                    c0628l0.requestLayout();
                }
                break;
            default:
                C0628l0 c0628l1 = listPopupWindow.f8400c;
                if (c0628l1 != null) {
                    WeakHashMap weakHashMap = P.U.f5037a;
                    if (c0628l1.isAttachedToWindow() && listPopupWindow.f8400c.getCount() > listPopupWindow.f8400c.getChildCount() && listPopupWindow.f8400c.getChildCount() <= listPopupWindow.f8385D) {
                        listPopupWindow.f8397P.setInputMethodMode(2);
                        listPopupWindow.show();
                        break;
                    }
                }
                break;
        }
    }
}
