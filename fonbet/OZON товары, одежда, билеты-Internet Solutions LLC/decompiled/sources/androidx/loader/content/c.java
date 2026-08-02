package androidx.loader.content;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
abstract class c<Result> {

    /* renamed from: e, reason: collision with root package name */
    private static Handler f43433e;

    /* renamed from: b, reason: collision with root package name */
    private volatile e f43435b = e.PENDING;

    /* renamed from: c, reason: collision with root package name */
    final AtomicBoolean f43436c = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    final AtomicBoolean f43437d = new AtomicBoolean();

    /* renamed from: a, reason: collision with root package name */
    private final FutureTask<Result> f43434a = new b(new a());

    final class a implements Callable<Result> {
        a() {
        }

        @Override // java.util.concurrent.Callable
        public final Result call() {
            c cVar = c.this;
            cVar.f43437d.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) cVar.b();
                Binder.flushPendingCommands();
                return result;
            } finally {
            }
        }
    }

    final class b extends FutureTask<Result> {
        b(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected final void done() {
            c cVar = c.this;
            AtomicBoolean atomicBoolean = cVar.f43437d;
            try {
                Result result = get();
                if (atomicBoolean.get()) {
                    return;
                }
                cVar.g(result);
            } catch (InterruptedException e11) {
                Log.w("AsyncTask", e11);
            } catch (CancellationException unused) {
                if (atomicBoolean.get()) {
                    return;
                }
                cVar.g(null);
            } catch (ExecutionException e12) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e12.getCause());
            } catch (Throwable th2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th2);
            }
        }
    }

    /* renamed from: androidx.loader.content.c$c, reason: collision with other inner class name */
    final class RunnableC0805c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f43440a;

        RunnableC0805c(Object obj) {
            this.f43440a = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            c.this.d(this.f43440a);
        }
    }

    static /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f43442a;

        static {
            int[] iArr = new int[e.values().length];
            f43442a = iArr;
            try {
                iArr[e.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43442a[e.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class e {
        private static final /* synthetic */ e[] $VALUES;
        public static final e FINISHED;
        public static final e PENDING;
        public static final e RUNNING;

        static {
            e eVar = new e("PENDING", 0);
            PENDING = eVar;
            e eVar2 = new e("RUNNING", 1);
            RUNNING = eVar2;
            e eVar3 = new e("FINISHED", 2);
            FINISHED = eVar3;
            $VALUES = new e[]{eVar, eVar2, eVar3};
        }

        private e() {
            throw null;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) $VALUES.clone();
        }
    }

    c() {
    }

    public final boolean a() {
        this.f43436c.set(true);
        return this.f43434a.cancel(false);
    }

    protected abstract Result b();

    public final void c(@NonNull Executor executor) {
        if (this.f43435b == e.PENDING) {
            this.f43435b = e.RUNNING;
            executor.execute(this.f43434a);
            return;
        }
        int i11 = d.f43442a[this.f43435b.ordinal()];
        if (i11 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i11 == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }

    final void d(Result result) {
        if (this.f43436c.get()) {
            e(result);
        } else {
            f(result);
        }
        this.f43435b = e.FINISHED;
    }

    protected void e(Result result) {
    }

    protected void f(Result result) {
    }

    final void g(Result result) {
        Handler handler;
        synchronized (c.class) {
            try {
                if (f43433e == null) {
                    f43433e = new Handler(Looper.getMainLooper());
                }
                handler = f43433e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        handler.post(new RunnableC0805c(result));
    }
}
