package A3;

import A3.b;
import F3.InterfaceC3018x;
import android.graphics.Bitmap;
import androidx.media3.exoplayer.AbstractC5444f;
import androidx.media3.exoplayer.C5449k;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.k0;
import j3.C7272n;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import t3.C9730B;

/* loaded from: classes.dex */
public final class f extends AbstractC5444f {

    /* renamed from: A, reason: collision with root package name */
    private int f320A;

    /* renamed from: B, reason: collision with root package name */
    private int f321B;

    /* renamed from: C, reason: collision with root package name */
    private C7272n f322C;

    /* renamed from: D, reason: collision with root package name */
    private A3.b f323D;

    /* renamed from: E, reason: collision with root package name */
    private s3.f f324E;

    /* renamed from: F, reason: collision with root package name */
    private ImageOutput f325F;

    /* renamed from: G, reason: collision with root package name */
    private Bitmap f326G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f327H;

    /* renamed from: I, reason: collision with root package name */
    private b f328I;

    /* renamed from: J, reason: collision with root package name */
    private b f329J;

    /* renamed from: K, reason: collision with root package name */
    private int f330K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f331L;

    /* renamed from: s, reason: collision with root package name */
    private final b.a f332s;

    /* renamed from: t, reason: collision with root package name */
    private final s3.f f333t;

    /* renamed from: u, reason: collision with root package name */
    private final ArrayDeque<a> f334u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f335v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f336w;

    /* renamed from: x, reason: collision with root package name */
    private a f337x;

    /* renamed from: y, reason: collision with root package name */
    private long f338y;

    /* renamed from: z, reason: collision with root package name */
    private long f339z;

    private static final class a {

        /* renamed from: c, reason: collision with root package name */
        public static final a f340c = new a(-9223372036854775807L, -9223372036854775807L);

        /* renamed from: a, reason: collision with root package name */
        public final long f341a;

        /* renamed from: b, reason: collision with root package name */
        public final long f342b;

        public a(long j11, long j12) {
            this.f341a = j11;
            this.f342b = j12;
        }
    }

    /* loaded from: classes8.dex */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f343a;

        /* renamed from: b, reason: collision with root package name */
        private final long f344b;

        /* renamed from: c, reason: collision with root package name */
        private Bitmap f345c;

        public b(int i11, long j11) {
            this.f343a = i11;
            this.f344b = j11;
        }

        public final long a() {
            return this.f344b;
        }

        public final Bitmap b() {
            return this.f345c;
        }

        public final int c() {
            return this.f343a;
        }

        public final boolean d() {
            return this.f345c != null;
        }

