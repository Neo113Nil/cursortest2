package k;

import E.G;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import com.chickyneer.roadway.R;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10635a;

    /* renamed from: b, reason: collision with root package name */
    public final i f10636b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10637c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10638d;

    /* renamed from: e, reason: collision with root package name */
    public View f10639e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10641g;

    /* renamed from: h, reason: collision with root package name */
    public n f10642h;

    /* renamed from: i, reason: collision with root package name */
    public k f10643i;

    /* renamed from: j, reason: collision with root package name */
    public l f10644j;

    /* renamed from: f, reason: collision with root package name */
    public int f10640f = 8388611;

    /* renamed from: k, reason: collision with root package name */
    public final l f10645k = new l(this);

    public m(int i2, Context context, View view, i iVar, boolean z) {
        this.f10635a = context;
        this.f10636b = iVar;
        this.f10639e = view;
        this.f10637c = z;
        this.f10638d = i2;
    }

    public final k a() {
        k rVar;
        if (this.f10643i == null) {
            Context context = this.f10635a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                rVar = new f(context, this.f10639e, this.f10638d, this.f10637c);
            } else {
                View view = this.f10639e;
                Context context2 = this.f10635a;
                boolean z = this.f10637c;
                rVar = new r(this.f10638d, context2, view, this.f10636b, z);
            }
            rVar.l(this.f10636b);
            rVar.r(this.f10645k);
            rVar.n(this.f10639e);
            rVar.h(this.f10642h);
            rVar.o(this.f10641g);
            rVar.p(this.f10640f);
            this.f10643i = rVar;
        }
        return this.f10643i;
    }

    public final boolean b() {
        k kVar = this.f10643i;
        return kVar != null && kVar.k();
    }

    public void c() {
        this.f10643i = null;
        l lVar = this.f10644j;
        if (lVar != null) {
            lVar.onDismiss();
        }
    }

    public final void d(int i2, int i3, boolean z, boolean z5) {
        k a6 = a();
        a6.s(z5);
        if (z) {
            int i6 = this.f10640f;
            View view = this.f10639e;
            Field field = G.f566a;
            if ((Gravity.getAbsoluteGravity(i6, view.getLayoutDirection()) & 7) == 5) {
                i2 -= this.f10639e.getWidth();
            }
            a6.q(i2);
            a6.t(i3);
            int i7 = (int) ((this.f10635a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a6.f10633a = new Rect(i2 - i7, i3 - i7, i2 + i7, i3 + i7);
        }
        a6.d();
    }
}
