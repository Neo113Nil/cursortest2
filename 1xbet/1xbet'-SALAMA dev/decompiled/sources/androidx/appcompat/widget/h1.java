package androidx.appcompat.widget;

import android.content.Context;
import android.view.View;
import android.view.Window;
import p086m.C0924a;

/* JADX INFO: loaded from: classes.dex */
public final class h1 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0924a f8631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j1 f8632b;

    public h1(j1 j1Var) {
        this.f8632b = j1Var;
        Context context = j1Var.f8662a.getContext();
        CharSequence charSequence = j1Var.f8669h;
        C0924a c0924a = new C0924a();
        c0924a.f15078e = 4096;
        c0924a.f15080x = 4096;
        c0924a.f15069C = null;
        c0924a.f15070D = null;
        c0924a.f15071E = false;
        c0924a.f15072F = false;
        c0924a.f15073G = 16;
        c0924a.f15082z = context;
        c0924a.f15074a = charSequence;
        this.f8631a = c0924a;
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
