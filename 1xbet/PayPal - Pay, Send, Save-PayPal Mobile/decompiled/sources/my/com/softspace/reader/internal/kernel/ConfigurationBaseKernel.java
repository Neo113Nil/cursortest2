package my.com.softspace.reader.internal.kernel;

/* loaded from: classes17.dex */
public class ConfigurationBaseKernel extends my.com.softspace.reader.internal.kernel.Kernel {
    private java.lang.Integer getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoFpsRanges;
    private boolean getHighSpeedVideoSizesFor;
    private my.com.softspace.reader.internal.kernel.Kernel.Callback getInputFormats;
    private boolean getInputSizeshNQ4ISI;
    private boolean getOutputFormats;
    private my.com.softspace.reader.internal.kernel.KernelConfigurationHelper getOutputMinFrameDuration;
    private byte[] getOutputMinFrameDurationlomOqCM;
    private byte[] getOutputSizes;
    private byte[] getOutputSizeshNQ4ISI;
    private final my.com.softspace.reader.internal.kernel.ConfigurationBaseKernel.Type getOutputStallDuration;
    private my.com.softspace.reader.internal.kernel.IKernelDelegate getOutputStallDurationlomOqCM;
    private byte[] getValidOutputFormatsForInputhNQ4ISI;
    private java.lang.Integer toString;
    private byte[] unwrapAs;
    private static final byte[] Camera2StreamConfigurationMap = {com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, 0, 0, 0, 3, 16, 16};
    private static final byte[] getHighSpeedVideoSizes = {com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, 0, 0, 0, 37, 1};
    private static java.lang.String getHighSpeedVideoFpsRangesFor = "sskernel-config";

    public enum Type {
        ProductionApp,
        L2TestApp
    }

    private ConfigurationBaseKernel(my.com.softspace.reader.internal.kernel.ConfigurationBaseKernel.Type type) {
        this.getOutputStallDuration = type;
    }

    public static my.com.softspace.reader.internal.kernel.ConfigurationBaseKernel create(my.com.softspace.reader.internal.kernel.ConfigurationBaseKernel.Type type) {
        return new my.com.softspace.reader.internal.kernel.ConfigurationBaseKernel(type);
    }

    @Override // my.com.softspace.reader.internal.kernel.Kernel
    public void init(android.content.Context context, byte[] bArr) {
        this.getHighSpeedVideoFpsRanges = bArr;
    }

    @Override // my.com.softspace.reader.internal.kernel.Kernel
    public void setDebitOptIn(boolean z) {
        this.getOutputFormats = z;
    }

    @Override // my.com.softspace.reader.internal.kernel.Kernel
    public int start(android.content.Context context, java.lang.String str, int i, boolean z, boolean z2, my.com.softspace.reader.internal.kernel.Kernel.Callback callback) {
        boolean highSpeedVideoFpsRangesFor;
        java.util.Objects.requireNonNull(context);
        java.util.Objects.requireNonNull(callback);
        try {
            my.com.softspace.reader.internal.kernel.KernelConfigurationHelper kernelConfigurationHelper = new my.com.softspace.reader.internal.kernel.KernelConfigurationHelper(this.getOutputStallDuration == my.com.softspace.reader.internal.kernel.ConfigurationBaseKernel.Type.L2TestApp, this.getHighSpeedVideoFpsRanges);
            this.getOutputMinFrameDuration = kernelConfigurationHelper;
            if (kernelConfigurationHelper.Camera2StreamConfigurationMap) {
                highSpeedVideoFpsRangesFor = kernelConfigurationHelper.getHighResolutionOutputSizeshNQ4ISI();
            } else {
                highSpeedVideoFpsRangesFor = kernelConfigurationHelper.getHighSpeedVideoFpsRangesFor();
            }
            if (!highSpeedVideoFpsRangesFor) {
                return 7052;
            }
            if (this.getOutputStallDuration == my.com.softspace.reader.internal.kernel.ConfigurationBaseKernel.Type.L2TestApp) {
                this.getInputFormats = new my.com.softspace.reader.internal.kernel.DummyHostResponseKernelCallback(callback, this.getOutputMinFrameDuration.getHighResolutionOutputSizeshNQ4ISI, this.getOutputMinFrameDuration.getHighSpeedVideoFpsRanges);
            }
            this.getInputFormats = callback;
            return getHighSpeedVideoSizes(context, str, i, z, z2, callback);
        } catch (java.io.IOException unused) {
            return 7056;
        } catch (java.lang.IllegalArgumentException | java.lang.IndexOutOfBoundsException | java.nio.BufferUnderflowException unused2) {
            return 7006;
        } catch (java.lang.NullPointerException unused3) {
            return 7052;
        }
    }

