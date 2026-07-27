package k;

import D.z;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import com.chicken.jump.road.pump.R;
import java.lang.reflect.Field;

/* renamed from: k.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1073n {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9627a;

    /* renamed from: b, reason: collision with root package name */
    public final MenuC1069j f9628b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9629c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9630d;

    /* renamed from: e, reason: collision with root package name */
    public View f9631e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9632g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC1074o f9633h;

    /* renamed from: i, reason: collision with root package name */
    public AbstractC1071l f9634i;

    /* renamed from: j, reason: collision with root package name */
    public C1072m f9635j;
    public int f = 8388611;

    /* renamed from: k, reason: collision with root package name */
    public final C1072m f9636k = new C1072m(this);

    public C1073n(int i3, Context context, View view, MenuC1069j menuC1069j, boolean z3) {
        this.f9627a = context;
        this.f9628b = menuC1069j;
        this.f9631e = view;
        this.f9629c = z3;
        this.f9630d = i3;
    }

    public final AbstractC1071l a() {
        AbstractC1071l viewOnKeyListenerC1078s;
        if (this.f9634i == null) {
            Context context = this.f9627a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC1078s = new ViewOnKeyListenerC1066g(context, this.f9631e, this.f9630d, this.f9629c);
            } else {
                View view = this.f9631e;
                Context context2 = this.f9627a;
                boolean z3 = this.f9629c;
                viewOnKeyListenerC1078s = new ViewOnKeyListenerC1078s(this.f9630d, context2, view, this.f9628b, z3);
            }
            viewOnKeyListenerC1078s.l(this.f9628b);
            viewOnKeyListenerC1078s.r(this.f9636k);
            viewOnKeyListenerC1078s.n(this.f9631e);
            viewOnKeyListenerC1078s.h(this.f9633h);
            viewOnKeyListenerC1078s.o(this.f9632g);
            viewOnKeyListenerC1078s.p(this.f);
            this.f9634i = viewOnKeyListenerC1078s;
        }
        return this.f9634i;
    }

    public final boolean b() {
        AbstractC1071l abstractC1071l = this.f9634i;
        return abstractC1071l != null && abstractC1071l.k();
    }

    public void c() {
        this.f9634i = null;
        C1072m c1072m = this.f9635j;
        if (c1072m != null) {
            c1072m.onDismiss();
        }
    }

    public final void d(int i3, int i4, boolean z3, boolean z4) {
        AbstractC1071l a3 = a();
        a3.s(z4);
        if (z3) {
            int i5 = this.f;
            View view = this.f9631e;
            Field field = z.f259a;
            if ((Gravity.getAbsoluteGravity(i5, view.getLayoutDirection()) & 7) == 5) {
                i3 -= this.f9631e.getWidth();
            }
            a3.q(i3);
            a3.t(i4);
            int i6 = (int) ((this.f9627a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a3.f9625a = new Rect(i3 - i6, i4 - i6, i3 + i6, i4 + i6);
        }
        a3.d();
    }
}
