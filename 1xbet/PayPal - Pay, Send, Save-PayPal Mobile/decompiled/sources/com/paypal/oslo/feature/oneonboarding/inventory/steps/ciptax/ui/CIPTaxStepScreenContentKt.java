package com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.ui;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001aj\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u000e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00070\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00070\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013H\u0002\u001a[\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00070\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aH\u0001¢\u0006\u0002\u0010\u001c\u001a\r\u0010\u001d\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u001e¨\u0006\u001f²\u0006\n\u0010\n\u001a\u00020\u0001X\u008a\u008e\u0002²\u0006\n\u0010\u000b\u001a\u00020\u0003X\u008a\u008e\u0002²\u0006\n\u0010 \u001a\u00020!X\u008a\u008e\u0002²\u0006\f\u0010\"\u001a\u0004\u0018\u00010\u0001X\u008a\u008e\u0002²\u0006\n\u0010#\u001a\u00020!X\u008a\u008e\u0002"}, d2 = {"getRequiredErrorMessage", "", "type", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/taxpayer/domain/TaxpayerIdType;", "validationMessages", "Lcom/paypal/oslo/feature/oneonboarding/validators/ui/CIPValidationMessages;", "handleSubmitClick", "", "taxViewComponentConfig", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/taxpayer/domain/TaxpayerIdViewComponentConfig;", "taxpayerIdValue", "taxpayerIdType", "intentId", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "onErrorUpdate", "Lkotlin/Function1;", "onSubmit", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/CollectedItem;", "onStepForward", "Lkotlin/Function0;", "CIPTaxStepScreenContent", "stepComponentConfig", "Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/ciptax/domain/CIPTaxInfoStepComponentConfig;", "modifier", "Landroidx/compose/ui/Modifier;", "contextualInfo", "", "Lcom/paypal/oslo/feature/oneonboarding/domain/ContextualInfo;", "(Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/ciptax/domain/CIPTaxInfoStepComponentConfig;Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Ljava/util/List;Landroidx/compose/runtime/Composer;II)V", "CIPTaxStepScreenContentPreview", "(Landroidx/compose/runtime/Composer;I)V", "one-onboarding_prodRelease", "previousBottomSheetVisible", "", "taxpayerIdError", "isBannerVisible"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CIPTaxStepScreenContentKt {
    private static final java.lang.String getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType taxpayerIdType, com.paypal.oslo.feature.oneonboarding.validators.ui.CIPValidationMessages cIPValidationMessages) {
        int i = com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.ui.CIPTaxStepScreenContentKt.WhenMappings.$EnumSwitchMapping$0[taxpayerIdType.ordinal()];
        if (i == 1 || i == 2) {
            return cIPValidationMessages.getTaxpayerIdRequiredSsn();
        }
        if (i == 3 || i == 4) {
            return cIPValidationMessages.getTaxpayerIdRequiredItin();
        }
        if (i != 5) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return cIPValidationMessages.getTaxpayerIdRequiredSsn();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0688  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x076c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0782  */
    /* JADX WARN: Removed duplicated region for block: B:168:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x068b  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0681  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0774  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CIPTaxStepScreenContent(final com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.domain.CIPTaxInfoStepComponentConfig cIPTaxInfoStepComponentConfig, final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo> list, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier2;
        final java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo> list2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdViewComponentConfig taxpayerIdViewComponentConfig;
        com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdOption taxpayerIdOption;
        androidx.compose.runtime.SnapshotMutationPolicy snapshotMutationPolicy;
        com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.ui.CIPTaxStepScreenContentKt$CIPTaxStepScreenContent$2$1 cIPTaxStepScreenContentKt$CIPTaxStepScreenContent$2$1;
        androidx.compose.runtime.MutableState mutableState;
        java.lang.Object obj;
        java.lang.Object rememberedValue;
        final androidx.compose.runtime.MutableState mutableState2;
        androidx.compose.runtime.MutableState mutableState3;
        com.paypal.pds.components.BottomSheetController bottomSheetController;
        com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdViewComponentConfig taxpayerIdViewComponentConfig2;
        androidx.compose.runtime.MutableState mutableState4;
        androidx.compose.runtime.MutableState mutableState5;
        int i5;
        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance;
        int i6;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance;
        com.paypal.oslo.feature.oneonboarding.validators.ui.CIPValidationMessages cIPValidationMessages;
        boolean changedInstance;
        boolean changedInstance2;
        boolean changed;
        boolean changedInstance3;
        int i7;
        int i8;
        int i9;
        java.lang.Object rememberedValue2;
        int i10;
        boolean changedInstance4;
        java.lang.Object rememberedValue3;
        boolean changed2;
        java.lang.Object rememberedValue4;
        com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType taxpayerIdType;
        java.util.List<com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdOption> options;
        java.lang.Object obj2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cIPTaxInfoStepComponentConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2000798379);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(cIPTaxInfoStepComponentConfig) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(intentId) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        int i11 = i2 & 16;
        if (i11 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 16384 : 8192;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i) == 0) {
                i3 |= startRestartGroup.changedInstance(list) ? 131072 : 65536;
                if (!startRestartGroup.shouldExecute((i3 & 74899) != 74898, i3 & 1)) {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    modifier2 = modifier;
                    list2 = list;
                } else {
                    androidx.compose.ui.Modifier modifier4 = i11 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                    final java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo> list3 = i4 != 0 ? null : list;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(2000798379, i3, -1, "com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.ui.CIPTaxStepScreenContent (CIPTaxStepScreenContent.kt:186)");
                    }
                    java.util.Iterator<T> it = cIPTaxInfoStepComponentConfig.getViewComponents().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            taxpayerIdViewComponentConfig = null;
                            break;
                        }
                        com.paypal.oslo.feature.oneonboarding.domain.ViewComponentConfig viewComponentConfig = (com.paypal.oslo.feature.oneonboarding.domain.ViewComponentConfig) it.next();
                        if (!(viewComponentConfig instanceof com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdViewComponentConfig)) {
                            viewComponentConfig = null;
                        }
                        taxpayerIdViewComponentConfig = (com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdViewComponentConfig) viewComponentConfig;
                        if (taxpayerIdViewComponentConfig != null) {
                            break;
                        }
                    }
                    com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdViewComponentConfig taxpayerIdViewComponentConfig3 = taxpayerIdViewComponentConfig;
                    if (taxpayerIdViewComponentConfig3 == null || (options = taxpayerIdViewComponentConfig3.getOptions()) == null) {
                        taxpayerIdOption = null;
                    } else {
                        java.util.Iterator<T> it2 = options.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj2 = null;
                                break;
                            } else {
                                obj2 = it2.next();
                                if (((com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdOption) obj2).getTaxId() != null) {
                                    break;
                                }
                            }
                        }
                        taxpayerIdOption = (com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdOption) obj2;
                    }
                    java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                    if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        java.lang.String taxId = taxpayerIdOption != null ? taxpayerIdOption.getTaxId() : null;
                        rememberedValue5 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(taxId != null ? taxId : "", null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    }
                    final androidx.compose.runtime.MutableState mutableState6 = (androidx.compose.runtime.MutableState) rememberedValue5;
                    java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                    if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        if (taxpayerIdOption == null || (taxpayerIdType = taxpayerIdOption.getType()) == null) {
                            taxpayerIdType = com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType.SSN;
                        }
                        rememberedValue6 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(taxpayerIdType, null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue6);
                    }
                    androidx.compose.runtime.MutableState mutableState7 = (androidx.compose.runtime.MutableState) rememberedValue6;
                    com.paypal.pds.components.DropdownState rememberDropdownState = com.paypal.pds.components.DropdownKt.rememberDropdownState(startRestartGroup, 0);
                    java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
                    if (rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue7 = new com.paypal.pds.components.BottomSheetController();
                        startRestartGroup.updateRememberedValue(rememberedValue7);
                    }
                    final com.paypal.pds.components.BottomSheetController bottomSheetController2 = (com.paypal.pds.components.BottomSheetController) rememberedValue7;
                    java.lang.Object rememberedValue8 = startRestartGroup.rememberedValue();
                    if (rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue8 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.valueOf(bottomSheetController2.getVisible()), null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue8);
                    }
                    androidx.compose.runtime.MutableState mutableState8 = (androidx.compose.runtime.MutableState) rememberedValue8;
                    final androidx.compose.ui.focus.FocusManager focusManager = (androidx.compose.ui.focus.FocusManager) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalFocusManager());
                    java.lang.Object rememberedValue9 = startRestartGroup.rememberedValue();
                    if (rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue9 = new androidx.compose.ui.focus.FocusRequester();
                        startRestartGroup.updateRememberedValue(rememberedValue9);
                    }
                    androidx.compose.ui.focus.FocusRequester focusRequester = (androidx.compose.ui.focus.FocusRequester) rememberedValue9;
                    java.lang.Object rememberedValue10 = startRestartGroup.rememberedValue();
                    if (rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue10 = new androidx.compose.ui.focus.FocusRequester();
                        startRestartGroup.updateRememberedValue(rememberedValue10);
                    }
                    androidx.compose.ui.focus.FocusRequester focusRequester2 = (androidx.compose.ui.focus.FocusRequester) rememberedValue10;
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.ui.CIPTaxStepScreenContentKt$CIPTaxStepScreenContent$1$1 rememberedValue11 = startRestartGroup.rememberedValue();
                    if (rememberedValue11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue11 = new com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.ui.CIPTaxStepScreenContentKt$CIPTaxStepScreenContent$1$1(focusRequester2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue11);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue11, startRestartGroup, 6);
                    boolean visible = bottomSheetController2.getVisible();
                    boolean changedInstance5 = startRestartGroup.changedInstance(bottomSheetController2);
                    java.lang.Object rememberedValue12 = startRestartGroup.rememberedValue();
                    if (changedInstance5 || rememberedValue12 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        snapshotMutationPolicy = null;
                        cIPTaxStepScreenContentKt$CIPTaxStepScreenContent$2$1 = new com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.ui.CIPTaxStepScreenContentKt$CIPTaxStepScreenContent$2$1(bottomSheetController2, focusRequester, mutableState8, null);
                        startRestartGroup.updateRememberedValue(cIPTaxStepScreenContentKt$CIPTaxStepScreenContent$2$1);
                    } else {
                        cIPTaxStepScreenContentKt$CIPTaxStepScreenContent$2$1 = rememberedValue12;
                        snapshotMutationPolicy = null;
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(visible), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) cIPTaxStepScreenContentKt$CIPTaxStepScreenContent$2$1, startRestartGroup, 0);
                    java.lang.Object rememberedValue13 = startRestartGroup.rememberedValue();
                    if (rememberedValue13 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue13 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(snapshotMutationPolicy, snapshotMutationPolicy, 2, snapshotMutationPolicy);
                        startRestartGroup.updateRememberedValue(rememberedValue13);
                    }
                    final androidx.compose.runtime.MutableState mutableState9 = (androidx.compose.runtime.MutableState) rememberedValue13;
                    final com.paypal.oslo.feature.oneonboarding.validators.ui.CIPValidationMessages rememberCIPValidationMessages = com.paypal.oslo.feature.oneonboarding.validators.ui.CIPValidationMessagesProviderKt.rememberCIPValidationMessages(startRestartGroup, 0);
                    java.lang.Object[] objArr = {list3};
                    boolean changedInstance6 = startRestartGroup.changedInstance(list3);
                    java.lang.Object rememberedValue14 = startRestartGroup.rememberedValue();
                    if (changedInstance6 || rememberedValue14 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue14 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.ui.CIPTaxStepScreenContentKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.ui.CIPTaxStepScreenContentKt.m16715$r8$lambda$IeRFffpxbtrSXjaQxDll7dN4kU(list3);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue14);
                    }
                    androidx.compose.runtime.MutableState mutableState10 = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable(objArr, (kotlin.jvm.functions.Function0) rememberedValue14, startRestartGroup, 0);
                    final android.view.View view = (android.view.View) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalView());
                    android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                    boolean changedInstance7 = startRestartGroup.changedInstance(list3);
                    boolean changedInstance8 = startRestartGroup.changedInstance(context);
                    boolean changedInstance9 = startRestartGroup.changedInstance(intentId);
                    com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.ui.CIPTaxStepScreenContentKt$CIPTaxStepScreenContent$3$1 rememberedValue15 = startRestartGroup.rememberedValue();
                    if (!(changedInstance7 | changedInstance8) && !changedInstance9) {
                        mutableState = mutableState10;
                        if (rememberedValue15 != androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            obj = null;
                            androidx.compose.runtime.EffectsKt.LaunchedEffect(list3, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue15, startRestartGroup, (i3 >> 15) & 14);
                            int i12 = i3;
                            java.lang.Object obj3 = obj;
                            final androidx.compose.runtime.MutableState mutableState11 = mutableState;
                            java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo> list4 = list3;
                            androidx.compose.ui.Modifier modifier5 = modifier4;
                            androidx.compose.ui.Modifier context2 = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, obj), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2), kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.oneonboarding.analytics.ProvisioningAnalyticsKt.toProvisionUserIntent(intentId)));
                            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, context2);
                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (!startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor);
                            } else {
                                startRestartGroup.useNode();
                            }
                            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                            androidx.compose.ui.Modifier navigationBarsPadding = androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.navigationBarsPadding(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.imePadding(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, obj3), com.paypal.pds.core.ConstantsKt.getSpacing24(), 0.0f, 2, obj3)));
                            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, navigationBarsPadding);
                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (!startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor2);
                            } else {
                                startRestartGroup.useNode();
                            }
                            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_cip_tax_step_title, startRestartGroup, 0);
                            com.paypal.pds.core.Typography.HeadingMedium headingMedium = com.paypal.pds.core.Typography.HeadingMedium.INSTANCE;
                            com.paypal.pds.core.Color.ContentBase contentBase = com.paypal.pds.core.Color.ContentBase.INSTANCE;
                            androidx.compose.ui.Modifier focusable$default = androidx.compose.foundation.FocusableKt.focusable$default(androidx.compose.ui.focus.FocusRequesterModifierKt.focusRequester(androidx.compose.ui.Modifier.INSTANCE, focusRequester2), false, null, 3, null);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.ui.CIPTaxStepScreenContentKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj4) {
                                        return com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.ui.CIPTaxStepScreenContentKt.$r8$lambda$QjTIThgvOMlJksYBvd1KDTYJXmc((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj4);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(stringResource, androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(focusable$default, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null), contentBase, null, null, null, false, 0, 0, null, headingMedium, startRestartGroup, 384, 6, 1016);
                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, 0);
                            androidx.compose.ui.Modifier verticalScroll$default = androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance2, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null);
                            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                            int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, verticalScroll$default);
                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (!startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor3);
                            } else {
                                startRestartGroup.useNode();
                            }
                            androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance3 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                            if (taxpayerIdViewComponentConfig3 != null) {
                                startRestartGroup.startReplaceGroup(-1870341140);
                                startRestartGroup.endReplaceGroup();
                                modifier3 = modifier5;
                                i6 = 0;
                                composer2 = startRestartGroup;
                                mutableState4 = mutableState9;
                                cIPValidationMessages = rememberCIPValidationMessages;
                                mutableState5 = mutableState7;
                                boxScopeInstance = boxScopeInstance2;
                                columnScopeInstance = columnScopeInstance2;
                                bottomSheetController = bottomSheetController2;
                                i5 = i12;
                                mutableState3 = mutableState6;
                                taxpayerIdViewComponentConfig2 = taxpayerIdViewComponentConfig3;
                            } else {
                                startRestartGroup.startReplaceGroup(-1870341139);
                                androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                                androidx.compose.ui.Modifier focusRequester3 = androidx.compose.ui.focus.FocusRequesterModifierKt.focusRequester(androidx.compose.ui.Modifier.INSTANCE, focusRequester);
                                java.lang.String str = (java.lang.String) mutableState9.getValue();
                                boolean changed3 = startRestartGroup.changed(rememberCIPValidationMessages);
                                java.lang.Object rememberedValue16 = startRestartGroup.rememberedValue();
                                if (changed3 || rememberedValue16 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    mutableState2 = mutableState7;
                                    rememberedValue16 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.ui.CIPTaxStepScreenContentKt$$ExternalSyntheticLambda5
                                        @Override // kotlin.jvm.functions.Function2
                                        public final java.lang.Object invoke(java.lang.Object obj4, java.lang.Object obj5) {
                                            return com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.ui.CIPTaxStepScreenContentKt.$r8$lambda$tBLIuHUB_w4zRYl4tI1oj8JWgQY(com.paypal.oslo.feature.oneonboarding.validators.ui.CIPValidationMessages.this, mutableState6, mutableState2, mutableState9, (java.lang.String) obj4, (com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType) obj5);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue16);
                                } else {
                                    mutableState2 = mutableState7;
                                }
                                kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue16;
                                androidx.compose.ui.Modifier.Companion companion2 = companion;
                                boolean changedInstance10 = startRestartGroup.changedInstance(intentId);
                                boolean changedInstance11 = startRestartGroup.changedInstance(focusManager);
                                boolean changedInstance12 = startRestartGroup.changedInstance(bottomSheetController2);
                                java.lang.Object rememberedValue17 = startRestartGroup.rememberedValue();
                                if ((changedInstance10 | changedInstance11 | changedInstance12) || rememberedValue17 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue17 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.ui.CIPTaxStepScreenContentKt$$ExternalSyntheticLambda6
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            return com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.ui.CIPTaxStepScreenContentKt.m16717$r8$lambda$ZCc2ihRVir0s2tNGcxmgU50HCw(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.this, focusManager, bottomSheetController2);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue17);
                                }
                                int i13 = (com.paypal.pds.components.DropdownState.$stable << 3) | 24576 | ((i12 << 3) & 896);
                                mutableState3 = mutableState6;
                                bottomSheetController = bottomSheetController2;
                                taxpayerIdViewComponentConfig2 = taxpayerIdViewComponentConfig3;
                                mutableState4 = mutableState9;
                                mutableState5 = mutableState2;
                                i5 = i12;
                                boxScopeInstance = boxScopeInstance2;
                                i6 = 0;
                                modifier3 = modifier5;
                                columnScopeInstance = columnScopeInstance2;
                                cIPValidationMessages = rememberCIPValidationMessages;
                                composer2 = startRestartGroup;
                                com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.ui.TaxpayerIdViewComponentContentKt.TaxpayerIdViewComponentContent(taxpayerIdViewComponentConfig3, rememberDropdownState, intentId, function2, companion2, focusRequester3, str, (kotlin.jvm.functions.Function0) rememberedValue17, startRestartGroup, i13, 0);
                                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                                composer2.endReplaceGroup();
                                kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                            }
                            composer2.endNode();
                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), composer2, i6);
                            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_cip_tax_step_disclaimer, composer2, i6), null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, composer2, 384, 6, 1018);
                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), composer2, i6);
                            java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_next_button_label, composer2, i6);
                            com.paypal.pds.components.ButtonStyle.Primary primary = com.paypal.pds.components.ButtonStyle.Primary.INSTANCE;
                            com.paypal.pds.components.ButtonSize.Large large = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
                            androidx.compose.ui.Modifier item = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(columnScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally()), 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("continue", i6, 2, null));
                            changedInstance = composer2.changedInstance(taxpayerIdViewComponentConfig2);
                            changedInstance2 = composer2.changedInstance(intentId);
                            final com.paypal.oslo.feature.oneonboarding.validators.ui.CIPValidationMessages cIPValidationMessages2 = cIPValidationMessages;
                            changed = composer2.changed(cIPValidationMessages2);
                            changedInstance3 = composer2.changedInstance(view);
                            i7 = i5;
                            i8 = (i7 & 896) != 256 ? 1 : i6;
                            i9 = (i7 & 7168) != 2048 ? 1 : 0;
                            rememberedValue2 = composer2.rememberedValue();
                            if (((changedInstance ? 1 : 0) | (changedInstance2 ? 1 : 0) | (changed ? 1 : 0) | (changedInstance3 ? 1 : 0) | i8 | i9) == 0 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                final com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdViewComponentConfig taxpayerIdViewComponentConfig4 = taxpayerIdViewComponentConfig2;
                                final androidx.compose.runtime.MutableState mutableState12 = mutableState3;
                                i10 = i7;
                                final androidx.compose.runtime.MutableState mutableState13 = mutableState5;
                                final androidx.compose.runtime.MutableState mutableState14 = mutableState4;
                                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.ui.CIPTaxStepScreenContentKt$$ExternalSyntheticLambda7
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.ui.CIPTaxStepScreenContentKt.$r8$lambda$NbuWxOjF0OT5lGD3Z7ESrh53cMs(com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdViewComponentConfig.this, intentId, cIPValidationMessages2, function1, function0, mutableState12, mutableState13, view, mutableState14);
                                    }
                                };
                                composer2.updateRememberedValue(rememberedValue2);
                            } else {
                                i10 = i7;
                            }
                            com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue2, stringResource2, item, null, null, primary, large, false, false, composer2, 1769472, 408);
                            composer2.endNode();
                            final com.paypal.pds.components.BottomSheetController bottomSheetController3 = bottomSheetController;
                            changedInstance4 = composer2.changedInstance(bottomSheetController3);
                            rememberedValue3 = composer2.rememberedValue();
                            if (!changedInstance4 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.ui.CIPTaxStepScreenContentKt$$ExternalSyntheticLambda8
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.ui.CIPTaxStepScreenContentKt.$r8$lambda$pF7J65mux7PaumCsAa7ANfsbtYA(com.paypal.pds.components.BottomSheetController.this);
                                    }
                                };
                                composer2.updateRememberedValue(rememberedValue3);
                            }
                            com.paypal.oslo.feature.oneonboarding.ui.common.SsnInfoModalKt.SsnInfoModal(bottomSheetController3, (kotlin.jvm.functions.Function0) rememberedValue3, composer2, com.paypal.pds.components.BottomSheetController.$stable);
                            com.paypal.pds.components.DropdownKt.DropdownBottomSheet(rememberDropdownState, composer2, com.paypal.pds.components.DropdownState.$stable);
                            boolean booleanValue = ((java.lang.Boolean) mutableState11.getValue()).booleanValue();
                            changed2 = composer2.changed(mutableState11);
                            rememberedValue4 = composer2.rememberedValue();
                            if (!changed2 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.ui.CIPTaxStepScreenContentKt$$ExternalSyntheticLambda9
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.ui.CIPTaxStepScreenContentKt.m16716$r8$lambda$PZongTAwCDuTaRGfxzjnzhkIKc(androidx.compose.runtime.MutableState.this);
                                    }
                                };
                                composer2.updateRememberedValue(rememberedValue4);
                            }
                            com.paypal.oslo.feature.oneonboarding.ui.common.ContextualErrorBannerKt.ContextualErrorBannerIfVisible(booleanValue, list4, intentId, (kotlin.jvm.functions.Function0) rememberedValue4, androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(boxScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getTopStart()), 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing24(), 0.0f, 2, null), composer2, ((i10 >> 12) & 112) | ((i10 << 3) & 896), 0);
                            composer2.endNode();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            modifier2 = modifier3;
                            list2 = list4;
                        }
                    } else {
                        mutableState = mutableState10;
                    }
                    obj = null;
                    rememberedValue15 = new com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.ui.CIPTaxStepScreenContentKt$CIPTaxStepScreenContent$3$1(list3, intentId, context, null);
                    startRestartGroup.updateRememberedValue(rememberedValue15);
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(list3, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue15, startRestartGroup, (i3 >> 15) & 14);
                    int i122 = i3;
                    java.lang.Object obj32 = obj;
                    final androidx.compose.runtime.MutableState mutableState112 = mutableState;
                    java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo> list42 = list3;
                    androidx.compose.ui.Modifier modifier52 = modifier4;
                    androidx.compose.ui.Modifier context22 = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, obj), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2), kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.oneonboarding.analytics.ProvisioningAnalyticsKt.toProvisionUserIntent(intentId)));
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                    int hashCode4 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier4 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, context22);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor4 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl4 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, maybeCachedBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, currentCompositionLocalMap4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl4, java.lang.Integer.valueOf(hashCode4), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, materializeModifier4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance22 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                    androidx.compose.ui.Modifier navigationBarsPadding2 = androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.navigationBarsPadding(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.imePadding(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, obj32), com.paypal.pds.core.ConstantsKt.getSpacing24(), 0.0f, 2, obj32)));
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy3 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    int hashCode22 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier22 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, navigationBarsPadding2);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor22 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl22 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl22, columnMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl22, currentCompositionLocalMap22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl22, java.lang.Integer.valueOf(hashCode22), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl22, materializeModifier22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance22 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                    java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_cip_tax_step_title, startRestartGroup, 0);
                    com.paypal.pds.core.Typography.HeadingMedium headingMedium2 = com.paypal.pds.core.Typography.HeadingMedium.INSTANCE;
                    com.paypal.pds.core.Color.ContentBase contentBase2 = com.paypal.pds.core.Color.ContentBase.INSTANCE;
                    androidx.compose.ui.Modifier focusable$default2 = androidx.compose.foundation.FocusableKt.focusable$default(androidx.compose.ui.focus.FocusRequesterModifierKt.focusRequester(androidx.compose.ui.Modifier.INSTANCE, focusRequester2), false, null, 3, null);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    }
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(stringResource3, androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(focusable$default2, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null), contentBase2, null, null, null, false, 0, 0, null, headingMedium2, startRestartGroup, 384, 6, 1016);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, 0);
                    androidx.compose.ui.Modifier verticalScroll$default2 = androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance22, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy22 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    int hashCode32 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier32 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, verticalScroll$default2);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor32 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl32 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl32, columnMeasurePolicy22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl32, currentCompositionLocalMap32, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl32, java.lang.Integer.valueOf(hashCode32), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl32, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl32, materializeModifier32, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance32 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                    if (taxpayerIdViewComponentConfig3 != null) {
                    }
                    composer2.endNode();
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), composer2, i6);
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_cip_tax_step_disclaimer, composer2, i6), null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, composer2, 384, 6, 1018);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), composer2, i6);
                    java.lang.String stringResource22 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_next_button_label, composer2, i6);
                    com.paypal.pds.components.ButtonStyle.Primary primary2 = com.paypal.pds.components.ButtonStyle.Primary.INSTANCE;
                    com.paypal.pds.components.ButtonSize.Large large2 = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
                    androidx.compose.ui.Modifier item2 = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(columnScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally()), 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("continue", i6, 2, null));
                    changedInstance = composer2.changedInstance(taxpayerIdViewComponentConfig2);
                    changedInstance2 = composer2.changedInstance(intentId);
                    final com.paypal.oslo.feature.oneonboarding.validators.ui.CIPValidationMessages cIPValidationMessages22 = cIPValidationMessages;
                    changed = composer2.changed(cIPValidationMessages22);
                    changedInstance3 = composer2.changedInstance(view);
                    i7 = i5;
                    if ((i7 & 896) != 256) {
                    }
                    if ((i7 & 7168) != 2048) {
                    }
                    rememberedValue2 = composer2.rememberedValue();
                    if (((changedInstance ? 1 : 0) | (changedInstance2 ? 1 : 0) | (changed ? 1 : 0) | (changedInstance3 ? 1 : 0) | i8 | i9) == 0) {
                    }
                    final com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdViewComponentConfig taxpayerIdViewComponentConfig42 = taxpayerIdViewComponentConfig2;
                    final androidx.compose.runtime.MutableState mutableState122 = mutableState3;
                    i10 = i7;
                    final androidx.compose.runtime.MutableState mutableState132 = mutableState5;
                    final androidx.compose.runtime.MutableState mutableState142 = mutableState4;
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.ui.CIPTaxStepScreenContentKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.ui.CIPTaxStepScreenContentKt.$r8$lambda$NbuWxOjF0OT5lGD3Z7ESrh53cMs(com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdViewComponentConfig.this, intentId, cIPValidationMessages22, function1, function0, mutableState122, mutableState132, view, mutableState142);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue2);
                    com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue2, stringResource22, item2, null, null, primary2, large2, false, false, composer2, 1769472, 408);
                    composer2.endNode();
                    final com.paypal.pds.components.BottomSheetController bottomSheetController32 = bottomSheetController;
                    changedInstance4 = composer2.changedInstance(bottomSheetController32);
                    rememberedValue3 = composer2.rememberedValue();
                    if (!changedInstance4) {
                    }
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.ui.CIPTaxStepScreenContentKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.ui.CIPTaxStepScreenContentKt.$r8$lambda$pF7J65mux7PaumCsAa7ANfsbtYA(com.paypal.pds.components.BottomSheetController.this);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue3);
                    com.paypal.oslo.feature.oneonboarding.ui.common.SsnInfoModalKt.SsnInfoModal(bottomSheetController32, (kotlin.jvm.functions.Function0) rememberedValue3, composer2, com.paypal.pds.components.BottomSheetController.$stable);
                    com.paypal.pds.components.DropdownKt.DropdownBottomSheet(rememberDropdownState, composer2, com.paypal.pds.components.DropdownState.$stable);
                    boolean booleanValue2 = ((java.lang.Boolean) mutableState112.getValue()).booleanValue();
                    changed2 = composer2.changed(mutableState112);
                    rememberedValue4 = composer2.rememberedValue();
                    if (!changed2) {
                    }
                    rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.ui.CIPTaxStepScreenContentKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.ui.CIPTaxStepScreenContentKt.m16716$r8$lambda$PZongTAwCDuTaRGfxzjnzhkIKc(androidx.compose.runtime.MutableState.this);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue4);
                    com.paypal.oslo.feature.oneonboarding.ui.common.ContextualErrorBannerKt.ContextualErrorBannerIfVisible(booleanValue2, list42, intentId, (kotlin.jvm.functions.Function0) rememberedValue4, androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(boxScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getTopStart()), 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing24(), 0.0f, 2, null), composer2, ((i10 >> 12) & 112) | ((i10 << 3) & 896), 0);
                    composer2.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier3;
                    list2 = list42;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.ui.CIPTaxStepScreenContentKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj4, java.lang.Object obj5) {
                            return com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.ui.CIPTaxStepScreenContentKt.m16713$r8$lambda$4_CpqL0LBs62ksxAX8VJZpHPMQ(com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.domain.CIPTaxInfoStepComponentConfig.this, intentId, function1, function0, modifier2, list2, i, i2, (androidx.compose.runtime.Composer) obj4, ((java.lang.Integer) obj5).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            if (!startRestartGroup.shouldExecute((i3 & 74899) != 74898, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 74899) != 74898, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: $r8$lambda$4-_CpqL0LBs62ksxAX8VJZpHPMQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16713$r8$lambda$4_CpqL0LBs62ksxAX8VJZpHPMQ(com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.domain.CIPTaxInfoStepComponentConfig cIPTaxInfoStepComponentConfig, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, java.util.List list, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CIPTaxStepScreenContent(cIPTaxInfoStepComponentConfig, intentId, function1, function0, modifier, list, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$82VsxwCDy_VL-mmgQWkBNkYkYng, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16714$r8$lambda$82VsxwCDy_VLmmgQWkBNkYkYng(com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem collectedItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collectedItem, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$IeRFf-fpxbtrSXjaQxDll7dN4kU, reason: not valid java name */
    public static /* synthetic */ androidx.compose.runtime.MutableState m16715$r8$lambda$IeRFffpxbtrSXjaQxDll7dN4kU(java.util.List list) {
        java.util.List list2 = list;
        return androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.valueOf(!(list2 == null || list2.isEmpty())), null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$NbuWxOjF0OT5lGD3Z7ESrh53cMs(com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdViewComponentConfig taxpayerIdViewComponentConfig, final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, com.paypal.oslo.feature.oneonboarding.validators.ui.CIPValidationMessages cIPValidationMessages, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.MutableState mutableState, final androidx.compose.runtime.MutableState mutableState2, final android.view.View view, final androidx.compose.runtime.MutableState mutableState3) {
        java.lang.String taxpayerIdInvalidSsnCfs;
        java.lang.String str;
        java.lang.String str2 = (java.lang.String) mutableState.getValue();
        com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType taxpayerIdType = (com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType) mutableState2.getValue();
        kotlin.jvm.functions.Function1 function12 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.ui.CIPTaxStepScreenContentKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.ui.CIPTaxStepScreenContentKt.m16718$r8$lambda$aA6P8ym3YclXZSuU1sCikydLCA(view, intentId, mutableState3, mutableState2, (java.lang.String) obj);
            }
        };
        if (taxpayerIdViewComponentConfig != null) {
            java.lang.String highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(taxpayerIdType, cIPValidationMessages);
            if (intentId instanceof com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.Crypto) {
                taxpayerIdInvalidSsnCfs = cIPValidationMessages.getTaxpayerIdInvalidSsn();
            } else {
                taxpayerIdInvalidSsnCfs = cIPValidationMessages.getTaxpayerIdInvalidSsnCfs();
            }
            com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.ui.TaxpayerIdValidationResult validateTaxpayerId = com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.ui.TaxpayerIdViewComponentValidatorKt.validateTaxpayerId(str2, taxpayerIdType, highSpeedVideoFpsRangesFor, taxpayerIdInvalidSsnCfs, cIPValidationMessages.getTaxpayerIdInvalidItin(), cIPValidationMessages.getTaxpayerIdLengthSsn(), cIPValidationMessages.getTaxpayerIdLengthItin(), cIPValidationMessages.getTaxpayerIdLengthSsn4(), cIPValidationMessages.getTaxpayerIdLengthItin4());
            if (validateTaxpayerId instanceof com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.ui.TaxpayerIdValidationResult.RequiredButEmpty) {
                str = ((com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.ui.TaxpayerIdValidationResult.RequiredButEmpty) validateTaxpayerId).getErrorMessage();
            } else if (validateTaxpayerId instanceof com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.ui.TaxpayerIdValidationResult.Invalid) {
                str = ((com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.ui.TaxpayerIdValidationResult.Invalid) validateTaxpayerId).getErrorMessage();
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(validateTaxpayerId, com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.ui.TaxpayerIdValidationResult.Valid.INSTANCE)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                str = null;
            }
            function12.invoke(str);
            if (kotlin.jvm.internal.Intrinsics.areEqual(validateTaxpayerId, com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.ui.TaxpayerIdValidationResult.Valid.INSTANCE)) {
                function1.invoke(new com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdCollectedItem(taxpayerIdViewComponentConfig.mo16702getIdfHLlpbY(), str2, taxpayerIdType, taxpayerIdViewComponentConfig.getVariant(), null));
                function0.invoke();
            }
        } else {
            function0.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$PZongTAwCDuTa-RGfxzjnzhkIKc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16716$r8$lambda$PZongTAwCDuTaRGfxzjnzhkIKc(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.FALSE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QjTIThgvOMlJksYBvd1KDTYJXmc(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.heading(semanticsPropertyReceiver);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ZCc2i-hRVir0s2tNGcxmgU50HCw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16717$r8$lambda$ZCc2ihRVir0s2tNGcxmgU50HCw(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, androidx.compose.ui.focus.FocusManager focusManager, com.paypal.pds.components.BottomSheetController bottomSheetController) {
        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ItemPressed(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.analytics.CipTaxStepAnalytics.SCREEN_ID_CIP_TAX), null, null, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.analytics.TaxpayerIdViewComponentAnalytics.ITEM_INFO_LINK, 0, 2, null), 6, null), com.paypal.oslo.feature.oneonboarding.analytics.ProvisioningAnalyticsKt.toProvisionUserIntent(intentId), null, 4, null).track(com.paypal.oslo.feature.oneonboarding.AnalyticsTrackerKt.analyticsTracker);
        androidx.compose.ui.focus.FocusManager.clearFocus$default(focusManager, false, 1, null);
        bottomSheetController.showSheet();
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: $r8$lambda$aA6P8ym3YclXZS-uU1sCikydLCA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16718$r8$lambda$aA6P8ym3YclXZSuU1sCikydLCA(android.view.View view, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.MutableState mutableState2, java.lang.String str) {
        java.lang.String str2;
        mutableState.setValue(str);
        if (str != null) {
            view.announceForAccessibility(str);
            int i = com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.ui.CIPTaxStepScreenContentKt.WhenMappings.$EnumSwitchMapping$0[((com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType) mutableState2.getValue()).ordinal()];
            if (i == 3 || i == 4) {
                str2 = "id_number_itin";
            } else {
                str2 = "id_number_ssn";
            }
            com.paypal.oslo.feature.oneonboarding.analytics.ProvisioningAnalyticsKt.trackFieldError(intentId, com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.analytics.CipTaxStepAnalytics.SCREEN_ID_CIP_TAX, str2, com.paypal.oslo.feature.oneonboarding.analytics.OnboardingAnalytics.ACTION_PROVISION_PRODUCT, com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.analytics.CipTaxStepAnalytics.TAXPAYER_ID_VALIDATION_FAILED, str);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$kMtIqNWtYEfdJ9Mdrao3CAwwzHE(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(92745198);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(92745198, updateChangedFlags, -1, "com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.ui.CIPTaxStepScreenContentPreview (CIPTaxStepScreenContent.kt:366)");
            }
            com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.domain.CIPTaxInfoStepComponentConfig cIPTaxInfoStepComponentConfig = new com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.domain.CIPTaxInfoStepComponentConfig(com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16608constructorimpl("preview-CIPTax-step"), kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdViewComponentConfig(com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16608constructorimpl("taxpayer-id-component"), com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdVariant.PRIMARY_USER, true, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdOption(com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType.SSN, null)), true, (kotlin.jvm.internal.DefaultConstructorMarker) null)), (kotlin.jvm.internal.DefaultConstructorMarker) null);
            com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.BankingBundle bankingBundle = new com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.BankingBundle(null, 1, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.ui.CIPTaxStepScreenContentKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.ui.CIPTaxStepScreenContentKt.m16714$r8$lambda$82VsxwCDy_VLmmgQWkBNkYkYng((com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.ui.CIPTaxStepScreenContentKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            CIPTaxStepScreenContent(cIPTaxInfoStepComponentConfig, bankingBundle, function1, (kotlin.jvm.functions.Function0) rememberedValue2, null, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo(com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16608constructorimpl("taxpayer-id-component"), com.paypal.oslo.feature.oneonboarding.domain.error.ContextualErrorIssues.ACCOUNT_SSN_ALREADY_IN_USE, null, 4, null)), startRestartGroup, 3456, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.ui.CIPTaxStepScreenContentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.ui.CIPTaxStepScreenContentKt.$r8$lambda$kMtIqNWtYEfdJ9Mdrao3CAwwzHE(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pF7J65mux7PaumCsAa7ANfsbtYA(com.paypal.pds.components.BottomSheetController bottomSheetController) {
        bottomSheetController.hideSheet();
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$tBLIuHUB_w4zRYl4tI1oj8JWgQY(com.paypal.oslo.feature.oneonboarding.validators.ui.CIPValidationMessages cIPValidationMessages, androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.MutableState mutableState2, androidx.compose.runtime.MutableState mutableState3, java.lang.String str, com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType taxpayerIdType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxpayerIdType, "");
        boolean z = ((java.lang.String) mutableState.getValue()).length() > 0;
        boolean z2 = ((com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType) mutableState2.getValue()) != taxpayerIdType;
        mutableState.setValue(str);
        mutableState2.setValue(taxpayerIdType);
        mutableState3.setValue(((!z2 || z) && str.length() == 0) ? getHighSpeedVideoFpsRangesFor(taxpayerIdType, cIPValidationMessages) : null);
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType.values().length];
            try {
                iArr[com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType.SSN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType.SSN4.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType.ITIN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType.ITIN4.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType.UNKNOWN__.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
