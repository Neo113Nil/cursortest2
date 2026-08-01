package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.TextUnit;
import com.moloco.sdk.R;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.UInt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function11;

/* loaded from: classes7.dex */
public final class h {
    public static final Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC1622a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit> a(Alignment alignment, PaddingValues paddingValues, long j, long j2, long j3, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q qVar, Function0<Unit> function0, com.moloco.sdk.internal.ortb.model.k kVar, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1043664790);
        Alignment topEnd = (i2 & 1) != 0 ? Alignment.INSTANCE.getTopEnd() : alignment;
        PaddingValues m413PaddingValues0680j_4 = (i2 & 2) != 0 ? PaddingKt.m413PaddingValues0680j_4(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.a()) : paddingValues;
        long m976getPrimary0d7_KjU = (i2 & 4) != 0 ? MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m976getPrimary0d7_KjU() : j;
        long b = (i2 & 8) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.b() : j2;
        long d = (i2 & 16) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.d() : j3;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q a2 = (i2 & 32) != 0 ? a(null, 0L, null, 0L, composer, 0, 15) : qVar;
        Function0<Unit> function02 = (i2 & 64) != 0 ? null : function0;
        com.moloco.sdk.internal.ortb.model.k kVar2 = (i2 & 128) == 0 ? kVar : null;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1043664790, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultAdSkipCountdownButton (DefaultAdSkipCountdownButton.kt:36)");
        }
        int i3 = i << 3;
        Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC1622a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit> a3 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.d.a(topEnd, m413PaddingValues0680j_4, m976getPrimary0d7_KjU, b, d, a2, a.AbstractC1622a.c.EnumC1624a.c, function02, kVar2, composer, (i & 14) | 1572864 | (i & 112) | (i & 896) | (i & 7168) | (57344 & i) | (458752 & i) | (29360128 & i3) | (i3 & 234881024));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return a3;
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q a(Painter painter, long j, Shape shape, long j2, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-571269297);
        Painter painterResource = (i2 & 1) != 0 ? PainterResources_androidKt.painterResource(R.drawable.ic_round_skip_next_24, composer, 0) : painter;
        long b = (i2 & 2) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.b() : j;
        Shape f = (i2 & 4) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.f() : shape;
        long e = (i2 & 8) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.e() : j2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-571269297, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.adSkipAfterCountdownIcon (DefaultAdSkipCountdownButton.kt:54)");
        }
        q.b bVar = new q.b(painterResource, "Skip", b, f, e, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return bVar;
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q a(String str, Painter painter, long j, Shape shape, long j2, boolean z, boolean z2, long j3, long j4, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1328580925);
        String str2 = (i2 & 1) != 0 ? "play store" : str;
        Painter painterResource = (i2 & 2) != 0 ? PainterResources_androidKt.painterResource(R.drawable.double_arrow_24, composer, 0) : painter;
        long b = (i2 & 4) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.b() : j;
        Shape g = (i2 & 8) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.g() : shape;
        long e = (i2 & 16) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.e() : j2;
        boolean z3 = (i2 & 32) != 0 ? true : z;
        boolean z4 = (i2 & 64) != 0 ? true : z2;
        long m4032getUnspecifiedXSAIIZE = (i2 & 256) != 0 ? TextUnit.INSTANCE.m4032getUnspecifiedXSAIIZE() : j4;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1328580925, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.adSkipAfterCountdownTextIcon (DefaultAdSkipCountdownButton.kt:73)");
        }
        q.d dVar = new q.d(str2, painterResource, str2, b, g, e, z3, z4, j3, m4032getUnspecifiedXSAIIZE, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return dVar;
    }
}
