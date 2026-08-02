package my.com.softspace.reader.internal.kernel.mastercard;

/* loaded from: classes17.dex */
public class MastercardKernelHandler implements my.com.softspace.reader.internal.kernel.SSKernelHandler {
    private static final my.com.softspace.reader.internal.kernel.mastercard.MastercardKernelHandler getHighSpeedVideoSizes = new my.com.softspace.reader.internal.kernel.mastercard.MastercardKernelHandler();
    private final java.lang.String getHighSpeedVideoFpsRangesFor = "MastercardHandler";
    private final long getHighSpeedVideoFpsRanges = mc.MCKernelJNI.newContext();
    private final my.com.softspace.reader.ILogger getHighResolutionOutputSizeshNQ4ISI = my.com.softspace.reader.TEEReaderEngine.getInstance().getLogger();

    public static my.com.softspace.reader.internal.kernel.mastercard.MastercardKernelHandler getInstance() {
        return getHighSpeedVideoSizes;
    }

    @Override // my.com.softspace.reader.internal.kernel.SSKernelHandler
    public int initKernel(android.content.Context context, java.lang.String str, int i, final byte[] bArr, final byte[] bArr2, byte[] bArr3, final my.com.softspace.reader.internal.kernel.Kernel.Callback callback, boolean z, boolean z2, boolean z3, boolean z4) {
        my.com.softspace.reader.internal.kernelconfig.BerTlv find;
        java.lang.String valueAsHexString;
        my.com.softspace.reader.ILogger iLogger = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("initKernel: ");
        sb.append(common.emv.util.HexUtil.encodeToString(bArr));
        iLogger.d("MastercardHandler", sb.toString());
        byte[] value = my.com.softspace.reader.internal.kernelconfig.BerTlv.find(bArr3, 224).getValue();
        byte[] value2 = my.com.softspace.reader.internal.kernelconfig.BerTlv.find(bArr3, 225).getValue();
        byte[] value3 = my.com.softspace.reader.internal.kernelconfig.BerTlv.find(bArr3, 227).getValue();
        my.com.softspace.reader.internal.kernelconfig.BerTlv find2 = my.com.softspace.reader.internal.kernelconfig.BerTlv.find(value3, my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_9F03_AMOUNT_OTHER_NUM);
        common.emv.kernel.TransactionData.TransactionType of = common.emv.kernel.TransactionData.TransactionType.of(my.com.softspace.reader.internal.kernelconfig.BerTlv.find(value3, 156).getValueAsHexString());
        common.emv.kernel.TransactionData amountAuth = new common.emv.kernel.TransactionData().setAmountAuth(java.lang.Long.parseLong(str));
        amountAuth.setAmountOther(java.lang.Long.parseLong(find2.getValueAsHexString()));
        amountAuth.setTransactionType(of);
        java.lang.String str2 = null;
        common.emv.configuration.ConfigurationTemplate from = common.emv.configuration.ConfigurationTemplate.from(getConfigurationStream(context, bArr3, null), context.getResources().openRawResource(z4 ? my.com.softspace.reader.R.raw.ca_prod : my.com.softspace.reader.R.raw.ca), context.getResources().openRawResource(z4 ? my.com.softspace.reader.R.raw.crl_prod : my.com.softspace.reader.R.raw.crl));
        java.lang.String encodeToString = common.emv.util.HexUtil.encodeToString(bArr);
        for (java.lang.String str3 : from.supportedAIDSet()) {
            if (encodeToString.startsWith(str3)) {
                this.getHighResolutionOutputSizeshNQ4ISI.d("MastercardHandler", "Matched AID: ".concat(java.lang.String.valueOf(str3)));
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
        if (value2 != null && (find = my.com.softspace.reader.internal.kernelconfig.BerTlv.find(value2, my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_DF8126_READER_CVM_REQUIRED_LIMIT)) != null) {
            configuration.put(find.getTag().toHexValue(), find.getValueAsHexString());
        }
        final byte[] encode = mc.util.BerTlvEncoder.encode(amountAuth.getData());
        my.com.softspace.reader.ILogger iLogger2 = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("transaction data: ");
        sb2.append(common.emv.util.HexUtil.encodeToString(encode));
        iLogger2.d("MastercardHandler", sb2.toString());
        my.com.softspace.reader.ILogger iLogger3 = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("cvm exceeded ? ");
        sb3.append(transactionRequest.isReaderCvmRequiredLimitExceed());
        iLogger3.d("MastercardHandler", sb3.toString());
        my.com.softspace.reader.ILogger iLogger4 = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("setup: ");
        sb4.append(common.emv.util.HexUtil.encodeToString(mc.util.BerTlvEncoder.encode(configuration)));
        iLogger4.d("MastercardHandler", sb4.toString());
        mc.MCKernelJNI.setup(this.getHighSpeedVideoFpsRanges, mc.util.BerTlvEncoder.encode(configuration), mc.util.BerTlvEncoder.encode(createConfiguration.getCa(), "E1", "E2"), mc.util.BerTlvEncoder.encode(createConfiguration.getCrl(), "E3", "E4"));
        java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(new java.util.concurrent.Callable() { // from class: my.com.softspace.reader.internal.kernel.mastercard.MastercardKernelHandler$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                common.emv.kernel.TransactionOutcome decode;
                my.com.softspace.reader.internal.kernel.mastercard.MastercardKernelHandler mastercardKernelHandler = my.com.softspace.reader.internal.kernel.mastercard.MastercardKernelHandler.this;
                decode = mc.util.TransactionOutcomeDecoder.decode(transactionRequest, mc.MCKernelJNI.start(mastercardKernelHandler.getHighSpeedVideoFpsRanges, bArr, bArr2, encode, new mc.MCKernelCallback() { // from class: my.com.softspace.reader.internal.kernel.mastercard.MastercardKernelHandler.1
                    @Override // mc.MCKernelCallback
                    public int updateMSG(byte[] bArr4, int i2, int i3, byte[] bArr5, byte[] bArr6) {
                        return 0;
                    }

                    @Override // mc.MCKernelCallback
                    public int updateOUT(byte[] bArr4) {
                        return 0;
                    }

                    @Override // mc.MCKernelCallback
                    public byte[] exchange(byte[] bArr4) throws java.io.IOException {
                        return r2.exchangeAPDU(bArr4);
                    }

                    @Override // mc.MCKernelCallback
                    public int updateUI(int i2) {
                        return r2.updateUI(i2);
                    }
                }));
                return decode;
            }
        });
        futureTask.run();
        try {
            common.emv.kernel.TransactionOutcome transactionOutcome = (common.emv.kernel.TransactionOutcome) futureTask.get(i, java.util.concurrent.TimeUnit.MILLISECONDS);
            my.com.softspace.reader.ILogger iLogger5 = this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            sb5.append("Outcome: ");
            sb5.append(transactionOutcome.getOutcome());
            iLogger5.d("MastercardHandler", sb5.toString());
            if (transactionOutcome.getDataRecord() != null && transactionOutcome.getDataRecord().length > 0) {
                my.com.softspace.reader.ILogger iLogger6 = this.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append("DataRecord: ");
                sb6.append(common.emv.util.HexUtil.encodeToString(transactionOutcome.getDataRecord()));
                iLogger6.d("MastercardHandler", sb6.toString());
            }
            int mapCVM = mapCVM(transactionOutcome);
            my.com.softspace.reader.ILogger iLogger7 = this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append("CVM Code: ");
            sb7.append(mapCVM);
            iLogger7.d("MastercardHandler", sb7.toString());
            if (transactionOutcome.getOutcome() != common.emv.kernel.TransactionOutcome.Outcome.OnlineRequest && (of != common.emv.kernel.TransactionData.TransactionType.Refund || (transactionOutcome.getOutcome() != common.emv.kernel.TransactionOutcome.Outcome.Declined && transactionOutcome.getOutcome() != common.emv.kernel.TransactionOutcome.Outcome.EndApplication))) {
                return mapOutcome(transactionOutcome);
            }
            return my.com.softspace.reader.SSKernelJNI.onlineProcessing(str, bArr, java.nio.ByteBuffer.wrap(transactionOutcome.getDataRecord()).array(), mapCVM, z, z2);
        } catch (java.lang.Exception e) {
            this.getHighResolutionOutputSizeshNQ4ISI.e("MastercardHandler", "exception", e);
            return 7055;
        }
    }
}
