package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.J;
import J2.j;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLUtils;
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

/* loaded from: classes.dex */
public final class zzcau extends Thread implements SurfaceTexture.OnFrameAvailableListener, zzcas {
    private static final float[] zza = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};
    private volatile boolean zzA;
    private volatile boolean zzB;
    private final zzcat zzb;
    private final float[] zzc;
    private final float[] zzd;
    private final float[] zze;
    private final float[] zzf;
    private final float[] zzg;
    private final float[] zzh;
    private final float[] zzi;
    private float zzj;
    private float zzk;
    private float zzl;
    private int zzm;
    private int zzn;
    private SurfaceTexture zzo;
    private SurfaceTexture zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private final FloatBuffer zzt;
    private final CountDownLatch zzu;
    private final Object zzv;
    private EGL10 zzw;
    private EGLDisplay zzx;
    private EGLContext zzy;
    private EGLSurface zzz;

    public zzcau(Context context) {
        super("SphericalVideoProcessor");
        float[] fArr = zza;
        int length = fArr.length;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.zzt = asFloatBuffer;
        asFloatBuffer.put(fArr).position(0);
        this.zzc = new float[9];
        this.zzd = new float[9];
        this.zze = new float[9];
        this.zzf = new float[9];
        this.zzg = new float[9];
        this.zzh = new float[9];
        this.zzi = new float[9];
        this.zzj = Float.NaN;
        zzcat zzcatVar = new zzcat(context);
        this.zzb = zzcatVar;
        zzcatVar.zzb(this);
        this.zzu = new CountDownLatch(1);
        this.zzv = new Object();
    }

    private static final void zzh(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            Log.e("SphericalVideoRenderer", str + ": glError " + glGetError);
        }
    }

    private static final void zzi(float[] fArr, float[] fArr2, float[] fArr3) {
        float f7 = fArr2[0] * fArr3[0];
        float f8 = fArr2[1];
        float f9 = fArr3[3];
        float f10 = fArr2[2];
        float f11 = fArr3[6];
        fArr[0] = f7 + (f8 * f9) + (f10 * f11);
        float f12 = fArr2[0];
        float f13 = fArr3[1] * f12;
        float f14 = fArr3[4];
        float f15 = fArr3[7];
        fArr[1] = f13 + (f8 * f14) + (f10 * f15);
        float f16 = f12 * fArr3[2];
        float f17 = fArr2[1];
        float f18 = fArr3[5];
        float f19 = fArr3[8];
        fArr[2] = f16 + (f17 * f18) + (f10 * f19);
        float f20 = fArr2[3];
        float f21 = fArr3[0];
        float f22 = fArr2[4];
        float f23 = fArr2[5];
        fArr[3] = (f20 * f21) + (f9 * f22) + (f23 * f11);
        float f24 = fArr2[3];
        float f25 = fArr3[1];
        fArr[4] = (f24 * f25) + (f22 * f14) + (f23 * f15);
        float f26 = fArr3[2];
        fArr[5] = (f24 * f26) + (fArr2[4] * f18) + (f23 * f19);
        float f27 = fArr2[6] * f21;
        float f28 = fArr2[7];
        float f29 = fArr3[3] * f28;
        float f30 = fArr2[8];
        fArr[6] = f27 + f29 + (f11 * f30);
        float f31 = fArr2[6];
        float f32 = f15 * f30;
        fArr[7] = f32 + (f28 * fArr3[4]) + (f25 * f31);
        fArr[8] = (f31 * f26) + (fArr2[7] * fArr3[5]) + (f30 * f19);
    }

    private static final void zzj(float[] fArr, float f7) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d7 = f7;
        fArr[4] = (float) Math.cos(d7);
        fArr[5] = (float) (-Math.sin(d7));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d7);
        fArr[8] = (float) Math.cos(d7);
    }

    private static final void zzk(float[] fArr, float f7) {
        double d7 = f7;
        fArr[0] = (float) Math.cos(d7);
        fArr[1] = (float) (-Math.sin(d7));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d7);
        fArr[4] = (float) Math.cos(d7);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    private static final int zzl(int i7, String str) {
        int glCreateShader = GLES20.glCreateShader(i7);
        zzh("createShader");
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            zzh("shaderSource");
            GLES20.glCompileShader(glCreateShader);
            zzh("compileShader");
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            zzh("getShaderiv");
            if (iArr[0] == 0) {
                Log.e("SphericalVideoRenderer", "Could not compile shader " + i7 + ":");
                Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(glCreateShader));
                GLES20.glDeleteShader(glCreateShader);
                zzh("deleteShader");
                return 0;
            }
        }
        return glCreateShader;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.zzs++;
        synchronized (this.zzv) {
            this.zzv.notifyAll();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01c4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00af  */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object[] objArr;
        int zzl;
        int glCreateProgram;
        char c3 = 2;
        int i7 = 3;
        if (this.zzp == null) {
            int i8 = J.f3546b;
            j.d("SphericalVideoProcessor started with no output texture.");
            this.zzu.countDown();
            return;
        }
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.zzw = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.zzx = eglGetDisplay;
        if (eglGetDisplay != EGL10.EGL_NO_DISPLAY) {
            if (this.zzw.eglInitialize(eglGetDisplay, new int[2])) {
                int[] iArr = new int[1];
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                EGLConfig eGLConfig = (this.zzw.eglChooseConfig(this.zzx, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 16, 12344}, eGLConfigArr, 1, iArr) && iArr[0] > 0) ? eGLConfigArr[0] : null;
                if (eGLConfig != null) {
                    EGL10 egl102 = this.zzw;
                    EGLDisplay eGLDisplay = this.zzx;
                    EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
                    EGLContext eglCreateContext = egl102.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, new int[]{12440, 2, 12344});
                    this.zzy = eglCreateContext;
                    if (eglCreateContext != null && eglCreateContext != eGLContext) {
                        EGLSurface eglCreateWindowSurface = this.zzw.eglCreateWindowSurface(this.zzx, eGLConfig, this.zzp, null);
                        this.zzz = eglCreateWindowSurface;
                        if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE && this.zzw.eglMakeCurrent(this.zzx, eglCreateWindowSurface, eglCreateWindowSurface, this.zzy)) {
                            objArr = true;
                            zzbbp zzbbpVar = zzbby.zzbv;
                            C0254t c0254t = C0254t.f2723d;
                            zzl = zzl(35633, ((String) c0254t.f2726c.zzb(zzbbpVar)).equals(zzbbpVar.zzk()) ? (String) c0254t.f2726c.zzb(zzbbpVar) : "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}");
                            if (zzl != 0) {
                                zzbbp zzbbpVar2 = zzbby.zzbw;
                                int zzl2 = zzl(35632, !((String) c0254t.f2726c.zzb(zzbbpVar2)).equals(zzbbpVar2.zzk()) ? (String) c0254t.f2726c.zzb(zzbbpVar2) : "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}");
                                if (zzl2 != 0) {
                                    glCreateProgram = GLES20.glCreateProgram();
                                    zzh("createProgram");
                                    if (glCreateProgram != 0) {
                                        GLES20.glAttachShader(glCreateProgram, zzl);
                                        zzh("attachShader");
                                        GLES20.glAttachShader(glCreateProgram, zzl2);
                                        zzh("attachShader");
                                        GLES20.glLinkProgram(glCreateProgram);
                                        zzh("linkProgram");
                                        int[] iArr2 = new int[1];
                                        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr2, 0);
                                        zzh("getProgramiv");
                                        if (iArr2[0] != 1) {
                                            Log.e("SphericalVideoRenderer", "Could not link program: ");
                                            Log.e("SphericalVideoRenderer", GLES20.glGetProgramInfoLog(glCreateProgram));
                                            GLES20.glDeleteProgram(glCreateProgram);
                                            zzh("deleteProgram");
                                        } else {
                                            GLES20.glValidateProgram(glCreateProgram);
                                            zzh("validateProgram");
                                        }
                                    }
                                    this.zzq = glCreateProgram;
                                    GLES20.glUseProgram(glCreateProgram);
                                    zzh("useProgram");
                                    int glGetAttribLocation = GLES20.glGetAttribLocation(this.zzq, "aPosition");
                                    GLES20.glVertexAttribPointer(glGetAttribLocation, 3, 5126, false, 12, (Buffer) this.zzt);
                                    zzh("vertexAttribPointer");
                                    GLES20.glEnableVertexAttribArray(glGetAttribLocation);
                                    zzh("enableVertexAttribArray");
                                    int[] iArr3 = new int[1];
                                    GLES20.glGenTextures(1, iArr3, 0);
                                    zzh("genTextures");
                                    int i9 = iArr3[0];
                                    GLES20.glBindTexture(36197, i9);
                                    zzh("bindTextures");
                                    GLES20.glTexParameteri(36197, 10240, 9729);
                                    zzh("texParameteri");
                                    GLES20.glTexParameteri(36197, 10241, 9729);
                                    zzh("texParameteri");
                                    GLES20.glTexParameteri(36197, 10242, 33071);
                                    zzh("texParameteri");
                                    GLES20.glTexParameteri(36197, 10243, 33071);
                                    zzh("texParameteri");
                                    int glGetUniformLocation = GLES20.glGetUniformLocation(this.zzq, "uVMat");
                                    this.zzr = glGetUniformLocation;
                                    GLES20.glUniformMatrix3fv(glGetUniformLocation, 1, false, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, 0);
                                    int i10 = this.zzq;
                                    if (objArr == true || i10 == 0) {
                                        String valueOf = String.valueOf(GLUtils.getEGLErrorString(this.zzw.eglGetError()));
                                        int i11 = J.f3546b;
                                        String concat = "EGL initialization failed: ".concat(valueOf);
                                        j.d(concat);
                                        o.f1952C.f1961g.zzw(new Throwable(concat), "SphericalVideoProcessor.run.1");
                                        zzg();
                                        this.zzu.countDown();
                                    }
                                    SurfaceTexture surfaceTexture = new SurfaceTexture(i9);
                                    this.zzo = surfaceTexture;
                                    surfaceTexture.setOnFrameAvailableListener(this);
                                    this.zzu.countDown();
                                    this.zzb.zzc();
                                    try {
                                        try {
                                            this.zzA = true;
                                            while (!this.zzB) {
                                                while (this.zzs > 0) {
                                                    this.zzo.updateTexImage();
                                                    this.zzs--;
                                                }
                                                if (this.zzb.zze(this.zzc)) {
                                                    if (Float.isNaN(this.zzj)) {
                                                        float[] fArr = this.zzc;
                                                        float[] fArr2 = new float[i7];
                                                        // fill-array-data instruction
                                                        fArr2[0] = 0.0f;
                                                        fArr2[1] = 1.0f;
                                                        fArr2[2] = 0.0f;
                                                        float f7 = fArr[0];
                                                        float f8 = fArr2[0];
                                                        float f9 = fArr[1];
                                                        float f10 = fArr2[1];
                                                        float f11 = (fArr[c3] * 0.0f) + (f9 * f10) + (f7 * f8);
                                                        float f12 = (fArr[5] * 0.0f) + (fArr[i7] * f8) + (fArr[4] * f10);
                                                        float f13 = (fArr[8] * 0.0f) + (fArr[6] * f8) + (fArr[7] * f10);
                                                        float[] fArr3 = new float[i7];
                                                        fArr3[0] = f11;
                                                        fArr3[1] = f12;
                                                        fArr3[c3] = f13;
                                                        this.zzj = -(((float) Math.atan2(fArr3[1], fArr3[0])) - 1.5707964f);
                                                    }
                                                    zzk(this.zzh, this.zzj + this.zzk);
                                                } else {
                                                    zzj(this.zzc, -1.5707964f);
                                                    zzk(this.zzh, this.zzk);
                                                }
                                                zzj(this.zzd, 1.5707964f);
                                                zzi(this.zze, this.zzh, this.zzd);
                                                zzi(this.zzf, this.zzc, this.zze);
                                                zzj(this.zzg, this.zzl);
                                                zzi(this.zzi, this.zzg, this.zzf);
                                                GLES20.glUniformMatrix3fv(this.zzr, 1, false, this.zzi, 0);
                                                GLES20.glDrawArrays(5, 0, 4);
                                                zzh("drawArrays");
                                                GLES20.glFinish();
                                                this.zzw.eglSwapBuffers(this.zzx, this.zzz);
                                                if (this.zzA) {
                                                    GLES20.glViewport(0, 0, this.zzn, this.zzm);
                                                    zzh("viewport");
                                                    int glGetUniformLocation2 = GLES20.glGetUniformLocation(this.zzq, "uFOVx");
                                                    int glGetUniformLocation3 = GLES20.glGetUniformLocation(this.zzq, "uFOVy");
                                                    int i12 = this.zzn;
                                                    int i13 = this.zzm;
                                                    if (i12 > i13) {
                                                        GLES20.glUniform1f(glGetUniformLocation2, 0.87266463f);
                                                        GLES20.glUniform1f(glGetUniformLocation3, (this.zzm * 0.87266463f) / this.zzn);
                                                    } else {
                                                        GLES20.glUniform1f(glGetUniformLocation2, (i12 * 0.87266463f) / i13);
                                                        GLES20.glUniform1f(glGetUniformLocation3, 0.87266463f);
                                                    }
                                                    this.zzA = false;
                                                }
                                                try {
                                                    synchronized (this.zzv) {
                                                        try {
                                                            if (!this.zzB && !this.zzA && this.zzs == 0) {
                                                                this.zzv.wait();
                                                            }
                                                        } catch (Throwable th) {
                                                            throw th;
                                                        }
                                                    }
                                                } catch (InterruptedException unused) {
                                                }
                                                c3 = 2;
                                                i7 = 3;
                                            }
                                        } finally {
                                            this.zzb.zzd();
                                            this.zzo.setOnFrameAvailableListener(null);
                                            this.zzo = null;
                                            zzg();
                                        }
                                    } catch (IllegalStateException unused2) {
                                        int i14 = J.f3546b;
                                        j.g("SphericalVideoProcessor halted unexpectedly.");
                                        return;
                                    } catch (Throwable th2) {
                                        int i15 = J.f3546b;
                                        j.e("SphericalVideoProcessor died.", th2);
                                        o.f1952C.f1961g.zzw(th2, "SphericalVideoProcessor.run.2");
                                        return;
                                    }
                                    return;
                                }
                            }
                            glCreateProgram = 0;
                            this.zzq = glCreateProgram;
                            GLES20.glUseProgram(glCreateProgram);
                            zzh("useProgram");
                            int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.zzq, "aPosition");
                            GLES20.glVertexAttribPointer(glGetAttribLocation2, 3, 5126, false, 12, (Buffer) this.zzt);
                            zzh("vertexAttribPointer");
                            GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
                            zzh("enableVertexAttribArray");
                            int[] iArr32 = new int[1];
                            GLES20.glGenTextures(1, iArr32, 0);
                            zzh("genTextures");
                            int i92 = iArr32[0];
                            GLES20.glBindTexture(36197, i92);
                            zzh("bindTextures");
                            GLES20.glTexParameteri(36197, 10240, 9729);
                            zzh("texParameteri");
                            GLES20.glTexParameteri(36197, 10241, 9729);
                            zzh("texParameteri");
                            GLES20.glTexParameteri(36197, 10242, 33071);
                            zzh("texParameteri");
                            GLES20.glTexParameteri(36197, 10243, 33071);
                            zzh("texParameteri");
                            int glGetUniformLocation4 = GLES20.glGetUniformLocation(this.zzq, "uVMat");
                            this.zzr = glGetUniformLocation4;
                            GLES20.glUniformMatrix3fv(glGetUniformLocation4, 1, false, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, 0);
                            int i102 = this.zzq;
                            if (objArr == true) {
                            }
                            String valueOf2 = String.valueOf(GLUtils.getEGLErrorString(this.zzw.eglGetError()));
                            int i112 = J.f3546b;
                            String concat2 = "EGL initialization failed: ".concat(valueOf2);
                            j.d(concat2);
                            o.f1952C.f1961g.zzw(new Throwable(concat2), "SphericalVideoProcessor.run.1");
                            zzg();
                            this.zzu.countDown();
                        }
                    }
                }
            }
        }
        objArr = false;
        zzbbp zzbbpVar3 = zzbby.zzbv;
        C0254t c0254t2 = C0254t.f2723d;
        zzl = zzl(35633, ((String) c0254t2.f2726c.zzb(zzbbpVar3)).equals(zzbbpVar3.zzk()) ? (String) c0254t2.f2726c.zzb(zzbbpVar3) : "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}");
        if (zzl != 0) {
        }
        glCreateProgram = 0;
        this.zzq = glCreateProgram;
        GLES20.glUseProgram(glCreateProgram);
        zzh("useProgram");
        int glGetAttribLocation22 = GLES20.glGetAttribLocation(this.zzq, "aPosition");
        GLES20.glVertexAttribPointer(glGetAttribLocation22, 3, 5126, false, 12, (Buffer) this.zzt);
        zzh("vertexAttribPointer");
        GLES20.glEnableVertexAttribArray(glGetAttribLocation22);
        zzh("enableVertexAttribArray");
        int[] iArr322 = new int[1];
        GLES20.glGenTextures(1, iArr322, 0);
        zzh("genTextures");
        int i922 = iArr322[0];
        GLES20.glBindTexture(36197, i922);
        zzh("bindTextures");
        GLES20.glTexParameteri(36197, 10240, 9729);
        zzh("texParameteri");
        GLES20.glTexParameteri(36197, 10241, 9729);
        zzh("texParameteri");
        GLES20.glTexParameteri(36197, 10242, 33071);
        zzh("texParameteri");
        GLES20.glTexParameteri(36197, 10243, 33071);
        zzh("texParameteri");
        int glGetUniformLocation42 = GLES20.glGetUniformLocation(this.zzq, "uVMat");
        this.zzr = glGetUniformLocation42;
        GLES20.glUniformMatrix3fv(glGetUniformLocation42, 1, false, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, 0);
        int i1022 = this.zzq;
        if (objArr == true) {
        }
        String valueOf22 = String.valueOf(GLUtils.getEGLErrorString(this.zzw.eglGetError()));
        int i1122 = J.f3546b;
        String concat22 = "EGL initialization failed: ".concat(valueOf22);
        j.d(concat22);
        o.f1952C.f1961g.zzw(new Throwable(concat22), "SphericalVideoProcessor.run.1");
        zzg();
        this.zzu.countDown();
    }

    @Override // com.google.android.gms.internal.ads.zzcas
    public final void zza() {
        synchronized (this.zzv) {
            this.zzv.notifyAll();
        }
    }

    public final SurfaceTexture zzb() {
        if (this.zzp == null) {
            return null;
        }
        try {
            this.zzu.await();
        } catch (InterruptedException unused) {
        }
        return this.zzo;
    }

    public final void zzc(int i7, int i8) {
        synchronized (this.zzv) {
            this.zzn = i7;
            this.zzm = i8;
            this.zzA = true;
            this.zzv.notifyAll();
        }
    }

    public final void zzd(SurfaceTexture surfaceTexture, int i7, int i8) {
        this.zzn = i7;
        this.zzm = i8;
        this.zzp = surfaceTexture;
    }

    public final void zze() {
        synchronized (this.zzv) {
            this.zzB = true;
            this.zzp = null;
            this.zzv.notifyAll();
        }
    }

    public final void zzf(float f7, float f8) {
        int i7 = this.zzn;
        int i8 = this.zzm;
        if (i7 <= i8) {
            i7 = i8;
        }
        float f9 = i7;
        this.zzk -= (f7 * 1.7453293f) / f9;
        float f10 = this.zzl - ((f8 * 1.7453293f) / f9);
        this.zzl = f10;
        if (f10 < -1.5707964f) {
            this.zzl = -1.5707964f;
            f10 = -1.5707964f;
        }
        if (f10 > 1.5707964f) {
            this.zzl = 1.5707964f;
        }
    }

    public final boolean zzg() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.zzz;
        boolean z4 = false;
        if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
            z4 = this.zzw.eglDestroySurface(this.zzx, this.zzz) | this.zzw.eglMakeCurrent(this.zzx, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.zzz = null;
        }
        EGLContext eGLContext = this.zzy;
        if (eGLContext != null) {
            z4 |= this.zzw.eglDestroyContext(this.zzx, eGLContext);
            this.zzy = null;
        }
        EGLDisplay eGLDisplay = this.zzx;
        if (eGLDisplay == null) {
            return z4;
        }
        boolean eglTerminate = this.zzw.eglTerminate(eGLDisplay) | z4;
        this.zzx = null;
        return eglTerminate;
    }
}
