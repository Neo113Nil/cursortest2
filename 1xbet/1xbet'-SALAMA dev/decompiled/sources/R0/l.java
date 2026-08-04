package R0;

import S0.C0431b;
import S0.y;
import android.webkit.TracingController;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final S0.o f5861a;

    static {
        S0.o oVar = new S0.o();
        C0431b c0431b = S0.w.f6267A;
        if (c0431b.a()) {
            oVar.f6254a = TracingController.getInstance();
            oVar.f6255b = null;
        } else {
            if (!c0431b.b()) {
                throw S0.w.a();
            }
            oVar.f6254a = null;
            oVar.f6255b = y.f6312a.getTracingController();
        }
        f5861a = oVar;
    }
}