        public final void e(Bitmap bitmap) {
            this.f345c = bitmap;
        }
    }

    public f(b.a aVar) {
        super(4);
        this.f332s = aVar;
        this.f325F = ImageOutput.f44075a;
        this.f333t = new s3.f(0);
        this.f337x = a.f340c;
        this.f334u = new ArrayDeque<>();
        this.f339z = -9223372036854775807L;
        this.f338y = -9223372036854775807L;
        this.f320A = 0;
        this.f321B = 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0157, code lost:
    
        if (r14 == ((r0.f69110O * r1.f69109N) - 1)) goto L83;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean a0(long j11) throws d, C5449k {
        boolean z11;
        Bitmap bitmap;
        if ((this.f326G == null || this.f328I != null) && (this.f321B != 0 || getState() == 2)) {
            Bitmap bitmap2 = this.f326G;
            ArrayDeque<a> arrayDeque = this.f334u;
            if (bitmap2 == null) {
                G10.a.i(this.f323D);
                e m11 = this.f323D.m();
                if (m11 != null) {
                    if (!m11.i()) {
                        Bitmap bitmap3 = m11.f319d;
                        if (bitmap3 == null) {
                            throw new IllegalStateException("Non-EOS buffer came back from the decoder without bitmap.");
                        }
                        this.f326G = bitmap3;
                        m11.n();
                    } else {
                        if (this.f320A == 3) {
                            d0();
                            G10.a.i(this.f322C);
                            c0();
                            return false;
                        }
                        m11.n();
                        if (arrayDeque.isEmpty()) {
                            this.f336w = true;
                            return false;
                        }
                    }
                }
            }
            if (this.f327H && this.f326G != null && this.f328I != null) {
                G10.a.i(this.f322C);
                C7272n c7272n = this.f322C;
                int i11 = c7272n.f69109N;
                int i12 = c7272n.f69110O;
                boolean z12 = ((i11 == 1 && i12 == 1) || i11 == -1 || i12 == -1) ? false : true;
                if (!this.f328I.d()) {
                    b bVar = this.f328I;
                    if (z12) {
                        int c11 = bVar.c();
                        G10.a.i(this.f326G);
                        int width = this.f326G.getWidth();
                        C7272n c7272n2 = this.f322C;
                        G10.a.i(c7272n2);
                        int i13 = width / c7272n2.f69109N;
                        int height = this.f326G.getHeight();
                        C7272n c7272n3 = this.f322C;
                        G10.a.i(c7272n3);
                        int i14 = height / c7272n3.f69110O;
                        int i15 = this.f322C.f69109N;
                        bitmap = Bitmap.createBitmap(this.f326G, (c11 % i15) * i13, (c11 / i15) * i14, i13, i14);
                    } else {
                        bitmap = this.f326G;
                        G10.a.i(bitmap);
                    }
                    bVar.e(bitmap);
                }
                Bitmap b11 = this.f328I.b();
                G10.a.i(b11);
                long a11 = this.f328I.a();
                long j12 = a11 - j11;
                boolean z13 = getState() == 2;
                int i16 = this.f321B;
                if (i16 != 0) {
                    if (i16 == 1) {
                        z13 = true;
                    } else {
                        if (i16 != 3) {
                            throw new IllegalStateException();
                        }
                        z13 = false;
                    }
                }
                if (z13 || j12 < 30000) {
                    this.f325F.onImageAvailable(a11 - this.f337x.f342b, b11);
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    b bVar2 = this.f328I;
                    G10.a.i(bVar2);
                    long a12 = bVar2.a();
                    this.f338y = a12;
                    while (!arrayDeque.isEmpty() && a12 >= arrayDeque.peek().f341a) {
                        this.f337x = arrayDeque.removeFirst();
                    }
                    this.f321B = 3;
                    if (z12) {
                        b bVar3 = this.f328I;
                        G10.a.i(bVar3);
                        int c12 = bVar3.c();
                        C7272n c7272n4 = this.f322C;
                        G10.a.i(c7272n4);
                        C7272n c7272n5 = this.f322C;
                        G10.a.i(c7272n5);
                    }
                    this.f326G = null;
                    this.f328I = this.f329J;
                    this.f329J = null;
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
    
        if (r2 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0121, code lost:
    
        if (r4 == false) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean b0(long j11) throws d {
        boolean z11;
        s3.f fVar;
        boolean z12;
        s3.f fVar2;
        if (!this.f327H || this.f328I == null) {
            C9730B H11 = H();
            A3.b bVar = this.f323D;
            if (bVar != null && this.f320A != 3 && !this.f335v) {
                if (this.f324E == null) {
                    s3.f fVar3 = (s3.f) bVar.b();
                    this.f324E = fVar3;
                }
                if (this.f320A == 2) {
                    G10.a.i(this.f324E);
                    this.f324E.m(4);
                    A3.b bVar2 = this.f323D;
                    G10.a.i(bVar2);
                    bVar2.c(this.f324E);
                    this.f324E = null;
                    this.f320A = 3;
                    return false;
                }
                int X9 = X(H11, this.f324E, 0);
                if (X9 == -5) {
                    C7272n c7272n = H11.f98980b;
                    G10.a.i(c7272n);
                    this.f322C = c7272n;
                    this.f331L = true;
                    this.f320A = 2;
                    return true;
                }
                if (X9 == -4) {
                    this.f324E.p();
                    ByteBuffer byteBuffer = this.f324E.f98184d;
                    if (byteBuffer == null || byteBuffer.remaining() <= 0) {
                        s3.f fVar4 = this.f324E;
                        G10.a.i(fVar4);
                        if (!fVar4.i()) {
                            z11 = false;
                            if (z11) {
                                s3.f fVar5 = this.f324E;
                                G10.a.i(fVar5);
                                fVar5.f98182b = this.f322C;
                                A3.b bVar3 = this.f323D;
                                G10.a.i(bVar3);
                                s3.f fVar6 = this.f324E;
                                G10.a.i(fVar6);
                                bVar3.c(fVar6);
                                this.f330K = 0;
                            }
                            fVar = this.f324E;
                            G10.a.i(fVar);
                            if (fVar.i()) {
                                int i11 = this.f330K;
                                b bVar4 = new b(i11, fVar.f98186f);
                                this.f329J = bVar4;
                                this.f330K = i11 + 1;
                                if (!this.f327H) {
                                    long a11 = bVar4.a();
                                    boolean z13 = a11 - 30000 <= j11 && j11 <= 30000 + a11;
                                    b bVar5 = this.f328I;
                                    boolean z14 = bVar5 != null && bVar5.a() <= j11 && j11 < a11;
                                    b bVar6 = this.f329J;
                                    G10.a.i(bVar6);
                                    C7272n c7272n2 = this.f322C;
                                    G10.a.i(c7272n2);
                                    if (c7272n2.f69109N != -1 && this.f322C.f69110O != -1) {
                                        int c11 = bVar6.c();
                                        C7272n c7272n3 = this.f322C;
                                        G10.a.i(c7272n3);
                                        if (c11 != (c7272n3.f69110O * this.f322C.f69109N) - 1) {
                                            z12 = false;
                                            this.f327H = !z13 || z14 || z12;
                                            if (z14) {
                                            }
                                        }
                                    }
                                    z12 = true;
                                    this.f327H = !z13 || z14 || z12;
                                    if (z14) {
                                    }
                                }
                                this.f328I = this.f329J;
                                this.f329J = null;
                            } else {
                                this.f327H = true;
                            }
                            fVar2 = this.f324E;
                            G10.a.i(fVar2);
                            if (!fVar2.i()) {
                                this.f335v = true;
                                this.f324E = null;
                                return false;
                            }
                            long j12 = this.f339z;
                            s3.f fVar7 = this.f324E;
                            G10.a.i(fVar7);
                            this.f339z = Math.max(j12, fVar7.f98186f);
                            if (z11) {
                                this.f324E = null;
                            } else {
                                s3.f fVar8 = this.f324E;
                                G10.a.i(fVar8);
                                fVar8.f();
                            }
                            return !this.f327H;
                        }
                    }
                    z11 = true;
                    if (z11) {
                    }
                    fVar = this.f324E;
                    G10.a.i(fVar);
                    if (fVar.i()) {
                    }
                    fVar2 = this.f324E;
                    G10.a.i(fVar2);
                    if (!fVar2.i()) {
                    }
                } else if (X9 != -3) {
                    throw new IllegalStateException();
                }
            }
        }
        return false;
    }

    private void c0() throws C5449k {
        if (this.f331L) {
            C7272n c7272n = this.f322C;
            c7272n.getClass();
            b.a aVar = this.f332s;
            int b11 = aVar.b(c7272n);
            if (b11 != k0.g(4, 0, 0, 0) && b11 != k0.g(3, 0, 0, 0)) {
                throw D(new d("Provided decoder factory can't create decoder for format."), this.f322C, 4005);
            }
            A3.b bVar = this.f323D;
            if (bVar != null) {
                bVar.release();
            }
            this.f323D = aVar.a();
            this.f331L = false;
        }
    }

    private void d0() {
        this.f324E = null;
        this.f320A = 0;
        this.f339z = -9223372036854775807L;
        A3.b bVar = this.f323D;
        if (bVar != null) {
            bVar.release();
            this.f323D = null;
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC5444f
    protected final void O() {
        this.f322C = null;
        this.f337x = a.f340c;
        this.f334u.clear();
        d0();
        this.f325F.a();
    }

    @Override // androidx.media3.exoplayer.AbstractC5444f
    protected final void P(boolean z11, boolean z12) throws C5449k {
        this.f321B = z12 ? 1 : 0;
    }

    @Override // androidx.media3.exoplayer.AbstractC5444f
    protected final void Q(long j11, boolean z11) throws C5449k {
        this.f321B = Math.min(this.f321B, 1);
        this.f336w = false;
        this.f335v = false;
        this.f326G = null;
        this.f328I = null;
        this.f329J = null;
        this.f327H = false;
        this.f324E = null;
        A3.b bVar = this.f323D;
        if (bVar != null) {
            bVar.flush();
        }
        this.f334u.clear();
    }

    @Override // androidx.media3.exoplayer.AbstractC5444f
    protected final void R() {
        d0();
    }

    @Override // androidx.media3.exoplayer.AbstractC5444f
    protected final void T() {
        d0();
        this.f321B = Math.min(this.f321B, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // androidx.media3.exoplayer.AbstractC5444f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void W(C7272n[] c7272nArr, long j11, long j12, InterfaceC3018x.b bVar) throws C5449k {
        if (this.f337x.f342b != -9223372036854775807L) {
            ArrayDeque<a> arrayDeque = this.f334u;
            if (arrayDeque.isEmpty()) {
                long j13 = this.f339z;
                if (j13 != -9223372036854775807L) {
                    long j14 = this.f338y;
                    if (j14 != -9223372036854775807L) {
                    }
                }
            }
            arrayDeque.add(new a(this.f339z, j12));
            return;
        }
        this.f337x = new a(-9223372036854775807L, j12);
    }

    @Override // androidx.media3.exoplayer.AbstractC5444f, androidx.media3.exoplayer.j0
    public final boolean a() {
        return this.f336w;
    }

    @Override // androidx.media3.exoplayer.j0
    public final void c(long j11, long j12) throws C5449k {
        if (this.f336w) {
            return;
        }
        if (this.f322C == null) {
            C9730B H11 = H();
            s3.f fVar = this.f333t;
            fVar.f();
            int X9 = X(H11, fVar, 2);
            if (X9 != -5) {
                if (X9 == -4) {
                    G10.a.h(fVar.i());
                    this.f335v = true;
                    this.f336w = true;
                    return;
                }
                return;
            }
            C7272n c7272n = H11.f98980b;
            G10.a.i(c7272n);
            this.f322C = c7272n;
            this.f331L = true;
        }
        if (this.f323D == null) {
            c0();
        }
        do {
            try {
            } catch (d e11) {
                throw D(e11, null, 4003);
            }
        } while (a0(j11));
        do {
        } while (b0(j11));
    }

    @Override // androidx.media3.exoplayer.k0
    public final int e(C7272n c7272n) {
        return this.f332s.b(c7272n);
    }

    @Override // androidx.media3.exoplayer.j0, androidx.media3.exoplayer.k0
    public final String getName() {
        return "ImageRenderer";
    }

    @Override // androidx.media3.exoplayer.j0
    public final boolean isReady() {
        int i11 = this.f321B;
        if (i11 != 3) {
            return i11 == 0 && this.f327H;
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.AbstractC5444f, androidx.media3.exoplayer.h0.b
    public final void j(int i11, Object obj) throws C5449k {
        if (i11 != 15) {
            return;
        }
        ImageOutput imageOutput = obj instanceof ImageOutput ? (ImageOutput) obj : null;
        if (imageOutput == null) {
            imageOutput = ImageOutput.f44075a;
        }
        this.f325F = imageOutput;
    }
}
