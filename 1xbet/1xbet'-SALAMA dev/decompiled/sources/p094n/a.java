package p094n;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15284a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f15284a) {
            case 0:
                b.Y().f15287c.f15291d.execute(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
