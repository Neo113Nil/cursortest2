package Bl0;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class h0 implements jm0.b {

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f3974a = new ScheduledThreadPoolExecutor(1);

    /* loaded from: classes4.dex */
    public static final class a implements jm0.i {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicBoolean f3975a = new AtomicBoolean();

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ScheduledFuture<?> f3976b;

        public a(ScheduledFuture<?> scheduledFuture) {
            this.f3976b = scheduledFuture;
        }

        @Override // jm0.i
        public final void dispose() {
            if (this.f3975a.compareAndSet(false, true)) {
                this.f3976b.cancel(false);
            }
        }
    }

    @Override // jm0.b
    public final void a(final Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.f3974a.submit(new Runnable(block) { // from class: Bl0.f0

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AbstractC7737t f3970a;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.f3970a = (AbstractC7737t) block;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
            @Override // java.lang.Runnable
            public final void run() {
                this.f3970a.invoke();
            }
        });
    }

    @Override // jm0.b
    public final jm0.i b(long j11, TimeUnit timeUnit, Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        Intrinsics.checkNotNullParameter(block, "block");
        return new a(this.f3974a.schedule(new g0(block, 0), j11, timeUnit));
    }
}
