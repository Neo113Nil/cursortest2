package com.paypal.oslo.feature.cryptocurrency.ui.sell.review.components;

@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u001aC\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001a\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u0003¢\u0006\u0002\u0010\u000e\u001a\r\u0010\u0010\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0013\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0011\"\u000e\u0010\u000f\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"CryptoSellPaymentOptionSelection", "", "availableOptions", "", "Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/model/CryptoSellPaymentOption;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.SELECTED_OPTION, "onOptionSelect", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/util/List;Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/model/CryptoSellPaymentOption;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "getDescriptionForOption", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.OPTION, "(Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/model/CryptoSellPaymentOption;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "PreviewPyusdDetails", "CryptoSellPaymentOptionSelectionBalanceSelectedPreview", "(Landroidx/compose/runtime/Composer;I)V", "CryptoSellPaymentOptionSelectionPyusdSelectedPreview", "CryptoSellPaymentOptionSelectionNoSelectionPreview", "cryptocurrency_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoSellPaymentOptionSelectionKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0070  */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v3, types: [com.paypal.oslo.feature.cryptocurrency.ui.sell.review.components.CryptoSellPaymentOptionSelectionKt$$ExternalSyntheticLambda0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.runtime.Composer] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoSellPaymentOptionSelection(final java.util.List<com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption> list, final com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption cryptoSellPaymentOption, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.util.Iterator it;
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        ?? startRestartGroup = composer.startRestartGroup(1243501193);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(cryptoSellPaymentOption) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i3;
            int i6 = 0;
            if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1243501193, i4, -1, "com.paypal.oslo.feature.cryptocurrency.ui.sell.review.components.CryptoSellPaymentOptionSelection (CryptoSellPaymentOptionSelection.kt:47)");
                }
                androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
                startRestartGroup.startReplaceGroup(-1322143943);
                java.util.Iterator it2 = list.iterator();
                int i7 = 0;
                while (it2.hasNext()) {
                    java.lang.Object next = it2.next();
                    if (i7 < 0) {
                        kotlin.collections.CollectionsKt.throwIndexOverflow();
                    }
                    final com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption cryptoSellPaymentOption2 = (com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption) next;
                    com.paypal.pds.core.Icon.LogoPaypalMarkColor logoPaypalMarkColor = com.paypal.pds.core.Icon.LogoPaypalMarkColor.INSTANCE;
                    java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(cryptoSellPaymentOption2.getDisplayNameResId(), startRestartGroup, i6);
                    boolean areEqual = kotlin.jvm.internal.Intrinsics.areEqual(cryptoSellPaymentOption2.getId(), cryptoSellPaymentOption != null ? cryptoSellPaymentOption.getId() : null);
                    androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "sell_payment_option_item_".concat(java.lang.String.valueOf(i7))), 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 7, null);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        it = it2;
                        androidx.compose.runtime.ComposerKt.traceEventStart(-306106958, i6, -1, "com.paypal.oslo.feature.cryptocurrency.ui.sell.review.components.getDescriptionForOption (CryptoSellPaymentOptionSelection.kt:67)");
                    } else {
                        it = it2;
                    }
                    int i8 = com.paypal.oslo.feature.cryptocurrency.ui.sell.review.components.CryptoSellPaymentOptionSelectionKt.WhenMappings.$EnumSwitchMapping$0[cryptoSellPaymentOption2.getType().ordinal()];
                    if (i8 == 1) {
                        startRestartGroup.startReplaceGroup(-2111005575);
                        java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_sell_payment_balance_amount_available, new java.lang.Object[]{cryptoSellPaymentOption2.getDetails()}, startRestartGroup, i6);
                        startRestartGroup.endReplaceGroup();
                        str = stringResource2;
                    } else {
                        if (i8 != 2) {
                            startRestartGroup.startReplaceGroup(-2111007617);
                            startRestartGroup.endReplaceGroup();
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        startRestartGroup.startReplaceGroup(-2110999687);
                        startRestartGroup.endReplaceGroup();
                        str = cryptoSellPaymentOption2.getDetails();
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    int i9 = (i4 & 896) == 256 ? 1 : i6;
                    boolean changed = startRestartGroup.changed(cryptoSellPaymentOption2);
                    kotlin.jvm.functions.Function0 rememberedValue = startRestartGroup.rememberedValue();
                    if ((i9 | (changed ? 1 : 0)) != 0 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.review.components.CryptoSellPaymentOptionSelectionKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.cryptocurrency.ui.sell.review.components.CryptoSellPaymentOptionSelectionKt.$r8$lambda$tBc0y1sEBc2rqAGKTAYCTAZNwt4(kotlin.jvm.functions.Function1.this, cryptoSellPaymentOption2);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    com.paypal.oslo.feature.cryptocurrency.ui.common.components.payment.PaymentMethodRadioItemKt.PaymentMethodRadioItem(stringResource, areEqual, rememberedValue, m1710paddingqDBjuR0$default, str, logoPaypalMarkColor, null, startRestartGroup, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 64);
                    i7++;
                    modifier4 = modifier4;
                    it2 = it;
                    i4 = i4;
                    i6 = 0;
                }
                modifier3 = modifier4;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.review.components.CryptoSellPaymentOptionSelectionKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.sell.review.components.CryptoSellPaymentOptionSelectionKt.$r8$lambda$Ioft9J65hAPUCSBEaodmWKrjaDU(list, cryptoSellPaymentOption, function1, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        int i62 = 0;
        if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7pTf4AHDcmAiohqZuIny8I1VOo0(com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption cryptoSellPaymentOption) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoSellPaymentOption, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Ioft9J65hAPUCSBEaodmWKrjaDU(java.util.List list, com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption cryptoSellPaymentOption, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CryptoSellPaymentOptionSelection(list, cryptoSellPaymentOption, function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Kdp0cdi6XINCjFLjm5UICZVazwE(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(626777098);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(626777098, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.sell.review.components.CryptoSellPaymentOptionSelectionBalanceSelectedPreview (CryptoSellPaymentOptionSelection.kt:82)");
            }
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption[]{new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption("balance", "abc123", com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOptionType.BALANCE, com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_sell_payment_balance_display_name, "$279.41 USD available", null, 32, null), new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption(com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.PyusdItemFactoryKt.AccountSnapshotPyUsdId, "def456", com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOptionType.PYUSD, com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_sell_payment_pyusd_display_name, "100.00 PYUSD", null, 32, null)});
            com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption cryptoSellPaymentOption = (com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption) listOf.get(0);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.review.components.CryptoSellPaymentOptionSelectionKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.sell.review.components.CryptoSellPaymentOptionSelectionKt.$r8$lambda$wNQk0Wafp1sf20N7xTvJPQ4POjM((com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            CryptoSellPaymentOptionSelection(listOf, cryptoSellPaymentOption, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 384, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.review.components.CryptoSellPaymentOptionSelectionKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.sell.review.components.CryptoSellPaymentOptionSelectionKt.$r8$lambda$Kdp0cdi6XINCjFLjm5UICZVazwE(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$g_ggA3jR1YGh_vQSSOTj6NN8Ncg(com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption cryptoSellPaymentOption) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoSellPaymentOption, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mSuE_dw9HCH46KhLNIRzRtRuDXA(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1001734486);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1001734486, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.sell.review.components.CryptoSellPaymentOptionSelectionNoSelectionPreview (CryptoSellPaymentOptionSelection.kt:142)");
            }
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption[]{new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption("balance", "abc123", com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOptionType.BALANCE, com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_sell_payment_balance_display_name, "$279.41 USD", null, 32, null), new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption(com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.PyusdItemFactoryKt.AccountSnapshotPyUsdId, "def456", com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOptionType.PYUSD, com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_sell_payment_pyusd_display_name, "100.00 PYUSD", null, 32, null)});
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.review.components.CryptoSellPaymentOptionSelectionKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.sell.review.components.CryptoSellPaymentOptionSelectionKt.$r8$lambda$g_ggA3jR1YGh_vQSSOTj6NN8Ncg((com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            CryptoSellPaymentOptionSelection(listOf, null, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 432, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.review.components.CryptoSellPaymentOptionSelectionKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.sell.review.components.CryptoSellPaymentOptionSelectionKt.$r8$lambda$mSuE_dw9HCH46KhLNIRzRtRuDXA(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$tBc0y1sEBc2rqAGKTAYCTAZNwt4(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption cryptoSellPaymentOption) {
        function1.invoke(cryptoSellPaymentOption);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$undKyszG0mNKKERvFQ6LHZKe0s0(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(123075817);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(123075817, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.sell.review.components.CryptoSellPaymentOptionSelectionPyusdSelectedPreview (CryptoSellPaymentOptionSelection.kt:112)");
            }
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption[]{new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption("balance", "abc123", com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOptionType.BALANCE, com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_sell_payment_balance_display_name, "$279.41 USD", null, 32, null), new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption(com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.PyusdItemFactoryKt.AccountSnapshotPyUsdId, "def456", com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOptionType.PYUSD, com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_sell_payment_pyusd_display_name, "100.00 PYUSD", null, 32, null)});
            com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption cryptoSellPaymentOption = (com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption) listOf.get(1);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.review.components.CryptoSellPaymentOptionSelectionKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.sell.review.components.CryptoSellPaymentOptionSelectionKt.$r8$lambda$7pTf4AHDcmAiohqZuIny8I1VOo0((com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            CryptoSellPaymentOptionSelection(listOf, cryptoSellPaymentOption, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 384, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.review.components.CryptoSellPaymentOptionSelectionKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.sell.review.components.CryptoSellPaymentOptionSelectionKt.$r8$lambda$undKyszG0mNKKERvFQ6LHZKe0s0(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wNQk0Wafp1sf20N7xTvJPQ4POjM(com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption cryptoSellPaymentOption) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoSellPaymentOption, "");
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOptionType.values().length];
            try {
                iArr[com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOptionType.BALANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOptionType.PYUSD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
