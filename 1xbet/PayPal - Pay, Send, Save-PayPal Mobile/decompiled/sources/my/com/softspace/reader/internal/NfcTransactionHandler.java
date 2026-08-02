package my.com.softspace.reader.internal;

/* loaded from: classes17.dex */
public class NfcTransactionHandler implements my.com.softspace.reader.TransactionHandler {
    private static final java.lang.String getHighSpeedVideoFpsRanges = "NfcTransactionHandler";
    private my.com.softspace.reader.TEEReaderEngine.EncryptionModel getHighResolutionOutputSizeshNQ4ISI;
    java.util.concurrent.CompletableFuture<java.lang.Boolean> getHighSpeedVideoFpsRangesFor;
    private my.com.softspace.reader.TransactionHandler.TransactionCallback getHighSpeedVideoSizes;
    private my.com.softspace.reader.internal.NfcTransactionHandler.OnCardDetect getInputSizeshNQ4ISI;
    private my.com.softspace.reader.TEEReaderEngine.NFCProvider getOutputFormats;
    private java.lang.ref.WeakReference<android.app.Activity> getOutputMinFrameDuration = null;
    private java.util.concurrent.atomic.AtomicReference<my.com.softspace.reader.internal.kernel.Kernel> getHighSpeedVideoSizesFor = new java.util.concurrent.atomic.AtomicReference<>();
    private java.util.concurrent.atomic.AtomicBoolean Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicBoolean(false);

