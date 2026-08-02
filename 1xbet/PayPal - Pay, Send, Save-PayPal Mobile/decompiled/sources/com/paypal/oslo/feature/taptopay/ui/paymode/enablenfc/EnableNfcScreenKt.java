package com.paypal.oslo.feature.taptopay.ui.paymode.enablenfc;

@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\u001aZ\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062%\b\u0002\u0010\u0007\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b¢\u0006\u0002\b\u000bH\u0001¢\u0006\u0002\u0010\f\u001a)\u0010\r\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0001¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0011¨\u0006\u0012²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u0084\u0002"}, d2 = {"EnableNfcScreen", "", "onNfcEnable", "Lkotlin/Function0;", "onDismiss", "viewModel", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/enablenfc/EnableNfcViewModel;", "launcherProvider", "Lkotlin/Function1;", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/paypal/oslo/feature/taptopay/ui/paymode/enablenfc/EnableNfcViewModel;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "EnableNfcContent", "onGoToSettings", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "EnableNfcScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "taptopay_prodRelease", "isNfcEnabled", ""}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class EnableNfcScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EnableNfcScreen(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, com.paypal.oslo.feature.taptopay.ui.paymode.enablenfc.EnableNfcViewModel enableNfcViewModel, kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends androidx.view.result.ActivityResultLauncher<android.content.Intent>> function3, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.oslo.feature.taptopay.ui.paymode.enablenfc.EnableNfcViewModel enableNfcViewModel2;
        kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends androidx.view.result.ActivityResultLauncher<android.content.Intent>> function32;
        final com.paypal.oslo.feature.taptopay.ui.paymode.enablenfc.EnableNfcViewModel enableNfcViewModel3;
        int i4;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        boolean changed;
        java.lang.Object rememberedValue;
        boolean changed2;
        boolean z;
        com.paypal.oslo.feature.taptopay.ui.paymode.enablenfc.EnableNfcScreenKt$EnableNfcScreen$2$1 rememberedValue2;
        boolean changedInstance;
        java.lang.Object rememberedValue3;
        boolean changedInstance2;
        java.lang.Object rememberedValue4;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-795635686);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                enableNfcViewModel2 = enableNfcViewModel;
                if (startRestartGroup.changedInstance(enableNfcViewModel2)) {
                    i5 = 256;
                    i3 |= i5;
                }
            } else {
                enableNfcViewModel2 = enableNfcViewModel;
            }
            i5 = 128;
            i3 |= i5;
        } else {
            enableNfcViewModel2 = enableNfcViewModel;
        }
        if ((i & 3072) == 0) {
            function32 = function3;
            i3 |= ((i2 & 8) == 0 && startRestartGroup.changedInstance(function32)) ? 2048 : 1024;
        } else {
            function32 = function3;
        }
        if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 4) != 0) {
                    androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                    }
                    androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, startRestartGroup, 0);
                    if (current instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                        empty = ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                    } else {
                        empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
                    }
                    enableNfcViewModel2 = (com.paypal.oslo.feature.taptopay.ui.paymode.enablenfc.EnableNfcViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.taptopay.ui.paymode.enablenfc.EnableNfcViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    i4 = i3 & (-7169);
                    enableNfcViewModel3 = enableNfcViewModel2;
                    function32 = new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.enablenfc.EnableNfcScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function3
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                            return com.paypal.oslo.feature.taptopay.ui.paymode.enablenfc.EnableNfcScreenKt.$r8$lambda$94LLrctTgj9_OvpFfjbYHusuzBQ((kotlin.jvm.functions.Function0) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                        }
                    };
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-795635686, i4, -1, "com.paypal.oslo.feature.taptopay.ui.paymode.enablenfc.EnableNfcScreen (EnableNfcScreen.kt:58)");
                    }
                    changed = startRestartGroup.changed(enableNfcViewModel3);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.enablenfc.EnableNfcScreenKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.taptopay.ui.paymode.enablenfc.EnableNfcScreenKt.$r8$lambda$m4DeEbSgatyAuopiSV9e2axCQ7Q(com.paypal.oslo.feature.taptopay.ui.paymode.enablenfc.EnableNfcViewModel.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    final androidx.view.result.ActivityResultLauncher<android.content.Intent> invoke = function32.invoke((kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, java.lang.Integer.valueOf((i4 >> 6) & 112));
                    androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(enableNfcViewModel3.isNfcEnabled(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                    boolean booleanValue = ((java.lang.Boolean) collectAsStateWithLifecycle.getValue()).booleanValue();
                    changed2 = startRestartGroup.changed(collectAsStateWithLifecycle);
                    z = (i4 & 14) == 4;
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!(z | changed2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new com.paypal.oslo.feature.taptopay.ui.paymode.enablenfc.EnableNfcScreenKt$EnableNfcScreen$2$1(function0, collectAsStateWithLifecycle, null);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(booleanValue), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 0);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    changedInstance = startRestartGroup.changedInstance(enableNfcViewModel3);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changedInstance || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.enablenfc.EnableNfcScreenKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.taptopay.ui.paymode.enablenfc.EnableNfcScreenKt.$r8$lambda$b83yOUlgNfMGMyykLcns7SmCta8(com.paypal.oslo.feature.taptopay.ui.paymode.enablenfc.EnableNfcViewModel.this, (androidx.view.compose.LifecycleResumePauseEffectScope) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    androidx.view.compose.LifecycleEffectKt.LifecycleResumeEffect(unit, (androidx.view.LifecycleOwner) null, (kotlin.jvm.functions.Function1<? super androidx.view.compose.LifecycleResumePauseEffectScope, ? extends androidx.view.compose.LifecyclePauseOrDisposeEffectResult>) rememberedValue3, startRestartGroup, 6, 2);
                    changedInstance2 = startRestartGroup.changedInstance(invoke);
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (!changedInstance2 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.enablenfc.EnableNfcScreenKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.taptopay.ui.paymode.enablenfc.EnableNfcScreenKt.m20120$r8$lambda$gEvM7wNlOi24LIsvhANCe8EeM(androidx.view.result.ActivityResultLauncher.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    EnableNfcContent(function02, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, (i4 >> 3) & 14);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
            }
            i4 = i3;
            enableNfcViewModel3 = enableNfcViewModel2;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            changed = startRestartGroup.changed(enableNfcViewModel3);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.enablenfc.EnableNfcScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.taptopay.ui.paymode.enablenfc.EnableNfcScreenKt.$r8$lambda$m4DeEbSgatyAuopiSV9e2axCQ7Q(com.paypal.oslo.feature.taptopay.ui.paymode.enablenfc.EnableNfcViewModel.this);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            final androidx.view.result.ActivityResultLauncher invoke2 = function32.invoke((kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, java.lang.Integer.valueOf((i4 >> 6) & 112));
            androidx.compose.runtime.State collectAsStateWithLifecycle2 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(enableNfcViewModel3.isNfcEnabled(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            boolean booleanValue2 = ((java.lang.Boolean) collectAsStateWithLifecycle2.getValue()).booleanValue();
            changed2 = startRestartGroup.changed(collectAsStateWithLifecycle2);
            if ((i4 & 14) == 4) {
            }
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!(z | changed2)) {
            }
            rememberedValue2 = new com.paypal.oslo.feature.taptopay.ui.paymode.enablenfc.EnableNfcScreenKt$EnableNfcScreen$2$1(function0, collectAsStateWithLifecycle2, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(booleanValue2), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 0);
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            changedInstance = startRestartGroup.changedInstance(enableNfcViewModel3);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.enablenfc.EnableNfcScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.taptopay.ui.paymode.enablenfc.EnableNfcScreenKt.$r8$lambda$b83yOUlgNfMGMyykLcns7SmCta8(com.paypal.oslo.feature.taptopay.ui.paymode.enablenfc.EnableNfcViewModel.this, (androidx.view.compose.LifecycleResumePauseEffectScope) obj);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue3);
            androidx.view.compose.LifecycleEffectKt.LifecycleResumeEffect(unit2, (androidx.view.LifecycleOwner) null, (kotlin.jvm.functions.Function1<? super androidx.view.compose.LifecycleResumePauseEffectScope, ? extends androidx.view.compose.LifecyclePauseOrDisposeEffectResult>) rememberedValue3, startRestartGroup, 6, 2);
            changedInstance2 = startRestartGroup.changedInstance(invoke2);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!changedInstance2) {
            }
            rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.enablenfc.EnableNfcScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.taptopay.ui.paymode.enablenfc.EnableNfcScreenKt.m20120$r8$lambda$gEvM7wNlOi24LIsvhANCe8EeM(androidx.view.result.ActivityResultLauncher.this);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue4);
            EnableNfcContent(function02, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, (i4 >> 3) & 14);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            enableNfcViewModel3 = enableNfcViewModel2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final com.paypal.oslo.feature.taptopay.ui.paymode.enablenfc.EnableNfcViewModel enableNfcViewModel4 = enableNfcViewModel3;
            final kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends androidx.view.result.ActivityResultLauncher<android.content.Intent>> function33 = function32;
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.enablenfc.EnableNfcScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taptopay.ui.paymode.enablenfc.EnableNfcScreenKt.$r8$lambda$ViLBbkHGOA2q6BJfNtFZ1sCbuB0(kotlin.jvm.functions.Function0.this, function02, enableNfcViewModel4, function33, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void EnableNfcContent(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-564285723);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-564285723, i2, -1, "com.paypal.oslo.feature.taptopay.ui.paymode.enablenfc.EnableNfcContent (EnableNfcScreen.kt:93)");
            }
            com.paypal.oslo.feature.taptopay.ui.setup.error.SetupErrorContentKt.SetupErrorContent(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_enable_nfc_title, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_enable_nfc_cta, startRestartGroup, 0), function02, function0, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_enable_nfc_description, startRestartGroup, 0), com.paypal.pds.core.Icon.Info.INSTANCE, com.paypal.pds.core.Color.ContentBase.INSTANCE, com.paypal.pds.core.Color.BackgroundMuted.INSTANCE, startRestartGroup, ((i2 << 3) & 896) | 14352384 | ((i2 << 9) & 7168), 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.enablenfc.EnableNfcScreenKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taptopay.ui.paymode.enablenfc.EnableNfcScreenKt.$r8$lambda$WJwoJBK7J3m6NkhZfgiFMbusvUU(kotlin.jvm.functions.Function0.this, function02, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$1u52k2hm-wuYV0xb8zkb-eyG-Vk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20119$r8$lambda$1u52k2hmwuYV0xb8zkbeyGVk(kotlin.jvm.functions.Function0 function0, androidx.view.result.ActivityResult activityResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResult, "");
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.view.result.ActivityResultLauncher $r8$lambda$94LLrctTgj9_OvpFfjbYHusuzBQ(final kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        composer.startReplaceGroup(-801485709);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-801485709, i, -1, "com.paypal.oslo.feature.taptopay.ui.paymode.enablenfc.EnableNfcScreen.<anonymous> (EnableNfcScreen.kt:52)");
        }
        androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult startActivityForResult = new androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult();
        boolean z = (((i & 14) ^ 6) > 4 && composer.changed(function0)) || (i & 6) == 4;
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.enablenfc.EnableNfcScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.taptopay.ui.paymode.enablenfc.EnableNfcScreenKt.m20119$r8$lambda$1u52k2hmwuYV0xb8zkbeyGVk(kotlin.jvm.functions.Function0.this, (androidx.view.result.ActivityResult) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.view.compose.ManagedActivityResultLauncher rememberLauncherForActivityResult = androidx.view.compose.ActivityResultRegistryKt.rememberLauncherForActivityResult(startActivityForResult, (kotlin.jvm.functions.Function1) rememberedValue, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return rememberLauncherForActivityResult;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BQNzbTaTgznAfG7xPbRa370wE8I(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-805444678);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-805444678, updateChangedFlags, -1, "com.paypal.oslo.feature.taptopay.ui.paymode.enablenfc.EnableNfcScreenPreview (EnableNfcScreen.kt:108)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.enablenfc.EnableNfcScreenKt$$ExternalSyntheticLambda5
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
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.enablenfc.EnableNfcScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            EnableNfcContent(function0, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 54);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.enablenfc.EnableNfcScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taptopay.ui.paymode.enablenfc.EnableNfcScreenKt.$r8$lambda$BQNzbTaTgznAfG7xPbRa370wE8I(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ViLBbkHGOA2q6BJfNtFZ1sCbuB0(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, com.paypal.oslo.feature.taptopay.ui.paymode.enablenfc.EnableNfcViewModel enableNfcViewModel, kotlin.jvm.functions.Function3 function3, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        EnableNfcScreen(function0, function02, enableNfcViewModel, function3, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WJwoJBK7J3m6NkhZfgiFMbusvUU(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, androidx.compose.runtime.Composer composer, int i2) {
        EnableNfcContent(function0, function02, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.view.compose.LifecyclePauseOrDisposeEffectResult $r8$lambda$b83yOUlgNfMGMyykLcns7SmCta8(com.paypal.oslo.feature.taptopay.ui.paymode.enablenfc.EnableNfcViewModel enableNfcViewModel, final androidx.view.compose.LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleResumePauseEffectScope, "");
        enableNfcViewModel.checkNfcStatus();
        return new androidx.view.compose.LifecyclePauseOrDisposeEffectResult() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.enablenfc.EnableNfcScreenKt$EnableNfcScreen$lambda$4$0$$inlined$onPauseOrDispose$1
            @Override // androidx.view.compose.LifecyclePauseOrDisposeEffectResult
            public final void runPauseOrOnDisposeEffect() {
                androidx.view.compose.LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope2 = androidx.view.compose.LifecycleResumePauseEffectScope.this;
            }
        };
    }

    /* renamed from: $r8$lambda$g-EvM7wNlO-i24LIsvhANCe8EeM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20120$r8$lambda$gEvM7wNlOi24LIsvhANCe8EeM(androidx.view.result.ActivityResultLauncher activityResultLauncher) {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Navigating to nfc settings", null, null, 6, null);
        activityResultLauncher.launch(new android.content.Intent("android.settings.NFC_SETTINGS"));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$m4DeEbSgatyAuopiSV9e2axCQ7Q(com.paypal.oslo.feature.taptopay.ui.paymode.enablenfc.EnableNfcViewModel enableNfcViewModel) {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "User returned from settings", null, null, 6, null);
        enableNfcViewModel.checkNfcStatus();
        return kotlin.Unit.INSTANCE;
    }
}
