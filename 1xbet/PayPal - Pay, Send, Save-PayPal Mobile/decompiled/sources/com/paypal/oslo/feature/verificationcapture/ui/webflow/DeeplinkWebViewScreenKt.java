package com.paypal.oslo.feature.verificationcapture.ui.webflow;

@kotlin.Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u009d\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2X\b\u0002\u0010\u000b\u001aR\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\u0014H\u0001¢\u0006\u0002\u0010\u0015¨\u0006\u0016"}, d2 = {"DeeplinkWebViewScreen", "", "destination", "Lcom/paypal/oslo/feature/verificationcapture/api/navigation/VerificationCaptureDeeplinkDestination;", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "onSuccess", "Lkotlin/Function0;", "onFailure", "viewModel", "Lcom/paypal/oslo/feature/verificationcapture/ui/webflow/DeeplinkWebViewViewModel;", "webViewContent", "Lkotlin/Function3;", "Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewConfiguration;", "Lkotlin/ParameterName;", "name", "config", "onBackClick", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/runtime/Composable;", "(Lcom/paypal/oslo/feature/verificationcapture/api/navigation/VerificationCaptureDeeplinkDestination;Lcom/paypal/oslo/core/navigation/AppNavigator;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/paypal/oslo/feature/verificationcapture/ui/webflow/DeeplinkWebViewViewModel;Lkotlin/jvm/functions/Function5;Landroidx/compose/runtime/Composer;II)V", "verification-capture_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DeeplinkWebViewScreenKt {
    public static final void DeeplinkWebViewScreen(final com.paypal.oslo.feature.verificationcapture.api.navigation.VerificationCaptureDeeplinkDestination verificationCaptureDeeplinkDestination, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, com.paypal.oslo.feature.verificationcapture.ui.webflow.DeeplinkWebViewViewModel deeplinkWebViewViewModel, kotlin.jvm.functions.Function5<? super com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function5, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.oslo.feature.verificationcapture.ui.webflow.DeeplinkWebViewViewModel deeplinkWebViewViewModel2;
        kotlin.jvm.functions.Function5<? super com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function52;
        final kotlin.jvm.functions.Function5<? super com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function53;
        int i4;
        final kotlin.jvm.functions.Function5<? super com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> m20692getLambda$1708753641$verification_capture_prodRelease;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verificationCaptureDeeplinkDestination, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1149768530);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(verificationCaptureDeeplinkDestination) : startRestartGroup.changedInstance(verificationCaptureDeeplinkDestination) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(appNavigator) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                deeplinkWebViewViewModel2 = deeplinkWebViewViewModel;
                if (startRestartGroup.changedInstance(deeplinkWebViewViewModel2)) {
                    i5 = 16384;
                    i3 |= i5;
                }
            } else {
                deeplinkWebViewViewModel2 = deeplinkWebViewViewModel;
            }
            i5 = 8192;
            i3 |= i5;
        } else {
            deeplinkWebViewViewModel2 = deeplinkWebViewViewModel;
        }
        int i6 = i2 & 32;
        if (i6 != 0) {
            i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            function52 = function5;
        } else {
            function52 = function5;
            if ((196608 & i) == 0) {
                i3 |= startRestartGroup.changedInstance(function52) ? 131072 : 65536;
            }
        }
        if (startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
                m20692getLambda$1708753641$verification_capture_prodRelease = function52;
                i4 = 256;
            } else {
                if ((i2 & 16) != 0) {
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
                    i4 = 256;
                    deeplinkWebViewViewModel2 = (com.paypal.oslo.feature.verificationcapture.ui.webflow.DeeplinkWebViewViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.verificationcapture.ui.webflow.DeeplinkWebViewViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                    i3 &= -57345;
                } else {
                    i4 = 256;
                }
                m20692getLambda$1708753641$verification_capture_prodRelease = i6 != 0 ? com.paypal.oslo.feature.verificationcapture.ui.webflow.ComposableSingletons$DeeplinkWebViewScreenKt.INSTANCE.m20692getLambda$1708753641$verification_capture_prodRelease() : function5;
            }
            final com.paypal.oslo.feature.verificationcapture.ui.webflow.DeeplinkWebViewViewModel deeplinkWebViewViewModel3 = deeplinkWebViewViewModel2;
            int i7 = i3;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1149768530, i7, -1, "com.paypal.oslo.feature.verificationcapture.ui.webflow.DeeplinkWebViewScreen (DeeplinkWebViewScreen.kt:59)");
            }
            boolean changedInstance = startRestartGroup.changedInstance(deeplinkWebViewViewModel3);
            boolean z = (i7 & 896) == i4;
            int i8 = i7 & 7168;
            boolean z2 = i8 == 2048;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((z | changedInstance | z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.verificationcapture.ui.webflow.DeeplinkWebViewScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.verificationcapture.ui.webflow.DeeplinkWebViewScreenKt.m20693$r8$lambda$5ODCtONIuvmFQEUqhkn6AESst4(com.paypal.oslo.feature.verificationcapture.ui.webflow.DeeplinkWebViewViewModel.this, function0, function02, (androidx.compose.runtime.DisposableEffectScope) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.DisposableEffect(deeplinkWebViewViewModel3, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue, startRestartGroup, (i7 >> 12) & 14);
            boolean z3 = i8 == 2048;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z3 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.verificationcapture.ui.webflow.DeeplinkWebViewScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.verificationcapture.ui.webflow.DeeplinkWebViewScreenKt.$r8$lambda$rw6GpeJ7i1vULABcuKpA5wHHI9c(kotlin.jvm.functions.Function0.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.view.compose.BackHandlerKt.BackHandler(false, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 0, 1);
            boolean z4 = (i7 & 14) == 4 || ((i7 & 8) != 0 && startRestartGroup.changed(verificationCaptureDeeplinkDestination));
            boolean z5 = (i7 & 112) == 32;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if ((z5 | z4) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = deeplinkWebViewViewModel3.buildWebViewConfig(verificationCaptureDeeplinkDestination, appNavigator);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            final com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration secureWebViewConfiguration = (com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration) rememberedValue3;
            androidx.compose.foundation.layout.BoxWithConstraintsKt.BoxWithConstraints(androidx.compose.ui.draw.ClipKt.clipToBounds(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null)), androidx.compose.ui.Alignment.INSTANCE.getCenter(), false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-105199556, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.verificationcapture.ui.webflow.DeeplinkWebViewScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function3
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.verificationcapture.ui.webflow.DeeplinkWebViewScreenKt.$r8$lambda$nBiXD5rYYiITXGG6y3YOCOcGF5Q(kotlin.jvm.functions.Function5.this, secureWebViewConfiguration, function02, (androidx.compose.foundation.layout.BoxWithConstraintsScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, 3126, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            deeplinkWebViewViewModel2 = deeplinkWebViewViewModel3;
            function53 = m20692getLambda$1708753641$verification_capture_prodRelease;
        } else {
            startRestartGroup.skipToGroupEnd();
            function53 = function5;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final com.paypal.oslo.feature.verificationcapture.ui.webflow.DeeplinkWebViewViewModel deeplinkWebViewViewModel4 = deeplinkWebViewViewModel2;
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.verificationcapture.ui.webflow.DeeplinkWebViewScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.verificationcapture.ui.webflow.DeeplinkWebViewScreenKt.m20694$r8$lambda$EePkD6GyP02Faof9Rujta3TmHY(com.paypal.oslo.feature.verificationcapture.api.navigation.VerificationCaptureDeeplinkDestination.this, appNavigator, function0, function02, deeplinkWebViewViewModel4, function53, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$5-ODCtONIuvmFQEUqhkn6AESst4, reason: not valid java name */
    public static /* synthetic */ androidx.compose.runtime.DisposableEffectResult m20693$r8$lambda$5ODCtONIuvmFQEUqhkn6AESst4(final com.paypal.oslo.feature.verificationcapture.ui.webflow.DeeplinkWebViewViewModel deeplinkWebViewViewModel, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disposableEffectScope, "");
        deeplinkWebViewViewModel.registerCloseHandler(function0, function02);
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: com.paypal.oslo.feature.verificationcapture.ui.webflow.DeeplinkWebViewScreenKt$DeeplinkWebViewScreen$lambda$0$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                com.paypal.oslo.feature.verificationcapture.ui.webflow.DeeplinkWebViewViewModel.this.clearCloseHandler();
            }
        };
    }

    /* renamed from: $r8$lambda$EePkD6GyP02Faof9Rujta3Tm-HY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20694$r8$lambda$EePkD6GyP02Faof9Rujta3TmHY(com.paypal.oslo.feature.verificationcapture.api.navigation.VerificationCaptureDeeplinkDestination verificationCaptureDeeplinkDestination, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, com.paypal.oslo.feature.verificationcapture.ui.webflow.DeeplinkWebViewViewModel deeplinkWebViewViewModel, kotlin.jvm.functions.Function5 function5, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        DeeplinkWebViewScreen(verificationCaptureDeeplinkDestination, appNavigator, function0, function02, deeplinkWebViewViewModel, function5, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$nBiXD5rYYiITXGG6y3YOCOcGF5Q(kotlin.jvm.functions.Function5 function5, com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration secureWebViewConfiguration, kotlin.jvm.functions.Function0 function0, androidx.compose.foundation.layout.BoxWithConstraintsScope boxWithConstraintsScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(boxWithConstraintsScope, "");
        if ((i & 6) == 0) {
            i |= composer.changed(boxWithConstraintsScope) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-105199556, i, -1, "com.paypal.oslo.feature.verificationcapture.ui.webflow.DeeplinkWebViewScreen.<anonymous> (DeeplinkWebViewScreen.kt:87)");
            }
            function5.invoke(secureWebViewConfiguration, function0, androidx.compose.foundation.layout.SizeKt.m1742sizeVpY3zN4(androidx.compose.ui.Modifier.INSTANCE, boxWithConstraintsScope.mo1624getMaxWidthD9Ej5fM(), boxWithConstraintsScope.mo1623getMaxHeightD9Ej5fM()), composer, java.lang.Integer.valueOf(com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration.$stable));
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rw6GpeJ7i1vULABcuKpA5wHHI9c(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }
}
