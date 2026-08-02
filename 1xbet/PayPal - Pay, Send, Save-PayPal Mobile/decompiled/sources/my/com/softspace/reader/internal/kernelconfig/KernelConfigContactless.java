package my.com.softspace.reader.internal.kernelconfig;

/* loaded from: classes17.dex */
class KernelConfigContactless implements my.com.softspace.reader.internal.kernelconfig.KernelConfigGenerator {
    private common.emv.configuration.ConfigurationTemplate getHighSpeedVideoFpsRangesFor = null;
    private common.emv.configuration.ConfigurationTemplate Camera2StreamConfigurationMap = null;
    private final byte[] getHighSpeedVideoFpsRanges = {-97, com.google.common.base.Ascii.RS, 8, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 56, -97, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, 1, 33, -97, com.google.common.base.Ascii.NAK, 2, 0, 82, -97, 78, 9, 83, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 70, 84, 83, 80, 65, 67, 69, -97, 64, 5, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 0, Byte.MIN_VALUE, 32, 0};
    private final byte[] getHighResolutionOutputSizeshNQ4ISI = null;
    private final byte[] getHighSpeedVideoSizes = {-97, 3, 6, 0, 0, 0, 0, 0, 0, -100, 1, 0, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 42, 2, 4, 88, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 1, 2, -97, com.google.common.base.Ascii.SUB, 2, 4, 88};

    KernelConfigContactless() {
    }

