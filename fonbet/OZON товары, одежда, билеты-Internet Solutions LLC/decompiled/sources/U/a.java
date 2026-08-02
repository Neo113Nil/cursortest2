package U;

import C.S;
import H.c;
import T.b;
import android.media.Image;
import android.media.ImageWriter;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.InterfaceC5104l0;
import androidx.camera.core.p;
import androidx.camera.core.q;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    private final ImageWriter f27234b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC5104l0 f27235c;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private final Surface f27237e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f27238f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f27239g;

    /* renamed from: a, reason: collision with root package name */
    private final Object f27233a = new Object();

    /* renamed from: d, reason: collision with root package name */
    private boolean f27236d = false;

    /* renamed from: h, reason: collision with root package name */
    long f27240h = -1;

    public a(@NonNull Surface surface, @NonNull Size size, boolean z11) {
        ImageWriter newInstance;
        this.f27239g = z11;
        boolean z12 = b.b() != null || z11;
        this.f27238f = z12;
        if (Build.VERSION.SDK_INT < 29 || !z12) {
            this.f27237e = surface;
            this.f27235c = null;
            this.f27234b = null;
            return;
        }
        S.a("CaptureOutputSurface", "Enabling intermediate surface");
        InterfaceC5104l0 a11 = q.a(size.getWidth(), size.getHeight(), 35, 2);
        this.f27235c = a11;
        this.f27237e = a11.a();
        newInstance = ImageWriter.newInstance(surface, 2, 35);
        this.f27234b = newInstance;
        a11.g(new B2.b(this), c.b());
    }

    public static void a(a aVar, InterfaceC5104l0 interfaceC5104l0) {
        Image image;
        synchronized (aVar.f27233a) {
            try {
                if (aVar.f27236d) {
                    return;
                }
                p d11 = interfaceC5104l0.d();
                if (d11 != null && (image = d11.getImage()) != null) {
                    if (aVar.f27239g) {
                        long j11 = aVar.f27240h;
                        if (j11 != -1) {
                            image.setTimestamp(j11);
                        }
                    }
                    aVar.f27234b.queueInputImage(image);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        synchronized (this.f27233a) {
            try {
                this.f27236d = true;
                if (Build.VERSION.SDK_INT >= 29 && this.f27238f) {
                    this.f27235c.f();
                    this.f27235c.close();
                    this.f27234b.close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    public final Surface c() {
        return this.f27237e;
    }

    public final void d(long j11) {
        if (this.f27239g) {
            this.f27240h = j11;
        }
    }
}
