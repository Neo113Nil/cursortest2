package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer;

import android.webkit.JavascriptInterface;
import com.moloco.sdk.BuildConfig;
import com.moloco.sdk.internal.MolocoLogger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class b {
    public static final a b = new a(null);
    public static final int c = 8;
    public static final String d = "TemplateJavascript";

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.e f11093a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.e eventHandler) {
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        this.f11093a = eventHandler;
    }

    @JavascriptInterface
    public final void log(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, d, message, null, false, 12, null);
    }

    @JavascriptInterface
    public final void onEvent(String event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f11093a.a(event);
    }

    @JavascriptInterface
    public final String sdkVersion() {
        return BuildConfig.SDK_VERSION_NAME;
    }
}
