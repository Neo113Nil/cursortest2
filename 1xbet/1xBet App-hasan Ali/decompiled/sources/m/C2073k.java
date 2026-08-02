package m;

import android.widget.PopupWindow;

/* renamed from: m.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2073k implements PopupWindow.OnDismissListener {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C2074l f17951k;

    public C2073k(C2074l c2074l) {
        this.f17951k = c2074l;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f17951k.c();
    }
}
