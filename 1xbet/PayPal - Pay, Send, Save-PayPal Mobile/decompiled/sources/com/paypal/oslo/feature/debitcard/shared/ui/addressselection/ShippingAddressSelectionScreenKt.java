package com.paypal.oslo.feature.debitcard.shared.ui.addressselection;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/core/navigation/AppNavigator;", "appNavigator", "", "debitInstrumentId", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "", "ShippingAddressSelectionScreen", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ShippingAddressSelectionScreenKt {
    public static final void ShippingAddressSelectionScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.lang.String str, final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        int i3;
        int i4;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProductName, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1202981865);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(debitCardProductName.ordinal()) ? 256 : 128;
        }
        int i6 = i2;
        if (!startRestartGroup.shouldExecute((i6 & 147) != 146, i6 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1202981865, i6, -1, "com.paypal.oslo.feature.debitcard.shared.ui.addressselection.ShippingAddressSelectionScreen (ShippingAddressSelectionScreen.kt:58)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Initial.INSTANCE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
            com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntent = com.paypal.oslo.feature.debitcard.shared.analytics.ShippingAddressSelectionAnalytics.INSTANCE.getUserIntent(debitCardProductName);
            int i7 = i6 & 14;
            boolean z = i7 == 4;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.addressselection.ShippingAddressSelectionScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.debitcard.shared.ui.addressselection.ShippingAddressSelectionScreenKt.m14594$r8$lambda$azBOPThoilzSaviBR_z2qRXifM(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.view.compose.BackHandlerKt.BackHandler(false, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 0, 1);
            androidx.compose.ui.Modifier context = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(androidx.compose.foundation.layout.WindowInsetsPaddingKt.windowInsetsPadding(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), androidx.compose.foundation.layout.WindowInsets_androidKt.getSystemBars(androidx.compose.foundation.layout.WindowInsets.INSTANCE, startRestartGroup, 6)), kotlin.collections.CollectionsKt.listOf(userIntent));
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, context);
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
            if (mutableState.getValue() instanceof com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Error) {
                i3 = 0;
                i4 = i6;
                i5 = i7;
                startRestartGroup.startReplaceGroup(1721323055);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(1720739728);
                boolean z2 = i7 == 4;
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (z2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.addressselection.ShippingAddressSelectionScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.debitcard.shared.ui.addressselection.ShippingAddressSelectionScreenKt.$r8$lambda$js8oKZI4pGmU7Z9kOPtNp6_8nyw(com.paypal.oslo.core.navigation.AppNavigator.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                i4 = i6;
                i5 = i7;
                com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardToolBarKt.DebitCardToolBar(null, null, true, null, (kotlin.jvm.functions.Function0) rememberedValue3, null, null, startRestartGroup, 384, 107);
                i3 = 0;
                com.paypal.pds.components.HeaderKt.Header(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_shipping_address_title, startRestartGroup, 0), androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), (java.lang.String) null, (java.lang.String) null, (com.paypal.pds.components.HeaderContentAlignment) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, startRestartGroup, 0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            }
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            com.paypal.oslo.feature.debitcard.shared.ui.addressselection.AddressSelectionConfig addressSelectionConfig = new com.paypal.oslo.feature.debitcard.shared.ui.addressselection.AddressSelectionConfig(true, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_common_confirm, startRestartGroup, i3), true, false, false, 24, null);
            int i8 = i5 == 4 ? 1 : i3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (i8 != 0 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.addressselection.ShippingAddressSelectionScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.debitcard.shared.ui.addressselection.ShippingAddressSelectionScreenKt.$r8$lambda$CMIGczg46mswzyGEjNEkuivmUrg(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue4;
            if (i5 == 4) {
                i3 = 1;
            }
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (i3 != 0 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.addressselection.ShippingAddressSelectionScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.debitcard.shared.ui.addressselection.ShippingAddressSelectionScreenKt.$r8$lambda$rWx0FzjHznQRoWTEIHIHyF8RG4o(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue5;
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.addressselection.ShippingAddressSelectionScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.debitcard.shared.ui.addressselection.ShippingAddressSelectionScreenKt.$r8$lambda$7X54ZvRa0BjDzBIJEYuebtlR04M(androidx.compose.runtime.MutableState.this, (com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue6;
            int i9 = i4;
            composer2 = startRestartGroup;
            com.paypal.oslo.feature.debitcard.shared.ui.addressselection.AddressSelectionComponentKt.AddressSelectionComponent(appNavigator, str, debitCardProductName, function0, fillMaxSize$default, function1, function12, addressSelectionConfig, null, startRestartGroup, 1597440 | i5 | (i9 & 112) | (i9 & 896), 256);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.addressselection.ShippingAddressSelectionScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.shared.ui.addressselection.ShippingAddressSelectionScreenKt.m14595$r8$lambda$ok_sYIRs89f8Lzy0rP3FryQQTk(com.paypal.oslo.core.navigation.AppNavigator.this, str, debitCardProductName, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0MBznhR4dQYzIMfeszrdzn6QgeA(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.debitcard.servicing.navigation.result.ShippingAddressNavResult("", (java.lang.String) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7X54ZvRa0BjDzBIJEYuebtlR04M(androidx.compose.runtime.MutableState mutableState, com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState addressSelectionState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressSelectionState, "");
        mutableState.setValue(addressSelectionState);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CMIGczg46mswzyGEjNEkuivmUrg(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.addressselection.ShippingAddressSelectionScreenKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.debitcard.shared.ui.addressselection.ShippingAddressSelectionScreenKt.$r8$lambda$o0S0bbaEighJKd_xNRrwEpSdDlw((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$CZLOTdV_UP6OFT-OHptAyNvmOPs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14592$r8$lambda$CZLOTdV_UP6OFTOHptAyNvmOPs(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$DvPHqvq9b_-zC277FaXmGNFo41U, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14593$r8$lambda$DvPHqvq9b_zC277FaXmGNFo41U(com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress debitCardAddress, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.debitcard.servicing.navigation.result.ShippingAddressNavResult(debitCardAddress.getId(), debitCardAddress.getAddress()));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Es31kAS17eOgRH48shKTn0dGhak(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.debitcard.servicing.navigation.result.ShippingAddressNavResult("", (java.lang.String) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$azBOPThoil-zSaviBR_z2qRXifM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14594$r8$lambda$azBOPThoilzSaviBR_z2qRXifM(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.addressselection.ShippingAddressSelectionScreenKt$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.debitcard.shared.ui.addressselection.ShippingAddressSelectionScreenKt.$r8$lambda$0MBznhR4dQYzIMfeszrdzn6QgeA((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$js8oKZI4pGmU7Z9kOPtNp6_8nyw(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.addressselection.ShippingAddressSelectionScreenKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.debitcard.shared.ui.addressselection.ShippingAddressSelectionScreenKt.$r8$lambda$Es31kAS17eOgRH48shKTn0dGhak((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$o0S0bbaEighJKd_xNRrwEpSdDlw(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.debitcard.servicing.navigation.result.ShippingAddressNavResult("", (java.lang.String) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ok_sYIRs89f-8Lzy0rP3FryQQTk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14595$r8$lambda$ok_sYIRs89f8Lzy0rP3FryQQTk(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, int i, androidx.compose.runtime.Composer composer, int i2) {
        ShippingAddressSelectionScreen(appNavigator, str, debitCardProductName, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rWx0FzjHznQRoWTEIHIHyF8RG4o(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress debitCardAddress) {
        if (debitCardAddress != null) {
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.addressselection.ShippingAddressSelectionScreenKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.debitcard.shared.ui.addressselection.ShippingAddressSelectionScreenKt.m14593$r8$lambda$DvPHqvq9b_zC277FaXmGNFo41U(com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        } else {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "Address saved callback invoked with null address", null, null, null, 14, null);
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.addressselection.ShippingAddressSelectionScreenKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.debitcard.shared.ui.addressselection.ShippingAddressSelectionScreenKt.m14592$r8$lambda$CZLOTdV_UP6OFTOHptAyNvmOPs((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rrwNazig6rH9iCKLOwhfWIgadEg(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1643656832);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1643656832, updateChangedFlags, -1, "com.paypal.oslo.feature.debitcard.shared.ui.addressselection.ShippingAddressSelectionPreview (ShippingAddressSelectionScreen.kt:134)");
            }
            ShippingAddressSelectionScreen(new com.paypal.oslo.core.navigation.AppNavigator(null, null, 3, null), "preview-card-id", com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.CONSUMER_DEBIT_CARD, startRestartGroup, 432);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.addressselection.ShippingAddressSelectionScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.shared.ui.addressselection.ShippingAddressSelectionScreenKt.$r8$lambda$rrwNazig6rH9iCKLOwhfWIgadEg(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