    @Override // my.com.softspace.reader.TransactionHandler
    public boolean startTransaction(android.app.Activity activity, java.lang.String str, my.com.softspace.reader.TransactionConfigurations transactionConfigurations, int i, boolean z, final int i2, boolean z2, final my.com.softspace.reader.TransactionHandler.TransactionCallback transactionCallback) {
        java.lang.String replace;
        if (activity == null) {
            throw new java.lang.IllegalArgumentException("Activity must not be null");
        }
        if (android.text.TextUtils.isEmpty(str) || !str.matches("\\d+")) {
            throw new java.lang.IllegalArgumentException("Amount passed in is invalid");
        }
        if (transactionCallback == null) {
            throw new java.lang.IllegalArgumentException("Callback must not be null");
        }
        if (transactionConfigurations == null) {
            throw new java.lang.IllegalArgumentException("Configs must not be null");
        }
        this.getOutputMinFrameDuration = new java.lang.ref.WeakReference<>(activity);
        my.com.softspace.reader.internal.kernel.ConfigurationBaseKernel create = my.com.softspace.reader.internal.kernel.ConfigurationBaseKernel.create(my.com.softspace.reader.internal.kernel.ConfigurationBaseKernel.Type.ProductionApp);
        my.com.softspace.reader.internal.kernelconfig.KernelConfig defaultConfiguration = my.com.softspace.reader.internal.kernelconfig.KernelConfigFactory.getInstance().getDefaultConfiguration(activity, i, transactionConfigurations);
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        int i3 = calendar.get(5);
        int i4 = calendar.get(2);
        int i5 = calendar.get(1);
        int i6 = calendar.get(11);
        int i7 = calendar.get(12);
        int i8 = calendar.get(13);
        byte[] bArr = new byte[4];
        my.com.softspace.reader.TEEReaderEngine.getInstance().sharedSecureRandom().nextBytes(bArr);
        defaultConfiguration.getTransaction().put(my.com.softspace.reader.internal.kernelconfig.BerTlv.create(new my.com.softspace.reader.internal.kernelconfig.Tag(my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_9F02_AMOUNT_AUTHORISED_NUM), my.com.softspace.reader.internal.kernelconfig.HexUtil.hexStringToByteArray(java.lang.String.format(java.util.Locale.US, "%012.0f", java.lang.Double.valueOf(str)))));
        defaultConfiguration.getTransaction().put(my.com.softspace.reader.internal.kernelconfig.BerTlv.create(new my.com.softspace.reader.internal.kernelconfig.Tag(my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_9F03_AMOUNT_OTHER_NUM), my.com.softspace.reader.internal.kernelconfig.HexUtil.hexStringToByteArray(java.lang.String.format(java.util.Locale.US, "%012.0f", java.lang.Double.valueOf(transactionConfigurations.getAmountOther())))));
        defaultConfiguration.getTransaction().put(my.com.softspace.reader.internal.kernelconfig.BerTlv.create(new my.com.softspace.reader.internal.kernelconfig.Tag(154), my.com.softspace.reader.internal.kernelconfig.HexUtil.hexStringToByteArray(java.lang.String.format(java.util.Locale.US, "%02d%02d%02d", java.lang.Integer.valueOf(i5 % 100), java.lang.Integer.valueOf(i4 + 1), java.lang.Integer.valueOf(i3)))));
        defaultConfiguration.getTransaction().put(my.com.softspace.reader.internal.kernelconfig.BerTlv.create(new my.com.softspace.reader.internal.kernelconfig.Tag(my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_9F21_TRANSACTION_TIME), my.com.softspace.reader.internal.kernelconfig.HexUtil.hexStringToByteArray(java.lang.String.format(java.util.Locale.US, "%02d%02d%02d", java.lang.Integer.valueOf(i6), java.lang.Integer.valueOf(i7), java.lang.Integer.valueOf(i8)))));
        defaultConfiguration.getTransaction().put(my.com.softspace.reader.internal.kernelconfig.BerTlv.create(new my.com.softspace.reader.internal.kernelconfig.Tag(my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_9F37_UNPREDICTABLE_NUMBER), bArr));
        if (!defaultConfiguration.getTerminal().getValueAsHexString(my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_9F1E_SERIAL_NUMBER).isEmpty()) {
            java.lang.String string = android.provider.Settings.Secure.getString(activity.getContentResolver(), a.b.l);
            my.com.softspace.reader.internal.kernelconfig.BerTlvTemplate terminal = defaultConfiguration.getTerminal();
            my.com.softspace.reader.internal.kernelconfig.Tag tag = new my.com.softspace.reader.internal.kernelconfig.Tag(my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_9F1E_SERIAL_NUMBER);
            if (string.length() > 8) {
                replace = string.substring(string.length() - 8);
            } else {
                replace = java.lang.String.format("%8s", string).replace(' ', com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
            }
            terminal.put(my.com.softspace.reader.internal.kernelconfig.BerTlv.create(tag, replace.getBytes()));
        }
        if (transactionConfigurations != null) {
            if (transactionConfigurations.getTerminalCountryCode() != null) {
                if (!defaultConfiguration.getTransaction().getValueAsHexString(my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_9F1A_TERMINAL_COUNTRY_CODE).isEmpty()) {
                    defaultConfiguration.getTransaction().put(my.com.softspace.reader.internal.kernelconfig.BerTlv.create(new my.com.softspace.reader.internal.kernelconfig.Tag(my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_9F1A_TERMINAL_COUNTRY_CODE), my.com.softspace.reader.internal.kernelconfig.HexUtil.hexStringToByteArray(transactionConfigurations.getTerminalCountryCode())));
                }
                for (my.com.softspace.reader.internal.kernelconfig.BerTlvTemplate berTlvTemplate : defaultConfiguration.getApplications()) {
                    if (!berTlvTemplate.getValueAsHexString(my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_9F1A_TERMINAL_COUNTRY_CODE).isEmpty()) {
                        berTlvTemplate.put(my.com.softspace.reader.internal.kernelconfig.BerTlv.create(new my.com.softspace.reader.internal.kernelconfig.Tag(my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_9F1A_TERMINAL_COUNTRY_CODE), my.com.softspace.reader.internal.kernelconfig.HexUtil.hexStringToByteArray(transactionConfigurations.getTerminalCountryCode())));
                    }
                }
            }
            if (transactionConfigurations.getTransactionCurrencyCode() != null && !defaultConfiguration.getTransaction().getValueAsHexString(my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_5F2A_TRANSACTION_CURR_CODE).isEmpty()) {
                defaultConfiguration.getTransaction().put(my.com.softspace.reader.internal.kernelconfig.BerTlv.create(new my.com.softspace.reader.internal.kernelconfig.Tag(my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_5F2A_TRANSACTION_CURR_CODE), my.com.softspace.reader.internal.kernelconfig.HexUtil.hexStringToByteArray(transactionConfigurations.getTransactionCurrencyCode())));
            }
            if (transactionConfigurations.getTransactionCurrencyExponent() != null && !defaultConfiguration.getTransaction().getValueAsHexString(my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_5F36_TRANSACTION_CURR_EXP).isEmpty() && transactionConfigurations.getTransactionCurrencyExponent() != null) {
                defaultConfiguration.getTransaction().put(my.com.softspace.reader.internal.kernelconfig.BerTlv.create(new my.com.softspace.reader.internal.kernelconfig.Tag(my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_5F36_TRANSACTION_CURR_EXP), my.com.softspace.reader.internal.kernelconfig.HexUtil.hexStringToByteArray(transactionConfigurations.getTransactionCurrencyExponent())));
            }
            if (transactionConfigurations.getTransactionType() != null && !defaultConfiguration.getTransaction().getValueAsHexString(156).isEmpty() && transactionConfigurations.getTransactionType() != null) {
                defaultConfiguration.getTransaction().put(my.com.softspace.reader.internal.kernelconfig.BerTlv.create(new my.com.softspace.reader.internal.kernelconfig.Tag(156), my.com.softspace.reader.internal.kernelconfig.HexUtil.hexStringToByteArray(transactionConfigurations.getTransactionType())));
            }
            if (transactionConfigurations.getMerchantCategoryCode() != null && !defaultConfiguration.getTerminal().getValueAsHexString(my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_9F15_MERCHANT_CATEGORY_CODE).isEmpty() && transactionConfigurations.getMerchantCategoryCode() != null) {
                defaultConfiguration.getTerminal().put(my.com.softspace.reader.internal.kernelconfig.BerTlv.create(new my.com.softspace.reader.internal.kernelconfig.Tag(my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_9F15_MERCHANT_CATEGORY_CODE), my.com.softspace.reader.internal.kernelconfig.HexUtil.hexStringToByteArray(transactionConfigurations.getMerchantCategoryCode())));
            }
            android.util.SparseArray<java.lang.Long> terminalCvmRequiredLimit = transactionConfigurations.getTerminalCvmRequiredLimit();
            if (terminalCvmRequiredLimit != null && terminalCvmRequiredLimit.size() > 0) {
                java.lang.Long l = terminalCvmRequiredLimit.get(0, 0L);
                java.util.List<my.com.softspace.reader.internal.kernelconfig.BerTlvTemplate> applications = defaultConfiguration.getApplications();
                if (applications != null) {
                    for (my.com.softspace.reader.internal.kernelconfig.BerTlvTemplate berTlvTemplate2 : applications) {
                        java.lang.Long l2 = 0L;
                        byte[] value = berTlvTemplate2.getValue(my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_9F06_TERM_AID);
                        switch (my.com.softspace.reader.internal.NfcTransactionHandler.AnonymousClass1.getHighSpeedVideoFpsRangesFor[my.com.softspace.reader.internal.kernel.PaymentNetwork.get(my.com.softspace.reader.internal.kernelconfig.HexUtil.byteArrayToHexString(value.length < 5 ? new byte[0] : java.util.Arrays.copyOfRange(value, 0, 5), true)).ordinal()]) {
                            case 1:
                                l2 = terminalCvmRequiredLimit.get(6, l);
                                break;
                            case 2:
                                l2 = terminalCvmRequiredLimit.get(24, l);
                                break;
                            case 3:
                                l2 = terminalCvmRequiredLimit.get(1, l);
                                break;
                            case 4:
                                l2 = terminalCvmRequiredLimit.get(32, l);
                                break;
                            case 5:
                                l2 = java.lang.Long.valueOf(com.gemalto.mfs.mwsdk.payment.engine.remote.DSRPConstants.MAX_AMOUNT_LIMIT);
                                break;
                            case 6:
                                l2 = terminalCvmRequiredLimit.get(64, l);
                                break;
                            case 7:
                                l2 = terminalCvmRequiredLimit.get(128, l);
                                break;
                            case 8:
                                l2 = terminalCvmRequiredLimit.get(256, l);
                                break;
                            case 9:
                                l2 = terminalCvmRequiredLimit.get(512, l);
                                break;
                            case 10:
                                l2 = terminalCvmRequiredLimit.get(1024, l);
                                break;
                            case 11:
                                l2 = terminalCvmRequiredLimit.get(8192, l);
                                break;
                        }
                        byte[] hexStringToByteArray = my.com.softspace.reader.internal.kernelconfig.HexUtil.hexStringToByteArray(java.lang.String.format(java.util.Locale.US, "%012d", l2));
                        berTlvTemplate2.put(my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_DF8126_READER_CVM_REQUIRED_LIMIT, hexStringToByteArray);
                        berTlvTemplate2.put(my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_DF01_VISA_CVM_REQUIRED_LIMIT, hexStringToByteArray);
                    }
                }
            }
        }
        create.init(activity, defaultConfiguration.toByteArray());
        create.setDebitOptIn(z2);
        this.getHighSpeedVideoSizesFor.set(create);
        this.getHighSpeedVideoSizes = (my.com.softspace.reader.TransactionHandler.TransactionCallback) new java.lang.ref.WeakReference(transactionCallback).get();
        final java.util.concurrent.CompletableFuture completableFuture = new java.util.concurrent.CompletableFuture();
        this.getInputSizeshNQ4ISI = new my.com.softspace.reader.internal.NfcTransactionHandler.OnCardDetect(this, activity, str, i2, !z, my.com.softspace.reader.TEEReaderEngine.getInstance().isSecureData(), (byte) 0);
        my.com.softspace.reader.TEEReaderEngine.getInstance().getLogger().i(getHighSpeedVideoFpsRanges, "timeout: ".concat(java.lang.String.valueOf(i2)));
        java.lang.ref.WeakReference<android.app.Activity> weakReference = this.getOutputMinFrameDuration;
        if (weakReference != null && weakReference.get() != null) {
            if (!my.com.softspace.reader.internal.nfc.NfcCommunicatorManager.isEnabled(this.getOutputMinFrameDuration.get()) || this.getOutputMinFrameDuration.get().isFinishing() || this.getOutputMinFrameDuration.get().isDestroyed()) {
                completableFuture.complete(java.lang.Boolean.FALSE);
                transactionCallback.onCardEvent(-1);
            }
            java.util.concurrent.Executors.newCachedThreadPool().submit(new java.lang.Runnable() { // from class: my.com.softspace.reader.internal.NfcTransactionHandler$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    my.com.softspace.reader.internal.NfcTransactionHandler.$r8$lambda$UxeLMJdm0uew9bVk7Jehoo5KaY8(my.com.softspace.reader.internal.NfcTransactionHandler.this, completableFuture, i2, transactionCallback);
                }
            });
        }
        this.Camera2StreamConfigurationMap.set(true);
        try {
            this.Camera2StreamConfigurationMap.set(((java.lang.Boolean) completableFuture.get(2000L, java.util.concurrent.TimeUnit.MILLISECONDS)).booleanValue());
        } catch (java.lang.Exception unused) {
            this.Camera2StreamConfigurationMap.set(false);
        }
        return this.Camera2StreamConfigurationMap.get();
    }

