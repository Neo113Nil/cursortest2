package com.paypal.oslo.feature.qrc.ui.review.components;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\n\u001a\r\u0010\u000b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\n\u001a\r\u0010\f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\n¨\u0006\r"}, d2 = {"Header", "", "uiModel", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewUiModel;", "commonComponents", "Lcom/paypal/oslo/feature/moneymovement/api/shared/components/CommonComponents;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewUiModel;Lcom/paypal/oslo/feature/moneymovement/api/shared/components/CommonComponents;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "HeaderWithBalancePreview", "(Landroidx/compose/runtime/Composer;I)V", "HeaderWithoutBalancePreview", "HeaderPayPalWorldPreview", "qrc_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class HeaderKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Header(final com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiModel paymentReviewUiModel, final com.paypal.oslo.feature.moneymovement.api.shared.components.CommonComponents commonComponents, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentReviewUiModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(commonComponents, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-785436836);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(paymentReviewUiModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(commonComponents) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-785436836, i3, -1, "com.paypal.oslo.feature.qrc.ui.review.components.Header (Header.kt:61)");
                }
                com.paypal.oslo.feature.moneymovement.api.shared.components.CommonComponents.ComposeDefaultImpls.Header$default(new com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderConfig(false, false, false, com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderTrailing.TO, null, null, false, false, 183, null), new com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderData(com.paypal.oslo.feature.moneymovement.api.domain.Intent.PAY, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.INSTANCE.fiat(paymentReviewUiModel.getAmountCurrencyCode(), paymentReviewUiModel.getRawAmount()), new com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination.Contact(null, paymentReviewUiModel.getMerchantName(), paymentReviewUiModel.getMerchantNameDisplayInitials()), null, null, null, null, 120, null), com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderCallbacks.Companion.invoke$default(com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderCallbacks.INSTANCE, null, null, null, 7, null), modifier4, commonComponents, startRestartGroup, ((i3 << 3) & 7168) | 6 | ((i3 << 9) & 57344), 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.review.components.HeaderKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.qrc.ui.review.components.HeaderKt.$r8$lambda$_FMg2KqGDVVbCcnc8CWelBAicBE(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiModel.this, commonComponents, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$XTK22Ds_EbeNHV18ZNOowp3PWEk(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1768614939);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1768614939, updateChangedFlags, -1, "com.paypal.oslo.feature.qrc.ui.review.components.HeaderWithBalancePreview (Header.kt:121)");
            }
            Header(com.paypal.oslo.feature.qrc.ui.review.preview.PreviewData.INSTANCE.getPAYMENT_REVIEW_PP_BALANCE(), com.paypal.oslo.feature.qrc.ui.review.components.PreviewCommonComponents.INSTANCE, null, startRestartGroup, 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.review.components.HeaderKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.qrc.ui.review.components.HeaderKt.$r8$lambda$XTK22Ds_EbeNHV18ZNOowp3PWEk(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_FMg2KqGDVVbCcnc8CWelBAicBE(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiModel paymentReviewUiModel, com.paypal.oslo.feature.moneymovement.api.shared.components.CommonComponents commonComponents, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        Header(paymentReviewUiModel, commonComponents, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$m6XpG2rQunOPvjjDfKr3-hfNRTA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17831$r8$lambda$m6XpG2rQunOPvjjDfKr3hfNRTA(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1675641977);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1675641977, updateChangedFlags, -1, "com.paypal.oslo.feature.qrc.ui.review.components.HeaderWithoutBalancePreview (Header.kt:132)");
            }
            Header(com.paypal.oslo.feature.qrc.ui.review.preview.PreviewData.INSTANCE.getPAYMENT_REVIEW_ONLY_FI(), com.paypal.oslo.feature.qrc.ui.review.components.PreviewCommonComponents.INSTANCE, null, startRestartGroup, 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.review.components.HeaderKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.qrc.ui.review.components.HeaderKt.m17831$r8$lambda$m6XpG2rQunOPvjjDfKr3hfNRTA(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mvn_5HUwSp0K1b8XsBDHXP7ySy8(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1395804658);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1395804658, updateChangedFlags, -1, "com.paypal.oslo.feature.qrc.ui.review.components.HeaderPayPalWorldPreview (Header.kt:143)");
            }
            Header(com.paypal.oslo.feature.qrc.ui.review.preview.PreviewData.INSTANCE.getPAYMENT_REVIEW_PPW(), com.paypal.oslo.feature.qrc.ui.review.components.PreviewCommonComponents.INSTANCE, null, startRestartGroup, 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.review.components.HeaderKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.qrc.ui.review.components.HeaderKt.$r8$lambda$mvn_5HUwSp0K1b8XsBDHXP7ySy8(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
