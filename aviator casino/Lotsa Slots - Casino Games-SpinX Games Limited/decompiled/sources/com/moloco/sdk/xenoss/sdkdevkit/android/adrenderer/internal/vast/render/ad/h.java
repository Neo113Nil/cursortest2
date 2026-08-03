package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad;

/* loaded from: classes5.dex */
public final class h {
    public static final int e = 8;

    /* renamed from: a, reason: collision with root package name */
    public java.util.List<java.lang.String> f7819a;
    public java.util.List<java.lang.String> b;
    public final java.util.List<java.lang.String> c;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l d;

    public h(java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2, java.util.List<java.lang.String> list3, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l vastTracker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vastTracker, "vastTracker");
        this.f7819a = list;
        this.b = list2;
        this.c = list3;
        this.d = vastTracker;
    }

    public final void a() {
        java.util.List<java.lang.String> list = this.b;
        if (list != null) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.a.a(this.d, list, null, null, null, 14, null);
            this.b = null;
        }
    }

    public final boolean b() {
        java.util.List<java.lang.String> list = this.f7819a;
        if (list == null) {
            return false;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.a.a(this.d, list, null, null, null, 14, null);
        this.f7819a = null;
        return true;
    }

    public static /* synthetic */ void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.h hVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x xVar, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            xVar = null;
        }
        hVar.a(xVar);
    }

    public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x xVar) {
        java.util.List<java.lang.String> list = this.c;
        if (list != null) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.a.a(this.d, list, xVar, null, null, 12, null);
        }
    }

    public /* synthetic */ h(java.util.List list, java.util.List list2, java.util.List list3, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l lVar, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, list3, (i & 8) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.n.b() : lVar);
    }
}
