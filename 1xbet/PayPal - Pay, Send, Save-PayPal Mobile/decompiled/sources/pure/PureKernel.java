package pure;

/* loaded from: classes18.dex */
public class PureKernel implements common.emv.kernel.Kernel {

    /* renamed from: a, reason: collision with root package name */
    public long f7059a = pure.PureKernelJNI.newContext();

    @Override // common.emv.kernel.Kernel
    public common.emv.kernel.TransactionOutcome startTransaction(common.emv.kernel.TransactionRequest transactionRequest, common.emv.cardio.CardSession cardSession, common.emv.kernel.TransactionEventListener transactionEventListener) {
        a();
        byte b = transactionRequest.isStatusCheckRequested() ? (byte) 4 : (byte) 0;
        if (transactionRequest.isZeroAmount()) {
            b = (byte) (b | 8);
        }
        if (transactionRequest.isReaderCvmRequiredLimitExceed()) {
            b = (byte) (b | 16);
        }
        if (transactionRequest.isReaderContactlessFloorLimitExceed()) {
            b = (byte) (b | 32);
        }
        return pure.util.TransactionOutcomeDecoder.decode(transactionRequest, pure.PureKernelJNI.start(this.f7059a, transactionRequest.getAid(), transactionRequest.getFci(), b, pure.util.BerTlvEncoder.encode(transactionRequest.getTransactionData().getData()), new pure.PureKernel.a(this, cardSession, transactionEventListener)));
    }

    @Override // common.emv.kernel.Kernel
    public int resetTransaction() {
        a();
        pure.PureKernelJNI.freeTransaction(this.f7059a);
        return 0;
    }

    @Override // common.emv.kernel.Kernel
    public void release() {
        pure.PureKernelJNI.free(this.f7059a);
        this.f7059a = 0L;
    }

    public class a implements pure.PureKernelCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ common.emv.cardio.CardSession f7060a;
        public final /* synthetic */ common.emv.kernel.TransactionEventListener b;

        @Override // pure.PureKernelCallback
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

        @Override // pure.PureKernelCallback
        public byte[] exchange(byte[] bArr) throws java.io.IOException {
            return this.f7060a.send(bArr);
        }

        public a(pure.PureKernel pureKernel, common.emv.cardio.CardSession cardSession, common.emv.kernel.TransactionEventListener transactionEventListener) {
            this.f7060a = cardSession;
            this.b = transactionEventListener;
        }
    }

    @Override // common.emv.kernel.Kernel
    public java.lang.String kernelVersion() {
        return pure.PureKernelJNI.version();
    }

    @Override // common.emv.kernel.Kernel
    public int init(common.emv.configuration.ApplicationConfiguration applicationConfiguration, common.emv.kernel.TransactionData.TransactionType transactionType) {
        a();
        pure.PureKernelJNI.setup(this.f7059a, pure.util.BerTlvEncoder.encode(applicationConfiguration.getConfiguration(transactionType)), pure.util.BerTlvEncoder.encode(applicationConfiguration.getCa(), "E1", "E2"));
        return this.f7059a != 0 ? 0 : 1;
    }

    public final void a() {
        if (this.f7059a == 0) {
            throw new java.lang.IllegalStateException("kernel has been release");
        }
    }
}
