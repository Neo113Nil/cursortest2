package jcb;

/* loaded from: classes17.dex */
public class JCBKernel implements common.emv.kernel.Kernel {

    /* renamed from: a, reason: collision with root package name */
    public long f6909a = jcb.JCBKernelJNI.newContext();

    @Override // common.emv.kernel.Kernel
    public common.emv.kernel.TransactionOutcome startTransaction(common.emv.kernel.TransactionRequest transactionRequest, common.emv.cardio.CardSession cardSession, common.emv.kernel.TransactionEventListener transactionEventListener) {
        a();
        return jcb.util.TransactionOutcomeDecoder.decode(transactionRequest, jcb.JCBKernelJNI.start(this.f6909a, transactionRequest.getAid(), transactionRequest.getFci(), jcb.util.BerTlvEncoder.encode(transactionRequest.getTransactionData().getData()), new jcb.JCBKernel.a(this, cardSession, transactionEventListener)));
    }

    @Override // common.emv.kernel.Kernel
    public int resetTransaction() {
        a();
        jcb.JCBKernelJNI.freeTransaction(this.f6909a);
        return 0;
    }

    @Override // common.emv.kernel.Kernel
    public void release() {
        jcb.JCBKernelJNI.free(this.f6909a);
        this.f6909a = 0L;
    }

    public class a implements jcb.JCBKernelCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ common.emv.cardio.CardSession f6910a;
        public final /* synthetic */ common.emv.kernel.TransactionEventListener b;

        @Override // jcb.JCBKernelCallback
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

        @Override // jcb.JCBKernelCallback
        public byte[] exchange(byte[] bArr) throws java.io.IOException {
            return this.f6910a.send(bArr);
        }

        public a(jcb.JCBKernel jCBKernel, common.emv.cardio.CardSession cardSession, common.emv.kernel.TransactionEventListener transactionEventListener) {
            this.f6910a = cardSession;
            this.b = transactionEventListener;
        }
    }

    @Override // common.emv.kernel.Kernel
    public java.lang.String kernelVersion() {
        return jcb.JCBKernelJNI.version();
    }

    @Override // common.emv.kernel.Kernel
    public int init(common.emv.configuration.ApplicationConfiguration applicationConfiguration, common.emv.kernel.TransactionData.TransactionType transactionType) {
        a();
        jcb.JCBKernelJNI.setup(this.f6909a, jcb.util.BerTlvEncoder.encode(applicationConfiguration.getConfiguration(transactionType)), jcb.util.BerTlvEncoder.encode(applicationConfiguration.getCa(), "E1", "E2"));
        return this.f6909a != 0 ? 0 : 1;
    }

    public final void a() {
        if (this.f6909a == 0) {
            throw new java.lang.IllegalStateException("kernel has been release");
        }
    }
}
