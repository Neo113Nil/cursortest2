package F3;

import F3.C3000e;
import F3.InterfaceC3017w;
import j3.C7272n;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import t3.C9730B;

/* renamed from: F3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2999d implements InterfaceC3017w, InterfaceC3017w.a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3017w f8633a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC3017w.a f8634b;

    /* renamed from: c, reason: collision with root package name */
    private a[] f8635c = new a[0];

    /* renamed from: d, reason: collision with root package name */
    private long f8636d;

    /* renamed from: e, reason: collision with root package name */
    long f8637e;

    /* renamed from: f, reason: collision with root package name */
    long f8638f;

    /* renamed from: g, reason: collision with root package name */
    private C3000e.c f8639g;

    /* renamed from: F3.d$a */
    /* loaded from: classes8.dex */
    private final class a implements U {

        /* renamed from: a, reason: collision with root package name */
        public final U f8640a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f8641b;

        public a(U u11) {
            this.f8640a = u11;
        }

        public final void a() {
            this.f8641b = false;
        }

        @Override // F3.U
        public final boolean isReady() {
            return !C2999d.this.a() && this.f8640a.isReady();
        }

        @Override // F3.U
        public final void maybeThrowError() throws IOException {
            this.f8640a.maybeThrowError();
        }

        @Override // F3.U
        public final int readData(C9730B c9730b, s3.f fVar, int i11) {
            C2999d c2999d = C2999d.this;
            if (c2999d.a()) {
                return -3;
            }
            if (this.f8641b) {
                fVar.m(4);
                return -4;
            }
            long bufferedPositionUs = c2999d.getBufferedPositionUs();
            int readData = this.f8640a.readData(c9730b, fVar, i11);
            if (readData != -5) {
                long j11 = c2999d.f8638f;
                if (j11 == Long.MIN_VALUE || ((readData != -4 || fVar.f98186f < j11) && !(readData == -3 && bufferedPositionUs == Long.MIN_VALUE && !fVar.f98185e))) {
                    return readData;
                }
                fVar.f();
                fVar.m(4);
                this.f8641b = true;
                return -4;
            }
            C7272n c7272n = c9730b.f98980b;
            c7272n.getClass();
            int i12 = c7272n.f69106K;
            int i13 = c7272n.f69105J;
            if (i13 == 0 && i12 == 0) {
                return -5;
            }
            if (c2999d.f8637e != 0) {
                i13 = 0;
            }
            if (c2999d.f8638f != Long.MIN_VALUE) {
                i12 = 0;
            }
            C7272n.a a11 = c7272n.a();
            a11.d0(i13);
            a11.e0(i12);
            c9730b.f98980b = a11.P();
            return -5;
        }

        @Override // F3.U
        public final int skipData(long j11) {
            if (C2999d.this.a()) {
                return -3;
            }
            return this.f8640a.skipData(j11);
        }
    }

    public C2999d(InterfaceC3017w interfaceC3017w, boolean z11, long j11, long j12) {
        this.f8633a = interfaceC3017w;
        this.f8636d = z11 ? j11 : -9223372036854775807L;
        this.f8637e = j11;
        this.f8638f = j12;
    }

    final boolean a() {
        return this.f8636d != -9223372036854775807L;
    }

    public final void b(C3000e.c cVar) {
        this.f8639g = cVar;
    }

    @Override // F3.V.a
    public final void c(InterfaceC3017w interfaceC3017w) {
        InterfaceC3017w.a aVar = this.f8634b;
        aVar.getClass();
        aVar.c(this);
    }

    @Override // F3.V
    public final boolean continueLoading(androidx.media3.exoplayer.M m11) {
        return this.f8633a.continueLoading(m11);
    }

    @Override // F3.InterfaceC3017w
    public final List d(ArrayList arrayList) {
        return this.f8633a.d(arrayList);
    }

    @Override // F3.InterfaceC3017w
    public final void discardBuffer(long j11, boolean z11) {
        this.f8633a.discardBuffer(j11, z11);
    }

    @Override // F3.InterfaceC3017w.a
    public final void e(InterfaceC3017w interfaceC3017w) {
        if (this.f8639g != null) {
            return;
        }
        InterfaceC3017w.a aVar = this.f8634b;
        aVar.getClass();
        aVar.e(this);
    }

    public final void f(long j11) {
        this.f8637e = 0L;
        this.f8638f = j11;
    }

    @Override // F3.InterfaceC3017w
    public final long getAdjustedSeekPositionUs(long j11, t3.I i11) {
        long j12 = this.f8637e;
        if (j11 == j12) {
            return j12;
        }
        long j13 = m3.N.j(i11.f99000a, 0L, j11 - j12);
        long j14 = this.f8638f;
        long j15 = m3.N.j(i11.f99001b, 0L, j14 == Long.MIN_VALUE ? Long.MAX_VALUE : j14 - j11);
        if (j13 != i11.f99000a || j15 != i11.f99001b) {
            i11 = new t3.I(j13, j15);
        }
        return this.f8633a.getAdjustedSeekPositionUs(j11, i11);
    }

    @Override // F3.V
    public final long getBufferedPositionUs() {
        long bufferedPositionUs = this.f8633a.getBufferedPositionUs();
        if (bufferedPositionUs != Long.MIN_VALUE) {
            long j11 = this.f8638f;
            if (j11 == Long.MIN_VALUE || bufferedPositionUs < j11) {
                return bufferedPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // F3.V
    public final long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.f8633a.getNextLoadPositionUs();
        if (nextLoadPositionUs != Long.MIN_VALUE) {
            long j11 = this.f8638f;
            if (j11 == Long.MIN_VALUE || nextLoadPositionUs < j11) {
                return nextLoadPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // F3.InterfaceC3017w
    public final d0 getTrackGroups() {
        return this.f8633a.getTrackGroups();
    }

    @Override // F3.V
    public final boolean isLoading() {
        return this.f8633a.isLoading();
    }

    @Override // F3.InterfaceC3017w
    public final void maybeThrowPrepareError() throws IOException {
        C3000e.c cVar = this.f8639g;
        if (cVar != null) {
            throw cVar;
        }
        this.f8633a.maybeThrowPrepareError();
    }

    @Override // F3.InterfaceC3017w
    public final void prepare(InterfaceC3017w.a aVar, long j11) {
        this.f8634b = aVar;
        this.f8633a.prepare(this, j11);
    }

    @Override // F3.InterfaceC3017w
    public final long readDiscontinuity() {
        if (a()) {
            long j11 = this.f8636d;
            this.f8636d = -9223372036854775807L;
            long readDiscontinuity = readDiscontinuity();
            return readDiscontinuity != -9223372036854775807L ? readDiscontinuity : j11;
        }
        long readDiscontinuity2 = this.f8633a.readDiscontinuity();
        if (readDiscontinuity2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j12 = this.f8637e;
        long j13 = this.f8638f;
        long max = Math.max(readDiscontinuity2, j12);
        return j13 != Long.MIN_VALUE ? Math.min(max, j13) : max;
    }

    @Override // F3.V
    public final void reevaluateBuffer(long j11) {
        this.f8633a.reevaluateBuffer(j11);
    }

    @Override // F3.InterfaceC3017w
    public final long seekToUs(long j11) {
        this.f8636d = -9223372036854775807L;
        for (a aVar : this.f8635c) {
            if (aVar != null) {
                aVar.a();
            }
        }
        long seekToUs = this.f8633a.seekToUs(j11);
        long j12 = this.f8637e;
        long j13 = this.f8638f;
        long max = Math.max(seekToUs, j12);
        return j13 != Long.MIN_VALUE ? Math.min(max, j13) : max;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0079  */
    @Override // F3.InterfaceC3017w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long selectTracks(I3.y[] yVarArr, boolean[] zArr, U[] uArr, boolean[] zArr2, long j11) {
        long j12;
        int i11;
        this.f8635c = new a[uArr.length];
        U[] uArr2 = new U[uArr.length];
        for (int i12 = 0; i12 < uArr.length; i12++) {
            a[] aVarArr = this.f8635c;
            a aVar = (a) uArr[i12];
            aVarArr[i12] = aVar;
            uArr2[i12] = aVar != null ? aVar.f8640a : null;
        }
        long selectTracks = this.f8633a.selectTracks(yVarArr, zArr, uArr2, zArr2, j11);
        long j13 = this.f8638f;
        long max = Math.max(selectTracks, j11);
        if (j13 != Long.MIN_VALUE) {
            max = Math.min(max, j13);
        }
        if (a()) {
            if (selectTracks >= j11) {
                if (selectTracks != 0) {
                    for (I3.y yVar : yVarArr) {
                        if (yVar != null) {
                            C7272n j14 = yVar.j();
                            if (!j3.u.a(j14.f69127o, j14.f69123k)) {
                            }
                        }
                    }
                }
            }
            j12 = max;
            this.f8636d = j12;
            for (i11 = 0; i11 < uArr.length; i11++) {
                U u11 = uArr2[i11];
                if (u11 == null) {
                    this.f8635c[i11] = null;
                } else {
                    a[] aVarArr2 = this.f8635c;
                    a aVar2 = aVarArr2[i11];
                    if (aVar2 == null || aVar2.f8640a != u11) {
                        aVarArr2[i11] = new a(u11);
                    }
                }
                uArr[i11] = this.f8635c[i11];
            }
            return max;
        }
        j12 = -9223372036854775807L;
        this.f8636d = j12;
        while (i11 < uArr.length) {
        }
        return max;
    }
}
