package com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry;

@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aH\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032!\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f\u001a\r\u0010\r\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"AmountOptions", "", "items", "", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/amountentry/model/AmountOptionItem;", "onAmountSelect", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "item", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AmountOptionsPreview", "(Landroidx/compose/runtime/Composer;I)V", "wallet_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AmountOptionsKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AmountOptions(final java.util.List<com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.model.AmountOptionItem> list, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.model.AmountOptionItem, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1132656423);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
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
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1132656423, i3, -1, "com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountOptions (AmountOptions.kt:40)");
                }
                androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 54);
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
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountOptionsKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return java.lang.Boolean.valueOf(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountOptionsKt.$r8$lambda$iFPXBK1Xgvnm_iXnEkJEk9KrRWc((com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.model.AmountOptionItem) obj));
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountOptionsKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountOptionsKt.m21258$r8$lambda$zan9xqxnOqdizm35l8hKn2SiQ((com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.model.AmountOptionItem) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) rememberedValue2;
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountOptionsKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return java.lang.Boolean.valueOf(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountOptionsKt.$r8$lambda$vSFh8NeDlvG7AGqCaHLNr8MtEI4((com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.model.AmountOptionItem) obj));
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                kotlin.jvm.functions.Function1 function14 = (kotlin.jvm.functions.Function1) rememberedValue3;
                boolean z = (i3 & 112) == 32;
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (z || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountOptionsKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountOptionsKt.$r8$lambda$x1D7QtIcBaNfuj3YPp7dN4eP7RA(kotlin.jvm.functions.Function1.this, (com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.model.AmountOptionItem) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                kotlin.jvm.functions.Function1 function15 = (kotlin.jvm.functions.Function1) rememberedValue4;
                java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountOptionsKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountOptionsKt.m21259$r8$lambda$IhpVsu4z0wHIfjf9oZPrqTW4Rw((com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.model.AmountOptionItem) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                kotlin.jvm.functions.Function1 function16 = (kotlin.jvm.functions.Function1) rememberedValue5;
                java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountOptionsKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountOptionsKt.$r8$lambda$fqhtvKASzhnEBTvOREcnTPOiKbc((com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.model.AmountOptionItem) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                androidx.compose.ui.Modifier modifier5 = modifier4;
                composer2 = startRestartGroup;
                com.paypal.pds.components.ChipKt.Chip(list, function12, function13, function14, function15, function16, (kotlin.jvm.functions.Function1) rememberedValue6, null, null, false, startRestartGroup, (i3 & 14) | 1772976, 896);
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountOptionsKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountOptionsKt.m21260$r8$lambda$lndsiKqlZuH2jeMOcTI6XwQ3w8(list, function1, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void AmountOptionsPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1797473257);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1797473257, i, -1, "com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountOptionsPreview (AmountOptions.kt:62)");
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
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.model.AmountOptionItem[]{new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.model.AmountOptionItem("25.0", "USD", true), new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.model.AmountOptionItem("50.1", "USD", false), new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.model.AmountOptionItem("75", "USD", false), new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.model.AmountOptionItem("100", "USD", false)});
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountOptionsKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountOptionsKt.$r8$lambda$8_vHxlXoH7V4YzKnqm8LSquiV04((com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.model.AmountOptionItem) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            AmountOptions(listOf, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 48, 4);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountOptionsKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountOptionsKt.$r8$lambda$ME3EPacIT3niQX4BaFYt6M2ozDI(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$-zan9-xqxnOqdizm35l8hKn2SiQ, reason: not valid java name */
    public static /* synthetic */ java.lang.String m21258$r8$lambda$zan9xqxnOqdizm35l8hKn2SiQ(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.model.AmountOptionItem amountOptionItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountOptionItem, "");
        return com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_USD.concat(java.lang.String.valueOf(amountOptionItem.getAmount()));
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8_vHxlXoH7V4YzKnqm8LSquiV04(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.model.AmountOptionItem amountOptionItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountOptionItem, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$IhpVsu4z0wHIfjf9-oZPrqTW4Rw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21259$r8$lambda$IhpVsu4z0wHIfjf9oZPrqTW4Rw(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.model.AmountOptionItem amountOptionItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountOptionItem, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ME3EPacIT3niQX4BaFYt6M2ozDI(int i, androidx.compose.runtime.Composer composer, int i2) {
        AmountOptionsPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object $r8$lambda$fqhtvKASzhnEBTvOREcnTPOiKbc(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.model.AmountOptionItem amountOptionItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountOptionItem, "");
        return amountOptionItem.getAmount();
    }

    public static /* synthetic */ boolean $r8$lambda$iFPXBK1Xgvnm_iXnEkJEk9KrRWc(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.model.AmountOptionItem amountOptionItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountOptionItem, "");
        return amountOptionItem.isSelected();
    }

    /* renamed from: $r8$lambda$lndsiKqlZu-H2jeMOcTI6XwQ3w8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21260$r8$lambda$lndsiKqlZuH2jeMOcTI6XwQ3w8(java.util.List list, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AmountOptions(list, function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ boolean $r8$lambda$vSFh8NeDlvG7AGqCaHLNr8MtEI4(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.model.AmountOptionItem amountOptionItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountOptionItem, "");
        return false;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$x1D7QtIcBaNfuj3YPp7dN4eP7RA(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.model.AmountOptionItem amountOptionItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountOptionItem, "");
        function1.invoke(amountOptionItem);
        return kotlin.Unit.INSTANCE;
    }
}
