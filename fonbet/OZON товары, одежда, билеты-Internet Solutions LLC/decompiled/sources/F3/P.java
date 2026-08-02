package F3;

import F3.F;
import F3.InterfaceC3018x;
import android.os.Looper;
import j3.AbstractC7252H;
import j3.C7272n;
import j3.C7275q;
import p3.InterfaceC8846f;
import w3.i;

/* loaded from: classes8.dex */
public final class P extends AbstractC2996a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8846f.a f8505a;

    /* renamed from: b, reason: collision with root package name */
    private final DL.a f8506b;

    /* renamed from: c, reason: collision with root package name */
    private final w3.j f8507c;

    /* renamed from: d, reason: collision with root package name */
    private final J3.h f8508d;

    /* renamed from: e, reason: collision with root package name */
    private final int f8509e;

    /* renamed from: f, reason: collision with root package name */
    private final C7272n f8510f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f8511g;

    /* renamed from: h, reason: collision with root package name */
    private long f8512h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f8513i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f8514j;

    /* renamed from: k, reason: collision with root package name */
    private p3.z f8515k;

    /* renamed from: l, reason: collision with root package name */
    private C7275q f8516l;

    /* renamed from: m, reason: collision with root package name */
    private c f8517m;

    final class a extends AbstractC3012q {
        @Override // F3.AbstractC3012q, j3.AbstractC7252H
        public final AbstractC7252H.b getPeriod(int i11, AbstractC7252H.b bVar, boolean z11) {
            super.getPeriod(i11, bVar, z11);
            bVar.f68942f = true;
            return bVar;
        }

        @Override // F3.AbstractC3012q, j3.AbstractC7252H
        public final AbstractC7252H.c getWindow(int i11, AbstractC7252H.c cVar, long j11) {
            super.getWindow(i11, cVar, j11);
            cVar.f68956k = true;
            return cVar;
        }
    }

    public static final class b implements InterfaceC3018x.a {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC8846f.a f8518a;

        /* renamed from: b, reason: collision with root package name */
        private DL.a f8519b;

        /* renamed from: c, reason: collision with root package name */
        private w3.k f8520c;

        /* renamed from: d, reason: collision with root package name */
        private J3.h f8521d;

        /* renamed from: e, reason: collision with root package name */
        private int f8522e;

        /* renamed from: f, reason: collision with root package name */
        private C7272n f8523f;

        public b(InterfaceC8846f.a aVar, N3.u uVar) {
            DL.a aVar2 = new DL.a(uVar, 1);
            w3.f fVar = new w3.f();
            J3.h hVar = new J3.h();
            this.f8518a = aVar;
            this.f8519b = aVar2;
            this.f8520c = fVar;
            this.f8521d = hVar;
            this.f8522e = 1048576;
        }

        @Override // F3.InterfaceC3018x.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final P createMediaSource(C7275q c7275q) {
            c7275q.f69184b.getClass();
            w3.j a11 = this.f8520c.a(c7275q);
            J3.h hVar = this.f8521d;
            C7272n c7272n = this.f8523f;
            return new P(c7275q, this.f8518a, this.f8519b, a11, hVar, this.f8522e, c7272n);
        }

        final void e(C7272n c7272n) {
            this.f8523f = c7272n;
        }

        @Override // F3.InterfaceC3018x.a
        public final InterfaceC3018x.a setDrmSessionManagerProvider(w3.k kVar) {
            G10.a.f(kVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            this.f8520c = kVar;
            return this;
        }
    }

    public interface c {
        void a(N3.H h11);
    }

    private P() {
        throw null;
    }

    P(C7275q c7275q, InterfaceC8846f.a aVar, DL.a aVar2, w3.j jVar, J3.h hVar, int i11, C7272n c7272n) {
        this.f8516l = c7275q;
        this.f8505a = aVar;
        this.f8506b = aVar2;
        this.f8507c = jVar;
        this.f8508d = hVar;
        this.f8509e = i11;
        this.f8510f = c7272n;
        this.f8511g = true;
        this.f8512h = -9223372036854775807L;
    }

    private void notifySourceInfoRefreshed() {
        AbstractC7252H x11 = new X(this.f8512h, this.f8513i, this.f8514j, getMediaItem());
        if (this.f8511g) {
            x11 = new a(x11);
        }
        refreshSourceInfo(x11);
    }

    public final void c() {
        this.f8517m = null;
    }

    @Override // F3.InterfaceC3018x
    public final InterfaceC3017w createPeriod(InterfaceC3018x.b bVar, J3.b bVar2, long j11) {
        InterfaceC8846f createDataSource = this.f8505a.createDataSource();
        p3.z zVar = this.f8515k;
        if (zVar != null) {
            createDataSource.addTransferListener(zVar);
        }
        C7275q.f fVar = getMediaItem().f69184b;
        fVar.getClass();
        J a11 = this.f8506b.a(getPlayerId());
        i.a createDrmEventDispatcher = createDrmEventDispatcher(bVar);
        F.a createEventDispatcher = createEventDispatcher(bVar);
        long Q11 = m3.N.Q(fVar.f69247h);
        return new O(fVar.f69240a, createDataSource, a11, this.f8507c, createDrmEventDispatcher, this.f8508d, createEventDispatcher, this, bVar2, fVar.f69244e, this.f8509e, this.f8510f, Q11, null);
    }

    public final void d(c cVar) {
        this.f8517m = cVar;
    }

    @Override // F3.InterfaceC3018x
    public final synchronized C7275q getMediaItem() {
        return this.f8516l;
    }

    @Override // F3.InterfaceC3018x
    public final void maybeThrowSourceInfoRefreshError() {
    }

    public final void onSourceInfoRefreshed(long j11, N3.H h11, boolean z11) {
        if (j11 == -9223372036854775807L) {
            j11 = this.f8512h;
        }
        boolean isSeekable = h11.isSeekable();
        if (!this.f8511g && this.f8512h == j11 && this.f8513i == isSeekable && this.f8514j == z11) {
            return;
        }
        this.f8512h = j11;
        this.f8513i = isSeekable;
        this.f8514j = z11;
        this.f8511g = false;
        notifySourceInfoRefreshed();
        c cVar = this.f8517m;
        if (cVar != null) {
            cVar.a(h11);
        }
    }

    @Override // F3.AbstractC2996a
    protected final void prepareSourceInternal(p3.z zVar) {
        this.f8515k = zVar;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        u3.P playerId = getPlayerId();
        w3.j jVar = this.f8507c;
        jVar.c(myLooper, playerId);
        jVar.prepare();
        notifySourceInfoRefreshed();
    }

    @Override // F3.InterfaceC3018x
    public final void releasePeriod(InterfaceC3017w interfaceC3017w) {
        ((O) interfaceC3017w).C();
    }

    @Override // F3.AbstractC2996a
    protected final void releaseSourceInternal() {
        this.f8507c.release();
    }

    @Override // F3.InterfaceC3018x
    public final synchronized void updateMediaItem(C7275q c7275q) {
        this.f8516l = c7275q;
    }
}
