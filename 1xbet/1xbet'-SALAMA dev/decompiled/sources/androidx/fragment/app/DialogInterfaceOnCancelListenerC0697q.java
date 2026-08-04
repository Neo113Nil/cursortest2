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
import androidx.lifecycle.C0729y;
import com.salamadev.nabilalawadi.kisaskoran.R;

/* JADX INFO: renamed from: androidx.fragment.app.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0697q extends AbstractComponentCallbacksC0701v implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final DialogInterfaceOnCancelListenerC0694n f9477j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final DialogInterfaceOnDismissListenerC0695o f9478k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f9479l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public int f9480m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f9481n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public boolean f9482o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f9483p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f9484q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final G f9485r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public Dialog f9486s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f9487t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f9488u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f9489v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f9490w0;

    public DialogInterfaceOnCancelListenerC0697q() {
        new RunnableC0693m(this, 0);
        this.f9477j0 = new DialogInterfaceOnCancelListenerC0694n(this);
        this.f9478k0 = new DialogInterfaceOnDismissListenerC0695o(this);
        this.f9479l0 = 0;
        this.f9480m0 = 0;
        this.f9481n0 = true;
        this.f9482o0 = true;
        this.f9483p0 = -1;
        this.f9485r0 = new G(this, 3);
        this.f9490w0 = false;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0701v
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

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0701v
    public final C d() {
        return new C0696p(this, new C0698s(this));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0701v
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
            Q qI = i();
            int i7 = this.f9483p0;
            if (i7 < 0) {
                throw new IllegalArgumentException(p031e1.k.d(i7, "Bad id: "));
            }
            qI.y(new O(qI, i7), true);
            this.f9483p0 = -1;
            return;
        }
        C0681a c0681a = new C0681a(i());
        c0681a.f9444o = true;
        Q q7 = this.f9513J;
        if (q7 == null || q7 == c0681a.f9445p) {
            c0681a.b(new W(3, this));
            c0681a.d(true);
        } else {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0701v
    public final void q(A a2) {
        Object obj;
        super.q(a2);
        androidx.lifecycle.B b7 = this.f9538e0;
        b7.getClass();
        androidx.lifecycle.B.a("observeForever");
        G g3 = this.f9485r0;
        C0729y c0729y = new C0729y(b7, g3);
        p101o.f fVar = b7.f9562b;
        p101o.c cVarL = fVar.l(g3);
        if (cVarL != null) {
            obj = cVarL.f15526b;
        } else {
            p101o.c cVar = new p101o.c(g3, c0729y);
            fVar.f15535d++;
            p101o.c cVar2 = fVar.f15533b;
            if (cVar2 == null) {
                fVar.f15532a = cVar;
                fVar.f15533b = cVar;
            } else {
                cVar2.f15527c = cVar;
                cVar.f15528d = cVar2;
                fVar.f15533b = cVar;
            }
            obj = null;
        }
        androidx.lifecycle.A a4 = (androidx.lifecycle.A) obj;
        if (a4 instanceof androidx.lifecycle.z) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (a4 == null) {
            c0729y.b(true);
        }
        if (this.f9489v0) {
            return;
        }
        this.f9488u0 = false;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0701v
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

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0701v
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

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0701v
    public final void u() {
        this.f9524U = true;
        if (!this.f9489v0 && !this.f9488u0) {
            this.f9488u0 = true;
        }
        this.f9538e0.h(this.f9485r0);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0701v
    public final LayoutInflater v(Bundle bundle) {
        LayoutInflater layoutInflaterV = super.v(bundle);
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
            return layoutInflaterV;
        }
        if (z4 && !this.f9490w0) {
            try {
                this.f9484q0 = true;
                Dialog dialogE = E();
                this.f9486s0 = dialogE;
                A a2 = null;
                if (this.f9482o0) {
                    int i7 = this.f9479l0;
                    if (i7 == 1 || i7 == 2) {
                        dialogE.requestWindowFeature(1);
                    } else if (i7 == 3) {
                        Window window = dialogE.getWindow();
                        if (window != null) {
                            window.addFlags(24);
                        }
                        dialogE.requestWindowFeature(1);
                    }
                    C0705z c0705z = this.f9514K;
                    if (c0705z != null) {
                        a2 = c0705z.f9552b;
                    }
                    if (a2 != null) {
                        this.f9486s0.setOwnerActivity(a2);
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
        return dialog != null ? layoutInflaterV.cloneInContext(dialog.getContext()) : layoutInflaterV;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0701v
    public final void x(Bundle bundle) {
        Dialog dialog = this.f9486s0;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
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

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0701v
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

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0701v
    public final void z() {
        this.f9524U = true;
        Dialog dialog = this.f9486s0;
        if (dialog != null) {
            dialog.hide();
        }
    }
}