    @Override // my.com.softspace.reader.internal.kernel.Kernel
    public int preProcessing(android.content.Context context, java.lang.String str, int i, byte[] bArr, my.com.softspace.reader.internal.kernel.Kernel.Callback callback) {
        boolean highSpeedVideoFpsRangesFor;
        java.util.Objects.requireNonNull(context);
        java.util.Objects.requireNonNull(callback);
        try {
            try {
                my.com.softspace.reader.internal.kernel.KernelConfigurationHelper kernelConfigurationHelper = new my.com.softspace.reader.internal.kernel.KernelConfigurationHelper(this.getOutputStallDuration == my.com.softspace.reader.internal.kernel.ConfigurationBaseKernel.Type.L2TestApp, this.getHighSpeedVideoFpsRanges);
                this.getOutputMinFrameDuration = kernelConfigurationHelper;
                if (kernelConfigurationHelper.Camera2StreamConfigurationMap) {
                    highSpeedVideoFpsRangesFor = kernelConfigurationHelper.getHighResolutionOutputSizeshNQ4ISI();
                } else {
                    highSpeedVideoFpsRangesFor = kernelConfigurationHelper.getHighSpeedVideoFpsRangesFor();
                }
                if (!highSpeedVideoFpsRangesFor) {
                    return 7052;
                }
                if (this.getOutputStallDuration == my.com.softspace.reader.internal.kernel.ConfigurationBaseKernel.Type.L2TestApp) {
                    this.getInputFormats = new my.com.softspace.reader.internal.kernel.DummyHostResponseKernelCallback(callback, this.getOutputMinFrameDuration.getHighResolutionOutputSizeshNQ4ISI, this.getOutputMinFrameDuration.getHighSpeedVideoFpsRanges);
                }
                this.getInputFormats = callback;
                my.com.softspace.reader.internal.kernel.SSKernelDelegate sSKernelDelegate = new my.com.softspace.reader.internal.kernel.SSKernelDelegate();
                sSKernelDelegate.init(context, this.getOutputMinFrameDuration.getHighSpeedVideoFpsRanges(bArr));
                this.getOutputStallDurationlomOqCM = sSKernelDelegate;
                if (str == null) {
                    str = "";
                }
                int preProcessing = sSKernelDelegate.preProcessing(context, str, i, bArr, callback);
                my.com.softspace.reader.ILogger logger = my.com.softspace.reader.TEEReaderEngine.getInstance().getLogger();
                java.lang.String str2 = getHighSpeedVideoFpsRangesFor;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("preProcessing: Result: ");
                sb.append(preProcessing);
                logger.i(str2, sb.toString());
                return preProcessing;
            } catch (java.lang.NullPointerException unused) {
                return 7052;
            }
        } catch (java.lang.IllegalArgumentException | java.lang.IndexOutOfBoundsException | java.nio.BufferUnderflowException unused2) {
            return 7006;
        }
    }

    @Override // my.com.softspace.reader.internal.kernel.Kernel
    public void release(android.content.Context context) {
        my.com.softspace.reader.internal.kernel.IKernelDelegate iKernelDelegate = this.getOutputStallDurationlomOqCM;
        if (iKernelDelegate != null) {
            iKernelDelegate.release(context);
        }
        this.getOutputStallDurationlomOqCM = null;
    }

