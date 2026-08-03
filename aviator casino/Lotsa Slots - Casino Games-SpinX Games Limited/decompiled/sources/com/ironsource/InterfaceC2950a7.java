package com.ironsource;

/* renamed from: com.ironsource.a7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC2950a7 {

    /* renamed from: com.ironsource.a7$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }

    /* renamed from: com.ironsource.a7$a */
    public static final class a implements com.ironsource.InterfaceC2950a7 {

        /* renamed from: a, reason: collision with root package name */
        private final com.ironsource.X6 f6135a;

        public a(com.ironsource.X6 failure) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failure, "failure");
            this.f6135a = failure;
        }

        public final com.ironsource.X6 a() {
            return this.f6135a;
        }

        public final com.ironsource.X6 b() {
            return this.f6135a;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.ironsource.InterfaceC2950a7.a) && kotlin.jvm.internal.Intrinsics.areEqual(this.f6135a, ((com.ironsource.InterfaceC2950a7.a) obj).f6135a);
        }

        public int hashCode() {
            return this.f6135a.hashCode();
        }

        public java.lang.String toString() {
            return "Failure(failure=" + this.f6135a + ")";
        }

        public final com.ironsource.InterfaceC2950a7.a a(com.ironsource.X6 failure) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failure, "failure");
            return new com.ironsource.InterfaceC2950a7.a(failure);
        }

        public static /* synthetic */ com.ironsource.InterfaceC2950a7.a a(com.ironsource.InterfaceC2950a7.a aVar, com.ironsource.X6 x6, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                x6 = aVar.f6135a;
            }
            return aVar.a(x6);
        }

        @Override // com.ironsource.InterfaceC2950a7
        public void a(com.ironsource.InterfaceC2968b7 handler) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "handler");
            handler.a(this.f6135a);
        }
    }

    void a(com.ironsource.InterfaceC2968b7 interfaceC2968b7);
}
