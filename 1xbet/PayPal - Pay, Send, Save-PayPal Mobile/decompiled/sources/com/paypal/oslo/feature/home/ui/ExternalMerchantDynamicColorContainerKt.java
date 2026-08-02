package com.paypal.oslo.feature.home.ui;

@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aI\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\n¢\u0006\u0002\b\u000bH\u0001¢\u0006\u0002\u0010\f\u001a\u001e\u0010\r\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0002\u001a\u0011\u0010\u000e\u001a\u00020\u000f*\u00020\u0003H\u0002¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"ExternalMerchantDynamicColorContainer", "", "backgroundColor", "", "modifier", "Landroidx/compose/ui/Modifier;", "gradientColor", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "merchantBackground", "hexToFoundationColor", "Landroidx/compose/ui/graphics/Color;", "(Ljava/lang/String;)J", "home_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ExternalMerchantDynamicColorContainerKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ExternalMerchantDynamicColorContainer(final java.lang.String str, androidx.compose.ui.Modifier modifier, java.lang.String str2, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.BoxScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        java.lang.String str3;
        androidx.compose.ui.Modifier.Companion companion;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier testTag;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function3, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-259635961);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                str3 = str2;
                i3 |= startRestartGroup.changed(str3) ? 256 : 128;
                if ((i & 3072) == 0) {
                    i3 |= startRestartGroup.changedInstance(function3) ? 2048 : 1024;
                }
                if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    companion = modifier2;
                } else {
                    companion = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if (i4 != 0) {
                        str3 = null;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-259635961, i3, -1, "com.paypal.oslo.feature.home.ui.ExternalMerchantDynamicColorContainer (ExternalMerchantDynamicColorContainer.kt:57)");
                    }
                    if (str3 == null) {
                        testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.BackgroundKt.m1285backgroundbw27NRU(androidx.compose.ui.Modifier.INSTANCE, getHighSpeedVideoFpsRangesFor(str), androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(com.paypal.pds.core.ConstantsKt.getSize24())), "Solid background ".concat(java.lang.String.valueOf(str)));
                    } else {
                        androidx.compose.ui.Modifier background$default = androidx.compose.foundation.BackgroundKt.background$default(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.graphics.Brush.Companion.m5951verticalGradient8A3gB4$default(androidx.compose.ui.graphics.Brush.INSTANCE, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new androidx.compose.ui.graphics.Color[]{androidx.compose.ui.graphics.Color.m5986boximpl(getHighSpeedVideoFpsRangesFor(str)), androidx.compose.ui.graphics.Color.m5986boximpl(getHighSpeedVideoFpsRangesFor(str3))}), 0.0f, 0.0f, 0, 14, (java.lang.Object) null), androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(com.paypal.pds.core.ConstantsKt.getSize24()), 0.0f, 4, null);
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Gradient with ");
                        sb.append(str);
                        sb.append(" and ");
                        sb.append(str3);
                        testTag = androidx.compose.ui.platform.TestTagKt.testTag(background$default, sb.toString());
                    }
                    androidx.compose.ui.Modifier then = companion.then(testTag);
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, then);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor);
                    } else {
                        startRestartGroup.useNode();
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    function3.invoke(androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE, startRestartGroup, java.lang.Integer.valueOf((((i3 & 7168) >> 6) & 112) | 6));
                    startRestartGroup.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                }
                final java.lang.String str4 = str3;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier3 = companion;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.home.ui.ExternalMerchantDynamicColorContainerKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.home.ui.ExternalMerchantDynamicColorContainerKt.$r8$lambda$JJe8lC3U7hyWpo2qIO9Nk5uxo2M(str, modifier3, str4, function3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            str3 = str2;
            if ((i & 3072) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            }
            final java.lang.String str42 = str3;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        str3 = str2;
        if ((i & 3072) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
        }
        final java.lang.String str422 = str3;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final long getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        try {
            return androidx.compose.ui.graphics.AndroidColor_androidKt.fromColorLong(androidx.compose.ui.graphics.Color.INSTANCE, android.graphics.Color.pack(android.graphics.Color.parseColor(str)));
        } catch (java.lang.IllegalArgumentException e) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.home.LoggerKt.log, "Invalid hex color, returning transparent", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, str), kotlin.TuplesKt.to("error", e.getMessage())), null, 4, null);
            return androidx.compose.ui.graphics.Color.INSTANCE.m6031getTransparent0d7_KjU();
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JJe8lC3U7hyWpo2qIO9Nk5uxo2M(java.lang.String str, androidx.compose.ui.Modifier modifier, java.lang.String str2, kotlin.jvm.functions.Function3 function3, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ExternalMerchantDynamicColorContainer(str, modifier, str2, function3, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
