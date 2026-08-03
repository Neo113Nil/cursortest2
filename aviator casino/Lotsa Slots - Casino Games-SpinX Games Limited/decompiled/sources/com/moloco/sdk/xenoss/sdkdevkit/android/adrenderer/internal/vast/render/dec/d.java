package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec;

/* loaded from: classes5.dex */
public final class d {
    public static final int g = 8;

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a f7905a;
    public java.util.List<java.lang.String> b;
    public java.util.List<java.lang.String> c;
    public java.util.List<java.lang.String> d;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h e;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l f;

    public d(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2, java.util.List<java.lang.String> list3, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h buttonTracker, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l vastTracker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buttonTracker, "buttonTracker");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vastTracker, "vastTracker");
        this.f7905a = customUserEventBuilderService;
        this.b = list;
        this.c = list2;
        this.d = list3;
        this.e = buttonTracker;
        this.f = vastTracker;
    }

    public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c button) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(button, "button");
        this.e.a(button);
    }

    public final void b() {
        java.util.List<java.lang.String> list = this.d;
        if (list != null) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.a.a(this.f, list, null, null, null, 14, null);
            this.d = null;
        }
    }

    public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a buttonType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        this.e.a(buttonType);
    }

    public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.f position) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(position, "position");
        java.util.List<java.lang.String> list = this.b;
        if (list != null) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.a.a(this.f, list, null, null, null, this.e.p(), this.f7905a, position, 14, null);
            this.b = null;
        }
    }

    public /* synthetic */ d(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, java.util.List list, java.util.List list2, java.util.List list3, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h hVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l lVar, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, list, list2, list3, (i & 16) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.j.a() : hVar, (i & 32) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.n.b() : lVar);
    }

    public final void a() {
        java.util.List<java.lang.String> list = this.c;
        if (list != null) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.a.a(this.f, list, null, null, null, 14, null);
            this.c = null;
        }
    }
}
