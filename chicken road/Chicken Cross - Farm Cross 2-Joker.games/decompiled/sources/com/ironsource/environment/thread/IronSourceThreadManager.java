package com.ironsource.environment.thread;

import android.os.Handler;
import com.ironsource.C4483je;
import com.ironsource.C4491k4;
import com.ironsource.Cf;
import com.ironsource.Df;
import com.ironsource.R9;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* loaded from: classes6.dex */
public final class IronSourceThreadManager {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f8167a;
    public static final IronSourceThreadManager INSTANCE = new IronSourceThreadManager();
    private static final Lazy b = LazyKt.lazy(d.f8171a);
    private static final Lazy c = LazyKt.lazy(g.f8174a);
    private static final Lazy d = LazyKt.lazy(c.f8170a);
    private static final Lazy e = LazyKt.lazy(h.f8175a);
    private static final Lazy f = LazyKt.lazy(e.f8172a);
    private static final Lazy g = LazyKt.lazy(a.f8168a);
    private static final Lazy h = LazyKt.lazy(f.f8173a);
    private static final Lazy i = LazyKt.lazy(b.f8169a);

    static final class a extends Lambda implements Function0<R9> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f8168a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R9 invoke() {
            R9 r9 = new R9("adapterBackground");
            r9.start();
            r9.a();
            return r9;
        }
    }

    static final class b extends Lambda implements Function0<C4483je> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f8169a = new b();

        b() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4483je invoke() {
            return new C4483je(0, null, 3, 0 == true ? 1 : 0);
        }
    }

    static final class c extends Lambda implements Function0<Handler> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f8170a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Handler invoke() {
            R9 r9 = new R9("IronSourceInitiatorHandler");
            r9.start();
            r9.a();
            return new Handler(r9.getLooper());
        }
    }

    static final class d extends Lambda implements Function0<com.ironsource.environment.thread.b> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f8171a = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.ironsource.environment.thread.b invoke() {
            return com.ironsource.environment.thread.b.c.a("LevelPlayThread");
        }
    }

    static final class e extends Lambda implements Function0<R9> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f8172a = new e();

        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R9 invoke() {
            R9 r9 = new R9("mediationBackground");
            r9.start();
            r9.a();
            return r9;
        }
    }

    static final class f extends Lambda implements Function0<R9> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f8173a = new f();

        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R9 invoke() {
            R9 r9 = new R9("publisher-callbacks");
            r9.start();
            r9.a();
            return r9;
        }
    }

    static final class g extends Lambda implements Function0<Cf> {

        /* renamed from: a, reason: collision with root package name */
        public static final g f8174a = new g();

        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Cf invoke() {
            return new Cf(null, null, null, 7, null);
        }
    }

    static final class h extends Lambda implements Function0<R9> {

        /* renamed from: a, reason: collision with root package name */
        public static final h f8175a = new h();

        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R9 invoke() {
            R9 r9 = new R9("managersThread");
            r9.start();
            r9.a();
            return r9;
        }
    }

    private IronSourceThreadManager() {
    }

    private final R9 a() {
        return (R9) g.getValue();
    }

    private final C4483je b() {
        return (C4483je) i.getValue();
    }

    private final R9 c() {
        return (R9) f.getValue();
    }

    private final R9 d() {
        return (R9) h.getValue();
    }

    private final Cf e() {
        return (Cf) c.getValue();
    }

    public static /* synthetic */ void postAdapterBackgroundTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        ironSourceThreadManager.postAdapterBackgroundTask(runnable, j);
    }

    public static /* synthetic */ void postMediationBackgroundTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        ironSourceThreadManager.postMediationBackgroundTask(runnable, j);
    }

    public static /* synthetic */ Df.a postOnUiThreadTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        return ironSourceThreadManager.postOnUiThreadTask(runnable, j);
    }

    public static /* synthetic */ void postPublisherCallback$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        ironSourceThreadManager.postPublisherCallback(runnable, j);
    }

    public final void executeTasks(boolean z, boolean z2, List<? extends Runnable> tasks) {
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        if (!z) {
            Iterator<? extends Runnable> it = tasks.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            return;
        }
        if (!z2) {
            Iterator<? extends Runnable> it2 = tasks.iterator();
            while (it2.hasNext()) {
                postMediationBackgroundTask$default(INSTANCE, it2.next(), 0L, 2, null);
            }
            return;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(tasks.size());
        for (final Runnable runnable : tasks) {
            postMediationBackgroundTask$default(INSTANCE, new Runnable() { // from class: com.ironsource.environment.thread.IronSourceThreadManager$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    IronSourceThreadManager.a(runnable, countDownLatch);
                }
            }, 0L, 2, null);
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e2) {
            C4491k4.d().a(e2);
        }
    }

    public final Handler getInitHandler() {
        return (Handler) d.getValue();
    }

    public final com.ironsource.environment.thread.b getLevelPlayThread() {
        return (com.ironsource.environment.thread.b) b.getValue();
    }

    public final R9 getSharedManagersThread() {
        return (R9) e.getValue();
    }

    public final ThreadPoolExecutor getThreadPoolExecutor() {
        return new ThreadPoolExecutor(Runtime.getRuntime().availableProcessors(), Runtime.getRuntime().availableProcessors(), Long.MAX_VALUE, TimeUnit.NANOSECONDS, new LinkedBlockingQueue());
    }

    public final boolean getUseSharedExecutorService() {
        return f8167a;
    }

    public final void postAdapterBackgroundTask(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        postAdapterBackgroundTask$default(this, action, 0L, 2, null);
    }

    public final void postMediationBackgroundTask(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        postMediationBackgroundTask$default(this, action, 0L, 2, null);
    }

    public final Df.a postOnUiThreadTask(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return postOnUiThreadTask$default(this, action, 0L, 2, null);
    }

    public final void postPublisherCallback(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        postPublisherCallback$default(this, action, 0L, 2, null);
    }

    public final void removeAdapterBackgroundTask(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (a(action)) {
            b().remove(action);
        } else {
            a().b(action);
        }
    }

    public final void removeMediationBackgroundTask(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (a(action)) {
            b().remove(action);
        } else {
            c().b(action);
        }
    }

    public final void setUseSharedExecutorService(boolean z) {
        f8167a = z;
    }

    private final boolean a(Runnable runnable) {
        return f8167a && b().getQueue().contains(runnable);
    }

    public final void postAdapterBackgroundTask(Runnable action, long j) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (f8167a) {
            b().schedule(action, j, TimeUnit.MILLISECONDS);
        } else {
            a().a(action, j);
        }
    }

    public final void postMediationBackgroundTask(Runnable action, long j) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (f8167a) {
            b().schedule(action, j, TimeUnit.MILLISECONDS);
        } else {
            c().a(action, j);
        }
    }

    public final Df.a postOnUiThreadTask(Runnable action, long j) {
        Intrinsics.checkNotNullParameter(action, "action");
        Cf e2 = e();
        Duration.Companion companion = Duration.INSTANCE;
        return e2.a(action, DurationKt.toDuration(j, DurationUnit.MILLISECONDS));
    }

    public final void postPublisherCallback(Runnable action, long j) {
        Intrinsics.checkNotNullParameter(action, "action");
        d().a(action, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Runnable it, final CountDownLatch latch) {
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(latch, "$latch");
        it.run();
        new Runnable() { // from class: com.ironsource.environment.thread.IronSourceThreadManager$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                IronSourceThreadManager.a(latch);
            }
        }.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(CountDownLatch latch) {
        Intrinsics.checkNotNullParameter(latch, "$latch");
        latch.countDown();
    }
}
