package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.appcompat.app.f;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.m;

/* loaded from: classes8.dex */
final class h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, m.a {

    /* renamed from: a, reason: collision with root package name */
    private q f37435a;

    /* renamed from: b, reason: collision with root package name */
    private androidx.appcompat.app.f f37436b;

    /* renamed from: c, reason: collision with root package name */
    e f37437c;

    public h(q qVar) {
        this.f37435a = qVar;
    }

    public final void a() {
        q qVar = this.f37435a;
        f.a aVar = new f.a(qVar.n());
        e eVar = new e(aVar.getContext());
        this.f37437c = eVar;
        eVar.i(this);
        qVar.b(this.f37437c);
        aVar.a(this.f37437c.a(), this);
        View view = qVar.f37425o;
        if (view != null) {
            aVar.c(view);
        } else {
            aVar.d(qVar.f37424n);
            aVar.setTitle(qVar.f37423m);
        }
        aVar.l(this);
        androidx.appcompat.app.f create = aVar.create();
        this.f37436b = create;
        create.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f37436b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        this.f37436b.show();
    }

    @Override // androidx.appcompat.view.menu.m.a
    public final void b(@NonNull g gVar, boolean z11) {
        androidx.appcompat.app.f fVar;
        if ((z11 || gVar == this.f37435a) && (fVar = this.f37436b) != null) {
            fVar.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.m.a
    public final boolean c(@NonNull g gVar) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i11) {
        this.f37435a.z(((e.a) this.f37437c.a()).getItem(i11), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f37437c.b(this.f37435a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i11, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        q qVar = this.f37435a;
        if (i11 == 82 || i11 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f37436b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f37436b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                qVar.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return qVar.performShortcut(i11, keyEvent, 0);
    }
}
