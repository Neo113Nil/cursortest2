package com.paypal.oslo.feature.wallet.fifo.addmoney.ui.success;

@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aA\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u000e\u001a/\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"AddMoneySuccessScreen", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "addMoneyConfig", "Lcom/paypal/oslo/feature/wallet/api/ui/addmoney/AddMoneyConfig;", "amount", "Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "addFundType", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/AddFundType;", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/success/AddMoneySuccessViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/wallet/api/ui/addmoney/AddMoneyConfig;Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/AddFundType;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/success/AddMoneySuccessViewModel;Landroidx/compose/runtime/Composer;II)V", "LoadAddMoneySuccessScreen", "(Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/AddFundType;Lcom/paypal/oslo/core/navigation/AppNavigator;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "wallet_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AddMoneySuccessScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AddMoneySuccessScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig addMoneyConfig, final com.paypal.oslo.feature.wallet.common.domain.model.Money money, final com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddFundType addFundType, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.wallet.fifo.addmoney.ui.success.AddMoneySuccessViewModel addMoneySuccessViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        com.paypal.oslo.feature.wallet.fifo.addmoney.ui.success.AddMoneySuccessViewModel addMoneySuccessViewModel2;
        androidx.compose.runtime.Composer composer2;
        final com.paypal.oslo.feature.wallet.fifo.addmoney.ui.success.AddMoneySuccessViewModel addMoneySuccessViewModel3;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        boolean z;
        androidx.compose.ui.Modifier modifier4;
        com.paypal.oslo.feature.wallet.fifo.addmoney.ui.success.AddMoneySuccessViewModel addMoneySuccessViewModel4;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addMoneyConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addFundType, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(517000350);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? startRestartGroup.changed(addMoneyConfig) : startRestartGroup.changedInstance(addMoneyConfig) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(money) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(addFundType.ordinal()) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    addMoneySuccessViewModel2 = addMoneySuccessViewModel;
                    if (startRestartGroup.changedInstance(addMoneySuccessViewModel2)) {
                        i4 = 131072;
                        i3 |= i4;
                    }
                } else {
                    addMoneySuccessViewModel2 = addMoneySuccessViewModel;
                }
                i4 = 65536;
                i3 |= i4;
            } else {
                addMoneySuccessViewModel2 = addMoneySuccessViewModel;
            }
            if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    modifier4 = modifier2;
                    addMoneySuccessViewModel4 = addMoneySuccessViewModel2;
                    z = false;
                } else {
                    androidx.compose.ui.Modifier.Companion companion = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if ((i2 & 32) != 0) {
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
                        i3 &= -458753;
                        modifier4 = companion;
                        addMoneySuccessViewModel4 = (com.paypal.oslo.feature.wallet.fifo.addmoney.ui.success.AddMoneySuccessViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.success.AddMoneySuccessViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                    } else {
                        z = false;
                        modifier4 = companion;
                        addMoneySuccessViewModel4 = addMoneySuccessViewModel2;
                    }
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(517000350, i3, -1, "com.paypal.oslo.feature.wallet.fifo.addmoney.ui.success.AddMoneySuccessScreen (AddMoneySuccessScreen.kt:54)");
                }
                boolean changedInstance = startRestartGroup.changedInstance(addMoneySuccessViewModel4);
                boolean z2 = ((i3 & 112) == 32 || ((i3 & 64) != 0 && startRestartGroup.changedInstance(addMoneyConfig))) ? true : z;
                com.paypal.oslo.feature.wallet.fifo.addmoney.ui.success.AddMoneySuccessScreenKt$AddMoneySuccessScreen$1$1 rememberedValue = startRestartGroup.rememberedValue();
                if ((changedInstance | z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.success.AddMoneySuccessScreenKt$AddMoneySuccessScreen$1$1(addMoneySuccessViewModel4, addMoneyConfig, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                int i6 = i3 >> 3;
                androidx.compose.runtime.EffectsKt.LaunchedEffect(addMoneyConfig, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig.$stable | (i6 & 14));
                composer2 = startRestartGroup;
                Camera2StreamConfigurationMap(money, addFundType, appNavigator, modifier4, startRestartGroup, (i6 & 7168) | ((i3 << 6) & 896) | ((i3 >> 6) & 126), 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
                addMoneySuccessViewModel3 = addMoneySuccessViewModel4;
            } else {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                addMoneySuccessViewModel3 = addMoneySuccessViewModel2;
                modifier3 = modifier2;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.success.AddMoneySuccessScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.wallet.fifo.addmoney.ui.success.AddMoneySuccessScreenKt.$r8$lambda$wUEYfA4TDaQJp3mFukpAhn0qPbY(com.paypal.oslo.core.navigation.AppNavigator.this, addMoneyConfig, money, addFundType, modifier3, addMoneySuccessViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((196608 & i) != 0) {
        }
        if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void Camera2StreamConfigurationMap(final com.paypal.oslo.feature.wallet.common.domain.model.Money money, final com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddFundType addFundType, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.String format;
        java.lang.String stringResource;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1385719);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(money) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(addFundType.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(appNavigator) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1385719, i3, -1, "com.paypal.oslo.feature.wallet.fifo.addmoney.ui.success.LoadAddMoneySuccessScreen (AddMoneySuccessScreen.kt:68)");
                }
                java.lang.String currencySymbol$wallet_prodRelease = com.paypal.oslo.feature.wallet.fifo.common.util.CurrencyUtils.INSTANCE.getCurrencySymbol$wallet_prodRelease(money.getCurrencyCode());
                java.lang.String formatAmountOnly$default = com.paypal.oslo.feature.wallet.common.ui.formatter.AmountFormatter.formatAmountOnly$default(new com.paypal.oslo.feature.wallet.common.ui.formatter.AmountFormatter(), money.getValue(), money.getCurrencyCode(), null, false, 12, null);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(currencySymbol$wallet_prodRelease);
                sb.append(formatAmountOnly$default);
                java.lang.String obj = sb.toString();
                if (addFundType == com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddFundType.INSTANT) {
                    startRestartGroup.startReplaceGroup(-1667355839);
                    kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                    format = java.lang.String.format(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_add_money_success_title, startRestartGroup, 0), java.util.Arrays.copyOf(new java.lang.Object[]{obj}, 1));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-1667244301);
                    kotlin.jvm.internal.StringCompanionObject stringCompanionObject2 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                    format = java.lang.String.format(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fifo_add_money_success_standard_title, startRestartGroup, 0), java.util.Arrays.copyOf(new java.lang.Object[]{obj}, 1));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                    startRestartGroup.endReplaceGroup();
                }
                if (addFundType == com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddFundType.STANDARD) {
                    startRestartGroup.startReplaceGroup(-1667051140);
                    kotlin.jvm.internal.StringCompanionObject stringCompanionObject3 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                    stringResource = java.lang.String.format(java.util.Locale.getDefault(), "%s\n%s", java.util.Arrays.copyOf(new java.lang.Object[]{androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fifo_add_money_success_delivery_info, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fifo_transfer_success_description, startRestartGroup, 0)}, 2));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(stringResource, "");
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-1666781998);
                    stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fifo_transfer_success_description, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                }
                java.lang.String str = stringResource;
                java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_done, startRestartGroup, 0);
                java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_activity, startRestartGroup, 0);
                com.paypal.pds.core.Icon.Check check = com.paypal.pds.core.Icon.Check.INSTANCE;
                int i5 = i3 & 896;
                boolean z = i5 == 256;
                int i6 = i3 & 14;
                boolean z2 = i6 == 4;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if ((z | z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.success.AddMoneySuccessScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.wallet.fifo.addmoney.ui.success.AddMoneySuccessScreenKt.$r8$lambda$H4jpovqsSSPzCq9PHD7AdUfXWLM(com.paypal.oslo.core.navigation.AppNavigator.this, money);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
                boolean z3 = i5 == 256;
                boolean z4 = i6 == 4;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if ((z3 | z4) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.success.AddMoneySuccessScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.wallet.fifo.addmoney.ui.success.AddMoneySuccessScreenKt.$r8$lambda$8EwpuFU2HCwdpIrB34D_plX4fas(com.paypal.oslo.core.navigation.AppNavigator.this, money);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                com.paypal.oslo.feature.wallet.fifo.common.ui.FIFOSuccessScreenKt.FIFOSuccessScreen(format, stringResource2, function0, (kotlin.jvm.functions.Function0) rememberedValue2, check, modifier3, str, stringResource3, null, startRestartGroup, ((i3 << 6) & 458752) | 24576, 256);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier4 = modifier2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.success.AddMoneySuccessScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.wallet.fifo.addmoney.ui.success.AddMoneySuccessScreenKt.$r8$lambda$CRIImnlZfyWkhP546ixtQ5brT4A(com.paypal.oslo.feature.wallet.common.domain.model.Money.this, addFundType, appNavigator, modifier4, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8EwpuFU2HCwdpIrB34D_plX4fas(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.wallet.common.domain.model.Money money) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.success.AddMoneySuccessScreenKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.fifo.addmoney.ui.success.AddMoneySuccessScreenKt.$r8$lambda$pK0g5IPpNqMIoNreSdpJiTn7C2k(com.paypal.oslo.feature.wallet.common.domain.model.Money.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CRIImnlZfyWkhP546ixtQ5brT4A(com.paypal.oslo.feature.wallet.common.domain.model.Money money, com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddFundType addFundType, com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        Camera2StreamConfigurationMap(money, addFundType, appNavigator, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$H4jpovqsSSPzCq9PHD7AdUfXWLM(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.wallet.common.domain.model.Money money) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.success.AddMoneySuccessScreenKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.fifo.addmoney.ui.success.AddMoneySuccessScreenKt.$r8$lambda$ka7HSYyjAM3YGg8xEM1GLJLaE_w(com.paypal.oslo.feature.wallet.common.domain.model.Money.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ka7HSYyjAM3YGg8xEM1GLJLaE_w(com.paypal.oslo.feature.wallet.common.domain.model.Money money, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.wallet.api.navigation.result.fifo.AddMoneyNavResult(new com.paypal.oslo.feature.wallet.api.navigation.result.fifo.AddMoneyNavResult.Outcome.Success(money.getValue(), money.getCurrencyCode(), "")));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pK0g5IPpNqMIoNreSdpJiTn7C2k(com.paypal.oslo.feature.wallet.common.domain.model.Money money, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.wallet.api.navigation.result.fifo.AddMoneyNavResult(new com.paypal.oslo.feature.wallet.api.navigation.result.fifo.AddMoneyNavResult.Outcome.Success(money.getValue(), money.getCurrencyCode(), "")));
        navigationScope.push(new com.paypal.oslo.feature.activity.api.navigation.PayPalActivityLedgerTabbedScreenDestinationKey((java.lang.String) null, (java.lang.String) null, 3, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wUEYfA4TDaQJp3mFukpAhn0qPbY(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig addMoneyConfig, com.paypal.oslo.feature.wallet.common.domain.model.Money money, com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddFundType addFundType, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.wallet.fifo.addmoney.ui.success.AddMoneySuccessViewModel addMoneySuccessViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AddMoneySuccessScreen(appNavigator, addMoneyConfig, money, addFundType, modifier, addMoneySuccessViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
