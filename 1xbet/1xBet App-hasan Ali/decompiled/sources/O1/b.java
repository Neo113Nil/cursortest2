package O1;

import java.util.concurrent.Executor;
import o.C2191a;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Executor {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f4044k;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f4044k) {
            case 0:
                runnable.run();
                break;
            default:
                C2191a.Q().f18496n.f18500o.execute(runnable);
                break;
        }
    }
}
