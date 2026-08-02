package com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components;

@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u001aU\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0001¢\u0006\u0002\u0010\f\u001a\u0015\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000fH\u0001¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0011\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0012¨\u0006\u0015"}, d2 = {"StartPaperlessStatementDeliveryBottomSheet", "", "onDismiss", "Lkotlin/Function0;", "onGetPaperlessStatementClick", "onRetryClick", "bottomSheetController", "Lcom/paypal/pds/components/BottomSheetController;", "mode", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/components/BottomSheetMode;", "errorMessage", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/paypal/pds/components/BottomSheetController;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/components/BottomSheetMode;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Landroidx/compose/runtime/Composer;II)V", "StartPaperlessPreviewContent", "isLoading", "", "(ZLandroidx/compose/runtime/Composer;I)V", "StartPaperlessStatementDeliveryBottomSheetPreview", "(Landroidx/compose/runtime/Composer;I)V", "StartPaperlessStatementDeliveryBottomSheetLoadingPreview", "StartPaperlessStatementDeliveryBottomSheetErrorPreview", "revolvingcredit-servicing_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class StartPaperlessStatementDeliveryBottomSheetKt {
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void StartPaperlessStatementDeliveryBottomSheet(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function0<kotlin.Unit> function03, final com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetMode bottomSheetMode, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2;
        androidx.compose.runtime.Composer composer2;
        final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString3;
        final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetMode bottomSheetMode2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1889727721);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function03) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changed(bottomSheetMode == null ? -1 : bottomSheetMode.ordinal()) ? 16384 : 8192;
        }
        int i5 = i2 & 32;
        if (i5 != 0) {
            i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((196608 & i) == 0) {
            uiString2 = uiString;
            i3 |= startRestartGroup.changed(uiString2) ? 131072 : 65536;
            if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                uiString3 = uiString2;
                bottomSheetMode2 = bottomSheetMode;
            } else {
                final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetMode bottomSheetMode3 = i4 != 0 ? com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetMode.NORMAL : bottomSheetMode;
                final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString4 = i5 != 0 ? null : uiString2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1889727721, i3, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.StartPaperlessStatementDeliveryBottomSheet (StartPaperlessStatementDeliveryBottomSheet.kt:41)");
                }
                com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString5 = uiString4;
                com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetMode bottomSheetMode4 = bottomSheetMode3;
                composer2 = startRestartGroup;
                com.paypal.pds.components.ModalKt.Modal(bottomSheetController, function0, new com.paypal.pds.components.TopNavConfig(null, false, null, 7, null), null, null, null, function0, false, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1185786288, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.StartPaperlessStatementDeliveryBottomSheetKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.StartPaperlessStatementDeliveryBottomSheetKt.m18495$r8$lambda$S5emxjQBwq7zLua4Zu3_wVU60M(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetMode.this, uiString4, function03, function02, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 817889280 | ((i3 >> 9) & 14) | ((i3 << 3) & 112) | (com.paypal.pds.components.TopNavConfig.$stable << 6) | ((i3 << 18) & 3670016), 312);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                bottomSheetMode2 = bottomSheetMode4;
                uiString3 = uiString5;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.StartPaperlessStatementDeliveryBottomSheetKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.StartPaperlessStatementDeliveryBottomSheetKt.$r8$lambda$n9mF_36Px5e4veUV828akT7S6iY(kotlin.jvm.functions.Function0.this, function02, function03, bottomSheetController, bottomSheetMode2, uiString3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        uiString2 = uiString;
        if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void StartPaperlessPreviewContent(final boolean z, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1269015393);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1269015393, i2, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.StartPaperlessPreviewContent (StartPaperlessStatementDeliveryBottomSheet.kt:74)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.StartPaperlessStatementDeliveryBottomSheetKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.StatementDeliveryBottomSheetCommonKt.StartPaperlessStatementDeliveryContent((kotlin.jvm.functions.Function0) rememberedValue, z, startRestartGroup, ((i2 << 3) & 112) | 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.StartPaperlessStatementDeliveryBottomSheetKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.StartPaperlessStatementDeliveryBottomSheetKt.$r8$lambda$uHSpgbEDLl2chClrvibxvTpWcjA(z, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$R2TVxn-5SLe5xD0LjicGhxpx5OM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18494$r8$lambda$R2TVxn5SLe5xD0LjicGhxpx5OM(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(211369477);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(211369477, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.StartPaperlessStatementDeliveryBottomSheetErrorPreview (StartPaperlessStatementDeliveryBottomSheet.kt:99)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly stringResOnly = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_statement_delivery_error_generic, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.StartPaperlessStatementDeliveryBottomSheetKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.StatementDeliveryBottomSheetCommonKt.StatementDeliveryErrorContent(stringResOnly, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.StartPaperlessStatementDeliveryBottomSheetKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.StartPaperlessStatementDeliveryBottomSheetKt.m18494$r8$lambda$R2TVxn5SLe5xD0LjicGhxpx5OM(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RGs6sRyg4s9v1LDwQWUgdlU9QhE(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1687586119);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1687586119, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.StartPaperlessStatementDeliveryBottomSheetLoadingPreview (StartPaperlessStatementDeliveryBottomSheet.kt:91)");
            }
            StartPaperlessPreviewContent(true, startRestartGroup, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.StartPaperlessStatementDeliveryBottomSheetKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.StartPaperlessStatementDeliveryBottomSheetKt.$r8$lambda$RGs6sRyg4s9v1LDwQWUgdlU9QhE(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$S5emxjQBwq7zLua4Zu-3_wVU60M, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18495$r8$lambda$S5emxjQBwq7zLua4Zu3_wVU60M(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetMode bottomSheetMode, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1185786288, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.StartPaperlessStatementDeliveryBottomSheet.<anonymous> (StartPaperlessStatementDeliveryBottomSheet.kt:49)");
            }
            int i2 = com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.StartPaperlessStatementDeliveryBottomSheetKt.WhenMappings.$EnumSwitchMapping$0[bottomSheetMode.ordinal()];
            if (i2 == 1) {
                composer.startReplaceGroup(-346629235);
                com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.StatementDeliveryBottomSheetCommonKt.StatementDeliveryErrorContent(uiString, function0, composer, 0);
                composer.endReplaceGroup();
            } else {
                if (i2 != 2 && i2 != 3) {
                    composer.startReplaceGroup(1374290364);
                    composer.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(-346348251);
                com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.StatementDeliveryBottomSheetCommonKt.StartPaperlessStatementDeliveryContent(function02, bottomSheetMode.isLoading(), composer, 0);
                composer.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$n9mF_36Px5e4veUV828akT7S6iY(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetMode bottomSheetMode, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        StartPaperlessStatementDeliveryBottomSheet(function0, function02, function03, bottomSheetController, bottomSheetMode, uiString, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rZXEptS099g01h99Kz_YN3umDAc(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-606754783);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-606754783, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.StartPaperlessStatementDeliveryBottomSheetPreview (StartPaperlessStatementDeliveryBottomSheet.kt:83)");
            }
            StartPaperlessPreviewContent(false, startRestartGroup, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.StartPaperlessStatementDeliveryBottomSheetKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.StartPaperlessStatementDeliveryBottomSheetKt.$r8$lambda$rZXEptS099g01h99Kz_YN3umDAc(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$uHSpgbEDLl2chClrvibxvTpWcjA(boolean z, int i, androidx.compose.runtime.Composer composer, int i2) {
        StartPaperlessPreviewContent(z, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetMode.values().length];
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetMode.ERROR.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetMode.NORMAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetMode.LOADING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
