package O9;

import android.content.Context;
import android.hardware.Camera;
import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import m9.C8109b;
import n9.C8455a;

/* loaded from: classes9.dex */
public final class f {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f20094n = 0;

    /* renamed from: a, reason: collision with root package name */
    private Camera f20095a;

    /* renamed from: b, reason: collision with root package name */
    private Camera.CameraInfo f20096b;

    /* renamed from: c, reason: collision with root package name */
    private O9.a f20097c;

    /* renamed from: d, reason: collision with root package name */
    private C8109b f20098d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f20099e;

    /* renamed from: f, reason: collision with root package name */
    private String f20100f;

    /* renamed from: h, reason: collision with root package name */
    private k f20102h;

    /* renamed from: i, reason: collision with root package name */
    private N9.m f20103i;

    /* renamed from: j, reason: collision with root package name */
    private N9.m f20104j;

    /* renamed from: l, reason: collision with root package name */
    private Context f20106l;

    /* renamed from: g, reason: collision with root package name */
    private g f20101g = new g();

    /* renamed from: k, reason: collision with root package name */
    private int f20105k = -1;

    /* renamed from: m, reason: collision with root package name */
    private final a f20107m = new a();

    private final class a implements Camera.PreviewCallback {

        /* renamed from: a, reason: collision with root package name */
        private n f20108a;

        /* renamed from: b, reason: collision with root package name */
        private N9.m f20109b;

        public a() {
        }

        public final void a(n nVar) {
            this.f20108a = nVar;
        }

        public final void b(N9.m mVar) {
            this.f20109b = mVar;
        }

        @Override // android.hardware.Camera.PreviewCallback
        public final void onPreviewFrame(byte[] bArr, Camera camera) {
            f fVar = f.this;
            N9.m mVar = this.f20109b;
            n nVar = this.f20108a;
            if (mVar == null || nVar == null) {
                Log.d("f", "Got preview callback, but no handler or resolution available");
                if (nVar != null) {
                    new Exception("No resolution available");
                    nVar.b();
                    return;
                }
                return;
            }
            try {
                if (bArr == null) {
                    throw new NullPointerException("No preview data received");
                }
                N9.n nVar2 = new N9.n(bArr, mVar.f18815a, mVar.f18816b, camera.getParameters().getPreviewFormat(), fVar.e());
                if (fVar.f20096b.facing == 1) {
                    nVar2.d();
                }
                nVar.a(nVar2);
            } catch (RuntimeException e11) {
                Log.e("f", "Camera preview failed", e11);
                nVar.b();
            }
        }
    }

    public f(Context context) {
        this.f20106l = context;
    }

    private int b() {
        int b11 = this.f20102h.b();
        int i11 = 0;
        if (b11 != 0) {
            if (b11 == 1) {
                i11 = 90;
            } else if (b11 == 2) {
                i11 = 180;
            } else if (b11 == 3) {
                i11 = 270;
            }
        }
        Camera.CameraInfo cameraInfo = this.f20096b;
        int i12 = cameraInfo.facing == 1 ? (360 - ((cameraInfo.orientation + i11) % 360)) % 360 : ((cameraInfo.orientation - i11) + 360) % 360;
        Log.i("f", "Camera Display Orientation: " + i12);
        return i12;
    }

