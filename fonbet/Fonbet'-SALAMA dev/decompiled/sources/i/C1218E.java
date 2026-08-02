package i;

import P.U;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.C0644j;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.b1;
import androidx.appcompat.widget.d1;
import androidx.appcompat.widget.j1;
import java.util.ArrayList;
import java.util.WeakHashMap;
import w1.C1719l1;
import w1.C1761y0;

/* renamed from: i.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1218E extends AbstractC1223a {

    /* renamed from: a, reason: collision with root package name */
    public final j1 f13609a;

    /* renamed from: b, reason: collision with root package name */
    public final r f13610b;

    /* renamed from: c, reason: collision with root package name */
    public final C1719l1 f13611c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13612d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13613e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13614f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f13615g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final b1 f13616h = new b1(this, 10);

    public C1218E(Toolbar toolbar, CharSequence charSequence, r rVar) {
        u1.c cVar = new u1.c(this, 19);
        toolbar.getClass();
        j1 j1Var = new j1(toolbar, false);
        this.f13609a = j1Var;
        rVar.getClass();
        this.f13610b = rVar;
        j1Var.f8671k = rVar;
        toolbar.setOnMenuItemClickListener(cVar);
        if (!j1Var.f8668g) {
            j1Var.f8669h = charSequence;
            if ((j1Var.f8663b & 8) != 0) {
                Toolbar toolbar2 = j1Var.f8662a;
                toolbar2.setTitle(charSequence);
                if (j1Var.f8668g) {
                    U.i(toolbar2.getRootView(), charSequence);
                }
            }
        }
        this.f13611c = new C1719l1(this);
    }

    @Override // i.AbstractC1223a
    public final boolean a() {
        C0644j c0644j;
        ActionMenuView actionMenuView = this.f13609a.f8662a.f8532a;
        return (actionMenuView == null || (c0644j = actionMenuView.f8239K) == null || !c0644j.h()) ? false : true;
    }

    @Override // i.AbstractC1223a
    public final boolean b() {
        m.m mVar;
        d1 d1Var = this.f13609a.f8662a.f8543g0;
        if (d1Var == null || (mVar = d1Var.f8613b) == null) {
            return false;
        }
        if (d1Var == null) {
            mVar = null;
        }
        if (mVar == null) {
            return true;
        }
        mVar.collapseActionView();
        return true;
    }

    @Override // i.AbstractC1223a
    public final void c(boolean z4) {
        if (z4 == this.f13614f) {
            return;
        }
        this.f13614f = z4;
        ArrayList arrayList = this.f13615g;
        if (arrayList.size() > 0) {
            throw e1.k.c(arrayList, 0);
        }
    }

    @Override // i.AbstractC1223a
    public final int d() {
        return this.f13609a.f8663b;
    }

    @Override // i.AbstractC1223a
    public final Context e() {
        return this.f13609a.f8662a.getContext();
    }

    @Override // i.AbstractC1223a
    public final void f() {
        this.f13609a.f8662a.setVisibility(8);
    }

    @Override // i.AbstractC1223a
    public final boolean g() {
        j1 j1Var = this.f13609a;
        Toolbar toolbar = j1Var.f8662a;
        b1 b1Var = this.f13616h;
        toolbar.removeCallbacks(b1Var);
        Toolbar toolbar2 = j1Var.f8662a;
        WeakHashMap weakHashMap = U.f5037a;
        toolbar2.postOnAnimation(b1Var);
        return true;
    }

    @Override // i.AbstractC1223a
    public final boolean h() {
        return this.f13609a.f8662a.getVisibility() == 0;
    }

    @Override // i.AbstractC1223a
    public final void j() {
        this.f13609a.f8662a.removeCallbacks(this.f13616h);
    }

    @Override // i.AbstractC1223a
    public final boolean k(int i7, KeyEvent keyEvent) {
        Menu v6 = v();
        if (v6 == null) {
            return false;
        }
        v6.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return v6.performShortcut(i7, keyEvent, 0);
    }

    @Override // i.AbstractC1223a
    public final boolean l(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            m();
        }
        return true;
    }

    @Override // i.AbstractC1223a
    public final boolean m() {
        return this.f13609a.f8662a.v();
    }

    @Override // i.AbstractC1223a
    public final void n(ColorDrawable colorDrawable) {
        j1 j1Var = this.f13609a;
        j1Var.getClass();
        WeakHashMap weakHashMap = U.f5037a;
        j1Var.f8662a.setBackground(colorDrawable);
    }

    @Override // i.AbstractC1223a
    public final void p(boolean z4) {
        int i7 = z4 ? 8 : 0;
        j1 j1Var = this.f13609a;
        j1Var.a((i7 & 8) | (j1Var.f8663b & (-9)));
    }

    @Override // i.AbstractC1223a
    public final void r(CharSequence charSequence) {
        j1 j1Var = this.f13609a;
        j1Var.f8668g = true;
        j1Var.f8669h = charSequence;
        if ((j1Var.f8663b & 8) != 0) {
            Toolbar toolbar = j1Var.f8662a;
            toolbar.setTitle(charSequence);
            if (j1Var.f8668g) {
                U.i(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // i.AbstractC1223a
    public final void s(CharSequence charSequence) {
        j1 j1Var = this.f13609a;
        if (j1Var.f8668g) {
            return;
        }
        j1Var.f8669h = charSequence;
        if ((j1Var.f8663b & 8) != 0) {
            Toolbar toolbar = j1Var.f8662a;
            toolbar.setTitle(charSequence);
            if (j1Var.f8668g) {
                U.i(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // i.AbstractC1223a
    public final void t() {
        this.f13609a.f8662a.setVisibility(0);
    }

    public final Menu v() {
        boolean z4 = this.f13613e;
        j1 j1Var = this.f13609a;
        if (!z4) {
            B3.g gVar = new B3.g(this);
            C1761y0 c1761y0 = new C1761y0(this, 16);
            Toolbar toolbar = j1Var.f8662a;
            toolbar.f8544h0 = gVar;
            toolbar.f8545i0 = c1761y0;
            ActionMenuView actionMenuView = toolbar.f8532a;
            if (actionMenuView != null) {
                actionMenuView.f8240L = gVar;
                actionMenuView.f8241M = c1761y0;
            }
            this.f13613e = true;
        }
        return j1Var.f8662a.getMenu();
    }

    @Override // i.AbstractC1223a
    public final void i() {
    }

    @Override // i.AbstractC1223a
    public final void o(boolean z4) {
    }

    @Override // i.AbstractC1223a
    public final void q(boolean z4) {
    }
}
