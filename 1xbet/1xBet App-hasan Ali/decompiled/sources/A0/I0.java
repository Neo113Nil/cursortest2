package A0;

import P.AbstractC0329z;
import P.C0315s;
import P.C0322v0;
import P.C0326x0;

/* loaded from: classes.dex */
public abstract class I0 {

    /* renamed from: a, reason: collision with root package name */
    public static final P.e1 f281a = new P.e1(C0010a0.f453s);

    /* renamed from: b, reason: collision with root package name */
    public static final P.e1 f282b = new P.e1(C0010a0.f454t);

    /* renamed from: c, reason: collision with root package name */
    public static final P.e1 f283c = new P.e1(C0010a0.f456v);

    /* renamed from: d, reason: collision with root package name */
    public static final P.e1 f284d = new P.e1(C0010a0.f455u);

    /* renamed from: e, reason: collision with root package name */
    public static final P.e1 f285e = new P.e1(C0010a0.f458x);
    public static final P.e1 f = new P.e1(C0010a0.f457w);

    /* renamed from: g, reason: collision with root package name */
    public static final P.e1 f286g = new P.e1(C0010a0.f437D);

    /* renamed from: h, reason: collision with root package name */
    public static final P.e1 f287h = new P.e1(C0010a0.f460z);
    public static final P.e1 i = new P.e1(C0010a0.f434A);

    /* renamed from: j, reason: collision with root package name */
    public static final P.e1 f288j = new P.e1(C0010a0.f436C);

    /* renamed from: k, reason: collision with root package name */
    public static final P.e1 f289k = new P.e1(C0010a0.f435B);

    /* renamed from: l, reason: collision with root package name */
    public static final P.e1 f290l = new P.e1(C0010a0.f438E);

    /* renamed from: m, reason: collision with root package name */
    public static final P.e1 f291m = new P.e1(C0010a0.f439F);

    /* renamed from: n, reason: collision with root package name */
    public static final P.e1 f292n = new P.e1(C0010a0.f440G);

    /* renamed from: o, reason: collision with root package name */
    public static final P.e1 f293o = new P.e1(C0010a0.K);

    /* renamed from: p, reason: collision with root package name */
    public static final P.e1 f294p = new P.e1(C0010a0.J);

    /* renamed from: q, reason: collision with root package name */
    public static final P.e1 f295q = new P.e1(C0010a0.f443L);

    /* renamed from: r, reason: collision with root package name */
    public static final P.e1 f296r = new P.e1(C0010a0.f444M);

    /* renamed from: s, reason: collision with root package name */
    public static final P.e1 f297s = new P.e1(C0010a0.f445N);

    /* renamed from: t, reason: collision with root package name */
    public static final P.e1 f298t = new P.e1(C0010a0.f446O);

    /* renamed from: u, reason: collision with root package name */
    public static final P.e1 f299u = new P.e1(C0010a0.f441H);

    /* renamed from: v, reason: collision with root package name */
    public static final P.D f300v = new P.D(C0010a0.f442I);

    static {
        G4.d.E(C0010a0.f459y);
    }

    public static final void a(z0.n0 n0Var, C0061u0 c0061u0, X.d dVar, C0315s c0315s, int i5) {
        c0315s.Z(1925803616);
        int i6 = i5 | (c0315s.f(n0Var) ? 4 : 2) | (c0315s.f(c0061u0) ? 32 : 16) | (c0315s.h(dVar) ? 256 : 128);
        if (c0315s.P(i6 & 1, (i6 & 147) != 146)) {
            F f5 = (F) n0Var;
            C0322v0 a5 = f281a.a(f5.getAccessibilityManager());
            C0322v0 a6 = f282b.a(f5.getAutofill());
            C0322v0 a7 = f284d.a(f5.getAutofillManager());
            C0322v0 a8 = f283c.a(f5.getAutofillTree());
            C0322v0 a9 = f285e.a(f5.getClipboardManager());
            C0322v0 a10 = f.a(f5.getClipboard());
            C0322v0 a11 = f287h.a(f5.getDensity());
            C0322v0 a12 = i.a(f5.getFocusOwner());
            C0322v0 a13 = f288j.a(f5.getFontLoader());
            a13.f4567c = false;
            C0322v0 a14 = f289k.a(f5.getFontFamilyResolver());
            a14.f4567c = false;
            AbstractC0329z.b(new C0322v0[]{a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, f290l.a(f5.getHapticFeedBack()), f291m.a(f5.getInputModeManager()), f292n.a(f5.getLayoutDirection()), f293o.a(f5.getTextInputService()), f294p.a(f5.getSoftwareKeyboardController()), f295q.a(f5.getTextToolbar()), f296r.a(c0061u0), f297s.a(f5.getViewConfiguration()), f298t.a(f5.getWindowInfo()), f299u.a(f5.getPointerIconService()), f286g.a(f5.getGraphicsContext())}, dVar, c0315s, 8 | ((i6 >> 3) & 112));
        } else {
            c0315s.S();
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new C0019d0(n0Var, c0061u0, dVar, i5, 1);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
