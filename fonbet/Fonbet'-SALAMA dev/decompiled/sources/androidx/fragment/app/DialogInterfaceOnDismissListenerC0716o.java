package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: androidx.fragment.app.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC0716o implements DialogInterface.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0718q f9474a;

    public DialogInterfaceOnDismissListenerC0716o(DialogInterfaceOnCancelListenerC0718q dialogInterfaceOnCancelListenerC0718q) {
        this.f9474a = dialogInterfaceOnCancelListenerC0718q;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0718q dialogInterfaceOnCancelListenerC0718q = this.f9474a;
        Dialog dialog = dialogInterfaceOnCancelListenerC0718q.f9486s0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0718q.onDismiss(dialog);
        }
    }
}
