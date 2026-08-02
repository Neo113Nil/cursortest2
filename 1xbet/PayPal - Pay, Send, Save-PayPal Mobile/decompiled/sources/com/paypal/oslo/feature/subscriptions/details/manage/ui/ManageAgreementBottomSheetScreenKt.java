package com.paypal.oslo.feature.subscriptions.details.manage.ui;

@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a\u001e\u0010\t\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003H\u0081@¢\u0006\u0002\u0010\n\u001a\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0001¨\u0006\u000f²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u0084\u0002"}, d2 = {"ManageAgreementBottomSheetScreen", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "viewModel", "Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementViewModel;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementViewModel;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "handleUiEffects", "(Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementViewModel;Lcom/paypal/oslo/core/navigation/AppNavigator;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSuccessModalTypeByEffect", "Lcom/paypal/oslo/feature/subscriptions/shared/success/SuccessModalType;", "effect", "Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementUiEffect$NavigateToDisablementSuccess;", "subscriptions_prodRelease", "uiState", "Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementUiState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ManageAgreementBottomSheetScreenKt {
    public static /* synthetic */ int $r8$lambda$6ObG8GjX81baPvn6osG9cJq01Xk(int i) {
        return i;
    }

    /* renamed from: $r8$lambda$Tx1-0uxVrxzPp-Ys0Js_08CouRA, reason: not valid java name */
    public static /* synthetic */ int m19821$r8$lambda$Tx10uxVrxzPpYs0Js_08CouRA(int i) {
        return -i;
    }

    /* renamed from: $r8$lambda$VH-byR8oGJDnA0vk65wCKrrwqss, reason: not valid java name */
    public static /* synthetic */ int m19822$r8$lambda$VHbyR8oGJDnA0vk65wCKrrwqss(int i) {
        return -i;
    }

    public static /* synthetic */ int $r8$lambda$tQu9I1Wf3C0hqq4GdNpAm9z6tcI(int i) {
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ManageAgreementBottomSheetScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewModel manageAgreementViewModel, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manageAgreementViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2141799262);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(manageAgreementViewModel) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                modifier3 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-2141799262, i4, -1, "com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementBottomSheetScreen (ManageAgreementBottomSheetScreen.kt:35)");
                }
                androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(manageAgreementViewModel.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                boolean changedInstance = startRestartGroup.changedInstance(manageAgreementViewModel);
                boolean z = (i4 & 14) == 4;
                com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementBottomSheetScreenKt$ManageAgreementBottomSheetScreen$1$1 rememberedValue = startRestartGroup.rememberedValue();
                if ((changedInstance | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementBottomSheetScreenKt$ManageAgreementBottomSheetScreen$1$1(manageAgreementViewModel, appNavigator, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState manageAgreementUiState = (com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState) collectAsStateWithLifecycle.getValue();
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementBottomSheetScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementBottomSheetScreenKt.$r8$lambda$ActZA5VaCUZPKNw0jFeleDSG8w4((androidx.compose.animation.AnimatedContentTransitionScope) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementBottomSheetScreenKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementBottomSheetScreenKt.$r8$lambda$qrU5cXwBBbymkEKY3zjiHcsTOGU((com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                androidx.compose.animation.AnimatedContentKt.AnimatedContent(manageAgreementUiState, modifier3, function1, null, "ManageFlowTransition", (kotlin.jvm.functions.Function1) rememberedValue3, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1367197453, true, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementBottomSheetScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function4
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                        return com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementBottomSheetScreenKt.m19820$r8$lambda$I24MgGEsxtJAjYdVtEIG9KPlHA(com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewModel.this, (androidx.compose.animation.AnimatedContentScope) obj, (com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState) obj2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, ((i4 >> 3) & 112) | 1794432, 8);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier4 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementBottomSheetScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementBottomSheetScreenKt.m19819$r8$lambda$3YBNrOAnpgbSVshsvCnAwLi2xg(com.paypal.oslo.core.navigation.AppNavigator.this, manageAgreementViewModel, modifier4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final java.lang.Object handleUiEffects(com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewModel manageAgreementViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object collectLatest = kotlinx.coroutines.flow.FlowKt.collectLatest(manageAgreementViewModel.getUiEffect(), new com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementBottomSheetScreenKt$handleUiEffects$2(appNavigator, null), continuation);
        return collectLatest == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collectLatest : kotlin.Unit.INSTANCE;
    }

    public static final com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType getSuccessModalTypeByEffect(com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiEffect.NavigateToDisablementSuccess navigateToDisablementSuccess) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigateToDisablementSuccess, "");
        int i = com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementBottomSheetScreenKt.WhenMappings.$EnumSwitchMapping$0[navigateToDisablementSuccess.getManagementType().ordinal()];
        if (i == 1) {
            return new com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType.AgreementUnlink(navigateToDisablementSuccess.getMerchantName(), navigateToDisablementSuccess.getAgreementType());
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return new com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType.AgreementCancel(navigateToDisablementSuccess.getMerchantName(), navigateToDisablementSuccess.getAgreementType());
    }

    /* renamed from: $r8$lambda$3YBNrOAn-pgbSVshsvCnAwLi2xg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19819$r8$lambda$3YBNrOAnpgbSVshsvCnAwLi2xg(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewModel manageAgreementViewModel, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ManageAgreementBottomSheetScreen(appNavigator, manageAgreementViewModel, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.animation.ContentTransform $r8$lambda$ActZA5VaCUZPKNw0jFeleDSG8w4(androidx.compose.animation.AnimatedContentTransitionScope animatedContentTransitionScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animatedContentTransitionScope, "");
        return animatedContentTransitionScope.getTargetState() instanceof com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Disable ? androidx.compose.animation.AnimatedContentKt.togetherWith(androidx.compose.animation.EnterExitTransitionKt.slideInHorizontally$default(null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementBottomSheetScreenKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementBottomSheetScreenKt.$r8$lambda$tQu9I1Wf3C0hqq4GdNpAm9z6tcI(((java.lang.Integer) obj).intValue()));
            }
        }, 1, null), androidx.compose.animation.EnterExitTransitionKt.slideOutHorizontally$default(null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementBottomSheetScreenKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementBottomSheetScreenKt.m19822$r8$lambda$VHbyR8oGJDnA0vk65wCKrrwqss(((java.lang.Integer) obj).intValue()));
            }
        }, 1, null)) : androidx.compose.animation.AnimatedContentKt.togetherWith(androidx.compose.animation.EnterExitTransitionKt.slideInHorizontally$default(null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementBottomSheetScreenKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementBottomSheetScreenKt.m19821$r8$lambda$Tx10uxVrxzPpYs0Js_08CouRA(((java.lang.Integer) obj).intValue()));
            }
        }, 1, null), androidx.compose.animation.EnterExitTransitionKt.slideOutHorizontally$default(null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementBottomSheetScreenKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementBottomSheetScreenKt.$r8$lambda$6ObG8GjX81baPvn6osG9cJq01Xk(((java.lang.Integer) obj).intValue()));
            }
        }, 1, null));
    }

    /* renamed from: $r8$lambda$I24MgGEsxtJ-AjYdVtEIG9KPlHA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19820$r8$lambda$I24MgGEsxtJAjYdVtEIG9KPlHA(com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewModel manageAgreementViewModel, androidx.compose.animation.AnimatedContentScope animatedContentScope, com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState manageAgreementUiState, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animatedContentScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manageAgreementUiState, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1367197453, i, -1, "com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementBottomSheetScreen.<anonymous> (ManageAgreementBottomSheetScreen.kt:62)");
        }
        if (manageAgreementUiState instanceof com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Disable) {
            composer.startReplaceGroup(383243520);
            com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Disable disable = (com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Disable) manageAgreementUiState;
            boolean changedInstance = composer.changedInstance(manageAgreementViewModel);
            com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementBottomSheetScreenKt$ManageAgreementBottomSheetScreen$4$1$1 rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementBottomSheetScreenKt$ManageAgreementBottomSheetScreen$4$1$1(manageAgreementViewModel);
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.subscriptions.details.manage.ui.DisableAgreementViewKt.DisableAgreementView(disable, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), composer, ((i >> 3) & 14) | 384, 0);
            composer.endReplaceGroup();
        } else {
            if (!(manageAgreementUiState instanceof com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Manage)) {
                composer.startReplaceGroup(383241547);
                composer.endReplaceGroup();
                throw new kotlin.NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(-1004132666);
            boolean changedInstance2 = composer.changedInstance(manageAgreementViewModel);
            com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementBottomSheetScreenKt$ManageAgreementBottomSheetScreen$4$2$1 rememberedValue2 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementBottomSheetScreenKt$ManageAgreementBottomSheetScreen$4$2$1(manageAgreementViewModel);
                composer.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewKt.ManageAgreementView((com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Manage) manageAgreementUiState, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue2), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), composer, ((i >> 3) & 14) | 384, 0);
            composer.endReplaceGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object $r8$lambda$qrU5cXwBBbymkEKY3zjiHcsTOGU(com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState manageAgreementUiState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manageAgreementUiState, "");
        return kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(manageAgreementUiState.getClass());
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType.values().length];
            try {
                iArr[com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType.MERCHANT_MANAGED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType.PAYPAL_MANAGED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
