package p086m;

import P.U;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import com.salamadev.nabilalawadi.kisaskoran.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f15197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f15198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f15199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f15201e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f15203g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public w f15204h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public s f15205i;
    public t j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15202f = 8388611;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t f15206k = new t(this);

    public v(int i7, Context context, View view, k kVar, boolean z4) {
        this.f15197a = context;
        this.f15198b = kVar;
        this.f15201e = view;
        this.f15199c = z4;
        this.f15200d = i7;
    }

    public final s a() {
        s c3;
        if (this.f15205i == null) {
            Context context = this.f15197a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            u.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                c3 = new e(context, this.f15201e, this.f15200d, this.f15199c);
            } else {
                View view = this.f15201e;
                Context context2 = this.f15197a;
                boolean z4 = this.f15199c;
                c3 = new C(this.f15200d, context2, view, this.f15198b, z4);
            }
            c3.k(this.f15198b);
            c3.q(this.f15206k);
            c3.m(this.f15201e);
            c3.e(this.f15204h);
            c3.n(this.f15203g);
            c3.o(this.f15202f);
            this.f15205i = c3;
        }
        return this.f15205i;
    }

    public final boolean b() {
        s sVar = this.f15205i;
        return sVar != null && sVar.b();
    }

    public void c() {
        this.f15205i = null;
        t tVar = this.j;
        if (tVar != null) {
            tVar.onDismiss();
        }
    }

    public final void d(int i7, int i8, boolean z4, boolean z7) {
        s sVarA = a();
        sVarA.r(z7);
        if (z4) {
            int i9 = this.f15202f;
            View view = this.f15201e;
            WeakHashMap weakHashMap = U.f5037a;
            if ((Gravity.getAbsoluteGravity(i9, view.getLayoutDirection()) & 7) == 5) {
                i7 -= this.f15201e.getWidth();
            }
            sVarA.p(i7);
            sVarA.s(i8);
            int i10 = (int) ((this.f15197a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            sVarA.f15195a = new Rect(i7 - i10, i8 - i10, i7 + i10, i8 + i10);
        }
        sVarA.show();
    }
}
