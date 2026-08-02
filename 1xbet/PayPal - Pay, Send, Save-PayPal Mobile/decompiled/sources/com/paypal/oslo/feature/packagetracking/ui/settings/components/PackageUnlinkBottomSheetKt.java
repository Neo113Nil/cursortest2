package com.paypal.oslo.feature.packagetracking.ui.settings.components;

@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\u001ad\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0013¨\u0006\u0015²\u0006\n\u0010\u0016\u001a\u00020\bX\u008a\u008e\u0002²\u0006\n\u0010\u0017\u001a\u00020\bX\u008a\u008e\u0002"}, d2 = {"PackageUnlinkBottomSheet", "", "emailProvider", "", "bottomSheetController", "Lcom/paypal/pds/components/BottomSheetController;", "onConfirm", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "deleteImportedData", "onDismiss", "Lkotlin/Function0;", "resetKey", "", "showDeleteDataCheckbox", "(Ljava/lang/String;Lcom/paypal/pds/components/BottomSheetController;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Ljava/lang/Object;ZLandroidx/compose/runtime/Composer;II)V", "PackageSettingsUnlinkModalPreview", "(Landroidx/compose/runtime/Composer;I)V", "PackageSettingsUnlinkModalWithCheckboxPreview", "package-tracking_prodRelease", "isLoading", "deleteImportedDataChecked"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PackageUnlinkBottomSheetKt {
    /* JADX WARN: Removed duplicated region for block: B:37:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PackageUnlinkBottomSheet(final java.lang.String str, final com.paypal.pds.components.BottomSheetController bottomSheetController, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, java.lang.Object obj, boolean z, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        java.lang.Object obj2;
        int i4;
        boolean z2;
        int i5;
        androidx.compose.runtime.Composer composer2;
        final java.lang.Object obj3;
        final boolean z3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1034286907);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            obj2 = obj;
            i3 |= startRestartGroup.changedInstance(obj2) ? 16384 : 8192;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                i5 = i3;
                if (!startRestartGroup.shouldExecute((74899 & i5) != 74898, i5 & 1)) {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    obj3 = obj2;
                    z3 = z2;
                } else {
                    if (i6 != 0) {
                        obj2 = null;
                    }
                    boolean z4 = i4 != 0 ? false : z2;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1034286907, i5, -1, "com.paypal.oslo.feature.packagetracking.ui.settings.components.PackageUnlinkBottomSheet (PackageUnlinkBottomSheet.kt:51)");
                    }
                    final com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ComponentClicked componentClicked = new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ComponentClicked(com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.copy$default(com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.PackageSettingsContexts.INSTANCE.getUiContext(), null, null, null, com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.Items.INSTANCE.getUnlinkEmailBottomSheetButton(), 7, null), com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.copy$default(com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.PackageSettingsContexts.INSTANCE.getUserIntentContext(), null, "unlink_email", "unlink_email", 1, null), null, 4, null);
                    boolean changed = startRestartGroup.changed(obj2);
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
                    boolean changed2 = startRestartGroup.changed(obj2);
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    final androidx.compose.runtime.MutableState mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue2;
                    com.paypal.pds.components.TopNavConfig topNavConfig = new com.paypal.pds.components.TopNavConfig("", false, null, 6, null);
                    java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_settings_account_unlink_title, new java.lang.Object[]{str}, startRestartGroup, 0);
                    java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_settings_account_unlink_description, startRestartGroup, 0);
                    boolean changed3 = startRestartGroup.changed(mutableState);
                    boolean z5 = (i5 & 112) == 32 || ((i5 & 64) != 0 && startRestartGroup.changedInstance(bottomSheetController));
                    boolean z6 = (i5 & 7168) == 2048;
                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if ((changed3 | z5 | z6) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.packagetracking.ui.settings.components.PackageUnlinkBottomSheetKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.packagetracking.ui.settings.components.PackageUnlinkBottomSheetKt.$r8$lambda$YlTo5tMU8SKS723PSu5KSf6iRLk(com.paypal.pds.components.BottomSheetController.this, function0, mutableState);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    final boolean z7 = z4;
                    java.lang.Object obj4 = obj2;
                    composer2 = startRestartGroup;
                    com.paypal.pds.components.ModalKt.Modal(bottomSheetController, function0, topNavConfig, null, stringResource, stringResource2, (kotlin.jvm.functions.Function0) rememberedValue3, false, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1031473844, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.packagetracking.ui.settings.components.PackageUnlinkBottomSheetKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj5, java.lang.Object obj6) {
                            return com.paypal.oslo.feature.packagetracking.ui.settings.components.PackageUnlinkBottomSheetKt.$r8$lambda$ARfP7AsxVEcAnYBCHlX8nZ0b74o(z7, str, mutableState2, mutableState, componentClicked, function1, bottomSheetController, function0, (androidx.compose.runtime.Composer) obj5, ((java.lang.Integer) obj6).intValue());
                        }
                    }, startRestartGroup, 54), composer2, com.paypal.pds.components.BottomSheetController.$stable | 805306368 | ((i5 >> 3) & 14) | ((i5 >> 6) & 112) | (com.paypal.pds.components.TopNavConfig.$stable << 6), my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    z3 = z4;
                    obj3 = obj4;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.packagetracking.ui.settings.components.PackageUnlinkBottomSheetKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj5, java.lang.Object obj6) {
                            return com.paypal.oslo.feature.packagetracking.ui.settings.components.PackageUnlinkBottomSheetKt.$r8$lambda$vYhcFl7QHU77ffSvE5HakQ3GWK4(str, bottomSheetController, function1, function0, obj3, z3, i, i2, (androidx.compose.runtime.Composer) obj5, ((java.lang.Integer) obj6).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            z2 = z;
            i5 = i3;
            if (!startRestartGroup.shouldExecute((74899 & i5) != 74898, i5 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        obj2 = obj;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i3;
        if (!startRestartGroup.shouldExecute((74899 & i5) != 74898, i5 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void PackageSettingsUnlinkModalPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(319904463);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(319904463, i, -1, "com.paypal.oslo.feature.packagetracking.ui.settings.components.PackageSettingsUnlinkModalPreview (PackageUnlinkBottomSheet.kt:149)");
            }
            com.paypal.pds.components.BottomSheetController bottomSheetController = new com.paypal.pds.components.BottomSheetController();
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.packagetracking.ui.settings.components.PackageUnlinkBottomSheetKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit unit;
                        ((java.lang.Boolean) obj).booleanValue();
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.packagetracking.ui.settings.components.PackageUnlinkBottomSheetKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            PackageUnlinkBottomSheet("Gmail", bottomSheetController, function1, (kotlin.jvm.functions.Function0) rememberedValue2, null, false, startRestartGroup, (com.paypal.pds.components.BottomSheetController.$stable << 3) | 3462, 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.packagetracking.ui.settings.components.PackageUnlinkBottomSheetKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.packagetracking.ui.settings.components.PackageUnlinkBottomSheetKt.$r8$lambda$pDyKsuQNqxBwJNkvTo1temwd3GU(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PackageSettingsUnlinkModalWithCheckboxPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1086060122);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1086060122, i, -1, "com.paypal.oslo.feature.packagetracking.ui.settings.components.PackageSettingsUnlinkModalWithCheckboxPreview (PackageUnlinkBottomSheet.kt:165)");
            }
            com.paypal.pds.components.BottomSheetController bottomSheetController = new com.paypal.pds.components.BottomSheetController();
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.packagetracking.ui.settings.components.PackageUnlinkBottomSheetKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit unit;
                        ((java.lang.Boolean) obj).booleanValue();
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.packagetracking.ui.settings.components.PackageUnlinkBottomSheetKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            PackageUnlinkBottomSheet("Gmail", bottomSheetController, function1, (kotlin.jvm.functions.Function0) rememberedValue2, null, true, startRestartGroup, (com.paypal.pds.components.BottomSheetController.$stable << 3) | 200070, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.packagetracking.ui.settings.components.PackageUnlinkBottomSheetKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.packagetracking.ui.settings.components.PackageUnlinkBottomSheetKt.m17626$r8$lambda$eBkL9rvJvIAhBtxVgEYEAj1KUo(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$A8KMyXpCS85M5crz0nfD41t-xKg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17623$r8$lambda$A8KMyXpCS85M5crz0nfD41txKg(com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.FALSE);
        bottomSheetController.hideSheet();
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$ARfP7AsxVEcAnYBCHlX8nZ0b74o(boolean z, java.lang.String str, final androidx.compose.runtime.MutableState mutableState, final androidx.compose.runtime.MutableState mutableState2, final com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ComponentClicked componentClicked, final kotlin.jvm.functions.Function1 function1, final com.paypal.pds.components.BottomSheetController bottomSheetController, final kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        androidx.compose.runtime.Composer composer2;
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1031473844, i, -1, "com.paypal.oslo.feature.packagetracking.ui.settings.components.PackageUnlinkBottomSheet.<anonymous> (PackageUnlinkBottomSheet.kt:79)");
            }
            androidx.compose.ui.Modifier analytics$default = com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.analytics$default(com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.INSTANCE, androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing16()), null, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[]{com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.PackageSettingsContexts.INSTANCE.getUiContext(), com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.copy$default(com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.PackageSettingsContexts.INSTANCE.getUserIntentContext(), null, "unlink_email", "unlink_email", 1, null)}), com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.Components.INSTANCE.getUnlinkEmailBottomSheet(), 1, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing12()), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, analytics$default);
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
            if (z) {
                composer.startReplaceGroup(-2096321069);
                boolean booleanValue = ((java.lang.Boolean) mutableState.getValue()).booleanValue();
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_settings_account_unlink_checkbox_title, new java.lang.Object[]{str}, composer, 0);
                java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_settings_account_unlink_checkbox_subtitle, composer, 0);
                androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                boolean changed = composer.changed(mutableState);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.packagetracking.ui.settings.components.PackageUnlinkBottomSheetKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.packagetracking.ui.settings.components.PackageUnlinkBottomSheetKt.m17625$r8$lambda$Ds0bM7phNvsCNkkvRiUHMv95ho(androidx.compose.runtime.MutableState.this, ((java.lang.Boolean) obj).booleanValue());
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                com.paypal.pds.components.CheckboxKt.Checkbox(booleanValue, stringResource, (kotlin.jvm.functions.Function1) rememberedValue, fillMaxWidth$default, false, stringResource2, null, null, composer, 3072, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOME_VALUE);
                composer.endReplaceGroup();
                composer2 = composer;
            } else {
                composer2 = composer;
                composer2.startReplaceGroup(-2095741152);
                composer.endReplaceGroup();
            }
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.oslo.feature.packagetracking.ui.PTUiConstants.BUTTON_TAG_CONFIRM);
            java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_settings_account_unlink_button_confirmation, new java.lang.Object[]{str}, composer2, 0);
            androidx.compose.runtime.MutableState mutableState3 = mutableState2;
            boolean booleanValue2 = ((java.lang.Boolean) mutableState3.getValue()).booleanValue();
            boolean booleanValue3 = ((java.lang.Boolean) mutableState3.getValue()).booleanValue();
            boolean changed2 = composer2.changed(mutableState2);
            boolean changedInstance = composer2.changedInstance(componentClicked);
            boolean changed3 = composer2.changed(function1);
            boolean changed4 = composer2.changed(mutableState);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if ((changed2 | changedInstance | changed3 | changed4) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.packagetracking.ui.settings.components.PackageUnlinkBottomSheetKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.packagetracking.ui.settings.components.PackageUnlinkBottomSheetKt.$r8$lambda$nOgAPt0DqhUkiIUsxqZd_UITXRg(com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ComponentClicked.this, function1, mutableState2, mutableState);
                    }
                };
                composer2.updateRememberedValue(rememberedValue2);
            }
            com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue2, stringResource3, testTag, null, null, null, null, !booleanValue3, booleanValue2, composer, 384, 120);
            androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.oslo.feature.packagetracking.ui.PTUiConstants.BUTTON_TAG_CANCEL);
            java.lang.String stringResource4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_action_cancel, composer, 0);
            com.paypal.pds.components.ButtonStyle.Secondary secondary = com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE;
            boolean booleanValue4 = ((java.lang.Boolean) mutableState3.getValue()).booleanValue();
            boolean changed5 = composer.changed(mutableState2);
            boolean changedInstance2 = composer.changedInstance(bottomSheetController);
            boolean changed6 = composer.changed(function0);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if ((changed5 | changedInstance2 | changed6) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.packagetracking.ui.settings.components.PackageUnlinkBottomSheetKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.packagetracking.ui.settings.components.PackageUnlinkBottomSheetKt.m17623$r8$lambda$A8KMyXpCS85M5crz0nfD41txKg(com.paypal.pds.components.BottomSheetController.this, function0, mutableState2);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue3, stringResource4, testTag2, null, null, secondary, null, !booleanValue4, false, composer, 196992, my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_HKD);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Ds0bM7phNv-sCNkkvRiUHMv95ho, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17625$r8$lambda$Ds0bM7phNvsCNkkvRiUHMv95ho(androidx.compose.runtime.MutableState mutableState, boolean z) {
        mutableState.setValue(java.lang.Boolean.valueOf(z));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YlTo5tMU8SKS723PSu5KSf6iRLk(com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.FALSE);
        bottomSheetController.hideSheet();
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$eBkL9rv-JvIAhBtxVgEYEAj1KUo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17626$r8$lambda$eBkL9rvJvIAhBtxVgEYEAj1KUo(int i, androidx.compose.runtime.Composer composer, int i2) {
        PackageSettingsUnlinkModalWithCheckboxPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$nOgAPt0DqhUkiIUsxqZd_UITXRg(com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ComponentClicked componentClicked, kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.MutableState mutableState2) {
        mutableState.setValue(java.lang.Boolean.TRUE);
        componentClicked.track(com.paypal.oslo.feature.packagetracking.AnalyticsTrackerKt.analyticsTracker);
        function1.invoke(java.lang.Boolean.valueOf(((java.lang.Boolean) mutableState2.getValue()).booleanValue()));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pDyKsuQNqxBwJNkvTo1temwd3GU(int i, androidx.compose.runtime.Composer composer, int i2) {
        PackageSettingsUnlinkModalPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vYhcFl7QHU77ffSvE5HakQ3GWK4(java.lang.String str, com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, java.lang.Object obj, boolean z, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PackageUnlinkBottomSheet(str, bottomSheetController, function1, function0, obj, z, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
