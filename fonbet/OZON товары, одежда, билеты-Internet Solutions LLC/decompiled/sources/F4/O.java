package F4;

import F4.AbstractC3028h;
import Sc.InterfaceC3999a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10737n;

@InterfaceC3999a
/* loaded from: classes8.dex */
public abstract class O<T> extends AbstractC3028h<Integer, T> {

    public static abstract class a<T> {
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f8838a;

        /* renamed from: b, reason: collision with root package name */
        public final int f8839b;

        /* renamed from: c, reason: collision with root package name */
        public final int f8840c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f8841d;

        public b(int i11, int i12, int i13, boolean z11) {
            this.f8838a = i11;
            this.f8839b = i12;
            this.f8840c = i13;
            this.f8841d = z11;
            if (!(i11 >= 0)) {
                throw new IllegalStateException(Intrinsics.l(Integer.valueOf(i11), "invalid start position: ").toString());
            }
            if (!(i12 >= 0)) {
                throw new IllegalStateException(Intrinsics.l(Integer.valueOf(i12), "invalid load size: ").toString());
            }
            if (!(i13 >= 0)) {
                throw new IllegalStateException(Intrinsics.l(Integer.valueOf(i13), "invalid page size: ").toString());
            }
        }
    }

    public static abstract class c<T> {
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f8842a;

        /* renamed from: b, reason: collision with root package name */
        public final int f8843b;

        public d(int i11, int i12) {
            this.f8842a = i11;
            this.f8843b = i12;
        }
    }

    @Override // F4.AbstractC3028h
    public final Integer b(Object item) {
        Intrinsics.checkNotNullParameter(item, "item");
        throw new IllegalStateException("Cannot get key by item in positionalDataSource");
    }

    @Override // F4.AbstractC3028h
    public final Object f(@NotNull AbstractC3028h.e<Integer> eVar, @NotNull kotlin.coroutines.d<? super AbstractC3028h.a<T>> frame) {
        if (eVar.e() != y.REFRESH) {
            Integer b11 = eVar.b();
            Intrinsics.f(b11);
            int intValue = b11.intValue();
            int c11 = eVar.c();
            if (eVar.e() == y.PREPEND) {
                c11 = Math.min(c11, intValue);
                intValue -= c11;
            }
            d dVar = new d(intValue, c11);
            C10737n c10737n = new C10737n(1, Wc.b.b(frame));
            c10737n.o();
            i(dVar, new Q(dVar, this, c10737n));
            Object n11 = c10737n.n();
            if (n11 == Wc.a.COROUTINE_SUSPENDED) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            return n11;
        }
        int a11 = eVar.a();
        int i11 = 0;
        if (eVar.b() != null) {
            int intValue2 = eVar.b().intValue();
            if (eVar.d()) {
                a11 = Math.max(a11 / eVar.c(), 2) * eVar.c();
                i11 = Math.max(0, eVar.c() * ((intValue2 - (a11 / 2)) / eVar.c()));
            } else {
                i11 = Math.max(0, intValue2 - (a11 / 2));
            }
        }
        b bVar = new b(i11, a11, eVar.c(), eVar.d());
        C10737n c10737n2 = new C10737n(1, Wc.b.b(frame));
        c10737n2.o();
        h(bVar, new P(this, c10737n2, bVar));
        Object n12 = c10737n2.n();
        if (n12 == Wc.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return n12;
    }

    public abstract void h(@NotNull b bVar, @NotNull P p11);

    public abstract void i(@NotNull d dVar, @NotNull Q q11);
}
