package G1;

import A1.C0045t0;
import A1.X;
import D3.f;
import E4.y;
import F1.g;
import F1.h;
import F1.k;
import F1.l;
import F1.m;
import F1.n;
import F1.s;
import F1.v;
import com.google.android.exoplayer2.Format$Builder;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.Arrays;
import v2.AbstractC1664a;
import v2.t;

/* loaded from: classes.dex */
public final class a implements k {

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f2849p = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f2850q;

    /* renamed from: r, reason: collision with root package name */
    public static final byte[] f2851r;

    /* renamed from: s, reason: collision with root package name */
    public static final byte[] f2852s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f2853t;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f2854a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2855b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2856c;

    /* renamed from: d, reason: collision with root package name */
    public long f2857d;

    /* renamed from: e, reason: collision with root package name */
    public int f2858e;

    /* renamed from: f, reason: collision with root package name */
    public int f2859f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2860g;

    /* renamed from: h, reason: collision with root package name */
    public long f2861h;

    /* renamed from: i, reason: collision with root package name */
    public int f2862i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public long f2863k;

    /* renamed from: l, reason: collision with root package name */
    public m f2864l;

    /* renamed from: m, reason: collision with root package name */
    public v f2865m;

    /* renamed from: n, reason: collision with root package name */
    public s f2866n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2867o;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f2850q = iArr;
        int i7 = t.f17153a;
        Charset charset = f.f1719c;
        f2851r = "#!AMR\n".getBytes(charset);
        f2852s = "#!AMR-WB\n".getBytes(charset);
        f2853t = iArr[8];
    }

    public a(int i7) {
        this.f2855b = (i7 & 2) != 0 ? i7 | 1 : i7;
        this.f2854a = new byte[1];
        this.f2862i = -1;
    }

    @Override // F1.k
    public final boolean a(l lVar) {
        return c((h) lVar);
    }

    public final int b(h hVar) {
        boolean z4;
        hVar.f2536f = 0;
        byte[] bArr = this.f2854a;
        hVar.c(bArr, 0, 1, false);
        byte b7 = bArr[0];
        if ((b7 & 131) > 0) {
            throw C0045t0.a(null, "Invalid padding bits for frame header " + ((int) b7));
        }
        int i7 = (b7 >> 3) & 15;
        if (i7 >= 0 && i7 <= 15 && (((z4 = this.f2856c) && (i7 < 10 || i7 > 13)) || (!z4 && (i7 < 12 || i7 > 14)))) {
            return z4 ? f2850q[i7] : f2849p[i7];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(this.f2856c ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i7);
        throw C0045t0.a(null, sb.toString());
    }

    public final boolean c(h hVar) {
        hVar.f2536f = 0;
        byte[] bArr = f2851r;
        byte[] bArr2 = new byte[bArr.length];
        hVar.c(bArr2, 0, bArr.length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.f2856c = false;
            hVar.q(bArr.length);
            return true;
        }
        hVar.f2536f = 0;
        byte[] bArr3 = f2852s;
        byte[] bArr4 = new byte[bArr3.length];
        hVar.c(bArr4, 0, bArr3.length, false);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f2856c = true;
        hVar.q(bArr3.length);
        return true;
    }

    @Override // F1.k
    public final void e(m mVar) {
        this.f2864l = mVar;
        this.f2865m = mVar.r(0, 1);
        mVar.n();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b4  */
    @Override // F1.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(l lVar, y yVar) {
        int i7;
        int i8;
        AbstractC1664a.i(this.f2865m);
        int i9 = t.f17153a;
        if (((h) lVar).f2534d == 0 && !c((h) lVar)) {
            throw C0045t0.a(null, "Could not find AMR header.");
        }
        if (!this.f2867o) {
            this.f2867o = true;
            boolean z4 = this.f2856c;
            String str = z4 ? "audio/amr-wb" : "audio/3gpp";
            int i10 = z4 ? 16000 : 8000;
            v vVar = this.f2865m;
            Format$Builder format$Builder = new Format$Builder();
            format$Builder.f10537k = str;
            format$Builder.f10538l = f2853t;
            format$Builder.f10550x = 1;
            format$Builder.f10551y = i10;
            vVar.a(new X(format$Builder));
        }
        if (this.f2859f == 0) {
            try {
                int b7 = b((h) lVar);
                this.f2858e = b7;
                this.f2859f = b7;
                if (this.f2862i == -1) {
                    this.f2861h = ((h) lVar).f2534d;
                    this.f2862i = b7;
                }
                if (this.f2862i == b7) {
                    this.j++;
                }
            } catch (EOFException unused) {
            }
        }
        int d7 = this.f2865m.d(lVar, this.f2859f, true);
        if (d7 != -1) {
            int i11 = this.f2859f - d7;
            this.f2859f = i11;
            if (i11 <= 0) {
                this.f2865m.e(this.f2863k + this.f2857d, 1, this.f2858e, 0, null);
                this.f2857d += 20000;
            }
            i7 = 0;
            h hVar = (h) lVar;
            if (!this.f2860g) {
                int i12 = this.f2855b;
                if ((i12 & 1) != 0) {
                    long j = hVar.f2533c;
                    if (j != -1 && ((i8 = this.f2862i) == -1 || i8 == this.f2858e)) {
                        if (this.j >= 20 || i7 == -1) {
                            g gVar = new g(j, this.f2861h, (int) ((i8 * 8000000) / 20000), i8, (i12 & 2) != 0);
                            this.f2866n = gVar;
                            this.f2864l.m(gVar);
                            this.f2860g = true;
                        }
                    }
                }
                n nVar = new n(-9223372036854775807L);
                this.f2866n = nVar;
                this.f2864l.m(nVar);
                this.f2860g = true;
            }
            return i7;
        }
        i7 = -1;
        h hVar2 = (h) lVar;
        if (!this.f2860g) {
        }
        return i7;
    }

    @Override // F1.k
    public final void g(long j, long j3) {
        this.f2857d = 0L;
        this.f2858e = 0;
        this.f2859f = 0;
        if (j != 0) {
            s sVar = this.f2866n;
            if (sVar instanceof g) {
                this.f2863k = (Math.max(0L, j - ((g) sVar).f2525b) * 8000000) / r0.f2528e;
                return;
            }
        }
        this.f2863k = 0L;
    }

    @Override // F1.k
    public final void release() {
    }
}
