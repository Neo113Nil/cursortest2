package H;

import java.util.concurrent.Executor;

/* loaded from: classes8.dex */
final class d implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private static volatile d f10333a;

    d() {
    }

    static Executor a() {
        if (f10333a != null) {
            return f10333a;
        }
        synchronized (d.class) {
            try {
                if (f10333a == null) {
                    f10333a = new d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f10333a;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
