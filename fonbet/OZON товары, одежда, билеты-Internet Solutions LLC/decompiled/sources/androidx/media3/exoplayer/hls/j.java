package androidx.media3.exoplayer.hls;

import B0.A0;
import F3.U;
import java.io.IOException;
import t3.C9730B;

/* loaded from: classes8.dex */
final class j implements U {

    /* renamed from: a, reason: collision with root package name */
    private final int f43993a;

    /* renamed from: b, reason: collision with root package name */
    private final o f43994b;

    /* renamed from: c, reason: collision with root package name */
    private int f43995c = -1;

    public j(o oVar, int i11) {
        this.f43994b = oVar;
        this.f43993a = i11;
    }

    private boolean b() {
        int i11 = this.f43995c;
        return (i11 == -1 || i11 == -3 || i11 == -2) ? false : true;
    }

    public final void a() {
        G10.a.c(this.f43995c == -1);
        this.f43995c = this.f43994b.f(this.f43993a);
    }

    public final void c() {
        if (this.f43995c != -1) {
            this.f43994b.I(this.f43993a);
            this.f43995c = -1;
        }
    }

    @Override // F3.U
    public final boolean isReady() {
        if (this.f43995c != -3) {
            return b() && this.f43994b.q(this.f43995c);
        }
        return true;
    }

    @Override // F3.U
    public final void maybeThrowError() throws IOException {
        int i11 = this.f43995c;
        o oVar = this.f43994b;
        if (i11 == -2) {
            throw new x3.e(A0.b("Unable to bind a sample queue to TrackGroup with MIME type ", oVar.getTrackGroups().a(this.f43993a).a(0).f69127o, "."));
        }
        if (i11 == -1) {
            oVar.t();
        } else if (i11 != -3) {
            oVar.u(i11);
        }
    }

    @Override // F3.U
    public final int readData(C9730B c9730b, s3.f fVar, int i11) {
        if (this.f43995c == -3) {
            fVar.e(4);
            return -4;
        }
        if (b()) {
            return this.f43994b.z(this.f43995c, c9730b, fVar, i11);
        }
        return -3;
    }

    @Override // F3.U
    public final int skipData(long j11) {
        if (b()) {
            return this.f43994b.H(this.f43995c, j11);
        }
        return 0;
    }
}
