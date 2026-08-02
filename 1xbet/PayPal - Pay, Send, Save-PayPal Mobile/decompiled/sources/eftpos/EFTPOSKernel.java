package eftpos;

/* loaded from: classes17.dex */
public class EFTPOSKernel implements common.emv.kernel.Kernel {

    /* renamed from: a, reason: collision with root package name */
    public long f6723a = eftpos.EFTPOSKernelJNI.newContext();

    @Override // common.emv.kernel.Kernel
    public common.emv.kernel.TransactionOutcome startTransaction(common.emv.kernel.TransactionRequest transactionRequest, common.emv.cardio.CardSession cardSession, common.emv.kernel.TransactionEventListener transactionEventListener) {
        a();
        if (transactionRequest.getTransactionData().getTransactionType() == common.emv.kernel.TransactionData.TransactionType.CashAdvance && java.lang.Long.parseLong(transactionRequest.getTransactionData().getAmountOther()) == 0) {
            transactionRequest.getTransactionData().setAmountOther(java.lang.Long.parseLong(transactionRequest.getTransactionData().getAmountAuth()));
        }
        return eftpos.util.TransactionOutcomeDecoder.decode(transactionRequest, eftpos.EFTPOSKernelJNI.start(this.f6723a, transactionRequest.getAid(), transactionRequest.getFci(), eftpos.util.BerTlvEncoder.encode(transactionRequest.getTransactionData().getData()), new eftpos.EFTPOSKernel.a(this, cardSession, transactionEventListener)));
    }

    public class a implements eftpos.EFTPOSKernelCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ common.emv.cardio.CardSession f6724a;
        public final /* synthetic */ common.emv.kernel.TransactionEventListener b;

        @Override // eftpos.EFTPOSKernelCallback
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

        @Override // eftpos.EFTPOSKernelCallback
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

        @Override // eftpos.EFTPOSKernelCallback
        public byte[] requestGoOnline(byte[] bArr) {
            return this.b.requestGoOnline(bArr);
        }

        @Override // eftpos.EFTPOSKernelCallback
        public byte[] exchange(byte[] bArr) throws java.io.IOException {
            return this.f6724a.send(bArr);
        }

        public a(eftpos.EFTPOSKernel eFTPOSKernel, common.emv.cardio.CardSession cardSession, common.emv.kernel.TransactionEventListener transactionEventListener) {
            this.f6724a = cardSession;
            this.b = transactionEventListener;
        }
    }

    @Override // common.emv.kernel.Kernel
    public int resetTransaction() {
        a();
        eftpos.EFTPOSKernelJNI.freeTransaction(this.f6723a);
        return 0;
    }

    @Override // common.emv.kernel.Kernel
    public void release() {
        eftpos.EFTPOSKernelJNI.free(this.f6723a);
        this.f6723a = 0L;
    }

    @Override // common.emv.kernel.Kernel
    public java.lang.String kernelVersion() {
        return eftpos.EFTPOSKernelJNI.version();
    }

    @Override // common.emv.kernel.Kernel
    public int init(common.emv.configuration.ApplicationConfiguration applicationConfiguration, common.emv.kernel.TransactionData.TransactionType transactionType) {
        a();
        eftpos.EFTPOSKernelJNI.setup(this.f6723a, eftpos.util.BerTlvEncoder.encode(applicationConfiguration.getConfiguration(transactionType)), eftpos.util.BerTlvEncoder.encode(applicationConfiguration.getCa(), "E1", "E2"));
        return this.f6723a != 0 ? 0 : 1;
    }

    public final void a() {
        if (this.f6723a == 0) {
            throw new java.lang.IllegalStateException("kernel has been released");
        }
    }
}
