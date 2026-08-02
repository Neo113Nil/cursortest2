package com.paypal.oslo.feature.subscriptions.bulkfi.ui;

@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\t\u001a\u0017\u0010\n\u001a\u00020\u00012\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0003¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"BulkUpdateFiList", "", "uiState", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiUiState$Success;", "onEvent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiUiEvent;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiUiState$Success;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BulkUpdateFiListPreview", "params", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiListPreviewData;", "(Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiListPreviewData;Landroidx/compose/runtime/Composer;I)V", "subscriptions_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BulkUpdateFiListKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BulkUpdateFiList(final com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiState.Success success, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiEvent, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(success, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1830906345);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(success) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1830906345, i3, -1, "com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiList (BulkUpdateFiList.kt:63)");
                }
                androidx.compose.foundation.lazy.LazyListState rememberLazyListState = androidx.compose.foundation.lazy.LazyListStateKt.rememberLazyListState(0, 0, startRestartGroup, 0, 3);
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), "bulk_update_fi_list");
                androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing12());
                boolean changedInstance = startRestartGroup.changedInstance(success);
                boolean z = (i3 & 112) == 32;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if ((changedInstance | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiListKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiListKt.m19757$r8$lambda$4I0JmKYWTXBHYSCRpSC9WXohOQ(com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiState.Success.this, function1, (androidx.compose.foundation.lazy.LazyListScope) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.ui.Modifier modifier4 = modifier3;
                androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(testTag, rememberLazyListState, null, false, m1602spacedBy0680j_4, null, null, false, null, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 0, 492);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiListKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiListKt.$r8$lambda$kTalRK8ylgSGhIuw3AUQrDt_2H4(com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiState.Success.this, function1, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$-HnmJHy4rAjGvcQxUrQ9vR3Us8o, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19756$r8$lambda$HnmJHy4rAjGvcQxUrQ9vR3Us8o(final com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiListPreviewData bulkUpdateFiListPreviewData, int i, androidx.compose.runtime.Composer composer, int i2) {
        int i3;
        androidx.compose.runtime.Composer composer2;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1668458628);
        if ((updateChangedFlags & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(bulkUpdateFiListPreviewData) ? 4 : 2) | updateChangedFlags;
        } else {
            i3 = updateChangedFlags;
        }
        if (!startRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1668458628, i3, -1, "com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiListPreview (BulkUpdateFiList.kt:153)");
            }
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
            composer2 = startRestartGroup;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(bulkUpdateFiListPreviewData.getName(), null, null, null, null, null, false, 0, 0, null, null, startRestartGroup, 0, 0, 2046);
            com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiState.Success state = bulkUpdateFiListPreviewData.getState();
            java.lang.Object rememberedValue = composer2.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiListKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiListKt.$r8$lambda$8RXW7NMpmPYxXtVmnzw5G1coU70((com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiEvent) obj);
                    }
                };
                composer2.updateRememberedValue(rememberedValue);
            }
            BulkUpdateFiList(state, (kotlin.jvm.functions.Function1) rememberedValue, com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, composer2, 54, 2), composer2, 48, 0);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiListKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiListKt.m19756$r8$lambda$HnmJHy4rAjGvcQxUrQ9vR3Us8o(com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiListPreviewData.this, updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$4I0JmKYW-TXBHYSCRpSC9WXohOQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19757$r8$lambda$4I0JmKYWTXBHYSCRpSC9WXohOQ(final com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiState.Success success, final kotlin.jvm.functions.Function1 function1, androidx.compose.foundation.lazy.LazyListScope lazyListScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListScope, "");
        int i = 0;
        for (java.lang.Object obj : success.getBulkUpdateFiItems()) {
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiDataUiModel bulkUpdateFiDataUiModel = (com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiDataUiModel) obj;
            final com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrument = bulkUpdateFiDataUiModel.getFundingInstrument();
            if (fundingInstrument != null) {
                androidx.compose.foundation.lazy.LazyListScope.item$default(lazyListScope, fundingInstrument.getId(), null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-806525541, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiListKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function3
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                        return com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiListKt.$r8$lambda$J7KSXau3t5VHya7CIAuqlYzFXpk(com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel.this, (androidx.compose.foundation.lazy.LazyItemScope) obj2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                    }
                }), 2, null);
            } else {
                androidx.compose.foundation.lazy.LazyListScope.item$default(lazyListScope, "no_fi_header_".concat(java.lang.String.valueOf(i)), null, com.paypal.oslo.feature.subscriptions.bulkfi.ui.ComposableSingletons$BulkUpdateFiListKt.INSTANCE.m19769getLambda$156143566$subscriptions_prodRelease(), 2, null);
            }
            final java.util.List<com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel> consumerAgreements = bulkUpdateFiDataUiModel.getConsumerAgreements();
            final kotlin.jvm.functions.Function2 function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiListKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiListKt.$r8$lambda$u0lcZtm3sffSZ_DdjOntZ1HIA_g(((java.lang.Integer) obj2).intValue(), (com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel) obj3);
                }
            };
            final int i2 = i;
            lazyListScope.items(consumerAgreements.size(), new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object>() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiListKt$BulkUpdateFiList$lambda$0$0$0$$inlined$itemsIndexed$default$1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
                    return invoke(num.intValue());
                }

                public final java.lang.Object invoke(int i3) {
                    return kotlin.jvm.functions.Function2.this.invoke(java.lang.Integer.valueOf(i3), consumerAgreements.get(i3));
                }
            }, new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object>() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiListKt$BulkUpdateFiList$lambda$0$0$0$$inlined$itemsIndexed$default$2
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
                    return invoke(num.intValue());
                }

                public final java.lang.Object invoke(int i3) {
                    consumerAgreements.get(i3);
                    return null;
                }
            }, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(2039820996, true, new kotlin.jvm.functions.Function4<androidx.compose.foundation.lazy.LazyItemScope, java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiListKt$BulkUpdateFiList$lambda$0$0$0$$inlined$itemsIndexed$default$3
                @Override // kotlin.jvm.functions.Function4
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, java.lang.Integer num, androidx.compose.runtime.Composer composer, java.lang.Integer num2) {
                    invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, int i3, androidx.compose.runtime.Composer composer, int i4) {
                    int i5;
                    if ((i4 & 6) == 0) {
                        i5 = (composer.changed(lazyItemScope) ? 4 : 2) | i4;
                    } else {
                        i5 = i4;
                    }
                    if ((i4 & 48) == 0) {
                        i5 |= composer.changed(i3) ? 32 : 16;
                    }
                    if (!composer.shouldExecute((i5 & 147) != 146, i5 & 1)) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(2039820996, i5, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                    }
                    com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel subscriptionItemUiModel = (com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel) consumerAgreements.get(i3);
                    composer.startReplaceGroup(-489059613);
                    boolean contains = success.getSelectedAgreements().contains(subscriptionItemUiModel.getId());
                    com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel = fundingInstrument;
                    kotlin.jvm.functions.Function1 function12 = function1;
                    int i6 = i2;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(i6);
                    sb.append("-");
                    sb.append(i3);
                    com.paypal.oslo.feature.subscriptions.bulkfi.ui.AgreementItemKt.AgreementItem(fundingInstrumentUiModel, subscriptionItemUiModel, contains, function12, sb.toString(), null, composer, 0, 32);
                    composer.endReplaceGroup();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                }
            }));
            i++;
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8RXW7NMpmPYxXtVmnzw5G1coU70(com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiEvent bulkUpdateFiUiEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bulkUpdateFiUiEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ kotlin.Unit $r8$lambda$J7KSXau3t5VHya7CIAuqlYzFXpk(com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel, androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, androidx.compose.runtime.Composer composer, int i) {
        java.lang.String str;
        java.lang.String fiLabel;
        java.lang.String str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyItemScope, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-806525541, i, -1, "com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BulkUpdateFiList.kt:78)");
            }
            java.lang.String name2 = fundingInstrumentUiModel.getName();
            if (name2 == null) {
                composer.startReplaceGroup(-1155274153);
                composer.endReplaceGroup();
                str = null;
            } else {
                composer.startReplaceGroup(-1155274152);
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_bulk_fi_flow_fi_prefix, new java.lang.Object[]{name2}, composer, 0);
                composer.endReplaceGroup();
                str = stringResource;
            }
            if (fundingInstrumentUiModel.getType() instanceof com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.PayPal.Debit) {
                composer.startReplaceGroup(-1154895518);
                java.lang.String formattedBalance = fundingInstrumentUiModel.getFormattedBalance();
                if (formattedBalance == null) {
                    composer.startReplaceGroup(-1154895519);
                    composer.endReplaceGroup();
                    fiLabel = null;
                } else {
                    composer.startReplaceGroup(-1154895518);
                    fiLabel = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_available_paypal_balance, new java.lang.Object[]{formattedBalance}, composer, 0);
                    composer.endReplaceGroup();
                }
                composer.endReplaceGroup();
            } else if (fundingInstrumentUiModel.getType() instanceof com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.PayPal.Credit) {
                composer.startReplaceGroup(-1154579102);
                composer.endReplaceGroup();
                str2 = null;
                com.paypal.oslo.feature.subscriptions.bulkfi.ui.FundingInstrumentSectionKt.FundingInstrumentSection(fundingInstrumentUiModel, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 0.0f, 13, null), str, str2, composer, 0, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            } else {
                composer.startReplaceGroup(-1976905347);
                fiLabel = com.paypal.oslo.feature.subscriptions.shared.ui.model.FiLabelResultKt.getFiLabel(fundingInstrumentUiModel, (android.content.res.Resources) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalResources()));
                composer.endReplaceGroup();
            }
            str2 = fiLabel;
            com.paypal.oslo.feature.subscriptions.bulkfi.ui.FundingInstrumentSectionKt.FundingInstrumentSection(fundingInstrumentUiModel, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 0.0f, 13, null), str, str2, composer, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$kTalRK8ylgSGhIuw3AUQrDt_2H4(com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiState.Success success, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        BulkUpdateFiList(success, function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object $r8$lambda$u0lcZtm3sffSZ_DdjOntZ1HIA_g(int i, com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel subscriptionItemUiModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscriptionItemUiModel, "");
        return subscriptionItemUiModel.getId();
    }
}
