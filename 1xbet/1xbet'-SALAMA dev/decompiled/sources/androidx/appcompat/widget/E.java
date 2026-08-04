package androidx.appcompat.widget;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import p058i.C0907d;
import p058i.DialogInterfaceC0910g;

/* JADX INFO: loaded from: classes.dex */
public final class E implements K, DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DialogInterfaceC0910g f8335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public F f8336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f8337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppCompatSpinner f8338d;

    public E(AppCompatSpinner appCompatSpinner) {
        this.f8338d = appCompatSpinner;
    }

    @Override // androidx.appcompat.widget.K
    public final boolean b() {
        DialogInterfaceC0910g dialogInterfaceC0910g = this.f8335a;
        if (dialogInterfaceC0910g != null) {
            return dialogInterfaceC0910g.isShowing();
        }
        return false;
    }

    @Override // androidx.appcompat.widget.K
    public final int c() {
        return 0;
    }

    @Override // androidx.appcompat.widget.K
    public final void dismiss() {
        DialogInterfaceC0910g dialogInterfaceC0910g = this.f8335a;
        if (dialogInterfaceC0910g != null) {
            dialogInterfaceC0910g.dismiss();
            this.f8335a = null;
        }
    }

    @Override // androidx.appcompat.widget.K
    public final void e(int i7) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // androidx.appcompat.widget.K
    public final CharSequence f() {
        return this.f8337c;
    }

    @Override // androidx.appcompat.widget.K
    public final Drawable g() {
        return null;
    }

    @Override // androidx.appcompat.widget.K
    public final void i(CharSequence charSequence) {
        this.f8337c = charSequence;
    }

    @Override // androidx.appcompat.widget.K
    public final void j(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // androidx.appcompat.widget.K
    public final void k(int i7) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // androidx.appcompat.widget.K
    public final void l(int i7) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // androidx.appcompat.widget.K
    public final void m(int i7, int i8) {
        if (this.f8336b == null) {
            return;
        }
        AppCompatSpinner appCompatSpinner = this.f8338d;
        B.v vVar = new B.v(appCompatSpinner.getPopupContext());
        CharSequence charSequence = this.f8337c;
        C0907d c0907d = (C0907d) vVar.f966c;
        if (charSequence != null) {
            c0907d.f13665d = charSequence;
        }
        F f7 = this.f8336b;
        int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
        c0907d.f13673m = f7;
        c0907d.f13674n = this;
        c0907d.f13676p = selectedItemPosition;
        c0907d.f13675o = true;
        DialogInterfaceC0910g dialogInterfaceC0910gE = vVar.e();
        this.f8335a = dialogInterfaceC0910gE;
        AlertController$RecycleListView alertController$RecycleListView = dialogInterfaceC0910gE.f13710f.f13688f;
        C.d(alertController$RecycleListView, i7);
        C.c(alertController$RecycleListView, i8);
        this.f8335a.show();
    }

    @Override // androidx.appcompat.widget.K
    public final int n() {
        return 0;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        AppCompatSpinner appCompatSpinner = this.f8338d;
        appCompatSpinner.setSelection(i7);
        if (appCompatSpinner.getOnItemClickListener() != null) {
            appCompatSpinner.performItemClick(null, i7, this.f8336b.getItemId(i7));
        }
        dismiss();
    }

    @Override // androidx.appcompat.widget.K
    public final void p(ListAdapter listAdapter) {
        this.f8336b = (F) listAdapter;
    }
}
