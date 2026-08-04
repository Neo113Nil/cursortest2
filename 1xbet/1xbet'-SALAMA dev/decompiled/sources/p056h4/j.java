package p056h4;

import D6.y0;
import androidx.appcompat.widget.b1;
import com.google.android.gms.common.internal.D;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements Executor {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f13562f = Logger.getLogger(j.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f13563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f13564b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13565c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f13566d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y0 f13567e = new y0(this);

    public j(Executor executor) {
        D.i(executor);
        this.f13563a = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        D.i(runnable);
        synchronized (this.f13564b) {
            int i7 = this.f13565c;
            if (i7 != 4 && i7 != 3) {
                long j = this.f13566d;
                b1 b1Var = new b1(runnable, 8);
                this.f13564b.add(b1Var);
                this.f13565c = 2;
                try {
                    this.f13563a.execute(this.f13567e);
                    if (this.f13565c != 2) {
                        return;
                    }
                    synchronized (this.f13564b) {
                        try {
                            if (this.f13566d == j && this.f13565c == 2) {
                                this.f13565c = 3;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e7) {
                    synchronized (this.f13564b) {
                        try {
                            int i8 = this.f13565c;
                            boolean z4 = true;
                            if ((i8 != 1 && i8 != 2) || !this.f13564b.removeLastOccurrence(b1Var)) {
                                z4 = false;
                            }
                            if (!(e7 instanceof RejectedExecutionException) || z4) {
                                throw e7;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                }
            }
            this.f13564b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f13563a + "}";
    }
}
