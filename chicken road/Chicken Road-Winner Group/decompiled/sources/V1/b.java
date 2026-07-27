package V1;

import A0.s;
import A2.n;
import A2.u;
import I1.B;
import I1.x;
import I1.y;
import K.C0047o;
import K.C0048p;
import K.C0049q;
import M0.c;
import S1.e;
import S1.f;
import S1.h;
import Y1.C0077a;
import a2.C0118n;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.widget.ImageView;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.play_billing.AbstractC0213o0;
import com.google.android.gms.internal.play_billing.Q1;
import com.google.android.gms.internal.play_billing.S1;
import com.google.android.gms.internal.play_billing.W1;
import com.google.android.gms.internal.play_billing.Z1;
import com.google.android.gms.internal.play_billing.a2;
import com.google.android.gms.internal.play_billing.h2;
import com.google.android.gms.internal.play_billing.i2;
import com.google.android.gms.internal.play_billing.l2;
import com.google.android.gms.internal.play_billing.m2;
import d2.C0279i;
import g.AbstractC0301a;
import g0.C0303b;
import g0.InterfaceC0309h;
import g2.InterfaceC0319c;
import h.AbstractC0323a;
import h2.EnumC0326a;
import i1.AbstractC0336f;
import i1.C0337g;
import i1.C0341k;
import io.appmetrica.analytics.impl.C0644l9;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.platform.k;
import io.flutter.plugin.platform.q;
import io.flutter.plugin.platform.r;
import io.flutter.view.i;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.o;
import l.AbstractC1105y;
import l.C1096o;
import m0.N;
import m0.t;
import o1.g;
import org.json.JSONArray;
import org.json.JSONObject;
import x0.C1249b;
import y0.C1251a;
import z2.d;
import z2.j;
import z2.l;
import z2.p;

/* loaded from: classes.dex */
public final class b implements InterfaceC0309h, k, h, N, d {

    /* renamed from: d, reason: collision with root package name */
    public static B f1612d;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1613a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1614b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1615c;

    public /* synthetic */ b(int i3, boolean z3) {
        this.f1613a = i3;
    }

    public static b s(o1.d dVar, g gVar) {
        if (dVar != o1.d.DEFINED_BY_JAVASCRIPT) {
            return new b(dVar, gVar);
        }
        throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
    }

