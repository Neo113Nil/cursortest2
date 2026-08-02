package B1;

import B1.L;
import D1.H;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class N extends H.e {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ L f2070b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function2<z0, Z1.b, W> f2071c;

    /* loaded from: classes8.dex */
    public static final class a implements W {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ W f2072a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ L f2073b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f2074c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ W f2075d;

        public a(W w11, L l11, int i11, W w12) {
            this.f2073b = l11;
            this.f2074c = i11;
            this.f2075d = w12;
            this.f2072a = w11;
        }

        @Override // B1.W
        public final int getHeight() {
            return this.f2072a.getHeight();
        }

        @Override // B1.W
        public final int getWidth() {
            return this.f2072a.getWidth();
        }

        @Override // B1.W
        @NotNull
        public final Map<AbstractC2531a, Integer> s() {
            return this.f2072a.s();
        }

        @Override // B1.W
        public final Function1<Object, Unit> t() {
            return this.f2072a.t();
        }

        @Override // B1.W
        public final void u() {
            L l11 = this.f2073b;
            l11.f2038e = this.f2074c;
            this.f2075d.u();
            L.b(l11);
        }
    }

    public static final class b implements W {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ W f2076a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ L f2077b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f2078c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ W f2079d;

        public b(W w11, L l11, int i11, W w12) {
            this.f2077b = l11;
            this.f2078c = i11;
            this.f2079d = w12;
            this.f2076a = w11;
        }

        @Override // B1.W
        public final int getHeight() {
            return this.f2076a.getHeight();
        }

        @Override // B1.W
        public final int getWidth() {
            return this.f2076a.getWidth();
        }

        @Override // B1.W
        @NotNull
        public final Map<AbstractC2531a, Integer> s() {
            return this.f2076a.s();
        }

        @Override // B1.W
        public final Function1<Object, Unit> t() {
            return this.f2076a.t();
        }

        @Override // B1.W
        public final void u() {
            int i11;
            int i12 = this.f2078c;
            L l11 = this.f2077b;
            l11.f2037d = i12;
            this.f2079d.u();
            i11 = l11.f2037d;
            l11.u(i11);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    N(L l11, Function2<? super z0, ? super Z1.b, ? extends W> function2, String str) {
        super(str);
        this.f2070b = l11;
        this.f2071c = function2;
    }

    @Override // B1.V
    @NotNull
    /* renamed from: measure-3p2s80s */
    public final W mo2measure3p2s80s(@NotNull Y y11, @NotNull List<? extends U> list, long j11) {
        int i11;
        L.b bVar;
        int i12;
        L l11 = this.f2070b;
        l11.f2041h.t(y11.getLayoutDirection());
        l11.f2041h.m(y11.g());
        l11.f2041h.s(y11.u1());
        boolean R02 = y11.R0();
        Function2<z0, Z1.b, W> function2 = this.f2071c;
        if (R02 || l11.f2034a.U() == null) {
            l11.f2037d = 0;
            W invoke = function2.invoke(l11.f2041h, Z1.b.a(j11));
            i11 = l11.f2037d;
            return new b(invoke, l11, i11, invoke);
        }
        l11.f2038e = 0;
        bVar = l11.f2042i;
        W invoke2 = function2.invoke(bVar, Z1.b.a(j11));
        i12 = l11.f2038e;
        return new a(invoke2, l11, i12, invoke2);
    }
}
