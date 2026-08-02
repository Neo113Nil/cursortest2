package my.com.softspace.reader.internal.kernel.visa;

/* loaded from: classes17.dex */
public class VisaKernelHandler implements my.com.softspace.reader.internal.kernel.SSKernelHandler {
    private static final my.com.softspace.reader.internal.kernel.visa.VisaKernelHandler getHighSpeedVideoFpsRanges = new my.com.softspace.reader.internal.kernel.visa.VisaKernelHandler();
    private boolean Camera2StreamConfigurationMap;
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI = "VisaKernelHandler";
    private final long getHighSpeedVideoSizes = visa.VISAKernelJNI.newContext();
    private final my.com.softspace.reader.ILogger getHighSpeedVideoFpsRangesFor = my.com.softspace.reader.TEEReaderEngine.getInstance().getLogger();

    public static my.com.softspace.reader.internal.kernel.visa.VisaKernelHandler getInstance() {
        return getHighSpeedVideoFpsRanges;
    }

    @Override // my.com.softspace.reader.internal.kernel.SSKernelHandler
    public int initKernel(android.content.Context context, java.lang.String str, int i, final byte[] bArr, final byte[] bArr2, byte[] bArr3, final my.com.softspace.reader.internal.kernel.Kernel.Callback callback, boolean z, boolean z2, boolean z3, boolean z4) {
        java.lang.String valueAsHexString;
        my.com.softspace.reader.ILogger iLogger = this.getHighSpeedVideoFpsRangesFor;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("initKernel: ");
        sb.append(common.emv.util.HexUtil.encodeToString(bArr));
        iLogger.d("VisaKernelHandler", sb.toString());
        byte[] value = my.com.softspace.reader.internal.kernelconfig.BerTlv.find(bArr3, 224).getValue();
        byte[] value2 = my.com.softspace.reader.internal.kernelconfig.BerTlv.find(bArr3, 225).getValue();
        byte[] value3 = my.com.softspace.reader.internal.kernelconfig.BerTlv.find(bArr3, 227).getValue();
        java.lang.String valueAsHexString2 = my.com.softspace.reader.internal.kernelconfig.BerTlv.find(value3, my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_9F03_AMOUNT_OTHER_NUM).getValueAsHexString();
        common.emv.kernel.TransactionData.TransactionType of = common.emv.kernel.TransactionData.TransactionType.of(my.com.softspace.reader.internal.kernelconfig.BerTlv.find(value3, 156).getValueAsHexString());
        common.emv.kernel.TransactionData amountAuth = new common.emv.kernel.TransactionData().setAmountAuth(java.lang.Long.parseLong(str));
        amountAuth.setAmountOther(java.lang.Long.parseLong(valueAsHexString2));
        amountAuth.setTransactionType(of);
        my.com.softspace.reader.internal.kernelconfig.BerTlv create = my.com.softspace.reader.internal.kernelconfig.BerTlv.create(new my.com.softspace.reader.internal.kernelconfig.Tag(79), bArr);
        amountAuth.getData().put(create.getTag().toHexValue(), create.getValueAsHexString());
        java.lang.String str2 = null;
        common.emv.configuration.ConfigurationTemplate from = common.emv.configuration.ConfigurationTemplate.from(getConfigurationStream(context, bArr3, null), context.getResources().openRawResource(z4 ? my.com.softspace.reader.R.raw.ca_prod : my.com.softspace.reader.R.raw.ca));
        java.lang.String encodeToString = common.emv.util.HexUtil.encodeToString(bArr);
        for (java.lang.String str3 : from.supportedAIDSet()) {
            if (encodeToString.startsWith(str3)) {
                this.getHighSpeedVideoFpsRangesFor.d("VisaKernelHandler", "Matched AID: ".concat(java.lang.String.valueOf(str3)));
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
                byte[] value4 = my.com.softspace.reader.internal.kernelconfig.BerTlv.find(value2, my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_9F66_VISA_TERMINAL_TRANSACTION_QUALIFIERS_TTQ).getValue();
                value4[1] = (byte) (value4[1] | 64);
                amountAuth.setTTQ(common.emv.util.HexUtil.encodeToString(value4));
                configuration.put(my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_9F66_TERMINAL_TRANSACTION_QUALIFIERS_TTQ, common.emv.util.HexUtil.encodeToString(value4));
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
        final byte[] encode = visa.util.BerTlvEncoder.encode(amountAuth.getData());
        my.com.softspace.reader.ILogger iLogger2 = this.getHighSpeedVideoFpsRangesFor;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("transaction data: ");
        sb2.append(common.emv.util.HexUtil.encodeToString(encode));
        iLogger2.d("VisaKernelHandler", sb2.toString());
        my.com.softspace.reader.ILogger iLogger3 = this.getHighSpeedVideoFpsRangesFor;
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("cvm exceeded ? ");
        sb3.append(transactionRequest.isReaderCvmRequiredLimitExceed());
        iLogger3.d("VisaKernelHandler", sb3.toString());
        my.com.softspace.reader.ILogger iLogger4 = this.getHighSpeedVideoFpsRangesFor;
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("setup: ");
        sb4.append(common.emv.util.HexUtil.encodeToString(visa.util.BerTlvEncoder.encode(configuration)));
        iLogger4.d("VisaKernelHandler", sb4.toString());
        visa.VISAKernelJNI.setup(this.getHighSpeedVideoSizes, visa.util.BerTlvEncoder.encode(configuration), visa.util.BerTlvEncoder.encode(createConfiguration.getCa(), "E1", "E2"));
        java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(new java.util.concurrent.Callable() { // from class: my.com.softspace.reader.internal.kernel.visa.VisaKernelHandler$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                common.emv.kernel.TransactionOutcome decode;
                my.com.softspace.reader.internal.kernel.visa.VisaKernelHandler visaKernelHandler = my.com.softspace.reader.internal.kernel.visa.VisaKernelHandler.this;
                decode = visa.util.TransactionOutcomeDecoder.decode(transactionRequest, visa.VISAKernelJNI.start(visaKernelHandler.getHighSpeedVideoSizes, bArr, bArr2, encode, new visa.VISAKernelCallback() { // from class: my.com.softspace.reader.internal.kernel.visa.VisaKernelHandler.1
                    @Override // visa.VISAKernelCallback
                    public byte[] exchange(byte[] bArr4) throws java.io.IOException {
                        byte[] exchangeAPDU = r2.exchangeAPDU(bArr4);
                        my.com.softspace.reader.internal.kernel.visa.VisaKernelHandler.this.Camera2StreamConfigurationMap = exchangeAPDU != null;
                        return exchangeAPDU;
                    }

                    @Override // visa.VISAKernelCallback
                    public int updateUI(int i2) {
                        my.com.softspace.reader.internal.kernel.visa.VisaKernelHandler.this.getHighSpeedVideoFpsRangesFor.d("VisaKernelHandler", "updateUI ".concat(java.lang.String.valueOf(i2)));
                        if (!my.com.softspace.reader.internal.kernel.visa.VisaKernelHandler.this.Camera2StreamConfigurationMap) {
                            return 0;
                        }
                        r2.updateUI(i2);
                        return 0;
                    }
                }));
                return decode;
            }
        });
        futureTask.run();
        try {
            common.emv.kernel.TransactionOutcome transactionOutcome = (common.emv.kernel.TransactionOutcome) futureTask.get(i, java.util.concurrent.TimeUnit.MILLISECONDS);
            my.com.softspace.reader.ILogger iLogger5 = this.getHighSpeedVideoFpsRangesFor;
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            sb5.append("Outcome: ");
            sb5.append(transactionOutcome.getOutcome());
            iLogger5.d("VisaKernelHandler", sb5.toString());
            if (transactionOutcome.getUiReqOnOutcome() != null && transactionOutcome.getUiReqOnOutcome().getMessage() != null) {
                my.com.softspace.reader.ILogger iLogger6 = this.getHighSpeedVideoFpsRangesFor;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append("getUiReqOnOutcome Message: ");
                sb6.append(transactionOutcome.getUiReqOnOutcome().getMessage());
                iLogger6.d("VisaKernelHandler", sb6.toString());
            }
            if (transactionOutcome.getDataRecord() != null && transactionOutcome.getDataRecord().length > 0) {
                my.com.softspace.reader.ILogger iLogger7 = this.getHighSpeedVideoFpsRangesFor;
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append("DataRecord: ");
                sb7.append(common.emv.util.HexUtil.encodeToString(transactionOutcome.getDataRecord()));
                iLogger7.d("VisaKernelHandler", sb7.toString());
            }
            int mapCVM = mapCVM(transactionOutcome);
            my.com.softspace.reader.ILogger iLogger8 = this.getHighSpeedVideoFpsRangesFor;
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append("CVM Code: ");
            sb8.append(mapCVM);
            iLogger8.d("VisaKernelHandler", sb8.toString());
            if (transactionOutcome.getOutcome() == common.emv.kernel.TransactionOutcome.Outcome.OnlineRequest) {
                return my.com.softspace.reader.SSKernelJNI.onlineProcessing(str, bArr, java.nio.ByteBuffer.wrap(transactionOutcome.getDataRecord()).array(), mapCVM, z, z2);
            }
            return mapOutcome(transactionOutcome);
        } catch (java.lang.Exception e) {
            this.getHighSpeedVideoFpsRangesFor.e("VisaKernelHandler", "exception", e);
            return 7055;
        }
    }
}
