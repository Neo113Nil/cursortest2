package com.paypal.oslo.feature.packagetracking.ui.settings.components;

@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u001aE\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u0001¢\u0006\u0002\u0010\u000b\u001a\r\u0010\f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\r\u001a\r\u0010\u000e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\r¨\u0006\u000f²\u0006\n\u0010\u0010\u001a\u00020\u0003X\u008a\u008e\u0002"}, d2 = {"DeleteAllDataBottomSheet", "", "hasLinkedAccount", "", "bottomSheetController", "Lcom/paypal/pds/components/BottomSheetController;", "onConfirm", "Lkotlin/Function0;", "onDismiss", "resetKey", "", "(ZLcom/paypal/pds/components/BottomSheetController;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/Object;Landroidx/compose/runtime/Composer;II)V", "DeleteAllDataBottomSheetWithLinkedAccountPreview", "(Landroidx/compose/runtime/Composer;I)V", "DeleteAllDataBottomSheetWithoutLinkedAccountPreview", "package-tracking_prodRelease", "isLoading"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeleteAllDataBottomSheetKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DeleteAllDataBottomSheet(final boolean z, final com.paypal.pds.components.BottomSheetController bottomSheetController, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, java.lang.Object obj, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        java.lang.Object obj2;
        androidx.compose.runtime.Composer composer2;
        final java.lang.Object obj3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.String str;
        com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item deleteDataBottomSheetButton;
        com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component deleteDataBottomSheet;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1091298633);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            obj2 = obj;
            i3 |= startRestartGroup.changedInstance(obj2) ? 16384 : 8192;
            if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                obj3 = obj2;
            } else {
                java.lang.Object obj4 = i4 != 0 ? null : obj2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1091298633, i3, -1, "com.paypal.oslo.feature.packagetracking.ui.settings.components.DeleteAllDataBottomSheet (DeleteAllDataBottomSheet.kt:50)");
                }
                boolean changed = startRestartGroup.changed(obj4);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
                com.paypal.oslo.feature.packagetracking.ui.settings.components.DeleteAllDataContent linkedContent = z ? com.paypal.oslo.feature.packagetracking.ui.settings.components.DeleteAllDataContentKt.getLinkedContent() : com.paypal.oslo.feature.packagetracking.ui.settings.components.DeleteAllDataContentKt.getUnlinkedContent();
                com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext = com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.PackageSettingsContexts.INSTANCE.getUserIntentContext();
                java.lang.String str2 = "unlink_email";
                if (z) {
                    str = "unlink_email";
                } else {
                    str = com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.FeatureNames.DELETE_DATA;
                }
                if (!z) {
                    str2 = com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.ActionNames.DELETE_USER_DATA;
                }
                com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext copy$default = com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.copy$default(userIntentContext, null, str, str2, 1, null);
                com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext uiContext = com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.PackageSettingsContexts.INSTANCE.getUiContext();
                if (z) {
                    deleteDataBottomSheetButton = com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.Items.INSTANCE.getUnlinkAllAccountsBottomSheetButton();
                } else {
                    deleteDataBottomSheetButton = com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.Items.INSTANCE.getDeleteDataBottomSheetButton();
                }
                final com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ComponentClicked componentClicked = new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ComponentClicked(com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.copy$default(uiContext, null, null, null, deleteDataBottomSheetButton, 7, null), copy$default, null, 4, null);
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(linkedContent.getTitleRes(), startRestartGroup, 0);
                java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(linkedContent.getDescriptionRes(), startRestartGroup, 0);
                java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(linkedContent.getConfirmButtonRes(), startRestartGroup, 0);
                java.lang.String stringResource4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_action_cancel, startRestartGroup, 0);
                boolean changed2 = startRestartGroup.changed(mutableState);
                boolean changedInstance = startRestartGroup.changedInstance(componentClicked);
                boolean z2 = (i3 & 896) == 256;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if ((changed2 | changedInstance | z2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.packagetracking.ui.settings.components.DeleteAllDataBottomSheetKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.packagetracking.ui.settings.components.DeleteAllDataBottomSheetKt.m17618$r8$lambda$kgNyLjVuYu_fUH3eXK68Ngib9g(com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ComponentClicked.this, function0, mutableState);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue2;
                boolean changed3 = startRestartGroup.changed(mutableState);
                boolean z3 = (i3 & 112) == 32 || ((i3 & 64) != 0 && startRestartGroup.changedInstance(bottomSheetController));
                java.lang.Object obj5 = obj4;
                boolean z4 = (i3 & 7168) == 2048;
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if ((changed3 | z3 | z4) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.packagetracking.ui.settings.components.DeleteAllDataBottomSheetKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.packagetracking.ui.settings.components.DeleteAllDataBottomSheetKt.m17614$r8$lambda$LeiWUlgRkaFirPxPr85xImUOy8(com.paypal.pds.components.BottomSheetController.this, function02, mutableState);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                kotlin.jvm.functions.Function0 function04 = (kotlin.jvm.functions.Function0) rememberedValue3;
                com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics pTAnalytics = com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.INSTANCE;
                androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[]{com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.PackageSettingsContexts.INSTANCE.getUiContext(), copy$default});
                if (z) {
                    deleteDataBottomSheet = com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.Components.INSTANCE.getUnlinkAllAccountsBottomSheet();
                } else {
                    deleteDataBottomSheet = com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.Components.INSTANCE.getDeleteDataBottomSheet();
                }
                composer2 = startRestartGroup;
                com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingConfirmationBottomSheetKt.PackageTrackingConfirmationBottomSheet(bottomSheetController, stringResource, stringResource2, stringResource3, stringResource4, function03, function04, com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.analytics$default(pTAnalytics, companion, null, listOf, deleteDataBottomSheet, 1, null), ((java.lang.Boolean) mutableState.getValue()).booleanValue(), startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | ((i3 >> 3) & 14), 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                obj3 = obj5;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.packagetracking.ui.settings.components.DeleteAllDataBottomSheetKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj6, java.lang.Object obj7) {
                        return com.paypal.oslo.feature.packagetracking.ui.settings.components.DeleteAllDataBottomSheetKt.m17615$r8$lambda$eGSLm6m8cZqOvNA4JlebW26pnk(z, bottomSheetController, function0, function02, obj3, i, i2, (androidx.compose.runtime.Composer) obj6, ((java.lang.Integer) obj7).intValue());
                    }
                });
                return;
            }
            return;
        }
        obj2 = obj;
        if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$Bd4Hp_-2vbTUUPOhvdfB6E8zeqs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17613$r8$lambda$Bd4Hp_2vbTUUPOhvdfB6E8zeqs(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1812009769);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1812009769, updateChangedFlags, -1, "com.paypal.oslo.feature.packagetracking.ui.settings.components.DeleteAllDataBottomSheetWithLinkedAccountPreview (DeleteAllDataBottomSheet.kt:112)");
            }
            com.paypal.pds.components.BottomSheetController bottomSheetController = new com.paypal.pds.components.BottomSheetController();
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.packagetracking.ui.settings.components.DeleteAllDataBottomSheetKt$$ExternalSyntheticLambda6
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
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.packagetracking.ui.settings.components.DeleteAllDataBottomSheetKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            DeleteAllDataBottomSheet(true, bottomSheetController, function0, (kotlin.jvm.functions.Function0) rememberedValue2, null, startRestartGroup, (com.paypal.pds.components.BottomSheetController.$stable << 3) | 3462, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.packagetracking.ui.settings.components.DeleteAllDataBottomSheetKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.packagetracking.ui.settings.components.DeleteAllDataBottomSheetKt.m17613$r8$lambda$Bd4Hp_2vbTUUPOhvdfB6E8zeqs(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Le-iWUlgRkaFirPxPr85xImUOy8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17614$r8$lambda$LeiWUlgRkaFirPxPr85xImUOy8(com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.FALSE);
        bottomSheetController.hideSheet();
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$eGSLm6m8cZq-OvNA4JlebW26pnk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17615$r8$lambda$eGSLm6m8cZqOvNA4JlebW26pnk(boolean z, com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, java.lang.Object obj, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        DeleteAllDataBottomSheet(z, bottomSheetController, function0, function02, obj, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$g8R6-euvhpZbX4-buNnm8gnrwNE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17616$r8$lambda$g8R6euvhpZbX4buNnm8gnrwNE(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1046626905);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1046626905, updateChangedFlags, -1, "com.paypal.oslo.feature.packagetracking.ui.settings.components.DeleteAllDataBottomSheetWithoutLinkedAccountPreview (DeleteAllDataBottomSheet.kt:128)");
            }
            com.paypal.pds.components.BottomSheetController bottomSheetController = new com.paypal.pds.components.BottomSheetController();
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.packagetracking.ui.settings.components.DeleteAllDataBottomSheetKt$$ExternalSyntheticLambda3
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
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.packagetracking.ui.settings.components.DeleteAllDataBottomSheetKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            DeleteAllDataBottomSheet(false, bottomSheetController, function0, (kotlin.jvm.functions.Function0) rememberedValue2, null, startRestartGroup, (com.paypal.pds.components.BottomSheetController.$stable << 3) | 3462, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.packagetracking.ui.settings.components.DeleteAllDataBottomSheetKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.packagetracking.ui.settings.components.DeleteAllDataBottomSheetKt.m17616$r8$lambda$g8R6euvhpZbX4buNnm8gnrwNE(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$kgNyLjVuYu_fUH3eXK-68Ngib9g, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17618$r8$lambda$kgNyLjVuYu_fUH3eXK68Ngib9g(com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ComponentClicked componentClicked, kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.TRUE);
        componentClicked.track(com.paypal.oslo.feature.packagetracking.AnalyticsTrackerKt.analyticsTracker);
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }
}
