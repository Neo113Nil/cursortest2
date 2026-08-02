package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.HandlerThread;
import android.util.Log;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* renamed from: com.google.android.gms.internal.ads.ae, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0759ae extends Thread implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: L, reason: collision with root package name */
    public static final float[] f12662L = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};

    /* renamed from: A, reason: collision with root package name */
    public int f12663A;

    /* renamed from: B, reason: collision with root package name */
    public int f12664B;

    /* renamed from: C, reason: collision with root package name */
    public final FloatBuffer f12665C;

    /* renamed from: D, reason: collision with root package name */
    public final CountDownLatch f12666D;

    /* renamed from: E, reason: collision with root package name */
    public final Object f12667E;

    /* renamed from: F, reason: collision with root package name */
    public EGL10 f12668F;

    /* renamed from: G, reason: collision with root package name */
    public EGLDisplay f12669G;

    /* renamed from: H, reason: collision with root package name */
    public EGLContext f12670H;

    /* renamed from: I, reason: collision with root package name */
    public EGLSurface f12671I;
    public volatile boolean J;
    public volatile boolean K;

    /* renamed from: k, reason: collision with root package name */
    public final C0732Zd f12672k;

    /* renamed from: l, reason: collision with root package name */
    public final float[] f12673l;

    /* renamed from: m, reason: collision with root package name */
    public final float[] f12674m;

    /* renamed from: n, reason: collision with root package name */
    public final float[] f12675n;

    /* renamed from: o, reason: collision with root package name */
    public final float[] f12676o;

    /* renamed from: p, reason: collision with root package name */
    public final float[] f12677p;

    /* renamed from: q, reason: collision with root package name */
    public final float[] f12678q;

    /* renamed from: r, reason: collision with root package name */
    public final float[] f12679r;

    /* renamed from: s, reason: collision with root package name */
    public float f12680s;

    /* renamed from: t, reason: collision with root package name */
    public float f12681t;

    /* renamed from: u, reason: collision with root package name */
    public float f12682u;

    /* renamed from: v, reason: collision with root package name */
    public int f12683v;

    /* renamed from: w, reason: collision with root package name */
    public int f12684w;

    /* renamed from: x, reason: collision with root package name */
    public SurfaceTexture f12685x;

    /* renamed from: y, reason: collision with root package name */
    public SurfaceTexture f12686y;

    /* renamed from: z, reason: collision with root package name */
    public int f12687z;

    public C0759ae(Context context) {
        super("SphericalVideoProcessor");
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f12665C = asFloatBuffer;
        asFloatBuffer.put(f12662L).position(0);
        this.f12673l = new float[9];
        this.f12674m = new float[9];
        this.f12675n = new float[9];
        this.f12676o = new float[9];
        this.f12677p = new float[9];
        this.f12678q = new float[9];
        this.f12679r = new float[9];
        this.f12680s = Float.NaN;
        C0732Zd c0732Zd = new C0732Zd(context);
        this.f12672k = c0732Zd;
        c0732Zd.f12500h = this;
        this.f12666D = new CountDownLatch(1);
        this.f12667E = new Object();
    }

    public static final void f(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            Log.e("SphericalVideoRenderer", str + ": glError " + glGetError);
        }
    }

    public static final void g(float[] fArr, float[] fArr2, float[] fArr3) {
        float f = fArr2[0] * fArr3[0];
        float f5 = fArr2[1];
        float f6 = fArr3[3];
        float f7 = fArr2[2];
        float f8 = fArr3[6];
        fArr[0] = f + (f5 * f6) + (f7 * f8);
        float f9 = fArr2[0];
        float f10 = fArr3[1] * f9;
        float f11 = fArr3[4];
        float f12 = fArr3[7];
        fArr[1] = f10 + (f5 * f11) + (f7 * f12);
        float f13 = f9 * fArr3[2];
        float f14 = fArr2[1];
        float f15 = fArr3[5];
        float f16 = fArr3[8];
        fArr[2] = f13 + (f14 * f15) + (f7 * f16);
        float f17 = fArr2[3];
        float f18 = fArr3[0];
        float f19 = fArr2[4];
        float f20 = fArr2[5];
        fArr[3] = (f17 * f18) + (f6 * f19) + (f20 * f8);
        float f21 = fArr2[3];
        float f22 = fArr3[1];
        fArr[4] = (f21 * f22) + (f19 * f11) + (f20 * f12);
        float f23 = fArr3[2];
        fArr[5] = (f21 * f23) + (fArr2[4] * f15) + (f20 * f16);
        float f24 = fArr2[6] * f18;
        float f25 = fArr2[7];
        float f26 = fArr3[3] * f25;
        float f27 = fArr2[8];
        fArr[6] = f24 + f26 + (f8 * f27);
        float f28 = fArr2[6];
        float f29 = f12 * f27;
        fArr[7] = f29 + (f25 * fArr3[4]) + (f22 * f28);
        fArr[8] = (f28 * f23) + (fArr2[7] * fArr3[5]) + (f27 * f16);
    }

    public static final void h(float[] fArr, float f) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d5 = f;
        fArr[4] = (float) Math.cos(d5);
        fArr[5] = (float) (-Math.sin(d5));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d5);
        fArr[8] = (float) Math.cos(d5);
    }

    public static final void i(float[] fArr, float f) {
        double d5 = f;
        fArr[0] = (float) Math.cos(d5);
        fArr[1] = (float) (-Math.sin(d5));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d5);
        fArr[4] = (float) Math.cos(d5);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    public static final int j(String str, int i) {
        int glCreateShader = GLES20.glCreateShader(i);
        f("createShader");
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            f("shaderSource");
            GLES20.glCompileShader(glCreateShader);
            f("compileShader");
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            f("getShaderiv");
            if (iArr[0] == 0) {
                Log.e("SphericalVideoRenderer", "Could not compile shader " + i + ":");
                Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(glCreateShader));
                GLES20.glDeleteShader(glCreateShader);
                f("deleteShader");
                return 0;
            }
        }
        return glCreateShader;
    }

    public final void a() {
        synchronized (this.f12667E) {
            this.f12667E.notifyAll();
        }
    }

    public final void b(int i, int i5) {
        synchronized (this.f12667E) {
            this.f12684w = i;
            this.f12683v = i5;
            this.J = true;
            this.f12667E.notifyAll();
        }
    }

    public final void c() {
        synchronized (this.f12667E) {
            this.K = true;
            this.f12686y = null;
            this.f12667E.notifyAll();
        }
    }

    public final void d(float f, float f5) {
        int i = this.f12684w;
        int i5 = this.f12683v;
        if (i <= i5) {
            i = i5;
        }
        float f6 = i;
        this.f12681t -= (f * 1.7453293f) / f6;
        float f7 = this.f12682u - ((f5 * 1.7453293f) / f6);
        this.f12682u = f7;
        if (f7 < -1.5707964f) {
            this.f12682u = -1.5707964f;
            f7 = -1.5707964f;
        }
        if (f7 > 1.5707964f) {
            this.f12682u = 1.5707964f;
        }
    }

    public final void e() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.f12671I;
        if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
            this.f12668F.eglMakeCurrent(this.f12669G, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f12668F.eglDestroySurface(this.f12669G, this.f12671I);
            this.f12671I = null;
        }
        EGLContext eGLContext = this.f12670H;
        if (eGLContext != null) {
            this.f12668F.eglDestroyContext(this.f12669G, eGLContext);
            this.f12670H = null;
        }
        EGLDisplay eGLDisplay = this.f12669G;
        if (eGLDisplay != null) {
            this.f12668F.eglTerminate(eGLDisplay);
            this.f12669G = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f12664B++;
        synchronized (this.f12667E) {
            this.f12667E.notifyAll();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x01c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00b0  */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z3;
        int j5;
        int glCreateProgram;
        char c5 = 2;
        int i = 3;
        if (this.f12686y == null) {
            U2.j.f("SphericalVideoProcessor started with no output texture.");
            this.f12666D.countDown();
            return;
        }
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f12668F = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f12669G = eglGetDisplay;
        if (eglGetDisplay != EGL10.EGL_NO_DISPLAY) {
            if (this.f12668F.eglInitialize(eglGetDisplay, new int[2])) {
                int[] iArr = new int[1];
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                EGLConfig eGLConfig = (this.f12668F.eglChooseConfig(this.f12669G, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 16, 12344}, eGLConfigArr, 1, iArr) && iArr[0] > 0) ? eGLConfigArr[0] : null;
                if (eGLConfig != null) {
                    EGL10 egl102 = this.f12668F;
                    EGLDisplay eGLDisplay = this.f12669G;
                    EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
                    EGLContext eglCreateContext = egl102.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, new int[]{12440, 2, 12344});
                    this.f12670H = eglCreateContext;
                    if (eglCreateContext != null && eglCreateContext != eGLContext) {
                        EGLSurface eglCreateWindowSurface = this.f12668F.eglCreateWindowSurface(this.f12669G, eGLConfig, this.f12686y, null);
                        this.f12671I = eglCreateWindowSurface;
                        if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE && this.f12668F.eglMakeCurrent(this.f12669G, eglCreateWindowSurface, eglCreateWindowSurface, this.f12670H)) {
                            z3 = true;
                            A7 a7 = F7.f8843j1;
                            Q2.r rVar = Q2.r.f5053d;
                            j5 = j(((String) rVar.f5056c.a(a7)).equals(a7.f()) ? (String) rVar.f5056c.a(a7) : "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}", 35633);
                            if (j5 != 0) {
                                A7 a72 = F7.f8849k1;
                                int j6 = j(!((String) rVar.f5056c.a(a72)).equals(a72.f()) ? (String) rVar.f5056c.a(a72) : "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}", 35632);
                                if (j6 != 0) {
                                    glCreateProgram = GLES20.glCreateProgram();
                                    f("createProgram");
                                    if (glCreateProgram != 0) {
                                        GLES20.glAttachShader(glCreateProgram, j5);
                                        f("attachShader");
                                        GLES20.glAttachShader(glCreateProgram, j6);
                                        f("attachShader");
                                        GLES20.glLinkProgram(glCreateProgram);
                                        f("linkProgram");
                                        int[] iArr2 = new int[1];
                                        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr2, 0);
                                        f("getProgramiv");
                                        if (iArr2[0] != 1) {
                                            Log.e("SphericalVideoRenderer", "Could not link program: ");
                                            Log.e("SphericalVideoRenderer", GLES20.glGetProgramInfoLog(glCreateProgram));
                                            GLES20.glDeleteProgram(glCreateProgram);
                                            f("deleteProgram");
                                        } else {
                                            GLES20.glValidateProgram(glCreateProgram);
                                            f("validateProgram");
                                        }
                                    }
                                    this.f12687z = glCreateProgram;
                                    GLES20.glUseProgram(glCreateProgram);
                                    f("useProgram");
                                    int glGetAttribLocation = GLES20.glGetAttribLocation(this.f12687z, "aPosition");
                                    GLES20.glVertexAttribPointer(glGetAttribLocation, 3, 5126, false, 12, (Buffer) this.f12665C);
                                    f("vertexAttribPointer");
                                    GLES20.glEnableVertexAttribArray(glGetAttribLocation);
                                    f("enableVertexAttribArray");
                                    int[] iArr3 = new int[1];
                                    GLES20.glGenTextures(1, iArr3, 0);
                                    f("genTextures");
                                    int i5 = iArr3[0];
                                    GLES20.glBindTexture(36197, i5);
                                    f("bindTextures");
                                    GLES20.glTexParameteri(36197, 10240, 9729);
                                    f("texParameteri");
                                    GLES20.glTexParameteri(36197, 10241, 9729);
                                    f("texParameteri");
                                    GLES20.glTexParameteri(36197, 10242, 33071);
                                    f("texParameteri");
                                    GLES20.glTexParameteri(36197, 10243, 33071);
                                    f("texParameteri");
                                    int glGetUniformLocation = GLES20.glGetUniformLocation(this.f12687z, "uVMat");
                                    this.f12663A = glGetUniformLocation;
                                    GLES20.glUniformMatrix3fv(glGetUniformLocation, 1, false, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, 0);
                                    int i6 = this.f12687z;
                                    if (z3 || i6 == 0) {
                                        String concat = "EGL initialization failed: ".concat(String.valueOf(GLUtils.getEGLErrorString(this.f12668F.eglGetError())));
                                        U2.j.f(concat);
                                        P2.o.f4767B.f4774g.i("SphericalVideoProcessor.run.1", new Throwable(concat));
                                        e();
                                        this.f12666D.countDown();
                                    }
                                    SurfaceTexture surfaceTexture = new SurfaceTexture(i5);
                                    this.f12685x = surfaceTexture;
                                    surfaceTexture.setOnFrameAvailableListener(this);
                                    this.f12666D.countDown();
                                    C0732Zd c0732Zd = this.f12672k;
                                    if (c0732Zd.f12499g == null) {
                                        SensorManager sensorManager = c0732Zd.f12494a;
                                        Sensor defaultSensor = sensorManager.getDefaultSensor(11);
                                        if (defaultSensor == null) {
                                            U2.j.f("No Sensor of TYPE_ROTATION_VECTOR");
                                        } else {
                                            HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
                                            handlerThread.start();
                                            Jt jt = new Jt(handlerThread.getLooper(), 0);
                                            c0732Zd.f12499g = jt;
                                            if (!sensorManager.registerListener(c0732Zd, defaultSensor, 0, jt)) {
                                                U2.j.f("SensorManager.registerListener failed.");
                                                c0732Zd.b();
                                            }
                                        }
                                    }
                                    try {
                                        try {
                                            try {
                                                this.J = true;
                                                while (!this.K) {
                                                    while (this.f12664B > 0) {
                                                        this.f12685x.updateTexImage();
                                                        this.f12664B--;
                                                    }
                                                    if (this.f12672k.c(this.f12673l)) {
                                                        if (Float.isNaN(this.f12680s)) {
                                                            float[] fArr = this.f12673l;
                                                            float[] fArr2 = new float[i];
                                                            // fill-array-data instruction
                                                            fArr2[0] = 0.0f;
                                                            fArr2[1] = 1.0f;
                                                            fArr2[2] = 0.0f;
                                                            float f = fArr[0];
                                                            float f5 = fArr2[0];
                                                            float f6 = fArr[1];
                                                            float f7 = fArr2[1];
                                                            float f8 = (fArr[c5] * 0.0f) + (f6 * f7) + (f * f5);
                                                            float f9 = (fArr[5] * 0.0f) + (fArr[i] * f5) + (fArr[4] * f7);
                                                            float f10 = (fArr[8] * 0.0f) + (fArr[6] * f5) + (fArr[7] * f7);
                                                            float[] fArr3 = new float[i];
                                                            fArr3[0] = f8;
                                                            fArr3[1] = f9;
                                                            fArr3[c5] = f10;
                                                            this.f12680s = -(((float) Math.atan2(fArr3[1], fArr3[0])) - 1.5707964f);
                                                        }
                                                        i(this.f12678q, this.f12680s + this.f12681t);
                                                    } else {
                                                        h(this.f12673l, -1.5707964f);
                                                        i(this.f12678q, this.f12681t);
                                                    }
                                                    h(this.f12674m, 1.5707964f);
                                                    g(this.f12675n, this.f12678q, this.f12674m);
                                                    g(this.f12676o, this.f12673l, this.f12675n);
                                                    h(this.f12677p, this.f12682u);
                                                    g(this.f12679r, this.f12677p, this.f12676o);
                                                    GLES20.glUniformMatrix3fv(this.f12663A, 1, false, this.f12679r, 0);
                                                    GLES20.glDrawArrays(5, 0, 4);
                                                    f("drawArrays");
                                                    GLES20.glFinish();
                                                    this.f12668F.eglSwapBuffers(this.f12669G, this.f12671I);
                                                    if (this.J) {
                                                        GLES20.glViewport(0, 0, this.f12684w, this.f12683v);
                                                        f("viewport");
                                                        int glGetUniformLocation2 = GLES20.glGetUniformLocation(this.f12687z, "uFOVx");
                                                        int glGetUniformLocation3 = GLES20.glGetUniformLocation(this.f12687z, "uFOVy");
                                                        int i7 = this.f12684w;
                                                        int i8 = this.f12683v;
                                                        if (i7 > i8) {
                                                            GLES20.glUniform1f(glGetUniformLocation2, 0.87266463f);
                                                            GLES20.glUniform1f(glGetUniformLocation3, (this.f12683v * 0.87266463f) / this.f12684w);
                                                        } else {
                                                            GLES20.glUniform1f(glGetUniformLocation2, (i7 * 0.87266463f) / i8);
                                                            GLES20.glUniform1f(glGetUniformLocation3, 0.87266463f);
                                                        }
                                                        this.J = false;
                                                    }
                                                    try {
                                                        synchronized (this.f12667E) {
                                                            try {
                                                                if (!this.K && !this.J && this.f12664B == 0) {
                                                                    this.f12667E.wait();
                                                                }
                                                            } catch (Throwable th) {
                                                                throw th;
                                                            }
                                                        }
                                                    } catch (InterruptedException unused) {
                                                    }
                                                    c5 = 2;
                                                    i = 3;
                                                }
                                            } catch (Throwable th2) {
                                                U2.j.g("SphericalVideoProcessor died.", th2);
                                                P2.o.f4767B.f4774g.i("SphericalVideoProcessor.run.2", th2);
                                            }
                                        } catch (IllegalStateException unused2) {
                                            U2.j.i("SphericalVideoProcessor halted unexpectedly.");
                                        }
                                        this.f12672k.b();
                                        this.f12685x.setOnFrameAvailableListener(null);
                                        this.f12685x = null;
                                        e();
                                        return;
                                    } catch (Throwable th3) {
                                        this.f12672k.b();
                                        this.f12685x.setOnFrameAvailableListener(null);
                                        this.f12685x = null;
                                        e();
                                        throw th3;
                                    }
                                }
                            }
                            glCreateProgram = 0;
                            this.f12687z = glCreateProgram;
                            GLES20.glUseProgram(glCreateProgram);
                            f("useProgram");
                            int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.f12687z, "aPosition");
                            GLES20.glVertexAttribPointer(glGetAttribLocation2, 3, 5126, false, 12, (Buffer) this.f12665C);
                            f("vertexAttribPointer");
                            GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
                            f("enableVertexAttribArray");
                            int[] iArr32 = new int[1];
                            GLES20.glGenTextures(1, iArr32, 0);
                            f("genTextures");
                            int i52 = iArr32[0];
                            GLES20.glBindTexture(36197, i52);
                            f("bindTextures");
                            GLES20.glTexParameteri(36197, 10240, 9729);
                            f("texParameteri");
                            GLES20.glTexParameteri(36197, 10241, 9729);
                            f("texParameteri");
                            GLES20.glTexParameteri(36197, 10242, 33071);
                            f("texParameteri");
                            GLES20.glTexParameteri(36197, 10243, 33071);
                            f("texParameteri");
                            int glGetUniformLocation4 = GLES20.glGetUniformLocation(this.f12687z, "uVMat");
                            this.f12663A = glGetUniformLocation4;
                            GLES20.glUniformMatrix3fv(glGetUniformLocation4, 1, false, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, 0);
                            int i62 = this.f12687z;
                            if (z3) {
                            }
                            String concat2 = "EGL initialization failed: ".concat(String.valueOf(GLUtils.getEGLErrorString(this.f12668F.eglGetError())));
                            U2.j.f(concat2);
                            P2.o.f4767B.f4774g.i("SphericalVideoProcessor.run.1", new Throwable(concat2));
                            e();
                            this.f12666D.countDown();
                        }
                    }
                }
            }
        }
        z3 = false;
        A7 a73 = F7.f8843j1;
        Q2.r rVar2 = Q2.r.f5053d;
        j5 = j(((String) rVar2.f5056c.a(a73)).equals(a73.f()) ? (String) rVar2.f5056c.a(a73) : "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}", 35633);
        if (j5 != 0) {
        }
        glCreateProgram = 0;
        this.f12687z = glCreateProgram;
        GLES20.glUseProgram(glCreateProgram);
        f("useProgram");
        int glGetAttribLocation22 = GLES20.glGetAttribLocation(this.f12687z, "aPosition");
        GLES20.glVertexAttribPointer(glGetAttribLocation22, 3, 5126, false, 12, (Buffer) this.f12665C);
        f("vertexAttribPointer");
        GLES20.glEnableVertexAttribArray(glGetAttribLocation22);
        f("enableVertexAttribArray");
        int[] iArr322 = new int[1];
        GLES20.glGenTextures(1, iArr322, 0);
        f("genTextures");
        int i522 = iArr322[0];
        GLES20.glBindTexture(36197, i522);
        f("bindTextures");
        GLES20.glTexParameteri(36197, 10240, 9729);
        f("texParameteri");
        GLES20.glTexParameteri(36197, 10241, 9729);
        f("texParameteri");
        GLES20.glTexParameteri(36197, 10242, 33071);
        f("texParameteri");
        GLES20.glTexParameteri(36197, 10243, 33071);
        f("texParameteri");
        int glGetUniformLocation42 = GLES20.glGetUniformLocation(this.f12687z, "uVMat");
        this.f12663A = glGetUniformLocation42;
        GLES20.glUniformMatrix3fv(glGetUniformLocation42, 1, false, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, 0);
        int i622 = this.f12687z;
        if (z3) {
        }
        String concat22 = "EGL initialization failed: ".concat(String.valueOf(GLUtils.getEGLErrorString(this.f12668F.eglGetError())));
        U2.j.f(concat22);
        P2.o.f4767B.f4774g.i("SphericalVideoProcessor.run.1", new Throwable(concat22));
        e();
        this.f12666D.countDown();
    }
}
