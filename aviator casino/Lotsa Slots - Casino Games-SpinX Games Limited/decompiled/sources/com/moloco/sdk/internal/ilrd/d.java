package com.moloco.sdk.internal.ilrd;

/* loaded from: classes5.dex */
public interface d {

    public interface a {

        /* renamed from: com.moloco.sdk.internal.ilrd.d$a$a, reason: collision with other inner class name */
        public static final class C0180a implements com.moloco.sdk.internal.ilrd.d.a {
            public static final int b = 0;

            /* renamed from: a, reason: collision with root package name */
            public final com.moloco.sdk.IlrdRequest.LevelPlayImpression f6985a;

            public C0180a(com.moloco.sdk.IlrdRequest.LevelPlayImpression impression) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(impression, "impression");
                this.f6985a = impression;
            }

            public final com.moloco.sdk.IlrdRequest.LevelPlayImpression a() {
                return this.f6985a;
            }

            public final com.moloco.sdk.IlrdRequest.LevelPlayImpression b() {
                return this.f6985a;
            }

            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof com.moloco.sdk.internal.ilrd.d.a.C0180a) && kotlin.jvm.internal.Intrinsics.areEqual(this.f6985a, ((com.moloco.sdk.internal.ilrd.d.a.C0180a) obj).f6985a);
            }

            public int hashCode() {
                return this.f6985a.hashCode();
            }

            public java.lang.String toString() {
                return "LevelPlay(impression=" + this.f6985a + ')';
            }

            public final com.moloco.sdk.internal.ilrd.d.a.C0180a a(com.moloco.sdk.IlrdRequest.LevelPlayImpression impression) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(impression, "impression");
                return new com.moloco.sdk.internal.ilrd.d.a.C0180a(impression);
            }

            public static /* synthetic */ com.moloco.sdk.internal.ilrd.d.a.C0180a a(com.moloco.sdk.internal.ilrd.d.a.C0180a c0180a, com.moloco.sdk.IlrdRequest.LevelPlayImpression levelPlayImpression, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    levelPlayImpression = c0180a.f6985a;
                }
                return c0180a.a(levelPlayImpression);
            }
        }

        public static final class b implements com.moloco.sdk.internal.ilrd.d.a {
            public static final int b = 0;

            /* renamed from: a, reason: collision with root package name */
            public final com.moloco.sdk.IlrdRequest.MaxImpression f6986a;

            public b(com.moloco.sdk.IlrdRequest.MaxImpression impression) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(impression, "impression");
                this.f6986a = impression;
            }

            public final com.moloco.sdk.IlrdRequest.MaxImpression a() {
                return this.f6986a;
            }

            public final com.moloco.sdk.IlrdRequest.MaxImpression b() {
                return this.f6986a;
            }

            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof com.moloco.sdk.internal.ilrd.d.a.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.f6986a, ((com.moloco.sdk.internal.ilrd.d.a.b) obj).f6986a);
            }

            public int hashCode() {
                return this.f6986a.hashCode();
            }

            public java.lang.String toString() {
                return "Max(impression=" + this.f6986a + ')';
            }

            public final com.moloco.sdk.internal.ilrd.d.a.b a(com.moloco.sdk.IlrdRequest.MaxImpression impression) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(impression, "impression");
                return new com.moloco.sdk.internal.ilrd.d.a.b(impression);
            }

            public static /* synthetic */ com.moloco.sdk.internal.ilrd.d.a.b a(com.moloco.sdk.internal.ilrd.d.a.b bVar, com.moloco.sdk.IlrdRequest.MaxImpression maxImpression, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    maxImpression = bVar.f6986a;
                }
                return bVar.a(maxImpression);
            }
        }
    }

    com.moloco.sdk.internal.ilrd.model.a a();

    java.lang.Object b();

    kotlinx.coroutines.flow.SharedFlow<com.moloco.sdk.internal.ilrd.d.a> c();

    kotlinx.coroutines.flow.StateFlow<com.moloco.sdk.internal.ilrd.h> getState();
}