    @Override // my.com.softspace.reader.internal.kernelconfig.KernelConfigGenerator
    public my.com.softspace.reader.internal.kernelconfig.KernelConfig generate(android.content.Context context, final int i, final my.com.softspace.reader.TransactionConfigurations transactionConfigurations) {
        int i2;
        common.emv.configuration.ConfigurationTemplate from;
        final my.com.softspace.reader.internal.kernelconfig.BerTlvTemplate create = my.com.softspace.reader.internal.kernelconfig.BerTlvTemplate.create(224, this.getHighSpeedVideoFpsRanges);
        my.com.softspace.reader.internal.kernelconfig.BerTlvTemplate create2 = my.com.softspace.reader.internal.kernelconfig.BerTlvTemplate.create(226, this.getHighResolutionOutputSizeshNQ4ISI);
        my.com.softspace.reader.internal.kernelconfig.BerTlvTemplate create3 = my.com.softspace.reader.internal.kernelconfig.BerTlvTemplate.create(227, this.getHighSpeedVideoSizes);
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        java.io.InputStream openRawResource = context.getResources().openRawResource(my.com.softspace.reader.TEEReaderEngine.getInstance().isProductionMode() ? my.com.softspace.reader.R.raw.ca_prod : my.com.softspace.reader.R.raw.ca);
        if (transactionConfigurations.isDefaultConfig()) {
            if (this.getHighSpeedVideoFpsRangesFor == null) {
                this.getHighSpeedVideoFpsRangesFor = common.emv.configuration.ConfigurationTemplate.from(context.getResources().openRawResource(my.com.softspace.reader.R.raw.config), openRawResource);
            }
            from = this.getHighSpeedVideoFpsRangesFor;
        } else {
            try {
                i2 = java.lang.Integer.parseInt(transactionConfigurations.getTransactionCurrencyCode());
            } catch (java.lang.Exception unused) {
                i2 = 0;
            }
            from = common.emv.configuration.ConfigurationTemplate.from(new my.com.softspace.reader.internal.kernel.SSKernelHandler() { // from class: my.com.softspace.reader.internal.kernelconfig.KernelConfigContactless.1
                @Override // my.com.softspace.reader.internal.kernel.SSKernelHandler
                public int initKernel(android.content.Context context2, java.lang.String str, int i3, byte[] bArr, byte[] bArr2, byte[] bArr3, my.com.softspace.reader.internal.kernel.Kernel.Callback callback, boolean z, boolean z2, boolean z3, boolean z4) {
                    return 0;
                }

                @Override // my.com.softspace.reader.internal.kernel.SSKernelHandler
                public java.io.InputStream getConfigurationStream(android.content.Context context2, byte[] bArr, java.lang.Integer num) {
                    return super.getConfigurationStream(context2, bArr, num);
                }

                @Override // my.com.softspace.reader.internal.kernel.SSKernelHandler
                public int mapCVM(common.emv.kernel.TransactionOutcome transactionOutcome) {
                    return super.mapCVM(transactionOutcome);
                }

                @Override // my.com.softspace.reader.internal.kernel.SSKernelHandler
                public int mapOutcome(common.emv.kernel.TransactionOutcome transactionOutcome) {
                    return super.mapOutcome(transactionOutcome);
                }
            }.getConfigurationStream(context, null, java.lang.Integer.valueOf(i2)), openRawResource);
        }
        final common.emv.configuration.ConfigurationTemplate configurationTemplate = from;
        final java.util.ArrayList arrayList2 = new java.util.ArrayList(configurationTemplate.getTerminalConfiguration().keySet());
        if (configurationTemplate.supportedAIDSet() != null && !configurationTemplate.supportedAIDSet().isEmpty()) {
            configurationTemplate.supportedAIDSet().forEach(new java.util.function.Consumer() { // from class: my.com.softspace.reader.internal.kernelconfig.KernelConfigContactless$$ExternalSyntheticLambda0
                @Override // java.util.function.Consumer
                public final void accept(java.lang.Object obj) {
                    my.com.softspace.reader.internal.kernelconfig.KernelConfigContactless.getHighSpeedVideoFpsRanges(i, transactionConfigurations, configurationTemplate, arrayList2, create, arrayList, (java.lang.String) obj);
                }
            });
        }
        if (transactionConfigurations.getApplicationConfig() != null && !transactionConfigurations.getApplicationConfig().isEmpty()) {
            transactionConfigurations.getApplicationConfig().forEach(new java.util.function.BiConsumer() { // from class: my.com.softspace.reader.internal.kernelconfig.KernelConfigContactless$$ExternalSyntheticLambda1
                @Override // java.util.function.BiConsumer
                public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                    my.com.softspace.reader.internal.kernelconfig.KernelConfigContactless.getHighSpeedVideoSizes(i, arrayList, (java.lang.String) obj, (byte[]) obj2);
                }
            });
        } else {
            my.com.softspace.reader.TEEReaderEngine.getInstance().getLogger().d("KernelConfigContactless", "no overwriting application");
        }
        my.com.softspace.reader.internal.kernelconfig.KernelConfig kernelConfig = new my.com.softspace.reader.internal.kernelconfig.KernelConfig();
        kernelConfig.setTerminal(create);
        kernelConfig.setApplications(arrayList);
        kernelConfig.setKeys(java.util.Collections.singletonList(create2));
        kernelConfig.setTransaction(create3);
        return kernelConfig;
    }

    static /* synthetic */ void getHighSpeedVideoFpsRanges(int i, my.com.softspace.reader.TransactionConfigurations transactionConfigurations, common.emv.configuration.ConfigurationTemplate configurationTemplate, final java.util.List list, final my.com.softspace.reader.internal.kernelconfig.BerTlvTemplate berTlvTemplate, java.util.List list2, java.lang.String str) {
        if (((i & 1) == 1 && str.contains(my.com.softspace.reader.internal.kernel.PaymentNetwork.MCCS.getRidString())) || (((i & 6) == 6 && str.contains(my.com.softspace.reader.internal.kernel.PaymentNetwork.VISA.getRidString())) || (((i & 24) == 24 && str.contains(my.com.softspace.reader.internal.kernel.PaymentNetwork.MASTERCARD.getRidString())) || (((i & 32) == 32 && str.contains(my.com.softspace.reader.internal.kernel.PaymentNetwork.JCB.getRidString())) || (((i & 64) == 64 && str.contains(my.com.softspace.reader.internal.kernel.PaymentNetwork.AMEX.getRidString())) || (((i & 128) == 128 && str.contains(my.com.softspace.reader.internal.kernel.PaymentNetwork.CUP.getRidString())) || (((i & 256) == 256 && str.contains(my.com.softspace.reader.internal.kernel.PaymentNetwork.VCCS.getRidString())) || (((i & 512) == 512 && str.contains(my.com.softspace.reader.internal.kernel.PaymentNetwork.DISCOVER.getRidString())) || (((i & 1024) == 1024 && str.contains(my.com.softspace.reader.internal.kernel.PaymentNetwork.MADA.getRidString())) || (((i & 2048) == 2048 && str.contains(my.com.softspace.reader.internal.kernel.PaymentNetwork.JCBDC.getRidString())) || (((i & 4096) == 4096 && str.contains(my.com.softspace.reader.internal.kernel.PaymentNetwork.EFTPOS.getRidString())) || ((i & 8192) == 8192 && str.contains(my.com.softspace.reader.internal.kernel.PaymentNetwork.NETS.getRidString()))))))))))))) {
            common.emv.kernel.TransactionData.TransactionType of = transactionConfigurations.getTransactionType() != null ? common.emv.kernel.TransactionData.TransactionType.of(transactionConfigurations.getTransactionType()) : null;
            if (of == null) {
                of = common.emv.kernel.TransactionData.TransactionType.Purchase;
            }
            common.emv.configuration.DataObjectList configuration = configurationTemplate.createConfiguration(str).getConfiguration(of);
            final java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            if (configuration == null || configuration.isEmpty()) {
                return;
            }
            configuration.forEach(new java.util.function.BiConsumer() { // from class: my.com.softspace.reader.internal.kernelconfig.KernelConfigContactless$$ExternalSyntheticLambda2
                @Override // java.util.function.BiConsumer
                public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                    my.com.softspace.reader.internal.kernelconfig.KernelConfigContactless.getHighSpeedVideoFpsRangesFor(list, byteArrayOutputStream, berTlvTemplate, (java.lang.String) obj, (java.lang.String) obj2);
                }
            });
            if (common.emv.util.BerTlv.find(byteArrayOutputStream.toByteArray(), my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_9F06_TERM_AID) == null) {
                try {
                    byteArrayOutputStream.write(common.emv.util.BerTlv.create(new common.emv.util.Tag(common.emv.util.HexUtil.decode("9F06")), common.emv.util.HexUtil.decode(str)).toByteArray());
                } catch (java.io.IOException unused) {
                }
            }
            list2.add(my.com.softspace.reader.internal.kernelconfig.BerTlvTemplate.create(225, byteArrayOutputStream.toByteArray()));
        }
    }

    static /* synthetic */ void getHighSpeedVideoFpsRangesFor(java.util.List list, java.io.ByteArrayOutputStream byteArrayOutputStream, my.com.softspace.reader.internal.kernelconfig.BerTlvTemplate berTlvTemplate, java.lang.String str, java.lang.String str2) {
        if (!list.contains(str)) {
            try {
                byteArrayOutputStream.write(common.emv.util.BerTlv.create(new common.emv.util.Tag(common.emv.util.HexUtil.decode(str)), common.emv.util.HexUtil.decode(str2)).toByteArray());
                return;
            } catch (java.io.IOException unused) {
                return;
            }
        }
        try {
            berTlvTemplate.put(java.lang.Integer.parseInt(str, 16), common.emv.util.HexUtil.decode(str2));
        } catch (java.lang.NumberFormatException e) {
            my.com.softspace.reader.ILogger logger = my.com.softspace.reader.TEEReaderEngine.getInstance().getLogger();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid Tag Format - ");
            sb.append(e.getMessage());
            logger.d("KernelConfigContactless", sb.toString());
        }
    }

    static /* synthetic */ void getHighSpeedVideoSizes(int i, java.util.List list, java.lang.String str, byte[] bArr) {
        if (((i & 1) == 1 && str.contains(my.com.softspace.reader.internal.kernel.PaymentNetwork.MCCS.getRidString())) || (((i & 6) == 6 && str.contains(my.com.softspace.reader.internal.kernel.PaymentNetwork.VISA.getRidString())) || (((i & 24) == 24 && str.contains(my.com.softspace.reader.internal.kernel.PaymentNetwork.MASTERCARD.getRidString())) || (((i & 32) == 32 && str.contains(my.com.softspace.reader.internal.kernel.PaymentNetwork.JCB.getRidString())) || (((i & 64) == 64 && str.contains(my.com.softspace.reader.internal.kernel.PaymentNetwork.AMEX.getRidString())) || (((i & 128) == 128 && str.contains(my.com.softspace.reader.internal.kernel.PaymentNetwork.CUP.getRidString())) || (((i & 256) == 256 && str.contains(my.com.softspace.reader.internal.kernel.PaymentNetwork.VCCS.getRidString())) || (((i & 512) == 512 && str.contains(my.com.softspace.reader.internal.kernel.PaymentNetwork.DISCOVER.getRidString())) || (((i & 1024) == 1024 && str.contains(my.com.softspace.reader.internal.kernel.PaymentNetwork.MADA.getRidString())) || (((i & 2048) == 2048 && str.contains(my.com.softspace.reader.internal.kernel.PaymentNetwork.JCBDC.getRidString())) || (((i & 4096) == 4096 && str.contains(my.com.softspace.reader.internal.kernel.PaymentNetwork.EFTPOS.getRidString())) || ((i & 8192) == 8192 && str.contains(my.com.softspace.reader.internal.kernel.PaymentNetwork.NETS.getRidString()))))))))))))) {
            my.com.softspace.reader.ILogger logger = my.com.softspace.reader.TEEReaderEngine.getInstance().getLogger();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(" overwriting");
            logger.d("KernelConfigContactless", sb.toString());
            list.add(my.com.softspace.reader.internal.kernelconfig.BerTlvTemplate.create(225, bArr));
            return;
        }
        my.com.softspace.reader.ILogger logger2 = my.com.softspace.reader.TEEReaderEngine.getInstance().getLogger();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(str);
        sb2.append(" overwriting not in supported schemes");
        logger2.d("KernelConfigContactless", sb2.toString());
    }
}
