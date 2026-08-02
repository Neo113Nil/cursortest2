package com.paypal.oslo.feature.bnplacquisition.ui.contentviewer;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0088\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u001b\b\u0002\u0010\u000f\u001a\u0015\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010¢\u0006\u0002\b\u0012H\u0001¢\u0006\u0002\u0010\u0013\u001aD\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u001a2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\u0002\b\u0012H\u0001¢\u0006\u0002\u0010\u001b\u001a\"\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0000\u001a\u0018\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0002¨\u0006#"}, d2 = {com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerConstants.ScreenNames.CONTENT_VIEWER_SCREEN, "", "appNavigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "source", "", "url", "html", "downloadStaticUrl", "downloadRelativePath", "downloadFileName", "viewModel", "Lcom/paypal/oslo/feature/bnplacquisition/ui/contentviewer/ContentViewerViewModel;", "sharedViewModel", "Lcom/paypal/oslo/feature/bnplacquisition/ui/shared/BnplAcquisitionSharedViewModel;", "webViewContent", "Lkotlin/Function1;", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/runtime/Composable;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/ui/contentviewer/ContentViewerViewModel;Lcom/paypal/oslo/feature/bnplacquisition/ui/shared/BnplAcquisitionSharedViewModel;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ContentViewerContent", "uiModel", "Lcom/paypal/oslo/feature/bnplacquisition/ui/contentviewer/ContentViewerUiModel;", "showDownloadButton", "", "onDownloadClick", "Lkotlin/Function0;", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/contentviewer/ContentViewerUiModel;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "buildWebViewConfig", "Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewConfiguration;", "openDocument", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "bnpl-acquisition_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ContentViewerScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:121:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ContentViewerScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerViewModel contentViewerViewModel, com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel bnplAcquisitionSharedViewModel, kotlin.jvm.functions.Function3<? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        java.lang.String str7;
        int i4;
        java.lang.String str8;
        int i5;
        int i6;
        final java.lang.String str9;
        int i7;
        final java.lang.String str10;
        java.lang.String str11;
        int i8;
        int i9;
        final java.lang.String str12;
        final kotlin.jvm.functions.Function3<? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function32;
        final java.lang.String str13;
        final java.lang.String str14;
        final java.lang.String str15;
        final com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerViewModel contentViewerViewModel2;
        final com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel bnplAcquisitionSharedViewModel2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        final java.lang.String str16;
        int i10;
        int i11;
        final com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerViewModel contentViewerViewModel3;
        com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel bnplAcquisitionSharedViewModel3;
        kotlin.jvm.functions.Function3<? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function33;
        com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel bnplAcquisitionSharedViewModel4;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty2;
        boolean z;
        androidx.compose.runtime.internal.ComposableLambda composableLambda;
        int i12;
        int i13;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-843707194);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        int i14 = i2 & 4;
        if (i14 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            str7 = str2;
            i3 |= startRestartGroup.changed(str7) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                str8 = str3;
                i3 |= startRestartGroup.changed(str8) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= startRestartGroup.changed(str4) ? 16384 : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        str9 = str5;
                    } else {
                        str9 = str5;
                        if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i3 |= startRestartGroup.changed(str9) ? 131072 : 65536;
                        }
                    }
                    i7 = i2 & 64;
                    if (i7 == 0) {
                        i3 |= 1572864;
                        str10 = str6;
                    } else {
                        str10 = str6;
                        if ((i & 1572864) == 0) {
                            i3 |= startRestartGroup.changed(str10) ? 1048576 : 524288;
                        }
                    }
                    if ((i & 12582912) == 0) {
                        if ((i2 & 128) == 0 && startRestartGroup.changedInstance(contentViewerViewModel)) {
                            i13 = 8388608;
                            i3 |= i13;
                        }
                        i13 = 4194304;
                        i3 |= i13;
                    }
                    if ((i & 100663296) != 0) {
                        str11 = "";
                        if ((i2 & 256) == 0 && startRestartGroup.changedInstance(bnplAcquisitionSharedViewModel)) {
                            i12 = 67108864;
                            i3 |= i12;
                        }
                        i12 = 33554432;
                        i3 |= i12;
                    } else {
                        str11 = "";
                    }
                    i8 = i2 & 512;
                    if (i8 == 0) {
                        i3 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i9 = i8;
                        i3 |= startRestartGroup.changedInstance(function3) ? 536870912 : 268435456;
                        if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                if (i14 != 0) {
                                    str7 = str11;
                                }
                                java.lang.String str17 = i4 != 0 ? null : str8;
                                str16 = i5 != 0 ? null : str4;
                                if (i6 != 0) {
                                    str9 = null;
                                }
                                if (i7 != 0) {
                                    str10 = null;
                                }
                                if ((i2 & 128) != 0) {
                                    androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                                    if (current == null) {
                                        throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                                    }
                                    i11 = 0;
                                    androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, startRestartGroup, 0);
                                    if (current instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                                        empty2 = ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                                    } else {
                                        empty2 = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
                                    }
                                    i10 = i9;
                                    i3 &= -29360129;
                                    contentViewerViewModel3 = (com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty2, startRestartGroup, 0, 0);
                                } else {
                                    i10 = i9;
                                    i11 = 0;
                                    contentViewerViewModel3 = contentViewerViewModel;
                                }
                                if ((i2 & 256) != 0) {
                                    androidx.view.ViewModelStoreOwner current2 = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                                    if (current2 == null) {
                                        throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                                    }
                                    androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory2 = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current2, startRestartGroup, i11);
                                    if (current2 instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                                        empty = ((androidx.view.HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras();
                                    } else {
                                        empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
                                    }
                                    bnplAcquisitionSharedViewModel3 = (com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel.class), current2, (java.lang.String) null, createHiltViewModelFactory2, empty, startRestartGroup, 0, 0);
                                    i3 &= -234881025;
                                } else {
                                    bnplAcquisitionSharedViewModel3 = bnplAcquisitionSharedViewModel;
                                }
                                function33 = i10 != 0 ? null : function3;
                                com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel bnplAcquisitionSharedViewModel5 = bnplAcquisitionSharedViewModel3;
                                str8 = str17;
                                bnplAcquisitionSharedViewModel4 = bnplAcquisitionSharedViewModel5;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 128) != 0) {
                                    i3 &= -29360129;
                                }
                                if ((i2 & 256) != 0) {
                                    i3 &= -234881025;
                                }
                                str16 = str4;
                                contentViewerViewModel3 = contentViewerViewModel;
                                bnplAcquisitionSharedViewModel4 = bnplAcquisitionSharedViewModel;
                                function33 = function3;
                            }
                            startRestartGroup.endDefaults();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-843707194, i3, -1, "com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerScreen (ContentViewerScreen.kt:57)");
                            }
                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerScreenKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerScreenKt.m12383$r8$lambda$SdvTi6jMDQBQ_RIZl82uoWqSrs(com.paypal.oslo.core.navigation.AppNavigator.this);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            final kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
                            android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            boolean changedInstance = startRestartGroup.changedInstance(bnplAcquisitionSharedViewModel4);
                            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerScreenKt$ContentViewerScreen$1$1(bnplAcquisitionSharedViewModel4, null);
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
                            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                            boolean changedInstance2 = startRestartGroup.changedInstance(contentViewerViewModel3);
                            boolean changedInstance3 = startRestartGroup.changedInstance(context);
                            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                            if ((changedInstance2 | changedInstance3) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerScreenKt$ContentViewerScreen$2$1(contentViewerViewModel3, context, null);
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 6);
                            boolean z2 = (i3 & 896) == 256;
                            boolean z3 = (i3 & 112) == 32;
                            boolean z4 = (i3 & 7168) == 2048;
                            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                            if ((z3 | z2 | z4) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue4 = buildWebViewConfig(str7, str, str8);
                                startRestartGroup.updateRememberedValue(rememberedValue4);
                            }
                            final com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration secureWebViewConfiguration = (com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration) rememberedValue4;
                            com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerUiModel uiModel = contentViewerViewModel3.getUiModel();
                            if (function33 == null) {
                                startRestartGroup.startReplaceGroup(946244210);
                                z = true;
                                androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(284537497, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerScreenKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function3
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                                        return com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerScreenKt.$r8$lambda$jcFU2Qsms3HHTGmeFmjNd0uaP7s(com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration.this, function0, (androidx.compose.ui.Modifier) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                                    }
                                }, startRestartGroup, 54);
                                startRestartGroup.endReplaceGroup();
                                composableLambda = rememberComposableLambda;
                            } else {
                                z = true;
                                startRestartGroup.startReplaceGroup(946243652);
                                startRestartGroup.endReplaceGroup();
                                composableLambda = function33;
                            }
                            boolean z5 = (str16 == null && str9 == null) ? false : z;
                            boolean changedInstance4 = startRestartGroup.changedInstance(contentViewerViewModel3);
                            com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel bnplAcquisitionSharedViewModel6 = bnplAcquisitionSharedViewModel4;
                            boolean z6 = (i3 & 57344) == 16384;
                            boolean z7 = (458752 & i3) == 131072;
                            boolean z8 = (3670016 & i3) == 1048576;
                            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                            if ((z7 | changedInstance4 | z6 | z8) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerScreenKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerScreenKt.$r8$lambda$chMjngU4e4BaNhvEzPnPNZCPmQ0(com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerViewModel.this, str16, str9, str10);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue5);
                            }
                            ContentViewerContent(uiModel, z5, (kotlin.jvm.functions.Function0) rememberedValue5, composableLambda, startRestartGroup, 0);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            str12 = str16;
                            str13 = str9;
                            str14 = str10;
                            function32 = function33;
                            contentViewerViewModel2 = contentViewerViewModel3;
                            str15 = str7;
                            bnplAcquisitionSharedViewModel2 = bnplAcquisitionSharedViewModel6;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            str12 = str4;
                            function32 = function3;
                            str13 = str9;
                            str14 = str10;
                            str15 = str7;
                            contentViewerViewModel2 = contentViewerViewModel;
                            bnplAcquisitionSharedViewModel2 = bnplAcquisitionSharedViewModel;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final java.lang.String str18 = str8;
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerScreenKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerScreenKt.m12384$r8$lambda$h81Wa1YOoPF3wNYfxLyBB84GT0(com.paypal.oslo.core.navigation.AppNavigator.this, str, str15, str18, str12, str13, str14, contentViewerViewModel2, bnplAcquisitionSharedViewModel2, function32, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i9 = i8;
                    if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                i7 = i2 & 64;
                if (i7 == 0) {
                }
                if ((i & 12582912) == 0) {
                }
                if ((i & 100663296) != 0) {
                }
                i8 = i2 & 512;
                if (i8 == 0) {
                }
                i9 = i8;
                if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            str8 = str3;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            i7 = i2 & 64;
            if (i7 == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if ((i & 100663296) != 0) {
            }
            i8 = i2 & 512;
            if (i8 == 0) {
            }
            i9 = i8;
            if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        str7 = str2;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        str8 = str3;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        i7 = i2 & 64;
        if (i7 == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if ((i & 100663296) != 0) {
        }
        i8 = i2 & 512;
        if (i8 == 0) {
        }
        i9 = i8;
        if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void ContentViewerContent(final com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerUiModel contentViewerUiModel, final boolean z, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function3<? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentViewerUiModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function3, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-347241458);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(contentViewerUiModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function3) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-347241458, i2, -1, "com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerContent (ContentViewerScreen.kt:108)");
            }
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
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
            function3.invoke(androidx.compose.foundation.layout.ColumnScope.weight$default(androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), startRestartGroup, java.lang.Integer.valueOf((i2 >> 6) & 112));
            if (z) {
                startRestartGroup.startReplaceGroup(1695453580);
                com.paypal.oslo.feature.bnplacquisition.ui.common.components.DownloadButtonKt.DownloadButton(com.paypal.oslo.core.commonui.utils.RefTextKt.value(contentViewerUiModel.getDownloadButtonText(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable), function0, androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, (i2 >> 3) & 112, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(1695655390);
                startRestartGroup.endReplaceGroup();
            }
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerScreenKt.m12386$r8$lambda$wiGn26IuLJVgteMNLxyjnMoegQ(com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerUiModel.this, z, function0, function3, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration buildWebViewConfig(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        if (str3 != null) {
            return new com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration(new com.paypal.oslo.core.webview.ui.config.SecureWebViewContent.Html(str3, str2), null, null, null, null, null, null, 126, null);
        }
        return new com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration(null, new com.paypal.oslo.core.webview.ui.config.SecureWebViewURLRequest(str, str2, false, false, null, 24, null), null, null, new com.paypal.oslo.core.webview.ui.config.SecureWebViewSettings(null, true, 1, null), null, null, 109, null);
    }

    /* renamed from: $r8$lambda$Sd-vTi6jMDQBQ_RIZl82uoWqSrs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12383$r8$lambda$SdvTi6jMDQBQ_RIZl82uoWqSrs(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerScreenKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerScreenKt.m12385$r8$lambda$nBU1nTeibMM8YNWpP0iaP05Rn8((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$chMjngU4e4BaNhvEzPnPNZCPmQ0(com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerViewModel contentViewerViewModel, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (str3 == null) {
            str3 = "";
        }
        contentViewerViewModel.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerEvent.DownloadClicked(str, str2, str3));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$h81Wa1YOoPF3wNYfxLyBB84GT-0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12384$r8$lambda$h81Wa1YOoPF3wNYfxLyBB84GT0(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerViewModel contentViewerViewModel, com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel bnplAcquisitionSharedViewModel, kotlin.jvm.functions.Function3 function3, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ContentViewerScreen(appNavigator, str, str2, str3, str4, str5, str6, contentViewerViewModel, bnplAcquisitionSharedViewModel, function3, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jcFU2Qsms3HHTGmeFmjNd0uaP7s(com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration secureWebViewConfiguration, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        if ((i & 6) == 0) {
            i |= composer.changed(modifier) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(284537497, i, -1, "com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerScreen.<anonymous> (ContentViewerScreen.kt:83)");
            }
            com.paypal.oslo.core.webview.ui.compose.SecureWebViewKt.SecureWebView(secureWebViewConfiguration, function0, modifier, null, composer, com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration.$stable | 48 | ((i << 6) & 896), 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$nBU1nT-eibMM8YNWpP0iaP05Rn8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12385$r8$lambda$nBU1nTeibMM8YNWpP0iaP05Rn8(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$wiG-n26IuLJVgteMNLxyjnMoegQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12386$r8$lambda$wiGn26IuLJVgteMNLxyjnMoegQ(com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerUiModel contentViewerUiModel, boolean z, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function3 function3, int i, androidx.compose.runtime.Composer composer, int i2) {
        ContentViewerContent(contentViewerUiModel, z, function0, function3, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ void access$openDocument(android.content.Context context, android.net.Uri uri) {
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        intent.setDataAndType(uri, "application/pdf");
        intent.addFlags(1);
        intent.addFlags(1073741824);
        try {
            context.startActivity(android.content.Intent.createChooser(intent, null));
        } catch (android.content.ActivityNotFoundException unused) {
        }
    }
}
