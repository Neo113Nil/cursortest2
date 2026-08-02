package p000;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* JADX INFO: renamed from: gx */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class DialogFragmentC0265gx extends DialogFragment {

    /* JADX INFO: renamed from: j */
    public Dialog f2954j;

    /* JADX INFO: renamed from: k */
    public DialogInterface.OnCancelListener f2955k;

    /* JADX INFO: renamed from: l */
    public AlertDialog f2956l;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f2955k;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f2954j;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f2956l == null) {
            Activity activity = getActivity();
            p80.m3863h(activity);
            this.f2956l = new AlertDialog.Builder(activity).create();
        }
        return this.f2956l;
    }
}
