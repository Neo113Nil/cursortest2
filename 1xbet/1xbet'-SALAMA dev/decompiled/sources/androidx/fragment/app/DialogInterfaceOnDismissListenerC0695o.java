package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: renamed from: androidx.fragment.app.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC0695o implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0697q f9474a;

    public DialogInterfaceOnDismissListenerC0695o(DialogInterfaceOnCancelListenerC0697q dialogInterfaceOnCancelListenerC0697q) {
        this.f9474a = dialogInterfaceOnCancelListenerC0697q;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0697q dialogInterfaceOnCancelListenerC0697q = this.f9474a;
        Dialog dialog = dialogInterfaceOnCancelListenerC0697q.f9486s0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0697q.onDismiss(dialog);
        }
    }
}
