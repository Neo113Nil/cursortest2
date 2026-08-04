package p058i;

import B3.g;
import P.U;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.C0623j;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.b1;
import androidx.appcompat.widget.d1;
import androidx.appcompat.widget.j1;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p031e1.k;
import p086m.m;
import p145u1.c;
import p155w1.C1010l1;
import p155w1.C1052y0;

/* JADX INFO: loaded from: classes.dex */
public final class E extends AbstractC0904a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1 f13615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f13616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1010l1 f13617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13618d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13619e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f13620f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f13621g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b1 f13622h = new b1(this, 10);

    public E(Toolbar toolbar, CharSequence charSequence, r rVar) {
        c cVar = new c(this, 19);
        toolbar.getClass();
        j1 j1Var = new j1(toolbar, false);
        this.f13615a = j1Var;
        rVar.getClass();
        this.f13616b = rVar;
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
        this.f13617c = new C1010l1(this);
    }

    @Override // p058i.AbstractC0904a
    public final boolean a() {
        C0623j c0623j;
        ActionMenuView actionMenuView = this.f13615a.f8662a.f8532a;
        return (actionMenuView == null || (c0623j = actionMenuView.f8239K) == null || !c0623j.h()) ? false : true;
    }

    @Override // p058i.AbstractC0904a
    public final boolean b() {
        m mVar;
        d1 d1Var = this.f13615a.f8662a.f8543g0;
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

    @Override // p058i.AbstractC0904a
    public final void c(boolean z4) {
        if (z4 == this.f13620f) {
            return;
        }
        this.f13620f = z4;
        ArrayList arrayList = this.f13621g;
        if (arrayList.size() > 0) {
            throw k.c(arrayList, 0);
        }
    }

    @Override // p058i.AbstractC0904a
    public final int d() {
        return this.f13615a.f8663b;
    }

    @Override // p058i.AbstractC0904a
    public final Context e() {
        return this.f13615a.f8662a.getContext();
    }

    @Override // p058i.AbstractC0904a
    public final void f() {
        this.f13615a.f8662a.setVisibility(8);
    }

    @Override // p058i.AbstractC0904a
    public final boolean g() {
        j1 j1Var = this.f13615a;
        Toolbar toolbar = j1Var.f8662a;
        b1 b1Var = this.f13622h;
        toolbar.removeCallbacks(b1Var);
        Toolbar toolbar2 = j1Var.f8662a;
        WeakHashMap weakHashMap = U.f5037a;
        toolbar2.postOnAnimation(b1Var);
        return true;
    }

    @Override // p058i.AbstractC0904a
    public final boolean h() {
        return this.f13615a.f8662a.getVisibility() == 0;
    }

    @Override // p058i.AbstractC0904a
    public final void j() {
        this.f13615a.f8662a.removeCallbacks(this.f13622h);
    }

    @Override // p058i.AbstractC0904a
    public final boolean k(int i7, KeyEvent keyEvent) {
        Menu menuV = v();
        if (menuV == null) {
            return false;
        }
        menuV.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuV.performShortcut(i7, keyEvent, 0);
    }

    @Override // p058i.AbstractC0904a
    public final boolean l(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            m();
        }
        return true;
    }

    @Override // p058i.AbstractC0904a
    public final boolean m() {
        return this.f13615a.f8662a.v();
    }

    @Override // p058i.AbstractC0904a
    public final void n(ColorDrawable colorDrawable) {
        j1 j1Var = this.f13615a;
        j1Var.getClass();
        WeakHashMap weakHashMap = U.f5037a;
        j1Var.f8662a.setBackground(colorDrawable);
    }

    @Override // p058i.AbstractC0904a
    public final void p(boolean z4) {
        int i7 = z4 ? 8 : 0;
        j1 j1Var = this.f13615a;
        j1Var.a((i7 & 8) | (j1Var.f8663b & (-9)));
    }

    @Override // p058i.AbstractC0904a
    public final void r(CharSequence charSequence) {
        j1 j1Var = this.f13615a;
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

    @Override // p058i.AbstractC0904a
    public final void s(CharSequence charSequence) {
        j1 j1Var = this.f13615a;
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

    @Override // p058i.AbstractC0904a
    public final void t() {
        this.f13615a.f8662a.setVisibility(0);
    }

    public final Menu v() {
        boolean z4 = this.f13619e;
        j1 j1Var = this.f13615a;
        if (!z4) {
            g gVar = new g(this);
            C1052y0 c1052y0 = new C1052y0(this, 16);
            Toolbar toolbar = j1Var.f8662a;
            toolbar.f8544h0 = gVar;
            toolbar.f8545i0 = c1052y0;
            ActionMenuView actionMenuView = toolbar.f8532a;
            if (actionMenuView != null) {
                actionMenuView.f8240L = gVar;
                actionMenuView.f8241M = c1052y0;
            }
            this.f13619e = true;
        }
        return j1Var.f8662a.getMenu();
    }

    @Override // p058i.AbstractC0904a
    public final void i() {
    }

    @Override // p058i.AbstractC0904a
    public final void o(boolean z4) {
    }

    @Override // p058i.AbstractC0904a
    public final void q(boolean z4) {
    }
}
