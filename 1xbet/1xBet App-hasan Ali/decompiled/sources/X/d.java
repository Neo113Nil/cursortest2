package X;

import O3.p;
import P.C0315s;
import P.C0326x0;
import P.C0327y;
import java.util.ArrayList;
import kotlin.jvm.internal.z;

/* loaded from: classes.dex */
public final class d implements b {

    /* renamed from: k, reason: collision with root package name */
    public final int f6049k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f6050l;

    /* renamed from: m, reason: collision with root package name */
    public Object f6051m;

    /* renamed from: n, reason: collision with root package name */
    public C0326x0 f6052n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f6053o;

    public d(int i, Object obj, boolean z3) {
        this.f6049k = i;
        this.f6050l = z3;
        this.f6051m = obj;
    }

    public final Object a(int i, C0315s c0315s) {
        c0315s.Z(this.f6049k);
        g(c0315s);
        int a5 = i | (c0315s.f(this) ? e.a(2, 0) : e.a(1, 0));
        Object obj = this.f6051m;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>", obj);
        z.b(2, obj);
        Object invoke = ((i4.e) obj).invoke(c0315s, Integer.valueOf(a5));
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new c(2, 8, d.class, this, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;");
        }
        return invoke;
    }

    @Override // i4.f
    public final /* bridge */ /* synthetic */ Object b(Object obj, Object obj2, Object obj3) {
        return d(obj, (C0315s) obj2, ((Number) obj3).intValue());
    }

    public final Object d(Object obj, C0315s c0315s, int i) {
        c0315s.Z(this.f6049k);
        g(c0315s);
        int a5 = c0315s.f(this) ? e.a(2, 1) : e.a(1, 1);
        Object obj2 = this.f6051m;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>", obj2);
        z.b(3, obj2);
        Object b3 = ((i4.f) obj2).b(obj, c0315s, Integer.valueOf(a5 | i));
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new p(i, 4, this, obj);
        }
        return b3;
    }

    @Override // i4.g
    public final /* bridge */ /* synthetic */ Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        return f(obj, obj2, (C0315s) obj3, ((Number) obj4).intValue());
    }

    public final Object f(Object obj, Object obj2, C0315s c0315s, int i) {
        c0315s.Z(this.f6049k);
        g(c0315s);
        int a5 = c0315s.f(this) ? e.a(2, 2) : e.a(1, 2);
        Object obj3 = this.f6051m;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>", obj3);
        z.b(4, obj3);
        Object e3 = ((i4.g) obj3).e(obj, obj2, c0315s, Integer.valueOf(a5 | i));
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new B1.c(this, obj, obj2, i, 3);
        }
        return e3;
    }

    public final void g(C0315s c0315s) {
        C0326x0 y5;
        if (!this.f6050l || (y5 = c0315s.y()) == null) {
            return;
        }
        c0315s.getClass();
        y5.f4576b |= 1;
        if (e.e(this.f6052n, y5)) {
            this.f6052n = y5;
            return;
        }
        ArrayList arrayList = this.f6053o;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.f6053o = arrayList2;
            arrayList2.add(y5);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (e.e((C0326x0) arrayList.get(i), y5)) {
                arrayList.set(i, y5);
                return;
            }
        }
        arrayList.add(y5);
    }

    public final void h(W3.c cVar) {
        if (kotlin.jvm.internal.l.a(this.f6051m, cVar)) {
            return;
        }
        boolean z3 = this.f6051m == null;
        this.f6051m = cVar;
        if (z3 || !this.f6050l) {
            return;
        }
        C0326x0 c0326x0 = this.f6052n;
        if (c0326x0 != null) {
            C0327y c0327y = c0326x0.f4575a;
            if (c0327y != null) {
                c0327y.r(c0326x0, null);
            }
            this.f6052n = null;
        }
        ArrayList arrayList = this.f6053o;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C0326x0 c0326x02 = (C0326x0) arrayList.get(i);
                C0327y c0327y2 = c0326x02.f4575a;
                if (c0327y2 != null) {
                    c0327y2.r(c0326x02, null);
                }
            }
            arrayList.clear();
        }
    }

    @Override // i4.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return a(((Number) obj2).intValue(), (C0315s) obj);
    }
}
