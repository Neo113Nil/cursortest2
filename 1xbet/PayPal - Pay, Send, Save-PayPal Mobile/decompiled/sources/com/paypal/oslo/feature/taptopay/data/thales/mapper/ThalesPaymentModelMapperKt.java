package com.paypal.oslo.feature.taptopay.data.thales.mapper;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0002\u0010\u0006\u001a\u0013\u0010\u0002\u001a\u00020\b*\u00020\u0007H\u0000¢\u0006\u0004\b\u0002\u0010\t\u001a\u0013\u0010\u0002\u001a\u00020\u000b*\u00020\nH\u0000¢\u0006\u0004\b\u0002\u0010\f\u001a\u0013\u0010\u0002\u001a\u00020\u000e*\u00020\rH\u0000¢\u0006\u0004\b\u0002\u0010\u000f\u001a\u0013\u0010\u0002\u001a\u00020\u0011*\u00020\u0010H\u0000¢\u0006\u0004\b\u0002\u0010\u0012\u001a\u0013\u0010\u0002\u001a\u00020\u0014*\u00020\u0013H\u0000¢\u0006\u0004\b\u0002\u0010\u0015\u001a\u0013\u0010\u0002\u001a\u00020\u0017*\u00020\u0016H\u0000¢\u0006\u0004\b\u0002\u0010\u0018\u001a\u0013\u0010\u0002\u001a\u00020\u001a*\u00020\u0019H\u0000¢\u0006\u0004\b\u0002\u0010\u001b"}, d2 = {"Lcom/paypal/android/taptopay/domain/model/payment/PaymentState;", "Lcom/paypal/oslo/feature/taptopay/domain/model/payment/PaymentState;", "toOslo", "(Lcom/paypal/android/taptopay/domain/model/payment/PaymentState;)Lcom/paypal/oslo/feature/taptopay/domain/model/payment/PaymentState;", "Lcom/paypal/android/taptopay/domain/model/payment/AuthenticationMethod;", "Lcom/paypal/oslo/feature/taptopay/domain/model/payment/AuthenticationMethod;", "(Lcom/paypal/android/taptopay/domain/model/payment/AuthenticationMethod;)Lcom/paypal/oslo/feature/taptopay/domain/model/payment/AuthenticationMethod;", "Lcom/paypal/android/taptopay/domain/model/payment/TransactionContext;", "Lcom/paypal/oslo/feature/taptopay/domain/model/payment/TransactionContext;", "(Lcom/paypal/android/taptopay/domain/model/payment/TransactionContext;)Lcom/paypal/oslo/feature/taptopay/domain/model/payment/TransactionContext;", "Lcom/paypal/android/taptopay/domain/model/payment/DigitizedCardStatus;", "Lcom/paypal/oslo/feature/taptopay/domain/model/payment/DigitizedCardStatus;", "(Lcom/paypal/android/taptopay/domain/model/payment/DigitizedCardStatus;)Lcom/paypal/oslo/feature/taptopay/domain/model/payment/DigitizedCardStatus;", "Lcom/paypal/android/taptopay/domain/model/payment/PaymentErrorCode;", "Lcom/paypal/oslo/feature/taptopay/domain/model/payment/PaymentErrorCode;", "(Lcom/paypal/android/taptopay/domain/model/payment/PaymentErrorCode;)Lcom/paypal/oslo/feature/taptopay/domain/model/payment/PaymentErrorCode;", "Lcom/paypal/android/taptopay/domain/model/payment/Transaction;", "Lcom/paypal/oslo/feature/taptopay/domain/model/payment/Transaction;", "(Lcom/paypal/android/taptopay/domain/model/payment/Transaction;)Lcom/paypal/oslo/feature/taptopay/domain/model/payment/Transaction;", "Lcom/paypal/android/taptopay/domain/model/payment/TransactionStatus;", "Lcom/paypal/oslo/feature/taptopay/domain/model/payment/TransactionStatus;", "(Lcom/paypal/android/taptopay/domain/model/payment/TransactionStatus;)Lcom/paypal/oslo/feature/taptopay/domain/model/payment/TransactionStatus;", "Lcom/paypal/android/taptopay/domain/model/payment/TransactionType;", "Lcom/paypal/oslo/feature/taptopay/domain/model/payment/TransactionType;", "(Lcom/paypal/android/taptopay/domain/model/payment/TransactionType;)Lcom/paypal/oslo/feature/taptopay/domain/model/payment/TransactionType;", "Lcom/paypal/android/taptopay/domain/model/payment/GetTransactionHistoryError;", "Lcom/paypal/oslo/feature/taptopay/domain/model/payment/GetTransactionHistoryError;", "(Lcom/paypal/android/taptopay/domain/model/payment/GetTransactionHistoryError;)Lcom/paypal/oslo/feature/taptopay/domain/model/payment/GetTransactionHistoryError;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ThalesPaymentModelMapperKt {
    public static final com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState toOslo(com.paypal.android.taptopay.domain.model.payment.PaymentState paymentState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentState, "");
        if (paymentState instanceof com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.Idle) {
            return com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState.Success.Idle.INSTANCE;
        }
        if (paymentState instanceof com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.TransactionStarted) {
            return com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState.Success.TransactionStarted.INSTANCE;
        }
        if (paymentState instanceof com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.FirstTapCompleted) {
            return com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState.Success.FirstTapCompleted.INSTANCE;
        }
        if (paymentState instanceof com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.AuthenticationRequired) {
            com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.AuthenticationRequired authenticationRequired = (com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.AuthenticationRequired) paymentState;
            return new com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState.Success.AuthenticationRequired(toOslo(authenticationRequired.getAuthenticationMethod()), authenticationRequired.getResetTimeout(), authenticationRequired.getAuthenticationLauncher(), authenticationRequired.getAuthFailedSetter(), authenticationRequired.getAuthErrorSetter(), authenticationRequired.getAuthSuccessSetter(), authenticationRequired.getAuthenticated());
        }
        if (paymentState instanceof com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.ReadyForSecondTap) {
            return com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState.Success.ReadyForSecondTap.INSTANCE;
        }
        if (paymentState instanceof com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.TransactionCompleted) {
            return new com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState.Success.TransactionCompleted(toOslo(((com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.TransactionCompleted) paymentState).getTransactionContext()));
        }
        if (paymentState instanceof com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.TransactionInterrupted) {
            com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.TransactionInterrupted transactionInterrupted = (com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.TransactionInterrupted) paymentState;
            return new com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState.Failure.TransactionInterrupted(transactionInterrupted.getTransactionInterruptedCode(), transactionInterrupted.getTransactionInterruptedMessage(), transactionInterrupted.getRetryCount());
        }
        if (paymentState instanceof com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.TransactionError) {
            return new com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState.Failure.TransactionError(toOslo(((com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.TransactionError) paymentState).getPaymentErrorCode()));
        }
        if (paymentState instanceof com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.AuthenticationError) {
            return com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState.Failure.AuthenticationError.INSTANCE;
        }
        if (!(paymentState instanceof com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.DefaultError)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.DefaultError defaultError = (com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.DefaultError) paymentState;
        return new com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState.Failure.DefaultError(defaultError.getDebugMessage(), defaultError.getThrowable());
    }

    public static final com.paypal.oslo.feature.taptopay.domain.model.payment.AuthenticationMethod toOslo(com.paypal.android.taptopay.domain.model.payment.AuthenticationMethod authenticationMethod) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationMethod, "");
        int i = com.paypal.oslo.feature.taptopay.data.thales.mapper.ThalesPaymentModelMapperKt.WhenMappings.$EnumSwitchMapping$0[authenticationMethod.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.taptopay.domain.model.payment.AuthenticationMethod.BIOMETRICS;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.taptopay.domain.model.payment.AuthenticationMethod.KEYGUARD;
        }
        if (i == 3) {
            return com.paypal.oslo.feature.taptopay.domain.model.payment.AuthenticationMethod.PIN;
        }
        if (i != 4) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.taptopay.domain.model.payment.AuthenticationMethod.NONE;
    }

    public static final com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionContext toOslo(com.paypal.android.taptopay.domain.model.payment.TransactionContext transactionContext) {
        com.paypal.oslo.feature.taptopay.domain.model.card.CardScheme cardScheme;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionContext, "");
        java.lang.String aid = transactionContext.getAid();
        double amount = transactionContext.getAmount();
        java.lang.String currencyCode = transactionContext.getCurrencyCode();
        com.paypal.oslo.feature.taptopay.domain.model.payment.DigitizedCardStatus oslo = toOslo(transactionContext.getDigitizedCardStatus());
        double rawAmount = transactionContext.getRawAmount();
        int i = com.paypal.oslo.feature.taptopay.data.thales.mapper.ThalesPaymentModelMapperKt.WhenMappings.$EnumSwitchMapping$2[transactionContext.getCardScheme().ordinal()];
        if (i == 1) {
            cardScheme = com.paypal.oslo.feature.taptopay.domain.model.card.CardScheme.MASTERCARD;
        } else if (i == 2) {
            cardScheme = com.paypal.oslo.feature.taptopay.domain.model.card.CardScheme.PURE;
        } else if (i == 3) {
            cardScheme = com.paypal.oslo.feature.taptopay.domain.model.card.CardScheme.VISA;
        } else {
            if (i != 4) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            cardScheme = com.paypal.oslo.feature.taptopay.domain.model.card.CardScheme.UNKNOWN;
        }
        return new com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionContext(aid, amount, currencyCode, oslo, rawAmount, cardScheme, transactionContext.getTransactionDate(), toOslo(transactionContext.getTransactionType()));
    }

    public static final com.paypal.oslo.feature.taptopay.domain.model.payment.DigitizedCardStatus toOslo(com.paypal.android.taptopay.domain.model.payment.DigitizedCardStatus digitizedCardStatus) {
        com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status status;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(digitizedCardStatus, "");
        int i = com.paypal.oslo.feature.taptopay.data.thales.mapper.ThalesPaymentModelMapperKt.WhenMappings.$EnumSwitchMapping$1[digitizedCardStatus.getStatus().ordinal()];
        if (i == 1) {
            status = com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status.PendingActivation;
        } else if (i == 2) {
            status = com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status.Active;
        } else if (i == 3) {
            status = com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status.Suspended;
        } else if (i == 4) {
            status = com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status.Expired;
        } else {
            if (i != 5) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            status = com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status.Unknown;
        }
        return new com.paypal.oslo.feature.taptopay.domain.model.payment.DigitizedCardStatus(digitizedCardStatus.getExpiryDate(), digitizedCardStatus.getPaymentsLeft(), status, digitizedCardStatus.getNeedsReplenishment());
    }

    public static final com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode toOslo(com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode paymentErrorCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentErrorCode, "");
        switch (com.paypal.oslo.feature.taptopay.data.thales.mapper.ThalesPaymentModelMapperKt.WhenMappings.$EnumSwitchMapping$3[paymentErrorCode.ordinal()]) {
            case 1:
                return com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode.CARD_SUSPENDED;
            case 2:
                return com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode.CARD_OUT_OF_PAYMENT_KEYS;
            case 3:
                return com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode.CARD_NOT_EXISTING;
            case 4:
                return com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode.CARD_ACTIVATION_FAILED;
            case 5:
                return com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode.CARD_SET_DEFAULT_FAILED;
            case 6:
                return com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode.CARD_ACTIVATION_LISTENER_NOT_IMPLEMENTED;
            case 7:
                return com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode.CARD_ALREADY_ACTIVATED;
            case 8:
                return com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode.UNSUPPORTED_CARD_TYPE;
            case 9:
                return com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode.NO_DEFAULT_CARD;
            case 10:
                return com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode.POS_COMM_DISCONNECTED;
            case 11:
                return com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode.OPERATION_NOT_ALLOWED;
            case 12:
                return com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode.PAYMENT_WRONG_STATE;
            case 13:
            case 14:
            case 15:
            case 16:
                switch (com.paypal.oslo.feature.taptopay.data.thales.mapper.ThalesPaymentModelMapperKt.WhenMappings.$EnumSwitchMapping$3[paymentErrorCode.ordinal()]) {
                    case 13:
                        return com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode.PAYMENT_NOT_ALLOWED_UPGRADE_NEEDED;
                    case 14:
                        return com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode.PAYMENT_NOT_ALLOWED_SDK_INIT_ONGOING;
                    case 15:
                        return com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode.PAYMENT_NOT_ALLOWED_SDK_NOT_INITIALIZED;
                    case 16:
                        return com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode.PAYMENT_NOT_ALLOWED_SECURE_WALLET_ENROLLMENT_REQUIRED;
                    default:
                        return com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode.UNKNOWN;
                }
            case 17:
            case 18:
            case 19:
            case 20:
                switch (com.paypal.oslo.feature.taptopay.data.thales.mapper.ThalesPaymentModelMapperKt.WhenMappings.$EnumSwitchMapping$3[paymentErrorCode.ordinal()]) {
                    case 17:
                        return com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode.REMOTE_PAYMENT_INPUT_INVALID;
                    case 18:
                        return com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode.REMOTE_PAYMENT_OUTPUT_INVALID;
                    case 19:
                        return com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode.REMOTE_PAYMENT_NOT_SUPPORTED;
                    case 20:
                        return com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode.REMOTE_PAYMENT_WRONG_STATE;
                    default:
                        return com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode.UNKNOWN;
                }
            case 21:
                return com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode.BIOFP_CONDITION_NOT_SATISFIED;
            case 22:
                return com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode.NO_DEFAULT_CHV_METHOD;
            case 23:
                return com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode.USER_NOT_AUTHENTICATED;
            case 24:
                return com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode.DEVICE_SUSPICIOUS;
            case 25:
                return com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode.STORAGE_COMPONENT_ERROR;
            case 26:
                return com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode.KEY_STORE_INACCESSIBLE;
            case 27:
                return com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode.NO_APDU_PROCESSOR_FOUND;
            case 28:
                return com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode.ERROR_READING_PAYMENT_CHANNEL;
            case 29:
                return com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode.LOAD_NEXT_CRED_ERROR;
            case 30:
                return com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode.ERROR_FUNCTION_NOT_SUPPORTED;
            case 31:
                return com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode.INTERNAL_ERROR;
            case 32:
                return com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode.NULL_CONTEXT;
            case 33:
                return com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode.UNKNOWN;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public static final com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction toOslo(com.paypal.android.taptopay.domain.model.payment.Transaction transaction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transaction, "");
        return new com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction(transaction.getId(), transaction.getCardId(), toOslo(transaction.getStatus()), toOslo(transaction.getType()), transaction.getAmount(), transaction.getCurrencyCode(), transaction.getDisplayAmount(), transaction.getTransactionDate(), transaction.getMerchantName(), transaction.getMerchantPostalCode(), transaction.getMerchantCategoryCode());
    }

    public static final com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionStatus toOslo(com.paypal.android.taptopay.domain.model.payment.TransactionStatus transactionStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionStatus, "");
        int i = com.paypal.oslo.feature.taptopay.data.thales.mapper.ThalesPaymentModelMapperKt.WhenMappings.$EnumSwitchMapping$4[transactionStatus.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionStatus.APPROVED;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionStatus.CLEARED;
        }
        if (i == 3) {
            return com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionStatus.DECLINED;
        }
        if (i != 4) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionStatus.REFUNDED;
    }

    public static final com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType toOslo(com.paypal.android.taptopay.domain.model.payment.TransactionType transactionType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionType, "");
        int i = com.paypal.oslo.feature.taptopay.data.thales.mapper.ThalesPaymentModelMapperKt.WhenMappings.$EnumSwitchMapping$5[transactionType.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType.PURCHASE;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType.REFUND;
        }
        if (i == 3) {
            return com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType.WITHDRAWAL;
        }
        if (i == 4) {
            return com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType.CASHBACK;
        }
        if (i != 5) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType.UNKNOWN;
    }

    public static final com.paypal.oslo.feature.taptopay.domain.model.payment.GetTransactionHistoryError toOslo(com.paypal.android.taptopay.domain.model.payment.GetTransactionHistoryError getTransactionHistoryError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getTransactionHistoryError, "");
        if (getTransactionHistoryError instanceof com.paypal.android.taptopay.domain.model.payment.GetTransactionHistoryError.CardNotFound) {
            return com.paypal.oslo.feature.taptopay.domain.model.payment.GetTransactionHistoryError.CardNotFound.INSTANCE;
        }
        if (getTransactionHistoryError instanceof com.paypal.android.taptopay.domain.model.payment.GetTransactionHistoryError.DeviceOffline) {
            return com.paypal.oslo.feature.taptopay.domain.model.payment.GetTransactionHistoryError.DeviceOffline.INSTANCE;
        }
        if (!(getTransactionHistoryError instanceof com.paypal.android.taptopay.domain.model.payment.GetTransactionHistoryError.DefaultError)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.android.taptopay.domain.model.payment.GetTransactionHistoryError.DefaultError defaultError = (com.paypal.android.taptopay.domain.model.payment.GetTransactionHistoryError.DefaultError) getTransactionHistoryError;
        return new com.paypal.oslo.feature.taptopay.domain.model.payment.GetTransactionHistoryError.DefaultError(defaultError.getDebugMessage(), defaultError.getThrowable());
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;

        static {
            int[] iArr = new int[com.paypal.android.taptopay.domain.model.payment.AuthenticationMethod.values().length];
            try {
                iArr[com.paypal.android.taptopay.domain.model.payment.AuthenticationMethod.BIOMETRICS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.android.taptopay.domain.model.payment.AuthenticationMethod.KEYGUARD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.android.taptopay.domain.model.payment.AuthenticationMethod.PIN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.android.taptopay.domain.model.payment.AuthenticationMethod.NONE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.android.taptopay.domain.model.card.DigitizedCard.Status.values().length];
            try {
                iArr2[com.paypal.android.taptopay.domain.model.card.DigitizedCard.Status.PendingActivation.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.paypal.android.taptopay.domain.model.card.DigitizedCard.Status.Active.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.paypal.android.taptopay.domain.model.card.DigitizedCard.Status.Suspended.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[com.paypal.android.taptopay.domain.model.card.DigitizedCard.Status.Expired.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[com.paypal.android.taptopay.domain.model.card.DigitizedCard.Status.Unknown.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[com.paypal.android.taptopay.domain.model.CardScheme.values().length];
            try {
                iArr3[com.paypal.android.taptopay.domain.model.CardScheme.MASTERCARD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr3[com.paypal.android.taptopay.domain.model.CardScheme.PURE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr3[com.paypal.android.taptopay.domain.model.CardScheme.VISA.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr3[com.paypal.android.taptopay.domain.model.CardScheme.UNKNOWN.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.values().length];
            try {
                iArr4[com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.CARD_SUSPENDED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr4[com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.CARD_OUT_OF_PAYMENT_KEYS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr4[com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.CARD_NOT_EXISTING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                iArr4[com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.CARD_ACTIVATION_FAILED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                iArr4[com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.CARD_SET_DEFAULT_FAILED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                iArr4[com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.CARD_ACTIVATION_LISTENER_NOT_IMPLEMENTED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                iArr4[com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.CARD_ALREADY_ACTIVATED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                iArr4[com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.UNSUPPORTED_CARD_TYPE.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            try {
                iArr4[com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.NO_DEFAULT_CARD.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused22) {
            }
            try {
                iArr4[com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.POS_COMM_DISCONNECTED.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused23) {
            }
            try {
                iArr4[com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.OPERATION_NOT_ALLOWED.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused24) {
            }
            try {
                iArr4[com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.PAYMENT_WRONG_STATE.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused25) {
            }
            try {
                iArr4[com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.PAYMENT_NOT_ALLOWED_UPGRADE_NEEDED.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused26) {
            }
            try {
                iArr4[com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.PAYMENT_NOT_ALLOWED_SDK_INIT_ONGOING.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused27) {
            }
            try {
                iArr4[com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.PAYMENT_NOT_ALLOWED_SDK_NOT_INITIALIZED.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused28) {
            }
            try {
                iArr4[com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.PAYMENT_NOT_ALLOWED_SECURE_WALLET_ENROLLMENT_REQUIRED.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused29) {
            }
            try {
                iArr4[com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.REMOTE_PAYMENT_INPUT_INVALID.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused30) {
            }
            try {
                iArr4[com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.REMOTE_PAYMENT_OUTPUT_INVALID.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused31) {
            }
            try {
                iArr4[com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.REMOTE_PAYMENT_NOT_SUPPORTED.ordinal()] = 19;
            } catch (java.lang.NoSuchFieldError unused32) {
            }
            try {
                iArr4[com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.REMOTE_PAYMENT_WRONG_STATE.ordinal()] = 20;
            } catch (java.lang.NoSuchFieldError unused33) {
            }
            try {
                iArr4[com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.BIOFP_CONDITION_NOT_SATISFIED.ordinal()] = 21;
            } catch (java.lang.NoSuchFieldError unused34) {
            }
            try {
                iArr4[com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.NO_DEFAULT_CHV_METHOD.ordinal()] = 22;
            } catch (java.lang.NoSuchFieldError unused35) {
            }
            try {
                iArr4[com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.USER_NOT_AUTHENTICATED.ordinal()] = 23;
            } catch (java.lang.NoSuchFieldError unused36) {
            }
            try {
                iArr4[com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.DEVICE_SUSPICIOUS.ordinal()] = 24;
            } catch (java.lang.NoSuchFieldError unused37) {
            }
            try {
                iArr4[com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.STORAGE_COMPONENT_ERROR.ordinal()] = 25;
            } catch (java.lang.NoSuchFieldError unused38) {
            }
            try {
                iArr4[com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.KEY_STORE_INACCESSIBLE.ordinal()] = 26;
            } catch (java.lang.NoSuchFieldError unused39) {
            }
            try {
                iArr4[com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.NO_APDU_PROCESSOR_FOUND.ordinal()] = 27;
            } catch (java.lang.NoSuchFieldError unused40) {
            }
            try {
                iArr4[com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.ERROR_READING_PAYMENT_CHANNEL.ordinal()] = 28;
            } catch (java.lang.NoSuchFieldError unused41) {
            }
            try {
                iArr4[com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.LOAD_NEXT_CRED_ERROR.ordinal()] = 29;
            } catch (java.lang.NoSuchFieldError unused42) {
            }
            try {
                iArr4[com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.ERROR_FUNCTION_NOT_SUPPORTED.ordinal()] = 30;
            } catch (java.lang.NoSuchFieldError unused43) {
            }
            try {
                iArr4[com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.INTERNAL_ERROR.ordinal()] = 31;
            } catch (java.lang.NoSuchFieldError unused44) {
            }
            try {
                iArr4[com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.NULL_CONTEXT.ordinal()] = 32;
            } catch (java.lang.NoSuchFieldError unused45) {
            }
            try {
                iArr4[com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.UNKNOWN.ordinal()] = 33;
            } catch (java.lang.NoSuchFieldError unused46) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[com.paypal.android.taptopay.domain.model.payment.TransactionStatus.values().length];
            try {
                iArr5[com.paypal.android.taptopay.domain.model.payment.TransactionStatus.APPROVED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused47) {
            }
            try {
                iArr5[com.paypal.android.taptopay.domain.model.payment.TransactionStatus.CLEARED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused48) {
            }
            try {
                iArr5[com.paypal.android.taptopay.domain.model.payment.TransactionStatus.DECLINED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused49) {
            }
            try {
                iArr5[com.paypal.android.taptopay.domain.model.payment.TransactionStatus.REFUNDED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused50) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[com.paypal.android.taptopay.domain.model.payment.TransactionType.values().length];
            try {
                iArr6[com.paypal.android.taptopay.domain.model.payment.TransactionType.PURCHASE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused51) {
            }
            try {
                iArr6[com.paypal.android.taptopay.domain.model.payment.TransactionType.REFUND.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused52) {
            }
            try {
                iArr6[com.paypal.android.taptopay.domain.model.payment.TransactionType.WITHDRAWAL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused53) {
            }
            try {
                iArr6[com.paypal.android.taptopay.domain.model.payment.TransactionType.CASHBACK.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused54) {
            }
            try {
                iArr6[com.paypal.android.taptopay.domain.model.payment.TransactionType.UNKNOWN.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused55) {
            }
            $EnumSwitchMapping$5 = iArr6;
        }
    }
}
