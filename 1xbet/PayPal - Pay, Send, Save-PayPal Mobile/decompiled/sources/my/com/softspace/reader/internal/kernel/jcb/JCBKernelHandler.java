package my.com.softspace.reader.internal.kernel.jcb;

/* loaded from: classes17.dex */
public class JCBKernelHandler implements my.com.softspace.reader.internal.kernel.SSKernelHandler {
    private static final my.com.softspace.reader.internal.kernel.jcb.JCBKernelHandler Camera2StreamConfigurationMap = new my.com.softspace.reader.internal.kernel.jcb.JCBKernelHandler();
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoSizes;
    private boolean getOutputMinFrameDuration;
    private final java.lang.String getHighSpeedVideoFpsRanges = "JCBKernelHandler";
    private final long getHighSpeedVideoFpsRangesFor = jcb.JCBKernelJNI.newContext();
    private final my.com.softspace.reader.ILogger getOutputFormats = my.com.softspace.reader.TEEReaderEngine.getInstance().getLogger();

    public static my.com.softspace.reader.internal.kernel.jcb.JCBKernelHandler getInstance() {
        return Camera2StreamConfigurationMap;
    }

    @Override // my.com.softspace.reader.internal.kernel.SSKernelHandler
    public int initKernel(android.content.Context context, java.lang.String str, int i, final byte[] bArr, final byte[] bArr2, byte[] bArr3, final my.com.softspace.reader.internal.kernel.Kernel.Callback callback, boolean z, boolean z2, boolean z3, boolean z4) {
        java.lang.String str2;
        common.emv.kernel.TransactionOutcome transactionOutcome;
        int mapCVM;
        java.lang.String valueAsHexString;
        byte[] value = my.com.softspace.reader.internal.kernelconfig.BerTlv.find(bArr3, 224).getValue();
        byte[] value2 = my.com.softspace.reader.internal.kernelconfig.BerTlv.find(bArr3, 225).getValue();
        byte[] value3 = my.com.softspace.reader.internal.kernelconfig.BerTlv.find(bArr3, 227).getValue();
        java.lang.String valueAsHexString2 = my.com.softspace.reader.internal.kernelconfig.BerTlv.find(value3, my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_9F03_AMOUNT_OTHER_NUM).getValueAsHexString();
        common.emv.kernel.TransactionData.TransactionType of = common.emv.kernel.TransactionData.TransactionType.of(my.com.softspace.reader.internal.kernelconfig.BerTlv.find(value3, 156).getValueAsHexString());
        final common.emv.kernel.TransactionData amountAuth = new common.emv.kernel.TransactionData().setAmountAuth(java.lang.Long.parseLong(str));
        amountAuth.setAmountOther(java.lang.Long.parseLong(valueAsHexString2));
        amountAuth.setTransactionType(of);
        final byte[] encode = jcb.util.BerTlvEncoder.encode(amountAuth.getData());
        common.emv.configuration.ApplicationConfiguration createConfiguration = common.emv.configuration.ConfigurationTemplate.from(getConfigurationStream(context, bArr3, null), context.getResources().openRawResource(z4 ? my.com.softspace.reader.R.raw.ca_prod : my.com.softspace.reader.R.raw.ca)).createConfiguration(my.com.softspace.reader.internal.kernelconfig.HexUtil.byteArrayToHexString(bArr, true));
        common.emv.configuration.DataObjectList configuration = createConfiguration.getConfiguration(of);
        if (value != null && (valueAsHexString = my.com.softspace.reader.internal.kernelconfig.BerTlv.find(value, my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_9F15_MERCHANT_CATEGORY_CODE).getValueAsHexString()) != null && !valueAsHexString.isEmpty()) {
            configuration.put(java.lang.Integer.toHexString(my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_9F15_MERCHANT_CATEGORY_CODE).toUpperCase(), valueAsHexString);
        }
        if (value2 != null && my.com.softspace.reader.internal.kernelconfig.BerTlv.find(value2, my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_DF8126_READER_CVM_REQUIRED_LIMIT) != null) {
            configuration.put(java.lang.Integer.toHexString(my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_DF8126_READER_CVM_REQUIRED_LIMIT).toUpperCase(), my.com.softspace.reader.internal.kernelconfig.BerTlv.find(value2, my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_DF8126_READER_CVM_REQUIRED_LIMIT).getValueAsHexString());
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
        this.getHighResolutionOutputSizeshNQ4ISI = false;
        this.getHighSpeedVideoSizes = false;
        my.com.softspace.reader.internal.kernelconfig.BerTlv find = my.com.softspace.reader.internal.kernelconfig.BerTlv.find(eftpos.util.BerTlvEncoder.encode(configuration), my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_DF8124_READER_CONTACTLESS_TRANS_LIMIT_NO_ON_DEVICE_CVM);
        if (find != null) {
            long parseLong = java.lang.Long.parseLong(find.getValueAsHexString());
            if (parseLong > 0 && java.lang.Long.parseLong(str) >= parseLong) {
                this.getOutputFormats.e("JCBKernelHandler", "amount larger than transaction limit");
                throw new java.lang.IllegalArgumentException();
            }
        }
        jcb.JCBKernelJNI.setup(this.getHighSpeedVideoFpsRangesFor, jcb.util.BerTlvEncoder.encode(configuration), jcb.util.BerTlvEncoder.encode(createConfiguration.getCa(), "E1", "E2"));
        java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(new java.util.concurrent.Callable() { // from class: my.com.softspace.reader.internal.kernel.jcb.JCBKernelHandler$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                common.emv.kernel.TransactionOutcome decode;
                my.com.softspace.reader.internal.kernel.jcb.JCBKernelHandler jCBKernelHandler = my.com.softspace.reader.internal.kernel.jcb.JCBKernelHandler.this;
                decode = jcb.util.TransactionOutcomeDecoder.decode(new common.emv.kernel.TransactionRequest(amountAuth), jcb.JCBKernelJNI.start(jCBKernelHandler.getHighSpeedVideoFpsRangesFor, bArr, bArr2, encode, new jcb.JCBKernelCallback() { // from class: my.com.softspace.reader.internal.kernel.jcb.JCBKernelHandler.1
                    @Override // jcb.JCBKernelCallback
                    public byte[] exchange(byte[] bArr4) throws java.io.IOException {
                        byte[] exchangeAPDU = r2.exchangeAPDU(bArr4);
                        my.com.softspace.reader.internal.kernel.jcb.JCBKernelHandler.this.getOutputMinFrameDuration = exchangeAPDU != null;
                        if (my.com.softspace.reader.internal.kernel.jcb.JCBKernelHandler.getHighSpeedVideoFpsRanges(bArr4)) {
                            my.com.softspace.reader.internal.kernel.jcb.JCBKernelHandler.this.getHighResolutionOutputSizeshNQ4ISI = exchangeAPDU == null || exchangeAPDU.length <= 0;
                            my.com.softspace.reader.internal.kernel.jcb.JCBKernelHandler.this.getHighSpeedVideoSizes = my.com.softspace.reader.internal.kernel.jcb.JCBKernelHandler.getHighResolutionOutputSizeshNQ4ISI(exchangeAPDU);
                        }
                        return exchangeAPDU;
                    }

                    @Override // jcb.JCBKernelCallback
                    public int updateUI(int i2) {
                        my.com.softspace.reader.internal.kernel.jcb.JCBKernelHandler.this.getOutputFormats.d("JCBKernelHandler", "updateUI ".concat(java.lang.String.valueOf(i2)));
                        if (!my.com.softspace.reader.internal.kernel.jcb.JCBKernelHandler.this.getOutputMinFrameDuration) {
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
            transactionOutcome = (common.emv.kernel.TransactionOutcome) futureTask.get(i, java.util.concurrent.TimeUnit.MILLISECONDS);
            my.com.softspace.reader.ILogger iLogger = this.getOutputFormats;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Outcome: ");
            sb.append(transactionOutcome.getOutcome());
            iLogger.d("JCBKernelHandler", sb.toString());
            if (transactionOutcome.getUiReqOnOutcome() != null && transactionOutcome.getUiReqOnOutcome().getMessage() != null) {
                my.com.softspace.reader.ILogger iLogger2 = this.getOutputFormats;
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("getUiReqOnOutcome Message: ");
                sb2.append(transactionOutcome.getUiReqOnOutcome().getMessage());
                iLogger2.d("JCBKernelHandler", sb2.toString());
            }
            mapCVM = mapCVM(transactionOutcome);
            my.com.softspace.reader.ILogger iLogger3 = this.getOutputFormats;
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("CVM Code: ");
            sb3.append(mapCVM);
            iLogger3.d("JCBKernelHandler", sb3.toString());
            if (transactionOutcome.getOutcome() != common.emv.kernel.TransactionOutcome.Outcome.OnlineRequest && (of != common.emv.kernel.TransactionData.TransactionType.Refund || transactionOutcome.getOutcome() != common.emv.kernel.TransactionOutcome.Outcome.Declined)) {
                int mapOutcome = mapOutcome(transactionOutcome);
                if (this.getHighSpeedVideoSizes) {
                    mapOutcome = 7502;
                }
                if (this.getHighResolutionOutputSizeshNQ4ISI) {
                    return 7501;
                }
                return mapOutcome;
            }
            str2 = "JCBKernelHandler";
        } catch (java.lang.Exception e) {
            e = e;
            str2 = "JCBKernelHandler";
        }
        try {
            return my.com.softspace.reader.SSKernelJNI.onlineProcessing(str, bArr, transactionOutcome.getDataRecord(), mapCVM, z, z2);
        } catch (java.lang.Exception e2) {
            e = e2;
            this.getOutputFormats.e(str2, "exception", e);
            return 7055;
        }
    }

    static /* bridge */ /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI(byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            return false;
        }
        int length = bArr.length;
        return bArr[length + (-2)] == 111 && bArr[length - 1] == 0;
    }

    static /* bridge */ /* synthetic */ boolean getHighSpeedVideoFpsRanges(byte[] bArr) {
        return bArr != null && bArr.length >= 2 && bArr[0] == Byte.MIN_VALUE && bArr[1] == -88;
    }
}
