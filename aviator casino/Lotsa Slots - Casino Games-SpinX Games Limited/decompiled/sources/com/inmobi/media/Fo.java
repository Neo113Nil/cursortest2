package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class Fo {
    public static boolean a(android.webkit.WebView view, android.webkit.RenderProcessGoneDetail renderProcessGoneDetail, java.lang.String source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        if (android.os.Build.VERSION.SDK_INT < 26) {
            return false;
        }
        java.util.Map mutableMapOf = kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("source", source), kotlin.TuplesKt.to("isCrashed", java.lang.Boolean.valueOf(renderProcessGoneDetail != null ? renderProcessGoneDetail.didCrash() : false)));
        com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
        com.inmobi.media.C2624nk.b("WebViewRenderProcessGoneEvent", mutableMapOf, com.inmobi.media.EnumC2728rk.f5431a);
        view.destroy();
        return true;
    }
}
