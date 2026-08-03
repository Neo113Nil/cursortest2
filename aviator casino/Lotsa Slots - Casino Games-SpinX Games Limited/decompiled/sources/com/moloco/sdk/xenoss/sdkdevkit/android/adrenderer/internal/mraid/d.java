package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

/* loaded from: classes5.dex */
public final class d {
    public static final java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k> a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c cVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.j mraidFullscreenContentController, int i, android.content.Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l linkHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cVar, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mraidFullscreenContentController, "mraidFullscreenContentController");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkHandler, "linkHandler");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k.d dVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k.d(mraidFullscreenContentController);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i b = cVar.b();
        return kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k[]{dVar, b != null ? new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k.b(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.c(b, null, kotlin.UInt.m10896constructorimpl(kotlin.ranges.RangesKt.coerceAtLeast(i, 0)), context, customUserEventBuilderService, externalLinkHandler, linkHandler, null)) : null});
    }
}
