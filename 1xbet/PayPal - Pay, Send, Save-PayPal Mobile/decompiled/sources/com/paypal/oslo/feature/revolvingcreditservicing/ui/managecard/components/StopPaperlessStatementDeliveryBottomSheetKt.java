package com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components;

@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u001aq\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0001¢\u0006\u0002\u0010\u0011\u001a\u0015\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H\u0001¢\u0006\u0002\u0010\u0015\u001a\r\u0010\u0016\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0017\u001a\r\u0010\u0018\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0017\u001a\r\u0010\u0019\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0017\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"PreviewEsignUrl", "", "StopPaperlessStatementDeliveryBottomSheet", "", "onDismiss", "Lkotlin/Function0;", "onStopPaperlessStatementClick", "onRetryClick", "bottomSheetController", "Lcom/paypal/pds/components/BottomSheetController;", "eSignConsentUrl", "onESignConsentLinkClick", "Lkotlin/Function1;", "mode", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/components/BottomSheetMode;", "errorMessage", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/paypal/pds/components/BottomSheetController;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/components/BottomSheetMode;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Landroidx/compose/runtime/Composer;II)V", "StopPaperlessPreviewContent", "isLoading", "", "(ZLandroidx/compose/runtime/Composer;I)V", "StopPaperlessStatementDeliveryBottomSheetPreview", "(Landroidx/compose/runtime/Composer;I)V", "StopPaperlessStatementDeliveryBottomSheetLoadingPreview", "StopPaperlessStatementDeliveryBottomSheetErrorPreview", "revolvingcredit-servicing_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class StopPaperlessStatementDeliveryBottomSheetKt {
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void StopPaperlessStatementDeliveryBottomSheet(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function0<kotlin.Unit> function03, final com.paypal.pds.components.BottomSheetController bottomSheetController, final java.lang.String str, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetMode bottomSheetMode, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2;
        int i5;
        androidx.compose.runtime.Composer composer2;
        final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetMode bottomSheetMode2;
        final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-286822631);
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
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changed(str) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 131072 : 65536;
        }
        int i6 = i2 & 64;
        int i7 = 1572864;
        if (i6 == 0) {
            if ((1572864 & i) == 0) {
                i7 = startRestartGroup.changed(bottomSheetMode == null ? -1 : bottomSheetMode.ordinal()) ? 1048576 : 524288;
            }
            i4 = i2 & 128;
            if (i4 == 0) {
                i3 |= 12582912;
            } else if ((12582912 & i) == 0) {
                uiString2 = uiString;
                i3 |= startRestartGroup.changed(uiString2) ? 8388608 : 4194304;
                i5 = i3;
                if (!startRestartGroup.shouldExecute((4793491 & i5) != 4793490, i5 & 1)) {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    bottomSheetMode2 = bottomSheetMode;
                    uiString3 = uiString2;
                } else {
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetMode bottomSheetMode3 = i6 != 0 ? com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetMode.NORMAL : bottomSheetMode;
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString4 = i4 != 0 ? null : uiString2;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-286822631, i5, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.StopPaperlessStatementDeliveryBottomSheet (StopPaperlessStatementDeliveryBottomSheet.kt:47)");
                    }
                    final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetMode bottomSheetMode4 = bottomSheetMode3;
                    final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString5 = uiString4;
                    composer2 = startRestartGroup;
                    com.paypal.pds.components.ModalKt.Modal(bottomSheetController, function0, new com.paypal.pds.components.TopNavConfig(null, false, null, 7, null), null, null, null, function0, false, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-2068534432, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.StopPaperlessStatementDeliveryBottomSheetKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.StopPaperlessStatementDeliveryBottomSheetKt.m18502$r8$lambda$wfLI7kkGva1bmTUq4MJd1MyBJo(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetMode.this, uiString5, function03, function02, str, function1, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    }, startRestartGroup, 54), composer2, com.paypal.pds.components.BottomSheetController.$stable | 817889280 | ((i5 >> 9) & 14) | ((i5 << 3) & 112) | (com.paypal.pds.components.TopNavConfig.$stable << 6) | ((i5 << 18) & 3670016), 312);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    bottomSheetMode2 = bottomSheetMode3;
                    uiString3 = uiString4;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.StopPaperlessStatementDeliveryBottomSheetKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.StopPaperlessStatementDeliveryBottomSheetKt.$r8$lambda$wTQvknY62BB16SzM2H0vHudQtvQ(kotlin.jvm.functions.Function0.this, function02, function03, bottomSheetController, str, function1, bottomSheetMode2, uiString3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            uiString2 = uiString;
            i5 = i3;
            if (!startRestartGroup.shouldExecute((4793491 & i5) != 4793490, i5 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i3 |= i7;
        i4 = i2 & 128;
        if (i4 == 0) {
        }
        uiString2 = uiString;
        i5 = i3;
        if (!startRestartGroup.shouldExecute((4793491 & i5) != 4793490, i5 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void StopPaperlessPreviewContent(final boolean z, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-468811007);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-468811007, i2, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.StopPaperlessPreviewContent (StopPaperlessStatementDeliveryBottomSheet.kt:82)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.StopPaperlessStatementDeliveryBottomSheetKt$$ExternalSyntheticLambda1
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
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.StopPaperlessStatementDeliveryBottomSheetKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.StopPaperlessStatementDeliveryBottomSheetKt.m18501$r8$lambda$r7foFachGbDmTS75N_coHs2D5w((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.StatementDeliveryBottomSheetCommonKt.StopPaperlessStatementDeliveryContent(function0, "https://www.paypal.com/us/webapps/mpp/ua/esign-full", (kotlin.jvm.functions.Function1) rememberedValue2, z, startRestartGroup, ((i2 << 9) & 7168) | 438);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.StopPaperlessStatementDeliveryBottomSheetKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.StopPaperlessStatementDeliveryBottomSheetKt.$r8$lambda$mUoYcuGn6T1sTUnFSegCWLcDdYw(z, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5V3zvKhjDuS1AYo_cmQ16K4zPBU(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-110916287);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-110916287, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.StopPaperlessStatementDeliveryBottomSheetPreview (StopPaperlessStatementDeliveryBottomSheet.kt:93)");
            }
            StopPaperlessPreviewContent(false, startRestartGroup, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.StopPaperlessStatementDeliveryBottomSheetKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.StopPaperlessStatementDeliveryBottomSheetKt.$r8$lambda$5V3zvKhjDuS1AYo_cmQ16K4zPBU(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6BofDTPMMqx1nNkhWYCxmOYUsBI(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1602673691);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1602673691, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.StopPaperlessStatementDeliveryBottomSheetErrorPreview (StopPaperlessStatementDeliveryBottomSheet.kt:109)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly stringResOnly = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_statement_delivery_error_generic, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.StopPaperlessStatementDeliveryBottomSheetKt$$ExternalSyntheticLambda7
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
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.StopPaperlessStatementDeliveryBottomSheetKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.StopPaperlessStatementDeliveryBottomSheetKt.$r8$lambda$6BofDTPMMqx1nNkhWYCxmOYUsBI(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$lkmV9GrTDtXCJTfW43H-3fzGHf4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18500$r8$lambda$lkmV9GrTDtXCJTfW43H3fzGHf4(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1986936911);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1986936911, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.StopPaperlessStatementDeliveryBottomSheetLoadingPreview (StopPaperlessStatementDeliveryBottomSheet.kt:101)");
            }
            StopPaperlessPreviewContent(true, startRestartGroup, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.StopPaperlessStatementDeliveryBottomSheetKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.StopPaperlessStatementDeliveryBottomSheetKt.m18500$r8$lambda$lkmV9GrTDtXCJTfW43H3fzGHf4(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mUoYcuGn6T1sTUnFSegCWLcDdYw(boolean z, int i, androidx.compose.runtime.Composer composer, int i2) {
        StopPaperlessPreviewContent(z, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$r7foFachGbDmTS-75N_coHs2D5w, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18501$r8$lambda$r7foFachGbDmTS75N_coHs2D5w(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wTQvknY62BB16SzM2H0vHudQtvQ(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, com.paypal.pds.components.BottomSheetController bottomSheetController, java.lang.String str, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetMode bottomSheetMode, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        StopPaperlessStatementDeliveryBottomSheet(function0, function02, function03, bottomSheetController, str, function1, bottomSheetMode, uiString, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$wfLI7kkGva1bmT-Uq4MJd1MyBJo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18502$r8$lambda$wfLI7kkGva1bmTUq4MJd1MyBJo(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetMode bottomSheetMode, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, java.lang.String str, kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2068534432, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.StopPaperlessStatementDeliveryBottomSheet.<anonymous> (StopPaperlessStatementDeliveryBottomSheet.kt:55)");
            }
            int i2 = com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.StopPaperlessStatementDeliveryBottomSheetKt.WhenMappings.$EnumSwitchMapping$0[bottomSheetMode.ordinal()];
            if (i2 == 1) {
                composer.startReplaceGroup(481573853);
                com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.StatementDeliveryBottomSheetCommonKt.StatementDeliveryErrorContent(uiString, function0, composer, 0);
                composer.endReplaceGroup();
            } else {
                if (i2 != 2 && i2 != 3) {
                    composer.startReplaceGroup(708270067);
                    composer.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(481859022);
                com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.StatementDeliveryBottomSheetCommonKt.StopPaperlessStatementDeliveryContent(function02, str, function1, bottomSheetMode.isLoading(), composer, 0);
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
