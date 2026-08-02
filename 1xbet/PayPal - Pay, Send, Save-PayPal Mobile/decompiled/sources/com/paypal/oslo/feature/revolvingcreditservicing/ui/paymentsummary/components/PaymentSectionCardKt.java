package com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components;

@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u001aV\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u000e\u001a\u001f\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u0015\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u0016\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0014¨\u0006\u0017"}, d2 = {"PaymentSectionCard", "", "section", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/uimodel/PaymentSectionUiModel;", "onItemClick", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RepaymentActivity;", "onCancelPaymentClick", "", "Lkotlin/ParameterName;", "name", "id", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/uimodel/PaymentSectionUiModel;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PaymentSummarySectionHeader", "titleRes", "", "(ILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PaymentSectionUpcomingPreview", "(Landroidx/compose/runtime/Composer;I)V", "PaymentSectionCompletedPreview", "PaymentSectionPendingSinglePreview", "revolvingcredit-servicing_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PaymentSectionCardKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PaymentSectionCard(final com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSectionUiModel paymentSectionUiModel, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentSectionUiModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1654585427);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(paymentSectionUiModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1654585427, i3, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.PaymentSectionCard (PaymentSectionCard.kt:37)");
                }
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, modifier4);
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
                PaymentSummarySectionHeader(paymentSectionUiModel.getSectionType().getSectionHeaderTextRes(), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing4(), 5, null), startRestartGroup, 0, 0);
                modifier3 = modifier4;
                com.paypal.pds.components.CardKt.Card(null, null, null, com.paypal.pds.components.CardStyle.Outlined.INSTANCE, null, null, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(917945609, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.PaymentSectionCardKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.PaymentSectionCardKt.$r8$lambda$hLfffYXejZ5_gkvhD8l1t2FDG4A(com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSectionUiModel.this, function1, function12, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, (com.paypal.pds.components.CardStyle.Outlined.$stable << 9) | 805306368, 503);
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.PaymentSectionCardKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.PaymentSectionCardKt.$r8$lambda$PBDqs7Nm4FkmUequkBXIFlRYzFg(com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSectionUiModel.this, function1, function12, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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

    public static final void PaymentSummarySectionHeader(final int i, final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
        int i4;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-58187545);
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i4 & 19) != 18, i4 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i5 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-58187545, i4, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.PaymentSummarySectionHeader (PaymentSectionCard.kt:64)");
            }
            com.paypal.pds.components.SectionHeaderKt.SectionHeader(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), androidx.compose.ui.res.StringResources_androidKt.stringResource(i, startRestartGroup, i4 & 14), null, null, startRestartGroup, 0, 12);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.PaymentSectionCardKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.PaymentSectionCardKt.m18557$r8$lambda$L5uMjYegxCIBf4de2jMbioWxtA(i, modifier, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Bk1hfwmEI9gFgjuTcRbvY00mp_Y(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2002658271);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2002658271, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.PaymentSectionPendingSinglePreview (PaymentSectionCard.kt:137)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSectionUiModel paymentSectionUiModel = new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSectionUiModel(com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.SectionType.Pending, kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.preview.PreviewDataHelpersKt.createMockPayment$default("preview-pending-001", "$75.00", "Nov 19", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus.PENDING, false, "PayPal Balance", "1234", false, false, 400, null)));
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.PaymentSectionCardKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.PaymentSectionCardKt.m18562$r8$lambda$lX2FylljjatLlwEvv8UNWPq_hU((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.PaymentSectionCardKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.PaymentSectionCardKt.$r8$lambda$pqx2EJnMXpOJU1aMp2K95vJfMm8((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            PaymentSectionCard(paymentSectionUiModel, function1, (kotlin.jvm.functions.Function1) rememberedValue2, null, startRestartGroup, 432, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.PaymentSectionCardKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.PaymentSectionCardKt.$r8$lambda$Bk1hfwmEI9gFgjuTcRbvY00mp_Y(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CJoM7yMAJ23k3gn8k2E2EovYkTo(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JstcuszKzK33TH2_yZDGy85Orv4(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.RepaymentActivityUiModel repaymentActivityUiModel) {
        function1.invoke(repaymentActivityUiModel.getRepaymentActivity().getId());
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$L5uMjYegxCIBf4de2jMbioWxt-A, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18557$r8$lambda$L5uMjYegxCIBf4de2jMbioWxtA(int i, androidx.compose.ui.Modifier modifier, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        PaymentSummarySectionHeader(i, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NWmJCOZj_jhHCE5iw7hRBt_IEOg(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.RepaymentActivityUiModel repaymentActivityUiModel) {
        function1.invoke(repaymentActivityUiModel.getRepaymentActivity());
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$NwvjpIRPyQq03i-sP2febbeTSY8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18558$r8$lambda$NwvjpIRPyQq03isP2febbeTSY8(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity repaymentActivity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(repaymentActivity, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PBDqs7Nm4FkmUequkBXIFlRYzFg(com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSectionUiModel paymentSectionUiModel, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PaymentSectionCard(paymentSectionUiModel, function1, function12, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$UI0sP5Vp-TI8rn1pBsBEMvbtZXk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18559$r8$lambda$UI0sP5VpTI8rn1pBsBEMvbtZXk(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity repaymentActivity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(repaymentActivity, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Z9fz-RjdvjWEqC4X-UCEMLsMmlE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18560$r8$lambda$Z9fzRjdvjWEqC4XUCEMLsMmlE(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$grQSxtGp-M3ltfm9n9gq5osH84w, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18561$r8$lambda$grQSxtGpM3ltfm9n9gq5osH84w(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1767562296);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1767562296, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.PaymentSectionUpcomingPreview (PaymentSectionCard.kt:73)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSectionUiModel paymentSectionUiModel = new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSectionUiModel(com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.SectionType.Upcoming, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.RepaymentActivityUiModel[]{com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.preview.PreviewDataHelpersKt.createMockPayment$default("preview-upcoming-001", "$100.00", "Nov 25", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus.UPCOMING, true, "Wells Fargo", "1234", false, false, 384, null), com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.preview.PreviewDataHelpersKt.createMockPayment$default("preview-upcoming-002", "$50.00", "Dec 1", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus.UPCOMING, true, "Chase", "5678", true, false, 256, null)}));
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.PaymentSectionCardKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.PaymentSectionCardKt.m18558$r8$lambda$NwvjpIRPyQq03isP2febbeTSY8((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.PaymentSectionCardKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.PaymentSectionCardKt.m18560$r8$lambda$Z9fzRjdvjWEqC4XUCEMLsMmlE((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            PaymentSectionCard(paymentSectionUiModel, function1, (kotlin.jvm.functions.Function1) rememberedValue2, null, startRestartGroup, 432, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.PaymentSectionCardKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.PaymentSectionCardKt.m18561$r8$lambda$grQSxtGpM3ltfm9n9gq5osH84w(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hLfffYXejZ5_gkvhD8l1t2FDG4A(com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSectionUiModel paymentSectionUiModel, final kotlin.jvm.functions.Function1 function1, final kotlin.jvm.functions.Function1 function12, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(917945609, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.PaymentSectionCard.<anonymous>.<anonymous> (PaymentSectionCard.kt:47)");
            }
            for (final com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.RepaymentActivityUiModel repaymentActivityUiModel : paymentSectionUiModel.getPayments()) {
                boolean changed = composer.changed(function1);
                boolean changedInstance = composer.changedInstance(repaymentActivityUiModel);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if ((changed | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.PaymentSectionCardKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.PaymentSectionCardKt.$r8$lambda$NWmJCOZj_jhHCE5iw7hRBt_IEOg(kotlin.jvm.functions.Function1.this, repaymentActivityUiModel);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
                boolean changed2 = composer.changed(function12);
                boolean changedInstance2 = composer.changedInstance(repaymentActivityUiModel);
                java.lang.Object rememberedValue2 = composer.rememberedValue();
                if ((changed2 | changedInstance2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.PaymentSectionCardKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.PaymentSectionCardKt.$r8$lambda$JstcuszKzK33TH2_yZDGy85Orv4(kotlin.jvm.functions.Function1.this, repaymentActivityUiModel);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.RepaymentActivityItemRowKt.RepaymentActivityItemView(repaymentActivityUiModel, function0, (kotlin.jvm.functions.Function0) rememberedValue2, composer, 0);
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$lX2FylljjatLlwE-vv8UNWPq_hU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18562$r8$lambda$lX2FylljjatLlwEvv8UNWPq_hU(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity repaymentActivity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(repaymentActivity, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pqx2EJnMXpOJU1aMp2K95vJfMm8(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$tst_JsXh_71mIoT14BX7-ecI83U, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18563$r8$lambda$tst_JsXh_71mIoT14BX7ecI83U(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2029158355);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2029158355, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.PaymentSectionCompletedPreview (PaymentSectionCard.kt:106)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSectionUiModel paymentSectionUiModel = new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSectionUiModel(com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.SectionType.Completed, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.RepaymentActivityUiModel[]{com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.preview.PreviewDataHelpersKt.createMockPayment$default("preview-completed-001", "$250.00", "Nov 15", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus.COMPLETED, false, "Bank of America", "9012", true, false, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE, null), com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.preview.PreviewDataHelpersKt.createMockPayment$default("preview-completed-002", "$125.50", "Nov 10", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus.COMPLETED, false, "Citibank", "3456", false, false, 400, null)}));
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.PaymentSectionCardKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.PaymentSectionCardKt.m18559$r8$lambda$UI0sP5VpTI8rn1pBsBEMvbtZXk((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.PaymentSectionCardKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.PaymentSectionCardKt.$r8$lambda$CJoM7yMAJ23k3gn8k2E2EovYkTo((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            PaymentSectionCard(paymentSectionUiModel, function1, (kotlin.jvm.functions.Function1) rememberedValue2, null, startRestartGroup, 432, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.PaymentSectionCardKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.components.PaymentSectionCardKt.m18563$r8$lambda$tst_JsXh_71mIoT14BX7ecI83U(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
