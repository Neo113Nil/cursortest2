package W5;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class T1 implements Executor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f7057c = Logger.getLogger(T1.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f7058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayDeque f7059b;

    public final void a() {
        while (true) {
            Runnable runnable = (Runnable) this.f7059b.poll();
            if (runnable == null) {
                return;
            }
            try {
                runnable.run();
            } catch (Throwable th) {
                f7057c.log(Level.SEVERE, "Exception while executing runnable " + runnable, th);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        p113p3.f.k(runnable, "'task' must not be null.");
        if (this.f7058a) {
            if (this.f7059b == null) {
                this.f7059b = new ArrayDeque(4);
            }
            this.f7059b.add(runnable);
            return;
        }
        this.f7058a = true;
        try {
            runnable.run();
            if (this.f7059b != null) {
            }
        } catch (Throwable th) {
            try {
                f7057c.log(Level.SEVERE, "Exception while executing runnable " + runnable, th);
            } finally {
                if (this.f7059b != null) {
                    a();
                }
                this.f7058a = false;
            }
        }
    }
}
