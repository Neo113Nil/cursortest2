package V5;

import android.os.Process;
import androidx.annotation.NonNull;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: V5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4078a {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f28114a;

    /* renamed from: b, reason: collision with root package name */
    private final ExecutorService f28115b;

    /* renamed from: c, reason: collision with root package name */
    final HashMap f28116c;

    /* renamed from: d, reason: collision with root package name */
    private final ReferenceQueue<p<?>> f28117d;

    /* renamed from: e, reason: collision with root package name */
    private l f28118e;

    /* renamed from: V5.a$a, reason: collision with other inner class name */
    final class ThreadFactoryC0574a implements ThreadFactory {

        /* renamed from: V5.a$a$a, reason: collision with other inner class name */
        final class RunnableC0575a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Runnable f28119a;

            RunnableC0575a(Runnable runnable) {
                this.f28119a = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Process.setThreadPriority(10);
                this.f28119a.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(@NonNull Runnable runnable) {
            return new Thread(new RunnableC0575a(runnable), "glide-active-resources");
        }
    }

    /* renamed from: V5.a$b */
    static final class b extends WeakReference<p<?>> {

        /* renamed from: a, reason: collision with root package name */
        final T5.f f28120a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f28121b;

        /* renamed from: c, reason: collision with root package name */
        v<?> f28122c;

        b(@NonNull T5.f fVar, @NonNull p<?> pVar, @NonNull ReferenceQueue<? super p<?>> referenceQueue, boolean z11) {
            super(pVar, referenceQueue);
            v<?> vVar;
            p6.k.c(fVar, "Argument must not be null");
            this.f28120a = fVar;
            if (pVar.e() && z11) {
                vVar = pVar.d();
                p6.k.c(vVar, "Argument must not be null");
            } else {
                vVar = null;
            }
            this.f28122c = vVar;
            this.f28121b = pVar.e();
        }
    }

    C4078a(boolean z11) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC0574a());
        this.f28116c = new HashMap();
        this.f28117d = new ReferenceQueue<>();
        this.f28114a = z11;
        this.f28115b = newSingleThreadExecutor;
        newSingleThreadExecutor.execute(new V5.b(this));
    }

    final synchronized void a(T5.f fVar, p<?> pVar) {
        b bVar = (b) this.f28116c.put(fVar, new b(fVar, pVar, this.f28117d, this.f28114a));
        if (bVar != null) {
            bVar.f28122c = null;
            bVar.clear();
        }
    }

    final void b() {
        while (true) {
            try {
                c((b) this.f28117d.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    final void c(@NonNull b bVar) {
        v<?> vVar;
        synchronized (this) {
            this.f28116c.remove(bVar.f28120a);
            if (bVar.f28121b && (vVar = bVar.f28122c) != null) {
                this.f28118e.f(bVar.f28120a, new p<>(vVar, true, false, bVar.f28120a, this.f28118e));
            }
        }
    }

    final void d(l lVar) {
        synchronized (lVar) {
            synchronized (this) {
                this.f28118e = lVar;
            }
        }
    }
}
