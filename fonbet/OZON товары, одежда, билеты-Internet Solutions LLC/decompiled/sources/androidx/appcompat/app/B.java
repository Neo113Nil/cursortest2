package androidx.appcompat.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AbstractC5051a;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.f0;
import androidx.core.view.Y;
import java.util.ArrayList;

/* loaded from: classes8.dex */
final class B extends AbstractC5051a {

    /* renamed from: a, reason: collision with root package name */
    final f0 f37051a;

    /* renamed from: b, reason: collision with root package name */
    final Window.Callback f37052b;

    /* renamed from: c, reason: collision with root package name */
    final e f37053c;

    /* renamed from: d, reason: collision with root package name */
    boolean f37054d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f37055e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f37056f;

    /* renamed from: g, reason: collision with root package name */
    private ArrayList<AbstractC5051a.b> f37057g = new ArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    private final Runnable f37058h = new a();

    final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            B.this.w();
        }
    }

    final class b implements Toolbar.h {
        b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.h
        public final boolean a(androidx.appcompat.view.menu.i iVar) {
            return B.this.f37052b.onMenuItemSelected(0, iVar);
        }
    }

    private final class c implements m.a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f37061a;

        c() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public final void b(@NonNull androidx.appcompat.view.menu.g gVar, boolean z11) {
            if (this.f37061a) {
                return;
            }
            this.f37061a = true;
            B b11 = B.this;
            b11.f37051a.n();
            b11.f37052b.onPanelClosed(108, gVar);
            this.f37061a = false;
        }

        @Override // androidx.appcompat.view.menu.m.a
        public final boolean c(@NonNull androidx.appcompat.view.menu.g gVar) {
            B.this.f37052b.onMenuOpened(108, gVar);
            return true;
        }
    }

    private final class d implements g.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public final void a(@NonNull androidx.appcompat.view.menu.g gVar) {
            B b11 = B.this;
            boolean c11 = b11.f37051a.c();
            Window.Callback callback = b11.f37052b;
            if (c11) {
                callback.onPanelClosed(108, gVar);
            } else if (callback.onPreparePanel(0, null, gVar)) {
                callback.onMenuOpened(108, gVar);
            }
        }

        @Override // androidx.appcompat.view.menu.g.a
        public final boolean b(@NonNull androidx.appcompat.view.menu.g gVar, @NonNull androidx.appcompat.view.menu.i iVar) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class e {
        e() {
        }

        public final View a(int i11) {
            if (i11 == 0) {
                return new View(B.this.f37051a.getContext());
            }
            return null;
        }

        public final void b(int i11) {
            if (i11 == 0) {
                B b11 = B.this;
                if (b11.f37054d) {
                    return;
                }
                b11.f37051a.h();
                b11.f37054d = true;
            }
        }
    }

    B(@NonNull Toolbar toolbar, CharSequence charSequence, @NonNull Window.Callback callback) {
        b bVar = new b();
        toolbar.getClass();
        f0 f0Var = new f0(toolbar, false);
        this.f37051a = f0Var;
        callback.getClass();
        this.f37052b = callback;
        f0Var.d(callback);
        toolbar.setOnMenuItemClickListener(bVar);
        f0Var.g(charSequence);
        this.f37053c = new e();
    }

    private Menu v() {
        boolean z11 = this.f37055e;
        f0 f0Var = this.f37051a;
        if (!z11) {
            f0Var.x(new c(), new d());
            this.f37055e = true;
        }
        return f0Var.v();
    }

    @Override // androidx.appcompat.app.AbstractC5051a
    public final boolean a() {
        return this.f37051a.f();
    }

    @Override // androidx.appcompat.app.AbstractC5051a
    public final boolean b() {
        f0 f0Var = this.f37051a;
        if (!f0Var.j()) {
            return false;
        }
        f0Var.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC5051a
    public final void c(boolean z11) {
        if (z11 == this.f37056f) {
            return;
        }
        this.f37056f = z11;
        ArrayList<AbstractC5051a.b> arrayList = this.f37057g;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.get(i11).a();
        }
    }

    @Override // androidx.appcompat.app.AbstractC5051a
    public final int d() {
        return this.f37051a.q();
    }

    @Override // androidx.appcompat.app.AbstractC5051a
    public final Context e() {
        return this.f37051a.getContext();
    }

    @Override // androidx.appcompat.app.AbstractC5051a
    public final boolean f() {
        f0 f0Var = this.f37051a;
        Toolbar w11 = f0Var.w();
        Runnable runnable = this.f37058h;
        w11.removeCallbacks(runnable);
        Toolbar w12 = f0Var.w();
        int i11 = Y.f42258g;
        w12.postOnAnimation(runnable);
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC5051a
    public final void g() {
    }

    @Override // androidx.appcompat.app.AbstractC5051a
    final void h() {
        this.f37051a.w().removeCallbacks(this.f37058h);
    }

    @Override // androidx.appcompat.app.AbstractC5051a
    public final boolean i(int i11, KeyEvent keyEvent) {
        Menu v11 = v();
        if (v11 == null) {
            return false;
        }
        v11.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return v11.performShortcut(i11, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.AbstractC5051a
    public final boolean j(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            k();
        }
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC5051a
    public final boolean k() {
        return this.f37051a.b();
    }

    @Override // androidx.appcompat.app.AbstractC5051a
    public final void l(boolean z11) {
    }

    @Override // androidx.appcompat.app.AbstractC5051a
    public final void m(boolean z11) {
        x(4, 4);
    }

    @Override // androidx.appcompat.app.AbstractC5051a
    public final void n() {
        x(2, 2);
    }

    @Override // androidx.appcompat.app.AbstractC5051a
    public final void o() {
        x(0, 8);
    }

    @Override // androidx.appcompat.app.AbstractC5051a
    public final void p(int i11) {
        this.f37051a.u(i11);
    }

    @Override // androidx.appcompat.app.AbstractC5051a
    public final void q(Drawable drawable) {
        this.f37051a.s(drawable);
    }

    @Override // androidx.appcompat.app.AbstractC5051a
    public final void r(boolean z11) {
    }

    @Override // androidx.appcompat.app.AbstractC5051a
    public final void s(String str) {
        this.f37051a.setTitle(str);
    }

    @Override // androidx.appcompat.app.AbstractC5051a
    public final void t(CharSequence charSequence) {
        this.f37051a.g(charSequence);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void w() {
        Window.Callback callback = this.f37052b;
        Menu v11 = v();
        androidx.appcompat.view.menu.g gVar = v11 instanceof androidx.appcompat.view.menu.g ? (androidx.appcompat.view.menu.g) v11 : null;
        if (gVar != null) {
            gVar.Q();
        }
        try {
            v11.clear();
            if (callback.onCreatePanelMenu(0, v11)) {
                if (!callback.onPreparePanel(0, null, v11)) {
                }
                if (gVar == null) {
                    gVar.P();
                    return;
                }
                return;
            }
            v11.clear();
            if (gVar == null) {
            }
        } catch (Throwable th2) {
            if (gVar != null) {
                gVar.P();
            }
            throw th2;
        }
    }

    public final void x(int i11, int i12) {
        f0 f0Var = this.f37051a;
        f0Var.k((i11 & i12) | ((~i12) & f0Var.q()));
    }
}
