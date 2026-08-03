package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid;

/* loaded from: classes5.dex */
public final class c {
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.c.a c = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.c.a(null);
    public static final int d = 8;
    public static final java.lang.String e = "MraidJsEventReceiver";

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f7563a;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public c(android.content.Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a mraidCommunicationHub) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mraidCommunicationHub, "mraidCommunicationHub");
        this.f7563a = context;
        this.b = mraidCommunicationHub;
    }

    @android.webkit.JavascriptInterface
    public final void close() {
        this.b.a();
    }

    @android.webkit.JavascriptInterface
    public final void expand(java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
    }

    @android.webkit.JavascriptInterface
    public final void open(java.lang.String jsonParams) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonParams, "jsonParams");
        java.lang.String string = new org.json.JSONObject(jsonParams).getString("url");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a aVar = this.b;
        kotlin.jvm.internal.Intrinsics.checkNotNull(string);
        aVar.a(string);
    }

    @android.webkit.JavascriptInterface
    public final void resize(java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
    }

    @android.webkit.JavascriptInterface
    public final void setOrientationProperties(java.lang.String jsonParams) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonParams, "jsonParams");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(jsonParams);
            boolean optBoolean = jSONObject.optBoolean("allowOrientationChange", true);
            java.lang.String optString = jSONObject.optString("forceOrientation", "none");
            com.moloco.sdk.internal.MolocoLogger.debug$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, e, "Orientation Set from JSON: " + optBoolean + ", " + optString, false, 4, null);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p.f7518a.a(optString);
            if (a2 != null) {
                this.b.a(optBoolean, a2);
            }
        } catch (java.lang.Exception e2) {
            com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, e, "Error parsing orientation properties JSON", e2, false, 8, null);
        }
    }
}
