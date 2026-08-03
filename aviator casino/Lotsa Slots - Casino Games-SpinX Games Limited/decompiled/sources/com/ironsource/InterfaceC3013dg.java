package com.ironsource;

/* renamed from: com.ironsource.dg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC3013dg {

    /* renamed from: com.ironsource.dg$a */
    public interface a {
        void a();
    }

    /* renamed from: com.ironsource.dg$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private long f6204a;
        private long b;

        public final long a() {
            return this.b;
        }

        public final long b() {
            return this.f6204a;
        }

        public final void a(long j) {
            this.b = j;
        }

        public final void b(long j) {
            this.f6204a = j;
        }
    }

    /* renamed from: com.ironsource.dg$c */
    public interface c {
        com.ironsource.InterfaceC3013dg a(com.ironsource.InterfaceC3013dg.b bVar);
    }

    /* renamed from: com.ironsource.dg$d */
    public static final class d implements com.ironsource.InterfaceC3013dg.c {
        @Override // com.ironsource.InterfaceC3013dg.c
        public com.ironsource.InterfaceC3013dg a(com.ironsource.InterfaceC3013dg.b timerConfig) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timerConfig, "timerConfig");
            return new com.ironsource.InterfaceC3013dg.e(new com.ironsource.C3049fg(timerConfig.b()));
        }
    }

    /* renamed from: com.ironsource.dg$e */
    private static final class e implements com.ironsource.InterfaceC3013dg {

        /* renamed from: a, reason: collision with root package name */
        private final com.ironsource.C3049fg f6205a;

        /* renamed from: com.ironsource.dg$e$a */
        public static final class a implements com.ironsource.C3049fg.a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.ironsource.InterfaceC3013dg.a f6206a;

            a(com.ironsource.InterfaceC3013dg.a aVar) {
                this.f6206a = aVar;
            }

            @Override // com.ironsource.C3049fg.a
            public void a() {
                this.f6206a.a();
            }
        }

        public e(com.ironsource.C3049fg timer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timer, "timer");
            this.f6205a = timer;
        }

        @Override // com.ironsource.InterfaceC3013dg
        public void a(com.ironsource.InterfaceC3013dg.a callback) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
            this.f6205a.a((com.ironsource.C3049fg.a) new com.ironsource.InterfaceC3013dg.e.a(callback));
        }

        @Override // com.ironsource.InterfaceC3013dg
        public void cancel() {
            this.f6205a.e();
        }
    }

    void a(com.ironsource.InterfaceC3013dg.a aVar);

    void cancel();
}
