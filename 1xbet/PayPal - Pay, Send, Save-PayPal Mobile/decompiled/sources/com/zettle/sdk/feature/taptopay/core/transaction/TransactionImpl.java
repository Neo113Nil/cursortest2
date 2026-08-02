package com.zettle.sdk.feature.taptopay.core.transaction;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ7\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0018\u0010\"\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010(R\u0014\u0010%\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010*"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionImpl;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal;", "transactionInternal", "Lcom/zettle/sdk/feature/taptopay/core/Translations;", "translations", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal;Lcom/zettle/sdk/feature/taptopay/core/Translations;)V", "Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$TransactionListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "addListener", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$TransactionListener;)V", "cancelTransaction", "()V", "removeListener", "reset", "Landroid/app/Activity;", "activityContext", "", "amount", "gratuity", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReference;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_REFERENCE, "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/PaymentProperties;", "paymentProperties", "startTransaction", "(Landroid/app/Activity;JJLcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReference;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/PaymentProperties;)V", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/Signature;", "signature", "uploadSignature", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/models/Signature;)V", "getHighSpeedVideoFpsRangesFor", "Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$TransactionListener;", "getHighSpeedVideoFpsRanges", "Lcom/zettle/sdk/commons/state/StateObserver;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal$State;", "getHighSpeedVideoSizes", "Lcom/zettle/sdk/commons/state/StateObserver;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionInternal;", "Camera2StreamConfigurationMap", "Lcom/zettle/sdk/feature/taptopay/core/Translations;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TransactionImpl implements com.zettle.sdk.feature.taptopay.core.transaction.Transaction {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.Translations getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private com.zettle.sdk.feature.taptopay.core.transaction.Transaction.TransactionListener getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.zettle.sdk.commons.state.StateObserver<com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State> getHighResolutionOutputSizeshNQ4ISI;

    public TransactionImpl(com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal transactionInternal, com.zettle.sdk.feature.taptopay.core.Translations translations) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionInternal, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(translations, "");
        this.Camera2StreamConfigurationMap = transactionInternal;
        this.getHighSpeedVideoSizes = translations;
        this.getHighResolutionOutputSizeshNQ4ISI = new com.zettle.sdk.commons.state.StateObserver<com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State>() { // from class: com.zettle.sdk.feature.taptopay.core.transaction.TransactionImpl$special$$inlined$stateObserver$1
            @Override // com.zettle.sdk.commons.state.StateObserver
            public final void onNext(com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State state) {
                com.zettle.sdk.feature.taptopay.core.transaction.Transaction.TransactionListener transactionListener;
                com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State state2 = state;
                transactionListener = com.zettle.sdk.feature.taptopay.core.transaction.TransactionImpl.this.getHighSpeedVideoFpsRanges;
                if (transactionListener != null) {
                    transactionListener.onStateChanged(com.zettle.sdk.feature.taptopay.core.transaction.TransactionImpl.access$toPublic(com.zettle.sdk.feature.taptopay.core.transaction.TransactionImpl.this, state2));
                }
            }
        };
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.Transaction
    public final void addListener(com.zettle.sdk.feature.taptopay.core.transaction.Transaction.TransactionListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        this.getHighSpeedVideoFpsRanges = listener;
        this.Camera2StreamConfigurationMap.getState().addObserver(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.Transaction
    public final void removeListener() {
        this.getHighSpeedVideoFpsRanges = null;
        this.Camera2StreamConfigurationMap.getState().removeObserver(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.Transaction
    public final void startTransaction(android.app.Activity activityContext, long amount, long gratuity, com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference reference, com.zettle.sdk.feature.taptopay.core.transaction.models.PaymentProperties paymentProperties) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reference, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentProperties, "");
        this.Camera2StreamConfigurationMap.startTransaction(new java.lang.ref.WeakReference<>(activityContext), amount, gratuity, reference, paymentProperties);
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.Transaction
    public final void uploadSignature(com.zettle.sdk.feature.taptopay.core.transaction.models.Signature signature) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signature, "");
        this.Camera2StreamConfigurationMap.uploadSignature(signature);
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.Transaction
    public final void cancelTransaction() {
        this.Camera2StreamConfigurationMap.cancel(com.zettle.sdk.feature.taptopay.core.FailureReason.CanceledByUser.INSTANCE);
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.Transaction
    public final void reset() {
        this.Camera2StreamConfigurationMap.reset();
    }

    public static final /* synthetic */ com.zettle.sdk.feature.taptopay.core.transaction.Transaction.State access$toPublic(com.zettle.sdk.feature.taptopay.core.transaction.TransactionImpl transactionImpl, com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State state) {
        com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.GratuityAmountTooHigh gratuityAmountTooHigh;
        if (state instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Initial) {
            return com.zettle.sdk.feature.taptopay.core.transaction.Transaction.State.Initial.INSTANCE;
        }
        if (!(state instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.InitialisingTransaction) && !(state instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.FetchCvmLimits)) {
            if (state instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.PresentCard) {
                return new com.zettle.sdk.feature.taptopay.core.transaction.Transaction.State.PresentCard(((com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.PresentCard) state).getInfo());
            }
            if (state instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.ReadingCard) {
                return new com.zettle.sdk.feature.taptopay.core.transaction.Transaction.State.ReadingCard(((com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.ReadingCard) state).getInfo());
            }
            if (state instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Retry) {
                return new com.zettle.sdk.feature.taptopay.core.transaction.Transaction.State.Retry(((com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Retry) state).getInfo());
            }
            if (state instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.CardReadOk) {
                return new com.zettle.sdk.feature.taptopay.core.transaction.Transaction.State.CardReadOk(((com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.CardReadOk) state).getInfo());
            }
            if (state instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Authorizing) {
                return com.zettle.sdk.feature.taptopay.core.transaction.Transaction.State.Authorizing.INSTANCE;
            }
            if (state instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.PINEntrance) {
                return com.zettle.sdk.feature.taptopay.core.transaction.Transaction.State.PinCodeEntered.INSTANCE;
            }
            if (state instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.RequestSignature) {
                com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.RequestSignature requestSignature = (com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.RequestSignature) state;
                return new com.zettle.sdk.feature.taptopay.core.transaction.Transaction.State.RequestSignature(requestSignature.getInfo(), requestSignature.getCardInfo());
            }
            if (state instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.UploadingSignature) {
                return com.zettle.sdk.feature.taptopay.core.transaction.Transaction.State.UploadingSignature.INSTANCE;
            }
            if (state instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.PermissiveSignature) {
                return com.zettle.sdk.feature.taptopay.core.transaction.Transaction.State.PermissiveSignature.INSTANCE;
            }
            if (state instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Approved) {
                return new com.zettle.sdk.feature.taptopay.core.transaction.Transaction.State.Approved(((com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Approved) state).getTapToPayResult());
            }
            if (!(state instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Failed)) {
                if (state instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Finalized) {
                    return com.zettle.sdk.feature.taptopay.core.transaction.Transaction.State.Completed.INSTANCE;
                }
                if (state instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Reinitialising) {
                    return com.zettle.sdk.feature.taptopay.core.transaction.Transaction.State.ReInitialising.INSTANCE;
                }
                if (state instanceof com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Recover) {
                    return com.zettle.sdk.feature.taptopay.core.transaction.Transaction.State.Recovering.INSTANCE;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.zettle.sdk.feature.taptopay.core.FailureReason reason = ((com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternal.State.Failed) state).getReason();
            if (reason instanceof com.zettle.sdk.feature.taptopay.core.FailureReason.AttestationError) {
                com.zettle.sdk.feature.taptopay.core.FailureReason.AttestationError attestationError = (com.zettle.sdk.feature.taptopay.core.FailureReason.AttestationError) reason;
                com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason reason2 = attestationError.getReason();
                if (reason2 instanceof com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.DeveloperOptionsDetected) {
                    gratuityAmountTooHigh = new com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.DeveloperOptionsDetected(transactionImpl.getHighSpeedVideoSizes, ((com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.DeveloperOptionsDetected) attestationError.getReason()).getRecommendedAction());
                } else if (reason2 instanceof com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.TimeMismatchDetected) {
                    gratuityAmountTooHigh = new com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.TimeMismatchDetected(transactionImpl.getHighSpeedVideoSizes, ((com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.TimeMismatchDetected) attestationError.getReason()).getRecommendedAction());
                } else if (reason2 instanceof com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.NetworkError) {
                    gratuityAmountTooHigh = new com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.NetworkError(transactionImpl.getHighSpeedVideoSizes);
                } else if (reason2 instanceof com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.Abort) {
                    gratuityAmountTooHigh = new com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.CanceledByUser(transactionImpl.getHighSpeedVideoSizes);
                } else if (reason2 instanceof com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.OutdatedSecurityPatch) {
                    gratuityAmountTooHigh = new com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.AttestationFailed(transactionImpl.getHighSpeedVideoSizes, attestationError.getReason().toString());
                } else {
                    gratuityAmountTooHigh = new com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.AttestationFailed(transactionImpl.getHighSpeedVideoSizes, attestationError.getReason().toString());
                }
            } else if (reason instanceof com.zettle.sdk.feature.taptopay.core.FailureReason.AuthRequired) {
                gratuityAmountTooHigh = new com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.AuthRequired(transactionImpl.getHighSpeedVideoSizes);
            } else if (reason instanceof com.zettle.sdk.feature.taptopay.core.FailureReason.EmptyPayload) {
                gratuityAmountTooHigh = new com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.EmptyPayload(transactionImpl.getHighSpeedVideoSizes);
            } else if (reason instanceof com.zettle.sdk.feature.taptopay.core.FailureReason.EmptyResponse) {
                gratuityAmountTooHigh = new com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.EmptyResponse(transactionImpl.getHighSpeedVideoSizes);
            } else if (reason instanceof com.zettle.sdk.feature.taptopay.core.FailureReason.InvalidArguments) {
                gratuityAmountTooHigh = new com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.InvalidArguments(transactionImpl.getHighSpeedVideoSizes);
            } else if (reason instanceof com.zettle.sdk.feature.taptopay.core.FailureReason.SignatureCanceled) {
                gratuityAmountTooHigh = new com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.SignatureCanceled(transactionImpl.getHighSpeedVideoSizes);
            } else if (reason instanceof com.zettle.sdk.feature.taptopay.core.FailureReason.AppCommandNotMapped) {
                gratuityAmountTooHigh = new com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.BackendError(transactionImpl.getHighSpeedVideoSizes, ((com.zettle.sdk.feature.taptopay.core.FailureReason.AppCommandNotMapped) reason).getAppCommand());
            } else if (reason instanceof com.zettle.sdk.feature.taptopay.core.FailureReason.BackendError) {
                gratuityAmountTooHigh = new com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.BackendError(transactionImpl.getHighSpeedVideoSizes, ((com.zettle.sdk.feature.taptopay.core.FailureReason.BackendError) reason).getError());
            } else if (reason instanceof com.zettle.sdk.feature.taptopay.core.FailureReason.RequiredSca) {
                gratuityAmountTooHigh = new com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.ScaChallenge(transactionImpl.getHighSpeedVideoSizes);
            } else if (reason instanceof com.zettle.sdk.feature.taptopay.core.FailureReason.TooManyContactlessTx) {
                gratuityAmountTooHigh = new com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.ScaChallenge(transactionImpl.getHighSpeedVideoSizes);
            } else if (reason instanceof com.zettle.sdk.feature.taptopay.core.FailureReason.CVMorEMVTagsMissing) {
                gratuityAmountTooHigh = new com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.CardReadInvalid(transactionImpl.getHighSpeedVideoSizes);
            } else if (reason instanceof com.zettle.sdk.feature.taptopay.core.FailureReason.CancelledByTimeout) {
                gratuityAmountTooHigh = new com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.CanceledByTimeout(transactionImpl.getHighSpeedVideoSizes);
            } else if (reason instanceof com.zettle.sdk.feature.taptopay.core.FailureReason.CancelledByNetworkTimeout) {
                gratuityAmountTooHigh = new com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.CanceledByNetworkTimeout(transactionImpl.getHighSpeedVideoSizes);
            } else if (reason instanceof com.zettle.sdk.feature.taptopay.core.FailureReason.CanceledByUser) {
                gratuityAmountTooHigh = new com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.CanceledByUser(transactionImpl.getHighSpeedVideoSizes);
            } else if (reason instanceof com.zettle.sdk.feature.taptopay.core.FailureReason.PinEntranceCanceled) {
                gratuityAmountTooHigh = new com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.PinEntranceCanceled(transactionImpl.getHighSpeedVideoSizes);
            } else if (reason instanceof com.zettle.sdk.feature.taptopay.core.FailureReason.InvalidCVM) {
                gratuityAmountTooHigh = new com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.CardReadInvalid(transactionImpl.getHighSpeedVideoSizes);
            } else if (reason instanceof com.zettle.sdk.feature.taptopay.core.FailureReason.InvalidCardPayload) {
                gratuityAmountTooHigh = new com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.CardReadInvalid(transactionImpl.getHighSpeedVideoSizes);
            } else if (reason instanceof com.zettle.sdk.feature.taptopay.core.FailureReason.InvalidKSN) {
                gratuityAmountTooHigh = new com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.CardReadInvalid(transactionImpl.getHighSpeedVideoSizes);
            } else if (reason instanceof com.zettle.sdk.feature.taptopay.core.FailureReason.InvalidMAC) {
                gratuityAmountTooHigh = new com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.CardReadInvalid(transactionImpl.getHighSpeedVideoSizes);
            } else if (reason instanceof com.zettle.sdk.feature.taptopay.core.FailureReason.InvalidPanToken) {
                gratuityAmountTooHigh = new com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.CardReadInvalid(transactionImpl.getHighSpeedVideoSizes);
            } else if (reason instanceof com.zettle.sdk.feature.taptopay.core.FailureReason.MapWithEMVTagsEmptyOrNull) {
                gratuityAmountTooHigh = new com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.CardReadInvalid(transactionImpl.getHighSpeedVideoSizes);
            } else if (reason instanceof com.zettle.sdk.feature.taptopay.core.FailureReason.NetworkError) {
                gratuityAmountTooHigh = new com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.NetworkError(transactionImpl.getHighSpeedVideoSizes);
            } else if (reason instanceof com.zettle.sdk.feature.taptopay.core.FailureReason.NotSupportedCountry) {
                gratuityAmountTooHigh = new com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.CountryNotSupported(transactionImpl.getHighSpeedVideoSizes);
            } else if (reason instanceof com.zettle.sdk.feature.taptopay.core.FailureReason.RequireBankVerification) {
                gratuityAmountTooHigh = new com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.RequireBankVerification(transactionImpl.getHighSpeedVideoSizes);
            } else if (reason instanceof com.zettle.sdk.feature.taptopay.core.SDKTransactionResults.TransactionCardError) {
                gratuityAmountTooHigh = new com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.CardReadInvalid(transactionImpl.getHighSpeedVideoSizes);
            } else if (reason instanceof com.zettle.sdk.feature.taptopay.core.SDKTransactionResults.TransactionDeclined) {
                gratuityAmountTooHigh = new com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.CardReadInvalid(transactionImpl.getHighSpeedVideoSizes);
            } else if (reason instanceof com.zettle.sdk.feature.taptopay.core.SDKTransactionResults.TransactionEndApplicationError) {
                gratuityAmountTooHigh = new com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.CardReadInvalid(transactionImpl.getHighSpeedVideoSizes);
            } else if (reason instanceof com.zettle.sdk.feature.taptopay.core.SDKTransactionResults.TransactionFailed) {
                gratuityAmountTooHigh = new com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.CardReadInvalid(transactionImpl.getHighSpeedVideoSizes);
            } else if (reason instanceof com.zettle.sdk.feature.taptopay.core.SDKTransactionResults.TransactionFailedAllowFallback) {
                gratuityAmountTooHigh = new com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.CardReadInvalid(transactionImpl.getHighSpeedVideoSizes);
            } else if (reason instanceof com.zettle.sdk.feature.taptopay.core.SDKTransactionResults.TransactionNoAppError) {
                gratuityAmountTooHigh = new com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.CardReadInvalid(transactionImpl.getHighSpeedVideoSizes);
            } else if (reason instanceof com.zettle.sdk.feature.taptopay.core.SDKTransactionResults.TransactionRequireCDCVM) {
                gratuityAmountTooHigh = new com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.CardReadInvalid(transactionImpl.getHighSpeedVideoSizes);
            } else if (reason instanceof com.zettle.sdk.feature.taptopay.core.SDKTransactionResults.TransactionSelectNextInterface) {
                gratuityAmountTooHigh = new com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.CardReadInvalid(transactionImpl.getHighSpeedVideoSizes);
            } else if (reason instanceof com.zettle.sdk.feature.taptopay.core.SDKTransactionResults.TransactionTryAgain) {
                gratuityAmountTooHigh = new com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.CardReadInvalid(transactionImpl.getHighSpeedVideoSizes);
            } else if (reason instanceof com.zettle.sdk.feature.taptopay.core.FailureReason.TechnicalError) {
                gratuityAmountTooHigh = new com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.TechnicalError(transactionImpl.getHighSpeedVideoSizes);
            } else if (reason instanceof com.zettle.sdk.feature.taptopay.core.FailureReason.TransactionOfflinePinRequested) {
                gratuityAmountTooHigh = new com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.CardReadInvalid(transactionImpl.getHighSpeedVideoSizes);
            } else if (reason instanceof com.zettle.sdk.feature.taptopay.core.FailureReason.TransactionOnlinePinRequested) {
                gratuityAmountTooHigh = new com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.CardReadInvalid(transactionImpl.getHighSpeedVideoSizes);
            } else if (reason instanceof com.zettle.sdk.feature.taptopay.core.FailureReason.TransactionSignatureRequested) {
                gratuityAmountTooHigh = new com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.CardReadInvalid(transactionImpl.getHighSpeedVideoSizes);
            } else if (reason instanceof com.zettle.sdk.feature.taptopay.core.FailureReason.AboveMaximum) {
                com.zettle.sdk.feature.taptopay.core.FailureReason.AboveMaximum aboveMaximum = (com.zettle.sdk.feature.taptopay.core.FailureReason.AboveMaximum) reason;
                gratuityAmountTooHigh = new com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.AboveMaximum(aboveMaximum.getTitle(), aboveMaximum.getDescription(), aboveMaximum.getCurrency());
            } else if (reason instanceof com.zettle.sdk.feature.taptopay.core.FailureReason.BelowMinimum) {
                com.zettle.sdk.feature.taptopay.core.FailureReason.BelowMinimum belowMinimum = (com.zettle.sdk.feature.taptopay.core.FailureReason.BelowMinimum) reason;
                gratuityAmountTooHigh = new com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.BelowMinimum(belowMinimum.getTitle(), belowMinimum.getDescription(), belowMinimum.getMinAmount(), belowMinimum.getCurrency());
            } else if (reason instanceof com.zettle.sdk.feature.taptopay.core.FailureReason.ParsingError) {
                gratuityAmountTooHigh = new com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.ParsingError(transactionImpl.getHighSpeedVideoSizes);
            } else if (reason instanceof com.zettle.sdk.feature.taptopay.core.FailureReason.UnsuccessfulResponse) {
                gratuityAmountTooHigh = new com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.UnsuccessfulResponse(transactionImpl.getHighSpeedVideoSizes);
            } else if (reason instanceof com.zettle.sdk.feature.taptopay.core.FailureReason.FailedToReinitialize) {
                gratuityAmountTooHigh = new com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.TechnicalError(transactionImpl.getHighSpeedVideoSizes);
            } else if (reason instanceof com.zettle.sdk.feature.taptopay.core.FailureReason.NFCUnexpectedError) {
                gratuityAmountTooHigh = new com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.NFCUnexpectedError(transactionImpl.getHighSpeedVideoSizes);
            } else if (reason instanceof com.zettle.sdk.feature.taptopay.core.FailureReason.PaymentDeclined) {
                gratuityAmountTooHigh = new com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.PaymentDeclined(transactionImpl.getHighSpeedVideoSizes, ((com.zettle.sdk.feature.taptopay.core.FailureReason.PaymentDeclined) reason).getTransactionId());
            } else if (reason instanceof com.zettle.sdk.feature.taptopay.core.FailureReason.CardReadDuplicate) {
                gratuityAmountTooHigh = new com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.CardReadInvalid(transactionImpl.getHighSpeedVideoSizes);
            } else if (reason instanceof com.zettle.sdk.feature.taptopay.core.FailureReason.UnknownCardEvent) {
                gratuityAmountTooHigh = new com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.CardReadInvalid(transactionImpl.getHighSpeedVideoSizes);
            } else if (reason instanceof com.zettle.sdk.feature.taptopay.core.FailureReason.AuthStateNotSupported) {
                gratuityAmountTooHigh = new com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.TechnicalError(transactionImpl.getHighSpeedVideoSizes);
            } else if (reason instanceof com.zettle.sdk.feature.taptopay.core.FailureReason.DeviceNotSupported) {
                gratuityAmountTooHigh = new com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.TechnicalError(transactionImpl.getHighSpeedVideoSizes);
            } else if (reason instanceof com.zettle.sdk.feature.taptopay.core.FailureReason.ReaderNotSupported) {
                gratuityAmountTooHigh = new com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.TechnicalError(transactionImpl.getHighSpeedVideoSizes);
            } else if (reason instanceof com.zettle.sdk.feature.taptopay.core.FailureReason.GratuityAmountTooLow) {
                gratuityAmountTooHigh = new com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.GratuityAmountTooLow(transactionImpl.getHighSpeedVideoSizes);
            } else {
                if (!(reason instanceof com.zettle.sdk.feature.taptopay.core.FailureReason.GratuityAmountTooHigh)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                gratuityAmountTooHigh = new com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.GratuityAmountTooHigh(transactionImpl.getHighSpeedVideoSizes);
            }
            return new com.zettle.sdk.feature.taptopay.core.transaction.Transaction.State.Failed(gratuityAmountTooHigh);
        }
        return com.zettle.sdk.feature.taptopay.core.transaction.Transaction.State.Initializing.INSTANCE;
    }
}
