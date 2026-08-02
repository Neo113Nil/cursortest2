package com.paypal.oslo.feature.checkcapture.ui;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/feature/checkcapture/ui/mvi/CheckCaptureErrorType;", "errorType", "", "mapErrorTypeToStringResource", "(Lcom/paypal/oslo/feature/checkcapture/ui/mvi/CheckCaptureErrorType;)I"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CheckCaptureErrorMessageMapperKt {
    public static final int mapErrorTypeToStringResource(com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureErrorType checkCaptureErrorType) {
        int i = checkCaptureErrorType == null ? -1 : com.paypal.oslo.feature.checkcapture.ui.CheckCaptureErrorMessageMapperKt.WhenMappings.$EnumSwitchMapping$0[checkCaptureErrorType.ordinal()];
        if (i == -1) {
            return com.paypal.oslo.feature.checkcapture.R.string.feature_check_capture_error_generic;
        }
        if (i == 1) {
            return com.paypal.oslo.feature.checkcapture.R.string.feature_check_capture_error_feature_disabled;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.checkcapture.R.string.feature_check_capture_error_authentication_failed;
        }
        if (i == 3) {
            return com.paypal.oslo.feature.checkcapture.R.string.feature_check_capture_error_network;
        }
        if (i != 4) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.checkcapture.R.string.feature_check_capture_error_generic;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureErrorType.values().length];
            try {
                iArr[com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureErrorType.FEATURE_DISABLED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureErrorType.AUTHENTICATION_FAILED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureErrorType.NETWORK_ERROR.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureErrorType.GENERIC_ERROR.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
