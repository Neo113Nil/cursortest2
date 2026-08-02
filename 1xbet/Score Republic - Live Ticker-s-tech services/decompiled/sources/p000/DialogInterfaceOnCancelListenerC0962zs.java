package p000;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.C0031b;
import live.football.scorerepublic.R;

/* JADX INFO: renamed from: zs */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0962zs extends c50 implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: f0 */
    public final DialogInterfaceOnCancelListenerC0851ws f9925f0;

    /* JADX INFO: renamed from: g0 */
    public final DialogInterfaceOnDismissListenerC0888xs f9926g0;

    /* JADX INFO: renamed from: h0 */
    public int f9927h0;

    /* JADX INFO: renamed from: i0 */
    public int f9928i0;

    /* JADX INFO: renamed from: j0 */
    public boolean f9929j0;

    /* JADX INFO: renamed from: k0 */
    public boolean f9930k0;

    /* JADX INFO: renamed from: l0 */
    public int f9931l0;

    /* JADX INFO: renamed from: m0 */
    public boolean f9932m0;

    /* JADX INFO: renamed from: n0 */
    public final b90 f9933n0;

    /* JADX INFO: renamed from: o0 */
    public Dialog f9934o0;

    /* JADX INFO: renamed from: p0 */
    public boolean f9935p0;

    /* JADX INFO: renamed from: q0 */
    public boolean f9936q0;

    /* JADX INFO: renamed from: r0 */
    public boolean f9937r0;

    /* JADX INFO: renamed from: s0 */
    public boolean f9938s0;

    public DialogInterfaceOnCancelListenerC0962zs() {
        new RunnableC0897y0(6, this);
        this.f9925f0 = new DialogInterfaceOnCancelListenerC0851ws(this);
        this.f9926g0 = new DialogInterfaceOnDismissListenerC0888xs(this);
        this.f9927h0 = 0;
        this.f9928i0 = 0;
        this.f9929j0 = true;
        this.f9930k0 = true;
        this.f9931l0 = -1;
        this.f9933n0 = new b90(18, this);
        this.f9938s0 = false;
    }

    @Override // p000.c50
    /* JADX INFO: renamed from: A */
    public final void mo853A(Bundle bundle) {
        Bundle bundle2;
        this.f1110N = true;
        if (this.f9934o0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f9934o0.onRestoreInstanceState(bundle2);
    }

    @Override // p000.c50
    /* JADX INFO: renamed from: B */
    public final void mo854B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.mo854B(layoutInflater, viewGroup, bundle);
        if (this.f1112P != null || this.f9934o0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f9934o0.onRestoreInstanceState(bundle2);
    }

    /* JADX INFO: renamed from: G */
    public Dialog mo4512G() {
        if (t50.m4691J(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new DialogC0362jk(m856D(), this.f9928i0);
    }

    @Override // p000.c50
    /* JADX INFO: renamed from: e */
    public final o80 mo863e() {
        return new C0925ys(this, new a50(this));
    }

    @Override // p000.c50
    /* JADX INFO: renamed from: o */
    public final void mo873o() {
        this.f1110N = true;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.f9935p0) {
            return;
        }
        if (t50.m4691J(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.f9936q0) {
            return;
        }
        this.f9936q0 = true;
        this.f9937r0 = false;
        Dialog dialog = this.f9934o0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f9934o0.dismiss();
        }
        this.f9935p0 = true;
        if (this.f9931l0 >= 0) {
            t50 t50VarM868j = m868j();
            int i = this.f9931l0;
            if (i < 0) {
                C0270h1.m2190f(j11.m2773h("Bad id: ", i));
                return;
            } else {
                t50VarM868j.m4745y(new r50(t50VarM868j, i), true);
                this.f9931l0 = -1;
                return;
            }
        }
        C0722ta c0722ta = new C0722ta(m868j());
        c0722ta.f7388o = true;
        t50 t50Var = this.f1099C;
        if (t50Var == null || t50Var == c0722ta.f7390q) {
            c0722ta.m4774b(new b60(3, this));
            c0722ta.m4777e(true, true);
        } else {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
    }

    @Override // p000.c50
    /* JADX INFO: renamed from: q */
    public final void mo875q(Context context) {
        super.mo875q(context);
        this.f1122Z.m447d(this.f9933n0);
        if (this.f9937r0) {
            return;
        }
        this.f9936q0 = false;
    }

    @Override // p000.c50
    /* JADX INFO: renamed from: r */
    public final void mo876r(Bundle bundle) {
        super.mo876r(bundle);
        new Handler();
        this.f9930k0 = this.f1104H == 0;
        if (bundle != null) {
            this.f9927h0 = bundle.getInt("android:style", 0);
            this.f9928i0 = bundle.getInt("android:theme", 0);
            this.f9929j0 = bundle.getBoolean("android:cancelable", true);
            this.f9930k0 = bundle.getBoolean("android:showsDialog", this.f9930k0);
            this.f9931l0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // p000.c50
    /* JADX INFO: renamed from: s */
    public final void mo877s() {
        this.f1110N = true;
        Dialog dialog = this.f9934o0;
        if (dialog != null) {
            this.f9935p0 = true;
            dialog.setOnDismissListener(null);
            this.f9934o0.dismiss();
            if (!this.f9936q0) {
                onDismiss(this.f9934o0);
            }
            this.f9934o0 = null;
            this.f9938s0 = false;
        }
    }

    @Override // p000.c50
    /* JADX INFO: renamed from: t */
    public final void mo878t() {
        this.f1110N = true;
        if (!this.f9937r0 && !this.f9936q0) {
            this.f9936q0 = true;
        }
        C0031b c0031b = this.f1122Z;
        c0031b.getClass();
        C0031b.m444a("removeObserver");
        gj0 gj0Var = (gj0) c0031b.f559b.mo2354c(this.f9933n0);
        if (gj0Var == null) {
            return;
        }
        gj0Var.mo435e();
        gj0Var.m2100b(false);
    }

    @Override // p000.c50
    /* JADX INFO: renamed from: u */
    public final LayoutInflater mo879u(Bundle bundle) {
        LayoutInflater layoutInflaterMo879u = super.mo879u(bundle);
        boolean z = this.f9930k0;
        if (z && !this.f9932m0) {
            if (z && !this.f9938s0) {
                try {
                    this.f9932m0 = true;
                    Dialog dialogMo4512G = mo4512G();
                    this.f9934o0 = dialogMo4512G;
                    AbstractActivityC0790v4 abstractActivityC0790v4 = null;
                    if (this.f9930k0) {
                        int i = this.f9927h0;
                        if (i == 1 || i == 2) {
                            dialogMo4512G.requestWindowFeature(1);
                        } else if (i == 3) {
                            Window window = dialogMo4512G.getWindow();
                            if (window != null) {
                                window.addFlags(24);
                            }
                            dialogMo4512G.requestWindowFeature(1);
                        }
                        e50 e50Var = this.f1100D;
                        if (e50Var != null) {
                            abstractActivityC0790v4 = e50Var.f1952o;
                        }
                        if (abstractActivityC0790v4 != null) {
                            this.f9934o0.setOwnerActivity(abstractActivityC0790v4);
                        }
                        this.f9934o0.setCancelable(this.f9929j0);
                        this.f9934o0.setOnCancelListener(this.f9925f0);
                        this.f9934o0.setOnDismissListener(this.f9926g0);
                        this.f9938s0 = true;
                    } else {
                        this.f9934o0 = null;
                    }
                    this.f9932m0 = false;
                } catch (Throwable th) {
                    this.f9932m0 = false;
                    throw th;
                }
            }
            if (t50.m4691J(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f9934o0;
            if (dialog != null) {
                return layoutInflaterMo879u.cloneInContext(dialog.getContext());
            }
        } else if (t50.m4691J(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.f9930k0) {
                Log.d("FragmentManager", "mShowsDialog = false: ".concat(str));
                return layoutInflaterMo879u;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: ".concat(str));
        }
        return layoutInflaterMo879u;
    }

    @Override // p000.c50
    /* JADX INFO: renamed from: w */
    public final void mo881w(Bundle bundle) {
        Dialog dialog = this.f9934o0;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.f9927h0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f9928i0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.f9929j0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.f9930k0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.f9931l0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // p000.c50
    /* JADX INFO: renamed from: x */
    public final void mo882x() {
        this.f1110N = true;
        Dialog dialog = this.f9934o0;
        if (dialog != null) {
            this.f9935p0 = false;
            dialog.show();
            View decorView = this.f9934o0.getWindow().getDecorView();
            decorView.getClass();
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // p000.c50
    /* JADX INFO: renamed from: y */
    public final void mo883y() {
        this.f1110N = true;
        Dialog dialog = this.f9934o0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }
}
