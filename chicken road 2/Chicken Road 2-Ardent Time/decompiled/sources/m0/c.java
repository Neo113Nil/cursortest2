package m0;

/* loaded from: classes.dex */
public final class c extends android.app.DialogFragment {

    /* renamed from: a, reason: collision with root package name */
    public android.app.AlertDialog f8046a;

    /* renamed from: b, reason: collision with root package name */
    public android.content.DialogInterface.OnCancelListener f8047b;

    /* renamed from: c, reason: collision with root package name */
    public android.app.AlertDialog f8048c;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        android.content.DialogInterface.OnCancelListener onCancelListener = this.f8047b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        android.app.AlertDialog alertDialog = this.f8046a;
        if (alertDialog != null) {
            return alertDialog;
        }
        setShowsDialog(false);
        if (this.f8048c == null) {
            android.app.Activity activity = getActivity();
            p0.AbstractC0966r.c(activity);
            this.f8048c = new android.app.AlertDialog.Builder(activity).create();
        }
        return this.f8048c;
    }
}
