package com.paypal.oslo.feature.wallet.preferred.ui.inStore;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0001¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"InStorePaymentScreenShimmer", "", "onBackClick", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "wallet_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class InStorePaymentScreenShimmerKt {
    public static final void InStorePaymentScreenShimmer(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1806186321);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if (!startRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStorePaymentScreenShimmerKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            kotlin.Unit unit;
                            unit = kotlin.Unit.INSTANCE;
                            return unit;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1806186321, i3, -1, "com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStorePaymentScreenShimmer (InStorePaymentScreenShimmer.kt:18)");
            }
            com.paypal.oslo.feature.wallet.preferred.ui.common.PaymentPreferenceScreenShimmerKt.PaymentPreferenceScreenShimmer(com.paypal.oslo.feature.wallet.R.string.feature_wallet_preferred_instore_payment_header_title, com.paypal.oslo.feature.wallet.R.string.feature_wallet_preferred_instore_payment_header_description, com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStorePaymentScreenKt.TestTagInstorePaymentScreenShimmer, function0, startRestartGroup, ((i3 << 9) & 7168) | 384, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStorePaymentScreenShimmerKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStorePaymentScreenShimmerKt.m21474$r8$lambda$sJIV082KF4sf4v_26ru1jUYaaM(kotlin.jvm.functions.Function0.this, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$sJI-V082KF4sf4v_26ru1jUYaaM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21474$r8$lambda$sJIV082KF4sf4v_26ru1jUYaaM(kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        InStorePaymentScreenShimmer(function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
