package K1;

import K1.C3422b;
import P1.AbstractC3809p;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* renamed from: K1.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3434n implements InterfaceC3438s {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3422b f15073a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<C3422b.C0288b<C3442w>> f15074b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f15075c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Object f15076d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ArrayList f15077e;

    /* renamed from: K1.n$a */
    static final class a extends AbstractC7737t implements Function0<Float> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            Object obj;
            ArrayList arrayList = (ArrayList) C3434n.this.e();
            if (arrayList.isEmpty()) {
                obj = null;
            } else {
                Object obj2 = arrayList.get(0);
                float c11 = ((S1.d) ((r) obj2).b()).c();
                int P11 = C7714v.P(arrayList);
                int i11 = 1;
                if (1 <= P11) {
                    while (true) {
                        Object obj3 = arrayList.get(i11);
                        float c12 = ((S1.d) ((r) obj3).b()).c();
                        if (Float.compare(c11, c12) < 0) {
                            obj2 = obj3;
                            c11 = c12;
                        }
                        if (i11 == P11) {
                            break;
                        }
                        i11++;
                    }
                }
                obj = obj2;
            }
            r rVar = (r) obj;
            return Float.valueOf(rVar != null ? ((S1.d) rVar.b()).c() : 0.0f);
        }
    }

    /* renamed from: K1.n$b */
    static final class b extends AbstractC7737t implements Function0<Float> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            Object obj;
            ArrayList arrayList = (ArrayList) C3434n.this.e();
            if (arrayList.isEmpty()) {
                obj = null;
            } else {
                Object obj2 = arrayList.get(0);
                float b11 = ((S1.d) ((r) obj2).b()).b();
                int P11 = C7714v.P(arrayList);
                int i11 = 1;
                if (1 <= P11) {
                    while (true) {
                        Object obj3 = arrayList.get(i11);
                        float b12 = ((S1.d) ((r) obj3).b()).b();
                        if (Float.compare(b11, b12) < 0) {
                            obj2 = obj3;
                            b11 = b12;
                        }
                        if (i11 == P11) {
                            break;
                        }
                        i11++;
                    }
                }
                obj = obj2;
            }
            r rVar = (r) obj;
            return Float.valueOf(rVar != null ? ((S1.d) rVar.b()).b() : 0.0f);
        }
    }

    public C3434n(@NotNull C3422b c3422b, @NotNull T t2, @NotNull List<C3422b.C0288b<C3442w>> list, @NotNull Z1.d dVar, @NotNull AbstractC3809p.a aVar) {
        C3422b c3422b2 = c3422b;
        this.f15073a = c3422b2;
        this.f15074b = list;
        Sc.n nVar = Sc.n.NONE;
        this.f15075c = Sc.k.a(nVar, new b());
        this.f15076d = Sc.k.a(nVar, new a());
        C3440u G11 = t2.G();
        int i11 = C3424d.f15046b;
        int length = c3422b2.h().length();
        List<C3422b.C0288b<C3440u>> d11 = c3422b2.d();
        d11 = d11 == null ? kotlin.collections.K.f71697a : d11;
        ArrayList arrayList = new ArrayList();
        int size = d11.size();
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            C3422b.C0288b<C3440u> c0288b = d11.get(i12);
            C3440u a11 = c0288b.a();
            int b11 = c0288b.b();
            int c11 = c0288b.c();
            if (b11 != i13) {
                arrayList.add(new C3422b.C0288b(i13, b11, G11));
            }
            arrayList.add(new C3422b.C0288b(b11, c11, G11.k(a11)));
            i12++;
            i13 = c11;
        }
        if (i13 != length) {
            arrayList.add(new C3422b.C0288b(i13, length, G11));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new C3422b.C0288b(0, 0, G11));
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        int i14 = 0;
        while (i14 < size2) {
            C3422b.C0288b c0288b2 = (C3422b.C0288b) arrayList.get(i14);
            C3422b c12 = C3424d.c(c3422b2, c0288b2.g(), c0288b2.e());
            C3440u c3440u = (C3440u) c0288b2.f();
            c3440u = c3440u.h() == Integer.MIN_VALUE ? C3440u.a(c3440u, G11.h()) : c3440u;
            String h11 = c12.h();
            T D11 = t2.D(c3440u);
            List<C3422b.C0288b<D>> e11 = c12.e();
            List<C3422b.C0288b<C3442w>> list2 = this.f15074b;
            int g10 = c0288b2.g();
            int e12 = c0288b2.e();
            C3440u c3440u2 = G11;
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size3 = list2.size();
            int i15 = size2;
            int i16 = 0;
            while (i16 < size3) {
                int i17 = size3;
                C3422b.C0288b<C3442w> c0288b3 = list2.get(i16);
                C3422b.C0288b<C3442w> c0288b4 = c0288b3;
                int i18 = i16;
                ArrayList arrayList4 = arrayList;
                if (C3424d.f(g10, e12, c0288b4.g(), c0288b4.e())) {
                    arrayList3.add(c0288b3);
                }
                i16 = i18 + 1;
                size3 = i17;
                arrayList = arrayList4;
            }
            ArrayList arrayList5 = arrayList;
            ArrayList arrayList6 = new ArrayList(arrayList3.size());
            int i19 = 0;
            for (int size4 = arrayList3.size(); i19 < size4; size4 = size4) {
                C3422b.C0288b c0288b5 = (C3422b.C0288b) arrayList3.get(i19);
                ArrayList arrayList7 = arrayList3;
                if (g10 > c0288b5.g() || c0288b5.e() > e12) {
                    throw new IllegalArgumentException("placeholder can not overlap with paragraph.");
                }
                arrayList6.add(new C3422b.C0288b(c0288b5.g() - g10, c0288b5.e() - g10, c0288b5.f()));
                i19++;
                arrayList3 = arrayList7;
            }
            arrayList2.add(new r(new S1.d(h11, D11, e11, arrayList6, aVar, dVar), c0288b2.g(), c0288b2.e()));
            i14++;
            c3422b2 = c3422b;
            G11 = c3440u2;
            size2 = i15;
            arrayList = arrayList5;
        }
        this.f15077e = arrayList2;
    }

    @Override // K1.InterfaceC3438s
    public final boolean a() {
        ArrayList arrayList = this.f15077e;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (((S1.d) ((r) arrayList.get(i11)).b()).a()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // K1.InterfaceC3438s
    public final float b() {
        return ((Number) this.f15075c.getValue()).floatValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // K1.InterfaceC3438s
    public final float c() {
        return ((Number) this.f15076d.getValue()).floatValue();
    }

    @NotNull
    public final C3422b d() {
        return this.f15073a;
    }

    @NotNull
    public final List<r> e() {
        return this.f15077e;
    }

    @NotNull
    public final List<C3422b.C0288b<C3442w>> f() {
        return this.f15074b;
    }
}
