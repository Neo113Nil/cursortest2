package S0;

import android.webkit.WebViewRenderProcess;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface;

/* loaded from: classes.dex */
public final class D extends R0.x {

    /* renamed from: c, reason: collision with root package name */
    public static final WeakHashMap f6231c = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    public WebViewRendererBoundaryInterface f6232a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f6233b;

    @Override // R0.x
    public final boolean a() {
        boolean terminate;
        C0431b c0431b = w.f6310z;
        if (!c0431b.a()) {
            if (c0431b.b()) {
                return this.f6232a.terminate();
            }
            throw w.a();
        }
        WebViewRenderProcess i7 = R1.r.i(this.f6233b.get());
        if (i7 != null) {
            terminate = i7.terminate();
            if (terminate) {
                return true;
            }
        }
        return false;
    }
}
