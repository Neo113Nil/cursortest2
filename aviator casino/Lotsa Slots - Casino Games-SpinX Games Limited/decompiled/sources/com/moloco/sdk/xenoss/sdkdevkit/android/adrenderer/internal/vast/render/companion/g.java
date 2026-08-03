package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion;

/* loaded from: classes5.dex */
public final class g {
    public static final int f = 8;

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a f7831a;
    public java.util.List<java.lang.String> b;
    public java.util.List<java.lang.String> c;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h d;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l e;

    public g(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h buttonTracker, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l vastTracker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buttonTracker, "buttonTracker");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vastTracker, "vastTracker");
        this.f7831a = customUserEventBuilderService;
        this.b = list;
        this.c = list2;
        this.d = buttonTracker;
        this.e = vastTracker;
    }

    public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c button) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(button, "button");
        this.d.a(button);
    }

    public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a buttonType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        this.d.a(buttonType);
    }

    public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.f lastClickPosition) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastClickPosition, "lastClickPosition");
        java.util.List<java.lang.String> list = this.b;
        if (list != null) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.a.a(this.e, list, null, null, null, this.d.p(), this.f7831a, lastClickPosition, 14, null);
            this.b = null;
        }
    }

    public /* synthetic */ g(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, java.util.List list, java.util.List list2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h hVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l lVar, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, list, list2, (i & 8) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.j.a() : hVar, (i & 16) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.n.b() : lVar);
    }

    public final void a() {
        java.util.List<java.lang.String> list = this.c;
        if (list != null) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.a.a(this.e, list, null, null, null, 14, null);
            this.c = null;
        }
    }
}
