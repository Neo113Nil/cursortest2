package com.paypal.oslo.feature.smartroute.ui.error;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/error/SmartRouteErrorType;", "Lcom/paypal/oslo/feature/smartroute/ui/error/SmartRouteErrorConfig;", "toConfig", "(Lcom/paypal/oslo/feature/smartroute/ui/error/SmartRouteErrorType;)Lcom/paypal/oslo/feature/smartroute/ui/error/SmartRouteErrorConfig;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SmartRouteErrorConfigKt {
    public static final com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorConfig toConfig(com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorType smartRouteErrorType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smartRouteErrorType, "");
        int i = com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorConfigKt.WhenMappings.$EnumSwitchMapping$0[smartRouteErrorType.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorConfig.Retry.INSTANCE;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorConfig.NoNetwork.INSTANCE;
        }
        if (i == 3) {
            return com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorConfig.Fatal.INSTANCE;
        }
        if (i != 4) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorConfig.FeatureUnavailable.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorType.values().length];
            try {
                iArr[com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorType.RETRY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorType.NO_NETWORK.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorType.FATAL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorType.FEATURE_UNAVAILABLE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
