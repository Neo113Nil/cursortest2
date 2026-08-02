package com.paypal.oslo.feature.dataprivacy.ui.screens.l2;

@kotlin.Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001aS\u0010\t\u001a\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00010\u00102\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0001¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u0015\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0016\u001a\r\u0010\u0017\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0016¨\u0006\u0018²\u0006\u0010\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u008a\u0084\u0002²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u0084\u0002"}, d2 = {"ManageYourDataScreen", "", "appNavigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "viewModel", "Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/ManageYourDataViewModel;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/ManageYourDataViewModel;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "ManageYourDataScreenContent", "optionItems", "", "Lcom/paypal/oslo/feature/dataprivacy/ui/model/DataPrivacyL2OptionItem;", "onCloseClick", "Lkotlin/Function0;", "onOptionClick", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/NavKey;", "hasPendingErasure", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "ManageYourDataScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "ManageYourDataScreenSingleItemPreview", "data-privacy_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ManageYourDataScreenKt {
    public static final void ManageYourDataScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ManageYourDataViewModel manageYourDataViewModel, final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manageYourDataViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2139860945);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(manageYourDataViewModel) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2139860945, i2, -1, "com.paypal.oslo.feature.dataprivacy.ui.screens.l2.ManageYourDataScreen (ManageYourDataScreen.kt:61)");
            }
            androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(manageYourDataViewModel.getOptionItems(), null, startRestartGroup, 0, 1);
            androidx.compose.runtime.State collectAsState2 = androidx.compose.runtime.SnapshotStateKt.collectAsState(manageYourDataViewModel.getHasPendingErasure(), null, startRestartGroup, 0, 1);
            java.util.List list = (java.util.List) collectAsState.getValue();
            boolean booleanValue = ((java.lang.Boolean) collectAsState2.getValue()).booleanValue();
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.l2.ManageYourDataScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.dataprivacy.ui.screens.l2.ManageYourDataScreenKt.m14160$r8$lambda$qpHRuUfy2czMjXi295hMM1hk20(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            boolean z2 = i3 == 4;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.l2.ManageYourDataScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.dataprivacy.ui.screens.l2.ManageYourDataScreenKt.m14161$r8$lambda$slPkHQS94DwqhJtMICqx_B90tU(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.navigation3.runtime.NavKey) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ManageYourDataScreenContent(list, function0, (kotlin.jvm.functions.Function1) rememberedValue2, modifier, booleanValue, startRestartGroup, (i2 << 3) & 7168, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.l2.ManageYourDataScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.dataprivacy.ui.screens.l2.ManageYourDataScreenKt.m14155$r8$lambda$1mIzzq3BA5cyaKcn28aDq6Z8k4(com.paypal.oslo.core.navigation.AppNavigator.this, manageYourDataViewModel, modifier, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ManageYourDataScreenContent(final java.util.List<com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2OptionItem> list, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function1<? super androidx.navigation3.runtime.NavKey, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, boolean z, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        boolean z2;
        final boolean z3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(828592993);
        int i4 = (i & 6) == 0 ? (startRestartGroup.changedInstance(list) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i3 = i2 & 16;
            if (i3 == 0) {
                i4 |= 24576;
            } else if ((i & 24576) == 0) {
                z2 = z;
                i4 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                if (!startRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    z3 = z2;
                } else {
                    androidx.compose.ui.Modifier modifier3 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    boolean z4 = i3 != 0 ? false : z2;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(828592993, i4, -1, "com.paypal.oslo.feature.dataprivacy.ui.screens.l2.ManageYourDataScreenContent (ManageYourDataScreen.kt:93)");
                    }
                    androidx.compose.ui.Modifier modifier4 = modifier3;
                    androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                    com.paypal.oslo.core.commonui.components.TopBarKt.TopBar(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_security_privacy_title, startRestartGroup, 0), null, null, com.paypal.oslo.core.commonui.components.TopBarTitleAlignment.Center, false, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1930982360, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.l2.ManageYourDataScreenKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.dataprivacy.ui.screens.l2.ManageYourDataScreenKt.$r8$lambda$fnoUpMUMcUzvIvNXPV1traJZPQ4(kotlin.jvm.functions.Function0.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    }, startRestartGroup, 54), startRestartGroup, 1575936, 54);
                    androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_options_title, startRestartGroup, 0), androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 1, null), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingLarge.INSTANCE, startRestartGroup, 384, 6, 1016);
                    startRestartGroup.startReplaceGroup(282739287);
                    int i6 = 0;
                    for (java.lang.Object obj : list) {
                        if (i6 < 0) {
                            kotlin.collections.CollectionsKt.throwIndexOverflow();
                        }
                        final com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2OptionItem dataPrivacyL2OptionItem = (com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2OptionItem) obj;
                        boolean z5 = dataPrivacyL2OptionItem.getSettingType() == com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2Settings.DELETE_YOUR_DATA;
                        java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(dataPrivacyL2OptionItem.getTitleResId(), startRestartGroup, 0);
                        boolean z6 = i6 < kotlin.collections.CollectionsKt.getLastIndex(list);
                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> lambda$934675850$data_privacy_prodRelease = (z5 && z4) ? com.paypal.oslo.feature.dataprivacy.ui.screens.l2.ComposableSingletons$ManageYourDataScreenKt.INSTANCE.getLambda$934675850$data_privacy_prodRelease() : null;
                        boolean z7 = (i4 & 896) == 256;
                        boolean changedInstance = startRestartGroup.changedInstance(dataPrivacyL2OptionItem);
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if ((z7 | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.l2.ManageYourDataScreenKt$$ExternalSyntheticLambda13
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.dataprivacy.ui.screens.l2.ManageYourDataScreenKt.m14157$r8$lambda$EO4sG5bKlpuP2Ehf3R0tDGvk(kotlin.jvm.functions.Function1.this, dataPrivacyL2OptionItem);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        com.paypal.pds.components.ListKt.m21934ListItemViewBxoFyMc(stringResource, null, null, null, null, true, z6, null, null, null, lambda$934675850$data_privacy_prodRelease, null, true, (kotlin.jvm.functions.Function0) rememberedValue, null, null, null, null, false, startRestartGroup, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 384, 510878);
                        i6++;
                    }
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.endNode();
                    startRestartGroup.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    z3 = z4;
                    modifier2 = modifier4;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier5 = modifier2;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.l2.ManageYourDataScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                            return com.paypal.oslo.feature.dataprivacy.ui.screens.l2.ManageYourDataScreenKt.$r8$lambda$IvGdC8k7x07lYLs9usaR8mCKnjk(list, function0, function1, modifier5, z3, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            z2 = z;
            if (!startRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i3 = i2 & 16;
        if (i3 == 0) {
        }
        z2 = z;
        if (!startRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: $r8$lambda$1mIzzq3BA5cyaKcn2-8aDq6Z8k4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14155$r8$lambda$1mIzzq3BA5cyaKcn28aDq6Z8k4(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ManageYourDataViewModel manageYourDataViewModel, androidx.compose.ui.Modifier modifier, int i, androidx.compose.runtime.Composer composer, int i2) {
        ManageYourDataScreen(appNavigator, manageYourDataViewModel, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$8jJdnRyc_iVQARTH-QPeFVNV1_Y, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14156$r8$lambda$8jJdnRyc_iVQARTHQPeFVNV1_Y(androidx.navigation3.runtime.NavKey navKey, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(navKey);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$EO4sG5b-Kl-puP2Ehf3R0tDGv-k, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14157$r8$lambda$EO4sG5bKlpuP2Ehf3R0tDGvk(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2OptionItem dataPrivacyL2OptionItem) {
        function1.invoke(dataPrivacyL2OptionItem.getDestination());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IvGdC8k7x07lYLs9usaR8mCKnjk(java.util.List list, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, boolean z, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ManageYourDataScreenContent(list, function0, function1, modifier, z, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QHz1SXjDEGlCt3R0lU9XgMiZrqs(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$fnoUpMUMcUzvIvNXPV1traJZPQ4(kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1930982360, i, -1, "com.paypal.oslo.feature.dataprivacy.ui.screens.l2.ManageYourDataScreenContent.<anonymous>.<anonymous> (ManageYourDataScreen.kt:103)");
            }
            com.paypal.oslo.core.commonui.components.TopBarKt.TopBarCloseButton(function0, null, null, composer, 0, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$iyqHjDACAaifyDNuBeta841mnLM(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2137104800);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2137104800, updateChangedFlags, -1, "com.paypal.oslo.feature.dataprivacy.ui.screens.l2.ManageYourDataScreenPreview (ManageYourDataScreen.kt:146)");
            }
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2OptionItem[]{new com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2OptionItem("download_your_data", com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_download_your_data_option, com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2Settings.DOWNLOAD_YOUR_DATA, null, 8, null), new com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2OptionItem("delete_your_data", com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_delete_your_data_option, com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2Settings.DELETE_YOUR_DATA, null, 8, null), new com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2OptionItem("face_scan_data", com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_face_scan_data_option, com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2Settings.FACE_SCAN_DATA, null, 8, null)});
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.l2.ManageYourDataScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.l2.ManageYourDataScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ManageYourDataScreenContent(listOf, function0, (kotlin.jvm.functions.Function1) rememberedValue2, null, false, startRestartGroup, 432, 24);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.l2.ManageYourDataScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.dataprivacy.ui.screens.l2.ManageYourDataScreenKt.$r8$lambda$iyqHjDACAaifyDNuBeta841mnLM(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$oDnnHRzKTj20wMKh1zOryIm50wM(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-422458629);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-422458629, updateChangedFlags, -1, "com.paypal.oslo.feature.dataprivacy.ui.screens.l2.ManageYourDataScreenSingleItemPreview (ManageYourDataScreen.kt:176)");
            }
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2OptionItem("download_your_data", com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_download_your_data_option, com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2Settings.DOWNLOAD_YOUR_DATA, null, 8, null));
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.l2.ManageYourDataScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.l2.ManageYourDataScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ManageYourDataScreenContent(listOf, function0, (kotlin.jvm.functions.Function1) rememberedValue2, null, false, startRestartGroup, 432, 24);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.l2.ManageYourDataScreenKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.dataprivacy.ui.screens.l2.ManageYourDataScreenKt.$r8$lambda$oDnnHRzKTj20wMKh1zOryIm50wM(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$qpH-RuUfy2czMjXi295hMM1hk20, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14160$r8$lambda$qpHRuUfy2czMjXi295hMM1hk20(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.l2.ManageYourDataScreenKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.dataprivacy.ui.screens.l2.ManageYourDataScreenKt.$r8$lambda$QHz1SXjDEGlCt3R0lU9XgMiZrqs((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$slPkHQS94DwqhJtMIC-qx_B90tU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14161$r8$lambda$slPkHQS94DwqhJtMICqx_B90tU(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final androidx.navigation3.runtime.NavKey navKey) {
        if (navKey != null) {
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.l2.ManageYourDataScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.dataprivacy.ui.screens.l2.ManageYourDataScreenKt.m14156$r8$lambda$8jJdnRyc_iVQARTHQPeFVNV1_Y(androidx.navigation3.runtime.NavKey.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
