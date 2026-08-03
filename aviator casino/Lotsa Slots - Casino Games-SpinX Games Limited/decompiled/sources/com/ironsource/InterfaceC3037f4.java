package com.ironsource;

/* renamed from: com.ironsource.f4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC3037f4 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.ironsource.InterfaceC3037f4.c f6250a = com.ironsource.InterfaceC3037f4.c.f6252a;

    /* renamed from: com.ironsource.f4$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        static {
            com.ironsource.InterfaceC3037f4.c cVar = com.ironsource.InterfaceC3037f4.f6250a;
        }

        @kotlin.jvm.JvmStatic
        public static com.ironsource.InterfaceC3037f4 a(com.ironsource.Y6 y6) {
            return com.ironsource.InterfaceC3037f4.f6250a.a(y6);
        }
    }

    /* renamed from: com.ironsource.f4$a */
    public static final class a implements com.ironsource.InterfaceC3037f4 {
        private final com.ironsource.W6 b;
        private final com.ironsource.InterfaceC3013dg c;
        private final java.util.concurrent.atomic.AtomicBoolean d;

        /* renamed from: com.ironsource.f4$a$a, reason: collision with other inner class name */
        public static final class C0150a implements com.ironsource.InterfaceC3013dg.a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.ironsource.InterfaceC3037f4.d f6251a;
            final /* synthetic */ com.ironsource.InterfaceC3037f4.a b;

            C0150a(com.ironsource.InterfaceC3037f4.d dVar, com.ironsource.InterfaceC3037f4.a aVar) {
                this.f6251a = dVar;
                this.b = aVar;
            }

            @Override // com.ironsource.InterfaceC3013dg.a
            public void a() {
                this.f6251a.a(new com.ironsource.InterfaceC2950a7.a(new com.ironsource.X6.a(this.b.b.b())));
                this.b.d.set(false);
            }
        }

        public a(com.ironsource.W6 config, com.ironsource.InterfaceC3013dg timer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timer, "timer");
            this.b = config;
            this.c = timer;
            this.d = new java.util.concurrent.atomic.AtomicBoolean(false);
        }

        @Override // com.ironsource.InterfaceC3037f4
        public synchronized void a(com.ironsource.InterfaceC3037f4.d callback) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
            if (this.d.compareAndSet(false, true)) {
                this.c.a(new com.ironsource.InterfaceC3037f4.a.C0150a(callback, this));
            }
        }

        @Override // com.ironsource.InterfaceC3037f4
        public synchronized void a() {
            this.c.cancel();
            this.d.set(false);
        }
    }

    /* renamed from: com.ironsource.f4$b */
    public static final class b implements com.ironsource.InterfaceC3037f4 {
        public static final com.ironsource.InterfaceC3037f4.b b = new com.ironsource.InterfaceC3037f4.b();

        private b() {
        }

        @Override // com.ironsource.InterfaceC3037f4
        public void a() {
        }

        @Override // com.ironsource.InterfaceC3037f4
        public void a(com.ironsource.InterfaceC3037f4.d callback) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        }
    }

    /* renamed from: com.ironsource.f4$d */
    public interface d {
        void a(com.ironsource.InterfaceC2950a7 interfaceC2950a7);
    }

    void a();

    void a(com.ironsource.InterfaceC3037f4.d dVar);

    /* renamed from: com.ironsource.f4$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ com.ironsource.InterfaceC3037f4.c f6252a = new com.ironsource.InterfaceC3037f4.c();

        private c() {
        }

        @kotlin.jvm.JvmStatic
        public final com.ironsource.InterfaceC3037f4 a(com.ironsource.Y6 featureFlag) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureFlag, "featureFlag");
            if (!featureFlag.b()) {
                return com.ironsource.InterfaceC3037f4.b.b;
            }
            com.ironsource.V6 v6 = new com.ironsource.V6(featureFlag);
            com.ironsource.InterfaceC3013dg.b bVar = new com.ironsource.InterfaceC3013dg.b();
            bVar.b(v6.a());
            bVar.a(v6.a());
            return new com.ironsource.InterfaceC3037f4.a(v6, new com.ironsource.InterfaceC3013dg.d().a(bVar));
        }

        public final com.ironsource.InterfaceC3037f4 a() {
            return com.ironsource.InterfaceC3037f4.b.b;
        }
    }
}
