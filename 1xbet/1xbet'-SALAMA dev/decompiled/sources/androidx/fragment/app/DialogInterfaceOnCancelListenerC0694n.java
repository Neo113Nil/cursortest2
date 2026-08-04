package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: renamed from: androidx.fragment.app.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC0694n implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0697q f9473a;

    public DialogInterfaceOnCancelListenerC0694n(DialogInterfaceOnCancelListenerC0697q dialogInterfaceOnCancelListenerC0697q) {
        this.f9473a = dialogInterfaceOnCancelListenerC0697q;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0697q dialogInterfaceOnCancelListenerC0697q = this.f9473a;
        Dialog dialog = dialogInterfaceOnCancelListenerC0697q.f9486s0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0697q.onCancel(dialog);
        }
    }
}