    @Override // my.com.softspace.reader.TransactionHandler
    public boolean cancelTransaction() {
        android.app.Activity activity;
        java.lang.ref.WeakReference<android.app.Activity> weakReference = this.getOutputMinFrameDuration;
        if (weakReference != null && (activity = weakReference.get()) != null) {
            try {
                my.com.softspace.reader.internal.kernel.Kernel andSet = this.getHighSpeedVideoSizesFor.getAndSet(null);
                if (andSet != null) {
                    andSet.release(activity);
                }
                this.getHighSpeedVideoFpsRangesFor.complete(java.lang.Boolean.TRUE);
                this.getOutputFormats.disableListening();
                java.lang.ref.WeakReference<android.app.Activity> weakReference2 = this.getOutputMinFrameDuration;
                if (weakReference2 != null) {
                    weakReference2.clear();
                    this.getOutputMinFrameDuration = null;
                }
                this.Camera2StreamConfigurationMap.set(false);
                this.getHighSpeedVideoFpsRangesFor = null;
                return true;
            } catch (java.lang.Exception unused) {
                java.lang.ref.WeakReference<android.app.Activity> weakReference3 = this.getOutputMinFrameDuration;
                if (weakReference3 != null) {
                    weakReference3.clear();
                    this.getOutputMinFrameDuration = null;
                }
                this.Camera2StreamConfigurationMap.set(false);
                this.getHighSpeedVideoFpsRangesFor = null;
            } catch (java.lang.Throwable th) {
                java.lang.ref.WeakReference<android.app.Activity> weakReference4 = this.getOutputMinFrameDuration;
                if (weakReference4 != null) {
                    weakReference4.clear();
                    this.getOutputMinFrameDuration = null;
                }
                this.Camera2StreamConfigurationMap.set(false);
                this.getHighSpeedVideoFpsRangesFor = null;
                throw th;
            }
        }
        return false;
    }

