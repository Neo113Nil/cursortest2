package N;

import C.S;
import P.d;
import P.e;
import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.core.ImageProcessingUtil;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public class n {

    /* renamed from: c, reason: collision with root package name */
    protected Thread f18247c;

    /* renamed from: g, reason: collision with root package name */
    protected EGLConfig f18251g;

    /* renamed from: i, reason: collision with root package name */
    protected Surface f18253i;

    /* renamed from: a, reason: collision with root package name */
    protected final AtomicBoolean f18245a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    protected final HashMap f18246b = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    protected EGLDisplay f18248d = EGL14.EGL_NO_DISPLAY;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    protected EGLContext f18249e = EGL14.EGL_NO_CONTEXT;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    protected int[] f18250f = P.d.f20571a;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    protected EGLSurface f18252h = EGL14.EGL_NO_SURFACE;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    protected Map<d.e, d.f> f18254j = Collections.EMPTY_MAP;

    /* renamed from: k, reason: collision with root package name */
    protected d.f f18255k = null;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    protected d.e f18256l = d.e.UNKNOWN;

    /* renamed from: m, reason: collision with root package name */
    private int f18257m = -1;

    private void a(@NonNull C.A a11, e.a aVar) {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f18248d = eglGetDisplay;
        if (Objects.equals(eglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            throw new IllegalStateException("Unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(this.f18248d, iArr, 0, iArr, 1)) {
            this.f18248d = EGL14.EGL_NO_DISPLAY;
            throw new IllegalStateException("Unable to initialize EGL14");
        }
        if (aVar != null) {
            aVar.c(iArr[0] + "." + iArr[1]);
        }
        int i11 = a11.c() ? 10 : 8;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(this.f18248d, new int[]{12324, i11, 12323, i11, 12322, i11, 12321, a11.c() ? 2 : 8, 12325, 0, 12326, 0, 12352, a11.c() ? 64 : 4, 12610, a11.c() ? -1 : 1, 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            throw new IllegalStateException("Unable to find a suitable EGLConfig");
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eglCreateContext = EGL14.eglCreateContext(this.f18248d, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, a11.c() ? 3 : 2, 12344}, 0);
        P.d.d("eglCreateContext");
        this.f18251g = eGLConfig;
        this.f18249e = eglCreateContext;
        int[] iArr2 = new int[1];
        EGL14.eglQueryContext(this.f18248d, eglCreateContext, 12440, iArr2, 0);
        Log.d("OpenGlRenderer", "EGLContext created, client version " + iArr2[0]);
    }

    private void c() {
        EGLDisplay eGLDisplay = this.f18248d;
        EGLConfig eGLConfig = this.f18251g;
        Objects.requireNonNull(eGLConfig);
        int[] iArr = P.d.f20571a;
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, 1, 12374, 1, 12344}, 0);
        P.d.d("eglCreatePbufferSurface");
        if (eglCreatePbufferSurface == null) {
            throw new IllegalStateException("surface was null");
        }
        this.f18252h = eglCreatePbufferSurface;
    }

    @NonNull
    private x2.d<String, String> d(@NonNull C.A a11) {
        P.d.g(this.f18245a, false);
        try {
            a(a11, null);
            c();
            h(this.f18252h);
            String glGetString = GLES20.glGetString(7939);
            String eglQueryString = EGL14.eglQueryString(this.f18248d, 12373);
            if (glGetString == null) {
                glGetString = "";
            }
            if (eglQueryString == null) {
                eglQueryString = "";
            }
            return new x2.d<>(glGetString, eglQueryString);
        } catch (IllegalStateException e11) {
            S.l("OpenGlRenderer", "Failed to get GL or EGL extensions: " + e11.getMessage(), e11);
            return new x2.d<>("", "");
        } finally {
            k();
        }
    }

    private void k() {
        Iterator<d.f> it = this.f18254j.values().iterator();
        while (it.hasNext()) {
            it.next().b();
        }
        this.f18254j = Collections.EMPTY_MAP;
        this.f18255k = null;
        if (!Objects.equals(this.f18248d, EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eGLDisplay = this.f18248d;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            HashMap hashMap = this.f18246b;
            for (P.g gVar : hashMap.values()) {
                if (!Objects.equals(gVar.a(), EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface(this.f18248d, gVar.a())) {
                    try {
                        P.d.d("eglDestroySurface");
                    } catch (IllegalStateException e11) {
                        S.d("GLUtils", e11.toString(), e11);
                    }
                }
            }
            hashMap.clear();
            if (!Objects.equals(this.f18252h, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f18248d, this.f18252h);
                this.f18252h = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals(this.f18249e, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext(this.f18248d, this.f18249e);
                this.f18249e = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f18248d);
            this.f18248d = EGL14.EGL_NO_DISPLAY;
        }
        this.f18251g = null;
        this.f18257m = -1;
        this.f18256l = d.e.UNKNOWN;
        this.f18253i = null;
        this.f18247c = null;
    }

    protected final P.g b(@NonNull Surface surface) {
        try {
            EGLDisplay eGLDisplay = this.f18248d;
            EGLConfig eGLConfig = this.f18251g;
            Objects.requireNonNull(eGLConfig);
            EGLSurface l11 = P.d.l(eGLDisplay, eGLConfig, surface, this.f18250f);
            EGLDisplay eGLDisplay2 = this.f18248d;
            int[] iArr = new int[1];
            EGL14.eglQuerySurface(eGLDisplay2, l11, 12375, iArr, 0);
            int i11 = iArr[0];
            int[] iArr2 = new int[1];
            EGL14.eglQuerySurface(eGLDisplay2, l11, 12374, iArr2, 0);
            Size size = new Size(i11, iArr2[0]);
            return P.g.d(l11, size.getWidth(), size.getHeight());
        } catch (IllegalArgumentException | IllegalStateException e11) {
            S.l("OpenGlRenderer", "Failed to create EGL surface: " + e11.getMessage(), e11);
            return null;
        }
    }

    @NonNull
    protected final P.g e(@NonNull Surface surface) {
        HashMap hashMap = this.f18246b;
        x2.i.f("The surface is not registered.", hashMap.containsKey(surface));
        P.g gVar = (P.g) hashMap.get(surface);
        Objects.requireNonNull(gVar);
        return gVar;
    }

    public final int f() {
        P.d.g(this.f18245a, true);
        P.d.f(this.f18247c);
        return this.f18257m;
    }

    @NonNull
    public P.e g(@NonNull C.A a11) {
        Map map = Collections.EMPTY_MAP;
        AtomicBoolean atomicBoolean = this.f18245a;
        P.d.g(atomicBoolean, false);
        e.a a12 = P.e.a();
        try {
            if (a11.c()) {
                x2.d<String, String> d11 = d(a11);
                String str = d11.f104935a;
                str.getClass();
                String str2 = d11.f104936b;
                str2.getClass();
                if (!str.contains("GL_EXT_YUV_target")) {
                    S.k("OpenGlRenderer", "Device does not support GL_EXT_YUV_target. Fallback to SDR.");
                    a11 = C.A.f4076d;
                }
                this.f18250f = P.d.i(str2, a11);
                a12.d(str);
                a12.b(str2);
            }
            a(a11, a12);
            c();
            h(this.f18252h);
            a12.e(P.d.m());
            this.f18254j = P.d.j(a11);
            int k11 = P.d.k();
            this.f18257m = k11;
            q(k11);
            this.f18247c = Thread.currentThread();
            atomicBoolean.set(true);
            return a12.a();
        } catch (IllegalArgumentException e11) {
            e = e11;
            k();
            throw e;
        } catch (IllegalStateException e12) {
            e = e12;
            k();
            throw e;
        }
    }

    protected final void h(@NonNull EGLSurface eGLSurface) {
        this.f18248d.getClass();
        this.f18249e.getClass();
        if (!EGL14.eglMakeCurrent(this.f18248d, eGLSurface, eGLSurface, this.f18249e)) {
            throw new IllegalStateException("eglMakeCurrent failed");
        }
    }

    public final void i(@NonNull Surface surface) {
        P.d.g(this.f18245a, true);
        P.d.f(this.f18247c);
        HashMap hashMap = this.f18246b;
        if (hashMap.containsKey(surface)) {
            return;
        }
        hashMap.put(surface, P.d.f20580j);
    }

    public void j() {
        if (this.f18245a.getAndSet(false)) {
            P.d.f(this.f18247c);
            k();
        }
    }

    protected final void l(@NonNull Surface surface, boolean z11) {
        if (this.f18253i == surface) {
            this.f18253i = null;
            h(this.f18252h);
        }
        HashMap hashMap = this.f18246b;
        P.g gVar = z11 ? (P.g) hashMap.remove(surface) : (P.g) hashMap.put(surface, P.d.f20580j);
        if (gVar == null || gVar == P.d.f20580j) {
            return;
        }
        try {
            EGL14.eglDestroySurface(this.f18248d, gVar.a());
        } catch (RuntimeException e11) {
            S.l("OpenGlRenderer", "Failed to destroy EGL surface: " + e11.getMessage(), e11);
        }
    }

    public final void m(long j11, @NonNull float[] fArr, @NonNull Surface surface) {
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
        if (surface != this.f18253i) {
            h(e11.a());
            this.f18253i = surface;
            GLES20.glViewport(0, 0, e11.c(), e11.b());
            GLES20.glScissor(0, 0, e11.c(), e11.b());
        }
        d.f fVar = this.f18255k;
        fVar.getClass();
        if (fVar instanceof d.g) {
            ((d.g) fVar).g(fArr);
        }
        GLES20.glDrawArrays(5, 0, 4);
        P.d.e("glDrawArrays");
        EGLExt.eglPresentationTimeANDROID(this.f18248d, e11.a(), j11);
        if (EGL14.eglSwapBuffers(this.f18248d, e11.a())) {
            return;
        }
        S.k("OpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        l(surface, false);
    }

    public final void n(@NonNull d.e eVar) {
        P.d.g(this.f18245a, true);
        P.d.f(this.f18247c);
        if (this.f18256l != eVar) {
            this.f18256l = eVar;
            q(this.f18257m);
        }
    }

    @NonNull
    public final Bitmap o(@NonNull Size size, @NonNull float[] fArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(size.getHeight() * size.getWidth() * 4);
        x2.i.a("ByteBuffer capacity is not equal to width * height * 4.", allocateDirect.capacity() == (size.getHeight() * size.getWidth()) * 4);
        x2.i.a("ByteBuffer is not direct.", allocateDirect.isDirect());
        int[] iArr = P.d.f20571a;
        int[] iArr2 = new int[1];
        GLES20.glGenTextures(1, iArr2, 0);
        P.d.e("glGenTextures");
        int i11 = iArr2[0];
        GLES20.glActiveTexture(33985);
        P.d.e("glActiveTexture");
        GLES20.glBindTexture(3553, i11);
        P.d.e("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, size.getWidth(), size.getHeight(), 0, 6407, 5121, null);
        P.d.e("glTexImage2D");
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int[] iArr3 = new int[1];
        GLES20.glGenFramebuffers(1, iArr3, 0);
        P.d.e("glGenFramebuffers");
        int i12 = iArr3[0];
        GLES20.glBindFramebuffer(36160, i12);
        P.d.e("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i11, 0);
        P.d.e("glFramebufferTexture2D");
        GLES20.glActiveTexture(33984);
        P.d.e("glActiveTexture");
        GLES20.glBindTexture(36197, this.f18257m);
        P.d.e("glBindTexture");
        this.f18253i = null;
        GLES20.glViewport(0, 0, size.getWidth(), size.getHeight());
        GLES20.glScissor(0, 0, size.getWidth(), size.getHeight());
        d.f fVar = this.f18255k;
        fVar.getClass();
        if (fVar instanceof d.g) {
            ((d.g) fVar).g(fArr);
        }
        GLES20.glDrawArrays(5, 0, 4);
        P.d.e("glDrawArrays");
        GLES20.glReadPixels(0, 0, size.getWidth(), size.getHeight(), 6408, 5121, allocateDirect);
        P.d.e("glReadPixels");
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glDeleteTextures(1, new int[]{i11}, 0);
        P.d.e("glDeleteTextures");
        GLES20.glDeleteFramebuffers(1, new int[]{i12}, 0);
        P.d.e("glDeleteFramebuffers");
        int i13 = this.f18257m;
        GLES20.glActiveTexture(33984);
        P.d.e("glActiveTexture");
        GLES20.glBindTexture(36197, i13);
        P.d.e("glBindTexture");
        Bitmap createBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), Bitmap.Config.ARGB_8888);
        allocateDirect.rewind();
        ImageProcessingUtil.f(createBitmap, allocateDirect, size.getWidth() * 4);
        return createBitmap;
    }

    public final void p(@NonNull Surface surface) {
        P.d.g(this.f18245a, true);
        P.d.f(this.f18247c);
        l(surface, true);
    }

    protected final void q(int i11) {
        d.f fVar = this.f18254j.get(this.f18256l);
        if (fVar == null) {
            throw new IllegalStateException("Unable to configure program for input format: " + this.f18256l);
        }
        if (this.f18255k != fVar) {
            this.f18255k = fVar;
            fVar.f();
            Log.d("OpenGlRenderer", "Using program for input format " + this.f18256l + ": " + this.f18255k);
        }
        GLES20.glActiveTexture(33984);
        P.d.e("glActiveTexture");
        GLES20.glBindTexture(36197, i11);
        P.d.e("glBindTexture");
    }
}
