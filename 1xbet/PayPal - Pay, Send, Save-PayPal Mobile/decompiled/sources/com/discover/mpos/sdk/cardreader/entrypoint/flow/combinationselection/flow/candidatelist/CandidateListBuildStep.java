package com.discover.mpos.sdk.cardreader.entrypoint.flow.combinationselection.flow.candidatelist;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J,\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005H\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0016\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0016J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\u0006\u0010\u0014\u001a\u00020\u0002H\u0002J\u001e\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0002¨\u0006\u0018"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/entrypoint/flow/combinationselection/flow/candidatelist/CandidateListBuildStep;", "Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionStep;", "Lcom/discover/mpos/sdk/cardreader/entrypoint/flow/combinationselection/data/CombinationSelectionData;", "()V", "buildCandidateList", "", "Lcom/discover/mpos/sdk/cardreader/entrypoint/model/Candidate;", "directoryEntries", "Lcom/discover/mpos/sdk/card/apdu/emv/DirectoryEntry;", "readerCombinations", "Lcom/discover/mpos/sdk/cardreader/config/CombinationConfiguration;", "debugTag", "", "selectPpseResponse", "Lcom/discover/mpos/sdk/card/apdu/select/ppse/SelectPPSEResponse;", "execute", "", "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "extractReaderCombinationConfigurations", "input", "handleCandidateListResponse", "candidateList", "Lcom/discover/mpos/sdk/cardreader/entrypoint/model/CandidateList;", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.entrypoint.a.a.b.a.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class CandidateListBuildStep implements com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep<com.discover.mpos.sdk.cardreader.entrypoint.flow.combinationselection.data.CombinationSelectionData> {
    @Override // com.discover.mpos.sdk.flow.ExecutionStep
    public final /* synthetic */ void a(com.discover.mpos.sdk.flow.ExecutionFlow executionFlow, java.lang.Object obj) {
        com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx = (com.discover.mpos.sdk.transaction.execution.TransactionEx) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionFlow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep.a.a(this, executionFlow, transactionEx);
    }

    @Override // com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep
    public final void a(com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.cardreader.entrypoint.flow.combinationselection.data.CombinationSelectionData> transactionEx) {
        java.util.List emptyList;
        com.discover.mpos.sdk.card.apdu.emv.ProprietaryTemplateDataPpse proprietaryTemplateDataPpse;
        com.discover.mpos.sdk.card.apdu.emv.FciIssuerDataPpse fciIssuerDataPpse;
        java.util.List<com.discover.mpos.sdk.card.apdu.emv.DirectoryEntry> list;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        com.discover.mpos.sdk.cardreader.entrypoint.flow.combinationselection.data.CombinationSelectionData q = transactionEx.q();
        if (q.a().b == null) {
            com.discover.mpos.sdk.card.apdu.emv.FciTemplate<com.discover.mpos.sdk.card.apdu.emv.ProprietaryTemplateDataPpse> fciTemplate = q.a().getContent().f2971a;
            if (fciTemplate == null || (proprietaryTemplateDataPpse = fciTemplate.b) == null || (fciIssuerDataPpse = proprietaryTemplateDataPpse.f2937a) == null || (list = fciIssuerDataPpse.f2934a) == null || (emptyList = kotlin.collections.CollectionsKt.sortedWith(list, new com.discover.mpos.sdk.cardreader.entrypoint.flow.combinationselection.flow.candidatelist.CandidateListBuildStep.a())) == null) {
                emptyList = kotlin.collections.CollectionsKt.emptyList();
            }
            if (!emptyList.isEmpty()) {
                java.util.List<kotlin.Pair<com.discover.mpos.sdk.cardreader.config.CombinationConfiguration, com.discover.mpos.sdk.transaction.processing.PreProcessingIndicators>> list2 = q.b;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : list2) {
                    if (!((com.discover.mpos.sdk.transaction.processing.PreProcessingIndicators) ((kotlin.Pair) obj).getSecond()).getContactlessApplicationNotAllowedFlag()) {
                        arrayList.add(obj);
                    }
                }
                java.util.ArrayList arrayList2 = arrayList;
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add((com.discover.mpos.sdk.cardreader.config.CombinationConfiguration) ((kotlin.Pair) it.next()).getFirst());
                }
                com.discover.mpos.sdk.cardreader.entrypoint.model.CandidateList candidateList = new com.discover.mpos.sdk.cardreader.entrypoint.model.CandidateList(a((java.util.List<com.discover.mpos.sdk.card.apdu.emv.DirectoryEntry>) emptyList, arrayList3));
                if (candidateList.f3008a.isEmpty()) {
                    com.discover.mpos.sdk.transaction.execution.TransactionFlowHandler.a.a(transactionEx, com.discover.mpos.sdk.transaction.execution.TransactionEndStatus.c, null, false, 6);
                    return;
                }
                com.discover.mpos.sdk.transaction.processing.ProcessingData j = transactionEx.j();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(candidateList, "");
                j.h = candidateList;
                new java.lang.Object[]{candidateList};
                transactionEx.t();
                return;
            }
        }
        com.discover.mpos.sdk.transaction.execution.TransactionFlowHandler.a.a(transactionEx, com.discover.mpos.sdk.transaction.execution.TransactionEndStatus.c, null, false, 6);
    }

    private static java.util.List<com.discover.mpos.sdk.cardreader.entrypoint.model.Candidate> a(java.util.List<com.discover.mpos.sdk.card.apdu.emv.DirectoryEntry> list, java.util.List<com.discover.mpos.sdk.cardreader.config.CombinationConfiguration> list2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.discover.mpos.sdk.cardreader.config.CombinationConfiguration combinationConfiguration : list2) {
            if (list != null) {
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    new com.discover.mpos.sdk.flow.LinearExecutionFlow().a((com.discover.mpos.sdk.flow.ExecutionStep) new com.discover.mpos.sdk.cardreader.entrypoint.flow.combinationselection.flow.candidatelist.flow.AdfValidationStep()).a(new com.discover.mpos.sdk.cardreader.entrypoint.flow.combinationselection.flow.candidatelist.flow.AidAdfMatchingStep()).a(new com.discover.mpos.sdk.cardreader.entrypoint.flow.combinationselection.flow.candidatelist.flow.RequestedKernelIdComputationStep()).a(new com.discover.mpos.sdk.cardreader.entrypoint.flow.combinationselection.flow.candidatelist.flow.RequestedKernelIdValidationStep()).a(new com.discover.mpos.sdk.cardreader.entrypoint.flow.combinationselection.flow.candidatelist.flow.AddCandidateStep()).c().a(new com.discover.mpos.sdk.cardreader.entrypoint.flow.combinationselection.flow.candidatelist.data.BuildCandidateListData(arrayList, combinationConfiguration, (com.discover.mpos.sdk.card.apdu.emv.DirectoryEntry) it.next()));
                }
            }
        }
        return arrayList;
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", util.h.xy.cb.b.f1091, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.cardreader.entrypoint.a.a.b.a.a$a */
    public static final class a<T> implements java.util.Comparator<T> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            byte[] content = ((com.discover.mpos.sdk.card.apdu.emv.DirectoryEntry) t).b.b.getContent();
            byte b = com.google.common.base.Ascii.SI;
            java.lang.Byte valueOf = java.lang.Byte.valueOf(content != null ? content[0] : (byte) 15);
            byte[] content2 = ((com.discover.mpos.sdk.card.apdu.emv.DirectoryEntry) t2).b.b.getContent();
            if (content2 != null) {
                b = content2[0];
            }
            return kotlin.comparisons.ComparisonsKt.compareValues(valueOf, java.lang.Byte.valueOf(b));
        }
    }
}
