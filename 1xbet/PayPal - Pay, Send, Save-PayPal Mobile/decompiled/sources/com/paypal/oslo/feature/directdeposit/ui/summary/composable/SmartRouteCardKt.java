package com.paypal.oslo.feature.directdeposit.ui.summary.composable;

@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u001a?\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0001¢\u0006\u0002\u0010\u000b\u001a\f\u0010\f\u001a\u00020\r*\u00020\u0005H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"MaxAllocationPercentage", "", "SmartRouteCard", "", "smartRoutePreferences", "Lcom/paypal/oslo/feature/directdeposit/domain/model/SmartRoutePreferences;", "onSetupClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "onEditClick", "(Lcom/paypal/oslo/feature/directdeposit/domain/model/SmartRoutePreferences;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "hasConfiguredAllocations", "", "directdeposit_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SmartRouteCardKt {
    /* JADX WARN: Removed duplicated region for block: B:151:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SmartRouteCard(final com.paypal.oslo.feature.directdeposit.domain.model.SmartRoutePreferences smartRoutePreferences, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        androidx.compose.ui.Modifier modifier3;
        kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i3;
        boolean z;
        int i4;
        int i5;
        java.util.ArrayList emptyList;
        char c;
        char c2;
        java.lang.Integer valueOf;
        java.util.List<com.paypal.oslo.feature.directdeposit.domain.model.Target> targets;
        com.paypal.oslo.feature.directdeposit.domain.model.Distribution distribution;
        java.util.List<com.paypal.oslo.feature.directdeposit.domain.model.Target> targets2;
        int i6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1277816360);
        int i7 = (i & 6) == 0 ? (startRestartGroup.changedInstance(smartRoutePreferences) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i7 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i7 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i7 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    function03 = function02;
                    if (startRestartGroup.changedInstance(function03)) {
                        i6 = 2048;
                        i7 |= i6;
                    }
                } else {
                    function03 = function02;
                }
                i6 = 1024;
                i7 |= i6;
            } else {
                function03 = function02;
            }
            if (!startRestartGroup.shouldExecute((i7 & 1171) == 1170, i7 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i7 &= -7169;
                    }
                    i3 = i7;
                    modifier3 = modifier2;
                    function04 = function03;
                } else {
                    androidx.compose.ui.Modifier.Companion companion = i8 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) != 0) {
                        i7 &= -7169;
                        function04 = function0;
                    } else {
                        function04 = function03;
                    }
                    androidx.compose.ui.Modifier modifier4 = companion;
                    i3 = i7;
                    modifier3 = modifier4;
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1277816360, i3, -1, "com.paypal.oslo.feature.directdeposit.ui.summary.composable.SmartRouteCard (SmartRouteCard.kt:66)");
                }
                if (smartRoutePreferences != null && smartRoutePreferences.getStatusEnum() == com.paypal.oslo.feature.directdeposit.domain.model.SmartRouteStatus.ACTIVE && (distribution = smartRoutePreferences.getDistribution()) != null && (targets2 = distribution.getTargets()) != null) {
                    java.util.List<com.paypal.oslo.feature.directdeposit.domain.model.Target> list = targets2;
                    if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                        for (com.paypal.oslo.feature.directdeposit.domain.model.Target target : list) {
                            if (target.getAllocationPercentage() != null && target.getAllocationPercentage().doubleValue() > 0.0d) {
                                z = true;
                                break;
                            }
                        }
                    }
                }
                z = false;
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing24())), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundRoleBaseInfo.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2), com.paypal.pds.core.ConstantsKt.getSpacing16()), "directDepositScreenSmartRouteCard");
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag);
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
                if (z) {
                    i4 = com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_summary_smartroute_manage_title;
                } else {
                    i4 = com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_summary_smartroute_setup_title;
                }
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(i4, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "directDepositScreenSmartRouteCardTitle"), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 432, 6, 1016);
                if (z) {
                    startRestartGroup.startReplaceGroup(-1787232146);
                    com.paypal.oslo.feature.directdeposit.domain.model.Distribution distribution2 = smartRoutePreferences.getDistribution();
                    if (distribution2 == null || (targets = distribution2.getTargets()) == null) {
                        emptyList = kotlin.collections.CollectionsKt.emptyList();
                    } else {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        for (java.lang.Object obj : targets) {
                            com.paypal.oslo.feature.directdeposit.domain.model.Target target2 = (com.paypal.oslo.feature.directdeposit.domain.model.Target) obj;
                            if (target2.getAllocationPercentage() != null && target2.getAllocationPercentage().doubleValue() > 0.0d) {
                                arrayList.add(obj);
                            }
                        }
                        emptyList = arrayList;
                    }
                    java.util.List<com.paypal.oslo.feature.directdeposit.domain.model.Target> list2 = emptyList;
                    java.util.Iterator it = list2.iterator();
                    double d = 0.0d;
                    while (it.hasNext()) {
                        java.lang.Double allocationPercentage = ((com.paypal.oslo.feature.directdeposit.domain.model.Target) it.next()).getAllocationPercentage();
                        d += allocationPercentage != null ? allocationPercentage.doubleValue() : 0.0d;
                    }
                    startRestartGroup.startReplaceGroup(2020569022);
                    for (com.paypal.oslo.feature.directdeposit.domain.model.Target target3 : list2) {
                        java.lang.Double allocationPercentage2 = target3.getAllocationPercentage();
                        int doubleValue = allocationPercentage2 != null ? (int) allocationPercentage2.doubleValue() : 0;
                        int i9 = com.paypal.oslo.feature.directdeposit.ui.summary.composable.SmartRouteCardKt.WhenMappings.$EnumSwitchMapping$0[target3.getAccountTypeEnum().ordinal()];
                        if (i9 != 1) {
                            c2 = 2;
                            if (i9 != 2) {
                                c = 4;
                                if (i9 != 3 && i9 != 4) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                valueOf = null;
                            } else {
                                c = 4;
                                valueOf = java.lang.Integer.valueOf(com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_summary_smartroute_manage_pyusd_caption);
                            }
                        } else {
                            c = 4;
                            c2 = 2;
                            valueOf = java.lang.Integer.valueOf(com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_summary_smartroute_manage_savings_caption);
                        }
                        if (valueOf == null) {
                            startRestartGroup.startReplaceGroup(-1069816457);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(-1069816456);
                            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(valueOf.intValue(), new java.lang.Object[]{java.lang.Integer.valueOf(doubleValue)}, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "smartRouteCardAllocation_".concat(java.lang.String.valueOf(target3.getAccountType()))), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 384, 6, 1016);
                            startRestartGroup.endReplaceGroup();
                        }
                    }
                    startRestartGroup.endReplaceGroup();
                    if (d < 100.0d) {
                        startRestartGroup.startReplaceGroup(-1785818825);
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_summary_smartroute_manage_balance_caption, new java.lang.Object[]{java.lang.Integer.valueOf((int) (100.0d - d))}, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "smartRouteCardAllocation_BALANCE"), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 432, 6, 1016);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-1785298924);
                        startRestartGroup.endReplaceGroup();
                    }
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-1785210326);
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_summary_smartroute_setup_caption, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "smartRouteCardSetupDescription"), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 432, 6, 1016);
                    startRestartGroup.endReplaceGroup();
                }
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 0);
                kotlin.jvm.functions.Function0<kotlin.Unit> function05 = z ? function04 : function0;
                com.paypal.pds.components.ButtonStyle.TertiaryContained tertiaryContained = com.paypal.pds.components.ButtonStyle.TertiaryContained.INSTANCE;
                com.paypal.pds.components.ButtonSize.Small small = com.paypal.pds.components.ButtonSize.Small.INSTANCE;
                if (z) {
                    i5 = com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_summary_smartroute_manage_button;
                } else {
                    i5 = com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_summary_smartroute_setup_button;
                }
                com.paypal.pds.components.ButtonKt.Button(function05, androidx.compose.ui.res.StringResources_androidKt.stringResource(i5, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "directDepositScreenSmartRouteSetupButton"), null, null, tertiaryContained, small, false, false, startRestartGroup, 1769856, 408);
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                function04 = function03;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier3;
                final kotlin.jvm.functions.Function0<kotlin.Unit> function06 = function04;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.composable.SmartRouteCardKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.directdeposit.ui.summary.composable.SmartRouteCardKt.$r8$lambda$GApdtMzZPTRnM__D7O8XcSqnEII(com.paypal.oslo.feature.directdeposit.domain.model.SmartRoutePreferences.this, function0, modifier5, function06, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i7 & 1171) == 1170, i7 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GApdtMzZPTRnM__D7O8XcSqnEII(com.paypal.oslo.feature.directdeposit.domain.model.SmartRoutePreferences smartRoutePreferences, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0 function02, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SmartRouteCard(smartRoutePreferences, function0, modifier, function02, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.directdeposit.domain.model.SmartRouteAccountType.values().length];
            try {
                iArr[com.paypal.oslo.feature.directdeposit.domain.model.SmartRouteAccountType.SAVINGS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.directdeposit.domain.model.SmartRouteAccountType.CRYPTO_PYUSD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.directdeposit.domain.model.SmartRouteAccountType.BALANCE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.directdeposit.domain.model.SmartRouteAccountType.UNKNOWN.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
