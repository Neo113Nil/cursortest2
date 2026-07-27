package P0;

import S0.r;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* loaded from: classes.dex */
public class c extends DialogFragment {

    /* renamed from: a, reason: collision with root package name */
    public AlertDialog f1125a;

    /* renamed from: b, reason: collision with root package name */
    public DialogInterface.OnCancelListener f1126b;

    /* renamed from: c, reason: collision with root package name */
    public AlertDialog f1127c;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f1126b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog alertDialog = this.f1125a;
        if (alertDialog != null) {
            return alertDialog;
        }
        setShowsDialog(false);
        if (this.f1127c == null) {
            Activity activity = getActivity();
            r.c(activity);
            this.f1127c = new AlertDialog.Builder(activity).create();
        }
        return this.f1127c;
    }
}
