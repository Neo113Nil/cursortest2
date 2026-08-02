package com.paypal.oslo.feature.packagetracking.ui.detail.components;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001ae\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a7\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/pds/components/BottomSheetController;", "bottomSheetController", "", "isDelivered", "Lkotlin/Function0;", "", "onSettingsClick", "onMarkAsDeliveredClick", "onRemoveClick", "onRenameClick", "onDismiss", "PackageTrackingOptionsBottomSheet", "(Lcom/paypal/pds/components/BottomSheetController;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "", "p0", "Lcom/paypal/pds/core/Icon;", "p1", "p2", "p3", "getHighSpeedVideoSizes", "(Ljava/lang/String;Lcom/paypal/pds/core/Icon;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PackageTrackingOptionsBottomSheetKt {
    public static final void PackageTrackingOptionsBottomSheet(final com.paypal.pds.components.BottomSheetController bottomSheetController, final boolean z, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function0<kotlin.Unit> function03, final kotlin.jvm.functions.Function0<kotlin.Unit> function04, final kotlin.jvm.functions.Function0<kotlin.Unit> function05, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function04, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function05, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1623343017);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function03) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function04) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function05) ? 1048576 : 524288;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1623343017, i3, -1, "com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingOptionsBottomSheet (PackageTrackingOptionsBottomSheet.kt:40)");
            }
            composer2 = startRestartGroup;
            com.paypal.pds.components.ModalKt.Modal(bottomSheetController, function05, new com.paypal.pds.components.TopNavConfig("", false, null, 6, null), null, null, null, function05, false, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(900107714, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingOptionsBottomSheetKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingOptionsBottomSheetKt.m17554$r8$lambda$I2f5O0Ueaim5QpXBdtsIb5UU8(kotlin.jvm.functions.Function0.this, z, function02, function03, function04, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), composer2, com.paypal.pds.components.BottomSheetController.$stable | 805306368 | (i3 & 14) | ((i3 >> 15) & 112) | (com.paypal.pds.components.TopNavConfig.$stable << 6) | (3670016 & i3), 440);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingOptionsBottomSheetKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingOptionsBottomSheetKt.m17558$r8$lambda$sNsBItFY3128DOht8lhooDieJQ(com.paypal.pds.components.BottomSheetController.this, z, function0, function02, function03, function04, function05, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoSizes(final java.lang.String str, final com.paypal.pds.core.Icon icon, final java.lang.String str2, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(602580616);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(icon) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(602580616, i2, -1, "com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageOptionsItem (PackageTrackingOptionsBottomSheet.kt:86)");
            }
            com.paypal.pds.components.ListKt.m21934ListItemViewBxoFyMc(str, androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing2()), null, null, null, false, false, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(531699635, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingOptionsBottomSheetKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingOptionsBottomSheetKt.m17557$r8$lambda$ofUuUJ6jSHn44sSiN8_P9U9ds(com.paypal.pds.core.Icon.this, str2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), null, null, null, false, function0, null, null, null, null, false, startRestartGroup, (i2 & 14) | 100663296, i2 & 7168, 515836);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingOptionsBottomSheetKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingOptionsBottomSheetKt.m17556$r8$lambda$dsWHNy2oZg_Do6dr6_AuKNJCus(str, icon, str2, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$I2f5O0Ueaim-5QpXBdtsIb5U-U8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17554$r8$lambda$I2f5O0Ueaim5QpXBdtsIb5UU8(kotlin.jvm.functions.Function0 function0, boolean z, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, kotlin.jvm.functions.Function0 function04, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(900107714, i, -1, "com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingOptionsBottomSheet.<anonymous> (PackageTrackingOptionsBottomSheet.kt:47)");
            }
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default);
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
            getHighSpeedVideoSizes(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_menu_package_settings, composer, 0), com.paypal.pds.core.Icon.Cog.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_menu_package_settings, composer, 0), function0, composer, 48);
            if (z) {
                composer.startReplaceGroup(1190963574);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1190585901);
                getHighSpeedVideoSizes(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_menu_mark_as_delivered_title, composer, 0), com.paypal.pds.core.Icon.Check.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_menu_mark_as_delivered_title, composer, 0), function02, composer, 48);
                composer.endReplaceGroup();
            }
            getHighSpeedVideoSizes(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_menu_remove_title, composer, 0), com.paypal.pds.core.Icon.XCircle.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_menu_remove_title, composer, 0), function03, composer, 48);
            getHighSpeedVideoSizes(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_menu_rename_title, composer, 0), com.paypal.pds.core.Icon.Pencil.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_menu_rename_title, composer, 0), function04, composer, 48);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$dsWHNy2oZg_Do6dr6_AuKN-JCus, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17556$r8$lambda$dsWHNy2oZg_Do6dr6_AuKNJCus(java.lang.String str, com.paypal.pds.core.Icon icon, java.lang.String str2, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoSizes(str, icon, str2, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$fYrnDP7Sv5hJQvmMIxwdq5RSvj0(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1867516585);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1867516585, updateChangedFlags, -1, "com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingOptionsBottomSheetPreview (PackageTrackingOptionsBottomSheet.kt:105)");
            }
            com.paypal.pds.components.BottomSheetController bottomSheetController = new com.paypal.pds.components.BottomSheetController();
            bottomSheetController.showSheet();
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingOptionsBottomSheetKt$$ExternalSyntheticLambda0
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
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingOptionsBottomSheetKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingOptionsBottomSheetKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingOptionsBottomSheetKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function0 function04 = (kotlin.jvm.functions.Function0) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingOptionsBottomSheetKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            PackageTrackingOptionsBottomSheet(bottomSheetController, false, function0, function02, function03, function04, (kotlin.jvm.functions.Function0) rememberedValue5, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 1797552);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingOptionsBottomSheetKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingOptionsBottomSheetKt.$r8$lambda$fYrnDP7Sv5hJQvmMIxwdq5RSvj0(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ofUuU-J6jSHn44sSiN8-_P9U9ds, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17557$r8$lambda$ofUuUJ6jSHn44sSiN8_P9U9ds(com.paypal.pds.core.Icon icon, java.lang.String str, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(531699635, i, -1, "com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageOptionsItem.<anonymous> (PackageTrackingOptionsBottomSheet.kt:94)");
            }
            com.paypal.pds.components.IconKt.Icon(icon, str, null, null, null, composer, 0, 28);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$sNsBItFY3128D-Oht8lhooDieJQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17558$r8$lambda$sNsBItFY3128DOht8lhooDieJQ(com.paypal.pds.components.BottomSheetController bottomSheetController, boolean z, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, kotlin.jvm.functions.Function0 function04, kotlin.jvm.functions.Function0 function05, int i, androidx.compose.runtime.Composer composer, int i2) {
        PackageTrackingOptionsBottomSheet(bottomSheetController, z, function0, function02, function03, function04, function05, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
