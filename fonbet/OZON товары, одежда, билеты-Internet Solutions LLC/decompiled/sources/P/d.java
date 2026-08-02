package P;

import B0.A0;
import C.A;
import C.S;
import E0.C2942q;
import N.q;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import android.view.Surface;
import androidx.annotation.NonNull;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;
import spay.sdk.domain.model.FraudMonInfo;
import x2.i;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f20571a = {12344};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f20572b = {12445, 13632, 12344};

    /* renamed from: c, reason: collision with root package name */
    public static final String f20573c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f20574d;

    /* renamed from: e, reason: collision with root package name */
    private static final q f20575e;

    /* renamed from: f, reason: collision with root package name */
    private static final q f20576f;

    /* renamed from: g, reason: collision with root package name */
    private static final q f20577g;

    /* renamed from: h, reason: collision with root package name */
    public static final FloatBuffer f20578h;

    /* renamed from: i, reason: collision with root package name */
    public static final FloatBuffer f20579i;

    /* renamed from: j, reason: collision with root package name */
    public static final P.g f20580j;

    final class a implements q {
        @Override // N.q
        @NonNull
        public final String a() {
            Locale locale = Locale.US;
            return "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform float uAlphaScale;\nvoid main() {\n    vec4 src = texture2D(sTexture, vTextureCoord);\n    gl_FragColor = vec4(src.rgb, src.a * uAlphaScale);\n}\n";
        }
    }

    final class b implements q {
        @Override // N.q
        @NonNull
        public final String a() {
            Locale locale = Locale.US;
            return "#version 300 es\n#extension GL_OES_EGL_image_external_essl3 : require\nprecision mediump float;\nuniform samplerExternalOES sTexture;\nuniform float uAlphaScale;\nin vec2 vTextureCoord;\nout vec4 outColor;\n\nvoid main() {\n  vec4 src = texture(sTexture, vTextureCoord);\n  outColor = vec4(src.rgb, src.a * uAlphaScale);\n}";
        }
    }

    final class c implements q {
        @Override // N.q
        @NonNull
        public final String a() {
            Locale locale = Locale.US;
            return "#version 300 es\n#extension GL_EXT_YUV_target : require\nprecision mediump float;\nuniform __samplerExternal2DY2YEXT sTexture;\nuniform float uAlphaScale;\nin vec2 vTextureCoord;\nout vec4 outColor;\n\nvec3 yuvToRgb(vec3 yuv) {\n  const vec3 yuvOffset = vec3(0.0625, 0.5, 0.5);\n  const mat3 yuvToRgbColorMat = mat3(\n    1.1689f, 1.1689f, 1.1689f,\n    0.0000f, -0.1881f, 2.1502f,\n    1.6853f, -0.6530f, 0.0000f\n  );\n  return clamp(yuvToRgbColorMat * (yuv - yuvOffset), 0.0, 1.0);\n}\n\nvoid main() {\n  vec3 srcYuv = texture(sTexture, vTextureCoord).xyz;\n  vec3 srcRgb = yuvToRgb(srcYuv);\n  outColor = vec4(srcRgb, uAlphaScale);\n}";
        }
    }

    /* renamed from: P.d$d, reason: collision with other inner class name */
    public static class C0419d extends f {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class e {
        private static final /* synthetic */ e[] $VALUES;
        public static final e DEFAULT;
        public static final e UNKNOWN;
        public static final e YUV;

        static {
            e eVar = new e(FraudMonInfo.UNKNOWN, 0);
            UNKNOWN = eVar;
            e eVar2 = new e("DEFAULT", 1);
            DEFAULT = eVar2;
            e eVar3 = new e("YUV", 2);
            YUV = eVar3;
            $VALUES = new e[]{eVar, eVar2, eVar3};
        }

        private e() {
            throw null;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) $VALUES.clone();
        }
    }

    public static abstract class f {

        /* renamed from: a, reason: collision with root package name */
        protected int f20581a;

        /* renamed from: b, reason: collision with root package name */
        protected int f20582b = -1;

        /* renamed from: c, reason: collision with root package name */
        protected int f20583c = -1;

        /* renamed from: d, reason: collision with root package name */
        protected int f20584d = -1;

        /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        protected f(@NonNull String str, @NonNull String str2) {
            int i11;
            int i12;
            int i13;
            try {
                i11 = d.n(35633, str);
            } catch (IllegalArgumentException | IllegalStateException e11) {
                e = e11;
                i11 = -1;
                i12 = -1;
            }
            try {
                i12 = d.n(35632, str2);
                try {
                    i13 = GLES20.glCreateProgram();
                } catch (IllegalArgumentException | IllegalStateException e12) {
                    e = e12;
                    i13 = -1;
                }
                try {
                    d.e("glCreateProgram");
                    GLES20.glAttachShader(i13, i11);
                    d.e("glAttachShader");
                    GLES20.glAttachShader(i13, i12);
                    d.e("glAttachShader");
                    GLES20.glLinkProgram(i13);
                    int[] iArr = new int[1];
                    GLES20.glGetProgramiv(i13, 35714, iArr, 0);
                    if (iArr[0] == 1) {
                        this.f20581a = i13;
                        c();
                    } else {
                        throw new IllegalStateException("Could not link program: " + GLES20.glGetProgramInfoLog(i13));
                    }
                } catch (IllegalArgumentException e13) {
                    e = e13;
                    if (i11 != -1) {
                        GLES20.glDeleteShader(i11);
                    }
                    if (i12 != -1) {
                        GLES20.glDeleteShader(i12);
                    }
                    if (i13 != -1) {
                        GLES20.glDeleteProgram(i13);
                    }
                    throw e;
                } catch (IllegalStateException e14) {
                    e = e14;
                    if (i11 != -1) {
                    }
                    if (i12 != -1) {
                    }
                    if (i13 != -1) {
                    }
                    throw e;
                }
            } catch (IllegalArgumentException | IllegalStateException e15) {
                e = e15;
                i12 = -1;
                i13 = i12;
                if (i11 != -1) {
                }
                if (i12 != -1) {
                }
                if (i13 != -1) {
                }
                throw e;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            int i11 = this.f20581a;
            int glGetAttribLocation = GLES20.glGetAttribLocation(i11, "aPosition");
            this.f20584d = glGetAttribLocation;
            d.h(glGetAttribLocation, "aPosition");
            int glGetUniformLocation = GLES20.glGetUniformLocation(i11, "uTransMatrix");
            this.f20582b = glGetUniformLocation;
            d.h(glGetUniformLocation, "uTransMatrix");
            int glGetUniformLocation2 = GLES20.glGetUniformLocation(i11, "uAlphaScale");
            this.f20583c = glGetUniformLocation2;
            d.h(glGetUniformLocation2, "uAlphaScale");
        }

        public final void b() {
            GLES20.glDeleteProgram(this.f20581a);
        }

        public final void d(float f7) {
            GLES20.glUniform1f(this.f20583c, f7);
            d.e("glUniform1f");
        }

        public final void e(@NonNull float[] fArr) {
            GLES20.glUniformMatrix4fv(this.f20582b, 1, false, fArr, 0);
            d.e("glUniformMatrix4fv");
        }

        public void f() {
            GLES20.glUseProgram(this.f20581a);
            d.e("glUseProgram");
            GLES20.glEnableVertexAttribArray(this.f20584d);
            d.e("glEnableVertexAttribArray");
            GLES20.glVertexAttribPointer(this.f20584d, 2, 5126, false, 0, (Buffer) d.f20578h);
            d.e("glVertexAttribPointer");
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            e(fArr);
            d(1.0f);
        }
    }

    static {
        Locale locale = Locale.US;
        f20573c = "uniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
        f20574d = "#version 300 es\nin vec4 aPosition;\nin vec4 aTextureCoord;\nuniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nout vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uTransMatrix * aPosition;\n  vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
        f20575e = new a();
        f20576f = new b();
        f20577g = new c();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        asFloatBuffer.position(0);
        f20578h = asFloatBuffer;
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        asFloatBuffer2.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
        asFloatBuffer2.position(0);
        f20579i = asFloatBuffer2;
        f20580j = new P.c(EGL14.EGL_NO_SURFACE, 0, 0);
    }

    public static void d(@NonNull String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            return;
        }
        StringBuilder e11 = C2942q.e(str, ": EGL error: 0x");
        e11.append(Integer.toHexString(eglGetError));
        throw new IllegalStateException(e11.toString());
    }

    public static void e(@NonNull String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        StringBuilder e11 = C2942q.e(str, ": GL error 0x");
        e11.append(Integer.toHexString(glGetError));
        throw new IllegalStateException(e11.toString());
    }

    public static void f(Thread thread) {
        i.f("Method call must be called on the GL thread.", thread == Thread.currentThread());
    }

    public static void g(@NonNull AtomicBoolean atomicBoolean, boolean z11) {
        i.f(z11 ? "OpenGlRenderer is not initialized" : "OpenGlRenderer is already initialized", z11 == atomicBoolean.get());
    }

    public static void h(int i11, @NonNull String str) {
        if (i11 < 0) {
            throw new IllegalStateException(A0.b("Unable to locate '", str, "' in program"));
        }
    }

    @NonNull
    public static int[] i(@NonNull String str, @NonNull A a11) {
        int[] iArr = f20571a;
        if (a11.b() == 3) {
            if (str.contains("EGL_EXT_gl_colorspace_bt2020_hlg")) {
                return f20572b;
            }
            S.k("GLUtils", "Dynamic range uses HLG encoding, but device does not support EGL_EXT_gl_colorspace_bt2020_hlg.Fallback to default colorspace.");
        }
        return iArr;
    }

    @NonNull
    public static HashMap j(@NonNull A a11) {
        Object gVar;
        e eVar;
        Map map = Collections.EMPTY_MAP;
        HashMap hashMap = new HashMap();
        e[] values = e.values();
        int length = values.length;
        for (int i11 = 0; i11 < length; i11++) {
            e eVar2 = values[i11];
            q qVar = (q) map.get(eVar2);
            if (qVar != null) {
                gVar = new g(a11, qVar);
            } else if (eVar2 == e.YUV || eVar2 == (eVar = e.DEFAULT)) {
                gVar = new g(a11, eVar2);
            } else {
                i.f("Unhandled input format: " + eVar2, eVar2 == e.UNKNOWN);
                if (a11.c()) {
                    gVar = new C0419d("uniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n}\n", "precision mediump float;\nuniform float uAlphaScale;\nvoid main() {\n    gl_FragColor = vec4(0.0, 0.0, 0.0, uAlphaScale);\n}\n");
                } else {
                    q qVar2 = (q) map.get(eVar);
                    gVar = qVar2 != null ? new g(a11, qVar2) : new g(a11, eVar);
                }
            }
            Log.d("GLUtils", "Shader program for input format " + eVar2 + " created: " + gVar);
            hashMap.put(eVar2, gVar);
        }
        return hashMap;
    }

    public static int k() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        e("glGenTextures");
        int i11 = iArr[0];
        GLES20.glBindTexture(36197, i11);
        e("glBindTexture " + i11);
        GLES20.glTexParameteri(36197, 10241, 9728);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        e("glTexParameter");
        return i11;
    }

    @NonNull
    public static EGLSurface l(@NonNull EGLDisplay eGLDisplay, @NonNull EGLConfig eGLConfig, @NonNull Surface surface, @NonNull int[] iArr) {
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, iArr, 0);
        d("eglCreateWindowSurface");
        if (eglCreateWindowSurface != null) {
            return eglCreateWindowSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    @NonNull
    public static String m() {
        Matcher matcher = Pattern.compile("OpenGL ES ([0-9]+)\\.([0-9]+).*").matcher(GLES20.glGetString(7938));
        if (!matcher.find()) {
            return "0.0";
        }
        String group = matcher.group(1);
        group.getClass();
        String group2 = matcher.group(2);
        group2.getClass();
        return G.g.c(group, ".", group2);
    }

    public static int n(int i11, @NonNull String str) {
        int glCreateShader = GLES20.glCreateShader(i11);
        e("glCreateShader type=" + i11);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        S.k("GLUtils", "Could not compile shader: " + str);
        GLES20.glDeleteShader(glCreateShader);
        StringBuilder f7 = P4.f.f(i11, "Could not compile shader type ", ProductContainerDTO.RATIO_DELIMITER);
        f7.append(GLES20.glGetShaderInfoLog(glCreateShader));
        throw new IllegalStateException(f7.toString());
    }

    public static class g extends f {

        /* renamed from: e, reason: collision with root package name */
        private int f20585e;

        /* renamed from: f, reason: collision with root package name */
        private int f20586f;

        /* renamed from: g, reason: collision with root package name */
        private int f20587g;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public g(@NonNull A a11, @NonNull q qVar) {
            super(r3, r4);
            String str = a11.c() ? d.f20574d : d.f20573c;
            try {
                String a12 = qVar.a();
                if (a12 == null || !a12.contains("vTextureCoord") || !a12.contains("sTexture")) {
                    throw new IllegalArgumentException("Invalid fragment shader");
                }
                this.f20585e = -1;
                this.f20586f = -1;
                this.f20587g = -1;
                c();
                int i11 = this.f20581a;
                int glGetUniformLocation = GLES20.glGetUniformLocation(i11, "sTexture");
                this.f20585e = glGetUniformLocation;
                d.h(glGetUniformLocation, "sTexture");
                int glGetAttribLocation = GLES20.glGetAttribLocation(i11, "aTextureCoord");
                this.f20587g = glGetAttribLocation;
                d.h(glGetAttribLocation, "aTextureCoord");
                int glGetUniformLocation2 = GLES20.glGetUniformLocation(i11, "uTexMatrix");
                this.f20586f = glGetUniformLocation2;
                d.h(glGetUniformLocation2, "uTexMatrix");
            } catch (Throwable th2) {
                if (!(th2 instanceof IllegalArgumentException)) {
                    throw new IllegalArgumentException("Unable retrieve fragment shader source", th2);
                }
                throw th2;
            }
        }

        @Override // P.d.f
        public final void f() {
            super.f();
            GLES20.glUniform1i(this.f20585e, 0);
            GLES20.glEnableVertexAttribArray(this.f20587g);
            d.e("glEnableVertexAttribArray");
            GLES20.glVertexAttribPointer(this.f20587g, 2, 5126, false, 0, (Buffer) d.f20579i);
            d.e("glVertexAttribPointer");
        }

        public final void g(@NonNull float[] fArr) {
            GLES20.glUniformMatrix4fv(this.f20586f, 1, false, fArr, 0);
            d.e("glUniformMatrix4fv");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public g(@NonNull A a11, @NonNull e eVar) {
            this(a11, r5);
            q qVar;
            if (a11.c()) {
                i.a("No default sampler shader available for" + eVar, eVar != e.UNKNOWN);
                if (eVar == e.YUV) {
                    qVar = d.f20577g;
                } else {
                    qVar = d.f20576f;
                }
            } else {
                qVar = d.f20575e;
            }
        }
    }
}
