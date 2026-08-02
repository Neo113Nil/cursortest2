package com.paypal.oslo.feature.pools.extensions;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/pools/shared/ui/error/ErrorType;", "Lcom/paypal/oslo/feature/pools/shared/ui/error/StyleConfig;", "toStyleConfig", "(Lcom/paypal/oslo/feature/pools/shared/ui/error/ErrorType;)Lcom/paypal/oslo/feature/pools/shared/ui/error/StyleConfig;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ErrorTypeExtensionsKt {
    public static final com.paypal.oslo.feature.pools.shared.ui.error.StyleConfig toStyleConfig(com.paypal.oslo.feature.pools.shared.ui.error.ErrorType errorType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
        int i = com.paypal.oslo.feature.pools.extensions.ErrorTypeExtensionsKt.WhenMappings.$EnumSwitchMapping$0[errorType.ordinal()];
        if (i == 1) {
            return new com.paypal.oslo.feature.pools.shared.ui.error.StyleConfig(com.paypal.pds.core.Icon.Info.INSTANCE, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, false, true, true);
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return new com.paypal.oslo.feature.pools.shared.ui.error.StyleConfig(null, com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE, com.paypal.pds.components.ButtonSize.Medium.INSTANCE, true, false, false);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.pools.shared.ui.error.ErrorType.values().length];
            try {
                iArr[com.paypal.oslo.feature.pools.shared.ui.error.ErrorType.GENERIC.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.pools.shared.ui.error.ErrorType.LOAD_DATA.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
