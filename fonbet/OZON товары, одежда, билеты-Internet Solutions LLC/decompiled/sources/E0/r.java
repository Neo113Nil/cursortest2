package E0;

import B0.C2454a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private U0.b<a> f7286a = new U0.b<>(new a[16]);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private U0.b<a> f7287b = new U0.b<>(new a[16]);

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private int f7288a;

        /* renamed from: b, reason: collision with root package name */
        private int f7289b;

        /* renamed from: c, reason: collision with root package name */
        private int f7290c;

        /* renamed from: d, reason: collision with root package name */
        private int f7291d;

        public a(int i11, int i12, int i13, int i14) {
            this.f7288a = i11;
            this.f7289b = i12;
            this.f7290c = i13;
            this.f7291d = i14;
        }

        public final int a() {
            return this.f7291d;
        }

        public final int b() {
            return this.f7290c;
        }

        public final int c() {
            return this.f7289b;
        }

        public final int d() {
            return this.f7288a;
        }

        public final void e(int i11) {
            this.f7291d = i11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f7288a == aVar.f7288a && this.f7289b == aVar.f7289b && this.f7290c == aVar.f7290c && this.f7291d == aVar.f7291d;
        }

        public final void f(int i11) {
            this.f7290c = i11;
        }

        public final void g(int i11) {
            this.f7289b = i11;
        }

        public final void h(int i11) {
            this.f7288a = i11;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f7291d) + C2454a.a(this.f7290c, C2454a.a(this.f7289b, Integer.hashCode(this.f7288a) * 31, 31), 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Change(preStart=");
            sb2.append(this.f7288a);
            sb2.append(", preEnd=");
            sb2.append(this.f7289b);
            sb2.append(", originalStart=");
            sb2.append(this.f7290c);
            sb2.append(", originalEnd=");
            return Ek.a.d(sb2, this.f7291d, ')');
        }
    }

    public r(r rVar) {
        U0.b<a> bVar;
        int m11;
        if (rVar == null || (bVar = rVar.f7286a) == null || (m11 = bVar.m()) <= 0) {
            return;
        }
        a[] l11 = bVar.l();
        int i11 = 0;
        do {
            a aVar = l11[i11];
            this.f7286a.b(new a(aVar.d(), aVar.c(), aVar.b(), aVar.a()));
            i11++;
        } while (i11 < m11);
    }

    private final void a(a aVar, int i11, int i12, int i13) {
        int c11;
        if (this.f7287b.o()) {
            c11 = 0;
        } else {
            a q11 = this.f7287b.q();
            c11 = q11.c() - q11.a();
        }
        if (aVar == null) {
            int i14 = i11 - c11;
            aVar = new a(i11, i12 + i13, i14, (i12 - i11) + i14);
        } else {
            if (aVar.d() > i11) {
                aVar.h(i11);
                aVar.f(i11);
            }
            if (i12 > aVar.c()) {
                int c12 = aVar.c() - aVar.a();
                aVar.g(i12);
                aVar.e(i12 - c12);
            }
            aVar.g(aVar.c() + i13);
        }
        this.f7287b.b(aVar);
    }

    public final void b() {
        this.f7286a.h();
    }

    public final int c() {
        return this.f7286a.m();
    }

    public final long d() {
        a aVar = this.f7286a.l()[0];
        return K1.S.a(aVar.b(), aVar.a());
    }

    public final long e() {
        a aVar = this.f7286a.l()[0];
        return K1.S.a(aVar.d(), aVar.c());
    }

    public final void f(int i11, int i12, int i13) {
        int c11;
        if (i11 == i12 && i13 == 0) {
            return;
        }
        int min = Math.min(i11, i12);
        int max = Math.max(i11, i12);
        int i14 = i13 - (max - min);
        a aVar = null;
        boolean z11 = false;
        for (int i15 = 0; i15 < this.f7286a.m(); i15++) {
            a aVar2 = this.f7286a.l()[i15];
            int d11 = aVar2.d();
            if ((min > d11 || d11 > max) && (min > (c11 = aVar2.c()) || c11 > max)) {
                if (aVar2.d() > max && !z11) {
                    a(aVar, min, max, i14);
                    z11 = true;
                }
                if (z11) {
                    aVar2.h(aVar2.d() + i14);
                    aVar2.g(aVar2.c() + i14);
                }
                this.f7287b.b(aVar2);
            } else if (aVar == null) {
                aVar = aVar2;
            } else {
                aVar.g(aVar2.c());
                aVar.e(aVar2.a());
            }
        }
        if (!z11) {
            a(aVar, min, max, i14);
        }
        U0.b<a> bVar = this.f7286a;
        this.f7286a = this.f7287b;
        this.f7287b = bVar;
        bVar.h();
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChangeList(changes=[");
        U0.b<a> bVar = this.f7286a;
        int m11 = bVar.m();
        if (m11 > 0) {
            a[] l11 = bVar.l();
            int i11 = 0;
            do {
                a aVar = l11[i11];
                sb2.append("(" + aVar.b() + ',' + aVar.a() + ")->(" + aVar.d() + ',' + aVar.c() + ')');
                if (i11 < this.f7286a.m() - 1) {
                    sb2.append(", ");
                }
                i11++;
            } while (i11 < m11);
        }
        return C2942q.c(sb2, "])", "StringBuilder().apply(builderAction).toString()");
    }
}
