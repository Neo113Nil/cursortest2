package p000;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: renamed from: xs */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC0888xs implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0962zs f9047j;

    public DialogInterfaceOnDismissListenerC0888xs(DialogInterfaceOnCancelListenerC0962zs dialogInterfaceOnCancelListenerC0962zs) {
        this.f9047j = dialogInterfaceOnCancelListenerC0962zs;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0962zs dialogInterfaceOnCancelListenerC0962zs = this.f9047j;
        Dialog dialog = dialogInterfaceOnCancelListenerC0962zs.f9934o0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0962zs.onDismiss(dialog);
        }
    }
}
