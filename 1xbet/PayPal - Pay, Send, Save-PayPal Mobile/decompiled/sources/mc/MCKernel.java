package mc;

/* loaded from: classes17.dex */
public class MCKernel implements common.emv.kernel.Kernel {

    /* renamed from: a, reason: collision with root package name */
    public long f6942a = mc.MCKernelJNI.newContext();

    @Override // common.emv.kernel.Kernel
    public common.emv.kernel.TransactionOutcome startTransaction(common.emv.kernel.TransactionRequest transactionRequest, common.emv.cardio.CardSession cardSession, common.emv.kernel.TransactionEventListener transactionEventListener) {
        a();
        return mc.util.TransactionOutcomeDecoder.decode(transactionRequest, mc.MCKernelJNI.start(this.f6942a, transactionRequest.getAid(), transactionRequest.getFci(), mc.util.BerTlvEncoder.encode(transactionRequest.getTransactionData().getData()), new mc.MCKernel.a(this, cardSession, transactionEventListener)));
    }

    public class a implements mc.MCKernelCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ common.emv.cardio.CardSession f6943a;
        public final /* synthetic */ common.emv.kernel.TransactionEventListener b;

        @Override // mc.MCKernelCallback
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

        @Override // mc.MCKernelCallback
        public int updateOUT(byte[] bArr) {
            try {
                common.emv.kernel.TransactionEventListener transactionEventListener = this.b;
                if (transactionEventListener == null) {
                    return 0;
                }
                transactionEventListener.updateOUT(bArr);
                return 0;
            } catch (java.lang.Exception unused) {
                return 0;
            }
        }

        @Override // mc.MCKernelCallback
        public int updateMSG(byte[] bArr, int i, int i2, byte[] bArr2, byte[] bArr3) {
            try {
                common.emv.kernel.TransactionEventListener transactionEventListener = this.b;
                if (transactionEventListener == null) {
                    return 0;
                }
                transactionEventListener.updateMSG(bArr, common.emv.kernel.TransactionOutcome.StandardMessage.messageIdentifierOf(i), common.emv.kernel.TransactionOutcome.Status.fromCode(i2), bArr2, bArr3);
                return 0;
            } catch (java.lang.Exception unused) {
                return 0;
            }
        }

        @Override // mc.MCKernelCallback
        public byte[] exchange(byte[] bArr) throws java.io.IOException {
            return this.f6943a.send(bArr);
        }

        public a(mc.MCKernel mCKernel, common.emv.cardio.CardSession cardSession, common.emv.kernel.TransactionEventListener transactionEventListener) {
            this.f6943a = cardSession;
            this.b = transactionEventListener;
        }
    }

    @Override // common.emv.kernel.Kernel
    public int resetTransaction() {
        a();
        mc.MCKernelJNI.freeTransaction(this.f6942a);
        return 0;
    }

    @Override // common.emv.kernel.Kernel
    public void release() {
        mc.MCKernelJNI.free(this.f6942a);
        this.f6942a = 0L;
    }

    @Override // common.emv.kernel.Kernel
    public java.lang.String kernelVersion() {
        return mc.MCKernelJNI.version();
    }

    @Override // common.emv.kernel.Kernel
    public int init(common.emv.configuration.ApplicationConfiguration applicationConfiguration, common.emv.kernel.TransactionData.TransactionType transactionType) {
        a();
        mc.MCKernelJNI.setup(this.f6942a, mc.util.BerTlvEncoder.encode(applicationConfiguration.getConfiguration(transactionType)), mc.util.BerTlvEncoder.encode(applicationConfiguration.getCa(), "E1", "E2"), mc.util.BerTlvEncoder.encode(applicationConfiguration.getCrl(), "E3", "E4"));
        return this.f6942a != 0 ? 0 : 1;
    }

    public final void a() {
        if (this.f6942a == 0) {
            throw new java.lang.IllegalStateException("kernel has been released");
        }
    }
}
