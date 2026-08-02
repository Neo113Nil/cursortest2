package p000;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: renamed from: ws */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC0851ws implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0962zs f8652j;

    public DialogInterfaceOnCancelListenerC0851ws(DialogInterfaceOnCancelListenerC0962zs dialogInterfaceOnCancelListenerC0962zs) {
        this.f8652j = dialogInterfaceOnCancelListenerC0962zs;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0962zs dialogInterfaceOnCancelListenerC0962zs = this.f8652j;
        Dialog dialog = dialogInterfaceOnCancelListenerC0962zs.f9934o0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0962zs.onCancel(dialog);
        }
    }
}
