package androidx.media3.exoplayer.hls;

import Hj0.T;
import N3.C3659j;
import N3.InterfaceC3665p;
import android.net.Uri;
import androidx.media3.exoplayer.hls.f;
import b4.C5531g;
import b4.C5536l;
import com.google.common.collect.AbstractC5880y;
import g4.C6622d;
import h4.C6798d;
import j3.C7270l;
import j3.C7272n;
import j3.t;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import m3.C8050C;
import m3.C8056I;
import m3.C8057J;
import p3.InterfaceC8846f;
import p3.i;
import u3.P;
import u4.C9948b;
import u4.C9950d;
import u4.C9953g;
import u4.I;
import z3.e;

/* loaded from: classes8.dex */
final class g extends G3.d {

    /* renamed from: M, reason: collision with root package name */
    private static final AtomicInteger f43939M = new AtomicInteger();

    /* renamed from: A, reason: collision with root package name */
    private final boolean f43940A;

    /* renamed from: B, reason: collision with root package name */
    private final boolean f43941B;

    /* renamed from: C, reason: collision with root package name */
    private x3.c f43942C;

    /* renamed from: D, reason: collision with root package name */
    private o f43943D;

    /* renamed from: E, reason: collision with root package name */
    private int f43944E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f43945F;

    /* renamed from: G, reason: collision with root package name */
    private volatile boolean f43946G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f43947H;

    /* renamed from: I, reason: collision with root package name */
    private AbstractC5880y<Integer> f43948I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f43949J;

    /* renamed from: K, reason: collision with root package name */
    private long f43950K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f43951L;

    /* renamed from: k, reason: collision with root package name */
    public final int f43952k;

    /* renamed from: l, reason: collision with root package name */
    public final int f43953l;

    /* renamed from: m, reason: collision with root package name */
    public final Uri f43954m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f43955n;

    /* renamed from: o, reason: collision with root package name */
    public final int f43956o;

    /* renamed from: p, reason: collision with root package name */
    private final InterfaceC8846f f43957p;

    /* renamed from: q, reason: collision with root package name */
    private final p3.i f43958q;

    /* renamed from: r, reason: collision with root package name */
    private final x3.c f43959r;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f43960s;

    /* renamed from: t, reason: collision with root package name */
    private final boolean f43961t;

    /* renamed from: u, reason: collision with root package name */
    private final C8056I f43962u;

    /* renamed from: v, reason: collision with root package name */
    private final c f43963v;

    /* renamed from: w, reason: collision with root package name */
    private final List<C7272n> f43964w;

    /* renamed from: x, reason: collision with root package name */
    private final C7270l f43965x;

    /* renamed from: y, reason: collision with root package name */
    private final C5531g f43966y;

    /* renamed from: z, reason: collision with root package name */
    private final C8050C f43967z;

    private g(c cVar, InterfaceC8846f interfaceC8846f, p3.i iVar, C7272n c7272n, boolean z11, InterfaceC8846f interfaceC8846f2, p3.i iVar2, boolean z12, Uri uri, List list, int i11, Object obj, long j11, long j12, long j13, int i12, boolean z13, int i13, boolean z14, boolean z15, C8056I c8056i, C7270l c7270l, x3.c cVar2, C5531g c5531g, C8050C c8050c, boolean z16, boolean z17, P p11) {
        super(interfaceC8846f, iVar, c7272n, i11, obj, j11, j12, j13);
        this.f43940A = z11;
        this.f43956o = i12;
        this.f43950K = z13 ? j12 - j11 : -9223372036854775807L;
        this.f43953l = i13;
        this.f43958q = iVar2;
        this.f43957p = interfaceC8846f2;
        this.f43945F = iVar2 != null;
        this.f43941B = z12;
        this.f43954m = uri;
        this.f43960s = z15;
        this.f43962u = c8056i;
        this.f43961t = z14;
        this.f43963v = cVar;
        this.f43964w = list;
        this.f43965x = c7270l;
        this.f43959r = cVar2;
        this.f43966y = c5531g;
        this.f43967z = c8050c;
        this.f43951L = z16;
        this.f43955n = z17;
        this.f43948I = AbstractC5880y.v();
        this.f43952k = f43939M.getAndIncrement();
    }

