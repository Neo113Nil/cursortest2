package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.m;
import ru.ozon.app.android.R;

/* loaded from: classes8.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private final Context f37479a;

    /* renamed from: b, reason: collision with root package name */
    private final g f37480b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f37481c;

    /* renamed from: d, reason: collision with root package name */
    private final int f37482d;

    /* renamed from: e, reason: collision with root package name */
    private View f37483e;

    /* renamed from: g, reason: collision with root package name */
    private boolean f37485g;

    /* renamed from: h, reason: collision with root package name */
    private m.a f37486h;

    /* renamed from: i, reason: collision with root package name */
    private k f37487i;

    /* renamed from: j, reason: collision with root package name */
    private PopupWindow.OnDismissListener f37488j;

    /* renamed from: f, reason: collision with root package name */
    private int f37484f = 8388611;

    /* renamed from: k, reason: collision with root package name */
    private final PopupWindow.OnDismissListener f37489k = new a();

    final class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            l.this.d();
        }
    }

    public l(int i11, @NonNull Context context, @NonNull View view, @NonNull g gVar, boolean z11) {
        this.f37479a = context;
        this.f37480b = gVar;
        this.f37483e = view;
        this.f37481c = z11;
        this.f37482d = i11;
    }

    private void j(int i11, int i12, boolean z11, boolean z12) {
        k b11 = b();
        b11.v(z12);
        if (z11) {
            if ((Gravity.getAbsoluteGravity(this.f37484f, this.f37483e.getLayoutDirection()) & 7) == 5) {
                i11 -= this.f37483e.getWidth();
            }
            b11.t(i11);
            b11.w(i12);
            int i13 = (int) ((this.f37479a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            b11.q(new Rect(i11 - i13, i12 - i13, i11 + i13, i12 + i13));
        }
        b11.show();
    }

    public final void a() {
        if (c()) {
            this.f37487i.dismiss();
        }
    }

    @NonNull
    public final k b() {
        k pVar;
        if (this.f37487i == null) {
            Context context = this.f37479a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                pVar = new c(context, this.f37483e, this.f37482d, this.f37481c);
            } else {
                View view = this.f37483e;
                Context context2 = this.f37479a;
                boolean z11 = this.f37481c;
                pVar = new p(this.f37482d, context2, view, this.f37480b, z11);
            }
            pVar.m(this.f37480b);
            pVar.u(this.f37489k);
            pVar.p(this.f37483e);
            pVar.i(this.f37486h);
            pVar.r(this.f37485g);
            pVar.s(this.f37484f);
            this.f37487i = pVar;
        }
        return this.f37487i;
    }

    public final boolean c() {
        k kVar = this.f37487i;
        return kVar != null && kVar.a();
    }

    protected void d() {
        this.f37487i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f37488j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void e(@NonNull View view) {
        this.f37483e = view;
    }

    public final void f(boolean z11) {
        this.f37485g = z11;
        k kVar = this.f37487i;
        if (kVar != null) {
            kVar.r(z11);
        }
    }

    public final void g(int i11) {
        this.f37484f = i11;
    }

    public final void h(PopupWindow.OnDismissListener onDismissListener) {
        this.f37488j = onDismissListener;
    }

    public final void i(m.a aVar) {
        this.f37486h = aVar;
        k kVar = this.f37487i;
        if (kVar != null) {
            kVar.i(aVar);
        }
    }

    public final boolean k() {
        if (c()) {
            return true;
        }
        if (this.f37483e == null) {
            return false;
        }
        j(0, 0, false, false);
        return true;
    }

    public final boolean l(int i11, int i12) {
        if (c()) {
            return true;
        }
        if (this.f37483e == null) {
            return false;
        }
        j(i11, i12, true, true);
        return true;
    }
}
