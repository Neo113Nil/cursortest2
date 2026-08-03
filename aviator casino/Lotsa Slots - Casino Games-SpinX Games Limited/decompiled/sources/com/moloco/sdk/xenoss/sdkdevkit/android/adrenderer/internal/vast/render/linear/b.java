package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear;

/* loaded from: classes5.dex */
public final class b {
    public static final int d = 8;

    /* renamed from: a, reason: collision with root package name */
    public java.util.List<java.lang.String> f7920a;
    public java.util.List<java.lang.String> b;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l c;

    public b(java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l vastTracker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vastTracker, "vastTracker");
        this.f7920a = list;
        this.b = list2;
        this.c = vastTracker;
    }

    public static /* synthetic */ void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.b bVar, java.lang.Integer num, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        bVar.a(num, str);
    }

    public static /* synthetic */ void b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.b bVar, java.lang.Integer num, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        bVar.b(num, str);
    }

    public final void a(java.lang.Integer num, java.lang.String str) {
        java.util.List<java.lang.String> list = this.f7920a;
        if (list != null) {
            this.c.a(list, null, num, str);
            this.f7920a = null;
        }
    }

    public final void b(java.lang.Integer num, java.lang.String str) {
        java.util.List<java.lang.String> list = this.b;
        if (list != null) {
            this.c.a(list, null, num, str);
            this.b = null;
        }
    }

    public /* synthetic */ b(java.util.List list, java.util.List list2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l lVar, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, (i & 4) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.n.b() : lVar);
    }
}
