package com.paypal.oslo.feature.taptopay.navigation;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/api/navigation/SetupFlowDestination;", "Lcom/paypal/oslo/feature/taptopay/api/navigation/RequireScreenLockDestination$EntryPoint;", "toRequireScreenLockEntryPoint", "(Lcom/paypal/oslo/feature/taptopay/api/navigation/SetupFlowDestination;)Lcom/paypal/oslo/feature/taptopay/api/navigation/RequireScreenLockDestination$EntryPoint;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ExtensionsKt {
    public static final com.paypal.oslo.feature.taptopay.api.navigation.RequireScreenLockDestination.EntryPoint toRequireScreenLockEntryPoint(com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDestination setupFlowDestination) {
        com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDestination.EntryPoint entryPoint = setupFlowDestination != null ? setupFlowDestination.getEntryPoint() : null;
        int i = entryPoint == null ? -1 : com.paypal.oslo.feature.taptopay.navigation.ExtensionsKt.WhenMappings.$EnumSwitchMapping$0[entryPoint.ordinal()];
        if (i != -1) {
            if (i == 1) {
                return com.paypal.oslo.feature.taptopay.api.navigation.RequireScreenLockDestination.EntryPoint.PL2GO;
            }
            if (i == 2) {
                return com.paypal.oslo.feature.taptopay.api.navigation.RequireScreenLockDestination.EntryPoint.ONBOARDING;
            }
            if (i != 3) {
                if (i == 4) {
                    return com.paypal.oslo.feature.taptopay.api.navigation.RequireScreenLockDestination.EntryPoint.PPDC;
                }
                if (i != 5) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return com.paypal.oslo.feature.taptopay.api.navigation.RequireScreenLockDestination.EntryPoint.SHOPPING;
            }
        }
        return com.paypal.oslo.feature.taptopay.api.navigation.RequireScreenLockDestination.EntryPoint.ORGANIC;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDestination.EntryPoint.values().length];
            try {
                iArr[com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDestination.EntryPoint.PL2GO.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDestination.EntryPoint.ONBOARDING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDestination.EntryPoint.ORGANIC.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDestination.EntryPoint.PPDC.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDestination.EntryPoint.SHOPPING.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
