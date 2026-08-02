package h4;

import D6.y0;
import androidx.appcompat.widget.b1;
import com.google.android.gms.common.internal.D;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* renamed from: h4.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ExecutorC1207j implements Executor {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f13556f = Logger.getLogger(ExecutorC1207j.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final Executor f13557a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f13558b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public int f13559c = 1;

    /* renamed from: d, reason: collision with root package name */
    public long f13560d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final y0 f13561e = new y0(this);

    public ExecutorC1207j(Executor executor) {
        D.i(executor);
        this.f13557a = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        D.i(runnable);
        synchronized (this.f13558b) {
            int i7 = this.f13559c;
            if (i7 != 4 && i7 != 3) {
                long j = this.f13560d;
                b1 b1Var = new b1(runnable, 8);
                this.f13558b.add(b1Var);
                this.f13559c = 2;
                try {
                    this.f13557a.execute(this.f13561e);
                    if (this.f13559c != 2) {
                        return;
                    }
                    synchronized (this.f13558b) {
                        try {
                            if (this.f13560d == j && this.f13559c == 2) {
                                this.f13559c = 3;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e7) {
                    synchronized (this.f13558b) {
                        try {
                            int i8 = this.f13559c;
                            boolean z4 = true;
                            if ((i8 != 1 && i8 != 2) || !this.f13558b.removeLastOccurrence(b1Var)) {
                                z4 = false;
                            }
                            if (!(e7 instanceof RejectedExecutionException) || z4) {
                                throw e7;
                            }
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.f13558b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f13557a + "}";
    }
}
