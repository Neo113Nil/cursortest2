package com.discover.mpos.sdk.cardreader.entrypoint.flow.combinationselection.flow.candidatelist.flow;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/entrypoint/flow/combinationselection/flow/candidatelist/flow/AddCandidateStep;", "Lcom/discover/mpos/sdk/flow/ExecutionStep;", "Lcom/discover/mpos/sdk/cardreader/entrypoint/flow/combinationselection/flow/candidatelist/data/BuildCandidateListData;", "()V", "execute", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, "Lcom/discover/mpos/sdk/flow/ExecutionFlow;", "input", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.entrypoint.a.a.b.a.b.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class AddCandidateStep implements com.discover.mpos.sdk.flow.ExecutionStep<com.discover.mpos.sdk.cardreader.entrypoint.flow.combinationselection.flow.candidatelist.data.BuildCandidateListData> {
    @Override // com.discover.mpos.sdk.flow.ExecutionStep
    public final /* synthetic */ void a(com.discover.mpos.sdk.flow.ExecutionFlow<? super com.discover.mpos.sdk.cardreader.entrypoint.flow.combinationselection.flow.candidatelist.data.BuildCandidateListData> executionFlow, com.discover.mpos.sdk.cardreader.entrypoint.flow.combinationselection.flow.candidatelist.data.BuildCandidateListData buildCandidateListData) {
        com.discover.mpos.sdk.cardreader.entrypoint.flow.combinationselection.flow.candidatelist.data.BuildCandidateListData buildCandidateListData2 = buildCandidateListData;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionFlow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buildCandidateListData2, "");
        java.lang.String b = buildCandidateListData2.b();
        java.lang.String applicationIdentifier = buildCandidateListData2.c.getApplicationIdentifier();
        java.lang.String a2 = buildCandidateListData2.a();
        com.discover.mpos.sdk.core.emv.tlv.Tlv tlv = buildCandidateListData2.d.b.b;
        byte[] content = buildCandidateListData2.d.d.getContent();
        boolean z = (content == null || content.length == 0 || !buildCandidateListData2.c()) ? false : true;
        com.discover.mpos.sdk.core.emv.tlv.Tlv tlv2 = buildCandidateListData2.d.d;
        boolean deferredAuthorizationSupported = buildCandidateListData2.c.getDeferredAuthorizationSupported();
        boolean dataStorageSupported = buildCandidateListData2.c.getDataStorageSupported();
        boolean extendedLoggingSupported = buildCandidateListData2.c.getExtendedLoggingSupported();
        boolean tearingRecoverySupported = buildCandidateListData2.c.getTearingRecoverySupported();
        java.util.List<byte[]> dataContainerReadList = buildCandidateListData2.c.getDataContainerReadList();
        if (dataContainerReadList == null) {
            dataContainerReadList = kotlin.collections.CollectionsKt.emptyList();
        }
        com.discover.mpos.sdk.cardreader.entrypoint.model.Candidate candidate = new com.discover.mpos.sdk.cardreader.entrypoint.model.Candidate(b, applicationIdentifier, a2, tlv, java.lang.Boolean.valueOf(z), tlv2, deferredAuthorizationSupported, dataStorageSupported, extendedLoggingSupported, tearingRecoverySupported, dataContainerReadList);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(candidate, "");
        buildCandidateListData2.b.add(candidate);
        new java.lang.Object[]{candidate};
        executionFlow.a();
    }
}