    private void j(boolean z11) {
        String str;
        Camera.Parameters parameters = this.f20095a.getParameters();
        String str2 = this.f20100f;
        if (str2 == null) {
            this.f20100f = parameters.flatten();
        } else {
            parameters.unflatten(str2);
        }
        if (parameters == null) {
            Log.w("f", "Device error: no camera parameters are available. Proceeding without configuration.");
            return;
        }
        Log.i("f", "Initial camera parameters: " + parameters.flatten());
        if (z11) {
            Log.w("f", "In camera config safe mode -- most settings will not be honored");
        }
        c.b(parameters, this.f20101g.a(), z11);
        if (!z11) {
            c.c(parameters, false);
            this.f20101g.getClass();
            this.f20101g.getClass();
            this.f20101g.getClass();
        }
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        ArrayList arrayList = new ArrayList();
        if (supportedPreviewSizes == null) {
            Camera.Size previewSize = parameters.getPreviewSize();
            if (previewSize != null) {
                arrayList.add(new N9.m(previewSize.width, previewSize.height));
            }
        } else {
            for (Camera.Size size : supportedPreviewSizes) {
                arrayList.add(new N9.m(size.width, size.height));
            }
        }
        int[] iArr = null;
        if (arrayList.size() == 0) {
            this.f20103i = null;
        } else {
            k kVar = this.f20102h;
            int i11 = this.f20105k;
            if (i11 == -1) {
                throw new IllegalStateException("Rotation not calculated yet. Call configure() first.");
            }
            N9.m a11 = kVar.a(arrayList, i11 % 180 != 0);
            this.f20103i = a11;
            parameters.setPreviewSize(a11.f18815a, a11.f18816b);
        }
        if (Build.DEVICE.equals("glass-1")) {
            List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
            StringBuilder sb2 = new StringBuilder("Supported FPS ranges: ");
            if (supportedPreviewFpsRange == null || supportedPreviewFpsRange.isEmpty()) {
                str = "[]";
            } else {
                StringBuilder sb3 = new StringBuilder("[");
                Iterator<int[]> it = supportedPreviewFpsRange.iterator();
                while (it.hasNext()) {
                    sb3.append(Arrays.toString(it.next()));
                    if (it.hasNext()) {
                        sb3.append(", ");
                    }
                }
                sb3.append(']');
                str = sb3.toString();
            }
            sb2.append(str);
            Log.i("CameraConfiguration", sb2.toString());
            if (supportedPreviewFpsRange != null && !supportedPreviewFpsRange.isEmpty()) {
                Iterator<int[]> it2 = supportedPreviewFpsRange.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    int[] next = it2.next();
                    int i12 = next[0];
                    int i13 = next[1];
                    if (i12 >= 10000 && i13 <= 20000) {
                        iArr = next;
                        break;
                    }
                }
                if (iArr == null) {
                    Log.i("CameraConfiguration", "No suitable FPS range?");
                } else {
                    int[] iArr2 = new int[2];
                    parameters.getPreviewFpsRange(iArr2);
                    if (Arrays.equals(iArr2, iArr)) {
                        Log.i("CameraConfiguration", "FPS range already set to " + Arrays.toString(iArr));
                    } else {
                        Log.i("CameraConfiguration", "Setting FPS range to " + Arrays.toString(iArr));
                        parameters.setPreviewFpsRange(iArr[0], iArr[1]);
                    }
                }
            }
        }
        Log.i("f", "Final camera parameters: " + parameters.flatten());
        this.f20095a.setParameters(parameters);
    }

    public final void c() {
        Camera camera = this.f20095a;
        if (camera != null) {
            camera.release();
            this.f20095a = null;
        }
    }

    public final void d() {
        if (this.f20095a == null) {
            throw new RuntimeException("Camera not open");
        }
        try {
            int b11 = b();
            this.f20105k = b11;
            this.f20095a.setDisplayOrientation(b11);
        } catch (Exception unused) {
            Log.w("f", "Failed to set rotation.");
        }
        try {
            j(false);
        } catch (Exception unused2) {
            try {
                j(true);
            } catch (Exception unused3) {
                Log.w("f", "Camera rejected even safe-mode parameters! No configuration");
            }
        }
        Camera.Size previewSize = this.f20095a.getParameters().getPreviewSize();
        if (previewSize == null) {
            this.f20104j = this.f20103i;
        } else {
            this.f20104j = new N9.m(previewSize.width, previewSize.height);
        }
        this.f20107m.b(this.f20104j);
    }

    public final int e() {
        return this.f20105k;
    }

    public final N9.m f() {
        N9.m mVar = this.f20104j;
        if (mVar == null) {
            return null;
        }
        int i11 = this.f20105k;
        if (i11 != -1) {
            return i11 % 180 != 0 ? new N9.m(mVar.f18816b, mVar.f18815a) : mVar;
        }
        throw new IllegalStateException("Rotation not calculated yet. Call configure() first.");
    }

    public final void g() {
        int a11 = C8455a.a(this.f20101g.b());
        Camera open = a11 == -1 ? null : Camera.open(a11);
        this.f20095a = open;
        if (open == null) {
            throw new RuntimeException("Failed to open camera");
        }
        int a12 = C8455a.a(this.f20101g.b());
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        this.f20096b = cameraInfo;
        Camera.getCameraInfo(a12, cameraInfo);
    }

    public final void h(n nVar) {
        Camera camera = this.f20095a;
        if (camera == null || !this.f20099e) {
            return;
        }
        a aVar = this.f20107m;
        aVar.a(nVar);
        camera.setOneShotPreviewCallback(aVar);
    }

    public final void i(g gVar) {
        this.f20101g = gVar;
    }

    public final void k(k kVar) {
        this.f20102h = kVar;
    }

    public final void l(h hVar) throws IOException {
        hVar.a(this.f20095a);
    }

    public final void m(boolean z11) {
        String flashMode;
        Camera camera = this.f20095a;
        if (camera != null) {
            try {
                Camera.Parameters parameters = camera.getParameters();
                boolean z12 = false;
                if (parameters != null && (flashMode = parameters.getFlashMode()) != null && ("on".equals(flashMode) || "torch".equals(flashMode))) {
                    z12 = true;
                }
                if (z11 != z12) {
                    O9.a aVar = this.f20097c;
                    if (aVar != null) {
                        aVar.h();
                    }
                    Camera.Parameters parameters2 = this.f20095a.getParameters();
                    c.c(parameters2, z11);
                    this.f20101g.getClass();
                    this.f20095a.setParameters(parameters2);
                    O9.a aVar2 = this.f20097c;
                    if (aVar2 != null) {
                        aVar2.g();
                    }
                }
            } catch (RuntimeException e11) {
                Log.e("f", "Failed to set torch", e11);
            }
        }
    }

    public final void n() {
        Camera camera = this.f20095a;
        if (camera == null || this.f20099e) {
            return;
        }
        camera.startPreview();
        this.f20099e = true;
        this.f20097c = new O9.a(this.f20095a, this.f20101g);
        C8109b c8109b = new C8109b(this.f20106l, this, this.f20101g);
        this.f20098d = c8109b;
        c8109b.b();
    }

    public final void o() {
        O9.a aVar = this.f20097c;
        if (aVar != null) {
            aVar.h();
            this.f20097c = null;
        }
        if (this.f20098d != null) {
            this.f20098d = null;
        }
        Camera camera = this.f20095a;
        if (camera == null || !this.f20099e) {
            return;
        }
        camera.stopPreview();
        this.f20107m.a(null);
        this.f20099e = false;
    }
}
