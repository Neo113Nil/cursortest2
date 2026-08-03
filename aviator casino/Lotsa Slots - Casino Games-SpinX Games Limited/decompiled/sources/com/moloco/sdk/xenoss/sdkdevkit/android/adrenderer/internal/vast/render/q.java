package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

/* loaded from: classes5.dex */
public final class q {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7939a;

        static {
            int[] iArr = new int[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i.values().length];
            try {
                iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i.f7775a.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i.b.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            f7939a = iArr;
        }
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3447d a(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3447d c3447d = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3447d(context);
        c3447d.setScrollBarStyle(0);
        c3447d.setHorizontalScrollBarEnabled(false);
        c3447d.setVerticalScrollBarEnabled(false);
        android.webkit.WebSettings settings = c3447d.getSettings();
        settings.setSupportZoom(false);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        c3447d.setBackgroundColor(0);
        return c3447d;
    }

    public static final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3447d c3447d, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y vastResource) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c3447d, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vastResource, "vastResource");
        if (vastResource instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y.c) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y.c cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y.c) vastResource;
            int i = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.q.a.f7939a[cVar.a().a().ordinal()];
            if (i == 1) {
                str = "<html><head></head><body style=\"margin:0;padding:0\"><img src=\"" + cVar.a().b() + "\" width=\"100%\" style=\"max-width:100%;max-height:100%;\" /></body></html>";
            } else if (i == 2) {
                str = "<script src=\"" + cVar.a().b() + "\"></script>";
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        } else if (vastResource instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y.a) {
            str = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y.a) vastResource).a().a();
        } else if (vastResource instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y.b) {
            str = "<iframe frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" style=\"border: 0px; margin: 0px;\" width=100% height=100% src=\"" + ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y.b) vastResource).a().a() + "\"></iframe>";
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        try {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3448e.a(c3447d, c3447d.getHtmlCssFixer().a(str));
        } catch (java.lang.Exception e) {
            com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, "BaseWebView", e.toString(), e, false, 8, null);
        }
    }
}
