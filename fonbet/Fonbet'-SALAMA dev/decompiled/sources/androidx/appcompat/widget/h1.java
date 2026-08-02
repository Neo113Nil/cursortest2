package androidx.appcompat.widget;

import android.content.Context;
import android.view.View;
import android.view.Window;
import m.C1417a;

/* loaded from: classes.dex */
public final class h1 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final C1417a f8631a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j1 f8632b;

    public h1(j1 j1Var) {
        this.f8632b = j1Var;
        Context context = j1Var.f8662a.getContext();
        CharSequence charSequence = j1Var.f8669h;
        C1417a c1417a = new C1417a();
        c1417a.f15072e = 4096;
        c1417a.f15074x = 4096;
        c1417a.f15063C = null;
        c1417a.f15064D = null;
        c1417a.f15065E = false;
        c1417a.f15066F = false;
        c1417a.f15067G = 16;
        c1417a.f15076z = context;
        c1417a.f15068a = charSequence;
        this.f8631a = c1417a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        j1 j1Var = this.f8632b;
        Window.Callback callback = j1Var.f8671k;
        if (callback == null || !j1Var.f8672l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f8631a);
    }
}
