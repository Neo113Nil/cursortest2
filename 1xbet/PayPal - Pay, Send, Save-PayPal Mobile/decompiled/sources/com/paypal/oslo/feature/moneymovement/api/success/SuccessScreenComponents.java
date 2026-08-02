package com.paypal.oslo.feature.moneymovement.api.success;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J/\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH'¢\u0006\u0002\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/success/SuccessScreenComponents;", "", "Content", "", "config", "Lcom/paypal/oslo/feature/moneymovement/api/success/MMPSuccessScreenConfig;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/feature/moneymovement/api/success/MMPSuccessScreenData;", "callbacks", "Lcom/paypal/oslo/feature/moneymovement/api/success/MMPSuccessScreenCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/moneymovement/api/success/MMPSuccessScreenConfig;Lcom/paypal/oslo/feature/moneymovement/api/success/MMPSuccessScreenData;Lcom/paypal/oslo/feature/moneymovement/api/success/MMPSuccessScreenCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "money-movement-api_prodRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface SuccessScreenComponents {
    void Content(com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenConfig mMPSuccessScreenConfig, com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenData mMPSuccessScreenData, com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenCallbacks mMPSuccessScreenCallbacks, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class ComposeDefaultImpls {
        /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00d1  */
        /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:56:0x00c7  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x008e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final void Content$default(final com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenConfig mMPSuccessScreenConfig, final com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenData mMPSuccessScreenData, final com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenCallbacks mMPSuccessScreenCallbacks, androidx.compose.ui.Modifier modifier, final com.paypal.oslo.feature.moneymovement.api.success.SuccessScreenComponents successScreenComponents, androidx.compose.runtime.Composer composer, final int i, final int i2) {
            int i3;
            androidx.compose.ui.Modifier modifier2;
            final androidx.compose.ui.Modifier modifier3;
            androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mMPSuccessScreenConfig, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mMPSuccessScreenData, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mMPSuccessScreenCallbacks, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(successScreenComponents, "");
            androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1657320656);
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changed(mMPSuccessScreenConfig) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
            if ((i & 48) == 0) {
                i3 |= startRestartGroup.changed(mMPSuccessScreenData) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i3 |= startRestartGroup.changed(mMPSuccessScreenCallbacks) ? 256 : 128;
            }
            int i4 = i2 & 8;
            if (i4 != 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    i3 |= (32768 & i) == 0 ? startRestartGroup.changed(successScreenComponents) : startRestartGroup.changedInstance(successScreenComponents) ? 16384 : 8192;
                }
                if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                } else {
                    androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1657320656, i3, -1, "com.paypal.oslo.feature.moneymovement.api.success.SuccessScreenComponents.ComposeDefaultImpls.Content$default (SuccessScreenComponents.kt:-1)");
                    }
                    successScreenComponents.Content(mMPSuccessScreenConfig, mMPSuccessScreenData, mMPSuccessScreenCallbacks, modifier4, startRestartGroup, i3 & org.apache.commons.imaging.formats.jpeg.JpegConstants.COM_MARKER);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.api.success.SuccessScreenComponents$ComposeDefaultImpls$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.moneymovement.api.success.SuccessScreenComponents.ComposeDefaultImpls.$r8$lambda$p2lOskuAlpPYC_T0H1grUp1BMxo(com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenConfig.this, mMPSuccessScreenData, mMPSuccessScreenCallbacks, modifier3, successScreenComponents, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            modifier2 = modifier;
            if ((i & 24576) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$p2lOskuAlpPYC_T0H1grUp1BMxo(com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenConfig mMPSuccessScreenConfig, com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenData mMPSuccessScreenData, com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenCallbacks mMPSuccessScreenCallbacks, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.moneymovement.api.success.SuccessScreenComponents successScreenComponents, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
            Content$default(mMPSuccessScreenConfig, mMPSuccessScreenData, mMPSuccessScreenCallbacks, modifier, successScreenComponents, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            return kotlin.Unit.INSTANCE;
        }
    }
}
