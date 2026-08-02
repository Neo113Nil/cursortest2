package v3;

import A0.B0;
import A0.Z;
import C2.i;
import E2.l;
import E2.m;
import F2.h;
import H2.k;
import K0.C0203h;
import K0.N;
import O4.A;
import O4.C0269o;
import O4.InterfaceC0261g;
import O4.InterfaceC0262h;
import P.AbstractC0329z;
import P.C0305m0;
import P.P0;
import Q.J;
import Q2.InterfaceC0391w0;
import T2.t;
import Y.j;
import a.AbstractC0444a;
import a3.AbstractC0467k;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.view.View;
import androidx.lifecycle.B;
import androidx.lifecycle.C0483l;
import androidx.work.impl.WorkDatabase_Impl;
import b0.o;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.B3;
import com.google.android.gms.internal.ads.C3;
import f2.q;
import f2.r;
import g3.InterfaceC1983a;
import i0.F;
import i0.z;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;
import k0.C2023c;
import l3.C2054a;
import l4.C2062d;
import o.C2191a;
import q2.C2307j;
import r0.AbstractC2346c;
import t2.C2421i;
import t3.AbstractC2425d;
import v1.n;
import v1.v;
import v1.w;
import v1.y;
import x0.O;
import z0.AbstractC2749f;
import z0.AbstractC2756m;
import z0.C2731G;
import z0.EnumC2727C;
import z0.InterfaceC2758o;

