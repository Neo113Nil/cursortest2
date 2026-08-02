package my.com.softspace.reader.internal.kernel;

/* loaded from: classes17.dex */
public interface SSKernelHandler {
    int initKernel(android.content.Context context, java.lang.String str, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, my.com.softspace.reader.internal.kernel.Kernel.Callback callback, boolean z, boolean z2, boolean z3, boolean z4);

    default java.io.InputStream getConfigurationStream(android.content.Context context, byte[] bArr, java.lang.Integer num) {
        byte[] value;
        if (bArr != null && (value = my.com.softspace.reader.internal.kernelconfig.BerTlv.find(bArr, 227).getValue()) != null && my.com.softspace.reader.internal.kernelconfig.BerTlv.find(value, my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_5F2A_TRANSACTION_CURR_CODE) != null) {
            num = java.lang.Integer.valueOf(java.lang.Integer.parseInt(my.com.softspace.reader.internal.kernelconfig.BerTlv.find(value, my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_5F2A_TRANSACTION_CURR_CODE).getValueAsHexString()));
        }
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 344 || intValue == 392 || intValue == 702 || intValue == 704 || intValue == 901) {
                my.com.softspace.reader.ILogger logger = my.com.softspace.reader.TEEReaderEngine.getInstance().getLogger();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("getConfigurationStream for currencyCode ");
                sb.append(num);
                sb.append(" -> config_sign");
                logger.d("SSKernelHandler", sb.toString());
                return context.getResources().openRawResource(my.com.softspace.reader.R.raw.config_sign);
            }
            my.com.softspace.reader.ILogger logger2 = my.com.softspace.reader.TEEReaderEngine.getInstance().getLogger();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("getConfigurationStream for currencyCode ");
            sb2.append(num);
            sb2.append(" -> config");
            logger2.d("SSKernelHandler", sb2.toString());
            return context.getResources().openRawResource(my.com.softspace.reader.R.raw.config);
        }
        my.com.softspace.reader.ILogger logger3 = my.com.softspace.reader.TEEReaderEngine.getInstance().getLogger();
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("getConfigurationStream for currencyCode ");
        sb3.append(num);
        sb3.append(" -> config");
        logger3.d("SSKernelHandler", sb3.toString());
        return context.getResources().openRawResource(my.com.softspace.reader.R.raw.config);
    }

    default int mapCVM(common.emv.kernel.TransactionOutcome transactionOutcome) {
        int i = my.com.softspace.reader.internal.kernel.SSKernelHandler.AnonymousClass1.getHighSpeedVideoFpsRanges[transactionOutcome.getCvm().ordinal()];
        if (i == 1) {
            return 15;
        }
        if (i == 2) {
            return 2;
        }
        if (i != 3) {
            return i != 4 ? 0 : 3;
        }
        return 1;
    }

    /* renamed from: my.com.softspace.reader.internal.kernel.SSKernelHandler$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRanges;
        static final /* synthetic */ int[] getHighSpeedVideoSizes;

        static {
            int[] iArr = new int[common.emv.kernel.TransactionOutcome.Outcome.values().length];
            getHighSpeedVideoSizes = iArr;
            try {
                iArr[common.emv.kernel.TransactionOutcome.Outcome.Approved.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoSizes[common.emv.kernel.TransactionOutcome.Outcome.Declined.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoSizes[common.emv.kernel.TransactionOutcome.Outcome.SelectNext.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoSizes[common.emv.kernel.TransactionOutcome.Outcome.TryAnotherInterface.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoSizes[common.emv.kernel.TransactionOutcome.Outcome.TryAgain.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighSpeedVideoSizes[common.emv.kernel.TransactionOutcome.Outcome.EndApplication.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[common.emv.kernel.TransactionOutcome.CVM.values().length];
            getHighSpeedVideoFpsRanges = iArr2;
            try {
                iArr2[common.emv.kernel.TransactionOutcome.CVM.NoCVM.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                getHighSpeedVideoFpsRanges[common.emv.kernel.TransactionOutcome.CVM.OnlinePin.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                getHighSpeedVideoFpsRanges[common.emv.kernel.TransactionOutcome.CVM.ObtainSignature.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                getHighSpeedVideoFpsRanges[common.emv.kernel.TransactionOutcome.CVM.ConfirmationCodeVerified.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
        }
    }

    default int mapOutcome(common.emv.kernel.TransactionOutcome transactionOutcome) {
        int i = my.com.softspace.reader.internal.kernel.SSKernelHandler.AnonymousClass1.getHighSpeedVideoSizes[transactionOutcome.getOutcome().ordinal()];
        int i2 = transactionOutcome.isUiReqOnRestartPresent() ? 7056 : i != 1 ? i != 2 ? (i == 3 || i == 4) ? 7053 : i != 5 ? 7055 : 7056 : 7004 : 0;
        if (transactionOutcome.getUiReqOnOutcome().getMessage() == common.emv.kernel.TransactionOutcome.StandardMessage.SeePhoneForInstructions || transactionOutcome.getUiReqOnRestart().getMessage() == common.emv.kernel.TransactionOutcome.StandardMessage.SeePhoneForInstructions) {
            return 7054;
        }
        return i2;
    }
}
