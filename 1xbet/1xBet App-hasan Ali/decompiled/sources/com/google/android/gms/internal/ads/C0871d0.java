package com.google.android.gms.internal.ads;

import B.C0072a;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0871d0 implements F {

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f13071l = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f13072m = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* renamed from: n, reason: collision with root package name */
    public static final byte[] f13073n;

    /* renamed from: o, reason: collision with root package name */
    public static final byte[] f13074o;

    /* renamed from: b, reason: collision with root package name */
    public boolean f13076b;

    /* renamed from: c, reason: collision with root package name */
    public long f13077c;

    /* renamed from: d, reason: collision with root package name */
    public int f13078d;

    /* renamed from: e, reason: collision with root package name */
    public int f13079e;

    /* renamed from: g, reason: collision with root package name */
    public HG f13080g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC0737a0 f13081h;

    /* renamed from: j, reason: collision with root package name */
    public J f13082j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f13083k;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f13075a = new byte[1];
    public int f = -1;
    public InterfaceC0737a0 i = new E();

    static {
        int i = AbstractC1260lo.f14419a;
        Charset charset = StandardCharsets.UTF_8;
        f13073n = "#!AMR\n".getBytes(charset);
        f13074o = "#!AMR-WB\n".getBytes(charset);
    }

    public final boolean a(B b3) {
        b3.f7754p = 0;
        byte[] bArr = f13073n;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        b3.G(bArr2, 0, length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.f13076b = false;
            b3.k(bArr.length);
            return true;
        }
        b3.f7754p = 0;
        byte[] bArr3 = f13074o;
        int length2 = bArr3.length;
        byte[] bArr4 = new byte[length2];
        b3.G(bArr4, 0, length2, false);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f13076b = true;
        b3.k(bArr3.length);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.F
    public final void d(long j5, long j6) {
        this.f13077c = 0L;
        this.f13078d = 0;
        this.f13079e = 0;
    }

    @Override // com.google.android.gms.internal.ads.F
    public final boolean e(G g5) {
        return a((B) g5);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0129 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a0 A[Catch: EOFException -> 0x00e3, TryCatch #0 {EOFException -> 0x00e3, blocks: (B:37:0x0071, B:39:0x0082, B:47:0x00a0, B:49:0x00a7, B:53:0x00a4, B:63:0x00b9, B:64:0x00d1, B:65:0x00d2, B:66:0x00e2), top: B:36:0x0071 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a4 A[Catch: EOFException -> 0x00e3, TryCatch #0 {EOFException -> 0x00e3, blocks: (B:37:0x0071, B:39:0x0082, B:47:0x00a0, B:49:0x00a7, B:53:0x00a4, B:63:0x00b9, B:64:0x00d1, B:65:0x00d2, B:66:0x00e2), top: B:36:0x0071 }] */
    @Override // com.google.android.gms.internal.ads.F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(G g5, C0072a c0072a) {
        char c5;
        AbstractC1668us.F(this.f13081h);
        int i = AbstractC1260lo.f14419a;
        if (((B) g5).f7752n == 0 && !a((B) g5)) {
            throw B7.a(null, "Could not find AMR header.");
        }
        boolean z3 = this.f13083k;
        int[] iArr = f13071l;
        int[] iArr2 = f13072m;
        if (!z3) {
            this.f13083k = true;
            boolean z5 = this.f13076b;
            String str = true != z5 ? "audio/3gpp" : "audio/amr-wb";
            int i5 = true != z5 ? 8000 : 16000;
            int i6 = z5 ? iArr2[8] : iArr[7];
            InterfaceC0737a0 interfaceC0737a0 = this.i;
            C1649uH c1649uH = new C1649uH();
            c1649uH.c(str);
            c1649uH.f15849m = i6;
            c1649uH.f15831A = 1;
            c1649uH.f15832B = i5;
            interfaceC0737a0.e(new C1407p(c1649uH));
        }
        byte[] bArr = this.f13075a;
        int i7 = this.f13079e;
        if (i7 == 0) {
            try {
                ((B) g5).f7754p = 0;
                ((B) g5).G(bArr, 0, 1, false);
                byte b3 = bArr[0];
                if ((b3 & 131) > 0) {
                    throw B7.a(null, "Invalid padding bits for frame header " + ((int) b3));
                }
                boolean z6 = this.f13076b;
                int i8 = (b3 >> 3) & 15;
                if (z6) {
                    if (i8 >= 10) {
                        if (i8 > 13) {
                        }
                    }
                    i7 = !z6 ? iArr2[i8] : iArr[i8];
                    this.f13078d = i7;
                    this.f13079e = i7;
                    if (this.f == -1) {
                        this.f = i7;
                    }
                }
                if (!z6) {
                    if (i8 >= 12 && i8 <= 14) {
                    }
                    i7 = !z6 ? iArr2[i8] : iArr[i8];
                    this.f13078d = i7;
                    this.f13079e = i7;
                    if (this.f == -1) {
                    }
                }
                throw B7.a(null, "Illegal AMR " + (true != z6 ? "NB" : "WB") + " frame type " + i8);
            } catch (EOFException unused) {
            }
        }
        int b5 = this.i.b(g5, i7, true);
        if (b5 != -1) {
            int i9 = this.f13079e - b5;
            this.f13079e = i9;
            if (i9 <= 0) {
                this.i.d(this.f13077c, 1, this.f13078d, 0, null);
                this.f13077c += 20000;
            }
            c5 = 0;
            if (this.f13082j == null) {
                J j5 = new J(-9223372036854775807L, 0L);
                this.f13082j = j5;
                this.f13080g.x(j5);
            }
            return c5 != 65535 ? -1 : 0;
        }
        c5 = 65535;
        if (this.f13082j == null) {
        }
        if (c5 != 65535) {
        }
    }

    @Override // com.google.android.gms.internal.ads.F
    public final void h(H h3) {
        HG hg = (HG) h3;
        this.f13080g = hg;
        InterfaceC0737a0 w5 = hg.w(0, 1);
        this.f13081h = w5;
        this.i = w5;
        hg.v();
    }

    @Override // com.google.android.gms.internal.ads.F
    public final List j() {
        C0954ev c0954ev = AbstractC1044gv.f13676l;
        return C1761wv.f16184o;
    }
}
