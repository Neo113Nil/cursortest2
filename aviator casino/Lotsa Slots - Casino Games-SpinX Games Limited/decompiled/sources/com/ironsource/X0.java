package com.ironsource;

/* loaded from: classes5.dex */
public interface X0 {

    public static final class a implements com.ironsource.X0 {

        /* renamed from: a, reason: collision with root package name */
        private final java.lang.String f6053a;

        public a(java.lang.String reason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "reason");
            this.f6053a = reason;
        }

        public final java.lang.String a() {
            return this.f6053a;
        }

        public final java.lang.String b() {
            return this.f6053a;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.ironsource.X0.a) && kotlin.jvm.internal.Intrinsics.areEqual(this.f6053a, ((com.ironsource.X0.a) obj).f6053a);
        }

        public int hashCode() {
            return this.f6053a.hashCode();
        }

        public java.lang.String toString() {
            return "Invalid(reason=" + this.f6053a + ")";
        }

        public final com.ironsource.X0.a a(java.lang.String reason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "reason");
            return new com.ironsource.X0.a(reason);
        }

        public static /* synthetic */ com.ironsource.X0.a a(com.ironsource.X0.a aVar, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f6053a;
            }
            return aVar.a(str);
        }
    }

    public static final class b implements com.ironsource.X0 {

        /* renamed from: a, reason: collision with root package name */
        public static final com.ironsource.X0.b f6054a = new com.ironsource.X0.b();

        private b() {
        }
    }
}
