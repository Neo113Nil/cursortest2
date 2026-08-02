package amex;

/* loaded from: classes5.dex */
public class AMEXKernel implements common.emv.kernel.Kernel {

    /* renamed from: a, reason: collision with root package name */
    public long f2655a = amex.AMEXKernelJNI.newContext();

    @Override // common.emv.kernel.Kernel
    public common.emv.kernel.TransactionOutcome startTransaction(common.emv.kernel.TransactionRequest transactionRequest, common.emv.cardio.CardSession cardSession, common.emv.kernel.TransactionEventListener transactionEventListener) {
        a();
        byte[] bArr = {0};
        byte[] bArr2 = {0, 0, 0};
        if (transactionRequest.getTransactionData().getAmexContactlessReaderCapabilities() != null) {
            bArr = common.emv.util.HexUtil.decode(transactionRequest.getTransactionData().getAmexContactlessReaderCapabilities());
        }
        if (transactionRequest.getTransactionData().getAmexEnhancedContactlessReaderCapabilities() != null) {
            bArr2 = common.emv.util.HexUtil.decode(transactionRequest.getTransactionData().getAmexEnhancedContactlessReaderCapabilities());
        }
        if (bArr == null || bArr2 == null) {
            throw new java.lang.IllegalArgumentException();
        }
        bArr[0] = (byte) (bArr[0] & 247);
        byte b = bArr2[2];
        bArr2[2] = 0;
        if (transactionRequest.isReaderCvmRequiredLimitExceed()) {
            bArr[0] = (byte) (bArr[0] | 8);
            bArr2[2] = (byte) (bArr2[2] | 64);
        }
        transactionRequest.getTransactionData().setAmexContactlessReaderCapabilities(bArr);
        transactionRequest.getTransactionData().setAmexEnhancedContactlessReaderCapabilities(bArr2);
        return amex.util.TransactionOutcomeDecoder.decode(transactionRequest, amex.AMEXKernelJNI.start(this.f2655a, transactionRequest.getAid(), transactionRequest.getFci(), amex.util.BerTlvEncoder.encode(transactionRequest.getTransactionData().getData()), new amex.AMEXKernel.a(this, cardSession, transactionEventListener)));
    }

    public class a implements amex.AMEXKernelCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ common.emv.cardio.CardSession f2656a;
        public final /* synthetic */ common.emv.kernel.TransactionEventListener b;

        @Override // amex.AMEXKernelCallback
        public int updateUI(int i) {
            try {
                common.emv.kernel.TransactionEventListener transactionEventListener = this.b;
                if (transactionEventListener == null) {
                    return 0;
                }
                transactionEventListener.updateUI(common.emv.kernel.TransactionOutcome.StandardMessage.messageIdentifierOf(i));
                return 0;
            } catch (java.lang.Exception unused) {
                return 0;
            }
        }

        @Override // amex.AMEXKernelCallback
        public int requestPINEntry(byte[] bArr, byte[] bArr2) {
            try {
                common.emv.kernel.TransactionEventListener transactionEventListener = this.b;
                if (transactionEventListener != null) {
                    return transactionEventListener.requestPINEntry(bArr, bArr2);
                }
                return 0;
            } catch (java.lang.Exception unused) {
                return 0;
            }
        }

        @Override // amex.AMEXKernelCallback
        public byte[] requestGoOnline(byte[] bArr) {
            return this.b.requestGoOnline(bArr);
        }

        @Override // amex.AMEXKernelCallback
        public byte[] exchange(byte[] bArr) throws java.io.IOException {
            return this.f2656a.send(bArr);
        }

        public a(amex.AMEXKernel aMEXKernel, common.emv.cardio.CardSession cardSession, common.emv.kernel.TransactionEventListener transactionEventListener) {
            this.f2656a = cardSession;
            this.b = transactionEventListener;
        }
    }

    @Override // common.emv.kernel.Kernel
    public int resetTransaction() {
        a();
        amex.AMEXKernelJNI.freeTransaction(this.f2655a);
        return 0;
    }

    @Override // common.emv.kernel.Kernel
    public void release() {
        amex.AMEXKernelJNI.free(this.f2655a);
        this.f2655a = 0L;
    }

    @Override // common.emv.kernel.Kernel
    public java.lang.String kernelVersion() {
        return amex.AMEXKernelJNI.version();
    }

    @Override // common.emv.kernel.Kernel
    public int init(common.emv.configuration.ApplicationConfiguration applicationConfiguration, common.emv.kernel.TransactionData.TransactionType transactionType) {
        a();
        amex.AMEXKernelJNI.setup(this.f2655a, amex.util.BerTlvEncoder.encode(applicationConfiguration.getConfiguration(transactionType)), amex.util.BerTlvEncoder.encode(applicationConfiguration.getCa(), "E1", "E2"));
        return this.f2655a != 0 ? 0 : 1;
    }

    public final void a() {
        if (this.f2655a == 0) {
            throw new java.lang.IllegalStateException("kernel has been released");
        }
    }
}
