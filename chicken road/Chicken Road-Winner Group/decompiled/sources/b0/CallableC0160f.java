package b0;

import io.appmetrica.analytics.impl.C0920w0;
import io.appmetrica.analytics.impl.U;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;

/* renamed from: b0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC0160f implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2455a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2456b;

    public /* synthetic */ CallableC0160f(int i3, Object obj) {
        this.f2455a = i3;
        this.f2456b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f2455a) {
            case 0:
                return new C0161g((JsReplyProxyBoundaryInterface) this.f2456b);
            case 1:
                return U.e((U) this.f2456b);
            default:
                return ((C0920w0) this.f2456b).p();
        }
    }
}
