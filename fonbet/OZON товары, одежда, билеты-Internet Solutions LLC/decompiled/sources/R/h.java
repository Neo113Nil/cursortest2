package R;

import B90.b0;
import C.A;
import C.Y;
import G.q;
import G.r;
import N.y;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.AbstractC5111p;
import androidx.camera.core.impl.C5123v0;
import androidx.camera.core.impl.I;
import androidx.camera.core.impl.InterfaceC5100j0;
import androidx.camera.core.impl.InterfaceC5102k0;
import androidx.camera.core.impl.InterfaceC5121u0;
import androidx.camera.core.impl.O0;
import androidx.camera.core.impl.T;
import androidx.camera.core.impl.W;
import androidx.camera.core.impl.b1;
import androidx.camera.core.impl.c1;
import androidx.camera.core.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes8.dex */
final class h implements w.b {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    final HashSet f23873a;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private final c1 f23877e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    private final I f23878f;

    /* renamed from: g, reason: collision with root package name */
    private final I f23879g;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    private final HashSet f23881i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    private final HashMap f23882j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    private final a f23883k;

    /* renamed from: l, reason: collision with root package name */
    private a f23884l;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    final HashMap f23874b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    private final HashMap f23875c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    final HashMap f23876d = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    private final AbstractC5111p f23880h = new g(this);

