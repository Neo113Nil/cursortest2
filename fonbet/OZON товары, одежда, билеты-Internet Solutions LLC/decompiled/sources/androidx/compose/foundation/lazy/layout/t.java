package androidx.compose.foundation.lazy.layout;

import B1.y0;
import androidx.collection.K;
import androidx.compose.foundation.lazy.layout.o;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import org.jetbrains.annotations.NotNull;
import x0.InterfaceC10620y;
import x0.RunnableC10596a;
import x0.d0;
import x0.e0;
import x0.f0;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final f f39684a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final y0 f39685b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final f0 f39686c;

    /* JADX INFO: Access modifiers changed from: private */
    final class a implements o.b, e0 {

        /* renamed from: a, reason: collision with root package name */
        private final int f39687a;

        /* renamed from: b, reason: collision with root package name */
        private final long f39688b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final d0 f39689c;

        /* renamed from: d, reason: collision with root package name */
        private y0.a f39690d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f39691e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f39692f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f39693g;

        /* renamed from: h, reason: collision with root package name */
        private C0733a f39694h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f39695i;

        /* renamed from: androidx.compose.foundation.lazy.layout.t$a$a, reason: collision with other inner class name */
        private final class C0733a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final List<o> f39697a;

            /* renamed from: b, reason: collision with root package name */
            @NotNull
            private final List<e0>[] f39698b;

            /* renamed from: c, reason: collision with root package name */
            private int f39699c;

            /* renamed from: d, reason: collision with root package name */
            private int f39700d;

            public C0733a(@NotNull List<o> list) {
                this.f39697a = list;
                this.f39698b = new List[list.size()];
                if (list.isEmpty()) {
                    throw new IllegalArgumentException("NestedPrefetchController shouldn't be created with no states");
                }
            }

            public final boolean a(@NotNull RunnableC10596a.C2268a c2268a) {
                int i11 = this.f39699c;
                List<o> list = this.f39697a;
                if (i11 >= list.size()) {
                    return false;
                }
                if (a.this.f39692f) {
                    throw new IllegalStateException("Should not execute nested prefetch on canceled request");
                }
                while (this.f39699c < list.size()) {
                    int i12 = this.f39699c;
                    List<e0>[] listArr = this.f39698b;
                    if (listArr[i12] == null) {
                        if (c2268a.a() <= 0) {
                            return true;
                        }
                        int i13 = this.f39699c;
                        listArr[i13] = list.get(i13).b();
                    }
                    List<e0> list2 = listArr[this.f39699c];
                    Intrinsics.f(list2);
                    while (this.f39700d < list2.size()) {
                        if (list2.get(this.f39700d).b(c2268a)) {
                            return true;
                        }
                        this.f39700d++;
                    }
                    this.f39700d = 0;
                    this.f39699c++;
                }
                Unit unit = Unit.f71690a;
                return false;
            }
        }

        public a(int i11, long j11, d0 d0Var) {
            this.f39687a = i11;
            this.f39688b = j11;
            this.f39689c = d0Var;
        }

        private final boolean d() {
            if (this.f39692f) {
                return false;
            }
            int itemCount = t.this.f39684a.d().invoke().getItemCount();
            int i11 = this.f39687a;
            return i11 >= 0 && i11 < itemCount;
        }

        @Override // androidx.compose.foundation.lazy.layout.o.b
        public final void a() {
            this.f39695i = true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:56:0x0114, code lost:
        
            if ((r1 != null ? r1.a(r14) : false) != false) goto L104;
         */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0157  */
        @Override // x0.e0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean b(@NotNull RunnableC10596a.C2268a c2268a) {
            long f7;
            long a11;
            if (d()) {
                t tVar = t.this;
                InterfaceC10620y invoke = tVar.f39684a.d().invoke();
                int i11 = this.f39687a;
                Object c11 = invoke.c(i11);
                boolean z11 = this.f39690d != null;
                d0 d0Var = this.f39689c;
                if (!z11) {
                    long d11 = (c11 == null || d0Var.e().a(c11) < 0) ? d0Var.d() : d0Var.e().b(c11);
                    long a12 = c2268a.a();
                    if ((!this.f39695i || a12 <= 0) && d11 >= a12) {
                        return true;
                    }
                    long nanoTime = System.nanoTime();
                    if (!d()) {
                        throw new IllegalArgumentException("Callers should check whether the request is still valid before calling performComposition()");
                    }
                    if (this.f39690d != null) {
                        throw new IllegalArgumentException("Request was already composed!");
                    }
                    InterfaceC10620y invoke2 = tVar.f39684a.d().invoke();
                    Object d12 = invoke2.d(i11);
                    this.f39690d = tVar.f39685b.h(d12, tVar.f39684a.b(i11, d12, invoke2.c(i11)));
                    Unit unit = Unit.f71690a;
                    long nanoTime2 = System.nanoTime() - nanoTime;
                    if (c11 != null) {
                        K<Object> e11 = d0Var.e();
                        int a13 = e11.a(c11);
                        d0Var.e().e(d0.a(d0Var, nanoTime2, a13 >= 0 ? e11.f38652c[a13] : 0L), c11);
                    }
                    d0Var.f104734c = d0.a(d0Var, nanoTime2, d0Var.d());
                }
                if (!this.f39695i) {
                    if (!this.f39693g) {
                        if (c2268a.a() > 0) {
                            y0.a aVar = this.f39690d;
                            if (aVar == null) {
                                throw new IllegalArgumentException("Should precompose before resolving nested prefetch states");
                            }
                            M m11 = new M();
                            aVar.c(new u(m11));
                            List list = (List) m11.f71787a;
                            this.f39694h = list != null ? new C0733a(list) : null;
                            this.f39693g = true;
                            Unit unit2 = Unit.f71690a;
                        }
                        return true;
                    }
                    C0733a c0733a = this.f39694h;
                }
                if (!this.f39691e) {
                    long j11 = this.f39688b;
                    if (!Z1.b.n(j11)) {
                        if (c11 != null) {
                            if (d0Var.g().a(c11) >= 0) {
                                f7 = d0Var.g().b(c11);
                                a11 = c2268a.a();
                                if ((!this.f39695i && a11 > 0) || f7 < a11) {
                                    long nanoTime3 = System.nanoTime();
                                    if (this.f39692f) {
                                        throw new IllegalArgumentException("Callers should check whether the request is still valid before calling performMeasure()");
                                    }
                                    if (this.f39691e) {
                                        throw new IllegalArgumentException("Request was already measured!");
                                    }
                                    this.f39691e = true;
                                    y0.a aVar2 = this.f39690d;
                                    if (aVar2 == null) {
                                        throw new IllegalArgumentException("performComposition() must be called before performMeasure()");
                                    }
                                    int b11 = aVar2.b();
                                    for (int i12 = 0; i12 < b11; i12++) {
                                        aVar2.d(i12, j11);
                                    }
                                    Unit unit3 = Unit.f71690a;
                                    long nanoTime4 = System.nanoTime() - nanoTime3;
                                    if (c11 != null) {
                                        K<Object> g10 = d0Var.g();
                                        int a14 = g10.a(c11);
                                        d0Var.g().e(d0.a(d0Var, nanoTime4, a14 >= 0 ? g10.f38652c[a14] : 0L), c11);
                                    }
                                    d0Var.f104735d = d0.a(d0Var, nanoTime4, d0Var.f());
                                    return false;
                                }
                                return true;
                            }
                        }
                        f7 = d0Var.f();
                        a11 = c2268a.a();
                        if ((!this.f39695i && a11 > 0) || f7 < a11) {
                        }
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // androidx.compose.foundation.lazy.layout.o.b
        public final void cancel() {
            if (this.f39692f) {
                return;
            }
            this.f39692f = true;
            y0.a aVar = this.f39690d;
            if (aVar != null) {
                aVar.dispose();
            }
            this.f39690d = null;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HandleAndRequestImpl { index = ");
            sb2.append(this.f39687a);
            sb2.append(", constraints = ");
            sb2.append((Object) Z1.b.o(this.f39688b));
            sb2.append(", isComposed = ");
            sb2.append(this.f39690d != null);
            sb2.append(", isMeasured = ");
            sb2.append(this.f39691e);
            sb2.append(", isCanceled = ");
            return Pk0.a.a(" }", sb2, this.f39692f);
        }
    }

    public t(@NotNull f fVar, @NotNull y0 y0Var, @NotNull f0 f0Var) {
        this.f39684a = fVar;
        this.f39685b = y0Var;
        this.f39686c = f0Var;
    }

    @NotNull
    public final o.b c(int i11, long j11, @NotNull d0 d0Var) {
        a aVar = new a(i11, j11, d0Var);
        this.f39686c.a(aVar);
        return aVar;
    }
}
