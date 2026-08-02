package com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.connect;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0006\b \u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\n\u001a\u00020\u000bH\u0014J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002J\b\u0010\u0012\u001a\u00020\u0013H$J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0019\u001a\u00020\rH$J\b\u0010\u001a\u001a\u00020\u0011H$J\b\u0010\u001b\u001a\u00020\u001cH\u0004J\b\u0010\u001d\u001a\u00020\u001cH\u0004J\u0014\u0010\u001e\u001a\u00020\r2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0004J\b\u0010\u001f\u001a\u00020\rH\u0002J\b\u0010 \u001a\u00020\rH\u0002J\b\u0010!\u001a\u00020\rH\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\""}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/iap/flow/connect/BaseIapConnectFlow;", "", "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/iap/model/ApplicationProcessingData;", "(Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;)V", "additionalPdolData", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "getTransaction", "()Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "debugTag", "", "execute", "", "executeCommand", "task", "Lkotlin/Function0;", "Lcom/discover/mpos/sdk/card/apdu/gpo/GetProcessingOptionsResponse;", "getP1Parameter", "", "isResumeTransactionEnabled", "", "processingData", "Lcom/discover/mpos/sdk/transaction/processing/ProcessingData;", "isTearingRecoveryEnabled", "preProcess", "readGPOContent", "requestAdditionalData", "", "requestDdolContent", "resume", "saveTransactionDetailsInTearingLog", "sendGPO", "sendResumeGPOCommand", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.c.a.a.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public abstract class BaseIapConnectFlow {

    /* renamed from: a, reason: collision with root package name */
    final com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.cardreader.kernel.flow.iap.model.ApplicationProcessingData> f3022a;
    private com.discover.mpos.sdk.core.emv.tlv.Tlv b;

    protected abstract void d();

    protected abstract int e();

    protected abstract com.discover.mpos.sdk.card.apdu.gpo.GetProcessingOptionsResponse f();

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/discover/mpos/sdk/card/apdu/gpo/GetProcessingOptionsResponse;", "invoke"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.c.a.a.a$a */
    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<com.discover.mpos.sdk.card.apdu.gpo.GetProcessingOptionsResponse, kotlin.Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ kotlin.Unit invoke(com.discover.mpos.sdk.card.apdu.gpo.GetProcessingOptionsResponse getProcessingOptionsResponse) {
            com.discover.mpos.sdk.card.apdu.gpo.GetProcessingOptionsResponse getProcessingOptionsResponse2 = getProcessingOptionsResponse;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getProcessingOptionsResponse2, "");
            com.discover.mpos.sdk.transaction.processing.ProcessingData j = com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.connect.BaseIapConnectFlow.this.f3022a.j();
            if (getProcessingOptionsResponse2 == null || getProcessingOptionsResponse2.isExecutionFailed()) {
                getProcessingOptionsResponse2 = null;
            }
            j.k = getProcessingOptionsResponse2;
            com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.connect.BaseIapConnectFlow.this.f3022a.t();
            return kotlin.Unit.INSTANCE;
        }

        a() {
            super(1);
        }
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.c.a.a.a$b */
    static final class b extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
            com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.connect.BaseIapConnectFlow.this.f3022a.y();
            return kotlin.Unit.INSTANCE;
        }

        b() {
            super(1);
        }
    }

    public BaseIapConnectFlow(com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.cardreader.kernel.flow.iap.model.ApplicationProcessingData> transactionEx) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        this.f3022a = transactionEx;
    }

    public final void a() {
        d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(com.discover.mpos.sdk.core.emv.tlv.Tlv tlv) {
        byte[] content;
        byte[] e;
        this.b = tlv;
        com.discover.mpos.sdk.transaction.processing.ProcessingData j = this.f3022a.j();
        boolean z = j.A;
        new java.lang.Object[]{java.lang.Boolean.valueOf(z)};
        if (z) {
            boolean z2 = j.i;
            new java.lang.Object[]{java.lang.Boolean.valueOf(z2)};
            if (z2) {
                a(new com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.connect.BaseIapConnectFlow.d(this.f3022a.n()));
                return;
            }
            com.discover.mpos.sdk.transaction.processing.ProcessingData j2 = this.f3022a.j();
            com.discover.mpos.sdk.data.TearingRecoveryStorage n = this.f3022a.n();
            com.discover.mpos.sdk.data.TearingLogTransactionDetails.a aVar = new com.discover.mpos.sdk.data.TearingLogTransactionDetails.a(j2.e(), e());
            com.discover.mpos.sdk.cardreader.entrypoint.model.Candidate candidate = j2.h.c;
            aVar.f3208a = candidate != null ? candidate.getAid() : null;
            com.discover.mpos.sdk.cardreader.kernel.flow.optionalfeature.data.CardFeatureDescriptor s = j2.s();
            aVar.b.setContent((s == null || (e = s.getE()) == null) ? null : java.util.Arrays.copyOf(e, e.length));
            com.discover.mpos.sdk.core.emv.tlv.Tlv t = j2.t();
            aVar.c.setContent((t == null || (content = t.getContent()) == null) ? null : java.util.Arrays.copyOf(content, content.length));
            com.discover.mpos.sdk.core.emv.tlv.Tlv tlv2 = this.b;
            aVar.d = tlv2 != null ? tlv2.copy() : null;
            n.a(aVar.a());
        }
        a(new com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.connect.BaseIapConnectFlow.c());
    }

    protected final byte[] b() {
        return this.f3022a.j().e().getE();
    }

    protected final byte[] c() {
        byte[] e;
        com.discover.mpos.sdk.core.emv.tlv.Tlv tlv = this.b;
        return (tlv == null || (e = tlv.getE()) == null) ? new byte[0] : e;
    }

    private final void a(kotlin.jvm.functions.Function0<com.discover.mpos.sdk.card.apdu.gpo.GetProcessingOptionsResponse> function0) {
        this.f3022a.a(function0, new com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.connect.BaseIapConnectFlow.a(), new com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.connect.BaseIapConnectFlow.b());
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/discover/mpos/sdk/card/apdu/gpo/GetProcessingOptionsResponse;", "invoke"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.c.a.a.a$c */
    static final class c extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.discover.mpos.sdk.card.apdu.gpo.GetProcessingOptionsResponse> {
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ com.discover.mpos.sdk.card.apdu.gpo.GetProcessingOptionsResponse invoke() {
            return com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.connect.BaseIapConnectFlow.this.f();
        }

        c() {
            super(0);
        }
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/discover/mpos/sdk/card/apdu/gpo/GetProcessingOptionsResponse;", "invoke"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.c.a.a.a$d */
    static final class d extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.discover.mpos.sdk.card.apdu.gpo.GetProcessingOptionsResponse> {
        final /* synthetic */ com.discover.mpos.sdk.data.TearingRecoveryStorage b;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ com.discover.mpos.sdk.card.apdu.gpo.GetProcessingOptionsResponse invoke() {
            byte[] bArr;
            com.discover.mpos.sdk.card.Card i = com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.connect.BaseIapConnectFlow.this.f3022a.i();
            int a2 = this.b.a();
            byte[] e = new com.discover.mpos.sdk.core.emv.tlv.Tlv(com.discover.mpos.sdk.core.emv.tlv.Tag.COMMAND_TEMPLATE.getTag(), this.b.b().getE(), 0, 0, 12, null).getE();
            com.discover.mpos.sdk.core.emv.tlv.Tlv c = this.b.c();
            if (c == null || (bArr = c.getE()) == null) {
                bArr = new byte[0];
            }
            return i.a(a2, kotlin.collections.ArraysKt.plus(e, bArr));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(com.discover.mpos.sdk.data.TearingRecoveryStorage tearingRecoveryStorage) {
            super(0);
            this.b = tearingRecoveryStorage;
        }
    }
}