    public void A(m2 m2Var) {
        if (m2Var == null) {
            return;
        }
        try {
            h2 t3 = i2.t();
            t3.e((a2) this.f1614b);
            t3.d();
            i2.s((i2) t3.f2752b, m2Var);
            ((x) this.f1615c).b((i2) t3.b());
        } catch (Throwable th) {
            AbstractC0213o0.h("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // S1.h
    public long a(e eVar) {
        return ((r) this.f1614b).f9322w.a(eVar);
    }

    @Override // S1.h
    public void b(boolean z3) {
        ((r) ((r) this.f1614b).f9322w.f9278b).f9317r = z3;
    }

    @Override // io.flutter.plugin.platform.k
    public void c(i iVar) {
        ((r) this.f1614b).f9308i.f9249a = iVar;
        ((q) this.f1615c).f9290h.f9249a = iVar;
    }

    @Override // S1.h
    public void d(int i3, double d3, double d4) {
        if (((q) this.f1615c).h(i3) != null) {
            return;
        }
        ((r) this.f1614b).f9322w.d(i3, d3, d4);
    }

    @Override // S1.h
    public void e(int i3, int i4) {
        q qVar = (q) this.f1615c;
        if (qVar.h(i3) != null) {
            qVar.f9299q.e(i3, i4);
        } else {
            ((r) this.f1614b).f9322w.e(i3, i4);
        }
    }

    @Override // io.flutter.plugin.platform.k
    public boolean f(int i3) {
        q qVar = (q) this.f1615c;
        if (qVar.h(i3) == null) {
            return ((r) this.f1614b).f(i3);
        }
        qVar.getClass();
        return false;
    }

    @Override // S1.h
    public void g(e eVar) {
        ((q) this.f1615c).f9299q.f(eVar);
    }

    @Override // io.flutter.plugin.platform.k
    public View h(int i3) {
        q qVar = (q) this.f1615c;
        return qVar.h(i3) != null ? qVar.h(i3) : ((r) this.f1614b).h(i3);
    }

    @Override // S1.h
    public void i(int i3) {
        q qVar = (q) this.f1615c;
        if (qVar.h(i3) != null) {
            qVar.f9299q.i(i3);
        } else {
            ((r) this.f1614b).f9322w.i(i3);
        }
    }

    @Override // S1.h
    public void j(f fVar) {
        q qVar = (q) this.f1615c;
        if (qVar.h(fVar.f1407a) != null) {
            qVar.f9299q.j(fVar);
        } else {
            ((r) this.f1614b).f9322w.j(fVar);
        }
    }

    @Override // io.flutter.plugin.platform.k
    public void k() {
        ((r) this.f1614b).k();
        ((q) this.f1615c).k();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bc  */
    @Override // z2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object l(z2.e eVar, InterfaceC0319c interfaceC0319c) {
        j jVar;
        int i3;
        Throwable th;
        n nVar;
        b bVar;
        z2.e eVar2;
        l lVar;
        int i4;
        C0118n c0118n;
        switch (this.f1613a) {
            case C0644l9.f7759C /* 19 */:
                if (interfaceC0319c instanceof j) {
                    jVar = (j) interfaceC0319c;
                    int i5 = jVar.f10722e;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        jVar.f10722e = i5 - Integer.MIN_VALUE;
                        Object obj = jVar.f10721d;
                        EnumC0326a enumC0326a = EnumC0326a.f4994a;
                        i3 = jVar.f10722e;
                        if (i3 != 0) {
                            X0.a.L(obj);
                            g2.h hVar = jVar.f5029b;
                            kotlin.jvm.internal.j.b(hVar);
                            n nVar2 = new n(eVar, hVar);
                            try {
                                C0047o c0047o = (C0047o) this.f1614b;
                                jVar.f10723g = this;
                                jVar.f10724h = eVar;
                                jVar.f10725i = nVar2;
                                jVar.f10722e = 1;
                                if (c0047o.invoke(nVar2, jVar) == enumC0326a) {
                                    return enumC0326a;
                                }
                                bVar = this;
                                eVar2 = eVar;
                                nVar = nVar2;
                            } catch (Throwable th2) {
                                th = th2;
                                nVar = nVar2;
                                nVar.h();
                                throw th;
                            }
                        } else {
                            if (i3 != 1) {
                                if (i3 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                X0.a.L(obj);
                                return C0279i.f4852a;
                            }
                            nVar = jVar.f10725i;
                            eVar2 = jVar.f10724h;
                            bVar = jVar.f10723g;
                            try {
                                X0.a.L(obj);
                            } catch (Throwable th3) {
                                th = th3;
                                nVar.h();
                                throw th;
                            }
                        }
                        nVar.h();
                        p pVar = (p) bVar.f1615c;
                        jVar.f10723g = null;
                        jVar.f10724h = null;
                        jVar.f10725i = null;
                        jVar.f10722e = 2;
                        pVar.l(eVar2, jVar);
                        return enumC0326a;
                    }
                }
                jVar = new j(this, interfaceC0319c);
                Object obj2 = jVar.f10721d;
                EnumC0326a enumC0326a2 = EnumC0326a.f4994a;
                i3 = jVar.f10722e;
                if (i3 != 0) {
                }
                nVar.h();
                p pVar2 = (p) bVar.f1615c;
                jVar.f10723g = null;
                jVar.f10724h = null;
                jVar.f10725i = null;
                jVar.f10722e = 2;
                pVar2.l(eVar2, jVar);
                return enumC0326a2;
            case C0644l9.f7760D /* 20 */:
                Object l3 = ((b) this.f1614b).l(new u(new o(), eVar, (C0049q) this.f1615c, 2), interfaceC0319c);
                return l3 == EnumC0326a.f4994a ? l3 : C0279i.f4852a;
            default:
                if (interfaceC0319c instanceof l) {
                    lVar = (l) interfaceC0319c;
                    int i6 = lVar.f10731e;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        lVar.f10731e = i6 - Integer.MIN_VALUE;
                        Object obj3 = lVar.f10730d;
                        EnumC0326a enumC0326a3 = EnumC0326a.f4994a;
                        i4 = lVar.f10731e;
                        if (i4 != 0) {
                            X0.a.L(obj3);
                            b bVar2 = (b) this.f1614b;
                            C0118n c0118n2 = new C0118n((C0048p) this.f1615c, eVar);
                            try {
                                lVar.f10732g = c0118n2;
                                lVar.f10731e = 1;
                                if (bVar2.l(c0118n2, lVar) == enumC0326a3) {
                                    return enumC0326a3;
                                }
                            } catch (A2.a e3) {
                                e = e3;
                                c0118n = c0118n2;
                                if (e.f90a != c0118n) {
                                }
                                return C0279i.f4852a;
                            }
                        } else {
                            if (i4 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            c0118n = lVar.f10732g;
                            try {
                                X0.a.L(obj3);
                            } catch (A2.a e4) {
                                e = e4;
                                if (e.f90a != c0118n) {
                                    throw e;
                                }
                                return C0279i.f4852a;
                            }
                        }
                        return C0279i.f4852a;
                    }
                }
                lVar = new l(this, interfaceC0319c);
                Object obj32 = lVar.f10730d;
                EnumC0326a enumC0326a32 = EnumC0326a.f4994a;
                i4 = lVar.f10731e;
                if (i4 != 0) {
                }
                return C0279i.f4852a;
        }
    }

    @Override // S1.h
    public void m(e eVar) {
        ((r) this.f1614b).f9322w.m(eVar);
    }

    @Override // S1.h
    public void n(int i3) {
        q qVar = (q) this.f1615c;
        if (qVar.h(i3) != null) {
            qVar.f9299q.n(i3);
        } else {
            ((r) this.f1614b).f9322w.n(i3);
        }
    }

    @Override // S1.h
    public void o(S1.g gVar, F1.b bVar) {
        if (((q) this.f1615c).h(gVar.f1422a) != null) {
            return;
        }
        ((r) this.f1614b).f9322w.o(gVar, bVar);
    }

    @Override // S1.h
    public boolean q() {
        FlutterJNI flutterJNI = ((q) this.f1615c).f9288e;
        if (flutterJNI == null) {
            return false;
        }
        return flutterJNI.IsSurfaceControlEnabled();
    }

    public void r() {
        V.e eVar;
        ImageView imageView = (ImageView) this.f1614b;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            Rect rect = AbstractC1105y.f9913a;
        }
        if (drawable == null || (eVar = (V.e) this.f1615c) == null) {
            return;
        }
        C1096o.c(drawable, eVar, imageView.getDrawableState());
    }

    public C0341k t() {
        C0341k c0341k;
        a1.g gVar = (a1.g) this.f1614b;
        if (gVar.f1793j.b(gVar.f1792i, 212800000) == 0) {
            y yVar = new y();
            yVar.f687d = new P0.d[]{c.f967a};
            yVar.f686c = new C0077a(4, gVar);
            yVar.f684a = false;
            yVar.f685b = 27601;
            c0341k = gVar.b(0, yVar.a());
        } else {
            Q0.d dVar = new Q0.d(new Status(17, null, null, null));
            C0341k c0341k2 = new C0341k();
            c0341k2.d(dVar);
            c0341k = c0341k2;
        }
        b0.i iVar = new b0.i(28, this);
        c0341k.getClass();
        A0.q qVar = AbstractC0336f.f5012a;
        C0341k c0341k3 = new C0341k();
        c0341k.f5023b.d(new C0337g(qVar, iVar, c0341k3));
        c0341k.g();
        return c0341k3;
    }

    public void u(int i3) {
        int resourceId;
        ImageView imageView = (ImageView) this.f1614b;
        A0.j I3 = A0.j.I(imageView.getContext(), null, AbstractC0301a.f4930e, i3);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) I3.f67c;
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = AbstractC0323a.a(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                Rect rect = AbstractC1105y.f9913a;
            }
            if (typedArray.hasValue(2)) {
                H.e.c(imageView, I3.z(2));
            }
            if (typedArray.hasValue(3)) {
                H.e.d(imageView, AbstractC1105y.c(typedArray.getInt(3, -1), null));
            }
            I3.L();
        } catch (Throwable th) {
            I3.L();
            throw th;
        }
    }

