package com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.flow;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0016\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0016\u0010\u0013\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0002¨\u0006\u0014"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/readdatastorage/flow/ReadContainerDataStep;", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/readdatastorage/flow/ReadDataStorageFlowStep;", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/readdatastorage/model/ReadDataStorageData;", "()V", "createReferenceControlParameter", "", "sfi", "debugTag", "", "execute", "", "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "executeReadRecord", "Lcom/discover/mpos/sdk/card/apdu/readrecord/ReadRecordResponse;", "recordNumber", "referenceControlParameter", "card", "Lcom/discover/mpos/sdk/card/Card;", "selectSupportedContainerId", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.b.c, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class ReadContainerDataStep implements com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.flow.ReadDataStorageFlowStep<com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.ReadDataStorageData> {

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "invoke", "(Lkotlin/Unit;)V"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.b.c$b */
    static final class b extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<kotlin.Unit, kotlin.Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.discover.mpos.sdk.transaction.execution.TransactionEx f3186a;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ kotlin.Unit invoke(kotlin.Unit unit) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "");
            this.f3186a.t();
            return kotlin.Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx) {
            super(1);
            this.f3186a = transactionEx;
        }
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.b.c$c */
    static final class c extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> {
        final /* synthetic */ com.discover.mpos.sdk.transaction.execution.TransactionEx b;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
            com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx = this.b;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
            com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.flow.ReadDataStorageFlowStep.a.a(transactionEx);
            return kotlin.Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx) {
            super(1);
            this.b = transactionEx;
        }
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
        java.util.List<com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.DataStorageDirectoryEntry> b2 = transactionEx.j().c().b();
        new java.lang.Object[]{java.lang.Integer.valueOf(b2.size())};
        new java.lang.Object[]{transactionEx.q().f3198a};
        if (b2.isEmpty()) {
            transactionEx.t();
            return;
        }
        com.discover.mpos.sdk.cardreader.kernel.flow.optionalfeature.data.CardFeatureDescriptor s = transactionEx.j().s();
        kotlin.jvm.internal.Intrinsics.checkNotNull(s);
        transactionEx.a(new com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.flow.ReadContainerDataStep.a(transactionEx, s.b), new com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.flow.ReadContainerDataStep.b(transactionEx), new com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.flow.ReadContainerDataStep.c(transactionEx));
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.b.c$a */
    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlin.Unit> {
        final /* synthetic */ com.discover.mpos.sdk.transaction.execution.TransactionEx b;
        final /* synthetic */ int c;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ kotlin.Unit invoke() {
            boolean z;
            for (com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.DataStorageDirectoryEntry dataStorageDirectoryEntry : this.b.j().c().b()) {
                com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.SupportedContainerIds supportedContainerIds = ((com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.ReadDataStorageData) this.b.q()).f3198a;
                byte[] a2 = dataStorageDirectoryEntry.a();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a2, "");
                java.util.List<com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.SupportedContainerIds.a> list = supportedContainerIds.f3199a;
                if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                    for (com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.SupportedContainerIds.a aVar : list) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a2, "");
                        if (java.util.Arrays.equals(a2, aVar.f3200a)) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                new java.lang.Object[]{dataStorageDirectoryEntry.a(), java.lang.Boolean.valueOf(z)};
                if (z) {
                    com.discover.mpos.sdk.card.apdu.readrecord.ReadRecordResponse b = this.b.i().b(com.discover.mpos.sdk.core.extensions.HexExtensionsKt.toUnsignedInt(dataStorageDirectoryEntry.b()), (this.c << 3) + 4);
                    if (b.isSuccessful()) {
                        this.b.j().a(new com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.storage.ContainerContent(dataStorageDirectoryEntry.a(), b.getContent().getE()));
                    } else {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to retrieve Data container ContainerId:");
                        sb.append(com.discover.mpos.sdk.core.extensions.ByteArrayExtensionsKt.toHexString(dataStorageDirectoryEntry.a()));
                        sb.append(" SFI: ");
                        sb.append(this.c);
                        throw new com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.exception.ReadDataContainerException(sb.toString());
                    }
                }
            }
            return kotlin.Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx, int i) {
            super(0);
            this.b = transactionEx;
            this.c = i;
        }
    }
}
