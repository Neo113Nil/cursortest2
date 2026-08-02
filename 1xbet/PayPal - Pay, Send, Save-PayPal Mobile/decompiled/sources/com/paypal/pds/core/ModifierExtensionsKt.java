package com.paypal.pds.core;

@kotlin.Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\u001a#\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a#\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00072\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\b\u001a-\u0010\t\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\f\u0010\r\u001aY\u0010\u000e\u001a\u00020\u0001*\u00020\u00012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001aE\u0010\u001e\u001a\u00020\u0001*\u00020\u00012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aH\u0001¢\u0006\u0004\b\u001f\u0010 \u001a[\u0010!\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\"\u001a\u00020\u00142\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001b0$H\u0007¢\u0006\u0004\b%\u0010&\u001aU\u0010'\u001a\u00020\u0001*\u00020\u00012\u0006\u0010(\u001a\u00020\u00142\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0007¢\u0006\u0004\b)\u0010*\u001aC\u0010+\u001a\u00020\u0001*\u00020\u00012\u0006\u0010,\u001a\u00020\u000b2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010-\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0004\b/\u00100\u001a\u0019\u00101\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u00102\u001a\u0019\u00103\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u00102\u001a\u0019\u00104\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u00102¨\u00065"}, d2 = {com.datadog.android.rum.internal.metric.SessionEndedMetric.VIEW_COUNTS_BG_KEY, "Landroidx/compose/ui/Modifier;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "Lcom/paypal/pds/core/Color;", com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_SHAPE, "Landroidx/compose/ui/graphics/Shape;", "(Landroidx/compose/ui/Modifier;Lcom/paypal/pds/core/Color;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;", "Lcom/paypal/pds/core/BaseColor;", "(Landroidx/compose/ui/Modifier;Lcom/paypal/pds/core/BaseColor;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;", androidx.compose.material.OutlinedTextFieldKt.BorderId, "width", "Landroidx/compose/ui/unit/Dp;", "border-DzVHIIc", "(Landroidx/compose/ui/Modifier;FLcom/paypal/pds/core/Color;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;", "clickable", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "indication", "Lcom/paypal/pds/core/PDSIndication;", "enabled", "", "role", "Landroidx/compose/ui/semantics/Role;", "onClickLabel", "", "onClick", "Lkotlin/Function0;", "", "clickable-_mRqjOc", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lcom/paypal/pds/core/PDSIndication;ZLandroidx/compose/ui/semantics/Role;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;", "optClickable", "optClickable-cJG_KMw", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lcom/paypal/pds/core/PDSIndication;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;", "toggleable", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "onValueChange", "Lkotlin/Function1;", "toggleable-XVZzFYc", "(Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lcom/paypal/pds/core/PDSIndication;ZLandroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;", "selectable", com.paypal.pds.components.ListKt.SelectedCheckmarkTestTag, "selectable-XVZzFYc", "(Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lcom/paypal/pds/core/PDSIndication;ZLandroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;", "shadow", "radius", "dx", "dy", "shadow-Q2ewo60", "(Landroidx/compose/ui/Modifier;FLcom/paypal/pds/core/Color;FFLandroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;", "elevationLevel1", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "elevationLevel2", "elevationLevel3", "pds_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ModifierExtensionsKt {
    public static final androidx.compose.ui.Modifier background(androidx.compose.ui.Modifier modifier, com.paypal.pds.core.Color color, androidx.compose.ui.graphics.Shape shape, androidx.compose.runtime.Composer composer, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(color, "");
        if ((i2 & 2) != 0) {
            shape = androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(21588005, i, -1, "com.paypal.pds.core.background (ModifierExtensions.kt:61)");
        }
        androidx.compose.ui.Modifier m1285backgroundbw27NRU = androidx.compose.foundation.BackgroundKt.m1285backgroundbw27NRU(modifier, color.getValue(composer, (i >> 3) & 14), shape);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return m1285backgroundbw27NRU;
    }

    public static final androidx.compose.ui.Modifier background(androidx.compose.ui.Modifier modifier, com.paypal.pds.core.BaseColor baseColor, androidx.compose.ui.graphics.Shape shape, androidx.compose.runtime.Composer composer, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseColor, "");
        if ((i2 & 2) != 0) {
            shape = androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1294521492, i, -1, "com.paypal.pds.core.background (ModifierExtensions.kt:71)");
        }
        androidx.compose.ui.Modifier m1285backgroundbw27NRU = androidx.compose.foundation.BackgroundKt.m1285backgroundbw27NRU(modifier, baseColor.getValue(composer, (i >> 3) & 14), shape);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return m1285backgroundbw27NRU;
    }

    /* renamed from: border-DzVHIIc, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m22099borderDzVHIIc(androidx.compose.ui.Modifier modifier, float f, com.paypal.pds.core.Color color, androidx.compose.ui.graphics.Shape shape, androidx.compose.runtime.Composer composer, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(color, "");
        if ((i2 & 4) != 0) {
            shape = androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-677541783, i, -1, "com.paypal.pds.core.border (ModifierExtensions.kt:90)");
        }
        androidx.compose.ui.Modifier m1297borderxT4_qwU = androidx.compose.foundation.BorderKt.m1297borderxT4_qwU(modifier, f, color.getValue(composer, (i >> 6) & 14), shape);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return m1297borderxT4_qwU;
    }

    /* renamed from: clickable-_mRqjOc, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m22100clickable_mRqjOc(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, com.paypal.pds.core.PDSIndication pDSIndication, boolean z, androidx.compose.ui.semantics.Role role, java.lang.String str, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2 = (i2 & 1) != 0 ? null : mutableInteractionSource;
        com.paypal.pds.core.PDSIndication.Base base = (i2 & 2) != 0 ? com.paypal.pds.core.PDSIndication.Base.INSTANCE : pDSIndication;
        boolean z2 = (i2 & 4) != 0 ? true : z;
        androidx.compose.ui.semantics.Role role2 = (i2 & 8) != 0 ? null : role;
        java.lang.String str2 = (i2 & 16) != 0 ? null : str;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1509282406, i, -1, "com.paypal.pds.core.clickable (ModifierExtensions.kt:119)");
        }
        androidx.compose.ui.Modifier m21550clickableWithAnalyticssF6913U = com.paypal.pds.analytics.ModifierExtensionsKt.m21550clickableWithAnalyticssF6913U(modifier, mutableInteractionSource2, base, z2, role2, str2, function0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return m21550clickableWithAnalyticssF6913U;
    }

    /* renamed from: optClickable-cJG_KMw, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m22101optClickablecJG_KMw(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, com.paypal.pds.core.PDSIndication pDSIndication, androidx.compose.ui.semantics.Role role, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, int i, int i2) {
        androidx.compose.ui.Modifier.Companion companion;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2 = (i2 & 1) != 0 ? null : mutableInteractionSource;
        com.paypal.pds.core.PDSIndication.Base base = (i2 & 2) != 0 ? com.paypal.pds.core.PDSIndication.Base.INSTANCE : pDSIndication;
        androidx.compose.ui.semantics.Role role2 = (i2 & 4) != 0 ? null : role;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-617425338, i, -1, "com.paypal.pds.core.optClickable (ModifierExtensions.kt:154)");
        }
        if (function0 != null) {
            composer.startReplaceGroup(1626920508);
            companion = m22100clickable_mRqjOc(androidx.compose.ui.Modifier.INSTANCE, mutableInteractionSource2, base, false, role2, null, function0, composer, (i & 112) | 6 | (i & 896) | ((i << 3) & 57344) | ((i << 6) & 3670016), 20);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1627080716);
            composer.endReplaceGroup();
            companion = androidx.compose.ui.Modifier.INSTANCE;
        }
        androidx.compose.ui.Modifier then = modifier.then(companion);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return then;
    }

    /* renamed from: toggleable-XVZzFYc, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m22104toggleableXVZzFYc(androidx.compose.ui.Modifier modifier, boolean z, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, com.paypal.pds.core.PDSIndication pDSIndication, boolean z2, androidx.compose.ui.semantics.Role role, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2 = (i2 & 2) != 0 ? null : mutableInteractionSource;
        com.paypal.pds.core.PDSIndication.Base base = (i2 & 4) != 0 ? com.paypal.pds.core.PDSIndication.Base.INSTANCE : pDSIndication;
        boolean z3 = (i2 & 8) != 0 ? true : z2;
        androidx.compose.ui.semantics.Role role2 = (i2 & 16) != 0 ? null : role;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-88026106, i, -1, "com.paypal.pds.core.toggleable (ModifierExtensions.kt:194)");
        }
        androidx.compose.ui.Modifier m21553toggleableWithAnalyticsO2vRcR0 = com.paypal.pds.analytics.ModifierExtensionsKt.m21553toggleableWithAnalyticsO2vRcR0(modifier, z, mutableInteractionSource2, base, z3, role2, function1);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return m21553toggleableWithAnalyticsO2vRcR0;
    }

    /* renamed from: selectable-XVZzFYc, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m22102selectableXVZzFYc(androidx.compose.ui.Modifier modifier, boolean z, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, com.paypal.pds.core.PDSIndication pDSIndication, boolean z2, androidx.compose.ui.semantics.Role role, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2 = (i2 & 2) != 0 ? null : mutableInteractionSource;
        com.paypal.pds.core.PDSIndication.Base base = (i2 & 4) != 0 ? com.paypal.pds.core.PDSIndication.Base.INSTANCE : pDSIndication;
        boolean z3 = (i2 & 8) != 0 ? true : z2;
        androidx.compose.ui.semantics.Role role2 = (i2 & 16) != 0 ? null : role;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(130109229, i, -1, "com.paypal.pds.core.selectable (ModifierExtensions.kt:232)");
        }
        androidx.compose.ui.Modifier m21552selectableWithAnalyticsO2vRcR0 = com.paypal.pds.analytics.ModifierExtensionsKt.m21552selectableWithAnalyticsO2vRcR0(modifier, z, mutableInteractionSource2, base, z3, role2, function0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return m21552selectableWithAnalyticsO2vRcR0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0067, code lost:
    
        if (r22.changed(r17) != false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e2  */
    /* renamed from: shadow-Q2ewo60, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final androidx.compose.ui.Modifier m22103shadowQ2ewo60(androidx.compose.ui.Modifier modifier, final float f, com.paypal.pds.core.Color color, float f2, float f3, androidx.compose.ui.graphics.Shape shape, androidx.compose.runtime.Composer composer, int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean changed;
        boolean z4;
        java.lang.Object rememberedValue;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        com.paypal.pds.core.Color.ShadowBase shadowBase = (i2 & 2) != 0 ? com.paypal.pds.core.Color.ShadowBase.INSTANCE : color;
        final float m8601constructorimpl = (i2 & 4) != 0 ? androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f) : f2;
        final float m8601constructorimpl2 = (i2 & 8) != 0 ? androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f) : f3;
        final androidx.compose.ui.graphics.Shape circleShape = (i2 & 16) != 0 ? androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape() : shape;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-668941707, i, -1, "com.paypal.pds.core.shadow (ModifierExtensions.kt:263)");
        }
        final int m6049toArgb8_81llA = androidx.compose.ui.graphics.ColorKt.m6049toArgb8_81llA(shadowBase.getValue(composer, (i >> 6) & 14));
        if (((i & 112) ^ 48) <= 32) {
        }
        if ((i & 48) != 32) {
            z = false;
            z2 = (((i & 7168) ^ 3072) <= 2048 && composer.changed(m8601constructorimpl)) || (i & 3072) == 2048;
            z3 = (((57344 & i) ^ 24576) <= 16384 && composer.changed(m8601constructorimpl2)) || (i & 24576) == 16384;
            changed = composer.changed(m6049toArgb8_81llA);
            z4 = (((458752 & i) ^ androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072 && composer.changed(circleShape)) || (i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072;
            rememberedValue = composer.rememberedValue();
            if (!(z | z2 | z3 | changed | z4) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.core.ModifierExtensionsKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.pds.core.ModifierExtensionsKt.$r8$lambda$xeFYlapdzH45BfkQrTah95BkytA(androidx.compose.ui.graphics.Shape.this, f, m8601constructorimpl, m8601constructorimpl2, m6049toArgb8_81llA, (androidx.compose.ui.graphics.drawscope.DrawScope) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.Modifier drawBehind = androidx.compose.ui.draw.DrawModifierKt.drawBehind(modifier, (kotlin.jvm.functions.Function1) rememberedValue);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            return drawBehind;
        }
        z = true;
        if (((i & 7168) ^ 3072) <= 2048) {
        }
        if (((57344 & i) ^ 24576) <= 16384) {
        }
        changed = composer.changed(m6049toArgb8_81llA);
        if (((458752 & i) ^ androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072) {
        }
        rememberedValue = composer.rememberedValue();
        if (!(z | z2 | z3 | changed | z4)) {
        }
        rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.core.ModifierExtensionsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.pds.core.ModifierExtensionsKt.$r8$lambda$xeFYlapdzH45BfkQrTah95BkytA(androidx.compose.ui.graphics.Shape.this, f, m8601constructorimpl, m8601constructorimpl2, m6049toArgb8_81llA, (androidx.compose.ui.graphics.drawscope.DrawScope) obj);
            }
        };
        composer.updateRememberedValue(rememberedValue);
        androidx.compose.ui.Modifier drawBehind2 = androidx.compose.ui.draw.DrawModifierKt.drawBehind(modifier, (kotlin.jvm.functions.Function1) rememberedValue);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        return drawBehind2;
    }

    public static final androidx.compose.ui.Modifier elevationLevel1(androidx.compose.ui.Modifier modifier, androidx.compose.ui.graphics.Shape shape, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shape, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-416907432, i, -1, "com.paypal.pds.core.elevationLevel1 (ModifierExtensions.kt:289)");
        }
        composer.startReplaceGroup(-1216081398);
        com.paypal.pds.tokens.PDSTokens localTokens = com.paypal.pds.core.ThemeKt.localTokens(composer, 0);
        int i2 = (i << 12) & 458752;
        androidx.compose.ui.Modifier m22103shadowQ2ewo60 = m22103shadowQ2ewo60(m22103shadowQ2ewo60(modifier, localTokens.mo22258getEffectElevationLevel11BlurD9Ej5fM(), com.paypal.pds.core.Color.ShadowBase.INSTANCE, localTokens.mo22259getEffectElevationLevel11OffsetXD9Ej5fM(), localTokens.mo22260getEffectElevationLevel11OffsetYD9Ej5fM(), shape, composer, (i & 14) | 384 | i2, 0), localTokens.mo22262getEffectElevationLevel12BlurD9Ej5fM(), com.paypal.pds.core.Color.ShadowBase.INSTANCE, localTokens.mo22263getEffectElevationLevel12OffsetXD9Ej5fM(), localTokens.mo22264getEffectElevationLevel12OffsetYD9Ej5fM(), shape, composer, i2 | 384, 0);
        composer.endReplaceGroup();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return m22103shadowQ2ewo60;
    }

    public static final androidx.compose.ui.Modifier elevationLevel2(androidx.compose.ui.Modifier modifier, androidx.compose.ui.graphics.Shape shape, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shape, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1024984295, i, -1, "com.paypal.pds.core.elevationLevel2 (ModifierExtensions.kt:318)");
        }
        composer.startReplaceGroup(-1462394245);
        com.paypal.pds.tokens.PDSTokens localTokens = com.paypal.pds.core.ThemeKt.localTokens(composer, 0);
        int i2 = (i << 12) & 458752;
        int i3 = i2 | 384;
        androidx.compose.ui.Modifier m22103shadowQ2ewo60 = m22103shadowQ2ewo60(m22103shadowQ2ewo60(m22103shadowQ2ewo60(modifier, localTokens.mo22266getEffectElevationLevel21BlurD9Ej5fM(), com.paypal.pds.core.Color.ShadowBase.INSTANCE, localTokens.mo22267getEffectElevationLevel21OffsetXD9Ej5fM(), localTokens.mo22268getEffectElevationLevel21OffsetYD9Ej5fM(), shape, composer, (i & 14) | 384 | i2, 0), localTokens.mo22270getEffectElevationLevel22BlurD9Ej5fM(), com.paypal.pds.core.Color.ShadowBase.INSTANCE, localTokens.mo22271getEffectElevationLevel22OffsetXD9Ej5fM(), localTokens.mo22272getEffectElevationLevel22OffsetYD9Ej5fM(), shape, composer, i3, 0), localTokens.mo22274getEffectElevationLevel23BlurD9Ej5fM(), com.paypal.pds.core.Color.ShadowEmphasis.INSTANCE, localTokens.mo22275getEffectElevationLevel23OffsetXD9Ej5fM(), localTokens.mo22276getEffectElevationLevel23OffsetYD9Ej5fM(), shape, composer, i3, 0);
        composer.endReplaceGroup();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return m22103shadowQ2ewo60;
    }

    public static final androidx.compose.ui.Modifier elevationLevel3(androidx.compose.ui.Modifier modifier, androidx.compose.ui.graphics.Shape shape, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shape, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1633061158, i, -1, "com.paypal.pds.core.elevationLevel3 (ModifierExtensions.kt:354)");
        }
        composer.startReplaceGroup(-1708707332);
        com.paypal.pds.tokens.PDSTokens localTokens = com.paypal.pds.core.ThemeKt.localTokens(composer, 0);
        int i2 = (i << 12) & 458752;
        int i3 = i2 | 384;
        androidx.compose.ui.Modifier m22103shadowQ2ewo60 = m22103shadowQ2ewo60(m22103shadowQ2ewo60(m22103shadowQ2ewo60(modifier, localTokens.mo22278getEffectElevationLevel31BlurD9Ej5fM(), com.paypal.pds.core.Color.ShadowBase.INSTANCE, localTokens.mo22279getEffectElevationLevel31OffsetXD9Ej5fM(), localTokens.mo22280getEffectElevationLevel31OffsetYD9Ej5fM(), shape, composer, (i & 14) | 384 | i2, 0), localTokens.mo22282getEffectElevationLevel32BlurD9Ej5fM(), com.paypal.pds.core.Color.ShadowBase.INSTANCE, localTokens.mo22283getEffectElevationLevel32OffsetXD9Ej5fM(), localTokens.mo22284getEffectElevationLevel32OffsetYD9Ej5fM(), shape, composer, i3, 0), localTokens.mo22286getEffectElevationLevel33BlurD9Ej5fM(), com.paypal.pds.core.Color.ShadowEmphasis.INSTANCE, localTokens.mo22287getEffectElevationLevel33OffsetXD9Ej5fM(), localTokens.mo22288getEffectElevationLevel33OffsetYD9Ej5fM(), shape, composer, i3, 0);
        composer.endReplaceGroup();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return m22103shadowQ2ewo60;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xeFYlapdzH45BfkQrTah95BkytA(androidx.compose.ui.graphics.Shape shape, float f, float f2, float f3, int i, androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawScope, "");
        android.graphics.Paint getHighSpeedVideoFpsRangesFor = androidx.compose.ui.graphics.AndroidPaint_androidKt.Paint().getGetHighSpeedVideoFpsRangesFor();
        getHighSpeedVideoFpsRangesFor.setColor(0);
        getHighSpeedVideoFpsRangesFor.setShadowLayer(drawScope.mo1418toPx0680j_4(f), drawScope.mo1418toPx0680j_4(f2), drawScope.mo1418toPx0680j_4(f3), i);
        androidx.compose.ui.graphics.Paint asComposePaint = androidx.compose.ui.graphics.AndroidPaint_androidKt.asComposePaint(getHighSpeedVideoFpsRangesFor);
        androidx.compose.ui.graphics.OutlineKt.drawOutline(drawScope.getDrawContext().getCanvas(), shape.mo1334createOutlinePq9zytI(drawScope.mo6531getSizeNHjbRc(), drawScope.getLayoutDirection(), drawScope), asComposePaint);
        return kotlin.Unit.INSTANCE;
    }
}
