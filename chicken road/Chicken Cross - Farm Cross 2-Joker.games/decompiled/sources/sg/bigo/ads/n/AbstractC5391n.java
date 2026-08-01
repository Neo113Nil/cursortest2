package sg.bigo.ads.n;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import java.util.WeakHashMap;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.R;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.h.AbstractC5144a1;
import sg.bigo.ads.h.AbstractC5164f1;
import sg.bigo.ads.h.C1;
import sg.bigo.ads.h.F1;
import sg.bigo.ads.h.Q1;
import sg.bigo.ads.o.C5419b;
import sg.bigo.ads.o.C5421d;
import sg.bigo.ads.o.C5423f;
import sg.bigo.ads.p.C5426a;
import sg.bigo.ads.u.AbstractC5490k;

/* renamed from: sg.bigo.ads.n.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5391n extends F1 {
    public long A;
    public boolean B;
    public final WeakHashMap q;
    public final C5365a r;
    public final sg.bigo.ads.h.T s;
    public AbstractC5144a1 t;
    public ViewGroup u;
    public ViewGroup v;
    public Q1 w;
    public sg.bigo.ads.T0.q x;
    public sg.bigo.ads.h.Y y;
    public TextView z;

    public AbstractC5391n(sg.bigo.ads.C.l lVar) {
        super(lVar);
        this.q = new WeakHashMap();
        this.r = new C5365a(this);
        this.A = 0L;
        this.s = new sg.bigo.ads.h.T();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static F1 a(sg.bigo.ads.C.l lVar, int i) {
        if (lVar instanceof sg.bigo.ads.Q.d) {
            sg.bigo.ads.Q.d dVar = (sg.bigo.ads.Q.d) lVar;
            if (!dVar.b()) {
                return dVar.c() == 3 ? i != 1 ? i != 2 ? i != 3 ? new C5419b(lVar) : new C5423f(lVar) : new C5421d(lVar) : new C5419b(lVar) : new C5426a(lVar);
            }
        }
        switch (i) {
            case 13:
                return new C5401s0(lVar);
            case 14:
                return new C5407v0(lVar);
            case 15:
                return new C5413y0(lVar);
            case 16:
                return new C0(lVar);
            case 17:
                return new G0(lVar);
            case 18:
                return new H0(lVar);
            case 19:
                return new C5408w(lVar);
            case 20:
                return new C5410x(lVar);
            case 21:
                return new C5412y(lVar);
            case 22:
                return new C5414z(lVar);
            case 23:
                return new C5355A(lVar);
            case 24:
                return new C5358D(lVar);
            case 25:
                return new C5359E(lVar);
            case 26:
                return new N(lVar);
            case 27:
                return new O(lVar);
            case 28:
                return new P(lVar);
            case 29:
                return new Q(lVar);
            case 30:
                return new S(lVar);
            case 31:
            case 32:
                sg.bigo.ads.U.r a2 = AbstractC5164f1.a(lVar);
                return ((31 == i || 32 == i) && a2.a()) ? a2.f12567a / a2.b >= 1 ? new S0(lVar) : 31 == i ? new I0(lVar) : new T0(lVar) : new F1(lVar);
            default:
                return new F1(lVar);
        }
    }

    public abstract void a(double d);

    @Override // sg.bigo.ads.h.F1
    public final void b(ViewGroup viewGroup) {
    }

    @Override // sg.bigo.ads.h.F1
    public final sg.bigo.ads.h.T d() {
        return this.s;
    }

    @Override // sg.bigo.ads.h.F1
    public void e() {
        this.B = true;
    }

    public int g() {
        sg.bigo.ads.T0.q qVar = this.x;
        if (qVar == null) {
            return -1;
        }
        Integer a2 = sg.bigo.ads.K0.z.a(qVar.a("video_play_page.ad_component_show_time"));
        if (a2 != null) {
            return a2.intValue();
        }
        return 0;
    }

    public int h() {
        int i;
        sg.bigo.ads.T0.q qVar = this.x;
        if (qVar != null) {
            Integer a2 = sg.bigo.ads.K0.z.a(qVar.a("video_play_page.background_colour"));
            i = a2 != null ? a2.intValue() : 0;
        } else {
            i = 1;
        }
        return AbstractC5490k.a(i);
    }

    public final C5389m i() {
        sg.bigo.ads.T0.q qVar = this.x;
        if (qVar == null) {
            return new C5389m(-16736769, false);
        }
        boolean[] zArr = new boolean[1];
        Integer a2 = sg.bigo.ads.K0.z.a(qVar.a("video_play_page.cta_color"));
        return new C5389m(AbstractC5164f1.a(this.d, a2 != null ? a2.intValue() : 0, zArr), !zArr[0]);
    }

    public int j() {
        return l();
    }

    public abstract MediaView k();

    public final int l() {
        int i;
        sg.bigo.ads.T0.q qVar = this.x;
        if (qVar != null) {
            Integer a2 = sg.bigo.ads.K0.z.a(qVar.a("video_play_page.mediaview_colour"));
            i = a2 != null ? a2.intValue() : 0;
        } else {
            i = 3;
        }
        return AbstractC5490k.a(i);
    }

    public abstract ViewGroup m();

    public abstract Button n();

    public boolean o() {
        sg.bigo.ads.T0.q qVar = this.x;
        return qVar != null && qVar.b("video_play_page.is_cta_show_animation") == 1;
    }

    public boolean p() {
        return false;
    }

    public abstract void q();

    public void r() {
        if (this.q.isEmpty()) {
            return;
        }
        a(new C5369c(this));
    }

    public void s() {
        a(new C5383j(this));
    }

    public void t() {
        Integer a2 = AbstractC5164f1.a((NativeAd) this.d);
        if (a2 != null) {
            a(a2.intValue());
        } else {
            a(new C5375f(this));
        }
    }

    public void u() {
        int h = h();
        if (h == 2) {
            a(ViewCompat.MEASURED_STATE_MASK);
            return;
        }
        if (h == 3) {
            a(ViewCompat.MEASURED_STATE_MASK);
            t();
        } else if (h != 4) {
            a(-1);
        } else {
            a(ViewCompat.MEASURED_STATE_MASK);
            s();
        }
    }

    public void v() {
        String str = ((sg.bigo.ads.U0.b) ((InterfaceC5087a) this.d.e())).L;
        TextView textView = (TextView) this.u.findViewById(R.id.inter_advertiser);
        TextView textView2 = (TextView) this.u.findViewById(R.id.inter_ad_label);
        if (textView != null) {
            if (TextUtils.isEmpty(str)) {
                textView.setVisibility(8);
                return;
            }
            textView.setText(str);
            textView.setPadding(AbstractC4963u.a(this.u.getContext(), 4), AbstractC4963u.a(textView.getContext(), 1), AbstractC4963u.a(textView.getContext(), 4), AbstractC4963u.a(textView.getContext(), 1));
            if (textView2 != null) {
                textView2.setText(R.string.bigo_ad_tag);
            }
        }
    }

    public static W0 a(sg.bigo.ads.C.l lVar, sg.bigo.ads.T0.q qVar, int i) {
        return i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 6 ? new X0(lVar, qVar) : new d1(lVar, qVar) : new c1(lVar, qVar) : new b1(lVar, qVar) : new a1(lVar, qVar) : new Z0(lVar, qVar);
    }

    public final void a(Button button, sg.bigo.ads.E0.k kVar) {
        if (button == null) {
            return;
        }
        Integer a2 = AbstractC5164f1.a((NativeAd) this.d);
        if (a2 != null) {
            sg.bigo.ads.h.T.a(button, a2.intValue(), kVar);
            return;
        }
        C5387l c5387l = new C5387l(this, button, kVar);
        synchronized (this) {
            a(new C1(this, c5387l));
        }
    }

    public static int a(sg.bigo.ads.T0.q qVar, String str, String str2) {
        int i;
        int i2;
        if (qVar == null || sg.bigo.ads.K0.I.a((CharSequence) str)) {
            i = 0;
            i2 = 0;
        } else {
            Integer a2 = sg.bigo.ads.K0.z.a(qVar.a(str));
            i2 = -1;
            i = a2 != null ? a2.intValue() : -1;
            if (sg.bigo.ads.K0.I.a((CharSequence) str2)) {
                i2 = 0;
            } else {
                Integer a3 = sg.bigo.ads.K0.z.a(qVar.a(str2));
                if (a3 != null) {
                    i2 = a3.intValue();
                }
            }
        }
        switch (i) {
            case -1:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return i;
            case 0:
            default:
                return 0;
            case 9:
                return Math.max(9, i2 + 9);
        }
    }

    public static int a(sg.bigo.ads.T0.q qVar, String str) {
        Integer a2;
        int intValue = (qVar == null || sg.bigo.ads.K0.I.a((CharSequence) str) || (a2 = sg.bigo.ads.K0.z.a(qVar.a(str))) == null) ? 0 : a2.intValue();
        if (intValue == 1 || intValue == 2 || intValue == 3 || intValue == 4 || intValue == 7 || intValue == 8) {
            return intValue;
        }
        return 0;
    }

    public final void a(AbstractC5144a1 abstractC5144a1, ViewGroup viewGroup, Q1 q1, sg.bigo.ads.T0.q qVar, sg.bigo.ads.h.Y y) {
        ViewGroup viewGroup2;
        if (abstractC5144a1 == null) {
            return;
        }
        this.t = abstractC5144a1;
        this.u = viewGroup;
        if (viewGroup != null) {
            ViewGroup viewGroup3 = (ViewGroup) viewGroup.findViewById(R.id.inter_media_container);
            this.v = viewGroup3;
            viewGroup2 = viewGroup3 == null ? this.u : null;
            this.w = q1;
            this.x = qVar;
            this.y = y;
            this.z = (TextView) this.u.findViewById(R.id.inter_warning);
            sg.bigo.ads.K0.X.a(this.u, new ViewTreeObserverOnGlobalLayoutListenerC5367b(this));
            u();
            q();
            v();
            this.s.a(this.r);
        }
        this.v = viewGroup2;
        this.w = q1;
        this.x = qVar;
        this.y = y;
        this.z = (TextView) this.u.findViewById(R.id.inter_warning);
        sg.bigo.ads.K0.X.a(this.u, new ViewTreeObserverOnGlobalLayoutListenerC5367b(this));
        u();
        q();
        v();
        this.s.a(this.r);
    }

    public void a(int i) {
        ViewGroup viewGroup = this.u;
        if (viewGroup != null) {
            viewGroup.setBackgroundColor(this.s.a(i));
        }
    }
}
