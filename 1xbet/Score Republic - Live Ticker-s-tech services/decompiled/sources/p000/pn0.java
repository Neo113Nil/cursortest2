package p000;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class pn0 implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, do0 {

    /* JADX INFO: renamed from: j */
    public gb1 f6218j;

    /* JADX INFO: renamed from: k */
    public DialogInterfaceC0715t3 f6219k;

    /* JADX INFO: renamed from: l */
    public si0 f6220l;

    @Override // p000.do0
    /* JADX INFO: renamed from: b */
    public final void mo609b(on0 on0Var, boolean z) {
        DialogInterfaceC0715t3 dialogInterfaceC0715t3;
        if ((z || on0Var == this.f6218j) && (dialogInterfaceC0715t3 = this.f6219k) != null) {
            dialogInterfaceC0715t3.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        gb1 gb1Var = this.f6218j;
        si0 si0Var = this.f6220l;
        if (si0Var.f7124o == null) {
            si0Var.f7124o = new ri0(si0Var);
        }
        gb1Var.m3713q(si0Var.f7124o.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f6220l.mo1481b(this.f6218j, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        gb1 gb1Var = this.f6218j;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f6219k.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f6219k.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                gb1Var.m3707c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return gb1Var.performShortcut(i, keyEvent, 0);
    }

    @Override // p000.do0
    /* JADX INFO: renamed from: q */
    public final boolean mo621q(on0 on0Var) {
        return false;
    }
}
