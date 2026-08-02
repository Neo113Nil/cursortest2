package m;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import game.betting133.sports1xbet.R;

/* renamed from: m.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2074l {

    /* renamed from: a, reason: collision with root package name */
    public final Context f17952a;

    /* renamed from: b, reason: collision with root package name */
    public final MenuC2070h f17953b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f17954c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17955d;

    /* renamed from: e, reason: collision with root package name */
    public View f17956e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f17957g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC2075m f17958h;
    public AbstractC2072j i;

    /* renamed from: j, reason: collision with root package name */
    public C2073k f17959j;
    public int f = 8388611;

    /* renamed from: k, reason: collision with root package name */
    public final C2073k f17960k = new C2073k(this);

    public C2074l(int i, Context context, View view, MenuC2070h menuC2070h, boolean z3) {
        this.f17952a = context;
        this.f17953b = menuC2070h;
        this.f17956e = view;
        this.f17954c = z3;
        this.f17955d = i;
    }

    public final AbstractC2072j a() {
        AbstractC2072j viewOnKeyListenerC2079q;
        if (this.i == null) {
            Context context = this.f17952a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC2079q = new ViewOnKeyListenerC2067e(context, this.f17956e, this.f17955d, this.f17954c);
            } else {
                View view = this.f17956e;
                Context context2 = this.f17952a;
                boolean z3 = this.f17954c;
                viewOnKeyListenerC2079q = new ViewOnKeyListenerC2079q(this.f17955d, context2, view, this.f17953b, z3);
            }
            viewOnKeyListenerC2079q.l(this.f17953b);
            viewOnKeyListenerC2079q.r(this.f17960k);
            viewOnKeyListenerC2079q.n(this.f17956e);
            viewOnKeyListenerC2079q.j(this.f17958h);
            viewOnKeyListenerC2079q.o(this.f17957g);
            viewOnKeyListenerC2079q.p(this.f);
            this.i = viewOnKeyListenerC2079q;
        }
        return this.i;
    }

    public final boolean b() {
        AbstractC2072j abstractC2072j = this.i;
        return abstractC2072j != null && abstractC2072j.i();
    }

    public void c() {
        this.i = null;
        C2073k c2073k = this.f17959j;
        if (c2073k != null) {
            c2073k.onDismiss();
        }
    }

    public final void d(int i, int i5, boolean z3, boolean z5) {
        AbstractC2072j a5 = a();
        a5.s(z5);
        if (z3) {
            if ((Gravity.getAbsoluteGravity(this.f, this.f17956e.getLayoutDirection()) & 7) == 5) {
                i -= this.f17956e.getWidth();
            }
            a5.q(i);
            a5.t(i5);
            int i6 = (int) ((this.f17952a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a5.f17950k = new Rect(i - i6, i5 - i6, i + i6, i5 + i6);
        }
        a5.b();
    }
}
