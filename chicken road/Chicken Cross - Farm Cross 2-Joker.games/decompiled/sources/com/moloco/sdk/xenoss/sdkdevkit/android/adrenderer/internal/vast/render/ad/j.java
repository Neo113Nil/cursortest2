package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad;

import android.content.Context;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C4823i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k;
import java.util.List;
import kotlin.UInt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: classes7.dex */
public final class j {
    public static final List<k> a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar, r externalLinkHandler, Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, boolean z, Boolean bool, int i, int i2, int i3, boolean z2, boolean z3, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g adaptiveBlurConfig, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k linkHandler) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(adaptiveBlurConfig, "adaptiveBlurConfig");
        Intrinsics.checkNotNullParameter(linkHandler, "linkHandler");
        k.c cVar = new k.c(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e(aVar.j(), 0, z, bool, i, z2, z3, context, customUserEventBuilderService, externalLinkHandler, linkHandler, adaptiveBlurConfig));
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c f = aVar.f();
        k.a aVar2 = f != null ? new k.a(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.c(f, UInt.m8176constructorimpl(RangesKt.coerceAtLeast(i2, 0)), context, customUserEventBuilderService, externalLinkHandler, z, linkHandler, null)) : null;
        C4823i g = aVar.g();
        return CollectionsKt.listOfNotNull((Object[]) new k[]{cVar, aVar2, g != null ? new k.b(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.c(g, aVar.j().i(), UInt.m8176constructorimpl(RangesKt.coerceAtLeast(i3, 0)), context, customUserEventBuilderService, externalLinkHandler, linkHandler, null)) : null});
    }
}
