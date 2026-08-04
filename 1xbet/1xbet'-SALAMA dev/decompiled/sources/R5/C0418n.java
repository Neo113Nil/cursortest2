package R5;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: R5.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0418n implements DisplayManager.DisplayListener, p156w2.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DisplayManager f6193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f6194c;

    public /* synthetic */ C0418n(Object obj, DisplayManager displayManager, int i7) {
        this.f6192a = i7;
        this.f6194c = obj;
        this.f6193b = displayManager;
    }

    @Override // p156w2.k
    public void a() {
        this.f6193b.unregisterDisplayListener(this);
        this.f6194c = null;
    }

    @Override // p156w2.k
    public void h(F f7) {
        this.f6194c = f7;
        Handler handlerM = p151v2.t.m(null);
        DisplayManager displayManager = this.f6193b;
        displayManager.registerDisplayListener(this, handlerM);
        f7.d(displayManager.getDisplay(0));
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i7) {
        switch (this.f6192a) {
            case 0:
                Iterator it = ((ArrayList) this.f6194c).iterator();
                while (it.hasNext()) {
                    ((DisplayManager.DisplayListener) it.next()).onDisplayAdded(i7);
                }
                break;
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i7) {
        switch (this.f6192a) {
            case 0:
                if (this.f6193b.getDisplay(i7) != null) {
                    Iterator it = ((ArrayList) this.f6194c).iterator();
                    while (it.hasNext()) {
                        ((DisplayManager.DisplayListener) it.next()).onDisplayChanged(i7);
                    }
                    break;
                }
                break;
            case 1:
                if (i7 == 0) {
                    float refreshRate = this.f6193b.getDisplay(0).getRefreshRate();
                    io.flutter.view.r rVar = (io.flutter.view.r) this.f6194c;
                    rVar.f14356a = (long) (1.0E9d / ((double) refreshRate));
                    ((FlutterJNI) rVar.f14357b).setRefreshRateFPS(refreshRate);
                }
                break;
            default:
                F f7 = (F) this.f6194c;
                if (f7 != null && i7 == 0) {
                    f7.d(this.f6193b.getDisplay(0));
                    break;
                }
                break;
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i7) {
        switch (this.f6192a) {
            case 0:
                Iterator it = ((ArrayList) this.f6194c).iterator();
                while (it.hasNext()) {
                    ((DisplayManager.DisplayListener) it.next()).onDisplayRemoved(i7);
                }
                break;
        }
    }

    public C0418n(DisplayManager displayManager) {
        this.f6192a = 2;
        this.f6193b = displayManager;
    }

    private final void b(int i7) {
    }

    private final void c(int i7) {
    }

    private final void d(int i7) {
    }

    private final void e(int i7) {
    }
}
