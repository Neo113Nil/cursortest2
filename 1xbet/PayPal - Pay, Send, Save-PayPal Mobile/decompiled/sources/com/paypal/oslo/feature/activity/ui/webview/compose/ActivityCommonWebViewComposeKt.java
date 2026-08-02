package com.paypal.oslo.feature.activity.ui.webview.compose;

@kotlin.Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0002\u001a+\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00060\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0001¢\u0006\u0002\u0010\t\u001a\"\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0000\u001aV\u0010\u0011\u001a\u00020\u00102\u0018\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u00140\u00132\u0018\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u00140\u00132\u0018\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u00140\u0013H\u0000\u001a\r\u0010\u0018\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0002¨\u0006\u0019"}, d2 = {"ActivityCommonWebViewScreen", "", "(Landroidx/compose/runtime/Composer;I)V", "getSecureWebViewConfiguration", "Lkotlin/Pair;", "Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewConfiguration;", "Lkotlin/Function0;", "webViewViewModel", "Lcom/paypal/oslo/feature/activity/ui/webview/model/ActivityCommonSecureWebViewModel;", "(Lcom/paypal/oslo/feature/activity/ui/webview/model/ActivityCommonSecureWebViewModel;Landroidx/compose/runtime/Composer;II)Lkotlin/Pair;", "createWebViewConfiguration", "url", "", "isAuthRequired", "", com.sun.jna.Callback.METHOD_NAME, "Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewCallback;", "createSecureWebViewCallback", "onLoadingState", "Landroidx/compose/runtime/State;", "Lkotlin/Function1;", "onSuccessState", "onErrorState", "Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewError;", "PayPalActivityCommonWebViewScreenPreview", "activity_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityCommonWebViewComposeKt {
    public static final void ActivityCommonWebViewScreen(androidx.compose.runtime.Composer composer, final int i) {
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-502098081);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-502098081, i, -1, "com.paypal.oslo.feature.activity.ui.webview.compose.ActivityCommonWebViewScreen (ActivityCommonWebViewCompose.kt:42)");
            }
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
            kotlin.Pair<com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration, kotlin.jvm.functions.Function0<kotlin.Unit>> secureWebViewConfiguration = getSecureWebViewConfiguration((com.paypal.oslo.feature.activity.ui.webview.model.ActivityCommonSecureWebViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.activity.ui.webview.model.ActivityCommonSecureWebViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0), startRestartGroup, 0, 0);
            com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration component1 = secureWebViewConfiguration.component1();
            kotlin.jvm.functions.Function0<kotlin.Unit> component2 = secureWebViewConfiguration.component2();
            androidx.compose.ui.Modifier windowInsetsPadding = androidx.compose.foundation.layout.WindowInsetsPaddingKt.windowInsetsPadding(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.foundation.layout.WindowInsets_androidKt.getNavigationBars(androidx.compose.foundation.layout.WindowInsets.INSTANCE, startRestartGroup, 6));
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, windowInsetsPadding);
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
            com.paypal.oslo.core.webview.ui.compose.SecureWebViewKt.SecureWebView(component1, component2, null, null, startRestartGroup, com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration.$stable, 12);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.webview.compose.ActivityCommonWebViewComposeKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.webview.compose.ActivityCommonWebViewComposeKt.$r8$lambda$0U5BEppwv1kHPWmAEeFiQGpK4ig(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration createWebViewConfiguration$default(java.lang.String str, boolean z, com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback secureWebViewCallback, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return createWebViewConfiguration(str, z, secureWebViewCallback);
    }

    public static final com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration createWebViewConfiguration(java.lang.String str, boolean z, com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback secureWebViewCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secureWebViewCallback, "");
        return new com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration(new com.paypal.oslo.core.webview.ui.config.SecureWebViewContent.Url(str, "activity-common-webview", z, false, null, 24, null), null, secureWebViewCallback, null, new com.paypal.oslo.core.webview.ui.config.SecureWebViewSettings(null, true, 1, null), null, null, 106, null);
    }

    public static final com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback createSecureWebViewCallback(final androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>> state, final androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>> state2, final androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function1<? super com.paypal.oslo.core.webview.ui.callback.SecureWebViewError, kotlin.Unit>> state3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state3, "");
        return new com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback() { // from class: com.paypal.oslo.feature.activity.ui.webview.compose.ActivityCommonWebViewComposeKt$createSecureWebViewCallback$1
            @Override // com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback
            public final /* bridge */ void onActionsReady(com.paypal.oslo.core.webview.ui.callback.WebViewActionBundle webViewActionBundle) {
                super.onActionsReady(webViewActionBundle);
            }

            @Override // com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback
            public final /* bridge */ void onDownloadRequest(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j) {
                super.onDownloadRequest(str, str2, str3, str4, j);
            }

            @Override // com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback
            public final void onLoadingStarted(java.lang.String url) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
                state.getValue().invoke(url);
            }

            @Override // com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback
            public final void onLoadingFinished(java.lang.String url) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
                state2.getValue().invoke(url);
            }

            @Override // com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback
            public final void onLoadFailed(com.paypal.oslo.core.webview.ui.callback.SecureWebViewError error) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
                state3.getValue().invoke(error);
            }
        };
    }

    public static final kotlin.Pair<com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration, kotlin.jvm.functions.Function0<kotlin.Unit>> getSecureWebViewConfiguration(final com.paypal.oslo.feature.activity.ui.webview.model.ActivityCommonSecureWebViewModel activityCommonSecureWebViewModel, androidx.compose.runtime.Composer composer, int i, int i2) {
        com.paypal.oslo.feature.activity.api.models.ActivityWebViewDto webViewPayload$activity_prodRelease;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        boolean z = true;
        if ((i2 & 1) != 0) {
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0);
            if (current instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                empty = ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
            } else {
                empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
            }
            activityCommonSecureWebViewModel = (com.paypal.oslo.feature.activity.ui.webview.model.ActivityCommonSecureWebViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.activity.ui.webview.model.ActivityCommonSecureWebViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, composer, 0, 0);
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-676799605, i, -1, "com.paypal.oslo.feature.activity.ui.webview.compose.getSecureWebViewConfiguration (ActivityCommonWebViewCompose.kt:56)");
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.webview.compose.ActivityCommonWebViewComposeKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.activity.ui.webview.compose.ActivityCommonWebViewComposeKt.$r8$lambda$scApT0qgQee_pB1ihkn9CKzj8Vo((java.lang.String) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState((kotlin.jvm.functions.Function1) rememberedValue, composer, 6);
        com.paypal.oslo.feature.activity.ui.webview.compose.ActivityCommonWebViewComposeKt$getSecureWebViewConfiguration$currentOnSuccessState$1$1 rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = com.paypal.oslo.feature.activity.ui.webview.compose.ActivityCommonWebViewComposeKt$getSecureWebViewConfiguration$currentOnSuccessState$1$1.getHighSpeedVideoSizes;
            composer.updateRememberedValue(rememberedValue2);
        }
        androidx.compose.runtime.State rememberUpdatedState2 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState((kotlin.reflect.KFunction) rememberedValue2, composer, 6);
        com.paypal.oslo.feature.activity.ui.webview.compose.ActivityCommonWebViewComposeKt$getSecureWebViewConfiguration$currentOnErrorState$1$1 rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = com.paypal.oslo.feature.activity.ui.webview.compose.ActivityCommonWebViewComposeKt$getSecureWebViewConfiguration$currentOnErrorState$1$1.getHighSpeedVideoFpsRanges;
            composer.updateRememberedValue(rememberedValue3);
        }
        androidx.compose.runtime.State rememberUpdatedState3 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState((kotlin.reflect.KFunction) rememberedValue3, composer, 6);
        boolean changedInstance = composer.changedInstance(activityCommonSecureWebViewModel);
        java.lang.Object rememberedValue4 = composer.rememberedValue();
        if (changedInstance || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.webview.compose.ActivityCommonWebViewComposeKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.activity.ui.webview.compose.ActivityCommonWebViewComposeKt.$r8$lambda$ft1nAu7ZczYWECIrpchAvUZS5lE(com.paypal.oslo.feature.activity.ui.webview.model.ActivityCommonSecureWebViewModel.this);
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        final androidx.compose.runtime.State rememberUpdatedState4 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState((kotlin.jvm.functions.Function0) rememberedValue4, composer, 0);
        java.lang.String webViewURL$activity_prodRelease = activityCommonSecureWebViewModel != null ? activityCommonSecureWebViewModel.getWebViewURL$activity_prodRelease() : null;
        if (webViewURL$activity_prodRelease == null) {
            webViewURL$activity_prodRelease = "";
        }
        if (activityCommonSecureWebViewModel != null && (webViewPayload$activity_prodRelease = activityCommonSecureWebViewModel.getWebViewPayload$activity_prodRelease()) != null) {
            z = webViewPayload$activity_prodRelease.isAuthRequired();
        }
        boolean changed = composer.changed(webViewURL$activity_prodRelease);
        boolean changed2 = composer.changed(z);
        java.lang.Object rememberedValue5 = composer.rememberedValue();
        if ((changed | changed2) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue5 = createWebViewConfiguration(webViewURL$activity_prodRelease, z, createSecureWebViewCallback(rememberUpdatedState, rememberUpdatedState2, rememberUpdatedState3));
            composer.updateRememberedValue(rememberedValue5);
        }
        com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration secureWebViewConfiguration = (com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration) rememberedValue5;
        java.lang.Object rememberedValue6 = composer.rememberedValue();
        if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.webview.compose.ActivityCommonWebViewComposeKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.activity.ui.webview.compose.ActivityCommonWebViewComposeKt.$r8$lambda$uN2eyASrqae2T9J_pNzDtpVqOyE(androidx.compose.runtime.State.this);
                }
            };
            composer.updateRememberedValue(rememberedValue6);
        }
        kotlin.Pair<com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration, kotlin.jvm.functions.Function0<kotlin.Unit>> pair = new kotlin.Pair<>(secureWebViewConfiguration, (kotlin.jvm.functions.Function0) rememberedValue6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return pair;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0U5BEppwv1kHPWmAEeFiQGpK4ig(int i, androidx.compose.runtime.Composer composer, int i2) {
        ActivityCommonWebViewScreen(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UVuzj8llXlHQSpCwIti8UM1d9ow(com.paypal.oslo.core.webview.ui.callback.SecureWebViewError secureWebViewError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secureWebViewError, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ft1nAu7ZczYWECIrpchAvUZS5lE(com.paypal.oslo.feature.activity.ui.webview.model.ActivityCommonSecureWebViewModel activityCommonSecureWebViewModel) {
        if (activityCommonSecureWebViewModel == null) {
            return null;
        }
        activityCommonSecureWebViewModel.navigateToBack$activity_prodRelease();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$p7XOPozaz5ktD9L4qfmwNIXLTt4(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$pN7pRaJTIlpc7wCvB-_wZBB1noY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11954$r8$lambda$pN7pRaJTIlpc7wCvB_wZBB1noY(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$scApT0qgQee_pB1ihkn9CKzj8Vo(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$uN2eyASrqae2T9J_pNzDtpVqOyE(androidx.compose.runtime.State state) {
        ((kotlin.jvm.functions.Function0) state.getValue()).invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wIN2_AiB45W8IzWRIWjffEkTlS0(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(9954430);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(9954430, updateChangedFlags, -1, "com.paypal.oslo.feature.activity.ui.webview.compose.PayPalActivityCommonWebViewScreenPreview (ActivityCommonWebViewCompose.kt:145)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.webview.compose.ActivityCommonWebViewComposeKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.activity.ui.webview.compose.ActivityCommonWebViewComposeKt.$r8$lambda$p7XOPozaz5ktD9L4qfmwNIXLTt4((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState((kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 6);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.webview.compose.ActivityCommonWebViewComposeKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.activity.ui.webview.compose.ActivityCommonWebViewComposeKt.m11954$r8$lambda$pN7pRaJTIlpc7wCvB_wZBB1noY((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.runtime.State rememberUpdatedState2 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState((kotlin.jvm.functions.Function1) rememberedValue2, startRestartGroup, 6);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.webview.compose.ActivityCommonWebViewComposeKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.activity.ui.webview.compose.ActivityCommonWebViewComposeKt.$r8$lambda$UVuzj8llXlHQSpCwIti8UM1d9ow((com.paypal.oslo.core.webview.ui.callback.SecureWebViewError) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            androidx.compose.runtime.State rememberUpdatedState3 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState((kotlin.jvm.functions.Function1) rememberedValue3, startRestartGroup, 6);
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = createWebViewConfiguration$default(com.paypal.oslo.feature.debitcard.shared.ui.webview.utils.DebitCardWebViewUrlBuilder.WEB_VIEW_PRODUCTION_BASE_URL, false, createSecureWebViewCallback(rememberUpdatedState, rememberUpdatedState2, rememberUpdatedState3), 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration secureWebViewConfiguration = (com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.webview.compose.ActivityCommonWebViewComposeKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            com.paypal.oslo.core.webview.ui.compose.SecureWebViewKt.SecureWebView(secureWebViewConfiguration, (kotlin.jvm.functions.Function0) rememberedValue5, null, null, startRestartGroup, com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration.$stable | 48, 12);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.webview.compose.ActivityCommonWebViewComposeKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.webview.compose.ActivityCommonWebViewComposeKt.$r8$lambda$wIN2_AiB45W8IzWRIWjffEkTlS0(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
