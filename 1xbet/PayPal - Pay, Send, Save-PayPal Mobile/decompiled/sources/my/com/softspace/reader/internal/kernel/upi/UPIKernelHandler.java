package my.com.softspace.reader.internal.kernel.upi;

/* loaded from: classes17.dex */
public class UPIKernelHandler implements my.com.softspace.reader.internal.kernel.SSKernelHandler {
    private static final my.com.softspace.reader.internal.kernel.upi.UPIKernelHandler getHighSpeedVideoSizes = new my.com.softspace.reader.internal.kernel.upi.UPIKernelHandler();
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI = "UPIKernelHandler";
    private boolean getHighSpeedVideoFpsRangesFor = false;
    private boolean getInputSizeshNQ4ISI = false;
    private final long Camera2StreamConfigurationMap = upi.UPIKernelJNI.newContext();
    private final my.com.softspace.reader.ILogger getHighSpeedVideoFpsRanges = my.com.softspace.reader.TEEReaderEngine.getInstance().getLogger();

    public static my.com.softspace.reader.internal.kernel.upi.UPIKernelHandler getInstance() {
        return getHighSpeedVideoSizes;
    }

    @Override // my.com.softspace.reader.internal.kernel.SSKernelHandler
    public int initKernel(android.content.Context context, java.lang.String str, int i, final byte[] bArr, final byte[] bArr2, byte[] bArr3, final my.com.softspace.reader.internal.kernel.Kernel.Callback callback, boolean z, boolean z2, boolean z3, boolean z4) {
        java.lang.String valueAsHexString;
        my.com.softspace.reader.ILogger iLogger = this.getHighSpeedVideoFpsRanges;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("initKernel: ");
        sb.append(common.emv.util.HexUtil.encodeToString(bArr));
        iLogger.d("UPIKernelHandler", sb.toString());
        this.getHighSpeedVideoFpsRangesFor = false;
        byte[] value = my.com.softspace.reader.internal.kernelconfig.BerTlv.find(bArr3, 224).getValue();
        byte[] value2 = my.com.softspace.reader.internal.kernelconfig.BerTlv.find(bArr3, 225).getValue();
        byte[] value3 = my.com.softspace.reader.internal.kernelconfig.BerTlv.find(bArr3, 227).getValue();
        java.lang.String valueAsHexString2 = my.com.softspace.reader.internal.kernelconfig.BerTlv.find(value3, my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_9F03_AMOUNT_OTHER_NUM).getValueAsHexString();
        common.emv.kernel.TransactionData.TransactionType of = common.emv.kernel.TransactionData.TransactionType.of(my.com.softspace.reader.internal.kernelconfig.BerTlv.find(value3, 156).getValueAsHexString());
        final common.emv.kernel.TransactionData amountAuth = new common.emv.kernel.TransactionData().setAmountAuth(java.lang.Long.parseLong(str));
        amountAuth.setAmountOther(java.lang.Long.parseLong(valueAsHexString2));
        amountAuth.setTransactionType(of);
        my.com.softspace.reader.internal.kernelconfig.BerTlv create = my.com.softspace.reader.internal.kernelconfig.BerTlv.create(new my.com.softspace.reader.internal.kernelconfig.Tag(79), bArr);
        amountAuth.getData().put(create.getTag().toHexValue(), create.getValueAsHexString());
        java.lang.String str2 = null;
        common.emv.configuration.ConfigurationTemplate from = common.emv.configuration.ConfigurationTemplate.from(getConfigurationStream(context, bArr3, null), context.getResources().openRawResource(z4 ? my.com.softspace.reader.R.raw.ca_prod : my.com.softspace.reader.R.raw.ca));
        java.lang.String encodeToString = common.emv.util.HexUtil.encodeToString(bArr);
        for (java.lang.String str3 : from.supportedAIDSet()) {
            if (encodeToString.startsWith(str3)) {
                this.getHighSpeedVideoFpsRanges.d("UPIKernelHandler", "Matched AID: ".concat(java.lang.String.valueOf(str3)));
                str2 = str3;
            }
        }
        if (str2 == null) {
            str2 = common.emv.util.HexUtil.encodeToString(bArr);
        }
        java.lang.String str4 = str2;
        common.emv.configuration.ApplicationConfiguration createConfiguration = from.createConfiguration(str4);
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
        common.emv.kernel.TransactionRequest transactionRequest = new common.emv.kernel.TransactionRequest(amountAuth);
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
        final byte[] encode = upi.util.BerTlvEncoder.encode(amountAuth.getData());
        my.com.softspace.reader.ILogger iLogger2 = this.getHighSpeedVideoFpsRanges;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("transaction data: ");
        sb2.append(common.emv.util.HexUtil.encodeToString(encode));
        iLogger2.d("UPIKernelHandler", sb2.toString());
        my.com.softspace.reader.ILogger iLogger3 = this.getHighSpeedVideoFpsRanges;
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("cvm exceeded ? ");
        sb3.append(transactionRequest.isReaderCvmRequiredLimitExceed());
        iLogger3.d("UPIKernelHandler", sb3.toString());
        my.com.softspace.reader.ILogger iLogger4 = this.getHighSpeedVideoFpsRanges;
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("setup: ");
        sb4.append(common.emv.util.HexUtil.encodeToString(upi.util.BerTlvEncoder.encode(configuration)));
        iLogger4.d("UPIKernelHandler", sb4.toString());
        upi.UPIKernelJNI.setup(this.Camera2StreamConfigurationMap, upi.util.BerTlvEncoder.encode(configuration), upi.util.BerTlvEncoder.encode(createConfiguration.getCa(), "E1", "E2"));
        java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(new java.util.concurrent.Callable() { // from class: my.com.softspace.reader.internal.kernel.upi.UPIKernelHandler$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                common.emv.kernel.TransactionOutcome decode;
                my.com.softspace.reader.internal.kernel.upi.UPIKernelHandler uPIKernelHandler = my.com.softspace.reader.internal.kernel.upi.UPIKernelHandler.this;
                decode = upi.util.TransactionOutcomeDecoder.decode(new common.emv.kernel.TransactionRequest(amountAuth), upi.UPIKernelJNI.start(uPIKernelHandler.Camera2StreamConfigurationMap, bArr, bArr2, encode, new upi.UPIKernelCallback() { // from class: my.com.softspace.reader.internal.kernel.upi.UPIKernelHandler.1
                    @Override // upi.UPIKernelCallback
                    public byte[] exchange(byte[] bArr4) throws java.io.IOException {
                        byte[] exchangeAPDU = r2.exchangeAPDU(bArr4);
                        my.com.softspace.reader.internal.kernel.upi.UPIKernelHandler.this.getInputSizeshNQ4ISI = exchangeAPDU != null;
                        return exchangeAPDU;
                    }

                    @Override // upi.UPIKernelCallback
                    public int updateUI(int i2) {
                        my.com.softspace.reader.internal.kernel.upi.UPIKernelHandler.this.getHighSpeedVideoFpsRanges.d("UPIKernelHandler", "updateUI ".concat(java.lang.String.valueOf(i2)));
                        if (!my.com.softspace.reader.internal.kernel.upi.UPIKernelHandler.this.getInputSizeshNQ4ISI) {
                            return 0;
                        }
                        r2.updateUI(i2);
                        return 0;
                    }

                    @Override // upi.UPIKernelCallback
                    public int requestPINEntry(byte[] bArr4, byte[] bArr5) {
                        my.com.softspace.reader.ILogger iLogger5 = my.com.softspace.reader.internal.kernel.upi.UPIKernelHandler.this.getHighSpeedVideoFpsRanges;
                        java.lang.StringBuilder sb5 = new java.lang.StringBuilder("requestPINEntry: ");
                        sb5.append(common.emv.util.HexUtil.encodeToString(bArr4));
                        sb5.append(", ");
                        sb5.append(common.emv.util.HexUtil.encodeToString(bArr5));
                        iLogger5.d("UPIKernelHandler", sb5.toString());
                        return 4;
                    }

                    @Override // upi.UPIKernelCallback
                    public byte[] requestGoOnline(byte[] bArr4) {
                        my.com.softspace.reader.ILogger iLogger5 = my.com.softspace.reader.internal.kernel.upi.UPIKernelHandler.this.getHighSpeedVideoFpsRanges;
                        java.lang.StringBuilder sb5 = new java.lang.StringBuilder("requestGoOnline: ");
                        sb5.append(common.emv.util.HexUtil.encodeToString(bArr4));
                        iLogger5.d("UPIKernelHandler", sb5.toString());
                        my.com.softspace.reader.internal.kernel.upi.UPIKernelHandler.this.getHighSpeedVideoFpsRangesFor = true;
                        return common.emv.util.HexUtil.decode("8A023030");
                    }
                }));
                return decode;
            }
        });
        futureTask.run();
        try {
            common.emv.kernel.TransactionOutcome transactionOutcome = (common.emv.kernel.TransactionOutcome) futureTask.get(i, java.util.concurrent.TimeUnit.MILLISECONDS);
            my.com.softspace.reader.ILogger iLogger5 = this.getHighSpeedVideoFpsRanges;
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            sb5.append("Outcome: ");
            sb5.append(transactionOutcome.getOutcome());
            iLogger5.d("UPIKernelHandler", sb5.toString());
            if (transactionOutcome.getUiReqOnOutcome() != null && transactionOutcome.getUiReqOnOutcome().getMessage() != null) {
                my.com.softspace.reader.ILogger iLogger6 = this.getHighSpeedVideoFpsRanges;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append("getUiReqOnOutcome Message: ");
                sb6.append(transactionOutcome.getUiReqOnOutcome().getMessage());
                iLogger6.d("UPIKernelHandler", sb6.toString());
            }
            if (transactionOutcome.getDataRecord() != null && transactionOutcome.getDataRecord().length > 0) {
                my.com.softspace.reader.ILogger iLogger7 = this.getHighSpeedVideoFpsRanges;
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append("DataRecord: ");
                sb7.append(common.emv.util.HexUtil.encodeToString(transactionOutcome.getDataRecord()));
                iLogger7.d("UPIKernelHandler", sb7.toString());
            }
            int mapCVM = mapCVM(transactionOutcome);
            my.com.softspace.reader.ILogger iLogger8 = this.getHighSpeedVideoFpsRanges;
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append("CVM Code: ");
            sb8.append(mapCVM);
            iLogger8.d("UPIKernelHandler", sb8.toString());
            if (!str4.equalsIgnoreCase(my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_AID_CUP_A000000333010101) && find != null && java.lang.Long.parseLong(str) < java.lang.Long.parseLong(find.getValueAsHexString()) && (mapCVM == 2 || mapCVM == 1)) {
                mapCVM = 15;
            }
            int i2 = mapCVM;
            if (transactionOutcome.getOutcome() != common.emv.kernel.TransactionOutcome.Outcome.OnlineRequest && !this.getHighSpeedVideoFpsRangesFor) {
                return mapOutcome(transactionOutcome);
            }
            this.getHighSpeedVideoFpsRangesFor = false;
            return my.com.softspace.reader.SSKernelJNI.onlineProcessing(str, bArr, java.nio.ByteBuffer.wrap(transactionOutcome.getDataRecord()).array(), i2, z, z2);
        } catch (java.lang.Exception e) {
            this.getHighSpeedVideoFpsRanges.e("UPIKernelHandler", "exception", e);
            return 7055;
        }
    }
}
