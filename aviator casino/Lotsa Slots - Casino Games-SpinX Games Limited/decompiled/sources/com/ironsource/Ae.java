package com.ironsource;

/* loaded from: classes5.dex */
public interface Ae {

    public static final class a implements com.ironsource.Ae {

        /* renamed from: a, reason: collision with root package name */
        private final com.ironsource.C3226pe f5617a;
        private final com.ironsource.C2988c9 b;

        public a(com.ironsource.C3226pe error, com.ironsource.C2988c9 c2988c9) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
            this.f5617a = error;
            this.b = c2988c9;
        }

        public final com.ironsource.C3226pe a() {
            return this.f5617a;
        }

        public final com.ironsource.C2988c9 b() {
            return this.b;
        }

        public final com.ironsource.C3226pe c() {
            return this.f5617a;
        }

        public final com.ironsource.C2988c9 d() {
            return this.b;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.ironsource.Ae.a)) {
                return false;
            }
            com.ironsource.Ae.a aVar = (com.ironsource.Ae.a) obj;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.f5617a, aVar.f5617a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, aVar.b);
        }

        public int hashCode() {
            int hashCode = this.f5617a.hashCode() * 31;
            com.ironsource.C2988c9 c2988c9 = this.b;
            return hashCode + (c2988c9 == null ? 0 : c2988c9.hashCode());
        }

        public java.lang.String toString() {
            return "Failure(error=" + this.f5617a + ", performanceMeasurer=" + this.b + ")";
        }

        public final com.ironsource.Ae.a a(com.ironsource.C3226pe error, com.ironsource.C2988c9 c2988c9) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
            return new com.ironsource.Ae.a(error, c2988c9);
        }

        public static /* synthetic */ com.ironsource.Ae.a a(com.ironsource.Ae.a aVar, com.ironsource.C3226pe c3226pe, com.ironsource.C2988c9 c2988c9, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                c3226pe = aVar.f5617a;
            }
            if ((i & 2) != 0) {
                c2988c9 = aVar.b;
            }
            return aVar.a(c3226pe, c2988c9);
        }

        public /* synthetic */ a(com.ironsource.C3226pe c3226pe, com.ironsource.C2988c9 c2988c9, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(c3226pe, (i & 2) != 0 ? null : c2988c9);
        }
    }

    public static final class b implements com.ironsource.Ae {

        /* renamed from: a, reason: collision with root package name */
        private final com.ironsource.C3351we f5618a;
        private final com.ironsource.C2988c9 b;

        public b(com.ironsource.C3351we sdkInitResponse, com.ironsource.C2988c9 c2988c9) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkInitResponse, "sdkInitResponse");
            this.f5618a = sdkInitResponse;
            this.b = c2988c9;
        }

        public final com.ironsource.C3351we a() {
            return this.f5618a;
        }

        public final com.ironsource.C2988c9 b() {
            return this.b;
        }

        public final com.ironsource.C2988c9 c() {
            return this.b;
        }

        public final com.ironsource.C3351we d() {
            return this.f5618a;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.ironsource.Ae.b)) {
                return false;
            }
            com.ironsource.Ae.b bVar = (com.ironsource.Ae.b) obj;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.f5618a, bVar.f5618a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, bVar.b);
        }

        public int hashCode() {
            int hashCode = this.f5618a.hashCode() * 31;
            com.ironsource.C2988c9 c2988c9 = this.b;
            return hashCode + (c2988c9 == null ? 0 : c2988c9.hashCode());
        }

        public java.lang.String toString() {
            return "Success(sdkInitResponse=" + this.f5618a + ", performanceMeasurer=" + this.b + ")";
        }

        public final com.ironsource.Ae.b a(com.ironsource.C3351we sdkInitResponse, com.ironsource.C2988c9 c2988c9) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkInitResponse, "sdkInitResponse");
            return new com.ironsource.Ae.b(sdkInitResponse, c2988c9);
        }

        public static /* synthetic */ com.ironsource.Ae.b a(com.ironsource.Ae.b bVar, com.ironsource.C3351we c3351we, com.ironsource.C2988c9 c2988c9, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                c3351we = bVar.f5618a;
            }
            if ((i & 2) != 0) {
                c2988c9 = bVar.b;
            }
            return bVar.a(c3351we, c2988c9);
        }
    }
}
