package com.paypal.oslo.feature.wallet.cards.ui.components;

@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aR\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\rH\u0001¢\u0006\u0002\u0010\u000e\u001a\r\u0010\u000f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"AutoFocusModal", "", "bottomSheetController", "Lcom/paypal/pds/components/BottomSheetController;", "topNav", "Lcom/paypal/pds/components/TopNavConfig;", "onDismiss", "Lkotlin/Function0;", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "keyboardController", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "content", "Landroidx/compose/runtime/Composable;", "(Lcom/paypal/pds/components/BottomSheetController;Lcom/paypal/pds/components/TopNavConfig;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/focus/FocusRequester;Landroidx/compose/ui/platform/SoftwareKeyboardController;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "AutoFocusModalPreview", "(Landroidx/compose/runtime/Composer;I)V", "wallet_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AutoFocusModalKt {
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d4, code lost:
    
        if ((r29 & 16) != 0) goto L71;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AutoFocusModal(final com.paypal.pds.components.BottomSheetController bottomSheetController, final com.paypal.pds.components.TopNavConfig topNavConfig, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final androidx.compose.ui.focus.FocusRequester focusRequester, androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController2;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController3;
        int i4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(topNavConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(focusRequester, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1639986586);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? startRestartGroup.changed(topNavConfig) : startRestartGroup.changedInstance(topNavConfig) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(focusRequester) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                softwareKeyboardController2 = softwareKeyboardController;
                if (startRestartGroup.changed(softwareKeyboardController2)) {
                    i4 = 16384;
                    i3 |= i4;
                }
            } else {
                softwareKeyboardController2 = softwareKeyboardController;
            }
            i4 = 8192;
            i3 |= i4;
        } else {
            softwareKeyboardController2 = softwareKeyboardController;
        }
        if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 131072 : 65536;
        }
        boolean z = true;
        if (startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 16) != 0) {
                    softwareKeyboardController2 = (androidx.compose.ui.platform.SoftwareKeyboardController) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalSoftwareKeyboardController());
                    i3 &= -57345;
                }
                androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController4 = softwareKeyboardController2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1639986586, i3, -1, "com.paypal.oslo.feature.wallet.cards.ui.components.AutoFocusModal (AutoFocusModal.kt:59)");
                }
                boolean visible = bottomSheetController.getVisible();
                int i5 = i3 & 14;
                boolean z2 = i5 == 4 || ((i3 & 8) != 0 && startRestartGroup.changedInstance(bottomSheetController));
                boolean z3 = (i3 & 7168) == 2048;
                if ((((57344 & i3) ^ 24576) <= 16384 || !startRestartGroup.changed(softwareKeyboardController4)) && (i3 & 24576) != 16384) {
                    z = false;
                }
                com.paypal.oslo.feature.wallet.cards.ui.components.AutoFocusModalKt$AutoFocusModal$1$1 rememberedValue = startRestartGroup.rememberedValue();
                if ((z2 | z3 | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.oslo.feature.wallet.cards.ui.components.AutoFocusModalKt$AutoFocusModal$1$1(bottomSheetController, focusRequester, softwareKeyboardController4, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(visible), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 0);
                composer2 = startRestartGroup;
                com.paypal.pds.components.ModalKt.Modal(bottomSheetController, function0, topNavConfig, null, null, null, null, false, false, function2, composer2, com.paypal.pds.components.BottomSheetController.$stable | i5 | ((i3 >> 3) & 112) | (com.paypal.pds.components.TopNavConfig.$stable << 6) | ((i3 << 3) & 896) | ((i3 << 12) & 1879048192), 504);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                softwareKeyboardController3 = softwareKeyboardController4;
            } else {
                startRestartGroup.skipToGroupEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            softwareKeyboardController3 = softwareKeyboardController2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.cards.ui.components.AutoFocusModalKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.cards.ui.components.AutoFocusModalKt.m21099$r8$lambda$wsFkatBIxpUjfaAZ1z8ie8FUwU(com.paypal.pds.components.BottomSheetController.this, topNavConfig, function0, focusRequester, softwareKeyboardController3, function2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2mu6sxaT5znSpIxSt2uhDb7Gq28(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1926451163);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1926451163, updateChangedFlags, -1, "com.paypal.oslo.feature.wallet.cards.ui.components.AutoFocusModalPreview (AutoFocusModal.kt:81)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.pds.components.BottomSheetController();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.BottomSheetController bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue;
            com.paypal.pds.components.TopNavConfig topNavConfig = new com.paypal.pds.components.TopNavConfig("Enter card security code", false, null, 6, null);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.cards.ui.components.AutoFocusModalKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new androidx.compose.ui.focus.FocusRequester();
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            AutoFocusModal(bottomSheetController, topNavConfig, function0, (androidx.compose.ui.focus.FocusRequester) rememberedValue3, (androidx.compose.ui.platform.SoftwareKeyboardController) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalSoftwareKeyboardController()), com.paypal.oslo.feature.wallet.cards.ui.components.ComposableSingletons$AutoFocusModalKt.INSTANCE.getLambda$7054129$wallet_prodRelease(), startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 200064 | (com.paypal.pds.components.TopNavConfig.$stable << 3), 0);
            bottomSheetController.showSheet();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.cards.ui.components.AutoFocusModalKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.cards.ui.components.AutoFocusModalKt.$r8$lambda$2mu6sxaT5znSpIxSt2uhDb7Gq28(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$wsFka-tBIxpUjfaAZ1z8ie8FUwU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21099$r8$lambda$wsFkatBIxpUjfaAZ1z8ie8FUwU(com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.pds.components.TopNavConfig topNavConfig, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.focus.FocusRequester focusRequester, androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController, kotlin.jvm.functions.Function2 function2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AutoFocusModal(bottomSheetController, topNavConfig, function0, focusRequester, softwareKeyboardController, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
