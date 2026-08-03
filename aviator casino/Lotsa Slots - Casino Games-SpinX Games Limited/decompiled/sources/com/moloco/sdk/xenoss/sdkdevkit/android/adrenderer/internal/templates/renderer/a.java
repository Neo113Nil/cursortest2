package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer;

/* loaded from: classes5.dex */
public final class a {
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.a.C0253a b = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.a.C0253a(null);
    public static final int c = 8;
    public static final java.lang.String d = "TemplateJavascript";

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.e f7566a;

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.a$a, reason: collision with other inner class name */
    public static final class C0253a {
        public /* synthetic */ C0253a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0253a() {
        }
    }

    public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.e eventHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        this.f7566a = eventHandler;
    }

    @android.webkit.JavascriptInterface
    public final void log(java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, d, message, null, false, 12, null);
    }

    @android.webkit.JavascriptInterface
    public final void onEvent(java.lang.String event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
        this.f7566a.a(event);
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String sdkVersion() {
        return com.moloco.sdk.BuildConfig.SDK_VERSION_NAME;
    }
}
