package com.paypal.oslo.feature.subscriptions.shared.success;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/success/SuccessModalType;", "type", "Lkotlin/Function0;", "", "onCta", "SuccessModal", "(Lcom/paypal/oslo/feature/subscriptions/shared/success/SuccessModalType;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SuccessModalKt {
    public static final void SuccessModal(final com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType successModalType, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        java.lang.String stringResource;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(successModalType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(561227237);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(successModalType) : startRestartGroup.changedInstance(successModalType) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(561227237, i2, -1, "com.paypal.oslo.feature.subscriptions.shared.success.SuccessModal (SuccessModal.kt:21)");
            }
            int i3 = i2 & 14;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1725576657, i3, -1, "com.paypal.oslo.feature.subscriptions.shared.success.getModalTitle (SuccessModal.kt:32)");
            }
            if (successModalType instanceof com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType.AgreementUnlink) {
                startRestartGroup.startReplaceGroup(-421787680);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_success_agreement_unlink_title, new java.lang.Object[]{((com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType.AgreementUnlink) successModalType).getMerchantName()}, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                if (!(successModalType instanceof com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType.AgreementCancel)) {
                    startRestartGroup.startReplaceGroup(-421789288);
                    startRestartGroup.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                startRestartGroup.startReplaceGroup(-421782656);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_success_agreement_cancel_title, new java.lang.Object[]{((com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType.AgreementCancel) successModalType).getMerchantName()}, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalBodyKt.SuccessModalBody(stringResource, function0, startRestartGroup, i2 & 112);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalKt.m19968$r8$lambda$KrJ75eHz6NOUEmFSBQSGk95d_Y(com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType.this, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$KrJ75eHz6NOUEmF-SBQSGk95d_Y, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19968$r8$lambda$KrJ75eHz6NOUEmFSBQSGk95d_Y(com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType successModalType, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        SuccessModal(successModalType, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
