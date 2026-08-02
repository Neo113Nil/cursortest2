package com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.flow;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0016\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/readdatastorage/flow/GetDataCommandStep;", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/readdatastorage/flow/ReadDataStorageFlowStep;", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/readdatastorage/model/ReadDataStorageData;", "lengthValidator", "Lcom/discover/mpos/sdk/core/emv/Validator;", "", "(Lcom/discover/mpos/sdk/core/emv/Validator;)V", "debugTag", "", "execute", "", "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "getDataStorageContent", "it", "Lcom/discover/mpos/sdk/card/apdu/getdata/GetDataResponse;", "isContentValid", "", "dataStorageContent", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.b.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class GetDataCommandStep implements com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.flow.ReadDataStorageFlowStep<com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.ReadDataStorageData> {

    /* renamed from: a, reason: collision with root package name */
    final com.discover.mpos.sdk.core.emv.Validator<byte[]> f3179a;

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/discover/mpos/sdk/card/apdu/getdata/GetDataResponse;", "invoke"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.b.a$b */
    static final class b extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<com.discover.mpos.sdk.card.apdu.getdata.GetDataResponse, kotlin.Unit> {
        final /* synthetic */ com.discover.mpos.sdk.transaction.execution.TransactionEx b;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ kotlin.Unit invoke(com.discover.mpos.sdk.card.apdu.getdata.GetDataResponse getDataResponse) {
            java.lang.Object obj;
            com.discover.mpos.sdk.card.apdu.getdata.GetDataResponse getDataResponse2 = getDataResponse;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getDataResponse2, "");
            if (!getDataResponse2.isSuccessful()) {
                com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.flow.GetDataCommandStep.b(this.b);
            } else {
                java.util.Iterator it = com.discover.mpos.sdk.core.extensions.tlv.ByteArrayExtensionsKt.split$default(getDataResponse2.getContent().f2944a, false, false, 3, null).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(com.discover.mpos.sdk.core.emv.tlv.Tag.DATA_STORAGE_DIRECTORY.getTag(), ((com.discover.mpos.sdk.core.emv.tlv.Tlv) obj).getTag())) {
                        break;
                    }
                }
                com.discover.mpos.sdk.core.emv.tlv.Tlv tlv = (com.discover.mpos.sdk.core.emv.tlv.Tlv) obj;
                byte[] content = tlv != null ? tlv.getContent() : null;
                com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.flow.GetDataCommandStep getDataCommandStep = com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.flow.GetDataCommandStep.this;
                if (content != null && getDataCommandStep.f3179a.isValid(content)) {
                    com.discover.mpos.sdk.transaction.processing.ProcessingData j = this.b.j();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(content);
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
                    byte[] a2 = j.F.a(content);
                    new java.lang.Object[]{a2};
                    j.n = new com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.DataStorageDirectory(content, a2, j.b);
                    this.b.t();
                } else {
                    com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.flow.GetDataCommandStep.b(this.b);
                }
            }
            return kotlin.Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx) {
            super(1);
            this.b = transactionEx;
        }
    }

    public GetDataCommandStep(com.discover.mpos.sdk.core.emv.Validator<byte[]> validator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validator, "");
        this.f3179a = validator;
    }

    public static void b(com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.ReadDataStorageData> transactionEx) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.flow.ReadDataStorageFlowStep.a.a(transactionEx);
    }

    @Override // com.discover.mpos.sdk.flow.ExecutionStep
    public final /* synthetic */ void a(com.discover.mpos.sdk.flow.ExecutionFlow executionFlow, java.lang.Object obj) {
        com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx = (com.discover.mpos.sdk.transaction.execution.TransactionEx) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionFlow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.flow.ReadDataStorageFlowStep.a.a(this, executionFlow, transactionEx);
    }

    @Override // com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep
    public final void a(com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.ReadDataStorageData> transactionEx) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        com.discover.mpos.sdk.transaction.execution.TransactionEx.a(transactionEx, new com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.flow.GetDataCommandStep.a(transactionEx), new com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.flow.GetDataCommandStep.b(transactionEx), 4);
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/discover/mpos/sdk/card/apdu/getdata/GetDataResponse;", "invoke"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.b.a$a */
    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.discover.mpos.sdk.card.apdu.getdata.GetDataResponse> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.discover.mpos.sdk.transaction.execution.TransactionEx f3180a;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ com.discover.mpos.sdk.card.apdu.getdata.GetDataResponse invoke() {
            return this.f3180a.i().c();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx) {
            super(0);
            this.f3180a = transactionEx;
        }
    }
}