    @Override // my.com.softspace.reader.TransactionHandler
    public boolean isTransactionRunning() {
        return this.Camera2StreamConfigurationMap.get();
    }

    @Override // my.com.softspace.reader.TransactionHandler
    public int enterPin(java.lang.String str, int i, byte[] bArr) {
        return my.com.softspace.reader.SSKernelJNI.enterPIN(str, i, bArr);
    }

    public void injectEncryptionModel(my.com.softspace.reader.TEEReaderEngine.EncryptionModel encryptionModel) {
        this.getHighResolutionOutputSizeshNQ4ISI = encryptionModel;
    }

    public void injectNFCTagController(my.com.softspace.reader.TEEReaderEngine.NFCProvider nFCProvider) {
        this.getOutputFormats = nFCProvider;
    }

    static class OnCardDetect implements my.com.softspace.reader.internal.kernel.Kernel.Callback, my.com.softspace.reader.internal.nfc.NfcCommunicatorManager.Callback {
        private boolean Camera2StreamConfigurationMap;
        private boolean getHighResolutionOutputSizeshNQ4ISI;
        private final java.lang.String getHighSpeedVideoFpsRanges;
        private boolean getHighSpeedVideoFpsRangesFor;
        private my.com.softspace.reader.internal.nfc.NfcCommunicator getHighSpeedVideoSizes;
        private final int getHighSpeedVideoSizesFor;
        private final java.lang.ref.WeakReference<my.com.softspace.reader.internal.NfcTransactionHandler> getInputFormats;
        private boolean getInputSizeshNQ4ISI;
        private final android.content.Context getOutputFormats;

