package com.paypal.android.taptopay.data.thales.payment.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/android/taptopay/data/thales/payment/mapper/PaymentErrorCodeMapper;", "Lcom/paypal/android/taptopay/domain/core/Mapper;", "Lcom/gemalto/mfs/mwsdk/payment/PaymentServiceErrorCode;", "Lcom/paypal/android/taptopay/domain/model/payment/PaymentErrorCode;", "<init>", "()V", "input", "map", "(Lcom/gemalto/mfs/mwsdk/payment/PaymentServiceErrorCode;)Lcom/paypal/android/taptopay/domain/model/payment/PaymentErrorCode;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PaymentErrorCodeMapper implements com.paypal.android.taptopay.domain.core.Mapper<com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode, com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode> {
    @Override // com.paypal.android.taptopay.domain.core.Mapper
    public final com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode map(com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        switch (com.paypal.android.taptopay.data.thales.payment.mapper.PaymentErrorCodeMapper.WhenMappings.$EnumSwitchMapping$0[input.ordinal()]) {
            case 1:
                return com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.CARD_SUSPENDED;
            case 2:
                return com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.CARD_OUT_OF_PAYMENT_KEYS;
            case 3:
                return com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.POS_COMM_DISCONNECTED;
            case 4:
                return com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.NO_DEFAULT_CARD;
            case 5:
                return com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.CARD_NOT_EXISTING;
            case 6:
                return com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.OPERATION_NOT_ALLOWED;
            case 7:
                return com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.BIOFP_CONDITION_NOT_SATISFIED;
            case 8:
                return com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.CARD_ACTIVATION_FAILED;
            case 9:
                return com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.CARD_SET_DEFAULT_FAILED;
            case 10:
                return com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.REMOTE_PAYMENT_INPUT_INVALID;
            case 11:
                return com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.REMOTE_PAYMENT_OUTPUT_INVALID;
            case 12:
                return com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.REMOTE_PAYMENT_NOT_SUPPORTED;
            case 13:
                return com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.REMOTE_PAYMENT_WRONG_STATE;
            case 14:
                return com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.PAYMENT_WRONG_STATE;
            case 15:
                return com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.PAYMENT_NOT_ALLOWED_UPGRADE_NEEDED;
            case 16:
                return com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.PAYMENT_NOT_ALLOWED_SDK_INIT_ONGOING;
            case 17:
                return com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.PAYMENT_NOT_ALLOWED_SDK_NOT_INITIALIZED;
            case 18:
                return com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.NO_DEFAULT_CHV_METHOD;
            case 19:
                return com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.CARD_ACTIVATION_LISTENER_NOT_IMPLEMENTED;
            case 20:
                return com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.CARD_ALREADY_ACTIVATED;
            case 21:
                return com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.PAYMENT_NOT_ALLOWED_SECURE_WALLET_ENROLLMENT_REQUIRED;
            case 22:
                return com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.STORAGE_COMPONENT_ERROR;
            case 23:
                return com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.KEY_STORE_INACCESSIBLE;
            case 24:
                return com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.NO_APDU_PROCESSOR_FOUND;
            case 25:
                return com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.ERROR_READING_PAYMENT_CHANNEL;
            case 26:
                return com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.UNSUPPORTED_CARD_TYPE;
            case 27:
                return com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.LOAD_NEXT_CRED_ERROR;
            case 28:
                return com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.ERROR_FUNCTION_NOT_SUPPORTED;
            case 29:
                return com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.DEVICE_SUSPICIOUS;
            case 30:
                return com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.USER_NOT_AUTHENTICATED;
            case 31:
                return com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.INTERNAL_ERROR;
            case 32:
                return com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.NULL_CONTEXT;
            default:
                return com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.UNKNOWN;
        }
    }

    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.values().length];
            try {
                iArr[com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.CARD_SUSPENDED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.CARD_OUT_OF_PAYMENT_KEYS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.POS_COMM_DISCONNECTED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.NO_DEFAULT_CARD.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.CARD_NOT_EXISTING.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.OPERATION_NOT_ALLOWED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.BIOFP_CONDITION_NOT_SATISFIED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.CARD_ACTIVATION_FAILED.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.CARD_SET_DEFAULT_FAILED.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.REMOTE_PAYMENT_INPUT_INVALID.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr[com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.REMOTE_PAYMENT_OUTPUT_INVALID.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr[com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.REMOTE_PAYMENT_NOT_SUPPORTED.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr[com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.REMOTE_PAYMENT_WRONG_STATE.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr[com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.PAYMENT_WRONG_STATE.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr[com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.PAYMENT_NOT_ALLOWED_UPGRADE_NEEDED.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr[com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.PAYMENT_NOT_ALLOWED_SDK_INIT_ONGOING.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                iArr[com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.PAYMENT_NOT_ALLOWED_SDK_NOT_INITIALIZED.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                iArr[com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.NO_DEFAULT_CHV_METHOD.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                iArr[com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.CARD_ACTIVATION_LISTENER_NOT_IMPLEMENTED.ordinal()] = 19;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                iArr[com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.CARD_ALREADY_ACTIVATED.ordinal()] = 20;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                iArr[com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.PAYMENT_NOT_ALLOWED_SECURE_WALLET_ENROLLMENT_REQUIRED.ordinal()] = 21;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            try {
                iArr[com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.STORAGE_COMPONENT_ERROR.ordinal()] = 22;
            } catch (java.lang.NoSuchFieldError unused22) {
            }
            try {
                iArr[com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.KEY_STORE_INACCESSIBLE.ordinal()] = 23;
            } catch (java.lang.NoSuchFieldError unused23) {
            }
            try {
                iArr[com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.NO_APDU_PROCESSOR_FOUND.ordinal()] = 24;
            } catch (java.lang.NoSuchFieldError unused24) {
            }
            try {
                iArr[com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.ERROR_READING_PAYMENT_CHANNEL.ordinal()] = 25;
            } catch (java.lang.NoSuchFieldError unused25) {
            }
            try {
                iArr[com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.UNSUPPORTED_CARD_TYPE.ordinal()] = 26;
            } catch (java.lang.NoSuchFieldError unused26) {
            }
            try {
                iArr[com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.LOAD_NEXT_CRED_ERROR.ordinal()] = 27;
            } catch (java.lang.NoSuchFieldError unused27) {
            }
            try {
                iArr[com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.ERROR_FUNCTION_NOT_SUPPORTED.ordinal()] = 28;
            } catch (java.lang.NoSuchFieldError unused28) {
            }
            try {
                iArr[com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.DEVICE_SUSPICIOUS.ordinal()] = 29;
            } catch (java.lang.NoSuchFieldError unused29) {
            }
            try {
                iArr[com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.USER_NOT_AUTHENTICATED.ordinal()] = 30;
            } catch (java.lang.NoSuchFieldError unused30) {
            }
            try {
                iArr[com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.INTERNAL_ERROR.ordinal()] = 31;
            } catch (java.lang.NoSuchFieldError unused31) {
            }
            try {
                iArr[com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.NULL_CONTEXT.ordinal()] = 32;
            } catch (java.lang.NoSuchFieldError unused32) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
