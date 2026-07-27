package k1;

import java.util.concurrent.Executor;

/* renamed from: k1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC1212h implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ ExecutorC1212h f10688b = new ExecutorC1212h(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ ExecutorC1212h f10689c = new ExecutorC1212h(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10690a;

    public /* synthetic */ ExecutorC1212h(int i2) {
        this.f10690a = i2;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f10690a) {
            case 0:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
