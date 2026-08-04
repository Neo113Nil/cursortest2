package p086m;

import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public final class t implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f15196a;

    public t(v vVar) {
        this.f15196a = vVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f15196a.c();
    }
}
