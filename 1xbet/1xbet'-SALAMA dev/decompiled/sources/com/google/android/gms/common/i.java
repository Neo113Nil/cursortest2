package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import androidx.fragment.app.A;
import androidx.fragment.app.C0705z;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0697q;
import com.google.android.gms.common.internal.D;

/* JADX INFO: loaded from: classes.dex */
public class i extends DialogInterfaceOnCancelListenerC0697q {

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public AlertDialog f11220x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public DialogInterface.OnCancelListener f11221y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public AlertDialog f11222z0;

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0697q
    public final Dialog E() {
        AlertDialog alertDialog = this.f11220x0;
        if (alertDialog != null) {
            return alertDialog;
        }
        this.f9482o0 = false;
        if (this.f11222z0 == null) {
            C0705z c0705z = this.f9514K;
            A a2 = c0705z == null ? null : c0705z.f9552b;
            D.i(a2);
            this.f11222z0 = new AlertDialog.Builder(a2).create();
        }
        return this.f11222z0;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0697q, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f11221y0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
