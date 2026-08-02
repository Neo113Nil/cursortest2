package com.paypal.oslo.feature.onboarding.postonboarding.activation.ui;

@kotlin.Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a_\u0010\u0000\u001a\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0007¢\u0006\u0002\u0010\u0016\u001ai\u0010\u0017\u001a\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00152\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0007¢\u0006\u0002\u0010\u0019\u001a%\u0010\u001a\u001a\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0003¢\u0006\u0002\u0010\u001b\u001a\u001f\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0003¢\u0006\u0002\u0010\u001e\u001a\r\u0010\u001f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010 ¨\u0006!"}, d2 = {"ActivationIntroScreen", "", "destination", "Lcom/paypal/oslo/feature/onboarding/postonboarding/activation/navigation/ActivationIntroDestination;", "postOnboardingNavigator", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/PostOnboardingNavigator;", "viewModel", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/PostOnboardingViewModel;", "(Lcom/paypal/oslo/feature/onboarding/postonboarding/activation/navigation/ActivationIntroDestination;Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/PostOnboardingNavigator;Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/PostOnboardingViewModel;Landroidx/compose/runtime/Composer;I)V", "checklistItems", "", "Lcom/paypal/oslo/feature/onboarding/postonboarding/activation/domain/model/ChecklistItem;", "titleRes", "", "buttonTextRes", "onFinishSetupClick", "Lkotlin/Function0;", "onCloseClick", "modifier", "Landroidx/compose/ui/Modifier;", "commsTierFeature", "", "(Ljava/util/List;IILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "ActivationIntroScreenContent", "backgroundImageUrl", "(Ljava/util/List;IILjava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "ChecklistCard", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ChecklistItemRow", "item", "(Lcom/paypal/oslo/feature/onboarding/postonboarding/activation/domain/model/ChecklistItem;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ActivationIntroScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "onboarding_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ActivationIntroScreenKt {
    public static final void ActivationIntroScreen(final com.paypal.oslo.feature.onboarding.postonboarding.activation.navigation.ActivationIntroDestination activationIntroDestination, final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator, final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel postOnboardingViewModel, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activationIntroDestination, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postOnboardingNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postOnboardingViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1061996694);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(activationIntroDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(postOnboardingNavigator) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(postOnboardingViewModel) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1061996694, i2, -1, "com.paypal.oslo.feature.onboarding.postonboarding.activation.ui.ActivationIntroScreen (ActivationIntroScreen.kt:92)");
            }
            com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingFlowScreenKt.m16125PostOnboardingFlowScreenfVxw3D8(activationIntroDestination.mo15903getFlowId8NcbBzM(), postOnboardingNavigator, postOnboardingViewModel, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-812668453, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.activation.ui.ActivationIntroScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.onboarding.postonboarding.activation.ui.ActivationIntroScreenKt.$r8$lambda$7GAoJE6UhDtpBByrqNtnitEu3hs(com.paypal.oslo.feature.onboarding.postonboarding.activation.navigation.ActivationIntroDestination.this, postOnboardingViewModel, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, (i2 & 112) | 3072 | (i2 & 896), 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.activation.ui.ActivationIntroScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.onboarding.postonboarding.activation.ui.ActivationIntroScreenKt.$r8$lambda$h_LOFz873wrfNRUmiv3Wb5iGiiY(com.paypal.oslo.feature.onboarding.postonboarding.activation.navigation.ActivationIntroDestination.this, postOnboardingNavigator, postOnboardingViewModel, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ActivationIntroScreen(final java.util.List<com.paypal.oslo.feature.onboarding.postonboarding.activation.domain.model.ChecklistItem> list, final int i, final int i2, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.ui.Modifier modifier, java.lang.String str, androidx.compose.runtime.Composer composer, final int i3, final int i4) {
        int i5;
        androidx.compose.ui.Modifier modifier2;
        int i6;
        java.lang.String str2;
        final androidx.compose.ui.Modifier modifier3;
        final java.lang.String str3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(618650213);
        if ((i3 & 6) == 0) {
            i5 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= startRestartGroup.changed(i2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= startRestartGroup.changedInstance(function02) ? 16384 : 8192;
        }
        int i7 = i4 & 32;
        if (i7 != 0) {
            i5 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((196608 & i3) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 131072 : 65536;
            i6 = i4 & 64;
            if (i6 == 0) {
                i5 |= 1572864;
            } else if ((1572864 & i3) == 0) {
                str2 = str;
                i5 |= startRestartGroup.changed(str2) ? 1048576 : 524288;
                if (!startRestartGroup.shouldExecute((599187 & i5) != 599186, i5 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    str3 = str2;
                } else {
                    androidx.compose.ui.Modifier modifier4 = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    java.lang.String str4 = i6 != 0 ? "unknown" : str2;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(618650213, i5, -1, "com.paypal.oslo.feature.onboarding.postonboarding.activation.ui.ActivationIntroScreen (ActivationIntroScreen.kt:142)");
                    }
                    int i8 = i5 << 3;
                    androidx.compose.ui.Modifier modifier5 = modifier4;
                    ActivationIntroScreenContent(list, i, i2, com.paypal.oslo.feature.onboarding.postonboarding.common.OnboardingImageUrls.ONBOARDING_ACTIVATION_INTRO_BACKGROUND, function0, function02, androidx.compose.ui.platform.TestTagKt.testTag(modifier4, "ActivationIntroScreen"), str4, startRestartGroup, (i5 & 896) | (i5 & 14) | 3072 | (i5 & 112) | (57344 & i8) | (458752 & i8) | (i8 & 29360128), 0);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    str3 = str4;
                    modifier3 = modifier5;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.activation.ui.ActivationIntroScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.onboarding.postonboarding.activation.ui.ActivationIntroScreenKt.$r8$lambda$9MuHMF7VNWGCdloNEqYEeXgqe64(list, i, i2, function0, function02, modifier3, str3, i3, i4, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            str2 = str;
            if (!startRestartGroup.shouldExecute((599187 & i5) != 599186, i5 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 64;
        if (i6 == 0) {
        }
        str2 = str;
        if (!startRestartGroup.shouldExecute((599187 & i5) != 599186, i5 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ActivationIntroScreenContent(final java.util.List<com.paypal.oslo.feature.onboarding.postonboarding.activation.domain.model.ChecklistItem> list, final int i, final int i2, final java.lang.String str, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.ui.Modifier modifier, java.lang.String str2, androidx.compose.runtime.Composer composer, final int i3, final int i4) {
        int i5;
        androidx.compose.ui.Modifier modifier2;
        int i6;
        java.lang.String str3;
        final androidx.compose.ui.Modifier modifier3;
        final java.lang.String str4;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-834216889);
        if ((i3 & 6) == 0) {
            i5 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= startRestartGroup.changed(i2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= startRestartGroup.changed(str) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= startRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i5 |= startRestartGroup.changedInstance(function02) ? 131072 : 65536;
        }
        int i7 = i4 & 64;
        if (i7 != 0) {
            i5 |= 1572864;
        } else if ((1572864 & i3) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 1048576 : 524288;
            i6 = i4 & 128;
            if (i6 == 0) {
                i5 |= 12582912;
            } else if ((12582912 & i3) == 0) {
                str3 = str2;
                i5 |= startRestartGroup.changed(str3) ? 8388608 : 4194304;
                if (!startRestartGroup.shouldExecute((4793491 & i5) != 4793490, i5 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    str4 = str3;
                } else {
                    androidx.compose.ui.Modifier modifier4 = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    java.lang.String str5 = i6 != 0 ? "unknown" : str3;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-834216889, i5, -1, "com.paypal.oslo.feature.onboarding.postonboarding.activation.ui.ActivationIntroScreenContent (ActivationIntroScreen.kt:184)");
                    }
                    final androidx.compose.ui.Modifier modifier5 = modifier4;
                    final java.lang.String str6 = str5;
                    com.paypal.pds.core.ThemeKt.Theme(false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(264013124, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.activation.ui.ActivationIntroScreenKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.onboarding.postonboarding.activation.ui.ActivationIntroScreenKt.m16076$r8$lambda$OOzuLu5AMa2c3H4rMb9FR29_0(androidx.compose.ui.Modifier.this, str6, str, function02, i, i2, function0, list, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    }, startRestartGroup, 54), startRestartGroup, 54);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    str4 = str5;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.activation.ui.ActivationIntroScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.onboarding.postonboarding.activation.ui.ActivationIntroScreenKt.m16081$r8$lambda$v8piPBpaJP71j8SiILo1gtqwAI(list, i, i2, str, function0, function02, modifier3, str4, i3, i4, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            str3 = str2;
            if (!startRestartGroup.shouldExecute((4793491 & i5) != 4793490, i5 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 128;
        if (i6 == 0) {
        }
        str3 = str2;
        if (!startRestartGroup.shouldExecute((4793491 & i5) != 4793490, i5 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighResolutionOutputSizeshNQ4ISI(final java.util.List<com.paypal.oslo.feature.onboarding.postonboarding.activation.domain.model.ChecklistItem> list, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-73202902);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-73202902, i3, -1, "com.paypal.oslo.feature.onboarding.postonboarding.activation.ui.ChecklistCard (ActivationIntroScreen.kt:285)");
                }
                modifier3 = modifier4;
                composer2 = startRestartGroup;
                com.paypal.pds.components.CardKt.Card(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), null, null, com.paypal.pds.components.CardStyle.Outlined.INSTANCE, null, com.paypal.pds.components.CardPadding.Padding16, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-2103658748, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.activation.ui.ActivationIntroScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.onboarding.postonboarding.activation.ui.ActivationIntroScreenKt.$r8$lambda$C_8kU4Kl_0EebgbXYoR3QzHM99c(list, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, (com.paypal.pds.components.CardStyle.Outlined.$stable << 9) | 805502976, 470);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.activation.ui.ActivationIntroScreenKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.onboarding.postonboarding.activation.ui.ActivationIntroScreenKt.m16077$r8$lambda$UrDacvarcLLL1ewYLUw2mVHNo(list, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighResolutionOutputSizeshNQ4ISI(final com.paypal.oslo.feature.onboarding.postonboarding.activation.domain.model.ChecklistItem checklistItem, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1988723860);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(checklistItem) : startRestartGroup.changedInstance(checklistItem) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1988723860, i3, -1, "com.paypal.oslo.feature.onboarding.postonboarding.activation.ui.ChecklistItemRow (ActivationIntroScreen.kt:320)");
                }
                final java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(checklistItem.getText(), startRestartGroup, 0);
                androidx.compose.ui.Modifier modifier4 = modifier3;
                composer2 = startRestartGroup;
                com.paypal.pds.components.ListKt.m21934ListItemViewBxoFyMc(stringResource, com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(modifier3, checklistItem.getAnalyticsItem()), androidx.compose.ui.res.StringResources_androidKt.stringResource(checklistItem.getDescription(), startRestartGroup, 0), null, null, false, false, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-2002566431, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.activation.ui.ActivationIntroScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.onboarding.postonboarding.activation.ui.ActivationIntroScreenKt.m16075$r8$lambda$IH5_J8Oedb2IMPX8joYLzK3EDc(com.paypal.oslo.feature.onboarding.postonboarding.activation.domain.model.ChecklistItem.this, stringResource, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), null, null, null, false, null, null, null, null, null, false, composer2, 100663296, 0, 524024);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.activation.ui.ActivationIntroScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.onboarding.postonboarding.activation.ui.ActivationIntroScreenKt.$r8$lambda$7fpVx9ws0SuiODio_8RDMR6f5jM(com.paypal.oslo.feature.onboarding.postonboarding.activation.domain.model.ChecklistItem.this, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7GAoJE6UhDtpBByrqNtnitEu3hs(final com.paypal.oslo.feature.onboarding.postonboarding.activation.navigation.ActivationIntroDestination activationIntroDestination, final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel postOnboardingViewModel, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-812668453, i, -1, "com.paypal.oslo.feature.onboarding.postonboarding.activation.ui.ActivationIntroScreen.<anonymous> (ActivationIntroScreen.kt:99)");
            }
            java.util.List<com.paypal.oslo.feature.onboarding.postonboarding.activation.domain.model.ChecklistItem> activationChecklistItems = com.paypal.oslo.feature.onboarding.postonboarding.activation.domain.ActivationContentResolver.INSTANCE.getActivationChecklistItems(activationIntroDestination.getStep());
            java.lang.String resolveCommsTierFeature = com.paypal.oslo.feature.onboarding.postonboarding.activation.analytics.ActivationAnalyticsConstantsKt.resolveCommsTierFeature(activationIntroDestination.getStep().getFlowData());
            int i2 = com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_activation_intro_title;
            int i3 = com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_activation_intro_button;
            boolean changedInstance = composer.changedInstance(postOnboardingViewModel);
            boolean changedInstance2 = composer.changedInstance(activationIntroDestination);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changedInstance | changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.activation.ui.ActivationIntroScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.onboarding.postonboarding.activation.ui.ActivationIntroScreenKt.m16079$r8$lambda$jJeo6J73dyiTMiy80CAwxy9oak(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel.this, activationIntroDestination);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            boolean changedInstance3 = composer.changedInstance(postOnboardingViewModel);
            boolean changedInstance4 = composer.changedInstance(activationIntroDestination);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if ((changedInstance3 | changedInstance4) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.activation.ui.ActivationIntroScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.onboarding.postonboarding.activation.ui.ActivationIntroScreenKt.$r8$lambda$854JRFxm8lIsUVit1scYwlEZ2YM(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel.this, activationIntroDestination);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            ActivationIntroScreen(activationChecklistItems, i2, i3, function0, (kotlin.jvm.functions.Function0) rememberedValue2, null, resolveCommsTierFeature, composer, 0, 32);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7fpVx9ws0SuiODio_8RDMR6f5jM(com.paypal.oslo.feature.onboarding.postonboarding.activation.domain.model.ChecklistItem checklistItem, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighResolutionOutputSizeshNQ4ISI(checklistItem, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$854JRFxm8lIsUVit1scYwlEZ2YM(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel postOnboardingViewModel, com.paypal.oslo.feature.onboarding.postonboarding.activation.navigation.ActivationIntroDestination activationIntroDestination) {
        postOnboardingViewModel.processEvent(new com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.RequestTransition(activationIntroDestination.getStep(), new com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Close(false, 1, null)));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9MuHMF7VNWGCdloNEqYEeXgqe64(java.util.List list, int i, int i2, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, androidx.compose.ui.Modifier modifier, java.lang.String str, int i3, int i4, androidx.compose.runtime.Composer composer, int i5) {
        ActivationIntroScreen(list, i, i2, function0, function02, modifier, str, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$C_8kU4Kl_0EebgbXYoR3QzHM99c(java.util.List list, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2103658748, i, -1, "com.paypal.oslo.feature.onboarding.postonboarding.activation.ui.ChecklistCard.<anonymous> (ActivationIntroScreen.kt:291)");
            }
            androidx.compose.ui.Modifier verticalScroll$default = androidx.compose.foundation.ScrollKt.verticalScroll$default(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.module(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module(com.paypal.oslo.feature.onboarding.postonboarding.activation.analytics.ActivationAnalyticsConstants.MODULE_SETUP_STEPS, 0, null, null, 14, null)), androidx.compose.foundation.ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, verticalScroll$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            composer.startReplaceGroup(-629549415);
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.feature.onboarding.postonboarding.activation.domain.model.ChecklistItem) it.next(), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), composer, com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | 48, 0);
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$IH5_J8Oedb2IM-PX8joYLzK3EDc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16075$r8$lambda$IH5_J8Oedb2IMPX8joYLzK3EDc(com.paypal.oslo.feature.onboarding.postonboarding.activation.domain.model.ChecklistItem checklistItem, java.lang.String str, androidx.compose.runtime.Composer composer, int i) {
        java.lang.String str2;
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2002566431, i, -1, "com.paypal.oslo.feature.onboarding.postonboarding.activation.ui.ChecklistItemRow.<anonymous> (ActivationIntroScreen.kt:330)");
            }
            androidx.compose.ui.Modifier m1726height3ABfNKs = androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape()), checklistItem.isCompleted() ? com.paypal.pds.core.Color.BackgroundBrandSecondary.INSTANCE : com.paypal.pds.core.Color.BackgroundRoleBaseNeutral.INSTANCE, (androidx.compose.ui.graphics.Shape) null, composer, 0, 2), com.paypal.pds.core.ConstantsKt.getSize48()), com.paypal.pds.core.ConstantsKt.getSize48());
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1603spacedByD5KLDUw(androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally()), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), composer, 54);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, m1726height3ABfNKs);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            com.paypal.pds.core.Icon icon = checklistItem.isCompleted() ? com.paypal.pds.core.Icon.Check.INSTANCE : checklistItem.getIcon();
            com.paypal.pds.core.Color color = checklistItem.isCompleted() ? com.paypal.pds.core.Color.ContentRoleEmphasisNeutral.INSTANCE : com.paypal.pds.core.Color.ContentRoleBaseNeutral.INSTANCE;
            if (checklistItem.isCompleted()) {
                composer.startReplaceGroup(-172338042);
                str2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_activation_intro_checkmark_description, new java.lang.Object[]{str}, composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-172116175);
                composer.endReplaceGroup();
                str2 = null;
            }
            com.paypal.pds.components.IconKt.Icon(icon, str2, null, null, color, composer, 0, 12);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$OOzuLu-5AMa2c3H4-rMb9FR29_0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16076$r8$lambda$OOzuLu5AMa2c3H4rMb9FR29_0(androidx.compose.ui.Modifier modifier, java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function0 function0, int i, int i2, kotlin.jvm.functions.Function0 function02, java.util.List list, androidx.compose.runtime.Composer composer, int i3) {
        if (composer.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(264013124, i3, -1, "com.paypal.oslo.feature.onboarding.postonboarding.activation.ui.ActivationIntroScreenContent.<anonymous> (ActivationIntroScreen.kt:187)");
            }
            androidx.compose.ui.Modifier context = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null), kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.feature.onboarding.api.analytics.OnboardingAnalytics.PRODUCT, str, "")));
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, context);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            if (str2 == null) {
                composer.startReplaceGroup(-645736392);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-645736391);
                androidx.compose.foundation.ImageKt.Image(com.paypal.oslo.core.commonui.components.AsyncImageKt.rememberAsyncImagePainter(str2, null, null, null, null, composer, 0, 30), (java.lang.String) null, androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (androidx.compose.ui.Alignment) null, androidx.compose.ui.layout.ContentScale.INSTANCE.getCrop(), 0.0f, (androidx.compose.ui.graphics.ColorFilter) null, composer, 25008, 104);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                composer.endReplaceGroup();
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            }
            androidx.compose.ui.Modifier safeDrawingPadding = androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.safeDrawingPadding(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16()));
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, safeDrawingPadding);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.paypal.pds.components.IconButtonKt.IconButton(com.paypal.pds.core.Icon.XMark.INSTANCE, function0, com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(columnScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getEnd()), com.paypal.oslo.feature.onboarding.postonboarding.activation.analytics.ActivationAnalyticsConstants.INSTANCE.getDISMISS_ITEM()), com.paypal.pds.components.ButtonStyle.Overlay.INSTANCE, com.paypal.pds.components.ButtonSize.Medium.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_close_description, composer, 0), null, false, false, composer, 27654, 448);
            androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 0.0f, 13, null);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.activation.ui.ActivationIntroScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.onboarding.postonboarding.activation.ui.ActivationIntroScreenKt.m16080$r8$lambda$pVyMh1nj3AColrElxO_dYbeb34((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(i, composer, 0), androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(m1710paddingqDBjuR0$default, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.DisplaySmall.INSTANCE, composer, 384, 6, 1000);
            androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 0.0f, 13, null), 1.0f, false, 2, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getBottom(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 54);
            int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, weight$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            getHighResolutionOutputSizeshNQ4ISI((java.util.List<com.paypal.oslo.feature.onboarding.postonboarding.activation.domain.model.ChecklistItem>) list, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), composer, 48, 0);
            composer.endNode();
            com.paypal.pds.components.ButtonKt.Button(function02, androidx.compose.ui.res.StringResources_androidKt.stringResource(i2, composer, 0), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.oslo.feature.onboarding.postonboarding.activation.analytics.ActivationAnalyticsConstants.INSTANCE.getFINISH_SETUP_ITEM()), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 0.0f, 13, null), null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, false, false, composer, 1769472, 408);
            composer.endNode();
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$UrDacvarcLLL1e-wYLUw2-mVHNo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16077$r8$lambda$UrDacvarcLLL1ewYLUw2mVHNo(java.util.List list, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighResolutionOutputSizeshNQ4ISI((java.util.List<com.paypal.oslo.feature.onboarding.postonboarding.activation.domain.model.ChecklistItem>) list, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$V24VfMDQgJmtgUk1-EGkyjc9iDw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16078$r8$lambda$V24VfMDQgJmtgUk1EGkyjc9iDw(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-734095717);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-734095717, updateChangedFlags, -1, "com.paypal.oslo.feature.onboarding.postonboarding.activation.ui.ActivationIntroScreenPreview (ActivationIntroScreen.kt:364)");
            }
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.onboarding.postonboarding.activation.domain.model.ChecklistItem[]{new com.paypal.oslo.feature.onboarding.postonboarding.activation.domain.model.ChecklistItem(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_activation_intro_task_add_fi, com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_activation_intro_task_add_fi_description, com.paypal.pds.core.Icon.Card.INSTANCE, true, com.paypal.oslo.feature.onboarding.postonboarding.activation.analytics.ActivationAnalyticsConstants.INSTANCE.getADD_CARD_ITEM()), new com.paypal.oslo.feature.onboarding.postonboarding.activation.domain.model.ChecklistItem(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_activation_intro_task_add_bank, com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_activation_intro_task_add_bank_description, com.paypal.pds.core.Icon.Bank.INSTANCE, false, com.paypal.oslo.feature.onboarding.postonboarding.activation.analytics.ActivationAnalyticsConstants.INSTANCE.getLINK_BANK_ITEM()), new com.paypal.oslo.feature.onboarding.postonboarding.activation.domain.model.ChecklistItem(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_activation_intro_task_passkey, com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_activation_intro_task_passkey_description, com.paypal.pds.core.Icon.FaceScan.INSTANCE, false, com.paypal.oslo.feature.onboarding.postonboarding.activation.analytics.ActivationAnalyticsConstants.INSTANCE.getSETUP_PASSKEY_ITEM())});
            int i3 = com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_activation_intro_title;
            int i4 = com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_activation_intro_button;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.activation.ui.ActivationIntroScreenKt$$ExternalSyntheticLambda12
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
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.activation.ui.ActivationIntroScreenKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ActivationIntroScreenContent(listOf, i3, i4, com.paypal.oslo.feature.onboarding.postonboarding.common.OnboardingImageUrls.ONBOARDING_ACTIVATION_INTRO_BACKGROUND, function0, (kotlin.jvm.functions.Function0) rememberedValue2, null, null, startRestartGroup, com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | 224256, 192);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.activation.ui.ActivationIntroScreenKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.onboarding.postonboarding.activation.ui.ActivationIntroScreenKt.m16078$r8$lambda$V24VfMDQgJmtgUk1EGkyjc9iDw(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$h_LOFz873wrfNRUmiv3Wb5iGiiY(com.paypal.oslo.feature.onboarding.postonboarding.activation.navigation.ActivationIntroDestination activationIntroDestination, com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator, com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel postOnboardingViewModel, int i, androidx.compose.runtime.Composer composer, int i2) {
        ActivationIntroScreen(activationIntroDestination, postOnboardingNavigator, postOnboardingViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$j-Jeo6J73dyiTMiy80CAwxy9oak, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16079$r8$lambda$jJeo6J73dyiTMiy80CAwxy9oak(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel postOnboardingViewModel, com.paypal.oslo.feature.onboarding.postonboarding.activation.navigation.ActivationIntroDestination activationIntroDestination) {
        postOnboardingViewModel.processEvent(new com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.RequestTransition(activationIntroDestination.getStep(), new com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Next(null, false, 3, null)));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$pVyM-h1nj3AColrElxO_dYbeb34, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16080$r8$lambda$pVyMh1nj3AColrElxO_dYbeb34(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.heading(semanticsPropertyReceiver);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$v8piPBpaJP-71j8SiILo1gtqwAI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16081$r8$lambda$v8piPBpaJP71j8SiILo1gtqwAI(java.util.List list, int i, int i2, java.lang.String str, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, androidx.compose.ui.Modifier modifier, java.lang.String str2, int i3, int i4, androidx.compose.runtime.Composer composer, int i5) {
        ActivationIntroScreenContent(list, i, i2, str, function0, function02, modifier, str2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return kotlin.Unit.INSTANCE;
    }
}
