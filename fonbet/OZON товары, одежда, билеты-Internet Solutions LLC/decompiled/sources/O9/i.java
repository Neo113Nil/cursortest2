package O9;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public final class i {

    /* renamed from: e, reason: collision with root package name */
    private static i f20115e;

    /* renamed from: a, reason: collision with root package name */
    private Handler f20116a;

    /* renamed from: b, reason: collision with root package name */
    private HandlerThread f20117b;

    /* renamed from: c, reason: collision with root package name */
    private int f20118c = 0;

    /* renamed from: d, reason: collision with root package name */
    private final Object f20119d = new Object();

    private i() {
    }

    private void a() {
        synchronized (this.f20119d) {
            try {
                if (this.f20116a == null) {
                    if (this.f20118c <= 0) {
                        throw new IllegalStateException("CameraThread is not open");
                    }
                    HandlerThread handlerThread = new HandlerThread("CameraThread");
                    this.f20117b = handlerThread;
                    handlerThread.start();
                    this.f20116a = new Handler(this.f20117b.getLooper());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static i d() {
        if (f20115e == null) {
            f20115e = new i();
        }
        return f20115e;
    }

    protected final void b() {
        synchronized (this.f20119d) {
            int i11 = this.f20118c - 1;
            this.f20118c = i11;
            if (i11 == 0) {
                synchronized (this.f20119d) {
                    this.f20117b.quit();
                    this.f20117b = null;
                    this.f20116a = null;
                }
            }
        }
    }

    protected final void c(Runnable runnable) {
        synchronized (this.f20119d) {
            a();
            this.f20116a.post(runnable);
        }
    }

    protected final void e(Runnable runnable) {
        synchronized (this.f20119d) {
            this.f20118c++;
            c(runnable);
        }
    }
}
