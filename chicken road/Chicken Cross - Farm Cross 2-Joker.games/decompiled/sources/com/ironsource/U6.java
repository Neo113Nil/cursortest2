package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface U6 {

    public static final class a implements U6 {

        /* renamed from: a, reason: collision with root package name */
        private final W6 f7947a;

        public a(W6 strategy) {
            Intrinsics.checkNotNullParameter(strategy, "strategy");
            this.f7947a = strategy;
        }

        @Override // com.ironsource.U6
        public String a() {
            return "WebView is unavailable";
        }

        @Override // com.ironsource.U6
        public W6 b() {
            return this.f7947a;
        }

        public final W6 c() {
            return this.f7947a;
        }
    }

    String a();

    W6 b();
}
