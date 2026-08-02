package my.com.softspace.reader.internal.kernel.amex;

/* loaded from: classes17.dex */
public class AMEXKernelHandler implements my.com.softspace.reader.internal.kernel.SSKernelHandler {
    private static final my.com.softspace.reader.internal.kernel.amex.AMEXKernelHandler getHighSpeedVideoFpsRangesFor = new my.com.softspace.reader.internal.kernel.amex.AMEXKernelHandler();
    private final java.lang.String getHighSpeedVideoFpsRanges = "AMEXKernelHandler";
    private boolean getHighSpeedVideoSizes = false;
    private boolean getOutputFormats = false;
    private final long getHighResolutionOutputSizeshNQ4ISI = amex.AMEXKernelJNI.newContext();
    private final my.com.softspace.reader.ILogger Camera2StreamConfigurationMap = my.com.softspace.reader.TEEReaderEngine.getInstance().getLogger();

    public static my.com.softspace.reader.internal.kernel.amex.AMEXKernelHandler getInstance() {
        return getHighSpeedVideoFpsRangesFor;
    }

    @Override // my.com.softspace.reader.internal.kernel.SSKernelHandler
    public int initKernel(android.content.Context context, java.lang.String str, int i, final byte[] bArr, final byte[] bArr2, byte[] bArr3, final my.com.softspace.reader.internal.kernel.Kernel.Callback callback, boolean z, boolean z2, boolean z3, boolean z4) {
        java.lang.String valueAsHexString;
        my.com.softspace.reader.ILogger iLogger = this.Camera2StreamConfigurationMap;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("initKernel: ");
        sb.append(common.emv.util.HexUtil.encodeToString(bArr));
        iLogger.d("AMEXKernelHandler", sb.toString());
        this.getHighSpeedVideoSizes = false;
        byte[] value = my.com.softspace.reader.internal.kernelconfig.BerTlv.find(bArr3, 224).getValue();
        byte[] value2 = my.com.softspace.reader.internal.kernelconfig.BerTlv.find(bArr3, 225).getValue();
        byte[] value3 = my.com.softspace.reader.internal.kernelconfig.BerTlv.find(bArr3, 227).getValue();
        java.lang.String valueAsHexString2 = my.com.softspace.reader.internal.kernelconfig.BerTlv.find(value3, my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_9F03_AMOUNT_OTHER_NUM).getValueAsHexString();
        common.emv.kernel.TransactionData.TransactionType of = common.emv.kernel.TransactionData.TransactionType.of(my.com.softspace.reader.internal.kernelconfig.BerTlv.find(value3, 156).getValueAsHexString());
        common.emv.kernel.TransactionData amountAuth = new common.emv.kernel.TransactionData().setAmountAuth(java.lang.Long.parseLong(str));
        amountAuth.setAmountOther(java.lang.Long.parseLong(valueAsHexString2));
        amountAuth.setTransactionType(of);
        common.emv.configuration.ConfigurationTemplate from = common.emv.configuration.ConfigurationTemplate.from(getConfigurationStream(context, bArr3, null), context.getResources().openRawResource(z4 ? my.com.softspace.reader.R.raw.ca_prod : my.com.softspace.reader.R.raw.ca));
        java.lang.String encodeToString = common.emv.util.HexUtil.encodeToString(bArr);
        java.lang.String str2 = null;
        for (java.lang.String str3 : from.supportedAIDSet()) {
            if (encodeToString.startsWith(str3)) {
                this.Camera2StreamConfigurationMap.d("AMEXKernelHandler", "Matched AID: ".concat(java.lang.String.valueOf(str3)));
                str2 = str3;
            }
        }
        if (str2 == null) {
            str2 = common.emv.util.HexUtil.encodeToString(bArr);
        }
        common.emv.configuration.ApplicationConfiguration createConfiguration = from.createConfiguration(str2);
        common.emv.configuration.DataObjectList configuration = createConfiguration.getConfiguration(of);
        if (value != null && (valueAsHexString = my.com.softspace.reader.internal.kernelconfig.BerTlv.find(value, my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_9F15_MERCHANT_CATEGORY_CODE).getValueAsHexString()) != null && !valueAsHexString.isEmpty()) {
            configuration.put(java.lang.Integer.toHexString(my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_9F15_MERCHANT_CATEGORY_CODE).toUpperCase(), valueAsHexString);
        }
        if (value3 != null) {
            if (my.com.softspace.reader.internal.kernelconfig.BerTlv.find(value3, my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_9F1A_TERMINAL_COUNTRY_CODE) != null) {
                configuration.put(java.lang.Integer.toHexString(my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_9F1A_TERMINAL_COUNTRY_CODE).toUpperCase(), my.com.softspace.reader.internal.kernelconfig.BerTlv.find(value3, my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_9F1A_TERMINAL_COUNTRY_CODE).getValueAsHexString());
            }
            if (my.com.softspace.reader.internal.kernelconfig.BerTlv.find(value3, my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_5F2A_TRANSACTION_CURR_CODE) != null) {
                configuration.put(java.lang.Integer.toHexString(my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_5F2A_TRANSACTION_CURR_CODE).toUpperCase(), my.com.softspace.reader.internal.kernelconfig.BerTlv.find(value3, my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_5F2A_TRANSACTION_CURR_CODE).getValueAsHexString());
            }
            if (my.com.softspace.reader.internal.kernelconfig.BerTlv.find(value3, my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_5F36_TRANSACTION_CURR_EXP) != null) {
                configuration.put(java.lang.Integer.toHexString(my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_5F36_TRANSACTION_CURR_EXP).toUpperCase(), my.com.softspace.reader.internal.kernelconfig.BerTlv.find(value3, my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_5F36_TRANSACTION_CURR_EXP).getValueAsHexString());
            }
        }
        final common.emv.kernel.TransactionRequest transactionRequest = new common.emv.kernel.TransactionRequest(amountAuth);
        my.com.softspace.reader.internal.kernelconfig.BerTlv find = my.com.softspace.reader.internal.kernelconfig.BerTlv.find(value2, my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_DF8126_READER_CVM_REQUIRED_LIMIT);
        if (find != null) {
            configuration.put(find.getTag().toHexValue(), find.getValueAsHexString());
            configuration.put(my.com.softspace.reader.internal.kernelconfig.EmvTags.EMV_TAG_DF01_VISA_CVM_REQUIRED_LIMIT, find.getValueAsHexString());
            if (java.lang.Long.parseLong(str) >= java.lang.Long.parseLong(find.getValueAsHexString())) {
                transactionRequest.setReaderCvmRequiredLimitExceed(true);
            }
        }
        if (value3 != null) {
            if (my.com.softspace.reader.internal.kernelconfig.BerTlv.find(value3, my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_9F1A_TERMINAL_COUNTRY_CODE) != null) {
                configuration.put(java.lang.Integer.toHexString(my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_9F1A_TERMINAL_COUNTRY_CODE).toUpperCase(), my.com.softspace.reader.internal.kernelconfig.BerTlv.find(value3, my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_9F1A_TERMINAL_COUNTRY_CODE).getValueAsHexString());
            }
            if (my.com.softspace.reader.internal.kernelconfig.BerTlv.find(value3, my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_5F2A_TRANSACTION_CURR_CODE) != null) {
                configuration.put(java.lang.Integer.toHexString(my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_5F2A_TRANSACTION_CURR_CODE).toUpperCase(), my.com.softspace.reader.internal.kernelconfig.BerTlv.find(value3, my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_5F2A_TRANSACTION_CURR_CODE).getValueAsHexString());
            }
            if (my.com.softspace.reader.internal.kernelconfig.BerTlv.find(value3, my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_5F36_TRANSACTION_CURR_EXP) != null) {
                configuration.put(java.lang.Integer.toHexString(my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_5F36_TRANSACTION_CURR_EXP).toUpperCase(), my.com.softspace.reader.internal.kernelconfig.BerTlv.find(value3, my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_5F36_TRANSACTION_CURR_EXP).getValueAsHexString());
            }
        }
        byte[] value4 = my.com.softspace.reader.internal.kernelconfig.BerTlv.find(value2, 40813) != null ? my.com.softspace.reader.internal.kernelconfig.BerTlv.find(value2, 40813).getValue() : null;
        byte[] value5 = my.com.softspace.reader.internal.kernelconfig.BerTlv.find(value2, 40814) != null ? my.com.softspace.reader.internal.kernelconfig.BerTlv.find(value2, 40814).getValue() : null;
        if (value4 == null || value5 == null) {
            this.Camera2StreamConfigurationMap.e("AMEXKernelHandler", "Missing AMEX contactless reader cap or enhanced contactless reader cap");
            throw new java.lang.IllegalArgumentException();
        }
        value4[0] = (byte) (value4[0] & (-9));
        byte b = value5[2];
        value5[2] = 0;
        if (transactionRequest.isReaderCvmRequiredLimitExceed()) {
            value4[0] = (byte) (value4[0] | 8);
            value5[2] = (byte) (value5[2] | 64);
        }
        amountAuth.setAmexContactlessReaderCapabilities(value4);
        amountAuth.setAmexEnhancedContactlessReaderCapabilities(value5);
        final byte[] encode = amex.util.BerTlvEncoder.encode(amountAuth.getData());
        my.com.softspace.reader.ILogger iLogger2 = this.Camera2StreamConfigurationMap;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("transaction data: ");
        sb2.append(common.emv.util.HexUtil.encodeToString(encode));
        iLogger2.d("AMEXKernelHandler", sb2.toString());
        my.com.softspace.reader.ILogger iLogger3 = this.Camera2StreamConfigurationMap;
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("cvm exceeded ? ");
        sb3.append(transactionRequest.isReaderCvmRequiredLimitExceed());
        iLogger3.d("AMEXKernelHandler", sb3.toString());
        my.com.softspace.reader.ILogger iLogger4 = this.Camera2StreamConfigurationMap;
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("setup: ");
        sb4.append(common.emv.util.HexUtil.encodeToString(amex.util.BerTlvEncoder.encode(configuration)));
        iLogger4.d("AMEXKernelHandler", sb4.toString());
        amex.AMEXKernelJNI.setup(this.getHighResolutionOutputSizeshNQ4ISI, amex.util.BerTlvEncoder.encode(configuration), amex.util.BerTlvEncoder.encode(createConfiguration.getCa(), "E1", "E2"));
        java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(new java.util.concurrent.Callable() { // from class: my.com.softspace.reader.internal.kernel.amex.AMEXKernelHandler$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                common.emv.kernel.TransactionOutcome decode;
                my.com.softspace.reader.internal.kernel.amex.AMEXKernelHandler aMEXKernelHandler = my.com.softspace.reader.internal.kernel.amex.AMEXKernelHandler.this;
                decode = amex.util.TransactionOutcomeDecoder.decode(transactionRequest, amex.AMEXKernelJNI.start(aMEXKernelHandler.getHighResolutionOutputSizeshNQ4ISI, bArr, bArr2, encode, new amex.AMEXKernelCallback() { // from class: my.com.softspace.reader.internal.kernel.amex.AMEXKernelHandler.1
                    @Override // amex.AMEXKernelCallback
                    public byte[] exchange(byte[] bArr4) throws java.io.IOException {
                        byte[] exchangeAPDU = r2.exchangeAPDU(bArr4);
                        my.com.softspace.reader.internal.kernel.amex.AMEXKernelHandler.this.getOutputFormats = exchangeAPDU != null;
                        return exchangeAPDU;
                    }

                    @Override // amex.AMEXKernelCallback
                    public int updateUI(int i2) {
                        my.com.softspace.reader.internal.kernel.amex.AMEXKernelHandler.this.Camera2StreamConfigurationMap.d("AMEXKernelHandler", "updateUI ".concat(java.lang.String.valueOf(i2)));
                        if (!my.com.softspace.reader.internal.kernel.amex.AMEXKernelHandler.this.getOutputFormats) {
                            return 0;
                        }
                        r2.updateUI(i2);
                        return 0;
                    }

                    @Override // amex.AMEXKernelCallback
                    public int requestPINEntry(byte[] bArr4, byte[] bArr5) {
                        my.com.softspace.reader.ILogger iLogger5 = my.com.softspace.reader.internal.kernel.amex.AMEXKernelHandler.this.Camera2StreamConfigurationMap;
                        java.lang.StringBuilder sb5 = new java.lang.StringBuilder("requestPINEntry: ");
                        sb5.append(common.emv.util.HexUtil.encodeToString(bArr4));
                        sb5.append(", ");
                        sb5.append(common.emv.util.HexUtil.encodeToString(bArr5));
                        iLogger5.d("AMEXKernelHandler", sb5.toString());
                        return 4;
                    }

                    @Override // amex.AMEXKernelCallback
                    public byte[] requestGoOnline(byte[] bArr4) {
                        my.com.softspace.reader.ILogger iLogger5 = my.com.softspace.reader.internal.kernel.amex.AMEXKernelHandler.this.Camera2StreamConfigurationMap;
                        java.lang.StringBuilder sb5 = new java.lang.StringBuilder("requestGoOnline: ");
                        sb5.append(common.emv.util.HexUtil.encodeToString(bArr4));
                        iLogger5.d("AMEXKernelHandler", sb5.toString());
                        my.com.softspace.reader.internal.kernel.amex.AMEXKernelHandler.this.getHighSpeedVideoSizes = true;
                        return common.emv.util.HexUtil.decode("8A023030");
                    }
                }));
                return decode;
            }
        });
        futureTask.run();
        try {
            common.emv.kernel.TransactionOutcome transactionOutcome = (common.emv.kernel.TransactionOutcome) futureTask.get(i, java.util.concurrent.TimeUnit.MILLISECONDS);
            my.com.softspace.reader.ILogger iLogger5 = this.Camera2StreamConfigurationMap;
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            sb5.append("Outcome: ");
            sb5.append(transactionOutcome.getOutcome());
            iLogger5.d("AMEXKernelHandler", sb5.toString());
            if (transactionOutcome.getUiReqOnOutcome() != null && transactionOutcome.getUiReqOnOutcome().getMessage() != null) {
                my.com.softspace.reader.ILogger iLogger6 = this.Camera2StreamConfigurationMap;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append("getUiReqOnOutcome Message: ");
                sb6.append(transactionOutcome.getUiReqOnOutcome().getMessage());
                iLogger6.d("AMEXKernelHandler", sb6.toString());
            }
            if (transactionOutcome.getDataRecord() != null && transactionOutcome.getDataRecord().length > 0) {
                my.com.softspace.reader.ILogger iLogger7 = this.Camera2StreamConfigurationMap;
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append("DataRecord: ");
                sb7.append(common.emv.util.HexUtil.encodeToString(transactionOutcome.getDataRecord()));
                iLogger7.d("AMEXKernelHandler", sb7.toString());
            }
            int mapCVM = mapCVM(transactionOutcome);
            my.com.softspace.reader.ILogger iLogger8 = this.Camera2StreamConfigurationMap;
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append("CVM Code: ");
            sb8.append(mapCVM);
            iLogger8.d("AMEXKernelHandler", sb8.toString());
            if (transactionOutcome.getOutcome() != common.emv.kernel.TransactionOutcome.Outcome.OnlineRequest && !this.getHighSpeedVideoSizes) {
                return mapOutcome(transactionOutcome);
            }
            this.getHighSpeedVideoSizes = false;
            return my.com.softspace.reader.SSKernelJNI.onlineProcessing(str, bArr, java.nio.ByteBuffer.wrap(transactionOutcome.getDataRecord()).array(), mapCVM, z, z2);
        } catch (java.lang.Exception e) {
            this.Camera2StreamConfigurationMap.e("AMEXKernelHandler", "exception", e);
            return 7055;
        }
    }
}
