package my.com.softspace.ssfasstapsdk.internal.transaction;

/* loaded from: classes17.dex */
public class StandardSSTransactionHandler implements my.com.softspace.ssfasstapsdk.transaction.Transaction {
    private int Camera2StreamConfigurationMap;
    private my.com.softspace.ssfasstapsdk.transaction.Transaction.TransactionEvents getHighSpeedVideoSizes;

    public StandardSSTransactionHandler(int i) {
        this.Camera2StreamConfigurationMap = i;
    }

    public my.com.softspace.ssfasstapsdk.transaction.Transaction.TransactionEvents getTransactionCallback() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // my.com.softspace.ssfasstapsdk.transaction.Transaction
    public boolean startTransaction(android.app.Activity activity, my.com.softspace.ssfasstapsdk.transaction.TransactionalParams transactionalParams, my.com.softspace.ssfasstapsdk.transaction.Transaction.TransactionEvents transactionEvents) {
        java.util.Objects.requireNonNull(activity);
        java.util.Objects.requireNonNull(transactionalParams);
        if (android.text.TextUtils.isEmpty(transactionalParams.getAmount()) || !transactionalParams.getAmount().matches("\\d+")) {
            throw new java.lang.IllegalArgumentException("Invalid amount");
        }
        this.getHighSpeedVideoSizes = transactionEvents;
        java.lang.String amountOther = transactionalParams.getAmountOther();
        if (android.text.TextUtils.isEmpty(amountOther) || !amountOther.matches("\\d+")) {
            amountOther = "0";
        }
        long parseLong = java.lang.Long.parseLong(transactionalParams.getAmount());
        long parseLong2 = java.lang.Long.parseLong(amountOther);
        new java.lang.ref.WeakReference(activity);
        byte[] mode = sspog.SSPOGService.getInstance().getMode();
        if ((mode == null || mode.length < 3 || mode[2] != 0) && java.util.Arrays.equals(new byte[12], getKSN(activity, false))) {
            if (transactionEvents != null) {
                transactionEvents.onTransactionResult(7063, null);
            }
            return false;
        }
        my.com.softspace.ssfasstapsdk.transaction.KernelConfigurationParams kernelConfig = transactionalParams.getKernelConfig();
        my.com.softspace.reader.TransactionConfigurations transactionConfigurations = new my.com.softspace.reader.TransactionConfigurations();
        if (kernelConfig != null) {
            if (kernelConfig.getTerminalCVMLimit() != null && kernelConfig.getTerminalCVMLimit().size() > 0) {
                java.util.LinkedHashMap<java.lang.Integer, java.lang.Long> terminalCVMLimit = kernelConfig.getTerminalCVMLimit();
                final android.util.SparseArray<java.lang.Long> sparseArray = new android.util.SparseArray<>();
                terminalCVMLimit.forEach(new java.util.function.BiConsumer() { // from class: my.com.softspace.ssfasstapsdk.internal.transaction.StandardSSTransactionHandler$$ExternalSyntheticLambda0
                    @Override // java.util.function.BiConsumer
                    public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                        my.com.softspace.ssfasstapsdk.internal.transaction.StandardSSTransactionHandler.Camera2StreamConfigurationMap(sparseArray, (java.lang.Integer) obj, (java.lang.Long) obj2);
                    }
                });
                transactionConfigurations.setTerminalCvmRequiredLimit(sparseArray);
            }
            if (kernelConfig.getTerminalCountryCode() != null) {
                transactionConfigurations.setTerminalCountryCode(kernelConfig.getTerminalCountryCode());
            }
            if (kernelConfig.getTransactionCurrencyCode() != null) {
                transactionConfigurations.setTransactionCurrencyCode(kernelConfig.getTransactionCurrencyCode());
            }
            if (kernelConfig.getTransactionCurrencyExponent() != null) {
                transactionConfigurations.setTransactionCurrencyExponent(kernelConfig.getTransactionCurrencyExponent());
            }
            if (kernelConfig.getTransactionType() != null) {
                transactionConfigurations.setTransactionType(kernelConfig.getTransactionType().getValue());
            }
            if (kernelConfig.getMerchantCategoryCode() != null) {
                transactionConfigurations.setMerchantCategoryCode(kernelConfig.getMerchantCategoryCode());
            }
            if (kernelConfig.getApplications() != null && !kernelConfig.getApplications().isEmpty()) {
                transactionConfigurations.setApplicationConfig(kernelConfig.getApplications());
            }
            transactionConfigurations.setDefaultConfig(kernelConfig.isDefaultConfig());
        }
        transactionConfigurations.setAmountOther(amountOther);
        return my.com.softspace.reader.TEEReaderEngine.getInstance().provideTransaction().startTransaction(activity, java.lang.String.valueOf(parseLong + parseLong2), transactionConfigurations, this.Camera2StreamConfigurationMap, !transactionalParams.isBerTlvMode(), transactionalParams.getWaitForUserInputTimeout(), transactionalParams.isDebitOptIn(), new my.com.softspace.ssfasstapsdk.internal.transaction.StandardSSTransactionHandler.AnonymousClass1(transactionEvents));
    }

    /* renamed from: my.com.softspace.ssfasstapsdk.internal.transaction.StandardSSTransactionHandler$1, reason: invalid class name */
    class AnonymousClass1 implements my.com.softspace.reader.TransactionHandler.TransactionCallback {
        final /* synthetic */ my.com.softspace.ssfasstapsdk.transaction.Transaction.TransactionEvents getHighSpeedVideoFpsRanges;

        AnonymousClass1(my.com.softspace.ssfasstapsdk.transaction.Transaction.TransactionEvents transactionEvents) {
            this.getHighSpeedVideoFpsRanges = transactionEvents;
        }

        @Override // my.com.softspace.reader.TransactionHandler.TransactionCallback
        public void onCardEvent(int i) {
            my.com.softspace.ssfasstapsdk.transaction.Transaction.TransactionEvents transactionEvents = this.getHighSpeedVideoFpsRanges;
            if (transactionEvents != null) {
                transactionEvents.onCardEvent(i);
            }
        }

        @Override // my.com.softspace.reader.TransactionHandler.TransactionCallback
        public void onKernelResult(int i, byte[] bArr) {
            my.com.softspace.ssfasstapsdk.transaction.Transaction.TransactionEvents transactionEvents = this.getHighSpeedVideoFpsRanges;
            if (transactionEvents != null) {
                transactionEvents.onTransactionResult(i, bArr);
            }
        }

        @Override // my.com.softspace.reader.TransactionHandler.TransactionCallback
        public void onTransactionUIEvent(int i) {
            my.com.softspace.ssfasstapsdk.transaction.Transaction.TransactionEvents transactionEvents = this.getHighSpeedVideoFpsRanges;
            if (transactionEvents != null) {
                transactionEvents.onTransactionUIEvent(i);
            }
        }

        @Override // my.com.softspace.reader.TransactionHandler.TransactionCallback
        public byte[] onKernelRequestOnlineHost(byte[] bArr, byte[] bArr2) {
            my.com.softspace.ssfasstapsdk.transaction.Transaction.TransactionEvents transactionEvents = this.getHighSpeedVideoFpsRanges;
            if (transactionEvents == null) {
                return null;
            }
            java.util.Map<java.lang.String, byte[]> mapRawOnlineRequest = transactionEvents.mapRawOnlineRequest(bArr2);
            byte[] onTransactionRequestOnlineAuthentication = this.getHighSpeedVideoFpsRanges.onTransactionRequestOnlineAuthentication(bArr, mapRawOnlineRequest);
            mapRawOnlineRequest.forEach(new java.util.function.BiConsumer() { // from class: my.com.softspace.ssfasstapsdk.internal.transaction.StandardSSTransactionHandler$1$$ExternalSyntheticLambda0
                @Override // java.util.function.BiConsumer
                public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                    java.util.Arrays.fill((byte[]) obj2, (byte) 0);
                }
            });
            mapRawOnlineRequest.clear();
            return onTransactionRequestOnlineAuthentication;
        }
    }

    @Override // my.com.softspace.ssfasstapsdk.transaction.Transaction
    public boolean cancelTransaction() {
        return my.com.softspace.reader.TEEReaderEngine.getInstance().provideTransaction().cancelTransaction();
    }

    @Override // my.com.softspace.ssfasstapsdk.transaction.Transaction
    public boolean isTransactionRunning() {
        return my.com.softspace.reader.TEEReaderEngine.getInstance().provideTransaction().isTransactionRunning();
    }

    @Override // my.com.softspace.ssfasstapsdk.transaction.Transaction
    public byte[] enterPin(android.app.Activity activity, my.com.softspace.ssfasstapsdk.transaction.TransactionalPinpadParams transactionalPinpadParams) {
        java.util.Objects.requireNonNull(activity);
        java.util.Objects.requireNonNull(transactionalPinpadParams);
        if (android.text.TextUtils.isEmpty(transactionalPinpadParams.getFormattedAmount()) && android.text.TextUtils.isEmpty(transactionalPinpadParams.getSpannableFormattedAmount())) {
            throw new java.lang.IllegalArgumentException("Invalid amount");
        }
        if (transactionalPinpadParams.getPanToken() != null && transactionalPinpadParams.getPanToken().length <= 0) {
            throw new java.lang.IllegalArgumentException("Invalid pan token");
        }
        my.com.softspace.pinpad.PinpadParam build = my.com.softspace.pinpad.PinpadParam.Builder.create().setSpannableFormattedAmount(transactionalPinpadParams.getSpannableFormattedAmount()).setFormattedAmount(transactionalPinpadParams.getFormattedAmount()).setCurrency(transactionalPinpadParams.getCurrency()).setCurrencyDisplayBack(transactionalPinpadParams.isCurrencyDisplayBack()).setPanToken(transactionalPinpadParams.getPanToken()).setTimeout(transactionalPinpadParams.getTimeout()).setFallbackMode(transactionalPinpadParams.isFallbackMode()).setDrawableBtnOKColor(transactionalPinpadParams.getDrawableBtnOKColor()).setPlaceholderCount(transactionalPinpadParams.getPlaceholderCount()).build();
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(activity);
        if (weakReference.get() != null) {
            return sspog.SSPOGService.getInstance().enterPIN((android.app.Activity) weakReference.get(), build);
        }
        return null;
    }

    static /* synthetic */ void Camera2StreamConfigurationMap(android.util.SparseArray sparseArray, java.lang.Integer num, java.lang.Long l) {
        if ((num.intValue() & 2) == 2) {
            sparseArray.put(6, l);
        }
        if ((num.intValue() & 4) == 4) {
            sparseArray.put(24, l);
        }
        if ((num.intValue() & 1) == 1) {
            sparseArray.put(1, l);
        }
        if ((num.intValue() & 8) == 8) {
            sparseArray.put(32, l);
        }
        if ((num.intValue() & 16) == 16) {
            sparseArray.put(64, l);
        }
        if ((num.intValue() & 32) == 32) {
            sparseArray.put(128, l);
        }
        if ((num.intValue() & 64) == 64) {
            sparseArray.put(256, l);
        }
        if ((num.intValue() & 128) == 128) {
            sparseArray.put(512, l);
        }
        if ((num.intValue() & 256) == 256) {
            sparseArray.put(1024, l);
        }
        if ((num.intValue() & 2048) == 2048) {
            sparseArray.put(8192, l);
        }
        if (num.intValue() == 0) {
            sparseArray.put(0, l);
        }
    }

    @Override // my.com.softspace.ssfasstapsdk.transaction.Transaction
    public byte[] getKSN(android.content.Context context, boolean z) {
        java.lang.Object[] cryptoOperation = sspog.SSPOGService.getInstance().cryptoOperation(context, false, new byte[32], z);
        if (cryptoOperation == null || cryptoOperation.length < 3) {
            return null;
        }
        return (byte[]) cryptoOperation[2];
    }

    @Override // my.com.softspace.ssfasstapsdk.transaction.Transaction
    public byte[] cryptoOperation(android.content.Context context, boolean z, byte[] bArr) {
        java.lang.Object[] cryptoOperation = sspog.SSPOGService.getInstance().cryptoOperation(context, z, bArr, false);
        if (cryptoOperation == null || cryptoOperation.length < 3) {
            return null;
        }
        return (byte[]) cryptoOperation[1];
    }

    @Override // my.com.softspace.ssfasstapsdk.transaction.Transaction
    public byte[] generateRandom(android.content.Context context, int i) {
        byte[] bArr = new byte[i];
        my.com.softspace.reader.TEEReaderEngine.getInstance().sharedSecureRandom().nextBytes(bArr);
        return bArr;
    }
}
