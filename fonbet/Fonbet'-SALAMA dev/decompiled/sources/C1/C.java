package C1;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class C implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f1338a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f1338a.post(runnable);
    }
}
