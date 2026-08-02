package androidx.appcompat.widget;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import i.C1226d;
import i.DialogInterfaceC1229g;

/* loaded from: classes.dex */
public final class E implements K, DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public DialogInterfaceC1229g f8335a;

    /* renamed from: b, reason: collision with root package name */
    public F f8336b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f8337c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppCompatSpinner f8338d;

    public E(AppCompatSpinner appCompatSpinner) {
        this.f8338d = appCompatSpinner;
    }

    @Override // androidx.appcompat.widget.K
    public final boolean b() {
        DialogInterfaceC1229g dialogInterfaceC1229g = this.f8335a;
        if (dialogInterfaceC1229g != null) {
            return dialogInterfaceC1229g.isShowing();
        }
        return false;
    }

    @Override // androidx.appcompat.widget.K
    public final int c() {
        return 0;
    }

    @Override // androidx.appcompat.widget.K
    public final void dismiss() {
        DialogInterfaceC1229g dialogInterfaceC1229g = this.f8335a;
        if (dialogInterfaceC1229g != null) {
            dialogInterfaceC1229g.dismiss();
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
        C1226d c1226d = (C1226d) vVar.f966c;
        if (charSequence != null) {
            c1226d.f13659d = charSequence;
        }
        F f7 = this.f8336b;
        int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
        c1226d.f13667m = f7;
        c1226d.f13668n = this;
        c1226d.f13670p = selectedItemPosition;
        c1226d.f13669o = true;
        DialogInterfaceC1229g e7 = vVar.e();
        this.f8335a = e7;
        AlertController$RecycleListView alertController$RecycleListView = e7.f13704f.f13682f;
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
