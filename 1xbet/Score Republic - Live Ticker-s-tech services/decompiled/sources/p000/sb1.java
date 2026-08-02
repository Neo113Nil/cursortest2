package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class sb1 extends DialogInterfaceOnCancelListenerC0962zs {

    /* JADX INFO: renamed from: t0 */
    public Dialog f7090t0;

    /* JADX INFO: renamed from: u0 */
    public DialogInterface.OnCancelListener f7091u0;

    /* JADX INFO: renamed from: v0 */
    public AlertDialog f7092v0;

    @Override // p000.DialogInterfaceOnCancelListenerC0962zs
    /* JADX INFO: renamed from: G */
    public final Dialog mo4512G() {
        Dialog dialog = this.f7090t0;
        if (dialog != null) {
            return dialog;
        }
        this.f9930k0 = false;
        if (this.f7092v0 == null) {
            e50 e50Var = this.f1100D;
            AbstractActivityC0790v4 abstractActivityC0790v4 = e50Var == null ? null : e50Var.f1952o;
            p80.m3863h(abstractActivityC0790v4);
            this.f7092v0 = new AlertDialog.Builder(abstractActivityC0790v4).create();
        }
        return this.f7092v0;
    }

    @Override // p000.DialogInterfaceOnCancelListenerC0962zs, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f7091u0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
