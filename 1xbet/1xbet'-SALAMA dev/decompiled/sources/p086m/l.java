package p086m;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import p058i.DialogInterfaceC0910g;

/* JADX INFO: loaded from: classes.dex */
public final class l implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public D f15153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DialogInterfaceC0910g f15154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g f15155c;

    @Override // p086m.w
    public final void a(k kVar, boolean z4) {
        DialogInterfaceC0910g dialogInterfaceC0910g;
        if ((z4 || kVar == this.f15153a) && (dialogInterfaceC0910g = this.f15154b) != null) {
            dialogInterfaceC0910g.dismiss();
        }
    }

    @Override // p086m.w
    public final boolean n(k kVar) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        g gVar = this.f15155c;
        if (gVar.f15120f == null) {
            gVar.f15120f = new f(gVar);
        }
        this.f15153a.q(gVar.f15120f.getItem(i7), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f15155c.a(this.f15153a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i7, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        D d7 = this.f15153a;
        if (i7 == 82 || i7 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f15154b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f15154b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                d7.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return d7.performShortcut(i7, keyEvent, 0);
    }
}