    public static g e(c cVar, InterfaceC8846f interfaceC8846f, C7272n c7272n, long j11, z3.e eVar, f.e eVar2, Uri uri, List list, int i11, Object obj, boolean z11, x3.f fVar, g gVar, byte[] bArr, byte[] bArr2, boolean z12, boolean z13, P p11) {
        byte[] bArr3;
        InterfaceC8846f interfaceC8846f2;
        boolean z14;
        p3.i iVar;
        InterfaceC8846f interfaceC8846f3;
        boolean z15;
        Uri uri2;
        C5531g c5531g;
        C8050C c8050c;
        x3.c cVar2;
        byte[] bArr4;
        InterfaceC8846f interfaceC8846f4 = interfaceC8846f;
        i.a aVar = new i.a();
        e.f fVar2 = eVar2.f43935a;
        String str = fVar2.f107087a;
        String str2 = eVar.f107123a;
        aVar.i(C8057J.d(str2, str));
        aVar.h(fVar2.f107095i);
        aVar.g(fVar2.f107096j);
        boolean z16 = eVar2.f43938d;
        aVar.b(z16 ? 8 : 0);
        p3.i a11 = aVar.a();
        boolean z17 = bArr != null;
        if (z17) {
            String str3 = fVar2.f107094h;
            str3.getClass();
            bArr3 = g(str3);
        } else {
            bArr3 = null;
        }
        if (bArr != null) {
            bArr3.getClass();
            interfaceC8846f2 = new a(interfaceC8846f4, bArr, bArr3);
        } else {
            interfaceC8846f2 = interfaceC8846f4;
        }
        e.C2323e c2323e = fVar2.f107088b;
        if (c2323e != null) {
            boolean z18 = bArr2 != null;
            if (z18) {
                String str4 = c2323e.f107094h;
                str4.getClass();
                bArr4 = g(str4);
            } else {
                bArr4 = null;
            }
            z14 = true;
            Uri d11 = C8057J.d(str2, c2323e.f107087a);
            i.a aVar2 = new i.a();
            aVar2.i(d11);
            boolean z19 = z18;
            aVar2.h(c2323e.f107095i);
            aVar2.g(c2323e.f107096j);
            iVar = aVar2.a();
            if (bArr2 != null) {
                bArr4.getClass();
                interfaceC8846f4 = new a(interfaceC8846f4, bArr2, bArr4);
            }
            z15 = z19;
            interfaceC8846f3 = interfaceC8846f4;
        } else {
            z14 = true;
            iVar = null;
            interfaceC8846f3 = null;
            z15 = false;
        }
        long j12 = j11 + fVar2.f107091e;
        long j13 = j12 + fVar2.f107089c;
        int i12 = eVar.f107028j + fVar2.f107090d;
        if (gVar != null) {
            p3.i iVar2 = gVar.f43958q;
            uri2 = uri;
            x3.c cVar3 = (((iVar == iVar2 || (iVar != null && iVar2 != null && iVar.f80066a.equals(iVar2.f80066a) && (iVar.f80071f > iVar2.f80071f ? 1 : (iVar.f80071f == iVar2.f80071f ? 0 : -1)) == 0)) ? z14 : false) && ((!uri2.equals(gVar.f43954m) || !gVar.f43947H) ? false : z14) && !gVar.f43949J && gVar.f43953l == i12) ? gVar.f43942C : null;
            c5531g = gVar.f43966y;
            c8050c = gVar.f43967z;
            cVar2 = cVar3;
        } else {
            uri2 = uri;
            c5531g = new C5531g(null);
            c8050c = new C8050C(10);
            cVar2 = null;
        }
        C5531g c5531g2 = c5531g;
        C8050C c8050c2 = c8050c;
        return new g(cVar, interfaceC8846f2, a11, c7272n, z17, interfaceC8846f3, iVar, z15, uri2, list, i11, obj, j12, j13, eVar2.f43936b, eVar2.f43937c, !z16, i12, fVar2.f107097k, z11, fVar.a(i12), fVar2.f107092f, cVar2, c5531g2, c8050c2, z12, z13, p11);
    }

    private void f(InterfaceC8846f interfaceC8846f, p3.i iVar, boolean z11, boolean z12) throws IOException {
        p3.i d11;
        boolean z13;
        long position;
        long j11;
        if (z11) {
            z13 = this.f43944E != 0;
            d11 = iVar;
        } else {
            long j12 = this.f43944E;
            long j13 = iVar.f80072g;
            d11 = iVar.d(j12, j13 != -1 ? j13 - j12 : -1L);
            z13 = false;
        }
        try {
            C3659j n11 = n(interfaceC8846f, d11, z12);
            if (z13) {
                n11.m(this.f43944E, false);
            }
            while (!this.f43946G && ((b) this.f43942C).a(n11)) {
                try {
                    try {
                    } catch (EOFException e11) {
                        if ((this.f9673d.f69118f & 16384) == 0) {
                            throw e11;
                        }
                        ((b) this.f43942C).f43900a.a(0L, 0L);
                        position = n11.getPosition();
                        j11 = iVar.f80071f;
                    }
                } catch (Throwable th2) {
                    this.f43944E = (int) (n11.getPosition() - iVar.f80071f);
                    throw th2;
                }
            }
            position = n11.getPosition();
            j11 = iVar.f80071f;
            this.f43944E = (int) (position - j11);
        } finally {
            T.b(interfaceC8846f);
        }
    }

