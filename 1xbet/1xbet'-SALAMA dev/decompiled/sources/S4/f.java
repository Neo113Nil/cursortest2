package S4;

import Y4.D;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f6339a;

    public f(Executor executor) {
        if (executor == null) {
            this.f6339a = D.j;
        } else {
            this.f6339a = executor;
        }
    }
}
