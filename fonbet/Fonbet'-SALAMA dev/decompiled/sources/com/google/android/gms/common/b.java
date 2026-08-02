package com.google.android.gms.common;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.internal.D;

/* loaded from: classes.dex */
public class b extends DialogFragment {

    /* renamed from: a, reason: collision with root package name */
    public AlertDialog f11211a;

    /* renamed from: b, reason: collision with root package name */
    public DialogInterface.OnCancelListener f11212b;

    /* renamed from: c, reason: collision with root package name */
    public AlertDialog f11213c;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f11212b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog alertDialog = this.f11211a;
        if (alertDialog != null) {
            return alertDialog;
        }
        setShowsDialog(false);
        if (this.f11213c == null) {
            Activity activity = getActivity();
            D.i(activity);
            this.f11213c = new AlertDialog.Builder(activity).create();
        }
        return this.f11213c;
    }
}
