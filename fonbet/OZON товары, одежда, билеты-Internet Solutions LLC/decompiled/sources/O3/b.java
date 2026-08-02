package O3;

import N3.C3658i;
import N3.C3659j;
import N3.C3663n;
import N3.E;
import N3.G;
import N3.H;
import N3.InterfaceC3665p;
import N3.M;
import N3.q;
import N3.r;
import j3.C7272n;
import j3.v;
import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import m3.N;
import ru.ozon.fintech.settings.models.AppConfig;

/* loaded from: classes.dex */
public final class b implements InterfaceC3665p {

    /* renamed from: q, reason: collision with root package name */
    private static final int[] f19912q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: r, reason: collision with root package name */
    private static final int[] f19913r = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* renamed from: s, reason: collision with root package name */
    private static final byte[] f19914s;

    /* renamed from: t, reason: collision with root package name */
    private static final byte[] f19915t;

    /* renamed from: b, reason: collision with root package name */
    private final C3663n f19917b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f19918c;

    /* renamed from: d, reason: collision with root package name */
    private long f19919d;

    /* renamed from: e, reason: collision with root package name */
    private int f19920e;

    /* renamed from: f, reason: collision with root package name */
    private int f19921f;

    /* renamed from: h, reason: collision with root package name */
    private int f19923h;

    /* renamed from: i, reason: collision with root package name */
    private long f19924i;

    /* renamed from: j, reason: collision with root package name */
    private r f19925j;

    /* renamed from: k, reason: collision with root package name */
    private M f19926k;

    /* renamed from: l, reason: collision with root package name */
    private M f19927l;

    /* renamed from: m, reason: collision with root package name */
    private H f19928m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f19929n;

    /* renamed from: o, reason: collision with root package name */
    private long f19930o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f19931p;

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f19916a = new byte[1];

    /* renamed from: g, reason: collision with root package name */
    private int f19922g = -1;

    static {
        int i11 = N.f74289a;
        Charset charset = StandardCharsets.UTF_8;
        f19914s = "#!AMR\n".getBytes(charset);
        f19915t = "#!AMR-WB\n".getBytes(charset);
    }

    public b() {
        C3663n c3663n = new C3663n();
        this.f19917b = c3663n;
        this.f19927l = c3663n;
    }

    private int g(C3659j c3659j) throws IOException {
        boolean z11;
        c3659j.e();
        byte[] bArr = this.f19916a;
        c3659j.d(bArr, 0, 1, false);
        byte b11 = bArr[0];
        if ((b11 & 131) > 0) {
            throw v.a(null, "Invalid padding bits for frame header " + ((int) b11));
        }
        int i11 = (b11 >> 3) & 15;
        if (i11 >= 0 && i11 <= 15 && (((z11 = this.f19918c) && (i11 < 10 || i11 > 13)) || (!z11 && (i11 < 12 || i11 > 14)))) {
            return z11 ? f19913r[i11] : f19912q[i11];
        }
        StringBuilder sb2 = new StringBuilder("Illegal AMR ");
        sb2.append(this.f19918c ? "WB" : AppConfig.f97035NB);
        sb2.append(" frame type ");
        sb2.append(i11);
        throw v.a(null, sb2.toString());
    }

    private boolean h(C3659j c3659j) throws IOException {
        c3659j.e();
        byte[] bArr = f19914s;
        byte[] bArr2 = new byte[bArr.length];
        c3659j.d(bArr2, 0, bArr.length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.f19918c = false;
            c3659j.m(bArr.length, false);
            return true;
        }
        c3659j.e();
        byte[] bArr3 = f19915t;
        byte[] bArr4 = new byte[bArr3.length];
        c3659j.d(bArr4, 0, bArr3.length, false);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f19918c = true;
        c3659j.m(bArr3.length, false);
        return true;
    }

