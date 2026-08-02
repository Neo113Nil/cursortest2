package M3;

import L3.u;
import M3.d;
import M3.k;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes8.dex */
public final class j extends GLSurfaceView {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f17339l = 0;

    /* renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList<b> f17340a;

    /* renamed from: b, reason: collision with root package name */
    private final SensorManager f17341b;

    /* renamed from: c, reason: collision with root package name */
    private final Sensor f17342c;

    /* renamed from: d, reason: collision with root package name */
    private final d f17343d;

    /* renamed from: e, reason: collision with root package name */
    private final Handler f17344e;

    /* renamed from: f, reason: collision with root package name */
    private final i f17345f;

    /* renamed from: g, reason: collision with root package name */
    private SurfaceTexture f17346g;

    /* renamed from: h, reason: collision with root package name */
    private Surface f17347h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f17348i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f17349j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f17350k;

    final class a implements GLSurfaceView.Renderer, k.a, d.a {

        /* renamed from: a, reason: collision with root package name */
        private final i f17351a;

        /* renamed from: d, reason: collision with root package name */
        private final float[] f17354d;

        /* renamed from: e, reason: collision with root package name */
        private final float[] f17355e;

        /* renamed from: f, reason: collision with root package name */
        private final float[] f17356f;

        /* renamed from: g, reason: collision with root package name */
        private float f17357g;

        /* renamed from: h, reason: collision with root package name */
        private float f17358h;

        /* renamed from: b, reason: collision with root package name */
        private final float[] f17352b = new float[16];

        /* renamed from: c, reason: collision with root package name */
        private final float[] f17353c = new float[16];

        /* renamed from: i, reason: collision with root package name */
        private final float[] f17359i = new float[16];

        /* renamed from: j, reason: collision with root package name */
        private final float[] f17360j = new float[16];

        public a(i iVar) {
            float[] fArr = new float[16];
            this.f17354d = fArr;
            float[] fArr2 = new float[16];
            this.f17355e = fArr2;
            float[] fArr3 = new float[16];
            this.f17356f = fArr3;
            this.f17351a = iVar;
            Matrix.setIdentityM(fArr, 0);
            Matrix.setIdentityM(fArr2, 0);
            Matrix.setIdentityM(fArr3, 0);
            this.f17358h = 3.1415927f;
        }

        @Override // M3.d.a
        public final synchronized void a(float f7, float[] fArr) {
            float[] fArr2 = this.f17354d;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            float f11 = -f7;
            this.f17358h = f11;
            Matrix.setRotateM(this.f17355e, 0, -this.f17357g, (float) Math.cos(f11), (float) Math.sin(this.f17358h), 0.0f);
        }

        public final synchronized void b(PointF pointF) {
            float f7 = pointF.y;
            this.f17357g = f7;
            Matrix.setRotateM(this.f17355e, 0, -f7, (float) Math.cos(this.f17358h), (float) Math.sin(this.f17358h), 0.0f);
            Matrix.setRotateM(this.f17356f, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.f17360j, 0, this.f17354d, 0, this.f17356f, 0);
                Matrix.multiplyMM(this.f17359i, 0, this.f17355e, 0, this.f17360j, 0);
            }
            Matrix.multiplyMM(this.f17353c, 0, this.f17352b, 0, this.f17359i, 0);
            this.f17351a.c(this.f17353c);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceChanged(GL10 gl10, int i11, int i12) {
            GLES20.glViewport(0, 0, i11, i12);
            float f7 = i11 / i12;
            Matrix.perspectiveM(this.f17352b, 0, f7 > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f7)) * 2.0d) : 90.0f, f7, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            j.c(j.this, this.f17351a.f());
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void A(Surface surface);

        void B();
    }

    public j(Context context) {
        super(context, null);
        this.f17340a = new CopyOnWriteArrayList<>();
        this.f17344e = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.f17341b = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.f17342c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        i iVar = new i();
        this.f17345f = iVar;
        a aVar = new a(iVar);
        View.OnTouchListener kVar = new k(context, aVar);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.f17343d = new d(windowManager.getDefaultDisplay(), kVar, aVar);
        this.f17348i = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(kVar);
    }

    public static void a(j jVar) {
        Surface surface = jVar.f17347h;
        if (surface != null) {
            Iterator<b> it = jVar.f17340a.iterator();
            while (it.hasNext()) {
                it.next().B();
            }
        }
        SurfaceTexture surfaceTexture = jVar.f17346g;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
        jVar.f17346g = null;
        jVar.f17347h = null;
    }

    public static void b(j jVar, SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = jVar.f17346g;
        Surface surface = jVar.f17347h;
        Surface surface2 = new Surface(surfaceTexture);
        jVar.f17346g = surfaceTexture;
        jVar.f17347h = surface2;
        Iterator<b> it = jVar.f17340a.iterator();
        while (it.hasNext()) {
            it.next().A(surface2);
        }
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    static void c(j jVar, SurfaceTexture surfaceTexture) {
        jVar.f17344e.post(new Cm.c(2, jVar, surfaceTexture));
    }

    private void i() {
        boolean z11 = this.f17348i && this.f17349j;
        Sensor sensor = this.f17342c;
        if (sensor == null || z11 == this.f17350k) {
            return;
        }
        d dVar = this.f17343d;
        SensorManager sensorManager = this.f17341b;
        if (z11) {
            sensorManager.registerListener(dVar, sensor, 0);
        } else {
            sensorManager.unregisterListener(dVar);
        }
        this.f17350k = z11;
    }

    public final void d(b bVar) {
        this.f17340a.add(bVar);
    }

    public final M3.a e() {
        return this.f17345f;
    }

    public final u f() {
        return this.f17345f;
    }

    public final Surface g() {
        return this.f17347h;
    }

    public final void h(b bVar) {
        this.f17340a.remove(bVar);
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f17344e.post(new Ec0.b(this, 1));
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.f17349j = false;
        i();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.f17349j = true;
        i();
    }
}
