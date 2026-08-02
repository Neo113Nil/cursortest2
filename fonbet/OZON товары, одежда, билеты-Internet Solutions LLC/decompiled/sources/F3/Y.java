package F3;

import F3.F;
import F3.InterfaceC3017w;
import J3.i;
import J3.j;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import j3.C7253I;
import j3.C7272n;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import p3.InterfaceC8846f;
import t3.C9730B;

/* loaded from: classes8.dex */
final class Y implements InterfaceC3017w, j.a<b> {

    /* renamed from: a, reason: collision with root package name */
    private final p3.i f8590a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8846f.a f8591b;

    /* renamed from: c, reason: collision with root package name */
    private final p3.z f8592c;

    /* renamed from: d, reason: collision with root package name */
    private final J3.i f8593d;

    /* renamed from: e, reason: collision with root package name */
    private final F.a f8594e;

    /* renamed from: f, reason: collision with root package name */
    private final d0 f8595f;

    /* renamed from: g, reason: collision with root package name */
    private final ArrayList<a> f8596g = new ArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    private final long f8597h;

    /* renamed from: i, reason: collision with root package name */
    final J3.j f8598i;

    /* renamed from: j, reason: collision with root package name */
    final C7272n f8599j;

    /* renamed from: k, reason: collision with root package name */
    final boolean f8600k;

    /* renamed from: l, reason: collision with root package name */
    boolean f8601l;

    /* renamed from: m, reason: collision with root package name */
    byte[] f8602m;

    /* renamed from: n, reason: collision with root package name */
    int f8603n;

    private final class a implements U {

        /* renamed from: a, reason: collision with root package name */
        private int f8604a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f8605b;

        a() {
        }

        private void a() {
            if (this.f8605b) {
                return;
            }
            Y y11 = Y.this;
            y11.f8594e.c(j3.u.h(y11.f8599j.f69127o), y11.f8599j, 0, null, 0L);
            this.f8605b = true;
        }

        public final void b() {
            if (this.f8604a == 2) {
                this.f8604a = 1;
            }
        }

        @Override // F3.U
        public final boolean isReady() {
            return Y.this.f8601l;
        }

        @Override // F3.U
        public final void maybeThrowError() throws IOException {
            Y y11 = Y.this;
            if (y11.f8600k) {
                return;
            }
            y11.f8598i.j(LinearLayoutManager.INVALID_OFFSET);
        }

        @Override // F3.U
        public final int readData(C9730B c9730b, s3.f fVar, int i11) {
            a();
            Y y11 = Y.this;
            boolean z11 = y11.f8601l;
            if (z11 && y11.f8602m == null) {
                this.f8604a = 2;
            }
            int i12 = this.f8604a;
            if (i12 == 2) {
                fVar.e(4);
                return -4;
            }
            if ((i11 & 2) != 0 || i12 == 0) {
                c9730b.f98980b = y11.f8599j;
                this.f8604a = 1;
                return -5;
            }
            if (!z11) {
                return -3;
            }
            y11.f8602m.getClass();
            fVar.e(1);
            fVar.f98186f = 0L;
            if ((i11 & 4) == 0) {
                fVar.o(y11.f8603n);
                fVar.f98184d.put(y11.f8602m, 0, y11.f8603n);
            }
            if ((i11 & 1) == 0) {
                this.f8604a = 2;
            }
            return -4;
        }

        @Override // F3.U
        public final int skipData(long j11) {
            a();
            if (j11 <= 0 || this.f8604a == 2) {
                return 0;
            }
            this.f8604a = 2;
            return 1;
        }
    }

    static final class b implements j.d {

        /* renamed from: a, reason: collision with root package name */
        public final p3.i f8607a;

        /* renamed from: b, reason: collision with root package name */
        private final p3.x f8608b;

        /* renamed from: c, reason: collision with root package name */
        private byte[] f8609c;

        public b(InterfaceC8846f interfaceC8846f, p3.i iVar) {
            C3013s.a();
            this.f8607a = iVar;
            this.f8608b = new p3.x(interfaceC8846f);
        }

        @Override // J3.j.d
        public final void cancelLoad() {
        }

        @Override // J3.j.d
        public final void load() throws IOException {
            p3.x xVar = this.f8608b;
            xVar.l();
            try {
                xVar.open(this.f8607a);
                int i11 = 0;
                while (i11 != -1) {
                    int i12 = (int) xVar.i();
                    byte[] bArr = this.f8609c;
                    if (bArr == null) {
                        this.f8609c = new byte[UserVerificationMethods.USER_VERIFY_ALL];
                    } else if (i12 == bArr.length) {
                        this.f8609c = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    byte[] bArr2 = this.f8609c;
                    i11 = xVar.read(bArr2, i12, bArr2.length - i12);
                }
                Hj0.T.b(xVar);
            } catch (Throwable th2) {
                Hj0.T.b(xVar);
                throw th2;
            }
        }
    }

    public Y(p3.i iVar, InterfaceC8846f.a aVar, p3.z zVar, C7272n c7272n, long j11, J3.i iVar2, F.a aVar2, boolean z11, K3.b bVar) {
        this.f8590a = iVar;
        this.f8591b = aVar;
        this.f8592c = zVar;
        this.f8599j = c7272n;
        this.f8597h = j11;
        this.f8593d = iVar2;
        this.f8594e = aVar2;
        this.f8600k = z11;
        this.f8595f = new d0(new C7253I("", c7272n));
        this.f8598i = bVar != null ? new J3.j(bVar) : new J3.j("SingleSampleMediaPeriod");
    }

