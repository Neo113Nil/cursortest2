package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.C0750y;
import com.salamadev.khotabaljomo3a.kichkabdelhamid.R;
import o.C1485c;

/* renamed from: androidx.fragment.app.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0718q extends AbstractComponentCallbacksC0722v implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: j0, reason: collision with root package name */
    public final DialogInterfaceOnCancelListenerC0715n f9477j0;

    /* renamed from: k0, reason: collision with root package name */
    public final DialogInterfaceOnDismissListenerC0716o f9478k0;

    /* renamed from: l0, reason: collision with root package name */
    public int f9479l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f9480m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f9481n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f9482o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f9483p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f9484q0;

    /* renamed from: r0, reason: collision with root package name */
    public final G f9485r0;

    /* renamed from: s0, reason: collision with root package name */
    public Dialog f9486s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f9487t0;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f9488u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f9489v0;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f9490w0;

    public DialogInterfaceOnCancelListenerC0718q() {
        new RunnableC0714m(this, 0);
        this.f9477j0 = new DialogInterfaceOnCancelListenerC0715n(this);
        this.f9478k0 = new DialogInterfaceOnDismissListenerC0716o(this);
        this.f9479l0 = 0;
        this.f9480m0 = 0;
        this.f9481n0 = true;
        this.f9482o0 = true;
        this.f9483p0 = -1;
        this.f9485r0 = new G(this, 3);
        this.f9490w0 = false;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0722v
    public final void A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.A(layoutInflater, viewGroup, bundle);
        if (this.f9486s0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f9486s0.onRestoreInstanceState(bundle2);
    }

    public Dialog E() {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new androidx.activity.p(B(), this.f9480m0);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0722v
    public final C d() {
        return new C0717p(this, new C0719s(this));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0722v
    public final void o() {
        this.f9524U = true;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.f9487t0) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.f9488u0) {
            return;
        }
        this.f9488u0 = true;
        this.f9489v0 = false;
        Dialog dialog = this.f9486s0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f9486s0.dismiss();
        }
        this.f9487t0 = true;
        if (this.f9483p0 >= 0) {
            Q i7 = i();
            int i8 = this.f9483p0;
            if (i8 < 0) {
                throw new IllegalArgumentException(e1.k.d(i8, "Bad id: "));
            }
            i7.y(new O(i7, i8), true);
            this.f9483p0 = -1;
            return;
        }
        C0702a c0702a = new C0702a(i());
        c0702a.f9444o = true;
        Q q7 = this.f9513J;
        if (q7 == null || q7 == c0702a.f9445p) {
            c0702a.b(new W(3, this));
            c0702a.d(true);
        } else {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0722v
    public final void q(A a2) {
        Object obj;
        super.q(a2);
        androidx.lifecycle.B b7 = this.f9538e0;
        b7.getClass();
        androidx.lifecycle.B.a("observeForever");
        G g3 = this.f9485r0;
        C0750y c0750y = new C0750y(b7, g3);
        o.f fVar = b7.f9562b;
        C1485c l7 = fVar.l(g3);
        if (l7 != null) {
            obj = l7.f15520b;
        } else {
            C1485c c1485c = new C1485c(g3, c0750y);
            fVar.f15529d++;
            C1485c c1485c2 = fVar.f15527b;
            if (c1485c2 == null) {
                fVar.f15526a = c1485c;
                fVar.f15527b = c1485c;
            } else {
                c1485c2.f15521c = c1485c;
                c1485c.f15522d = c1485c2;
                fVar.f15527b = c1485c;
            }
            obj = null;
        }
        androidx.lifecycle.A a4 = (androidx.lifecycle.A) obj;
        if (a4 instanceof androidx.lifecycle.z) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (a4 == null) {
            c0750y.b(true);
        }
        if (this.f9489v0) {
            return;
        }
        this.f9488u0 = false;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0722v
    public final void r(Bundle bundle) {
        super.r(bundle);
        new Handler();
        this.f9482o0 = this.f9518O == 0;
        if (bundle != null) {
            this.f9479l0 = bundle.getInt("android:style", 0);
            this.f9480m0 = bundle.getInt("android:theme", 0);
            this.f9481n0 = bundle.getBoolean("android:cancelable", true);
            this.f9482o0 = bundle.getBoolean("android:showsDialog", this.f9482o0);
            this.f9483p0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0722v
    public final void t() {
        this.f9524U = true;
        Dialog dialog = this.f9486s0;
        if (dialog != null) {
            this.f9487t0 = true;
            dialog.setOnDismissListener(null);
            this.f9486s0.dismiss();
            if (!this.f9488u0) {
                onDismiss(this.f9486s0);
            }
            this.f9486s0 = null;
            this.f9490w0 = false;
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0722v
    public final void u() {
        this.f9524U = true;
        if (!this.f9489v0 && !this.f9488u0) {
            this.f9488u0 = true;
        }
        this.f9538e0.h(this.f9485r0);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048 A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:10:0x001a, B:12:0x0027, B:18:0x003f, B:22:0x0048, B:23:0x0050, B:25:0x0044, B:26:0x0031, B:28:0x0037, B:29:0x003c, B:30:0x0068), top: B:9:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044 A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:10:0x001a, B:12:0x0027, B:18:0x003f, B:22:0x0048, B:23:0x0050, B:25:0x0044, B:26:0x0031, B:28:0x0037, B:29:0x003c, B:30:0x0068), top: B:9:0x001a }] */
    @Override // androidx.fragment.app.AbstractComponentCallbacksC0722v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LayoutInflater v(Bundle bundle) {
        C0726z c0726z;
        LayoutInflater v6 = super.v(bundle);
        boolean z4 = this.f9482o0;
        if (!z4 || this.f9484q0) {
            if (Log.isLoggable("FragmentManager", 2)) {
                String str = "getting layout inflater for DialogFragment " + this;
                if (this.f9482o0) {
                    Log.d("FragmentManager", "mCreatingDialog = true: " + str);
                } else {
                    Log.d("FragmentManager", "mShowsDialog = false: " + str);
                }
            }
            return v6;
        }
        if (z4 && !this.f9490w0) {
            try {
                this.f9484q0 = true;
                Dialog E7 = E();
                this.f9486s0 = E7;
                A a2 = null;
                if (this.f9482o0) {
                    int i7 = this.f9479l0;
                    if (i7 != 1 && i7 != 2) {
                        if (i7 == 3) {
                            Window window = E7.getWindow();
                            if (window != null) {
                                window.addFlags(24);
                            }
                        } else {
                            c0726z = this.f9514K;
                            if (c0726z == null) {
                                a2 = c0726z.f9552b;
                            }
                            if (a2 != null) {
                                this.f9486s0.setOwnerActivity(a2);
                            }
                            this.f9486s0.setCancelable(this.f9481n0);
                            this.f9486s0.setOnCancelListener(this.f9477j0);
                            this.f9486s0.setOnDismissListener(this.f9478k0);
                            this.f9490w0 = true;
                        }
                    }
                    E7.requestWindowFeature(1);
                    c0726z = this.f9514K;
                    if (c0726z == null) {
                    }
                    if (a2 != null) {
                    }
                    this.f9486s0.setCancelable(this.f9481n0);
                    this.f9486s0.setOnCancelListener(this.f9477j0);
                    this.f9486s0.setOnDismissListener(this.f9478k0);
                    this.f9490w0 = true;
                } else {
                    this.f9486s0 = null;
                }
                this.f9484q0 = false;
            } catch (Throwable th) {
                this.f9484q0 = false;
                throw th;
            }
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
        }
        Dialog dialog = this.f9486s0;
        return dialog != null ? v6.cloneInContext(dialog.getContext()) : v6;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0722v
    public final void x(Bundle bundle) {
        Dialog dialog = this.f9486s0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i7 = this.f9479l0;
        if (i7 != 0) {
            bundle.putInt("android:style", i7);
        }
        int i8 = this.f9480m0;
        if (i8 != 0) {
            bundle.putInt("android:theme", i8);
        }
        boolean z4 = this.f9481n0;
        if (!z4) {
            bundle.putBoolean("android:cancelable", z4);
        }
        boolean z7 = this.f9482o0;
        if (!z7) {
            bundle.putBoolean("android:showsDialog", z7);
        }
        int i9 = this.f9483p0;
        if (i9 != -1) {
            bundle.putInt("android:backStackId", i9);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0722v
    public final void y() {
        this.f9524U = true;
        Dialog dialog = this.f9486s0;
        if (dialog != null) {
            this.f9487t0 = false;
            dialog.show();
            View decorView = this.f9486s0.getWindow().getDecorView();
            t6.h.e(decorView, "<this>");
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0722v
    public final void z() {
        this.f9524U = true;
        Dialog dialog = this.f9486s0;
        if (dialog != null) {
            dialog.hide();
        }
    }
}
