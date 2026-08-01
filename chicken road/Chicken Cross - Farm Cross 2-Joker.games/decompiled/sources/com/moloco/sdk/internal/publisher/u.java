package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.internal.ortb.model.C4782e;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes7.dex */
public final class u {
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.a a(C4782e c4782e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j creativeType) {
        com.moloco.sdk.internal.ortb.model.m onCreativeRenderingCheck;
        String e;
        float f;
        Float b;
        Intrinsics.checkNotNullParameter(c4782e, "<this>");
        Intrinsics.checkNotNullParameter(creativeType, "creativeType");
        com.moloco.sdk.internal.ortb.model.D sdkEvents = c4782e.getExt().getSdkEvents();
        if (sdkEvents == null || (onCreativeRenderingCheck = sdkEvents.getOnCreativeRenderingCheck()) == null || (e = onCreativeRenderingCheck.e()) == null) {
            return null;
        }
        if (StringsKt.isBlank(e)) {
            e = null;
        }
        if (e == null) {
            return null;
        }
        String lowerCase = creativeType.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        com.moloco.sdk.internal.ortb.model.l c = onCreativeRenderingCheck.c();
        if (c != null && (b = c.b()) != null) {
            Float f2 = b.floatValue() > 0.0f ? b : null;
            if (f2 != null) {
                f = f2.floatValue();
                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.a(e, lowerCase, f);
            }
        }
        f = 0.9f;
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.a(e, lowerCase, f);
    }
}
