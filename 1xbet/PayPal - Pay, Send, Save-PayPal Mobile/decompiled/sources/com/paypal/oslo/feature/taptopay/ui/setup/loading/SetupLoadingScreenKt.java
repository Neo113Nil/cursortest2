package com.paypal.oslo.feature.taptopay.ui.setup.loading;

@kotlin.Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\u001a!\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0011\u001a%\u0010\u0012\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0003¢\u0006\u0002\u0010\u0016\u001a\u0017\u0010\u0017\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0003¢\u0006\u0002\u0010\u0018\u001a\r\u0010\u0019\u001a\u00020\fH\u0003¢\u0006\u0002\u0010\u001a\u001a\r\u0010\u001b\u001a\u00020\fH\u0003¢\u0006\u0002\u0010\u001a\u001a\r\u0010\u001c\u001a\u00020\fH\u0003¢\u0006\u0002\u0010\u001a\u001a\r\u0010\u001d\u001a\u00020\fH\u0003¢\u0006\u0002\u0010\u001a\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001e²\u0006\n\u0010\u001f\u001a\u00020\u0007X\u008a\u008e\u0002²\u0006\n\u0010 \u001a\u00020!X\u008a\u0084\u0002"}, d2 = {"SetupLoadingContainerTestTag", "", "SetupLoadingBackgroundTestTag", "SetupLoadingHeaderTestTag", "SetupLoadingBarTestTag", "SetupLoadingNoticeTestTag", "LoadingAnimationDurationMs", "", "TitleRotationDelayMs", "", "TitleFadeDurationMs", "SetupLoadingScreen", "", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Lcom/paypal/oslo/feature/taptopay/ui/setup/loading/LoadingContent;", "(Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/taptopay/ui/setup/loading/LoadingContent;Landroidx/compose/runtime/Composer;II)V", "RotatingTitle", "titles", "", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AnimatedLoadingBar", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SetupLoadingScreenDefaultPreview", "(Landroidx/compose/runtime/Composer;I)V", "SetupLoadingScreenDefaultDarkPreview", "SetupLoadingScreenPPDCPreview", "SetupLoadingScreenThirdPartyPreview", "taptopay_prodRelease", "currentIndex", "progress", ""}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SetupLoadingScreenKt {
    public static final java.lang.String SetupLoadingBackgroundTestTag = "setup_loading_background";
    public static final java.lang.String SetupLoadingBarTestTag = "setup_loading_bar";
    public static final java.lang.String SetupLoadingContainerTestTag = "setup_loading_container";
    public static final java.lang.String SetupLoadingHeaderTestTag = "setup_loading_header";
    public static final java.lang.String SetupLoadingNoticeTestTag = "setup_loading_notice";

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
    
        if ((r11 & 2) != 0) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SetupLoadingScreen(final androidx.compose.ui.Modifier modifier, final com.paypal.oslo.feature.taptopay.ui.setup.loading.LoadingContent loadingContent, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1645842580);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && startRestartGroup.changedInstance(loadingContent)) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if (i4 != 0) {
                    modifier = androidx.compose.ui.Modifier.INSTANCE;
                }
                if ((i2 & 2) != 0) {
                    loadingContent = com.paypal.oslo.feature.taptopay.ui.setup.loading.LoadingContent.INSTANCE.getDefault();
                    i3 &= -113;
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1645842580, i3, -1, "com.paypal.oslo.feature.taptopay.ui.setup.loading.SetupLoadingScreen (SetupLoadingScreen.kt:111)");
                }
                com.paypal.pds.core.ThemeKt.Theme(false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1022260367, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taptopay.ui.setup.loading.SetupLoadingScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.taptopay.ui.setup.loading.SetupLoadingScreenKt.m20218$r8$lambda$XYEgb0kUsG5yLWe1pRpXOtiMqs(androidx.compose.ui.Modifier.this, loadingContent, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, 54);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taptopay.ui.setup.loading.SetupLoadingScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taptopay.ui.setup.loading.SetupLoadingScreenKt.m20222$r8$lambda$lUSwbaoCboNwiu3ALSG95B2mww(androidx.compose.ui.Modifier.this, loadingContent, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRangesFor(final java.util.List<? extends com.paypal.oslo.core.commonui.utils.RefText> list, final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1714513528);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1714513528, i3, -1, "com.paypal.oslo.feature.taptopay.ui.setup.loading.RotatingTitle (SetupLoadingScreen.kt:206)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotIntStateKt.mutableIntStateOf(0);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.MutableIntState mutableIntState = (androidx.compose.runtime.MutableIntState) rememberedValue;
            if (list.size() > 1) {
                startRestartGroup.startReplaceGroup(1321644099);
                boolean changedInstance = startRestartGroup.changedInstance(list);
                com.paypal.oslo.feature.taptopay.ui.setup.loading.SetupLoadingScreenKt$RotatingTitle$1$1 rememberedValue2 = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new com.paypal.oslo.feature.taptopay.ui.setup.loading.SetupLoadingScreenKt$RotatingTitle$1$1(list, mutableIntState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(list, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, i3 & 14);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(1321835338);
                startRestartGroup.endReplaceGroup();
            }
            int intValue = mutableIntState.getIntValue();
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.ui.setup.loading.SetupLoadingScreenKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.taptopay.ui.setup.loading.SetupLoadingScreenKt.m20223$r8$lambda$rWzmjwDL_IYHOaK5gMAq2GsRYQ((androidx.compose.animation.AnimatedContentTransitionScope) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            androidx.compose.animation.AnimatedContentKt.AnimatedContent(java.lang.Integer.valueOf(intValue), modifier, (kotlin.jvm.functions.Function1) rememberedValue3, null, "title_rotation", null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1955429822, true, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.taptopay.ui.setup.loading.SetupLoadingScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function4
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                    return com.paypal.oslo.feature.taptopay.ui.setup.loading.SetupLoadingScreenKt.$r8$lambda$D_OoQEPpNXA_e3txvR8KfCLzDVg(list, (androidx.compose.animation.AnimatedContentScope) obj, ((java.lang.Integer) obj2).intValue(), (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, (i3 & 112) | 1597824, 40);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taptopay.ui.setup.loading.SetupLoadingScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taptopay.ui.setup.loading.SetupLoadingScreenKt.$r8$lambda$NsI1XdpulucCbtVIi8BIXsVqP0o(list, modifier, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRanges(final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1713382080);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if (!startRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1713382080, i3, -1, "com.paypal.oslo.feature.taptopay.ui.setup.loading.AnimatedLoadingBar (SetupLoadingScreen.kt:239)");
            }
            androidx.compose.runtime.State<java.lang.Float> animateFloat = androidx.compose.animation.core.InfiniteTransitionKt.animateFloat(androidx.compose.animation.core.InfiniteTransitionKt.rememberInfiniteTransition("loading_bar_animation", startRestartGroup, 6, 0), 0.0f, 1.0f, androidx.compose.animation.core.AnimationSpecKt.m1184infiniteRepeatable9IiC70o$default(androidx.compose.animation.core.AnimationSpecKt.tween$default(2000, 0, androidx.compose.animation.core.EasingKt.getLinearEasing(), 2, null), androidx.compose.animation.core.RepeatMode.Restart, 0L, 4, null), "loading_progress", startRestartGroup, androidx.compose.animation.core.InfiniteTransition.$stable | 25008 | (androidx.compose.animation.core.InfiniteRepeatableSpec.$stable << 9), 0);
            androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.ui.draw.ClipKt.clip(modifier, androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(100.0f))), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundMuted.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, background);
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
            androidx.compose.foundation.layout.BoxKt.Box(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth(androidx.compose.ui.Modifier.INSTANCE, animateFloat.getValue().floatValue()), androidx.compose.ui.unit.Dp.m8601constructorimpl(6.0f)), androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(100.0f))), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBrandPrimary.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2), startRestartGroup, 0);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taptopay.ui.setup.loading.SetupLoadingScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taptopay.ui.setup.loading.SetupLoadingScreenKt.m20221$r8$lambda$g5iZDssoi23V3PoRMPWI4wXDn0(androidx.compose.ui.Modifier.this, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ androidx.compose.ui.layout.MeasureResult $r8$lambda$3eDHlYK0JXCADKWMggjfE8lhiyQ(final int i, int i2, androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, androidx.compose.ui.unit.Constraints constraints) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(measureScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(measurable, "");
        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(constraints.getGetHighSpeedVideoFpsRangesFor(), 0, 0, 0, androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(constraints.getGetHighSpeedVideoFpsRangesFor()) + i + i2, 7, null));
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, mo7353measureBRTryo0.getWidth(), androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(constraints.getGetHighSpeedVideoFpsRangesFor()), null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.ui.setup.loading.SetupLoadingScreenKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.taptopay.ui.setup.loading.SetupLoadingScreenKt.$r8$lambda$6CWRTBMzF9Cl57KyonAexjsqorY(androidx.compose.ui.layout.Placeable.this, i, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6CWRTBMzF9Cl57KyonAexjsqorY(androidx.compose.ui.layout.Placeable placeable, int i, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementScope, "");
        androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeable, 0, -i, 0.0f, 4, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$D_OoQEPpNXA_e3txvR8KfCLzDVg(java.util.List list, androidx.compose.animation.AnimatedContentScope animatedContentScope, int i, androidx.compose.runtime.Composer composer, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animatedContentScope, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1955429822, i2, -1, "com.paypal.oslo.feature.taptopay.ui.setup.loading.RotatingTitle.<anonymous> (SetupLoadingScreen.kt:228)");
        }
        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(com.paypal.oslo.core.commonui.utils.RefTextKt.value((com.paypal.oslo.core.commonui.utils.RefText) ((i < 0 || i >= list.size()) ? (com.paypal.oslo.core.commonui.utils.RefText) kotlin.collections.CollectionsKt.first(list) : list.get(i)), composer, com.paypal.oslo.core.commonui.utils.RefText.$stable), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.Color.ContentUtilityInverse.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.DisplayMedium.INSTANCE, composer, 432, 6, 1000);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Mnm2xRTUrLyrdmdOrkCDhwWPKM0(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(107904849);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(107904849, updateChangedFlags, -1, "com.paypal.oslo.feature.taptopay.ui.setup.loading.SetupLoadingScreenDefaultPreview (SetupLoadingScreen.kt:270)");
            }
            SetupLoadingScreen(null, com.paypal.oslo.feature.taptopay.ui.setup.loading.LoadingContent.INSTANCE.getDefault(), startRestartGroup, 0, 1);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taptopay.ui.setup.loading.SetupLoadingScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taptopay.ui.setup.loading.SetupLoadingScreenKt.$r8$lambda$Mnm2xRTUrLyrdmdOrkCDhwWPKM0(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NsI1XdpulucCbtVIi8BIXsVqP0o(java.util.List list, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoFpsRangesFor(list, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RAuwfCQdves0uwA2D07PXcKezY4(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1111800729);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1111800729, updateChangedFlags, -1, "com.paypal.oslo.feature.taptopay.ui.setup.loading.SetupLoadingScreenDefaultDarkPreview (SetupLoadingScreen.kt:278)");
            }
            SetupLoadingScreen(null, com.paypal.oslo.feature.taptopay.ui.setup.loading.LoadingContent.INSTANCE.getDefault(), startRestartGroup, 0, 1);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taptopay.ui.setup.loading.SetupLoadingScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taptopay.ui.setup.loading.SetupLoadingScreenKt.$r8$lambda$RAuwfCQdves0uwA2D07PXcKezY4(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$XYEgb0kUsG5yLWe1pRpXO-tiMqs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20218$r8$lambda$XYEgb0kUsG5yLWe1pRpXOtiMqs(androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.taptopay.ui.setup.loading.LoadingContent loadingContent, androidx.compose.runtime.Composer composer, int i) {
        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance;
        java.lang.Object obj;
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1022260367, i, -1, "com.paypal.oslo.feature.taptopay.ui.setup.loading.SetupLoadingScreen.<anonymous> (SetupLoadingScreen.kt:126)");
            }
            androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) composer.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
            final int top = androidx.compose.foundation.layout.WindowInsets_androidKt.getStatusBars(androidx.compose.foundation.layout.WindowInsets.INSTANCE, composer, 6).getTop(density);
            final int bottom = androidx.compose.foundation.layout.WindowInsets_androidKt.getNavigationBars(androidx.compose.foundation.layout.WindowInsets.INSTANCE, composer, 6).getBottom(density);
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null);
            boolean changed = composer.changed(top);
            boolean changed2 = composer.changed(bottom);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.taptopay.ui.setup.loading.SetupLoadingScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function3
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                        return com.paypal.oslo.feature.taptopay.ui.setup.loading.SetupLoadingScreenKt.$r8$lambda$3eDHlYK0JXCADKWMggjfE8lhiyQ(top, bottom, (androidx.compose.ui.layout.MeasureScope) obj2, (androidx.compose.ui.layout.Measurable) obj3, (androidx.compose.ui.unit.Constraints) obj4);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.ui.layout.LayoutModifierKt.layout(fillMaxSize$default, (kotlin.jvm.functions.Function3) rememberedValue), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundUtilityEmphasis.INSTANCE, (androidx.compose.ui.graphics.Shape) null, composer, 48, 2), SetupLoadingContainerTestTag);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, testTag);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            if (loadingContent.getBackground() != 0) {
                composer.startReplaceGroup(-318679783);
                boxScopeInstance = boxScopeInstance2;
                obj = null;
                androidx.compose.foundation.ImageKt.Image(androidx.compose.ui.res.PainterResources_androidKt.painterResource(loadingContent.getBackground(), composer, 0), (java.lang.String) null, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), SetupLoadingBackgroundTestTag), (androidx.compose.ui.Alignment) null, androidx.compose.ui.layout.ContentScale.INSTANCE.getCrop(), 0.0f, (androidx.compose.ui.graphics.ColorFilter) null, composer, androidx.compose.ui.graphics.painter.Painter.$stable | 25008, 104);
                composer.endReplaceGroup();
            } else {
                boxScopeInstance = boxScopeInstance2;
                obj = null;
                composer.startReplaceGroup(-318339155);
                composer.endReplaceGroup();
            }
            androidx.compose.ui.Modifier padding = androidx.compose.foundation.layout.PaddingKt.padding(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(boxScopeInstance.align(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, obj), androidx.compose.ui.Alignment.INSTANCE.getBottomCenter()), com.paypal.pds.core.ConstantsKt.getSpacing24(), 0.0f, 2, obj), androidx.compose.foundation.layout.WindowInsetsKt.asPaddingValues(androidx.compose.foundation.layout.WindowInsets_androidKt.getNavigationBars(androidx.compose.foundation.layout.WindowInsets.INSTANCE, composer, 6), composer, 0));
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), composer, 48);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, padding);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            getHighSpeedVideoFpsRangesFor(loadingContent.getTitles(), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, obj), 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing24(), 7, null), SetupLoadingHeaderTestTag), composer, 0, 0);
            getHighSpeedVideoFpsRanges(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, obj), androidx.compose.ui.unit.Dp.m8601constructorimpl(6.0f)), SetupLoadingBarTestTag), composer, 6, 0);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_setup_loading_notice, composer, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, obj), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing24(), 0.0f, 0.0f, 13, null), SetupLoadingNoticeTestTag), com.paypal.pds.core.Color.ContentUtilityInverse.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer, 384, 6, 1000);
            composer.endNode();
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$bw1xLu-Sr1rR4FwNNo6_9E6kC74, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20219$r8$lambda$bw1xLuSr1rR4FwNNo6_9E6kC74(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1443555041);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1443555041, updateChangedFlags, -1, "com.paypal.oslo.feature.taptopay.ui.setup.loading.SetupLoadingScreenThirdPartyPreview (SetupLoadingScreen.kt:294)");
            }
            SetupLoadingScreen(null, com.paypal.oslo.feature.taptopay.ui.setup.loading.LoadingContent.INSTANCE.getThirdParty(), startRestartGroup, 0, 1);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taptopay.ui.setup.loading.SetupLoadingScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taptopay.ui.setup.loading.SetupLoadingScreenKt.m20219$r8$lambda$bw1xLuSr1rR4FwNNo6_9E6kC74(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$cZmg3C9BM7gdkHZZI-26yLHMXuc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20220$r8$lambda$cZmg3C9BM7gdkHZZI26yLHMXuc(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-840620479);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-840620479, updateChangedFlags, -1, "com.paypal.oslo.feature.taptopay.ui.setup.loading.SetupLoadingScreenPPDCPreview (SetupLoadingScreen.kt:286)");
            }
            SetupLoadingScreen(null, com.paypal.oslo.feature.taptopay.ui.setup.loading.LoadingContent.INSTANCE.getPayPalDebit(), startRestartGroup, 0, 1);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taptopay.ui.setup.loading.SetupLoadingScreenKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taptopay.ui.setup.loading.SetupLoadingScreenKt.m20220$r8$lambda$cZmg3C9BM7gdkHZZI26yLHMXuc(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$g5iZDssoi-23V3PoRMPWI4wXDn0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20221$r8$lambda$g5iZDssoi23V3PoRMPWI4wXDn0(androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoFpsRanges(modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$lUSwbaoCb-oNwiu3ALSG95B2mww, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20222$r8$lambda$lUSwbaoCboNwiu3ALSG95B2mww(androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.taptopay.ui.setup.loading.LoadingContent loadingContent, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SetupLoadingScreen(modifier, loadingContent, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$rWzmjwDL_IYH-OaK5gMAq2GsRYQ, reason: not valid java name */
    public static /* synthetic */ androidx.compose.animation.ContentTransform m20223$r8$lambda$rWzmjwDL_IYHOaK5gMAq2GsRYQ(androidx.compose.animation.AnimatedContentTransitionScope animatedContentTransitionScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animatedContentTransitionScope, "");
        return androidx.compose.animation.AnimatedContentKt.togetherWith(androidx.compose.animation.EnterExitTransitionKt.fadeIn$default(androidx.compose.animation.core.AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null), androidx.compose.animation.EnterExitTransitionKt.fadeOut$default(androidx.compose.animation.core.AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null));
    }
}
