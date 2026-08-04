package S0;

import android.webkit.WebViewRenderProcess;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public final class D extends R0.x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final WeakHashMap f6231c = new WeakHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WebViewRendererBoundaryInterface f6232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f6233b;

    @Override // R0.x
    public final boolean a() {
        C0431b c0431b = w.f6310z;
        if (c0431b.a()) {
            WebViewRenderProcess webViewRenderProcessI = R1.r.i(this.f6233b.get());
            return webViewRenderProcessI != null && webViewRenderProcessI.terminate();
        }
        if (c0431b.b()) {
            return this.f6232a.terminate();
        }
        throw w.a();
    }
}
