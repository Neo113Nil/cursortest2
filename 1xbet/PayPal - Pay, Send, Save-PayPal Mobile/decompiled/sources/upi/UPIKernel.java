package upi;

/* loaded from: classes18.dex */
public class UPIKernel implements common.emv.kernel.Kernel {

    /* renamed from: a, reason: collision with root package name */
    public long f7065a = upi.UPIKernelJNI.newContext();

    @Override // common.emv.kernel.Kernel
    public common.emv.kernel.TransactionOutcome startTransaction(common.emv.kernel.TransactionRequest transactionRequest, common.emv.cardio.CardSession cardSession, common.emv.kernel.TransactionEventListener transactionEventListener) {
        a();
        transactionRequest.getTransactionData().setTTQ(common.emv.util.HexUtil.encodeToString(transactionRequest.getTtq()));
        return upi.util.TransactionOutcomeDecoder.decode(transactionRequest, upi.UPIKernelJNI.start(this.f7065a, transactionRequest.getAid(), transactionRequest.getFci(), upi.util.BerTlvEncoder.encode(transactionRequest.getTransactionData().getData()), new upi.UPIKernel.a(this, cardSession, transactionEventListener)));
    }

    public class a implements upi.UPIKernelCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ common.emv.cardio.CardSession f7066a;
        public final /* synthetic */ common.emv.kernel.TransactionEventListener b;

        @Override // upi.UPIKernelCallback
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

        @Override // upi.UPIKernelCallback
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

        @Override // upi.UPIKernelCallback
        public byte[] requestGoOnline(byte[] bArr) {
            return this.b.requestGoOnline(bArr);
        }

        @Override // upi.UPIKernelCallback
        public byte[] exchange(byte[] bArr) throws java.io.IOException {
            return this.f7066a.send(bArr);
        }

        public a(upi.UPIKernel uPIKernel, common.emv.cardio.CardSession cardSession, common.emv.kernel.TransactionEventListener transactionEventListener) {
            this.f7066a = cardSession;
            this.b = transactionEventListener;
        }
    }

    @Override // common.emv.kernel.Kernel
    public int resetTransaction() {
        a();
        upi.UPIKernelJNI.freeTransaction(this.f7065a);
        return 0;
    }

    @Override // common.emv.kernel.Kernel
    public void release() {
        upi.UPIKernelJNI.free(this.f7065a);
        this.f7065a = 0L;
    }

    @Override // common.emv.kernel.Kernel
    public java.lang.String kernelVersion() {
        return upi.UPIKernelJNI.version();
    }

    @Override // common.emv.kernel.Kernel
    public int init(common.emv.configuration.ApplicationConfiguration applicationConfiguration, common.emv.kernel.TransactionData.TransactionType transactionType) {
        a();
        upi.UPIKernelJNI.setup(this.f7065a, upi.util.BerTlvEncoder.encode(applicationConfiguration.getConfiguration(transactionType)), upi.util.BerTlvEncoder.encode(applicationConfiguration.getCa(), "E1", "E2"));
        return this.f7065a != 0 ? 0 : 1;
    }

    public final void a() {
        if (this.f7065a == 0) {
            throw new java.lang.IllegalStateException("kernel has been released");
        }
    }
}
