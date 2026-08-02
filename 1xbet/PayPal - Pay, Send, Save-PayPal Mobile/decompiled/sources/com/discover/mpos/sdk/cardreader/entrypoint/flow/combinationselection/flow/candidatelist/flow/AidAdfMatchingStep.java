package com.discover.mpos.sdk.cardreader.entrypoint.flow.combinationselection.flow.candidatelist.flow;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\u001e\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005H\u0002J\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0002¨\u0006\u0012"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/entrypoint/flow/combinationselection/flow/candidatelist/flow/AidAdfMatchingStep;", "Lcom/discover/mpos/sdk/flow/ExecutionStep;", "Lcom/discover/mpos/sdk/cardreader/entrypoint/flow/combinationselection/flow/candidatelist/data/BuildCandidateListData;", "()V", "debugTag", "", "execute", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, "Lcom/discover/mpos/sdk/flow/ExecutionFlow;", "input", "isFullMatch", "", "hexAdf", "terminalAid", "isPartialMatchAndSupported", "isAidPartOfAdf", "isExtendedCombinationNotSupported", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.entrypoint.a.a.b.a.b.c, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class AidAdfMatchingStep implements com.discover.mpos.sdk.flow.ExecutionStep<com.discover.mpos.sdk.cardreader.entrypoint.flow.combinationselection.flow.candidatelist.data.BuildCandidateListData> {
    @Override // com.discover.mpos.sdk.flow.ExecutionStep
    public final /* synthetic */ void a(com.discover.mpos.sdk.flow.ExecutionFlow<? super com.discover.mpos.sdk.cardreader.entrypoint.flow.combinationselection.flow.candidatelist.data.BuildCandidateListData> executionFlow, com.discover.mpos.sdk.cardreader.entrypoint.flow.combinationselection.flow.candidatelist.data.BuildCandidateListData buildCandidateListData) {
        com.discover.mpos.sdk.cardreader.entrypoint.flow.combinationselection.flow.candidatelist.data.BuildCandidateListData buildCandidateListData2 = buildCandidateListData;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionFlow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buildCandidateListData2, "");
        java.lang.String b = buildCandidateListData2.b();
        java.lang.String applicationIdentifier = buildCandidateListData2.c.getApplicationIdentifier();
        boolean areEqual = kotlin.jvm.internal.Intrinsics.areEqual(b, applicationIdentifier);
        boolean startsWith$default = kotlin.text.StringsKt.startsWith$default(b, applicationIdentifier, false, 2, (java.lang.Object) null);
        if (!areEqual) {
            boolean c = buildCandidateListData2.c();
            if (!startsWith$default || !c) {
                new java.lang.Object[]{b, applicationIdentifier};
                executionFlow.a();
                return;
            }
        }
        new java.lang.Object[]{b, applicationIdentifier};
        executionFlow.b(buildCandidateListData2);
    }
}
