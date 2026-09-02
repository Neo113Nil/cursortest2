package N;

import Q.s;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class c extends DialogFragment {

    /* renamed from: a, reason: collision with root package name */
    public AlertDialog f234a;

    /* renamed from: b, reason: collision with root package name */
    public DialogInterface.OnCancelListener f235b;

    /* renamed from: c, reason: collision with root package name */
    public AlertDialog f236c;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f235b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog alertDialog = this.f234a;
        if (alertDialog != null) {
            return alertDialog;
        }
        setShowsDialog(false);
        if (this.f236c == null) {
            Activity activity = getActivity();
            s.c(activity);
            this.f236c = new AlertDialog.Builder(activity).create();
        }
        return this.f236c;
    }
}
