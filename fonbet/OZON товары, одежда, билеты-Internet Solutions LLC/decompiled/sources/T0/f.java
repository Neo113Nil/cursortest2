package T0;

import S0.B0;
import S0.C3953e1;
import S0.InterfaceC3951e;
import S0.U0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import ed.InterfaceC6346b;
import java.util.Arrays;
import java.util.NoSuchElementException;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class f extends g {

    /* renamed from: d, reason: collision with root package name */
    private int f26412d;

    /* renamed from: f, reason: collision with root package name */
    private int f26414f;

    /* renamed from: h, reason: collision with root package name */
    private int f26416h;

    /* renamed from: i, reason: collision with root package name */
    private int f26417i;

    /* renamed from: j, reason: collision with root package name */
    private int f26418j;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private d[] f26411c = new d[16];

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private int[] f26413e = new int[16];

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private Object[] f26415g = new Object[16];

    public final class a {

        /* renamed from: a, reason: collision with root package name */
        private int f26419a;

        /* renamed from: b, reason: collision with root package name */
        private int f26420b;

        /* renamed from: c, reason: collision with root package name */
        private int f26421c;

        public a() {
        }

        public final int a(int i11) {
            return f.this.f26413e[this.f26420b + i11];
        }

        public final <T> T b(int i11) {
            return (T) f.this.f26415g[this.f26421c + i11];
        }

        @NotNull
        public final d c() {
            d dVar = f.this.f26411c[this.f26419a];
            Intrinsics.f(dVar);
            return dVar;
        }

        public final boolean d() {
            int i11 = this.f26419a;
            f fVar = f.this;
            if (i11 >= fVar.f26412d) {
                return false;
            }
            d c11 = c();
            this.f26420b = c11.b() + this.f26420b;
            this.f26421c = c11.c() + this.f26421c;
            int i12 = this.f26419a + 1;
            this.f26419a = i12;
            return i12 < fVar.f26412d;
        }
    }

    @InterfaceC6346b
    public static final class b {
        public static final void a(f fVar, int i11, int i12) {
            int i13 = 1 << i11;
            if ((fVar.f26417i & i13) == 0) {
                fVar.f26417i = i13 | fVar.f26417i;
                fVar.f26413e[f.k(fVar, i11)] = i12;
            } else {
                B0.b("Already pushed argument " + f.h(fVar).d(i11));
                throw null;
            }
        }

        public static final <T> void b(f fVar, int i11, T t2) {
            int i12 = 1 << i11;
            if ((fVar.f26418j & i12) == 0) {
                fVar.f26418j = i12 | fVar.f26418j;
                fVar.f26415g[f.l(fVar, i11)] = t2;
            } else {
                B0.b("Already pushed argument " + f.h(fVar).e(i11));
                throw null;
            }
        }
    }

    public static final int a(f fVar, int i11) {
        fVar.getClass();
        if (i11 == 0) {
            return 0;
        }
        return (-1) >>> (32 - i11);
    }

    public static final d h(f fVar) {
        d dVar = fVar.f26411c[fVar.f26412d - 1];
        Intrinsics.f(dVar);
        return dVar;
    }

    public static final int k(f fVar, int i11) {
        int i12 = fVar.f26414f;
        d dVar = fVar.f26411c[fVar.f26412d - 1];
        Intrinsics.f(dVar);
        return (i12 - dVar.b()) + i11;
    }

    public static final int l(f fVar, int i11) {
        int i12 = fVar.f26416h;
        d dVar = fVar.f26411c[fVar.f26412d - 1];
        Intrinsics.f(dVar);
        return (i12 - dVar.c()) + i11;
    }

    public final void m() {
        this.f26412d = 0;
        this.f26414f = 0;
        C7705l.x(this.f26415g, null, 0, this.f26416h);
        this.f26416h = 0;
    }

    public final void n(@NotNull InterfaceC3951e<?> interfaceC3951e, @NotNull C3953e1 c3953e1, @NotNull U0 u02) {
        if (p()) {
            a aVar = new a();
            do {
                aVar.c().a(aVar, interfaceC3951e, c3953e1, u02);
            } while (aVar.d());
        }
        m();
    }

    public final boolean o() {
        return this.f26412d == 0;
    }

    public final boolean p() {
        return this.f26412d != 0;
    }

    public final void q(@NotNull f fVar) {
        if (o()) {
            throw new NoSuchElementException("Cannot pop(), because the stack is empty.");
        }
        d[] dVarArr = this.f26411c;
        int i11 = this.f26412d - 1;
        this.f26412d = i11;
        d dVar = dVarArr[i11];
        Intrinsics.f(dVar);
        this.f26411c[this.f26412d] = null;
        fVar.s(dVar);
        int i12 = this.f26416h;
        int i13 = fVar.f26416h;
        int c11 = dVar.c();
        for (int i14 = 0; i14 < c11; i14++) {
            i13--;
            i12--;
            Object[] objArr = fVar.f26415g;
            Object[] objArr2 = this.f26415g;
            objArr[i13] = objArr2[i12];
            objArr2[i12] = null;
        }
        int i15 = this.f26414f;
        int i16 = fVar.f26414f;
        int b11 = dVar.b();
        for (int i17 = 0; i17 < b11; i17++) {
            i16--;
            i15--;
            int[] iArr = fVar.f26413e;
            int[] iArr2 = this.f26413e;
            iArr[i16] = iArr2[i15];
            iArr2[i15] = 0;
        }
        this.f26416h -= dVar.c();
        this.f26414f -= dVar.b();
    }

    public final void r(@NotNull d dVar) {
        if (dVar.b() == 0 && dVar.c() == 0) {
            s(dVar);
            return;
        }
        B0.a("Cannot push " + dVar + " without arguments because it expects " + dVar.b() + " ints and " + dVar.c() + " objects.");
        throw null;
    }

    public final void s(@NotNull d dVar) {
        this.f26417i = 0;
        this.f26418j = 0;
        int i11 = this.f26412d;
        d[] dVarArr = this.f26411c;
        int length = dVarArr.length;
        int i12 = UserVerificationMethods.USER_VERIFY_ALL;
        if (i11 == length) {
            Object[] copyOf = Arrays.copyOf(dVarArr, i11 + (i11 > 1024 ? 1024 : i11));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f26411c = (d[]) copyOf;
        }
        int b11 = dVar.b() + this.f26414f;
        int[] iArr = this.f26413e;
        int length2 = iArr.length;
        if (b11 > length2) {
            int i13 = length2 + (length2 > 1024 ? 1024 : length2);
            if (i13 >= b11) {
                b11 = i13;
            }
            int[] copyOf2 = Arrays.copyOf(iArr, b11);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f26413e = copyOf2;
        }
        int c11 = dVar.c() + this.f26416h;
        Object[] objArr = this.f26415g;
        int length3 = objArr.length;
        if (c11 > length3) {
            if (length3 <= 1024) {
                i12 = length3;
            }
            int i14 = length3 + i12;
            if (i14 >= c11) {
                c11 = i14;
            }
            Object[] copyOf3 = Arrays.copyOf(objArr, c11);
            Intrinsics.checkNotNullExpressionValue(copyOf3, "copyOf(this, newSize)");
            this.f26415g = copyOf3;
        }
        d[] dVarArr2 = this.f26411c;
        int i15 = this.f26412d;
        this.f26412d = i15 + 1;
        dVarArr2[i15] = dVar;
        this.f26414f = dVar.b() + this.f26414f;
        this.f26416h = dVar.c() + this.f26416h;
    }
}
