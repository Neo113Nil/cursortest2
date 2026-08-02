package j3;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import m3.v;

/* loaded from: classes.dex */
public class c extends DialogFragment {

    /* renamed from: k, reason: collision with root package name */
    public AlertDialog f17505k;

    /* renamed from: l, reason: collision with root package name */
    public DialogInterface.OnCancelListener f17506l;

    /* renamed from: m, reason: collision with root package name */
    public AlertDialog f17507m;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f17506l;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog alertDialog = this.f17505k;
        if (alertDialog != null) {
            return alertDialog;
        }
        setShowsDialog(false);
        if (this.f17507m == null) {
            Activity activity = getActivity();
            v.e(activity);
            this.f17507m = new AlertDialog.Builder(activity).create();
        }
        return this.f17507m;
    }
}
