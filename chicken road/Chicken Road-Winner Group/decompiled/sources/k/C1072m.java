package k;

import android.widget.PopupWindow;

/* renamed from: k.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1072m implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1073n f9626a;

    public C1072m(C1073n c1073n) {
        this.f9626a = c1073n;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f9626a.c();
    }
}
