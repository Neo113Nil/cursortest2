package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzchl extends java.lang.Thread implements android.graphics.SurfaceTexture.OnFrameAvailableListener, com.google.android.gms.internal.ads.zzchj {
    private static final float[] zza = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};
    private volatile boolean zzA;
    private volatile boolean zzB;
    private final com.google.android.gms.internal.ads.zzchk zzb;
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
    private android.graphics.SurfaceTexture zzo;
    private android.graphics.SurfaceTexture zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private final java.nio.FloatBuffer zzt;
    private final java.util.concurrent.CountDownLatch zzu;
    private final java.lang.Object zzv;
    private javax.microedition.khronos.egl.EGL10 zzw;
    private javax.microedition.khronos.egl.EGLDisplay zzx;
    private javax.microedition.khronos.egl.EGLContext zzy;
    private javax.microedition.khronos.egl.EGLSurface zzz;

    public zzchl(android.content.Context context) {
        super("SphericalVideoProcessor");
        float[] fArr = zza;
        int length = fArr.length;
        java.nio.FloatBuffer asFloatBuffer = java.nio.ByteBuffer.allocateDirect(48).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
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
        com.google.android.gms.internal.ads.zzchk zzchkVar = new com.google.android.gms.internal.ads.zzchk(context);
        this.zzb = zzchkVar;
        zzchkVar.zzc(this);
        this.zzu = new java.util.concurrent.CountDownLatch(1);
        this.zzv = new java.lang.Object();
    }

    private static final void zzh(java.lang.String str) {
        int glGetError = android.opengl.GLES20.glGetError();
        if (glGetError != 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 10 + java.lang.String.valueOf(glGetError).length());
            sb.append(str);
            sb.append(": glError ");
            sb.append(glGetError);
            android.util.Log.e("SphericalVideoRenderer", sb.toString());
        }
    }

    private static final void zzi(float[] fArr, float[] fArr2, float[] fArr3) {
        float f = fArr2[0] * fArr3[0];
        float f2 = fArr2[1];
        float f3 = fArr3[3];
        float f4 = fArr2[2];
        float f5 = fArr3[6];
        fArr[0] = f + (f2 * f3) + (f4 * f5);
        float f6 = fArr2[0];
        float f7 = fArr3[1] * f6;
        float f8 = fArr3[4];
        float f9 = fArr3[7];
        fArr[1] = f7 + (f2 * f8) + (f4 * f9);
        float f10 = f6 * fArr3[2];
        float f11 = fArr2[1];
        float f12 = fArr3[5];
        float f13 = fArr3[8];
        fArr[2] = f10 + (f11 * f12) + (f4 * f13);
        float f14 = fArr2[3];
        float f15 = fArr3[0];
        float f16 = fArr2[4];
        float f17 = fArr2[5];
        fArr[3] = (f14 * f15) + (f3 * f16) + (f17 * f5);
        float f18 = fArr2[3];
        float f19 = fArr3[1];
        fArr[4] = (f18 * f19) + (f16 * f8) + (f17 * f9);
        float f20 = fArr3[2];
        fArr[5] = (f18 * f20) + (fArr2[4] * f12) + (f17 * f13);
        float f21 = fArr2[6] * f15;
        float f22 = fArr2[7];
        float f23 = fArr3[3] * f22;
        float f24 = fArr2[8];
        fArr[6] = f21 + f23 + (f5 * f24);
        float f25 = fArr2[6];
        fArr[7] = (f19 * f25) + (f22 * fArr3[4]) + (f9 * f24);
        fArr[8] = (f25 * f20) + (fArr2[7] * fArr3[5]) + (f24 * f13);
    }

    private static final void zzj(float[] fArr, float f) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d = f;
        fArr[4] = (float) java.lang.Math.cos(d);
        fArr[5] = (float) (-java.lang.Math.sin(d));
        fArr[6] = 0.0f;
        fArr[7] = (float) java.lang.Math.sin(d);
        fArr[8] = (float) java.lang.Math.cos(d);
    }

    private static final void zzk(float[] fArr, float f) {
        double d = f;
        fArr[0] = (float) java.lang.Math.cos(d);
        fArr[1] = (float) (-java.lang.Math.sin(d));
        fArr[2] = 0.0f;
        fArr[3] = (float) java.lang.Math.sin(d);
        fArr[4] = (float) java.lang.Math.cos(d);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    private static final int zzl(int i, java.lang.String str) {
        int glCreateShader = android.opengl.GLES20.glCreateShader(i);
        zzh("createShader");
        if (glCreateShader != 0) {
            android.opengl.GLES20.glShaderSource(glCreateShader, str);
            zzh("shaderSource");
            android.opengl.GLES20.glCompileShader(glCreateShader);
            zzh("compileShader");
            int[] iArr = new int[1];
            android.opengl.GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            zzh("getShaderiv");
            if (iArr[0] == 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 26);
                sb.append("Could not compile shader ");
                sb.append(i);
                sb.append(":");
                android.util.Log.e("SphericalVideoRenderer", sb.toString());
                android.util.Log.e("SphericalVideoRenderer", android.opengl.GLES20.glGetShaderInfoLog(glCreateShader));
                android.opengl.GLES20.glDeleteShader(glCreateShader);
                zzh("deleteShader");
                return 0;
            }
        }
        return glCreateShader;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        this.zzs++;
        java.lang.Object obj = this.zzv;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a3  */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        int zzl;
        int glCreateProgram;
        if (this.zzp == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("SphericalVideoProcessor started with no output texture.");
            this.zzu.countDown();
            return;
        }
        javax.microedition.khronos.egl.EGL10 egl10 = (javax.microedition.khronos.egl.EGL10) javax.microedition.khronos.egl.EGLContext.getEGL();
        this.zzw = egl10;
        javax.microedition.khronos.egl.EGLDisplay eglGetDisplay = egl10.eglGetDisplay(javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY);
        this.zzx = eglGetDisplay;
        if (eglGetDisplay != javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY) {
            if (this.zzw.eglInitialize(this.zzx, new int[2])) {
                int[] iArr = new int[1];
                javax.microedition.khronos.egl.EGLConfig[] eGLConfigArr = new javax.microedition.khronos.egl.EGLConfig[1];
                javax.microedition.khronos.egl.EGLConfig eGLConfig = (this.zzw.eglChooseConfig(this.zzx, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 16, 12344}, eGLConfigArr, 1, iArr) && iArr[0] > 0) ? eGLConfigArr[0] : null;
                if (eGLConfig != null) {
                    javax.microedition.khronos.egl.EGLContext eglCreateContext = this.zzw.eglCreateContext(this.zzx, eGLConfig, javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                    this.zzy = eglCreateContext;
                    if (eglCreateContext != null && eglCreateContext != javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT) {
                        javax.microedition.khronos.egl.EGLSurface eglCreateWindowSurface = this.zzw.eglCreateWindowSurface(this.zzx, eGLConfig, this.zzp, null);
                        this.zzz = eglCreateWindowSurface;
                        if (eglCreateWindowSurface != null && eglCreateWindowSurface != javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE) {
                            javax.microedition.khronos.egl.EGL10 egl102 = this.zzw;
                            javax.microedition.khronos.egl.EGLDisplay eGLDisplay = this.zzx;
                            javax.microedition.khronos.egl.EGLSurface eGLSurface = this.zzz;
                            if (egl102.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.zzy)) {
                                z = true;
                                com.google.android.gms.internal.ads.zzbih zzbihVar = com.google.android.gms.internal.ads.zzbiq.zzbV;
                                zzl = zzl(35633, ((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).equals(zzbihVar.zzf()) ? (java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar) : "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}");
                                if (zzl != 0) {
                                    com.google.android.gms.internal.ads.zzbih zzbihVar2 = com.google.android.gms.internal.ads.zzbiq.zzbW;
                                    int zzl2 = zzl(35632, !((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar2)).equals(zzbihVar2.zzf()) ? (java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar2) : "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}");
                                    if (zzl2 != 0) {
                                        glCreateProgram = android.opengl.GLES20.glCreateProgram();
                                        zzh("createProgram");
                                        if (glCreateProgram != 0) {
                                            android.opengl.GLES20.glAttachShader(glCreateProgram, zzl);
                                            zzh("attachShader");
                                            android.opengl.GLES20.glAttachShader(glCreateProgram, zzl2);
                                            zzh("attachShader");
                                            android.opengl.GLES20.glLinkProgram(glCreateProgram);
                                            zzh("linkProgram");
                                            int[] iArr2 = new int[1];
                                            android.opengl.GLES20.glGetProgramiv(glCreateProgram, 35714, iArr2, 0);
                                            zzh("getProgramiv");
                                            if (iArr2[0] != 1) {
                                                android.util.Log.e("SphericalVideoRenderer", "Could not link program: ");
                                                android.util.Log.e("SphericalVideoRenderer", android.opengl.GLES20.glGetProgramInfoLog(glCreateProgram));
                                                android.opengl.GLES20.glDeleteProgram(glCreateProgram);
                                                zzh("deleteProgram");
                                            } else {
                                                android.opengl.GLES20.glValidateProgram(glCreateProgram);
                                                zzh("validateProgram");
                                            }
                                        }
                                        this.zzq = glCreateProgram;
                                        android.opengl.GLES20.glUseProgram(glCreateProgram);
                                        zzh("useProgram");
                                        int glGetAttribLocation = android.opengl.GLES20.glGetAttribLocation(this.zzq, "aPosition");
                                        android.opengl.GLES20.glVertexAttribPointer(glGetAttribLocation, 3, 5126, false, 12, (java.nio.Buffer) this.zzt);
                                        zzh("vertexAttribPointer");
                                        android.opengl.GLES20.glEnableVertexAttribArray(glGetAttribLocation);
                                        zzh("enableVertexAttribArray");
                                        int[] iArr3 = new int[1];
                                        android.opengl.GLES20.glGenTextures(1, iArr3, 0);
                                        zzh("genTextures");
                                        int i2 = iArr3[0];
                                        android.opengl.GLES20.glBindTexture(36197, i2);
                                        zzh("bindTextures");
                                        android.opengl.GLES20.glTexParameteri(36197, androidx.work.Data.MAX_DATA_BYTES, 9729);
                                        zzh("texParameteri");
                                        android.opengl.GLES20.glTexParameteri(36197, 10241, 9729);
                                        zzh("texParameteri");
                                        android.opengl.GLES20.glTexParameteri(36197, 10242, 33071);
                                        zzh("texParameteri");
                                        android.opengl.GLES20.glTexParameteri(36197, 10243, 33071);
                                        zzh("texParameteri");
                                        int glGetUniformLocation = android.opengl.GLES20.glGetUniformLocation(this.zzq, "uVMat");
                                        this.zzr = glGetUniformLocation;
                                        android.opengl.GLES20.glUniformMatrix3fv(glGetUniformLocation, 1, false, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, 0);
                                        int i3 = this.zzq;
                                        if (z || i3 == 0) {
                                            java.lang.String eGLErrorString = android.opengl.GLUtils.getEGLErrorString(this.zzw.eglGetError());
                                            java.lang.String.valueOf(eGLErrorString);
                                            java.lang.String valueOf = java.lang.String.valueOf(eGLErrorString);
                                            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                                            java.lang.String concat = "EGL initialization failed: ".concat(valueOf);
                                            com.google.android.gms.ads.internal.util.client.zzo.zzf(concat);
                                            com.google.android.gms.ads.internal.zzt.zzh().zzg(new java.lang.Throwable(concat), "SphericalVideoProcessor.run.1");
                                            zzg();
                                            this.zzu.countDown();
                                        }
                                        android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(i2);
                                        this.zzo = surfaceTexture;
                                        surfaceTexture.setOnFrameAvailableListener(this);
                                        this.zzu.countDown();
                                        com.google.android.gms.internal.ads.zzchk zzchkVar = this.zzb;
                                        zzchkVar.zza();
                                        try {
                                            try {
                                                this.zzA = true;
                                                while (!this.zzB) {
                                                    while (this.zzs > 0) {
                                                        this.zzo.updateTexImage();
                                                        this.zzs--;
                                                    }
                                                    float[] fArr = this.zzc;
                                                    if (zzchkVar.zze(fArr)) {
                                                        if (java.lang.Float.isNaN(this.zzj)) {
                                                            float[] fArr2 = {0.0f, 1.0f, 0.0f};
                                                            float f = fArr[0];
                                                            float f2 = fArr2[0];
                                                            float f3 = fArr[1];
                                                            float f4 = fArr2[1];
                                                            float f5 = (f * f2) + (f3 * f4) + (fArr[2] * 0.0f);
                                                            float f6 = (fArr[3] * f2) + (fArr[4] * f4) + (fArr[5] * 0.0f);
                                                            float f7 = fArr[6];
                                                            float f8 = fArr[7];
                                                            float f9 = fArr[8];
                                                            this.zzj = -(((float) java.lang.Math.atan2(f6, f5)) - 1.5707964f);
                                                        }
                                                        zzk(this.zzh, this.zzj + this.zzk);
                                                    } else {
                                                        zzj(fArr, -1.5707964f);
                                                        zzk(this.zzh, this.zzk);
                                                    }
                                                    float[] fArr3 = this.zzd;
                                                    zzj(fArr3, 1.5707964f);
                                                    float[] fArr4 = this.zze;
                                                    zzi(fArr4, this.zzh, fArr3);
                                                    float[] fArr5 = this.zzf;
                                                    zzi(fArr5, fArr, fArr4);
                                                    float[] fArr6 = this.zzg;
                                                    zzj(fArr6, this.zzl);
                                                    float[] fArr7 = this.zzi;
                                                    zzi(fArr7, fArr6, fArr5);
                                                    android.opengl.GLES20.glUniformMatrix3fv(this.zzr, 1, false, fArr7, 0);
                                                    android.opengl.GLES20.glDrawArrays(5, 0, 4);
                                                    zzh("drawArrays");
                                                    android.opengl.GLES20.glFinish();
                                                    this.zzw.eglSwapBuffers(this.zzx, this.zzz);
                                                    if (this.zzA) {
                                                        android.opengl.GLES20.glViewport(0, 0, this.zzn, this.zzm);
                                                        zzh("viewport");
                                                        int glGetUniformLocation2 = android.opengl.GLES20.glGetUniformLocation(this.zzq, "uFOVx");
                                                        int glGetUniformLocation3 = android.opengl.GLES20.glGetUniformLocation(this.zzq, "uFOVy");
                                                        int i5 = this.zzn;
                                                        int i6 = this.zzm;
                                                        if (i5 > i6) {
                                                            android.opengl.GLES20.glUniform1f(glGetUniformLocation2, 0.87266463f);
                                                            android.opengl.GLES20.glUniform1f(glGetUniformLocation3, (this.zzm * 0.87266463f) / this.zzn);
                                                        } else {
                                                            android.opengl.GLES20.glUniform1f(glGetUniformLocation2, (i5 * 0.87266463f) / i6);
                                                            android.opengl.GLES20.glUniform1f(glGetUniformLocation3, 0.87266463f);
                                                        }
                                                        this.zzA = false;
                                                    }
                                                    try {
                                                        java.lang.Object obj = this.zzv;
                                                        synchronized (obj) {
                                                            if (!this.zzB && !this.zzA && this.zzs == 0) {
                                                                obj.wait();
                                                            }
                                                        }
                                                    } catch (java.lang.InterruptedException unused) {
                                                    }
                                                }
                                            } finally {
                                                this.zzb.zzb();
                                                this.zzo.setOnFrameAvailableListener(null);
                                                this.zzo = null;
                                                zzg();
                                            }
                                        } catch (java.lang.IllegalStateException unused2) {
                                            int i7 = com.google.android.gms.ads.internal.util.zze.zza;
                                            com.google.android.gms.ads.internal.util.client.zzo.zzi("SphericalVideoProcessor halted unexpectedly.");
                                            return;
                                        } catch (java.lang.Throwable th) {
                                            int i8 = com.google.android.gms.ads.internal.util.zze.zza;
                                            com.google.android.gms.ads.internal.util.client.zzo.zzg("SphericalVideoProcessor died.", th);
                                            com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "SphericalVideoProcessor.run.2");
                                            return;
                                        }
                                        return;
                                    }
                                }
                                glCreateProgram = 0;
                                this.zzq = glCreateProgram;
                                android.opengl.GLES20.glUseProgram(glCreateProgram);
                                zzh("useProgram");
                                int glGetAttribLocation2 = android.opengl.GLES20.glGetAttribLocation(this.zzq, "aPosition");
                                android.opengl.GLES20.glVertexAttribPointer(glGetAttribLocation2, 3, 5126, false, 12, (java.nio.Buffer) this.zzt);
                                zzh("vertexAttribPointer");
                                android.opengl.GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
                                zzh("enableVertexAttribArray");
                                int[] iArr32 = new int[1];
                                android.opengl.GLES20.glGenTextures(1, iArr32, 0);
                                zzh("genTextures");
                                int i22 = iArr32[0];
                                android.opengl.GLES20.glBindTexture(36197, i22);
                                zzh("bindTextures");
                                android.opengl.GLES20.glTexParameteri(36197, androidx.work.Data.MAX_DATA_BYTES, 9729);
                                zzh("texParameteri");
                                android.opengl.GLES20.glTexParameteri(36197, 10241, 9729);
                                zzh("texParameteri");
                                android.opengl.GLES20.glTexParameteri(36197, 10242, 33071);
                                zzh("texParameteri");
                                android.opengl.GLES20.glTexParameteri(36197, 10243, 33071);
                                zzh("texParameteri");
                                int glGetUniformLocation4 = android.opengl.GLES20.glGetUniformLocation(this.zzq, "uVMat");
                                this.zzr = glGetUniformLocation4;
                                android.opengl.GLES20.glUniformMatrix3fv(glGetUniformLocation4, 1, false, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, 0);
                                int i32 = this.zzq;
                                if (z) {
                                }
                                java.lang.String eGLErrorString2 = android.opengl.GLUtils.getEGLErrorString(this.zzw.eglGetError());
                                java.lang.String.valueOf(eGLErrorString2);
                                java.lang.String valueOf2 = java.lang.String.valueOf(eGLErrorString2);
                                int i42 = com.google.android.gms.ads.internal.util.zze.zza;
                                java.lang.String concat2 = "EGL initialization failed: ".concat(valueOf2);
                                com.google.android.gms.ads.internal.util.client.zzo.zzf(concat2);
                                com.google.android.gms.ads.internal.zzt.zzh().zzg(new java.lang.Throwable(concat2), "SphericalVideoProcessor.run.1");
                                zzg();
                                this.zzu.countDown();
                            }
                        }
                    }
                }
            }
        }
        z = false;
        com.google.android.gms.internal.ads.zzbih zzbihVar3 = com.google.android.gms.internal.ads.zzbiq.zzbV;
        zzl = zzl(35633, ((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar3)).equals(zzbihVar3.zzf()) ? (java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar3) : "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}");
        if (zzl != 0) {
        }
        glCreateProgram = 0;
        this.zzq = glCreateProgram;
        android.opengl.GLES20.glUseProgram(glCreateProgram);
        zzh("useProgram");
        int glGetAttribLocation22 = android.opengl.GLES20.glGetAttribLocation(this.zzq, "aPosition");
        android.opengl.GLES20.glVertexAttribPointer(glGetAttribLocation22, 3, 5126, false, 12, (java.nio.Buffer) this.zzt);
        zzh("vertexAttribPointer");
        android.opengl.GLES20.glEnableVertexAttribArray(glGetAttribLocation22);
        zzh("enableVertexAttribArray");
        int[] iArr322 = new int[1];
        android.opengl.GLES20.glGenTextures(1, iArr322, 0);
        zzh("genTextures");
        int i222 = iArr322[0];
        android.opengl.GLES20.glBindTexture(36197, i222);
        zzh("bindTextures");
        android.opengl.GLES20.glTexParameteri(36197, androidx.work.Data.MAX_DATA_BYTES, 9729);
        zzh("texParameteri");
        android.opengl.GLES20.glTexParameteri(36197, 10241, 9729);
        zzh("texParameteri");
        android.opengl.GLES20.glTexParameteri(36197, 10242, 33071);
        zzh("texParameteri");
        android.opengl.GLES20.glTexParameteri(36197, 10243, 33071);
        zzh("texParameteri");
        int glGetUniformLocation42 = android.opengl.GLES20.glGetUniformLocation(this.zzq, "uVMat");
        this.zzr = glGetUniformLocation42;
        android.opengl.GLES20.glUniformMatrix3fv(glGetUniformLocation42, 1, false, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, 0);
        int i322 = this.zzq;
        if (z) {
        }
        java.lang.String eGLErrorString22 = android.opengl.GLUtils.getEGLErrorString(this.zzw.eglGetError());
        java.lang.String.valueOf(eGLErrorString22);
        java.lang.String valueOf22 = java.lang.String.valueOf(eGLErrorString22);
        int i422 = com.google.android.gms.ads.internal.util.zze.zza;
        java.lang.String concat22 = "EGL initialization failed: ".concat(valueOf22);
        com.google.android.gms.ads.internal.util.client.zzo.zzf(concat22);
        com.google.android.gms.ads.internal.zzt.zzh().zzg(new java.lang.Throwable(concat22), "SphericalVideoProcessor.run.1");
        zzg();
        this.zzu.countDown();
    }

    @Override // com.google.android.gms.internal.ads.zzchj
    public final void zza() {
        java.lang.Object obj = this.zzv;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    public final void zzb(android.graphics.SurfaceTexture surfaceTexture, int i, int i2) {
        this.zzn = i;
        this.zzm = i2;
        this.zzp = surfaceTexture;
    }

    public final void zzc(int i, int i2) {
        java.lang.Object obj = this.zzv;
        synchronized (obj) {
            this.zzn = i;
            this.zzm = i2;
            this.zzA = true;
            obj.notifyAll();
        }
    }

    public final void zzd() {
        java.lang.Object obj = this.zzv;
        synchronized (obj) {
            this.zzB = true;
            this.zzp = null;
            obj.notifyAll();
        }
    }

    public final android.graphics.SurfaceTexture zze() {
        if (this.zzp == null) {
            return null;
        }
        try {
            this.zzu.await();
        } catch (java.lang.InterruptedException unused) {
        }
        return this.zzo;
    }

    public final void zzf(float f, float f2) {
        int i = this.zzn;
        int i2 = this.zzm;
        if (i <= i2) {
            i = i2;
        }
        float f3 = i;
        this.zzk -= (f * 1.7453293f) / f3;
        float f4 = this.zzl - ((f2 * 1.7453293f) / f3);
        this.zzl = f4;
        if (f4 < -1.5707964f) {
            this.zzl = -1.5707964f;
            f4 = -1.5707964f;
        }
        if (f4 > 1.5707964f) {
            this.zzl = 1.5707964f;
        }
    }

    final boolean zzg() {
        javax.microedition.khronos.egl.EGLSurface eGLSurface = this.zzz;
        boolean z = false;
        if (eGLSurface != null && eGLSurface != javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE) {
            z = this.zzw.eglDestroySurface(this.zzx, this.zzz) | this.zzw.eglMakeCurrent(this.zzx, javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE, javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE, javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT);
            this.zzz = null;
        }
        javax.microedition.khronos.egl.EGLContext eGLContext = this.zzy;
        if (eGLContext != null) {
            z |= this.zzw.eglDestroyContext(this.zzx, eGLContext);
            this.zzy = null;
        }
        javax.microedition.khronos.egl.EGLDisplay eGLDisplay = this.zzx;
        if (eGLDisplay == null) {
            return z;
        }
        boolean eglTerminate = this.zzw.eglTerminate(eGLDisplay) | z;
        this.zzx = null;
        return eglTerminate;
    }
}
