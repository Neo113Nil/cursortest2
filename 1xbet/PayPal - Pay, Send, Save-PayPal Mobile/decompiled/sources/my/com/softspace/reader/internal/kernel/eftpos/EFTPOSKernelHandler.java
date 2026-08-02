package my.com.softspace.reader.internal.kernel.eftpos;

/* loaded from: classes17.dex */
public class EFTPOSKernelHandler implements my.com.softspace.reader.internal.kernel.SSKernelHandler {
    private static final my.com.softspace.reader.internal.kernel.eftpos.EFTPOSKernelHandler getHighSpeedVideoFpsRanges = new my.com.softspace.reader.internal.kernel.eftpos.EFTPOSKernelHandler();
    private final java.lang.String getHighSpeedVideoSizes = "EFTPOSKernelHandler";
    private boolean getHighResolutionOutputSizeshNQ4ISI = false;
    private boolean getOutputFormats = false;
    private final java.util.List<java.lang.String> getInputFormats = new java.util.ArrayList(java.util.Arrays.asList(my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_AID_EFTPOS_A00000038410, my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_AID_EFTPOS_A00000038420));
    private final long getHighSpeedVideoFpsRangesFor = eftpos.EFTPOSKernelJNI.newContext();
    private final my.com.softspace.reader.ILogger Camera2StreamConfigurationMap = my.com.softspace.reader.TEEReaderEngine.getInstance().getLogger();

    public static my.com.softspace.reader.internal.kernel.eftpos.EFTPOSKernelHandler getInstance() {
        return getHighSpeedVideoFpsRanges;
    }

