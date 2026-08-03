package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

/* loaded from: classes5.dex */
public final class u {
    public static final int d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v f7787a;
    public final java.lang.String b;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r c;

    public u(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v event, java.lang.String url, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r rVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        this.f7787a = event;
        this.b = url;
        this.c = rVar;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v a() {
        return this.f7787a;
    }

    public final java.lang.String b() {
        return this.b;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r c() {
        return this.c;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v d() {
        return this.f7787a;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r e() {
        return this.c;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u)) {
            return false;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u uVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u) obj;
        return this.f7787a == uVar.f7787a && kotlin.jvm.internal.Intrinsics.areEqual(this.b, uVar.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, uVar.c);
    }

    public final java.lang.String f() {
        return this.b;
    }

    public int hashCode() {
        int hashCode = ((this.f7787a.hashCode() * 31) + this.b.hashCode()) * 31;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r rVar = this.c;
        return hashCode + (rVar == null ? 0 : rVar.hashCode());
    }

    public java.lang.String toString() {
        return "Tracking(event=" + this.f7787a + ", url=" + this.b + ", offset=" + this.c + ')';
    }

    public /* synthetic */ u(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v vVar, java.lang.String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r rVar, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(vVar, str, (i & 4) != 0 ? null : rVar);
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v event, java.lang.String url, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r rVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u(event, url, rVar);
    }

    public static /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u uVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v vVar, java.lang.String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r rVar, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            vVar = uVar.f7787a;
        }
        if ((i & 2) != 0) {
            str = uVar.b;
        }
        if ((i & 4) != 0) {
            rVar = uVar.c;
        }
        return uVar.a(vVar, str, rVar);
    }
}