/* loaded from: classes.dex */
public final class g implements InterfaceC1983a, B0, i, M0.d, InterfaceC0261g, y4.e, J, B3, j, r, n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f20438k;

    /* renamed from: l, reason: collision with root package name */
    public Object f20439l;

    /* renamed from: m, reason: collision with root package name */
    public Object f20440m;

    public g(int i) {
        this.f20438k = i;
        switch (i) {
            case 14:
                this.f20439l = new B();
                this.f20440m = new C2307j();
                E(r.f17008h);
                break;
            case 16:
                this.f20439l = Collections.synchronizedMap(new WeakHashMap());
                this.f20440m = Collections.synchronizedMap(new WeakHashMap());
                break;
            case 25:
                this.f20439l = new R.e(new C2731G[16]);
                break;
            default:
                this.f20439l = new Object();
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [R.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [R.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static void v(C2731G c2731g) {
        if (c2731g.f21622Y > 0) {
            if (c2731g.f21613P.f21653d == EnumC2727C.f21589o && !c2731g.p() && !c2731g.q() && !c2731g.f21623Z && c2731g.J()) {
                o oVar = c2731g.f21612O.f;
                if ((oVar.f7165n & 256) != 0) {
                    while (oVar != null) {
                        if ((oVar.f7164m & 256) != 0) {
                            AbstractC2756m abstractC2756m = oVar;
                            ?? r5 = 0;
                            while (abstractC2756m != 0) {
                                if (abstractC2756m instanceof InterfaceC2758o) {
                                    InterfaceC2758o interfaceC2758o = (InterfaceC2758o) abstractC2756m;
                                    interfaceC2758o.T(AbstractC2749f.t(interfaceC2758o, 256));
                                } else if ((abstractC2756m.f7164m & 256) != 0 && (abstractC2756m instanceof AbstractC2756m)) {
                                    o oVar2 = abstractC2756m.f21839z;
                                    int i = 0;
                                    abstractC2756m = abstractC2756m;
                                    r5 = r5;
                                    while (oVar2 != null) {
                                        if ((oVar2.f7164m & 256) != 0) {
                                            i++;
                                            r5 = r5;
                                            if (i == 1) {
                                                abstractC2756m = oVar2;
                                            } else {
                                                if (r5 == 0) {
                                                    r5 = new R.e(new o[16]);
                                                }
                                                if (abstractC2756m != 0) {
                                                    r5.c(abstractC2756m);
                                                    abstractC2756m = 0;
                                                }
                                                r5.c(oVar2);
                                            }
                                        }
                                        oVar2 = oVar2.f7167p;
                                        abstractC2756m = abstractC2756m;
                                        r5 = r5;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                abstractC2756m = AbstractC2749f.f(r5);
                            }
                        }
                        if ((oVar.f7165n & 256) == 0) {
                            break;
                        } else {
                            oVar = oVar.f7167p;
                        }
                    }
                }
            }
            c2731g.f21621X = false;
            R.e y5 = c2731g.y();
            Object[] objArr = y5.f5106k;
            int i5 = y5.f5108m;
            for (int i6 = 0; i6 < i5; i6++) {
                v((C2731G) objArr[i6]);
            }
        }
    }

    public static E2.e w(E2.i iVar, Throwable th) {
        if (th instanceof l) {
            iVar.f1460z.getClass();
            E2.c cVar = H2.d.f2283a;
            iVar.f1460z.getClass();
        } else {
            iVar.f1460z.getClass();
            E2.c cVar2 = H2.d.f2283a;
        }
        return new E2.e(null, iVar, th);
    }

    public U1.d A() {
        U1.d dVar;
        W1.a aVar = (W1.a) this.f20439l;
        synchronized (aVar.f6027c) {
            Iterator it = aVar.f6028d.entrySet().iterator();
            do {
                dVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                U1.d dVar2 = (U1.d) entry.getValue();
                if (kotlin.jvm.internal.l.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    dVar = dVar2;
                }
            } while (dVar == null);
        }
        return dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x002c, code lost:
    
        if (((H2.h) r17.f20440m).a(r19) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m B(E2.i iVar, h hVar) {
        boolean z3;
        iVar.f.getClass();
        Bitmap.Config config = iVar.f1440d;
        if (AbstractC2425d.z(config)) {
            if (AbstractC2425d.z(config)) {
                if (!iVar.f1445k) {
                    config = Bitmap.Config.ARGB_8888;
                }
            }
        }
        AbstractC0444a abstractC0444a = hVar.f1536a;
        F2.b bVar = F2.b.f;
        F2.g gVar = (abstractC0444a.equals(bVar) || hVar.f1537b.equals(bVar)) ? F2.g.f1533l : iVar.f1457w;
        if (iVar.f1446l) {
            iVar.f.getClass();
            if (config != Bitmap.Config.ALPHA_8) {
                z3 = true;
                return new m(iVar.f1437a, config, null, hVar, gVar, H2.d.a(iVar), z3, iVar.f1447m, null, iVar.f1443h, iVar.i, iVar.f1458x, iVar.f1448n, iVar.f1449o, iVar.f1450p);
            }
        }
        z3 = false;
        return new m(iVar.f1437a, config, null, hVar, gVar, H2.d.a(iVar), z3, iVar.f1447m, null, iVar.f1443h, iVar.i, iVar.f1458x, iVar.f1448n, iVar.f1449o, iVar.f1450p);
    }

    public void C(String str, U1.d dVar) {
        kotlin.jvm.internal.l.f("provider", dVar);
        W1.a aVar = (W1.a) this.f20439l;
        synchronized (aVar.f6027c) {
            if (aVar.f6028d.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            aVar.f6028d.put(str, dVar);
        }
    }

    public void D() {
        if (!((W1.a) this.f20439l).f6031h) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        U1.a aVar = (U1.a) this.f20440m;
        if (aVar == null) {
            aVar = new U1.a(this);
        }
        this.f20440m = aVar;
        try {
            C0483l.class.getDeclaredConstructor(null);
            U1.a aVar2 = (U1.a) this.f20440m;
            if (aVar2 != null) {
                aVar2.f5849a.add(C0483l.class.getName());
            }
        } catch (NoSuchMethodException e3) {
            throw new IllegalArgumentException("Class " + C0483l.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e3);
        }
    }

    public void E(AbstractC2346c abstractC2346c) {
        boolean z3;
        B b3 = (B) this.f20439l;
        synchronized (b3.f6996a) {
            z3 = b3.f6999d == B.i;
            b3.f6999d = abstractC2346c;
        }
        if (z3) {
            C2191a.Q().R(b3.f7002h);
        }
        if (abstractC2346c instanceof q) {
            ((C2307j) this.f20440m).j((q) abstractC2346c);
        } else if (abstractC2346c instanceof f2.o) {
            ((C2307j) this.f20440m).k(((f2.o) abstractC2346c).i);
        }
    }

    public void F(View view, float[] fArr) {
        Object parent = view.getParent();
        boolean z3 = parent instanceof View;
        float[] fArr2 = (float[]) this.f20439l;
        if (z3) {
            F((View) parent, fArr);
            z.d(fArr2);
            z.f(fArr2, -view.getScrollX(), -view.getScrollY());
            Z.B(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            z.d(fArr2);
            z.f(fArr2, left, top);
            Z.B(fArr, fArr2);
        } else {
            int[] iArr = (int[]) this.f20440m;
            view.getLocationInWindow(iArr);
            z.d(fArr2);
            z.f(fArr2, -view.getScrollX(), -view.getScrollY());
            Z.B(fArr, fArr2);
            float f = iArr[0];
            float f5 = iArr[1];
            z.d(fArr2);
            z.f(fArr2, f, f5);
            Z.B(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        F.o(matrix, fArr2);
        Z.B(fArr, fArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m G(m mVar) {
        boolean z3;
        boolean z5;
        Bitmap.Config config = mVar.f1463b;
        E2.b bVar = mVar.f1474o;
        boolean z6 = true;
        if (!AbstractC2425d.z(config) || ((H2.h) this.f20440m).b()) {
            z3 = false;
        } else {
            config = Bitmap.Config.ARGB_8888;
            z3 = true;
        }
        Bitmap.Config config2 = config;
        if (mVar.f1474o.f1403k) {
            H2.l lVar = (H2.l) this.f20439l;
            synchronized (lVar) {
                lVar.a();
                z5 = lVar.f2307o;
            }
            if (!z5) {
                bVar = E2.b.DISABLED;
                return !z6 ? new m(mVar.f1462a, config2, mVar.f1464c, mVar.f1465d, mVar.f1466e, mVar.f, mVar.f1467g, mVar.f1468h, mVar.i, mVar.f1469j, mVar.f1470k, mVar.f1471l, mVar.f1472m, mVar.f1473n, bVar) : mVar;
            }
        }
        z6 = z3;
        if (!z6) {
        }
    }

    public void H(boolean z3, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (((Map) this.f20439l)) {
            hashMap = new HashMap((Map) this.f20439l);
        }
        synchronized (((Map) this.f20440m)) {
            hashMap2 = new HashMap((Map) this.f20440m);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z3 || ((Boolean) entry.getValue()).booleanValue()) {
                entry.getKey().getClass();
                throw new ClassCastException();
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z3 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((D3.f) entry2.getKey()).a(new k3.d(status));
            }
        }
    }

    public void I(InterfaceC0391w0 interfaceC0391w0) {
        synchronized (this.f20439l) {
            this.f20440m = interfaceC0391w0;
        }
    }

    @Override // v1.n
    public Object a() {
        return (y) this.f20439l;
    }

    @Override // v1.n
    public boolean b(CharSequence charSequence, int i, int i5, v vVar) {
        if ((vVar.f20383c & 4) > 0) {
            return true;
        }
        if (((y) this.f20439l) == null) {
            this.f20439l = new y(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((C2054a) this.f20440m).getClass();
        ((y) this.f20439l).setSpan(new w(vVar), i, i5, 33);
        return true;
    }

    @Override // A0.B0
    public void c(View view, float[] fArr) {
        z.d(fArr);
        F(view, fArr);
    }

    @Override // g3.InterfaceC1983a
    public D3.o d() {
        D3.o d5 = ((f) this.f20439l).d();
        C2023c c2023c = new C2023c(15, this);
        d5.getClass();
        D3.n nVar = D3.g.f947a;
        D3.o oVar = new D3.o();
        d5.f967b.e(new D3.i(nVar, c2023c, oVar, 1));
        d5.i();
        return oVar;
    }

    @Override // Q.J
    public List e(Integer num) {
        List e3 = ((J) this.f20439l).e(null);
        P0 p02 = (P0) this.f20440m;
        int i = p02.f4385v;
        return i < 0 ? e3 : X3.m.i0(AbstractC0444a.i(p02, num, i, Integer.valueOf(p02.D(p02.f4367b, i))), e3);
    }

    @Override // M0.d
    public int f(int i) {
        do {
            i = ((M0.e) this.f20440m).l(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f20439l).charAt(i)));
        return i;
    }

    @Override // M0.d
    public int g(int i) {
        do {
            i = ((M0.e) this.f20440m).j(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f20439l).charAt(i - 1)));
        return i;
    }

    @Override // C2.i
    public void h(C2.b bVar, Bitmap bitmap, Map map) {
        int i;
        int s2 = AbstractC2425d.s(bitmap);
        C2.f fVar = (C2.f) this.f20440m;
        synchronized (fVar.f19038c) {
            i = fVar.f19036a;
        }
        if (s2 <= i) {
            ((C2.f) this.f20440m).c(bVar, new C2.e(bitmap, map, s2));
        } else {
            ((C2.f) this.f20440m).d(bVar);
            ((C2.h) this.f20439l).i(bVar, bitmap, map, s2);
        }
    }

    @Override // Y.j
    public Object i(Y.b bVar, Object obj) {
        return ((i4.e) this.f20439l).invoke(bVar, obj);
    }

    @Override // O4.InterfaceC0261g
    public Type j() {
        return (Type) this.f20439l;
    }

    @Override // y4.e
    public void k(y4.z zVar) {
        InterfaceC0262h interfaceC0262h = (InterfaceC0262h) this.f20439l;
        A a5 = (A) this.f20440m;
        try {
            try {
                interfaceC0262h.a(a5, a5.c(zVar));
            } catch (Throwable th) {
                O4.Z.s(th);
                th.printStackTrace();
            }
        } catch (Throwable th2) {
            O4.Z.s(th2);
            try {
                interfaceC0262h.h(a5, th2);
            } catch (Throwable th3) {
                O4.Z.s(th3);
                th3.printStackTrace();
            }
        }
    }

    @Override // y4.e
    public void l(C4.i iVar, IOException iOException) {
        try {
            ((InterfaceC0262h) this.f20439l).h((A) this.f20440m, iOException);
        } catch (Throwable th) {
            O4.Z.s(th);
            th.printStackTrace();
        }
    }

    @Override // C2.i
    public void m(int i) {
        int i5;
        if (i >= 40) {
            ((C2.f) this.f20440m).g(-1);
            return;
        }
        if (10 > i || i >= 20) {
            return;
        }
        C2.f fVar = (C2.f) this.f20440m;
        synchronized (fVar.f19038c) {
            i5 = fVar.f19039d;
        }
        fVar.g(i5 / 2);
    }

    @Override // com.google.android.gms.internal.ads.B3
    public void n(C3 c32) {
        U2.j.i("Failed to load URL: " + ((String) this.f20439l) + "\n" + c32.toString());
        ((t) this.f20440m).b(null);
    }

    @Override // O4.InterfaceC0261g
    public Object o(A a5) {
        Executor executor = (Executor) this.f20440m;
        return executor == null ? a5 : new C0269o(executor, a5);
    }

    @Override // C2.i
    public C2.c p(C2.b bVar) {
        C2.e eVar = (C2.e) ((C2.f) this.f20440m).b(bVar);
        if (eVar != null) {
            return new C2.c(eVar.f824a, eVar.f825b);
        }
        return null;
    }

    @Override // M0.d
    public int q(int i) {
        CharSequence charSequence;
        do {
            i = ((M0.e) this.f20440m).j(i);
            if (i != -1) {
                charSequence = (CharSequence) this.f20439l;
                if (i == charSequence.length()) {
                }
            }
            return -1;
        } while (Character.isWhitespace(charSequence.charAt(i)));
        return i;
    }

    @Override // M0.d
    public int r(int i) {
        do {
            i = ((M0.e) this.f20440m).l(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f20439l).charAt(i - 1)));
        return i;
    }

    public void s(String str, Object obj) {
        ((ArrayList) this.f20439l).add(AbstractC0467k.v(str, "=", String.valueOf(obj)));
    }

    public P0.w t(List list) {
        P0.g gVar;
        Exception e3;
        P0.g gVar2;
        try {
            int size = list.size();
            int i = 0;
            gVar = null;
            while (i < size) {
                try {
                    gVar2 = (P0.g) list.get(i);
                } catch (Exception e5) {
                    e3 = e5;
                }
                try {
                    gVar2.a((P0.h) this.f20440m);
                    i++;
                    gVar = gVar2;
                } catch (Exception e6) {
                    e3 = e6;
                    gVar = gVar2;
                    StringBuilder sb = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                    sb2.append(((M0.e) ((P0.h) this.f20440m).f4655p).c());
                    sb2.append(", composition=");
                    sb2.append(((P0.h) this.f20440m).e());
                    sb2.append(", selection=");
                    P0.h hVar = (P0.h) this.f20440m;
                    sb2.append((Object) N.g(K0.F.b(hVar.f4651l, hVar.f4652m)));
                    sb2.append("):");
                    sb.append(sb2.toString());
                    sb.append('\n');
                    X3.m.c0(list, sb, new O3.f(4, gVar, this), 60);
                    String sb3 = sb.toString();
                    kotlin.jvm.internal.l.e("toString(...)", sb3);
                    throw new RuntimeException(sb3, e3);
                }
            }
            P0.h hVar2 = (P0.h) this.f20440m;
            hVar2.getClass();
            C0203h c0203h = new C0203h(((M0.e) hVar2.f4655p).toString());
            P0.h hVar3 = (P0.h) this.f20440m;
            long b3 = K0.F.b(hVar3.f4651l, hVar3.f4652m);
            N n5 = N.f(((P0.w) this.f20439l).f4680b) ? null : new N(b3);
            P0.w wVar = new P0.w(c0203h, n5 != null ? n5.f2803a : K0.F.b(N.d(b3), N.e(b3)), ((P0.h) this.f20440m).e());
            this.f20439l = wVar;
            return wVar;
        } catch (Exception e7) {
            gVar = null;
            e3 = e7;
        }
    }

    public String toString() {
        switch (this.f20438k) {
            case 17:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.f20440m.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.f20439l;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    sb.append((String) arrayList.get(i));
                    if (i < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public Bundle u(String str) {
        kotlin.jvm.internal.l.f("key", str);
        W1.a aVar = (W1.a) this.f20439l;
        if (!aVar.f6030g) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle bundle = aVar.f;
        if (bundle == null) {
            return null;
        }
        Bundle C5 = bundle.containsKey(str) ? G4.l.C(str, bundle) : null;
        bundle.remove(str);
        if (bundle.isEmpty()) {
            aVar.f = null;
        }
        return C5;
    }

    public ArrayList x(String str) {
        R1.j b3 = R1.j.b("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            b3.i(1);
        } else {
            b3.k(str, 1);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f20439l;
        workDatabase_Impl.b();
        Cursor g5 = workDatabase_Impl.g(b3);
        try {
            ArrayList arrayList = new ArrayList(g5.getCount());
            while (g5.moveToNext()) {
                arrayList.add(g5.getString(0));
            }
            return arrayList;
        } finally {
            g5.close();
            b3.l();
        }
    }

    public O y() {
        return (O) ((C0305m0) this.f20440m).getValue();
    }

    public C2062d z() {
        Matcher matcher = (Matcher) this.f20439l;
        return AbstractC0444a.f0(matcher.start(), matcher.end());
    }

    public /* synthetic */ g(int i, Object obj, Object obj2) {
        this.f20438k = i;
        this.f20439l = obj;
        this.f20440m = obj2;
    }

    public /* synthetic */ g(int i, boolean z3) {
        this.f20438k = i;
    }

    public g(Context context) {
        e eVar;
        this.f20438k = 0;
        this.f20439l = new f(context, j3.f.f17514b);
        synchronized (e.class) {
            try {
                if (e.f20430o == null) {
                    e.f20430o = new e(context.getApplicationContext(), 0);
                }
                eVar = e.f20430o;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f20440m = eVar;
    }

    public /* synthetic */ g(Object obj) {
        this.f20438k = 17;
        this.f20440m = obj;
        this.f20439l = new ArrayList();
    }

    public g(String str, G4.l lVar, Q1.j jVar) {
        this.f20438k = 15;
        this.f20440m = str;
        this.f20439l = lVar;
    }

    public g(WorkDatabase_Impl workDatabase_Impl, int i) {
        this.f20438k = i;
        switch (i) {
            case 20:
                this.f20439l = workDatabase_Impl;
                this.f20440m = new o2.b(workDatabase_Impl, 3);
                break;
            default:
                this.f20439l = workDatabase_Impl;
                this.f20440m = new o2.b(workDatabase_Impl, 0);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(C2421i c2421i, H2.l lVar) {
        Object jVar;
        this.f20438k = 4;
        int i = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        this.f20439l = lVar;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 26) {
            boolean z3 = H2.a.f2277a;
        } else if (!H2.a.f2277a) {
            if (i5 != 26 && i5 != 27) {
                jVar = new H2.j(i, true);
            } else {
                jVar = new k();
            }
            this.f20440m = jVar;
        }
        jVar = new H2.j(objArr2 == true ? 1 : 0, objArr == true ? 1 : 0);
        this.f20440m = jVar;
    }

    public g(W1.a aVar) {
        this.f20438k = 12;
        this.f20439l = aVar;
    }

    public g(C2731G c2731g, O o5) {
        this.f20438k = 24;
        this.f20439l = c2731g;
        this.f20440m = AbstractC0329z.t(o5);
    }

    public g(int i, C2.h hVar) {
        this.f20438k = 3;
        this.f20439l = hVar;
        this.f20440m = new C2.f(i, this);
    }

    public g(A a5, InterfaceC0262h interfaceC0262h) {
        this.f20438k = 8;
        this.f20440m = a5;
        this.f20439l = interfaceC0262h;
    }

    public g(Matcher matcher, String str) {
        this.f20438k = 21;
        kotlin.jvm.internal.l.f("input", str);
        this.f20439l = matcher;
        this.f20440m = str;
    }

    public g(float[] fArr) {
        this.f20438k = 1;
        this.f20439l = fArr;
        this.f20440m = new int[2];
    }
}
