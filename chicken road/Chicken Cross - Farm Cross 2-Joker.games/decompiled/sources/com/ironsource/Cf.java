package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.Df;
import com.ironsource.environment.thread.IronSourceThreadManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;

/* loaded from: classes6.dex */
public final class Cf implements Df {
    public static final a d = new a(null);
    private static Ff e = new J5(IronSourceThreadManager.INSTANCE.getLevelPlayThread());

    /* renamed from: a, reason: collision with root package name */
    private final Ff f7586a;
    private final InterfaceC4378dg b;
    private final InterfaceC4378dg c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Ff a() {
            return Cf.e;
        }

        private a() {
        }

        public final void a(Ff ff) {
            Intrinsics.checkNotNullParameter(ff, "<set-?>");
            Cf.e = ff;
        }
    }

    /* synthetic */ class b extends FunctionReferenceImpl implements Function0<Unit> {
        b(Object obj) {
            super(0, obj, com.ironsource.environment.thread.a.class, "run", "run()V", 0);
        }

        public final void a() {
            ((com.ironsource.environment.thread.a) this.receiver).run();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public Cf() {
        this(null, null, null, 7, null);
    }

    @Override // com.ironsource.Df
    public Df.a b(Runnable task, long j) {
        Intrinsics.checkNotNullParameter(task, "task");
        return a(task, j, this.b);
    }

    public Cf(Ff engine, InterfaceC4378dg levelPlayDispatcher, InterfaceC4378dg mainDispatcher) {
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(levelPlayDispatcher, "levelPlayDispatcher");
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        this.f7586a = engine;
        this.b = levelPlayDispatcher;
        this.c = mainDispatcher;
    }

    @Override // com.ironsource.Df
    public Df.a a(Runnable task, long j) {
        Intrinsics.checkNotNullParameter(task, "task");
        return a(task, j, this.c);
    }

    private final Df.a a(Runnable runnable, long j, final InterfaceC4378dg interfaceC4378dg) {
        final com.ironsource.environment.thread.a a2 = com.ironsource.environment.thread.a.f8176a.a(runnable);
        return new Df.a(this.f7586a.a(Duration.m9437getInWholeMillisecondsimpl(j), new Runnable() { // from class: com.ironsource.Cf$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Cf.a(InterfaceC4378dg.this, a2);
            }
        }));
    }

    public /* synthetic */ Cf(Ff ff, InterfaceC4378dg interfaceC4378dg, InterfaceC4378dg interfaceC4378dg2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? e : ff, (i & 2) != 0 ? C4396eg.a(IronSourceThreadManager.INSTANCE.getLevelPlayThread()) : interfaceC4378dg, (i & 4) != 0 ? C4396eg.a(new Handler(Looper.getMainLooper())) : interfaceC4378dg2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC4378dg dispatcher, com.ironsource.environment.thread.a checkedRunnable) {
        Intrinsics.checkNotNullParameter(dispatcher, "$dispatcher");
        Intrinsics.checkNotNullParameter(checkedRunnable, "$checkedRunnable");
        dispatcher.a(new b(checkedRunnable));
    }
}
