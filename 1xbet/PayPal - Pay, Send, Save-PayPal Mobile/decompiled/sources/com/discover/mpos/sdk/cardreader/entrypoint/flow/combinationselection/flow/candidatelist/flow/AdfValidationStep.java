package com.discover.mpos.sdk.cardreader.entrypoint.flow.combinationselection.flow.candidatelist.flow;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0002J\u001e\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/entrypoint/flow/combinationselection/flow/candidatelist/flow/AdfValidationStep;", "Lcom/discover/mpos/sdk/flow/ExecutionStep;", "Lcom/discover/mpos/sdk/cardreader/entrypoint/flow/combinationselection/flow/candidatelist/data/BuildCandidateListData;", "()V", "ridSize", "", "debugTag", "", "execute", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, "Lcom/discover/mpos/sdk/flow/ExecutionFlow;", "input", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.entrypoint.a.a.b.a.b.b, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class AdfValidationStep implements com.discover.mpos.sdk.flow.ExecutionStep<com.discover.mpos.sdk.cardreader.entrypoint.flow.combinationselection.flow.candidatelist.data.BuildCandidateListData> {

    /* renamed from: a, reason: collision with root package name */
    private final int f2989a = 5;

    @Override // com.discover.mpos.sdk.flow.ExecutionStep
    public final /* synthetic */ void a(com.discover.mpos.sdk.flow.ExecutionFlow<? super com.discover.mpos.sdk.cardreader.entrypoint.flow.combinationselection.flow.candidatelist.data.BuildCandidateListData> executionFlow, com.discover.mpos.sdk.cardreader.entrypoint.flow.combinationselection.flow.candidatelist.data.BuildCandidateListData buildCandidateListData) {
        com.discover.mpos.sdk.cardreader.entrypoint.flow.combinationselection.flow.candidatelist.data.BuildCandidateListData buildCandidateListData2 = buildCandidateListData;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionFlow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buildCandidateListData2, "");
        java.lang.String b = buildCandidateListData2.b();
        new java.lang.Object[]{b};
        if (b.length() < this.f2989a) {
            new java.lang.Object[]{b, buildCandidateListData2.c.getApplicationIdentifier()};
            executionFlow.a();
        } else {
            executionFlow.b(buildCandidateListData2);
        }
    }
}
