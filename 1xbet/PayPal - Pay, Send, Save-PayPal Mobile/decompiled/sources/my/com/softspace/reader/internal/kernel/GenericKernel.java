package my.com.softspace.reader.internal.kernel;

@java.lang.Deprecated
/* loaded from: classes17.dex */
public class GenericKernel extends my.com.softspace.reader.internal.kernel.Kernel {
    private java.lang.Integer Camera2StreamConfigurationMap;
    private my.com.softspace.reader.internal.kernel.IKernelDelegate getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoFpsRanges;
    private byte[] getHighSpeedVideoSizesFor;
    private java.lang.Integer getInputSizeshNQ4ISI;
    private byte[] getOutputMinFrameDuration;
    private static final byte[] getHighSpeedVideoSizes = {com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, 0, 0, 6, com.google.common.base.Ascii.NAK, 0, 1};
    private static java.lang.String getHighSpeedVideoFpsRangesFor = "purekernel-generic";

    @Override // my.com.softspace.reader.internal.kernel.Kernel
    public void setDebitOptIn(boolean z) {
    }

    private GenericKernel() {
    }

    public static my.com.softspace.reader.internal.kernel.GenericKernel create() {
        return new my.com.softspace.reader.internal.kernel.GenericKernel();
    }

    @Override // my.com.softspace.reader.internal.kernel.Kernel
    public void init(android.content.Context context, byte[] bArr) {
        this.getHighSpeedVideoFpsRanges = bArr;
    }

    @Override // my.com.softspace.reader.internal.kernel.Kernel
    public int preProcessing(android.content.Context context, java.lang.String str, int i, byte[] bArr, my.com.softspace.reader.internal.kernel.Kernel.Callback callback) {
        java.util.Objects.requireNonNull(callback);
        return 0;
    }

    @Override // my.com.softspace.reader.internal.kernel.Kernel
    public int start(android.content.Context context, java.lang.String str, int i, boolean z, boolean z2, my.com.softspace.reader.internal.kernel.Kernel.Callback callback) {
        byte[] bArr;
        boolean z3;
        java.util.Objects.requireNonNull(callback);
        try {
            byte[] exchangeAPDU = callback.exchangeAPDU(select(PAYLOAD_PPSE));
            if (!sw9000(exchangeAPDU)) {
                my.com.softspace.reader.TEEReaderEngine.getInstance().getLogger().i(getHighSpeedVideoFpsRangesFor, "Select PPSE Fail");
                callback.updateUI(2);
                return 7006;
            }
            java.util.Iterator<my.com.softspace.reader.internal.kernel.AIDInfo> it = aidInfoList(dropLast2(exchangeAPDU), PAYLOAD_PPSE).iterator();
            while (true) {
                if (!it.hasNext()) {
                    bArr = null;
                    z3 = false;
                    break;
                }
                my.com.softspace.reader.internal.kernel.AIDInfo next = it.next();
                if (java.util.Arrays.equals(next.getAid(), getHighSpeedVideoSizes)) {
                    bArr = next.getAid();
                    z3 = true;
                    break;
                }
            }
            if (!z3) {
                my.com.softspace.reader.TEEReaderEngine.getInstance().getLogger().i(getHighSpeedVideoFpsRangesFor, "Pure AID not found");
                callback.updateUI(2);
                return 7006;
            }
            byte[] exchangeAPDU2 = callback.exchangeAPDU(select(bArr));
            if (!sw9000(exchangeAPDU2)) {
                my.com.softspace.reader.TEEReaderEngine.getInstance().getLogger().i(getHighSpeedVideoFpsRangesFor, "Select AID Response Fail");
                callback.updateUI(2);
                return 7006;
            }
            my.com.softspace.reader.internal.kernel.SSKernelDelegate sSKernelDelegate = new my.com.softspace.reader.internal.kernel.SSKernelDelegate();
            sSKernelDelegate.init(context, this.getHighSpeedVideoFpsRanges);
            this.getHighResolutionOutputSizeshNQ4ISI = sSKernelDelegate;
            int start = this.getHighResolutionOutputSizeshNQ4ISI.start(context, my.com.softspace.reader.internal.kernel.KernelDelegateParam.Builder.create().setAmount(str).setTimeout(0).setAID(bArr).setFCI(exchangeAPDU2).setBertlvFormat(z).setCipherData(z2).build(), callback);
            my.com.softspace.reader.TEEReaderEngine.getInstance().getLogger().i(getHighSpeedVideoFpsRangesFor, "Start to get online data processing: Result: ".concat(java.lang.String.valueOf(start)));
            Camera2StreamConfigurationMap();
            release(context);
            return start;
        } catch (java.io.IOException unused) {
            return 7056;
        } catch (java.lang.IllegalArgumentException | java.lang.IndexOutOfBoundsException | java.nio.BufferUnderflowException unused2) {
            return 7006;
        }
    }

    @Override // my.com.softspace.reader.internal.kernel.Kernel
    public void release(android.content.Context context) {
        my.com.softspace.reader.internal.kernel.IKernelDelegate iKernelDelegate = this.getHighResolutionOutputSizeshNQ4ISI;
        if (iKernelDelegate != null) {
            iKernelDelegate.release(context);
            Camera2StreamConfigurationMap();
        }
        this.getHighResolutionOutputSizeshNQ4ISI = null;
    }

    private void Camera2StreamConfigurationMap() {
        my.com.softspace.reader.internal.kernel.IKernelDelegate iKernelDelegate = this.getHighResolutionOutputSizeshNQ4ISI;
        if (iKernelDelegate == null) {
            return;
        }
        this.Camera2StreamConfigurationMap = iKernelDelegate.cvmType();
        this.getOutputMinFrameDuration = iKernelDelegate.onlineData();
        this.getHighSpeedVideoSizesFor = iKernelDelegate.onlineResponseData();
        this.getInputSizeshNQ4ISI = iKernelDelegate.transactionResult();
    }

    @Override // my.com.softspace.reader.internal.kernel.Kernel
    public byte[] getOnlineData() {
        return this.getOutputMinFrameDuration;
    }

    @Override // my.com.softspace.reader.internal.kernel.Kernel
    public byte[] getOnlineResponseData() {
        return this.getHighSpeedVideoSizesFor;
    }

    @Override // my.com.softspace.reader.internal.kernel.Kernel
    public java.lang.Integer getCvmType() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // my.com.softspace.reader.internal.kernel.Kernel
    public java.lang.Integer getTransactionResult() {
        return this.getInputSizeshNQ4ISI;
    }
}
