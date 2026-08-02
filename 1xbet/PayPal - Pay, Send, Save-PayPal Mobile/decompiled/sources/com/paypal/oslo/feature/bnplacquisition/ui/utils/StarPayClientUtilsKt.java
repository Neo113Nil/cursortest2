package com.paypal.oslo.feature.bnplacquisition.ui.utils;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0005*\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0002\u0010\u0006\u001a\u0011\u0010\t\u001a\u00020\b*\u00020\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/vcc/TokenServiceProvider;", "Lcom/paypal/oslo/feature/starpay/api/TokenServiceProvider;", "toStarPayEnum", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/vcc/TokenServiceProvider;)Lcom/paypal/oslo/feature/starpay/api/TokenServiceProvider;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/vcc/CardNetwork;", "Lcom/paypal/oslo/feature/starpay/api/CardNetwork;", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/vcc/CardNetwork;)Lcom/paypal/oslo/feature/starpay/api/CardNetwork;", "Lcom/paypal/oslo/feature/starpay/api/TokenState;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/instore/WalletState;", "toDomainEnum", "(Lcom/paypal/oslo/feature/starpay/api/TokenState;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/instore/WalletState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class StarPayClientUtilsKt {
    public static final com.paypal.oslo.feature.starpay.api.TokenServiceProvider toStarPayEnum(com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.TokenServiceProvider tokenServiceProvider) {
        int i = tokenServiceProvider == null ? -1 : com.paypal.oslo.feature.bnplacquisition.ui.utils.StarPayClientUtilsKt.WhenMappings.$EnumSwitchMapping$0[tokenServiceProvider.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.starpay.api.TokenServiceProvider.MASTERCARD;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.starpay.api.TokenServiceProvider.VISA;
        }
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.bnplacquisition.LoggerKt.log;
        java.lang.String name2 = tokenServiceProvider != null ? tokenServiceProvider.name() : null;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Received ");
        sb.append(name2);
        sb.append(" as MXL TokenServiceProvider defaulting to MASTERCARD");
        com.paypal.android.logger.Logger.e$default(logger, sb.toString(), null, null, null, 14, null);
        return com.paypal.oslo.feature.starpay.api.TokenServiceProvider.MASTERCARD;
    }

    public static final com.paypal.oslo.feature.starpay.api.CardNetwork toStarPayEnum(com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.CardNetwork cardNetwork) {
        if (cardNetwork != null && com.paypal.oslo.feature.bnplacquisition.ui.utils.StarPayClientUtilsKt.WhenMappings.$EnumSwitchMapping$1[cardNetwork.ordinal()] == 1) {
            return com.paypal.oslo.feature.starpay.api.CardNetwork.MASTERCARD;
        }
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.bnplacquisition.LoggerKt.log;
        java.lang.String name2 = cardNetwork != null ? cardNetwork.name() : null;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Received ");
        sb.append(name2);
        sb.append(" as MXL CardNetwork defaulting to MASTERCARD");
        com.paypal.android.logger.Logger.e$default(logger, sb.toString(), null, null, null, 14, null);
        return com.paypal.oslo.feature.starpay.api.CardNetwork.MASTERCARD;
    }

    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.WalletState toDomainEnum(com.paypal.oslo.feature.starpay.api.TokenState tokenState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenState, "");
        int i = com.paypal.oslo.feature.bnplacquisition.ui.utils.StarPayClientUtilsKt.WhenMappings.$EnumSwitchMapping$2[tokenState.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.WalletState.ACTIVATED;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.WalletState.PENDING_ACTIVATION;
        }
        if (i == 3) {
            return com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.WalletState.ACTIVATING;
        }
        if (i == 4) {
            return com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.WalletState.SUSPENDED;
        }
        if (i != 5) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.WalletState.UNKNOWN;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.TokenServiceProvider.values().length];
            try {
                iArr[com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.TokenServiceProvider.MDES.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.TokenServiceProvider.VTS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.CardNetwork.values().length];
            try {
                iArr2[com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.CardNetwork.MASTERCARD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[com.paypal.oslo.feature.starpay.api.TokenState.values().length];
            try {
                iArr3[com.paypal.oslo.feature.starpay.api.TokenState.ACTIVE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr3[com.paypal.oslo.feature.starpay.api.TokenState.REQUIRES_ACTIVATION.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr3[com.paypal.oslo.feature.starpay.api.TokenState.ACTIVATING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr3[com.paypal.oslo.feature.starpay.api.TokenState.SUSPENDED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr3[com.paypal.oslo.feature.starpay.api.TokenState.UNKNOWN.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }
}
