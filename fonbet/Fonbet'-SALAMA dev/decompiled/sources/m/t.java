package m;

import android.widget.PopupWindow;

/* loaded from: classes.dex */
public final class t implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f15190a;

    public t(v vVar) {
        this.f15190a = vVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f15190a.c();
    }
}
