package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: androidx.fragment.app.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC0715n implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0718q f9473a;

    public DialogInterfaceOnCancelListenerC0715n(DialogInterfaceOnCancelListenerC0718q dialogInterfaceOnCancelListenerC0718q) {
        this.f9473a = dialogInterfaceOnCancelListenerC0718q;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0718q dialogInterfaceOnCancelListenerC0718q = this.f9473a;
        Dialog dialog = dialogInterfaceOnCancelListenerC0718q.f9486s0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0718q.onCancel(dialog);
        }
    }
}
