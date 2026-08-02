package common.emv;

/* loaded from: classes17.dex */
public final class EmvApp {

    /* renamed from: a, reason: collision with root package name */
    public final zb.f f6685a;
    public final java.util.concurrent.atomic.AtomicReference<common.emv.EmvApp.b> b = new java.util.concurrent.atomic.AtomicReference<>();

    public static java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return obj != null ? obj : obj2;
    }

    public final void a(common.emv.EmvApp.b bVar) {
        if (bVar == null || bVar.b.isDone()) {
            return;
        }
        common.emv.kernel.TransactionOutcome transactionOutcome = new common.emv.kernel.TransactionOutcome(bVar.f6687a, common.emv.kernel.TransactionOutcome.Outcome.EndApplication);
        transactionOutcome.setUiReqOnOutcome(new common.emv.kernel.TransactionOutcome.UserInterfaceRequestData(common.emv.kernel.TransactionOutcome.StandardMessage.InsertSwipeOrTryAnotherCard, common.emv.kernel.TransactionOutcome.Status.ProcessingError));
        common.emv.EmvApp.a aVar = bVar.c;
        if (aVar != null) {
            aVar.updateUI(transactionOutcome.getUiReqOnOutcome().getMessage());
            bVar.c.b = true;
        }
        bVar.b.complete(transactionOutcome);
        resetTransaction();
    }

    public final common.emv.EmvApp setupEmv(common.emv.configuration.ConfigurationTemplate configurationTemplate, java.util.List<common.emv.kernel.KernelProvider> list) {
        zb.f fVar = this.f6685a;
        if (list.size() == 0) {
            throw new java.lang.IllegalArgumentException();
        }
        fVar.g = configurationTemplate;
        fVar.e.clear();
        fVar.e.addAll(list);
        return this;
    }

    public static class a implements common.emv.kernel.TransactionEventListener {

        /* renamed from: a, reason: collision with root package name */
        public final common.emv.kernel.TransactionEventListener f6686a;
        public boolean b = false;

        @Override // common.emv.kernel.TransactionEventListener
        public void updateUI(common.emv.kernel.TransactionOutcome.StandardMessage standardMessage) {
            if (this.b) {
                return;
            }
            this.f6686a.updateUI(standardMessage);
        }

        @Override // common.emv.kernel.TransactionEventListener
        public void updateOUT(byte[] bArr) {
            if (this.b) {
                return;
            }
            this.f6686a.updateOUT(bArr);
        }

        @Override // common.emv.kernel.TransactionEventListener
        public void updateMSG(byte[] bArr, common.emv.kernel.TransactionOutcome.StandardMessage standardMessage, common.emv.kernel.TransactionOutcome.Status status, byte[] bArr2, byte[] bArr3) {
            if (this.b) {
                return;
            }
            this.f6686a.updateMSG(bArr, standardMessage, status, bArr2, bArr3);
        }

        @Override // common.emv.kernel.TransactionEventListener
        public void selectNextOutcome(common.emv.kernel.TransactionOutcome transactionOutcome) {
            if (this.b) {
                return;
            }
            this.f6686a.selectNextOutcome(transactionOutcome);
        }

        /* renamed from: common.emv.EmvApp$a$a, reason: collision with other inner class name */
        public class C0214a implements common.emv.kernel.TransactionEventListener {
            @Override // common.emv.kernel.TransactionEventListener
            public int requestPINEntry(byte[] bArr, byte[] bArr2) {
                return 0;
            }

            @Override // common.emv.kernel.TransactionEventListener
            public void updateMSG(byte[] bArr, common.emv.kernel.TransactionOutcome.StandardMessage standardMessage, common.emv.kernel.TransactionOutcome.Status status, byte[] bArr2, byte[] bArr3) {
            }

            @Override // common.emv.kernel.TransactionEventListener
            public void updateOUT(byte[] bArr) {
            }

            @Override // common.emv.kernel.TransactionEventListener
            public void updateUI(common.emv.kernel.TransactionOutcome.StandardMessage standardMessage) {
            }

            @Override // common.emv.kernel.TransactionEventListener
            public byte[] requestGoOnline(byte[] bArr) {
                return new byte[0];
            }

            public C0214a(common.emv.EmvApp.a aVar) {
            }
        }

        @Override // common.emv.kernel.TransactionEventListener
        public int requestPINEntry(byte[] bArr, byte[] bArr2) {
            if (this.b) {
                return 0;
            }
            return this.f6686a.requestPINEntry(bArr, bArr2);
        }

        @Override // common.emv.kernel.TransactionEventListener
        public byte[] requestGoOnline(byte[] bArr) {
            return !this.b ? this.f6686a.requestGoOnline(bArr) : new byte[0];
        }

        public a(common.emv.kernel.TransactionEventListener transactionEventListener) {
            this.f6686a = (common.emv.kernel.TransactionEventListener) common.emv.EmvApp.a(transactionEventListener, new common.emv.EmvApp.a.C0214a(this));
        }
    }

    public final java.util.concurrent.CompletableFuture<common.emv.kernel.TransactionOutcome> start(common.emv.kernel.TransactionData transactionData, common.emv.kernel.TransactionEventListener transactionEventListener) {
        java.util.concurrent.CompletableFuture<common.emv.kernel.TransactionOutcome> a2;
        synchronized (this) {
            a(this.b.getAndSet(null));
            common.emv.EmvApp.a aVar = new common.emv.EmvApp.a(transactionEventListener);
            common.emv.kernel.TransactionRequest transactionRequest = new common.emv.kernel.TransactionRequest(transactionData);
            a2 = this.f6685a.a(transactionRequest, aVar);
            this.b.set(new common.emv.EmvApp.b(transactionRequest, a2, aVar));
        }
        return a2;
    }

    public final void resetTransaction() {
        final zb.f fVar = this.f6685a;
        java.util.Objects.requireNonNull(fVar);
        java.util.concurrent.CompletableFuture.runAsync(new java.lang.Runnable() { // from class: common.emv.EmvApp$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                zb.f.this.a();
            }
        });
    }

    public final void cancel() {
        a(this.b.getAndSet(null));
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final common.emv.kernel.TransactionRequest f6687a;
        public final java.util.concurrent.CompletableFuture<common.emv.kernel.TransactionOutcome> b;
        public final common.emv.EmvApp.a c;

        public b(common.emv.kernel.TransactionRequest transactionRequest, java.util.concurrent.CompletableFuture<common.emv.kernel.TransactionOutcome> completableFuture, common.emv.EmvApp.a aVar) {
            this.f6687a = transactionRequest;
            this.b = completableFuture;
            this.c = aVar;
        }
    }

    public EmvApp(common.emv.cardio.CardIO cardIO) {
        this.f6685a = new zb.f(cardIO);
    }
}
