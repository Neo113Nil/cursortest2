package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

/* loaded from: classes5.dex */
public final class a {
    public static final int f = 8;

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f f7794a;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c b;
    public final java.util.List<java.lang.String> c;
    public final java.util.List<java.lang.String> d;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i e;

    public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f linear, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c cVar, java.util.List<java.lang.String> impressionTracking, java.util.List<java.lang.String> errorTracking, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i c3453i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linear, "linear");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(impressionTracking, "impressionTracking");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorTracking, "errorTracking");
        this.f7794a = linear;
        this.b = cVar;
        this.c = impressionTracking;
        this.d = errorTracking;
        this.e = c3453i;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f a() {
        return this.f7794a;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c b() {
        return this.b;
    }

    public final java.util.List<java.lang.String> c() {
        return this.c;
    }

    public final java.util.List<java.lang.String> d() {
        return this.d;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i e() {
        return this.e;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a)) {
            return false;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f7794a, aVar.f7794a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, aVar.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, aVar.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, aVar.d) && kotlin.jvm.internal.Intrinsics.areEqual(this.e, aVar.e);
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c f() {
        return this.b;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i g() {
        return this.e;
    }

    public final java.util.List<java.lang.String> h() {
        return this.d;
    }

    public int hashCode() {
        int hashCode = this.f7794a.hashCode() * 31;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c cVar = this.b;
        int hashCode2 = (((((hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i c3453i = this.e;
        return hashCode2 + (c3453i != null ? c3453i.hashCode() : 0);
    }

    public final java.util.List<java.lang.String> i() {
        return this.c;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f j() {
        return this.f7794a;
    }

    public java.lang.String toString() {
        return "Ad(linear=" + this.f7794a + ", companion=" + this.b + ", impressionTracking=" + this.c + ", errorTracking=" + this.d + ", dec=" + this.e + ')';
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f linear, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c cVar, java.util.List<java.lang.String> impressionTracking, java.util.List<java.lang.String> errorTracking, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i c3453i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linear, "linear");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(impressionTracking, "impressionTracking");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorTracking, "errorTracking");
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a(linear, cVar, impressionTracking, errorTracking, c3453i);
    }

    public static /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f fVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c cVar, java.util.List list, java.util.List list2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i c3453i, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            fVar = aVar.f7794a;
        }
        if ((i & 2) != 0) {
            cVar = aVar.b;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c cVar2 = cVar;
        if ((i & 4) != 0) {
            list = aVar.c;
        }
        java.util.List list3 = list;
        if ((i & 8) != 0) {
            list2 = aVar.d;
        }
        java.util.List list4 = list2;
        if ((i & 16) != 0) {
            c3453i = aVar.e;
        }
        return aVar.a(fVar, cVar2, list3, list4, c3453i);
    }

    public /* synthetic */ a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f fVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c cVar, java.util.List list, java.util.List list2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i c3453i, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, cVar, list, list2, (i & 16) != 0 ? null : c3453i);
    }
}
