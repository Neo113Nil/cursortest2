package com.discover.mpos.sdk.cardreader.kernel.flow.readrecord.flow;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016J&\u0010\n\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002¨\u0006\u000f"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/readrecord/flow/ReadRecordCommandStep;", "Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionStep;", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/readrecord/model/ReadRecordData;", "()V", "debugTag", "", "execute", "", "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "runCommand", "Lcom/discover/mpos/sdk/card/apdu/readrecord/ReadRecordResponse;", "recordNumber", "", "referenceControlParameter", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.k.b.d, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class ReadRecordCommandStep implements com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep<com.discover.mpos.sdk.cardreader.kernel.flow.readrecord.model.ReadRecordData> {

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "invoke", "(Lkotlin/Unit;)V"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.k.b.d$b */
    static final class b extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<kotlin.Unit, kotlin.Unit> {
        final /* synthetic */ com.discover.mpos.sdk.transaction.execution.TransactionEx b;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ kotlin.Unit invoke(kotlin.Unit unit) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "");
            this.b.e();
            this.b.p();
            this.b.k().a(this.b, new com.discover.mpos.sdk.transaction.outcome.UiRequest(com.discover.mpos.sdk.transaction.outcome.UiRequest.MessageIdentifier.CARD_READ_OK_REMOVE_CARD, com.discover.mpos.sdk.transaction.outcome.UiRequest.Status.CARD_READ_SUCCESSFULLY, null, null, null, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null));
            this.b.t();
            return kotlin.Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx) {
            super(1);
            this.b = transactionEx;
        }
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.k.b.d$c */
    static final class c extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.discover.mpos.sdk.transaction.execution.TransactionEx f3170a;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
            java.lang.Throwable th2 = th;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th2, "");
            this.f3170a.e();
            if (th2 instanceof com.discover.mpos.sdk.cardreader.kernel.flow.readrecord.exception.ReadRecordException) {
                com.discover.mpos.sdk.transaction.execution.TransactionFlowHandler.a.a(this.f3170a, 0, null, false, 7);
            } else {
                this.f3170a.y();
            }
            return kotlin.Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx) {
            super(1);
            this.f3170a = transactionEx;
        }
    }

    @Override // com.discover.mpos.sdk.flow.ExecutionStep
    public final /* synthetic */ void a(com.discover.mpos.sdk.flow.ExecutionFlow executionFlow, java.lang.Object obj) {
        com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx = (com.discover.mpos.sdk.transaction.execution.TransactionEx) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionFlow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep.a.a(this, executionFlow, transactionEx);
    }

    @Override // com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep
    public final void a(com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.cardreader.kernel.flow.readrecord.model.ReadRecordData> transactionEx) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        transactionEx.a(new com.discover.mpos.sdk.cardreader.kernel.flow.readrecord.flow.ReadRecordCommandStep.a(transactionEx), new com.discover.mpos.sdk.cardreader.kernel.flow.readrecord.flow.ReadRecordCommandStep.b(transactionEx), new com.discover.mpos.sdk.cardreader.kernel.flow.readrecord.flow.ReadRecordCommandStep.c(transactionEx));
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.k.b.d$a */
    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlin.Unit> {
        final /* synthetic */ com.discover.mpos.sdk.transaction.execution.TransactionEx b;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ kotlin.Unit invoke() {
            for (com.discover.mpos.sdk.cardreader.kernel.flow.readrecord.model.ReadRecordParameter readRecordParameter : ((com.discover.mpos.sdk.cardreader.kernel.flow.readrecord.model.ReadRecordData) this.b.q()).b) {
                com.discover.mpos.sdk.cardreader.kernel.flow.readrecord.model.ApplicationFileLocator applicationFileLocator = new com.discover.mpos.sdk.cardreader.kernel.flow.readrecord.model.ApplicationFileLocator(readRecordParameter);
                int i = readRecordParameter.b;
                int i2 = readRecordParameter.c;
                if (i <= i2) {
                    while (true) {
                        com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx = this.b;
                        int i3 = readRecordParameter.f3173a;
                        com.discover.mpos.sdk.card.apdu.readrecord.ReadRecordResponse a2 = transactionEx.i().a(i, i3);
                        new java.lang.Object[]{java.lang.Boolean.valueOf(a2.isSuccessful()), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i3), a2};
                        if (a2.isExecutionFailed()) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("IO execution failed of the ReadRecord Command for Record:");
                            sb.append(i);
                            sb.append(" and RFC:");
                            sb.append(readRecordParameter.f3173a);
                            throw new com.discover.mpos.sdk.exceptions.ApduIOException(sb.toString());
                        }
                        if (!a2.isSuccessful()) {
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Failed to execute ReadRecord Command for Record:");
                            sb2.append(i);
                            sb2.append(" and RFC:");
                            sb2.append(readRecordParameter.f3173a);
                            throw new com.discover.mpos.sdk.cardreader.kernel.flow.readrecord.exception.ReadRecordException(sb2.toString());
                        }
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a2, "");
                        applicationFileLocator.f3171a.add(a2);
                        if (i != i2) {
                            i++;
                        }
                    }
                }
                this.b.j().l.add(applicationFileLocator);
            }
            return kotlin.Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx) {
            super(0);
            this.b = transactionEx;
        }
    }
}
