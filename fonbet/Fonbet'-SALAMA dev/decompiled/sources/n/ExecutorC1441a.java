package n;

import java.util.concurrent.Executor;

/* renamed from: n.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC1441a implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15278a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f15278a) {
            case 0:
                C1442b.Y().f15281c.f15285d.execute(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
