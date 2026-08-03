package com.ironsource;

/* renamed from: com.ironsource.u6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC3307u6 {

    /* renamed from: com.ironsource.u6$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final com.ironsource.InterfaceC3307u6.c f6758a;

        public a(com.ironsource.InterfaceC3307u6.c strategyType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strategyType, "strategyType");
            this.f6758a = strategyType;
        }

        public final com.ironsource.InterfaceC3307u6.c a() {
            return this.f6758a;
        }

        public final com.ironsource.InterfaceC3307u6.c b() {
            return this.f6758a;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.ironsource.InterfaceC3307u6.a) && this.f6758a == ((com.ironsource.InterfaceC3307u6.a) obj).f6758a;
        }

        public int hashCode() {
            return this.f6758a.hashCode();
        }

        public java.lang.String toString() {
            return "Config(strategyType=" + this.f6758a + ")";
        }

        public final com.ironsource.InterfaceC3307u6.a a(com.ironsource.InterfaceC3307u6.c strategyType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strategyType, "strategyType");
            return new com.ironsource.InterfaceC3307u6.a(strategyType);
        }

        public static /* synthetic */ com.ironsource.InterfaceC3307u6.a a(com.ironsource.InterfaceC3307u6.a aVar, com.ironsource.InterfaceC3307u6.c cVar, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cVar = aVar.f6758a;
            }
            return aVar.a(cVar);
        }
    }

    /* renamed from: com.ironsource.u6$b */
    public static final class b {

        /* renamed from: com.ironsource.u6$b$a */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f6759a;

            static {
                int[] iArr = new int[com.ironsource.InterfaceC3307u6.c.values().length];
                try {
                    iArr[com.ironsource.InterfaceC3307u6.c.SINGLE.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[com.ironsource.InterfaceC3307u6.c.PROGRESSIVE_ON_SHOW_SUCCESS.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[com.ironsource.InterfaceC3307u6.c.PROGRESSIVE_ON_LOAD_SUCCESS.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                f6759a = iArr;
            }
        }

        public final com.ironsource.InterfaceC3307u6 a(com.ironsource.C3212p0 adTools, com.ironsource.InterfaceC3307u6.a config, com.ironsource.InterfaceC3236q6 fullscreenAdUnitFactory, com.ironsource.InterfaceC3271s6 fullscreenAdUnitListener, com.ironsource.InterfaceC3289t6 listener) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullscreenAdUnitFactory, "fullscreenAdUnitFactory");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullscreenAdUnitListener, "fullscreenAdUnitListener");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
            int i = com.ironsource.InterfaceC3307u6.b.a.f6759a[config.b().ordinal()];
            if (i == 1) {
                return new com.ironsource.I6(adTools, config, fullscreenAdUnitFactory, fullscreenAdUnitListener, listener);
            }
            if (i == 2) {
                return new com.ironsource.B6(adTools, fullscreenAdUnitFactory, fullscreenAdUnitListener, listener);
            }
            if (i == 3) {
                return new com.ironsource.C3325v6(adTools, fullscreenAdUnitFactory, fullscreenAdUnitListener, listener);
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    /* renamed from: com.ironsource.u6$c */
    public enum c {
        SINGLE("Single"),
        PROGRESSIVE_ON_SHOW_SUCCESS("OnShowSuccess"),
        PROGRESSIVE_ON_LOAD_SUCCESS("OnLoadSuccess");


        /* renamed from: a, reason: collision with root package name */
        private final java.lang.String f6760a;

        c(java.lang.String str) {
            this.f6760a = str;
        }

        public final java.lang.String b() {
            return this.f6760a;
        }
    }

    void a(android.app.Activity activity);

    void loadAd();
}