    public void v(Q1 q12) {
        if (q12 == null) {
            return;
        }
        try {
            h2 t3 = i2.t();
            t3.e((a2) this.f1614b);
            t3.d();
            i2.n((i2) t3.f2752b, q12);
            ((x) this.f1615c).b((i2) t3.b());
        } catch (Throwable th) {
            AbstractC0213o0.h("BillingLogger", "Unable to log.", th);
        }
    }

    public void w(Q1 q12, int i3) {
        try {
            Z1 z12 = (Z1) ((a2) this.f1614b).g();
            z12.d();
            a2.n((a2) z12.f2752b, i3);
            this.f1614b = (a2) z12.b();
            v(q12);
        } catch (Throwable th) {
            AbstractC0213o0.h("BillingLogger", "Unable to log.", th);
        }
    }

    public void x(S1 s12) {
        if (s12 == null) {
            return;
        }
        try {
            h2 t3 = i2.t();
            t3.e((a2) this.f1614b);
            t3.d();
            i2.o((i2) t3.f2752b, s12);
            ((x) this.f1615c).b((i2) t3.b());
        } catch (Throwable th) {
            AbstractC0213o0.h("BillingLogger", "Unable to log.", th);
        }
    }

    public void y(W1 w12) {
        try {
            h2 t3 = i2.t();
            t3.e((a2) this.f1614b);
            t3.d();
            i2.p((i2) t3.f2752b, w12);
            ((x) this.f1615c).b((i2) t3.b());
        } catch (Throwable th) {
            AbstractC0213o0.h("BillingLogger", "Unable to log.", th);
        }
    }

