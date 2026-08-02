package com.paypal.oslo.feature.debitcard.shared.ui.model;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0007\u001a\u00020\u0000*\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorConfig;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "actionButtonItem", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorConfig;)Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorFlowType;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, "toConfig", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorFlowType;)Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorConfig;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitErrorConfigKt {
    public static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item actionButtonItem(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig debitErrorConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitErrorConfig, "");
        if ((debitErrorConfig instanceof com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig.Recoverable) || (debitErrorConfig instanceof com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig.NoNetwork) || (debitErrorConfig instanceof com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig.InContextRecoverable) || (debitErrorConfig instanceof com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig.InContextNoNetwork)) {
            return com.paypal.oslo.feature.debitcard.shared.analytics.DebitErrorScreenAnalytics.INSTANCE.getTRY_AGAIN_BUTTON();
        }
        if ((debitErrorConfig instanceof com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig.Fatal) || (debitErrorConfig instanceof com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig.Ineligible) || (debitErrorConfig instanceof com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig.InContextFatal) || (debitErrorConfig instanceof com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig.InContextIneligible)) {
            return com.paypal.oslo.feature.debitcard.shared.analytics.DebitErrorScreenAnalytics.INSTANCE.getOK_BUTTON();
        }
        if (!(debitErrorConfig instanceof com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig.ContactCustomerService) && !(debitErrorConfig instanceof com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig.InContextContactCustomerService)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.debitcard.shared.analytics.DebitErrorScreenAnalytics.INSTANCE.getCONTACT_US_BUTTON();
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig toConfig$default(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorFlowType debitErrorFlowType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            debitErrorFlowType = com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorFlowType.DEFAULT;
        }
        return toConfig(debitErrorType, debitErrorFlowType);
    }

    public static final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig toConfig(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorFlowType debitErrorFlowType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitErrorType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitErrorFlowType, "");
        int i = com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfigKt.WhenMappings.$EnumSwitchMapping$0[debitErrorFlowType.ordinal()];
        if (i == 1) {
            int i2 = com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfigKt.WhenMappings.$EnumSwitchMapping$1[debitErrorType.ordinal()];
            if (i2 == 1) {
                return com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig.Recoverable.INSTANCE;
            }
            if (i2 == 2) {
                return com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig.NoNetwork.INSTANCE;
            }
            if (i2 == 3) {
                return com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig.Fatal.INSTANCE;
            }
            if (i2 == 4) {
                return com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig.ContactCustomerService.INSTANCE;
            }
            if (i2 != 5) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig.Ineligible.INSTANCE;
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        int i3 = com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfigKt.WhenMappings.$EnumSwitchMapping$1[debitErrorType.ordinal()];
        if (i3 == 1) {
            return com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig.InContextRecoverable.INSTANCE;
        }
        if (i3 == 2) {
            return com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig.InContextNoNetwork.INSTANCE;
        }
        if (i3 == 3) {
            return com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig.InContextFatal.INSTANCE;
        }
        if (i3 == 4) {
            return com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig.InContextContactCustomerService.INSTANCE;
        }
        if (i3 != 5) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig.InContextIneligible.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorFlowType.values().length];
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorFlowType.DEFAULT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorFlowType.IN_CONTEXT_ACQUISITION_FLOW.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.values().length];
            try {
                iArr2[com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.RECOVERABLE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.NO_NETWORK.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.FATAL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.CONTACT_CUSTOMER_SERVICE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.INELIGIBLE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