    private int getHighSpeedVideoSizes(android.content.Context context, java.lang.String str, int i, boolean z, boolean z2, my.com.softspace.reader.internal.kernel.Kernel.Callback callback) throws java.io.IOException {
        java.util.List<my.com.softspace.reader.internal.kernel.AIDInfo> aidInfoList;
        java.util.ArrayList<android.util.Pair> arrayList;
        my.com.softspace.reader.TEEReaderEngine.getInstance().getLogger().i(getHighSpeedVideoFpsRangesFor, "[process] start, amount: ".concat(java.lang.String.valueOf(str)));
        boolean z3 = false;
        try {
            this.getHighSpeedVideoSizesFor = false;
            boolean z4 = true;
            this.getInputSizeshNQ4ISI = true;
            this.getValidOutputFormatsForInputhNQ4ISI = null;
            byte[] exchangeAPDU = callback.exchangeAPDU(select(PAYLOAD_PPSE));
            this.getValidOutputFormatsForInputhNQ4ISI = exchangeAPDU;
            if (exchangeAPDU == null) {
                my.com.softspace.reader.TEEReaderEngine.getInstance().getLogger().i(getHighSpeedVideoFpsRangesFor, "[selectFromPPSE] null rapdu, probably lost tags");
                throw new java.io.IOException();
            }
            if (!sw9000(exchangeAPDU)) {
                my.com.softspace.reader.TEEReaderEngine.getInstance().getLogger().i(getHighSpeedVideoFpsRangesFor, "[selectFromPPSE] PPSE fail. fallback to select one by one");
                aidInfoList = null;
            } else {
                aidInfoList = aidInfoList(dropLast2(this.getValidOutputFormatsForInputhNQ4ISI), PAYLOAD_PPSE);
            }
            if (aidInfoList == null || aidInfoList.size() == 0) {
                throw new java.lang.IllegalStateException();
            }
            int i2 = 5;
            if (aidInfoList == null || aidInfoList.size() == 0) {
                my.com.softspace.reader.TEEReaderEngine.getInstance().getLogger().i(getHighSpeedVideoFpsRangesFor, "[buildCandidateList] fail. ");
                arrayList = null;
            } else {
                my.com.softspace.reader.internal.kernel.AIDInfo[] aIDInfoArr = (my.com.softspace.reader.internal.kernel.AIDInfo[]) aidInfoList.toArray(new my.com.softspace.reader.internal.kernel.AIDInfo[0]);
                java.util.Arrays.sort(aIDInfoArr);
                java.util.List<my.com.softspace.reader.internal.kernel.AIDInfo> asList = java.util.Arrays.asList(aIDInfoArr);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                my.com.softspace.reader.internal.kernelconfig.BerTlv nullableBerTlvFind = nullableBerTlvFind(nullableBerTlvFind(this.getOutputMinFrameDuration.getHighSpeedVideoSizes, 224).getValue(), my.com.softspace.reader.internal.kernelconfig.EmvTags.DTCustom.TAG_DF7F_TERMINAL_PURE_AID_PRIORITY);
                boolean z5 = false;
                boolean z6 = false;
                boolean z7 = false;
                for (my.com.softspace.reader.internal.kernel.AIDInfo aIDInfo : asList) {
                    java.lang.String upperCase = my.com.softspace.reader.internal.kernelconfig.HexUtil.byteArrayToHexString(aIDInfo.getAid(), z4).toUpperCase();
                    java.lang.String hexStringToAscii = (aIDInfo.getName() == null || aIDInfo.getName().length <= 0) ? null : my.com.softspace.reader.internal.kernelconfig.HexUtil.hexStringToAscii(my.com.softspace.reader.internal.kernelconfig.HexUtil.byteArrayToHexString(aIDInfo.getName(), z4));
                    this.getHighSpeedVideoSizesFor = (this.getHighSpeedVideoSizesFor || (hexStringToAscii != null && (hexStringToAscii.toLowerCase().contains("debit") || hexStringToAscii.toLowerCase().contains("fime")))) ? true : z3;
                    my.com.softspace.reader.internal.kernel.ApplicationConfiguration highSpeedVideoFpsRangesFor = this.getOutputMinFrameDuration.getHighSpeedVideoFpsRangesFor(upperCase);
                    if (highSpeedVideoFpsRangesFor != null) {
                        if (nullableBerTlvFind != null) {
                            byte[] value = nullableBerTlvFind.getValue();
                            byte[] copyOf = java.util.Arrays.copyOf(aIDInfo.getAid(), aIDInfo.getAid().length);
                            if (value.length < copyOf.length) {
                                copyOf = java.util.Arrays.copyOf(copyOf, value.length);
                            }
                            if (!java.util.Arrays.equals(copyOf, value)) {
                            }
                        }
                        my.com.softspace.reader.internal.kernel.PaymentNetwork paymentNetwork = my.com.softspace.reader.internal.kernel.PaymentNetwork.get(my.com.softspace.reader.internal.kernelconfig.HexUtil.byteArrayToHexString(aIDInfo.getAid().length < 5 ? new byte[0] : java.util.Arrays.copyOfRange(aIDInfo.getAid(), 0, 5), true));
                        z5 = z5 || paymentNetwork == my.com.softspace.reader.internal.kernel.PaymentNetwork.MCCS || paymentNetwork == my.com.softspace.reader.internal.kernel.PaymentNetwork.VCCS || paymentNetwork == my.com.softspace.reader.internal.kernel.PaymentNetwork.MADA || paymentNetwork == my.com.softspace.reader.internal.kernel.PaymentNetwork.NETS;
                        z7 = z7 || paymentNetwork == my.com.softspace.reader.internal.kernel.PaymentNetwork.EFTPOS;
                        z6 = paymentNetwork == my.com.softspace.reader.internal.kernel.PaymentNetwork.NETS;
                        this.getInputSizeshNQ4ISI = this.getInputSizeshNQ4ISI && paymentNetwork == my.com.softspace.reader.internal.kernel.PaymentNetwork.EFTPOS;
                        arrayList2.add(android.util.Pair.create(aIDInfo, highSpeedVideoFpsRangesFor));
                    }
                    z3 = false;
                    z4 = true;
                }
                if (z5 && this.getOutputFormats) {
                    java.util.Collections.sort(arrayList2, new java.util.Comparator<android.util.Pair<my.com.softspace.reader.internal.kernel.AIDInfo, my.com.softspace.reader.internal.kernel.ApplicationConfiguration>>() { // from class: my.com.softspace.reader.internal.kernel.ConfigurationBaseKernel.1
                        @Override // java.util.Comparator
                        public /* synthetic */ int compare(android.util.Pair<my.com.softspace.reader.internal.kernel.AIDInfo, my.com.softspace.reader.internal.kernel.ApplicationConfiguration> pair, android.util.Pair<my.com.softspace.reader.internal.kernel.AIDInfo, my.com.softspace.reader.internal.kernel.ApplicationConfiguration> pair2) {
                            android.util.Pair<my.com.softspace.reader.internal.kernel.AIDInfo, my.com.softspace.reader.internal.kernel.ApplicationConfiguration> pair3 = pair;
                            my.com.softspace.reader.internal.kernel.PaymentNetwork paymentNetwork2 = my.com.softspace.reader.internal.kernel.PaymentNetwork.get(my.com.softspace.reader.internal.kernelconfig.HexUtil.byteArrayToHexString(((my.com.softspace.reader.internal.kernel.AIDInfo) pair3.first).getAid().length < 5 ? new byte[0] : java.util.Arrays.copyOfRange(((my.com.softspace.reader.internal.kernel.AIDInfo) pair3.first).getAid(), 0, 5), true));
                            return (paymentNetwork2 == my.com.softspace.reader.internal.kernel.PaymentNetwork.MCCS || paymentNetwork2 == my.com.softspace.reader.internal.kernel.PaymentNetwork.VCCS || paymentNetwork2 == my.com.softspace.reader.internal.kernel.PaymentNetwork.MADA) ? -1 : 1;
                        }
                    });
                }
                if (z6 && this.getOutputFormats) {
                    java.util.Collections.sort(arrayList2, new java.util.Comparator<android.util.Pair<my.com.softspace.reader.internal.kernel.AIDInfo, my.com.softspace.reader.internal.kernel.ApplicationConfiguration>>() { // from class: my.com.softspace.reader.internal.kernel.ConfigurationBaseKernel.2
                        @Override // java.util.Comparator
                        public /* synthetic */ int compare(android.util.Pair<my.com.softspace.reader.internal.kernel.AIDInfo, my.com.softspace.reader.internal.kernel.ApplicationConfiguration> pair, android.util.Pair<my.com.softspace.reader.internal.kernel.AIDInfo, my.com.softspace.reader.internal.kernel.ApplicationConfiguration> pair2) {
                            android.util.Pair<my.com.softspace.reader.internal.kernel.AIDInfo, my.com.softspace.reader.internal.kernel.ApplicationConfiguration> pair3 = pair;
                            return (my.com.softspace.reader.internal.kernel.PaymentNetwork.get(my.com.softspace.reader.internal.kernelconfig.HexUtil.byteArrayToHexString(((my.com.softspace.reader.internal.kernel.AIDInfo) pair3.first).getAid().length < 5 ? new byte[0] : java.util.Arrays.copyOfRange(((my.com.softspace.reader.internal.kernel.AIDInfo) pair3.first).getAid(), 0, 5), true)) != my.com.softspace.reader.internal.kernel.PaymentNetwork.NETS || java.lang.Integer.parseInt(my.com.softspace.reader.internal.kernelconfig.HexUtil.byteArrayToHexString(((my.com.softspace.reader.internal.kernel.AIDInfo) pair3.first).getPriority(), true)) <= java.lang.Integer.parseInt(my.com.softspace.reader.internal.kernelconfig.HexUtil.byteArrayToHexString(((my.com.softspace.reader.internal.kernel.AIDInfo) pair2.first).getPriority(), true))) ? 1 : -1;
                        }
                    });
                }
                if (z7 && this.getHighSpeedVideoSizesFor && this.getOutputFormats) {
                    java.util.Collections.sort(arrayList2, new java.util.Comparator<android.util.Pair<my.com.softspace.reader.internal.kernel.AIDInfo, my.com.softspace.reader.internal.kernel.ApplicationConfiguration>>() { // from class: my.com.softspace.reader.internal.kernel.ConfigurationBaseKernel.3
                        @Override // java.util.Comparator
                        public /* synthetic */ int compare(android.util.Pair<my.com.softspace.reader.internal.kernel.AIDInfo, my.com.softspace.reader.internal.kernel.ApplicationConfiguration> pair, android.util.Pair<my.com.softspace.reader.internal.kernel.AIDInfo, my.com.softspace.reader.internal.kernel.ApplicationConfiguration> pair2) {
                            android.util.Pair<my.com.softspace.reader.internal.kernel.AIDInfo, my.com.softspace.reader.internal.kernel.ApplicationConfiguration> pair3 = pair;
                            android.util.Pair<my.com.softspace.reader.internal.kernel.AIDInfo, my.com.softspace.reader.internal.kernel.ApplicationConfiguration> pair4 = pair2;
                            my.com.softspace.reader.internal.kernel.PaymentNetwork paymentNetwork2 = my.com.softspace.reader.internal.kernel.PaymentNetwork.get(my.com.softspace.reader.internal.kernelconfig.HexUtil.byteArrayToHexString(((my.com.softspace.reader.internal.kernel.AIDInfo) pair3.first).getAid().length < 5 ? new byte[0] : java.util.Arrays.copyOfRange(((my.com.softspace.reader.internal.kernel.AIDInfo) pair3.first).getAid(), 0, 5), true));
                            if (paymentNetwork2 == my.com.softspace.reader.internal.kernel.PaymentNetwork.get(my.com.softspace.reader.internal.kernelconfig.HexUtil.byteArrayToHexString(((my.com.softspace.reader.internal.kernel.AIDInfo) pair4.first).getAid().length < 5 ? new byte[0] : java.util.Arrays.copyOfRange(((my.com.softspace.reader.internal.kernel.AIDInfo) pair4.first).getAid(), 0, 5), true))) {
                                return 0;
                            }
                            return paymentNetwork2 == my.com.softspace.reader.internal.kernel.PaymentNetwork.EFTPOS ? -1 : 1;
                        }
                    });
                }
                arrayList = arrayList2;
            }
            if (arrayList == null || arrayList.size() == 0) {
                my.com.softspace.reader.TEEReaderEngine.getInstance().getLogger().i(getHighSpeedVideoFpsRangesFor, "application not supported");
                callback.updateUI(2);
                return 7006;
            }
            if (str != null && !str.isEmpty()) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (android.util.Pair pair : arrayList) {
                    my.com.softspace.reader.internal.kernelconfig.BerTlv nullableBerTlv = nullableBerTlv(((my.com.softspace.reader.internal.kernel.ApplicationConfiguration) pair.second).Camera2StreamConfigurationMap);
                    if (nullableBerTlv != null && nullableBerTlv.getValue() != null) {
                        byte[] nullableBerTlvFindValue = nullableBerTlvFindValue(nullableBerTlv.getValue(), my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_DF00_CONTACTLESS_TRANSACTION_LIMIT_CUSTOM);
                        long longValue = nullableBerTlvFindValue != null ? java.lang.Long.valueOf(my.com.softspace.reader.internal.kernelconfig.HexUtil.byteArrayToHexString(nullableBerTlvFindValue, true)).longValue() : 0L;
                        if (longValue > 0 && java.lang.Long.parseLong(str) > longValue) {
                        }
                    }
                    arrayList3.add(pair);
                }
                arrayList = arrayList3;
            }
            if (arrayList.size() == 0) {
                my.com.softspace.reader.TEEReaderEngine.getInstance().getLogger().i(getHighSpeedVideoFpsRangesFor, "amount larger than transaction limit");
                callback.updateUI(3);
                return 7004;
            }
            java.util.Iterator it = arrayList.iterator();
            boolean z8 = true;
            int i3 = 0;
            while (z8 && it.hasNext()) {
                android.util.Pair pair2 = (android.util.Pair) it.next();
                this.getInputFormats.setReadCardError(false);
                my.com.softspace.reader.internal.kernel.AIDInfo aIDInfo2 = (my.com.softspace.reader.internal.kernel.AIDInfo) pair2.first;
                byte[] aid = aIDInfo2.getAid();
                my.com.softspace.reader.internal.kernel.PaymentNetwork.get(my.com.softspace.reader.internal.kernelconfig.HexUtil.byteArrayToHexString(aid.length < i2 ? new byte[0] : java.util.Arrays.copyOfRange(aid, 0, i2), true));
                byte[] selectResponse = aIDInfo2.getSelectResponse();
                if (!java.util.Arrays.equals(aid, this.getOutputSizes) || selectResponse == null || selectResponse.length == 0) {
                    selectResponse = callback.exchangeAPDU(select(aid));
                    if (selectResponse == null || selectResponse.length == 0) {
                        my.com.softspace.reader.TEEReaderEngine.getInstance().getLogger().i(getHighSpeedVideoFpsRangesFor, "Select AID Response Fail with null response, probably lost tags");
                        throw new java.io.IOException();
                    }
                    if (!sw9000(selectResponse)) {
                        my.com.softspace.reader.TEEReaderEngine.getInstance().getLogger().i(getHighSpeedVideoFpsRangesFor, "Select AID Response Fail");
                        if (!it.hasNext()) {
                            callback.updateUI(2);
                            return 7006;
                        }
                    } else if (!getHighSpeedVideoFpsRangesFor(dropLast2(selectResponse))) {
                        if (!it.hasNext()) {
                            callback.updateUI(2);
                            return 7006;
                        }
                    }
                    z8 = true;
                }
                this.getOutputSizes = aid;
                this.unwrapAs = java.util.Arrays.copyOf(aid, aid.length);
                my.com.softspace.reader.internal.kernel.SSKernelDelegate sSKernelDelegate = new my.com.softspace.reader.internal.kernel.SSKernelDelegate();
                sSKernelDelegate.init(context, this.getOutputMinFrameDuration.getHighSpeedVideoFpsRanges(aid));
                this.getOutputStallDurationlomOqCM = sSKernelDelegate;
                int start = this.getOutputStallDurationlomOqCM.start(context, my.com.softspace.reader.internal.kernel.KernelDelegateParam.Builder.create().setAmount(str == null ? "" : str).setTimeout(i).setAID(aid).setFCI(selectResponse).setBertlvFormat(z).setCipherData(z2).setLCR(!this.getInputSizeshNQ4ISI && this.getHighSpeedVideoSizesFor).build(), callback);
                my.com.softspace.reader.TEEReaderEngine.getInstance().getLogger().i(getHighSpeedVideoFpsRangesFor, "Start to get online data processing: Result: ".concat(java.lang.String.valueOf(start)));
                if (start == 7053) {
                    boolean hasNext = it.hasNext();
                    if (hasNext) {
                        i3 = start;
                        z8 = hasNext;
                    } else {
                        z8 = hasNext;
                        i3 = 7055;
                    }
                } else {
                    i3 = start;
                    z8 = false;
                }
                i2 = 5;
            }
            my.com.softspace.reader.internal.kernel.IKernelDelegate iKernelDelegate = this.getOutputStallDurationlomOqCM;
            if (iKernelDelegate != null && iKernelDelegate.onlineData() != null) {
                this.getOutputMinFrameDurationlomOqCM = this.getOutputStallDurationlomOqCM.onlineData();
                this.getHighResolutionOutputSizeshNQ4ISI = this.getOutputStallDurationlomOqCM.cvmType();
                this.toString = this.getOutputStallDurationlomOqCM.transactionResult();
                this.getOutputSizeshNQ4ISI = this.getOutputStallDurationlomOqCM.onlineResponseData();
            }
            release(context);
            return i3;
        } catch (java.lang.IllegalStateException unused) {
            return 7055;
        }
    }

    @Override // my.com.softspace.reader.internal.kernel.Kernel
    public java.lang.Integer getTransactionResult() {
        return this.toString;
    }

    @Override // my.com.softspace.reader.internal.kernel.Kernel
    public java.lang.Integer getCvmType() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // my.com.softspace.reader.internal.kernel.Kernel
    public byte[] getOnlineData() {
        return this.getOutputMinFrameDurationlomOqCM;
    }

    @Override // my.com.softspace.reader.internal.kernel.Kernel
    public byte[] getOnlineResponseData() {
        return this.getOutputSizeshNQ4ISI;
    }

    public byte[] getSelectedAID() {
        return this.unwrapAs;
    }

    public boolean isReadCardError() {
        return this.getInputFormats.isReadCardError();
    }

    private static boolean getHighSpeedVideoFpsRangesFor(byte[] bArr) {
        try {
            my.com.softspace.reader.internal.kernelconfig.BerTlv create = my.com.softspace.reader.internal.kernelconfig.BerTlv.create(bArr);
            my.com.softspace.reader.TEEReaderEngine.getInstance().getLogger().i(getHighSpeedVideoFpsRangesFor, "assureTag 0x6f");
            assureTag(create, 111);
            java.util.List<my.com.softspace.reader.internal.kernelconfig.BerTlv> createList = my.com.softspace.reader.internal.kernelconfig.BerTlv.createList(create.getValue());
            for (my.com.softspace.reader.internal.kernelconfig.BerTlv berTlv : createList) {
                my.com.softspace.reader.ILogger logger = my.com.softspace.reader.TEEReaderEngine.getInstance().getLogger();
                java.lang.String str = getHighSpeedVideoFpsRangesFor;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append("tlv tag :: ");
                sb.append(berTlv.getTag().toHexValue());
                logger.i(str, sb.toString());
            }
            my.com.softspace.reader.TEEReaderEngine.getInstance().getLogger().i(getHighSpeedVideoFpsRangesFor, "assureTag 0xa5");
            my.com.softspace.reader.internal.kernelconfig.BerTlv assureTag = assureTag(createList, 165);
            if (assureTag == null) {
                my.com.softspace.reader.TEEReaderEngine.getInstance().getLogger().i(getHighSpeedVideoFpsRangesFor, "assureTag 0xa5 failed");
                return false;
            }
            my.com.softspace.reader.ILogger logger2 = my.com.softspace.reader.TEEReaderEngine.getInstance().getLogger();
            java.lang.String str2 = getHighSpeedVideoFpsRangesFor;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append("fciProprietary :: ");
            sb2.append(assureTag.getValueAsHexString());
            logger2.i(str2, sb2.toString());
            my.com.softspace.reader.internal.kernelconfig.BerTlv.createList(assureTag.getValue());
            return true;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            my.com.softspace.reader.TEEReaderEngine.getInstance().getLogger().i(getHighSpeedVideoFpsRangesFor, "FCI template validation failed.");
            return false;
        } catch (java.lang.OutOfMemoryError e2) {
            e2.printStackTrace();
            my.com.softspace.reader.TEEReaderEngine.getInstance().getLogger().i(getHighSpeedVideoFpsRangesFor, "FCI template validation failed.");
            return false;
        }
    }
}
