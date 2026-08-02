package L3;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.Log;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import m3.C8071m;
import m3.C8072n;

/* loaded from: classes8.dex */
public final class s extends GLSurfaceView implements t {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f16426a = 0;

    private static final class a implements GLSurfaceView.Renderer {

        /* renamed from: j, reason: collision with root package name */
        private static final float[] f16427j = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};

        /* renamed from: k, reason: collision with root package name */
        private static final String[] f16428k = {"y_tex", "u_tex", "v_tex"};

        /* renamed from: l, reason: collision with root package name */
        private static final FloatBuffer f16429l = C8072n.d(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

        /* renamed from: a, reason: collision with root package name */
        private final s f16430a;

        /* renamed from: b, reason: collision with root package name */
        private final int[] f16431b = new int[3];

        /* renamed from: c, reason: collision with root package name */
        private final int[] f16432c = new int[3];

        /* renamed from: d, reason: collision with root package name */
        private final int[] f16433d = new int[3];

        /* renamed from: e, reason: collision with root package name */
        private final int[] f16434e = new int[3];

        /* renamed from: f, reason: collision with root package name */
        private final AtomicReference<s3.i> f16435f = new AtomicReference<>();

        /* renamed from: g, reason: collision with root package name */
        private C8071m f16436g;

        /* renamed from: h, reason: collision with root package name */
        private int f16437h;

        /* renamed from: i, reason: collision with root package name */
        private s3.i f16438i;

        public a(s sVar) {
            this.f16430a = sVar;
            for (int i11 = 0; i11 < 3; i11++) {
                int[] iArr = this.f16433d;
                this.f16434e[i11] = -1;
                iArr[i11] = -1;
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onDrawFrame(GL10 gl10) {
            s3.i andSet = this.f16435f.getAndSet(null);
            if (andSet == null && this.f16438i == null) {
                return;
            }
            if (andSet != null) {
                s3.i iVar = this.f16438i;
                if (iVar != null) {
                    iVar.getClass();
                    throw null;
                }
                this.f16438i = andSet;
            }
            this.f16438i.getClass();
            GLES20.glUniformMatrix3fv(this.f16437h, 1, false, f16427j, 0);
            throw null;
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceChanged(GL10 gl10, int i11, int i12) {
            GLES20.glViewport(0, 0, i11, i12);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            int[] iArr = this.f16432c;
            try {
                C8071m c8071m = new C8071m("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
                this.f16436g = c8071m;
                GLES20.glVertexAttribPointer(c8071m.b("in_pos"), 2, 5126, false, 0, (Buffer) f16429l);
                iArr[0] = this.f16436g.b("in_tc_y");
                iArr[1] = this.f16436g.b("in_tc_u");
                iArr[2] = this.f16436g.b("in_tc_v");
                this.f16437h = this.f16436g.c("mColorConversion");
                C8072n.b();
                int[] iArr2 = this.f16431b;
                try {
                    GLES20.glGenTextures(3, iArr2, 0);
                    for (int i11 = 0; i11 < 3; i11++) {
                        GLES20.glUniform1i(this.f16436g.c(f16428k[i11]), i11);
                        GLES20.glActiveTexture(33984 + i11);
                        C8072n.a(3553, iArr2[i11]);
                    }
                    C8072n.b();
                } catch (C8072n.a e11) {
                    Log.e("VideoDecoderGLSV", "Failed to set up the textures", e11);
                }
                C8072n.b();
            } catch (C8072n.a e12) {
                Log.e("VideoDecoderGLSV", "Failed to set up the textures and program", e12);
            }
        }
    }

    public s(Context context) {
        super(context, null);
        a aVar = new a(this);
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setRenderMode(0);
    }
}
