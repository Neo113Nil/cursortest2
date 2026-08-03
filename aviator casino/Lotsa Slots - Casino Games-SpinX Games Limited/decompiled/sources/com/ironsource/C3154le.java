package com.ironsource;

/* renamed from: com.ironsource.le, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3154le extends java.util.concurrent.ScheduledThreadPoolExecutor {

    /* renamed from: a, reason: collision with root package name */
    private final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> f6372a;
    private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.le$a */
    public static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.ironsource.C3154le.a f6373a = new com.ironsource.C3154le.a();

        a() {
            super(1);
        }

        public final void a(java.lang.Throwable th) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
            a(th);
            return kotlin.Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.le$b */
    public static final class b extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.ironsource.C3154le.b f6374a = new com.ironsource.C3154le.b();

        b() {
            super(1);
        }

        public final void a(java.lang.String it) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.String str) {
            a(str);
            return kotlin.Unit.INSTANCE;
        }
    }

    public C3154le() {
        this(0, null, null, 7, null);
    }

    private final java.lang.String a(java.lang.String str) {
        return com.ironsource.C3154le.class.getName() + " RuntimeException caught: " + str;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void afterExecute(java.lang.Runnable runnable, java.lang.Throwable th) {
        super.afterExecute(runnable, th);
        if (th != null) {
            this.b.invoke(a(th.toString()));
            this.f6372a.invoke(th);
            return;
        }
        if ((runnable instanceof java.util.concurrent.Future) && ((java.util.concurrent.Future) runnable).isDone()) {
            try {
                ((java.util.concurrent.Future) runnable).get();
            } catch (java.lang.InterruptedException e) {
                com.ironsource.C3180n4.d().a(e);
                this.b.invoke(a(e.toString()));
                java.lang.Thread.currentThread().interrupt();
            } catch (java.util.concurrent.CancellationException e2) {
                com.ironsource.C3180n4.d().a(e2);
                this.b.invoke(a(e2.toString()));
                this.f6372a.invoke(e2);
            } catch (java.util.concurrent.ExecutionException e3) {
                com.ironsource.C3180n4.d().a(e3);
                this.b.invoke(a(e3.toString()));
                this.f6372a.invoke(e3.getCause());
            }
        }
    }

    public /* synthetic */ C3154le(int i, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? com.ironsource.C3172me.f6391a : i, (i2 & 2) != 0 ? com.ironsource.C3154le.a.f6373a : function1, (i2 & 4) != 0 ? com.ironsource.C3154le.b.f6374a : function12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C3154le(int i, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> report, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> log) {
        super(i, new com.ironsource.ThreadFactoryC3025ea());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(report, "report");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(log, "log");
        this.f6372a = report;
        this.b = log;
    }
}
