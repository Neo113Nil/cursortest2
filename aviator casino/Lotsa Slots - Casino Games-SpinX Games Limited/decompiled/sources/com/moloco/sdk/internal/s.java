package com.moloco.sdk.internal;

/* loaded from: classes5.dex */
public final class s {
    public static final int d = 8;

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.publisher.MolocoAdError f7188a;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c b;
    public final java.util.Map<java.lang.String, java.lang.String> c;

    public s(com.moloco.sdk.publisher.MolocoAdError molocoAdError, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c subErrorType, java.util.Map<java.lang.String, java.lang.String> details) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAdError, "molocoAdError");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subErrorType, "subErrorType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(details, "details");
        this.f7188a = molocoAdError;
        this.b = subErrorType;
        this.c = details;
    }

    public final com.moloco.sdk.publisher.MolocoAdError a() {
        return this.f7188a;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c b() {
        return this.b;
    }

    public final java.util.Map<java.lang.String, java.lang.String> c() {
        return this.c;
    }

    public final java.util.Map<java.lang.String, java.lang.String> d() {
        return this.c;
    }

    public final com.moloco.sdk.publisher.MolocoAdError e() {
        return this.f7188a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.moloco.sdk.internal.s)) {
            return false;
        }
        com.moloco.sdk.internal.s sVar = (com.moloco.sdk.internal.s) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f7188a, sVar.f7188a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, sVar.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, sVar.c);
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c f() {
        return this.b;
    }

    public int hashCode() {
        return (((this.f7188a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public java.lang.String toString() {
        return "MolocoInternalAdError(molocoAdError=" + this.f7188a + ", subErrorType=" + this.b + ", details=" + this.c + ')';
    }

    public final com.moloco.sdk.internal.s a(com.moloco.sdk.publisher.MolocoAdError molocoAdError, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c subErrorType, java.util.Map<java.lang.String, java.lang.String> details) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAdError, "molocoAdError");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subErrorType, "subErrorType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(details, "details");
        return new com.moloco.sdk.internal.s(molocoAdError, subErrorType, details);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.moloco.sdk.internal.s a(com.moloco.sdk.internal.s sVar, com.moloco.sdk.publisher.MolocoAdError molocoAdError, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            molocoAdError = sVar.f7188a;
        }
        if ((i & 2) != 0) {
            cVar = sVar.b;
        }
        if ((i & 4) != 0) {
            map = sVar.c;
        }
        return sVar.a(molocoAdError, cVar, map);
    }

    public /* synthetic */ s(com.moloco.sdk.publisher.MolocoAdError molocoAdError, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar, java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(molocoAdError, cVar, (i & 4) != 0 ? kotlin.collections.MapsKt.emptyMap() : map);
    }
}