    h(@NonNull I i11, I i12, @NonNull HashSet hashSet, @NonNull c1 c1Var, @NonNull b0 b0Var) {
        this.f23878f = i11;
        this.f23879g = i12;
        this.f23877e = c1Var;
        this.f23873a = hashSet;
        HashMap hashMap = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            w wVar = (w) it.next();
            hashMap.put(wVar, wVar.A(i11.e(), null, wVar.j(true, c1Var)));
        }
        this.f23882j = hashMap;
        HashSet hashSet2 = new HashSet(hashMap.values());
        this.f23881i = hashSet2;
        this.f23883k = new a(i11, hashSet2);
        if (this.f23879g != null) {
            this.f23884l = new a(this.f23879g, hashSet2);
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            w wVar2 = (w) it2.next();
            this.f23876d.put(wVar2, Boolean.FALSE);
            this.f23875c.put(wVar2, new f(i11, this, b0Var));
        }
    }

    @NonNull
    private P.f s(@NonNull w wVar, @NonNull a aVar, @NonNull I i11, y yVar, int i12, boolean z11) {
        int g10 = i11.b().g(i12);
        Matrix o11 = yVar.o();
        RectF rectF = r.f9647a;
        float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
        o11.mapVectors(fArr);
        float f7 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = (f11 * f13) + (f7 * f12);
        float f15 = (f7 * f13) - (f11 * f12);
        double sqrt = Math.sqrt((f11 * f11) + (f7 * f7)) * Math.sqrt((f13 * f13) + (f12 * f12));
        boolean z12 = ((float) Math.toDegrees(Math.atan2(((double) f15) / sqrt, ((double) f14) / sqrt))) > 0.0f;
        b1<?> b1Var = (b1) this.f23882j.get(wVar);
        Objects.requireNonNull(b1Var);
        Rect k11 = yVar.k();
        yVar.o().getValues(new float[9]);
        Pair<Rect, Size> c11 = aVar.c(b1Var, k11, r.h((int) Math.round(Math.atan2(r6[3], r6[0]) * 57.29577951308232d)), z11);
        Rect rect = (Rect) c11.first;
        Size size = (Size) c11.second;
        int g11 = this.f23878f.b().g(((InterfaceC5102k0) wVar.i()).m());
        f fVar = (f) this.f23875c.get(wVar);
        Objects.requireNonNull(fVar);
        fVar.r(g11);
        int h11 = r.h((yVar.n() + g11) - g10);
        return P.f.h(wVar instanceof Y ? 1 : wVar instanceof C.I ? 4 : 2, wVar instanceof C.I ? 256 : 34, rect, r.g(size, h11), h11, wVar.z(i11) ^ z12);
    }

    private static void t(@NonNull y yVar, @NonNull W w11, @NonNull O0 o02) {
        yVar.s();
        try {
            yVar.v(w11);
        } catch (W.a unused) {
            if (o02.d() != null) {
                o02.d().a(o02, O0.g.SESSION_ERROR_SURFACE_NEEDS_RESET);
            }
        }
    }

    static W u(@NonNull w wVar) {
        List<W> o11 = wVar instanceof C.I ? wVar.t().o() : wVar.t().k().h();
        x2.i.f(null, o11.size() <= 1);
        if (o11.size() == 1) {
            return o11.get(0);
        }
        return null;
    }

    @NonNull
    private y y(@NonNull w wVar) {
        y yVar = (y) this.f23874b.get(wVar);
        Objects.requireNonNull(yVar);
        return yVar;
    }

    private boolean z(@NonNull w wVar) {
        Boolean bool = (Boolean) this.f23876d.get(wVar);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void A(@NonNull InterfaceC5121u0 interfaceC5121u0) {
        ArrayList b11 = this.f23883k.b(interfaceC5121u0);
        C5123v0 c5123v0 = (C5123v0) interfaceC5121u0;
        c5123v0.U(InterfaceC5102k0.f38351u, b11);
        T.a<Integer> aVar = b1.f38271z;
        HashSet hashSet = this.f23881i;
        Iterator it = hashSet.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11 = Math.max(i11, ((b1) it.next()).L());
        }
        c5123v0.U(aVar, Integer.valueOf(i11));
        ArrayList arrayList = new ArrayList();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(((b1) it2.next()).u());
        }
        A a11 = null;
        if (!arrayList.isEmpty()) {
            A a12 = (A) arrayList.get(0);
            Integer valueOf = Integer.valueOf(a12.b());
            Integer valueOf2 = Integer.valueOf(a12.a());
            int i12 = 1;
            while (true) {
                if (i12 >= arrayList.size()) {
                    a11 = new A(valueOf.intValue(), valueOf2.intValue());
                    break;
                }
                A a13 = (A) arrayList.get(i12);
                Integer valueOf3 = Integer.valueOf(a13.b());
                if (!valueOf.equals(0)) {
                    if (!valueOf3.equals(0)) {
                        if (!valueOf.equals(2) || valueOf3.equals(1)) {
                            if ((!valueOf3.equals(2) || valueOf.equals(1)) && !valueOf.equals(valueOf3)) {
                                valueOf = null;
                            }
                        }
                    }
                    Integer valueOf4 = Integer.valueOf(a13.a());
                    if (!valueOf2.equals(0)) {
                        valueOf2 = valueOf4;
                    } else if (!valueOf4.equals(0) && !valueOf2.equals(valueOf4)) {
                        valueOf2 = null;
                    }
                    if (valueOf != null || valueOf2 == null) {
                        break;
                        break;
                    }
                    i12++;
                }
                valueOf = valueOf3;
                Integer valueOf42 = Integer.valueOf(a13.a());
                if (!valueOf2.equals(0)) {
                }
                if (valueOf != null) {
                    break;
                } else {
                    i12++;
                }
            }
        }
        if (a11 == null) {
            throw new IllegalArgumentException("Failed to merge child dynamic ranges, can not find a dynamic range that satisfies all children.");
        }
        c5123v0.U(InterfaceC5100j0.f38331k, a11);
        Iterator it3 = this.f23873a.iterator();
        while (it3.hasNext()) {
            w wVar = (w) it3.next();
            if (wVar.i().o() != 0) {
                c5123v0.U(b1.f38266F, Integer.valueOf(wVar.i().o()));
            }
            if (wVar.i().p() != 0) {
                c5123v0.U(b1.f38265E, Integer.valueOf(wVar.i().p()));
            }
        }
    }

    final void B(@NonNull HashMap hashMap) {
        HashMap hashMap2 = this.f23874b;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        for (Map.Entry entry : hashMap2.entrySet()) {
            w wVar = (w) entry.getKey();
            y yVar = (y) entry.getValue();
            wVar.Q(yVar.k());
            wVar.P(yVar.o());
            wVar.T(yVar.p(), null);
            wVar.E();
        }
    }

    final void C() {
        Iterator it = this.f23873a.iterator();
        while (it.hasNext()) {
            w wVar = (w) it.next();
            f fVar = (f) this.f23875c.get(wVar);
            Objects.requireNonNull(fVar);
            wVar.R(fVar);
        }
    }

    @Override // androidx.camera.core.w.b
    public final void d(@NonNull w wVar) {
        q.a();
        if (z(wVar)) {
            y y11 = y(wVar);
            W u11 = u(wVar);
            if (u11 != null) {
                t(y11, u11, wVar.t());
            } else {
                y11.j();
            }
        }
    }

    @Override // androidx.camera.core.w.b
    public final void j(@NonNull w wVar) {
        q.a();
        if (z(wVar)) {
            return;
        }
        this.f23876d.put(wVar, Boolean.TRUE);
        W u11 = u(wVar);
        if (u11 != null) {
            t(y(wVar), u11, wVar.t());
        }
    }

    @Override // androidx.camera.core.w.b
    public final void m(@NonNull w wVar) {
        W u11;
        q.a();
        y y11 = y(wVar);
        if (z(wVar) && (u11 = u(wVar)) != null) {
            t(y11, u11, wVar.t());
        }
    }

    @Override // androidx.camera.core.w.b
    public final void q(@NonNull w wVar) {
        q.a();
        if (z(wVar)) {
            this.f23876d.put(wVar, Boolean.FALSE);
            y(wVar).j();
        }
    }

    final void r() {
        Iterator it = this.f23873a.iterator();
        while (it.hasNext()) {
            w wVar = (w) it.next();
            f fVar = (f) this.f23875c.get(wVar);
            Objects.requireNonNull(fVar);
            wVar.a(fVar, null, null, wVar.j(true, this.f23877e));
        }
    }

    @NonNull
    final HashMap v(@NonNull y yVar, int i11, boolean z11) {
        HashMap hashMap = new HashMap();
        Iterator it = this.f23873a.iterator();
        while (it.hasNext()) {
            w wVar = (w) it.next();
            y yVar2 = yVar;
            hashMap.put(wVar, s(wVar, this.f23883k, this.f23878f, yVar2, i11, z11));
            yVar = yVar2;
        }
        return hashMap;
    }

    @NonNull
    final HashMap w(@NonNull y yVar, @NonNull y yVar2, int i11, boolean z11) {
        HashMap hashMap = new HashMap();
        Iterator it = this.f23873a.iterator();
        while (it.hasNext()) {
            w wVar = (w) it.next();
            y yVar3 = yVar;
            int i12 = i11;
            P.f s11 = s(wVar, this.f23883k, this.f23878f, yVar3, i12, z11);
            I i13 = this.f23879g;
            Objects.requireNonNull(i13);
            y yVar4 = yVar2;
            hashMap.put(wVar, O.d.c(s11, s(wVar, this.f23884l, i13, yVar4, i12, z11)));
            yVar = yVar3;
            yVar2 = yVar4;
            i11 = i12;
        }
        return hashMap;
    }

    @NonNull
    final AbstractC5111p x() {
        return this.f23880h;
    }
}
