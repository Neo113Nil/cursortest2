package com.paypal.oslo.feature.inappcheckout.ui.error.screen;

@kotlin.Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\u001a?\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f\u001aW\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0014\u001a@\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u000e\u001a\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0010H\u0002\u001a%\u0010\u0018\u001a\u00020\u00012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u001a\u001a\u0015\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u0017H\u0003¢\u0006\u0002\u0010\u001d\u001a\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u000e\u001a\u00020\u0007H\u0002\u001a\b\u0010 \u001a\u00020\u001fH\u0002\u001a\r\u0010!\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\"\u001a\r\u0010#\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\"\u001a\r\u0010$\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\"¨\u0006%"}, d2 = {"ErrorScreen", "", "inAppCheckoutCoordinator", "Lcom/paypal/oslo/feature/inappcheckout/navigation/coordinator/InAppCheckoutCoordinator;", "modifier", "Landroidx/compose/ui/Modifier;", "errorScreenType", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/ErrorScreenType;", "returnUrl", "", "viewModel", "Lcom/paypal/oslo/feature/inappcheckout/ui/error/viewmodel/ErrorViewModel;", "(Lcom/paypal/oslo/feature/inappcheckout/navigation/coordinator/InAppCheckoutCoordinator;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/inappcheckout/domain/model/ErrorScreenType;Ljava/lang/String;Lcom/paypal/oslo/feature/inappcheckout/ui/error/viewmodel/ErrorViewModel;Landroidx/compose/runtime/Composer;II)V", "ErrorScreenContent", "errorType", "onRetry", "Lkotlin/Function0;", "onReturnToMerchant", "onCheckAccount", "onContactUs", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/ErrorScreenType;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "getButtonConfigurations", "", "Lcom/paypal/oslo/feature/inappcheckout/ui/error/screen/ButtonConfig;", "ErrorActionButtons", "buttonConfigs", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ErrorButton", "config", "(Lcom/paypal/oslo/feature/inappcheckout/ui/error/screen/ButtonConfig;Landroidx/compose/runtime/Composer;I)V", "getErrorTitle", "", "getErrorDescription", "RecoverableErrorPreview", "(Landroidx/compose/runtime/Composer;I)V", "NonRecoverableErrorPreview", "BuyerRestrictionTabletPreview", "inappcheckout_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ErrorScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:110:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ErrorScreen(final com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator inAppCheckoutCoordinator, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType errorScreenType, java.lang.String str, com.paypal.oslo.feature.inappcheckout.ui.error.viewmodel.ErrorViewModel errorViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        int i5;
        java.lang.String str2;
        com.paypal.oslo.feature.inappcheckout.ui.error.viewmodel.ErrorViewModel errorViewModel2;
        androidx.compose.runtime.Composer composer2;
        final com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType errorScreenType2;
        final androidx.compose.ui.Modifier modifier3;
        final java.lang.String str3;
        final com.paypal.oslo.feature.inappcheckout.ui.error.viewmodel.ErrorViewModel errorViewModel3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i6;
        int i7;
        androidx.compose.ui.Modifier modifier4;
        com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType errorScreenType3;
        java.lang.String str4;
        final com.paypal.oslo.feature.inappcheckout.ui.error.viewmodel.ErrorViewModel errorViewModel4;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        androidx.compose.runtime.Composer composer3;
        int i8;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inAppCheckoutCoordinator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1238833487);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(inAppCheckoutCoordinator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= startRestartGroup.changed(errorScreenType == null ? -1 : errorScreenType.ordinal()) ? 256 : 128;
            }
            i5 = i2 & 8;
            if (i5 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                str2 = str;
                i3 |= startRestartGroup.changed(str2) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        errorViewModel2 = errorViewModel;
                        if (startRestartGroup.changedInstance(errorViewModel2)) {
                            i8 = 16384;
                            i3 |= i8;
                        }
                    } else {
                        errorViewModel2 = errorViewModel;
                    }
                    i8 = 8192;
                    i3 |= i8;
                } else {
                    errorViewModel2 = errorViewModel;
                }
                if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        errorScreenType3 = errorScreenType;
                        i7 = i3;
                        modifier4 = modifier2;
                        str4 = str2;
                        errorViewModel4 = errorViewModel2;
                        i6 = -1;
                    } else {
                        androidx.compose.ui.Modifier.Companion companion = i9 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType errorScreenType4 = i4 != 0 ? com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType.NON_RECOVERABLE : errorScreenType;
                        java.lang.String str5 = i5 != 0 ? null : str2;
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
                            i6 = -1;
                            modifier4 = companion;
                            errorScreenType3 = errorScreenType4;
                            str4 = str5;
                            errorViewModel4 = (com.paypal.oslo.feature.inappcheckout.ui.error.viewmodel.ErrorViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.inappcheckout.ui.error.viewmodel.ErrorViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                            i7 = i3 & (-57345);
                        } else {
                            i6 = -1;
                            i7 = i3;
                            modifier4 = companion;
                            errorScreenType3 = errorScreenType4;
                            str4 = str5;
                            errorViewModel4 = errorViewModel2;
                        }
                    }
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1238833487, i7, i6, "com.paypal.oslo.feature.inappcheckout.ui.error.screen.ErrorScreen (ErrorScreen.kt:77)");
                    }
                    android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    boolean changedInstance = startRestartGroup.changedInstance(errorViewModel4);
                    boolean z = (i7 & 896) == 256;
                    boolean z2 = (i7 & 14) == 4;
                    boolean z3 = (i7 & 7168) == 2048;
                    boolean changedInstance2 = startRestartGroup.changedInstance(context);
                    com.paypal.oslo.feature.inappcheckout.ui.error.screen.ErrorScreenKt$ErrorScreen$1$1 rememberedValue = startRestartGroup.rememberedValue();
                    if (((changedInstance | z | z2 | z3) || changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        composer3 = startRestartGroup;
                        rememberedValue = new com.paypal.oslo.feature.inappcheckout.ui.error.screen.ErrorScreenKt$ErrorScreen$1$1(errorViewModel4, errorScreenType3, inAppCheckoutCoordinator, str4, context, null);
                        composer3.updateRememberedValue(rememberedValue);
                    } else {
                        composer3 = startRestartGroup;
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, composer3, 6);
                    boolean changedInstance3 = composer3.changedInstance(errorViewModel4);
                    java.lang.Object rememberedValue2 = composer3.rememberedValue();
                    if (changedInstance3 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.ui.error.screen.ErrorScreenKt$$ExternalSyntheticLambda13
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.inappcheckout.ui.error.screen.ErrorScreenKt.$r8$lambda$jDuFDSRLvRsPWIubN1gH4c3klo8(com.paypal.oslo.feature.inappcheckout.ui.error.viewmodel.ErrorViewModel.this);
                            }
                        };
                        composer3.updateRememberedValue(rememberedValue2);
                    }
                    kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
                    boolean changedInstance4 = composer3.changedInstance(errorViewModel4);
                    java.lang.Object rememberedValue3 = composer3.rememberedValue();
                    if (changedInstance4 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.ui.error.screen.ErrorScreenKt$$ExternalSyntheticLambda14
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.inappcheckout.ui.error.screen.ErrorScreenKt.$r8$lambda$SgwoWCtOcXNFR2u2V0rIGHidOrQ(com.paypal.oslo.feature.inappcheckout.ui.error.viewmodel.ErrorViewModel.this);
                            }
                        };
                        composer3.updateRememberedValue(rememberedValue3);
                    }
                    kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue3;
                    boolean changedInstance5 = composer3.changedInstance(errorViewModel4);
                    java.lang.Object rememberedValue4 = composer3.rememberedValue();
                    if (changedInstance5 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.ui.error.screen.ErrorScreenKt$$ExternalSyntheticLambda15
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.inappcheckout.ui.error.screen.ErrorScreenKt.$r8$lambda$X5VwLERXWpxRwBR7mWNcKCRvPZA(com.paypal.oslo.feature.inappcheckout.ui.error.viewmodel.ErrorViewModel.this);
                            }
                        };
                        composer3.updateRememberedValue(rememberedValue4);
                    }
                    kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue4;
                    boolean changedInstance6 = composer3.changedInstance(errorViewModel4);
                    java.lang.Object rememberedValue5 = composer3.rememberedValue();
                    if (changedInstance6 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.ui.error.screen.ErrorScreenKt$$ExternalSyntheticLambda16
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.inappcheckout.ui.error.screen.ErrorScreenKt.$r8$lambda$PSRQ8E6__ynUGzRtWn0FExcrzvI(com.paypal.oslo.feature.inappcheckout.ui.error.viewmodel.ErrorViewModel.this);
                            }
                        };
                        composer3.updateRememberedValue(rememberedValue5);
                    }
                    composer2 = composer3;
                    com.paypal.oslo.feature.inappcheckout.ui.error.viewmodel.ErrorViewModel errorViewModel5 = errorViewModel4;
                    getHighSpeedVideoFpsRangesFor(errorScreenType3, function0, function02, function03, (kotlin.jvm.functions.Function0) rememberedValue5, modifier4, composer2, ((i7 >> 6) & 14) | ((i7 << 12) & 458752), 0);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    errorViewModel3 = errorViewModel5;
                    modifier3 = modifier4;
                    errorScreenType2 = errorScreenType3;
                    str3 = str4;
                } else {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    errorScreenType2 = errorScreenType;
                    modifier3 = modifier2;
                    str3 = str2;
                    errorViewModel3 = errorViewModel2;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.error.screen.ErrorScreenKt$$ExternalSyntheticLambda17
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.inappcheckout.ui.error.screen.ErrorScreenKt.m15524$r8$lambda$3NFYOz2yAkmDpkhZOwoAjhLknI(com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.this, modifier3, errorScreenType2, str3, errorViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            str2 = str;
            if ((i & 24576) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        str2 = str;
        if ((i & 24576) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighSpeedVideoFpsRangesFor(final com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType errorScreenType, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function0<kotlin.Unit> function03, final kotlin.jvm.functions.Function0<kotlin.Unit> function04, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        float f;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-531863529);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(errorScreenType.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function03) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function04) ? 16384 : 8192;
        }
        int i4 = i2 & 32;
        if (i4 != 0) {
            i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((196608 & i) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 131072 : 65536;
            if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-531863529, i3, -1, "com.paypal.oslo.feature.inappcheckout.ui.error.screen.ErrorScreenContent (ErrorScreen.kt:122)");
                }
                android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                androidx.compose.ui.Modifier modifier4 = modifier3;
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.ScrollKt.verticalScroll$default(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2), androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null), com.paypal.pds.core.ConstantsKt.getSize20(), 0.0f, 2, null), com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutTestTags.ERROR_SCREEN_ROOT);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 48);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag);
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
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize24()), startRestartGroup, 0);
                androidx.compose.foundation.ImageKt.Image(androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.paypal.oslo.feature.inappcheckout.R.drawable.feature_inappcheckout_paypal_logo, startRestartGroup, 0), "PayPal", androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.m1744sizeInqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.m1742sizeVpY3zN4(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(90.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(32.0f)), 0.0f, 0.0f, androidx.compose.ui.unit.Dp.m8601constructorimpl(250.0f), 0.0f, 11, null), com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutTestTags.ERROR_SCREEN_PAYPAL_LOGO), (androidx.compose.ui.Alignment) null, androidx.compose.ui.layout.ContentScale.INSTANCE.getInside(), 0.0f, (androidx.compose.ui.graphics.ColorFilter) null, startRestartGroup, androidx.compose.ui.graphics.painter.Painter.$stable | 25008, 104);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize24()), startRestartGroup, 0);
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.rememberStringValue(context, getHighSpeedVideoSizes(errorScreenType), new java.lang.Object[0], startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), "error_screen_title"), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8448getStarte0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingSmall.INSTANCE, startRestartGroup, 432, 6, 1000);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize16()), startRestartGroup, 0);
                if (errorScreenType == com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType.BUYER_RESTRICTION) {
                    startRestartGroup.startReplaceGroup(-812153243);
                    java.lang.String rememberStringValue = com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.rememberStringValue(context, com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_buyer_restriction_error_description_prefix, new java.lang.Object[0], startRestartGroup, 0);
                    java.lang.String rememberStringValue2 = com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.rememberStringValue(context, com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_contact_us, new java.lang.Object[0], startRestartGroup, 0);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(rememberStringValue);
                    sb.append(" ");
                    sb.append(rememberStringValue2);
                    com.paypal.pds.core.RichText richText = com.paypal.pds.core.RichTextKt.toRichText(sb.toString(), kotlin.collections.CollectionsKt.listOf(kotlin.TuplesKt.to(rememberStringValue2, com.paypal.oslo.feature.inappcheckout.Constants.CONTACT_US_LINK_ID)));
                    com.paypal.pds.core.Typography.BodyLarge bodyLarge = com.paypal.pds.core.Typography.BodyLarge.INSTANCE;
                    com.paypal.pds.core.Color.ContentBase contentBase = com.paypal.pds.core.Color.ContentBase.INSTANCE;
                    int m8448getStarte0LSkKk = androidx.compose.ui.text.style.TextAlign.INSTANCE.m8448getStarte0LSkKk();
                    androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), "error_screen_description");
                    com.paypal.pds.core.Color.ContentBase contentBase2 = contentBase;
                    androidx.compose.ui.text.style.TextAlign m8436boximpl = androidx.compose.ui.text.style.TextAlign.m8436boximpl(m8448getStarte0LSkKk);
                    boolean z = (i3 & 57344) == 16384;
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.error.screen.ErrorScreenKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.inappcheckout.ui.error.screen.ErrorScreenKt.$r8$lambda$lsAvUjKl3Acl4qkGn7Z8ww8P9jw(kotlin.jvm.functions.Function0.this, (java.lang.String) obj, (java.lang.String) obj2);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    f = 0.0f;
                    com.paypal.pds.components.LabelKt.m21916LabeljZ06gk0(richText, testTag2, contentBase2, null, m8436boximpl, null, false, 0, 0, null, (kotlin.jvm.functions.Function2) rememberedValue, bodyLarge, null, startRestartGroup, 432, 48, 5096);
                    startRestartGroup.endReplaceGroup();
                } else {
                    f = 0.0f;
                    startRestartGroup.startReplaceGroup(-811017589);
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.rememberStringValue(context, com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_recoverable_error_description, new java.lang.Object[0], startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), "error_screen_description"), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8448getStarte0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyLarge.INSTANCE, startRestartGroup, 432, 6, 1000);
                    startRestartGroup.endReplaceGroup();
                }
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), startRestartGroup, 0);
                androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.inappcheckout.ui.error.screen.ErrorScreenKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function3
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                            return com.paypal.oslo.feature.inappcheckout.ui.error.screen.ErrorScreenKt.m15527$r8$lambda$NJHcDI9WWhBnpZN6lhevKocWaY((androidx.compose.ui.layout.MeasureScope) obj, (androidx.compose.ui.layout.Measurable) obj2, (androidx.compose.ui.unit.Constraints) obj3);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                com.paypal.pds.components.DividerKt.Divider(androidx.compose.ui.layout.LayoutModifierKt.layout(companion, (kotlin.jvm.functions.Function3) rememberedValue2), startRestartGroup, 0, 0);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize16()), startRestartGroup, 0);
                getHighSpeedVideoSizes(getHighSpeedVideoFpsRanges(errorScreenType, function0, function02, function03), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, f, 1, null), startRestartGroup, 48, 0);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize32()), startRestartGroup, 0);
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.error.screen.ErrorScreenKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.inappcheckout.ui.error.screen.ErrorScreenKt.$r8$lambda$7gIohINLPXGGOCiRVRvdgfbbHTg(com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType.this, function0, function02, function03, function04, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final java.util.List<com.paypal.oslo.feature.inappcheckout.ui.error.screen.ButtonConfig> getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType errorScreenType, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function0<kotlin.Unit> function03) {
        int i = com.paypal.oslo.feature.inappcheckout.ui.error.screen.ErrorScreenKt.WhenMappings.$EnumSwitchMapping$0[errorScreenType.ordinal()];
        if (i == 1) {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.inappcheckout.ui.error.screen.ButtonConfig[]{new com.paypal.oslo.feature.inappcheckout.ui.error.screen.ButtonConfig(com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_try_again, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, "error_screen_primary_button", function0), new com.paypal.oslo.feature.inappcheckout.ui.error.screen.ButtonConfig(com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_return_to_merchant, com.paypal.pds.components.ButtonStyle.Outline.INSTANCE, "error_screen_secondary_button", function02)});
        }
        if (i == 2) {
            return kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.inappcheckout.ui.error.screen.ButtonConfig(com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_return_to_merchant, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, "error_screen_primary_button", function02));
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.inappcheckout.ui.error.screen.ButtonConfig[]{new com.paypal.oslo.feature.inappcheckout.ui.error.screen.ButtonConfig(com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_check_your_account, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, "error_screen_primary_button", function03), new com.paypal.oslo.feature.inappcheckout.ui.error.screen.ButtonConfig(com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_return_to_merchant, com.paypal.pds.components.ButtonStyle.Outline.INSTANCE, "error_screen_secondary_button", function02)});
    }

    private static final void getHighSpeedVideoSizes(final java.util.List<com.paypal.oslo.feature.inappcheckout.ui.error.screen.ButtonConfig> list, final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-531655453);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-531655453, i3, -1, "com.paypal.oslo.feature.inappcheckout.ui.error.screen.ErrorActionButtons (ErrorScreen.kt:304)");
            }
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSize16()), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, modifier);
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
            startRestartGroup.startReplaceGroup(-759685921);
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.feature.inappcheckout.ui.error.screen.ButtonConfig) it.next(), startRestartGroup, 0);
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.error.screen.ErrorScreenKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.inappcheckout.ui.error.screen.ErrorScreenKt.$r8$lambda$TjdXAlc2UkxF2YoVmDuZdVetKcE(list, modifier, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighResolutionOutputSizeshNQ4ISI(final com.paypal.oslo.feature.inappcheckout.ui.error.screen.ButtonConfig buttonConfig, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2011066783);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(buttonConfig) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2011066783, i2, -1, "com.paypal.oslo.feature.inappcheckout.ui.error.screen.ErrorButton (ErrorScreen.kt:320)");
            }
            com.paypal.pds.components.ButtonKt.Button(buttonConfig.getHighSpeedVideoFpsRangesFor, com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.rememberStringValue((android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext()), buttonConfig.getHighSpeedVideoFpsRanges, new java.lang.Object[0], startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), buttonConfig.getHighResolutionOutputSizeshNQ4ISI), null, null, buttonConfig.getHighSpeedVideoSizes, com.paypal.pds.components.ButtonSize.Large.INSTANCE, false, false, startRestartGroup, 1572864, 408);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.error.screen.ErrorScreenKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.inappcheckout.ui.error.screen.ErrorScreenKt.$r8$lambda$dari8dYQyR25hM2LhLDy5nYEJvg(com.paypal.oslo.feature.inappcheckout.ui.error.screen.ButtonConfig.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final int getHighSpeedVideoSizes(com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType errorScreenType) {
        int i = com.paypal.oslo.feature.inappcheckout.ui.error.screen.ErrorScreenKt.WhenMappings.$EnumSwitchMapping$0[errorScreenType.ordinal()];
        if (i == 1 || i == 2) {
            return com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_recoverable_error_title;
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_buyer_restriction_error_title;
    }

    /* renamed from: $r8$lambda$3NFYOz2yAkm-DpkhZOwoAjhLknI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15524$r8$lambda$3NFYOz2yAkmDpkhZOwoAjhLknI(com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator inAppCheckoutCoordinator, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType errorScreenType, java.lang.String str, com.paypal.oslo.feature.inappcheckout.ui.error.viewmodel.ErrorViewModel errorViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ErrorScreen(inAppCheckoutCoordinator, modifier, errorScreenType, str, errorViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7Yn_P1PSLnJ6MlWily1H5IHQ3ZY(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(244451897);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(244451897, updateChangedFlags, -1, "com.paypal.oslo.feature.inappcheckout.ui.error.screen.RecoverableErrorPreview (ErrorScreen.kt:356)");
            }
            com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType errorScreenType = com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType.RECOVERABLE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.ui.error.screen.ErrorScreenKt$$ExternalSyntheticLambda1
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
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.ui.error.screen.ErrorScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.ui.error.screen.ErrorScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.ui.error.screen.ErrorScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            getHighSpeedVideoFpsRangesFor(errorScreenType, function0, function02, function03, (kotlin.jvm.functions.Function0) rememberedValue4, null, startRestartGroup, 28086, 32);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.error.screen.ErrorScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.inappcheckout.ui.error.screen.ErrorScreenKt.$r8$lambda$7Yn_P1PSLnJ6MlWily1H5IHQ3ZY(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7gIohINLPXGGOCiRVRvdgfbbHTg(com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType errorScreenType, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, kotlin.jvm.functions.Function0 function04, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoFpsRangesFor(errorScreenType, function0, function02, function03, function04, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$NJ-HcDI9WWhBnpZN6lhevKocWaY, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.layout.MeasureResult m15527$r8$lambda$NJHcDI9WWhBnpZN6lhevKocWaY(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, androidx.compose.ui.unit.Constraints constraints) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(measureScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(measurable, "");
        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(constraints.getGetHighSpeedVideoFpsRangesFor(), 0, androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(constraints.getGetHighSpeedVideoFpsRangesFor()) + (measureScope.mo1412roundToPx0680j_4(com.paypal.pds.core.ConstantsKt.getSize20()) * 2), 0, 0, 13, null));
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, mo7353measureBRTryo0.getWidth(), mo7353measureBRTryo0.getHeight(), null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.ui.error.screen.ErrorScreenKt$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.inappcheckout.ui.error.screen.ErrorScreenKt.$r8$lambda$PMoe0OVPq33vf3tF9JCdy5OGwiM(androidx.compose.ui.layout.Placeable.this, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PMoe0OVPq33vf3tF9JCdy5OGwiM(androidx.compose.ui.layout.Placeable placeable, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementScope, "");
        androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeable, -placementScope.mo1412roundToPx0680j_4(com.paypal.pds.core.ConstantsKt.getSize20()), 0, 0.0f, 4, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PSRQ8E6__ynUGzRtWn0FExcrzvI(com.paypal.oslo.feature.inappcheckout.ui.error.viewmodel.ErrorViewModel errorViewModel) {
        errorViewModel.onEvent(com.paypal.oslo.feature.inappcheckout.ui.error.contract.ErrorContract.Event.ContactUs.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QdXECu1oTZAdltF5v40swY4eM4w(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1635726244);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1635726244, updateChangedFlags, -1, "com.paypal.oslo.feature.inappcheckout.ui.error.screen.BuyerRestrictionTabletPreview (ErrorScreen.kt:388)");
            }
            com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType errorScreenType = com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType.BUYER_RESTRICTION;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.ui.error.screen.ErrorScreenKt$$ExternalSyntheticLambda6
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
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.ui.error.screen.ErrorScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.ui.error.screen.ErrorScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.ui.error.screen.ErrorScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            getHighSpeedVideoFpsRangesFor(errorScreenType, function0, function02, function03, (kotlin.jvm.functions.Function0) rememberedValue4, null, startRestartGroup, 28086, 32);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.error.screen.ErrorScreenKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.inappcheckout.ui.error.screen.ErrorScreenKt.$r8$lambda$QdXECu1oTZAdltF5v40swY4eM4w(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$SgwoWCtOcXNFR2u2V0rIGHidOrQ(com.paypal.oslo.feature.inappcheckout.ui.error.viewmodel.ErrorViewModel errorViewModel) {
        errorViewModel.onEvent(com.paypal.oslo.feature.inappcheckout.ui.error.contract.ErrorContract.Event.ReturnToMerchant.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$SxkNRTNePajilDWolCe9eJ9NBSI(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-235823416);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-235823416, updateChangedFlags, -1, "com.paypal.oslo.feature.inappcheckout.ui.error.screen.NonRecoverableErrorPreview (ErrorScreen.kt:372)");
            }
            com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType errorScreenType = com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType.NON_RECOVERABLE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.ui.error.screen.ErrorScreenKt$$ExternalSyntheticLambda21
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
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.ui.error.screen.ErrorScreenKt$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.ui.error.screen.ErrorScreenKt$$ExternalSyntheticLambda23
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.ui.error.screen.ErrorScreenKt$$ExternalSyntheticLambda24
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            getHighSpeedVideoFpsRangesFor(errorScreenType, function0, function02, function03, (kotlin.jvm.functions.Function0) rememberedValue4, null, startRestartGroup, 28086, 32);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.error.screen.ErrorScreenKt$$ExternalSyntheticLambda25
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.inappcheckout.ui.error.screen.ErrorScreenKt.$r8$lambda$SxkNRTNePajilDWolCe9eJ9NBSI(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$TjdXAlc2UkxF2YoVmDuZdVetKcE(java.util.List list, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoSizes(list, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$X5VwLERXWpxRwBR7mWNcKCRvPZA(com.paypal.oslo.feature.inappcheckout.ui.error.viewmodel.ErrorViewModel errorViewModel) {
        errorViewModel.onEvent(com.paypal.oslo.feature.inappcheckout.ui.error.contract.ErrorContract.Event.CheckAccount.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$dari8dYQyR25hM2LhLDy5nYEJvg(com.paypal.oslo.feature.inappcheckout.ui.error.screen.ButtonConfig buttonConfig, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighResolutionOutputSizeshNQ4ISI(buttonConfig, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jDuFDSRLvRsPWIubN1gH4c3klo8(com.paypal.oslo.feature.inappcheckout.ui.error.viewmodel.ErrorViewModel errorViewModel) {
        errorViewModel.onEvent(com.paypal.oslo.feature.inappcheckout.ui.error.contract.ErrorContract.Event.Retry.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$lsAvUjKl3Acl4qkGn7Z8ww8P9jw(kotlin.jvm.functions.Function0 function0, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(str2, com.paypal.oslo.feature.inappcheckout.Constants.CONTACT_US_LINK_ID)) {
            function0.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType.values().length];
            try {
                iArr[com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType.RECOVERABLE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType.NON_RECOVERABLE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType.BUYER_RESTRICTION.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
