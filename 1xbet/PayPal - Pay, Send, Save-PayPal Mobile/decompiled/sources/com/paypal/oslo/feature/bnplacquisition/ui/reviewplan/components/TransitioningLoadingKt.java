package com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0001¢\u0006\u0002\u0010\t\u001a1\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0003¢\u0006\u0002\u0010\t\u001a\r\u0010\u000b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"TransitioningLoading", "", "progress", "", "maxValue", "transitioningLoadingContent", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/components/TransitioningLoadingContent;", "backgroundPainter", "Landroidx/compose/ui/graphics/painter/Painter;", "(FFLcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/components/TransitioningLoadingContent;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/runtime/Composer;II)V", "TransitioningLoadingLayout", "TransitioningLoadingPreview", "(Landroidx/compose/runtime/Composer;I)V", "bnpl-acquisition_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TransitioningLoadingKt {
    public static final void TransitioningLoading(final float f, final float f2, final com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components.TransitioningLoadingContent transitioningLoadingContent, androidx.compose.ui.graphics.painter.Painter painter, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transitioningLoadingContent, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1313780546);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(f2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(transitioningLoadingContent) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? startRestartGroup.changed(painter) : startRestartGroup.changedInstance(painter) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                painter = null;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1313780546, i3, -1, "com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components.TransitioningLoading (TransitioningLoading.kt:64)");
            }
            getHighSpeedVideoFpsRangesFor(f, f2, transitioningLoadingContent, painter, startRestartGroup, (androidx.compose.ui.graphics.painter.Painter.$stable << 9) | (i3 & org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO) | (i3 & 7168), 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final androidx.compose.ui.graphics.painter.Painter painter2 = painter;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components.TransitioningLoadingKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components.TransitioningLoadingKt.m12466$r8$lambda$srRIgjXeNPFJKhlU6HkweqRtcs(f, f2, transitioningLoadingContent, painter2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRangesFor(final float f, final float f2, final com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components.TransitioningLoadingContent transitioningLoadingContent, androidx.compose.ui.graphics.painter.Painter painter, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.graphics.painter.Painter painter2;
        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance;
        int i4;
        int i5;
        androidx.compose.ui.graphics.painter.Painter painter3;
        java.lang.Object obj;
        androidx.compose.ui.graphics.painter.Painter painter4 = painter;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1103900040);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(f2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(transitioningLoadingContent) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? startRestartGroup.changed(painter4) : startRestartGroup.changedInstance(painter4) ? 2048 : 1024;
        }
        int i7 = i3;
        if (!startRestartGroup.shouldExecute((i7 & 1171) != 1170, i7 & 1)) {
            startRestartGroup.skipToGroupEnd();
            painter2 = painter4;
        } else {
            if (i6 != 0) {
                painter4 = null;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1103900040, i7, -1, "com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components.TransitioningLoadingLayout (TransitioningLoading.kt:95)");
            }
            androidx.compose.ui.Modifier windowInsetsPadding = androidx.compose.foundation.layout.WindowInsetsPaddingKt.windowInsetsPadding(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), androidx.compose.foundation.layout.WindowInsetsKt.WindowInsets(0, 0, 0, 0));
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, windowInsetsPadding);
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
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            if (painter4 == null) {
                startRestartGroup.startReplaceGroup(69115969);
                startRestartGroup.endReplaceGroup();
                painter3 = painter4;
                boxScopeInstance = boxScopeInstance2;
                i4 = 1;
                i5 = i7;
                obj = null;
            } else {
                startRestartGroup.startReplaceGroup(69115970);
                androidx.compose.ui.graphics.painter.Painter painter5 = painter4;
                boxScopeInstance = boxScopeInstance2;
                i4 = 1;
                i5 = i7;
                painter3 = painter4;
                obj = null;
                androidx.compose.foundation.ImageKt.Image(painter5, (java.lang.String) null, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), "backgroundImage"), (androidx.compose.ui.Alignment) null, androidx.compose.ui.layout.ContentScale.INSTANCE.getCrop(), 0.0f, (androidx.compose.ui.graphics.ColorFilter) null, startRestartGroup, androidx.compose.ui.graphics.painter.Painter.$stable | 25008, 104);
                startRestartGroup.endReplaceGroup();
            }
            androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i4, obj), com.paypal.pds.core.ConstantsKt.getSize24(), 0.0f, 2, obj);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 54);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1708paddingVpY3zN4$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.paypal.oslo.core.commonui.utils.RefText progressText = transitioningLoadingContent.getProgressText();
            if (progressText != null) {
                startRestartGroup.startReplaceGroup(38042688);
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(com.paypal.oslo.core.commonui.utils.RefTextKt.value(progressText, startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i4, obj), 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSize28(), 7, null), com.paypal.pds.core.Color.BackgroundRoleBaseSpecial.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.DisplaySmall.INSTANCE, startRestartGroup, 384, 6, 1000);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(38042687);
                startRestartGroup.endReplaceGroup();
            }
            com.paypal.pds.components.ProgressBarKt.ProgressBar(f2, f, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i4, obj), new com.paypal.pds.components.ProgressBarStyle.Custom(com.paypal.pds.core.Color.BorderBase.INSTANCE, com.paypal.pds.core.Color.BackgroundRoleBaseSpecial.INSTANCE), 0, 0, 0L, null, startRestartGroup, ((i5 >> 3) & 14) | 384 | ((i5 << 3) & 112), com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
            startRestartGroup.endNode();
            com.paypal.oslo.core.commonui.utils.RefText footerText = transitioningLoadingContent.getFooterText();
            if (footerText != null) {
                startRestartGroup.startReplaceGroup(70526222);
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(com.paypal.oslo.core.commonui.utils.RefTextKt.value(footerText, startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(boxScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getBottomCenter()), 0.0f, i4, obj), 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSize80(), 7, null), com.paypal.pds.core.Color.BackgroundRoleBaseSpecial.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, startRestartGroup, 384, 6, 1000);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(70526221);
                startRestartGroup.endReplaceGroup();
            }
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            painter2 = painter3;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components.TransitioningLoadingKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components.TransitioningLoadingKt.$r8$lambda$x2tu0oAbetcRE40k9XvdhADrITY(f, f2, transitioningLoadingContent, painter2, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2AYaezWpWaiI60T69JhXJGDGWQw(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2110320413);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2110320413, updateChangedFlags, -1, "com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components.TransitioningLoadingPreview (TransitioningLoading.kt:174)");
            }
            com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanContentProvider reviewPlanContentProvider = new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanContentProvider();
            getHighSpeedVideoFpsRangesFor(60.0f, 100.0f, new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components.TransitioningLoadingContent(reviewPlanContentProvider.getTransitioningLoadingProgressText(), reviewPlanContentProvider.getTransitioningLoadingFooterText()), null, startRestartGroup, 54, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components.TransitioningLoadingKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components.TransitioningLoadingKt.$r8$lambda$2AYaezWpWaiI60T69JhXJGDGWQw(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$srRIgjXeNPFJKh-lU6HkweqRtcs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12466$r8$lambda$srRIgjXeNPFJKhlU6HkweqRtcs(float f, float f2, com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components.TransitioningLoadingContent transitioningLoadingContent, androidx.compose.ui.graphics.painter.Painter painter, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        TransitioningLoading(f, f2, transitioningLoadingContent, painter, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$x2tu0oAbetcRE40k9XvdhADrITY(float f, float f2, com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components.TransitioningLoadingContent transitioningLoadingContent, androidx.compose.ui.graphics.painter.Painter painter, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoFpsRangesFor(f, f2, transitioningLoadingContent, painter, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
