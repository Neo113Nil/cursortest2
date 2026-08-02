package P3;

import N3.C3659j;
import N3.H;
import N3.I;
import N3.M;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;
import java.util.Arrays;
import m3.N;

/* loaded from: classes.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    private final d f21767a;

    /* renamed from: b, reason: collision with root package name */
    private final M f21768b;

    /* renamed from: c, reason: collision with root package name */
    private final int f21769c;

    /* renamed from: d, reason: collision with root package name */
    private final int f21770d;

    /* renamed from: e, reason: collision with root package name */
    private final long f21771e;

    /* renamed from: f, reason: collision with root package name */
    private int f21772f;

    /* renamed from: g, reason: collision with root package name */
    private int f21773g;

    /* renamed from: h, reason: collision with root package name */
    private int f21774h;

    /* renamed from: i, reason: collision with root package name */
    private int f21775i;

    /* renamed from: j, reason: collision with root package name */
    private int f21776j;

    /* renamed from: k, reason: collision with root package name */
    private int f21777k;

    /* renamed from: l, reason: collision with root package name */
    private long f21778l;

    /* renamed from: m, reason: collision with root package name */
    private long[] f21779m;

    /* renamed from: n, reason: collision with root package name */
    private int[] f21780n;

    public e(int i11, d dVar, M m11) {
        this.f21767a = dVar;
        int b11 = dVar.b();
        boolean z11 = true;
        if (b11 != 1 && b11 != 2) {
            z11 = false;
        }
        G10.a.c(z11);
        int i12 = (((i11 % 10) + 48) << 8) | ((i11 / 10) + 48);
        this.f21769c = (b11 == 2 ? 1667497984 : 1651965952) | i12;
        this.f21771e = dVar.a();
        this.f21768b = m11;
        this.f21770d = b11 == 2 ? i12 | 1650720768 : -1;
        this.f21778l = -1L;
        this.f21779m = new long[UserVerificationMethods.USER_VERIFY_NONE];
        this.f21780n = new int[UserVerificationMethods.USER_VERIFY_NONE];
        this.f21772f = dVar.f21764d;
    }

    private I c(int i11) {
        return new I(((this.f21771e * 1) / this.f21772f) * this.f21780n[i11], this.f21779m[i11]);
    }

    public final void a(long j11, boolean z11) {
        if (this.f21778l == -1) {
            this.f21778l = j11;
        }
        if (z11) {
            if (this.f21777k == this.f21780n.length) {
                long[] jArr = this.f21779m;
                this.f21779m = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                int[] iArr = this.f21780n;
                this.f21780n = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
            }
            long[] jArr2 = this.f21779m;
            int i11 = this.f21777k;
            jArr2[i11] = j11;
            this.f21780n[i11] = this.f21776j;
            this.f21777k = i11 + 1;
        }
        this.f21776j++;
    }

    public final void b() {
        int i11;
        this.f21779m = Arrays.copyOf(this.f21779m, this.f21777k);
        this.f21780n = Arrays.copyOf(this.f21780n, this.f21777k);
        if ((this.f21769c & 1651965952) != 1651965952 || this.f21767a.f21766f == 0 || (i11 = this.f21777k) <= 0) {
            return;
        }
        this.f21772f = i11;
    }

    public final H.a d(long j11) {
        if (this.f21777k == 0) {
            return new H.a(new I(0L, this.f21778l));
        }
        int i11 = (int) (j11 / ((this.f21771e * 1) / this.f21772f));
        int d11 = N.d(this.f21780n, i11, true, true);
        if (this.f21780n[d11] == i11) {
            return new H.a(c(d11));
        }
        I c11 = c(d11);
        int i12 = d11 + 1;
        return i12 < this.f21779m.length ? new H.a(c11, c(i12)) : new H.a(c11);
    }

    public final boolean e(int i11) {
        return this.f21769c == i11 || this.f21770d == i11;
    }

    public final boolean f(C3659j c3659j) throws IOException {
        int i11 = this.f21774h;
        int d11 = i11 - this.f21768b.d(c3659j, i11, false);
        this.f21774h = d11;
        boolean z11 = d11 == 0;
        if (z11) {
            if (this.f21773g > 0) {
                int i12 = this.f21775i;
                this.f21768b.b((this.f21771e * i12) / this.f21772f, Arrays.binarySearch(this.f21780n, i12) >= 0 ? 1 : 0, this.f21773g, 0, null);
            }
            this.f21775i++;
        }
        return z11;
    }

    public final void g(int i11) {
        this.f21773g = i11;
        this.f21774h = i11;
    }

    public final void h(long j11) {
        if (this.f21777k == 0) {
            this.f21775i = 0;
        } else {
            this.f21775i = this.f21780n[N.e(this.f21779m, j11, true)];
        }
    }
}
