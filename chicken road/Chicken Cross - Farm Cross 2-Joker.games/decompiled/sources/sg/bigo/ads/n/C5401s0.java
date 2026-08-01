package sg.bigo.ads.n;

import android.content.Context;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import java.util.List;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.multi_img.view.IconListView;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.h.AbstractC5144a1;
import sg.bigo.ads.h.Q1;
import sg.bigo.ads.u.C5481b;

/* renamed from: sg.bigo.ads.n.s0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5401s0 extends U0 {
    public LinearLayout P;
    public RoundedFrameLayout Q;
    public TextView R;
    public IconListView S;
    public RoundedFrameLayout T;
    public Button U;
    public C5388l0 V;
    public ImageView W;
    public boolean X;
    public boolean Y;
    public int Z;

    public C5401s0(sg.bigo.ads.C.l lVar) {
        super(lVar);
        this.X = false;
        this.Y = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(C5401s0 c5401s0, int i, int i2) {
        long j;
        long max;
        boolean o = c5401s0.o();
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new ChangeBounds());
        transitionSet.addListener((Transition.TransitionListener) new C5398q0(c5401s0, o));
        TransitionManager.beginDelayedTransition(c5401s0.v, transitionSet);
        sg.bigo.ads.E0.k kVar = new sg.bigo.ads.E0.k();
        C5389m i3 = c5401s0.i();
        Button button = c5401s0.U;
        if (button != null) {
            sg.bigo.ads.h.T.a(button, i3.f13179a, kVar);
        }
        TextView textView = c5401s0.R;
        if (textView != null) {
            textView.setTextColor(i3.f13179a);
        }
        if (i3.b) {
            c5401s0.a(c5401s0.U, new C5399r0(c5401s0));
        }
        c5401s0.c(i2);
        sg.bigo.ads.h.Y y = c5401s0.y;
        if (y != null) {
            int i4 = y.b;
            int i5 = 3;
            if (i4 != 1) {
                if (i4 == 2) {
                    i5 = 5;
                } else if (i4 == 3) {
                    i5 = 10;
                }
            }
            j = i5 * 1000;
            max = Math.max(0L, j);
            if (max != 0) {
                c5401s0.W.setVisibility(0);
            } else {
                c5401s0.W.postDelayed(new RunnableC5394o0(c5401s0), max);
            }
            c5401s0.W.setOnClickListener(new ViewOnClickListenerC5396p0(c5401s0));
        }
        j = 0;
        max = Math.max(0L, j);
        if (max != 0) {
        }
        c5401s0.W.setOnClickListener(new ViewOnClickListenerC5396p0(c5401s0));
    }

    @Override // sg.bigo.ads.n.U0
    public final void A() {
        if (this.Y) {
            super.A();
        }
    }

    @Override // sg.bigo.ads.n.U0
    public final boolean B() {
        return true;
    }

    @Override // sg.bigo.ads.n.U0
    public final boolean C() {
        return false;
    }

    public int D() {
        return 0;
    }

    public int E() {
        return 0;
    }

    public int F() {
        return 0;
    }

    @Override // sg.bigo.ads.n.U0, sg.bigo.ads.n.AbstractC5391n
    public final void a(double d) {
    }

    @Override // sg.bigo.ads.n.U0
    public final void b(int i) {
        C5388l0 c5388l0 = new C5388l0(this, Math.max(1, i) * 1000);
        this.V = c5388l0;
        c5388l0.e();
    }

    public final void c(int i) {
        if (this.J == null) {
            return;
        }
        int F = F();
        int E = E();
        Context context = this.E.getContext();
        this.J.f.setCornerRadius(D());
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.J.f.getLayoutParams();
        marginLayoutParams.leftMargin = E;
        boolean z = this.Y;
        marginLayoutParams.topMargin = z ? this.Z + F : F;
        marginLayoutParams.rightMargin = E;
        if (z) {
            F += this.Z;
        }
        marginLayoutParams.bottomMargin = F;
        this.J.f.setLayoutParams(marginLayoutParams);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.E.getLayoutParams();
        int i2 = this.Z;
        marginLayoutParams2.topMargin = -i2;
        marginLayoutParams2.height = (i2 * 2) + i;
        this.E.setLayoutParams(marginLayoutParams2);
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.J.s.getLayoutParams();
        marginLayoutParams3.bottomMargin = AbstractC4963u.a(context, 12) + this.Z;
        this.J.s.setLayoutParams(marginLayoutParams3);
        RoundedFrameLayout roundedFrameLayout = this.Q;
        float f = this.Z;
        roundedFrameLayout.a(f, f, 0.0f, 0.0f);
        this.Q.setVisibility(0);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.Q.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = 0;
        layoutParams.weight = 1.0f;
        layoutParams.topMargin = -this.Z;
        this.Q.setLayoutParams(layoutParams);
    }

    @Override // sg.bigo.ads.n.AbstractC5391n
    public final int h() {
        return 2;
    }

    @Override // sg.bigo.ads.n.AbstractC5391n
    public final int j() {
        return Integer.MIN_VALUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // sg.bigo.ads.n.U0, sg.bigo.ads.n.AbstractC5391n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q() {
        sg.bigo.ads.v.f fVar;
        Button button;
        TextView textView;
        super.q();
        this.z.setTextColor(-14671580);
        this.C.removeView(this.E);
        this.E.setCornerRadius(0.0f);
        int i = -1;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        this.P.addView(this.E, 0, layoutParams);
        sg.bigo.ads.K0.X.a(this.P, new ViewTreeObserverOnGlobalLayoutListenerC5384j0(this));
        this.S.a(this.y);
        if (sg.bigo.ads.K0.A.a(this.S.getItems())) {
            this.S.setVisibility(8);
        } else {
            this.S.setVisibility(0);
        }
        sg.bigo.ads.v.k kVar = this.G;
        if (kVar != null) {
            kVar.a(false);
        }
        sg.bigo.ads.v.k kVar2 = this.H;
        if (kVar2 != null) {
            kVar2.a(false);
        }
        C5481b c5481b = this.I;
        if (c5481b != null) {
            c5481b.g = false;
        }
        int l = l();
        if (l != 1) {
            if (l == 2) {
                fVar = this.J;
                i = ViewCompat.MEASURED_STATE_MASK;
            }
            w();
            C5389m i2 = i();
            button = this.U;
            if (button != null) {
                sg.bigo.ads.h.T.a(button, i2.f13179a, null);
            }
            textView = this.R;
            if (textView == null) {
                textView.setTextColor(i2.f13179a);
                return;
            }
            return;
        }
        fVar = this.J;
        fVar.c(sg.bigo.ads.E0.p.a(i));
        w();
        C5389m i22 = i();
        button = this.U;
        if (button != null) {
        }
        textView = this.R;
        if (textView == null) {
        }
    }

    @Override // sg.bigo.ads.n.U0
    public final int x() {
        return 1;
    }

    @Override // sg.bigo.ads.n.U0
    public final void z() {
        super.z();
        if (this.w.h) {
            sg.bigo.ads.C.f.a(this.Q, 18);
            sg.bigo.ads.C.f.a(this.u, this.Q, 8, this.d, this.w.i);
        } else {
            sg.bigo.ads.C.f.a(this.u, this.Q, 8, AbstractC5144a1.p, 0);
        }
        IconListView iconListView = this.S;
        if (iconListView != null) {
            List<sg.bigo.ads.v.g> items = iconListView.getItems();
            for (int i = 0; items != null && i < items.size(); i++) {
                sg.bigo.ads.v.g gVar = items.get(i);
                sg.bigo.ads.C.f.a(gVar.d, 26);
                sg.bigo.ads.C.f.a(this.u, gVar.d, 8, this.d, this.w.i);
                sg.bigo.ads.C.f.a(gVar.g, 26);
                sg.bigo.ads.C.f.a(this.u, gVar.g, 8, this.d, this.w.i);
            }
        }
        Q1 q1 = this.w;
        if (q1 == null || !q1.g) {
            sg.bigo.ads.C.f.a(this.u, this.J.e, 8, AbstractC5144a1.p, 0);
        } else {
            sg.bigo.ads.C.f.a(this.J.e, 9);
            sg.bigo.ads.C.f.a(this.u, this.J.e, 8, this.d, this.w.i);
        }
    }

    @Override // sg.bigo.ads.h.W
    public final void b() {
        super.b();
        C5388l0 c5388l0 = this.V;
        if (c5388l0 == null || !c5388l0.b()) {
            return;
        }
        this.V.e();
    }

    public static void a(C5401s0 c5401s0) {
        c5401s0.Y = false;
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new ChangeBounds());
        TransitionManager.beginDelayedTransition(c5401s0.v, transitionSet);
        c5401s0.P.getMeasuredWidth();
        c5401s0.c(c5401s0.P.getMeasuredHeight());
    }

    @Override // sg.bigo.ads.n.U0
    public final void a(AbstractC5144a1 abstractC5144a1) {
        this.P = (LinearLayout) this.u.findViewById(R.id.inter_media_container);
        RoundedFrameLayout roundedFrameLayout = (RoundedFrameLayout) this.u.findViewById(R.id.inter_media_gp_container);
        this.Q = roundedFrameLayout;
        this.R = (TextView) roundedFrameLayout.findViewById(R.id.inter_company);
        this.S = (IconListView) this.Q.findViewById(R.id.inter_download_msg);
        RoundedFrameLayout roundedFrameLayout2 = (RoundedFrameLayout) this.Q.findViewById(R.id.inter_btn_cta_layout);
        this.T = roundedFrameLayout2;
        this.U = (Button) roundedFrameLayout2.findViewById(R.id.inter_btn_cta);
        this.W = (ImageView) this.Q.findViewById(R.id.inter_gp_btn_close);
        this.Z = AbstractC4963u.a(this.u.getContext(), 12);
    }

    @Override // sg.bigo.ads.h.W
    public final void a() {
        super.a();
        C5388l0 c5388l0 = this.V;
        if (c5388l0 == null || c5388l0.b()) {
            return;
        }
        this.V.d();
    }

    @Override // sg.bigo.ads.n.U0
    public final void a(int i, boolean z, int i2, boolean z2) {
        super.a(i, z, i, false);
    }
}
