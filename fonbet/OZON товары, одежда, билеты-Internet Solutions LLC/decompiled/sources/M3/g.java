package M3;

import M3.e;
import android.opengl.GLES20;
import android.util.Log;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import m3.C8071m;
import m3.C8072n;

/* loaded from: classes8.dex */
final class g {

    /* renamed from: i, reason: collision with root package name */
    private static final float[] f17311i = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: j, reason: collision with root package name */
    private static final float[] f17312j = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    private static final float[] f17313k = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    private int f17314a;

    /* renamed from: b, reason: collision with root package name */
    private a f17315b;

    /* renamed from: c, reason: collision with root package name */
    private C8071m f17316c;

    /* renamed from: d, reason: collision with root package name */
    private int f17317d;

    /* renamed from: e, reason: collision with root package name */
    private int f17318e;

    /* renamed from: f, reason: collision with root package name */
    private int f17319f;

    /* renamed from: g, reason: collision with root package name */
    private int f17320g;

    /* renamed from: h, reason: collision with root package name */
    private int f17321h;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f17322a;

        /* renamed from: b, reason: collision with root package name */
        private final FloatBuffer f17323b;

        /* renamed from: c, reason: collision with root package name */
        private final FloatBuffer f17324c;

        /* renamed from: d, reason: collision with root package name */
        private final int f17325d;

        public a(e.b bVar) {
            float[] fArr = bVar.f17309c;
            this.f17322a = fArr.length / 3;
            this.f17323b = C8072n.d(fArr);
            this.f17324c = C8072n.d(bVar.f17310d);
            int i11 = bVar.f17308b;
            if (i11 == 1) {
                this.f17325d = 5;
            } else if (i11 != 2) {
                this.f17325d = 4;
            } else {
                this.f17325d = 6;
            }
        }
    }

    public static boolean c(e eVar) {
        e.a aVar = eVar.f17302a;
        if (aVar.b() != 1 || aVar.a().f17307a != 0) {
            return false;
        }
        e.a aVar2 = eVar.f17303b;
        return aVar2.b() == 1 && aVar2.a().f17307a == 0;
    }

    public final void a(float[] fArr, int i11) {
        a aVar = this.f17315b;
        if (aVar == null) {
            return;
        }
        int i12 = this.f17314a;
        GLES20.glUniformMatrix3fv(this.f17318e, 1, false, i12 == 1 ? f17312j : i12 == 2 ? f17313k : f17311i, 0);
        GLES20.glUniformMatrix4fv(this.f17317d, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i11);
        GLES20.glUniform1i(this.f17321h, 0);
        try {
            C8072n.b();
        } catch (C8072n.a e11) {
            Log.e("ProjectionRenderer", "Failed to bind uniforms", e11);
        }
        GLES20.glVertexAttribPointer(this.f17319f, 3, 5126, false, 12, (Buffer) aVar.f17323b);
        try {
            C8072n.b();
        } catch (C8072n.a e12) {
            Log.e("ProjectionRenderer", "Failed to load position data", e12);
        }
        GLES20.glVertexAttribPointer(this.f17320g, 2, 5126, false, 8, (Buffer) aVar.f17324c);
        try {
            C8072n.b();
        } catch (C8072n.a e13) {
            Log.e("ProjectionRenderer", "Failed to load texture data", e13);
        }
        GLES20.glDrawArrays(aVar.f17325d, 0, aVar.f17322a);
        try {
            C8072n.b();
        } catch (C8072n.a e14) {
            Log.e("ProjectionRenderer", "Failed to render", e14);
        }
    }

    public final void b() {
        try {
            C8071m c8071m = new C8071m("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f17316c = c8071m;
            this.f17317d = c8071m.c("uMvpMatrix");
            this.f17318e = this.f17316c.c("uTexMatrix");
            this.f17319f = this.f17316c.b("aPosition");
            this.f17320g = this.f17316c.b("aTexCoords");
            this.f17321h = this.f17316c.c("uTexture");
        } catch (C8072n.a e11) {
            Log.e("ProjectionRenderer", "Failed to initialize the program", e11);
        }
    }

    public final void d(e eVar) {
        if (c(eVar)) {
            this.f17314a = eVar.f17304c;
            this.f17315b = new a(eVar.f17302a.a());
            if (eVar.f17305d) {
                return;
            }
            new a(eVar.f17303b.a());
        }
    }
}
