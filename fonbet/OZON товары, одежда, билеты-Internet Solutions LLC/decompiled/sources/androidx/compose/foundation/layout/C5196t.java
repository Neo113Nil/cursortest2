package androidx.compose.foundation.layout;

import B1.m0;
import androidx.collection.C5141j;
import androidx.compose.foundation.layout.C;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.compose.foundation.layout.t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5196t {

    /* renamed from: a, reason: collision with root package name */
    private final int f39546a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final D f39547b;

    /* renamed from: c, reason: collision with root package name */
    private final long f39548c;

    /* renamed from: d, reason: collision with root package name */
    private final int f39549d;

    /* renamed from: e, reason: collision with root package name */
    private final int f39550e;

    /* renamed from: androidx.compose.foundation.layout.t$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final B1.U f39551a;

        /* renamed from: b, reason: collision with root package name */
        private final m0 f39552b;

        /* renamed from: c, reason: collision with root package name */
        private final long f39553c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f39554d = true;

        public a(B1.U u11, m0 m0Var, long j11) {
            this.f39551a = u11;
            this.f39552b = m0Var;
            this.f39553c = j11;
        }

        @NotNull
        public final B1.U a() {
            return this.f39551a;
        }

        public final long b() {
            return this.f39553c;
        }

        public final boolean c() {
            return this.f39554d;
        }

        public final m0 d() {
            return this.f39552b;
        }

        public final void e(boolean z11) {
            this.f39554d = z11;
        }
    }

    /* renamed from: androidx.compose.foundation.layout.t$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f39555a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f39556b;

        public b(boolean z11, boolean z12) {
            this.f39555a = z11;
            this.f39556b = z12;
        }

        public final boolean a() {
            return this.f39556b;
        }

        public final boolean b() {
            return this.f39555a;
        }
    }

    public C5196t(int i11, D d11, long j11, int i12, int i13) {
        this.f39546a = i11;
        this.f39547b = d11;
        this.f39548c = j11;
        this.f39549d = i12;
        this.f39550e = i13;
    }

    public final a a(@NotNull b bVar, boolean z11, int i11, int i12, int i13, int i14) {
        a e11;
        if (!bVar.a() || (e11 = this.f39547b.e(i11, i12, z11)) == null) {
            return null;
        }
        e11.e(i11 >= 0 && (i14 == 0 || (i13 - ((int) (e11.b() >> 32)) >= 0 && i14 < this.f39546a)));
        return e11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x005f, code lost:
    
        if ((((int) (r25 >> 32)) - ((int) (r20 >> 32))) < 0) goto L23;
     */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b b(boolean z11, int i11, long j11, C5141j c5141j, int i12, int i13, int i14, boolean z12, boolean z13) {
        long j12;
        long j13;
        int i15 = i13 + i14;
        if (c5141j == null) {
            return new b(true, true);
        }
        D d11 = this.f39547b;
        C.a g10 = d11.g();
        C.a aVar = C.a.Visible;
        long j14 = c5141j.f38713a;
        if (g10 != aVar && (i12 >= Integer.MAX_VALUE || ((int) (j11 & 4294967295L)) - ((int) (j14 & 4294967295L)) < 0)) {
            return new b(true, true);
        }
        int i16 = this.f39549d;
        int i17 = this.f39550e;
        long j15 = this.f39548c;
        int i18 = this.f39546a;
        if (i11 != 0) {
            if (i11 >= i18) {
                j12 = 4294967295L;
                j13 = j14;
            } else {
                j12 = 4294967295L;
                j13 = j14;
            }
            return z12 ? new b(true, true) : new b(true, b(z11, 0, C5141j.b(Z1.b.k(j15), (((int) (j11 & j12)) - i17) - i14), C5141j.a(C5141j.b(((int) (j13 >> 32)) - i16, (int) (j13 & j12))), i12 + 1, i15, 0, true, false).a());
        }
        j12 = 4294967295L;
        j13 = j14;
        int i19 = (int) (j13 & j12);
        int max = Math.max(i14, i19) + i13;
        C5141j f7 = z13 ? null : d11.f(i12, max, z11);
        if (f7 == null || (i11 + 1 < i18 && ((((int) (j11 >> 32)) - ((int) (j13 >> 32))) - i16) - ((int) (f7.f38713a >> 32)) >= 0)) {
            return new b(false, false);
        }
        if (z13) {
            return new b(true, true);
        }
        b b11 = b(false, 0, C5141j.b(Z1.b.k(j15), (((int) (j11 & j12)) - i17) - Math.max(i14, i19)), f7, i12 + 1, max, 0, true, true);
        return new b(b11.a(), b11.a());
    }
}
