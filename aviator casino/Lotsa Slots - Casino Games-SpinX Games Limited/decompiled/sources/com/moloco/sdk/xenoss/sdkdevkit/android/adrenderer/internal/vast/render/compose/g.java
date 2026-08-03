package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

/* loaded from: classes5.dex */
public final class g {
    public static final kotlin.jvm.functions.Function11<androidx.compose.foundation.layout.BoxScope, java.lang.Boolean, java.lang.Boolean, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, kotlin.Unit>, java.lang.Boolean, kotlin.UInt, kotlin.UInt, kotlin.jvm.functions.Function0<kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> a(androidx.compose.ui.Alignment alignment, androidx.compose.foundation.layout.PaddingValues paddingValues, long j, long j2, long j3, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q qVar, kotlin.jvm.functions.Function0<kotlin.Unit> function0, com.moloco.sdk.internal.ortb.model.k kVar, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1043664790);
        androidx.compose.ui.Alignment topEnd = (i2 & 1) != 0 ? androidx.compose.ui.Alignment.INSTANCE.getTopEnd() : alignment;
        androidx.compose.foundation.layout.PaddingValues m561PaddingValues0680j_4 = (i2 & 2) != 0 ? androidx.compose.foundation.layout.PaddingKt.m561PaddingValues0680j_4(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.a()) : paddingValues;
        long m1315getPrimary0d7_KjU = (i2 & 4) != 0 ? androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, androidx.compose.material.MaterialTheme.$stable).m1315getPrimary0d7_KjU() : j;
        long b = (i2 & 8) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.b() : j2;
        long d = (i2 & 16) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.d() : j3;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q a2 = (i2 & 32) != 0 ? a(null, 0L, null, 0L, composer, 0, 15) : qVar;
        kotlin.jvm.functions.Function0<kotlin.Unit> function02 = (i2 & 64) != 0 ? null : function0;
        com.moloco.sdk.internal.ortb.model.k kVar2 = (i2 & 128) == 0 ? kVar : null;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1043664790, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultAdSkipCountdownButton (DefaultAdSkipCountdownButton.kt:36)");
        }
        int i3 = i << 3;
        kotlin.jvm.functions.Function11<androidx.compose.foundation.layout.BoxScope, java.lang.Boolean, java.lang.Boolean, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, kotlin.Unit>, java.lang.Boolean, kotlin.UInt, kotlin.UInt, kotlin.jvm.functions.Function0<kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> a3 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.d.a(topEnd, m561PaddingValues0680j_4, m1315getPrimary0d7_KjU, b, d, a2, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a.c, function02, kVar2, composer, (i & 14) | 1572864 | (i & 112) | (i & 896) | (i & 7168) | (57344 & i) | (458752 & i) | (29360128 & i3) | (i3 & 234881024));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return a3;
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q a(androidx.compose.ui.graphics.painter.Painter painter, long j, androidx.compose.ui.graphics.Shape shape, long j2, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-571269297);
        androidx.compose.ui.graphics.painter.Painter painterResource = (i2 & 1) != 0 ? androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.moloco.sdk.R.drawable.ic_round_skip_next_24, composer, 0) : painter;
        long b = (i2 & 2) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.b() : j;
        androidx.compose.ui.graphics.Shape f = (i2 & 4) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.f() : shape;
        long e = (i2 & 8) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.e() : j2;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-571269297, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.adSkipAfterCountdownIcon (DefaultAdSkipCountdownButton.kt:54)");
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q.b bVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q.b(painterResource, "Skip", b, f, e, null);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return bVar;
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q a(java.lang.String str, androidx.compose.ui.graphics.painter.Painter painter, long j, androidx.compose.ui.graphics.Shape shape, long j2, boolean z, boolean z2, long j3, long j4, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1328580925);
        java.lang.String str2 = (i2 & 1) != 0 ? "play store" : str;
        androidx.compose.ui.graphics.painter.Painter painterResource = (i2 & 2) != 0 ? androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.moloco.sdk.R.drawable.double_arrow_24, composer, 0) : painter;
        long b = (i2 & 4) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.b() : j;
        androidx.compose.ui.graphics.Shape g = (i2 & 8) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.g() : shape;
        long e = (i2 & 16) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.e() : j2;
        boolean z3 = (i2 & 32) != 0 ? true : z;
        boolean z4 = (i2 & 64) != 0 ? true : z2;
        long m4684getUnspecifiedXSAIIZE = (i2 & 256) != 0 ? androidx.compose.ui.unit.TextUnit.INSTANCE.m4684getUnspecifiedXSAIIZE() : j4;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1328580925, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.adSkipAfterCountdownTextIcon (DefaultAdSkipCountdownButton.kt:73)");
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q.d dVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q.d(str2, painterResource, str2, b, g, e, z3, z4, j3, m4684getUnspecifiedXSAIIZE, null);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return dVar;
    }
}