    @Override // my.com.softspace.reader.internal.kernel.SSKernelHandler
    public int initKernel(android.content.Context context, java.lang.String str, int i, final byte[] bArr, final byte[] bArr2, byte[] bArr3, final my.com.softspace.reader.internal.kernel.Kernel.Callback callback, boolean z, boolean z2, boolean z3, boolean z4) {
        java.lang.String valueAsHexString;
        this.Camera2StreamConfigurationMap.d("EFTPOSKernelHandler", "initKernel");
        this.getHighResolutionOutputSizeshNQ4ISI = false;
        byte[] value = my.com.softspace.reader.internal.kernelconfig.BerTlv.find(bArr3, 224).getValue();
        byte[] value2 = my.com.softspace.reader.internal.kernelconfig.BerTlv.find(bArr3, 227).getValue();
        java.lang.String valueAsHexString2 = my.com.softspace.reader.internal.kernelconfig.BerTlv.find(value2, my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_9F03_AMOUNT_OTHER_NUM).getValueAsHexString();
        common.emv.kernel.TransactionData.TransactionType of = common.emv.kernel.TransactionData.TransactionType.of(my.com.softspace.reader.internal.kernelconfig.BerTlv.find(value2, 156).getValueAsHexString());
        final common.emv.kernel.TransactionData amountAuth = new common.emv.kernel.TransactionData().setAmountAuth(java.lang.Long.parseLong(str));
        amountAuth.setAmountOther(java.lang.Long.parseLong(valueAsHexString2));
        amountAuth.setTransactionType(of);
        final byte[] encode = eftpos.util.BerTlvEncoder.encode(amountAuth.getData());
        my.com.softspace.reader.ILogger iLogger = this.Camera2StreamConfigurationMap;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("transaction data: ");
        sb.append(common.emv.util.HexUtil.encodeToString(encode));
        iLogger.d("EFTPOSKernelHandler", sb.toString());
        common.emv.configuration.ConfigurationTemplate from = common.emv.configuration.ConfigurationTemplate.from(getConfigurationStream(context, bArr3, null), context.getResources().openRawResource(z4 ? my.com.softspace.reader.R.raw.ca_prod : my.com.softspace.reader.R.raw.ca));
        java.lang.String orElse = this.getInputFormats.stream().filter(new java.util.function.Predicate() { // from class: my.com.softspace.reader.internal.kernel.eftpos.EFTPOSKernelHandler$$ExternalSyntheticLambda0
            @Override // java.util.function.Predicate
            public final boolean test(java.lang.Object obj) {
                boolean startsWith;
                startsWith = common.emv.util.HexUtil.encodeToString(bArr).startsWith((java.lang.String) obj);
                return startsWith;
            }
        }).findFirst().orElse(common.emv.util.HexUtil.encodeToString(bArr));
        my.com.softspace.reader.ILogger iLogger2 = this.Camera2StreamConfigurationMap;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("AID: ");
        sb2.append(common.emv.util.HexUtil.encodeToString(bArr));
        iLogger2.d("EFTPOSKernelHandler", sb2.toString());
        this.Camera2StreamConfigurationMap.d("EFTPOSKernelHandler", "Matched AID: ".concat(java.lang.String.valueOf(orElse)));
        common.emv.configuration.ApplicationConfiguration createConfiguration = from.createConfiguration(orElse);
        common.emv.configuration.DataObjectList configuration = createConfiguration.getConfiguration(of);
        if (value != null && (valueAsHexString = my.com.softspace.reader.internal.kernelconfig.BerTlv.find(value, my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_9F15_MERCHANT_CATEGORY_CODE).getValueAsHexString()) != null && !valueAsHexString.isEmpty()) {
            configuration.put(java.lang.Integer.toHexString(my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_9F15_MERCHANT_CATEGORY_CODE).toUpperCase(), valueAsHexString);
        }
        if (value2 != null) {
            if (my.com.softspace.reader.internal.kernelconfig.BerTlv.find(value2, my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_9F1A_TERMINAL_COUNTRY_CODE) != null) {
                configuration.put(java.lang.Integer.toHexString(my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_9F1A_TERMINAL_COUNTRY_CODE).toUpperCase(), my.com.softspace.reader.internal.kernelconfig.BerTlv.find(value2, my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_9F1A_TERMINAL_COUNTRY_CODE).getValueAsHexString());
            }
            if (my.com.softspace.reader.internal.kernelconfig.BerTlv.find(value2, my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_5F2A_TRANSACTION_CURR_CODE) != null) {
                configuration.put(java.lang.Integer.toHexString(my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_5F2A_TRANSACTION_CURR_CODE).toUpperCase(), my.com.softspace.reader.internal.kernelconfig.BerTlv.find(value2, my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_5F2A_TRANSACTION_CURR_CODE).getValueAsHexString());
            }
            if (my.com.softspace.reader.internal.kernelconfig.BerTlv.find(value2, my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_5F36_TRANSACTION_CURR_EXP) != null) {
                configuration.put(java.lang.Integer.toHexString(my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_5F36_TRANSACTION_CURR_EXP).toUpperCase(), my.com.softspace.reader.internal.kernelconfig.BerTlv.find(value2, my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_5F36_TRANSACTION_CURR_EXP).getValueAsHexString());
            }
        }
        my.com.softspace.reader.ILogger iLogger3 = this.Camera2StreamConfigurationMap;
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("config: ");
        sb3.append(configuration.toString());
        iLogger3.d("EFTPOSKernelHandler", sb3.toString());
        my.com.softspace.reader.ILogger iLogger4 = this.Camera2StreamConfigurationMap;
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("ca: ");
        sb4.append(createConfiguration.getCa().toString());
        iLogger4.d("EFTPOSKernelHandler", sb4.toString());
        my.com.softspace.reader.internal.kernelconfig.BerTlv find = my.com.softspace.reader.internal.kernelconfig.BerTlv.find(eftpos.util.BerTlvEncoder.encode(configuration), my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_DF8124_READER_CONTACTLESS_TRANS_LIMIT_NO_ON_DEVICE_CVM);
        if (find != null) {
            long parseLong = java.lang.Long.parseLong(find.getValueAsHexString());
            if (parseLong > 0 && java.lang.Long.parseLong(str) > parseLong) {
                this.Camera2StreamConfigurationMap.e("EFTPOSKernelHandler", "amount larger than transaction limit");
                throw new java.lang.IllegalArgumentException();
            }
        }
        eftpos.EFTPOSKernelJNI.setup(this.getHighSpeedVideoFpsRangesFor, eftpos.util.BerTlvEncoder.encode(configuration), eftpos.util.BerTlvEncoder.encode(createConfiguration.getCa(), "E1", "E2"));
        java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(new java.util.concurrent.Callable() { // from class: my.com.softspace.reader.internal.kernel.eftpos.EFTPOSKernelHandler$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return my.com.softspace.reader.internal.kernel.eftpos.EFTPOSKernelHandler.$r8$lambda$XrIQlNQgWGhxnF7ZcI6guRZJbr4(my.com.softspace.reader.internal.kernel.eftpos.EFTPOSKernelHandler.this, bArr, bArr2, encode, callback, amountAuth);
            }
        });
        futureTask.run();
        try {
            common.emv.kernel.TransactionOutcome transactionOutcome = (common.emv.kernel.TransactionOutcome) futureTask.get(i, java.util.concurrent.TimeUnit.MILLISECONDS);
            my.com.softspace.reader.ILogger iLogger5 = this.Camera2StreamConfigurationMap;
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder("Outcome: ");
            sb5.append(transactionOutcome.getOutcome());
            iLogger5.d("EFTPOSKernelHandler", sb5.toString());
            if (transactionOutcome.getUiReqOnOutcome() != null && transactionOutcome.getUiReqOnOutcome().getMessage() != null) {
                my.com.softspace.reader.ILogger iLogger6 = this.Camera2StreamConfigurationMap;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getUiReqOnOutcome Message: ");
                sb6.append(transactionOutcome.getUiReqOnOutcome().getMessage());
                iLogger6.d("EFTPOSKernelHandler", sb6.toString());
            }
            int mapCVM = mapCVM(transactionOutcome);
            my.com.softspace.reader.ILogger iLogger7 = this.Camera2StreamConfigurationMap;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("CVM Code: ");
            sb7.append(mapCVM);
            iLogger7.d("EFTPOSKernelHandler", sb7.toString());
            if (transactionOutcome.getOutcome() != common.emv.kernel.TransactionOutcome.Outcome.OnlineRequest && of != common.emv.kernel.TransactionData.TransactionType.Refund && !this.getHighResolutionOutputSizeshNQ4ISI) {
                return mapOutcome(transactionOutcome);
            }
            this.getHighResolutionOutputSizeshNQ4ISI = false;
            byte[] byteArray = my.com.softspace.reader.internal.kernelconfig.BerTlv.create(new my.com.softspace.reader.internal.kernelconfig.Tag(57129), z3 ? new byte[]{1} : new byte[]{0}).toByteArray();
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(transactionOutcome.getDataRecord().length + byteArray.length);
            allocate.put(transactionOutcome.getDataRecord());
            allocate.put(byteArray);
            return my.com.softspace.reader.SSKernelJNI.onlineProcessing(str, bArr, allocate.array(), mapCVM, z, z2);
        } catch (java.lang.Exception e) {
            this.Camera2StreamConfigurationMap.e("EFTPOSKernelHandler", "exception", e);
            return 7055;
        }
    }

    public static /* synthetic */ common.emv.kernel.TransactionOutcome $r8$lambda$XrIQlNQgWGhxnF7ZcI6guRZJbr4(my.com.softspace.reader.internal.kernel.eftpos.EFTPOSKernelHandler eFTPOSKernelHandler, byte[] bArr, byte[] bArr2, byte[] bArr3, final my.com.softspace.reader.internal.kernel.Kernel.Callback callback, common.emv.kernel.TransactionData transactionData) {
        eFTPOSKernelHandler.Camera2StreamConfigurationMap.d("EFTPOSKernelHandler", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START);
        return eftpos.util.TransactionOutcomeDecoder.decode(new common.emv.kernel.TransactionRequest(transactionData), eftpos.EFTPOSKernelJNI.start(eFTPOSKernelHandler.getHighSpeedVideoFpsRangesFor, bArr, bArr2, bArr3, new eftpos.EFTPOSKernelCallback() { // from class: my.com.softspace.reader.internal.kernel.eftpos.EFTPOSKernelHandler.1
            @Override // eftpos.EFTPOSKernelCallback
            public int requestPINEntry(byte[] bArr4, byte[] bArr5) {
                return 4;
            }

            @Override // eftpos.EFTPOSKernelCallback
            public byte[] exchange(byte[] bArr4) throws java.io.IOException {
                byte[] exchangeAPDU = callback.exchangeAPDU(bArr4);
                my.com.softspace.reader.internal.kernel.eftpos.EFTPOSKernelHandler.this.getOutputFormats = exchangeAPDU != null;
                return exchangeAPDU;
            }

            @Override // eftpos.EFTPOSKernelCallback
            public int updateUI(int i) {
                my.com.softspace.reader.internal.kernel.eftpos.EFTPOSKernelHandler.this.Camera2StreamConfigurationMap.d("EFTPOSKernelHandler", "updateUI ".concat(java.lang.String.valueOf(i)));
                if (!my.com.softspace.reader.internal.kernel.eftpos.EFTPOSKernelHandler.this.getOutputFormats) {
                    return 0;
                }
                callback.updateUI(i);
                return 0;
            }

            @Override // eftpos.EFTPOSKernelCallback
            public byte[] requestGoOnline(byte[] bArr4) {
                my.com.softspace.reader.ILogger iLogger = my.com.softspace.reader.internal.kernel.eftpos.EFTPOSKernelHandler.this.Camera2StreamConfigurationMap;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("requestGoOnline: ");
                sb.append(common.emv.util.HexUtil.encodeToString(bArr4));
                iLogger.d("EFTPOSKernelHandler", sb.toString());
                my.com.softspace.reader.internal.kernel.eftpos.EFTPOSKernelHandler.this.getHighResolutionOutputSizeshNQ4ISI = true;
                return common.emv.util.HexUtil.decode("8A023030");
            }
        }));
    }
}
