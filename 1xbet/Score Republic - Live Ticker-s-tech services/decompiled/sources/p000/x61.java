package p000;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class x61 implements Executor {

    /* JADX INFO: renamed from: l */
    public static final Logger f8798l = Logger.getLogger(x61.class.getName());

    /* JADX INFO: renamed from: j */
    public boolean f8799j;

    /* JADX INFO: renamed from: k */
    public ArrayDeque f8800k;

    /* JADX INFO: renamed from: a */
    public final void m5527a() {
        while (true) {
            Runnable runnable = (Runnable) this.f8800k.poll();
            if (runnable == null) {
                return;
            }
            try {
                runnable.run();
            } catch (Throwable th) {
                f8798l.log(Level.SEVERE, "Exception while executing runnable " + runnable, th);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        a90.m127k(runnable, "'task' must not be null.");
        if (this.f8799j) {
            if (this.f8800k == null) {
                this.f8800k = new ArrayDeque(4);
            }
            this.f8800k.add(runnable);
            return;
        }
        this.f8799j = true;
        try {
            runnable.run();
            if (this.f8800k != null) {
                m5527a();
            }
            this.f8799j = false;
        } catch (Throwable th) {
            try {
                f8798l.log(Level.SEVERE, "Exception while executing runnable " + runnable, th);
            } finally {
                if (this.f8800k != null) {
                    m5527a();
                }
                this.f8799j = false;
            }
        }
    }
}
