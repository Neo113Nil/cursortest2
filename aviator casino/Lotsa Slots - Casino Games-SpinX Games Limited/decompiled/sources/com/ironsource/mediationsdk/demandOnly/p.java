package com.ironsource.mediationsdk.demandOnly;

/* loaded from: classes5.dex */
public interface p {

    public static class a implements com.ironsource.mediationsdk.demandOnly.p {

        /* renamed from: a, reason: collision with root package name */
        private final java.lang.String f6432a;

        public a(java.lang.String plumbus) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(plumbus, "plumbus");
            this.f6432a = plumbus;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.p
        public java.lang.String value() {
            return this.f6432a;
        }
    }

    public static final class b extends com.ironsource.mediationsdk.demandOnly.p.a {
        public b() {
            super("");
        }
    }

    java.lang.String value();
}
