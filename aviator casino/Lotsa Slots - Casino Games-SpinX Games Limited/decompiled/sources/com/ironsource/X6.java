package com.ironsource;

/* loaded from: classes5.dex */
public interface X6 {

    public static final class a implements com.ironsource.X6 {

        /* renamed from: a, reason: collision with root package name */
        private final com.ironsource.Z6 f6072a;

        public a(com.ironsource.Z6 strategy) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strategy, "strategy");
            this.f6072a = strategy;
        }

        @Override // com.ironsource.X6
        public java.lang.String a() {
            return "WebView is unavailable";
        }

        @Override // com.ironsource.X6
        public com.ironsource.Z6 b() {
            return this.f6072a;
        }

        public final com.ironsource.Z6 c() {
            return this.f6072a;
        }
    }

    java.lang.String a();

    com.ironsource.Z6 b();
}
