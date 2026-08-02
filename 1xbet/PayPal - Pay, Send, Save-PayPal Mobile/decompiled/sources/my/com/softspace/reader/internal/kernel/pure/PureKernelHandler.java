package my.com.softspace.reader.internal.kernel.pure;

/* loaded from: classes17.dex */
public class PureKernelHandler implements my.com.softspace.reader.internal.kernel.SSKernelHandler {
    private static final my.com.softspace.reader.internal.kernel.pure.PureKernelHandler getHighSpeedVideoSizes = new my.com.softspace.reader.internal.kernel.pure.PureKernelHandler();
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String getHighSpeedVideoFpsRanges = "PureKernelHandler";
    private final long getHighSpeedVideoFpsRangesFor = pure.PureKernelJNI.newContext();
    private final my.com.softspace.reader.ILogger Camera2StreamConfigurationMap = my.com.softspace.reader.TEEReaderEngine.getInstance().getLogger();

    public static my.com.softspace.reader.internal.kernel.pure.PureKernelHandler getInstance() {
        return getHighSpeedVideoSizes;
    }

    @Override // my.com.softspace.reader.internal.kernel.SSKernelHandler
    public int initKernel(android.content.Context context, java.lang.String str, int i, final byte[] bArr, final byte[] bArr2, byte[] bArr3, final my.com.softspace.reader.internal.kernel.Kernel.Callback callback, boolean z, boolean z2, boolean z3, boolean z4) {
        java.lang.String valueAsHexString;
        my.com.softspace.reader.ILogger iLogger = this.Camera2StreamConfigurationMap;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("initKernel: ");
        sb.append(common.emv.util.HexUtil.encodeToString(bArr));
        iLogger.d("PureKernelHandler", sb.toString());
        byte[] value = my.com.softspace.reader.internal.kernelconfig.BerTlv.find(bArr3, 224).getValue();
        byte[] value2 = my.com.softspace.reader.internal.kernelconfig.BerTlv.find(bArr3, 225).getValue();
        byte[] value3 = my.com.softspace.reader.internal.kernelconfig.BerTlv.find(bArr3, 227).getValue();
        java.lang.String valueAsHexString2 = my.com.softspace.reader.internal.kernelconfig.BerTlv.find(value3, my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_9F03_AMOUNT_OTHER_NUM).getValueAsHexString();
        common.emv.kernel.TransactionData.TransactionType of = common.emv.kernel.TransactionData.TransactionType.of(my.com.softspace.reader.internal.kernelconfig.BerTlv.find(value3, 156).getValueAsHexString());
        final common.emv.kernel.TransactionData amountAuth = new common.emv.kernel.TransactionData().setAmountAuth(java.lang.Long.parseLong(str));
        amountAuth.setAmountOther(java.lang.Long.parseLong(valueAsHexString2));
        amountAuth.setTransactionType(of);
        final byte[] encode = pure.util.BerTlvEncoder.encode(amountAuth.getData());
        my.com.softspace.reader.ILogger iLogger2 = this.Camera2StreamConfigurationMap;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("transaction data: ");
        sb2.append(common.emv.util.HexUtil.encodeToString(encode));
        iLogger2.d("PureKernelHandler", sb2.toString());
        java.lang.String str2 = null;
        common.emv.configuration.ConfigurationTemplate from = common.emv.configuration.ConfigurationTemplate.from(getConfigurationStream(context, bArr3, null), context.getResources().openRawResource(z4 ? my.com.softspace.reader.R.raw.ca_prod : my.com.softspace.reader.R.raw.ca));
        java.lang.String encodeToString = common.emv.util.HexUtil.encodeToString(bArr);
        for (java.lang.String str3 : from.supportedAIDSet()) {
            if (encodeToString.startsWith(str3)) {
                this.Camera2StreamConfigurationMap.d("PureKernelHandler", "Matched AID: ".concat(java.lang.String.valueOf(str3)));
                str2 = str3;
            }
        }
        if (str2 == null) {
            str2 = common.emv.util.HexUtil.encodeToString(bArr);
        }
        common.emv.configuration.ApplicationConfiguration createConfiguration = from.createConfiguration(str2);
        common.emv.configuration.DataObjectList configuration = createConfiguration.getConfiguration(of);
        final byte b = java.lang.Long.parseLong(str) >= java.lang.Long.parseLong(my.com.softspace.reader.internal.kernelconfig.BerTlv.find(value2, my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_DF8126_READER_CVM_REQUIRED_LIMIT).getValueAsHexString()) ? org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE : (byte) 36;
        my.com.softspace.reader.ILogger iLogger3 = this.Camera2StreamConfigurationMap;
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("preprocessor: ");
        sb3.append(java.lang.Integer.toHexString(b));
        iLogger3.d("PureKernelHandler", sb3.toString());
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
        pure.PureKernelJNI.setup(this.getHighSpeedVideoFpsRangesFor, pure.util.BerTlvEncoder.encode(configuration), pure.util.BerTlvEncoder.encode(createConfiguration.getCa(), "E1", "E2"));
        java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(new java.util.concurrent.Callable() { // from class: my.com.softspace.reader.internal.kernel.pure.PureKernelHandler$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return my.com.softspace.reader.internal.kernel.pure.PureKernelHandler.$r8$lambda$0DEkMief3bqTgtrsjhb_ILVjK2Q(my.com.softspace.reader.internal.kernel.pure.PureKernelHandler.this, bArr, bArr2, b, encode, callback, amountAuth);
            }
        });
        futureTask.run();
        try {
            common.emv.kernel.TransactionOutcome transactionOutcome = (common.emv.kernel.TransactionOutcome) futureTask.get(i, java.util.concurrent.TimeUnit.MILLISECONDS);
            my.com.softspace.reader.ILogger iLogger4 = this.Camera2StreamConfigurationMap;
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append("Outcome: ");
            sb4.append(transactionOutcome.getOutcome());
            iLogger4.d("PureKernelHandler", sb4.toString());
            if (transactionOutcome.getUiReqOnOutcome() != null && transactionOutcome.getUiReqOnOutcome().getMessage() != null) {
                my.com.softspace.reader.ILogger iLogger5 = this.Camera2StreamConfigurationMap;
                java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                sb5.append("getUiReqOnOutcome Message: ");
                sb5.append(transactionOutcome.getUiReqOnOutcome().getMessage());
                iLogger5.d("PureKernelHandler", sb5.toString());
            }
            if (transactionOutcome.getDataRecord() != null && transactionOutcome.getDataRecord().length > 0) {
                my.com.softspace.reader.ILogger iLogger6 = this.Camera2StreamConfigurationMap;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append("DataRecord: ");
                sb6.append(common.emv.util.HexUtil.encodeToString(transactionOutcome.getDataRecord()));
                iLogger6.d("PureKernelHandler", sb6.toString());
            }
            int mapCVM = mapCVM(transactionOutcome);
            my.com.softspace.reader.ILogger iLogger7 = this.Camera2StreamConfigurationMap;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append("CVM Code: ");
            sb7.append(mapCVM);
            iLogger7.d("PureKernelHandler", sb7.toString());
            if (transactionOutcome.getOutcome() != common.emv.kernel.TransactionOutcome.Outcome.OnlineRequest && (of != common.emv.kernel.TransactionData.TransactionType.Refund || transactionOutcome.getOutcome() != common.emv.kernel.TransactionOutcome.Outcome.Declined)) {
                return mapOutcome(transactionOutcome);
            }
            java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(transactionOutcome.getDataRecord());
            if (common.emv.util.HexUtil.encodeToString(bArr).equals(my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_AID_NETS_A0000005410002) && my.com.softspace.reader.internal.kernelconfig.BerTlv.find(transactionOutcome.getDataRecord(), 40823) == null) {
                wrap.put(my.com.softspace.reader.internal.kernelconfig.BerTlv.create(new my.com.softspace.reader.internal.kernelconfig.Tag(40823), common.emv.util.HexUtil.decode("0100")).toByteArray());
            }
            return my.com.softspace.reader.SSKernelJNI.onlineProcessing(str, bArr, wrap.array(), mapCVM, z, z2);
        } catch (java.lang.Exception e) {
            this.Camera2StreamConfigurationMap.e("PureKernelHandler", "exception", e);
            return 7055;
        }
    }

    public static /* synthetic */ common.emv.kernel.TransactionOutcome $r8$lambda$0DEkMief3bqTgtrsjhb_ILVjK2Q(my.com.softspace.reader.internal.kernel.pure.PureKernelHandler pureKernelHandler, byte[] bArr, byte[] bArr2, byte b, byte[] bArr3, final my.com.softspace.reader.internal.kernel.Kernel.Callback callback, common.emv.kernel.TransactionData transactionData) {
        pureKernelHandler.Camera2StreamConfigurationMap.d("PureKernelHandler", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START);
        return pure.util.TransactionOutcomeDecoder.decode(new common.emv.kernel.TransactionRequest(transactionData), pure.PureKernelJNI.start(pureKernelHandler.getHighSpeedVideoFpsRangesFor, bArr, bArr2, b, bArr3, new pure.PureKernelCallback() { // from class: my.com.softspace.reader.internal.kernel.pure.PureKernelHandler.1
            @Override // pure.PureKernelCallback
            public byte[] exchange(byte[] bArr4) throws java.io.IOException {
                byte[] exchangeAPDU = callback.exchangeAPDU(bArr4);
                my.com.softspace.reader.internal.kernel.pure.PureKernelHandler.this.getHighResolutionOutputSizeshNQ4ISI = exchangeAPDU != null;
                return exchangeAPDU;
            }

            @Override // pure.PureKernelCallback
            public int updateUI(int i) {
                my.com.softspace.reader.internal.kernel.pure.PureKernelHandler.this.Camera2StreamConfigurationMap.d("PureKernelHandler", "updateUI ".concat(java.lang.String.valueOf(i)));
                if (!my.com.softspace.reader.internal.kernel.pure.PureKernelHandler.this.getHighResolutionOutputSizeshNQ4ISI) {
                    return 0;
                }
                callback.updateUI(i);
                return 0;
            }
        }));
    }
}
