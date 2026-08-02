package androidx.media3.exoplayer;

import F3.InterfaceC3018x;
import androidx.media3.exoplayer.k0;
import j3.AbstractC7252H;
import j3.C7272n;
import java.io.IOException;
import java.util.Objects;
import m3.C8053F;
import m3.InterfaceC8064f;
import t3.C9730B;
import t3.C9734F;
import t3.InterfaceC9731C;

/* renamed from: androidx.media3.exoplayer.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5444f implements j0, k0 {

    /* renamed from: b, reason: collision with root package name */
    private final int f43767b;

    /* renamed from: d, reason: collision with root package name */
    private C9734F f43769d;

    /* renamed from: e, reason: collision with root package name */
    private int f43770e;

    /* renamed from: f, reason: collision with root package name */
    private u3.P f43771f;

    /* renamed from: g, reason: collision with root package name */
    private C8053F f43772g;

    /* renamed from: h, reason: collision with root package name */
    private int f43773h;

    /* renamed from: i, reason: collision with root package name */
    private F3.U f43774i;

    /* renamed from: j, reason: collision with root package name */
    private C7272n[] f43775j;

    /* renamed from: k, reason: collision with root package name */
    private long f43776k;

    /* renamed from: l, reason: collision with root package name */
    private long f43777l;

    /* renamed from: n, reason: collision with root package name */
    private boolean f43779n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f43780o;

    /* renamed from: q, reason: collision with root package name */
    private InterfaceC3018x.b f43782q;

    /* renamed from: r, reason: collision with root package name */
    private k0.a f43783r;

    /* renamed from: a, reason: collision with root package name */
    private final Object f43766a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final C9730B f43768c = new C9730B();

    /* renamed from: m, reason: collision with root package name */
    private long f43778m = Long.MIN_VALUE;

    /* renamed from: p, reason: collision with root package name */
    private AbstractC7252H f43781p = AbstractC7252H.EMPTY;

    public AbstractC5444f(int i11) {
        this.f43767b = i11;
    }

    public int B() throws C5449k {
        return 0;
    }

    public final void C() {
        synchronized (this.f43766a) {
            this.f43783r = null;
        }
    }

    protected final C5449k D(Exception exc, C7272n c7272n, int i11) {
        return E(exc, c7272n, false, i11);
    }

    protected final C5449k E(Exception exc, C7272n c7272n, boolean z11, int i11) {
        int i12;
        if (c7272n != null && !this.f43780o) {
            this.f43780o = true;
            try {
                i12 = e(c7272n) & 7;
            } catch (C5449k unused) {
            } finally {
                this.f43780o = false;
            }
            return C5449k.d(exc, getName(), this.f43770e, c7272n, i12, this.f43782q, z11, i11);
        }
        i12 = 4;
        return C5449k.d(exc, getName(), this.f43770e, c7272n, i12, this.f43782q, z11, i11);
    }

    protected final InterfaceC8064f F() {
        C8053F c8053f = this.f43772g;
        c8053f.getClass();
        return c8053f;
    }

    protected final C9734F G() {
        C9734F c9734f = this.f43769d;
        c9734f.getClass();
        return c9734f;
    }

    protected final C9730B H() {
        C9730B c9730b = this.f43768c;
        c9730b.f98979a = null;
        c9730b.f98980b = null;
        return c9730b;
    }

    protected final long I() {
        return this.f43777l;
    }

    protected final u3.P J() {
        u3.P p11 = this.f43771f;
        p11.getClass();
        return p11;
    }

    protected final C7272n[] K() {
        C7272n[] c7272nArr = this.f43775j;
        c7272nArr.getClass();
        return c7272nArr;
    }

    protected final long L() {
        return this.f43776k;
    }

    protected final AbstractC7252H M() {
        return this.f43781p;
    }

    protected final boolean N() {
        if (f()) {
            return this.f43779n;
        }
        F3.U u11 = this.f43774i;
        u11.getClass();
        return u11.isReady();
    }

    protected abstract void O();

    protected void P(boolean z11, boolean z12) throws C5449k {
    }

    protected abstract void Q(long j11, boolean z11) throws C5449k;

    protected void R() {
    }

    protected final void S() {
        k0.a aVar;
        synchronized (this.f43766a) {
            aVar = this.f43783r;
        }
        if (aVar != null) {
            ((I3.n) aVar).u(this);
        }
    }

    protected void T() {
    }

    protected void U() throws C5449k {
    }

    protected void V() {
    }

    protected void W(C7272n[] c7272nArr, long j11, long j12, InterfaceC3018x.b bVar) throws C5449k {
    }

    protected final int X(C9730B c9730b, s3.f fVar, int i11) {
        F3.U u11 = this.f43774i;
        u11.getClass();
        int readData = u11.readData(c9730b, fVar, i11);
        if (readData == -4) {
            if (fVar.i()) {
                this.f43778m = Long.MIN_VALUE;
                return this.f43779n ? -4 : -3;
            }
            long j11 = fVar.f98186f + this.f43776k;
            fVar.f98186f = j11;
            this.f43778m = Math.max(this.f43778m, j11);
            return readData;
        }
        if (readData == -5) {
            C7272n c7272n = c9730b.f98980b;
            c7272n.getClass();
            long j12 = c7272n.f69132t;
            if (j12 != Long.MAX_VALUE) {
                C7272n.a a11 = c7272n.a();
                a11.C0(j12 + this.f43776k);
                c9730b.f98980b = a11.P();
            }
        }
        return readData;
    }

    public final void Y(k0.a aVar) {
        synchronized (this.f43766a) {
            this.f43783r = aVar;
        }
    }

    protected final int Z(long j11) {
        F3.U u11 = this.f43774i;
        u11.getClass();
        return u11.skipData(j11 - this.f43776k);
    }

    @Override // androidx.media3.exoplayer.j0
    public boolean a() {
        return f();
    }

    @Override // androidx.media3.exoplayer.j0
    public final void disable() {
        G10.a.h(this.f43773h == 1);
        C9730B c9730b = this.f43768c;
        c9730b.f98979a = null;
        c9730b.f98980b = null;
        this.f43773h = 0;
        this.f43774i = null;
        this.f43775j = null;
        this.f43779n = false;
        O();
        this.f43782q = null;
    }

    @Override // androidx.media3.exoplayer.j0
    public final boolean f() {
        return this.f43778m == Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.j0
    public final int getState() {
        return this.f43773h;
    }

    @Override // androidx.media3.exoplayer.j0
    public final void h(C7272n[] c7272nArr, F3.U u11, long j11, long j12, InterfaceC3018x.b bVar) throws C5449k {
        G10.a.h(!this.f43779n);
        this.f43774i = u11;
        this.f43782q = bVar;
        if (this.f43778m == Long.MIN_VALUE) {
            this.f43778m = j11;
        }
        this.f43775j = c7272nArr;
        this.f43776k = j12;
        W(c7272nArr, j11, j12, bVar);
    }

    @Override // androidx.media3.exoplayer.h0.b
    public void j(int i11, Object obj) throws C5449k {
    }

    @Override // androidx.media3.exoplayer.j0
    public final boolean k() {
        return this.f43779n;
    }

    @Override // androidx.media3.exoplayer.j0
    public final void l(C9734F c9734f, C7272n[] c7272nArr, F3.U u11, boolean z11, boolean z12, long j11, long j12, InterfaceC3018x.b bVar) throws C5449k {
        G10.a.h(this.f43773h == 0);
        this.f43769d = c9734f;
        this.f43782q = bVar;
        this.f43773h = 1;
        P(z11, z12);
        h(c7272nArr, u11, j11, j12, bVar);
        this.f43779n = false;
        this.f43777l = j11;
        this.f43778m = j11;
        Q(j11, z11);
    }

    @Override // androidx.media3.exoplayer.j0
    public final void m(AbstractC7252H abstractC7252H) {
        if (Objects.equals(this.f43781p, abstractC7252H)) {
            return;
        }
        this.f43781p = abstractC7252H;
    }

    @Override // androidx.media3.exoplayer.j0
    public final F3.U n() {
        return this.f43774i;
    }

    @Override // androidx.media3.exoplayer.j0
    public final long o() {
        return this.f43778m;
    }

    @Override // androidx.media3.exoplayer.j0
    public final void p(long j11) throws C5449k {
        this.f43779n = false;
        this.f43777l = j11;
        this.f43778m = j11;
        Q(j11, false);
    }

    @Override // androidx.media3.exoplayer.j0
    public InterfaceC9731C q() {
        return null;
    }

    @Override // androidx.media3.exoplayer.j0
    public final void release() {
        G10.a.h(this.f43773h == 0);
        R();
    }

    @Override // androidx.media3.exoplayer.j0
    public final void reset() {
        G10.a.h(this.f43773h == 0);
        C9730B c9730b = this.f43768c;
        c9730b.f98979a = null;
        c9730b.f98980b = null;
        T();
    }

    @Override // androidx.media3.exoplayer.j0
    public final void start() throws C5449k {
        G10.a.h(this.f43773h == 1);
        this.f43773h = 2;
        U();
    }

    @Override // androidx.media3.exoplayer.j0
    public final void stop() {
        G10.a.h(this.f43773h == 2);
        this.f43773h = 1;
        V();
    }

    @Override // androidx.media3.exoplayer.j0
    public final void t() {
        this.f43779n = true;
    }

    @Override // androidx.media3.exoplayer.j0
    public final void u() throws IOException {
        F3.U u11 = this.f43774i;
        u11.getClass();
        u11.maybeThrowError();
    }

    @Override // androidx.media3.exoplayer.j0
    public final int v() {
        return this.f43767b;
    }

    @Override // androidx.media3.exoplayer.j0
    public final void x(int i11, u3.P p11, C8053F c8053f) {
        this.f43770e = i11;
        this.f43771f = p11;
        this.f43772g = c8053f;
    }

    @Override // androidx.media3.exoplayer.j0
    public final AbstractC5444f y() {
        return this;
    }
}
