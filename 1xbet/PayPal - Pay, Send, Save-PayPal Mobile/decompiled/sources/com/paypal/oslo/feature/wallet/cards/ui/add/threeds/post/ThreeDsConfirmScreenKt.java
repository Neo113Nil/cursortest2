package com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a\r\u0010\u0007\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\b¨\u0006\n²\u0006\n\u0010\u000b\u001a\u00020\fX\u008a\u0084\u0002"}, d2 = {"ThreeDsConfirmScreen", "", "args", "Lcom/paypal/oslo/feature/wallet/cards/ui/add/threeds/post/ThreeDsConfirmScreenArgs;", "viewModel", "Lcom/paypal/oslo/feature/wallet/cards/ui/add/threeds/post/ThreeDsConfirmScreenViewModel;", "(Lcom/paypal/oslo/feature/wallet/cards/ui/add/threeds/post/ThreeDsConfirmScreenArgs;Lcom/paypal/oslo/feature/wallet/cards/ui/add/threeds/post/ThreeDsConfirmScreenViewModel;Landroidx/compose/runtime/Composer;II)V", "ThreeDsConfirmScreenLoadingPreview", "(Landroidx/compose/runtime/Composer;I)V", "ThreeDsConfirmScreenErrorPreview", "wallet_prodRelease", "uiState", "Lcom/paypal/oslo/feature/wallet/cards/ui/add/threeds/post/ThreeDsConfirmScreenState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ThreeDsConfirmScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ThreeDsConfirmScreen(final com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post.ThreeDsConfirmScreenArgs threeDsConfirmScreenArgs, com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post.ThreeDsConfirmScreenViewModel threeDsConfirmScreenViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post.ThreeDsConfirmScreenViewModel threeDsConfirmScreenViewModel2;
        androidx.compose.runtime.Composer composer2;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        boolean z;
        int i4;
        com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post.ThreeDsConfirmScreenViewModel threeDsConfirmScreenViewModel3;
        boolean changedInstance;
        com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post.ThreeDsConfirmScreenKt$ThreeDsConfirmScreen$1$1 rememberedValue;
        com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post.ThreeDsConfirmScreenState threeDsConfirmScreenState;
        com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post.ThreeDsConfirmScreenViewModel threeDsConfirmScreenViewModel4;
        androidx.compose.runtime.Composer composer3;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threeDsConfirmScreenArgs, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1823420970);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(threeDsConfirmScreenArgs) : startRestartGroup.changedInstance(threeDsConfirmScreenArgs) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                threeDsConfirmScreenViewModel2 = threeDsConfirmScreenViewModel;
                if (startRestartGroup.changedInstance(threeDsConfirmScreenViewModel2)) {
                    i5 = 32;
                    i3 |= i5;
                }
            } else {
                threeDsConfirmScreenViewModel2 = threeDsConfirmScreenViewModel;
            }
            i5 = 16;
            i3 |= i5;
        } else {
            threeDsConfirmScreenViewModel2 = threeDsConfirmScreenViewModel;
        }
        int i6 = i3;
        boolean z2 = true;
        if (startRestartGroup.shouldExecute((i6 & 19) != 18, i6 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i6 &= -113;
                }
            } else if ((i2 & 2) != 0) {
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
                z = false;
                i4 = i6 & (-113);
                threeDsConfirmScreenViewModel3 = (com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post.ThreeDsConfirmScreenViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post.ThreeDsConfirmScreenViewModelImpl.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1823420970, i4, -1, "com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post.ThreeDsConfirmScreen (ThreeDsConfirmScreen.kt:28)");
                }
                androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(threeDsConfirmScreenViewModel3.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                changedInstance = startRestartGroup.changedInstance(threeDsConfirmScreenViewModel3);
                if ((i4 & 14) != 4 && ((i4 & 8) == 0 || !startRestartGroup.changedInstance(threeDsConfirmScreenArgs))) {
                    z2 = z;
                }
                rememberedValue = startRestartGroup.rememberedValue();
                if (!(changedInstance | z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post.ThreeDsConfirmScreenKt$ThreeDsConfirmScreen$1$1(threeDsConfirmScreenViewModel3, threeDsConfirmScreenArgs, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                threeDsConfirmScreenState = (com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post.ThreeDsConfirmScreenState) collectAsStateWithLifecycle.getValue();
                if (!(threeDsConfirmScreenState instanceof com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post.ThreeDsConfirmScreenState.Loading)) {
                    startRestartGroup.startReplaceGroup(-1211858632);
                    com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post.ThreeDsConfirmScreenState.Loading loading = (com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post.ThreeDsConfirmScreenState.Loading) threeDsConfirmScreenState;
                    com.paypal.oslo.feature.wallet.common.GenericLoaderScreenKt.GenericLoaderScreen(com.paypal.oslo.core.commonui.utils.RefTextKt.value(loading.getTitle(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable), null, loading.getShouldShowClose(), null, startRestartGroup, 0, 10);
                    startRestartGroup.endReplaceGroup();
                    threeDsConfirmScreenViewModel4 = threeDsConfirmScreenViewModel3;
                    composer3 = startRestartGroup;
                } else if (threeDsConfirmScreenState instanceof com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post.ThreeDsConfirmScreenState.Error) {
                    startRestartGroup.startReplaceGroup(-1211645755);
                    com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post.ThreeDsConfirmScreenState.Error error = (com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post.ThreeDsConfirmScreenState.Error) threeDsConfirmScreenState;
                    threeDsConfirmScreenViewModel4 = threeDsConfirmScreenViewModel3;
                    composer3 = startRestartGroup;
                    com.paypal.oslo.feature.wallet.common.ErrorScreenKt.ErrorScreen(error.getIcon(), com.paypal.oslo.core.commonui.utils.RefTextKt.value(error.getTitle(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable), com.paypal.oslo.core.commonui.utils.RefTextKt.value(error.getDescription(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable), com.paypal.oslo.core.commonui.utils.RefTextKt.value(error.getButtonText(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable), error.getShouldShowClose(), null, false, error.getOnCloseClick(), error.getOnActionClick(), startRestartGroup, 0, 96);
                    composer3.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-39094145);
                    startRestartGroup.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                composer2 = composer3;
                threeDsConfirmScreenViewModel2 = threeDsConfirmScreenViewModel4;
            }
            z = false;
            i4 = i6;
            threeDsConfirmScreenViewModel3 = threeDsConfirmScreenViewModel2;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            androidx.compose.runtime.State collectAsStateWithLifecycle2 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(threeDsConfirmScreenViewModel3.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            changedInstance = startRestartGroup.changedInstance(threeDsConfirmScreenViewModel3);
            if ((i4 & 14) != 4) {
                z2 = z;
            }
            rememberedValue = startRestartGroup.rememberedValue();
            if (!(changedInstance | z2)) {
            }
            rememberedValue = new com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post.ThreeDsConfirmScreenKt$ThreeDsConfirmScreen$1$1(threeDsConfirmScreenViewModel3, threeDsConfirmScreenArgs, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
            threeDsConfirmScreenState = (com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post.ThreeDsConfirmScreenState) collectAsStateWithLifecycle2.getValue();
            if (!(threeDsConfirmScreenState instanceof com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post.ThreeDsConfirmScreenState.Loading)) {
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            composer2 = composer3;
            threeDsConfirmScreenViewModel2 = threeDsConfirmScreenViewModel4;
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post.ThreeDsConfirmScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post.ThreeDsConfirmScreenKt.$r8$lambda$d_boKYazLHUVynL0vFHrtdG5jSc(com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post.ThreeDsConfirmScreenArgs.this, threeDsConfirmScreenViewModel2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BvPq2NwB_1YICgr7M9IYtpbIdao(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(436462047);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(436462047, updateChangedFlags, -1, "com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post.ThreeDsConfirmScreenErrorPreview (ThreeDsConfirmScreen.kt:67)");
            }
            com.paypal.pds.core.Icon.Warning warning = com.paypal.pds.core.Icon.Warning.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post.ThreeDsConfirmScreenKt$$ExternalSyntheticLambda0
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
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post.ThreeDsConfirmScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.feature.wallet.common.ErrorScreenKt.ErrorScreen(warning, "We couldn't add your card", "We couldn’t confirm that you’re the owner of this card. Contact the issuer if you’re unable to use it.", "Got it", true, null, false, function0, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 113274294, 96);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post.ThreeDsConfirmScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post.ThreeDsConfirmScreenKt.$r8$lambda$BvPq2NwB_1YICgr7M9IYtpbIdao(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$LcJ4Fdcb3vDTDcATMxSAuttw-Hk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21090$r8$lambda$LcJ4Fdcb3vDTDcATMxSAuttwHk(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(434520299);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(434520299, updateChangedFlags, -1, "com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post.ThreeDsConfirmScreenLoadingPreview (ThreeDsConfirmScreen.kt:58)");
            }
            com.paypal.oslo.feature.wallet.common.GenericLoaderScreenKt.GenericLoaderScreen("Almost done", null, false, null, startRestartGroup, 390, 10);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post.ThreeDsConfirmScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post.ThreeDsConfirmScreenKt.m21090$r8$lambda$LcJ4Fdcb3vDTDcATMxSAuttwHk(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$d_boKYazLHUVynL0vFHrtdG5jSc(com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post.ThreeDsConfirmScreenArgs threeDsConfirmScreenArgs, com.paypal.oslo.feature.wallet.cards.ui.add.threeds.post.ThreeDsConfirmScreenViewModel threeDsConfirmScreenViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ThreeDsConfirmScreen(threeDsConfirmScreenArgs, threeDsConfirmScreenViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
