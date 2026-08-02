package com.paypal.oslo.feature.balance.ui.autoReload.fiselection;

@kotlin.Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0085\u0001\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u001e\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\u00030\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007H\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001ag\u0010\u0019\u001a\u00020\u00032\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u000eH\u0003¢\u0006\u0002\u0010\u001f\u001aI\u0010 \u001a\u00020\u00032\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u001dH\u0003¢\u0006\u0002\u0010\"\u001a\r\u0010#\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010$\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006%²\u0006\n\u0010&\u001a\u00020\nX\u008a\u0084\u0002"}, d2 = {"MaxSheetHeightFraction", "", "FiSelectionBottomSheet", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "fiList", "", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/FundingInstrumentOption;", "selectedFiId", "", "reloadAmount", "Ljava/math/BigDecimal;", "isLowBalanceFlow", "", "isBusinessAccount", "onSelectFi", "Lkotlin/Function2;", "addBankRequestId", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "addCardRequestId", "analyticsContexts", "Lcom/paypal/oslo/core/telemetry/analytics/context/AnalyticsContext;", "FiSelectionBottomSheet-fUX17CQ", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Ljava/util/List;Ljava/lang/String;Ljava/math/BigDecimal;ZZLkotlin/jvm/functions/Function2;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Landroidx/compose/runtime/Composer;II)V", "InstantFiSection", "savingsAccounts", "instantBanks", "cards", "Lkotlin/Function1;", "shouldShowSavingsMessage", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/math/BigDecimal;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V", "StandardFiSection", "standardBanks", "(Ljava/util/List;Ljava/lang/String;Ljava/math/BigDecimal;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "FiSelectionBottomSheetPreview", "(Landroidx/compose/runtime/Composer;I)V", "balance_prodRelease", "mutableSelectedFiId"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FiSelectionBottomSheetKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: FiSelectionBottomSheet-fUX17CQ, reason: not valid java name */
    public static final void m12050FiSelectionBottomSheetfUX17CQ(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.util.List<? extends com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption> list, final java.lang.String str, final java.math.BigDecimal bigDecimal, final boolean z, final boolean z2, final kotlin.jvm.functions.Function2<? super com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption, ? super java.util.List<? extends com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption>, kotlin.Unit> function2, final java.lang.String str2, final java.lang.String str3, java.util.List<? extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> list2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        java.util.List<? extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> list3;
        androidx.compose.runtime.Composer composer2;
        final java.util.List<? extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> list4;
        boolean z3;
        boolean z4;
        final com.paypal.oslo.core.navigation.AppNavigator appNavigator2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigDecimal, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(702558866);
        int i3 = (i & 6) == 0 ? (startRestartGroup.changed(appNavigator) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(bigDecimal) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changed(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changed(z2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= startRestartGroup.changed(str3) ? 67108864 : 33554432;
        }
        int i4 = i2 & 512;
        if (i4 != 0) {
            i3 |= 805306368;
            list3 = list2;
        } else {
            list3 = list2;
            if ((i & 805306368) == 0) {
                i3 |= startRestartGroup.changedInstance(list3) ? 536870912 : 268435456;
            }
        }
        if (!startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            list4 = list3;
        } else {
            java.util.List<? extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> emptyList = i4 != 0 ? kotlin.collections.CollectionsKt.emptyList() : list3;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(702558866, i3, -1, "com.paypal.oslo.feature.balance.ui.autoReload.fiselection.FiSelectionBottomSheet (FiSelectionBottomSheet.kt:88)");
            }
            boolean changed = startRestartGroup.changed(list);
            java.util.ArrayList rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : list) {
                    if (((com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption) obj).getType() == com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType.SAVINGS) {
                        arrayList.add(obj);
                    }
                }
                rememberedValue = arrayList;
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            java.util.List list5 = (java.util.List) rememberedValue;
            boolean changed2 = startRestartGroup.changed(list);
            int i5 = 458752 & i3;
            boolean z5 = i5 == 131072;
            java.util.ArrayList rememberedValue2 = startRestartGroup.rememberedValue();
            if ((changed2 | z5) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    java.util.Iterator it2 = it;
                    com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption fundingInstrumentOption = (com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption) next;
                    if (!z2 && fundingInstrumentOption.getType() == com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType.BANK && fundingInstrumentOption.getMode() == com.paypal.oslo.feature.balance.domain.model.FundingInstrumentMode.INSTANT) {
                        com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentBankOption fundingInstrumentBankOption = fundingInstrumentOption instanceof com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentBankOption ? (com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentBankOption) fundingInstrumentOption : null;
                        if ((fundingInstrumentBankOption != null ? fundingInstrumentBankOption.getMaximumLimit() : null) != null) {
                            arrayList2.add(next);
                        }
                    }
                    it = it2;
                }
                rememberedValue2 = arrayList2;
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            java.util.List list6 = (java.util.List) rememberedValue2;
            boolean changed3 = startRestartGroup.changed(list);
            java.util.ArrayList rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.util.Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    java.lang.Object next2 = it3.next();
                    java.util.Iterator it4 = it3;
                    if (((com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption) next2).getType() == com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType.CARD) {
                        arrayList3.add(next2);
                    }
                    it3 = it4;
                }
                rememberedValue3 = arrayList3;
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            java.util.List list7 = (java.util.List) rememberedValue3;
            boolean changed4 = startRestartGroup.changed(list);
            boolean z6 = i5 == 131072;
            java.util.ArrayList rememberedValue4 = startRestartGroup.rememberedValue();
            if ((z6 | changed4) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.util.Iterator it5 = list.iterator();
                while (it5.hasNext()) {
                    java.lang.Object next3 = it5.next();
                    com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption fundingInstrumentOption2 = (com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption) next3;
                    java.util.Iterator it6 = it5;
                    if (fundingInstrumentOption2.getType() == com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType.BANK) {
                        if (fundingInstrumentOption2.getMode() != com.paypal.oslo.feature.balance.domain.model.FundingInstrumentMode.STANDARD && !z2) {
                            com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentBankOption fundingInstrumentBankOption2 = fundingInstrumentOption2 instanceof com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentBankOption ? (com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentBankOption) fundingInstrumentOption2 : null;
                            if ((fundingInstrumentBankOption2 != null ? fundingInstrumentBankOption2.getMaximumLimit() : null) != null) {
                            }
                        }
                        arrayList4.add(next3);
                    }
                    it5 = it6;
                }
                rememberedValue4 = arrayList4;
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            java.util.List list8 = (java.util.List) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue5;
            androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
            startRestartGroup.startReplaceGroup(849254659);
            float mo1415toDpu2uoSUM = density.mo1415toDpu2uoSUM((int) (((androidx.compose.ui.platform.WindowInfo) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalWindowInfo())).mo7767getContainerSizeYbymL2g() & 4294967295L));
            startRestartGroup.endReplaceGroup();
            androidx.compose.ui.Modifier context = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.module(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.m1728heightInVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, androidx.compose.ui.unit.Dp.m8601constructorimpl(mo1415toDpu2uoSUM * 0.5f), 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16()), androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null), com.paypal.oslo.feature.balance.common.ui.BalanceTestTags.AutoReload.FiSelection.BOTTOM_SHEET), com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.AutoReload.INSTANCE.getFI_SELECTION_ZONE()), kotlin.collections.CollectionsKt.plus((java.util.Collection) com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstantsKt.toAutoReloadUserIntent(com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.AutoReload.ACTION_SELECT_FI), (java.lang.Iterable) emptyList));
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 6);
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
            androidx.compose.runtime.MutableState mutableState2 = mutableState;
            java.lang.String str4 = (java.lang.String) mutableState2.getValue();
            int i6 = 3670016 & i3;
            boolean z7 = i6 == 1048576;
            boolean changedInstance = startRestartGroup.changedInstance(list);
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if ((z7 | changedInstance) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.fiselection.FiSelectionBottomSheetKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.balance.ui.autoReload.fiselection.FiSelectionBottomSheetKt.$r8$lambda$cJgGoKuhnpofMCAYnhxutUaqFSI(kotlin.jvm.functions.Function2.this, list, (com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption) obj2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            int i7 = i3;
            getHighSpeedVideoSizes(list5, list6, list7, str4, bigDecimal, (kotlin.jvm.functions.Function1) rememberedValue6, list5.isEmpty() && z && !z2, startRestartGroup, (i3 << 3) & 57344, 0);
            java.lang.String str5 = (java.lang.String) mutableState2.getValue();
            if (i6 == 1048576) {
                composer2 = startRestartGroup;
                z3 = true;
            } else {
                composer2 = startRestartGroup;
                z3 = false;
            }
            boolean changedInstance2 = composer2.changedInstance(list);
            java.lang.Object rememberedValue7 = composer2.rememberedValue();
            if ((z3 | changedInstance2) || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.fiselection.FiSelectionBottomSheetKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.balance.ui.autoReload.fiselection.FiSelectionBottomSheetKt.$r8$lambda$9LUoaXwurZCcpAaO301YpS7D0ig(kotlin.jvm.functions.Function2.this, list, (com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption) obj2);
                    }
                };
                composer2.updateRememberedValue(rememberedValue7);
            }
            getHighResolutionOutputSizeshNQ4ISI(list8, str5, bigDecimal, z2, (kotlin.jvm.functions.Function1) rememberedValue7, composer2, ((i7 >> 3) & 896) | ((i7 >> 6) & 7168));
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.balance.common.ui.BalanceTestTags.AutoReload.FiSelection.ADD_FI_BUTTON);
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_fi_link_card, composer2, 0);
            com.paypal.pds.core.Icon.Plus plus = com.paypal.pds.core.Icon.Plus.INSTANCE;
            int i8 = i7 & 14;
            boolean z8 = i8 == 4;
            boolean z9 = (i7 & 234881024) == 67108864;
            java.lang.Object rememberedValue8 = composer2.rememberedValue();
            if ((z8 || z9) || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                z4 = true;
                appNavigator2 = appNavigator;
                rememberedValue8 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.fiselection.FiSelectionBottomSheetKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.balance.ui.autoReload.fiselection.FiSelectionBottomSheetKt.$r8$lambda$2t1SrZZbyrbBRESSEPm3wAIDBko(com.paypal.oslo.core.navigation.AppNavigator.this, str3);
                    }
                };
                composer2.updateRememberedValue(rememberedValue8);
            } else {
                z4 = true;
                appNavigator2 = appNavigator;
            }
            com.paypal.oslo.feature.balance.ui.autoReload.fiselection.FiSelectionComponentsKt.AddFundingSourceItem(stringResource, plus, (kotlin.jvm.functions.Function0) rememberedValue8, testTag, composer2, 3120, 0);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), composer2, 0);
            java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_fi_link_bank, composer2, 0);
            com.paypal.pds.core.Icon.Plus plus2 = com.paypal.pds.core.Icon.Plus.INSTANCE;
            boolean z10 = i8 == 4 ? z4 : false;
            boolean z11 = (i7 & 29360128) == 8388608 ? z4 : false;
            java.lang.Object rememberedValue9 = composer2.rememberedValue();
            if ((z10 | z11) || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue9 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.fiselection.FiSelectionBottomSheetKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.balance.ui.autoReload.fiselection.FiSelectionBottomSheetKt.$r8$lambda$OBMR7FbSiIEKKigK951QRiWsTmM(com.paypal.oslo.core.navigation.AppNavigator.this, str2);
                    }
                };
                composer2.updateRememberedValue(rememberedValue9);
            }
            com.paypal.oslo.feature.balance.ui.autoReload.fiselection.FiSelectionComponentsKt.AddFundingSourceItem(stringResource2, plus2, (kotlin.jvm.functions.Function0) rememberedValue9, null, composer2, 48, 8);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            list4 = emptyList;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.fiselection.FiSelectionBottomSheetKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.balance.ui.autoReload.fiselection.FiSelectionBottomSheetKt.$r8$lambda$M4Sw40xHYPZQqG0xCym0mmO3jFc(com.paypal.oslo.core.navigation.AppNavigator.this, list, str, bigDecimal, z, z2, function2, str2, str3, list4, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighSpeedVideoSizes(final java.util.List<? extends com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption> list, final java.util.List<? extends com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption> list2, final java.util.List<? extends com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption> list3, final java.lang.String str, final java.math.BigDecimal bigDecimal, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption, kotlin.Unit> function1, boolean z, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1681215917);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(list2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(list3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changed(bigDecimal) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 131072 : 65536;
        }
        int i4 = i2 & 64;
        if (i4 != 0) {
            i3 |= 1572864;
        } else if ((1572864 & i) == 0) {
            z2 = z;
            i3 |= startRestartGroup.changed(z2) ? 1048576 : 524288;
            if (startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                boolean z3 = i4 != 0 ? false : z2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1681215917, i3, -1, "com.paypal.oslo.feature.balance.ui.autoReload.fiselection.InstantFiSection (FiSelectionBottomSheet.kt:208)");
                }
                java.util.List<com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption> sortedByPriority = com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentSortingKt.sortedByPriority(kotlin.collections.CollectionsKt.plus((java.util.Collection) kotlin.collections.CollectionsKt.plus((java.util.Collection) list, (java.lang.Iterable) list2), (java.lang.Iterable) list3));
                java.util.List<com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption> list4 = sortedByPriority;
                if (!list4.isEmpty()) {
                    startRestartGroup.startReplaceGroup(-1489299560);
                    com.paypal.oslo.feature.balance.ui.autoReload.fiselection.FiSelectionComponentsKt.FiSectionHeader(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_fi_instant_title, startRestartGroup, 0), null, startRestartGroup, 0, 2);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-1489154449);
                    startRestartGroup.endReplaceGroup();
                }
                if (z3) {
                    startRestartGroup.startReplaceGroup(-1488930474);
                    com.paypal.oslo.feature.balance.ui.autoReload.fiselection.FiSelectionComponentsKt.SavingsInfoMessage(startRestartGroup, 0);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-1488844945);
                    startRestartGroup.endReplaceGroup();
                }
                if (!list4.isEmpty()) {
                    startRestartGroup.startReplaceGroup(-1488799747);
                    com.paypal.oslo.feature.balance.ui.autoReload.fiselection.FiSelectionComponentsKt.FiList(sortedByPriority, str, bigDecimal, function1, null, false, startRestartGroup, (i3 >> 6) & 8176, 48);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-1488567185);
                    startRestartGroup.endReplaceGroup();
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                z2 = z3;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final boolean z4 = z2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.fiselection.FiSelectionBottomSheetKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.balance.ui.autoReload.fiselection.FiSelectionBottomSheetKt.$r8$lambda$_UA54JlQVWoOvlr4UyS4fgPBwGs(list, list2, list3, str, bigDecimal, function1, z4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        z2 = z;
        if (startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final void getHighResolutionOutputSizeshNQ4ISI(final java.util.List<? extends com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption> list, final java.lang.String str, final java.math.BigDecimal bigDecimal, final boolean z, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1108710091);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(bigDecimal) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        if (!startRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1108710091, i2, -1, "com.paypal.oslo.feature.balance.ui.autoReload.fiselection.StandardFiSection (FiSelectionBottomSheet.kt:244)");
            }
            if (!list.isEmpty()) {
                startRestartGroup.startReplaceGroup(1284078305);
                com.paypal.oslo.feature.balance.ui.autoReload.fiselection.FiSelectionComponentsKt.FiSectionHeader(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_fi_standard_title, startRestartGroup, 0), null, startRestartGroup, 0, 2);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 0);
                com.paypal.oslo.feature.balance.ui.autoReload.fiselection.FiSelectionComponentsKt.FiList(list, str, bigDecimal, function1, null, z, startRestartGroup, (i2 & org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO) | ((i2 >> 3) & 7168) | ((i2 << 6) & 458752), 16);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(1284499223);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.fiselection.FiSelectionBottomSheetKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.balance.ui.autoReload.fiselection.FiSelectionBottomSheetKt.$r8$lambda$paxBgb5k8C9dqZnYNIZqIVGyxwk(list, str, bigDecimal, z, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2t1SrZZbyrbBRESSEPm3wAIDBko(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str) {
        appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.fiselection.FiSelectionBottomSheetKt$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.balance.ui.autoReload.fiselection.FiSelectionBottomSheetKt.m12049$r8$lambda$DJfKr0s1iawvFbbf3vUm_B03hQ((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9LUoaXwurZCcpAaO301YpS7D0ig(kotlin.jvm.functions.Function2 function2, java.util.List list, com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption fundingInstrumentOption) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentOption, "");
        function2.invoke(fundingInstrumentOption, list);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$B0a-uUWun5CUyMLJMI9WflG3MvI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12048$r8$lambda$B0auUWun5CUyMLJMI9WflG3MvI(int i, androidx.compose.runtime.Composer composer, int i2) {
        androidx.compose.runtime.Composer composer2;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1363052756);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1363052756, updateChangedFlags, -1, "com.paypal.oslo.feature.balance.ui.autoReload.fiselection.FiSelectionBottomSheetPreview (FiSelectionBottomSheet.kt:262)");
            }
            com.paypal.oslo.core.navigation.AppNavigator appNavigator = new com.paypal.oslo.core.navigation.AppNavigator(null, null, 3, null);
            java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentCardOption("234", "444", com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardTestTag.CARD, "6675", com.paypal.oslo.feature.balance.domain.model.FundingInstrumentMode.INSTANT, com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType.CARD, "url", false, null, "$1,000.00", "brand", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.CLASS), new com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentBankOption("4312", "4444", "Bank Instant", "9589", com.paypal.oslo.feature.balance.domain.model.FundingInstrumentMode.INSTANT, com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType.BANK, "url", false, new com.paypal.oslo.feature.balance.domain.model.Money(new java.math.BigDecimal(20000.0d), com.paypal.oslo.core.i18n.domain.model.CurrencyCode.m11384constructorimpl("USD"), null), null, com.paypal.oslo.feature.balance.domain.model.FundingInstrumentBankType.SAVINGS), new com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentBankOption("9823", "33", "Bank Standard", "4747", com.paypal.oslo.feature.balance.domain.model.FundingInstrumentMode.STANDARD, com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType.BANK, "url", false, new com.paypal.oslo.feature.balance.domain.model.Money(new java.math.BigDecimal(10000.0d), com.paypal.oslo.core.i18n.domain.model.CurrencyCode.m11384constructorimpl("USD"), null), null, com.paypal.oslo.feature.balance.domain.model.FundingInstrumentBankType.SAVINGS));
            java.math.BigDecimal bigDecimal = new java.math.BigDecimal(200.0d);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.fiselection.FiSelectionBottomSheetKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.balance.ui.autoReload.fiselection.FiSelectionBottomSheetKt.$r8$lambda$HMhiTe_OSbwgkVHx4bqKADmBFjQ((com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption) obj, (java.util.List) obj2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            composer2 = startRestartGroup;
            m12050FiSelectionBottomSheetfUX17CQ(appNavigator, listOf, "", bigDecimal, true, false, (kotlin.jvm.functions.Function2) rememberedValue, rememberNavResultRequestId, rememberNavResultRequestId, null, startRestartGroup, 1794432, 512);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.fiselection.FiSelectionBottomSheetKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.balance.ui.autoReload.fiselection.FiSelectionBottomSheetKt.m12048$r8$lambda$B0auUWun5CUyMLJMI9WflG3MvI(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$DJfKr0s1iawvFbb-f3vUm_B03hQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12049$r8$lambda$DJfKr0s1iawvFbbf3vUm_B03hQ(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext addFIAnalyticsContext = new com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext(com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.AUTO_RELOAD, (java.lang.String) null, (java.lang.String) null, (java.util.Map) null, 14, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Config config = new com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Config((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, false, false, false, true, 127, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        navigationScope.push(new com.paypal.oslo.feature.wallet.api.navigation.AddCardFlowDestination(addFIAnalyticsContext, new com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header.TopBar((java.lang.String) null, (com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction) null, (com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction) null, 7, (kotlin.jvm.internal.DefaultConstructorMarker) null), config, new com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Options(false, false, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.InitScreen.SCANNER, 3, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HMhiTe_OSbwgkVHx4bqKADmBFjQ(com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption fundingInstrumentOption, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentOption, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$M4Sw40xHYPZQqG0xCym0mmO3jFc(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.util.List list, java.lang.String str, java.math.BigDecimal bigDecimal, boolean z, boolean z2, kotlin.jvm.functions.Function2 function2, java.lang.String str2, java.lang.String str3, java.util.List list2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        m12050FiSelectionBottomSheetfUX17CQ(appNavigator, list, str, bigDecimal, z, z2, function2, str2, str3, list2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$OBMR7FbSiIEKKigK951QRiWsTmM(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str) {
        appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.banks.AddBankFlowNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.fiselection.FiSelectionBottomSheetKt$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.balance.ui.autoReload.fiselection.FiSelectionBottomSheetKt.$r8$lambda$d2vVbGjvPPFDVk9ofiphfGPBdw4((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_UA54JlQVWoOvlr4UyS4fgPBwGs(java.util.List list, java.util.List list2, java.util.List list3, java.lang.String str, java.math.BigDecimal bigDecimal, kotlin.jvm.functions.Function1 function1, boolean z, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoSizes(list, list2, list3, str, bigDecimal, function1, z, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cJgGoKuhnpofMCAYnhxutUaqFSI(kotlin.jvm.functions.Function2 function2, java.util.List list, com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption fundingInstrumentOption) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentOption, "");
        function2.invoke(fundingInstrumentOption, list);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$d2vVbGjvPPFDVk9ofiphfGPBdw4(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.wallet.api.navigation.AddBankDestination(new com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext(com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.AUTO_RELOAD, (java.lang.String) null, (java.lang.String) null, (java.util.Map) null, 14, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig(false, false, new com.paypal.oslo.feature.wallet.api.ui.banks.config.TopBarConfig((com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress) null, com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction.BACK, (com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction) null, 5, (kotlin.jvm.internal.DefaultConstructorMarker) null), 3, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$paxBgb5k8C9dqZnYNIZqIVGyxwk(java.util.List list, java.lang.String str, java.math.BigDecimal bigDecimal, boolean z, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighResolutionOutputSizeshNQ4ISI(list, str, bigDecimal, z, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
