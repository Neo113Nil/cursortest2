package com.paypal.oslo.feature.directdeposit.ui.error.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/ui/error/model/DirectDepositErrorType;", "Lcom/paypal/oslo/feature/directdeposit/ui/error/model/DirectDepositErrorConfig;", "toConfig", "(Lcom/paypal/oslo/feature/directdeposit/ui/error/model/DirectDepositErrorType;)Lcom/paypal/oslo/feature/directdeposit/ui/error/model/DirectDepositErrorConfig;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DirectDepositErrorConfigKt {
    public static final com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorConfig toConfig(com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorType directDepositErrorType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directDepositErrorType, "");
        int i = com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorConfigKt.WhenMappings.$EnumSwitchMapping$0[directDepositErrorType.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorConfig.Retry.INSTANCE;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorConfig.NoNetwork.INSTANCE;
        }
        if (i == 3) {
            return com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorConfig.Fatal.INSTANCE;
        }
        if (i != 4) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorConfig.FeatureUnavailable.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorType.values().length];
            try {
                iArr[com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorType.RETRY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorType.NO_NETWORK.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorType.FATAL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorType.FEATURE_UNAVAILABLE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
