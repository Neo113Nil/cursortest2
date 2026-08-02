package E;

import io.sentry.android.replay.ReplayIntegration;
import kotlin.jvm.functions.Function0;

/* loaded from: classes8.dex */
public final /* synthetic */ class V implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6852a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6853b;

    public /* synthetic */ V(Object obj, int i11) {
        this.f6852a = i11;
        this.f6853b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6852a) {
            case 0:
                Y.a((Y) this.f6853b);
                break;
            case 1:
                ((Function0) this.f6853b).invoke();
                break;
            default:
                ReplayIntegration.p((ReplayIntegration) this.f6853b);
                break;
        }
    }
}
