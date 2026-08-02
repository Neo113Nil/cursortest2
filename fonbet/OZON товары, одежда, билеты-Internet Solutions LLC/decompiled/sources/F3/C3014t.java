package F3;

import F3.InterfaceC3017w;
import F3.InterfaceC3018x;
import java.io.IOException;

/* renamed from: F3.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3014t implements InterfaceC3017w, InterfaceC3017w.a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3018x.b f8724a;

    /* renamed from: b, reason: collision with root package name */
    private final long f8725b;

    /* renamed from: c, reason: collision with root package name */
    private final J3.b f8726c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC3018x f8727d;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC3017w f8728e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC3017w.a f8729f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f8730g;

    /* renamed from: h, reason: collision with root package name */
    private long f8731h = -9223372036854775807L;

    /* renamed from: F3.t$a */
    /* loaded from: classes8.dex */
    public interface a {
        void a(InterfaceC3018x.b bVar);

        void b();
    }

    public C3014t(InterfaceC3018x.b bVar, J3.b bVar2, long j11) {
        this.f8724a = bVar;
        this.f8726c = bVar2;
        this.f8725b = j11;
    }

    public final void a(InterfaceC3018x.b bVar) {
        long j11 = this.f8731h;
        if (j11 == -9223372036854775807L) {
            j11 = this.f8725b;
        }
        InterfaceC3018x interfaceC3018x = this.f8727d;
        interfaceC3018x.getClass();
        InterfaceC3017w createPeriod = interfaceC3018x.createPeriod(bVar, this.f8726c, j11);
        this.f8728e = createPeriod;
        if (this.f8729f != null) {
            createPeriod.prepare(this, j11);
        }
    }

    public final long b() {
        return this.f8731h;
    }

    @Override // F3.V.a
    public final void c(InterfaceC3017w interfaceC3017w) {
        InterfaceC3017w.a aVar = this.f8729f;
        int i11 = m3.N.f74289a;
        aVar.c(this);
    }

    @Override // F3.V
    public final boolean continueLoading(androidx.media3.exoplayer.M m11) {
        InterfaceC3017w interfaceC3017w = this.f8728e;
        return interfaceC3017w != null && interfaceC3017w.continueLoading(m11);
    }

    @Override // F3.InterfaceC3017w
    public final void discardBuffer(long j11, boolean z11) {
        InterfaceC3017w interfaceC3017w = this.f8728e;
        int i11 = m3.N.f74289a;
        interfaceC3017w.discardBuffer(j11, z11);
    }

    @Override // F3.InterfaceC3017w.a
    public final void e(InterfaceC3017w interfaceC3017w) {
        InterfaceC3017w.a aVar = this.f8729f;
        int i11 = m3.N.f74289a;
        aVar.e(this);
    }

    public final long f() {
        return this.f8725b;
    }

    public final void g(long j11) {
        this.f8731h = j11;
    }

    @Override // F3.InterfaceC3017w
    public final long getAdjustedSeekPositionUs(long j11, t3.I i11) {
        InterfaceC3017w interfaceC3017w = this.f8728e;
        int i12 = m3.N.f74289a;
        return interfaceC3017w.getAdjustedSeekPositionUs(j11, i11);
    }

    @Override // F3.V
    public final long getBufferedPositionUs() {
        InterfaceC3017w interfaceC3017w = this.f8728e;
        int i11 = m3.N.f74289a;
        return interfaceC3017w.getBufferedPositionUs();
    }

    @Override // F3.V
    public final long getNextLoadPositionUs() {
        InterfaceC3017w interfaceC3017w = this.f8728e;
        int i11 = m3.N.f74289a;
        return interfaceC3017w.getNextLoadPositionUs();
    }

    @Override // F3.InterfaceC3017w
    public final d0 getTrackGroups() {
        InterfaceC3017w interfaceC3017w = this.f8728e;
        int i11 = m3.N.f74289a;
        return interfaceC3017w.getTrackGroups();
    }

    public final void h() {
        if (this.f8728e != null) {
            InterfaceC3018x interfaceC3018x = this.f8727d;
            interfaceC3018x.getClass();
            interfaceC3018x.releasePeriod(this.f8728e);
        }
    }

    public final void i(InterfaceC3018x interfaceC3018x) {
        G10.a.h(this.f8727d == null);
        this.f8727d = interfaceC3018x;
    }

    @Override // F3.V
    public final boolean isLoading() {
        InterfaceC3017w interfaceC3017w = this.f8728e;
        return interfaceC3017w != null && interfaceC3017w.isLoading();
    }

    @Override // F3.InterfaceC3017w
    public final void maybeThrowPrepareError() throws IOException {
        try {
            InterfaceC3017w interfaceC3017w = this.f8728e;
            if (interfaceC3017w != null) {
                interfaceC3017w.maybeThrowPrepareError();
                return;
            }
            InterfaceC3018x interfaceC3018x = this.f8727d;
            if (interfaceC3018x != null) {
                interfaceC3018x.maybeThrowSourceInfoRefreshError();
            }
        } catch (IOException e11) {
            throw e11;
        }
    }

    @Override // F3.InterfaceC3017w
    public final void prepare(InterfaceC3017w.a aVar, long j11) {
        this.f8729f = aVar;
        InterfaceC3017w interfaceC3017w = this.f8728e;
        if (interfaceC3017w != null) {
            long j12 = this.f8731h;
            if (j12 == -9223372036854775807L) {
                j12 = this.f8725b;
            }
            interfaceC3017w.prepare(this, j12);
        }
    }

    @Override // F3.InterfaceC3017w
    public final long readDiscontinuity() {
        InterfaceC3017w interfaceC3017w = this.f8728e;
        int i11 = m3.N.f74289a;
        return interfaceC3017w.readDiscontinuity();
    }

    @Override // F3.V
    public final void reevaluateBuffer(long j11) {
        InterfaceC3017w interfaceC3017w = this.f8728e;
        int i11 = m3.N.f74289a;
        interfaceC3017w.reevaluateBuffer(j11);
    }

    @Override // F3.InterfaceC3017w
    public final long seekToUs(long j11) {
        InterfaceC3017w interfaceC3017w = this.f8728e;
        int i11 = m3.N.f74289a;
        return interfaceC3017w.seekToUs(j11);
    }

    @Override // F3.InterfaceC3017w
    public final long selectTracks(I3.y[] yVarArr, boolean[] zArr, U[] uArr, boolean[] zArr2, long j11) {
        long j12 = this.f8731h;
        long j13 = (j12 == -9223372036854775807L || j11 != this.f8725b) ? j11 : j12;
        this.f8731h = -9223372036854775807L;
        InterfaceC3017w interfaceC3017w = this.f8728e;
        int i11 = m3.N.f74289a;
        return interfaceC3017w.selectTracks(yVarArr, zArr, uArr, zArr2, j13);
    }
}
