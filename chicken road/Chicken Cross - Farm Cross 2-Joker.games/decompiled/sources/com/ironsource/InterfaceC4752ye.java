package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.ye, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC4752ye {

    /* renamed from: com.ironsource.ye$a */
    public static final class a implements InterfaceC4752ye {

        /* renamed from: a, reason: collision with root package name */
        private final C4555ne f8782a;
        private final C4371d9 b;

        public a(C4555ne error, C4371d9 c4371d9) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.f8782a = error;
            this.b = c4371d9;
        }

        public final C4555ne a() {
            return this.f8782a;
        }

        public final C4371d9 b() {
            return this.b;
        }

        public final C4555ne c() {
            return this.f8782a;
        }

        public final C4371d9 d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f8782a, aVar.f8782a) && Intrinsics.areEqual(this.b, aVar.b);
        }

        public int hashCode() {
            int hashCode = this.f8782a.hashCode() * 31;
            C4371d9 c4371d9 = this.b;
            return hashCode + (c4371d9 == null ? 0 : c4371d9.hashCode());
        }

        public String toString() {
            return "Failure(error=" + this.f8782a + ", performanceMeasurer=" + this.b + ")";
        }

        public final a a(C4555ne error, C4371d9 c4371d9) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new a(error, c4371d9);
        }

        public static /* synthetic */ a a(a aVar, C4555ne c4555ne, C4371d9 c4371d9, int i, Object obj) {
            if ((i & 1) != 0) {
                c4555ne = aVar.f8782a;
            }
            if ((i & 2) != 0) {
                c4371d9 = aVar.b;
            }
            return aVar.a(c4555ne, c4371d9);
        }

        public /* synthetic */ a(C4555ne c4555ne, C4371d9 c4371d9, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(c4555ne, (i & 2) != 0 ? null : c4371d9);
        }
    }

    /* renamed from: com.ironsource.ye$b */
    public static final class b implements InterfaceC4752ye {

        /* renamed from: a, reason: collision with root package name */
        private final C4680ue f8783a;
        private final C4371d9 b;

        public b(C4680ue sdkInitResponse, C4371d9 c4371d9) {
            Intrinsics.checkNotNullParameter(sdkInitResponse, "sdkInitResponse");
            this.f8783a = sdkInitResponse;
            this.b = c4371d9;
        }

        public final C4680ue a() {
            return this.f8783a;
        }

        public final C4371d9 b() {
            return this.b;
        }

        public final C4371d9 c() {
            return this.b;
        }

        public final C4680ue d() {
            return this.f8783a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f8783a, bVar.f8783a) && Intrinsics.areEqual(this.b, bVar.b);
        }

        public int hashCode() {
            int hashCode = this.f8783a.hashCode() * 31;
            C4371d9 c4371d9 = this.b;
            return hashCode + (c4371d9 == null ? 0 : c4371d9.hashCode());
        }

        public String toString() {
            return "Success(sdkInitResponse=" + this.f8783a + ", performanceMeasurer=" + this.b + ")";
        }

        public final b a(C4680ue sdkInitResponse, C4371d9 c4371d9) {
            Intrinsics.checkNotNullParameter(sdkInitResponse, "sdkInitResponse");
            return new b(sdkInitResponse, c4371d9);
        }

        public static /* synthetic */ b a(b bVar, C4680ue c4680ue, C4371d9 c4371d9, int i, Object obj) {
            if ((i & 1) != 0) {
                c4680ue = bVar.f8783a;
            }
            if ((i & 2) != 0) {
                c4371d9 = bVar.b;
            }
            return bVar.a(c4680ue, c4371d9);
        }
    }
}
