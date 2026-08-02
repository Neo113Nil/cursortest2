package com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.components;

@kotlin.Metadata(d1 = {"\u0000^\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aa\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0001¢\u0006\u0002\u0010\u0012\u001a\u001d\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\fH\u0003¢\u0006\u0002\u0010\u0016\u001ac\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00010 2\b\b\u0002\u0010\t\u001a\u00020\n2\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010 H\u0001¢\u0006\u0002\u0010\"\u001a$\u0010#\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u001a2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000eH\u0000\u001a\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000\u001a\u0010\u0010%\u001a\u00020&2\u0006\u0010\u0014\u001a\u00020\u0004H\u0002\u001a\r\u0010'\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010(\u001a\r\u0010)\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010(¨\u0006*"}, d2 = {"DebitCardOperationsSection", "", "cardOperationItems", "", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/cardoperations/model/CardOperationItem;", "appNavigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "modifier", "Landroidx/compose/ui/Modifier;", "cardConnectEligibilityState", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/cardoperations/model/CardConnectEligibilityState;", "onEvent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent;", "cachedInstrument", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;", "(Ljava/util/List;Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/cardoperations/model/CardConnectEligibilityState;Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;Landroidx/compose/runtime/Composer;II)V", "CardConnectOperationItem", "cardOperation", "eligibilityState", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/cardoperations/model/CardOperationItem;Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/cardoperations/model/CardConnectEligibilityState;Landroidx/compose/runtime/Composer;I)V", "FundedByOperationSection", "navigator", "cardId", "", "balanceAmount", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentMoneyAmount;", "variant", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fundingoptions/FundingOptionsComponentVariant;", "onEditSecondaryFundingSource", "Lkotlin/Function0;", "onPayPalBalanceInfoClick", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentMoneyAmount;Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fundingoptions/FundingOptionsComponentVariant;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "onDeactivateContactlessClickHandler", "createSampleCardOperations", "getOperationAnalyticsComponent", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", "DebitCardOperationsSectionPreview", "(Landroidx/compose/runtime/Composer;I)V", "DebitCardOperationsSectionLargeFontPreview", "debit-card_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitCardOperationsSectionKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DebitCardOperationsSection(final java.util.List<com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardOperationItem> list, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardConnectEligibilityState cardConnectEligibilityState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent, kotlin.Unit> function1, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardConnectEligibilityState cardConnectEligibilityState2;
        int i5;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent, kotlin.Unit> function12;
        int i6;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument2;
        int i7;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent, kotlin.Unit> function13;
        final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent, kotlin.Unit> function14;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProductName, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1382934153);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(appNavigator) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(debitCardProductName.ordinal()) ? 256 : 128;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                cardConnectEligibilityState2 = cardConnectEligibilityState;
                i3 |= startRestartGroup.changed(cardConnectEligibilityState2) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    function12 = function1;
                    i3 |= startRestartGroup.changedInstance(function12) ? 131072 : 65536;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((1572864 & i) == 0) {
                        debitInstrument2 = debitInstrument;
                        i3 |= startRestartGroup.changedInstance(debitInstrument2) ? 1048576 : 524288;
                        i7 = i3;
                        if (!startRestartGroup.shouldExecute((599187 & i7) != 599186, i7 & 1)) {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            modifier3 = modifier2;
                            function13 = function12;
                            debitInstrument3 = debitInstrument2;
                        } else {
                            androidx.compose.ui.Modifier modifier4 = i8 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                            com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardConnectEligibilityState cardConnectEligibilityState3 = i4 != 0 ? com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardConnectEligibilityState.Loading.INSTANCE : cardConnectEligibilityState2;
                            if (i5 != 0) {
                                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.components.DebitCardOperationsSectionKt$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                            return com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.components.DebitCardOperationsSectionKt.$r8$lambda$U_9Gk61yy1Yuyy_FMN9EdnnNpJA((com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent) obj);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                function14 = (kotlin.jvm.functions.Function1) rememberedValue;
                            } else {
                                function14 = function12;
                            }
                            com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument4 = i6 != 0 ? null : debitInstrument2;
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-1382934153, i7, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.components.DebitCardOperationsSection (DebitCardOperationsSection.kt:86)");
                            }
                            final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent, kotlin.Unit> function15 = function14;
                            final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardConnectEligibilityState cardConnectEligibilityState4 = cardConnectEligibilityState3;
                            final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument5 = debitInstrument4;
                            composer2 = startRestartGroup;
                            com.paypal.pds.components.CardKt.Card(modifier4, null, null, com.paypal.pds.components.CardStyle.Outlined.INSTANCE, null, null, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(473652177, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.components.DebitCardOperationsSectionKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.components.DebitCardOperationsSectionKt.$r8$lambda$QKI2vhcq_FfDdoos0z7tr7raj8M(list, appNavigator, debitCardProductName, function15, cardConnectEligibilityState4, debitInstrument5, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            }, startRestartGroup, 54), composer2, ((i7 >> 9) & 14) | 805306368 | (com.paypal.pds.components.CardStyle.Outlined.$stable << 9), 502);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                            cardConnectEligibilityState2 = cardConnectEligibilityState3;
                            function13 = function14;
                            debitInstrument3 = debitInstrument4;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.components.DebitCardOperationsSectionKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.components.DebitCardOperationsSectionKt.$r8$lambda$xtzEc1S3L7JwkffMaU9d853lub0(list, appNavigator, debitCardProductName, modifier3, cardConnectEligibilityState2, function13, debitInstrument3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    debitInstrument2 = debitInstrument;
                    i7 = i3;
                    if (!startRestartGroup.shouldExecute((599187 & i7) != 599186, i7 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function12 = function1;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                debitInstrument2 = debitInstrument;
                i7 = i3;
                if (!startRestartGroup.shouldExecute((599187 & i7) != 599186, i7 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            cardConnectEligibilityState2 = cardConnectEligibilityState;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            function12 = function1;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            debitInstrument2 = debitInstrument;
            i7 = i3;
            if (!startRestartGroup.shouldExecute((599187 & i7) != 599186, i7 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        cardConnectEligibilityState2 = cardConnectEligibilityState;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        function12 = function1;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        debitInstrument2 = debitInstrument;
        i7 = i3;
        if (!startRestartGroup.shouldExecute((599187 & i7) != 599186, i7 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final void getHighSpeedVideoSizes(final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardOperationItem cardOperationItem, final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardConnectEligibilityState cardConnectEligibilityState, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(306144691);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(cardOperationItem) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(cardConnectEligibilityState) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(306144691, i2, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.components.CardConnectOperationItem (DebitCardOperationsSection.kt:176)");
            }
            if (cardConnectEligibilityState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardConnectEligibilityState.Loading) {
                startRestartGroup.startReplaceGroup(2141145421);
                com.paypal.pds.components.ShimmerKt.Shimmer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.debitcard.shared.constants.DebitCardTestTagConstants.CARD_CONNECT_ELIGIBILITY_SHIMMER), 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 1, null), com.paypal.pds.core.ConstantsKt.getSize48()), (com.paypal.pds.components.ShimmerStyle) com.paypal.pds.components.ShimmerStyle.Container.INSTANCE, true, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.components.ComposableSingletons$DebitCardOperationsSectionKt.INSTANCE.getLambda$780992808$debit_card_prodRelease(), startRestartGroup, 3504, 0);
                startRestartGroup.endReplaceGroup();
            } else if (cardConnectEligibilityState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardConnectEligibilityState.Eligible) {
                startRestartGroup.startReplaceGroup(2141566370);
                com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.components.CardOperationKt.CardOperation(cardOperationItem, com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.component(androidx.compose.ui.Modifier.INSTANCE, getHighSpeedVideoFpsRanges(cardOperationItem)), startRestartGroup, i2 & 14, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                if (!(cardConnectEligibilityState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardConnectEligibilityState.Ineligible)) {
                    startRestartGroup.startReplaceGroup(2147276722);
                    startRestartGroup.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                startRestartGroup.startReplaceGroup(2147300183);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.components.DebitCardOperationsSectionKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.components.DebitCardOperationsSectionKt.m14378$r8$lambda$qVlReAthoV8e4BY8C8JyT8f9QM(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardOperationItem.this, cardConnectEligibilityState, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FundedByOperationSection(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, final java.lang.String str, final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentMoneyAmount debitInstrumentMoneyAmount, final com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.FundingOptionsComponentVariant fundingOptionsComponentVariant, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProductName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingOptionsComponentVariant, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(883472934);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(debitCardProductName.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(debitInstrumentMoneyAmount) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changed(fundingOptionsComponentVariant.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 131072 : 65536;
        }
        int i5 = i2 & 64;
        if (i5 != 0) {
            i3 |= 1572864;
        } else if ((1572864 & i) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 1048576 : 524288;
            i4 = i2 & 128;
            if (i4 == 0) {
                i3 |= 12582912;
            } else if ((12582912 & i) == 0) {
                function03 = function02;
                i3 |= startRestartGroup.changedInstance(function03) ? 8388608 : 4194304;
                if (!startRestartGroup.shouldExecute((4793491 & i3) != 4793490, i3 & 1)) {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    modifier3 = modifier2;
                    function04 = function03;
                } else {
                    androidx.compose.ui.Modifier.Companion companion = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    kotlin.jvm.functions.Function0<kotlin.Unit> function05 = i4 != 0 ? null : function03;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(883472934, i3, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.components.FundedByOperationSection (DebitCardOperationsSection.kt:211)");
                    }
                    androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), com.paypal.oslo.feature.debitcard.shared.constants.DebitCardTestTagConstants.DEBIT_CARD_MANAGEMENT_OPERATION_FUNDED_BY);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
                    com.paypal.pds.components.SectionHeaderKt.SectionHeader(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize16(), com.paypal.pds.core.ConstantsKt.getSize16(), com.paypal.pds.core.ConstantsKt.getSize16(), 0.0f, 8, null), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_funding_options_title, startRestartGroup, 0), null, null, startRestartGroup, 0, 12);
                    int i6 = i3 >> 3;
                    androidx.compose.ui.Modifier modifier4 = companion;
                    composer2 = startRestartGroup;
                    com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.FundingOptionsComponentKt.FundingOptionsComponent(appNavigator, new com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.FundingOptionsComponentConfig(debitCardProductName, str, fundingOptionsComponentVariant, null, debitInstrumentMoneyAmount, null, com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardEvaluateFundingOptionsEntryPoint.MANAGE_CARD, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, null), androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize16(), com.paypal.pds.core.ConstantsKt.getSize8()), null, function0, null, function05, composer2, (3670016 & i6) | (i3 & 14) | (com.paypal.pds.components.CardStyle.$stable << 3) | (57344 & i6), 40);
                    composer2.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    function04 = function05;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.components.DebitCardOperationsSectionKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.components.DebitCardOperationsSectionKt.$r8$lambda$HpfRIIT4F835uttnpj8F_ROFQZM(com.paypal.oslo.core.navigation.AppNavigator.this, debitCardProductName, str, debitInstrumentMoneyAmount, fundingOptionsComponentVariant, function0, modifier3, function04, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            function03 = function02;
            if (!startRestartGroup.shouldExecute((4793491 & i3) != 4793490, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 128;
        if (i4 == 0) {
        }
        function03 = function02;
        if (!startRestartGroup.shouldExecute((4793491 & i3) != 4793490, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void onDeactivateContactlessClickHandler(java.lang.String str, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.DeactivateContactlessClicked(str));
    }

    public static final java.util.List<com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardOperationItem> createSampleCardOperations() {
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardOperationItem[]{new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardOperationItem("lock_card", com.paypal.pds.core.Icon.LockLocked.INSTANCE, "Lock card", null, new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.Toggle(false, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.components.DebitCardOperationsSectionKt$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit unit;
                ((java.lang.Boolean) obj).booleanValue();
                unit = kotlin.Unit.INSTANCE;
                return unit;
            }
        }), null, 40, null), new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardOperationItem("set_preferred", com.paypal.pds.core.Icon.TrophyFill.INSTANCE, "Set as preferred", "Make this card your preferred way to pay online with PayPal.", null, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.components.DebitCardOperationsSectionKt$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit unit;
                unit = kotlin.Unit.INSTANCE;
                return unit;
            }
        }, 16, null), new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardOperationItem("add_to_google_pay", com.paypal.pds.core.Icon.WalletFill.INSTANCE, "Add to Google Pay", "Card active in Google Pay.", null, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.components.DebitCardOperationsSectionKt$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit unit;
                unit = kotlin.Unit.INSTANCE;
                return unit;
            }
        }, 16, null), new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardOperationItem("favorite_stores", com.paypal.pds.core.Icon.BagFill.INSTANCE, "Add to favorite stores", null, null, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.components.DebitCardOperationsSectionKt$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit unit;
                unit = kotlin.Unit.INSTANCE;
                return unit;
            }
        }, 24, null), new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardOperationItem("change_pin", com.paypal.pds.core.Icon.CheckCircle.INSTANCE, "Change PIN", null, null, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.components.DebitCardOperationsSectionKt$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit unit;
                unit = kotlin.Unit.INSTANCE;
                return unit;
            }
        }, 24, null), new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardOperationItem(com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardAnalyticsConstants.REPLACE_DIGITAL_CARD_FEATURE, com.paypal.pds.core.Icon.Warning.INSTANCE, "Replace digital card", null, null, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.components.DebitCardOperationsSectionKt$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit unit;
                unit = kotlin.Unit.INSTANCE;
                return unit;
            }
        }, 24, null), new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardOperationItem("report_card", com.paypal.pds.core.Icon.Warning.INSTANCE, "Report lost, stolen, or damaged card", null, null, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.components.DebitCardOperationsSectionKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit unit;
                unit = kotlin.Unit.INSTANCE;
                return unit;
            }
        }, 24, null), new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardOperationItem(com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardAnalyticsConstants.CANCEL_CARD_FEATURE, com.paypal.pds.core.Icon.XCircle.INSTANCE, "Cancel card", null, null, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.components.DebitCardOperationsSectionKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit unit;
                unit = kotlin.Unit.INSTANCE;
                return unit;
            }
        }, 24, null)});
    }

    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardOperationItem cardOperationItem) {
        java.lang.String id = cardOperationItem.getId();
        if (kotlin.jvm.internal.Intrinsics.areEqual(id, java.lang.String.valueOf(com.paypal.oslo.feature.debitcard.R.id.feature_debit_card_operation_lock_card))) {
            return com.paypal.oslo.feature.debitcard.shared.analytics.ManageCardAnalytics.INSTANCE.getLOCK_UNLOCK_CARD();
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(id, java.lang.String.valueOf(com.paypal.oslo.feature.debitcard.R.id.feature_debit_card_operation_change_pin))) {
            return com.paypal.oslo.feature.debitcard.shared.analytics.ManageCardAnalytics.INSTANCE.getCHANGE_PIN();
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(id, java.lang.String.valueOf(com.paypal.oslo.feature.debitcard.R.id.feature_debit_card_operation_view_pin))) {
            return com.paypal.oslo.feature.debitcard.shared.analytics.ManageCardAnalytics.INSTANCE.getVIEW_PIN();
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(id, java.lang.String.valueOf(com.paypal.oslo.feature.debitcard.R.id.feature_debit_card_operation_find_atm))) {
            return com.paypal.oslo.feature.debitcard.shared.analytics.ManageCardAnalytics.INSTANCE.getFIND_ATM();
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(id, java.lang.String.valueOf(com.paypal.oslo.feature.debitcard.R.id.feature_debit_card_operation_request_physical_card))) {
            return com.paypal.oslo.feature.debitcard.shared.analytics.ManageCardAnalytics.INSTANCE.getREQUEST_PHYSICAL_CARD();
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(id, java.lang.String.valueOf(com.paypal.oslo.feature.debitcard.R.id.feature_debit_card_operation_replace_digital_card))) {
            return com.paypal.oslo.feature.debitcard.shared.analytics.ManageCardAnalytics.INSTANCE.getREPLACE_DIGITAL_CARD();
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(id, java.lang.String.valueOf(com.paypal.oslo.feature.debitcard.R.id.feature_debit_card_operation_report_lost_stolen))) {
            return com.paypal.oslo.feature.debitcard.shared.analytics.ManageCardAnalytics.INSTANCE.getREPORT_LOST_STOLEN_CARD();
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(id, java.lang.String.valueOf(com.paypal.oslo.feature.debitcard.R.id.feature_debit_card_operation_report_card))) {
            return com.paypal.oslo.feature.debitcard.shared.analytics.ManageCardAnalytics.INSTANCE.getREPORT_LOST_STOLEN_DAMAGED_CARD();
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(id, java.lang.String.valueOf(com.paypal.oslo.feature.debitcard.R.id.feature_debit_card_operation_cancel_card))) {
            return com.paypal.oslo.feature.debitcard.shared.analytics.ManageCardAnalytics.INSTANCE.getCANCEL_CARD();
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(id, java.lang.String.valueOf(com.paypal.oslo.feature.debitcard.R.id.feature_debit_card_operation_add_to_google_pay))) {
            return com.paypal.oslo.feature.debitcard.shared.analytics.ManageCardAnalytics.INSTANCE.getPUSH_PROVISIONING();
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(id, java.lang.String.valueOf(com.paypal.oslo.feature.debitcard.R.id.feature_debit_card_operation_card_connect))) {
            return com.paypal.oslo.feature.debitcard.shared.analytics.ManageCardAnalytics.INSTANCE.getCARD_CONNECT();
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(id, java.lang.String.valueOf(com.paypal.oslo.feature.debitcard.R.id.feature_debit_card_operation_add_secondary_cardholder))) {
            return com.paypal.oslo.feature.debitcard.shared.analytics.ManageCardAnalytics.INSTANCE.getADD_SECONDARY_CARDHOLDER();
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(id, java.lang.String.valueOf(com.paypal.oslo.feature.debitcard.R.id.feature_debit_card_operation_manage_secondary_cardholder))) {
            return com.paypal.oslo.feature.debitcard.shared.analytics.ManageCardAnalytics.INSTANCE.getMANAGE_SECONDARY_CARDHOLDER();
        }
        return com.paypal.oslo.feature.debitcard.shared.analytics.ManageCardAnalytics.INSTANCE.getUNKNOWN_DEBIT_CARD_OPERATION();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$47j5Xj8HiZJicaZnu1WIsAlb_nI(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument, kotlin.jvm.functions.Function1 function1) {
        onDeactivateContactlessClickHandler(debitInstrument.getId(), function1);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HpfRIIT4F835uttnpj8F_ROFQZM(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentMoneyAmount debitInstrumentMoneyAmount, com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.FundingOptionsComponentVariant fundingOptionsComponentVariant, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0 function02, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        FundedByOperationSection(appNavigator, debitCardProductName, str, debitInstrumentMoneyAmount, fundingOptionsComponentVariant, function0, modifier, function02, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QKI2vhcq_FfDdoos0z7tr7raj8M(java.util.List list, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, final kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardConnectEligibilityState cardConnectEligibilityState, final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        int i3;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer composer3 = composer;
        int i4 = 1;
        int i5 = 0;
        if (composer3.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(473652177, i, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.components.DebitCardOperationsSection.<anonymous> (DebitCardOperationsSection.kt:91)");
            }
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer3, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer3, companion);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer3.createNode(constructor);
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
            composer3.startReplaceGroup(1967551843);
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardOperationItem cardOperationItem = (com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardOperationItem) it.next();
                java.lang.String id = cardOperationItem.getId();
                if (kotlin.jvm.internal.Intrinsics.areEqual(id, java.lang.String.valueOf(com.paypal.oslo.feature.debitcard.R.id.feature_debit_card_operation_add_to_google_pay))) {
                    composer3.startReplaceGroup(-1721830580);
                    com.paypal.oslo.feature.debitcard.pushprovisioning.ui.model.PushProvisioningWidgetConfig pushProvisioningWidgetConfig = new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.model.PushProvisioningWidgetConfig(debitCardProductName, "debit_card_management", com.paypal.oslo.feature.debitcard.pushprovisioning.ui.model.PushProvisioningWidgetStyle.Condensed.INSTANCE, false, null, 24, null);
                    androidx.compose.ui.Modifier component = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.component(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), i4, null), getHighSpeedVideoFpsRanges(cardOperationItem));
                    boolean changed = composer3.changed(function1);
                    java.lang.Object rememberedValue = composer.rememberedValue();
                    if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.components.DebitCardOperationsSectionKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.components.DebitCardOperationsSectionKt.$r8$lambda$x5ZQT8nNGDcB4vqC6FjakocEUEc(kotlin.jvm.functions.Function1.this, (com.paypal.oslo.feature.debitcard.pushprovisioning.ui.model.PushProvisioningResult) obj);
                            }
                        };
                        composer3.updateRememberedValue(rememberedValue);
                    }
                    com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetKt.PushProvisioningWidget(appNavigator, pushProvisioningWidgetConfig, component, null, null, (kotlin.jvm.functions.Function1) rememberedValue, null, null, composer, 0, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE);
                    composer.endReplaceGroup();
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(id, java.lang.String.valueOf(com.paypal.oslo.feature.debitcard.R.id.feature_debit_card_operation_card_connect))) {
                    composer3.startReplaceGroup(-1720093123);
                    getHighSpeedVideoSizes(cardOperationItem, cardConnectEligibilityState, composer3, i5);
                    composer.endReplaceGroup();
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(id, java.lang.String.valueOf(com.paypal.oslo.feature.debitcard.R.id.feature_debit_card_operation_activate_and_deactivate_contactless))) {
                    composer3.startReplaceGroup(-1719710552);
                    if (debitInstrument != null) {
                        composer3.startReplaceGroup(-1719449935);
                        androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), i4, null);
                        boolean changedInstance = composer3.changedInstance(debitInstrument);
                        boolean changed2 = composer3.changed(function1);
                        java.lang.Object rememberedValue2 = composer.rememberedValue();
                        if ((changedInstance | changed2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.components.DebitCardOperationsSectionKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.components.DebitCardOperationsSectionKt.$r8$lambda$47j5Xj8HiZJicaZnu1WIsAlb_nI(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument.this, function1);
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue2);
                        }
                        i2 = i5;
                        i3 = i4;
                        composer2 = composer3;
                        com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationKt.ContactlessPaymentsOperation(appNavigator, debitInstrument, m1708paddingVpY3zN4$default, (kotlin.jvm.functions.Function0) rememberedValue2, null, composer, 0, 16);
                        composer.endReplaceGroup();
                    } else {
                        i2 = i5;
                        i3 = i4;
                        composer2 = composer3;
                        composer2.startReplaceGroup(-1718796486);
                        composer.endReplaceGroup();
                    }
                    composer.endReplaceGroup();
                    composer3 = composer2;
                    i5 = i2;
                    i4 = i3;
                } else {
                    int i6 = i5;
                    androidx.compose.runtime.Composer composer4 = composer3;
                    composer4.startReplaceGroup(-1718699239);
                    com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.components.CardOperationKt.CardOperation(cardOperationItem, com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.component(androidx.compose.ui.Modifier.INSTANCE, getHighSpeedVideoFpsRanges(cardOperationItem)), composer4, i6, i6);
                    composer.endReplaceGroup();
                }
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$UEfIsacisLshfaIhopJzdjOq5wM(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(639308188);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(639308188, updateChangedFlags, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.components.DebitCardOperationsSectionPreview (DebitCardOperationsSection.kt:368)");
            }
            com.paypal.oslo.core.navigation.AppNavigator appNavigator = new com.paypal.oslo.core.navigation.AppNavigator(kotlin.collections.CollectionsKt.emptyList(), null, 2, null);
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(com.paypal.pds.core.ModifierExtensionsKt.background((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.INSTANCE, (com.paypal.pds.core.Color) com.paypal.pds.core.Color.ContentUtilityInverse.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), com.paypal.pds.core.ConstantsKt.getSpacing16());
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1706padding3ABfNKs);
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
            DebitCardOperationsSection(createSampleCardOperations(), appNavigator, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.UNKNOWN, null, null, null, null, startRestartGroup, 384, 120);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.components.DebitCardOperationsSectionKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.components.DebitCardOperationsSectionKt.$r8$lambda$UEfIsacisLshfaIhopJzdjOq5wM(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$U_9Gk61yy1Yuyy_FMN9EdnnNpJA(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent debitCardManagementEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardManagementEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cTjcbX9CejhzmcIdljH9CJoq25g(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1634373520);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1634373520, updateChangedFlags, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.components.DebitCardOperationsSectionLargeFontPreview (DebitCardOperationsSection.kt:390)");
            }
            com.paypal.oslo.core.navigation.AppNavigator appNavigator = new com.paypal.oslo.core.navigation.AppNavigator(kotlin.collections.CollectionsKt.emptyList(), null, 2, null);
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(com.paypal.pds.core.ModifierExtensionsKt.background((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.INSTANCE, (com.paypal.pds.core.Color) com.paypal.pds.core.Color.ContentUtilityInverse.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), com.paypal.pds.core.ConstantsKt.getSpacing16());
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1706padding3ABfNKs);
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
            DebitCardOperationsSection(createSampleCardOperations(), appNavigator, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.UNKNOWN, null, null, null, null, startRestartGroup, 384, 120);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.components.DebitCardOperationsSectionKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.components.DebitCardOperationsSectionKt.$r8$lambda$cTjcbX9CejhzmcIdljH9CJoq25g(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$q-VlReAthoV8e4BY8C8JyT8f9QM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14378$r8$lambda$qVlReAthoV8e4BY8C8JyT8f9QM(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardOperationItem cardOperationItem, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardConnectEligibilityState cardConnectEligibilityState, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoSizes(cardOperationItem, cardConnectEligibilityState, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$x5ZQT8nNGDcB4vqC6FjakocEUEc(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.debitcard.pushprovisioning.ui.model.PushProvisioningResult pushProvisioningResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushProvisioningResult, "");
        if (pushProvisioningResult instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.ui.model.PushProvisioningResult.Success) {
            function1.invoke(((com.paypal.oslo.feature.debitcard.pushprovisioning.ui.model.PushProvisioningResult.Success) pushProvisioningResult).isPinSetupSuccess() ? (com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent) com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.PushProvisioningAndPinSetupSuccessful.INSTANCE : (com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent) com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.PushProvisioningSuccessful.INSTANCE);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xtzEc1S3L7JwkffMaU9d853lub0(java.util.List list, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardConnectEligibilityState cardConnectEligibilityState, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        DebitCardOperationsSection(list, appNavigator, debitCardProductName, modifier, cardConnectEligibilityState, function1, debitInstrument, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
