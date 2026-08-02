package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a>\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u000b\u001a:\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\r\u001a%\u0010\u000e\u001a\u00020\u0003*\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u000f\u001aA\u0010\u0010\u001a\u00020\u0001*\u00020\u00112\u0018\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00140\u00132\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u001aH\u0001¢\u0006\u0002\u0010\u001b\u001a\u0013\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\u001aH\u0003¢\u0006\u0002\u0010\u001d\u001a\r\u0010\u001e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001f\u001a\r\u0010 \u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001f\u001a\r\u0010!\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001f\u001a\r\u0010\"\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001f\u001a\r\u0010#\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001f¨\u0006$"}, d2 = {"Shimmer", "", "modifier", "Landroidx/compose/ui/Modifier;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "Lcom/paypal/pds/components/ShimmerStyle;", "enable", "", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/Modifier;Lcom/paypal/pds/components/ShimmerStyle;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "startShimmer", "(Lcom/paypal/pds/components/ShimmerStyle;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "shimmer", "(Landroidx/compose/ui/Modifier;ZLcom/paypal/pds/components/ShimmerStyle;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;", "drawShimmerOverlay", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "colorStops", "", "Lkotlin/Pair;", "", "Landroidx/compose/ui/graphics/Color;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "animatedXOffset", "Landroidx/compose/runtime/State;", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;[Lkotlin/Pair;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/runtime/State;)V", "animate", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "ShimmerPreview", "(Landroidx/compose/runtime/Composer;I)V", "ShimmerTextPreview", "ShimmerContainerPreview", "ShimmerRoundedPreview", "ShimmerModifierPreview", "pds_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShimmerKt {
    public static final void Shimmer(androidx.compose.ui.Modifier modifier, com.paypal.pds.components.ShimmerStyle shimmerStyle, boolean z, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1364187965);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(shimmerStyle) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        int i7 = i3;
        if (!startRestartGroup.shouldExecute((i7 & 1171) != 1170, i7 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (i5 != 0) {
                shimmerStyle = com.paypal.pds.components.ShimmerStyle.Container.INSTANCE;
            }
            if (i6 != 0) {
                z = true;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1364187965, i7, -1, "com.paypal.pds.components.Shimmer (Shimmer.kt:82)");
            }
            androidx.compose.ui.Modifier shimmer = shimmer(com.paypal.pds.core.PDSHighlightHostKt.pdsComponent(modifier), z, shimmerStyle, startRestartGroup, ((i7 >> 3) & 112) | ((i7 << 3) & 896), 0);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, shimmer);
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
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            function2.invoke(startRestartGroup, java.lang.Integer.valueOf((i7 >> 9) & 14));
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        final com.paypal.pds.components.ShimmerStyle shimmerStyle2 = shimmerStyle;
        final boolean z2 = z;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.ShimmerKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.ShimmerKt.$r8$lambda$OHdrjyDAEAz5XS3IetscDMqOcF0(androidx.compose.ui.Modifier.this, shimmerStyle2, z2, function2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    @kotlin.Deprecated(message = "Use Shimmer with 'enable' parameter instead", replaceWith = @kotlin.ReplaceWith(expression = "Shimmer(style = style, modifier = modifier, enable = startShimmer, content = content)", imports = {"com.paypal.pds.components.Shimmer"}))
    public static final void Shimmer(final com.paypal.pds.components.ShimmerStyle shimmerStyle, final boolean z, androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shimmerStyle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1630826695);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(shimmerStyle) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1630826695, i3, -1, "com.paypal.pds.components.Shimmer (Shimmer.kt:114)");
            }
            int i5 = i3 << 3;
            Shimmer(modifier, shimmerStyle, z, function2, startRestartGroup, (i5 & 896) | ((i3 >> 6) & 14) | (i5 & 112) | (i3 & 7168), 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.ShimmerKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.ShimmerKt.$r8$lambda$5XL20eCcPcsGG7h_6zUwf8x0xIM(com.paypal.pds.components.ShimmerStyle.this, z, modifier2, function2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final androidx.compose.ui.Modifier shimmer(androidx.compose.ui.Modifier modifier, boolean z, com.paypal.pds.components.ShimmerStyle shimmerStyle, androidx.compose.runtime.Composer composer, int i, int i2) {
        androidx.compose.ui.Modifier modifier2 = modifier;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        boolean z2 = (i2 & 1) != 0 ? true : z;
        com.paypal.pds.components.ShimmerStyle shimmerStyle2 = (i2 & 2) != 0 ? com.paypal.pds.components.ShimmerStyle.Container.INSTANCE : shimmerStyle;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1154580119, i, -1, "com.paypal.pds.components.shimmer (Shimmer.kt:156)");
        }
        if (!z2) {
            composer.startReplaceGroup(1998344127);
        } else {
            composer.startReplaceGroup(1998373515);
            final kotlin.Pair<java.lang.Float, androidx.compose.ui.graphics.Color>[] colorStops = shimmerStyle2.getColorStops(composer, (i >> 6) & 14);
            final androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) composer.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection());
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1736349272, 0, -1, "com.paypal.pds.components.animate (Shimmer.kt:242)");
            }
            final androidx.compose.runtime.State<java.lang.Float> animateFloat = androidx.compose.animation.core.InfiniteTransitionKt.animateFloat(androidx.compose.animation.core.InfiniteTransitionKt.rememberInfiniteTransition("shimmer", composer, 6, 0), -1.0f, 2.0f, androidx.compose.animation.core.AnimationSpecKt.m1184infiniteRepeatable9IiC70o$default(androidx.compose.animation.core.AnimationSpecKt.tween$default(1200, 0, com.paypal.pds.core.MotionEasingKt.easingExpressiveLoop(composer, 0), 2, null), androidx.compose.animation.core.RepeatMode.Restart, 0L, 4, null), "shimmer-translate", composer, androidx.compose.animation.core.InfiniteTransition.$stable | 24960 | (androidx.compose.animation.core.InfiniteRepeatableSpec.$stable << 9), 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            androidx.compose.ui.Modifier clip = androidx.compose.ui.draw.ClipKt.clip(modifier, shimmerStyle2.getShape());
            boolean changedInstance = composer.changedInstance(colorStops);
            boolean changed = composer.changed(layoutDirection.ordinal());
            boolean changed2 = composer.changed(animateFloat);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changedInstance | changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.ShimmerKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.pds.components.ShimmerKt.$r8$lambda$seDVrObmaR4xzUvkE_6xSUbbB44(colorStops, layoutDirection, animateFloat, (androidx.compose.ui.graphics.drawscope.ContentDrawScope) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            modifier2 = androidx.compose.ui.draw.DrawModifierKt.drawWithContent(clip, (kotlin.jvm.functions.Function1) rememberedValue);
        }
        composer.endReplaceGroup();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return modifier2;
    }

    public static final void drawShimmerOverlay(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope, kotlin.Pair<java.lang.Float, androidx.compose.ui.graphics.Color>[] pairArr, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.runtime.State<java.lang.Float> state) {
        kotlin.Pair pair;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentDrawScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutDirection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (contentDrawScope.mo6531getSizeNHjbRc() >> 32)) * 2.0f;
        if (layoutDirection == androidx.compose.ui.unit.LayoutDirection.Ltr) {
            float floatValue = state.getValue().floatValue() * intBitsToFloat;
            pair = kotlin.TuplesKt.to(java.lang.Float.valueOf(floatValue), java.lang.Float.valueOf(floatValue + intBitsToFloat));
        } else {
            float floatValue2 = (1.0f - state.getValue().floatValue()) * intBitsToFloat;
            pair = kotlin.TuplesKt.to(java.lang.Float.valueOf(floatValue2), java.lang.Float.valueOf(floatValue2 - intBitsToFloat));
        }
        float floatValue3 = ((java.lang.Number) pair.component1()).floatValue();
        float floatValue4 = ((java.lang.Number) pair.component2()).floatValue();
        androidx.compose.ui.graphics.drawscope.DrawScope.m6525drawRectAsUm42w$default(contentDrawScope, androidx.compose.ui.graphics.Brush.Companion.m5946linearGradientmHitzGk$default(androidx.compose.ui.graphics.Brush.INSTANCE, (kotlin.Pair[]) java.util.Arrays.copyOf(pairArr, pairArr.length), androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(floatValue3) << 32) | (java.lang.Float.floatToRawIntBits(0.0f) & 4294967295L)), androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(0.0f) & 4294967295L) | (java.lang.Float.floatToRawIntBits(floatValue4) << 32)), 0, 8, (java.lang.Object) null), 0L, contentDrawScope.mo6531getSizeNHjbRc(), 0.0f, null, null, 0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null);
    }

    private static final void Camera2StreamConfigurationMap(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-485683288);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-485683288, i, -1, "com.paypal.pds.components.ShimmerTextPreview (Shimmer.kt:271)");
            }
            Shimmer((androidx.compose.ui.Modifier) null, (com.paypal.pds.components.ShimmerStyle) com.paypal.pds.components.ShimmerStyle.Text.INSTANCE, false, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) com.paypal.pds.components.ComposableSingletons$ShimmerKt.INSTANCE.getLambda$1506728725$pds_release(), startRestartGroup, 3120, 5);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.ShimmerKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.ShimmerKt.$r8$lambda$0uvlwyP9rMZWPxedrKJhpVzs_kw(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoSizes(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-629315046);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-629315046, i, -1, "com.paypal.pds.components.ShimmerContainerPreview (Shimmer.kt:282)");
            }
            Shimmer((androidx.compose.ui.Modifier) null, (com.paypal.pds.components.ShimmerStyle) com.paypal.pds.components.ShimmerStyle.Container.INSTANCE, false, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) com.paypal.pds.components.ComposableSingletons$ShimmerKt.INSTANCE.m21843getLambda$1776108851$pds_release(), startRestartGroup, 3120, 5);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.ShimmerKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.ShimmerKt.$r8$lambda$5DChKlR1ROrZ8vacWuaBYfWYrno(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(367790382);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(367790382, i, -1, "com.paypal.pds.components.ShimmerRoundedPreview (Shimmer.kt:296)");
            }
            Shimmer((androidx.compose.ui.Modifier) null, (com.paypal.pds.components.ShimmerStyle) com.paypal.pds.components.ShimmerStyle.Rounded.INSTANCE, false, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) com.paypal.pds.components.ComposableSingletons$ShimmerKt.INSTANCE.m21842getLambda$133961055$pds_release(), startRestartGroup, 3120, 5);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.ShimmerKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.ShimmerKt.m22032$r8$lambda$WSAaykCuhIDdYJCiUni5czX8XM(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRanges(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2131296574);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2131296574, i, -1, "com.paypal.pds.components.ShimmerModifierPreview (Shimmer.kt:307)");
            }
            androidx.compose.foundation.layout.BoxKt.Box(shimmer(androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), com.paypal.pds.core.ConstantsKt.getSize56()), false, null, startRestartGroup, 6, 3), startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.ShimmerKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.ShimmerKt.$r8$lambda$qCevR0gjTwfaY6GUR749_4BNM2Y(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0uvlwyP9rMZWPxedrKJhpVzs_kw(int i, androidx.compose.runtime.Composer composer, int i2) {
        Camera2StreamConfigurationMap(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5DChKlR1ROrZ8vacWuaBYfWYrno(int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoSizes(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5XL20eCcPcsGG7h_6zUwf8x0xIM(com.paypal.pds.components.ShimmerStyle shimmerStyle, boolean z, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function2 function2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        Shimmer(shimmerStyle, z, modifier, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$OHdrjyDAEAz5XS3IetscDMqOcF0(androidx.compose.ui.Modifier modifier, com.paypal.pds.components.ShimmerStyle shimmerStyle, boolean z, kotlin.jvm.functions.Function2 function2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        Shimmer(modifier, shimmerStyle, z, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$WSAaykCu-hIDdYJCiUni5czX8XM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m22032$r8$lambda$WSAaykCuhIDdYJCiUni5czX8XM(int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighResolutionOutputSizeshNQ4ISI(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qCevR0gjTwfaY6GUR749_4BNM2Y(int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRanges(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$seDVrObmaR4xzUvkE_6xSUbbB44(kotlin.Pair[] pairArr, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.runtime.State state, androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentDrawScope, "");
        drawShimmerOverlay(contentDrawScope, pairArr, layoutDirection, state);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$y1-7RXy9nuR3PKstPhoGBY-ve2w, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m22033$r8$lambda$y17RXy9nuR3PKstPhoGBYve2w(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1167707029);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1167707029, updateChangedFlags, -1, "com.paypal.pds.components.ShimmerPreview (Shimmer.kt:260)");
            }
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            Camera2StreamConfigurationMap(startRestartGroup, 0);
            getHighSpeedVideoSizes(startRestartGroup, 0);
            getHighResolutionOutputSizeshNQ4ISI(startRestartGroup, 0);
            getHighSpeedVideoFpsRanges(startRestartGroup, 0);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.ShimmerKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.ShimmerKt.m22033$r8$lambda$y17RXy9nuR3PKstPhoGBYve2w(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
