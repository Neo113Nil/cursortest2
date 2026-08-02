package visa;

/* loaded from: classes18.dex */
public class VISAKernel implements common.emv.kernel.Kernel {

    /* renamed from: a, reason: collision with root package name */
    public long f7083a = visa.VISAKernelJNI.newContext();

    @Override // common.emv.kernel.Kernel
    public common.emv.kernel.TransactionOutcome startTransaction(common.emv.kernel.TransactionRequest transactionRequest, common.emv.cardio.CardSession cardSession, common.emv.kernel.TransactionEventListener transactionEventListener) {
        a();
        byte[] ttq = transactionRequest.getTtq();
        ttq[1] = (byte) (ttq[1] | 128);
        transactionRequest.getTransactionData().setTTQ(common.emv.util.HexUtil.encodeToString(ttq));
        return visa.util.TransactionOutcomeDecoder.decode(transactionRequest, visa.VISAKernelJNI.start(this.f7083a, transactionRequest.getAid(), transactionRequest.getFci(), visa.util.BerTlvEncoder.encode(transactionRequest.getTransactionData().getData()), new visa.VISAKernel.a(this, cardSession, transactionEventListener)));
    }

    @Override // common.emv.kernel.Kernel
    public int resetTransaction() {
        a();
        visa.VISAKernelJNI.freeTransaction(this.f7083a);
        return 0;
    }

    @Override // common.emv.kernel.Kernel
    public void release() {
        visa.VISAKernelJNI.free(this.f7083a);
        this.f7083a = 0L;
    }

    public class a implements visa.VISAKernelCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ common.emv.cardio.CardSession f7084a;
        public final /* synthetic */ common.emv.kernel.TransactionEventListener b;

        @Override // visa.VISAKernelCallback
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

        @Override // visa.VISAKernelCallback
        public byte[] exchange(byte[] bArr) throws java.io.IOException {
            return this.f7084a.send(bArr);
        }

        public a(visa.VISAKernel vISAKernel, common.emv.cardio.CardSession cardSession, common.emv.kernel.TransactionEventListener transactionEventListener) {
            this.f7084a = cardSession;
            this.b = transactionEventListener;
        }
    }

    @Override // common.emv.kernel.Kernel
    public java.lang.String kernelVersion() {
        return visa.VISAKernelJNI.version();
    }

    @Override // common.emv.kernel.Kernel
    public int init(common.emv.configuration.ApplicationConfiguration applicationConfiguration, common.emv.kernel.TransactionData.TransactionType transactionType) {
        a();
        visa.VISAKernelJNI.setup(this.f7083a, visa.util.BerTlvEncoder.encode(applicationConfiguration.getConfiguration(transactionType)), visa.util.BerTlvEncoder.encode(applicationConfiguration.getCa(), "E1", "E2"));
        return this.f7083a != 0 ? 0 : 1;
    }

    public final void a() {
        if (this.f7083a == 0) {
            throw new java.lang.IllegalStateException("kernel has been released");
        }
    }
}
