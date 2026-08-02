package androidx.appcompat.widget;

import android.view.View;
import android.view.Window;
import m.C7974a;

/* loaded from: classes8.dex */
final class e0 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final C7974a f37905a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f0 f37906b;

    e0(f0 f0Var) {
        this.f37906b = f0Var;
        this.f37905a = new C7974a(f0Var.f37911a.getContext(), f0Var.f37918h);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        f0 f0Var = this.f37906b;
        Window.Callback callback = f0Var.f37921k;
        if (callback == null || !f0Var.f37922l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f37905a);
    }
}
