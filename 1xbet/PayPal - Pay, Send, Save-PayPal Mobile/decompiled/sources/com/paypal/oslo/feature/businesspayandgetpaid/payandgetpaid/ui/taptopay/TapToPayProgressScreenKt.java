package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay;

@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\u001a9\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\n2\b\b\u0002\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u000e\u001a\r\u0010\u000f\u001a\u00020\u0006H\u0001¢\u0006\u0002\u0010\u0010\u001a5\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0001¢\u0006\u0002\u0010\u0016\u001a\r\u0010\u0017\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0018\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010\u0010\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0019²\u0006\f\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u008a\u0084\u0002"}, d2 = {"TopBarTestTag", "", "LoaderTestTag", "PreparingTitleTestTag", "WaitLabelTestTag", "TapToPayProgressScreen", "", "onFailure", "Lkotlin/Function0;", "onSuccess", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/navigation/BusinessTapToPaySuccessDestination;", "viewModel", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TapToPayProgressViewModel;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TapToPayProgressViewModel;Landroidx/compose/runtime/Composer;II)V", "TapToPayProgressContent", "(Landroidx/compose/runtime/Composer;I)V", "TapToPayProgressFailure", "title", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "buttonText", "onButtonClick", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "TapToPayProgressScreenPreview", "TapToPayProgressFailurePreview", "business-pay-and-get-paid_prodRelease", com.paypal.oslo.feature.bankingbundle.data.repository.ApiTracking.RESULT_FAILURE, "Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/FailureType;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TapToPayProgressScreenKt {
    public static final java.lang.String LoaderTestTag = "tap_to_pay_progress_loader";
    public static final java.lang.String PreparingTitleTestTag = "tap_to_pay_progress_preparing_title";
    public static final java.lang.String TopBarTestTag = "tap_to_pay_progress_top_bar";
    public static final java.lang.String WaitLabelTestTag = "tap_to_pay_progress_wait_label";

    /* JADX WARN: Removed duplicated region for block: B:37:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TapToPayProgressScreen(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.BusinessTapToPaySuccessDestination, kotlin.Unit> function1, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressViewModel tapToPayProgressViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressViewModel tapToPayProgressViewModel2;
        androidx.compose.runtime.Composer composer2;
        int i4;
        boolean changedInstance;
        java.lang.Object rememberedValue;
        boolean changedInstance2;
        boolean changedInstance3;
        boolean changedInstance4;
        boolean z;
        boolean z2;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressScreenKt$TapToPayProgressScreen$1$1 rememberedValue2;
        int i5;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressViewModel tapToPayProgressViewModel3;
        int i6;
        com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.FailureType failureType;
        int i7;
        kotlin.Triple triple;
        int i8;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1951442169);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                tapToPayProgressViewModel2 = tapToPayProgressViewModel;
                if (startRestartGroup.changedInstance(tapToPayProgressViewModel2)) {
                    i8 = 256;
                    i3 |= i8;
                }
            } else {
                tapToPayProgressViewModel2 = tapToPayProgressViewModel;
            }
            i8 = 128;
            i3 |= i8;
        } else {
            tapToPayProgressViewModel2 = tapToPayProgressViewModel;
        }
        if (startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
            } else if ((i2 & 4) != 0) {
                androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                i4 = 0;
                i3 &= -897;
                tapToPayProgressViewModel2 = (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, startRestartGroup, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, startRestartGroup, 0, 0);
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1951442169, i3, -1, "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressScreen (TapToPayProgressScreen.kt:66)");
                }
                androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(tapToPayProgressViewModel2.getFailureState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult startActivityForResult = new androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult();
                changedInstance = startRestartGroup.changedInstance(tapToPayProgressViewModel2);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressScreenKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressScreenKt.$r8$lambda$5C8SzTR9PSlixLNlTBDfSisDqHk(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressViewModel.this, (androidx.view.result.ActivityResult) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.view.compose.ManagedActivityResultLauncher rememberLauncherForActivityResult = androidx.view.compose.ActivityResultRegistryKt.rememberLauncherForActivityResult(startActivityForResult, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, i4);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                changedInstance2 = startRestartGroup.changedInstance(tapToPayProgressViewModel2);
                changedInstance3 = startRestartGroup.changedInstance(context);
                changedInstance4 = startRestartGroup.changedInstance(rememberLauncherForActivityResult);
                z = (i3 & 112) != 32;
                z2 = (i3 & 14) != 4;
                rememberedValue2 = startRestartGroup.rememberedValue();
                if ((!(changedInstance2 | changedInstance3 | changedInstance4 | z) && !z2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    i5 = i3;
                    tapToPayProgressViewModel3 = tapToPayProgressViewModel2;
                    i6 = 0;
                    composer2 = startRestartGroup;
                    rememberedValue2 = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressScreenKt$TapToPayProgressScreen$1$1(tapToPayProgressViewModel2, context, function1, function0, rememberLauncherForActivityResult, null);
                    composer2.updateRememberedValue(rememberedValue2);
                } else {
                    i5 = i3;
                    tapToPayProgressViewModel3 = tapToPayProgressViewModel2;
                    composer2 = startRestartGroup;
                    i6 = 0;
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, composer2, 6);
                failureType = (com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.FailureType) collectAsStateWithLifecycle.getValue();
                if (failureType == null || com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressScreenKt.WhenMappings.$EnumSwitchMapping$0[failureType.ordinal()] == -1) {
                    composer2.startReplaceGroup(1564871744);
                    TapToPayProgressContent(composer2, i6);
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(1266471788);
                    i7 = com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressScreenKt.WhenMappings.$EnumSwitchMapping$0[failureType.ordinal()];
                    if (i7 != 1) {
                        composer2.startReplaceGroup(1564876887);
                        triple = new kotlin.Triple(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_tap_to_pay_failure_amount_low_title, composer2, i6), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_tap_to_pay_failure_amount_low_body, composer2, i6), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_tap_to_pay_failure_amount_button, composer2, i6));
                        composer2.endReplaceGroup();
                    } else if (i7 == 2) {
                        composer2.startReplaceGroup(1564890169);
                        triple = new kotlin.Triple(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_tap_to_pay_failure_amount_high_title, composer2, i6), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_tap_to_pay_failure_amount_high_body, composer2, i6), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_tap_to_pay_failure_amount_button, composer2, i6));
                        composer2.endReplaceGroup();
                    } else {
                        if (i7 != 3) {
                            composer2.startReplaceGroup(1564875684);
                            composer2.endReplaceGroup();
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        composer2.startReplaceGroup(1564903570);
                        triple = new kotlin.Triple(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_tap_to_pay_failure_generic_title, composer2, i6), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_tap_to_pay_failure_generic_body, composer2, i6), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_tap_to_pay_failure_generic_button, composer2, i6));
                        composer2.endReplaceGroup();
                    }
                    TapToPayProgressFailure((java.lang.String) triple.component1(), (java.lang.String) triple.component2(), (java.lang.String) triple.component3(), function0, composer2, (i5 << 9) & 7168, 0);
                    composer2.endReplaceGroup();
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                tapToPayProgressViewModel2 = tapToPayProgressViewModel3;
            }
            i4 = 0;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            androidx.compose.runtime.State collectAsStateWithLifecycle2 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(tapToPayProgressViewModel2.getFailureState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            android.content.Context context2 = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
            androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult startActivityForResult2 = new androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult();
            changedInstance = startRestartGroup.changedInstance(tapToPayProgressViewModel2);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressScreenKt.$r8$lambda$5C8SzTR9PSlixLNlTBDfSisDqHk(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressViewModel.this, (androidx.view.result.ActivityResult) obj);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            androidx.view.compose.ManagedActivityResultLauncher rememberLauncherForActivityResult2 = androidx.view.compose.ActivityResultRegistryKt.rememberLauncherForActivityResult(startActivityForResult2, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, i4);
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            changedInstance2 = startRestartGroup.changedInstance(tapToPayProgressViewModel2);
            changedInstance3 = startRestartGroup.changedInstance(context2);
            changedInstance4 = startRestartGroup.changedInstance(rememberLauncherForActivityResult2);
            if ((i3 & 112) != 32) {
            }
            if ((i3 & 14) != 4) {
            }
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!(changedInstance2 | changedInstance3 | changedInstance4 | z | z2)) {
            }
            i5 = i3;
            tapToPayProgressViewModel3 = tapToPayProgressViewModel2;
            i6 = 0;
            composer2 = startRestartGroup;
            rememberedValue2 = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressScreenKt$TapToPayProgressScreen$1$1(tapToPayProgressViewModel2, context2, function1, function0, rememberLauncherForActivityResult2, null);
            composer2.updateRememberedValue(rememberedValue2);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, composer2, 6);
            failureType = (com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.FailureType) collectAsStateWithLifecycle2.getValue();
            if (failureType == null) {
                composer2.startReplaceGroup(1266471788);
                i7 = com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressScreenKt.WhenMappings.$EnumSwitchMapping$0[failureType.ordinal()];
                if (i7 != 1) {
                }
                TapToPayProgressFailure((java.lang.String) triple.component1(), (java.lang.String) triple.component2(), (java.lang.String) triple.component3(), function0, composer2, (i5 << 9) & 7168, 0);
                composer2.endReplaceGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                tapToPayProgressViewModel2 = tapToPayProgressViewModel3;
            }
            composer2.startReplaceGroup(1564871744);
            TapToPayProgressContent(composer2, i6);
            composer2.endReplaceGroup();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            tapToPayProgressViewModel2 = tapToPayProgressViewModel3;
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressScreenKt.m13256$r8$lambda$7fxoQoWEXqt9yDDMqiWkwvKxLA(kotlin.jvm.functions.Function0.this, function1, tapToPayProgressViewModel2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void TapToPayProgressContent(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(28839340);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(28839340, i, -1, "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressContent (TapToPayProgressScreen.kt:152)");
            }
            com.paypal.oslo.core.commonui.components.TopBarKt.TopBar(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_tap_to_pay, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, TopBarTestTag), null, null, false, null, null, startRestartGroup, 48, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.navigationBarsPadding(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.statusBarsPadding(androidx.compose.ui.Modifier.INSTANCE)), 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
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
            androidx.compose.ui.Modifier fillMaxSize$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 54);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2);
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
            com.paypal.pds.components.LoaderKt.Loader(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, LoaderTestTag), null, null, null, startRestartGroup, 6, 14);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, 0);
            composer2 = startRestartGroup;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_tap_to_pay_progress_preparing, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, PreparingTitleTestTag), null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.TitleMedium.INSTANCE, startRestartGroup, 48, 6, 1020);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), composer2, 0);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_tap_to_pay_progress_wait, composer2, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, WaitLabelTestTag), null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer2, 48, 6, 1020);
            composer2.endNode();
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressScreenKt.$r8$lambda$CKFh3TzIkPKO5OCnbTKvtrfpgD8(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TapToPayProgressFailure(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-863565160);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(str3) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            function02 = function0;
            i3 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                function03 = function02;
            } else {
                if (i4 != 0) {
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressScreenKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                kotlin.Unit unit;
                                unit = kotlin.Unit.INSTANCE;
                                return unit;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    function04 = (kotlin.jvm.functions.Function0) rememberedValue;
                } else {
                    function04 = function02;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-863565160, i3, -1, "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressFailure (TapToPayProgressScreen.kt:197)");
                }
                androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical center = androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter();
                androidx.compose.ui.Alignment.Horizontal centerHorizontally = androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally();
                androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.navigationBarsPadding(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.statusBarsPadding(androidx.compose.ui.Modifier.INSTANCE)), 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(center, centerHorizontally, startRestartGroup, 54);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
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
                int i5 = i3 << 9;
                com.paypal.pds.components.EmptyStateKt.EmptyState(com.paypal.pds.core.Icon.Alert.INSTANCE, null, null, str, str2, str3, function04, startRestartGroup, (i5 & 7168) | 6 | (57344 & i5) | (458752 & i5) | (i5 & 3670016), 6);
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                function03 = function04;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressScreenKt.$r8$lambda$FWNnIv5T8l3laXc8FoD8lbsPy1A(str, str2, str3, function03, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        function02 = function0;
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5C8SzTR9PSlixLNlTBDfSisDqHk(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressViewModel tapToPayProgressViewModel, androidx.view.result.ActivityResult activityResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResult, "");
        tapToPayProgressViewModel.handleResult(activityResult.getResultCode(), activityResult.getData());
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$7fxoQoWEXqt9y-DDMqiWkwvKxLA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13256$r8$lambda$7fxoQoWEXqt9yDDMqiWkwvKxLA(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressViewModel tapToPayProgressViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        TapToPayProgressScreen(function0, function1, tapToPayProgressViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CKFh3TzIkPKO5OCnbTKvtrfpgD8(int i, androidx.compose.runtime.Composer composer, int i2) {
        TapToPayProgressContent(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$FWNnIv5T8l3laXc8FoD8lbsPy1A(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        TapToPayProgressFailure(str, str2, str3, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$l8_9__PaA7AKYVFOThh23F1aq1A(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1119628041);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1119628041, updateChangedFlags, -1, "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressScreenPreview (TapToPayProgressScreen.kt:220)");
            }
            TapToPayProgressContent(startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressScreenKt.$r8$lambda$l8_9__PaA7AKYVFOThh23F1aq1A(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$mLRdXTQrHO28IQ-KyR4HT4j3g4A, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13257$r8$lambda$mLRdXTQrHO28IQKyR4HT4j3g4A(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1499138429);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1499138429, updateChangedFlags, -1, "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressFailurePreview (TapToPayProgressScreen.kt:229)");
            }
            TapToPayProgressFailure(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_tap_to_pay_failure_amount_low_title, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_tap_to_pay_failure_amount_low_body, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_tap_to_pay_failure_amount_button, startRestartGroup, 0), null, startRestartGroup, 0, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressScreenKt.m13257$r8$lambda$mLRdXTQrHO28IQKyR4HT4j3g4A(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.FailureType.values().length];
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.FailureType.BELOW_MINIMUM.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.FailureType.ABOVE_MAXIMUM.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.FailureType.GENERIC_FAILURE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
