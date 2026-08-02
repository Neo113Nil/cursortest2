package my.com.softspace.reader.internal.kernel;

/* loaded from: classes17.dex */
public class SSKernelDelegate implements my.com.softspace.reader.internal.kernel.IKernelDelegate {
    private byte[] Camera2StreamConfigurationMap;
    private boolean getHighSpeedVideoSizes = false;
    private java.lang.Integer getOutputMinFrameDuration = null;
    private java.lang.Integer getHighSpeedVideoFpsRangesFor = null;
    private byte[] getHighResolutionOutputSizeshNQ4ISI = null;
    private byte[] getHighSpeedVideoFpsRanges = null;

    @Override // my.com.softspace.reader.internal.kernel.IKernelDelegate
    public void init(android.content.Context context, byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            this.Camera2StreamConfigurationMap = new byte[0];
        } else {
            this.Camera2StreamConfigurationMap = bArr;
        }
    }

    @Override // my.com.softspace.reader.internal.kernel.IKernelDelegate
    public int preProcessing(android.content.Context context, java.lang.String str, int i, byte[] bArr, my.com.softspace.reader.internal.kernel.Kernel.Callback callback) {
        my.com.softspace.reader.SSKernelJNIHandler.subscribeHandler(new my.com.softspace.reader.internal.kernel.SSKernelDelegate.SSKernelHandlerImpl(callback));
        int preProcessing = my.com.softspace.reader.SSKernelJNI.preProcessing(str, i, bArr, this.Camera2StreamConfigurationMap);
        my.com.softspace.reader.TEEReaderEngine.getInstance().getLogger().d("SSKernelDelegate", "Init Kernel Status : ".concat(java.lang.String.valueOf(preProcessing)));
        return preProcessing;
    }

    @Override // my.com.softspace.reader.internal.kernel.IKernelDelegate
    public int start(android.content.Context context, my.com.softspace.reader.internal.kernel.KernelDelegateParam kernelDelegateParam, my.com.softspace.reader.internal.kernel.Kernel.Callback callback) {
        java.lang.String str;
        int i = 0;
        my.com.softspace.reader.internal.kernel.PaymentNetwork paymentNetwork = my.com.softspace.reader.internal.kernel.PaymentNetwork.get(my.com.softspace.reader.internal.kernelconfig.HexUtil.byteArrayToHexString(kernelDelegateParam.getAid().length < 5 ? new byte[0] : java.util.Arrays.copyOfRange(kernelDelegateParam.getAid(), 0, 5), true));
        my.com.softspace.reader.SSKernelJNIHandler.subscribeHandler(new my.com.softspace.reader.internal.kernel.SSKernelDelegate.SSKernelHandlerImpl(callback));
        my.com.softspace.reader.ILogger logger = my.com.softspace.reader.TEEReaderEngine.getInstance().getLogger();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentNetwork : ");
        sb.append(paymentNetwork.getRidString());
        logger.d("SSKernelDelegate", sb.toString());
        boolean isProductionMode = my.com.softspace.reader.TEEReaderEngine.getInstance().isProductionMode();
        switch (my.com.softspace.reader.internal.kernel.SSKernelDelegate.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI[paymentNetwork.ordinal()]) {
            case 1:
                str = "SSKernelDelegate";
                i = my.com.softspace.reader.internal.kernel.mastercard.MastercardKernelHandler.getInstance().initKernel(context, kernelDelegateParam.getAmount(), kernelDelegateParam.getTimeout(), kernelDelegateParam.getAid(), kernelDelegateParam.getFci(), this.Camera2StreamConfigurationMap, callback, kernelDelegateParam.isBertlvFormat(), kernelDelegateParam.isCipherData(), false, isProductionMode);
                break;
            case 2:
                str = "SSKernelDelegate";
                i = my.com.softspace.reader.internal.kernel.visa.VisaKernelHandler.getInstance().initKernel(context, kernelDelegateParam.getAmount(), kernelDelegateParam.getTimeout(), kernelDelegateParam.getAid(), kernelDelegateParam.getFci(), this.Camera2StreamConfigurationMap, callback, kernelDelegateParam.isBertlvFormat(), kernelDelegateParam.isCipherData(), false, isProductionMode);
                break;
            case 3:
                str = "SSKernelDelegate";
                i = my.com.softspace.reader.internal.kernel.upi.UPIKernelHandler.getInstance().initKernel(context, kernelDelegateParam.getAmount(), kernelDelegateParam.getTimeout(), kernelDelegateParam.getAid(), kernelDelegateParam.getFci(), this.Camera2StreamConfigurationMap, callback, kernelDelegateParam.isBertlvFormat(), kernelDelegateParam.isCipherData(), false, isProductionMode);
                break;
            case 4:
                str = "SSKernelDelegate";
                i = my.com.softspace.reader.internal.kernel.amex.AMEXKernelHandler.getInstance().initKernel(context, kernelDelegateParam.getAmount(), kernelDelegateParam.getTimeout(), kernelDelegateParam.getAid(), kernelDelegateParam.getFci(), this.Camera2StreamConfigurationMap, callback, kernelDelegateParam.isBertlvFormat(), kernelDelegateParam.isCipherData(), false, isProductionMode);
                break;
            case 5:
            case 6:
                str = "SSKernelDelegate";
                i = my.com.softspace.reader.internal.kernel.jcb.JCBKernelHandler.getInstance().initKernel(context, kernelDelegateParam.getAmount(), kernelDelegateParam.getTimeout(), kernelDelegateParam.getAid(), kernelDelegateParam.getFci(), this.Camera2StreamConfigurationMap, callback, kernelDelegateParam.isBertlvFormat(), kernelDelegateParam.isCipherData(), false, isProductionMode);
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                str = "SSKernelDelegate";
                i = my.com.softspace.reader.internal.kernel.pure.PureKernelHandler.getInstance().initKernel(context, kernelDelegateParam.getAmount(), kernelDelegateParam.getTimeout(), kernelDelegateParam.getAid(), kernelDelegateParam.getFci(), this.Camera2StreamConfigurationMap, callback, kernelDelegateParam.isBertlvFormat(), kernelDelegateParam.isCipherData(), false, isProductionMode);
                break;
            case 11:
                str = "SSKernelDelegate";
                i = my.com.softspace.reader.internal.kernel.discover.DiscoverKernelHandler.INSTANCE.getInstance().initKernel(context, kernelDelegateParam.getAmount(), kernelDelegateParam.getTimeout(), kernelDelegateParam.getAid(), kernelDelegateParam.getFci(), this.Camera2StreamConfigurationMap, callback, kernelDelegateParam.isBertlvFormat(), kernelDelegateParam.isCipherData());
                break;
            case 12:
                str = "SSKernelDelegate";
                i = my.com.softspace.reader.internal.kernel.eftpos.EFTPOSKernelHandler.getInstance().initKernel(context, kernelDelegateParam.getAmount(), kernelDelegateParam.getTimeout(), kernelDelegateParam.getAid(), kernelDelegateParam.getFci(), this.Camera2StreamConfigurationMap, callback, kernelDelegateParam.isBertlvFormat(), kernelDelegateParam.isCipherData(), kernelDelegateParam.isLCR(), isProductionMode);
                break;
            default:
                str = "SSKernelDelegate";
                break;
        }
        my.com.softspace.reader.TEEReaderEngine.getInstance().getLogger().d(str, "Init Kernel Status : ".concat(java.lang.String.valueOf(i)));
        return i;
    }

    /* renamed from: my.com.softspace.reader.internal.kernel.SSKernelDelegate$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighResolutionOutputSizeshNQ4ISI;

        static {
            int[] iArr = new int[my.com.softspace.reader.internal.kernel.PaymentNetwork.values().length];
            getHighResolutionOutputSizeshNQ4ISI = iArr;
            try {
                iArr[my.com.softspace.reader.internal.kernel.PaymentNetwork.MASTERCARD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[my.com.softspace.reader.internal.kernel.PaymentNetwork.VISA.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[my.com.softspace.reader.internal.kernel.PaymentNetwork.CUP.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[my.com.softspace.reader.internal.kernel.PaymentNetwork.AMEX.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[my.com.softspace.reader.internal.kernel.PaymentNetwork.JCB.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[my.com.softspace.reader.internal.kernel.PaymentNetwork.JCBDC.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[my.com.softspace.reader.internal.kernel.PaymentNetwork.MCCS.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[my.com.softspace.reader.internal.kernel.PaymentNetwork.VCCS.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[my.com.softspace.reader.internal.kernel.PaymentNetwork.MADA.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[my.com.softspace.reader.internal.kernel.PaymentNetwork.NETS.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[my.com.softspace.reader.internal.kernel.PaymentNetwork.DISCOVER.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[my.com.softspace.reader.internal.kernel.PaymentNetwork.EFTPOS.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
        }
    }

    @Override // my.com.softspace.reader.internal.kernel.IKernelDelegate
    public java.lang.Integer cvmType() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // my.com.softspace.reader.internal.kernel.IKernelDelegate
    public byte[] onlineData() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // my.com.softspace.reader.internal.kernel.IKernelDelegate
    public byte[] onlineResponseData() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // my.com.softspace.reader.internal.kernel.IKernelDelegate
    public java.lang.Integer transactionResult() {
        return this.getOutputMinFrameDuration;
    }

    @Override // my.com.softspace.reader.internal.kernel.IKernelDelegate
    public void release(android.content.Context context) {
        my.com.softspace.reader.SSKernelJNIHandler.unsubcribeHandler();
    }

    class SSKernelHandlerImpl implements my.com.softspace.reader.SSKernelHandler {
        private my.com.softspace.reader.internal.kernel.Kernel.Callback getHighSpeedVideoFpsRanges;

        SSKernelHandlerImpl(my.com.softspace.reader.internal.kernel.Kernel.Callback callback) {
            this.getHighSpeedVideoFpsRanges = callback;
        }

        @Override // my.com.softspace.reader.SSKernelHandler
        public int updateUI(int i) {
            return this.getHighSpeedVideoFpsRanges.updateUI(i);
        }

        @Override // my.com.softspace.reader.SSKernelHandler
        public byte[] exchangeAPDU(byte[] bArr) throws java.lang.Exception {
            return this.getHighSpeedVideoFpsRanges.exchangeAPDU(bArr);
        }

        @Override // my.com.softspace.reader.SSKernelHandler
        public java.lang.Object[] cipherOperation(boolean z, byte[] bArr, boolean z2) {
            return this.getHighSpeedVideoFpsRanges.cipherOperation(z, bArr, z2);
        }

        @Override // my.com.softspace.reader.SSKernelHandler
        public java.lang.Object[] hmacSHA256(byte[] bArr) {
            return this.getHighSpeedVideoFpsRanges.hmacSHA256(bArr);
        }

        @Override // my.com.softspace.reader.SSKernelHandler
        public java.lang.Object[] cmac(byte[] bArr) {
            return this.getHighSpeedVideoFpsRanges.cmac(bArr);
        }

        @Override // my.com.softspace.reader.SSKernelHandler
        public byte[] sendOnlineAuthentication(byte[] bArr, byte[] bArr2) throws java.lang.Exception {
            my.com.softspace.reader.internal.kernel.SSKernelDelegate.this.getHighResolutionOutputSizeshNQ4ISI = bArr2;
            return this.getHighSpeedVideoFpsRanges.sendOnlineAuthentication(bArr, bArr2);
        }

        @Override // my.com.softspace.reader.SSKernelHandler
        public void onComplete(byte[] bArr, int i, int i2) {
            my.com.softspace.reader.internal.kernel.SSKernelDelegate.this.getOutputMinFrameDuration = java.lang.Integer.valueOf(i);
            my.com.softspace.reader.internal.kernel.SSKernelDelegate.this.getHighSpeedVideoFpsRanges = bArr;
            my.com.softspace.reader.internal.kernel.SSKernelDelegate.this.getHighSpeedVideoFpsRangesFor = java.lang.Integer.valueOf(i2);
            my.com.softspace.reader.internal.kernel.SSKernelDelegate.this.getHighSpeedVideoSizes = true;
        }
    }
}
