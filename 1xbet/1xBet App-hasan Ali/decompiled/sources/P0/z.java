package P0;

import A0.C0040k0;
import A0.F;
import A0.RunnableC0049o;
import E.C0116v;
import K0.L;
import K0.N;
import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import h0.C1989c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import k4.AbstractC2036a;
import r0.AbstractC2346c;

/* loaded from: classes.dex */
public final class z implements r {

    /* renamed from: a, reason: collision with root package name */
    public final View f4689a;

    /* renamed from: b, reason: collision with root package name */
    public final v3.e f4690b;

    /* renamed from: c, reason: collision with root package name */
    public final A f4691c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4692d;

    /* renamed from: e, reason: collision with root package name */
    public kotlin.jvm.internal.m f4693e;
    public kotlin.jvm.internal.m f;

    /* renamed from: g, reason: collision with root package name */
    public w f4694g;

    /* renamed from: h, reason: collision with root package name */
    public k f4695h;
    public final ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f4696j;

    /* renamed from: k, reason: collision with root package name */
    public Rect f4697k;

    /* renamed from: l, reason: collision with root package name */
    public final C0333c f4698l;

    /* renamed from: m, reason: collision with root package name */
    public final R.e f4699m;

    /* renamed from: n, reason: collision with root package name */
    public RunnableC0049o f4700n;

    public z(View view, F f) {
        v3.e eVar = new v3.e(view);
        A a5 = new A(Choreographer.getInstance());
        this.f4689a = view;
        this.f4690b = eVar;
        this.f4691c = a5;
        this.f4693e = C0332b.f4625o;
        this.f = C0332b.f4626p;
        this.f4694g = new w(4, N.f2801b, "");
        this.f4695h = k.f4657g;
        this.i = new ArrayList();
        this.f4696j = G4.d.D(W3.f.f6034k, new C0040k0(19, this));
        this.f4698l = new C0333c(f, eVar);
        this.f4699m = new R.e(new y[16]);
    }

    /* JADX WARN: Type inference failed for: r12v14, types: [W3.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v22, types: [W3.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v8, types: [W3.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [W3.e, java.lang.Object] */
    @Override // P0.r
    public final void a(w wVar, w wVar2) {
        boolean z3 = (N.a(this.f4694g.f4680b, wVar2.f4680b) && kotlin.jvm.internal.l.a(this.f4694g.f4681c, wVar2.f4681c)) ? false : true;
        this.f4694g = wVar2;
        int size = this.i.size();
        for (int i = 0; i < size; i++) {
            s sVar = (s) ((WeakReference) this.i.get(i)).get();
            if (sVar != null) {
                sVar.f4669d = wVar2;
            }
        }
        C0333c c0333c = this.f4698l;
        synchronized (c0333c.f4632c) {
            c0333c.f4637j = null;
            c0333c.f4639l = null;
            c0333c.f4638k = null;
            c0333c.f4640m = C0332b.f4623m;
            c0333c.f4641n = null;
            c0333c.f4642o = null;
        }
        if (kotlin.jvm.internal.l.a(wVar, wVar2)) {
            if (z3) {
                v3.e eVar = this.f4690b;
                int e3 = N.e(wVar2.f4680b);
                int d5 = N.d(wVar2.f4680b);
                N n5 = this.f4694g.f4681c;
                int e5 = n5 != null ? N.e(n5.f2803a) : -1;
                N n6 = this.f4694g.f4681c;
                ((InputMethodManager) eVar.f20433m.getValue()).updateSelection((View) eVar.f20432l, e3, d5, e5, n6 != null ? N.d(n6.f2803a) : -1);
                return;
            }
            return;
        }
        if (wVar != null && (!kotlin.jvm.internal.l.a(wVar.f4679a.f2829l, wVar2.f4679a.f2829l) || (N.a(wVar.f4680b, wVar2.f4680b) && !kotlin.jvm.internal.l.a(wVar.f4681c, wVar2.f4681c)))) {
            v3.e eVar2 = this.f4690b;
            ((InputMethodManager) eVar2.f20433m.getValue()).restartInput((View) eVar2.f20432l);
            return;
        }
        int size2 = this.i.size();
        for (int i5 = 0; i5 < size2; i5++) {
            s sVar2 = (s) ((WeakReference) this.i.get(i5)).get();
            if (sVar2 != null) {
                w wVar3 = this.f4694g;
                v3.e eVar3 = this.f4690b;
                if (sVar2.f4672h) {
                    sVar2.f4669d = wVar3;
                    if (sVar2.f) {
                        ((InputMethodManager) eVar3.f20433m.getValue()).updateExtractedText((View) eVar3.f20432l, sVar2.f4670e, AbstractC2346c.F(wVar3));
                    }
                    N n7 = wVar3.f4681c;
                    int e6 = n7 != null ? N.e(n7.f2803a) : -1;
                    N n8 = wVar3.f4681c;
                    int d6 = n8 != null ? N.d(n8.f2803a) : -1;
                    long j5 = wVar3.f4680b;
                    ((InputMethodManager) eVar3.f20433m.getValue()).updateSelection((View) eVar3.f20432l, N.e(j5), N.d(j5), e6, d6);
                }
            }
        }
    }

    @Override // P0.r
    public final void b(w wVar, q qVar, L l5, A.B b3, C1989c c1989c, C1989c c1989c2) {
        C0333c c0333c = this.f4698l;
        synchronized (c0333c.f4632c) {
            try {
                c0333c.f4637j = wVar;
                c0333c.f4639l = qVar;
                c0333c.f4638k = l5;
                c0333c.f4640m = b3;
                c0333c.f4641n = c1989c;
                c0333c.f4642o = c1989c2;
                if (!c0333c.f4634e) {
                    if (c0333c.f4633d) {
                    }
                }
                c0333c.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // P0.r
    public final void c() {
        i(y.f4684k);
    }

    @Override // P0.r
    public final void d(w wVar, k kVar, A.s sVar, C0116v c0116v) {
        this.f4692d = true;
        this.f4694g = wVar;
        this.f4695h = kVar;
        this.f4693e = sVar;
        this.f = c0116v;
        i(y.f4684k);
    }

    @Override // P0.r
    public final void e() {
        i(y.f4686m);
    }

    @Override // P0.r
    public final void f(C1989c c1989c) {
        Rect rect;
        this.f4697k = new Rect(AbstractC2036a.U(c1989c.f17193a), AbstractC2036a.U(c1989c.f17194b), AbstractC2036a.U(c1989c.f17195c), AbstractC2036a.U(c1989c.f17196d));
        if (!this.i.isEmpty() || (rect = this.f4697k) == null) {
            return;
        }
        this.f4689a.requestRectangleOnScreen(new Rect(rect));
    }

    @Override // P0.r
    public final void g() {
        i(y.f4687n);
    }

    @Override // P0.r
    public final void h() {
        this.f4692d = false;
        this.f4693e = C0332b.f4627q;
        this.f = C0332b.f4628r;
        this.f4697k = null;
        i(y.f4685l);
    }

    public final void i(y yVar) {
        this.f4699m.c(yVar);
        if (this.f4700n == null) {
            RunnableC0049o runnableC0049o = new RunnableC0049o(4, this);
            this.f4691c.execute(runnableC0049o);
            this.f4700n = runnableC0049o;
        }
    }
}
