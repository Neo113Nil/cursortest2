package M3;

import L3.u;
import M3.e;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import j3.C7272n;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import m3.C8055H;
import m3.C8072n;
import m3.s;

/* loaded from: classes8.dex */
final class i implements u, a {

    /* renamed from: i, reason: collision with root package name */
    private int f17335i;

    /* renamed from: j, reason: collision with root package name */
    private SurfaceTexture f17336j;

    /* renamed from: l, reason: collision with root package name */
    private byte[] f17338l;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f17327a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f17328b = new AtomicBoolean(true);

    /* renamed from: c, reason: collision with root package name */
    private final g f17329c = new g();

    /* renamed from: d, reason: collision with root package name */
    private final c f17330d = new c();

    /* renamed from: e, reason: collision with root package name */
    private final C8055H<Long> f17331e = new C8055H<>();

    /* renamed from: f, reason: collision with root package name */
    private final C8055H<e> f17332f = new C8055H<>();

    /* renamed from: g, reason: collision with root package name */
    private final float[] f17333g = new float[16];

    /* renamed from: h, reason: collision with root package name */
    private final float[] f17334h = new float[16];

    /* renamed from: k, reason: collision with root package name */
    private int f17337k = -1;

    @Override // L3.u
    public final void b(long j11, long j12, C7272n c7272n, MediaFormat mediaFormat) {
        this.f17331e.a(j12, Long.valueOf(j11));
        byte[] bArr = c7272n.f69098C;
        byte[] bArr2 = this.f17338l;
        int i11 = this.f17337k;
        this.f17338l = bArr;
        int i12 = c7272n.f69099D;
        if (i12 == -1) {
            i12 = 0;
        }
        this.f17337k = i12;
        if (i11 == i12 && Arrays.equals(bArr2, bArr)) {
            return;
        }
        byte[] bArr3 = this.f17338l;
        e a11 = bArr3 != null ? f.a(this.f17337k, bArr3) : null;
        if (a11 == null || !g.c(a11)) {
            int i13 = this.f17337k;
            float radians = (float) Math.toRadians(180.0f);
            float radians2 = (float) Math.toRadians(360.0f);
            float f7 = radians / 36;
            float f11 = radians2 / 72;
            float[] fArr = new float[15984];
            float[] fArr2 = new float[10656];
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            for (int i17 = 36; i14 < i17; i17 = 36) {
                float f12 = radians / 2.0f;
                float f13 = (i14 * f7) - f12;
                int i18 = i14 + 1;
                float f14 = (i18 * f7) - f12;
                float f15 = radians;
                float f16 = radians2;
                int i19 = 0;
                while (i19 < 73) {
                    float f17 = f13;
                    int i21 = 0;
                    while (i21 < 2) {
                        float f18 = f7;
                        float f19 = i19 * f11;
                        int i22 = i18;
                        float f21 = f14;
                        double d11 = 50.0f;
                        double d12 = (f19 + 3.1415927f) - (f16 / 2.0f);
                        double d13 = i21 == 0 ? f17 : f14;
                        fArr[i15] = -((float) (Math.cos(d13) * Math.sin(d12) * d11));
                        fArr[i15 + 1] = (float) (Math.sin(d13) * d11);
                        int i23 = i15 + 3;
                        fArr[i15 + 2] = (float) (Math.cos(d13) * Math.cos(d12) * d11);
                        fArr2[i16] = f19 / f16;
                        int i24 = i16 + 2;
                        fArr2[i16 + 1] = ((i14 + i21) * f18) / f15;
                        if ((i19 != 0 || i21 != 0) && (i19 != 72 || i21 != 1)) {
                            i15 = i23;
                            i16 = i24;
                            i21++;
                            f7 = f18;
                            i18 = i22;
                            f14 = f21;
                        }
                        System.arraycopy(fArr, i15, fArr, i23, 3);
                        i15 += 6;
                        System.arraycopy(fArr2, i16, fArr2, i24, 2);
                        i16 += 4;
                        i21++;
                        f7 = f18;
                        i18 = i22;
                        f14 = f21;
                    }
                    i19++;
                    f13 = f17;
                    f7 = f7;
                }
                radians = f15;
                radians2 = f16;
                i14 = i18;
            }
            e.a aVar = new e.a(new e.b(0, 1, fArr, fArr2));
            a11 = new e(aVar, aVar, i13);
        }
        this.f17332f.a(j12, a11);
    }

    public final void c(float[] fArr) {
        GLES20.glClear(16384);
        try {
            C8072n.b();
        } catch (C8072n.a e11) {
            s.d("SceneRenderer", "Failed to draw a frame", e11);
        }
        boolean compareAndSet = this.f17327a.compareAndSet(true, false);
        g gVar = this.f17329c;
        if (compareAndSet) {
            SurfaceTexture surfaceTexture = this.f17336j;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            try {
                C8072n.b();
            } catch (C8072n.a e12) {
                s.d("SceneRenderer", "Failed to draw a frame", e12);
            }
            boolean compareAndSet2 = this.f17328b.compareAndSet(true, false);
            float[] fArr2 = this.f17333g;
            if (compareAndSet2) {
                Matrix.setIdentityM(fArr2, 0);
            }
            long timestamp = this.f17336j.getTimestamp();
            Long d11 = this.f17331e.d(timestamp);
            if (d11 != null) {
                this.f17330d.b(d11.longValue(), fArr2);
            }
            e g10 = this.f17332f.g(timestamp);
            if (g10 != null) {
                gVar.d(g10);
            }
        }
        Matrix.multiplyMM(this.f17334h, 0, fArr, 0, this.f17333g, 0);
        gVar.a(this.f17334h, this.f17335i);
    }

    @Override // M3.a
    public final void d(long j11, float[] fArr) {
        this.f17330d.d(j11, fArr);
    }

    @Override // M3.a
    public final void e() {
        this.f17331e.b();
        this.f17330d.c();
        this.f17328b.set(true);
    }

    public final SurfaceTexture f() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            C8072n.b();
            this.f17329c.b();
            C8072n.b();
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            C8072n.b();
            int i11 = iArr[0];
            C8072n.a(36197, i11);
            this.f17335i = i11;
        } catch (C8072n.a e11) {
            s.d("SceneRenderer", "Failed to initialize the renderer", e11);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f17335i);
        this.f17336j = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: M3.h
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                i.this.f17327a.set(true);
            }
        });
        return this.f17336j;
    }
}