        private OnCardDetect(my.com.softspace.reader.internal.NfcTransactionHandler nfcTransactionHandler, android.content.Context context, java.lang.String str, int i, boolean z, boolean z2) {
            this.getHighResolutionOutputSizeshNQ4ISI = false;
            this.getInputSizeshNQ4ISI = false;
            this.getInputFormats = new java.lang.ref.WeakReference<>(nfcTransactionHandler);
            this.getOutputFormats = context.getApplicationContext();
            this.getHighSpeedVideoFpsRanges = str;
            this.getHighSpeedVideoSizesFor = i;
            this.getHighResolutionOutputSizeshNQ4ISI = false;
            this.getInputSizeshNQ4ISI = false;
            this.getHighSpeedVideoFpsRangesFor = z;
            this.Camera2StreamConfigurationMap = z2;
        }

        @Override // my.com.softspace.reader.internal.kernel.Kernel.Callback
        public byte[] exchangeAPDU(byte[] bArr) throws java.io.IOException {
            try {
                return this.getHighSpeedVideoSizes.sendDataToCard(bArr);
            } catch (java.io.IOException e) {
                setReadCardError(true);
                throw e;
            }
        }

        @Override // my.com.softspace.reader.internal.kernel.Kernel.Callback
        public int updateUI(final int i) {
            my.com.softspace.reader.internal.nfc.NfcCommunicator nfcCommunicator;
            my.com.softspace.reader.TEEReaderEngine.getInstance().getLogger().i(my.com.softspace.reader.internal.NfcTransactionHandler.getHighSpeedVideoFpsRanges, "[OnCardDetect] updateUI: ".concat(java.lang.String.valueOf(i)));
            final my.com.softspace.reader.internal.NfcTransactionHandler nfcTransactionHandler = this.getInputFormats.get();
            if (i == 23 && (nfcCommunicator = this.getHighSpeedVideoSizes) != null && nfcCommunicator.isCardConnected()) {
                my.com.softspace.reader.TEEReaderEngine.getInstance().getLogger().i(my.com.softspace.reader.internal.NfcTransactionHandler.getHighSpeedVideoFpsRanges, "[OnCardDetect] EVENT_CARD_READ_OK_REMOVE_CARD: disable NFC");
                this.getHighSpeedVideoSizes.removeCard(true);
                if (nfcTransactionHandler.getHighSpeedVideoFpsRangesFor == null) {
                    return 0;
                }
                nfcTransactionHandler.getHighSpeedVideoFpsRangesFor.complete(java.lang.Boolean.TRUE);
            }
            if (nfcTransactionHandler != null) {
                new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: my.com.softspace.reader.internal.NfcTransactionHandler$OnCardDetect$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        my.com.softspace.reader.internal.NfcTransactionHandler.OnCardDetect.Camera2StreamConfigurationMap(my.com.softspace.reader.internal.NfcTransactionHandler.OnCardDetect.this, nfcTransactionHandler, i);
                    }
                });
            }
            return 0;
        }

        @Override // my.com.softspace.reader.internal.kernel.Kernel.Callback
        public java.lang.Object[] cipherOperation(boolean z, byte[] bArr, boolean z2) {
            my.com.softspace.reader.internal.NfcTransactionHandler nfcTransactionHandler = this.getInputFormats.get();
            if (nfcTransactionHandler == null || nfcTransactionHandler.getHighResolutionOutputSizeshNQ4ISI == null) {
                return new java.lang.Object[]{-1};
            }
            return nfcTransactionHandler.getHighResolutionOutputSizeshNQ4ISI.cipherOperation(z, bArr, z2);
        }

        @Override // my.com.softspace.reader.internal.kernel.Kernel.Callback
        public java.lang.Object[] hmacSHA256(byte[] bArr) {
            my.com.softspace.reader.internal.NfcTransactionHandler nfcTransactionHandler = this.getInputFormats.get();
            if (nfcTransactionHandler == null || nfcTransactionHandler.getHighResolutionOutputSizeshNQ4ISI == null) {
                return new java.lang.Object[]{-1};
            }
            return nfcTransactionHandler.getHighResolutionOutputSizeshNQ4ISI.hmacSHA256(bArr);
        }

        @Override // my.com.softspace.reader.internal.kernel.Kernel.Callback
        public java.lang.Object[] cmac(byte[] bArr) {
            my.com.softspace.reader.internal.NfcTransactionHandler nfcTransactionHandler = this.getInputFormats.get();
            if (nfcTransactionHandler == null || nfcTransactionHandler.getHighResolutionOutputSizeshNQ4ISI == null) {
                return new java.lang.Object[]{-1};
            }
            return nfcTransactionHandler.getHighResolutionOutputSizeshNQ4ISI.cmac(bArr);
        }

        @Override // my.com.softspace.reader.internal.kernel.Kernel.Callback
        public byte[] sendOnlineAuthentication(byte[] bArr, byte[] bArr2) throws java.lang.Exception {
            my.com.softspace.reader.internal.NfcTransactionHandler nfcTransactionHandler = this.getInputFormats.get();
            if (nfcTransactionHandler == null || !nfcTransactionHandler.Camera2StreamConfigurationMap.get() || nfcTransactionHandler.getHighSpeedVideoSizes == null) {
                return null;
            }
            return nfcTransactionHandler.getHighSpeedVideoSizes.onKernelRequestOnlineHost(bArr, bArr2);
        }

        @Override // my.com.softspace.reader.internal.kernel.Kernel.Callback
        public boolean isReadCardError() {
            return this.getInputSizeshNQ4ISI;
        }

        @Override // my.com.softspace.reader.internal.kernel.Kernel.Callback
        public void setReadCardError(boolean z) {
            this.getInputSizeshNQ4ISI = z;
        }

        @Override // my.com.softspace.reader.internal.nfc.NfcCommunicatorManager.Callback
        public void onNfcTagDetected(final my.com.softspace.reader.internal.nfc.NfcCommunicatorManager.NfcConnectStatus nfcConnectStatus, final my.com.softspace.reader.internal.nfc.NfcCommunicator nfcCommunicator) {
            if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
                android.os.AsyncTask.THREAD_POOL_EXECUTOR.execute(new java.lang.Runnable() { // from class: my.com.softspace.reader.internal.NfcTransactionHandler$OnCardDetect$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        my.com.softspace.reader.internal.NfcTransactionHandler.OnCardDetect.this.onNfcTagDetected(nfcConnectStatus, nfcCommunicator);
                    }
                });
                return;
            }
            final my.com.softspace.reader.internal.NfcTransactionHandler nfcTransactionHandler = this.getInputFormats.get();
            if (nfcTransactionHandler == null) {
                return;
            }
            android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
            if (nfcConnectStatus == my.com.softspace.reader.internal.nfc.NfcCommunicatorManager.NfcConnectStatus.Successful) {
                handler.post(new java.lang.Runnable() { // from class: my.com.softspace.reader.internal.NfcTransactionHandler$OnCardDetect$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        my.com.softspace.reader.internal.NfcTransactionHandler.OnCardDetect.getHighSpeedVideoFpsRangesFor(my.com.softspace.reader.internal.NfcTransactionHandler.this);
                    }
                });
                this.getHighSpeedVideoSizes = nfcCommunicator;
                final my.com.softspace.reader.internal.kernel.Kernel kernel = (my.com.softspace.reader.internal.kernel.Kernel) nfcTransactionHandler.getHighSpeedVideoSizesFor.get();
                if (kernel == null) {
                    handler.post(new java.lang.Runnable() { // from class: my.com.softspace.reader.internal.NfcTransactionHandler$OnCardDetect$$ExternalSyntheticLambda2
                        @Override // java.lang.Runnable
                        public final void run() {
                            my.com.softspace.reader.internal.NfcTransactionHandler.OnCardDetect.getHighResolutionOutputSizeshNQ4ISI(my.com.softspace.reader.internal.NfcTransactionHandler.this);
                        }
                    });
                    nfcTransactionHandler.cancelTransaction();
                    return;
                }
                nfcTransactionHandler.Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicBoolean(true);
                final int start = kernel.start(this.getOutputFormats, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this);
                if (nfcTransactionHandler.getHighSpeedVideoSizes != null) {
                    handler.post(new java.lang.Runnable() { // from class: my.com.softspace.reader.internal.NfcTransactionHandler$OnCardDetect$$ExternalSyntheticLambda3
                        @Override // java.lang.Runnable
                        public final void run() {
                            my.com.softspace.reader.internal.NfcTransactionHandler.this.getHighSpeedVideoSizes.onKernelResult(start, kernel.getOnlineResponseData());
                        }
                    });
                }
                nfcTransactionHandler.cancelTransaction();
                return;
            }
            if (nfcTransactionHandler.getHighSpeedVideoSizes != null) {
                handler.post(new java.lang.Runnable() { // from class: my.com.softspace.reader.internal.NfcTransactionHandler$OnCardDetect$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        my.com.softspace.reader.internal.NfcTransactionHandler.OnCardDetect.Camera2StreamConfigurationMap(my.com.softspace.reader.internal.nfc.NfcCommunicatorManager.NfcConnectStatus.this, nfcTransactionHandler);
                    }
                });
            }
            nfcTransactionHandler.cancelTransaction();
        }

        static /* synthetic */ void getHighSpeedVideoFpsRangesFor(my.com.softspace.reader.internal.NfcTransactionHandler nfcTransactionHandler) {
            if (nfcTransactionHandler.getHighSpeedVideoFpsRangesFor != null) {
                nfcTransactionHandler.getHighSpeedVideoFpsRangesFor.complete(java.lang.Boolean.TRUE);
            }
            if (nfcTransactionHandler.getHighSpeedVideoSizes != null) {
                nfcTransactionHandler.getHighSpeedVideoSizes.onCardEvent(0);
            }
        }

        static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(my.com.softspace.reader.internal.NfcTransactionHandler nfcTransactionHandler) {
            if (nfcTransactionHandler.getHighSpeedVideoSizes != null) {
                nfcTransactionHandler.getHighSpeedVideoSizes.onKernelResult(7005, null);
            }
        }

        static /* synthetic */ void Camera2StreamConfigurationMap(my.com.softspace.reader.internal.nfc.NfcCommunicatorManager.NfcConnectStatus nfcConnectStatus, my.com.softspace.reader.internal.NfcTransactionHandler nfcTransactionHandler) {
            int i = my.com.softspace.reader.internal.NfcTransactionHandler.AnonymousClass1.getHighSpeedVideoSizes[nfcConnectStatus.ordinal()];
            if (i == 1) {
                nfcTransactionHandler.getHighSpeedVideoSizes.onCardEvent(3);
            } else if (i != 2) {
                nfcTransactionHandler.getHighSpeedVideoSizes.onCardEvent(1);
            } else {
                nfcTransactionHandler.getHighSpeedVideoSizes.onCardEvent(4);
            }
        }

        public static /* synthetic */ void Camera2StreamConfigurationMap(my.com.softspace.reader.internal.NfcTransactionHandler.OnCardDetect onCardDetect, my.com.softspace.reader.internal.NfcTransactionHandler nfcTransactionHandler, int i) {
            if (nfcTransactionHandler.getHighSpeedVideoSizes != null) {
                nfcTransactionHandler.getHighSpeedVideoSizes.onTransactionUIEvent(i);
            }
        }

        /* synthetic */ OnCardDetect(my.com.softspace.reader.internal.NfcTransactionHandler nfcTransactionHandler, android.content.Context context, java.lang.String str, int i, boolean z, boolean z2, byte b) {
            this(nfcTransactionHandler, context, str, i, z, z2);
        }
    }

    /* renamed from: my.com.softspace.reader.internal.NfcTransactionHandler$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRangesFor;
        static final /* synthetic */ int[] getHighSpeedVideoSizes;

        static {
            int[] iArr = new int[my.com.softspace.reader.internal.nfc.NfcCommunicatorManager.NfcConnectStatus.values().length];
            getHighSpeedVideoSizes = iArr;
            try {
                iArr[my.com.softspace.reader.internal.nfc.NfcCommunicatorManager.NfcConnectStatus.DuplicateCardFail.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoSizes[my.com.softspace.reader.internal.nfc.NfcCommunicatorManager.NfcConnectStatus.InvalidTagDetectedFail.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[my.com.softspace.reader.internal.kernel.PaymentNetwork.values().length];
            getHighSpeedVideoFpsRangesFor = iArr2;
            try {
                iArr2[my.com.softspace.reader.internal.kernel.PaymentNetwork.VISA.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[my.com.softspace.reader.internal.kernel.PaymentNetwork.MASTERCARD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[my.com.softspace.reader.internal.kernel.PaymentNetwork.MCCS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[my.com.softspace.reader.internal.kernel.PaymentNetwork.JCB.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[my.com.softspace.reader.internal.kernel.PaymentNetwork.JCBDC.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[my.com.softspace.reader.internal.kernel.PaymentNetwork.AMEX.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[my.com.softspace.reader.internal.kernel.PaymentNetwork.CUP.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[my.com.softspace.reader.internal.kernel.PaymentNetwork.VCCS.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[my.com.softspace.reader.internal.kernel.PaymentNetwork.DISCOVER.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[my.com.softspace.reader.internal.kernel.PaymentNetwork.MADA.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[my.com.softspace.reader.internal.kernel.PaymentNetwork.NETS.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$UxeLMJdm0uew9bVk7Jehoo5KaY8(final my.com.softspace.reader.internal.NfcTransactionHandler nfcTransactionHandler, java.util.concurrent.CompletableFuture completableFuture, int i, my.com.softspace.reader.TransactionHandler.TransactionCallback transactionCallback) {
        try {
            java.util.concurrent.CompletableFuture<java.lang.Boolean> completableFuture2 = nfcTransactionHandler.getHighSpeedVideoFpsRangesFor;
            if (completableFuture2 != null) {
                completableFuture2.complete(java.lang.Boolean.TRUE);
                nfcTransactionHandler.getHighSpeedVideoFpsRangesFor.cancel(true);
                nfcTransactionHandler.getHighSpeedVideoFpsRangesFor = null;
            }
            nfcTransactionHandler.getHighSpeedVideoFpsRangesFor = my.com.softspace.reader.internal.nfc.NfcCommunicatorManager.startNfcListening(nfcTransactionHandler.getOutputMinFrameDuration.get(), my.com.softspace.reader.internal.nfc.NfcCommunicatorManager.NfcType.Payment, new my.com.softspace.reader.internal.nfc.NfcCommunicatorManager.Callback() { // from class: my.com.softspace.reader.internal.NfcTransactionHandler$$ExternalSyntheticLambda1
                @Override // my.com.softspace.reader.internal.nfc.NfcCommunicatorManager.Callback
                public final void onNfcTagDetected(my.com.softspace.reader.internal.nfc.NfcCommunicatorManager.NfcConnectStatus nfcConnectStatus, my.com.softspace.reader.internal.nfc.NfcCommunicator nfcCommunicator) {
                    my.com.softspace.reader.internal.NfcTransactionHandler.this.getInputSizeshNQ4ISI.onNfcTagDetected(nfcConnectStatus, nfcCommunicator);
                }
            }, nfcTransactionHandler.getOutputFormats);
            completableFuture.complete(java.lang.Boolean.TRUE);
            nfcTransactionHandler.getHighSpeedVideoFpsRangesFor.get(i, java.util.concurrent.TimeUnit.SECONDS);
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException unused) {
            nfcTransactionHandler.cancelTransaction();
            completableFuture.complete(java.lang.Boolean.FALSE);
            transactionCallback.onCardEvent(2);
        } catch (java.lang.Exception unused2) {
            completableFuture.complete(java.lang.Boolean.FALSE);
            transactionCallback.onCardEvent(-1);
        }
    }
}
