package O;

import C.A;
import C.Q;
import C.S;
import C.f0;
import N.n;
import P.d;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes8.dex */
public final class c extends n {

    /* renamed from: n, reason: collision with root package name */
    private int f19687n = -1;

    /* renamed from: o, reason: collision with root package name */
    private int f19688o = -1;

    /* renamed from: p, reason: collision with root package name */
    @NonNull
    private final Q f19689p;

    /* renamed from: q, reason: collision with root package name */
    @NonNull
    private final Q f19690q;

    public c(@NonNull Q q11, @NonNull Q q12) {
        this.f19689p = q11;
        this.f19690q = q12;
    }

    private void t(@NonNull P.g gVar, @NonNull f0 f0Var, @NonNull SurfaceTexture surfaceTexture, @NonNull Q q11, int i11) {
        q(i11);
        GLES20.glViewport(0, 0, gVar.c(), gVar.b());
        GLES20.glScissor(0, 0, gVar.c(), gVar.b());
        float[] fArr = new float[16];
        surfaceTexture.getTransformMatrix(fArr);
        float[] fArr2 = new float[16];
        f0Var.i0(fArr2, fArr);
        d.f fVar = this.f18255k;
        fVar.getClass();
        if (fVar instanceof d.g) {
            ((d.g) fVar).g(fArr2);
        }
        Size size = new Size((int) (q11.b() * gVar.c()), (int) (q11.a() * gVar.b()));
        Size size2 = new Size(gVar.c(), gVar.b());
        float[] fArr3 = new float[16];
        Matrix.setIdentityM(fArr3, 0);
        float[] fArr4 = new float[16];
        Matrix.setIdentityM(fArr4, 0);
        float[] fArr5 = new float[16];
        Matrix.setIdentityM(fArr5, 0);
        Matrix.scaleM(fArr3, 0, size.getWidth() / size2.getWidth(), size.getHeight() / size2.getHeight(), 1.0f);
        Matrix.translateM(fArr4, 0, 0.0f / q11.b(), 0.0f / q11.a(), 0.0f);
        Matrix.multiplyMM(fArr5, 0, fArr3, 0, fArr4, 0);
        fVar.e(fArr5);
        fVar.d(1.0f);
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        GLES20.glDrawArrays(5, 0, 4);
        P.d.e("glDrawArrays");
        GLES20.glDisable(3042);
    }

    @Override // N.n
    @NonNull
    public final P.e g(@NonNull A a11) {
        Map map = Collections.EMPTY_MAP;
        P.e g10 = super.g(a11);
        this.f19687n = P.d.k();
        this.f19688o = P.d.k();
        return g10;
    }

    @Override // N.n
    public final void j() {
        super.j();
        this.f19687n = -1;
        this.f19688o = -1;
    }

    public final int r(boolean z11) {
        P.d.g(this.f18245a, true);
        P.d.f(this.f18247c);
        return z11 ? this.f19687n : this.f19688o;
    }

    public final void s(long j11, @NonNull Surface surface, @NonNull f0 f0Var, @NonNull SurfaceTexture surfaceTexture, @NonNull SurfaceTexture surfaceTexture2) {
        P.d.g(this.f18245a, true);
        P.d.f(this.f18247c);
        P.g e11 = e(surface);
        if (e11 == P.d.f20580j) {
            e11 = b(surface);
            if (e11 == null) {
                return;
            } else {
                this.f18246b.put(surface, e11);
            }
        }
        P.g gVar = e11;
        if (surface != this.f18253i) {
            h(gVar.a());
            this.f18253i = surface;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
        t(gVar, f0Var, surfaceTexture, this.f19689p, this.f19687n);
        t(gVar, f0Var, surfaceTexture2, this.f19690q, this.f19688o);
        EGLExt.eglPresentationTimeANDROID(this.f18248d, gVar.a(), j11);
        if (EGL14.eglSwapBuffers(this.f18248d, gVar.a())) {
            return;
        }
        S.k("DualOpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        l(surface, false);
    }
}