    @Override // F3.V
    public final boolean continueLoading(androidx.media3.exoplayer.M m11) {
        if (this.f8601l) {
            return false;
        }
        J3.j jVar = this.f8598i;
        if (jVar.i() || jVar.h()) {
            return false;
        }
        InterfaceC8846f createDataSource = this.f8591b.createDataSource();
        p3.z zVar = this.f8592c;
        if (zVar != null) {
            createDataSource.addTransferListener(zVar);
        }
        jVar.l(new b(createDataSource, this.f8590a), this, this.f8593d.b(1));
        return true;
    }

    @Override // F3.InterfaceC3017w
    public final void discardBuffer(long j11, boolean z11) {
    }

    @Override // F3.InterfaceC3017w
    public final long getAdjustedSeekPositionUs(long j11, t3.I i11) {
        return j11;
    }

    @Override // F3.V
    public final long getBufferedPositionUs() {
        return this.f8601l ? Long.MIN_VALUE : 0L;
    }

    @Override // F3.V
    public final long getNextLoadPositionUs() {
        return (this.f8601l || this.f8598i.i()) ? Long.MIN_VALUE : 0L;
    }

    @Override // F3.InterfaceC3017w
    public final d0 getTrackGroups() {
        return this.f8595f;
    }

    @Override // F3.V
    public final boolean isLoading() {
        return this.f8598i.i();
    }

    @Override // F3.InterfaceC3017w
    public final void maybeThrowPrepareError() {
    }

    @Override // J3.j.a
    public final void onLoadCanceled(b bVar, long j11, long j12, boolean z11) {
        b bVar2 = bVar;
        p3.x xVar = bVar2.f8608b;
        xVar.getClass();
        C3013s c3013s = new C3013s(bVar2.f8607a, xVar.k(), j12);
        this.f8593d.getClass();
        this.f8594e.d(c3013s, 1, -1, null, 0, null, 0L, this.f8597h);
    }

    @Override // J3.j.a
    public final void onLoadCompleted(b bVar, long j11, long j12) {
        b bVar2 = bVar;
        this.f8603n = (int) bVar2.f8608b.i();
        byte[] bArr = bVar2.f8609c;
        bArr.getClass();
        this.f8602m = bArr;
        this.f8601l = true;
        p3.x xVar = bVar2.f8608b;
        xVar.getClass();
        C3013s c3013s = new C3013s(bVar2.f8607a, xVar.k(), j12);
        this.f8593d.getClass();
        this.f8594e.e(c3013s, 1, -1, this.f8599j, 0, null, 0L, this.f8597h);
    }

    @Override // J3.j.a
    public final j.b onLoadError(b bVar, long j11, long j12, IOException iOException, int i11) {
        j.b g10;
        b bVar2 = bVar;
        p3.x xVar = bVar2.f8608b;
        xVar.getClass();
        C3013s c3013s = new C3013s(bVar2.f8607a, xVar.k(), j12);
        m3.N.g0(this.f8597h);
        i.c cVar = new i.c(i11, iOException);
        J3.i iVar = this.f8593d;
        long a11 = iVar.a(cVar);
        boolean z11 = a11 == -9223372036854775807L || i11 >= iVar.b(1);
        if (this.f8600k && z11) {
            m3.s.g("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.f8601l = true;
            g10 = J3.j.f13799e;
        } else {
            g10 = a11 != -9223372036854775807L ? J3.j.g(a11, false) : J3.j.f13800f;
        }
        this.f8594e.f(c3013s, 1, -1, this.f8599j, 0, null, 0L, this.f8597h, iOException, !g10.c());
        return g10;
    }

    @Override // J3.j.a
    public final void onLoadStarted(b bVar, long j11, long j12, int i11) {
        C3013s c3013s;
        b bVar2 = bVar;
        p3.x xVar = bVar2.f8608b;
        p3.i iVar = bVar2.f8607a;
        if (i11 == 0) {
            c3013s = new C3013s(iVar);
        } else {
            xVar.getClass();
            c3013s = new C3013s(iVar, xVar.k(), j12);
        }
        this.f8594e.g(c3013s, 1, -1, this.f8599j, 0, null, 0L, this.f8597h, i11);
    }

    @Override // F3.InterfaceC3017w
    public final void prepare(InterfaceC3017w.a aVar, long j11) {
        aVar.e(this);
    }

    @Override // F3.InterfaceC3017w
    public final long readDiscontinuity() {
        return -9223372036854775807L;
    }

    @Override // F3.V
    public final void reevaluateBuffer(long j11) {
    }

    @Override // F3.InterfaceC3017w
    public final long seekToUs(long j11) {
        int i11 = 0;
        while (true) {
            ArrayList<a> arrayList = this.f8596g;
            if (i11 >= arrayList.size()) {
                return j11;
            }
            arrayList.get(i11).b();
            i11++;
        }
    }

    @Override // F3.InterfaceC3017w
    public final long selectTracks(I3.y[] yVarArr, boolean[] zArr, U[] uArr, boolean[] zArr2, long j11) {
        for (int i11 = 0; i11 < yVarArr.length; i11++) {
            U u11 = uArr[i11];
            ArrayList<a> arrayList = this.f8596g;
            if (u11 != null && (yVarArr[i11] == null || !zArr[i11])) {
                arrayList.remove(u11);
                uArr[i11] = null;
            }
            if (uArr[i11] == null && yVarArr[i11] != null) {
                a aVar = new a();
                arrayList.add(aVar);
                uArr[i11] = aVar;
                zArr2[i11] = true;
            }
        }
        return j11;
    }
}