    public void z(l2 l2Var) {
        try {
            x xVar = (x) this.f1615c;
            h2 t3 = i2.t();
            t3.e((a2) this.f1614b);
            t3.d();
            i2.r((i2) t3.f2752b, l2Var);
            xVar.b((i2) t3.b());
        } catch (Throwable th) {
            AbstractC0213o0.h("BillingLogger", "Unable to log.", th);
        }
    }

    public b(A0.j jVar) {
        this.f1613a = 18;
        this.f1615c = jVar;
    }

    public b(Context context) {
        a1.e eVar;
        this.f1613a = 1;
        this.f1614b = new a1.g(context, P0.f.f1134b);
        synchronized (a1.e.class) {
            try {
                if (a1.e.f1785d == null) {
                    a1.e.f1785d = new a1.e(context.getApplicationContext(), 0);
                }
                eVar = a1.e.f1785d;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f1615c = eVar;
    }

    public b(WebView webView, C0077a c0077a) {
        this.f1613a = 16;
        X0.a.a(webView, "WebView is null");
        this.f1614b = webView;
        this.f1615c = c0077a;
    }

    public /* synthetic */ b(Object obj, int i3, Object obj2) {
        this.f1613a = i3;
        this.f1614b = obj;
        this.f1615c = obj2;
    }

    public b(o1.d dVar, g gVar) {
        this.f1613a = 12;
        this.f1615c = dVar;
        this.f1614b = gVar;
    }

    public b(Context context, a2 a2Var) {
        A0.j c3;
        C1249b c1249b;
        C0077a c0077a;
        Set set;
        this.f1613a = 10;
        x xVar = new x();
        try {
            s.b(context);
            c3 = s.a().c(C1251a.f10571e);
            c1249b = new C1249b("proto");
            c0077a = new C0077a(12);
            set = (Set) c3.f66b;
        } catch (Throwable unused) {
            xVar.f682a = true;
        }
        if (set.contains(c1249b)) {
            xVar.f683b = new A0.j((A0.k) c3.f67c, c1249b, c0077a, (s) c3.f68d);
            this.f1615c = xVar;
            this.f1614b = a2Var;
            return;
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", c1249b, set));
    }

    public b(String str) {
        this.f1613a = 9;
        JSONObject jSONObject = new JSONObject(str);
        this.f1614b = jSONObject;
        JSONArray optJSONArray = jSONObject.optJSONArray("products");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i3);
                if (optJSONObject != null) {
                    arrayList.add(new t(optJSONObject));
                }
            }
        }
        this.f1615c = arrayList;
    }

    public b(a aVar, b0.i iVar) {
        this.f1613a = 0;
        this.f1614b = aVar;
        this.f1615c = iVar;
        iVar.f2461b = new b0.i(26, this);
    }

    public b(int i3) {
        this.f1613a = i3;
        switch (i3) {
            case 17:
                io.flutter.plugin.editing.k kVar = new io.flutter.plugin.editing.k(9);
                this.f1614b = kVar;
                this.f1615c = new b0.j(kVar);
                break;
            default:
                this.f1614b = new ReentrantLock();
                this.f1615c = new LinkedHashMap();
                break;
        }
    }

    public b(View view, InputMethodManager inputMethodManager, b0.i iVar) {
        this.f1613a = 4;
        if (Build.VERSION.SDK_INT >= 33) {
            view.setAutoHandwritingEnabled(false);
        }
        this.f1615c = view;
        this.f1614b = inputMethodManager;
        iVar.f2461b = this;
    }

    public b(C0303b c0303b) {
        this.f1613a = 3;
        b bVar = new b(2);
        this.f1614b = c0303b;
        this.f1615c = bVar;
    }

    public b(ImageView imageView) {
        this.f1613a = 6;
        this.f1614b = imageView;
    }
}
