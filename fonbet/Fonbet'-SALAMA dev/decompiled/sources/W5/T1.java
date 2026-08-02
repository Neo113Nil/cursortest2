package W5;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class T1 implements Executor {

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f7057c = Logger.getLogger(T1.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public boolean f7058a;

    /* renamed from: b, reason: collision with root package name */
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

    /* JADX WARN: Code restructure failed: missing block: B:10:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        if (r6.f7059b == null) goto L9;
     */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void execute(Runnable runnable) {
        p3.f.k(runnable, "'task' must not be null.");
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
