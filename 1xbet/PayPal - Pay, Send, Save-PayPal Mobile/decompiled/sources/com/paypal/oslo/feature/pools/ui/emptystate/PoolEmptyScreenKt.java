package com.paypal.oslo.feature.pools.ui.emptystate;

@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aC\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\rH\u0007¢\u0006\u0002\u0010\u000e\u001a\r\u0010\u000f\u001a\u00020\u0004H\u0003¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0011\u001a\u00020\u0004H\u0003¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0012\u001a\u00020\u0004H\u0003¢\u0006\u0002\u0010\u0010\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002¨\u0006\u0013"}, d2 = {"BottomNavigationHeight", "Landroidx/compose/ui/unit/Dp;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "PoolEmptyScreen", "", "icon", "Lcom/paypal/pds/core/Icon;", "titleResId", "", "modifier", "Landroidx/compose/ui/Modifier;", "descriptionResId", "onCreatePoolClick", "Lkotlin/Function0;", "(Lcom/paypal/pds/core/Icon;ILandroidx/compose/ui/Modifier;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "EmptyScreenNewUserPreview", "(Landroidx/compose/runtime/Composer;I)V", "EmptyScreenUserWithoutCreatedPoolsPreview", "EmptyScreenUserWithoutContributedPoolsPreview", "pools_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PoolEmptyScreenKt {
    private static final float getHighResolutionOutputSizeshNQ4ISI = androidx.compose.ui.unit.Dp.m8601constructorimpl(112.0f);

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PoolEmptyScreen(final com.paypal.pds.core.Icon icon, final int i, androidx.compose.ui.Modifier modifier, java.lang.Integer num, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
        int i4;
        final androidx.compose.ui.Modifier modifier2;
        int i5;
        java.lang.Integer num2;
        int i6;
        kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        int i7;
        androidx.compose.runtime.Composer composer2;
        final java.lang.Integer num3;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1754399758);
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(icon) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        int i8 = i3 & 4;
        if (i8 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                num2 = num;
                i4 |= startRestartGroup.changed(num2) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    function02 = function0;
                    i4 |= startRestartGroup.changedInstance(function02) ? 16384 : 8192;
                    i7 = i4;
                    if (startRestartGroup.shouldExecute((i7 & 9363) == 9362, i7 & 1)) {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        num3 = num2;
                        function03 = function02;
                    } else {
                        androidx.compose.ui.Modifier modifier3 = i8 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        java.lang.Integer num4 = i5 != 0 ? null : num2;
                        if (i6 != 0) {
                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.pools.ui.emptystate.PoolEmptyScreenKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        kotlin.Unit unit;
                                        unit = kotlin.Unit.INSTANCE;
                                        return unit;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            function04 = (kotlin.jvm.functions.Function0) rememberedValue;
                        } else {
                            function04 = function02;
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-1754399758, i7, -1, "com.paypal.oslo.feature.pools.ui.emptystate.PoolEmptyScreen (PoolEmptyScreen.kt:65)");
                        }
                        androidx.compose.foundation.layout.PaddingValues asPaddingValues = androidx.compose.foundation.layout.WindowInsetsKt.asPaddingValues(androidx.compose.foundation.layout.WindowInsets_androidKt.getNavigationBars(androidx.compose.foundation.layout.WindowInsets.INSTANCE, startRestartGroup, 6), startRestartGroup, 0);
                        androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null);
                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 48);
                        int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1708paddingVpY3zN4$default);
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
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), startRestartGroup, 0);
                        androidx.compose.ui.Modifier m1708paddingVpY3zN4$default2 = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing8(), 0.0f, 2, null);
                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 48);
                        int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1708paddingVpY3zN4$default2);
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
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                        com.paypal.pds.components.IconKt.Icon(icon, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.pools.R.string.feature_pools_empty_state_icon_content_description, startRestartGroup, 0), null, com.paypal.pds.components.IconSize.Medium.INSTANCE, com.paypal.pds.core.Color.ContentBase.INSTANCE, startRestartGroup, (i7 & 14) | 27648, 4);
                        androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 0.0f, 0.0f, 13, null);
                        java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(i, startRestartGroup, (i7 >> 3) & 14);
                        com.paypal.pds.core.Typography.HeadingLarge headingLarge = com.paypal.pds.core.Typography.HeadingLarge.INSTANCE;
                        androidx.compose.ui.Modifier modifier4 = modifier3;
                        composer2 = startRestartGroup;
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(stringResource, m1710paddingqDBjuR0$default, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, headingLarge, composer2, 384, 6, 1000);
                        if (num4 != null) {
                            composer2.startReplaceGroup(1913665646);
                            androidx.compose.ui.Modifier m1710paddingqDBjuR0$default2 = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 0.0f, 0.0f, 13, null);
                            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(num4.intValue(), composer2, (i7 >> 9) & 14), m1710paddingqDBjuR0$default2, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyLarge.INSTANCE, composer2, 384, 6, 1000);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(1913969756);
                            composer2.endReplaceGroup();
                        }
                        composer2.endNode();
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), composer2, 0);
                        com.paypal.pds.components.ButtonKt.Button(function04, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.pools.R.string.feature_pools_create_pool_cta, composer2, 0), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, androidx.compose.ui.unit.Dp.m8601constructorimpl(asPaddingValues.getBottom() + getHighResolutionOutputSizeshNQ4ISI), 7, null), null, null, null, null, false, false, composer2, (i7 >> 12) & 14, 504);
                        composer2.endNode();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier4;
                        num3 = num4;
                        function03 = function04;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.pools.ui.emptystate.PoolEmptyScreenKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.pools.ui.emptystate.PoolEmptyScreenKt.$r8$lambda$3snWZVRG9J2_77iIxBffi_8__A0(com.paypal.pds.core.Icon.this, i, modifier2, num3, function03, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                function02 = function0;
                i7 = i4;
                if (startRestartGroup.shouldExecute((i7 & 9363) == 9362, i7 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            num2 = num;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            function02 = function0;
            i7 = i4;
            if (startRestartGroup.shouldExecute((i7 & 9363) == 9362, i7 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        num2 = num;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        function02 = function0;
        i7 = i4;
        if (startRestartGroup.shouldExecute((i7 & 9363) == 9362, i7 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$-rAgcwq18GHeMWkWDM_qL4qFFpQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17658$r8$lambda$rAgcwq18GHeMWkWDM_qL4qFFpQ(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1883647183);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1883647183, updateChangedFlags, -1, "com.paypal.oslo.feature.pools.ui.emptystate.EmptyScreenNewUserPreview (PoolEmptyScreen.kt:123)");
            }
            PoolEmptyScreen(com.paypal.pds.core.Icon.NoIcon.INSTANCE, com.paypal.oslo.feature.pools.R.string.feature_pools_new_user_empty_state_title, null, java.lang.Integer.valueOf(com.paypal.oslo.feature.pools.R.string.feature_pools_new_user_empty_state_description), null, startRestartGroup, 6, 20);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.pools.ui.emptystate.PoolEmptyScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.pools.ui.emptystate.PoolEmptyScreenKt.m17658$r8$lambda$rAgcwq18GHeMWkWDM_qL4qFFpQ(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$-tsOh61dQLEMfFLaO5OR0oAv5IM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17659$r8$lambda$tsOh61dQLEMfFLaO5OR0oAv5IM(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-743398659);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-743398659, updateChangedFlags, -1, "com.paypal.oslo.feature.pools.ui.emptystate.EmptyScreenUserWithoutContributedPoolsPreview (PoolEmptyScreen.kt:149)");
            }
            PoolEmptyScreen(com.paypal.pds.core.Icon.NoIcon.INSTANCE, com.paypal.oslo.feature.pools.R.string.feature_pools_user_without_contributed_pools_empty_state_title, null, null, null, startRestartGroup, 6, 28);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.pools.ui.emptystate.PoolEmptyScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.pools.ui.emptystate.PoolEmptyScreenKt.m17659$r8$lambda$tsOh61dQLEMfFLaO5OR0oAv5IM(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3snWZVRG9J2_77iIxBffi_8__A0(com.paypal.pds.core.Icon icon, int i, androidx.compose.ui.Modifier modifier, java.lang.Integer num, kotlin.jvm.functions.Function0 function0, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        PoolEmptyScreen(icon, i, modifier, num, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$EtAxiet5kQ3sr99jf8GBn0GHkBs(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-749560306);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-749560306, updateChangedFlags, -1, "com.paypal.oslo.feature.pools.ui.emptystate.EmptyScreenUserWithoutCreatedPoolsPreview (PoolEmptyScreen.kt:136)");
            }
            PoolEmptyScreen(com.paypal.pds.core.Icon.NoIcon.INSTANCE, com.paypal.oslo.feature.pools.R.string.feature_pools_user_without_created_pools_empty_state_title, null, java.lang.Integer.valueOf(com.paypal.oslo.feature.pools.R.string.feature_pools_user_without_created_pools_empty_state_description), null, startRestartGroup, 6, 20);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.pools.ui.emptystate.PoolEmptyScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.pools.ui.emptystate.PoolEmptyScreenKt.$r8$lambda$EtAxiet5kQ3sr99jf8GBn0GHkBs(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
