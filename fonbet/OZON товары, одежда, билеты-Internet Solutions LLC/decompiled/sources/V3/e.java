package V3;

import N3.A;
import N3.H;
import N3.I;
import N3.M;
import N3.r;

/* loaded from: classes8.dex */
public final class e implements r {

    /* renamed from: a, reason: collision with root package name */
    private final long f27976a;

    /* renamed from: b, reason: collision with root package name */
    private final r f27977b;

    final class a extends A {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ H f27978a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(H h11, H h12) {
            super(h11);
            this.f27978a = h12;
        }

        @Override // N3.A, N3.H
        public final H.a getSeekPoints(long j11) {
            H.a seekPoints = this.f27978a.getSeekPoints(j11);
            I i11 = seekPoints.f18502a;
            long j12 = i11.f18507a;
            e eVar = e.this;
            I i12 = new I(j12, i11.f18508b + eVar.f27976a);
            I i13 = seekPoints.f18503b;
            return new H.a(i12, new I(i13.f18507a, i13.f18508b + eVar.f27976a));
        }
    }

    public e(long j11, r rVar) {
        this.f27976a = j11;
        this.f27977b = rVar;
    }

    @Override // N3.r
    public final void endTracks() {
        this.f27977b.endTracks();
    }

    @Override // N3.r
    public final void seekMap(H h11) {
        this.f27977b.seekMap(new a(h11, h11));
    }

    @Override // N3.r
    public final M track(int i11, int i12) {
        return this.f27977b.track(i11, i12);
    }
}
