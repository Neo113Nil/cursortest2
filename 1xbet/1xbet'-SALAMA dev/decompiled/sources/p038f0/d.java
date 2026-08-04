package p038f0;

import Y4.D;
import android.view.View;
import androidx.appcompat.widget.b1;
import androidx.drawerlayout.widget.DrawerLayout;
import java.util.ArrayList;
import p004a0.a;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public final class d extends D {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f12768k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a f12769l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b1 f12770m = new b1(this, 7);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ DrawerLayout f12771n;

    public d(DrawerLayout drawerLayout, int i7) {
        this.f12771n = drawerLayout;
        this.f12768k = i7;
    }

    @Override // Y4.D
    public final void F(int i7, int i8) {
        int i9 = i7 & 1;
        DrawerLayout drawerLayout = this.f12771n;
        View viewD = i9 == 1 ? drawerLayout.d(3) : drawerLayout.d(5);
        if (viewD == null || drawerLayout.g(viewD) != 0) {
            return;
        }
        this.f12769l.c(viewD, i8);
    }

    @Override // Y4.D
    public final void G(int i7) {
        this.f12771n.postDelayed(this.f12770m, 160L);
    }

    @Override // Y4.D
    public final void H(View view) {
        ((c) view.getLayoutParams()).f12766c = false;
        int i7 = this.f12768k == 3 ? 5 : 3;
        DrawerLayout drawerLayout = this.f12771n;
        View viewD = drawerLayout.d(i7);
        if (viewD != null) {
            drawerLayout.b(viewD);
        }
    }

    @Override // Y4.D
    public final void I(int i7) {
        int i8;
        int size;
        int size2;
        View rootView;
        int size3;
        View view = this.f12769l.f7946t;
        DrawerLayout drawerLayout = this.f12771n;
        int i9 = drawerLayout.f9293f.f7928a;
        int i10 = drawerLayout.f9294x.f7928a;
        if (i9 == 1 || i10 == 1) {
            i8 = 1;
        } else {
            i8 = 2;
            if (i9 != 2 && i10 != 2) {
                i8 = 0;
            }
        }
        if (view != null && i7 == 0) {
            float f7 = ((c) view.getLayoutParams()).f12765b;
            if (f7 == 0.0f) {
                c cVar = (c) view.getLayoutParams();
                if ((cVar.f12767d & 1) == 1) {
                    cVar.f12767d = 0;
                    ArrayList arrayList = drawerLayout.f9279I;
                    if (arrayList != null && (size3 = arrayList.size() - 1) >= 0) {
                        throw k.c(drawerLayout.f9279I, size3);
                    }
                    drawerLayout.n(view, false);
                    if (drawerLayout.hasWindowFocus() && (rootView = drawerLayout.getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f7 == 1.0f) {
                c cVar2 = (c) view.getLayoutParams();
                if ((cVar2.f12767d & 1) == 0) {
                    cVar2.f12767d = 1;
                    ArrayList arrayList2 = drawerLayout.f9279I;
                    if (arrayList2 != null && (size2 = arrayList2.size() - 1) >= 0) {
                        throw k.c(drawerLayout.f9279I, size2);
                    }
                    drawerLayout.n(view, true);
                    if (drawerLayout.hasWindowFocus()) {
                        drawerLayout.sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i8 != drawerLayout.f9271A) {
            drawerLayout.f9271A = i8;
            ArrayList arrayList3 = drawerLayout.f9279I;
            if (arrayList3 != null && (size = arrayList3.size() - 1) >= 0) {
                throw k.c(drawerLayout.f9279I, size);
            }
        }
    }

    @Override // Y4.D
    public final void J(View view, int i7) {
        int width = view.getWidth();
        DrawerLayout drawerLayout = this.f12771n;
        float width2 = (drawerLayout.a(view, 3) ? i7 + width : drawerLayout.getWidth() - i7) / width;
        drawerLayout.m(view, width2);
        view.setVisibility(width2 == 0.0f ? 4 : 0);
        drawerLayout.invalidate();
    }

    @Override // Y4.D
    public final void K(View view, float f7) {
        int i7;
        DrawerLayout drawerLayout = this.f12771n;
        drawerLayout.getClass();
        float f8 = ((c) view.getLayoutParams()).f12765b;
        int width = view.getWidth();
        if (drawerLayout.a(view, 3)) {
            i7 = (f7 > 0.0f || (f7 == 0.0f && f8 > 0.5f)) ? 0 : -width;
        } else {
            int width2 = drawerLayout.getWidth();
            if (f7 < 0.0f || (f7 == 0.0f && f8 > 0.5f)) {
                width2 -= width;
            }
            i7 = width2;
        }
        this.f12769l.t(i7, view.getTop());
        drawerLayout.invalidate();
    }

    @Override // Y4.D
    public final boolean d0(View view) {
        DrawerLayout drawerLayout = this.f12771n;
        drawerLayout.getClass();
        return DrawerLayout.j(view) && drawerLayout.a(view, this.f12768k) && drawerLayout.g(view) == 0;
    }

    @Override // Y4.D
    public final int i(View view, int i7) {
        DrawerLayout drawerLayout = this.f12771n;
        if (drawerLayout.a(view, 3)) {
            return Math.max(-view.getWidth(), Math.min(i7, 0));
        }
        int width = drawerLayout.getWidth();
        return Math.max(width - view.getWidth(), Math.min(i7, width));
    }

    @Override // Y4.D
    public final int j(View view) {
        return view.getTop();
    }

    @Override // Y4.D
    public final int u(View view) {
        this.f12771n.getClass();
        if (DrawerLayout.j(view)) {
            return view.getWidth();
        }
        return 0;
    }
}