    private static byte[] g(String str) {
        if (O7.b.b(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    private C3659j n(InterfaceC8846f interfaceC8846f, p3.i iVar, boolean z11) throws IOException {
        long j11;
        long open = interfaceC8846f.open(iVar);
        long j12 = this.f9676g;
        C8056I c8056i = this.f43962u;
        if (z11) {
            try {
                c8056i.i(j12, this.f43960s);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (TimeoutException e11) {
                throw new IOException(e11);
            }
        }
        C3659j c3659j = new C3659j(interfaceC8846f, iVar.f80071f, open);
        if (this.f43942C == null) {
            C8050C c8050c = this.f43967z;
            c3659j.e();
            try {
                c8050c.O(10);
                c3659j.d(c8050c.e(), 0, 10, false);
                if (c8050c.H() == 4801587) {
                    c8050c.S(3);
                    int D11 = c8050c.D();
                    int i11 = D11 + 10;
                    if (i11 > c8050c.b()) {
                        byte[] e12 = c8050c.e();
                        c8050c.O(i11);
                        System.arraycopy(e12, 0, c8050c.e(), 0, 10);
                    }
                    c3659j.d(c8050c.e(), 10, D11, false);
                    t c11 = this.f43966y.c(D11, c8050c.e());
                    if (c11 != null) {
                        int e13 = c11.e();
                        for (int i12 = 0; i12 < e13; i12++) {
                            t.a d11 = c11.d(i12);
                            if (d11 instanceof C5536l) {
                                C5536l c5536l = (C5536l) d11;
                                if ("com.apple.streaming.transportStreamTimestamp".equals(c5536l.f55522b)) {
                                    System.arraycopy(c5536l.f55523c, 0, c8050c.e(), 0, 8);
                                    c8050c.R(0);
                                    c8050c.Q(8);
                                    j11 = c8050c.y() & 8589934591L;
                                    break;
                                }
                            }
                        }
                    }
                }
            } catch (EOFException unused2) {
            }
            j11 = -9223372036854775807L;
            c3659j.e();
            x3.c cVar = this.f43959r;
            b b11 = cVar != null ? ((b) cVar).b() : this.f43963v.b(iVar.f80066a, this.f9673d, this.f43964w, this.f43962u, interfaceC8846f.getResponseHeaders(), c3659j);
            this.f43942C = b11;
            InterfaceC3665p c12 = b11.f43900a.c();
            if ((c12 instanceof C9953g) || (c12 instanceof C9948b) || (c12 instanceof C9950d) || (c12 instanceof C6622d)) {
                o oVar = this.f43943D;
                if (j11 != -9223372036854775807L) {
                    j12 = c8056i.b(j11);
                }
                oVar.G(j12);
            } else {
                this.f43943D.G(0L);
            }
            this.f43943D.v();
            ((b) this.f43942C).f43900a.b(this.f43943D);
        }
        this.f43943D.E(this.f43965x);
        return c3659j;
    }

    public static boolean q(g gVar, long j11, Uri uri, boolean z11, f.e eVar, long j12) {
        if (gVar == null) {
            return false;
        }
        if (uri.equals(gVar.f43954m) && gVar.f43947H) {
            return false;
        }
        return !z11 || j12 + eVar.f43935a.f107091e < j11;
    }

    @Override // J3.j.d
    public final void cancelLoad() {
        this.f43946G = true;
    }

    public final void d() {
        this.f43951L = false;
    }

    public final int h(int i11) {
        G10.a.h(!this.f43951L);
        if (i11 >= this.f43948I.size()) {
            return 0;
        }
        return this.f43948I.get(i11).intValue();
    }

    public final long i() {
        long j11 = this.f43950K;
        if (j11 != -9223372036854775807L) {
            return this.f9676g + j11;
        }
        return -9223372036854775807L;
    }

    public final void j(o oVar, AbstractC5880y<Integer> abstractC5880y) {
        this.f43943D = oVar;
        this.f43948I = abstractC5880y;
    }

    public final void k() {
        this.f43949J = true;
    }

    public final boolean l() {
        return this.f43947H;
    }

    @Override // J3.j.d
    public final void load() throws IOException {
        x3.c cVar;
        this.f43943D.getClass();
        if (this.f43942C == null && (cVar = this.f43959r) != null) {
            InterfaceC3665p c11 = ((b) cVar).f43900a.c();
            if ((c11 instanceof I) || (c11 instanceof C6798d)) {
                this.f43942C = this.f43959r;
                this.f43945F = false;
            }
        }
        if (this.f43945F) {
            InterfaceC8846f interfaceC8846f = this.f43957p;
            interfaceC8846f.getClass();
            p3.i iVar = this.f43958q;
            iVar.getClass();
            f(interfaceC8846f, iVar, this.f43941B, false);
            this.f43944E = 0;
            this.f43945F = false;
        }
        if (this.f43946G) {
            return;
        }
        if (!this.f43961t) {
            f(this.f9678i, this.f9671b, this.f43940A, true);
        }
        this.f43947H = !this.f43946G;
    }

    public final boolean m() {
        return this.f43950K != -9223372036854775807L;
    }

    public final void o(long j11) {
        this.f43950K = j11;
    }

    public final boolean p() {
        return this.f43951L;
    }
}
