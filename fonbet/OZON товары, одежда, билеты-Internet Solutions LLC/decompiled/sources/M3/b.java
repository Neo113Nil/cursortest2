package M3;

import androidx.media3.exoplayer.AbstractC5444f;
import androidx.media3.exoplayer.C5449k;
import androidx.media3.exoplayer.k0;
import j3.C7272n;
import java.nio.ByteBuffer;
import m3.C8050C;
import m3.N;

/* loaded from: classes.dex */
public final class b extends AbstractC5444f {

    /* renamed from: s, reason: collision with root package name */
    private final s3.f f17287s;

    /* renamed from: t, reason: collision with root package name */
    private final C8050C f17288t;

    /* renamed from: u, reason: collision with root package name */
    private a f17289u;

    /* renamed from: v, reason: collision with root package name */
    private long f17290v;

    public b() {
        super(6);
        this.f17287s = new s3.f(1);
        this.f17288t = new C8050C();
    }

    @Override // androidx.media3.exoplayer.AbstractC5444f
    protected final void O() {
        a aVar = this.f17289u;
        if (aVar != null) {
            aVar.e();
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC5444f
    protected final void Q(long j11, boolean z11) {
        this.f17290v = Long.MIN_VALUE;
        a aVar = this.f17289u;
        if (aVar != null) {
            aVar.e();
        }
    }

    @Override // androidx.media3.exoplayer.j0
    public final void c(long j11, long j12) {
        float[] fArr;
        while (!f() && this.f17290v < 100000 + j11) {
            s3.f fVar = this.f17287s;
            fVar.f();
            if (X(H(), fVar, 0) != -4 || fVar.i()) {
                return;
            }
            long j13 = fVar.f98186f;
            this.f17290v = j13;
            boolean z11 = j13 < I();
            if (this.f17289u != null && !z11) {
                fVar.p();
                ByteBuffer byteBuffer = fVar.f98184d;
                int i11 = N.f74289a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] array = byteBuffer.array();
                    int limit = byteBuffer.limit();
                    C8050C c8050c = this.f17288t;
                    c8050c.P(limit, array);
                    c8050c.R(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i12 = 0; i12 < 3; i12++) {
                        fArr2[i12] = Float.intBitsToFloat(c8050c.s());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.f17289u.d(this.f17290v - L(), fArr);
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.k0
    public final int e(C7272n c7272n) {
        return "application/x-camera-motion".equals(c7272n.f69127o) ? k0.g(4, 0, 0, 0) : k0.g(0, 0, 0, 0);
    }

    @Override // androidx.media3.exoplayer.j0, androidx.media3.exoplayer.k0
    public final String getName() {
        return "CameraMotionRenderer";
    }

    @Override // androidx.media3.exoplayer.j0
    public final boolean isReady() {
        return true;
    }

    @Override // androidx.media3.exoplayer.AbstractC5444f, androidx.media3.exoplayer.h0.b
    public final void j(int i11, Object obj) throws C5449k {
        if (i11 == 8) {
            this.f17289u = (a) obj;
        }
    }
}
