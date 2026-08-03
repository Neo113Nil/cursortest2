package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad;

/* loaded from: classes5.dex */
public final class j {
    public static final java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k> a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, android.content.Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, boolean z, java.lang.Boolean bool, int i, int i2, int i3, boolean z2, boolean z3, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l linkHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkHandler, "linkHandler");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k.c cVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k.c(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e(aVar.j(), 0, z, bool, i, z2, z3, context, customUserEventBuilderService, externalLinkHandler, linkHandler));
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c f = aVar.f();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k.a aVar2 = f != null ? new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k.a(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.c(f, kotlin.UInt.m10896constructorimpl(kotlin.ranges.RangesKt.coerceAtLeast(i2, 0)), context, customUserEventBuilderService, externalLinkHandler, z, linkHandler, null)) : null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i g = aVar.g();
        return kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k[]{cVar, aVar2, g != null ? new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k.b(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.c(g, aVar.j().i(), kotlin.UInt.m10896constructorimpl(kotlin.ranges.RangesKt.coerceAtLeast(i3, 0)), context, customUserEventBuilderService, externalLinkHandler, linkHandler, null)) : null});
    }
}
