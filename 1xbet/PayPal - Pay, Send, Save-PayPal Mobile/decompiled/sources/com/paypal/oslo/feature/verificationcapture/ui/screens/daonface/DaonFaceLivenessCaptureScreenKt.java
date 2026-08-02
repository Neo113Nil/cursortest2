package com.paypal.oslo.feature.verificationcapture.ui.screens.daonface;

@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a9\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u000b¨\u0006\f²\u0006\n\u0010\r\u001a\u00020\u000eX\u008a\u0084\u0002²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u0084\u0002"}, d2 = {"DaonFaceLivenessCaptureScreen", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "partyId", "", com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.FIELD_FLOW_NAME, "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/DaonFaceLivenessViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/DaonFaceLivenessViewModel;Landroidx/compose/runtime/Composer;II)V", "verification-capture_prodRelease", "uiState", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/DaonFaceUiState;", "initState", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/InitializationState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DaonFaceLivenessCaptureScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DaonFaceLivenessCaptureScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.lang.String str, final java.lang.String str2, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessViewModel daonFaceLivenessViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessViewModel daonFaceLivenessViewModel2;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessViewModel daonFaceLivenessViewModel3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i4;
        int i5;
        androidx.compose.ui.Modifier modifier4;
        final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessViewModel daonFaceLivenessViewModel4;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        final android.content.Context context;
        boolean z;
        java.lang.String message;
        kotlin.Unit unit;
        boolean z2;
        boolean z3;
        boolean changedInstance;
        boolean changedInstance2;
        com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessCaptureScreenKt$DaonFaceLivenessCaptureScreen$1$1 rememberedValue;
        java.lang.String str3;
        boolean z4;
        kotlin.Unit unit2;
        int i6;
        boolean changed;
        boolean z5;
        com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessCaptureScreenKt$DaonFaceLivenessCaptureScreen$2$1 rememberedValue2;
        kotlin.coroutines.Continuation continuation;
        boolean changedInstance3;
        java.lang.Object rememberedValue3;
        java.lang.Object rememberedValue4;
        java.lang.String str4;
        int i7;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(311425533);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 256 : 128;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    daonFaceLivenessViewModel2 = daonFaceLivenessViewModel;
                    if (startRestartGroup.changedInstance(daonFaceLivenessViewModel2)) {
                        i7 = 16384;
                        i3 |= i7;
                    }
                } else {
                    daonFaceLivenessViewModel2 = daonFaceLivenessViewModel;
                }
                i7 = 8192;
                i3 |= i7;
            } else {
                daonFaceLivenessViewModel2 = daonFaceLivenessViewModel;
            }
            if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    i4 = 0;
                } else {
                    androidx.compose.ui.Modifier.Companion companion = i8 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if ((i2 & 16) == 0) {
                        i4 = 0;
                        i5 = i3;
                        modifier4 = companion;
                        daonFaceLivenessViewModel4 = daonFaceLivenessViewModel2;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(311425533, i5, -1, "com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessCaptureScreen (DaonFaceLivenessCaptureScreen.kt:61)");
                        }
                        context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                        final androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
                        android.content.res.Configuration configuration = (android.content.res.Configuration) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalConfiguration());
                        final androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(daonFaceLivenessViewModel4.getUiState(), null, startRestartGroup, i4, 1);
                        int i9 = configuration.orientation != 1 ? 1 : i4;
                        androidx.compose.runtime.State collectAsState2 = androidx.compose.runtime.SnapshotStateKt.collectAsState(daonFaceLivenessViewModel4.getInitializationState(), null, startRestartGroup, i4, 1);
                        z = ((com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.InitializationState) collectAsState2.getValue()) instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.InitializationState.Success;
                        com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.InitializationState initializationState = (com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.InitializationState) collectAsState2.getValue();
                        com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.InitializationState.Error error = !(initializationState instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.InitializationState.Error) ? (com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.InitializationState.Error) initializationState : null;
                        message = error == null ? error.getMessage() : null;
                        unit = kotlin.Unit.INSTANCE;
                        z2 = (i5 & 112) != 32;
                        z3 = (i5 & 896) != 256;
                        changedInstance = startRestartGroup.changedInstance(daonFaceLivenessViewModel4);
                        changedInstance2 = startRestartGroup.changedInstance(context);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if ((!(z2 | z3 | changedInstance) && !changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            str3 = message;
                            z4 = z;
                            unit2 = unit;
                            i6 = 4;
                            rememberedValue = new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessCaptureScreenKt$DaonFaceLivenessCaptureScreen$1$1(str, str2, daonFaceLivenessViewModel4, context, null);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        } else {
                            unit2 = unit;
                            z4 = z;
                            str3 = message;
                            i6 = 4;
                        }
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                        boolean z6 = z4;
                        changed = startRestartGroup.changed(z6);
                        int i10 = i5 & 14;
                        z5 = i10 != i6;
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if ((!changed && !z5) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            continuation = null;
                            rememberedValue2 = new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessCaptureScreenKt$DaonFaceLivenessCaptureScreen$2$1(z6, appNavigator, null);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        } else {
                            continuation = null;
                        }
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(z6), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 0);
                        kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                        changedInstance3 = startRestartGroup.changedInstance(daonFaceLivenessViewModel4);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (!changedInstance3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessCaptureScreenKt$$ExternalSyntheticLambda9
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessCaptureScreenKt.$r8$lambda$QJTkGY5BONLUL4gpceaJQANNT5I(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessViewModel.this, (androidx.compose.runtime.DisposableEffectScope) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        androidx.compose.runtime.EffectsKt.DisposableEffect(unit3, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue3, startRestartGroup, 6);
                        rememberedValue4 = startRestartGroup.rememberedValue();
                        if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceAnalyzer daonFaceAnalyzer = new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceAnalyzer(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessCaptureScreenKt$$ExternalSyntheticLambda10
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessCaptureScreenKt.m20633$r8$lambda$0U_VM9if3Aqkvp0GqCrJyjLsO8(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessViewModel.this, context, appNavigator, (com.daon.sdk.face.YUV) obj, (com.daon.sdk.face.Result) obj2);
                                }
                            }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessCaptureScreenKt$$ExternalSyntheticLambda11
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessCaptureScreenKt.m20635$r8$lambda$k57LdYt7ruuQfYQAYHpGJTCPB8(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessViewModel.this, (com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceUiState) obj);
                                }
                            }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessCaptureScreenKt$$ExternalSyntheticLambda12
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessCaptureScreenKt.$r8$lambda$DNYYjmp6WvyqKeGDVqomyVzUhyo(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessViewModel.this, appNavigator, (java.lang.String) obj);
                                }
                            }, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessCaptureScreenKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function3
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                                    return java.lang.Boolean.valueOf(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessCaptureScreenKt.m20632$r8$lambda$0QQMjIK4qcaTbPoFRpW0LHumY(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessViewModel.this, (android.graphics.Rect) obj, ((java.lang.Integer) obj2).intValue(), ((java.lang.Integer) obj3).intValue()));
                                }
                            });
                            startRestartGroup.updateRememberedValue(daonFaceAnalyzer);
                            rememberedValue4 = daonFaceAnalyzer;
                        }
                        final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceAnalyzer daonFaceAnalyzer2 = (com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceAnalyzer) rememberedValue4;
                        str4 = str3;
                        if (str4 == null) {
                            startRestartGroup.startReplaceGroup(552146684);
                            boolean changed2 = startRestartGroup.changed(str4);
                            boolean z7 = i10 == i6;
                            com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessCaptureScreenKt$DaonFaceLivenessCaptureScreen$4$1 rememberedValue5 = startRestartGroup.rememberedValue();
                            if ((changed2 | z7) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue5 = new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessCaptureScreenKt$DaonFaceLivenessCaptureScreen$4$1(str4, appNavigator, continuation);
                                startRestartGroup.updateRememberedValue(rememberedValue5);
                            }
                            androidx.compose.runtime.EffectsKt.LaunchedEffect(str4, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, startRestartGroup, 0);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(552585861);
                            startRestartGroup.endReplaceGroup();
                        }
                        androidx.compose.ui.Modifier m1286backgroundbw27NRU$default = androidx.compose.foundation.BackgroundKt.m1286backgroundbw27NRU$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, continuation), androidx.compose.ui.graphics.Color.INSTANCE.m6022getBlack0d7_KjU(), null, 2, null);
                        final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessViewModel daonFaceLivenessViewModel5 = daonFaceLivenessViewModel4;
                        final boolean z8 = i9;
                        androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1036172185, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessCaptureScreenKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function3
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                                return com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessCaptureScreenKt.$r8$lambda$9IHwvceukBRwxrLtrq96vO6zth0(androidx.compose.ui.unit.Density.this, daonFaceLivenessViewModel5, daonFaceAnalyzer2, z8, appNavigator, collectAsState, (androidx.compose.foundation.layout.BoxWithConstraintsScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                            }
                        }, startRestartGroup, 54);
                        composer2 = startRestartGroup;
                        com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessViewModel daonFaceLivenessViewModel6 = daonFaceLivenessViewModel4;
                        androidx.compose.ui.Modifier modifier5 = modifier4;
                        androidx.compose.foundation.layout.BoxWithConstraintsKt.BoxWithConstraints(m1286backgroundbw27NRU$default, null, false, rememberComposableLambda, composer2, 3072, 6);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier5;
                        daonFaceLivenessViewModel3 = daonFaceLivenessViewModel6;
                    } else {
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
                        i4 = 0;
                        i3 &= -57345;
                        daonFaceLivenessViewModel2 = (com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                        modifier2 = companion;
                    }
                }
                modifier4 = modifier2;
                daonFaceLivenessViewModel4 = daonFaceLivenessViewModel2;
                i5 = i3;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                final androidx.compose.ui.unit.Density density2 = (androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
                android.content.res.Configuration configuration2 = (android.content.res.Configuration) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalConfiguration());
                final androidx.compose.runtime.State collectAsState3 = androidx.compose.runtime.SnapshotStateKt.collectAsState(daonFaceLivenessViewModel4.getUiState(), null, startRestartGroup, i4, 1);
                if (configuration2.orientation != 1) {
                }
                androidx.compose.runtime.State collectAsState22 = androidx.compose.runtime.SnapshotStateKt.collectAsState(daonFaceLivenessViewModel4.getInitializationState(), null, startRestartGroup, i4, 1);
                z = ((com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.InitializationState) collectAsState22.getValue()) instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.InitializationState.Success;
                com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.InitializationState initializationState2 = (com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.InitializationState) collectAsState22.getValue();
                if (!(initializationState2 instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.InitializationState.Error)) {
                }
                if (error == null) {
                }
                unit = kotlin.Unit.INSTANCE;
                if ((i5 & 112) != 32) {
                }
                if ((i5 & 896) != 256) {
                }
                changedInstance = startRestartGroup.changedInstance(daonFaceLivenessViewModel4);
                changedInstance2 = startRestartGroup.changedInstance(context);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!(z2 | z3 | changedInstance | changedInstance2)) {
                }
                str3 = message;
                z4 = z;
                unit2 = unit;
                i6 = 4;
                rememberedValue = new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessCaptureScreenKt$DaonFaceLivenessCaptureScreen$1$1(str, str2, daonFaceLivenessViewModel4, context, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                boolean z62 = z4;
                changed = startRestartGroup.changed(z62);
                int i102 = i5 & 14;
                if (i102 != i6) {
                }
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!(changed | z5)) {
                }
                continuation = null;
                rememberedValue2 = new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessCaptureScreenKt$DaonFaceLivenessCaptureScreen$2$1(z62, appNavigator, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(z62), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 0);
                kotlin.Unit unit32 = kotlin.Unit.INSTANCE;
                changedInstance3 = startRestartGroup.changedInstance(daonFaceLivenessViewModel4);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changedInstance3) {
                }
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessCaptureScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessCaptureScreenKt.$r8$lambda$QJTkGY5BONLUL4gpceaJQANNT5I(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessViewModel.this, (androidx.compose.runtime.DisposableEffectScope) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
                androidx.compose.runtime.EffectsKt.DisposableEffect(unit32, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue3, startRestartGroup, 6);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceAnalyzer daonFaceAnalyzer22 = (com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceAnalyzer) rememberedValue4;
                str4 = str3;
                if (str4 == null) {
                }
                androidx.compose.ui.Modifier m1286backgroundbw27NRU$default2 = androidx.compose.foundation.BackgroundKt.m1286backgroundbw27NRU$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, continuation), androidx.compose.ui.graphics.Color.INSTANCE.m6022getBlack0d7_KjU(), null, 2, null);
                final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessViewModel daonFaceLivenessViewModel52 = daonFaceLivenessViewModel4;
                final boolean z82 = i9;
                androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda2 = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1036172185, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessCaptureScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function3
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessCaptureScreenKt.$r8$lambda$9IHwvceukBRwxrLtrq96vO6zth0(androidx.compose.ui.unit.Density.this, daonFaceLivenessViewModel52, daonFaceAnalyzer22, z82, appNavigator, collectAsState3, (androidx.compose.foundation.layout.BoxWithConstraintsScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                }, startRestartGroup, 54);
                composer2 = startRestartGroup;
                com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessViewModel daonFaceLivenessViewModel62 = daonFaceLivenessViewModel4;
                androidx.compose.ui.Modifier modifier52 = modifier4;
                androidx.compose.foundation.layout.BoxWithConstraintsKt.BoxWithConstraints(m1286backgroundbw27NRU$default2, null, false, rememberComposableLambda2, composer2, 3072, 6);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
                daonFaceLivenessViewModel3 = daonFaceLivenessViewModel62;
            } else {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
                daonFaceLivenessViewModel3 = daonFaceLivenessViewModel2;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessCaptureScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessCaptureScreenKt.$r8$lambda$FifGfKFEJ9otRliG_uaqnhdXbhI(com.paypal.oslo.core.navigation.AppNavigator.this, str, str2, modifier3, daonFaceLivenessViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 24576) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$0QQMjIK4qc-aTbPoFRpW0L-HumY, reason: not valid java name */
    public static /* synthetic */ boolean m20632$r8$lambda$0QQMjIK4qcaTbPoFRpW0LHumY(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessViewModel daonFaceLivenessViewModel, android.graphics.Rect rect, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rect, "");
        return daonFaceLivenessViewModel.checkFaceInOval(rect, i, i2);
    }

    /* renamed from: $r8$lambda$0U_VM9if-3Aqkvp0GqCrJyjLsO8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20633$r8$lambda$0U_VM9if3Aqkvp0GqCrJyjLsO8(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessViewModel daonFaceLivenessViewModel, android.content.Context context, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.daon.sdk.face.YUV yuv, com.daon.sdk.face.Result result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(yuv, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        com.paypal.android.logger.Logger log = com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog();
        float score = result.getQualityResult().getScore();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[DaonFace] Best image captured (quality=");
        sb.append(score);
        sb.append(")");
        com.paypal.android.logger.Logger.i$default(log, sb.toString(), null, null, 6, null);
        final com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult processCaptureResult = daonFaceLivenessViewModel.processCaptureResult(yuv, result, context);
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessCaptureScreenKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessCaptureScreenKt.$r8$lambda$7QmT9vOltWRHJEwl0rGI4tUlJvI(com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7QmT9vOltWRHJEwl0rGI4tUlJvI(com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult daonFaceLivenessNavResult, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(daonFaceLivenessNavResult);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9IHwvceukBRwxrLtrq96vO6zth0(androidx.compose.ui.unit.Density density, final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessViewModel daonFaceLivenessViewModel, com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceAnalyzer daonFaceAnalyzer, final boolean z, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.State state, androidx.compose.foundation.layout.BoxWithConstraintsScope boxWithConstraintsScope, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(boxWithConstraintsScope, "");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(boxWithConstraintsScope) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1036172185, i2, -1, "com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessCaptureScreen.<anonymous> (DaonFaceLivenessCaptureScreen.kt:170)");
            }
            int mo1418toPx0680j_4 = (int) density.mo1418toPx0680j_4(boxWithConstraintsScope.mo1624getMaxWidthD9Ej5fM());
            int mo1418toPx0680j_42 = (int) density.mo1418toPx0680j_4(boxWithConstraintsScope.mo1623getMaxHeightD9Ej5fM());
            boolean changed = composer.changed(mo1418toPx0680j_4);
            boolean changed2 = composer.changed(mo1418toPx0680j_42);
            boolean changedInstance = composer.changedInstance(daonFaceLivenessViewModel);
            com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessCaptureScreenKt$DaonFaceLivenessCaptureScreen$5$1$1 rememberedValue = composer.rememberedValue();
            if ((changed | changed2 | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessCaptureScreenKt$DaonFaceLivenessCaptureScreen$5$1$1(mo1418toPx0680j_4, mo1418toPx0680j_42, daonFaceLivenessViewModel, null);
                composer.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Integer.valueOf(mo1418toPx0680j_4), java.lang.Integer.valueOf(mo1418toPx0680j_42), (kotlin.jvm.functions.Function2) rememberedValue, composer, 0);
            com.daon.sdk.face.DaonFace getHighSpeedVideoSizes = daonFaceLivenessViewModel.getGetHighSpeedVideoSizes();
            boolean changedInstance2 = composer.changedInstance(daonFaceLivenessViewModel);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessCaptureScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        android.graphics.Rect ovalRect;
                        ovalRect = com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessViewModel.this.getOvalRect();
                        return ovalRect;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            boolean changed3 = composer.changed(z);
            boolean changedInstance3 = composer.changedInstance(daonFaceLivenessViewModel);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if ((changed3 | changedInstance3) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessCaptureScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessCaptureScreenKt.$r8$lambda$B0rYTYDn7r8U3RoqoENZ8PAsWcU(z, daonFaceLivenessViewModel, ((java.lang.Integer) obj).intValue(), ((java.lang.Integer) obj2).intValue());
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonCameraViewKt.DaonCameraView(getHighSpeedVideoSizes, daonFaceAnalyzer, function0, mo1418toPx0680j_4, mo1418toPx0680j_42, z, fillMaxSize$default, (kotlin.jvm.functions.Function2) rememberedValue3, null, composer, 1572864, 256);
            com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalGuideViewKt.OvalGuideView(((com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceUiState) state.getValue()).getOvalRect(), ((com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceUiState) state.getValue()).getOvalStrokeColor(), androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), composer, 384, 0);
            if (((com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceUiState) state.getValue()).getBlinkTextVisible()) {
                composer.startReplaceGroup(-673909669);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-674059585);
                com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalGuideViewKt.TutorialText(((com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceUiState) state.getValue()).getTutorialTextVisible(), androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), composer, 48, 0);
                composer.endReplaceGroup();
            }
            com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalGuideViewKt.BlinkText(((com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceUiState) state.getValue()).getBlinkTextVisible(), androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), composer, 48, 0);
            com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalGuideViewKt.WarningMessageView(((com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceUiState) state.getValue()).getWarningMessage(), androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), composer, 48, 0);
            boolean changed4 = composer.changed(appNavigator);
            java.lang.Object rememberedValue4 = composer.rememberedValue();
            if (changed4 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessCaptureScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessCaptureScreenKt.$r8$lambda$CNLfc2rbos_X8uXHVRofmsLpyyw(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
            }
            com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceCaptureOverlayKt.DaonFaceCaptureOverlay((kotlin.jvm.functions.Function0) rememberedValue4, null, composer, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$B0rYTYDn7r8U3RoqoENZ8PAsWcU(boolean z, com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessViewModel daonFaceLivenessViewModel, int i, int i2) {
        com.paypal.android.logger.Logger log = com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[DaonFace] Camera started with size: ");
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        sb.append(", portrait=");
        sb.append(z);
        com.paypal.android.logger.Logger.i$default(log, sb.toString(), null, null, 6, null);
        daonFaceLivenessViewModel.setCameraImageSize(i, i2, z);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CNLfc2rbos_X8uXHVRofmsLpyyw(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "[DaonFace] User clicked close", null, null, 6, null);
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessCaptureScreenKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessCaptureScreenKt.m20634$r8$lambda$MmKPVF1T9YXX4LbVHfPPYNnDY((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$DNYYjmp6WvyqKeGDVqomyVzUhyo(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessViewModel daonFaceLivenessViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "[DaonFace] Analyzer error", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error_message", str)), null, null, 12, null);
        daonFaceLivenessViewModel.handleError(new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceError(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceError.ErrorCode.SDK_FAILURE, str));
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessCaptureScreenKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessCaptureScreenKt.$r8$lambda$xrO2JfXv22b0Ct5fT8q0brxTnNY(str, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$FifGfKFEJ9otRliG_uaqnhdXbhI(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, java.lang.String str2, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessViewModel daonFaceLivenessViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        DaonFaceLivenessCaptureScreen(appNavigator, str, str2, modifier, daonFaceLivenessViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$MmKPVF1T9-YX-X4LbVHfPPYNnDY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20634$r8$lambda$MmKPVF1T9YXX4LbVHfPPYNnDY(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult.Cancelled.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.runtime.DisposableEffectResult $r8$lambda$QJTkGY5BONLUL4gpceaJQANNT5I(final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessViewModel daonFaceLivenessViewModel, androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disposableEffectScope, "");
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessCaptureScreenKt$DaonFaceLivenessCaptureScreen$lambda$4$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "[DaonFace] Disposing screen and releasing resources", null, null, 6, null);
                com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessViewModel.this.cleanup();
            }
        };
    }

    /* renamed from: $r8$lambda$k57LdYt7ruuQfYQA-YHpGJTCPB8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20635$r8$lambda$k57LdYt7ruuQfYQAYHpGJTCPB8(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessViewModel daonFaceLivenessViewModel, com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceUiState daonFaceUiState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(daonFaceUiState, "");
        daonFaceLivenessViewModel.updateUiState(daonFaceUiState);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xrO2JfXv22b0Ct5fT8q0brxTnNY(java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult.Error("ANALYSIS_FAILED", str));
        return kotlin.Unit.INSTANCE;
    }
}
