package m;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import i.DialogInterfaceC1229g;

/* loaded from: classes.dex */
public final class l implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, w {

    /* renamed from: a, reason: collision with root package name */
    public SubMenuC1416D f15147a;

    /* renamed from: b, reason: collision with root package name */
    public DialogInterfaceC1229g f15148b;

    /* renamed from: c, reason: collision with root package name */
    public C1423g f15149c;

    @Override // m.w
    public final void a(k kVar, boolean z4) {
        DialogInterfaceC1229g dialogInterfaceC1229g;
        if ((z4 || kVar == this.f15147a) && (dialogInterfaceC1229g = this.f15148b) != null) {
            dialogInterfaceC1229g.dismiss();
        }
    }

    @Override // m.w
    public final boolean n(k kVar) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        C1423g c1423g = this.f15149c;
        if (c1423g.f15114f == null) {
            c1423g.f15114f = new C1422f(c1423g);
        }
        this.f15147a.q(c1423g.f15114f.getItem(i7), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f15149c.a(this.f15147a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i7, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        SubMenuC1416D subMenuC1416D = this.f15147a;
        if (i7 == 82 || i7 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f15148b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f15148b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                subMenuC1416D.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return subMenuC1416D.performShortcut(i7, keyEvent, 0);
    }
}
