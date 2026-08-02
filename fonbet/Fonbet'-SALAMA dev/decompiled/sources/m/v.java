package m;

import P.U;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import com.salamadev.khotabaljomo3a.kichkabdelhamid.R;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15191a;

    /* renamed from: b, reason: collision with root package name */
    public final k f15192b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15193c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15194d;

    /* renamed from: e, reason: collision with root package name */
    public View f15195e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f15197g;

    /* renamed from: h, reason: collision with root package name */
    public w f15198h;

    /* renamed from: i, reason: collision with root package name */
    public s f15199i;
    public t j;

    /* renamed from: f, reason: collision with root package name */
    public int f15196f = 8388611;

    /* renamed from: k, reason: collision with root package name */
    public final t f15200k = new t(this);

    public v(int i7, Context context, View view, k kVar, boolean z4) {
        this.f15191a = context;
        this.f15192b = kVar;
        this.f15195e = view;
        this.f15193c = z4;
        this.f15194d = i7;
    }

    public final s a() {
        s viewOnKeyListenerC1415C;
        if (this.f15199i == null) {
            Context context = this.f15191a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            u.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC1415C = new ViewOnKeyListenerC1421e(context, this.f15195e, this.f15194d, this.f15193c);
            } else {
                View view = this.f15195e;
                Context context2 = this.f15191a;
                boolean z4 = this.f15193c;
                viewOnKeyListenerC1415C = new ViewOnKeyListenerC1415C(this.f15194d, context2, view, this.f15192b, z4);
            }
            viewOnKeyListenerC1415C.k(this.f15192b);
            viewOnKeyListenerC1415C.q(this.f15200k);
            viewOnKeyListenerC1415C.m(this.f15195e);
            viewOnKeyListenerC1415C.e(this.f15198h);
            viewOnKeyListenerC1415C.n(this.f15197g);
            viewOnKeyListenerC1415C.o(this.f15196f);
            this.f15199i = viewOnKeyListenerC1415C;
        }
        return this.f15199i;
    }

    public final boolean b() {
        s sVar = this.f15199i;
        return sVar != null && sVar.b();
    }

    public void c() {
        this.f15199i = null;
        t tVar = this.j;
        if (tVar != null) {
            tVar.onDismiss();
        }
    }

    public final void d(int i7, int i8, boolean z4, boolean z7) {
        s a2 = a();
        a2.r(z7);
        if (z4) {
            int i9 = this.f15196f;
            View view = this.f15195e;
            WeakHashMap weakHashMap = U.f5037a;
            if ((Gravity.getAbsoluteGravity(i9, view.getLayoutDirection()) & 7) == 5) {
                i7 -= this.f15195e.getWidth();
            }
            a2.p(i7);
            a2.s(i8);
            int i10 = (int) ((this.f15191a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f15189a = new Rect(i7 - i10, i8 - i10, i7 + i10, i8 + i10);
        }
        a2.show();
    }
}