    @Override // N3.InterfaceC3665p
    public final void a(long j11, long j12) {
        this.f19919d = 0L;
        this.f19920e = 0;
        this.f19921f = 0;
        this.f19930o = j12;
        H h11 = this.f19928m;
        if (!(h11 instanceof E)) {
            if (j11 == 0 || !(h11 instanceof C3658i)) {
                this.f19924i = 0L;
                return;
            } else {
                this.f19924i = ((C3658i) h11).a(j11);
                return;
            }
        }
        long h12 = ((E) h11).h(j11);
        this.f19924i = h12;
        if (Math.abs(this.f19930o - h12) < 20000) {
            return;
        }
        this.f19929n = true;
        this.f19927l = this.f19917b;
    }

    @Override // N3.InterfaceC3665p
    public final void b(r rVar) {
        this.f19925j = rVar;
        M track = rVar.track(0, 1);
        this.f19926k = track;
        this.f19927l = track;
        rVar.endTracks();
    }

    @Override // N3.InterfaceC3665p
    public final boolean d(q qVar) throws IOException {
        return h((C3659j) qVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0106  */
    @Override // N3.InterfaceC3665p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(q qVar, G g10) throws IOException {
        G10.a.i(this.f19926k);
        int i11 = N.f74289a;
        C3659j c3659j = (C3659j) qVar;
        if (c3659j.getPosition() == 0 && !h(c3659j)) {
            throw v.a(null, "Could not find AMR header.");
        }
        if (!this.f19931p) {
            this.f19931p = true;
            boolean z11 = this.f19918c;
            String str = z11 ? "audio/amr-wb" : "audio/amr";
            String str2 = z11 ? "audio/amr-wb" : "audio/3gpp";
            int i12 = z11 ? 16000 : 8000;
            int i13 = z11 ? f19913r[8] : f19912q[7];
            M m11 = this.f19926k;
            C7272n.a aVar = new C7272n.a();
            aVar.W(str);
            aVar.y0(str2);
            aVar.o0(i13);
            aVar.T(1);
            aVar.z0(i12);
            m11.a(aVar.P());
        }
        int i14 = 0;
        if (this.f19921f == 0) {
            try {
                int g11 = g(c3659j);
                this.f19920e = g11;
                this.f19921f = g11;
                if (this.f19922g == -1) {
                    c3659j.getClass();
                    this.f19922g = this.f19920e;
                }
                if (this.f19922g == this.f19920e) {
                    this.f19923h++;
                }
                H h11 = this.f19928m;
                if (h11 instanceof E) {
                    E e11 = (E) h11;
                    long j11 = this.f19924i + this.f19919d + 20000;
                    long position = c3659j.getPosition() + this.f19920e;
                    if (!e11.b(j11)) {
                        e11.a(j11, position);
                    }
                    if (this.f19929n && Math.abs(this.f19930o - j11) < 20000) {
                        this.f19929n = false;
                        this.f19927l = this.f19926k;
                    }
                }
            } catch (EOFException unused) {
            }
        }
        int d11 = this.f19927l.d(c3659j, this.f19921f, true);
        if (d11 != -1) {
            int i15 = this.f19921f - d11;
            this.f19921f = i15;
            if (i15 <= 0) {
                this.f19927l.b(this.f19919d + this.f19924i, 1, this.f19920e, 0, null);
                this.f19919d += 20000;
            }
            if (this.f19928m == null) {
                H.b bVar = new H.b(-9223372036854775807L);
                this.f19928m = bVar;
                this.f19925j.seekMap(bVar);
            }
            if (i14 == -1) {
                H h12 = this.f19928m;
                if (h12 instanceof E) {
                    ((E) h12).c(this.f19924i + this.f19919d);
                    this.f19925j.seekMap(this.f19928m);
                    this.f19926k.getClass();
                }
            }
            return i14;
        }
        i14 = -1;
        if (this.f19928m == null) {
        }
        if (i14 == -1) {
        }
        return i14;
    }

    @Override // N3.InterfaceC3665p
    public final void release() {
    }
}
