package com.paypal.oslo.feature.packagetracking.ui.detail.components;

@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001aU\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\r\u001a\r\u0010\u000e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000f¨\u0006\u0010²\u0006\n\u0010\u0011\u001a\u00020\fX\u008a\u008e\u0002"}, d2 = {"PackageTrackingRenameBottomSheet", "", "nickname", "", "onNicknameChange", "Lkotlin/Function1;", "onDismiss", "Lkotlin/Function0;", "onSave", "bottomSheetController", "Lcom/paypal/pds/components/BottomSheetController;", "isLoading", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/paypal/pds/components/BottomSheetController;ZLandroidx/compose/runtime/Composer;I)V", "PackageTrackingRenameBottomSheetPreview", "(Landroidx/compose/runtime/Composer;I)V", "package-tracking_prodRelease", "showError"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PackageTrackingRenameBottomSheetKt {
    public static final void PackageTrackingRenameBottomSheet(final java.lang.String str, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final com.paypal.pds.components.BottomSheetController bottomSheetController, final boolean z, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1994267207);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (i & 32768) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changed(z) ? 131072 : 65536;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1994267207, i3, -1, "com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingRenameBottomSheet (PackageTrackingRenameBottomSheet.kt:69)");
            }
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_menu_rename, startRestartGroup, 0);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new androidx.compose.ui.focus.FocusRequester();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final androidx.compose.ui.focus.FocusRequester focusRequester = (androidx.compose.ui.focus.FocusRequester) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue2;
            final java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_package_detail_menu_rename_error_empty, startRestartGroup, 0);
            final androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController = (androidx.compose.ui.platform.SoftwareKeyboardController) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalSoftwareKeyboardController());
            if (bottomSheetController.getVisible()) {
                startRestartGroup.startReplaceGroup(-1067598207);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingRenameBottomSheetKt$PackageTrackingRenameBottomSheet$1$1(focusRequester, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 6);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1067511717);
                startRestartGroup.endReplaceGroup();
            }
            final android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
            boolean visible = bottomSheetController.getVisible();
            boolean changedInstance = startRestartGroup.changedInstance(context);
            boolean z2 = (i3 & 57344) == 16384 || ((32768 & i3) != 0 && startRestartGroup.changedInstance(bottomSheetController));
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if ((z2 | changedInstance) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingRenameBottomSheetKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingRenameBottomSheetKt.$r8$lambda$rYEOQoAPXmXoTpCIkn_XacZP4QA(context, bottomSheetController, (androidx.compose.runtime.DisposableEffectScope) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            androidx.compose.runtime.EffectsKt.DisposableEffect(java.lang.Boolean.valueOf(visible), (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue4, startRestartGroup, 0);
            com.paypal.pds.components.TopNavConfig topNavConfig = new com.paypal.pds.components.TopNavConfig(stringResource, false, null, 6, null);
            boolean changed = startRestartGroup.changed(softwareKeyboardController);
            int i4 = i3 & 896;
            boolean z3 = i4 == 256;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if ((changed | z3) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingRenameBottomSheetKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingRenameBottomSheetKt.$r8$lambda$y73ofayaiahRtiUDXGtZ2e_e3v4(androidx.compose.ui.platform.SoftwareKeyboardController.this, function0);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue5;
            boolean changed2 = startRestartGroup.changed(softwareKeyboardController);
            boolean z4 = i4 == 256;
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if ((changed2 | z4) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingRenameBottomSheetKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingRenameBottomSheetKt.$r8$lambda$ITNjHps4DtAfMe1O5aE4RLE_a10(androidx.compose.ui.platform.SoftwareKeyboardController.this, function0);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            composer2 = startRestartGroup;
            com.paypal.pds.components.ModalKt.Modal(bottomSheetController, function03, topNavConfig, null, null, null, (kotlin.jvm.functions.Function0) rememberedValue6, true, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1694793038, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingRenameBottomSheetKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingRenameBottomSheetKt.$r8$lambda$jPwglYbBzAT3M2bsCB0XljrdBhY(androidx.compose.ui.focus.FocusRequester.this, str, stringResource2, function1, softwareKeyboardController, function02, z, mutableState, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), composer2, com.paypal.pds.components.BottomSheetController.$stable | 817889280 | ((i3 >> 12) & 14) | (com.paypal.pds.components.TopNavConfig.$stable << 6), 312);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingRenameBottomSheetKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingRenameBottomSheetKt.$r8$lambda$lqvyLARn_qtGZMLBTpSv6JEv5Lk(str, function1, function0, function02, bottomSheetController, z, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0jdrOCI8QXhhy1n1B5pr3qbkqPM(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BMEmVmBvM2vR2zK6e4GIMlm7iSw(com.paypal.pds.components.BottomSheetController bottomSheetController) {
        bottomSheetController.hideSheet();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$FdaTa2_pLdwsXDH54WXkie9neuM(kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.MutableState mutableState, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        function1.invoke(str);
        if (!kotlin.text.StringsKt.isBlank(str)) {
            mutableState.setValue(java.lang.Boolean.FALSE);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ITNjHps4DtAfMe1O5aE4RLE_a10(androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController, kotlin.jvm.functions.Function0 function0) {
        if (softwareKeyboardController != null) {
            softwareKeyboardController.hide();
        }
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MjQaGbx6TBjoklkBgd0v5dBL5e8(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-401790185);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-401790185, updateChangedFlags, -1, "com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingRenameBottomSheetPreview (PackageTrackingRenameBottomSheet.kt:165)");
            }
            final com.paypal.pds.components.BottomSheetController bottomSheetController = new com.paypal.pds.components.BottomSheetController();
            bottomSheetController.showSheet();
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingRenameBottomSheetKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingRenameBottomSheetKt.$r8$lambda$0jdrOCI8QXhhy1n1B5pr3qbkqPM((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            boolean changedInstance = startRestartGroup.changedInstance(bottomSheetController);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingRenameBottomSheetKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingRenameBottomSheetKt.$r8$lambda$BMEmVmBvM2vR2zK6e4GIMlm7iSw(com.paypal.pds.components.BottomSheetController.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
            boolean changedInstance2 = startRestartGroup.changedInstance(bottomSheetController);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingRenameBottomSheetKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingRenameBottomSheetKt.$r8$lambda$m9K3PTJZUSgZoyJZU1jYys5gg6E(com.paypal.pds.components.BottomSheetController.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            PackageTrackingRenameBottomSheet("Nickname", function1, function0, (kotlin.jvm.functions.Function0) rememberedValue3, bottomSheetController, false, startRestartGroup, (com.paypal.pds.components.BottomSheetController.$stable << 12) | 196662);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingRenameBottomSheetKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingRenameBottomSheetKt.$r8$lambda$MjQaGbx6TBjoklkBgd0v5dBL5e8(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.pds.components.textinput.ValidationAlertData $r8$lambda$XvQLi5o_LEPhHpcJ8MyYA61tYJA(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return new com.paypal.pds.components.textinput.ValidationAlertData(str, com.paypal.pds.components.ContextualAlertStyle.Negative.INSTANCE, true, null, null, 24, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$jPwglYbBzAT3M2bsCB0XljrdBhY(androidx.compose.ui.focus.FocusRequester focusRequester, final java.lang.String str, final java.lang.String str2, final kotlin.jvm.functions.Function1 function1, final androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController, final kotlin.jvm.functions.Function0 function0, boolean z, final androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.Composer composer, int i) {
        java.util.List emptyList;
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1694793038, i, -1, "com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingRenameBottomSheet.<anonymous> (PackageTrackingRenameBottomSheet.kt:111)");
            }
            androidx.compose.ui.Modifier windowInsetsPadding = androidx.compose.foundation.layout.WindowInsetsPaddingKt.windowInsetsPadding(androidx.compose.foundation.layout.PaddingKt.m1709paddingqDBjuR0(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing8(), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing16()), androidx.compose.foundation.layout.WindowInsets_androidKt.getIme(androidx.compose.foundation.layout.WindowInsets.INSTANCE, composer, 6));
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, windowInsetsPadding);
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
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_package_detail_menu_rename_nickname, composer, 0);
            androidx.compose.ui.Modifier focusRequester2 = androidx.compose.ui.focus.FocusRequesterModifierKt.focusRequester(androidx.compose.ui.Modifier.INSTANCE, focusRequester);
            if (((java.lang.Boolean) mutableState.getValue()).booleanValue() && kotlin.text.StringsKt.isBlank(str)) {
                composer.startReplaceGroup(1300007093);
                com.paypal.pds.components.textinput.ValidationAlert.Companion companion = com.paypal.pds.components.textinput.ValidationAlert.INSTANCE;
                boolean changed = composer.changed(str2);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingRenameBottomSheetKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingRenameBottomSheetKt.$r8$lambda$XvQLi5o_LEPhHpcJ8MyYA61tYJA(str2, (java.lang.String) obj);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                emptyList = kotlin.collections.CollectionsKt.listOf(companion.invoke((kotlin.jvm.functions.Function1) rememberedValue));
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1300423299);
                composer.endReplaceGroup();
                emptyList = kotlin.collections.CollectionsKt.emptyList();
            }
            java.util.List list = emptyList;
            boolean changed2 = composer.changed(function1);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingRenameBottomSheetKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingRenameBottomSheetKt.$r8$lambda$FdaTa2_pLdwsXDH54WXkie9neuM(kotlin.jvm.functions.Function1.this, mutableState, (java.lang.String) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            com.paypal.pds.components.TextInputKt.TextInput(str, (kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>) rememberedValue2, focusRequester2, stringResource, (java.lang.String) null, (java.lang.String) null, false, false, (androidx.compose.foundation.text.KeyboardOptions) null, (kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit>) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, false, (com.paypal.pds.components.textinput.VisualTransformation) null, (androidx.compose.ui.autofill.ContentType) null, (java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert>) list, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, composer, 0, 0, 114672);
            java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_package_detail_menu_rename_save, composer, 0);
            com.paypal.pds.components.ButtonStyle.Primary primary = com.paypal.pds.components.ButtonStyle.Primary.INSTANCE;
            androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing32(), 0.0f, 0.0f, 13, null);
            boolean changed3 = composer.changed(str);
            boolean changed4 = composer.changed(softwareKeyboardController);
            boolean changed5 = composer.changed(function0);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if ((changed3 | changed4 | changed5) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingRenameBottomSheetKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingRenameBottomSheetKt.$r8$lambda$kDExFmDDeYiRFWwApDFVAeYi1ys(str, softwareKeyboardController, function0, mutableState);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue3, stringResource2, m1710paddingqDBjuR0$default, null, null, primary, null, false, z, composer, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$kDExFmDDeYiRFWwApDFVAeYi1ys(java.lang.String str, androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController, kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.MutableState mutableState) {
        if (!kotlin.text.StringsKt.isBlank(str)) {
            if (softwareKeyboardController != null) {
                softwareKeyboardController.hide();
            }
            function0.invoke();
        } else {
            mutableState.setValue(java.lang.Boolean.TRUE);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$lqvyLARn_qtGZMLBTpSv6JEv5Lk(java.lang.String str, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, com.paypal.pds.components.BottomSheetController bottomSheetController, boolean z, int i, androidx.compose.runtime.Composer composer, int i2) {
        PackageTrackingRenameBottomSheet(str, function1, function0, function02, bottomSheetController, z, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$m9K3PTJZUSgZoyJZU1jYys5gg6E(com.paypal.pds.components.BottomSheetController bottomSheetController) {
        bottomSheetController.hideSheet();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.runtime.DisposableEffectResult $r8$lambda$rYEOQoAPXmXoTpCIkn_XacZP4QA(android.content.Context context, final com.paypal.pds.components.BottomSheetController bottomSheetController, androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
        android.view.WindowManager.LayoutParams attributes;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disposableEffectScope, "");
        final java.lang.Integer num = null;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        final android.view.Window window = activity != null ? activity.getWindow() : null;
        if (window != null && (attributes = window.getAttributes()) != null) {
            num = java.lang.Integer.valueOf(attributes.softInputMode);
        }
        if (bottomSheetController.getVisible() && window != null) {
            window.setSoftInputMode(48);
        }
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingRenameBottomSheetKt$PackageTrackingRenameBottomSheet$lambda$5$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                java.lang.Integer num2;
                if (!com.paypal.pds.components.BottomSheetController.this.getVisible() || (num2 = num) == null) {
                    return;
                }
                window.setSoftInputMode(num2.intValue());
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$y73ofayaiahRtiUDXGtZ2e_e3v4(androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController, kotlin.jvm.functions.Function0 function0) {
        if (softwareKeyboardController != null) {
            softwareKeyboardController.hide();
        }
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }
}
