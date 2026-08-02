package com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\b\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/pds/components/BottomSheetController;", "bottomSheetController", "Lkotlin/Function0;", "", "onDismiss", "CardDetailsErrorBottomSheet", "(Lcom/paypal/pds/components/BottomSheetController;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "p0", "getHighSpeedVideoFpsRanges", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CardDetailsErrorBottomSheetKt {
    public static final void CardDetailsErrorBottomSheet(final com.paypal.pds.components.BottomSheetController bottomSheetController, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(87111801);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(87111801, i2, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.CardDetailsErrorBottomSheet (CardDetailsErrorBottomSheet.kt:26)");
            }
            composer2 = startRestartGroup;
            com.paypal.pds.components.ModalKt.Modal(bottomSheetController, function0, null, null, null, null, function0, false, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1529706368, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.CardDetailsErrorBottomSheetKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.CardDetailsErrorBottomSheetKt.m18491$r8$lambda$Y9gwz2hrmsOWyUyeG47_eeOM7g(kotlin.jvm.functions.Function0.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 817889280 | (i2 & 14) | (i2 & 112) | ((i2 << 15) & 3670016), 316);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.CardDetailsErrorBottomSheetKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.CardDetailsErrorBottomSheetKt.m18489$r8$lambda$1AMY0oTOLpJIVbJvOwdcEXWNSk(com.paypal.pds.components.BottomSheetController.this, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRanges(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1508268740);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1508268740, i2, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.CardDetailsErrorBottomSheetContent (CardDetailsErrorBottomSheet.kt:38)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ErrorKt.Error(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ErrorUiModel(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_card_details_error_message, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_something_went_wrong_error_title, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_try_again, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, null, null, null, false, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, null), null, function0, startRestartGroup, (i2 << 6) & 896, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.CardDetailsErrorBottomSheetKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.CardDetailsErrorBottomSheetKt.m18490$r8$lambda$F_KFAp7xPr0zFok9xCSQaQ947I(kotlin.jvm.functions.Function0.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$1AMY0oTOLpJIVbJvOwdcE-XWNSk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18489$r8$lambda$1AMY0oTOLpJIVbJvOwdcEXWNSk(com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        CardDetailsErrorBottomSheet(bottomSheetController, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$F_KFAp7x-Pr0zFok9xCSQaQ947I, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18490$r8$lambda$F_KFAp7xPr0zFok9xCSQaQ947I(kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRanges(function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Y9-gwz2hrmsOWyUyeG47_eeOM7g, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18491$r8$lambda$Y9gwz2hrmsOWyUyeG47_eeOM7g(kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1529706368, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.CardDetailsErrorBottomSheet.<anonymous> (CardDetailsErrorBottomSheet.kt:33)");
            }
            getHighSpeedVideoFpsRanges(function0, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$c91Pt50gQiqrnEzWKN1zT-GO4zA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18492$r8$lambda$c91Pt50gQiqrnEzWKN1zTGO4zA(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(869918061);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(869918061, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.CardDetailsErrorBottomSheetPreview (CardDetailsErrorBottomSheet.kt:55)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.CardDetailsErrorBottomSheetKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            getHighSpeedVideoFpsRanges((kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.CardDetailsErrorBottomSheetKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.CardDetailsErrorBottomSheetKt.m18492$r8$lambda$c91Pt50gQiqrnEzWKN1zTGO4zA(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
