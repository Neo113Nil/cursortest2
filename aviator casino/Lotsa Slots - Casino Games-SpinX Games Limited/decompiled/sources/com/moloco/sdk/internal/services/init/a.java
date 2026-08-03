package com.moloco.sdk.internal.services.init;

/* loaded from: classes5.dex */
public final class a {
    public static final int b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f7280a;

    public a(java.lang.String appKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appKey, "appKey");
        this.f7280a = appKey;
    }

    public final java.lang.String a() {
        return this.f7280a;
    }

    public final java.lang.String b() {
        return this.f7280a;
    }

    public final java.lang.String c() {
        return this.f7280a + "___v1";
    }

    public final java.util.List<java.lang.String> d() {
        return kotlin.collections.CollectionsKt.emptyList();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.moloco.sdk.internal.services.init.a) && kotlin.jvm.internal.Intrinsics.areEqual(this.f7280a, ((com.moloco.sdk.internal.services.init.a) obj).f7280a);
    }

    public int hashCode() {
        return this.f7280a.hashCode();
    }

    public java.lang.String toString() {
        return "CacheKey(appKey=" + this.f7280a + ')';
    }

    public final com.moloco.sdk.internal.services.init.a a(java.lang.String appKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appKey, "appKey");
        return new com.moloco.sdk.internal.services.init.a(appKey);
    }

    public static /* synthetic */ com.moloco.sdk.internal.services.init.a a(com.moloco.sdk.internal.services.init.a aVar, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = aVar.f7280a;
        }
        return aVar.a(str);
    }
}
