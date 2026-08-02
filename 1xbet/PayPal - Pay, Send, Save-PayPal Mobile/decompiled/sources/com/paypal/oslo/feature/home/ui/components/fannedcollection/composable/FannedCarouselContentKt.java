package com.paypal.oslo.feature.home.ui.components.fannedcollection.composable;

@kotlin.Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001a5\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\t2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0003¢\u0006\u0002\u0010\u0011\u001a\f\u0010\u0012\u001a\u00020\u0001*\u00020\u0013H\u0000\u001a\u0011\u0010\u0014\u001a\u00020\t*\u00020\tH\u0003¢\u0006\u0002\u0010\u0015\u001a'\u0010\u0016\u001a\u00020\t*\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0003¢\u0006\u0002\u0010\u0019\u001a\r\u0010\u001a\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001b\u001a\r\u0010\u001c\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001b¨\u0006\u001d²\u0006\n\u0010\u001e\u001a\u00020\u001fX\u008a\u0084\u0002"}, d2 = {"FannedCarouselContent", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/feature/home/domain/model/FannedCarouselItemData;", com.daon.sdk.face.license.License.FEATURE_POSITION, "Lcom/paypal/oslo/feature/home/ui/components/fannedcollection/FannedCarouselPosition;", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/home/domain/model/FannedCarouselItemData;Lcom/paypal/oslo/feature/home/ui/components/fannedcollection/FannedCarouselPosition;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "FannedCarouselContentContainer", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "drawFannedCarouselBackground", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "fannedCarouselBorder", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "conditionalClickable", "condition", "", "(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "CarouselContentMiddlePositionPreview", "(Landroidx/compose/runtime/Composer;I)V", "CarouselContentNotMiddlePositionPreview", "home_prodRelease", "footerAlpha", ""}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FannedCarouselContentKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FannedCarouselContent(final com.paypal.oslo.feature.home.domain.model.FannedCarouselItemData fannedCarouselItemData, final com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition fannedCarouselPosition, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier modifier4;
        final androidx.compose.runtime.State<java.lang.Float> state;
        androidx.compose.ui.Modifier modifier5;
        androidx.compose.ui.Modifier.Companion companion;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fannedCarouselItemData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fannedCarouselPosition, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1616412026);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(fannedCarouselItemData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(fannedCarouselPosition) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier6 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1616412026, i4, -1, "com.paypal.oslo.feature.home.ui.components.fannedcollection.composable.FannedCarouselContent (FannedCarouselContent.kt:62)");
                }
                boolean z = fannedCarouselPosition instanceof com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition.Middle;
                androidx.compose.ui.Modifier modifier7 = modifier6;
                androidx.compose.runtime.State<java.lang.Float> animateFloatAsState = androidx.compose.animation.core.AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, com.paypal.oslo.feature.home.ui.components.fannedcollection.UtilsKt.fannedCarouselAnimationSpec$default(null, 1, null), 0.0f, null, null, startRestartGroup, 0, 28);
                androidx.compose.ui.Modifier item = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(com.paypal.oslo.feature.home.ui.TileInstrumentationModifierKt.instrument(modifier7, fannedCarouselItemData.getInstrumentation(), startRestartGroup, ((i4 >> 9) & 14) | (com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext.$stable << 3)), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("store_tile", 0, 2, null));
                int i6 = i4 & 896;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(52523522, i6, -1, "com.paypal.oslo.feature.home.ui.components.fannedcollection.composable.conditionalClickable (FannedCarouselContent.kt:152)");
                }
                if (z) {
                    startRestartGroup.startReplaceGroup(1360290915);
                    modifier4 = item;
                    state = animateFloatAsState;
                    modifier5 = modifier7;
                    companion = com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(androidx.compose.ui.Modifier.INSTANCE, null, null, false, null, null, function0, startRestartGroup, ((i6 << 12) & 3670016) | 6, 31);
                    startRestartGroup.endReplaceGroup();
                } else {
                    modifier4 = item;
                    state = animateFloatAsState;
                    modifier5 = modifier7;
                    startRestartGroup.startReplaceGroup(1360356480);
                    startRestartGroup.endReplaceGroup();
                    companion = androidx.compose.ui.Modifier.INSTANCE;
                }
                androidx.compose.ui.Modifier then = modifier4.then(companion);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                getHighSpeedVideoFpsRanges(then, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(350607411, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.home.ui.components.fannedcollection.composable.FannedCarouselContentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function3
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.home.ui.components.fannedcollection.composable.FannedCarouselContentKt.m14964$r8$lambda$FpzlmC9ppP8fLhDq6XnVwI18s8(com.paypal.oslo.feature.home.domain.model.FannedCarouselItemData.this, state, (androidx.compose.foundation.layout.BoxScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, 48, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.home.ui.components.fannedcollection.composable.FannedCarouselContentKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.home.ui.components.fannedcollection.composable.FannedCarouselContentKt.$r8$lambda$Mach6enmxfzQ51dDqjSB97FQgGs(com.paypal.oslo.feature.home.domain.model.FannedCarouselItemData.this, fannedCarouselPosition, function0, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final void getHighSpeedVideoFpsRanges(final androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.BoxScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-713422669);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function3) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-713422669, i3, -1, "com.paypal.oslo.feature.home.ui.components.fannedcollection.composable.FannedCarouselContentContainer (FannedCarouselContent.kt:117)");
            }
            androidx.compose.ui.Modifier highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null), startRestartGroup);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.home.ui.components.fannedcollection.composable.FannedCarouselContentKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.home.ui.components.fannedcollection.composable.FannedCarouselContentKt.$r8$lambda$vQce6iqjqdsMmJXU_u589hXWIeY((androidx.compose.ui.graphics.drawscope.DrawScope) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.Modifier drawBehind = androidx.compose.ui.draw.DrawModifierKt.drawBehind(highSpeedVideoFpsRanges, (kotlin.jvm.functions.Function1) rememberedValue);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, drawBehind);
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
            function3.invoke(androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE, startRestartGroup, java.lang.Integer.valueOf(((((i3 << 6) & 7168) >> 6) & 112) | 6));
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.home.ui.components.fannedcollection.composable.FannedCarouselContentKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.home.ui.components.fannedcollection.composable.FannedCarouselContentKt.$r8$lambda$nZwT04b5heOd7HzlHpMRooFwOpM(androidx.compose.ui.Modifier.this, function3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void drawFannedCarouselBackground(androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawScope, "");
        long Color = androidx.compose.ui.graphics.ColorKt.Color(com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselConstants.Colors.ITEM_BACKGROUND);
        float f = drawScope.mo1418toPx0680j_4(com.paypal.pds.core.ConstantsKt.getSize24());
        androidx.compose.ui.graphics.drawscope.DrawScope.m6528drawRoundRectuAw5IA$default(drawScope, Color, 0L, 0L, androidx.compose.ui.geometry.CornerRadius.m5706constructorimpl((java.lang.Float.floatToRawIntBits(f) << 32) | (java.lang.Float.floatToRawIntBits(f) & 4294967295L)), null, 0.0f, null, 0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, null);
    }

    private static final androidx.compose.ui.Modifier getHighSpeedVideoFpsRanges(androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1001877654, 0, -1, "com.paypal.oslo.feature.home.ui.components.fannedcollection.composable.fannedCarouselBorder (FannedCarouselContent.kt:138)");
        }
        androidx.compose.ui.Modifier then = modifier.then(com.paypal.pds.core.ModifierExtensionsKt.m22099borderDzVHIIc(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(0.5f), com.paypal.pds.core.Color.BorderMuted.INSTANCE, androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(com.paypal.pds.core.ConstantsKt.getSize24()), composer, 438, 0));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return then;
    }

    /* renamed from: $r8$lambda$FpzlmC9ppP8fLhDq6XnVwI18-s8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14964$r8$lambda$FpzlmC9ppP8fLhDq6XnVwI18s8(com.paypal.oslo.feature.home.domain.model.FannedCarouselItemData fannedCarouselItemData, androidx.compose.runtime.State state, androidx.compose.foundation.layout.BoxScope boxScope, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(boxScope, "");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(boxScope) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(350607411, i2, -1, "com.paypal.oslo.feature.home.ui.components.fannedcollection.composable.FannedCarouselContent.<anonymous> (FannedCarouselContent.kt:80)");
            }
            com.paypal.pds.components.ImageKt.Image(com.paypal.oslo.core.commonui.components.AsyncImageKt.rememberAsyncImagePainter(fannedCarouselItemData.getImageUrl(), null, null, null, null, composer, 0, 30), "", androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(boxScope.align(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselConstants.TestTags.ITEM_IMAGE), androidx.compose.ui.Alignment.INSTANCE.getTopCenter()), 0.0f, com.paypal.pds.core.ConstantsKt.getSize16(), 0.0f, 0.0f, 13, null), androidx.compose.ui.unit.Dp.m8601constructorimpl(140.0f)), androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape()), null, null, null, null, composer, 48, 120);
            androidx.compose.ui.Modifier alpha = androidx.compose.ui.draw.AlphaKt.alpha(boxScope.align(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize16(), 0.0f, com.paypal.pds.core.ConstantsKt.getSize16(), com.paypal.pds.core.ConstantsKt.getSize16(), 2, null), androidx.compose.ui.Alignment.INSTANCE.getBottomStart()), ((java.lang.Number) state.getValue()).floatValue());
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, alpha);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(fannedCarouselItemData.getTitle(), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.LabelLarge.INSTANCE, composer, 384, 6, 1018);
            if (fannedCarouselItemData.getSubtitle() != null) {
                composer.startReplaceGroup(-1925724888);
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(fannedCarouselItemData.getSubtitle(), androidx.compose.ui.draw.AlphaKt.alpha(androidx.compose.ui.Modifier.INSTANCE, 0.7f), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer, 432, 6, 1016);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1925448647);
                composer.endReplaceGroup();
            }
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Mach6enmxfzQ51dDqjSB97FQgGs(com.paypal.oslo.feature.home.domain.model.FannedCarouselItemData fannedCarouselItemData, com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition fannedCarouselPosition, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        FannedCarouselContent(fannedCarouselItemData, fannedCarouselPosition, function0, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$nZwT04b5heOd7HzlHpMRooFwOpM(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function3 function3, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoFpsRanges(modifier, function3, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$usJPpJRwDySOV0lCT5uJLBJx1Sk(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1084423414);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1084423414, updateChangedFlags, -1, "com.paypal.oslo.feature.home.ui.components.fannedcollection.composable.CarouselContentNotMiddlePositionPreview (FannedCarouselContent.kt:182)");
            }
            com.paypal.oslo.feature.home.ui.preview.HomePreviewKt.HomePreview(com.paypal.oslo.feature.home.ui.components.fannedcollection.composable.ComposableSingletons$FannedCarouselContentKt.INSTANCE.getLambda$1797911436$home_prodRelease(), startRestartGroup, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.home.ui.components.fannedcollection.composable.FannedCarouselContentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.home.ui.components.fannedcollection.composable.FannedCarouselContentKt.$r8$lambda$usJPpJRwDySOV0lCT5uJLBJx1Sk(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vQce6iqjqdsMmJXU_u589hXWIeY(androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawScope, "");
        drawFannedCarouselBackground(drawScope);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$yq20PHTQHJ8Wcp6msurGiNVST2o(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-671128627);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-671128627, updateChangedFlags, -1, "com.paypal.oslo.feature.home.ui.components.fannedcollection.composable.CarouselContentMiddlePositionPreview (FannedCarouselContent.kt:165)");
            }
            com.paypal.oslo.feature.home.ui.preview.HomePreviewKt.HomePreview(com.paypal.oslo.feature.home.ui.components.fannedcollection.composable.ComposableSingletons$FannedCarouselContentKt.INSTANCE.getLambda$140645003$home_prodRelease(), startRestartGroup, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.home.ui.components.fannedcollection.composable.FannedCarouselContentKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.home.ui.components.fannedcollection.composable.FannedCarouselContentKt.$r8$lambda$yq20PHTQHJ8Wcp6msurGiNVST2o(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
