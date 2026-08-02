package com.paypal.android.taptopay.data.thales.card;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\"\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/paypal/android/taptopay/domain/model/card/AddCardState;", "Lcom/paypal/android/taptopay/data/thales/card/ThalesDigitizeCardState$SDKError;", "errorState", "", "handleMGSDKError", "(Lkotlinx/coroutines/channels/ProducerScope;Lcom/paypal/android/taptopay/data/thales/card/ThalesDigitizeCardState$SDKError;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/gemalto/mfs/mwsdk/mobilegateway/enrollment/MGErrorCode;", "Lcom/paypal/android/taptopay/domain/model/card/AddCardState$OTPError;", "toOTPError", "(Lcom/gemalto/mfs/mwsdk/mobilegateway/enrollment/MGErrorCode;)Lcom/paypal/android/taptopay/domain/model/card/AddCardState$OTPError;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class MGSDKErrorKt {
    public static final java.lang.Object handleMGSDKError(kotlinx.coroutines.channels.ProducerScope<? super com.paypal.android.taptopay.domain.model.card.AddCardState> producerScope, com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState.SDKError sDKError, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode errorCode = sDKError.getErrorCode();
        int i = com.paypal.android.taptopay.data.thales.card.MGSDKErrorKt.WhenMappings.$EnumSwitchMapping$0[errorCode.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            java.lang.Object send = producerScope.send(new com.paypal.android.taptopay.domain.model.card.AddCardState.Failure.OTPError(toOTPError(errorCode), sDKError.getDebugMessage()), continuation);
            return send == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? send : kotlin.Unit.INSTANCE;
        }
        java.lang.Object send2 = producerScope.send(new com.paypal.android.taptopay.domain.model.card.AddCardState.Failure.DefaultError(errorCode.name(), sDKError.getDebugMessage()), continuation);
        return send2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? send2 : kotlin.Unit.INSTANCE;
    }

    public static final com.paypal.android.taptopay.domain.model.card.AddCardState.OTPError toOTPError(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode mGErrorCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mGErrorCode, "");
        int i = com.paypal.android.taptopay.data.thales.card.MGSDKErrorKt.WhenMappings.$EnumSwitchMapping$0[mGErrorCode.ordinal()];
        if (i == 1) {
            return com.paypal.android.taptopay.domain.model.card.AddCardState.OTPError.INCORRECT_OTP;
        }
        if (i == 2) {
            return com.paypal.android.taptopay.domain.model.card.AddCardState.OTPError.INCORRECT_OTP_MAX_TRY_EXCEEDED;
        }
        if (i == 3) {
            return com.paypal.android.taptopay.domain.model.card.AddCardState.OTPError.OTP_EXPIRED;
        }
        throw new java.lang.IllegalArgumentException("Unknown MGErrorCode: ".concat(java.lang.String.valueOf(mGErrorCode)));
    }

    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.values().length];
            try {
                iArr[com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.INCORRECT_OTP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.INCORRECT_OTP_MAX_TRY_EXCEEDED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.OTP_EXPIRED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
