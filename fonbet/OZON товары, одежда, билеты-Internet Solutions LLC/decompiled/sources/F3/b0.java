package F3;

import F3.InterfaceC3017w;
import androidx.media3.exoplayer.M;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import t3.C9730B;

/* loaded from: classes8.dex */
final class b0 implements InterfaceC3017w, InterfaceC3017w.a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3017w f8624a;

    /* renamed from: b, reason: collision with root package name */
    private final long f8625b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC3017w.a f8626c;

    private static final class a implements U {

        /* renamed from: a, reason: collision with root package name */
        private final U f8627a;

        /* renamed from: b, reason: collision with root package name */
        private final long f8628b;

        public a(U u11, long j11) {
            this.f8627a = u11;
            this.f8628b = j11;
        }

        public final U a() {
            return this.f8627a;
        }

        @Override // F3.U
        public final boolean isReady() {
            return this.f8627a.isReady();
        }

        @Override // F3.U
        public final void maybeThrowError() throws IOException {
            this.f8627a.maybeThrowError();
        }

        @Override // F3.U
        public final int readData(C9730B c9730b, s3.f fVar, int i11) {
            int readData = this.f8627a.readData(c9730b, fVar, i11);
            if (readData == -4) {
                fVar.f98186f += this.f8628b;
            }
            return readData;
        }

        @Override // F3.U
        public final int skipData(long j11) {
            return this.f8627a.skipData(j11 - this.f8628b);
        }
    }

    public b0(InterfaceC3017w interfaceC3017w, long j11) {
        this.f8624a = interfaceC3017w;
        this.f8625b = j11;
    }

    public final InterfaceC3017w a() {
        return this.f8624a;
    }

    @Override // F3.V.a
    public final void c(InterfaceC3017w interfaceC3017w) {
        InterfaceC3017w.a aVar = this.f8626c;
        aVar.getClass();
        aVar.c(this);
    }

    @Override // F3.V
    public final boolean continueLoading(androidx.media3.exoplayer.M m11) {
        M.a a11 = m11.a();
        a11.f(m11.f43657a - this.f8625b);
        return this.f8624a.continueLoading(a11.d());
    }

    @Override // F3.InterfaceC3017w
    public final List d(ArrayList arrayList) {
        return this.f8624a.d(arrayList);
    }

    @Override // F3.InterfaceC3017w
    public final void discardBuffer(long j11, boolean z11) {
        this.f8624a.discardBuffer(j11 - this.f8625b, z11);
    }

    @Override // F3.InterfaceC3017w.a
    public final void e(InterfaceC3017w interfaceC3017w) {
        InterfaceC3017w.a aVar = this.f8626c;
        aVar.getClass();
        aVar.e(this);
    }

    @Override // F3.InterfaceC3017w
    public final long getAdjustedSeekPositionUs(long j11, t3.I i11) {
        long j12 = this.f8625b;
        return this.f8624a.getAdjustedSeekPositionUs(j11 - j12, i11) + j12;
    }

    @Override // F3.V
    public final long getBufferedPositionUs() {
        long bufferedPositionUs = this.f8624a.getBufferedPositionUs();
        if (bufferedPositionUs == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return bufferedPositionUs + this.f8625b;
    }

    @Override // F3.V
    public final long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.f8624a.getNextLoadPositionUs();
        if (nextLoadPositionUs == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return nextLoadPositionUs + this.f8625b;
    }

    @Override // F3.InterfaceC3017w
    public final d0 getTrackGroups() {
        return this.f8624a.getTrackGroups();
    }

    @Override // F3.V
    public final boolean isLoading() {
        return this.f8624a.isLoading();
    }

    @Override // F3.InterfaceC3017w
    public final void maybeThrowPrepareError() throws IOException {
        this.f8624a.maybeThrowPrepareError();
    }

    @Override // F3.InterfaceC3017w
    public final void prepare(InterfaceC3017w.a aVar, long j11) {
        this.f8626c = aVar;
        this.f8624a.prepare(this, j11 - this.f8625b);
    }

    @Override // F3.InterfaceC3017w
    public final long readDiscontinuity() {
        long readDiscontinuity = this.f8624a.readDiscontinuity();
        if (readDiscontinuity == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return readDiscontinuity + this.f8625b;
    }

    @Override // F3.V
    public final void reevaluateBuffer(long j11) {
        this.f8624a.reevaluateBuffer(j11 - this.f8625b);
    }

    @Override // F3.InterfaceC3017w
    public final long seekToUs(long j11) {
        long j12 = this.f8625b;
        return this.f8624a.seekToUs(j11 - j12) + j12;
    }

    @Override // F3.InterfaceC3017w
    public final long selectTracks(I3.y[] yVarArr, boolean[] zArr, U[] uArr, boolean[] zArr2, long j11) {
        U[] uArr2 = new U[uArr.length];
        int i11 = 0;
        while (true) {
            U u11 = null;
            if (i11 >= uArr.length) {
                break;
            }
            a aVar = (a) uArr[i11];
            if (aVar != null) {
                u11 = aVar.a();
            }
            uArr2[i11] = u11;
            i11++;
        }
        long j12 = this.f8625b;
        long selectTracks = this.f8624a.selectTracks(yVarArr, zArr, uArr2, zArr2, j11 - j12);
        for (int i12 = 0; i12 < uArr.length; i12++) {
            U u12 = uArr2[i12];
            if (u12 == null) {
                uArr[i12] = null;
            } else {
                U u13 = uArr[i12];
                if (u13 == null || ((a) u13).a() != u12) {
                    uArr[i12] = new a(u12, j12);
                }
            }
        }
        return selectTracks + j12;
    }
}
